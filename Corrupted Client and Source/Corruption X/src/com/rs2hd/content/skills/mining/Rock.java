package com.rs2hd.content.skills.mining;
/**
*
* @author Dragonkk
*/
public class Rock extends RockContainer {

    public Rock(int X, int Y, int ml, int rockMined, int rock, int restoreD) {
        rockX = X;
        rockY = Y;
        maxRocks = ml;
        currRocks = ml;
        rockMinedId = rockMined;
        rockId = rock;
        restoreDelay = restoreD;
        restoreDelay2 = -1;
    }

}
