/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class79
{
    public static Class119 aClass119_1058 = new Class119();
    public static int anInt1059;
    public static int anInt1060;
    public static int anInt1061;
    public static int[] anIntArray1062 = new int[2500];
    
    public static void method782(byte arg0, int arg1, Class130 arg2,
				 Class173 arg3, int arg4) {
	try {
	    anInt1061++;
	    Class183 class183 = arg3.method2455(0, arg2);
	    if (arg0 > 66 && class183 != null) {
		arg2.method1188(arg1, arg4, arg1 - -arg3.anInt2411,
				arg4 - -arg3.anInt2437);
		if (Class131_Sub31.anInt4524 != 2
		    && (Class131_Sub31.anInt4524 ^ 0xffffffff) != -6
		    && Class131_Sub20.aClass152_4423 != null) {
		    int i;
		    int i_0_;
		    int i_1_;
		    int i_2_;
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -5) {
			i_2_ = Class50.anInt657;
			i_0_ = Class23_Sub2_Sub2.anInt5169;
			i = 4096;
			i_1_ = (int) -Class120.aFloat1578 & 0x3fff;
		    } else {
			i = -(Class1_Sub7.anInt3590 * 16) + 4096;
			i_0_ = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733;
			i_1_ = 0x3fff & (Class148.anInt1982
					 + (int) -Class120.aFloat1578);
			i_2_ = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747;
		    }
		    int i_3_
			= 48 - (-(i_0_ / 32) + -208
				+ 2 * Class131_Sub41_Sub11_Sub1.anInt6546);
		    int i_4_ = (48
				+ (Class131_Sub2_Sub26.anInt5931 * 4
				   - (i_2_ / 32 - 208))
				+ -(Class131_Sub2_Sub26.anInt5931 * 2));
		    Class131_Sub20.aClass152_4423.method2213
			((float) arg1 + (float) arg3.anInt2411 / 2.0F,
			 (float) arg4 + (float) arg3.anInt2437 / 2.0F,
			 (float) i_3_, (float) i_4_, i, i_1_ << -1708890942,
			 class183, arg1, arg4);
		    for (Class131_Sub24 class131_sub24
			     = (Class131_Sub24) aClass119_1058.method1007(0);
			 class131_sub24 != null;
			 class131_sub24
			     = (Class131_Sub24) aClass119_1058.method1014(0)) {
			int i_5_ = class131_sub24.anInt4465;
			int i_6_ = (((Class131_Sub8.aClass177_4188
				      .anIntArray2528[i_5_]) >> -1844046514
				     & 0x3fff)
				    - Class92.regionX);
			int i_7_ = (-Class64.regionY
				    + (0x3fff & (Class131_Sub8.aClass177_4188
						 .anIntArray2528[i_5_])));
			int i_8_ = -(i_0_ / 32) + (i_6_ * 4 + 2);
			int i_9_ = -(i_2_ / 32) + 2 + 4 * i_7_;
			Class130.method1258(arg4, i_8_,
					    (Class131_Sub8.aClass177_4188
					     .anIntArray2529[i_5_]),
					    arg2, 2, class183, i_9_, arg1,
					    arg3);
		    }
		    for (int i_10_ = 0;
			 ((i_10_ ^ 0xffffffff)
			  > (Class153.anInt2041 ^ 0xffffffff));
			 i_10_++) {
			int i_11_ = 2 + (Class45.anIntArray620[i_10_] * 4
					 - i_0_ / 32);
			int i_12_
			    = (Class131_Sub2_Sub24.anIntArray5896[i_10_] * 4
			       + 2 + -(i_2_ / 32));
			Class187 class187
			    = Class55.method612(Class40.anIntArray521[i_10_],
						-54);
			if (class187.anIntArray2653 != null) {
			    class187 = class187.method2573(18);
			    if (class187 == null || class187.anInt2688 == -1)
				continue;
			}
			Class130.method1258(arg4, i_11_, class187.anInt2688,
					    arg2, 2, class183, i_12_, arg1,
					    arg3);
		    }
		    for (Class131_Sub10 class131_sub10
			     = ((Class131_Sub10)
				Class131_Sub24.aClass180_4468.method2520(0));
			 class131_sub10 != null;
			 class131_sub10
			     = ((Class131_Sub10)
				Class131_Sub24.aClass180_4468.method2518(0))) {
			int i_13_
			    = (int) (0x3L
				     & class131_sub10.aLong1791 >> -663797220);
			if (Class22.anInt247 == i_13_) {
			    int i_14_ = (-(i_0_ / 32)
					 + (int) (class131_sub10.aLong1791
						  & 0x3fffL) * 4
					 + 2);
			    int i_15_
				= (-(i_2_ / 32)
				   + (4 * (int) ((class131_sub10.aLong1791
						  >> -2096239538)
						 & 0x3fffL)
				      + 2));
			    Class131_Sub2_Sub3.method1487(arg1, i_15_,
							  class183, 2,
							  (Class156
							   .aClass152Array2075
							   [0]),
							  arg4, arg3, i_14_);
			}
		    }
		    for (int i_16_ = 0; i_16_ < Class131_Sub41_Sub2.anInt6186;
			 i_16_++) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379
			       [Class131_Sub41_Sub12.anIntArray6316[i_16_]]);
			if (class23_sub4_sub1_sub1 != null
			    && class23_sub4_sub1_sub1.method350(false)) {
			    Class66 class66
				= class23_sub4_sub1_sub1.aClass66_6474;
			    if (class66 != null
				&& class66.anIntArray845 != null)
				class66 = class66.method697(true);
			    if (class66 != null && class66.aBoolean891
				&& class66.aBoolean841) {
				int i_17_
				    = (class23_sub4_sub1_sub1.anInt3733 / 32
				       + -(i_0_ / 32));
				int i_18_
				    = (-(i_2_ / 32)
				       + (class23_sub4_sub1_sub1.anInt3747
					  / 32));
				if (class66.anInt870 == -1)
				    Class131_Sub2_Sub3.method1487
					(arg1, i_18_, class183, 2,
					 Class156.aClass152Array2075[1], arg4,
					 arg3, i_17_);
				else
				    Class130.method1258(arg4, i_17_,
							class66.anInt870, arg2,
							2, class183, i_18_,
							arg1, arg3);
			    }
			}
		    }
		    for (int i_19_ = 0; i_19_ < Class131_Sub38.anInt4618;
			 i_19_++) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
			       [Class148.anIntArray1983[i_19_]]);
			if (class23_sub4_sub1_sub2 != null
			    && class23_sub4_sub1_sub2.method359(false)) {
			    int i_20_ = (class23_sub4_sub1_sub2.anInt3733 / 32
					 - i_0_ / 32);
			    int i_21_ = (class23_sub4_sub1_sub2.anInt3747 / 32
					 - i_2_ / 32);
			    boolean bool = false;
			    for (int i_22_ = 0;
				 ((Class33.anInt469 ^ 0xffffffff)
				  < (i_22_ ^ 0xffffffff));
				 i_22_++) {
				if ((class23_sub4_sub1_sub2.aString6491.equals
				     (Class23_Sub2.aStringArray3707[i_22_]))
				    && (Class143.anIntArray1906[i_22_]
					^ 0xffffffff) != -1) {
				    bool = true;
				    break;
				}
			    }
			    boolean bool_23_ = false;
			    for (int i_24_ = 0;
				 ((i_24_ ^ 0xffffffff)
				  > (Class74.anInt999 ^ 0xffffffff));
				 i_24_++) {
				if (class23_sub4_sub1_sub2.aString6491.equals
				    (Canvas_Sub1.aClass184Array46[i_24_]
				     .aString2620)) {
				    bool_23_ = true;
				    break;
				}
			    }
			    boolean bool_25_ = false;
			    if ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				 .anInt6530) != 0
				&& class23_sub4_sub1_sub2.anInt6530 != 0
				&& ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anInt6530)
				    == class23_sub4_sub1_sub2.anInt6530))
				bool_25_ = true;
			    if (!bool) {
				if (!bool_23_) {
				    if (!bool_25_)
					Class131_Sub2_Sub3.method1487
					    (arg1, i_21_, class183, 2,
					     Class156.aClass152Array2075[2],
					     arg4, arg3, i_20_);
				    else
					Class131_Sub2_Sub3.method1487
					    (arg1, i_21_, class183, 2,
					     Class156.aClass152Array2075[4],
					     arg4, arg3, i_20_);
				} else
				    Class131_Sub2_Sub3.method1487
					(arg1, i_21_, class183, 2,
					 Class156.aClass152Array2075[5], arg4,
					 arg3, i_20_);
			    } else
				Class131_Sub2_Sub3.method1487
				    (arg1, i_21_, class183, 2,
				     Class156.aClass152Array2075[3], arg4,
				     arg3, i_20_);
			}
		    }
		    Class87[] class87s = Class131_Sub2_Sub5.aClass87Array5612;
		    for (int i_26_ = 0; class87s.length > i_26_; i_26_++) {
			Class87 class87 = class87s[i_26_];
			if (class87 != null && class87.anInt1135 != 0
			    && (Class125.anInt1632 % 20 ^ 0xffffffff) > -11) {
			    if ((class87.anInt1135 ^ 0xffffffff) == -2
				&& class87.anInt1126 >= 0
				&& (((Class23_Sub4_Sub2
				      .aClass23_Sub4_Sub1_Sub1Array5379).length
				     ^ 0xffffffff)
				    < (class87.anInt1126 ^ 0xffffffff))) {
				Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				    = (Class23_Sub4_Sub2
				       .aClass23_Sub4_Sub1_Sub1Array5379
				       [class87.anInt1126]);
				if (class23_sub4_sub1_sub1 != null) {
				    int i_27_
					= (-(i_0_ / 32)
					   + (class23_sub4_sub1_sub1.anInt3733
					      / 32));
				    int i_28_
					= ((class23_sub4_sub1_sub1.anInt3747
					    / 32)
					   - i_2_ / 32);
				    Class131_Sub2_Sub2.method1479
					(class87.anInt1143, class183, arg1,
					 360000, (byte) -43, arg4, arg3, i_27_,
					 i_28_);
				}
			    }
			    if (class87.anInt1135 == 2) {
				int i_29_
				    = -(i_0_ / 32) + ((-Class92.regionX
						       + class87.anInt1127) * 4
						      - -2);
				int i_30_ = (-(i_2_ / 32)
					     + (class87.anInt1137
						+ -Class64.regionY) * 4
					     + 2);
				int i_31_ = class87.anInt1134 * 4;
				i_31_ *= i_31_;
				Class131_Sub2_Sub2.method1479
				    (class87.anInt1143, class183, arg1, i_31_,
				     (byte) -90, arg4, arg3, i_29_, i_30_);
			    }
			    if (class87.anInt1135 == 10
				&& class87.anInt1126 >= 0
				&& (((Class105
				      .aClass23_Sub4_Sub1_Sub2Array1373).length
				     ^ 0xffffffff)
				    < (class87.anInt1126 ^ 0xffffffff))) {
				Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
				    = (Class105
				       .aClass23_Sub4_Sub1_Sub2Array1373
				       [class87.anInt1126]);
				if (class23_sub4_sub1_sub2 != null) {
				    int i_32_
					= ((class23_sub4_sub1_sub2.anInt3733
					    / 32)
					   - i_0_ / 32);
				    int i_33_
					= ((class23_sub4_sub1_sub2.anInt3747
					    / 32)
					   + -(i_2_ / 32));
				    Class131_Sub2_Sub2.method1479
					(class87.anInt1143, class183, arg1,
					 360000, (byte) 104, arg4, arg3, i_32_,
					 i_33_);
				}
			    }
			}
		    }
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) != -5) {
			if ((Class131_Sub2_Sub6.LocalX ^ 0xffffffff)
			    != -1) {
			    int i_34_
				= (4 * Class131_Sub2_Sub6.LocalX
				   + (2 + -(i_0_ / 32))
				   + 2 * (Class166
					      .aClass23_Sub4_Sub1_Sub2_2216
					      .method335((byte) -74)
					  - 1));
			    int i_35_
				= (-(i_2_ / 32)
				   + (2 + Class169.LocalY * 4
				      - -(2
					  * (Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .method335((byte) -124)
					     + -1))));
			    Class131_Sub2_Sub3.method1487
				(arg1, i_35_, class183, 2,
				 (Class131_Sub2_Sub33.aClass152Array6023
				  [!Class78.aBoolean1051 ? 0 : 1]),
				 arg4, arg3, i_34_);
			}
			arg2.method1201(3, 3,
					-1 + arg1 - -(arg3.anInt2411 / 2),
					-1 + arg4 + arg3.anInt2437 / 2, -1,
					-122);
		    }
		} else
		    arg2.method1192(-16777216, class183, arg1, arg4);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ij.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method783(int arg0) {
	try {
	    anIntArray1062 = null;
	    if (arg0 != 2)
		aClass119_1058 = null;
	    aClass119_1058 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ij.A(" + arg0 + ')');
	}
    }
    
    public static void method784(byte arg0, boolean arg1) {
	try {
	    Class43.method522(123);
	    anInt1059++;
	    if ((Class133.anInt1803 ^ 0xffffffff) == -31
		|| Class133.anInt1803 == 25) {
		Class131_Sub2_Sub34.anInt6032++;
		if (Class131_Sub2_Sub34.anInt6032 >= 50 || arg1) {
		    Class131_Sub2_Sub34.anInt6032 = 0;
		    if (!Class143.aBoolean1903
			&& Class128_Sub1.aClass33_4013 != null) {
			Class220.anInt3220++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(255);
			try {
			    Class128_Sub1.aClass33_4013.method454
				(108,
				 Class93.aClass131_Sub15_Sub2_1226.offset,
				 0,
				 (Class93.aClass131_Sub15_Sub2_1226
				  .data));
			    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
			} catch (java.io.IOException ioexception) {
			    Class143.aBoolean1903 = true;
			}
		    }
		    int i = -123 % ((-65 - arg0) / 53);
		    Class43.method522(116);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ij.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
