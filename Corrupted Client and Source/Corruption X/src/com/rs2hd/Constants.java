package com.rs2hd;

import com.rs2hd.util.log.Logger;

/**
 * Holds global server constants.
 * @author Graham
 *
 */
public class Constants {
	
	/**
	 * Prevent an instance being created.
	 */
	private Constants() {}
	
	/**
	 * Initialsiz idle time - before the protocol version exchange/login/update has done.
	 */
	public static final int SESSION_INITIAL_IDLE_TIME = 1;
	
	/**
	 * Standard session idle time, in seconds.
	 * 
	 * We make this slightly longer to allow for in-game lag.
	 */
	public static final int SESSION_IDLE_TIME = 90;
	
	/**
	 * Connection throttle interval, in seconds.
	 * 
	 * This needs to be kept relatively low as an update request then a login request will come soon after each other.
	 */
	public static final long THROTTLE_FILTER_INTERVAL = 1;
	
	/**
	 * RS2 incoming packet lengths.
	 */
	public static final int[] PACKET_LENGTHS = new int[256];

	static {
		for(int i=0; i<PACKET_LENGTHS.length; i++) {
		PACKET_LENGTHS[i] = -3;
		}	
		PACKET_LENGTHS[0] = 0; // Dunno
		PACKET_LENGTHS[1] = 0;
		PACKET_LENGTHS[161] = 0;
		PACKET_LENGTHS[4] = 1; //checks if u out or ingame might use in future cuz of bots
		PACKET_LENGTHS[5] = 2; //buttons
		PACKET_LENGTHS[19] = 6; //button
		PACKET_LENGTHS[45] = 7; // Object option 2
		PACKET_LENGTHS[142] = 2; // Object examine
		PACKET_LENGTHS[138] = 11;
		PACKET_LENGTHS[14] = 1;
		PACKET_LENGTHS[6] = 1;
		PACKET_LENGTHS[10] = 4;
		PACKET_LENGTHS[100] = 7;
		PACKET_LENGTHS[183] = 30;
		PACKET_LENGTHS[180] = 1;
		PACKET_LENGTHS[132] = 22;
		PACKET_LENGTHS[102] = 4;
		PACKET_LENGTHS[21] = 3;
		PACKET_LENGTHS[164] = 4;
		PACKET_LENGTHS[176] = 7;
		PACKET_LENGTHS[109] = 10;
		PACKET_LENGTHS[176] = 4;
		PACKET_LENGTHS[220] = 13;
		PACKET_LENGTHS[155] = 13; //A packet used on login
                		PACKET_LENGTHS[2] = 0; // Something to do with npc examine
		PACKET_LENGTHS[124] = 2; // Item examine
		PACKET_LENGTHS[32] = 1; // Minimap clicking
		PACKET_LENGTHS[98] = 22; // Some random packet which came up from clicking?
                PACKET_LENGTHS[66] = 8; //item select
                PACKET_LENGTHS[29] = 8; //item select
              	PACKET_LENGTHS[78] = 14; //Magic on Item
                PACKET_LENGTHS[79] = 9; //Magic on Player
                PACKET_LENGTHS[84] = 9; //Magic on Npc
                PACKET_LENGTHS[87] = 6;
		PACKET_LENGTHS[69] = 8;
                PACKET_LENGTHS[91] = 0;
                PACKET_LENGTHS[68] = 4;
		PACKET_LENGTHS[112] = 12; //bank switch items
		PACKET_LENGTHS[114] = 5; //player option 4
		PACKET_LENGTHS[117] = 16; //Item on item
		PACKET_LENGTHS[140] = 3; // player option 2
		PACKET_LENGTHS[141] = 3; // player option 3
		PACKET_LENGTHS[41] = 4; // Some random packet o.o
                PACKET_LENGTHS[148] = 4;
                PACKET_LENGTHS[152] = 6; //player option 1
                PACKET_LENGTHS[158] = -1;
		PACKET_LENGTHS[119] = -1; // main map walking
		PACKET_LENGTHS[163] = -1; //Minimap
		PACKET_LENGTHS[165] = -1; //Minimap
        	PACKET_LENGTHS[166] = -1; //npc walk
                PACKET_LENGTHS[171] = -1; //commands
                PACKET_LENGTHS[170] = 7; //commands
                PACKET_LENGTHS[182] = -1;// chat
                PACKET_LENGTHS[189] = 8;// item operate
		PACKET_LENGTHS[190] = 7; // Object option 1
		PACKET_LENGTHS[194] = 7; // take item
		PACKET_LENGTHS[205] = 4; // buttons
		PACKET_LENGTHS[193] = 6; // buttons
		PACKET_LENGTHS[173] = 6; // buttons
		PACKET_LENGTHS[253] = 9; //item switch
		PACKET_LENGTHS[3] = 6; // buttons
		PACKET_LENGTHS[76] = 6; // buttons
		PACKET_LENGTHS[89] = 6; // buttons
		PACKET_LENGTHS[221] = 6; // buttons
		PACKET_LENGTHS[216] = 6; // buttons
		PACKET_LENGTHS[206] = 4; // Input Handler
		PACKET_LENGTHS[172] = -1; // Input Handler
		PACKET_LENGTHS[197] = -1; // Input Handler
		PACKET_LENGTHS[207] = 3; // Npc attack
                PACKET_LENGTHS[216] = 6; //buttons
		PACKET_LENGTHS[226] = -1;
		PACKET_LENGTHS[123] = -1;
		PACKET_LENGTHS[229] = 8; // equipment
		PACKET_LENGTHS[234] = 8; // unequip
		PACKET_LENGTHS[235] = 4; // camera movement
		PACKET_LENGTHS[248] = 8; // drop item
		PACKET_LENGTHS[254] = 3;
		PACKET_LENGTHS[217] = 3;
		PACKET_LENGTHS[147] = 7;
                PACKET_LENGTHS[202] = 15;
                PACKET_LENGTHS[244] = 0;
		PACKET_LENGTHS[24] = 31;
		PACKET_LENGTHS[36] = 8; // Join clan chat
		PACKET_LENGTHS[47] = 9;//Clan
		PACKET_LENGTHS[49] = 1;//Clan? Npc examine..
                PACKET_LENGTHS[255] = 0;
	}
	
	/**
	 * 562 cache 'update keys'.
	 */
	public static final int[] UPDATE_KEYS = {
        -1, 0, -1, 0, 0, 0, 0, -24,
        69, -2, -81, -42, 0, 0, 1, 109, 19, -70, 46, -45, 0, 0, 0, -32,
        3, -96, -42, -122, 0, 0, 1, 57, 77, 50, -37, -107, 0, 0, 2, -62,
        38, 98, -94, -120, 0, 0, 0, -62, 67, 101, -36, 14, 0, 0, 2, -66,
        37, 10, -20, -38, 0, 0, 0, 48, -89, -35, -46, -87, 0, 0, 3, -68,
        -9, -29, 0, -113, 0, 0, 0, -32, 126, -123, 61, -94, 0, 0, 1, 0,
        41, 118, 39, 106, 0, 0, 0, 5, -57, -21, 28, 24, 0, 0, 0, 29,
        120, -40, -46, -57, 0, 0, 2, -15, -117, -16, 126, 2, 0, 0, 0, 32,
        -36, 110, -58, 45, 0, 0, 0, 27, 23, 48, -1, -82, 0, 0, 0, 6,
        -126, 101, 82, -105, 0, 0, 2, 61, -50, 123, -76, -122, 0, 0, 1, 18,
        -7, -46, 6, -47, 0, 0, 1, 100, -73, -63, 54, -77, 0, 0, 1, 32,
        -122, 15, -91, 118, 0, 0, 4, 116, -29, -66, 26, -11, 0, 0, 0, 110,
        119, 44, 56, 125, 0, 0, 0, -124, -46, 49, 46, 46, 0, 0, 0, -122,
        -88, -59, -53, 91, 0, 0, 0, 51, 83, -52, -26, -52, 0, 0, 0, 5,
        81, -44, 70, -90, 0, 0, 0, 113, 36, 87, 66, 92, 0, 0, 0, 0,
        -9, -87, -3, 1, 0, 0, 0, 3,
 };
	
	/**
	 * Player cap.
	 */
	public static final int PLAYER_CAP = 2000;

	/**
	 * NPC cap.
	 */
	public static final int NPC_CAP = 4000;

	/**
	 * Server->client direction translation.
	 */
	public static final byte[] XLATE_DIRECTION_TO_CLIENT = new byte[]{1, 2, 4, 7, 6, 5, 3, 0};


	/**
	 * Max number of connections per ip.
	 */
	public static final int MAX_PER_IP = 3;
	
	/**
	 * Return codes.
	 * @author Graham
	 *
	 */
	public static final class ReturnCodes {
		public static final int LOGIN_OK = 2;
		public static final int INVALID_PASSWORD = 3;
		public static final int BANNED = 4;
		public static final int ALREADY_ONLINE = 5;
		public static final int WORLD_FULL = 7;
		public static final int TRY_AGAIN = 11;
	}
}