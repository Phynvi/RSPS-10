package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.NPC;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

/**
 * 
 * NPC clicking packets.
 * @author Dragonkk
 */
@SuppressWarnings("unused")
public class MagicOnNpc implements PacketHandler {
	
	@Override
	public void handlePacket(final Player p, IoSession session, Packet packet) {
				final int i = packet.readByteC();
				final int ii = packet.readLEShort();
				final int iii = packet.readInt2();
				final int iiii = packet.readShortA();
				final int iiiii = packet.readShortA();
				System.out.println(i+" "+ii+" "+iii+" "+iiii+" "+iiiii);
	}
}

