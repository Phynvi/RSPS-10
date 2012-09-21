/* Cryption - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Cryption
{
    public static int anInt1819;
    public static int anInt1820;
    public int anInt1821;
    public static short[] aShortArray1822;
    public static int anInt1823;
    public static int anInt1824;
    public static float aFloat1825 = 0.0F;
    public int anInt1826;
    public static int anInt1827;
    public static int[][][] anIntArrayArrayArray1828;
    public int[] anIntArray1829;
    public int[] anIntArray1830;
    public int anInt1831;
    public static Class158 aClass158_1832;
    public int anInt1833;

    public static void method2104(boolean arg0) {
	try {
	    aClass158_1832 = null;
	    aShortArray1822 = null;
	    if (arg0 != false)
		method2104(false);
	    anIntArrayArrayArray1828 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"om.E(" + arg0 + ')');
	}
    }
    
    public static int method2105(int arg0, int arg1) {
	try {
	    return arg0 | arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("om.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2106(int arg0) {
	try {
	    anInt1819++;
	    int i_0_;
	    int i_1_;
	    int i_2_;
	    int i_3_;
	    int i_4_;
	    int i_5_;
	    int i_6_;
	    int i
		= i_0_ = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = -1640531527;
	    for (int i_7_ = 0; i_7_ < 4; i_7_++) {
		i ^= i_0_ << -1546508661;
		i_2_ += i;
		i_0_ += i_1_;
		i_0_ ^= i_1_ >>> 228410850;
		i_1_ += i_2_;
		i_3_ += i_0_;
		i_1_ ^= i_2_ << -1121928664;
		i_2_ += i_3_;
		i_4_ += i_1_;
		i_2_ ^= i_3_ >>> -226478352;
		i_5_ += i_2_;
		i_3_ += i_4_;
		i_3_ ^= i_4_ << 899929002;
		i_6_ += i_3_;
		i_4_ += i_5_;
		i_4_ ^= i_5_ >>> -1360601884;
		i_5_ += i_6_;
		i += i_4_;
		i_5_ ^= i_6_ << -1064360920;
		i_6_ += i;
		i_0_ += i_5_;
		i_6_ ^= i >>> 291188969;
		i += i_0_;
		i_1_ += i_6_;
	    }
	    for (int i_8_ = 0; i_8_ < 256; i_8_ += 8) {
		i_2_ += anIntArray1829[3 + i_8_];
		i_5_ += anIntArray1829[i_8_ - -6];
		i_3_ += anIntArray1829[4 + i_8_];
		i_4_ += anIntArray1829[i_8_ + 5];
		i_6_ += anIntArray1829[i_8_ - -7];
		i_1_ += anIntArray1829[2 + i_8_];
		i += anIntArray1829[i_8_];
		i_0_ += anIntArray1829[1 + i_8_];
		i ^= i_0_ << -529687573;
		i_2_ += i;
		i_0_ += i_1_;
		i_0_ ^= i_1_ >>> 1079101634;
		i_3_ += i_0_;
		i_1_ += i_2_;
		i_1_ ^= i_2_ << 77785512;
		i_2_ += i_3_;
		i_4_ += i_1_;
		i_2_ ^= i_3_ >>> 1797326864;
		i_3_ += i_4_;
		i_5_ += i_2_;
		i_3_ ^= i_4_ << 326119562;
		i_4_ += i_5_;
		i_6_ += i_3_;
		i_4_ ^= i_5_ >>> -587019292;
		i += i_4_;
		i_5_ += i_6_;
		i_5_ ^= i_6_ << -968230328;
		i_6_ += i;
		i_0_ += i_5_;
		i_6_ ^= i >>> 1838740649;
		i += i_0_;
		i_1_ += i_6_;
		anIntArray1830[i_8_] = i;
		anIntArray1830[i_8_ - -1] = i_0_;
		anIntArray1830[i_8_ - -2] = i_1_;
		anIntArray1830[3 + i_8_] = i_2_;
		anIntArray1830[4 + i_8_] = i_3_;
		anIntArray1830[5 + i_8_] = i_4_;
		anIntArray1830[6 + i_8_] = i_5_;
		anIntArray1830[i_8_ + 7] = i_6_;
	    }
	    for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
		i_0_ += anIntArray1830[i_9_ - -1];
		i_5_ += anIntArray1830[i_9_ + 6];
		i_6_ += anIntArray1830[7 + i_9_];
		i += anIntArray1830[i_9_];
		i_2_ += anIntArray1830[i_9_ + 3];
		i_3_ += anIntArray1830[4 + i_9_];
		i_1_ += anIntArray1830[2 + i_9_];
		i_4_ += anIntArray1830[i_9_ - -5];
		i ^= i_0_ << 1033944523;
		i_0_ += i_1_;
		i_2_ += i;
		i_0_ ^= i_1_ >>> 1953562338;
		i_3_ += i_0_;
		i_1_ += i_2_;
		i_1_ ^= i_2_ << -1741347864;
		i_2_ += i_3_;
		i_4_ += i_1_;
		i_2_ ^= i_3_ >>> -1474083152;
		i_5_ += i_2_;
		i_3_ += i_4_;
		i_3_ ^= i_4_ << -1479034710;
		i_4_ += i_5_;
		i_6_ += i_3_;
		i_4_ ^= i_5_ >>> 972719268;
		i_5_ += i_6_;
		i += i_4_;
		i_5_ ^= i_6_ << -1421767256;
		i_6_ += i;
		i_0_ += i_5_;
		i_6_ ^= i >>> 1529027145;
		i += i_0_;
		i_1_ += i_6_;
		anIntArray1830[i_9_] = i;
		anIntArray1830[i_9_ - -1] = i_0_;
		anIntArray1830[i_9_ - -2] = i_1_;
		anIntArray1830[3 + i_9_] = i_2_;
		anIntArray1830[i_9_ - -4] = i_3_;
		anIntArray1830[i_9_ - -5] = i_4_;
		anIntArray1830[i_9_ + 6] = i_5_;
		anIntArray1830[i_9_ - -7] = i_6_;
	    }
	    if (arg0 == -2) {
		method2109(25266);
		anInt1831 = 256;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"om.D(" + arg0 + ')');
	}
    }
    
    public int method2107(byte arg0) {
	try {
	    int i = -30 % ((arg0 - 14) / 50);
	    if ((anInt1831-- ^ 0xffffffff) == -1) {
		method2109(25266);
		anInt1831 = 255;
	    }
	    anInt1827++;
	    //return anIntArray1829[anInt1831];
        return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"om.B(" + arg0 + ')');
	}
    }
    
    public static void method2108(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    if (arg3 != 256)
		aFloat1825 = 1.2923709F;
	    if ((Class149.anInt1988 ^ 0xffffffff) >= (arg6 ^ 0xffffffff)
		&& arg2 <= Class115.anInt1477
		&& (Class116.anInt1494 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
		&& arg7 <= Class125.anInt1629)
		Class71.method741(arg5, arg4, arg0, arg2, arg6, 122, arg1,
				  arg7);
	    else
		Class146.method2170(arg1, arg7, -1, arg4, arg6, arg0, arg2,
				    arg5);
	    anInt1820++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("om.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public void method2109(int arg0) {
	try {
	    anInt1823++;
	    anInt1821 += ++anInt1826;
	    int i = 0;
	    if (arg0 == 25266) {
		for (/**/; (i ^ 0xffffffff) > -257; i++) {
		    int i_10_ = anIntArray1830[i];
		    if ((0x2 & i ^ 0xffffffff) != -1) {
			if ((i & 0x1 ^ 0xffffffff) == -1)
			    anInt1833 ^= anInt1833 << 248932290;
			else
			    anInt1833 ^= anInt1833 >>> -531511440;
		    } else if ((0x1 & i ^ 0xffffffff) == -1)
			anInt1833 ^= anInt1833 << -280570323;
		    else
			anInt1833 ^= anInt1833 >>> 1270579814;
		    anInt1833 += anIntArray1830[i + 128 & 0xff];
		    int i_11_;
		    anIntArray1830[i] = i_11_
			= ((anIntArray1830
			    [Class90.method841(i_10_ >> -1584711134, 255)])
			   + anInt1833 + anInt1821);
		    anIntArray1829[i] = anInt1821
			= i_10_ + (anIntArray1830
				   [Class90.method841(i_11_ >> -924221176,
						      1020) >> -1628785982]);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"om.C(" + arg0 + ')');
	}
    }
    
    public Cryption() {
	/* empty */
    }
    
    public Cryption(int[] arg0) {
	try {
	    anIntArray1829 = new int[256];
	    anIntArray1830 = new int[256];
	    for (int i = 0; (i ^ 0xffffffff) > (arg0.length ^ 0xffffffff); i++)
		anIntArray1829[i] = arg0[i];
	    method2106(-2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("om.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
