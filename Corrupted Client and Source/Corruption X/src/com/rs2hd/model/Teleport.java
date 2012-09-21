package com.rs2hd.model;

/**
 * An 'entity' in the game world.
 * @author Graham
 *
 */
public class Teleport {
	
	private Location location;
	private transient int index;
	private transient Location teleportTo = null;
	private transient Hits hits;
	
	public Teleport(int x, int y, int h) {
		this.location = Location.location(x, y, h);
	}
}