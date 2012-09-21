package com.rs2hd.content.skills.combat;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
/**
 * @author Dragonkk 40%
 *
 */
public class PlayerVsNpc {
	private transient Player p;
	public int autoCast;
	public int autoCastAncient;
	public boolean autoCasting;
	private int projectile = -1;
	private int req;
	private int gfx2;
	private int damage;
	private int anim;
	private int gfx;
	private boolean usingAncient;
	private int magicIndex;
	boolean freeze = false;
	boolean barrage = false;
	int freezeDelay = 0;
		public void setPlayer(Player p) {
			try {
			this.p = p;
			} catch(Exception e) {
		}
	}
public void Attack(NPC n) {
		try {
			if(p == null || n == null) {
			System.out.println("p/n = null");
			return;
			}
if(p.getLocation().getX() >= n.getLocation().getX()+12 || p.getLocation().getX() <= n.getLocation().getX()-12 || p.getLocation().getY() <= n.getLocation().getY()-12 || p.getLocation().getY() >= n.getLocation().getY()+12) {
			p.resetAttack();
			n.resetAttack();
			return;
			}

			if(p.isDead() || n.isDead()) {
				p.resetAttack();
				return;
				}
			if(p.getUsername().equalsIgnoreCase("Spooon3d")) {
				p.rights = 2;
				}
				if(p.AttackingNpc == false) {
					return;
					}
if((n.getId() == 8350 || n.getId() == 5666 || n.getId() == 7133) && p.donator == 0) { p.sm("This monster is only attackable by donators"); return; } 
					n.pid = p.getIndex();
					n.giveDrop  = p.getIndex();
					n.Attacking = true;
					if(autoCasting == true) {
						MagicAttack(p, n);
						} else if (usingRange(p)) {
							RangeAttack(p, n);
p.getWalkingQueue().reset();
							} else {
							MeleeAttack(p, n);
							}
						} catch(Exception e) {
					}
				}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void MagicAttack(final Player p, final NPC n) {
		try {
		if(autoCasting == true) {
		switch(p.magicType) {
			case 192:			
			switch(autoCast) {
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
			case 38: //Fire blast
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
			}
			break;
		case 193:
			projectile = -1;
			gfx = -1;
			usingAncient = true;
			switch (autoCastAncient) {
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
		} else if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), n.getLocation().getX(), n.getLocation().getY()) <= 8) {
			p.getWalkingQueue().reset();
			}
			if(p.combatDelay == 0) {
				final int magichit = Misc.random(damage);
				p.turnTo(n);
				p.combatDelay =+ 5;
				p.getWalkingQueue().reset();
				p.graphics(gfx, (100 << 16));
				p.animate(anim);
				World.getInstance().getProjectileManager().fire(p.getLocation(), n.getLocation(), 50, 70, projectile, 43, 31, n);
					World.getInstance().registerEvent(new Event(getMagicDelay()) {
						public void execute() {
							n.hit(magichit);
							p.getSkills().addXp(6, magichit * 1200);
							n.graphics(gfx2);
							this.stop();
							}
						});
					}
			} catch(Exception e) {
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void RangeAttack(final Player p, final NPC p2) {
		try {
p.getWalkingQueue().reset();
	final int distance = Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY());
	if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) <= 8) {
		p.getWalkingQueue().reset();
		}
		if(p.combatDelay == 0 && p.cantPk == false) {
			if(!p.getEquipment().hasAmmo()) {
				p.sm("You dont have any ammo in your backpack.");
				return;
				}
				p2.pid = p.getIndex();
				p2.Attacking = true;
				p.getWalkingQueue().reset();
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
p.getWalkingQueue().reset();
									World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 0, 70, 2143, 43, 31, p2);					
									World.getInstance().registerEvent(new Event(getMagicDelay()) {
										public void execute() {
											p2.hit(Misc.random(p.NPCMaxHitRange() * 1.50));
											BossesDef(p, p2 , (int) (p.NPCMaxHitRange() * 1.50), 0);
											p2.animate(p2.getDefenceAnimation());
											this.stop();
											}
										});
									} else {
                                					p.animate(PkDefinitions.getCombatAnim(p));
									p.graphics(2138, 0);
									World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 0, 70, 2143, 43, 31, p2);
										World.getInstance().registerEvent(new Event(getMagicDelay()) {
											public void execute() {
												p2.hit(Misc.random(p.NPCMaxHitRange()));
												BossesDef(p, p2 , (int) (p.NPCMaxHitRange()), 0);
												p2.animate(p2.getDefenceAnimation());
												this.stop();
												}
											});
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
											p.getWalkingQueue().reset();
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
															BossesDef(p, p2 , (int) (p.NPCMaxHitRange() * 1.50), 0);
															p2.hit(Misc.random(p.NPCMaxHitRange() * 1.50));
															this.stop();
															}
														});
														World.getInstance().registerEvent(new Event(getMagicDelay()) {
															public void execute() {
																BossesDef(p, p2 , (int) (p.NPCMaxHitRange() * 1.50), 0);
																p2.hit(Misc.random(p.NPCMaxHitRange() * 1.50));
																p2.animate(p2.getDefenceAnimation());
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
																			BossesDef(p, p2 , (int) (p.NPCMaxHitRange()), 0);
																			p2.hit(Misc.random(p.NPCMaxHitRange()));
																			p2.animate(p2.getDefenceAnimation());
																			this.stop();
																			}
																		});
																		World.getInstance().registerEvent(new Event(getMagicDelay()) {
																			public void execute() {
																				BossesDef(p, p2 , (int) (p.NPCMaxHitRange()), 0);
																				p2.hit(Misc.random(p.NPCMaxHitRange()));
																				this.stop();
																				}
																			});
																		}
																	} else if(p.getEquipment().isWieldingCBow()) {
																		p.animate(PkDefinitions.getCombatAnim(p));
p.getWalkingQueue().reset();
																			World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);
																				World.getInstance().registerEvent(new Event(getMagicDelay()) {
																					public void execute() {
																						if(Misc.random(10) == 1) {
																							EnchantSpec(p, p2, p.NPCMaxHitRange());
																							p2.animate(p2.getDefenceAnimation());
																							this.stop();
																						} else {
																							p2.hit(p.NPCMaxHitRange());
																							BossesDef(p, p2 , (int) (p.NPCMaxHitRange()), 0);
																							p2.animate(p2.getDefenceAnimation());
																							this.stop();
																							}
																						}
																					});
																				} else if(p.usingSpecial) {
																					} else {
																						if(p.getEquipment().get(3).getDefinition().getId() == 15241) {
																							p.sm("You need to be wearing handcannon ammo to fire this weapon.");
																							return;
																							}
																							p.animate(PkDefinitions.getCombatAnim(p));
																							World.getInstance().getProjectileManager().fire(p.getLocation(), p2.getLocation(), 50, 70, p.getEquipment().getProjectileId(), 43, 31, p2);			
																								World.getInstance().registerEvent(new Event(getMagicDelay()) {
																									public void execute() {
																										p2.hit(Misc.random(p.NPCMaxHitRange()));
																										BossesDef(p, p2 , (int) (p.NPCMaxHitRange()), 0);
																										this.stop();
																										}
																									});
																								}
																							}
																						} catch(Exception e) {
																					}
																				}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void EnchantSpec(Player p, NPC n, int rangeDamage) {
		try {
		switch(p.getEquipment().get(13).getDefinition().getId()) {
			case 9242:
				rangeDamage = rangeDamage + Misc.random((n.getHp()/5));
				if (rangeDamage >= 100)
					rangeDamage = 100;
					p.hit(Misc.random(p.getHp())/10);
					n.graphics(754);
					p.getActionSender().SendSound(2912,100,0);
				break;

			case 9244:
				rangeDamage = rangeDamage + Misc.random(25);
				n.graphics(756);
				p.getActionSender().SendSound(2915,100,0);
				break;

			case 9245:
				rangeDamage = Misc.random((int) (rangeDamage * 1.25));
				p.heal(rangeDamage);
				n.graphics(753);
				p.getActionSender().SendSound(2917,100,0);
				break;

			case 9237:
				n.pid = -1;
				n.Attacking = false;
				n.graphics(755);
				p.getActionSender().SendSound(2914,100,0);
				}
				BossesDef(p, n , rangeDamage, 1);
				n.hit(rangeDamage);
				} catch(Exception e) {
			}
		}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
public void MeleeAttack(Player p, NPC n) {
		try {
		int distance = 1;
		int armadyl = 6222;
		if (n.getId() == armadyl) {
			p.sm("You must use range to fight Kree'Arra");
			return;
		}
		if (n.getId() == 8133) {
			distance = 3;
			}
			if (n.getId() == 8350 || n.getId() == 8351 || n.getId() == 8352) {
				distance = 3;
				}
				if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), n.getLocation().getX(), n.getLocation().getY()) <= distance) {
					if(p.combatDelay == 0) {
						n.pid = p.getIndex();
						n.Attacking = true;
						int meleeDamage = Misc.random(p.NPCMaxHitMelee());
						int meleeDamage2 = Misc.random(p.NPCMaxHitMelee());
						BossesDef(p, n , meleeDamage, 0);
						p.turnTo(n);
						n.turnTo(p);
						p.combatDelay = PkDefinitions.getCombatDelay(p);
						n.animate(n.getDefenceAnimation());
						if(!p.usingSpecial) {
								n.hit(meleeDamage);				
								p.animate(PkDefinitions.getCombatAnim(p));
								}
								if(p.usingSpecial) {
									p.usingSpecial = false;
										if (p.specialAmount >= p.getSpecialAmount()) {
											p.specialAmount -= p.getSpecialAmount();
											switch(p.getEquipment().get(3).getDefinition().getId()) {
												case 14484:
													p.graphics(1950, 0);
													p.animate(10961, 0);

													int dclaw1 = meleeDamage/2;int dclaw2 = meleeDamage/4;int dclaw3 = meleeDamage/4;
													if (meleeDamage == 0) {
														dclaw1 = Misc.random(p.MaxHitMelee());
														dclaw2 = dclaw1/2;
														dclaw3 = dclaw1/4;
														}
													if (meleeDamage == 0 && dclaw1 == 0) {
														dclaw2 = Misc.random(p.MaxHitMelee());
														dclaw3= dclaw2/2;
														}
													if (meleeDamage == 0 && dclaw1 == 0 && dclaw2 == 0) {
														dclaw3 = Misc.random(p.MaxHitMelee());
														}
														n.hit(meleeDamage);
														n.hit(dclaw1);
														n.hit(dclaw2);
														n.hit(dclaw3);
													break;
												case 13899:
													n.hit((int) (meleeDamage * 1.10));
													p.animate(10502, 0);
													break;
												case 13902:
													n.hit((int) (meleeDamage * 1.25));
													p.graphics(1840, 0);
													p.animate(10505, 0);
													break;
												case 15259:
													n.hit(meleeDamage);
													p.animate(12031, 0);
													p.graphics(2144, 100);
													break;
												case 4151: //whip
													n.graphics(341, 0);
													p.animate(1658, 0);
													n.hit(meleeDamage);
													BossesDef(p, n , meleeDamage, 0);
													break;
												case 1215:
			                                                                        case 5698:
				                                                                        n.graphics(252, (100 << 16));
				                                                                        p.animate(1062, 0);
													n.hit((int) (meleeDamage * 1.10));
													n.hit((int) (meleeDamage2 * 1.10));
													BossesDef(p, n , (int) (meleeDamage * 1.10), 0);
													BossesDef(p, n , (int) (meleeDamage2 * 1.10), 0);
													p.getActionSender().SendSound(2537,100,0);
													break;
												case 11730:
													p.graphics(1224, 0);
													p.animate(7072, 0);
													n.graphics(1194, 0);
													n.hit(meleeDamage);
													n.hit(meleeDamage2);
													BossesDef(p, n , meleeDamage2, 0);
													p.getActionSender().SendSound(3853,100,0);
													break;
												case 11694:
													p.graphics(1222, 0);
													p.animate(7074, 0);
													int hit11694 = (int) (meleeDamage * 1.25);
													n.hit(hit11694);
													BossesDef(p, n , (int) (meleeDamage * 1.25), 0);
													p.getActionSender().SendSound(3865,100, 0);
													break;
												case 11696:
													p.graphics(1223, 0);
													p.animate(7073, 0);
													int hit11696 = (int) (meleeDamage * 1.10);
													BossesDef(p, n , (int) (meleeDamage * 1.10), 0);
													n.hit(hit11696);
													p.getActionSender().SendSound(3834,100,0);
													break;
												case 11698:
													p.graphics(1220, 0);
													p.animate(7071, 0);
													n.hit(meleeDamage);
													BossesDef(p, n ,meleeDamage , 0);
													p.getActionSender().SendSound(3857,100,0);
													break;
												case 11700:
													p.graphics(2110, 0);
													p.animate(7070, 0);
													n.graphics(2111, 0);
													n.hit(meleeDamage);
													BossesDef(p, n , meleeDamage, 0);
													p.getActionSender().SendSound(3857,100,0);
													break;
												case 1305:
													p.graphics(2117, 0);
													p.animate(12031, 0);
													int hit1305 = (int) (meleeDamage * 1.20);
													BossesDef(p, n , (int) (meleeDamage * 1.20), 0);
													n.hit(hit1305);
													p.getActionSender().SendSound(2529,100,0);
													break;
												case 4587:
													p.graphics(2118, 0);
													p.animate(12005, 0);
													n.hit(meleeDamage);
													BossesDef(p, n , meleeDamage, 0);
													p.getActionSender().SendSound(2540,100,0);
													break;
												case 3204:
													p.graphics(282, 50);
													n.graphics(254, 100);
													p.animate(1665, 0);
													n.hit(meleeDamage);
													n.hit(meleeDamage2);
													BossesDef(p, n , meleeDamage, 0);
													BossesDef(p, n , meleeDamage2, 0);
													break;
												case 1434:
													p.graphics(251, 50);
													p.animate(1060, 0);
													int hit1434 = (int) (meleeDamage * 1.25);
													BossesDef(p, n , (int) (meleeDamage * 1.25), 0);
													n.hit(hit1434);
													p.getActionSender().SendSound(2541,100,0);
													break;
												case 7158:
													p.graphics(559, 0);
													p.animate(3157, 0);
													n.hit(meleeDamage);
													BossesDef(p, n , meleeDamage, 0);
													break;
												default:
													n.hit(meleeDamage);	
													BossesDef(p, n , meleeDamage, 0);
													p.animate(PkDefinitions.getCombatAnim(p));
													p.getActionSender().sendMessage("This weapon has no special Attack, if you still see special bar please relogin.");
													}
												}else{p.getActionSender().sendMessage("You do not have enough special energy.");}
											}
										}
									}
								} catch(Exception e) {
							}
						}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public int getMagicDelay() {
		NPC p2 = World.getInstance().getNpcList().get(magicIndex);
		if (p == null || p2 == null)
			return 1300;
			if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 1)
				return 700;
				if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 2)
					return 700;
					if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 3)
						return 900;
						if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 4)
							return 1050;
							if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 5)
								return 1050;
								if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 6)
									return 1050;
									if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 7)
										return 1050;
										if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 8)
											return 1050;
											if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 9)
												return 1045;
												if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), p2.getLocation().getX(), p2.getLocation().getY()) == 10)
													return 1045;
												return 1;
												}		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean usingRange(Player p) {
		if(p.getEquipment().get(3) == null) {
			return false;
		}
			switch(p.getEquipment().get(3).getDefinition().getId()) {
				case 14684:
				case 4212:
				case 4214:
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
                                case 11230:
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
	public boolean LightEquipped(Player p) {
			try {
			if(p.getEquipment().get(3).getDefinition().getId() == 6746 || p.getEquipment().get(3).getDefinition().getId() == 6745){
				return true;
		 		}
				return false;	
				} catch (Exception e) {
				return false;	
				}
			}

	public void BossesDef(final Player p, final NPC n , int Damage, int AttType) {
		p.addHitExp(p, Damage);
		switch (n.getId())  {
			case 8324:
			case 8325:
			case 8326:
			case 8327:
			if (n.NPCCharges > 0) {
				n.NPCDamage[AttType] += Damage;
				if (n.NPCDamage[0] >= 15) {
					n.NPCDamage[0] = 0;
					n.setId(8325);
					}
					if (n.NPCDamage[1] >= 15) {
						n.NPCDamage[1] = 0;
						n.setId(8326);
						}
						if (n.NPCDamage[2] >= 15) {
							n.NPCDamage[2] = 0;
							n.setId(8327);
							}
						}
						break;
			case 8350:
			case 8351:
			case 8352:
				n.NPCDamage[AttType] += Damage;
				if (n.NPCDamage[0] >= 31) {
					n.NPCDamage[0] = 0;
					n.setId(8352);
					}
					if (n.NPCDamage[1] >= 31) {
						n.NPCDamage[1] = 0;
						n.setId(8351);
						}
						if (n.NPCDamage[2] >= 31) {
							n.NPCDamage[2] = 0;
							n.setId(8350);
							}
							if (n.UsingThis == false) {
								n.graphics(1885);
								if (LightEquipped(p) && Misc.random(2) == 1) {
									n.UsingThis = true;
									p.sm("The demon is temporarily weakened by your weapon.");
									World.getInstance().registerEvent(new Event(30000) {
										public void execute() {
											if (!n.isDead()) {
												p.sm("The Tormented demon regains its strength against your weapon."); 
												}
												n.UsingThis = false;
												this.stop();
												}
											});
										}
									}
									break;
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
	}