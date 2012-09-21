package com.rs2hd.content.skills.fishing;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
/**
*
* @author Dragonkk realy good but gotta remake cuz could be done better. Not added all spots and fishes sry
*/
public class fish {
	private transient Player  p;
	public transient int thisFishType = 0;
	public transient int thisFishCoordX = 0;
	public transient int thisFishCoordY = 0;
	public transient int reqLevels = 1;
	public transient int FishEmote = -1;
	public transient boolean isFishing = false;
	public transient int FishTimer = -1;
	public fish(Player p) {
		this.p = p;
	}
	private int getAmountFish() {
		switch(thisFishType) { //for option2 normal.. first option its id+10000
		case 6267:
			reqLevels = 40;
			FishEmote = 619;
		return 20;
		case 320:
			reqLevels = 0;
			FishEmote = 621;
		return 15;
		case 322: //shark
			reqLevels = 76;
			FishEmote = 618;
		return 25;
		case 10322:
			reqLevels = 16;
			FishEmote = 620;
		return 25;
		default:
		reqLevels = 1;
		FishEmote = 621;
		return 3;
		}
	}
	public boolean fishRequeriment() {
		int weaponId = 0;
		switch(thisFishType) {
		case 6267:
		weaponId = 301;
		break;
		case 320:
		weaponId = 303;
		break;
		case 322: //harpon fish
		weaponId = 311;
		break;
		case 10322: //big net fish
		weaponId = 305;
		break;
		default:
		StopFishing();
		return false;
		}

if (p.getInventory().getFreeSlots() == 0){
			p.sm("Not enough space in your inventory.");
			StopFishing();
			return false;	
		}
		if (!p.getInventory().contains(weaponId,1)) {
			p.sm("You need a "+ItemDefinition.forId(weaponId).getName()+" to fish here.");
			StopFishing();
			return false;	
		}
		if (p.getSkills().getLevel(10) < reqLevels) {
		p.sm("You need to be at least level "+reqLevels+" Fishing to fish here.");
		StopFishing();
		return false;	
		}
		return true;
		
	}
	public  void TryStartFishing(int npcId, NPC Nfish) {
		int walkX = Nfish.getLocation().getX();
		int walkY = Nfish.getLocation().getY();
		if (isFishing)
		return;
		thisFishType = npcId;
		GameEngine.FishSpotLive.addFish(walkX,walkY,getAmountFish(),Nfish);
		if (!fishRequeriment())
		return;
		thisFishCoordX = walkX;
		thisFishCoordY = walkY;
		StartFishing(Nfish);
	}
	public void PlayerFishProcess() {
		World.getInstance().registerEvent(new Event(600) {
			public void execute() {
			if (p == null || !World.getInstance().isOnline(p.getUsername())) {
				this.stop();
			return;
			}
			if (!isFishing || !fishRequeriment()) {
				FishTimer = -1;
				StopFishing();
				this.stop();
			}
			
				if (FishTimer > 0) {
					FishTimer--;
				p.animate(FishEmote);
				}
				if (FishTimer == 0){
				CheckFish();
				this.stop();
				}
			}
			});
	}
	public  void StartFishing(NPC n) {
		p.turnTo(n);
		if (!isFishing && fishRequeriment()) {
			isFishing = true;
			//FishTimer = Misc.random(getFishTimer())+3;
			FishTimer = Misc.random(10)+reqLevels - Misc.random(p.getSkills().getLevel(10)/2);
			p.sm("You start fishing.");
			PlayerFishProcess();
		}
	}
	public  void CheckFish() {
		if (isFishing || fishRequeriment()) {
			FishTimer = Misc.random(getFishTimer())+3;
			int fishid = fishId();
			GameEngine.FishSpotLive.removeFish(p, addFishXp(fishid), fishid);
			PlayerFishProcess();
		}
	}
	public int getFishTimer() {
		int lvlB = p.getSkills().getLevel(10) / 6;
		switch(thisFishType) {
		/*case 235:
		return 26-lvlB;
		case 234:
		return 28-lvlB;
		case 236:
		return 30-lvlB;*/
		case 6267:
		return 40-lvlB;
		case 322: 
		return 76-lvlB;
		case 10322: 
		return 16-lvlB;
		case 320:
		return 1-lvlB;
		}
		return 0;
		} 
private int fishId() {
int ItemFished[] = {995};
switch(thisFishType) {
case 320:
ItemFished = new int[]{317,321};
break;
case 6267:
ItemFished = new int[]{377};
break;
case 322:
ItemFished = new int[]{359,371,383};
break;
case 10322:
ItemFished = new int[]{353,405,1061,1059,407,401};
if (p.getSkills().getLevel(10) >= 23)
ItemFished = new int[]{353,405,1061,1059,407,401,341};
if (p.getSkills().getLevel(10) >= 46)
	ItemFished = new int[]{353,405,1061,1059,407,401,341,363};
break;
}
return ItemFished[(int)(Math.random()*ItemFished.length)];
}
private int addFishXp(int FishId) {
int addFishXP = 0;
switch(FishId) {
case 353:
	addFishXP = 220;
break;
case 321:
case 319:
	addFishXP = 150;
break;
case 405:
case 1061:
case 1059:
case 401:
	addFishXP = 200;
break;
case 407:
	addFishXP = 210;
break;
case 341:
	addFishXP = 250;
break;
case 383:
	addFishXP = 810;
break;
case 371:
	addFishXP = 600;
break;
case 377:
	addFishXP = 500;
break;
case 359:
case 363:
	addFishXP = 380;
break;
}
return addFishXP;
}
	public void StopFishing() {
		FishTimer = -1;
		thisFishType = 0;
		thisFishCoordX = 0;
		thisFishCoordY= 0;
		isFishing = false;
		reqLevels = 0;
		FishEmote = -1;
		p.animate(FishEmote);
		p.turnTo(p);
		
	}
	
}
