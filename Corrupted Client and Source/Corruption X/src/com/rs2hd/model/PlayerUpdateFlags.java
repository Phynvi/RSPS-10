package com.rs2hd.model;

/**
 * Manages update flags.
 * @author Graham
 *
 */
public class PlayerUpdateFlags {
	
	private Location lastRegion;
	private boolean faceToUpdateRequired = false, appearanceUpdateRequired = true, chatTextUpdateRequired = false, forceTextUpdateRequired = false, animationUpdateRequired = false, graphicsUpdateRequired = false, hitUpdateRequired = false, hit2UpdateRequired = false;
	private boolean didTeleport = true, didMapRegionChange = false;
	private boolean clearFaceTo = false;
	
	private int faceTo = -1;
	
	public boolean isClearFaceTo() {
		return clearFaceTo;
	}
	
	public Location getLastRegion() {
		return lastRegion;
	}
	
	public void setLastRegion(Location lastRegion) {
		this.lastRegion = lastRegion;
	}
	
	public boolean isUpdateRequired() {
		return faceToUpdateRequired || appearanceUpdateRequired || chatTextUpdateRequired || forceTextUpdateRequired || animationUpdateRequired || graphicsUpdateRequired || hitUpdateRequired || hit2UpdateRequired;
	}
	
	public void setFaceToUpdateRequired(boolean b) {
		faceToUpdateRequired = b;
	}
	
	public void setFaceToUpdateRequired(boolean b, int i) {
		faceToUpdateRequired = b;
		faceTo = i;
	}
	
	public boolean isFaceToUpdateRequired() {
		return faceToUpdateRequired;
	}
	
	public int getFaceTo() {
		return faceTo;
	}
	
	public void clear() {
		try {
		faceTo = -1;
		faceToUpdateRequired = false;
		appearanceUpdateRequired = false;
		didTeleport = false;
		didMapRegionChange = false;
		chatTextUpdateRequired = false;
		forceTextUpdateRequired = false;
		animationUpdateRequired = false;
		graphicsUpdateRequired = false;
		hitUpdateRequired = false;
		hit2UpdateRequired = false;
		} catch(Exception e) {
		}
	}
	
	public boolean isAppearanceUpdateRequired() {
		return appearanceUpdateRequired;
	}
	
	public boolean isGraphicsUpdateRequired() {
		return graphicsUpdateRequired;
	}
	
	public void setGraphicsUpdateRequired(boolean b) {
		try {
		this.graphicsUpdateRequired = b;
		} catch(Exception e) {
		}
	}
	
	public boolean didTeleport() {
		return didTeleport;
	}
	
	public boolean didMapRegionChange() {
		return didMapRegionChange;
	}
	
	public void setDidMapRegionChange(boolean didMapRegionChange) {
		try {
		this.didMapRegionChange = didMapRegionChange;
		} catch(Exception e) {
		}
	}

	public void setDidTeleport(boolean didTeleport) {
		try {
		this.didTeleport = didTeleport;
		} catch(Exception e) {
		}
	}

	public void setAppearanceUpdateRequired(boolean b) {
		try {
		appearanceUpdateRequired = b;
		} catch(Exception e) {
		}
	}
	
	public void setChatTextUpdateRequired(boolean b) {
		try {
		chatTextUpdateRequired = b;
		} catch(Exception e) {
		}
	}

	public boolean isChatTextUpdateRequired() {
		return chatTextUpdateRequired;
	}
	public void setForceTextUpdateRequired(boolean b) {
		try {
		this.forceTextUpdateRequired = b;
		} catch(Exception e) {
		}
	}

	public boolean isForceTextUpdateRequired() {
		return forceTextUpdateRequired;
	}
	public void setAnimationUpdateRequired(boolean b) {
		try {
		this.animationUpdateRequired = b;
		} catch(Exception e) {
		}
	}
	
	public boolean isAnimationUpdateRequired() {
		return this.animationUpdateRequired;
	}
	
	public void setHitUpdateRequired(boolean b) {
		try {
		this.hitUpdateRequired = b;
		} catch(Exception e) {
		}
	}
	
	public boolean isHitUpdateRequired() {
		return this.hitUpdateRequired;
	}
	
	public void setHit2UpdateRequired(boolean b) {
		try {
		this.hit2UpdateRequired = b;
		} catch(Exception e) {
		}
	}
	
	public boolean isHit2UpdateRequired() {
		return this.hit2UpdateRequired;
	}

	public void setClearFaceTo(boolean b) {
		try {
		this.clearFaceTo = b;
		} catch(Exception e) {
		}
	}

}
