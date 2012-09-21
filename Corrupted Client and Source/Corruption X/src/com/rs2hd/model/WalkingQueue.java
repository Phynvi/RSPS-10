package com.rs2hd.model;

import com.rs2hd.util.Misc;
import com.rs2hd.GameEngine;
import com.rs2hd.util.PathFinder.*;
import com.rs2hd.util.pathfinding.*;

/**
 * Handles walking.
 * @author Graham
 *
 */
public class WalkingQueue {
	
	public class Point {
		public int x;
		public int y;
		public int dir;
	}
	public transient int direction = -1;	
	private static final int SIZE = 50;
	
	public int wQueueReadPtr = 0;
	public int wQueueWritePtr = 0;
	public Point[] walkingQueue = new Point[SIZE];
	
	private Player entity;
	private boolean isRunning = false, isRunToggled = false;
	
	public boolean isRunToggled() {
		return isRunToggled;
	}
	
	public void setRunToggled(boolean isRunToggled) {
		try {
		this.isRunToggled = isRunToggled;
		} catch(Exception e) {
		}
	}
	
	public WalkingQueue(Player entity) {
		this.entity = entity;
		for(int i = 0; i < SIZE; i++) {
			walkingQueue[i] = new Point();
			walkingQueue[i].x   = 0;
			walkingQueue[i].y   = 0;
			walkingQueue[i].dir = -1;
		}
		reset();
	}
	
	public void setIsRunning(boolean isRunning) {
		try {
		this.isRunning = isRunning;
		} catch(Exception e) {
		}
	}
	
	public void reset() {
		try {
		walkingQueue[0].x   = entity.getLocation().getLocalX();
		walkingQueue[0].y   = entity.getLocation().getLocalY();
		walkingQueue[0].dir = -1;
		wQueueReadPtr = wQueueWritePtr = 1;
		} catch(Exception e) {
		}
	}

    public void addToWalkingQueue(int x, int y) {
		try {
		int diffX = x - walkingQueue[wQueueWritePtr - 1].x, diffY = y - walkingQueue[wQueueWritePtr - 1].y;
		int max = Math.max(Math.abs(diffX), Math.abs(diffY));
		for (int i = 0; i < max; i++) {
			if (diffX < 0)
				diffX++;
			else if (diffX > 0)
				diffX--;
			if (diffY < 0)
				diffY++;
			else if (diffY > 0)
				diffY--;
addStepToWalkingQueue(x - diffX, y - diffY);
		}
		} catch(Exception e) {
		}
	}

	public void addToWalkingQueueFollow(int x, int y) {
		try {
		int diffX = x - walkingQueue[wQueueWritePtr - 1].x, diffY = y - walkingQueue[wQueueWritePtr - 1].y;
		int max = Math.max(Math.abs(diffX), Math.abs(diffY));
		for (int i = 0; i < max; i++) {
			if (diffX < 0)
				diffX++;
			else if (diffX > 0)
				diffX--;
			if (diffY < 0)
				diffY++;
			else if (diffY > 0)
				diffY--;
int toQueX = x - diffX;
int toQueY = y - diffY;
if (toQueX != x || toQueY != y)
addStepToWalkingQueue(toQueX, toQueY);
		}
		} catch(Exception e) {
		}
	}	
	public void addStepToWalkingQueue(int x, int y) {
		try {
		int diffX = x - walkingQueue[wQueueWritePtr - 1].x, diffY = y - walkingQueue[wQueueWritePtr - 1].y;
		int dir = Misc.direction(diffX, diffY);
		if (wQueueWritePtr >= SIZE) {
			return;
		}
		if (dir != -1) {
			walkingQueue[wQueueWritePtr].x = x;
			walkingQueue[wQueueWritePtr].y = y;
			walkingQueue[wQueueWritePtr++].dir = dir;
		}
		} catch(Exception e) {
		}
	}
	public void getNextPlayerMovement() {
		try {
		entity.getSprites().setSprites(-1, -1);
		if(entity.getTeleportTo() != null) {
			reset();
			Location lastRegion = entity.getLocation();
			int rx = lastRegion.getRegionX();
			int ry = lastRegion.getRegionY();
			entity.setLocation(entity.getTeleportTo());
			entity.resetTeleportTo();
			entity.getUpdateFlags().setDidTeleport(true);
			if((rx-entity.getLocation().getRegionX()) >= 4 || (rx-entity.getLocation().getRegionX()) <= -4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			}
			if((ry-entity.getLocation().getRegionY()) >= 4 || (ry-entity.getLocation().getRegionY()) <= -4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			}
		} else {
			Location oldLocation = entity.getLocation();
			int walkDir = getNextWalkingDirection();
			int runDir  = -1;
			if (entity.Render != 0 && entity.RenderRunning == true)  
			runDir = getNextWalkingDirection();
			if((isRunning || isRunToggled) && entity.Render == 0) {
				if(entity.getRunEnergy() > 0) {
					runDir = getNextWalkingDirection();
					if(runDir != -1) {
						entity.setRunEnergy(entity.getRunEnergy() - 1);
					}
				} else {
					if(isRunToggled) {
						entity.getActionSender().sendConfig(173, 0);
						isRunToggled = isRunning = false;
					}
					isRunning = false;
				}
			}
			Location lastRegion = entity.getUpdateFlags().getLastRegion();
if(lastRegion == null) {
	return;
}
			int rx = lastRegion.getRegionX();
			int ry = lastRegion.getRegionY();
			if((rx-entity.getLocation().getRegionX()) >= 4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			} else if((rx-entity.getLocation().getRegionX()) <= -4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			}
			if((ry-entity.getLocation().getRegionY()) >= 4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			} else if((ry-entity.getLocation().getRegionY()) <= -4) {
				entity.getUpdateFlags().setDidMapRegionChange(true);
			}
			if(entity.getUpdateFlags().didMapRegionChange()) {
				if(walkDir != -1) {
					wQueueReadPtr--;
				}
				if(runDir != -1) {
					wQueueReadPtr--;
				}
				walkDir = -1;
				runDir = -1;
				entity.setLocation(oldLocation);
			}
			entity.getSprites().setSprites(walkDir, runDir);
		}
		} catch(Exception e) {
		}
	}
	
	private int getNextWalkingDirection() {
		if (wQueueReadPtr == wQueueWritePtr) {
			return -1;
		}
		int dir = walkingQueue[wQueueReadPtr++].dir;
		int xdiff = Misc.DIRECTION_DELTA_X[dir];
		int ydiff = Misc.DIRECTION_DELTA_Y[dir];
		
Location newLocation = Location.location(entity.getLocation().getX()+xdiff, entity.getLocation().getY()+ydiff, entity.getLocation().getZ());
		entity.setLocation(newLocation);
		return dir;
	}

	public boolean isRunning() {
		return isRunning;
	}

}
