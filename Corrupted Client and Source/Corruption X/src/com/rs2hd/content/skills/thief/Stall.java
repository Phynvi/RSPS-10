package com.rs2hd.content.skills.thief;
/**
*
* @author Dragonkk
*/
public class Stall extends StallContainer {

    public Stall(int X, int Y, int stallStolen, int stall, int restoreD) {
        stallX = X;
        stallY = Y;
        StallStolen = stallStolen;
        stallId = stall;
        restoreDelay = restoreD;
        restoreDelay2 = -1;
    }

}
