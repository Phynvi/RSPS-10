package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Handles any commands sent to the client.
 * @author Graham
 *
 */
public class DunnoPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 155:
			/*
			 * 
			 */
			dunno1(player, session, packet);
			break;
		case 201:
			/*
			 * 
			 */
			dunno2(player, session, packet);
			break;
		case 185:
			/*
			 * 
			 */
			dunno3(player, session, packet);
			break;
		}
	}
	private void dunno1(final Player player, IoSession session, Packet packet) {
		try {
packet.readInt();
		} catch(Exception e) {
		}
}
	private void dunno2(final Player player, IoSession session, Packet packet) {
		try {

packet.readByteC();
packet.readShortA();
		} catch(Exception e) {
		}
}
	private void dunno3(final Player player, IoSession session, Packet packet) {
		try {
packet.readInt1();
packet.readShortA();
		} catch(Exception e) {
		}
}

}
