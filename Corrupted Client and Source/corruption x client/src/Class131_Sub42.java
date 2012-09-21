/* Class131_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub42 extends Class131
{
    public int anInt4678;
    public int anInt4679 = 2147483647;
    public int anInt4680 = -2147483648;
    public int anInt4681;
    public int anInt4682;
    public static int anInt4683;
    public int anInt4684;
    public static int anInt4685;
    public static int anInt4686;
    public int anInt4687;
    public static Class88 aClass88_4688;
    public Class131_Sub20 aClass131_Sub20_4689;
    public int anInt4690;
    public static int anInt4691;
    public static volatile int anInt4692 = 0;
    public static int anInt4693;
    public static int anInt4694;
    
    public static void method2086(int arg0, byte arg1, int[] arg2, int[] arg3,
				  int arg4) {
	try {
	    if ((arg4 ^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
		int i = (arg4 + arg0) / 2;
		int i_0_ = arg0;
		int i_1_ = arg3[i];
		arg3[i] = arg3[arg4];
		arg3[arg4] = i_1_;
		int i_2_ = arg2[i];
		arg2[i] = arg2[arg4];
		arg2[arg4] = i_2_;
		for (int i_3_ = arg0; arg4 > i_3_; i_3_++) {
		    if (((i_3_ & 0x1) + i_1_ ^ 0xffffffff)
			< (arg3[i_3_] ^ 0xffffffff)) {
			int i_4_ = arg3[i_3_];
			arg3[i_3_] = arg3[i_0_];
			arg3[i_0_] = i_4_;
			int i_5_ = arg2[i_3_];
			arg2[i_3_] = arg2[i_0_];
			arg2[i_0_++] = i_5_;
		    }
		}
		arg3[arg4] = arg3[i_0_];
		arg3[i_0_] = i_1_;
		arg2[arg4] = arg2[i_0_];
		arg2[i_0_] = i_2_;
		method2086(arg0, (byte) 127, arg2, arg3, -1 + i_0_);
		method2086(1 + i_0_, (byte) 16, arg2, arg3, arg4);
	    }
	    if (arg1 >= 2)
		anInt4686++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wc.D(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2087(long arg0, byte arg1) {
	try {
	    if (arg1 <= 23)
		aClass88_4688 = null;
	    anInt4683++;
	    int i = Class23_Sub2_Sub2.anInt5169;
	    int i_6_ = Class50.anInt657;
	    if (Class131_Sub41_Sub9.anInt6275 != i) {
		int i_7_ = -Class131_Sub41_Sub9.anInt6275 + i;
		int i_8_ = (int) ((long) i_7_ * arg0 / 320L);
		if (i_7_ > 0) {
		    if (i_8_ != 0) {
			if ((i_8_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
			    i_8_ = i_7_;
		    } else
			i_8_ = 1;
		} else if (i_8_ != 0) {
		    if ((i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
			i_8_ = i_7_;
		} else
		    i_8_ = -1;
		Class131_Sub41_Sub9.anInt6275 += i_8_;
	    }
	    if (!Class131_Sub6.aBoolean4143) {
		Class23_Sub1_Sub1.aFloat5082
		    += 8.0F * ((float) arg0 * Cryption.aFloat1825 / 40.0F);
		Class120.aFloat1578
		    += Class131_Sub18.aFloat4378 * (float) arg0 / 40.0F * 8.0F;
	    }
	    if (i_6_ != Class131_Sub3.anInt4126) {
		int i_9_ = -Class131_Sub3.anInt4126 + i_6_;
		int i_10_ = (int) (arg0 * (long) i_9_ / 320L);
		if ((i_9_ ^ 0xffffffff) >= -1) {
		    if (i_10_ == 0)
			i_10_ = -1;
		    else if (i_9_ > i_10_)
			i_10_ = i_9_;
		} else if (i_10_ != 0) {
		    if (i_10_ > i_9_)
			i_10_ = i_9_;
		} else
		    i_10_ = 1;
		Class131_Sub3.anInt4126 += i_10_;
	    }
	    Class172.method2450(-4);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wc.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method2088(int arg0, int arg1, int arg2) {
	try {
	    anInt4694++;
	    if ((arg2 ^ 0xffffffff) <= (anInt4684 ^ 0xffffffff)
		&& anInt4687 >= arg2
		&& (anInt4681 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
		&& arg1 <= anInt4690)
		return true;
	    if ((anInt4678 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) >= (anInt4682 ^ 0xffffffff)
		&& anInt4679 <= arg1 && anInt4680 >= arg1)
		return true;
	    if (arg0 > -104)
		return false;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wc.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static byte[] method2089(byte[] arg0, byte arg1) {
	try {
	    anInt4691++;
	    int i = arg0.length;
	    if (arg1 > -123)
		anInt4692 = 49;
	    byte[] is = new byte[i];
	    Class61.method652(arg0, 0, is, 0, i);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wc.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static String method2090(String arg0, String arg1, String arg2,
				    int arg3) {
	try {
	    anInt4693++;
	    if (arg3 != 0)
		anInt4685 = 4;
	    for (int i = arg0.indexOf(arg1); i != -1;
		 i = arg0.indexOf(arg1, arg2.length() + i))
		arg0 = (arg0.substring(0, i) + arg2
			+ arg0.substring(arg1.length() + i));
	    return arg0;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method2091(int arg0) {
	try {
	    if (arg0 == 320)
		aClass88_4688 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wc.F(" + arg0 + ')');
	}
    }
    
    public Class131_Sub42(Class131_Sub20 arg0) {
	anInt4678 = 2147483647;
	anInt4682 = -2147483648;
	anInt4687 = -2147483648;
	anInt4690 = -2147483648;
	anInt4684 = 2147483647;
	anInt4681 = 2147483647;
	try {
	    aClass131_Sub20_4689 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wc.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
