package com.rs2hd.model;

/**
 * Manages the player inventory.
 * @author Graham
 *
 */
public class Inventory {
	
	public static final int SIZE = 28;

	public Container<Item> inventory = new Container<Item>(SIZE, false);
	
	private transient Player player;
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}

	public boolean addItem(int item, int amount) {
		if(item < 0/* || item >= 13404*/) { //tmp fix for items
			return false;
		}
		boolean b = inventory.add(new Item(item, amount));
		if(!b) {
			player.getActionSender().sendMessage("Not enough space in your inventory.");
			return false;
		}
		refresh();
		return true;
	}
		
	public boolean contains(int item, int amount) {
		return inventory.contains(new Item(item, amount));
	}
	
	public boolean contains(int item) {
		return inventory.containsOne(new Item(item));
	}
	
	public void deleteItem(int item, int amount) {
		try {
		inventory.remove(new Item(item, amount));
		refresh();
		} catch(Exception e) {
		}
	}
	
	public void deleteAll(int item) {
		try {
		inventory.removeAll(new Item(item));
		refresh();
		} catch(Exception e) {
		}
	}

public void reset() {
		inventory = new Container<Item>(SIZE, false);
		refresh();
	}


	public void refresh() {
		try {
			player.getBonuses().refreshWeight();
		player.getActionSender().sendItems(9764864, 93, inventory);
		} catch(Exception e) {
		}
	}

	public Container<Item> getContainer() {
		return inventory;
	}

	public int getFreeSlots() {
		try {
		return inventory.getFreeSlots();
		} catch(Exception e) {
		return 0;
		}
	}

	public boolean hasRoomFor(int id, int itemAmount) {
		if(ItemDefinition.forId(id).isStackable()) {
			return getFreeSlots() >= 1 || contains(id);
		} else {
			return getFreeSlots() >= itemAmount;
		}
	}

	public int numberOf(int id) {
		try {
		return inventory.getNumberOf(new Item(id, 1));
		} catch(Exception e) {
		return 0;
		}
	}

	public Item lookup(int id) {
		return inventory.lookup(id);
	}
	
	public int lookupSlot(int id) {
		try {
		return inventory.lookupSlot(id);
		} catch(Exception e) {
		return 0;
		}
	}

}
