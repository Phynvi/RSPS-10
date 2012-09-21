/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class202
{
    public static int anInt2943;
    public static int anInt2944;
    public static int anInt2945;
    public static int anInt2946;
    public static int anInt2947;
    public static int anInt2948;
    public static int anInt2949 = 12;
    public static int anInt2950;
    public static int anInt2951;
    
    public static void method2721(byte arg0) {
	anInt2948++;
	Class203.anInt2967 = 0;
	int i = (Class92.regionX
		 + (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
		    >> -1878087769));
	int i_0_ = (Class64.regionY
		    + (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
		       >> 1530417223));
	if (i >= 3053 && (i ^ 0xffffffff) >= -3157
	    && (i_0_ ^ 0xffffffff) <= -3057 && i_0_ <= 3136)
	    Class203.anInt2967 = 1;
	if (arg0 >= 69) {
	    if (i >= 3072 && (i ^ 0xffffffff) >= -3119
		&& (i_0_ ^ 0xffffffff) <= -9493 && i_0_ <= 9535)
		Class203.anInt2967 = 1;
	    if ((Class203.anInt2967 ^ 0xffffffff) == -2 && i >= 3139
		&& (i ^ 0xffffffff) >= -3200 && (i_0_ ^ 0xffffffff) <= -3009
		&& (i_0_ ^ 0xffffffff) >= -3063)
		Class203.anInt2967 = 0;
	}
    }
    
    public static Class151 method2722(int arg0, int arg1) {
	try {
	    anInt2947++;
	    Class151 class151;
	    synchronized (Class182.aClass214_2603) {
		class151
		    = (Class151) Class182.aClass214_2603
				     .method2780(arg1 ^ 0x7f, (long) arg0);
	    }
	    if (class151 != null)
		return class151;
	    byte[] is = (Class131_Sub10.aClass158_4222.method2364
			 (Class131_Sub14.method1713(arg0, 29059),
			  Class131_Sub2_Sub2.method1480(arg1, arg0), 0));
	    class151 = new Class151();
	    if (is != null)
		class151.method2191((byte) -9, new Stream(is));
	    synchronized (Class182.aClass214_2603) {
		Class182.aClass214_2603.method2773(true, class151,
						   (long) arg0);
	    }
	    return class151;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uj.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2723(boolean arg0) {
	try {
	    Class79.method784((byte) 61, arg0);
	    anInt2951++;
	    Class87.anInt1144 = 0;
	    boolean bool = true;
	    for (int i = 0; ((Class60.aByteArrayArray788.length ^ 0xffffffff)
			     < (i ^ 0xffffffff)); i++) {
		if ((Class166.anIntArray2218[i] ^ 0xffffffff) != 0
		    && Class60.aByteArrayArray788[i] == null) {
		    Class60.aByteArrayArray788[i]
			= Class37.aClass158_504
			      .method2364(0, Class166.anIntArray2218[i], 0);
		    if (Class60.aByteArrayArray788[i] == null) {
			bool = false;
			Class87.anInt1144++;
		    }
		}
		if ((Class23_Sub3.anIntArray3719[i] ^ 0xffffffff) != 0
		    && Class88.aByteArrayArray1146[i] == null) {
		    Class88.aByteArrayArray1146[i]
			= (Class37.aClass158_504.method2360
			   (Class131_Sub2_Sub14.anIntArrayArray5746[i],
			    Class23_Sub3.anIntArray3719[i], 8610, 0));
		    if (Class88.aByteArrayArray1146[i] == null) {
			bool = false;
			Class87.anInt1144++;
		    }
		}
		if ((Class131_Sub41_Sub2.anIntArray6182[i] ^ 0xffffffff) != 0
		    && Class23.aByteArrayArray254[i] == null) {
		    Class23.aByteArrayArray254[i]
			= Class37.aClass158_504.method2364(0,
							   (Class131_Sub41_Sub2
							    .anIntArray6182
							    [i]),
							   0);
		    if (Class23.aByteArrayArray254[i] == null) {
			Class87.anInt1144++;
			bool = false;
		    }
		}
		if ((Class131_Sub2_Sub16.anIntArray5777[i] ^ 0xffffffff) != 0
		    && Class212.aByteArrayArray3115[i] == null) {
		    Class212.aByteArrayArray3115[i]
			= Class37.aClass158_504.method2364(0,
							   (Class131_Sub2_Sub16
							    .anIntArray5777
							    [i]),
							   0);
		    if (Class212.aByteArrayArray3115[i] == null) {
			Class87.anInt1144++;
			bool = false;
		    }
		}
		if (Class131_Sub41_Sub18.anIntArray6403 != null
		    && Class108.aByteArrayArray1420[i] == null
		    && ((Class131_Sub41_Sub18.anIntArray6403[i] ^ 0xffffffff)
			!= 0)) {
		    Class108.aByteArrayArray1420[i]
			= (Class37.aClass158_504.method2360
			   (Class131_Sub2_Sub14.anIntArrayArray5746[i],
			    Class131_Sub41_Sub18.anIntArray6403[i], 8610, 0));
		    if (Class108.aByteArrayArray1420[i] == null) {
			bool = false;
			Class87.anInt1144++;
		    }
		}
	    }
	    if (Class131_Sub8.aClass177_4188 == null) {
		if (Class131_Sub2_Sub36.aClass131_Sub41_Sub1_6051 == null
		    || !(Class88.aClass158_1153.method2371
			 (-1, (Class131_Sub2_Sub36.aClass131_Sub41_Sub1_6051
			       .aString6167) + "_staticelements")))
		    Class131_Sub8.aClass177_4188 = new Class177(0);
		else if (Class88.aClass158_1153.method2345
			 ((byte) 58,
			  (Class131_Sub2_Sub36.aClass131_Sub41_Sub1_6051
			   .aString6167) + "_staticelements"))
		    Class131_Sub8.aClass177_4188
			= Class56.method625((Class131_Sub2_Sub36
					     .aClass131_Sub41_Sub1_6051
					     .aString6167) + "_staticelements",
					    Class88.aClass158_1153, (byte) 119,
					    Class131_Sub9.aBoolean4218);
		else {
		    Class87.anInt1144++;
		    bool = false;
		}
	    }
	    if (!bool)
		Class131_Sub8_Sub1.anInt6098 = 1;
	    else {
		bool = true;
		Class131_Sub41_Sub17_Sub1.anInt6573 = 0;
		for (int i = 0; Class60.aByteArrayArray788.length > i; i++) {
		    byte[] is = Class88.aByteArrayArray1146[i];
		    if (is != null) {
			int i_1_
			    = (64 * (Class74.anIntArray1003[i] >> -1749859480)
			       - Class92.regionX);
			int i_2_ = ((Class74.anIntArray1003[i] & 0xff) * 64
				    + -Class64.regionY);
			if (Class131_Sub4.aBoolean4134) {
			    i_1_ = 10;
			    i_2_ = 10;
			}
			bool &= Class121_Sub3.method1054(i_1_, is, i_2_, 0);
		    }
		    is = Class212.aByteArrayArray3115[i];
		    if (is != null) {
			int i_3_
			    = (64 * (Class74.anIntArray1003[i] >> 778893256)
			       - Class92.regionX);
			int i_4_ = (64 * (0xff & Class74.anIntArray1003[i])
				    + -Class64.regionY);
			if (Class131_Sub4.aBoolean4134) {
			    i_3_ = 10;
			    i_4_ = 10;
			}
			bool &= Class121_Sub3.method1054(i_3_, is, i_4_, 0);
		    }
		}
		if (!bool)
		    Class131_Sub8_Sub1.anInt6098 = 2;
		else {
		    if (Class131_Sub8_Sub1.anInt6098 != 0)
			Class131_Sub41_Sub5.method1957(true, -29854,
						       (Class14.aString162
							+ "<br>(100%)"),
						       Class184.aClass44_2633);
		    Class43.method522(110);
		    Class131_Sub2_Sub10_Sub1.method1517(8110);
		    boolean bool_5_ = false;
		    if (Class183_Sub1.aClass130_4960.method1255()
			&& Class23_Sub1_Sub2.aBoolean5159) {
			for (int i = 0; Class60.aByteArrayArray788.length > i;
			     i++) {
			    if (Class212.aByteArrayArray3115[i] != null
				|| Class23.aByteArrayArray254[i] != null) {
				bool_5_ = true;
				break;
			    }
			}
		    }
		    int i;
		    if (!Class131_Sub8_Sub1.aBoolean6089)
			i = (Class118.anIntArray1548
			     [Class131_Sub2_Sub20.anInt5839]);
		    else
			i = (Class46.anIntArray638
			     [Class131_Sub2_Sub20.anInt5839]);
		    if (Class183_Sub1.aClass130_4960.method1186())
			i++;
		    Class131_Sub2_Sub7.method1504
			(4, Class131_Sub41_Sub11_Sub1.anInt6546,
			 Class131_Sub2_Sub26.anInt5931, i, bool_5_,
			 (Class183_Sub1.aClass130_4960.method1165()
			  ^ 0xffffffff) < -1);
		    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5; i_6_++)
			Class131_Sub2_Sub9.aClass19Array5682[i_6_]
			    .method253((byte) -107);
		    Class67.method706((byte) -111);
		    Class167.method2430(4, false);
		    Class92.method851(7716);
		    Class43.method522(-112);
		    System.gc();
		    Class79.method784((byte) -127, true);
		    Class6.method162(4, 1, false);
		    int[][] is = null;
		    if (!Class131_Sub4.aBoolean4134) {
			Class67.method704(false, (byte) 116);
			Class111.method951((Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .anIntArray5328[0]) >> 1068690211,
					   (Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .anIntArray5331[0]) >> 115803779,
					   11);
			Class37.method494(-9941);
			Class58.method640(4, Class183_Sub1.aClass130_4960,
					  false, -119, null);
			is = Cryption.anIntArrayArrayArray1828[0];
			Class79.method784((byte) 63, true);
			Class220.method2828((byte) -93, false);
			if (Class108.aByteArrayArray1420 != null)
			    Class130.method1210(false);
		    }
		    if (Class131_Sub4.aBoolean4134) {
			Class131_Sub2_Sub18.method1563(false, false);
			Class111.method951((Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .anIntArray5328[0]) >> -1941918621,
					   (Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .anIntArray5331[0]) >> 1473775299,
					   11);
			Class37.method494(-9941);
			Class58.method640(4, Class183_Sub1.aClass130_4960,
					  false, -119, null);
			is = Cryption.anIntArrayArrayArray1828[0];
			Class79.method784((byte) 121, true);
			method2725(false, 8);
		    }
		    Class131_Sub2_Sub10_Sub1.method1517(8110);
		    Class79.method784((byte) -128, true);
		    Class148.method2176(Class183_Sub1.aClass130_4960, null,
					Class131_Sub2_Sub9.aClass19Array5682,
					4, false, (byte) -106);
		    PacketParser
			.method1583(4, -1, Class183_Sub1.aClass130_4960);
		    Class79.method784((byte) 54, true);
		    int i_7_ = Class193.anInt2830;
		    if ((Class29.anInt300 ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
			i_7_ = Class29.anInt300;
		    if ((i_7_ ^ 0xffffffff)
			> (-1 + Class29.anInt300 ^ 0xffffffff))
			i_7_ = Class29.anInt300 - 1;
		    if (!Class9.method182((byte) -25))
			Class121_Sub3_Sub1.method1059(i_7_);
		    else
			Class121_Sub3_Sub1.method1059(0);
		    Class131_Sub2_Sub6.method1498(-116);
		    if (bool_5_) {
			Class128.method1140(true);
			Class6.method162(1, 1, true);
			if (!Class131_Sub4.aBoolean4134) {
			    Class67.method704(true, (byte) 66);
			    Class58.method640(1, Class183_Sub1.aClass130_4960,
					      true, -124, is);
			    Class79.method784((byte) -118, true);
			    Class220.method2828((byte) -93, true);
			    PacketParser.method1583(1, -1,
							   (Class183_Sub1
							    .aClass130_4960));
			}
			if (Class131_Sub4.aBoolean4134) {
			    Class131_Sub2_Sub18.method1563(false, true);
			    Class58.method640(1, Class183_Sub1.aClass130_4960,
					      true, -122, is);
			    Class79.method784((byte) -127, true);
			    method2725(true, 8);
			}
			Class131_Sub2_Sub10_Sub1.method1517(8110);
			Class79.method784((byte) 80, true);
			Class148.method2176(Class183_Sub1.aClass130_4960,
					    (Class131_Sub2_Sub37
					     .aClass68Array6057[0]),
					    (Class131_Sub2_Sub9
					     .aClass19Array5682),
					    1, true, (byte) -125);
			PacketParser
			    .method1583(1, -1, Class183_Sub1.aClass130_4960);
			Class79.method784((byte) 20, true);
			Class131_Sub2_Sub6.method1498(-97);
			Class128.method1140(false);
		    }
		    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
			for (int i_9_ = 0;
			     ((Class131_Sub41_Sub11_Sub1.anInt6546
			       ^ 0xffffffff)
			      < (i_9_ ^ 0xffffffff));
			     i_9_++) {
			    for (int i_10_ = 0;
				 Class131_Sub2_Sub26.anInt5931 > i_10_;
				 i_10_++)
				Class131.method1354(i_10_, -122, i_8_, i_9_);
			}
		    }
		    Class201.method2718((byte) -101);
		    Class43.method522(-117);
		    Class131_Sub2_Sub27.method1602((byte) -103);
		    Class131_Sub2_Sub10_Sub1.method1517(8110);
		    Class153_Sub2.aBoolean4774 = false;
		    Class158.method2346((byte) -67);
		    if (Class158.aFrame2095 != null && Class128_Sub1.aClass33_4013 != null && Class133.anInt1803 == 25) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(155);
			Class128.anInt1740++;
			Class93.aClass131_Sub15_Sub2_1226.writeInt(1057001181);
		    }
		    if (!Class131_Sub4.aBoolean4134) {
			int i_11_ = ((-(Class131_Sub41_Sub11_Sub1.anInt6546
					>> 1658147972)
				      + Class131_Sub41_Sub13.anInt6326)
				     / 8);
			int i_12_ = ((Class131_Sub41_Sub13.anInt6326
				      - -(Class131_Sub41_Sub11_Sub1.anInt6546
					  >> -681990972))
				     / 8);
			int i_13_
			    = ((-(Class131_Sub2_Sub26.anInt5931 >> 840537732)
				+ Class173.anInt2372)
			       / 8);
			int i_14_
			    = (((Class131_Sub2_Sub26.anInt5931 >> -1135122140)
				+ Class173.anInt2372)
			       / 8);
			for (int i_15_ = i_11_ - 1;
			     (i_12_ + 1 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff);
			     i_15_++) {
			    for (int i_16_ = i_13_ - 1; i_14_ + 1 >= i_16_;
				 i_16_++) {
				if (i_15_ < i_11_
				    || (i_12_ ^ 0xffffffff) > (i_15_
							       ^ 0xffffffff)
				    || i_16_ < i_13_
				    || (i_16_ ^ 0xffffffff) < (i_14_
							       ^ 0xffffffff)) {
				    Class37.aClass158_504.method2353
					((byte) 126,
					 "m" + i_15_ + "_" + i_16_);
				    Class37.aClass158_504.method2353
					((byte) 116,
					 "l" + i_15_ + "_" + i_16_);
				}
			    }
			}
		    }
		    if (Class133.anInt1803 == 28)
			Class175.method2484(10, (byte) 84);
		    else {
			Class175.method2484(30, (byte) 104);
			if (Class128_Sub1.aClass33_4013 != null)
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(116);
		    }
		    Class131_Sub31.method1864((byte) -38);
		    Class43.method522(106);
		    Class100.method877(-1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uj.B(" + arg0 + ')');
	}
    }
    
    public static Class152 method2724(Class130 arg0, int arg1, int arg2,
				      int arg3, Class188 arg4, int arg5,
				      int arg6, int arg7) {
	try {
	    Class6.aClass89_95.anInt3256 = arg3;
	    Class6.aClass89_95.aBoolean3249 = arg4 != null;
	    Class6.aClass89_95.anInt3252 = arg2;
	    Class6.aClass89_95.anInt3265 = arg7;
	    Class6.aClass89_95.anInt3253 = arg0.anInt1781;
	    Class6.aClass89_95.anInt3264 = arg6;
	    Class6.aClass89_95.anInt3250 = arg5;
	    if (arg1 != 1483)
		method2722(60, -109);
	    anInt2946++;
	    return (Class152) Class23_Sub3_Sub1.aClass103_5226
				  .method901((byte) 97, Class6.aClass89_95);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uj.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ',' + arg6
						 + ',' + arg7 + ')'));
	}
    }
    
    public static void method2725(boolean arg0, int arg1) {
	try {
	    anInt2950++;
	    byte[][] is;
	    int i;
	    if (arg0) {
		i = 1;
		is = Class212.aByteArrayArray3115;
	    } else {
		is = Class88.aByteArrayArray1146;
		i = 4;
	    }
	    int i_17_ = 0;
	    if (arg1 == 8) {
		for (/**/; i_17_ < i; i_17_++) {
		    Class43.method522(arg1 + 92);
		    for (int i_18_ = 0;
			 ((Class131_Sub41_Sub11_Sub1.anInt6546 >> 59202179
			   ^ 0xffffffff)
			  < (i_18_ ^ 0xffffffff));
			 i_18_++) {
			for (int i_19_ = 0;
			     (i_19_
			      < Class131_Sub2_Sub26.anInt5931 >> 1901489699);
			     i_19_++) {
			    int i_20_ = (Class141.anIntArrayArrayArray1882
					 [i_17_][i_18_][i_19_]);
			    if (i_20_ != -1) {
				int i_21_ = 0x3 & i_20_ >> -1943747688;
				if (!arg0 || (i_21_ ^ 0xffffffff) == -1) {
				    int i_22_ = (0x6 & i_20_) >> 1372662593;
				    int i_23_
					= (i_20_ & 0xfffb20) >> -2086194002;
				    int i_24_
					= (i_20_ & 0x3ffa) >> -1893816541;
				    int i_25_ = (i_24_ / 8
						 + (i_23_ / 8 << -128588056));
				    for (int i_26_ = 0;
					 i_26_ < Class74.anIntArray1003.length;
					 i_26_++) {
					if (((Class74.anIntArray1003[i_26_]
					      ^ 0xffffffff)
					     == (i_25_ ^ 0xffffffff))
					    && is[i_26_] != null) {
					    Class131_Sub41_Sub4.method1942
						(8 * (i_24_ & 0x7),
						 Class183_Sub1.aClass130_4960,
						 8 * i_18_,
						 (Class131_Sub2_Sub9
						  .aClass19Array5682),
						 8 * i_19_, arg0, i_22_, i_21_,
						 8 * (i_23_ & 0x7), is[i_26_],
						 i_17_, false);
					    break;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uj.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class128_Sub1 method2726(int arg0) {
	try {
	    int i = 61 / ((30 - arg0) / 63);
	    anInt2945++;
	    if ((Class131_Sub2_Sub7.anInt5633 ^ 0xffffffff)
		> (Class110_Sub4.aClass128_Sub1Array3939.length ^ 0xffffffff))
		return (Class110_Sub4.aClass128_Sub1Array3939
			[Class131_Sub2_Sub7.anInt5633++]);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uj.F(" + arg0 + ')');
	}
    }
    
    static {
	anInt2944 = -1;
	anInt2943 = 0;
    }
}
