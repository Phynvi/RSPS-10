package com.rs2hd.content.skills.summoning;

import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Player;

/**
* Great but can be done better gotta remake
 *
 */
public class SummonTrainscroll {
	@SuppressWarnings("unused")
	private Player player;
	public SummonTrainscroll(Player player) {
		this.player = player;
	}

	public void CreateScroll(Player p, int lvl, int ShardAmt, int CharmId, int MasterItem, int MasterItem2, int Create, int xp) {

if(p.getSkills().getLevelForXp(23) < lvl) { //check lvl
p.sm("You do not have a high enough Summoning level to create this Summoning pouch.");
return;
}

if(MasterItem2 != -1 && p.getInventory().contains(MasterItem2) == false)  {//check second master item
p.sm("You do not have all the materials to make these Summoning pouches.");
ItemDefinition charm = ItemDefinition.forId(CharmId);
ItemDefinition masteritem = ItemDefinition.forId(MasterItem);
ItemDefinition masteritem2 = ItemDefinition.forId(MasterItem2);
p.sm("This pouch requires 1set of 1 "+masteritem2.getName()+", 1 "+masteritem.getName()+", 1 "+charm.getName()+" and "+ShardAmt+" spirit shards.");
return;
}

if(p.getInventory().contains(12155) == false || p.getInventory().contains(12183, ShardAmt) == false || p.getInventory().contains(CharmId) == false || p.getInventory().contains(MasterItem) == false)  {//check all otheritems
p.sm("You do not have all the materials to make these Summoning pouches.");
ItemDefinition charm = ItemDefinition.forId(CharmId);
ItemDefinition masteritem = ItemDefinition.forId(MasterItem);
p.sm("This pouch requires 1set of 1 "+masteritem.getName()+", 1 "+charm.getName()+" and "+ShardAmt+" spirit shards.");
return;
}

p.getInventory().deleteItem(12155, 1);
p.getInventory().deleteItem(12183, ShardAmt);
p.getInventory().deleteItem(CharmId, 1);
p.getInventory().deleteItem(MasterItem, 1);
if(MasterItem2 != -1) {
p.getInventory().deleteItem(MasterItem2, 1);
}
p.getInventory().addItem(Create, 1);
p.getSkills().addXp(23, xp);
p.sm("You have created a Summoning pouch and you get some xp.");
}

}
