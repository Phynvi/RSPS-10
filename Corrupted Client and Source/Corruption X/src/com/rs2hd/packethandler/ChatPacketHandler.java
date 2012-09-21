package com.rs2hd.packethandler;

import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Player;
import com.rs2hd.GameEngine;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Censor;
import com.rs2hd.util.Misc;
import org.apache.mina.common.IoSession;
import com.rs2hd.io.XStreamPlayerLoader;
/**
 * Chat packet handler.
 *
 * @author Graham
 */
public class ChatPacketHandler implements PacketHandler {
	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
	int effects  = packet.readShort() & 0xFFFF;
		int numChars = packet.readByte()  & 0xFF;
		String text  = Misc.decryptPlayerChat(packet, numChars);
		if (player == null) {
			return;
		}
	if (text.startsWith("::")) {
			//text = Misc.removeSlash(text);
			//GameEngine.ClanMain.clanMessage(player, text);
			new CommandsPacketHandler().handlePacket(player, session, packet, text);
			return;
	}
	if (text.startsWith("!") && player.getRights() >= 2) {
			text = Misc.removeSlash(text);
			new ACommandPacketHandler().handlePacket(player, session, packet, text);
			return;
	}
	if (XStreamPlayerLoader.mutes.isMuted(player.getUsername())){
			player.sm("You are muted. If you want to be unmuted appeal at forums.");
			return;
	}
		text = Censor.Replace(text);
		if (text.startsWith("/")) {
			text = Misc.removeSlash(text);
			GameEngine.ClanMain.clanMessage(player, text);
			return;
		}
		player.setLastChatMessage(new ChatMessage(effects, numChars, text));
		player.getUpdateFlags().setChatTextUpdateRequired(true);
		XStreamPlayerLoader.punish.writeTo(player.getUsername()+" = "+text, "./data/text/chatlog");
	}
}
