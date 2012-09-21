package com.rs2hd.content.skills.woodcutting;
/**
*
* @author Dragonkk
*/
public class Tree extends TreeContainer {

    public Tree(int X, int Y, int ml, int stump, int tree, int restoreD) {
        treeX = X;
        treeY = Y;
        maxLogs = ml;
        currLogs = ml;
        stumpId = stump;
        treeId = tree;
        restoreDelay = restoreD;
        restoreDelay2 = -1;
    }

}
