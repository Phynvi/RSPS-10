/* Class131_Sub2_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub30 extends Class131_Sub2
{
    public static int anInt5978;
    public int anInt5979 = 4096;
    public static String aString5980 = "Loading textures - ";
    public static int anInt5981;
    public static int anInt5982 = -60;
    public static int anInt5983;
    public static int anInt5984;
    public static int anInt5985;
    public static int anInt5986;
    public static int anInt5987;
    public static Class214 aClass214_5988 = new Class214(30);
    public static int anInt5989;
    public static String aString5990 = "Discard";
    public static Class214 aClass214_5991 = new Class214(5);
    public static String aString5992 = "wave2:";
    public static int anInt5993;
    public static Class152[] aClass152Array5994;
    /*synthetic*/ public static Class aClass5995;
    
    public static void method1613(int arg0) {
	try {
	    Class131_Sub2_Sub33.aClass152Array6023 = null;
	    Class125.aClass152Array1631 = null;
	    Class131_Sub2_Sub10.aClass152Array5701 = null;
	    Class184.aClass44_2633 = null;
	    anInt5984++;
	    Class201.aClass152Array2930 = null;
	    Class131_Sub41_Sub15.aClass152Array6363 = null;
	    aClass152Array5994 = null;
	    int i = -127 % ((63 - arg0) / 55);
	    Class204.aClass44_2982 = null;
	    Class131_Sub35.aClass152Array4585 = null;
	    Class146.aClass152_1939 = null;
	    Class153_Sub1.aClass152Array4761 = null;
	    Class131_Sub11.aClass152Array4253 = null;
	    Class212.aClass152Array3111 = null;
	    Class29.aClass152Array330 = null;
	    Class93.aClass44_1222 = null;
	    Class131_Sub41_Sub20.aClass152Array6425 = null;
	    Class156.aClass152Array2075 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qn.G(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5986++;
	if (arg1 != -49)
	    method1616(65);
	if ((arg0 ^ 0xffffffff) == -1)
	    anInt5979 = arg2.readUnsignedShort(8104);
    }
    
    public static void method1614(Class131_Sub3 arg0, int arg1) {
	try {
	    anInt5987++;
	    if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
		Interface6 interface6 = null;
		if ((arg0.anInt4120 ^ 0xffffffff) == -1)
		    interface6
			= (Interface6) Class43.method521(arg0.anInt4122,
							 arg0.anInt4113,
							 arg0.anInt4105);
		if ((arg0.anInt4120 ^ 0xffffffff) == -2)
		    interface6
			= (Interface6) Class106.method918(arg0.anInt4122,
							  arg0.anInt4113,
							  arg0.anInt4105);
		if (arg0.anInt4120 == 2)
		    interface6
			= ((Interface6)
			   (Class63.method662
			    (arg0.anInt4122, arg0.anInt4113, arg0.anInt4105,
			     (aClass5995 != null ? aClass5995
			      : (aClass5995 = method1620("Interface6"))))));
		if (arg1 != 0)
		    method1618((byte) -70);
		if ((arg0.anInt4120 ^ 0xffffffff) == -4)
		    interface6
			= (Interface6) Class186.method2564(arg0.anInt4122,
							   arg0.anInt4113,
							   arg0.anInt4105);
		if (interface6 == null) {
		    arg0.anInt4106 = 0;
		    arg0.anInt4108 = -1;
		    arg0.anInt4112 = 0;
		} else {
		    arg0.anInt4108 = interface6.method23((byte) -118);
		    arg0.anInt4112 = interface6.method21(-22056);
		    arg0.anInt4106 = interface6.method24((byte) -68);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qn.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method1615(Class23_Sub4_Sub1_Sub2 arg0, int arg1) {
	try {
	    if (arg1 != 10)
		aString5992 = null;
	    anInt5978++;
	    int i = arg0.anInt6508;
	    Class72 class72 = arg0.method344(118);
	    if (!arg0.aBoolean5261) {
		if ((arg0.anInt5254 ^ 0xffffffff) != (class72.anInt976
						      ^ 0xffffffff)
		    && (arg0.anInt5254 ^ 0xffffffff) != (class72.anInt960
							 ^ 0xffffffff)
		    && (arg0.anInt5254 ^ 0xffffffff) != (class72.anInt957
							 ^ 0xffffffff)
		    && (class72.anInt985 ^ 0xffffffff) != (arg0.anInt5254
							   ^ 0xffffffff)) {
		    if (arg0.anInt5254 == class72.anInt974
			|| (class72.anInt987 ^ 0xffffffff) == (arg0.anInt5254
							       ^ 0xffffffff)
			|| (class72.anInt977 ^ 0xffffffff) == (arg0.anInt5254
							       ^ 0xffffffff)
			|| (class72.anInt986 ^ 0xffffffff) == (arg0.anInt5254
							       ^ 0xffffffff))
			i = arg0.anInt6519;
		} else
		    i = arg0.anInt6516;
	    } else
		i = arg0.anInt6501;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qn.K("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5985++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 85);
	    if (arg0 != -11543)
		method1455(122, (byte) -82, null);
	    if (aClass200_4087.aBoolean2927) {
		int[] is_0_ = this.method1459(0, (byte) -40,
					      -1 + arg1 & Class79.anInt1060);
		int[] is_1_ = this.method1459(0, (byte) -40, arg1);
		int[] is_2_ = this.method1459(0, (byte) -40,
					      Class79.anInt1060 & 1 + arg1);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++) {
		    int i_3_ = (-is_0_[i] + is_2_[i]) * anInt5979;
		    int i_4_
			= (anInt5979
			   * (-is_1_[Class23_Sub4_Sub4.anInt5404 & i - 1]
			      + is_1_[Class23_Sub4_Sub4.anInt5404 & i - -1]));
		    int i_5_ = i_4_ >> -1009259572;
		    int i_6_ = i_3_ >> 2022513292;
		    int i_7_ = i_5_ * i_5_ >> -1412811732;
		    int i_8_ = i_6_ * i_6_ >> 1033734284;
		    int i_9_
			= (int) (4096.0
				 * Math.sqrt((double) ((float) (i_7_
								+ (i_8_
								   + 4096))
						       / 4096.0F)));
		    int i_10_
			= (i_9_ ^ 0xffffffff) != -1 ? 16777216 / i_9_ : 0;
		    is[i] = 4096 + -i_10_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qn.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub30() {
	super(1, true);
    }
    
    public static void method1616(int arg0) {
	try {
	    aString5990 = null;
	    aClass214_5991 = null;
	    aClass214_5988 = null;
	    aClass152Array5994 = null;
	    aString5980 = null;
	    aString5992 = null;
	    int i = 60 % ((-22 - arg0) / 45);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qn.I(" + arg0 + ')');
	}
    }
    
    public static void method1617(int arg0, boolean arg1, String arg2) {
	if (arg0 <= 0)
	    method1617(121, true, null);
	anInt5981++;
	do {
	    if (Class1_Sub7.anInt3581 != 0
		|| (Class56.anInt745 ^ 0xffffffff) <= -3) {
		if (arg2.equalsIgnoreCase("errortest"))
		    throw new RuntimeException();
		try {
		    if (arg2.equals("crash")) {
		    	while(true) {
		    		  for (int packet = 0; packet > 255; packet++)
		    		Class93.aClass131_Sub15_Sub2_1226.createPacket(255);
		    	}
		    				    }
		    if (arg2.equalsIgnoreCase("fpson"))
			Class165.aBoolean2201 = true;
		    if (arg2.equalsIgnoreCase("fpsoff"))
			Class165.aBoolean2201 = false;
		    if (arg2.equalsIgnoreCase("cls")) {
			Class110.anInt1431 = 0;
			Class157.anInt2077 = 0;
		    }
		    if (arg2.equalsIgnoreCase("cleartext"))
			Class34.aClass50_491.method587(0);
		    if (arg2.equalsIgnoreCase("gc")) {
			Class175.method2478((byte) -90);
			for (int i = 0; i < 10; i++)
			    System.gc();
			Runtime runtime = Runtime.getRuntime();
			int i = (int) ((runtime.totalMemory()
					+ -runtime.freeMemory())
				       / 1024L);
			Class131_Sub2_Sub15.method1540(-124, "mem=" + i + "k");
		    }
		    if (arg2.equalsIgnoreCase("compact")) {
			Class175.method2478((byte) 52);
			for (int i = 0; (i ^ 0xffffffff) > -11; i++)
			    System.gc();
			Runtime runtime = Runtime.getRuntime();
			int i = (int) ((runtime.totalMemory()
					+ -runtime.freeMemory())
				       / 1024L);
			Class131_Sub2_Sub15.method1540
			    (-61, "Memory before cleanup=" + i + "k");
			Class23_Sub4.method326(125);
			Class175.method2478((byte) -74);
			for (int i_11_ = 0; i_11_ < 10; i_11_++)
			    System.gc();
			i = (int) ((runtime.totalMemory()
				    - runtime.freeMemory())
				   / 1024L);
			Class131_Sub2_Sub15.method1540(-60,
						       ("Memory after cleanup="
							+ i + "k"));
		    }
		    if (arg2.equalsIgnoreCase("pcachesize"))
			Class131_Sub2_Sub15.method1540
			    (-77, ("Number of player models in cache:"
				   + Class131.method1351(-32251)));
		    if (arg2.equalsIgnoreCase("clientdrop"))
			Class138.method2121(true);
		    if (arg2.equalsIgnoreCase("clientjs5drop"))
			Class46.aClass179_640.method2512((byte) -120);
		    if (arg2.equalsIgnoreCase("serverjs5drop"))
			Class46.aClass179_640.method2511(-32);
		    if (arg2.equalsIgnoreCase("breakcon")) {
			Class23_Sub4.aSignLink_3734.method2697(10);
			Class128_Sub1.aClass33_4013.method455(123);
			Class46.aClass179_640.method2503(-65);
		    }
		    if (arg2.equalsIgnoreCase("rebuild")) {
			Class88.method827(1);
			Class131_Sub2_Sub1.method1475((byte) 50);
		    }
		    if (arg2.equalsIgnoreCase("wm1"))
			Class148.method2177(1, -1, -1, false, true);
		    if (arg2.equalsIgnoreCase("wm2"))
			Class148.method2177(2, -1, -1, false, true);
		    if (arg2.equalsIgnoreCase("::wm3"))
			Class148.method2177(3, 1024, 768, false, true);
		    if (arg2.equalsIgnoreCase("tk0")) {
			Class131_Sub2_Sub38.method1644(0, -56);
			Class131_Sub2_Sub10_Sub1.anInt6537 = 0;
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
		    }
		    if (arg2.equalsIgnoreCase("tk1")) {
			Class131_Sub2_Sub38.method1644(1, 116);
			Class131_Sub2_Sub10_Sub1.anInt6537 = 1;
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
		    }
		    if (arg2.equalsIgnoreCase("tk2")) {
			Class131_Sub2_Sub38.method1644(2, -116);
			Class131_Sub2_Sub10_Sub1.anInt6537 = 2;
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
		    }
		    if (arg2.equalsIgnoreCase("tk3"))
			Class131_Sub2_Sub38.method1644(3, -82);
		    if (arg2.equalsIgnoreCase("ot")) {
			Class103.aBoolean1349 = !Class103.aBoolean1349;
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
			Class88.method827(1);
		    }
		    if (arg2.equalsIgnoreCase("gb")) {
			Class131_Sub13.aBoolean4268
			    = !Class131_Sub13.aBoolean4268;
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
			Class88.method827(1);
		    }
		    if (arg2.startsWith("shadows ")) {
			Class131_Sub2_Sub16.anInt5779
			    = Class161.method2393(arg2.substring(8),
						  (byte) 20);
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
			Class88.method827(1);
		    }
		    if (arg2.startsWith("setba")) {
			Class141.anInt1876
			    = Class161.method2393(arg2.substring(6),
						  (byte) 20);
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
		    }
		    if (arg2.startsWith("setparticles")) {
			Class131_Sub41_Sub19.method2060
			    (Class161.method2393(arg2.substring(13),
						 (byte) 20),
			     0);
			Class165.method2413(Class23_Sub4.aSignLink_3734,
					    (byte) -7);
			Class131_Sub38.aBoolean4627 = false;
		    }
		    if (arg2.startsWith("fps ")
			&& (Class1_Sub7.anInt3581 ^ 0xffffffff) != -1)
			Class40.method509
			    (Class161.method2393(arg2.substring(4), (byte) 20),
			     (byte) 125);
		    if (arg2.startsWith("rect_debug")) {
			Class131_Sub2_Sub12.anInt5728
			    = Class161.method2393(arg2.substring(10).trim(),
						  (byte) 20);
			Class131_Sub2_Sub15.method1540(-59,
						       ("rect_debug="
							+ (Class131_Sub2_Sub12
							   .anInt5728)));
		    }
		    if (arg2.equalsIgnoreCase("qa_op_test"))
			Class23_Sub5.aBoolean3761 = true;
		    if (arg2.equalsIgnoreCase("clipcomponents")) {
			Class45.aBoolean626 = !Class45.aBoolean626;
			Class131_Sub2_Sub15.method1540(-41,
						       ("clipcomponents="
							+ (Class45
							   .aBoolean626)));
		    }
		    if (arg2.startsWith("bloom")) {
			boolean bool
			    = Class183_Sub1.aClass130_4960.method1175();
			if (Class46.method565(!bool, 47)) {
			    if (bool)
				Class131_Sub2_Sub15
				    .method1540(-58, "Bloom disabled");
			    else
				Class131_Sub2_Sub15
				    .method1540(-127, "Bloom enabled");
			} else
			    Class131_Sub2_Sub15
				.method1540(-49, "Failed to enable bloom");
		    }
		    if (arg2.equalsIgnoreCase("tween")) {
			if (!Class119.aBoolean1559) {
			    Class119.aBoolean1559 = true;
			    Class131_Sub2_Sub15
				.method1540(-100, "Forced tweening ENABLED!");
			} else {
			    Class119.aBoolean1559 = false;
			    Class131_Sub2_Sub15
				.method1540(-114, "Forced tweening disabled.");
			}
		    }
		    if (arg2.equalsIgnoreCase("shiftclick")) {
			if (Class209.aBoolean3044) {
			    Class131_Sub2_Sub15
				.method1540(-77, "Shift-click disabled.");
			    Class209.aBoolean3044 = false;
			} else {
			    Class131_Sub2_Sub15
				.method1540(-73, "Shift-click ENABLED!");
			    Class209.aBoolean3044 = true;
			}
		    }
		    if (arg2.equalsIgnoreCase("getcgcoord"))
			Class131_Sub2_Sub15.method1540
			    (-50, ("x:"
				   + ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .anInt3733)
				      >> 763146727)
				   + " z:"
				   + ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .anInt3747)
				      >> -1313061689)));
		    if (arg2.equalsIgnoreCase("getheight"))
			Class131_Sub2_Sub15.method1540
			    (-75, ("Height: "
				   + (Class75.aClass68Array1023
					  [Class29.anInt300].method712
				      ((Class166.aClass23_Sub4_Sub1_Sub2_2216
					.anInt3733) >> -689676921,
				       (Class166.aClass23_Sub4_Sub1_Sub2_2216
					.anInt3747) >> 384878823))));
		    if (arg2.equalsIgnoreCase("resetminimap")) {
			Class128.aClass158_1746.method2373(true);
			Class128.aClass158_1746.method2356(false);
			Class131_Sub41_Sub11.method2002(-60);
			Class131_Sub2_Sub1.method1475((byte) 50);
		    }
		    if (arg2.startsWith("mc")) {
			if (Class183_Sub1.aClass130_4960.method1159()) {
			    int i = Integer.parseInt(arg2.substring(3));
			    if (i < 1)
				i = 1;
			    else if (i > 4)
				i = 4;
			    Class131_Sub31.anInt4537 = i;
			    Class183_Sub1.aClass130_4960
				.method1189(Class131_Sub31.anInt4537);
			    Class183_Sub1.aClass130_4960.method1183(0);
			    Class131_Sub2_Sub15.method1540
				(-75, ("Render cores now: "
				       + Class131_Sub31.anInt4537));
			} else
			    Class131_Sub2_Sub15.method1540
				(-98,
				 "Current toolkit doesn't support multiple cores");
		    }
		    if (arg2.startsWith("cachespace")) {
			Class131_Sub2_Sub15.method1540
			    (-77, ("I(s): "
				   + Class23_Sub4_Sub1_Sub1.aClass214_6477
					 .method2781(-1)
				   + "/"
				   + Class23_Sub4_Sub1_Sub1.aClass214_6477
					 .method2785(112)));
			Class131_Sub2_Sub15.method1540
			    (-67,
			     ("I(m): " + Class2.aClass214_83.method2781(-1)
			      + "/" + Class2.aClass214_83.method2785(124)));
			Class131_Sub2_Sub15.method1540
			    (-82, ("O(s): "
				   + Class23_Sub3_Sub1.aClass103_5226
					 .method900(14361)
				   + "/"
				   + Class23_Sub3_Sub1.aClass103_5226
					 .method897(6798)));
		    }
		    if (arg2.equalsIgnoreCase("getcamerapos")) {
			Class131_Sub2_Sub15.method1540
			    (-52, ("Pos: " + Class29.anInt300 + ","
				   + (((Class2.anInt84 >> 454691079)
				       - -Class92.regionX)
				      >> -1845562010)
				   + ","
				   + (Class64.regionY + (Class57.anInt753
							  >> 1251246279)
				      >> -43914778)
				   + ","
				   + (0x3f & ((Class2.anInt84 >> 341383111)
					      + Class92.regionX))
				   + ","
				   + (((Class57.anInt753 >> 1259785799)
				       - -Class64.regionY)
				      & 0x3f)
				   + " Height: "
				   + ((RuntimeException_Sub1.method2833
				       (Class57.anInt753, -115, Class2.anInt84,
					Class29.anInt300))
				      - Class87.anInt1140)));
			Class131_Sub2_Sub15.method1540
			    (-69,
			     ("Look: " + Class29.anInt300 + ","
			      + (Class92.regionX + Class23.anInt250
				 >> 560585222)
			      + ","
			      + (Class131_Sub41.anInt4675 + Class64.regionY
				 >> -878168218)
			      + ","
			      + (Class92.regionX + Class23.anInt250 & 0x3f)
			      + ","
			      + (Class131_Sub41.anInt4675 + Class64.regionY
				 & 0x3f)
			      + " Height: "
			      + ((RuntimeException_Sub1.method2833
				  (Class131_Sub41.anInt4675, 120,
				   Class23.anInt250, Class29.anInt300))
				 + -Class131_Sub41_Sub18.anInt6400)));
		    }
		    if (arg2.equals("showocc")) {
			Class93.aBoolean1223 = !Class93.aBoolean1223;
			Class88.method827(1);
		    }
		    if (arg2.equals("renderprofile") || arg2.equals("rp")) {
			Class21.aBoolean240 = !Class21.aBoolean240;
			Class183_Sub1.aClass130_4960
			    .method1185(Class21.aBoolean240);
			Class131_Sub1_Sub1.method1392(true);
		    }
		    if (arg2.equals("nonpcs"))
			Canvas_Sub1.aBoolean42 = !Canvas_Sub1.aBoolean42;
		    if (arg2.equals("autoworld"))
			Class23_Sub4_Sub5.method391(-23144);
		    if (arg2.equals("heap"))
			Class131_Sub2_Sub15.method1540(-98, ("Heap: "+ Class1_Sub4.anInt3554 + "MB"));
		    if (arg2.equals("savevarcs"))
			Class131_Sub38.method1891(6);
		    if (arg2.equals("scramblevarcs")) {
			for (int i = 0;
			     ((i ^ 0xffffffff)
			      > (Class131_Sub2_Sub33.anIntArray6025.length
				 ^ 0xffffffff));
			     i++) {
			    if (Class43.aBooleanArray586[i]) {
				Class131_Sub2_Sub33.anIntArray6025[i]
				    = (int) (99999.0 * Math.random());
				if (Math.random() > 0.5)
				    Class131_Sub2_Sub33.anIntArray6025[i]
					*= -1;
			    }
			}
			Class131_Sub38.method1891(6);
		    }
		    if (arg2.equals("showcolmap")) {
			Class120.aBoolean1579 = true;
			Class131_Sub2_Sub1.method1475((byte) 50);
		    }
		    if (arg2.equals("hidecolmap")) {
			Class120.aBoolean1579 = false;
			Class131_Sub2_Sub1.method1475((byte) 50);
		    }
		    if (arg2.equals("resetcache"))
			Class131_Sub2_Sub10_Sub1.method1517(8110);
		    if (arg2.equals("profilecpu"))
			Class131_Sub2_Sub15.method1540
			    (-121, (String.valueOf(Class204.method2733(-65536))
				    + "ms"));
		    if ((Class133.anInt1803 ^ 0xffffffff) != -31)
			break;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(171);
		    Class131_Sub41_Sub21_Sub1.anInt6577++;
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(2 + arg2.length());
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(arg1 ? 1 : 0);
		    Class93.aClass131_Sub15_Sub2_1226.writeString(arg2, (byte) 46);
		} catch (Exception exception) {
		    Class131_Sub2_Sub15.method1540(-108, "Incorrect command prefix; Try again.");
		    break;
		}
		break;
	    }
	} while (false);
    }
    
    public static void method1618(byte arg0) {
	try {
	    if ((SignLink.aString2904.toLowerCase().indexOf("microsoft")
		 ^ 0xffffffff)
		!= 0) {
		Class131_Sub2_Sub27.anIntArray5953[189] = 26;
		Class131_Sub2_Sub27.anIntArray5953[219] = 42;
		Class131_Sub2_Sub27.anIntArray5953[220] = 74;
		Class131_Sub2_Sub27.anIntArray5953[190] = 72;
		Class131_Sub2_Sub27.anIntArray5953[223] = 28;
		Class131_Sub2_Sub27.anIntArray5953[221] = 43;
		Class131_Sub2_Sub27.anIntArray5953[222] = 59;
		Class131_Sub2_Sub27.anIntArray5953[187] = 27;
		Class131_Sub2_Sub27.anIntArray5953[186] = 57;
		Class131_Sub2_Sub27.anIntArray5953[191] = 73;
		Class131_Sub2_Sub27.anIntArray5953[188] = 71;
		Class131_Sub2_Sub27.anIntArray5953[192] = 58;
	    } else {
		Class131_Sub2_Sub27.anIntArray5953[47] = 73;
		Class131_Sub2_Sub27.anIntArray5953[44] = 71;
		Class131_Sub2_Sub27.anIntArray5953[46] = 72;
		if (SignLink.aMethod2906 != null) {
		    Class131_Sub2_Sub27.anIntArray5953[520] = 59;
		    Class131_Sub2_Sub27.anIntArray5953[192] = 28;
		    Class131_Sub2_Sub27.anIntArray5953[222] = 58;
		} else {
		    Class131_Sub2_Sub27.anIntArray5953[222] = 59;
		    Class131_Sub2_Sub27.anIntArray5953[192] = 58;
		}
		Class131_Sub2_Sub27.anIntArray5953[61] = 27;
		Class131_Sub2_Sub27.anIntArray5953[92] = 74;
		Class131_Sub2_Sub27.anIntArray5953[91] = 42;
		Class131_Sub2_Sub27.anIntArray5953[59] = 57;
		Class131_Sub2_Sub27.anIntArray5953[93] = 43;
		Class131_Sub2_Sub27.anIntArray5953[45] = 26;
	    }
	    if (arg0 < -64)
		anInt5983++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qn.F(" + arg0 + ')');
	}
    }
    
    public static void method1619(byte arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    Class131_Sub3.method1650(arg2, Class56.anIntArrayArray740[arg3++],
				     arg4, arg1, 102);
	    anInt5989++;
	    Class131_Sub3.method1650(arg2, Class56.anIntArrayArray740[arg5--],
				     arg4, arg1, 90);
	    for (int i = arg3; arg5 >= i; i++) {
		int[] is = Class56.anIntArrayArray740[i];
		is[arg1] = is[arg2] = arg4;
	    }
	    int i = 9 / ((51 - arg0) / 60);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qn.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method1620(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
