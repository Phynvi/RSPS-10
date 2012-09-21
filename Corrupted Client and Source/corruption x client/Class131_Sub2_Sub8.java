/* Class131_Sub2_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub8 extends Class131_Sub2
{
    public static int anInt5651;
    public int[] anIntArray5652;
    public static int anInt5653;
    public static Class131_Sub41_Sub10[] aClass131_Sub41_Sub10Array5654
	= new Class131_Sub41_Sub10[14];
    public static int anInt5655;
    public int anInt5656 = 3216;
    public int anInt5657;
    public static int anInt5658;
    public int anInt5659;
    public static Interface4 anInterface4_5660;
    public static int anInt5661;
    
    public static int[] method1506(Class19[] arg0, int arg1, boolean arg2,
				   int arg3, int arg4, byte[] arg5, int arg6,
				   int arg7, int arg8, int arg9, int arg10,
				   Class130 arg11) {
	try {
	    anInt5661++;
	    int i = 8 * (0x7 & arg1);
	    int i_0_ = (arg7 & 0x7) * 8;
	    int i_1_;
	    if (arg2)
		i_1_ = 1;
	    else
		i_1_ = 4;
	    if (!arg2) {
		Class19 class19 = arg0[arg8];
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -9; i_2_++) {
		    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -9; i_3_++) {
			int i_4_ = (Class46_Sub1.method575(arg6, 0x7 & i_3_,
							   true, i_2_ & 0x7)
				    + arg10);
			int i_5_
			    = arg4 + Applet_Sub1.method39(1, i_3_ & 0x7,
							  i_2_ & 0x7, arg6);
			if (i_4_ > 0
			    && ((i_4_ ^ 0xffffffff)
				> (Class131_Sub41_Sub11_Sub1.anInt6546 + -1
				   ^ 0xffffffff))
			    && i_5_ > 0
			    && ((i_5_ ^ 0xffffffff)
				> (-1 + Class131_Sub2_Sub26.anInt5931
				   ^ 0xffffffff)))
			    class19.method247(true, i_4_, i_5_);
		    }
		}
	    }
	    Stream stream = new Stream(arg5);
	    int i_6_ = (~0x7 & arg1) << 1510759395;
	    int i_7_ = (arg7 & ~0x7) << 867703811;
	    if (arg9 != -27837)
		method1508(true);
	    int i_8_ = 0;
	    int i_9_ = 0;
	    if ((arg6 ^ 0xffffffff) == -2)
		i_9_ = 1;
	    else if (arg6 != 2) {
		if ((arg6 ^ 0xffffffff) == -4)
		    i_8_ = 1;
	    } else {
		i_8_ = 1;
		i_9_ = 1;
	    }
	    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_10_++) {
		for (int i_11_ = 0; i_11_ < 64; i_11_++) {
		    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++) {
			if (arg3 == i_10_ && i_11_ >= i
			    && (i + 8 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)
			    && i_12_ >= i_0_
			    && (8 + i_0_ ^ 0xffffffff) <= (i_12_
							   ^ 0xffffffff)) {
			    if ((i_11_ ^ 0xffffffff) == (i + 8 ^ 0xffffffff)
				|| (i_12_ ^ 0xffffffff) == (i_0_ - -8
							    ^ 0xffffffff)) {
				int i_13_;
				int i_14_;
				if (arg6 != 0) {
				    if (arg6 == 1) {
					i_14_ = i + (-i_11_ + arg4) + 8;
					i_13_ = arg10 - (i_0_ + -i_12_);
				    } else if (arg6 == 2) {
					i_13_ = i + -i_11_ + (arg10 - -8);
					i_14_ = -i_12_ - (-i_0_ - 8) + arg4;
				    } else {
					i_13_ = 8 + arg10 - (-i_0_ + i_12_);
					i_14_ = i_11_ + (-i + arg4);
				    }
				} else {
				    i_13_ = arg10 - -i_11_ - i;
				    i_14_ = i_12_ - i_0_ + arg4;
				}
				Class131_Sub41_Sub18.method2053(arg2,
								i_7_ + i_12_,
								false, i_13_,
								0, true,
                        stream,
								arg8, 0, 0,
								i_14_,
								i_11_ + i_6_);
			    } else {
				int i_15_
				    = (Class46_Sub1.method575(arg6,
							      0x7 & i_12_,
							      true,
							      0x7 & i_11_)
				       + arg10);
				int i_16_
				    = arg4 + Applet_Sub1.method39(arg9 + 27838,
								  0x7 & i_12_,
								  i_11_ & 0x7,
								  arg6);
				Class131_Sub41_Sub18.method2053(arg2,
								i_12_ + i_7_,
								false, i_15_,
								arg6, false,
                        stream,
								arg8, i_9_,
								i_8_, i_16_,
								i_11_ + i_6_);
				if (i_11_ == 63 || i_12_ == 63) {
				    int i_17_ = ((i_11_ ^ 0xffffffff) == -64
						 ? 64 : i_11_);
				    int i_18_ = i_12_ != 63 ? i_12_ : 64;
				    int i_19_;
				    int i_20_;
				    if ((arg6 ^ 0xffffffff) == -1) {
					i_19_ = arg4 - (i_0_ + -i_18_);
					i_20_ = -i - (-i_17_ - arg10);
				    } else if (arg6 != 1) {
					if (arg6 != 2) {
					    i_19_ = -i - (-i_17_ - arg4);
					    i_20_
						= i_0_ - i_18_ + (arg10 - -8);
					} else {
					    i_20_ = i - (i_17_ - arg10) + 8;
					    i_19_ = arg4 - -8 - i_18_ + i_0_;
					}
				    } else {
					i_19_ = arg4 - (-8 - -i_17_ + -i);
					i_20_ = -i_0_ - (-i_18_ - arg10);
				    }
				    if (i_20_ >= 0
					&& (((Class131_Sub41_Sub11_Sub1
					      .anInt6546)
					     ^ 0xffffffff)
					    < (i_20_ ^ 0xffffffff))
					&& (i_19_ ^ 0xffffffff) <= -1
					&& ((i_19_ ^ 0xffffffff)
					    > (Class131_Sub2_Sub26.anInt5931
					       ^ 0xffffffff)))
					Cryption.anIntArrayArrayArray1828
					    [arg8][i_20_][i_19_]
					    = (Cryption
					       .anIntArrayArrayArray1828[arg8]
					       [i_8_ + i_15_][i_16_ + i_9_]);
				}
			    }
			} else
			    Class131_Sub41_Sub18.method2053(arg2, 0, false, -1,
							    0, false,
                        stream, 0,
							    0, 0, -1, 0);
		    }
		}
	    }
	    boolean bool = false;
	    boolean bool_21_ = false;
	    while (stream.offset
		   < stream.data.length) {
		int i_22_ = stream.readUnsignedByte(-57);
		if (i_22_ == 128) {
		    Class131_Sub2_Sub16.anIntArray5789[0]
			= stream.readUnsignedShort(8104);
		    Class131_Sub2_Sub16.anIntArray5789[1]
			= stream.readSignedShort(1625554944);
		    Class131_Sub2_Sub16.anIntArray5789[2]
			= stream.readSignedShort(1625554944);
		    Class131_Sub2_Sub16.anIntArray5789[3]
			= stream.readSignedShort(1625554944);
		    bool = true;
		    Class131_Sub2_Sub16.anIntArray5789[4]
			= stream.readUnsignedShort(8104);
		} else if (i_22_ == 129) {
		    if (Class29.aByteArrayArrayArray362 == null)
			Class29.aByteArrayArrayArray362 = new byte[4][][];
		    for (int i_23_ = 0; i_23_ < 4; i_23_++) {
			byte i_24_ = stream.readSignedByte((byte) 127);
			if ((i_24_ ^ 0xffffffff) != -1
			    || Class29.aByteArrayArrayArray362[arg8] == null) {
			    if ((i_24_ ^ 0xffffffff) == -2) {
				if (Class29.aByteArrayArrayArray362[arg8]
				    == null)
				    Class29.aByteArrayArrayArray362[arg8]
					= (new byte
					   [1 + (Class131_Sub41_Sub11_Sub1
						 .anInt6546)]
					   [(Class131_Sub2_Sub26.anInt5931
					     - -1)]);
				for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -65;
				     i_25_ += 4) {
				    for (int i_26_ = 0;
					 (i_26_ ^ 0xffffffff) > -65;
					 i_26_ += 4) {
					byte i_27_
					    = stream
						  .readSignedByte((byte) 127);
					if (i_23_ <= arg3) {
					    for (int i_28_ = i_25_;
						 ((i_28_ ^ 0xffffffff)
						  > (4 + i_25_ ^ 0xffffffff));
						 i_28_++) {
						for (int i_29_ = i_26_;
						     i_29_ < i_26_ + 4;
						     i_29_++) {
						    if (i <= i_28_
							&& ((8 + i
							     ^ 0xffffffff)
							    < (i_28_
							       ^ 0xffffffff))
							&& i_0_ <= i_29_
							&& i_0_ + 8 > i_0_) {
							int i_30_
							    = ((Class46_Sub1
								    .method575
								(arg6,
								 i_29_ & 0x7,
								 true,
								 0x7 & i_28_))
							       + arg10);
							int i_31_
							    = (Applet_Sub1
								   .method39
							       (1, i_29_ & 0x7,
								i_28_ & 0x7,
								arg6)) + arg4;
							if (i_30_ >= 0
							    && ((i_30_
								 ^ 0xffffffff)
								> ((Class131_Sub41_Sub11_Sub1
								    .anInt6546)
								   ^ 0xffffffff))
							    && ((i_31_
								 ^ 0xffffffff)
								<= -1)
							    && ((Class131_Sub2_Sub26
								 .anInt5931)
								> i_31_))
							    Class29
								.aByteArrayArrayArray362
								[arg8][i_30_]
								[i_31_]
								= i_27_;
						    }
						}
					    }
					}
				    }
				}
			    }
			} else if ((arg3 ^ 0xffffffff)
				   <= (i_23_ ^ 0xffffffff)) {
			    int i_32_ = arg10;
			    int i_33_ = arg10 - -7;
			    int i_34_ = arg4;
			    if ((i_34_ ^ 0xffffffff) <= -1) {
				if (i_34_ >= Class131_Sub2_Sub26.anInt5931)
				    i_34_ = Class131_Sub2_Sub26.anInt5931;
			    } else
				i_34_ = 0;
			    int i_35_ = 7 + arg4;
			    if (i_33_ < 0)
				i_33_ = 0;
			    else if (Class131_Sub41_Sub11_Sub1.anInt6546
				     <= i_33_)
				i_33_ = Class131_Sub41_Sub11_Sub1.anInt6546;
			    if ((i_32_ ^ 0xffffffff) > -1)
				i_32_ = 0;
			    else if (Class131_Sub41_Sub11_Sub1.anInt6546
				     <= i_32_)
				i_32_ = Class131_Sub41_Sub11_Sub1.anInt6546;
			    if ((i_35_ ^ 0xffffffff) > -1)
				i_35_ = 0;
			    else if ((i_35_ ^ 0xffffffff)
				     <= (Class131_Sub2_Sub26.anInt5931
					 ^ 0xffffffff))
				i_35_ = Class131_Sub2_Sub26.anInt5931;
			    for (/**/; i_33_ > i_32_; i_32_++) {
				for (/**/; i_35_ > i_34_; i_34_++)
				    Class29.aByteArrayArrayArray362[arg8]
					[i_32_][i_34_]
					= (byte) 0;
			    }
			}
		    }
		} else {
		    stream.offset--;
		    break;
		}
	    }
	    if (!arg2) {
		Class150 class150 = null;
		while (stream.data.length
		       > stream.offset) {
		    int i_36_ = stream.readUnsignedByte(-91);
		    if (i_36_ != 0) {
			if (i_36_ == 1) {
			    int i_37_ = stream.readUnsignedByte(-36);
			    if (i_37_ > 0) {
				for (int i_38_ = 0;
				     ((i_37_ ^ 0xffffffff)
				      < (i_38_ ^ 0xffffffff));
				     i_38_++) {
				    Class131_Sub8_Sub1 class131_sub8_sub1
					= (new Class131_Sub8_Sub1
					   (stream));
				    if ((class131_sub8_sub1.anInt6110
					 ^ 0xffffffff)
					== -32) {
					Class93 class93
					    = (Class78.method781
					       (stream
						    .readUnsignedShort(arg9 + 35941),
						2));
					class131_sub8_sub1.method1680
					    (class93.anInt1214,
					     class93.anInt1217, -125,
					     class93.anInt1228,
					     class93.anInt1229);
				    }
				    int i_39_ = (class131_sub8_sub1.anInt4195
						 >> -1428556153);
				    int i_40_ = (class131_sub8_sub1.anInt4191
						 >> 2002685255);
				    if (class131_sub8_sub1.anInt6095 == arg3
					&& i <= i_39_ && 8 + i > i_39_
					&& ((i_0_ ^ 0xffffffff)
					    >= (i_40_ ^ 0xffffffff))
					&& ((8 + i_0_ ^ 0xffffffff)
					    < (i_40_ ^ 0xffffffff))) {
					int i_41_
					    = ((Class49.method579
						(0x3ff & (class131_sub8_sub1
							  .anInt4195),
						 0x3ff & (class131_sub8_sub1
							  .anInt4191),
						 arg6, (byte) 74))
					       + (arg10 << -880475065));
					int i_42_ = ((arg4 << -1081301497)
						     + (Class100.method878
							(arg9 ^ ~0x6cbc,
							 (class131_sub8_sub1
							  .anInt4195) & 0x3ff,
							 (class131_sub8_sub1
							  .anInt4191) & 0x3ff,
							 arg6)));
					class131_sub8_sub1.anInt4191 = i_42_;
					class131_sub8_sub1.anInt4195 = i_41_;
					i_39_ = (class131_sub8_sub1.anInt4195
						 >> -848113113);
					i_40_ = (class131_sub8_sub1.anInt4191
						 >> -905297241);
					if ((i_39_ ^ 0xffffffff) <= -1
					    && i_40_ >= 0
					    && (i_39_
						< (Class131_Sub41_Sub11_Sub1
						   .anInt6546))
					    && (Class131_Sub2_Sub26.anInt5931
						> i_40_)) {
					    class131_sub8_sub1.anInt4185
						= (-(class131_sub8_sub1
						     .anInt4185)
						   + (Cryption
						      .anIntArrayArrayArray1828
						      [arg3][i_39_][i_40_]));
					    if (arg11.method1165() > 0)
						Class64.method673
						    (class131_sub8_sub1);
					}
				    }
				}
			    }
			} else if (i_36_ == 2) {
			    if (class150 == null)
				class150 = new Class150();
			    class150.method2187(8, stream);
			} else
			    throw new IllegalStateException();
		    } else
			class150 = new Class150(stream);
		}
		if (class150 != null)
		    Class87.method821(arg10 >> -812223677, arg4 >> 1616587491,
				      true, class150);
	    }
	    if (!bool_21_ && Class29.aByteArrayArrayArray362 != null
		&& Class29.aByteArrayArrayArray362[arg8] != null) {
		int i_43_ = 7 + arg10;
		int i_44_ = arg4 + 7;
		for (int i_45_ = arg10; i_43_ > i_45_; i_45_++) {
		    for (int i_46_ = arg4;
			 (i_44_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
			Class29.aByteArrayArrayArray362[arg8][i_45_][i_46_]
			    = (byte) 0;
		}
	    }
	    if (!bool)
		return null;
	    return Class131_Sub2_Sub16.anIntArray5789;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("eg.F(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		anInterface4_5660 = null;
	    anInt5658++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 108);
	    if (aClass200_4087.aBoolean2927) {
		int i = anInt5657 * Class93.anInt1221 >> 2137985740;
		int[] is_47_ = this.method1459(0, (byte) -40,
					       arg1 + -1 & Class79.anInt1060);
		int[] is_48_ = this.method1459(0, (byte) -40, arg1);
		int[] is_49_ = this.method1459(0, (byte) -40,
					       Class79.anInt1060 & 1 + arg1);
		for (int i_50_ = 0; Class131_Sub2_Sub7.anInt5637 > i_50_;
		     i_50_++) {
		    int i_51_
			= (is_49_[i_50_] + -is_47_[i_50_]) * i >> -1065515188;
		    int i_52_
			= ((-is_48_[Class23_Sub4_Sub4.anInt5404 & i_50_ - -1]
			    + is_48_[Class23_Sub4_Sub4.anInt5404 & i_50_ + -1])
			   * i) >> -2093085172;
		    int i_53_ = i_52_ >> 731331300;
		    int i_54_ = i_51_ >> -736875260;
		    if ((i_53_ ^ 0xffffffff) > -1)
			i_53_ = -i_53_;
		    if (i_53_ > 255)
			i_53_ = 255;
		    if (i_54_ < 0)
			i_54_ = -i_54_;
		    if (i_54_ > 255)
			i_54_ = 255;
		    int i_55_
			= ((Class23_Sub5.aByteArray3756
			    [i_53_ + (i_54_ * (1 + i_54_) >> 1512699297)])
			   & 0xff);
		    int i_56_ = i_55_ * i_51_ >> 449519976;
		    int i_57_ = i_55_ * 4096 >> -2092266936;
		    int i_58_ = i_55_ * i_52_ >> 2037098312;
		    i_57_ = i_57_ * anIntArray5652[2] >> 598101964;
		    i_58_ = i_58_ * anIntArray5652[0] >> 1157402700;
		    i_56_ = i_56_ * anIntArray5652[1] >> 1673635340;
		    is[i_50_] = i_58_ - -i_56_ - -i_57_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eg.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1507(int arg0) {
	if (arg0 != 18105)
	    anInt5659 = -41;
	anInt5655++;
	double d = Math.cos((double) ((float) anInt5656 / 4096.0F));
	anIntArray5652[0]
	    = (int) (4096.0
		     * (Math.sin((double) ((float) anInt5659 / 4096.0F)) * d));
	anIntArray5652[1]
	    = (int) (Math.cos((double) ((float) anInt5659 / 4096.0F)) * d
		     * 4096.0);
	anIntArray5652[2]
	    = (int) (4096.0
		     * Math.sin((double) ((float) anInt5656 / 4096.0F)));
	int i = anIntArray5652[0] * anIntArray5652[0] >> 1647062924;
	int i_59_ = anIntArray5652[1] * anIntArray5652[1] >> 1600417548;
	int i_60_ = anIntArray5652[2] * anIntArray5652[2] >> 504148812;
	int i_61_ = (int) (4096.0 * Math.sqrt((double) (i_60_ + i - -i_59_
							>> 478331692)));
	if ((i_61_ ^ 0xffffffff) != -1) {
	    anIntArray5652[1] = (anIntArray5652[1] << -607927188) / i_61_;
	    anIntArray5652[0] = (anIntArray5652[0] << -1860825460) / i_61_;
	    anIntArray5652[2] = (anIntArray5652[2] << -440659284) / i_61_;
	}
    }
    
    public Class131_Sub2_Sub8() {
	super(1, true);
	anIntArray5652 = new int[3];
	anInt5657 = 4096;
	anInt5659 = 3216;
    }
    
    public void method1471(int arg0) {
	try {
	    method1507(18105);
	    if (arg0 == 0)
		anInt5651++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"eg.J(" + arg0 + ')');
	}
    }
    
    public static void method1508(boolean arg0) {
	try {
	    if (arg0 == true) {
		aClass131_Sub41_Sub10Array5654 = null;
		anInterface4_5660 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"eg.B(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	if (arg1 == -49) {
	    anInt5653++;
	    int i = arg0;
	while_30_:
	    do {
		do {
		    if (i != 0) {
			if (i != 1) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_30_;
			}
		    } else {
			anInt5657 = arg2.readUnsignedShort(8104);
			return;
		    }
		    anInt5659 = arg2.readUnsignedShort(8104);
		    return;
		} while (false);
		anInt5656 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	    } while (false);
	}
    }
}
