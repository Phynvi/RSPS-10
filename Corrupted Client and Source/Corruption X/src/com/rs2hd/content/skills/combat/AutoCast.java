package com.rs2hd.content.skills.combat;

import com.rs2hd.model.*;

/**
 * @author Dragonkk 100%
 *
 */
public class AutoCast {
	@SuppressWarnings("unused")
	private Player p;
	public AutoCast(Player p) {
		this.p = p;
	}

public transient int SpellBook = -1;
public transient int SpellId = -1;
public transient boolean AutoCastOn = false;


public void Cast(Player p, Player pE) {
p.MagicId = pE.getIndex(); //enemy for spell
//p.getMagicCombat().StartSpell(pE,SpellBook,SpellId);
}


	public boolean usingAutoCast(Player p) {
		if(p.getEquipment().get(3) == null) {
			return false;
		}
		Item item = p.getEquipment().get(3);
		String weapon = item.getDefinition().getName();
		if (!AutoCastOn)
		return false;

		if (weapon.contains("Staff") || weapon.contains("staff")||weapon.contains("battlestaff") ||weapon.equals("Ancient staff"))
		return true;

		return false;
}

}
