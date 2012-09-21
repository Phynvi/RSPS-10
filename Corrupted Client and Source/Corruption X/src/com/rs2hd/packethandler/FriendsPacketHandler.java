package com.rs2hd.packethandler;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;
import org.apache.mina.common.IoSession;
import com.rs2hd.io.XStreamPlayerLoader;

/**
 * Handles friends, ignores and PMs.
 *
 * @author Graham
 */
public class FriendsPacketHandler implements PacketHandler {
	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		if (packet.getId() == 226) {
			String user = packet.readRS2String();
			player.getFriends().addFriend(user);
			XStreamPlayerLoader.punish.writeTo(player.getUsername()+" = "+user, "./data/text/friendlog");
		} else if (packet.getId() == 61) {
				//ADD IGNORE
		} else if (packet.getId() == 92) {
			@SuppressWarnings("unused") int idk = packet.readByte();
			String name = packet.readRS2String();
			player.getFriends().removeFriend(name);
		} else if (packet.getId() == 2) {
				//IGNORE
		} else if (packet.getId() == 123) {
			String user = packet.readRS2String();
			sendMessage(player, session, packet, user);
		}
	}
	private void sendMessage(Player player, IoSession session, Packet packet, String name) {
	if (player.muted == true){
		player.sm("You are muted. If you want to be unmuted appeal at forums.");
	return;
	}
		int numChars = packet.readByte() & 0xFF;
		String text = Misc.decryptPlayerChat(packet, numChars);
		player.getFriends().sendMessage(name, text);
		XStreamPlayerLoader.punish.writeTo(player.getUsername()+" = "+text, "./data/text/pmlog");
	}
}
