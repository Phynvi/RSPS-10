package com.rs2hd.content.skills.thief;

import java.util.HashMap;
import java.util.Map;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
*
* @author Dragonkk
*/
public class StallLive {

   public boolean running = true;
   public long lastUpdate;
   public int availStalls = 0;
   public static Map<Integer, StallContainer> stalls = new HashMap<Integer, StallContainer>();
public void removeItem(Player p, double giveXp, int stallitemid) {
int length = stalls.size();
for (int i = 0; i < length; i++) {
StallContainer stall = stalls.get(i);
if (p.SS().thisStallX == stall.stallX && p.SS().thisStallY == stall.stallY) {
if (!stall.isDead ) {
stall.IsReady = true;
p.combatDelay = 4;
p.sm("You stole an item from the stall.");
p.getInventory().addItem(stallitemid, 1);
p.getSkills().addXp(17, giveXp*10);
}
p.cantWalk = false;
}
}
}
/*public void FinishThief(int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
    if (p != null) {
    if (p.cantWalk) {
    if (p.SS().thisStallX == x && p.SS().thisStallY == y) {
    	p.cantWalk = false;
    	p.SS().thisStallX = 0;
    	p.SS().thisStallY = 0;
                 }
              }
           }
        }
     }*/

   public void addStall(int x, int y, int deletedMark, int rock, int rest) {
       if (!isRock(x, y)) {
           Stall newStall = new Stall(x, y, deletedMark, rock, rest);
           stalls.put(availStalls, newStall);
           availStalls++;
      }
     if (isRock(x, y))
           return;
   }

   public boolean isRock(int x, int y) {
	int length = stalls.size();
       for (int i = 0; i < length; i++) {
           if (stalls.containsKey(i)) {
               StallContainer stall = stalls.get(i);
               if (stall.stallX == x && stall.stallY == y) {
                   return true;
               }
               if (stall.stallX != x && stall.stallY != y) {
                  return false;
               }
           }
       }
       return false;

   }

public void removeStall(int x, int y, int id) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}

public void makeStall(int id, int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}
public void stallsCheck(Player p) {
for (int i = 0; i < stalls.size(); i++) {
        if (stalls.containsKey(i)) {
            StallContainer rock = stalls.get(i);
            if (rock.isDead)
            p.getActionSender().sendCreateObject(rock.StallStolen, 0, rock.stallX, rock.stallY, -1, 10);
        }
    }
}
   public void process() {
               for (int i = 0; i < stalls.size(); i++) {
                   if (stalls.containsKey(i)) {
                       StallContainer rock = stalls.get(i);
                       if (rock.IsReady && !rock.isDead) {
                           rock.isDead = true;
                          // FinishThief(rock.stallX, rock.stallY);
		removeStall(rock.stallX, rock.stallY, rock.StallStolen);
                           rock.restoreDelay2 = rock.restoreDelay;
                       }
                       if (rock.restoreDelay2 > 0 && rock.isDead) {
                           rock.restoreDelay2--;
                       }
                       if (rock.restoreDelay2 == 0 && rock.isDead) {
        rock.IsReady = false;
		rock.isDead = false;
		makeStall(rock.stallId, rock.stallX, rock.stallY);
                       }
                   }
               }
           }
}
