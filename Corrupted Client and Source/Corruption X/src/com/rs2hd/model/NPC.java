package com.rs2hd.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.HashMap;
import java.util.*;
import com.rs2hd.event.Event;
import com.rs2hd.model.NPCDrop.Drop;
import com.rs2hd.GameEngine;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.content.DeathEvent;
import com.rs2hd.model.Hits.Hit;
import com.rs2hd.util.Misc;

/**
 * Represents a 'non-player' character in the game.
 * @author Graham
 *
 */
public class NPC extends Entity {
public int giveDrop = 0;
private transient boolean IsFamiliar = false;
public transient int AttackStyle = 0;
public transient int NPCCharges = 0;

public Location spawnlocation = Location.location(0,0, 0);



public transient boolean UsingThis = false;
public transient int NPCDamage[] = new int[14];
public transient boolean npccanloot=false;
private transient NpcWalk NpcWalk;
public Item dropId(int id, int amt) {
	return new Item(id, amt);
}
public void resetNpcDef() {
AttackStyle = 0;
NPCCharges = 0;
UsingThis = false;
NPCDamage = new int[14];
if (this.getId() == 8324) {
NPCCharges = 20;
}
}
public void npcDiedBones(Player p, int npcID) {	
switch(npcID) {
case 115:
World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(532, 1));
giveDrop = 0;
break;
case 50:
case 941:
if(getId() == 941) {
World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(1753, 1));
giveDrop = 0;
}else{
World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(1747, 1));
giveDrop = 0;
}
World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(536, 1));
giveDrop = 0;
break;
default:
World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(526, 1));
giveDrop = 0;
break;
	}
}
	public void npcDied(Player p, int npcID) {	
		Random rand = new Random();
		try {
	        BufferedReader in = new BufferedReader(new FileReader("data/npcdrops.cfg"));
	        String input;
	        int on = 0;
	        String[] splitEQL;
	        String[] splitCOM;
	        String[] splitDSH;
	        String[] splitCLN;
	        String[] splitSCL;
				while ((input = in.readLine()) != null) {
					splitEQL = null; splitEQL = null; splitDSH = null; splitCLN = null; splitSCL = null;
					if (!input.startsWith("/") && input.contains("=") && input.contains(",") && input.contains("-") && input.contains(":")) {
						try {
						splitEQL = input.split("=");
							if (Integer.parseInt(splitEQL[0]) == npcID) {
								splitSCL = splitEQL[1].split(";");
								int Wealth=0;
									/*if (p.getEquipment().get(12).getDefinition().getId() == 2572) {
										if (Misc.random(3) == 1) {
											Wealth=10;
										}
									}*/
									for (int i = Wealth; i < splitSCL.length; i++) {
										splitCOM = splitSCL[i].split(",");
										splitDSH = splitCOM[1].split("-");
										splitCLN = splitCOM[2].split(":");
										int item = Integer.parseInt(splitCOM[0]);
										int min = Integer.parseInt(splitDSH[0]);
										int max = Integer.parseInt(splitDSH[1]);
										int chance = Integer.parseInt(splitCLN[0]);
										int outOf = Integer.parseInt(splitCLN[1]);
										int amount = rand.nextInt((max - min)+1) + min; 
										int ifDrop = rand.nextInt(outOf)+1;
											if (ifDrop <= chance && npccanloot == true) {
												World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), dropId(item, amount));
												npccanloot = false;
												giveDrop = 0;
											}
									}
							}
						} catch (Exception e) {							
							System.out.println("Exception dropping item:\n"+e);
						}
						++on;
					}
				}
				in.close();
			} catch (IOException e) {
				System.out.println(e);
			}
	}
	public static enum WalkType {
		STATIC,
		RANGE,
	}
	//public int pfollow = 0;	
	public int pid = 0;
	public boolean Attacking = false;
	public int combatDelay = 0;
	private int id;
private transient boolean followIsDelayed;
	private transient NPCDefinition definition;
	private transient NPCUpdateFlags updateFlags;
	private transient ForceText forceText;
	public transient int sprite;
	private transient int hp;
	private transient Queue<Hit> queuedHits;
	private WalkType walkType;
	private transient Location originalLocation;
	private Location minimumCoords = Location.location(0, 0, 0);
	private Location maximumCoords = Location.location(0, 0, 0);
	public transient int pfollow = -1;

	public void setFollowDelayed(boolean b) {
		try {
		this.followIsDelayed = b;
		} catch(Exception e) {
		}
	}
	public boolean isFollowDelayed() {
		return followIsDelayed;
	}
	public NPC() {
		/*System.out.println("The following:");
		Thread.dumpStack();
		System.out.println("--------------------");*/
	}
	public NPC(int id) {
		this.id = id;
		this.definition = NPCDefinition.forId(id);
		this.setWalkType(WalkType.STATIC);
	}
	public boolean FullEliteBlackEquipped(Player p) {
		try {
	if(p.getEquipment().get(0).getDefinition().getId() == 14494 && p.getEquipment().get(4).getDefinition().getId() == 14492 && p.getEquipment().get(7).getDefinition().getId() == 14490)
                {
		return true;
                }
		return false;	
		} catch (Exception e) {
		return false;
		}
        	}
	public void Agressive() {
		if (this.isDead()||this.isDestroyed()) {
		return;
		}
	switch (this.getId()) {
	case 6815: //melee
	case 6816: //range
	
	break;
	case 50:
	for(Player ppp : World.getInstance().getPlayerList()) {
		if(Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), ppp.getLocation().getX(), ppp.getLocation().getY()) <= 8) {
			this.pid = ppp.getIndex();
			this.Attacking = true;
		}
	}
	break;
	case 8325: //melee
	case 8326: //range
	case 8327: //magic
	case 8324:
		for(Player p : World.getInstance().getPlayerList()) {
		if (p.IsAtBlackCastle() && !FullEliteBlackEquipped(p)) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
		}
		if (!this.Attacking)
			this.setId(8324);
	break;
	case 6222: //melee
	case 6223: //range
	case 6225: //magic
	case 6227:
		for(Player p : World.getInstance().getPlayerList()) {
		if (Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 4) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
	}
	break;
	case 6260: //melee
	case 6261: //range
	case 6263: //magic
	case 6265:
		for(Player p : World.getInstance().getPlayerList()) {
		if (Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 4) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
	}
	break;
	case 6247: //melee
	case 6248: //range
	case 6250: //magic
	case 6252:
		for(Player p : World.getInstance().getPlayerList()) {
		if (Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 4) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
	}
	break;
	case 6203: //melee
	case 6208: //range
	case 6206: //magic
	case 6204:
		for(Player p : World.getInstance().getPlayerList()) {
		if (Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) <= 4) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
	}
	break;
	case 8350:
		case 8352:
	for(Player p : World.getInstance().getPlayerList()) {	
		this.pid = p.getIndex();
		this.Attacking = true;				
	}
	break;
	case 8454:
	if (UsingThis == true) {
		return;
	}
	for(Player ballenergy : World.getInstance().getPlayerList()) {
			if(Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), ballenergy.getLocation().getX(), ballenergy.getLocation().getY()) <= 1) {
				ballenergy.NpcDialogue().StartTalkingTo(this);
				return;
				
		}
	}
	break;
	case 8127:
	
		for(Player p : World.getInstance().getPlayerList()) {
		if (p.IsAtCorporeal()) {
			this.pid = p.getIndex();
			this.Attacking = true;
		}
		}
		break;
	case 1158:
case 7133:
case 7135:
case 8133:
case 8351:
	case 1160:
	
		for(Player p : World.getInstance().getPlayerList()) {
		if(Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) < 30) {
		if(this.isIsFamiliar() && this.pfollow == p.getIndex()) {
continue;
}
			this.pid = p.getIndex();
			this.Attacking = true;		
		}
		}
	break;
	}
	}
	public void FollowNoAgressive(Player p) {
		if (this.isDead()||this.isDestroyed()) {
			return;
			}
		switch (this.getId()) {
		case 8324:
		case 8325: //melee
		case 8326: //range
		case 8327: //magic
			if (p.IsAtBlackCastle() && !FullEliteBlackEquipped(p)) {
				this.getNpcWalk().followPlayer(p,1);
			}else{
			this.resetAttack();	
			}
		break;
		case 8127: //follow lol no walk
		this.resetAttack();
		break;
		case 8133:
			if (p.IsAtCorporeal())
				this.getNpcWalk().followPlayer(p,1);
			else
			this.resetAttack();
			break;
		case 8350:
		case 8351:
		case 8352:
			if (p.IsAtTormented())
				this.getNpcWalk().followPlayer(p,1);			
			else
			this.resetAttack();	
			break;
		case 6815:
		case 6816:
			this.getNpcWalk().followPlayer(p,1);
		break;
		default:
			if(Misc.getDistance(this.getLocation().getX(), this.getLocation().getY(), p.getLocation().getX(), p.getLocation().getY()) < 16)
				this.getNpcWalk().followPlayer(p,1);	
		else
			this.resetAttack();
		break;
		}
		}
	public void followPlayer(Player p, int Size) {
		if (isIsFamiliar()) {
		if(this.getLocation().getDistance(p.getLocation()) == 1) {
			this.setFollowDelayed(false);
			return;
		}
		if(!this.isFollowDelayed()) {
		this.setFollowDelayed(true);
		return;
		}
		}
		sprite = -1;
		int moveX = 0, moveY = 0;
    	int pX = p.getLocation().getX();
    	int pY = p.getLocation().getY();
    	int nabsX = this.getLocation().getX();
    	int nabsY = this.getLocation().getY();
    	
    	if(pY < nabsY && pX == nabsX) {
    		moveX = 0;
    		moveY = NpcWalk.getMove(nabsY, pY + 1);
	}
	else if(pY > nabsY && pX == nabsX) {
   		moveX = 0;
    		moveY = NpcWalk.getMove(nabsY, pY - 1);
	}
	else if(pX < nabsX && pY == nabsY) {
    		moveX = NpcWalk.getMove(nabsX, pX + 1);
    		moveY = 0;
	}
	else if(pX > nabsX && pY == nabsY) {
    		moveX = NpcWalk.getMove(nabsX, pX - 1);
    		moveY = 0;
	}
		else if(pX < nabsX && pY < nabsY) {
    		moveX = NpcWalk.getMove(nabsX, pX + 1);
    		moveY = NpcWalk.getMove(nabsY, pY + 1);
	}
	else if(pX > nabsX && pY > nabsY) {
    		moveX = NpcWalk.getMove(nabsX, pX - 1);
    		moveY = NpcWalk.getMove(nabsY, pY - 1);
	}
	else if(pX < nabsX && pY > nabsY) {
    		moveX = NpcWalk.getMove(nabsX, pX + 1);
    		moveY = NpcWalk.getMove(nabsY, pY - 1);
	}
	else if(pX > nabsX && pY < nabsY) {
   		moveX = NpcWalk.getMove(nabsX, pX - 1);
   		moveY = NpcWalk.getMove(nabsY, pY + 1);
	}
    	
    	
	/*	if(this.getLocation().getX() > p.getLocation().getX()) {
			moveX = -1;
		} else if(p.getLocation().getX() > this.getLocation().getX()) {
			moveX = 1;
		}
		if(this.getLocation().getY() > p.getLocation().getY()) {
			moveY = -1;
		} else if(p.getLocation().getY() > this.getLocation().getY()) {
			moveY = 1;
		}
		if(moveX == 0 && moveY == 0) {
			moveY = -1;
		}
		if(this.getLocation().getDistance(p.getLocation()) == Math.sqrt(2)) {
			if(moveX == moveY) {
				moveY = 0;
			} else {
				moveX = 0;
			}
		}*/
		int tgtX = this.getLocation().getX() + moveX;
		int tgtY = this.getLocation().getY() + moveY;
		sprite = Misc.direction(this.getLocation().getX(), this.getLocation().getY(), tgtX, tgtY);
		if(sprite != -1) {
			sprite >>= 1;
			this.setLocation(Location.location(tgtX, tgtY, this.getLocation().getZ()));
		}	
	}
	public void giveSlayer() {
	if (isDead()) {
		final Player p = World.getInstance().getPlayerList().get(this.giveDrop);
		if(p.getIndex() == this.giveDrop);
		this.npccanloot = true;
		this.npcDied(p, this.getId());
		this.npcDiedBones(p, this.getId());
		switch (getId()) {
			case 6204:
			case 6208:
			case 6219:
			case 1619:
			case 49:
			case 6203:
			case 6210:
			case 6212:
			case 6218:
			World.getInstance().registerEvent(new Event(200) {
				public void execute() {
				p.godWarsKills[3]++;
				p.getActionSender().sendString(""+p.godWarsKills[3]+"", 601, 9);
				this.stop();
				}
			});
			break;
			default:
			if(p.hasTask == true) {
				if(p.slayerNPC == this.getId()) {
					p.getSlayer().decreaseSlayerAmount();
						}
					}
				}
			}
		}
	public  void tick() {
		try {	
		if (combatDelay > 0) {
			combatDelay--;
		}	
        sprite = -1;
        if (!this.isAttacking() && Math.random() > 0.8 && walkType == WalkType.RANGE) {
            int moveX = (int) (Math.floor((Math.random() * 3)) - 1);
            int moveY = (int) (Math.floor((Math.random() * 3)) - 1);
            int tgtX = this.getLocation().getX() + moveX;
            int tgtY = this.getLocation().getY() + moveY;
            sprite = Misc.direction(this.getLocation().getX(), this.getLocation().getY(), tgtX, tgtY);
            if (tgtX > this.maximumCoords.getX() || tgtX < this.minimumCoords.getX() || tgtY > this.maximumCoords.getY() || tgtY < this.minimumCoords.getY()) {
                sprite = -1;
            }
            if (sprite != -1) {
                sprite >>= 1;
                this.setLocation(Location.location(tgtX, tgtY, this.getLocation().getZ()));
            }
        }
	if (Attacking == true) {
		final Player p = World.getInstance().getPlayerList().get(pid);
		if (p == null) {
			this.resetAttack();
			return;
			}
			GameEngine.nvp.Attack(p, this);
			}else{
			Agressive();
			}
		}catch (Exception e){
			
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int npcid) {
		this.npcswitch(npcid);
		this.id = npcid;
		this.definition = NPCDefinition.forId(npcid);
	}
	public int getSprite() {
		return sprite;
	}
	public NPCDefinition getDefinition() {
		return definition;
	}
	
	public Object readResolve() {
		super.readResolve();
spawnlocation = this.getLocation();
		followIsDelayed = false;
		NpcWalk = new NpcWalk(this);
		definition = NPCDefinition.forId(id);
		updateFlags = new NPCUpdateFlags();
		sprite = -1;
		hp = definition.getHitpoints();
		this.queuedHits = new LinkedList<Hit>();
		this.originalLocation = this.getLocation();
		forceText = null;
		return this;
	}
	public NpcWalk getNpcWalk() {
		return NpcWalk;
	}
	public void processQueuedHits() {
		try {
		if(!updateFlags.isHit1UpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
		if(!updateFlags.isHit2UpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
		} catch(Exception e) {
		}
	}
	
	public NPCUpdateFlags getUpdateFlags() {
		return updateFlags;
	}
	public void setForceText(ForceText forceText) {
		try {
		this.forceText = forceText;
		updateFlags.setForceTextUpdateRequired(true);
		} catch(Exception e) {
		}
	}

	public ForceText getForceText() {
		return forceText;
	}
	public void forceChat(String message) {
		try {
		setForceText(new ForceText(message));
		updateFlags.setForceTextUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	/**
	 * @param minimumCoords the minimumCoords to set
	 */
	public void setMinimumCoords(Location minimumCoords) {
		try {
		this.minimumCoords = minimumCoords;
		} catch(Exception e) {
		}
	}

	/**
	 * @return the minimumCoords
	 */
	public Location getMinimumCoords() {
		return minimumCoords;
	}

	/**
	 * @param walkType the walkType to set
	 */
	public void setWalkType(WalkType walkType) {
		try {
		this.walkType = walkType;
		} catch(Exception e) {
		}
	}

	/**
	 * @return the walkType
	 */
	public WalkType getWalkType() {
		return walkType;
	}

	/**
	 * @param maximumCoords the maximumCoords to set
	 */
	public void setMaximumCoords(Location maximumCoords) {
		try {
		this.maximumCoords = maximumCoords;
		} catch(Exception e) {
		}
	}

	/**
	 * @return the maximumCoords
	 */
	public Location getMaximumCoords() {
		return maximumCoords;
	}

	public void heal(int amount) {
		try {
		this.hp += amount;
		if(hp >= this.getDefinition().getHitpoints()) {
			hp = this.getDefinition().getHitpoints();
		}
		} catch(Exception e) {
		}
	}
	
	public void hit(int damage) {
		try {
		if(damage == 0) {
			hit(damage, Hits.HitType.NO_DAMAGE);
		} else {
			hit(damage, Hits.HitType.NORMAL_DAMAGE);
		}
		} catch(Exception e) {
		}
	}
	
	public void hit(int damage, Hits.HitType type) {
		try {
		if(damage > hp) {
			damage = hp;
		}
		if(!updateFlags.isHit1UpdateRequired()) {
			getHits().setHit1(new Hit(damage, type));
			updateFlags.setHit1UpdateRequired(true);
		} else {
			if(!updateFlags.isHit2UpdateRequired()) {
				getHits().setHit2(new Hit(damage, type));
				updateFlags.setHit2UpdateRequired(true);
			} else {
				queuedHits.add(new Hit(damage, type));
			}
		}
		hp -= damage;
		if(hp <= 0) {
			hp = 0;
			if(!this.isDead()) {
				World.getInstance().registerEvent(new DeathEvent(this));
			}
			this.setDead(true);
		}
		} catch(Exception e) {
		}
	}

	@Override
	public void turnTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
	}

	public void delete(Entity entity) {
	entity.setHidden(true);
	}
	@Override
	public void turnTemporarilyTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
		this.getUpdateFlags().setClearFaceTo(true);
	}

	@Override
	public void resetTurnTo() {
		this.getUpdateFlags().setFaceToUpdateRequired(true, 0);
	}

	public void graphics(int id) {
		try {
		graphics(id, 0);
		} catch(Exception e) {
		}
	}
	public void graphics(int id, int delay) {
		try {
		this.setLastGraphics(new Graphics(id, delay));
		updateFlags.setGraphicsUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	public void npcswitch(int id) {
		try {
		this.setLastNpcSwitch(new NpcSwitch(id));
		updateFlags.setNpcSwitchUpdateRequired(true);
		} catch(Exception e) {
		}
	}
	
	public void animate(int id) {
		try {
		animate(id, 0);
		} catch(Exception e) {
		}
	}
	public void resetAttack() {
		try {
	this.Attacking = false;
	this.pid = 0;
	resetTurnTo();
		} catch(Exception e) {
		}
}	
	public void animate(int id, int delay) {
		try {
		this.setLastAnimation(new Animation(id, delay));
		updateFlags.setAnimationUpdateRequired(true);
		} catch(Exception e) {
		}
	}

	public int getHitpoints() {
		return hp;
	}

	public int getAttackAnimation() {
		return this.getDefinition().getAttackAnimation();
	}

	public int getAttackSpeed() {
		return this.getDefinition().getAttackSpeed();
	}

	public int getDefenceAnimation() {
		return this.getDefinition().getDefenceAnimation();
	}

	public boolean isAnimating() {
		return this.getUpdateFlags().isAnimationUpdateRequired();
	}

	public boolean isDestroyed() {
		return !World.getInstance().getNpcList().contains(this);
	}

	public int getDeathAnimation() {
		return this.getDefinition().getDeathAnimation();
	}
	
	public Location getOriginalLocation() {
		return this.originalLocation;
	}

	public int getHp() {
		return hp;
	}

	public int getMaxHp() {
		return this.definition.getHitpoints();
	}

	public void setHp(int val) {
		try {
		hp = val;
		} catch(Exception e) {
		}
	}


    @Override
    public void dropLoot() {
    }
    @Override
    public void dropLoot2() {
    }

	public boolean isAutoRetaliating() {
		return this.definition.getHitpoints() > 0;
	}
	@Override
	public CombatType getCombatType() {
		return CombatType.MELEE;
	}
	@Override
	public int getMaxHit() {
		return this.getDefinition().getMaxHit();
	}
	public int getDrawBackGraphics() {
		return 18; // TODO atm bronze arrow
	}

	public int getProjectileId() {
		return 10; // TODO atm bronze(?) arrow
	}

	public boolean hasAmmo() {
		return true;
	}
	public void setIsFamiliar(boolean isFamiliar) {
		IsFamiliar = isFamiliar;
	}
	public boolean isIsFamiliar() {
		return IsFamiliar;
	}
	
}