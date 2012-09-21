package com.rs2hd.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.mina.common.ByteBuffer;

@SuppressWarnings("unused")
public class WorldList {
	private static final List<WorldDef> worldList = new ArrayList<WorldDef>();

	public void load() {
		worldList.add(new WorldDef(1, 0, FLAG_MEMBERS, "CorruptionX 562.", "propane.no-ip.biz:43594", "PT", COUNTRY_NZ));
		worldList.add(new WorldDef(2, 0, FLAG_MEMBERS, "LocalHost", "127.0.0.1:43594", "PT", COUNTRY_NZ));
	}

	public static ByteBuffer getData(boolean worldConfiguration,
			boolean worldStatus) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		buffer.put((byte) (worldStatus ? 1 : 0));
		buffer.put((byte) (worldConfiguration ? 1 : 0));
		if (worldConfiguration) {
			populateConfiguration(buffer);
		}
		if (worldStatus) {
			populateStatus(buffer);
		}
		buffer.flip();
		ByteBuffer finalBuffer = ByteBuffer.allocate(buffer.limit() + 3);
		finalBuffer.put((byte) 0);
		finalBuffer.putShort((short) buffer.limit());
		finalBuffer.put(buffer);
		finalBuffer.flip();
		return finalBuffer;
	}

	private static void populateConfiguration(ByteBuffer buffer) {
		putSmart(buffer, worldList.size());
		setCountry(buffer);
		putSmart(buffer, 0);
		putSmart(buffer, (worldList.size() + 1));
		putSmart(buffer, worldList.size());
		for (WorldDef w : worldList) {
			putSmart(buffer, w.getWorldId());
			buffer.put((byte) w.getLocation());
			buffer.putInt(w.getFlag());
			putJagString(buffer, w.getActivity()); // activity
			putJagString(buffer, w.getIp()); // ip address
		}
		buffer.putInt(0x94DA4A87); // != 0
	}

	private static void populateStatus(ByteBuffer buffer) {
		for (WorldDef w : worldList) {
			putSmart(buffer, w.getWorldId()); // world id
			buffer.putShort((short) w.getPlayers()); // player count
		}
	}

	private static void putJagString(ByteBuffer buffer, String string) {
		buffer.put((byte) 0);
		buffer.put(string.getBytes());
		buffer.put((byte) 0);
	}

	private static void putSmart(ByteBuffer buffer, int value) {
		if ((value ^ 0xffffffff) > -129) {
			buffer.put((byte) value);
		} else {
			buffer.putShort((short) value);
		}
	}

	private static void setCountry(ByteBuffer buffer) {
		for (WorldDef w : worldList) {
			putSmart(buffer, w.getCountry());
			putJagString(buffer, w.getRegion());
		}
	}


 	private static final int TOTAL_WORLDS        = 1;
	private static final int WORLDS_IN_LOCALITY  = 1;
	private static final int NUMBER_OF_LOCATIONS = 1;
	
	public static final int COUNTRY_UK          = 77;
	public static final int COUNTRY_USA         = 225;
	public static final int COUNTRY_CANADA      = 38;
	public static final int COUNTRY_NETHERLANDS = 161;
	public static final int COUNTRY_AUSTRALIA   = 16;
	public static final int COUNTRY_SWEDEN      = 191;
	public static final int COUNTRY_FINLAND     = 69;
	public static final int COUNTRY_IRELAND     = 101;
	public static final int COUNTRY_BELGIUM     = 22;
	public static final int COUNTRY_NORWAY      = 162;
	public static final int COUNTRY_DENMARK     = 58;
	public static final int COUNTRY_BRAZIL      = 31;
	public static final int COUNTRY_NZ      = 12;
	public static final int COUNTRY_MEXICO      = 152;
	
	public static final int FLAG_MEMBERS   = 1;
	public static final int FLAG_QUICKCHAT = 2;
	public static final int FLAG_PVP       = 4;
	public static final int FLAG_LOOTSHARE = 8;
	public static final int FLAG_HIGHLIGHT = 16;

	private static final int FLAG_NON_MEMBERS = 0;

}
