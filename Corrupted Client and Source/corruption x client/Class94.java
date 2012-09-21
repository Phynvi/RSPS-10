/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class94
{
    public int anInt1230;
    public int anInt1231;
    public int anInt1232;
    public int anInt1233;
    public int anInt1234;
    public String aString1235;
    public int anInt1236 = -2147483648;
    public static int anInt1237;
    public static int anInt1238;
    public boolean aBoolean1239;
    public int anInt1240;
    public static int anInt1241;
    public String aString1242;
    public boolean aBoolean1243 = false;
    public boolean aBoolean1244;
    public String[] aStringArray1245;
    public static String aString1246 = "flash3:";
    public int anInt1247;
    public int anInt1248;
    public int anInt1249;
    public boolean aBoolean1250;
    public static int anInt1251;
    public int anInt1252;
    public int anInt1253;
    public int anInt1254;
    public static int anInt1255;
    public int anInt1256;
    public int anInt1257;
    public int anInt1258;
    public int anInt1259;
    public static int anInt1260;
    public static int anInt1261;
    public int anInt1262;
    public int anInt1263;
    public int anInt1264;
    public int anInt1265;
    public int anInt1266;
    public int anInt1267;
    public int anInt1268;
    public int[] anIntArray1269;
    public static int anInt1270;
    
    public Class152 method855(int arg0, boolean arg1, Class130 arg2) {
	try {
	    anInt1255++;
	    int i = !arg1 ? anInt1266 : anInt1253;
	    int i_0_ = i | arg2.anInt1781 << -2105317123;
	    Class152 class152
		= ((Class152)
		   Class131_Sub2.aClass214_4098.method2780(122, (long) i_0_));
	    if (arg0 != -4379)
		return null;
	    if (class152 != null)
		return class152;
	    if (!Class214.aClass158_3131.method2343(arg0 + 4269, i))
		return null;
	    Class124 class124
		= Class124.method1087(Class214.aClass158_3131, i, 0);
	    if (class124 != null) {
		class152 = arg2.method1178(class124, true);
		Class131_Sub2.aClass214_4098.method2773(true, class152,
							(long) i_0_);
	    }
	    return class152;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kb.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method856(byte arg0) {
	if (anIntArray1269 != null) {
	    for (int i = 0; anIntArray1269.length > i; i += 2) {
		if (anIntArray1269[i] >= anInt1267) {
		    if (anInt1236 < anIntArray1269[i])
			anInt1236 = anIntArray1269[i];
		} else
		    anInt1267 = anIntArray1269[i];
		if (anIntArray1269[i - -1] >= anInt1252) {
		    if (anInt1259 < anIntArray1269[i - -1])
			anInt1259 = anIntArray1269[1 + i];
		} else
		    anInt1252 = anIntArray1269[i + 1];
	    }
	}
	anInt1251++;
	if (arg0 != -48)
	    anInt1262 = 85;
    }
    
    public static boolean method857(byte[] arg0, int arg1) {
	try {
	    anInt1260++;
	    Stream stream = new Stream(arg0);
	    if (arg1 != 0)
		aString1246 = null;
	    int i = stream.readUnsignedByte(-92);
	    if ((i ^ 0xffffffff) != -2)
		return false;
	    boolean bool = stream.readUnsignedByte(arg1 ^ 0x4c) == 1;
	    if (bool)
		Class76.method770(stream, 0);
	    Class83.method799((byte) -67, stream);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kb.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method858(byte arg0, Stream arg1, int arg2) {
	try {
	    anInt1238++;
	    if (arg0 <= 29)
		method861(-124);
	    if (arg2 != 1) {
		if (arg2 == 2)
		    anInt1253 = arg1.readUnsignedShort(8104);
		else if ((arg2 ^ 0xffffffff) == -4)
		    aString1235 = arg1.readString(false);
		else if (arg2 != 4) {
		    if (arg2 != 5) {
			if (arg2 != 6) {
			    if (arg2 == 7) {
				int i = arg1.readUnsignedByte(-52);
				if ((i & 0x2 ^ 0xffffffff) == -3)
				    aBoolean1243 = true;
				if ((0x1 & i) == 0)
				    aBoolean1244 = false;
			    } else if (arg2 != 8) {
				if (arg2 == 9) {
				    anInt1240 = arg1.readUnsignedShort(8104);
				    if ((anInt1240 ^ 0xffffffff) == -65536)
					anInt1240 = -1;
				    anInt1231 = arg1.readUnsignedShort(8104);
				    if ((anInt1231 ^ 0xffffffff) == -65536)
					anInt1231 = -1;
				    anInt1249 = arg1.readUnsignedInt(-2);
				    anInt1264 = arg1.readUnsignedInt(-2);
				} else if (arg2 >= 10
					   && (arg2 ^ 0xffffffff) >= -15)
				    aStringArray1245[arg2 - 10]
					= arg1.readString(false);
				else if (arg2 == 15) {
				    int i = arg1.readUnsignedByte(-22);
				    anIntArray1269 = new int[i * 2];
				    for (int i_1_ = 0;
					 ((i * 2 ^ 0xffffffff)
					  < (i_1_ ^ 0xffffffff));
					 i_1_++)
					anIntArray1269[i_1_]
					    = arg1.readSignedShort(1625554944);
				    anInt1263 = arg1.readUnsignedInt(-2);
				    anInt1247 = arg1.readUnsignedInt(-2);
				} else if (arg2 != 16) {
				    if (arg2 != 17) {
					if ((arg2 ^ 0xffffffff) == -19)
					    anInt1258 = arg1.readUnsignedShort(8104);
					else if (arg2 == 19)
					    anInt1262 = arg1.readUnsignedShort(8104);
					else if ((arg2 ^ 0xffffffff) == -21) {
					    anInt1230 = arg1.readUnsignedShort(8104);
					    if (anInt1230 == 65535)
						anInt1230 = -1;
					    anInt1248 = arg1.readUnsignedShort(8104);
					    if ((anInt1248 ^ 0xffffffff)
						== -65536)
						anInt1248 = -1;
					    anInt1234 = arg1.readUnsignedInt(-2);
					    anInt1265 = arg1.readUnsignedInt(-2);
					} else if (arg2 != 21) {
					    if ((arg2 ^ 0xffffffff) == -23)
						anInt1254
						    = arg1.readUnsignedInt(-2);
					} else
					    anInt1257 = arg1.readUnsignedInt(-2);
				    } else
					aString1242 = arg1.readString(false);
				} else
				    aBoolean1239 = false;
			    } else
				aBoolean1250 = (arg1.readUnsignedByte(-98)
						^ 0xffffffff) == -2;
			} else
			    anInt1256 = arg1.readUnsignedByte(-64);
		    } else
			anInt1268 = arg1.read3Bytes(false);
		} else
		    anInt1232 = arg1.read3Bytes(false);
	    } else
		anInt1266 = arg1.readUnsignedShort(8104);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kb.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method859(Stream arg0, int arg1) {
	anInt1241++;
	for (;;) {
	    int i = arg0.readUnsignedByte(-122);
	    if (i == 0)
		break;
	    method858((byte) 87, arg0, i);
	}
	if (arg1 > -86)
	    method860(23, null, null);
    }
    
    public static void method860(int arg0, short[] arg1, String[] arg2) {
	try {
	    anInt1261++;
	    Class22_Sub1.method272(0, 91, arg0 + arg2.length, arg1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kb.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method861(int arg0) {
	try {
	    anInt1237++;
	    if (anInt1231 == arg0 && (anInt1240 ^ 0xffffffff) == 0)
		return true;
	    boolean bool = false;
	    int i;
	    if (anInt1231 != -1)
		i = Class131_Sub2_Sub13.anIntArray5735[anInt1231];
	    else
		i = Class63.method667(anInt1240, arg0);
	    if (anInt1249 > i || i > anInt1264)
		return false;
	    if ((anInt1248 ^ 0xffffffff) != 0
		|| (anInt1230 ^ 0xffffffff) != 0) {
		bool = false;
		if (anInt1248 == -1)
		    i = Class63.method667(anInt1230, -1);
		else
		    i = Class131_Sub2_Sub13.anIntArray5735[anInt1248];
		if (i < anInt1234
		    || (i ^ 0xffffffff) < (anInt1265 ^ 0xffffffff))
		    return false;
		return true;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kb.H(" + arg0 + ')');
	}
    }
    
    public Class152 method862(Class130 arg0, int arg1) {
	try {
	    anInt1270++;
	    Class152 class152
		= ((Class152)
		   (Class131_Sub2.aClass214_4098.method2780
		    (arg1 + 127, (long) (0x20000 | anInt1258
					 | arg0.anInt1781 << 508290877))));
	    if (arg1 != -1)
		anInt1257 = 6;
	    if (class152 != null)
		return class152;
	    Class214.aClass158_3131.method2343(-119, anInt1258);
	    Class124 class124
		= Class124.method1087(Class214.aClass158_3131, anInt1258, 0);
	    if (class124 != null) {
		class152 = arg0.method1178(class124, true);
		Class131_Sub2.aClass214_4098.method2773
		    (true, class152, (long) (arg0.anInt1781 << 1946935645
					     | (anInt1258 | 0x20000)));
	    }
	    return class152;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kb.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method863(int arg0) {
	try {
	    if (arg0 != 0)
		aString1246 = null;
	    aString1246 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kb.F(" + arg0 + ')');
	}
    }
    
    public Class94() {
	anInt1231 = -1;
	aBoolean1239 = true;
	anInt1248 = -1;
	anInt1240 = -1;
	anInt1256 = 0;
	aBoolean1244 = true;
	anInt1259 = -2147483648;
	aBoolean1250 = true;
	anInt1253 = -1;
	anInt1252 = 2147483647;
	anInt1262 = -1;
	anInt1230 = -1;
	aStringArray1245 = new String[5];
	anInt1268 = -1;
	anInt1258 = -1;
	anInt1266 = -1;
	anInt1267 = 2147483647;
    }
}
