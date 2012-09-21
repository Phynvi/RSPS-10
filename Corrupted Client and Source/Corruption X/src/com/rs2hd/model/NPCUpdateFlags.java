package com.rs2hd.model;

/**
 * NPC update flags.
 * @author Graham
 *
 */
public class NPCUpdateFlags {
	
	private boolean npcswitchUpdateRequired = false, forceTextUpdateRequired = false,  graphicsUpdateRequired = false, animationUpdateRequired = false, hit1UpdateRequired = false, hit2UpdateRequired = false, faceToUpdateRequired = false;
	private boolean clearFaceTo = false, didTeleport = false, Walked = false;
	
	public boolean isClearFaceTo() {
		return clearFaceTo;
	}
	
	public void setClearFaceTo(boolean b) {
		this.clearFaceTo = b;
	}

	private int faceTo = -1;
	
	public boolean isUpdateRequired() {
		return npcswitchUpdateRequired || forceTextUpdateRequired ||  animationUpdateRequired || hit1UpdateRequired || hit2UpdateRequired || faceToUpdateRequired || graphicsUpdateRequired;
	}
	
	public void setAnimationUpdateRequired(boolean b) {
		this.animationUpdateRequired = b;
	}
	
	public boolean isAnimationUpdateRequired() {
		return animationUpdateRequired;
	}
	public void setNpcSwitchUpdateRequired(boolean b) {
		try{
		this.npcswitchUpdateRequired = b;
	} catch(Exception e) {
	}
	}
	
	public boolean isNpcSwitchUpdateRequired() {
		return npcswitchUpdateRequired;
	}
	
	public void setHit1UpdateRequired(boolean b) {
		try {
		this.hit1UpdateRequired = b;
	} catch(Exception e) {
	}
	}
	
	public boolean isHit1UpdateRequired() {
		return hit1UpdateRequired;
	}
	
	public void setHit2UpdateRequired(boolean b) {
		this.hit2UpdateRequired = b;
	}
	
	public boolean isHit2UpdateRequired() {
		return hit2UpdateRequired;
	}
	
	public boolean isFaceToUpdateRequired() {
		return faceToUpdateRequired;
	}
	
	public void setFaceToUpdateRequired(boolean b) {
		this.faceToUpdateRequired = b;
	}
	
	public void setFaceToUpdateRequired(boolean b, int i) {
		this.faceToUpdateRequired = b;
		this.faceTo = i;
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
	public boolean didTeleport() {
		return didTeleport;
	}
	public boolean Walked() {
		return Walked;
	}
	public int getFaceTo() {
		return faceTo;
	}
	
	public void clear() {
		didTeleport = false;
		Walked = false;
		npcswitchUpdateRequired = false;
		forceTextUpdateRequired = false;
		animationUpdateRequired = false;
		faceTo = -1;
		faceToUpdateRequired = false;
		hit1UpdateRequired = false;
		hit2UpdateRequired = false;
		graphicsUpdateRequired = false;
	}

	public void setGraphicsUpdateRequired(boolean b) {
		try {
		graphicsUpdateRequired = b;
		} catch(Exception e) {
		}
	}
	public void setWalked(boolean  Walked) {
		try {
		this.Walked = Walked;
		} catch(Exception e) {
		}
	}
	public void setDidTeleport(boolean didTeleport) {
		try {
		this.didTeleport = didTeleport;
		} catch(Exception e) {
		}
	}
	public boolean isGraphicsUpdateRequired() {
		return graphicsUpdateRequired;
	}

}
