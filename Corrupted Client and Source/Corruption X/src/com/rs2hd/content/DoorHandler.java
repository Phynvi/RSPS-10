package com.rs2hd.content;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rs2hd.Server;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.XStreamUtil;
import com.rs2hd.util.log.Logger;

public class DoorHandler {

	public static Logger getLogger() {
		return logger;
	}

	private int id = 0;

	private int x = 3200, y = 3200, z = 0;
	private int face = 0, type = 0;
	private Location currentLoc = Location.location(3200, 3200, 0);

	private boolean closed = false;

	private static Map<Integer, DoorHandler> doorHandler;

	private static Logger logger = Logger.getInstance();

	public static Map<Integer, DoorHandler> getDoorHandler() {
		return doorHandler;
	}

	@SuppressWarnings("unchecked")
	public static void load() throws FileNotFoundException {
		List<DoorHandler> defs = (List<DoorHandler>) XStreamUtil.getXStream()
				.fromXML(new FileInputStream("data/doorHandler.xml"));
		doorHandler = new HashMap<Integer, DoorHandler>();
		for (int i = 0; i < defs.size(); i++) {
			DoorHandler def = defs.get(i);
			def.setCurrentLoc(Location.location(def.getX(), def.getY(), def
					.getZ()));
			doorHandler.put(i, def);
		}
		logger.debug("Doors - 0%");
		for (int i = 0; i < doorHandler.size(); i++) {
			int percent = i * 100 / doorHandler.size();
			if (percent >= 99) {
				percent = 100;
			}
			if (i >= doorHandler.size() - 1) {
				percent = 100;
			}
			/*Server.getConsole().setProgressBar(percent);
			Server.getConsole().setTextForBar(
					"Doors - " + percent + "% - " + (i + 1));*/
		}
		getLogger()
				.info(
						"Loaded " + doorHandler.size()
								+ " object handler definitions.");
	}

	public Location getCurrentLoc() {
		return currentLoc;
	}

	public int getFace() {
		return face;
	}

	public int getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void handleDoor(Location loc, int id, int face, int type) {
		DoorHandler def = null;
		if ((def = doorHandler.get(id)) != null) {
			Location doorLoc = def.getCurrentLoc();
			if (loc.equals(doorLoc)) {
				if (def.isClosed()) {
					for (Player player : World.getInstance().getPlayerList()) {
						player.getActionSender().sendCreateObject(def.getId(),
								doorLoc.getZ(), doorLoc.getX(), doorLoc.getY(),
								face, type);
						def.setFace(face);
						def.setType(type);
						def.setClosed(!def.isClosed());
					}
				}
			}
		}
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public void setCurrentLoc(Location currentLoc) {
		this.currentLoc = currentLoc;
	}

	public void setFace(int face) {
		this.face = face;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogger(Logger logger) {
		DoorHandler.logger = logger;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

}