package com.rs2hd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import com.rs2hd.event.Event;
import com.rs2hd.model.Item;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Player;
import com.rs2hd.model.Shop;
import com.rs2hd.model.ShopConfiguration;
import com.rs2hd.model.ShopItem;
import com.rs2hd.model.World;
import com.rs2hd.util.log.Logger;
import com.rs2hd.GameEngine;

@SuppressWarnings("unused")
public class ShopManager {

	private static final int CURRENCY = 995;

	private Map<Integer, Shop> shops;

	@SuppressWarnings("unchecked")
	public ShopManager() throws FileNotFoundException {
		Logger.getInstance().info("Loading shops...");
		shops = (Map<Integer, Shop>) XStreamUtil.getXStream().fromXML(new FileInputStream("data/shops.xml"));
		World.getInstance().registerEvent(new Event(60000) {
			@Override
			public void execute() {
				updateAmounts();
			}
		});
		Logger.getInstance().info("Loaded " + shops.size() + " shops.");
	}

	public void tick(Player player) {
		if(player.getShopConfiguration().isShopping()) {
			Shop shop = player.getShopConfiguration().getCurrentShop();
			if(shop.isUpdateRequired()) {
				shop.refresh(player);
			}
		}
	}

	private void updateAmounts() {
		for(Shop s : shops.values()) {
			s.updateAmounts();
		}
	}

		public int getShopToInvPrice(Player player, int id) {
		return GameEngine.prices.getMinimumPrice(id);
	}

	public void openShop(Player p, int id) {
		Shop shop = shops.get(id);
		p.getShopConfiguration().setCurrentShop(shop);
		p.getActionSender().sendConfig(199, -1);
		p.getActionSender().sendConfig2(118, 17);
		p.getActionSender().sendInterface(620, true);
		p.getActionSender().sendInventoryInterface(621);
		p.getActionSender().sendTab(146, 449);
		Object[] sellOptions = new Object[]{"Sell 50", "Sell 10", "Sell 1", "Value", -1, 1, 7, 4, 93, 40697856};
		Object[] invparams = new Object[]{"", "", "", "", "Sell 50", "Sell 10", "Sell 5", "Sell 1", "Value", -1, 0, 7, 4, 93, 40697856};
		//Object[] shopsampleparams = new Object[]{"", "", "", "", "Buy 50", "Buy 10", "Buy 5", "Buy 1", "Value", -1, 0, 4, 10, 7, 40632346};
		Object[] shopparams = new Object[]{"", "", "", "", "Buy 50", "Buy 10", "Buy 5", "Buy 1", "Value", -1, 0, 4, 10, 556, 40632345};
		p.getActionSender().sendRunScript(149, sellOptions, "IviiiIsssss");
		p.getActionSender().sendRunScript( 150, invparams, "IviiiIsssssssss");
		//player.getPackets().sendRunScript( 150, shopsampleparams, "IviiiIsssssssss");
		p.getActionSender().sendRunScript( 150, shopparams, "IviiiIsssssssss");
		p.getActionSender().sendAccessMask(1278, 621, 0, 0, 28);
		p.getActionSender().sendAccessMask(1278, 620, 25, 0, 40);	
		p.getActionSender().sendAccessMask(1278, 620, 26, 0, 40); 
		p.getActionSender().sendString(shop.getName(), 620, 22);

		shop.refresh(p);
	}

	public void getValueShop(Player player, int slot) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = shop.getPlayerStock().get(slot);
		if(shopItem == null) {
			return;
		}
		int price = getShopToInvPrice(player, shopItem.getId());
		player.getActionSender().sendMessage(shopItem.getDefinition().getName() + ": currently worth " + price + " coins.");
	}

	public void buy(Player player, int slot, int amount) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = shop.getPlayerStock().get(slot);
		if(shopItem == null) {
			return;
		}
		int price = getShopToInvPrice(player, shopItem.getId());
		int totalPrice = price*amount;
		int shopAmt = shop.getPlayerStock().getNumberOf(shopItem);
		if(amount > shopAmt) {
			amount = shopAmt;
			totalPrice = price * amount;
		}
		ShopItem add = new ShopItem(shopItem.getId(), amount);
		if(shop.getPlayerStock().contains(add)) {
			if(player.getInventory().contains(CURRENCY, totalPrice)) {
				if(player.getInventory().hasRoomFor(add.getId(), add.getAmount())) {
					player.getInventory().deleteItem(CURRENCY, totalPrice);
					player.getInventory().addItem(add.getId(), add.getAmount());
					shop.getPlayerStock().remove(add);
					shop.refresh(player);
					shop.setUpdateRequired(true);
				} else {
					player.getActionSender().sendMessage("Not enough room in your inventory.");
				}
			} else {
				player.getActionSender().sendMessage("Not enough coins.");
			}
		} else {
			player.getActionSender().sendMessage("Shop does not have enough stock.");
		}
	}

	public void examineShop(Player player, int slot) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = shop.getPlayerStock().get(slot);
		if(shopItem == null) {
			return;
		}
		player.getActionSender().sendMessage(shopItem.getDefinition().getExamine());
	}

}
