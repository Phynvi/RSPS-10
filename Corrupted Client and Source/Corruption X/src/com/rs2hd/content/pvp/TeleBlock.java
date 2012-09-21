package com.rs2hd.content.pvp;

import com.rs2hd.model.*;
import com.rs2hd.util.Misc;
import com.rs2hd.GameEngine;
import com.rs2hd.event.*;
import com.rs2hd.model.World;

public class TeleBlock {

	public void checkForTeleBlock(Player p, Player p2) {
		if(!p2.isTeleBlocked) {
		        startTeleBlock(p2);
		} else {
			p.getActionSender().sendMessage("You're opponent is already teleblocked.");
		}
	}
	
	public void startTeleBlock(Player target) {
		target.getActionSender().sendMessage("You have been teleblocked.");
		startTeleBlockEvent(target);
	}
	
	public void startTeleBlockEvent(final Player target) {
		World.getInstance().registerEvent(new Event(180000) { 
			public void execute() {
				target.isTeleBlocked = false;
				//target.getActionSender().sendMessage("UnTbed.");
				this.stop();
			}
		});
	}
}