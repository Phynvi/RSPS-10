package com.rs2hd.content.skills.slayer;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.util.Misc;
import com.rs2hd.model.World;
import com.rs2hd.model.NPCDefinition;

/**
 * Created by IntelliJ IDEA.
 * Author: Axed
 * From: Rune-server.org
 * Date: 03/01/2010
 * Time: 1:22:07 PM
 * Package: palidino76.rs2.Skills.SecondarySkills.Slayer
 */
@SuppressWarnings("unused")
public class Slayer {
	private Player p;
	public Slayer(Player p) {
		this.p = p;
	}	
	private int[]	 	SLAYER_MONSTERS_HIGH = {1267, 1615, 941,6215};
	private int[]	 	SLAYER_MONSTERS_MED = {};
	private int[]		SLAYER_MONSTERS_LOW = {};
	
	private static final int MAXIMUM_MONSTERS = 100;
	
	public boolean assignSlayerTask(Player p) {
			if(p.hasTask == false) {
			final int slayerNPC = getRandomNPC();
			final int slayerAmount = getRandomTask(MAXIMUM_MONSTERS);
			p.slayerNPC = slayerNPC;
			p.slayerAmount = slayerAmount;
			p.hasTask = true;
	    		p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9850, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(8275, 241, 2);
                	p.getActionSender().sendString("Duradel", 241, 3);
                	p.getActionSender().sendString("Your task is to kill "+slayerAmount+" "+NPCDefinition.forId(slayerNPC).getName()+".", 241, 4);
                	p.getActionSender().sendChatboxInterface(241);
			p.slayerMaster = 1;
			return true;
			} else {
	    		p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9850, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(8275, 241, 2);
                	p.getActionSender().sendString("Duradel", 241, 3);
                	p.getActionSender().sendString("You already have a task, your task is to kill "+p.slayerAmount+" "+NPCDefinition.forId(p.slayerNPC).getName()+".", 241, 4);
                	p.getActionSender().sendChatboxInterface(241);
			p.slayerMaster = 1;
			return false;
		}			
	}
	
	public boolean decreaseSlayerAmount() {
		if (p.hasTask && p.slayerAmount > 0) {
			p.getSkills().addXp(18, getExp());
			p.slayerAmount--;
			if (p.slayerAmount == 0) {
				p.hasTask = false;
				p.slayerNPC = -1;
				p.getActionSender().sendMessage("You have completed your slayer task, please return to your slayer master to get another...");
				
			}	
		}
		return true;
	}
	
	public int getRandomNPC() {
		return SLAYER_MONSTERS_HIGH[(int)(Math.random()*SLAYER_MONSTERS_HIGH.length)];
	}
	
	public int getRandomTask(int maximum) {
		return (Misc.random(maximum));
	}
	public int getExp() {
		switch(p.slayerNPC) {
			case 1267:
				return 3500;
                        case 6215:
				return 5500;     
			case 1615:
				return 8000;
			case 941:
				return 5000;
			default:
				return 1250;
		}
	}
	
	public String getCurrentTask() {
		if (p.slayerNPC == 0 && p.slayerAmount == 0 && p.hasTask == true) {
	    		p.getActionSender().sendChatboxInterface(241);
	    		p.getActionSender().animateInterface(9850, 241, 2);
	    		p.getActionSender().sendNPCOnInterface(8275, 241, 2);
                	p.getActionSender().sendString("Duradel", 241, 3);
                	p.getActionSender().sendString("Your task is to kill "+p.slayerAmount+" "+new NPC(p.slayerNPC).getDefinition().getName()+".", 241, 4);
                	p.getActionSender().sendChatboxInterface(241);
			p.slayerMaster = 1;
		} else if (p.slayerNPC != 0 && p.slayerAmount != 0 && p.hasTask) {
			return "You still need to kill "+p.slayerAmount+" "+new NPC(p.slayerNPC).getDefinition().getName()+"";
		} else if (p.slayerNPC != 0 && p.slayerAmount == 0 && p.hasTask) {
			return "You already completed your task.";
		} else if (!p.hasTask) {
		return "You don't have any slayer task yet.";
		}
		return "";
	}
	
}