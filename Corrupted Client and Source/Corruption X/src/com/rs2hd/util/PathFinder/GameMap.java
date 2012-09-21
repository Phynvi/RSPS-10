package com.rs2hd.util.PathFinder;

import com.rs2hd.util.pathfinding.Mover;
import com.rs2hd.util.pathfinding.TileBasedMap;
import java.awt.Dimension;

import java.io.*;
import java.util.StringTokenizer;


/**
 * The data map from our example game. This holds the state and context of each tile
 * on the map. It also implements the interface required by the path finder. It's implementation
 * of the path finder related methods add specific handling for the types of units
 * and terrain in the example game.
 * 
 * @author Kevin Glass
 */
@SuppressWarnings("unused")
public class GameMap implements TileBasedMap {
	/** The map width in tiles */
	public static final int WIDTH = 100;
	/** The map height in tiles */
	public static final int HEIGHT = 100;
	/** the amount of map areas */
	public static final int AREAS = 26;
	
	//public static final int OBJECT = (104*104);

	//public static final int WALL = 1;
	public static final int OBJECT = 1;

	public static final int WALL = (104*104);
	/** The terrain settings for each tile in the map */
	private int[][][] terrain = new int[AREAS][WIDTH][HEIGHT];
	/** The unit in each tile of the map */
	private int[][][] units = new int[AREAS][WIDTH][HEIGHT];
	/** Indicator if a given tile has been visited during the search */
	private boolean[][][] visited = new boolean[AREAS][WIDTH][HEIGHT];
	
	/**
	 * Create a new test map with some default configuration
	 */


	int[] xServArea = new int[AREAS];
	int[] yServArea = new int[AREAS];
	int currentAreas = -1;

	public int getAreaX(int x) {
		int areaX = x/100;
		return areaX*100;
	}

	public int getAreaY(int y) {
		int areaY = y/100;
		return areaY*100;
	}

	public int getAreaStartX(int x) {
		return x-(WIDTH/2);
	}
	
	public int getAreaStartY(int y) {
		return y-(HEIGHT/2);
	}

	public int getLocalX(int x) {
		int areaX = x/100;
		int localX = x-areaX*100;
		return localX;
	}

	public int getLocalY(int y) {
		int areaY = y/100;
		int localY = y-areaY*100;
		return localY;
	}

	public Dimension getArea(int n) {
		switch(n) {
		case 0:
			return new Dimension(3000, 3400);
		case 1:
			return new Dimension(3100, 3400);
		}	
		return null;
	}

	public GameMap() {
        try {
			FileInputStream fstream = new FileInputStream("data/objects/clip.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
				StringTokenizer st = new StringTokenizer(strLine);
				int i = 0;
				String x = "";
				String y = "";
				String w = "";
				String h = "";
				String t = "";
				while (st.hasMoreTokens()) {
					if(i == 0){x = st.nextToken();i++;}
					else if(i == 1){y = st.nextToken();i++;}
					else if(i == 2){w = st.nextToken();i++;}
					else if(i == 3){h = st.nextToken();i++;}
					else if(i == 4){t = st.nextToken();i++;}
					}
				fillArea(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(w), Integer.parseInt(h), 1);
				//fillArea(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(w), Integer.parseInt(h), Integer.parseInt(t));
				//System.out.println(strLine);
			}
			in.close();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
}


	public int getAreaN(int x, int y) {		
		int areaX = getAreaX(x);
		int areaY = getAreaY(y);

		for(int ax = 0; ax < currentAreas+1; ax++) {
			for(int ay = 0; ay < currentAreas+1; ay++) {
				if(xServArea[ax] == areaX && yServArea[ay] == areaY) {		
					return ax;					
				}
			}
		}
		return -1;
	}

	public int createArea(int x, int y) {
		int areaX = getAreaX(x);
		int areaY = getAreaY(y);


		if(currentAreas < AREAS && currentAreas < AREAS) {
			currentAreas++;
			xServArea[currentAreas] = areaX;
			yServArea[currentAreas] = areaY;
			return currentAreas;
		}		

		return -1;
	}


	/**
	 * Fill an area with a given terrain type
	 * 
	 * @param x The x coordinate to start filling at
	 * @param y The y coordinate to start filling at
	 * @param width The width of the area to fill
	 * @param height The height of the area to fill
	 * @param type The terrain type to fill with
	 */
	private void fillArea(int x, int y, int width, int height, int type) {	
			
		int areaX = getAreaX(x);
		int areaY = getAreaY(y);

		int locX = getLocalX(x);
		int locY = getLocalY(y);

		int area = getAreaN(areaX, areaY);	
		if(area == -1) {
			area = createArea(areaX, areaY);
			//System.out.println("Map: Created new area: "+area);
			if(area == -1) {
				System.out.println("Map: To many areas to create.");
				return;
			}
		}


		for (int xp=locX;xp<locX+width;xp++) {
			for (int yp=locY;yp<locY+height;yp++) {
				terrain[area][xp][yp] = type;
			}
		}
	}
	
	/**
	 * Clear the array marking which tiles have been visted by the path 
	 * finder.
	 */
	public void clearVisited() {
		for(int areas=0;areas<getAreas();areas++) {
			for (int x=0;x<getWidthInTiles();x++) {
				for (int y=0;y<getHeightInTiles();y++) {
					visited[areas][x][y] = false;
				}
			}
		}
	}
	
	/**
	 * @see TileBasedMap#visited(int, int)
	 */
	public boolean visited(int area, int x, int y) {
		return visited[area][x][y];
	}
	
	/**
	 * Get the terrain at a given location
	 * 
	 * @param x The x coordinate of the terrain tile to retrieve
	 * @param y The y coordinate of the terrain tile to retrieve
	 * @return The terrain tile at the given location
	 */
	public int getTerrain(int area, int x, int y) {
		return terrain[area][x][y];
	}
	
	/**
	 * Get the unit at a given location
	 * 
	 * @param x The x coordinate of the tile to check for a unit
	 * @param y The y coordinate of the tile to check for a unit
	 * @return The ID of the unit at the given location or 0 if there is no unit 
	 */
	public int getUnit(int area, int x, int y) {
		return units[area][x][y];
	}
	
	/**
	 * Set the unit at the given location
	 * 
	 * @param x The x coordinate of the location where the unit should be set
	 * @param y The y coordinate of the location where the unit should be set
	 * @param unit The ID of the unit to be placed on the map, or 0 to clear the unit at the
	 * given location
	 */
	public void setUnit(int area, int x, int y, int unit) {
		units[area][x][y] = unit;
	}
	
	/**
	 * @see TileBasedMap#blocked(int, int, int)
	 */
	public boolean blocked(int tx, int ty) {
		int area = getAreaN(tx, ty);
		int x = getLocalX(tx);
		int y = getLocalY(ty);
		return terrain[area][x][y] == WALL;
	}

	/**
	 * @see TileBasedMap#getCost(int, int, int, int, int)
	 */
	public float getCost(int area, int sx, int sy, int tx, int ty) {
		return 1;
	}

	/**
	 * @see TileBasedMap#getHeightInTiles()
	 */
	public int getHeightInTiles() {
		return WIDTH;
	}

	public int getAreas() {
		return AREAS;
	}

	/**
	 * @see TileBasedMap#getWidthInTiles()
	 */
	public int getWidthInTiles() {
		return HEIGHT;
	}

	/**
	 * @see TileBasedMap#pathFinderVisited(int, int)
	 */
	public void pathFinderVisited(int area, int x, int y) {
		visited[area][x][y] = true;
	}
	
	
}
