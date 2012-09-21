/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class153
{
    public int anInt2026;
    public int anInt2027 = 4;
    public static int[] anIntArray2028;
    public short[] aShortArray2029;
    public static int anInt2030;
    public static int anInt2031;
    public static int anInt2032;
    public int anInt2033 = 4;
    public static int anInt2034;
    public int anInt2035;
    public static String aString2036 = "Loading wordpack - ";
    public short[] aShortArray2037;
    public static int anInt2038;
    public static int anInt2039;
    public static Class214 aClass214_2040;
    public static int anInt2041;
    public static int anInt2042;
    public static int anInt2043;
    public int anInt2044;
    public static int[] anIntArray2045;
    
    public abstract void method2223(byte i);
    
    public void method2224(int arg0) {
	do {
	    try {
		anInt2034++;
		aShortArray2037 = new short[anInt2035];
		for (int i = 0; (i ^ 0xffffffff) > (anInt2035 ^ 0xffffffff);
		     i++)
		    aShortArray2037[i]
			= (short) (int) Math.pow(2.0, (double) i);
		if (arg0 < -26)
		    break;
		anInt2041 = 16;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "qb.H(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public static void method2225(boolean arg0) {
	try {
	    aClass214_2040 = null;
	    anIntArray2045 = null;
	    if (arg0 == false) {
		aString2036 = null;
		anIntArray2028 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qb.G(" + arg0 + ')');
	}
    }
    
    public void method2226(int arg0) {
	try {
	    anInt2031++;
	    Random random = new Random((long) anInt2044);
	    for (int i = 0; i < 255; i++)
		aShortArray2029[i] = (short) i;
	    if (arg0 != 2)
		method2225(true);
	    for (int i = 0; (i ^ 0xffffffff) > -256; i++) {
		int i_0_ = -i + 255;
		int i_1_ = Class143.method2146(2044605728, random, i_0_);
		short i_2_ = aShortArray2029[i_1_];
		aShortArray2029[i_1_] = aShortArray2029[i_0_];
		aShortArray2029[i_0_] = aShortArray2029[i_0_ + 256] = i_2_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qb.F(" + arg0 + ')');
	}
    }
    
    public static void method2227(byte arg0) {
	try {
	    Class4.anInt3295 = 0;
	    Class110_Sub4.anInt3940 = 0;
	    anInt2038++;
	    PacketStream.anInt6130 = 0;
	    Class4.anInt3281 = -3;
	    Class1_Sub4.anInt3547 = -1;
	    Class143.aBoolean1903 = false;
	    int i = -65 % ((arg0 - 24) / 33);
	    Class75.anInt1024 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qb.B(" + arg0 + ')');
	}
    }
    
    public static int method2228(int arg0, int arg1) {
	try {
	    anInt2030++;
	    if (arg1 != -35572916)
		anIntArray2028 = null;
	    return 0xff & arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qb.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2229(int arg0, boolean arg1, int arg2, int arg3) {
	try {
	    anInt2032++;
	    int[] is = new int[arg3];
	    int[] is_3_ = new int[arg2];
	    int[] is_4_ = new int[arg0];
	    for (int i = 0; i < arg3; i++)
		is[i] = (i << 1153068524) / arg3;
	    for (int i = 0; arg2 > i; i++)
		is_3_[i] = (i << -1463098004) / arg2;
	    if (arg1 == false) {
		for (int i = 0; (arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		    is_4_[i] = (i << 380396780) / arg0;
		method2223((byte) 122);
		for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++) {
		    for (int i_5_ = 0; arg2 > i_5_; i_5_++) {
			for (int i_6_ = 0; arg3 > i_6_; i_6_++) {
			    for (int i_7_ = 0; i_7_ < anInt2035; i_7_++) {
				int i_8_ = aShortArray2037[i_7_] << -517328532;
				int i_9_ = is_4_[i] * i_8_ >> 1450084204;
				int i_10_ = i_8_ * anInt2026 >> 1251418636;
				int i_11_ = i_8_ * anInt2027 >> 617268428;
				int i_12_ = anInt2033 * i_8_ >> 1290295500;
				int i_13_ = is[i_6_] * i_8_ >> -528588020;
				int i_14_ = is_3_[i_5_] * i_8_ >> 2078332940;
				i_14_ *= anInt2033;
				i_9_ *= anInt2026;
				i_13_ *= anInt2027;
				int i_15_ = i_13_ >> 1578472076;
				int i_16_ = 1 + i_15_;
				int i_17_ = i_14_ >> 1275220748;
				i_15_ &= 0xff;
				int i_18_ = 1 + i_17_;
				i_17_ &= 0xff;
				int i_19_ = i_9_ >> -1512574356;
				int i_20_ = 1 + i_19_;
				i_14_ &= 0xfff;
				if ((i_18_ ^ 0xffffffff)
				    > (i_12_ ^ 0xffffffff))
				    i_18_ &= 0xff;
				else
				    i_18_ = 0;
				i_19_ &= 0xff;
				if (i_20_ < i_10_)
				    i_20_ &= 0xff;
				else
				    i_20_ = 0;
				if ((i_16_ ^ 0xffffffff)
				    > (i_11_ ^ 0xffffffff))
				    i_16_ &= 0xff;
				else
				    i_16_ = 0;
				i_9_ &= 0xfff;
				i_13_ &= 0xfff;
				int i_21_ = -4096 + i_9_;
				int i_22_ = aShortArray2029[i_20_];
				int i_23_ = Class4.anIntArray3282[i_13_];
				int i_24_ = Class4.anIntArray3282[i_9_];
				int i_25_ = aShortArray2029[i_19_];
				int i_26_ = Class4.anIntArray3282[i_14_];
				int i_27_ = -4096 + i_13_;
				int i_28_ = i_14_ - 4096;
				int i_29_ = aShortArray2029[i_17_ + i_25_];
				int i_30_ = aShortArray2029[i_17_ - -i_22_];
				int i_31_ = aShortArray2029[i_25_ + i_18_];
				int i_32_ = aShortArray2029[i_18_ - -i_22_];
				int i_33_
				    = Class57.method632(i_13_, 101, i_14_,
							(aShortArray2029
							 [i_29_ + i_15_]),
							i_9_);
				int i_34_
				    = Class57.method632(i_27_, 86, i_14_,
							(aShortArray2029
							 [i_29_ + i_16_]),
							i_9_);
				int i_35_ = ((i_23_ * (i_34_ + -i_33_)
					      >> -1845905620)
					     + i_33_);
				i_33_ = Class57.method632(i_13_, 110, i_28_,
							  (aShortArray2029
							   [i_31_ + i_15_]),
							  i_9_);
				i_34_ = Class57.method632(i_27_, 108, i_28_,
							  (aShortArray2029
							   [i_16_ + i_31_]),
							  i_9_);
				int i_36_ = i_33_ - -(i_23_ * (i_34_ + -i_33_)
						      >> -35572916);
				int i_37_
				    = (((i_36_ + -i_35_) * i_26_ >> 1146336972)
				       + i_35_);
				i_33_ = Class57.method632(i_13_, 87, i_14_,
							  (aShortArray2029
							   [i_30_ + i_15_]),
							  i_21_);
				i_34_ = Class57.method632(i_27_, 116, i_14_,
							  (aShortArray2029
							   [i_30_ + i_16_]),
							  i_21_);
				i_35_ = (i_23_ * (-i_33_ + i_34_)
					 >> 230969900) + i_33_;
				i_33_ = Class57.method632(i_13_, 117, i_28_,
							  (aShortArray2029
							   [i_32_ + i_15_]),
							  i_21_);
				i_34_ = Class57.method632(i_27_, 99, i_28_,
							  (aShortArray2029
							   [i_32_ + i_16_]),
							  i_21_);
				i_36_ = i_33_ + (i_23_ * (-i_33_ + i_34_)
						 >> -2031757140);
				int i_38_ = i_35_ - -(i_26_ * (-i_35_ + i_36_)
						      >> -1912883188);
				method2230(i_37_ + ((-i_37_ + i_38_) * i_24_
						    >> 2111150348),
					   124, i_7_);
			    }
			    method2231(arg1);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qb.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public abstract void method2230(int i, int i_39_, int i_40_);
    
    public abstract void method2231(boolean bool);
    
    public Class153(int arg0, int arg1, int arg2, int arg3, int arg4) {
	aShortArray2029 = new short[512];
	anInt2035 = 4;
	anInt2026 = 4;
	anInt2044 = 0;
	try {
	    anInt2026 = arg4;
	    anInt2033 = arg3;
	    anInt2035 = arg1;
	    anInt2027 = arg2;
	    anInt2044 = arg0;
	    method2224(-35);
	    method2226(2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qb.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ')'));
	}
    }
    
    static {
	anIntArray2028 = new int[2];
	anInt2041 = 0;
	aClass214_2040 = new Class214(500);
	anIntArray2045
	    = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };
	anInt2043 = 0;
    }
}
