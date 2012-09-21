package com.rs2hd.model;

/**
 * GlobalObject.java
 * @author Aeque
 *
 */
public class GlobalObject {

	private int id;
	private Location location;
	private int face;
	private int type;

	public int getId() {
		return id;
	}

	public Location getLocation() {
		return location;
	}

	public int getFace() {
		return face;
	}

	public int getType() {
		return type;
	}

	public GlobalObject clone() {
		return new GlobalObject(id, location, face, type);
	}

	public GlobalObject(int id, Location location) {
		this.id = id;
		this.location = location;
		this.face = 0;
		this.type = 10;
	}

	public GlobalObject(int id, Location location, int face) {
		this.id = id;
		this.location = location;
		this.face = face;
		this.type = 10;
	}

	public GlobalObject(int id, Location location, int face, int type) {
		this.id = id;
		this.location = location;
		this.face = face;
		this.type = type;
	}
}