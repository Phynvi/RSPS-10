package com.rs2hd.model;

/**
 * Holds data for a single animation request.
 * @author Graham
 *
 */
public class Animation {
	
	private int id, delay;
	
	public Animation(int id, int delay) {
		this.id = id;
		this.delay = delay;
	}
	
	public int getId() {
		try {
		return id;
		} catch(Exception e) {
		return -1;
		}	
	}
	
	public int getDelay() {
		try {
		return delay;
		} catch(Exception e) {
		return 0;
		}	
	}

}
