/* Class131_Sub2_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class131_Sub2_Sub27 extends Class131_Sub2
{
    public static int anInt5935;
    public int anInt5936 = 1024;
    public static int anInt5937;
    public int anInt5938;
    public static int anInt5939;
    public static boolean aBoolean5940 = false;
    public int anInt5941 = 1024;
    public int anInt5942;
    public int anInt5943;
    public int anInt5944 = 2048;
    public static int anInt5945;
    public int anInt5946;
    public static int anInt5947;
    public static int anInt5948;
    public static int anInt5949;
    public static int anInt5950;
    public int anInt5951;
    public int anInt5952;
    public static int[] anIntArray5953
	= { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
	    82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83,
	    104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25,
	    16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48,
	    68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35,
	    49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227,
	    233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2,
	    3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public int anInt5954;
    
    public void method1471(int arg0) {
	try {
	    if (arg0 != 0)
		anInt5941 = 38;
	    anInt5935++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pf.J(" + arg0 + ')');
	}
    }
    
    public void method1599(int arg0, int[][] arg1, Random arg2, int arg3,
			   int arg4, int arg5, byte arg6) {
	try {
	    if (arg6 > -20)
		method1603(103);
	    anInt5939++;
	    int i = ((anInt5954 ^ 0xffffffff) < -1
		     ? -Class143.method2146(2044605728, arg2, anInt5954) + 4096
		     : 4096);
	    int i_0_ = anInt5936 * anInt5952 >> -402002580;
	    int i_1_
		= (anInt5952
		   + -(i_0_ > 0 ? Class143.method2146(2044605728, arg2, i_0_)
		       : 0));
	    if (Class131_Sub2_Sub7.anInt5637 <= arg0)
		arg0 -= Class131_Sub2_Sub7.anInt5637;
	    if (i_1_ <= 0) {
		if (Class131_Sub2_Sub7.anInt5637 >= arg4 + arg0) {
		    for (int i_2_ = 0; arg3 > i_2_; i_2_++)
			Class61.method651(arg1[i_2_ + arg5], arg0, arg4, i);
		} else {
		    int i_3_ = Class131_Sub2_Sub7.anInt5637 + -arg0;
		    for (int i_4_ = 0;
			 (arg3 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
			int[] is = arg1[arg5 - -i_4_];
			Class61.method651(is, arg0, i_3_, i);
			Class61.method651(is, 0, arg4 + -i_3_, i);
		    }
		}
	    } else if (arg3 > 0 && arg4 > 0) {
		int i_5_ = arg4 / 2;
		int i_6_ = arg3 / 2;
		int i_7_
		    = (i_5_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff) ? i_1_ : i_5_;
		int i_8_ = i_6_ < i_1_ ? i_6_ : i_1_;
		int i_9_ = arg0 - -i_7_;
		int i_10_ = arg4 - i_7_ * 2;
		for (int i_11_ = 0; (arg3 ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
		     i_11_++) {
		    int[] is = arg1[arg5 + i_11_];
		    if (i_11_ < i_8_) {
			int i_12_ = i_11_ * i / i_8_;
			if ((anInt5943 ^ 0xffffffff) == -1) {
			    for (int i_13_ = 0; i_7_ > i_13_; i_13_++) {
				int i_14_ = i * i_13_ / i_7_;
				is[Class90.method841(arg0 + i_13_,
						     (Class23_Sub4_Sub4
						      .anInt5404))]
				    = is[Class90.method841((Class23_Sub4_Sub4
							    .anInt5404),
							   (-i_13_ + arg4
							    + (arg0 - 1)))]
				    = i_12_ * i_14_ >> -1446095700;
			    }
			} else {
			    for (int i_15_ = 0; i_7_ > i_15_; i_15_++) {
				int i_16_ = i * i_15_ / i_7_;
				is[Class90.method841((Class23_Sub4_Sub4
						      .anInt5404),
						     arg0 - -i_15_)]
				    = is[Class90.method841((-i_15_ + arg4
							    + (arg0 - 1)),
							   (Class23_Sub4_Sub4
							    .anInt5404))]
				    = i_16_ < i_12_ ? i_16_ : i_12_;
			    }
			}
			if (i_10_ + i_9_ <= Class131_Sub2_Sub7.anInt5637)
			    Class61.method651(is, i_9_, i_10_, i_12_);
			else {
			    int i_17_ = -i_9_ + Class131_Sub2_Sub7.anInt5637;
			    Class61.method651(is, i_9_, i_17_, i_12_);
			    Class61.method651(is, 0, i_10_ + -i_17_, i_12_);
			}
		    } else {
			int i_18_ = -1 + -i_11_ + arg3;
			if (i_8_ > i_18_) {
			    int i_19_ = i * i_18_ / i_8_;
			    if ((anInt5943 ^ 0xffffffff) == -1) {
				for (int i_20_ = 0;
				     ((i_7_ ^ 0xffffffff)
				      < (i_20_ ^ 0xffffffff));
				     i_20_++) {
				    int i_21_ = i_20_ * i / i_7_;
				    is[Class90.method841((Class23_Sub4_Sub4
							  .anInt5404),
							 i_20_ + arg0)]
					= is[(Class90.method841
					      (-i_20_ + arg0 - (-arg4 + 1),
					       Class23_Sub4_Sub4.anInt5404))]
					= i_19_ * i_21_ >> -1551545620;
				}
			    } else {
				for (int i_22_ = 0; i_7_ > i_22_; i_22_++) {
				    int i_23_ = i_22_ * i / i_7_;
				    is[Class90.method841((Class23_Sub4_Sub4
							  .anInt5404),
							 arg0 - -i_22_)]
					= is[(Class90.method841
					      (Class23_Sub4_Sub4.anInt5404,
					       -1 + (-i_22_ + arg4) + arg0))]
					= i_23_ < i_19_ ? i_23_ : i_19_;
				}
			    }
			    if ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				<= (i_10_ + i_9_ ^ 0xffffffff))
				Class61.method651(is, i_9_, i_10_, i_19_);
			    else {
				int i_24_
				    = Class131_Sub2_Sub7.anInt5637 - i_9_;
				Class61.method651(is, i_9_, i_24_, i_19_);
				Class61.method651(is, 0, -i_24_ + i_10_,
						  i_19_);
			    }
			} else {
			    for (int i_25_ = 0; i_25_ < i_7_; i_25_++)
				is[Class90.method841(i_25_ + arg0,
						     (Class23_Sub4_Sub4
						      .anInt5404))]
				    = is[Class90.method841((-i_25_
							    + (arg0 - -arg4)
							    - 1),
							   (Class23_Sub4_Sub4
							    .anInt5404))]
				    = i_25_ * i / i_7_;
			    if (i_9_ - -i_10_ <= Class131_Sub2_Sub7.anInt5637)
				Class61.method651(is, i_9_, i_10_, i);
			    else {
				int i_26_
				    = Class131_Sub2_Sub7.anInt5637 + -i_9_;
				Class61.method651(is, i_9_, i_26_, i);
				Class61.method651(is, 0, i_10_ - i_26_, i);
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pf.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ',' + arg6
						 + ')'));
	}
    }
    
    public static void method1600(int arg0, int arg1) {
	try {
	    if (arg0 != -1)
		anIntArray5953 = null;
	    anInt5937++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(14, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(-79);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pf.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub27() {
	super(0, true);
	anInt5943 = 0;
	anInt5942 = 1024;
	anInt5938 = 409;
	anInt5946 = 0;
	anInt5951 = 819;
	anInt5954 = 1024;
    }
    
    public static Class154 method1601
	(int arg0, Class130 arg1, Class161 arg2, int arg3, int arg4, int arg5,
	 boolean arg6, int arg7, Class154 arg8, int arg9, int arg10, int arg11,
	 int arg12, int arg13, byte arg14) {
	try {
	    anInt5949++;
	    if (arg8 == null)
		return null;
	    int i = 1031;
	    if (arg2 != null) {
		i |= arg2.method2389(1, false, -1, arg7);
		i &= ~0x200;
	    }
	    long l
		= ((long) ((arg3 << -9156584) + arg12 - -(arg13 << 76900080))
		   - -((long) arg11 << 1108292576)
		   + ((long) arg0 << -1045691216));
	    Class154 class154;
	    synchronized (Class21.aClass214_239) {
		class154 = (Class154) Class21.aClass214_239.method2780(119, l);
	    }
	    if (arg14 != 22)
		aBoolean5940 = true;
	    if (class154 == null
		|| arg1.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg1.method1203(i, class154.method2253());
		int i_27_;
		if ((arg12 ^ 0xffffffff) == -2)
		    i_27_ = 9;
		else if ((arg12 ^ 0xffffffff) == -3)
		    i_27_ = 12;
		else if (arg12 == 3)
		    i_27_ = 15;
		else if ((arg12 ^ 0xffffffff) != -5)
		    i_27_ = 21;
		else
		    i_27_ = 18;
		int i_28_ = 3;
		int[] is = { 64, 96, 128 };
		Class116 class116
		    = new Class116(i_27_ * i_28_ + 1,
				   i_28_ * i_27_ * 2 + -i_27_, 0);
		int i_29_ = class116.method991(0, 0, 0, arg14 ^ ~0x17);
		int[][] is_30_ = new int[i_28_][i_27_];
		for (int i_31_ = 0;
		     (i_28_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
		    int i_32_ = is[i_31_];
		    int i_33_ = is[i_31_];
		    for (int i_34_ = 0;
			 (i_27_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff);
			 i_34_++) {
			int i_35_ = (i_34_ << -116041490) / i_27_;
			int i_36_ = (Class31.anIntArray434[i_35_] * i_32_
				     >> -246349681);
			int i_37_ = (i_33_ * Class31.anIntArray425[i_35_]
				     >> 1330736751);
			is_30_[i_31_][i_34_]
			    = class116.method991(i_37_, i_36_, 0, arg14 + -24);
		    }
		}
		for (int i_38_ = 0; i_28_ > i_38_; i_38_++) {
		    int i_39_ = (i_38_ * 256 - -128) / i_28_;
		    int i_40_ = 256 - i_39_;
		    byte i_41_
			= (byte) (arg3 * i_39_ + arg13 * i_40_ >> 1771184840);
		    short i_42_
			= (short) (((((0xfc00 & arg0) * i_39_
				      + i_40_ * (arg11 & 0xfc00))
				     & 0xfc0000)
				    + (((arg0 & 0x380) * i_39_
					+ i_40_ * (0x380 & arg11))
				       & 0x38000)
				    + ((0x7f & arg0) * i_39_ + i_40_ * (arg11
									& 0x7f)
				       & 0x7f00))
				   >> 211865896);
		    for (int i_43_ = 0;
			 (i_43_ ^ 0xffffffff) > (i_27_ ^ 0xffffffff);
			 i_43_++) {
			if (i_38_ != 0) {
			    class116.method990((is_30_[i_38_]
						[(i_43_ - -1) % i_27_]),
					       is_30_[-1 + i_38_][i_43_],
					       i_42_,
					       (is_30_[-1 + i_38_]
						[(1 + i_43_) % i_27_]),
					       (byte) -1, (byte) 1, (short) -1,
					       (byte) -81, i_41_);
			    class116.method990(is_30_[i_38_][i_43_],
					       is_30_[i_38_ - 1][i_43_], i_42_,
					       (is_30_[i_38_]
						[(1 + i_43_) % i_27_]),
					       (byte) -1, (byte) 1, (short) -1,
					       (byte) -120, i_41_);
			} else
			    class116.method990(is_30_[0][i_43_], i_29_, i_42_,
					       is_30_[0][(1 + i_43_) % i_27_],
					       (byte) -1, (byte) 1, (short) -1,
					       (byte) -70, i_41_);
		    }
		}
		class154
		    = arg1.method1218(class116, i, Class23_Sub4_Sub4.anInt5409,
				      64, 768);
		synchronized (Class21.aClass214_239) {
		    Class21.aClass214_239.method2773(true, class154, l);
		}
	    }
	    int i_44_ = arg12 * 64 - 1;
	    int i_45_ = -i_44_;
	    int i_46_ = -i_44_;
	    int i_47_ = i_44_;
	    int i_48_ = i_44_;
	    if (arg6) {
		if (arg5 > 1024 && arg5 < 7168)
		    i_45_ -= 128;
		if (arg5 > 13312 || arg5 < 3072)
		    i_46_ -= 128;
		if (arg5 > 5120 && arg5 < 11264)
		    i_48_ += 128;
		if ((arg5 ^ 0xffffffff) < -9217
		    && (arg5 ^ 0xffffffff) > -15361)
		    i_47_ += 128;
	    }
	    int i_49_ = arg8.method2265();
	    int i_50_ = arg8.method2267();
	    int i_51_ = arg8.method2263();
	    if ((i_47_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff))
		i_50_ = i_47_;
	    if ((i_51_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff))
		i_51_ = i_46_;
	    int i_52_ = arg8.method2249();
	    if (i_49_ < i_45_)
		i_49_ = i_45_;
	    if ((i_48_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff))
		i_52_ = i_48_;
	    Class131_Sub41_Sub10 class131_sub41_sub10 = null;
	    if (arg2 != null) {
		arg7 = arg2.anIntArray2139[arg7];
		class131_sub41_sub10
		    = Class34.method462((byte) -119, arg7 >> 1239640688);
		arg7 &= 0xffff;
	    }
	    if (class131_sub41_sub10 == null) {
		class154 = class154.method2287((byte) 3, i, true);
		class154.method2262((-i_49_ + i_50_) / 2, 128,
				    (i_52_ - i_51_) / 2);
		class154.method2272((i_50_ + i_49_) / 2, 0,
				    (i_52_ + i_51_) / 2);
	    } else {
		class154 = class154.method2287((byte) 3, i, true);
		class154.method2262((i_50_ + -i_49_) / 2, 128,
				    (i_52_ + -i_51_) / 2);
		class154.method2272((i_50_ + i_49_) / 2, 0,
				    (i_52_ + i_51_) / 2);
		class154.method2274(arg7, 96, class131_sub41_sub10);
	    }
	    if (arg9 != 0)
		class154.method2288(arg9);
	    if ((arg10 ^ 0xffffffff) != -1)
		class154.method2251(arg10);
	    if ((arg4 ^ 0xffffffff) != -1)
		class154.method2272(0, arg4, 0);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("pf.D(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ','
			+ (arg8 != null ? "{...}" : "null") + ',' + arg9 + ','
			+ arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ','
			+ arg14 + ')'));
	}
    }
    
    public static void method1602(byte arg0) {
	try {
	    anInt5947++;
	    if (arg0 >= -2)
		method1603(66);
	    for (Class131_Sub3 class131_sub3
		     = ((Class131_Sub3)
			Class131_Sub3.aClass119_4118.method1007(0));
		 class131_sub3 != null;
		 class131_sub3 = (Class131_Sub3) Class131_Sub3
						     .aClass119_4118
						     .method1014(0)) {
		if (class131_sub3.anInt4109 == -1) {
		    class131_sub3.anInt4117 = 0;
		    Class131_Sub2_Sub30.method1614(class131_sub3, 0);
		} else
		    class131_sub3.method1355((byte) 115);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pf.H(" + arg0 + ')');
	}
    }
    
    public static void method1603(int arg0) {
	try {
	    if (arg0 != 8)
		method1601(-49, null, null, 65, 21, 71, true, -64, null, 6, 76,
			   62, 116, -16, (byte) 18);
	    anIntArray5953 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pf.G(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5945++;
	int i = arg0;
    while_116_:
	do {
	while_115_:
	    do {
	    while_114_:
		do {
		while_113_:
		    do {
		    while_112_:
			do {
			while_111_:
			    do {
			    while_110_:
				do {
				    do {
					if ((i ^ 0xffffffff) != -1) {
					    if ((i ^ 0xffffffff) != -2) {
						if ((i ^ 0xffffffff) != -3) {
						    if ((i ^ 0xffffffff)
							!= -4) {
							if ((i ^ 0xffffffff)
							    != -5) {
							    if ((i
								 ^ 0xffffffff)
								!= -6) {
								if (i != 6) {
								    if (i
									!= 7) {
									if (i
									    == 8)
									    break while_115_;
									break while_116_;
								    }
								} else
								    break while_113_;
								break while_114_;
							    }
							} else
							    break while_111_;
							break while_112_;
						    }
						} else
						    break;
						break while_110_;
					    }
					} else {
					    anInt5946 = arg2.readUnsignedByte(-63);
					    break while_116_;
					}
					anInt5942
					    = arg2.readUnsignedShort(arg1 + 8153);
					break while_116_;
				    } while (false);
				    anInt5944 = arg2.readUnsignedShort(8104);
				    break while_116_;
				} while (false);
				anInt5938 = arg2.readUnsignedShort(8104);
				break while_116_;
			    } while (false);
			    anInt5951 = arg2.readUnsignedShort(8104);
			    break while_116_;
			} while (false);
			anInt5941 = arg2.readUnsignedShort(arg1 + 8153);
			break while_116_;
		    } while (false);
		    anInt5943 = arg2.readUnsignedByte(-54);
		    break while_116_;
		} while (false);
		anInt5936 = arg2.readUnsignedShort(8104);
		break while_116_;
	    } while (false);
	    anInt5954 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	} while (false);
	if (arg1 != -49)
	    method1603(102);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5948++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 66);
	    if (aClass200_4087.aBoolean2927) {
		int[][] is_53_ = aClass200_4087.method2715((byte) -105);
		int i = 0;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		boolean bool = true;
		boolean bool_58_ = true;
		int i_59_ = 0;
		int i_60_ = 0;
		int i_61_
		    = Class131_Sub2_Sub7.anInt5637 * anInt5942 >> -1912729492;
		int i_62_
		    = anInt5944 * Class131_Sub2_Sub7.anInt5637 >> -698226516;
		int i_63_ = anInt5938 * Class120_Sub2.anInt3975 >> 1964756364;
		int i_64_ = anInt5951 * Class120_Sub2.anInt3975 >> 361375724;
		if ((i_64_ ^ 0xffffffff) >= -2)
		    return is_53_[arg1];
		anInt5952 = (anInt5941 * (Class131_Sub2_Sub7.anInt5637 / 8)
			     >> -1943914868);
		int i_65_ = 1 + Class131_Sub2_Sub7.anInt5637 / i_61_;
		int[][] is_66_ = new int[i_65_][3];
		int[][] is_67_ = new int[i_65_][3];
		Random random = new Random((long) anInt5946);
		for (;;) {
		    int i_68_ = (Class143.method2146(arg0 + 2044617271, random,
						     -i_61_ + i_62_)
				 + i_61_);
		    int i_69_
			= i_63_ - -Class143.method2146(2044605728, random,
						       i_64_ + -i_63_);
		    int i_70_ = i_68_ + i_56_;
		    if ((i_70_ ^ 0xffffffff)
			< (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)) {
			i_70_ = Class131_Sub2_Sub7.anInt5637;
			i_68_ = Class131_Sub2_Sub7.anInt5637 - i_56_;
		    }
		    int i_71_;
		    if (bool_58_)
			i_71_ = 0;
		    else {
			int i_72_ = i_57_;
			int[] is_73_ = is_67_[i_57_];
			int i_74_ = 0;
			int i_75_ = i_70_ + i;
			if (i_75_ < 0)
			    i_75_ += Class131_Sub2_Sub7.anInt5637;
			if ((i_75_ ^ 0xffffffff)
			    < (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff))
			    i_75_ -= Class131_Sub2_Sub7.anInt5637;
			i_71_ = is_73_[2];
			for (;;) {
			    int[] is_76_ = is_67_[i_72_];
			    if (is_76_[0] <= i_75_
				&& (is_76_[1] ^ 0xffffffff) <= (i_75_
								^ 0xffffffff))
				break;
			    if ((++i_72_ ^ 0xffffffff) <= (i_59_ ^ 0xffffffff))
				i_72_ = 0;
			    i_74_++;
			}
			if ((i_57_ ^ 0xffffffff) != (i_72_ ^ 0xffffffff)) {
			    int i_77_ = i + i_56_;
			    if ((i_77_ ^ 0xffffffff) > -1)
				i_77_ += Class131_Sub2_Sub7.anInt5637;
			    if ((i_77_ ^ 0xffffffff)
				< (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff))
				i_77_ -= Class131_Sub2_Sub7.anInt5637;
			    for (int i_78_ = 1; i_78_ <= i_74_; i_78_++) {
				int[] is_79_
				    = is_67_[(i_57_ - -i_78_) % i_59_];
				i_71_ = Math.max(i_71_, is_79_[2]);
			    }
			    for (int i_80_ = 0; i_74_ >= i_80_; i_80_++) {
				int[] is_81_
				    = is_67_[(i_57_ - -i_80_) % i_59_];
				int i_82_ = is_81_[2];
				if ((i_71_ ^ 0xffffffff)
				    != (i_82_ ^ 0xffffffff)) {
				    int i_83_ = is_81_[0];
				    int i_84_ = is_81_[1];
				    int i_85_;
				    int i_86_;
				    if ((i_77_ ^ 0xffffffff)
					> (i_75_ ^ 0xffffffff)) {
					i_85_ = Math.max(i_77_, i_83_);
					i_86_ = Math.min(i_75_, i_84_);
				    } else if (i_83_ != 0) {
					i_85_ = Math.max(i_77_, i_83_);
					i_86_ = Class131_Sub2_Sub7.anInt5637;
				    } else {
					i_86_ = Math.min(i_75_, i_84_);
					i_85_ = 0;
				    }
				    method1599(i_85_ - -i_55_, is_53_, random,
					       -i_82_ + i_71_, -i_85_ + i_86_,
					       i_82_, (byte) -87);
				}
			    }
			}
			i_57_ = i_72_;
		    }
		    if (i_71_ - -i_69_ <= Class120_Sub2.anInt3975)
			bool = false;
		    else
			i_69_ = Class120_Sub2.anInt3975 - i_71_;
		    if ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
			== (i_70_ ^ 0xffffffff)) {
			method1599(i_56_ + i_54_, is_53_, random, i_69_, i_68_,
				   i_71_, (byte) -53);
			if (bool)
			    break;
			bool = true;
			int[] is_87_ = is_66_[i_60_++];
			is_87_[0] = i_56_;
			is_87_[2] = i_71_ + i_69_;
			is_87_[1] = i_70_;
			int[][] is_88_ = is_67_;
			is_67_ = is_66_;
			is_66_ = is_88_;
			i_59_ = i_60_;
			i_60_ = 0;
			i_55_ = i_54_;
			i_54_ = Class143.method2146(2044605728, random,
						    (Class131_Sub2_Sub7
						     .anInt5637));
			i = i_54_ + -i_55_;
			i_56_ = 0;
			int i_89_ = i;
			if ((i_89_ ^ 0xffffffff) > -1)
			    i_89_ += Class131_Sub2_Sub7.anInt5637;
			i_57_ = 0;
			if ((i_89_ ^ 0xffffffff)
			    < (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff))
			    i_89_ -= Class131_Sub2_Sub7.anInt5637;
			for (;;) {
			    int[] is_90_ = is_67_[i_57_];
			    if (is_90_[0] <= i_89_
				&& (is_90_[1] ^ 0xffffffff) <= (i_89_
								^ 0xffffffff))
				break;
			    if (++i_57_ >= i_59_)
				i_57_ = 0;
			}
			bool_58_ = false;
		    } else {
			int[] is_91_ = is_66_[i_60_++];
			is_91_[1] = i_70_;
			is_91_[2] = i_71_ + i_69_;
			is_91_[0] = i_56_;
			method1599(i_54_ + i_56_, is_53_, random, i_69_, i_68_,
				   i_71_, (byte) -91);
			i_56_ = i_70_;
		    }
		}
	    }
	    if (arg0 != -11543)
		method1600(-11, -48);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pf.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1604(boolean arg0, Class158 arg1) {
	try {
	    anInt5950++;
	    if (arg0 != true)
		method1605(23, 120, 85);
	    Class60.aClass158_787 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pf.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static boolean method1605(int arg0, int arg1, int arg2) {
	for (int i = 0; i < Class131_Sub41_Sub21.anInt6448; i++) {
	    Class203 class203 = Class131_Sub41_Sub18.aClass203Array6404[i];
	    if (class203.anInt2971 == 1) {
		int i_92_ = class203.anInt2954 - arg0;
		if (i_92_ > 0) {
		    int i_93_ = (class203.anInt2961
				 + (class203.anInt2969 * i_92_ >> 8));
		    int i_94_ = (class203.anInt2974
				 + (class203.anInt2964 * i_92_ >> 8));
		    int i_95_ = (class203.anInt2975
				 + (class203.anInt2970 * i_92_ >> 8));
		    int i_96_ = (class203.anInt2953
				 + (class203.anInt2973 * i_92_ >> 8));
		    if (arg2 >= i_93_ && arg2 <= i_94_ && arg1 >= i_95_
			&& arg1 <= i_96_)
			return true;
		}
	    } else if (class203.anInt2971 == 2) {
		int i_97_ = arg0 - class203.anInt2954;
		if (i_97_ > 0) {
		    int i_98_ = (class203.anInt2961
				 + (class203.anInt2969 * i_97_ >> 8));
		    int i_99_ = (class203.anInt2974
				 + (class203.anInt2964 * i_97_ >> 8));
		    int i_100_ = (class203.anInt2975
				  + (class203.anInt2970 * i_97_ >> 8));
		    int i_101_ = (class203.anInt2953
				  + (class203.anInt2973 * i_97_ >> 8));
		    if (arg2 >= i_98_ && arg2 <= i_99_ && arg1 >= i_100_
			&& arg1 <= i_101_)
			return true;
		}
	    } else if (class203.anInt2971 == 3) {
		int i_102_ = class203.anInt2961 - arg2;
		if (i_102_ > 0) {
		    int i_103_ = (class203.anInt2954
				  + (class203.anInt2955 * i_102_ >> 8));
		    int i_104_ = (class203.anInt2952
				  + (class203.anInt2960 * i_102_ >> 8));
		    int i_105_ = (class203.anInt2975
				  + (class203.anInt2970 * i_102_ >> 8));
		    int i_106_ = (class203.anInt2953
				  + (class203.anInt2973 * i_102_ >> 8));
		    if (arg0 >= i_103_ && arg0 <= i_104_ && arg1 >= i_105_
			&& arg1 <= i_106_)
			return true;
		}
	    } else if (class203.anInt2971 == 4) {
		int i_107_ = arg2 - class203.anInt2961;
		if (i_107_ > 0) {
		    int i_108_ = (class203.anInt2954
				  + (class203.anInt2955 * i_107_ >> 8));
		    int i_109_ = (class203.anInt2952
				  + (class203.anInt2960 * i_107_ >> 8));
		    int i_110_ = (class203.anInt2975
				  + (class203.anInt2970 * i_107_ >> 8));
		    int i_111_ = (class203.anInt2953
				  + (class203.anInt2973 * i_107_ >> 8));
		    if (arg0 >= i_108_ && arg0 <= i_109_ && arg1 >= i_110_
			&& arg1 <= i_111_)
			return true;
		}
	    } else if (class203.anInt2971 == 5) {
		int i_112_ = arg1 - class203.anInt2975;
		if (i_112_ > 0) {
		    int i_113_ = (class203.anInt2954
				  + (class203.anInt2955 * i_112_ >> 8));
		    int i_114_ = (class203.anInt2952
				  + (class203.anInt2960 * i_112_ >> 8));
		    int i_115_ = (class203.anInt2961
				  + (class203.anInt2969 * i_112_ >> 8));
		    int i_116_ = (class203.anInt2974
				  + (class203.anInt2964 * i_112_ >> 8));
		    if (arg0 >= i_113_ && arg0 <= i_114_ && arg2 >= i_115_
			&& arg2 <= i_116_)
			return true;
		}
	    }
	}
	return false;
    }
}
