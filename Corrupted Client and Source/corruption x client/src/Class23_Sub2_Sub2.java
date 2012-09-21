/* Class23_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub2_Sub2 extends Class23_Sub2 implements Interface6
{
    public static int anInt5165;
    public static int anInt5166;
    public static int[] anIntArray5167;
    public static int anInt5168;
    public static int anInt5169;
    public static int anInt5170;
    public boolean aBoolean5171;
    public static int anInt5172;
    public Class131_Sub41_Sub13 aClass131_Sub41_Sub13_5173;
    public static volatile long aLong5174 = 0L;
    public static int anInt5175;
    public static int anInt5176;
    public static int anInt5177;
    public short aShort5178;
    public static int anInt5179;
    public byte aByte5180;
    public byte aByte5181;
    public static int anInt5182;
    public static int anInt5183;
    public static int anInt5184;
    public static int anInt5185;
    public static String aString5186;
    public static int anInt5187;
    public Class154 aClass154_5188;
    public static int anInt5189;
    public boolean aBoolean5190;
    public static boolean aBoolean5191;
    public static int anInt5192;
    public byte aByte5193;
    public boolean aBoolean5194;
    public static String aString5195;
    
    public void method25(byte arg0) {
	if (arg0 != 6)
	    anInt5169 = -28;
	anInt5176++;
	if (aClass154_5188 != null)
	    aClass154_5188.method2246();
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt5177++;
	    if (aClass154_5188 == null)
		return null;
	    if (arg1 != false)
		method22(13, null);
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3712 + anInt3711, anInt3708,
			     anInt3706 + anInt3714);
	    Class1_Sub2 class1_sub2 = null;
	    if (aBoolean5194)
		class1_sub2 = Class131_Sub41_Sub11.method2003(1, 12300);
	    aClass154_5188.method2261(class9,
				      (class1_sub2 != null
				       ? class1_sub2.aClass1_Sub5Array3500[0]
				       : null),
				      0);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method312
	(byte[][] arg0, int arg1, Class130 arg2, boolean[] arg3, Class189 arg4,
	 byte[][] arg5, int arg6, int arg7, byte[][] arg8, int arg9, int arg10,
	 Class108 arg11, int arg12, int arg13) {
	do {
	    try {
		if (arg4 != null && arg11 != null
		    || arg11 != null && arg1 == 12
		    || arg4 != null && (arg1 ^ 0xffffffff) == -1) {
		    boolean[] bools = (arg4 == null || !arg4.aBoolean2775
				       ? Class69.aBooleanArrayArray931[arg1]
				       : Class45.aBooleanArrayArray625[arg1]);
		    if (arg9 > 0) {
			if ((arg13 ^ 0xffffffff) < -1) {
			    int i = 0xff & arg5[-1 + arg13][-1 + arg9];
			    if (i > 0) {
				Class189 class189
				    = Class187.method2570(false, -1 + i);
				if (class189.anInt2766 != -1
				    && class189.aBoolean2775) {
				    byte i_0_ = arg0[arg13 - 1][arg9 + -1];
				    int i_1_
					= (arg8[arg13 + -1][-1 + arg9] * 2 + 4
					   & 0x7);
				    int i_2_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    if (Class46.aBooleanArrayArray637[i_0_]
					[i_1_]) {
					Class110_Sub1.anIntArray3899[0]
					    = class189.anInt2766;
					Class131_Sub18.anIntArray4390[0]
					    = i_2_;
					Class92.anIntArray1203[0]
					    = (arg2.method1223()
					       ? class189.anInt2760
					       : class189.anInt2765);
					Class131_Sub2_Sub11.anIntArray5712[0]
					    = class189.anInt2773;
					Class23_Sub4_Sub2.anIntArray5358[0]
					    = class189.anInt2778;
					Class210.anIntArray3064[0] = 256;
				    }
				}
			    }
			}
			if ((arg13 ^ 0xffffffff) > (-1 + arg10 ^ 0xffffffff)) {
			    int i = arg5[arg13 - -1][-1 + arg9] & 0xff;
			    if (i > 0) {
				Class189 class189
				    = Class187.method2570(false, -1 + i);
				if (class189.anInt2766 != -1
				    && class189.aBoolean2775) {
				    byte i_3_ = arg0[arg13 + 1][arg9 + -1];
				    int i_4_
					= (arg8[1 + arg13][arg9 - 1] * 2 + 6
					   & 0x7);
				    int i_5_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    if (Class46.aBooleanArrayArray637[i_3_]
					[i_4_]) {
					Class110_Sub1.anIntArray3899[2]
					    = class189.anInt2766;
					Class131_Sub18.anIntArray4390[2]
					    = i_5_;
					Class92.anIntArray1203[2]
					    = (arg2.method1223()
					       ? class189.anInt2760
					       : class189.anInt2765);
					Class131_Sub2_Sub11.anIntArray5712[2]
					    = class189.anInt2773;
					Class23_Sub4_Sub2.anIntArray5358[2]
					    = class189.anInt2778;
					Class210.anIntArray3064[2] = 512;
				    }
				}
			    }
			}
		    }
		    if ((arg9 ^ 0xffffffff) > (-1 + arg7 ^ 0xffffffff)) {
			if (arg13 > 0) {
			    int i = arg5[-1 + arg13][1 + arg9] & 0xff;
			    if (i > 0) {
				Class189 class189
				    = Class187.method2570(false, i - 1);
				if ((class189.anInt2766 ^ 0xffffffff) != 0
				    && class189.aBoolean2775) {
				    byte i_6_ = arg0[arg13 + -1][arg9 + 1];
				    int i_7_
					= (2 * arg8[arg13 - 1][arg9 - -1] + 2
					   & 0x7);
				    int i_8_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    if (Class46.aBooleanArrayArray637[i_6_]
					[i_7_]) {
					Class110_Sub1.anIntArray3899[6]
					    = class189.anInt2766;
					Class131_Sub18.anIntArray4390[6]
					    = i_8_;
					Class92.anIntArray1203[6]
					    = (arg2.method1223()
					       ? class189.anInt2760
					       : class189.anInt2765);
					Class131_Sub2_Sub11.anIntArray5712[6]
					    = class189.anInt2773;
					Class23_Sub4_Sub2.anIntArray5358[6]
					    = class189.anInt2778;
					Class210.anIntArray3064[6] = 64;
				    }
				}
			    }
			}
			if (arg13 < -1 + arg10) {
			    int i = 0xff & arg5[1 + arg13][arg9 - -1];
			    if (i > 0) {
				Class189 class189
				    = Class187.method2570(false, -1 + i);
				if (class189.anInt2766 != -1
				    && class189.aBoolean2775) {
				    byte i_9_ = arg0[1 + arg13][arg9 + 1];
				    int i_10_
					= 0x7 & 2 * arg8[1 + arg13][arg9 - -1];
				    int i_11_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    if (Class46.aBooleanArrayArray637[i_9_]
					[i_10_]) {
					Class110_Sub1.anIntArray3899[4]
					    = class189.anInt2766;
					Class131_Sub18.anIntArray4390[4]
					    = i_11_;
					Class92.anIntArray1203[4]
					    = (!arg2.method1223()
					       ? class189.anInt2765
					       : class189.anInt2760);
					Class131_Sub2_Sub11.anIntArray5712[4]
					    = class189.anInt2773;
					Class23_Sub4_Sub2.anIntArray5358[4]
					    = class189.anInt2778;
					Class210.anIntArray3064[4] = 128;
				    }
				}
			    }
			}
		    }
		    if (arg9 > 0) {
			int i = arg5[arg13][-1 + arg9] & 0xff;
			if (i > 0) {
			    Class189 class189
				= Class187.method2570(false, -1 + i);
			    if ((class189.anInt2766 ^ 0xffffffff) != 0) {
				byte i_12_ = arg0[arg13][-1 + arg9];
				int i_13_ = arg8[arg13][-1 + arg9];
				if (class189.aBoolean2775) {
				    int i_14_ = 2;
				    int i_15_ = 4 + 2 * i_13_;
				    int i_16_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    for (int i_17_ = 0; i_17_ < 3; i_17_++) {
					i_15_ = 0x7 & i_15_;
					i_14_ &= 0x7;
					if ((Class46.aBooleanArrayArray637
					     [i_12_][i_15_])
					    && ((Class23_Sub4_Sub2
						 .anIntArray5358[i_14_])
						<= class189.anInt2778)) {
					    Class110_Sub1.anIntArray3899[i_14_]
						= class189.anInt2766;
					    Class131_Sub18.anIntArray4390
						[i_14_]
						= i_16_;
					    Class92.anIntArray1203[i_14_]
						= (!arg2.method1223()
						   ? class189.anInt2765
						   : class189.anInt2760);
					    Class131_Sub2_Sub11
						.anIntArray5712[i_14_]
						= class189.anInt2773;
					    if ((Class23_Sub4_Sub2
						 .anIntArray5358[i_14_])
						!= class189.anInt2778)
						Class210.anIntArray3064[i_14_]
						    = 32;
					    else
						Class210.anIntArray3064[i_14_]
						    = (Cryption.method2105
						       ((Class210
							 .anIntArray3064
							 [i_14_]),
							32));
					    Class23_Sub4_Sub2
						.anIntArray5358[i_14_]
						= class189.anInt2778;
					}
					i_15_++;
					i_14_--;
				    }
				    if (!bools[arg6 & 0x3])
					arg3[0]
					    = (Class45.aBooleanArrayArray625
					       [i_12_]
					       [Class90.method841(3,
								  i_13_ + 2)]);
				} else if (!bools[arg6 & 0x3])
				    arg3[0]
					= (Class69.aBooleanArrayArray931[i_12_]
					   [Class90.method841(3, i_13_ + 2)]);
			    }
			}
		    }
		    if (arg9 < arg7 + -1) {
			int i = 0xff & arg5[arg13][arg9 - -1];
			if (i > 0) {
			    Class189 class189
				= Class187.method2570(false, i - 1);
			    if ((class189.anInt2766 ^ 0xffffffff) != 0) {
				byte i_18_ = arg0[arg13][arg9 + 1];
				int i_19_ = arg8[arg13][arg9 - -1];
				if (!class189.aBoolean2775) {
				    if (!bools[0x3 & arg6 + 2])
					arg3[2]
					    = (Class69.aBooleanArrayArray931
					       [i_18_]
					       [Class90.method841(i_19_, 3)]);
				} else {
				    int i_20_ = 4;
				    int i_21_ = 2 - -(2 * i_19_);
				    int i_22_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    for (int i_23_ = 0; i_23_ < 3; i_23_++) {
					i_20_ &= 0x7;
					i_21_ = 0x7 & i_21_;
					if ((Class46.aBooleanArrayArray637
					     [i_18_][i_21_])
					    && ((class189.anInt2778
						 ^ 0xffffffff)
						<= ((Class23_Sub4_Sub2
						     .anIntArray5358[i_20_])
						    ^ 0xffffffff))) {
					    Class110_Sub1.anIntArray3899[i_20_]
						= class189.anInt2766;
					    Class131_Sub18.anIntArray4390
						[i_20_]
						= i_22_;
					    Class92.anIntArray1203[i_20_]
						= (arg2.method1223()
						   ? class189.anInt2760
						   : class189.anInt2765);
					    Class131_Sub2_Sub11
						.anIntArray5712[i_20_]
						= class189.anInt2773;
					    if ((class189.anInt2778
						 ^ 0xffffffff)
						!= ((Class23_Sub4_Sub2
						     .anIntArray5358[i_20_])
						    ^ 0xffffffff))
						Class210.anIntArray3064[i_20_]
						    = 16;
					    else
						Class210.anIntArray3064[i_20_]
						    = (Cryption.method2105
						       ((Class210
							 .anIntArray3064
							 [i_20_]),
							16));
					    Class23_Sub4_Sub2
						.anIntArray5358[i_20_]
						= class189.anInt2778;
					}
					i_21_--;
					i_20_++;
				    }
				    if (!bools[0x3 & 2 - -arg6])
					arg3[2]
					    = (Class45.aBooleanArrayArray625
					       [i_18_]
					       [Class90.method841(i_19_, 3)]);
				}
			    }
			}
		    }
		    if (arg13 > 0) {
			int i = arg5[arg13 + -1][arg9] & 0xff;
			if (i > 0) {
			    Class189 class189
				= Class187.method2570(false, -1 + i);
			    if (class189.anInt2766 != -1) {
				byte i_24_ = arg0[arg13 - 1][arg9];
				int i_25_ = arg8[arg13 - 1][arg9];
				if (!class189.aBoolean2775) {
				    if (!bools[3 - -arg6 & 0x3])
					arg3[3]
					    = (Class69.aBooleanArrayArray931
					       [i_24_]
					       [Class90.method841(1 + i_25_,
								  3)]);
				} else {
				    int i_26_ = 6;
				    int i_27_ = 4 - -(2 * i_25_);
				    int i_28_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    for (int i_29_ = 0;
					 (i_29_ ^ 0xffffffff) > -4; i_29_++) {
					i_26_ &= 0x7;
					i_27_ &= 0x7;
					if ((Class46.aBooleanArrayArray637
					     [i_24_][i_27_])
					    && ((Class23_Sub4_Sub2
						 .anIntArray5358[i_26_])
						<= class189.anInt2778)) {
					    Class110_Sub1.anIntArray3899[i_26_]
						= class189.anInt2766;
					    Class131_Sub18.anIntArray4390
						[i_26_]
						= i_28_;
					    Class92.anIntArray1203[i_26_]
						= (!arg2.method1223()
						   ? class189.anInt2765
						   : class189.anInt2760);
					    Class131_Sub2_Sub11
						.anIntArray5712[i_26_]
						= class189.anInt2773;
					    if ((Class23_Sub4_Sub2
						 .anIntArray5358[i_26_])
						== class189.anInt2778)
						Class210.anIntArray3064[i_26_]
						    = (Cryption.method2105
						       ((Class210
							 .anIntArray3064
							 [i_26_]),
							8));
					    else
						Class210.anIntArray3064[i_26_]
						    = 8;
					    Class23_Sub4_Sub2
						.anIntArray5358[i_26_]
						= class189.anInt2778;
					}
					i_27_--;
					i_26_++;
				    }
				    if (!bools[0x3 & arg6 + 3])
					arg3[3]
					    = (Class45.aBooleanArrayArray625
					       [i_24_]
					       [Class90.method841(3,
								  i_25_ + 1)]);
				}
			    }
			}
		    }
		    if ((arg10 + -1 ^ 0xffffffff) < (arg13 ^ 0xffffffff)) {
			int i = 0xff & arg5[1 + arg13][arg9];
			if (i > 0) {
			    Class189 class189
				= Class187.method2570(false, i + -1);
			    if (class189.anInt2766 != -1) {
				byte i_30_ = arg0[1 + arg13][arg9];
				int i_31_ = arg8[1 + arg13][arg9];
				if (!class189.aBoolean2775) {
				    if (!bools[1 - -arg6 & 0x3])
					arg3[1]
					    = (Class69.aBooleanArrayArray931
					       [i_30_]
					       [Class90.method841(3,
								  i_31_ + 3)]);
				} else {
				    int i_32_ = 4;
				    int i_33_ = 6 - -(2 * i_31_);
				    int i_34_
					= Class121.method1038((byte) 50, arg2,
							      class189);
				    for (int i_35_ = 0; i_35_ < 3; i_35_++) {
					i_33_ &= 0x7;
					i_32_ = 0x7 & i_32_;
					if ((Class46.aBooleanArrayArray637
					     [i_30_][i_33_])
					    && (class189.anInt2778
						>= (Class23_Sub4_Sub2
						    .anIntArray5358[i_32_]))) {
					    Class110_Sub1.anIntArray3899[i_32_]
						= class189.anInt2766;
					    Class131_Sub18.anIntArray4390
						[i_32_]
						= i_34_;
					    Class92.anIntArray1203[i_32_]
						= (arg2.method1223()
						   ? class189.anInt2760
						   : class189.anInt2765);
					    Class131_Sub2_Sub11
						.anIntArray5712[i_32_]
						= class189.anInt2773;
					    if (class189.anInt2778
						!= (Class23_Sub4_Sub2
						    .anIntArray5358[i_32_]))
						Class210.anIntArray3064[i_32_]
						    = 4;
					    else
						Class210.anIntArray3064[i_32_]
						    = (Cryption.method2105
						       ((Class210
							 .anIntArray3064
							 [i_32_]),
							4));
					    Class23_Sub4_Sub2
						.anIntArray5358[i_32_]
						= class189.anInt2778;
					}
					i_33_++;
					i_32_--;
				    }
				    if (!bools[1 + arg6 & 0x3])
					arg3[1]
					    = (Class45.aBooleanArrayArray625
					       [i_30_]
					       [Class90.method841(i_31_ + 3,
								  3)]);
				}
			    }
			}
		    }
		}
		anInt5182++;
		if (arg4 != null) {
		    int i = Class121.method1038((byte) 50, arg2, arg4);
		    if (arg4.aBoolean2775) {
			for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -9;
			     i_36_++) {
			    int i_37_ = i_36_ + -(arg6 * 2) & 0x7;
			    if (Class46.aBooleanArrayArray637[arg1][i_36_]
				&& arg4.anInt2778 >= (Class23_Sub4_Sub2
						      .anIntArray5358
						      [i_37_])) {
				Class110_Sub1.anIntArray3899[i_37_]
				    = arg4.anInt2766;
				Class131_Sub18.anIntArray4390[i_37_] = i;
				Class92.anIntArray1203[i_37_]
				    = (arg2.method1223() ? arg4.anInt2760
				       : arg4.anInt2765);
				Class131_Sub2_Sub11.anIntArray5712[i_37_]
				    = arg4.anInt2773;
				if (Class23_Sub4_Sub2.anIntArray5358[i_37_]
				    != arg4.anInt2778)
				    Class210.anIntArray3064[i_37_] = 2;
				else
				    Class210.anIntArray3064[i_37_]
					= Cryption.method2105((Class210
							       .anIntArray3064
							       [i_37_]),
							      2);
				Class23_Sub4_Sub2.anIntArray5358[i_37_]
				    = arg4.anInt2778;
			    }
			}
		    }
		}
		if (arg12 == 1)
		    break;
		aString5186 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("vc.CA(" + (arg0 != null ? "{...}" : "null") + ','
			    + arg1 + ',' + (arg2 != null ? "{...}" : "null")
			    + ',' + (arg3 != null ? "{...}" : "null") + ','
			    + (arg4 != null ? "{...}" : "null") + ','
			    + (arg5 != null ? "{...}" : "null") + ',' + arg6
			    + ',' + arg7 + ','
			    + (arg8 != null ? "{...}" : "null") + ',' + arg9
			    + ',' + arg10 + ','
			    + (arg11 != null ? "{...}" : "null") + ',' + arg12
			    + ',' + arg13 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method313(int arg0, int arg1, int arg2, Class130 arg3) {
	try {
	    anInt5175++;
	    Class131_Sub41_Sub12.aClass150ArrayArray6309
		= new Class150[arg1][arg0];
	    Class214.aClass130_3128 = arg3;
	    if (Class107.anIntArray1391 != null)
		Class88.aClass83_1170
		    = Class135.method2101((byte) -17,
					  Class107.anIntArray1391[3],
					  Class107.anIntArray1391[1],
					  Class107.anIntArray1391[5],
					  Class107.anIntArray1391[4],
					  Class107.anIntArray1391[0],
					  Class107.anIntArray1391[2]);
	    if (arg2 <= 101)
		aString5195 = null;
	    Class201.aClass150_2934 = new Class150();
	    Class92.method851(7716);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.AA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class23_Sub2_Sub2(Class130 arg0, Class187 arg1, int arg2, int arg3,
			     int arg4, int arg5, boolean arg6, int arg7,
			     int arg8, int arg9, int arg10, int arg11) {
	super(arg3, arg4, arg5, arg7, arg8, arg9,
	      Class131_Sub18.method1804(arg10, (byte) 115, arg11));
	do {
	    try {
		aByte5181 = (byte) arg2;
		anInt3711 = (short) arg3;
		aBoolean5171 = arg6;
		anInt3714 = (short) arg5;
		aShort5178 = (short) arg1.anInt2713;
		aByte5193 = (byte) arg11;
		aByte5180 = (byte) arg10;
		aBoolean5194 = arg1.anInt2663 != 0 && !arg6;
		aBoolean5190
		    = (arg0.method1259() && arg1.aBoolean2735 && !aBoolean5171
		       && (Class131_Sub2_Sub16.anInt5779 ^ 0xffffffff) != -1);
		Class14 class14
		    = method314((byte) 121, 1024, arg0, aBoolean5190);
		if (class14 == null)
		    break;
		aClass131_Sub41_Sub13_5173 = class14.aClass131_Sub41_Sub13_148;
		aClass154_5188 = class14.aClass154_149;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("vc.<init>(" + (arg0 != null ? "{...}" : "null")
			    + ',' + (arg1 != null ? "{...}" : "null") + ','
			    + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ','
			    + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ','
			    + arg10 + ',' + arg11 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class14 method314(byte arg0, int arg1, Class130 arg2,
			     boolean arg3) {
	try {
	    anInt5183++;
	    Class187 class187 = Class55.method612(aShort5178 & 0xffff, -18);
	    if (arg0 != 121)
		method314((byte) 80, 36, null, false);
	    Class68 class68;
	    Class68 class68_38_;
	    if (aBoolean5171) {
		class68_38_ = Class131_Sub2_Sub37.aClass68Array6057[0];
		class68 = Class85.aClass68Array1116[aByte5181];
	    } else {
		class68 = Class131_Sub2_Sub37.aClass68Array6057[aByte5181];
		if ((aByte5181 ^ 0xffffffff) > -4)
		    class68_38_
			= Class131_Sub2_Sub37.aClass68Array6057[1 + aByte5181];
		else
		    class68_38_ = null;
	    }
	    return class187.method2569(aByte5180, arg2, class68, aByte5193,
				       anInt3714, anInt3711, anInt3708, arg1,
				       class68_38_, arg0 ^ 0x1, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.W(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public Class154 method18(byte arg0, int arg1, Class130 arg2) {
	try {
	    anInt5166++;
	    int i = -24 % ((arg0 - -32) / 61);
	    return method315(0, arg2, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.T(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method23(byte arg0) {
	try {
	    if (arg0 >= -110)
		method312(null, -108, null, null, null, null, 51, 25, null,
			  120, 86, null, -16, 23);
	    anInt5168++;
	    return aShort5178 & 0xffff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vc.S(" + arg0 + ')');
	}
    }
    
    public Class154 method315(int arg0, Class130 arg1, int arg2) {
	try {
	    anInt5179++;
	    if (arg0 != 0)
		return null;
	    if (aClass154_5188 != null
		&& arg1.method1208(aClass154_5188.method2253(), arg2) == 0)
		return aClass154_5188;
	    Class14 class14 = method314((byte) 121, arg2, arg1, false);
	    if (class14 != null)
		return class14.aClass154_149;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.BA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method20(Class130 arg0, boolean arg1) {
	anInt5187++;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5173 == null && aBoolean5190) {
	    Class14 class14 = method314((byte) 121, 131072, arg0, true);
	    class131_sub41_sub13
		= class14 == null ? null : class14.aClass131_Sub41_Sub13_148;
	} else {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5173;
	    aClass131_Sub41_Sub13_5173 = null;
	}
	if (class131_sub41_sub13 != null)
	    Class131_Sub41_Sub5.method1956(class131_sub41_sub13, aByte5181,
					   anInt3711, anInt3714, null);
	if (arg1 != false)
	    aBoolean5191 = false;
    }
    
    public boolean method19(byte arg0) {
	try {
	    if (arg0 < 102)
		return false;
	    anInt5172++;
	    return aBoolean5190;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vc.K(" + arg0 + ')');
	}
    }
    
    public int method310(int arg0) {
	try {
	    int i = -16 / ((arg0 - 39) / 50);
	    anInt5165++;
	    if (aClass154_5188 != null)
		return aClass154_5188.method2256();
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vc.R(" + arg0 + ')');
	}
    }
    
    public int method24(byte arg0) {
	try {
	    anInt5189++;
	    if (arg0 != -68)
		aBoolean5171 = false;
	    return aByte5193;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vc.L(" + arg0 + ')');
	}
    }
    
    public int method21(int arg0) {
	try {
	    anInt5192++;
	    if (arg0 != -22056)
		return 74;
	    return aByte5180;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vc.O(" + arg0 + ')');
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt5185++;
	    Class154 class154 = method315(0, arg1, 65536);
	    if (class154 != null) {
		Class9 class9 = arg1.method1238();
		class9.method181(anInt3711, anInt3708, anInt3714);
		return class154.method2278(arg2, arg0, class9, false);
	    }
	    if (arg3 < 12)
		aBoolean5171 = true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vc.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method22(int arg0, Class130 arg1) {
	if (arg0 != 25510)
	    method21(-44);
	anInt5184++;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5173 != null || !aBoolean5190) {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5173;
	    aClass131_Sub41_Sub13_5173 = null;
	} else {
	    Class14 class14 = method314((byte) 121, 131072, arg1, true);
	    class131_sub41_sub13
		= class14 != null ? class14.aClass131_Sub41_Sub13_148 : null;
	}
	if (class131_sub41_sub13 != null)
	    Class101.method884(class131_sub41_sub13, aByte5181, anInt3711,
			       anInt3714, null);
    }
    
    public void method294(Class130 arg0, int arg1) {
	anInt5170++;
	if (arg1 != 0)
	    aString5186 = null;
    }
    
    public static void method316(boolean arg0) {
	aString5186 = null;
	aString5195 = null;
	anIntArray5167 = null;
	if (arg0 != true)
	    method316(true);
    }
    
    static {
	anInt5169 = 0;
	aString5186 = null;
	aBoolean5191 = false;
	aString5195 = "Drop";
    }
}
