package com.rs2hd.content.skills.firemaking;

import java.util.ArrayList;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Firemaking {
	
	private static ArrayList<Fire> fires = new ArrayList<Fire>(50); // list of fires
	
	public static void fire(final Player player, int lvl, final int log, final int xpGain) {
		if(player.getSkills().getLevel(11) < findLvl(log)) {
  			player.getActionSender().sendMessage("You need a firemaking level of "+findLvl(log)+" light this log.");
			return;
 		}
		if (player.isBusy()) {
				return;
		}
			
		player.setBusy(true);
		player.animate(733);
		
		World.getInstance().registerEvent(new Event(2100) {
			
			@Override
			public void execute() {
				int objectX = player.getLocation().getX();
				int objectY = player.getLocation().getY();
				int firstX = objectX - (player.getLocation().getRegionX() - 6) * 8;
			    	int firstY = objectY - (player.getLocation().getRegionY() - 6) * 8;
			    player.getActionSender().sendCreateGlobalObject(2732, player.getLocation().getZ(), player.getLocation().getX(), player.getLocation().getY(), 0, 10);
				player.getActionSender().sendMessage("You light the logs.");
				player.getSkills().addXp(11, findXP(log));
				player.getInventory().deleteItem(log, 1);
				
			    player.getWalkingQueue().reset();
				player.animate(-1);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				player.setBusy(false);
				player.getWalkingQueue().reset();
				player.getWalkingQueue().addToWalkingQueue(firstX - 1, firstY);
				fires.add(new Fire(player, objectX, objectY));
				this.stop();
			}

		});
		
	}
	
	
	
	// find amount of XP to add for making specific fire
	private static int findXP(int logID)
	{
		switch (logID)
		{
			case 1511:
				return 250;
			case 1521:
				return 342;
			case 1519:
				return 433;
			case 1517:
				return 510;
			case 1515:
				return 598;
			case 1513:
				return 802;
			default:
				return 0;
		}
	}
	
	// find the level req for making specific fire
	private static int findLvl(int logID)
	{
		switch (logID)
		{
			case 1511:
				return 0;
			case 1521:
				return 15;
			case 1519:
				return 30;
			case 1517:
				return 45;
			case 1515:
				return 60;
			case 1513:
				return 75;
			default:
				return 0;
		}
	}

}
