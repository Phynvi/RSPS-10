package com.rs2hd.model;

public class ShopConfiguration {
	
	private Shop currentShop = null;
	
	public Shop getCurrentShop() {
		return currentShop;
	}
	
	public boolean isShopping() {
		return currentShop != null;
	}
	
	public void setCurrentShop(Shop shop) {
		currentShop = shop;
	}
	
	public void resetCurrentShop() {
		currentShop = null;
	}

}
