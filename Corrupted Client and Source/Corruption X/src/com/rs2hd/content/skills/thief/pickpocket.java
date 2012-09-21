package com.rs2hd.content.skills.thief;
import com.rs2hd.event.Event;
/**
 * @author Dragonkk 100% better its hard
 *
 */
import com.rs2hd.model.Item;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
public class pickpocket {
	private static int NPCThiefLvl;
	private static int NPCMaxHit;
	private static int NPCStunTime;
	private static double NPCXpAmt;
	private static Item ItemStole;
	private static void resetPickpocket() {
		
		setNPCThiefLvl(0);
		setNPCMaxHit(0);
		setNPCStunTime(0);
		setItemStole(null);
		}
	
	private static boolean StealProbality(Player p, int NPCThiefLvl) {
	if (Misc.random(p.getSkills().getLevel(17) +(p.getEquipment().contains(10075) ? 10 : 0)) > (NPCThiefLvl/2))
	return true;		
	else
	return false;
	}
	public static void PickPocket(final Player p, final NPC n, int Picktype) {
		if (n.isDead()) {
			p.sm("Too late; they're dead.");	
			return;
			}
		if (p.Attacking || p.AttackingNpc) {
			p.sm("You are in combat.");
			return;	
		}
		if (n.Attacking) {
			p.sm("This person is in combat.");
			return;	
		}
		if (p.combatDelay > 0 || p.cantPk)
			return;
		
	resetPickpocket();
	switch(Picktype) {
	case 1:
		setNPCThiefLvl(1); 
		setNPCMaxHit(1);
		setNPCStunTime(8);
		setNPCXpAmt(8);
		setItemStole(new Item(995,Misc.random(3)));
	break;
	case 2:
		setNPCThiefLvl(80); 
		setNPCMaxHit(4);
		setNPCStunTime(9);
		setNPCXpAmt(275);
		setItemStole(new Item(995,Misc.random(300)));
	break;
		}
		if (p.getSkills().getLevel(17) < getNPCThiefLvl()) {
			p.sm("You need to be level "+getNPCThiefLvl()+" to pickpocket this person.");
			return;
		}
	p.cantPk = true;
	p.cantWalk = true;
		p.turnTo(n);
		p.animate(881);
		World.getInstance().registerEvent(new Event(700) {
			public void execute() {
				if (!StealProbality(p, getNPCThiefLvl())) {
					p.animate(-1);
					p.graphics(80, 100);
					n.animate(451);
					n.turnTo(p);
					p.hit(getNPCMaxHit());
					p.combatDelay += getNPCStunTime();
					n.forceChat("What do you think you're doing?");
					World.getInstance().registerEvent(new Event(getNPCStunTime()*600) {
						public void execute() {
						p.graphics(-1);
						n.turnTo(n);
						p.cantWalk = false;
						this.stop();
						}
					});
					}else{
					p.getSkills().addXp(17, getNPCXpAmt());
					p.getInventory().addItem(getItemStole().getId(), getItemStole().getAmount());
					p.combatDelay += 4;
					p.cantWalk = false;
					}
				p.turnTo(p);
				p.cantPk = false;
				this.stop();
			}
		});
		}
	

	private static void setNPCThiefLvl(int nPCThiefLvl) {
		NPCThiefLvl = nPCThiefLvl;
	}

	private static int getNPCThiefLvl() {
		return NPCThiefLvl;
	}

	private static void setNPCMaxHit(int nPCMaxHit) {
		NPCMaxHit = nPCMaxHit;
	}

	private static int getNPCMaxHit() {
		return NPCMaxHit;
	}

	private static void setNPCStunTime(int nPCStunTime) {
		NPCStunTime = nPCStunTime;
	}

	private static int getNPCStunTime() {
		return NPCStunTime;
	}

	public static void setItemStole(Item itemStole) {
		ItemStole = itemStole;
	}

	public static Item getItemStole() {
		return ItemStole;
	}

	public static void setNPCXpAmt(double nPCXpAmt) {
		NPCXpAmt = nPCXpAmt*10;
	}

	public static double getNPCXpAmt() {
		return NPCXpAmt;
	}
}
