package com.rs2hd.content;

import com.rs2hd.event.*;
import com.rs2hd.util.Misc;
import com.rs2hd.model.Player;
import com.rs2hd.GameEngine;
import com.rs2hd.model.World;
import com.rs2hd.model.Location;

/** 
 * Teleport events here 
 * @author Steven
 */
public class Teleport {
	public static void telePlayer(final Player p, int x, int y, final int height, int distance) {
		if(p.isTeleBlocked) {
			p.sm("A magical force prevents you from teleporting.");
			return;
		}
		p.getActionSender().removeTab1();
	if(p.SafeZone()) {
		p.Attacking = false;
		//p.clickDelay = 2 + 2;
		if (distance > 0) {
			int type = Misc.random(1);
			int offset = Misc.random(distance);
			if (type == 1) {
				x += -offset;
			} else {
				x += offset;
			}
			type = Misc.random(1);
			offset = Misc.random(distance);
			if (type == 1) {
				y += -offset;
			} else {
				y += offset;
			}
		}
		final int endX = x;
		final int endY = y;
		p.getWalkingQueue().reset();
		p.animate(8939, 0);
		p.graphics(1576, 0);
		World.getInstance().registerEvent(new Event(1800) { 
			public void execute() {
				p.tele(endX, endY, height);
				p.animate(8941, 0);
				p.graphics(1577, 0);
				p.getActionSender().sendCloseChatboxInterface();
				p.getActionSender().removeTab();
				p.getActionSender().sendCloseInterface();
				this.stop();
			}
		});		
	} else if (Location.wildernessLevel(p.getLocation()) > 20) {
			p.sm("you cannot teleport above 20 wilderness");
	} else {
		p.Attacking = false;
		//p.clickDelay = 2 + 2;
		if (distance > 0) {
			int type = Misc.random(1);
			int offset = Misc.random(distance);
			if (type == 1) {
				x += -offset;
			} else {
				x += offset;
			}
			type = Misc.random(1);
			offset = Misc.random(distance);
			if (type == 1) {
				y += -offset;
			} else {
				y += offset;
			}
		}
		final int endX = x;
		final int endY = y;
		p.getWalkingQueue().reset();
		p.animate(8939, 0);
		p.graphics(1576, 0);
		World.getInstance().registerEvent(new Event(1800) { 
			public void execute() {
				p.tele(endX, endY, height);
				p.animate(8941, 0);
				p.graphics(1577, 0);
				p.getActionSender().sendCloseChatboxInterface();
				p.getActionSender().removeTab();
				p.getActionSender().sendCloseInterface();
				this.stop();
			}
		});
	}
}

	public static void ancientTelePlayer(final Player p, int x, int y, final int height, int distance) {
		if(p.isTeleBlocked) {
			p.sm("A magical force prevents you from teleporting.");
			return;
		}
		p.getActionSender().removeTab1();
			if(p.SafeZone()) {
		p.Attacking = false;
		//p.clickDelay = 2 + 2;
		if (distance > 0) {
			int type = Misc.random(1);
			int offset = Misc.random(distance);
			if (type == 1) {
				x += -offset;
			} else {
				x += offset;
			}
			type = Misc.random(1);
			offset = Misc.random(distance);
			if (type == 1) {
				y += -offset;
			} else {
				y += offset;
			}
		}
		final int endX = x;
		final int endY = y;
		p.getWalkingQueue().reset();
		p.animate(8939, 0);
		p.graphics(1681, 0);
		World.getInstance().registerEvent(new Event(1800) { 
			public void execute() {
				p.tele(endX, endY, height);
				p.animate(8941, 0);
				p.graphics(1681, 0);
				p.getActionSender().sendCloseChatboxInterface();
				p.getActionSender().removeTab();
				p.getActionSender().sendCloseInterface();
				this.stop();
				}
			});
		} else if (Location.wildernessLevel(p.getLocation()) > 20) {
			p.sm("you cannot teleport above 20 wilderness");
	} else {
		p.Attacking = false;
		//p.clickDelay = 2 + 2;
		if (distance > 0) {
			int type = Misc.random(1);
			int offset = Misc.random(distance);
			if (type == 1) {
				x += -offset;
			} else {
				x += offset;
			}
			type = Misc.random(1);
			offset = Misc.random(distance);
			if (type == 1) {
				y += -offset;
			} else {
				y += offset;
			}
		}
		final int endX = x;
		final int endY = y;
		p.getWalkingQueue().reset();
		p.animate(8939, 0);
		p.graphics(1681, 0);
		World.getInstance().registerEvent(new Event(1800) { 
			public void execute() {
				p.tele(endX, endY, height);
				p.animate(8941, 0);
				p.graphics(1681, 0);
				p.getActionSender().sendCloseChatboxInterface();
				p.getActionSender().removeTab();
				p.getActionSender().sendCloseInterface();
				this.stop();
				}
			});
		}
	}
}