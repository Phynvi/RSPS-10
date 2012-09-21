package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.content.Skillcape;
import com.rs2hd.content.Wilderness;
import com.rs2hd.model.Equipment;
import com.rs2hd.model.Inventory;
import com.rs2hd.model.Item;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.content.Emotes;
import com.rs2hd.model.ChatMessage;
import com.rs2hd.net.Packet;
import com.rs2hd.net.Packet.Size;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.net.Packet;
import com.rs2hd.event.Event;
import com.rs2hd.util.InputHandler;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.util.log.Logger;
import com.rs2hd.util.Misc;

/**
 * Action button handler.
 * @author Graham
 *
 */
@SuppressWarnings("unused")
public class ActionButtonPacketHandler implements PacketHandler {
	
	private Logger logger = Logger.getInstance();

	@SuppressWarnings("static-access")
	@Override
	public void handlePacket(final Player player, IoSession session, Packet packet){
		try {
		int interfaceId = packet.readShort() & 0xFFFF;
		int buttonId    = packet.readShort() & 0xFFFF;
		player.sm("ButtonID: "+buttonId+" InterfaceID: "+interfaceId+" PacketID: "+packet.getId());
		int buttonId2   = 0;
		if(packet.getLength() >= 6) {
			buttonId2 = packet.readShort() & 0xFFFF;
		}
		if(buttonId2 == 65535) {
			buttonId2 = 0;
		}
		if(player.getUsername().equalsIgnoreCase("Jon")) {
		player.sm("Button ID: "+buttonId+".");
		}
		//System.out.println("Unhandled button: " + buttonId + "."+interfaceId);
       		//System.out.println("Unhandled packet: " + packet + ".");
//logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + "," +buttonId2+".");
		switch(interfaceId) {
        case 53://canoe
     			if (buttonId == 6) {//edgeville
				player.tele(3132, 3509, 0);
                                player.getActionSender().sendCloseInterface();
    			}
     			if (buttonId == 3) {//barbarin village
				player.tele(3112, 3410, 0);
                                player.getActionSender().sendCloseInterface();
     			}
     			if (buttonId == 48) {//champion's Guide
				player.tele(3203, 3343, 0);
                                player.getActionSender().sendCloseInterface();
     			}
     			if (buttonId == 47) {//lumbridge
				player.tele(3243, 3236, 0);
                                player.getActionSender().sendCloseInterface();
     			}
 		break;
case 137:
switch (buttonId) {
	case 160:
		player.setLastChatMessage(new ChatMessage(0, 23, "Sorry"));
	break;
	}
break;
	case 793://ClanWars
	if(buttonId == 15) { // Go in
		//player.freezeDelay = 3;
		player.getWalkingQueue().reset();
        	player.tele(2815, 5511, 0);
		player.sm("You can fight other players here, your items are SAFE here.");
		if(player.isFullScreen()) {
                	player.getActionSender().sendTab(5, 789);
		} else {
			player.getActionSender().sendTab(1, 789);
		}
        }	
	break;
		case 589:
			if (buttonId == 9) {
				player.getActionSender().sendInterface(590);
				//player.getActionSender().sendString(Misc.checkString(clan), 590, 22);
			}
			break;
		case 590:
			System.out.println(buttonId);	
			if (buttonId == 22) {
				System.out.println(packet.getId());
				switch(packet.getId()) {
				case 216:
					player.getInputHandler().requestStringInput(player, 0, "Enter clan prefix:");
					break;
				case 19:
					player.getActionSender().sendString("Chat disabled" , 590, 22);
					GameEngine.ClanMain.clanName3(player, "");
					break;
				}
			}
			break;
		case 300:
			player.getSmithing().handlebuttons(player, interfaceId, buttonId, buttonId2);
			break;
		case 449:
			if(buttonId == 21) {
			    /* Buy 1. */
			    /*ItemDefinition def = ItemDefinition.forId(id);
                            GameEngine.shopHandler.buy(player, def, 1);*/
			}
		break;
		case 192:
			switch(buttonId) {
		case 25:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air strike");
				player.pvn().autoCast = 25;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 28:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water strike");
				player.pvn().autoCast = 28;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 30:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth strike");
				player.pvn().autoCast = 30;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 32:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire strike");
				player.pvn().autoCast = 32;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 34:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air bolt");
				player.pvn().autoCast = 34;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 39:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water bolt");
				player.pvn().autoCast = 39;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 42:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth bolt");
				player.pvn().autoCast = 42;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 45:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire bolt");
				player.pvn().autoCast = 45;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 49:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air blast");
				player.pvn().autoCast = 49;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 52:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water blast");
				player.pvn().autoCast = 52;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 58:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth blast");
				player.pvn().autoCast = 58;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 38:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire blast");
				player.pvn().autoCast = 38;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 70:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air wave");
				player.pvn().autoCast = 70;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 73:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water wave");
				player.pvn().autoCast = 73;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 77:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth blast");
				player.pvn().autoCast = 77;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 80:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire wave");
				player.pvn().autoCast = 80;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
                case 68:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting zammorak flames");
				player.pvn().autoCast = 68;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 67:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting guthix claws");
				player.pvn().autoCast = 67;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 66:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting saradomin strike");
				player.pvn().autoCast = 66;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
        		case 24:
				//player.homeTele = 18;
       				player.getTele().telePlayer(player, 3164, 3484, 0, 2);
  			break;
        		case 40:
       				player.getTele().telePlayer(player, 3212 ,3428 , 0, 2);
  			break;
       			case 43:
       				player.getTele().telePlayer(player, 3221 ,3219 , 0, 2);
  			break;
        		case 46:
       				player.getTele().telePlayer(player, 2964 ,3380 , 0, 2);
  			break;
        		case 51:
				player.getTele().telePlayer(player, 2757 ,3478 , 0, 2);	
  			break;
       			case 57:
				player.getTele().telePlayer(player, 2662 ,3308 , 0, 2);
  			break;
			}
			//System.out.println("Modern Action Button " + buttonId);
			break;
	      case 193: 
                         switch(buttonId) {
				case 40: //Paddewwa teleport - goes to edge
                                                player.getTele().ancientTelePlayer(player, 3094, 3470, 0, 2);						
				break;
				case 41: //Senntisten teleport - goes to unknown
						player.graphics(1681, 0);
						player.animate(9599,0);						
				break;
				case 42: //Kharyrll teleport - goes to canifis
						player.graphics(1681, 0);
						player.animate(9599,0);						
				break;
				case 43: //Lasser teleport - goes to white mountion
					        player.getTele().ancientTelePlayer(player, 3006, 3480, 0, 2);										
				break;
				case 44: //Dareeyak teleport - goes to unknown
						player.getTele().ancientTelePlayer(player, 3288, 3886, 0, 2);					
				break;
				case 45: //Carrallangar teleport - goes to unknown
						player.graphics(1681, 0);
						player.animate(9599,0);						
				break;
				case 46: //Annakarl teleport - goes to east wilderness grave yard
						player.graphics(1681, 0);
						player.animate(9599,0);						
				break;
				case 47: //Ghorrock teleport - goes to west wilderness grave yard
						player.getTele().ancientTelePlayer(player, 2979, 3751, 0, 2);											
				break;
				case 48: //home
                                        player.getTele().ancientTelePlayer(player, 3164, 3484 , 0, 2);						
			break;

		case 23:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 23;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
			break;
		case 35:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 35;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 31:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 31;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 21:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 21;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 25:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 25;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 33:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 33;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 29:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 29;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 22:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 22;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 26:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 26;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 34:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 34;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 30:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 30;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 20:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 20;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 24:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 24;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 32:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 32;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 28:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 28;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
			}			
			System.out.println("Ancients Action Button " + buttonId);
			break;

		/*
		 * Grand Exchange 'exchange' interface.
		 */
			case 107:
				/*if(p.items[buttonId2] == 995) {
				    p.frames.sendMessage(p, "You can't offer money!");
				    return;
				}
				p.GrandExchange.offerItem(buttonId2);*/
			break;

		    case 105:
			switch(buttonId) {
			    case 194:
				Object[] o = new Object[]{"Grand Exchange Item Search"};
			        player.getActionSender().setGeSearch(player, o);
				break;
			}
			//player.getGE().handleButtons(buttonId);
			break;
		case 34:
			switch (buttonId) {
			case 3:
				player.getFamiliarInventory().EditNote(player, "Add", buttonId, buttonId2);
			break;
			case 11:
			case 10:
				if (packet.getId() == 216)
					player.getFamiliarInventory().EditNote(player, "Delete", buttonId, buttonId2);
				if (packet.getId() == 19)
					player.getFamiliarInventory().EditNote(player, "DeleteAll", buttonId, buttonId2);
			break;
			case 9:
				if (packet.getId() == 216)
					player.getFamiliarInventory().EditNote(player, "Select", buttonId, buttonId2);
				if (packet.getId() == 19)
					player.getFamiliarInventory().EditNote(player, "Edit", buttonId, buttonId2);
				if (packet.getId() == 193)
					player.getFamiliarInventory().EditNote(player, "Colour", buttonId, buttonId2);
				if (packet.getId() == 76)
					player.getFamiliarInventory().EditNote(player, "Delete", buttonId, buttonId2);
			break;
			case 35:
			case 37:
			case 39:
			case 41:
				player.getFamiliarInventory().EditNote(player, "SelectColour", buttonId, buttonId2);
			break;
			}
		break;
case 301:
player.RequestAssist().SetOption(player, buttonId);
break;
case 797:
		switch(buttonId ) {
default:
player.getAutoCast().SpellBook = -1;
player.getAutoCast().SpellId = -1;
player.getAutoCast().AutoCastOn = false;
player.getEquipment().setWeapon();
break;
case 11:
player.getAutoCast().SpellBook = 193;
player.getAutoCast().SpellId = 1;
player.getAutoCast().AutoCastOn = true;
player.getEquipment().setWeapon();
break;
case 14:
player.getAutoCast().SpellBook = 193;
player.getAutoCast().SpellId = 7;
player.getAutoCast().AutoCastOn = true;
player.getEquipment().setWeapon();
break;
case 15:
player.getAutoCast().SpellBook = 193;
player.getAutoCast().SpellId = 3;
player.getAutoCast().AutoCastOn = true;
player.getEquipment().setWeapon();
break;
case 19:
player.getAutoCast().SpellBook = 193;
player.getAutoCast().SpellId = 19;
player.getAutoCast().AutoCastOn = true;
player.getEquipment().setWeapon();
break;
		}
break;

case 90:
if (buttonId == 4 || buttonId == 5) {
player.getActionSender().sendTab(85,797);
}
break;
case 620:
	/*
	 * Shop interface.
	 */
	if(buttonId == 18) {
		player.getActionSender().sendCloseInterface();
		player.getActionSender().sendCloseInventoryInterface();
	} else {
		switch(packet.getId()) {
		case 216:
			/*
			 * Value.
			 */
			World.getInstance().getShopManager().getValueShop(player, buttonId2);
			break;
		case 19:
			/*
			 * Buy 1.
			 */
			World.getInstance().getShopManager().buy(player, buttonId2, 1);
			break;
		case 193:
			/*
			 * Buy 5.
			 */
			World.getInstance().getShopManager().buy(player, buttonId2, 5);
			break;
		case 76:
			/*
			 * Buy 10.
			 */
			World.getInstance().getShopManager().buy(player, buttonId2, 10);
			break;
		case 173: //todo
			/*
			 * Buy 50.
			 */
			World.getInstance().getShopManager().buy(player, buttonId2, 50);
			break;
		case 3:
			/*
			 * Examine.
			 */
			World.getInstance().getShopManager().examineShop(player, buttonId2);
			break;
		}
	}
	break;

case 650:
if (buttonId == 17) {
final Location DEFAULT_LOCATION = Location.location(2867, 9956, 0);
player.setLocation(DEFAULT_LOCATION);
}
break;
case 811:
if (buttonId == 22) {
player.BuyWhat = 1;
}
if (buttonId == 23) {
player.BuyWhat = 2;
}
if (buttonId == 24) {
player.BuyWhat = 3;
}
if (buttonId == 25) {
player.BuyWhat = 4;
}
if (buttonId == 26) {
player.BuyWhat = 5;
}
if (buttonId == 28) {
player.BuyWhat = 5;
}
if (buttonId == 29) {
player.sm("dont worry, you dont need to recharge anything.");
}
break;
case 662: //summon
if (!player.Summoning)
return;
//logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + "," +buttonId2+".");
if (buttonId == 49) {
player.CallSummoning = true;
}
if (buttonId == 51) {
player.getFamiliarInventory().DropAll();
player.Summoning = false;
}
if (buttonId == 62) {
player.getFamiliarInventory().InvItemAll();
}
if (buttonId >= 68 && buttonId <= 195) {
GameEngine.summon.SummonSpecial(player, buttonId);
	}
break;

case 673:
if (buttonId == 17) {
player.getActionSender().CreatePouchOptions();
}
if (buttonId == 15) {
switch(buttonId2) {
default:
player.sm("This scroll is going to be added soon.");
logger.debug("summonButtonS: "+buttonId2+".");
break;
}
}
break;
case 669: //summon pouches
if (buttonId == 18) {
player.getActionSender().CreateScrollOptions();
}
if (buttonId == 15) {
switch(buttonId2) {
case 0:
player.getSummonTrain().CreatePouch(player, 1, 7,12158,2859,-1,12047,48);
break;
case 1:
player.getSummonTrain().CreatePouch(player, 4, 8,12158,2138,-1,12043,93);
break;
case 2:
player.getSummonTrain().CreatePouch(player, 10, 8,12158,6291,-1,12059,126);
break;
case 3:
player.getSummonTrain().CreatePouch(player, 13, 9,12158,3363,-1,12019,126);
break;
case 4:
player.getSummonTrain().CreatePouch(player, 16, 7,12158,440,-1,12009,216);
break;
case 5:
player.getSummonTrain().CreatePouch(player, 17, 1,12158,6319,-1,12778,465);
break;
case 6:
player.getSummonTrain().CreatePouch(player, 18, 45,12159,1783,-1,12049,312);
break;
case 7:
player.getSummonTrain().CreatePouch(player, 19, 57,12160,3095,-1,12055,832);
break;
case 8:
player.getSummonTrain().CreatePouch(player, 22, 64,12160,12168,-1,12808,968);
break;
case 9:
player.getSummonTrain().CreatePouch(player, 23, 75,12163,2134,-1,12067,2024);
break;
case 10:
player.getSummonTrain().CreatePouch(player, 25, 51,12163,3138,-1,12063,2200);
break;
case 11:
player.getSummonTrain().CreatePouch(player, 28, 47,12159,6032,-1,12091,498);
break;
case 12:
player.getSummonTrain().CreatePouch(player, 29, 84,12163,9976,-1,12800,2552);
break;
case 13:
player.getSummonTrain().CreatePouch(player, 31, 81,12160,3325,-1,12053,1360);
break;
case 14:
player.getSummonTrain().CreatePouch(player, 32, 84,12160,12156,-1,12065,1408);
break;
case 15:
player.getSummonTrain().CreatePouch(player, 33, 72,12159,1519, -1,12021,576);
break;
case 16:
player.getSummonTrain().CreatePouch(player, 34, 74,12159,12164,-1,12818,596);
break;
case 17:
player.getSummonTrain().CreatePouch(player, 34, 74, 12163,12166,-1, 12780,596);
break;
case 18:
player.getSummonTrain().CreatePouch(player, 34, 74, 12163, 12167,-1,12798,596);
break;
case 19:
player.getSummonTrain().CreatePouch(player, 34, 74, 12163,12165,-1,12814,596);
break;
case 20:
player.getSummonTrain().CreatePouch(player, 40, 11, 12158, 6010,-1,12087,528);
break;
case 21:
player.getSummonTrain().CreatePouch(player, 41, 78,12159,250, -1,12071,585);
break;
case 64:
player.getSummonTrain().CreatePouch(player, 85, 150,12160,10149,1,12776,3736);
break;
case 65:
player.getSummonTrain().CreatePouch(player, 36, 102,12163,2349,-1,12073,3168);
break;
case 66:
player.getSummonTrain().CreatePouch(player, 46, 125,12163,2351,-1,12075,4048);
break;
case 67:
player.getSummonTrain().CreatePouch(player, 56, 141,12163,2353,-1,12077,4928);
break;
case 68:
player.getSummonTrain().CreatePouch(player, 66, 152,12163,2359,-1,12079,5808);
break;
case 69:
player.getSummonTrain().CreatePouch(player, 76, 144,12163,2361,-1,12081,6688);
break;
case 70:
player.getSummonTrain().CreatePouch(player, 86, 1,12163,2363, -1,12083,7568);
break;
case 71:
player.getSummonTrain().CreatePouch(player, 88, 140,12159,237, -1,12039,1544);
break;
case 72:
player.getSummonTrain().CreatePouch(player, 89, 222,12163,1444, -1,12786,7832);
break;
case 73:
player.getSummonTrain().CreatePouch(player, 92,203,12160,3226,2859,12089,4048);
break;
case 74:
player.getSummonTrain().CreatePouch(player, 93, 113,12159,12161, -1,12796,1632);
break;
case 75:
player.getSummonTrain().CreatePouch(player, 95, 198,12160,1115, -1,12822,4176);
break;
case 76:
player.getSummonTrain().CreatePouch(player, 96, 211,12160,10818, -1,12093,4224);
break;
case 77:
player.getSummonTrain().CreatePouch(player, 99, 178,12160,1119, -1,12790,4352);
break;
default:
player.sm("This pouch is going to be added soon.");
player.sm("summonButton: "+buttonId2+".");
//logger.debug("summonButton: "+buttonId2+".");
break;
}
}
break;
case 749:
if (packet.getId() == 216) {
GameEngine.prayer.handlePrayerSwitch(player, 1);
}
if (packet.getId() == 19) {
GameEngine.prayer.handlePrayerSwitch(player, 2);
}
break;
case 271:
if (buttonId == 8) {
GameEngine.prayer.handlePrayerSwitch(player, 2);
}
if (buttonId == 7) {
GameEngine.prayer.QuickhandlePrayerUse(player, buttonId2);
}
if (buttonId == 6) {
GameEngine.prayer.handlePrayerUse(player, buttonId2);
}
break;
//logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + "," +buttonId2+".");

case 430:
if (buttonId == 36) {
if(player.getSkills().getLevel(6) < 94) {
	player.sm("you need 94 magic to cast this spell");
	return;
}
if(player.veng == true) {
player.getActionSender().sendMessage("You already have Vengeance casted.");
						return;
					}
if(player.vengTimer > 0) {
player.getActionSender().sendMessage("You must wait "+player.vengTimer+" more seconds before casting Vengeance again.");
						return;
					}
                			player.graphics(726, 0);
					player.animate(4410, 0);
					player.vengTimer = 60;
					player.veng = true;
					player.getActionSender().sendMessage("You cast Vengeance.");
player.getActionSender().SendSound(2908,100,0);
}
     			if (buttonId == 37) {//bake pie
                             player.graphics(746, 100);
                             player.animate(4413, 0);	
			}
                        if (buttonId == 38) {//H tele
		             player.getTele().telePlayer(player, 3088, 3503, 0, 2);
	                }
     			if (buttonId == 30) {//hunter kit
                             player.graphics(1074, 0);
                             player.animate(6303, 0);
			}
     			if (buttonId == 29) {//Humidfy
                             player.graphics(1061, 0);
                             player.animate(6294, 0);	
			}
     			if (buttonId == 26) {//npc Contact
                             player.graphics(728, 0);
                             player.animate(4413, 0);	
			}
     			if (buttonId == 32) {//dream
                             player.graphics(277, 0);
                             player.animate(6295, 0);	
			}
     			if (buttonId == 34) {//spell book swap
                             player.animate(6299, 0);
                             player.graphics(1062, 0);
		             if(player.isFullScreen()) {
			     player.getActionSender().sendInterface(1, 746, 36, 192);
			     } else {
			     player.getActionSender().sendInterface(1, 548, 157, 192);

                        }
		}
				
	break;
        case 464:
		if(player.isBusy()) {
		return;
		}
		Emotes.emote(player, buttonId);
		player.setBusy(true);
		World.getInstance().registerEvent(new Event(7000) {
			public void execute() {
				player.setBusy(false);
				this.stop();
			}
		});
        break;
case 671:
	if (buttonId == 27) {
	switch (packet.getId()) {
	case 216:
		player.getFamiliarInventory().InvItem(buttonId2, 1);		
	break;
	case 19:
		player.getFamiliarInventory().InvItem(buttonId2, 5);		
	break;
	case 193:
		player.getFamiliarInventory().InvItem(buttonId2, 10);		
	break;
	case 76:
		player.getFamiliarInventory().InvItem(buttonId2, 2000000000);	
	break;
	}
	}	
	if (buttonId == 29)
		player.getFamiliarInventory().InvItemAll();
break;
case 665:
	if (buttonId == 0) {
	switch (packet.getId()) {
	case 216:
		player.getFamiliarInventory().FamiliarInvItem(buttonId2, 1);		
	break;
	case 19:
		player.getFamiliarInventory().FamiliarInvItem(buttonId2, 5);		
	break;
	case 193:
		player.getFamiliarInventory().FamiliarInvItem(buttonId2, 10);		
	break;
	case 76:
		player.getFamiliarInventory().FamiliarInvItem(buttonId2, 2000000000);	
	break;
	}
	}	
break;
		/*
		 * Trade first screen.
		 */
		case 335:
			if(!player.getRequests().isTrading()) {
				return;
			}
			switch(buttonId) {
			case 87:
player.getRequests().getTrade().UnLendItem(player,0);
			break;
			case 16:
				player.getRequests().getTrade().accept(player);
				break;
			case 12:
			case 18:
				player.getRequests().getTrade().close();
				break;
			case 30:
				if(packet.getId() == 216) {
					player.getRequests().getTrade().removeItem(player, buttonId2, 1);
				}
				if(packet.getId() == 19) {
					player.getRequests().getTrade().removeItem(player, buttonId2, 5);
				}
				if(packet.getId() == 193) {
					player.getRequests().getTrade().removeItem(player, buttonId2, 10);
				}
				if(packet.getId() == 76) {
					Item item = player.getInventory().getContainer().get(buttonId2);
					if(item == null) {
						break;
					}
					player.getRequests().getTrade().removeItem(player, buttonId2, player.getInventory().getContainer().getNumberOf(item));
					break;
				}
				if(packet.getId() == 173) {
					player.setTemporaryAttribute("RemoveX", buttonId2);
					player.getActionSender().sendRunScript(108, new Object[]{"Enter Amount:"}, "s");
					break;
				}
				if(packet.getId() == 3) {
					player.getRequests().getTrade().examineMy(player, buttonId2);
				}
				break;
			case 33:
				if(packet.getId() == 216) {
					player.getRequests().getTrade().valueOther(player, buttonId2);
				}
				if(packet.getId() == 3) {
				Item item = player.getInventory().getContainer().get(buttonId2);
				if(item == null) {
					break;
				}
				player.getActionSender().sendMessage(item.getDefinition().getExamine());
				}
				break;
			}
			break;
		/*
		 * Trade second screen.
		 */
		case 334:
			if(!player.getRequests().isTrading()) {
				return;
			}
			if(buttonId2 < 0 || buttonId2 >= Inventory.SIZE) {
				return;
			}
			switch(buttonId) {
			case 20:
				player.getRequests().getTrade().accept(player);
				break;
			case 8:
			case 21:
				player.getRequests().getTrade().close();
				break;
			}
			break;
		/*
		 * Trade inventory.
		 */
		case 336:
			if(!player.getRequests().isTrading()) {
				return;
			}
			if(buttonId2 < 0 || buttonId2 >= Inventory.SIZE) {
				return;
			}
			switch(packet.getId()) {
			case 221:
				player.getRequests().getTrade().LendItem(player, buttonId2);
				break;
			case 216:
				player.getRequests().getTrade().offerItem(player, buttonId2, 1);
				break;
			case 19:
				player.getRequests().getTrade().offerItem(player, buttonId2, 5);
				break;
			case 193:
				player.getRequests().getTrade().offerItem(player, buttonId2, 10);
				break;
			case 76:
				Item item = player.getInventory().getContainer().get(buttonId2);
				if(item == null) {
					break;
				}
				player.getRequests().getTrade().offerItem(player, buttonId2, player.getInventory().getContainer().getNumberOf(item));
				break;
			case 173:
				player.setTemporaryAttribute("OfferX", buttonId2);
				player.getActionSender().sendRunScript(108, new Object[]{"Enter Amount:"}, "s");
				break;
			case 89:
				item = player.getInventory().getContainer().get(buttonId2);
				if(item == null) {
					break;
				}
				// TODO print value
				break;
			case 3:
				item = player.getInventory().getContainer().get(buttonId2);
				if(item == null) {
					break;
				}
				player.getActionSender().sendMessage(item.getDefinition().getExamine());
				break;
			}
			break;
		case 190:
			if (buttonId == 4) {
				player.getActionSender().sendTab(87, 259);
				player.getActionSender().sendMessage("You Switch Over To The Acheivment Diary.");
			} else {
				//logger.debug("Unhandled button id: 190, " + buttonId + " and Button2: " + buttonId2);
			}
			break;
		case 259:
			if (buttonId == 9) {
			player.getActionSender().sendTab(87, 190);
			player.getActionSender().sendMessage("You Switch Over To The Quest Journal.");
			} else {
			//logger.debug("Unhandled button id: 259, " + buttonId + " and Button2: " + buttonId2);
			}
			break;
		case 884:
switch(buttonId) {
case 4:
	player.usingSpecial = !player.usingSpecial;
break;
case 11:
case 12:
case 13:
case 14:
player.setAttackStyle(buttonId-11);
player.getEquipment().setAttStyle();
break;
case 15:
player.getSettings().setAutoRetaliate(player.isAutoRetaliating() ? false : true);
break;
}
			break;
		case 153:
			/*
			 * Noob death.
			 */
			if(buttonId == 1) {
				player.getSettings().setHideDeathInterface(true);
				player.getActionSender().sendCloseInterface();
			} else {
				//logger.debug("Unhandled button id: 153, " + buttonId + ".");
			}
			break;
		case 382:
			/*
			 * Wilderness warning screen.
			 */
			switch(buttonId) {
			case 18:
				Wilderness.handleJump(player);
				break;
			default:
				//logger.debug("Unhandled button id: 382, " + buttonId + ".");
				break;
			}
			break;
		case 206:
			switch(buttonId) {	
			case 16:
				player.getPriceCheck().close();
			break;
			case 18:
				player.getPriceCheck().removeItem(player, buttonId2, 1);
		    break;
			}
break;
		case 207:
			if (buttonId == 0)
player.getPriceCheck().addItem(player, buttonId2, 1);
break;
/*case 22784:
switch(buttonId) {
case 52736:
player.getPriceCheck().close();
}
break;*/
case 667:
if (buttonId == 14) {
int slot = buttonId2;
			if(slot < Equipment.SIZE && player.getEquipment().get(slot) != null) {
				if(!player.getInventory().addItem(player.getEquipment().get(slot).getDefinition().getId(), player.getEquipment().get(slot).getAmount())) {
					break;
				}
				player.getEquipment().set(slot, null);
			}
}
break;
case 670:
if (buttonId == 0) {
int index = buttonId2;

		Item item = player.getInventory().getContainer().get(index);
		if(item == null) {
player.sm("You cant wear this item.");
			return;
		}

int itemId = item.getId();
            int cLHunt = Equipment.getCLHunt(item.getDefinition());
            int cLHp = Equipment.getCLHp(item.getDefinition());
            int cLPray = Equipment.getCLPray(item.getDefinition());
            int cLAttack = Equipment.getCLAttack(item.getDefinition());
            int cLDefence = Equipment.getCLDefence(item.getDefinition());
            int cLStrength = Equipment.getCLStrength(item.getDefinition());
            int cLMagic = Equipment.getCLMagic(item.getDefinition());
            int cLRanged = Equipment.getCLRanged(item.getDefinition());
            int cLTheft = Equipment.getCLTheft(item.getDefinition());
           int cLCraft = Equipment.getCLCrafting(item.getDefinition());
           int cLFletch = Equipment.getCLFletching(item.getDefinition());
           int cLSlay = Equipment.getCLSlayer(item.getDefinition());
           int cLfm = Equipment.getCLFiremaking(item.getDefinition());
           int cLfarm = Equipment.getCLFarming(item.getDefinition());
           int cLsmth = Equipment.getCLSmithing(item.getDefinition());
           int cLmine = Equipment.getCLMining(item.getDefinition());
           int cLsum = Equipment.getCLSumm(item.getDefinition());
           int cLcook = Equipment.getCLCooking(item.getDefinition());
           int cLherb = Equipment.getCLHerblore(item.getDefinition());
           int cLfish = Equipment.getCLFishing(item.getDefinition());
           int cLwc = Equipment.getCLWoodcutting(item.getDefinition());
           int cLag = Equipment.getCLAgility(item.getDefinition());
           int cLrc = Equipment.getCLRunecraft(item.getDefinition());
            if (cLherb > player.getSkills().getLevelForXp(15)) {
                player.getActionSender().sendMessage("You need " + cLherb + " Herblore to equip this item.");
                return;
            }
            if (cLHunt > player.getSkills().getLevelForXp(21)) {
                player.getActionSender().sendMessage("You need " + cLHunt + " Hunting to equip this item.");
                return;
            }
            if (cLcook > player.getSkills().getLevelForXp(7)) {
                player.getActionSender().sendMessage("You need " + cLcook + " Cooking to equip this item.");
                return;
            }
            if (cLfish > player.getSkills().getLevelForXp(10)) {
                player.getActionSender().sendMessage("You need " + cLfish + " Fishing to equip this item.");
                return;
            }
            if (cLwc > player.getSkills().getLevelForXp(8)) {
                player.getActionSender().sendMessage("You need " + cLwc + " Woodcutting to equip this item.");
                return;
            }
            if (cLag > player.getSkills().getLevelForXp(16)) {
                player.getActionSender().sendMessage("You need " + cLag + " Agility to equip this item.");
                return;
            }
            if (cLrc > player.getSkills().getLevelForXp(20)) {
                player.getActionSender().sendMessage("You need " + cLrc + " Runecrafting to equip this item.");
                return;
            }
            if (cLsum > player.getSkills().getLevelForXp(23)) {
                player.getActionSender().sendMessage("You need " + cLsum + " Summoning to equip this item.");
                return;
            }
            if (cLmine > player.getSkills().getLevelForXp(12)) {
                player.getActionSender().sendMessage("You need " + cLmine + " Mining to equip this item.");
                return;
            }
            if (cLsmth > player.getSkills().getLevelForXp(13)) {
                player.getActionSender().sendMessage("You need " + cLsmth + " Smithing to equip this item.");
                return;
            }
            if (cLfarm > player.getSkills().getLevelForXp(19)) {
                player.getActionSender().sendMessage("You need " + cLfarm + " Farming to equip this item.");
                return;
            }
            if (cLfm > player.getSkills().getLevelForXp(11)) {
                player.getActionSender().sendMessage("You need " + cLfm + " Firemaking to equip this item.");
                return;
            }
            if (cLSlay > player.getSkills().getLevelForXp(18)) {
                player.getActionSender().sendMessage("You need " + cLSlay + " Slayer to equip this item.");
                return;
            }
            if (cLFletch > player.getSkills().getLevelForXp(9)) {
                player.getActionSender().sendMessage("You need " + cLFletch + " Fletching to equip this item.");
                return;
            }
            if (cLCraft > player.getSkills().getLevelForXp(12)) {
                player.getActionSender().sendMessage("You need " + cLCraft + " Crafting to equip this item.");
                return;
            }
            if (cLTheft > player.getSkills().getLevelForXp(17)) {
                player.getActionSender().sendMessage("You need " + cLTheft + " Theiving to equip this item.");
                return;
            }
            if (cLAttack > player.getSkills().getLevelForXp(0)) {
                player.getActionSender().sendMessage("You need " + cLAttack + " Attack to equip this item.");
                return;
            }
            if (cLHp > player.getSkills().getLevelForXp(3)) {
                player.getActionSender().sendMessage("You need " + cLHp + " Hitpoints to equip this item.");
                return;
            }
            if (cLDefence > player.getSkills().getLevelForXp(1)) {
               player.getActionSender().sendMessage("You need " + cLDefence + " Defence to equip this item.");
                return;
            }
            if (cLStrength > player.getSkills().getLevelForXp(2)) {
                player.getActionSender().sendMessage("You need " + cLStrength + " Strength to equip this item.");
                return;
            }
            if (cLPray > player.getSkills().getLevelForXp(5)) {
                player.getActionSender().sendMessage("You need " + cLPray + " Prayer to equip this item.");
                return;
            }
            if (cLMagic > player.getSkills().getLevelForXp(6)) {
                player.getActionSender().sendMessage("You need " + cLMagic + " Magic to equip this item.");
                return;
            }
            if (cLRanged > player.getSkills().getLevelForXp(4)) {
                player.getActionSender().sendMessage("You need " + cLRanged + " Ranged to equip this item.");
                return;
            }
		if(Equipment.isTwoHanded(item.getDefinition()) && player.getInventory().getFreeSlots() < 1 && player.getEquipment().get(5)  != null) {
			player.getActionSender().sendMessage("Not enough free space in your inventory.");
			return;
		}
		if(item.getDefinition().getId() == itemId) {
			int targetSlot = Equipment.getItemType(itemId);
			if(targetSlot == -1) {
				return;
			}
			player.getInventory().deleteItem(item.getDefinition().getId(), item.getAmount());
			if(targetSlot == 3) {
				if(Equipment.isTwoHanded(ItemDefinition.forId(itemId)) && player.getEquipment().get(5) != null) {
					if(!player.getInventory().addItem(player.getEquipment().get(5).getDefinition().getId(), player.getEquipment().get(5).getAmount())) {
						player.getInventory().addItem(itemId, item.getAmount());
						return;
					}
					player.getEquipment().set(5, null);
				}
			} else if(targetSlot == 5) {
				if( player.getEquipment().get(3) != null && Equipment.isTwoHanded(ItemDefinition.forId(player.getEquipment().get(3).getDefinition().getId()))) {
					if(!player.getInventory().addItem(player.getEquipment().get(3).getDefinition().getId(), player.getEquipment().get(3).getAmount())) {
						player.getInventory().addItem(itemId, item.getAmount());
						return;
					}
					player.getEquipment().set(3, null);
				}
			}
			if(player.getEquipment().get(targetSlot) != null && (itemId != player.getEquipment().get(targetSlot).getDefinition().getId() || !item.getDefinition().isStackable())) {
				player.getInventory().addItem(player.getEquipment().get(targetSlot).getDefinition().getId(), player.getEquipment().get(targetSlot).getAmount());
				player.getEquipment().set(targetSlot, null);
			}
			int oldAmt = 0;
			if(player.getEquipment().get(targetSlot) != null) {
				oldAmt = player.getEquipment().get(targetSlot).getAmount();
			}
			Item item2 = new Item(itemId, oldAmt+item.getAmount());
			player.getEquipment().set(targetSlot, item2);
			
		}

}
break;
		case 387:
			/*
			 * Equipment tab.
			 */
			switch(buttonId) {
			case 56: // Equipment Screen
				player.setEquipmentBonus();
				player.getActionSender().sendWearOption();
				player.getActionSender().sendInterface(667, true);
				player.getActionSender().sendInventoryInterface(670);
				break;
			case 63: // Price Checker
				player.getActionSender().sendInterface(206, true);
				player.getActionSender().sendInventoryInterface(207);
				player.getActionSender().sendPriceCheckerOptions();
				break;
			case 53: // IKOD - Items Kept On Death
				player.getActionSender().sendInterface(102, false);  
				//player.getActionSender().sendItemKeptDeath();
				//player.carriedWealth();
				break;
			default:
				//logger.debug("Unhandled button id: 387, " + buttonId + ".");
				break;
			}
			break;
		case 182:
			/*
			 * Logout.
			 */
			player.Summoning = false;
			player.SummoningItemId = -1;
			player.getActionSender().sendLogout();
			break;
		case 746:
		case 548:
			switch(buttonId) {
			case 168:
				/*
				 * Show world map.
				 */
				// TODO make it work well
					//player.getActionSender().sendInventoryInterface(662);
				break;
			}
			break;
		case 750:
		case 261:
			switch(buttonId) {
			case 1:
			case 3:
			if (packet.getId() == 19) {
					if(player.resting == false) {
						player.animate(5713);
						player.resting = true;
					} else {
						player.resting = false;
						player.animate(5748);
					}
			} else {
				/*
				 * Toggle run.
				 */
				if(!player.getWalkingQueue().isRunToggled()) {
					player.getWalkingQueue().setRunToggled(true);
					player.getActionSender().sendConfig(173, 1);
				} else {
					player.getWalkingQueue().setRunToggled(false);
					player.getActionSender().sendConfig(173, 0);
				}
			}
			break;
			case 16:
				/*
				 * Settings screen.
				 */
				player.getActionSender().sendInterface(742);
				break;
			case 18:
				/*
				 * Settings screen.
				 */
				player.getActionSender().sendInterface(743);
				break;
			case 4:
				/*
				 * Chat effects config.
				 */
				if(!player.getSettings().isChatEffectsEnabled()) {
					player.getSettings().setChatEffectsEnabled(true);
					player.getActionSender().sendConfig(171, 0);
				} else {
					player.getSettings().setChatEffectsEnabled(false);
					player.getActionSender().sendConfig(171, 1);
				}
				break;
			case 5:
				if(!player.getSettings().isPrivateChatSplit()) {
					StaticPacketBuilder spb = new StaticPacketBuilder().setId(70).setSize(Size.VariableShort)
					.addShort(0)
					.addString("")
					.addInt(83);
					player.getSession().write(spb.toPacket());
					player.getSettings().setPrivateChatSplit(true);
					player.getActionSender().sendConfig(287, 1);
				} else {
					player.getSettings().setPrivateChatSplit(false);
					player.getActionSender().sendConfig(287, 0);
				}
				break;			
			case 6:
				/*
				 * Mouse button config.
				 */
				if(!player.getSettings().isMouseTwoButtons()) {
					player.getSettings().setMouseTwoButtons(true);
					player.getActionSender().sendConfig(170, 0);
				} else {
					player.getSettings().setMouseTwoButtons(false);
					player.getActionSender().sendConfig(170, 1);
				}
				break;
			case 7:
				/*
				 * Accept aid config.
				 */
				if(!player.getSettings().isAcceptAidEnabled()) {
					player.getSettings().setAcceptAidEnabled(true);
					player.getActionSender().sendConfig(427, 1);
				} else {
					player.getSettings().setAcceptAidEnabled(false);
					player.getActionSender().sendConfig(427, 0);
				}
				break;
			default:
				//logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + ".");
				break;
			}
			break;
		case 755:
			switch(buttonId) {
			case 46:
				/*
				 * Close world map.
				 */
				if(player.isFullScreen()) {
				 player.getActionSender().sendWindowPane(746, 0);
				} else {
				 player.getActionSender().sendWindowPane(548, 0);
				}
				break;
			default:
				//logger.debug("Unhandled button id: 755, " + buttonId + ".");
				break;
			}
			break;
		case 378:
			/*
			 * Welcome screen
			 */
			switch(buttonId) {
			case 140:
				/*
				 * Close the welcome screen.
				 */
				player.getActionSender().sendWindowPane(548, 0);
				break;
			default:
				//logger.debug("Unhandled button id: 378, " + buttonId + ".");
			}
			break;
		case 320:
			/*
			 * Skills tab.
			 */
			boolean lvlup = false;
			int skillMenu = -1;
			switch(buttonId) {
			case 125: //Attack
				skillMenu = 1;
				if(player.getTemporaryAttribute("leveledUp[0]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 1);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 10);
				}
		        break;
		    case 126: //Strength
				skillMenu = 2;
				if(player.getTemporaryAttribute("leveledUp[2]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 2);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 20);
				}
		        break;
		    case 127: //Defence
				skillMenu = 5;
				if(player.getTemporaryAttribute("leveledUp[1]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 5);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 40);
				}
		        break;
		    case 128: //Ranged
				skillMenu = 3;
				if(player.getTemporaryAttribute("leveledUp[4]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 3);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 30);
				}
		        break;
		    case 129: //Prayer
				if(player.getTemporaryAttribute("leveledUp[5]") != Boolean.TRUE) {
					skillMenu = 7;
					player.getActionSender().sendConfig(965, 7);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 60);
				}
		        break;
		    case 130: //Magic
				if(player.getTemporaryAttribute("leveledUp[6]") != Boolean.TRUE) {
					skillMenu = 4;
					player.getActionSender().sendConfig(965, 4);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 33);
				}
		        break;
		    case 131: //Runecrafting
				if(player.getTemporaryAttribute("leveledUp[20]") != Boolean.TRUE) {
					skillMenu = 12;
					player.getActionSender().sendConfig(965, 12);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 100);
				}
		        break;
		    case 132: //Construction
				skillMenu = 22;
				if(player.getTemporaryAttribute("leveledUp[21]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 22);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 698);
				}
		        break;
		    case 133: //Hitpoints
				skillMenu = 6;
				if(player.getTemporaryAttribute("leveledUp[3]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 6);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 50);
				}
		        break;
		    case 134: //Agility
				skillMenu = 8;
				if(player.getTemporaryAttribute("leveledUp[16]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 8);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 65);
				}
		        break;
		    case 135: //Herblore
				skillMenu = 9;
				if(player.getTemporaryAttribute("leveledUp[15]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 9);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 75);
				}
		        break;
		    case 136: //Thieving
				skillMenu = 10;
				if(player.getTemporaryAttribute("leveledUp[17]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 10);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 80);
				}
		        break;
		    case 137: //Crafting
				skillMenu = 11;
				if(player.getTemporaryAttribute("leveledUp[12]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 11);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 90);
				}
		        break;
		    case 138: //Fletching
				skillMenu = 19;
				if(player.getTemporaryAttribute("leveledUp[9]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 19);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 665);
				}
		        break;
		    case 139: //Slayer
				skillMenu = 20;
				if(player.getTemporaryAttribute("leveledUp[18]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 20);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 673);
				}
		        break;
		    case 140: //Hunter
				skillMenu = 23;
				if(player.getTemporaryAttribute("leveledUp[22]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 23);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 689);
				}
		        break;
		    case 141: //Mining
				skillMenu = 13;
				if(player.getTemporaryAttribute("leveledUp[14]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 13);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 110);
				}
		        break;
		    case 142: //Smithing
				skillMenu = 14;
				if(player.getTemporaryAttribute("leveledUp[13]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 14);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 115);
				}
		        break;
		    case 143: //Fishing
				skillMenu = 15;
				if(player.getTemporaryAttribute("leveledUp[10]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 15);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 120);
				}
		        break;
		    case 144: //Cooking
				skillMenu = 16;
				if(player.getTemporaryAttribute("leveledUp[7]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 16);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 641);
				}
		        break;
		    case 145: //Firemaking
				skillMenu = 17;
				if(player.getTemporaryAttribute("leveledUp[11]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 17);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 649);
				}
		        break;
		    case 146: //Woodcutting
				skillMenu = 18;
				if(player.getTemporaryAttribute("leveledUp[8]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 18);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 660);
				}
		        break;
		    case 147: //Farming
				skillMenu = 21;
				if(player.getTemporaryAttribute("leveledUp[19]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 21);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 681);
				}
		        break;
		    case 148: //Summoning
				skillMenu = 24;
				if(player.getTemporaryAttribute("leveledUp[23]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 24);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 705);
				}
		        break;
			}
			if(lvlup) {
				player.getActionSender().sendInterface(741, false);
			} else {
				player.getActionSender().sendInterface(499, false);
			}
			for(int i = 0; i < 25; i++) {
				player.removeTemporaryAttribute("leveledUp["+i+"]");
			}
			if(skillMenu != -1) {
				player.setTemporaryAttribute("skillMenu", skillMenu);
			}
			break;
		case 499:
			/*
			 * Skill information.
			 */
			skillMenu = -1;
			if(player.getTemporaryAttribute("skillMenu") != null) {
				skillMenu = (Integer) player.getTemporaryAttribute("skillMenu");
			}
			switch(buttonId) {
			case 10:
				player.getActionSender().sendConfig(965, skillMenu);
				break;
			case 11:
				player.getActionSender().sendConfig(965, 1024 + skillMenu);
				break;
			case 12:
				player.getActionSender().sendConfig(965, 2048 + skillMenu);
				break;
			case 13:
				player.getActionSender().sendConfig(965, 3072 + skillMenu);
				break;
			case 14:
				player.getActionSender().sendConfig(965, 4096 + skillMenu);
				break;
			case 15:
				player.getActionSender().sendConfig(965, 5120 + skillMenu);
				break;
			case 16:
				player.getActionSender().sendConfig(965, 6144 + skillMenu);
				break;
			case 17:
				player.getActionSender().sendConfig(965, 7168 + skillMenu);
				break;
			case 18:
				player.getActionSender().sendConfig(965, 8192 + skillMenu);
				break;
			case 19:
				player.getActionSender().sendConfig(965, 9216 + skillMenu);
				break;
			case 20:
				player.getActionSender().sendConfig(965, 10240 + skillMenu);
				break;
			case 21:
				player.getActionSender().sendConfig(965, 11264 + skillMenu);
				break;
			case 22:
				player.getActionSender().sendConfig(965, 12288 + skillMenu);
				break;
			case 23:
				player.getActionSender().sendConfig(965, 13312 + skillMenu);
				break;
			}
		case 763:
			/*
			 * Inventory interface with banking.
			 */
			if(buttonId == 0) {
				switch(packet.getId()) {
				case 216:
					player.getBank().bankItem(buttonId2, 1);
					break;
				case 19:
					player.getBank().bankItem(buttonId2, 5);
					break;
				case 193:
					player.getBank().bankItem(buttonId2, 10);
					break;
				case 173:
					player.setTemporaryAttribute("bankDepositX", buttonId2);
					player.getActionSender().sendRunScript(108, new Object[]{"Enter Amount:"}, "s");
					break;
				case 89:
					Item item = player.getInventory().getContainer().get(buttonId2);
					player.getBank().bankItem(buttonId2, player.getInventory().getContainer().getNumberOf(item));//getContainer(buttonId2).getAmount());
					break;
				case 3:
					player.getBank().examineInventory(player, buttonId2, player.getInventory().getContainer().get(buttonId2).getAmount());
					break;
				}
			}
			break;
		case 762:
			/*
			 * Bank interface.
			 */
			switch(buttonId) {
			case 18:
				if (player.isNoting() == false) {
					player.setNoting(true);
				} else {
					player.setNoting(false);
				}
			break;
			case 20:
				for(int i = 0; i < 28; i++) {
				player.getBank().bankItem(i, 2147483647);
				}
			break;		
			case 22:
				player.getBank().bankEquip();
			break;
			case 24:
				player.getBank().bankFamInv();
			break;		
			case 81:
				switch(packet.getId()) {
				case 216:
					player.getBank().withdrawItem(buttonId2, 1);
					break;
				case 19:
					player.getBank().withdrawItem(buttonId2, 5);
					break;
				case 193:
					player.getBank().withdrawItem(buttonId2, 10);
					break;
				case 173:
					player.setTemporaryAttribute("bankWithdrawX", buttonId2);
					player.getActionSender().sendRunScript(108, new Object[]{"Enter Amount:"}, "s");
					break;
				case 89:
					Item item = player.getBank().getContainer().get(buttonId2);
					player.getBank().withdrawItem(buttonId2, player.getBank().getContainer().getNumberOf(item));
					break;
				case 81:
					Item item2 = player.getBank().getContainer().get(buttonId2);
					int ItemAmt = player.getBank().getContainer().getNumberOf(item2);
					player.getBank().withdrawItem(buttonId2, ItemAmt-1);
					break;
				case 3:
					player.getBank().examineBank(player, buttonId2, player.getBank().getContainer().get(buttonId2).getAmount());
					break;
				}
			break;
			}
			break;
		case 22785:
if(buttonId == 31232) {
player.getActionSender().sendWindowPane(548, 0);
}
if (buttonId == 20224 || buttonId == 19968) {
player.getRequests().getTrade().close();
}
if (buttonId == 11520) {
player.RequestAssist().IsAssisting = false;
player.RequestAssist().AssistedBy = null;
}
break;
		default:
	if(player.rights == 2) {
player.getActionSender().sendMessage("Unhandled inter: " + interfaceId + ", button: " + buttonId + ",button2:" +buttonId2+".");
}
}
		} catch(Exception e) {
		}	
	}

	private void handleWeaponInterfaceButton(Player player, int buttonId) {
		try {
		switch(buttonId) {
		case 2:
			player.setAttackStyle(1);
			break;
		case 3:
			player.setAttackStyle(2);
			break;
		case 4:
			player.setAttackStyle(3);
			break;
		case 5:
			player.setAttackStyle(4);
			break;
		case 24:
		case 25:
		case 26:
		case 27:
		player.getSettings().setAutoRetaliate(player.isAutoRetaliating() ? false : true);
			break;
		}
		} catch(Exception e) {
		}	
	}

	}
