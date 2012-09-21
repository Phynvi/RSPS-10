package com.rs2hd.model;

import com.rs2hd.util.Misc;
import com.rs2hd.GameEngine;
public class InputHandler {
	
	private Player p;
	public int inputId = -1;
	public int inputItemId = 0;
	public int inputItemIndex = 0;
	public InputHandler(Player player) {
		this.p = player;
	}
	public void handleInput(int id) {
		if (inputId > -1) {//Prevents Nullpointers
			switch(inputId) {
				case 1: //Withdraw
				   p.getBank().withdrawItem(inputItemId, id);
				 break;
				case 2: //Deposit
				   p.getBank().bankItem(inputItemId, id);
				break;
			}
		}
		resetInput();
	}
	public void handleStringInput(String string) {
		if (inputId > -1) {
			switch (inputId) {
				case 0: //enter clan name
					String clan = string.replaceAll("_", " ");
					p.getActionSender().sendString(Misc.checkString(clan), 590, 22);
					GameEngine.ClanMain.clanName3(p, clan);
					break;
			}
		}
		resetInput();
	}
	public void resetInput() {
		this.inputId = -1;
		this.inputItemId = 0;
	}
	/**
	 * Request an input for integer's and integer's only(No strings)
	 */
	public void requestIntegerInput(Player p, int inputId, String question, int itemId) {
		this.inputId = inputId;
		this.inputItemId = itemId;
		p.getActionSender().sendRunScript(108, new Object[]{ question }, "s");
   }
   	/**
	 * Request an input for integer's and integer's only(No strings)
	 */
	public void requestStringInput(Player p, int inputId, String question) {
		this.inputId = inputId;
		p.getActionSender().sendRunScript(109, new Object[]{ question }, "s");
   }
}
