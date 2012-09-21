/* Class131_Sub2_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub18 extends Class131_Sub2
{
    public static int anInt5815;
    public static int anInt5816;
    public static int anInt5817;
    public static int anInt5818;
    public static int anInt5819;
    public static int anInt5820;
    public static int[] anIntArray5821 = new int[50];
    public static int anInt5822;
    
    public static void method1559(int arg0, int arg1) {
	try {
	    anInt5817++;
	    int i = 15 / ((-10 - arg0) / 61);
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(3, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(-58);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 == -49) {
		if ((arg0 ^ 0xffffffff) == -1)
		    aBoolean4093 = arg2.readUnsignedByte(arg1 + 169) == 1;
		anInt5819++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1560(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != -1)
		method1561(null, (byte) 80, 54);
	    anInt5820++;
	    int i = Class1_Sub4.anIntArray3551[arg0];
	    int i_0_ = Class1_Sub7_Sub1.anIntArray5206[arg2];
	    float f = (float) Math.atan2((double) (-2048 + i),
					 (double) (-2048 + i_0_));
	    if (!((double) f >= -3.141592653589793)
		|| !((double) f <= -2.356194490192345)) {
		if ((double) f <= -1.5707963267948966
		    && (double) f >= -2.356194490192345) {
		    Class14.anInt159 = arg0;
		    Class131_Sub41_Sub11_Sub1.anInt6552 = arg2;
		} else if ((double) f <= -0.7853981633974483
			   && (double) f >= -1.5707963267948966) {
		    Class14.anInt159 = arg0;
		    Class131_Sub41_Sub11_Sub1.anInt6552
			= -arg2 + Class131_Sub2_Sub7.anInt5637;
		} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
		    Class131_Sub41_Sub11_Sub1.anInt6552 = arg0;
		    Class14.anInt159 = -arg2 + Class120_Sub2.anInt3975;
		} else if (!(f >= 0.0F)
			   || !((double) f <= 0.7853981633974483)) {
		    if (!((double) f >= 0.7853981633974483)
			|| !((double) f <= 1.5707963267948966)) {
			if ((double) f >= 1.5707963267948966
			    && (double) f <= 2.356194490192345) {
			    Class131_Sub41_Sub11_Sub1.anInt6552 = arg2;
			    Class14.anInt159 = Class120_Sub2.anInt3975 - arg0;
			} else if ((double) f >= 2.356194490192345
				   && (double) f <= 3.141592653589793) {
			    Class14.anInt159 = arg2;
			    Class131_Sub41_Sub11_Sub1.anInt6552
				= Class131_Sub2_Sub7.anInt5637 + -arg0;
			}
		    } else {
			Class131_Sub41_Sub11_Sub1.anInt6552
			    = -arg2 + Class131_Sub2_Sub7.anInt5637;
			Class14.anInt159 = Class120_Sub2.anInt3975 - arg0;
		    }
		} else {
		    Class14.anInt159 = -arg2 + Class120_Sub2.anInt3975;
		    Class131_Sub41_Sub11_Sub1.anInt6552
			= Class131_Sub2_Sub7.anInt5637 - arg0;
		}
	    } else {
		Class131_Sub41_Sub11_Sub1.anInt6552 = arg0;
		Class14.anInt159 = arg2;
	    }
	    Class131_Sub41_Sub11_Sub1.anInt6552 &= Class23_Sub4_Sub4.anInt5404;
	    Class14.anInt159 &= Class79.anInt1060;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub2_Sub18() {
	super(1, false);
    }
    
    public static int method1561(Class173 arg0, byte arg1, int arg2) {
	try {
	    anInt5818++;
	    if (!client.method66(arg0).method1880(arg2, (byte) -118)
		&& arg0.anObjectArray2465 == null)
		return -1;
	    int i = 101 % ((39 - arg1) / 60);
	    if (arg0.anIntArray2315 != null
		&& (arg0.anIntArray2315.length ^ 0xffffffff) < (arg2
								^ 0xffffffff))
		return arg0.anIntArray2315[arg2];
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5822++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (arg1 != 0)
		return null;
	    if (aClass59_4097.aBoolean783) {
		int[] is_1_ = is[0];
		int[] is_2_ = is[1];
		int[] is_3_ = is[2];
		for (int i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++) {
		    method1560(i, arg1 ^ 0xffffffff, arg0);
		    int[][] is_4_
			= this.method1463(0, (byte) 115, Class14.anInt159);
		    is_1_[i] = is_4_[0][Class131_Sub41_Sub11_Sub1.anInt6552];
		    is_2_[i] = is_4_[1][Class131_Sub41_Sub11_Sub1.anInt6552];
		    is_3_[i] = is_4_[2][Class131_Sub41_Sub11_Sub1.anInt6552];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1562(int arg0) {
	try {
	    if (arg0 == 2)
		anIntArray5821 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ip.H(" + arg0 + ')');
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5816++;
	    if (arg0 != -11543)
		anIntArray5821 = null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 97);
	    if (aClass200_4087.aBoolean2927) {
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++) {
		    method1560(i, -1, arg1);
		    int[] is_5_
			= this.method1459(0, (byte) -40, Class14.anInt159);
		    is[i] = is_5_[Class131_Sub41_Sub11_Sub1.anInt6552];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1563(boolean arg0, boolean arg1) {
	try {
	    anInt5815++;
	    int[] is = null;
	    int i;
	    byte[][] is_6_;
	    if (!arg1) {
		i = 4;
		is_6_ = Class60.aByteArrayArray788;
	    } else {
		i = 1;
		is_6_ = Class23.aByteArrayArray254;
	    }
	    if (arg0 == false) {
		for (int i_7_ = 0; i > i_7_; i_7_++) {
		    Class43.method522(-122);
		    for (int i_8_ = 0;
			 ((i_8_ ^ 0xffffffff)
			  > (Class131_Sub41_Sub11_Sub1.anInt6546 >> 1524524067
			     ^ 0xffffffff));
			 i_8_++) {
			for (int i_9_ = 0;
			     ((i_9_ ^ 0xffffffff)
			      > (Class131_Sub2_Sub26.anInt5931 >> -1411168989
				 ^ 0xffffffff));
			     i_9_++) {
			    boolean bool = false;
			    int i_10_ = (Class141.anIntArrayArrayArray1882
					 [i_7_][i_8_][i_9_]);
			    if (i_10_ != -1) {
				int i_11_ = (i_10_ & 0x3edfc72) >> -1511428040;
				if (!arg1 || (i_11_ ^ 0xffffffff) == -1) {
				    int i_12_ = (i_10_ & 0x6) >> -1282696479;
				    int i_13_ = 0x3ff & i_10_ >> -438532786;
				    int i_14_ = i_10_ >> 1934398979 & 0x7ff;
				    int i_15_ = ((i_13_ / 8 << 218923432)
						 - -(i_14_ / 8));
				    for (int i_16_ = 0;
					 ((i_16_ ^ 0xffffffff)
					  > (Class74.anIntArray1003.length
					     ^ 0xffffffff));
					 i_16_++) {
					if ((Class74.anIntArray1003[i_16_]
					     == i_15_)
					    && is_6_[i_16_] != null) {
					    int[] is_17_
						= (Class131_Sub2_Sub8
						       .method1506
						   ((Class131_Sub2_Sub9
						     .aClass19Array5682),
						    i_13_, arg1, i_11_,
						    8 * i_9_, is_6_[i_16_],
						    i_12_, i_14_, i_7_, -27837,
						    8 * i_8_,
						    (Class183_Sub1
						     .aClass130_4960)));
					    if (is == null && is_17_ != null)
						is = is_17_;
					    bool = true;
					    break;
					}
				    }
				}
			    }
			    if (!bool)
				Class209.method2754(8, 8 * i_9_, 8, -22467,
						    i_7_, 8 * i_8_);
			}
		    }
		}
		if (is == null)
		    Class98.aClass209_1307 = null;
		else {
		    Class98.aClass209_1307
			= Login.method1152(is[0], is[1], is[3], (byte) 104,
					      is[2]);
		    Class131_Sub41_Sub4.anInt6199 = is[4];
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ip.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
