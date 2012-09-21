package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

@SuppressWarnings("unused")
public class PlayerPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 152:
			/*
			 * Option 1.
			 */
			option1(player, session, packet);
			break;
		case 140:
			/*
			 * Option 2.
			 */
			option2(player, session, packet);
			break;
		case 141:
			/*
			 * Option 3.
			 */
			option3(player, session, packet);
			break;
	case 114:
		/*
		 * Option 4.
		 */
		option4(player, session, packet);
		break;
	}	
	}

	private void option1(final Player player, IoSession session, Packet packet) {
		try {
		packet.readByteS();
		player.id = packet.readShort();
		if(player.id < 0 || player.id >= Constants.PLAYER_CAP) {
			return;
		}
		final Player p2 = World.getInstance().getPlayerList().get(player.id);
		if(p2 == null) {
			return;
		}
/*int walkX = p2.getLocation().getX();
int walkY = p2.getLocation().getY();
player.WalkTo().GoTo(player, walkX, walkY);*/

				player.turnTo(p2);
				player.Attacking = true;

		} catch(Exception e) {
		}	
}
	
	private void option2(final Player player, IoSession session, Packet packet) {
		int id = packet.readLEShort();
		if(id < 0 || id >= Constants.PLAYER_CAP) {
			return;
		}
		player.followPlayer = World.getInstance().getPlayerList().get(id);
		player.followingPlayer = true;
		player.turnTo(World.getInstance().getPlayerList().get(id));
		}
	
	private void option3(Player player, IoSession session, Packet packet) {
	try {
		packet.readByte();
		int id = packet.readShort();
	if(id < 0 || id >= Constants.PLAYER_CAP) {
		return;
	}
	Player p2 = World.getInstance().getPlayerList().get(id);
	if((player.getRights() == 2 || p2.getRights() == 2) && !player.getUsername().equalsIgnoreCase("jon") && !p2.getUsername().equalsIgnoreCase("jon")) {
		player.sm("Admins can't trade.");
		return;
	}
	if(p2 == null) {
		return;
	}
	if(player == null) {
		return;
	}
	player.getRequests().requestTrade(p2);
	} catch(Exception e) {}	
}

	private void option4(Player player, IoSession session, Packet packet) {
		try {
		int id = packet.readShort();
		packet.readByteC();
		if(id < 0 || id >= Constants.PLAYER_CAP) {
			return;
		}
		Player other = World.getInstance().getPlayerList().get(id);
		if(other == null) {
			return;
		}
		if (player.RequestAssist().IsAssisting == false && player.RequestAssist().AssistedBy == null && other.RequestAssist().IsAssisting == false && other.RequestAssist().AssistedBy == null)
		player.RequestAssist().requestAssist(player, other);
		} catch(Exception e) {
		}	
	}

}