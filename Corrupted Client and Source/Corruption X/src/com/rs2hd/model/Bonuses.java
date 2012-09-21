package com.rs2hd.model;

public class Bonuses {
	
	public static final String[] BONUS_NAMES = new String[] {
		"Stab", "Slash", "Crush", "Magic", "Range", "Stab", "Slash", "Crush", "Magic", "Range", "Strength", "Prayer", "Ranged Str."
	};
	
	public static int SIZE = 13;
	public static int LoadSize = 14;
	private Player player;
	private int[] bonuses = new int[SIZE];
	public int[] weight = new int[1];
	public Bonuses(Player player) {
		this.player = player;
	}

	public void refresh() {
		try {
		if (player.getEquipment().isWieldingKnives())
		LoadSize = 13;
		else
		LoadSize = 14;
		for(int i = 0; i < SIZE; i++) {
			bonuses[i] = 0;
		}
		for(int i = 0; i < LoadSize; i++) {
			Item item = player.getEquipment().getContainer().get(i);
			if(item != null) {
				for(int j = 0; j < SIZE; j++) {
					bonuses[j] += item.getDefinition().getBonus(j);
				}
			}
		}
		player.getActionSender().sendBonus();
		} catch(Exception e) {
		}
	}
	public void refreshWeight() {
		double realweight = 0;
		for(int i = 0; i < 14; i++) {
			Item item = player.getEquipment().getContainer().get(i);
			if(item != null) {
				realweight += item.getDefinition().getWeightWearing();
			}
		}
		for(int i = 0; i < 28; i++) {
			Item item = player.getInventory().getContainer().get(i);
			if(item != null) {
				realweight += item.getDefinition().getWeightIventory();
			}
		}
		weight[0] = (int)realweight;
	}
	public int[] getBonuses() {
		return bonuses;
	}
	
	public int getBonus(int i) {
		try {
		return bonuses[i];
		} catch(Exception e) {
		return 0;
		}
	}

}
