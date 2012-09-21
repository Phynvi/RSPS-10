package com.rs2hd.content.skills.woodcutting;

import java.util.HashMap;
import java.util.Map;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
*
* @author Dragonkk
*/
public class TreeLive {

   public boolean running = true;
   public long lastUpdate;
   public int availTrees = 0;
   public static Map<Integer, TreeContainer> trees = new HashMap<Integer, TreeContainer>();
public void removeLog(Player p) {
int length = trees.size();
for (int i = 0; i < length; i++) {
TreeContainer tree = trees.get(i);
if (p.wc().myTreeX == tree.treeX && p.wc().myTreeY == tree.treeY)
tree.currLogs -= 1;
}
}

   public void addTree(int x, int y, int log, int stump, int tree, int rest) {
       if (!isTree(x, y)) {
           Tree newTree = new Tree(x, y, log, stump, tree, rest);
           trees.put(availTrees, newTree);
           availTrees++;
      }
     if (isTree(x, y))
           return;
   }

   public boolean isTree(int x, int y) {
	int length = trees.size();
       for (int i = 0; i < length; i++) {
           if (trees.containsKey(i)) {
               TreeContainer tree = trees.get(i);
               if (tree.treeX == x && tree.treeY == y) {
                   return true;
               }
               if (tree.treeX != x && tree.treeY != y) {
                  return false;
               }
           }
       }
       return false;

   }

   public void resetWC(int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
    if (p != null) {
    if (p.wc().isWoodcutting()) {
    if (p.wc().myTreeX == x && p.wc().myTreeY == y) {
    	p.wc().cancelWC();
                 }
              }
           }
        }
     }

public void removeTree(int x, int y, int id) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}

public void makeTree(int id, int x, int y) {
	for(Player p : World.getInstance().getPlayerList()) {
if (p != null) {
p.getActionSender().sendCreateObject(id, 0, x, y, -1, 10); //not global cuz it checks all players -.-
}
}
}
public void treesCheck(Player p) {
for (int i = 0; i < trees.size(); i++) {
        if (trees.containsKey(i)) {
            TreeContainer tree = trees.get(i);
            if (tree.isDead && tree.currLogs <= 0)
            p.getActionSender().sendCreateObject(tree.stumpId, 0, tree.treeX, tree.treeY, -1, 10);
        }
    }
}
   public void process() {
               for (int i = 0; i < trees.size(); i++) {
                   if (trees.containsKey(i)) {
                       TreeContainer tree = trees.get(i);
                       if (tree.currLogs <= 0 && !tree.isDead) {
                           resetWC(tree.treeX, tree.treeY);
                           tree.isDead = true;
		removeTree(tree.treeX, tree.treeY, tree.stumpId);
                           tree.restoreDelay2 = tree.restoreDelay;
                       }
                       if (tree.restoreDelay2 > 0 && tree.isDead) {
                           tree.restoreDelay2--;
                       }
                       if (tree.restoreDelay2 == 0 && tree.isDead) {
        tree.currLogs = tree.maxLogs;
		tree.isDead = false;
		makeTree(tree.treeId, tree.treeX, tree.treeY);
                       }
                   }
               }
           }
}
