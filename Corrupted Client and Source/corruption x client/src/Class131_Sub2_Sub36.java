/* Class131_Sub2_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub36 extends Class131_Sub2
{
    public static int anInt6045;
    public static int anInt6046;
    public static int anInt6047;
    public static long aLong6048;
    public static int anInt6049;
    public static int[] anIntArray6050 = new int[32];
    public static Class131_Sub41_Sub1 aClass131_Sub41_Sub1_6051;
    public static volatile int anInt6052;
    public int anInt6053 = 6;
    public static int anInt6054;
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	    do {
		if (i != 0) {
		    if (i != 1)
			break;
		} else {
		    anInt6053 = arg2.readUnsignedByte(arg1 ^ ~0x5a);
		    break;
		}
		aBoolean4093 = (arg2.readUnsignedByte(84) ^ 0xffffffff) == -2;
	    } while (false);
	    if (arg1 != -49)
		anInt6052 = 14;
	    anInt6046++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vn.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1635(boolean arg0) {
	try {
	    aClass131_Sub41_Sub1_6051 = null;
	    if (arg0 != false)
		anInt6052 = -58;
	    anIntArray6050 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vn.B(" + arg0 + ')');
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		anInt6052 = -11;
	    anInt6047++;
	    int[][] is = aClass59_4097.method641(arg0, arg1 ^ ~0x1);
	while_91_:
	    do {
		if (aClass59_4097.aBoolean783) {
		    int[][] is_0_ = this.method1463(0, (byte) 116, arg0);
		    int[][] is_1_ = this.method1463(1, (byte) 115, arg0);
		    int[] is_2_ = is[0];
		    int[] is_3_ = is[1];
		    int[] is_4_ = is[2];
		    int[] is_5_ = is_0_[0];
		    int[] is_6_ = is_0_[1];
		    int[] is_7_ = is_0_[2];
		    int[] is_8_ = is_1_[0];
		    int[] is_9_ = is_1_[1];
		    int[] is_10_ = is_1_[2];
		    int i = anInt6053;
		while_90_:
		    do {
		    while_89_:
			do {
			while_88_:
			    do {
			    while_87_:
				do {
				while_86_:
				    do {
				    while_85_:
					do {
					while_84_:
					    do {
					    while_83_:
						do {
						while_82_:
						    do {
							do {
							    if (i != 1) {
								if (i != 2) {
								    if (i
									!= 3) {
									if (i
									    != 4) {
									    if ((i ^ 0xffffffff) != -6) {
										if (i != 6) {
										    if ((i ^ 0xffffffff) != -8) {
											if ((i ^ 0xffffffff) != -9) {
											    if ((i ^ 0xffffffff) != -10) {
												if (i != 10) {
												    if (i != 11) {
													if ((i ^ 0xffffffff) != -13)
													    break while_91_;
												    } else
													break while_89_;
												    break while_90_;
												}
											    } else
												break while_87_;
											    break while_88_;
											}
										    } else
											break while_85_;
										    break while_86_;
										}
									    } else
										break while_83_;
									    break while_84_;
									}
								    } else
									break;
								    break while_82_;
								}
							    } else {
								for (i = 0;
								     (i
								      < (Class131_Sub2_Sub7
									 .anInt5637));
								     i++) {
								    is_2_[i]
									= ((is_8_
									    [i])
									   + is_5_[i]);
								    is_3_[i]
									= ((is_9_
									    [i])
									   + is_6_[i]);
								    is_4_[i]
									= ((is_7_
									    [i])
									   - -is_10_[i]);
								}
								break while_91_;
							    }
							    for (i = 0;
								 (i
								  < (Class131_Sub2_Sub7
								     .anInt5637));
								 i++) {
								is_2_[i]
								    = (-(is_8_
									 [i])
								       + (is_5_
									  [i]));
								is_3_[i]
								    = (is_6_[i]
								       - (is_9_
									  [i]));
								is_4_[i]
								    = (is_7_[i]
								       - (is_10_
									  [i]));
							    }
							    break while_91_;
							} while (false);
							for (i = 0;
							     (((Class131_Sub2_Sub7
								.anInt5637)
							       ^ 0xffffffff)
							      < (i
								 ^ 0xffffffff));
							     i++) {
							    is_2_[i]
								= ((is_5_[i]
								    * is_8_[i])
								   >> -1916408532);
							    is_3_[i]
								= ((is_6_[i]
								    * is_9_[i])
								   >> -1730206100);
							    is_4_[i]
								= ((is_10_[i]
								    * is_7_[i])
								   >> -455831380);
							}
							break while_91_;
						    } while (false);
						    for (i = 0;
							 (i
							  < (Class131_Sub2_Sub7
							     .anInt5637));
							 i++) {
							int i_11_ = is_9_[i];
							int i_12_ = is_8_[i];
							int i_13_ = is_10_[i];
							is_2_[i]
							    = (i_12_ != 0
							       ? ((is_5_[i]
								   << -343870196)
								  / i_12_)
							       : 4096);
							is_3_[i]
							    = (((i_11_
								 ^ 0xffffffff)
								!= -1)
							       ? ((is_6_[i]
								   << 130827084)
								  / i_11_)
							       : 4096);
							is_4_[i]
							    = (i_13_ != 0
							       ? ((is_7_[i]
								   << 476331884)
								  / i_13_)
							       : 4096);
						    }
						    break while_91_;
						} while (false);
						for (i = 0;
						     i < (Class131_Sub2_Sub7
							  .anInt5637);
						     i++) {
						    is_2_[i]
							= (-(((-is_8_[i]
							       + 4096)
							      * (4096
								 + -is_5_[i]))
							     >> -1775591508)
							   + 4096);
						    is_3_[i]
							= (4096
							   + -(((-is_9_[i]
								 + 4096)
								* (4096
								   + -(is_6_
								       [i])))
							       >> 1378805420));
						    is_4_[i]
							= (4096
							   - (((-is_7_[i]
								+ 4096)
							       * (-is_10_[i]
								  + 4096))
							      >> 426504460));
						}
						break while_91_;
					    } while (false);
					    for (i = 0;
						 ((Class131_Sub2_Sub7.anInt5637
						   ^ 0xffffffff)
						  < (i ^ 0xffffffff));
						 i++) {
						int i_14_ = is_9_[i];
						int i_15_ = is_10_[i];
						int i_16_ = is_8_[i];
						is_2_[i]
						    = (((i_16_ ^ 0xffffffff)
							> -2049)
						       ? (is_5_[i] * i_16_
							  >> -1120667317)
						       : (4096
							  + -(((4096 - i_16_)
							       * (-is_5_[i]
								  + 4096))
							      >> 687718891)));
						is_3_[i]
						    = (((i_14_ ^ 0xffffffff)
							<= -2049)
						       ? (-(((4096 - i_14_)
							     * (4096
								- is_6_[i]))
							    >> 1043129675)
							  + 4096)
						       : (i_14_ * is_6_[i]
							  >> 915617419));
						is_4_[i]
						    = (i_15_ < 2048
						       ? (i_15_ * is_7_[i]
							  >> -1260757333)
						       : (-(((-is_7_[i] + 4096)
							     * (-i_15_ + 4096))
							    >> -1368916789)
							  + 4096));
					    }
					    break while_91_;
					} while (false);
					for (i = 0;
					     i < Class131_Sub2_Sub7.anInt5637;
					     i++) {
					    int i_17_ = is_6_[i];
					    int i_18_ = is_5_[i];
					    int i_19_ = is_7_[i];
					    is_2_[i]
						= (i_18_ == 4096 ? 4096
						   : ((is_8_[i] << 2038773772)
						      / (-i_18_ + 4096)));
					    is_3_[i]
						= (((i_17_ ^ 0xffffffff)
						    == -4097)
						   ? 4096
						   : ((is_9_[i] << 1618820812)
						      / (-i_17_ + 4096)));
					    is_4_[i]
						= (i_19_ != 4096
						   ? ((is_10_[i] << 882343916)
						      / (4096 - i_19_))
						   : 4096);
					}
					break while_91_;
				    } while (false);
				    for (i = 0; ((Class131_Sub2_Sub7.anInt5637
						  ^ 0xffffffff)
						 < (i ^ 0xffffffff)); i++) {
					int i_20_ = is_5_[i];
					int i_21_ = is_6_[i];
					int i_22_ = is_7_[i];
					is_2_[i]
					    = ((i_20_ ^ 0xffffffff) == -1 ? 0
					       : -((-is_8_[i] + 4096
						    << 1006923468)
						   / i_20_) + 4096);
					is_3_[i] = ((i_21_ ^ 0xffffffff) != -1
						    ? -((4096 - is_9_[i]
							 << -1512147316)
							/ i_21_) + 4096
						    : 0);
					is_4_[i] = (i_22_ == 0 ? 0
						    : 4096 - ((4096 - is_10_[i]
							       << -1569503764)
							      / i_22_));
				    }
				    break while_91_;
				} while (false);
				for (i = 0; i < Class131_Sub2_Sub7.anInt5637;
				     i++) {
				    int i_23_ = is_9_[i];
				    int i_24_ = is_7_[i];
				    int i_25_ = is_10_[i];
				    int i_26_ = is_5_[i];
				    int i_27_ = is_8_[i];
				    int i_28_ = is_6_[i];
				    is_2_[i] = i_26_ >= i_27_ ? i_27_ : i_26_;
				    is_3_[i] = (((i_23_ ^ 0xffffffff)
						 < (i_28_ ^ 0xffffffff))
						? i_28_ : i_23_);
				    is_4_[i] = (((i_25_ ^ 0xffffffff)
						 >= (i_24_ ^ 0xffffffff))
						? i_25_ : i_24_);
				}
				break while_91_;
			    } while (false);
			    for (i = 0;
				 ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				  < (i ^ 0xffffffff));
				 i++) {
				int i_29_ = is_10_[i];
				int i_30_ = is_9_[i];
				int i_31_ = is_7_[i];
				int i_32_ = is_8_[i];
				int i_33_ = is_6_[i];
				int i_34_ = is_5_[i];
				is_2_[i] = i_34_ <= i_32_ ? i_32_ : i_34_;
				is_3_[i]
				    = ((i_33_ ^ 0xffffffff) >= (i_30_
								^ 0xffffffff)
				       ? i_30_ : i_33_);
				is_4_[i]
				    = ((i_29_ ^ 0xffffffff) <= (i_31_
								^ 0xffffffff)
				       ? i_29_ : i_31_);
			    }
			    break while_91_;
			} while (false);
			for (i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++) {
			    int i_35_ = is_5_[i];
			    int i_36_ = is_9_[i];
			    int i_37_ = is_8_[i];
			    int i_38_ = is_6_[i];
			    int i_39_ = is_7_[i];
			    int i_40_ = is_10_[i];
			    is_2_[i]
				= ((i_35_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)
				   ? -i_35_ + i_37_ : i_35_ + -i_37_);
			    is_3_[i] = (i_38_ <= i_36_ ? -i_38_ + i_36_
					: -i_36_ + i_38_);
			    is_4_[i]
				= ((i_39_ ^ 0xffffffff) >= (i_40_ ^ 0xffffffff)
				   ? -i_39_ + i_40_ : i_39_ + -i_40_);
			}
			break while_91_;
		    } while (false);
		    for (i = 0;
			 ((i ^ 0xffffffff)
			  > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			 i++) {
			int i_41_ = is_6_[i];
			int i_42_ = is_7_[i];
			int i_43_ = is_10_[i];
			int i_44_ = is_9_[i];
			int i_45_ = is_5_[i];
			int i_46_ = is_8_[i];
			is_2_[i]
			    = i_46_ + i_45_ - (i_45_ * i_46_ >> -325584757);
			is_3_[i]
			    = -(i_41_ * i_44_ >> 1692456651) + i_41_ + i_44_;
			is_4_[i]
			    = -(i_42_ * i_43_ >> 1478317579) + (i_43_ + i_42_);
		    }
		}
	    } while (false);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vn.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub36() {
	super(2, false);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt6045++;
	    if (arg0 != -11543)
		return null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -81);
	while_101_:
	    do {
		if (aClass200_4087.aBoolean2927) {
		    int[] is_47_ = this.method1459(0, (byte) -40, arg1);
		    int[] is_48_ = this.method1459(1, (byte) -40, arg1);
		    int i = anInt6053;
		while_100_:
		    do {
		    while_99_:
			do {
			while_98_:
			    do {
			    while_97_:
				do {
				while_96_:
				    do {
				    while_95_:
					do {
					while_94_:
					    do {
					    while_93_:
						do {
						while_92_:
						    do {
							do {
							    if ((i
								 ^ 0xffffffff)
								!= -2) {
								if ((i
								     ^ 0xffffffff)
								    != -3) {
								    if (i
									!= 3) {
									if (i
									    != 4) {
									    if ((i ^ 0xffffffff) != -6) {
										if ((i ^ 0xffffffff) != -7) {
										    if (i != 7) {
											if ((i ^ 0xffffffff) != -9) {
											    if (i != 9) {
												if (i != 10) {
												    if (i != 11) {
													if ((i ^ 0xffffffff) != -13)
													    break while_101_;
												    } else
													break while_99_;
												    break while_100_;
												}
											    } else
												break while_97_;
											    break while_98_;
											}
										    } else
											break while_95_;
										    break while_96_;
										}
									    } else
										break while_93_;
									    break while_94_;
									}
								    } else
									break;
								    break while_92_;
								}
							    } else {
								for (i = 0;
								     (((Class131_Sub2_Sub7
									.anInt5637)
								       ^ 0xffffffff)
								      < (i
									 ^ 0xffffffff));
								     i++)
								    is[i]
									= ((is_48_
									    [i])
									   + is_47_[i]);
								break while_101_;
							    }
							    for (i = 0;
								 (i
								  < (Class131_Sub2_Sub7
								     .anInt5637));
								 i++)
								is[i]
								    = ((is_47_
									[i])
								       - (is_48_
									  [i]));
							    break while_101_;
							} while (false);
							for (i = 0;
							     ((i ^ 0xffffffff)
							      > ((Class131_Sub2_Sub7
								  .anInt5637)
								 ^ 0xffffffff));
							     i++)
							    is[i]
								= ((is_47_[i]
								    * (is_48_
								       [i]))
								   >> -1851848116);
							break while_101_;
						    } while (false);
						    for (i = 0;
							 (i
							  < (Class131_Sub2_Sub7
							     .anInt5637));
							 i++) {
							int i_49_ = is_48_[i];
							is[i]
							    = (i_49_ == 0
							       ? 4096
							       : ((is_47_[i]
								   << 1940009036)
								  / i_49_));
						    }
						    break while_101_;
						} while (false);
						for (i = 0;
						     ((Class131_Sub2_Sub7
						       .anInt5637)
						      > i);
						     i++)
						    is[i]
							= (-(((-is_47_[i]
							       + 4096)
							      * (4096
								 + -is_48_[i]))
							     >> -999262100)
							   + 4096);
						break while_101_;
					    } while (false);
					    for (i = 0;
						 ((Class131_Sub2_Sub7.anInt5637
						   ^ 0xffffffff)
						  < (i ^ 0xffffffff));
						 i++) {
						int i_50_ = is_48_[i];
						is[i]
						    = (((i_50_ ^ 0xffffffff)
							<= -2049)
						       ? (4096
							  + -(((4096 + -i_50_)
							       * (-is_47_[i]
								  + 4096))
							      >> -1242172693))
						       : (is_47_[i] * i_50_
							  >> -927977205));
					    }
					    break while_101_;
					} while (false);
					for (i = 0;
					     i < Class131_Sub2_Sub7.anInt5637;
					     i++) {
					    int i_51_ = is_47_[i];
					    is[i]
						= (i_51_ == 4096 ? 4096
						   : ((is_48_[i] << 293679052)
						      / (4096 + -i_51_)));
					}
					break while_101_;
				    } while (false);
				    for (i = 0;
					 i < Class131_Sub2_Sub7.anInt5637;
					 i++) {
					int i_52_ = is_47_[i];
					is[i] = ((i_52_ ^ 0xffffffff) == -1 ? 0
						 : 4096 - ((-is_48_[i] + 4096
							    << -2031388468)
							   / i_52_));
				    }
				    break while_101_;
				} while (false);
				for (i = 0; ((Class131_Sub2_Sub7.anInt5637
					      ^ 0xffffffff)
					     < (i ^ 0xffffffff)); i++) {
				    int i_53_ = is_47_[i];
				    int i_54_ = is_48_[i];
				    is[i] = i_54_ > i_53_ ? i_53_ : i_54_;
				}
				break while_101_;
			    } while (false);
			    for (i = 0;
				 ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				  < (i ^ 0xffffffff));
				 i++) {
				int i_55_ = is_47_[i];
				int i_56_ = is_48_[i];
				is[i] = i_56_ < i_55_ ? i_55_ : i_56_;
			    }
			    break while_101_;
			} while (false);
			for (i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++) {
			    int i_57_ = is_48_[i];
			    int i_58_ = is_47_[i];
			    is[i] = (i_57_ >= i_58_ ? i_57_ - i_58_
				     : i_58_ + -i_57_);
			}
			break while_101_;
		    } while (false);
		    for (i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
			int i_59_ = is_48_[i];
			int i_60_ = is_47_[i];
			is[i]
			    = i_60_ - -i_59_ - (i_59_ * i_60_ >> -1121028757);
		    }
		}
	    } while (false);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vn.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aLong6048 = 0L;
	anInt6049 = 0;
	anInt6052 = 0;
    }
}
