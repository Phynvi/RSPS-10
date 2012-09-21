package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.content.skills.thief.pickpocket;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

/**
 * Handles any commands sent to the client.
 * @author Graham
 *
 */
@SuppressWarnings("unused")
public class SummonPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player p, IoSession session, Packet packet) {
		try {
int NpcId = packet.readShortA();
packet.readByte();
		System.out.println(NpcId);
	final NPC n = World.getInstance().getNpcList().get(NpcId);
		if(n == null) {
		return;
		}
int walkX = n.getLocation().getX();
int walkY = n.getLocation().getY();
p.WalkTo().GoToNpc(p, n.getIndex());

int distance = Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), n.getLocation().getX(), n.getLocation().getY());
if(distance <= 1 && p.getLocation().getZ() == n.getLocation().getZ()) {
switch(n.getId()) {
case 322:
p.fish().TryStartFishing(n.getId(),n);
break;
case 6267:
p.fish().TryStartFishing(n.getId(),n);
break;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
pickpocket.PickPocket(p,n,1);
break;
case 21:
	pickpocket.PickPocket(p,n,2);
	break;
case 494:
	p.getBank().openBank();
	break;
case 584:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 1);
break;

case 546:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 2);
break;

case 554:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 3);
break;

case 551:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 4);
break;

case 6970:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 5);
break;

case 548:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 6);
break;

case 682:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 7);
break;

case 586:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 8);
break;
case 1699:
p.getActionSender().sendMessage("<col=FF0000>Restart your client if you can't see any items in the shop.");
World.getInstance().getShopManager().openShop(p, 9);
break;
case 6815:
case 6816:
	if (p.Summoning == false) {
p.getActionSender().sendMessage("You dont have a familiar.");
	return;
	}
		if(n.pfollow != p.getIndex()) {
p.getActionSender().sendMessage("This isnt your familiar.");
return;
}
case 6873:
case 6874:
	if (p.Summoning == false) {
p.getActionSender().sendMessage("You dont have a familiar.");
	return;
	}
		if(n.pfollow != p.getIndex()) {
p.getActionSender().sendMessage("This isnt your familiar.");
return;
}
p.getFamiliarInventory().openFamiliarInventory();
break;
default:
p.sm("npc not added: "+n.getId());
}
}
		} catch(Exception e) {
		}
	}
}
