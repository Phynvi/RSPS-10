/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class171
{
    public static String aString2277;
    public static int anInt2278;
    public static int anInt2279;
    public static int anInt2280;
    public static int anInt2281;
    public static int anInt2282;
    public static int anInt2283;
    public static int anInt2284 = 1;
    public int anInt2285;
    public int anInt2286;
    public static int anInt2287;
    public static int anInt2288;
    
    public int method2441(byte arg0) {
	try {
	    anInt2278++;
	    int i = -21 / ((arg0 - 63) / 63);
	    return anInt2285 & 0x3fff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rl.C(" + arg0 + ')');
	}
    }
    
    public boolean method2442(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt2279++;
	    int i = anInt2286;
	    if (arg1 == anInt2285 && anInt2286 == 0)
		return false;
	    boolean bool;
	    if ((anInt2286 ^ 0xffffffff) != -1) {
		if ((anInt2286 ^ 0xffffffff) >= -1
		    || (anInt2285 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)) {
		    if (anInt2286 >= 0 || arg1 >= anInt2285)
			bool = false;
		    else {
			int i_0_ = anInt2286 * anInt2286 / (arg3 * 2);
			int i_1_ = -i_0_ + anInt2285;
			if ((i_1_ ^ 0xffffffff) < (arg1 ^ 0xffffffff)
			    && (anInt2285 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
			    bool = true;
			else
			    bool = false;
		    }
		} else {
		    int i_2_ = anInt2286 * anInt2286 / (2 * arg3);
		    int i_3_ = anInt2285 - -i_2_;
		    if ((i_3_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
			|| anInt2285 > i_3_)
			bool = false;
		    else
			bool = true;
		}
	    } else {
		if (((arg1 ^ 0xffffffff) < (anInt2285 ^ 0xffffffff)
		     && (arg3 + anInt2285 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
		    || ((anInt2285 ^ 0xffffffff) < (arg1 ^ 0xffffffff)
			&& ((-arg3 + anInt2285 ^ 0xffffffff)
			    >= (arg1 ^ 0xffffffff)))) {
		    anInt2285 = arg1;
		    return false;
		}
		bool = true;
	    }
	    if (!bool) {
		if ((anInt2286 ^ 0xffffffff) < -1) {
		    anInt2286 -= arg3;
		    if ((anInt2286 ^ 0xffffffff) > -1)
			anInt2286 = 0;
		} else {
		    anInt2286 += arg3;
		    if (anInt2286 > 0)
			anInt2286 = 0;
		}
	    } else {
		if ((anInt2285 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)) {
		    anInt2286 -= arg3;
		    if ((arg2 ^ 0xffffffff) != -1 && -arg2 > anInt2286)
			anInt2286 = -arg2;
		} else {
		    anInt2286 += arg3;
		    if (arg2 != 0 && anInt2286 > arg2)
			anInt2286 = arg2;
		}
		if ((anInt2286 ^ 0xffffffff) != (i ^ 0xffffffff)) {
		    int i_4_ = anInt2286 * anInt2286 / (2 * arg3);
		    if ((anInt2285 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)) {
			if (anInt2285 > arg1 && anInt2285 + -i_4_ < arg1)
			    anInt2286 = i;
		    } else if (arg1 < anInt2285 - -i_4_)
			anInt2286 = i;
		}
	    }
	    anInt2285 += i + anInt2286 >> 765199681;
	    if (arg0 != 1)
		return false;
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rl.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method2443(boolean arg0, Class173[] arg1, int arg2,
				  int arg3, int arg4, int arg5) {
	try {
	    if (arg2 >= -23)
		method2444(-86);
	    for (int i = 0; (arg1.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class173 class173 = arg1[i];
		if (class173 != null && arg5 == class173.anInt2456) {
		    PacketStream.method1792(255, arg4, arg3, arg0,
						   class173);
		    Class181.method2532(arg3, true, arg4, class173);
		    if (class173.anInt2427
			> -class173.anInt2411 + class173.anInt2444)
			class173.anInt2427
			    = -class173.anInt2411 + class173.anInt2444;
		    if ((class173.anInt2427 ^ 0xffffffff) > -1)
			class173.anInt2427 = 0;
		    if (-class173.anInt2437 + class173.anInt2479
			< class173.anInt2415)
			class173.anInt2415
			    = class173.anInt2479 - class173.anInt2437;
		    if (class173.anInt2415 < 0)
			class173.anInt2415 = 0;
		    if ((class173.anInt2470 ^ 0xffffffff) == -1)
			Class89.method838(91, class173, arg0);
		}
	    }
	    anInt2282++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rl.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method2444(int arg0) {
	try {
	    if (arg0 != 30262)
		method2444(-8);
	    aString2277 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rl.G(" + arg0 + ')');
	}
    }
    
    public void method2445(int arg0) {
	try {
	    if (arg0 == 128) {
		anInt2288++;
		anInt2285 &= 0x3fff;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rl.H(" + arg0 + ')');
	}
    }
    
    public void method2446(boolean arg0, int arg1) {
	try {
	    if (arg0 != true)
		method2446(false, 50);
	    anInt2287++;
	    anInt2285 = arg1;
	    anInt2286 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rl.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2447(int arg0) {
	try {
	    anInt2281++;
	    if (arg0 == (Class75.anInt1024 ^ 0xffffffff))
		Class75.anInt1024 = 6;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rl.E(" + arg0 + ')');
	}
    }
    
    public static void method2448
	(int arg0, int[][] arg1, byte[][] arg2, Class68 arg3, Class68 arg4,
	 int arg5, int arg6, byte[][] arg7, byte[][] arg8, Class130 arg9,
	 int arg10, byte[][] arg11, boolean arg12) {
	try {
	    for (int i = 0; arg0 > i; i++) {
		int i_5_ = -1 + arg0 <= i ? i : 1 + i;
		for (int i_6_ = 0; (arg5 ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		     i_6_++) {
		    int i_7_ = ((i_6_ ^ 0xffffffff) <= (arg5 - 1 ^ 0xffffffff)
				? i_6_ : 1 + i_6_);
		    if (Class9.method182((byte) -103)
			|| Class45.method561(i, true, i_6_, arg10,
					     Class1_Sub8.anInt3600)) {
			boolean bool = false;
			boolean bool_8_ = false;
			boolean[] bools = new boolean[4];
			byte i_9_ = arg2[i][i_6_];
			int i_10_ = arg8[i][i_6_];
			int i_11_ = arg7[i][i_6_] & 0xff;
			int i_12_ = 0xff & arg11[i][i_6_];
			int i_13_ = 0xff & arg11[i][i_7_];
			int i_14_ = 0xff & arg11[i_5_][i_7_];
			int i_15_ = arg11[i_5_][i_6_] & 0xff;
			if ((i_11_ ^ 0xffffffff) != -1 || i_12_ != 0) {
			    Class189 class189
				= ((i_11_ ^ 0xffffffff) != -1
				   ? Class187.method2570(false, -1 + i_11_)
				   : null);
			    if ((i_9_ ^ 0xffffffff) == -1 && class189 == null)
				i_9_ = (byte) 12;
			    Class108 class108
				= (i_12_ == 0 ? null
				   : Class186.method2561(-114, i_12_ - 1));
			    Class189 class189_16_ = class189;
			    if (class189 != null) {
				if (class189.anInt2766 != -1
				    || class189.anInt2776 != -1) {
				    if (class108 != null && i_9_ != 0)
					bool_8_ = class189.aBoolean2775;
				} else {
				    class189_16_ = class189;
				    class189 = null;
				}
			    }
			    if (((i_9_ ^ 0xffffffff) == -1 || i_9_ == 12)
				&& (i ^ 0xffffffff) < -1 && i_6_ > 0
				&& i < arg0 && i_6_ < arg5) {
				int i_17_ = 0;
				int i_18_ = 0;
				int i_19_ = 0;
				i_19_ = i_19_ + (((arg11[i_5_][i_7_]
						   ^ 0xffffffff)
						  != (i_12_ ^ 0xffffffff))
						 ? -1 : 1);
				i_18_
				    = i_18_ + (i_12_ == arg11[i_5_][-1 + i_6_]
					       ? 1 : -1);
				i_17_ = i_17_ + (((arg11[-1 + i][-1 + i_6_]
						   ^ 0xffffffff)
						  == (i_12_ ^ 0xffffffff))
						 ? 1 : -1);
				int i_20_ = 0;
				i_20_ = i_20_ + (((i_12_ ^ 0xffffffff)
						  == (arg11[i - 1][i_7_]
						      ^ 0xffffffff))
						 ? 1 : -1);
				if (i_12_ == arg11[i][i_6_ - 1]) {
				    i_18_++;
				    i_17_++;
				} else {
				    i_18_--;
				    i_17_--;
				}
				if (arg11[i_5_][i_6_] != i_12_) {
				    i_19_--;
				    i_18_--;
				} else {
				    i_19_++;
				    i_18_++;
				}
				if (arg11[i][i_7_] != i_12_) {
				    i_19_--;
				    i_20_--;
				} else {
				    i_20_++;
				    i_19_++;
				}
				if (arg11[i + -1][i_6_] != i_12_) {
				    i_17_--;
				    i_20_--;
				} else {
				    i_17_++;
				    i_20_++;
				}
				int i_21_ = -i_19_ + i_17_;
				if ((i_21_ ^ 0xffffffff) > -1)
				    i_21_ = -i_21_;
				int i_22_ = i_18_ + -i_20_;
				if (i_22_ < 0)
				    i_22_ = -i_22_;
				if ((i_22_ ^ 0xffffffff)
				    == (i_21_ ^ 0xffffffff)) {
				    i_21_ = (arg3.method712(i, i_6_)
					     - arg3.method712(i_5_, i_7_));
				    i_22_ = (arg3.method712(i_5_, i_6_)
					     - arg3.method712(i, i_7_));
				    if (i_21_ < 0)
					i_21_ = -i_21_;
				    if ((i_22_ ^ 0xffffffff) > -1)
					i_22_ = -i_22_;
				}
				i_10_ = i_22_ <= i_21_ ? 0 : 1;
			    }
			    for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -14;
				 i_23_++) {
				Class23_Sub4_Sub2.anIntArray5358[i_23_] = -1;
				Class210.anIntArray3064[i_23_] = 1;
			    }
			    boolean[] bools_24_
				= (class189 != null && class189.aBoolean2775
				   ? Class45.aBooleanArrayArray625[i_9_]
				   : Class69.aBooleanArrayArray931[i_9_]);
			    Class23_Sub2_Sub2.method312(arg2, i_9_, arg9,
							bools, class189, arg7,
							i_10_, arg5, arg8,
							i_6_, arg0, class108,
							1, i);
			    boolean bool_25_
				= (class189 != null
				   && ((class189.anInt2766 ^ 0xffffffff)
				       != (class189.anInt2776 ^ 0xffffffff)));
			    if (!bool_25_) {
				for (int i_26_ = 0; i_26_ < 8; i_26_++) {
				    if ((Class23_Sub4_Sub2.anIntArray5358
					 [i_26_]) >= 0
					&& (((Class110_Sub1.anIntArray3899
					      [i_26_])
					     ^ 0xffffffff)
					    != ((Class131_Sub18.anIntArray4390
						 [i_26_])
						^ 0xffffffff))) {
					bool_25_ = true;
					break;
				    }
				}
			    }
			    if (!bools_24_[1 - -i_10_ & 0x3])
				bools[1]
				    = (Class131_Sub41_Sub21.method2072
				       (bools[1],
					Class90.method841((Class210
							   .anIntArray3064[4]),
							  (Class210
							   .anIntArray3064
							   [2])) == 0));
			    if (!bools_24_[0x3 & 3 - -i_10_])
				bools[3]
				    = (Class131_Sub41_Sub21.method2072
				       (bools[3],
					(Class90.method841((Class210
							    .anIntArray3064
							    [0]),
							   (Class210
							    .anIntArray3064
							    [6]))
					 ^ 0xffffffff) == -1));
			    if (!bools_24_[i_10_ & 0x3])
				bools[0]
				    = (Class131_Sub41_Sub21.method2072
				       (bools[0],
					Class90.method841((Class210
							   .anIntArray3064[2]),
							  (Class210
							   .anIntArray3064
							   [0])) == 0));
			    if (!bools_24_[2 + i_10_ & 0x3])
				bools[2]
				    = (Class131_Sub41_Sub21.method2072
				       (bools[2],
					(Class90.method841((Class210
							    .anIntArray3064
							    [4]),
							   (Class210
							    .anIntArray3064
							    [6]))
					 ^ 0xffffffff) == -1));
			    if (!bool_8_ && (i_9_ == 0 || i_9_ == 12)) {
				if (!bools[0] || bools[1] || bools[2]
				    || !bools[3]) {
				    if (bools[0] && bools[1] && !bools[2]
					&& !bools[3]) {
					i_9_ = ((i_9_ ^ 0xffffffff) != -1
						? (byte) 14 : (byte) 13);
					i_10_ = 3;
					bools[0] = bools[1] = false;
				    } else if (bools[0] || !bools[1]
					       || !bools[2] || bools[3]) {
					if (!bools[0] && !bools[1] && bools[2]
					    && bools[3]) {
					    i_9_ = (i_9_ == 0 ? (byte) 13
						    : (byte) 14);
					    i_10_ = 1;
					    bools[2] = bools[3] = false;
					}
				    } else {
					bools[1] = bools[2] = false;
					i_10_ = 2;
					i_9_ = ((i_9_ ^ 0xffffffff) == -1
						? (byte) 13 : (byte) 14);
				    }
				} else {
				    i_9_ = ((i_9_ ^ 0xffffffff) == -1
					    ? (byte) 13 : (byte) 14);
				    bools[0] = bools[3] = false;
				    i_10_ = 0;
				}
			    }
			    boolean bool_27_
				= (!bool_8_ && !bools[0] && !bools[2]
				   && !bools[1] && !bools[3]);
			    int[] is = null;
			    int[] is_28_;
			    int i_29_;
			    int[] is_30_;
			    int[] is_31_;
			    int i_32_;
			    if (!bool_27_) {
				if (!bool_8_) {
				    is_28_ = (Class131_Sub41_Sub21_Sub2
					      .anIntArrayArray6592[i_9_]);
				    i_29_ = (class189 != null
					     ? (Class131_Sub41_Sub9
						.anIntArray6283[i_9_])
					     : 0);
				    is_30_
					= Class187.anIntArrayArray2727[i_9_];
				    i_32_ = (class108 != null
					     ? (Class131_Sub1_Sub1
						.anIntArray5496[i_9_])
					     : 0);
				    is = Class31.anIntArrayArray443[i_9_];
				    is_31_ = (Class23_Sub4_Sub1_Sub2
					      .anIntArrayArray6532[i_9_]);
				} else {
				    i_29_ = (class189 != null
					     ? Class108.anIntArray1405[i_9_]
					     : 0);
				    is_28_ = Class63.anIntArrayArray802[i_9_];
				    is = (Class131_Sub2_Sub2
					  .anIntArrayArray5574[i_9_]);
				    i_32_
					= (class108 != null
					   ? Class37.anIntArray501[i_9_] : 0);
				    is_31_ = Class9.anIntArrayArray108[i_9_];
				    is_30_ = (Class131_Sub2_Sub32
					      .anIntArrayArray6012[i_9_]);
				}
			    } else {
				is_28_ = (Class131_Sub2_Sub5
					  .anIntArrayArray5611[i_9_]);
				i_29_ = (class189 == null ? 0
					 : Class211.anIntArray3086[i_9_]);
				is_30_ = (Class23_Sub5_Sub1.anIntArrayArray5043
					  [i_9_]);
				is_31_ = Class167.anIntArrayArray2234[i_9_];
				i_32_ = (class108 == null ? 0
					 : Class191.anIntArray2818[i_9_]);
			    }
			    int i_33_ = i_29_ + i_32_;
			    if ((i_33_ ^ 0xffffffff) >= -1)
				Class1_Sub2.method101(arg10, i, i_6_);
			    else {
				if (bools[0])
				    i_33_++;
				if (bools[2])
				    i_33_++;
				if (bools[1])
				    i_33_++;
				if (bools[3])
				    i_33_++;
				int i_34_ = 0;
				int i_35_ = 0;
				int i_36_ = i_33_ * 3;
				int[] is_37_ = arg12 ? new int[i_36_] : null;
				int[] is_38_
				    = bool_25_ ? new int[i_36_] : null;
				int[] is_39_ = new int[i_36_];
				int[] is_40_ = new int[i_36_];
				int[] is_41_ = new int[i_36_];
				int[] is_42_ = new int[i_36_];
				int[] is_43_ = new int[i_36_];
				int i_44_ = -1;
				int i_45_ = -1;
				int i_46_ = 256;
				if (class189 == null) {
				    if (bool_27_)
					i_34_ += Class211.anIntArray3086[i_9_];
				    else if (bool_8_)
					i_34_ += Class108.anIntArray1405[i_9_];
				    else
					i_34_ += (Class131_Sub41_Sub9
						  .anIntArray6283[i_9_]);
				} else {
				    i_44_ = class189.anInt2766;
				    i_45_ = (arg9.method1223()
					     ? class189.anInt2760
					     : class189.anInt2765);
				    i_46_ = class189.anInt2773;
				    int i_47_
					= Class121.method1038((byte) 50, arg9,
							      class189);
				    for (int i_48_ = 0; i_29_ > i_48_;
					 i_48_++) {
					boolean bool_49_ = false;
					int i_50_;
					if (bools[-i_10_ & 0x3]
					    && ((i_34_ ^ 0xffffffff)
						== (is[0] ^ 0xffffffff))) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 1;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 1;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					    i_50_ = 6;
					} else if (bools[-i_10_ + 2 & 0x3]
						   && i_34_ == is[2]) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 5;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 5;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    i_50_ = 6;
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					} else if (!bools[1 - i_10_ & 0x3]
						   || ((i_34_ ^ 0xffffffff)
						       != (is[1]
							   ^ 0xffffffff))) {
					    if (!bools[0x3 & -i_10_ + 3]
						|| ((is[3] ^ 0xffffffff)
						    != (i_34_ ^ 0xffffffff))) {
						Class131_Sub41_Sub13
						    .anIntArray6328[0]
						    = is_28_[i_34_];
						Class131_Sub41_Sub13
						    .anIntArray6328[1]
						    = is_30_[i_34_];
						i_50_ = 3;
						Class131_Sub41_Sub13
						    .anIntArray6328[2]
						    = is_31_[i_34_];
					    } else {
						Class131_Sub41_Sub13
						    .anIntArray6328[0]
						    = is_28_[i_34_];
						Class131_Sub41_Sub13
						    .anIntArray6328[1]
						    = 7;
						Class131_Sub41_Sub13
						    .anIntArray6328[2]
						    = is_31_[i_34_];
						Class131_Sub41_Sub13
						    .anIntArray6328[3]
						    = 7;
						Class131_Sub41_Sub13
						    .anIntArray6328[4]
						    = is_30_[i_34_];
						i_50_ = 6;
						Class131_Sub41_Sub13
						    .anIntArray6328[5]
						    = is_31_[i_34_];
					    }
					} else {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 3;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 3;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					    i_50_ = 6;
					}
					for (int i_51_ = 0; i_50_ > i_51_;
					     i_51_++) {
					    int i_52_
						= (Class131_Sub41_Sub13
						   .anIntArray6328[i_51_]);
					    int i_53_
						= -(i_10_ * 2) + i_52_ & 0x7;
					    int i_54_
						= (Class131_Sub2_Sub35
						   .anIntArray6043[i_52_]);
					    int i_55_
						= (Class121_Sub3_Sub1
						   .anIntArray5429[i_52_]);
					    if ((i_10_ ^ 0xffffffff) != -2) {
						if (i_10_ != 2) {
						    if (i_10_ != 3) {
							is_39_[i_35_] = i_54_;
							is_40_[i_35_] = i_55_;
						    } else {
							is_39_[i_35_]
							    = -i_55_ + 128;
							is_40_[i_35_] = i_54_;
						    }
						} else {
						    is_39_[i_35_]
							= 128 + -i_54_;
						    is_40_[i_35_]
							= 128 - i_55_;
						}
					    } else {
						is_39_[i_35_] = i_55_;
						is_40_[i_35_] = 128 + -i_54_;
					    }
					    if (arg12
						&& (Class46
						    .aBooleanArrayArray637
						    [i_9_][i_52_])) {
						int i_56_ = ((i << -1239497881)
							     + is_39_[i_35_]);
						int i_57_
						    = (is_40_[i_35_]
						       + (i_6_ << 1680680007));
						is_37_[i_35_]
						    = (arg4.method720(i_56_,
								      i_57_)
						       - (arg3.method720
							  (i_56_, i_57_)));
					    }
					    if (i_52_ < 8
						&& (class189.anInt2778
						    < (Class23_Sub4_Sub2
						       .anIntArray5358
						       [i_53_]))) {
						if (is_38_ != null)
						    is_38_[i_35_]
							= (Class131_Sub18
							   .anIntArray4390
							   [i_53_]);
						is_43_[i_35_]
						    = (Class131_Sub2_Sub11
						       .anIntArray5712[i_53_]);
						is_42_[i_35_]
						    = (Class92.anIntArray1203
						       [i_53_]);
						is_41_[i_35_]
						    = (Class110_Sub1
						       .anIntArray3899[i_53_]);
					    } else {
						if (is_38_ != null)
						    is_38_[i_35_] = i_47_;
						is_42_[i_35_]
						    = (!arg9.method1223()
						       ? class189.anInt2765
						       : class189.anInt2760);
						is_43_[i_35_]
						    = class189.anInt2773;
						is_41_[i_35_] = i_44_;
					    }
					    i_35_++;
					}
					i_34_++;
				    }
				    if (!arg12 && arg10 == 0)
					Class180.method2524(i, i_6_,
							    class189.anInt2777,
							    8 * (class189
								 .anInt2770));
				    if (i_9_ != 12
					&& ((class189.anInt2766 ^ 0xffffffff)
					    != 0)
					&& class189.aBoolean2774)
					bool = true;
				}
				if (class108 != null) {
				    if (i_15_ == 0)
					i_15_ = i_12_;
				    if ((i_13_ ^ 0xffffffff) == -1)
					i_13_ = i_12_;
				    if ((i_14_ ^ 0xffffffff) == -1)
					i_14_ = i_12_;
				    Class108 class108_58_
					= Class186.method2561(-124,
							      -1 + i_12_);
				    Class108 class108_59_
					= Class186.method2561(-128, i_13_ - 1);
				    Class108 class108_60_
					= Class186.method2561(-120,
							      -1 + i_14_);
				    Class108 class108_61_
					= Class186.method2561(-126,
							      -1 + i_15_);
				    for (int i_62_ = 0; i_62_ < i_32_;
					 i_62_++) {
					boolean bool_63_ = false;
					int i_64_;
					if (bools[-i_10_ & 0x3]
					    && i_34_ == is[0]) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 1;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 1;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					    i_64_ = 6;
					} else if (bools[0x3 & 2 + -i_10_]
						   && ((i_34_ ^ 0xffffffff)
						       == (is[2]
							   ^ 0xffffffff))) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 5;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 5;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					    i_64_ = 6;
					} else if (bools[0x3 & -i_10_ + 1]
						   && ((i_34_ ^ 0xffffffff)
						       == (is[1]
							   ^ 0xffffffff))) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 3;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 3;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    i_64_ = 6;
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					} else if (!bools[3 - i_10_ & 0x3]
						   || i_34_ != is[3]) {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= is_30_[i_34_];
					    i_64_ = 3;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					} else {
					    Class131_Sub41_Sub13
						.anIntArray6328[0]
						= is_28_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[1]
						= 7;
					    Class131_Sub41_Sub13
						.anIntArray6328[2]
						= is_31_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[3]
						= 7;
					    Class131_Sub41_Sub13
						.anIntArray6328[4]
						= is_30_[i_34_];
					    Class131_Sub41_Sub13
						.anIntArray6328[5]
						= is_31_[i_34_];
					    i_64_ = 6;
					}
					for (int i_65_ = 0;
					     ((i_65_ ^ 0xffffffff)
					      > (i_64_ ^ 0xffffffff));
					     i_65_++) {
					    int i_66_
						= (Class131_Sub41_Sub13
						   .anIntArray6328[i_65_]);
					    int i_67_
						= -(2 * i_10_) + i_66_ & 0x7;
					    int i_68_
						= (Class131_Sub2_Sub35
						   .anIntArray6043[i_66_]);
					    int i_69_
						= (Class121_Sub3_Sub1
						   .anIntArray5429[i_66_]);
					    int i_70_;
					    int i_71_;
					    if ((i_10_ ^ 0xffffffff) != -2) {
						if (i_10_ == 2) {
						    i_71_ = -i_68_ + 128;
						    i_70_ = 128 + -i_69_;
						} else if (i_10_ != 3) {
						    i_71_ = i_68_;
						    i_70_ = i_69_;
						} else {
						    i_71_ = -i_69_ + 128;
						    i_70_ = i_68_;
						}
					    } else {
						i_70_ = -i_68_ + 128;
						i_71_ = i_69_;
					    }
					    is_39_[i_35_] = i_71_;
					    is_40_[i_35_] = i_70_;
					    if (arg12
						&& (Class46
						    .aBooleanArrayArray637
						    [i_9_][i_66_])) {
						int i_72_ = ((i << 1270385159)
							     + i_71_);
						int i_73_
						    = ((i_6_ << -1039476761)
						       + i_70_);
						is_37_[i_35_]
						    = (arg4.method720(i_72_,
								      i_73_)
						       - (arg3.method720
							  (i_72_, i_73_)));
					    }
					    if ((i_66_ ^ 0xffffffff) > -9
						&& ((Class23_Sub4_Sub2
						     .anIntArray5358[i_67_])
						    >= 0)) {
						if (is_38_ != null)
						    is_38_[i_35_]
							= (Class131_Sub18
							   .anIntArray4390
							   [i_67_]);
						is_43_[i_35_]
						    = (Class131_Sub2_Sub11
						       .anIntArray5712[i_67_]);
						is_42_[i_35_]
						    = (Class92.anIntArray1203
						       [i_67_]);
						is_41_[i_35_]
						    = (Class110_Sub1
						       .anIntArray3899[i_67_]);
					    } else {
						if (bool_8_
						    && (Class46
							.aBooleanArrayArray637
							[i_9_][i_66_])) {
						    is_42_[i_35_] = i_45_;
						    is_43_[i_35_] = i_46_;
						    is_41_[i_35_] = i_44_;
						} else if (i_71_ == 0
							   && i_70_ == 0) {
						    is_41_[i_35_]
							= arg1[i][i_6_];
						    is_42_[i_35_]
							= (class108_58_
							   .anInt1409);
						    is_43_[i_35_]
							= (class108_58_
							   .anInt1416);
						} else if (i_71_ != 0
							   || ((i_70_
								^ 0xffffffff)
							       != -129)) {
						    if (((i_71_ ^ 0xffffffff)
							 != -129)
							|| i_70_ != 128) {
							if (((i_71_
							      ^ 0xffffffff)
							     == -129)
							    && i_70_ == 0) {
							    is_41_[i_35_]
								= (arg1[i_5_]
								   [i_6_]);
							    is_42_[i_35_]
								= (class108_61_
								   .anInt1409);
							    is_43_[i_35_]
								= (class108_61_
								   .anInt1416);
							} else {
							    if ((i_71_
								 ^ 0xffffffff)
								<= -65) {
								if ((i_70_
								     ^ 0xffffffff)
								    <= -65) {
								    is_42_
									[i_35_]
									= (class108_60_
									   .anInt1409);
								    is_43_
									[i_35_]
									= (class108_60_
									   .anInt1416);
								} else {
								    is_42_
									[i_35_]
									= (class108_61_
									   .anInt1409);
								    is_43_
									[i_35_]
									= (class108_61_
									   .anInt1416);
								}
							    } else if (i_70_
								       >= 64) {
								is_42_[i_35_]
								    = (class108_59_
								       .anInt1409);
								is_43_[i_35_]
								    = (class108_59_
								       .anInt1416);
							    } else {
								is_42_[i_35_]
								    = (class108_58_
								       .anInt1409);
								is_43_[i_35_]
								    = (class108_58_
								       .anInt1416);
							    }
							    int i_74_
								= (Class57
								       .method630
								   (true,
								    (arg1[i_5_]
								     [i_6_]),
								    (i_71_
								     << 660546535
								     >> -1953276697),
								    (arg1[i]
								     [i_6_])));
							    int i_75_
								= (Class57
								       .method630
								   (true,
								    (arg1[i_5_]
								     [i_7_]),
								    (i_71_
								     << 1336115591
								     >> -952233369),
								    (arg1[i]
								     [i_7_])));
							    is_41_[i_35_]
								= (Class57
								       .method630
								   (true,
								    i_75_,
								    (i_70_
								     << 1202708455
								     >> 1710276103),
								    i_74_));
							}
						    } else {
							is_41_[i_35_]
							    = arg1[i_5_][i_7_];
							is_42_[i_35_]
							    = (class108_60_
							       .anInt1409);
							is_43_[i_35_]
							    = (class108_60_
							       .anInt1416);
						    }
						} else {
						    is_41_[i_35_]
							= arg1[i][i_7_];
						    is_42_[i_35_]
							= (class108_59_
							   .anInt1409);
						    is_43_[i_35_]
							= (class108_59_
							   .anInt1416);
						}
						if (is_38_ != null)
						    is_38_[i_35_]
							= is_41_[i_35_];
					    }
					    i_35_++;
					}
					i_34_++;
				    }
				    if ((i_9_ ^ 0xffffffff) != -1
					&& class108.aBoolean1404)
					bool = true;
				}
				int i_76_ = arg3.method712(i, i_6_);
				int i_77_ = arg3.method712(i_5_, i_6_);
				int i_78_ = arg3.method712(i_5_, i_7_);
				int i_79_ = arg3.method712(i, i_7_);
				if (arg10 > 0) {
				    boolean bool_80_ = true;
				    if (i_12_ == 0 && i_9_ != 0)
					bool_80_ = false;
				    if ((i_11_ ^ 0xffffffff) < -1
					&& class189_16_ != null
					&& !class189_16_.aBoolean2762)
					bool_80_ = false;
				    if (bool_80_
					&& ((i_76_ ^ 0xffffffff)
					    == (i_77_ ^ 0xffffffff))
					&& ((i_76_ ^ 0xffffffff)
					    == (i_78_ ^ 0xffffffff))
					&& ((i_76_ ^ 0xffffffff)
					    == (i_79_ ^ 0xffffffff)))
					Class121.aByteArrayArrayArray1590
					    [arg10][i][i_6_]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg10][i][i_6_]),
						       4));
				}
				int i_81_ = 0;
				int i_82_ = 0;
				if (arg12) {
				    i_81_ = Class131_Sub41_Sub11
						.method2004(i, i_6_);
				    i_82_ = Class33.method447(i, i_6_);
				}
				arg3.method726(i, i_6_, is_39_, is_37_, is_40_,
					       is_41_, is_38_, is_42_, is_43_,
					       i_81_, i_82_, bool);
				Class1_Sub2.method101(arg10, i, i_6_);
			    }
			}
		    }
		}
	    }
	    int i = 11 % ((13 - arg6) / 48);
	    anInt2283++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("rl.F(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ arg6 + ',' + (arg7 != null ? "{...}" : "null") + ','
			+ (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ',' + arg12
			+ ')'));
	}
    }
    
    public static void method2449(int arg0) {
	anInt2280++;
	Class9.aClass131_Sub21_109
	    = new Class131_Sub21(Class182.aString2608, "",
				 Class23_Sub5_Sub2.anInt5048, 1001, 0L, 0, 0);
	if (arg0 != 1)
	    method2447(-93);
    }
    
    static {
	aString2277 = "wave:";
    }
}
