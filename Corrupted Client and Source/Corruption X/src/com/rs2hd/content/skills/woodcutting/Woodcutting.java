package com.rs2hd.content.skills.woodcutting;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
import com.rs2hd.util.log.Logger;
import com.rs2hd.GameEngine;
/**
*
* @author Dragonkk
*/
public class Woodcutting {
	private transient Player  p;

	public Woodcutting(Player p) {
		this.p = p;
	}
	
	public transient int WCType = 0;

	public transient boolean magic = false;
	public transient boolean yew = false;
	public transient boolean maple = false;
	public transient boolean willow = false;
	public transient boolean oak = false;
	public transient boolean reg = false;
	public transient int WCTimer = 0;
	public transient int myTreeX = 0;
	public transient int myTreeY = 0;
	public transient boolean UsingAdze = false;
	public transient int anim = -1;
	public transient int getAxeTime = -1;
	
	
	public  void StartWc(int thisTreeId, int thisTreeX, int thisTreeY) {
		
		
	int[] TreeId = {1282, 1276, 1277, 1278, 1279, 1280, 1281, 1308, 1307, 1309, 1306};
	int[] TreeRest = {8,  8,    8,    8,    8,    8,    15,   51,   72,   94,   121};
	int[] TreeLogsAmt = {1,1,   1,    1,    1,    1,    6,    10,   12,   11,   13};
	int[] TreeType = {1,  1,    1,    1,    1,    1,    2,    3,    6,    4,    5};
	myTreeX = thisTreeX;
	myTreeY = thisTreeY;
	for (int i = 0; i < TreeId.length; i++) {
		if (thisTreeId == TreeId[i]) {
			GameEngine.TreeLive.addTree(thisTreeX, thisTreeY, TreeLogsAmt[i], 3884, thisTreeId, TreeRest[i]);
			switchTree(thisTreeId, TreeType[i]);
		}
	}
	p.turnTo(32768 + thisTreeId);
	}
	@SuppressWarnings("unused")
	private Logger logger = Logger.getInstance();
	
	public void PlayerWcProcess() {
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
			if (!isWoodcutting()) {
				WCTimer = 0;
				this.stop();
			}
			
				if (WCTimer > 0) {
				WCTimer--;
				p.animate(anim);
				}
				if (WCTimer == 0){
				checkWC();
				this.stop();
				}
			}
			});
	}
	public boolean isWoodcutting() {
		if (magic) 
		return true;
		if (yew)
		return true;
		if (maple)
		return true;
		if (willow) 
		return true;
		if (oak) 
		return true;
		if (reg) 
		return true;
		return false;
		}

public boolean hasItem(int id) {
return p.getInventory().contains(id);
}

	public boolean hasAxe()
	{
		if (p.getEquipment().get(3) == null){
		if (hasItem(1351) || hasItem(1349) || hasItem(1353) || hasItem(1355) || hasItem(1357)|| hasItem(1361) || hasItem(1359) || hasItem(6739) || hasItem(13661))
			return true;	
		return false;
	}
	int axe = p.getEquipment().get(3).getDefinition().getId();
	if (hasItem(1351) || hasItem(1349) || hasItem(1353) || hasItem(1355) || hasItem(1357)|| hasItem(1361) || hasItem(1359) || hasItem(6739) || hasItem(13661))
	return true;
		switch (axe){
			case 1351://Bronze Axe
			case 1349://Iron Axe
			case 1353://Steel Axe
			case 1361://Black Axe
			case 1355://Mithril Axe
			case 1357://Adamant Axe
			case 1359://Rune Axe
			case 6739://Dragon Axe
			case 13661: //Inferno adze
			return true;
		}
		return false;
	}
	public boolean SetAxe(){
	anim = -1;
	UsingAdze = false;
	int wcLvl = p.getSkills().getLevel(8);
	if (p.getEquipment().get(3) == null){
		if (hasItem(6739) && wcLvl >= 61) {anim = 9992;getAxeTime = 13; return true;}
		if (hasItem(1359) && wcLvl >= 41) {anim = 9993;getAxeTime = 10; return true;}
		if (hasItem(1357) && wcLvl >= 31) {anim = 9994;getAxeTime = 7; return true;}
		if (hasItem(1355) && wcLvl >= 21) {anim = 9995;getAxeTime = 5; return true;}
		if (hasItem(1361) && wcLvl >= 10) {anim = 9996;getAxeTime = 4; return true;}
		if (hasItem(1353) && wcLvl >= 6) {anim = 9997;getAxeTime = 3; return true;}
		if (hasItem(1349) && wcLvl >= 1) {anim = 9998;getAxeTime = 2; return true;}
		if (hasItem(1351) && wcLvl >= 1) {anim = 9999;getAxeTime = 1; return true;}
		if (hasItem(13661) && wcLvl >= 61) {anim = 10227;getAxeTime = 13; UsingAdze = true; return true;}
	return false;
	}
	int axe = p.getEquipment().get(3).getDefinition().getId();
	switch(axe){
	case 6739://Dragon Axe
		if(wcLvl >= 61) {
		anim = 9992;
		getAxeTime = 13;
		return true;
		}
	case 1359://Rune Axe
		if(wcLvl >= 41) {
		getAxeTime = 10;
		anim = 9993;
		return true;
		}
	case 1357://Adamant Axe
		if(wcLvl >= 31) {
		getAxeTime = 7;
		anim = 9994;
		return true;
		}
	case 1355://Mithril Axe
		if(wcLvl >= 21) {
		getAxeTime = 5;
		anim = 9995;
		return true;
		}
	case 1361://Black Axe
		if(wcLvl >= 11) {
			getAxeTime = 4;
		anim = 9996;
		return true;
		}
	case 1353://Steel Axe
		if(wcLvl >= 6) {
		getAxeTime = 3;
		anim = 9997;
		return true;
	}
	case 1349://Iron Axe
		getAxeTime = 2;
		anim = 9998;
		return true;
	case 1351://Bronze Axe
		getAxeTime = 1;
		anim = 9999;
		return true;
	case 13661: //Inferno adze
		if(wcLvl >= 61) {
		getAxeTime = 13;
		UsingAdze = true;
		anim = 10227;
		return true;
		}
	default:
		if (hasItem(6739) && wcLvl >= 61) {anim = 9992;getAxeTime = 13; return true;}
		if (hasItem(1359) && wcLvl >= 41) {anim = 9993;getAxeTime = 10; return true;}
		if (hasItem(1357) && wcLvl >= 31) {anim = 9994;getAxeTime = 7; return true;}
		if (hasItem(1355) && wcLvl >= 21) {anim = 9995;getAxeTime = 5; return true;}
		if (hasItem(1361) && wcLvl >= 10) {anim = 9996;getAxeTime = 4; return true;}
		if (hasItem(1353) && wcLvl >= 6) {anim = 9997;getAxeTime = 3; return true;}
		if (hasItem(1349) && wcLvl >= 1) {anim = 9998;getAxeTime = 2; return true;}
		if (hasItem(1351) && wcLvl >= 1) {anim = 9999;getAxeTime = 1; return true;}
		if (hasItem(13661) && wcLvl >= 61) {anim = 10227;getAxeTime = 13; UsingAdze = true; return true;}
	break;
	}
	return false;
		}
	public boolean canUseAxe() {
		if (SetAxe() && hasAxe())
		return true;
		
		if (!SetAxe() && hasAxe()) {
		p.sm("You dont have level for use that axe.");
		return false;
		}
		if (!SetAxe() && !hasAxe()) {
		p.sm( "You need an axe to wood cut.");
		return false;
		}
		return false;
		}
public int reqLevels() {
switch (WCType) {
case 1:
return 1;
case 2:
return 15;
case 3:
return 30;
case 4:
return 60;
case 5:
return 75;
case 6: // Maple
return 45;
}
return 1;
}

public boolean hasLvlForWood() {
if (p.getSkills().getLevel(8) >= reqLevels()) {
return true;
}
if (p.getSkills().getLevel(8) < reqLevels()) {
p.sm( "You need a woodcutting level of " + reqLevels() + " to cut this tree.");
return false;
}
return false;
}

public void startWC() {
	if (!canUseAxe()) {
		cancelWC();
		return;
		}
		if (!hasLvlForWood()) {
			cancelWC();
		return;
		}
		if (p.getInventory().getFreeSlots() == 0){
		p.getActionSender().sendMessage("Not enough space in your inventory.");
		cancelWC();
		return;
		}
if (WCType == 1) {
magic = false;
yew = false;
maple = false;
willow = false;
oak = false;
reg = true;
}
if (WCType == 2) {
magic = false;
yew = false;
maple = false;
willow = false;
oak = true;
reg = false;
}
if (WCType == 3) {
magic = false;
yew = false;
maple = false;
willow = true;
oak = false;
reg = false;
}
if (WCType == 4) {
magic = false;
yew = true;
maple = false;
willow = false;
oak = false;
reg = false;
}
if (WCType == 5) {
magic = true;
yew = false;
maple = false;
willow = false;
oak = false;
reg = false;
}
if (WCType == 6) { // Maple
magic = false;
yew = false;
maple = true;
willow = false;
oak = false;
reg = false;
}
if (WCTimer == 0) {
	PlayerWcProcess();
}
WCTimer = wcTime(WCType);
}

public void switchTree(int objId, int treeType) {
	WCType = treeType;
		if (!canUseAxe()) {
		cancelWC();
		return;
		}
		if (!hasLvlForWood()) {
			cancelWC();
		return;
		}
		if (p.getInventory().getFreeSlots() == 0){
		p.getActionSender().sendMessage("Not enough space in your inventory.");
		cancelWC();
		return;
		}
startWC();
p.sm("You swing your axe at the tree.");
}

public boolean timerIsOver() {
if (WCTimer == 0)
return true;
return false;
}

    public int wcTime(int logType) { // 1 normal, 2 oak, 3 willow, 4 yew, 5 magic
        int time = 0;
        int treeTime = 0;
        int wcLvl = p.getSkills().getLevel(8);
        int newTime = -1;
        switch (logType) {
            case 1: // Regular Tree
                treeTime = 20;
                time = treeTime - wcLvl - Misc.random(getAxeTime) + Misc.random(3);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 2: // Oak Tree
                treeTime = 30;
                time = treeTime - wcLvl -  - Misc.random(getAxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 3: // Willow Tree
                treeTime = 60;
                time = treeTime - wcLvl -  - Misc.random(getAxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(5);
                } else {
                    newTime = time;
                }
                return newTime;
            case 4: // Yew Tree
                treeTime = 120;
                time = treeTime - wcLvl - Misc.random(getAxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(18);
                } else {
                    newTime = time;
                }
                return newTime;
            case 5: // Magic Tree
                treeTime = 150;
                time = treeTime - wcLvl - Misc.random(getAxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(22);
                } else {
                    newTime = time;
                }
                return newTime;
          case 6:
                treeTime = 83;
                time = treeTime - wcLvl - Misc.random(getAxeTime);
                if (time < 0) {
                    newTime = 0 + Misc.random(16);
                } else {
                    newTime = time;
                }
                return newTime;
        }
        return newTime;
    }
    	
public void addLogs(int logId) {
if (UsingAdze) {
int ProbFire = Misc.random(100);
if (ProbFire < 36) {
if (logId == 1511)
	p.getSkills().addXp(11, 40*50);
if (logId == 1521)
	p.getSkills().addXp(11, 60*50);
if (logId == 1519)
	p.getSkills().addXp(11, 90*50);
if (logId == 1517)
	p.getSkills().addXp(11, 135*50);
if (logId == 1515)
	p.getSkills().addXp(11, 202.5*50);
if (logId == 1513)
	p.getSkills().addXp(11, 303.75*50);
int offsetX = (p.getLocation().getX() - p.getLocation().getX()) * -1;
int offsetY = (p.getLocation().getY() - (p.getLocation().getY()-3)) * -1;
final Location LOG_LOCATION = Location.location(p.getLocation().getX(), p.getLocation().getY()-3, 0);
p.getActionSender().sendProjectile(p.getLocation(), LOG_LOCATION, offsetX, offsetY, 50, 82, 1776, 46, 31, p);
p.sm("Your heavy axe burned the logs.");
return;
}
}
p.getInventory().addItem(logId, 1);

}
public void checkWC() {
if (!isWoodcutting())
return;
if (!canUseAxe()) {
	cancelWC();
	return;
	}
	if (!hasLvlForWood()) {
		cancelWC();
	return;
	}
if (!timerIsOver())
return;
if (p.getInventory().getFreeSlots() == 0){
	p.getActionSender().sendMessage("Not enough space in your inventory.");
	return;
}
if (maple) {
p.sm("You cut some Maple logs.");
addLogs(1517);
p.getSkills().addXp(8, 100*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
if (magic) {
p.sm("You cut some Magic logs.");
addLogs(1513);
p.getSkills().addXp(8, 250*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
if (yew) {
p.sm("You cut some Yew logs.");
addLogs(1515);
p.getSkills().addXp(8, 175*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
if (willow) {
p.sm("You cut some Willow logs.");
addLogs(1519);
p.getSkills().addXp(8, 67.5*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
if (oak) {
p.sm("You cut some Oak logs.");
addLogs(1521);
p.getSkills().addXp(8, 37.5*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
if (reg) {
p.sm("You cut some logs.");
addLogs(1511);
p.getSkills().addXp(8, 25*50);
GameEngine.TreeLive.removeLog(p);
startWC();
}
}
public void cancelWC() {
magic = false;
yew = false;
maple = false;
willow = false;
oak = false;
reg = false;
myTreeX = 0;
myTreeY = 0;
p.turnTo(p);
p.animate(-1);
}


}
