/* Class131_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub34 extends Class131
{
    public int anInt4559;
    public Class130_Sub2 aClass130_Sub2_4560;
    public float[][] aFloatArrayArray4561;
    public Interface7 anInterface7_4562;
    public Class68_Sub1 aClass68_Sub1_4563;
    public Class180 aClass180_4564;
    public Interface2 anInterface2_4565;
    public int anInt4566;
    public float[][] aFloatArrayArray4567;
    public float[][] aFloatArrayArray4568;
    public Class131_Sub8 aClass131_Sub8_4569;
    public Class7 aClass7_4570;
    public int anInt4571;
    public int anInt4572;
    public Stream aStream_4573;
    public RawStream aClass131_Sub15_Sub1_4574;
    public int anInt4575;
    public Class7 aClass7_4576;
    public int anInt4577;

    public void method1869(int arg0, short arg1) {
	if (arg0 > -23)
	    method1870(-115, -80, 75, 30, -19, (byte) -64, 51);
	if (!aClass130_Sub2_4560.aBoolean3360)
	    aStream_4573.method1773(677910600, arg1);
	else
	    aStream_4573.writeShort(arg1);
	anInt4572++;
    }
    
    public void method1870(int arg0, int arg1, int arg2, int arg3, int arg4,
			   byte arg5, int arg6) {
	long l = -1L;
	int i = (arg0 << aClass68_Sub1_4563.anInt3811) + arg4;
	int i_0_ = arg1 + (arg2 << aClass68_Sub1_4563.anInt3811);
	int i_1_ = aClass68_Sub1_4563.method720(i, i_0_);
	if (0 == (0x7f & arg4) || 0 == (arg1 & 0x7f)) {
	    l = ((long) i_0_ & 0xffffL) << 619030608 | (long) i & 0xffffL;
	    Class131 class131 = aClass180_4564.method2521(-115, l);
	    if (null != class131) {
		method1869(-89, ((Class131_Sub25) class131).aShort4475);
		return;
	    }
	}
	short i_2_ = (short) anInt4566++;
	if (0L != (l ^ 0xffffffffffffffffL))
	    aClass180_4564.method2523(false, l, new Class131_Sub25(i_2_));
	float f;
	float f_3_;
	float f_4_;
	if (arg4 != 0 || 0 != arg1) {
	    if ((aClass68_Sub1_4563.anInt3822 ^ 0xffffffff) != (arg4
								^ 0xffffffff)
		|| -1 != (arg1 ^ 0xffffffff)) {
		if (arg4 == aClass68_Sub1_4563.anInt3822
		    && (arg1 ^ 0xffffffff) == (aClass68_Sub1_4563.anInt3822
					       ^ 0xffffffff)) {
		    f_4_ = aFloatArrayArray4561[arg3 - -1][arg6 + 1];
		    f = aFloatArrayArray4568[1 + arg3][arg6 - -1];
		    f_3_ = aFloatArrayArray4567[1 + arg3][1 + arg6];
		} else if (-1 != (arg4 ^ 0xffffffff)
			   || ((arg1 ^ 0xffffffff)
			       != (aClass68_Sub1_4563.anInt3822
				   ^ 0xffffffff))) {
		    float f_5_
			= (float) arg4 / (float) aClass68_Sub1_4563.anInt3822;
		    float f_6_
			= (float) arg1 / (float) aClass68_Sub1_4563.anInt3822;
		    float f_7_ = aFloatArrayArray4568[arg3][arg6];
		    float f_8_ = aFloatArrayArray4567[arg3][arg6];
		    float f_9_ = aFloatArrayArray4561[arg3][arg6];
		    float f_10_ = aFloatArrayArray4568[1 + arg3][arg6];
		    float f_11_ = aFloatArrayArray4567[1 + arg3][arg6];
		    f_10_
			+= f_5_ * (-f_10_
				   + aFloatArrayArray4568[arg3 + 1][1 + arg6]);
		    f_7_ += ((aFloatArrayArray4568[arg3][1 + arg6] - f_7_)
			     * f_5_);
		    f_11_
			+= ((-f_11_ + aFloatArrayArray4567[1 + arg3][1 + arg6])
			    * f_5_);
		    f_9_ += ((aFloatArrayArray4561[arg3][1 + arg6] - f_9_)
			     * f_5_);
		    float f_12_ = aFloatArrayArray4561[1 + arg3][arg6];
		    f_8_ += ((aFloatArrayArray4567[arg3][arg6 - -1] - f_8_)
			     * f_5_);
		    f_12_ += f_5_ * (aFloatArrayArray4561[arg3 + 1][1 + arg6]
				     - f_12_);
		    f = f_7_ + (f_10_ - f_7_) * f_6_;
		    f_3_ = f_8_ + (f_11_ - f_8_) * f_6_;
		    f_4_ = f_6_ * (-f_9_ + f_12_) + f_9_;
		} else {
		    f_3_ = aFloatArrayArray4567[arg3][1 + arg6];
		    f = aFloatArrayArray4568[arg3][1 + arg6];
		    f_4_ = aFloatArrayArray4561[arg3][1 + arg6];
		}
	    } else {
		f = aFloatArrayArray4568[1 + arg3][arg6];
		f_4_ = aFloatArrayArray4561[1 + arg3][arg6];
		f_3_ = aFloatArrayArray4567[1 + arg3][arg6];
	    }
	} else {
	    f = aFloatArrayArray4568[arg3][arg6];
	    f_3_ = aFloatArrayArray4567[arg3][arg6];
	    f_4_ = aFloatArrayArray4561[arg3][arg6];
	}
	float f_13_ = (float) (aClass131_Sub8_4569.anInt4195 + -i);
	float f_14_ = (float) (aClass131_Sub8_4569.anInt4185 - i_1_);
	float f_15_ = (float) (-i_0_ + aClass131_Sub8_4569.anInt4191);
	float f_16_ = (float) Math.sqrt((double) (f_14_ * f_14_ + f_13_ * f_13_
						  + f_15_ * f_15_));
	float f_17_ = 1.0F / f_16_;
	f_15_ *= f_17_;
	f_13_ *= f_17_;
	f_14_ *= f_17_;
	float f_18_ = f_16_ / (float) aClass131_Sub8_4569.anInt4192;
	float f_19_ = -(f_18_ * f_18_) + 1.0F;
	if (0.0F > f_19_)
	    f_19_ = 0.0F;
	float f_20_ = f_3_ * f_14_ + f * f_13_ + f_15_ * f_4_;
	if (0.0F > f_20_)
	    f_20_ = 0.0F;
	float f_21_ = f_20_ * f_19_ * 2.0F;
	if (f_21_ > 1.0F)
	    f_21_ = 1.0F;
	int i_22_ = aClass131_Sub8_4569.anInt4189;
	int i_23_
	    = (int) (f_21_ * (float) ((i_22_ & 0xffaf5a) >> -1455322032));
	if (i_23_ > 255)
	    i_23_ = 255;
	int i_24_ = (int) (f_21_ * (float) ((0xff4b & i_22_) >> 706910280));
	if ((i_24_ ^ 0xffffffff) < -256)
	    i_24_ = 255;
	int i_25_ = (int) (f_21_ * (float) (i_22_ & 0xff));
	if (!aClass130_Sub2_4560.aBoolean3360) {
	    aClass131_Sub15_Sub1_4574.method1782((float) i, (byte) -30);
	    aClass131_Sub15_Sub1_4574.method1782((float) i_1_, (byte) -30);
	    aClass131_Sub15_Sub1_4574.method1782((float) i_0_, (byte) -30);
	} else {
	    aClass131_Sub15_Sub1_4574.method1783((float) i, (byte) 126);
	    aClass131_Sub15_Sub1_4574.method1783((float) i_1_, (byte) 126);
	    aClass131_Sub15_Sub1_4574.method1783((float) i_0_, (byte) 126);
	}
	if (arg5 < 35)
	    aFloatArrayArray4567 = null;
	if ((i_25_ ^ 0xffffffff) < -256)
	    i_25_ = 255;
	aClass131_Sub15_Sub1_4574.writeByte(i_23_);
	aClass131_Sub15_Sub1_4574.writeByte(i_24_);
	aClass131_Sub15_Sub1_4574.writeByte(i_25_);
	aClass131_Sub15_Sub1_4574.writeByte(255);
	method1869(-97, i_2_);
    }
    
    public void method1871(int arg0, int arg1, boolean[][] arg2, byte arg3,
			   int arg4) {
	if (null != anInterface7_4562 && anInt4559 <= arg1 + arg0
	    && (anInt4575 ^ 0xffffffff) <= (arg0 - arg1 ^ 0xffffffff)
	    && (arg1 + arg4 ^ 0xffffffff) <= (anInt4577 ^ 0xffffffff)
	    && anInt4571 >= -arg1 + arg4) {
	    for (int i = anInt4577;
		 (anInt4571 ^ 0xffffffff) <= (i ^ 0xffffffff); i++) {
		for (int i_26_ = anInt4559;
		     (i_26_ ^ 0xffffffff) >= (anInt4575 ^ 0xffffffff);
		     i_26_++) {
		    int i_27_ = i_26_ - arg0;
		    int i_28_ = i - arg4;
		    if ((-arg1 ^ 0xffffffff) > (i_27_ ^ 0xffffffff)
			&& i_27_ < arg1
			&& (-arg1 ^ 0xffffffff) > (i_28_ ^ 0xffffffff)
			&& arg1 > i_28_ && arg2[arg1 + i_27_][i_28_ - -arg1]) {
			aClass130_Sub2_4560.method1316
			    ((int) (255.0F * aClass131_Sub8_4569.aFloat4187)
			     << -1887478024);
			aClass130_Sub2_4560.method1305(aClass7_4570, null,
						       aClass7_4576, null);
			aClass130_Sub2_4560.method1312(anInterface7_4562, 4, 0,
						       anInt4572);
			return;
		    }
		}
	    }
	    if (arg3 != -29)
		method1870(16, 18, -113, 85, 115, (byte) 43, -21);
	}
    }
    
    public Class131_Sub34(Class130_Sub2 arg0, Class68_Sub1 arg1,
			  Class131_Sub8 arg2, int[] arg3) {
	aClass131_Sub8_4569 = arg2;
	aClass68_Sub1_4563 = arg1;
	aClass130_Sub2_4560 = arg0;
	int i
	    = aClass131_Sub8_4569.anInt4192 + -(arg1.anInt3822 >> -1883084991);
	anInt4559 = aClass131_Sub8_4569.anInt4195 + -i >> arg1.anInt3811;
	anInt4575 = aClass131_Sub8_4569.anInt4195 + i >> arg1.anInt3811;
	anInt4577 = aClass131_Sub8_4569.anInt4191 + -i >> arg1.anInt3811;
	anInt4571 = i + aClass131_Sub8_4569.anInt4191 >> arg1.anInt3811;
	int i_29_ = -anInt4559 + (anInt4575 - -1);
	int i_30_ = anInt4571 - (anInt4577 + -1);
	aFloatArrayArray4568 = new float[1 + i_29_][i_30_ + 1];
	aFloatArrayArray4567 = new float[i_29_ - -1][i_30_ + 1];
	aFloatArrayArray4561 = new float[1 + i_29_][i_30_ + 1];
	for (int i_31_ = 0; (i_31_ ^ 0xffffffff) >= (i_30_ ^ 0xffffffff);
	     i_31_++) {
	    int i_32_ = anInt4577 + i_31_;
	    if (i_32_ > 0 && i_32_ < -1 + aClass68_Sub1_4563.anInt916) {
		for (int i_33_ = 0; i_33_ <= i_29_; i_33_++) {
		    int i_34_ = i_33_ - -anInt4559;
		    if (i_34_ > 0
			&& aClass68_Sub1_4563.anInt924 + -1 > i_34_) {
			int i_35_ = (arg1.method712(i_34_ - -1, i_32_)
				     + -arg1.method712(i_34_ + -1, i_32_));
			int i_36_ = (arg1.method712(i_34_, 1 + i_32_)
				     + -arg1.method712(i_34_, i_32_ + -1));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_36_ * i_36_
							     + i_35_ * i_35_
							     - -65536)));
			aFloatArrayArray4568[i_33_][i_31_] = (float) i_35_ * f;
			aFloatArrayArray4567[i_33_][i_31_] = f * -256.0F;
			aFloatArrayArray4561[i_33_][i_31_] = (float) i_36_ * f;
		    }
		}
	    }
	}
	int i_37_ = 0;
	int i_38_ = 0;
	for (int i_39_ = anInt4577; i_39_ <= anInt4571; i_39_++) {
	    if ((i_39_ ^ 0xffffffff) <= -1
		&& (i_39_ ^ 0xffffffff) > (arg1.anInt916 ^ 0xffffffff)) {
		for (int i_40_ = anInt4559;
		     (i_40_ ^ 0xffffffff) >= (anInt4575 ^ 0xffffffff);
		     i_40_++) {
		    if (i_40_ >= 0 && i_40_ < arg1.anInt924) {
			int i_41_ = arg3[i_38_];
			int[] is = arg1.anIntArrayArrayArray3826[i_40_][i_39_];
			if (null != is && -1 != (i_41_ ^ 0xffffffff)) {
			    if ((i_41_ ^ 0xffffffff) == -2)
				i_37_ += is.length;
			    else
				i_37_ += 3;
			}
		    }
		    i_38_++;
		}
	    } else
		i_38_ += anInt4575 - anInt4559;
	}
	if ((i_37_ ^ 0xffffffff) < -1) {
	    aStream_4573 = new Stream(2 * i_37_);
	    aClass131_Sub15_Sub1_4574 = new RawStream(16 * i_37_);
	    aClass180_4564
		= new Class180(Class101.method887(1388313616, i_37_));
	    int i_42_ = 0;
	    i_38_ = 0;
	    for (int i_43_ = anInt4577; anInt4571 >= i_43_; i_43_++) {
		if ((i_43_ ^ 0xffffffff) <= -1
		    && (i_43_ ^ 0xffffffff) > (arg1.anInt916 ^ 0xffffffff)) {
		    int i_44_ = 0;
		    for (int i_45_ = anInt4559; anInt4575 >= i_45_; i_45_++) {
			if ((i_45_ ^ 0xffffffff) <= -1
			    && i_45_ < arg1.anInt924) {
			    int i_46_ = arg3[i_38_];
			    int[] is
				= arg1.anIntArrayArrayArray3826[i_45_][i_43_];
			    int[] is_47_
				= arg1.anIntArrayArrayArray3820[i_45_][i_43_];
			    if (null != is && (i_46_ ^ 0xffffffff) != -1) {
				if ((i_46_ ^ 0xffffffff) != -2) {
				    if (-4 == (i_46_ ^ 0xffffffff)) {
					method1870(i_45_, 0, i_43_, i_44_, 0,
						   (byte) 124, i_42_);
					method1870(i_45_, 0, i_43_, i_44_,
						   arg1.anInt3822, (byte) 53,
						   i_42_);
					method1870(i_45_, arg1.anInt3822,
						   i_43_, i_44_, 0, (byte) 118,
						   i_42_);
				    } else if (i_46_ != 2) {
					if (-6 == (i_46_ ^ 0xffffffff)) {
					    method1870(i_45_, arg1.anInt3822,
						       i_43_, i_44_,
						       arg1.anInt3822,
						       (byte) 90, i_42_);
					    method1870(i_45_, arg1.anInt3822,
						       i_43_, i_44_, 0,
						       (byte) 86, i_42_);
					    method1870(i_45_, 0, i_43_, i_44_,
						       arg1.anInt3822,
						       (byte) 105, i_42_);
					} else if (4 == i_46_) {
					    method1870(i_45_, arg1.anInt3822,
						       i_43_, i_44_, 0,
						       (byte) 54, i_42_);
					    method1870(i_45_, 0, i_43_, i_44_,
						       0, (byte) 40, i_42_);
					    method1870(i_45_, arg1.anInt3822,
						       i_43_, i_44_,
						       arg1.anInt3822,
						       (byte) 42, i_42_);
					}
				    } else {
					method1870(i_45_, 0, i_43_, i_44_,
						   arg1.anInt3822, (byte) 75,
						   i_42_);
					method1870(i_45_, arg1.anInt3822,
						   i_43_, i_44_,
						   arg1.anInt3822, (byte) 107,
						   i_42_);
					method1870(i_45_, 0, i_43_, i_44_, 0,
						   (byte) 100, i_42_);
				    }
				} else {
				    for (int i_48_ = 0;
					 ((i_48_ ^ 0xffffffff)
					  > (is.length ^ 0xffffffff));
					 i_48_++)
					method1870(i_45_, is_47_[i_48_], i_43_,
						   i_44_, is[i_48_], (byte) 40,
						   i_42_);
				}
			    }
			}
			i_44_++;
			i_38_++;
		    }
		} else
		    i_38_ += -anInt4559 + anInt4575;
		i_42_++;
	    }
	    anInterface7_4562
		= aClass130_Sub2_4560.method1287(5123,
						 (aStream_4573
						  .data),
						 (aStream_4573
						  .offset),
						 false);
	    anInterface2_4565
		= aClass130_Sub2_4560.method1301(16,
						 (aClass131_Sub15_Sub1_4574
						  .data),
						 (aClass131_Sub15_Sub1_4574
						  .offset),
						 false);
	    aClass7_4570 = new Class7(aClass130_Sub2_4560, anInterface2_4565,
				      5126, 3, 0);
	    aClass7_4576 = new Class7(aClass130_Sub2_4560, anInterface2_4565,
				      5121, 4, 12);
	} else {
	    aClass7_4570 = null;
	    aClass7_4576 = null;
	    anInterface2_4565 = null;
	    anInterface7_4562 = null;
	}
	aClass131_Sub15_Sub1_4574 = null;
	aFloatArrayArray4568 = aFloatArrayArray4567 = aFloatArrayArray4561
	    = null;
	aClass180_4564 = null;
	aStream_4573 = null;
    }
}
