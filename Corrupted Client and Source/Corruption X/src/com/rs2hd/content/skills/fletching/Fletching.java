package com.rs2hd.content.skills.fletching;

import com.rs2hd.model.Player;
/*
 * Author Caelum
 */
public class Fletching {
	public static void cutbow(Player p, int usedWith, int itemUsed) {

		int[] knife = { 946, 5605 };
		@SuppressWarnings("unused")
		int[] sacredknife = { 14111, 14103 };
		int[] logs = { };
		int[] shortbow = { };
		int[] longbow = { };
		int shortXP[] = {  };
		int longXP[] = {  };
		int[] shortLVL = { };
		int[] longLVL = { };

		//if(p.fletchingShort == true){
		for (int i = 0; i < logs.length; i++) {
			if (itemUsed == knife[0] && usedWith == logs[i] || usedWith == knife[0] && itemUsed == logs[i])  {
			if (p.getSkills().getLevel(9) >= shortLVL[i]) {
				p.getSkills().addXp(9, shortXP[i]);
				p.animate(885);
				p.getInventory().deleteItem( logs[i], 1);
				p.getInventory().addItem( shortbow[i], 1);
			} else {
				p.sm("You need a fletching level of " + shortLVL +" to cut this shortbow.");
				}
		} else {
		for (int j = 0; j < logs.length; j++) {
			if (itemUsed == knife[0] && usedWith == logs[i] || usedWith == knife[0] && itemUsed == logs[i])  {
			if (p.getSkills().getLevel(9) >= longLVL[i]) {
				p.getSkills().addXp(9, longXP[i]);
				p.animate(885);
				p.getInventory().deleteItem( logs[i], 1);
				p.getInventory().addItem( longbow[i], 1);
			} else {
				p.sm("You need a fletching level of " + longLVL +" to cut this longbow.");
							}
						}
					}
				}
			}
		}
	}
//}

