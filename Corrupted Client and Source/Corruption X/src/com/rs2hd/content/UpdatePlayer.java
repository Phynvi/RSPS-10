package com.rs2hd.content;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Entity;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class UpdatePlayer extends Event {
	
	private Entity entity;

	public UpdatePlayer(Entity entity) {
		super(0);
		this.entity = entity;
	}

	@Override
	public void execute() {
try {
if(entity instanceof NPC) {
	entity.setHidden(true);
	World.getInstance().registerEvent(new Event(700) {
		@Override
		public void execute() {
			entity.setHidden(false);
			this.stop();
		}
	});
this.stop();
}
		} catch(Exception e) {
		}
	}

}
