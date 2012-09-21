package com.rs2hd.model;

/**
 * Appearance class
 * @author Graham
 *
 */
public class Appearance {
	
	public boolean asNpc   = false;
	public int     npcId   = -1;
	public int     gender  = 0;
	public int[]   look    = new int[7];
	public int[]   colour  = new int[5];
	
	public Appearance() {
		look[0] = 3; // Hair
		look[1] = 14; // Beard
		look[2] = 18; // Torso
		look[3] = 26; // Arms
		look[4] = 34; // Bracelets
		look[5] = 38; // Legs
		look[6] = 42; // Shoes
		colour[2] = 16;
		colour[1] = 16;
		for(int i = 0; i < 5; i++) {
			colour[2] = 16;
			colour[1] = 16;
			colour[0] = 3;
		}
	}
	
public void male() {
		try {
		look[0] = 3; // Hair
		look[1] = 14; // Beard
		look[2] = 18; // Torso
		look[3] = 26; // Arms
		look[4] = 34; // Bracelets
		look[5] = 38; // Legs
		look[6] = 42; // Shoes
		colour[2] = 16;
		colour[1] = 16;
		gender = 0;
		for(int i = 0; i < 5; i++) {
			colour[2] = 16;
			colour[1] = 16;
			colour[0] = 3;
		}
		} catch(Exception e) {
		}	
	}
public void female() {
		try {
                    		look[0] = 48; // Hair
                    		look[1] = 1000; // Beard
                    		look[2] = 57; // Torso
                    		look[3] = 64; // Arms
                    		look[4] = 68; // Bracelets
                    		look[5] = 77; // Legs
                    		look[6] = 80; // Shoes
                    		gender = 1;
		} catch(Exception e) {
		}
}
	
	public boolean isNpc() {
		return asNpc;
	}
	
	public int getNpcId() {
		try {
		return npcId;
		} catch(Exception e) {
		return -1;
		}
	}
	
	public int getGender() {
		return gender;
	}
	
	public int getLook(int id) {
		return look[id];
	}
	
	public int getColour(int id) {
		return colour[id];
	}
	
	public int[] getColours() {
		return colour.clone();
	}

	public void transformToPlayer() {
		asNpc = false;
	}

	public void transformToNpc(int i) {
		asNpc = true;
		npcId = i;
	}

}
