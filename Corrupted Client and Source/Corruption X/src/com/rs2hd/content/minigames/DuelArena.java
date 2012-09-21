package rs2hd.rs2.player.minigames;

import rs2hd.rs2.*;
import rs2hd.rs2.util.*;
import rs2hd.rs2.player.*;


public class DuelArena {

	Player p;

	/**
	 * class constructor
	 */
	public DuelArena(Player p) {
		this.p = p;
	}

	/**
	 * Initializes duel accepting.
	 */
	public void initializeDuelAcception() {
		Player player = Server.engine.players[p.duelFriend];
		if (p == null || player == null) {
			p.duelFriend = 1;
			return;
		}
		if (!p.duelScreen1 && !p.duelScreen2) {
			player.duelFriend = p.playerId;
		}
		if (!p.duelScreen1 && !p.duelScreen2) {
			p.frames.showInterface(p, 637);
			player.frames.showInterface(player, 637);
			p.frames.setString(p, ""+player.username+"", 637, 16);
			player.frames.setString(player, ""+p.username+"", 637, 16);
			p.frames.setString(p, ""+player.combatLevel+"", 637, 18);
			player.frames.setString(player, ""+p.combatLevel+"", 637, 18);
			p.duelScreen1 = p.duelScreen2 = true;
			player.duelScreen1 = player.duelScreen2 = true;
		}
		
	}

	/**
	 * Activates every 600MS
	 */
	public void process() {
		if (p.duelScreen1) {
			Player player = Server.engine.players[p.duelFriend];
			if (player != null) {
				if (player == null) {
					p.duelFriend = 0;
					return;
				}
				if (!p.acceptDuel && p.acceptScreen1 && !player.acceptScreen1) {
					player.frames.sendMessage(player, "The other player has accepted the duel.");
					p.acceptDuel = true;
				}
				if (p.acceptDuel && p.acceptScreen1 && player.acceptScreen1) {
					p.setCoords(3380 + Misc.random(5), 3232 + Misc.random(5), 0);
					player.setCoords(3369 + Misc.random(6), 3232 + Misc.random(6), 0);
					p.countDelay = player.countDelay = 3;
					p.countType = player.countType = 3;
					p.frames.removeShownInterface(p);
					player.frames.removeShownInterface(player);
					player.duelFriend = p.playerId;
					p.acceptDuel = player.acceptDuel = p.acceptScreen1 = player.acceptScreen1 = false;
				}
			}
		}
	}

	/**
	 * Resets dueling.
	 */
	public void resetDuelSettings() {
		p.acceptDuel = p.acceptScreen1 = p.acceptScreen2 = false;
		p.duelScreen1 = p.duelScreen2 = false;
	}

	/**
	 * Resets dueling.
	 */
	public void resetDuelSettings1() {
		p.duelFriend = 0;
		p.acceptDuel = p.acceptScreen1 = p.acceptScreen2 = false;
		p.duelScreen1 = p.duelScreen2 = false;
	}

}