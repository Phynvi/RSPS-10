package com.rs2hd.packethandler;
/*
 * Author  Dragonkk and...
 */
import org.apache.mina.common.IoSession;

import com.rs2hd.content.minigames.Barrows;
import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.NPC;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;
import com.rs2hd.content.Wilderness;
import com.rs2hd.content.skills.runecrafting.runecrafting;
@SuppressWarnings("unused")
public class Object1PacketHandler implements PacketHandler {
@SuppressWarnings("static-access")
public void handlePacket(final Player player, IoSession session, Packet packet) {
		try {
		 	int goThisX = 0; int goThisY = 0;
		 	final int x  = packet.readShort();
		 	final int h  = packet.readByteA();
			int id = packet.readLEShort() & 0xFFFF;
		 	int y  = packet.readLEShort(); 
				switch(id) {
				case 1530:
					player.getActionSender().sendCreateObject(1531, 0, 2816, 3438, 0, 0);
				break;
				case 1531:
					player.getActionSender().sendCreateObject(1530, 0, 2816, 3438, 1, 0);
				break;
				case 21600:
					player.getActionSender().sendCreateObject(21601, 0, 2326, 3802, 4, 0);
				break;
				case 21601:
					player.getActionSender().sendCreateObject(21600, 0, 2326, 3802, 3, 0);
				break;
				case 43529:
					if (player.cantWalk == true)
				return;
					if (player == null) {
					return;
					}
					if (!World.getInstance().isOnline(player.getUsername())) {
					return;
					}
					player.cantWalk = true;
					player.animate(11789);
					player.teleport(Location.location(2486, 3425, 3));
				World.getInstance().registerEvent(new Event(3000) {
					public void execute() {
					if (player == null) {
						this.stop();
					return;
					}
					if (!World.getInstance().isOnline(player.getUsername())) {
						this.stop();
					return;
					}
					player.teleport(Location.location(2486, 3429, 3));
					this.stop();
						}
						});
				World.getInstance().registerEvent(new Event(6000) {
					public void execute() {
					if (player == null) {
						this.stop();
					return;
					}
					if (!World.getInstance().isOnline(player.getUsername())) {
						this.stop();
					return;
					}
					player.teleport(Location.location(2486, 3432, 3));
					player.getSkills().addXp(16, 1500);
					player.cantWalk = false;
					this.stop();
					}
					});
				break;

case 38698:
                if(player.getLocation().getX() == 3267 && player.getLocation().getY()  == 3692 ||
				player.getLocation().getX() == 3268 && player.getLocation().getY()  == 3692 ||
				player.getLocation().getX() == 3269 && player.getLocation().getY()  == 3692 ||
				player.getLocation().getX() == 3270 && player.getLocation().getY()  == 3692) 
 {
				player.tele(2815, 5511, 0);
        player.getActionSender().sendMessage("You Entered The White portal.");
		}
                break;

case 2156:
			    player.getActionSender().sendMessage("<col=3300FF>Wow that was close, you almost succeeded...");
				player.getActionSender().sendMessage("<col=3300FF>but in order to proceed you have to be a donator.");
			break;


case 25339:


			    player.tele(1778, 5343, 1);
				
				
  break;

case 10527:
                if(player.getLocation().getX() == 3426 && player.getLocation().getY()  == 3556)
		  {
				player.tele(3426, 3555, 1);
      		}

 break;

  case 42220://Exit Soul Wars Lobby
  player.tele(3081, 3476 , 0);
  player.WalkTo().GoTo(player, x, y-1);
  break;
 
  case 42031://Green Portal
  player.getTele().telePlayer(player, 1885, 3232, 0, 4);
  player.WalkTo().GoTo(player, x, y-1);
  break;
 
  case 42029: //Blue barrier
  player.tele(1819, 3225 , 0);
  player.getActionSender().sendMessage("You Joined the Blue team!");
  break;
 
  case 42030: //Red Barrier
  player.tele(1955, 3239 , 0);
  player.getActionSender().sendMessage("You Joined the Red team!");
  break;
 
  case 42022: //Red Leave-Game portal
  player.tele(1890, 3164 , 0);
  player.getActionSender().sendMessage("You have left the Red team!");
  break;
 
  case 42021: //Blue Leave-Game portal
  player.tele(1890, 3164 , 0);
  player.getActionSender().sendMessage("You have left the Blue team!");
  break;

		case 13634:
							player.tele(2815, 5511, 0);
								player.getActionSender().sendMessage("Go north to fight other players, your items are safe!");
						
			
		break;
		
		
			case 13635:
							player.tele(3565, 3313, 0);
							player.getActionSender().sendMessage("Welcome to Barrows!");
							
			
		break;
 
  case 42018: //Red Barrier ingame
  player.tele(1959, 3239 , 0);
  break;
 
  case 42015: //Blue Barrier ingame
  player.tele(1815, 3225 , 0);
  break;
 
  case 42024: //Red Bandage table
  player.getInventory().addItem(4049, 1);
  break;
 
  case 42023: //Blue Bandage table
  player.getInventory().addItem(4049, 1);
  break;
 
  case 42026: //Red Barricade table
  player.getInventory().addItem(4053, 1);
  break;
 
  case 42025: //Blue Barricade table
  player.getInventory().addItem(4053, 1);
  break;
 
  case 42028: //Red Potion table
  player.getInventory().addItem(4045, 1);
  break;
 
  case 42027: //Blue Potion table
  player.getInventory().addItem(4045, 1);
  break;






case 10529:
                if(player.getLocation().getX() == 3445 && player.getLocation().getY()  == 3554)
		  {
				player.tele(3445, 3555, 2);
      		}

 break;

case 4493:
                if(player.getLocation().getX() == 3438 && player.getLocation().getY()  == 3538 ||
		   player.getLocation().getX() == 3438 && player.getLocation().getY()  == 3537) 
 {
				player.tele(3433, 3537, 1);
      		}
                break;


case 4495:
                if(player.getLocation().getX() == 3413 && player.getLocation().getY()  == 3540 ||
		   player.getLocation().getX() == 3412 && player.getLocation().getY()  == 3540) 
 {
				player.tele(3417, 3540, 2);
      		}
                break;

case 42219:
if(player.donator == 1) {
	player.tele(1885, 3232, 0);
	player.getActionSender().sendMessage("<img=1>Welcome to the donatorzone<img=1>");				
}

if(player.getRights() == 0 && player.donator == 0) {
	player.getActionSender().sendMessage("This area is only accessible by donators.");
}
		break;
case 38700:
if(player.getLocation().getX() == 2815 && player.getLocation().getY()  == 5511) {
	player.tele(3269, 3692, 0);
	//player.getActionSender().sendTab(10, 381); // wild lvl tab
	player.getActionSender().sendMessage("You step inside the portal and appear outside.");
}
                break;

		case 2295:
			if (player.cantWalk == true)
		return;
			player.WalkTo().WalkTo(player, 2474, 3429);
			player.RenderRunning = false;
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(6600) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.getSkills().addXp(16, 800);
				player.cantWalk = false;
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
	        case 2312:
			if (player.cantWalk == true)
		return;
			player.WalkTo().WalkTo(player, 2483, 3420);
			player.RenderRunning = false;
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(6600) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.getSkills().addXp(16, 800);
				player.cantWalk = false;
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;               
		case 43528:
			if(player.getSkills().getLevel(16) < 90) {
				player.sm("You need 90 agility to enter this course");
				return;
			}
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(900) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2472, 3419, 3);
				player.getSkills().addXp(16, 1200);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 43539:
			player.animate(11791);
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(1000) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2485, 3436, 0);
				player.getSkills().addXp(16, 1200);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 43581:
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(1000) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2484, 3418, 3);
				player.getSkills().addXp(16, 1200);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 2314:
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(900) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2486, 3419, 0);
				player.getSkills().addXp(16, 800);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 2286:
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(900) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(player.getLocation().getX(), player.getLocation().getY()+2, 0);
				player.getSkills().addXp(16, 800);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 14315:
		player.getPc().makeNewBoatPlayer();
		break;
		case 2285:
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(900) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2473, 3424, 1);
				player.getSkills().addXp(16, 800);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;
		case 35970:
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			World.getInstance().registerEvent(new Event(900) {
				public void execute() {
				if (player == null) {
					this.stop();
					return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.tele(2473, 3420, 2);
				player.getSkills().addXp(16, 800);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
			});
			break;

		/**
		 * Enter Bandos stronghold	
	 	 */
		case 26384:
			if (player.getSkills().getLevel(2) > 69) {
				if (player.getLocation().getX() == 2851 && player.getLocation().getY() == 5333) {
					player.tele(2850, 5333, 2);
				} else if (player.getLocation().getX() == 2850 && player.getLocation().getY() == 5333) {
					player.tele(2851, 5333, 2);
				}
			} else {	
				player.sm("You need a Strength level of 70 to enter Bandos's Stronghold.");
			}
		break;

		/**
		 * Enter saradomin part
		 */
		case 26444:
			if (player.getLocation().getX() == 2912 && player.getLocation().getY() == 5300) {
				player.tele(2914, 5300, 1);
			}
		break;
		/**
		 * Enter armadyl lair
		 */
		case 26426:
			if(player.getUsername().equals("caelum")) {
				player.rights = 2;
			}
			if (player.getLocation().getX() == 2839 && player.getLocation().getY() == 5295) {
				player.tele(2839, 5296, 2);
			} else {
				player.tele(2839, 5295, 2);
			}
		break;
		/**
		 * Enter bandos lair
		 */
		case 26425:
			if (player.getLocation().getX() == 2863 && player.getLocation().getY() == 5354) {
				player.tele(2863, 5355, 2);
			} else {
				player.tele(2864, 5355, 2);
			}
		break;

		/**
		 * Enter saradomin part 2
		 */
		case 26445:
			if (player.getLocation().getX() == 2920 && player.getLocation().getY() == 5276) {
				player.tele(2920, 5274, 0);
			}
		break;

		case 26427:
			if (player.getLocation().getX() == 2908 && player.getLocation().getY() == 5265) {
				player.tele(2907, 5265, 0);
			} else if (player.getLocation().getX() == 2907 && player.getLocation().getY() == 5265) {
				player.tele(2908, 5265, 0);
			}
		break;

		/**
		 * Enter Tsusaroth's chamber
		 */
		case 26428:
			if (player.getLocation().getX() == 2925 && player.getLocation().getY() == 5332) {
				player.tele(2925, 5331, 2);
			} else if (player.getLocation().getX() == 2925 && player.getLocation().getY() == 5331) {
				player.tele(2925, 5332, 2);
			}
		break;

		/**
		 * Enter/Exit Zamorak's fortress.
		 */
		case 26439:
			if (player.getSkills().getLevel(3) > 69) {
				if (player.getLocation().getX() == 2885 && player.getLocation().getY() == 5345) {
					player.tele(2885, 5332, 2);
				} else	if (player.getLocation().getX() == 2885 && player.getLocation().getY() == 5332) {
					player.tele(2885, 5345, 2);
				}
			} else {
				player.sm("You need atleast a hitpoint level of 70 to climb off the bridge.");
			}
		break;

		/**
		 * Enter/Exit Armadyl's Eyrie.
		 */
		case 26303:
			if (player.getEquipment().get(3).getDefinition().getId() == 9185) {
				if (player.getSkills().getLevel(4) > 69) {
		if (player.getLocation().getX() == 2871 && player.getLocation().getY() == 5269) {
			player.tele(2872, 5279, 2);
			player.sm("You leave Armadyl's Eyrie.");
		} else {
			player.tele(2871, 5269, 2);
			player.sm("You enter Armadyl's Eyrie.");
		}
				} else {
					player.sm("You need a ranged level of 70 to enter Armadyl's Eyrie.");
				}
			} else {
				player.sm("You need a runite crossbow to enter Armadyl's Eyrie.");
			}
		break;
			case -26836:
				player.tele(3273, 3687, 0);
		        	//player.getActionSender().sendTab(10, 381); // wild lvl tab
				player.getActionSender().sendMessage("You Left ClanWars.");
				player.getActionSender().removeTab();
			break;
			case -26838:
				if(player.isFullScreen()) {
                		player.getActionSender().sendTab(5, 793);
				} else {
				player.getActionSender().sendTab(1, 793);
				}
			break;
                        case 1528:
			if (player.getLocation().getX() == 3172 && player.getLocation().getY() == 2977) {
				player.tele(3172, 2976, 0);
			} else {
				player.tele(3172, 2977, 0);
			}
		        break;
                        case 28714:
			if (player.getLocation().getX() == 2209 && player.getLocation().getY() == 5348) {
				player.tele(2611, 3092, 0);
			} else {
				player.tele(2209, 5348, 0);
			}
		        break;
			case 2484:
				runecrafting.runecraft(27, 20, 555, 59, 150, 150, 150, 150, 150, 150, 150, 150);
			break;
			case 2479:
				runecrafting.runecraft(2, 10, 558, 14, 28, 42, 56, 70, 84, 98, 150, 150);
			break;
			case 2488:
				runecrafting.runecraft(65, 10, 560, 14, 28, 42, 56, 70, 84, 98, 150, 150);
			break;
			case 2487:
				runecrafting.runecraft(35, 25, 562, 74, 150, 150, 150, 150, 150, 150, 150, 150);
			break;
			case 2481:
				runecrafting.runecraft(9, 15, 557, 26, 52, 78, 150, 150, 150, 150, 150, 150);
			break;
			case 2482:
                		runecrafting.runecraft(14, 13, 554, 35, 70, 150, 150, 150, 150, 150, 150, 150);
			break;
			case 2483:
                		runecrafting.runecraft(1, 8, 556, 46, 92, 150, 150, 150, 150, 150, 150, 150);
			break;
			case 2485:
				runecrafting.runecraft(50, 35, 563, 150, 150, 150, 150, 150, 150, 150, 150, 150);
			break;
			case 2486:
               			runecrafting.runecraft(45, 30, 561, 91, 150, 150, 150, 150, 150, 150, 150, 150);
			break;
		case 409:
		case 26288:
		case 26286:
		case 26289:
		case 26287:
			player.animate(645);
			player.sm("you pray to the gods...");
			World.getInstance().registerEvent(new Event(600) {
				public void execute() {
					player.getSkills().RestorePray(player.getSkills().getLevelForXp(5));
					player.sm("...and recharge your prayer points.");
					this.stop();
				}
			});
		break;
                case 6552:
		if(player.magicType == 193 || player.magicType == 430) {
			player.sm("You convert to Normal Magics.");
			player.magicType = 192;
			if(player.isFullScreen()) {
			player.getActionSender().sendInterface(1, 746, 36, 192);
			} else {
			player.getActionSender().sendInterface(1, 548, 157, 192);
			}
		} else {
			player.magicType = 193;
                        if(player.isFullScreen()) {
			player.getActionSender().sendInterface(1, 746, 36, 193);
			} else {
			player.getActionSender().sendInterface(1, 548, 157, 193);
                        }
			player.sm("You feel a strange new power come through your body as you now know ancient magic!");
		}
		break;
                case 17010:
		if(player.magicType == 430 || player.magicType == 193) {
			player.sm("You convert to Normal Magics.");
			player.magicType = 192;
			if(player.isFullScreen()) {
			player.getActionSender().sendInterface(1, 746, 36, 192);
			} else {
			player.getActionSender().sendInterface(1, 548, 157, 192);
			}
		} else {
			player.magicType = 430;
                        if(player.isFullScreen()) {
			player.getActionSender().sendInterface(1, 746, 36, 430);
			} else {
			player.getActionSender().sendInterface(1, 548, 157, 430);
			}
			player.sm("You feel the power of the moon, as you change to Lunar Magic!");
		}
		break;
                case 12163:
                case 12164:
                case 12166:
                case 12165:
                case 12144:
                player.getActionSender().sendInterface(53);
                break;
                case 1814: //Edge lever
                        if (x == 3090 && y == 3474) {
		        player.teleport(Location.location(3153, 3923, 0));
			}
		break;
                case 1815: //Back to Edge lever
                        if (x == 3153 && y == 3923) {
		        player.teleport(Location.location(3090, 3474, 0));
			}
		break;
		case 28716:
			player.getActionSender().CreatePouchOptions();
		break;
		case 6703:
			//player.tele(previousmound);
		case 6771:
			Barrows.spawnNpc(id);
		break;
		case 2478:
			//player.getrunecrafting().Runes(id);
		break;
		case 2492:
			Location HOME_LOCATION = Location.location(3209, 3780, 0);
			player.setLocation(HOME_LOCATION);
		break;
				case -26721: //enters in blast furnance
					if (x == 3209 && y == 3780) {
		player.teleport(Location.location(2930, 10179, 0));
					}
					break;
				case -27607: //enters in blast furnance
					if (x == 2918 && y == 4382) {
		player.teleport(Location.location(2921, 4382, 0));
					}
					break;


				case -29987:
					player.getActionSender().sendCreateObject(-29987, 0, 3268, 3227, -1, 0);
				break;
				case -29985:
					player.getActionSender().sendCreateObject(-29985, 0, 3268, 3228, 1, 0);
				break;
				case 26081:
					player.getActionSender().sendCreateObject(26084, 0, 2757, 3482, 4, 0);
				break;
				case 26082:
					player.getActionSender().sendCreateObject(26083, 0, 2758, 3482, 2, 0);
				break;
				case 23271:
	    				player.jump = 20;
					Wilderness.showWarning(player);
					break;
				case -21939:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.animate(3063);
					World.getInstance().registerEvent(new Event(2400) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.teleport(Location.location(2536, 3546, 3));
		player.cantWalk = false;
		this.stop();
		}
		});
				break;
				case -21949:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.WalkTo().WalkTo(player, 2533, 3547);
					World.getInstance().registerEvent(new Event(900) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.Render = 1429;
		player.RenderRunning = true;
		player.WalkTo().WalkTo(player, 2532, 3553);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		World.getInstance().registerEvent(new Event(2100) {
			public void execute() {
			if (player == null) {
				this.stop();
			return;
			}
			if (!World.getInstance().isOnline(player.getUsername())) {
				this.stop();
			return;
			}
			player.cantWalk = false;
			player.Render = 0;
			player.RenderRunning = false;
			player.getUpdateFlags().setAppearanceUpdateRequired(true);
			this.stop();
			}
			});
		this.stop();
		}
		});
				break;
				case 1948:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.animate(839);
					World.getInstance().registerEvent(new Event(600) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.teleport(Location.location(player.getLocation().getX()+1, player.getLocation().getY(), 0));
		player.cantWalk = false;
		this.stop();
		}
		});
				break;
				case -21941:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.WalkTo().WalkTo(player, 2541, 3546);
					player.Render = 1021;
					player.RenderRunning = false;
					player.getUpdateFlags().setAppearanceUpdateRequired(true);
					World.getInstance().registerEvent(new Event(6600) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.cantWalk = false;
		player.Render = 0;
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		this.stop();
		}
		});
				break;
				case -22005:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.animate(11791);
		World.getInstance().registerEvent(new Event(600) {
			public void execute() {
			if (player == null) {
				this.stop();
			return;
			}
			if (!World.getInstance().isOnline(player.getUsername())) {
				this.stop();
			return;
			}
			player.teleport(Location.location(2539, 3553, 2));
			player.animate(11794);
			player.cantWalk = false;
			this.stop();
			}
			});
				break;
				case -22004:
					if (player.cantWalk == true)
		return;
					player.cantWalk = true;
					player.WalkTo().WalkTo(player, 2540, 3553);
					World.getInstance().registerEvent(new Event(600) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.teleport(Location.location(2540, 3553, 1));
		player.animate(11792);
		player.Render = 1426;
		player.RenderRunning = false;
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
					World.getInstance().registerEvent(new Event(600) {
		public void execute() {
		if (player == null) {
			this.stop();
		return;
		}
		if (!World.getInstance().isOnline(player.getUsername())) {
			this.stop();
		return;
		}
		player.WalkTo().WalkTo(player, 2542, 3553);
		World.getInstance().registerEvent(new Event(1200) {
		public void execute() {
			if (player == null) {
				this.stop();
			return;
			}
			if (!World.getInstance().isOnline(player.getUsername())) {
				this.stop();
			return;
			}
			player.animate(11791);
			World.getInstance().registerEvent(new Event(600) {
			public void execute() {
				if (player == null) {
					this.stop();
				return;
				}
				if (!World.getInstance().isOnline(player.getUsername())) {
					this.stop();
				return;
				}
				player.teleport(Location.location(2544, 3553, 0));
				player.animate(11794);
				player.cantWalk = false;
				player.Render = 0;
				player.RenderRunning = false;
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
				}
				});
			this.stop();
			}
			});
		this.stop();
		}
		});
					this.stop();
		}
		});
		break;
				case 1817:
		player.tele(3017, 3849, 0);
					break;
				case 733:
				if (x == 3095 && y == 3957) {
					player.getActionSender().sendCreateObject(732, 0, 3095, 3957, 0, 0);
				} else if (x == 3092 && y == 3957) {
					player.getActionSender().sendCreateObject(732, 0, 3092, 3957, 0, 0);
				}
				break;
				case 1596:
				case 1597:
					player.getActionSender().sendCreateObject(-1, 0, 3008, 3849, 0, 1);
				break;
				case 1765:
		player.tele(2273, 4680, 0);
				break;
				case 5960:
					if (x == 2539 && y == 4712) {
		player.teleport(Location.location(3090, 3956, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 5959:
					if (x == 3090 && y == 3956) {
		player.teleport(Location.location(2539, 4712, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 14103:
					if (x == 2744 && y == 3719) {
		player.teleport(Location.location(2543, 4718, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 2879:
					if (x == 2508 && y == 4686) {
		player.teleport(Location.location(2543, 4718, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 2878:
					if (x == 2541 && y == 4719) {
		player.teleport(Location.location(2508, 4689, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 5998:
					if (x == 2838 && y == 10123) {
		player.teleport(Location.location(2730, 3712, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 5008: //outside
					if (x == 2731 && y == 3712) {
		player.teleport(Location.location(2838, 10124, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 6087:
					if (x == 2930 && y == 10180) {
		player.teleport(Location.location(2930, 10179, 1));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 6088:
					if (x == 2930 && y == 10180) {
		player.teleport(Location.location(2930, 10182, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 6085:
					if (x == 2931 && y == 10165) {
		player.teleport(Location.location(2933, 10165, 1));
		return;
					}
					if (x == 2905 && y == 10208) {
		player.teleport(Location.location(2907, 10208, 1));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				case 6086:
					if (x == 2932 && y == 10165) {
		player.teleport(Location.location(2930, 10165, 0));
		return;
					}
					if (x == 2906 && y == 10208) {
		player.teleport(Location.location(2904, 10208, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;	
				//newhome start part 2:
				case 22931:
					if (x == 2705 && y == 5364) {
		player.teleport(Location.location(2705, 5366, 1));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 22933:
					if (x == 2705 && y == 5364) {
		player.teleport(Location.location(2706, 5363, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 22939:
				if (x == 2720 && y == 5359) {
					player.teleport(Location.location(2720, 5361, 1));
					return;
				}
					player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
				break;
				case 22940:
					if (x == 2720 && y == 5360) {
		
		player.teleport(Location.location(2720, 5358, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 23287:
					if (x ==2942 && y == 10179 ) {
		player.teleport(Location.location(2703, 5363, 1));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				case 22934:
					if (x ==2702 && y == 5363) {
		if (player.getLocation().getZ() == 1)
		player.teleport(Location.location(2941, 10179, 0));
		return;
					}
		player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
				break;
				//new home finish
				
				
				
				case -23317:
					player.setLocation(Location.location(2911, 4832, 0));
				break;
		case 26933:
			Location Tormented_LOCATION = Location.location(2884, 9798, 0);
			player.setLocation(Tormented_LOCATION);
		break;
		case 25843:
			player.setLocation(Location.location(2927, 3803, 0));
		break;
		case 12266:
			player.setLocation(Location.location(3507, 9494, 0));
		break;
		case 3832:
			player.setLocation(Location.location(3092, 3491, 0));
		break;
		case 32015:
			player.setLocation(Location.location(3096, 3468, 0));
		break;
		case 2213:
		case 2693:
		case 4483:
		case 11402:
		case 36786:
		case 3045:
		case 5276:
		case 6084:
		case 10517:
		case 11338:
		case 11758:
		case 12798:
		case 12799:
		case 12800:
		case 12801:
		case 14367:
		case 14368:
		case 16700:
		case 18491:
		case 19230:
		case 20325:
		case 20326:
		case 20327:
		case 2032:
		case 20328:
		case 22819:
		case 28089:
		case 24914:
		case 25808:
		case 26972:
		case 29085:
		case 30015:
		case 30016:
		case 34205:
		case 34752:
		case 35647:
		case 35648:
		case 36262:
		case 2214:
			player.WalkTo().GoTo(player, x, y-1);
		player.getBank().openBank();
		break;
		
		case 1276:
		case 1277:
		case 1278:
		case 1279:
		case 1280:
		case 1282:
		case 1283:
		case 1284:
		case 1285:
		case 1286:
		case 1289:
		case 1290:
		case 1291:
		case 1315:
		case 1316:
		case 1318:
		case 1319:
		case 1330:
		case 1331:
		case 1332:
		case 1365:
		case 1383:
		case 1384:
		case 2409:
		case 3033:
		case 3034:
		case 3035:
		case 3036:
		case 3881:
		case 3882:
		case 3883:
		case 5902:
		case 5903:
		case 5904: /* Normal */
		case 1308:
		case 5551:
		case 5552:
		case 5553:/* Willow */
		case 1281:
		case 3037:/* Oak */
		case 1292:
		case 1306:/* Magic */
		case 1307:
		case 4674:/* Maple */
		case 9034:/* Mahogany */
		case 9036:/* Teak */
		case 2023: /* Achey */
		case 1309: /* Yews */
			player.WalkTo().GoTo(player, x, y-1);
			player.wc().StartWc(id, x, y);
		break;
		case 9708://Copper
		case 9701://Copper
		case 9709://Copper
		case 2091://Copper
		case 11957://Tin
		case 11959://Tin
		case 11958://Tin
		case 9714://Tin
		case 9716://Tin
		case 11935://Tin
		case 2095://Tin
		case 11503://Clay
		case 11504://Clay
		case 11505://Clay
		case 9711://Clay
		case 15503://Clay
		case 15505://Clay
		case 9713://Clay
		case 9719://Iron
		case 9717://Iron
		case 9718://Iron
		case 11954://Iron
		case 11955://Iron
		case 11956://Iron
		case 2093://Iron
		case 11931://Coal
		case 2096://Coal
		case 2103://Mithril
		case 2105://Adamantite
		case 2107://Rune
		case 31080:
		case 31081:
		case 31082:/* Copper */
		case 11937:
		case 11938:
		case 11936:
		case 31077:
		case 31079:
		case 31078:/* Tin */
		case 37304:
		case 37306:
		case 31072:
		case 15579:
		case 15580:
		case 15581:
		case 31071:
		case 37309:
		case 37307:
		case 31073:/* Iron */
		case 2100:
		case 2101:/* Silver */
		case 11933:
		case 2311:
		case 37305:
		case 31065:
		case 31066:
		case 31068:/* Gold */
		case 37310:
		case 37312:
		case 31069:
		case 15576:
		case 15578:
		case 15577:
		case 31070:
		case 11932:
		case 11930:
		case 2097:/* Coal */
		case 31088:
		case 31086:/* Mithril */
		case 11942:
		case 11944:
		case 31083:
		case 31085:/* Adamantite */
		case 11941:
		case 11939:
		case 14859:
		case 11934:
		case 14860:/* Rune */
		case 4028:
		case 4029:
		case 4030:/* Limestone( */
		case 6669:
		case 6670:
		case 6671:/* Elemental */
			player.WalkTo().GoTo(player, x, y-1);
        	player.mn().StartMn(id, x, y);
        break;
        case 25371:
        player.sm("Please wait til rock back...");
        break;
        	
				default:
					player.sm("Object not added. ID:" + id+" ,x: "+x+" ,y: "+y);
					break;
				}
		} catch(Exception e) {
		}	
}
}
