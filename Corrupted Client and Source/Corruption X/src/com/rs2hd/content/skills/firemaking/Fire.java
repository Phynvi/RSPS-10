package com.rs2hd.content.skills.firemaking;

import com.rs2hd.event.Event;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Fire {
	
	private int 	coords[];
	
	public Fire(final Player p, final int fireX, final int fireY)
	{
		coords = new int[2];
		coords[0] = fireX;
		coords[1] = fireY;
		World.getInstance().registerEvent(new Event(60000) {
			public void execute() {
				//p.getActionSender().deleteStaticObject(0, fireX, fireY);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				World.getInstance().getItemManager().createGroundItem(Location.location(coords[0], coords[1], 0), new Item(592,1));
				this.stop();
			}
		});
	}
	
	public int[] getCoords() {
		return coords;
	}

}
