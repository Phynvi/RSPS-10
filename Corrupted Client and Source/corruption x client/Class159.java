/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class159
{
    public static int anInt2118;
    public static int anInt2119;
    public static int anInt2120;
    public static int anInt2121;
    public static int anInt2122;
    public static short[] aShortArray2123;
    public static int[] anIntArray2124 = new int[32];
    public static int anInt2125;
    public static int[] anIntArray2126
	= { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1 };
    
    public static void method2376(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, int arg5) {
	anInt2122++;
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 == null)
	    Class183_Sub1.aClass130_4960.method1201(arg5, arg3, arg2, arg0,
						    -16777216, 61);
	else {
	    Class83.anInt1093++;
	    if (Class166.aClass23_Sub4_Sub1_Sub2_2216 != null
		&& ((Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
		     - 64 * (-1 + Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .method335((byte) -60))) >> 1800180871
		    == Class131_Sub2_Sub6.LocalX)
		&& (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
		    + -(64 * Class166.aClass23_Sub4_Sub1_Sub2_2216
				 .method335((byte) -56))
		    - -64) >> 1384514887 == Class169.LocalY) {
		Class131_Sub2_Sub6.LocalX = -1;
		Class169.LocalY = -1;
		Class149.method2181((byte) -117);
	    }
	    Class145.method2161((byte) 80);
	    if (!arg4)
		Class183.method2540(-5815);
	    Class9.method187(-1);
	    Class153_Sub1.method2235(arg3, arg5, arg0, true, arg2, 3516);
	    arg3 = Class131_Sub2_Sub32.anInt6016;
	    arg5 = Class71.anInt947;
	    arg2 = Class41.anInt544;
	    arg0 = Class121.anInt1593;
	    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -2) {
		int i = (int) Class23_Sub1_Sub1.aFloat5082;
		if ((Class64.anInt811 >> 1289290920 ^ 0xffffffff)
		    < (i ^ 0xffffffff))
		    i = Class64.anInt811 >> 1076171560;
		if (Class119.aBooleanArray1567[4]
		    && ((128 + Class151.anIntArray2020[4] ^ 0xffffffff)
			< (i ^ 0xffffffff)))
		    i = 128 + Class151.anIntArray2020[4];
		int i_0_
		    = 0x3fff & (int) Class120.aFloat1578 + Class47.anInt647;
		Class89.method835
		    (0,
		     (RuntimeException_Sub1.method2833
		      (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747, -5,
		       Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733,
		       Class29.anInt300)) + -50,
		     600 + (i >> 588677827) * 3, i, i_0_, arg3,
		     Class131_Sub3.anInt4126, Class131_Sub41_Sub9.anInt6275);
	    } else if (Class131_Sub2_Sub34.anInt6035 != 4) {
		if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -6)
		    Class131_Sub41_Sub9.method1990((byte) -99, arg3);
	    } else {
		int i = (int) Class23_Sub1_Sub1.aFloat5082;
		if ((i ^ 0xffffffff)
		    > (Class64.anInt811 >> 962550536 ^ 0xffffffff))
		    i = Class64.anInt811 >> 1174165448;
		if (Class119.aBooleanArray1567[4]
		    && (i ^ 0xffffffff) > (128 + Class151.anIntArray2020[4]
					   ^ 0xffffffff))
		    i = 128 + Class151.anIntArray2020[4];
		int i_1_ = (int) Class120.aFloat1578 & 0x3fff;
		Class89.method835(0,
				  -50 + (RuntimeException_Sub1.method2833
					 (Class50.anInt657, 106,
					  Class23_Sub2_Sub2.anInt5169,
					  Class29.anInt300)),
				  (i >> 1705410435) * 3 + 600, i, i_1_, arg3,
				  Class131_Sub3.anInt4126,
				  Class131_Sub41_Sub9.anInt6275);
	    }
	    int i = Class2.anInt84;
	    int i_2_ = Class87.anInt1140;
	    int i_3_ = Class57.anInt753;
	    int i_4_ = Stream.anInt4323;
	    int i_5_ = Class131_Sub41_Sub4.anInt6213;
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -6; i_6_++) {
		if (Class119.aBooleanArray1567[i_6_]) {
		    int i_7_
			= (int) ((Math.random()
				  * (double) (2 * Class189.anIntArray2764[i_6_]
					      + 1))
				 - (double) Class189.anIntArray2764[i_6_]
				 + (Math.sin((double) (Class167.anIntArray2236
						       [i_6_])
					     * ((double) (Class23.anIntArray249
							  [i_6_])
						/ 100.0))
				    * (double) Class151.anIntArray2020[i_6_]));
		    if (i_6_ == 4) {
			Stream.anInt4323 += i_7_;
			if ((Stream.anInt4323 ^ 0xffffffff) > -1025)
			    Stream.anInt4323 = 1024;
			else if ((Stream.anInt4323 ^ 0xffffffff)
				 < -3073)
			    Stream.anInt4323 = 3072;
		    }
		    if ((i_6_ ^ 0xffffffff) == -4)
			Class131_Sub41_Sub4.anInt6213
			    = i_7_ + Class131_Sub41_Sub4.anInt6213 & 0x3fff;
		    if ((i_6_ ^ 0xffffffff) == -2)
			Class87.anInt1140 += i_7_;
		    if (i_6_ == 0)
			Class2.anInt84 += i_7_;
		    if ((i_6_ ^ 0xffffffff) == -3)
			Class57.anInt753 += i_7_;
		}
	    }
	    if (Class2.anInt84 < 0)
		Class2.anInt84 = 0;
	    if (Class2.anInt84 > -1 + (Class210.anInt3068 << 1429225991))
		Class2.anInt84 = -1 + (Class210.anInt3068 << -751453913);
	    if ((Class57.anInt753 ^ 0xffffffff) > -1)
		Class57.anInt753 = 0;
	    if (((Class131_Sub8_Sub1.anInt6099 << -209851641) - 1 ^ 0xffffffff)
		> (Class57.anInt753 ^ 0xffffffff))
		Class57.anInt753
		    = -1 + (Class131_Sub8_Sub1.anInt6099 << -1068846393);
	    Class35.method466(96);
	    Class37.method494(-9941);
	    Class183_Sub1.aClass130_4960.method1188(arg2, arg0, arg2 - -arg5,
						    arg3 + arg0);
	    if (arg1 <= -64) {
		Class183_Sub1.aClass130_4960.method1169();
		int i_8_ = Class131_Sub2_Sub26.anInt5927;
		if (Class98.aClass209_1307 == null)
		    Class183_Sub1.aClass130_4960.method1191(i_8_);
		else
		    Class98.aClass209_1307.method2756
			(-26367, Class183_Sub1.aClass130_4960,
			 Stream.anInt4323,
			 Class131_Sub41_Sub4.anInt6199 << -1700855325, arg0,
			 Class131_Sub41_Sub4.anInt6213, i_8_, arg2, arg5,
			 arg3);
		Class43.method522(115);
		PacketParser.aClass9_5876.method188
		    (Class2.anInt84, Class87.anInt1140, Class57.anInt753,
		     -Stream.anInt4323 & 0x3fff,
		     0x3fff & -Class131_Sub41_Sub4.anInt6213,
		     -Login.anInt1762 & 0x3fff);
		Class183_Sub1.aClass130_4960
		    .method1260(PacketParser.aClass9_5876);
		Class183_Sub1.aClass130_4960.method1193(arg2 - -(arg5 / 2),
							arg3 / 2 + arg0,
							(Class146.anInt1936
							 << -508355359),
							(Class146.anInt1936
							 << -1228302687));
		Class131_Sub11.method1698(arg0 + arg3 / 2,
					  Class146.anInt1936 << 862042209,
					  Class146.anInt1936 << 638356385,
					  -14213, arg5 / 2 + arg2);
		Class130.method1222(Class57.anInt753,
				    -Class131_Sub41_Sub4.anInt6213 & 0x3fff,
				    -119, Class2.anInt84,
				    0x3fff & -Login.anInt1762,
				    0x3fff & -Stream.anInt4323,
				    Class87.anInt1140);
		byte i_9_ = (Class131_Sub41_Sub17_Sub1.method2048(28804) == 2
			     ? (byte) Class83.anInt1093 : (byte) 1);
		Class12.method209(Class183_Sub1.aClass130_4960,
				  Class125.anInt1632, Class131_Sub31.anInt4537,
				  PacketParser.aClass9_5876,
				  Class2.anInt84, Class87.anInt1140,
				  Class57.anInt753,
				  Class146.aByteArrayArrayArray1942,
				  Class53.anIntArray699,
				  Class153.anIntArray2028,
				  Class121_Sub2_Sub1.anIntArray5425,
				  Class131_Sub2_Sub12.anIntArray5723,
				  Class131_Sub2_Sub25.anIntArray5915,
				  Class29.anInt300 - -1, i_9_,
				  (Class166.aClass23_Sub4_Sub1_Sub2_2216
				   .anInt3733) >> -1649905721,
				  (Class166.aClass23_Sub4_Sub1_Sub2_2216
				   .anInt3747) >> -547821945,
				  !Class131_Sub33.aBoolean4557);
		Class43.method522(110);
		if ((Class133.anInt1803 ^ 0xffffffff) == -31) {
		    Class131_Sub17.method1801(256, 256, false, arg2, arg0,
					      arg5, arg3);
		    Class78.method780(arg2, arg3, 256, arg0, 0, arg5, 256);
		    Class131_Sub41_Sub6.method1960(arg5, 256, arg0, arg3,
						   (byte) 63, arg2, 256);
		    Class59.method642(arg5, arg0, arg2, arg3, 87);
		}
		Class161.method2386();
		Class57.anInt753 = i_3_;
		Class87.anInt1140 = i_2_;
		Class131_Sub41_Sub4.anInt6213 = i_5_;
		Stream.anInt4323 = i_4_;
		Class2.anInt84 = i;
		if (Class183.aBoolean2610
		    && Class46.aClass179_640.method2506(4) == 0)
		    Class183.aBoolean2610 = false;
		if (Class183.aBoolean2610) {
		    Class183_Sub1.aClass130_4960
			.method1201(arg5, arg3, arg2, arg0, -16777216, 31);
		    Class131_Sub41_Sub5.method1957(false, -29854,
						   Class14.aString162,
						   Class184.aClass44_2633);
		}
	    }
	}
    }
    
    public static void method2377(int arg0) {
	aShortArray2123 = null;
	anIntArray2126 = null;
	anIntArray2124 = null;
	if (arg0 <= 114)
	    method2376(-103, -103, 101, 6, false, -107);
    }
    
    public static void method2378(int arg0, int arg1) {
	try {
	    anInt2119++;
	    if (arg1 != 2)
		anInt2118 = 41;
	    Class183.anInt2611 = arg0;
	    synchronized (Class131_Sub31.aClass214_4545) {
		Class131_Sub31.aClass214_4545.method2783(-88);
	    }
	    synchronized (Login.aClass214_1757) {
		Login.aClass214_1757.method2783(-88);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qk.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method2379(int arg0, int arg1, boolean arg2) {
	try {
	    anInt2121++;
	    if (arg2 != true)
		return 71;
	    if ((arg0 ^ 0xffffffff) == -5 || arg0 == 5)
		return Class179.anIntArray2541[0x3 & arg1];
	    return 256;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qk.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2380(int arg0) {
	try {
	    anInt2125++;
	    if (arg0 == 64 && Class131_Sub2_Sub7.aClass166_5635 != null) {
		while (Class110_Sub4.aClass128_Sub1Array3939.length
		       > Class131_Sub29.anInt4511) {
		    Class128_Sub1 class128_sub1
			= (Class110_Sub4.aClass128_Sub1Array3939
			   [Class131_Sub29.anInt4511]);
		    if (class128_sub1 == null || class128_sub1.anInt4015 != -1)
			Class131_Sub29.anInt4511++;
		    else {
			if (Class184.aClass131_Sub30_2626 == null)
			    Class184.aClass131_Sub30_2626
				= (Class131_Sub2_Sub7.aClass166_5635.method2424
				   (class128_sub1.aString4017, false));
			int i = Class184.aClass131_Sub30_2626.anInt4521;
			if ((i ^ 0xffffffff) == 0)
			    break;
			Class184.aClass131_Sub30_2626 = null;
			Class131_Sub29.anInt4511++;
			class128_sub1.anInt4015 = i;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qk.C(" + arg0 + ')');
	}
    }
}
