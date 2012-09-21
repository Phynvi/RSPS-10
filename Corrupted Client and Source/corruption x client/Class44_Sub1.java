/* Class44_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44_Sub1 extends Class44
{
    public int[] anIntArray3763;
    public byte[][] aByteArrayArray3764;
    public int[] anIntArray3765;
    public int[] anIntArray3766;
    public int[] anIntArray3767;
    public Class130_Sub1 aClass130_Sub1_3768;
    public int[] anIntArray3769;
    
    public void method549(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, Class183 arg12,
			  int arg13, int arg14) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg12;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_0_ = class183_sub1.anIntArray4963;
	int i = arg9 - aClass130_Sub1_3768.anInt4066;
	int i_1_ = arg10;
	if (arg14 > i_1_) {
	    i_1_ = arg14;
	    arg4 += (arg14 - arg10) * aClass130_Sub1_3768.anInt4029;
	    arg3 += (arg14 - arg10) * arg11;
	}
	int i_2_ = (arg14 + is.length < arg10 + arg6 ? arg14 + is.length
		    : arg10 + arg6);
	for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++) {
	    int i_4_ = is[i_3_ - arg14] + arg13;
	    int i_5_ = is_0_[i_3_ - arg14];
	    int i_6_ = arg5;
	    if (i > i_4_) {
		int i_7_ = i - i_4_;
		if (i_7_ >= i_5_) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		i_5_ -= i_7_;
	    } else {
		int i_8_ = i_4_ - i;
		if (i_8_ >= arg5) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		arg3 += i_8_;
		i_6_ -= i_8_;
		arg4 += i_8_;
	    }
	    int i_9_ = 0;
	    if (i_6_ < i_5_)
		i_5_ = i_6_;
	    else
		i_9_ = i_6_ - i_5_;
	    for (int i_10_ = -i_5_; i_10_ < 0; i_10_++) {
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg3 += i_9_ + arg3;
	    arg4 += i_9_ + arg7;
	}
    }
    
    public void method544(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	arg1 += anIntArray3767[arg0];
	arg2 += anIntArray3769[arg0];
	int i = anIntArray3763[arg0];
	int i_11_ = anIntArray3765[arg0];
	int i_12_ = aClass130_Sub1_3768.anInt4029;
	int i_13_ = arg1 + arg2 * i_12_;
	int i_14_ = i_12_ - i;
	int i_15_ = 0;
	int i_16_ = 0;
	if (arg2 < aClass130_Sub1_3768.anInt4061) {
	    int i_17_ = aClass130_Sub1_3768.anInt4061 - arg2;
	    i_11_ -= i_17_;
	    arg2 = aClass130_Sub1_3768.anInt4061;
	    i_16_ += i_17_ * i;
	    i_13_ += i_17_ * i_12_;
	}
	if (arg2 + i_11_ > aClass130_Sub1_3768.anInt4024)
	    i_11_ -= arg2 + i_11_ - aClass130_Sub1_3768.anInt4024;
	if (arg1 < aClass130_Sub1_3768.anInt4066) {
	    int i_18_ = aClass130_Sub1_3768.anInt4066 - arg1;
	    i -= i_18_;
	    arg1 = aClass130_Sub1_3768.anInt4066;
	    i_16_ += i_18_;
	    i_13_ += i_18_;
	    i_15_ += i_18_;
	    i_14_ += i_18_;
	}
	if (arg1 + i > aClass130_Sub1_3768.anInt4067) {
	    int i_19_ = arg1 + i - aClass130_Sub1_3768.anInt4067;
	    i -= i_19_;
	    i_15_ += i_19_;
	    i_14_ += i_19_;
	}
	if (i > 0 && i_11_ > 0) {
	    if (arg4)
		method552(aByteArrayArray3764[arg0],
			  aClass130_Sub1_3768.anIntArray4026, arg3, i_16_,
			  i_13_, i, i_11_, i_14_, i_15_);
	    else
		method550(aByteArrayArray3764[arg0],
			  aClass130_Sub1_3768.anIntArray4026, anIntArray3766,
			  i_16_, i_13_, i, i_11_, i_14_, i_15_);
	}
    }
    
    public void method550(byte[] arg0, int[] arg1, int[] arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	boolean bool = false;
	for (int i_20_ = -arg6; i_20_ < 0; i_20_++) {
	    for (int i_21_ = i; i_21_ < 0; i_21_++) {
		int i_22_;
		if ((i_22_ = arg0[arg3++]) != 0)
		    arg1[arg4++] = arg2[i_22_ & 0xff];
		else
		    arg4++;
		if ((i_22_ = arg0[arg3++]) != 0)
		    arg1[arg4++] = arg2[i_22_ & 0xff];
		else
		    arg4++;
		if ((i_22_ = arg0[arg3++]) != 0)
		    arg1[arg4++] = arg2[i_22_ & 0xff];
		else
		    arg4++;
		if ((i_22_ = arg0[arg3++]) != 0)
		    arg1[arg4++] = arg2[i_22_ & 0xff];
		else
		    arg4++;
	    }
	    for (int i_23_ = arg5; i_23_ < 0; i_23_++) {
		int i_24_;
		if ((i_24_ = arg0[arg3++]) != 0)
		    arg1[arg4++] = arg2[i_24_ & 0xff];
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method534(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4, Class183 arg5, int arg6, int arg7) {
	if (arg5 == null)
	    method544(arg0, arg1, arg2, arg3, arg4);
	else {
	    arg1 += anIntArray3767[arg0];
	    arg2 += anIntArray3769[arg0];
	    int i = anIntArray3763[arg0];
	    int i_25_ = anIntArray3765[arg0];
	    int i_26_ = aClass130_Sub1_3768.anInt4029;
	    int i_27_ = arg1 + arg2 * i_26_;
	    int i_28_ = i_26_ - i;
	    int i_29_ = 0;
	    int i_30_ = 0;
	    if (arg2 < aClass130_Sub1_3768.anInt4061) {
		int i_31_ = aClass130_Sub1_3768.anInt4061 - arg2;
		i_25_ -= i_31_;
		arg2 = aClass130_Sub1_3768.anInt4061;
		i_30_ += i_31_ * i;
		i_27_ += i_31_ * i_26_;
	    }
	    if (arg2 + i_25_ > aClass130_Sub1_3768.anInt4024)
		i_25_ -= arg2 + i_25_ - aClass130_Sub1_3768.anInt4024;
	    if (arg1 < aClass130_Sub1_3768.anInt4066) {
		int i_32_ = aClass130_Sub1_3768.anInt4066 - arg1;
		i -= i_32_;
		arg1 = aClass130_Sub1_3768.anInt4066;
		i_30_ += i_32_;
		i_27_ += i_32_;
		i_29_ += i_32_;
		i_28_ += i_32_;
	    }
	    if (arg1 + i > aClass130_Sub1_3768.anInt4067) {
		int i_33_ = arg1 + i - aClass130_Sub1_3768.anInt4067;
		i -= i_33_;
		i_29_ += i_33_;
		i_28_ += i_33_;
	    }
	    if (i > 0 && i_25_ > 0) {
		if (arg4)
		    method549(aByteArrayArray3764[arg0],
			      aClass130_Sub1_3768.anIntArray4026, arg3, i_30_,
			      i_27_, i, i_25_, i_28_, i_29_, arg1, arg2,
			      anIntArray3763[arg0], arg5, arg6, arg7);
		else
		    method551(aByteArrayArray3764[arg0],
			      aClass130_Sub1_3768.anIntArray4026,
			      anIntArray3766, arg3, i_30_, i_27_, i, i_25_,
			      i_28_, i_29_, arg1, arg2, anIntArray3763[arg0],
			      arg5, arg6, arg7);
	    }
	}
    }
    
    public void method551(byte[] arg0, int[] arg1, int[] arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, int arg12,
			  Class183 arg13, int arg14, int arg15) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg13;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_34_ = class183_sub1.anIntArray4963;
	int i = arg10 - aClass130_Sub1_3768.anInt4066;
	int i_35_ = arg11;
	if (arg15 > i_35_) {
	    i_35_ = arg15;
	    arg5 += (arg15 - arg11) * aClass130_Sub1_3768.anInt4029;
	    arg4 += (arg15 - arg11) * arg12;
	}
	int i_36_ = (arg15 + is.length < arg11 + arg7 ? arg15 + is.length
		     : arg11 + arg7);
	boolean bool = false;
	for (int i_37_ = i_35_; i_37_ < i_36_; i_37_++) {
	    int i_38_ = is[i_37_ - arg15] + arg14;
	    int i_39_ = is_34_[i_37_ - arg15];
	    int i_40_ = arg6;
	    if (i > i_38_) {
		int i_41_ = i - i_38_;
		if (i_41_ >= i_39_) {
		    arg4 += arg6 + arg9;
		    arg5 += arg6 + arg8;
		    continue;
		}
		i_39_ -= i_41_;
	    } else {
		int i_42_ = i_38_ - i;
		if (i_42_ >= arg6) {
		    arg4 += arg6 + arg9;
		    arg5 += arg6 + arg8;
		    continue;
		}
		arg4 += i_42_;
		i_40_ -= i_42_;
		arg5 += i_42_;
	    }
	    int i_43_ = 0;
	    if (i_40_ < i_39_)
		i_39_ = i_40_;
	    else
		i_43_ = i_40_ - i_39_;
	    for (int i_44_ = -i_39_; i_44_ < 0; i_44_++) {
		int i_45_;
		if ((i_45_ = arg0[arg4++]) != 0)
		    arg1[arg5++] = arg2[i_45_ & 0xff];
		else
		    arg5++;
	    }
	    arg4 += i_43_ + arg9;
	    arg5 += i_43_ + arg8;
	}
    }
    
    public void method552(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_46_ = -arg6; i_46_ < 0; i_46_++) {
	    for (int i_47_ = i; i_47_ < 0; i_47_++) {
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
	    for (int i_48_ = arg5; i_48_ < 0; i_48_++) {
		if (arg0[arg3++] != 0)
		    arg1[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class44_Sub1(Class130_Sub1 arg0, Class55 arg1, Class124[] arg2,
			int[] arg3, int[] arg4) {
	super(arg0, arg1);
	aClass130_Sub1_3768 = arg0;
	aClass130_Sub1_3768 = arg0;
	anIntArray3763 = arg3;
	anIntArray3765 = arg4;
	aByteArrayArray3764 = new byte[arg2.length][];
	anIntArray3769 = new int[arg2.length];
	anIntArray3767 = new int[arg2.length];
	for (int i = 0; i < arg2.length; i++) {
	    aByteArrayArray3764[i] = arg2[i].aByteArray1626;
	    anIntArray3769[i] = arg2[i].anInt1618;
	    anIntArray3767[i] = arg2[i].anInt1625;
	}
	anIntArray3766 = arg2[0].anIntArray1624;
    }
}
