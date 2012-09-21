package com.rs2hd.model;

/**
 * Settings.
 * @author Graham
 *
 */
public class Settings {
	
	private boolean chat = true, split = false, mouse = true, aid = false;
	private boolean hideDeathInterface = false, autoRetaliate = true;
	private transient Player player;
	
	public void setDefaultSettings() {
		try {
		chat = true;
		split = false;
		mouse = true;
		aid = false;
		} catch(Exception e) {
		}
	}
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}
	
	public void refresh() {
		try {
		player.getActionSender().sendConfig(171, !chat ? 1 : 0);
		player.getActionSender().sendConfig(287, split? 1 : 0);
		player.getActionSender().sendConfig(170, !mouse ? 1 : 0);
		player.getActionSender().sendConfig(427, aid ? 1 : 0);
		player.getActionSender().sendConfig(172, !autoRetaliate ? 1 : 0);
		} catch(Exception e) {
		}
	}
	
	public boolean isHidingDeathInterface() {
		return hideDeathInterface;
	}
	
	public void setHideDeathInterface(boolean b) {
		this.hideDeathInterface = b;
	}
	
	public boolean isMouseTwoButtons() {
		return mouse;
	}
	
	public boolean isChatEffectsEnabled() {
		return chat;
	}
	
	public boolean isPrivateChatSplit() {
		return split;
	}
	
	public boolean isAcceptAidEnabled() {
		return aid;
	}
	
	public void setMouseTwoButtons(boolean mouse) {
		try {
		this.mouse = mouse;
		} catch(Exception e) {
		}
	}
	
	public void setChatEffectsEnabled(boolean chat) {
		try {
		this.chat = chat;
		} catch(Exception e) {
		}
	}
	
	public void setPrivateChatSplit(boolean split) {
		try {
		this.split = split;
		} catch(Exception e) {
		}
	}
	
	public void setAcceptAidEnabled(boolean aid) {
		try {
		this.aid = aid;
		} catch(Exception e) {
		}
	}

	public boolean isAutoRetaliate() {
		return this.autoRetaliate;
	}
	
	public void setAutoRetaliate(boolean retaliate) {
		try {
		this.autoRetaliate = retaliate;
		refresh();
		} catch(Exception e) {
		}
	}

}
