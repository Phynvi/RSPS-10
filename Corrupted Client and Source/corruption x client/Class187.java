/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class187
{
    public static int anInt2650;
    public boolean aBoolean2651;
    public static int anInt2652;
    public int[] anIntArray2653;
    public int anInt2654 = 0;
    public int[] anIntArray2655;
    public short[] aShortArray2656;
    public int[] anIntArray2657;
    public static int anInt2658;
    public int anInt2659;
    public boolean aBoolean2660;
    public short[] aShortArray2661;
    public static float aFloat2662;
    public int anInt2663;
    public boolean aBoolean2664;
    public int[] anIntArray2665;
    public int anInt2666;
    public int anInt2667;
    public int anInt2668;
    public static int anInt2669;
    public int anInt2670;
    public boolean aBoolean2671 = false;
    public int anInt2672 = 0;
    public boolean aBoolean2673;
    public static int anInt2674 = -1;
    public short[] aShortArray2675;
    public boolean aBoolean2676 = true;
    public static int anInt2677;
    public boolean aBoolean2678;
    public static int anInt2679;
    public boolean aBoolean2680;
    public static int anInt2681;
    public String[] aStringArray2682;
    public static int anInt2683;
    public int[] anIntArray2684;
    public int anInt2685;
    public int anInt2686;
    public boolean aBoolean2687;
    public int anInt2688;
    public int anInt2689;
    public int anInt2690;
    public boolean aBoolean2691;
    public short[] aShortArray2692;
    public int anInt2693;
    public int anInt2694;
    public int anInt2695;
    public int anInt2696;
    public int anInt2697;
    public int anInt2698;
    public int anInt2699;
    public int[] anIntArray2700;
    public int anInt2701;
    public int anInt2702;
    public int anInt2703;
    public static int anInt2704;
    public int anInt2705;
    public static int anInt2706;
    public static int anInt2707;
    public int anInt2708;
    public static int anInt2709;
    public int anInt2710;
    public static int anInt2711;
    public int anInt2712;
    public int anInt2713;
    public Class180 aClass180_2714;
    public static int anInt2715;
    public short aShort2716;
    public static int anInt2717;
    public int anInt2718;
    public boolean aBoolean2719;
    public int[] anIntArray2720;
    public boolean aBoolean2721;
    public boolean aBoolean2722;
    public static int anInt2723;
    public boolean aBoolean2724;
    public byte[] aByteArray2725;
    public int anInt2726;
    public static int[][] anIntArrayArray2727
	= { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 },
	    { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 },
	    { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
	    { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    public static int anInt2728;
    public String aString2729;
    public static int anInt2730;
    public static int anInt2731;
    public int anInt2732;
    public int anInt2733;
    public static int anInt2734;
    public boolean aBoolean2735;
    public int anInt2736;
    public byte aByte2737;
    
    public boolean method2565(int arg0) {
	try {
	    anInt2717++;
	    if (anIntArray2720 == null)
		return true;
	    boolean bool = true;
	    synchronized (Class131_Sub41_Sub7.aClass158_6254) {
		for (int i = arg0;
		     (anIntArray2720.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    bool &= (Class131_Sub41_Sub7.aClass158_6254.method2354
			     (0, anIntArray2720[i] & 0xffff, arg0 ^ 0x7a));
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ta.N(" + arg0 + ')');
	}
    }
    
    public boolean method2566(int arg0, byte arg1) {
	try {
	    anInt2652++;
	    if (arg1 != 40)
		method2581(24, -92);
	    if (anIntArray2665 == null) {
		if (anIntArray2720 == null)
		    return true;
		if (arg0 != 10)
		    return true;
		boolean bool = true;
		synchronized (Class131_Sub41_Sub7.aClass158_6254) {
		    for (int i = 0; anIntArray2720.length > i; i++)
			bool &= (Class131_Sub41_Sub7.aClass158_6254.method2354
				 (0, 0xffff & anIntArray2720[i], arg1 + 60));
		}
		return bool;
	    }
	    synchronized (Class131_Sub41_Sub7.aClass158_6254) {
		for (int i = 0; i < anIntArray2665.length; i++) {
		    if ((arg0 ^ 0xffffffff)
			== (anIntArray2665[i] ^ 0xffffffff))
			return (Class131_Sub41_Sub7.aClass158_6254.method2354
				(0, anIntArray2720[i] & 0xffff, 100));
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.S(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2567(Stream arg0, byte arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -2) {
	    int i = arg0.readUnsignedByte(-120);
	    if (i > 0) {
		if (anIntArray2720 == null || Class23.aBoolean258) {
		    anIntArray2720 = new int[i];
		    anIntArray2665 = new int[i];
		    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff);
			 i_0_++) {
			anIntArray2720[i_0_] = arg0.readUnsignedShort(8104);
			anIntArray2665[i_0_] = arg0.readUnsignedByte(117);
		    }
		} else
		    arg0.offset += i * 3;
	    }
	} else if (arg2 != 2) {
	    if ((arg2 ^ 0xffffffff) == -6) {
		int i = arg0.readUnsignedByte(-15);
		if (i > 0) {
		    if (anIntArray2720 == null || Class23.aBoolean258) {
			anIntArray2665 = null;
			anIntArray2720 = new int[i];
			for (int i_1_ = 0; i > i_1_; i_1_++)
			    anIntArray2720[i_1_] = arg0.readUnsignedShort(8104);
		    } else
			arg0.offset += i * 2;
		}
	    } else if ((arg2 ^ 0xffffffff) == -15)
		anInt2702 = arg0.readUnsignedByte(-13);
	    else if ((arg2 ^ 0xffffffff) == -16)
		anInt2668 = arg0.readUnsignedByte(-103);
	    else if ((arg2 ^ 0xffffffff) == -18) {
		aBoolean2691 = false;
		anInt2693 = 0;
	    } else if (arg2 == 18)
		aBoolean2691 = false;
	    else if (arg2 != 19) {
		if (arg2 == 21)
		    aByte2737 = (byte) 1;
		else if (arg2 == 22)
		    aBoolean2673 = true;
		else if (arg2 != 23) {
		    if (arg2 != 24) {
			if (arg2 == 27)
			    anInt2693 = 1;
			else if ((arg2 ^ 0xffffffff) != -29) {
			    if (arg2 == 29)
				anInt2705 = arg0.readSignedByte((byte) 127);
			    else if (arg2 == 39)
				anInt2697 = arg0.readSignedByte((byte) 127) * 5;
			    else if ((arg2 ^ 0xffffffff) > -31 || arg2 >= 35) {
				if ((arg2 ^ 0xffffffff) != -41) {
				    if ((arg2 ^ 0xffffffff) != -42) {
					if ((arg2 ^ 0xffffffff) == -43) {
					    int i = arg0.readUnsignedByte(-73);
					    aByteArray2725 = new byte[i];
					    for (int i_2_ = 0; i > i_2_;
						 i_2_++)
						aByteArray2725[i_2_]
						    = (arg0.readSignedByte
						       ((byte) 127));
					} else if ((arg2 ^ 0xffffffff)
						   != -63) {
					    if (arg2 == 64)
						aBoolean2664 = false;
					    else if ((arg2 ^ 0xffffffff)
						     != -66) {
						if ((arg2 ^ 0xffffffff) == -67)
						    anInt2699
							= (arg0.readUnsignedShort
							   (8104));
						else if (arg2 != 67) {
						    if ((arg2 ^ 0xffffffff)
							== -70)
							anInt2698
							    = (arg0.readUnsignedByte
							       (-56));
						    else if (arg2 == 70)
							anInt2710
							    = (arg0.readSignedShort
							       (1625554944));
						    else if (arg2 == 71)
							anInt2686
							    = (arg0.readSignedShort
							       (1625554944));
						    else if ((arg2
							      ^ 0xffffffff)
							     != -73) {
							if ((arg2 ^ 0xffffffff)
							    == -74)
							    aBoolean2651
								= true;
							else if ((arg2
								  ^ 0xffffffff)
								 == -75)
							    aBoolean2724
								= true;
							else if ((arg2
								  ^ 0xffffffff)
								 != -76) {
							    if (((arg2
								  ^ 0xffffffff)
								 != -78)
								&& (arg2
								    != 92)) {
								if (arg2
								    == 78) {
								    anInt2726
									= (arg0.readUnsignedShort
									   (8104));
								    anInt2689
									= (arg0.readUnsignedByte
									   (105));
								} else if (arg2
									   == 79) {
								    anInt2672
									= (arg0.readUnsignedShort
									   (8104));
								    anInt2685
									= (arg0.readUnsignedShort
									   (8104));
								    anInt2689
									= (arg0.readUnsignedByte
									   (-89));
								    int i
									= (arg0.readUnsignedByte
									   (-85));
								    anIntArray2684
									= (new int
									   [i]);
								    for (int i_3_
									     = 0;
									 (i_3_
									  < i);
									 i_3_++)
									anIntArray2684
									    [i_3_]
									    = arg0.readUnsignedShort(8104);
								} else if (arg2
									   == 81) {
								    aByte2737
									= (byte) 2;
								    aShort2716
									= (short) (256 * arg0.readUnsignedByte(-63));
								} else if (arg2
									   != 82) {
								    if ((arg2
									 ^ 0xffffffff)
									!= -89) {
									if ((arg2
									     ^ 0xffffffff)
									    != -90) {
									    if ((arg2 ^ 0xffffffff) == -91)
										aBoolean2678 = true;
									    else if ((arg2 ^ 0xffffffff) != -92) {
										if (arg2 != 93) {
										    if (arg2 == 94)
											aByte2737 = (byte) 4;
										    else if ((arg2 ^ 0xffffffff) == -96)
											aByte2737 = (byte) 5;
										    else if ((arg2 ^ 0xffffffff) == -97)
											aBoolean2680 = true;
										    else if (arg2 != 97) {
											if (arg2 != 98) {
											    if ((arg2 ^ 0xffffffff) == -100) {
												anInt2712 = arg0.readUnsignedByte(80);
												anInt2659 = arg0.readUnsignedShort(8104);
											    } else if (arg2 != 100) {
												if ((arg2 ^ 0xffffffff) == -102)
												    anInt2695 = arg0.readUnsignedByte(116);
												else if ((arg2 ^ 0xffffffff) != -103) {
												    if (arg2 == 103)
													anInt2690 = 0;
												    else if ((arg2 ^ 0xffffffff) != -105) {
													if ((arg2 ^ 0xffffffff) == -106)
													    aBoolean2722 = true;
													else if ((arg2 ^ 0xffffffff) != -107) {
													    if (arg2 != 107) {
														if (arg2 < 150 || (arg2 ^ 0xffffffff) <= -156) {
														    if (arg2 != 160) {
															if (arg2 == 249) {
															    int i = arg0.readUnsignedByte(-72);
															    if (aClass180_2714 == null) {
																int i_4_ = Class101.method887(1388313616, i);
																aClass180_2714 = new Class180(i_4_);
															    }
															    for (int i_5_ = 0; i_5_ < i; i_5_++) {
																boolean bool = arg0.readUnsignedByte(-52) == 1;
																int i_6_ = arg0.read3Bytes(false);
																Class131 class131;
																if (!bool)
																    class131 = new Class131_Sub24(arg0.readUnsignedInt(-2));
																else
																    class131 = new Class131_Sub29(arg0.readString(false));
																aClass180_2714.method2523(false, (long) i_6_, class131);
															    }
															}
														    } else {
															int i = arg0.readUnsignedByte(-128);
															anIntArray2655 = new int[i];
															for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i ^ 0xffffffff); i_7_++)
															    anIntArray2655[i_7_] = arg0.readUnsignedShort(8104);
														    }
														} else {
														    aStringArray2682[-150 + arg2] = arg0.readString(false);
														    if (!Class131_Sub2_Sub13.aBoolean5738 || aStringArray2682[arg2 + -150].equalsIgnoreCase(Class165.aString2196))
															aStringArray2682[-150 + arg2] = null;
														}
													    } else
														anInt2688 = arg0.readUnsignedShort(8104);
													} else {
													    int i = arg0.readUnsignedByte(-64);
													    anIntArray2700 = new int[i];
													    anIntArray2657 = new int[i];
													    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff); i_8_++) {
														anIntArray2657[i_8_] = arg0.readUnsignedShort(8104);
														int i_9_ = arg0.readUnsignedByte(-23);
														anIntArray2700[i_8_] = i_9_;
														anInt2733 += i_9_;
													    }
													}
												    } else
													anInt2696 = arg0.readUnsignedByte(-24);
												} else
												    anInt2708 = arg0.readUnsignedShort(8104);
											    } else {
												anInt2694 = arg0.readUnsignedByte(61);
												anInt2736 = arg0.readUnsignedShort(8104);
											    }
											} else
											    aBoolean2660 = true;
										    } else
											aBoolean2719 = true;
										} else {
										    aByte2737 = (byte) 3;
										    aShort2716 = (short) arg0.readUnsignedShort(8104);
										}
									    } else
										aBoolean2721 = true;
									} else
									    aBoolean2676 = false;
								    } else
									aBoolean2735
									    = false;
								} else
								    aBoolean2671
									= true;
							    } else {
								anInt2666
								    = (arg0.readUnsignedShort
								       (8104));
								if (anInt2666
								    == 65535)
								    anInt2666
									= -1;
								anInt2732
								    = (arg0.readUnsignedShort
								       (8104));
								if (anInt2732
								    == 65535)
								    anInt2732
									= -1;
								int i = -1;
								if ((arg2
								     ^ 0xffffffff)
								    == -93) {
								    i = (arg0.readUnsignedShort
									 (8104));
								    if (i
									== 65535)
									i = -1;
								}
								int i_10_
								    = (arg0.readUnsignedByte
								       (79));
								anIntArray2653
								    = (new int
								       [2 + i_10_]);
								for (int i_11_
									 = 0;
								     (i_10_
								      >= i_11_);
								     i_11_++) {
								    anIntArray2653
									[i_11_]
									= (arg0.readUnsignedShort
									   (8104));
								    if ((anIntArray2653
									 [i_11_])
									== 65535)
									anIntArray2653
									    [i_11_]
									    = -1;
								}
								anIntArray2653
								    [1 + i_10_]
								    = i;
							    }
							} else
							    anInt2703
								= (arg0.readUnsignedByte
								   (-51));
						    } else
							anInt2654
							    = (arg0.readSignedShort
							       (1625554944));
						} else
						    anInt2701
							= (arg0.readUnsignedShort
							   (8104));
					    } else
						anInt2667
						    = arg0.readUnsignedShort(8104);
					} else
					    aBoolean2687 = true;
				    } else {
					int i = arg0.readUnsignedByte(-64);
					aShortArray2675 = new short[i];
					aShortArray2656 = new short[i];
					for (int i_12_ = 0;
					     ((i_12_ ^ 0xffffffff)
					      > (i ^ 0xffffffff));
					     i_12_++) {
					    aShortArray2656[i_12_]
						= (short) (arg0.readUnsignedShort
							   (8104));
					    aShortArray2675[i_12_]
						= (short) (arg0.readUnsignedShort
							   (8104));
					}
				    }
				} else {
				    int i = arg0.readUnsignedByte(-56);
				    aShortArray2661 = new short[i];
				    aShortArray2692 = new short[i];
				    for (int i_13_ = 0;
					 ((i_13_ ^ 0xffffffff)
					  > (i ^ 0xffffffff));
					 i_13_++) {
					aShortArray2692[i_13_]
					    = (short) arg0.readUnsignedShort(8104);
					aShortArray2661[i_13_]
					    = (short) arg0.readUnsignedShort(8104);
				    }
				}
			    } else {
				aStringArray2682[arg2 + -30]
				    = arg0.readString(false);
				if (aStringArray2682[-30 + arg2]
					.equalsIgnoreCase
				    (Class165.aString2196))
				    aStringArray2682[-30 + arg2] = null;
			    }
			} else
			    anInt2670 = arg0.readUnsignedByte(-47);
		    } else {
			anInt2718 = arg0.readUnsignedShort(8104);
			if ((anInt2718 ^ 0xffffffff) == -65536)
			    anInt2718 = -1;
		    }
		} else
		    anInt2690 = 1;
	    } else
		anInt2663 = arg0.readUnsignedByte(97);
	} else
	    aString2729 = arg0.readString(false);
	anInt2711++;
	if (arg1 <= 113)
	    aClass180_2714 = null;
    }
    
    public void method2568(boolean arg0) {
	if (arg0 == true) {
	    if ((anInt2663 ^ 0xffffffff) == 0) {
		anInt2663 = 0;
		if (anIntArray2720 != null
		    && (anIntArray2665 == null
			|| (anIntArray2665[0] ^ 0xffffffff) == -11))
		    anInt2663 = 1;
		for (int i = 0; i < 5; i++) {
		    if (aStringArray2682[i] != null) {
			anInt2663 = 1;
			break;
		    }
		}
	    }
	    anInt2681++;
	    if (anInt2703 == -1)
		anInt2703 = (anInt2693 ^ 0xffffffff) != -1 ? 1 : 0;
	}
    }
    
    public Class14 method2569(int arg0, Class130 arg1, Class68 arg2, int arg3,
			      int arg4, int arg5, int arg6, int arg7,
			      Class68 arg8, int arg9, boolean arg10) {
	try {
	    anInt2709++;
	    if ((arg0 ^ 0xffffffff) == -6 || arg0 == 6 || arg0 == 7
		|| arg0 == 8)
		arg0 = 4;
	    long l = (long) (anIntArray2665 == null
			     ? arg3 + (anInt2713 << 711469034)
			     : (arg0 << 723591075) + ((anInt2713 << -579677590)
						      - -arg3));
	    l |= (long) (arg1.anInt1781 << 1151508061);
	    int i = arg7;
	    if (aByte2737 != 3) {
		if ((aByte2737 ^ 0xffffffff) != -1)
		    i |= 0x2;
	    } else
		i |= 0x7;
	    Class14 class14;
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		class14 = (Class14) Class131_Sub2_Sub30.aClass214_5988
					.method2780(120, l);
	    }
	    if (arg9 < 95)
		method2583(-72, -43);
	    Class154 class154 = class14 == null ? null : class14.aClass154_149;
	    Class131_Sub41_Sub13 class131_sub41_sub13 = null;
	    if (class154 == null
		|| arg1.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg1.method1203(i, class154.method2253());
		int i_14_ = i;
		if (arg0 == 10 && arg3 > 3)
		    i_14_ |= 0x5;
		if (arg10)
		    i_14_ |= 0x20000;
		class154 = method2585(arg3, i_14_, arg1, true, arg0);
		if (class154 == null)
		    return null;
		if (arg0 == 10 && (arg3 ^ 0xffffffff) < -4)
		    class154.method2264(2048);
		if (arg10)
		    class131_sub41_sub13 = class154.method2283(null);
		class154.method2248(i);
		class14 = new Class14();
		class14.aClass131_Sub41_Sub13_148 = class131_sub41_sub13;
		class14.aClass154_149 = class154;
		synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		    Class131_Sub2_Sub30.aClass214_5988.method2773(true,
								  class14, l);
		}
	    } else {
		class131_sub41_sub13 = class14.aClass131_Sub41_Sub13_148;
		class154 = class14.aClass154_149;
	    }
	    if (aByte2737 != 0) {
		class154 = class154.method2287((byte) 0, i, true);
		class154.method2269(aByte2737, aShort2716, arg2, arg8, arg5,
				    arg6, arg4);
		class154.method2248(arg7);
	    } else
		class154 = class154.method2287((byte) 0, arg7, true);
	    Class110_Sub3.aClass14_3928.aClass131_Sub41_Sub13_148
		= class131_sub41_sub13;
	    Class110_Sub3.aClass14_3928.aClass154_149 = class154;
	    return Class110_Sub3.aClass14_3928;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ta.L(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ','
			+ (arg8 != null ? "{...}" : "null") + ',' + arg9 + ','
			+ arg10 + ')'));
	}
    }
    
    public static Class189 method2570(boolean arg0, int arg1) {
	try {
	    if (arg0 != false)
		anInt2674 = -29;
	    anInt2669++;
	    Class189 class189 = (Class189) Class23_Sub4_Sub4.aClass214_5403
					       .method2780(123, (long) arg1);
	    if (class189 != null)
		return class189;
	    byte[] is
		= Class131_Sub2_Sub5.aClass158_5616.method2364(arg1, 4, 0);
	    class189 = new Class189();
	    if (is != null)
		class189.method2603(new Stream(is), arg1, -5780);
	    class189.method2601(arg1, arg0);
	    Class23_Sub4_Sub4.aClass214_5403.method2773(true, class189,
							(long) arg1);
	    return class189;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2571(int arg0) {
	try {
	    if (arg0 != 0)
		anInt2674 = 30;
	    anIntArrayArray2727 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ta.F(" + arg0 + ')');
	}
    }
    
    public int method2572(int arg0, boolean arg1, int arg2) {
	try {
	    anInt2706++;
	    if (aClass180_2714 == null)
		return arg2;
	    if (arg1 != false)
		aBoolean2680 = true;
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_2714.method2521(101, (long) arg0);
	    if (class131_sub24 == null)
		return arg2;
	    return class131_sub24.anInt4465;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.P(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class187 method2573(int arg0) {
	try {
	    if (arg0 != 18)
		return null;
	    anInt2658++;
	    int i = -1;
	    if ((anInt2666 ^ 0xffffffff) == 0) {
		if (anInt2732 != -1)
		    i = Class131_Sub2_Sub13.anIntArray5735[anInt2732];
	    } else
		i = Class63.method667(anInt2666, -1);
	    if ((i ^ 0xffffffff) > -1
		|| (-1 + anIntArray2653.length ^ 0xffffffff) >= (i
								 ^ 0xffffffff)
		|| (anIntArray2653[i] ^ 0xffffffff) == 0) {
		int i_15_ = anIntArray2653[anIntArray2653.length - 1];
		if ((i_15_ ^ 0xffffffff) != 0)
		    return Class55.method612(i_15_, 118);
		return null;
	    }
	    return Class55.method612(anIntArray2653[i], 122);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ta.H(" + arg0 + ')');
	}
    }
    
    public Class154 method2574(Class130 arg0, int arg1, int arg2, int arg3,
			       Class68 arg4, int arg5, int arg6, int arg7,
			       int arg8, Class161 arg9, int arg10, int arg11,
			       int arg12, Class68 arg13) {
	try {
	    anInt2715++;
	    if (arg11 != -4)
		return null;
	    if ((arg10 ^ 0xffffffff) == -6 || (arg10 ^ 0xffffffff) == -7
		|| (arg10 ^ 0xffffffff) == -8 || (arg10 ^ 0xffffffff) == -9)
		arg10 = 4;
	    long l;
	    if (anIntArray2665 == null)
		l = (long) ((anInt2713 << 1704358410) + arg3);
	    else
		l = (long) (arg3 + (anInt2713 << -391134422)
			    + (arg10 << 1224803523));
	    int i = arg7;
	    l |= (long) (arg0.anInt1781 << 1703754525);
	    if (arg9 != null)
		arg7 |= arg9.method2389(arg11 ^ ~0x2, false, arg8, arg12);
	    if (aByte2737 != 3) {
		if ((aByte2737 ^ 0xffffffff) != -1)
		    arg7 |= 0x2;
	    } else
		arg7 |= 0x7;
	    if (arg10 == 10 && (arg3 ^ 0xffffffff) < -4)
		arg7 |= 0x5;
	    Class154 class154;
	    synchronized (Class192.aClass214_2824) {
		class154
		    = (Class154) Class192.aClass214_2824.method2780(119, l);
	    }
	    if (class154 == null
		|| ((arg0.method1208(class154.method2253(), arg7) ^ 0xffffffff)
		    != -1)) {
		if (class154 != null)
		    arg7 = arg0.method1203(arg7, class154.method2253());
		class154 = method2585(arg3, arg7, arg0, true, arg10);
		if (class154 == null)
		    return null;
		synchronized (Class192.aClass214_2824) {
		    Class192.aClass214_2824.method2773(true, class154, l);
		}
	    }
	    boolean bool = false;
	    if (arg9 != null) {
		bool = true;
		class154 = arg9.method2390(arg8, arg12, arg7, (byte) 1, arg5,
					   arg3 & 0x3, class154, (byte) -126);
	    }
	    if (arg10 == 10 && (arg3 ^ 0xffffffff) < -4) {
		if (!bool) {
		    class154 = class154.method2287((byte) 3, arg7, true);
		    bool = true;
		}
		class154.method2264(2048);
	    }
	    if ((aByte2737 ^ 0xffffffff) != -1) {
		if (!bool) {
		    class154 = class154.method2287((byte) 3, arg7, true);
		    bool = true;
		}
		class154.method2269(aByte2737, aShort2716, arg4, arg13, arg6,
				    arg1, arg2);
	    }
	    if (bool)
		class154.method2248(i);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ta.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ arg6 + ',' + arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ','
			+ arg11 + ',' + arg12 + ','
			+ (arg13 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method2575(int arg0, long arg1) {
	try {
	    if (arg0 <= -17) {
		anInt2683++;
		if (arg1 > 0L) {
		    if ((arg1 % 10L ^ 0xffffffffffffffffL) != -1L)
			Class148.method2180((byte) 73, arg1);
		    else {
			Class148.method2180((byte) 100, -1L + arg1);
			Class148.method2180((byte) 123, 1L);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.O(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2576(int arg0) {
	try {
	    anInt2677++;
	    if (anIntArray2657 != null) {
		int i = (int) ((double) anInt2733 * Math.random());
		int i_16_;
		for (i_16_ = 0; anIntArray2700[i_16_] <= i; i_16_++)
		    i -= anIntArray2700[i_16_];
		return anIntArray2657[i_16_];
	    }
	    if (arg0 > -100)
		anIntArray2653 = null;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ta.C(" + arg0 + ')');
	}
    }
    
    public void method2577(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readUnsignedByte(-49);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method2567(arg0, (byte) 122, i);
	}
	anInt2679++;
	if (arg1 != 4204)
	    method2577(null, 3);
    }
    
    public static void method2578(Color arg0, Color arg1, Color arg2, int arg3,
				  boolean arg4, String arg5, int arg6) {
	do {
	    try {
		anInt2734++;
		try {
		    Graphics graphics
			= Class131_Sub2_Sub15.aCanvas5768.getGraphics();
		    if (Class131_Sub9.aFont4200 == null)
			Class131_Sub9.aFont4200 = new Font("Helvetica", 1, 13);
		    if (arg4) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, Class131_Sub1_Sub1.anInt5499,
					  Class218.anInt3201);
		    }
		    if (arg0 == null)
			arg0 = new Color(140, 17, 17);
		    if (arg1 == null)
			arg1 = new Color(140, 17, 17);
		    if (arg2 == null)
			arg2 = new Color(255, 255, 255);
		    try {
			if (Class126.anImage1701 == null)
			    Class126.anImage1701
				= Class131_Sub2_Sub15.aCanvas5768
				      .createImage(304, 34);
			Graphics graphics_17_
			    = Class126.anImage1701.getGraphics();
			graphics_17_.setColor(arg1);
			graphics_17_.drawRect(0, arg6, 303, 33);
			graphics_17_.setColor(arg0);
			graphics_17_.fillRect(2, 2, arg3 * 3, 30);
			graphics_17_.setColor(Color.black);
			graphics_17_.drawRect(1, 1, 301, 31);
			graphics_17_.fillRect(3 * arg3 + 2, 2,
					      300 + -(arg3 * 3), 30);
			graphics_17_.setFont(Class131_Sub9.aFont4200);
			graphics_17_.setColor(arg2);
			graphics_17_.drawString(arg5, (-(6 * arg5.length())
						       + 304) / 2, 22);
			graphics.drawImage(Class126.anImage1701,
					   -152 + (Class131_Sub1_Sub1.anInt5499
						   / 2),
					   -18 + Class218.anInt3201 / 2, null);
		    } catch (Exception exception) {
			int i = -152 + Class131_Sub1_Sub1.anInt5499 / 2;
			int i_18_ = -18 + Class218.anInt3201 / 2;
			graphics.setColor(arg1);
			graphics.drawRect(0, 0, 303, 33);
			graphics.setColor(arg0);
			graphics.fillRect(i - -2, 2 + i_18_, arg3 * 3, 30);
			graphics.setColor(Color.black);
			graphics.drawRect(1 + i, i_18_ + 1, 301, 31);
			graphics.fillRect(2 + i + arg3 * 3, 2 + i_18_,
					  -(arg3 * 3) + 300, 30);
			graphics.setFont(Class131_Sub9.aFont4200);
			graphics.setColor(arg2);
			graphics.drawString(arg5,
					    ((304 + -(6 * arg5.length())) / 2
					     + i),
					    22 + i_18_);
		    }
		    if (Class131_Sub41_Sub12.aString6306 == null)
			break;
		    graphics.setFont(Class131_Sub9.aFont4200);
		    graphics.setColor(arg2);
		    graphics.drawString(Class131_Sub41_Sub12.aString6306,
					(Class131_Sub1_Sub1.anInt5499 / 2
					 - 6 * Class131_Sub41_Sub12
						   .aString6306.length() / 2),
					-26 + Class218.anInt3201 / 2);
		} catch (Exception exception) {
		    Class131_Sub2_Sub15.aCanvas5768.repaint();
		}
		break;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("ta.R(" + (arg0 != null ? "{...}" : "null") + ','
			    + (arg1 != null ? "{...}" : "null") + ','
			    + (arg2 != null ? "{...}" : "null") + ',' + arg3
			    + ',' + arg4 + ','
			    + (arg5 != null ? "{...}" : "null") + ',' + arg6
			    + ')'));
	    }
	} while (false);
    }
    
    public static void method2579(Class158 arg0, Class158 arg1, int arg2) {
	do {
	    try {
		anInt2707++;
		Class131_Sub41_Sub13.aClass158_6322 = arg1;
		Class100.aClass158_1324 = arg0;
		if (arg2 == 0)
		    break;
		anIntArrayArray2727 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("ta.U("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public String method2580(int arg0, String arg1, byte arg2) {
	try {
	    anInt2704++;
	    if (arg2 != 47)
		method2574(null, 83, 106, -3, null, -31, 22, -32, -25, null,
			   -3, -30, -99, null);
	    if (aClass180_2714 == null)
		return arg1;
	    Class131_Sub29 class131_sub29
		= ((Class131_Sub29)
		   aClass180_2714.method2521(-122, (long) arg0));
	    if (class131_sub29 == null)
		return arg1;
	    return class131_sub29.aString4502;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method2581(int arg0, int arg1) {
	try {
	    anInt2730++;
	    if ((arg1 ^ 0xffffffff) == 0)
		return false;
	    if (arg0 != -150)
		return false;
	    if ((anInt2718 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
		return true;
	    if (anIntArray2657 != null) {
		for (int i = 0;
		     (anIntArray2657.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if (arg1 == anIntArray2657[i])
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.T(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method2582(int arg0) {
	try {
	    anInt2723++;
	    if (anIntArray2653 == null) {
		if ((anInt2726 ^ 0xffffffff) == 0 && anIntArray2684 == null)
		    return false;
		return true;
	    }
	    for (int i = arg0; i < anIntArray2653.length; i++) {
		if ((anIntArray2653[i] ^ 0xffffffff) != 0) {
		    Class187 class187
			= Class55.method612(anIntArray2653[i], 29);
		    if ((class187.anInt2726 ^ 0xffffffff) != 0
			|| class187.anIntArray2684 != null)
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ta.M(" + arg0 + ')');
	}
    }
    
    public static int method2583(int arg0, int arg1) {
	try {
	    anInt2650++;
	    int i = -5 / ((22 - arg0) / 43);
	    double d = (double) (arg1 >> -746989456 & 0xff) / 256.0;
	    double d_19_ = (double) (arg1 >> 486068168 & 0xff) / 256.0;
	    double d_20_ = (double) (0xff & arg1) / 256.0;
	    double d_21_ = d;
	    if (d_21_ > d_19_)
		d_21_ = d_19_;
	    if (d_21_ > d_20_)
		d_21_ = d_20_;
	    double d_22_ = d;
	    if (d_22_ < d_19_)
		d_22_ = d_19_;
	    if (d_20_ > d_22_)
		d_22_ = d_20_;
	    double d_23_ = 0.0;
	    double d_24_ = 0.0;
	    double d_25_ = (d_22_ + d_21_) / 2.0;
	    if (d_22_ != d_21_) {
		if (d_25_ < 0.5)
		    d_24_ = (-d_21_ + d_22_) / (d_21_ + d_22_);
		if (d_25_ >= 0.5)
		    d_24_ = (-d_21_ + d_22_) / (2.0 - d_22_ - d_21_);
		if (d_22_ == d)
		    d_23_ = (-d_20_ + d_19_) / (-d_21_ + d_22_);
		else if (d_19_ == d_22_)
		    d_23_ = (d_20_ - d) / (d_22_ - d_21_) + 2.0;
		else if (d_20_ == d_22_)
		    d_23_ = (-d_19_ + d) / (-d_21_ + d_22_) + 4.0;
	    }
	    d_23_ /= 6.0;
	    int i_26_ = (int) (256.0 * d_23_);
	    int i_27_ = (int) (d_24_ * 256.0);
	    if ((i_27_ ^ 0xffffffff) <= -1) {
		if (i_27_ > 255)
		    i_27_ = 255;
	    } else
		i_27_ = 0;
	    int i_28_ = (int) (d_25_ * 256.0);
	    if (i_28_ >= 0) {
		if (i_28_ > 255)
		    i_28_ = 255;
	    } else
		i_28_ = 0;
	    if ((i_28_ ^ 0xffffffff) >= -244) {
		if ((i_28_ ^ 0xffffffff) < -218)
		    i_27_ >>= 3;
		else if (i_28_ <= 192) {
		    if (i_28_ > 179)
			i_27_ >>= 1;
		} else
		    i_27_ >>= 2;
	    } else
		i_27_ >>= 4;
	    return ((i_27_ >> -72590331 << 1771662663)
		    + (((i_26_ & 0xff) >> -213260510 << 1717813642)
		       - -(i_28_ >> 120756321)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2584(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, String arg6) {
	try {
	    if (arg2 == 6) {
		anInt2731++;
		Class1_Sub8 class1_sub8 = new Class1_Sub8();
		class1_sub8.anInt3599 = arg3;
		class1_sub8.aString3593 = arg6;
		class1_sub8.anInt3601 = arg5;
		class1_sub8.anInt3598 = arg0;
		class1_sub8.anInt3596 = Class125.anInt1632 + arg1;
		class1_sub8.anInt3594 = arg4;
		Class34.aClass50_491.method584(class1_sub8, (byte) -118);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ','
						 + (arg6 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class154 method2585(int arg0, int arg1, Class130 arg2, boolean arg3,
			       int arg4) {
	try {
	    anInt2728++;
	    int i = anInt2705 - -64;
	    int i_29_ = anInt2697 - -850;
	    int i_30_ = arg1;
	    boolean bool = aBoolean2687 || arg4 == 2 && arg0 > 3;
	    if (bool)
		arg1 |= 0x10;
	    if ((arg0 ^ 0xffffffff) != -1)
		arg1 |= 0xd;
	    else {
		if ((anInt2667 ^ 0xffffffff) != -129 || anInt2710 != 0)
		    arg1 |= 0x1;
		if (anInt2701 != 128 || (anInt2654 ^ 0xffffffff) != -1)
		    arg1 |= 0x4;
	    }
	    if (anInt2699 != 128 || anInt2686 != 0)
		arg1 |= 0x2;
	    if (aShortArray2692 != null)
		arg1 |= 0x2000;
	    if (aShortArray2656 != null)
		arg1 |= 0x4000;
	    Object object = null;
	    Class154 class154;
	    if (anIntArray2665 == null) {
		if (arg4 != 10)
		    return null;
		if (anIntArray2720 == null)
		    return null;
		int i_31_ = anIntArray2720.length;
		if ((i_31_ ^ 0xffffffff) == -1)
		    return null;
		long l = (long) arg2.anInt1781;
		for (int i_32_ = 0;
		     (i_31_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++)
		    l = (long) anIntArray2720[i_32_] + l * 67783L;
		synchronized (Class153.aClass214_2040) {
		    class154
			= (Class154) Class153.aClass214_2040.method2780(119,
									l);
		}
		if (class154 != null) {
		    if ((class154.method2252() ^ 0xffffffff)
			!= (i ^ 0xffffffff))
			arg1 |= 0x800;
		    if ((class154.method2277() ^ 0xffffffff)
			!= (i_29_ ^ 0xffffffff))
			arg1 |= 0x1000;
		}
		if (class154 == null
		    || arg2.method1208(class154.method2253(), arg1) != 0) {
		    int i_33_ = 0xf81f | arg1;
		    if (class154 != null)
			i_33_ = arg2.method1203(i_33_, class154.method2253());
		    Class116 class116 = null;
		    synchronized (Class31.aClass116Array427) {
			for (int i_34_ = 0; i_31_ > i_34_; i_34_++) {
			    synchronized (Class131_Sub41_Sub7.aClass158_6254) {
				class116
				    = Class134.method2097((anIntArray2720
							   [i_34_]) & 0xffff,
							  0,
							  (Class131_Sub41_Sub7
							   .aClass158_6254),
							  1);
			    }
			    if (class116 == null)
				return null;
			    if (i_31_ > 1)
				Class31.aClass116Array427[i_34_] = class116;
			}
			if ((i_31_ ^ 0xffffffff) < -2)
			    class116 = new Class116(Class31.aClass116Array427,
						    i_31_);
		    }
		    class154
			= arg2.method1218(class116, i_33_,
					  Class131_Sub41_Sub21_Sub2.anInt6595,
					  i, i_29_);
		    synchronized (Class153.aClass214_2040) {
			Class153.aClass214_2040.method2773(arg3, class154, l);
		    }
		}
	    } else {
		int i_35_ = -1;
		for (int i_36_ = 0; i_36_ < anIntArray2665.length; i_36_++) {
		    if (arg4 == anIntArray2665[i_36_]) {
			i_35_ = i_36_;
			break;
		    }
		}
		if ((i_35_ ^ 0xffffffff) == 0)
		    return null;
		int i_37_
		    = arg2.anInt1781 << -725707043 | anIntArray2720[i_35_];
		synchronized (Class153.aClass214_2040) {
		    class154 = (Class154) Class153.aClass214_2040
					      .method2780(123, (long) i_37_);
		}
		if (class154 != null) {
		    if ((class154.method2252() ^ 0xffffffff)
			!= (i ^ 0xffffffff))
			arg1 |= 0x800;
		    if (class154.method2277() != i_29_)
			arg1 |= 0x1000;
		}
		if (class154 == null
		    || arg2.method1208(class154.method2253(), arg1) != 0) {
		    int i_38_ = 0xf81f | arg1;
		    if (class154 != null)
			i_38_ = arg2.method1203(i_38_, class154.method2253());
		    Class116 class116;
		    synchronized (Class131_Sub41_Sub7.aClass158_6254) {
			class116 = Class134.method2097(i_37_ & 0xffff, 0,
						       (Class131_Sub41_Sub7
							.aClass158_6254),
						       1);
		    }
		    if (class116 == null)
			return null;
		    class154
			= arg2.method1218(class116, i_38_,
					  Class131_Sub41_Sub21_Sub2.anInt6595,
					  i, i_29_);
		    synchronized (Class153.aClass214_2040) {
			Class153.aClass214_2040.method2773(arg3, class154,
							   (long) i_37_);
		    }
		}
	    }
	    Class154 class154_39_ = class154.method2287((byte) 0, arg1, arg3);
	    if ((class154.method2252() ^ 0xffffffff) != (i ^ 0xffffffff))
		class154_39_.method2273(i);
	    if ((class154.method2277() ^ 0xffffffff) != (i_29_ ^ 0xffffffff))
		class154_39_.method2284(i_29_);
	    if (bool)
		class154_39_.method2280();
	    if ((arg4 ^ 0xffffffff) == -5 && arg0 > 3) {
		class154_39_.method2289(2048);
		class154_39_.method2272(45, 0, -45);
	    }
	    arg0 &= 0x3;
	    if ((arg0 ^ 0xffffffff) != -2) {
		if ((arg0 ^ 0xffffffff) != -3) {
		    if (arg0 == 3)
			class154_39_.method2289(12288);
		} else
		    class154_39_.method2289(8192);
	    } else
		class154_39_.method2289(4096);
	    if (aShortArray2692 != null) {
		for (int i_40_ = 0;
		     ((i_40_ ^ 0xffffffff)
		      > (aShortArray2692.length ^ 0xffffffff));
		     i_40_++)
		    class154_39_.method2260(aShortArray2692[i_40_],
					    aShortArray2661[i_40_]);
	    }
	    if (aShortArray2656 != null) {
		for (int i_41_ = 0; ((aShortArray2656.length ^ 0xffffffff)
				     < (i_41_ ^ 0xffffffff)); i_41_++)
		    class154_39_.method2281(aShortArray2656[i_41_],
					    aShortArray2675[i_41_]);
	    }
	    if ((anInt2667 ^ 0xffffffff) != -129 || anInt2699 != 128
		|| anInt2701 != 128)
		class154_39_.method2262(anInt2667, anInt2699, anInt2701);
	    if ((anInt2710 ^ 0xffffffff) != -1
		|| (anInt2686 ^ 0xffffffff) != -1
		|| (anInt2654 ^ 0xffffffff) != -1)
		class154_39_.method2272(anInt2710, anInt2686, anInt2654);
	    class154_39_.method2248(i_30_);
	    return class154_39_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ta.K(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    public Class187() {
	anInt2670 = 16;
	aBoolean2664 = true;
	aStringArray2682 = new String[5];
	aBoolean2678 = false;
	aBoolean2687 = false;
	anInt2685 = 0;
	anInt2667 = 128;
	anInt2695 = 0;
	aBoolean2673 = false;
	anInt2697 = 0;
	aBoolean2660 = false;
	aBoolean2691 = true;
	anInt2696 = 255;
	anInt2666 = -1;
	anInt2659 = -1;
	anIntArray2657 = null;
	anInt2663 = -1;
	anInt2698 = 0;
	aBoolean2680 = false;
	anInt2702 = 1;
	anInt2686 = 0;
	anInt2694 = -1;
	anIntArray2700 = null;
	aBoolean2724 = false;
	anInt2699 = 128;
	anInt2703 = -1;
	aBoolean2719 = false;
	anInt2689 = 0;
	anInt2668 = 1;
	anInt2693 = 2;
	anInt2710 = 0;
	anInt2726 = -1;
	aShort2716 = (short) -1;
	aBoolean2721 = false;
	anInt2708 = -1;
	anInt2688 = -1;
	anInt2701 = 128;
	aBoolean2722 = false;
	aBoolean2651 = false;
	anInt2712 = -1;
	anInt2718 = -1;
	anInt2733 = 0;
	anInt2705 = 0;
	anInt2690 = -1;
	anInt2732 = -1;
	aBoolean2735 = true;
	anInt2736 = -1;
	aString2729 = "null";
	aByte2737 = (byte) 0;
    }
}
