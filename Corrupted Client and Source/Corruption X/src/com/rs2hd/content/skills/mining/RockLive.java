package com.rs2hd.content.skills.mining;

import java.util.HashMap;
import java.util.Map;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
*
* @author Dragonkk np ^^ gotta remake to dont check every 1200ms
*/
public class RockLive {

   public boolean running = true;
   public long lastUpdate;
   public int availRocks = 0;
   public static Map<Integer, RockContainer> rocks = new HashMap<Integer, RockContainer>();
public void removeOre(Player p, double giveXp, int oreid) {
int length = rocks.size();
for (int i = 0; i < length; i++) {
RockContainer rock = rocks.get(i);
if (p.mn().myRockX == rock.rockX && p.mn().myRockY == rock.rockY ) {
if (rock.currRocks > 0 && !rock.isDead) {
rock.currRocks -= 1;
p.sm("You mined the rock.");
p.getInventory().addItem(oreid, 1);
p.getSkills().addXp(14, giveXp);
}
}
}
}

   public void addRock(int x, int y, int log, int stump, int tree, int rest) {
       if (!isRock(x, y)) {
           Rock newRock = new Rock(x, y, log, stump, tree, rest);
           rocks.put(availRocks, newRock);
           availRocks++;
      }
     if (isRock(x, y))
           return;
   }

   public boolean isRock(int x, int y) {
	int length = rocks.size();
       for (int i = 0; i < length; i++) {
           if (rocks.containsKey(i)) {
               RockContainer rock = rocks.get(i);
               if (rock.rockX == x && rock.rockY == y) {
                   return true;
               }
               if (rock.rockX != x && rock.rockY != y) {
                  return false;
               }
           }
       }
       return false;

   }

   public void resetMining(int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
    if (p != null) {
    if (p.mn().isMining()) {
    if (p.mn().myRockX == x && p.mn().myRockY == y) {
    	p.mn().cancelMN();
                 }
              }
           }
        }
     }

public void removeRock(int x, int y, int id) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}

public void makeRock(int id, int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}
public void rocksCheck(Player p) {
for (int i = 0; i < rocks.size(); i++) {
        if (rocks.containsKey(i)) {
            RockContainer rock = rocks.get(i);
            if (rock.isDead && rock.currRocks <= 0)
            p.getActionSender().sendCreateObject(rock.rockMinedId, 0, rock.rockX, rock.rockY, -1, 10);
        }
    }
}
   public void process() {
               for (int i = 0; i < rocks.size(); i++) {
                   if (rocks.containsKey(i)) {
                       RockContainer rock = rocks.get(i);
                       if (rock.currRocks <= 0 && !rock.isDead && rock.maxRocks > -1) {
                           resetMining(rock.rockX, rock.rockY);
                           rock.isDead = true;
		removeRock(rock.rockX, rock.rockY, rock.rockMinedId);
                           rock.restoreDelay2 = rock.restoreDelay;
                       }
                       if (rock.restoreDelay2 > 0 && rock.isDead) {
                           rock.restoreDelay2--;
                       }
                       if (rock.restoreDelay2 == 0 && rock.isDead) {
        rock.currRocks = rock.maxRocks;
		rock.isDead = false;
		makeRock(rock.rockId, rock.rockX, rock.rockY);
                       }
                   }
               }
           }
}
