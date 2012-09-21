package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.GameEngine;
import com.rs2hd.content.skills.thief.pickpocket;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;
import com.rs2hd.Constants;
/**
 * Handles any commands sent to the client.
 * @author Graham
 *
 */
@SuppressWarnings("unused")
public class TalkPacketHandler implements PacketHandler {

@Override
public void handlePacket(Player p, IoSession session, Packet packet) {
	try {
final int Nid = packet.readShortA();
	if(Nid < 0 || Nid >= Constants.NPC_CAP) {
		return;
	}
final NPC n = World.getInstance().getNpcList().get(Nid);
	if(n == null) {
		return;
	}
switch(n.getId()) {
case 322:
      p.fish().TryStartFishing(n.getId()+10000,n);
break;
case 29:
      p.getActionSender().sendInterfaceConfig(230, 7, false);
      p.getActionSender().sendInterfaceConfig(230, 10, true);
      p.getActionSender().sendString("Select an Option", 230, 1);
      p.getActionSender().sendString("Who are you?", 230, 2);
      p.getActionSender().sendString("Can I ask you some questions about resting?", 230, 3);
      p.getActionSender().sendString("That's all for now.", 230, 4);
      p.getActionSender().sendChatboxInterface(230);
break;
case 8279:
case 2205:
case 2206:
      p.NpcDialogue().StartTalkingTo(n);
break;
default:
p.sm("npc not added: "+n.getId());
break;
				}
			} catch(Exception e) {
		}
	}
}
