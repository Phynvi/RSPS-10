package com.rs2hd.content.skills.herblore;

import com.rs2hd.model.Player;
/*
 * Author Dragonkk np not finished
 */
public class Herblore {
	public static void hb(Player p, int usedWith, int itemUsed) {
		int[] vial = { 227 };
		int[] herbs = { 249, 251, 253, 255, 257, 259, 261, 263, 265, 267, 269 };
		int[] UnfPot = { 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111 };
		int UnfXP[] = { 321, 5042, 285, 427, 529, 545, 232, 587, 569 };
		// Herblore Unfpots
		for (int i = 0; i < herbs.length; i++) {
			if (itemUsed == vial[0] && usedWith == herbs[i] || usedWith == vial[0] && itemUsed == herbs[i]) {
				p.getSkills().addXp(15, UnfXP[i]);
				p.animate(363);
				p.getInventory().deleteItem(vial[0], 1);
				p.getInventory().deleteItem( herbs[i], 1);
				p.getInventory().addItem(UnfPot[i], 1);
			}
		}
		// End Herblore Unfpots
		// Herblore Pots
		int[] item2 = { 221, 235, 225, 223, 231, 221, 231, 241, 245, 247 };
		int[] FinPot = { 121, 3042, 115, 127, 139, 145, 112, 187, 169 };
		int[] FinLVL = { 3, 75, 12, 22, 38, 45, 1, 60, 72};
		int FinXP[] = { 321, 5042, 285, 427, 529, 545, 232, 587, 569 };
		for (int i = 0; i < item2.length; i++) {
			if (itemUsed == UnfPot[i] && usedWith == item2[i] || usedWith == UnfPot[i] && itemUsed == item2[i])  {
			if (p.getSkills().getLevel(15) >= FinLVL[i]) {
				p.getSkills().addXp(15, FinXP[i]);
				p.animate(363);
				p.getInventory().deleteItem( item2[i], 1);
				p.getInventory().deleteItem( UnfPot[i], 1);
				p.getInventory().addItem( FinPot[i], 1);
			}else{
				p.sm("You dont have herblore level for make this potion.");
			}

			}
		}
		// End Herblore Pots
	}

	public static void CH(Player p, int itemId) {
		
		int[] grimy = {199, 201, 203, 205, 207, 209, 211, 213, 215, 217, 219};
		int[] clean = {249, 251, 253, 255, 257, 259, 261, 263, 265, 267, 269};
		int cleanXP[] = { 321, 5042, 285, 427, 529, 545, 232, 587, 569 };
		for(int i = 0; i < grimy.length; i++) {
			if (itemId == grimy[i]) {
				p.getInventory().deleteItem(grimy[i], 1);
				p.getSkills().addXp(15, cleanXP[i]);
				p.getInventory().addItem(clean[i], 1);
				p.sm("You cleaned the herb!");
			}
		}

}

}