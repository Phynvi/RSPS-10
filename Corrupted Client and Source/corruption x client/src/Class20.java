/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class20
{
    public Class131 aClass131_226;
    public static int anInt227;
    public static int anInt228;
    public static int anInt229;
    public static int anInt230;
    public static Class180 aClass180_231 = new Class180(16);
    public int anInt232 = 0;
    public static int anInt233;
    public static int[] anIntArray234 = new int[200];
    public Class180 aClass180_235;
    public static Class158 aClass158_236;
    public static int[] anIntArray237 = { 1, 4 };
    public static int anInt238;
    
    public static void method254(int arg0, byte arg1) {
	try {
	    synchronized (Class131_Sub41_Sub18.aClass214_6398) {
		Class131_Sub41_Sub18.aClass214_6398.method2786(arg1 + 60,
							       arg0);
	    }
	    anInt227++;
	    if (arg1 != -60)
		method258(51);
	    synchronized (Class131_Sub2_Sub14.aClass214_5749) {
		Class131_Sub2_Sub14.aClass214_5749.method2786(0, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bo.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method255(int arg0) {
	try {
	    anIntArray234 = null;
	    aClass158_236 = null;
	    anIntArray237 = null;
	    aClass180_231 = null;
	    int i = 59 / ((arg0 - -13) / 55);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bo.C(" + arg0 + ')');
	}
    }
    
    public static void method256(byte arg0) {
	try {
	    Class50.aClass181_663 = new Class181(8);
	    anInt233++;
	    if (arg0 != -6)
		method256((byte) 1);
	    Class131_Sub41_Sub12.anInt6320 = 0;
	    for (Class1_Sub6 class1_sub6
		     = (Class1_Sub6) Class42.aClass50_574.method586((byte) 42);
		 class1_sub6 != null;
		 class1_sub6
		     = (Class1_Sub6) Class42.aClass50_574.method589(120))
		class1_sub6.method117();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bo.B(" + arg0 + ')');
	}
    }
    
    public static int method257(boolean arg0, int arg1, Class128_Sub1 arg2,
				boolean arg3, Class128_Sub1 arg4) {
	try {
	    anInt238++;
	    if ((arg1 ^ 0xffffffff) == -2) {
		int i = arg4.anInt1744;
		int i_0_ = arg2.anInt1744;
		if (!arg0) {
		    if (i_0_ == -1)
			i_0_ = 2001;
		    if (i == -1)
			i = 2001;
		}
		return -i_0_ + i;
	    }
	    if (arg1 == 2)
		return Class23_Sub4_Sub1.method329((arg4.method1148(20203)
						    .aString1100),
						   110,
						   Class1_Sub7_Sub1.anInt5208,
						   (arg2.method1148(20203)
						    .aString1100));
	    if (arg1 == 3) {
		if (arg4.aString4020.equals("-")) {
		    if (arg2.aString4020.equals("-"))
			return 0;
		    if (arg0)
			return -1;
		    return 1;
		}
		if (arg2.aString4020.equals("-")) {
		    if (arg0)
			return 1;
		    return -1;
		}
		return Class23_Sub4_Sub1.method329(arg4.aString4020, 117,
						   Class1_Sub7_Sub1.anInt5208,
						   arg2.aString4020);
	    }
	    if (arg1 == 4) {
		if (arg4.method1138((byte) -91)) {
		    if (arg2.method1138((byte) -79))
			return 0;
		    return 1;
		}
		if (arg2.method1138((byte) -86))
		    return -1;
		return 0;
	    }
	    if (arg3 != true)
		anIntArray234 = null;
	    if (arg1 == 5) {
		if (arg4.method1143(34)) {
		    if (arg2.method1143(68))
			return 0;
		    return 1;
		}
		if (arg2.method1143(124))
		    return -1;
		return 0;
	    }
	    if (arg1 == 6) {
		if (!arg4.method1144(77)) {
		    if (!arg2.method1144(-92))
			return 0;
		    return -1;
		}
		if (arg2.method1144(113))
		    return 0;
		return 1;
	    }
	    if ((arg1 ^ 0xffffffff) == -8) {
		if (!arg4.method1139(59)) {
		    if (arg2.method1139(89))
			return -1;
		    return 0;
		}
		if (arg2.method1139(52))
		    return 0;
		return 1;
	    }
	    if ((arg1 ^ 0xffffffff) == -9) {
		int i = arg4.anInt4015;
		int i_1_ = arg2.anInt4015;
		if (arg0) {
		    if (i_1_ == 1000)
			i_1_ = -1;
		    if (i == 1000)
			i = -1;
		} else {
		    if (i == -1)
			i = 1000;
		    if (i_1_ == -1)
			i_1_ = 1000;
		}
		return -i_1_ + i;
	    }
	    return -arg2.anInt4022 + arg4.anInt4022;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bo.E(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method258(int arg0) {
	anInt228++;
	int i = 64 + 128 * Class154.anInt2046;
	int i_2_ = Class1_Sub3.anInt3536 * 128 - -64;
	int i_3_ = (RuntimeException_Sub1.method2833(i_2_, -111, i,
						     Class29.anInt300)
		    - Class131_Sub38.anInt4617);
	if (Class131_Sub2_Sub7.anInt5647 >= 100) {
	    Class2.anInt84 = 64 + 128 * Class154.anInt2046;
	    Class57.anInt753 = 128 * Class1_Sub3.anInt3536 + 64;
	    Class87.anInt1140
		= (RuntimeException_Sub1.method2833(Class57.anInt753, -84,
						    Class2.anInt84,
						    Class29.anInt300)
		   - Class131_Sub38.anInt4617);
	} else {
	    if (Class2.anInt84 < i) {
		Class2.anInt84 += (Class23_Sub2_Sub1.anInt4985
				   - -((-Class2.anInt84 + i)
				       * Class131_Sub2_Sub7.anInt5647 / 1000));
		if (i < Class2.anInt84)
		    Class2.anInt84 = i;
	    }
	    if ((Class87.anInt1140 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
		Class87.anInt1140 += (((-Class87.anInt1140 + i_3_)
				       * Class131_Sub2_Sub7.anInt5647 / 1000)
				      + Class23_Sub2_Sub1.anInt4985);
		if (Class87.anInt1140 > i_3_)
		    Class87.anInt1140 = i_3_;
	    }
	    if ((Class2.anInt84 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		Class2.anInt84
		    -= (Class131_Sub2_Sub7.anInt5647 * (Class2.anInt84 + -i)
			/ 1000) + Class23_Sub2_Sub1.anInt4985;
		if ((Class2.anInt84 ^ 0xffffffff) > (i ^ 0xffffffff))
		    Class2.anInt84 = i;
	    }
	    if (i_2_ > Class57.anInt753) {
		Class57.anInt753 += ((Class131_Sub2_Sub7.anInt5647
				      * (-Class57.anInt753 + i_2_) / 1000)
				     + Class23_Sub2_Sub1.anInt4985);
		if (i_2_ < Class57.anInt753)
		    Class57.anInt753 = i_2_;
	    }
	    if (Class87.anInt1140 > i_3_) {
		Class87.anInt1140 -= ((Class131_Sub2_Sub7.anInt5647
				       * (-i_3_ + Class87.anInt1140) / 1000)
				      + Class23_Sub2_Sub1.anInt4985);
		if ((i_3_ ^ 0xffffffff) < (Class87.anInt1140 ^ 0xffffffff))
		    Class87.anInt1140 = i_3_;
	    }
	    if (i_2_ < Class57.anInt753) {
		Class57.anInt753 -= (((-i_2_ + Class57.anInt753)
				      * Class131_Sub2_Sub7.anInt5647 / 1000)
				     + Class23_Sub2_Sub1.anInt4985);
		if (i_2_ > Class57.anInt753)
		    Class57.anInt753 = i_2_;
	    }
	}
	i_2_ = 64 + Class131_Sub41.anInt4675 * 128;
	i = 64 + 128 * Class23.anInt250;
	i_3_
	    = (RuntimeException_Sub1.method2833(i_2_, 113, i, Class29.anInt300)
	       + -Class131_Sub41_Sub18.anInt6400);
	int i_4_ = i + -Class2.anInt84;
	int i_5_ = i_3_ - Class87.anInt1140;
	int i_6_ = i_2_ + -Class57.anInt753;
	int i_7_ = (int) Math.sqrt((double) (i_6_ * i_6_ + i_4_ * i_4_));
	int i_8_ = 0x3fff & (int) (Math.atan2((double) i_5_, (double) i_7_)
				   * 2607.5945876176133);
	int i_9_ = ((int) (Math.atan2((double) i_4_, (double) i_6_)
			   * -2607.5945876176133)
		    & 0x3fff);
	if ((i_8_ ^ 0xffffffff) > -1025)
	    i_8_ = 1024;
	if (i_8_ > 3072)
	    i_8_ = 3072;
	if ((Stream.anInt4323 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
	    Stream.anInt4323
		+= ((Class166.anInt2224
		     * (i_8_ - Stream.anInt4323 >> -1896016637) / 1000)
		    + Class218.anInt3202) << -2041289245;
	    if (Stream.anInt4323 > i_8_)
		Stream.anInt4323 = i_8_;
	}
	if (arg0 != -2511)
	    aClass180_231 = null;
	if ((Stream.anInt4323 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
	    Stream.anInt4323
		-= (Class218.anInt3202 + ((Stream.anInt4323 - i_8_
					   >> -2101169949)
					  * Class166.anInt2224 / 1000)
		    << 1108437187);
	    if ((i_8_ ^ 0xffffffff) < (Stream.anInt4323 ^ 0xffffffff))
		Stream.anInt4323 = i_8_;
	}
	int i_10_ = -Class131_Sub41_Sub4.anInt6213 + i_9_;
	if ((i_10_ ^ 0xffffffff) < -8193)
	    i_10_ -= 16384;
	if (i_10_ < -8192)
	    i_10_ += 16384;
	i_10_ >>= 3;
	if ((i_10_ ^ 0xffffffff) < -1) {
	    Class131_Sub41_Sub4.anInt6213
		+= (i_10_ * Class166.anInt2224 / 1000 + Class218.anInt3202
		    << -1808656317);
	    Class131_Sub41_Sub4.anInt6213 &= 0x3fff;
	}
	if ((i_10_ ^ 0xffffffff) > -1) {
	    Class131_Sub41_Sub4.anInt6213
		-= (-i_10_ * Class166.anInt2224 / 1000 + Class218.anInt3202
		    << 1853993123);
	    Class131_Sub41_Sub4.anInt6213 &= 0x3fff;
	}
	int i_11_ = i_9_ - Class131_Sub41_Sub4.anInt6213;
	if (i_11_ > 8192)
	    i_11_ -= 16384;
	if ((i_11_ ^ 0xffffffff) > 8191)
	    i_11_ += 16384;
	if ((i_11_ ^ 0xffffffff) > -1 && i_10_ > 0
	    || (i_11_ ^ 0xffffffff) < -1 && (i_10_ ^ 0xffffffff) > -1)
	    Class131_Sub41_Sub4.anInt6213 = i_9_;
    }
    
    public Class131 method259(byte arg0) {
	try {
	    anInt230++;
	    if ((anInt232 ^ 0xffffffff) < -1
		&& (aClass180_235.aClass131Array2574[anInt232 + -1]
		    != aClass131_226)) {
		Class131 class131 = aClass131_226;
		aClass131_226 = class131.aClass131_1783;
		return class131;
	    }
	    if (arg0 < 3)
		return null;
	    while ((anInt232 ^ 0xffffffff)
		   > (aClass180_235.anInt2586 ^ 0xffffffff)) {
		Class131 class131 = (aClass180_235.aClass131Array2574
				     [anInt232++].aClass131_1783);
		if (aClass180_235.aClass131Array2574[-1 + anInt232]
		    != class131) {
		    aClass131_226 = class131.aClass131_1783;
		    return class131;
		}
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bo.D(" + arg0 + ')');
	}
    }
    
    public Class131 method260(int arg0) {
	try {
	    anInt232 = 0;
	    anInt229++;
	    if (arg0 != 24056)
		method257(false, 80, null, false, null);
	    return method259((byte) 90);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bo.A(" + arg0 + ')');
	}
    }
    
    public Class20(Class180 arg0) {
	try {
	    aClass180_235 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bo.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
