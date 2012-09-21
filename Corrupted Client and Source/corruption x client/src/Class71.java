/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71
{
    public static int anInt938;
    public int anInt939;
    public int anInt940;
    public int[][] anIntArrayArray941;
    public static int anInt942;
    public static int anInt943;
    public static Class214 aClass214_944 = new Class214(4);
    public static int anInt945;
    public static int anInt946;
    public static int anInt947 = 0;
    public static int anInt948;
    
    public static void method741(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt945++;
	    int i = arg2 - -arg6;
	    int i_0_ = -arg6 + arg7;
	    for (int i_1_ = arg2; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_1_++)
		Class131_Sub3.method1650(arg3,
					 Class56.anIntArrayArray740[i_1_],
					 arg0, arg4, 117);
	    int i_2_ = arg6 + arg4;
	    for (int i_3_ = arg7; (i_3_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
		 i_3_--)
		Class131_Sub3.method1650(arg3,
					 Class56.anIntArrayArray740[i_3_],
					 arg0, arg4, 127);
	    int i_4_ = arg3 + -arg6;
	    int i_5_ = i;
	    int i_6_ = -82 % ((61 - arg5) / 50);
	    for (/**/; (i_5_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff); i_5_++) {
		int[] is = Class56.anIntArrayArray740[i_5_];
		Class131_Sub3.method1650(i_2_, is, arg0, arg4, 86);
		Class131_Sub3.method1650(i_4_, is, arg1, i_2_, 74);
		Class131_Sub3.method1650(arg3, is, arg0, i_4_, 119);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hc.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public byte[] method742(int arg0, byte[] arg1) {
	try {
	    anInt942++;
	    if (anIntArrayArray941 != null) {
		int i = 14 + (int) ((long) anInt939 * (long) arg1.length
				    / (long) anInt940);
		int[] is = new int[i];
		int i_7_ = 0;
		int i_8_ = 0;
		for (int i_9_ = 0;
		     (arg1.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		     i_9_++) {
		    int i_10_ = arg1[i_9_];
		    int[] is_11_ = anIntArrayArray941[i_8_];
		    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -15; i_12_++)
			is[i_7_ - -i_12_] += i_10_ * is_11_[i_12_];
		    i_8_ += anInt939;
		    int i_13_ = i_8_ / anInt940;
		    i_8_ -= i_13_ * anInt940;
		    i_7_ += i_13_;
		}
		arg1 = new byte[i];
		for (int i_14_ = 0; (i ^ 0xffffffff) < (i_14_ ^ 0xffffffff);
		     i_14_++) {
		    int i_15_ = is[i_14_] - -32768 >> -1845615056;
		    if (i_15_ < -128)
			arg1[i_14_] = (byte) -128;
		    else if ((i_15_ ^ 0xffffffff) >= -128)
			arg1[i_14_] = (byte) i_15_;
		    else
			arg1[i_14_] = (byte) 127;
		}
	    }
	    if (arg0 < 6)
		method741(-89, -7, 104, 39, 79, -81, -76, -85);
	    return arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hc.E(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method743(int arg0) {
	try {
	    if (arg0 != 31876)
		method743(53);
	    aClass214_944 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hc.C(" + arg0 + ')');
	}
    }
    
    public int method744(int arg0, int arg1) {
	try {
	    if (anIntArrayArray941 != null)
		arg0 = (int) ((long) anInt939 * (long) arg0 / (long) anInt940);
	    if (arg1 >= -32)
		method741(-66, 45, 96, 51, 103, 58, -19, 3);
	    anInt938++;
	    return arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hc.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method745() {
	Class131_Sub41_Sub21.anInt6448 = 0;
    while_20_:
	for (int i = 0; i < Class23_Sub2_Sub1.anInt4995; i++) {
	    Class203 class203 = Class213.aClass203Array3121[i];
	    if (Class67.anIntArray905 != null) {
		for (int i_16_ = 0; i_16_ < Class67.anIntArray905.length;
		     i_16_++) {
		    if (Class67.anIntArray905[i_16_] != -1000000
			&& (class203.anInt2975 <= Class67.anIntArray905[i_16_]
			    || (class203.anInt2953
				<= Class67.anIntArray905[i_16_]))
			&& ((class203.anInt2954
			     <= Class131_Sub35.anIntArray4578[i_16_])
			    || (class203.anInt2952
				<= Class131_Sub35.anIntArray4578[i_16_]))
			&& (class203.anInt2954 >= Class47.anIntArray642[i_16_]
			    || (class203.anInt2952
				>= Class47.anIntArray642[i_16_]))
			&& ((class203.anInt2961
			     <= Class215.anIntArray3152[i_16_])
			    || (class203.anInt2974
				<= Class215.anIntArray3152[i_16_]))
			&& ((class203.anInt2961
			     >= Class116.anIntArray1518[i_16_])
			    || (class203.anInt2974
				>= Class116.anIntArray1518[i_16_])))
			continue while_20_;
		}
	    }
	    if (class203.anInt2972 == 1) {
		int i_17_ = (class203.anInt2959 - Class210.anInt3063
			     + Class131_Sub2_Sub32.anInt6011);
		if (i_17_ >= 0 && i_17_ <= (Class131_Sub2_Sub32.anInt6011
					    + Class131_Sub2_Sub32.anInt6011)) {
		    int i_18_ = (class203.anInt2958 - Class47.anInt643
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_18_ < 0)
			i_18_ = 0;
		    int i_19_ = (class203.anInt2957 - Class47.anInt643
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_19_ > (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011))
			i_19_ = (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011);
		    boolean bool = false;
		    while (i_18_ <= i_19_) {
			if (Class68.aBooleanArrayArray920[i_17_][i_18_++]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_20_ = Class50.anInt668 - class203.anInt2954;
			if (i_20_ > 32)
			    class203.anInt2971 = 1;
			else {
			    if (i_20_ >= -32)
				continue;
			    class203.anInt2971 = 2;
			    i_20_ = -i_20_;
			}
			class203.anInt2969
			    = ((class203.anInt2961 - Class176.anInt2513 << 8)
			       / i_20_);
			class203.anInt2964
			    = ((class203.anInt2974 - Class176.anInt2513 << 8)
			       / i_20_);
			class203.anInt2970
			    = ((class203.anInt2975 - Class104.anInt1355 << 8)
			       / i_20_);
			class203.anInt2973
			    = ((class203.anInt2953 - Class104.anInt1355 << 8)
			       / i_20_);
			Class131_Sub41_Sub18.aClass203Array6404
			    [Class131_Sub41_Sub21.anInt6448++]
			    = class203;
		    }
		}
	    } else if (class203.anInt2972 == 2) {
		int i_21_ = (class203.anInt2958 - Class47.anInt643
			     + Class131_Sub2_Sub32.anInt6011);
		if (i_21_ >= 0 && i_21_ <= (Class131_Sub2_Sub32.anInt6011
					    + Class131_Sub2_Sub32.anInt6011)) {
		    int i_22_ = (class203.anInt2959 - Class210.anInt3063
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_22_ < 0)
			i_22_ = 0;
		    int i_23_ = (class203.anInt2965 - Class210.anInt3063
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_23_ > (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011))
			i_23_ = (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011);
		    boolean bool = false;
		    while (i_22_ <= i_23_) {
			if (Class68.aBooleanArrayArray920[i_22_++][i_21_]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_24_ = Class176.anInt2513 - class203.anInt2961;
			if (i_24_ > 32)
			    class203.anInt2971 = 3;
			else {
			    if (i_24_ >= -32)
				continue;
			    class203.anInt2971 = 4;
			    i_24_ = -i_24_;
			}
			class203.anInt2955
			    = ((class203.anInt2954 - Class50.anInt668 << 8)
			       / i_24_);
			class203.anInt2960
			    = ((class203.anInt2952 - Class50.anInt668 << 8)
			       / i_24_);
			class203.anInt2970
			    = ((class203.anInt2975 - Class104.anInt1355 << 8)
			       / i_24_);
			class203.anInt2973
			    = ((class203.anInt2953 - Class104.anInt1355 << 8)
			       / i_24_);
			Class131_Sub41_Sub18.aClass203Array6404
			    [Class131_Sub41_Sub21.anInt6448++]
			    = class203;
		    }
		}
	    } else if (class203.anInt2972 == 4) {
		int i_25_ = class203.anInt2975 - Class104.anInt1355;
		if (i_25_ > 128) {
		    int i_26_ = (class203.anInt2958 - Class47.anInt643
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_26_ < 0)
			i_26_ = 0;
		    int i_27_ = (class203.anInt2957 - Class47.anInt643
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_27_ > (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011))
			i_27_ = (Class131_Sub2_Sub32.anInt6011
				 + Class131_Sub2_Sub32.anInt6011);
		    if (i_26_ <= i_27_) {
			int i_28_ = (class203.anInt2959 - Class210.anInt3063
				     + Class131_Sub2_Sub32.anInt6011);
			if (i_28_ < 0)
			    i_28_ = 0;
			int i_29_ = (class203.anInt2965 - Class210.anInt3063
				     + Class131_Sub2_Sub32.anInt6011);
			if (i_29_ > (Class131_Sub2_Sub32.anInt6011
				     + Class131_Sub2_Sub32.anInt6011))
			    i_29_ = (Class131_Sub2_Sub32.anInt6011
				     + Class131_Sub2_Sub32.anInt6011);
			boolean bool = false;
		    while_18_:
			for (int i_30_ = i_28_; i_30_ <= i_29_; i_30_++) {
			    for (int i_31_ = i_26_; i_31_ <= i_27_; i_31_++) {
				if (Class68.aBooleanArrayArray920[i_30_]
				    [i_31_]) {
				    bool = true;
				    break while_18_;
				}
			    }
			}
			if (bool) {
			    class203.anInt2971 = 5;
			    class203.anInt2955
				= ((class203.anInt2954 - Class50.anInt668 << 8)
				   / i_25_);
			    class203.anInt2960
				= ((class203.anInt2952 - Class50.anInt668 << 8)
				   / i_25_);
			    class203.anInt2969
				= (class203.anInt2961 - Class176.anInt2513
				   << 8) / i_25_;
			    class203.anInt2964
				= (class203.anInt2974 - Class176.anInt2513
				   << 8) / i_25_;
			    Class131_Sub41_Sub18.aClass203Array6404
				[Class131_Sub41_Sub21.anInt6448++]
				= class203;
			}
		    }
		}
	    }
	}
    }
    
    public int method746(int arg0, int arg1) {
	try {
	    if (arg1 != -128)
		method743(83);
	    if (anIntArrayArray941 != null)
		arg0 = ((int) ((long) arg0 * (long) anInt939 / (long) anInt940)
			+ 6);
	    anInt943++;
	    return arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hc.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class71(int arg0, int arg1) {
	try {
	    if (arg1 != arg0) {
		int i = Class131_Sub2_Sub11.method1522(-1, arg1, arg0);
		arg1 /= i;
		arg0 /= i;
		anInt939 = arg1;
		anIntArrayArray941 = new int[arg0][14];
		anInt940 = arg0;
		for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (arg0 ^ 0xffffffff);
		     i_32_++) {
		    int[] is = anIntArrayArray941[i_32_];
		    double d = (double) i_32_ / (double) arg0 + 6.0;
		    int i_33_ = (int) Math.floor(1.0 + (-7.0 + d));
		    if (i_33_ < 0)
			i_33_ = 0;
		    int i_34_ = (int) Math.ceil(d + 7.0);
		    if (i_34_ > 14)
			i_34_ = 14;
		    double d_35_ = (double) arg1 / (double) arg0;
		    for (/**/; (i_34_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff);
			 i_33_++) {
			double d_36_
			    = ((double) i_33_ - d) * 3.141592653589793;
			double d_37_ = d_35_;
			if (d_36_ < -1.0E-4 || d_36_ > 1.0E-4)
			    d_37_ *= Math.sin(d_36_) / d_36_;
			d_37_
			    *= 0.54 + Math.cos(0.2243994752564138
					       * (-d + (double) i_33_)) * 0.46;
			is[i_33_] = (int) Math.floor(d_37_ * 65536.0 + 0.5);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hc.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    static {
	anInt946 = 0;
	anInt948 = 0;
    }
}
