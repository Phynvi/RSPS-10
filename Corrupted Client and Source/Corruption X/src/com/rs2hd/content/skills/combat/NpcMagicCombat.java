package com.rs2hd.content.skills.combat;
import com.rs2hd.event.*;
import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.model.NPC;
import com.rs2hd.util.Misc;


/**
 * @author Dragonkk 100%
 *
 */
public class NpcMagicCombat {


	private transient Player p;
	
	public void setPlayer(Player p) {
		try {
		this.p = p;
		} catch(Exception e) {
		}
	}


public void handleMagic(int playerId, int interfaceId, int spellId) {
p.sm("spells not done yet :P");
}
}
