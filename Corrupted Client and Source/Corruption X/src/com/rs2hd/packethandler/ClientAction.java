package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Packets relating to client operation.
 * @author Luke132
 */
public class ClientAction implements PacketHandler {

	private static final int CLICK_MOUSE = 87;
	
	@Override
	public void handlePacket(Player p, IoSession session, Packet packet) {
		switch(packet.getId()) {
			case CLICK_MOUSE:
				break;
			case 170:
				int displayMode = packet.readByte();
				@SuppressWarnings("unused") int width = packet.readShort();
				@SuppressWarnings("unused") int height = packet.readShort();
				@SuppressWarnings("unused") int isMember = packet.readByte();
				p.setDisplayMode(displayMode);
				if (p.isOnLogin()) {
					p.getInterfaceswitches().analyzeLogin();
					p.setOnLogin(false);
					//System.out.println("DONE");
				} else {
					p.getInterfaceswitches().switchDisplayerModes();
					//System.out.println("DONE2");
				}
				break;
		}
	}

}
