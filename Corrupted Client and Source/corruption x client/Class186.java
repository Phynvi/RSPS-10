/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class186
{
    public static int anInt2644;
    public static int anInt2645;
    public static boolean aBoolean2646 = false;
    public static int anInt2647;
    public static int anInt2648;
    public static int anInt2649;
    
    public static void method2560(int arg0, int arg1, int arg2, int arg3,
				  int arg4, Class173[] arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	try {
	    Class183_Sub1.aClass130_4960.method1188(arg4, arg2, arg6, arg0);
	    anInt2644++;
	    for (int i = 0; i < arg5.length; i++) {
		Class173 class173 = arg5[i];
		if (class173 != null
		    && (arg8 == class173.anInt2456
			|| (arg8 == -1412584499
			    && Class22_Sub1.aClass173_3666 == class173))) {
		    int i_0_;
		    if ((arg3 ^ 0xffffffff) == 0) {
			Class98.aRectangleArray1305
			    [Class131_Sub29.anInt4514].setBounds
			    (arg1 + class173.anInt2442,
			     arg9 + class173.anInt2343, class173.anInt2411,
			     class173.anInt2437);
			i_0_ = Class131_Sub29.anInt4514++;
		    } else
			i_0_ = arg3;
		    class173.anInt2321 = i_0_;
		    class173.anInt2361 = Class125.anInt1632;
		    if (!class173.aBoolean2355 || !client.method54(class173)) {
			if (class173.anInt2441 > 0)
			    Class31.method439(class173, -2108);
			int i_1_ = arg1 + class173.anInt2442;
			int i_2_ = class173.anInt2343 - -arg9;
			int i_3_ = class173.anInt2369;
			if (Class23_Sub5.aBoolean3761
			    && ((client.method66(class173).anInt4601
				 ^ 0xffffffff) != -1
				|| (class173.anInt2470 ^ 0xffffffff) == -1)
			    && (i_3_ ^ 0xffffffff) < -128)
			    i_3_ = 127;
			if (Class22_Sub1.aClass173_3666 == class173) {
			    if ((arg8 ^ 0xffffffff) != 1412584498
				&& !class173.aBoolean2436) {
				Class23_Sub4.aClass173Array3736 = arg5;
				Class131_Sub2.anInt4089 = arg1;
				Class116.anInt1510 = arg9;
				continue;
			    }
			    if (!class173.aBoolean2436)
				i_3_ = 128;
			    if (Class131_Sub9.aBoolean4216
				&& Class131_Sub3.aBoolean4125) {
				int i_4_ = Class144.anInt1914;
				int i_5_ = Class23_Sub4_Sub3.anInt5005;
				i_4_ -= RuntimeException_Sub1.anInt3243;
				if (i_4_ < Class182.anInt2606)
				    i_4_ = Class182.anInt2606;
				i_5_ -= Class1_Sub7_Sub1.anInt5212;
				if ((i_5_ ^ 0xffffffff)
				    > (Class131_Sub4.anInt4131 ^ 0xffffffff))
				    i_5_ = Class131_Sub4.anInt4131;
				if (class173.anInt2411 + i_4_
				    > (Class182.anInt2606
				       - -(Class23_Sub4_Sub1_Sub2
					   .aClass173_6520.anInt2411)))
				    i_4_ = (-class173.anInt2411
					    + ((Class23_Sub4_Sub1_Sub2
						.aClass173_6520.anInt2411)
					       + Class182.anInt2606));
				i_1_ = i_4_;
				if (i_5_ + class173.anInt2437
				    > (Class131_Sub4.anInt4131
				       - -(Class23_Sub4_Sub1_Sub2
					   .aClass173_6520.anInt2437)))
				    i_5_ = ((Class23_Sub4_Sub1_Sub2
					     .aClass173_6520.anInt2437)
					    + (Class131_Sub4.anInt4131
					       + -class173.anInt2437));
				i_2_ = i_5_;
			    }
			}
			int i_6_;
			int i_7_;
			int i_8_;
			int i_9_;
			if (class173.anInt2470 == 2) {
			    i_8_ = arg6;
			    i_6_ = arg2;
			    i_7_ = arg4;
			    i_9_ = arg0;
			} else {
			    int i_10_ = i_1_ + class173.anInt2411;
			    int i_11_ = class173.anInt2437 + i_2_;
			    i_6_ = arg2 >= i_2_ ? arg2 : i_2_;
			    if ((class173.anInt2470 ^ 0xffffffff) == -10) {
				i_11_++;
				i_10_++;
			    }
			    i_7_ = arg4 >= i_1_ ? arg4 : i_1_;
			    i_8_ = arg6 <= i_10_ ? arg6 : i_10_;
			    i_9_ = ((arg0 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)
				    ? arg0 : i_11_);
			}
			if (!class173.aBoolean2355
			    || i_7_ < i_8_ && ((i_6_ ^ 0xffffffff)
					       > (i_9_ ^ 0xffffffff))) {
			    if (class173.anInt2441 != 0) {
				if ((class173.anInt2441 ^ 0xffffffff) == -1338
				    || class173.anInt2441 == 1403) {
				    Class159.method2376(i_2_, -82, i_1_,
							class173.anInt2437,
							(class173.anInt2441
							 == 1403),
							class173.anInt2411);
				    Class131_Sub41_Sub16.aBooleanArray6371
					[i_0_]
					= true;
				    Class183_Sub1.aClass130_4960
					.method1188(arg4, arg2, arg6, arg0);
				    continue;
				}
				if ((class173.anInt2441 ^ 0xffffffff)
				    == -1339) {
				    if (class173.method2455(0,
							    (Class183_Sub1
							     .aClass130_4960))
					!= null) {
					Class43.method522(107);
					Class79.method782((byte) 96, i_1_,
							  (Class183_Sub1
							   .aClass130_4960),
							  class173, i_2_);
					Class128_Sub1.aBooleanArray4018[i_0_]
					    = true;
					Class183_Sub1.aClass130_4960.method1188
					    (arg4, arg2, arg6, arg0);
				    }
				    continue;
				}
				if (class173.anInt2441 == 1339) {
				    if (class173.method2455(0,
							    (Class183_Sub1
							     .aClass130_4960))
					!= null) {
					Class131_Sub41_Sub16.method2041
					    (i_2_, (byte) -55, class173, i_1_);
					Class128_Sub1.aBooleanArray4018[i_0_]
					    = true;
					Class183_Sub1.aClass130_4960.method1188
					    (arg4, arg2, arg6, arg0);
				    }
				    continue;
				}
				if ((class173.anInt2441 ^ 0xffffffff)
				    == -1401) {
				    Class68.method722(class173.anInt2411, i_1_,
						      i_2_, -117,
						      (Class183_Sub1
						       .aClass130_4960),
						      (Class131_Sub2_Sub8
						       .anInterface4_5660),
						      class173.anInt2437);
				    Class131_Sub41_Sub16.aBooleanArray6371
					[i_0_]
					= true;
				    Class183_Sub1.aClass130_4960
					.method1188(arg4, arg2, arg6, arg0);
				    continue;
				}
				if (class173.anInt2441 == 1401) {
				    Class98.method870(-25,
						      (Class183_Sub1
						       .aClass130_4960),
						      i_2_, class173.anInt2411,
						      class173.anInt2437,
						      i_1_);
				    Class131_Sub41_Sub16.aBooleanArray6371
					[i_0_]
					= true;
				    Class183_Sub1.aClass130_4960
					.method1188(arg4, arg2, arg6, arg0);
				    continue;
				}
				if (class173.anInt2441 == 1405) {
				    if (Class165.aBoolean2201
					|| Class21.aBoolean240) {
					int i_12_ = i_1_ + class173.anInt2411;
					int i_13_ = 15 + i_2_;
					if (Class165.aBoolean2201) {
					    Class184.aClass44_2633.method539
						(-1, (byte) -79, i_12_,
						 ("Fps:"
						  + Class131_Sub43.anInt4700),
						 -256, i_13_);
					    i_13_ += 15;
					    Runtime runtime
						= Runtime.getRuntime();
					    int i_14_
						= (int) ((runtime.totalMemory()
							  - runtime
								.freeMemory())
							 / 1024L);
					    int i_15_ = -256;
					    if (i_14_ > 65536)
						i_15_ = -65536;
					    Class184.aClass44_2633.method539
						(-1, (byte) -95, i_12_,
						 "Mem:" + i_14_ + "k", i_15_,
						 i_13_);
					    i_13_ += 15;
					    int i_16_
						= (Class183_Sub1
						       .aClass130_4960
						       .method1249()
						   / 1024);
					    Class184.aClass44_2633.method539
						(-1, (byte) -85, i_12_,
						 "Offheap:" + i_16_ + "k",
						 (i_16_ <= 65536 ? -256
						  : -65536),
						 i_13_);
					    i_13_ += 15;
					    int i_17_ = 0;
					    int i_18_ = 0;
					    int i_19_ = 0;
					    for (int i_20_ = 0;
						 (i_20_ ^ 0xffffffff) > -30;
						 i_20_++) {
						i_17_
						    += Class167
							   .aClass22_Sub1Array2227
							   [i_20_]
							   .method282(0);
						i_18_
						    += Class167
							   .aClass22_Sub1Array2227
							   [i_20_]
							   .method273(true);
						i_19_
						    += Class167
							   .aClass22_Sub1Array2227
							   [i_20_]
							   .method284(49);
					    }
					    int i_21_ = 100 * i_19_ / i_17_;
					    int i_22_ = 10000 * i_18_ / i_17_;
					    String string
						= ("Cache:"
						   + (Class167.method2426
						      (true, (long) i_22_,
						       false, 0, 2))
						   + "% (" + i_21_ + "%)");
					    Class204.aClass44_2982.method539
						(-1, (byte) -105, i_12_,
						 string, -256, i_13_);
					    i_13_ += 12;
					}
					if ((Class131_Sub18.anInt4385
					     ^ 0xffffffff)
					    < -1)
					    Class204.aClass44_2982.method539
						(-1, (byte) -102, i_12_,
						 ("Particles: "
						  + (Class131_Sub2_Sub21
						     .anInt5855)
						  + " / "
						  + Class131_Sub18.anInt4385),
						 -256, i_13_);
					i_13_ += 12;
					if (Class21.aBoolean240) {
					    Class204.aClass44_2982.method539
						(-1, (byte) -71, i_12_,
						 ("Polys: "
						  + Class183_Sub1
							.aClass130_4960
							.method1235()
						  + " Models: "
						  + Class183_Sub1
							.aClass130_4960
							.method1214()),
						 -256, i_13_);
					    i_13_ += 12;
					    Class204.aClass44_2982.method539
						(-1, (byte) -71, i_12_,
						 ("Ls: "
						  + (PacketParser
						     .anInt5878)
						  + " La: " + Class64.anInt816
						  + " NPC: "
						  + Class131_Sub41.anInt4664
						  + " Pl: "
						  + (Class131_Sub41_Sub6
						     .anInt6239)),
						 -256, i_13_);
					    i_13_ += 12;
					    Class131_Sub1_Sub1
						.method1392(true);
					}
					Class131_Sub41_Sub16
					    .aBooleanArray6371[i_0_]
					    = true;
				    }
				    continue;
				}
			    }
			    if ((class173.anInt2470 ^ 0xffffffff) == -1) {
				if (!class173.aBoolean2355
				    && client.method54(class173)
				    && Class1_Sub7.aClass173_3585 != class173)
				    continue;
				if (!class173.aBoolean2355) {
				    if ((class173.anInt2415 ^ 0xffffffff)
					< ((-class173.anInt2437
					    + class173.anInt2479)
					   ^ 0xffffffff))
					class173.anInt2415
					    = (-class173.anInt2437
					       + class173.anInt2479);
				    if (class173.anInt2415 < 0)
					class173.anInt2415 = 0;
				}
				if (class173.anInt2441 == 1407
				    && Class183_Sub1.aClass130_4960
					   .method1175())
				    Class183_Sub1.aClass130_4960.method1202
					(i_1_, i_2_, class173.anInt2411,
					 class173.anInt2437);
				method2560(i_9_, -class173.anInt2427 + i_1_,
					   i_6_, i_0_, i_7_, arg5, i_8_, 38,
					   class173.anInt2455,
					   -class173.anInt2415 + i_2_);
				if (class173.aClass173Array2326 != null)
				    method2560(i_9_,
					       -class173.anInt2427 + i_1_,
					       i_6_, i_0_, i_7_,
					       class173.aClass173Array2326,
					       i_8_, -127, class173.anInt2455,
					       -class173.anInt2415 + i_2_);
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       (Class83.aClass180_1096.method2521
					(-72, (long) class173.anInt2455)));
				if (class131_sub33 != null)
				    Class92.method850(i_6_,
						      class131_sub33.anInt4556,
						      i_0_, (byte) -35, i_1_,
						      i_8_, i_9_, i_2_, i_7_);
				if ((class173.anInt2441 ^ 0xffffffff) == -1408
				    && Class183_Sub1.aClass130_4960
					   .method1175()) {
				    Class183_Sub1.aClass130_4960.method1182();
				    Class28.aBoolean287 = true;
				}
				Class183_Sub1.aClass130_4960
				    .method1188(arg4, arg2, arg6, arg0);
			    }
			    if (Class110_Sub4.aBooleanArray3934[i_0_]
				|| (Class131_Sub2_Sub12.anInt5728
				    ^ 0xffffffff) < -2) {
				if (class173.anInt2470 == 0
				    && !class173.aBoolean2355
				    && ((class173.anInt2437 ^ 0xffffffff)
					> (class173.anInt2479 ^ 0xffffffff)))
				    Class144.method2156((class173.anInt2411
							 + i_1_),
							class173.anInt2437,
							i_2_,
							class173.anInt2479,
							-80,
							class173.anInt2415);
				if (class173.anInt2470 != 1) {
				    if ((class173.anInt2470 ^ 0xffffffff)
					== -3) {
					int i_23_ = 0;
					for (int i_24_ = 0;
					     ((i_24_ ^ 0xffffffff)
					      > (class173.anInt2322
						 ^ 0xffffffff));
					     i_24_++) {
					    for (int i_25_ = 0;
						 ((i_25_ ^ 0xffffffff)
						  > (class173.anInt2440
						     ^ 0xffffffff));
						 i_25_++) {
						int i_26_
						    = ((i_25_
							* (32 - -(class173
								  .anInt2332)))
						       + i_1_);
						int i_27_
						    = i_2_ - -(i_24_
							       * ((class173
								   .anInt2414)
								  + 32));
						if ((i_23_ ^ 0xffffffff)
						    > -21) {
						    i_27_ += (class173
							      .anIntArray2337
							      [i_23_]);
						    i_26_ += (class173
							      .anIntArray2323
							      [i_23_]);
						}
						if ((class173.anIntArray2400
						     [i_23_])
						    <= 0) {
						    if (((class173
							  .anIntArray2431)
							 != null)
							&& ((i_23_
							     ^ 0xffffffff)
							    > -21)) {
							Class152 class152
							    = (class173
								   .method2463
							       (-1, i_23_,
								(Class183_Sub1
								 .aClass130_4960)));
							if (class152 != null)
							    class152.method2211
								(i_26_, i_27_);
							else if (Class131_Sub41_Sub5
								 .aBoolean6224)
							    Class23_Sub4_Sub4
								.method383
								(-87,
								 class173);
						    }
						} else {
						    boolean bool = false;
						    boolean bool_28_ = false;
						    int i_29_
							= ((class173
							    .anIntArray2400
							    [i_23_])
							   - 1);
						    if ((((32 + i_26_
							   ^ 0xffffffff)
							  < (arg4
							     ^ 0xffffffff))
							 && arg6 > i_26_
							 && arg2 < i_27_ - -32
							 && arg0 > i_27_)
							|| ((class173
							     == (Class131_Sub2_Sub24
								 .aClass173_5906))
							    && (((Class177
								  .anInt2531)
								 ^ 0xffffffff)
								== (i_23_
								    ^ 0xffffffff)))) {
							Class152 class152;
							if (((Class131_Sub1_Sub4
							      .anInt5546)
							     ^ 0xffffffff) != -2
							    || (i_23_
								!= (Class209
								    .anInt3038))
							    || ((Class182
								 .anInt2604)
								!= (class173
								    .anInt2455)))
							    class152
								= (Class202
								       .method2724
								   ((Class183_Sub1
								     .aClass130_4960),
								    1483,
								    i_29_,
								    -13623264,
								    null,
								    (class173
								     .anIntArray2418
								     [i_23_]),
								    (class173
								     .anInt2474),
								    1));
							else
							    class152
								= (Class202
								       .method2724
								   ((Class183_Sub1
								     .aClass130_4960),
								    1483,
								    i_29_, 0,
								    null,
								    (class173
								     .anIntArray2418
								     [i_23_]),
								    (class173
								     .anInt2474),
								    2));
							if (class152 == null)
							    Class23_Sub4_Sub4
								.method383
								(-78,
								 class173);
							else if (((Class131_Sub2_Sub24
								   .aClass173_5906)
								  != class173)
								 || (i_23_
								     != (Class177
									 .anInt2531))) {
							    if ((class173
								 == (Class131_Sub41_Sub12
								     .aClass173_6321))
								&& ((Class71
								     .anInt948)
								    == i_23_))
								class152
								    .method2202
								    (i_26_,
								     i_27_, 0,
								     -2013265920,
								     1);
							    else
								class152
								    .method2211
								    (i_26_,
								     i_27_);
							} else {
							    int i_30_
								= (-(Class89
								     .anInt3248)
								   + (Class23_Sub4_Sub3
								      .anInt5005));
							    int i_31_
								= ((Class144
								    .anInt1914)
								   - (Class143
								      .anInt1908));
							    if (((i_31_
								  ^ 0xffffffff)
								 > -6)
								&& ((i_31_
								     ^ 0xffffffff)
								    < 4))
								i_31_ = 0;
							    if (((i_30_
								  ^ 0xffffffff)
								 > -6)
								&& ((i_30_
								     ^ 0xffffffff)
								    < 4))
								i_30_ = 0;
							    if (((Class121_Sub2_Sub1
								  .anInt5428)
								 ^ 0xffffffff)
								> -6) {
								i_30_ = 0;
								i_31_ = 0;
							    }
							    class152.method2202
								(i_31_ + i_26_,
								 i_27_ + i_30_,
								 0,
								 -2013265920,
								 1);
							    if (arg8 != -1) {
								Class173 class173_32_
								    = (arg5
								       [(arg8
									 & 0xffff)]);
								int[] is
								    = (new int
								       [4]);
								Class183_Sub1
								    .aClass130_4960
								    .method1228
								    (is);
								int i_33_
								    = is[1];
								int i_34_
								    = is[3];
								if (((i_33_
								      ^ 0xffffffff)
								     < ((i_30_
									 + i_27_)
									^ 0xffffffff))
								    && ((class173_32_
									 .anInt2415)
									> 0)) {
								    int i_35_
									= ((Class42
									    .anInt563)
									   * (-i_27_
									      + i_33_
									      + -i_30_)
									   / 3);
								    if (((Class42
									  .anInt563)
									 * 10)
									< i_35_)
									i_35_
									    = Class42.anInt563 * 10;
								    if (((class173_32_
									  .anInt2415)
									 ^ 0xffffffff)
									> (i_35_
									   ^ 0xffffffff))
									i_35_
									    = class173_32_.anInt2415;
								    Class89
									.anInt3248
									+= i_35_;
								    class173_32_
									.anInt2415
									-= i_35_;
								    Class23_Sub4_Sub4
									.method383
									(-122,
									 class173_32_);
								}
								if ((((i_27_
								       - (-i_30_
									  - 32))
								      ^ 0xffffffff)
								     < (i_34_
									^ 0xffffffff))
								    && ((-(class173_32_
									   .anInt2437)
									 + (class173_32_
									    .anInt2479))
									> (class173_32_
									   .anInt2415))) {
								    int i_36_
									= ((Class42
									    .anInt563)
									   * (i_27_
									      - (-i_30_ + -32)
									      - i_34_)
									   / 3);
								    if (i_36_
									> (10
									   * Class42.anInt563))
									i_36_
									    = 10 * Class42.anInt563;
								    if (((-(class173_32_
									    .anInt2415)
									  + (class173_32_.anInt2479
									     + -class173_32_.anInt2437))
									 ^ 0xffffffff)
									> (i_36_
									   ^ 0xffffffff))
									i_36_
									    = -class173_32_.anInt2415 + (-class173_32_.anInt2437 + class173_32_.anInt2479);
								    Class89
									.anInt3248
									-= i_36_;
								    class173_32_
									.anInt2415
									+= i_36_;
								    Class23_Sub4_Sub4
									.method383
									(-114,
									 class173_32_);
								}
							    }
							}
						    }
						}
						i_23_++;
					    }
					}
				    } else if (class173.anInt2470 == 3) {
					int i_37_;
					if (Class44.method532(class173,
							      (byte) 115)) {
					    i_37_ = class173.anInt2424;
					    if ((class173
						 == Class1_Sub7.aClass173_3585)
						&& class173.anInt2477 != 0)
						i_37_ = class173.anInt2477;
					} else {
					    i_37_ = class173.anInt2467;
					    if ((Class1_Sub7.aClass173_3585
						 == class173)
						&& (class173.anInt2451
						    ^ 0xffffffff) != -1)
						i_37_ = class173.anInt2451;
					}
					if (i_3_ != 0) {
					    if (!class173.aBoolean2367)
						Class183_Sub1
						    .aClass130_4960.method1168
						    (i_1_, i_2_,
						     class173.anInt2411,
						     class173.anInt2437,
						     (0xffffff & i_37_
						      | (255 - (0xff & i_3_)
							 << 1263010616)),
						     1);
					    else
						Class183_Sub1
						    .aClass130_4960.method1173
						    (i_1_, i_2_,
						     class173.anInt2411,
						     class173.anInt2437,
						     ((-(0xff & i_3_) + 255
						       << 2073644920)
						      | 0xffffff & i_37_),
						     1);
					} else if (class173.aBoolean2367)
					    Class183_Sub1.aClass130_4960
						.method1173
						(i_1_, i_2_,
						 class173.anInt2411,
						 class173.anInt2437, i_37_, 0);
					else
					    Class183_Sub1.aClass130_4960
						.method1168
						(i_1_, i_2_,
						 class173.anInt2411,
						 class173.anInt2437, i_37_, 0);
				    } else if ((class173.anInt2470
						^ 0xffffffff)
					       == -5) {
					Class44 class44
					    = (class173.method2467
					       (false,
						Class183_Sub1.aClass130_4960));
					if (class44 == null) {
					    if (Class131_Sub41_Sub5
						.aBoolean6224)
						Class23_Sub4_Sub4
						    .method383(-124, class173);
					} else {
					    String string
						= class173.aString2357;
					    int i_38_;
					    if (Class44.method532
						(class173, (byte) 121)) {
						i_38_ = class173.anInt2424;
						if ((class173
						     == (Class1_Sub7
							 .aClass173_3585))
						    && (class173.anInt2477
							^ 0xffffffff) != -1)
						    i_38_ = class173.anInt2477;
						if (class173.aString2334
							.length()
						    > 0)
						    string
							= class173.aString2334;
					    } else {
						i_38_ = class173.anInt2467;
						if ((Class1_Sub7.aClass173_3585
						     == class173)
						    && (class173.anInt2451
							^ 0xffffffff) != -1)
						    i_38_ = class173.anInt2451;
					    }
					    if (class173.aBoolean2355
						&& (class173.anInt2421
						    ^ 0xffffffff) != 0) {
						Class29 class29
						    = (Class131_Sub19
							   .method1808
						       (class173.anInt2421,
							false));
						string = class29.aString341;
						if (string == null)
						    string = "null";
						if (((class29.anInt304
						      ^ 0xffffffff) == -2
						     || (class173.anInt2305
							 != 1))
						    && (class173.anInt2305
							^ 0xffffffff) != 0)
						    string
							= ("<col=ff9040>"
							   + string
							   + "</col> x"
							   + (Class35.method465
							      ((class173
								.anInt2305),
							       true)));
					    }
					    if (Class164.aClass173_2193
						== class173) {
						string = (Class131_Sub8_Sub1
							  .aString6096);
						i_38_ = class173.anInt2467;
					    }
					    if (!class173.aBoolean2355)
						string
						    = (Class110_Sub2.method945
						       (0, string, class173));
					    if (Class45.aBoolean626)
						Class183_Sub1
						    .aClass130_4960.method1248
						    (i_1_, i_2_,
						     class173.anInt2411 + i_1_,
						     (class173.anInt2437
						      + i_2_));
					    class44.method533
						(null, null, 0,
						 class173.anInt2297, i_2_,
						 (!class173.aBoolean2366 ? -1
						  : -16777216),
						 0, ~0xffffff | i_38_,
						 class173.anInt2437,
						 class173.anInt2364, 23008,
						 string,
						 Class201.aClass152Array2930,
						 i_1_, class173.anInt2411,
						 class173.anInt2312);
					    if (Class45.aBoolean626)
						Class183_Sub1
						    .aClass130_4960.method1188
						    (arg4, arg2, arg6, arg0);
					}
				    } else if ((class173.anInt2470
						^ 0xffffffff)
					       == -6) {
					if (!class173.aBoolean2355) {
					    Class152 class152
						= (class173.method2462
						   ((Class44.method532
						     (class173, (byte) 121)),
						    (Class183_Sub1
						     .aClass130_4960),
						    0));
					    if (class152 == null) {
						if (Class131_Sub41_Sub5
						    .aBoolean6224)
						    Class23_Sub4_Sub4.method383
							(-99, class173);
					    } else
						class152.method2211(i_1_,
								    i_2_);
					} else if (class173.anInt2453 >= 0)
					    class173.method2460((byte) 93)
						.method2756
						(-26367,
						 Class183_Sub1.aClass130_4960,
						 (class173.anInt2409
						  << 243712835),
						 0, i_2_,
						 (class173.anInt2300
						  << -506005341),
						 0, i_1_, class173.anInt2411,
						 class173.anInt2437);
					else {
					    Class152 class152;
					    if (class173.anInt2421 == -1)
						class152 = (class173.method2462
							    (false,
							     (Class183_Sub1
							      .aClass130_4960),
							     0));
					    else {
						Class188 class188
						    = (class173.aBoolean2393
						       ? (Class166
							  .aClass23_Sub4_Sub1_Sub2_2216
							  .aClass188_6513)
						       : null);
						class152
						    = (Class202.method2724
						       ((Class183_Sub1
							 .aClass130_4960),
							1483,
							class173.anInt2421,
							(class173.anInt2325
							 | ~0xffffff),
							class188,
							class173.anInt2305,
							class173.anInt2474,
							class173.anInt2433));
					    }
					    if (class152 == null) {
						if (Class131_Sub41_Sub5
						    .aBoolean6224)
						    Class23_Sub4_Sub4.method383
							(-86, class173);
					    } else {
						int i_39_
						    = class152.method2216();
						int i_40_
						    = class152.method2198();
						if (!class173.aBoolean2434) {
						    if ((i_3_ ^ 0xffffffff)
							== -1) {
							if (class173.anInt2381
							    == 0) {
							    if (((i_39_
								  ^ 0xffffffff)
								 == ((class173
								      .anInt2411)
								     ^ 0xffffffff))
								&& (((class173
								      .anInt2437)
								     ^ 0xffffffff)
								    == (i_40_
									^ 0xffffffff)))
								class152
								    .method2211
								    (i_1_,
								     i_2_);
							    else
								class152
								    .method2200
								    (i_1_,
								     i_2_,
								     (class173
								      .anInt2411),
								     (class173
								      .anInt2437));
							} else
							    class152.method2209
								((((float) (class173
									    .anInt2411)
								   / 2.0F)
								  + (float) i_1_),
								 (((float) (class173
									    .anInt2437)
								   / 2.0F)
								  + (float) i_2_),
								 (4096
								  * (class173
								     .anInt2411)
								  / i_39_),
								 (class173
								  .anInt2381));
						    } else {
							int i_41_
							    = (0xffffff
							       | ((255
								   - (0xff
								      & i_3_))
								  << -1234235816));
							if (class173.anInt2381
							    != 0)
							    class152.method2210
								((((float) (class173
									    .anInt2411)
								   / 2.0F)
								  + (float) i_1_),
								 ((float) i_2_
								  + ((float) class173.anInt2437
								     / 2.0F)),
								 ((class173
								   .anInt2411)
								  * 4096
								  / i_39_),
								 (class173
								  .anInt2381),
								 1, i_41_, 1);
							else if (((i_39_
								   ^ 0xffffffff)
								  == ((class173
								       .anInt2411)
								      ^ 0xffffffff))
								 && (i_40_
								     == (class173
									 .anInt2437)))
							    class152.method2202
								(i_1_, i_2_, 1,
								 i_41_, 1);
							else
							    class152.method2201
								(i_1_, i_2_,
								 (class173
								  .anInt2411),
								 (class173
								  .anInt2437),
								 1, i_41_, 1);
						    }
						} else {
						    Class183_Sub1
							.aClass130_4960
							.method1248
							(i_1_, i_2_,
							 (class173.anInt2411
							  + i_1_),
							 (class173.anInt2437
							  + i_2_));
						    if ((class173.anInt2381
							 ^ 0xffffffff)
							== -1) {
							if (i_3_ == 0)
							    class152.method2205
								(i_1_, i_2_,
								 (class173
								  .anInt2411),
								 (class173
								  .anInt2437),
								 0, 0, 1);
							else
							    class152.method2205
								(i_1_, i_2_,
								 (class173
								  .anInt2411),
								 (class173
								  .anInt2437),
								 1,
								 (0xffffff
								  | ((255
								      - (i_3_
									 & 0xff))
								     << 488273976)),
								 1);
						    } else {
							int i_42_
							    = ((-1
								- (-i_39_
								   - (class173
								      .anInt2411)))
							       / i_39_);
							int i_43_
							    = (((class173
								 .anInt2437)
								- (1 + -i_40_))
							       / i_40_);
							for (int i_44_ = 0;
							     i_42_ > i_44_;
							     i_44_++) {
							    for (int i_45_ = 0;
								 i_43_ > i_45_;
								 i_45_++)
								class152
								    .method2209
								    ((((float) i_39_
								       / 2.0F)
								      + (float) (i_1_ + i_44_ * i_39_)),
								     ((float) (i_45_ * i_40_
									       + i_2_)
								      + ((float) i_40_
									 / 2.0F)),
								     4096,
								     (class173
								      .anInt2381));
							}
						    }
						    Class183_Sub1
							.aClass130_4960
							.method1188
							(arg4, arg2, arg6,
							 arg0);
						}
					    }
					}
				    } else if ((class173.anInt2470
						^ 0xffffffff)
					       == -7) {
					boolean bool
					    = Class44.method532(class173,
								(byte) 119);
					int i_46_;
					if (!bool)
					    i_46_ = class173.anInt2443;
					else
					    i_46_ = class173.anInt2298;
					Class23_Sub3.method318((byte) 57);
					Class154 class154 = null;
					int i_47_ = 0;
					if ((class173.anInt2421 ^ 0xffffffff)
					    != 0) {
					    Class29 class29
						= (Class131_Sub19.method1808
						   (class173.anInt2421,
						    false));
					    if (class29 != null) {
						class29
						    = (class29.method418
						       (-11674,
							class173.anInt2305));
						Class161 class161
						    = (i_46_ == -1 ? null
						       : (Class145.method2159
							  (i_46_,
							   (byte) -126)));
						Class188 class188
						    = (class173.aBoolean2393
						       ? (Class166
							  .aClass23_Sub4_Sub1_Sub2_2216
							  .aClass188_6513)
						       : null);
						class154
						    = (class29.method424
						       ((byte) -59, 1,
							(Class183_Sub1
							 .aClass130_4960),
							class173.anInt2338,
							class173.anInt2484,
							1024, class161,
							class188,
							class173.anInt2481));
						if (class154 == null)
						    Class23_Sub4_Sub4.method383
							(-90, class173);
						else
						    i_47_ = (-class154
								  .method2256()
							     / 2);
					    }
					} else if (class173.anInt2416 != 5) {
					    if ((class173.anInt2416
						 ^ 0xffffffff) == -9
						|| class173.anInt2416 == 9) {
						Class131_Sub13 class131_sub13
						    = (Class131_Sub41_Sub2
							   .method1932
						       (class173.anInt2359,
							0));
						Class161 class161
						    = (i_46_ == -1 ? null
						       : (Class145.method2159
							  (i_46_,
							   (byte) -124)));
						if (class131_sub13 != null) {
						    Class188 class188
							= ((class173
							    .aBoolean2393)
							   ? (Class166
							      .aClass23_Sub4_Sub1_Sub2_2216
							      .aClass188_6513)
							   : null);
						    class154
							= (class131_sub13
							       .method1702
							   ((Class183_Sub1
							     .aClass130_4960),
							    class173.anInt2484,
							    class161,
							    class173.anInt2457,
							    (((class173
							       .anInt2416)
							      ^ 0xffffffff)
							     == -10),
							    class173.anInt2481,
							    1024, false,
							    class188,
							    (class173
							     .anInt2338)));
						}
					    } else if ((i_46_ ^ 0xffffffff)
						       == 0) {
						class154
						    = (class173.method2457
						       (bool, -1,
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .aClass188_6513),
							-1, -30345,
							(Class183_Sub1
							 .aClass130_4960),
							0, 1024, null));
						if (class154 == null
						    && (Class131_Sub41_Sub5
							.aBoolean6224))
						    Class23_Sub4_Sub4.method383
							(-104, class173);
					    } else {
						Class161 class161
						    = (Class145.method2159
						       (i_46_, (byte) -128));
						class154
						    = (class173.method2457
						       (bool,
							class173.anInt2484,
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .aClass188_6513),
							class173.anInt2481,
							-30345,
							(Class183_Sub1
							 .aClass130_4960),
							class173.anInt2338,
							1024, class161));
						if (class154 == null
						    && (Class131_Sub41_Sub5
							.aBoolean6224))
						    Class23_Sub4_Sub4.method383
							(-101, class173);
					    }
					} else if (class173.anInt2359 != -1) {
					    int i_48_ = class173.anInt2359;
					    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2;
					    if (Class110.anInt1433 == i_48_)
						class23_sub4_sub1_sub2
						    = (Class166
						       .aClass23_Sub4_Sub1_Sub2_2216);
					    else
						class23_sub4_sub1_sub2
						    = (Class105
						       .aClass23_Sub4_Sub1_Sub2Array1373
						       [i_48_]);
					    Class161 class161
						= ((i_46_ ^ 0xffffffff) != 0
						   ? (Class145.method2159
						      (i_46_, (byte) -118))
						   : null);
					    if (class23_sub4_sub1_sub2 != null
						&& (((i_48_ ^ 0xffffffff)
						     == -2048)
						    || ((Class131_Sub21
							     .method1819
							 (22,
							  (class23_sub4_sub1_sub2
							   .aString6491)))
							== (class173
							    .anInt2457))))
						class154
						    = (class23_sub4_sub1_sub2
							   .aClass188_6513
							   .method2595
						       (0, class173.anInt2484,
							-1, class173.anInt2481,
							(Class183_Sub1
							 .aClass130_4960),
							null, 0, (byte) -103,
							1024, null, class161,
							class173.anInt2338,
							true));
					} else
					    class154 = (Class87
							    .aClass188_1141
							    .method2595
							(0, -1, -1, -1,
							 (Class183_Sub1
							  .aClass130_4960),
							 null, -1, (byte) -103,
							 1024, null, null, 0,
							 true));
					if (class154 != null) {
					    int i_49_;
					    if ((class173.anInt2423
						 ^ 0xffffffff)
						< -1)
						i_49_ = ((class173.anInt2411
							  << 1818350889)
							 / class173.anInt2423);
					    else
						i_49_ = 512;
					    int i_50_;
					    if (class173.anInt2397 > 0)
						i_50_ = ((class173.anInt2437
							  << 205737001)
							 / class173.anInt2397);
					    else
						i_50_ = 512;
					    int i_51_ = (class173.anInt2411 / 2
							 + i_1_
							 + ((class173.anInt2480
							     * i_49_)
							    >> 99875753));
					    int i_52_
						= ((i_50_ * class173.anInt2459
						    >> 1480276361)
						   + (i_2_
						      + (class173.anInt2437
							 / 2)));
					    PacketParser
						.aClass9_5876.method189();
					    Class183_Sub1.aClass130_4960
						.method1260
						(PacketParser
						 .aClass9_5876);
					    int i_53_
						= (((Class31.anIntArray434
						     [(class173.anInt2461
						       << -1883659357)])
						    * class173.anInt2403)
						   >> 1823302319);
					    int i_54_
						= ((class173.anInt2403
						    * (Class31.anIntArray425
						       [(class173.anInt2461
							 << -411119965)]))
						   >> 556473615);
					    Class183_Sub1.aClass130_4960
						.method1193
						(i_51_, i_52_, i_49_, i_50_);
					    Class183_Sub1.aClass130_4960
						.method1252
						((float) class173.aShort2420,
						 (!class173.aBoolean2476
						  ? ((float) (class173
							      .aShort2383)
						     * 1.5F)
						  : (float) (class173
							     .aShort2383)));
					    if (Class28.aBoolean287) {
						Class183_Sub1
						    .aClass130_4960
						    .method1244();
						Class183_Sub1
						    .aClass130_4960
						    .method1169();
						Class183_Sub1
						    .aClass130_4960.method1188
						    (arg4, arg2, arg6, arg0);
						Class28.aBoolean287 = false;
					    }
					    if (class173.aBoolean2368)
						Class183_Sub1
						    .aClass130_4960
						    .method1177(false);
					    if (class173.aBoolean2355) {
						Class23_Sub4.aClass9_3743
						    .method175
						    (-class173.anInt2308
						     << -1849789757);
						Class23_Sub4.aClass9_3743
						    .method192
						    (class173.anInt2482
						     << 1818941667);
						Class23_Sub4.aClass9_3743
						    .method174
						    (class173.anInt2412,
						     (class173.anInt2390
						      + i_53_ + i_47_),
						     (class173.anInt2390
						      + i_54_));
					    } else {
						Class23_Sub4.aClass9_3743
						    .method177
						    (class173.anInt2482
						     << 1724402851);
						Class23_Sub4.aClass9_3743
						    .method174
						    (0, i_53_, i_54_);
					    }
					    Class23_Sub4.aClass9_3743.method179
						(class173.anInt2461
						 << -291853917);
					    if (Class45.aBoolean626)
						Class183_Sub1
						    .aClass130_4960.method1248
						    (i_1_, i_2_,
						     class173.anInt2411 + i_1_,
						     (i_2_
						      - -class173.anInt2437));
					    if (!class173.aBoolean2476)
						class154.method2261
						    (Class23_Sub4.aClass9_3743,
						     null, 1);
					    else
						class154.method2245
						    (Class23_Sub4.aClass9_3743,
						     null, class173.anInt2403,
						     1);
					    if (Class45.aBoolean626)
						Class183_Sub1
						    .aClass130_4960.method1188
						    (arg4, arg2, arg6, arg0);
					    if (class173.aBoolean2368)
						Class183_Sub1
						    .aClass130_4960
						    .method1177(true);
					}
				    } else {
					if ((class173.anInt2470 ^ 0xffffffff)
					    == -8) {
					    Class44 class44
						= (class173.method2467
						   (false, (Class183_Sub1
							    .aClass130_4960)));
					    if (class44 == null) {
						if (Class131_Sub41_Sub5
						    .aBoolean6224)
						    Class23_Sub4_Sub4.method383
							(-125, class173);
						continue;
					    }
					    int i_55_ = 0;
					    for (int i_56_ = 0;
						 ((class173.anInt2322
						   ^ 0xffffffff)
						  < (i_56_ ^ 0xffffffff));
						 i_56_++) {
						for (int i_57_ = 0;
						     (i_57_
						      < class173.anInt2440);
						     i_57_++) {
						    if (((class173
							  .anIntArray2400
							  [i_55_])
							 ^ 0xffffffff)
							< -1) {
							Class29 class29
							    = (Class131_Sub19
								   .method1808
							       ((class173
								 .anIntArray2400
								 [i_55_]) - 1,
								false));
							String string;
							if (((class29.anInt304
							      ^ 0xffffffff)
							     != -2)
							    && (((class173
								  .anIntArray2418
								  [i_55_])
								 ^ 0xffffffff)
								== -2))
							    string
								= ("<col=ff9040>"
								   + (class29
								      .aString341)
								   + "</col>");
							else
							    string
								= ("<col=ff9040>"
								   + (class29
								      .aString341)
								   + "</col> x"
								   + (Class35
									  .method465
								      ((class173
									.anIntArray2418
									[i_55_]),
								       true)));
							int i_58_
							    = ((115
								- -(class173
								    .anInt2332))
							       * i_57_) + i_1_;
							int i_59_
							    = (i_2_
							       + (i_56_
								  * (12
								     + (class173
									.anInt2414))));
							if (class173.anInt2312
							    == 0)
							    class44.method547
								(((class173
								   .anInt2467)
								  | ~0xffffff),
								 4712, string,
								 (Class201
								  .aClass152Array2930),
								 null, i_58_,
								 ((class173
								   .aBoolean2366)
								  ? -16777216
								  : -1),
								 i_59_);
							else if ((class173
								  .anInt2312)
								 == 1)
							    class44.method545
								((byte) -103,
								 (Class201
								  .aClass152Array2930),
								 (~0xffffff
								  | (class173
								     .anInt2467)),
								 i_58_ + 57,
								 null,
								 ((class173
								   .aBoolean2366)
								  ? -16777216
								  : -1),
								 string,
								 i_59_);
							else
							    class44.method546
								(string, null,
								 i_59_,
								 (byte) -105,
								 (-1 + i_58_
								  - -115),
								 ((class173
								   .aBoolean2366)
								  ? -16777216
								  : -1),
								 ((class173
								   .anInt2467)
								  | ~0xffffff),
								 (Class201
								  .aClass152Array2930));
						    }
						    i_55_++;
						}
					    }
					}
					if (((class173.anInt2470 ^ 0xffffffff)
					     == -9)
					    && (class173
						== Class18.aClass173_193)
					    && (Class88.anInt1163
						== Class197.anInt2879)) {
					    int i_60_ = 0;
					    int i_61_ = 0;
					    Class44 class44
						= Class184.aClass44_2633;
					    String string
						= class173.aString2357;
					    string = (Class110_Sub2.method945
						      (0, string, class173));
					    while (string.length() > 0) {
						int i_62_
						    = string.indexOf("<br>");
						String string_63_;
						if (i_62_ == -1) {
						    string_63_ = string;
						    string = "";
						} else {
						    string_63_
							= (string.substring
							   (0, i_62_));
						    string = (string.substring
							      (4 + i_62_));
						}
						int i_64_ = (Class131_Sub24
								 .aClass55_4469
								 .method621
							     ((byte) 120,
							      string_63_));
						i_61_ += 1 + (Class131_Sub24
							      .aClass55_4469
							      .anInt727);
						if ((i_64_ ^ 0xffffffff)
						    < (i_60_ ^ 0xffffffff))
						    i_60_ = i_64_;
					    }
					    i_60_ += 6;
					    i_61_ += 7;
					    int i_65_
						= (-i_60_
						   + (-5 + class173.anInt2411)
						   + i_1_);
					    int i_66_ = (class173.anInt2437
							 + i_2_ - -5);
					    if (i_65_ < 5 + i_1_)
						i_65_ = i_1_ - -5;
					    if ((arg0 ^ 0xffffffff)
						> (i_61_ + i_66_ ^ 0xffffffff))
						i_66_ = -i_61_ + arg0;
					    if ((arg6 ^ 0xffffffff)
						> (i_60_ + i_65_ ^ 0xffffffff))
						i_65_ = -i_60_ + arg6;
					    Class183_Sub1.aClass130_4960
						.method1173
						(i_65_, i_66_, i_60_, i_61_,
						 -96, 0);
					    Class183_Sub1.aClass130_4960
						.method1168
						(i_65_, i_66_, i_60_, i_61_,
						 -16777216, 0);
					    string = class173.aString2357;
					    int i_67_
						= ((Class131_Sub24
						    .aClass55_4469.anInt727)
						   + i_66_ + 2);
					    string = (Class110_Sub2.method945
						      (0, string, class173));
					    while (string.length() > 0) {
						int i_68_
						    = string.indexOf("<br>");
						String string_69_;
						if ((i_68_ ^ 0xffffffff)
						    != 0) {
						    string_69_
							= (string.substring
							   (0, i_68_));
						    string = (string.substring
							      (i_68_ - -4));
						} else {
						    string_69_ = string;
						    string = "";
						}
						class44.method529(-8219,
								  string_69_,
								  -16777216,
								  i_67_,
								  i_65_ - -3,
								  -1);
						i_67_ += (Class131_Sub24
							  .aClass55_4469
							  .anInt727) - -1;
					    }
					}
					if (class173.anInt2470 == 9) {
					    int i_70_;
					    int i_71_;
					    int i_72_;
					    int i_73_;
					    if (class173.aBoolean2306) {
						i_70_ = i_2_;
						i_71_ = (class173.anInt2437
							 + i_2_);
						i_73_ = i_1_ - -(class173
								 .anInt2411);
						i_72_ = i_1_;
					    } else {
						i_70_ = (i_2_
							 + class173.anInt2437);
						i_71_ = i_2_;
						i_72_ = i_1_;
						i_73_ = (i_1_
							 + class173.anInt2411);
					    }
					    if (class173.anInt2471 != 1)
						Class183_Sub1
						    .aClass130_4960.method1227
						    (i_72_, i_71_, i_73_,
						     i_70_, class173.anInt2467,
						     class173.anInt2471, 0);
					    else
						Class183_Sub1
						    .aClass130_4960.method1180
						    (i_72_, i_71_, i_73_,
						     i_70_, class173.anInt2467,
						     0);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    int i = -100 / ((-48 - arg7) / 44);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sr.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public static Class108 method2561(int arg0, int arg1) {
	try {
	    anInt2648++;
	    Class108 class108 = (Class108) Class131_Sub2_Sub2
					       .aClass214_5575
					       .method2780(119, (long) arg1);
	    if (class108 != null)
		return class108;
	    byte[] is = Class207.aClass158_3027.method2364(arg1, 1, 0);
	    class108 = new Class108();
	    if (is != null)
		class108.method928(new Stream(is), arg1, true);
	    Class131_Sub2_Sub2.aClass214_5575.method2773(true, class108,
							 (long) arg1);
	    if (arg0 >= -112)
		method2563(-92);
	    return class108;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sr.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2562(String arg0, byte arg1) {
	try {
	    if (arg1 != 53)
		method2560(95, 108, 125, 9, 37, null, -84, -92, -9, -121);
	    Class131_Sub2_Sub10_Sub1.method1519("", 0, -107, "", 0, arg0);
	    anInt2647++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sr.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method2563(int arg0) {
	try {
	    anInt2649++;
	    int i = 95 / ((arg0 - -15) / 49);
	    return Class82.anInt1085;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sr.A(" + arg0 + ')');
	}
    }
    
    public static Class23_Sub5 method2564(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 == null || class147.aClass23_Sub5_1973 == null)
	    return null;
	return class147.aClass23_Sub5_1973;
    }
    
    static {
	anInt2645 = 1;
    }
}
