package com.rs2hd.content.skills.smithing;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Smelt {
	Player p;
	boolean isSmithing = false;
	int hammeringemote = 898;
	int smithingXpRate = 50;
	int smithingLvl = 1;
	int usedBar = -1;
	int using1bar[]  = {21,29,37,45,53,61,69,77,93,109,125,141};
	int using2bars[] = {117,133,149,157,213,270};
	int using3bars[] = {181,189,197,205,221,229,237};
	int using5bars[] = {245};
	int exp[] = {125,250,375,500,625,750};
	int typeitems[];
	int typelvl[];
	int BarId = 2349;
	int itemAmt = 0;
	int currenttype;
	int makeX = 0;
	int exP;
	int bars[] = {2349,2351,2353,2359,2361,2363};
	String Itemnames[] = {"Dagger" , "Axe" , "Mace"  ,"Medium helm" , "Crosbow bolts" , "Sword" , "Dart tips" , "Nails" , "Arrow heads" , "Scimater" , "Limbs" , "Long sword" , "Trowing knife" , "Full helm" , "Square Shield" , "Warhammer" , "Battleaxe" , "Chainbody" , "Kite shield" , "Claws" , "2 hand sword" , "Plate skirt" , "Plate legs" , "Plate body" , "Pick axe"};
	int spot[]          = {    18,        26,     34,        42,                50,        58,      74,             98,         106,           114,              122,         130,                   138,          146,         154,           178, 186, 194, 202, 210, 218, 226, 234, 242};
	int baramouts[]     = {   1,         1,      1,         1,                 1,             1,         1,          1,        1,             2,          1,           2,             1,                2,           2,                 3,            3,            3,            3,           2,             3,              3,             3,            5,            2  };
	int displayamout[]  = {-1, -1, -1,     -1,                10,            -1,        15,         15,       15,            -1,         -1,          -1,             5,               -1,          -1,                -1,           -1,           -1,           -1,          -1,            -1,             -1,            -1,           -1,           -1  };
	int bronzeItems[]   = {1205,      1351,   1422,      1139,              877 ,          1277,       819,       4819,       39,          1321,       9420,        1291,           864,             1155,        1173,              1337,         1375,         1103,         1189,        3095,          1307,           1087,          1075,         1117,         1265  };
	int bronzelvls[]    = {   1,         1,      2,         3,                 3,             4,         4,          4,        5,             5,          6,           6,             7,                7,           8,                 9,           10,           11,           12,          13,            14,             16,            16,           18,            5  };
	int ironItems[]     = {1203,      1349,   1420,      1137,              9377,          1279,       820,       4820,       40,          1323,       9423,        1293,           863,             1153,        1175,              1335,         1363,         1101,         1191,        3096,          1309,           1081,          1067,         1115,         1267  };
	int ironlvls[]      = {  15,        16,     17,        18,                18,            19,        19,         19,       20,            20,         23,          21,            22,               22,          23,                24,           25,           26,           27,          28,            29,             31,            31,           33,           20  };
	int steelItems[]    = {1207,      1353,   1424,      1141,              9378,          1281,       821,       1539,       41,          1325,       9425,        1295,           865,             1157,        1177,              1339,         1365,         1105,         1193,        3097,          1311,           1083,          1069,         1119,         1269  };
	int steellvls[]     = {  30,        31,     32,        33,                33,            34,        34,         34,       35,            35,         36,          36,            37,               37,          38,                39,           40,           41,           42,          43,            44,             46,            46,           48,           35  };
	int mithrilItems[]  = {1209,      1355,   1428,      1143,              9379,          1285,       822,       4822,       42,          1329,       9427,        1299,           866,             1159,        1181,              1343,         1369,         1109,         1197,        3099,          1315,           1085,          1071,         1121,         1273  };
	int mithrillvls[]   = {  50,        51,     52,        53,                53,            54,        54,         54,       55,            55,         56,          56,            57,               57,          58,                59,           60,           61,           62,          63,            64,             66,            66,           68,           55  };
	int adamantItems[]  = {1211,      1357,   1430,      1145,              9380,          1287,       823,       4823,       43,          1331,       9429,        1301,           867,             1161,        1183,              1345,         1371,         1111,         1199,        3100,          1317,           1091,          1073,         1123,         1271  };
	int adamantlvls[]   = {  70,        71,      72,       73,                73,            74,        74,         74,       75,            75,         76,          76,            77,               77,          78,                79,           80,           81,           82,          83,            84,             86,            86,           88,           75  };
	int runeItems[]     = {1213,      1359,   1432,      1147,              9381,          1289,       824,       4824,       44,          1333,       9431,        1303,           868,             1163,        1185,              1347,         1373,         1113,         1201,        3101,          1319,           1093,          1079,         1127,         1275  };
	int runelvls[]      = {  85,        86,     87,        88,                88,            89,        89,         89,       90,            90,         91,          91,            92,               92,          93,                94,           95,           96,           97,          98,            99,             99,            99,           99,           90  };
	int amounts[] 		= {1, 1, 1,	1, 1, 1, 1,	1,	1,	1,	1,	1,	1, 1, 1,					1,				1,			1,				1,			1,			1,				1,				1,				1,			1   };
	
	public void Smithing(Player player) {
		this.p = player;
	}
	
	public void itemOnObject(Player p, int itemId, int objectId) {
		if (objectId != 2783) {
			return;
		}
		if (p.getInventory().numberOf(2347) == 0) {
			p.getActionSender().sendMessage("you need a hammer to smith!");
			return;
		} else {
			if(itemId == 2349 && objectId == 2783) {
				openSmithScreen(p,1);
			} else if(itemId == 2351 && objectId == 2783) {
				openSmithScreen(p,2);
			} else if(itemId == 2353 && objectId == 2783) {
				openSmithScreen(p,3);
			} else if(itemId == 2359 && objectId == 2783) {
				openSmithScreen(p,4);
			} else if(itemId == 2361 && objectId == 2783) {
				openSmithScreen(p,5);
			} else if(itemId == 2363 && objectId == 2783) {
				openSmithScreen(p,6);
			}
		}
	}
	public void openSmithScreen(Player p,int usedBar) {
		itemAmt = 0;
		currenttype = usedBar;
		p.getActionSender().sendInterface(300);
		setItemsOnScreen(p,usedBar);
		setTitle(p,usedBar);
	}
	public void handlebuttons(Player p,int InterfaceId,int buttonId,int buttonId2) {
		switch(buttonId){
		// dagger
		case 25:
			smithingSystem(p, currenttype, 0, 1);
			break;
		case 24:
			smithingSystem(p, currenttype, 0, 5);
			break;
		case 23:
			smithingSystem(p, currenttype, 0, makeX);
			break;
		case 22:
			smithingSystem(p, currenttype, 0,28);
			break;
			// axe
		case 33:
			smithingSystem(p, currenttype, 1, 1);
			break;
		case 32:
			smithingSystem(p, currenttype, 1, 5);
			break;
		case 31:
			smithingSystem(p, currenttype, 1, makeX);
			break;
		case 30:
			smithingSystem(p, currenttype, 1, 28);
			break;
			// mace            
		case 41:
			smithingSystem(p, currenttype, 2, 1);
			break;
		case 40:
			smithingSystem(p, currenttype, 2, 5);
			break;
		case 39:
			smithingSystem(p, currenttype, 2, makeX);
			break;
		case 38:
			smithingSystem(p, currenttype, 2,  28);
			break;
			//med helm
		case 49:
			smithingSystem(p, currenttype, 3, 1);
			break;
		case 48:
			smithingSystem(p, currenttype, 3, 5);
			break;
		case 47:
			smithingSystem(p, currenttype, 3, makeX);
			break;
		case 46:
			smithingSystem(p, currenttype, 3,  28);
			break;
			// crossbow bolts
		case 57:
			smithingSystem(p, currenttype, 4, 1);
			break;
		case 56:
			smithingSystem(p, currenttype, 4, 5);
			break;
		case 55:
			smithingSystem(p, currenttype, 4, makeX);
			break;
		case 54:
			smithingSystem(p, currenttype, 4, 28);
			break;
			// sword
		case 65:
			smithingSystem(p, currenttype, 5, 1);
			break;
		case 64:
			smithingSystem(p, currenttype, 5, 5);
			break;
		case 63:
			smithingSystem(p, currenttype, 5, makeX);
			break;
		case 62:
			smithingSystem(p, currenttype, 5, 28);
			break;
			// dart tips
		case 73:
			smithingSystem(p, currenttype, 6, 1);
			break;
		case 72:
			smithingSystem(p, currenttype, 6, 5);
			break;
		case 71:
			smithingSystem(p, currenttype, 6, makeX);
			break;
		case 70:
			smithingSystem(p, currenttype, 6, 28);
			break;
			// nails
		case 81:
			smithingSystem(p, currenttype, 7, 1);
			break;
		case 80:
			smithingSystem(p, currenttype, 7, 5);
			break;
		case 79:
			smithingSystem(p, currenttype, 7, makeX);
			break;
		case 78:
			smithingSystem(p, currenttype, 7, 28);
			break;
			// arrow tips
		case 113:
			smithingSystem(p, currenttype, 8, 1);
			break;
		case 112:
			smithingSystem(p, currenttype, 8, 5);
			break;
		case 111:
			smithingSystem(p, currenttype, 8, makeX);
			break;
		case 110:
			smithingSystem(p, currenttype, 8, 28);
			break;
			// scimitar
		case 121:
			smithingSystem(p, currenttype, 9, 1);
			break;
		case 120:
			smithingSystem(p, currenttype, 9, 5);
			break;
		case 119:
			smithingSystem(p, currenttype, 9, makeX);
			break;
		case 118:
			smithingSystem(p, currenttype, 9, 28);
			break;
			//crosbow limbs
		case 129:
			smithingSystem(p, currenttype, 10, 1);
			break;
		case 128:
			smithingSystem(p, currenttype, 10, 5);
			break;
		case 127:
			smithingSystem(p, currenttype, 10, makeX);
			break;
		case 126:
			smithingSystem(p, currenttype, 10, 28);
			break;
			// longsword
		case 137:
			smithingSystem(p, currenttype, 11, 1);
			break;
		case 136:
			smithingSystem(p, currenttype, 11, 5);
			break;
		case 135:
			smithingSystem(p, currenttype, 11, makeX);
			break;
		case 134:
			smithingSystem(p, currenttype, 11, 28);
			break;
			//trowing knife
		case 145:
			smithingSystem(p, currenttype, 12, 1);
			break;
		case 144:
			smithingSystem(p, currenttype, 12, 5);
			break;
		case 143:
			smithingSystem(p, currenttype, 12, makeX);
			break;
		case 142:
			smithingSystem(p, currenttype, 12, 28);
			break;
			// full helm
		case 153:
			smithingSystem(p, currenttype, 13, 1);
			break;
		case 152:
			smithingSystem(p, currenttype, 13, 5);
			break;
		case 151:
			smithingSystem(p, currenttype, 13, makeX);
			break;
		case 150:
			smithingSystem(p, currenttype, 13, 28);
			break;


			// square shield
		case 161:
			smithingSystem(p, currenttype, 14, 1);
			break;
		case 160:
			smithingSystem(p, currenttype, 14, 5);
			break;
		case 159:
			smithingSystem(p, currenttype, 14, makeX);
			break;
		case 158:
			smithingSystem(p, currenttype, 14, 28);
			break;
			// warhammer
		case 185:
			smithingSystem(p, currenttype, 15, 1);
			break;
		case 184:
			smithingSystem(p, currenttype, 15, 5);
			break;
		case 183:
			smithingSystem(p, currenttype, 15, makeX);
			break;
		case 182:
			smithingSystem(p, currenttype, 15, 28);
			break;
			// battle axe
		case 193:
			smithingSystem(p, currenttype, 16, 1);
			break;
		case 192:
			smithingSystem(p, currenttype, 16, 5);
			break;
		case 191:
			smithingSystem(p, currenttype, 16, makeX);
			break;
		case 190:
			smithingSystem(p, currenttype, 16, 28);
			break;
			// chain body
		case 201:
			smithingSystem(p, currenttype, 17, 1);
			break;
		case 200:
			smithingSystem(p, currenttype, 17, 5);
			break;
		case 199:
			smithingSystem(p, currenttype, 17, makeX);
			break;
		case 198:
			smithingSystem(p, currenttype, 17, 28);
			break;
			//kiteshield
		case 209:
			smithingSystem(p, currenttype, 18, 1);
			break;
		case 208:
			smithingSystem(p, currenttype, 18, 5);
			break;
		case 207:
			smithingSystem(p, currenttype, 18, makeX);
			break;
		case 206:
			smithingSystem(p, currenttype, 18, 28);
			break;
			// claws
		case 217:
			smithingSystem(p, currenttype, 19, 1);
			break;
		case 216:
			smithingSystem(p, currenttype, 19, 5);
			break;
		case 215:
			smithingSystem(p, currenttype, 19, makeX);
			break;
		case 214:
			smithingSystem(p, currenttype, 19, 28);
			break;
			// 2h sword
		case 225:
			smithingSystem(p, currenttype, 20, 1);
			break;
		case 224:
			smithingSystem(p, currenttype, 20, 5);
			break;
		case 223:
			smithingSystem(p, currenttype, 20, makeX);
			break;
		case 222:
			smithingSystem(p, currenttype, 20, 28);
			break;
			//plate skirt
		case 233:
			smithingSystem(p, currenttype, 21, 1);
			break;
		case 232:
			smithingSystem(p, currenttype, 21, 5);
			break;
		case 231:
			smithingSystem(p, currenttype, 21, makeX);
			break;
		case 230:
			smithingSystem(p, currenttype, 21, 28);
			break;
			// plate legs
		case 241:
			smithingSystem(p, currenttype, 22, 1);
			break;
		case 240:
			smithingSystem(p, currenttype, 22, 5);
			break;
		case 239:
			smithingSystem(p, currenttype, 22, makeX);
			break;
		case 238:
			smithingSystem(p, currenttype, 22, 28);
			break;
			// plate body
		case 249:
			smithingSystem(p, currenttype, 23, 1);
			break;
		case 248:
			smithingSystem(p, currenttype, 23, 5);
			break;
		case 247:
			smithingSystem(p, currenttype, 23, makeX);
			break;
		case 246:
			smithingSystem(p, currenttype, 23, 28);
			break;
			// pick axe
		case 274:
			smithingSystem(p, currenttype, 24, 1);
			break;
		case 273:
			smithSystem(p, currenttype, 24, 5);
			break;
		case 272:
			smithSystem(p, currenttype, 24, makeX);
			break;
		case 271:
			smithSystem(p, currenttype, 24, 28);
			break;
		}
	}
	public int countbars(Player p, int itemId) {
		return p.getInventory().numberOf(itemId);
	}
	public void setTitle(Player p,int usedBar) {
		switch (usedBar) {
		case 1:
			p.getActionSender().sendString( "Bronze Smithing", 300, 15);//Bronze
			break;
		case 2:
			p.getActionSender().sendString( "Iron Smithing", 300, 15);//iron
			break;
		case 3:
			p.getActionSender().sendString( "Steel Smithing", 300, 15);//steel
			break;
		case 4:
			p.getActionSender().sendString( "Mithril Smithing", 300, 15);//mithril
			break;
		case 5:
			p.getActionSender().sendString( "Adamant Smithing", 300, 15);//addmant
			break;
		case 6:
			p.getActionSender().sendString( "Rune Smithing", 300, 15);//rune
			break;
		}
	}
	public void setItemsOnScreen(Player p,int usedBar){
		for(int i = 0; i < Itemnames.length; i++) {
			switch(usedBar) {
			case 1:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], bronzeItems[i]);
				break;
			case 2:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], ironItems[i]);
				break;
			case 3:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], steelItems[i]);
				break;
			case 4:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], mithrilItems[i]);
				break;
			case 5:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], adamantItems[i]);
				break;
			case 6:
				p.getActionSender().itemOnInterface(300, spot[i], displayamout[i], runeItems[i]);
				break;
			}
		}
	}
	private int counter;
	public void smithingSystem(final Player p, final int type, final int id, final int amount) {
		if (isSmithing) {
			return;
		}
		gettype(type);
		isSmithing = true;
		World.getInstance().registerEvent(new Event(800) {
			public void execute() { 
				if (counter == 0) {
					if (p == null) {
						this.stop();
						return;
					}
					if (!isSmithing) {
						this.stop();
						return;
					}
					if (p.getSkills().getLevel(13) >= typelvl[id]) {
						if (p.getInventory().numberOf(BarId) >= baramouts[id]) {
							p.getActionSender().sendCloseInterface();
							p.getInventory().deleteItem(BarId, baramouts[id]);
							p.getInventory().addItem(typeitems[id],1);
							p.getSkills().addXp(13,((exP/100)*smithingXpRate*baramouts[id]));
							p.animate(hammeringemote,0);
							counter = 4;
						} else {
							p.getActionSender().sendMessage("You don't have any bars left!");
							isSmithing = false;
							this.stop();
						}
						} else {
							p.getActionSender().sendMessage("Your smithing level is too low.");
							isSmithing = false;
							this.stop();
						}
					}
					counter--;
				}
			});
		}
		public void smithSystem(Player p,int type,int id,int amout){
			gettype(type);
			for (int i = 0; i < amout; i++) {
				if (p.getSkills().getLevel(13) >= typelvl[id]) {
					if (p.getInventory().numberOf(BarId) >= baramouts[id]) {
						p.getActionSender().sendCloseInterface();
						p.getInventory().deleteItem(BarId, baramouts[id]);
						p.getInventory().addItem(typeitems[id],Math.abs(displayamout[id]));
						p.getSkills().addXp(13,((exP/100)*smithingXpRate*baramouts[id]));
						p.animate(hammeringemote,0);
					}
				} else {
					p.getActionSender().sendMessage("Your smithing level is too low.");
				}
			}
		}

		public void gettype(int type) {
			switch (type) {
			case 1:
				typelvl = bronzelvls;
				typeitems = bronzeItems;
				BarId = 2349;
				exP = exp[0];
				break;
			case 2:
				typelvl = ironlvls;
				typeitems = ironItems;
				BarId = 2351;
				exP = exp[1];
				break;
			case 3:
				typelvl = steellvls;
				typeitems = steelItems;
				BarId = 2353;
				exP = exp[2];
				break;
			case 4:
				typelvl = mithrillvls;
				typeitems = mithrilItems;
				BarId = 2359;
				exP = exp[3];
				break;
			case 5:
				typelvl = adamantlvls;
				typeitems = adamantItems;
				BarId = 2361;
				exP = exp[4];
				break;
			case 6:
				typelvl = runelvls;
				typeitems = runeItems;
				BarId = 2363;
				exP = exp[5];
				break;
			}
		}
		public void setSmithing(boolean b) {
			this.isSmithing = b;
		}
	}
