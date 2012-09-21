package com.rs2hd.model;

import com.rs2hd.util.Misc;
import java.util.HashMap;
import java.util.*;
import com.rs2hd.content.Combat.CombatType;
/**
 * An 'entity' in the game world.
 * @author Graham
 *
 */
public abstract class Entity {
	
	public static final Location DEFAULT_LOCATION = Location.location(3162, 3485, 0);
	public Location location;
	public static final Location CLAN_DEATH = Location.location(3273, 3687, 0);
	private transient int index;
	private transient Location teleportTo;
	private transient Hits hits;
	private transient Sprite sprite;
	private transient Animation lastAnimation;
	private transient Graphics lastGraphics;
	private transient NpcSwitch lastNpcSwitch;
	private transient Entity interactingWith;
	private transient boolean attacking;
	private transient int combatTurns;
	private transient boolean dead;
	private transient Map<Entity, Integer> killers;
	private transient boolean hidden;
	private transient boolean isAggressor;
	public int attackStyle;
		public abstract boolean isAutoRetaliating();
	public Entity() {
		this.location = DEFAULT_LOCATION;
	}
	public void addKillerHit(Entity killer, int hit) {
		if(!killers.containsKey(killer)) {
			killers.put(killer, hit);
		} else {
			killers.put(killer, killers.get(killer)+hit);
		}
	}
	public Object readResolve() {
		hits = new Hits();
		lastAnimation = null;
		lastGraphics = null;
		lastNpcSwitch = null;
		teleportTo = null;
		interactingWith = null;
		attacking = false;
		combatTurns = 0;
		sprite = new Sprite();
		dead = false;
		hidden = false;
		new HashMap<Entity, Integer>();
		isAggressor = false;
		return this;
	}
	@SuppressWarnings("unchecked")
	public Hashtable enemyHits = new Hashtable();
	public Player getPlayerToLoot() {
		return Misc.player(findBest());
	}
	public String findBest() {
		if (this instanceof NPC) {
			return "";
		}
		int bestHit = 0;
		String bestPlayer = "";
		if (enemyHits.size() > 0) {
			Enumeration e = enemyHits.keys();
			while (e.hasMoreElements()) {
				Object o = e.nextElement();
				int playerHit = Integer.parseInt(String.valueOf(enemyHits.get(o)));
				if (playerHit > bestHit) {
					bestHit = playerHit;
					bestPlayer = String.valueOf(o);
				}
			}
		}
		return Misc.formatPlayerNameForProtocol(bestPlayer);
	}
	public Entity getKiller() {
		return Misc.player(findBest());
	}
	public void clearKillersHits() {
		killers.clear();
	}	
	public boolean isAggressor() {
		return isAggressor;
	}
	
	public void setAggressor(boolean b) {
		isAggressor = b;
	}
	
	public Sprite getSprites() {
		return sprite;
	}
	public Hits getHits() {
		return hits;
	}
	
	public void teleport(Location location) {
		try {
		if(this instanceof Player) {
			Player p = (Player) this;
		p.getUpdateFlags().setDidTeleport(true);
		this.teleportTo = location;
		}
		if(this instanceof NPC) {
			NPC n = (NPC) this;
			this.location = location;
		n.getUpdateFlags().setDidTeleport(true);
		}
		} catch(Exception e) {
		}
	}
	
	public void resetTeleportTo() {
		try {
		this.teleportTo = null;
		} catch(Exception e) {
		}
	}
	
	public Location getTeleportTo() {
		return this.teleportTo;
	}
	
    public void setLocation(Location location) {
        this.location = location;
    }
	
	public Location getLocation() {
		return this.location;
	}
	
	public void setIndex(int index) {
		try {
		this.index = index;
		} catch(Exception e) {
		}
	}
	
	public int getIndex() {
		try {
		return this.index;
		} catch(Exception e) {
		return -1;
		}
	}
	public boolean SafeZone(){
	if ((getLocation().getX() >= 3264 && getLocation().getX() <= 3279 && getLocation().getY() >= 3672 && getLocation().getY() <= 3695))
			return true;
				else if ((getLocation().getX() >= 2940 && getLocation().getX() <= 3395 && getLocation().getY() >= 3524 && getLocation().getY() <= 4000) || (getLocation().getX() >= 3264 && getLocation().getX() <= 3279 && getLocation().getY() >= 3279 && getLocation().getY() <= 3672) || (getLocation().getX() >= 2756 && getLocation().getX() <= 2875 && getLocation().getY() >= 5512 && getLocation().getY() <= 5627))	
			return false;
				else
			return true;
	    }
	    public boolean multiZone() {
        return getLocation().getX() >= 2756 && getLocation().getX() <= 2875 && getLocation().getY() >= 5512 && getLocation().getY() <= 5627;
	    }
	  public boolean inClanWars() {
        return getLocation().getX() >= 2753 && getLocation().getX() <= 2879 && getLocation().getY() >= 5505 && getLocation().getY() <= 5632;
	    }
	public int getClientIndex() {
		try {
		if(this instanceof Player) {
			return this.index + 32768;
		} else {
			return this.index;
		}
		} catch(Exception e) {
		return -1;
		}
	}
	
	public abstract void heal(int amount);
	public abstract void hit(int damage);
	public abstract void hit(int damage, Hits.HitType type);
	public abstract void turnTo(Entity entity);
	public abstract void turnTemporarilyTo(Entity entity);
	public abstract void resetTurnTo();
	public abstract void npcswitch(int id);
	public abstract void graphics(int id);
	public abstract void graphics(int id, int delay);
	public abstract void animate(int id);
	public abstract void animate(int id, int delay);
	
	public Animation getLastAnimation() {
		return lastAnimation;
	}
	
	public void setLastAnimation(Animation lastAnimation) {
		try {
		this.lastAnimation = lastAnimation;
		} catch(Exception e) {
		}
	}
	public NpcSwitch getLastNpcSwitch() {
		return lastNpcSwitch;
	}
	
	public void setLastNpcSwitch(NpcSwitch LastNpcSwitch) {
		try {
		this.lastNpcSwitch = LastNpcSwitch;
		} catch(Exception e) {
		}
	}
	public Graphics getLastGraphics() {
		return lastGraphics;
	}
	
	public void setLastGraphics(Graphics lastGraphics) {
		try {
		this.lastGraphics = lastGraphics;
		} catch(Exception e) {
		}
	}
	
	public Entity getInteractingWith() {
		return interactingWith;
	}
	
	public boolean isInteracting() {
		return interactingWith != null;
	}
	
	public void setInteractingWith(Entity entity) {
		try {
		this.interactingWith = entity;
		} catch(Exception e) {
		}
	}
	
	public boolean isAttacking() {
		return this.attacking;
	}
	
	public void setAttacking(boolean b) {
		try {
		if(!b) {
			interactingWith = null;
			this.resetTurnTo();
			this.setAggressor(false);
		}
		this.attacking = b;
		} catch(Exception e) {
		}
	}
	
	public int getCombatTurns() {
		return combatTurns;
	}
	
	public void resetCombatTurns() {
		combatTurns = 0;
	}
	
	public void incrementCombatTurns() {
		combatTurns++;
	}
	
	public abstract int getAttackAnimation();
	public abstract int getAttackSpeed();
	public abstract int getDefenceAnimation();
	public abstract boolean isAnimating();
	public abstract int getDeathAnimation();

	public abstract boolean isDestroyed();

	public void setCombatTurns(int i) {
		combatTurns = i;
	}
	
	public void setDead(boolean b) {
		dead = b;
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public void setHidden(boolean b) {
		hidden = b;
	}
	
	public boolean isHidden() {
		return hidden;
	}

	public abstract int getMaxHp();
	public abstract int getHp();
	public abstract void setHp(int val);

	public abstract void dropLoot();
	public abstract void dropLoot2();
	
	public void setAttackStyle(int i) {
		this.attackStyle = i;
	}
	
	public int getAttackStyle() {
		return attackStyle;
	}
	public abstract int getMaxHit();
	public abstract CombatType getCombatType();
	public abstract int getDrawBackGraphics();
	public abstract int getProjectileId();
	public abstract boolean hasAmmo();

	
}
