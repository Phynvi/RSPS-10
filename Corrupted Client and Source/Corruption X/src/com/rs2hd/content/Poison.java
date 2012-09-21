package com.rs2hd.content;

import com.rs2hd.model.*;
import com.rs2hd.util.Misc;
import com.rs2hd.GameEngine;
import com.rs2hd.event.*;
import com.rs2hd.model.World;

public class Poison {

	public void checkForPoison(Player p, Player p2) {
		if(Misc.random(9) == 0) {
		  int dmg = 0;
			switch(p.getEquipment().get(3).getDefinition().getId()) {
				
			}
		        startPoison(p2, dmg);
		}
	}
	
	public void startPoison(Player target, int strength) {
		if(strength == 0 && target.poisonTicks > 0) {
			target.poisonTicks = 0;
		}
		if(strength*3 > target.poisonTicks) {
			target.poisonTicks = strength*3;
			target.getActionSender().sendMessage("You have been poisoned.");
			startPoisonEvent(target, strength);
		}
	}
	
	public void startPoisonEvent(final Player target, int strength) {
		World.getInstance().registerEvent(new Event(60000) { 
			public void execute() {
				/* Check if the variable has been changed by something outside the event (anti pots) */
				if(target.poisonTicks == 0) {
					target.getActionSender().sendMessage("Your poison has been cured.");
					this.stop();
					return;
				}
				target.hit(target.poisonTicks % 3 == 0 ? target.poisonTicks/3 : target.poisonTicks/3+1, Hits.HitType.POISON_DAMAGE);
				target.poisonTicks--;
				if(target.poisonTicks == 0) {
					target.getActionSender().sendMessage("The poison fades away.");
					this.stop();
				}
			}
		});
	}
}