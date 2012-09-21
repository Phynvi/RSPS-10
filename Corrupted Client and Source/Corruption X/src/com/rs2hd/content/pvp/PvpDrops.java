package com.rs2hd.content.pvp;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * Handles PvP random drops.
 * @author Carl
 *
 */
public class PvpDrops {

	public static int PvPItems[] = {
		/**
		 * Pvp Items
		 */
		13858, 13861, 13864, 13870, 13873, 13876, 13884, 13887,
		13890, 13893, 13896, 13899, 13902, 13905, 
		/**
		 * Dragon Daggers so it doesn't
		 * always drop a pvp Items
		 */
		4747, 4749, 4749, 4751, 4751, 4753, 4753, 4755, 		
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		4755
	};

	public static int PvPItems(){
        	return PvPItems[(int)(Math.random() * (double)PvPItems.length)];
	}

	public static int PvPItems2[] = {
		/**
		 * Pvp Items
		 */
		13858, 13861, 13864, 13870, 13873, 13876, 13884, 13887,
		13890, 13893, 13896, 13899, 13902, 13905, 391, 385, 397,
		
		/**
		 * Dragon Daggers so it doesn't
		 * always drop a pvp Items
		 */
		4747, 4749, 4749, 4751, 4751, 4753, 4753, 4755, 		
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		4755
	};

	public static int PvPItems2(){
        	return PvPItems2[(int)(Math.random() * (double)PvPItems2.length)];
	}


	public static int TargetDrop[] = {
		/**
		 * Pvp Items
		 */
		13858, 13861, 13864, 13870, 13873, 13876, 13884, 13887,
		13890, 13893, 13896, 13899, 13902, 13905, 
		/**
		 * Some Barrows so it doesn't
		 * always drop a pvp Items
		 */
		4747, 4749, 4749, 4751, 4751, 4753, 4753, 4755, 		
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698,
		4755
	};

	public static int TargetDrop(){
        	return TargetDrop[(int)(Math.random() * (double)TargetDrop.length)];
	}


	public static int Foods[] = {
		/*
		 * Only Sharks and Mantays what else :P
		 */
		385, 391
	};

	public static int Foods(){
        	return Foods[(int)(Math.random() * (double)Foods.length)];
	}


	public static int OtherItems[] = {
		/*
		 * Low drop because of low potential
		 * so some rune items and cheap items
		 */
		1163, 1163, 1333, 1333, 1113, 1113, 5698, 5698, 1123,
		1123, 1123, 2501, 2501, 2501, 2495, 2495, 2495, 1185,
		1185, 1185, 4587
	};

	public static int OtherItems(){
        	return OtherItems[(int)(Math.random() * (double)OtherItems.length)];
	}


	public static int OtherItems2[] = {
		/*
		 * Soso drop because of an good
		 * amount of potential
		 * contain some dragon items
		 * infinity and some more
		 */
		1079, 1079, 1127, 1127, 5698, 5698, 2503, 2503, 2503,
		2497, 2497, 2497, 6912, 6912, 6912, 6916, 6918, 6918,
		6920, 6920, 6920, 6922, 6922, 6922, 6924, 6924, 6924,
		1187, 1187, 4587, 4587, 4587, 4585, 4585, 4585, 4087,
		4087, 4087, 4091, 4091, 4091, 4093, 4093, 4093, 4101, 
		4101, 4101, 4103, 4103, 4103, 4111, 4111, 4111, 4113,
		4113, 4113
	};

	public static int OtherItems2(){
        	return OtherItems2[(int)(Math.random() * (double)OtherItems2.length)];
	}


	public static int OtherItems3[] = {
		/*
		 * Good drop because of an very high
		 * amount of potential
		 * contain whip, dfs, barrows :P!!
		 */
		4151, 4151, 11284, 4708, 4708, 4710, 4710, 4712, 4712,
		4714, 4714, 4716, 4716, 4718, 4718, 4720, 4720, 4722,
		4722, 4724, 4724, 4726, 4726, 4728, 4728, 4730, 4730, 
		4732, 4732, 4736, 4736, 4738, 4738, 4745, 4745, 4747, 
		4747, 4749, 4749, 4751, 4751, 4753, 4753, 4755, 4755, 
		4757, 4757, 4759, 4759, 6914, 6914, 3140, 3140, 3140,
		14479, 14479
	};

	public static int OtherItems3(){
        	return OtherItems3[(int)(Math.random() * (double)OtherItems3.length)];
	}

}