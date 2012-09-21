package com.rs2hd.model;


/**
 * Represents a trade between two players.
 * @author Graham
 *
 */
public class PriceCheck {

	public static final int SIZE = 28;

	public Container<Item> pricecheckinv = new Container<Item>(SIZE, false);

	private transient Player player;
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}
	public Container<Item> getContainer() {
		return pricecheckinv;
	}
	public void close() {
		try {
			player.getInventory().getContainer().addAll(pricecheckinv);
			getContainer().reset();
		        player.getInventory().refresh();
		} catch(Exception e) {
		}
	}

	public void refresh() {
		try {
player.getActionSender().sendPriceCheckerOptions();
player.getInventory().refresh();
		} catch(Exception e) {
		}
}
	public void removeItem(Player player, int slot, int amount) {
		try {
			if(player != null) {
				Item item = pricecheckinv.get(slot);
				if(item != null) {
		if(amount > item.getAmount()) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
					pricecheckinv.remove(item);
					player.getInventory().getContainer().add(item);
					refresh();
				}
			}
		} catch(Exception e) {
		}
	}

	public void addItem(Player player, int slot, int amount) {
		try {
			if(player != null) {
				Item item = player.getInventory().getContainer().get(slot);
				if(item != null) {
		if(amount > item.getAmount()) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
					player.getInventory().getContainer().remove(item);
					pricecheckinv.add(item);
					refresh();
				}
			}
		} catch(Exception e) {
		}
	}

}
