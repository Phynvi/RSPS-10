package com.rs2hd.model;

/**
 * Represents a shop.
 * @author Graham
 *
 */
public class Shop {
	
	public static final int SIZE = 500;
	private String name;
	private Container<ShopItem> stock   = new Container<ShopItem>(SIZE, false);
	private transient boolean isUpdateRequired;
	private transient Container<ShopItem> playerStock;
	
	public Shop() {
	}

	public void refresh(Player player) {
		player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
		player.getActionSender().sendItems(-1, 63746, 556, playerStock.asItemContainer());
	}
	
	public Object readResolve() {
		isUpdateRequired = false;
		playerStock = new Container<ShopItem>(SIZE, true);
		int idx = 0;
		for(Item i : stock.getItems()) {
			playerStock.set(idx++, new ShopItem(i.getId(), i.getAmount()));
		}
		return this;
	}
	
	public void updateAmounts() {
		for(int i = 0; i < playerStock.getSize(); i++) {
			ShopItem si = playerStock.get(i);
			if(si != null) {
				if(si.getAmount() < si.getStandardAmount()) {
					si.setAmount(si.getAmount()+1);
					this.setUpdateRequired(true);
				}
			}
		}
	}
	
	public boolean isUpdateRequired() {
		return this.isUpdateRequired;
	}
	
	public void setUpdateRequired(boolean b) {
		this.isUpdateRequired = b;
	}
	
	public String getName() {
		return name;
	}
	
	public Container<ShopItem> getPlayerStock() {
		return playerStock;
	}
	
}
