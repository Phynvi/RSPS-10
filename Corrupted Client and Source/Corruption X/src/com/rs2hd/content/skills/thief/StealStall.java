package com.rs2hd.content.skills.thief;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
/**
 * @author Dragonkk 100% better its hard not realy make it use events and not check every 1200sec
 *
 */
@SuppressWarnings("unused")
public class StealStall {
	private transient Player  p;
public int thisStallX = 0;
public int thisStallY = 0;


private transient int StallThiefLvl;
private transient double StallXpAmt;
private transient int StallId;
private transient int ItemStole;
private transient int EmptyStall;
private transient int StallRestTime;



	public StealStall(Player p) {
		this.p = p;
	}
	private int StoleItem() {
		int ItemStolen[] = {995};
		switch(StallId) {
		case 2561:
		ItemStolen = new int[]{1891,2309,1899};	
		break;	
		case 2560:
		ItemStolen = new int[]{950};	
		break;	
		case 2563:
		ItemStolen = new int[]{6814,958};
		break;	
		case 2565:
		ItemStolen = new int[]{442};
		break;	
		case 2564:
		ItemStolen = new int[]{2007};
		break;	
		case 2562:
		ItemStolen = new int[]{1623,1621, 1619, 1617};
		break;	
		}
		return ItemStolen[(int)(Math.random()*ItemStolen.length)];
	}
			
	public  void resetThief() {
		StallId = 0;
		StallRestTime = 0;
		EmptyStall = 0;
		StallThiefLvl = 0;
		StallXpAmt = 0;
		ItemStole = 0;
		
	}
	public  void StartSS(int thisStallId, int thisStallXX, int thisStallYY) {
		if (p.cantWalk == false && p.combatDelay == 0) {
		switch(thisStallId) {
		case 2561: //bakers stall
			StallRestTime = 3;
			EmptyStall = 4276;
			StallThiefLvl = 5;
			StallXpAmt = 16;
		break;
		case 2560: //silk stall
			StallRestTime = 8;
			EmptyStall = 4276;
			StallThiefLvl = 20;
			StallXpAmt = 24;
		break;
		case 2563: //fur stall
			StallRestTime = 16;
			EmptyStall = 4276;
			StallThiefLvl = 35;
			StallXpAmt = 36;
		break;
		case 2565: //silver stall
			StallRestTime = 30;
			EmptyStall = 4276;
			StallThiefLvl = 50;
			StallXpAmt = 54;
		break;
		case 2564: //spice stall
			StallRestTime = 80;
			EmptyStall = 4276;
			StallThiefLvl = 65;
			StallXpAmt = 81;
		break;
		case 2562: //gem stall
			StallRestTime = 180;
			EmptyStall = 4276;
			StallThiefLvl = 75;
			StallXpAmt = 16;			
		break;
		}
		if (p.getSkills().getLevel(17) < StallThiefLvl) {
			p.sm("You need to be level "+StallThiefLvl+" to steal from this stall.");
			return;
		}
		StallId = thisStallId;
		ItemStole = StoleItem();
		 thisStallX = thisStallXX;
		 thisStallY = thisStallYY;
		p.cantWalk = true;
		p.animate(881);
		
		GameEngine.StallLive.addStall(thisStallX,thisStallY, EmptyStall, StallId, StallRestTime);
		World.getInstance().registerEvent(new Event(600) {
			public void execute() {
		GameEngine.StallLive.removeItem(p, StallXpAmt, ItemStole);
		resetThief();
		this.stop();
			}
		});
		}
		}
	
}
