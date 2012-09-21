package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;
import com.rs2hd.event.Event;
import com.rs2hd.GameEngine;

@SuppressWarnings("unused")
public class NpcPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 217:
			/*
			 * Option 1.
			 */
			option1(player, session, packet);
			break;
		case 38:
			/*
			 * Option 2.
			 */
			option2(player, session, packet);
			break;
		case 95:
			/*
			 * Option 3.
			 */
			option3(player, session, packet);
			break;
		case 207:
			/*
			 * Attack.
			 */
			attack(player, session, packet);
			break;
		}
	}
	private void attack(final Player player, IoSession session, Packet packet) {
		try {
		player.Nid = packet.readLEShort();
		if(player.Nid < 0 || player.Nid >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(player.Nid);
		if(npc == null) {
			return;
		}
		if (npc.isIsFamiliar()) {
		if (npc.pfollow == player.getIndex()) {
		player.sm("You cant kill your own familiar");
		return;
		}
		if (player.SafeZone()) {
			player.sm("You need to be at wilderness to attack this familiar.");
			return;
			}
		if (npc.SafeZone()) {
			player.sm("This familiar is in a safe zone.");
			return;
			}
		}
		player.turnTo(npc);
	player.AttackingNpc = true;
int walkX = npc.getLocation().getX();
int walkY = npc.getLocation().getY();
player.WalkTo().GoToNpc(player, npc.getIndex());
		} catch(Exception e) {
		}	
	}
	
private void option1(final Player p, IoSession session, Packet packet) { //for fish
		try {
packet.skip(1);
int npcIndex = packet.readShortA();
final NPC npc = World.getInstance().getNpcList().get(npcIndex);
if(npc == null) {
	return;
}
int walkX = npc.getLocation().getX();
int walkY = npc.getLocation().getY();
p.WalkTo().GoToNpc(p, npc.getIndex());
if(p.getHunter().isImp(npc)) {
	p.getHunter().catchImp(npc);
}
if(npc.getId() == 320) {
	p.fish().TryStartFishing(npc.getId(),npc);
}
if(npc.getId() == 494) {
	p.getBank().openBank();
	}
if(npc.getId() == 322) {
	p.fish().TryStartFishing(npc.getId()+10000,npc);
}
if(npc.getId() == 8275) {
        		p.turnTemporarilyTo(npc);
			npc.turnTemporarilyTo(p);
	        	p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9850, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(8275, 241, 2);
	    		p.getActionSender().sendString("Duradel", 241, 3);
	    		p.getActionSender().sendString("Hi " + p.getUsername() + ", what are you after?", 241, 4);
			p.slayerMaster = 1;
	}
if(npc.getId() == 456) {
		if(p.FatherAereck == 0) {
        		p.turnTemporarilyTo(npc);
			npc.turnTemporarilyTo(p);
	        	p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9775, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(456, 241, 2);
	    		p.getActionSender().sendString("Father Aereck", 241, 3);
	    		p.getActionSender().sendString("Oh no.. Oh no.. This isn't good..", 241, 4);
			p.FatherAereck = 1;
		} else if(p.FatherAereck < 7 && p.FatherAereck > 0) {
			p.FatherAereck = 0;
		} else if(p.FatherAereck == 7 && p.DemonSlayerDone == true) {
        		p.turnTemporarilyTo(npc);
			npc.turnTemporarilyTo(p);
	        	p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9775, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(456, 241, 2);
	    		p.getActionSender().sendString("Father Aereck", 241, 3);
	    		p.getActionSender().sendString("Thanks for all your help, now the demon wont bother us.", 241, 4);
			p.FatherAereck = 8;
		}
} else {
	if(p.getRights() != 2)
		return;
	p.getActionSender().sendMessage("npc not added" +npcIndex);		
			}
		} catch(Exception e) {
	}	
}

	private void option2(final Player player, IoSession session, Packet packet) {  
		try {

		int id = packet.readLEShort();
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		int walkX = npc.getLocation().getX();
		int walkY = npc.getLocation().getY();
		player.WalkTo().GoTo(player, walkX, walkY);
		if(npc.getId() == 8275) {
			World.getInstance().getShopManager().openShop(player, 4);
			}
		} catch(Exception e) {
		}	
	}
	
	private void option3(final Player player, IoSession session, Packet packet) {
		try {
		int id = packet.readLEShort() & 0xFFFF;
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		int walkX = npc.getLocation().getX();
		int walkY = npc.getLocation().getY();
		player.WalkTo().GoTo(player, walkX, walkY);
		} catch(Exception e) {
		}	
	}

}
