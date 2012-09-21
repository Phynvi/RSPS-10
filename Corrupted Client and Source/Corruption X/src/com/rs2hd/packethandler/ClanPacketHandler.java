package com.rs2hd.packethandler;

import com.rs2hd.GameEngine;
import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import org.apache.mina.common.IoSession;

public class ClanPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player p, IoSession session, Packet packet) {
		switch (packet.getId()) {
			case 36: //Clan joining
				@SuppressWarnings("unused") final byte junk = packet.readByte();
				String NAME = packet.readRS2String();
				NAME = NAME.replaceAll("_", " ");
				if(p.inChat) {
					GameEngine.ClanMain.leaveChat(p);
					p.getActionSender().resetList();
					p.inChat = false;
				} else {
					GameEngine.ClanMain.joinChat(p, NAME);
				}
				System.out.println(NAME);
			break;
			case 47://Ranking
				packet.readByte();
			    String name = packet.readRS2String();
				final int rank = packet.readByteA();
				//name = name.replaceAll("_", " ");
				GameEngine.ClanMain.rankPlayer(p, rank, name);
			break;
		}
	}

}















