package com.rs2hd.model;

public class ChatMessage {
	
	private int effects;
	private int numChars;
	private String chatText;
	
	public ChatMessage(int effects, int numChars, String chatText) {
		this.effects = effects;
		this.numChars = numChars;
		this.chatText = chatText;
	}
	
	public int getEffects() {
		try {
		return effects;
		} catch(Exception e) {
		return 0;
		}
	}
	
	public int getNumChars() {
		try {
		return numChars;
		} catch(Exception e) {
		return 1;
		}
	}
	
	public String getChatText() {
		try {
		return chatText;
		} catch(Exception e) {
		return "l";
		}
	}

}
