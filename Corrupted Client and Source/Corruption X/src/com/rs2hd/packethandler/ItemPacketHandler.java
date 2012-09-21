package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.*;
import com.rs2hd.model.Bank;
import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Equipment;
import com.rs2hd.model.Inventory;
import com.rs2hd.model.Item;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.model.FamiliarNpc;
import com.rs2hd.GameEngine;
import com.rs2hd.util.Misc;
import com.rs2hd.content.skills.herblore.Herblore;
import com.rs2hd.content.skills.crafting.Crafting;
import com.rs2hd.content.skills.firemaking.Firemaking;
import com.rs2hd.content.skills.godswords.Godsword;
//import com.rs2hd.content.skills.fletching.Fletching;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.log.Logger;

/**
 * Handles all packets to do with items.
 * @author Graham
 *
 */
@SuppressWarnings("unused")
public class ItemPacketHandler implements PacketHandler {
	
	private Logger logger = Logger.getInstance();

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 253:
			/*
			 * Switch items.
			 */
			switchItems(player, session, packet);
			break;
		case 112:
			/*
			 * Transfer items between two interfaces.
			 */
			switchItems2(player, session, packet);
			break;
		case 229:
			/*
			 * Equip.
			 */
			equip(player, session, packet);
			break;
		case 234:
			/*
			 * Item option 1.
			 */
			itemOption1(player, session, packet);
			break;
		case 66:
			/*
			 * Item select.
			 */
			itemSelect(player, session, packet);
			break;
		case 69:
			lootItem(player, session, packet);
			break;
		case 29:
			/*
			 * Item select.
			 */
			itemSummon(player, session, packet);
			break;
		case 189:
			/*
			 * Item operate.
			 */
			itemOperate(player, session, packet);
			break;
		case 248:
			/*
			 * Drop item.
			 */
			drop(player, session, packet);
			break;
		case 194:
			/*
			 * Take item.
			 */
			take(player, session, packet);
			break;
		case 117:
			/*
			 * Item on item.
			 */
			itemOnItem(player, session, packet);
			break;
		case 202:
			/*
			 * Item on object.
			 */
			itemOnObject(player, session, packet);
			break;
		case 131:
			/*
			 * Item on player.
			 */
			itemOnPlayer(player, session, packet);
			break;
		case 12:
			/*
			 * Item on npc.
			 */
			itemOnNPC(player, session, packet);
			break;
		}
	}
	
	private void itemOnPlayer(Player player, IoSession session, Packet packet) {
		try {
		packet.readInt();// junk
		int playerId = packet.readShort()    & 0xFFFF;
		int slot     = packet.readLEShortA() & 0xFFFF;
		int id       = packet.readShortA()   & 0xFFFF;
		if(playerId < 0 || playerId >= Constants.PLAYER_CAP) {
			return;
		}
		Player other = World.getInstance().getPlayerList().get(playerId);
		if(other == null) {
			return;
		}
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		ScriptManager.getInstance().call("item_on_player_"+id, player, slot, other);
		} catch(Exception e) {
		}
	}

	private void itemOnNPC(Player player, IoSession session, Packet packet) {
		try {

		packet.readInt(); // junk
		int npcId = packet.readShort()    & 0xFFFF;
		int slot  = packet.readLEShortA() & 0xFFFF;
		int id    = packet.readShortA()   & 0xFFFF;
		if(npcId < 0 || npcId >= Constants.NPC_CAP) {
			return;
		}
		NPC npc = World.getInstance().getNpcList().get(npcId);
		if(npc == null) {
			return;
		}
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		ScriptManager.getInstance().call("item_on_npc_"+id, player, slot, npc);
		} catch(Exception e) {
		}
	}

	private void itemOnObject(final Player player, final IoSession session, final Packet packet) {
		final int objectY = packet.readLEShort() & 0xFFFF;
		final int objectId = packet.readLEShort() & 0xFFFF;
		final int unknown = packet.readShortA() & 0xFFFF;//Value : 128 ? 200;
		final int interfaceId = packet.readShort() & 0xFFFF;
		final int itemId = packet.readShortA() & 0xFFFF;
		final int itemSlot = packet.readShortA() & 0xFFFF;
		final int objectX = packet.readLEShort() & 0xFFFF;
		final int slot = player.getInventory().lookupSlot(itemId);

		player.getCooking().handleItemOnObject(itemId, objectId);
		player.getSmithing().itemOnObject(player,itemId, objectId);
		player.getFarming().handlePatch(objectId, 0, true, itemId);
	}
			int abc2 = 0;
			int abc = 0;
			int abc1 = 0;
	private void itemOnItem(final Player player, final IoSession session, final Packet packet) {
		try {
		final int interfaceIndex = packet.readShort();
		final int junk1 = packet.readLEShortA() & 0xFFFF;
		final int junk2 = packet.readLEShort() & 0xFFFF;
		final int junk3 = packet.readLEShortA() & 0xFFFF;
		final int itemUsed = packet.readLEShortA() & 0xFFFF;
		final int junk4 = packet.readLEShortA() & 0xFFFF;
		final int junk5 = packet.readLEShortA() & 0xFFFF;
		final int usedWith = packet.readLEShort() & 0xFFFF;
Herblore.hb(player, usedWith, itemUsed);
Godsword.makeGWDs(player, usedWith, itemUsed);
Crafting.craft(player, usedWith, itemUsed);
	if (itemUsed == 590 && (usedWith == 1511 || usedWith == 1521 || usedWith == 1519 || usedWith == 1517 || usedWith == 1515 || usedWith == 1513))
		Firemaking.fire(player, 1, usedWith, 100);
	else if (usedWith == 590 && (itemUsed == 1511 || itemUsed == 1521 || itemUsed == 1519 || itemUsed == 1517 || itemUsed == 1515 || itemUsed == 1513))
		Firemaking.fire(player, 1, itemUsed, 0);
if (UseWith(2368,2366,usedWith,itemUsed)) {
player.getSmithing().DragonSquaresmithing(player);
}
if (UseWith(1540,11286,usedWith,itemUsed)) {
player.sm("You made a Dragon Fire Shield and you got some smithing xp.");
player.getSkills().addXp(13, 10000);
player.getInventory().deleteItem(usedWith, 1);
player.getInventory().deleteItem(itemUsed, 1);
player.getInventory().addItem(11283, 1);
}
		} catch(Exception e) {
		}
	}
private boolean UseWith(int Item1, int Item2,int itemUsed,int usedWith) {
if(itemUsed == Item1 && usedWith == Item2 || itemUsed == Item2 && usedWith == Item1) {
return true;
}
return false;
}
	private void itemOperate(Player player, IoSession session, Packet packet) {
		try {
		int interfaceSet = packet.readInt();
		int slot   = packet.readShort();
		int interfaceId  = interfaceSet >> 16;
		int id = packet.readLEShortA();
			if(slot < 0 || slot >= Equipment.SIZE) {
				return;
			}
switch (id) {
case 3840:
player.animate(5864, 0); 
break;
case 10394:
player.animate(5316, 0); 
break;
case 11283:
case 11284:
Player enemy = World.getInstance().getPlayerList().get(player.id);
player.dfs = 120;
enemy.hit(Misc.random(30));
player.animate(6695, 0); 
player.graphics(1164, 0); 
World.getInstance().getProjectileManager().fire(player.getLocation(), enemy.getLocation(), 50, 70, 1166, 43, 31, enemy);
enemy.graphics(1167, 0);
break;
default:
ScriptManager.getInstance().call("item_operate_"+id, player, slot);
break;
}
		} catch(Exception e) {
		}
	}

	private void itemSelect(final Player player, final IoSession session, final Packet packet) {
		final int interfaceId = packet.readShort();
		final int junk = packet.readShort();
		final int id = packet.readShort();
		final int slot = packet.readShortA();
		int itemId = id;
		switch (id) {
			case 139:
			case 141:
			case 143:
			if (player.potDelay == 0) {
			player.getInventory().deleteItem(itemId, 1);
				if (itemId != 143) {
					player.getInventory().addItem(itemId+2, 1);
				} else {
					player.getInventory().addItem(229, 1);
				}
					int abc = (int) ((player.getSkills().getLevelForXp(5)/4) + 7);
					player.getSkills().RestorePray(abc);
					player.animate(829, 0);
					player.combatDelay += 4;
					player.potDelay = 3;
			}
			break; 
			case 4155:
				if(player.slayerMaster == 0) {
	        			player.getActionSender().sendChatboxInterface(241);
	    				player.getActionSender().animateInterface(9850, 241, 2);
	    				player.getActionSender().sendNPCOnInterface(8275, 241, 2);
	    				player.getActionSender().sendString("Duradel", 241, 3);
	    				player.getActionSender().sendString("Hi " + player.getUsername() + ", what are you after?", 241, 4);
					player.slayerMaster = 1;
				} else if(player.slayerMaster < 7 && player.slayerMaster > 0) {
					player.slayerMaster = 0;
				}
			break;


	case 1856:
				player.getActionSender().sendInterface(174, false);
                                        player.getActionSender().sendString("              Getting started", 174, 1);
                                        player.getActionSender().sendString("", 174, 2);
                                        player.getActionSender().sendString("Welcome to CorruptionX, " + player.getUsername() + "!", 174, 3);
                                        player.getActionSender().sendString("All basic supplies can be bought in the shops, ", 174, 4);
                                        player.getActionSender().sendString("the rest is obtained killing players or high leveled bosses.", 174, 5);
                                        player.getActionSender().sendString("To explore the world of CorruptionX,  ", 174, 6);
                                        player.getActionSender().sendString("you use ::commands.", 174, 7);
                                        player.getActionSender().sendString("CorruptionX gets updated regularly,", 174, 8);
                                        player.getActionSender().sendString("you may post your own suggestions on our forum.", 174, 9);
                                        player.getActionSender().sendString("Why don't you get started right now?", 174, 10);
                                        player.getActionSender().sendString("", 174, 11);
                                        player.getActionSender().sendString("", 174, 12);
                                        player.getActionSender().sendString("", 174, 13);
                                        player.getActionSender().sendString("", 174, 14);
                                        player.getActionSender().sendString("", 174, 15);
                                        player.getActionSender().sendString("", 174, 16);
						break;		


			case 2434:
				if (player.potDelay == 0) {
					player.getInventory().deleteItem(itemId, 1);
					player.getInventory().addItem(139, 1);
					int abc = (int) ((player.getSkills().getLevelForXp(5)/4) + 7);
					player.getSkills().RestorePray(abc);
					player.animate(829, 0);
					player.combatDelay += 4;
					player.potDelay = 3;
				}
			break;
			case 199:
			case 201:
			case 203:
			case 205:
			case 207:
			case 209:
			case 211:
			case 213:
			case 215:
			case 217:
			case 219:
				Herblore.CH(player,itemId);
			break;
                        case 10952:
                             player.animate(6083, 0); 
                        break;
			default:
				ScriptManager.getInstance().invoke("item_select_"+id, player, slot);
			break;
		}
	}
	private void itemSummon(final Player player, final IoSession session, final Packet packet) {
		final int interfaceId = packet.readShort();
		final int junk = packet.readShort();
		final int id = packet.readShort();
		final int slot = packet.readShortA();
		switch (id) {
			case 12031:
				GameEngine.summon.SummonStart(player,  12031, true);
			break;
			case 12007:
				GameEngine.summon.SummonStart(player,  12007, true);
			break;
			case 12047:
				GameEngine.summon.SummonStart(player,  12047, true);
			break;
			case 12029:
				GameEngine.summon.SummonStart(player,  12029, true);
			break;
			case 12083:
				GameEngine.summon.SummonStart(player,  12083, true);
			break;
			case 12099:
				GameEngine.summon.SummonStart(player,  12099, true);
			break;
			case 12097:
				GameEngine.summon.SummonStart(player,  12097, true);
			break;
			case 12095:
				GameEngine.summon.SummonStart(player,  12095, true);
			break;
			case 12093:
				GameEngine.summon.SummonStart(player,  12093, true);
			break;
			case 12101:
				GameEngine.summon.SummonStart(player,  12101, true);
			break;
			case 12790:
				GameEngine.summon.SummonStart(player,  12790, true);
			break;
			case 12786:
				GameEngine.summon.SummonStart(player,  12786, true);
			break;
			case 12784:
				GameEngine.summon.SummonStart(player,  12784, true);
			break;
			case 12788:
				GameEngine.summon.SummonStart(player,  12788, true);
			break;
			default:
				ScriptManager.getInstance().invoke("item_summon_"+id, player, slot);
			break;
		}
	}
	@SuppressWarnings("static-access")
	private void lootItem(final Player p, final IoSession session, final Packet packet) {
		final int interfaceId = packet.readInt();
		final int id = packet.readLEShortA();
		packet.readSkip(1);
		final int slot = packet.readShortA();
		switch(id) {
			case 11238:
				if(Misc.random(5) != 0) {
					p.sm("You accidentally shattered the impling jar...");
					p.getInventory().deleteItem(id, 1);
				} else {
					p.sm("You loot the impling jar");
					p.getInventory().deleteItem(id, 1);
					p.getInventory().addItem(p.getHunter().giveItem(), 1);
				}
			break;
		}
	}

	private void take(final Player player, final IoSession session, final Packet packet) {
		final int y = packet.readLEShortA() & 0xFFFF;
		final int id = packet.readShortA() & 0xFFFF;
		final int x = packet.readLEShortA() & 0xFFFF;
		final Location l = Location.location(x, y, player.getLocation().getZ());
		player.getWalkingQueue().reset();
		if (player.getLocation().getX() == x && player.getLocation().getY() == y) {
			if (World.getInstance().getItemManager().groundItemExists(l, id)) {
				final int itemAmount = World.getInstance().getItemManager().getItemAmount(l, id);
				assert itemAmount != -1;
				if (player.getInventory().hasRoomFor(id, itemAmount)) {
					World.getInstance().getItemManager().destroyGroundItem(l, id);
					player.getInventory().addItem(id, itemAmount);
					player.takingitem = 1;
				} else {
					player.getActionSender().sendMessage("Not enough space in your inventory.");
					player.takingitem = 1;
				}
			}
		}
	}



	private void drop(Player player, IoSession session, Packet packet) {
		try {
		packet.readInt(); //interface
		int slot = packet.readShortA(); //slot
		int id = packet.readLEShort(); //dunno
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
			Item item = player.getInventory().getContainer().get(slot);
			player.getInventory().getContainer().set(slot, null);
			player.getInventory().refresh();
			World.getInstance().getItemManager().createGroundItem(player, item);
		} catch(Exception e) {
		}
	}

	private void switchItems2(Player player, IoSession session, Packet packet) {
		int interface1 = packet.readInt() >> 16;
		int fromId = packet.readShort()   & 0xFFFF;
		int toId = packet.readShortA() & 0xFFFF;
		int junk = packet.readInt();
		switch(interface1) {
		case 762:
			/*
			 * Bank.
			 */
			if(fromId < 0 || fromId >= Bank.SIZE || toId < 0 || toId >= Bank.SIZE) {
				break;
			}
			Item temp  = player.getBank().getContainer().get(fromId);
			Item temp2 = player.getBank().getContainer().get(toId);
			player.getBank().getContainer().set(fromId, temp2);
			player.getBank().getContainer().set(toId, temp);
			player.getBank().refresh();
			break;
		case 763:
			/*
			 * Inventory.
			 */
			if(fromId < 0 || fromId >= Inventory.SIZE || toId < 0 || toId >= Inventory.SIZE) {
				break;
			}
			temp  = player.getInventory().getContainer().get(fromId);
			temp2 = player.getInventory().getContainer().get(toId);
			player.getInventory().getContainer().set(fromId, temp2);
			player.getInventory().getContainer().set(toId, temp);
			player.getInventory().refresh();
			break;
		}
	}

	private void itemOption1(Player player, IoSession session, Packet packet) {
		try {
		int interfaceId = packet.readShort();
		int junk = packet.readLEShortA() & 0xFF;
		int itemId = packet.readShortA();
		int slot = packet.readLEShort();
		if(slot < 0 || itemId < 0) {
			return;
		}
		switch(interfaceId) {
		case 387:
			/*
			 * Unequip item.
			 */
			if(slot < Equipment.SIZE) {
				if(!player.getInventory().addItem(itemId, player.getEquipment().get(slot).getAmount())) {
					break;
				}
				player.getEquipment().set(slot, null);
			}
			break;
		case 149:
			if(slot < 0 || slot >= Inventory.SIZE) {
				return;
			}
			if(player.getInventory().getContainer().get(slot).getId() != itemId) {
				return;
			}
			ScriptManager.getInstance().call("item_option_1_"+itemId, player, slot);
			break;
		default:
			//logger.debug("Unhandled item option 1, interface: " + interfaceId + "." + itemId + "." + slot);
			break;
		}
		} catch(Exception e) {
		}
	}

	private void equip(Player player, IoSession session, Packet packet) {
		try {
		int interfaceId = packet.readInt1();
		int itemId = packet.readLEShortA();
		int index = packet.readLEShortA();
		if(index < 0 || index >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(index);
            int cLHunt = Equipment.getCLHunt(item.getDefinition());
            int cLPray = Equipment.getCLPray(item.getDefinition());
            int cLHp = Equipment.getCLHp(item.getDefinition());
            int cLAttack = Equipment.getCLAttack(item.getDefinition());
            int cLDefence = Equipment.getCLDefence(item.getDefinition());
            int cLStrength = Equipment.getCLStrength(item.getDefinition());
            int cLMagic = Equipment.getCLMagic(item.getDefinition());
            int cLRanged = Equipment.getCLRanged(item.getDefinition());
            int cLTheft = Equipment.getCLTheft(item.getDefinition());
           int cLCraft = Equipment.getCLCrafting(item.getDefinition());
           int cLFletch = Equipment.getCLFletching(item.getDefinition());
           int cLSlay = Equipment.getCLSlayer(item.getDefinition());
           int cLfm = Equipment.getCLFiremaking(item.getDefinition());
           int cLfarm = Equipment.getCLFarming(item.getDefinition());
           int cLsmth = Equipment.getCLSmithing(item.getDefinition());
           int cLmine = Equipment.getCLMining(item.getDefinition());
           int cLsum = Equipment.getCLSumm(item.getDefinition());
           int cLcook = Equipment.getCLCooking(item.getDefinition());
           int cLherb = Equipment.getCLHerblore(item.getDefinition());
           int cLfish = Equipment.getCLFishing(item.getDefinition());
           int cLwc = Equipment.getCLWoodcutting(item.getDefinition());
           int cLag = Equipment.getCLAgility(item.getDefinition());
           int cLrc = Equipment.getCLRunecraft(item.getDefinition());
            if (cLherb > player.getSkills().getLevelForXp(15)) {
                player.getActionSender().sendMessage("You need " + cLherb + " Herblore to equip this item.");
                return;
            }
            if (cLcook > player.getSkills().getLevelForXp(7)) {
                player.getActionSender().sendMessage("You need " + cLcook + " Cooking to equip this item.");
                return;
            }
            if (cLfish > player.getSkills().getLevelForXp(10)) {
                player.getActionSender().sendMessage("You need " + cLfish + " Fishing to equip this item.");
                return;
            }
            if (cLwc > player.getSkills().getLevelForXp(8)) {
                player.getActionSender().sendMessage("You need " + cLwc + " Woodcutting to equip this item.");
                return;
            }
            if (cLag > player.getSkills().getLevelForXp(16)) {
                player.getActionSender().sendMessage("You need " + cLag + " Agility to equip this item.");
                return;
            }
            if (cLrc > player.getSkills().getLevelForXp(23)) {
                player.getActionSender().sendMessage("You need " + cLrc + " Runecrafting to equip this item.");
                return;
            }
            if (cLsum > player.getSkills().getLevelForXp(23)) {
                player.getActionSender().sendMessage("You need " + cLsum + " Summoning to equip this item.");
                return;
            }
            if (cLmine > player.getSkills().getLevelForXp(14)) {
                player.getActionSender().sendMessage("You need " + cLmine + " Mining to equip this item.");
                return;
            }
            if (cLsmth > player.getSkills().getLevelForXp(13)) {
                player.getActionSender().sendMessage("You need " + cLsmth + " Smithing to equip this item.");
                return;
            }
            if (cLfarm > player.getSkills().getLevelForXp(19)) {
                player.getActionSender().sendMessage("You need " + cLfarm + " Farming to equip this item.");
                return;
            }
            if (cLHunt > player.getSkills().getLevelForXp(22)) {
                player.getActionSender().sendMessage("You need " + cLHunt + " Hunting to equip this item.");
                return;
            }
            if (cLfm > player.getSkills().getLevelForXp(11)) {
                player.getActionSender().sendMessage("You need " + cLfm + " Firemaking to equip this item.");
                return;
            }
            if (cLSlay > player.getSkills().getLevelForXp(18)) {
                player.getActionSender().sendMessage("You need " + cLSlay + " Slayer to equip this item.");
                return;
            }
            if (cLFletch > player.getSkills().getLevelForXp(9)) {
                player.getActionSender().sendMessage("You need " + cLFletch + " Fletching to equip this item.");
                return;
            }
            if (cLCraft > player.getSkills().getLevelForXp(12)) {
                player.getActionSender().sendMessage("You need " + cLCraft + " Crafting to equip this item.");
                return;
            }
            if (cLTheft > player.getSkills().getLevelForXp(17)) {
                player.getActionSender().sendMessage("You need " + cLTheft + " Theiving to equip this item.");
                return;
            }
            if (cLAttack > player.getSkills().getLevelForXp(0)) {
                player.getActionSender().sendMessage("You need " + cLAttack + " Attack to equip this item.");
                return;
            }
            if (cLHp > player.getSkills().getLevelForXp(3)) {
                player.getActionSender().sendMessage("You need " + cLHp + " Hitpoints to equip this item.");
                return;
            }
            if (cLDefence > player.getSkills().getLevelForXp(1)) {
               player.getActionSender().sendMessage("You need " + cLDefence + " Defence to equip this item.");
                return;
            }
            if (cLStrength > player.getSkills().getLevelForXp(2)) {
                player.getActionSender().sendMessage("You need " + cLStrength + " Strength to equip this item.");
                return;
            }
            if (cLPray > player.getSkills().getLevelForXp(5)) {
                player.getActionSender().sendMessage("You need " + cLPray + " Prayer to equip this item.");
                return;
            }
            if (cLMagic > player.getSkills().getLevelForXp(6)) {
                player.getActionSender().sendMessage("You need " + cLMagic + " Magic to equip this item.");
                return;
            }
            if (cLRanged > player.getSkills().getLevelForXp(4)) {
                player.getActionSender().sendMessage("You need " + cLRanged + " Ranged to equip this item.");
                return;
            }
		if(Equipment.isTwoHanded(item.getDefinition()) && player.getInventory().getFreeSlots() < 1 && player.getEquipment().get(5) != null) {
			player.getActionSender().sendMessage("Not enough free space in your inventory.");
			return;
		}
		if(Equipment.isTwoHanded(item.getDefinition()) && player.getInventory().getFreeSlots() < 1 && player.getEquipment().get(5)  != null) {
			player.getActionSender().sendMessage("Not enough free space in your inventory.");
			return;
		}
		if(item.getDefinition().getId() == itemId) {
			int targetSlot = Equipment.getItemType(itemId);
			if(targetSlot == -1) {
				return;
			}
			player.getInventory().deleteItem(item.getDefinition().getId(), item.getAmount());
			if(targetSlot == 3) {
				if(Equipment.isTwoHanded(ItemDefinition.forId(itemId)) && player.getEquipment().get(5) != null) {
					if(!player.getInventory().addItem(player.getEquipment().get(5).getDefinition().getId(), player.getEquipment().get(5).getAmount())) {
						player.getInventory().addItem(itemId, item.getAmount());
						return;
					}
					player.getEquipment().set(5, null);
				}
			} else if(targetSlot == 5) {
				if( player.getEquipment().get(3) != null && Equipment.isTwoHanded(ItemDefinition.forId(player.getEquipment().get(3).getDefinition().getId()))) {
					if(!player.getInventory().addItem(player.getEquipment().get(3).getDefinition().getId(), player.getEquipment().get(3).getAmount())) {
						player.getInventory().addItem(itemId, item.getAmount());
						return;
					}
					player.getEquipment().set(3, null);
				}
			}
			if(player.getEquipment().get(targetSlot) != null && (itemId != player.getEquipment().get(targetSlot).getDefinition().getId() || !item.getDefinition().isStackable())) {
				player.getInventory().addItem(player.getEquipment().get(targetSlot).getDefinition().getId(), player.getEquipment().get(targetSlot).getAmount());
				player.getEquipment().set(targetSlot, null);
			}
			int oldAmt = 0;
			if(player.getEquipment().get(targetSlot) != null) {
				oldAmt = player.getEquipment().get(targetSlot).getAmount();
			}
			Item item2 = new Item(itemId, oldAmt+item.getAmount());
			player.getEquipment().set(targetSlot, item2);
			
		}
		} catch(Exception e) {
		}
	}

	private void switchItems(final Player player, final IoSession session, final Packet packet) {
        	final int interfaceSet = packet.readInt();
       	packet.skip(1);
        	final int toId = packet.readShortA();
        	final int fromId = packet.readShortA();
        	final int interfaceId = interfaceSet >> 16;

		//System.out.println("ToId: "+toId+" FromId: "+fromId+" INTERFACE: "+interfaceId);
		switch (interfaceId) {
		case 149:
			/*
			 * Switch items in inventory.
			 */
			if (fromId < 0 || fromId >= Inventory.SIZE || toId < 0 || toId >= Inventory.SIZE) {
				break;
			}
			final Item temp = player.getInventory().getContainer().get(fromId);
			final Item temp2 = player.getInventory().getContainer().get(toId);
			player.getInventory().getContainer().set(fromId, temp2);
			player.getInventory().getContainer().set(toId, temp);
			player.getInventory().refresh();
			break;
		default:
			//logger.debug("Unhandled switch items, interface: " + interfaceId + ".");
		break;
		}
	}
}
