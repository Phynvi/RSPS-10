package com.rs2hd.content.skills.combat;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
public class NpcVsPlayer {
	/**
	 * @author Dragonkk 80%
	 *	   Caelum 20%
	 */
	//private NPC n;
		private int attackStyle;
								//Attack starts here
public void Attack(Player p, NPC n) {
		try {

//checks if we can att enemy
					if(p == null || n == null) {
						System.out.println("p/n = null");
						return;
					}


		if(p.isDead()) {
			n.resetAttack();
			return;
		}
		if (n.Attacking == false || n.isDead()) {
			if (Aggresive(n) == false) {
				n.resetAttack();
			} else {
			}
		return;
		}
		switch(n.getId()) {
		case 941:
		case 1590:
		case 1591:
		case 1592:
			if(Misc.random(1) == 1) {
				DragonFire(p, n);
			} else {
				MeleeAttack(p, n);
			}
		break;
		default:
		if (IsRanging(n.getId()))
		RangeAttack(p, n);
			else
		MeleeAttack(p, n);
		break;
			}
		} catch(Exception e) {
		}
}
								//Attack Finish here
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
public void RangeAttack(Player p, NPC n) {
		try {
//distance from enemy check
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) > 8) {
				n.FollowNoAgressive(p);
				return;
			}
if(n.combatDelay == 0) {
n.turnTo(p);
int rangeDamage = Misc.random(n.getMaxHit());
				n.combatDelay =+ n.getAttackSpeed();
				if (IsSpecial(n.getId())) {
					SpecialNpcs(p, n);
					return;
					}
				n.animate(n.getAttackAnimation());
									p.hit(rangeDamage);				
									p.animate(p.getEquipment().getDefenceAnimation());
}
		} catch(Exception e) {
		}
}
public int GetSize(NPC n, Player p) {
switch (n.getId()) {
case 1158:
case 1160:
return 2;
case 8133:
	return 3;
case 8350:
case 8351:
case 8352:
	if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) > 1) {
		n.FollowNoAgressive(p);
	}
	return 8;
default:
	return 1;
}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
public void MeleeAttack(Player p, NPC n) {
		try {
//distance from enemy check
if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) > GetSize(n,p)) {
n.FollowNoAgressive(p);
return;
}
if(n.combatDelay == 0) {
p.animate(p.getEquipment().getDefenceAnimation());
n.combatDelay =+ n.getAttackSpeed();
n.turnTo(p);
if (IsSpecial(n.getId())) {
SpecialNpcs(p, n);
return;
}
int meleeDamage = Misc.random(n.getMaxHit());
n.animate(n.getAttackAnimation());
if (p.PROTECTFROMMELEE == true) {
p.hit(0);
} else {
p.hit(meleeDamage);
	}				
									p.animate(p.getEquipment().getDefenceAnimation());
}
		} catch(Exception e) {
		}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void DragonFire(Player p, NPC n) {
		try {
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 3) {
				if(n.combatDelay == 0) {
					if(n.getId() == 941 || n.getId() == 1590 || n.getId() == 1591 || n.getId() == 1592 || n.getId() == 55 || n.getId() == 4669) {
						n.turnTo(p);
						n.combatDelay =+ n.getAttackSpeed();
						p.hit(Misc.random(50));
						n.animate(81);
						n.graphics(1);
						p.animate(p.getEquipment().getDefenceAnimation());				
						if(p.getEquipment().get(5).getId() == 11284 || p.getEquipment().get(5).getId() == 11283) {
							p.hit(Misc.random(17));
							p.animate(403);
							int charge = Misc.random(5);
							if (charge == 5 && p.DFSCharges <= 50) {
								p.DFSCharges += 1;
								p.animate(6695);
								p.graphics(1164);
							}
						} else if(p.getEquipment().get(5).getId() == 1540) {
							p.hit(Misc.random(17));
							p.animate(403);
						} else {
							p.hit(Misc.random(50));
							p.animate(403);
						}
					}
				}
			} else {
				n.resetAttack();
			}
		} catch(Exception e) {
		}
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

public void SpecialNpcs(final Player p, final NPC n) {
	switch (n.getId()){
	case 1160:
		n.AttackStyle = Misc.random(2);
		if (n.AttackStyle == 2) { //melee
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 2) {
			n.animate(6235);
			if (p.PROTECTFROMMELEE == true)
				p.hit(0);
				else
				p.hit(Misc.random(31));
			}else{
				n.AttackStyle = Misc.random(1);	
			}
		}
		if (n.AttackStyle == 1) { //range
			n.animate(6234);	
			for(final Player pl : World.getInstance().getPlayerList()) {
			if (Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 30) {	
				World.getInstance().getProjectileManager().fire(n.getLocation(), pl.getLocation(),  50, 82, 289, 80, 31, pl);
				World.getInstance().registerEvent(new Event(600) {
					public void execute() {
						if (pl.PROTECTFROMMISSELES == true)
							pl.hit(0);
							else
							pl.hit(Misc.random(31));
						this.stop();
					}
				});
			}
			}
		}
		if (n.AttackStyle == 0) { //magic
			n.graphics(279);
			n.animate(6234);
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 82, 280, 46, 31, p);
			for(final Player pl : World.getInstance().getPlayerList()) {
				if (Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 30) {	
					World.getInstance().getProjectileManager().fire(p.getLocation(), pl.getLocation(),  50, 82, 280, 46, 31, pl);
					World.getInstance().registerEvent(new Event(600) {
						public void execute() {
							if (pl.PROTECTFROMMAGIC == true)
								pl.hit(0);
								else
								pl.hit(Misc.random(31));
							pl.graphics(281);
							this.stop();
						}
					});
				}
			}
		}
	break;
case 5421:
		if(Misc.random(2) == 2) {
			n.animate(5617);
			if(p.PROTECTFROMMELEE == true)
				p.hit(Misc.random(33));
			else 
				p.hit(Misc.random(69));
		} else {
			n.animate(5617);
			if(p.PROTECTFROMMISSELES == true)
				p.hit(Misc.random(69));
			else 
				p.hit(Misc.random(69));	
		}
	break;
	case 1158:
		n.AttackStyle = Misc.random(2);
		if (n.AttackStyle == 2) { //melee
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 2) {
			n.animate(6241);
			if (p.PROTECTFROMMELEE == true)
				p.hit(0);
				else
				p.hit(Misc.random(31));
			}else{
				n.AttackStyle = Misc.random(1);	
			}
		}
		if (n.AttackStyle == 1) { //range
			n.animate(6240);	
			for(final Player pl : World.getInstance().getPlayerList()) {
			if (Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 30) {	
				World.getInstance().getProjectileManager().fire(n.getLocation(), pl.getLocation(),  50, 82, 288, 46, 31, pl);
				World.getInstance().registerEvent(new Event(600) {
					public void execute() {
						if (pl.PROTECTFROMMISSELES == true)
							pl.hit(0);
							else
							pl.hit(Misc.random(31));
						this.stop();
					}
				});
			}
			}
		}
		if (n.AttackStyle == 0) { //magic
			n.graphics(278);
			n.animate(6240);
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 82, 280, 46, 31, p);
			for(final Player pl : World.getInstance().getPlayerList()) {
				if (Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 30) {	
					World.getInstance().getProjectileManager().fire(p.getLocation(), pl.getLocation(),  50, 82, 280, 46, 31, pl);
					World.getInstance().registerEvent(new Event(600) {
						public void execute() {
							if (pl.PROTECTFROMMAGIC == true)
								pl.hit(0);
								else
								pl.hit(Misc.random(31));
							pl.graphics(281);
							this.stop();
						}
					});
				}
			}
		}
	break;	
	case 8352: 
	case 8351: 
	case 8350:
		if (n.NPCCharges <= 0) { //makes it use the multi att
		n.AttackStyle = 3;
		}
		if (n.AttackStyle == 0) { //
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 2) {
		if (Misc.random(2) != 0) {
		n.graphics(1886);
		n.animate(10922);
		}else{
			n.animate(10919);
		}
		if (p.PROTECTFROMMELEE == true)
		p.hit(0);
		else
		p.hit(Misc.random(18));
		}
		}
		if (n.AttackStyle == 1) {
		n.animate(10918);
		World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1887, 46, 31, p);
		World.getInstance().registerEvent(new Event(600) {
		public void execute() {
			if (p.PROTECTFROMMISSELES == true)
				p.hit(0);
				else
				p.hit(Misc.random(26));
			this.stop();
		}
	});
		}
		if (n.AttackStyle == 2) {
			n.animate(10918);
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1884, 46, 31, p);
			World.getInstance().registerEvent(new Event(600) {
				public void execute() {
					if (p.PROTECTFROMMAGIC == true)
						p.hit(0);
						else
						p.hit(Misc.random(26));
					this.stop();
				}
			});
		}
		if (n.AttackStyle == 3) {
			n.animate(10917);
					World.getInstance().registerEvent(new Event(600) {
						public void execute() {
							if (!n.isDead()) {
								for(final Player pl : World.getInstance().getPlayerList()) {
									if (Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 3) {	
										n.animate(10918);
										World.getInstance().getProjectileManager().fire(n.getLocation(), pl.getLocation(),  50, 100, 1884, 46, 31, pl);
										World.getInstance().registerEvent(new Event(600) {
											public void execute() {
												if (pl.PROTECTFROMMAGIC == true)
													pl.hit(0);
													else
													pl.hit(Misc.random(26));
												pl.graphics(1883);
												this.stop();
											}
										});
									}
								}
							}
							this.stop();
						}
						});
		n.AttackStyle = Misc.random(2); //gets att style
		n.NPCCharges = Misc.random(8);
		n.NPCCharges = n.NPCCharges+2;
		}	
		n.NPCCharges -= 1;
	break;	
	case 8324: //nopray
	case 8325: //melee
	case 8326: //range
	case 8327: //magic
		n.animate(10854);
		if (p.PROTECTFROMMELEE == false)
		p.hit(13);
		else
		p.hit(0);
		if (n.NPCCharges > 0 && n.getId() != 8324)
		n.NPCCharges -= 1;
		if (n.NPCCharges == 0) {
			n.NPCCharges = -1;
			World.getInstance().registerEvent(new Event(25000) {
				public void execute() {
				n.NPCCharges = 20;
					this.stop();
				}
					});
			if (n.NPCCharges == -1) {
				n.setId(8324);
			}
		}
	break;
	case 8127:
		n.setLocation(Location.location(p.getLocation().getX()+1, p.getLocation().getY(), 0));
		World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1828, 46, 31, p);
		int CoreLdamage = Misc.random(13);
		if (p.PROTECTFROMMAGIC == true) {
			CoreLdamage = Misc.random(10);
		}
		p.hit(CoreLdamage);	
		for(NPC corp : World.getInstance().getNpcList()) {
		if (corp.getId() == 8133)
		corp.heal(CoreLdamage);
		}
		
	break;
	case 8133: //Corporeal beast
		int CorpStyle = Misc.random(5);
		if (CorpStyle == 5) {
			if (Misc.random(1) == 1 && GameEngine.DarkCoreOn == false) {
			n.animate(10057);
			n.graphics(1827);
			NPC npc = new NPC(8127);
			npc.readResolve(); 
			Location CoreLoc = Location.location(n.getLocation().getX()+3, n.getLocation().getY()+3, 0);
			//npc.setLocation(CoreLoc);
			World.getInstance().getNpcList().add(npc);
			npc.pid = p.getIndex();
			npc.Attacking = true;
			GameEngine.DarkCoreOn = true;
			}else{
			CorpStyle = Misc.random(4);
			}
			}
		if (CorpStyle == 4) { //melee
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 3) {
			n.animate(10057);
			n.graphics(1834);
			p.hit(Misc.random(51));
			}else{
			CorpStyle = Misc.random(3);
			}
			}
		if (CorpStyle == 3) { //melee
			if(Misc.getDistance(n.getLocation().getX(), n.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 3) {
			n.animate(n.getAttackAnimation());
			if (p.PROTECTFROMMELEE == false)
			p.hit(Misc.random(51));
			else
			p.hit(0);
			}else{
			CorpStyle = Misc.random(2);
			}
			}
		if (CorpStyle == 2) { //magic ball drain
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1823, 46, 31, p);
			n.animate(10055);
			World.getInstance().registerEvent(new Event(300) {
				public void execute() {
					if (p.PROTECTFROMMAGIC == false)
						p.hit(Misc.random(55));
						else
						p.hit(Misc.random(42));
						p.getSkills().DrainPray(Misc.random(5));
					this.stop();
				}
			});
			}
		if (CorpStyle == 1) { //magic splash
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(), 50, 100, 1824, 46, 31, p);
			for(final Player pl : World.getInstance().getPlayerList()) {
			if (Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), pl.getLocation().getX(), pl.getLocation().getY()) <= 2) {
			if (pl != p) {
			World.getInstance().registerEvent(new Event(300) {
			public void execute() {
					if (pl.PROTECTFROMMAGIC == true) {
					pl.hit(Misc.random(40));
					}else{
					pl.hit(Misc.random(30));
					}
				this.stop();
			}
		});
			World.getInstance().getProjectileManager().fire(p.getLocation(), pl.getLocation(), 50, 100, 1824, 46, 31, pl);
			}
			}
			}
			n.animate(10055);
			int CorpMagic = Misc.random(2);
			if (CorpMagic == 0) {
			World.getInstance().registerEvent(new Event(300) {
			public void execute() {
				if (p.PROTECTFROMMAGIC == true) {
					p.hit(Misc.random(30));
					}else{
					p.hit(Misc.random(40));
					}
			this.stop();
		}
	});
			}
			if (CorpMagic == 1) {
				World.getInstance().registerEvent(new Event(300) {
					public void execute() {
						if (p.PROTECTFROMMAGIC == true) {
							p.hit(Misc.random(30));
							p.hit(Misc.random(30));
							}else{
							p.hit(Misc.random(40));
							p.hit(Misc.random(40));
							}
					this.stop();
				}
			});
			}
			if (CorpMagic == 2) {
				World.getInstance().registerEvent(new Event(300) {
					public void execute() {
						if (p.PROTECTFROMMAGIC == true) {
							p.hit(Misc.random(30));
							p.hit(Misc.random(30));
							p.hit(Misc.random(30));
							}else{
							p.hit(Misc.random(40));
							p.hit(Misc.random(40));
							p.hit(Misc.random(40));
							}
					this.stop();
				}
			});
			}
			}
		if (CorpStyle == 0) {
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1825, 46, 31, p);
			n.animate(10055);
			World.getInstance().registerEvent(new Event(300) {
				public void execute() {
			p.hit(Misc.random(66));
			this.stop();
				}
			});
			}
	break;
	case 50:
	case 5363:
		int KbdStyle = Misc.random(4);
		if(KbdStyle == 4) {
			if(Misc.getDistance(p.getLocation().getX(), p.getLocation().getY(), n.getLocation().getX(), n.getLocation().getY()) <= 3) {
			n.animate(n.getAttackAnimation());
			p.hit(Misc.random(n.getMaxHit()));
		} else {
			KbdStyle = Misc.random(3);
			}
	   	} else if(KbdStyle == 3) {
			n.animate(81);
			n.getNpcWalk().resetWalking();
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 393, 46, 31, p);
			World.getInstance().registerEvent(new Event(400) {
				public void execute() {
			if(p.ADS() == true || p.DFS() == true)
				p.hit(Misc.random(17));
			else
				p.hit(Misc.random(17));
				this.stop();
				}
			});
		} else if(KbdStyle == 2) {
			n.animate(81);
			n.getNpcWalk().resetWalking();
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 396, 46, 31, p);
			World.getInstance().registerEvent(new Event(400) {
				public void execute() {
			if(p.PROTECTFROMMAGIC == true)
				p.hit(Misc.random(10));
			else
				p.hit(Misc.random(30));
			this.stop();
				}
			});
		} else if(KbdStyle == 1) {
			n.animate(81);
			n.getNpcWalk().resetWalking();
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 394, 46, 31, p);
			World.getInstance().registerEvent(new Event(400) {
			public void execute() {
			p.hit(Misc.random(20));
			if(Misc.random(2) == 2)
							this.stop();
				}
			});
		} else {
			n.animate(81);
			n.getNpcWalk().resetWalking();
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 395, 46, 31, p);
			World.getInstance().registerEvent(new Event(400) {
				public void execute() {
			p.hit(Misc.random(25));
			if(Misc.random(2) == 2)
				p.frozen = 20;
				p.sm("You have been frozen");
			this.stop();
				}
			});
		}
	break;
	
	case 6222:
		if(Misc.random(2) == 2) {
			n.animate(6976);
			if(p.PROTECTFROMMISSELES == true)
				p.hit(Misc.random(15));
			else 
				p.hit(Misc.random(40));
		} else {
			n.animate(6977);
			if(p.PROTECTFROMMISSELES == true)
				p.hit(Misc.random(15));
			else 
				p.hit(Misc.random(40));	
		}
	break;
	case 6260:
		if(Misc.random(2) == 2) {
			n.animate(7060);
			if(p.PROTECTFROMMELEE == true)
				p.hit(Misc.random(25));
			else 
				p.hit(Misc.random(65));
		} else {
			n.animate(7063);
			if(p.PROTECTFROMMISSELES == true)
				p.hit(Misc.random(15));
			else 
				p.hit(Misc.random(35));	
		}
	break;
	case 7133:
		if(Misc.random(2) == 2) {
			n.animate(8754);
			if(p.PROTECTFROMMELEE == true)
				p.hit(Misc.random(15));
			else 
				p.hit(Misc.random(45));
		} else {
			n.animate(8757);
			if(p.PROTECTFROMMAGIC == true)
				p.hit(Misc.random(15));
			else 
				p.hit(Misc.random(40));	
		}
	break;
	case 6203:
		if(Misc.random(2) == 2) {
			n.animate(6945);
			if(p.PROTECTFROMMELEE == true)
				p.hit(Misc.random(20));
			else 
				p.hit(Misc.random(43));
		} else {
			n.animate(6947);
			if(p.PROTECTFROMMAGIC == true)
				p.hit(Misc.random(14));
			else 
				p.hit(Misc.random(30));
			
		}
	break;
	case 6247:
		if(Misc.random(2) == 2) {
			n.animate(6967);
			if(p.PROTECTFROMMAGIC == true)
				p.hit(Misc.random(14));
			else 
				p.hit(Misc.random(31));
		} else {
			n.animate(6964);
			if(p.PROTECTFROMMELEE == true)
				p.hit(Misc.random(14));
			else 
				p.hit(Misc.random(31));
		}
	break;
	case 2745:
		int JadStyle = Misc.random(2);
		if(JadStyle == 0) {
			n.animate(n.getAttackAnimation());
			n.graphics(1625);;
			World.getInstance().registerEvent(new Event(1800) {
				public void execute() {
			if(p.PROTECTFROMMISSELES == true) {
				p.graphics(157);
				p.hit(0);
				this.stop();
			} else {
				p.graphics(157);
				p.hit(Misc.random(97));
				this.stop();
						}
					}
				});
			}
		if(JadStyle == 1) {
			n.animate(9277);
		World.getInstance().registerEvent(new Event(900) {
				public void execute() {
			if(p.PROTECTFROMMELEE == true) {
				p.hit(0);
				this.stop();
			} else {
				p.hit(Misc.random(97));
				this.stop();
						}
					}
				});
			}
		if(JadStyle == 2) {
		World.getInstance().registerEvent(new Event(500) {
			public void execute() {
			n.animate(9300);
			n.graphics(1626);
			this.stop();
			}
		});		
			n.animate(9278);
			World.getInstance().getProjectileManager().fire(n.getLocation(), p.getLocation(),  50, 100, 1627, 46, 31, p);
			World.getInstance().registerEvent(new Event(1800) {
				public void execute() {
			if(p.PROTECTFROMMAGIC == true) {
				p.hit(0);
				this.stop();
			} else {
				p.hit(Misc.random(97));
				this.stop();
					}
				}
			});
		}
		break;		
	}
	p.animate(p.getEquipment().getDefenceAnimation());
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
public boolean IsRanging(int npcId) {
switch (npcId){
case 1158:
case 8160:
case 8133:
case 8127:
case 6223:
case 6225:
case 6227:
case 6229:
case 6230:
case 6231:	
return true;
}
return false;
}
public boolean IsSpecial(int npcId) {
switch (npcId){
case 2745:
case 6222:
case 50:
case 5363:
case 1158:
case 1160:
case 8324:
case 8325:
case 8326:
case 8327:
case 8133:
case 8352:
case 8351:
case 8350:
case 8127:
case 6203:
case 6260:
case 5421:
case 6247:	
return true;
}
return false;
}

public int getNpcMeleeAttack(int npcId) {
switch (npcId){
case 8324:
case 8325:
case 8326:
case 8327:
return 83+99;
default:
return 50;
}
}
public boolean Aggresive(NPC n) {
switch(n.getId()) {
	case 50:
	case 941:
	case 8133:
	case 8350:
	case 8351:
	case 8352:
	case 1158:
	case 1160:
	case 8127:
	case 8325: //melee
	case 8326: //range
	case 8327: //magic
	case 8324:
	case 6815: //melee
	case 6816: //range
	case 8454:
	case 6203:
	case 6260:
	case 6261:
	case 6263:
	case 6265:
	case 6222:
	case 6247:
		return true;
		}
		return false;
	}
public int getNpcRangeAttack(int npcId) {
	switch (npcId){
	case 8324:
	case 8325:
	case 8326:
	case 8327:
	return 83;
	default:
	return 60;
	}
	}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//finishclass









