package com.rs2hd.model;

/**
 * npc transform
 * @author Dragonkk 
 * dunno why using to players at entity XD
 *
 */
public class NpcSwitch {
	
	private int id;
	
	public NpcSwitch(int id) {
		this.id = id;
	}
	
	public int getNpcId() {
		try {
		return id;
		} catch(Exception e) {
		return -1;
		}	
	}

}
