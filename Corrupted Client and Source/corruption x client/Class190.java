/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class190
{
    public byte aByte2779;
    public boolean aBoolean2780 = false;
    public int anInt2781;
    public Class131_Sub41_Sub13 aClass131_Sub41_Sub13_2782;
    public static int anInt2783;
    public Class154 aClass154_2784;
    public static int anInt2785;
    public boolean[] aBooleanArray2786;
    public static int anInt2787;
    public static int anInt2788;
    public Class161 aClass161_2789;
    public static int anInt2790;
    public int anInt2791;
    public static int anInt2792;
    public static int anInt2793;
    public int anInt2794;
    public int anInt2795;
    public static int anInt2796;
    public int anInt2797;
    public static int anInt2798;
    public boolean aBoolean2799 = false;
    public static Class131_Sub43 aClass131_Sub43_2800
	= new Class131_Sub43(0, 0);
    public static int anInt2801;
    public static int anInt2802;
    public int anInt2803;
    public int anInt2804;
    public byte aByte2805;
    public int anInt2806;
    public int anInt2807;
    public int anInt2808;
    public static int[] anIntArray2809 = new int[32];
    public boolean aBoolean2810;
    public int anInt2811;
    public int anInt2812;
    public static int anInt2813;
    public static int anInt2814;
    public static int anInt2815;
    public Class1_Sub6 aClass1_Sub6_2816;
    
    public void method2606(int arg0, int arg1, int arg2) {
	try {
	    int i = -12 % ((arg2 - -9) / 57);
	    anInt2801++;
	    int i_0_;
	while_17_:
	    for (;;) {
		if (aClass161_2789 == null) {
		    if (aBoolean2799)
			return;
		    method2614(-97, -1);
		    if (aClass161_2789 == null)
			return;
		}
		i_0_ = Class125.anInt1632 + -anInt2812;
		if ((i_0_ ^ 0xffffffff) < -101
		    && (aClass161_2789.anInt2163 ^ 0xffffffff) < -1) {
		    int i_1_;
		    for (i_1_ = (-aClass161_2789.anInt2163
				 + aClass161_2789.anIntArray2139.length);
			 (anInt2795 < i_1_
			  && aClass161_2789.anIntArray2153[anInt2795] < i_0_);
			 anInt2795++)
			i_0_ -= aClass161_2789.anIntArray2153[anInt2795];
		    if ((anInt2795 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
			int i_2_ = 0;
			for (int i_3_ = i_1_;
			     ((i_3_ ^ 0xffffffff)
			      > (aClass161_2789.anIntArray2139.length
				 ^ 0xffffffff));
			     i_3_++)
			    i_2_ += aClass161_2789.anIntArray2153[i_3_];
			i_0_ %= i_2_;
		    }
		    anInt2807 = anInt2795 - -1;
		    if ((aClass161_2789.anIntArray2139.length ^ 0xffffffff)
			>= (anInt2807 ^ 0xffffffff)) {
			anInt2807 -= aClass161_2789.anInt2163;
			if ((anInt2807 ^ 0xffffffff) > -1
			    || (anInt2807
				>= aClass161_2789.anIntArray2139.length))
			    anInt2807 = -1;
		    }
		}
		for (;;) {
		    if ((i_0_ ^ 0xffffffff)
			>= (aClass161_2789.anIntArray2153[anInt2795]
			    ^ 0xffffffff))
			break while_17_;
		    Login.method1153(arg0, 21155, false, anInt2795, arg1,
					aClass161_2789);
		    i_0_ -= aClass161_2789.anIntArray2153[anInt2795];
		    anInt2795++;
		    if (anInt2795 >= aClass161_2789.anIntArray2139.length) {
			anInt2795 -= aClass161_2789.anInt2163;
			if (anInt2795 < 0
			    || (anInt2795
				>= aClass161_2789.anIntArray2139.length)) {
			    aClass161_2789 = null;
			    break;
			}
		    }
		    anInt2807 = 1 + anInt2795;
		    if (anInt2807 >= aClass161_2789.anIntArray2139.length) {
			anInt2807 -= aClass161_2789.anInt2163;
			if (anInt2807 < 0
			    || (aClass161_2789.anIntArray2139.length
				<= anInt2807))
			    anInt2807 = -1;
		    }
		}
	    }
	    anInt2791 = i_0_;
	    anInt2812 = -i_0_ + Class125.anInt1632;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2607(int arg0, boolean arg1, int arg2, Class154 arg3,
			   Class130 arg4, int arg5, boolean arg6, int arg7) {
	do {
	    try {
		anInt2790++;
		Class41[] class41s = arg3.method2254();
		Class104[] class104s = arg3.method2266();
		if ((aClass1_Sub6_2816 == null
		     || aClass1_Sub6_2816.aBoolean3563)
		    && (class41s != null || class104s != null)) {
		    Class187 class187 = Class55.method612(anInt2803, -11);
		    if (class187.anIntArray2653 != null)
			class187 = class187.method2573(18);
		    if (class187 != null)
			aClass1_Sub6_2816
			    = new Class1_Sub6(Class125.anInt1632);
		}
		if (arg6 != false)
		    aClass161_2789 = null;
		if (aClass1_Sub6_2816 == null)
		    break;
		if (!arg1)
		    aClass1_Sub6_2816.method115((long) Class125.anInt1632);
		else
		    aClass1_Sub6_2816.method120(arg4,
						(long) Class125.anInt1632,
						class41s, class104s, false);
		aClass1_Sub6_2816.method123(aByte2805, arg0, arg7, arg5, arg2);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("td.B(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ','
						     + (arg4 != null ? "{...}"
							: "null")
						     + ',' + arg5 + ',' + arg6
						     + ',' + arg7 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class154 method2608(int arg0, Class130 arg1, int arg2, int arg3,
			       boolean arg4, boolean arg5, int arg6) {
	try {
	    int i = 104 % ((21 - arg6) / 41);
	    anInt2787++;
	    Class187 class187 = Class55.method612(anInt2803, 124);
	    if (class187.anIntArray2653 != null)
		class187 = class187.method2573(18);
	    if (class187 == null) {
		method2611(arg1, 4);
		anInt2808 = -1;
		anInt2811 = anInt2795;
		return null;
	    }
	    if (!aBoolean2799 && class187.anInt2713 != anInt2808) {
		aClass154_2784 = null;
		method2614(-84, -1);
	    }
	    method2606(arg2, arg3, -106);
	    arg4 = arg4 & (aBoolean2810 & Class131_Sub2_Sub16.anInt5779 != 0);
	    arg4 = arg4 & ((class187.anInt2713 ^ 0xffffffff) != (anInt2808
								 ^ 0xffffffff)
			   || ((anInt2795 != anInt2811
				|| (aClass161_2789 != null
				    && (aClass161_2789.aBoolean2158
					|| Class119.aBoolean1559)
				    && ((anInt2807 ^ 0xffffffff)
					!= (anInt2795 ^ 0xffffffff))))
			       && ((Class131_Sub2_Sub16.anInt5779 ^ 0xffffffff)
				   <= -3)));
	    if (arg5 && !arg4) {
		anInt2808 = class187.anInt2713;
		anInt2811 = anInt2795;
		return null;
	    }
	    if (arg4)
		Class131_Sub41_Sub5.method1956(aClass131_Sub41_Sub13_2782,
					       aByte2779, anInt2797, anInt2781,
					       aBooleanArray2786);
	    Class68 class68 = Class75.aClass68Array1023[aByte2779];
	    Class68 class68_4_;
	    if (!aBoolean2780)
		class68_4_
		    = ((aByte2779 ^ 0xffffffff) > -4
		       ? Class75.aClass68Array1023[aByte2779 - -1] : null);
	    else
		class68_4_ = Class131_Sub2_Sub37.aClass68Array6057[0];
	    Class154 class154 = null;
	    if (aClass161_2789 == null) {
		if (aClass154_2784 == null
		    || (arg0 & aClass154_2784.method2253()) != arg0
		    || anInt2808 != class187.anInt2713) {
		    if (aClass154_2784 != null)
			arg0 |= aClass154_2784.method2253();
		    Class14 class14
			= class187.method2569(anInt2804 == 11 ? 10 : anInt2804,
					      arg1, class68,
					      ((anInt2804 ^ 0xffffffff) != -12
					       ? anInt2806 : anInt2806 + 4),
					      anInt2781, anInt2797,
					      class68.method720(anInt2797,
								anInt2781),
					      arg0, class68_4_, 113, arg4);
		    if (class14 == null) {
			aClass131_Sub41_Sub13_2782 = null;
			aClass154_2784 = null;
			aBooleanArray2786 = null;
			anInt2794 = 0;
		    } else {
			aClass154_2784 = class154 = class14.aClass154_149;
			if (arg4) {
			    aClass131_Sub41_Sub13_2782
				= class14.aClass131_Sub41_Sub13_148;
			    aBooleanArray2786 = null;
			    Class101.method884(aClass131_Sub41_Sub13_2782,
					       aByte2779, arg2, arg3, null);
			}
			anInt2794 = class154.method2256();
		    }
		} else
		    class154 = aClass154_2784;
	    } else {
		if (arg4)
		    arg0 |= 0x20000;
		class154
		    = class187.method2574(arg1,
					  class68.method720(anInt2797,
							    anInt2781),
					  anInt2781,
					  ((anInt2804 ^ 0xffffffff) == -12
					   ? anInt2806 + 4 : anInt2806),
					  class68, anInt2791, anInt2797, arg0,
					  anInt2807, aClass161_2789,
					  anInt2804 == 11 ? 10 : anInt2804, -4,
					  anInt2795, class68_4_);
		if (class154 != null) {
		    if (arg4) {
			if (aBooleanArray2786 == null)
			    aBooleanArray2786 = new boolean[4];
			aClass131_Sub41_Sub13_2782
			    = class154.method2283(aClass131_Sub41_Sub13_2782);
			Class101.method884(aClass131_Sub41_Sub13_2782,
					   aByte2779, arg2, arg3,
					   aBooleanArray2786);
		    }
		    anInt2794 = class154.method2256();
		} else {
		    anInt2794 = 0;
		    aBooleanArray2786 = null;
		    aClass131_Sub41_Sub13_2782 = null;
		}
		aClass154_2784 = null;
	    }
	    anInt2808 = class187.anInt2713;
	    anInt2781 = arg3;
	    anInt2811 = anInt2795;
	    anInt2797 = arg2;
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method2609(int arg0) {
	try {
	    if (arg0 >= -22)
		aClass131_Sub43_2800 = null;
	    anIntArray2809 = null;
	    aClass131_Sub43_2800 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"td.G(" + arg0 + ')');
	}
    }
    
    public static void method2610(Class23_Sub4 arg0) {
	for (int i = arg0.aShort3745; i <= arg0.aShort3742; i++) {
	    for (int i_5_ = arg0.aShort3737; i_5_ <= arg0.aShort3735; i_5_++) {
		Class147 class147
		    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
		       [arg0.aByte3740][i][i_5_]);
		if (class147 != null) {
		    Class82 class82 = class147.aClass82_1958;
		    Class82 class82_6_ = null;
		    for (/**/; class82 != null;
			 class82 = class82.aClass82_1086) {
			if (class82.aClass23_Sub4_1080 == arg0) {
			    if (class82_6_ != null)
				class82_6_.aClass82_1086
				    = class82.aClass82_1086;
			    else
				class147.aClass82_1958 = class82.aClass82_1086;
			    class82.method793(0);
			    break;
			}
			class82_6_ = class82;
		    }
		    class147.aByte1953 = (byte) 0;
		    for (Class82 class82_7_ = class147.aClass82_1958;
			 class82_7_ != null;
			 class82_7_ = class82_7_.aClass82_1086)
			class147.aByte1953 |= class82_7_.anInt1081;
		}
	    }
	}
    }
    
    public void method2611(Class130 arg0, int arg1) {
	try {
	    if (arg1 != 4)
		aClass1_Sub6_2816 = null;
	    if (aClass131_Sub41_Sub13_2782 != null) {
		Class131_Sub41_Sub5.method1956(aClass131_Sub41_Sub13_2782,
					       aByte2779, anInt2797, anInt2781,
					       aBooleanArray2786);
		aBooleanArray2786 = null;
		aClass131_Sub41_Sub13_2782 = null;
	    }
	    anInt2783++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method2612(int arg0) {
	try {
	    if (arg0 != -1724944720)
		aBooleanArray2786 = null;
	    anInt2785++;
	    return aBoolean2810;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"td.F(" + arg0 + ')');
	}
    }
    
    public static void method2613(int arg0) {
	try {
	    for (int i = 0; i < 5; i++)
		Class119.aBooleanArray1567[i] = false;
	    anInt2798++;
	    Class218.anInt3202 = 0;
	    Class105.anInt1376 = -1;
	    OutputStream_Sub1.anInt72 = -1;
	    Class131_Sub2_Sub34.anInt6035 = 1;
	    Class166.anInt2224 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"td.K(" + arg0 + ')');
	}
    }
    
    public void method2614(int arg0, int arg1) {
	try {
	    anInt2814++;
	    int i = arg1;
	    boolean bool = false;
	    if ((i ^ 0xffffffff) == 0) {
		Class187 class187 = Class55.method612(anInt2803, 19);
		Class187 class187_8_ = class187;
		if (class187.anIntArray2653 != null)
		    class187 = class187.method2573(18);
		if (class187 == null)
		    return;
		if (class187 == class187_8_)
		    class187_8_ = null;
		if (class187.anIntArray2657 == null) {
		    if ((class187.anInt2718 ^ 0xffffffff) == 0) {
			if (class187_8_ == null
			    || class187_8_.anIntArray2657 == null) {
			    if (class187_8_ != null
				&& (class187_8_.anInt2718 ^ 0xffffffff) != 0
				&& ((class187_8_.anInt2713 ^ 0xffffffff)
				    != (anInt2808 ^ 0xffffffff))) {
				bool = class187_8_.aBoolean2676;
				i = class187_8_.anInt2718;
			    }
			} else {
			    if (aClass161_2789 != null
				&& class187_8_.method2581(-150, (aClass161_2789
								 .anInt2137)))
				return;
			    i = class187_8_.method2576(-119);
			    if ((anInt2808 ^ 0xffffffff)
				!= (class187_8_.anInt2713 ^ 0xffffffff))
				bool = class187_8_.aBoolean2676;
			}
		    } else if (class187.anInt2713 != anInt2808) {
			bool = class187.aBoolean2676;
			i = class187.anInt2718;
		    }
		} else {
		    if (aClass161_2789 != null
			&& class187.method2581(-150, aClass161_2789.anInt2137))
			return;
		    i = class187.method2576(-108);
		    if ((anInt2808 ^ 0xffffffff)
			!= (class187.anInt2713 ^ 0xffffffff))
			bool = class187.aBoolean2676;
		}
	    }
	    if (i == -1)
		aClass161_2789 = null;
	    else {
		aClass154_2784 = null;
		if (aClass161_2789 != null && aClass161_2789.anInt2137 == i) {
		    if ((aClass161_2789.anInt2155 ^ 0xffffffff) == -1)
			return;
		} else
		    aClass161_2789 = Class145.method2159(i, (byte) -113);
		if (aClass161_2789.anIntArray2139 == null)
		    aClass161_2789 = null;
		else {
		    int i_9_ = -26 % ((-23 - arg0) / 32);
		    if (!bool) {
			anInt2791 = 1;
			anInt2795 = 0;
		    } else {
			anInt2795 = (int) ((double) (aClass161_2789
						     .anIntArray2139).length
					   * Math.random());
			anInt2791 = 1 - -(int) (Math.random()
						* (double) (aClass161_2789
							    .anIntArray2153
							    [anInt2795]));
		    }
		    anInt2807 = 1 + anInt2795;
		    if ((anInt2807 ^ 0xffffffff) > -1
			|| ((aClass161_2789.anIntArray2139.length ^ 0xffffffff)
			    >= (anInt2807 ^ 0xffffffff)))
			anInt2807 = -1;
		    anInt2812 = -anInt2791 + Class125.anInt1632;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.N(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class173 method2615(int arg0, int arg1) {
	try {
	    anInt2793++;
	    int i = arg0 >> -1724944720;
	    if (arg1 >= -3)
		method2613(42);
	    int i_10_ = 0xffff & arg0;
	    if (Class131_Sub2_Sub9.aClass173ArrayArray5684[i] == null
		|| (Class131_Sub2_Sub9.aClass173ArrayArray5684[i][i_10_]
		    == null)) {
		boolean bool = Class126.method1108((byte) -92, i);
		if (!bool)
		    return null;
	    }
	    return Class131_Sub2_Sub9.aClass173ArrayArray5684[i][i_10_];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void finalize() {
	anInt2815++;
	if (aClass1_Sub6_2816 != null)
	    aClass1_Sub6_2816.method119();
    }
    
    public static void method2616(byte arg0) {
	try {
	    anInt2792++;
	    synchronized (Class131_Sub41_Sub18.aClass214_6398) {
		Class131_Sub41_Sub18.aClass214_6398.method2783(-113);
	    }
	    int i = -40 / ((arg0 - -5) / 38);
	    synchronized (Class131_Sub2_Sub14.aClass214_5749) {
		Class131_Sub2_Sub14.aClass214_5749.method2783(-102);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"td.J(" + arg0 + ')');
	}
    }
    
    public int method2617(byte arg0) {
	try {
	    anInt2802++;
	    int i = 105 / ((10 - arg0) / 39);
	    return anInt2794;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"td.E(" + arg0 + ')');
	}
    }
    
    public void method2618(Class130 arg0, byte arg1) {
	try {
	    if (arg1 != -5)
		aClass131_Sub41_Sub13_2782 = null;
	    anInt2788++;
	    method2608(131072, arg0, anInt2797, anInt2781, true, true, 127);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.M("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method2619(int arg0, int arg1) {
	try {
	    if (arg1 >= 61) {
		aBoolean2799 = true;
		anInt2796++;
		method2614(54, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("td.L(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class190(Class130 arg0, Class187 arg1, int arg2, int arg3, int arg4,
		    int arg5, int arg6, int arg7, boolean arg8, int arg9) {
	anInt2794 = -32768;
	anInt2808 = -1;
	anInt2811 = -1;
	try {
	    anInt2781 = arg7;
	    anInt2806 = arg3;
	    aBoolean2780 = arg8;
	    anInt2797 = arg6;
	    anInt2804 = arg2;
	    aByte2779 = (byte) arg5;
	    aByte2805 = (byte) arg4;
	    anInt2803 = arg1.anInt2713;
	    aBoolean2810
		= arg0.method1259() && arg1.aBoolean2735 && !aBoolean2780;
	    if ((arg9 ^ 0xffffffff) != 0)
		aBoolean2799 = true;
	    method2614(-77, arg9);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("td.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ')'));
	}
    }
}
