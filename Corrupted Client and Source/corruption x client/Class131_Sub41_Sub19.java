/* Class131_Sub41_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub19 extends Class131_Sub41
{
    public int[] anIntArray6405;
    public static int anInt6406;
    public static int[][] anIntArrayArray6407;
    public static String aString6408;
    public Class131_Sub2 aClass131_Sub2_6409;
    public Class131_Sub2 aClass131_Sub2_6410;
    public static int anInt6411;
    public static byte[][] aByteArrayArray6412;
    public static boolean aBoolean6413 = false;
    public static int anInt6414 = 0;
    public static int anInt6415;
    public int[] anIntArray6416;
    public Class131_Sub2[] aClass131_Sub2Array6417;
    public static int anInt6418;
    public Class131_Sub2 aClass131_Sub2_6419;
    public static int anInt6420;
    public static int anInt6421;
    public static int anInt6422;
    
    public int[] method2057(int arg0, Interface4 arg1, boolean arg2,
			    double arg3, int arg4, Class158 arg5, byte arg6) {
	try {
	    if (arg6 != -37)
		aClass131_Sub2_6409 = null;
	    Class131_Sub2_Sub9.aClass158_5683 = arg5;
	    Class63.anInterface4_793 = arg1;
	    anInt6422++;
	    for (int i = 0; i < aClass131_Sub2Array6417.length; i++)
		aClass131_Sub2Array6417[i].method1461(-94, arg0, arg4);
	    Class137.method2114(true, arg3);
	    Class23_Sub4.method324(arg0, arg4, 100);
	    int[] is = new int[4 * (arg0 * arg4)];
	    int i = 0;
	    for (int i_0_ = 0; (arg0 ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
		 i_0_++) {
		int[] is_1_;
		int[] is_2_;
		int[] is_3_;
		if (aClass131_Sub2_6409.aBoolean4093) {
		    int[] is_4_ = aClass131_Sub2_6409.method1466(-11543, i_0_);
		    is_2_ = is_4_;
		    is_3_ = is_4_;
		    is_1_ = is_4_;
		} else {
		    int[][] is_5_ = aClass131_Sub2_6409.method1462(i_0_, 0);
		    is_1_ = is_5_[0];
		    is_2_ = is_5_[2];
		    is_3_ = is_5_[1];
		}
		if (arg2)
		    i = i_0_;
		int[] is_6_;
		if (aClass131_Sub2_6410.aBoolean4093)
		    is_6_ = aClass131_Sub2_6410.method1466(-11543, i_0_);
		else
		    is_6_ = (aClass131_Sub2_6410.method1462(i_0_, arg6 ^ ~0x24)
			     [0]);
		for (int i_7_ = arg4 + -1; (i_7_ ^ 0xffffffff) <= -1; i_7_--) {
		    int i_8_ = is_1_[i_7_] >> -337448540;
		    if ((i_8_ ^ 0xffffffff) < -256)
			i_8_ = 255;
		    if ((i_8_ ^ 0xffffffff) > -1)
			i_8_ = 0;
		    int i_9_ = is_3_[i_7_] >> -190652988;
		    if (i_9_ > 255)
			i_9_ = 255;
		    if ((i_9_ ^ 0xffffffff) > -1)
			i_9_ = 0;
		    int i_10_ = is_2_[i_7_] >> 393908068;
		    if ((i_10_ ^ 0xffffffff) < -256)
			i_10_ = 255;
		    i_9_ = Class17.anIntArray185[i_9_];
		    i_8_ = Class17.anIntArray185[i_8_];
		    if ((i_10_ ^ 0xffffffff) > -1)
			i_10_ = 0;
		    i_10_ = Class17.anIntArray185[i_10_];
		    int i_11_;
		    if ((i_8_ ^ 0xffffffff) == -1 && (i_9_ ^ 0xffffffff) == -1
			&& (i_10_ ^ 0xffffffff) == -1)
			i_11_ = 0;
		    else {
			i_11_ = is_6_[i_7_] >> 1488653028;
			if ((i_11_ ^ 0xffffffff) < -256)
			    i_11_ = 255;
			if (i_11_ < 0)
			    i_11_ = 0;
		    }
		    is[i++] = ((i_9_ << -1566528280) + (i_8_ << 2114904976)
			       + (i_11_ << -93646664) + i_10_);
		    if (arg2)
			i += arg4 + -1;
		}
	    }
	    for (int i_12_ = 0;
		 ((i_12_ ^ 0xffffffff)
		  > (aClass131_Sub2Array6417.length ^ 0xffffffff));
		 i_12_++)
		aClass131_Sub2Array6417[i_12_].method1460(arg6 ^ ~0x2b);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wh.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method2058(Class173 arg0, boolean arg1, int arg2,
				  int arg3) {
	anInt6411++;
	Class103.anInt1337 = arg3;
	Class78.anInt1052 = arg2;
	Class193.aClass173_2836 = arg0;
	if (arg1 != true)
	    anInt6414 = 116;
    }
    
    public float[] method2059(Class158 arg0, int arg1, int arg2,
			      Interface4 arg3, int arg4, boolean arg5) {
	try {
	    Class131_Sub2_Sub9.aClass158_5683 = arg0;
	    anInt6415++;
	    Class63.anInterface4_793 = arg3;
	    for (int i = 0; (i ^ 0xffffffff) > (aClass131_Sub2Array6417.length
						^ 0xffffffff); i++)
		aClass131_Sub2Array6417[i].method1461(74, arg4, arg1);
	    Class23_Sub4.method324(arg4, arg1, 73);
	    float[] fs = new float[4 * (arg4 * arg1)];
	    if (arg2 <= 119)
		anInt6418 = -67;
	    int i = 0;
	    for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (arg4 ^ 0xffffffff);
		 i_13_++) {
		int[] is;
		int[] is_14_;
		int[] is_15_;
		if (aClass131_Sub2_6409.aBoolean4093) {
		    int[] is_16_
			= aClass131_Sub2_6409.method1466(-11543, i_13_);
		    is = is_16_;
		    is_15_ = is_16_;
		    is_14_ = is_16_;
		} else {
		    int[][] is_17_ = aClass131_Sub2_6409.method1462(i_13_, 0);
		    is = is_17_[1];
		    is_14_ = is_17_[2];
		    is_15_ = is_17_[0];
		}
		int[] is_18_;
		if (aClass131_Sub2_6410.aBoolean4093)
		    is_18_ = aClass131_Sub2_6410.method1466(-11543, i_13_);
		else
		    is_18_ = aClass131_Sub2_6410.method1462(i_13_, 0)[0];
		if (arg5)
		    i = i_13_ << -1718064414;
		int[] is_19_;
		if (aClass131_Sub2_6419.aBoolean4093)
		    is_19_ = aClass131_Sub2_6419.method1466(-11543, i_13_);
		else
		    is_19_ = aClass131_Sub2_6419.method1462(i_13_, 0)[0];
		for (int i_20_ = arg1 + -1; i_20_ >= 0; i_20_--) {
		    float f = (float) is_18_[i_20_] / 4096.0F;
		    if (!(f < 0.0F)) {
			if (f > 1.0F)
			    f = 1.0F;
		    } else
			f = 0.0F;
		    float f_21_
			= (((float) is_19_[i_20_] * 31.0F / 4096.0F + 1.0F)
			   / 4096.0F);
		    fs[i++] = (float) is_15_[i_20_] * f_21_;
		    fs[i++] = (float) is[i_20_] * f_21_;
		    fs[i++] = (float) is_14_[i_20_] * f_21_;
		    fs[i++] = f;
		    if (arg5)
			i += (arg1 << 2138163746) + -4;
		}
	    }
	    for (int i_22_ = 0; i_22_ < aClass131_Sub2Array6417.length;
		 i_22_++)
		aClass131_Sub2Array6417[i_22_].method1460(15);
	    return fs;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wh.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method2060(int arg0, int arg1) {
	try {
	    anInt6420++;
	    if (arg0 < arg1 || (arg0 ^ 0xffffffff) < -3)
		arg0 = 0;
	    Class82.anInt1085 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wh.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method2061(int arg0, Interface4 arg1, Class158 arg2) {
	try {
	    anInt6406++;
	    if (Class104.anInt1365 > 0) {
		for (int i = 0; anIntArray6405.length > i; i++) {
		    if (!arg2.method2354(anIntArray6405[i], Class104.anInt1365,
					 111))
			return false;
		}
	    } else {
		for (int i = 0; i < anIntArray6405.length; i++) {
		    if (!arg2.method2343(-110, anIntArray6405[i]))
			return false;
		}
	    }
	    for (int i = 0; anIntArray6416.length > i; i++) {
		if (!arg1.method11(false, anIntArray6416[i]))
		    return false;
	    }
	    if (arg0 <= 120)
		return true;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wh.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2062(boolean arg0) {
	try {
	    if (arg0 != true)
		method2060(88, -43);
	    aByteArrayArray6412 = null;
	    anIntArrayArray6407 = null;
	    aString6408 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wh.C(" + arg0 + ')');
	}
    }
    
    public int[] method2063(boolean arg0, int arg1, double arg2, int arg3,
			    Class158 arg4, Interface4 arg5, boolean arg6,
			    boolean arg7) {
	try {
	    anInt6421++;
	    Class63.anInterface4_793 = arg5;
	    Class131_Sub2_Sub9.aClass158_5683 = arg4;
	    for (int i = 0; aClass131_Sub2Array6417.length > i; i++)
		aClass131_Sub2Array6417[i].method1461(-107, arg1, arg3);
	    Class137.method2114(!arg0, arg2);
	    Class23_Sub4.method324(arg1, arg3, 43);
	    int[] is = new int[arg3 * arg1];
	    int i;
	    int i_23_;
	    int i_24_;
	    if (arg7) {
		i_24_ = -1;
		i_23_ = -1;
		i = -1 + arg3;
	    } else {
		i = 0;
		i_23_ = arg3;
		i_24_ = 1;
	    }
	    int i_25_ = 0;
	    for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (arg1 ^ 0xffffffff);
		 i_26_++) {
		if (arg6)
		    i_25_ = i_26_;
		int[] is_27_;
		int[] is_28_;
		int[] is_29_;
		if (aClass131_Sub2_6409.aBoolean4093) {
		    int[] is_30_
			= aClass131_Sub2_6409.method1466(-11543, i_26_);
		    is_29_ = is_30_;
		    is_27_ = is_30_;
		    is_28_ = is_30_;
		} else {
		    int[][] is_31_ = aClass131_Sub2_6409.method1462(i_26_, 0);
		    is_27_ = is_31_[1];
		    is_28_ = is_31_[2];
		    is_29_ = is_31_[0];
		}
		for (int i_32_ = i; i_32_ != i_23_; i_32_ += i_24_) {
		    int i_33_ = is_29_[i_32_] >> 1726339812;
		    if (i_33_ > 255)
			i_33_ = 255;
		    if (i_33_ < 0)
			i_33_ = 0;
		    int i_34_ = is_27_[i_32_] >> 1465017092;
		    if (i_34_ > 255)
			i_34_ = 255;
		    if (i_34_ < 0)
			i_34_ = 0;
		    int i_35_ = is_28_[i_32_] >> -2053801660;
		    if (i_35_ > 255)
			i_35_ = 255;
		    i_34_ = Class17.anIntArray185[i_34_];
		    if (i_35_ < 0)
			i_35_ = 0;
		    i_33_ = Class17.anIntArray185[i_33_];
		    i_35_ = Class17.anIntArray185[i_35_];
		    int i_36_ = (i_35_ + (i_34_ << 663693704)
				 + (i_33_ << -1383312112));
		    if ((i_36_ ^ 0xffffffff) != -1)
			i_36_ |= ~0xffffff;
		    is[i_25_++] = i_36_;
		    if (arg6)
			i_25_ += arg3 + -1;
		}
	    }
	    for (int i_37_ = 0; aClass131_Sub2Array6417.length > i_37_;
		 i_37_++)
		aClass131_Sub2Array6417[i_37_].method1460(15);
	    if (arg0 != false)
		aString6408 = null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("wh.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ')'));
	}
    }
    
    public Class131_Sub41_Sub19() {
	try {
	    anIntArray6416 = new int[0];
	    anIntArray6405 = new int[0];
	    aClass131_Sub2_6419 = new Class131_Sub2_Sub4(0);
	    aClass131_Sub2_6419.anInt4090 = 1;
	    aClass131_Sub2_6409 = new Class131_Sub2_Sub4();
	    aClass131_Sub2_6409.anInt4090 = 1;
	    aClass131_Sub2_6410 = new Class131_Sub2_Sub4();
	    aClass131_Sub2Array6417
		= new Class131_Sub2[] { aClass131_Sub2_6409,
					aClass131_Sub2_6410,
					aClass131_Sub2_6419 };
	    aClass131_Sub2_6410.anInt4090 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wh.<init>(" + ')');
	}
    }
    
    public Class131_Sub41_Sub19(Stream arg0) {
	try {
	    int i = arg0.readUnsignedByte(112);
	    int i_38_ = 0;
	    int i_39_ = 0;
	    int[][] is = new int[i][];
	    aClass131_Sub2Array6417 = new Class131_Sub2[i];
	    for (int i_40_ = 0; i_40_ < i; i_40_++) {
		Class131_Sub2 class131_sub2
		    = Class131_Sub41.method1917(0, arg0);
		if (class131_sub2.method1456((byte) 122) >= 0)
		    i_38_++;
		if ((class131_sub2.method1454(-3) ^ 0xffffffff) <= -1)
		    i_39_++;
		int i_41_ = class131_sub2.aClass131_Sub2Array4101.length;
		is[i_40_] = new int[i_41_];
		for (int i_42_ = 0;
		     (i_41_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++)
		    is[i_40_][i_42_] = arg0.readUnsignedByte(105);
		aClass131_Sub2Array6417[i_40_] = class131_sub2;
	    }
	    anIntArray6405 = new int[i_38_];
	    i_38_ = 0;
	    anIntArray6416 = new int[i_39_];
	    i_39_ = 0;
	    for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_43_++) {
		Class131_Sub2 class131_sub2 = aClass131_Sub2Array6417[i_43_];
		int i_44_ = class131_sub2.aClass131_Sub2Array4101.length;
		for (int i_45_ = 0;
		     (i_44_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++)
		    class131_sub2.aClass131_Sub2Array4101[i_45_]
			= aClass131_Sub2Array6417[is[i_43_][i_45_]];
		int i_46_ = class131_sub2.method1456((byte) 117);
		int i_47_ = class131_sub2.method1454(-3);
		if ((i_46_ ^ 0xffffffff) < -1)
		    anIntArray6405[i_38_++] = i_46_;
		if ((i_47_ ^ 0xffffffff) < -1)
		    anIntArray6416[i_39_++] = i_47_;
		is[i_43_] = null;
	    }
	    aClass131_Sub2_6409
		= aClass131_Sub2Array6417[arg0.readUnsignedByte(-85)];
	    aClass131_Sub2_6410 = aClass131_Sub2Array6417[arg0.readUnsignedByte(97)];
	    aClass131_Sub2_6419
		= aClass131_Sub2Array6417[arg0.readUnsignedByte(-54)];
	    Object object = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wh.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
