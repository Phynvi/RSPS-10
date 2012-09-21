package com.rs2hd.content.skills.combat;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.util.Misc;
public class NpcVsNpc {
	/**
	 * @author Dragonkk 100%
	 *
	 */
	//private NPC n;

								//Attack starts here
public static void Attack(NPC p, NPC n) {
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
		return;
		}
		switch(n.getId()) {
		default:
		MeleeAttack(p, n);
		break;
			}
		} catch(Exception e) {
		}
}
								//Attack Finish here
public static void MeleeAttack(NPC p, NPC n) {
		try {
if(n.combatDelay == 0) {
p.animate(n.getDefenceAnimation());
n.combatDelay =+ n.getAttackSpeed();
n.turnTo(p);
int meleeDamage = Misc.random(n.getMaxHit());
n.animate(n.getAttackAnimation());
p.hit(n.getMaxHit());				
p.animate(p.getDefenceAnimation());
}
		} catch(Exception e) {
		}
}
public boolean IsRanging(int npcId) {
switch (npcId){
case 1158:
case 8160:
case 8133:
case 8127:
case 50:	
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









