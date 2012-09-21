package com.rs2hd.content.ClanChat;

import java.util.ArrayList;
import java.util.List;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Stream;
import com.rs2hd.event.Event;
import com.rs2hd.util.Misc;
import com.rs2hd.util.log.Logger;
import java.io.*;

public class ClanMain {
	private Logger logger = Logger.getInstance();
	public ClanMain() {
		loadChats();
		logger.info("Loaded " +count+ " clans.");
	}
	private Stream stream = new Stream(5000, 5000);

	public static List<ClanList> ClanList = new ArrayList<ClanList>(2000);

	public void clanMessage(Player p, String message) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.isInClan(p)) {
				l.sendClanMessage(p.getUsername() , message);
			}
		}
	}
	public boolean inChatWith(Player p, Player p2) {
		boolean bool = false;
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.isInClan(p) && l.isInClan(p2)) {
				bool = true;
			}
		}
		return bool;
	}

	public void rankPlayer(Player p, int rank, String name) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.Owner.equals(p.getUsername())) {
				l.addRank(name, rank);
				l.setList();
			}
		}
	}


	public boolean hasChat(Player p) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.Owner.equals(p.getUsername())) {
				return true;
			}
		}
		return false;
	}

	public int talkReq(Player p) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.Owner.equals(p.getUsername())) {
				return l.talkReq;
			}
		}
		return 0;
	}

	public int currentRank(String p) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.rank1.contains(p)) {
				return 1;
			} else if(l.rank2.contains(p)) {
				return 2;
			} else if(l.rank3.contains(p)) {
				return 3;
			} else if(l.rank4.contains(p)) {
				return 4;
			} else if(l.rank5.contains(p)) {
				return 5;
			} else if(l.rank6.contains(p)) {
				return 6;
			}
		}
		return 0;
	}

	public String clanName(Player p) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.Owner.equals(p.getUsername())) {
				return l.clanName;
			}
		}
		return " ";
	}

	public String clanName2(Player p) {
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(l.isInClan(p)) {
				return l.clanName;
			}
		}
		return "";
	}

	public void joinChat(Player p, String name) {
		boolean found = false;
		p.getActionSender().sendMessage("Attempting to join channel...");
		for(ClanList l : ClanList) {
			if(l == null) {
				continue;
			}
			if(Misc.formatPlayerNameForProtocol(l.Owner).equals(Misc.formatPlayerNameForProtocol(name))) {
				if(currentRank(p.getUsername()) < l.joinReq) {
					p.getActionSender().sendMessage("You don't have a high enough rank to join this chat.");
					return;
				}
				if(l.clanName.equals("")) {
					p.getActionSender().sendMessage("This person's chat is disabled.");
					continue;
				}
				if(!l.isInClan(p)) {
					l.inChat.add(new inChat(p.getUsername()));
				} else {
					l.setIn(p);
				}
				setRest(p, l);
				found = true;
			}
		}
		if(!found) {
			notFound(p);
		}
	}
	public void notFound(final Player p) {
		World.getInstance().registerEvent(new Event(500) {
			@Override
			public void execute() {
				p.getActionSender().sendMessage("This person doesn't own a clan.");
				p.inChat = false;
				this.stop();
			}
		});
	}
	public void setRest(final Player p, final ClanList l) {
		World.getInstance().registerEvent(new Event(500) {
			@Override
			public void execute() {
				p.getActionSender().sendMessage("Now talking in clan channel " + Misc.upper(l.clanName));
				p.getActionSender().sendMessage("To talk, start each line of chat with the / symbol.");
				p.inChat = true;
				l.setList();
				this.stop();
			}
		});
	}
	public void leaveChat(Player p) {
		for(ClanList l : ClanList) {
			if(l == null || l.Owner.equals("") || l.clanName.equals("")) {
				continue;
			}
			if(clanName2(p).equals(l.clanName)) {
				l.leaveChat(p);
			}
			l.setList();

		}
	}
	public void clanName3(Player p, String s) {
		boolean found = false;
		for(ClanList l : ClanList) {
			if(l == null || !l.Owner.equals(Misc.formatPlayerNameForProtocol(p.getUsername()))) {
				continue;
			}
			l.clanName = s;
			found = true;
			l.setList();

		}
		if(!found) {
			ClanList.add(new ClanList(Misc.formatPlayerNameForProtocol(p.getUsername()),s));
		}
	}

	public void saveChats() throws Exception {
		int i2 = 0;
		for(ClanList l : ClanList) {
			if(l == null || l.Owner == "") {
				return;
			}
			i2++;
			stream.outOffset = 0;
			stream.writeString("Owner:" + l.Owner);
			stream.writeString("clanName:" + l.clanName);
			stream.writeString("join:" + l.joinReq);
			stream.writeString("talk:" + l.talkReq);
			stream.writeString("kick:" + l.kickReq);
			for (int i = 0; i < 200; i++) {
				if (i < l.rank1.size()) {
					stream.writeString("rank1" + i + ":" + l.rank1.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.rank2.size()) {
					stream.writeString("rank2" + i + ":" + l.rank2.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.rank3.size()) {
					stream.writeString("rank3" + i + ":" + l.rank3.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.rank4.size()) {
					stream.writeString("rank4" + i + ":" + l.rank4.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.rank5.size()) {
					stream.writeString("rank5" + i + ":" + l.rank5.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.rank6.size()) {
					stream.writeString("rank6" + i + ":" + l.rank6.get(i));
				}
			}
			for (int i = 0; i < 200; i++) {
				if (i < l.friends.size()) {
					stream.writeString("friends" + i + ":" + l.friends.get(i));
				}
			}
			stream.writeString("null");
			FileOutputStream out = new FileOutputStream("./data/Clans/" + i2 + ".dat");
			out.write(stream.outBuffer, 0, stream.outOffset);
			out.flush();
			out.close();
			out = null;
		}
	}
	private int count = 0;
	public void loadChats() {
		logger.info("Loading Clans...");
		for(int i = 0; i <= 2000; i++) {
			stream.inOffset = 0;
			try {
				FileInputStream in = new FileInputStream("./data/Clans/" + i + ".dat");
				in.read(stream.inBuffer);
				in.close();
				in = null;
			} catch (Exception e) {
				continue;
			}
			String line;
			try {
				boolean created = false;
				String owner = "";
				String name = "";
				while ((line = stream.readString()) != null && line.length() > 0 && !line.equals("null")) {
					if (line.startsWith("Owner:")) {
						owner = line.substring(line.indexOf(":")+1);
					} else if (line.startsWith("clanName:")) {
						name = line.substring(line.indexOf(":")+1);
					}
					if(!created && !name.equals("") && !owner.equals("")) {
						ClanList.add(new ClanList(owner, name));
						created = true;
						count++;
					}
					for(ClanList l : ClanList) {
						if(l == null || l.Owner != owner) {
							continue;
						}
						if (line.startsWith("talkReq:")) {
							l.talkReq = Integer.parseInt(line.substring(8));
						} else if (line.startsWith("joinReq:")) {
							l.joinReq = Integer.parseInt(line.substring(8));
						} else if (line.startsWith("kickReq:")) {
							l.kickReq = Integer.parseInt(line.substring(8));
						} else if(line.startsWith("rank1")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank1.add(rankName);
						} else if(line.startsWith("rank2")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank2.add(rankName);
						} else if(line.startsWith("rank3")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank3.add(rankName);
						} else if(line.startsWith("rank4")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank4.add(rankName);
						} else if(line.startsWith("rank5")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank5.add(rankName);
						} else if(line.startsWith("rank6")) {
							String rankName = line.substring(line.indexOf(":")+1);
							l.rank6.add(rankName);
						} else if(line.startsWith("friends")) {
							String friendName = String.valueOf(line.substring(line.indexOf(":")+1));
							l.friends.add(friendName);
						}
						break;
					}
				}
			} catch(Exception e) {}
		}
	}

}