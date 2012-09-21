package com.rs2hd.update;

import com.rs2hd.model.Player;

/*
*handles update screen
*/

public class Update {
	private static Player player;
public static void showScreen() {
	player.getActionSender().sendInterface(275);
		for(int i = 0; i < 316; i++) {
			player.getActionSender().sendString("",275,i);
		}
	}
}