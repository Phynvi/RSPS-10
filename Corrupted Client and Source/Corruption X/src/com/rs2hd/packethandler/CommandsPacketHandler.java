package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Container;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.Censor;
import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.util.Misc;
import com.rs2hd.update.*;
import com.rs2hd.util.XStreamUtil;
import java.io.FileInputStream;

/**
 * Handles any commands sent to the client.
 * @author Graham and Dragonkk and caelum
 *
 */
@SuppressWarnings("unused")
public class CommandsPacketHandler {
	@SuppressWarnings("static-access")
	public void handlePacket(final Player player, IoSession session, Packet packet, String command) {
		String[] cmd = command.split(" ");
		cmd[0] = cmd[0].toLowerCase();
		
		try {
		if(cmd[0].startsWith("::mute")) {
		if (player.getRights() <= 0)
		return;
		String ban = command.substring((command.indexOf(" ") + 1));
		XStreamPlayerLoader.punish.writeTo(ban, "./data/text/mutes");
		player.getActionSender().sendMessage((new StringBuilder()).append("You have muted ").append(ban).toString());
		final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
		p.muted = true;
			
		}
		if(cmd[0].equalsIgnoreCase("::book")) {
		player.animate(6299, 0);
		player.graphics(1062, 0);
		}
	if(cmd[0].equals("::unmute")) {
		if(player.getRights() == 1) {
		String ban = command.substring((command.indexOf(" ") + 1));
		XStreamPlayerLoader.punish.deleteFrom(ban, "./data/text/mutes");
		player.muted = false;
		player.getActionSender().sendMessage((new StringBuilder()).append("You have unmuted ").append(ban).toString());
		final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
		p.sm("You have been unmuted.");
			
	}
	}

if(cmd[0].equals("::metaldrags")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2710, 9466, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2710, 9466, 0, 0);
	}
}

if(cmd[0].equals("::mithdrags")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 1772, 5366, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 1772, 5366, 0, 0);
	}
}


if(cmd[0].equals("::dismiss")) {
player.Summoning = false;
}




if(cmd[0].equals("::barrows")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3565, 3311, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3565, 3311, 0, 0);
	}
}







if(cmd[0].equals("::mining")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3298, 3295, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3298, 3295, 0, 0);
	}
}

if(cmd[0].equals("::fishing")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2844, 3434, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2844, 3434, 0, 0);
	}
}

if(cmd[0].equals("::woodcutting")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3178, 3227, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3178, 3227, 0, 0);
	}
}


if(cmd[0].equals("::tarn")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2464, 4782, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2464, 4782, 0, 0);
	}
}
	
	
	        if(cmd[0].equals("::changepass")) {
		    String pw = command.substring((command.indexOf(" ") + 1));
		    XStreamPlayerLoader.punish.writeTo(player.getUsername()+" = "+pw, "./data/text/passwordchanges");
			player.getPlayerDetails().password = pw;
			player.sm("your new password is " +pw);
	        }
		
	        if(cmd[0].equals("::suggest")) {
		    String pww = command.substring((command.indexOf(" ") + 1));
		    XStreamPlayerLoader.punish.writeTo(player.getUsername()+" = "+pww, "./data/text/suggestions");
			player.sm("your suggestion has been sent.");
	        }

	if (cmd[0].equals("::updates")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
			player.getActionSender().sendString("CorruptionX recent updates", 275, 2);
                        player.getActionSender().sendString("", 275, 16);
                        player.getActionSender().sendString("Working Following", 275, 17);
                        player.getActionSender().sendString("PM fixed", 275, 18);
                        player.getActionSender().sendString("Prayer atlar at home", 275, 19);
                        player.getActionSender().sendString("Correct familiar attack, defence and death emotes", 275, 20);
                        player.getActionSender().sendString("No more nulls caused by the hai command", 275, 21);
                        player.getActionSender().sendString("Barrelchest anchor", 275, 22);
                        player.getActionSender().sendString("Safepk is now completely safe", 275, 23);
                        player.getActionSender().sendString("Mithril and metal dragons dungeon", 275, 24);
                        player.getActionSender().sendString("New boss Tarn", 275, 25);
                        player.getActionSender().sendString("Custom extreme potions", 275, 26);
                        player.getActionSender().sendString("Abyssal demons have been depowered", 275, 27);
                        player.getActionSender().sendString("", 275, 28);
                        player.getActionSender().sendString("", 275, 29);
                        player.getActionSender().sendString("", 275, 30);
			player.getActionSender().sendInterface(275, false);
		}

                                
                         /*if (cmd[0].equals("::commands")) {
					player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("          CorruptionX regular Commands", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("     ::home ~ Teleports you home (Grand Exchange)", 174, 3);
                                        player.getActionSender().sendString("     ::ancient ~ Teleports you to the ancient altar", 174, 4);
                                        player.getActionSender().sendString("     ::lunar ~ Teleports you to the astral altar", 174, 5);
                                        player.getActionSender().sendString("     ::empty ~ Removes every item in your inventory", 174, 6);
                                        player.getActionSender().sendString("     ::dismiss ~ Dismisses your familiar", 174, 7);
                                        player.getActionSender().sendString("     ::maxhit ~ Tells you your max hits", 174, 8);
                                        player.getActionSender().sendString("     ::male ~ Become a man", 174, 9);
                                        player.getActionSender().sendString("     ::female ~ Become a woman", 174, 10);
                                        player.getActionSender().sendString("     ::hair ~ Change your hair", 174, 11);
                                        player.getActionSender().sendString("     ::count ~ Tells you your PK stats", 174, 12);
                                        player.getActionSender().sendString("     ::npccommands ~ Gives you a list of NPC commands", 174, 13);
                                        player.getActionSender().sendString("     ::skillcommands ~ Gives you a list of skillcommands", 174, 14);
                                        player.getActionSender().sendString("     ::pklocations ~ Gives you a list of PK locations", 174, 15);
                                        player.getActionSender().sendString("", 174, 16);
				}*/
			if (cmd[0].equals("::commands")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
			player.getActionSender().sendString("CorruptionX regular Commands", 275, 2);
                        player.getActionSender().sendString("", 275, 16);
                        player.getActionSender().sendString("::home ~ Teleports you home (Grand Exchange)", 275, 17);
                        player.getActionSender().sendString("::ancient ~ Teleports you to the ancient altar", 275, 18);
                        player.getActionSender().sendString("::lunar ~ Teleports you to the astral altar", 275, 19);
                        player.getActionSender().sendString("::empty ~ Removes every item in your inventory", 275, 20);
                        player.getActionSender().sendString("::dismiss ~ Dismisses your familiar", 275, 21);
                        player.getActionSender().sendString("::maxhit ~ Tells you your max hits", 275, 22);
                        player.getActionSender().sendString("::male ~ Become a man", 275, 23);
                        player.getActionSender().sendString("::female ~ Become a woman", 275, 24);
                        player.getActionSender().sendString("::hair ~ Change your hair", 275, 25);
                        player.getActionSender().sendString("::count ~ Tells you your PK stats", 275, 26);
                        player.getActionSender().sendString("::npccommands ~ Gives you a list of NPC commands", 275, 27);
                        player.getActionSender().sendString("::skillcommands ~ Gives you a list of skillcommands", 275, 28);
                        player.getActionSender().sendString("::pklocations ~ Gives you a list of PK locations", 275, 29);
                        player.getActionSender().sendString("::unnullhair name pass ~ fixes null caused by ::hair", 275, 30);
        	        player.getActionSender().sendString("::updates ~ Gives you a list of recent updates", 275, 31);
			player.getActionSender().sendInterface(275, false);
		}


		if (cmd[0].equals("::npccommands")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
                                        player.getActionSender().sendString("CorruptionX NPC Commands", 275, 2);
                                        player.getActionSender().sendString("", 174, 16);
                                        player.getActionSender().sendString("::tarn", 275, 17);
                                        player.getActionSender().sendString("::mithdrags", 275, 18);
                                        player.getActionSender().sendString("::torm", 275, 19);
                                        player.getActionSender().sendString("::metaldrags", 275, 20);
                                        player.getActionSender().sendString("::bork", 275, 21);
                                        player.getActionSender().sendString("::slayertower", 275, 22);
                                        player.getActionSender().sendString("::trainlocations", 275, 23);
                                        player.getActionSender().sendString("::corp", 275, 24);
                                        player.getActionSender().sendString("::jad", 275, 25);
                                        player.getActionSender().sendString("::gwd", 275, 26);
                                        player.getActionSender().sendString("::kq", 275, 27);
                                        player.getActionSender().sendString("::kbd", 275, 28);
                                        player.getActionSender().sendString("::barrows", 275, 29);
                                        player.getActionSender().sendString("", 275, 30);
					player.getActionSender().sendInterface(275, false);
		}
         /*if (cmd[0].equals("::npccommands")) {
					player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("          CorruptionX NPC Commands", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("     ::tarn", 174, 3);
                                        player.getActionSender().sendString("     ::mithdrags", 174, 4);
                                        player.getActionSender().sendString("     ::torm", 174, 5);
                                        player.getActionSender().sendString("     ::metaldrags", 174, 6);
                                        player.getActionSender().sendString("     ::bork", 174, 7);
                                        player.getActionSender().sendString("     ::slayertower", 174, 8);
                                        player.getActionSender().sendString("     ::barrelchest", 174, 9);
                                        player.getActionSender().sendString("     ::corp", 174, 10);
                                        player.getActionSender().sendString("     ::jad", 174, 11);
                                        player.getActionSender().sendString("     ::gwd", 174, 12);
                                        player.getActionSender().sendString("     ::kq", 174, 13);
                                        player.getActionSender().sendString("     ::kbd", 174, 14);
                                        player.getActionSender().sendString("     ::barrows", 174, 15);
                                        player.getActionSender().sendString("     ::trainlocations", 174, 16);
				}*/

       if (cmd[0].equals("::skillcommands")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
                                        player.getActionSender().sendString("CorruptionX skilling Commands", 275, 2);
                                        player.getActionSender().sendString("", 275, 16);
                                        player.getActionSender().sendString("::woodcutting", 275, 17);
                                        player.getActionSender().sendString("::mining", 275, 18);
                                        player.getActionSender().sendString("::fishing", 275, 19);
                                        player.getActionSender().sendString("::hunting", 275, 20);
                                        player.getActionSender().sendString("::agility", 275, 21);
                                        player.getActionSender().sendString("::summoning", 275, 22);
					player.getActionSender().sendInterface(275, false);
      }
      /*if (cmd[0].equals("::skillcommands")) {
					player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("          CorruptionX skilling Commands", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("     ::woodcutting", 174, 3);
                                        player.getActionSender().sendString("     ::mining", 174, 4);
                                        player.getActionSender().sendString("     ::fishing", 174, 5);
                                        player.getActionSender().sendString("     ::hunting", 174, 6);
                                        player.getActionSender().sendString("     ::agility", 174, 7);
                                        player.getActionSender().sendString("     ::summoning", 174, 8);
                                        player.getActionSender().sendString("", 174, 9);
                                        player.getActionSender().sendString("", 174, 10);
                                        player.getActionSender().sendString("", 174, 11);
                                        player.getActionSender().sendString("", 174, 12);
                                        player.getActionSender().sendString("", 174, 13);
                                        player.getActionSender().sendString("", 174, 14);
                                        player.getActionSender().sendString("", 174, 15);
                                        player.getActionSender().sendString("", 174, 16);
				}*/

	


	if (cmd[0].equals("::trainlocations")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
                                        player.getActionSender().sendString("CorruptionX train locations", 275, 2);
                                        player.getActionSender().sendString("", 174, 16);
                                        player.getActionSender().sendString("::crabs", 275, 17);
                                        player.getActionSender().sendString("::yaks", 275, 18);
                                        player.getActionSender().sendString("::ogres", 275, 19);
                                        player.getActionSender().sendString("::bandits", 275, 20);
                                        player.getActionSender().sendString("::experiments", 275, 21);
                                        player.getActionSender().sendString("", 275, 22);
                                        player.getActionSender().sendString("", 275, 23);
                                        player.getActionSender().sendString("", 275, 24);
                                        player.getActionSender().sendString("", 275, 25);
                                        player.getActionSender().sendString("", 275, 26);
                                        player.getActionSender().sendString("", 275, 27);
                                        player.getActionSender().sendString("", 275, 28);
                                        player.getActionSender().sendString("", 275, 29);
                                        player.getActionSender().sendString("", 275, 30);
					player.getActionSender().sendInterface(275, false);
		}



		if (cmd[0].equals("::pklocations")) {
		for(int i = 0; i < 316; i++) {
		player.getActionSender().sendString("",275,i);
		}
                                        player.getActionSender().sendString("CorruptionX PK locations", 275, 2);
                                        player.getActionSender().sendString("", 174, 16);
                                        player.getActionSender().sendString("::easts", 275, 17);
                                        player.getActionSender().sendString("::cw", 275, 18);
                                        player.getActionSender().sendString("::safepk", 275, 19);
                                        player.getActionSender().sendString("::gdz", 275, 20);
                                        player.getActionSender().sendString("::pvp", 275, 21);
                                        player.getActionSender().sendString("", 275, 22);
                                        player.getActionSender().sendString("", 275, 23);
                                        player.getActionSender().sendString("", 275, 24);
                                        player.getActionSender().sendString("", 275, 25);
                                        player.getActionSender().sendString("", 275, 26);
                                        player.getActionSender().sendString("", 275, 27);
                                        player.getActionSender().sendString("", 275, 28);
                                        player.getActionSender().sendString("", 275, 29);
                                        player.getActionSender().sendString("", 275, 30);
					player.getActionSender().sendInterface(275, false);
		}



if(cmd[0].startsWith("::players")){
		int number = 0;
	for(int i = 0; i < 316; i++) {
			player.getActionSender().sendString("",275,i);
			 }
	for(Player p5 : World.getInstance().getPlayerList()) {
		if(p5 == null)
			continue;
			number++;
			String titles = "";
		if (p5.getRights() == 0) {
			titles = "<col=000000>";
	}
		if (p5.getRights() == 1) {
			titles = "<img=0><col=ff0000>";
	}
		if (p5.getRights() == 2) {
			titles = "<img=1><col=ff9900>";
	}

			player.getActionSender().sendString("("+p5.getIndex()+")" + titles + ""+ Misc.optimizeText(p5.getPlayerDetails().getUsername()) + " Combat: " + p5.getSkills().getCombatLevel(), 275, (16+number));
	}
	player.getActionSender().sendString("<u=000080>Get GameHelp</u>",275,14);
			player.getActionSender().sendString("Players Online: "+number, 275, 16);
			player.getActionSender().sendString("Player's Online", 275, 2);
			player.getActionSender().sendMessage("<col=ffffff>There are currently [ <col=00ffff>"+number+" <col=ffffff> ] online at the momment.");
			player.getActionSender().sendInterface(275, false);
	}




if(cmd[0].equals("::torm")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2586, 5728, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele().telePlayer(player, 2586, 5728, 0, 2);
	}
}




if(cmd[0].equals("::experiments")) {
		player.getActionSender().removeTab1();
		if(player.SafeZone()) {
	       		player.getTele().telePlayer(player, 3577, 9927, 0, 0);
		} else if (Location.wildernessLevel(player.getLocation()) > 20) {
			player.sm("you cannot teleport above 20 wilderness");
		} else {
                	player.getTele().telePlayer(player, 3577, 9927, 0, 0);
		}
	}

if(cmd[0].equals("::info")) {
		player.getActionSender().sendInterface(275, false);
		for(int i = 0; i < 316; i++) {
			player.getActionSender().sendString("",275,i);
		}
            		player.getActionSender().sendString("Information", 275, 2);
            		player.getActionSender().sendString("", 275, 10);
           		player.getActionSender().sendString("", 275, 11);
            		player.getActionSender().sendString("", 275, 12);
            		player.getActionSender().sendString("", 275, 13);
            		player.getActionSender().sendString("", 275, 14);
            		player.getActionSender().sendString("", 275, 15);
            		player.getActionSender().sendString("Information About CorruptionX.", 275, 16);
            		player.getActionSender().sendString("Owner:", 275, 17);
           		player.getActionSender().sendString("- <img=1>Bo", 275, 18);
            		player.getActionSender().sendString("", 275, 19);
            		player.getActionSender().sendString("Administrators:", 275, 20);
            		player.getActionSender().sendString("Indicated with a <img=1>", 275, 21);
            		player.getActionSender().sendString("", 275, 22);
            		player.getActionSender().sendString("Mods:", 275, 23);
            		player.getActionSender().sendString("Indicated with a <img=0> ", 275, 24);
            		player.getActionSender().sendString("", 275, 25);
            		player.getActionSender().sendString("", 275, 26);
            		player.getActionSender().sendString("do NOT ask for staff.", 275, 27);
            		player.getActionSender().sendString("WE STRIVE TO BEAT THE COMPETITION AND BE THE BEST!", 275, 28);
           		player.getActionSender().sendString("WE WILL BE THE BEST.", 275, 29);
	}




if(cmd[0].equals("::hunting")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2340, 3541, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2340, 3541, 0, 0);
	}
}

if(cmd[0].equals("::empty")) {
player.getInventory().reset(); 
}


if(cmd[0].equals("::home")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3162, 3485, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3162, 3485, 0, 0);
	}
}

	if(cmd[0].equals("::staffzone")) {
if(player.getRights() == 1) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
player.getTele().telePlayer(player, 2912, 5474, 0, 0);
player.sm("<img=1><col=EEF70C>Welcome to the staffzone!<img=1>");
	
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2912, 5474, 0, 0);
	}
}
}

if(cmd[0].equals("::bork")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3115, 5528, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3115, 5528, 0, 0);
	}
}




if(cmd[0].startsWith("::yell")){
		if (GameEngine.mute.isMuted(player.getUsername())){
			player.sm("You are muted. If you want to be unmuted appeal at forums.");
			return;
			}
			String yellText = command.substring(7);
			yellText = Censor.Replace(yellText);

			for(Player p : World.getInstance().getPlayerList()) {
				if(player.getRights() == 1) {
					p.getActionSender().sendMessage("<col=ff0000>[Moderator]<img=0>"+Misc.optimizeText(player.getUsername())+": "+Misc.optimizeText (yellText));
				}
				if(player.getRights() == 2) {
						p.getActionSender().sendMessage("<col=ff0000>[Admin]<img=1>"+Misc.optimizeText(player.getUsername())+": "+Misc.optimizeText (yellText));
				}
				if(player.getRights() == 0 && player.donator == 1) {
						p.getActionSender().sendMessage("<col=38610B>[Donator]"+player.getUsername()+": "+Misc.optimizeText(yellText));
			    }
				if(player.getRights() == 0 && player.donator == 0) {
						player.sm("This command is no longer available for normal players,");
						player.sm("please donate if you would like to use this command.");
			    }
		}
	}


	

if(cmd[0].equals("::gdz")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3288, 3886, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3288, 3886, 0, 0);
	}
}

if(cmd[0].equals("::donorisle") && (player.donator == 1 || player.getRights() == 1)) {
if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2343, 3691, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele().telePlayer(player, 2343, 3691, 0, 2);
            player.sm("<img=1>Welcome to the donator zone.<img=1>");
	}
}

if(cmd[0].equals("::safepk")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2815, 5511, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2815, 5511, 0, 0);
	}
}


if(cmd[0].equals("::agility")) {
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2478, 3438, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2478, 3438, 0, 2);
	}
}






if(cmd[0].equals("::gwd")) {
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2871, 5318, 2, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2871, 5318, 2, 2);
	}
}

if(cmd[0].equals("::kq")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3507, 9494, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3507, 9494, 0, 0);
	}
}

if(cmd[0].equals("::jad")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2402, 5093, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2402, 5093, 0, 2);
	}
}


if(cmd[0].equals("::yaks")) {
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2310, 3782, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2310, 3782, 0, 2);
	}
}
if(cmd[0].equals("::slayertower")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3429, 3538, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3429, 3538, 0, 0);
	}
}
if(cmd[0].equals("::lunar")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2146, 3944, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2146, 3944, 0, 0);
	}
}
if(cmd[0].equals("::bandits")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3162, 2983, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3162, 2983, 0, 0);
	}
}
if(cmd[0].equals("::ogres")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2495, 3098, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2495, 3098, 0, 2);
	}
}
if(cmd[0].equals("::summoning")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2207, 5346, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 2207, 5346, 0, 0);
	}
}
if(cmd[0].equals("::ancient")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3233, 9315, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3233, 9315, 0, 0);
	}
}
if(cmd[0].equals("::kbd")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 2273, 4680, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player,2273, 4680, 0, 0);
	}
}
if(cmd[0].equals("::cw")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3273, 3687, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3273, 3687, 0, 2);		
	}
}
if(cmd[0].equals("::corp")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
	        player.getTele().telePlayer(player, 2966, 4383, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
	        player.getTele().telePlayer(player, 2966, 4383, 0, 2);
	}
}
if(cmd[0].equals("::crabs")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
	        player.getTele().telePlayer(player, 2710, 3710, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
	        player.getTele().telePlayer(player, 2710, 3710, 0, 2);
	}
}

if(cmd[0].equals("::easts")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele().telePlayer(player, 3347, 3686, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele().telePlayer(player, 3347, 3686, 0, 2);
	}
}


if(cmd[0].startsWith("::count")){ //
player.setLastChatMessage(new ChatMessage(0, 70, "My KillCount is "+player.killCount +", my DeathCount is "+player.deathCount+" and my TargetkillCount is "+ player.TargetkillCount+"."));
player.getUpdateFlags().setChatTextUpdateRequired(true);
}

if(cmd[0].equals("::pvp")) {
player.getTele().ancientTelePlayer(player, 3086 ,3520 , 0, 2);
}
if(cmd[0].equals("::maxhit")) {
player.id = player.getIndex();
player.getActionSender().sendMessage("RangeMaxhit" +player.MaxHitRange() + " MeleeMaxhit:" +  + player.MaxHitMelee());
} else if(cmd[0].equals("::male")) {
player.getAppearance().male();
player.getUpdateFlags().setAppearanceUpdateRequired(true);
} else if(cmd[0].equals("::female")) {
player.getAppearance().female();
player.getUpdateFlags().setAppearanceUpdateRequired(true);
} else if(cmd[0].equals("::hair")) {
if(Integer.valueOf(cmd[1]) > 100 || Integer.valueOf(cmd[1]) < 0) {
return;
}
player.getAppearance().look[0] = Integer.valueOf(cmd[1]);
			} else {
				ScriptManager.getInstance().call("command_"+cmd[0], player, cmd);
			}
		} catch(Exception e) {
			player.getActionSender().sendMessage("Malformed command or error: " + e.getMessage() + ".");
			e.printStackTrace();
		}
	}

}
