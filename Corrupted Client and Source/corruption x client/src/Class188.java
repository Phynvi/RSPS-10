/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class188
{
    public static int anInt2738;
    public static int anInt2739;
    public static int anInt2740;
    public static int anInt2741;
    public long aLong2742;
    public static int anInt2743;
    public boolean aBoolean2744;
    public int[] anIntArray2745;
    public int anInt2746 = -1;
    public static int anInt2747;
    public static int anInt2748;
    public int anInt2749;
    public static int anInt2750;
    public static int anInt2751;
    public long aLong2752;
    public static int anInt2753;
    public static int anInt2754;
    public int[][] anIntArrayArray2755;
    public int[] anIntArray2756;
    public static Class131_Sub26 aClass131_Sub26_2757;
    public static int anInt2758;
    
    public void method2586(int arg0, boolean arg1) {
	aBoolean2744 = arg1;
	anInt2741++;
	method2598(true);
	if (arg0 != 703608168)
	    aLong2742 = -44L;
    }
    
    public static void method2587(boolean arg0) {
	try {
	    anInt2748++;
	    synchronized (Class131_Sub41_Sub11.aClass214_6299) {
		if (arg0 != false)
		    aClass131_Sub26_2757 = null;
		Class131_Sub41_Sub11.aClass214_6299.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tb.J(" + arg0 + ')');
	}
    }
    
    public void method2588(int arg0, int arg1, int arg2) {
	try {
	    int i = -35 / ((arg0 - 49) / 54);
	    anInt2751++;
	    int i_0_ = Class131_Sub41_Sub18.anIntArray6394[arg1];
	    if ((anIntArray2745[i_0_] ^ 0xffffffff) != -1
		&& (Class131_Sub41_Sub14.method2031((byte) -108, arg2)
		    != null)) {
		anIntArray2745[i_0_] = Cryption.method2105(arg2, -2147483648);
		method2598(true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2589(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != 16384)
		method2588(-57, 118, 125);
	    anInt2758++;
	    anIntArray2756[arg2] = arg0;
	    method2598(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static boolean method2590(int arg0) {
	try {
	    anInt2750++;
	    if (Class131_Sub24.aBoolean4472) {
		try {
		    Class30.method432(Class23_Sub4.aSignLink_3734.anApplet2883,
				      (byte) -100, "showVideoAd");
		    return true;
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    if (arg0 != 3)
		method2591((byte) 35);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tb.D(" + arg0 + ')');
	}
    }
    
    public static void method2591(byte arg0) {
	try {
	    anInt2739++;
	    if (arg0 >= 113) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (Class202.anInt2943 ^ 0xffffffff);
		     i++) {
		    int i_1_ = Class128_Sub1.anIntArray4019[i];
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [i_1_]);
		    int i_2_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				   .readUnsignedByte(-69);
		    if ((0x20 & i_2_ ^ 0xffffffff) != -1)
			i_2_ += Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByte(58) << 2050740680;
		    if ((i_2_ & 0x10 ^ 0xffffffff) != -1) {
			int i_3_ = Class23_Sub3_Sub1
				       .aClass131_Sub15_Sub2_5231
				       .readUnsignedLEShort((byte) 79);
			if (i_3_ == 65535)
			    i_3_ = -1;
			int i_4_ = Class23_Sub3_Sub1
				       .aClass131_Sub15_Sub2_5231
				       .readUnsignedLEInt(-16777216);
			boolean bool = true;
			if (i_3_ != -1
			    && class23_sub4_sub1_sub1.anInt5253 != -1) {
			    if (class23_sub4_sub1_sub1.anInt5253 != i_3_) {
				Class112 class112
				    = Class151.method2194(i_3_, -6861);
				Class112 class112_5_
				    = (Class151.method2194
				       (class23_sub4_sub1_sub1.anInt5253,
					-6861));
				if ((class112.anInt1450 ^ 0xffffffff) != 0
				    && ((class112_5_.anInt1450 ^ 0xffffffff)
					!= 0)) {
				    Class161 class161
					= Class145.method2159((class112
							       .anInt1450),
							      (byte) -122);
				    Class161 class161_6_
					= Class145.method2159((class112_5_
							       .anInt1450),
							      (byte) -90);
				    if (class161.anInt2142
					< class161_6_.anInt2142)
					bool = false;
				}
			    } else {
				Class112 class112
				    = Class151.method2194(i_3_, -6861);
				if (class112.aBoolean1448
				    && class112.anInt1450 != -1) {
				    Class161 class161
					= Class145.method2159((class112
							       .anInt1450),
							      (byte) -124);
				    int i_7_ = class161.anInt2155;
				    if ((i_7_ ^ 0xffffffff) == -1)
					bool = false;
				    else if ((i_7_ ^ 0xffffffff) != -2) {
					if ((i_7_ ^ 0xffffffff) == -3) {
					    class23_sub4_sub1_sub1.anInt5307
						= 0;
					    bool = false;
					}
				    } else
					bool = true;
				}
			    }
			}
			if (bool) {
			    class23_sub4_sub1_sub1.anInt5253 = i_3_;
			    class23_sub4_sub1_sub1.anInt5287
				= Class125.anInt1632 + (i_4_ & 0xffff);
			    class23_sub4_sub1_sub1.anInt5251 = 1;
			    class23_sub4_sub1_sub1.anInt5286
				= i_4_ >> -785480720;
			    class23_sub4_sub1_sub1.anInt5262 = 0;
			    class23_sub4_sub1_sub1.anInt5288 = 0;
			    if (Class125.anInt1632
				< class23_sub4_sub1_sub1.anInt5287)
				class23_sub4_sub1_sub1.anInt5262 = -1;
			    if ((class23_sub4_sub1_sub1.anInt5253
				 ^ 0xffffffff) != 0
				&& (class23_sub4_sub1_sub1.anInt5287
				    == Class125.anInt1632)) {
				int i_8_ = (Class151.method2194
					    (class23_sub4_sub1_sub1.anInt5253,
					     -6861)
					    .anInt1450);
				if (i_8_ != -1) {
				    Class161 class161
					= Class145.method2159(i_8_,
							      (byte) -125);
				    if (class161 != null
					&& class161.anIntArray2139 != null)
					Login.method1153
					    (class23_sub4_sub1_sub1.anInt3733,
					     21155, false, 0,
					     class23_sub4_sub1_sub1.anInt3747,
					     class161);
				}
			    }
			}
		    }
		    if ((0x4 & i_2_ ^ 0xffffffff) != -1) {
			class23_sub4_sub1_sub1.aString5280
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readString(false);
			class23_sub4_sub1_sub1.anInt5276 = 100;
		    }
		    if ((i_2_ & 0x2 ^ 0xffffffff) != -1) {
			int i_9_ = Class23_Sub3_Sub1
				       .aClass131_Sub15_Sub2_5231
				       .readSmart(-1647926640);
			int i_10_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedByteC(4095);
			class23_sub4_sub1_sub1.method337(0, i_9_, i_10_,
							 Class125.anInt1632);
		    }
		    if ((i_2_ & 0x100) != 0) {
			int i_11_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedByteS(14684);
			int[] is = new int[i_11_];
			int[] is_12_ = new int[i_11_];
			int[] is_13_ = new int[i_11_];
			for (int i_14_ = 0;
			     (i_11_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff);
			     i_14_++) {
			    int i_15_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedLEShort((byte) 79);
			    if (i_15_ == 65535)
				i_15_ = -1;
			    is[i_14_] = i_15_;
			    is_12_[i_14_]
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByteS(14684);
			    is_13_[i_14_]
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedLEShort((byte) 79);
			}
			Class131_Sub41_Sub7.method1970((byte) 18, is, is_13_,
						       is_12_,
						       class23_sub4_sub1_sub1);
		    }
		    if ((0x400 & i_2_) != 0) {
			class23_sub4_sub1_sub1.anInt5246
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShortA(false);
			class23_sub4_sub1_sub1.anInt5299
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShort(8104);
		    }
		    if ((i_2_ & 0x40 ^ 0xffffffff) != -1) {
			if (class23_sub4_sub1_sub1.aClass66_6474.method691(0))
			    Class131_Sub35.method1873(true,
						      class23_sub4_sub1_sub1);
			class23_sub4_sub1_sub1.method349
			    (121, (Class131_Sub41_Sub7.method1971
				   (Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedLEShortA(-1),
				    125)));
			class23_sub4_sub1_sub1.method340
			    (true,
			     class23_sub4_sub1_sub1.aClass66_6474.anInt839);
			class23_sub4_sub1_sub1.anInt5310
			    = (class23_sub4_sub1_sub1.aClass66_6474.anInt853
			       << -1843226685);
			if (class23_sub4_sub1_sub1.aClass66_6474.method691(0))
			    Class131_Sub2_Sub10.method1513
				(null, 0,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1, false,
				 Class29.anInt300, null,
				 class23_sub4_sub1_sub1.anIntArray5328[0]);
		    }
		    if ((0x80 & i_2_ ^ 0xffffffff) != -1) {
			int i_16_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedLEShortA(-1);
			if ((i_16_ ^ 0xffffffff) == -65536)
			    i_16_ = -1;
			int i_17_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedByteA((byte) 106);
			Class131_Sub2_Sub13.method1534(0,
						       class23_sub4_sub1_sub1,
						       i_16_, i_17_);
		    }
		    if ((i_2_ & 0x1) != 0) {
			class23_sub4_sub1_sub1.anInt5255
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedLEShort((byte) 79);
			if (class23_sub4_sub1_sub1.anInt5255 == 65535)
			    class23_sub4_sub1_sub1.anInt5255 = -1;
		    }
		    if ((i_2_ & 0x200 ^ 0xffffffff) != -1) {
			int i_18_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedShort(8104);
			class23_sub4_sub1_sub1.anInt5295
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedByteS(14684);
			class23_sub4_sub1_sub1.anInt5259
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedByteS(14684);
			class23_sub4_sub1_sub1.anInt5302 = 0x7fff & i_18_;
			class23_sub4_sub1_sub1.aBoolean5312
			    = (i_18_ & 0x8000) != 0;
			class23_sub4_sub1_sub1.anInt5269
			    = (Class125.anInt1632
			       - (-class23_sub4_sub1_sub1.anInt5302
				  - class23_sub4_sub1_sub1.anInt5295));
		    }
		    if ((i_2_ & 0x8 ^ 0xffffffff) != -1) {
			int i_19_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readSmart(-1647926640);
			int i_20_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedByte(109);
			class23_sub4_sub1_sub1.method337(0, i_19_, i_20_,
							 Class125.anInt1632);
			class23_sub4_sub1_sub1.anInt5272
			    = Class125.anInt1632 + 300;
			class23_sub4_sub1_sub1.anInt5277
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedByte(77);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tb.C(" + arg0 + ')');
	}
    }
    
    public void method2592(int arg0, int[] arg1, byte arg2, boolean arg3,
			   int arg4, int[] arg5) {
	try {
	    if (anInt2749 != arg4) {
		anInt2749 = arg4;
		anIntArrayArray2755 = null;
	    }
	    anInt2747++;
	    if (arg1 == null) {
		arg1 = new int[12];
		for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
		    for (int i_21_ = 0; Class120.anInt1581 > i_21_; i_21_++) {
			Class40 class40
			    = Class131_Sub41_Sub14.method2031((byte) -87,
							      i_21_);
			if (class40 != null && !class40.aBoolean531
			    && ((class40.anInt526 ^ 0xffffffff)
				== ((!arg3 ? Class131_Sub43.anIntArray4695[i]
				     : Class153_Sub2.anIntArray4785[i])
				    ^ 0xffffffff))) {
			    arg1[Class131_Sub41_Sub18.anIntArray6394[i]]
				= Cryption.method2105(-2147483648, i_21_);
			    break;
			}
		    }
		}
	    }
	    aBoolean2744 = arg3;
	    anIntArray2756 = arg5;
	    anInt2746 = arg0;
	    if (arg2 < 74)
		method2593(null, 10, 42, null, 32, 117, (byte) 20);
	    anIntArray2745 = arg1;
	    method2598(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class154 method2593(Class130 arg0, int arg1, int arg2,
			       Class161 arg3, int arg4, int arg5, byte arg6) {
	try {
	    anInt2738++;
	    if (anInt2746 != -1)
		return Class131_Sub41_Sub7.method1971
			   (anInt2746, arg6 ^ 0x18)
			   .method695(arg1, arg4, -1, arg2, arg3, arg5, arg0);
	    int i = arg4;
	    if (arg3 != null) {
		boolean bool = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		int i_24_ = -1;
		int i_25_ = -1;
		Object object = null;
		i |= 0x20;
		Object object_26_ = null;
		i_24_ = arg3.anIntArray2139[arg2];
		int i_27_ = i_24_ >>> 631379568;
		Class131_Sub41_Sub10 class131_sub41_sub10
		    = Class34.method462((byte) -119, i_27_);
		i_24_ &= 0xffff;
		if (class131_sub41_sub10 != null) {
		    bool_22_ |= class131_sub41_sub10.method1992(65280, i_24_);
		    bool |= class131_sub41_sub10.method1995((byte) 0, i_24_);
		    bool_23_ |= arg3.aBoolean2141;
		}
		if ((arg3.aBoolean2159 || Class119.aBoolean1559) && arg5 != -1
		    && ((arg3.anIntArray2139.length ^ 0xffffffff)
			< (arg5 ^ 0xffffffff))) {
		    i_25_ = arg3.anIntArray2139[arg5];
		    int i_28_ = i_25_ >>> 318327088;
		    i_25_ &= 0xffff;
		    Class131_Sub41_Sub10 class131_sub41_sub10_29_
			= (i_28_ != i_27_
			   ? Class34.method462((byte) -119, i_28_)
			   : class131_sub41_sub10);
		    if (class131_sub41_sub10_29_ != null) {
			bool_22_ |= class131_sub41_sub10_29_.method1992(65280,
									i_25_);
			bool |= class131_sub41_sub10_29_.method1995((byte) 0,
								    i_25_);
		    }
		}
		if (bool_22_)
		    i |= 0x80;
		if (bool)
		    i |= 0x100;
		if (bool_23_)
		    i |= 0x200;
	    }
	    if (arg6 != 74)
		anIntArrayArray2755 = null;
	    Class154 class154;
	    synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		class154 = (Class154) Class131_Sub2_Sub30.aClass214_5991
					  .method2780(119, aLong2752);
	    }
	    if (class154 == null
		|| arg0.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg0.method1203(i, class154.method2253());
		int i_30_ = i;
		boolean bool = false;
		for (int i_31_ = 0; i_31_ < 12; i_31_++) {
		    int i_32_ = anIntArray2745[i_31_];
		    if ((i_32_ & 0x40000000) != 0) {
			if (!Class131_Sub19.method1808
				 (i_32_ & 0x3fffffff, false)
				 .method430(aBoolean2744, -108))
			    bool = true;
		    } else if ((i_32_ & ~0x7fffffff) != 0
			       && !Class131_Sub41_Sub14.method2031
				       ((byte) -91, i_32_ & 0x3fffffff)
				       .method507(true))
			bool = true;
		}
		if (bool)
		    return null;
		Class116[] class116s = new Class116[12];
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < 12; i_34_++) {
		    int i_35_ = anIntArray2745[i_34_];
		    if ((i_35_ & 0x40000000 ^ 0xffffffff) != -1) {
			Class116 class116
			    = Class131_Sub19.method1808
				  (0x3fffffff & i_35_, false)
				  .method421(aBoolean2744, (byte) 80);
			if (class116 != null)
			    class116s[i_33_++] = class116;
		    } else if ((i_35_ & ~0x7fffffff ^ 0xffffffff) != -1) {
			Class116 class116
			    = Class131_Sub41_Sub14.method2031
				  ((byte) -95, i_35_ & 0x3fffffff)
				  .method506(-20658);
			if (class116 != null)
			    class116s[i_33_++] = class116;
		    }
		}
		Class116 class116 = new Class116(class116s, i_33_);
		i_30_ |= 0x2000;
		class154 = arg0.method1218(class116, i_30_, Class49.anInt655,
					   64, 768);
		for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -6; i_36_++) {
		    if (Class131_Sub41_Sub5.aShortArrayArray6233[i_36_].length
			> anIntArray2756[i_36_])
			class154.method2260(Class5.aShortArray89[i_36_],
					    (Class131_Sub41_Sub5
					     .aShortArrayArray6233[i_36_]
					     [anIntArray2756[i_36_]]));
		    if ((Class63.aShortArrayArray800[i_36_].length
			 ^ 0xffffffff)
			< (anIntArray2756[i_36_] ^ 0xffffffff))
			class154.method2260(Class144.aShortArray1916[i_36_],
					    (Class63.aShortArrayArray800[i_36_]
					     [anIntArray2756[i_36_]]));
		}
		class154.method2248(i);
		synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		    Class131_Sub2_Sub30.aClass214_5991
			.method2773(true, class154, aLong2752);
		}
	    }
	    if (arg3 == null)
		return class154;
	    Class154 class154_37_ = class154.method2287((byte) 1, i, true);
	    class154_37_ = arg3.method2388(arg5, arg1, arg4, (byte) -78,
					   class154, arg2);
	    return class154_37_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public Class154 method2594(Class161 arg0, int arg1, byte arg2, int arg3,
			       int arg4, int arg5, int arg6, int arg7,
			       Class130 arg8, int arg9) {
	try {
	    anInt2743++;
	    int i = arg6;
	    if (arg0 != null) {
		boolean bool = false;
		boolean bool_38_ = false;
		boolean bool_39_ = false;
		int i_40_ = -1;
		int i_41_ = -1;
		Object object = null;
		i_40_ = arg0.anIntArray2139[arg9];
		Object object_42_ = null;
		i |= 0x20;
		int i_43_ = i_40_ >>> -1160065040;
		i_40_ &= 0xffff;
		Class131_Sub41_Sub10 class131_sub41_sub10
		    = Class34.method462((byte) -119, i_43_);
		if (class131_sub41_sub10 != null) {
		    bool_38_ |= class131_sub41_sub10.method1992(65280, i_40_);
		    bool |= class131_sub41_sub10.method1995((byte) 0, i_40_);
		    bool_39_ |= arg0.aBoolean2141;
		}
		if ((arg0.aBoolean2159 || Class119.aBoolean1559)
		    && (arg1 ^ 0xffffffff) != 0
		    && (arg1 ^ 0xffffffff) > (arg0.anIntArray2139.length
					      ^ 0xffffffff)) {
		    i_41_ = arg0.anIntArray2139[arg1];
		    int i_44_ = i_41_ >>> -338288848;
		    i_41_ &= 0xffff;
		    Class131_Sub41_Sub10 class131_sub41_sub10_45_;
		    if (i_43_ != i_44_)
			class131_sub41_sub10_45_
			    = Class34.method462((byte) -119,
						i_41_ >>> 400884016);
		    else
			class131_sub41_sub10_45_ = class131_sub41_sub10;
		    if (class131_sub41_sub10_45_ != null) {
			bool_38_ |= class131_sub41_sub10_45_.method1992(65280,
									i_41_);
			bool |= class131_sub41_sub10_45_.method1995((byte) 0,
								    i_41_);
		    }
		}
		if (bool_38_)
		    i |= 0x80;
		if (bool)
		    i |= 0x100;
		if (bool_39_)
		    i |= 0x200;
	    }
	    long l = ((long) (arg7 << -532532816) | (long) arg3 << 1530293152
		      | (long) arg4);
	    Class154 class154;
	    synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		class154 = (Class154) Class131_Sub2_Sub30.aClass214_5991
					  .method2780(arg2 + 133, l);
	    }
	    if (class154 == null
		|| arg8.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg8.method1203(i, class154.method2253());
		int i_46_ = i;
		Class116[] class116s = new Class116[3];
		int i_47_ = 0;
		if (!Class131_Sub41_Sub14.method2031((byte) -102, arg4)
			 .method507(true)
		    || !Class131_Sub41_Sub14.method2031((byte) -87, arg7)
			    .method507(true)
		    || !Class131_Sub41_Sub14.method2031((byte) -77, arg3)
			    .method507(true))
		    return null;
		Class116 class116 = Class131_Sub41_Sub14.method2031
					((byte) -64, arg4).method506(-20658);
		if (class116 != null)
		    class116s[i_47_++] = class116;
		class116 = Class131_Sub41_Sub14.method2031
			       ((byte) -72, arg7).method506(arg2 + -20644);
		if (class116 != null)
		    class116s[i_47_++] = class116;
		class116 = Class131_Sub41_Sub14.method2031
			       ((byte) -106, arg3).method506(-20658);
		if (class116 != null)
		    class116s[i_47_++] = class116;
		i_46_ |= 0x2000;
		class116 = new Class116(class116s, i_47_);
		class154 = arg8.method1218(class116, i_46_, Class49.anInt655,
					   64, 768);
		for (int i_48_ = 0; i_48_ < 5; i_48_++) {
		    if (anIntArray2756[i_48_]
			< (Class131_Sub41_Sub5.aShortArrayArray6233
			   [i_48_]).length)
			class154.method2260(Class5.aShortArray89[i_48_],
					    (Class131_Sub41_Sub5
					     .aShortArrayArray6233[i_48_]
					     [anIntArray2756[i_48_]]));
		    if ((Class63.aShortArrayArray800[i_48_].length
			 ^ 0xffffffff)
			< (anIntArray2756[i_48_] ^ 0xffffffff))
			class154.method2260(Class144.aShortArray1916[i_48_],
					    (Class63.aShortArrayArray800[i_48_]
					     [anIntArray2756[i_48_]]));
		}
		class154.method2248(i);
		synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		    Class131_Sub2_Sub30.aClass214_5991.method2773(true,
								  class154, l);
		}
	    }
	    if (arg2 != -14)
		method2597(-100, -101, (byte) -60);
	    if (arg0 == null)
		return class154;
	    class154 = class154.method2287((byte) 1, i, true);
	    class154 = arg0.method2388(arg1, arg5, arg6, (byte) -88, class154,
				       arg9);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.M("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ',' + arg6
						 + ',' + arg7 + ','
						 + (arg8 != null ? "{...}"
						    : "null")
						 + ',' + arg9 + ')'));
	}
    }
    
    public Class154 method2595(int arg0, int arg1, int arg2, int arg3,
			       Class130 arg4, Class161 arg5, int arg6,
			       byte arg7, int arg8, Class141[] arg9,
			       Class161 arg10, int arg11, boolean arg12) {
	try {
	    anInt2753++;
	    if (anInt2746 != -1)
		return (Class131_Sub41_Sub7.method1971
			    (anInt2746, arg7 + 143).method696
			(arg2, arg11, arg9, arg10, 123, arg5, arg6, arg4, arg1,
			 arg0, arg8, arg3));
	    int i = arg8;
	    long l = aLong2752;
	    int[] is = anIntArray2745;
	    if (arg10 != null && ((arg10.anInt2144 ^ 0xffffffff) <= -1
				  || (arg10.anInt2143 ^ 0xffffffff) <= -1)) {
		is = new int[12];
		for (int i_49_ = 0; i_49_ < 12; i_49_++)
		    is[i_49_] = anIntArray2745[i_49_];
		if ((arg10.anInt2144 ^ 0xffffffff) <= -1) {
		    if (arg10.anInt2144 == 65535) {
			is[5] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is[5]
			    = Cryption.method2105(1073741824, arg10.anInt2144);
			l ^= (long) is[5] << -339907424;
		    }
		}
		if (arg10.anInt2143 >= 0) {
		    if (arg10.anInt2143 == 65535) {
			is[3] = 0;
			l ^= 0xffffffffL;
		    } else {
			is[3]
			    = Cryption.method2105(1073741824, arg10.anInt2143);
			l ^= (long) is[3];
		    }
		}
	    }
	    boolean bool = false;
	    boolean bool_50_ = false;
	    boolean bool_51_ = arg10 != null || arg5 != null;
	    int i_52_ = arg9 != null ? arg9.length : 0;
	    for (int i_53_ = 0; i_52_ > i_53_; i_53_++) {
		Class111.aClass131_Sub41_Sub10Array3272[i_53_] = null;
		if (arg9[i_53_] != null) {
		    Class161 class161
			= Class145.method2159(arg9[i_53_].anInt1881,
					      (byte) -104);
		    if (class161.anIntArray2139 != null) {
			Class113.aClass161Array1458[i_53_] = class161;
			bool_51_ = true;
			int i_54_ = arg9[i_53_].anInt1879;
			int i_55_ = arg9[i_53_].anInt1878;
			int i_56_ = class161.anIntArray2139[i_54_];
			Class111.aClass131_Sub41_Sub10Array3272[i_53_]
			    = Class34.method462((byte) -119,
						i_56_ >>> 1890743280);
			i_56_ &= 0xffff;
			Class131_Sub2_Sub9.anIntArray5662[i_53_] = i_56_;
			if (Class111.aClass131_Sub41_Sub10Array3272[i_53_]
			    != null) {
			    bool_50_ |= Class111
					    .aClass131_Sub41_Sub10Array3272
					    [i_53_].method1992(65280, i_56_);
			    bool |= Class111.aClass131_Sub41_Sub10Array3272
					[i_53_].method1995((byte) 0, i_56_);
			}
			if (!class161.aBoolean2159 && !Class119.aBoolean1559
			    || i_55_ == -1
			    || ((i_55_ ^ 0xffffffff)
				<= (class161.anIntArray2139.length
				    ^ 0xffffffff))) {
			    Class128_Sub1.anIntArray4016[i_53_] = 0;
			    Class78.anIntArray1056[i_53_] = 0;
			    Class153_Sub1.aClass131_Sub41_Sub10Array4764[i_53_]
				= null;
			    Class131_Sub2_Sub9.anIntArray5675[i_53_] = -1;
			} else {
			    Class128_Sub1.anIntArray4016[i_53_]
				= class161.anIntArray2153[i_54_];
			    Class78.anIntArray1056[i_53_]
				= arg9[i_53_].anInt1884;
			    int i_57_ = class161.anIntArray2139[i_55_];
			    Class153_Sub1.aClass131_Sub41_Sub10Array4764[i_53_]
				= Class34.method462((byte) -119,
						    i_57_ >>> 1738416816);
			    i_57_ &= 0xffff;
			    Class131_Sub2_Sub9.anIntArray5675[i_53_] = i_57_;
			    if ((Class153_Sub1.aClass131_Sub41_Sub10Array4764
				 [i_53_])
				!= null) {
				bool_50_
				    |= Class153_Sub1
					   .aClass131_Sub41_Sub10Array4764
					   [i_53_].method1992(65280, i_57_);
				bool
				    |= Class153_Sub1
					   .aClass131_Sub41_Sub10Array4764
					   [i_53_].method1995((byte) 0, i_57_);
			    }
			}
		    }
		}
	    }
	    int i_58_ = -1;
	    int i_59_ = -1;
	    int i_60_ = 0;
	    Class131_Sub41_Sub10 class131_sub41_sub10 = null;
	    if (arg7 != -103)
		aBoolean2744 = false;
	    Class131_Sub41_Sub10 class131_sub41_sub10_61_ = null;
	    int i_62_ = -1;
	    int i_63_ = -1;
	    int i_64_ = 0;
	    Class131_Sub41_Sub10 class131_sub41_sub10_65_ = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_66_ = null;
	    if (bool_51_) {
		if (arg10 != null) {
		    i_58_ = arg10.anIntArray2139[arg1];
		    int i_67_ = i_58_ >>> 388607312;
		    class131_sub41_sub10
			= Class34.method462((byte) -119, i_67_);
		    i_58_ &= 0xffff;
		    if (class131_sub41_sub10 != null) {
			bool_50_
			    |= class131_sub41_sub10.method1992(arg7 + 65383,
							       i_58_);
			bool |= class131_sub41_sub10.method1995((byte) 0,
								i_58_);
		    }
		    if ((arg10.aBoolean2159 || Class119.aBoolean1559)
			&& arg3 != -1
			&& ((arg10.anIntArray2139.length ^ 0xffffffff)
			    < (arg3 ^ 0xffffffff))) {
			i_59_ = arg10.anIntArray2139[arg3];
			i_60_ = arg10.anIntArray2153[arg1];
			int i_68_ = i_59_ >>> -2072975376;
			i_59_ &= 0xffff;
			class131_sub41_sub10_61_
			    = (i_67_ == i_68_ ? class131_sub41_sub10
			       : Class34.method462((byte) -119, i_68_));
			if (class131_sub41_sub10_61_ != null) {
			    bool_50_
				|= class131_sub41_sub10_61_.method1992(65280,
								       i_59_);
			    bool |= class131_sub41_sub10_61_
					.method1995((byte) 0, i_59_);
			}
		    }
		}
		i |= 0x20;
		if (arg5 != null) {
		    i_62_ = arg5.anIntArray2139[arg6];
		    int i_69_ = i_62_ >>> 2137708688;
		    class131_sub41_sub10_65_
			= Class34.method462((byte) -119, i_69_);
		    i_62_ &= 0xffff;
		    if (class131_sub41_sub10_65_ != null) {
			bool_50_ |= class131_sub41_sub10_65_.method1992(65280,
									i_62_);
			bool |= class131_sub41_sub10_65_.method1995((byte) 0,
								    i_62_);
		    }
		    if ((arg5.aBoolean2159 || Class119.aBoolean1559)
			&& arg2 != -1 && arg2 < arg5.anIntArray2139.length) {
			i_64_ = arg5.anIntArray2153[arg6];
			i_63_ = arg5.anIntArray2139[arg2];
			int i_70_ = i_63_ >>> -2136655120;
			class131_sub41_sub10_66_
			    = ((i_69_ ^ 0xffffffff) != (i_70_ ^ 0xffffffff)
			       ? Class34.method462((byte) -119, i_70_)
			       : class131_sub41_sub10_65_);
			i_63_ &= 0xffff;
			if (class131_sub41_sub10_66_ != null) {
			    bool_50_
				|= class131_sub41_sub10_66_.method1992(65280,
								       i_63_);
			    bool |= class131_sub41_sub10_66_
					.method1995((byte) 0, i_63_);
			}
		    }
		}
		if (bool_50_)
		    i |= 0x80;
		if (bool)
		    i |= 0x100;
	    }
	    Class154 class154;
	    synchronized (OutputStream_Sub1.aClass214_66) {
		class154 = (Class154) OutputStream_Sub1.aClass214_66
					  .method2780(arg7 ^ ~0x19, l);
	    }
	    Class72 class72 = null;
	    if (anInt2749 != -1)
		class72
		    = Class131_Sub41_Sub5.method1958(anInt2749, (byte) 127);
	    if (class154 == null
		|| ((arg4.method1208(class154.method2253(), i) ^ 0xffffffff)
		    != -1)
		|| (class72 != null && class72.anIntArrayArray979 != null
		    && anIntArrayArray2755 == null)) {
		if (class154 != null)
		    i = arg4.method1203(i, class154.method2253());
		int i_71_ = i;
		boolean bool_72_ = false;
		for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > -13; i_73_++) {
		    int i_74_ = is[i_73_];
		    if ((0x40000000 & i_74_ ^ 0xffffffff) != -1) {
			if (!Class131_Sub19.method1808
				 (i_74_ & 0x3fffffff, false)
				 .method415(true, aBoolean2744))
			    bool_72_ = true;
		    } else if ((i_74_ & ~0x7fffffff ^ 0xffffffff) != -1
			       && !Class131_Sub41_Sub14.method2031
				       ((byte) -73, 0x3fffffff & i_74_)
				       .method505((byte) -116))
			bool_72_ = true;
		}
		if (!bool_72_) {
		    Class116[] class116s = new Class116[12];
		    for (int i_75_ = 0; (i_75_ ^ 0xffffffff) > -13; i_75_++) {
			int i_76_ = is[i_75_];
			if ((0x40000000 & i_76_ ^ 0xffffffff) == -1) {
			    if ((~0x7fffffff & i_76_) != 0) {
				Class116 class116
				    = Class131_Sub41_Sub14.method2031
					  ((byte) -89, 0x3fffffff & i_76_)
					  .method508(-14648);
				if (class116 != null)
				    class116s[i_75_] = class116;
			    }
			} else {
			    Class116 class116
				= Class131_Sub19.method1808
				      (i_76_ & 0x3fffffff, false)
				      .method417(true, aBoolean2744);
			    if (class116 != null)
				class116s[i_75_] = class116;
			}
		    }
		    if (class72 != null
			&& class72.anIntArrayArray979 != null) {
			for (int i_77_ = 0;
			     class72.anIntArrayArray979.length > i_77_;
			     i_77_++) {
			    if (class72.anIntArrayArray979[i_77_] != null
				&& class116s[i_77_] != null) {
				int i_78_
				    = class72.anIntArrayArray979[i_77_][0];
				int i_79_
				    = class72.anIntArrayArray979[i_77_][1];
				int i_80_
				    = class72.anIntArrayArray979[i_77_][2];
				int i_81_
				    = (class72.anIntArrayArray979[i_77_][3]
				       << 804437379);
				int i_82_
				    = (class72.anIntArrayArray979[i_77_][4]
				       << 1243592867);
				int i_83_
				    = (class72.anIntArrayArray979[i_77_][5]
				       << 1479509091);
				if (anIntArrayArray2755 == null)
				    anIntArrayArray2755
					= (new int
					   [class72.anIntArrayArray979.length]
					   []);
				if (anIntArrayArray2755[i_77_] == null) {
				    int[] is_84_ = (anIntArrayArray2755[i_77_]
						    = new int[15]);
				    if ((i_81_ ^ 0xffffffff) != -1
					|| i_82_ != 0 || i_83_ != 0) {
					int i_85_
					    = Class31.anIntArray425[i_81_];
					int i_86_
					    = Class31.anIntArray434[i_81_];
					int i_87_
					    = Class31.anIntArray425[i_82_];
					int i_88_
					    = Class31.anIntArray434[i_82_];
					int i_89_
					    = Class31.anIntArray425[i_83_];
					int i_90_
					    = Class31.anIntArray434[i_83_];
					int i_91_ = (16384 + i_89_ * i_86_
						     >> 1105924815);
					int i_92_ = (16384 + i_90_ * i_86_
						     >> 271747471);
					is_84_[8] = (i_87_ * i_85_ + 16384
						     >> -586604913);
					is_84_[0]
					    = (16384 + i_89_ * i_87_
					       + i_92_ * i_88_) >> 395771727;
					is_84_[1] = ((16384 + -i_90_ * i_87_
						      - -(i_88_ * i_91_))
						     >> -1383116977);
					is_84_[7] = ((16384 + -i_88_ * -i_90_
						      - -(i_87_ * i_91_))
						     >> -997443921);
					is_84_[6]
					    = ((-i_88_ * i_89_
						- (-(i_92_ * i_87_) + -16384))
					       >> -1228890769);
					is_84_[5] = -i_86_;
					is_84_[4] = (i_89_ * i_85_ - -16384
						     >> -578350961);
					is_84_[3] = (16384 + i_90_ * i_85_
						     >> -204529905);
					is_84_[2] = (16384 + i_85_ * i_88_
						     >> -1419729137);
					is_84_[12]
					    = ((16384 + -i_80_ * is_84_[6]
						+ (-i_79_ * is_84_[3]
						   + is_84_[0] * -i_78_))
					       >> 1712297039);
					is_84_[13]
					    = ((16384
						+ (is_84_[7] * -i_80_
						   + (-i_78_ * is_84_[1]
						      + is_84_[4] * -i_79_)))
					       >> 414729583);
					is_84_[14] = (is_84_[8] * -i_80_
						      + -i_78_ * is_84_[2]
						      - -(-i_79_ * is_84_[5])
						      - -16384) >> 1151472015;
				    } else {
					is_84_[14] = -i_80_;
					is_84_[0] = is_84_[4] = is_84_[8]
					    = 32768;
					is_84_[13] = -i_79_;
					is_84_[12] = -i_78_;
				    }
				    is_84_[11] = i_80_;
				    is_84_[10] = i_79_;
				    is_84_[9] = i_78_;
				}
				if (i_81_ != 0 || i_82_ != 0 || i_83_ != 0)
				    class116s[i_77_].method994(i_83_, i_82_,
							       false, i_81_);
				if (i_78_ != 0 || (i_79_ ^ 0xffffffff) != -1
				    || (i_80_ ^ 0xffffffff) != -1)
				    class116s[i_77_].method993(i_78_, i_80_,
							       30, i_79_);
			    }
			}
		    }
		    i_71_ |= 0x2000;
		    Class116 class116
			= new Class116(class116s, class116s.length);
		    class154 = arg4.method1218(class116, i_71_,
					       Class49.anInt655, 64, 850);
		    for (int i_93_ = 0; (i_93_ ^ 0xffffffff) > -6; i_93_++) {
			if ((Class131_Sub41_Sub5.aShortArrayArray6233
			     [i_93_]).length
			    > anIntArray2756[i_93_])
			    class154.method2260(Class5.aShortArray89[i_93_],
						(Class131_Sub41_Sub5
						 .aShortArrayArray6233[i_93_]
						 [anIntArray2756[i_93_]]));
			if ((Class63.aShortArrayArray800[i_93_].length
			     ^ 0xffffffff)
			    < (anIntArray2756[i_93_] ^ 0xffffffff))
			    class154.method2260((Class144.aShortArray1916
						 [i_93_]),
						(Class63.aShortArrayArray800
						 [i_93_]
						 [anIntArray2756[i_93_]]));
		    }
		    if (arg12) {
			class154.method2248(i);
			synchronized (OutputStream_Sub1.aClass214_66) {
			    OutputStream_Sub1.aClass214_66
				.method2773(true, class154, l);
			}
			aLong2742 = l;
		    }
		} else {
		    if ((aLong2742 ^ 0xffffffffffffffffL) != 0L) {
			synchronized (OutputStream_Sub1.aClass214_66) {
			    class154
				= (Class154) OutputStream_Sub1.aClass214_66
						 .method2780(123, aLong2742);
			}
		    }
		    if (class154 == null
			|| (arg4.method1208(class154.method2253(), i)
			    ^ 0xffffffff) != -1
			|| (class72 != null
			    && class72.anIntArrayArray979 != null
			    && anIntArrayArray2755 == null))
			return null;
		}
	    }
	    Class154 class154_94_ = class154.method2287((byte) 1, i, true);
	    if (!bool_51_)
		return class154_94_;
	    int i_95_ = 0;
	    int i_96_ = 1;
	    for (/**/; i_95_ < i_52_; i_95_++) {
		if (Class111.aClass131_Sub41_Sub10Array3272[i_95_] != null)
		    class154_94_.method2250
			(Class131_Sub2_Sub9.anIntArray5675[i_95_],
			 -1 + Class78.anIntArray1056[i_95_],
			 Class131_Sub2_Sub9.anIntArray5662[i_95_], i_96_,
			 (anIntArrayArray2755 != null
			  ? anIntArrayArray2755[i_95_] : null),
			 Class128_Sub1.anIntArray4016[i_95_], arg7 + -14,
			 Class111.aClass131_Sub41_Sub10Array3272[i_95_],
			 Class153_Sub1.aClass131_Sub41_Sub10Array4764[i_95_],
			 false, 0);
		i_96_ <<= 1;
	    }
	    if (class131_sub41_sub10 != null
		&& class131_sub41_sub10_65_ != null)
		class154_94_.method2268(class131_sub41_sub10, i_63_,
					class131_sub41_sub10_61_, arg0 + -1,
					i_58_, class131_sub41_sub10_66_, i_62_,
					i_64_, i_60_, -1 + arg11,
					class131_sub41_sub10_65_,
					arg10.aBooleanArray2149, false, i_59_,
					(byte) 28);
	    else if (class131_sub41_sub10 != null)
		class154_94_.method2270(i_59_, 0, i_60_, 0, -1 + arg11,
					class131_sub41_sub10_61_, false,
					class131_sub41_sub10, i_58_);
	    else if (class131_sub41_sub10_65_ != null)
		class154_94_.method2270(i_63_, 0, i_64_, arg7 ^ ~0x66,
					arg0 + -1, class131_sub41_sub10_66_,
					false, class131_sub41_sub10_65_,
					i_62_);
	    for (int i_97_ = 0; (i_52_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff);
		 i_97_++) {
		Class111.aClass131_Sub41_Sub10Array3272[i_97_] = null;
		Class153_Sub1.aClass131_Sub41_Sub10Array4764[i_97_] = null;
		Class113.aClass161Array1458[i_97_] = null;
	    }
	    return class154_94_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("tb.E(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ','
			+ (arg10 != null ? "{...}" : "null") + ',' + arg11
			+ ',' + arg12 + ')'));
	}
    }
    
    public static void method2596(int arg0, byte[][][] arg1, int arg2,
				  byte arg3, int arg4, int arg5) {
	Class131_Sub41_Sub20.anInt6431++;
	Class100.anInt1321 = 0;
	for (int i = Class51.anInt675; i < Class133.anInt1805; i++) {
	    Class147[][] class147s
		= Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i];
	    for (int i_98_ = Class52.anInt695; i_98_ < Class120_Sub2.anInt3976;
		 i_98_++) {
		for (int i_99_ = Class23_Sub1.anInt3702;
		     i_99_ < Stream.anInt4350; i_99_++) {
		    Class147 class147 = class147s[i_98_][i_99_];
		    if (class147 != null) {
			if (!(Class68.aBooleanArrayArray920
			      [(i_98_ - Class210.anInt3063
				+ Class131_Sub2_Sub32.anInt6011)]
			      [(i_99_ - Class47.anInt643
				+ Class131_Sub2_Sub32.anInt6011)])
			    || (arg1 != null && i >= arg2
				&& arg1[i][i_98_][i_99_] == arg3)) {
			    class147.aBoolean1954 = false;
			    class147.aBoolean1967 = false;
			    class147.aByte1961 = (byte) 0;
			    if (i_98_ >= Class210.anInt3063 - 16
				&& i_98_ <= Class210.anInt3063 + 16
				&& i_99_ >= Class47.anInt643 - 16
				&& i_99_ <= Class47.anInt643 + 16
				&& (class147.aClass23_Sub1_1966 != null
				    || class147.aClass23_Sub1_1969 != null
				    || class147.aClass23_Sub2_1972 != null
				    || class147.aClass23_Sub2_1951 != null
				    || class147.aClass23_Sub5_1973 != null
				    || class147.aClass82_1958 != null))
				Class153_Sub1.aClass120_4757
				    .method1020(class147, (byte) -102);
			} else {
			    class147.aBoolean1954 = true;
			    class147.aBoolean1967 = true;
			    if (class147.aClass82_1958 != null)
				class147.aBoolean1971 = true;
			    else
				class147.aBoolean1971 = false;
			    Class100.anInt1321++;
			}
		    }
		}
	    }
	}
	boolean bool = Class85.aClass68Array1116 == Class75.aClass68Array1023;
	for (int i = Class51.anInt675; i < Class133.anInt1805; i++) {
	    float f = bool ? 202.0F : 201.5F - 50.0F * (float) i - 0.5F;
	    if (Class131_Sub2_Sub35.aClass130_6044.method1223() && i >= arg2
		&& arg1 != null) {
		int i_100_ = Class68.aBooleanArrayArray920.length;
		if (Class52.anInt695 + Class68.aBooleanArrayArray920.length
		    > Class210.anInt3068)
		    i_100_ -= (Class52.anInt695
			       + Class68.aBooleanArrayArray920.length
			       - Class210.anInt3068);
		int i_101_ = Class68.aBooleanArrayArray920[0].length;
		if ((Class23_Sub1.anInt3702
		     + Class68.aBooleanArrayArray920[0].length)
		    > Class131_Sub8_Sub1.anInt6099)
		    i_101_ -= (Class23_Sub1.anInt3702
			       + Class68.aBooleanArrayArray920[0].length
			       - Class131_Sub8_Sub1.anInt6099);
		for (int i_102_ = Class131_Sub31.anInt4546; i_102_ < i_100_;
		     i_102_++) {
		    int i_103_
			= i_102_ + Class52.anInt695 - Class131_Sub31.anInt4546;
		    for (int i_104_ = Class138.anInt1855; i_104_ < i_101_;
			 i_104_++) {
			Class23_Sub5_Sub2.aBooleanArrayArray5059[i_102_]
			    [i_104_]
			    = false;
			if (Class68.aBooleanArrayArray920[i_102_][i_104_]) {
			    int i_105_ = (i_104_ + Class23_Sub1.anInt3702
					  - Class138.anInt1855);
			    for (int i_106_ = i; i_106_ >= 0; i_106_--) {
				if ((Class131_Sub2_Sub29
				     .aClass147ArrayArrayArray5972[i_106_]
				     [i_103_][i_105_]) != null
				    && (Class131_Sub2_Sub29
					.aClass147ArrayArrayArray5972[i_106_]
					[i_103_][i_105_].aByte1965) == i) {
				    Class23_Sub5_Sub2
					.aBooleanArrayArray5059[i_102_][i_104_]
					= (Class131_Sub2_Sub29
					   .aClass147ArrayArrayArray5972
					   [i_106_][i_103_][i_105_]
					   .aBoolean1954);
				    break;
				}
			    }
			}
		    }
		}
		Class153_Sub1.aClass120_4757.method1024((Class75
							 .aClass68Array1023
							 [i]),
							f, true, i,
							(byte) -82);
	    } else
		Class153_Sub1.aClass120_4757.method1024((Class75
							 .aClass68Array1023
							 [i]),
							f, false, i,
							(byte) 93);
	    Class153_Sub1.aClass120_4757.method1028(127);
	}
	if (!Canvas_Sub1.method76(true))
	    Canvas_Sub1.method76(false);
    }
    
    public static void method2597(int arg0, int arg1, byte arg2) {
	try {
	    anInt2754++;
	    int i = Class89.aClass55_3259.method621((byte) -83,
						    (Class131_Sub41_Sub21_Sub2
						     .aString6593));
	    for (Class131_Sub21 class131_sub21
		     = (Class131_Sub21) Class66.aClass119_843.method1007(0);
		 class131_sub21 != null;
		 class131_sub21
		     = (Class131_Sub21) Class66.aClass119_843.method1014(0)) {
		int i_107_ = Class142.method2136((byte) 118, class131_sub21);
		if (i_107_ > i)
		    i = i_107_;
	    }
	    if (arg2 != -121)
		aClass131_Sub26_2757 = null;
	    i += 8;
	    int i_108_ = Class147.anInt1946 * 16 + 21;
	    int i_109_ = arg0 + -(i / 2);
	    if ((Class131_Sub1_Sub1.anInt5499 ^ 0xffffffff)
		> (i + i_109_ ^ 0xffffffff))
		i_109_ = -i + Class131_Sub1_Sub1.anInt5499;
	    if ((i_109_ ^ 0xffffffff) > -1)
		i_109_ = 0;
	    int i_110_ = arg1;
	    if ((Class218.anInt3201 ^ 0xffffffff)
		> (i_110_ - -i_108_ ^ 0xffffffff))
		i_110_ = -i_108_ + Class218.anInt3201;
	    if (i_110_ < 0)
		i_110_ = 0;
	    Class131_Sub1_Sub4.anInt5537 = i_109_;
	    Class89.anInt3268 = i;
	    Class131_Sub2_Sub24.aBoolean5890 = true;
	    Class40.anInt525 = i_110_;
	    Class131_Sub41_Sub17.anInt6384
		= Class147.anInt1946 * 16 + (Class131_Sub2_Sub28.aBoolean5961
					     ? 26 : 22);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tb.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2598(boolean arg0) {
	try {
	    anInt2740++;
	    long[] ls = Class23_Sub5.aLongArray3760;
	    aLong2752 = -1L;
	    aLong2752 = (ls[(int) (0xffL & ((long) (anInt2749 >> 703608168)
					    ^ aLong2752))]
			 ^ aLong2752 >>> -1966177080);
	    aLong2752 = (aLong2752 >>> 1300328072
			 ^ ls[(int) (0xffL & (aLong2752 ^ (long) anInt2749))]);
	    int i = 0;
	    if (arg0 != true)
		anIntArrayArray2755 = null;
	    for (/**/; (i ^ 0xffffffff) > -13; i++) {
		aLong2752 = ls[(int) ((aLong2752 ^ (long) (anIntArray2745[i]
							   >> 1927867736))
				      & 0xffL)] ^ aLong2752 >>> -1337198392;
		aLong2752
		    = (aLong2752 >>> -1918601784
		       ^ ls[(int) (((long) (anIntArray2745[i] >> 911197040)
				    ^ aLong2752)
				   & 0xffL)]);
		aLong2752 = ls[(int) ((aLong2752 ^ (long) (anIntArray2745[i]
							   >> 2022651176))
				      & 0xffL)] ^ aLong2752 >>> 563185096;
		aLong2752
		    = (aLong2752 >>> 462097480
		       ^ ls[(int) (0xffL
				   & (aLong2752 ^ (long) anIntArray2745[i]))]);
	    }
	    for (int i_111_ = 0; (i_111_ ^ 0xffffffff) > -6; i_111_++)
		aLong2752
		    = (aLong2752 >>> -904710648
		       ^ ls[(int) ((aLong2752 ^ (long) anIntArray2756[i_111_])
				   & 0xffL)]);
	    aLong2752 = (aLong2752 >>> -1467105144
			 ^ ls[(int) (0xffL & ((long) (!aBoolean2744 ? 0 : 1)
					      ^ aLong2752))]);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tb.L(" + arg0 + ')');
	}
    }
    
    public static void method2599(byte arg0) {
	try {
	    int i = -17 % ((arg0 - 50) / 49);
	    aClass131_Sub26_2757 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tb.H(" + arg0 + ')');
	}
    }
}
