/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161
{
    public static int anInt2135;
    public int anInt2136;
    public int anInt2137;
    public static int anInt2138;
    public int[] anIntArray2139;
    public int anInt2140;
    public boolean aBoolean2141 = false;
    public int anInt2142;
    public int anInt2143;
    public int anInt2144 = -1;
    public int[][] anIntArrayArray2145;
    public static int anInt2146;
    public static int anInt2147;
    public static int anInt2148;
    public boolean[] aBooleanArray2149;
    public static int[] anIntArray2150 = { 16, 32, 64, 128 };
    public int[] anIntArray2151;
    public boolean aBoolean2152;
    public int[] anIntArray2153;
    public static int anInt2154;
    public int anInt2155;
    public static int anInt2156;
    public static int anInt2157;
    public boolean aBoolean2158;
    public boolean aBoolean2159;
    public static int anInt2160;
    public static int anInt2161;
    public int anInt2162;
    public int anInt2163;
    
    public static void method2385(boolean arg0) {
	anIntArray2150 = null;
	if (arg0 != false)
	    anIntArray2150 = null;
    }
    
    public static void method2386() {
	for (int i = 0; i < Class90.anInt1174; i++) {
	    Class23_Sub4 class23_sub4 = Class180.aClass23_Sub4Array2579[i];
	    Class190.method2610(class23_sub4);
	    Class180.aClass23_Sub4Array2579[i] = null;
	}
	Class90.anInt1174 = 0;
    }
    
    public static void method2387(int arg0, int arg1) {
	try {
	    if (arg0 <= -109) {
		Class199.anInt2912 = arg1;
		anInt2161++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class154 method2388(int arg0, int arg1, int arg2, byte arg3,
			       Class154 arg4, int arg5) {
	try {
	    anInt2135++;
	    int i = anIntArray2153[arg5];
	    int i_0_ = -45 % ((arg3 - 1) / 48);
	    int i_1_ = anIntArray2139[arg5];
	    Class131_Sub41_Sub10 class131_sub41_sub10
		= Class34.method462((byte) -119, i_1_ >> 740155600);
	    i_1_ &= 0xffff;
	    if (class131_sub41_sub10 == null)
		return arg4.method2287((byte) 1, arg2, true);
	    Class131_Sub41_Sub10 class131_sub41_sub10_2_ = null;
	    if ((aBoolean2159 || Class119.aBoolean1559) && arg0 != -1
		&& arg0 < anIntArray2139.length) {
		arg0 = anIntArray2139[arg0];
		class131_sub41_sub10_2_
		    = Class34.method462((byte) -119, arg0 >> -25297136);
		arg0 &= 0xffff;
	    }
	    Class131_Sub41_Sub10 class131_sub41_sub10_3_ = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_4_ = null;
	    int i_5_ = 0;
	    int i_6_ = 0;
	    if (anIntArray2151 != null) {
		if (arg5 < anIntArray2151.length) {
		    i_5_ = anIntArray2151[arg5];
		    if ((i_5_ ^ 0xffffffff) != -65536) {
			class131_sub41_sub10_3_
			    = Class34.method462((byte) -119,
						i_5_ >> -872524176);
			i_5_ &= 0xffff;
		    }
		}
		if ((aBoolean2159 || Class119.aBoolean1559) && arg0 != -1
		    && (anIntArray2151.length ^ 0xffffffff) < (arg0
							       ^ 0xffffffff)) {
		    i_6_ = anIntArray2151[arg0];
		    if (i_6_ != 65535) {
			class131_sub41_sub10_4_
			    = Class34.method462((byte) -119,
						i_6_ >> -1794344528);
			i_6_ &= 0xffff;
		    }
		}
	    }
	    if (aBoolean2141)
		arg2 |= 0x200;
	    if (class131_sub41_sub10.method1992(65280, i_1_))
		arg2 |= 0x80;
	    if (class131_sub41_sub10.method1995((byte) 0, i_1_))
		arg2 |= 0x100;
	    if (class131_sub41_sub10_3_ != null) {
		if (class131_sub41_sub10_3_.method1992(65280, i_5_))
		    arg2 |= 0x80;
		if (class131_sub41_sub10_3_.method1995((byte) 0, i_5_))
		    arg2 |= 0x100;
	    }
	    if (class131_sub41_sub10_2_ != null) {
		if (class131_sub41_sub10_2_.method1992(65280, arg0))
		    arg2 |= 0x80;
		if (class131_sub41_sub10_2_.method1995((byte) 0, arg0))
		    arg2 |= 0x100;
	    }
	    if (class131_sub41_sub10_4_ != null) {
		if (class131_sub41_sub10_4_.method1992(65280, i_6_))
		    arg2 |= 0x80;
		if (class131_sub41_sub10_4_.method1995((byte) 0, i_6_))
		    arg2 |= 0x100;
	    }
	    arg2 |= 0x20;
	    Class154 class154 = arg4.method2287((byte) 1, arg2, true);
	    class154.method2270(arg0, 0, i, 0, -1 + arg1,
				class131_sub41_sub10_2_, aBoolean2141,
				class131_sub41_sub10, i_1_);
	    if (class131_sub41_sub10_3_ != null)
		class154.method2270(i_6_, 0, i, 0, arg1 + -1,
				    class131_sub41_sub10_4_, aBoolean2141,
				    class131_sub41_sub10_3_, i_5_);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ')'));
	}
    }
    
    public int method2389(int arg0, boolean arg1, int arg2, int arg3) {
	try {
	    anInt2148++;
	    int i = 0;
	    int i_7_ = 0;
	    int i_8_ = anIntArray2139[arg3];
	    Class131_Sub41_Sub10 class131_sub41_sub10 = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_9_
		= Class34.method462((byte) -119, i_8_ >> 151450192);
	    if (arg0 != 1)
		return -96;
	    i_8_ &= 0xffff;
	    if (class131_sub41_sub10_9_ == null)
		return i;
	    if ((aBoolean2159 || Class119.aBoolean1559) && arg2 != -1
		&& (anIntArray2139.length ^ 0xffffffff) < (arg2
							   ^ 0xffffffff)) {
		i_7_ = anIntArray2139[arg2];
		class131_sub41_sub10
		    = Class34.method462((byte) -119, i_7_ >> -1797896336);
		i_7_ &= 0xffff;
	    }
	    if (aBoolean2141)
		i |= 0x200;
	    if (class131_sub41_sub10_9_.method1992(65280, i_8_))
		i |= 0x80;
	    if (class131_sub41_sub10_9_.method1995((byte) 0, i_8_))
		i |= 0x100;
	    if (class131_sub41_sub10 != null) {
		if (class131_sub41_sub10.method1992(65280, i_7_))
		    i |= 0x80;
		if (class131_sub41_sub10.method1995((byte) 0, i_7_))
		    i |= 0x100;
	    }
	    if (anIntArray2151 != null && arg1) {
		if (arg3 < anIntArray2151.length) {
		    int i_10_ = anIntArray2151[arg3];
		    if (i_10_ != 65535) {
			Class131_Sub41_Sub10 class131_sub41_sub10_11_
			    = Class34.method462((byte) -119,
						i_10_ >> 1159774128);
			i_10_ &= 0xffff;
			if (class131_sub41_sub10_11_ != null) {
			    if (class131_sub41_sub10_11_.method1992(65280,
								    i_10_))
				i |= 0x80;
			    if (class131_sub41_sub10_11_.method1995((byte) 0,
								    i_10_))
				i |= 0x100;
			}
		    }
		}
		if ((aBoolean2159 || Class119.aBoolean1559) && arg2 != -1
		    && (anIntArray2151.length ^ 0xffffffff) < (arg2
							       ^ 0xffffffff)) {
		    int i_12_ = anIntArray2151[arg2];
		    if ((i_12_ ^ 0xffffffff) != -65536) {
			Class131_Sub41_Sub10 class131_sub41_sub10_13_
			    = Class34.method462((byte) -119,
						i_12_ >> 1662962064);
			i_12_ &= 0xffff;
			if (class131_sub41_sub10_13_ != null) {
			    if (class131_sub41_sub10_13_.method1992(65280,
								    i_12_))
				i |= 0x80;
			    if (class131_sub41_sub10_13_.method1995((byte) 0,
								    i_12_))
				i |= 0x100;
			}
		    }
		}
	    }
	    return i | 0x20;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class154 method2390(int arg0, int arg1, int arg2, byte arg3,
			       int arg4, int arg5, Class154 arg6, byte arg7) {
	try {
	    anInt2138++;
	    int i = anIntArray2153[arg1];
	    arg1 = anIntArray2139[arg1];
	    Class131_Sub41_Sub10 class131_sub41_sub10
		= Class34.method462((byte) -119, arg1 >> 1900743088);
	    arg1 &= 0xffff;
	    if (class131_sub41_sub10 == null)
		return arg6.method2287((byte) 1, arg2, true);
	    if (arg7 >= -80)
		method2396(-29, 34);
	    Class131_Sub41_Sub10 class131_sub41_sub10_14_ = null;
	    if ((aBoolean2159 || Class119.aBoolean1559)
		&& (arg0 ^ 0xffffffff) != 0 && arg0 < anIntArray2139.length) {
		arg0 = anIntArray2139[arg0];
		class131_sub41_sub10_14_
		    = Class34.method462((byte) -119, arg0 >> -1861877296);
		arg0 &= 0xffff;
	    }
	    if (aBoolean2141)
		arg2 |= 0x200;
	    if (class131_sub41_sub10.method1992(65280, arg1))
		arg2 |= 0x80;
	    if (class131_sub41_sub10.method1995((byte) 0, arg1))
		arg2 |= 0x100;
	    if (class131_sub41_sub10_14_ != null) {
		if (class131_sub41_sub10_14_.method1992(65280, arg0))
		    arg2 |= 0x80;
		if (class131_sub41_sub10_14_.method1995((byte) 0, arg0))
		    arg2 |= 0x100;
	    }
	    arg2 |= 0x20;
	    Class154 class154 = arg6.method2287(arg3, arg2, true);
	    class154.method2270(arg0, arg5, i, 0, arg4 + -1,
				class131_sub41_sub10_14_, aBoolean2141,
				class131_sub41_sub10, arg1);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ','
						 + (arg6 != null ? "{...}"
						    : "null")
						 + ',' + arg7 + ')'));
	}
    }
    
    public static void method2391(int arg0, int arg1, int arg2) {
	if (!(Class127.aFloat1711 < Class127.aFloat1710)) {
	    if (Class127.aFloat1711 > Class127.aFloat1710) {
		Class127.aFloat1711 -= (double) Class127.aFloat1711 / 30.0;
		if (Class127.aFloat1710 > Class127.aFloat1711)
		    Class127.aFloat1711 = Class127.aFloat1710;
		Class131_Sub13.method1707(127);
		Class127.anInt1714 = (int) Class127.aFloat1711 >> -1025009695;
		Class127.aByteArrayArrayArray1713
		    = Class51.method596(Class127.anInt1714, -1);
	    }
	} else {
	    Class127.aFloat1711 += (double) Class127.aFloat1711 / 30.0;
	    if (Class127.aFloat1711 > Class127.aFloat1710)
		Class127.aFloat1711 = Class127.aFloat1710;
	    Class131_Sub13.method1707(124);
	    Class127.anInt1714 = (int) Class127.aFloat1711 >> -60629599;
	    Class127.aByteArrayArrayArray1713
		= Class51.method596(Class127.anInt1714, -1);
	}
	anInt2156++;
	if ((Class189.anInt2768 ^ 0xffffffff) != 0
	    && (Class146.anInt1940 ^ 0xffffffff) != 0) {
	    int i = Class189.anInt2768 + -Class131_Sub31.anInt4532;
	    if (i < 2 || i > 2)
		i /= 8;
	    int i_15_ = Class146.anInt1940 - Class197.anInt2875;
	    if (i_15_ < 2 || (i_15_ ^ 0xffffffff) < -3)
		i_15_ /= 8;
	    Class131_Sub31.anInt4532 += i;
	    if ((i ^ 0xffffffff) == -1 && (i_15_ ^ 0xffffffff) == -1) {
		Class189.anInt2768 = -1;
		Class146.anInt1940 = -1;
	    }
	    Class197.anInt2875 += i_15_;
	    Class131_Sub13.method1707(126);
	}
	if (arg1 < 61)
	    anIntArray2150 = null;
	if ((Class131_Sub7.anInt4173 ^ 0xffffffff) < -1) {
	    Class151.anInt2019--;
	    if ((Class151.anInt2019 ^ 0xffffffff) == -1) {
		Class151.anInt2019 = 100;
		Class131_Sub7.anInt4173--;
	    }
	} else {
	    Class131_Sub41_Sub17.anInt6390 = -1;
	    Class165.anInt2200 = -1;
	}
	if (Class23_Sub3.aBoolean3725 && Class74.aClass119_1011 != null) {
	    for (Class131_Sub42 class131_sub42
		     = (Class131_Sub42) Class74.aClass119_1011.method1007(0);
		 class131_sub42 != null;
		 class131_sub42
		     = (Class131_Sub42) Class74.aClass119_1011.method1014(0)) {
		Class94 class94
		    = Class131_Sub2_Sub32.method1626((class131_sub42
						      .aClass131_Sub20_4689
						      .anInt4427),
						     (byte) 1);
		if ((Class23_Sub5_Sub2.anInt5063 ^ 0xffffffff) != -1
		    || !class131_sub42.method2088(-111, arg0, arg2)) {
		    if (class131_sub42.aClass131_Sub20_4689.aBoolean4418) {
			class131_sub42.aClass131_Sub20_4689.aBoolean4418
			    = false;
			Class168.method2432(16,
					    (class131_sub42
					     .aClass131_Sub20_4689.anInt4427),
					    class94.anInt1262);
		    }
		} else {
		    if (class94.aStringArray1245 != null) {
			if (class94.aStringArray1245[4] != null)
			    Class131_Sub31.method1860
				(-1,
				 (long) (class131_sub42.aClass131_Sub20_4689
					 .anInt4427),
				 class94.aStringArray1245[4], -1,
				 class94.anInt1262, class94.aString1242, 0,
				 1004);
			if (class94.aStringArray1245[3] != null)
			    Class131_Sub31.method1860
				(-1,
				 (long) (class131_sub42.aClass131_Sub20_4689
					 .anInt4427),
				 class94.aStringArray1245[3], -1,
				 class94.anInt1262, class94.aString1242, 0,
				 1003);
			if (class94.aStringArray1245[2] != null)
			    Class131_Sub31.method1860
				(-1,
				 (long) (class131_sub42.aClass131_Sub20_4689
					 .anInt4427),
				 class94.aStringArray1245[2], -1,
				 class94.anInt1262, class94.aString1242, 0,
				 1010);
			if (class94.aStringArray1245[1] != null)
			    Class131_Sub31.method1860
				(-1,
				 (long) (class131_sub42.aClass131_Sub20_4689
					 .anInt4427),
				 class94.aStringArray1245[1], -1,
				 class94.anInt1262, class94.aString1242, 0,
				 1002);
			if (class94.aStringArray1245[0] != null)
			    Class131_Sub31.method1860
				(-1,
				 (long) (class131_sub42.aClass131_Sub20_4689
					 .anInt4427),
				 class94.aStringArray1245[0], -1,
				 class94.anInt1262, class94.aString1242, 0,
				 1007);
		    }
		    if (!class131_sub42.aClass131_Sub20_4689.aBoolean4418) {
			class131_sub42.aClass131_Sub20_4689.aBoolean4418
			    = true;
			Class168.method2432(15,
					    (class131_sub42
					     .aClass131_Sub20_4689.anInt4427),
					    class94.anInt1262);
		    }
		    if (class131_sub42.aClass131_Sub20_4689.aBoolean4418)
			Class168.method2432(17,
					    (class131_sub42
					     .aClass131_Sub20_4689.anInt4427),
					    class94.anInt1262);
		}
	    }
	}
    }
    
    public void method2392(int arg0, Stream arg1) {
	anInt2146++;
	for (;;) {
	    int i = arg1.readUnsignedByte(108);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method2395(arg1, 108, i);
	}
	if (arg0 != 256)
	    method2386();
    }
    
    public static int method2393(String arg0, byte arg1) {
	try {
	    anInt2154++;
	    if (arg1 != 20)
		return 21;
	    return Class201.method2719(arg0, -8470, true, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.I("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method2394(int arg0) {
	if (anInt2140 == -1) {
	    if (aBooleanArray2149 == null)
		anInt2140 = 0;
	    else
		anInt2140 = 2;
	}
	if (anInt2162 == -1) {
	    if (aBooleanArray2149 == null)
		anInt2162 = 0;
	    else
		anInt2162 = 2;
	}
	anInt2157++;
	if (arg0 < 76)
	    aBoolean2158 = true;
    }
    
    public void method2395(Stream arg0, int arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -2) {
	    int i = arg0.readUnsignedShort(8104);
	    anIntArray2153 = new int[i];
	    for (int i_16_ = 0; (i ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
		 i_16_++)
		anIntArray2153[i_16_] = arg0.readUnsignedShort(8104);
	    anIntArray2139 = new int[i];
	    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_17_++)
		anIntArray2139[i_17_] = arg0.readUnsignedShort(8104);
	    for (int i_18_ = 0; i_18_ < i; i_18_++)
		anIntArray2139[i_18_] = ((arg0.readUnsignedShort(8104) << -2066233840)
					 + anIntArray2139[i_18_]);
	} else if ((arg2 ^ 0xffffffff) != -3) {
	    if ((arg2 ^ 0xffffffff) != -4) {
		if ((arg2 ^ 0xffffffff) == -5)
		    aBoolean2152 = true;
		else if (arg2 == 5)
		    anInt2142 = arg0.readUnsignedByte(-100);
		else if (arg2 != 6) {
		    if ((arg2 ^ 0xffffffff) == -8)
			anInt2143 = arg0.readUnsignedShort(8104);
		    else if ((arg2 ^ 0xffffffff) != -9) {
			if (arg2 != 9) {
			    if ((arg2 ^ 0xffffffff) != -11) {
				if ((arg2 ^ 0xffffffff) == -12)
				    anInt2155 = arg0.readUnsignedByte(84);
				else if (arg2 == 12) {
				    int i = arg0.readUnsignedByte(-94);
				    anIntArray2151 = new int[i];
				    for (int i_19_ = 0;
					 ((i_19_ ^ 0xffffffff)
					  > (i ^ 0xffffffff));
					 i_19_++)
					anIntArray2151[i_19_]
					    = arg0.readUnsignedShort(8104);
				    for (int i_20_ = 0; i > i_20_; i_20_++)
					anIntArray2151[i_20_]
					    = ((arg0.readUnsignedShort(8104)
						<< 181645584)
					       + anIntArray2151[i_20_]);
				} else if ((arg2 ^ 0xffffffff) != -14) {
				    if (arg2 != 14) {
					if (arg2 != 15) {
					    if (arg2 == 16)
						aBoolean2158 = true;
					} else
					    aBoolean2159 = true;
				    } else
					aBoolean2141 = true;
				} else {
				    int i = arg0.readUnsignedShort(8104);
				    anIntArrayArray2145 = new int[i][];
				    for (int i_21_ = 0; i_21_ < i; i_21_++) {
					int i_22_ = arg0.readUnsignedByte(-116);
					if ((i_22_ ^ 0xffffffff) < -1) {
					    anIntArrayArray2145[i_21_]
						= new int[i_22_];
					    anIntArrayArray2145[i_21_][0]
						= arg0.read3Bytes(false);
					    for (int i_23_ = 1;
						 ((i_22_ ^ 0xffffffff)
						  < (i_23_ ^ 0xffffffff));
						 i_23_++)
						anIntArrayArray2145[i_21_]
						    [i_23_]
						    = arg0.readUnsignedShort(8104);
					}
				    }
				}
			    } else
				anInt2162 = arg0.readUnsignedByte(65);
			} else
			    anInt2140 = arg0.readUnsignedByte(93);
		    } else
			anInt2136 = arg0.readUnsignedByte(73);
		} else
		    anInt2144 = arg0.readUnsignedShort(8104);
	    } else {
		aBooleanArray2149 = new boolean[256];
		int i = arg0.readUnsignedByte(104);
		for (int i_24_ = 0; (i ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
		     i_24_++)
		    aBooleanArray2149[arg0.readUnsignedByte(-77)] = true;
	    }
	} else
	    anInt2163 = arg0.readUnsignedShort(8104);
	anInt2147++;
	if (arg1 < 99)
	    method2394(48);
    }
    
    public Class161() {
	anInt2136 = 99;
	anInt2143 = -1;
	anInt2140 = -1;
	aBoolean2152 = false;
	anInt2142 = 5;
	aBoolean2159 = false;
	anInt2163 = -1;
	anInt2155 = 2;
	aBoolean2158 = false;
	anInt2162 = -1;
    }
    
    public static Class131_Sub41_Sub14 method2396(int arg0, int arg1) {
	try {
	    anInt2160++;
	    Class131_Sub41_Sub14 class131_sub41_sub14
		= ((Class131_Sub41_Sub14)
		   Class131_Sub2_Sub21.aClass137_5853.method2111(arg0 ^ ~0x10b,
								 (long) arg1));
	    if (class131_sub41_sub14 != null)
		return class131_sub41_sub14;
	    byte[] is = (Class112.aClass158_1437.method2364
			 (Class131_Sub18.method1803((byte) 41, arg1),
			  Class131_Sub8.method1674(arg1, 0), 0));
	    class131_sub41_sub14 = new Class131_Sub41_Sub14();
	    if (arg0 != 256)
		return null;
	    if (is != null)
		class131_sub41_sub14.method2030(new Stream(is),
						-11607);
	    Class131_Sub2_Sub21.aClass137_5853.method2110(class131_sub41_sub14,
							  false, (long) arg1);
	    return class131_sub41_sub14;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qr.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
