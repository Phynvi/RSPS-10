package com.rs2hd.packethandler;

import com.rs2hd.GameEngine;
import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.model.NPC;
import com.rs2hd.model.World;
import com.rs2hd.event.Event;
import com.rs2hd.model.NPCDefinition;

import org.apache.mina.common.IoSession;

/**
 * Created by IntelliJ IDEA.
 * <code>palidino76.server.io.packets.DialogueOptions</code>
 *
 * @author Hotyute  (hotyute_mason@hotmail.com)
 */
@SuppressWarnings("unused")
public class DialogueOptions implements PacketHandler {
private NPC n;
@Override
    public void handlePacket(final Player player, IoSession session, Packet packet) {
        int slot = packet.readLEShort();
        int interfaceHash = packet.readInt1();
        int interfaceId = (interfaceHash >> 16);
        int buttonId = (interfaceHash & 0xFF);
        System.out.println(interfaceId + ", " + buttonId);
        switch (interfaceId) {
			case 740:
				switch (buttonId){
					case 3:
						player.getActionSender().sendCloseChatboxInterface();
					break;
					}
				break;
            case 234:
                switch (buttonId) {
                }
                break;
            case 230:
                switch (buttonId) {
                    case 2:
			if(player.slayerMaster == 2) {
					player.getActionSender().sendChatboxInterface(241);
	    				player.getActionSender().animateInterface(9827, 241, 2);
	    				player.getActionSender().sendPlayerOnInterface(241, 2);
	    				player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	   				player.getActionSender().sendString("Who are you?", 241, 4);
	    				player.slayerMaster = 4;
			}
                        break;
                    case 3:
			if(player.slayerMaster == 2) {
				if(player.hasTask == true) {
	    				player.getActionSender().sendChatboxInterface(241);
	   				player.getActionSender().animateInterface(9827, 241, 2);
	    				player.getActionSender().sendPlayerOnInterface(241, 2);
	    				player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	    				player.getActionSender().sendString("How am i doing so far?", 241, 4);
	    				player.slayerMaster = 3;
					} else {
	    				player.getActionSender().sendChatboxInterface(241);
	   				player.getActionSender().animateInterface(9827, 241, 2);
	    				player.getActionSender().sendPlayerOnInterface(241, 2);
	    				player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	    				player.getActionSender().sendString("I need a slayer assignment.", 241, 4);
	    				player.slayerMaster = 3;
				}
			}
                        break;
                    case 4:
 			if(player.slayerMaster == 2) {
	    				player.getActionSender().sendChatboxInterface(241);
	   				player.getActionSender().animateInterface(9827, 241, 2);
	    				player.getActionSender().sendPlayerOnInterface(241, 2);
	    				player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	    				player.getActionSender().sendString("Thats all for now, thanks.", 241, 4);
	    				player.slayerMaster = 0;
			} else {
                            player.getActionSender().sendCloseChatboxInterface();
			}
                        break;
                }
                break;
            case 232:
                switch (buttonId) {
                    case 5:
                        break;
                }
                break;
            case 64:
                switch (buttonId) {
                    case 5:
                        break;
                }
                break;
            case 65:
                switch (buttonId) {
                    case 6:
                        break;
                }
                break;
            case 241:
                switch (buttonId) {
                    case 5:
	if(player.FatherAereck == 1) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9827, 241, 2);
	    player.getActionSender().sendPlayerOnInterface(241, 2);
	    player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	    player.getActionSender().sendString("Whats the matter?", 241, 4);
	    player.FatherAereck = 2;
	} else if(player.FatherAereck == 2) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9775, 241, 2);
	    player.getActionSender().sendNPCOnInterface(456, 241, 2);
	    player.getActionSender().sendString("Father Aereck", 241, 3);
	    player.getActionSender().sendString("Its the Zamorak mage.. He summoned this powerful demon.", 241, 4);
	    player.FatherAereck = 3;
	} else if(player.FatherAereck == 3) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9775, 241, 2);
	    player.getActionSender().sendNPCOnInterface(456, 241, 2);
	    player.getActionSender().sendString("Father Aereck", 241, 3);
	    player.getActionSender().sendString("He lost control of it and now its destroying everything..", 241, 4);
	    player.FatherAereck = 4;
	} else if(player.FatherAereck == 4) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9827, 241, 2);
	    player.getActionSender().sendNPCOnInterface(456, 241, 2);
	    player.getActionSender().sendString("Father Aereck", 241, 3);
	    player.getActionSender().sendString("Could you please help us?", 241, 4);
	    player.FatherAereck = 5;
	} else if(player.FatherAereck == 5) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9760, 241, 2);
	    player.getActionSender().sendPlayerOnInterface(241, 2);
	    player.getActionSender().sendString(""+player.getUsername(), 241, 3);
	    player.getActionSender().sendString("Sure.. i guess..", 241, 4);
	    player.FatherAereck = 6;
	} else if(player.FatherAereck == 6) {
	    player.getActionSender().sendChatboxInterface(241);
	    player.getActionSender().animateInterface(9850, 241, 2);
	    player.getActionSender().sendNPCOnInterface(456, 241, 2);
	    player.getActionSender().sendString("Father Aereck", 241, 3);
	    player.getActionSender().sendString("Thank you so much, please go talk to the Zamorak mage.", 241, 4);
	    player.FatherAereck = 7;
	    player.DemonSlayer = 1;
	} else if(player.FatherAereck == 7) {
	    player.getActionSender().sendCloseChatboxInterface();
	} else if(player.FatherAereck == 8 && player.DemonSlayerDone == true) {
	    player.DemonSlayer = 4;
	    player.FatherAereck = 9;
	    player.getActionSender().sendCloseChatboxInterface();
	}
	if(player.slayerMaster == 1) {
		if(player.hasTask == true) {
		 player.getActionSender().sendInterfaceConfig(230, 7, false);
                 player.getActionSender().sendInterfaceConfig(230, 10, true);
                 player.getActionSender().sendString("Select an Option", 230, 1);
                 player.getActionSender().sendString("Who are you?", 230, 2);
                 player.getActionSender().sendString("How am i doing so far?", 230, 3);
                 player.getActionSender().sendString("That's all for now.", 230, 4);
                 player.getActionSender().sendChatboxInterface(230);
		 player.slayerMaster = 2;
			} else {
		 player.getActionSender().sendInterfaceConfig(230, 7, false);
                 player.getActionSender().sendInterfaceConfig(230, 10, true);
                 player.getActionSender().sendString("Select an Option", 230, 1);
                 player.getActionSender().sendString("Who are you?", 230, 2);
                 player.getActionSender().sendString("I need a slayer assignment..", 230, 3);
                 player.getActionSender().sendString("That's all for now.", 230, 4);
                 player.getActionSender().sendChatboxInterface(230);
		 player.slayerMaster = 2;
			}
		} else if(player.slayerMaster == 3) {
			if(player.hasTask == true) {
	    	player.getActionSender().sendChatboxInterface(241);
	    	player.getActionSender().animateInterface(9850, 241, 2);
	    	player.getActionSender().sendNPCOnInterface(8275, 241, 2);
                player.getActionSender().sendString("Duradel", 241, 3);
                player.getActionSender().sendString("You only have " + player.slayerAmount +" "+ NPCDefinition.forId(player.slayerNPC).getName()+" to go.", 241, 4);
                player.getActionSender().sendChatboxInterface(241);
		player.slayerMaster = 1;
			} else {
			player.getSlayer().assignSlayerTask(player);
			}
		} else if(player.slayerMaster == 5) {
	    	player.getActionSender().sendChatboxInterface(241);
	    	player.getActionSender().animateInterface(9850, 241, 2);
	    	player.getActionSender().sendNPCOnInterface(8275, 241, 2);
                player.getActionSender().sendString("Duradel", 241, 3);
                player.getActionSender().sendString("You already have a slayer task, come back when you have finished it.", 241, 4);
                player.getActionSender().sendChatboxInterface(241);
		player.slayerMaster = 1;
		} else if(player.slayerMaster == 4) {
	    	player.getActionSender().sendChatboxInterface(241);
	    	player.getActionSender().animateInterface(9850, 241, 2);
	    	player.getActionSender().sendNPCOnInterface(8275, 241, 2);
                player.getActionSender().sendString("Duradel", 241, 3);
                player.getActionSender().sendString("I'm a slayer master.", 241, 4);
                player.getActionSender().sendChatboxInterface(241);
		player.slayerMaster = 1;
		} else {
			player.getActionSender().sendCloseChatboxInterface();
		}
                break;
                }
                break;
            case 242:
                switch (buttonId) {
                    case 6:
                        break;
                }
                break;
            case 243:
                switch (buttonId) {
                    case 7:
                        break;
                }
                break;
            case 244:
                switch (buttonId) {
                    case 8:
                        break;
                }
                break;
        }
    }
}
