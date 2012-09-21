package com.rs2hd.event;

import com.rs2hd.model.Location;
import com.rs2hd.model.Player;

public abstract class CoordinateEvent {
	
	private Player player;
	private Location location;
	private Location oldLocation;
	private int failedAttempts = 0, distance = 0;
	private boolean reached = false;
	
	public CoordinateEvent(Player player, Location location) {
		this.player   = player;
		this.location = location;
	}
	
	public CoordinateEvent(Player player, Location location, int distance) {
		this.player   = player;
		this.location = location;
		this.distance = distance;
	}
	
	public void setLocation(Location location) {
		try {
		this.location = location;
		} catch(Exception e) {
		}
	}
	
	public int getDistance() {
		return distance;
	}

	public boolean hasReached() {
		return reached;
	}
	
	public void setReached(boolean reached) {
		try {
		this.reached = reached;
		} catch(Exception e) {
		}
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	
	public void incrementFailedAttempts() {
		try {
		failedAttempts++;
		} catch(Exception e) {
		}
	}
	
	public void setOldLocation(Location location) {
		try {
		this.oldLocation = location;
		} catch(Exception e) {
		}
	}
	
	public Location getOldLocation() {
		return this.oldLocation;
	}
	
	public Location getTargetLocation() {
		return this.location;
	}

	public abstract void run();

}
