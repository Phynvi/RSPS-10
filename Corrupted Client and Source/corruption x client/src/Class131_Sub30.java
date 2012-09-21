/* Class131_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub30 extends Class131
{
    public static int anInt4515;
    public static int anInt4516;
    public static int[] anIntArray4517;
    public static int anInt4518;
    public static int anInt4519;
    public volatile String aString4520;
    public volatile int anInt4521 = -1;
    public static int anInt4522;
    /*synthetic*/ public static Class aClass4523;
    
    public static void method1853(byte arg0, String arg1) {
	try {
	    anInt4518++;
	    if (!arg1.equals("")) {
		Class131_Sub32.anInt4552++;
		Class93.aClass131_Sub15_Sub2_1226.createPacket(36);
		Class93.aClass131_Sub15_Sub2_1226
		    .writeByte(method1856((byte) -118, arg1));
		Class93.aClass131_Sub15_Sub2_1226.writeString(arg1, (byte) 124);
		int i = -17 % ((-23 - arg0) / 52);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sa.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1854(int arg0) {
	try {
	    synchronized (Class169.aClass214_2267) {
		Class169.aClass214_2267.method2783(arg0 ^ ~0x3d);
		if (arg0 != 104)
		    method1854(78);
	    }
	    anInt4516++;
	    synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		Class131_Sub41_Sub5.aClass214_6226.method2783(-99);
	    }
	    synchronized (Class23_Sub3_Sub1.aClass103_5226) {
		Class23_Sub3_Sub1.aClass103_5226.method899((byte) 88);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sa.C(" + arg0 + ')');
	}
    }
    
    public static void method1855(byte arg0) {
	anIntArray4517 = null;
	if (arg0 != 64)
	    method1855((byte) 15);
    }
    
    public static int method1856(byte arg0, String arg1) {
	try {
	    anInt4519++;
	    if (arg0 > -102)
		anIntArray4517 = null;
	    return arg1.length() + 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sa.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1857(Object[] arg0, long[] arg1, int arg2,
				  byte arg3, int arg4) {
	do {
	    try {
		anInt4515++;
		if (arg3 < 106)
		    method1857(null, null, -94, (byte) 94, -55);
		if (arg4 >= arg2)
		    break;
		int i = (arg2 + arg4) / 2;
		int i_0_ = arg4;
		long l = arg1[i];
		arg1[i] = arg1[arg2];
		arg1[arg2] = l;
		Object object = arg0[i];
		arg0[i] = arg0[arg2];
		arg0[arg2] = object;
		for (int i_1_ = arg4;
		     (i_1_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_1_++) {
		    if ((arg1[i_1_] ^ 0xffffffffffffffffL)
			> ((long) (0x1 & i_1_) + l ^ 0xffffffffffffffffL)) {
			long l_2_ = arg1[i_1_];
			arg1[i_1_] = arg1[i_0_];
			arg1[i_0_] = l_2_;
			Object object_3_ = arg0[i_1_];
			arg0[i_1_] = arg0[i_0_];
			arg0[i_0_++] = object_3_;
		    }
		}
		arg1[arg2] = arg1[i_0_];
		arg1[i_0_] = l;
		arg0[arg2] = arg0[i_0_];
		arg0[i_0_] = object;
		method1857(arg0, arg1, i_0_ + -1, (byte) 117, arg4);
		method1857(arg0, arg1, arg2, (byte) 112, i_0_ - -1);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("sa.A("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ',' + arg3
						     + ',' + arg4 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static boolean method1858(Class130 arg0, int arg1, int arg2) {
	try {
	    anInt4522++;
	    int i = (-104 + Class131_Sub41_Sub11_Sub1.anInt6546) / 2;
	    int i_4_ = (Class131_Sub2_Sub26.anInt5931 + -104) / 2;
	    boolean bool = true;
	    for (int i_5_ = i; i_5_ < i + 104; i_5_++) {
		for (int i_6_ = i_4_; i_4_ - -104 > i_6_; i_6_++) {
		    for (int i_7_ = arg1; (i_7_ ^ 0xffffffff) >= -4; i_7_++) {
			if (Class45.method561(i_5_, true, i_6_, i_7_, arg1)) {
			    int i_8_ = i_7_;
			    if (Class91.method843(i_6_, (byte) 72, i_5_))
				i_8_--;
			    if (i_8_ >= 0)
				bool &= (Class131_Sub2_Sub37.method1639
					 (arg2 ^ ~0x3fe, i_8_, i_6_, i_5_));
			}
		    }
		}
	    }
	    if (!bool)
		return false;
	    int[] is = new int[262144];
	    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
		 i_9_++)
		is[i_9_] = -16777216;
	    Class131_Sub20.aClass152_4423
		= arg0.method1247(is, 0, 512, 512, 512);
	    Class23_Sub3.method318((byte) 57);
	    int i_10_
		= (~0xffffff
		   | ((-10 + (int) (20.0 * Math.random()) + 238 << -104648784)
		      - (-(238 + ((int) (20.0 * Math.random()) - 10)
			   << 138492008)
			 + -(int) (Math.random() * 20.0))
		      - -228));
	    int i_11_
		= ~0xffffff | 238 + ((int) ((double) arg2 * Math.random())
				     - 10) << 162989072;
	    int i_12_ = ((int) (8.0 * Math.random())
			 | ((int) (Math.random() * 8.0) << -631012888
			    | (int) (8.0 * Math.random()) << -1781445008));
	    boolean[][] bools = (new boolean[Class131_Sub4.anInt4129]
				 [Class131_Sub4.anInt4129]);
	    for (int i_13_ = i; i_13_ < 104 + i;
		 i_13_ += Class131_Sub4.anInt4129) {
		for (int i_14_ = i_4_;
		     (i_14_ ^ 0xffffffff) > (i_4_ - -104 ^ 0xffffffff);
		     i_14_ += Class131_Sub4.anInt4129) {
		    arg0.method1188(0, 0, Class131_Sub4.anInt4129 * 4,
				    Class131_Sub4.anInt4129 * 4);
		    arg0.method1191(-16777216);
		    for (int i_15_ = arg1; (i_15_ ^ 0xffffffff) >= -4;
			 i_15_++) {
			for (int i_16_ = 0;
			     ((Class131_Sub4.anInt4129 ^ 0xffffffff)
			      < (i_16_ ^ 0xffffffff));
			     i_16_++) {
			    for (int i_17_ = 0;
				 i_17_ < Class131_Sub4.anInt4129; i_17_++)
				bools[i_16_][i_17_]
				    = Class45.method561(i_16_ + i_13_, true,
							i_17_ + i_14_, i_15_,
							arg1);
			}
			Class131_Sub2_Sub37.aClass68Array6057[i_15_].method710
			    (0, 0, 1024, i_13_, i_14_,
			     Class131_Sub4.anInt4129 + i_13_,
			     i_14_ + Class131_Sub4.anInt4129, bools);
			if (!Class120.aBoolean1579) {
			    for (int i_18_ = -4;
				 Class131_Sub4.anInt4129 > i_18_; i_18_++) {
				for (int i_19_ = -4;
				     i_19_ < Class131_Sub4.anInt4129;
				     i_19_++) {
				    int i_20_ = i_13_ - -i_18_;
				    int i_21_ = i_19_ + i_14_;
				    if (i <= i_20_
					&& ((i_21_ ^ 0xffffffff)
					    <= (i_4_ ^ 0xffffffff))
					&& Class45.method561(i_20_, true,
							     i_21_, i_15_,
							     arg1)) {
					int i_22_ = i_15_;
					if (Class91.method843(i_21_, (byte) 72,
							      i_20_))
					    i_22_--;
					if ((i_22_ ^ 0xffffffff) <= -1)
					    Class131_Sub2_Sub28.method1606
						(i_10_, i_11_, i_18_ * 4,
						 i_22_, arg0, true, i_21_,
						 i_20_,
						 ((-i_19_
						   + Class131_Sub4.anInt4129)
						  * 4) - 4);
				    }
				}
			    }
			}
		    }
		    if (Class120.aBoolean1579) {
			Class19 class19
			    = Class131_Sub2_Sub9.aClass19Array5682[arg1];
			for (int i_23_ = 0;
			     ((Class131_Sub4.anInt4129 ^ 0xffffffff)
			      < (i_23_ ^ 0xffffffff));
			     i_23_++) {
			    for (int i_24_ = 0;
				 i_24_ < Class131_Sub4.anInt4129; i_24_++) {
				int i_25_ = i_23_ + i_13_;
				int i_26_ = i_24_ + i_14_;
				int i_27_ = (class19.clipping
					     [i_25_ + -class19.anInt206]
					     [i_26_ + -class19.anInt218]);
				if ((i_27_ & 0x40240000 ^ 0xffffffff) != -1)
				    arg0.method1201(4, 4, 4 * i_23_,
						    ((-i_24_ + (Class131_Sub4
								.anInt4129))
						     * 4) + -4,
						    -1713569622, -91);
				else if ((i_27_ & 0x800000 ^ 0xffffffff)
					 == -1) {
				    if ((0x2000000 & i_27_) != 0)
					arg0.method1253(true,
							-4 + ((Class131_Sub4
							       .anInt4129)
							      + -i_24_) * 4,
							-1713569622,
							3 + 4 * i_23_, 4);
				    else if ((i_27_ & 0x8000000) != 0)
					arg0.method1225(4 * i_23_, -1713569622,
							(byte) -118, 4,
							(-1
							 + 4 * ((Class131_Sub4
								 .anInt4129)
								+ -i_24_)));
				    else if ((i_27_ & 0x20000000 ^ 0xffffffff)
					     != -1)
					arg0.method1253(true,
							-4 + ((-i_24_
							       + (Class131_Sub4
								  .anInt4129))
							      * 4),
							-1713569622, i_23_ * 4,
							4);
				} else
				    arg0.method1225(i_23_ * 4, -1713569622,
						    (byte) -99, 4,
						    -4 + 4 * (-i_24_
							      + (Class131_Sub4
								 .anInt4129)));
			    }
			}
		    }
		    arg0.method1173(0, 0, 4 * Class131_Sub4.anInt4129,
				    4 * Class131_Sub4.anInt4129, i_12_, 2);
		    Class131_Sub20.aClass152_4423.method2215
			((-i + i_13_) * 4 + 48,
			 (-(Class131_Sub4.anInt4129 * 4)
			  + (464 - (i_14_ - i_4_) * 4)),
			 Class131_Sub4.anInt4129 * 4,
			 Class131_Sub4.anInt4129 * 4, 0, 0);
		}
	    }
	    arg0.method1244();
	    arg0.method1191(-16777215);
	    Class131_Sub2_Sub16.method1548((byte) -125);
	    Class153.anInt2041 = 0;
	    Class79.aClass119_1058.method1012(0);
	    if (!Class120.aBoolean1579) {
		for (int i_28_ = i; i - -104 > i_28_; i_28_++) {
		    for (int i_29_ = i_4_;
			 (i_29_ ^ 0xffffffff) > (i_4_ + 104 ^ 0xffffffff);
			 i_29_++) {
			for (int i_30_ = arg1;
			     arg1 - -1 >= i_30_ && i_30_ <= 3; i_30_++) {
			    if (Class45.method561(i_28_, true, i_29_, i_30_,
						  arg1)) {
				Interface6 interface6
				    = ((Interface6)
				       Class186.method2564(i_30_, i_28_,
							   i_29_));
				if (interface6 == null)
				    interface6
					= ((Interface6)
					   (Class63.method662
					    (i_30_, i_28_, i_29_,
					     (aClass4523 != null ? aClass4523
					      : (aClass4523
						 = (method1859
						    ("Interface6")))))));
				if (interface6 == null)
				    interface6
					= ((Interface6)
					   Class43.method521(i_30_, i_28_,
							     i_29_));
				if (interface6 == null)
				    interface6
					= ((Interface6)
					   Class106.method918(i_30_, i_28_,
							      i_29_));
				if (interface6 != null) {
				    Class187 class187
					= (Class55.method612
					   (interface6.method23((byte) -127),
					    114));
				    if (!class187.aBoolean2721
					|| Class131_Sub9.aBoolean4218) {
					int i_31_ = class187.anInt2688;
					if (class187.anIntArray2653 != null) {
					    for (int i_32_ = 0;
						 ((i_32_ ^ 0xffffffff)
						  > ((class187
						      .anIntArray2653).length
						     ^ 0xffffffff));
						 i_32_++) {
						if ((class187.anIntArray2653
						     [i_32_])
						    != -1) {
						    Class187 class187_33_
							= (Class55.method612
							   ((class187
							     .anIntArray2653
							     [i_32_]),
							    -115));
						    if (class187_33_.anInt2688
							>= 0)
							i_31_ = (class187_33_
								 .anInt2688);
						}
					    }
					}
					if (i_31_ >= 0) {
					    boolean bool_34_ = false;
					    if (i_31_ >= 0) {
						Class94 class94
						    = (Class131_Sub2_Sub32
							   .method1626
						       (i_31_, (byte) 1));
						if (class94 != null
						    && class94.aBoolean1250)
						    bool_34_ = true;
					    }
					    int i_35_ = i_28_;
					    int i_36_ = i_29_;
					    if (bool_34_) {
						int[][] is_37_
						    = (Class131_Sub2_Sub9
						       .aClass19Array5682
						       [i_30_]
						       .clipping);
						int i_38_ = (Class131_Sub2_Sub9
							     .aClass19Array5682
							     [i_30_].anInt206);
						int i_39_ = (Class131_Sub2_Sub9
							     .aClass19Array5682
							     [i_30_].anInt218);
						for (int i_40_ = 0; i_40_ < 10;
						     i_40_++) {
						    int i_41_
							= (int) (4.0
								 * (Math.random
								    ()));
						    if (((i_41_ ^ 0xffffffff)
							 == -1)
							&& i_35_ > i
							&& i_28_ + -3 < i_35_
							&& ((0x2c0108
							     & (is_37_
								[(-i_38_ + -1
								  + i_35_)]
								[(i_36_
								  + -i_39_)]))
							    == 0))
							i_35_--;
						    if (((i_41_ ^ 0xffffffff)
							 == -2)
							&& i_35_ < -1 + (104
									 + i)
							&& i_35_ < i_28_ - -3
							&& ((is_37_
							     [-i_38_ + (i_35_
									- -1)]
							     [-i_39_ + i_36_])
							    & 0x2c0180) == 0)
							i_35_++;
						    if (i_41_ == 2
							&& ((i_36_
							     ^ 0xffffffff)
							    < (i_4_
							       ^ 0xffffffff))
							&& ((i_36_
							     ^ 0xffffffff)
							    < (-3 + i_29_
							       ^ 0xffffffff))
							&& (((0x2c0102
							      & (is_37_
								 [(i_35_
								   - i_38_)]
								 [(-1 + i_36_
								   - i_39_)]))
							     ^ 0xffffffff)
							    == -1))
							i_36_--;
						    if (((i_41_ ^ 0xffffffff)
							 == -4)
							&& ((-1 + (104 + i_4_)
							     ^ 0xffffffff)
							    < (i_36_
							       ^ 0xffffffff))
							&& i_36_ < 3 + i_29_
							&& ((is_37_
							     [-i_38_ + i_35_]
							     [-i_39_ + (i_36_
									+ 1)])
							    & 0x2c0120) == 0)
							i_36_++;
						}
					    }
					    Class40.anIntArray521[(Class153
								   .anInt2041)]
						= class187.anInt2713;
					    Class45.anIntArray620[(Class153
								   .anInt2041)]
						= i_35_;
					    Class131_Sub2_Sub24
						.anIntArray5896
						[Class153.anInt2041]
						= i_36_;
					    Class153.anInt2041++;
					}
				    }
				}
			    }
			}
		    }
		}
		if (Class131_Sub8.aClass177_4188 != null) {
		    Class116.aClass158_1506.anInt2097 = 1;
		    Class131_Sub7.method1666(1024, 64, 119);
		    for (int i_42_ = 0;
			 i_42_ < Class131_Sub8.aClass177_4188.anInt2526;
			 i_42_++) {
			int i_43_ = (Class131_Sub8.aClass177_4188
				     .anIntArray2528[i_42_]);
			if ((i_43_ >> 565766652 ^ 0xffffffff)
			    == (Class29.anInt300 ^ 0xffffffff)) {
			    int i_44_ = (((0xfffeada & i_43_) >> -782419602)
					 - Class92.regionX);
			    int i_45_ = (i_43_ & 0x3fff) + -Class64.regionY;
			    if ((i_44_ ^ 0xffffffff) > -1
				|| ((i_44_ ^ 0xffffffff)
				    <= (Class131_Sub41_Sub11_Sub1.anInt6546
					^ 0xffffffff))
				|| i_45_ < 0
				|| (Class131_Sub2_Sub26.anInt5931
				    ^ 0xffffffff) >= (i_45_ ^ 0xffffffff)) {
				Class94 class94
				    = (Class131_Sub2_Sub32.method1626
				       ((Class131_Sub8.aClass177_4188
					 .anIntArray2529[i_42_]),
					(byte) 1));
				if (class94.anIntArray1269 != null
				    && class94.anInt1236 + i_44_ >= 0
				    && ((i_44_ + class94.anInt1267
					 ^ 0xffffffff)
					> (Class131_Sub41_Sub11_Sub1.anInt6546
					   ^ 0xffffffff))
				    && i_45_ - -class94.anInt1259 >= 0
				    && (Class131_Sub2_Sub26.anInt5931
					> class94.anInt1252 + i_45_))
				    Class79.aClass119_1058.method1018
					((byte) -127,
					 new Class131_Sub24(i_42_));
			    } else
				Class79.aClass119_1058.method1018
				    ((byte) -125, new Class131_Sub24(i_42_));
			}
		    }
		    Class131_Sub7.method1666(128, 64, 4);
		    Class116.aClass158_1506.anInt2097 = 2;
		    Class116.aClass158_1506.method2356(false);
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sa.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public Class131_Sub30(String arg0) {
	try {
	    aString4520 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sa.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method1859(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
