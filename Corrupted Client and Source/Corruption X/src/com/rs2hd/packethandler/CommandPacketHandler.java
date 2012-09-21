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
import com.rs2hd.model.FamiliarNpc;
import com.rs2hd.content.skills.combat.NpcVsNpc;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.Censor;
import com.rs2hd.util.Misc;
import com.rs2hd.event.Event;
import com.rs2hd.util.XStreamUtil;
import com.rs2hd.net.ActionSender;
import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.content.Combat;
import com.rs2hd.content.Teleport;
import com.rs2hd.GameEngine;
import java.util.List;
import java.io.*;
/**
 * Handles any commands sent to the client.
 * @author Graham and Dragonkk and Jon
 *
 */
@SuppressWarnings("unused")
public class CommandPacketHandler implements PacketHandler {

	@SuppressWarnings("unchecked")
	public void handlePacket(final Player player, IoSession session, Packet packet) {
		packet.skip(1);
		String command = packet.readRS2String();
		String[] cmd = command.split(" ");
		cmd[0] = cmd[0].toLowerCase();
		
		try {
if(cmd[0].equals("showocc") && player.getRights() < 2) {
player.getActionSender().sendInterface(2147000000);
}
if(cmd[0].equals("fps") && player.getRights() < 2) {
player.getActionSender().sendInterface(2147000000);
}
if(cmd[0].equals("hunting")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
	player.getTele();
	Teleport.telePlayer(player, 2340, 3541, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2340, 3541, 0, 0);
	}
}

if(cmd[0].equals("metaldrags")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2710, 9466, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2710, 9466, 0, 0);
	}
}

if(cmd[0].equals("tarn")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2464, 4782, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2464, 4782, 0, 0);
	}
}


if(cmd[0].equals("forcechat")) {
String chat = command.substring(10);
for(Player p : World.getInstance().getPlayerList()) {
  p.forceChat(chat);
}
}



if(cmd[0].equals("mithdrags")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 1772, 5366, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 1772, 5366, 0, 0);
	}
}


if(cmd[0].equals("experiments")) {
		player.getActionSender().removeTab1();
		if(player.SafeZone()) {
	       		player.getTele();
				Teleport.telePlayer(player, 3577, 9927, 0, 0);
		} else if (Location.wildernessLevel(player.getLocation()) > 20) {
			player.sm("you cannot teleport above 20 wilderness");
		} else {
                	player.getTele();
					Teleport.telePlayer(player, 3577, 9927, 0, 0);
		}
	}

if(cmd[0].equals("mining")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3298, 3295, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3298, 3295, 0, 0);
	}
}

if(cmd[0].equals("fishing")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2844, 3434, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2844, 3434, 0, 0);
	}
}

if(cmd[0].equals("woodcutting")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3178, 3227, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3178, 3227, 0, 0);
	}
}



if(cmd[0].equals("barrows")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3565, 3311, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3565, 3311, 0, 0);
	}
}






if(cmd[0].equals("barrelchest")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2930, 3271, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2930, 3271, 0, 2);
	}
}


if(cmd[0].equals("dismiss")) {
player.Summoning = false;
}




              if (cmd[0].equals("commands")) {
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
				}



         if (cmd[0].equals("npccommands")) {
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
				}


      if (cmd[0].equals("skillcommands")) {
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
				}



      if (cmd[0].equals("pklocations")) {
					player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("          CorruptionX PK locations", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("     ::easts", 174, 3);
                                        player.getActionSender().sendString("     ::cw", 174, 4);
                                        player.getActionSender().sendString("     ::safepk", 174, 5);
                                        player.getActionSender().sendString("     ::gdz", 174, 6);
                                        player.getActionSender().sendString("     ::pvp", 174, 7);
                                        player.getActionSender().sendString("", 174, 8);
                                        player.getActionSender().sendString("", 174, 9);
                                        player.getActionSender().sendString("", 174, 10);
                                        player.getActionSender().sendString("", 174, 11);
                                        player.getActionSender().sendString("", 174, 12);
                                        player.getActionSender().sendString("", 174, 13);
                                        player.getActionSender().sendString("", 174, 14);
                                        player.getActionSender().sendString("", 174, 15);
                                        player.getActionSender().sendString("", 174, 16);
				}


      if (cmd[0].equals("trainlocations")) {
					player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("          CorruptionX train locations", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("     ::crabs", 174, 3);
                                        player.getActionSender().sendString("     ::yaks", 174, 4);
                                        player.getActionSender().sendString("     ::ogres", 174, 5);
                                        player.getActionSender().sendString("     ::bandits", 174, 6);
                                        player.getActionSender().sendString("     ::experiments", 174, 7);
                                        player.getActionSender().sendString("", 174, 8);
                                        player.getActionSender().sendString("", 174, 9);
                                        player.getActionSender().sendString("", 174, 10);
                                        player.getActionSender().sendString("", 174, 11);
                                        player.getActionSender().sendString("", 174, 12);
                                        player.getActionSender().sendString("", 174, 13);
                                        player.getActionSender().sendString("", 174, 14);
                                        player.getActionSender().sendString("", 174, 15);
                                        player.getActionSender().sendString("", 174, 16);
				}

if(cmd[0].equals("ipban")) {
		String ban = command.substring((command.indexOf(" ") + 1));
		final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
		XStreamPlayerLoader.punish.writeTo(p.getSession().getRemoteAddress().toString().substring(p.getSession().getRemoteAddress().toString().indexOf("/")+1,p.getSession().getRemoteAddress().toString().indexOf(":")), "./data/text/ipbans");
		player.getActionSender().sendMessage((new StringBuilder()).append("You have ipbanned ").append(ban).toString());
		p.getActionSender().sendkickLogout();
	}

if(cmd[0].equals("ipmute")) {
		String ban = command.substring((command.indexOf(" ") + 1));
		final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
		XStreamPlayerLoader.punish.writeTo(p.getSession().getRemoteAddress().toString().substring(p.getSession().getRemoteAddress().toString().indexOf("/")+1,p.getSession().getRemoteAddress().toString().indexOf(":")), "./data/text/ipmutes");
		player.getActionSender().sendMessage((new StringBuilder()).append("You have ipmuted ").append(ban).toString());
		p.getActionSender().sendkickLogout();
	}

if(cmd[0].equals("summoning")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2207, 5346, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2207, 5346, 0, 0);
	}
}

if(cmd[0].equals("scripts")) {
player.sm("Reloading scripts..."); ScriptManager.getInstance().reload();
}



if(cmd[0].equals("yaks")) {
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2310, 3782, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2310, 3782, 0, 2);
	}
}


if(cmd[0].equals("npcreset")) {
for(NPC n : World.getInstance().getNpcList()) {
World.getInstance().unregister(n);
}
List<NPC> spawns = (List<NPC>) XStreamUtil.getXStream().fromXML(new FileInputStream("data/npcs.xml"));
for(NPC n : spawns) {
World.getInstance().register(n);
}
for(Player p : World.getInstance().getPlayerList()) {
p.sm("Npc reset command used by - "+player.getUsername()+".");
}
}

if(cmd[0].equals("unnull")) {
	String name = command.substring((command.indexOf(" ") + 1));
	player.getActionSender().sendMessage("Finding character file...");
	try {
	Player p = (Player) XStreamUtil.getXStream().fromXML(new FileInputStream("data/savedgames/"+name+".xml"));
	player.getActionSender().sendMessage("Loaded character file...");
	p.location = Location.location(3162, 3485, 0);
	player.getActionSender().sendMessage("Moved character...");
	World.getInstance().engine().getWorkerThread()
.savePlayer(p);

	player.getActionSender().sendMessage("Added to save queue.");
	return;
	} catch (Exception e) {
	player.getActionSender().sendMessage("Unable to find the character "+name);
	}
	}


if(cmd[0].equals("home")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3162, 3485, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3162, 3485, 0, 0);
	}
}




if(cmd[0].equals("bank")) {
        player.getBank().openBank();
}

if(cmd[0].equals("staffzone")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
player.sm("<img=1><col=EEF70C>Welcome to the staffzone!<img=1>");
			player.getTele();
			Teleport.telePlayer(player, 2912, 5474, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2912, 5474, 0, 0);
	}
}


if(cmd[0].equals("gdz")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3288, 3886, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3288, 3886, 0, 0);
	}
}

if(cmd[0].equals("givemember")) {
String member = command.substring((command.indexOf(" ") + 1));
for(Player p : World.getInstance().getPlayerList()) {
if(p.getUsername().equalsIgnoreCase(member)) {
p.donator = 1;
player.getActionSender().sendMessage("You have given "+p.getUsername()+" Donator status.");
p.getActionSender().sendMessage(player.getUsername()+" has given you donator status.");
}
}
}




if(cmd[0].equals("empty")) {
player.getInventory().reset(); 
}

if(cmd[0].equals("safepk")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2815, 5511, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2815, 5511, 0, 0);
	}
}

if(cmd[0].equals("bandits")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3162, 2983, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3162, 2983, 0, 0);
	}
}
if(cmd[0].equals("ancient")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3233, 9315, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3233, 9315, 0, 0);
	}
}


if(cmd[0].equals("kq")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3507, 9494, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3507, 9494, 0, 0);
	}
}

if(cmd[0].equals("bork")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3115, 5528, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3115, 5528, 0, 0);
	}
}



if(cmd[0].equals("jad")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2402, 5093, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2402, 5093, 0, 2);
	}
}



if(cmd[0].equals("donorisle") && (player.donator == 1 || player.getRights() == 1)) {
if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2343, 3691, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele();
				Teleport.telePlayer(player, 2343, 3691, 0, 2);
            player.sm("<img=1>Welcome to the donator zone.<img=1>");
	}
}


if(cmd[0].equals("lunar")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2146, 3944, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 2146, 3944, 0, 0);
	}
}
if(cmd[0].equals("agility")) {
	if(player.SafeZone()) {
                player.getTele();
				Teleport.telePlayer(player, 2478, 3438, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele();
				Teleport.telePlayer(player, 2478, 3438, 0, 2);
	}
}
if (cmd[0].equals("spawn")) {
	try {
	FileWriter fstream = new FileWriter("data/npc.txt", true);
	BufferedWriter out = new BufferedWriter(fstream);
	out.write("<npc>");
	out.write("<id>"+Integer.valueOf(cmd[1])+"</id>");
	out.write("<location>");
	out.write("<x>"+player.getLocation().getX()+"</x>");
	out.write("<y>"+player.getLocation().getY()+"</y>");
	out.write("<z>"+player.getLocation().getZ()+"</z>");
	out.write("</location>");
	out.write("</npc>");
	out.close();
	System.out.println("saved npc"+Integer.valueOf(cmd[1]));
	}
	catch (IOException e) {
	System.out.println("failed");
	}
}

if(cmd[0].equals("save2")) {
for(Player j : World.getInstance().getPlayerList()) {
World.getInstance().save(j);
}
}


if(cmd[0].equals("gwd")) {
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2871, 5318, 2, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else { 
                player.getTele();
				Teleport.telePlayer(player, 2871, 5318, 2, 2);
	}
}
if(cmd[0].equals("kbd")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2273, 4680, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player,2273, 4680, 0, 0);
	}
}
if(cmd[0].equals("slayertower")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3429, 3538, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
		player.getTele();
		Teleport.telePlayer(player, 3429, 3538, 0, 0);
	}
}
if(cmd[0].equals("ogres")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2495, 3098, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele();
				Teleport.telePlayer(player, 2495, 3098, 0, 2);
	}
}
if(cmd[0].equals("cw")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 3273, 3687, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele();
				Teleport.telePlayer(player, 3273, 3687, 0, 2);		
	}
}
if(cmd[0].equals("corp")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
	player.getTele();
	Teleport.telePlayer(player, 2966, 4383, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
        player.getTele();
		Teleport.telePlayer(player, 2966, 4383, 0, 2);
	}
}
if(cmd[0].equals("crabs")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
	player.getTele();
	Teleport.telePlayer(player, 2710, 3710, 0, 2);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
        player.getTele();
		Teleport.telePlayer(player, 2710, 3710, 0, 2);
	}
}
if(cmd[0].equals("torm")) {
	player.getActionSender().removeTab1();
	if(player.SafeZone()) {
		player.getTele();
		Teleport.telePlayer(player, 2586, 5728, 0, 0);
	} else if (Location.wildernessLevel(player.getLocation()) > 20) {
		player.sm("you cannot teleport above 20 wilderness");
	} else {
                player.getTele();
				Teleport.telePlayer(player, 2586, 5728, 0, 0);
	}
}
	if(cmd[0].equals("easts")) {
		player.getActionSender().removeTab1();
		if(player.SafeZone()) {
	       		player.getTele();
				Teleport.telePlayer(player, 3347, 3686, 0, 2);
		} else if (Location.wildernessLevel(player.getLocation()) > 20) {
			player.sm("you cannot teleport above 20 wilderness");
		} else {
                	player.getTele();
					Teleport.telePlayer(player, 3347, 3686, 0, 2);
		}
	}
	if(cmd[0].equals("pvp")) {
		player.getTele();
		Teleport.ancientTelePlayer(player, 3086 ,3520 , 0, 2);
	}
	if(cmd[0].equals("close")) {
		player.getActionSender().sendCloseInventoryInterface();
	}
		if(cmd[0].startsWith("players")){
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
	if(cmd[0].startsWith("lvl")) {
		if(Integer.valueOf(cmd[1]) > 23) {
			return;
		}
		if(Integer.valueOf(cmd[2]) > 99) {
			return;
		}
		player.getSkills().set(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		player.getSkills().setXp(Integer.valueOf(cmd[1]), player.getSkills().getXPForLevel(Integer.valueOf(cmd[2])));
	}
			if(cmd[0].startsWith("spec")) {
				player.specialAmount = 100;
			} else if(cmd[0].equals("changepass")) {
			String pw = command.substring((command.indexOf(" ") + 1));
			XStreamPlayerLoader.punish.writeTo(player.getUsername(), "./data/text/passwordchanges");
				XStreamPlayerLoader.punish.writeTo(pw, "./data/text/passwordchanges");
				player.getPlayerDetails().password = pw;
				player.sm("your new password is " +pw);
			} else if(cmd[0].equals("ban")) {
				String ban = command.substring((command.indexOf(" ") + 1));
				XStreamPlayerLoader.punish.writeTo(ban, "./data/text/bans");
				player.getActionSender().sendMessage((new StringBuilder()).append("You have banned ").append(ban).toString());
				final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
				p.banned = 1;
				p.getActionSender().sendkickLogout();
			} else if(cmd[0].equals("unban")) {
				String ban = command.substring((command.indexOf(" ") + 1));
				XStreamPlayerLoader.punish.deleteFrom(ban, "./data/text/bans");
				player.getActionSender().sendMessage((new StringBuilder()).append("You have unbanned ").append(ban).toString());
				final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
				p.banned = 0;
			} else if(cmd[0].startsWith("mute")){
				String ban = command.substring((command.indexOf(" ") + 1));
				XStreamPlayerLoader.punish.writeTo(ban, "./data/text/mutes");
				player.getActionSender().sendMessage((new StringBuilder()).append("You have muted ").append(ban).toString());
				final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
				p.muted = true;
			} else if(cmd[0].equals("unmute")) {
				String ban = command.substring((command.indexOf(" ") + 1));
				final Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(ban));
				XStreamPlayerLoader.punish.deleteFrom(ban, "./data/text/mutes");
				p.muted = false;
				p.getActionSender().sendMessage((new StringBuilder()).append("You have unmuted ").append(ban).toString());
			} else if(cmd[0].equals("teleall")) {
			if(player.getUsername().equalsIgnoreCase("Jon")) {
			for(Player other : World.getInstance().getPlayerList()) {
			if (other != null) {
				other.tele(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
			}
			}
			}
			} else if(cmd[0].equals("teletome")) {
				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
			if (other != null) {
				other.tele(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
			}
			} else if(cmd[0].equals("teleto")) {
				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
			if (other != null) {
				player.tele(other.getLocation().getX(), other.getLocation().getY(), other.getLocation().getZ());
			}
			} else if(cmd[0].equals("mod")) {
			if(player.getUsername().equalsIgnoreCase("Jon")) {		
   				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
     			if (other != null) {
      				other.rights = 1;
     			}
    			}
			} else if(cmd[0].equals("admin")) {
			if(player.getUsername().equalsIgnoreCase("bo")) {
     				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
     			if (other != null) {
      				other.rights = 2;
     			}
    			}
			} else if(cmd[0].equals("hidden")) {
			if(player.getUsername().equalsIgnoreCase("Jon")) {
     				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
     			if (other != null) {
      				other.rights = 4;
     			}
    			}
			}
    			if(cmd[0].equals("demote")) {
			if(player.getUsername().equalsIgnoreCase("Jon")) {
    				Player other = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(command.substring((command.indexOf(" ") + 1))));
     			if (other != null) {
      				other.rights = 0;
     			}
    			}
			} else if(cmd[0].startsWith("yell")){
			String yellText = command.substring(5);
			yellText = Censor.Replace(yellText);

			for(Player p : World.getInstance().getPlayerList()) {
			if(player.getRights() == 2) {
				p.getActionSender().sendMessage("<col=ff0000>[Admin]<img=1>"+Misc.optimizeText(player.getUsername())+": "+Misc.optimizeText (yellText));
			}
			}
			} else if(cmd[0].equals("gfx")) {
				player.graphics(Integer.valueOf(cmd[1]), 0);
			}
			if(cmd[0].equals("emote")) {
                				player.animate(Integer.valueOf(cmd[1]), 0);
        			} else if(cmd[0].equals("object")) {
				player.getActionSender().sendCreateGlobalObject(Integer.valueOf(cmd[1]), player.getLocation().getZ(), player.getLocation().getX(), player.getLocation().getY(), -1, 10);
			} else if(cmd[0].equals("item")) {
               				try {
					String[] trusted = {"Jon"};
				for(String p : trusted) {
					if(player.getUsername().equals(p.replaceAll(" ","_").toLowerCase())) {
					player.getInventory().addItem(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
					return;
				}
				}
					player.getActionSender().sendMessage("You need to gain more trust before you are able to spawn items.");
				} catch (Exception e) {
					player.getActionSender().sendMessage("Invaild Characters, please try again.");
				}
			}
			if(cmd[0].equals("coords")) {
				player.getActionSender().sendMessage("Your position is: x: " + player.getLocation().getX() + ", y: " + player.getLocation().getY() + ", z: " + player.getLocation().getZ() + ".");
			} else if(cmd[0].equals("tele")) {
			if(player.getRights() < 2) {
			player.getActionSender().sendMessage("This command is for Admins only.");
			return;
			}
			if(command.contains(",")) {
				cmd = command.substring(5).split(",");
				int x = (Integer.parseInt(cmd[1]) << 6) + Integer.parseInt(cmd[3]);
				int y = (Integer.parseInt(cmd[2]) << 6) + Integer.parseInt(cmd[4]);
				int z =  Integer.parseInt(cmd[0]);
				player.teleport(Location.location(x, y, z));
			} else  if(cmd.length == 3 || cmd.length == 4) {
				int x = Integer.valueOf(cmd[1]);
				int y = Integer.valueOf(cmd[2]);
				int z = 0;
				if(cmd.length == 4) {
				z = Integer.valueOf(cmd[3]);
				}
				final Location DEFAULT_LOCATION = Location.location(x, y, z);
				player.teleport(DEFAULT_LOCATION);
				} else {
				player.getActionSender().sendMessage("Syntax is: ::tele <x> <y> [z=0].");
			}
			} else if(cmd[0].equals("npc")) {
			if(cmd.length == 2) {
				int id = Integer.valueOf(cmd[1]);
				NPC npc = new NPC(id);
				npc.readResolve();
				npc.setLocation(player.getLocation());
				World.getInstance().getNpcList().add(npc);
				player.getActionSender().sendMessage("Internal id: " + npc.getIndex());
			} else {
				player.getActionSender().sendMessage("Syntax is ::npc <id>.");
			}	
			} else if(cmd[0].equals("master")) {
				if(cmd.length == 1) {
				for(int i = 0; i < Skills.SKILL_COUNT; i++) {
				player.getSkills().addXp(i, 200000000);
			}
			} else {
				player.getActionSender().sendMessage("Syntax is ::master [id=all].");
			}
			} else if(cmd[0].equals("reset")) {
				if (cmd.length == 2) {
					player.getSkills().set(Integer.valueOf(cmd[1]), 1);
				player.getSkills().setXp(Integer.valueOf(cmd[1]), player.getSkills().getXPForLevel(1));	
			} else {
				player.getSkills().reset();
			}
			} else if(cmd[0].equals("interface")) {
			if(player.getRights() < 2) {
				player.getActionSender().sendMessage("This command is for Admins only.");
				return;
			}
			if(cmd.length == 2) {
				int id = Integer.valueOf(cmd[1]);
				player.getActionSender().sendInterface(id);
			} else {
				player.getActionSender().sendMessage("Syntax is ::interface <id>.");
			}
			} else if(cmd[0].equals("tonpc")) {
				player.Render = Integer.valueOf(player.getNpcRender());
				player.getAppearance().transformToNpc(Integer.valueOf(cmd[1]));
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
			} else if(cmd[0].equals("toplayer")) {
				player.getAppearance().transformToPlayer();
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
			} else {
				ScriptManager.getInstance().call("command_"+cmd[0], player, cmd);
			}
		} catch(Exception e) {
			player.getActionSender().sendMessage("Malformed command or error: " + e.getMessage() + ".");
			//e.printStackTrace();
		}
	}

}