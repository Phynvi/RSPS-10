package com.rs2hd.model;

import com.rs2hd.content.skills.combat.PkDefinitions;
import com.rs2hd.model.Entity;

/**
 * Manages equipment.
 * @author Graham
 *
 */
public class Equipment {
		
	public static final int SLOT_HAT = 0, SLOT_CAPE = 1, SLOT_AMULET = 2, SLOT_WEAPON = 3, SLOT_CHEST = 4, SLOT_SHIELD = 5, SLOT_LEGS = 7, SLOT_HANDS = 9, SLOT_FEET = 10, SLOT_RING = 12, SLOT_ARROWS = 13;
	public static final String[] BONUSES = { "Stab", "Slash", "Crush", "Magic", "Range", "Stab", "Slash", "Crush", "Magic", "Range", "Strength", "Prayer" };
	
	public Container<Item> equipment = new Container<Item>(SIZE, false);
	private transient boolean specialWeapon = false;
	
	public boolean isSpecialWeapon() {
		return specialWeapon;
	}
	
	public Equipment() {
	}
	public boolean contains(int item) {
		return equipment.containsOne(new Item(item));
	}

	public void reset() {
		equipment.reset();
		refresh();
	}
	public void deleteItem(int item, int amount) {
		try {
		equipment.remove(new Item(item, amount));
		refresh();
		} catch(Exception e) {
		}
	}
	public int numberOf(int id) {
		try {
		return equipment.getNumberOf(new Item(id, 1));
		} catch(Exception e) {
		return 0;
		}
	}
	public void deleteAll(int item) {
		try {
		equipment.removeAll(new Item(item));
		refresh();
		} catch(Exception e) {
		}
	}
	
	private transient int tempWalkAnim;
	
	public void setTempWalkAnim(int i) {
		try {
		this.tempWalkAnim = i;
		} catch(Exception e) {
		}
	}
	public void setNoTempWalkAnim() {
		try {
		this.tempWalkAnim = -1;
		} catch(Exception e) {
		}
	}
	
	public Item get(int slot) {
		return equipment.get(slot);
	}
	
	public void set(int slot, Item item) {
		try {
		equipment.set(slot, item);
		refresh();
		} catch(Exception e) {
		}
	}
	
	public void clear() {
		try {
		equipment.clear();
		refresh();
		} catch(Exception e) {
		}
	}
	public void setAttStyle() {
		int MaxSize = 3;
		if(player.getEquipment().get(3) == null) {
			MaxSize = 2;
		}else if(player.getEquipment().get(3) != null) {
		String WeaponName = get(3).getDefinition().getName();
		if (WeaponName.contains("bow")
			|| WeaponName.contains("Bow")
			|| WeaponName.contains("knife")
			|| WeaponName.contains("Knife")
			|| WeaponName.contains("Knife")
			|| WeaponName.equals("Hand cannon")
			|| WeaponName.contains("whip")
			|| WeaponName.contains("halberd")
			|| WeaponName.contains("Staff")
			|| WeaponName.contains("staff"))
			MaxSize = 2;
		}
		if (player.getAttackStyle() > MaxSize)
			player.setAttackStyle(MaxSize);
		player.getActionSender().sendConfig(43, player.getAttackStyle());
	}
	public String getAttStyle() {
		String style = null;
		if(player.getEquipment().get(3) == null) {
			switch(player.getAttackStyle()) {
			case 0:
				style = "Attack";
				break;
			case 1:
				style = "Strength";
				break;
			case 2:
				style = "Defence";
				break;
			}
		}else if(player.getEquipment().get(3) != null) {
		if (PkDefinitions.usingRange(player)) {
			switch(player.getAttackStyle()) {
			case 0:
				style = "Ranged";
				break;
			case 1:
				style = "Ranged";
				break;
			case 2:
					style = "RangedDefence";
				break;
			}
			
		}else{
			String WeaponName = get(3).getDefinition().getName();
		switch(player.getAttackStyle()) {
		case 0:
			style = "Attack";
			if (WeaponName.contains("halberd"))
			style = "Shared";
			break;
		case 1:
			style = "Strength";
			if (WeaponName.contains("whip"))
			style = "Shared";
			break;
		case 2:
			style = "Shared";
			if (WeaponName.contains("whip")
				|| WeaponName.contains("Staff")
				|| WeaponName.contains("staff")
				|| WeaponName.contains("halberd"))
			style = "Defence";
			else if (WeaponName.contains("godsword")
				|| WeaponName.contains("2h sword")
				|| WeaponName.contains("greataxe"))
			style = "Strength";		
			break;
		case 3:
			style = "Defence";
			break;
		}
		}
		}
		return style;
	}
	public void setWeapon() {
		try {
			setAttStyle();
			if(player.justloggedin == 0) {
			player.getActionSender().SendSound(2248,100, 0);
			}
			player.usingSpecial = false;
			player.resetAttack();	
		if(player.getEquipment().get(3) == null) {
			player.getActionSender().sendTab(85, 92);
			player.getActionSender().sendString("Unarmed", 92, 0);
			return;
		}
		} catch(Exception e) {
		}
	}
public int getRenderAnim() {
  if (get(3) == null) {
   return 1426;
  }
  Item item = get(3);
  int id = item.getDefinition().getId();
  switch(id) {
   case -1:
   	return 1426;
   default:
   	return 1426;
   case 837://175's
   case 767:
    	return 175;
 
   case 839://176's
   case 841:
   case 13719:
    	return 176;
 
   case 12845://370's
   case 12846:
   case 12847:
   case 12848:
   case 12849:
    	return 370;
 
   case 1307://124's
   case 1309:
   case 1311:
   case 1313:
   case 1315:
   case 1317:
   case 1319:
    	return 124;
 
   case 14152://158's
   case 14154:
   case 14156:
   case 14158:
   case 14160:
   case 14102:
   case 14110:
    	return 158;
 
   case 1335://1430's
   case 1337:
   case 1339:
   case 1341:
   case 1343:
   case 1345:
   case 1347:
    	return 1430;
 
   case 1387://1272's
    	return 1272;
 
   case 1419://1271's
    	return 1271;
 
   case 4037://131's
   case 4039:
    	return 131;
 
   case 4084://1119's
    	return 1119;
 
   case 4151://1578's
    	return 1578;
 
   case 4886://1580's
   case 4887:
   case 4888:
   case 4718:
   case 4889:
   case 4890:
    	return 1580;
 
   case 4934://372's
   case 4935:
   case 4936:
   case 4937:
   case 4938:
   case 4734:
    	return 372;
 
   case 4982://373's
   case 4983:
   case 4984:
   case 4985:
   case 4986:
   case 4755:
    	return 373;
 
   case 5614:
    	return 191;
 
   case 13117://712's
   case 13118:
   case 13119:
   case 13120:
   case 13121:
   case 13122:
   case 13123:
   case 13124:
   case 13125:
   case 13126:
   case 13127:
   case 13128:
   case 13129:
   case 13130:
   case 13131:
   case 13132:
   case 13133:
   case 13134:
   case 13135:
   case 13136:
   case 13137:
   case 13138:
   case 13139:
   case 13140:
   case 13141:
   case 13142:
   case 13143:
   case 13144:
   case 13145:
   case 13146:
    	return 712;
 
   case 5704://28's
   case 5706:
   case 5708:
   case 5710:
   case 5712:
   case 7639:
   case 1237:
   case 1239:
   case 1241:
   case 1243:
   case 1245:
   case 1251:
   case 1253:
   case 1255:
   case 1257:
   case 772:
   case 1259:
   case 7640:
   case 7641:
   case 7642:
   case 7643:
   case 7644:
   case 7645:
   case 7646:
   case 7647:
   case 3053:
   case 3054:
   case 3170:
   case 3171:
   case 3172:
   case 1379:
   case 1381:
   case 1383:
   case 1385:
   case 3173:
   case 3174:
   case 3175:
   case 3176:
   case 3190:
   case 14377:
   case 14379:
   case 14381:
   case 14383:
   case 14385:
   case 3192:
   case 3194:
   case 3196:
   case 3198:
   case 3200:
   case 3202:
   case 7648:
   case 5718:
   case 5720:
   case 5722:
   case 5724:
   case 5726:
   case 1389:
   case 1391:
   case 1393:
   case 1395:
   case 1397:
   case 1399:
   case 1401:
   case 1403:
   case 1405:
   case 1407:
   case 1409:
   case 5734:
   case 5736:
   case 5016:
   case 6526:
   case 6562:
   case 6563:
   case 3204:
   case 13988:
   case 13990:
   case 14117:
   case 13905:
   case 13907:
   case 13929:
   case 13931:
   case 13941:
   case 13943:
   case 14725:
   case 13629:
   case 10280:
   case 10282:
   case 10284:
   case 13630:
   case 13631:
   case 13632:
   case 13633:
   case 13634:
   case 13635:
   case 13636:
   case 13637:
   case 13638:
   case 13639:
   case 13640:
   case 13641:
   case 13642:
   case 13643:
   case 13644:
   case 13645:
   case 13646:
   case 13647:
   case 13648:
   case 1247:
   case 1249:
   case 1261:
   case 1263:
   case 5714:
   case 5716:
   case 5728:
   case 5730:
   case 13867:
   case 13869:
   case 6599:
   case 6603:
   case 4675:
   case 4710:
   case 6760:
   case 6762:
   case 6764:
   case 6818:
   case 6908:
   case 6910:
   case 6912:
   case 6914:
   case 4910:
   case 4911:
   case 4912:
   case 4913:
   case 10440:
   case 10442:
   case 10444:
   case 4914:
   case 4862:
   case 4863:
   case 4864:
   case 4726:
   case 4865:
   case 4866:
   case 4158:
   case 4159:
   case 4170:
   case 4580:
   case 9013:
   case 9044:
   case 9046:
   case 9048:
   case 11367:
   case 11369:
   case 11371:
   case 11373:
   case 11375:
   case 11377:
   case 11379:
   case 11381:
   case 11382:
   case 11384:
   case 11386:
   case 11388:
   case 11389:
   case 11391:
   case 11393:
   case 11395:
   case 11396:
   case 11398:
   case 11400:
   case 11736:
   case 11738:
   case 11402:
   case 11403:
   case 11405:
   case 11407:
   case 11409:
   case 11410:
   case 11412:
   case 11414:
   case 11416:
   case 11417:
   case 11419:
   case 9050:
   case 10010:
   case 9084:
   case 9091:
   case 9092:
   case 9093:
   case 4582:
   case 7804:
   case 7809:
   case 4584:
    	return 28;
 
   case 6082://284's
    	return 284;
 
   case 6528://27's
   case 4153:
   case 7668:
    	return 27;
 
   case 6605://1381's
   case 1277:
   case 1279:
   case 1281:
   case 1289:
   case 1283:
   case 1285:
   case 1287:
   case 11716:
   case 13879:
   case 13880:
   case 13881:
   case 13882:
    	return 1381;
 
   case 7671://1386's
   case 7673:
    	return 1386;
 
   case 6607://1629's
   case 6611:
    	return 1629;
 
   case 6609://124's
   case 6817:
   case 7158:
   case 7439:
    	return 124;
 
   case 6773://131's
   case 6774:
   case 6775:
   case 6776:
   case 6777:
   case 6778:
   case 6779:
   case 8650:
   case 8652:
   case 8654:
   case 8656:
   case 8658:
   case 8660:
   case 8662:
   case 8664:
   case 8666:
   case 8668:
   case 8670:
   case 8672:
   case 8674:
   case 8676:
   case 8678:
   case 8680:
   case 8966:
   case 8967:
   case 8968:
   case 8969:
   case 8970:
   case 8971:
    	return 131;
 
   case 7170:
    	return 234;
 
   case 7421://618's
   case 7422:
   case 7423:
   case 7424:
   case 7425:
   case 7426:
   case 7427:
   case 7428:
   case 7429:
   case 7430:
   case 7431:
    	return 618;
 
   case 7449://134's
    	return 134;
 
   case 8871://822's
    	return 822;
 
   case 8880://175's
   case 9174:
   case 9176:
   case 9177:
   case 9179:
   case 9181:
   case 9183:
   case 10156:
   case 13081:
   case 11165:
   case 11167:
   case 9185:
    	return 175;
 
   case 1303://1582's
   case 1305:
   case 4587:
   case 1333:
   case 1321://1629's
   case 1323:
   case 1325:
   case 1327:
   case 1329:
   case 1331:
   case 1291:
   case 1293:
   case 1295:
   case 1297:
   case 1299:
   case 1301:
   case 13979:
   case 13981:
   case 13982:
   case 13984:
    	return 1582;
 
   case 10024:
    	return 1283;
 
   case 10033://234's
   case 10034:
    	return 234;
 
   case 10146://1277's
   case 10147:
   case 10148:
   case 10149:
    	return 1277;
 
   case 12578://294's
   case 12579:
   case 12580:
    	return 294;
 
   case 3695://792's
    	return 792;
 
   case 11259://158's
    	return 158;
 
   case 11694://1579's
   case 11696:
   case 11698:
   case 11700:
   case 11730:
    	return 1579;
 
   case 10150://1279's
    	return 1279;
 
   case 10487://1171's
    	return 1171;
 
   case 10735://1383's
    	return 1383;
 
   case 10858://124's
    	return 124;
 
   case 10887://985's
    	return 985;
 
   case 11235://303's
   	return 303;
 
   case 667://292's
    	return 292;
 
   case 11998://159's
    	return 159;
 
   case 12570://1157's
    	return 1157;
 
   case 12844://593's
    	return 593;
 
   case 13661://1096's
    	return 1096;
 
   case 13666://326's
   	return 326;
 
   case 13671://327's
    	return 327;
 
   case 13676://328's
    	return 328;
 
   case 14057://1072's
    	return 1072;
 
   case 14679://1481's
   	return 1481;
 
   case 14712://398's
    	return 398;
 
   case 14713://182's
    	return 182;
 
   case 15241://1603
    	return 1603;
	}
}
	
	public int getWalkAnim() {
		try {
		if(this.tempWalkAnim != -1) {
			return this.tempWalkAnim;
		}
		if(get(3) == null) {
			return 0x333;
		}
		Item item = get(3);
		String weapon = item.getDefinition().getName();
		int id = item.getDefinition().getId();
		if(weapon.equals("Saradomin staff") || weapon.equals("Guthix staff") || weapon.equals("Zamorak staff")) {
			return 0x333;
		} else if (id == 4755) {
		   return 2060;
		} else if (id == 4734) {
		   return 2076;
		} else if (id == 4153) {
			return 1663;
		} else if (weapon.equals("Abyssal whip")) {
		   return 1660;
		} else if (id == 4718 || weapon.endsWith("2h sword") || id == 6528 || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
		   return 7046;
		} else if (id == 4726 || weapon.contains("spear") || weapon.endsWith("halberd") || weapon.contains("Staff") || weapon.contains("staff")) {
		   return 1146;
		}
		return 0x333;
		} catch(Exception e) {
		return 0;
		}
	}
	
	public int getRunAnim() {
		try {
		if(this.tempWalkAnim != -1) {
			return this.tempWalkAnim;
		}
		if(get(3) == null) {
			return 0x338;
		}
		Item item = get(3);
		String weapon = item.getDefinition().getName();
		int id = item.getDefinition().getId(); 
		if (id == 4718 || weapon.endsWith("2h sword") || id == 6528 || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
			return 7039;
		} else if (weapon.equals("Saradomin staff") || weapon.equals("Guthix staff") || weapon.equals("Zamorak staff")) {
			return 0x338;
		} else if (id == 4755) {
			return 1831;
		} else if (id == 4734) {
			return 2077;
		} else if (id == 4726 || weapon.contains("Spear") || weapon.endsWith("halberd") || weapon.contains("Staff") || weapon.contains("staff")) {
			return 1210;
		} else if (weapon.equals("Abyssal whip")) {
			return 1661;
		} else if (id == 4153) {
			return 1664;
		}
		return 0x338;
		} catch(Exception e) {
		return 0;
		}
	}
	public int LendId(int itemId) {
		switch (itemId) {
			case 4151: return 13444;
			case 4587: return 13477;
			default: return 0;
		}
		}
	public int UnLendId(int itemId) {
		switch (itemId) {
			case 13444: return 4151;
			case 13477: return 4587;
			default: return 0;
		}
		}

	public static boolean isTwoHanded(ItemDefinition def) {
		String wepEquiped = def.getName();
		int itemId = def.getId();
		if (itemId == 4212)
			return true;
		else if (itemId == 14484) 
			return true;
		else if (itemId == 4214)
			return true;
                else if (itemId == 15241)
			return true;
		else if (wepEquiped.endsWith("2h sword"))
			return true;
                else if (wepEquiped.endsWith("Dark bow"))
			return true;
		else if (wepEquiped.endsWith("longbow"))
			return true;
		else if (wepEquiped.equals("Seercull"))
			return true;
		else if (wepEquiped.endsWith("shortbow"))
			return true;
                else if (wepEquiped.endsWith("salamander"))
			return true;
                else if (wepEquiped.endsWith("Salamander"))
			return true;
                else if (wepEquiped.endsWith("Barrelchest anchor"))
			return true;
		else if (wepEquiped.endsWith("Longbow"))
			return true;
		else if (wepEquiped.endsWith("Shortbow"))
			return true;
		else if (wepEquiped.endsWith("bow full"))
			return true;
		else if (wepEquiped.endsWith("halberd"))
			return true;
		else if (wepEquiped.equals("Granite maul"))
			return true;
		else if (wepEquiped.equals("Karils crossbow"))
			return true;
		else if (wepEquiped.equals("Torags hammers"))
			return true;
		else if (wepEquiped.equals("Veracs flail"))
			return true;
		else if (wepEquiped.equals("Dharok's greataxe"))
			return true;
		else if (wepEquiped.equals("Guthans warspear"))
			return true;
		else if (wepEquiped.equals("Tzhaar-ket-om"))
			return true;
		else if (wepEquiped.endsWith("godsword"))
			return true;
		else if (wepEquiped.endsWith("#14484"))
			return true;
		else if (wepEquiped.equals("Saradomin sword"))
			return true;
		else
			return false;
	}

	public static boolean isFullBody(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_BODY.length; i++) {
			if (weapon.contains(FULL_BODY[i])) {
				return true;
			}
		}
		return false;
	}

 
	public static boolean isFullHat(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_HAT.length; i++) {
			if (weapon.endsWith(FULL_HAT[i])) {
				return true;
			}
		}
		return false;
	}

	public static boolean isFullMask(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_MASK.length; i++) {
			if (weapon.endsWith(FULL_MASK[i])) {
				return true;
			}
		}
		return false;
	}
	
	private static final String[] CAPES = {"Diving apparatus", "Bonesack", "cloak", "Cape", "cape", "Ava's"};
	private static final String[] HATS = {"Hat_(class_5)", "Dagon'hai hat", "mitre", "Bunny ears", "Coif", "coif", "sallet", "Helm", "helm", "Hat", "hat", "Mask", "mask", "Hood", "hood", "Feather headdress", "Feather headdress (charged)", "Camel mask"};
	private static final String[] BOOTS = {"Boots","boots", "Flippers", "shoes", "Shoes", "Villager sandals"};
	private static final String[] GLOVES = {"Void knight gloves", "Gloves", "gloves", "Gauntlents", "gauntlets", "Vamb", "vamb", "Brace", "brace"};
	private static final String[] SHIELDS = {"satchel", "Saradomin kite", "Shield", "shield", "Book", "book", "Defender", "defender", "Toktz-ket-xil"};
	private static final String[] AMULETS = {"stole","Gnome scarf", "Amulet", "amulet", "Necklace", "necklace"};
	private static final String[] ARROWS = {"arrow", "arrows", "arrow(p)", "arrow(+)", "arrow(s)", "bolt", "Bolt rack", "Opal bolts", "Dragon bolts"};
	private static final String[] RINGS = {"Ring", "ring"};
	private static final String[] BODY = {"Dragon chainbody", "Rock-shell plate", "Saradomin plate", "Varrock armour", "hauberk", "Guthix dragonhide", "Saradomin d'hide", "Zamorak d'hide", "Body", "body", "Shirt", "shirt", "Torso", "torso", "Top", "top", "Brassard", "brassard", "Chestplate", "chestplate"};
	private static final String[] LEGS = {"Santa costume legs", "Robe_bottom_(class_5)", "Flared trousers", "Corrupt vesta's plateskirt", "Dagon'hai robe bottom", "3rd age robe", "cuisse", "Legs", "legs", "Skirt", "skirt", "Bottom", "bottom", "Tasset", "tasset", "Chaps", "chaps", "Void knight robe"};
	private static final String[] WEAPONS = {"Torags hammers", "Keris", "Gnomecopter", "Rubber chicken", "Seercull", "Staff (class 5)", "knife", "dart", "Undead chicken", "crozier", "Mouse toy", "claws", "Scythe", "Spear", "spear", "Meat tenderiser", "Blade", "blade", "Sword", "sword", "Scimitar", "scimitar", "Whip", "whip", "Mace", "mace", "Axe", "axe", "Dagger", "dagger", "Flail", "flail", "Bow", "bow", "Staff", "staff", "Wand", "wand", "Maul", "maul", "Halberd", "halberd", "Anchor", "anchor", "Tzhaar-ket-om", "Hammer", "hammer", "Morrigan's javelin", "javelin", "throwing axe"
        , "dagger(p)", "dagger(+)", "dagger(s)", "spear(p)", "spear(+)", "spear(s)", "spear(kp)", "dart(p)", "javelin(p)", "knife(p)"};
	/* Fullbody is an item that covers your arms. */
        private static final String[] FULL_BODY = {"Corrupt vesta's chainbody", "Santa costume top", "Robe_top_(class_5)", "Dagon'hai robe top", "Spined body", "Rock-shell plate", "Saradomin plate",  "Varrock armour", "Granite body", "hauberk", "Guthix d'hide", "Saradomin d'hide", "Zamorak d'hide", "Top", "top","Shirt", "shirt", "Platebody", "platebody", "Brassard", "brassard", "Chestplate", "chestplate", "Torso", "torso", "Dragon chainbody", "Dragon platebody", "Vesta's chainbody", "Wizard robe (g)", "Wizard robe (t)", "Morrigan's leather body", "Zombie shirt"};
	/* Fullhat covers your head but not your beard. */
        private static final String[] FULL_HAT = {"Splitbark helm", "Hard hat", "Lumberjack hat", "Dwarven helmet", "Runner hat", "Fighter hat", "Ranger hat", "Healer hat", "3rd age mage hat", "mitre", "coif", "Coif", "Void melee helm", "Void ranger helm", "Void mage helm", "Archer helm", "Berserker helm", "Warrior helm", "Farseer helm", "med helm", "Dharok's helm", "Dharoks helm", "Hood", "hood", "Coif", "coif", "Helm of neitiznot", "Statius's full helm", "Rune helm (h1)", "Rune helm (h2)", "Rune helm (h3)", "Rune helm (h4)", "Rune helm (h5)", "3rd age full helmet", "afro", "Afro", "Camel mask"};
	/* Fullmask covers your entire head. */
        private static final String[] FULL_MASK = {"Lunar helm", "Adam full helm(g)", "Adam full helm(t)", "Black full helm(g)", "Black full helm(t)", "Rune full helm(g)", "Rune full helm (t)", "Zamorak full helm", "Tyras helm", "Slayer helmet", "Karil's coif", "sallet", "full helm", "Verac's helm", "Veracs helm", "Guthan's helm", "Guthans helm", "Torag's helm", "Torags helm", "Karil's coif", "Karils coif", "h'ween mask"};
        public static final int SIZE = 14;
	private static final int[] hats = {13869, 15021, 15027, 15033, 15039,13864,13896,13263, 13876, 13864, 10452, 10454, 10456, 10350, 12210, 12213, 12216, 12219, 12222, 13101, 4502, 14743, 14745, 14747, 14749, 14751, 14753, 14755, 14757, 14759, 14761, 14763, 14765, 14767, 14769, 14771, 14773, 14775, 14777, 14779, 14781, 14783, 14785, 14787, 14789, 14791};
	private static final int[] bodies = {14479,10619,15022, 15028, 15034, 15040, 13887, 13858, 13884, 13870, 13858, 14479, 1131, 7390, 7592};
	private static final int[] fullBodies = {14479,10619,15022, 15028, 15034, 15040, 13884, 13887, 13870, 13858, 14479, 1131, 7390, 7592};
	private static final int[] pants = {13861, 15023, 15024, 15029, 15030, 15035, 15036, 15041, 15042, 13893, 13890, 13873, 13861};
	private static final int[] boots = {15025, 15031, 15037, 15043};
	private static final int[] gloves = {15026, 15032, 15038, 15044};
	private static final int[] swords = {13899, 13867, 13902};
	public static int getItemType(int wearId) {
		String weapon = ItemDefinition.forId(wearId).getName();
		if (wearId == 13738 || wearId == 13736 || wearId == 13740 || wearId == 13742 || wearId == 13744 ) {
			return 5;
		}
		if (wearId == 15243) {
			return 13;
		}
		if (wearId == 6914 || wearId == 6745 || wearId == 6746) {
			return 3;
		}
		if (wearId == 15241 || wearId == 11259) {
			return 3;	
		}
		for (int i = 0; i < swords.length; i++) {
			if (wearId == swords[i]) 
				return 3;
		}
		for (int i = 0; i < CAPES.length; i++) {
			if (weapon.contains(CAPES[i]))
				return 1;
		}
		for (int i = 0; i < hats.length; i++) {
			if (wearId == hats[i]) 
				return 0;
		}
		for (int i = 0; i < pants.length; i++) {
			if (wearId == pants[i]) 
				return 7;
		}
		for (int i = 0; i < boots.length; i++) {
			if (wearId == boots[i]) 
				return 10;
		}
		for (int i = 0; i < gloves.length; i++) {
			if (wearId == gloves[i]) 
				return 9;
		}
		for (int i = 0; i < bodies.length; i++) {
			if (wearId == bodies[i]) 
				return 4;
		}
		for (int i = 0; i < HATS.length; i++) {
			if (weapon.contains(HATS[i]))
				return 0;
		}
		for (int i = 0; i < BOOTS.length; i++) {
			if (weapon.endsWith(BOOTS[i]) || weapon.startsWith(BOOTS[i]))
				return 10;
		}
		for (int i = 0; i < GLOVES.length; i++) {
			if (weapon.endsWith(GLOVES[i]) || weapon.startsWith(GLOVES[i]))
				return 9;
		}
		for (int i = 0; i < SHIELDS.length; i++) {
			if (weapon.contains(SHIELDS[i]))
				return 5;
		}
		for (int i = 0; i < AMULETS.length; i++) {
			if (weapon.endsWith(AMULETS[i]) || weapon.startsWith(AMULETS[i]))
				return 2;
		}
		for (int i = 0; i < ARROWS.length; i++) {
			if (weapon.endsWith(ARROWS[i]) || weapon.startsWith(ARROWS[i]))
				return 13;
		}
		for (int i = 0; i < RINGS.length; i++) {
			if (weapon.endsWith(RINGS[i]) || weapon.startsWith(RINGS[i]))
				return 12;
		}
		for (int i = 0; i < BODY.length; i++) {
			if (weapon.contains(BODY[i]))
				return 4;
		}
		for (int i = 0; i < LEGS.length; i++) {
			if (weapon.contains(LEGS[i]))
				return 7;
		}
		for (int i = 0; i < WEAPONS.length; i++) {
			if (weapon.endsWith(WEAPONS[i]) || weapon.startsWith(WEAPONS[i]))
				return 3;
		}
		return -1;
	}
	
	private transient Player player;
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		this.tempWalkAnim = -1;
		this.specialWeapon = false;
		} catch(Exception e) {
		}
	}

	public void refresh() {
		try {
		setWeapon();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		player.getActionSender().sendItems(387, 29, 94, equipment);
		player.getBonuses().refresh();
		} catch(Exception e) {
		}
	}
	public void refreshDrop() {
		try {
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		player.getActionSender().sendItems(387, 29, 94, equipment);
		player.getBonuses().refresh();
		} catch(Exception e) {
		}
	}
	public Container<Item> getContainer() {
		return equipment;
	}
	
	public int getAttackAnimation() {
		try {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		int fightStyle = this.player.getAttackStyle();
		switch(weapon) {
		case 4718:
			if(fightStyle != 2) {
				return 2067;
			} else {
				return 2066;
			}
		case 11696:
		case 11694:
		case 11698:
		case 11700:
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			return 7041;
		case 9174:
		case 9175:
		case 9176:
		case 9177:
		case 9178:
		case 9179:
		case 9180:
		case 9181:
		case 9182:
		case 9183:
		case 9184:
		case 9185:
		case 9186:
			return 4230;
		case 1265:
		case 1266:
		case 1267:
		case 1268:
		case 1269:
		case 1270:
		case 1271:
		case 1272:
		case 1273:
		case 1274:
		case 1275:
		case 1276:
			return 401;
		case 4755:
			return 2062;
		case 10887:
			return 5865;
		case 4151:
			return 1658;
		case 5698:
			return 402;
		case 4214:
		case 6724:
		case 861:
		case 4212:
		case 839:
		case 841:
		case 843:
		case 845:
		case 847:
		case 849:
		case 851:
		case 853:
		case 855:
		case 857:
		case 4827:
			return 426; // bows
		default:
			if(fightStyle != 2) {
				return 422;
			} else {
				return 423;
			}
		}
		} catch(Exception e) {
		return 0;
		}
	}

	public int getAttackSpeed() {
		try {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		switch(weapon) {
		case 5698:
			return 6;
		case 4151:
                case 13899:
			return 5;
		case 4718:
		case 4755:
			return 9;
		case 1321:
		case 1322:
		case 1323:
		case 1324:
		case 1325:
		case 1326:
		case 1327:
		case 1328:
		case 1329:
		case 1330:
		case 1331:
		case 1332:
		case 1333:
		case 1334:
		case 4587:
			return 4;
		case 11696:
		case 11694:
		case 11698:
		case 11700:
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			return 8;
		default:
			return 7;
		}
		} catch(Exception e) {
		return 0;
		}
	}

	public int getDefenceAnimation() {
		try {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		int shield = this.get(Equipment.SLOT_SHIELD) != null ? this.get(Equipment.SLOT_SHIELD).getId() : -1;
		if(shield == -1) {
			return 424;
		}
		if(weapon == 4587 && shield == -1) {
			return 12029;
		}
		if(weapon == 15241 && shield == -1) {
			return 1666;
		}
		if(shield == 8850) {
			return 4177;
		}
                if(shield == 13734) {
			return 1156;
		}
                if(shield == 13736) {
			return 1156;
		}
                if(shield == 13738) {
			return 1156;
		}
                if(shield == 13740) {
			return 1156;
		}
                if(shield == 13742) {
			return 1156;
		}
                if(shield == 13744) {
			return 1156;
		}
                if(shield == 11283) {
			return 1156;
		}
                if(shield == 11284) {
			return 1156;
		}
                if(shield == 3122) {
			return 1156;
		} 
                if(shield == 1540) {
			return 1156;
		} 
                if(shield == 1189) {
			return 1156;
		}
                if(shield == 1191) {
			return 1156;
		}
                if(shield == 1193) {
			return 1156;
		}
                if(shield == 1195) {
			return 1156;
		}
                if(shield == 2589) {
			return 1156;
		}
                if(shield == 2597) {
			return 1156;
		}
                if(shield == 6633) {
			return 1156;
		}
                if(shield == 1197) {
			return 1156;
		}
                if(shield == 1199) {
			return 1156;
		}
                if(shield == 1201) {
			return 1156;
		}
                if(shield == 1187) {
			return 1156;
		}
                if(shield == 6524) {
			return 1156;
		}
		if(weapon == 11694 && shield == -1 || weapon == 11696 && shield == -1 || weapon == 11698 && shield == -1 || weapon == 11700 && shield == -1 || weapon == 11730 && shield == -1) {
			return 7050;
		}
		return 424;
		} catch(Exception e) {
		return 424;
		}
	}

	private static final int[] BOWS = new int[] { 4212, 4214, 4215, 4216, 4217, 4218, 4219, 4220, 4221, 4222, 4223, 837,
    767, 4734, 839, 841, 843, 845, 847, 849, 851, 853, 855, 857, 859, 861,
    2883, 4827, 6724, 11235, 9705 ,767, 837, 10156, 11165, 13081, 15241};

private static final int[] BOWSA = new int[] { 892, 891, 890, 889, 888, 11212};

	public boolean isWieldindBow() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;

		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		if(weapon == -1 || id == -1) {
			return false;
		}
		for(int bow : BOWS) {
		for(int bowA : BOWSA) {
			if(weapon == bow && id == bowA) {
				return true;
			}
		}
		}
		return false;
	}

	private static final int[] CBOWS = new int[] {9244, 9245, 9237, 9242};
	private static final int[] CBOWSW = new int[] {9185, 9174, 9176, 9177, 9179, 9181, 9183, 9185, 8880 };

	public boolean isWieldingCBow() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;

		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(id == -1 || idW == -1) {
			return false;
		}
		for(int cbow : CBOWS) {
		for(int cbowW : CBOWSW) {
			if(cbow == id && cbowW == idW) {
				return true;
			}
			}
		}
		return false;
	}

	public boolean isWieldingKBow() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;

		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(id == -1 || idW == -1) {
			return false;
		}
			if(id == 4740 && idW == 4734) {
				return true;
		}
		return false;
	}	
	public boolean isUsingChins() {
		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(idW == -1) {
			return false;
		}
			if(idW == 10034) {
				return true;
		}
		return false;
	}
	public boolean isWieldingHandCannon() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;

		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(id == -1 || idW == -1) {
			return false;
		}
			if(id == 15243 && idW == 15241) {
				return true;
		}
		return false;
	}
	public boolean isWieldingDbow() {
		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(idW == -1) {
			return false;
		}
			if(idW == 11235) {
				return true;
		}
		return false;
	}		
	private static final int[] CZanikBOWS = new int[] {9140, 9141, 9142, 9143, 8882};	
	public boolean isWieldingZanikBow() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;

		int idW = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;

		if(id == -1 || idW == -1) {
			return false;
		}
		for(int Zanikbows : CZanikBOWS) {
			if(idW == 14684 && id == Zanikbows) {
				return true;
			}
		}
		return false;
	}	
	public int hitDelay(Entity t) {
		int hitDelay = 0;
		int dist = (int) (Math.round(player.getLocation().getDistance(t.getLocation())));
		if(dist == 0) {
		} else if(dist == 1) {
			hitDelay = 2;
		} else if(dist == 2 || dist == 3) {
			hitDelay = 3;
		} else {
			hitDelay = 4;
		}
		hitDelay = hitDelay * 400 + 600;
		return hitDelay;
	}
	public int getDrawBackGraphics() {
		if (isWieldingKnives() == true) {
			int id = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
			if(id == 868) {
				return 225;
			} else if(id == 867) {
				return 224;
			} else if(id == 866) {
				return 223;
			} else if(id == 865) {
				return 222;
			} else if(id == 864) {
				return 221;
			} else if(id == 863) {
				return 220;
			} else if(id == 4214) {
				return 250;
				}
			return 10;
			}
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == 882) {
			return 19;
		} else if(id == 877 || id == 878 || id == 879 || id == 880 || id == 881 || id == 4740 || id == 6061 || id == 6062 || id == 8882 || id == 9139 || id == 9140 || id == 9141 || id == 9142 || id == 9143 || id == 9144 || id == 9145 || id == 9236 || id == 9237 || id == 9238 || id == 9239 || id == 9240 || id == 9241 || id == 9242 || id == 9243 || id == 9244 || id == 9245 || id == 9286 || id == 9287 || id == 9288 || id == 9289 || id == 9290 || id == 9291 || id == 9292 || id == 9293 || id == 9294 || id == 9295 || id == 9296 || id == 9297 || id == 9298 || id == 9299 || id == 9300 || id == 9301 || id == 9302 || id == 9303 || id == 9304 || id == 9305 || id == 9306 || id == 9335 || id == 9335 || id == 9336 || id == 9337 || id == 9338 || id == 9339 || id == 9340 || id == 9341 || id == 9342 || id == 10158 || id == 10159 || id == 13083 || id == 13084 || id == 13085 || id == 13086 || id == 13280) {
			return 28;
		} else if(id == 884) {
			return 18;
		} else if(id == 886) {
			return 20;
		} else if(id == 9706) {
			return 25;
		} else if(id == 888) {
			return 21;
		} else if(id == 890) {
			return 22;
		} else if(id == 892) {
			return 24;
		} else if(id == 2532 || id == 2534 || id == 2536 || id == 2538 || id == 2540 || id == 598) {
			return 1120;
		} else if(id == 11212) {
			return 1116;
		} else if(id == 863) {
			return 213;
		} else if(id == 864) {
			return 212;
		} else if(id == 865) {
			return 214;
		} else if(id == 866) {
			return 216;
		} else if(id == 867) {
			return 217;
		} else if(id == 868) {
			return 218;
		} else if(id == 869) {
			return 215;
		} else if(id == 806) {
			return 226;
		} else if(id == 807) {
			return 227;
		} else if(id == 808) {
			return 228;
		} else if(id == 809) {
			return 229;
		} else if(id == 810) {
			return 230;
		} else if(id == 811) {
			return 231;
		} else if(id == 3093) {
			return 229;
		} else {
			return 19;
		}
	}

	public int getProjectileId() {
		int id = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		if(id == 13883) {
			return 1839;
		} else {
		if (isWieldingKnives() == true) {
		if(id == 868) {
			return 225;
		} else if(id == 867) {
			return 224;
		} else if(id == 866) {
			return 223;
		} else if(id == 865) {
			return 222;
		} else if(id == 864) {
			return 221;
		} else if(id == 863) {
			return 220;
		} else if(id == 4214) {
			return 249;
		}
		return 10;
		}
}			
		int id2 = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id2 == 882) {
			return 10;
		} else if(id2 == 15243) {
			return 2143;
		} else if(id2 == 877 || id2 == 878 || id2 == 879 || id2 == 880 || id2 == 881 || id2 == 4740 || id2 == 6061 || id2 == 9298 || id2 == 9299 || id2 == 9300 || id2 == 9301 || id2 == 9302 || id2 == 9303 || id2 == 9304 || id2 == 9305 || id2 == 9306 || id2 == 9335 || id2 == 9335 || id2 == 9336 || id2 == 9337 || id2 == 9338 || id2 == 9339 || id2 == 9340 || id2 == 9341 || id2 == 9342 || id2 == 10158 || id2 == 10159 || id2 == 13083 || id2 == 13084 || id2 == 13085 || id2 == 13086 || id2 == 13280) {
			return 28;
		} else if(id2 == 9706) {
			return 25;
		} else if(id2 == 9237 || id2 == 9242 || id2 == 9244 || id2 == 9245) { //bolts
			return 28;
		} else if(id2 == 884) {
			return 11;
		} else if(id2 == 886) {
			return 12;
		} else if(id2 == 888) {
			return 13;
		} else if(id2 == 890) {
			return 14;
		} else if(id2 == 892) {
			return 15;
		} else if(id2 == 2532 || id2 == 2534 || id2 == 2536 || id2 == 2538 || id2 == 2540 || id2 == 598) {
			return 1120;
		} else if(id2 == 11212) {
			return 1120;
		} else if(id2 == 15242) {
			return 2143;
		} else {
			return 10;
		}
	}
	
	private static final int[] KNIVES = new int[] { 863, 864, 865, 866, 867, 868, 869,
		870, 871, 872, 873, 874, 875, 876};
	
	public Item removeAmmo() {
		Item i = this.get(Equipment.SLOT_ARROWS);
		Item ii = this.get(Equipment.SLOT_WEAPON);
		if(ii != null) {
			if (4214 == this.get(Equipment.SLOT_WEAPON).getId())
				return null;
				
			for(int knife : KNIVES) {
					
				if(knife == this.get(Equipment.SLOT_WEAPON).getId()) {
					return new Item(ii.getId(), 1);
				}
			}
		}
		if(i != null) {
			int amt = i.getAmount() - 1;
			if(amt <= 0) {
				this.set(Equipment.SLOT_ARROWS, null);
			} else {
				this.set(Equipment.SLOT_ARROWS, new Item(i.getId(), amt));
			}
			refresh();
			return new Item(i.getId(), 1);
		} else {
			return null;
		}
	}
	public boolean isWieldingKnives() {
		/*if(this.get(Equipment.SLOT_ARROWS) != null) {
			return false;
		}*/
		int id = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		if(id == -1) {
			return false;
		}
		for(int knife : KNIVES) {
			if(knife == id) {
				return true;
			}
		}
		return false;
	}

	public boolean hasAmmo() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == -1) {
			return false;
		}
		if(this.get(Equipment.SLOT_ARROWS).getAmount() <= 0) {
			return false;
		}
		if(id == 882) {
			return true;
		} else if(id == 877 || id == 878 || id == 879 || id == 880 || id == 881 || id == 4740 || id == 6061 || id == 6062 || id == 8882 || id == 9139 || id == 9140 || id == 9141 || id == 9142 || id == 9143 || id == 9144 || id == 9145 || id == 9236 || id == 9237 || id == 9238 || id == 9239 || id == 9240 || id == 9241 || id == 9242 || id == 9243 || id == 9244 || id == 9245 || id == 9286 || id == 9287 || id == 9288 || id == 9289 || id == 9290 || id == 9291 || id == 9292 || id == 9293 || id == 9294 || id == 9295 || id == 9296 || id == 9297 || id == 9298 || id == 9299 || id == 9300 || id == 9301 || id == 9302 || id == 9303 || id == 9304 || id == 9305 || id == 9306 || id == 9335 || id == 9335 || id == 9336 || id == 9337 || id == 9338 || id == 9339 || id == 9340 || id == 9341 || id == 9342 || id == 10158 || id == 10159 || id == 13083 || id == 13084 || id == 13085 || id == 13086 || id == 13280) {
			return true;
		} else if(id == 9706) {
			return true;
		} else if(id == 884) {
			return true;
		} else if(id == 886) {
			return true;
		} else if(id == 888) {
			return true;
		} else if(id == 890) {
			return true;
		} else if(id == 892) {
			return true;
		} else if(id == 2532 || id == 2534 || id == 2536 || id == 2538 || id == 2540 || id == 598) {
			return true;
		} else if(id == 11212) {
			return true;
		} else if(id == 15243 && this.isWieldingHandCannon()) {
			return true;
		} else if(this.isWieldingHandCannon()) {
			return true;
		} else {
			return false;
		}
	}	
    /**
     * Returns the ranged level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return The ranged level requirement to weild the item.
     */
    public static int getCLRanged(ItemDefinition def) {
	String itemName = def.getName();
	int ItemID = def.getId();
        if (ItemID == 15241) {
            return 75;
        }
        if (ItemID == 11235) {
            return 60;
        }
        if (ItemID == 9185) {
            return 61;
        }
        if (ItemID == 9756 || ItemID == 9757  || ItemID == 9758 || ItemID == 10642) {
            return 99;
        }
        if (ItemID == 13870 || ItemID == 13873 || ItemID == 13876) {
            return 78;
        }
        if (ItemID == 2499) {
            return 50;
        }
        if (ItemID == 1135) {
            return 40;
        }
        if (ItemID == 14684) {
            return 48;
        }
        if (ItemID == 1099) {
            return 40;
        }
        if (ItemID == 1065) {
            return 40;
        }
        if (ItemID == 2501) {
            return 60;
        }
        if (ItemID == 2503) {
            return 70;
        }
        if (ItemID == 2487) {
            return 50;
        }
        if (ItemID == 2489) {
            return 60;
        }
        if (ItemID == 2495) {
            return 60;
        }
        if (ItemID == 2491) {
            return 70;
        }
        if (ItemID == 2493) {
            return 50;
        }
        if (ItemID == 2505) {
            return 60;
        }
        if (ItemID == 2507) {
            return 70;
        }
        if (ItemID == 859) {
            return 40;
        }
        if (ItemID == 861) {
            return 50;
        }
        if (ItemID == 7370) {
            return 40;
        }
        if (ItemID == 7372) {
            return 40;
        }
        if (ItemID == 7378) {
            return 40;
        }
        if (ItemID == 7380) {
            return 40;
        }
        if (ItemID == 7374) {
            return 50;
        }
        if (ItemID == 7376) {
            return 50;
        }
        if (ItemID == 7382) {
            return 50;
        }
        if (ItemID == 7384) {
            return 50;
        }
        if (itemName.equals("Armadyl helmet")) {
            return 70;
        }
        if (itemName.equals("Armadyl chestplate")) {
            return 70;
        }
        if (itemName.equals("Armadyl plateskirt")) {
            return 70;
        }
        if (itemName.equals("Morrigan's leather body")) {
            return 78;
        }
        if (itemName.equals("Morrigan's leather chaps")) {
            return 78;
        }
        if (itemName.equals("Morrigan's coif")) {
            return 78;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        if (itemName.equals("Coif")) {
            return 20;
        }
        if (itemName.startsWith("Studded chaps")) {
            return 20;
        }
        if (itemName.startsWith("Studded")) {
            return 20;
        }
        if (itemName.equals("Karils coif")) {
            return 70;
        }
        if (itemName.equals("Karils leathertop")) {
            return 70;
        }
        if (itemName.equals("Karils leatherskirt")) {
            return 70;
        }
        if (itemName.equals("Robin hood hat")) {
            return 40;
        }
        if (itemName.equals("Ranger boots")) {
            return 40;
        }
        if (itemName.equals("Crystal bow full")) {
            return 70;
        }
        if (itemName.equals("New crystal bow")) {
            return 70;
        }
        if (itemName.equals("Karils crossbow")) {
            return 70;
        }
        if (ItemID == 2497) {
            return 70;
        }
        if (itemName.equals("Rune thrownaxe")) {
            return 40;
        }
        if (itemName.equals("Rune dart")) {
            return 40;
        }
        if (itemName.equals("Rune javelin")) {
            return 40;
        }
        if (itemName.equals("Rune knife")) {
            return 40;
        }
        if (itemName.equals("Adamant thrownaxe")) {
            return 30;
        }
        if (itemName.equals("Adamant dart")) {
            return 30;
        }
        if (itemName.equals("Adamant javelin")) {
            return 30;
        }
        if (itemName.equals("Adamant knife")) {
            return 30;
        }
        if (itemName.equals("Toktz-xil-ul")) {
            return 60;
        }
        if (itemName.equals("Seercull")) {
            return 50;
        }
        if (itemName.equals("Bolt rack")) {
            return 70;
        }
        if (itemName.equals("Rune arrow")) {
            return 40;
        }
        if (itemName.equals("Adamant arrow")) {
            return 30;
        }
        if (itemName.equals("Mithril arrow")) {
            return 1;
        } else {
            return 1;
        }
    }
    /**
     * Returns the Hp level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return Returns the Hp level requirement to weild the item.
     */
    public static int getCLHp(ItemDefinition def) {
        String itemName = def.getName();
        int ItemID = def.getId();
        if (ItemID == 9768 || ItemID == 9769  || ItemID == 9770 || ItemID == 10647) {
            return 99;
        }
        return 1;
    }

    /**
     * Returns the Hunting level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return Returns the Hunting level requirement to weild the item.
     */
    public static int getCLHunt(ItemDefinition def) {
        String itemName = def.getName();
        int ItemID = def.getId();
        if (ItemID == 9948 || ItemID == 9949  || ItemID == 9950 || ItemID == 10646) {
            return 99;
        }
        return 1;
    }

    /**
     * Returns the Summoning level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return Returns the Summoning level requirement to weild the item.
     */
    public static int getCLSumm(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 12169 || ItemID == 12170 || ItemID == 12171 || ItemID == 12524) {
            return 99;
        }
        if (itemName.equals("Feather headdress")) {
            return 50;
        }
        return 1;
    }

    /**
     * Returns the Prayer level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return Returns the Prayer level requirement to weild the item.
     */
    public static int getCLPray(ItemDefinition def) {
        String itemName = def.getName();
        int ItemID = def.getId();
        if (ItemID == 9759 || ItemID == 9760  || ItemID == 9761 || ItemID == 10643) {
            return 99;
        }
        if (itemName.equals("Spirit shield")) {
            return 55;
        }
        if (itemName.equals("Blessed spirit shield")) {
            return 60;
        }
        if (itemName.equals("Arcane spirit shield")) {
            return 70;
        }
        if (itemName.equals("Divine spirit shield")) {
            return 75;
        }
        if (itemName.equals("Elysian spirit shield")) {
            return 75;
        }
        if (itemName.equals("Spectral spirit shield")) {
            return 70;
        }
        if (itemName.equals("Saradomin mitre")) {
            return 40;
        }
        if (itemName.equals("Guthix mitre")) {
            return 40;
        }
        if (itemName.equals("Zamorak mitre")) {
            return 40;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        return 1;
    }


    /**
     * Returns the magic level needed for ItemID.
     * @param ItemID The id of the item to check.
     * @return Returns the magic level requirement to weild the item.
     */
    public static int getCLMagic(ItemDefinition def) {
        String itemName = def.getName();
        int ItemID = def.getId();
	if (itemName.equals("Mystic hat")) {
            return 40;
        }
        if (itemName.equals("Mystic robe top")) {
            return 40;
        }
        if (itemName.equals("Saradomin mitre")) {
            return 40;
        }
        if (itemName.equals("Guthix mitre")) {
            return 40;
        }
        if (itemName.equals("Zamorak mitre")) {
            return 40;
        }
        if (itemName.equals("Zuriel's staff")) {
            return 78;
        }
        if (itemName.equals("Zuriel's robe top")) {
            return 78;
        }
        if (itemName.equals("Zuriel's robe bottom")) {
            return 78;
        }
        if (itemName.equals("Zuriel's hood")) {
            return 78;
        }
        if (itemName.equals("Arcane spirit shield")) {
            return 65;
        }
        if (itemName.equals("Spectral spirit shield")) {
            return 65;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        if (ItemID == 9762 || ItemID == 9763  || ItemID == 9764 || ItemID == 10644) {
            return 99;
        }
        if (itemName.equals("Mystic robe bottom")) {
            return 40;
        }
        if (itemName.equals("Mystic gloves")) {
            return 40;
        }
        if (itemName.equals("Mystic boots")) {
            return 40;
        }
        if (itemName.equals("Slayer's staff")) {
            return 50;
        }
        if (itemName.equals("Enchanted hat")) {
            return 40;
        }
        if (itemName.equals("Enchanted top")) {
            return 40;
        }
        if (itemName.equals("Enchanted robe")) {
            return 40;
        }
        if (itemName.equals("Splitbark helm")) {
            return 40;
        }
        if (itemName.equals("Splitbark body")) {
            return 40;
        }
        if (itemName.equals("Splitbark gauntlets")) {
            return 40;
        }
        if (itemName.equals("Splitbark legs")) {
            return 40;
        }
        if (itemName.equals("Splitbark greaves")) {
            return 40;
        }
        if (itemName.equals("Infinity gloves")) {
            return 50;
        }
        if (itemName.equals("Infinity hat")) {
            return 50;
        }
        if (itemName.equals("Infinity top")) {
            return 50;
        }
        if (itemName.equals("Infinity bottoms")) {
            return 50;
        }
        if (itemName.equals("Infinity boots")) {
            return 50;
        }
        if (itemName.equals("Ahrims hood")) {
            return 70;
        }
        if (itemName.equals("Ahrims robetop")) {
            return 70;
        }
        if (itemName.equals("Ahrims robeskirt")) {
            return 70;
        }
        if (itemName.equals("Ahrims staff")) {
            return 70;
        }
        if (itemName.equals("Saradomin cape")) {
            return 60;
        }
        if (itemName.equals("Saradomin staff")) {
            return 60;
        }
        if (itemName.equals("Zamorak cape")) {
            return 60;
        }
        if (itemName.equals("Zamorak staff")) {
            return 60;
        }
        if (itemName.equals("Guthix cape")) {
            return 60;
        }
        if (itemName.equals("Guthix staff")) {
            return 60;
        }
        if (itemName.equals("mud staff")) {
            return 30;
        }
        if (itemName.equals("Fire battlestaff")) {
            return 30;
        }
        return 1;
    }

    /**
     * Returns the strength level needed to weild ItemID.
     * @param ItemID The item id to check.
     * @return The strength level requirement for the item.
     */
    public static int getCLStrength(ItemDefinition def) {
        String itemName = def.getName();
        int ItemID = def.getId();
	if (itemName.equals("Torags hammers")) {
            return 70;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        if (itemName.equals("Dharoks greataxe")) {
            return 70;
        }
        if (itemName.equals("Granite maul")) {
            return 50;
        }
        if (ItemID == 9750 || ItemID == 9751  || ItemID == 9752 || ItemID == 10640) {
            return 99;
        }
        if (itemName.equals("Granite legs")) {
            return 50;
        }
        if (itemName.equals("Tzhaar-ket-om")) {
            return 60;
        }
        if (itemName.equals("Granite shield")) {
            return 50;
        }
        return 1;
    }

    /**
     * Returns the attack level needed for ItemID.
     * @param ItemID The item id to check.
     * @return The attack level needed to weild the item.
     */
    public static int getCLAttack(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
        if (ItemID == 11694 || ItemID == 11696 || ItemID == 11698 || ItemID == 11700) {
            return 75;
        }
        if (ItemID == 4718 || ItemID == 11730) {
            return 70;
        }
        if (itemName.equals("Zamorakian spear")) {
            return 70;
        }
        if (itemName.equals("Vesta's longsword")) {
            return 78;
        }
        if (itemName.equals("Statius's warhammer")) {
            return 78;
        }
        if (itemName.equals("Zuriel's staff")) {
            return 78;
        }
	if (itemName.equals("Black dagger")) {
            return 10;
        }
        if (itemName.equals("Mithril defender")) {
            return 20;
        }
        if (itemName.equals("Adamant defender")) {
            return 30;
        }
        if (itemName.equals("Rune defender")) {
            return 40;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        if (itemName.equals("Black spear")) {
            return 10;
        }
        if (itemName.equals("Black longsword")) {
            return 10;
        }
        if (itemName.equals("Black scimitar")) {
            return 10;
        }
        if (itemName.equals("Black axe")) {
            return 10;
        }
        if (itemName.equals("Black battleaxe")) {
            return 10;
        }
        if (itemName.equals("Black mace")) {
            return 10;
        }
        if (itemName.equals("Black halberd")) {
            return 10;
        }
        if (itemName.equals("Mithril dagger")) {
            return 20;
        }
        if (itemName.equals("Mithril spear")) {
            return 20;
        }
        if (itemName.equals("Mihril longsword")) {
            return 20;
        }
        if (itemName.equals("Mithril scimitar")) {
            return 20;
        }
        if (itemName.equals("Mithril axe")) {
            return 20;
        }
        if (itemName.equals("Mithril battleaxe")) {
            return 20;
        }
        if (itemName.equals("Mithril mace")) {
            return 20;
        }
        if (itemName.equals("Mithril halberd")) {
            return 20;
        }
        if (itemName.equals("Adamant dagger")) {
            return 30;
        }
        if (itemName.equals("Adamant spear")) {
            return 30;
        }
        if (itemName.equals("Adamant longsword")) {
            return 30;
        }
        if (itemName.equals("Adamant scimitar")) {
            return 30;
        }
        if (itemName.equals("Adamant axe")) {
            return 30;
        }
        if (ItemID == 9747 || ItemID == 9748  || ItemID == 9749 || ItemID == 10639) {
            return 99;
        }
        if (itemName.equals("Adamant battleaxe")) {
            return 30;
        }
        if (itemName.equals("Adamant mace")) {
            return 30;
        }
        if (itemName.equals("Adamant halberd")) {
            return 30;
        }
        if (itemName.equals("Rune dagger")) {
            return 40;
        }
        if (itemName.equals("Rune spear")) {
            return 40;
        }
        if (itemName.equals("Rune longsword")) {
            return 40;
        }
        if (itemName.equals("Rune scimitar")) {
            return 40;
        }
        if (itemName.equals("Rune axe")) {
            return 40;
        }
        if (itemName.equals("Rune battleaxe")) {
            return 40;
        }
        if (itemName.equals("Rune mace")) {
            return 40;
        }
        if (itemName.equals("Rune halberd")) {
            return 40;
        }
        if (itemName.equals("Dragon dagger(s)")) {
            return 60;
        }
        if (itemName.equals("Dragon dagger")) {
            return 60;
        }
        if (itemName.startsWith("Dragon spear")) {
            return 60;
        }
        if (itemName.equals("Dragon longsword")) {
            return 60;
        }
        if (itemName.equals("Dragon scimitar")) {
            return 60;
        }
        if (itemName.equals("Dragon axe")) {
            return 60;
        }
        if (itemName.equals("Dragon claws")) {
            return 60;
        }
        if (itemName.equals("Dragon battleaxe")) {
            return 60;
        }
        if (itemName.equals("Dragon mace")) {
            return 60;
        }
        if (itemName.equals("Dragon halberd")) {
            return 60;
        }
        if (itemName.equals("Abyssal whip")) {
            return 70;
        }
        if (itemName.equals("Veracs flail")) {
            return 70;
        }
        if (itemName.equals("Torags hammers")) {
            return 70;
        }
        if (itemName.equals("Dharoks greataxe")) {
            return 70;
        }
        if (itemName.equals("Guthans warspear")) {
            return 70;
        }
        if (itemName.equals("Ahrims staff")) {
            return 70;
        }
        if (itemName.equals("Granite maul")) {
            return 50;
        }
        if (itemName.equals("Toktz-xil-ak")) {
            return 60;
        }
        if (itemName.equals("Tzhaar-ket-em")) {
            return 60;
        }
        if (itemName.equals("Toktz-xil-ek")) {
            return 60;
        }
        if (itemName.equals("Granite legs")) {
            return 99;
        }
        if (itemName.equals("Mud staff")) {
            return 30;
        }
        if (itemName.equals("Lava battlestaff")) {
            return 30;
        }
        if (itemName.equals("Toktz-mej-tal")) {
            return 60;
        }
        if (itemName.equals("Ancient staff")) {
            return 50;
        }
        return 1;
    }

    /**
     * Returns the Firemaking level needed for ItemID.
     * @param ItemID The item id to check.
     * @return Returns the Firemaking level requirement to weild the item.
     */
    public static int getCLFiremaking(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9804 || ItemID == 9805 || ItemID == 9806 || ItemID == 10659) {
            return 99;
        }
        if (ItemID == 15241) {
            return 61;
        }
        return 1;
    }

    /**
     * Returns the defence level needed for ItemID.
     * @param ItemID The item id to check.
     * @return Returns the defence level requirement to weild the item.
     */
    public static int getCLDefence(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
        if (ItemID == 4716 || ItemID == 4720 || ItemID == 4722) {
            return 70;
        }
        if (itemName.equals("Rune boots")) {
            return 40;
        }
        if (itemName.equals("Rune defender")) {
            return 40;
        }
        if (itemName.equals("Steel defender")) {
            return 5;
        }
        if (itemName.equals("Black defender")) {
            return 10;
        }
        if (itemName.equals("Mithril defender")) {
            return 20;
        }
        if (itemName.equals("Adamant defender")) {
            return 30;
        }
        if (itemName.equals("Slayer helmet")) {
            return 10;
        }
        if (itemName.equals("Zuriel's robe top")) {
            return 78;
        }
        if (itemName.equals("Zuriel's robe bottom")) {
            return 78;
        }
        if (itemName.equals("Zuriel's hood")) {
            return 78;
        }
        if (itemName.equals("Morrigan's leather body")) {
            return 78;
        }
        if (itemName.equals("Morrigan's leather chaps")) {
            return 78;
        }
        if (itemName.equals("Morrigan's coif")) {
            return 78;
        }
        if (itemName.equals("Statius's platebody")) {
            return 78;
        }
        if (itemName.equals("Statius's platelegs")) {
            return 78;
        }
        if (itemName.equals("Statius's full helm")) {
            return 78;
        }
        if (itemName.equals("Vesta's chainbody")) {
            return 78;
        }
        if (itemName.equals("Vesta's plateskirt")) {
            return 78;
        }
        if (itemName.equals("Armadyl helmet")) {
            return 70;
        }
        if (itemName.equals("Armadyl chestplate")) {
            return 70;
        }
        if (itemName.equals("Armadyl plateskirt")) {
            return 70;
        }
        if (ItemID == 2499) {
            return 40;
        }
        if (ItemID == 11732) {
            return 60;
        }
        if (ItemID == 4123) {
            return 5;
        }
        if (ItemID == 4125) {
            return 10;
        }
        if (ItemID == 4127) {
            return 20;
        }
        if (ItemID == 13736) {
            return 70;
        }
        if (ItemID == 13734) {
            return 40;
        }
        if (ItemID == 9753 || ItemID == 9754 || ItemID == 9755 || ItemID == 10641) {
            return 99;
        }
        if (ItemID == 11724 || ItemID == 11726 || ItemID == 11728) {
            return 65;
        }
        if (ItemID == 11283 || ItemID == 11284 || ItemID == 13738 || ItemID == 13740 || ItemID == 13742 || ItemID == 13744) {
            return 75;
        }
        if (ItemID == 13870 || ItemID == 13873 || ItemID == 13876) {
            return 78;
        }
        if (itemName.equals("Void knight top")) {
            return 42;
        }
        if (itemName.equals("Void knight robe")) {
            return 42;
        }
        if (itemName.equals("Void knight gloves")) {
            return 42;
        }
        if (itemName.equals("Void mage helm")) {
            return 42;
        }
        if (itemName.equals("Void ranger helm")) {
            return 42;
        }
        if (itemName.equals("Void melee helm")) {
            return 42;
        }
        if (ItemID == 4129) {
            return 30;
        }
        if (ItemID == 7990) {
            return 60;
        }
        if (ItemID == 2501) {
            return 40;
        }
        if (ItemID == 1131) {
            return 10;
        }
        if (ItemID == 2503) {
            return 40;
        }
        if (ItemID == 1135) {
            return 40;
        }
        if (ItemID == 7462) {
            return 42;
        }
        if (ItemID == 7461) {
            return 42;
        }
        if (ItemID == 7460) {
            return 13;
        }
        if (ItemID == 7459) {
            return 1;
        }
        if (ItemID == 7458) {
            return 1;
        }
        if (ItemID == 7457) {
            return 1;
        }
        if (ItemID == 7456) {
            return 1;
        }
        if (itemName.equals("White med helm")) {
            return 10;
        }
        if (itemName.equals("White chainbody")) {
            return 10;
        }
        if (itemName.startsWith("White full helm")) {
            return 10;
        }
        if (itemName.startsWith("White platebody")) {
            return 10;
        }
        if (itemName.startsWith("White plateskirt")) {
            return 10;
        }
        if (itemName.startsWith("White platelegs")) {
            return 10;
        }
        if (itemName.startsWith("White kiteshield")) {
            return 10;
        }
        if (itemName.startsWith("White sq shield")) {
            return 10;
        }
        if (itemName.startsWith("Studded chaps")) {
            return 1;
        }
        if (itemName.startsWith("Studded")) {
            return 20;
        }
        if (itemName.startsWith("Steel kiteshield")) {
            return 5;
        }
        if (itemName.startsWith("Steel full helm")) {
            return 5;
        }
        if (itemName.startsWith("Steel med helm")) {
            return 5;
        }
        if (itemName.startsWith("Steel platebody")) {
            return 5;
        }
        if (itemName.startsWith("Steel chainbody")) {
            return 5;
        }
        if (itemName.startsWith("Steel plateskirt")) {
            return 5;
        }
        if (itemName.startsWith("Steel platelegs")) {
            return 5;
        }
        if (itemName.startsWith("Steel gauntlets")) {
            return 5;
        }
        if (itemName.startsWith("Black kiteshield(h)")) {
            return 10;
        }
        if (itemName.startsWith("Rune kiteshield(h)")) {
            return 40;
        }
        if (itemName.equals("Black med helm")) {
            return 10;
        }
        if (itemName.equals("Black chainbody")) {
            return 10;
        }
        if (itemName.startsWith("Black full helm")) {
            return 10;
        }
        if (itemName.startsWith("Black platebody")) {
            return 10;
        }
        if (itemName.startsWith("Black plateskirt")) {
            return 10;
        }
        if (itemName.startsWith("Black platelegs")) {
            return 10;
        }
        if (itemName.startsWith("Black kiteshield")) {
            return 10;
        }
        if (itemName.startsWith("Black sq shield")) {
            return 10;
        }
        if (itemName.equals("Mithril med helm")) {
            return 20;
        }
        if (itemName.equals("Mithril chainbody")) {
            return 20;
        }
        if (itemName.startsWith("Mithril full helm")) {
            return 20;
        }
        if (itemName.startsWith("Mithril platebody")) {
            return 20;
        }
        if (itemName.startsWith("Mithril plateskirt")) {
            return 20;
        }
        if (itemName.startsWith("Mithril platelegs")) {
            return 20;
        }
        if (itemName.startsWith("Mithril kiteshield")) {
            return 20;
        }
        if (itemName.startsWith("Mithril sq shield")) {
            return 20;
        }
        if (itemName.equals("Adamant med helm")) {
            return 30;
        }
        if (itemName.equals("Adamant chainbody")) {
            return 30;
        }
        if (itemName.startsWith("Adamant full helm")) {
            return 30;
        }
        if (itemName.startsWith("Adamant platebody")) {
            return 30;
        }
        if (itemName.startsWith("Adamant plateskirt")) {
            return 30;
        }
        if (itemName.startsWith("Adamant platelegs")) {
            return 30;
        }
        if (itemName.startsWith("Adamant kiteshield")) {
            return 30;
        }
        if (itemName.startsWith("Adamant sq shield")) {
            return 30;
        }
        if (itemName.startsWith("Adam full helm")) {
            return 30;
        }
        if (itemName.startsWith("Adam platebody")) {
            return 30;
        }
        if (itemName.startsWith("Adam plateskirt")) {
            return 30;
        }
        if (itemName.startsWith("Adam platelegs")) {
            return 30;
        }
        if (itemName.startsWith("Adam kiteshield")) {
            return 30;
        }
        if (itemName.startsWith("Adam kiteshield(h)")) {
            return 30;
        }
        if (itemName.startsWith("D-hide body(g)")) {
            return 40;
        }
        if (itemName.startsWith("D-hide body(t)")) {
            return 40;
        }
        if (itemName.equals("Dragon sq shield")) {
            return 60;
        }
        if (itemName.equals("Dragon med helm")) {
            return 60;
        }
        if (itemName.equals("Dragon chainbody")) {
            return 60;
        }
        if (itemName.equals("Dragon plateskirt")) {
            return 60;
        }
        if (itemName.equals("Dragon platebody")) {
            return 60;
        }
        if (itemName.equals("Dragon full helm")) {
            return 60;
        }
        if (itemName.equals("Dragon platelegs")) {
            return 60;
        }
        if (itemName.equals("Dragon sq shield")) {
            return 60;
        }
        if (itemName.equals("Rune med helm")) {
            return 40;
        }
        if (itemName.equals("Rune chainbody")) {
            return 40;
        }
        if (itemName.startsWith("Rune full helm")) {
            return 40;
        }
        if (itemName.startsWith("Rune platebody")) {
            return 40;
        }
        if (itemName.startsWith("Rune plateskirt")) {
            return 40;
        }
        if (itemName.startsWith("Rune platelegs")) {
            return 40;
        }
        if (itemName.startsWith("Rune kiteshield")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak full helm")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak platebody")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak plateskirt")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak platelegs")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak kiteshield")) {
            return 40;
        }
        if (itemName.startsWith("Guthix full helm")) {
            return 40;
        }
        if (itemName.startsWith("Guthix platebody")) {
            return 40;
        }
        if (itemName.startsWith("Guthix plateskirt")) {
            return 40;
        }
        if (itemName.startsWith("Guthix platelegs")) {
            return 40;
        }
        if (itemName.startsWith("Guthix kiteshield")) {
            return 40;
        }
        if (itemName.startsWith("Saradomin full")) {
            return 40;
        }
        if (itemName.startsWith("Saradomin plate")) {
            return 40;
        }
        if (itemName.startsWith("Saradomin plateskirt")) {
            return 40;
        }
        if (itemName.startsWith("Saradomin legs")) {
            return 40;
        }
        if (itemName.startsWith("Zamorak kiteshield")) {
            return 40;
        }
        if (itemName.startsWith("Rune sq shield")) {
            return 40;
        }
        if (itemName.equals("Gilded full helm")) {
            return 40;
        }
        if (itemName.equals("Gilded platebody")) {
            return 40;
        }
        if (itemName.equals("Gilded plateskirt")) {
            return 40;
        }
        if (itemName.equals("Gilded platelegs")) {
            return 40;
        }
        if (itemName.equals("Gilded kiteshield")) {
            return 40;
        }
        if (itemName.equals("Fighter torso")) {
            return 40;
        }
        if (itemName.equals("Granite legs")) {
            return 50;
        }
        if (itemName.equals("Toktz-ket-xil")) {
            return 60;
        }
        if (itemName.equals("Dharoks helm")) {
            return 70;
        }
        if (itemName.equals("Dharoks platebody")) {
            return 70;
        }
        if (itemName.equals("Dharoks platelegs")) {
            return 70;
        }
        if (itemName.equals("Guthans helm")) {
            return 70;
        }
        if (itemName.equals("Guthans platebody")) {
            return 70;
        }
        if (itemName.equals("Guthans chainskirt")) {
            return 70;
        }
        if (itemName.equals("Torags helm")) {
            return 70;
        }
        if (itemName.equals("Torags platebody")) {
            return 70;
        }
        if (itemName.equals("Torags platelegs")) {
            return 70;
        }
        if (itemName.equals("Veracs helm")) {
            return 70;
        }
        if (itemName.equals("Veracs brassard")) {
            return 70;
        }
        if (itemName.equals("Veracs plateskirt")) {
            return 70;
        }
        if (itemName.equals("Ahrims hood")) {
            return 70;
        }
        if (itemName.equals("Ahrims robetop")) {
            return 70;
        }
        if (itemName.equals("Ahrims robeskirt")) {
            return 70;
        }
        if (itemName.equals("Karils coif")) {
            return 70;
        }
        if (itemName.equals("Karils leathertop")) {
            return 70;
        }
        if (itemName.equals("Karils leatherskirt")) {
            return 70;
        }
        if (itemName.equals("Granite shield")) {
            return 50;
        }
        if (itemName.equals("New crystal shield")) {
            return 70;
        }
        if (itemName.equals("Archer helm")) {
            return 45;
        }
        if (itemName.equals("Berserker helm")) {
            return 45;
        }
        if (itemName.equals("Warrior helm")) {
            return 45;
        }
        if (itemName.equals("Farseer helm")) {
            return 45;
        }
        if (itemName.equals("Initiate helm")) {
            return 20;
        }
        if (itemName.equals("Initiate platemail")) {
            return 20;
        }
        if (itemName.equals("Initiate platelegs")) {
            return 20;
        }
        if (itemName.equals("Dragonhide body")) {
            return 40;
        }
        if (itemName.equals("Mystic hat")) {
            return 20;
        }
        if (itemName.equals("Mystic robe top")) {
            return 20;
        }
        if (itemName.equals("Mystic robe bottom")) {
            return 20;
        }
        if (itemName.equals("Mystic gloves")) {
            return 20;
        }
        if (itemName.equals("Mystic boots")) {
            return 20;
        }
        if (itemName.equals("Enchanted hat")) {
            return 20;
        }
        if (itemName.equals("Enchanted top")) {
            return 20;
        }
        if (itemName.equals("Enchanted robe")) {
            return 20;
        }
        if (itemName.equals("Splitbark helm")) {
            return 40;
        }
        if (itemName.equals("Splitbark body")) {
            return 40;
        }
        if (itemName.equals("Splitbark gauntlets")) {
            return 40;
        }
        if (itemName.equals("Splitbark legs")) {
            return 40;
        }
        if (itemName.equals("Splitbark greaves")) {
            return 40;
        }
        if (itemName.equals("Infinity gloves")) {
            return 25;
        }
        if (itemName.equals("Infinity hat")) {
            return 25;
        }
        if (itemName.equals("Infinity top")) {
            return 25;
        }
        if (itemName.equals("Infinity bottoms")) {
            return 25;
        }
        if (itemName.equals("Infinity boots")) {
            return 25;
        }
        return 1;
    }
    public static int getCLHerblore(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9774 || ItemID == 9775 || ItemID == 9776 || ItemID == 10649) {
            return 99;
        }
        return 1;
    }
    public static int getCLFishing(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9798 || ItemID == 9799 || ItemID == 9800 || ItemID == 10657) {
            return 99;
        }
        return 1;
    }
    public static int getCLWoodcutting(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9807 || ItemID == 9808 || ItemID == 9809 || ItemID == 10660) {
            return 99;
        }
        return 1;
    }
    public static int getCLMining(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9792 || ItemID == 9793 || ItemID == 9794 || ItemID == 10655) {
            return 99;
        }
        return 1;
    }
    public static int getCLRunecraft(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9765 || ItemID == 9765 || ItemID == 9765 || ItemID == 10645) {
            return 99;
        }
        return 1;
    }
    public static int getCLAgility(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9771 || ItemID == 9772 || ItemID == 9773 || ItemID == 10648) {
            return 99;
        }
        return 1;
    }
    public static int getCLCooking(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9801 || ItemID == 9802 || ItemID == 9803 || ItemID == 10658) {
            return 99;
        }
        return 1;
    }
    public static int getCLSmithing(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9795 || ItemID == 9796 || ItemID == 9797 || ItemID == 10656) {
            return 99;
        }
        return 1;
    }
    public static int getCLFarming(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9810 || ItemID == 9811 || ItemID == 9812 || ItemID == 10661) {
            return 99;
        }
        return 1;
    }	
    public static int getCLSlayer(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9786 || ItemID == 9787 || ItemID == 9788 || ItemID == 10653) {
            return 99;
        }
        return 1;
    }
    public static int getCLFletching(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9783 || ItemID == 9784 || ItemID == 9785 || ItemID == 10652) {
            return 99;
        }
        return 1;
    }
    public static int getCLCrafting(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9780 || ItemID == 9781 || ItemID == 9782 || ItemID == 10651) {
            return 99;
        }
        return 1;
    }
    public static int getCLTheft(ItemDefinition def) {
        String itemName = def.getName();
	int ItemID = def.getId();
	if (ItemID == 9777 || ItemID == 9778 || ItemID == 9779 || ItemID == 10650) {
            return 99;
        }
        return 1;
    }
}

