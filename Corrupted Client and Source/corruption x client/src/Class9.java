/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class9
{
    public static int[][] anIntArrayArray108
	= { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 },
	    { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
	    { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 },
	    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
	    { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    public static Class131_Sub21 aClass131_Sub21_109;
    public static int anInt110;
    public static Applet_Sub1 anApplet_Sub1_111 = null;
    public static boolean[] aBooleanArray112 = new boolean[8];
    public static int anInt113;
    public static int anInt114;
    public static int anInt115;
    public static int anInt116;
    public static int[] anIntArray117 = { 1, 2, 4, 8 };
    public static int anInt118;
    public static int anInt119;
    public static int anInt120;
    
    public abstract void method174(int i, int i_0_, int i_1_);
    
    public abstract void method175(int i);
    
    public static Object method176(byte[] arg0, boolean arg1, byte arg2) {
	try {
	    anInt110++;
	    if (arg2 < 113)
		method183(31, 85, 105, 38, -12, 85, -22, 6, 16, -14, 100,
			  null);
	    if (arg0 == null)
		return null;
	    if (arg0.length > 136 && !Class131_Sub2_Sub10.aBoolean5702) {
		try {
		    Class197 class197
			= ((Class197)
			   Class.forName("Class197_Sub1").newInstance());
		    class197.method2676(arg0, 102);
		    return class197;
		} catch (Throwable throwable) {
		    Class131_Sub2_Sub10.aBoolean5702 = true;
		}
	    }
	    if (!arg1)
		return arg0;
	    return Class131_Sub42.method2089(arg0, (byte) -125);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ao.J("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public abstract void method177(int i);
    
    public abstract void method178(int i);
    
    public abstract void method179(int i);
    
    public abstract void method180(Class9 class9_2_);
    
    public abstract void method181(int i, int i_3_, int i_4_);
    
    public static boolean method182(byte arg0) {
	try {
	    anInt119++;
	    int i = 25 / ((76 - arg0) / 41);
	    if (Stream.anInt4299 == 0)
		return Class131_Sub9.aBoolean4213;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ao.T(" + arg0 + ')');
	}
    }
    
    public static boolean method183
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, Class19 arg11) { //route find
	try {
	    anInt116++;
	    if (arg10 != -1)
		method185(-32, 33, 27);
	    int i = arg9;
	    int i_5_ = arg6;
	    int i_6_ = 64;
	    int i_7_ = 64;
	    int i_8_ = arg9 - i_6_;
	    int i_9_ = arg6 + -i_7_;
	    client.anIntArrayArray3487[i_6_][i_7_] = 99;
	    Class131_Sub2_Sub20.anIntArrayArray5837[i_6_][i_7_] = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    Class183.anIntArray2615[i_10_] = i;
	    Class116.anIntArray1490[i_10_++] = i_5_;
	    int[][] is = arg11.clipping;
	while_67_:
	    while ((i_11_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff)) {
		i_5_ = Class116.anIntArray1490[i_11_];
		i = Class183.anIntArray2615[i_11_];
		i_11_ = 1 + i_11_ & 0xfff;
		i_6_ = -i_8_ + i;
		i_7_ = -i_9_ + i_5_;
		int i_12_ = -arg11.anInt206 + i;
		int i_13_ = i_5_ - arg11.anInt218;
		int i_14_ = arg5;
	    while_59_:
		do {
		while_58_:
		    do {
		    while_57_:
			do {
			while_56_:
			    do {
				do {
				    if (i_14_ != -4) {
					if ((i_14_ ^ 0xffffffff) != 2) {
					    if (i_14_ != -2) {
						if ((i_14_ ^ 0xffffffff)
						    != 0) {
						    if (i_14_ == 0
							|| (i_14_
							    ^ 0xffffffff) == -2
							|| (i_14_
							    ^ 0xffffffff) == -3
							|| i_14_ == 3
							|| ((i_14_
							     ^ 0xffffffff)
							    == -10))
							break while_57_;
						    break while_58_;
						}
					    } else
						break;
					    break while_56_;
					}
				    } else {
					if (((arg8 ^ 0xffffffff)
					     == (i ^ 0xffffffff))
					    && arg3 == i_5_) {
					    Class131_Sub41_Sub13.anInt6330 = i;
					    Class75.anInt1022 = i_5_;
					    return true;
					}
					break while_59_;
				    }
				    if (Class138.method2120(i_5_, arg8, i,
							    arg10 + -11092,
							    arg0, arg1, arg1,
							    arg2, arg3)) {
					Class75.anInt1022 = i_5_;
					Class131_Sub41_Sub13.anInt6330 = i;
					return true;
				    }
				    break while_59_;
				} while (false);
				if (arg11.method242(arg8, arg1, arg10 + -87,
						    arg7, i_5_, i, arg2, arg3,
						    arg0, arg1)) {
				    Class131_Sub41_Sub13.anInt6330 = i;
				    Class75.anInt1022 = i_5_;
				    return true;
				}
				break while_59_;
			    } while (false);
			    if (arg11.method238(i, arg0, arg3, false, arg7,
						i_5_, arg1, arg2, arg8)) {
				Class75.anInt1022 = i_5_;
				Class131_Sub41_Sub13.anInt6330 = i;
				return true;
			    }
			    break while_59_;
			} while (false);
			if (arg11.method250(arg3, arg1, arg4, arg8, arg5,
					    (byte) 101, i, i_5_)) {
			    Class75.anInt1022 = i_5_;
			    Class131_Sub41_Sub13.anInt6330 = i;
			    return true;
			}
			break while_59_;
		    } while (false);
		    if (arg11.method248(i_5_, arg4, arg1, arg5, arg3,
					arg10 ^ ~0x47, arg8, i)) {
			Class131_Sub41_Sub13.anInt6330 = i;
			Class75.anInt1022 = i_5_;
			return true;
		    }
		} while (false);
		i_14_
		    = 1 + Class131_Sub2_Sub20.anIntArrayArray5837[i_6_][i_7_];
	    while_60_:
		do {
		    if ((i_6_ ^ 0xffffffff) < -1
			&& client.anIntArrayArray3487[i_6_ - 1][i_7_] == 0
			&& ((is[-1 + i_12_][i_13_] & 0x43a40000 ^ 0xffffffff)
			    == -1)
			&& ((is[i_12_ - 1][arg1 + i_13_ + -1] & 0x4e240000)
			    == 0)) {
			for (int i_15_ = 1;
			     (arg1 - 1 ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
			     i_15_++) {
			    if ((0x4fa40000 & is[-1 + i_12_][i_13_ - -i_15_])
				!= 0)
				break while_60_;
			}
			Class183.anIntArray2615[i_10_] = i + -1;
			Class116.anIntArray1490[i_10_] = i_5_;
			i_10_ = i_10_ - -1 & 0xfff;
			client.anIntArrayArray3487[i_6_ - 1][i_7_] = 2;
			Class131_Sub2_Sub20.anIntArrayArray5837[i_6_ - 1][i_7_]
			    = i_14_;
		    }
		} while (false);
	    while_61_:
		do {
		    if (-arg1 + 128 > i_6_
			&& client.anIntArrayArray3487[i_6_ + 1][i_7_] == 0
			&& ((is[arg1 + i_12_][i_13_] & 0x60e40000 ^ 0xffffffff)
			    == -1)
			&& (0x78240000 & is[i_12_ - -arg1][-1 + i_13_ - -arg1]
			    ^ 0xffffffff) == -1) {
			for (int i_16_ = 1;
			     (i_16_ ^ 0xffffffff) > (-1 + arg1 ^ 0xffffffff);
			     i_16_++) {
			    if ((0x78e40000 & is[arg1 + i_12_][i_16_ + i_13_]
				 ^ 0xffffffff)
				!= -1)
				break while_61_;
			}
			Class183.anIntArray2615[i_10_] = i - -1;
			Class116.anIntArray1490[i_10_] = i_5_;
			client.anIntArrayArray3487[1 + i_6_][i_7_] = 8;
			i_10_ = i_10_ + 1 & 0xfff;
			Class131_Sub2_Sub20.anIntArrayArray5837[1 + i_6_][i_7_]
			    = i_14_;
		    }
		} while (false);
	    while_62_:
		do {
		    if ((i_7_ ^ 0xffffffff) < -1
			&& client.anIntArrayArray3487[i_6_][i_7_ - 1] == 0
			&& (is[i_12_][i_13_ + -1] & 0x43a40000) == 0
			&& (0x60e40000 & is[-1 + (i_12_ - -arg1)][-1 + i_13_]
			    ^ 0xffffffff) == -1) {
			for (int i_17_ = 1; i_17_ < -1 + arg1; i_17_++) {
			    if ((is[i_17_ + i_12_][-1 + i_13_] & 0x63e40000
				 ^ 0xffffffff)
				!= -1)
				break while_62_;
			}
			Class183.anIntArray2615[i_10_] = i;
			Class116.anIntArray1490[i_10_] = i_5_ + -1;
			client.anIntArrayArray3487[i_6_][i_7_ + -1] = 1;
			i_10_ = 0xfff & 1 + i_10_;
			Class131_Sub2_Sub20.anIntArrayArray5837[i_6_][(i_7_
								       + -1)]
			    = i_14_;
		    }
		} while (false);
	    while_63_:
		do {
		    if ((128 + -arg1 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)
			&& client.anIntArrayArray3487[i_6_][1 + i_7_] == 0
			&& ((is[i_12_][arg1 + i_13_] & 0x4e240000 ^ 0xffffffff)
			    == -1)
			&& (0x78240000
			    & is[-1 + (i_12_ - -arg1)][arg1 + i_13_]) == 0) {
			for (int i_18_ = 1;
			     (i_18_ ^ 0xffffffff) > (arg1 - 1 ^ 0xffffffff);
			     i_18_++) {
			    if ((0x7e240000 & is[i_12_ + i_18_][i_13_ - -arg1])
				!= 0)
				break while_63_;
			}
			Class183.anIntArray2615[i_10_] = i;
			Class116.anIntArray1490[i_10_] = i_5_ + 1;
			client.anIntArrayArray3487[i_6_][i_7_ + 1] = 4;
			i_10_ = 1 + i_10_ & 0xfff;
			Class131_Sub2_Sub20.anIntArrayArray5837[i_6_][(i_7_
								       - -1)]
			    = i_14_;
		    }
		} while (false);
	    while_64_:
		do {
		    if ((i_6_ ^ 0xffffffff) < -1 && i_7_ > 0
			&& client.anIntArrayArray3487[i_6_ - 1][-1 + i_7_] == 0
			&& (is[i_12_ - 1][-1 + i_13_] & 0x43a40000) == 0) {
			for (int i_19_ = 1;
			     (arg1 ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
			     i_19_++) {
			    if ((0x4fa40000 & is[i_12_ + -1][i_19_ + (-1
								      + i_13_)]
				 ^ 0xffffffff) != -1
				|| (0x63e40000
				    & is[i_19_ + -1 + i_12_][i_13_ + -1]) != 0)
				break while_64_;
			}
			Class183.anIntArray2615[i_10_] = i + -1;
			Class116.anIntArray1490[i_10_] = i_5_ - 1;
			client.anIntArrayArray3487[i_6_ + -1][i_7_ + -1] = 3;
			i_10_ = 0xfff & 1 + i_10_;
			Class131_Sub2_Sub20.anIntArrayArray5837[i_6_ - 1]
			    [-1 + i_7_]
			    = i_14_;
		    }
		} while (false);
	    while_65_:
		do {
		    if (i_6_ < 128 + -arg1 && i_7_ > 0
			&& (client.anIntArrayArray3487[i_6_ - -1][i_7_ + -1]
			    == 0)
			&& (is[arg1 + i_12_][-1 + i_13_] & 0x60e40000) == 0) {
			for (int i_20_ = 1;
			     (i_20_ ^ 0xffffffff) > (arg1 ^ 0xffffffff);
			     i_20_++) {
			    if ((0x78e40000
				 & is[i_12_ - -arg1][i_20_ + i_13_ - 1]) != 0
				|| (0x63e40000
				    & is[i_12_ + i_20_][i_13_ + -1]) != 0)
				break while_65_;
			}
			Class183.anIntArray2615[i_10_] = 1 + i;
			Class116.anIntArray1490[i_10_] = i_5_ - 1;
			client.anIntArrayArray3487[i_6_ - -1][i_7_ - 1] = 9;
			i_10_ = 0xfff & i_10_ - -1;
			Class131_Sub2_Sub20.anIntArrayArray5837[i_6_ + 1]
			    [-1 + i_7_]
			    = i_14_;
		    }
		} while (false);
	    while_66_:
		do {
		    if (i_6_ > 0
			&& (-arg1 + 128 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)
			&& client.anIntArrayArray3487[-1 + i_6_][1 + i_7_] == 0
			&& (0x4e240000 & is[i_12_ + -1][arg1 + i_13_]) == 0) {
			for (int i_21_ = 1;
			     (i_21_ ^ 0xffffffff) > (arg1 ^ 0xffffffff);
			     i_21_++) {
			    if (((0x4fa40000 & is[-1 + i_12_][i_21_ + i_13_])
				 != 0)
				|| ((is[i_21_ + i_12_ - 1][arg1 + i_13_]
				     & 0x7e240000)
				    ^ 0xffffffff) != -1)
				break while_66_;
			}
			Class183.anIntArray2615[i_10_] = i - 1;
			Class116.anIntArray1490[i_10_] = i_5_ - -1;
			client.anIntArrayArray3487[i_6_ - 1][1 + i_7_] = 6;
			i_10_ = 0xfff & 1 + i_10_;
			Class131_Sub2_Sub20.anIntArrayArray5837[-1 + i_6_]
			    [1 + i_7_]
			    = i_14_;
		    }
		} while (false);
		if (128 - arg1 > i_6_
		    && (i_7_ ^ 0xffffffff) > (128 + -arg1 ^ 0xffffffff)
		    && (client.anIntArrayArray3487[1 + i_6_][i_7_ - -1]
			^ 0xffffffff) == -1
		    && (0x78240000 & is[arg1 + i_12_][i_13_ + arg1]) == 0) {
		    for (int i_22_ = 1;
			 (i_22_ ^ 0xffffffff) > (arg1 ^ 0xffffffff); i_22_++) {
			if (((0x7e240000 & is[i_12_ - -i_22_][arg1 + i_13_])
			     != 0)
			    || ((is[i_12_ + arg1][i_22_ + i_13_] & 0x78e40000)
				!= 0))
			    continue while_67_;
		    }
		    Class183.anIntArray2615[i_10_] = i - -1;
		    Class116.anIntArray1490[i_10_] = 1 + i_5_;
		    client.anIntArrayArray3487[1 + i_6_][1 + i_7_] = 12;
		    i_10_ = i_10_ + 1 & 0xfff;
		    Class131_Sub2_Sub20.anIntArrayArray5837[1 + i_6_][(i_7_
								       - -1)]
			= i_14_;
		}
	    }
	    Class75.anInt1022 = i_5_;
	    Class131_Sub41_Sub13.anInt6330 = i;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ao.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ','
						 + (arg11 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method184(byte arg0) {
	try {
	    anIntArray117 = null;
	    aClass131_Sub21_109 = null;
	    aBooleanArray112 = null;
	    if (arg0 == 41)
		anIntArrayArray108 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ao.E(" + arg0 + ')');
	}
    }
    
    public static void method185(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != 4095)
		method183(-60, 77, -112, 61, -8, 7, 66, -37, -73, 36, -49,
			  null);
	    anInt113++;
	    if (Class126.method1108((byte) -92, arg0))
		Class131_Sub41_Sub4.method1938((Class131_Sub2_Sub9
						.aClass173ArrayArray5684
						[arg0]),
					       true, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ao.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public abstract void method186(int i, int i_23_, int i_24_, int[] is);
    
    public static void method187(int arg0) {
	try {
	    anInt114++;
	    Class131_Sub41_Sub3 class131_sub41_sub3
		= ((Class131_Sub41_Sub3)
		   Class131_Sub2_Sub9.aClass119_5676.method1007(0));
	    if (arg0 != -1)
		method176(null, true, (byte) 125);
	    for (/**/; class131_sub41_sub3 != null;
		 class131_sub41_sub3
		     = ((Class131_Sub41_Sub3)
			Class131_Sub2_Sub9.aClass119_5676.method1014(0))) {
		Class23_Sub4_Sub4 class23_sub4_sub4
		    = class131_sub41_sub3.aClass23_Sub4_Sub4_6192;
		if (class23_sub4_sub4.aByte3740 != Class29.anInt300
		    || class23_sub4_sub4.aBoolean5405) {
		    class131_sub41_sub3.method1355((byte) 116);
		    class23_sub4_sub4.method380((byte) -66);
		} else if (Class125.anInt1632 >= class23_sub4_sub4.anInt5407) {
		    class23_sub4_sub4.method386(Class42.anInt563, (byte) 64);
		    if (class23_sub4_sub4.aBoolean5405)
			class131_sub41_sub3.method1355((byte) 115);
		    else
			Class131_Sub23.method1823(class23_sub4_sub4, true);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ao.P(" + arg0 + ')');
	}
    }
    
    public abstract void method188(int i, int i_25_, int i_26_, int i_27_,
				   int i_28_, int i_29_);
    
    public abstract void method189();
    
    public abstract void method190(int[] is);
    
    public static void method191(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    if (arg4 == 12) {
		for (int i = arg5; i <= arg0; i++)
		    Class131_Sub3.method1650(arg2,
					     Class56.anIntArrayArray740[i],
					     arg3, arg1, 58);
		anInt118++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ao.Q(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public abstract void method192(int i);
    
    public static void method193(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    anInt115++;
	    int i = arg5 + arg2;
	    int i_30_ = arg3 - arg2;
	    for (int i_31_ = arg5; (i_31_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_31_++)
		Class131_Sub3.method1650(arg6,
					 Class56.anIntArrayArray740[i_31_],
					 arg1, arg4, 59);
	    int i_32_ = -arg2 + arg6;
	    for (int i_33_ = arg3; i_33_ > i_30_; i_33_--)
		Class131_Sub3.method1650(arg6,
					 Class56.anIntArrayArray740[i_33_],
					 arg1, arg4, 87);
	    if (arg0 == -1) {
		int i_34_ = arg4 - -arg2;
		for (int i_35_ = i; i_30_ >= i_35_; i_35_++) {
		    int[] is = Class56.anIntArrayArray740[i_35_];
		    Class131_Sub3.method1650(i_34_, is, arg1, arg4,
					     arg0 + 119);
		    Class131_Sub3.method1650(arg6, is, arg1, i_32_, 79);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ao.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
}
