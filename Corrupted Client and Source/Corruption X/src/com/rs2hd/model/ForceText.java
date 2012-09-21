package com.rs2hd.model;

/**
 * @author Luke132
 */
public class ForceText {

	private String text;
	
	public ForceText(String message) {
		this.text = message;
	}

	public String getText() {
		try {
		return text;
		} catch(Exception e) {
		return "";
		}
	}

}
