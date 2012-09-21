/**
 * Class AgilityHandler.java
 *
 * Created on 9:18:32 PM, Jan 17, 2010
 */
package com.rs2hd.skills.agility;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.skills.SkillInfo.Action;

/**
 * Package <code>com.rs2hd.skills.agility</code>
 *
 * @author 'Mystic Flow (Steven@rune-server.org)
 */
public class AgilityHandler {

	public static void handleObjects(final Player p, final int objectId) {
		p.getSkillInfo().activate(Action.AGILITY);
		switch(objectId) {
		case 2295://Agility Log
			//We constantly check if we are close...
			//TODO Make this work better, this has some bugs =[...
			if (!p.performingAgility) { 
				World.getWorld().registerEvent(new Event(1) {
					@Override
					public void execute() {
						if (!p.performingAgility) {
							p.performingAgility = true;
							this.setDelay(100);
						}
						if (!p.getSession().isConnected()) {
							stop();
							return;
						}
						if (p.getUpdateFlags().didTeleport()) {
							p.performingAgility = false;
							stop();
							return;
						}
						if (!p.getLocation().withinDistance(Location.location(2474, 3436, 0), 17)) {
							p.performingAgility = false;
							stop();
							return;
						}
						if (p.getX() == 2474 && p.getY() == 3436) {
							handleAgilityLog(p, objectId);
							this.stop();
						}
					}
				});
			}
			break;
		case 2285://Climbing net next to agility log
			World.getWorld().registerEvent(new Event(100) {
				@Override
				public void execute() {
					if (!p.getSession().isConnected()) {
						stop();
						return;
					}
					if (p.getUpdateFlags().didTeleport()) {
						stop();
						return;
					}
					if (!p.getLocation().withinDistance(Location.location(2476, 3426, 0), 10)) {
						stop();
						return;
					}
					int x = 2476;
					int y = 3426;
					if ((p.getX() == x && p.getY() == y) || (p.getX() == x-1 && p.getY() == y) || (p.getX() == x-2 && p.getY() == y) || (p.getX() == x-3 && p.getY() == y) || (p.getX() == x-4 && p.getY() == y) || (p.getX() == x-5 && p.getY() == y)) {
						handleObstacleNet1(p, objectId);
						this.stop();
					}
				}
			});
		case 2313://Climbing tree
		case 2312://Balance rope
		case 2314://Tree branch to climb down.
		case 2286://Obstacle net
		case 154://Obstacle Pipe

			break;
		}
	}

	private static void handleAgilityLog(final Player p, int objectId) {
		if (p.getX() == 2474 && p.getY() == 3436) {
			p.walkTo(p.getX(), p.getY() - 7);
		}
		World.getWorld().registerEvent(new Event(4690) {
			@Override
			public void execute() {
				p.performingAgility = false;
				this.stop();
			}
		});
	}
	private static void handleObstacleNet1(final Player p, int objectId) {
		int x = 2476;
		int y = 3426;
		if ((p.getX() == x && p.getY() == y) || (p.getX() == x-1 && p.getY() == y) || (p.getX() == x-2 && p.getY() == y) || (p.getX() == x-3 && p.getY() == y) || (p.getX() == x-4 && p.getY() == y) || (p.getX() == x-5 && p.getY() == y)) {
			p.animate(828);
			World.getWorld().registerEvent(new Event(1100) {
				public void execute() {
					p.teleport(Location.location(p.getX(), 3424, 1));
					this.stop();
				}
			});
		}
	}
}
