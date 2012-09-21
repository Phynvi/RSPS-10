package com.rs2hd.content.skills.cooking;

import com.rs2hd.event.Event;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;

public class Cooking {
	private int counter;
	private Player p;
	private boolean isCooking;
	private int cookIndex;
	/* {fishId, levelReq, cookedItem, burntId, XPGained} */
	public final static int[][] cookingData = 
	{{317, 1, 315, 323, 70},	
		{335, 15, 333, 343, 110}, 
		{331, 25, 329, 343, 180},
		{349, 20, 351, 349, 150},
		{377, 40, 379, 381, 400},
		{371, 45, 373, 375, 700},
		{383, 80, 385, 387, 1000},
		{389, 91, 391, 393, 1500},
		{395, 82, 397, 399, 1200}};
	private final static int[] firePlaces = {2732};
	private final static int[] stoves = {36973,2728};
	public Cooking(Player player) {
		this.p = player;
	}
	private int getBurned(int item) {
		return cookingData[cookIndex][3];
	}
	private int getCooked(int item) {
		return cookingData[cookIndex][2];
	}
	private int getReq(int item) {
		return cookingData[cookIndex][1];
	}
	private int getXP(int item) {
		return cookingData[cookIndex][4];
	}
	private int getFish(final int item) {
		return cookingData[cookIndex][0];
	}
	private int stove(int object) {
		for (int i = 0; stoves.length > i;i++) {
			if(stoves[i] == object) { 
				return stoves[i];
			}
		}
		return -1;
	}
	private int firePlace(int object) {
		for (int i = 0; firePlaces.length > i; i++) {
			if(firePlaces[i] == object) {
				return firePlaces[i];
			}
		}
		return -1;
	}
	private boolean isFish(int item) {
		for (int i = 0; cookingData.length > i; i++) {
			if(cookingData[i][0] == item) {
				cookIndex = i;
				return true;
			}
		}
		return false;
	}
	public void handleItemOnObject(int itemId, int objectId) {
		if(objectId == stove(objectId)) {
			if (!isFish(itemId)) {
				p.getActionSender().sendMessage("You cannot cook this on a stove!");
				return;
			}
			if (stove(objectId) != -1 || objectId != -1) {
				handleCooking(itemId, 1);
			}
		}
		if(objectId == firePlace(objectId)) {
			if (!isFish(itemId)) {
				p.getActionSender().sendMessage("You cannot cook this on a fire!");
				return;
			}
			if (firePlace(objectId) != -1 || objectId != -1) {
				handleCooking(itemId, 2);
			}
		}
	}
	private void handleCooking(int itemId, int object) {
		int emote = 883;
		if (object == 1) {
			emote = 883;
		}
		if(object == 2) {
			emote = 899;
		}
		final int fishId = getFish(itemId);
		setCooking(true);
		if(p.getSkills().getLevel(Skills.COOKING) >= getReq(fishId)) {
			executeEvent(itemId, emote);
		} else {
			p.getActionSender().sendMessage("You need level " + getReq(fishId) + " Cooking to cook this.");
		}
	}
	private void executeEvent(final int item, final int emote) {
		World.getInstance().registerEvent(new Event(500) {
			@Override
			public void execute() {
				if (p == null) {
					this.stop();
					return;
				}
				if (!isCooking && item != -1) {
					this.stop();
					return;
				}
				if(p.getInventory().numberOf(item) == 0) {
					this.stop();
					resetCooking();
					p.getActionSender().sendMessage("You ran out of fish to cook!");
					return;
				}
				if (counter == 0) {
					p.animate(emote);
					p.getInventory().deleteItem(item, 1);					
					if(sucess(item)) {
						p.getSkills().addXp(7,getXP(item));
						p.getActionSender().sendMessage("You sucessfully cook the "+ new Item(item).getDefinition().getName() +".");
						p.getInventory().addItem(getCooked(item), 1);
						counter = 7;
					} else {
						p.getActionSender().sendMessage("Opps! You accidently burnt the " +  new Item(item).getDefinition().getName()+".");
						p.getInventory().addItem(getBurned(item), 1);
						counter = 7;
					}
				}
				counter--;
			}
		});
	}
	private void resetCooking() {
		isCooking = false;
	}
	private boolean sucess(int fishId) {
		if (p.getSkills().getLevel(Skills.COOKING) > 98) {
			return true;
		}
		int level = p.getSkills().getLevel(Skills.COOKING);
		int fishLevel = getReq(fishId);
		int random = Misc.random(level*2);
		if(random > fishLevel) {
			return true;
		}
		return false;
	}
	public void setCooking(boolean isCooking) {
		this.isCooking = isCooking;
	}
	public boolean isCooking() {
		return isCooking;
	}
}


