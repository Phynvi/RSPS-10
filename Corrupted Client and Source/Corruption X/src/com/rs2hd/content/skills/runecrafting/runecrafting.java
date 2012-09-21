package com.rs2hd.content.skills.runecrafting;

import com.rs2hd.model.Player;
/*
* Author Caelum 100%
*/

public class runecrafting {
	private static Player p;

	public static void runecraft(int lvl, int experience, int rune, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) {
	if (p.getSkills().getLevelForXp(20) < lvl) {
		p.sm("You do not have enough runecrafting level to craft this.");
			p.sm("You need at least "+lvl+" to runecraft this.");
			return;
		}
		if (!p.getInventory().contains(1436)) {
			p.sm("You do not have any rune essence to craft.");
	 		return;
		}
		int essence = p.getInventory().numberOf(1436);
		if (p.getSkills().getLevelForXp(20) >= lvl) {
			if (p.getSkills().getLevelForXp(20) >= a2 && p.getSkills().getLevelForXp(20) < a3)
				essence = p.getInventory().numberOf(1436) * 2;
			if (p.getSkills().getLevelForXp(20) >= a3 && p.getSkills().getLevelForXp(20) < a4)
				essence = p.getInventory().numberOf(1436) * 3;
			if (p.getSkills().getLevelForXp(20) >= a4 && p.getSkills().getLevelForXp(20) < a5)
				essence = p.getInventory().numberOf(1436) * 4;
			if (p.getSkills().getLevelForXp(20) >= a5 && p.getSkills().getLevelForXp(20) < a6)
				essence = p.getInventory().numberOf(1436) * 5;
			if (p.getSkills().getLevelForXp(20) >= a6 && p.getSkills().getLevelForXp(20) < a7)
				essence = p.getInventory().numberOf(1436) * 6;
			if (p.getSkills().getLevelForXp(20) >= a7 && p.getSkills().getLevelForXp(20) < a8)
				essence = p.getInventory().numberOf(1436) * 7;
			if (p.getSkills().getLevelForXp(20) >= a8 && p.getSkills().getLevelForXp(20) < a9)
				essence = p.getInventory().numberOf(1436) * 8;
			if (p.getSkills().getLevelForXp(20) >= a9 && p.getSkills().getLevelForXp(20) < a10)
				essence = p.getInventory().numberOf(1436) * 9;
			if (p.getSkills().getLevelForXp(20) >= a10);
				essence = p.getInventory().numberOf(1436) * 10;
		}
		for (int i = 0; i < 29; i++)
		p.getInventory().deleteItem(1436, i);
		p.getInventory().addItem(rune, essence);
		p.getSkills().addXp(20, experience*essence);
		p.graphics(186, 0);
		p.animate(791, 0);
		return;
	}
}