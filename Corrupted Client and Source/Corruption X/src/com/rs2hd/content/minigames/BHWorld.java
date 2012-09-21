package com.rs2hd.content.minigames;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.model.*;

/**
 * Level bountyhunter.
 * @author Dragonkk
 *
 */
public class BHWorld {
/*
public boolean isInLVLRange(Player p, Player t) {
if(p.getSkills().getCombatLevel() == t.getSkills().getCombatLevel()) {
return true;
}
return false;
}*/
	public static boolean isInLVLRange(Player p, Player p2) {
		int wildy = Math.min(Location.wildernessLevel(p.getLocation()), Location.wildernessLevel(p2.getLocation()));
		int levelDiff = Math.abs(p.getSkills().getCombatLevel() - p2.getSkills().getCombatLevel());
		if(wildy < levelDiff) {
			//p.getActionSender().sendMessage("You need to move deeper into the wilderness to attack this player.");
			return false;
		}
		return true;
	}


	public void getTargetfor(Player p) {
		if (p == null) {
			return;
		}
		if(p.isFullScreen()) {
			p.getActionSender().sendInterface(1, 746, 5, 591);
		} else {
			p.getActionSender().sendInterface(1, 548, 1, 591);
		}
		p.getActionSender().sendString("None", 591, 8);
		for(Player target : World.getInstance().getPlayerList()) {
			if(!target.inClanWars()) {
			return;
			}
			if (target == null || !target.inBounty || target == p) {
				continue;
			}
			if(target.bhTarget != 0 || p.bhTarget != 0) {
				continue;
			}
			if(!isInLVLRange(p, target)) {
				continue;
			}
			p.bhTarget = target.getIndex();
			target.bhTarget = p.getIndex();
			p.getActionSender().sendString(""+target.getUsername(), 591, 8);
    			//p.getActionSender().setHintIcon(10, p.bhTarget, 1, -1);
   //target.getActionSender().setHintIcon(10, p.bhTarget, 1, -1);
			p.sm("A target has been found for you.");
			target.getActionSender().sendString(""+p.getUsername(), 591, 8);
			target.sm("A target has been found for you.");
			return;
		}
		p.bhTarget = 0;
		p.sm("System will try find you a new target soon.");
	}


public void CheckTarget(Player p) {
if (p == null) {
return;
}
Player target = World.getInstance().getPlayerList().get(p.bhTarget);
if (target == null || target.bhTarget == 0) {
getNewTargetfor(p);
}
}


public void removeTargetfor(Player p) {
if (p == null) {
return;
}
if (p.bhTarget != 0)
p.sm("You've lost your target.");

p.bhTarget = 0;
p.getActionSender().sendString("None", 591, 8);
p.getActionSender().removeTab();
}
public void getNewTargetfor(Player p) {
if (p == null) {
return;
}
p.bhTarget = 0;
getTargetfor(p);
}




}