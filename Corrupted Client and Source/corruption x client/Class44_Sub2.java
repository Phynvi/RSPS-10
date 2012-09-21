/* Class44_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44_Sub2 extends Class44
{
    public int[] anIntArray3770;
    public int[] anIntArray3771;
    public Class130_Sub1 aClass130_Sub1_3772;
    public int[] anIntArray3773;
    public int[] anIntArray3774;
    public byte[][] aByteArrayArray3775;
    
    public void method534(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4, Class183 arg5, int arg6, int arg7) {
	if (arg5 == null)
	    method544(arg0, arg1, arg2, arg3, arg4);
	else {
	    arg1 += anIntArray3774[arg0];
	    arg2 += anIntArray3773[arg0];
	    int i = anIntArray3771[arg0];
	    int i_0_ = anIntArray3770[arg0];
	    int i_1_ = aClass130_Sub1_3772.anInt4029;
	    int i_2_ = arg1 + arg2 * i_1_;
	    int i_3_ = i_1_ - i;
	    int i_4_ = 0;
	    int i_5_ = 0;
	    if (arg2 < aClass130_Sub1_3772.anInt4061) {
		int i_6_ = aClass130_Sub1_3772.anInt4061 - arg2;
		i_0_ -= i_6_;
		arg2 = aClass130_Sub1_3772.anInt4061;
		i_5_ += i_6_ * i;
		i_2_ += i_6_ * i_1_;
	    }
	    if (arg2 + i_0_ > aClass130_Sub1_3772.anInt4024)
		i_0_ -= arg2 + i_0_ - aClass130_Sub1_3772.anInt4024;
	    if (arg1 < aClass130_Sub1_3772.anInt4066) {
		int i_7_ = aClass130_Sub1_3772.anInt4066 - arg1;
		i -= i_7_;
		arg1 = aClass130_Sub1_3772.anInt4066;
		i_5_ += i_7_;
		i_2_ += i_7_;
		i_4_ += i_7_;
		i_3_ += i_7_;
	    }
	    if (arg1 + i > aClass130_Sub1_3772.anInt4067) {
		int i_8_ = arg1 + i - aClass130_Sub1_3772.anInt4067;
		i -= i_8_;
		i_4_ += i_8_;
		i_3_ += i_8_;
	    }
	    if (i > 0 && i_0_ > 0)
		method554(aByteArrayArray3775[arg0],
			  aClass130_Sub1_3772.anIntArray4026, arg3, i_5_, i_2_,
			  i, i_0_, i_3_, i_4_, arg1, arg2,
			  anIntArray3771[arg0], arg5, arg6, arg7);
	}
    }
    
    public void method553(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	for (int i = -arg6; i < 0; i++) {
	    for (int i_9_ = -arg5; i_9_ < 0; i_9_++) {
		int i_10_ = arg0[arg3++] & 0xff;
		if (i_10_ != 0) {
		    int i_11_ = ((((arg2 & 0xff00ff) * i_10_ & ~0xff00ff)
				  + ((arg2 & 0xff00) * i_10_ & 0xff0000))
				 >> 8);
		    i_10_ = 256 - i_10_;
		    int i_12_ = arg1[arg4];
		    arg1[arg4++] = ((((i_12_ & 0xff00ff) * i_10_ & ~0xff00ff)
				     + ((i_12_ & 0xff00) * i_10_ & 0xff0000))
				    >> 8) + i_11_;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class44_Sub2(Class130_Sub1 arg0, Class55 arg1, Class124[] arg2,
			int[] arg3, int[] arg4) {
	super(arg0, arg1);
	aClass130_Sub1_3772 = arg0;
	aClass130_Sub1_3772 = arg0;
	anIntArray3771 = arg3;
	anIntArray3770 = arg4;
	aByteArrayArray3775 = new byte[arg2.length][];
	anIntArray3773 = new int[arg2.length];
	anIntArray3774 = new int[arg2.length];
	for (int i = 0; i < arg2.length; i++) {
	    aByteArrayArray3775[i] = arg2[i].aByteArray1622;
	    anIntArray3773[i] = arg2[i].anInt1618;
	    anIntArray3774[i] = arg2[i].anInt1625;
	}
    }
    
    public void method554(byte[] arg0, int[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, Class183 arg12,
			  int arg13, int arg14) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg12;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_13_ = class183_sub1.anIntArray4963;
	int i = arg9 - aClass130_Sub1_3772.anInt4066;
	int i_14_ = arg10;
	if (arg14 > i_14_) {
	    i_14_ = arg14;
	    arg4 += (arg14 - arg10) * aClass130_Sub1_3772.anInt4029;
	    arg3 += (arg14 - arg10) * arg11;
	}
	int i_15_ = (arg14 + is.length < arg10 + arg6 ? arg14 + is.length
		     : arg10 + arg6);
	for (int i_16_ = i_14_; i_16_ < i_15_; i_16_++) {
	    int i_17_ = is[i_16_ - arg14] + arg13;
	    int i_18_ = is_13_[i_16_ - arg14];
	    int i_19_ = arg5;
	    if (i > i_17_) {
		int i_20_ = i - i_17_;
		if (i_20_ >= i_18_) {
		    arg3 += arg5 + arg8;
		    arg4 += arg5 + arg7;
		    continue;
		}
		i_18_ -= i_20_;
	    } else {
		int i_21_ = i_17_ - i;
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
	    for (int i_23_ = -i_18_; i_23_ < 0; i_23_++) {
		int i_24_ = arg0[arg3++] & 0xff;
		if (i_24_ != 0) {
		    int i_25_ = ((((arg2 & 0xff00ff) * i_24_ & ~0xff00ff)
				  + ((arg2 & 0xff00) * i_24_ & 0xff0000))
				 >> 8);
		    i_24_ = 256 - i_24_;
		    int i_26_ = arg1[arg4];
		    arg1[arg4++] = ((((i_26_ & 0xff00ff) * i_24_ & ~0xff00ff)
				     + ((i_26_ & 0xff00) * i_24_ & 0xff0000))
				    >> 8) + i_25_;
		} else
		    arg4++;
	    }
	    arg3 += i_22_ + arg8;
	    arg4 += i_22_ + arg7;
	}
    }
    
    public void method544(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	arg1 += anIntArray3774[arg0];
	arg2 += anIntArray3773[arg0];
	int i = anIntArray3771[arg0];
	int i_27_ = anIntArray3770[arg0];
	int i_28_ = aClass130_Sub1_3772.anInt4029;
	int i_29_ = arg1 + arg2 * i_28_;
	int i_30_ = i_28_ - i;
	int i_31_ = 0;
	int i_32_ = 0;
	if (arg2 < aClass130_Sub1_3772.anInt4061) {
	    int i_33_ = aClass130_Sub1_3772.anInt4061 - arg2;
	    i_27_ -= i_33_;
	    arg2 = aClass130_Sub1_3772.anInt4061;
	    i_32_ += i_33_ * i;
	    i_29_ += i_33_ * i_28_;
	}
	if (arg2 + i_27_ > aClass130_Sub1_3772.anInt4024)
	    i_27_ -= arg2 + i_27_ - aClass130_Sub1_3772.anInt4024;
	if (arg1 < aClass130_Sub1_3772.anInt4066) {
	    int i_34_ = aClass130_Sub1_3772.anInt4066 - arg1;
	    i -= i_34_;
	    arg1 = aClass130_Sub1_3772.anInt4066;
	    i_32_ += i_34_;
	    i_29_ += i_34_;
	    i_31_ += i_34_;
	    i_30_ += i_34_;
	}
	if (arg1 + i > aClass130_Sub1_3772.anInt4067) {
	    int i_35_ = arg1 + i - aClass130_Sub1_3772.anInt4067;
	    i -= i_35_;
	    i_31_ += i_35_;
	    i_30_ += i_35_;
	}
	if (i > 0 && i_27_ > 0)
	    method553(aByteArrayArray3775[arg0],
		      aClass130_Sub1_3772.anIntArray4026, arg3, i_32_, i_29_,
		      i, i_27_, i_30_, i_31_);
    }
}
