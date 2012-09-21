package com.rs2hd.content.skills.combat;

import com.rs2hd.model.Player;
/**
 * @author Dragonkk 100%
 *
 */
public class PkDefinitions {
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean usingRange(Player p) {
		if(p.getEquipment().get(3) == null) {
			return false;
		}
			switch(p.getEquipment().get(3).getDefinition().getId()) {
				case 14684:
				case 4212:
				case 4214:
				case 4734:
				case 11235:
				case 13883:
				case 9185:
				case 868:
				case 867:
				case 866:
				case 865:
				case 863:
				case 861:
				case 841:
				case 843:
				case 845:
				case 847:
				case 849:
				case 851:
				case 853:
				case 855:
				case 857:
				case 859:
				case 10034:
				case 15241: return true;
				case 0: return false;
				case -1: return false;
				default: return false;
		}
	}
	public static int getExtraCombatDelay(Player p) {
	if (PkDefinitions.usingRange(p) && (p.getAttackStyle() == 0 || p.getAttackStyle() == 2))
	return 1;
	return 0;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static int getCombatDelay(Player p) {
		if(p.getEquipment().get(3) == null) {
			return 10*p.AttackSpeed;
		}
		switch(p.getEquipment().get(3).getDefinition().getId()) {
			case 15241:
				return 7;
			case 806: // Start of Darts
			case 807:
			case 808:
			case 809:
			case 810:
			case 811:
			case 11230:
			case 863: // Start of Knifes
			case 864:
			case 865:
			case 866:
			case 867:
			case 868:
			case 869:
				return (2+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

 			// Start of Shortbows
			case 861:
			case 841:
			case 843:
			case 845:
			case 847:
			case 849:
			case 851:
			case 853:
			case 855:
			case 857:
			case 859:
			case 4734: // Start of Karil's Cross & X-bow
			case 4934:
			case 4935:
			case 4936:
			case 4937:
				return (3+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

			case 1321: // Start of Scimitars
			case 1323:
			case 1325:
			case 1327:
			case 1329:
			case 1331:
			case 1333:
			case 4587:
			case 6611:
			case 11998:
			case 746: // Start of Daggers
			case 747:
			case 1213:
			case 1215:
			case 5696: // Start of Daggers(p++)
			case 5698:
			case 6597:
			case 13883:
			case 4151: // Whip & Sara Sword
			case 11730:
				return (4+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

			case 1420: // Start of Maces
			case 1422:
			case 1424:
			case 1426:
			case 1428:
			case 1430:
			case 1432:
			case 1434:
			case 6601:
			case 7808:
			case 8841:
			case 11061:
			case 839: // Start of Longbows
			case 1291: // Start of Longswords
			case 1293:
			case 1295:
			case 1297:
			case 1299:
			case 1301:
			case 1303:
			case 1305:
			case 6607:
			case 13899:
			case 1379: // Start of Staffs
			case 1381:
			case 1383:
			case 1385:
			case 1387:
			case 2415: // Start of God Staffs & Iban's Staff & Slayer staff
			case 2416:
			case 2417:
			case 1409:
			case 4170:
			case 1391: // Start of BattleStaffs
			case 1393:
			case 1395:
			case 1397:
			case 1399:
			case 4710: // Start of Ahrim's Staff
			case 4862:
			case 4863:
			case 4864:
			case 4865:
			case 9174: // Start of CrossBows
			case 9176:
			case 9177:
			case 9179:
			case 9181:
			case 9183:
			case 9185:
			case 14684:
			case 14484: // Dragon Claws
				return (5+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

			case 1335: // Start of WarHammers
			case 1337: 
			case 1339:
			case 1341:
			case 1343: 
			case 1345:
			case 1347: 
			case 6613:
			case 13902:
			case 4747: // Start of Torag's Hammers
			case 4958:
			case 4959:
			case 4960:
			case 4861:
			case 1363: // Start of BattleAxes
			case 1365:
			case 1367:
			case 136:
			case 1371:
			case 1373:
			case 1375:
			case 1377:
			case 6589:
			case 7807:
			case 4755: // Start of Verac's Flail
			case 4982:
			case 4983:
			case 4984:
			case 4985:
			case 1237: // Start of Spears
			case 1239:
			case 1241:
			case 1243:
			case 1245:
			case 1247:
			case 1249:
			case 7809:
			case 11716:
			case 13905:
			case 5718: // Start of Spears(p++)
			case 5720:
			case 5722:
			case 5724:
			case 5726:
			case 5728:
			case 5730:
			case 5736:
			case 4726: // Start of Guthan's Warspear
			case 4910:
			case 4911:
			case 4912:
			case 4913:
			case 3190: // Start of Halberds
			case 3192:
			case 3194:
			case 3196:
			case 3198:
			case 3200:
			case 3202:
			case 3204:
			case 6599:
				return (6+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

			case 11694: // Start of GodSwords
			case 11696:
			case 11698:
			case 11700:
			case 1307: // Start of 2Hs
			case 1309:
			case 1311:
			case 1313:
			case 1315:
			case 1317:
			case 1319:
			case 7158:
			case 6609:
			case 4718: // Start of Dharok's Greataxe
			case 4886:
			case 4887:
			case 4888:
			case 4889:
			case 10887: // BarrelChest Anchor, Dark Bow, Granite Maul, Obby Maul
			case 11235:
			case 4153:
			case 6528:
				return (6+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;

			default:
				return (6+PkDefinitions.getExtraCombatDelay(p))*p.AttackSpeed;
		}
	}
	public static int SoundID(Player p) {
		if(p.getEquipment().get(3) == null) {
			return 2566;
		}
		switch(p.getEquipment().get(3).getDefinition().getId()) {
			case 806: // Start of Darts
			case 807:
			case 808:
			case 809:
			case 810:
			case 811:
			case 11230:
			case 863: // Start of Knifes
			case 864:
			case 865:
			case 866:
			case 867:
			case 868:
			case 869:
				return 2707;

			case 0:
			return -1;

			case 4151:
			return 2720;

			case 1307: // Start of 2Hs
			case 1309:
			case 1311:
			case 1313:
			case 1315:
			case 1317:
			case 1319:
			case 7158:
			case 6609:	
			return 2504;

			case 6528:
			return 2520;
	
			case 11235:
			return 3731;

			case 1379: // Start of Staffs
			case 1381:
			case 1383:
			case 1385:
			case 1387:
			case 2415: // Start of God Staffs & Iban's Staff & Slayer staff
			case 2416:
			case 2417:
			case 1409:
			case 4170:
			case 1391: // Start of BattleStaffs
			case 1393:
			case 1395:
			case 1397:
			case 1399:
			case 4710: // Start of Ahrim's Staff
			case 4862:
			case 4863:
			case 4864:
			case 4865:
			return 2555;

			case 4755: // Start of Verac's Flail
			case 4982:
			case 4983:
			case 4984:
			case 4985:
			return 1322;

			case 4747: // Start of Torag's Hammers
			case 4958:
			case 4959:
			case 4960:
			case 4861:
			return 1330;

			case 4718: // Start of Dharok's Greataxe
			case 4886:
			case 4887:
			case 4888:
			case 4889:
			return 1320;

			case 4726: // Start of Guthan's Warspear
			case 4910:
			case 4911:
			case 4912:
			case 4913:
			return 1333;

			case 1363: // Start of BattleAxes
			case 1365:
			case 1367:
			case 136:
			case 1371:
			case 1373:
			case 1375:
			case 1377:
			case 6589:
			case 7807:
			return 2498;

			case 1277:
			case 1279:
			case 1281:
			case 1283:
			case 1285:
			case 1287:
			case 1289:
			return 2499;


			case 1321: // Start of Scimitars
			case 1323:
			case 1325:
			case 1327:
			case 1329:
			case 1331:
			case 1333:
			case 4587:
			case 6611:
			case 11998:			case 1291:  // Start of Longswords
			case 1293:
			case 1295:
			case 1297:
			case 1299:
			case 1301:
			case 1303:
			case 1305:
			case 6607:
			case 13899:
			return 2500;


			case 746: // Start of Daggers
			case 747:
			case 1213:
			case 1215:
			case 5696: // Start of Daggers(p++)
			case 5698:
			case 6597:
			return 2549;


			case 11694: // Start of GodSwords
			case 11696:
			case 11698:
			case 11700:
			return 3849;


			case 4734: // Start of Karil's Cross & X-bow
			case 4934:
			case 4935:
			case 4936:
			case 4937:
			case 9174: // Start of CrossBows
			case 9176:
			case 9177:
			case 9179:
			case 9181:
			case 9183:
			case 9185:
			case 14684:
			return 1081;

			default:
				return 2566;
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static int getCombatAnim(Player p) {
		switch (p.getAttackStyle()) {
		case 0:
		case 1:
		case 3:
		if(p.getEquipment().get(3) == null) {
			return 451;
		}
		switch (p.getEquipment().get(3).getDefinition().getId()) {
		case -1:
			return 422;
		case 14484:
			return 393;
                case 13902:
			return 393;
		case 4718:
			if(p.attackStyle != 2) {
				return 2067;
			} else {
				return 2066;
			}
		case 4587:
                case 1323:
                case 1333:
                case 13899:
                case 13979:
			return 12029;
		case 806:
		case 807:
		case 808:
		case 809:
		case 810:
		case 811:
		case 11230:
			return 582;
		case 13883:
			return 10504;
		case 863:
		case 864:
		case 865:
		case 866:
		case 867:
		case 868:
		case 869:
		case 870:
		case 871:
		case 872:
		case 873:
		case 874:
		case 875:
		case 876:
			return 806;
		case 5698:
		case 10581:
			return 402;
		case 4726:
			return 2080;
		case 6528:
			return 2661;
		case 4153:
			return 1665;
		case 4734:
			return 2075;
		case 9703:
			return 412;
		case 3204:
			return 440;
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
		case 11694:
		case 11696:
		case 11698:
		case 11700:
		case 11670:
		case 11730:
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
		case 14684:
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
			case 861:
			case 841:
			case 843:
			case 845:
			case 847:
			case 849:
			case 851:
			case 853:
			case 855:
			case 857:
			case 859:
		case 11235:
		case 4212:
		case 4214:
			return 426;
		case 15241:
			return 12174;
		}
		case 2:
			if(p.getEquipment().get(3) == null) {
				return 451;
			}
			switch (p.getEquipment().get(3).getDefinition().getId()) {
			case -1:
				return 422;
			case 14484:
				return 393;
                        case 13902:
			        return 393;
			case 4718:
				return 2066;
                        case 4587:
                        case 1323:
                        case 1333:
                        case 13899:
                        case 13979:
			        return 12029;
			case 806:
			case 807:
			case 808:
			case 809:
			case 810:
			case 811:
			case 11230:
				return 582;
			case 863:
			case 864:
			case 865:
			case 866:
			case 867:
			case 868:
			case 869:
			case 870:
			case 871:
			case 872:
			case 873:
			case 874:
			case 875:
			case 876:
				return 806;
			case 5698:
			case 10581:
				return 395;
			case 4726:
				return 2080;
			case 6528:
				return 2661;
			case 4153:
				return 1665;
			case 4734:
				return 2075;
			case 9703:
				return 412;
			case 3204:
				return 440;
			case 1307:
			case 1309:
			case 1311:
			case 1313:
			case 1315:
			case 1317:
			case 1319:
			case 11694:
			case 11696:
			case 11698:
			case 11670:
			case 11730:
				return 7048;
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
			case 14684:
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
				return 5685;
			case 4151:
				return 1658;
			case 861:
			case 853:
			case 11235:
			case 4212:
			case 4214:
				return 426;
			case 15241:
				return 12174;
			}
		default: return 451;
	}
	}
}
