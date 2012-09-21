package com.rs2hd.content.skills.combat;

import com.rs2hd.model.*;
import com.rs2hd.util.Misc;
import com.rs2hd.net.Packet;
import com.rs2hd.Constants;

/**
 * Handles MagicButtons.
 * @author caelum
 *
 */
@SuppressWarnings("unused")
public class Magic {


	@SuppressWarnings("static-access")
	public static void MagicActionButtons(Player player, int buttonId) {
				try {
		for(Player ap : World.getInstance().getPlayerList()) {

		switch(player.magicType) {
		case 192:
			switch(buttonId) {
		case 25:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air strike");
				player.pvn().autoCast = 25;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 28:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water strike");
				player.pvn().autoCast = 28;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 30:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth strike");
				player.pvn().autoCast = 30;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 32:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire strike");
				player.pvn().autoCast = 32;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 34:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air bolt");
				player.pvn().autoCast = 34;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 39:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water bolt");
				player.pvn().autoCast = 39;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 42:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth bolt");
				player.pvn().autoCast = 42;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 45:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire bolt");
				player.pvn().autoCast = 45;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 49:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air blast");
				player.pvn().autoCast = 49;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 52:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water blast");
				player.pvn().autoCast = 52;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 58:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth blast");
				player.pvn().autoCast = 58;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 38:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire blast");
				player.pvn().autoCast = 38;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 70:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting air wave");
				player.pvn().autoCast = 70;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 73:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting water wave");
				player.pvn().autoCast = 73;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 77:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting earth blast");
				player.pvn().autoCast = 77;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 80:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting fire wave");
				player.pvn().autoCast = 80;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 68:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting zammorak flames");
				player.pvn().autoCast = 68;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 67:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting guthix claws");
				player.pvn().autoCast = 67;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
		case 66:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting saradomin strike");
				player.pvn().autoCast = 66;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCast = -1;
			}
  			break;
        		case 24:
				//player.homeTele = 18;
       				player.getTele().telePlayer(player, 3162, 3485, 0, 2);
  			break;
        		case 40:
       				player.getTele().telePlayer(player, 3212 ,3428 , 0, 2);
  			break;
       			case 43:
       				player.getTele().telePlayer(player, 3221 ,3219 , 0, 2);
  			break;
        		case 46:
       				player.getTele().telePlayer(player, 2964 ,3380 , 0, 2);
  			break;
        		case 51:
				player.getTele().telePlayer(player, 2757 ,3478 , 0, 2);	
  			break;
       			case 57:
				player.getTele().telePlayer(player, 2662 ,3308 , 0, 2);
  			break;
			}
			System.out.println("Modern Action Button " + buttonId);
			break;

			case 193:
			switch(buttonId) {
        	case 48:
       				player.getTele().ancientTelePlayer(player, 3162 ,3485 , 0, 2);
  			break;
		case 23:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 23;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
			break;
		case 35:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 35;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 31:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 31;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 21:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 21;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 25:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 25;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 33:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 33;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 29:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 29;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 22:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 22;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 26:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 26;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 34:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 34;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 30:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 30;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 20:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 20;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 24:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 24;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 32:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 32;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
		case 28:
			if(player.pvn().autoCasting == false) {
				player.pvn().autoCasting = true;
				player.sm("You are now autocasting ancients");
				player.pvn().autoCastAncient = 28;
				player.pvn().autoCast = -1;
			} else {
				player.pvn().autoCasting = false;
				player.sm("You stop autocasting");
				player.pvn().autoCastAncient = -1;
				player.pvn().autoCast = -1;
			}
  			break;
			}			
			System.out.println("Ancients Action Button " + buttonId);
			break;

			
			case 430:
			switch(buttonId) {
			}				
			System.out.println("Lunar Action Button " + buttonId);
			break;

			default:
			System.out.println("Unhandled MagicActionButtons " +player.magicType+ " " + buttonId);
			break;
		}
	}
				} catch (Exception e) { //Stops Exceptions from happening and crashing the server.
				} // End of Exception
}
}