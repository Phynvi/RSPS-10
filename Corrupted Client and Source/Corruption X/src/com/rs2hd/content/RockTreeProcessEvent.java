package com.rs2hd.content;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;

/**
 * Handles Tree Update
 * @author Dragonkk
 *
 */
public class RockTreeProcessEvent extends Event {

	public RockTreeProcessEvent() {
		super(1200);
	}

	@Override
	public void execute() {
try {
	GameEngine.RockLive.process();
	GameEngine.TreeLive.process();
	GameEngine.StallLive.process();
		} catch(Exception e) {
		}
	}

}
