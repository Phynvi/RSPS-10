package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * Handles player+NPC healing.
 * @author Graham
 *
 */
public class HealEvent extends Event {

	public HealEvent() {
		super(60000);
	}

	@Override
	public void execute() {
try {
		for(Player p : World.getInstance().getPlayerList()) {
			if (p.getSkills().getLevelForXp(3) > p.getSkills().getLevel(3))
			p.heal(1);
if (p.specialAmount < 100) {
p.specialAmount += 25;
}
if (p.specialAmount > 100) {
p.specialAmount = 100;
}
for (int i = 0; i < 23; i++) {
if (p.getSkills().getLevel(i) > p.getSkills().getLevelForXp(i))
p.getSkills().set(i,p.getSkills().getLevel(i)-1);
}

}
		for(NPC n : World.getInstance().getNpcList()) {
			n.heal(1);
		}
		} catch(Exception e) {
		}
	}

}
