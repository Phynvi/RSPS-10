/* Class131_Sub2_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Random;

public class Class131_Sub2_Sub15 extends Class131_Sub2
{
    public short[] aShortArray5758;
    public int anInt5759 = 0;
    public byte[] aByteArray5760;
    public static int anInt5761;
    public int anInt5762 = 1;
    public int anInt5763;
    public static int anInt5764;
    public static int anInt5765;
    public static int anInt5766;
    public int anInt5767;
    public static Canvas aCanvas5768;
    public int anInt5769;
    public static int anInt5770;
    public int anInt5771;
    public static int anInt5772;
    public static String aString5773 = " more options";
    public static int anInt5774;
    public static Class214 aClass214_5775 = new Class214(64);
    public static Class140 aClass140_5776;
    
    public static void method1540(int arg0, String arg1) {
	try {
	    anInt5761++;
	    if (Class131_Sub41_Sub7.aStringArray6253 == null)
		Class23_Sub4_Sub3.method378(500);
	    String[] strings
		= Class131_Sub41_Sub21.method2077((byte) 100, arg1, '\n');
	    if (arg0 > -40)
		aCanvas5768 = null;
	    for (int i = 0; strings.length > i; i++) {
		for (int i_0_ = Class110.anInt1431; (i_0_ ^ 0xffffffff) < -1;
		     i_0_--)
		    Class131_Sub41_Sub7.aStringArray6253[i_0_]
			= Class131_Sub41_Sub7.aStringArray6253[-1 + i_0_];
		Class131_Sub41_Sub7.aStringArray6253[0] = strings[i];
		if ((Class110.anInt1431 ^ 0xffffffff)
		    > (-1 + Class131_Sub41_Sub7.aStringArray6253.length
		       ^ 0xffffffff)) {
		    if (Class157.anInt2077 > 0)
			Class157.anInt2077++;
		    Class110.anInt1431++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fn.H(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1541(int arg0) {
	anInt5764++;
	Class220.aClass214_3212.method2775((byte) 56);
	Class131_Sub2.aClass214_4098.method2775((byte) 56);
	if (arg0 != -15845)
	    aString5773 = null;
    }
    
    public static void method1542(int arg0) {
	try {
	    aClass140_5776 = null;
	    if (arg0 >= -106)
		method1541(45);
	    aCanvas5768 = null;
	    aClass214_5775 = null;
	    aString5773 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fn.F(" + arg0 + ')');
	}
    }
    
    public static boolean method1543(Class131_Sub1_Sub1 arg0, Class158 arg1,
				     Class158 arg2, Class158 arg3, int arg4) {
	try {
	    Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106 = arg0;
	    anInt5770++;
	    if (arg4 >= -19)
		return false;
	    Class121_Sub3_Sub1.aClass158_5435 = arg3;
	    Class6.aClass158_92 = arg2;
	    Class128.aClass158_1745 = arg1;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fn.I(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4
			+ ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	while_124_:
	    do {
	    while_123_:
		do {
		while_122_:
		    do {
		    while_121_:
			do {
			while_120_:
			    do {
				do {
				    if ((i ^ 0xffffffff) != -1) {
					if (i != 1) {
					    if (i != 2) {
						if ((i ^ 0xffffffff) != -4) {
						    if ((i ^ 0xffffffff)
							!= -5) {
							if (i != 5) {
							    if (i == 6)
								break while_123_;
							    break while_124_;
							}
						    } else
							break while_121_;
						    break while_122_;
						}
					    } else
						break;
					    break while_120_;
					}
				    } else {
					anInt5771 = anInt5767
					    = arg2.readUnsignedByte(-48);
					break while_124_;
				    }
				    anInt5759 = arg2.readUnsignedByte(arg1 ^ 0x68);
				    break while_124_;
				} while (false);
				anInt5763 = arg2.readUnsignedShort(8104);
				break while_124_;
			    } while (false);
			    anInt5769 = arg2.readUnsignedByte(99);
			    break while_124_;
			} while (false);
			anInt5762 = arg2.readUnsignedByte(64);
			break while_124_;
		    } while (false);
		    anInt5771 = arg2.readUnsignedByte(104);
		    break while_124_;
		} while (false);
		anInt5767 = arg2.readUnsignedByte(arg1 ^ ~0x59);
	    } while (false);
	    if (arg1 != -49)
		aClass140_5776 = null;
	    anInt5774++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fn.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub15() {
	super(0, true);
	aByteArray5760 = new byte[512];
	anInt5767 = 5;
	aShortArray5758 = new short[512];
	anInt5769 = 2;
	anInt5763 = 2048;
	anInt5771 = 5;
    }
    
    public void method1544(byte arg0) {
	anInt5766++;
	Random random = new Random((long) anInt5759);
	if (arg0 <= -102) {
	    aShortArray5758 = new short[512];
	    if ((anInt5763 ^ 0xffffffff) < -1) {
		for (int i = 0; (i ^ 0xffffffff) > -513; i++)
		    aShortArray5758[i]
			= (short) Class143.method2146(2044605728, random,
						      anInt5763);
	    }
	}
    }
    
    public void method1471(int arg0) {
	anInt5772++;
	aByteArray5760 = Class57.method633(false, anInt5759);
	method1544((byte) -115);
	if (arg0 != 0)
	    anInt5771 = 121;
    }
    
    public static Class23_Sub1 method1545(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 == null)
	    return null;
	return class147.aClass23_Sub1_1969;
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5765++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -122);
	    if (arg0 != -11543)
		method1455(-11, (byte) -78, null);
	    if (aClass200_4087.aBoolean2927) {
		int i
		    = anInt5767 * Class1_Sub7_Sub1.anIntArray5206[arg1] + 2048;
		int i_1_ = i >> -1942598516;
		int i_2_ = 1 + i_1_;
		int i_3_ = 0;
	    while_132_:
		for (/**/; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
			    < (i_3_ ^ 0xffffffff)); i_3_++) {
		    Class69.anInt930 = Class211.anInt3102
			= Class42.anInt580 = Class197.anInt2881 = 2147483647;
		    int i_4_ = 2048 - -(Class1_Sub4.anIntArray3551[i_3_]
					* anInt5771);
		    int i_5_ = i_4_ >> 147404652;
		    int i_6_ = i_5_ - -1;
		    for (int i_7_ = -1 + i_1_; i_7_ <= i_2_; i_7_++) {
			int i_8_
			    = (aByteArray5760[0xff & (((anInt5767 ^ 0xffffffff)
						       < (i_7_ ^ 0xffffffff))
						      ? i_7_
						      : -anInt5767 + i_7_)]
			       & 0xff);
			for (int i_9_ = i_5_ - 1; i_9_ <= i_6_; i_9_++) {
			    int i_10_
				= 2 * (0xff & (aByteArray5760
					       [0xff & (anInt5771 <= i_9_
							? -anInt5771 + i_9_
							: i_9_) + i_8_]));
			    int i_11_ = (i_4_ + -aShortArray5758[i_10_++]
					 - (i_9_ << -1143501876));
			    int i_12_ = (-(i_7_ << 937712588)
					 - (aShortArray5758[i_10_] - i));
			    int i_13_ = anInt5762;
			    int i_14_;
			while_128_:
			    do {
			    while_127_:
				do {
				while_126_:
				    do {
				    while_125_:
					do {
					    do {
						if ((i_13_ ^ 0xffffffff)
						    != -2) {
						    if ((i_13_ ^ 0xffffffff)
							!= -4) {
							if (i_13_ != 4) {
							    if (i_13_ != 5) {
								if ((i_13_
								     ^ 0xffffffff)
								    == -3)
								    break while_126_;
								break while_127_;
							    }
							} else
							    break;
							break while_125_;
						    }
						} else {
						    i_14_ = ((i_11_ * i_11_
							      + i_12_ * i_12_)
							     >> -717849940);
						    break while_128_;
						}
						i_11_
						    = ((i_11_ ^ 0xffffffff)
						       > -1) ? -i_11_ : i_11_;
						i_12_ = (i_12_ >= 0 ? i_12_
							 : -i_12_);
						i_14_ = (((i_11_ ^ 0xffffffff)
							  >= (i_12_
							      ^ 0xffffffff))
							 ? i_12_ : i_11_);
						break while_128_;
					    } while (false);
					    i_11_
						= (int) ((Math.sqrt
							  ((double) ((float) (i_11_ >= 0
									      ? i_11_
									      : -i_11_)
								     / 4096.0F)))
							 * 4096.0);
					    i_12_
						= (int) (4096.0
							 * (Math.sqrt
							    ((double) ((float) ((i_12_ ^ 0xffffffff) > -1 ? -i_12_ : i_12_)
								       / 4096.0F))));
					    i_14_ = i_12_ + i_11_;
					    i_14_
						= i_14_ * i_14_ >> 2027702348;
					    break while_128_;
					} while (false);
					i_11_ *= i_11_;
					i_12_ *= i_12_;
					i_14_
					    = (int) ((Math.sqrt
						      (Math.sqrt
						       ((double) ((float) (i_12_
									   + i_11_)
								  / 1.6777216E7F))))
						     * 4096.0);
					break while_128_;
				    } while (false);
				    i_14_ = ((i_12_ >= 0 ? i_12_ : -i_12_)
					     + (i_11_ < 0 ? -i_11_ : i_11_));
				    break while_128_;
				} while (false);
				i_14_
				    = (int) ((Math.sqrt
					      ((double) ((float) (i_11_ * i_11_
								  - -(i_12_
								      * i_12_))
							 / 1.6777216E7F)))
					     * 4096.0);
			    } while (false);
			    if ((Class69.anInt930 ^ 0xffffffff)
				< (i_14_ ^ 0xffffffff)) {
				Class197.anInt2881 = Class42.anInt580;
				Class42.anInt580 = Class211.anInt3102;
				Class211.anInt3102 = Class69.anInt930;
				Class69.anInt930 = i_14_;
			    } else if (Class211.anInt3102 > i_14_) {
				Class197.anInt2881 = Class42.anInt580;
				Class42.anInt580 = Class211.anInt3102;
				Class211.anInt3102 = i_14_;
			    } else if (Class42.anInt580 <= i_14_) {
				if ((i_14_ ^ 0xffffffff)
				    > (Class197.anInt2881 ^ 0xffffffff))
				    Class197.anInt2881 = i_14_;
			    } else {
				Class197.anInt2881 = Class42.anInt580;
				Class42.anInt580 = i_14_;
			    }
			}
		    }
		    int i_15_ = anInt5769;
		while_130_:
		    do {
		    while_129_:
			do {
			    do {
				if ((i_15_ ^ 0xffffffff) != -1) {
				    if (i_15_ != 1) {
					if (i_15_ != 3) {
					    if ((i_15_ ^ 0xffffffff) != -5) {
						if ((i_15_ ^ 0xffffffff) == -3)
						    break while_130_;
						continue while_132_;
					    }
					} else
					    break;
					break while_129_;
				    }
				} else {
				    is[i_3_] = Class69.anInt930;
				    continue while_132_;
				}
				is[i_3_] = Class211.anInt3102;
				continue while_132_;
			    } while (false);
			    is[i_3_] = Class42.anInt580;
			    continue while_132_;
			} while (false);
			is[i_3_] = Class197.anInt2881;
			continue while_132_;
		    } while (false);
		    is[i_3_] = Class211.anInt3102 - Class69.anInt930;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fn.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
