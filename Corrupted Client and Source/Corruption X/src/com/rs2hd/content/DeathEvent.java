package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Entity;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.GameEngine;

/**
 * The death event handles player and npc deaths. Drops loot, does animation, teleportation, etc.
 * @author Graham
 *
 */
public class DeathEvent extends Event {
	private Entity entity;
	private boolean firstNpcStage = false;

	/**
	 * Creates the death event for the specified entity.
	 * @param entity The player or npc whose death has just happened.
	 */
	public DeathEvent(Entity entity) {
		super(3500);
		this.entity = entity;
		this.entity.resetTurnTo();
		this.entity.animate(entity.getDeathAnimation());
	}
	public void KqTransform(final Entity entity) {
		final NPC n = (NPC) entity;
		if (n.getId() == 1158) {
			n.setId(1161);
			n.graphics(1055);
		World.getInstance().registerEvent(new Event(6000) {
			public void execute() {
				n.setId(1160);
				entity.setHp(entity.getMaxHp());
				entity.setDead(false);
				this.stop();
			}
		});
		
		}
	}

	@Override
	public void execute() {
		if(entity instanceof NPC) {
			if(!firstNpcStage) {
				NPC n = (NPC) entity;
				if (n.getId() == 1158) { //kalphite queen transform
					entity.setDead(true);
					KqTransform(entity);
					n.resetAttack();
					this.stop();
				return;
				}
				if (n.getId() == 8127) { //dark core energy
					GameEngine.DarkCoreOn = false;
					n.delete(n);
				}
				if (n.isIsFamiliar()) {
					n.delete(n);
				}
				if (n.getId() == 8327 || n.getId() == 8326 || n.getId() == 8325) { //tormented demon
					n.setId(8324);	
				}
				if (n.getId() == 8350 || n.getId() == 8351) {  //tormented demon
					n.setId(8352);	
				}
				if (n.getId() == 1160) { //kalphite queen
					n.setId(1158);	
				}
				n.giveSlayer();
				entity.setHidden(true);
				entity.dropLoot();
				if (n.getId() != 8127 && !n.isIsFamiliar()) {
				this.setTick(n.getDefinition().getRespawn()*500);
				this.firstNpcStage = true;
				entity.clearKillersHits();
				n.teleport(n.getOriginalLocation());
				}else{
				this.stop();
				}
			} else {
				NPC n = (NPC) entity;
				if (n.getId() != 8127) {
				entity.setHp(entity.getMaxHp());
				n.setLocation(n.spawnlocation);
				entity.setHidden(false);
				entity.setDead(false);
				this.stop();
				}
			}
		} else if(entity instanceof Player) {
			if (entity.isDead() == false) {
				entity.teleport(Entity.DEFAULT_LOCATION);
				return;
			}
			entity.setHp(entity.getMaxHp());
			entity.setDead(false);
			

			if(entity.inClanWars())
				entity.teleport(Entity.CLAN_DEATH);
			else
			entity.teleport(Entity.DEFAULT_LOCATION);
			World.getInstance().registerEvent(new Event(500) {
				@Override
				public void execute() {
					Player p = (Player) entity;
						p.getActionSender().sendMessage("Oh Dear, you have died.");
						p.poisonTicks = 0;
						p.getActionSender().removeTab();
						p.ditch = 0;
						p.resetAttack();
						GameEngine.prayer.PrayerOff(p);
						p.getSkills().RestorePray(p.getSkills().getLevelForXp(5));
						p.specialAmount = 100;
						p.frozen = 0;
						p.isTeleBlocked = false;
						p.veng = false;
						p.vengTimer = 0;	
						p.deathCount += 1;
						p.dfs = 0;
						p.MiasmicDelay = 0;
						p.setDead(false);
					if(!p.getSettings().isHidingDeathInterface()) {
						p.getActionSender().sendInterface(153);
				}
					this.stop();
				}
			});
			this.stop();
		}
	}

}
