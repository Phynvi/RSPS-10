package com.rs2hd.content.ClanChat;

import java.util.ArrayList;
import java.util.List;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet.Size;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.util.Misc;

public class ClanList {

	public String Owner = "";
	public String clanName = "";
	public int joinReq = 0;
	public int talkReq = 0;
	public int kickReq = 7;
	public List<String> friends = new ArrayList<String>(200);
	public List<String> rank1 = new ArrayList<String>(200);
	public List<String> rank2 = new ArrayList<String>(200);
	public List<String> rank3 = new ArrayList<String>(200);
	public List<String> rank4 = new ArrayList<String>(200);
	public List<String> rank5 = new ArrayList<String>(200);
	public List<String> rank6 = new ArrayList<String>(200);
	public List<inChat> inChat = new ArrayList<inChat>(200);

	public int currentRank(String p) {
		if(rank1.contains(p)) {
			return 1;
		} else if(rank2.contains(p)) {
			return 2;
		} else if(rank3.contains(p)) {
			return 3;
		} else if(rank4.contains(p)) {
			return 4;
		} else if(rank5.contains(p)) {
			return 5;
		} else if(rank6.contains(p)) {
			return 6;
		}
		return 0;
	}

	private int clanNumber() {
		int count = 0;
		for(inChat i : inChat) {
			if(i == null || i.equals("") || i.status == 1) {
				continue;
			}
			count++;
		}
		return count;
	}


	public void leaveChat(Player p) {
		for(inChat l : inChat) {
			if(l == null) {
				continue;
			}
			if(l.name.equals(p.getUsername())) {
				l.status = 1;
			}
		}
		setList();
	}

	public ClanList(String Owner, String clanName) {
		this.Owner = Owner;
		this.clanName = clanName;
	}

	public void setReq(int id, int set) {
		switch(id) {
		case 1:
			joinReq = set;
			break;
		case 2:
			talkReq = set;
			break;
		case 3:
			kickReq = set;
			break;
		}
	}

	public void addRank(String name, int rank) {
		name = name.toLowerCase();
		rank1.remove(name);
		rank2.remove(name);
		rank3.remove(name);
		rank4.remove(name);
		rank5.remove(name);
		rank6.remove(name);
		friends.remove(name);
		switch(rank) {
		case 1:
			rank1.add(name);
			break;
		case 2:
			rank2.add(name);
			break;
		case 3:
			rank3.add(name);
			break;
		case 4:
			rank4.add(name);
			break;
		case 5:
			rank5.add(name);
			break;
		case 6:
			rank6.add(name);
			break;
		}
	}
	public void updateFriends() {
		Player p = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(Owner));
		if(p == null) {
			return;
		}
		for(int i = 0; i < friends.size(); i++) {
			friends.remove(friends.get(i));
		}
		for(int i = 0; i < p.getFriends().getFriends().size(); i++) {
			friends.add(p.getFriends().getFriends().get(i));
		}
	}
	public void setList() {
		updateFriends();
		for(Player p : World.getInstance().getPlayerList()) {
			if(p == null) {
				continue;
			}
			for(inChat l2 : inChat) {
				if(l2 == null || l2.name.equals("")) {
					continue;
				}
				if(!l2.name.equals(p.getUsername()) || l2.status == 1) {
					continue;
				}
				StaticPacketBuilder spb = new StaticPacketBuilder().setId(91).setSize(Size.VariableShort);
				spb.addString(Misc.upper2(Owner.replaceAll("_", " ")))//Owner Name
				.addByte((byte) 1)//Kick Req
				.addString("")//Idk yet
				.addLong(Misc.stringToLong(clanName))//Room name
				.addByte((byte) 1)
				.addByte((byte) clanNumber());//Amount of people in room
				for(inChat l : inChat) {
					if(l == null || l.name.equals("") || l.status == 1) {
						continue;
					}
					if(l.status == 1) {
						continue;
					}
					spb.addString(Misc.upper2(l.name.replaceAll("_", " ")))//Player name
					.addByte((byte) 1)
					.addString("")
					.addShort(1);//Index
					Player p3 = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(l.name));
					if(l.name.equals(Owner)) {
						spb.addByte((byte) 7);
						if (p3 != null) {
							if(p3.getRights() == 2) {
								spb.addByte((byte) 127);
							}
						}
					} else if(rank1.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 1);
					} else if(rank2.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 2);
					} else if(rank3.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 3);
					} else if(rank4.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 4);
					} else if(rank5.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 5);
					} else if(rank6.contains(l.name.toLowerCase())) {
						spb.addByte((byte) 6);
					} else {
						if(friends.contains(l.name.toLowerCase())) {
							spb.addByte((byte) 0);
						} else {
							spb.addByte((byte) -1);
						}
					}
					spb.addString("CorruptionX");//World ID
				}
				p.getSession().write(spb.toPacket());
			}
		}
	}
	public void sendClanMessage(String from, String message) {
		Player p2 = World.getInstance().getPlayerList().get(World.getInstance().getIdFromName(Misc.formatPlayerNameForProtocol(from)));
		for(Player p : World.getInstance().getPlayerList()) {
			if(p == null) {
				continue;
			}
			for(inChat l2 : inChat) {
				if(l2 == null || l2.name.equals("")) {
					continue;
				}
				if(!l2.name.equals(p.getUsername()) || l2.status == 1) {
					continue;
				}
				p.getActionSender().sendClanChat(p2, from, clanName, message);
			}
		}
	}
	public boolean isInClan(Player p) {
		for(inChat l : inChat) {
			if(l == null || l.name.equals("")) {
				continue;
			}
			if(l.name.equals(Misc.formatPlayerNameForProtocol(p.getUsername()))) {
				return true;
			}
		}
		return false;
	}

	public boolean isInClan2(String p) {
		for(inChat l : inChat) {
			if(l == null || l.name.equals("")) {
				continue;
			}
			if(Misc.formatPlayerNameForProtocol(l.name).equals(Misc.formatPlayerNameForProtocol(p))) {
				return true;
			}
		}
		return false;
	}

	public void setIn(Player p) {
		for(inChat l : inChat) {
			if(l == null || !Misc.formatPlayerNameForProtocol(l.name).equals(Misc.formatPlayerNameForProtocol(p.getUsername()))) {
				continue;
			}
			l.status = 0;
		}
	}

}