package com.rs2hd.model;

import com.rs2hd.GameEngine;


/**
 * Represents a trade between two players.
 * @author Graham
 *
 */
public class ItemInformation {
	private Player player;

	public ItemInformation(Player player) {
		this.player = player;
	}

	public void GetInformation(Player player, int id) {
		try {
			if(player == null) {
			return;
			}
ItemDefinition def = ItemDefinition.forId(id);

if (def == null) {
return;
}
int ItemId = def.getId();
int Value = GameEngine.prices.getMaximumPrice(ItemId);
int EquipInfo = def.getEquipId();
String Examine = def.getExamine();
player.getActionSender().sendSpecialConfig(741, ItemId); //itemid
player.getActionSender().sendSpecialConfig(743, 995); //coins
player.getActionSender().sendAccessMask(30, 449, 15, -1, -1); //mask options buy
player.getActionSender().sendSpecialConfig(744, 0);
player.getActionSender().sendSpecialConfig(745, Value);
player.getActionSender().sendInfoString(Examine,25);
if (EquipInfo != -1) {
if (GetRequirement(player,def) != " ") {
//start on requiriments
player.getActionSender().sendInfoString("<br>Worn on yourself, requiring:"+GetRequirement(player,def), 26);
}else{
player.getActionSender().sendInfoString(" ", 26);
}
player.getActionSender().sendInfoString(" ",34);
//start on bonus
player.getActionSender().sendInfoString("<br>Attack<br><col=ffff00>+"+def.getBonus(0)+"<br><col=ffff00>+"+def.getBonus(1)+"<br><col=ffff00>+"+def.getBonus(2)+"<br><col=ffff00>+"+def.getBonus(3)+"<br><col=ffff00>+"+def.getBonus(4)+"<br><col=ffff00>---<br>Strength<br>Ranged Strength<br>Prayer bonus",35);

player.getActionSender().sendInfoString("<br><br>Stab<br>Slash<br>Crush<br>Magic<br>Ranged<br>Summoning",36);

player.getActionSender().sendInfoString("<<br>Defence<br><col=ffff00>+"+def.getBonus(5)+"<br><col=ffff00>+"+def.getBonus(6)+"<br><col=ffff00>+"+def.getBonus(7)+"<br><col=ffff00>+"+def.getBonus(8)+"<br><col=ffff00>+"+def.getBonus(9)+"<br><col=ffff00>--<br><col=ffff00>+"+def.getBonus(10)+"<br><col=ffff00>+"+def.getBonus(12)+"<br><col=ffff00>+"+def.getBonus(11),52);
}else{
player.getActionSender().sendInfoString(" ", 26);
}
player.getActionSender().sendSpecialConfig(746, -1);
player.getActionSender().sendSpecialConfig(168, 98);
		} catch(Exception e) {
		}
	}
	public String GetRequirement(Player player, ItemDefinition def) {
int lvlreq = 1;
lvlreq = Equipment.getCLRanged(def);
if (lvlreq != 1) {
return "<br><col=00ff00>Level "+lvlreq+" Ranged";
}
lvlreq = Equipment.getCLMagic(def);
if (lvlreq != 1) {
return "<br><col=00ff00>Level "+lvlreq+" Magic";
}
lvlreq = Equipment.getCLStrength(def);
if (lvlreq != 1) {
return "<br><col=00ff00>Level "+lvlreq+" Strength";
}
lvlreq = Equipment.getCLAttack(def);
if (lvlreq != 1) {
return "<br><col=00ff00>Level "+lvlreq+" Attack";
}
lvlreq = Equipment.getCLDefence(def);
if (lvlreq != 1) {
return "<br><col=00ff00>Level "+lvlreq+" Defence";
}

return " ";
}


}
