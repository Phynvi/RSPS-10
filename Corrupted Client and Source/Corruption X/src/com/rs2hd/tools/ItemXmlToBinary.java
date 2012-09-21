package com.rs2hd.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import com.rs2hd.model.ItemDefinition;
import com.rs2hd.util.XStreamUtil;

/**
 * Tool to convert the item XML file to binary.
 * @author Graham
 * 
 */
public class ItemXmlToBinary {

	public static void main(String[] args) throws IOException {
		new ItemXmlToBinary().start();
	}

	@SuppressWarnings("unchecked")
	public void start() throws IOException {
		System.out.println("Loading...");
		List<ItemDefinition> defs = (List<ItemDefinition>) XStreamUtil.getXStream().fromXML(new FileInputStream("data/itemDefinitions.xml"));
		System.out.println("Done.");
		System.gc();
		System.out.println("Saving...");
		RandomAccessFile raf = new RandomAccessFile(new File("data/itemDefinitions.dat"), "rw");
		raf.writeInt(defs.size());
		for(ItemDefinition def : defs) {
			raf.writeShort(def.getId());
			raf.writeShort(def.getEquipId());
			raf.writeBoolean(def.isNoted());
			raf.writeBoolean(def.isStackable());
			raf.writeInt(0);
			raf.writeInt(0);
			raf.writeInt(0);
			for(int i = 0; i < 13; i++) {
				raf.writeShort(def.getBonus(i));
			}
String getName = def.getName();
if (getName == null) 
getName = "null";
			raf.writeBytes(getName);
			raf.writeByte(0);
String getExamine  = def.getExamine();
if (getExamine == null) 
getExamine = "null";
			raf.writeBytes(getExamine);
			raf.writeByte(def.getEquipId());
			raf.writeDouble(def.getWeightIventory());
			raf.writeDouble(def.getWeightWearing());
			if(def.getId() % 100 == 0) {
				System.out.println(def.getId() + "/" + defs.size());
			}
		}
		raf.close();
		System.out.println("Done.");
	}

}
