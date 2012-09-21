package rs2hd.rs2.player.minigames;

import com.rs2hd.model.Player;
import com.rs2hd.util.Misc;


public class ClanWars {
	private Player player;
	public ClanWars() {
		player.clanWaitDelay = 20;
		player.clanFightDelay = 10;
	}

	public static void process() {
		if (player.clanWaitDelay > 0)
			player.clanWaitDelay--;
		if (player.clanFightDelay > 0)
			player.clanFightDelay--;
		for (Player pl : World.getInstance().getPlayerList()) {
			if (pl != null) {
				if (player.clanFightDelay == 0) {
					if (pl.clanWarsFightArea()) {
						pl.blackTeam = false;
						pl.whiteTeam = false;
						pl.whiteCount = pl.blackCount = 0;
						pl.setCoords(3266 + Misc.random(3), 3683 + Misc.random(3), 0);
						pl.getActionSender.removeTab();
					}
				}
			}
			player.clanFightDelay = 140;
		}
		for (Player p : World.getInstance().getPlayerList()) {
			if (p != null) {
				if (player.clanWaitDelay == 0) {
					if (p.blackTeam) {
						p.setCoords(3299 + Misc.random(3), 3725 + Misc.random(3), 0);
					}
					if (p.whiteTeam) {
						p.setCoords(3299 + Misc.random(3), 3725 + Misc.random(3), 0);
					}
					if (p.whiteTeam || p.blackTeam) {
						p.getActionSender().sendString(""+Server.engine.getWhiteClanPlayerCount(p.whiteCount)+"", 265, 6);
						p.getActionSender().sendString(""+Server.engine.getBlackClanPlayerCount(p.blackCount)+"", 265, 7);
						if(p.isFullScreen()) {
							p.getActionSender().sendInterface(1, 746, 5, 265);
						} else {
							p.getActionSender().sendInterface(1, 548, 1, 265);
						}
					}
					return;
				}
			}
 			player.clanWaitDelay = 150;
		}
	}
}