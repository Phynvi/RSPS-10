package com.rs2hd.net.codec;

//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.Queue;

import com.rs2hd.Constants;
import com.rs2hd.WorkerThread;
import com.rs2hd.model.PlayerDetails;
import com.rs2hd.net.Packet;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.util.Misc;
import com.rs2hd.util.WorldList;
import com.rs2hd.util.log.Logger;

import org.apache.mina.common.*;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

/**
 * Login protocol decoder.
 *
 * @author Graham
 */
public class RS2LoginProtocolDecoder extends CumulativeProtocolDecoder {
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();

	private WorkerThread workerThread;

	public RS2LoginProtocolDecoder(WorkerThread workerThread) {
		this.workerThread = workerThread;
	}

	//	public static Cache CACHE;
	//	static {
	//		try {
	//			CACHE = new Cache("data/cache/");
	//		} catch (FileNotFoundException e) {
	//			CACHE = null;
	//		}
	//	}

	//	private Queue<int[]> requests = new LinkedList<int[]>();

	/**
	 * Parses the data in the provided byte buffer and writes it to
	 * <code>out</code> as a <code>Packet</code>.
	 *
	 * @param session The IoSession the data was read from
	 * @param in      The buffer
	 * @param out     The decoder output stream to which to write the <code>Packet</code>
	 * @return Whether enough data was available to create a packet
	 */
	@Override
	public boolean doDecode(IoSession session, ByteBuffer in, ProtocolDecoderOutput out) {
		try {
			Object loginStageObj = session.getAttribute("LOGIN_STAGE");
			int loginStage = 0;
			if (loginStageObj != null) {
				loginStage = (Integer) loginStageObj;
			}
			//Logger.log("recv login packet, stage: "+loginStage);
			switch (loginStage) {
			case -3:
				if (3 <= in.remaining()) {
					int loginOpcode = in.getShort();
					if (loginOpcode == 0) {
						ByteBuffer bb = WorldList.getData(true, true);
						byte[] ba = new byte[bb.limit()];
						bb.get(ba);
						Packet p = new Packet(session, 0, ba, true);
						session.write(p);
						session.close();
					} else {
						ByteBuffer bb = WorldList.getData(false, true);
						byte[] ba = new byte[bb.limit()];
						bb.get(ba);
						Packet p = new Packet(session, 0, ba, true);
						session.write(p);
						session.close();
					}
					return true;
				}
				in.rewind();
				return false;
			case -2:
				if (8 <= in.remaining()) {
					for (int i = 0; i < 8; i++) {
						in.get();
					}
					StaticPacketBuilder ukeys = new StaticPacketBuilder();
					ukeys.setBare(true);
					for (int key : Constants.UPDATE_KEYS) {
						ukeys.addByte((byte) key);
					}
					session.write(ukeys.toPacket()).addListener(new IoFutureListener() {
						@Override
						public void operationComplete(IoFuture arg0) {
							arg0.getSession().close();
						}
					});
					return true;
				}
				in.rewind();
				return false;
			case -1:
				if (3 <= in.remaining()) {
					in.get();
					int clientVersion = in.getShort();
					if (clientVersion == 562) {
						StaticPacketBuilder u1Response = new StaticPacketBuilder();
						u1Response.setBare(true).addByte((byte) 0);
						session.write(u1Response.toPacket());
						session.setAttribute("LOGIN_STAGE", -2);
					} else {
						StaticPacketBuilder u1Response = new StaticPacketBuilder();
						u1Response.setBare(true).addByte((byte) 6);
						session.write(u1Response.toPacket()).addListener(new IoFutureListener() {
							@Override
							public void operationComplete(IoFuture arg0) {
								arg0.getSession().close();
							}
						});
						session.removeAttribute("LOGIN_STAGE");
					}
					return true;
				}
				in.rewind();
				return false;
			case 0: //first login packets
				if (2 <= in.remaining()) {
					int protocolId = in.get() & 0xff;
					int nameHash = in.get() & 0xff;
					if (protocolId == 23) {
						session.setAttribute("LOGIN_STAGE", -3);
					} else if (protocolId == 15) {
						session.setAttribute("LOGIN_STAGE", -1);
					} else {
						long serverSessionKey = ((long) (java.lang.Math.random() * 99999999D) << 32) + (long) (java.lang.Math.random() * 99999999D);
						StaticPacketBuilder s1Response = new StaticPacketBuilder();
						s1Response.setBare(true).addByte((byte) 0).addLong(serverSessionKey);
						session.setAttribute("SERVER_SESSION_KEY", serverSessionKey);
						session.write(s1Response.toPacket());
						session.setAttribute("LOGIN_STAGE", 1);
						session.setAttribute("NAME_HASH", nameHash);
						//Logger.log("protocolId="+protocolId+"; namePart="+namePart);
					}
					return true;
				} else {
					in.rewind();
					return false;
				}
			case 1: //here's where we get the username and password
				boolean hd = false;
				@SuppressWarnings("unused")
				int loginType = -1, loginPacketSize = -1;
				if (3 <= in.remaining()) {
					loginType = in.get() & 0xff; //should be 16 or 18
					loginPacketSize = in.getUnsignedShort();
					//Logger.log("loginType="+loginType);
				} else {
					in.rewind();
					return false;
				}
				if (loginPacketSize <= in.remaining()) {
					byte[] payload = new byte[loginPacketSize];
					in.get(payload);
					Packet p = new Packet(session, -1, payload);
					@SuppressWarnings("unused")
					int loginEncryptPacketSize = loginPacketSize - (36 + 1 + 1 + 2); // can't be negative
					int clientVersion = p.readInt();
					if (clientVersion != 562) {
						Logger.getInstance().error("Invalid ver : " + clientVersion);
						session.close();
						return true;
					}
					p.skip(30);
					p.readRS2String();// settings string?
					p.skip(127);
					long clientSessionKey = p.readLong();
					long serverSessionKey = p.readLong();
					long l = p.readLong();
					int hash = (int) (31 & l >> 16);
					if (hash != (Integer) session.getAttribute("NAME_HASH")) {
						// invalid name hash (possibly a bot attacking)
						session.close();
						return true;
					}
					String user = Misc.longToPlayerName(l), //given username
					pass = p.readRS2String(); //given password
					int sessionKey[] = new int[4];
					sessionKey[0] = (int) (clientSessionKey >> 32);
					sessionKey[1] = (int) clientSessionKey;
					sessionKey[2] = (int) (serverSessionKey >> 32);
					sessionKey[3] = (int) serverSessionKey;

					// set in ISAAC
					for (int i = 0; i < 4; i++) sessionKey[i] += 50;
					// set out ISAAC

					session.removeAttribute("LOGIN_STAGE");
					session.removeAttribute("NAME_HASH");

					/**
					 * Here's where we add the user to the login queue, and if the login is
					 * accepted, we change their session filter to a standard RS2ProtocolCodec.
					 */
					PlayerDetails d = new PlayerDetails(user, pass, session, hd);
					workerThread.loadPlayer(d);

					session.setIdleTime(IdleStatus.BOTH_IDLE, Constants.SESSION_IDLE_TIME);

					session.getFilterChain().remove("protocolFilter");
					session.getFilterChain().addLast("protocolFilter", new ProtocolCodecFilter(new CodecFactory()));

					return true;
				} else {
					in.rewind();
					return false;
				}
			}
		} catch (Exception e) {
			//logger.stackTrace(e);
		}
		return false;
	}


	//	private ByteBuffer getFile(int requestCache, int requestId) throws IOException {
	//		ByteBuffer buffer = ByteBuffer.allocate(520);
	//		buffer.put((byte) requestCache);
	//		buffer.putShort((short) requestId);
	//		byte[] cache = CACHE.read(CACHE.index(requestCache, requestId));
	//		int len = (((cache[1] & 0xff) << 24)+((cache[2] & 0xff) << 16)+((cache[3] & 0xff) << 8)+(cache[4] & 0xff)) + 9;
	//		if(cache[0] == 0) {
	//			len -= 4;
	//		}
	//		int c = 3;
	//		for(int i = 0; i < len; i++) {
	//			if(c == 512) {
	//				buffer.put((byte) 0xFF);
	//				c = 1;
	//			}
	//			buffer.put(cache[i]);
	//		}
	//		return buffer.flip();
	//	}


	/**
	 * Releases the buffer used by the given session.
	 *
	 * @param session The session for which to release the buffer
	 * @throws Exception if failed to dispose all resources
	 */
	@Override
	public void dispose(IoSession session) throws Exception {
		super.dispose(session);
	}

}
