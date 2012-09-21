package com.rs2hd.model;

import com.rs2hd.event.Event;
import com.rs2hd.util.Misc;

/**
 * Manages requests (trade, duel).
 * @author Graham
 *
 */
public class WalkTo {

	private Player player;
	public WalkTo(Player player) {
		this.player = player;
	}
	public void GoToPlayer(Player p , int target) {
		if (player.cantWalk == true)
			return;
if(p.frozen > 0) {
p.getActionSender().sendMessage("You are frozen!");
player.getWalkingQueue().reset();
return;
}
if(p.takingitem > 0) {
player.getWalkingQueue().reset();
return;
}
if (player.fish().isFishing) {
player.resetAttack();
player.fish().StopFishing();
}
if (player.wc().isWoodcutting()) {
	player.resetAttack();
	player.wc().cancelWC();
}
if (player.mn().isMining()) {
	player.resetAttack();
	player.mn().cancelMN();
}
player.getActionSender().forceWalk(2, target, 0);
	}
	public void GoToNpc(Player p , int target) {
		if (player.cantWalk == true)
			return;
if(p.frozen > 0) {
p.getActionSender().sendMessage("You are frozen!");
player.getWalkingQueue().reset();
return;
}
if(p.takingitem > 0) {
player.getWalkingQueue().reset();
return;
}
if (player.fish().isFishing) {
player.resetAttack();
player.fish().StopFishing();
}
if (player.wc().isWoodcutting()) {
	player.resetAttack();
	player.wc().cancelWC();
}
if (player.mn().isMining()) {
	player.resetAttack();
	player.mn().cancelMN();
}
player.getActionSender().forceWalk(1, target, 0);
	}
public void GoTo(Player p , int CoordX, int CoordY) {
		try {
			if (player.cantWalk == true)
				return;
if(p.frozen > 0) {
p.getActionSender().sendMessage("You are frozen!");
player.getWalkingQueue().reset();
return;
}
if(p.takingitem > 0) {
player.getWalkingQueue().reset();
return;
}
if (player.fish().isFishing) {
	player.resetAttack();
	player.fish().StopFishing();
	}
	if (player.wc().isWoodcutting()) {
		player.resetAttack();
		player.wc().cancelWC();
	}
	if (player.mn().isMining()) {
		player.resetAttack();
		player.mn().cancelMN();
	}
player.getWalkingQueue().reset();
int toX = CoordX  -  (p.getLocation().getRegionX() - 6) * 8;
int toY = CoordY  -  (p.getLocation().getRegionY() - 6) * 8;
int[][] path = findRoute(p, toX, toY);
if(path != null) {
for(int i=0; i<path.length; i++) {
p.getWalkingQueue().addToWalkingQueueFollow(path[i][0], path[i][1]);
}
}

		} catch(Exception e) {
		}
}	
public void WalkTo(Player p , int CoordX, int CoordY) {
	try {
if(p.frozen > 0) {
p.getActionSender().sendMessage("You are frozen!");
player.getWalkingQueue().reset();
return;
}
if(p.takingitem > 0) {
player.getWalkingQueue().reset();
return;
}
if (player.fish().isFishing) {
player.resetAttack();
player.fish().StopFishing();
}
if (player.wc().isWoodcutting()) {
	player.resetAttack();
	player.wc().cancelWC();
}
if (player.mn().isMining()) {
	player.resetAttack();
	player.mn().cancelMN();
}

player.getWalkingQueue().reset();
int toX = CoordX  -  (p.getLocation().getRegionX() - 6) * 8;
int toY = CoordY  -  (p.getLocation().getRegionY() - 6) * 8;
int[][] path = findRoute(p, toX, toY);
if(path != null) {
for(int i=0; i<path.length; i++) {
p.getWalkingQueue().addToWalkingQueue(path[i][0], path[i][1]);
}
}

	} catch(Exception e) {
	}
}	

	private int[][] findRoute(Entity t, int toX, int toY) {
		return new int[][] { new int[] { toX, toY } };
	}

}
