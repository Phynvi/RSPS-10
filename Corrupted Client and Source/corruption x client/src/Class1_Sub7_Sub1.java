/* Class1_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class1_Sub7_Sub1 extends Class1_Sub7
{
    public static int[] anIntArray5206;
    public int anInt5207;
    public static int anInt5208 = 0;
    public static int anInt5209;
    public int anInt5210;
    public int anInt5211;
    public static int anInt5212;
    public static int[] anIntArray5213 = new int[32];
    public int anInt5214;
    public int anInt5215;
    public static int anInt5216;
    public static int anInt5217;
    public byte aByte5218 = 5;
    public int anInt5219;
    public static int anInt5220;
    public static Color[] aColorArray5221;
    public static int anInt5222;
    
    public static void method130(int arg0, int arg1) {
	try {
	    if (arg0 != -1)
		method132(-95, 28);
	    Class23_Sub4_Sub4.anInt5409 = arg1;
	    anInt5216++;
	    synchronized (Class21.aClass214_239) {
		Class21.aClass214_239.method2783(-119);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ea.R(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method131(Class130 arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt5220++;
	    if (arg2 >= 0 && (arg1 ^ 0xffffffff) <= -1
		&& (Class91.anInt1182 ^ 0xffffffff) != -1
		&& Class131_Sub35.anInt4586 != 0) {
		arg0.method1193(Class126.anInt1691, Class110_Sub3.anInt3930,
				Class91.anInt1182, Class131_Sub35.anInt4586);
		arg0.method1188(Class88.anInt1169, Class219.anInt3205,
				Class91.anInt1182, Class131_Sub35.anInt4586);
		if (arg3 == 127) {
		    Class9 class9 = arg0.method1257();
		    class9.method188(Class131_Sub41_Sub17.anInt6393,
				     Class131_Sub2_Sub30.anInt5993,
				     Class204.anInt2976,
				     Class127_Sub1.anInt4009,
				     Class159.anInt2120, Class14.anInt156);
		    arg0.method1260(class9);
		    if ((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff) == -1
			&& Class131_Sub2_Sub37.aClass68Array6057 != null) {
			int i = -1;
			int i_0_ = -1;
			int i_1_ = arg0.method1261();
			int i_2_ = ((arg2 - Class126.anInt1691) * i_1_
				    / Class91.anInt1182);
			int i_3_ = (i_1_ * (-Class110_Sub3.anInt3930 + arg1)
				    / Class131_Sub35.anInt4586);
			int i_4_ = arg0.method1164();
			int i_5_ = (i_4_ * (arg2 - Class126.anInt1691)
				    / Class91.anInt1182);
			int i_6_ = ((arg1 - Class110_Sub3.anInt3930) * i_4_
				    / Class131_Sub35.anInt4586);
			int[] is = { i_2_, i_3_, i_1_ };
			class9.method190(is);
			int[] is_7_ = { i_5_, i_6_, i_4_ };
			class9.method190(is_7_);
			float f = 0.0F;
			int i_8_ = -is[0] + is_7_[0];
			int i_9_ = is_7_[1] - is[1];
			int i_10_ = -is[2] + is_7_[2];
			for (/**/; f < 1.0F; f += 0.01) {
			    int i_11_
				= (int) ((float) is[0] + (float) i_8_ * f);
			    int i_12_ = i_11_ >> 164701095;
			    int i_13_
				= (int) ((float) i_10_ * f + (float) is[2]);
			    int i_14_ = i_13_ >> -1850679449;
			    if (i_12_ > 0 && i_14_ > 0
				&& (Class131_Sub41_Sub11_Sub1.anInt6546
				    ^ 0xffffffff) < (i_12_ ^ 0xffffffff)
				&& i_14_ < Class131_Sub2_Sub26.anInt5931) {
				int i_15_ = Class29.anInt300;
				if (i_15_ < 3 && ((Class23_Sub2_Sub1
						   .aByteArrayArrayArray4992[1]
						   [i_12_][i_14_])
						  & 0x2) != 0)
				    i_15_++;
				if ((float) Class131_Sub2_Sub37
						.aClass68Array6057[i_15_]
						.method720(i_11_, i_13_)
				    < (float) is[1] + (float) i_9_ * f) {
				    i = (i_11_
					 - -((-1
					      + Class166
						    .aClass23_Sub4_Sub1_Sub2_2216
						    .method335((byte) -30))
					     * 64)) >> 1295521991;
				    i_0_ = (Class166
						.aClass23_Sub4_Sub1_Sub2_2216
						.method335((byte) -64)
					    - 1) * 64 + i_13_ >> 1122028071;
				    break;
				}
			    }
			}
			if ((i ^ 0xffffffff) != 0
			    && (i_0_ ^ 0xffffffff) != 0) {
			    if (Class154.aBoolean2047
				&& ((Class193.anInt2839 & 0x40 ^ 0xffffffff)
				    != -1)) {
				Class173 class173
				    = InputStream_Sub1.method87((Class98
								 .anInt1306),
								(Class88
								 .anInt1161),
								(byte) -119);
				if (class173 == null)
				    Class63.method666(arg3 + 2751);
				else
				    Class131_Sub31.method1860
					(Class131_Sub41_Sub21.anInt6447, 0L,
					 Class131_Sub41_Sub2.aString6191, -1,
					 i, " ->", i_0_, 50);
			    } else {
				if ((Class126.anInt1696 ^ 0xffffffff) == -2)
				    Class131_Sub31.method1860(-1, 0L,
							      (Class144
							       .aString1919),
							      -1, i, "", i_0_,
							      17);
				Class131_Sub41_Sub16.anInt6370++;
				Class131_Sub31.method1860(-1, 0L,
							  Class143.aString1910,
							  -1, i, "", i_0_, 57);
			    }
			}
		    }
		    Class50 class50 = Class134.aClass50_1807;
		    Class1_Sub2 class1_sub2
			= (Class1_Sub2) class50.method586((byte) 42);
		    for (/**/; class1_sub2 != null;
			 class1_sub2 = (Class1_Sub2) class50.method589(-95)) {
			if (class1_sub2.method102(arg0, (byte) 67, arg2, arg1)
			    && Class29.anInt300 == class1_sub2.anInt3501) {
			    if (class1_sub2.aClass23_3503
				instanceof Class23_Sub4_Sub1_Sub2) {
				Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
				    = ((Class23_Sub4_Sub1_Sub2)
				       class1_sub2.aClass23_3503);
				int i = class23_sub4_sub1_sub2
					    .method335((byte) -118);
				if (((0x1 & i) == 0
				     && ((0x7f
					  & class23_sub4_sub1_sub2.anInt3733)
					 ^ 0xffffffff) == -1
				     && ((0x7f
					  & class23_sub4_sub1_sub2.anInt3747)
					 ^ 0xffffffff) == -1)
				    || ((i & 0x1) == 1
					&& ((class23_sub4_sub1_sub2.anInt3733
					     & 0x7f)
					    ^ 0xffffffff) == -65
					&& (0x7f & (class23_sub4_sub1_sub2
						    .anInt3747)) == 64)) {
				    int i_16_
					= (class23_sub4_sub1_sub2.anInt3733
					   - (64 * class23_sub4_sub1_sub2
						       .method335((byte) -51)
					      + -64));
				    int i_17_
					= (class23_sub4_sub1_sub2.anInt3747
					   + (64
					      + -(64 * (class23_sub4_sub1_sub2
							    .method335
							((byte) -106)))));
				    for (int i_18_ = 0;
					 i_18_ < Class131_Sub41_Sub2.anInt6186;
					 i_18_++) {
					Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
					    = (Class23_Sub4_Sub2
					       .aClass23_Sub4_Sub1_Sub1Array5379
					       [(Class131_Sub41_Sub12
						 .anIntArray6316[i_18_])]);
					if (class23_sub4_sub1_sub1 != null
					    && (Class125.anInt1632
						!= (class23_sub4_sub1_sub1
						    .anInt5242))
					    && (class23_sub4_sub1_sub1
						.aBoolean5293)) {
					    int i_19_
						= ((class23_sub4_sub1_sub1
						    .anInt3733)
						   + 64
						   + -((class23_sub4_sub1_sub1
							.aClass66_6474
							.anInt839)
						       * 64));
					    int i_20_
						= ((class23_sub4_sub1_sub1
						    .anInt3747)
						   + (-((class23_sub4_sub1_sub1
							 .aClass66_6474
							 .anInt839)
							* 64)
						      + 64));
					    if (((i_19_ ^ 0xffffffff)
						 <= (i_16_ ^ 0xffffffff))
						&& (((class23_sub4_sub1_sub1
						      .aClass66_6474.anInt839)
						     ^ 0xffffffff)
						    >= ((-(-i_16_ + i_19_
							   >> -802400665)
							 + (class23_sub4_sub1_sub2
								.method335
							    ((byte) -88)))
							^ 0xffffffff))
						&& ((i_17_ ^ 0xffffffff)
						    >= (i_20_ ^ 0xffffffff))
						&& ((class23_sub4_sub1_sub1
						     .aClass66_6474.anInt839)
						    <= (-(-i_17_ + i_20_
							  >> -219477017)
							+ (class23_sub4_sub1_sub2
							       .method335
							   ((byte) -30))))) {
						Class64.method669
						    (false,
						     class23_sub4_sub1_sub1);
						class23_sub4_sub1_sub1
						    .anInt5242
						    = Class125.anInt1632;
					    }
					}
				    }
				    for (int i_21_ = 0;
					 ((i_21_ ^ 0xffffffff)
					  > (Class131_Sub38.anInt4618
					     ^ 0xffffffff));
					 i_21_++) {
					Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2_22_
					    = (Class105
					       .aClass23_Sub4_Sub1_Sub2Array1373
					       [(Class148.anIntArray1983
						 [i_21_])]);
					if (class23_sub4_sub1_sub2_22_ != null
					    && ((class23_sub4_sub1_sub2_22_
						 .anInt5242)
						!= Class125.anInt1632)
					    && (class23_sub4_sub1_sub2_22_
						!= class23_sub4_sub1_sub2)
					    && (class23_sub4_sub1_sub2_22_
						.aBoolean5293)) {
					    int i_23_
						= ((class23_sub4_sub1_sub2_22_
						    .anInt3733)
						   + (64
						      + -(64
							  * (class23_sub4_sub1_sub2_22_
								 .method335
							     ((byte) -32)))));
					    int i_24_
						= ((class23_sub4_sub1_sub2_22_
						    .anInt3747)
						   + -(64
						       * (-1
							  + (class23_sub4_sub1_sub2_22_
								 .method335
							     ((byte) -112)))));
					    if (i_16_ <= i_23_
						&& ((class23_sub4_sub1_sub2_22_
							 .method335((byte) -31)
						     ^ 0xffffffff)
						    >= (((class23_sub4_sub1_sub2
							      .method335
							  ((byte) -123))
							 - (i_23_ + -i_16_
							    >> -1283323833))
							^ 0xffffffff))
						&& i_17_ <= i_24_
						&& ((class23_sub4_sub1_sub2_22_
							 .method335((byte) -69)
						     ^ 0xffffffff)
						    >= (((class23_sub4_sub1_sub2
							      .method335
							  ((byte) -38))
							 + -(i_24_ - i_17_
							     >> -1028212889))
							^ 0xffffffff))) {
						Class182.method2535
						    (class23_sub4_sub1_sub2_22_,
						     2223);
						class23_sub4_sub1_sub2_22_
						    .anInt5242
						    = Class125.anInt1632;
					    }
					}
				    }
				}
				if (class23_sub4_sub1_sub2.anInt5242
				    == Class125.anInt1632)
				    continue;
				Class182.method2535(class23_sub4_sub1_sub2,
						    2223);
				class23_sub4_sub1_sub2.anInt5242
				    = Class125.anInt1632;
			    }
			    if (class1_sub2.aClass23_3503
				instanceof Class23_Sub4_Sub1_Sub1) {
				Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				    = ((Class23_Sub4_Sub1_Sub1)
				       class1_sub2.aClass23_3503);
				if (class23_sub4_sub1_sub1.aClass66_6474
				    != null) {
				    if ((((class23_sub4_sub1_sub1.aClass66_6474
					   .anInt839)
					  & 0x1) == 0
					 && (0x7f & (class23_sub4_sub1_sub1
						     .anInt3733)
					     ^ 0xffffffff) == -1
					 && (0x7f & (class23_sub4_sub1_sub1
						     .anInt3747)) == 0)
					|| (((class23_sub4_sub1_sub1
					      .aClass66_6474.anInt839) & 0x1
					     ^ 0xffffffff) == -2
					    && ((class23_sub4_sub1_sub1
						 .anInt3733) & 0x7f
						^ 0xffffffff) == -65
					    && (0x7f & (class23_sub4_sub1_sub1
							.anInt3747)) == 64)) {
					int i = (64
						 + -((class23_sub4_sub1_sub1
						      .aClass66_6474.anInt839)
						     * 64)
						 + (class23_sub4_sub1_sub1
						    .anInt3733));
					int i_25_
					    = (64
					       + -(64
						   * (class23_sub4_sub1_sub1
						      .aClass66_6474.anInt839))
					       + (class23_sub4_sub1_sub1
						  .anInt3747));
					for (int i_26_ = 0;
					     (i_26_
					      < Class131_Sub41_Sub2.anInt6186);
					     i_26_++) {
					    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1_27_
						= (Class23_Sub4_Sub2
						   .aClass23_Sub4_Sub1_Sub1Array5379
						   [(Class131_Sub41_Sub12
						     .anIntArray6316[i_26_])]);
					    if ((class23_sub4_sub1_sub1_27_
						 != null)
						&& (((class23_sub4_sub1_sub1_27_
						      .anInt5242)
						     ^ 0xffffffff)
						    != (Class125.anInt1632
							^ 0xffffffff))
						&& (class23_sub4_sub1_sub1_27_
						    != class23_sub4_sub1_sub1)
						&& (class23_sub4_sub1_sub1_27_
						    .aBoolean5293)) {
						int i_28_
						    = (-(64
							 * ((class23_sub4_sub1_sub1_27_
							     .aClass66_6474
							     .anInt839)
							    + -1))
						       + (class23_sub4_sub1_sub1_27_
							  .anInt3733));
						int i_29_
						    = (-(64
							 * (class23_sub4_sub1_sub1_27_
							    .aClass66_6474
							    .anInt839))
						       - (-64
							  - (class23_sub4_sub1_sub1_27_
							     .anInt3747)));
						if (((i ^ 0xffffffff)
						     >= (i_28_ ^ 0xffffffff))
						    && (((class23_sub4_sub1_sub1_27_
							  .aClass66_6474
							  .anInt839)
							 ^ 0xffffffff)
							>= ((-(-i + i_28_
							       >> -1799570905)
							     + (class23_sub4_sub1_sub1
								.aClass66_6474
								.anInt839))
							    ^ 0xffffffff))
						    && ((i_29_ ^ 0xffffffff)
							<= (i_25_
							    ^ 0xffffffff))
						    && ((class23_sub4_sub1_sub1_27_
							 .aClass66_6474
							 .anInt839)
							<= ((class23_sub4_sub1_sub1
							     .aClass66_6474
							     .anInt839)
							    - (i_29_ + -i_25_
							       >> 1339946599)))) {
						    Class64.method669
							(false,
							 class23_sub4_sub1_sub1_27_);
						    class23_sub4_sub1_sub1_27_
							.anInt5242
							= Class125.anInt1632;
						}
					    }
					}
					for (int i_30_ = 0;
					     i_30_ < Class131_Sub38.anInt4618;
					     i_30_++) {
					    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
						= (Class105
						   .aClass23_Sub4_Sub1_Sub2Array1373
						   [(Class148.anIntArray1983
						     [i_30_])]);
					    if (class23_sub4_sub1_sub2 != null
						&& ((class23_sub4_sub1_sub2
						     .anInt5242)
						    != Class125.anInt1632)
						&& (class23_sub4_sub1_sub2
						    .aBoolean5293)) {
						int i_31_
						    = ((class23_sub4_sub1_sub2
							.anInt3733)
						       - ((class23_sub4_sub1_sub2
							       .method335
							   ((byte) -99)) * 64
							  - 64));
						int i_32_
						    = ((class23_sub4_sub1_sub2
							.anInt3747)
						       - (-64
							  + ((class23_sub4_sub1_sub2
								  .method335
							      ((byte) -109))
							     * 64)));
						if (((i ^ 0xffffffff)
						     >= (i_31_ ^ 0xffffffff))
						    && (((class23_sub4_sub1_sub2
							      .method335
							  ((byte) -115))
							 ^ 0xffffffff)
							>= (((class23_sub4_sub1_sub1
							      .aClass66_6474
							      .anInt839)
							     - (-i + i_31_
								>> 231564775))
							    ^ 0xffffffff))
						    && i_32_ >= i_25_
						    && (((class23_sub4_sub1_sub2
							      .method335
							  ((byte) -127))
							 ^ 0xffffffff)
							>= (((class23_sub4_sub1_sub1
							      .aClass66_6474
							      .anInt839)
							     + -(i_32_ - i_25_
								 >> -1543328633))
							    ^ 0xffffffff))) {
						    Class182.method2535
							(class23_sub4_sub1_sub2,
							 2223);
						    class23_sub4_sub1_sub2
							.anInt5242
							= Class125.anInt1632;
						}
					    }
					}
				    }
				    if ((Class125.anInt1632 ^ 0xffffffff)
					== (class23_sub4_sub1_sub1.anInt5242
					    ^ 0xffffffff))
					continue;
				    Class64.method669(false,
						      class23_sub4_sub1_sub1);
				    class23_sub4_sub1_sub1.anInt5242
					= Class125.anInt1632;
				}
			    }
			    if (class1_sub2.aClass23_3503
				instanceof Class23_Sub3_Sub1) {
				Class131_Sub10 class131_sub10
				    = ((Class131_Sub10)
				       (Class131_Sub24.aClass180_4468
					    .method2521
					(73,
					 (long) ((class1_sub2.anInt3504
						  << 1065661614)
						 | (class1_sub2.anInt3501
						    << 1126320956)
						 | class1_sub2.anInt3508))));
				if (class131_sub10 != null) {
				    for (Class131_Sub18 class131_sub18
					     = ((Class131_Sub18)
						class131_sub10
						    .aClass119_4226
						    .method1017(0));
					 class131_sub18 != null;
					 class131_sub18
					     = ((Class131_Sub18)
						class131_sub10
						    .aClass119_4226
						    .method1006(-5525))) {
					Class29 class29
					    = (Class131_Sub19.method1808
					       (class131_sub18.anInt4384,
						false));
					if (Class131_Sub1_Sub4.anInt5546
					    != 1) {
					    if (Class154.aBoolean2047) {
						Class131_Sub41_Sub16 class131_sub41_sub16
						    = (Class153.anInt2042 == -1
						       ? null
						       : (Class145.method2163
							  (Class153.anInt2042,
							   true)));
						if (((0x1 & Class193.anInt2839)
						     != 0)
						    && ((class131_sub41_sub16
							 == null)
							|| (((class29.method427
							      (arg3 + -13,
							       (class131_sub41_sub16
								.anInt6374),
							       (Class153
								.anInt2042)))
							     ^ 0xffffffff)
							    != ((class131_sub41_sub16
								 .anInt6374)
								^ 0xffffffff)))) {
						    Class131_Sub31.method1860
							((Class131_Sub41_Sub21
							  .anInt6447),
							 (long) (class131_sub18
								 .anInt4384),
							 (Class131_Sub41_Sub2
							  .aString6191),
							 -1,
							 class1_sub2.anInt3508,
							 (Class112.aString1453
							  + " -> <col=ff9040>"
							  + (class29
							     .aString341)),
							 class1_sub2.anInt3504,
							 7);
						    Class23.anInt257++;
						}
					    } else {
						String[] strings
						    = class29.aStringArray365;
						for (int i = 4; i >= 0; i--) {
						    if (strings != null
							&& (strings[i]
							    != null)) {
							int i_33_ = 0;
							if (i == 0)
							    i_33_ = 5;
							int i_34_
							    = (InputStream_Sub1
							       .anInt57);
							if (i == 1)
							    i_33_ = 39;
							if (i == 2)
							    i_33_ = 46;
							if ((i ^ 0xffffffff)
							    == -4)
							    i_33_ = 58;
							if ((class29.anInt312
							     ^ 0xffffffff)
							    == (i
								^ 0xffffffff))
							    i_34_
								= (class29
								   .anInt308);
							if ((i ^ 0xffffffff)
							    == -5)
							    i_33_ = 60;
							if ((class29.anInt313
							     ^ 0xffffffff)
							    == (i
								^ 0xffffffff))
							    i_34_
								= (class29
								   .anInt301);
							Class131_Sub31
							    .method1860
							    (i_34_,
							     (long) (class131_sub18
								     .anInt4384),
							     strings[i],
							     arg3 + -128,
							     (class1_sub2
							      .anInt3508),
							     ("<col=ff9040>"
							      + (class29
								 .aString341)),
							     (class1_sub2
							      .anInt3504),
							     i_33_);
							Class165.anInt2199++;
						    }
						}
						Class131_Sub31.method1860
						    ((Class131_Sub2_Sub22
						      .anInt5862),
						     (long) (class131_sub18
							     .anInt4384),
						     (Class131_Sub19
						      .aString4404),
						     -1, class1_sub2.anInt3508,
						     ("<col=ff9040>"
						      + class29.aString341),
						     class1_sub2.anInt3504,
						     1005);
						Class110_Sub2.anInt3911++;
					    }
					} else {
					    anInt5222++;
					    Class131_Sub31.method1860
						(Class218.anInt3200,
						 (long) (class131_sub18
							 .anInt4384),
						 Class158.aString2090, -1,
						 class1_sub2.anInt3508,
						 (Class148.aString1979
						  + " -> <col=ff9040>"
						  + class29.aString341),
						 class1_sub2.anInt3504, 32);
					}
				    }
				}
			    }
			    if (class1_sub2.aClass23_3503
				instanceof Interface6) {
				Interface6 interface6
				    = (Interface6) class1_sub2.aClass23_3503;
				Class187 class187
				    = (Class55.method612
				       (interface6.method23((byte) -120),
					-112));
				if (class187.anIntArray2653 != null)
				    class187 = class187.method2573(18);
				if (class187 != null) {
				    if ((Class131_Sub1_Sub4.anInt5546
					 ^ 0xffffffff)
					== -2) {
					Class131_Sub31.method1860
					    (Class218.anInt3200,
					     (Class23_Sub5_Sub1.method398
					      (class1_sub2.anInt3508,
					       interface6, (byte) -108,
					       class1_sub2.anInt3504)),
					     Class158.aString2090, -1,
					     class1_sub2.anInt3508,
					     (Class148.aString1979
					      + " -> <col=00ffff>"
					      + class187.aString2729),
					     class1_sub2.anInt3504, 12);
					Class201.anInt2942++;
				    } else if (Class154.aBoolean2047) {
					Class131_Sub41_Sub16 class131_sub41_sub16
					    = ((Class153.anInt2042
						^ 0xffffffff) == 0
					       ? null
					       : (Class145.method2163
						  (Class153.anInt2042, true)));
					if ((Class193.anInt2839 & 0x4
					     ^ 0xffffffff) != -1
					    && (class131_sub41_sub16 == null
						|| ((class187.method2572
						     (Class153.anInt2042,
						      false,
						      (class131_sub41_sub16
						       .anInt6374)))
						    != (class131_sub41_sub16
							.anInt6374)))) {
					    Class68.anInt917++;
					    Class131_Sub31.method1860
						((Class131_Sub41_Sub21
						  .anInt6447),
						 (Class23_Sub5_Sub1.method398
						  (class1_sub2.anInt3508,
						   interface6, (byte) -108,
						   class1_sub2.anInt3504)),
						 (Class131_Sub41_Sub2
						  .aString6191),
						 -1, class1_sub2.anInt3508,
						 (Class112.aString1453
						  + " -> <col=00ffff>"
						  + class187.aString2729),
						 class1_sub2.anInt3504, 44);
					}
				    } else {
					String[] strings
					    = class187.aStringArray2682;
					if (strings != null) {
					    for (int i = 4;
						 (i ^ 0xffffffff) <= -1; i--) {
						if (strings[i] != null) {
						    int i_35_ = 0;
						    int i_36_
							= (InputStream_Sub1
							   .anInt57);
						    if (i == 0)
							i_35_ = 37;
						    if ((i ^ 0xffffffff) == -2)
							i_35_ = 45;
						    if ((i ^ 0xffffffff) == -3)
							i_35_ = 47;
						    if ((i ^ 0xffffffff) == -4)
							i_35_ = 33;
						    if ((i ^ 0xffffffff) == -5)
							i_35_ = 1011;
						    if (i
							== class187.anInt2712)
							i_36_ = (class187
								 .anInt2659);
						    if (class187.anInt2694
							== i)
							i_36_ = (class187
								 .anInt2736);
						    Class131_Sub31.method1860
							(i_36_,
							 (Class23_Sub5_Sub1
							      .method398
							  ((class1_sub2
							    .anInt3508),
							   interface6,
							   (byte) -108,
							   (class1_sub2
							    .anInt3504))),
							 strings[i],
							 arg3 + -128,
							 class1_sub2.anInt3508,
							 ("<col=00ffff>"
							  + (class187
							     .aString2729)),
							 class1_sub2.anInt3504,
							 i_35_);
						    Class147.anInt1945++;
						}
					    }
					}
					Class131_Sub24.anInt4462++;
					Class131_Sub31.method1860
					    (Class131_Sub2_Sub22.anInt5862,
					     (long) class187.anInt2713,
					     Class131_Sub19.aString4404, -1,
					     class1_sub2.anInt3508,
					     ("<col=00ffff>"
					      + class187.aString2729),
					     class1_sub2.anInt3504, 1009);
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ea.P("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method132(int arg0, int arg1) {
	try {
	    Class23_Sub4_Sub4.aClass214_5403.method2786(arg1 ^ arg1, arg0);
	    anInt5209++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ea.O(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method133(int arg0) {
	try {
	    aColorArray5221 = null;
	    anIntArray5206 = null;
	    if (arg0 == 32)
		anIntArray5213 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ea.N(" + arg0 + ')');
	}
    }
    
    public static boolean method134(Interface6 arg0, boolean arg1) {
	try {
	    anInt5217++;
	    Class187 class187
		= Class55.method612(arg0.method23((byte) -111), 40);
	    if (arg1 != false)
		method130(-20, 72);
	    if ((class187.anInt2708 ^ 0xffffffff) == 0)
		return true;
	    Class51 class51
		= Class131_Sub2_Sub21.method1573((byte) -110,
						 class187.anInt2708);
	    if ((class51.anInt670 ^ 0xffffffff) == 0)
		return true;
	    return class51.method595(-7748);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ea.Q("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	anInt5212 = 0;
	aColorArray5221
	    = new Color[] { new Color(16777215), new Color(16777215) };
    }
}
