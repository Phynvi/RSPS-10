/* Class44_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44_Sub4 extends Class44
{
    public int[] anIntArray3780;
    public byte[][] aByteArrayArray3781;
    public int[] anIntArray3782;
    public Class130_Sub1 aClass130_Sub1_3783;
    public int[] anIntArray3784;
    public int[] anIntArray3785;
    
    public void method544(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	arg1 += anIntArray3782[arg0];
	arg2 += anIntArray3780[arg0];
	int i = anIntArray3784[arg0];
	int i_0_ = anIntArray3785[arg0];
	int i_1_ = aClass130_Sub1_3783.anInt4029;
	int i_2_ = arg1 + arg2 * i_1_;
	int i_3_ = i_1_ - i;
	int i_4_ = 0;
	int i_5_ = 0;
	if (arg2 < aClass130_Sub1_3783.anInt4061) {
	    int i_6_ = aClass130_Sub1_3783.anInt4061 - arg2;
	    i_0_ -= i_6_;
	    arg2 = aClass130_Sub1_3783.anInt4061;
	    i_5_ += i_6_ * i;
	    i_2_ += i_6_ * i_1_;
	}
	if (arg2 + i_0_ > aClass130_Sub1_3783.anInt4024)
	    i_0_ -= arg2 + i_0_ - aClass130_Sub1_3783.anInt4024;
	if (arg1 < aClass130_Sub1_3783.anInt4066) {
	    int i_7_ = aClass130_Sub1_3783.anInt4066 - arg1;
	    i -= i_7_;
	    arg1 = aClass130_Sub1_3783.anInt4066;
	    i_5_ += i_7_;
	    i_2_ += i_7_;
	    i_4_ += i_7_;
	    i_3_ += i_7_;
	}
	if (arg1 + i > aClass130_Sub1_3783.anInt4067) {
	    int i_8_ = arg1 + i - aClass130_Sub1_3783.anInt4067;
	    i -= i_8_;
	    i_4_ += i_8_;
	    i_3_ += i_8_;
	}
	if (i > 0 && i_0_ > 0) {
	    if ((arg3 & ~0xffffff) == -16777216)
		method557(aByteArrayArray3781[arg0],
			  aClass130_Sub1_3783.anIntArray4026, arg3, i_5_, i_2_,
			  i, i_0_, i_3_, i_4_);
	    else if ((arg3 & ~0xffffff) != 0)
		method555(aByteArrayArray3781[arg0],
			  aClass130_Sub1_3783.anIntArray4026, arg3, i_5_, i_2_,
			  i, i_0_, i_3_, i_4_);
	}
    }
    
    public Class44_Sub4(Class130_Sub1 arg0, Class55 arg1, Class124[] arg2,
			int[] arg3, int[] arg4) {
	super(arg0, arg1);
	aClass130_Sub1_3783 = arg0;
	anIntArray3784 = arg3;
	anIntArray3785 = arg4;
	aByteArrayArray3781 = new byte[arg2.length][];
	anIntArray3780 = new int[arg2.length];
	anIntArray3782 = new int[arg2.length];
	for (int i = 0; i < arg2.length; i++) {
	    aByteArrayArray3781[i] = arg2[i].aByteArray1626;
	    anIntArray3780[i] = arg2[i].anInt1618;
	    anIntArray3782[i] = arg2[i].anInt1625;
	}
    }
    
    public void method555(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = arg2 >>> 24;
	int i_9_ = 255 - i;
	for (int i_10_ = -arg6; i_10_ < 0; i_10_++) {
	    for (int i_11_ = -arg5; i_11_ < 0; i_11_++) {
		if (arg0[arg3++] != 0) {
		    int i_12_ = ((((arg2 & 0xff00ff) * i & ~0xff00ff)
				  + ((arg2 & 0xff00) * i & 0xff0000))
				 >> 8);
		    int i_13_ = arg1[arg4];
		    arg1[arg4++] = ((((i_13_ & 0xff00ff) * i_9_ & ~0xff00ff)
				     + ((i_13_ & 0xff00) * i_9_ & 0xff0000))
				    >> 8) + i_12_;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method556(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, Class183 arg12,
			  int arg13, int arg14) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg12;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_14_ = class183_sub1.anIntArray4963;
	int i = arg10;
	if (arg14 > i) {
	    i = arg14;
	    arg4 += (arg14 - arg10) * aClass130_Sub1_3783.anInt4029;
	    arg3 += (arg14 - arg10) * arg11;
	}
	int i_15_ = (arg14 + is.length < arg10 + arg6 ? arg14 + is.length
		     : arg10 + arg6);
	for (int i_16_ = i; i_16_ < i_15_; i_16_++) {
	    int i_17_ = arg13 + is[i_16_ - arg14];
	    int i_18_ = is_14_[i_16_ - arg14];
	    int i_19_ = arg5;
	    if (arg9 > i_17_) {
		int i_20_ = arg9 - i_17_;
		if (i_20_ >= i_18_) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		i_18_ -= i_20_;
	    } else {
		int i_21_ = i_17_ - arg9;
		if (i_21_ >= arg5) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		arg3 += i_21_;
		i_19_ -= i_21_;
		arg4 += i_21_;
	    }
	    int i_22_ = 0;
	    if (i_19_ < i_18_)
		i_18_ = i_19_;
	    else
		i_22_ = i_19_ - i_18_;
	    for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg3 += i_22_ + arg8;
	    arg4 += i_22_ + arg7;
	}
    }
    
    public void method557(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_24_ = -arg6; i_24_ < 0; i_24_++) {
	    for (int i_25_ = i; i_25_ < 0; i_25_++) {
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_26_ = arg5; i_26_ < 0; i_26_++) {
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method558(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, Class183 arg12,
			  int arg13, int arg14) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg12;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_27_ = class183_sub1.anIntArray4963;
	int i = arg9 - aClass130_Sub1_3783.anInt4066;
	int i_28_ = arg10;
	if (arg14 > i_28_) {
	    i_28_ = arg14;
	    arg4 += (arg14 - arg10) * aClass130_Sub1_3783.anInt4029;
	    arg3 += (arg14 - arg10) * arg11;
	}
	int i_29_ = (arg14 + is.length < arg10 + arg6 ? arg14 + is.length
		     : arg10 + arg6);
	int i_30_ = arg2 >>> 24;
	int i_31_ = 255 - i_30_;
	for (int i_32_ = i_28_; i_32_ < i_29_; i_32_++) {
	    int i_33_ = is[i_32_ - arg14] + arg13;
	    int i_34_ = is_27_[i_32_ - arg14];
	    int i_35_ = arg5;
	    if (i > i_33_) {
		int i_36_ = i - i_33_;
		if (i_36_ >= i_34_) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		i_34_ -= i_36_;
	    } else {
		int i_37_ = i_33_ - i;
		if (i_37_ >= arg5) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		arg3 += i_37_;
		i_35_ -= i_37_;
		arg4 += i_37_;
	    }
	    int i_38_ = 0;
	    if (i_35_ < i_34_)
		i_34_ = i_35_;
	    else
		i_38_ = i_35_ - i_34_;
	    for (int i_39_ = -i_34_; i_39_ < 0; i_39_++) {
		if (arg0[arg3++] != 0) {
		    int i_40_ = ((((arg2 & 0xff00ff) * i_30_ & ~0xff00ff)
				  + ((arg2 & 0xff00) * i_30_ & 0xff0000))
				 >> 8);
		    int i_41_ = arg1[arg4];
		    arg1[arg4++] = ((((i_41_ & 0xff00ff) * i_31_ & ~0xff00ff)
				     + ((i_41_ & 0xff00) * i_31_ & 0xff0000))
				    >> 8) + i_40_;
		} else
		    arg4++;
	    }
	    arg3 += i_38_ + arg8;
	    arg4 += i_38_ + arg7;
	}
    }
    
    public void method534(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4, Class183 arg5, int arg6, int arg7) {
	if (arg5 == null)
	    method544(arg0, arg1, arg2, arg3, arg4);
	else {
	    arg1 += anIntArray3782[arg0];
	    arg2 += anIntArray3780[arg0];
	    int i = anIntArray3784[arg0];
	    int i_42_ = anIntArray3785[arg0];
	    int i_43_ = aClass130_Sub1_3783.anInt4029;
	    int i_44_ = arg1 + arg2 * i_43_;
	    int i_45_ = i_43_ - i;
	    int i_46_ = 0;
	    int i_47_ = 0;
	    if (arg2 < aClass130_Sub1_3783.anInt4061) {
		int i_48_ = aClass130_Sub1_3783.anInt4061 - arg2;
		i_42_ -= i_48_;
		arg2 = aClass130_Sub1_3783.anInt4061;
		i_47_ += i_48_ * i;
		i_44_ += i_48_ * i_43_;
	    }
	    if (arg2 + i_42_ > aClass130_Sub1_3783.anInt4024)
		i_42_ -= arg2 + i_42_ - aClass130_Sub1_3783.anInt4024;
	    if (arg1 < aClass130_Sub1_3783.anInt4066) {
		int i_49_ = aClass130_Sub1_3783.anInt4066 - arg1;
		i -= i_49_;
		arg1 = aClass130_Sub1_3783.anInt4066;
		i_47_ += i_49_;
		i_44_ += i_49_;
		i_46_ += i_49_;
		i_45_ += i_49_;
	    }
	    if (arg1 + i > aClass130_Sub1_3783.anInt4067) {
		int i_50_ = arg1 + i - aClass130_Sub1_3783.anInt4067;
		i -= i_50_;
		i_46_ += i_50_;
		i_45_ += i_50_;
	    }
	    if (i > 0 && i_42_ > 0) {
		if ((arg3 & ~0xffffff) == -16777216)
		    method556(aByteArrayArray3781[arg0],
			      aClass130_Sub1_3783.anIntArray4026, arg3, i_47_,
			      i_44_, i, i_42_, i_45_, i_46_, arg1, arg2,
			      anIntArray3784[arg0], arg5, arg6, arg7);
		else
		    method558(aByteArrayArray3781[arg0],
			      aClass130_Sub1_3783.anIntArray4026, arg3, i_47_,
			      i_44_, i, i_42_, i_45_, i_46_, arg1, arg2,
			      anIntArray3784[arg0], arg5, arg6, arg7);
	    }
	}
    }
}
