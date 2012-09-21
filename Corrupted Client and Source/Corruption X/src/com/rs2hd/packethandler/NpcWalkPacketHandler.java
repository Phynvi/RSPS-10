package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
//import com.rs2hd.util.pathfinding.*;
/**
 * Handles walking packets.
 * @author Graham for 508 walk and dragonkk for make cliped walk at 562
 *
 */
@SuppressWarnings("unused")
public class NpcWalkPacketHandler implements PacketHandler {
	@Override
	public void handlePacket(final Player player, IoSession session, Packet packet) {
		try {
		int size = packet.getLength();
		int steps = (size - 5) / 2;
		final int firstY = packet.readLEShort();
		int NpcIndex = packet.readByteS();
		player.sm(""+NpcIndex);
		final NPC npc = World.getInstance().getNpcList().get(NpcIndex);
		final int firstX = packet.readShort();
		npc.getNpcWalk().resetWalking();
		npc.getNpcWalk().addToWalkingQueue(firstX, firstY);
		player.sm("npc: "+NpcIndex+" firstX: "+firstX+" firstY: "+firstY);
		for(int i = 0; i < steps; i++) {
			int ii = packet.readByte();
			int iii = packet.readByteS();
			npc.getNpcWalk().addToWalkingQueue(ii+firstX, iii+firstY);
			player.sm("ii: "+ii+" iii: "+iii);
		}
		} catch(Exception e) {
		}	
	}
}
