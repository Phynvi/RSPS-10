package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

/**
 * 
 * NPC clicking packets.
 * @author Dragonkk
 */
@SuppressWarnings("unused")
public class MagicOnPlayer implements PacketHandler {
	
	@Override
	public void handlePacket(final Player player, IoSession session, Packet packet) {
		packet.readByte();
		int interfaceId = packet.readInt2() & 0xFFFF;
		int spellId = packet.readLEShort() & 0xFFFF;
		int playerId = packet.readShortA();
		/*if(interfaceId == 192 && spellId == 63) {
			p.animate(10503);
			p.graphics(1841);
		*/
		player.getWalkingQueue().reset();
		player.getMagicCombat().handleMagic(playerId, interfaceId, spellId);
	}
}

