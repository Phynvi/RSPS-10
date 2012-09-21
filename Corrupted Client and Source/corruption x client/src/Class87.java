/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87
{
    public int anInt1126;
    public int anInt1127;
    public static int anInt1128;
    public static int anInt1129;
    public static String aString1130 = "red:";
    public int anInt1131;
    public int anInt1132;
    public static int anInt1133;
    public int anInt1134;
    public int anInt1135;
    public int anInt1136;
    public int anInt1137;
    public static Class119 aClass119_1138 = new Class119();
    public int anInt1139 = -1;
    public static int anInt1140;
    public static Class188 aClass188_1141 = new Class188();
    public static Class180 aClass180_1142 = new Class180(16);
    public int anInt1143;
    public static int anInt1144 = 0;
    /*synthetic*/ public static Class aClass1145;
    
    public static Class131_Sub41_Sub6 method817(boolean arg0) {
	try {
	    anInt1129++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= ((Class131_Sub41_Sub6)
		   Class131_Sub19.aClass175_4397.method2485(-25));
	    if (class131_sub41_sub6 != null) {
		class131_sub41_sub6.method1355((byte) 117);
		class131_sub41_sub6.method1919(-29183);
		return class131_sub41_sub6;
	    }
	    if (arg0 != true)
		method817(false);
	    do {
		class131_sub41_sub6 = ((Class131_Sub41_Sub6)
				       Class34.aClass175_485.method2485(-65));
		if (class131_sub41_sub6 == null)
		    return null;
		if ((class131_sub41_sub6.method1961(2) ^ 0xffffffffffffffffL)
		    < (Class208.method2749(-3913) ^ 0xffffffffffffffffL))
		    return null;
		class131_sub41_sub6.method1355((byte) 124);
		class131_sub41_sub6.method1919(-29183);
	    } while ((class131_sub41_sub6.aLong4671 & ~0x7fffffffffffffffL
		      ^ 0xffffffffffffffffL)
		     == -1L);
	    return class131_sub41_sub6;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jd.C(" + arg0 + ')');
	}
    }
    
    public static void method818(int arg0) {
	try {
	    aClass188_1141 = null;
	    aString1130 = null;
	    if (arg0 != 64)
		method818(59);
	    aClass180_1142 = null;
	    aClass119_1138 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jd.E(" + arg0 + ')');
	}
    }
    
    public static boolean method819(int arg0, int arg1, int arg2, int arg3) {
	if (!Class131_Sub4.method1652(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_0_ = arg2 << 7;
	int i_1_ = Class75.aClass68Array1023[arg0].method712(arg1, arg2) - 1;
	int i_2_ = i_1_ - 120;
	int i_3_ = i_1_ - 230;
	int i_4_ = i_1_ - 238;
	if (arg3 < 16) {
	    if (arg3 == 1) {
		if (i > Class50.anInt668) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_1_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i, i_1_, i_0_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_2_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i, i_2_, i_0_ + 128))
			return false;
		}
		if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_))
		    return false;
		if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 2) {
		if (i_0_ < Class176.anInt2513) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_1_, i_0_ + 128))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_1_,
							i_0_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_2_, i_0_ + 128))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_2_,
							i_0_ + 128))
			return false;
		}
		if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_ + 128))
		    return false;
		if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 4) {
		if (i < Class50.anInt668) {
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_1_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_1_,
							i_0_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_2_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_2_,
							i_0_ + 128))
			return false;
		}
		if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_))
		    return false;
		if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 8) {
		if (i_0_ > Class176.anInt2513) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_1_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_1_, i_0_))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class131_Sub2_Sub27.method1605(i, i_2_, i_0_))
			return false;
		    if (!Class131_Sub2_Sub27.method1605(i + 128, i_2_, i_0_))
			return false;
		}
		if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_))
		    return false;
		if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_))
		    return false;
		return true;
	    }
	}
	if (!Class131_Sub2_Sub27.method1605(i + 64, i_4_, i_0_ + 64))
	    return false;
	if (arg3 == 16) {
	    if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 32) {
	    if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 64) {
	    if (!Class131_Sub2_Sub27.method1605(i + 128, i_3_, i_0_))
		return false;
	    return true;
	}
	if (arg3 == 128) {
	    if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_0_))
		return false;
	    return true;
	}
	return true;
    }
    
    public static void method820(int arg0) {
	try {
	    anInt1133++;
	    int i = -89 / ((arg0 - 25) / 56);
	    for (;;) {
		Class131_Sub38 class131_sub38
		    = ((Class131_Sub38)
		       Class103.aClass119_1334.method1005((byte) 93));
		if (class131_sub38 == null)
		    break;
		if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
		    Class23_Sub4_Sub1 class23_sub4_sub1;
		    if (class131_sub38.anInt4613 >= 0) {
			int i_5_ = class131_sub38.anInt4613 + -1;
			class23_sub4_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
		    } else {
			int i_6_ = -class131_sub38.anInt4613 - 1;
			if (Class110.anInt1433 != i_6_)
			    class23_sub4_sub1
				= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				   [i_6_]);
			else
			    class23_sub4_sub1
				= Class166.aClass23_Sub4_Sub1_Sub2_2216;
		    }
		    if (class23_sub4_sub1 != null) {
			Class187 class187
			    = Class55.method612(class131_sub38.anInt4626, 1);
			int i_7_;
			int i_8_;
			if (class131_sub38.anInt4621 != 1
			    && (class131_sub38.anInt4621 ^ 0xffffffff) != -4) {
			    i_8_ = class187.anInt2702;
			    i_7_ = class187.anInt2668;
			} else {
			    i_7_ = class187.anInt2702;
			    i_8_ = class187.anInt2668;
			}
			int i_9_
			    = class131_sub38.anInt4623 - -(i_8_ >> 1859619425);
			int i_10_ = (class131_sub38.anInt4623
				     - -(i_8_ - -1 >> -462313279));
			int i_11_
			    = class131_sub38.anInt4620 + (i_7_ >> -1092440223);
			int i_12_ = (class131_sub38.anInt4620
				     + (1 + i_7_ >> 2039598273));
			Class68 class68 = (Class75.aClass68Array1023
					   [class23_sub4_sub1.aByte3740]);
			int i_13_ = ((class68.method712(i_9_, i_11_)
				      - (-class68.method712(i_10_, i_11_)
					 + -class68.method712(i_9_, i_12_))
				      + class68.method712(i_10_, i_12_))
				     >> -1510800286);
			Interface6 interface6 = null;
			int i_14_ = (Class23_Sub4_Sub1.anIntArray5244
				     [class131_sub38.anInt4614]);
			if ((i_14_ ^ 0xffffffff) != -1) {
			    if (i_14_ == 1)
				interface6
				    = ((Interface6)
				       Class106.method918((class23_sub4_sub1
							   .aByte3740),
							  (class131_sub38
							   .anInt4623),
							  (class131_sub38
							   .anInt4620)));
			    else if ((i_14_ ^ 0xffffffff) != -3) {
				if ((i_14_ ^ 0xffffffff) == -4)
				    interface6
					= ((Interface6)
					   (Class186.method2564
					    (class23_sub4_sub1.aByte3740,
					     class131_sub38.anInt4623,
					     class131_sub38.anInt4620)));
			    } else
				interface6
				    = ((Interface6)
				       (Class63.method662
					(class23_sub4_sub1.aByte3740,
					 class131_sub38.anInt4623,
					 class131_sub38.anInt4620,
					 (aClass1145 != null ? aClass1145
					  : (aClass1145
					     = method822("Interface6"))))));
			} else
			    interface6
				= ((Interface6)
				   Class43.method521((class23_sub4_sub1
						      .aByte3740),
						     class131_sub38.anInt4623,
						     (class131_sub38
						      .anInt4620)));
			if (interface6 != null) {
			    Stream.method1753
				(0, class131_sub38.anInt4623,
				 class131_sub38.anInt4610, i_14_,
				 class131_sub38.anInt4620, -29403, 0,
				 class131_sub38.anInt4624 - -1,
				 class23_sub4_sub1.aByte3740, -1);
			    class23_sub4_sub1.anInt5323
				= class131_sub38.anInt4620 * 128 - -(i_7_
								     * 64);
			    class23_sub4_sub1.anInt5332
				= (class131_sub38.anInt4610
				   + Class125.anInt1632);
			    class23_sub4_sub1.anInt5327
				= 128 * class131_sub38.anInt4623 + 64 * i_8_;
			    class23_sub4_sub1.anInt5324
				= (class131_sub38.anInt4624
				   - -Class125.anInt1632);
			    class23_sub4_sub1.anInterface6_5333 = interface6;
			    class23_sub4_sub1.anInt5325 = i_13_;
			    int i_15_ = class131_sub38.anInt4625;
			    int i_16_ = class131_sub38.anInt4615;
			    int i_17_ = class131_sub38.anInt4619;
			    if ((i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
				int i_18_ = i_15_;
				i_15_ = i_16_;
				i_16_ = i_18_;
			    }
			    int i_19_ = class131_sub38.anInt4616;
			    if (i_17_ > i_19_) {
				int i_20_ = i_17_;
				i_17_ = i_19_;
				i_19_ = i_20_;
			    }
			    class23_sub4_sub1.anInt5317
				= i_15_ + class131_sub38.anInt4623;
			    class23_sub4_sub1.anInt5319
				= i_16_ + class131_sub38.anInt4623;
			    class23_sub4_sub1.anInt5335
				= class131_sub38.anInt4620 - -i_19_;
			    class23_sub4_sub1.anInt5320
				= class131_sub38.anInt4620 + i_17_;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jd.D(" + arg0 + ')');
	}
    }
    
    public static void method821(int arg0, int arg1, boolean arg2,
				 Class150 arg3) {
	anInt1128++;
	Class131_Sub41_Sub12.aClass150ArrayArray6309[arg0][arg1] = arg3;
	if (arg2 != true)
	    method818(-74);
    }
    
    /*synthetic*/ public static Class method822(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
