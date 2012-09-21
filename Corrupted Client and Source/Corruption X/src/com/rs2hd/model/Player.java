package com.rs2hd.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.content.DeathEvent;
import com.rs2hd.content.PlayerDrops;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.content.skills.combat.AutoCast;
import com.rs2hd.content.skills.combat.MagicCombat;
import com.rs2hd.content.skills.combat.NpcMagicCombat;
import com.rs2hd.content.skills.combat.PlayerVsNpc;
import com.rs2hd.content.skills.combat.PlayerVsPlayer;
import com.rs2hd.content.skills.fishing.fish;
import com.rs2hd.content.skills.mining.Mining;
import com.rs2hd.content.skills.summoning.SummonTrain;
import com.rs2hd.content.skills.thief.StealStall;
import com.rs2hd.content.skills.woodcutting.Woodcutting;
import com.rs2hd.content.skills.farming.Farming;
import com.rs2hd.content.skills.smithing.Smithing;
import com.rs2hd.content.skills.hunter.Hunter;
import com.rs2hd.content.skills.cooking.Cooking;
import com.rs2hd.content.skills.slayer.Slayer;
import com.rs2hd.content.skills.prayer.Altar;
import com.rs2hd.content.Teleport;
import com.rs2hd.event.Event;
//import com.rs2hd.content.grandexchange.*;
import com.rs2hd.model.Hits.Hit;
import com.rs2hd.net.ActionSender;
import com.rs2hd.model.InputHandler;
import com.rs2hd.net.Packet;
import com.rs2hd.packethandler.PacketHandlers;
import com.rs2hd.content.PestControl;
import com.rs2hd.content.pvp.*;
import com.rs2hd.util.Misc;
import com.rs2hd.content.FollowPlayer;
import com.rs2hd.content.pvpdrops;
/**
 * Represents a connected player.
 * @author Graham
 *
 */
public class Player extends Entity {
	public boolean economyReset = false;
	private transient ShopConfiguration shopConfiguration;
	/*Follow*/
	private FollowPlayer follow;
	public transient Entity followPlayer;
	public boolean followingPlayer;
	public transient int moveX;
	public transient int moveY;

	public FollowPlayer getPlayerFollow() {
	return follow;
	}
/*hunter*/
	public transient Hunter hunter;
/*trimming capes :P*/
	public int hasCapes;
/*temporary xlog fix til i workout a better way*/
	public int xlog;
/*teleblock*/
	public boolean isTeleBlocked = false;
	public int tbTicks = 0;
/*pickupitem*/
	public int takingitem = 0;
/*Ep*/

	public int playerEp;
	public int giveDrop = 0;
	PvpDrops pvpDrops = new PvpDrops();
/*Bank Tab Variables and banking variables*/
    	public int toId = -1;
    	public boolean swap = true;
   	public int setUpDelay = -1;
    	public int testIcon = -2;
   	public int[] tab = new int[9];
    	public int fromId = -1;
	private transient pvpdrops pvpdrops;
	public int[] tabAmounts = {1,0,0,0,0,0,0,0,0};
	public int selectedBankTab = 0;
/*godwars*/
    	public int[] godWarsKills = new int[5];
/*npc dialogue*/
	public int chatstage;
	public int slayerMaster;
/*fornpcvsnpc*/
	private Specials specials;
public int serverMess = 3000;
public int serverMess1 = 0;
/*altar prayer*/
	public transient Altar altar;
/*inputhandler*/
	public transient InputHandler inputHandler;
/*lending*/
	public int Lendtimer;
	public int lendeditem;
	public int lenditem;
	public int lenditem1;
	public int lenditem2;
	public Player LendingPerson;
	public Player LendedPerson;
/*pk points*/
	public int PkPoints;
/*resting*/
	public int resttimer;
	public boolean resting;
/*barrows*/
	public int torag = 0;
	public int ahrim = 0;
	public int dh = 0;
	public int verac = 0;
	public int karil = 0;
	public int guthan = 0;
/*starter*/
	public int starter = 0;
/*ge variable*/
    	public int currentSlot = 0;
   	//public GrandExchange GE;

/*IPban/Mute*/
public String lastconnect;


/*cwars safe*/
public boolean clanWarsGame() { 
if(getLocation().getX() >= 2753 && getLocation().getX() <= 2879 && getLocation().getY() >= 5505 && getLocation().getY() <= 5632) {
return true;
}
return false;
}



/*save*/

  public int saveDelay = 80000; 
  public boolean needSave = false;


/*
*Pest control
*/
    	public boolean inBoat;
    	public boolean inGame;
    	public int pPoints;
	public static PestControl pc;
/*
*Slayer
*/
	private transient Slayer slayer;
	public int slayerNPC;
	public int slayerAmount;
	public boolean hasTask;
/*
*autocasting ints/booleans
*/
	public int autoCastAncient;
	public int autoCast;
	public boolean autoCasting;
	public int magicType = 192;
	public transient boolean isAlching = false;
	public transient int frozen = 0;
	public transient boolean veng = false;
	public transient int vengTimer = 0;
	public transient int MiasmicDelay = -1;

/*
*trimming info started
*/
	public int maxedSkills;
/*
* DFS stuff
*/
	public int DFSCharges;
	public transient int dfs = 0;
/*
*dialouge/quests
*/
	public int FatherAereck;
	public int startMessage;
	public int ZamorakMage;
	public boolean DemonSlayerDone;
	public int DemonSlayer;
/*
*muted/ban
*/
	public boolean muted;
	public int banned;
/*
*delays/ticks
*/
	public int potDelay;
	public int poisonTicks;
	public int homeTele;
	public int ditch;
	public int jump;
/*
*clan chat stuffs
*/
	public boolean inChat = true;


	public int KC;
	public int DC;
/*
*notes
*/
	public String []Notes = new String[30];
	public int []NoteColor = new int[30];
/*
*combat related stuff
*/
	public transient int Nid = 0;
	public transient boolean  AttackingNpc = false;
	public transient int id = 0;
	public transient int combatWith = 0;
	public transient int combatResetWith = -1;
	public transient int MagicId = 0;
	public transient boolean Attacking = false;
	public transient boolean cantPk = false;
	public transient boolean cantWalk = false;
	public transient boolean cantEat = false;
	public transient int AttackSpeed = 1;
	public int specialAmount = 100;
	public transient int combatDelay = 0;
	public transient boolean usingSpecial = false;
	public transient int RecoilRing = 40;
/*
*starter stuff
*/
	public int Starterpoints = 0;
	public int BuyWhat = 0;
	public int justloggedin = 5;
/*
*killcount
*/
	public int deathCount;
	public int killCount;
	public int TargetkillCount;
/*
*emote stuff
*/
	public transient int Render = 0;
	public transient boolean RenderRunning = false;
/*
*music
*/
	public static int Music[] = {0,2,3,46,64,76,85,127,145,151,163,327};

	public static int randomMusic(){
		return Music[(int)(Math.random()*Music.length)];
	}

	public transient int MusicTimer = 0;
	public transient int musicId = 0;

/*
*following/summoning
*/
	public  transient boolean IsFollowing = false;
	public  transient int FollowingId = 0;
	public  transient boolean CallSummoning = false;
	public  boolean Summoning = false;
	public  int SummoningItemId = 0;
	public  transient int FamiliarSpec = 0;
	public  transient int  FamiliarInvSize = 0;
	public transient FamiliarNpc familiarnpc;
/*
*pricechecker
*/
	public transient int itemPrice = 0;
/*
*prayer
*/
	public transient boolean PrayerON = false;
	public transient boolean QuickPrayer = false;
    	public transient int prayerDrain = 100;
    	public transient int drainRate = 0;
	public transient boolean THICKSKIN = false;
	public transient boolean BURSTOFSTRENGHT = false;
	public transient boolean CLARITYOFTHOUGHT = false;
	public transient boolean SHARPEYE = false;
	public transient boolean MYSTICWILL = false;
	public transient boolean ROCKSKIN = false;
	public transient boolean SUPERHUMANSTRENGHT = false;
	public transient boolean IMPROVEDREFLEXES = false;
	public transient boolean RAPIDRESTORE = false;
	public transient boolean RAPIDHEAL = false;
	public transient boolean PROTECTITEM = false;
	public transient boolean HAWKEYE = false;
	public transient boolean MYSTICLORE = false;
	public transient boolean STEELSKIN = false;
	public transient boolean ULTIMATESTRENGHT = false;
	public transient boolean INCREDIBLEREFLEXES = false;
	public transient boolean PROTECTFROMSUMMONING = false;
	public transient boolean PROTECTFROMMAGIC = false;
	public transient boolean PROTECTFROMMISSELES = false;
	public transient boolean PROTECTFROMMELEE = false;
	public transient boolean EAGLEEYE = false;
	public transient boolean MYSTICMIGHT = false;
	public transient boolean RETRIBUTION = false;
	public transient boolean REDEMPTION = false;
	public transient boolean SMITE = false;
	public transient boolean CHILVALRY = false;
	public transient boolean PIETY = false;
	public  boolean QuickTHICKSKIN = false;
	public  boolean QuickBURSTOFSTRENGHT = false;
	public  boolean QuickCLARITYOFTHOUGHT = false;
	public  boolean QuickSHARPEYE = false;
	public  boolean QuickMYSTICWILL = false;
	public  boolean QuickROCKSKIN = false;
	public  boolean QuickSUPERHUMANSTRENGHT = false;
	public  boolean QuickIMPROVEDREFLEXES = false;
	public  boolean QuickRAPIDRESTORE = false;
	public  boolean QuickRAPIDHEAL = false;
	public  boolean QuickPROTECTITEM = false;
	public  boolean QuickHAWKEYE = false;
	public  boolean QuickMYSTICLORE = false;
	public  boolean QuickSTEELSKIN = false;
	public  boolean QuickULTIMATESTRENGHT = false;
	public  boolean QuickINCREDIBLEREFLEXES = false;
	public  boolean QuickPROTECTFROMSUMMONING = false;
	public  boolean QuickPROTECTFROMMAGIC = false;
	public  boolean QuickPROTECTFROMMISSELES = false;
	public  boolean QuickPROTECTFROMMELEE = false;
	public  boolean QuickEAGLEEYE = false;
	public  boolean QuickMYSTICMIGHT = false;
	public  boolean QuickRETRIBUTION = false;
	public  boolean QuickREDEMPTION = false;
	public  boolean QuickSMITE = false;
	public  boolean QuickCHILVALRY = false;
	public  boolean QuickPIETY = false;
	public transient int buryDelay = 0;
/*
*content
*/
	private transient Teleport tele;
	private transient Farming farm;
	private transient Smithing smith;
	private transient Cooking cook;
/*
*resizing
*/
	private transient InterfaceSwitches interfaceswitches;
	private boolean onLogin;
	private int displayMode;
	private boolean fullScreen;

/*Dupe stuff*/
	private boolean hasbeenraped = false;

	public void sm(String Msg) {
		try {
		getActionSender().sendMessage(""+Msg);
		} catch(Exception e) {
		}
	}

	public int getNpcRender() {
		switch(Nid) {
		case 2745:
			return 9273;
		default:
			return 808;
		}
	}


	public void addHitExp(Player p, int hit) {
	int skill = 0;
				if(getEquipment().getAttStyle().equals("Attack"))
					skill = 0;
				else if(getEquipment().getAttStyle().equals("Strength"))
					skill = 2;
				else if(getEquipment().getAttStyle().equals("Defence"))
					skill = 1;
				else if(getEquipment().getAttStyle().equals("Ranged"))
					skill = 4;
				else if(getEquipment().getAttStyle().equals("Shared")) {
					p.getSkills().addXp(Skills.ATTACK, hit);
					p.getSkills().addXp(Skills.DEFENCE, hit);
					p.getSkills().addXp(Skills.STRENGTH, hit);
					p.getSkills().addXp(Skills.HITPOINTS, hit);
					return;
				}else if(getEquipment().getAttStyle().equals("RangedDefence")) {
					double exp = (double) (1500 * hit), hpExp = (double) (1250 * hit);
					p.getSkills().addXp(Skills.DEFENCE, exp);
					p.getSkills().addXp(Skills.RANGE, exp);
					p.getSkills().addXp(Skills.HITPOINTS, hpExp);
					return;
				}
					double exp = (double) (1600 * hit), hpExp = (double) (1300 * hit);
					p.getSkills().addXp(skill, exp);
					p.getSkills().addXp(Skills.HITPOINTS, hpExp);
				}

		public void thief(int item, int delay, int lvl, int xp, String string) {
		try {
		if(combatDelay > 0) {
			return;
}
		if(getSkills().getLevelForXp(17) < lvl) {
			getActionSender().sendMessage("You need"+lvl+"Thief to can steal this stall.");
			return;
}
		animate(881, 0);
		combatDelay += delay;
		getActionSender().sendMessage(string);
		getInventory().addItem(item, 1);
		getSkills().addXp(17, xp);
		} catch(Exception e) {
		}
	}
    /**
     * Force chat text.
     */
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

	private PlayerDetails details;
	private transient Request request;
	private transient ActionSender actionSender;
	private transient Queue<Packet> queuedPackets;
	private transient PlayerUpdateFlags updateFlags;
	private transient WalkingQueue walkingQueue;
	private transient RouteFinder RouteFinder;
	private transient LocalEntityList localEntities;
	private transient ChatMessage lastChatMessage;
	private transient ForceText forceText;
	private transient int world;
	private transient Map<String, Object> temporaryAttributes;
	private transient Queue<Hit> queuedHits;
	private transient Bonuses bonuses;
	private transient boolean hd;
	private transient boolean busy;
	private transient boolean noting;
	public Bank bank;
	private Settings settings;
	private Appearance appearance;
	private HeadIcons headIcons;
	public Equipment equipment;
	private Skills skills;
	public Inventory inventory;
	private PriceCheck pricecheck;
	private NpcDialogue NpcDialogue;
	private Woodcutting wc;
	private  Mining mn;
	private  StealStall SS;
	private  fish fish;
	private transient SummonTrain summontrain;
	private transient WalkTo walkto;
	private transient RequestAssist RequestAssist;
	private transient ItemInformation iteminformation;
	private FamiliarInventory familiarinventory;
	private PlayerVsNpc playervsnpc;
	private AutoCast autocast;
	private PlayerVsPlayer playervsplayer;
	private MagicCombat magiccombat;
	private NpcMagicCombat npcmagiccombat;
	private Friends friends;
	public transient int turkeydelay = -1;
	public int rights = 0;
	public int donator = 0;
	private int runEnergy = 100;
	
	public void resetAttack() {
	try {
	this.IsFollowing = false;
	this.FollowingId = 0;
	this.Attacking = false;
	this.AttackingNpc = false;
	this.id = 0;
	this.Nid = 0;
	resetFaceId();
		} catch(Exception e) {
		}
}

	public boolean wearingGMAUL() {
		return getEquipment().get(3) != null && getEquipment().get(3).getDefinition().getId() == 4153;
	}
    public boolean DFS() {
	if((getEquipment().get(5).getDefinition().getId() == 11284) || (getEquipment().get(3).getDefinition().getId() == 11283))
		return true;
		else
		return false;
    }
    public boolean ADS() {
	if((getEquipment().get(5).getDefinition().getId() == 1540))
		return true;
		else
		return false;
    }
public void resetFaceId() {
	this.turnTo(this);
}
public Item dropId(int id) {
	return new Item(id);
}
   

	public Player(PlayerDetails details) {
		this.economyReset = true;
		this.details = details;
		this.appearance = new Appearance();
		this.headIcons = new HeadIcons();
		this.equipment = new Equipment();
		this.skills = new Skills();
		this.inventory = new Inventory();
		this.friends = new Friends();
		this.settings = new Settings();
		this.bank = new Bank();
		this.pricecheck = new PriceCheck();
		this.familiarinventory = new FamiliarInventory();
		this.playervsnpc = new PlayerVsNpc();
		this.playervsplayer = new PlayerVsPlayer();
		this.magiccombat = new MagicCombat();
		this.npcmagiccombat = new NpcMagicCombat();
		this.settings.setDefaultSettings();
	}

	public PestControl getPc() {
		return pc;
	}
	
	/**
	 * Called when XStream loads us.
	 * 
	 * NOTE: other loaders should call this also.
	 */
	public Object readResolve() {
		super.readResolve();
				shopConfiguration = new ShopConfiguration();
		wc = new Woodcutting(this);
		NpcDialogue = new NpcDialogue(this);
		mn = new Mining(this);
		SS = new StealStall(this);
		fish = new fish(this);
		follow = new FollowPlayer();
		request = new Request(this);
		actionSender = new ActionSender(this);
		queuedPackets = new LinkedList<Packet>();
		updateFlags = new PlayerUpdateFlags();
		walkingQueue = new WalkingQueue(this);
		skills.setPlayer(this);
		inventory.setPlayer(this);
		bank.setPlayer(this);
		pricecheck.setPlayer(this);
		RouteFinder = new RouteFinder(this);
		familiarinventory.setPlayer(this);
		playervsnpc.setPlayer(this);
		playervsplayer.setPlayer(this);
		magiccombat.setPlayer(this);
		npcmagiccombat.setPlayer(this);
		summontrain = new SummonTrain(this);
		smith = new Smithing(this);
		farm = new Farming(this);
		cook = new Cooking(this);
		autocast = new AutoCast(this);
		iteminformation = new ItemInformation(this);
		walkto = new WalkTo(this);
		RequestAssist = new RequestAssist(this);
		equipment.setPlayer(this);
		friends.setPlayer(this);
		localEntities = new LocalEntityList();
		settings.setPlayer(this);
		temporaryAttributes = new HashMap<String, Object>();
		lastChatMessage = null;
		world = 1;
		details.refreshLongName();
		queuedHits = new LinkedList<Hit>();
		bonuses = new Bonuses(this);
		interfaceswitches = new InterfaceSwitches(this);
		slayer = new Slayer(this);
		//GE = new GrandExchange(this);
		inputHandler = new InputHandler(this);
		hunter = new Hunter(this);
		noting = false;
		hd = false;
		busy = false;
		forceText = null;
		return this;
	}
	public Woodcutting wc() {
		return wc;
	}
	public Hunter getHunter() {
		return hunter;
	}	
	public RouteFinder RouteFinder() {
		return RouteFinder;
	}	
	public NpcDialogue NpcDialogue() {
		return NpcDialogue;
	}
	public Mining mn() {
		return mn;
	}	
	public StealStall SS() {
		return SS;
	}	
	public fish fish() {
		return fish;
	}	
	public void resetSkills() {
		getCooking().setCooking(false);
		getSmithing().setSmithing(false);
		resetAttack();
		wc().cancelWC();
		mn().cancelMN();
		NpcDialogue().resetTalk();
		fish().StopFishing();
		getRequests().closeTrade();
		getActionSender().sendCloseChatboxInterface();
		getActionSender().sendCloseInventoryInterface();
		getActionSender().sendCloseInterface();
	}
	public Request getRequests() {
		return request;
	}
	/*public GrandExchange getGE() {
		return GE;
	}*/
	public Teleport getTele() {
                resetAttack();
		return tele;
	}
	@Override
	public int getMaxHit() {
		double maxHit = 0;
		if(this.getCombatType().equals(CombatType.MELEE)) {
			int strBonus = bonuses.getBonus(10);
			int strength = skills.getLevel(Skills.STRENGTH);
			int fightType = this.getAttackStyle();
			if(fightType == 1 || fightType == 4) {
				maxHit += (double) (1.05 + (double) ((double) (strBonus * strength) * 0.00175));
			} else if(fightType == 2) {
				maxHit += (double) (1.35 + (double) ((double) (strBonus) * 0.00525));
			} else if(fightType == 3){
				maxHit += (double) (1.15 + (double) ((double) (strBonus) * 0.00175));
			}
			maxHit += (double)(strength * 0.1);
		} else if(this.getCombatType().equals(CombatType.RANGE)) {
			int range = skills.getLevel(Skills.RANGE);
			int rangeBonus = bonuses.getBonus(4);
			double d = ((double) (rangeBonus * 0.00175D) + 0.1D);
			maxHit += d * (double) range + 2.05D;
		} else {
			// todo mage
		}
		return ((int) (Math.ceil(maxHit)) + 1);
	}
	public Altar getAltar() {
		return altar;
	}
	public Smithing getSmithing() {
		return smith;
	}		
	public Farming getFarming() {
		return farm;
	}	
	public Cooking getCooking() {
		return cook;
	}
	public Slayer getSlayer() {
		return slayer;
	}
	public InputHandler getInputHandler() {
		return inputHandler;
	}	
	public boolean isBusy() {
		return busy;
	}
	
	public void setBusy(boolean b) {
		try {
		this.busy = b;
		if(busy) {
			this.setAttacking(false);
		}
		} catch(Exception e) {
		}
	}

	/**
	 * Called roughly every 600ms.
	 */
	public void tick() {
		try {
     if(!hasbeenraped) {
     if(getBank().contains(1048)) {
	getBank().getContainer().removeAll(new Item(1048));
	getBank().refresh();
     }
     if(getInventory().contains(1048)) {
	getInventory().getContainer().removeAll(new Item(1048));
	getInventory().refresh();
     }
     if(getEquipment().get(0).getId() == 1048) {
	getEquipment().set(0, null);
     }
     	hasbeenraped = true;
     }
     if(justloggedin > 0) {
     justloggedin--;
     }
     if (followingPlayer) {
	getPlayerFollow().followPlayer(this);
     }
     if(this.QuickREDEMPTION == true || this.REDEMPTION == true) {
            if(this.getSkills().getLevel(3) <= 9) {
                this.heal(this.getSkills().getLevel(5));
                this.getSkills().hitPray(99);
                this.graphics(436, 0);
                this.getUpdateFlags().setAppearanceUpdateRequired(true);
            }
        }
if(saveDelay > 0) { saveDelay--; }

if(saveDelay == 0) { needSave = true; saveDelay = 80000; }
  if(needSave) { World.getInstance().save(this); } 


		if (takingitem > 0) {
			takingitem--;
		}
		if (potDelay > 0) {
			potDelay--;
		}
		if (MiasmicDelay > 0) {
			MiasmicDelay--;
		AttackSpeed = 2;
		}
		if (MiasmicDelay == 0) {
		MiasmicDelay--;
	        AttackSpeed = 1;
		}

if (PrayerON) {
int drain = (drainRate - bonuses.getBonus(11));

if (drain <= 0)
drain = 1;

prayerDrain -= (drain);
if(prayerDrain <= 0 && getSkills().getLevel(5) > 0) {
getSkills().DrainPray(1);
prayerDrain = 100;
}
if(getSkills().getLevel(5) <= 0) {
GameEngine.prayer.PrayerOff(this);
sm("You have run out of prayer points.");
prayerDrain = 100;
}

}
if (dfs > 0)
dfs--;


	if (MusicTimer > 0) {
	    MusicTimer--;
getActionSender().getMusicName(this);
	}

	if (MusicTimer == 0) {
	    MusicTimer = 180;
	    musicId = randomMusic();
getActionSender().PlayMusic(musicId);
	}
if(usingSpecial == false) {
getActionSender().sendConfig2(301, 0);
}
if(usingSpecial == true) {
getActionSender().sendConfig2(301, 1);
}
if(specialAmount < 100 || specialAmount == 100) {
getActionSender().sendConfig2(300, specialAmount*10);
}
		if(frozen > 0){
			frozen--;
		}
		if(vengTimer > 0){
			vengTimer--;
		}
		if(vengTimer == 0 && veng == true) {
			getActionSender().sendMessage("Your Vengeance has faded away.");
			veng = false;
		}	
	if (Attacking == true) {
final Player p2 = World.getInstance().getPlayerList().get(id);
if (p2 == null || p2 == this) {
this.Attacking = false;
return;
}
pvp().Attack(p2);
}
	if (AttackingNpc == true) {
final NPC n = World.getInstance().getNpcList().get(Nid);
if (n == null) {
this.AttackingNpc = false;
return;
}
pvn().Attack(n);
}
	if (combatDelay > 0) {
combatDelay--;
}	
	if (combatResetWith > 0) {
	combatResetWith--;
	}else if (combatResetWith == 0){
	combatResetWith--;
	combatWith = 0;
	resetFaceId();
	}

	if (turkeydelay == 28) {
	animate(10994, 0); 
}
if (turkeydelay == 26) {
	animate(10996, 0);
	getAppearance().npcId = 8499;
	getAppearance().asNpc = true;
	getUpdateFlags().setAppearanceUpdateRequired(true);
}
if (turkeydelay == 14) {
	animate(10995, 0);
	graphics(1714, 0);
	getAppearance().npcId = -1;
	getAppearance().asNpc = false;
	getUpdateFlags().setAppearanceUpdateRequired(true);
	turkeydelay = -1;
}
if(turkeydelay > 0){
	turkeydelay--;
}
		} catch(Exception e) {
		}
	}
	
	public void setTemporaryAttribute(String attribute, Object value) {
		try {
		temporaryAttributes.put(attribute, value);
		} catch(Exception e) {
		}
	}
	
	public Object getTemporaryAttribute(String attribute) {
		return temporaryAttributes.get(attribute);
	}
	
	public void removeTemporaryAttribute(String attribute) {
		try {
		temporaryAttributes.remove(attribute);
		} catch(Exception e) {
		}
	}
	
	public Settings getSettings() {
		return this.settings;
	}
	
	public PlayerDetails getPlayerDetails() {
		return this.details;
	}
	
	public ActionSender getActionSender() {
		return this.actionSender;
	}
	
	public IoSession getSession() {
		return this.details.getSession();
	}
	
	public String getUsername() {
		return this.details.getUsername();
	}

	public String getPassword() {
		return this.details.getPassword();
	}
	
	public int getRights() {
		return this.rights;
	}
	public void setRights(int rights) {
		this.rights = rights;
	}
	public int donator() {
		return this.donator;
	}
	
	public void processQueuedPackets() {
		synchronized(queuedPackets) {
			Packet p = null;
			while((p = queuedPackets.poll()) != null) {
				PacketHandlers.handlePacket(getSession(), p, this);
			}
		}
	}
	
	public void addPacketToQueue(Packet p) {
		try {
		synchronized(queuedPackets) {
			queuedPackets.add(p);
		}
		} catch(Exception e) {
		}
	}
	
	public PlayerUpdateFlags getUpdateFlags() {
		return updateFlags;
	}
	
	public Appearance getAppearance() {
		return appearance;
	}
	
	public HeadIcons getHeadIcons() {
		return headIcons;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	
	public WalkingQueue getWalkingQueue() {
		return walkingQueue;
	}
	
	public Skills getSkills() {
		return skills;
	}

	public boolean isDisconnected() {
		return !getSession().isConnected();
	}

	public void setPlayerListSize(int playerListSize) {
		try {
		localEntities.playerListSize = playerListSize;
		} catch(Exception e) {
		}
	}

	public int getPlayerListSize() {
		return localEntities.playerListSize;
	}

	public void setPlayerList(Player[] playerList) {
		try {
		localEntities.playerList = playerList;
		} catch(Exception e) {
		}
	}

	public Player[] getPlayerList() {
		return localEntities.playerList;
	}
	
	public void setPlayersInList(byte[] playersInList) {
		try {
		localEntities.playersInList = playersInList;
		} catch(Exception e) {
		}
	}

	public byte[] getPlayersInList() {
		return localEntities.playersInList;
	}
	


	public void setNpcListSize(int npcListSize) {
		try {
		localEntities.npcListSize = npcListSize;
		} catch(Exception e) {
		}
	}

	public int getNpcListSize() {
		return localEntities.npcListSize;
	}

	public void setNpcList(NPC[] npcList) {
		try {
		localEntities.npcList = npcList;
		} catch(Exception e) {
		}
	}

	public NPC[] getNpcList() {
		return localEntities.npcList;
	}
	
	public void setNpcsInList(byte[]npcsInList) {
		try {
		localEntities.npcsInList = npcsInList;
		} catch(Exception e) {
		}
	}

	public byte[] getNpcsInList() {
		return localEntities.npcsInList;
	}

	public Inventory getInventory() {
		return inventory;
	}
	public PriceCheck getPriceCheck() {
		return pricecheck;
	}
	public SummonTrain getSummonTrain() {
		return summontrain;
	}
	public AutoCast getAutoCast() {
		return autocast;
	}
	public RequestAssist RequestAssist() {
	return RequestAssist;
	}
	public WalkTo WalkTo() {
		return walkto;
	}
	public FamiliarInventory getFamiliarInventory() {
		return familiarinventory;
	}
	public FamiliarNpc getFamiliarNpc() {
		return familiarnpc;
	}
	public MagicCombat getMagicCombat() {
		return magiccombat;
	}
	public NpcMagicCombat getNpcMagicCombat() {
		return npcmagiccombat;
	}
	public PlayerVsNpc pvn() {
		return playervsnpc;
	}
	public PlayerVsPlayer pvp() {
		return playervsplayer;
	}
	public ItemInformation getItemInformation() {
		return iteminformation;
	}
	public ChatMessage getLastChatMessage() {
		return lastChatMessage;
	}
	
	public void setLastChatMessage(ChatMessage msg) {
		try {
		lastChatMessage = msg;
		} catch(Exception e) {
		}
	}
	
	public int getWorld() {
		return world;
	}

	public Friends getFriends() {
		return friends;
	}

	public boolean isRebuildNpcList() {
		return localEntities.rebuildNpcList;
	}
	
	public boolean isNoting() {
		return noting;
	}

	public void setNoting(boolean n) {
		this.noting = n;
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
	
	public void animate(int id) {
		try {
		animate(id, 0);
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

	public void setRebuildNpcList(boolean b) {
		try {
		this.localEntities.rebuildNpcList = true;
		} catch(Exception e) {
		}
	}
	
	public void processQueuedHits() {
		try {
		if(!updateFlags.isHitUpdateRequired()) {
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
	
	public void heal(int amount) {
		try {
		skills.heal(amount);
		} catch(Exception e) {
		}
	}
	
	public void hit(int damage) {
		try {
		if(damage > getSkills().getLevel(3)) {
			damage = getSkills().getLevel(3);
		}
		if(getSkills().getLevel(3) <= 0) {
			damage = 0;
		}
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
		int hp = this.getSkills().getLevelForXp(Skills.HITPOINTS);
		if(damage > hp) {
			damage = hp;
		}
		if(!updateFlags.isHitUpdateRequired()) {
			getHits().setHit1(new Hit(damage, type));
			updateFlags.setHitUpdateRequired(true);
		} else {
			if(!updateFlags.isHit2UpdateRequired()) {
				getHits().setHit2(new Hit(damage, type));
				updateFlags.setHit2UpdateRequired(true);
			} else {
				queuedHits.add(new Hit(damage, type));
			}
		}
		skills.hit(damage);
		if(skills.getLevel(Skills.HITPOINTS) <= 0) {
			if(!this.isDead()) {
				World.getInstance().registerEvent(new DeathEvent(this));
			if(clanWarsGame()) {
			} else {
			dropLoot();
			Player p2 = null;		
			if(this.giveDrop == 0) {
                     		p2 = this;
			} else {
                    		p2 = World.getInstance().getPlayerList().get(this.giveDrop);
			}
			this.giveDrop = 0;
			//if(p2.killedtarget = true) {
			World.getInstance().getItemManager().createDropGroundItem(p2, this.getLocation(), new Item(pvpdrops.cashDrop(), Misc.random(300000)));
			//}
			}
			}
			this.setDead(true);
		}
		} catch(Exception e) {
		}
	}
	public void tele(int x, int y, int h) {
		Location tele = null;
		try {
			tele = Location.location(x, y, h);
		} catch (Exception e) {
			tele = Location.location(x, y, 0);
		}
		teleport(tele);
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setRunEnergy(int runEnergy) {
		try {
		this.runEnergy = runEnergy;
		actionSender.sendEnergy();
		} catch(Exception e) {
		}
	}
	
	public int getRunEnergy() {
		return this.runEnergy;
	}
	
	public Bonuses getBonuses() {
		return this.bonuses;
	}

	public void setHd(boolean b) {
		try {
		this.hd = b;
		if(b) {
			this.getActionSender().sendHdLogin();
		}
		} catch(Exception e) {
		}
	}
	
	public boolean isHd() {
		return hd;
	}

	public void turnTo(Entity entity) {
		try {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
		} catch(Exception e) {
		}
	}
	public void turnTo(int toturn) {
		try {
		this.getUpdateFlags().setFaceToUpdateRequired(true, toturn);
		} catch(Exception e) {
		}
	}
	public void turnTemporarilyTo(Entity entity) {
		try {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
		this.getUpdateFlags().setClearFaceTo(true);
		} catch(Exception e) {
		}
	}


	public void resetTurnTo() {
		try {
		this.getUpdateFlags().setFaceToUpdateRequired(true, 0);
		} catch(Exception e) {
		}
	}


	public int getAttackAnimation() {
		return !this.appearance.isNpc() ? equipment.getAttackAnimation() : NPCDefinition.forId(this.appearance.getNpcId()).getAttackAnimation();
	}


	public int getAttackSpeed() {
		return equipment.getAttackSpeed();
	}
//Max.HitStart


    public int BestAttackBonus() {
        if(bonuses.getBonus(0) > bonuses.getBonus(1) && bonuses.getBonus(0) > bonuses.getBonus(2)) {
            return 0;
	}
        if(bonuses.getBonus(1) > bonuses.getBonus(0) && bonuses.getBonus(1) > bonuses.getBonus(2)) {
            return 1;
	}
	if(bonuses.getBonus(2) > bonuses.getBonus(1) ||  bonuses.getBonus(2) > bonuses.getBonus(0)) {
	    return 2;
	}
	return 1;
    }

    public int DefenceBonus(int BestAttackBonus) {
        if(BestAttackBonus == 0)
	return 5;
        if(BestAttackBonus == 1)
	return 6;
        if(BestAttackBonus == 2)
	return 7;
	return 5;
    }

    public boolean Defence(double probhit) {
final Player p2 = World.getInstance().getPlayerList().get(id);
if (p2 == null) {
return true;
}
	int att_def =  BestAttackBonus();
	int def_att = DefenceBonus(att_def);

	double attackBonus = (double) bonuses.getBonus(att_def);
	double attack = (double) getSkills().getLevel(0);

		if (CLARITYOFTHOUGHT == true)
			attack *= 1.05;
		if (IMPROVEDREFLEXES == true)
			attack *= 1.10;
		if (INCREDIBLEREFLEXES == true)
			attack *= 1.15;
		if (CHILVALRY == true)
			attack *= 1.15;
		if (PIETY == true)
			attack *= 1.20;
		


	double BestAttack = attackBonus + attack + (double)Misc.random(50);

	double defenceBonus = (double) p2.bonuses.getBonus(def_att);
	double defence = (double) p2.getSkills().getLevel(1);

		if (p2.THICKSKIN == true)
			defence *= 1.05;
		if (p2.ROCKSKIN == true)
			defence *= 1.10;
		if (p2.STEELSKIN == true)
			defence *= 1.15;
		if (p2.CHILVALRY == true)
			defence *= 1.23;
		if (p2.PIETY == true)
			defence *= 1.25;
		if (p2.PROTECTFROMMELEE == true)
			defenceBonus *= 1.50;

	double BestDefence = defenceBonus + defence;


        if ((Misc.random(BestAttack)*probhit) > Misc.random(BestDefence)){
   return true;
}
   return false;
}


	public double rangeAccuracy(Player opp) {
if (opp == null || this == null) {
return 0;
}
		double range = getSkills().getLevel(4);
		double defence = opp.getSkills().getLevel(1);
		double rangeBonus = bonuses.getBonus(4);
		double defenceBonus = opp.bonuses.getBonus(9);
		if (SHARPEYE== true) {
			range *= 1.05;
		}

		if (HAWKEYE == true) {
			range *= 1.10;
		}

		if (EAGLEEYE == true) {
			range *= 1.15;
		}
		if (opp.THICKSKIN == true) {
			defence *= 1.05;
		}
		if (opp.ROCKSKIN == true) {
			defence *= 1.10;
		}
		if (opp.STEELSKIN == true) {
			defence *= 1.15;
		}
		if (opp.CHILVALRY == true) {
			defence *= 1.23;
		}
		if (opp.PIETY == true) {
			defence *= 1.25;
		}
		if (opp.PROTECTFROMMISSELES == true) {
			defenceBonus *= 1.50;
		}
		double offensiveAttribute = range + rangeBonus;
		double defensiveAttribute = defence + defenceBonus;
		double difference = Math.abs(offensiveAttribute - defensiveAttribute);
		boolean positive = offensiveAttribute > defensiveAttribute;
		double interval = difference * 0.00175;
		double percentage = 0.50;
		if (!positive) {
			percentage -= interval;
		}
		if (positive) {
			percentage += interval;
		}
		return percentage;
	}

	public boolean RDefence(){	
final Player opp = World.getInstance().getPlayerList().get(id);
if (opp == null) {
return true;
}
		return Math.random() <= rangeAccuracy(opp);
	}


	public boolean Defence() {
		final Player opp = World.getInstance().getPlayerList().get(id);
		if (opp == null) {
			return true;
			}
			return Math.random() <= meleeAccuracy(opp);
		}
	public double meleeAccuracy(Player opp) {
		if (opp == null || this == null) {
			return 0;
			}
			double attack = getSkills().getLevel(0);
			double defence = opp.getSkills().getLevel(1);
			int activeAttackBonus = BestAttackBonus();
			int activeDefenceBonus = DefenceBonus(activeAttackBonus);
			double attackBonus = bonuses.getBonus(activeAttackBonus);
			double defenceBonus = opp.bonuses.getBonus(activeDefenceBonus);
			if (CLARITYOFTHOUGHT == true)
				attack *= 1.05;
			if (IMPROVEDREFLEXES == true)
				attack *= 1.10;
			if (INCREDIBLEREFLEXES == true)
				attack *= 1.15;
			if (CHILVALRY == true)
				attack *= 1.15;
			if (PIETY == true)
				attack *= 1.20;
			if (opp.THICKSKIN == true)
				defence *= 1.05;
			if (opp.ROCKSKIN == true)
				defence *= 1.10;
			if (opp.STEELSKIN == true)
				defence *= 1.15;
			if (opp.CHILVALRY == true)
				defence *= 1.23;
			if (opp.PIETY == true)
				defence *= 1.25;
			if (opp.PROTECTFROMMELEE == true)
				defenceBonus *= 1.50;
			double offensiveAttribute = (attack * 1.5) + attackBonus;
			double defensiveAttribute = (defence * 1.5) + defenceBonus;
			double difference = Math.abs(offensiveAttribute - defensiveAttribute);
			boolean positive = offensiveAttribute > defensiveAttribute;
			double interval = difference * 0.0015;
			double percentage = 0.55;
			if (!positive) {
				percentage -= interval;
			}
			if (positive) {
				percentage += interval;
			}
			return percentage;
		}
    public int MaxHitMelee(double probhit) {
		int a = getSkills().getLevel(2);
		int b = bonuses.getBonus(10);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.00175)+0.1;
		h = Math.floor(c*f+2.05);
		return(int)h;
	}
    public int MaxHitMelee() {
		double probhit = 1;
		int a = getSkills().getLevel(2);
		int b = bonuses.getBonus(10);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.00175)+0.1;
		h = Math.floor(c*f+2.05);
		return(int)h;	
	}

    public boolean RDefence(double probhit) {
	final Player p2 = World.getInstance().getPlayerList().get(id);
		if (p2 == null) {
			return true;
			}
			int att_def =  4;
			double attackBonus = (double) bonuses.getBonus(att_def);
			double attack = (double) getSkills().getLevel(4);

		if (SHARPEYE== true) {
			attack *= 1.05;
		}

		if (HAWKEYE == true) {
			attack *= 1.10;
		}

		if (EAGLEEYE == true) {
			attack *= 1.15;
		}



	double BestAttack = attackBonus + attack + (double)Misc.random(50);

	double defenceBonus = (double) p2.bonuses.getBonus(9);
	double defence = (double) p2.getSkills().getLevel(2);

		if (p2.THICKSKIN == true) {
			defence *= 1.05;
		}
		if (p2.ROCKSKIN == true) {
			defence *= 1.10;
		}
		if (p2.STEELSKIN == true) {
			defence *= 1.15;
		}
		if (p2.CHILVALRY == true) {
			defence *= 1.23;
		}
		if (p2.PIETY == true) {
			defence *= 1.25;
		}
		if (p2.PROTECTFROMMISSELES == true) {
			defenceBonus *= 1.50;
		}

	double BestDefence = defenceBonus + defence;


        if ((Misc.random(BestAttack)*probhit) > Misc.random(BestDefence)){
   return true;
}
   return false;
}


		public int MaxHitRange() {
		double probhit = 1;
		int a = getSkills().getLevel(4);
		int b = bonuses.getBonus(12);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.0017)+0.05;
		h = Math.floor(c*f);
		return(int)h;
	}

	public int MaxHitRange(double probhit) {
		int a = getSkills().getLevel(4);
		int b = bonuses.getBonus(12);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.00195)+0.1;
		h = Math.floor(c*f+2.05);
		return(int)h;
	}
    public void setEquipmentBonus() {
		try {
		int a = bonuses.getBonus(0);
		int b = bonuses.getBonus(1);
		int c = bonuses.getBonus(2);
		int d = bonuses.getBonus(5);
		int dc = bonuses.getBonus(6);
		int ds = bonuses.getBonus(7);
		int m = bonuses.getBonus(8);
		int mm = bonuses.getBonus(3);
		int e = bonuses.getBonus(10);
		int p = bonuses.getBonus(11);
		int s = bonuses.getBonus(12);
		int f = bonuses.getBonus(4);
		int g = bonuses.getBonus(9);
	getActionSender().sendString("Stab: "+a, 667, 36);
	getActionSender().sendString("Slash: "+b, 667, 37);
	getActionSender().sendString("Crush: "+c, 667, 38);
	getActionSender().sendString("Magic: "+mm, 667, 39);
	getActionSender().sendString("Ranged: "+f, 667, 40);
	getActionSender().sendString("Stab: "+d, 667, 41);
	getActionSender().sendString("Slash: "+dc, 667, 42);
	getActionSender().sendString("Crush: "+ds, 667, 43);
	getActionSender().sendString("Magic: "+m, 667, 44);
	getActionSender().sendString("Ranged: "+g, 667, 45);
	getActionSender().sendString("Strenght: +"+e, 667, 48);
	getActionSender().sendString("Ranged Str: +"+s, 667, 50);
	getActionSender().sendString("Prayer: +"+p, 667, 49);
        getActionSender().sendString("Summoning: "+0, 667, 46);
        getActionSender().sendString(bonuses.weight[0]+"kg", 667, 32);
		} catch (Exception e) {
		}
}
	public boolean FullVeracEquipped() {
		try {
	if(getEquipment().get(0).getDefinition().getId() == 4753 && getEquipment().get(4).getDefinition().getId() == 4757 && getEquipment().get(7).getDefinition().getId() == 4759  && getEquipment().get(3).getDefinition().getId() == 4755)
                {
		return true;
                }
		return false;	
		} catch (Exception e) {
		return false;
		}
        } 
	public int getNpcMeleeDefence() {
		final NPC n = World.getInstance().getNpcList().get(Nid);
		switch (n.getId()) {
		case 1158:
			return 400;
		case 1160:
			if(FullVeracEquipped())
			return 400;
			else
			return 600;
		case 8324:
		case 8326:
		case 8327:
		return 150;
		case 8325: return 100000;
		case 8352: if (!n.UsingThis)return 1100; else return 550;
		case 8351: if (!n.UsingThis)return 700; else return 366;	
		case 8350: if (!n.UsingThis)return 700; else return 366;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				return 3;

			case 134: return 90;
			case 1615: return 140;
			case 2614: return 230;
			case 5902: return 280;
			case 5253: return 190;
			case 6223: return 195;
			case 6225: return 210;
			case 6227: return 200;
			case 6222: return 190;
			case 6260: return 340;
			case 8133: return 500; //corp
			case 6261: return 230;
			case 6263: return 250;
			case 3847: return 230;
			case 1472: return 240;
			case 2745: return 130;
			case 2746: return 10;
			case 4284: return 150;
			case 4291: return 90;
			case 4292: return 95;
			case 6265: return 240;
			case 6625: return 150;
			case 6729: return 170;
			case 6247: return 290;
			case 6691: return 190;
			case 6998: return 180;	
			case 6999: return 160;
			case 7770: return 180;
			case 7771: return 420;

			default:
				return 20;
		}
	}
	public int getNpcRangeDefence() {
		final NPC n = World.getInstance().getNpcList().get(Nid);
				switch (n.getId()) {
				case 1158:
					return 450;
				case 1160:
					return 675;
				case 8324:
				case 8325:
				case 8327:
				return 200;
				case 8326: return 100000;
				case 8351: if (!n.UsingThis)return 1200; else return 600;
				case 8352: if (!n.UsingThis)return 800; else return 400;	
				case 8350: if (!n.UsingThis)return 800; else return 400;
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
						return 0;

					case 134: return 90;
					case 1615: return 140;
					case 2614: return 230;
					case 5902: return 280;
					case 5253: return 190;
					case 6223: return 195;
					case 6225: return 210;
					case 6227: return 200;
					case 6222: return 190;
					case 6260: return 340;
					case 8133: return 550; //corp
					case 6261: return 230;
					case 6263: return 250;
					case 3847: return 230;
					case 1472: return 240;
					case 2745: return 130;
					case 2746: return 10;
					case 4284: return 150;
					case 4291: return 90;
					case 4292: return 95;
					case 6265: return 240;
					case 6625: return 150;
					case 6729: return 170;
					case 6247: return 290;
					case 6691: return 190;
					case 6998: return 180;	
					case 6999: return 160;
					case 7770: return 180;
					case 7771: return 420;

					default:
						return 0;
				}
			}
    	public int getRandom(int range) {
        	return (int)(Math.random() * (range + 1));
    	}

	public int NPCMaxHitMelee() {
		int a = getSkills().getLevel(2);
		int b = bonuses.getBonus(10);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.00175)+0.1;
		h = Math.floor(c*f+2.05);
		return(int)h;
	}
	public int NPCMaxHitRange() {
		double probhit = 1;
		int a = getSkills().getLevel(4);
		int b = bonuses.getBonus(12);
		double c = (double)a;
		double d = (double)b;
		double f = 0;
		double h = 0;
		f = (d*0.00195)+0.1;
		h = Math.floor(c*f+2.05);
		return(int)h;
	}
	

public int getSpecialAmount() {
	if(getEquipment().get(3) == null) {
		return 25;
	}
	switch(getEquipment().get(3).getDefinition().getId()) {
		case 15241: return 50;
		case 11235: return 55;
		case 13899: return 25;
		case 13905: return 50;
		case 13902: return 50;
		case 14484: return 50;
		case 14684: return 50;
		case 11694: return 50;
		case 11696: return 50;
		case 11698: return 50;
		case 11700: return 50;
		case 10887: return 50;
		case 11730: return 100;
		case 5698: return 25;
		case 4151: return 50;
		case 7158: return 50;
		case 3204: return 50;
		case 4587: return 50;
		case 1434: return 25;
		case 1305: return 25;
		default: return 25;
	}
}


	public int getDefenceAnimation() {
		return !this.appearance.isNpc() ? equipment.getDefenceAnimation() : NPCDefinition.forId(this.appearance.getNpcId()).getDefenceAnimation();
	}


	public boolean isAnimating() {
		return this.getUpdateFlags().isAnimationUpdateRequired();
	}


	public boolean isDestroyed() {
		return !World.getInstance().getPlayerList().contains(this);
	}

	public Specials getSpecials() {
		return specials;
	}

	public int getDeathAnimation() {
		return !this.appearance.isNpc() ? 7197 : NPCDefinition.forId(this.appearance.getNpcId()).getDeathAnimation();
	}

/*public boolean SafeZone(){
	if((getLocation().getX() >= 2508 && getLocation().getX() <= 2525 && getLocation().getY() >= 3851 && getLocation().getY() <=3874 || getLocation().getX() >= 3228 && getLocation().getX() <= 3257 && getLocation().getY() >= 3523 && getLocation().getY() <=3523 || getLocation().getX() >= 2438 && getLocation().getX() <= 2446 && getLocation().getY() >= 3082 && getLocation().getY() <=3098 || getLocation().getX() >= 2394 && getLocation().getX() <= 2408 && getLocation().getY() >= 5168 && getLocation().getY() <=5175 || getLocation().getX() >= 3200 && getLocation().getX() <= 3229 && getLocation().getY() >= 3200 && getLocation().getY() <=3233|| getLocation().getX() >= 3135 && getLocation().getX() <= 3204 && getLocation().getY() >= 3652 && getLocation().getY() <=3663 || getLocation().getX() >= 3147 && getLocation().getX() <= 3199 && getLocation().getY() >= 3663 && getLocation().getY() <=3681 || getLocation().getX() >= 3158 && getLocation().getX() <= 3199 && getLocation().getY() >= 3681 && getLocation().getY() <=3693 || getLocation().getX() >= 3176 && getLocation().getX() <= 3191 && getLocation().getY() >= 3693 && getLocation().getY() <=3703 || getLocation().getX() >= 2948 && getLocation().getX() <= 2949 && getLocation().getY() >= 3368 && getLocation().getY() <= 3369 || getLocation().getX() >= 3221 && getLocation().getX() <= 3224 && getLocation().getY() >= 3223 && getLocation().getY() <=3225 || getLocation().getX() >= 2526 && getLocation().getX() <= 2554 && getLocation().getY() >= 4707 && getLocation().getY() <=4725 || getLocation().getX() >= 3250 && getLocation().getX() <= 3257 && getLocation().getY() >= 3419 && getLocation().getY() <=3423 || getLocation().getX() >= 3179 && getLocation().getX() <= 3194 && getLocation().getY() >= 3432 && getLocation().getY() <=3446 || getLocation().getX() >= 2943 && getLocation().getX() <= 2947 && getLocation().getY() >= 3368 && getLocation().getY() <=3373 || getLocation().getX() >= 3009 && getLocation().getX() <= 3018 && getLocation().getY() >= 3353 && getLocation().getY() <=3358 || getLocation().getX() >= 3091 && getLocation().getX() <= 3098 && getLocation().getY() >= 3488 && getLocation().getY() <=3499 || getLocation().getX() >= 3065 && getLocation().getX() <= 3112 && getLocation().getY() >= 3520 && getLocation().getY() <=3523 || getLocation().getX() >= 3264 && getLocation().getX() <= 3279 && getLocation().getY() >= 3672 && getLocation().getY() <=3695 /*|| getLocation().getX() >= 2498 && getLocation().getX() <= 3841 && getLocation().getY() >= 2526 && getLocation().getY() <= 3878))
		return true;
			else
		return false;
}*/
    public boolean godWarsDung() {
	if(getLocation().getX() >= 2819 && getLocation().getX() <= 2946 && getLocation().getY() >= 5254 && getLocation().getY() <= 5362)
		return true;
			else
		return false;
    	}

    public boolean saraChamber() {
	return getLocation().getX() >= 2889 && getLocation().getX() <= 2907 && getLocation().getX() >= 5258 && getLocation().getX() <= 5276;
    	}

    public boolean zammyChamber() {
	return getLocation().getX() >= 2919 && getLocation().getX() <= 2935 && getLocation().getX() >= 5319 && getLocation().getX() <= 5330;
    	}

    public boolean graardorChamber() {
	return getLocation().getX() >= 2864 && getLocation().getX() <= 2876 && getLocation().getX() >= 5351 && getLocation().getX() <= 5369;
    	}

    public boolean armadylChamber() {
	return getLocation().getX() >= 2823 && getLocation().getX() <= 2843 && getLocation().getX() >= 5295 && getLocation().getX() <= 5310;
    	}

    public boolean armadylChamber1() {
	return getLocation().getX() >= 2825 && getLocation().getX() <= 2841 && getLocation().getX() >= 5297 && getLocation().getX() <= 5307;
    	}
	public boolean IsAtCorporeal(){
	if(getLocation().getX() >= 2852 && getLocation().getX() <= 2880 && getLocation().getY() >= 9932 && getLocation().getY() <=9968)
		return true;
			else
		return false;
	}
	public boolean IsAtTormented(){
		if(getLocation().getX() >= 2902 && getLocation().getX() <= 2916 && getLocation().getY() >= 9798 && getLocation().getY() <=9807)
			return true;
				else
			return false;
	}
	public boolean IsAtBlackCastle(){
		if(getLocation().getX() >= 3001 && getLocation().getX() <= 3037 && getLocation().getY() >= 3497 && getLocation().getY() <=3523)
			return true;
				else
			return false;
	}
	public boolean inClanWars() {
		if(getLocation().getX() >= 2754 && getLocation().getX() <= 2880 && getLocation().getY() >= 5512 && getLocation().getY() <= 5629 || getLocation().getX() >= 2885 && getLocation().getX() <= 2733 && getLocation().getY() >= 5465 && getLocation().getY() <= 5511) {
			actionSender.sendPlayerOption("Attack", 1, false);
			return true;
				} else {
			return false;
		}
    	}
	
/*public boolean SafeZone(){
if ((getLocation().getX() >= 2940 && getLocation().getX() <= 3395 && getLocation().getY() >= 3524 && getLocation().getY() <= 4000))
		return false;
			else
		return true;
    }
    public boolean multiZone() {
        return getLocation().getX() >= 3316 && getLocation().getX() <= 3369 && getLocation().getY() >= 3636 && getLocation().getY() <= 3738 || getLocation().getX() >= 3287 && getLocation().getX() <= 3298 && getLocation().getY() >= 3167 && getLocation().getY() <= 3178 || getLocation().getX() >= 3070 && getLocation().getX() <= 3095 && getLocation().getY() >= 3405 && getLocation().getY() <= 3448 || getLocation().getX() >= 2961 && getLocation().getX() <= 2981 && getLocation().getY() >= 3330 && getLocation().getY() <= 3354 || getLocation().getX() >= 2510 && getLocation().getX() <= 2537 && getLocation().getY() >= 4632 && getLocation().getY() <= 4660 || getLocation().getX() >= 3012 && getLocation().getX() <= 3066 && getLocation().getY() >= 4805 && getLocation().getY() <= 4858 || getLocation().getX() >= 2794 && getLocation().getX() <= 2813 && getLocation().getY() >= 9281 && getLocation().getY() <= 9305 || getLocation().getX() >= 3546 && getLocation().getX() <= 3557 && getLocation().getY() >= 9689 && getLocation().getY() <= 9700 || getLocation().getX() >= 2708 && getLocation().getX() <= 2729 && getLocation().getY() >= 9801 && getLocation().getY() <= 9829 || getLocation().getX() >= 3450 && getLocation().getX() <= 3525 && getLocation().getY() >= 9470 && getLocation().getY() <= 9535 || getLocation().getX() >= 3207 && getLocation().getX() <= 3395 && getLocation().getY() >= 3904 && getLocation().getY() <= 3903 || getLocation().getX() >= 3006 && getLocation().getX() <= 3072 && getLocation().getY() >= 3611 && getLocation().getY() <= 3712 || getLocation().getX() >= 3149 && getLocation().getX() <= 3395 && getLocation().getY() >= 3520 && getLocation().getY() <= 4000 || getLocation().getX() >= 2365 && getLocation().getX() <= 2420 && getLocation().getY() >= 5065 && getLocation().getY() <= 5120 || getLocation().getX() >= 2890 && getLocation().getX() <= 2935 && getLocation().getY() >= 4425 && getLocation().getY() <= 4470 || getLocation().getX() >= 2250 && getLocation().getX() <= 2290 && getLocation().getY() >= 4675 && getLocation().getY() <= 4715 || getLocation().getX() >= 2690 && getLocation().getX() <= 2825 && getLocation().getY() >= 2680 && getLocation().getY() <= 2810;
    }*/

public transient int bhTarget = 0;
public transient boolean inBounty = false;

		public void updateWildernessState() {
		if (SafeZone()) {
			actionSender.sendPlayerOption("null", 1, false);
			if (inBounty) {
				GameEngine.BH.removeTargetfor(this);
				inBounty = false;
			}
		} else {
			actionSender.sendPlayerOption("Attack", 1, false);
			if(!inClanWars()) {
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
				if (!inBounty) {
				GameEngine.BH.getTargetfor(this);
				inBounty = true;
			}
			if (bhTarget != 0 && inBounty) {
				GameEngine.BH.CheckTarget(this);
			}
			}
		}
	}


	public int getHp() {
		return this.getSkills().getLevel(Skills.HITPOINTS);
	}


	public int getMaxHp() {
		return this.getSkills().getLevelForXp(Skills.HITPOINTS);
	}


	public void setHp(int val) {
		try {
		this.getSkills().set(Skills.HITPOINTS, val);
		} catch (Exception e) {
		}
	}


	@Override
	public void dropLoot() {
		if(this.inClanWars()) {
			return;
		}
		if(this.getRights() == 2) {
			return;
		}
		List<Item> itemsInHand = new ArrayList<Item>();
		for(int i = 0; i < Inventory.SIZE; i++) {
			Item item = this.getInventory().getContainer().get(i);
			if(item != null) {
				itemsInHand.add(item);
			}
		}
		for(int i = 0; i < Equipment.SIZE; i++) {
			Item item = this.getEquipment().getContainer().get(i);
			if(item != null) {
				itemsInHand.add(item);
			}
		}
		this.getInventory().reset();
		this.getEquipment().reset();
		int keep = 3;
		if(this.PROTECTITEM == true) {
			keep = 4;
		}
		if(this.getHeadIcons().isSkulled()) {
			keep = 0;
		}
		if(keep > 0) {
			Collections.sort(itemsInHand, new Comparator<Item>() {
				@Override
				public int compare(Item arg0, Item arg1) {
                    int a0 = arg0.getDefinition().getPrice().getNormalPrice();
                    int a1 = arg1.getDefinition().getPrice().getNormalPrice();
					return a1 - a0;
				}
			});
			List<Item> toRemove = new ArrayList<Item>();
			for(int i = 0; i < itemsInHand.size(); i++) {
				Item item = itemsInHand.get(i);
				if(item.getDefinition().isStackable() || item.getDefinition().isNoted()) {
					continue;
				}
				if(keep > 0) {
					toRemove.add(item);
					keep--;
				} else {
					break;
				}
			}
			for(Item i : toRemove) {
				itemsInHand.remove(i);
				this.getInventory().addItem(i.getId(), 1);
			}
		}
		Player p2 = null;		
if(this.giveDrop == 0) {
                     //died by npc
                     p2 = this;
		} else {
                    p2 = World.getInstance().getPlayerList().get(this.giveDrop);
}
this.giveDrop = 0;


		for(Item i : itemsInHand) {
			World.getInstance().getItemManager().createDropGroundItem(p2, this.getLocation(), i);
		}

	}
	public void dropLoot2() {
		if(this.inClanWars()) {
			return;
		}
		if(this.giveDrop == 0) {
			System.out.println("Npc Killed him, so no drop");
			return;
		}
		final Player p2 = World.getInstance().getPlayerList().get(this.giveDrop);
 		Item Food = dropId(pvpDrops.Foods());
        	Item Low = dropId(pvpDrops.OtherItems());
 		Item Medium = dropId(pvpDrops.OtherItems2());
 		Item High = dropId(pvpDrops.OtherItems3());
 		Item PvpItems = dropId(pvpDrops.PvPItems());
 		Item PvpItems2 = dropId(pvpDrops.PvPItems());
 		Item TargetDrop = dropId(pvpDrops.TargetDrop());

		List<Item> itemsInHand = new ArrayList<Item>();
		List<Item> itemsInHand2 = new ArrayList<Item>();
		List<Item> itemsInHand3 = new ArrayList<Item>();
		List<Item> itemsInHand4 = new ArrayList<Item>();
		List<Item> itemsInHand5 = new ArrayList<Item>();
		List<Item> itemsInHand6 = new ArrayList<Item>();
		List<Item> itemsInHand7 = new ArrayList<Item>();
		if(Food != null || Low != null || Medium != null || High != null ||  PvpItems != null ||  TargetDrop != null) {
			itemsInHand.add(Food);
			itemsInHand2.add(Low);
			itemsInHand3.add(Medium);
			itemsInHand4.add(High);
			itemsInHand5.add(PvpItems);
			itemsInHand6.add(TargetDrop);
			itemsInHand7.add(PvpItems2);
		}

		for(Item food : itemsInHand) {
		for(Item low : itemsInHand2) {
		for(Item medium : itemsInHand3) {
		for(Item high : itemsInHand4) {
		for(Item pvpitems : itemsInHand5) {
		for(Item targetdrop : itemsInHand6) {
		for(Item pvpitems2 : itemsInHand7) {

		//if(p2.giveDrop == p2.bhTarget) {
		if(p2.bhTarget == p2.giveDrop) {
			p2.playerEp = p2.playerEp - Misc.random(5);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), targetdrop);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your target.");
			p2.giveDrop = 0;
		}

		if(p2.playerEp <= 10) {
			p2.playerEp = p2.playerEp - Misc.random(5);
			World.getInstance().getItemManager().createDropGroundItem(p2
				, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
				, this.getLocation(), low);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 11 && p2.playerEp <= 21) {
			p2.playerEp = p2.playerEp - Misc.random(10);
			World.getInstance().getItemManager().createDropGroundItem(p2
				, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
				, this.getLocation(), low);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 22 && p2.playerEp <= 32) {
			p2.playerEp = p2.playerEp - Misc.random(15);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), low);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 33 && p2.playerEp <= 44) {
			p2.playerEp = p2.playerEp - Misc.random(20);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), low);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 45 && p2.playerEp <= 55) {
			p2.playerEp = p2.playerEp - Misc.random(30);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), low);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 56 && p2.playerEp <= 66) {
			p2.playerEp = p2.playerEp - Misc.random(40);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 67 && p2.playerEp <= 77) {
			p2.playerEp = p2.playerEp - Misc.random(50);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), high);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 78 && p2.playerEp <= 88) {
			p2.playerEp = p2.playerEp - Misc.random(60);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems2);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), high);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}


		if(p2.playerEp >= 89 && p2.playerEp <= 100) {
			p2.playerEp = p2.playerEp - Misc.random(70);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), food);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), pvpitems2);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), high);
			World.getInstance().getItemManager().createDropGroundItem(p2
					, this.getLocation(), medium);
			actionSender.sendString("EP: "+playerEp+"%", 591, 9);
			actionSender.sendMessage("You killed your opponent.");
			p2.giveDrop = 0;
		}

		}}}}}}}
	}

	public boolean isAutoRetaliating() {
		return settings.isAutoRetaliate();
	}



	public int getDrawBackGraphics() {
		return equipment.getDrawBackGraphics();
	}


	public int getProjectileId() {
		return equipment.getProjectileId();
	}

		public void setOnLogin(boolean onLogin) {
			this.onLogin = onLogin;
		}

		public boolean isOnLogin() {
			return onLogin;
		}
		public InterfaceSwitches getInterfaceswitches() {
			return interfaceswitches;
		}
		public void setDisplayMode(int displayMode) {
			this.displayMode = displayMode;
		}

		public int getDisplayMode() {
			return displayMode;
		}
		public void setFullScreen(boolean fullScreen) {
			this.fullScreen = fullScreen;
		}

		public boolean isFullScreen() {
			return fullScreen;
		}
	@Override
	public CombatType getCombatType() {
		if(equipment.isWieldindBow() || equipment.isWieldingKnives()) {
			return CombatType.RANGE;
		}
		return CombatType.MELEE;
	}
	public boolean hasAmmo() {
		return equipment.hasAmmo();
	}
	public void npcswitch(int id) {
		try {
		} catch(Exception e) {
		}
	}
		public ShopConfiguration getShopConfiguration() {
		return shopConfiguration;
	}
	
}                             