package com.rs2hd.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages friends and ignores.
 *
 * @author Graham
 */
public class Friends {

	private transient Player player;

	private List<String> friends;
	private List<String> ignores;

	private transient int messageCounter;

	public Friends() {
		friends = new ArrayList<String>(200);
		ignores = new ArrayList<String>(100);
	}

	public int getNextUniqueId() {
		if (messageCounter >= 16000000) {
			messageCounter = 0;
		}
		return messageCounter++;
	}

	public void setPlayer(Player player) {
		this.player = player;
		this.messageCounter = 1;
	}

	public void refresh() {
		player.getActionSender().sendFriendsStatus(2);
		for (String s : friends) {
			player.getActionSender().sendFriendOffline(s, 0);
		}
		for (Player players : World.getInstance().getPlayerList()) {
			if(players == null) {
			   continue;
			}
			if (friends.contains(players.getUsername().toLowerCase())) {
				player.getActionSender().sendFriendOnline(players.getUsername(), 0);
			}
		}
	}
	public List<String> getFriends() {
		return friends;
	}
	public void addFriend(String name) {
		name = name.toLowerCase();
		boolean bool = false;
		if (friends.size() >= 200) {
			player.getActionSender().sendMessage("Your friends list is full.");
			return;
		}
		if (friends.contains(name)) {
			player.getActionSender().sendMessage((name) + " is already on your friends list.");
			return;
		}
		for (Player pl : World.getInstance().getPlayerList()) {
			if (pl == null) {
				continue;
			}
			if(pl.getUsername().toLowerCase().replaceAll("_", " ").equals(name)) {
				friends.add(name);
				player.getActionSender().sendFriendOnline(name, 1);
				bool = true;
			}
		}
		if (!bool) {
			player.getActionSender().sendFriendOffline(name, 0);
		}
	}
	public void addIgnore(String name) {
		if (ignores.size() >= 100) {
			player.getActionSender().sendMessage("Your ignore list is full.");
			return;
		}
		if (ignores.contains( name)) {
			player.getActionSender().sendMessage((name) + " is already on your ignore list.");
			return;
		}
		ignores.add(name);

	}

	public void removeFriend(String name) {
		name = name.toLowerCase();
		friends.remove(name);
	}

	public void removeIgnore(String name) {
		name = name.toLowerCase();
		ignores.remove(name);
	}

	public void registered() {
		for (Player p : World.getInstance().getPlayerList()) {
			if (p != null) {
				p.getFriends().registered(player);
			}
		}
	}

	private void registered(Player p) {
		String n = p.getPlayerDetails().getUsername().toLowerCase().replaceAll("_", " ");
		if (friends.contains(n)) {
			player.getActionSender().sendFriendOnline(n, 1);
		}
	}

	public void unregistered() {
		for (Player p : World.getInstance().getPlayerList()) {
			if (p != null) {
				p.getFriends().unregistered(player);
			}
		}
	}

	private void unregistered(Player p) {
		String n = p.getPlayerDetails().getUsername().toLowerCase().replaceAll("_", " ");
		if (friends.contains(n)) {
			player.getActionSender().sendFriendOffline(n, 0);
		}
	}

	public void sendMessage(String name, String text) {
		name = name.toLowerCase().replaceAll("_", " ");
		for (Player p : World.getInstance().getPlayerList()) {
			if (p != null) {
				if (p.getUsername().toLowerCase().replaceAll("_", " ").equals(name.toLowerCase())) {
					p.getActionSender().sendReceivedPrivateMessage(player.getRights(), player.getUsername(), text);
					player.getActionSender().sendSentPrivateMessage(name, text);
					return;
				} else {
					//player.getActionSender().sendMessage((name) + " is currently unavailable.");
				}
			}
		}
	}
}
