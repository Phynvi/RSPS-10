package com.rs2hd.model;

import com.rs2hd.content.SkullUpdateEvent;

/**
 * Manages head icons.
 * @author Graham
 *
 */
// TODO needs recoding
// TODO !!IMPORTANT!! SAVE THIS SOMEHOW! (e.g. skullTimeRemaining???)
// TODO prayer icon support
public class HeadIcons {
	
	private boolean isSkulled = false;
	private int skullCyclesRemaining = 0;
	
	public int getPkIcon() {
		return isSkulled? 0 : -1;
	}
public int getPrayerIcon(Player p) {
if (p.PROTECTFROMMELEE == true) {
return 0;
}
if (p.PROTECTFROMMISSELES == true) {
return 1;
}
if (p.PROTECTFROMMAGIC == true) {
return 2;
}
if (p.SMITE == true) {
return 4;
}
if (p.REDEMPTION == true) {
return 5;
}
if (p.RETRIBUTION == true) {
return 3;
}
return -1;
}


	public boolean isSkulled() {
		return isSkulled;
	}

	public void setSkulled(boolean b) {
		try {
		isSkulled = b;
		if(isSkulled == false) {
			skullCyclesRemaining = 0;
		} else {
			skullCyclesRemaining = 900000 / SkullUpdateEvent.TIME;;
		}
		} catch(Exception e) {
		}
	}
	
	public void renewSkull() {
		try {
		skullCyclesRemaining = 900000 / SkullUpdateEvent.TIME;
		} catch(Exception e) {
		}
	}
	
	public void decCycle() {
		try {
		skullCyclesRemaining--;
		} catch(Exception e) {
		}
	}
	
	public boolean removeSkulls() {
		if(skullCyclesRemaining <= 0) {
			isSkulled = false;
			skullCyclesRemaining = 0;
			return true;
		}
		return false;
	}

}
