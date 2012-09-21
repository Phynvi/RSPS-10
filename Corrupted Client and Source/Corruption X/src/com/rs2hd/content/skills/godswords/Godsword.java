package com.rs2hd.content.skills.godswords;

import com.rs2hd.model.Player;

public class Godsword {
	public static void makeGWDs(Player p, int uw, int id) {
		if(id == 11702 && uw == 11690 || id == 11690 && uw == 11702) {
			p.getInventory().deleteItem(uw, 1);p.getInventory().deleteItem(id, 1);
			p.getInventory().addItem(11694, 1);
			p.sm("You join the hilt and godsword blade into an Armadyl Godsword!");
		} else if(id == 11704 && uw == 11690 || uw == 11704 && id == 11690) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11696, 1);
			p.sm("You join the hilt and godsword blade into a Bandos Godsword!");
		} else if(id == 11706 && uw == 11690 || uw == 11706 && id == 11690) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11698, 1);
			p.sm("You join the hilt and godsword blade into a Saradomin Godsword!");
		} else if(id == 11708 && uw == 11690 || uw == 11708 && id == 11690) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11700, 1);
			p.sm("You join the hilt and godsword blade into a Zamorak Godsword!");
		} else if(id == 11710 && uw == 11712 || uw == 11710 && id == 11712) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11686, 1);
			p.sm("you join the shards together!");
		} else if(id == 11712 && uw == 11714 || uw == 11712 && id == 11714) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11692, 1);
			p.sm("You join the shards together!");
		} else if(id == 11686 && uw == 11714 || uw == 11686 && id == 11714) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11690, 1);
			p.sm("You join the shards together!");
		} else if(id == 11710 && uw == 11692 || uw == 11710 && id == 11692) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11690, 1);
			p.sm("You join the shards together!");
		} else if(id == 11712 && uw == 11688 || uw == 11712 && id == 11688) {
			p.getInventory().deleteItem(id, 1);p.getInventory().deleteItem(uw, 1);
			p.getInventory().addItem(11690, 1);
			p.sm("You join the shards together!");	
		}
	}
}