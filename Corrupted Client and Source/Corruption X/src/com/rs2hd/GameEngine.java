package com.rs2hd;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rs2hd.content.LoadPrices;
import com.rs2hd.content.minigames.BHWorld;
import com.rs2hd.content.skills.combat.NpcVsPlayer;
import com.rs2hd.content.skills.fishing.FishSpotLive;
import com.rs2hd.content.skills.mining.RockLive;
import com.rs2hd.content.skills.prayer.Prayer;
import com.rs2hd.content.skills.summoning.Summon;
import com.rs2hd.content.skills.thief.StallLive;
import com.rs2hd.content.skills.woodcutting.TreeLive;
import com.rs2hd.content.ClanChat.ClanMain;
import com.rs2hd.content.ClanChat.SaveChats;
//import com.rs2hd.content.grandexchange.*;
import com.rs2hd.content.LoadEquips;
import com.rs2hd.io.MapDataLoader;
import com.rs2hd.io.MapDataPacker;
import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.NPCDefinition;
import com.rs2hd.model.World;
import com.rs2hd.content.PestControl;
import com.rs2hd.model.clipInfo;
import com.rs2hd.model.NoclipHandler;
import com.rs2hd.packethandler.PacketHandlers;
import com.rs2hd.util.BanUser;
import com.rs2hd.util.Censor;
import com.rs2hd.util.MuteUser;
import com.rs2hd.util.AddTile;
import com.rs2hd.util.Scripts;
import com.rs2hd.content.*;
import com.rs2hd.model.NPC;
import com.rs2hd.util.PathFinder.*;
import com.rs2hd.util.pathfinding.*;
import com.rs2hd.util.log.Logger;
import com.rs2hd.util.WorldList;
import com.rs2hd.util.AutoSaveEvent;
import com.rs2hd.tools.*;
/**
 * A varek has called it before, the 'central motor' of the game.
 * 
 * That means it handles periodic updating and packet handling/creation.
 * 
 * @author Graham
 *
 */
public class GameEngine {
	public static ClanMain ClanMain = new ClanMain();
	private static SaveChats save;
	public static boolean DarkCoreOn = false;
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	/**
	 * Running flag.
	 */
	private boolean isRunning;
    /**
     * Poison
     */
    public static Poison poison = new Poison();	
	/**
	 * This makes you wish that Java supported typedefs.
	 */
	private Map<Integer, int[]> mapData;
	
	/**
	 * Our worker thread.
	 */
	private WorkerThread workerThread;

	/**
     * Handles player some classes by Dragonkk
     */
	public static LoadEquips equip = new LoadEquips();
 	public static FishSpotLive FishSpotLive = new FishSpotLive(); //rocks
	public static StallLive StallLive = new StallLive(); //stalls
	public static RockLive RockLive = new RockLive(); //rocks
	public static TreeLive TreeLive = new TreeLive(); //trees
    public static MuteUser mute = new MuteUser(); //loads muted users
    public static AddTile AddTile = new AddTile(); //loads muted users
    public static BanUser ban = new BanUser(); //loads banned users
    public static Censor Censor = new Censor(); //load bad words
    public static LoadPrices     prices          = new LoadPrices(); //prices
    public static NpcVsPlayer nvp = new NpcVsPlayer(); //nvp
    public static Prayer prayer = new Prayer(); //pray not needed to be here
    public static Summon summon = new Summon(); //not needed soon wil remove
    public static BHWorld BH = new BHWorld(); //bh
    //public static clipInfo clipInfo = new clipInfo(); //bh
    public static NoclipHandler clipInfo = new NoclipHandler(); //bh



	/**
	 * Thread group.
	 */
	public ThreadGroup threads = new ThreadGroup("Project Skux");
	
	/**
	 * Creates other things vital to the game logic, like the world class.
	 * @throws Exception 
	 */
	public GameEngine() throws Exception {
		/*
		 * We are running.
		 */
		isRunning = true;
		/*
		 * Check if mapdata packed file exists, if not, then we pack it.
		 */
		File packedFile = new File("data/mapdata/packed.dat");
		if(!packedFile.exists()) {
			MapDataPacker.pack("data/mapdata/unpacked/", "data/mapdata/packed.dat");
		}
		packedFile = new File("data/clip/packed.dat");
		//ItemXmlToBinary.main(null);
		/*
		 * Actually load the mapdata.
		 */
		mapData = new HashMap<Integer, int[]>();
		MapDataLoader.load(mapData);
		/*
		 * Load handlers.
		 */
		PacketHandlers.loadHandlers();
		/*
		 * Load item definitions.
		 */
		logger.info("Loading item definitions...");
		ItemDefinition.load();
		logger.info("Loading npc definitions...");
		NPCDefinition.load();
		/*
		 * Start clan chat thread
		 */
		setSave(new SaveChats());
		setSave(null);
		/*
		 * Set up the world.
		 */
		logger.info("Setting up world...");
		World.getInstance().setEngine(this);
		logger.info("Loading world list data...");
		WorldList worldList = new WorldList();
		worldList.load();
		//logger.info("Connecting to loginserver.....");
		//LoginServer loginServer = new LoginServer();
		//loginServer.run();
		/*
		 * Start the worker thread.
		 */
		logger.info("Launching worker thread...");
		workerThread = new WorkerThread(new XStreamPlayerLoader());
		newThread("WorkerThread", workerThread);
		/*
		 * Run scripts.
		 */
		Scripts.init();
	}
	public void newThread(String name, Runnable r) {
		try {
		new Thread(threads, r, name).start();
		} catch(Exception e) {
		}
	}
	
	/**
	 * Handle a major update.
	 */
	public void majorUpdate() {
		try {
		World.getInstance().majorUpdate();
		} catch(Exception e) {
		}
	}
	
	/**
	 * Handle a minor update.
	 */
	public void minorUpdate() {
		try {
				//mn.Restarter();
		//World.getInstance().minorUpdate();
		} catch(Exception e) {
		}
	}
	/**
	 * Called every tick.
	 */
	public void tick() {
		try {
		
		World.getInstance().tick();
		} catch(Exception e) {
		}
	}
	
	/**
	 * Gets the is running flag.
	 * @return
	 */
	public boolean isRunning() {
		return isRunning;
	}
	
	/**
	 * Sets the is running flag.
	 * @param isRunning
	 */
	public void setIsRunning(boolean isRunning) {
		try {
		this.isRunning = isRunning;
		} catch(Exception e) {
		}
	}
	
	/**
	 * Gets the worker thread.
	 * @return
	 */
	public WorkerThread getWorkerThread() {
		return workerThread;
	}
	
	/**
	 * Stops threads, saves games, etc.
	 */
	public void cleanup() {
		try {
		threads.interrupt();
		} catch(Exception e) {
		}
	}

	public int[] getMapData(int region) {
		return mapData.get(region);
	}
	public static void setSave(SaveChats save) {
		GameEngine.save = save;
	}

	public static SaveChats getSave() {
		return save;
	}

}
