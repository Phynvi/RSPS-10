/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class29
{
    public int anInt290;
    public int anInt291 = 0;
    public int[] anIntArray292;
    public int anInt293;
    public int anInt294;
    public int anInt295;
    public static int anInt296;
    public int anInt297;
    public int anInt298;
    public int anInt299;
    public static int anInt300;
    public int anInt301;
    public int anInt302;
    public int anInt303 = 0;
    public int anInt304;
    public int anInt305;
    public static int anInt306;
    public int anInt307;
    public int anInt308;
    public int anInt309;
    public short[] aShortArray310;
    public String[] aStringArray311;
    public int anInt312;
    public int anInt313;
    public static int anInt314;
    public static int anInt315;
    public static int anInt316;
    public int anInt317;
    public int anInt318;
    public short[] aShortArray319;
    public int anInt320;
    public static int anInt321;
    public int anInt322;
    public int anInt323;
    public short[] aShortArray324;
    public static int anInt325;
    public static int anInt326;
    public boolean aBoolean327;
    public int anInt328;
    public static int anInt329;
    public static Class152[] aClass152Array330;
    public int anInt331;
    public int anInt332;
    public static int anInt333;
    public int anInt334;
    public int anInt335;
    public int[] anIntArray336;
    public int anInt337;
    public short[] aShortArray338;
    public static int anInt339;
    public int anInt340;
    public String aString341;
    public int anInt342;
    public static int anInt343;
    public static int anInt344;
    public static int anInt345;
    public static int anInt346;
    public int anInt347;
    public int anInt348;
    public int anInt349;
    public int anInt350;
    public int anInt351;
    public int anInt352;
    public int anInt353;
    public int anInt354;
    public static int anInt355;
    public int anInt356;
    public Class180 aClass180_357;
    public int anInt358;
    public byte[] aByteArray359;
    public int[] anIntArray360;
    public int anInt361;
    public static byte[][][] aByteArrayArrayArray362;
    public int anInt363;
    public int anInt364;
    public String[] aStringArray365;
    public boolean aBoolean366;
    public int anInt367;
    
    public boolean method415(boolean arg0, boolean arg1) {
	try {
	    anInt355++;
	    int i = anInt351;
	    int i_0_ = anInt299;
	    int i_1_ = anInt350;
	    if (arg1) {
		i_0_ = anInt297;
		i = anInt323;
		i_1_ = anInt358;
	    }
	    if ((i ^ 0xffffffff) == 0)
		return true;
	    boolean bool = arg0;
	    if (!Class77.aClass158_1047.method2354(0, i, 103))
		bool = false;
	    if ((i_0_ ^ 0xffffffff) != 0
		&& !Class77.aClass158_1047.method2354(0, i_0_, 113))
		bool = false;
	    if ((i_1_ ^ 0xffffffff) != 0
		&& !Class77.aClass158_1047.method2354(0, i_1_, 125))
		bool = false;
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method416(Class29 arg0, Class29 arg1, byte arg2) {
	try {
	    aStringArray311 = new String[5];
	    anInt351 = arg1.anInt351;
	    anInt293 = arg0.anInt293;
	    anInt358 = arg1.anInt358;
	    anInt350 = arg1.anInt350;
	    aByteArray359 = arg1.aByteArray359;
	    anInt307 = arg1.anInt307;
	    anInt344++;
	    aStringArray365 = arg1.aStringArray365;
	    anInt334 = arg1.anInt334;
	    anInt331 = arg1.anInt331;
	    anInt356 = arg0.anInt356;
	    anInt340 = arg1.anInt340;
	    anInt347 = arg1.anInt347;
	    anInt337 = arg0.anInt337;
	    anInt367 = arg0.anInt367;
	    anInt295 = arg1.anInt295;
	    aShortArray319 = arg1.aShortArray319;
	    anInt320 = arg1.anInt320;
	    anInt305 = arg1.anInt305;
	    anInt291 = arg1.anInt291;
	    anInt328 = arg1.anInt328;
	    anInt363 = arg0.anInt363;
	    if (arg2 > 65) {
		aShortArray310 = arg1.aShortArray310;
		anInt297 = arg1.anInt297;
		anInt317 = arg0.anInt317;
		anInt323 = arg1.anInt323;
		anInt298 = 0;
		anInt303 = arg0.anInt303;
		aShortArray324 = arg1.aShortArray324;
		anInt299 = arg1.anInt299;
		aShortArray338 = arg1.aShortArray338;
		anInt353 = arg1.anInt353;
		aClass180_357 = arg1.aClass180_357;
		aBoolean366 = arg1.aBoolean366;
		aString341 = arg1.aString341;
		if (arg1.aStringArray311 != null) {
		    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
			aStringArray311[i] = arg1.aStringArray311[i];
		}
		aStringArray311[4] = Class131_Sub2_Sub30.aString5990;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.L("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class116 method417(boolean arg0, boolean arg1) {
	try {
	    anInt329++;
	    int i = anInt351;
	    int i_2_ = anInt299;
	    int i_3_ = anInt350;
	    if (arg1) {
		i_2_ = anInt297;
		i = anInt323;
		i_3_ = anInt358;
	    }
	    if (i == -1)
		return null;
	    Class116 class116
		= Class134.method2097(i, 0, Class77.aClass158_1047, 1);
	    if (i_2_ != -1) {
		Class116 class116_4_
		    = Class134.method2097(i_2_, 0, Class77.aClass158_1047, 1);
		if ((i_3_ ^ 0xffffffff) == 0) {
		    Class116[] class116s = { class116, class116_4_ };
		    class116 = new Class116(class116s, 2);
		} else {
		    Class116 class116_5_
			= Class134.method2097(i_3_, 0, Class77.aClass158_1047,
					      1);
		    Class116[] class116s
			= { class116, class116_4_, class116_5_ };
		    class116 = new Class116(class116s, 3);
		}
	    }
	    if (class116 == null)
		return null;
	    if (arg0 != true)
		return null;
	    if (!arg1 && (anInt320 != 0 || (anInt307 ^ 0xffffffff) != -1
			  || anInt291 != 0))
		class116.method993(anInt320, anInt291, 66, anInt307);
	    if (arg1 && (anInt353 != 0 || (anInt334 ^ 0xffffffff) != -1
			 || (anInt347 ^ 0xffffffff) != -1))
		class116.method993(anInt353, anInt347, 23, anInt334);
	    if (aShortArray310 != null) {
		for (int i_6_ = 0; i_6_ < aShortArray310.length; i_6_++)
		    class116.method992(aShortArray324[i_6_],
				       aShortArray310[i_6_], 42);
	    }
	    if (aShortArray319 != null) {
		for (int i_7_ = 0; ((aShortArray319.length ^ 0xffffffff)
				    < (i_7_ ^ 0xffffffff)); i_7_++)
		    class116.method989(-125, aShortArray319[i_7_],
				       aShortArray338[i_7_]);
	    }
	    return class116;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class29 method418(int arg0, int arg1) {
	try {
	    anInt325++;
	    if (anIntArray360 != null && (arg1 ^ 0xffffffff) < -2) {
		int i = -1;
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
		    if (anIntArray292[i_8_] <= arg1
			&& anIntArray292[i_8_] != 0)
			i = anIntArray360[i_8_];
		}
		if ((i ^ 0xffffffff) != 0)
		    return Class131_Sub19.method1808(i, false);
	    }
	    if (arg0 != -11674)
		anInt295 = -39;
	    return this;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method419(int arg0) {
	try {
	    anInt339++;
	    if (Class88.anIntArray1171 == null)
		Class88.anIntArray1171 = new int[65536];
	    else
		return;
	    double d = -0.015 + Math.random() * 0.03 + 0.7;
	    int i = 0;
	    if (arg0 == 1086676003) {
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -513; i_9_++) {
		    float f = 360.0F * ((float) (i_9_ >> 1086676003) / 64.0F
					+ 0.0078125F);
		    float f_10_ = 0.0625F + (float) (i_9_ & 0x7) / 8.0F;
		    for (int i_11_ = 0; i_11_ < 128; i_11_++) {
			float f_12_ = (float) i_11_ / 128.0F;
			float f_13_ = 0.0F;
			float f_14_ = 0.0F;
			float f_15_ = 0.0F;
			float f_16_ = f / 60.0F;
			int i_17_ = (int) f_16_;
			int i_18_ = i_17_ % 6;
			float f_19_ = f_16_ - (float) i_17_;
			float f_20_ = f_12_ * (-f_10_ + 1.0F);
			float f_21_ = f_12_ * (1.0F - f_10_ * f_19_);
			float f_22_ = f_12_ * (1.0F - f_10_ * (1.0F - f_19_));
			if ((i_18_ ^ 0xffffffff) != -1) {
			    if (i_18_ == 1) {
				f_13_ = f_21_;
				f_15_ = f_20_;
				f_14_ = f_12_;
			    } else if (i_18_ != 2) {
				if ((i_18_ ^ 0xffffffff) != -4) {
				    if (i_18_ == 4) {
					f_14_ = f_20_;
					f_13_ = f_22_;
					f_15_ = f_12_;
				    } else if ((i_18_ ^ 0xffffffff) == -6) {
					f_13_ = f_12_;
					f_15_ = f_21_;
					f_14_ = f_20_;
				    }
				} else {
				    f_14_ = f_21_;
				    f_13_ = f_20_;
				    f_15_ = f_12_;
				}
			    } else {
				f_15_ = f_22_;
				f_14_ = f_12_;
				f_13_ = f_20_;
			    }
			} else {
			    f_13_ = f_12_;
			    f_15_ = f_20_;
			    f_14_ = f_22_;
			}
			f_13_ = (float) Math.pow((double) f_13_, d);
			f_14_ = (float) Math.pow((double) f_14_, d);
			f_15_ = (float) Math.pow((double) f_15_, d);
			int i_23_ = (int) (f_13_ * 256.0F);
			int i_24_ = (int) (f_14_ * 256.0F);
			int i_25_ = (int) (256.0F * f_15_);
			int i_26_
			    = i_25_ + ((i_24_ << -2005668088)
				       + (-16777216 - -(i_23_ << 1501484560)));
			Class88.anIntArray1171[i++] = i_26_;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"co.F(" + arg0 + ')');
	}
    }
    
    public void method420(Class29 arg0, boolean arg1, Class29 arg2) {
	try {
	    anInt363 = arg2.anInt363;
	    aShortArray324 = arg2.aShortArray324;
	    aByteArray359 = arg2.aByteArray359;
	    if (arg1 != false)
		anInt353 = 113;
	    aString341 = arg0.aString341;
	    anInt317 = arg2.anInt317;
	    anInt367 = arg2.anInt367;
	    anInt293 = arg2.anInt293;
	    anInt333++;
	    aShortArray319 = arg2.aShortArray319;
	    anInt304 = 1;
	    anInt356 = arg2.anInt356;
	    anInt303 = arg2.anInt303;
	    aShortArray310 = arg2.aShortArray310;
	    aBoolean366 = arg0.aBoolean366;
	    aShortArray338 = arg2.aShortArray338;
	    anInt337 = arg2.anInt337;
	    anInt298 = arg0.anInt298;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class116 method421(boolean arg0, byte arg1) {
	try {
	    anInt346++;
	    int i = anInt340;
	    int i_27_ = anInt305;
	    if (arg1 <= 40)
		method430(true, 106);
	    if (arg0) {
		i = anInt328;
		i_27_ = anInt331;
	    }
	    if (i == -1)
		return null;
	    Class116 class116
		= Class134.method2097(i, 0, Class77.aClass158_1047, 1);
	    if ((i_27_ ^ 0xffffffff) != 0) {
		Class116 class116_28_
		    = Class134.method2097(i_27_, 0, Class77.aClass158_1047, 1);
		Class116[] class116s = { class116, class116_28_ };
		class116 = new Class116(class116s, 2);
	    }
	    if (aShortArray310 != null) {
		for (int i_29_ = 0; i_29_ < aShortArray310.length; i_29_++)
		    class116.method992(aShortArray324[i_29_],
				       aShortArray310[i_29_], -103);
	    }
	    if (aShortArray319 != null) {
		for (int i_30_ = 0; i_30_ < aShortArray319.length; i_30_++)
		    class116.method989(-125, aShortArray319[i_30_],
				       aShortArray338[i_30_]);
	    }
	    return class116;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public String method422(byte arg0, int arg1, String arg2) {
	try {
	    anInt321++;
	    if (aClass180_357 == null)
		return arg2;
	    Class131_Sub29 class131_sub29
		= (Class131_Sub29) aClass180_357.method2521(87, (long) arg1);
	    if (class131_sub29 == null)
		return arg2;
	    if (arg0 > -76)
		anInt332 = -38;
	    return class131_sub29.aString4502;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.H(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method423(boolean arg0, int arg1, Stream arg2) {
	try {
	    if ((arg1 ^ 0xffffffff) == -2)
		anInt293 = arg2.readUnsignedShort(8104);
	    else if (arg1 != 2) {
		if (arg1 != 4) {
		    if ((arg1 ^ 0xffffffff) == -6)
			anInt317 = arg2.readUnsignedShort(8104);
		    else if (arg1 != 6) {
			if (arg1 != 7) {
			    if (arg1 != 8) {
				if ((arg1 ^ 0xffffffff) == -12)
				    anInt304 = 1;
				else if (arg1 != 12) {
				    if ((arg1 ^ 0xffffffff) != -17) {
					if (arg1 == 23)
					    anInt351 = arg2.readUnsignedShort(8104);
					else if (arg1 != 24) {
					    if ((arg1 ^ 0xffffffff) != -26) {
						if (arg1 != 26) {
						    if (arg1 < 30
							|| ((arg1 ^ 0xffffffff)
							    <= -36)) {
							if (arg1 >= 35
							    && ((arg1
								 ^ 0xffffffff)
								> -41))
							    aStringArray311
								[arg1 - 35]
								= (arg2.readString
								   (false));
							else if ((arg1
								  ^ 0xffffffff)
								 != -41) {
							    if ((arg1
								 ^ 0xffffffff)
								!= -42) {
								if (arg1
								    != 42) {
								    if ((arg1
									 ^ 0xffffffff)
									== -66)
									aBoolean327
									    = true;
								    else if (arg1
									     != 78) {
									if (arg1
									    == 79)
									    anInt358 = arg2.readUnsignedShort(8104);
									else if ((arg1 ^ 0xffffffff) != -91) {
									    if ((arg1 ^ 0xffffffff) == -92)
										anInt328 = arg2.readUnsignedShort(8104);
									    else if ((arg1 ^ 0xffffffff) == -93)
										anInt305 = arg2.readUnsignedShort(8104);
									    else if (arg1 == 93)
										anInt331 = arg2.readUnsignedShort(8104);
									    else if (arg1 == 95)
										anInt356 = arg2.readUnsignedShort(8104);
									    else if (arg1 != 96) {
										if ((arg1 ^ 0xffffffff) == -98)
										    anInt294 = arg2.readUnsignedShort(8104);
										else if (arg1 != 98) {
										    if (arg1 >= 100 && (arg1 ^ 0xffffffff) > -111) {
											if (anIntArray360 == null) {
											    anIntArray360 = new int[10];
											    anIntArray292 = new int[10];
											}
											anIntArray360[arg1 - 100] = arg2.readUnsignedShort(8104);
											anIntArray292[-100 + arg1] = arg2.readUnsignedShort(8104);
										    } else if (arg1 == 110)
											anInt342 = arg2.readUnsignedShort(8104);
										    else if (arg1 == 111)
											anInt335 = arg2.readUnsignedShort(8104);
										    else if ((arg1 ^ 0xffffffff) != -113) {
											if ((arg1 ^ 0xffffffff) == -114)
											    anInt352 = arg2.readSignedByte((byte) 127);
											else if (arg1 == 114)
											    anInt332 = 5 * arg2.readSignedByte((byte) 127);
											else if (arg1 != 115) {
											    if ((arg1 ^ 0xffffffff) == -122)
												anInt361 = arg2.readUnsignedShort(8104);
											    else if (arg1 == 122)
												anInt309 = arg2.readUnsignedShort(8104);
											    else if ((arg1 ^ 0xffffffff) != -126) {
												if ((arg1 ^ 0xffffffff) != -127) {
												    if ((arg1 ^ 0xffffffff) == -128) {
													anInt312 = arg2.readUnsignedByte(-101);
													anInt308 = arg2.readUnsignedShort(8104);
												    } else if ((arg1 ^ 0xffffffff) != -129) {
													if ((arg1 ^ 0xffffffff) != -130) {
													    if (arg1 == 130) {
														anInt354 = arg2.readUnsignedByte(86);
														anInt302 = arg2.readUnsignedShort(8104);
													    } else if (arg1 != 132) {
														if ((arg1 ^ 0xffffffff) == -250) {
														    int i = arg2.readUnsignedByte(107);
														    if (aClass180_357 == null) {
															int i_31_ = Class101.method887(1388313616, i);
															aClass180_357 = new Class180(i_31_);
														    }
														    for (int i_32_ = 0; i_32_ < i; i_32_++) {
															boolean bool = arg2.readUnsignedByte(102) == 1;
															int i_33_ = arg2.read3Bytes(false);
															Class131 class131;
															if (!bool)
															    class131 = new Class131_Sub24(arg2.readUnsignedInt(-2));
															else
															    class131 = new Class131_Sub29(arg2.readString(false));
															aClass180_357.method2523(!arg0, (long) i_33_, class131);
														    }
														}
													    } else {
														int i = arg2.readUnsignedByte(94);
														anIntArray336 = new int[i];
														for (int i_34_ = 0; i > i_34_; i_34_++)
														    anIntArray336[i_34_] = arg2.readUnsignedShort(8104);
													    }
													} else {
													    anInt322 = arg2.readUnsignedByte(94);
													    anInt348 = arg2.readUnsignedShort(8104);
													}
												    } else {
													anInt313 = arg2.readUnsignedByte(110);
													anInt301 = arg2.readUnsignedShort(8104);
												    }
												} else {
												    anInt353 = arg2.readSignedByte((byte) 127);
												    anInt334 = arg2.readSignedByte((byte) 127);
												    anInt347 = arg2.readSignedByte((byte) 127);
												}
											    } else {
												anInt320 = arg2.readSignedByte((byte) 127);
												anInt307 = arg2.readSignedByte((byte) 127);
												anInt291 = arg2.readSignedByte((byte) 127);
											    }
											} else
											    anInt295 = arg2.readUnsignedByte(-16);
										    } else
											anInt364 = arg2.readUnsignedShort(8104);
										} else
										    anInt318 = arg2.readUnsignedShort(8104);
									    } else
										anInt290 = arg2.readUnsignedByte(-115);
									} else
									    anInt340 = arg2.readUnsignedShort(8104);
								    } else
									anInt350
									    = arg2.readUnsignedShort(8104);
								} else {
								    int i
									= (arg2.readUnsignedByte
									   (111));
								    aByteArray359
									= (new byte
									   [i]);
								    for (int i_35_
									     = 0;
									 i > i_35_;
									 i_35_++)
									aByteArray359
									    [i_35_]
									    = arg2.readSignedByte((byte) 127);
								}
							    } else {
								int i
								    = (arg2.readUnsignedByte
								       (109));
								aShortArray338
								    = (new short
								       [i]);
								aShortArray319
								    = (new short
								       [i]);
								for (int i_36_
									 = 0;
								     ((i_36_
								       ^ 0xffffffff)
								      > (i
									 ^ 0xffffffff));
								     i_36_++) {
								    aShortArray319
									[i_36_]
									= (short) arg2.readUnsignedShort(8104);
								    aShortArray338
									[i_36_]
									= (short) arg2.readUnsignedShort(8104);
								}
							    }
							} else {
							    int i
								= (arg2.readUnsignedByte
								   (-105));
							    aShortArray310
								= new short[i];
							    aShortArray324
								= new short[i];
							    for (int i_37_ = 0;
								 i > i_37_;
								 i_37_++) {
								aShortArray310
								    [i_37_]
								    = (short) arg2.readUnsignedShort(8104);
								aShortArray324
								    [i_37_]
								    = (short) arg2.readUnsignedShort(8104);
							    }
							}
						    } else {
							aStringArray365
							    [-30 + arg1]
							    = (arg2.readString
							       (false));
							if (aStringArray365
								[arg1 + -30]
								.equalsIgnoreCase
							    (Class165
							     .aString2196))
							    aStringArray365
								[-30 + arg1]
								= null;
						    }
						} else
						    anInt297 = (arg2.readUnsignedShort
								(8104));
					    } else
						anInt323
						    = arg2.readUnsignedShort(8104);
					} else
					    anInt299 = arg2.readUnsignedShort(8104);
				    } else
					aBoolean366 = true;
				} else
				    anInt298 = arg2.readUnsignedInt(-2);
			    } else {
				anInt363 = arg2.readUnsignedShort(8104);
				if (anInt363 > 32767)
				    anInt363 -= 65536;
			    }
			} else {
			    anInt367 = arg2.readUnsignedShort(8104);
			    if ((anInt367 ^ 0xffffffff) < -32768)
				anInt367 -= 65536;
			}
		    } else
			anInt303 = arg2.readUnsignedShort(8104);
		} else
		    anInt337 = arg2.readUnsignedShort(8104);
	    } else
		aString341 = arg2.readString(false);
	    if (arg0 != true)
		method420(null, true, null);
	    anInt306++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.I(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class154 method424(byte arg0, int arg1, Class130 arg2, int arg3,
			      int arg4, int arg5, Class161 arg6, Class188 arg7,
			      int arg8) {
	try {
	    anInt314++;
	    if (anIntArray360 != null && arg1 > 1) {
		int i = -1;
		for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -11; i_38_++) {
		    if ((arg1 ^ 0xffffffff) <= (anIntArray292[i_38_]
						^ 0xffffffff)
			&& (anIntArray292[i_38_] ^ 0xffffffff) != -1)
			i = anIntArray360[i_38_];
		}
		if (i != -1)
		    return (Class131_Sub19.method1808(i, false).method424
			    ((byte) -59, 1, arg2, arg3, arg4, arg5, arg6, arg7,
			     arg8));
	    }
	    int i = arg5;
	    if (arg6 != null)
		i |= arg6.method2389(arg0 + 60, true, arg8, arg4);
	    Class154 class154;
	    synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		class154
		    = (Class154) (Class131_Sub41_Sub5.aClass214_6226.method2780
				  (124, (long) (arg2.anInt1781 << 1625011773
						| anInt349)));
	    }
	    if (class154 == null || (arg2.method1208(class154.method2253(), i)
				     ^ 0xffffffff) != -1) {
		if (class154 != null)
		    i = arg2.method1203(i, class154.method2253());
		int i_39_ = i;
		if (aShortArray319 != null)
		    i_39_ |= 0x4000;
		if (aShortArray310 != null || arg7 != null)
		    i_39_ |= 0x2000;
		if (anInt342 != 128)
		    i_39_ |= 0x1;
		if (anInt342 != 128)
		    i_39_ |= 0x2;
		if (anInt342 != 128)
		    i_39_ |= 0x4;
		Class116 class116
		    = Class134.method2097(anInt293, 0, Class77.aClass158_1047,
					  arg0 + 60);
		if (class116 == null)
		    return null;
		class154
		    = arg2.method1218(class116, i_39_, Class1_Sub3.anInt3528,
				      64 + anInt352, anInt332 + 850);
		if (anInt342 != 128 || (anInt335 ^ 0xffffffff) != -129
		    || (anInt364 ^ 0xffffffff) != -129)
		    class154.method2262(anInt342, anInt335, anInt364);
		if (aShortArray310 != null) {
		    for (int i_40_ = 0; aShortArray310.length > i_40_;
			 i_40_++) {
			if (aByteArray359 != null
			    && (i_40_ ^ 0xffffffff) > (aByteArray359.length
						       ^ 0xffffffff))
			    class154.method2260(aShortArray310[i_40_],
						(Class160.aShortArray2132
						 [(aByteArray359[i_40_]
						   & 0xff)]));
			else
			    class154.method2260(aShortArray310[i_40_],
						aShortArray324[i_40_]);
		    }
		}
		if (aShortArray319 != null) {
		    for (int i_41_ = 0; aShortArray319.length > i_41_; i_41_++)
			class154.method2281(aShortArray319[i_41_],
					    aShortArray338[i_41_]);
		}
		if (arg7 != null) {
		    for (int i_42_ = 0; i_42_ < 5; i_42_++) {
			if ((arg7.anIntArray2756[i_42_] ^ 0xffffffff)
			    > ((Class131_Sub41_Sub5.aShortArrayArray6233
				[i_42_]).length
			       ^ 0xffffffff))
			    class154.method2260(Class5.aShortArray89[i_42_],
						(Class131_Sub41_Sub5
						 .aShortArrayArray6233[i_42_]
						 [(arg7.anIntArray2756
						   [i_42_])]));
			if (Class63.aShortArrayArray800[i_42_].length
			    > arg7.anIntArray2756[i_42_])
			    class154.method2260((Class144.aShortArray1916
						 [i_42_]),
						(Class63.aShortArrayArray800
						 [i_42_]
						 [(arg7.anIntArray2756
						   [i_42_])]));
		    }
		}
		class154.method2248(i);
		synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		    Class131_Sub41_Sub5.aClass214_6226.method2773
			(true, class154,
			 (long) (anInt349 | arg2.anInt1781 << -599764899));
		}
	    }
	    if (arg6 != null)
		class154 = arg6.method2388(arg8, arg3, i, (byte) -128,
					   class154, arg4);
	    class154.method2248(arg5);
	    if (arg0 != -59)
		method415(true, false);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("co.Q(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8
			+ ')'));
	}
    }
    
    public static void method425(Class1_Sub4 arg0, int arg1) {
	anInt296++;
	arg0.aClass23_Sub4_Sub1_3545 = null;
	if (arg1 > Class153_Sub2.anInt4773) {
	    Class100.aClass50_1322.method584(arg0, (byte) -119);
	    Class153_Sub2.anInt4773++;
	}
    }
    
    public void method426(int arg0, Stream arg1) {
	try {
	    for (;;) {
		int i = arg1.readUnsignedByte(-48);
		if (i == 0)
		    break;
		method423(true, i, arg1);
	    }
	    anInt315++;
	    int i = -94 % ((55 - arg0) / 63);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.O(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method427(int arg0, int arg1, int arg2) {
	try {
	    anInt343++;
	    if (aClass180_357 == null)
		return arg1;
	    int i = -126 % ((52 - arg0) / 61);
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_357.method2521(-42, (long) arg2);
	    if (class131_sub24 == null)
		return arg1;
	    return class131_sub24.anInt4465;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method428(int arg0) {
	try {
	    aClass152Array330 = null;
	    if (arg0 == -25276)
		aByteArrayArrayArray362 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"co.P(" + arg0 + ')');
	}
    }
    
    public void method429(int arg0) {
	try {
	    if (arg0 != 128)
		method420(null, true, null);
	    anInt316++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"co.D(" + arg0 + ')');
	}
    }
    
    public boolean method430(boolean arg0, int arg1) {
	try {
	    anInt326++;
	    int i = anInt340;
	    int i_43_ = anInt305;
	    if (arg0) {
		i_43_ = anInt331;
		i = anInt328;
	    }
	    if ((i ^ 0xffffffff) == 0)
		return true;
	    boolean bool = true;
	    if (!Class77.aClass158_1047.method2354(0, i, 119))
		bool = false;
	    if (arg1 >= -79)
		method420(null, true, null);
	    if ((i_43_ ^ 0xffffffff) != 0
		&& !Class77.aClass158_1047.method2354(0, i_43_, 110))
		bool = false;
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("co.N(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method431(byte arg0) {
	try {
	    int i = -1 / ((39 - arg0) / 41);
	    synchronized (Class131_Sub14.aClass214_4278) {
		Class131_Sub14.aClass214_4278.method2775((byte) 56);
	    }
	    anInt345++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"co.M(" + arg0 + ')');
	}
    }
    
    public Class29() {
	anInt297 = -1;
	anInt308 = -1;
	anInt313 = -1;
	anInt317 = 0;
	aStringArray311 = new String[] { null, null, null, null,
					 Class23_Sub2_Sub2.aString5195 };
	anInt323 = -1;
	anInt294 = -1;
	anInt312 = -1;
	anInt318 = -1;
	anInt307 = 0;
	anInt299 = -1;
	aBoolean327 = false;
	anInt320 = 0;
	anInt295 = 0;
	anInt334 = 0;
	anInt332 = 0;
	aString341 = "null";
	anInt290 = 0;
	anInt309 = -1;
	anInt302 = -1;
	anInt337 = 2000;
	anInt347 = 0;
	anInt331 = -1;
	anInt351 = -1;
	anInt352 = 0;
	anInt301 = -1;
	anInt304 = 0;
	anInt322 = -1;
	anInt340 = -1;
	anInt305 = -1;
	anInt354 = -1;
	anInt335 = 128;
	anInt328 = -1;
	anInt348 = -1;
	anInt342 = 128;
	anInt361 = -1;
	anInt353 = 0;
	anInt363 = 0;
	anInt358 = -1;
	anInt298 = 1;
	anInt356 = 0;
	aStringArray365
	    = new String[] { null, null, Class33.aString457, null, null };
	anInt364 = 128;
	aBoolean366 = false;
	anInt350 = -1;
	anInt367 = 0;
    }
}
