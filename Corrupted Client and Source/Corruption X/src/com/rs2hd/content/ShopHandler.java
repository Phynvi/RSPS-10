package com.rs2hd.content;

import com.rs2hd.model.*;
import com.rs2hd.GameEngine;

/**
 * Created by IntelliJ IDEA.
 * User:     Serenty
 * Date:     3-march-2009
 * Project:  Boneyard
 * Time:     19:51:15
 */
public class ShopHandler {


    Player p;
    public int maxItems = 40;
    public int[] items = new int[maxItems];
    public int[] itemsN = new int[maxItems];
    public int[] maxItemAmount = new int[maxItems];
    public boolean generalStore = false;
    public long lastRestock = System.currentTimeMillis();
    int shopid = 0;
    public boolean mainstock = true;
    /***************************************************************************************************************/
    /*                              DO NOT TOUCH THIS!                                                             */
    /***************************************************************************************************************/
    public ShopHandler() {


        for (int i = 0; i < 40; i++) {
            items[i] = -1;

        }

        this.items = items;
        this.itemsN = itemsN;
        maxItemAmount = itemsN;
    }

    public void process(Player p) {
        if (System.currentTimeMillis() - lastRestock >= 60000) {
            clearSlots(p);
            for (int i = 0; i < items.length; i++) {
                if (itemsN[i] < maxItemAmount[i]) itemsN[i]++;
            }
            lastRestock = System.currentTimeMillis();
        }
    }

    public void sell(Player p, int item, int amnt){
            boolean shopShouldBuy = generalStore || isItemOnShop(item);
            if (!shopShouldBuy) {
                p.sm("You cannot sell this item to this shop.");
                return;
            }
            if (item == 995) {
                p.sm("You can't sell coins to a shop");
                return;
            }
            int free = findFreeSlot();
            if (!isItemOnShop(item) && generalStore) {
                if (free == -1) {
                    p.sm("This shop is full.");
                    return;
                }
                items[free] = item;
                itemsN[free] = 0;
            }
            int slot = findItemSlot(item);
        if(amnt<=p.getInventory().numberOf(item))
        {
            if (itemStacks(item)) {
                items[slot] = item;
                itemsN[slot] += amnt;
                p.getInventory().deleteItem(item, amnt);
                    p.getInventory().addItem(995,amnt*GameEngine.prices.getMinimumPrice(item));
            } else {
                items[slot] = item;
                for (int notused = amnt; notused > 0; notused--) {
                    p.getInventory().deleteItem(item, 1);
                    p.getInventory().addItem(995, GameEngine.prices.getMinimumPrice(item));
                    itemsN[slot]++;
                }
            }
        }
        else
        {
            amnt = p.getInventory().numberOf(item);
            if (itemStacks(item)) {
                items[slot] = item;
                itemsN[slot] += amnt;
                 p.getInventory().deleteItem(item, amnt);
                    p.getInventory().addItem(995, amnt*GameEngine.prices.getMinimumPrice(item));
            } else {
                items[slot] = item;
                for (int notused = amnt; notused > 0; notused--) {
                    p.getInventory().deleteItem(item, 1);
                    p.getInventory().addItem(995, GameEngine.prices.getMinimumPrice(item));
                    itemsN[slot]++;
                }
            }
        }


            sendShopItems(p);
            sendPlayerInventory(p);
        }


    public void buystock(Player p, int item, int amnt) {
        clearSlots(p);
        int slot = findItemSlot(item);
        if (slot == -1) {
            return;
        }
        if (itemsN[slot] < amnt) amnt = itemsN[slot];
        if (amnt == 0) {
            items[slot] = -1;
            p.sm("That item's stock has run out.");
            return;
        }
        if (itemStacks(item)) {                                                 // item stackable, easier...
            if (p.getInventory().getFreeSlots() < 1) {
                p.sm("Not enough space on inventory");
                return;
            }
            if (p.getInventory().numberOf(995) < (amnt * GameEngine.prices.getMaximumPrice(item))) {
                p.sm("Not enough coins to buy that many.");
                return;
            }
           p.getInventory().deleteItem(995, amnt * GameEngine.prices.getMaximumPrice(item));
            p.getInventory().addItem(item, amnt);
            itemsN[slot] -= amnt;
        } else {                                                                // item not stackable
            for (int i = amnt; i > 0; i--) {
                int price = GameEngine.prices.getMaximumPrice(item);
                clearSlots(p);
                if (p.getInventory().numberOf(995) < price) {
                    p.sm("Not enough coins to buy that many.");
                    break;
                }
                if (itemsN[slot] < 1) {
                    clearSlots(p);
                    p.sm("The shop has run out of stock from this item!");
                    break;
                }
	if(p.getInventory().hasRoomFor(items[slot], amnt)) {
                itemsN[slot]--;
                p.getInventory().deleteItem(995, price);
                p.getInventory().addItem(item, 1);
                clearSlots(p);
	} else {
		p.sm("Not enough space on inventory");
        	break;
                }
	}
}

        sendShopItems(p);
        sendPlayerInventory(p);
        clearSlots(p);
    }


    public int findItemSlot(int item) {
        for (int i = 0; i < items.length; i++)
            if (item == items[i]) return i;
        return -1;
    }

    public int findFreeSlot() {
        for (int i = 0; i < items.length; i++)
            if (items[i] == -1) return i;
        return -1;
    }

    public void clearSlots(Player p) {
        for (int i = 0; i < items.length; i++)
            if (items[i] < 1) {
                items[i] = -1;
            } else {
            }

    }

    public void sendShopItems(Player p) {
	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
    }

    public boolean isItemOnShop(int item) {
        return findItemSlot(item) != -1;
    }

    public void sendPlayerInventory(Player p) {
        p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());

    }



    public boolean itemStacks(int item) {
ItemDefinition def = ItemDefinition.forId(item);
        return def.isStackable();
    }

    public void handleoption(Player p, int interfaceId, int buttonId, int buttonId2, int packetId) {
        switch (interfaceId) {
            case 620:
               	switch(buttonId) {
		case 18:
			p.getActionSender().sendCloseInterface();
			p.getActionSender().sendCloseInventoryInterface();
		break;
		default:
                    int itemid = returnItemId(shopid, buttonId2);
                    switch (packetId) {
                        case 216:
                            /* Value. */
                            p.sm("This item costs " + GameEngine.prices.getMaximumPrice(itemid) + " coins.");
                            break;
                        case 19:
                            /* Buy 1. */
                            buystock(p, itemid, 1);
                            break;
                        case 193:
                            /* Buy 5. */
                            buystock(p, itemid, 5);
                            break;
                        case 76:
                            /* Buy 10. */
                            buystock(p, itemid, 10);
                            break;
                        case 173:
                            /* Buy 50.  gotta add*/
                            buystock(p, itemid, 50);
                            break;
                        case 3:
                            /*Examine. */
				ItemDefinition def = ItemDefinition.forId(itemid);
                            p.sm(""+def.getExamine());
                            break;
                    }
                }
                break;
            case 621:
                if (buttonId == 0) {
                    Item def = p.getInventory().getContainer().get(buttonId2);
		    int itemid = def.getId();
                    switch (packetId) {
                        case 216:
                            /*Value.*/
                            p.sm( "This item is worth " + GameEngine.prices.getMinimumPrice(itemid) + " coins.");
                            break;
                        case 19:
                            /*
                            * Buy 1.
                            */
                            sell(p, itemid, 1);
                            break;
                        case 193:
                            /*
                            * Buy 5.
                            */
                            sell(p, itemid, 5);
                            break;
                        case 76:
                            /*
                            * Buy 10.
                            */

                            sell(p, itemid, 10);
                            break;
                        case 173:
                            /*
                            * Buy 50.
                            */
                            sell(p, itemid, 50);
                            break;
                        case 3:
                            /*
                            * Examine.
                            */
                            p.sm(""+def.getDefinition().getExamine());
                            break;
                    }
                }
                break;
        }
    }

    public void shopopen(Player p, int shopId) {
	p.getActionSender().sendConfig(199, -1);
        p.getActionSender().sendConfig2(118, 17);
        p.getActionSender().sendInterface(620, true);
        p.getActionSender().sendInventoryInterface(621);
	p.getActionSender().sendTab(146, 449);
        shopid = shopId;
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
    }

    /***************************************************************************************************************/
    /*                              ONLY EDIT THIS!                                                                */
    /***************************************************************************************************************/



    public int returnItemId(int shopid, int buttonId2) {
        switch (shopid) {
             case 1:
                switch (buttonId2) {
                    case 0:return 1755;
                    case 1:return 590;
                    case 2:return 5605;
                    case 3:return 199;
                    case 4:return 201;
                    case 5:return 203;
                    case 6:return 205;
                    case 7:return 207;
                    case 8:return 209;
                    case 9:return 211;
                    case 10:return 213;
                    case 11:return 215;
                    case 12:return 217;
                    case 13:return 219;
                    case 14:return 227;
                }
                break;
            case 2:
                switch (buttonId2) {
                    case 0:return 1381;
                    case 1:return 1383;
                    case 2:return 1385;
                    case 3:return 1387;
                    case 4:return 579;
                    case 5:return 577;
                    case 6:return 1011;
                    case 7:return 2579;
                    case 8:return 4089;
                    case 9:return 4091;
                    case 10:return 4093;
                    case 11:return 4095;
                    case 12:return 4097;
                       }
                break;
              case 3:
                switch (buttonId2) {
                    case 0:return 2900;
                    case 1:return 2910;
                    case 2:return 2920;
                    case 3:return 2940;
                    case 4:return 2896;
                    case 5:return 2906;
                    case 6:return 2916;
                    case 7:return 2936;
                    case 8:return 2898;
                    case 9:return 2908;
                    case 10:return 2918;
                    case 11:return 2938;
                    case 12:return 2902;
                    case 13:return 2912;
                    case 14:return 2922;
                    case 15:return 2942;
                    case 16:return 2894;
                    case 17:return 2904;
                    case 18:return 2914;
                    case 19:return 2934;
                }
                break;
            case 4:
                switch (buttonId2) {
                    case 0:return 590;
                    case 1:return 1351;
                    case 2:return 1265;
                    case 3:return 303;
                    case 4:return 305;
                    case 5:return 311;
                }
                break;
            case 5: 
                switch (buttonId2) {
                    case 0:return 12210;
                    case 1:return 12213;
                    case 2:return 12216;
                    case 3:return 12219;
                    case 4:return 12222;
                    case 5:return 12183;
                    case 6:return 12155;
                        }
                break;
				 case 6: 
                switch (buttonId2) {
                    case 0:return 438;
                    case 1:return 436;
                    case 2:return 440;
                    case 3:return 442;
                    case 4:return 444;
                    case 5:return 453;
                    case 6:return 447;
                }
                break;


		 case 7: 
                switch (buttonId2) {
                	case 0:return 882;
                    case 1:return 884;
                    case 2:return 886;
                    case 3:return 888;
                    case 4:return 890;
                    case 5:return 841;
                    case 6:return 857;
                    case 7:return 861;
                    case 8:return 1135;
                    case 9:return 1099;
                    case 10:return 1065;
                    case 11:return 2499;
                    case 12:return 2493;
                    case 13:return 2487;
                    case 14:return 2501;
                    case 15:return 2495;
                    case 16:return 2489;
		    case 17:return 2503;
                    case 18:return 2497;
                    case 19:return 2491;
                   
                }
                break;

				 case 8: 
                switch (buttonId2) {
                    
                    case 0:return 1153;
                    case 1:return 1115;
                    case 2:return 1067;
                    case 3:return 1081;
                    case 4:return 1191;
                    case 5:return 1157;
                    case 6:return 1119;
                    case 7:return 1069;
                    case 8:return 1083;
                    case 9:return 1193;
                    case 10:return 1159;
                    case 11:return 1121;
                    case 12:return 1071;
                    case 13:return 1085;
                    case 14:return 1197;
                    case 15:return 1161;
					case 16:return 1123;
                    case 17:return 1073;
                    case 18:return 1091;
                    case 19:return 1199;
                }
                break;
        }
        return -1;
    }

    public void openshop(Player p, int shopid) {
        switch (shopid) {
					case 1:
			p.getActionSender().sendString("Herquin(random)", 620, 22);
                	shopopen(p, 1);
                	items  = GameEngine.shops.herquinshop;
                	itemsN = GameEngine.shops.herquinshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 2:
			p.getActionSender().sendString("Zaff(magic shop)", 620, 22);
                	shopopen(p, 2);
                	items  = GameEngine.shops.magicshop;
                	itemsN = GameEngine.shops.magicshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 3:
			p.getActionSender().sendString("Fancy dress shop owner(clothing shop)", 620, 22);
                	shopopen(p, 3);
                	items  = GameEngine.shops.clothesshop;
                	itemsN = GameEngine.shops.clothesshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 4:
			p.getActionSender().sendString("Shopkeeper(skilling shop)", 620, 22);
                	shopopen(p, 4);
                	items  = GameEngine.shops.skillingshop;
                	itemsN = GameEngine.shops.skillingshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 5:
			p.getActionSender().sendString("Summ shop", 620, 22);
                	shopopen(p, 5);
                	items  = GameEngine.shops.summshop;
                	itemsN = GameEngine.shops.summshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 6:
			p.getActionSender().sendString("Brian(random)", 620, 22);
                	shopopen(p, 6);
                	items  = GameEngine.shops.brianshop;
                	itemsN = GameEngine.shops.brianshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 7:
			p.getActionSender().sendString("Ranging shop", 620, 22);
                	shopopen(p, 7);
                	items  = GameEngine.shops.rangingshop;
                	itemsN = GameEngine.shops.rangingshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
					case 8:
			p.getActionSender().sendString("Melee shop", 620, 22);
                	shopopen(p, 8);
                	items  = GameEngine.shops.meleeshop;
                	itemsN = GameEngine.shops.meleeshopN;
                	p.getActionSender().sendItems( -1, 64209, 93, p.getInventory().getContainer());
               	 	p.getActionSender().sendItems( -1, 63746, 556,items, itemsN);
					break;
        	}
    	}
}