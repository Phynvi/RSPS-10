/* Class131_Sub2_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class131_Sub2_Sub6 extends Class131_Sub2
{
    public static int anInt5617;
    public static Class176 aClass176_5618;
    public int anInt5619;
    public static int anInt5620;
    public static int anInt5621;
    public static int LocalX = -1;
    public int anInt5623;
    public static int anInt5624;
    public static int anInt5625;
    public static int anInt5626;
    public static int anInt5627;
    public int anInt5628 = 0;
    public static int[] anIntArray5629 = new int[3];
    public int anInt5630;
    public int anInt5631;
    
    public static void method1494(byte arg0) {
	try {
	    aClass176_5618 = null;
	    if (arg0 == -127)
		anIntArray5629 = null;
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception, "df.I(" + arg0 + ')');
	}
    }
    
    public static RuntimeException_Sub1 method1495(Throwable arg0,
						   String arg1) {
	try {
	    anInt5624++;
	    RuntimeException_Sub1 runtimeexception_sub1;
	    if (arg0 instanceof RuntimeException_Sub1) {
		runtimeexception_sub1 = (RuntimeException_Sub1) arg0;
		runtimeexception_sub1.aString3245 += ' ' + (String) arg1;
	    } else
		runtimeexception_sub1 = new RuntimeException_Sub1(arg0, arg1);
	    return runtimeexception_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method1471(int arg0) {
	try {
	    Class103.method904(arg0);
	    anInt5617++;
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception, "df.J(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5627++;
	int i = arg0;
    while_35_:
	do {
	while_34_:
	    do {
	    while_33_:
		do {
		    do {
			if (i != 0) {
			    if (i != 1) {
				if (i != 2) {
				    if ((i ^ 0xffffffff) != -4) {
					if ((i ^ 0xffffffff) == -5)
					    break while_34_;
					break while_35_;
				    }
				} else
				    break;
				break while_33_;
			    }
			} else {
			    anInt5628 = arg2.readUnsignedByte(114);
			    break while_35_;
			}
			anInt5619 = arg2.readUnsignedShort(8104);
			break while_35_;
		    } while (false);
		    anInt5630 = arg2.readUnsignedByte(arg1 + -46);
		    break while_35_;
		} while (false);
		anInt5623 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
		break while_35_;
	    } while (false);
	    anInt5631 = arg2.readUnsignedShort(arg1 + 8153);
	} while (false);
	if (arg1 != -49)
	    method1497(-60);
    }
    
    public Class131_Sub2_Sub6() {
	super(0, true);
	anInt5623 = 0;
	anInt5619 = 2000;
	anInt5630 = 16;
	anInt5631 = 4096;
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5621++;
	    if (arg0 != -11543)
		aClass176_5618 = null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -101);
	    if (aClass200_4087.aBoolean2927) {
		int i = anInt5631 >> 649887201;
		int[][] is_0_ = aClass200_4087.method2715((byte) 46);
		Random random = new Random((long) anInt5628);
		for (int i_1_ = 0;
		     (i_1_ ^ 0xffffffff) > (anInt5619 ^ 0xffffffff); i_1_++) {
		    int i_2_
			= (anInt5631 <= 0 ? anInt5623
			   : anInt5623 + -i + Class143.method2146(2044605728,
								  random,
								  anInt5631));
		    i_2_ = i_2_ >> 187173924 & 0xff;
		    int i_3_
			= Class143.method2146(2044605728, random,
					      Class131_Sub2_Sub7.anInt5637);
		    int i_4_ = Class143.method2146(arg0 ^ ~0x79de1836, random,
						   Class120_Sub2.anInt3975);
		    int i_5_
			= (i_3_
			   + (Class153_Sub1.anIntArray4763[i_2_] * anInt5630
			      >> 815166412));
		    int i_6_
			= (i_4_
			   - -(anInt5630 * Class131_Sub29.anIntArray4510[i_2_]
			       >> -1604490772));
		    int i_7_ = i_6_ + -i_4_;
		    int i_8_ = i_5_ + -i_3_;
		    if (i_8_ != 0 || i_7_ != 0) {
			if ((i_7_ ^ 0xffffffff) > -1)
			    i_7_ = -i_7_;
			if (i_8_ < 0)
			    i_8_ = -i_8_;
			boolean bool
			    = (i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
			if (bool) {
			    int i_9_ = i_3_;
			    i_3_ = i_4_;
			    int i_10_ = i_5_;
			    i_4_ = i_9_;
			    i_5_ = i_6_;
			    i_6_ = i_10_;
			}
			if ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
			    int i_11_ = i_3_;
			    i_3_ = i_5_;
			    int i_12_ = i_4_;
			    i_4_ = i_6_;
			    i_5_ = i_11_;
			    i_6_ = i_12_;
			}
			int i_13_ = i_4_;
			int i_14_ = -i_3_ + i_5_;
			int i_15_ = i_6_ + -i_4_;
			int i_16_ = -i_14_ / 2;
			int i_17_ = 2048 / i_14_;
			int i_18_ = (-(Class143.method2146(arg0 ^ ~0x79de1836,
							   random, 4096)
				       >> -2103979134)
				     + 1024);
			if (i_15_ < 0)
			    i_15_ = -i_15_;
			int i_19_ = i_4_ >= i_6_ ? -1 : 1;
			for (int i_20_ = i_3_;
			     (i_5_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
			     i_20_++) {
			    int i_21_ = i_17_ * (-i_3_ + i_20_) + 1024 + i_18_;
			    int i_22_ = i_20_ & Class23_Sub4_Sub4.anInt5404;
			    int i_23_ = Class79.anInt1060 & i_13_;
			    i_16_ += i_15_;
			    if (bool)
				is_0_[i_23_][i_22_] = i_21_;
			    else
				is_0_[i_22_][i_23_] = i_21_;
			    if ((i_16_ ^ 0xffffffff) < -1) {
				i_13_ -= -i_19_;
				i_16_ = -i_14_ + i_16_;
			    }
			}
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception,
			     "df.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class39[] method1496(byte arg0) {
	try {
	    if (Class128.aClass39Array1742 == null) {
		Class39[] class39s
		    = Class131_Sub29.method1852(Class23_Sub4.aSignLink_3734,
						-31353);
		Class39[] class39s_24_ = new Class39[class39s.length];
		int i = 0;
	    while_37_:
		for (int i_25_ = 0;
		     (i_25_ ^ 0xffffffff) > (class39s.length ^ 0xffffffff);
		     i_25_++) {
		    Class39 class39 = class39s[i_25_];
		    if ((class39.anInt515 <= 0 || class39.anInt515 >= 24)
			&& class39.anInt510 >= 800 && class39.anInt513 >= 600
			&& ((Class1_Sub4.anInt3554 ^ 0xffffffff) <= -97
			    || Stream.anInt4299 != 0
			    || ((class39.anInt510 ^ 0xffffffff) >= -1025
				&& class39.anInt513 <= 768))) {
			for (int i_26_ = 0; i_26_ < i; i_26_++) {
			    Class39 class39_27_ = class39s_24_[i_26_];
			    if (((class39_27_.anInt510 ^ 0xffffffff)
				 == (class39.anInt510 ^ 0xffffffff))
				&& class39.anInt513 == class39_27_.anInt513) {
				if ((class39.anInt515 ^ 0xffffffff)
				    < (class39_27_.anInt515 ^ 0xffffffff))
				    class39s_24_[i_26_] = class39;
				continue while_37_;
			    }
			}
			class39s_24_[i] = class39;
			i++;
		    }
		}
		Class128.aClass39Array1742 = new Class39[i];
		Class61.method654(class39s_24_, 0, Class128.aClass39Array1742,
				  0, i);
		int[] is = new int[Class128.aClass39Array1742.length];
		for (int i_28_ = 0;
		     ((Class128.aClass39Array1742.length ^ 0xffffffff)
		      < (i_28_ ^ 0xffffffff));
		     i_28_++) {
		    Class39 class39 = Class128.aClass39Array1742[i_28_];
		    is[i_28_] = class39.anInt510 * class39.anInt513;
		}
		Class131_Sub10.method1695(2175, is,
					  Class128.aClass39Array1742);
	    }
	    if (arg0 < 61)
		anIntArray5629 = null;
	    anInt5620++;
	    return Class128.aClass39Array1742;
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception, "df.L(" + arg0 + ')');
	}
    }
    
    public static void method1497(int arg0) {
	try {
	    if (arg0 != 2)
		aClass176_5618 = null;
	    anInt5626++;
	    synchronized (Class137.aClass214_1834) {
		Class137.aClass214_1834.method2775((byte) 56);
	    }
	    synchronized (Class131_Sub2_Sub10.aClass214_5693) {
		Class131_Sub2_Sub10.aClass214_5693.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception, "df.M(" + arg0 + ')');
	}
    }
    
    public static void method1498(int arg0) {
	try {
	    Class131_Sub41_Sub18.aByteArrayArrayArray6402 = null;
	    Class121.aByteArrayArrayArray1590 = null;
	    Class121_Sub3_Sub1.aByteArrayArrayArray5434 = null;
	    if (arg0 >= -14)
		aClass176_5618 = null;
	    Cryption.anIntArrayArrayArray1828 = null;
	    Class131_Sub41_Sub11.anIntArray6301 = null;
	    Class83.anIntArray1097 = null;
	    Class88.aByteArrayArrayArray1150 = null;
	    Class131_Sub2_Sub16.anIntArray5789 = null;
	    Class78.anIntArray1054 = null;
	    Class131_Sub3.anIntArray4127 = null;
	    anInt5625++;
	    Class17.aByteArrayArrayArray184 = null;
	    Class131_Sub22.anIntArray4448 = null;
	} catch (RuntimeException runtimeexception) {
	    throw method1495(runtimeexception, "df.K(" + arg0 + ')');
	}
    }
}
