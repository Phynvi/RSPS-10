package com.rs2hd.admin;

import com.rs2hd.Server;

/**
 * Console handler
 * @author Graham
 *
 */
public class Console implements Runnable {
	
	/**
	 * Server ref.
	 */
	private Server server;
	
	/**
	 * Constructor
	 * @param server
	 */
	public Console(Server server) {
		this.server = server;
	}
	
	/**
	 * Buffer.
	 */
	private StringBuffer buffer = new StringBuffer();
	
	/**
	 * Polls console input.
	 */
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				break;
			}
			try {
				int avail = System.in.available();
				for(int i = 0; i < avail; i++) {
					char c = (char) System.in.read();
					if(c == '\n') {
						String command = buffer.toString().trim();
						handleCommand(command);
						buffer = new StringBuffer();
					} else {
						buffer.append(c);
					}
				}
			} catch(Exception e) {}
		}
	}
	
	/**
	 * Handle a command.
	 * @param command
	 */
	private void handleCommand(String command) {
		if(command.equals("shutdown")) {
			server.getEngine().setIsRunning(false);
		}
	}

}
