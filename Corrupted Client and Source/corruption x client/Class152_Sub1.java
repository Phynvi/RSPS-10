/* Class152_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class152_Sub1 extends Class152
{
    public int anInt4710;
    public static int anInt4711 = 0;
    public static int anInt4712;
    public static int anInt4713;
    public static int anInt4714;
    public Class130_Sub1 aClass130_Sub1_4715;
    public static int anInt4716;
    public static int anInt4717;
    public static int anInt4718;
    public static int anInt4719;
    public static int anInt4720;
    public static int anInt4721;
    public static int anInt4722;
    public static int anInt4723;
    public static int anInt4724;
    public static int anInt4725;
    public static int anInt4726;
    public static int anInt4727 = 0;
    public int anInt4728;
    public int anInt4729;
    public static int anInt4730;
    public static int anInt4731;
    public static int anInt4732;
    public static int anInt4733;
    public static int anInt4734;
    public int anInt4735;
    public int anInt4736;
    public int anInt4737;
    public static int anInt4738;
    public static int anInt4739;
    public int[] anIntArray4740;
    public static int anInt4741;
    public static int anInt4742;
    
    public int method2206() {
	return anInt4729;
    }
    
    public void method2208(int arg0, int arg1, int arg2, int arg3) {
	anInt4728 = arg0;
	anInt4736 = arg1;
	anInt4710 = arg2;
	anInt4737 = arg3;
    }
    
    public abstract void method2218(int[] is, int[] is_0_, int i, int i_1_);
    
    public void method2205(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	if (anIntArray4740 == null)
	    anIntArray4740 = new int[4];
	aClass130_Sub1_4715.method1228(anIntArray4740);
	aClass130_Sub1_4715.method1248(aClass130_Sub1_4715.anInt4066,
				       aClass130_Sub1_4715.anInt4061,
				       arg0 + arg2, arg1 + arg3);
	int i = method2216();
	int i_2_ = method2198();
	int i_3_ = (arg2 + i - 1) / i;
	int i_4_ = (arg3 + i_2_ - 1) / i_2_;
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    int i_6_ = i_5_ * i_2_;
	    for (int i_7_ = 0; i_7_ < i_3_; i_7_++)
		method2202(arg0 + i_7_ * i, arg1 + i_6_, arg4, arg5, arg6);
	}
	aClass130_Sub1_4715.method1188(anIntArray4740[0], anIntArray4740[1],
				       anIntArray4740[2], anIntArray4740[3]);
    }
    
    public void method2219(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5) {
	int i = anInt4728 + anInt4729 + anInt4710;
	int i_8_ = anInt4736 + anInt4735 + anInt4737;
	if (i != anInt4729 || i_8_ != anInt4735) {
	    float f = (arg2 - arg0) / (float) i;
	    float f_9_ = (arg3 - arg1) / (float) i;
	    float f_10_ = (arg4 - arg0) / (float) i_8_;
	    float f_11_ = (arg5 - arg1) / (float) i_8_;
	    float f_12_ = f_10_ * (float) anInt4736;
	    float f_13_ = f_11_ * (float) anInt4736;
	    float f_14_ = f * (float) anInt4728;
	    float f_15_ = f_9_ * (float) anInt4728;
	    float f_16_ = -f * (float) anInt4710;
	    float f_17_ = -f_9_ * (float) anInt4710;
	    float f_18_ = -f_10_ * (float) anInt4737;
	    float f_19_ = -f_11_ * (float) anInt4737;
	    arg0 += f_14_ + f_12_;
	    arg1 += f_15_ + f_13_;
	    arg2 += f_16_ + f_12_;
	    arg3 += f_17_ + f_13_;
	    arg4 += f_14_ + f_18_;
	    arg5 += f_15_ + f_19_;
	}
	float f = arg4 + (arg2 - arg0);
	float f_20_ = arg3 + (arg5 - arg1);
	float f_21_;
	float f_22_;
	if (arg0 < arg2) {
	    f_21_ = arg0;
	    f_22_ = arg2;
	} else {
	    f_21_ = arg2;
	    f_22_ = arg0;
	}
	if (arg4 < f_21_)
	    f_21_ = arg4;
	if (f < f_21_)
	    f_21_ = f;
	if (arg4 > f_22_)
	    f_22_ = arg4;
	if (f > f_22_)
	    f_22_ = f;
	float f_23_;
	float f_24_;
	if (arg1 < arg3) {
	    f_23_ = arg1;
	    f_24_ = arg3;
	} else {
	    f_23_ = arg3;
	    f_24_ = arg1;
	}
	if (arg5 < f_23_)
	    f_23_ = arg5;
	if (f_20_ < f_23_)
	    f_23_ = f_20_;
	if (arg5 > f_24_)
	    f_24_ = arg5;
	if (f_20_ > f_24_)
	    f_24_ = f_20_;
	if (f_21_ < (float) aClass130_Sub1_4715.anInt4066)
	    f_21_ = (float) aClass130_Sub1_4715.anInt4066;
	if (f_22_ > (float) aClass130_Sub1_4715.anInt4067)
	    f_22_ = (float) aClass130_Sub1_4715.anInt4067;
	if (f_23_ < (float) aClass130_Sub1_4715.anInt4061)
	    f_23_ = (float) aClass130_Sub1_4715.anInt4061;
	if (f_24_ > (float) aClass130_Sub1_4715.anInt4024)
	    f_24_ = (float) aClass130_Sub1_4715.anInt4024;
	f_22_ = f_21_ - f_22_;
	if (!(f_22_ >= 0.0F)) {
	    f_24_ = f_23_ - f_24_;
	    if (!(f_24_ >= 0.0F)) {
		anInt4738 = aClass130_Sub1_4715.anInt4029;
		anInt4725 = (int) ((float) ((int) f_23_ * anInt4738) + f_21_);
		float f_25_ = ((arg2 - arg0) * (arg5 - arg1)
			       - (arg3 - arg1) * (arg4 - arg0));
		float f_26_ = ((arg4 - arg0) * (arg3 - arg1)
			       - (arg5 - arg1) * (arg2 - arg0));
		anInt4718 = (int) ((arg5 - arg1) * 4096.0F * (float) anInt4729
				   / f_25_);
		anInt4731 = (int) ((arg3 - arg1) * 4096.0F * (float) anInt4735
				   / f_26_);
		anInt4712 = (int) ((arg4 - arg0) * 4096.0F * (float) anInt4729
				   / f_26_);
		anInt4720 = (int) ((arg2 - arg0) * 4096.0F * (float) anInt4735
				   / f_25_);
		anInt4721 = (int) (f_21_ * 16.0F + 8.0F
				   - (arg0 + arg2 + arg4 + f) / 4.0F * 16.0F);
		anInt4733
		    = (int) (f_23_ * 16.0F + 8.0F
			     - (arg1 + arg3 + arg5 + f_20_) / 4.0F * 16.0F);
		anInt4723
		    = (anInt4729 >> 1 << 12) + (anInt4733 * anInt4712 >> 4);
		anInt4741
		    = (anInt4735 >> 1 << 12) + (anInt4733 * anInt4720 >> 4);
		anInt4732 = anInt4721 * anInt4718 >> 4;
		anInt4713 = anInt4721 * anInt4731 >> 4;
		anInt4717 = (int) f_21_;
		anInt4739 = (int) f_22_;
		anInt4734 = (int) f_23_;
		anInt4719 = (int) f_24_;
	    }
	}
    }
    
    public int method2198() {
	return anInt4736 + anInt4735 + anInt4737;
    }
    
    public int method2204() {
	return anInt4735;
    }
    
    public void method2217(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5, int arg6, int arg7,
			   int arg8) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	method2219(arg0, arg1, arg2, arg3, arg4, arg5);
	anInt4726 = arg7;
	if (arg6 != 0) {
	    anInt4711 = arg7 >>> 24;
	    anInt4727 = 256 - anInt4711;
	    if (arg6 == 1) {
		anInt4714 = (arg7 & 0xff0000) >> 16;
		anInt4742 = (arg7 & 0xff00) >> 8;
		anInt4724 = arg7 & 0xff;
	    } else {
		anInt4730 = arg7 >>> 24;
		anInt4716 = 256 - anInt4730;
		int i = (arg7 & 0xff00ff) * anInt4716 & ~0xff00ff;
		int i_27_ = (arg7 & 0xff00) * anInt4716 & 0xff0000;
		anInt4722 = (i | i_27_) >>> 8;
	    }
	}
	if (arg6 == 0) {
	    if (arg8 == 0)
		method2220(0, 0);
	    else if (arg8 == 1)
		method2220(0, 1);
	    else if (arg8 == 2)
		method2220(0, 2);
	} else if (arg6 == 1) {
	    if (arg8 == 0)
		method2220(1, 0);
	    else if (arg8 == 1)
		method2220(1, 1);
	    else if (arg8 == 2)
		method2220(1, 2);
	} else if (arg6 == 2) {
	    if (arg8 == 0)
		method2220(2, 0);
	    else if (arg8 == 1)
		method2220(2, 1);
	    else if (arg8 == 2)
		method2220(2, 2);
	}
    }
    
    public abstract void method2214(int i, int i_28_, Class183 class183,
				    int i_29_, int i_30_);
    
    public int method2216() {
	return anInt4728 + anInt4729 + anInt4710;
    }
    
    public Class152_Sub1(Class130_Sub1 arg0, int arg1, int arg2) {
	aClass130_Sub1_4715 = arg0;
	anInt4729 = arg1;
	anInt4735 = arg2;
    }
    
    public abstract void method2220(int i, int i_31_);
    
    public abstract void method2202(int i, int i_32_, int i_33_, int i_34_,
				    int i_35_);
    
    public void method2207(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5, Class183 arg6, int arg7,
			   int arg8) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	method2219(arg0, arg1, arg2, arg3, arg4, arg5);
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg6;
	method2218(class183_sub1.anIntArray4954, class183_sub1.anIntArray4963,
		   anInt4717 - arg7, -arg8 - (anInt4719 - anInt4734));
    }
    
    public abstract void method2201(int i, int i_36_, int i_37_, int i_38_,
				    int i_39_, int i_40_, int i_41_);
    
    static {
	anInt4724 = 0;
	anInt4730 = 0;
	anInt4722 = 0;
	anInt4716 = 0;
	anInt4714 = 0;
	anInt4742 = 0;
    }
}
