package com.rs2hd.content.skills.farming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Farming {
	
	private Player		p;
	
	private HashMap<Integer, Patch> patches = new HashMap<Integer, Patch>();
	
	
	
	public Farming(Player p) {
		this.p = p;
	}
	
	/*
	 * Configures patches for every player
	 */
	
	public void configurePatches() {
		/* FALADOR PATCHES */
		patches.put(7847, new Patch(3054, 3307, 0, 0, true)); // HERB PATCH
		patches.get(7847).setType(1);
	}
	
	/*
	 * Handles everything related to the patch
	 * @param treeID treeID is holding the objectID of the patch
	 */
	
	public boolean handlePatch(int patchID, int click, boolean itemUsed, int itemID) {
		
		/*
		 * Check if is using clicking on object
		 */
		
		if (click == 1 && !itemUsed) {
			inspectPlant(patches.get(patchID).getCurrentPlant(), patchID);
		} else if (click == 2 && !itemUsed) {
			//TODO: make it show up a guide
		}
		
		/*
		 * Check if using rake on a patch
		 */
		
		if(itemID == 5341 && itemUsed && isCompostObject(patchID)) {
			/*
			 * People are using rake, let's rake it
			 */
			
			if (patches.get(patchID).isRaked()) {
				p.getActionSender().sendMessage("This patch has already been raked!");
			} else if (!patches.get(patchID).isRaked()) {
				p.getActionSender().sendMessage("You start raking this patch");
				startRaking(patchID);
			}
			
		}
		
		return false;
	}
	
	/*
	 * Start raking event
	 */
	
	public void startRaking(final int patchID) {
		p.animate(2273);

		World.getInstance().registerEvent(new Event(2000) {
			public void execute() {
				if (patches.get(patchID).rakesLeft() > 0) {
				patches.get(patchID).decreaseRakes();
				p.getInventory().addItem(6032, 1);
				refreshPatch(patchID);
				this.stop();
				}
			}
		});
		
		final int currentRakes = patches.get(patchID).rakesLeft();
		
		World.getInstance().registerEvent(new Event (60000) {
			public void execute() {
				if (currentRakes == patches.get(patchID).rakesLeft()) {
					/*
					 * PATCH IS STILL THE SAME
					 */
					reGrowCompost(patchID);
				} else if (currentRakes != patches.get(patchID).rakesLeft()) {
					/*
					 * PATCH HAS BEEN CHANGED..
					 */
					this.stop();
				}
			}
		});
		
	}
	
	/*
	 * Regrows compost on a patch
	 */
	
	public void reGrowCompost(int patchID) {
		patches.get(patchID).increaseRakes();
		patches.get(patchID).setCurrentObject(getCompost(patchID));
		refreshPatch(patchID);
	}
	
	/*
	 * Refreshes a specific patch
	 */
	
	public void refreshPatch(int patchID) {
		if (patches.get(patchID).hasPlant() && patches.get(patchID).isRaked()) {
			p.getActionSender().sendCreateObject(getGrow(patchID), patches.get(patchID).getHeight(), patches.get(patchID).getX(), patches.get(patchID).getY(), 10, 10);
		} else if (!patches.get(patchID).hasPlant() && patches.get(patchID).isRaked()) {
			//TODO: Create an empty patch!
		} else if (!patches.get(patchID).isRaked()) {
			System.out.print("Compost ID:"+getCompost(patchID));
			p.getActionSender().sendCreateObject(getCompost(patchID), patches.get(patchID).getHeight(), patches.get(patchID).getX(), patches.get(patchID).getY(), 10, 10);
		}
	}
	
	
	/*
	 * Returns the 'inspect' function of a plant
	 */
	
	public String inspectPlant(int treeID, int patchID) {
		if (patches.get(patchID).hasPlant()) {
			return "This patch has a plant growing named: ";
		} else if (!patches.get(patchID).hasPlant()) {
			return "This patch is still fully of compost";
		}
		return "";
	}
	
	/*
	 * Returns tree time of a specific farming plant (in SECONDS)
	 * @param treeID Object ID of specific tree/plant
	 */
	
	public int getFarmTime(int treeID) {
		switch (treeID) {
			case 1337:
				return 60;
			
		}
		return -1;
	}
	
	
	private int getCompost(int treeID) {
		switch(patches.get(treeID).getType()) {
			case 1: /* FLOWER PATCH */
				System.out.println("Rakes left:"+patches.get(treeID).rakesLeft());
				return FarmingContainer.PATCH_FLOWER_COMPOST[patches.get(treeID).rakesToGo() - 1];
		}
		return -1;
	}
	
	private int getGrow(int treeID) {
		switch(patches.get(treeID).getType()) {
		case 1: /* FLOWER PATCH */
			return FarmingContainer.PATCH_FLOWER_GROW[patches.get(treeID).stagesFar() - 1];
		}
		return -1;
	}
	
	private boolean isCompostObject(int object) {
		for (int i = 0; i < FarmingContainer.PATCH_ALL_COMPOST.length; i++) {
			if (object == FarmingContainer.PATCH_ALL_COMPOST[i]) {
				return true;
			}	                                                 
		}
		return false;
	}
	
	private int getOriginalPatch(int patchID) {
		if (patchID == 7840 || patchID == 7841 || patchID == 7842 || patchID == 7843) {
			return 7847;
		}
		return -1;
	}

}
