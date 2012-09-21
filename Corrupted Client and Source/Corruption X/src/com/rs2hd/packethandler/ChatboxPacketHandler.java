package com.rs2hd.packethandler;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import org.apache.mina.common.IoSession;

/**
 * Chatbox packet handlers.
 *
 * @author Graham
 */
public class ChatboxPacketHandler implements PacketHandler {

    @Override
    public void handlePacket(Player player, IoSession session, Packet packet) {
	player.getActionSender().sendCloseChatboxInterface();
    }

}
