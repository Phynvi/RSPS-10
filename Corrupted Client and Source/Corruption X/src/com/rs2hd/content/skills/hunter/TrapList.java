/**
 * Class Hunter.java
 *
 * Created on 4:42:23 PM, Jan 19, 2010
 */
package com.rs2hd.content.skills.hunter;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.GameEngine;
import com.rs2hd.model.World;

/**
 * Package <code>com.rs2hd.skills.hunter</code>
 *
 * @author 'Mystic Flow (Steven@rune-server.org)
 * 
 * @NOTE This should be created for each player... *sigh*
 * 
 * 
 */
@SuppressWarnings("unused")
public class TrapList {
	private static Player p;
	private static int setTraps;
	private static int trap;
	private static int trapX;
	private static int trapY;
	private static int trapZ;

	public static void addTrap(Player p, int trapX, int trapY, int trapZ, int trapId) {
	//if(setTraps == 0) {
		trap = trapId;
		trapX = TrapList.trapX;
		trapY = TrapList.trapY;
		trapZ = TrapList.trapZ;
	/*} else if(setTraps == 1) {
		trap1 = trapId+1;
		trap1X = trapX;
		trap1Y = trapY;
		trap1Z = trapZ;
	} else if(setTraps == 1) {
		trap2 = trapId+2;
		trap2X = trapX;
		trap2Y = trapY;
		trap2Z = trapZ;
	} else if(setTraps == 1) {
		trap3 = trapId+3;
		trap3X = trapX;
		trap3Y = trapY;
		trap3Z = trapZ;
	} else if(setTraps == 1) {
		trap4 = trapId+4;
		trap4X = trapX;
		trap4Y = trapY;
		trap4Z = trapZ;*/
	}	
	public static int getTrap(Player p) {
		return p.getHunter().trapId;
	}
	public static int getX() {
		return trapX;
	}
	public static int getY() {
		return trapY;
	}
	public static int getZ() {
		return trapZ;
	}
	public static void removeTrap(int trap) {
		trap = 0;
		trapX = 0;
		trapY = 0;
		trapZ = 0;
	}	
}
