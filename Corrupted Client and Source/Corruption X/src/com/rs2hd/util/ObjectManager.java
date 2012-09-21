package com.rs2hd.util;

import java.util.ArrayList;
import java.util.List;

import com.rs2hd.model.GlobalObject;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * ObjectManager.java
 * @author Aeque
 *
 */
public class ObjectManager {

	private List<GlobalObject> objects;
	private GlobalObject ob;
	
	public ObjectManager() {
		objects = new ArrayList<GlobalObject>();
	}
	
	public void createGlobalObject(int id, Location location, int face, int type) {
		for(GlobalObject ob : objects) {
			if(ob.getLocation().equals(location)) {
				return;
			}
		}
		final GlobalObject obj = new GlobalObject(id, location, face, type);
		objects.add(obj);
		refresh(obj);
	}

	private void refresh(GlobalObject obj) {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p.getLocation().withinDistance(obj.getLocation())) {
					p.getActionSender().sendCreateObject(obj.getId(), obj.getLocation().getZ(), obj.getLocation().getX(), obj.getLocation().getY(), obj.getFace(), obj.getType());
			}
		}
	}

	public boolean globalObjectExists(Location l) {
		for(GlobalObject o : objects) {
			if(o.getLocation().equals(l)) {
				return true;
			}
		}
		return false;
	}

	public void replaceGlobalObject(Location l, GlobalObject obj) {
		for(final GlobalObject o : objects) {
			if(o.getLocation().equals(l)) {
				ob = o;
			}
		}
		if(objects.contains(ob)) {
			objects.remove(ob);
		}
		objects.add(obj);
		refresh(obj);
	}

	public void destroyGlobalObject(Location l) {
		for(final GlobalObject o : objects) {
			if(o.getLocation().equals(l)) {
				ob = o;
			}
		}
		if(objects.contains(ob)) {
			objects.remove(ob);
		}
		final GlobalObject obj = new GlobalObject(6951, l);
		refresh(obj);
	}

	public void createSpawn(GlobalObject obj) {
		objects.add(obj);
		refresh(obj);
	}

	public void refresh(Player p) {
		for(GlobalObject o : objects) {
			if(p.getLocation().withinDistance(o.getLocation())) {
				p.getActionSender().sendCreateObject(o.getId(), o.getLocation().getZ(), o.getLocation().getX(), o.getLocation().getY(), o.getFace(), o.getType());
			}
		}
	}

}