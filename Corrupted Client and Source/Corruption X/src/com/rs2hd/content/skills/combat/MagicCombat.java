package com.rs2hd.content.skills.combat;
import com.rs2hd.content.pvp.*;
import com.rs2hd.event.*;
import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.Entity;
import com.rs2hd.model.*;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
import com.rs2hd.Constants;

import com.rs2hd.util.Misc;


/**
 * @author Mystic 100%
 *
 */
public class MagicCombat {

	TeleBlock teleBlock = new TeleBlock();
	private Entity entity;
	private Player p;
	public void setPlayer(Player p) {
		try {
		this.p = p;
		} catch(Exception e) {
		}
	}
	private int projectile = -1;
	private int req;
	private int gfx2;
	private int damage;
	private int anim;
	private int gfx;
	private boolean tBed;
	private boolean entengle;
	private boolean usingAncient;
	private int magicIndex;
	boolean freeze = false;
	boolean barrage = false;
	int freezeDelay = 0;
	boolean usingbarrage = false;
    int wildLvl(Player p) {
	return (p.getLocation().getY() - 3520)/8+1;
    }

	private static boolean canAttack(Player p, Player p2) {
			int wildy = Math.min(Location.wildernessLevel(p.getLocation()), Location.wildernessLevel(p2.getLocation()));
			int levelDiff = Math.abs(p.getSkills().getCombatLevel() - p2.getSkills().getCombatLevel());
			if(wildy < levelDiff) {
				p.getActionSender().sendMessage("You need to move deeper into the wilderness to attack this player.");
				return false;
			} else if(p.isAggressor()) {
				if(p2.getInteractingWith() != p) {
					p.getHeadIcons().setSkulled(true);
					p.getUpdateFlags().setAppearanceUpdateRequired(true);
			}
		}
		return true;
	}
	public void handleMagic(int playerId, int interfaceId, int spellId) {
		if(p == null || p.isDead()) {
			return;
		}
		if(p.combatDelay > 0) {
			return;
		}
		magicIndex = playerId;
		final Player opp = World.getInstance().getPlayerList().get(playerId);
		if(!canAttack(p, opp)) {
			return;
		}
		p.combatDelay = 3;
		p.turnTemporarilyTo(opp);
		if (p.SafeZone()) {
			//Player.attacking = false;
			return;
		}
		if (opp.SafeZone()) {
			//Player.attacking = false;
			return;
		}
		if (p.combatWith != opp.getIndex() && p.combatWith != 0 && !p.multiZone()) {				
			p.getActionSender().sendMessage("You are already in combat.");	
			p.resetAttack();
			return;		
		}
		if (opp.combatWith != p.getIndex() && opp.combatWith != 0 && !p.multiZone()) {				
			p.getActionSender().sendMessage("That player is already in combat.");	
			p.resetAttack();
			return;			
		}
		if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), opp.getLocation().getX(), opp.getLocation().getY()) <= 8) {
			p.getWalkingQueue().reset();
		}
		//p.sm(""+spellId);
		int rand_att = Misc.random(p.getSkills().getLevelForXp(6))*4 + Misc.random(30);
		int rand_def = (int) (0.45 * Misc.random(opp.getSkills().getLevelForXp(1)));
		int random_u = Misc.random(p.getBonuses().getBonus(3)) * 2;
		int random_def = Misc.random(opp.getBonuses().getBonus(8));
		opp.combatResetWith  += PkDefinitions.getCombatDelay(p)+1;
		opp.combatWith  = p.getIndex();
		opp.giveDrop  = p.getIndex();
				p.getWalkingQueue().reset();
		if (p.getSkills().getLevelForXp(6) <= req) {
			p.getActionSender().sendMessage("You need level " + req+ " magic to use this spell.");
			return;
		}
		switch(interfaceId) {
		case 192:
			switch(spellId) {
			case 25://Wind strike
				gfx = 90;
				anim = 1162;
				projectile = 91;
				damage = 2;
				gfx2 = 92;
				req = 1;
				usingAncient = false;
				break;
			case 28: //Water strike
				gfx = 93;
				anim = 1162;
				projectile = 94;
				damage = 4;
				gfx2 = 95;
				req = 5;
				usingAncient = false;
				break;
			case 30: //Earth strike
				gfx = 96;
				anim = 1162;
				projectile = 97;
				damage = 6;
				gfx2 = 98;
				req = 9;
				usingAncient = false;
				break;
			case 32: //Fire strike
				gfx = 99;
				anim = 1162;
				projectile = 100;
				damage = 8;
				gfx2 = 101;
				req = 13;
				usingAncient = false;
				break;
			case 34: //Wind bolt
				gfx = 117;
				anim = 1162;
				projectile = 118;
				damage = 9;
				gfx2 = 119;
				req = 17;
				usingAncient = false;
				break;
			case 39: //Water bolt
				gfx = 120;
				anim = 1162;
				projectile = 121;
				damage = 10;
				gfx2 = 122;
				req = 23;
				usingAncient = false;
				break;
			case 42: //Earth bolt
				gfx = 123;
				anim = 1162;
				projectile = 124;
				damage = 11;
				gfx2 = 125;
				req = 29;
				usingAncient = false;
				break;
			case 45: //Fire bolt
				gfx = 126;
				anim = 1162;
				projectile = 127;
				damage = 12;
				gfx2 = 128;
				req = 35;
				usingAncient = false;
				break;
			case 49: //Wind blast
				gfx = 132;
				anim = 1162;
				projectile = 133;
				damage = 13;
				gfx2 = 134;
				req = 41;
				usingAncient = false;
				break;
			case 52: //Water blast
				gfx = 135;
				anim = 1162;
				projectile = 136;
				damage = 14;
				gfx2 = 137;
				req = 47;
				usingAncient = false;
				break;
			case 58: //Earth blast
				gfx = 138;
				anim = 1162;
				projectile = 139;
				damage = 15;
				gfx2 = 140;
				req = 53;
				usingAncient = false;
				break;
			case 63: //Fire blast
				gfx = 129;
				anim = 1162;
				projectile = 130;
				damage = 16;
				gfx2 = 131;
				req = 59;
				usingAncient = false;
				break;
			case 70: //Wind wave
				gfx = 158;
				anim = 1162;
				projectile = 159;
				damage = 17;
				gfx2 = 160;
				req = 62;
				usingAncient = false;
				break;
			case 73: //Water wave
				gfx = 161;
				anim = 1162;
				projectile = 162;
				damage = 18;
				gfx2 = 163;
				req = 65;
				usingAncient = false;
				break;
			case 77: //Earth Wave
				gfx = 164;
				anim = 1162;
				projectile = 165;
				damage = 19;
				gfx2 = 166;
				req = 70;
				usingAncient = false;
				break;
			case 80: //FireWave
				gfx = 155;
				anim = 1162;
				projectile = 156;
				damage = 20;
				gfx2 = 157;
				req = 75;
				usingAncient = false;
				break;	
			case 85: //TB
				if(!opp.isTeleBlocked) {
					gfx = 1841;
					anim = 10503;
					projectile = 1842;
					damage = 3;
					gfx2 = 1843;
					req = 85;
					p.graphics(1841, 16);
					usingAncient = false;
					tBed = true;
				} else {
					gfx = -1;
					anim = -1;
					projectile = -1;
					gfx2 = -1;
					damage = -1;
					req = -1;
					usingAncient = false;
					tBed = false;
					p.getActionSender().sendMessage("You're opponent is already teleblocked.");
					return;
				}
				break;

			case 81: //entengle
				if(opp.frozen <= 1) {
					gfx = 177;
					anim = 1161;
					projectile = 178;
					damage = 5;
					gfx2 = 181;
					req = 79;
					freeze = true;
					freezeDelay = 15;
					usingAncient = false;
					entengle = true;
				} else {
					gfx = -1;
					anim = -1;
					projectile = -1;
					gfx2 = -1;
					damage = -1;
					req = -1;
					entengle = false;
					usingAncient = false;
					p.getActionSender().sendMessage("You're opponent is already frozen.");
					return;
				}
				break;
			case 68: //zammy
			    if (p.getEquipment().get(3).getDefinition().getId() == 2417){
				gfx = -1;
				anim = 811;
				projectile = -1;
				damage = 30;
				gfx2 = 78;
				req = 60;
				usingAncient = false;
			   } else {
				gfx = -1;
				anim = -1;
				projectile = -1;
				gfx2 = -1;
				damage = -1;
				req = -1;
				usingAncient = false;
				p.getActionSender().sendMessage("You need a zammorak staff to cast this spell.");
				return;
			   }
				break;	
			case 66: //sara
 			   if (p.getEquipment().get(3).getDefinition().getId() == 2415){
				gfx = -1;
				anim = 811;
				projectile = -1;
				damage = 30;
				gfx2 = 77;
				req = 60;
				usingAncient = false;
			   } else {
				gfx = -1;
				anim = -1;
				projectile = -1;
				gfx2 = -1;
				damage = -1;
				req = -1;
				usingAncient = false;
				p.getActionSender().sendMessage("You need a saradomin staff to cast this spell.");
				return;
			   }
				break;	
			case 67: //guth
			   if (p.getEquipment().get(3).getDefinition().getId() == 2416){
				gfx = -1;
				anim = 811;
				projectile = -1;
				damage = 30;
				gfx2 = 76;
				req = 60;
				usingAncient = false;
			   } else {
				gfx = -1;
				anim = -1;
				projectile = -1;
				gfx2 = -1;
				damage = -1;
				req = -1;
				usingAncient = false;
				p.getActionSender().sendMessage("You need a guthix staff to cast this spell.");
				return;
			   }
				break;	
			}
			break;
		case 193:
			projectile = -1;
			gfx = -1;
			usingAncient = true;
			usingbarrage = false;
			switch (spellId) {
			case 23: //Ice barrage
				gfx = 368;
				anim = 1979;
				damage = 30;
				gfx2 = 369;
				req = 94;
				freeze = true;
				freezeDelay = 20;
				usingbarrage = true;
				break;	
			case 35: //Shadow barrage
				//gfx = 368;
				anim = 1978;
				damage = 28;
				gfx2 = 383;
				req = 88;
				break;
			case 31: //Smoke barrage
				//gfx = 368;
				anim = 1979;
				damage = 27;
				gfx2 = 391;
				req = 86;
				break;	
			case 21: //Ice blitz
				//gfx = 368;
				anim = 1978;
				damage = 26;
				gfx2 = 367;
				req = 82;
				freeze = true;
				freezeDelay = 15;
				usingbarrage = true;
				break;	
			case 25: //Blood Blitz
				//gfx = 368;
				anim = 1978;
				damage = 25;
				gfx2 = 375;
				req = 80;
				break;	
			case 33: //Shadow blitz
				//gfx = 368;
				anim = 1978;
				damage = 24;
				gfx2 = 381;
				req = 76;
				break;	
			case 29: //Smoke blitz
				//gfx = 368;
				anim = 1978;
				damage = 23;
				gfx2 = 387;
				req = 74;
				break;	
			case 22: //Ice burst
				// gfx = 368;
				anim = 1979;
				damage = 22;
				gfx2 = 363;
				req = 70;
				usingbarrage = true;
				freeze = true;
				freezeDelay = 10;
				break;	
			case 26: //Blood Burst
				// gfx = 368;
				anim = 1979;
				damage = 21;
				gfx2 = 376;
				req = 68;
				break;
			case 34: //Shadow Burst
				//gfx = 368;
				anim = 1978;
				damage = 17;
				gfx2 = 382;
				req = 64;
				break;	
			case 30: //Smoke Burst
				//gfx = 368;
				anim = 1979;
				damage = 17;
				gfx2 = 389;
				req = 62;
				break;	
			case 20: //Ice rush
				//gfx = 368;
				anim = 1978;
				usingbarrage = true;
				damage = 16;
				gfx2 = 361;
				req = 58;
				freeze = true;
				freezeDelay = 5;
				break;	
			case 24: //Blood Rush
				//gfx = 368;
				anim = 1978;
				damage = 15;
				gfx2 = 361;
				req = 56;
				break;	
			case 32: //Shadow Rush
				//gfx = 368;
				anim = 1978;
				damage = 14;
				gfx2 = 379;
				req = 52;
				break;
			case 28: //Smoke Rush
				// gfx = 368;
				anim = 1978;
				damage = 13;
				gfx2 = 385;
				req = 50;
				break;	
			}
			break;
		}
		p.getWalkingQueue().reset();
		if ((random_u >= random_def) && (rand_att > rand_def)) {
			p.animate(anim);
			if (barrage) {	
				p.graphics(gfx);
			} else { 
				p.graphics(gfx, (100 << 16));
			}
			p.getWalkingQueue().reset();
			World.getInstance().getProjectileManager().fire(p.getLocation(), opp.getLocation(),  50, 100, getProjectile(), 46, 31, opp);
			World.getInstance().registerEvent(new Event(getMagicDelay()) {
				
				@Override
				public void execute() {
					int finalDamage = Misc.random(damage);
					opp.hit(finalDamage);
					if (!usingAncient) {
						if(entengle) {	
							opp.frozen = freezeDelay;
							opp.getWalkingQueue().reset();
							opp.graphics(gfx2, 100);

						} else if(tBed) {
							opp.isTeleBlocked = true;
							opp.sm("You have been teleblocked.");
							opp.graphics(gfx2, 16);
							World.getInstance().registerEvent(new Event(180000) {
								@Override
								public void execute() {
									opp.isTeleBlocked = false;
									p.isTeleBlocked = false;
									reset();
									this.stop();
								}
							});
						} else {
							opp.graphics(gfx2, (100 << 16));
						}
					} else {
						if (freeze) {
							if (opp.frozen == 0) {
								opp.frozen = freezeDelay;
								opp.graphics(369);
								opp.getWalkingQueue().reset();
								for(Player p3 : World.getInstance().getPlayerList()) {
								if(p3 != p && p3 != opp && (p3.getLocation().getX() == opp.getLocation().getX()+1 || p3.getLocation().getX() == opp.getLocation().getX()-1 || p3.getLocation().getY() == opp.getLocation().getY()+1 || p3.getLocation().getY() == opp.getLocation().getY()-1)) {
								if(p.multiZone() && !p3.SafeZone()) {
								p3.frozen = freezeDelay;
								p3.hit(Misc.random(damage));
								p3.graphics(369);
								p3.getWalkingQueue().reset();
								}
								}
								}
							} else {
								opp.graphics(1677, (100 << 16));
								reset();
								this.stop();
								return;
							}
						}
						opp.graphics(gfx2);
					}
					reset();
					this.stop();
				}
			});
		} else {
			p.animate(anim);
			if (barrage) {	
				p.graphics(gfx);
			p.animate(anim);
			} else { 
				p.graphics(gfx, (100 << 16));
			p.animate(anim);
			}
			p.getWalkingQueue().reset();
			p.animate(anim);
			World.getInstance().getProjectileManager().fire(p.getLocation(), opp.getLocation(),  50, 100, getProjectile(), 46, 31, opp);
			World.getInstance().registerEvent(new Event(getMagicDelay()) {
				
				@Override
				public void execute() {
					int finalDamage = Misc.random(damage);
					//opp.updateHit(p, finalDamage);
					//opp.hit(finalDamage);
			p.getWalkingQueue().reset();
			p.animate(anim);
						opp.graphics(85,  (100 << 16));
					reset();
					this.stop();
				}
			});

		}
	}
	public void reset() {
		gfx = -1;
		anim = -1;
		projectile = -1;
		gfx2 = -1;
		damage = -1;
		req = -1;
	}
	public int getProjectile() {
		return projectile;
	}
	public int getMagicDelay() {
		Player p2 = World.getInstance().getPlayerList().get(magicIndex);
		if (p == null || p2 == null)
			return 1600;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 1)
			return 955;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 2)
			return 1055;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 3)
			return 1200;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 4)
			return 1450;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 5)
			return 1550;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 6)
			return 1650;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 7)
			return 1750;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 8)
			return 1750;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 9)
			return 1845;
		if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 10)
			return 1845;
		return 1;
	}

}