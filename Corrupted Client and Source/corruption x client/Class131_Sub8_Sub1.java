/* Class131_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub8_Sub1 extends Class131_Sub8
{
    public static int anInt6088;
    public static boolean aBoolean6089;
    public static int anInt6090;
    public static int anInt6091;
    public boolean aBoolean6092;
    public static int anInt6093;
    public int anInt6094;
    public int anInt6095;
    public static String aString6096;
    public int anInt6097;
    public static int anInt6098 = 0;
    public static int anInt6099;
    public static int anInt6100;
    public static int anInt6101;
    public int anInt6102;
    public boolean aBoolean6103;
    public short[] aShortArray6104;
    public int anInt6105;
    public static Class131_Sub1_Sub1 aClass131_Sub1_Sub1_6106;
    public static int anInt6107;
    public static int anInt6108;
    public static int anInt6109;
    public int anInt6110;
    public static int anInt6111;
    public int anInt6112;
    
    public static void method1678(int arg0) {
	try {
	    int i = 72 % ((arg0 - -77) / 49);
	    aClass131_Sub1_Sub1_6106 = null;
	    aString6096 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nd.C(" + arg0 + ')');
	}
    }
    
    public void method1679(boolean arg0, int arg1, int arg2) {
	try {
	    anInt6109++;
	    if (arg2 != 1536)
		aClass131_Sub1_Sub1_6106 = null;
	    int i;
	while_41_:
	    do {
		if (!arg0) {
		    int i_0_ = anInt6102 + anInt6112 * arg1 / 50 & 0x7ff;
		    int i_1_ = anInt6105;
		while_40_:
		    do {
		    while_39_:
			do {
			while_38_:
			    do {
				do {
				    if ((i_1_ ^ 0xffffffff) != -2) {
					if ((i_1_ ^ 0xffffffff) != -4) {
					    if (i_1_ != 4) {
						if ((i_1_ ^ 0xffffffff)
						    != -3) {
						    if (i_1_ == 5)
							break while_39_;
						    break while_40_;
						}
					    } else
						break;
					    break while_38_;
					}
				    } else {
					i = ((Class31.anIntArray434
					      [i_0_ << 1022493763])
					     >> 1067788325) + 1024;
					break while_41_;
				    }
				    i = (Class211.anIntArray3084[i_0_]
					 >> -1320417567);
				    break while_41_;
				} while (false);
				i = i_0_ >> 1611208554 << -147282165;
				break while_41_;
			    } while (false);
			    i = i_0_;
			    break while_41_;
			} while (false);
			i = (((i_0_ ^ 0xffffffff) > -1025 ? i_0_ : 2048 - i_0_)
			     << -321393855);
			break while_41_;
		    } while (false);
		    i = 2048;
		} else
		    i = 2048;
	    } while (false);
	    aFloat4187
		= (float) (anInt6094 + (i * anInt6097 >> 142626923)) / 2048.0F;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nd.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1680(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt6088++;
	    anInt6094 = arg1;
	    if (arg2 > -98)
		aClass131_Sub1_Sub1_6106 = null;
	    anInt6097 = arg3;
	    anInt6105 = arg0;
	    anInt6112 = arg4;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nd.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1681(int arg0, int arg1, Class131_Sub19 arg2,
				  int arg3, int arg4, int arg5) {
	anInt6093++;
	if ((arg2.anInt4401 ^ 0xffffffff) != 0
	    || arg2.anIntArray4414 != null) {
	    int i = 0;
	    int i_2_ = InputStream_Sub1.anInt55 * arg2.anInt4396 >> 913234376;
	    if ((arg3 ^ 0xffffffff) < (arg2.anInt4411 ^ 0xffffffff))
		i += -arg2.anInt4411 + arg3;
	    else if ((arg3 ^ 0xffffffff) > (arg2.anInt4415 ^ 0xffffffff))
		i += -arg3 + arg2.anInt4415;
	    if (arg5 <= arg2.anInt4413) {
		if ((arg2.anInt4407 ^ 0xffffffff) < (arg5 ^ 0xffffffff))
		    i += arg2.anInt4407 - arg5;
	    } else
		i += -arg2.anInt4413 + arg5;
	    if ((arg2.anInt4394 ^ 0xffffffff) == -1
		|| (arg2.anInt4394 ^ 0xffffffff) > (i - 64 ^ 0xffffffff)
		|| (InputStream_Sub1.anInt55 ^ 0xffffffff) == -1
		|| (arg0 ^ 0xffffffff) != (arg2.anInt4392 ^ 0xffffffff)) {
		if (arg2.aClass131_Sub1_Sub2_4393 != null) {
		    Class78.aClass131_Sub1_Sub3_1057
			.method1441(arg2.aClass131_Sub1_Sub2_4393);
		    arg2.aClass131_Sub1_Sub2_4393 = null;
		}
		if (arg2.aClass131_Sub1_Sub2_4391 != null) {
		    Class78.aClass131_Sub1_Sub3_1057
			.method1441(arg2.aClass131_Sub1_Sub2_4391);
		    arg2.aClass131_Sub1_Sub2_4391 = null;
		}
	    } else {
		i -= 64;
		if ((i ^ 0xffffffff) > -1)
		    i = 0;
		int i_3_ = i_2_ * (-i + arg2.anInt4394) / arg2.anInt4394;
		if (arg2.aClass131_Sub1_Sub2_4393 != null)
		    arg2.aClass131_Sub1_Sub2_4393.method1418(i_3_);
		else if (arg2.anInt4401 >= 0) {
		    Class16 class16
			= Class16.method226(Class135.aClass158_1814,
					    arg2.anInt4401, 0);
		    if (class16 != null) {
			Class131_Sub12_Sub1 class131_sub12_sub1
			    = class16.method225()
				  .method1700(Class49.aClass71_653);
			Class131_Sub1_Sub2 class131_sub1_sub2
			    = Class131_Sub1_Sub2
				  .method1401(class131_sub12_sub1, 100, i_3_);
			class131_sub1_sub2.method1435(-1);
			Class78.aClass131_Sub1_Sub3_1057
			    .method1446(class131_sub1_sub2);
			arg2.aClass131_Sub1_Sub2_4393 = class131_sub1_sub2;
		    }
		}
		int i_4_ = 4 % ((arg4 - 3) / 44);
		if (arg2.aClass131_Sub1_Sub2_4391 != null) {
		    arg2.aClass131_Sub1_Sub2_4391.method1418(i_3_);
		    if (!arg2.aClass131_Sub1_Sub2_4391.method1352(true))
			arg2.aClass131_Sub1_Sub2_4391 = null;
		} else if (arg2.anIntArray4414 != null
			   && ((arg2.anInt4406 -= arg1) ^ 0xffffffff) >= -1) {
		    int i_5_ = (int) (Math.random()
				      * (double) arg2.anIntArray4414.length);
		    Class16 class16
			= Class16.method226(Class135.aClass158_1814,
					    arg2.anIntArray4414[i_5_], 0);
		    if (class16 != null) {
			Class131_Sub12_Sub1 class131_sub12_sub1
			    = class16.method225()
				  .method1700(Class49.aClass71_653);
			Class131_Sub1_Sub2 class131_sub1_sub2
			    = Class131_Sub1_Sub2
				  .method1401(class131_sub12_sub1, 100, i_3_);
			class131_sub1_sub2.method1435(0);
			Class78.aClass131_Sub1_Sub3_1057
			    .method1446(class131_sub1_sub2);
			arg2.aClass131_Sub1_Sub2_4391 = class131_sub1_sub2;
			arg2.anInt4406
			    = (arg2.anInt4405
			       + (int) (Math.random()
					* (double) (-arg2.anInt4405
						    + arg2.anInt4395)));
		    }
		}
	    }
	}
    }
    
    public static String method1682(int arg0, int arg1, int arg2,
				    byte[] arg3) {
	try {
	    anInt6090++;
	    char[] cs = new char[arg0];
	    int i = 0;
	    for (int i_6_ = 0; i_6_ < arg0; i_6_++) {
		int i_7_ = 0xff & arg3[i_6_ + arg1];
		if ((i_7_ ^ 0xffffffff) != -1) {
		    if ((i_7_ ^ 0xffffffff) <= -129
			&& (i_7_ ^ 0xffffffff) > -161) {
			int i_8_
			    = Class131_Sub41_Sub17.aCharArray6385[i_7_ - 128];
			if (i_8_ == 0)
			    i_8_ = 63;
			i_7_ = i_8_;
		    }
		    cs[i++] = (char) i_7_;
		}
	    }
	    if (arg2 != 4238)
		aClass131_Sub1_Sub1_6106 = null;
	    return new String(cs, 0, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nd.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1683(byte arg0, int arg1) {
	anInt6108++;
	Class131_Sub2_Sub38.method1645((byte) -98);
	Class200.method2713(22050);
	int i = Class28.method412((byte) -87, arg1).anInt748;
	if ((i ^ 0xffffffff) != -1) {
	    int i_9_ = Class131_Sub2_Sub13.anIntArray5735[arg1];
	    if (i == 9)
		Class220.anInt3231 = i_9_;
	    if (arg0 >= 25) {
		if (i == 6)
		    Class184.anInt2622 = i_9_;
		if ((i ^ 0xffffffff) == -6)
		    Class131_Sub27.anInt4491 = i_9_;
	    }
	}
    }
    
    public void method1684(int arg0) {
	anInt6107++;
	int i = anInt6110;
    while_55_:
	do {
	while_54_:
	    do {
	    while_53_:
		do {
		while_52_:
		    do {
		    while_51_:
			do {
			while_50_:
			    do {
			    while_49_:
				do {
				while_48_:
				    do {
				    while_47_:
					do {
					while_46_:
					    do {
					    while_45_:
						do {
						while_44_:
						    do {
						    while_43_:
							do {
							while_42_:
							    do {
								do {
								    if ((i
									 ^ 0xffffffff)
									!= -3) {
									if ((i
									     ^ 0xffffffff)
									    != -4) {
									    if (i != 4) {
										if ((i ^ 0xffffffff) != -6) {
										    if (i != 12) {
											if (i != 13) {
											    if ((i ^ 0xffffffff) != -11) {
												if ((i ^ 0xffffffff) != -12) {
												    if (i != 6) {
													if (i != 7) {
													    if (i != 8) {
														if ((i ^ 0xffffffff) != -10) {
														    if ((i ^ 0xffffffff) != -15) {
															if ((i ^ 0xffffffff) != -16) {
															    if ((i ^ 0xffffffff) == -17)
																break while_53_;
															    break while_54_;
															}
														    } else
															break while_51_;
														    break while_52_;
														}
													    } else
														break while_49_;
													    break while_50_;
													}
												    } else
													break while_47_;
												    break while_48_;
												}
											    } else
												break while_45_;
											    break while_46_;
											}
										    } else
											break while_43_;
										    break while_44_;
										}
									    } else
										break;
									    break while_42_;
									}
								    } else {
									anInt6097
									    = 2048;
									anInt6105
									    = 1;
									anInt6094
									    = 0;
									anInt6112
									    = 2048;
									break while_55_;
								    }
								    anInt6105
									= 1;
								    anInt6097
									= 2048;
								    anInt6094
									= 0;
								    anInt6112
									= 4096;
								    break while_55_;
								} while (false);
								anInt6112
								    = 2048;
								anInt6105 = 4;
								anInt6094 = 0;
								anInt6097
								    = 2048;
								break while_55_;
							    } while (false);
							    anInt6097 = 2048;
							    anInt6105 = 4;
							    anInt6094 = 0;
							    anInt6112 = 8192;
							    break while_55_;
							} while (false);
							anInt6112 = 2048;
							anInt6097 = 2048;
							anInt6094 = 0;
							anInt6105 = 2;
							break while_55_;
						    } while (false);
						    anInt6097 = 2048;
						    anInt6112 = 8192;
						    anInt6094 = 0;
						    anInt6105 = 2;
						    break while_55_;
						} while (false);
						anInt6097 = 512;
						anInt6105 = 3;
						anInt6094 = 1536;
						anInt6112 = 2048;
						break while_55_;
					    } while (false);
					    anInt6112 = 4096;
					    anInt6105 = 3;
					    anInt6094 = 1536;
					    anInt6097 = 512;
					    break while_55_;
					} while (false);
					anInt6097 = 768;
					anInt6094 = 1280;
					anInt6112 = 2048;
					anInt6105 = 3;
					break while_55_;
				    } while (false);
				    anInt6105 = 3;
				    anInt6094 = 1280;
				    anInt6112 = 4096;
				    anInt6097 = 768;
				    break while_55_;
				} while (false);
				anInt6105 = 3;
				anInt6097 = 1024;
				anInt6112 = 2048;
				anInt6094 = 1024;
				break while_55_;
			    } while (false);
			    anInt6094 = 1024;
			    anInt6097 = 1024;
			    anInt6112 = 4096;
			    anInt6105 = 3;
			    break while_55_;
			} while (false);
			anInt6112 = 2048;
			anInt6105 = 1;
			anInt6097 = 768;
			anInt6094 = 1280;
			break while_55_;
		    } while (false);
		    anInt6097 = 512;
		    anInt6094 = 1536;
		    anInt6105 = 1;
		    anInt6112 = 4096;
		    break while_55_;
		} while (false);
		anInt6097 = 256;
		anInt6105 = 1;
		anInt6094 = 1792;
		anInt6112 = 8192;
		break while_55_;
	    } while (false);
	    anInt6094 = 0;
	    anInt6105 = 0;
	    anInt6097 = 2048;
	    anInt6112 = 2048;
	} while (false);
	if (arg0 <= 58)
	    anInt6112 = -35;
    }
    
    public Class131_Sub8_Sub1() {
	try {
	    if (Class211.anIntArray3084 == null)
		Class41.method514((byte) 117);
	    method1684(114);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nd.<init>(" + ')');
	}
    }
    
    public Class131_Sub8_Sub1(Stream arg0) {
	if (Class211.anIntArray3084 == null)
	    Class41.method514((byte) -25);
	anInt6095 = arg0.readUnsignedByte(66);
	aBoolean6103 = (0x10 & anInt6095 ^ 0xffffffff) != -1;
	aBoolean6092 = (0x8 & anInt6095) != 0;
	anInt6095 = 0x7 & anInt6095;
	anInt4195 = arg0.readUnsignedShort(8104);
	anInt4191 = arg0.readUnsignedShort(8104);
	anInt4185 = arg0.readUnsignedShort(8104);
	anInt4192 = arg0.readUnsignedByte(-80);
	int i = 2 * anInt4192 - -1;
	aShortArray6104 = new short[i];
	for (int i_10_ = 0; aShortArray6104.length > i_10_; i_10_++) {
	    int i_11_ = (short) arg0.readUnsignedShort(8104);
	    int i_12_ = i_11_ >>> 66645064;
	    if ((i ^ 0xffffffff) >= (i_12_ ^ 0xffffffff))
		i_12_ = -1 + i;
	    int i_13_ = 0xff & i_11_;
	    if (i_13_ > -i_12_ + i)
		i_13_ = -i_12_ + i;
	    aShortArray6104[i_10_]
		= (short) Cryption.method2105(i_12_ << -152169272, i_13_);
	}
	anInt4192 = 64 + (anInt4192 << 569747751);
	if (Class131_Sub2_Sub37.anIntArray6058 != null)
	    anInt4189
		= Class131_Sub2_Sub37.anIntArray6058[arg0.readUnsignedShort(8104)];
	else
	    anInt4189
		= (Class88.anIntArray1171
		   [(Class131_Sub2_Sub22.method1575((byte) -125,
						    arg0.readUnsignedShort(8104))
		     & 0xffff)]);
	int i_14_ = arg0.readUnsignedByte(-60);
	anInt6110 = i_14_ & 0x1f;
	anInt6102 = (i_14_ & 0xe0) << 382709123;
	if ((anInt6110 ^ 0xffffffff) != -32)
	    method1684(103);
    }
    
    static {
	aString6096 = "Please wait...";
	aBoolean6089 = true;
	anInt6100 = 0;
	anInt6111 = 1;
    }
}
