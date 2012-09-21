package com.rs2hd.content;

public class pvpdrops {

private static int food[] = {-1};

private static int armour[] = {/*Adamant Start*/1161, 1073, 1091, 1123, 1199, 1183, 1185/*Adamant end*/, /*Rune start*/1079, 1093, 1127, 1163, 1201, 1079, 1093, 1127, 1163, 1201/*Rune end*/, 13858, 13861, 13864, 13867, 13870, 13873, 13876, 13879, 13883, 13884, 13890, 13896, 13902, 13887, 13893, 13899, 13905};

private static int randomitems[] = {-1};

public static int stackables[] = {-1};

public static int cash[] = {995};

public static int foodDrop() {
	return food[(int)(Math.random() * (double)food.length)];
}
public static int armourDrop() {
	return armour[(int)(Math.random() * (double)armour.length)];
}
public static int randDrop() {
	return randomitems[(int)(Math.random() * (double)randomitems.length)];
}
public static int stackableDrop() {
	return stackables[(int)(Math.random() * (double)stackables.length)];
}
public static int cashDrop() {
	return cash[(int)(Math.random() * (double)cash.length)];
}
}