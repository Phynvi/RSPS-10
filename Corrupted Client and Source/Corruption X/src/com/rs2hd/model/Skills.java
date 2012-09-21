package com.rs2hd.model;

import com.rs2hd.content.LevelUp;

/**
 * Manages the player's skills.
 * @author Graham
 *
 */
public class Skills {
	
	public static final int SKILL_COUNT = 24;
	
	private transient Player player;
	
	public static final double MAXIMUM_EXP = 200000000;
	
	public int level[] = new int[SKILL_COUNT];
	public double xp[] = new double[SKILL_COUNT];

	public static final String[] SKILL_NAME = {
		"Attack", "Defence", "Strength", "Hitpoints", "Range", "Prayer",
		"Magic", "Cooking", "Woodcutting",  "Fletching", "Fishing", "Firemaking",
		"Crafting", "Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer",
		"Farming", "Runecrafting", "Construction", "Hunter", "Summoning",
	};
	
	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2, HITPOINTS = 3, RANGE = 4, PRAYER = 5,
		MAGIC = 6, COOKING = 7, WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11,
		CRAFTING = 12, SMITHING = 13, MINING = 14, HERBLORE = 15, AGILITY = 16, THIEVING = 17, SLAYER = 18,
		FARMING = 19, RUNECRAFTING = 20, CONSTRUCTION = 21, HUNTER = 22, SUMMONING = 23;
	
	public Skills() {
		for(int i = 0; i < SKILL_COUNT; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
	}
	
	public void hit(int hitDiff) {
		try {
		level[3] -= hitDiff;
		if(level[3] < 0) {
			level[3] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	
	public void heal(int hitDiff) {
		try {
		level[3] += hitDiff;
		int max = getLevelForXp(3);
		if(level[3] > max) {
			level[3] = max;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	public void heal(int hitDiff, int max) {
		try {
		level[3] += hitDiff;
		if(level[3] > max) {
			level[3] = max;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	public void RestorePray(int hitDiff) {
		try {
		level[5] += hitDiff;
		int max = getLevelForXp(5);
		if(level[5] > max) {
			level[5] = max;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	public void DrainPray(int hitDiff) {
		try {
		level[5] -= hitDiff;
		if(level[5] < 0) {
			level[5] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	public void drainDefence(int dmg) {
		if(level[1] < 0) {
			level[1] -= dmg;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}	
	public void hitPray(int hitDiff) {
		level[5] -= hitDiff;
		if(level[5] < 0) {
			level[5] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}

	public void reset() {
		try {
		for(int i = 0; i < SKILL_COUNT; i++) {
			if (i != 8 && i != 11 && i != 15) {
			level[i] = 1;
			xp[i] = 0;
			}
		}
		level[3] = 10;
		xp[3] = 1184;
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	
	public void forceReset() {
		try {
		for(int i = 0; i < SKILL_COUNT; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	
	public int getCombatLevel() {
		int attack = getLevelForXp(0);
		int defence = getLevelForXp(1);
		int strength = getLevelForXp(2);
		int hp = getLevelForXp(3);
		int prayer = getLevelForXp(5);
		int ranged = getLevelForXp(4);
		int magic = getLevelForXp(6);
		int combatLevel = 3;
		combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25) + 1; 
		double melee = (attack + strength) * 0.325; 
		double ranger = Math.floor(ranged * 1.5) * 0.325; 
		double mage = Math.floor(magic * 1.5) * 0.325; 
		if (melee >= ranger && melee >= mage) {
			combatLevel += melee;
		} else if (ranger >= melee && ranger >= mage) {
			combatLevel += ranger;
		} else if (mage >= melee && mage >= ranger) {
			combatLevel += mage;
		}
		int summoning = getLevelForXp(Skills.SUMMONING);
		summoning /= 8;
		return combatLevel + summoning;
	}
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}
	
	public int getLevel(int skill) {
		Player player = this.player;
		if (player.RequestAssist().IsAssisting == true) {
			if (player.RequestAssist().AssistedBy != null) {
				Player AssistedBy = player.RequestAssist().AssistedBy;
				if (AssistedBy.RequestAssist().assistSkills[skill] == true)
					player = AssistedBy;
			}
		}
		return player.getSkills().level[skill];
	}
	
	public double getXp(int skill) {
		Player player = this.player;
		if (player.RequestAssist().IsAssisting == true) {
			if (player.RequestAssist().AssistedBy != null) {
				Player AssistedBy = player.RequestAssist().AssistedBy;
				if (AssistedBy.RequestAssist().assistSkills[skill] == true)
					player = AssistedBy;
			}
		}
		return player.getSkills().xp[skill];
	}
    public int getXPForLevel(int level) {
        int points = 0;
        int output = 0;
        for (int lvl = 1; lvl <= level; lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            if (lvl >= level) {
                return output;
            }
            output = (int) Math.floor(points / 4);
       }
       return 0;
    }
	
	public int getLevelForXp(int skill) {
		Player player = this.player;
		if (player.RequestAssist().IsAssisting == true) {
			if (player.RequestAssist().AssistedBy != null) {
				Player AssistedBy = player.RequestAssist().AssistedBy;
				if (AssistedBy.RequestAssist().assistSkills[skill] == true)
					player = AssistedBy;
			}
		}
		
		double exp = player.getSkills().xp[skill];
		int points = 0;
		int output = 0;
		for(int lvl = 1; lvl < 100; lvl++) {
			points += Math.floor((double)lvl + 300.0 * Math.pow(2.0, (double)lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if((output - 1) >= exp) {
				return lvl;
			}
		}
		return 99;
	}
	public void setXp(int skill, double exp) {
		xp[skill] = exp;
		player.getActionSender().sendSkillLevel(skill);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}	
	public void addXp(int skill, double exp) {
		try {
			Player player = this.player;
			if (player.RequestAssist().IsAssisting == true) {
				if (player.RequestAssist().AssistedBy != null) {
					Player AssistedBy = player.RequestAssist().AssistedBy;
					if (AssistedBy.RequestAssist().assistSkills[skill] == true) {
						player = AssistedBy;
						player.RequestAssist().assistSkillsXp[skill] += (int) exp;
						player.RequestAssist().assistTotalXp += (int) exp;
						player.RequestAssist().SetAssistXp(player);
					}
				}
			}
			
		int oldLevel = player.getSkills().getLevelForXp(skill);
		player.getSkills().xp[skill] += exp;
		if(player.getSkills().xp[skill] > MAXIMUM_EXP) {
			player.getSkills().xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = player.getSkills().getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if(newLevel > oldLevel) {
			player.getSkills().level[skill] += levelDiff;
			LevelUp.levelUp(player, skill);
		}
		player.getActionSender().sendSkillLevel(skill);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}

	public void set(int skill, int val) {
		try {
		level[skill] = val;
		player.getActionSender().sendSkillLevel(skill);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		} catch(Exception e) {
		}
	}

}
