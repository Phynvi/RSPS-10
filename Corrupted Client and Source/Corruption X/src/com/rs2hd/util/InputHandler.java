package com.rs2hd.util;

import com.rs2hd.util.Misc;
import com.rs2hd.GameEngine;
import com.rs2hd.model.*;
public class InputHandler {
	
	private static Player p;
	public static int inputId = -1;
	public static int inputItemId = 0;
	public static int inputItemIndex = 0;

	public static void handleInput(int id) {
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
	public static void handleStringInput(String string) {
		if (inputId > -1) {
			switch (inputId) {
				case 0: //enter clan name
					final String clan = string.replaceAll("_", " ");
					GameEngine.ClanMain.clanName3(p, clan);
					p.getActionSender().sendString(Misc.checkString(clan), 590, 22);
					break;
			}
		}
		resetInput();
	}
	public static void resetInput() {
		inputId = -1;
		inputItemId = 0;
	}
	/**
	 * Request an input for integer's and integer's only(No strings)
	 */
	public static void requestIntegerInput(Player p, int inputId, String question, int itemId) {
		InputHandler.inputId = inputId;
		inputItemId = itemId;
		p.getActionSender().sendRunScript(108, new Object[]{ question }, "s");
   }
   	/**
	 * Request an input for integer's and integer's only(No strings)
	 */
	public static void requestStringInput(Player p, int inputId, String question) {
		InputHandler.inputId = inputId;
		p.getActionSender().sendRunScript(109, new Object[]{question}, "s");
   }
}
