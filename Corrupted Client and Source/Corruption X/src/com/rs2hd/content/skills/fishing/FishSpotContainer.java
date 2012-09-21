package com.rs2hd.content.skills.fishing;

import com.rs2hd.model.NPC;

/**
*
* @author Dragonkk
*/
public abstract class FishSpotContainer {

    public int fishX = 0;
    public int fishY = 0;
    public int npcFishId = 0;
    public int fishAmount = 0;
    public int FullfishAmount = 0;
    public boolean isDead = false;
    public boolean IsReadytoMove = false;
    public NPC fish = null;

}

