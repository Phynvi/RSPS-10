package com.rs2hd.content.minigames;

import com.rs2hd.model.Player;
import com.rs2hd.model.NPC;
import com.rs2hd.model.World;

/**
 * Level bountyhunter.
 * @author Dragonkk
 *
 */
public class Barrows {
private static Player player;
private static int dharoks = 0;
private static int guthans = 0;
private static int torags = 0;
private static int veracs = 0;
private static int karils = 0;
private static int ahrim = 0;

public static void spawnNpc(int objectid) {
	switch(objectid) {
		case 6771:
			int id = Integer.valueOf(2026);
			NPC npc = new NPC(id);
			npc.readResolve();
			npc.setLocation(player.getLocation());
			World.getInstance().getNpcList().add(npc);
		break;
		default:
		break;
		}
	}
public static void enter(int tombid) {
	//player.tele(tombid);
	}
public static void exit() {
	//player.tele(previousmound);
	}
public static int spawnlocation(int npcid) {
	switch(npcid) {
		case 2026:
		break;
		default:
		break;
		}
		return 0;
		}
	}