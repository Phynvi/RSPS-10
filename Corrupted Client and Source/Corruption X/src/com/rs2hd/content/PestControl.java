package com.rs2hd.content;

import java.util.HashMap;

import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.EntityList;

public class PestControl {
	
	
	public int 		timeLeft = 5;
	
	private Player 		p;
	
	
	
	private EntityList <Player> 	inBoat = new EntityList<Player>();
	private EntityList <Player>		inGame = new EntityList<Player>();
	
	
	
	public PestControl(Player p) {
		this.p = p;
	}
	
	public int peopleWaiting() {
		int a = 0;
		for (Player p : inBoat) {
			  a++;
			}
		return a;
	}
	
	public int peopleInGame() {
		int a = 0;
		for (Player p : inGame) {
			a++;
		}
		return a;
	}
	
	public void makeNewBoatPlayer() {
		inBoat.add(p);
		p.getActionSender().sendOverlay(407);
		refreshWaitingScreen();
		p.teleport(Location.location(2634 , 2653, 0));
	}
	
	public void leavePlayerFromBoat() {
		inBoat.remove(p);
		p.getActionSender().sendCloseInterface();
		p.getActionSender().sendRemoveOverlay();
		refreshWaitingScreen();
		p.teleport(Location.location(2638 , 2653, 0));
		
	}
	
	public void refreshWaitingScreen() {
		for (Player player : inBoat) {
				player.getActionSender().sendString("Players ingame: "+peopleInGame(), 407, 3);
				player.getActionSender().sendString("Next departure: "+timeLeft+" min", 407, 13);
				player.getActionSender().sendString("Players ready: "+peopleWaiting(), 407, 14);
				player.getActionSender().sendString("Points: "+p.pPoints, 407, 16);
				player.getActionSender().sendOverlay(407);
		}
	}
	
	public void startNewGame() {
		for (Player p : inBoat) {
			p.teleport(Location.location(3200, 3200, 0));
			p.getActionSender().sendMessage("A new pest control game has been started");
			inGame.add(p);
		}
		inBoat.clear();
	}

}
