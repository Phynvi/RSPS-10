package com.rs2hd.content.skills.smithing;

import com.rs2hd.model.Player;
/*
 * Author Dragonkk np not finished
 */
public class Smelting {
	public static void craft(Player p, int usedWith, int itemUsed) {

		int[] chisel = { 1755 };
		int[] gems = { 1623, 1621, 1619 ,1629 ,1631 };
		int[] cutgem = { 1607, 1605, 1603 ,1613 ,1615 };
		@SuppressWarnings("unused")
		int[] UnfXP = { 100, 350, 670, 1250 ,500 };
		int[] FinLVL = { 1, 1, 1, 1, 1};
		for (int i = 0; i < gems.length; i++) {
			if (itemUsed == chisel[i] && usedWith == gems[i] || usedWith == chisel[i] && itemUsed == gems[i])  {
			if (p.getSkills().getLevel(15) >= FinLVL[i]) {
				//p.getSkills().addXp(15, FinXP);
				p.animate(363);
				p.getInventory().deleteItem( gems[i], 1);
				p.getInventory().addItem( cutgem[i], 1);
			}else{
				p.sm("You dont have crafting to cut this gem.");
			}

			}
		}
		// End Herblore Pots
	}
}