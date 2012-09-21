package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class PestControlUpdate extends Event {
	
	private Player p;
	
	public PestControlUpdate() {
		super(20000);
		//this.p = p;
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			p.getPest().timeLeft--;
			//p.getPest().refreshWaitingScreen();
			//if(p.getPest().timeLeft == 0) 
		}
		
	}

}
