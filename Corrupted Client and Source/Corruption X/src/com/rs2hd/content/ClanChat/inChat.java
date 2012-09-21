package com.rs2hd.content.ClanChat;

public class inChat {
    public String name = "";
    public int status = 0;
    public int chance = 0;
    public inChat(String name) {
	try{
		this.name = name;
		}catch (Exception e) {}
    }
    public void clear() {
	try {
		name = "";
		}catch (Exception e) {}
    }

}