package com.rs2hd.io;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

import com.rs2hd.GameEngine;
import com.rs2hd.util.log.Logger;

/**
 * Loads mapdata from a binary file
 * @author Graham about packClip its dragonkk
 *
 */
@SuppressWarnings("unused")
public class MapDataLoader {
	
	/**
	 * Logger instance.
	 */
	private static Logger logger = Logger.getInstance();
	
	/**
	 * Prevent an instance being created.
	 */
	private MapDataLoader() {}

	/**
	 * Loads mapdata into the specified map.
	 * 
	 * The map should have a key of <code>Integer</code> and value of <code>int[]</code>.
	 * @param mapData The map.
	 * @throws IOException
	 */
	public static void packClip(String from, String to) {
		logger.info("Packing objects...");
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(to));
			int i2 = 0;
			for (int x = 1000; x < 5000; x++) {
				for (int y = 2000; y < 10100; y++) {
					for (int h = 0; h < 3; h++) {
				if (new File(from +x+"_"+y+"_"+h+ ".txt").exists()) {
					out.writeInt(x);
					out.writeInt(y);
					out.writeInt(h);
					out.writeInt(2);
					i2++;
				}
					}
				}
			}
			out.flush();
			out.close();
			logger.info("Complete. "+i2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void loadCliped() throws IOException {
		logger.info("Reading objects for clipped npc...");
		DataInputStream in = new DataInputStream(new FileInputStream("data/clip/packed.dat"));
		int i = 0;
		while(in.available() >= 20) {
			int x = in.readInt();
			int y = in.readInt();
			int h = in.readInt();
			int type = in.readInt();
			//GameEngine.clipInfo.coords[h][x][y] = (byte)type;
			//logger.info("area: ["+x+"]["+y+"]["+h+"] = "+type);
			i++;
		}
		logger.info("Loaded "+i+" cliped titles");
	}
	/*public static void loadCliped() throws IOException {
	logger.info("Reading objects for clipped npc...");
	RandomAccessFile raf = new RandomAccessFile("data/objects.dat", "r");
	int amt = raf.readInt();
	for (int i = 0; i < amt; i++) {
		int x = raf.readShort();
		int y = raf.readShort();
		int z = raf.readByte();
		int face = raf.readByte();
		GameEngine.clipInfo.coords[z][x][y] = 2;
	}
		logger.info("Loaded "+amt+" cliped titles");
	}*/
	public static void load(Map<Integer, int[]> mapData) throws IOException {
		// a much simpler way than TeleNubby's
		logger.info("Reading mapdata...");
		DataInputStream in = new DataInputStream(new FileInputStream("data/mapdata/packed.dat"));
		int useableMapdata = 0;
		while(in.available() >= 20) {
			int area = in.readInt();
			int[] parts = new int[4];
			for(int j = 0; j < 4; j++) {
				parts[j] = in.readInt();
			}
			if(parts[0] != 0 && parts[1] != 0 && parts[2] != 0 && parts[3] != 0) {
				useableMapdata++;
			}
			mapData.put(area, parts);
		}
		logger.info("Loaded mapdata.");
	}

}
