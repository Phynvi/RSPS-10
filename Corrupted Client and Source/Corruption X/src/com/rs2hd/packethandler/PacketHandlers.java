package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.util.log.Logger;

/**
 * Wholly static class used to handle packets.
 * @author Graham
 *
 */
public class PacketHandlers {
	
	/**
	 * Packet handlers array.
	 */
	private static PacketHandler[] handlers = new PacketHandler[256];

	/**
	 * Logger instance.
	 */
	private static Logger logger = Logger.getInstance();
	
	/**
	 * Prevent an instance being created.
	 */
	private PacketHandlers() {}
	
	/**
	 * Loads the packet handlers.
	 */
	public static void loadHandlers() {
        QuietPacketHandler quiet = new QuietPacketHandler();
        handlers[0] = quiet;
        handlers[4] = quiet;
        handlers[87] = quiet;
        handlers[91] = quiet;
        handlers[148] = quiet;
        handlers[158] = quiet;
        handlers[235] = quiet;
        handlers[255] = quiet;

        ClientAction ca = new ClientAction();
        handlers[170] = ca;

        IdlePacketHandler idle = new IdlePacketHandler();
        handlers[244] = idle;

        WalkPacketHandler walk = new WalkPacketHandler();
        handlers[119] = walk;
        handlers[163] = walk;
        handlers[165] = walk;

        NpcWalkPacketHandler nwalk = new NpcWalkPacketHandler();
        handlers[166] = nwalk;

        ClanPacketHandler cc = new ClanPacketHandler();
        handlers[47] = cc;
        handlers[36] = cc;

        ActionButtonPacketHandler actionbutton = new ActionButtonPacketHandler();
	final int[] packetDataa = new int[] { 
		19,216,205,193,173,89,3,5,76,221,216,68 };
	for (int i : packetDataa) {
		handlers[i] = actionbutton;
	}

	ItemPacketHandler item = new ItemPacketHandler();
		handlers[29] = item;
		handlers[66] = item;
		handlers[202] = item;
		handlers[117] = item;
		handlers[112] = item;
		handlers[189] = item;
		handlers[194] = item;
		handlers[229] = item;
		handlers[234] = item;
		handlers[248] = item;
		handlers[253] = item;
		handlers[69] = item;

	CommandPacketHandler command = new CommandPacketHandler();
		handlers[171] = command;

     	ChatPacketHandler chat = new ChatPacketHandler();
        handlers[182] = chat;

        DialogueOptions dialogue = new DialogueOptions();
        handlers[147] = dialogue;

        InputPacketHandler input = new InputPacketHandler();
        handlers[206] = input;
        handlers[172] = input;

        FriendsPacketHandler friends = new FriendsPacketHandler();
        handlers[226] = friends;
        handlers[123] = friends;
        handlers[92] = friends;

        RemoveInterfacePacketHandler removeinterface = new RemoveInterfacePacketHandler();
        handlers[63] = removeinterface;

        ExaminePacketHandler examines = new ExaminePacketHandler();
        handlers[38] = examines;

        NpcPacketHandler npc = new NpcPacketHandler();
        handlers[217] = npc;
        handlers[38] = npc;
        handlers[207] = npc;

        MagicOnNpc mon = new MagicOnNpc();
        handlers[84] = mon;

        SummonPacketHandler summon = new SummonPacketHandler();
        handlers[254] = summon;

        PlayerPacketHandler player = new PlayerPacketHandler();
        handlers[114] = player;
        handlers[140] = player;
        handlers[141] = player;
        handlers[152] = player;

        MagicOnPlayer mop = new MagicOnPlayer();
        handlers[79] = mop;
        MagicOnItem moi = new MagicOnItem();
        handlers[78] = moi;

        ObjectPacketHandler object = new ObjectPacketHandler();
	    handlers[190] = object;

        Object1PacketHandler object1 = new Object1PacketHandler();
	    handlers[45] = object1;

        for(int i = 0; i < handlers.length; i++) {
            if(handlers[i] != null) {
                logger.info("loaded "+i+" PacketHandlers.");
            }
        }
    }
	
	/**
	 * Handles a packet.
	 * @param session
	 * @param p
	 */
	public static void handlePacket(IoSession session, Packet p, Player player) {
		try {
			if(!p.isBare()) {
				PacketHandler handler = handlers[p.getId()];
				if(handler == null) {
					if(player.getRights() == 2) {
						System.out.println("Unhandled packet: " + p + ".");
					}
				} else {
					handler.handlePacket((Player) session.getAttachment(), session, p);
				}
			}
		} catch(Exception e) {
		}
	}

}