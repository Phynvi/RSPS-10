/* Class9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9_Sub1 extends Class9
{
    public float aFloat3602;
    public float aFloat3603;
    public float aFloat3604;
    public float aFloat3605;
    public float aFloat3606;
    public float aFloat3607;
    public float aFloat3608;
    public float aFloat3609;
    public float aFloat3610;
    public float aFloat3611;
    public float aFloat3612;
    public static float[] aFloatArray3613
	= { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F,
	    0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    public float aFloat3614;
    
    public void method175(int arg0) {
	aFloat3606 = 1.0F;
	aFloat3609 = aFloat3604 = Class96.aFloatArray1272[arg0 & 0x3fff];
	aFloat3603 = Class96.aFloatArray1273[0x3fff & arg0];
	aFloat3607 = -aFloat3603;
	aFloat3602 = aFloat3614 = aFloat3610 = aFloat3605 = aFloat3608
	    = aFloat3611 = aFloat3612 = 0.0F;
    }
    
    public void method177(int arg0) {
	aFloat3604 = 1.0F;
	aFloat3609 = aFloat3606 = Class96.aFloatArray1272[arg0 & 0x3fff];
	aFloat3602 = Class96.aFloatArray1273[arg0 & 0x3fff];
	aFloat3608 = -aFloat3602;
	aFloat3607 = aFloat3614 = aFloat3603 = aFloat3610 = aFloat3605
	    = aFloat3611 = aFloat3612 = 0.0F;
    }
    
    public void method188(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	float f = Class96.aFloatArray1272[0x3fff & arg3];
	float f_0_ = Class96.aFloatArray1273[0x3fff & arg3];
	float f_1_ = Class96.aFloatArray1272[arg4 & 0x3fff];
	float f_2_ = Class96.aFloatArray1273[arg4 & 0x3fff];
	float f_3_ = Class96.aFloatArray1272[0x3fff & arg5];
	float f_4_ = Class96.aFloatArray1273[0x3fff & arg5];
	float f_5_ = f_3_ * f_0_;
	float f_6_ = f_4_ * f_0_;
	aFloat3604 = f * f_3_;
	aFloat3610 = f_4_ * f_2_ + f_1_ * f_5_;
	aFloat3607 = f * f_4_;
	aFloat3602 = f_6_ * f_1_ + -f_2_ * f_3_;
	aFloat3611 = -f_0_;
	aFloat3609 = f_1_ * f_3_ + f_6_ * f_2_;
	aFloat3608 = f_2_ * f;
	aFloat3603 = f_4_ * -f_1_ + f_2_ * f_5_;
	aFloat3606 = f_1_ * f;
	aFloat3614 = (-((float) arg1 * aFloat3607) + (float) -arg0 * aFloat3609
		      - (float) arg2 * aFloat3602);
	aFloat3605 = (-(aFloat3604 * (float) arg1) + (float) -arg0 * aFloat3603
		      - aFloat3610 * (float) arg2);
	aFloat3612
	    = -((float) arg2 * aFloat3606) + (aFloat3608 * (float) -arg0
					      - aFloat3611 * (float) arg1);
    }
    
    public Class9_Sub1 method194() {
	Class9_Sub1 class9_sub1;
	try {
	    Class9_Sub1 class9_sub1_7_ = new Class9_Sub1();
	    class9_sub1_7_.aFloat3604 = aFloat3604;
	    class9_sub1_7_.aFloat3614 = aFloat3614;
	    class9_sub1_7_.aFloat3602 = aFloat3602;
	    class9_sub1_7_.aFloat3605 = aFloat3605;
	    class9_sub1_7_.aFloat3606 = aFloat3606;
	    class9_sub1_7_.aFloat3612 = aFloat3612;
	    class9_sub1_7_.aFloat3603 = aFloat3603;
	    class9_sub1_7_.aFloat3611 = aFloat3611;
	    class9_sub1_7_.aFloat3610 = aFloat3610;
	    class9_sub1_7_.aFloat3609 = aFloat3609;
	    class9_sub1_7_.aFloat3608 = aFloat3608;
	    class9_sub1_7_.aFloat3607 = aFloat3607;
	    class9_sub1 = class9_sub1_7_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class9_sub1;
    }
    
    public void method174(int arg0, int arg1, int arg2) {
	aFloat3605 += (float) arg1;
	aFloat3614 += (float) arg0;
	aFloat3612 += (float) arg2;
    }
    
    public void method192(int arg0) {
	float f = Class96.aFloatArray1272[arg0 & 0x3fff];
	float f_8_ = Class96.aFloatArray1273[arg0 & 0x3fff];
	float f_9_ = aFloat3609;
	float f_10_ = aFloat3607;
	float f_11_ = aFloat3602;
	float f_12_ = aFloat3614;
	aFloat3609 = aFloat3608 * f_8_ + f_9_ * f;
	aFloat3607 = f * f_10_ + aFloat3611 * f_8_;
	aFloat3608 = f * aFloat3608 - f_9_ * f_8_;
	aFloat3602 = f_11_ * f + f_8_ * aFloat3606;
	aFloat3611 = -(f_10_ * f_8_) + f * aFloat3611;
	aFloat3606 = f * aFloat3606 - f_11_ * f_8_;
	aFloat3614 = f_12_ * f + aFloat3612 * f_8_;
	aFloat3612 = -(f_8_ * f_12_) + f * aFloat3612;
    }
    
    public float[] method195(byte arg0) {
	float[] fs;
	try {
	    aFloatArray3613[10] = aFloat3606;
	    aFloatArray3613[5] = aFloat3604;
	    aFloatArray3613[0] = aFloat3609;
	    aFloatArray3613[13] = aFloat3605;
	    aFloatArray3613[9] = aFloat3610;
	    aFloatArray3613[1] = aFloat3603;
	    aFloatArray3613[8] = aFloat3602;
	    aFloatArray3613[4] = aFloat3607;
	    aFloatArray3613[14] = aFloat3612;
	    if (arg0 < 98)
		method178(76);
	    aFloatArray3613[6] = aFloat3611;
	    aFloatArray3613[12] = aFloat3614;
	    aFloatArray3613[2] = aFloat3608;
	    fs = aFloatArray3613;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return fs;
    }
    
    public void method181(int arg0, int arg1, int arg2) {
	aFloat3614 = (float) arg0;
	aFloat3603 = aFloat3608 = aFloat3607 = aFloat3611 = aFloat3602
	    = aFloat3610 = 0.0F;
	aFloat3605 = (float) arg1;
	aFloat3609 = aFloat3604 = aFloat3606 = 1.0F;
	aFloat3612 = (float) arg2;
    }
    
    public void method196(int arg0, Class9 arg1) {
	Class9_Sub1 class9_sub1 = (Class9_Sub1) arg1;
	aFloat3609 = class9_sub1.aFloat3609;
	aFloat3607 = class9_sub1.aFloat3603;
	aFloat3602 = class9_sub1.aFloat3608;
	if (arg0 != 0)
	    method188(48, 127, -11, -70, 82, -10);
	aFloat3603 = class9_sub1.aFloat3607;
	aFloat3608 = class9_sub1.aFloat3602;
	aFloat3610 = class9_sub1.aFloat3611;
	aFloat3604 = class9_sub1.aFloat3604;
	aFloat3606 = class9_sub1.aFloat3606;
	aFloat3614 = -(aFloat3609 * class9_sub1.aFloat3614
		       + aFloat3607 * class9_sub1.aFloat3605
		       + class9_sub1.aFloat3612 * aFloat3602);
	aFloat3611 = class9_sub1.aFloat3610;
	aFloat3605 = -(class9_sub1.aFloat3605 * aFloat3604
		       + aFloat3603 * class9_sub1.aFloat3614
		       + class9_sub1.aFloat3612 * aFloat3610);
	aFloat3612 = -(class9_sub1.aFloat3605 * aFloat3611
		       + aFloat3608 * class9_sub1.aFloat3614
		       + class9_sub1.aFloat3612 * aFloat3606);
    }
    
    public void method190(int[] arg0) {
	float f = (float) arg0[0] - aFloat3614;
	float f_13_ = -aFloat3605 + (float) arg0[1];
	float f_14_ = (float) arg0[2] - aFloat3612;
	arg0[1] = (int) (aFloat3611 * f_14_
			 + (aFloat3607 * f + aFloat3604 * f_13_));
	arg0[2] = (int) (f_14_ * aFloat3606
			 + (f * aFloat3602 + aFloat3610 * f_13_));
	arg0[0]
	    = (int) (f_13_ * aFloat3603 + f * aFloat3609 + aFloat3608 * f_14_);
    }
    
    public void method178(int arg0) {
	aFloat3609 = 1.0F;
	aFloat3604 = aFloat3606 = Class96.aFloatArray1272[0x3fff & arg0];
	aFloat3611 = Class96.aFloatArray1273[arg0 & 0x3fff];
	aFloat3610 = -aFloat3611;
	aFloat3607 = aFloat3602 = aFloat3614 = aFloat3603 = aFloat3605
	    = aFloat3608 = aFloat3612 = 0.0F;
    }
    
    public void method189() {
	aFloat3609 = aFloat3604 = aFloat3606 = 1.0F;
	aFloat3603 = aFloat3608 = aFloat3607 = aFloat3611 = aFloat3602
	    = aFloat3610 = aFloat3614 = aFloat3605 = aFloat3612 = 0.0F;
    }
    
    public void method180(Class9 arg0) {
	Class9_Sub1 class9_sub1 = (Class9_Sub1) arg0;
	aFloat3610 = class9_sub1.aFloat3610;
	aFloat3607 = class9_sub1.aFloat3607;
	aFloat3609 = class9_sub1.aFloat3609;
	aFloat3603 = class9_sub1.aFloat3603;
	aFloat3611 = class9_sub1.aFloat3611;
	aFloat3614 = class9_sub1.aFloat3614;
	aFloat3605 = class9_sub1.aFloat3605;
	aFloat3606 = class9_sub1.aFloat3606;
	aFloat3604 = class9_sub1.aFloat3604;
	aFloat3608 = class9_sub1.aFloat3608;
	aFloat3602 = class9_sub1.aFloat3602;
	aFloat3612 = class9_sub1.aFloat3612;
    }
    
    public void method186(int arg0, int arg1, int arg2, int[] arg3) {
	arg3[2]
	    = (int) ((float) arg2 * aFloat3606
		     + ((float) arg1 * aFloat3611 + (float) arg0 * aFloat3608)
		     + aFloat3612);
	arg3[0] = (int) (aFloat3614 + ((float) arg2 * aFloat3602
				       + (aFloat3609 * (float) arg0
					  + aFloat3607 * (float) arg1)));
	arg3[1] = (int) (aFloat3605 + (aFloat3610 * (float) arg2
				       + ((float) arg1 * aFloat3604
					  + (float) arg0 * aFloat3603)));
    }
    
    public void method179(int arg0) {
	float f = Class96.aFloatArray1272[0x3fff & arg0];
	float f_15_ = Class96.aFloatArray1273[0x3fff & arg0];
	float f_16_ = aFloat3603;
	float f_17_ = aFloat3604;
	float f_18_ = aFloat3610;
	aFloat3603 = -(aFloat3608 * f_15_) + f * f_16_;
	float f_19_ = aFloat3605;
	aFloat3604 = -(aFloat3611 * f_15_) + f * f_17_;
	aFloat3608 = f_15_ * f_16_ + f * aFloat3608;
	aFloat3611 = f * aFloat3611 + f_17_ * f_15_;
	aFloat3610 = f_18_ * f - aFloat3606 * f_15_;
	aFloat3606 = f * aFloat3606 + f_15_ * f_18_;
	aFloat3605 = -(f_15_ * aFloat3612) + f_19_ * f;
	aFloat3612 = aFloat3612 * f + f_15_ * f_19_;
    }
    
    public float[] method197(int arg0) {
	float[] fs;
	try {
	    aFloatArray3613[0] = aFloat3609;
	    aFloatArray3613[12] = 0.0F;
	    aFloatArray3613[13] = 0.0F;
	    aFloatArray3613[1] = aFloat3603;
	    aFloatArray3613[8] = aFloat3602;
	    if (arg0 > -102)
		return null;
	    aFloatArray3613[14] = 0.0F;
	    aFloatArray3613[4] = aFloat3607;
	    aFloatArray3613[10] = aFloat3606;
	    aFloatArray3613[9] = aFloat3610;
	    aFloatArray3613[6] = aFloat3611;
	    aFloatArray3613[2] = aFloat3608;
	    aFloatArray3613[5] = aFloat3604;
	    fs = aFloatArray3613;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return fs;
    }
    
    public Class9_Sub1() {
	method189();
    }
}
