package com.rs2hd.model;

import com.rs2hd.GameEngine;
import com.rs2hd.event.Event;
import com.rs2hd.util.Misc;

public class FamiliarNpc extends NPC { //autor dragonkk remade it on my 546 and its better anyway not perfect
public FamiliarNpc(int NpcId, Player owner) {
		super(NpcId); 
		AppearFamiliar(NpcId, owner);
	}
private transient int SpecialAmount = 60;
private transient int SummonHalfsMinutes = 0;
private transient boolean UsingSpecial = false;
private transient int FamiliarId = -1;
private transient Player owner = null;
public void AppearFamiliar(int NpcId, Player owner) {
	readResolve();
	teleport(Location.location(owner.getLocation().getX()+2,owner.getLocation().getY()+2,owner.getLocation().getZ()));
	World.getInstance().getNpcList().add(this);
	setIsFamiliar(true);
	setFamiliarId(NpcId);
	setOwner(owner);
	animate(teleEmote());
	graphics(1315);
	pfollow = owner.getIndex();
	SpecialAmount = 60;
	SummonHalfsMinutes = TimeLife();
	owner.getActionSender().sendConfig(1174 , getId());
	eventFamiliarProcess();
	eventFamiliarSpecBar();
}
private int teleEmote() {
switch (getId()) {
case 6815:
case 6816:
return 8282;
case 6864:
case 6863:
return 8026;
case 7344:
case 7343:
return 8188;	
default:
return -1;
}
}
private int TimeLife() {
	switch (getId()) {
	case 6815:
	case 6816:
	return 45*2;	
	default:
	return 45*2;
	}
	}
private void setSpecBar() {
owner.getActionSender().sendConfig(1176 , SummonHalfsMinutes*65);
owner.getActionSender().sendConfig(1177 , SpecialAmount);
}
private void eventFamiliarSpecBar() {
	World.getInstance().registerEvent(new Event(10000) {
		public void execute() {
			if (owner == null || !World.getInstance().isOnline(owner.getUsername())) {
				this.stop();
				return;
			}
			if (this == null || isDead() || owner.isDead() || owner.Summoning == false || SummonHalfsMinutes == 0) {
			this.stop();
			return;
			}
			if (SpecialAmount != 60) {
				SpecialAmount += 10;
			}
			
		}
	});
		}
private transient int SummonTimer = 0;
	public void eventFamiliarProcess() {
		World.getInstance().registerEvent(new Event(600) {
			public void execute() {
			if (owner == null) {
				deleteFamiliar();
				this.stop();
				return;
			}
			if (!World.getInstance().isOnline(owner.getUsername())) {
				if (!isHidden())
				HiddenFamiliar(true);
				return;
			}
			if (World.getInstance().isOnline(owner.getUsername()) && isHidden()) {
				HiddenFamiliar(false);
				return;
			}
			if (this == null || isDead() || owner.isDead() || owner.Summoning == false || SummonHalfsMinutes == 0) {
			owner.Summoning = false;
			owner.getActionSender().sendTab(92, 56);
			deleteFamiliar();
			this.stop();
			return;
			}
			if (SummonTimer > 0) {
				SummonTimer--;
			}
			if (SummonTimer == 0) {
				SummonHalfsMinutes--;
				SummonTimer = 50;
			}
			if (SafeZone() && getId() != FamiliarId) {
				setId(FamiliarId);
				resetAttack();
			}
			if (!SafeZone() && getId() == FamiliarId) {
				setId(FamiliarId+1);
				resetAttack();
			}
			if(Misc.getDistance(getLocation().getX(), getLocation().getY(), owner.getLocation().getX(), owner.getLocation().getY()) > 8 || owner.CallSummoning) { //!SafeZone() && owner.SafeZone() || SafeZone() && !owner.SafeZone() 
			teleport(Location.location(owner.getLocation().getX()+1,owner.getLocation().getY()+1,owner.getLocation().getZ()));
			animate(teleEmote());
			graphics(1315);
			owner.CallSummoning = false;
			resetAttack();
			}
			if (owner.Attacking && Math.random() > 0.8) {
				pid = owner.id;
				Attacking = true;
			}
			if (Attacking) {
				final Player enemy = World.getInstance().getPlayerList().get(pid);
				if (enemy.SafeZone())
					resetAttack();
			}
			if (!Attacking) {
				turnTo(owner);
				getNpcWalk().followPlayer(owner,2);
			}
			if (owner.FamiliarSpec != 0) {
				UseSpec();
			}
			setSpecBar();
			}
			});
	}
	private int ScrollNeeded() {
	switch (owner.FamiliarSpec) {
	case 123:
	return 12439;
	default:
	return -1;
	}
	}
	private void UseSpec() {
	if (!owner.getInventory().contains(ScrollNeeded())) {
	owner.sm("You need scrolls for use special.");
	resetSpec();
	return;	
	}
	if (SpecialAmount < 20) {
	owner.sm("Your familiar needs more special... Please wait.");
	resetSpec();
	return;
	}else{
	SpecialAmount -= 20;	
	}
	switch (owner.FamiliarSpec) {
	case 123:
		owner.getSkills().set(1, owner.getSkills().getLevelForXp(1)+8);
		animate(8288);
	break;
	}
	resetSpec();
	}
	private void resetSpec() {
		owner.FamiliarSpec = 0;
}
	private void setFamiliarId(int familiarId) {
		FamiliarId = familiarId;
	}
	private void HiddenFamiliar(boolean Hidden) {
	resetAttack();
	setHidden(Hidden);
	if (Hidden == false) {
	owner.getActionSender().sendTab(92, 662);
	GameEngine.summon.SummonConfigs(owner,getFamiliarId());
	eventFamiliarSpecBar();
	
	}
	}
	public void deleteFamiliar() {
		resetAttack();
		setFamiliarId(-1);
		setOwner(null);
		delete(this);
	}

	public int getFamiliarId() {
		return FamiliarId;
	}

	private void setOwner(Player owner) {
		this.owner = owner;
	}

	public Player getOwner() {
		return owner;
	}

}
