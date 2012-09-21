package com.rs2hd.content.skills.crafting;

import com.rs2hd.model.Player;
/*
 * Author Dragonkk np not finished
 */
public class Crafting {
	public static void craft(Player p, int usedWith, int itemUsed) {

		int[] chisel = { 1755 };
		int[] gems = { 1625, 1627, 1629, 1623, 1621, 1619, 1617, 1631, 6571 };
		int[] cutgem = { 1609, 1611, 1613, 1607, 1605, 1603, 1601, 1615, 6573 };
		int FinXP[] = { 500, 625, 750, 850, 1000, 1250, 1500, 2000, 3000 };
		int[] FinLVL = { 1, 13, 16, 20, 27, 34, 43, 55, 67 };
		for (int i = 0; i < gems.length; i++) {
			if (itemUsed == chisel[0] && usedWith == gems[i] || usedWith == chisel[0] && itemUsed == gems[i])  {
			if (p.getSkills().getLevel(12) >= FinLVL[i]) {
				p.getSkills().addXp(12, FinXP[i]);
				p.animate(885);
				p.getInventory().deleteItem( gems[i], 1);
				p.getInventory().addItem( cutgem[i], 1);
			}else{
				p.sm("You need a crafting level of " + FinLVL +" to cut this gem.");
				}
			}
		}
	}
}