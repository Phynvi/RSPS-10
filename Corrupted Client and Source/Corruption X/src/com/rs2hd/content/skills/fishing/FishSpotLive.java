package com.rs2hd.content.skills.fishing;

import java.util.HashMap;
import java.util.Map;

import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
*
* @author Dragonkk
*/
public class FishSpotLive {
   public boolean running = true;
   public long lastUpdate;
   public int availSpots = 0;
   public static Map<Integer, FishSpotContainer> npcSpots = new HashMap<Integer, FishSpotContainer>();
public void removeFish(Player p, double giveXp, int itemid) {
int length = npcSpots.size();
for (int i = 0; i < length; i++) {
FishSpotContainer FishSpot = npcSpots.get(i);
if (p.fish().thisFishCoordX == FishSpot.fishX && p.fish().thisFishCoordY == FishSpot.fishY) {
if (!FishSpot.isDead && FishSpot.fishAmount > 0 && !FishSpot.IsReadytoMove) {
FishSpot.fishAmount -= 1;
p.sm("You fished an "+ItemDefinition.forId(itemid).getName()+".");
p.getInventory().addItem(itemid, 1);
p.getSkills().addXp(10, giveXp*10);
}
if(FishSpot.fishAmount <= 0) {
	FishSpot.isDead = true;
	process();
}
}
}
}
public void StopFish(int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
    if (p != null) {
    if (p.fish().thisFishCoordX == x && p.fish().thisFishCoordY == y) {
    	p.fish().StopFishing();
                 }
              }
           }
        }

   public void addFish(int x, int y, int amountofFish, NPC fish) {
       if (!theresSpot(x, y)) {
           FishSpot newStall = new FishSpot(x, y, fish.getId(), amountofFish, fish);
           npcSpots.put(availSpots, newStall);
           availSpots++;
      }
     if (theresSpot(x, y))
           return;
   }
   public void moveFishSpot(int x, int y, FishSpotContainer fishspot) {
               if (fishspot.isDead) {
            	   StopFish(fishspot.fishX, fishspot.fishY);
            	   int newCoordX = setCoordsXForFish(fishspot.fishX, fishspot.fishY);
            	   int newCoordY = setCoordsYForFish(fishspot.fishX, fishspot.fishY);
            	   fishspot.fishX = newCoordX;
            	   fishspot.fishY = newCoordY;
            	   fishspot.IsReadytoMove = true;
            	   fishspot.isDead = false;
            	   process();
               }	   
    }
private int setCoordsXForFish(int CoordX, int CoordY) {
if (CoordX == 3109 && CoordY == 3489)
	return 3108;
if (CoordX == 3108 && CoordY == 3487)
	return 3109;
if (CoordX == 3132 && CoordY == 3514)
	return 3128;
if (CoordX == 3128 && CoordY == 3511)
	return 3132;


	return CoordX;
}
private int setCoordsYForFish(int CoordX, int CoordY) {
if (CoordX == 3109 && CoordY == 3489)
	return 3487;
if (CoordX == 3108 && CoordY == 3487)
	return 3489;
if (CoordX == 3132 && CoordY == 3514)
	return 3511;
if (CoordX == 3128 && CoordY == 3511)
	return 3514;
	return CoordY;
}


   public boolean theresSpot(int x, int y) {
	int length = npcSpots.size();
       for (int i = 0; i < length; i++) {
           if (npcSpots.containsKey(i)) {
               FishSpotContainer fishspot = npcSpots.get(i);
               if (fishspot.fishX == x && fishspot.fishY == y) {
                   return true;
               }
               if (fishspot.fishX != x && fishspot.fishY != y) {
                  return false;
               }
           }
       }
       return false;

   }
public void stallsCheck(Player p) {
for (int i = 0; i < npcSpots.size(); i++) {
        if (npcSpots.containsKey(i)) {
            FishSpotContainer rock = npcSpots.get(i);
            //if (rock.isDead)
           // p.getActionSender().sendCreateObject(rock.StallStolen, 0, rock.fishX, rock.fishY, -1, 10);
        }
    }
}
   public void process() {
               for (int i = 0; i < npcSpots.size(); i++) {
                   if (npcSpots.containsKey(i)) {
                       FishSpotContainer spot = npcSpots.get(i);
                       if (!spot.IsReadytoMove && spot.isDead)
                           moveFishSpot(spot.fishX, spot.fishY, spot);
                       if (spot.IsReadytoMove && !spot.isDead) {
                    	   spot.fishAmount = spot.FullfishAmount;
                    	   spot.fish.teleport(Location.location(spot.fishX, spot.fishY,0));
                      	   spot.IsReadytoMove = false;
                       }
                   }
               }
           }
}
