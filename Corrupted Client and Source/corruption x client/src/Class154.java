/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class154
{
    public static int anInt2046;
    public static boolean aBoolean2047 = false;
    public static int anInt2048;
    public static int anInt2049;
    public static int anInt2050;
    public static int anInt2051;
    public static int anInt2052;
    public static int anInt2053;
    public static int anInt2054;
    public static int anInt2055;
    public static int[] anIntArray2056 = new int[50];
    public static int anInt2057;
    public static Class158 aClass158_2058;
    public static int anInt2059;
    
    public static void method2242(Class68 arg0, Class68 arg1, int[][] arg2,
				  int arg3, byte[][] arg4, int arg5, int arg6,
				  byte[][] arg7, byte[][] arg8, Class130 arg9,
				  byte[][] arg10, boolean arg11, byte arg12) {
	try {
	    if (arg12 >= 71) {
		for (int i = 0; (arg3 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    for (int i_0_ = 0;
			 (arg6 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
			if (Class9.method182((byte) 126)
			    || Class45.method561(i, true, i_0_, arg5,
						 Class1_Sub8.anInt3600)) {
			    byte i_1_ = arg4[i][i_0_];
			    byte i_2_ = arg8[i][i_0_];
			    int i_3_ = arg10[i][i_0_] & 0xff;
			    int i_4_ = 0xff & arg7[i][i_0_];
			    Class189 class189
				= ((i_3_ ^ 0xffffffff) == -1 ? null
				   : Class187.method2570(false, -1 + i_3_));
			    Class108 class108
				= (i_4_ != 0
				   ? Class186.method2561(-128, -1 + i_4_)
				   : null);
			    int i_5_ = 0;
			    int i_6_ = 0;
			    if ((i_1_ ^ 0xffffffff) != -1) {
				i_6_ = (class189 == null ? 0
					: Class211.anIntArray3086[i_1_]);
				i_5_ = (class108 != null
					? Class191.anIntArray2818[i_1_] : 0);
			    } else if (class189 == null) {
				if (class108 != null)
				    i_5_ = Class211.anIntArray3086[i_1_];
			    } else
				i_6_ = Class211.anIntArray3086[i_1_];
			    int i_7_ = i_5_ + i_6_;
			    int i_8_ = 0;
			    if (i_7_ != 0) {
				int[] is = new int[i_7_];
				int[] is_9_ = new int[i_7_];
				int[] is_10_ = new int[i_7_];
				int[] is_11_ = new int[i_7_];
				boolean bool = false;
				if (class189 != null
				    && (class189.anInt2766 != -1
					|| ((class189.anInt2776 ^ 0xffffffff)
					    != 0)
					|| ((class189.anInt2760 ^ 0xffffffff)
					    != 0))) {
				    int i_12_ = (!arg9.method1223()
						 ? class189.anInt2765
						 : class189.anInt2760);
				    if (!Class103.aBoolean1349)
					i_12_ = -1;
				    for (int i_13_ = 0;
					 ((i_13_ ^ 0xffffffff)
					  > (i_6_ ^ 0xffffffff));
					 i_13_++) {
					is_10_[i_8_] = i_12_;
					is_11_[i_8_] = class189.anInt2773;
					if (class189.anInt2766 == -1)
					    is[i_8_] = -1;
					else
					    is[i_8_] = class189.anInt2766;
					if (class189.anInt2776 == -1)
					    is_9_[i_8_] = -1;
					else {
					    bool = true;
					    is_9_[i_8_] = class189.anInt2776;
					}
					i_8_++;
				    }
				    if (!arg11 && arg5 == 0)
					Class180.method2524(i, i_0_,
							    class189.anInt2777,
							    8 * (class189
								 .anInt2770));
				} else {
				    for (int i_14_ = 0;
					 ((i_14_ ^ 0xffffffff)
					  > (i_6_ ^ 0xffffffff));
					 i_14_++) {
					is[i_8_] = -1;
					i_8_++;
				    }
				}
				if (!bool)
				    is_9_ = null;
				if (class108 != null) {
				    int i_15_ = class108.anInt1409;
				    if (!Class103.aBoolean1349)
					i_15_ = -1;
				    for (int i_16_ = 0;
					 ((i_16_ ^ 0xffffffff)
					  > (i_5_ ^ 0xffffffff));
					 i_16_++) {
					is_10_[i_8_] = i_15_;
					is_11_[i_8_] = class108.anInt1416;
					is[i_8_] = arg2[i][i_0_];
					if (is_9_ != null)
					    is_9_[i_8_] = -1;
					i_8_++;
				    }
				} else {
				    for (int i_17_ = 0; i_5_ > i_17_;
					 i_17_++) {
					is[i_8_] = -1;
					i_8_++;
				    }
				}
				int i_18_ = (Class131_Sub2_Sub35
					     .anIntArray6043).length;
				int[] is_19_ = arg11 ? new int[i_18_] : null;
				int[] is_20_ = new int[i_18_];
				int[] is_21_ = new int[i_18_];
				for (int i_22_ = 0;
				     ((i_22_ ^ 0xffffffff)
				      > (i_18_ ^ 0xffffffff));
				     i_22_++) {
				    int i_23_ = (Class131_Sub2_Sub35
						 .anIntArray6043[i_22_]);
				    int i_24_ = (Class121_Sub3_Sub1
						 .anIntArray5429[i_22_]);
				    if ((i_2_ ^ 0xffffffff) == -1) {
					is_20_[i_22_] = i_23_;
					is_21_[i_22_] = i_24_;
				    } else if (i_2_ == 1) {
					int i_25_ = i_23_;
					is_20_[i_22_] = i_24_;
					is_21_[i_22_] = 128 + -i_25_;
				    } else if (i_2_ != 2) {
					if (i_2_ == 3) {
					    is_20_[i_22_] = 128 + -i_24_;
					    int i_26_ = i_23_;
					    is_21_[i_22_] = i_26_;
					}
				    } else {
					is_20_[i_22_] = -i_23_ + 128;
					is_21_[i_22_] = -i_24_ + 128;
				    }
				    if (arg11 && (Class46.aBooleanArrayArray637
						  [i_1_][i_22_])) {
					int i_27_ = (is_20_[i_22_]
						     + (i << -1571204761));
					int i_28_ = ((i_0_ << 615005703)
						     - -is_21_[i_22_]);
					is_19_[i_22_]
					    = (arg0.method720(i_27_, i_28_)
					       - arg1.method720(i_27_, i_28_));
				    }
				}
				int i_29_ = arg1.method712(i, i_0_);
				int i_30_ = arg1.method712(i + 1, i_0_);
				int i_31_ = arg1.method712(i - -1, 1 + i_0_);
				int i_32_ = arg1.method712(i, 1 + i_0_);
				if (arg5 > 0) {
				    boolean bool_33_ = true;
				    if (i_4_ == 0 && (i_1_ ^ 0xffffffff) != -1)
					bool_33_ = false;
				    if (i_3_ > 0 && class189 != null
					&& !class189.aBoolean2762)
					bool_33_ = false;
				    if (bool_33_ && i_29_ == i_30_
					&& i_29_ == i_31_ && i_32_ == i_29_)
					Class121.aByteArrayArrayArray1590
					    [arg5][i][i_0_]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg5][i][i_0_]),
						       4));
				}
				int i_34_ = 0;
				int i_35_ = 0;
				if (arg11) {
				    i_34_ = Class131_Sub41_Sub11
						.method2004(i, i_0_);
				    i_35_ = Class33.method447(i, i_0_);
				}
				arg1.method723(i, i_0_, is_20_, is_19_, is_21_,
					       (Class131_Sub2_Sub5
						.anIntArrayArray5611[i_1_]),
					       (Class23_Sub5_Sub1
						.anIntArrayArray5043[i_1_]),
					       (Class167.anIntArrayArray2234
						[i_1_]),
					       is, is_9_, is_10_, is_11_,
					       i_34_, i_35_, false);
				Class1_Sub2.method101(arg5, i, i_0_);
			    }
			}
		    }
		}
		anInt2051++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("qc.SB(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ arg6 + ',' + (arg7 != null ? "{...}" : "null") + ','
			+ (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ','
			+ (arg10 != null ? "{...}" : "null") + ',' + arg11
			+ ',' + arg12 + ')'));
	}
    }
    
    public abstract void method2243(int i, int[] is, int i_36_, int i_37_,
				    int i_38_, int i_39_, boolean bool);
    
    public void method2244(int arg0, Class195 arg1, int arg2, boolean arg3,
			   boolean[] arg4, int arg5, int arg6, Class195 arg7,
			   int[] arg8, boolean arg9, int arg10,
			   Class131_Sub17 arg11) {
	try {
	    anInt2055++;
	    if (arg5 != 2)
		anInt2046 = 54;
	    if (arg1 == null || (arg10 ^ 0xffffffff) == -1) {
		for (int i = 0; arg7.anInt2856 > i; i++) {
		    short i_40_ = arg7.aShortArray2843[i];
		    if (arg4 == null || !arg4[i_40_] == !arg9
			|| arg11.anIntArray4375[i_40_] == 0) {
			short i_41_ = arg7.aShortArray2852[i];
			if ((i_41_ ^ 0xffffffff) != 0)
			    method2285(0, arg0 & arg11.anIntArray4367[i_41_],
				       arg3, arg11.anIntArrayArray4369[i_41_],
				       0, -65, 0, arg6, 0, arg8);
			method2285(arg7.aShortArray2848[i],
				   arg0 & arg11.anIntArray4367[i_40_], arg3,
				   arg11.anIntArrayArray4369[i_40_],
				   arg7.aShortArray2842[i], -45,
				   arg7.aShortArray2851[i], arg6,
				   arg11.anIntArray4375[i_40_], arg8);
		    }
		}
	    } else {
		int i = 0;
		int i_42_ = 0;
		for (int i_43_ = 0;
		     (i_43_ ^ 0xffffffff) > (arg11.anInt4368 ^ 0xffffffff);
		     i_43_++) {
		    boolean bool = false;
		    if ((i ^ 0xffffffff) > (arg7.anInt2856 ^ 0xffffffff)
			&& (i_43_ ^ 0xffffffff) == (arg7.aShortArray2843[i]
						    ^ 0xffffffff))
			bool = true;
		    boolean bool_44_ = false;
		    if ((arg1.anInt2856 ^ 0xffffffff) < (i_42_ ^ 0xffffffff)
			&& (i_43_ ^ 0xffffffff) == (arg1.aShortArray2843[i_42_]
						    ^ 0xffffffff))
			bool_44_ = true;
		    if (bool || bool_44_) {
			if (arg4 != null && arg9 == !arg4[i_43_]
			    && arg11.anIntArray4375[i_43_] != 0) {
			    if (bool)
				i++;
			    if (bool_44_)
				i_42_++;
			} else {
			    int i_45_ = 0;
			    int i_46_ = arg11.anIntArray4375[i_43_];
			    if ((i_46_ ^ 0xffffffff) == -4)
				i_45_ = 128;
			    byte i_47_;
			    int i_48_;
			    short i_49_;
			    int i_50_;
			    int i_51_;
			    if (!bool) {
				i_47_ = (byte) 0;
				i_49_ = (short) -1;
				i_48_ = i_45_;
				i_50_ = i_45_;
				i_51_ = i_45_;
			    } else {
				i_47_ = arg7.aByteArray2850[i];
				i_48_ = arg7.aShortArray2842[i];
				i_49_ = arg7.aShortArray2852[i];
				i_50_ = arg7.aShortArray2848[i];
				i_51_ = arg7.aShortArray2851[i];
				i++;
			    }
			    short i_52_;
			    int i_53_;
			    int i_54_;
			    byte i_55_;
			    int i_56_;
			    if (bool_44_) {
				i_55_ = arg1.aByteArray2850[i_42_];
				i_56_ = arg1.aShortArray2842[i_42_];
				i_53_ = arg1.aShortArray2848[i_42_];
				i_52_ = arg1.aShortArray2852[i_42_];
				i_54_ = arg1.aShortArray2851[i_42_];
				i_42_++;
			    } else {
				i_52_ = (short) -1;
				i_53_ = i_45_;
				i_54_ = i_45_;
				i_55_ = (byte) 0;
				i_56_ = i_45_;
			    }
			    int i_57_;
			    int i_58_;
			    int i_59_;
			    if ((i_47_ & 0x2) != 0
				|| (i_55_ & 0x1 ^ 0xffffffff) != -1) {
				i_57_ = i_51_;
				i_58_ = i_48_;
				i_59_ = i_50_;
			    } else if ((i_46_ ^ 0xffffffff) == -3) {
				int i_60_ = 0x3fff & -i_51_ + i_54_;
				int i_61_ = -i_48_ + i_56_ & 0x3fff;
				if ((i_60_ ^ 0xffffffff) <= -8193)
				    i_60_ -= 16384;
				if ((i_61_ ^ 0xffffffff) <= -8193)
				    i_61_ -= 16384;
				int i_62_ = i_53_ - i_50_ & 0x3fff;
				i_57_
				    = 0x3fff & i_51_ - -(i_60_ * arg10 / arg2);
				if ((i_62_ ^ 0xffffffff) <= -8193)
				    i_62_ -= 16384;
				i_58_ = 0x3fff & arg10 * i_61_ / arg2 + i_48_;
				i_59_ = 0x3fff & arg10 * i_62_ / arg2 + i_50_;
			    } else if (i_46_ != 7) {
				i_57_
				    = arg10 * (-i_51_ + i_54_) / arg2 + i_51_;
				i_59_ = arg10 * (i_53_ - i_50_) / arg2 + i_50_;
				i_58_ = i_48_ - -((-i_48_ + i_56_) * arg10
						  / arg2);
			    } else {
				int i_63_ = i_54_ - i_51_ & 0x3f;
				if (i_63_ >= 32)
				    i_63_ -= 64;
				i_57_ = 0x3f & i_63_ * arg10 / arg2 + i_51_;
				i_58_
				    = (i_56_ + -i_48_) * arg10 / arg2 + i_48_;
				i_59_ = i_50_ - -((-i_50_ + i_53_) * arg10
						  / arg2);
			    }
			    if ((i_49_ ^ 0xffffffff) == 0) {
				if (i_52_ != -1)
				    method2285(0,
					       (arg0
						& arg11.anIntArray4367[i_52_]),
					       arg3,
					       (arg11.anIntArrayArray4369
						[i_52_]),
					       0, -27, 0, arg6, 0, arg8);
			    } else
				method2285(0,
					   arg11.anIntArray4367[i_49_] & arg0,
					   arg3,
					   arg11.anIntArrayArray4369[i_49_], 0,
					   arg5 ^ 0x7c, 0, arg6, 0, arg8);
			    method2285(i_59_,
				       arg11.anIntArray4367[i_43_] & arg0,
				       arg3, arg11.anIntArrayArray4369[i_43_],
				       i_58_, 123, i_57_, arg6, i_46_, arg8);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("qc.TB(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ','
			+ arg5 + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ','
			+ (arg8 != null ? "{...}" : "null") + ',' + arg9 + ','
			+ arg10 + ',' + (arg11 != null ? "{...}" : "null")
			+ ')'));
	}
    }
    
    public abstract void method2245(Class9 class9, Class1_Sub5 class1_sub5,
				    int i, int i_64_);
    
    public abstract void method2246();
    
    public abstract boolean method2247();
    
    public abstract void method2248(int i);
    
    public abstract int method2249();
    
    public void method2250(int arg0, int arg1, int arg2, int arg3, int[] arg4,
			   int arg5, int arg6, Class131_Sub41_Sub10 arg7,
			   Class131_Sub41_Sub10 arg8, boolean arg9,
			   int arg10) {
	try {
	    anInt2059++;
	    if ((arg2 ^ 0xffffffff) != 0 && method2247()) {
		Class195 class195 = arg7.aClass195Array6289[arg2];
		Class131_Sub17 class131_sub17 = class195.aClass131_Sub17_2849;
		Class195 class195_65_ = null;
		int i = 68 % ((-80 - arg6) / 36);
		if (arg8 != null) {
		    class195_65_ = arg8.aClass195Array6289[arg0];
		    if (class131_sub17 != class195_65_.aClass131_Sub17_2849)
			class195_65_ = null;
		}
		method2244(arg3, class195_65_, arg5, arg9, null, 2, arg10,
			   class195, arg4, false, arg1, class131_sub17);
		method2279();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("qc.VB(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ',' + arg5
			+ ',' + arg6 + ',' + (arg7 != null ? "{...}" : "null")
			+ ',' + (arg8 != null ? "{...}" : "null") + ',' + arg9
			+ ',' + arg10 + ')'));
	}
    }
    
    public abstract void method2251(int i);
    
    public abstract int method2252();
    
    public abstract int method2253();
    
    public abstract Class41[] method2254();
    
    public void method2255(int arg0, int arg1, int arg2, Class68 arg3,
			   int arg4, int arg5, int arg6) {
	do {
	    try {
		anInt2048++;
		boolean bool = false;
		boolean bool_66_ = false;
		boolean bool_67_ = false;
		int i = -arg4 / 2;
		int i_68_ = -arg6 / 2;
		int i_69_ = arg3.method720(arg1 - -i, i_68_ + arg5);
		int i_70_ = arg4 / 2;
		int i_71_ = -arg6 / 2;
		int i_72_ = arg3.method720(arg1 - -i_70_, i_71_ + arg5);
		int i_73_ = -arg4 / 2;
		int i_74_ = arg6 / 2;
		int i_75_ = arg3.method720(i_73_ + arg1, arg5 + i_74_);
		int i_76_ = arg4 / 2;
		int i_77_ = arg6 / 2;
		int i_78_ = arg3.method720(arg1 - -i_76_, arg5 - -i_77_);
		int i_79_ = ((i_72_ ^ 0xffffffff) < (i_69_ ^ 0xffffffff)
			     ? i_69_ : i_72_);
		int i_80_ = ((i_78_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff)
			     ? i_75_ : i_78_);
		int i_81_ = i_78_ <= i_72_ ? i_78_ : i_72_;
		if ((arg6 ^ 0xffffffff) != arg0) {
		    int i_82_ = ((int) (2607.5945876176133
					* Math.atan2((double) (-i_80_ + i_79_),
						     (double) arg6))
				 & 0x3fff);
		    if ((i_82_ ^ 0xffffffff) != -1)
			method2288(i_82_);
		}
		int i_83_ = i_75_ > i_69_ ? i_69_ : i_75_;
		int i_84_ = i_69_ - -i_78_;
		if (arg4 != 0) {
		    int i_85_ = ((int) (Math.atan2((double) (i_83_ - i_81_),
						   (double) arg4)
					* 2607.5945876176133)
				 & 0x3fff);
		    if (i_85_ != 0)
			method2251(i_85_);
		}
		if ((i_84_ ^ 0xffffffff) < (i_75_ + i_72_ ^ 0xffffffff))
		    i_84_ = i_75_ + i_72_;
		i_84_ = -arg2 + (i_84_ >> 1867550817);
		if (i_84_ == 0)
		    break;
		method2272(0, i_84_, 0);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("qc.DC(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ',' + arg4 + ',' + arg5
						     + ',' + arg6 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public abstract int method2256();
    
    public abstract void method2257(int i, int i_86_, int i_87_, int i_88_);
    
    public abstract int method2258();
    
    public abstract int method2259();
    
    public abstract void method2260(short i, short i_89_);
    
    public abstract void method2261(Class9 class9, Class1_Sub5 class1_sub5,
				    int i);
    
    public abstract void method2262(int i, int i_90_, int i_91_);
    
    public abstract int method2263();
    
    public abstract void method2264(int i);
    
    public abstract int method2265();
    
    public abstract Class104[] method2266();
    
    public abstract int method2267();
    
    public void method2268
	(Class131_Sub41_Sub10 arg0, int arg1, Class131_Sub41_Sub10 arg2,
	 int arg3, int arg4, Class131_Sub41_Sub10 arg5, int arg6, int arg7,
	 int arg8, int arg9, Class131_Sub41_Sub10 arg10, boolean[] arg11,
	 boolean arg12, int arg13, byte arg14) {
	try {
	    anInt2057++;
	    if ((arg4 ^ 0xffffffff) != 0) {
		if (arg11 == null || (arg6 ^ 0xffffffff) == 0)
		    method2270(arg13, 0, arg8, arg14 + -28, arg9, arg2, arg12,
			       arg0, arg4);
		else if (method2247()) {
		    Class195 class195 = arg0.aClass195Array6289[arg4];
		    Class131_Sub17 class131_sub17
			= class195.aClass131_Sub17_2849;
		    Class195 class195_92_ = null;
		    if (arg2 != null) {
			class195_92_ = arg2.aClass195Array6289[arg13];
			if (class195_92_.aClass131_Sub17_2849
			    != class131_sub17)
			    class195_92_ = null;
		    }
		    if (arg14 != 28)
			method2247();
		    Class195 class195_93_ = arg10.aClass195Array6289[arg6];
		    Class195 class195_94_ = null;
		    if (arg5 != null) {
			class195_94_ = arg5.aClass195Array6289[arg1];
			if (class131_sub17
			    != class195_94_.aClass131_Sub17_2849)
			    class195_94_ = null;
		    }
		    method2244(65535, class195_92_, arg8, arg12, arg11, 2, 0,
			       class195, null, false, arg9, class131_sub17);
		    method2243(0, new int[0], 0, 0, 0, 0, arg12);
		    method2244(65535, class195_94_, arg7, arg12, arg11,
			       arg14 + -26, 0, class195_93_, null, true, arg3,
			       class131_sub17);
		    method2279();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("qc.BC(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ','
			+ (arg10 != null ? "{...}" : "null") + ','
			+ (arg11 != null ? "{...}" : "null") + ',' + arg12
			+ ',' + arg13 + ',' + arg14 + ')'));
	}
    }
    
    public abstract void method2269(int i, int i_95_, Class68 class68,
				    Class68 class68_96_, int i_97_, int i_98_,
				    int i_99_);
    
    public void method2270(int arg0, int arg1, int arg2, int arg3, int arg4,
			   Class131_Sub41_Sub10 arg5, boolean arg6,
			   Class131_Sub41_Sub10 arg7, int arg8) {
	try {
	    anInt2052++;
	    if (arg8 != -1 && method2247()) {
		Class195 class195 = arg7.aClass195Array6289[arg8];
		Class131_Sub17 class131_sub17 = class195.aClass131_Sub17_2849;
		Class195 class195_100_ = null;
		if (arg5 != null) {
		    class195_100_ = arg5.aClass195Array6289[arg0];
		    if (class195_100_.aClass131_Sub17_2849 != class131_sub17)
			class195_100_ = null;
		}
		if (arg3 != 0)
		    anIntArray2056 = null;
		method2244(65535, class195_100_, arg2, arg6, null, 2, arg1,
			   class195, null, false, arg4, class131_sub17);
		method2279();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qc.CC(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ','
						 + (arg7 != null ? "{...}"
						    : "null")
						 + ',' + arg8 + ')'));
	}
    }
    
    public static void method2271(boolean arg0) {
	try {
	    if (arg0 != false)
		anInt2046 = 59;
	    anIntArray2056 = null;
	    aClass158_2058 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qc.AC(" + arg0 + ')');
	}
    }
    
    public abstract void method2272(int i, int i_101_, int i_102_);
    
    public abstract void method2273(int i);
    
    public void method2274(int arg0, int arg1, Class131_Sub41_Sub10 arg2) {
	try {
	    anInt2050++;
	    if ((arg0 ^ 0xffffffff) != 0 && method2247()) {
		Class195 class195 = arg2.aClass195Array6289[arg0];
		int i = 53 / (-arg1 / 56);
		Class131_Sub17 class131_sub17 = class195.aClass131_Sub17_2849;
		for (int i_103_ = 0;
		     (class195.anInt2856 ^ 0xffffffff) < (i_103_ ^ 0xffffffff);
		     i_103_++) {
		    short i_104_ = class195.aShortArray2843[i_103_];
		    if (class131_sub17.aBooleanArray4372[i_104_]) {
			if (class195.aShortArray2852[i_103_] != -1)
			    method2257(0, 0, 0, 0);
			method2257(class131_sub17.anIntArray4375[i_104_],
				   class195.aShortArray2851[i_103_],
				   class195.aShortArray2842[i_103_],
				   class195.aShortArray2848[i_103_]);
		    }
		}
		method2279();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qc.RB(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public abstract void method2275(Class154 class154_105_, int i, int i_106_,
				    int i_107_, boolean bool);
    
    public static void method2276(int arg0) {
	try {
	    Class93.aClass214_1218.method2783(-64);
	    if (arg0 <= -121)
		anInt2049++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qc.WB(" + arg0 + ')');
	}
    }
    
    public abstract int method2277();
    
    public abstract boolean method2278(int i, int i_108_, Class9 class9,
				       boolean bool);
    
    public abstract void method2279();
    
    public abstract void method2280();
    
    public abstract void method2281(short i, short i_109_);
    
    public abstract void method2282(int i, int[] is, int i_110_, int i_111_,
				    int i_112_, boolean bool, int i_113_,
				    int[] is_114_);
    
    public abstract Class131_Sub41_Sub13 method2283
	(Class131_Sub41_Sub13 class131_sub41_sub13);
    
    public abstract void method2284(int i);
    
    public void method2285(int arg0, int arg1, boolean arg2, int[] arg3,
			   int arg4, int arg5, int arg6, int arg7, int arg8,
			   int[] arg9) {
	try {
	    if (arg7 != 1) {
		if ((arg7 ^ 0xffffffff) == -3) {
		    if ((arg8 ^ 0xffffffff) == -1 || arg8 == 1) {
			arg6 = -arg6;
			arg0 = -arg0;
		    } else if ((arg8 ^ 0xffffffff) == -3) {
			arg6 = 0x3fff & -arg6;
			arg0 = 0x3fff & -arg0;
		    }
		} else if (arg7 == 3) {
		    if (arg8 == 0 || arg8 == 1) {
			int i = arg6;
			arg6 = -arg0;
			arg0 = i;
		    } else if (arg8 != 3) {
			if (arg8 == 2) {
			    int i = arg6;
			    arg6 = arg0 & 0x3fff;
			    arg0 = -i & 0x3fff;
			}
		    } else {
			int i = arg6;
			arg6 = arg0;
			arg0 = i;
		    }
		}
	    } else if (arg8 != 0 && arg8 != 1) {
		if (arg8 != 3) {
		    if (arg8 == 2) {
			int i = arg6;
			arg6 = 0x3fff & -arg0;
			arg0 = i & 0x3fff;
		    }
		} else {
		    int i = arg6;
		    arg6 = arg0;
		    arg0 = i;
		}
	    } else {
		int i = -arg6;
		arg6 = arg0;
		arg0 = i;
	    }
	    anInt2053++;
	    int i = 10 / ((60 - arg5) / 63);
	    if ((arg1 ^ 0xffffffff) == -65536)
		method2243(arg8, arg3, arg6, arg4, arg0, arg7, arg2);
	    else
		method2282(arg8, arg3, arg6, arg4, arg0, arg2, arg1, arg9);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("qc.UB(" + arg0 + ',' + arg1 + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public abstract boolean method2286();
    
    public abstract Class154 method2287(byte i, int i_115_, boolean bool);
    
    public abstract void method2288(int i);
    
    public abstract void method2289(int i);
}
