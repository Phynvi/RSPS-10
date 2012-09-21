package com.rs2hd.model;

import com.rs2hd.GameEngine;
/**
 * Manages the player bank.
 *c
 * @author Graham
 */
public class Bank {

	public static final int SIZE = 800;

	public Container<Item> bank = new Container<Item>(SIZE, false);

	private transient Player player;

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void openBank() {
		player.getActionSender().sendConfig2(563, 4194304);
		player.getActionSender().sendConfig2(1248, -2013265920);
		player.getActionSender().sendBankOptions();
		refresh();
		player.getActionSender().sendInterface(762, true);
		player.getActionSender().sendInventoryInterface(763);
		player.getActionSender().setTabs(player);
	}

	public void refresh() {
		player.getActionSender().sendItems(-1, 64207, 95, bank);
		player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
		player.getActionSender().sendItems(149, 0, 93, player.getInventory().getContainer());
		player.getActionSender().sendString(bank.getSize() - bank.getFreeSlots() + "", 762, 97);
	}

	public Container<Item> getContainer() {
		return bank;
	}

	public int getFreeSlots() {
		return bank.getFreeSlots();
	}

	public void bankItem(int slot, int amount) {
		if (slot < 0 || slot > Inventory.SIZE || amount <= 0) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if (item == null) {
			return;
		}
		if (amount > player.getInventory().getContainer().getNumberOf(item)) {
			item = new Item(item.getId(), player.getInventory().getContainer().getNumberOf(item));
		} else {
			item = new Item(item.getId(), amount);
		}
		if (player.getInventory().getContainer().contains(item)) {
			if (item.getDefinition().isNoted()) {
				item = new Item(item.getId() - 1, item.getAmount());
				player.getInventory().deleteItem(item.getId() + 1,
						item.getAmount());
			} else {
				player.getInventory()
						.deleteItem(item.getId(), item.getAmount());
			}
			if (bank.containsOne(item)) {
				for (int i = 0; i < SIZE; i++) {
					Item bankItem = bank.get(i);
					if (bankItem == null) {
						continue;
					}
					if (bankItem.getId() == item.getId()) {
						bank.set(i, new Item(item.getId(), bankItem.getAmount()
								+ item.getAmount()));
						break;
					}
				}
			} else {
				if (getFreeSlots() <= 0) {
					player.getActionSender().sendMessage(
							"Not enough space in your bank.");
					return;
				} else {
					int index = bank.freeSlot();
					bank.set(index, new Item(item.getId(), item.getAmount()));
				}
			}
			refresh();
		}
	}
	public void bankInv() {
		bank.alwaysStackable = true;
		bank.addAll(player.getInventory().inventory);
		player.getInventory().inventory.clear();
		refresh();
		player.getInventory().refresh();
		bank.alwaysStackable = false;
	}

	public boolean contains(int item) {
		return bank.containsOne(new Item(item));
	}

	public void bankEquip() {
		bank.alwaysStackable = true;
		bank.addAll(player.getEquipment().equipment);
		player.getEquipment().equipment.clear();
		refresh();
		player.getEquipment().refresh();
		bank.alwaysStackable = false;
	}

	public void bankFamInv() {
		bank.alwaysStackable = true;
		bank.addAll(player.getFamiliarInventory().FamiliarInv);
		player.getFamiliarInventory().FamiliarInv.clear();
		refresh();
		player.getFamiliarInventory().refresh();
		bank.alwaysStackable = false;
	}

	public void withdrawItem(int slot, int amount) {
		if (slot < 0 || slot > Bank.SIZE || amount <= 0) {
			return;
		}
		Item item = bank.get(slot);
		Item item2 = bank.get(slot);
		Item item3 = bank.get(slot);

		if (item == null) {
			return;
		}
		if (amount > item.getAmount()) {
			item = new Item(item.getId(), item.getAmount());
			item2 = new Item(item.getId() + 1, item.getAmount());
			item3 = new Item(item.getId(), item.getAmount());
			if (player.isNoting()) {
				if (item2.getDefinition().isNoted()) {
					item = new Item(item.getId() + 1, item.getAmount());
				} else {
					player.getActionSender().sendMessage("You cannot withdraw this item as a note.");
					item = new Item(item.getId(), item.getAmount());
				}
			}
		} else {
			item = new Item(item.getId(), amount);
			item2 = new Item(item.getId(), amount);
			item3 = new Item(item.getId(), amount);
			if (player.isNoting()) {
				item2 = new Item(item.getId() + 1, item.getAmount());
				if (item2.getDefinition().isNoted()) {
					item = new Item(item.getId() + 1, item.getAmount());
				} else {
					player.getActionSender().sendMessage(
							"You cannot withdraw this item as a note.");
					item = new Item(item.getId(), item.getAmount());
					return;
				}
			}
		}
		if (amount > player.getInventory().getFreeSlots()
				&& !item3.getDefinition().isStackable() && !player.isNoting()) {
			item = new Item(item.getId(), player.getInventory().getFreeSlots());
			item2 = new Item(item2.getId(), player.getInventory()
					.getFreeSlots());
			item3 = new Item(item3.getId(), player.getInventory()
					.getFreeSlots());
		}
		if (bank.contains(item3)) {
			if (player.getInventory().getFreeSlots() <= 0) {
				player.getActionSender().sendMessage(
						"Not enough space in your inventory.");
			} else {
				if (player.isNoting() && !item.getDefinition().isNoted()) {
					player.getInventory().addItem(item.getId(),
							item.getAmount());
					bank.remove(item3);
				} else {
					player.getInventory().getContainer().add(item);
					bank.remove(item3);
				}
				bank.shift();
			}
		refresh();
		}
        }
	public void examineBank(Player player, int slot, int amount) {
		if (slot < 0 || slot >= SIZE) {
			return;
		}
		Item item = player.getBank().getContainer().get(slot);
		if (item == null) {
			return;
		}
		player.getActionSender().sendMessage(item.getDefinition().getExamine());
	}

	public void examineInventory(Player player, int slot, int amount) {
		if (slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if (item == null) {
			return;
		}
		player.getActionSender().sendMessage(item.getDefinition().getExamine());
	}


}
