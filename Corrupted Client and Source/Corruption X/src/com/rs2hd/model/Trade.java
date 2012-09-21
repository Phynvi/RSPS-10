package com.rs2hd.model;

import com.rs2hd.util.Misc;

/**
 * Represents a trade between two players.
 * @author Graham
 *
 */
public class Trade {
	
	public enum State {
		FIRST_SCREEN,
		SECOND_SCREEN,
	}
	
	private boolean exchanged = false;
	private State state = State.FIRST_SCREEN;
	//public Container<Item> lend1 = new Container<Item>(1, false);
	//public Container<Item> lend2 = new Container<Item>(1, false);
	private Container<Item> offer1 = new Container<Item>(Inventory.SIZE, false);
	private Container<Item> offer2 = new Container<Item>(Inventory.SIZE, false);
	private Player player1, player2;
	private boolean accept1, accept2;

	public Trade(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		openFirstInterface(player1);
		openFirstInterface(player2);
	}
	
	private void openFirstInterface(Player player) {
		player.getActionSender().sendTradeOptions();
		player.getActionSender().sendInterface(335, true);
		player.getActionSender().sendInventoryInterface(336);
		player.getActionSender().sendString("Trading with: " + Misc.formatPlayerNameForDisplay(getOther(player).getUsername()), 335, 15);
		player.getActionSender().sendString("", 335, 36);
		player.getActionSender().sendString("", 335, 37);
		refreshInventories();
	}
	
	private void openSecondInterface(Player player) {
		player.getActionSender().sendInterface(334, true);
		//player.getActionSender().sendString(buildString(player == player1 ? offer1 : offer2), 334, 32);
		player.getActionSender().sendString(buildString(player == player1 ? offer1 : offer2), 334, 44);
		player.getActionSender().sendString("<col=00FFFF>Trading with:<br><col=00FFFF>" + Misc.formatPlayerNameForDisplay(getOther(player).getUsername()), 334, 45);
		player.getActionSender().sendInterfaceConfig(334, 37, false);
		player.getActionSender().sendInterfaceConfig(334, 41, false);
		player.getActionSender().sendInterfaceConfig(334, 45, true);
		player.getActionSender().sendInterfaceConfig(334, 46, false);
	}

	private String buildString(Container<Item> container) {
		if(container.freeSlots() == container.getSize()) {
			return "<col=FFFFFF>Absolutely nothing!";
		} else {
			StringBuilder bldr = new StringBuilder();
			for(int i = 0; i < container.getSize(); i++) {
				Item item = container.get(i);
				if(item != null) {
					bldr.append("<col=FF9040>" + item.getDefinition().getName());
					if(item.getAmount() > 1) {
						bldr.append(" <col=FFFFFF> x <col=FFFFFF>" + item.getAmount());
					}
					bldr.append("<br>");
				}
			}
			return bldr.toString();
		}
	}

	private Player getOther(Player player) {
		return player == player1 ? player2 : player1;
	}

	public Player getPlayer1() {
		return player1;
	}
	
	public Player getPlayer2() {
		return player2;
	}
	
	public void exchange() {
		player1.getInventory().getContainer().addAll(offer2);
		player2.getInventory().getContainer().addAll(offer1);
		exchanged = true;
	}

	public void close() {
		if(!exchanged) {
			player1.getInventory().getContainer().addAll(offer1);
			player2.getInventory().getContainer().addAll(offer2);
		}
		player1.getActionSender().sendCloseInterface();
		player2.getActionSender().sendCloseInterface();
		player1.getActionSender().sendCloseInventoryInterface();
		player2.getActionSender().sendCloseInventoryInterface();
		player1.getActionSender().sendItems(-1, 1, 93, new Container<Item>(Inventory.SIZE, false));
		player2.getActionSender().sendItems(-1, 1, 93, new Container<Item>(Inventory.SIZE, false));
		//player1.getActionSender().sendTabs();
		//player2.getActionSender().sendTabs();
		player1.getInventory().refresh();
		player2.getInventory().refresh();
		player1.getRequests().tradeReq = null;
		player1.getRequests().trade = null;
		player2.getRequests().tradeReq = null;
		player2.getRequests().trade = null;
	}

	public void accept(Player which) {
		if(which == player1) {
			accept1 = true;
		} else {
			accept2 = true;
		}
		acceptUpdate();
	}
	
	public void acceptUpdate() {
		switch(state) {
		case FIRST_SCREEN:
			if(accept1 && accept2) {
				if(!player1.getInventory().getContainer().hasSpaceFor(offer2)) {
					player2.getActionSender().sendMessage("Other player does not have enough space in their inventory.");
					player1.getActionSender().sendMessage("You do not have enough space in your inventory.");
					close();
					return;
				}
				if(!player2.getInventory().getContainer().hasSpaceFor(offer1)) {
					player1.getActionSender().sendMessage("Other player does not have enough space in their inventory.");
					player2.getActionSender().sendMessage("You do not have enough space in your inventory.");
					close();
					return;
				}
				state = State.SECOND_SCREEN;
				accept1 = false;
				accept2 = false;
				openSecondInterface(player1);
				openSecondInterface(player2);
			} else if(accept1 && !accept2) {
				player1.getActionSender().sendString("Waiting for other player...", 335, 37);
				player2.getActionSender().sendString("The other player has accepted.", 335, 37);
			} else if(!accept1 && accept2) {
				player2.getActionSender().sendString("Waiting for other player...", 335, 37);
				player1.getActionSender().sendString("The other player has accepted.", 335, 37);
			} else {
				player2.getActionSender().sendString("", 335, 37);
				player1.getActionSender().sendString("", 335, 37);
			}
			break;
		case SECOND_SCREEN:
			if(accept1 && accept2) {
				state = State.SECOND_SCREEN;
				accept1 = false;
				accept2 = false;
				exchange();
				close();
			} else if(accept1 && !accept2) {
				player1.getActionSender().sendString("Waiting for other player...", 334, 33);
				player2.getActionSender().sendString("The other player has accepted.", 334, 33);
			} else if(!accept1 && accept2) {
				player2.getActionSender().sendString("Waiting for other player...", 334, 33);
				player1.getActionSender().sendString("The other player has accepted.", 334, 33);
			} else {
				player2.getActionSender().sendString("", 335, 33);
				player1.getActionSender().sendString("", 335, 33);
			}
			break;
		}
	}

	public void flashIcon(Player which, int slot) {
		Object[] params = new Object[] { slot, 7, 4,  21954593 };
		which.getActionSender().sendRunScript(143, params, "Iiii");
	}

	public void refreshInventories() {
		player1.getActionSender().sendItems(-1, 2, 90, offer1);
		player1.getActionSender().sendItems(-2, 60981, 90, offer2);
		player1.getActionSender().sendString(Misc.formatPlayerNameForDisplay(getOther(player1).getUsername())+" has "+player2.getInventory().getFreeSlots()+" free inventory slots.", 335, 21);
		player2.getActionSender().sendString(Misc.formatPlayerNameForDisplay(getOther(player2).getUsername())+" has "+player1.getInventory().getFreeSlots()+" free inventory slots.", 335, 21);
		player2.getActionSender().sendItems(-1, 2, 90, offer2);
		player2.getActionSender().sendItems(-2, 60981, 90, offer1);
		player1.getInventory().refresh();
		player2.getInventory().refresh();
		player1.getActionSender().sendItems(-1, 1, 93, player1.getInventory().getContainer());
		player2.getActionSender().sendItems(-1, 1, 93, player2.getInventory().getContainer());
	}

	public void removeItem(Player player, int slot, int amount) {
		if(state == State.FIRST_SCREEN) {
				if(accept1 || accept2) {
					if(player == player1)
						flashIcon(player2, slot);
					else if(player == player2)
						flashIcon(player1, slot);
				}
				accept1 = false;
				accept2 = false;
				acceptUpdate();
				Item item = offer1.get(slot);
				if(item == null) {
					return;
				}
				offer1.remove(slot, item);
				player.getInventory().addItem(item.getId(), item.getAmount());
				refreshInventories();
		}
	}
	
	public void LendItem(Player player, int slot) {
		/*try {
		if(state == State.FIRST_SCREEN) {
			if(player == player1) {
		if(player.lenditem1 == 0 && player2.lendeditem == 0) {
				accept1 = false;
				accept2 = false;
				acceptUpdate();
				Item item = player1.getInventory().getContainer().get(slot);
				if(item != null) {
					int id = item.getId();
					int lendId = player.getEquipment().LendId(id);
if (lendId == 0) {
return;
}					player1.getInventory().getContainer().remove(slot, new Item(id, 1));
					lend1.add(new Item(lendId, 1));
					player1.lenditem = lendId;
					player2.lendeditem = lendId;
					player1.LendingPerson = player2;
					//player1.Lendtimer = 120;
					player2.LendedPerson = player1;

				}
				}
			}
			if(player == player2) {
		if(player.lenditem2 == 0 && player1.lendeditem == 0) {
				accept1 = false;
				accept2 = false;
				acceptUpdate();
				Item item = player2.getInventory().getContainer().get(slot);
				if(item != null) {
					int id = item.getId();
					int lendId = player.getEquipment().LendId(id);
if (lendId == 0) {
return;
}
					player2.getInventory().getContainer().remove(slot, new Item(id, 1));
					lend2.add(new Item(lendId, 1));
					player2.lenditem = lendId;
					player1.lendeditem = lendId;
					player2.LendingPerson = player1;
					player1.LendedPerson = player2;
				//player2.Lendtimer = 120;

				}
				}
			}
		refreshInventories();
		}
		} catch(Exception e) {
		}*/

	}
	public void UnLendItem(Player player, int slot) {
		/*if(state == State.SECOND_SCREEN) {
			if(player2.lenditem2 != 0 && player1.lendeditem != 0) {
				Item item = lend2.get(slot);
				if(item == null) {
					return;
				}
				int id = item.getId();
				int UnlendId = player.getEquipment().UnLendId(id);
				if (UnlendId == 0) {
					return;
				}
				lend2.remove(slot, item);
				player2.getInventory().addItem(UnlendId, 1);
				player2.Lendtimer = 0;
				player2.lenditem = 0;
				player1.lendeditem = 0;
				player2.LendingPerson = null;
			}
		}  
		if(state == State.FIRST_SCREEN) {
			if(player2.lenditem2 != 0 && player1.lendeditem != 0) {
				accept2 = false;
				acceptUpdate();
				Item item = lend2.get(slot);
				if(item == null) {
					return;
				}
				int id = item.getId();
				int UnlendId = player.getEquipment().UnLendId(id);
				if (UnlendId == 0) {
					return;
				}
				lend2.remove(slot, item);
				player2.getInventory().addItem(UnlendId, 1);
				player2.lenditem = 0;
				player1.lendeditem = 0;
				player2.Lendtimer = 0;
			}
		}
			refreshInventories();*/
	}

	public void offerItem(Player player, int slot, int amount) {
		if(state == State.FIRST_SCREEN) {
			Item item = player.getInventory().getContainer().get(slot);
			int[] untradeables = {};
				for(int nontrade : untradeables) {
					if(item.getId() == nontrade) {
						player.sm("This item is untradeable.");
						return;
					}
				}
			accept1 = false;
			accept2 = false;
			acceptUpdate();
				if(item != null) {
					int id = item.getId();
					int got = player.getInventory().getContainer().getNumberOf(new Item(id));
					int trueAmount = amount > got ? got : amount;
					player.getInventory().getContainer().remove(slot, new Item(id, trueAmount));
					offer1.add(new Item(id, trueAmount));
				}
			refreshInventories();
		}
	}

	public void examineMy(Player player, int slot) {
			Item item = offer1.get(slot);
			if(item != null) {
				player.getActionSender().sendMessage(item.getDefinition().getExamine());
			}
	}

	public void examineOther(Player player, int slot) {
			Item item = offer2.get(slot);
			if(item != null) {
				player.getActionSender().sendMessage(item.getDefinition().getExamine());
			}
	}

	public void valueOther(Player player, int slot) {
		// TODO item value
	}
}
