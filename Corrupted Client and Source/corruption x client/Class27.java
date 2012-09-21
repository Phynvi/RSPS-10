/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27
{
    public int[] anIntArray268;
    public int[] anIntArray269;
    public float[][] aFloatArrayArray270;
    public int anInt271;
    public int anInt272;
    public int[] anIntArray273;
    
    public int method407() {
	int i;
	for (i = 0; anIntArray273[i] >= 0;
	     i = Class131_Sub39.method1902() != 0 ? anIntArray273[i] : i + 1) {
	    /* empty */
	}
	return anIntArray273[i] ^ 0xffffffff;
    }
    
    public float[] method408() {
	return aFloatArrayArray270[method407()];
    }
    
    public void method409() {
	int[] is = new int[anInt272];
	int[] is_0_ = new int[33];
	for (int i = 0; i < anInt272; i++) {
	    int i_1_ = anIntArray269[i];
	    if (i_1_ != 0) {
		int i_2_ = 1 << 32 - i_1_;
		int i_3_ = is_0_[i_1_];
		is[i] = i_3_;
		int i_4_;
		if ((i_3_ & i_2_) != 0)
		    i_4_ = is_0_[i_1_ - 1];
		else {
		    i_4_ = i_3_ | i_2_;
		    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
			int i_6_ = is_0_[i_5_];
			if (i_6_ != i_3_)
			    break;
			int i_7_ = 1 << 32 - i_5_;
			if ((i_6_ & i_7_) != 0) {
			    is_0_[i_5_] = is_0_[i_5_ - 1];
			    break;
			}
			is_0_[i_5_] = i_6_ | i_7_;
		    }
		}
		is_0_[i_1_] = i_4_;
		for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
		    int i_9_ = is_0_[i_8_];
		    if (i_9_ == i_3_)
			is_0_[i_8_] = i_4_;
		}
	    }
	}
	anIntArray273 = new int[8];
	int i = 0;
	for (int i_10_ = 0; i_10_ < anInt272; i_10_++) {
	    int i_11_ = anIntArray269[i_10_];
	    if (i_11_ != 0) {
		int i_12_ = is[i_10_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		    int i_15_ = -2147483648 >>> i_14_;
		    if ((i_12_ & i_15_) != 0) {
			if (anIntArray273[i_13_] == 0)
			    anIntArray273[i_13_] = i;
			i_13_ = anIntArray273[i_13_];
		    } else
			i_13_++;
		    if (i_13_ >= anIntArray273.length) {
			int[] is_16_ = new int[anIntArray273.length * 2];
			for (int i_17_ = 0; i_17_ < anIntArray273.length;
			     i_17_++)
			    is_16_[i_17_] = anIntArray273[i_17_];
			anIntArray273 = is_16_;
		    }
		    i_15_ >>>= 1;
		}
		anIntArray273[i_13_] = i_10_ ^ 0xffffffff;
		if (i_13_ >= i)
		    i = i_13_ + 1;
	    }
	}
    }
    
    public static int method410(int arg0, int arg1) {
	int i;
	for (i = (int) Math.pow((double) arg0, 1.0 / (double) arg1) + 1;
	     Class23_Sub4_Sub1.method342((byte) 118, i, arg1) > arg0; i--) {
	    /* empty */
	}
	return i;
    }
    
    public Class27() {
	Class131_Sub39.method1896(24);
	anInt271 = Class131_Sub39.method1896(16);
	anInt272 = Class131_Sub39.method1896(24);
	anIntArray269 = new int[anInt272];
	boolean bool = Class131_Sub39.method1902() != 0;
	if (bool) {
	    int i = 0;
	    int i_18_ = Class131_Sub39.method1896(5) + 1;
	    while (i < anInt272) {
		int i_19_
		    = Class131_Sub39
			  .method1896(Class82.method798(1, anInt272 - i));
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
		    anIntArray269[i++] = i_18_;
		i_18_++;
	    }
	} else {
	    boolean bool_21_ = Class131_Sub39.method1902() != 0;
	    for (int i = 0; i < anInt272; i++) {
		if (bool_21_ && Class131_Sub39.method1902() == 0)
		    anIntArray269[i] = 0;
		else
		    anIntArray269[i] = Class131_Sub39.method1896(5) + 1;
	    }
	}
	method409();
	int i = Class131_Sub39.method1896(4);
	if (i > 0) {
	    float f = Class131_Sub39.method1894(Class131_Sub39.method1896(32));
	    float f_22_
		= Class131_Sub39.method1894(Class131_Sub39.method1896(32));
	    int i_23_ = Class131_Sub39.method1896(4) + 1;
	    boolean bool_24_ = Class131_Sub39.method1902() != 0;
	    int i_25_;
	    if (i == 1)
		i_25_ = method410(anInt272, anInt271);
	    else
		i_25_ = anInt272 * anInt271;
	    anIntArray268 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray268[i_26_] = Class131_Sub39.method1896(i_23_);
	    aFloatArrayArray270 = new float[anInt272][anInt271];
	    if (i == 1) {
		for (int i_27_ = 0; i_27_ < anInt272; i_27_++) {
		    float f_28_ = 0.0F;
		    int i_29_ = 1;
		    for (int i_30_ = 0; i_30_ < anInt271; i_30_++) {
			int i_31_ = i_27_ / i_29_ % i_25_;
			float f_32_
			    = (float) anIntArray268[i_31_] * f_22_ + f + f_28_;
			aFloatArrayArray270[i_27_][i_30_] = f_32_;
			if (bool_24_)
			    f_28_ = f_32_;
			i_29_ *= i_25_;
		    }
		}
	    } else {
		for (int i_33_ = 0; i_33_ < anInt272; i_33_++) {
		    float f_34_ = 0.0F;
		    int i_35_ = i_33_ * anInt271;
		    for (int i_36_ = 0; i_36_ < anInt271; i_36_++) {
			float f_37_
			    = (float) anIntArray268[i_35_] * f_22_ + f + f_34_;
			aFloatArrayArray270[i_33_][i_36_] = f_37_;
			if (bool_24_)
			    f_34_ = f_37_;
			i_35_++;
		    }
		}
	    }
	}
    }
}
