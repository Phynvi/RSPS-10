package com.rs2hd.content;

import com.rs2hd.GameEngine;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.event.*;

public class RingTeleing {
    private Player player;

    public RingTeleing(Player player) {
        this.player = player;
    }

    public void duelRing() {
        player.getActionSender().sendString("Where would you like to teleport to?", 234, 1);
        player.getActionSender().sendString("Al Kharid Duel Arena.", 234, 2);
        player.getActionSender().sendString("Castle Wars Arena.", 234, 3);
        player.getActionSender().sendString("Mobilising Armies Command Centre.", 234, 4);
        player.getActionSender().sendString("Fist of Guthix.", 234, 5);
        player.getActionSender().sendString("Nowhere.", 234, 6);
        player.getActionSender().sendChatboxInterface(234);
        player.itemChat[1] = 2552;
    }

    public void teleCW() {
        player.graphics(1684, 0);
        player.animate(9603, 0);
		World.getInstance().registerEvent(new Event(1800) { 
			public void execute() {
				player.tele(2441, 3090, 0);
				this.stop();
			}
		});
    	}
}
