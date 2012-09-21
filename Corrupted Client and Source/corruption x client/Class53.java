/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53
{
    public static int[] anIntArray699 = new int[2];
    public static int anInt700;
    public static int anInt701;
    public static byte[][] aByteArrayArray702 = new byte[250][];
    public static Class119 aClass119_703;
    public static int anInt704;
    public static int anInt705;
    public static String aString706
	= "You can't add yourself to your own friend list.";
    public static Class44 aClass44_707;
    public static int anInt708;
    
    public static boolean method602(Class94 arg0, Class130 arg1, int arg2,
				    Class131_Sub20 arg3, int arg4, int arg5) {
	try {
	    anInt701++;
	    if (arg4 != -155)
		return true;
	    int i = 2147483647;
	    int i_0_ = -2147483648;
	    int i_1_ = 2147483647;
	    int i_2_ = -2147483648;
	    if (arg0.anIntArray1269 != null) {
		i = (Class127.anInt1737
		     + ((arg0.anInt1267
			 - (-arg3.anInt4419 + Class127.anInt1726))
			* (-Class127.anInt1737 + Class127.anInt1718)
			/ (-Class127.anInt1726 + Class127.anInt1736)));
		i_1_ = (Class127.anInt1719
			+ -((Class127.anInt1719 - Class127.anInt1722)
			    * (-Class127.anInt1724
			       + (arg0.anInt1259 - -arg3.anInt4426))
			    / (Class127.anInt1723 - Class127.anInt1724)));
		i_2_ = (Class127.anInt1719
			- ((-Class127.anInt1722 + Class127.anInt1719)
			   * (arg3.anInt4426 + arg0.anInt1252
			      - Class127.anInt1724)
			   / (Class127.anInt1723 + -Class127.anInt1724)));
		i_0_ = (Class127.anInt1737
			+ ((-Class127.anInt1737 + Class127.anInt1718)
			   * (arg0.anInt1236 - -arg3.anInt4419
			      - Class127.anInt1726)
			   / (-Class127.anInt1726 + Class127.anInt1736)));
	    }
	    Class152 class152 = null;
	    int i_3_ = 0;
	    int i_4_ = 0;
	    int i_5_ = 0;
	    int i_6_ = 0;
	    if (arg0.anInt1266 != -1) {
		if (arg3.aBoolean4418 && arg0.anInt1253 != -1)
		    class152 = arg0.method855(-4379, true, arg1);
		else
		    class152 = arg0.method855(-4379, false, arg1);
		if (class152 != null) {
		    i_3_ = arg3.anInt4428 - (1 + class152.method2216()
					     >> 1305174305);
		    i_4_ = arg3.anInt4428 - -(class152.method2216() + 1
					      >> 530685761);
		    if (i > i_3_)
			i = i_3_;
		    if ((i_4_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
			i_0_ = i_4_;
		    i_5_ = arg3.anInt4429 - (class152.method2198() - -1
					     >> 708825441);
		    if (i_1_ > i_5_)
			i_1_ = i_5_;
		    i_6_ = arg3.anInt4429 + (1 + class152.method2198()
					     >> 1353974337);
		    if ((i_6_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
			i_2_ = i_6_;
		}
	    }
	    Class140 class140 = null;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    int i_12_ = 0;
	    int i_13_ = 0;
	    if (arg0.aString1235 != null) {
		class140 = Class167.method2431(-83, arg0.anInt1256);
		if (class140 != null) {
		    i_7_
			= Class169.aClass55_2269.method620(null, -91,
							   arg0.aString1235,
							   (Class1_Sub2
							    .aStringArray3509),
							   null);
		    i_8_ = arg3.anInt4429;
		    if (class152 != null)
			i_8_ -= ((class152.method2198() >> -118537951)
				 - -(class140.method2127() * i_7_));
		    else
			i_8_ -= class140.method2132() * i_7_ / 2;
		    for (int i_14_ = 0;
			 (i_7_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
			String string = Class1_Sub2.aStringArray3509[i_14_];
			if (i_7_ + -1 > i_14_)
			    string = string.substring(0, -4 + string.length());
			int i_15_ = class140.method2131(string);
			if (i_9_ < i_15_)
			    i_9_ = i_15_;
		    }
		    i_10_ = arg5 + (-(i_9_ / 2) + arg3.anInt4428);
		    i_11_ = arg3.anInt4428 + (i_9_ / 2 + arg5);
		    if (i > i_10_)
			i = i_10_;
		    if (i_11_ > i_0_)
			i_0_ = i_11_;
		    i_12_ = arg2 + i_8_;
		    i_13_ = arg2 + class140.method2127() * i_7_ + i_8_;
		    if (i_1_ > i_12_)
			i_1_ = i_12_;
		    if ((i_13_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
			i_2_ = i_13_;
		}
	    }
	    if (Class127.anInt1737 > i_0_
		|| (Class127.anInt1718 ^ 0xffffffff) > (i ^ 0xffffffff)
		|| (Class127.anInt1722 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)
		|| (i_1_ ^ 0xffffffff) < (Class127.anInt1719 ^ 0xffffffff))
		return true;
	    if (arg0.anIntArray1269 != null) {
		int[] is = new int[arg0.anIntArray1269.length];
		for (int i_16_ = 0; i_16_ < is.length / 2; i_16_++) {
		    int i_17_
			= arg0.anIntArray1269[i_16_ * 2] + arg3.anInt4419;
		    int i_18_
			= arg3.anInt4426 + arg0.anIntArray1269[1 + i_16_ * 2];
		    is[i_16_ * 2]
			= (((-Class127.anInt1726 + i_17_)
			    * (-Class127.anInt1737 + Class127.anInt1718)
			    / (-Class127.anInt1726 + Class127.anInt1736))
			   + Class127.anInt1737);
		    is[2 * i_16_ + 1]
			= (-((Class127.anInt1719 - Class127.anInt1722)
			     * (i_18_ - Class127.anInt1724)
			     / (Class127.anInt1723 + -Class127.anInt1724))
			   + Class127.anInt1719);
		}
		Class123.method1079(arg1, is, arg0.anInt1247);
		for (int i_19_ = 0; -1 + is.length / 2 > i_19_; i_19_++)
		    arg1.method1195(true, is[1 + (2 * i_19_ + 2)],
				    is[(1 + i_19_) * 2], is[2 * i_19_ + 1],
				    is[2 * i_19_], arg0.anInt1263);
		arg1.method1195(true, is[1], is[0], is[-1 + is.length],
				is[-2 + is.length], arg0.anInt1263);
	    }
	    if (class152 != null) {
		if ((Class131_Sub7.anInt4173 ^ 0xffffffff) < -1
		    && (((Class165.anInt2200 ^ 0xffffffff) != 0
			 && arg3.anInt4427 == Class165.anInt2200)
			|| (Class131_Sub41_Sub17.anInt6390 != -1
			    && (arg0.anInt1262
				== Class131_Sub41_Sub17.anInt6390)))) {
		    int i_20_;
		    if (Class151.anInt2019 <= 50)
			i_20_ = 2 * Class151.anInt2019;
		    else
			i_20_ = (-Class151.anInt2019 + 100) * 2;
		    int i_21_ = i_20_ << -1440888616 | 0xffff00;
		    arg1.method1243(arg3.anInt4429, i_21_, arg3.anInt4428,
				    class152.method2206() / 2 + 7,
				    (byte) -127);
		    arg1.method1243(arg3.anInt4429, i_21_, arg3.anInt4428,
				    5 + class152.method2206() / 2,
				    (byte) -125);
		    arg1.method1243(arg3.anInt4429, i_21_, arg3.anInt4428,
				    3 + class152.method2206() / 2, (byte) 47);
		    arg1.method1243(arg3.anInt4429, i_21_, arg3.anInt4428,
				    class152.method2206() / 2 - -1,
				    (byte) -125);
		    arg1.method1243(arg3.anInt4429, i_21_, arg3.anInt4428,
				    class152.method2206() / 2, (byte) -125);
		}
		class152.method2211(arg3.anInt4428 - (class152.method2216()
						      >> 1723547617),
				    arg3.anInt4429 + -(class152.method2198()
						       >> -958383295));
	    }
	    if (arg0.aString1235 != null && class140 != null)
		InputStream_Sub1.method79(i_8_, arg1, i_9_, (byte) 38, i_7_,
					  arg3, class140, arg0);
	    if (arg0.anInt1266 != -1 || arg0.aString1235 != null) {
		Class131_Sub42 class131_sub42 = new Class131_Sub42(arg3);
		class131_sub42.anInt4681 = i_5_;
		class131_sub42.anInt4684 = i_3_;
		class131_sub42.anInt4690 = i_6_;
		class131_sub42.anInt4679 = i_12_;
		class131_sub42.anInt4682 = i_11_;
		class131_sub42.anInt4687 = i_4_;
		class131_sub42.anInt4680 = i_13_;
		class131_sub42.anInt4678 = i_10_;
		Class74.aClass119_1011.method1018((byte) -123, class131_sub42);
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fb.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ arg5 + ')'));
	}
    }
    
    public static int method603(boolean arg0, int arg1, int arg2) {
	try {
	    anInt705++;
	    int i = 57 * arg1 + arg2;
	    i = i << 827586445 ^ i;
	    if (arg0 != false)
		aClass44_707 = null;
	    int i_22_
		= 0x7fffffff & (i * i * 15731 + 789221) * i - -1376312589;
	    return (i_22_ & 0x7ff0514) >> -1512371629;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fb.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class31 method604(byte arg0, int arg1) {
	try {
	    anInt704++;
	    Class31 class31 = (Class31) Class131_Sub2_Sub15.aClass214_5775
					    .method2780(118, (long) arg1);
	    if (class31 != null)
		return class31;
	    byte[] is = Cryption.aClass158_1832.method2364(arg1, 0, 0);
	    class31 = new Class31();
	    if (is != null)
		class31.method441(new Stream(is), true);
	    class31.method437((byte) 109);
	    Class131_Sub2_Sub15.aClass214_5775.method2773(true, class31,
							  (long) arg1);
	    if (arg0 <= 115)
		aClass44_707 = null;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fb.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static short[] method605(short[] arg0, int arg1) {
	try {
	    anInt700++;
	    if (arg0 == null)
		return null;
	    short[] is = new short[arg0.length];
	    if (arg1 <= 20)
		method606((byte) 89);
	    Class61.method655(arg0, 0, is, 0, arg0.length);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fb.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method606(byte arg0) {
	aString706 = null;
	aClass44_707 = null;
	anIntArray699 = null;
	aByteArrayArray702 = null;
	aClass119_703 = null;
	if (arg0 <= 69)
	    method602(null, null, 127, null, -123, -13);
    }
    
    static {
	aClass119_703 = new Class119();
	anInt708 = -1;
    }
}
