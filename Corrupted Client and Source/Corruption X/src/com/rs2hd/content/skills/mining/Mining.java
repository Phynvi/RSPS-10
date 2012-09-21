package com.rs2hd.content.skills.mining;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
/**
*
* @author Dragonkk
*/
public class Mining {
	private transient Player  p;

	public Mining(Player p) {
		this.p = p;
	}
	
	private transient int MNType = 0;
	private transient boolean[] ores = new boolean[22];
	/*0-rune essence
	 *1-clay
	 *2-copper ore
	 *3-tin ore
	 *4-limestone
	 *5-blurite ore
	 *6-iron ore
	 *7-elemental ore
	 *8-Daeyalt ore
	 *9-silver ore
	 *10-coal
	 *11-pure essence
	 *12-sandstone
	 *13-gold ore
	 *14-"Perfect" gold ore
	 *15-gem rock
	 *16-granite
	 *17-rubium ore
	 *18-mithril ore
	 *19-lunar ore
	 *20-adamantite ore
	 *21-runite ore
	 */
	public transient int MNTimer = 0;
	public transient int myRockX = 0;
	public transient int myRockY = 0;
	public transient int anim = -1;
	public transient int getPickaxeTime = -1;
	
	
	public  void StartMn(int thisRockId, int thisRockX, int thisRockY) {
		MNType = RockType(thisRockId);
	@SuppressWarnings("unused")
	int[] RockRest = {50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50};
	myRockX = thisRockX;
	myRockY = thisRockY;
	int quantity = 1;
	if (thisRockId == 2491) {
	quantity = 999999;
	}
	
	GameEngine.RockLive.addRock(thisRockX, thisRockY, quantity, 25371, thisRockId, 50); //RockRest[RockType(thisRockId)]
	switchRock(thisRockId);
	}
	public int RockType(int objId) {
		int[] rune_essence = {2491};
		int[] clay = {-1};
		int[] copper_ore = {11936,11937,11938,11960,11691, 11692};
		int[] tin_ore = {11933,11934,11935,11957,11958,11959};
		int[] limestone = {-1};
		int[] blurite_ore  = {-1};
		int[] iron_ore = {37307,37308,37309,11954,11955,11956};
		int[] elemental_ore = {-1};
		int[] daeyalt_ore = {-1};
		int[] silver_ore = {2311,37304,37305,37306};
		int[] coal = {11930,11931,11932};
		int[] pure_essence = {-1};
		int[] sandstone = {-1};
		int[] gold_ore = {37310,37312};
		int[] Perfectgold_ore = {-1};
		int[] gem_ore = {-1};
		int[] granite = {-1};
		int[] rubim_ore = {-1};
		int[] mithril_ore = {11942,11943,11944};
		int[] lunar_ore = {-1};
		int[] amadantite_ore = {11939,11941};
		int[] runite_ore = {14860,14859};
		for (int i = 0; i < rune_essence.length; i++) {
			if (objId == rune_essence[i])
			return 0;
			}
		for (int i = 0; i < clay.length; i++) {
			if (objId == clay[i])
			return 1;
			}					
		for (int i = 0; i < copper_ore.length; i++) {
			if (objId == copper_ore[i])
			return 2;
			}
		for (int i = 0; i < tin_ore.length; i++) {
			if (objId == tin_ore[i])
			return 3;
			}	
		for (int i = 0; i < limestone.length; i++) {
			if (objId == limestone[i])
			return 4;
			}	
		for (int i = 0; i < blurite_ore.length; i++) {
			if (objId == blurite_ore[i])
			return 5;
			}	
		for (int i = 0; i < iron_ore.length; i++) {
			if (objId == iron_ore[i])
			return 6;
			}	
		for (int i = 0; i < elemental_ore.length; i++) {
			if (objId == elemental_ore[i])
			return 7;
			}	
		for (int i = 0; i < daeyalt_ore.length; i++) {
			if (objId == daeyalt_ore[i])
			return 8;
			}	
		for (int i = 0; i < silver_ore.length; i++) {
			if (objId == silver_ore[i])
			return 9;
			}	
		for (int i = 0; i < coal.length; i++) {
			if (objId == coal[i])
			return 10;
			}	
		for (int i = 0; i < pure_essence.length; i++) {
			if (objId == pure_essence[i])
			return 11;
			}	
		for (int i = 0; i < sandstone.length; i++) {
			if (objId == sandstone[i])
			return 12;
			}	
		for (int i = 0; i < gold_ore.length; i++) {
			if (objId == gold_ore[i])
			return 13;
			}	
		for (int i = 0; i < Perfectgold_ore.length; i++) {
			if (objId == Perfectgold_ore[i])
			return 14;
			}	
		for (int i = 0; i < gem_ore.length; i++) {
			if (objId == gem_ore[i])
			return 15;
			}	
		for (int i = 0; i < granite.length; i++) {
			if (objId == granite[i])
			return 16;
			}	
		for (int i = 0; i < rubim_ore.length; i++) {
			if (objId == rubim_ore[i])
			return 17;
			}	
		for (int i = 0; i < mithril_ore.length; i++) {
			if (objId == mithril_ore[i])
			return 18;
			}	
		for (int i = 0; i < lunar_ore.length; i++) {
			if (objId == lunar_ore[i])
			return 19;
			}	
		for (int i = 0; i < amadantite_ore.length; i++) {
			if (objId == amadantite_ore[i])
			return 20;
			}	
		for (int i = 0; i < runite_ore.length; i++) {
			if (objId == runite_ore[i])
			return 21;
			}	
		return -1;
		}
	public void PlayerMnProcess() {
		World.getInstance().registerEvent(new Event(600) {
			public void execute() {
			if (p == null) {
				this.stop();
			return;
			}
			if (!World.getInstance().isOnline(p.getUsername())) {
				this.stop();
			return;
			}
			if (!isMining()) {
				MNTimer = 0;
				cancelMN();
				this.stop();
			}
			
				if (MNTimer > 0) {
				MNTimer--;
				p.animate(anim);
				}
				if (MNTimer == 0){
				checkMN();
				this.stop();
				}
			}
			});
	}
	public boolean isMining() {
		for (int oreId = 0; oreId < ores.length; oreId++) {
		if (ores[oreId] == true)
		return true;
		}
		return false;
	}
public boolean hasItem(int id) {
return p.getInventory().contains(id);
}

	public boolean hasPickaxe() {
		if (p.getEquipment().get(3) == null){
		if (hasItem(1275) || hasItem(1271) || hasItem(1273) || hasItem(1269) || hasItem(1267)|| hasItem(1265) || hasItem(13661) || hasItem(15259))
			return true;	
		return false;
	}
	int axe = p.getEquipment().get(3).getDefinition().getId();
	if (hasItem(1275) || hasItem(1271) || hasItem(1273) || hasItem(1269) || hasItem(1267)|| hasItem(1265) || hasItem(13661) || hasItem(15259))
		return true;	
		switch (axe){
			case 1275://Bronze Axe
			case 1271://Iron Axe
			case 1273://Steel Axe
			case 1269://Black Axe
			case 1267://Mithril Axe
			case 1265://Adamant Axe
			case 13661: //Inferno adze
			case 15259: //Dragon Pickaxe
			return true;
		}
		return false;
	}
	public boolean SetPickaxe(){
	anim = -1;
	int mnLvl = p.getSkills().getLevel(14);
	if (p.getEquipment().get(3) == null){
		if (hasItem(1275) && mnLvl >= 41) {anim = 10006;getPickaxeTime = 10; return true;}
		if (hasItem(1271) && mnLvl >= 31) {anim = 10005;getPickaxeTime = 7; return true;}
		if (hasItem(1273) && mnLvl >= 21) {anim = 10004;getPickaxeTime = 5; return true;}
		if (hasItem(1269) && mnLvl >= 6) {anim = 10003;getPickaxeTime = 3; return true;}
		if (hasItem(1267) && mnLvl >= 1) {anim = 10002;getPickaxeTime = 2; return true;}
		if (hasItem(1265) && mnLvl >= 1) {anim = 10001;getPickaxeTime = 1; return true;}
		if (hasItem(13661) && mnLvl >= 61) {anim = 10222;getPickaxeTime = 10; return true;}
	return false;
	}
	int axe = p.getEquipment().get(3).getDefinition().getId();
	switch(axe){
	case 1275://Rune Pickaxe
		if(mnLvl >= 41) {
		getPickaxeTime = 10;
		anim = 10006;
		return true;
		}
	case 1271://Adamant Pickaxe
		if(mnLvl >= 31) {
		getPickaxeTime = 7;
		anim = 10005;
		return true;
		}
	case 1273://Mithril Pickaxe
		if(mnLvl >= 21) {
		getPickaxeTime = 5;
		anim = 10004;
		return true;
		}
	case 1269://Steel Pickaxe
		if(mnLvl >= 6) {
		getPickaxeTime = 3;
		anim = 10003;
		return true;
	}
	case 1267://Iron Pickaxe
		getPickaxeTime = 2;
		anim = 10002;
		return true;
	case 1265://Bronze Pickaxe
		getPickaxeTime = 1;
		anim = 10001;
		return true;
	case 13661: //Inferno adze
		if(mnLvl >= 41) {
		getPickaxeTime = 10;
		anim = 10222;
		return true;
		}
	default:
		if (hasItem(1275) && mnLvl >= 41) {anim = 10006;getPickaxeTime = 10; return true;}
		if (hasItem(1271) && mnLvl >= 31) {anim = 10005;getPickaxeTime = 7; return true;}
		if (hasItem(1273) && mnLvl >= 21) {anim = 10004;getPickaxeTime = 5; return true;}
		if (hasItem(1269) && mnLvl >= 6) {anim = 10003;getPickaxeTime = 3; return true;}
		if (hasItem(1267) && mnLvl >= 1) {anim = 10002;getPickaxeTime = 2; return true;}
		if (hasItem(1265) && mnLvl >= 1) {anim = 10001;getPickaxeTime = 1; return true;}
		if (hasItem(13661) && mnLvl >= 61) {anim = 10222;getPickaxeTime = 10; return true;}
	break;
	}
	return false;
		}
	public boolean canUsePickaxe() {
		if (SetPickaxe() && hasPickaxe())
		return true;
		
		if (!SetPickaxe() && hasPickaxe()) {
		p.sm("You dont have level for use that pickaxe.");
		return false;
		}
		if (!SetPickaxe() && !hasPickaxe()) {
		p.sm( "You need an pickaxe to mine these rocks.");
		return false;
		}
		return false;
		}
public int reqLevels() {
int[] RockLvl = {1,1,1,1,10,10,15,20,20,20,30,30,35,40,40,40,45,46,55,60,70,85};
	return RockLvl[MNType];
}

public boolean hasLvlForOre() { 
if (p.getSkills().getLevel(14) >= reqLevels()) {
return true;
}
if (p.getSkills().getLevel(14) < reqLevels()) {
p.sm( "You need a mining level of " + reqLevels() + " to mine this rock.");
return false;
}
return false;
}

public void startMN() {
	if (!canUsePickaxe()) {
		cancelMN();
		return;
		}
	if (!hasLvlForOre()) {
		cancelMN();
	return;
	}
		if (p.getInventory().getFreeSlots() == 0){
		p.getActionSender().sendMessage("Not enough space in your inventory.");
		cancelMN();
		return;
		}
for (int oreId = 0; oreId < ores.length; oreId++)
	ores[oreId] = false;
ores[MNType] = true;
if (MNTimer == 0) {
	PlayerMnProcess();
}
MNTimer = mnTime(MNType);
}

public void switchRock(int objId) {
		if (!canUsePickaxe()) {
		cancelMN();
		return;
		}
		if (!hasLvlForOre()) {
			cancelMN();
		return;
		}
		if (p.getInventory().getFreeSlots() == 0){
		p.getActionSender().sendMessage("Not enough space in your inventory.");
		cancelMN();
		return;
		}
startMN();
p.sm("You swing you're pickaxe at the rock.");
}

public boolean timerIsOver() {
if (MNTimer == 0)
return true;
return false;
}

    public int mnTime(int oreType) {
        int time = 0;
        int rockTime = 0;
        int mnLvl = p.getSkills().getLevel(14);
        int newTime = -1;
        switch (oreType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 11:
                rockTime = 30;
                time = rockTime - mnLvl - Misc.random(getPickaxeTime) + Misc.random(3);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 16:
                rockTime = 50;
                time = rockTime - mnLvl -  - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 10://coal
                rockTime = 90;
                time = rockTime - mnLvl -  - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 13://gold
            case 14://gold
            case 15://gem
                rockTime = 100;
                time = rockTime - mnLvl -  - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(7);
                } else {
                    newTime = time;
                }
                return newTime;               
            case 18://mit
                rockTime = 130;
                time = rockTime - mnLvl -  - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(9);
                } else {
                    newTime = time;
                }
                return newTime;
            case 19://lunar
            case 20://adam
                rockTime = 175;
                time = rockTime - mnLvl - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(18);
                } else {
                    newTime = time;
                }
                return newTime;
            case 21: //rune
                rockTime = 240;
                time = rockTime - mnLvl - Misc.random(getPickaxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(22);
                } else {
                    newTime = time;
                }
                return newTime;
        }
        return newTime;
    }
    
public void checkMN() {
if (!isMining())
return;
if (!canUsePickaxe()) {
	cancelMN();
	return;
	}
	if (!hasLvlForOre()) {
		cancelMN();
	return;
	}
if (!timerIsOver())
return;
if (p.getInventory().getFreeSlots() == 0){
	p.getActionSender().sendMessage("Not enough space in your inventory.");
	return;
}
int[] OreId = {1436,434,436,438,3211,668,440,2892,9632,442,453,7936,6986,444,446,1619,6979,12630,447,9076,449,451};
double[] OreXp = {5,5,17.5,17.5,26.5,17.5,35,0,17.5,40,50,5,60,65,65,65,75,17.5,80,50,95,125};
	if (ores[MNType]) {
		GameEngine.RockLive.removeOre(p, OreXp[MNType]*50, OreId[MNType]);
		//cancelMN();
		startMN();
	}
}
public void cancelMN() {
MNType = -1;
myRockX = 0;
myRockY = 0;
p.animate(-1);
for (int oreId = 0; oreId < ores.length; oreId++) {
ores[oreId] = false;
}
}
}

