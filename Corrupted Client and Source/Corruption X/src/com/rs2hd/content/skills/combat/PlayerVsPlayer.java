package com.rs2hd.content.skills.combat;


import com.rs2hd.event.*;
import com.rs2hd.model.*;
import com.rs2hd.GameEngine;
import com.rs2hd.util.Misc;

public class PlayerVsPlayer {

	private transient Player p;
	int projectile = -1;
	int req;
	int gfx2;
	int damage;
	int anim;
	int gfx;
	int freezeDelay = 0;
	int timer;	
	int magicIndex;
	boolean usingAncient;
	boolean freeze = false;
	boolean barrage = false;
	
	public void setPlayer(Player p) {
			this.p = p;
	}
	public void tick() {
		if(timer > 0) {
			timer--;
		}
	}

	public int calculateHit(Player player, Player opponent, int damage) {
        	double attack = player.getSkills().getLevel(0);
        	double defence = opponent.getSkills().getLevel(1);
		int base = damage;
		if(opponent.THICKSKIN)
			defence = defence * 1.05;
		if(opponent.ROCKSKIN)
			defence = defence * 1.1;
		if(opponent.STEELSKIN) 
			defence = defence * 1.15;
		if(opponent.CHILVALRY) 
			defence = defence * 1.2;
		if(opponent.PIETY) 
			defence = defence * 1.25;
		if(player.CLARITYOFTHOUGHT) 
			attack = attack * 1.05;
		if(player.IMPROVEDREFLEXES) 
			attack = attack * 1.1;
		if(player.INCREDIBLEREFLEXES) 
			attack = attack * 1.15;
		if(player.CHILVALRY) 
			attack = attack * 1.15;
		if(player.PIETY) 
			attack = attack * 1.2;
		double dbonus = opponent.getBonuses().getBonus(6);
        	int attackBonus = player.getBonuses().getBonus(1);
        	int defenceBonus = (int) dbonus;
        	int lvl = (int) (defence - Misc.random((int) attack));
    		int bonus =  defenceBonus - attackBonus;
    		if(bonus < 0) 
			bonus = 0;
    		bonus += lvl;
		int d = Misc.random(lvl);
		if(d <= 0) 
			d = 1;
    		bonus = bonus/d;
    		damage -= bonus;
		if(damage < 0) 
			damage = 0;
		if(damage > base) 
			damage = base;
		return damage;
	}	
	
	public int calculateHitRange(Player player, Player opponent, int damage) {
        	double attack = player.getSkills().getLevel(4);
        	double defence = opponent.getSkills().getLevel(1);
		int base = damage;
		if(opponent.THICKSKIN)
			defence = defence * 1.05;
		if(opponent.ROCKSKIN)
			defence = defence * 1.1;
		if(opponent.STEELSKIN) 
			defence = defence * 1.15;
		if(opponent.CHILVALRY) 
			defence = defence * 1.2;
		if(opponent.PIETY) 
			defence = defence * 1.25;
		if(player.CLARITYOFTHOUGHT) 
			attack = attack * 1.05;
		if(player.IMPROVEDREFLEXES) 
			attack = attack * 1.1;
		if(player.INCREDIBLEREFLEXES) 
			attack = attack * 1.15;
		double dbonus = opponent.getBonuses().getBonus(11);
        	int attackBonus = player.getBonuses().getBonus(5);
        	int defenceBonus = (int) dbonus;
        	int lvl = (int) (defence - Misc.random((int) attack));
    		int bonus =  defenceBonus - attackBonus;
    		if(bonus < 0) 
			bonus = 0;
    		bonus += lvl;
		int d = Misc.random(lvl);
		if(d <= 0) 
			d = 1;
    		bonus = bonus/d;
    		damage -= bonus;
		if(damage < 0) 
			damage = 0;
		if(damage > base) 
			damage = base;
		return damage;
	}	
	
	private static boolean canAttack(Player p, Player p2) {
		int wildy = Math.min(Location.wildernessLevel(p.getLocation()), Location.wildernessLevel(p2.getLocation()));
		int levelDiff = Math.abs(p.getSkills().getCombatLevel() - p2.getSkills().getCombatLevel());
		  if(wildy < levelDiff && !p.clanWarsGame()) { 
			p.getActionSender().sendMessage("The difference between your Combat Level and the Combat Level of your opponent is");
                        p.getActionSender().sendMessage("too great.");
                        p.getActionSender().sendMessage("You need to move deeper into the wilderness to attack that target.");
			return false;
		} else if(p.isAggressor()) {
			if(p2.getInteractingWith() != p) {
				p.getHeadIcons().setSkulled(true);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
			}
		}
		return true;
	}
	
	public void Attack(Player p2) {
		try {
			if(p == null || p2 == null || !canAttack(p, p2)) {
				return;
			}
			if (p.combatWith != p2.getIndex() && p.combatWith != 0 && !p.multiZone()) {				
				p.getActionSender().sendMessage("You are already in combat.");	
				p.resetAttack();
				return;		
			}
			if (p2.combatWith != p.getIndex() && p2.combatWith != 0 && !p.multiZone()) {				
				p.getActionSender().sendMessage("That player is already in combat.");	
				p.resetAttack();
				return;			
			}
			if(p.isDead() || p2.isDestroyed() || p2.isDead()) {
				p.resetAttack();
				return;
			}
			if(p.Attacking == false) {
				p.resetAttack();
				return;
			}
			if(p2.SafeZone() == true) {
			p.getActionSender().sendMessage("This player must be in a PvP area to be attacked.");
				p.resetAttack();
				return;
			}
			if(p.SafeZone() == true) {
			p.getActionSender().sendMessage("Please move to a PvP area to attack.");
				p.resetAttack();
				return;
			}
			if(p.pvn().autoCasting == true) {
				MagicAttack(p, p2);
			} else if (usingRange(p)) {
				RangeAttack(p, p2);
			} else {
				MeleeAttack(p, p2);
			}
			if(p2.isAutoRetaliating() && p2.Attacking == false && p2.AttackingNpc == false) {
			p2.id = p.getIndex();
			p2.turnTo(p2);
			p2.Attacking = true;
			}
		} catch(Exception e) {
		}
	}
	
	public boolean RecoilRingEquipped(Player p2) {
		try {
			if(p2.getEquipment().get(12).getDefinition().getId() == 2550) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean divineEquipped(Player p2) {
		try {
			if(p2.getEquipment().get(5).getDefinition().getId() == 13740) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;
		}
	}
	public boolean elysianEquipped(Player p2) {
		try {
			if(p2.getEquipment().get(5).getDefinition().getId() == 13742) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean FullDharokEquipped() {
		try {
			if(p.getEquipment().get(0).getDefinition().getId() == 4716 && p.getEquipment().get(4).getDefinition().getId() == 4720 && p.getEquipment().get(7).getDefinition().getId() == 4722 && p.getEquipment().get(3).getDefinition().getId() == 4718) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;	
		}			
	}

	public boolean dbowArrow() {
		try {
			if(p.getEquipment().get(13).getDefinition().getId() == 11212) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;	
		}			
	}
	
	public boolean vestaLongSwordEquipped(Player p) {
		try {
			if(p.getEquipment().get(3).getDefinition().getId() == 13899) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;	
		}			
	}
	public boolean armadylGodswordEquipped(Player p) {
		try {
			if(p.getEquipment().get(3).getDefinition().getId() == 11694) {
				return true;
            }
			return false;	
		} catch (Exception e) {
			return false;	
		}			
	}
	
	
	public void RangeAttack(final Player p, final Player p2) {
		try {
			final int rangeHit = calculateHitRange(p, p2, (Misc.random(getMaxHit(p))));
			final int rangeHitDbow = Misc.random(getMaxHit(p) * 1.10);
			final int rangeHitCannon = calculateHitRange(p, p2, (Misc.random(getMaxHit(p) * 1.25)));
			final int distance = Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY());
			if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) <= 8) {
				p.getWalkingQueue().reset();
			}
			if (p.combatWith != p2.getIndex() && p.combatWith != 0 && !p.multiZone()) {				
				p.getActionSender().sendMessage("You are already in combat.");	
				p.resetAttack();
				return;		
			}
			if (p2.combatWith != p.getIndex() && p2.combatWith != 0 && !p.multiZone()) {				
				p.getActionSender().sendMessage("That player is already in combat.");	
				p.resetAttack();
				return;			
			}
			if(p.combatDelay == 0 && p.cantPk == false) {
				if(!p.getEquipment().hasAmmo()) {
					p.sm("You dont have any ammo in your backpack.");
					return;
				}
				p2.combatResetWith  += PkDefinitions.getCombatDelay(p)+1;
				GameEngine.poison.checkForPoison(p, p2);
				p2.combatWith  = p.getIndex();
				p2.giveDrop  = p.getIndex();
				p.combatDelay += PkDefinitions.getCombatDelay(p);
				if(p.getEquipment().isWieldingHandCannon()) {
					if(p.usingSpecial) {
						p.usingSpecial = false;
						p.specialAmount -= p.getSpecialAmount();
						if (p.specialAmount < p.getSpecialAmount()) {
							p.usingSpecial = false;
							p.getActionSender().sendMessage("You do not have enough special energy.");
							return;
						}
						p.usingSpecial = false;
						p.specialAmount -= p.getSpecialAmount();
                        			p.animate(12174, 0);
						p.graphics(2138, 0);
						World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 2143, 43, 31, p2);						
							World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {
								p2.hit(Misc.random(rangeHitCannon * 1.10));
								this.stop();
							}
						});
					} else {
                       				 p.animate(PkDefinitions.getCombatAnim(p));
						p.graphics(2138, 0);
						World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 2143, 43, 31, p2);
						World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {

							if (elysianEquipped(p2)) {
								if(Misc.random(3) == 3) {
									p2.hit(Misc.random(rangeHitCannon)/2);
									p2.getActionSender().sendMessage("Your Elysian Spirit Shield removed a part of your opponent hit.");
									this.stop();
								}
							} else if (divineEquipped(p2)) {
								if(Misc.random(3) == 3) {
									int prayDrain = Misc.random(20);
									p2.hit(0);
									p2.getActionSender().sendMessage("Your Divine Spirit shield took the hit and decreased some of your prayer.");
									p2.getSkills().hitPray(prayDrain);
									this.stop();
								}
							} else {
									p2.hit(Misc.random(rangeHitCannon));
									p2.animate(p2.getEquipment().getDefenceAnimation());
									this.stop();
								}
							}
						});
					}
				} else if(p.getEquipment().isUsingChins()) {
					for (Player p3 : World.getInstance().getPlayerList()) {
						if(Misc.getDistance(p2.getLocation().getX(), p2.getLocation().getY(), p3.getLocation().getX(), p3.getLocation().getY()) <= 3) {
							p2.hit(Misc.random(rangeHit));
							p2.hit(Misc.random(rangeHit));
						}
					}
				} else if(p.getEquipment().isWieldingDbow()) {
					if(p.usingSpecial) {
						if (p.specialAmount < p.getSpecialAmount()) {
							p.usingSpecial = false;
							p.getActionSender().sendMessage("You do not have enough special energy.");
							return;
						}
						p.usingSpecial = false;
						p.specialAmount -= p.getSpecialAmount();
						p.animate(PkDefinitions.getCombatAnim(p));
						p.graphics(getDbowDrawback(), (100 << 16));
						World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, getDbowSpec(), 43, 31, p2);
						World.getInstance().registerEvent(new Event(100) {
							public void execute() {
								World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, getDbowSpec(), 43, 31, p2);
								this.stop();
							}
						});
						World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {
								p2.hit(Misc.random(rangeHitDbow * 1.10));
								this.stop();
							}
						});
						World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {
								p2.hit(Misc.random(rangeHitDbow * 1.10));
								p2.animate(p2.getEquipment().getDefenceAnimation());
								this.stop();
							}
						});
					} else {
                        			p.animate(PkDefinitions.getCombatAnim(p));
						p.graphics(getDbowDrawback(), (100 << 16));
						World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);
						World.getInstance().registerEvent(new Event(100) {
							public void execute() {
								World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);
								this.stop();
							}
						});
						World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {
								p2.hit(Misc.random(rangeHit));
								p2.animate(p2.getEquipment().getDefenceAnimation());
								this.stop();
							}
						});
						World.getInstance().registerEvent(new Event(getMagicDelay()) {
							public void execute() {
								p2.hit(Misc.random(rangeHit));
								this.stop();
							}
						});
					}
				} else if(p.getEquipment().isWieldingCBow()) {
					p.animate(PkDefinitions.getCombatAnim(p));
					World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);
					World.getInstance().registerEvent(new Event(getMagicDelay()) {
						public void execute() {
							if (elysianEquipped(p2)) {
								if(Misc.random(3) == 3) {
									p2.hit(Misc.random(rangeHit)/2);
									p2.getActionSender().sendMessage("Your Elysian Spirit Shield removed a part of your opponent hit.");
									this.stop();
								}
							} else if (divineEquipped(p2)) {
								if(Misc.random(3) == 3) {
									int prayDrain = Misc.random(20);
									p2.hit(0);
									p2.getActionSender().sendMessage("Your Divine Spirit shield took the hit and decreased some of your prayer.");
									p2.getSkills().hitPray(prayDrain);
									this.stop();
								}
							} else if(Misc.random(10) == 1) {
								EnchantSpec(p, p2, rangeHit);
								p2.animate(p2.getEquipment().getDefenceAnimation());
								this.stop();
							} else {
								p2.hit(rangeHit);
								p2.animate(p2.getEquipment().getDefenceAnimation());
								this.stop();
							}
							
						}
					});
				}  else if(p.usingSpecial) {
						p.usingSpecial = false;
						p.specialAmount -= p.getSpecialAmount();
						if (p.specialAmount < p.getSpecialAmount()) {
							p.usingSpecial = false;
							p.getActionSender().sendMessage("You do not have enough special energy.");
							return;
						}
						p.usingSpecial = false;
						p.specialAmount -= p.getSpecialAmount();
					switch(p.getEquipment().get(3).getDefinition().getId()) {
								case 13883:
									p.graphics(1838, 0);
									p.animate(10504, 0);
						p.turnTo(p2);
					p2.sm("The thrownaxe degrades your run energy.");
					p2.setRunEnergy(p.getRunEnergy()-13);
									p2.hit(Misc.random(51));
									break;
								case 11235:
								if (dbowArrow()) {
									p.animate(426, 0);
p2.hit(Misc.random(p.MaxHitRange()));
p2.hit(Misc.random(p.MaxHitRange()));
World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 1099, 43, 31, p2);
World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 1099, 43, 31, p2);												
					} else {
									p.animate(426, 0);
p2.hit(Misc.random(p.MaxHitRange()-8));
p2.hit(Misc.random(p.MaxHitRange()-6));
World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 1102, 43, 31, p2);
World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, 1102, 43, 31, p2);
}
}
				} else {
					if(p.getEquipment().get(3).getDefinition().getId() == 15241) {
						p.sm("You need to be wearing handcannon ammo to fire this weapon.");
						return;
					}
					p.animate(PkDefinitions.getCombatAnim(p));
					World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);			
					World.getInstance().registerEvent(new Event(getMagicDelay()) {
						public void execute() {
							if (elysianEquipped(p2)) {
								if(Misc.random(3) == 3) {
									p2.hit(Misc.random(rangeHit)/2);
									p2.getActionSender().sendMessage("Your Elysian Spirit Shield removed a part of your opponent hit.");
									this.stop();
								}
							} else if (divineEquipped(p2)) {
								if(Misc.random(3) == 3) {
									int prayDrain = Misc.random(20);
									p2.hit(0);
									p2.getActionSender().sendMessage("Your Divine Spirit shield took the hit and decreased some of your prayer.");
									p2.getSkills().hitPray(prayDrain);
									this.stop();
								}
							}  else {
								p2.hit(Misc.random(rangeHit));
								this.stop();
							}
						}
					});
				}
			}
		} catch(Exception e) {
		}
	}
	
	public void EnchantSpec(Player p, Player p2, int rangeDamage) {
		try {
			switch(p.getEquipment().get(13).getDefinition().getId()) {
				case 9242:
					rangeDamage = rangeDamage + Misc.random(p2.getHp()/5);
					if (rangeDamage >= 149)
						rangeDamage = 149;
					p.hit(Misc.random(p.getHp())/10);
					p2.graphics(754);
					p.getActionSender().SendSound(2912,100,0);
					p2.getActionSender().SendSound(2912,100,0);
					break;
				case 9244:
					int FireDamage = Misc.random(23);
					if (p2.getEquipment().get(3).getDefinition().getId() == 11283 ||p2.getEquipment().get(3).getDefinition().getId() == 1540)
						FireDamage = Misc.random(10);
					rangeDamage = rangeDamage + FireDamage;
					p2.graphics(756);
					p.getActionSender().SendSound(2915,100,0);
					p2.getActionSender().SendSound(2915,100,0);
					break;
				case 9245:
					rangeDamage = Misc.random((int) (rangeDamage * 1.25));
					p.heal(rangeDamage);
					p2.graphics(753);
					p.getActionSender().SendSound(2917,100,0);
					p2.getActionSender().SendSound(2917,100,0);
					break;
				case 9237:
					p2.id = -1;
					p2.Attacking = false;
					p2.graphics(755);
					p.getActionSender().SendSound(2914,100,0);
					p2.getActionSender().SendSound(2914,100,0);
					break;
			}
			p2.hit(rangeDamage);
		} catch(Exception e) {
		}
	}
	
	

	public void MeleeAttack(final Player p, final Player p2) {
		try {
			if (p.frozen == 0) {
				if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) != 1) 
					p.WalkTo().GoToPlayer(p, p2.getIndex());
			}
			if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) < 2) {
				if(p.combatDelay == 0 && p.cantPk == false) {
					int meleeDamage = calculateHit(p, p2, (Misc.random(getMaxHit(p))));
					final int meleeDamage2 = calculateHit(p, p2, (Misc.random(getMaxHit(p))));
					int meleeDamage3 = Misc.random(p.MaxHitMelee());
					final int DDScmeleeDamage = calculateHit(p, p2, (Misc.random(getMaxHit(p)*1.10)));
					final int DDScmeleeDamage2 = calculateHit(p, p2, (Misc.random(getMaxHit(p)*1.10)));
					p2.combatResetWith  += PkDefinitions.getCombatDelay(p)+1;
					GameEngine.poison.checkForPoison(p, p2);
					p.IsFollowing = false;
					p.FollowingId = -1;
					p2.combatWith  = p.getIndex();
					p2.giveDrop  = p.getIndex();
					p.combatDelay += PkDefinitions.getCombatDelay(p);
					
					
					if (p2.veng == true) {
						int vengDamage = ((meleeDamage/4)*3);
						if (vengDamage != 0) {
							p2.setLastChatMessage(new ChatMessage(0, 16, "Taste Vengeance!"));
							p2.getUpdateFlags().setChatTextUpdateRequired(true);
							p.hit(vengDamage);
							p2.veng = false;
						}
					}
					if (RecoilRingEquipped(p2)) {
						p.hit(meleeDamage/11+1);
						p2.RecoilRing -= 1;
						if (p2.RecoilRing == 0) {
							p2.RecoilRing = 100;
							p2.getEquipment().deleteItem(2550,1);
							p2.getEquipment().refresh();
							p2.sm("Your ring disapeared.");
						}
					}
					if (elysianEquipped(p2)) {
						if(Misc.random(3) == 3) {
							meleeDamage = calculateHit(p, p2, (Misc.random(getMaxHit(p)))) / 2;
							p2.getActionSender().sendMessage("Your Elysian Spirit Shield removed a part of your opponent hit.");
						}
					} 
					if (divineEquipped(p2)) {
						if(Misc.random(3) == 3) {
							int prayDrain = Misc.random(20);
							meleeDamage = 0;
							p2.getActionSender().sendMessage("Your Divine Spirit shield took the hit and decreased some of your prayer.");
							p2.getSkills().hitPray(prayDrain);
						}
					} 
					if(!p.usingSpecial) {
						p.getActionSender().SendSound(SoundID(p),100,0);
						p2.getActionSender().SendSound(SoundID(p),100,0);
						p2.hit(meleeDamage);
						p2.animate(p.getEquipment().getDefenceAnimation());
						p.turnTo(p2);
						p.animate(PkDefinitions.getCombatAnim(p));
					} else {
						p.usingSpecial = false;
						if (p.specialAmount >= p.getSpecialAmount()) {
							p.specialAmount -= p.getSpecialAmount();
							switch(p.getEquipment().get(3).getDefinition().getId()) {
								case 4151:
									p2.graphics(341, 0);
									p.animate(1658, 0);
									p2.hit(meleeDamage);
									break;
								case 5698:
                                                                case 1215:
									p.graphics(252, (100 << 16));
									p.animate(1062, 0);
									p.getActionSender().SendSound(2537,100,0);
									p2.getActionSender().SendSound(2537,100,0);
									p2.hit((int) (DDScmeleeDamage * 1.10));
									p2.hit((int) (DDScmeleeDamage2 * 1.10));
									break;
								case 11730:
									p.graphics(1224, 0);
									p2.graphics(1194, 0);
									p.animate(7072, 0);
									p2.hit(meleeDamage);
									World.getInstance().registerEvent(new Event(400) {
										public void execute() {
											if (p2 == null || p == null) {
												this.stop();
												return;
											}
											if (!World.getInstance().isOnline(p.getUsername()) || !World.getInstance().isOnline(p2.getUsername())) {
												this.stop();
												return;
											}
											p2.hit(meleeDamage2);
											this.stop();
										}
									});
									p.getActionSender().SendSound(3853,100,0);
									p2.getActionSender().SendSound(3853,100,0);
									break;
		case 10887:
									p.graphics(1027);
									p.animate(5870);
									p2.hit(Misc.random(63));
									break;	
								case 11694:
									p.graphics(1222, 0);
									p.animate(7074, 0);
									final int AGSmeleeDamage = Misc.random((Misc.random(getMaxHit(p))*1.43));
									p2.hit((int) (AGSmeleeDamage * 1.43));
									p.getActionSender().SendSound(3865,100,0);
									p2.getActionSender().SendSound(3865,100,0);
									break;
								case 15259:
									p2.hit(meleeDamage);
									p.animate(12031);
									p.graphics(2144);
									break;
								case 11696:
									p.graphics(1223, 0);
									p.animate(7073, 0);
									final int BGSmeleeDamage = Misc.random(calculateHit(p, p2, (Misc.random(getMaxHit(p))))*1.10);
									p2.hit((int) (BGSmeleeDamage * 1.10));
									p.getActionSender().SendSound(3834,100,0);
									p2.getActionSender().SendSound(3834,100,0);
									break;
								case 11698:
									p.graphics(1220, 0);
									p.animate(7071, 0);
									p2.hit(meleeDamage);
									p.getActionSender().SendSound(3857,100,0);
									p2.getActionSender().SendSound(3857,100,0);
									break;
								case 11700:
									p.graphics(2110, 0);
									p.animate(7070, 0);
									p2.graphics(2111, 0);
									p2.hit(meleeDamage);
									p.getActionSender().SendSound(3857,100,0);
									p2.getActionSender().SendSound(3857,100,0);
									break;
								case 1305:
									p.graphics(2117, 0);
									p.animate(12031, 0);
									final int DLONGmeleeDamage = Misc.random(calculateHit(p, p2, (Misc.random(getMaxHit(p))))*1.20);
									p2.hit((int) (DLONGmeleeDamage * 1.20));
									p.getActionSender().SendSound(2529,100,0);
									p2.getActionSender().SendSound(2529,100,0);
									break;
								case 4587:
									p.graphics(2118, 0);
									p.animate(12005, 0);
									p2.hit(meleeDamage);
									p.getActionSender().SendSound(2540,100,0);
									p2.getActionSender().SendSound(2540,100,0);
									break;
								case 3204:
									p.graphics(282, 0);
									p2.graphics(254, 0);
									p.animate(1665, 0);
									p2.hit(meleeDamage);
									World.getInstance().registerEvent(new Event(400) {
										public void execute() {
										if (p2 == null || p == null) {
											this.stop();
											return;
										}
										if (!World.getInstance().isOnline(p.getUsername()) || !World.getInstance().isOnline(p2.getUsername())) {
											this.stop();
											return;
										}
										p2.hit(meleeDamage2);
										this.stop();
										}
									});
									break;
								case 1434:
									p.graphics(251, 50);
									p.animate(1060, 0);
									final int DMACEmeleeDamage = Misc.random(calculateHit(p, p2, (Misc.random(getMaxHit(p)))) * 1.25);
									p2.hit((int) (DMACEmeleeDamage * 1.25));
									p.getActionSender().SendSound(2541,100,0);
									p2.getActionSender().SendSound(2541,100,0);
									break;
								case 7158:
									p.graphics(559, 0);
									p.animate(3157, 0);
									p2.hit(meleeDamage);
									break;
								case 13902:
									p.graphics(1840, 0);
									p.animate(10505, 0);
									final int STATIUSmeleeDamage = Misc.random((Misc.random(getMaxHit(p))*1.30));
									p2.hit((int) (STATIUSmeleeDamage * 1.30));
									break;
								case 14484:
									p.graphics(1950, 0);
									p.animate(10961, 0);
									int dclaw1 = meleeDamage3/2;
									int dclaw2 = dclaw1/2;
									p2.hit(meleeDamage3);
									p2.hit(dclaw1);
									p2.hit(dclaw2);
									p2.hit(dclaw2);
									break;
								case 13905:
									p.animate(10499, 0);
									p.graphics(1835, 0);
									final int VESTASPEARmeleeDamage = Misc.random(calculateHit(p, p2, (Misc.random(getMaxHit(p)))) * 1.10);
									p2.hit((int) (VESTASPEARmeleeDamage * 1.10));
									break;
								case 13899:
									final int VESTASWORDmeleeDamage = Misc.random(Misc.random(getMaxHit(p)) * 1.35);
									p.animate(10502, 0);
									p2.hit((int) (VESTASWORDmeleeDamage * 1.35));
									break;
								case 4153:
									p2.hit(meleeDamage2);
									p.animate(1667);
									p.getActionSender().SendSound(2715, 1, 25);
									p2.getActionSender().SendSound(2715, 1, 25);
									World.getInstance().registerEvent(new Event(400) {
										public void execute() {
									p.animate(1667);
									p2.hit(meleeDamage2);
									p.getActionSender().SendSound(2715, 1, 25);
									p2.getActionSender().SendSound(2715, 1, 25);
										this.stop();
										}
									});
									break;
								default:
									p2.hit(meleeDamage);				
									p.animate(PkDefinitions.getCombatAnim(p));
									p.getActionSender().sendMessage("This weapon has no special Attack, if you still see special bar please relogin.");
									break;
							}
						} else {
							p.getActionSender().sendMessage("You need to wait til your spec bar gets ready.");}
						}
					}
				}
			} catch(Exception e) {
		}
	}


public void MagicAttack(final Player p, final Player p2) {
		try {

		int rand_att = Misc.random(p.getSkills().getLevelForXp(6))*4;
		int rand_def = (int) (0.45 * Misc.random(p2.getSkills().getLevelForXp(1)));
		int random_u = Misc.random(p.getBonuses().getBonus(3)) * 2;
		int random_def = Misc.random(p2.getBonuses().getBonus(8));

		if(p.pvn().autoCasting == true) {
		switch(p.magicType) {
			case 192:			
			switch(p.pvn().autoCast) {
			case 25://Wind strike
				gfx = 90;
				anim = 1162;
				projectile = 91;
				damage = 2;
				gfx2 = 92;
				req = 0;
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
			case 68: //zammy
			    if (p.getEquipment().get(3).getDefinition().getId() == 2417) {
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
				p.getActionSender().sendMessage("You need a zammorak staff to cast this spell.");
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
				p.getActionSender().sendMessage("You need a zammorak staff to cast this spell.");
				return;
			   }
				break;	
			}
			break;
		case 193:
			projectile = -1;
			gfx = -1;
			usingAncient = true;
			switch (p.pvn().autoCastAncient) {
			case 23: //Ice barrage
				gfx = 368;
				anim = 1979;
				damage = 30;
				gfx2 = 369;
				req = 94;
				freeze = true;
				freezeDelay = 20;
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
		}
		if ( p.getSkills().getLevelForXp(6) <= req) {
			p.sm("You need level " + req+ " magic to use this spell.");
		} 
else if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) <= 8) {
		if(p.combatDelay == 0) {

		if ((random_u >= random_def) && (rand_att > rand_def)) {
			
			p2.combatResetWith  += PkDefinitions.getCombatDelay(p)+1;
			p2.combatWith  = p.getIndex();
			p.giveDrop = p2.getIndex();
			p.turnTo(p2);
			p.animate(anim);
			if (barrage) {	
				p.graphics(gfx, 100);
			} else { 
				p.graphics(gfx, (100 << 16));
			}
			p.combatDelay =+ 5;
			p.getWalkingQueue().reset();
			World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, projectile, 43, 31, p2);
			World.getInstance().registerEvent(new Event(getMagicDelay()) {
				public void execute() {
				final int magichit = Misc.random(damage);
				p2.hit(Misc.random(magichit));
				p.getSkills().addXp(6, magichit * 1200);
					if (!usingAncient) {
						p2.graphics(gfx2,  (100 << 16));
					} else {
						if (freeze) {
							if (p2.frozen == 0) {
								for(Player p3 : World.getInstance().getPlayerList()) {
								if(p3 != p && p3 != p2) {
								if(p.multiZone() && p3.multiZone() && !p3.SafeZone()) {
								if(Misc.getDistance(p2.getLocation().getX(), p2.getLocation().getY(), p3.getLocation().getX(), p3.getLocation().getY()) <= 1) {
								multibarrage(p3);
								}
								}
								}
								}
								p2.frozen = freezeDelay;
								p2.graphics(369, 100);
								p2.sm("You have been frozen");
								p2.getWalkingQueue().reset();
							} else {
								p2.graphics(1677, (100 << 16));
								for(Player p3 : World.getInstance().getPlayerList()) {
								if(p3 != p && p3 != p2) {
								if(p.multiZone() && p3.multiZone() && !p3.SafeZone()) {
								if(Misc.getDistance(p2.getLocation().getX(), p2.getLocation().getY(), p3.getLocation().getX(), p3.getLocation().getY()) <= 3) {
								multibarrage(p3);
								}
								}
								}
								}
								this.stop();
								return;
							}
						}
						for(Player p3 : World.getInstance().getPlayerList()) {
						if(p3 != p && p3 != p2) {
						if(p.multiZone() && p3.multiZone() && !p3.SafeZone()) {
						if(Misc.getDistance(p2.getLocation().getX(), p2.getLocation().getY(), p3.getLocation().getX(), p3.getLocation().getY()) <= 3) {
						multibarrage(p3);
						}
						}
						}
						}
						p2.graphics(gfx2, 100);
					}
					this.stop();
					}
				});
		} else {
			p2.combatWith  = p.getIndex();
			p2.giveDrop  = p.getIndex();
			p.turnTo(p2);
			p.animate(anim);
			if (barrage) {	
				p.graphics(gfx, 100);
			} else { 
				p.graphics(gfx, (100 << 16));
			}
			p.combatDelay =+ 5;
			p.getWalkingQueue().reset();
			World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, projectile, 43, 31, p2);
			World.getInstance().registerEvent(new Event(getMagicDelay()) {
				public void execute() {
						p2.graphics(85,  (100 << 16));
					this.stop();
					}
				});
		}
			}
			}
		} catch(Exception e) {
	}
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

	public boolean usingRange(Player p) {
		if(p.getEquipment().get(3) == null) {
			return false;
		}
		switch(p.getEquipment().get(3).getDefinition().getId()) {
			case 14684:
			case 4212:
			case 4214:
			case 13883:
			case 4734:
			case 11235:
			case 9185:
			case 861:
			case 868:
			case 867:
			case 866:
			case 865:
			case 863:
			case 15241:
			case 10034:
			case 841:
			case 843:
			case 845:
			case 847:
			case 849:
			case 851:
			case 853:
			case 855:
			case 857:
			case 859:
				return true;
			case 0: 
				return false;
			case -1: 
				return false;
			default: 
				return false;
		}
	}
	public int SoundID(Player p) {
		if(p.getEquipment().get(3) == null) {
			return 2566;
		}
		switch(p.getEquipment().get(3).getDefinition().getId()) {
			case 806: // Start of Darts
			case 807:
			case 808:
			case 809:
			case 810:
			case 811:
			case 11230:
			case 863: // Start of Knifes
			case 864:
			case 865:
			case 866:
			case 867:
			case 868:
			case 869:
				return 2707;

			case 0:
				return -1;

			case 4151:
				return 2720;

			case 1307: // Start of 2Hs
			case 1309:
			case 1311:
			case 1313:
			case 1315:
			case 1317:
			case 1319:
			case 7158:
			case 6609:	
				return 2504;

			case 6528:
				return 2520;
	
			case 11235:
				return 3731;

			case 1379: // Start of Staffs
			case 1381:
			case 1383:
			case 1385:
			case 1387:
			case 2415: // Start of God Staffs & Iban's Staff & Slayer staff
			case 2416:
			case 2417:
			case 1409:
			case 4170:
			case 1391: // Start of BattleStaffs
			case 1393:
			case 1395:
			case 1397:
			case 1399:
			case 4710: // Start of Ahrim's Staff
			case 4862:
			case 4863:
			case 4864:
			case 4865:
				return 2555;

			case 4755: // Start of Verac's Flail
			case 4982:
			case 4983:
			case 4984:
			case 4985:
				return 1322;

			case 4747: // Start of Torag's Hammers
			case 4958:
			case 4959:
			case 4960:
			case 4861:
				return 1330;

			case 4718: // Start of Dharok's Greataxe
			case 4886:
			case 4887:
			case 4888:
			case 4889:
				return 1320;

			case 4726: // Start of Guthan's Warspear
			case 4910:
			case 4911:
			case 4912:
			case 4913:
				return 1333;

			case 1363: // Start of BattleAxes
			case 1365:
			case 1367:
			case 136:
			case 1371:
			case 1373:
			case 1375:
			case 1377:
			case 6589:
			case 7807:
				return 2498;

			case 1277:
			case 1279:
			case 1281:
			case 1283:
			case 1285:
			case 1287:
			case 1289:
				return 2499;


			case 1321: // Start of Scimitars
			case 1323:
			case 1325:
			case 1327:
			case 1329:
			case 1331:
			case 1333:
			case 4587:
			case 6611:
			case 11998:			case 1291:  // Start of Longswords
			case 1293:
			case 1295:
			case 1297:
			case 1299:
			case 1301:
			case 1303:
			case 1305:
			case 6607:
			case 13899:
				return 2500;


			case 746: // Start of Daggers
			case 747:
			case 1213:
			case 1215:
			case 5696: // Start of Daggers(p++)
			case 5698:
			case 6597:
				return 2549;


			case 11694: // Start of GodSwords
			case 11696:
			case 11698:
			case 11700:
				return 3846;


			case 4734: // Start of Karil's Cross & X-bow
			case 4934:
			case 4935:
			case 4936:
			case 4937:
			case 9174: // Start of CrossBows
			case 9176:
			case 9177:
			case 9179:
			case 9181:
			case 9183:
			case 9185:
			case 14684:
				return 1081;

			default:
				return 2566;
		}
	}
	public int getDbowDrawback() {
		switch(p.getEquipment().get(13).getDefinition().getId()) {
			case 11212:
				return 1110;
			case 892:
				return 1109;
			case 890:
				return 1108;
			case 888:
				return 1107;
			case 886:
				return 1106;
			case 884:
				return 1105;
			case 882:
				return 1104;
			default:
				return 1114;
		}
	}
	
	public int getDbowSpec() {
		switch(p.getEquipment().get(13).getDefinition().getId()) {
			case 11212:
				return 1099;
			default:
				return 1102;
		}
	}
	
	public int getMaxHit(Player p) {
		double baseStrength = p.getSkills().getLevel(2); //+  p.prayerBonus + p.potionBonus);
		if(usingRange(p)) {
		    baseStrength = p.getSkills().getLevelForXp(4);
		}
		double combatStrength = baseStrength; //+ p.attackStyle;
		double baseBonus = p.getBonuses().getBonus(10);
		if(usingRange(p)) {
		    baseBonus = p.getBonuses().getBonus(4);
		}
		if(usingRange(p) && p.getEquipment().isWieldingCBow() && p.getEquipment().isWieldingDbow() && p.getEquipment().isWieldingHandCannon()) {
		    baseBonus = rangeStrBonus();
		}
		double strengthMultiplier = (baseBonus * 0.00175) + 0.1;
		int maxHit = (int) Math.floor(combatStrength * strengthMultiplier * 1.05);
		if(FullDharokEquipped()) {
	    	    maxHit += (int)((p.getSkills().getLevelForXp(3) - p.getSkills().getLevel(3))/2.2);
		}
		if(usingRange(p)) {
		    if(p.SHARPEYE) {
				maxHit = (int) (maxHit * 1.05);
		    } else if(p.HAWKEYE) {
				maxHit = (int) (maxHit * 1.10);
		    } else if(p.EAGLEEYE) {
				maxHit = (int) (maxHit * 1.15);
		    } 
		} else {
		    if(p.BURSTOFSTRENGHT) {
				maxHit = (int) (maxHit * 1.05);
		    } else if(p.SUPERHUMANSTRENGHT) {
				maxHit = (int) (maxHit * 1.10);
		    } else if(p.ULTIMATESTRENGHT) {
				maxHit = (int) (maxHit * 1.15);
		    } else if(p.CHILVALRY) {
				maxHit = (int) (maxHit * 1.18);
		    } else if(p.PIETY) {
				maxHit = (int) (maxHit * 1.23);
		    }
		}
		return maxHit;
	}
	public void multibarrage(Player p) {
	int chance = Misc.random(4);
	switch(chance) {
	case 0:
	p.frozen = freezeDelay;
	p.hit(Misc.random(damage));
	p.graphics(369, 100);
	p.getWalkingQueue().reset();
	p.sm("You have been frozen!");
	break;
	case 1:
	p.graphics(1677, (100 << 16));
	break;
	case 2:
	p.graphics(gfx2, 100);
	break;
	case 3:
	p.frozen = freezeDelay;
	p.hit(Misc.random(damage));
	p.graphics(369, 100);
	p.getWalkingQueue().reset();
	p.sm("You have been frozen!");
	case 4:
	p.graphics(gfx2, 100);
	break;
	default:
	p.graphics(gfx2, 100);
	}
	}
	public int rangeStrBonus() {
		switch(p.getEquipment().get(13).getDefinition().getId()) {
			case 11212: // d arrows
				return 95;
			case 892: // rune arrows
				return 69;
			case 15243: // handcannon
				return 90;
			case 9244: // d bolt
				return 92;
			default:
				return 50;
		}
	}

}