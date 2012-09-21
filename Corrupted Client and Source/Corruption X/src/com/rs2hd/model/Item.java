package com.rs2hd.model;

/**
 * Represents a single item.
 * 
 * Immutable.
 * @author Graham
 *
 */
public class Item {
	
	private int id;
	private transient ItemDefinition itemDefinition;
	private int amount;
	
	public Item() {}
	
	public int getId() {
		try {
		return id;
		} catch(Exception e) {
		return 0;
		}
	}

	public Item clone() {
		return new Item(id, amount);
	}
	
	public Item(int id) {
		this.id = id;
		this.itemDefinition = ItemDefinition.forId(id);
		this.amount = 1;
	}
	
	public Item(int id, int amount) {
		this.id = id;
		this.itemDefinition = ItemDefinition.forId(id);
		this.amount = amount;
		if(this.amount <= 0) {
			this.amount = 1;
		}
	}
	
	public ItemDefinition getDefinition() {
		return itemDefinition;
	}
	
	public int getAmount() {
		try {
		return amount;
		} catch(Exception e) {
		return 1;
		}
	}
	
	public Object readResolve() {
		this.itemDefinition = ItemDefinition.forId(id);
		return this;
	}
	
	/**
	 * ONLY CALL THIS FROM THE SHOPITEM CLASS.
	 * @param amount
	 */
	protected void setAmount(int amount) {
		try {
		this.amount = amount;
		} catch(Exception e) {
		}
	}

}
