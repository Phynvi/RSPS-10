/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78
{
    public static int anInt1049;
    public static int anInt1050;
    public static boolean aBoolean1051;
    public static int anInt1052 = -1;
    public static Class158 aClass158_1053;
    public static int[] anIntArray1054;
    public static int anInt1055;
    public static int[] anIntArray1056;
    public static Class131_Sub1_Sub3 aClass131_Sub1_Sub3_1057;
    
    public static void method778(byte arg0) {
	try {
	    anInt1050++;
	    synchronized (Class56.aClass214_731) {
		Class56.aClass214_731.method2783(-101);
	    }
	    synchronized (Login.aClass214_1757) {
		Login.aClass214_1757.method2783(-67);
		if (arg0 <= 73)
		    method779((byte) -31);
	    }
	    synchronized (Class131_Sub31.aClass214_4545) {
		Class131_Sub31.aClass214_4545.method2783(-80);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ii.C(" + arg0 + ')');
	}
    }
    
    public static void method779(byte arg0) {
	try {
	    aClass158_1053 = null;
	    anIntArray1056 = null;
	    aClass131_Sub1_Sub3_1057 = null;
	    anIntArray1054 = null;
	    int i = 24 / ((-50 - arg0) / 62);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ii.D(" + arg0 + ')');
	}
    }
    
    public static void method780(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    Class131_Sub2_Sub17.anInt5813 = 0;
	    anInt1049++;
	    for (int i = -1;
		 ((Class131_Sub38.anInt4618 + Class131_Sub41_Sub2.anInt6186
		   ^ 0xffffffff)
		  < (i ^ 0xffffffff));
		 i++) {
		Class66 class66 = null;
		Class23_Sub4_Sub1 class23_sub4_sub1;
		if ((i ^ 0xffffffff) <= -1) {
		    if (Class131_Sub38.anInt4618 <= i) {
			class23_sub4_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379
			       [(Class131_Sub41_Sub12.anIntArray6316
				 [i + -Class131_Sub38.anInt4618])]);
			class66 = (((Class23_Sub4_Sub1_Sub1) class23_sub4_sub1)
				   .aClass66_6474);
			if (class66.anIntArray845 != null) {
			    class66 = class66.method697(true);
			    if (class66 == null)
				continue;
			}
		    } else
			class23_sub4_sub1
			    = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
			       [Class148.anIntArray1983[i]]);
		} else
		    class23_sub4_sub1 = Class166.aClass23_Sub4_Sub1_Sub2_2216;
		if (class23_sub4_sub1.anInt5273 >= 0) {
		    Class77.method775(arg1 >> -1702586879, false,
				      arg5 >> 1513582273, arg2,
				      class23_sub4_sub1,
				      class23_sub4_sub1.method345((byte) 105),
				      arg6);
		    if (Class131_Sub2_Sub6.anIntArray5629[0] >= 0) {
			if (class23_sub4_sub1.aString5280 != null
			    && (i >= Class131_Sub38.anInt4618
				|| Class131_Sub41_Sub5.anInt6222 == 0
				|| Class131_Sub41_Sub5.anInt6222 == 3
				|| (Class131_Sub41_Sub5.anInt6222 == 1
				    && (Class23_Sub4_Sub1_Sub1.method348
					((byte) 97,
					 ((Class23_Sub4_Sub1_Sub2)
					  class23_sub4_sub1).aString6491))))
			    && ((Class131_Sub2_Sub17.anInt5813 ^ 0xffffffff)
				> (Class131_Sub31.anInt4535 ^ 0xffffffff))) {
			    Class131_Sub31.anIntArray4539[(Class131_Sub2_Sub17
							   .anInt5813)]
				= (Class89.aClass55_3259.method621
				   ((byte) -121,
				    class23_sub4_sub1.aString5280)) / 2;
			    Class131_Sub31.anIntArray4530[(Class131_Sub2_Sub17
							   .anInt5813)]
				= Class131_Sub2_Sub6.anIntArray5629[0];
			    Class131_Sub31.anIntArray4536[(Class131_Sub2_Sub17
							   .anInt5813)]
				= Class131_Sub2_Sub6.anIntArray5629[1];
			    Class131_Sub31.anIntArray4543[(Class131_Sub2_Sub17
							   .anInt5813)]
				= class23_sub4_sub1.anInt5301;
			    Class131_Sub31.anIntArray4540[(Class131_Sub2_Sub17
							   .anInt5813)]
				= class23_sub4_sub1.anInt5283;
			    Class131_Sub31.anIntArray4531[(Class131_Sub2_Sub17
							   .anInt5813)]
				= class23_sub4_sub1.anInt5276;
			    Class131_Sub31.aStringArray4538
				[Class131_Sub2_Sub17.anInt5813]
				= class23_sub4_sub1.aString5280;
			    Class131_Sub2_Sub17.anInt5813++;
			}
			Class152 class152 = Class125.aClass152Array1631[0];
			int i_0_
			    = (Class131_Sub2_Sub6.anIntArray5629[1]
			       + (arg3
				  + -Math.max(Class89.aClass55_3259.anInt723,
					      class152.method2204())));
			if (!class23_sub4_sub1.aBoolean5293
			    && (class23_sub4_sub1.anInt5272
				> Class125.anInt1632)) {
			    Class152 class152_1_
				= Class125.aClass152Array1631[1];
			    if (class23_sub4_sub1
				instanceof Class23_Sub4_Sub1_Sub1) {
				Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				    = ((Class23_Sub4_Sub1_Sub1)
				       class23_sub4_sub1);
				Class152[] class152s
				    = ((Class152[])
				       (Class131_Sub31.aClass214_4542
					    .method2780
					(126,
					 (long) (class23_sub4_sub1_sub1
						 .aClass66_6474.anInt836))));
				if (class152s == null) {
				    Class124[] class124s
					= (Class124.method1084
					   (Class128.aClass158_1746,
					    (class23_sub4_sub1_sub1
					     .aClass66_6474.anInt836),
					    0));
				    if (class124s != null) {
					class152s
					    = new Class152[class124s.length];
					for (int i_2_ = 0;
					     ((class124s.length ^ 0xffffffff)
					      < (i_2_ ^ 0xffffffff));
					     i_2_++)
					    class152s[i_2_]
						= (Class183_Sub1
						       .aClass130_4960
						       .method1178
						   (class124s[i_2_], true));
					Class131_Sub31.aClass214_4542
					    .method2773
					    (true, class152s,
					     (long) (class23_sub4_sub1_sub1
						     .aClass66_6474.anInt836));
				    }
				}
				if (class152s != null
				    && class152s.length == 2) {
				    class152 = class152s[0];
				    class152_1_ = class152s[1];
				}
			    }
			    int i_3_ = (Class131_Sub2_Sub6.anIntArray5629[0]
					+ (arg0 + -(class152.method2206()
						    >> -1778225791)));
			    class152.method2211(i_3_, i_0_);
			    int i_4_ = (class152.method2206()
					* class23_sub4_sub1.anInt5277 / 255);
			    Class183_Sub1.aClass130_4960.method1248
				(i_3_, i_0_, i_3_ + i_4_,
				 class152.method2204() + i_0_);
			    class152_1_.method2211(i_3_, i_0_);
			    Class183_Sub1.aClass130_4960.method1188
				(arg0, arg3, arg5 + arg0, arg1 + arg3);
			}
			i_0_ -= 2;
			if (!class23_sub4_sub1.aBoolean5293) {
			    if (Class125.anInt1632
				< class23_sub4_sub1.anInt5269) {
				Class152 class152_5_
				    = (Class212.aClass152Array3111
				       [(class23_sub4_sub1.aBoolean5312 ? 2
					 : 0)]);
				Class152 class152_6_
				    = (Class212.aClass152Array3111
				       [(!class23_sub4_sub1.aBoolean5312 ? 1
					 : 3)]);
				int i_7_ = -1;
				if (!(class23_sub4_sub1
				      instanceof Class23_Sub4_Sub1_Sub1))
				    i_7_ = (class23_sub4_sub1.method344(121)
					    .anInt955);
				else {
				    i_7_ = class66.anInt879;
				    if (i_7_ == -1)
					i_7_ = (class23_sub4_sub1.method344
						(112).anInt955);
				}
				if ((i_7_ ^ 0xffffffff) != 0) {
				    Class152[] class152s
					= ((Class152[])
					   Class33.aClass214_481
					       .method2780(123, (long) i_7_));
				    if (class152s == null) {
					Class124[] class124s
					    = (Class124.method1084
					       (Class128.aClass158_1746, i_7_,
						0));
					if (class124s != null) {
					    class152s = (new Class152
							 [class124s.length]);
					    for (int i_8_ = 0;
						 ((class124s.length
						   ^ 0xffffffff)
						  < (i_8_ ^ 0xffffffff));
						 i_8_++)
						class152s[i_8_]
						    = (Class183_Sub1
							   .aClass130_4960
							   .method1178
						       (class124s[i_8_],
							true));
					    Class33.aClass214_481.method2773
						(true, class152s, (long) i_7_);
					}
				    }
				    if (class152s != null
					&& class152s.length == 4) {
					class152_5_
					    = class152s[(!(class23_sub4_sub1
							   .aBoolean5312)
							 ? 0 : 2)];
					class152_6_
					    = (class152s
					       [(class23_sub4_sub1.aBoolean5312
						 ? 3 : 1)]);
				    }
				}
				int i_9_ = (class23_sub4_sub1.anInt5269
					    - Class125.anInt1632);
				int i_10_;
				if (i_9_ > class23_sub4_sub1.anInt5295) {
				    i_9_ -= class23_sub4_sub1.anInt5295;
				    int i_11_
					= (class23_sub4_sub1.anInt5259 == 0 ? 0
					   : (class23_sub4_sub1.anInt5259
					      * ((class23_sub4_sub1.anInt5302
						  + -i_9_)
						 / (class23_sub4_sub1
						    .anInt5259))));
				    i_10_ = (class152_5_.method2206() * i_11_
					     / class23_sub4_sub1.anInt5302);
				} else
				    i_10_ = class152_5_.method2206();
				int i_12_ = class152_5_.method2204();
				i_0_ -= i_12_;
				int i_13_
				    = (Class131_Sub2_Sub6.anIntArray5629[0]
				       + arg0
				       + -(class152_5_.method2206()
					   >> -2047234911));
				class152_5_.method2211(i_13_, i_0_);
				Class183_Sub1.aClass130_4960.method1248
				    (i_13_, i_0_, i_10_ + i_13_, i_12_ + i_0_);
				class152_6_.method2211(i_13_, i_0_);
				Class183_Sub1.aClass130_4960.method1188
				    (arg0, arg3, arg5 + arg0, arg3 - -arg1);
				i_0_ -= 2;
			    }
			    if (i >= Class131_Sub38.anInt4618) {
				if (class66.anInt877 >= 0
				    && ((class66.anInt877 ^ 0xffffffff)
					> ((Class131_Sub41_Sub15
					    .aClass152Array6363).length
					   ^ 0xffffffff))) {
				    Class152 class152_14_
					= (Class131_Sub41_Sub15
					   .aClass152Array6363
					   [class66.anInt877]);
				    i_0_ -= 25;
				    class152_14_.method2211
					((arg0
					  - -(Class131_Sub2_Sub6.anIntArray5629
					      [0])
					  - (class152_14_.method2206()
					     >> -1370224127)),
					 i_0_);
				    i_0_ -= 2;
				}
			    } else {
				Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
				    = ((Class23_Sub4_Sub1_Sub2)
				       class23_sub4_sub1);
				if (class23_sub4_sub1_sub2.anInt6529 != -1) {
				    i_0_ -= 25;
				    Class131_Sub11.aClass152Array4253
					[class23_sub4_sub1_sub2.anInt6529]
					.method2211
					((Class131_Sub2_Sub6.anIntArray5629[0]
					  + arg0 - 12),
					 i_0_);
				    i_0_ -= 2;
				}
				if (class23_sub4_sub1_sub2.anInt6509 != -1) {
				    i_0_ -= 25;
				    Class131_Sub41_Sub15.aClass152Array6363
					[class23_sub4_sub1_sub2.anInt6509]
					.method2211
					(-12 + (arg0 + (Class131_Sub2_Sub6
							.anIntArray5629[0])),
					 i_0_);
				    i_0_ -= 2;
				}
			    }
			}
			if (class23_sub4_sub1
			    instanceof Class23_Sub4_Sub1_Sub2) {
			    if (i >= 0) {
				int i_15_ = 0;
				Class87[] class87s
				    = Class131_Sub2_Sub5.aClass87Array5612;
				for (int i_16_ = 0;
				     ((i_16_ ^ 0xffffffff)
				      > (class87s.length ^ 0xffffffff));
				     i_16_++) {
				    Class87 class87 = class87s[i_16_];
				    if (class87 != null
					&& ((class87.anInt1135 ^ 0xffffffff)
					    == -11)
					&& (class87.anInt1126
					    == Class148.anIntArray1983[i])) {
					Class152 class152_17_
					    = (Class131_Sub35
					       .aClass152Array4585
					       [class87.anInt1143]);
					if ((i_15_ ^ 0xffffffff)
					    > (class152_17_.method2204()
					       ^ 0xffffffff))
					    i_15_ = class152_17_.method2204();
					class152_17_.method2211
					    ((Class131_Sub2_Sub6.anIntArray5629
					      [0]) + (arg0 - 12),
					     i_0_ - class152_17_.method2204());
				    }
				}
				if ((i_15_ ^ 0xffffffff) < -1)
				    i_0_ -= i_15_ + 2;
			    }
			} else {
			    int i_18_ = 0;
			    Class87[] class87s
				= Class131_Sub2_Sub5.aClass87Array5612;
			    for (int i_19_ = 0; i_19_ < class87s.length;
				 i_19_++) {
				Class87 class87 = class87s[i_19_];
				if (class87 != null && class87.anInt1135 == 1
				    && (((Class131_Sub41_Sub12.anIntArray6316
					  [i - Class131_Sub38.anInt4618])
					 ^ 0xffffffff)
					== (class87.anInt1126 ^ 0xffffffff))) {
				    Class152 class152_20_
					= (Class131_Sub35.aClass152Array4585
					   [class87.anInt1143]);
				    if ((i_18_ ^ 0xffffffff)
					> (class152_20_.method2204()
					   ^ 0xffffffff))
					i_18_ = class152_20_.method2204();
				    if (Class125.anInt1632 % 20 < 10)
					class152_20_.method2211
					    ((Class131_Sub2_Sub6.anIntArray5629
					      [0]) + arg0 - 12,
					     (-class152_20_.method2204()
					      + i_0_));
				}
			    }
			    if (i_18_ > 0)
				i_0_ -= 2 + i_18_;
			}
			for (int i_21_ = 0; i_21_ < 4; i_21_++) {
			    if ((Class125.anInt1632 ^ 0xffffffff)
				> (class23_sub4_sub1.anIntArray5279[i_21_]
				   ^ 0xffffffff)) {
				int i_22_
				    = (class23_sub4_sub1.method345((byte) 97)
				       / 2);
				Class77.method775(arg1 >> 956905217, false,
						  arg5 >> 2091770145, arg2,
						  class23_sub4_sub1, i_22_,
						  arg6);
				if (Class131_Sub2_Sub6.anIntArray5629[0]
				    > -1) {
				    if ((i_21_ ^ 0xffffffff) == -2)
					Class131_Sub2_Sub6.anIntArray5629[1]
					    -= 20;
				    if ((i_21_ ^ 0xffffffff) == -3) {
					Class131_Sub2_Sub6.anIntArray5629[0]
					    -= 15;
					Class131_Sub2_Sub6.anIntArray5629[1]
					    -= 10;
				    }
				    if ((i_21_ ^ 0xffffffff) == -4) {
					Class131_Sub2_Sub6.anIntArray5629[1]
					    -= 10;
					Class131_Sub2_Sub6.anIntArray5629[0]
					    += 15;
				    }
				    Class131_Sub2_Sub10.aClass152Array5701
					[(class23_sub4_sub1.anIntArray5270
					  [i_21_])]
					.method2211
					(-12 + arg0 - -(Class131_Sub2_Sub6
							.anIntArray5629[0]),
					 -12 + arg3 + (Class131_Sub2_Sub6
						       .anIntArray5629[1]));
				    Class204.aClass44_2982.method528
					((byte) 89, 0,
					 Integer.toString(class23_sub4_sub1
							  .anIntArray5308
							  [i_21_]),
					 -1,
					 arg0 - -(Class131_Sub2_Sub6
						  .anIntArray5629[0]) + -1,
					 arg3 + (Class131_Sub2_Sub6
						 .anIntArray5629[1]) - -3);
				}
			    }
			}
		    }
		}
	    }
	    for (int i = arg4; i < Class165.anInt2198; i++) {
		int i_23_ = Class156.anIntArray2071[i];
		Class23_Sub4_Sub1 class23_sub4_sub1;
		if ((i_23_ ^ 0xffffffff) <= -2049)
		    class23_sub4_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [-2048 + i_23_]);
		else
		    class23_sub4_sub1
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_23_];
		int i_24_ = Class131_Sub2_Sub5.anIntArray5608[i];
		Class23_Sub4_Sub1 class23_sub4_sub1_25_;
		if (i_24_ >= 2048)
		    class23_sub4_sub1_25_
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [i_24_ + -2048]);
		else
		    class23_sub4_sub1_25_
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_24_];
		Class131_Sub2_Sub19.method1567(class23_sub4_sub1,
					       class23_sub4_sub1_25_, arg0,
					       arg1,
					       --class23_sub4_sub1.anInt5263,
					       arg6, arg2, arg4 + 18, arg3,
					       arg5);
	    }
	    int i = (Class89.aClass55_3259.anInt723
		     - -Class89.aClass55_3259.anInt717 + 2);
	    for (int i_26_ = 0; i_26_ < Class131_Sub2_Sub17.anInt5813;
		 i_26_++) {
		int i_27_ = Class131_Sub31.anIntArray4530[i_26_];
		int i_28_ = Class131_Sub31.anIntArray4536[i_26_];
		int i_29_ = Class131_Sub31.anIntArray4539[i_26_];
		boolean bool = true;
		while (bool) {
		    bool = false;
		    for (int i_30_ = 0;
			 (i_30_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff);
			 i_30_++) {
			if ((Class131_Sub31.anIntArray4536[i_30_] + -i
			     < 2 + i_28_)
			    && (2 + Class131_Sub31.anIntArray4536[i_30_]
				^ 0xffffffff) < (i_28_ - i ^ 0xffffffff)
			    && ((Class131_Sub31.anIntArray4539[i_30_]
				 + Class131_Sub31.anIntArray4530[i_30_])
				> -i_29_ + i_27_)
			    && ((i_27_ - -i_29_ ^ 0xffffffff)
				< ((-Class131_Sub31.anIntArray4539[i_30_]
				    + Class131_Sub31.anIntArray4530[i_30_])
				   ^ 0xffffffff))
			    && ((i_28_ ^ 0xffffffff)
				< (Class131_Sub31.anIntArray4536[i_30_] + -i
				   ^ 0xffffffff))) {
			    bool = true;
			    i_28_ = -i + Class131_Sub31.anIntArray4536[i_30_];
			}
		    }
		}
		Class131_Sub31.anIntArray4536[i_26_] = i_28_;
		String string = Class131_Sub31.aStringArray4538[i_26_];
		if ((Class184.anInt2622 ^ 0xffffffff) == -1) {
		    int i_31_ = 16776960;
		    if (Class131_Sub31.anIntArray4543[i_26_] < 6)
			i_31_ = (Class131_Sub2_Sub2.anIntArray5584
				 [Class131_Sub31.anIntArray4543[i_26_]]);
		    if ((Class131_Sub31.anIntArray4543[i_26_] ^ 0xffffffff)
			== -7)
			i_31_ = (Class83.anInt1093 % 20 >= 10 ? 16776960
				 : 16711680);
		    if ((Class131_Sub31.anIntArray4543[i_26_] ^ 0xffffffff)
			== -8)
			i_31_ = ((Class83.anInt1093 % 20 ^ 0xffffffff) > -11
				 ? 255 : 65535);
		    if ((Class131_Sub31.anIntArray4543[i_26_] ^ 0xffffffff)
			== -9)
			i_31_ = ((Class83.anInt1093 % 20 ^ 0xffffffff) > -11
				 ? 45056 : 8454016);
		    if ((Class131_Sub31.anIntArray4543[i_26_] ^ 0xffffffff)
			== -10) {
			int i_32_ = 150 - Class131_Sub31.anIntArray4531[i_26_];
			if (i_32_ < 50)
			    i_31_ = 16711680 + 1280 * i_32_;
			else if (i_32_ < 100)
			    i_31_ = 16776960 + -(327680 * (-50 + i_32_));
			else if ((i_32_ ^ 0xffffffff) > -151)
			    i_31_ = 65280 + 5 * (i_32_ - 100);
		    }
		    if (Class131_Sub31.anIntArray4543[i_26_] == 10) {
			int i_33_
			    = -Class131_Sub31.anIntArray4531[i_26_] + 150;
			if ((i_33_ ^ 0xffffffff) > -51)
			    i_31_ = 16711680 - -(i_33_ * 5);
			else if (i_33_ >= 100) {
			    if (i_33_ < 150)
				i_31_ = (-(5 * (-100 + i_33_)) + 255
					 - -((i_33_ + -100) * 327680));
			} else
			    i_31_ = -((i_33_ - 50) * 327680) + 16711935;
		    }
		    if (Class131_Sub31.anIntArray4543[i_26_] == 11) {
			int i_34_
			    = -Class131_Sub31.anIntArray4531[i_26_] + 150;
			if (i_34_ >= 50) {
			    if (i_34_ < 100)
				i_31_ = 65280 - -(327685 * (-50 + i_34_));
			    else if ((i_34_ ^ 0xffffffff) > -151)
				i_31_
				    = 16777215 - (-32768000 + 327680 * i_34_);
			} else
			    i_31_ = 16777215 + -(327685 * i_34_);
		    }
		    int i_35_ = i_31_ | ~0xffffff;
		    if (Class131_Sub31.anIntArray4540[i_26_] == 0)
			Class93.aClass44_1222.method528((byte) 93, -16777216,
							string, i_35_,
							i_27_ + arg0,
							i_28_ + arg3);
		    if ((Class131_Sub31.anIntArray4540[i_26_] ^ 0xffffffff)
			== -2)
			Class93.aClass44_1222.method541(i_28_ + arg3, i_35_,
							Class83.anInt1093,
							i_27_ + arg0,
							-16777216, 237,
							string);
		    if ((Class131_Sub31.anIntArray4540[i_26_] ^ 0xffffffff)
			== -3)
			Class93.aClass44_1222.method525(i_28_ + arg3, string,
							i_27_ + arg0, i_35_, 2,
							Class83.anInt1093,
							-16777216);
		    if (Class131_Sub31.anIntArray4540[i_26_] == 3)
			Class93.aClass44_1222.method527
			    (arg0 + i_27_, false, -16777216,
			     150 - Class131_Sub31.anIntArray4531[i_26_], i_35_,
			     string, i_28_ + arg3, Class83.anInt1093);
		    if (Class131_Sub31.anIntArray4540[i_26_] == 4) {
			int i_36_
			    = ((150 - Class131_Sub31.anIntArray4531[i_26_])
			       * (Class89.aClass55_3259.method621((byte) -77,
								  string)
				  - -100)
			       / 150);
			Class183_Sub1.aClass130_4960.method1248((i_27_ + arg0
								 - 50),
								arg3,
								i_27_ + (arg0
									 + 50),
								arg3 + arg1);
			Class93.aClass44_1222.method529(-8219, string, i_35_,
							i_28_ + arg3,
							50 + arg0 + (i_27_
								     - i_36_),
							-16777216);
			Class183_Sub1.aClass130_4960
			    .method1188(arg0, arg3, arg5 + arg0, arg3 - -arg1);
		    }
		    if (Class131_Sub31.anIntArray4540[i_26_] == 5) {
			int i_37_
			    = 150 + -Class131_Sub31.anIntArray4531[i_26_];
			int i_38_ = 0;
			if ((i_37_ ^ 0xffffffff) > -26)
			    i_38_ = -25 + i_37_;
			else if ((i_37_ ^ 0xffffffff) < -126)
			    i_38_ = -125 + i_37_;
			int i_39_ = (Class89.aClass55_3259.anInt717
				     + Class89.aClass55_3259.anInt723);
			Class183_Sub1.aClass130_4960.method1248
			    (arg0, arg3 - -i_28_ - (i_39_ - -1), arg0 - -arg5,
			     arg3 + i_28_ - -5);
			Class93.aClass44_1222.method528((byte) 106, -16777216,
							string, i_35_,
							i_27_ + arg0,
							i_28_ + (arg3
								 - -i_38_));
			Class183_Sub1.aClass130_4960
			    .method1188(arg0, arg3, arg5 + arg0, arg1 + arg3);
		    }
		} else
		    Class93.aClass44_1222.method528((byte) 77, -16777216,
						    string, -256, i_27_ + arg0,
						    i_28_ + arg3);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ii.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static Class93 method781(int arg0, int arg1) {
	try {
	    anInt1055++;
	    Class93 class93
		= ((Class93)
		   Class23_Sub2_Sub1.aClass214_4976.method2780(arg1 + 122,
							       (long) arg0));
	    if (class93 != null)
		return class93;
	    byte[] is = Class133.aClass158_1802.method2364(arg0, 31, 0);
	    if (arg1 != 2)
		method778((byte) -91);
	    class93 = new Class93();
	    if (is != null)
		class93.method853(arg1 + 12, arg0, new Stream(is));
	    Class23_Sub2_Sub1.aClass214_4976.method2773(true, class93,
							(long) arg0);
	    return class93;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ii.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aBoolean1051 = true;
	anIntArray1056 = new int[14];
    }
}
