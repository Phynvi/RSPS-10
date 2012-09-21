package com.rs2hd.content;

import com.rs2hd.model.Equipment;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;

/**
 * Handles skill cape trimming.
 * @author Caelum
 *
 */
public class TrimCape {
	
		public boolean isSkillcape(final int capeId) {
			switch(capeId) {
			case 9747:
			case 9753:
			case 9750:
			case 9768:
			case 9756:
			case 9759:
			case 9762:
				return true;
			}
				return false;
			}
		}
	/**
	 * Handles a skill cape emote: checks appropriate levels,
	 * finds the correct animation + graphic, etc.
	 * @param player
	 */
	public static void trim(Player player) {
		Item cape = player.getEquipment().get(Equipment.SLOT_CAPE);
		if(player.maxedSkills > 2) {
			cape.getId() + 1;
		} else {
			cape.getId();
		}
	}
