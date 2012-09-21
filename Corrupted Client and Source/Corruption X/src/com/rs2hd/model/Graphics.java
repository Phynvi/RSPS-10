package com.rs2hd.model;

/**
 * Represents 'still graphics'.
 * @author Graham
 *
 */
public class Graphics {
	
	private int id, delay;
	
	public Graphics(int id, int delay) {
		this.id = id;
		this.delay = delay;
	}
	
	public int getId() {
		try {
		return id;
		} catch(Exception e) {
		return 0;
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
