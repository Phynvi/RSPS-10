package com.rs2hd.content.ClanChat;

import com.rs2hd.GameEngine;

public class SaveChats implements Runnable {
	/**
	 * Class thread.
	 */
	private Thread saveThread;

	public SaveChats() {
		saveThread = new Thread(this);
		saveThread.start();
	}

	public void run() {
		while(true) {
			try {
				GameEngine.ClanMain.saveChats();
				Thread.sleep(60000);
			} catch(Exception e) {}
		}
	}
}