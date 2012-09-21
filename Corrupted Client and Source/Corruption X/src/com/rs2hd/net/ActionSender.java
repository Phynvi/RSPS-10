package com.rs2hd.net;

import org.apache.mina.common.IoFuture;
import org.apache.mina.common.IoFutureListener;

import com.rs2hd.GameEngine;
import com.rs2hd.model.Container;
import com.rs2hd.model.Entity;
import com.rs2hd.model.FloorItem;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.FamiliarNpc;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet.Size;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.Misc;

/**
 * Outgoing packets that we send so the end user does not have to mess with the builders.
 * @author Graham and Dragonkk and Matz and Hotyute
 *
 */
public class ActionSender {
	private int ID;
	private Player player;
	public ActionSender(Player player) {
		this.player = player;
	}
    public void resetSomething() {
          /*player.getSession().write(new StaticPacketBuilder().setId(116)
          		.toPacket());*/
      }
    public void sendSystemUpdate(int paramInt) {
        this.player.getSession().write(new StaticPacketBuilder().setId(231).addLEShort(paramInt).toPacket());
      }

    public void animateInterface(int emoteId, int interfaceId, int childId) {
        	StaticPacketBuilder spb = new StaticPacketBuilder().setId(61)
                .addInt2(interfaceId << 16 | childId)
                .addLEShort(emoteId)
                .addLEShortA(0);
		player.getSession().write(spb.toPacket());
}
	public void itemOnInterface(int interfaceid, int child, int amount, int itemid) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(145)
		.addInt(interfaceid << 16 | child)//Interface this should be in
		.addInt1(amount)//Amount to display, (Number next to pic)
		.addLEShortA(0)//Count
		.addLEShortA(itemid);//ITEM Id
		player.getSession().write(spb.toPacket());
	}
    public void sendPlayerOnInterface(int interfaceId, int childId) {
        	StaticPacketBuilder spb = new StaticPacketBuilder().setId(219)
                .addShortA(0)
                .addInt1(interfaceId << 16 | childId);
		player.getSession().write(spb.toPacket());
    }

    public void sendNPCOnInterface(int npcId, int interfaceId, int childId) {
        	StaticPacketBuilder spb = new StaticPacketBuilder().setId(158)
                .addLEShortA(npcId)
                .addShort(0)
                .addInt2(interfaceId << 16 | childId);
		player.getSession().write(spb.toPacket());
    }
    public void sendItemKeptDeath() {
        sendAccessMask(2, 4, 102, 0, 211, 6684690);
        sendAccessMask(2, 42, 102, 0, 212, 6684693);
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(70);
                spb.addShort(0)
                .addString("")
                .addInt(118);
		player.getSession().write(spb.toPacket());
    }
    	public void sendTradeReq(String user, String message) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(193).setSize(Packet.Size.VariableByte)
		.addSmart(4)
		.addInt(0)
		.addByte((byte) 1)
		.addString(user)
		.addString(message);
		player.getSession().write(spb.toPacket());
	}
    public void setHintIcon(int targetType, int targetId, int arrowId, int playerModel) {
        	StaticPacketBuilder spb = new StaticPacketBuilder().setId(122);
        	int offset = spb.curLength;
        	spb.addByte((byte)targetType);
            spb.addByte((byte)arrowId);
            if (targetType == 1 || targetType == 10) {
            	spb.addShort(targetId);
                spb.ensureCapacity(spb.curLength + 5);
            }
            spb.addShort(playerModel);
            for (int i = (spb.curLength - offset); i < 9; i++) {
            	spb.addByte((byte) 0);
            }
            player.getSession().write(spb.toPacket());
        }

    public void CheckVersion(int Version) {
		try {

player.getSession().write(new StaticPacketBuilder().setId(240)
		.addByte((byte)Version)
		.toPacket());

		} catch(Exception e) {
		}
    }
    public void PlayMusic(int i) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(188)
					.addLEShortA(i)
					.addByteS(ID++)
					.toPacket());
					} catch(Exception e) {
					}
    }	
    public void PlayMusic2(int i, int categoryId) { //TODO converted
		try {
player.getSession().write(new StaticPacketBuilder().setId(30)
		.addByte((byte)ID++)
		.addLEInt(i)
		.addLEShortA(categoryId)
		.toPacket());
		} catch(Exception e) {
		}
    }	
    public void ItemOnInterface(int interfaceid, int child, int itemamt, int itemid) {
		try {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(145)
		.addInt(interfaceid << 16 | child)//Interface this should be in
		.addInt1(itemamt)//Amount to display, (Number next to pic)
		.addLEShortA(0)//Count
		.addLEShortA(itemid);//ITEM Id
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
}

    public void getMusicName(Player p) {
	if (p.musicId == 0) {
	    sendString("Project Skux", 187, 14);
	}
	if (p.musicId == 2) {
	    sendString("Autumn Voyage", 187, 14);
	}
	if (p.musicId == 3) {
	    sendString("Unknow Land", 187, 14);
	}
	if (p.musicId == 46) {
	    sendString("Harmony2", 187, 14);
	}
	if (p.musicId == 64) {
	    sendString("Book of Spells", 187, 14);
	}
	if (p.musicId == 76) {
	    sendString("Harmony", 187, 14);
	}
	if (p.musicId == 85) {
	    sendString("Vision", 187, 14);
	}
	if (p.musicId == 127) {
	    sendString("Night Fall", 187, 14);
	}
	if (p.musicId == 145) {
	    sendString("Yesterday", 187, 14);
	}
	if (p.musicId == 151) {
	    sendString("Start", 187, 14);
	}
	if (p.musicId == 163) {
	    sendString("Flute Salad", 187, 14);
	}
	if (p.musicId == 327) {
	    sendString("Dream", 187, 14);
	}
    }

    public void PriceCheck(int id, int value) { 
		try {
			if(value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
				player.getSession().write(new StaticPacketBuilder().setId(21)
						.addLEShortA(id)
						.addInt1(value)
						.addShort(ID++)
						.toPacket());
			} else {
				player.getSession().write(new StaticPacketBuilder().setId(164)
						.addLEShortA(ID++)
						.addByte((byte)value)
						.addLEShort(id)
						.toPacket());
			}
			} catch(Exception e) {
			}
    }	
    public void dunno(int id, int value) { 
		try {
			if(value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
				player.getSession().write(new StaticPacketBuilder().setId(21)
						.addLEShortA(id)
						.addInt1(value)
						.addShort(ID++)
						.toPacket());
			} else {
				player.getSession().write(new StaticPacketBuilder().setId(164)
						.addLEShortA(ID++)
						.addByte((byte)value)
						.addLEShort(id)
						.toPacket());
			}
			} catch(Exception e) {
			}
    }	
    public void forceWalk(int size,int CoordX, int CoordY) {
		try {
			int LocalX = CoordX;// - (player.getLocation().getRegionX() - 6) * 8;
			int LocalY = CoordY;// - (player.getLocation().getRegionY() - 6) * 8;
			player.getSession().write(new StaticPacketBuilder().setId(255)
					.addLEShortA(LocalX)
					.addInt1(LocalY)
					.addShort(size)
					.toPacket());
					} catch(Exception e) {
					}
    }
	public void sendSpecialConfig(int id, int value) { 
			try {
				if(value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
					player.getSession().write(new StaticPacketBuilder().setId(21)
							.addLEShortA(id)
							.addInt1(value)
							.addShort(ID++)
							.toPacket());
				} else {
					player.getSession().write(new StaticPacketBuilder().setId(164)
							.addLEShortA(ID++)
							.addByte((byte)value)
							.addLEShort(id)
							.toPacket());
				}
				} catch(Exception e) {
				}
	}
    public void GESET(int int1) {
		/*try {
player.getSession().write(new StaticPacketBuilder().setId(93)
		.addShort(ID++)
		.addInt(int1)
		.toPacket());
		} catch(Exception e) {
		}*/
    }	
	public void sendCreateObject(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
	if(player.getLocation().getX() > paramInt3+64 || player.getLocation().getX() < paramInt3-64 || player.getLocation().getY() > paramInt4+64 || player.getLocation().getY() < paramInt4-64 || player.getLocation().getZ() > paramInt2 || player.getLocation().getZ() < paramInt2) {
	return;
	}
	sendCoords(Location.location(paramInt3, paramInt4, this.player.getLocation().getZ()));
	int i = (paramInt6 << 2) + (paramInt5 & 0x3);
	this.player.getSession().write(new StaticPacketBuilder().setId(115).addByteC(0).addLEShortA(paramInt1).addByteC((byte)i).toPacket());
	}



	public void sendCreateGlobalObject(int objectId, int height, int objectX, int objectY, int face, int type) {
		try {
		for(Player p : World.getInstance().getPlayerList()) {
			p.getActionSender().sendCreateObject(objectId, height, objectX, objectY, face, type);
		}
		} catch(Exception e) {
		}
	}
	  public void deleteStaticObject(int height, int objectX, int objectY) {
			for (Player p : World.getInstance().getPlayerList()) {
				if (p == null)
					continue;
				if (player.getLocation().getZ() == height)
					sendCreateObject(-1, height, objectX, objectY, -1, 10);
			}
	  }
		
	public void sendPlayerOption(String option, int slot, boolean top) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(73).setSize(Packet.Size.VariableByte)
					.addLEShortA(65535)
					.addString(option)
					.addByteC(top ? 1 : 0)
					.addByteS(slot).toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendQuestInterface(String title, String[] lines) {
		try {
		sendInterface(190);
		sendString(title, 500, 2);
		for(int i = 0; i < 300; i++) {
			sendString("", 500, (i+11));
		}
		for(int i = 0; i < lines.length; i++) {
			sendString(lines[i], 500, (i+11));
		}
		} catch(Exception e) {
		}
	}	
	
    public void SendSound(int id, int volume, int delay) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(136)
					.addShort(id)
					.addByte((byte)volume)
					.addShort(delay)
					.addByte((byte)255)
					.toPacket());
					} catch(Exception e) {
					}
	}
	
	public void sendCloseInterface(int windowId, int position) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(203)
					.addShort(0)
					.addInt(windowId << 16 | position)
					.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendInterfaceConfig(int interfaceId, int childId, boolean set) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(3)
					.addShortA(0)
					.addByteS(set ? 0 : 1)
					.addInt2(interfaceId << 16 | childId)
					.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendCloseInterface() {
		try {
		if(player.isFullScreen()) {
			sendCloseInterface(746, 3);
			sendCloseInterface(746, 8);
		}
		 sendCloseInterface(548, 16);
		} catch(Exception e) {
		}
	}
	public void sendInterface(int id,  boolean isInventoryInterface) {
		try {
		sendCloseInterface();
		sendInterface(0, player.isFullScreen() ? 746 : 548, player.isFullScreen() ? 8 : 16, id);
		} catch(Exception e) {
		}
	}

	public void sendInterface(int id) {
		try {
		sendCloseInterface();
		sendInterface(0, player.isFullScreen() ? 746 : 548, player.isFullScreen() ? 8 : 16, id);
		} catch(Exception e) {
		}
	}
	
	public void sendSkillLevels() {
		try {
		for(int i = 0; i < Skills.SKILL_COUNT; i++) {
			sendSkillLevel(i);
		}
		} catch(Exception e) {
		}
	}
	
	public void sendSkillLevel(int skill) {
		try {
			player.getSession().write(new StaticPacketBuilder().setId(38)
					.addByteA(player.getSkills().getLevel(skill))
					.addInt1((int) player.getSkills().getXp(skill))
					.addByteC(skill)
					.toPacket());
		} catch(Exception e) {
		}
	}	
	public void sendLogout() {
		if(player.Attacking == true || player.AttackingNpc == true) {
			player.sm("you cannot logout until 10 seconds after combat");
			return;
		}
		player.getSession().write(new StaticPacketBuilder().setId(236).toPacket()).addListener(new IoFutureListener() {
			public void operationComplete(IoFuture arg0) {
				arg0.getSession().close();
			}
		});
	}

	public void sendkickLogout() {
		player.getSession().write(new StaticPacketBuilder().setId(236).toPacket()).addListener(new IoFutureListener() {
			public void operationComplete(IoFuture arg0) {
				arg0.getSession().close();
			}
		});
	}

	public int set = 0;	
	public void sendLogin() {
		player.lastconnect = player.getSession().getRemoteAddress().toString().substring(player.getSession().getRemoteAddress().toString().indexOf("/")+1,player.getSession().getRemoteAddress().toString().indexOf(":"));
		player.getActionSender().sendMapRegion();
		player.getActionSender().sendWindowPane(548, 0);
		GameEngine.prayer.PrayerOff(player);
		player.getActionSender().sendSkillLevels();
		player.getActionSender().sendEnergy();
		player.SummoningItemId = -1;
		player.Summoning = false;
		player.autoCast = -1;
		player.autoCastAncient = -1;
		player.autoCasting = false;
		player.magicType = player.magicType;
		player.isTeleBlocked = false;
		player.getFriends().refresh();
		player.getInventory().refresh();
		player.getEquipment().refresh();
		player.getSettings().refresh();
		player.updateWildernessState();
		player.getActionSender().sendPlayerOption("Follow", 2, false);
		player.getActionSender().sendPlayerOption("Trade with", 3, false);
		player.getActionSender().sendPlayerOption("Req Assist", 4, false);
        		player.getActionSender().sendConfig(173, 0);
		player.getActionSender().sendButtonGraphics(768, 3);
		player.getActionSender().sendButtonGraphics(768, 0);
		player.getActionSender().sendButtonGraphics(768, 3);
		player.getActionSender().sendButtonGraphics(234, 0);
		player.getActionSender().sendButtonGraphics(181, 0);
		player.getActionSender().sendButtonGraphics(168, 4);
		player.getActionSender().sendButtonGraphics(234, 0);
		player.getActionSender().sendButtonGraphics(181, 0);
		player.getActionSender().sendButtonGraphics(695, 0);
		player.getActionSender().sendButtonGraphics(695, 0);
		player.getActionSender().setInterfaceConfig(34, 13, false);
		player.getActionSender().setInterfaceConfig(34, 13, false);						
		player.getActionSender().setInterfaceConfig(34, 3, false);
		player.getActionSender().sendConfig(173, 0);
		player.getActionSender().sendConfig(313, -1);
		player.getActionSender().sendConfig(465, -1);
		player.getActionSender().sendConfig(802, -1);
		player.getActionSender().sendConfig(1085, 249852);
		player.getActionSender().sendConfig(1439, -1);
		player.getActionSender().sendConfig(1437, 1);
		player.getActionSender().sendConfig(1440, 0);
		player.getActionSender().sendConfig(1441, 0);
		ScriptManager.getInstance().call("login", player);
		player.getActionSender().Notes();
	if(player.starter == 0) {
		player.getInventory().addItem(841, 1);
		player.getInventory().addItem(884, 1000);
		player.getInventory().addItem(861, 1);
		player.getInventory().addItem(554, 2000);
		player.getInventory().addItem(555, 2000);
		player.getInventory().addItem(556, 2000);
		player.getInventory().addItem(557, 2000);
		player.getInventory().addItem(558, 2000);
		player.getInventory().addItem(559, 2000);
		player.getInventory().addItem(560, 2000);
		player.getInventory().addItem(561, 2000);
		player.getInventory().addItem(562, 2000);
		player.getInventory().addItem(563, 2000);
		player.getInventory().addItem(564, 2000);
		player.getInventory().addItem(565, 2000);
		player.getInventory().addItem(566, 2000);
		player.getInventory().addItem(392, 300);
		player.getInventory().addItem(995, 2000000);
		player.getInventory().addItem(1323, 1);
		player.getInventory().addItem(4587, 1);
		player.getInventory().addItem(1856, 1);
		player.starter = 1;
		player.getActionSender().sendMessage("<col=FFFF00>You just received some gold and items to start your adventure.");
		}
	}
	public ActionSender setInterface(int showId, int windowId, int interfaceId, int childId) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(56)
		.addShort(childId)
		.addByteS(showId)
		.addShort(ID++)
		.addLEInt(windowId << 16|interfaceId);
		player.getSession().write(spb.toPacket());
		return this;
	}
	public ActionSender setWindow(int pane, int subWindows) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(50).addShortA(pane).addShort(0).addByteS(subWindows);
		player.getSession().write(spb.toPacket());
		return this;
	}
	public ActionSender setAccessMask(int set1, int set2, int interfaceId1, int childId1, int interfaceId2, int childId2) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(113);
		spb.addInt(interfaceId2 << 16 | childId2)
		.addLEShort(set2)
		.addLEShort(set1)
		.addLEShortA(0)
		.addLEInt(interfaceId1 << 16 | childId1);
		player.getSession().write(spb.toPacket());
		return this;
	}
	private void Notes() {
		sendAccessMask(2621470, 34, 9 , 0, 29);
		sendString("Loading notes<br>Please wait...",34,13);
		sendInterfaceConfig(34,13,true);
		sendInterfaceConfig(34,3,true);
		player.getFamiliarInventory().LoadNotesFirstTime(player);
	}
	private void LoadNotes() {
		
		/*for(int i = 0; i < 30; i++)
		sendInfoString(loadNote(149+i),149+i);*/
		for(int i = 1430; i < 1440; i++)
		sendConfig(i, 1);
	}
	private String loadNote(int String){
	switch (String) {
	case 149: return "Gf Steven go lie to other";
	case 150: return "I own you.";
	case 151: return "k thats a test im jking xD";
	default: return ""+String;
	}
	}
	private void sendWelcomeScreen() {
		sendWindowPane(548, 0);
		sendInterface(1, 549, 2, 378);
		sendInterface(1, 549, 3, 16);
		sendString("Welcome to.", 378, 115);
		// TODO last connection
		sendString("You are connected from: " + player.getSession().getRemoteAddress(), 378, 116);
		sendString("0", 378, 39);
		sendString("0", 378, 96);
		sendString("0 unread messages", 378, 37);
		sendString(" staff will NEVER email you. We use the Message Centre on the website instead.", 378, 38);
		sendString("0 days of member credit", 378, 94);
		sendString("You have 0 days of member credit remaining. Please click here to extend your credit.", 378, 93);
		sendString("You do not have a bank pin. Please visit a bank if you would like one.", 378, 62);
		sendString("You have not yet set any recovery questions.", 378, 56);
		sendString("Message of the Week", 16, 0);
		sendString("Remember to keep your account secure: set a bank PIN, set recover questions and NEVER give away your password.", 16, 4);
	}

	public void sendHdLogin() {
	}
	
	public void sendChat() {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(91).setSize(Size.VariableShort);
		spb.addString("MysticFlow")//Owner Name
		.addByte((byte)1)//First Rank
		.addString("Test")//Idk yet
		.addLong(Misc.stringToLong("Lmao"))//Room name
		.addByte((byte) 2)//Amount of people in room
		.addByte((byte) 2)//Rank
		.addString("Coolio")//Player names
		.addByte((byte) 1)//IDK
		.addString("Runescape")//IDK
		.addShort(1)//Index
		.addByte((byte) 1)
		.addString("Final");//World ID
		player.getSession().write(spb.toPacket());
	}
	public void resetList() {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(91).setSize(Size.VariableShort);
		player.getSession().write(spb.toPacket());
	}
        private static int messageCounter = 1;
        public int index = 0, index2 = 0;
        public void sendClanChat(Player p2, String from, String clanName, String message) {//Gotta fix this
                if(messageCounter > 16000000) {
                        messageCounter = 1;
                }
                byte[] bytes = new byte[message.length()+1];
                bytes[0] = (byte) message.length();
                Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message.getBytes());
                StaticPacketBuilder spb = new StaticPacketBuilder().setId(75).setSize(Size.VariableByte);
                spb.addByte((byte)1)
                .addString(Misc.upper(from))
                .addString(Misc.upper(message))
                .addLong(Misc.stringToLong(clanName))
                .addShort(15);
                spb.addBytes(new byte[]{(byte) ((messageCounter << 16) & 0xFF),(byte) ((messageCounter << 8) & 0xFF), (byte) (messageCounter & 0xFF), 3, 0});
                spb.addBytes(bytes);
                messageCounter++;
                if (p2 != null) {
                        spb.addByte((byte)p2.getRights());
                } else {
                        spb.addByte((byte) 0);
                }
                spb.addShort(messageCounter + 10);
                player.getSession().write(spb.toPacket());
	}/*
	public void sendClanChat(Player p2, String from, String clanName, String message) {//Gotta fix this
	StaticPacketBuilder spb = new StaticPacketBuilder();
			String name = p2.getUsername();
			long n = Misc.playerNameToLong(name);
			String nac = clanName;
			spb.setId(75).setSize(Size.VariableByte);
			spb.addLong(n);// Your name
			spb.addByte((byte) 1);
			n = Misc.playerNameToLong(nac);
			spb.addLong(n);// ClanChat name
			spb.addShort(1);
			int messageCounter = p2.getFriends().getNextUniqueId();
			byte[] bytes = new byte[message.length() + 1];
			bytes[0] = (byte) message.length();
			Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message
				.getBytes());
			spb.addBytes(
				new byte[] { (byte) ((messageCounter << 16) & 0xFF),
					(byte) ((messageCounter << 8) & 0xFF),
					(byte) (messageCounter & 0xFF) }).addByte((byte) 2)
				.addBytes(bytes);
			p2.getSession().write(spb.toPacket());
	}*/
	
	public ActionSender switchPanes2(int paneFrom, int windowPosFrom, int paneTo, int windowPosTo) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(206);
		spb.addLEShort(0)
		.addLEInt(paneFrom << 16 | windowPosFrom)
		.addInt2(paneTo << 16 | windowPosTo);
		player.getSession().write(spb.toPacket());
		return this;
	}
	
	public void switchMagic(Player p) {
		System.out.println(p.magicType);
		// Magic tab
		if(p.magicType == 192 || p.magicType == 0) {
			sendMessage("You convert to Ancient Magics.");
			p.magicType = 193;
			if(player.isFullScreen()) {
			sendInterface(1, 746, 36, 193);
			} else {
			sendInterface(1, 548, 157, 193);
			}
		}
		else if(p.magicType == 193) {
			sendMessage("You convert to Lunar Magics.");
			p.magicType = 430;
			if(player.isFullScreen()) {
			sendInterface(1, 746, 36, 430);
			} else {
			sendInterface(1, 548, 157, 430);
			}
		}
		else if(p.magicType == 430) {
			sendMessage("You convert to Modern Magics.");
			p.magicType = 192;
			if(player.isFullScreen()) {
			sendInterface(1, 746, 36, 192);
			} else {
			sendInterface(1, 548, 157, 192);
			}
		}
	}

	public ActionSender sendButtonGraphics(int type, int amount) {
		StaticPacketBuilder spb = new StaticPacketBuilder();
		if (amount < Byte.MIN_VALUE || amount > Byte.MAX_VALUE) {
			spb.setId(21).addLEShortA(type).addInt1(amount).addShort(0);
		} else {
			spb.setId(164).addLEShortA(0).addByte((byte)amount).addLEShort(type);
		}
		player.getSession().write(spb.toPacket());
		return this;
	}
	public ActionSender setInterfaceConfig(int interfaceId, int childId, boolean set) {
		StaticPacketBuilder spb = new StaticPacketBuilder();
		spb.setId(3);
		spb.addShortA(0)
		.addByteS(set ? 1 : 0)
		.addInt2(interfaceId << 16 | childId);
		player.getSession().write(spb.toPacket());
		return this;
	}
	public void sendFriendsStatus(int i) {
		player.getSession().write(new StaticPacketBuilder().setId(5).addByte((byte) i).toPacket());
	}

	public void sendSentPrivateMessage(String name, String message) {
		byte[] bytes = new byte[message.length()];
		Misc.encryptPlayerChat(bytes, 0, 0, message.length(), message.getBytes());
		player.getSession().write(new StaticPacketBuilder().setId(92).setSize(Size.VariableByte)
				.addString(Misc.upper2(name.replaceAll("_", " ")))
				.addByte((byte) message.length())
				.addBytes(bytes)
				.toPacket());
	}

	public void sendReceivedPrivateMessage(int rights, String name, String message) {
		int messageCounter = player.getFriends().getNextUniqueId();
		byte[] bytes = new byte[message.length()+1];
		bytes[0] = (byte) message.length();
		Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message.getBytes());
		player.getSession().write(new StaticPacketBuilder().setId(226).setSize(Size.VariableByte)
		.addByte((byte) 1)
		.addString(Misc.upper2(name.replaceAll("_", " ")))
		.addString(message)
		.addShort(12 + ID++)
		.addBytes(new byte[] { (byte) ((messageCounter << 16) & 0xFF), (byte) ((messageCounter << 8) & 0xFF), (byte) (messageCounter & 0xFF)} )
		.addByte((byte) rights)
		.addBytes(bytes)
		.toPacket());
	}
	public void sendFriendOnline(String name, int world) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(20).setSize(Size.VariableByte);
		spb.addByte((byte) 0)
		.addString(Misc.upper2(name.replaceAll("_", " ")))
		.addString("")
		.addShort(75)
		.addByte((byte) 0)
		.addString("<col=00FF00>Online")
		.addByte((byte) 1);
		player.getSession().write(spb.toPacket());
	}
	public void sendFriendOffline(String name, int world) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(20).setSize(Size.VariableByte);
		spb.addByte((byte) 0)
		.addString(Misc.upper2(name.replaceAll("_", " ")))
		.addString(Misc.upper2(name.replaceAll("_", " ")))
		.addShort(0)
		.addByte((byte) 0);
		player.getSession().write(spb.toPacket());
	}
	public void sendIgnores(long[] names) {
		try {
		/*StaticPacketBuilder spb = new StaticPacketBuilder().setId(123).setSize(Size.VariableShort);
		for(long name : names) {
			spb.addLong(name);
		}
		player.getSession().write(spb.toPacket());*/
		} catch(Exception e) {
		}
	}
	public void sendMapRegion2() {
		/*//player.setLocation(Location.location(4000, 4000, 0));
		int[][][] xPallete = new int[4][13][13];
		int[][][] yPallete = new int[4][13][13];
		int[][][] zPallete = new int[4][13][13];
		for(int x = 0; x < 13; x++) {
			for(int y = 0; y < 13; y++) {
				for(int z = 0; z < 4; z++) {
					xPallete[z][x][y] = -1;
					yPallete[z][x][y] = -1;
					zPallete[z][x][y] = -1;
				}
			}
		}
		xPallete[0][6][6] = 3210 / 8;
		yPallete[0][6][6] = 3210 / 8;
		zPallete[0][6][6] = 1;
		
		xPallete[0][6][5] = 3300 / 8;
		yPallete[0][6][5] = 3300 / 8;
		zPallete[0][6][5] = 0;

		StaticPacketBuilder spb = new StaticPacketBuilder().setId(54).setSize(Packet.Size.VariableShort);

spb.addByteS(player.getLocation().getZ());//K

		spb.addShort(player.getLocation().getRegionY());
		spb.addShortA(player.getLocation().getLocalX());

		spb.initBitAccess();
		for(int height = 0; height < 4; height++) {
			for(int xCalc = 0; xCalc < 13; xCalc++) {
				for(int yCalc = 0; yCalc < 13; yCalc++) {
					if(zPallete[height][xCalc][yCalc] != -1 && xPallete[height][xCalc][yCalc] != -1 && yPallete[height][xCalc][yCalc] != -1) {
						int x = xPallete[height][xCalc][yCalc];
						int y = yPallete[height][xCalc][yCalc];
						int z = zPallete[height][xCalc][yCalc];
						spb.addBits(1, 1);
						// << 24 | << 1 | norm
						spb.addBits(26, 0 << 1 | 0 | (z << 24) | (x << 14) | (y << 3));
					} else {
						spb.addBits(1, 0);
					}
				}
			}
		}
		spb.finishBitAccess();
		int[] sent = new int[4 * 13 * 13];
		int sentIndex = 0;
		for(int height = 0; height < 4; height++) {
			for(int xCalc = 0; xCalc < 13; xCalc++) {
				outer:
				for(int yCalc = 0; yCalc < 13; yCalc++) {
					if(zPallete[height][xCalc][yCalc] != -1 && xPallete[height][xCalc][yCalc] != -1 && yPallete[height][xCalc][yCalc] != -1) {
						int x = xPallete[height][xCalc][yCalc] / 8;
						int y = yPallete[height][xCalc][yCalc] / 8;
						int region = y + (x << 8);
						for(int i = 0; i < sentIndex; i++) {
							if(sent[i] == region) {
								break outer;
							}
						}
						sent[sentIndex] = region;
						sentIndex++;
						int[] mapData = World.getInstance().getMapData(region);
						if(mapData == null) {
							mapData = new int[4];
						}
						spb.addLEInt(mapData[0]);
						spb.addLEInt(mapData[1]);
						spb.addLEInt(mapData[2]);
						spb.addLEInt(mapData[3]);
					}
				}
			}
		}
		spb.addLEShortA(player.getLocation().getLocalX());//k
		spb.addByteS(1);//K
		spb.addLEShort(player.getLocation().getLocalY()); //k
		spb.addLEShortA(player.getLocation().getRegionX());//k
		spb.addShort(player.getLocation().getRegionY()); //k


		spb.addShortA(player.getLocation().getLocalY());
		spb.addShortA(player.getLocation().getRegionX());

		player.getSession().write(spb.toPacket());
		player.getUpdateFlags().setLastRegion(player.getLocation());*/
	}
	public void sendMapRegion() {
	try {
		
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(76).setSize(Packet.Size.VariableShort);
		boolean forceSend = true;
		spb.addLEShortA(player.getLocation().getRegionX());
		spb.addShort(player.getLocation().getLocalY());
		spb.addByte((byte) 0);
		spb.addByteA(0);
		if ((((player.getLocation().getRegionX() / 8) == 48) || ((player.getLocation().getRegionX() / 8) == 49)) && ((player.getLocation().getRegionY() / 8) == 48)) {
			forceSend = false;
		}
		if (((player.getLocation().getRegionX() / 8) == 48) && ((player.getLocation().getRegionY() / 8) == 148)) {
			forceSend = false;
		}
		for (int xCalc = (player.getLocation().getRegionX() - 6) / 8; xCalc <= ((player.getLocation().getRegionX() + 6) / 8); xCalc++) {
			for (int yCalc = (player.getLocation().getRegionY() - 6) / 8; yCalc <= ((player.getLocation().getRegionY() + 6) / 8); yCalc++) {
				int region = yCalc + (xCalc << 8); // 1786653352
				if (forceSend || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147) && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
					int[] mapData = World.getInstance().getMapData(region);
					if(mapData == null) {
						mapData = new int[4];
					}
					spb.addInt(mapData[0]);
					spb.addInt(mapData[1]);
					spb.addInt(mapData[2]);
					spb.addInt(mapData[3]);
				}
			}
		}
		spb.addByteA(player.getLocation().getZ());
		spb.addShort(player.getLocation().getLocalX());
		spb.addShort(player.getLocation().getRegionY());
		player.getSession().write(spb.toPacket());
		player.getUpdateFlags().setLastRegion(player.getLocation());
		World.getInstance().getItemManager().refresh(player);
		World.getInstance().getObjectManager().refresh(player);
if (player.getLocation().getZ() == 0) {
deleteStaticObject(0, 3082, 3473);
sendCreateGlobalObject(42219, 0, 3158, 3486, -1, 10);
player.getActionSender().sendCreateObject(2068, 0, 3016, 3363, -1, 10);
player.getActionSender().sendCreateObject(21731, 0, 3173, 3490, -1, 10);
	player.getActionSender().sendCreateObject(409, 0, 2602, 3090, -1, 10);
        player.getActionSender().sendCreateObject(17010, 0, 2141, 3943, -1, 10);
		        player.getActionSender().sendCreateObject(409, 0, 3172, 3489, -1, 10);
player.getActionSender().sendCreateObject(13634, 0, 3159, 3491, -1, 10);		
GameEngine.TreeLive.treesCheck(player);
GameEngine.RockLive.rocksCheck(player);
GameEngine.StallLive.stallsCheck(player);
//player.RouteFinder().loadMap();
}
		} catch(Exception e) {
		}
	}	
	private boolean validateMapRegion() {
		boolean hasMapData = true;
		boolean forceSend = true;
		if((((player.getLocation().getRegionX() / 8) == 48) || ((player.getLocation().getRegionX() / 8) == 49)) && ((player.getLocation().getRegionY() / 8) == 48)) {
			forceSend = false;
		}
		if(((player.getLocation().getRegionX() / 8) == 48) && ((player.getLocation().getRegionY() / 8) == 148)) {
			forceSend = false;
		}
		for(int xCalc = (player.getLocation().getRegionX() - 6) / 8; xCalc <= ((player.getLocation().getRegionX() + 6) / 8); xCalc++) {
			for(int yCalc = (player.getLocation().getRegionY() - 6) / 8; yCalc <= ((player.getLocation().getRegionY() + 6) / 8); yCalc++) {
				int region = yCalc + (xCalc << 8); // 1786653352
				if(forceSend || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147) && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
					int[] mapData = World.getInstance().getMapData(region);
					if(mapData == null) {
						if (player.getRights() == 2)
System.out.println("Mapdata Missing: " + region);
						hasMapData = false;
					}else{
						if (player.getRights() == 2)
						System.out.println("Sucefull loaded Mapdata: "+region);	
					}
				}
			}
		}
		return hasMapData;
	}
	public void sendWindowPane(int pane, int subWindows) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(50).addShortA(pane).addShort(0).addByteS(subWindows);
			player.getSession().write(spb.toPacket());
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendTabs() {
		for(int i = 16; i <= 21; i++) {
			player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, i, false);
		}
		for(int i = 32; i <= 38; i++) {
			player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, i, false);
		}
		player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, 14, false);
		player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, 31, false);
		player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, 63, false);
		player.getActionSender().sendInterfaceConfig(player.isFullScreen() ? 746 : 548, 72, false);
		}

	private int interfaceIndex = -1;

	public void sendInterface(int showId, int windowId, int interfaceId, int childId) {
		try {
			int lastvalue = windowId * 65536 + interfaceId;
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(56)
			.addShort(interfaceId >> 16 | childId)
			.addByteS((byte) showId)
			.addShort(childId)
			.addLEInt(lastvalue);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	public void sendConfig(int id, int value) {
		try {
			if(value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
			sendConfig2(id, value);
		} else {
			sendConfig1(id, value);
		}
		} catch(Exception e) {
		}
	}
	
	public void sendConfig1(int id, int value) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(186)
			.addByteS((byte) value)
			.addLEShortA(id);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendConfig2(int id, int value) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(151)
			.addLEInt(value)
			.addShort(id);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendMessage(String message) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(193).setSize(Size.VariableByte)
			.addSmart(0)
			.addInt(0)
			.addByte((byte) 0)
			.addString(message);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}	
	public void sendItems(int interfaceId, int childId, int type, Container<Item> inventory) {
		try {
			int main = interfaceId * 65536 + childId;
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(120).setSize(Size.VariableShort);
			spb.addInt(main)
			.addShort(type)
			.addShort(inventory.getSize());
			for (int i = 0; i < inventory.getSize(); i++) {
				Item item = inventory.get(i);
				int id, amt;
				if (item == null) {
					id = -1;
					amt = 0;
				} else {
					id = item.getDefinition().getId();
					amt = item.getAmount();
				}
				if (amt > 254) {
					spb.addByteC(255);
					spb.addInt1(amt);
				} else {
					spb.addByteC(amt);
				}
				spb.addLEShort(id + 1);
			}
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	public void sendItems(int interfaceId, int childId, int type, int[] itemArray, int[] itemAmt) {
		try {
		int main = interfaceId * 65536 + childId;
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(120).setSize(Size.VariableShort);
		spb.addInt(main)
		.addShort(type)
		.addShort(itemArray.length);
        for (int i = 0; i < itemArray.length; i++) {
            if (itemAmt[i] > 254) {
				spb.addByteC((byte) 255);
				spb.addInt1(itemAmt[i]);
			} else {
				spb.addByteC((byte) itemAmt[i]);
			}
			spb.addLEShort(itemArray[i]+1);
		}
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
		public void sendItems(int main ,int type, Container<Item> inventory) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(120).setSize(Size.VariableShort);
			spb.addInt(main)
			.addShort(type)
			.addShort(inventory.getSize());
			for (int i = 0; i < inventory.getSize(); i++) {
				Item item = inventory.get(i);
				int id, amt;
				if (item == null) {
					id = -1;
					amt = 0;
				} else {
					id = item.getDefinition().getId();
					amt = item.getAmount();
				}
				if (amt > 254) {
					spb.addByteC(255);
					spb.addInt1(amt);
				} else {
					spb.addByteC(amt);
				}
				spb.addLEShort(id + 1);
			}
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendString(String string, int interfaceId, int childId) {
		try {
			string = "  " + string;
			int sSize = string.length() + 5;
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(106)
			.addByte((byte) (sSize / 256))
			.addByte((byte) (sSize % 256))
			.addString(string)
			.addInt2(interfaceId << 16 | childId);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	public void sendInfoString(String string, int SpaceId) {
		try {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(131).setSize(Size.VariableByte)
		.addString(string)
		.addShort(SpaceId)
		.addLEShortA(ID++);
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendChatboxInterface(int childId) {
		try {
		sendInterface(1, 752, 12, childId);
		} catch(Exception e) {
		}
	}
	
	public void sendCloseChatboxInterface() {
		try {
		sendCloseInterface(752, 12);
		} catch(Exception e) {
		}
	}

	public void sendInventoryInterface(int childId) {
		if(player.isFullScreen()) {
			sendInterface(0, 746, 26, childId);
		} else {
			sendInterface(0, 548, 145, childId);
		}
	}
	public void sendCloseInventoryInterface() {
		try {
		if(player.isFullScreen()) {
			sendCloseInterface(746, 26);
		} else {
			sendCloseInterface(548, 145);
		}
		} catch(Exception e) {
		}
	}

	public void sendTab(int tabId, int childId) {
		if(player.isFullScreen()) {
			sendInterface(1, 746, tabId, childId);
		} else {
			sendInterface(1, 548, tabId, childId);
		}
	}
	public void removeTab() {
		if(player.isFullScreen()) {
			sendCloseInterface(746, 5);
		} else {
			sendCloseInterface(548, 1);
		}
	}
	public void removeTab1() {
		if(player.isFullScreen()) {
			sendCloseInterface(746, 6);
		} else {
			sendCloseInterface(548, 6);
		}
	}	
	public void sendBankOptions() {
		try {
	        sendAccessMask(0, 496, 762, 81, 40, 1278);
	        sendAccessMask(0, 27, 763, 0, 36, 1150);
		sendBlankClientScript(1451);
		} catch(Exception e) {
		}
	}
    public void setTabs(Player p) {
       	sendConfig2(1246, 0);
        sendConfig2(1247, 0);
        sendConfig2(1248, -2013265920);
	if(p.tab[1] > 0) {
	    int i = p.tab[3] * (1024 * 1024);
	    int i2 = p.tab[2] * 1024;
	    int i3 = p.tab[1] + i2 + i;
	    sendConfig2(1246, i3);
	}
	if(p.tab[4] > 0) {
	    int i = p.tab[6] * (1024 * 1024);
	    int i2 = p.tab[5] * 1024;
	    int i3 = p.tab[4] + i2 + i;
	    sendConfig2(1247, i3);
	}
	if(p.tab[7] > 0) {
	    int i = p.tab[7];
	    int i2 = p.tab[8] * 1024;
	    int i3 = -2013265920 + (i + i2);
	    sendConfig2(1248, i3);
	}
    }
	public void sendRunScript(int id, Object[] params, String types) {
		try {
			if (params.length != types.length())
				throw new IllegalArgumentException("params size should be the same as types length");
			StaticPacketBuilder packet = new StaticPacketBuilder().setId(70).setSize(Size.VariableShort)
			.addShort(ID++)
			.addString(types);
			int idx = 0;
			for (int i = types.length() - 1;i >= 0;i--) {
				if (types.charAt(i) == 's') 
					packet.addString((String) params[idx]);
				else
					packet.addInt((Integer) params[idx]);
				idx++;
			}
			packet.addInt(id);
			player.getSession().write(packet.toPacket());
		} catch(Exception e) {
		}
	}
	public void sendAccessMask(int set1, int set2, int interfaceId1, int childId1, int interfaceId2, int childId2) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(113);
		spb.addInt(interfaceId2 << 16 | childId2)
		.addLEShort(set2)
		.addLEShort(set1)
		.addLEShortA(0)
		.addLEInt(interfaceId1 << 16 | childId1);
		player.getSession().write(spb.toPacket());
	}
public void sendAccessMask(int set, int inter, int child,  int off, int len) {
		try {
			StaticPacketBuilder packet = new StaticPacketBuilder().setId(113)
		.addInt(set) 
		.addLEShort(len)
		.addLEShort(off)
		.addLEShortA(ID++) 
		.addLEInt(inter << 16 | child);
			player.getSession().write(packet.toPacket());
		} catch(Exception e) {
		}
	}
    	/*public void setShop(Player p, int shopId) {
        ShopHandler sh = new ShopHandler();
        //p.frames.removeShownInterface(p);
        sendInterface(620);
        sendInventoryInterface(621);
        //p.frames.setTab(p, 81, 621);
        Object[] setshopparams = new Object[]{shopId, 93};
        Object[] invparams = new Object[]{"", "", "", "", "Sell 50", "Sell 10", "Sell 5", "Sell 1", "Value", -1, 0, 7, 4, 93, 40697856};
        Object[] shopparams = new Object[]{"", "", "", "Buy 50", "Buy X", "Buy 10", "Buy 5", "Buy 1", "Value", -1, 0, 4, 10, 7, 40632346};

        sendRunScript( 25, setshopparams, "vg");
        sendRunScript( 150, invparams, "IviiiIsssssssss");
        sendRunScript( 150, shopparams, "IviiiIsssssssss");
        sendAccessMask( 1278, 621, 0, 0, 28);
        sendInterfaceConfig( 620, 23, false);
        sendInterfaceConfig( 620, 24, true);
        sendInterfaceConfig( 620, 29, false);
        sendInterfaceConfig( 620, 25, true);
        sendInterfaceConfig( 620, 27, true);
        sendInterfaceConfig( 620, 26, false);
        sendAccessMask( 1278, 620, 26, 0, 40);
    }*/

	public void sendWearOption() {
		try {
Object[] tparams1 = new Object[]{"", "", "", "", "Wear<col=ff9040>", -1, 0, 7, 4, 93, 43909120};
sendRunScript(149, tparams1, "IviiiIsssss");
sendAccessMask(1026, 670, 0, 0, 27);
sendAccessMask(1030, 667, 14, 0, 13);
sendItems(-1, 0, 93, player.getInventory().getContainer());
		} catch(Exception e) {
		}
}
	public void sendGESetOption() {
		try {
sendItems(-1, 64209, 93, player.getInventory().getContainer());
sendAccessMask(14, 645, 16, 0, 73);
sendBlankClientScript(676);
Object[] tparams1 = new Object[]{"null", "null", "null", "null", "null", "null", "null", "Exchange", "Components", -1, 0, 7, 4, 93, 42205184};
sendRunScript(150, tparams1, "IviiiIsssssssss");
sendAccessMask(1030, 644, 0, 0, 27);
//GESET(35913813);
//GESET(35913743);
		} catch(Exception e) {
		}
}
	public void ReturnItem() {
sendInterface(772);
sendItems(-1, 63762, 540, player.getInventory().getContainer());
sendAccessMask(1026, 772, 10, -1, -1);
}

	public void CreatePouchOptions() {
sendInterface(669);
Object[] tparams1 = new Object[]{"List<col=FF9040>", "Infuse-X<col=FF9040>", "Infuse-All<col=FF9040>", "Infuse-10<col=FF9040>", "Infuse-5<col=FF9040>", "Infuse<col=FF9040>", 20, 4, 43843599};
sendRunScript(757, tparams1, "Iiissssss");
sendAccessMask(190, 669, 15, 0, 78);
}
	public void CreateScrollOptions() {
sendInterface(673);
Object[] tparams1 = new Object[]{"Transform-X<col=ff9040>", "Transform-All<col=ff9040>", "Transform-10<col=ff9040>", "Transform-5<col=ff9040>", "Transform<col=ff9040>", 20, 4, 44105743};
sendRunScript(763, tparams1, "Iiisssss");
sendAccessMask(126, 673, 15, 0, 78);
}

	public void sendPriceCheckerOptions() {
		try {
Object[] tparams1 = new Object[]{"", "", "", "", "Add-X", "Add-All", "Add-10", "Add-5", "Add", -1, 1, 7, 4, 93, 13565952};
sendRunScript(150, tparams1, "IviiiIsssssssss");
sendAccessMask(2360382, 207, 0, 0, 27);
player.getActionSender().sendItems(-1 ,0, 93, player.getInventory().getContainer());
sendAccessMask(1086, 206 , 18, 0, 54);
player.getActionSender().sendItems(-1 ,0, 90, player.getPriceCheck().pricecheckinv);
sendSpecialConfig(729, 999999999);
for(int i = 727; i >= 701; i--) {
sendSpecialConfig(i, 0);
}

player.itemPrice = 0;
for(int i = 0; i < 27; i++) {
Item item = player.getPriceCheck().pricecheckinv.get(i);
if(item != null) {
					int id = item.getId();
					int amt = item.getAmount();
					int value = GameEngine.prices.getNormalPrice(id);
					player.getActionSender().PriceCheck(700+i, value);
					player.itemPrice = player.itemPrice + (value*amt);
}
}
					sendSpecialConfig(728, player.itemPrice);
player.getActionSender().sendItems(-1 ,0, 90, player.getPriceCheck().pricecheckinv);
		} catch(Exception e) {
		}

}
	public void sendTradeOptions() {
		try {
Object[] tparams1 = new Object[]{"", "", "", "Value<col=FF9040>", "Remove-X", "Remove-All", "Remove-10", "Remove-5", "Remove", -1, 0, 7, 4, 90, 21954590};
sendRunScript(150, tparams1, "IviiiIsssssssss");
sendAccessMask(1150, 335, 30, 0, 27);		
Object[] tparams3 = new Object[]{"", "", "", "", "", "", "", "", "Value<col=FF9040>", -1, 0, 7, 4, 90, 21954593};
sendRunScript(695, tparams3, "IviiiIsssssssss");
sendAccessMask(1026, 335, 33, 0, 27);
Object[] tparams2 = new Object[]{"", "", "Lend", "Value<col=FF9040>", "Offer-X", "Offer-All", "Offer-10", "Offer-5", "Offer", -1, 0, 7, 4, 93, 22020096};
sendRunScript(150, tparams2, "IviiiIsssssssss");
		sendAccessMask(1278, 336, 0, 0, 27);
		sendAccessMask(1026, 335, 87, -1, -1);
		sendAccessMask(1030, 335, 88, -1, -1);
		sendAccessMask(1024, 335, 83, -1, -1);
sendInterfaceConfig(335, 74, true);
sendInterfaceConfig(335, 75, true);
		} catch(Exception e){
		}
	}

	public void sendBlankClientScript(int id) {
		try {
		StaticPacketBuilder packet = new StaticPacketBuilder().setId(70).setSize(Packet.Size.VariableShort)
		.addShort(id)
		.addString("");
		player.getSession().write(packet.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendShopTab(boolean isMainStock, boolean isGeneralStore) {
		try {
		player.getActionSender().sendInterfaceConfig(620, 24, false);
		if(isMainStock) {
			player.getActionSender().sendInterfaceConfig(620, 24, true);
			player.getActionSender().sendInterfaceConfig(620, 23, true);
			player.getActionSender().sendInterfaceConfig(620, 26, false);
			player.getActionSender().sendInterfaceConfig(620, 25, false);
			player.getActionSender().sendInterfaceConfig(620, 31, true);
			player.getActionSender().sendInterfaceConfig(620, 27, false);
			player.getActionSender().sendInterfaceConfig(620, 29, false);
			player.getActionSender().sendInterfaceConfig(620, 28, true);
		} else {
			player.getActionSender().sendInterfaceConfig(620, 24, false);
			player.getActionSender().sendInterfaceConfig(620, 23, false);
			player.getActionSender().sendInterfaceConfig(620, 26, true);
			player.getActionSender().sendInterfaceConfig(620, 25, true);
			player.getActionSender().sendInterfaceConfig(620, 31, false);
			player.getActionSender().sendInterfaceConfig(620, 27, true);
			player.getActionSender().sendInterfaceConfig(620, 29, true);
			player.getActionSender().sendInterfaceConfig(620, 28, false);
		}
		if(isGeneralStore) {
			player.getActionSender().sendInterfaceConfig(620, 24, true);
			player.getActionSender().sendInterfaceConfig(620, 23, true);
			player.getActionSender().sendInterfaceConfig(620, 26, false);
			player.getActionSender().sendInterfaceConfig(620, 25, false);
			player.getActionSender().sendInterfaceConfig(620, 31, true);
			player.getActionSender().sendInterfaceConfig(620, 27, false);
			player.getActionSender().sendInterfaceConfig(620, 29, false);
			player.getActionSender().sendInterfaceConfig(620, 28, true);
		} else {
			player.getActionSender().sendInterfaceConfig(620, 24, false);
			player.getActionSender().sendInterfaceConfig(620, 23, false);
			player.getActionSender().sendInterfaceConfig(620, 26, true);
			player.getActionSender().sendInterfaceConfig(620, 25, true);
			player.getActionSender().sendInterfaceConfig(620, 31, false);
			player.getActionSender().sendInterfaceConfig(620, 27, true);
			player.getActionSender().sendInterfaceConfig(620, 29, true);
			player.getActionSender().sendInterfaceConfig(620, 28, false);
		}
		} catch(Exception e) {
		}
	}
	
	public void sendShopOptions() {
		try {
sendAccessMask(0, 449, 15, -1, -1);
sendAccessMask(126, 620, 24, 0, 14);
 Object[] invparams = new Object[]{"null", "null", "null", "null", "Sell 50", "Sell 10", "Sell 5", "Sell 1", "Value", -1, 0, 7, 4, 93, 40697856};
sendRunScript(150, invparams, "IviiiIsssssssss");
sendAccessMask(1086, 621, 0, 0, 27);
        Object[] shopparams = new Object[]{"null", "null", "null", "null", "Buy 50", "Buy 10", "Buy 5", "Buy 1", "Value", -1, 0, 4, 10, 7, 40632346};
        sendRunScript(150, shopparams, "IviiiIsssssssss");
sendAccessMask(1086, 620, 26, 0, 39);

      /* sendAccessMask(0, 449, 15, -1, -1);
       sendAccessMask(126, 620, 24, 0, 14);
       sendAccessMask(1086, 620, 26, 0, 39);*/
		} catch(Exception e) {
		}
	}

	public void sendEnergy() {
		try {
		player.getSession().write(new StaticPacketBuilder().setId(63).addByte((byte) player.getRunEnergy()).toPacket());
		} catch(Exception e) {
		}
	}

    	public void resetGe(Player p, int slot) {
		player.getSession().write(new StaticPacketBuilder().setId(204).addByte((byte) slot).addByte((byte) 0).toPacket());
    	}
    public void setGeSearch(Player p, Object[] o) {
	sendConfig1(1109, -1);
	sendConfig1(1112, 0);
	sendConfig1(1113, 0);
	sendInterface(1, 752, 12, 389);
	/*StaticPacketBuilder packet = new StaticPacketBuilder().setId(70);
	packet.addShort(0);
        packet.addString("s");
	String valstring = "s";
        int j = 0;
        for (int i = (valstring.length() - 1); i >= 0; i--) {
            if (valstring.charAt(i) == 115) {
                packet.addString((String) o[j]);
            } else {
                packet.addInt((Integer) o[j]);
            }
            j++;
        }
        packet.addInt(570);
	p.getSession().write(packet.toPacket());*/
    }

	public void search(Object[] o) {
	   sendConfig1(1109, -1);
	   sendConfig1(1112, 0);
	   sendConfig1(1113, 0);
	   sendInterface(6, 752, 6, 389);
       StaticPacketBuilder spb = new StaticPacketBuilder().setId(70).setSize(Size.VariableShort);
       spb.addString("");
	   String valstring = "s";
       int j = 0;
       for (int i = valstring.length() - 1;i >= 0;i--) {
			if (valstring.charAt(i) == 's') 
                 spb.addString(((String) o[j]));
            else
               spb.addInt((Integer) o[j]);
            }
            j++;
			spb.addInt(570);
		player.getSession().write(spb.toPacket());
	}
   public void setGe(Player p, int slot, int progress, int item, int price, int amount, int currentAmount) {
	player.getSession().write(new StaticPacketBuilder().setId(204)
	.addByte((byte) slot) 
	.addByte((byte) progress)
	.addShort(item) 
	.addInt(price)
	.addInt(amount)
	.addInt(currentAmount) 
	.addInt(price * currentAmount).toPacket());
    }

        public void setGeOnLogin(final Player p) {

	}

        public void setItemSlot(Player p, int slot, int item, int amount) {
	    if(amount == 0) {
		return;
	    }
	    switch(slot) {
		case 0:
		    sendItems(-1, -1757, 523, new int[] {item}, new int[] {amount});
		    break;
		case 1:
		    sendItems(-1, -1758, 524, new int[] {item}, new int[] {amount});
		    break;
		case 2:
		    sendItems(-1, -1759, 525, new int[] {item}, new int[] {amount});
		    break;
		case 3:
		    sendItems(-1, -1760, 526, new int[] {item}, new int[] {amount});
		    break;
		case 4:
		    sendItems(-1, -1761, 527, new int[] {item}, new int[] {amount});
		    break;
		case 5:
		    sendItems(-1, -1762, 528, new int[] {item}, new int[] {amount});
		    break;
	    }
	}

        public void resetItemSlot(Player p, int slot) {
	    int item = -1;
	    int amount = 0;
	    switch(slot) {
		case 0:
		    sendItems(-1, -1757, 523, new int[] {item}, new int[] {amount});
		    break;
		case 1:
		    sendItems(-1, -1758, 524, new int[] {item}, new int[] {amount});
		    break;
		case 2:
		    sendItems(-1, -1759, 525, new int[] {item}, new int[] {amount});
		    break;
		case 3:
		    sendItems(-1, -1760, 526, new int[] {item}, new int[] {amount});
		    break;
		case 4:
		    sendItems(-1, -1761, 527, new int[] {item}, new int[] {amount});
		    break;
		case 5:
		    sendItems(-1, -1762, 528, new int[] {item}, new int[] {amount});
		    break;
	    }
	}
	
	public void sendCoords(Location location) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(207);
			int regionX = player.getUpdateFlags().getLastRegion().getRegionX(), regionY = player.getUpdateFlags().getLastRegion().getRegionY();
			spb.addByteS((byte) (location.getY()-((regionY-6)*8)));
			spb.addByte((byte) (location.getX()-((regionX-6)*8)));
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendCoords(Location location, int xoff, int yoff) {
		try {
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(207);
			int regionX = player.getUpdateFlags().getLastRegion().getRegionX(), regionY = player.getUpdateFlags().getLastRegion().getRegionY();
			spb.addByteS((byte) ((location.getY()-((regionY-6)*8))+yoff));
			spb.addByte((byte) ((location.getX()-((regionX-6)*8))+xoff));
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendDestroyGroundItem(FloorItem item) {
		try {
			sendCoords(item.getLocation());
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(221);
			spb.addByteS((byte) 0);
			spb.addShort(item.getId());
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}
	
	public void sendCreateGroundItem(FloorItem item) {
		try {
			sendCoords(item.getLocation());
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(22);
			spb.addLEShortA(item.getAmount());
			spb.addShort(item.getId());
			spb.addByteC(0);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}

	public void sendBonus() {
		try {
player.setEquipmentBonus();
		} catch(Exception e) {
		}
	}

	public void sendShopLoadMainStock(int shopId) {
		try {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(120).setSize(Size.VariableShort)
		.addString("vg")
		.addInt(shopId)
		.addInt(93)
		.addInt(25);
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}

	public void sendOverlay(int i) {
		try {
		sendInterface(1, 548, 5, i);
		} catch(Exception e) {
		}
	}

	public void sendRemoveOverlay() {
		try {
		sendCloseInterface(548, 5);
		} catch(Exception e) {
		}
	}

	public void sendProjectile(Location source, Location dest, int offsetX, int offsetY, int angle, int speed, int gfxMoving, int startHeight, int endHeight, Entity lockon) {
		try {
			sendCoords(source, -3, -2);
			StaticPacketBuilder spb = new StaticPacketBuilder().setId(223)
			.addByte((byte) angle)
			.addByte((byte) offsetX) 
			.addByte((byte) offsetY)
	        	.addShort(lockon == null ? -1 : (lockon instanceof Player ? - lockon.getClientIndex() - 1 : lockon.getClientIndex() + 1))
			.addShort(gfxMoving)
			.addByte((byte) startHeight)
			.addByte((byte) endHeight)
			.addShort(51)
			.addShort(speed)
			.addByte((byte) 16)
			.addByte((byte) 64);
			player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}

public void sendAcrossProjectile(Location source, Location dest, int offsetX, int offsetY, int angle, int speed, int gfxMoving, int startHeight, int endHeight, Entity lockon) {
//SlowProjectile
		/*try {
		sendCoords(source, -3, -2);
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(224)
		.addByte((byte) angle)
		.addByte((byte) offsetX) 
		.addByte((byte) offsetY)
		.addShort(lockon == null ? -1 : (lockon instanceof Player ? - lockon.getClientIndex() - 1 : lockon.getClientIndex() + 1))
		.addShort(gfxMoving) //0
		.addByte((byte) startHeight) //1 
		.addByte((byte) endHeight) //2
		.addShort(51)
		.addShort(speed) //3
		.addByte((byte) 16)
		.addByte((byte) 64);
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}*/
	}
public void sendStrangeProjectile(Location source, Location dest, int offsetX, int offsetY, int gfx, int angle, int startHeight, int endHeight, int speed, Entity lockon) {
//notUsed but works
		/*try {
		sendCoords(source, -3, -2);
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(73)
		.addByte((byte) angle)
		.addByte((byte) offsetX) 
		.addByte((byte) offsetY)
		.addShort(lockon == null ? -1 : (lockon instanceof Player ? - lockon.getClientIndex() - 1 : lockon.getClientIndex() + 1))
		.addShort(lockon == null ? -1 : (lockon instanceof Player ? - lockon.getClientIndex() - 1 : lockon.getClientIndex() + 1))
		.addShort(gfx) //dunno maybe time
		.addByte((byte) startHeight)
		.addByte((byte) endHeight)
		.addShort(51)
		.addShort(speed)
		.addByte((byte) 16)
		.addByte((byte) 64);
		player.getSession().write(spb.toPacket());
		} catch(Exception e) {
		}
	}*/
	}
}