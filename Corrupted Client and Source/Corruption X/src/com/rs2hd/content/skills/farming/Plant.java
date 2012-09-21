package com.rs2hd.content.skills.farming;

import com.rs2hd.event.Event;
import com.rs2hd.model.World;

public class Plant {
	
	private int objectID;
	private int timeLeft;
	
	public Plant(int objectID, int time) {
		this.objectID = objectID;
		this.timeLeft = time;
		startPlantEvent();
		
	}
	
	public void startPlantEvent() {
		
		World.getInstance().registerEvent(new Event(1000) {
			public void execute() {
				timeLeft--;
				
				if (timeLeft == 0) {
					this.stop();
				}
			}
		});
		
	}
	
	
	public int getId() {
		return this.objectID;
	}
	
	public int getTimeLeft() {
		return timeLeft;
	}

}
