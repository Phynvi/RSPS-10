package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

public class InputPacketHandler implements PacketHandler {

        @Override
        public void handlePacket(Player player, IoSession session, Packet packet) {
                switch (packet.getId()) {
			case 172:
				packet.readByte();
				String string = packet.readRS2String();
				player.getInputHandler().handleStringInput(string);
			break;
                case 197:
                	//packet.readByte();
    				String StringTalk = packet.readRS2String();
                     if (player.getTemporaryAttribute("AddNote") != null) {
                     	player.getFamiliarInventory().addNote(player, StringTalk);
                        player.removeTemporaryAttribute("AddNote");
				}
                     if (player.getTemporaryAttribute("EditNote") != null) {
                      	player.getFamiliarInventory().editNote(player, StringTalk);
                         player.removeTemporaryAttribute("EditNote");
 				}
                break;
                case 206:
                     int  amount = packet.readInt();
                        if (player.getTemporaryAttribute("bankDepositX") != null) {
                                player.getBank().bankItem(
                                                (Integer) player.getTemporaryAttribute("bankDepositX"),
                                                amount);
                                player.removeTemporaryAttribute("bankDepositX");
                        } else if (player.getTemporaryAttribute("bankWithdrawX") != null) {
                                player
                                                .getBank()
                                                .withdrawItem(
                                                                (Integer) player
                                                                                .getTemporaryAttribute("bankWithdrawX"),
                                                                amount);
                                player.removeTemporaryAttribute("bankWithdrawX");
				}
                        if (player.getTemporaryAttribute("OfferX") != null) {
                               player.getRequests().getTrade().offerItem(player, (Integer) player.getTemporaryAttribute("OfferX"), amount);
                                player.removeTemporaryAttribute("OfferX");
				}
                        if (player.getTemporaryAttribute("RemoveX") != null) {
                            player.getRequests().getTrade().removeItem(player, (Integer) player.getTemporaryAttribute("RemoveX"), amount);
                             player.removeTemporaryAttribute("RemoveX");
				}
                        break;
                }
       	}

}