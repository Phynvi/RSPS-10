package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
//import com.rs2hd.util.pathfinding.*;
/**
 * Handles walking packets.
 * @author Graham for his 508 walk packethanlder and dragonkk for add routefind for 562
 *
 */
public class WalkPacketHandler implements PacketHandler {
	@Override
	public void handlePacket(final Player player, IoSession session, Packet packet) {
		try {
		player.getActionSender().sendCloseChatboxInterface();
		player.getActionSender().sendCloseInventoryInterface();
		player.getActionSender().sendCloseInterface();
		player.homeTele = 0;
		player.getWalkingQueue().reset();
		player.resetSkills();
		player.followPlayer = null;
		player.followingPlayer = false;
		if(player.frozen > 0) {
player.getActionSender().sendMessage("You are frozen!");
		player.getWalkingQueue().reset();
			return;
		}
		if(player.resting == true) {
			player.resting = false;
			player.animate(5748);
		}
		if (player.cantWalk == true)
			return;
		if(player.takingitem > 0) {
			return;
		}
		if(player.isBusy()) {
			return;
		}
		int size = packet.getLength();
		if(packet.getId() == 163) {
			size -= 14;
		}
		int steps = (size - 5) / 2;
		final int firstY = packet.readLEShort() - (player.getLocation().getRegionY() - 6) * 8;
		boolean runSteps = packet.readByteS() == 1;
		final int firstX = packet.readShort() - (player.getLocation().getRegionX() - 6) * 8;
		player.getWalkingQueue().setIsRunning(runSteps);
		player.getWalkingQueue().addToWalkingQueue(firstX, firstY);
		for(int i = 0; i < steps; i++) {
			player.getWalkingQueue().addToWalkingQueue(packet.readByte()+firstX, packet.readByteS()+firstY);
		}
		} catch(Exception e) {
		}	
	}

	private int[][] findRoute(Player p, int toX, int toY) {
		return new int[][] { new int[] { toX, toY } };
	}
}
