package com.rs2hd.content.pvp;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.*;

/**
 * Handles Ep going up.
 * @author Carl
 *
 */
public class EpUpdateEvent extends Event {

	public EpUpdateEvent() {
		super(360000);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			if(!p.SafeZone()) {
				if (p.playerEp >= 90) {
					p.playerEp = 100;
					p.getActionSender().sendString("EP: "+p.playerEp+"%", 591, 9);
					return;
				}
				p.playerEp += 10;
				p.getActionSender().sendString("EP: "+p.playerEp+"%", 591, 9);
			}
		}
	}

}