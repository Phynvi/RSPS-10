package com.rs2hd.content.skills.prayer;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.event.Event;

public class Altar {
private Player player;
	public void handleAltar(final int itemId, int objectId) {
		switch(objectId) {
			case 409:
			switch(itemId) {
				case 536:
					player.sm("You sacrifice your bones to the gods....");
					player.animate(645);
					World.getInstance().registerEvent(new Event(1000) {
						public void execute() {
						player.sm("in return for some prayer exp.");
						player.getSkills().addXp(5, 5000);
						player.getInventory().deleteItem(itemId, 1);
						this.stop();
						}
					});
				break;
			}
		}
	}
}

