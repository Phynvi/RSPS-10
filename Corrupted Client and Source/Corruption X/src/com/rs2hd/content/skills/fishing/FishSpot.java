package com.rs2hd.content.skills.fishing;

import com.rs2hd.model.NPC;

/**
*
* @author Dragonkk
*/
public class FishSpot extends FishSpotContainer {

    public FishSpot(int X, int Y, int fishid, int amountD, NPC Fish) {
        fishX = X;
        fishY = Y;
        npcFishId = fishid;
        fishAmount = amountD;
        FullfishAmount = amountD;
        fish = Fish;
    }

}
