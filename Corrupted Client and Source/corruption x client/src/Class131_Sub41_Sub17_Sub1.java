/* Class131_Sub41_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub17_Sub1 extends Class131_Sub41_Sub17
{
    public static int anInt6562;
    public static Class158 aClass158_6563;
    public static int anInt6564;
    public static int anInt6565;
    public static int anInt6566 = 0;
    public static int anInt6567;
    public static int anInt6568;
    public Object anObject6569;
    public static String[] aStringArray6570 = new String[100];
    public static int anInt6571;
    public static int anInt6572 = 0;
    public static int anInt6573 = 0;
    
    public static int method2048(int arg0) {
	try {
	    anInt6567++;
	    if (Class64.aBoolean814)
		return 0;
	    if (arg0 != 28804)
		aClass158_6563 = null;
	    if (!Class9.method182((byte) 118))
		return 1;
	    if (Class91.aBoolean1180)
		return 2;
	    return 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"a.I(" + arg0 + ')');
	}
    }
    
    public Object method2044(int arg0) {
	try {
	    anInt6568++;
	    if (arg0 != 27816)
		return null;
	    return anObject6569;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"a.B(" + arg0 + ')');
	}
    }
    
    public static void method2049(int arg0) {
	try {
	    if (arg0 == 256) {
		anInt6571++;
		if (Class131_Sub2_Sub37.anIntArray6058 == null)
		    Class131_Sub2_Sub37.anIntArray6058 = new int[65536];
		else
		    return;
		double d = 0.03 * Math.random() - 0.015 + 0.7;
		for (int i = 0; i < 65536; i++) {
		    double d_0_
			= 0.0078125 + (double) (0x3f & i >> -160257910) / 64.0;
		    double d_1_
			= (double) ((i & 0x3cb) >> 1928712359) / 8.0 + 0.0625;
		    double d_2_ = (double) (0x7f & i) / 128.0;
		    double d_3_ = d_2_;
		    double d_4_ = d_2_;
		    double d_5_ = d_2_;
		    if (d_1_ != 0.0) {
			double d_6_;
			if (d_2_ < 0.5)
			    d_6_ = (d_1_ + 1.0) * d_2_;
			else
			    d_6_ = d_1_ + d_2_ - d_1_ * d_2_;
			double d_7_ = d_2_ * 2.0 - d_6_;
			double d_8_ = d_0_ + 0.3333333333333333;
			if (d_8_ > 1.0)
			    d_8_--;
			double d_9_ = d_0_;
			double d_10_ = d_0_ - 0.3333333333333333;
			if (6.0 * d_9_ < 1.0)
			    d_4_ = d_7_ + d_9_ * (6.0 * (d_6_ - d_7_));
			else if (!(d_9_ * 2.0 < 1.0)) {
			    if (!(3.0 * d_9_ < 2.0))
				d_4_ = d_7_;
			    else
				d_4_ = ((-d_9_ + 0.6666666666666666)
					* (-d_7_ + d_6_) * 6.0) + d_7_;
			} else
			    d_4_ = d_6_;
			if (6.0 * d_8_ < 1.0)
			    d_3_ = 6.0 * (-d_7_ + d_6_) * d_8_ + d_7_;
			else if (!(2.0 * d_8_ < 1.0)) {
			    if (!(3.0 * d_8_ < 2.0))
				d_3_ = d_7_;
			    else
				d_3_ = (d_6_ - d_7_) * (0.6666666666666666
							- d_8_) * 6.0 + d_7_;
			} else
			    d_3_ = d_6_;
			if (d_10_ < 0.0)
			    d_10_++;
			if (6.0 * d_10_ < 1.0)
			    d_5_ = 6.0 * (d_6_ - d_7_) * d_10_ + d_7_;
			else if (d_10_ * 2.0 < 1.0)
			    d_5_ = d_6_;
			else if (!(3.0 * d_10_ < 2.0))
			    d_5_ = d_7_;
			else
			    d_5_ = ((-d_10_ + 0.6666666666666666)
				    * (-d_7_ + d_6_) * 6.0) + d_7_;
		    }
		    d_3_ = Math.pow(d_3_, d);
		    d_4_ = Math.pow(d_4_, d);
		    d_5_ = Math.pow(d_5_, d);
		    int i_11_ = (int) (256.0 * d_3_);
		    int i_12_ = (int) (256.0 * d_4_);
		    int i_13_ = (int) (256.0 * d_5_);
		    int i_14_
			= (i_11_ << 899648464) + (i_12_ << 896805768) - -i_13_;
		    Class131_Sub2_Sub37.anIntArray6058[i] = i_14_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"a.F(" + arg0 + ')');
	}
    }
    
    public static void method2050(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    int i = -65 / ((-75 - arg2) / 41);
	    anInt6565++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(10, arg4, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg1;
	    class131_sub41_sub6.anInt6234 = arg3;
	    class131_sub41_sub6.anInt6236 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("a.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2051(byte arg0) {
	try {
	    if (arg0 == -87) {
		aClass158_6563 = null;
		aStringArray6570 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"a.G(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub17_Sub1(Object arg0) {
	try {
	    anObject6569 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("a.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method2047(int arg0) {
	try {
	    if (arg0 >= -92)
		aStringArray6570 = null;
	    anInt6564++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"a.A(" + arg0 + ')');
	}
    }
}
