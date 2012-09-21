package com.rs2hd.content.skills.farming;

public class Patch {
	
	private int x;
	private int y;
	private int height;
	private int currentPlant;
	private boolean hasPlant;
	private int rakesLeft;
	private boolean isRaked;
	private int type;
	private int statusLeft = 60;
	private int currentObject;
	
	public Patch(int x, int y, int height, int plantID, boolean hasPlant) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.currentPlant = plantID;
		this.hasPlant = hasPlant;
		this.rakesLeft = 4;
	}
	
	public void setType(int i) {
		this.type = i;
	}
	
	public int getType() {
		return this.type;
	}
	
	public boolean isRaked() {
		return this.isRaked;
	}
	
	public int rakesLeft() {
		return this.rakesLeft;
	}
	
	public int rakesToGo() {
		return 4 - this.rakesLeft;
	}
	
	public void setRakes(int i) {
		this.rakesLeft = i;
	}
	
	public void decreaseRakes() {
		this.rakesLeft--;
		if (rakesLeft == 0) {
			this.isRaked = true;
		}
	}
	
	public void increaseRakes() {
		this.rakesLeft++;
		if (rakesLeft > 0) {
			this.isRaked = false;
		}
	}
	
	public void setX(int i) {
		this.x = i;
	}
	
	public void setY(int i) {
		this.y = i;
	}
	
	public void setHeight(int i) {
		this.height = i;
	}
	
	public void setCurrentPlant(int i) {
		this.currentPlant = i;
	}
	
	public void setX(boolean b) {
		this.hasPlant = b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getCurrentPlant() {
		return this.currentPlant;
	}
	
	public boolean hasPlant() {
		return this.hasPlant;
	}

	public int stagesFar() {
		if (statusLeft >= 0 && statusLeft <= 15) {
			return 1;
		} else if (statusLeft >= 16 && statusLeft <= 30) {
			return 2;
		} else if (statusLeft >= 31 && statusLeft <= 45) {
			return 3;
		} else if (statusLeft >= 46 && statusLeft <= 60) {
			return 4;
		} else {
			return -1;
		}
	}

	public void setCurrentObject(int compost) {
		this.currentObject = compost;
	}
	
	public int getCurrentObject() {
		return this.currentObject;
	}

}
