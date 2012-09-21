package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;

/**
 * 
 * NPC clicking packets.
 * @author Dragonkk
 */
public class MagicOnItem implements PacketHandler {
	
	
	@Override
	public void handlePacket(final Player p, IoSession session, Packet packet) {
		try {
					if(p == null) {
						System.out.println("MagicOnItem.java p == null");
						return;
					}
//inv
				int InvMain = packet.readInt();
				int InvInter = InvMain >> 16;

				int itemSlot = packet.readShortA();
				int itemId = packet.readInt1();
//magic interface
				packet.readLEShort();
				int MagicMain = packet.readShort();

				int MagicInter = MagicMain >> 16;
				int ChillId = MagicMain - (MagicInter << 16);
System.out.println(itemId);
if (InvInter == 149 && MagicInter == 192) {
final Item item = p.getInventory().getContainer().get(itemSlot);
if(item == null) {
return;
}
switch(ChillId) {
case 34:
		if (p.isAlching) {
				return;
			}
			if (p.getSkills().getLevel(5) <= 55) {
				p.getActionSender().sendMessage("You need atleast 55 magic to cast High Alchemy.");
					p.getActionSender().dunno(168,6);
				return;
			}
			if (!(p.getInventory().contains(561, 1) && p.getInventory().contains(554,5))) {
				p.getActionSender().sendMessage("You do not have required runes to cast this spell.");
					p.getActionSender().dunno(168,6);
				return;
			}
			p.animate(713);
			p.graphics(113);
			p.getInventory().addItem(995, GameEngine.prices.getNormalPrice(itemId));
			p.getInventory().deleteItem(561, 1);
			p.getInventory().deleteItem(554, 5);
			p.getInventory().deleteItem(itemId, 1);
			p.isAlching = true;
			
			World.getInstance().registerEvent(new Event(2250) {
				public void execute() {
					if ( p == null) {
						this.stop();
					return;
					}
					if (!World.getInstance().isOnline(p.getUsername())) {
						this.stop();
					return;
					}
					p.isAlching = false;
					p.getActionSender().dunno(168,6);
					this.stop();
				}
			});
break;
default:
p.getActionSender().sendMessage("Spell not added. Chill id:"+ChillId);	
break;
}
}
		} catch(Exception e) {
		}
}
}
