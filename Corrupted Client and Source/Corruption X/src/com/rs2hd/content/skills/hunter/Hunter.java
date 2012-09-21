/**
 * Class Hunter.java
 *
 * Created on 4:42:23 PM, Jan 19, 2010
 */
package com.rs2hd.content.skills.hunter;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.GameEngine;
import com.rs2hd.model.World;

/**
 * Package <code>com.rs2hd.skills.hunter</code>
 *
 * @author 'Mystic Flow (Steven@rune-server.org)
 * 
 * @NOTE This should be created for each player... *sigh*
 * 
 * 
 */
@SuppressWarnings("unused")
public class Hunter {

	private final Player p;

	private final int maxTraps = 1;
	private int layedTraps = 0;

	public int trapId = -1;
	private boolean isTrapping = false;


	public Hunter(final Player p) {
		this.p = p;
	}

	/*public void setTrap(final int itemId) {
		if(!isTrapping) {
			if(!isTrap(itemId)) {
				return;
			}
			switch(itemId) {
				case 10006:
					trapId = 19175;
					break;
			}
			if(maxTraps <= layedTraps) {
				p.getActionSender().sendMessage("You don't have high enough Hunter level to set up more than " + maxTraps + " traps.");
				return;
			}
			if(layedTraps == -1) {
				layedTraps = 0;
			}
			isTrapping = true;
			p.animate(5208);
			p.getActionSender().sendMessage("You start setting up the trap..");
			World.getInstance().registerEvent(new Event(1700) {
				@Override
				public void execute() {
					TrapList.addTrap(p, p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), trapId);
					final Trap trap = TrapList.getTrap(p);
					if(trap == null) {
						stop();
						return;
					}
					p.getInventory().deleteItem(itemId, 1);
					p.getActionSender().createGloblaObject(trapId, trap.getZ(), trap.getX(), trap.getY(), 0, 10);
					layedTraps++;
					p.animate(-1);
					isTrapping = false;
					stop();
				}
			});
		}
	}
	public void dismantleTrap(final int objectId, final int x, final int y) {
		if(!isTrapping) {
			if(!isTrapObject(objectId)) {
				return;
			}
			//p.faceCoord(x, y);
			isTrapping = true;
			final Trap trap = TrapList.getTrap(p, Location.location(x, y, p.getLocation().getZ()));
			if(trap == null) {
				p.getActionSender().sendMessage("This is not your trap!");
				isTrapping = false;
				return;
			}
			p.animate(5207);
			p.getActionSender().sendMessage("You start dismantling the trap...");
			World.getInstance().registerEvent(new Event(1700) {
				@Override
				public void execute() {
					layedTraps--;
					final Trap trap = TrapList.getTrap(p, Location.location(x, y, p.getLocation().getZ()));
					if(trap == null) {
						stop();
						return;
					}
					//TODO Make delete object work =\
					p.getActionSender().createGloblaObject(-1, trap.getZ(), trap.getX(), trap.getY(), 0, 10);
					p.getActionSender().deleteObject(trap.getX(), trap.getY());
					TrapList.removeTrap(trap);
					p.animate(-1);
					isTrapping = false;
					switch(objectId) {
						case 19175:
							p.getInventory().addItem(10006, 1);
							break;
					}
					p.getActionSender().sendMessage("You dismantled your trap succesfully!");
					stop();
				}
			});
		}
	}*/
	private boolean isTrapObject(final int objectId) {
		switch(objectId) {
			case 19175: return true;
		}
		return false;
	}

	private boolean isTrap(final int itemId) {
		switch(itemId) {
			case 10006: return true;
		}
		return false;
	}

	public boolean isImp(final NPC n) {
		switch(n.getId()) {
			case 6055: return true;
		}
		return false;
	}
	public void catchImp(final NPC n) {
		try {
			if(!(p.getEquipment().get(3).getId() == 11259)) {
				p.getActionSender().sendMessage("You need a net to catch imps!");
				return;
			}
		} finally {
			p.getActionSender().sendMessage("You need a net to catch imps!");
		}
		switch(n.getId()) {
			case 6055://Baby imp
				if(!p.isAnimating()) {
					p.turnTo(n);
					p.animate(5209);
					World.getInstance().registerEvent(new Event(500) {
						@Override
						public void execute() {
							if(!n.isDead()) {
								n.setDead(true);
								n.setHidden(true);
								n.delete(n);
								p.getActionSender().sendMessage("You catch the baby impling!");
								p.getInventory().addItem(11238, 1);
								p.getSkills().addXp(21, 55);
							}
						}
					});
				}
				break;
		}
	}
	public boolean isTrapping() {
		return isTrapping;
	}
	public void setTrapping(final boolean b) {
		this.isTrapping = b;
	}
	public static int giveItems[] = {
		4151,4153
	};

	public static int giveItem(){
        	return giveItems[(int)(Math.random() * (double)giveItems.length)];
	}
}
