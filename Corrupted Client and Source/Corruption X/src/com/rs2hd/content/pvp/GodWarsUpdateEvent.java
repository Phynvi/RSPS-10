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
public class GodWarsUpdateEvent extends Event {

	public GodWarsUpdateEvent() {
		super(2000);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p.godWarsDung() || p.saraChamber() || p.graardorChamber() || p.armadylChamber() || p.armadylChamber1()) {
				p.getActionSender().sendString(""+p.godWarsKills[1]+"", 601, 6);
				p.getActionSender().sendString(""+p.godWarsKills[2]+"", 601, 7);
				p.getActionSender().sendString(""+p.godWarsKills[4]+"", 601, 8);
				p.getActionSender().sendString(""+p.godWarsKills[3]+"", 601, 9);
				p.getActionSender().sendTab(6, 601);
			} else if(p.zammyChamber()) {
				p.getActionSender().sendString(""+p.godWarsKills[1]+"", 598, 6);
				p.getActionSender().sendString(""+p.godWarsKills[2]+"", 598, 7);
				p.getActionSender().sendString(""+p.godWarsKills[4]+"", 598, 8);
				p.getActionSender().sendString(""+p.godWarsKills[3]+"", 598, 9);
				p.getActionSender().sendTab(6, 598);
			} else {
				p.getActionSender().removeTab1();
					}
				}
			}

		}