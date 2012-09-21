package com.rs2hd.packethandler;
/*
 * Author 100% Dragonkk for this junk
 */
import org.apache.mina.common.IoSession;

import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.Misc;
@SuppressWarnings("unused")
public class ObjectPacketHandler implements PacketHandler {
public void handlePacket(final Player player, IoSession session, Packet packet) {
		try {
		 final int h  = packet.readByteS();
		 final int y  = packet.readShortA();
		 final int id = packet.readShort();
		 final int x  = packet.readShort();
		Location location = Location.location(x, y, player.getLocation().getZ());	
		/*World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, location) {
			@Override
			public void run() {*/
				int distance = Misc.getDistance(player.getLocation().getX(), player.getLocation().getY(), x, y);
				if(distance <= 1 && player.getLocation().getZ() == h) {
				switch(id) {
				case 2560:
				case 2561:
				case 2562:
				case 2563:
				case 2564:
				case 2565:
				player.SS().StartSS(id, x, y);
				break;
		case 4705:
int food = Misc.random(2);
if (food == 0) {
		player.thief(7946, 4, 1, 10000, "You steal some fish from fish stall.");
}
if (food == 1) {
		player.thief(385, 4, 1, 13500, "You steal some fish from fish stall.");
}
if (food == 2) {
		player.thief(391, 4, 1, 17000, "You steal some fish from fish stall.");
}
		break;
		case 11408:
		case 6084:
		case 11402:
		case 26972:
		case 22819:
		case 25808:
		case 2213:
		player.getBank().openBank();
		break;
		default:
			player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
			break;
				}
			}else{
				//player.WalkTo().GoTo(player, x, y);
			}
			/*}

		});*/
		} catch(Exception e) {
		}	
}
}
