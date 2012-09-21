/* Class131_Sub2_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub35 extends Class131_Sub2
{
    public static Class28 aClass28_6038 = new Class28();
    public static int anInt6039;
    public static int anInt6040;
    public static int anInt6041 = 20;
    public static long[] aLongArray6042 = new long[100];
    public static int[] anIntArray6043
	= { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };
    public static Class130 aClass130_6044;
    
    public Class131_Sub2_Sub35() {
	super(0, true);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt6040++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -118);
	    if (arg0 != -11543)
		return null;
	    if (aClass200_4087.aBoolean2927)
		Class61.method651(is, 0, Class131_Sub2_Sub7.anInt5637,
				  Class1_Sub7_Sub1.anIntArray5206[arg1]);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vi.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1633(byte arg0) {
	try {
	    if (arg0 != 54)
		anInt6041 = 10;
	    anIntArray6043 = null;
	    aClass130_6044 = null;
	    aClass28_6038 = null;
	    aLongArray6042 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vi.B(" + arg0 + ')');
	}
    }
    
    public static int[] method1634
	(int arg0, Class130 arg1, boolean arg2, byte arg3, int arg4, int arg5,
	 Class19[] arg6, byte[] arg7, int arg8, int arg9) {
	try {
	    anInt6039++;
	    if (!arg2) {
		for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
		    Class19 class19 = arg6[i];
		    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -65; i_0_++) {
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -65; i_1_++) {
			    int i_2_ = arg0 - -i_0_;
			    int i_3_ = arg9 + i_1_;
			    if ((i_2_ ^ 0xffffffff) <= -1
				&& i_2_ < Class131_Sub41_Sub11_Sub1.anInt6546
				&& i_3_ >= 0
				&& ((i_3_ ^ 0xffffffff)
				    > (Class131_Sub2_Sub26.anInt5931
				       ^ 0xffffffff)))
				class19.method247(true, i_2_, i_3_);
			}
		    }
		}
	    }
	    Stream stream = new Stream(arg7);
	    int i = arg4 - -arg0;
	    int i_4_ = arg8 - -arg9;
	    for (int i_5_ = 0; arg5 > i_5_; i_5_++) {
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -65; i_6_++) {
		    for (int i_7_ = 0; i_7_ < 64; i_7_++)
			Class131_Sub41_Sub18.method2053(arg2, i_4_ - -i_7_,
							false, i_6_ + arg0, 0,
							false, stream,
							i_5_, 0, 0,
							arg9 + i_7_, i_6_ + i);
		}
	    }
	    if (arg3 != 82)
		return null;
	    boolean bool = false;
	    boolean bool_8_ = false;
	    while ((stream.offset ^ 0xffffffff)
		   > (stream.data.length ^ 0xffffffff)) {
		int i_9_ = stream.readUnsignedByte(arg3 ^ 0x32);
		if ((i_9_ ^ 0xffffffff) != -129) {
		    if (i_9_ != 129) {
			stream.offset--;
			break;
		    }
		    if (Class29.aByteArrayArrayArray362 == null)
			Class29.aByteArrayArrayArray362 = new byte[4][][];
		    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++) {
			byte i_11_ = stream.readSignedByte((byte) 127);
			if ((i_11_ ^ 0xffffffff) == -1
			    && (Class29.aByteArrayArrayArray362[i_10_]
				!= null)) {
			    int i_12_ = arg0;
			    int i_13_ = arg0 - -64;
			    int i_14_ = arg9;
			    if (i_14_ < 0)
				i_14_ = 0;
			    else if (i_14_ >= Class131_Sub2_Sub26.anInt5931)
				i_14_ = Class131_Sub2_Sub26.anInt5931;
			    if ((i_13_ ^ 0xffffffff) <= -1) {
				if (i_13_
				    >= Class131_Sub41_Sub11_Sub1.anInt6546)
				    i_13_
					= Class131_Sub41_Sub11_Sub1.anInt6546;
			    } else
				i_13_ = 0;
			    int i_15_ = 64 + arg9;
			    if (i_12_ >= 0) {
				if (Class131_Sub41_Sub11_Sub1.anInt6546
				    <= i_12_)
				    i_12_
					= Class131_Sub41_Sub11_Sub1.anInt6546;
			    } else
				i_12_ = 0;
			    if (i_15_ >= 0) {
				if (Class131_Sub2_Sub26.anInt5931 <= i_15_)
				    i_15_ = Class131_Sub2_Sub26.anInt5931;
			    } else
				i_15_ = 0;
			    for (/**/; i_13_ > i_12_; i_12_++) {
				for (/**/; ((i_14_ ^ 0xffffffff)
					    > (i_15_ ^ 0xffffffff)); i_14_++)
				    Class29.aByteArrayArrayArray362[i_10_]
					[i_12_][i_14_]
					= (byte) 0;
			    }
			} else if ((i_11_ ^ 0xffffffff) != -2) {
			    if ((i_11_ ^ 0xffffffff) == -3) {
				if (Class29.aByteArrayArrayArray362[i_10_]
				    == null)
				    Class29.aByteArrayArrayArray362[i_10_]
					= (new byte
					   [(Class131_Sub41_Sub11_Sub1
					     .anInt6546) - -1]
					   [(Class131_Sub2_Sub26.anInt5931
					     - -1)]);
				if ((i_10_ ^ 0xffffffff) < -1) {
				    int i_16_ = arg0;
				    int i_17_ = arg0 - -64;
				    int i_18_ = arg9;
				    if (i_16_ < 0)
					i_16_ = 0;
				    else if ((i_16_ ^ 0xffffffff)
					     <= ((Class131_Sub41_Sub11_Sub1
						  .anInt6546)
						 ^ 0xffffffff))
					i_16_ = (Class131_Sub41_Sub11_Sub1
						 .anInt6546);
				    if ((i_17_ ^ 0xffffffff) > -1)
					i_17_ = 0;
				    else if ((Class131_Sub41_Sub11_Sub1
					      .anInt6546)
					     <= i_17_)
					i_17_ = (Class131_Sub41_Sub11_Sub1
						 .anInt6546);
				    if ((i_18_ ^ 0xffffffff) <= -1) {
					if ((i_18_ ^ 0xffffffff)
					    <= (Class131_Sub2_Sub26.anInt5931
						^ 0xffffffff))
					    i_18_ = (Class131_Sub2_Sub26
						     .anInt5931);
				    } else
					i_18_ = 0;
				    int i_19_ = 64 + arg9;
				    if ((i_19_ ^ 0xffffffff) <= -1) {
					if (Class131_Sub2_Sub26.anInt5931
					    <= i_19_)
					    i_19_ = (Class131_Sub2_Sub26
						     .anInt5931);
				    } else
					i_19_ = 0;
				    for (/**/;
					 ((i_17_ ^ 0xffffffff)
					  < (i_16_ ^ 0xffffffff));
					 i_16_++) {
					for (/**/; i_19_ > i_18_; i_18_++)
					    Class29.aByteArrayArrayArray362
						[i_10_][i_16_][i_18_]
						= (Class29
						   .aByteArrayArrayArray362
						   [i_10_ + -1][i_16_][i_18_]);
				    }
				}
			    }
			} else {
			    if (Class29.aByteArrayArrayArray362[i_10_] == null)
				Class29.aByteArrayArrayArray362[i_10_]
				    = (new byte
				       [1 + (Class131_Sub41_Sub11_Sub1
					     .anInt6546)]
				       [Class131_Sub2_Sub26.anInt5931 - -1]);
			    for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -65;
				 i_20_ += 4) {
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -65;
				     i_21_ += 4) {
				    byte i_22_ = stream
						     .readSignedByte((byte) 127);
				    for (int i_23_ = i_20_ + arg0;
					 i_23_ < arg0 + (i_20_ + 4); i_23_++) {
					for (int i_24_ = arg9 + i_21_;
					     ((i_24_ ^ 0xffffffff)
					      > (i_21_ - -arg9 + 4
						 ^ 0xffffffff));
					     i_24_++) {
					    if (i_23_ >= 0
						&& (Class131_Sub41_Sub11_Sub1
						    .anInt6546) > i_23_
						&& i_24_ >= 0
						&& (Class131_Sub2_Sub26
						    .anInt5931) > i_24_)
						Class29
						    .aByteArrayArrayArray362
						    [i_10_][i_23_][i_24_]
						    = i_22_;
					}
				    }
				}
			    }
			}
		    }
		    bool_8_ = true;
		} else {
		    Class131_Sub2_Sub16.anIntArray5789[0]
			= stream.readUnsignedShort(arg3 + 8022);
		    Class131_Sub2_Sub16.anIntArray5789[1]
			= (stream.readSignedShort
			   (Class23_Sub4_Sub5.method390(arg3, 1625555026)));
		    Class131_Sub2_Sub16.anIntArray5789[2]
			= stream.readSignedShort(1625554944);
		    Class131_Sub2_Sub16.anIntArray5789[3]
			= stream.readSignedShort(1625554944);
		    Class131_Sub2_Sub16.anIntArray5789[4]
			= stream.readUnsignedShort(8104);
		    bool = true;
		}
	    }
	    if (!arg2) {
		Class150 class150 = null;
		while (stream.data.length
		       > stream.offset) {
		    int i_25_ = stream.readUnsignedByte(58);
		    if ((i_25_ ^ 0xffffffff) == -1)
			class150 = new Class150(stream);
		    else if ((i_25_ ^ 0xffffffff) == -2) {
			int i_26_ = stream.readUnsignedByte(84);
			if ((i_26_ ^ 0xffffffff) < -1) {
			    for (int i_27_ = 0;
				 (i_27_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff);
				 i_27_++) {
				Class131_Sub8_Sub1 class131_sub8_sub1
				    = new Class131_Sub8_Sub1(stream);
				if ((class131_sub8_sub1.anInt6110 ^ 0xffffffff)
				    == -32) {
				    Class93 class93
					= (Class78.method781
					   (stream
						.readUnsignedShort(arg3 + 8022),
					    2));
				    class131_sub8_sub1.method1680
					(class93.anInt1214, class93.anInt1217,
					 -108, class93.anInt1228,
					 class93.anInt1229);
				}
				class131_sub8_sub1.anInt4191
				    += arg9 << 1508459463;
				class131_sub8_sub1.anInt4195
				    += arg0 << 88680423;
				int i_28_ = (class131_sub8_sub1.anInt4195
					     >> -1552002009);
				int i_29_ = (class131_sub8_sub1.anInt4191
					     >> -1311923321);
				if ((i_28_ ^ 0xffffffff) <= -1
				    && (i_29_ ^ 0xffffffff) <= -1
				    && (Class131_Sub41_Sub11_Sub1.anInt6546
					^ 0xffffffff) < (i_28_ ^ 0xffffffff)
				    && Class131_Sub2_Sub26.anInt5931 > i_29_) {
				    class131_sub8_sub1.anInt4185
					= ((Cryption.anIntArrayArrayArray1828
					    [class131_sub8_sub1.anInt6095]
					    [i_28_][i_29_])
					   - class131_sub8_sub1.anInt4185);
				    if (arg1.method1165() > 0)
					Class64.method673(class131_sub8_sub1);
				}
			    }
			}
		    } else if ((i_25_ ^ 0xffffffff) == -3) {
			if (class150 == null)
			    class150 = new Class150();
			class150.method2187(8, stream);
		    } else
			throw new IllegalStateException();
		}
		if (class150 != null) {
		    for (int i_30_ = 0; i_30_ < 8; i_30_++) {
			for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -9;
			     i_31_++) {
			    int i_32_ = i_30_ + (arg0 >> 1982467619);
			    int i_33_ = i_31_ + (arg9 >> 768071107);
			    if (i_32_ >= 0
				&& ((i_32_ ^ 0xffffffff)
				    > ((Class131_Sub41_Sub11_Sub1.anInt6546
					>> -2140848829)
				       ^ 0xffffffff))
				&& i_33_ >= 0
				&& (Class131_Sub2_Sub26.anInt5931 >> 1120578275
				    ^ 0xffffffff) < (i_33_ ^ 0xffffffff))
				Class87.method821(i_32_, i_33_, true,
						  class150);
			}
		    }
		}
	    }
	    if (!bool_8_ && Class29.aByteArrayArrayArray362 != null) {
		for (int i_34_ = 0; i_34_ < 4; i_34_++) {
		    if (Class29.aByteArrayArrayArray362[i_34_] != null) {
			for (int i_35_ = 0; i_35_ < 16; i_35_++) {
			    for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -17;
				 i_36_++) {
				int i_37_ = (arg0 >> -1152786814) + i_35_;
				int i_38_ = (arg9 >> -1320136894) - -i_36_;
				if ((i_37_ ^ 0xffffffff) <= -1
				    && (i_37_ ^ 0xffffffff) > -27 && i_38_ >= 0
				    && (i_38_ ^ 0xffffffff) > -27)
				    Class29.aByteArrayArrayArray362[i_34_]
					[i_37_][i_38_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	    if (!bool)
		return null;
	    return Class131_Sub2_Sub16.anIntArray5789;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("vi.D(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ')'));
	}
    }
}
