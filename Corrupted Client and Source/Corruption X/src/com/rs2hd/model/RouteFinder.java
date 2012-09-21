package com.rs2hd.model;

import java.io.*;

import com.rs2hd.Constants;
import com.rs2hd.util.log.Logger;

public class RouteFinder {
	
	Player player;
	
	public boolean noclip = false;
	
	public RouteFinder(Player p) {
		this.player = p;
	}
	
	/**
	 * The x and y corners that make our path
	 */
	public short[] wayPointX = new short[Byte.MAX_VALUE];
	public short[] wayPointY = new short[Byte.MAX_VALUE];
	
	/**
	 * The map of a region that contains all object information for a certain mapregions height level.
	 * reload this when you enter a new mapregion or change heightlevels!
	 */
	public static int[][] regionMap = new int[104][104];
	
	/**
	 * The distance to a nod, with reference to the starting node.
	 */
	public short[][] distances = new short[104][104];
	
	/**
	 * The direction the node was found in, used for finding his parent.
	 */
	//public byte[][] directions = new byte[104][104];
	
	short checkX = 0;
	short checkY = 0;
	int  calculations = 0;
	short oldDir = 0;
	short newDir = 0;
	
	/**
	 * Calculates the route from point a to b
	 * @param startX the starting x
	 * @param startY the starting y
	 * @param targetX the target x
	 * @param targetY the target y
	 * @param height The height of what you are clicking (0 for ground, 1 for players, n for npcs/objects)
	 * @param width The width of what you are clicking (0 for ground, 1 for player, n for npcs/objects)
	 * @return True if the a path exists
	 */
	public boolean calculateRoute(short startX, short startY, int targetX, int targetY, int height, int width) {
//removed richard work
	return false;
	}

	public void addStep() {
		//removed richard work
	}
	
	public void loadMap() {
		//removed richard work
	}

	
}

