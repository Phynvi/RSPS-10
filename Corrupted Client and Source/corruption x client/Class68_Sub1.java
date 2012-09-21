/* Class68_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import jaggl.opengl;

public class Class68_Sub1 extends Class68
{
    public Class130_Sub2 aClass130_Sub2_3810;
    public int anInt3811;
    public int anInt3812;
    public static Stream aStream_3813 = new Stream(1);
    public int anInt3814;
    public byte[][] aByteArrayArray3815;
    public static int anInt3816;
    public Class131_Sub28[][][] aClass131_Sub28ArrayArrayArray3817;
    public int[][] anIntArrayArray3818;
    public int[][][] anIntArrayArrayArray3819;
    public int[][][] anIntArrayArrayArray3820;
    public static float[] aFloatArray3821 = new float[16];
    public int anInt3822;
    public Class206 aClass206_3823;
    public int[][][] anIntArrayArrayArray3824;
    public int[][][] anIntArrayArrayArray3825;
    public int[][][] anIntArrayArrayArray3826;
    public static int[] anIntArray3827 = new int[1];
    public static int[] anIntArray3828 = new int[1];
    public int anInt3829;
    public static int[] anIntArray3830 = new int[1];
    public short[][] aShortArrayArray3831;
    public Class119 aClass119_3832 = new Class119();
    public Class131_Sub28[] aClass131_Sub28Array3833;
    public Class7 aClass7_3834;
    public float[][] aFloatArrayArray3835;
    public int anInt3836;
    public Class7 aClass7_3837;
    public int anInt3838;
    public float[][] aFloatArrayArray3839;
    public int[][] anIntArrayArray3840;
    public byte[][] aByteArrayArray3841;
    public float[][] aFloatArrayArray3842;
    public Class7 aClass7_3843;
    public Class7 aClass7_3844;
    public Interface2 anInterface2_3845;
    public Class180 aClass180_3846;

    public void method715(int arg0, int arg1, int arg2) {
	if ((aByteArrayArray3841[arg0][arg1] & 0xff) < arg2)
	    aByteArrayArray3841[arg0][arg1] = (byte) arg2;
    }
    
    public void method713() {
	if (anInt3838 > 0) {
	    byte[][] is = new byte[anInt924 + 1][anInt916 + 1];
	    for (int i = 1; i < anInt924; i++) {
		for (int i_0_ = 1; i_0_ < anInt916; i_0_++)
		    is[i][i_0_]
			= (byte) ((aByteArrayArray3841[i - 1][i_0_] >> 2)
				  + (aByteArrayArray3841[i + 1][i_0_] >> 3)
				  + (aByteArrayArray3841[i][i_0_ - 1] >> 2)
				  + (aByteArrayArray3841[i][i_0_ + 1] >> 3)
				  + (aByteArrayArray3841[i][i_0_] >> 1));
	    }
	    aClass131_Sub28Array3833
		= new Class131_Sub28[aClass180_3846.method2522(17167)];
	    aClass180_3846.method2528(aClass131_Sub28Array3833, 0);
	    for (int i = 0; i < aClass131_Sub28Array3833.length; i++)
		aClass131_Sub28Array3833[i].method1845(anInt3838, 65535);
	    int i = 24;
	    if (anIntArrayArray3840 != null)
		i += 4;
	    if ((anInt3812 & 0x7) != 0)
		i += 12;
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect
					(anInt3838 * i)
					.order(ByteOrder.nativeOrder());
	    Class131_Sub28[] class131_sub28s = new Class131_Sub28[anInt3838];
	    Class180 class180
		= new Class180(Class144.method2152(anInt3838, (byte) 99));
	    Class131_Sub28[] class131_sub28s_1_
		= new Class131_Sub28[anInt3836];
	    for (int i_2_ = 0; i_2_ < anInt924; i_2_++) {
		for (int i_3_ = 0; i_3_ < anInt916; i_3_++) {
		    if (anIntArrayArrayArray3825[i_2_][i_3_] != null) {
			Class131_Sub28[] class131_sub28s_4_
			    = aClass131_Sub28ArrayArrayArray3817[i_2_][i_3_];
			int[] is_5_ = anIntArrayArrayArray3824[i_2_][i_3_];
			int[] is_6_ = anIntArrayArrayArray3826[i_2_][i_3_];
			int[] is_7_ = anIntArrayArrayArray3820[i_2_][i_3_];
			int[] is_8_ = anIntArrayArrayArray3819[i_2_][i_3_];
			int[] is_9_ = anIntArrayArrayArray3825[i_2_][i_3_];
			if (is_8_ == null)
			    is_8_ = is_9_;
			float f = aFloatArrayArray3842[i_2_][i_3_];
			float f_10_ = aFloatArrayArray3839[i_2_][i_3_];
			float f_11_ = aFloatArrayArray3835[i_2_][i_3_];
			float f_12_ = aFloatArrayArray3842[i_2_][i_3_ + 1];
			float f_13_ = aFloatArrayArray3839[i_2_][i_3_ + 1];
			float f_14_ = aFloatArrayArray3835[i_2_][i_3_ + 1];
			float f_15_ = aFloatArrayArray3842[i_2_ + 1][i_3_ + 1];
			float f_16_ = aFloatArrayArray3839[i_2_ + 1][i_3_ + 1];
			float f_17_ = aFloatArrayArray3835[i_2_ + 1][i_3_ + 1];
			float f_18_ = aFloatArrayArray3842[i_2_ + 1][i_3_];
			float f_19_ = aFloatArrayArray3839[i_2_ + 1][i_3_];
			float f_20_ = aFloatArrayArray3835[i_2_ + 1][i_3_];
			int i_21_ = is[i_2_][i_3_] & 0xff;
			int i_22_ = is[i_2_][i_3_ + 1] & 0xff;
			int i_23_ = is[i_2_ + 1][i_3_ + 1] & 0xff;
			int i_24_ = is[i_2_ + 1][i_3_] & 0xff;
			float f_25_;
			float f_26_;
			float f_27_;
			float f_28_;
			if (anIntArrayArray3840 != null) {
			    f_25_ = (float) anIntArrayArray3840[i_2_][i_3_];
			    f_26_
				= (float) anIntArrayArray3840[i_2_][i_3_ + 1];
			    f_27_ = (float) (anIntArrayArray3840[i_2_ + 1]
					     [i_3_ + 1]);
			    f_28_
				= (float) anIntArrayArray3840[i_2_ + 1][i_3_];
			} else
			    f_25_ = f_26_ = f_27_ = f_28_ = 0.0F;
			int i_29_ = 0;
		    while_78_:
			for (int i_30_ = 0; i_30_ < is_9_.length; i_30_++) {
			    Class131_Sub28 class131_sub28
				= class131_sub28s_4_[i_30_];
			    for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
				if (class131_sub28s_1_[i_31_]
				    == class131_sub28)
				    continue while_78_;
			    }
			    class131_sub28s_1_[i_29_++] = class131_sub28;
			}
			short[] is_32_
			    = (aShortArrayArray3831[i_3_ * anInt924 + i_2_]
			       = new short[is_9_.length]);
			for (int i_33_ = 0; i_33_ < is_9_.length; i_33_++) {
			    int i_34_ = (i_2_ << anInt3811) + is_6_[i_33_];
			    int i_35_ = (i_3_ << anInt3811) + is_7_[i_33_];
			    int i_36_ = is_9_[i_33_];
			    int i_37_ = is_8_[i_33_];
			    int i_38_ = is_5_ != null ? is_5_[i_33_] : 0;
			    long l = ((long) i_37_ << 48 | (long) i_36_ << 32
				      | (long) (i_34_ << 16) | (long) i_35_);
			    int i_39_ = is_6_[i_33_];
			    int i_40_ = is_7_[i_33_];
			    int i_41_ = 74;
			    int i_42_ = 0;
			    float f_43_ = 1.0F;
			    float f_44_;
			    float f_45_;
			    float f_46_;
			    float f_47_;
			    if (i_39_ == 0 && i_40_ == 0) {
				f_44_ = f;
				f_45_ = f_10_;
				f_46_ = f_11_;
				f_47_ = f_25_;
				i_41_ -= i_21_;
			    } else if (i_39_ == 0 && i_40_ == anInt3822) {
				f_44_ = f_12_;
				f_45_ = f_13_;
				f_46_ = f_14_;
				f_47_ = f_26_;
				i_41_ -= i_22_;
			    } else if (i_39_ == anInt3822
				       && i_40_ == anInt3822) {
				f_44_ = f_15_;
				f_45_ = f_16_;
				f_46_ = f_17_;
				f_47_ = f_27_;
				i_41_ -= i_23_;
			    } else if (i_39_ == anInt3822 && i_40_ == 0) {
				f_44_ = f_18_;
				f_45_ = f_19_;
				f_46_ = f_20_;
				f_47_ = f_28_;
				i_41_ -= i_24_;
			    } else {
				float f_48_
				    = (float) i_39_ / (float) anInt3822;
				float f_49_
				    = (float) i_40_ / (float) anInt3822;
				float f_50_ = f + (f_18_ - f) * f_48_;
				float f_51_ = f_10_ + (f_19_ - f_10_) * f_48_;
				float f_52_ = f_11_ + (f_20_ - f_11_) * f_48_;
				float f_53_ = f_12_ + (f_15_ - f_12_) * f_48_;
				float f_54_ = f_13_ + (f_16_ - f_13_) * f_48_;
				float f_55_ = f_14_ + (f_17_ - f_14_) * f_48_;
				f_44_ = f_50_ + (f_53_ - f_50_) * f_49_;
				f_45_ = f_51_ + (f_54_ - f_51_) * f_49_;
				f_46_ = f_52_ + (f_55_ - f_52_) * f_49_;
				int i_56_ = i_21_ + ((i_24_ - i_21_) * i_39_
						     >> anInt3811);
				int i_57_ = i_22_ + ((i_23_ - i_22_) * i_39_
						     >> anInt3811);
				i_41_ -= i_56_ + ((i_57_ - i_56_) * i_40_
						  >> anInt3811);
				float f_58_ = f_25_ + (f_28_ - f_25_) * f_48_;
				float f_59_ = f_26_ + (f_27_ - f_26_) * f_48_;
				f_47_ = f_58_ + (f_59_ - f_58_) * f_49_;
			    }
			    if (i_36_ != -1) {
				int i_60_ = (i_36_ & 0x7f) * i_41_ >> 7;
				if (i_60_ < 2)
				    i_60_ = 2;
				else if (i_60_ > 126)
				    i_60_ = 126;
				i_42_ = (Class131_Sub2_Sub37.anIntArray6058
					 [i_36_ & 0xff80 | i_60_]);
				if ((anInt3812 & 0x7) == 0) {
				    f_43_ = ((aClass130_Sub2_3810
					      .aFloatArray3368[0]) * f_44_
					     + (aClass130_Sub2_3810
						.aFloatArray3368[1]) * f_45_
					     + (aClass130_Sub2_3810
						.aFloatArray3368[2]) * f_46_);
				    f_43_ = (aClass130_Sub2_3810.aFloat3407
					     + f_43_ * (f_43_ > 0.0F
							? (aClass130_Sub2_3810
							   .aFloat3332)
							: (aClass130_Sub2_3810
							   .aFloat3389)));
				}
			    }
			    Class131 class131 = class180.method2521(-104, l);
			    int i_61_;
			    if (class131 == null) {
				int i_62_;
				if (i_37_ != i_36_) {
				    int i_63_ = (i_37_ & 0x7f) * i_41_ >> 7;
				    if (i_63_ < 2)
					i_63_ = 2;
				    else if (i_63_ > 126)
					i_63_ = 126;
				    i_62_ = (Class131_Sub2_Sub37.anIntArray6058
					     [i_37_ & 0xff80 | i_63_]);
				    if ((anInt3812 & 0x7) == 0) {
					float f_64_
					    = ((aClass130_Sub2_3810
						.aFloatArray3368[0]) * f_44_
					       + (aClass130_Sub2_3810
						  .aFloatArray3368[1]) * f_45_
					       + ((aClass130_Sub2_3810
						   .aFloatArray3368[2])
						  * f_46_));
					f_64_ = (aClass130_Sub2_3810.aFloat3407
						 + (f_43_
						    * (f_43_ > 0.0F
						       ? (aClass130_Sub2_3810
							  .aFloat3332)
						       : (aClass130_Sub2_3810
							  .aFloat3389))));
					int i_65_ = i_62_ >> 16 & 0xff;
					int i_66_ = i_62_ >> 8 & 0xff;
					int i_67_ = i_62_ & 0xff;
					i_65_ *= f_64_;
					if (i_65_ < 0)
					    i_65_ = 0;
					else if (i_65_ > 255)
					    i_65_ = 255;
					i_66_ *= f_64_;
					if (i_66_ < 0)
					    i_66_ = 0;
					else if (i_66_ > 255)
					    i_66_ = 255;
					i_67_ *= f_64_;
					if (i_67_ < 0)
					    i_67_ = 0;
					else if (i_67_ > 255)
					    i_67_ = 255;
					i_62_
					    = i_65_ << 16 | i_66_ << 8 | i_67_;
				    }
				} else
				    i_62_ = i_42_;
				bytebuffer.putFloat((float) i_34_);
				bytebuffer.putFloat((float) (method720(i_34_,
								       i_35_)
							     + i_38_));
				bytebuffer.putFloat((float) i_35_);
				bytebuffer.put((byte) (i_62_ >> 16));
				bytebuffer.put((byte) (i_62_ >> 8));
				bytebuffer.put((byte) i_62_);
				bytebuffer.put((byte) -1);
				bytebuffer.putFloat((float) i_34_);
				bytebuffer.putFloat((float) i_35_);
				if (anIntArrayArray3840 != null)
				    bytebuffer.putFloat(f_47_ + (float) i_38_);
				if ((anInt3812 & 0x7) != 0) {
				    bytebuffer.putFloat(f_44_);
				    bytebuffer.putFloat(f_45_);
				    bytebuffer.putFloat(f_46_);
				}
				i_61_ = anInt3814++;
				is_32_[i_33_] = (short) i_61_;
				if (i_36_ != -1)
				    class131_sub28s[i_61_]
					= class131_sub28s_4_[i_33_];
				class180.method2523
				    (false, l,
				     new Class131_Sub25(is_32_[i_33_]));
			    } else {
				is_32_[i_33_]
				    = ((Class131_Sub25) class131).aShort4475;
				i_61_ = is_32_[i_33_] & 0xffff;
				if (i_36_ != -1
				    && (class131_sub28s_4_[i_33_].aLong1791
					< class131_sub28s[i_61_].aLong1791))
				    class131_sub28s[i_61_]
					= class131_sub28s_4_[i_33_];
			    }
			    for (int i_68_ = 0; i_68_ < i_29_; i_68_++)
				class131_sub28s_1_[i_68_].method1847(i_41_,
								     106,
								     i_61_,
								     i_42_,
								     f_43_);
			    anInt3829++;
			}
		    }
		}
	    }
	    for (int i_69_ = 0; i_69_ < anInt3814; i_69_++) {
		Class131_Sub28 class131_sub28 = class131_sub28s[i_69_];
		if (class131_sub28 != null)
		    class131_sub28.method1842(-105, i_69_);
	    }
	    for (int i_70_ = 0; i_70_ < anInt924; i_70_++) {
		for (int i_71_ = 0; i_71_ < anInt916; i_71_++) {
		    short[] is_72_
			= aShortArrayArray3831[i_71_ * anInt924 + i_70_];
		    if (is_72_ != null) {
			int i_73_ = 0;
			int i_74_ = 0;
			while (i_74_ < is_72_.length) {
			    int i_75_ = is_72_[i_74_++] & 0xffff;
			    int i_76_ = is_72_[i_74_++] & 0xffff;
			    int i_77_ = is_72_[i_74_++] & 0xffff;
			    Class131_Sub28 class131_sub28
				= class131_sub28s[i_75_];
			    Class131_Sub28 class131_sub28_78_
				= class131_sub28s[i_76_];
			    Class131_Sub28 class131_sub28_79_
				= class131_sub28s[i_77_];
			    Class131_Sub28 class131_sub28_80_ = null;
			    if (class131_sub28 != null) {
				class131_sub28.method1843(1, i_73_, i_70_,
							  i_71_);
				class131_sub28_80_ = class131_sub28;
			    }
			    if (class131_sub28_78_ != null) {
				class131_sub28_78_.method1843(1, i_73_, i_70_,
							      i_71_);
				if (class131_sub28_80_ == null
				    || (class131_sub28_78_.aLong1791
					< class131_sub28_80_.aLong1791))
				    class131_sub28_80_ = class131_sub28_78_;
			    }
			    if (class131_sub28_79_ != null) {
				class131_sub28_79_.method1843(1, i_73_, i_70_,
							      i_71_);
				if (class131_sub28_80_ == null
				    || (class131_sub28_79_.aLong1791
					< class131_sub28_80_.aLong1791))
				    class131_sub28_80_ = class131_sub28_79_;
			    }
			    if (class131_sub28_80_ != null) {
				if (class131_sub28 != null)
				    class131_sub28_80_.method1842(-97, i_75_);
				if (class131_sub28_78_ != null)
				    class131_sub28_80_.method1842(-73, i_76_);
				if (class131_sub28_79_ != null)
				    class131_sub28_80_.method1842(-96, i_77_);
				class131_sub28_80_.method1843(1, i_73_, i_70_,
							      i_71_);
			    }
			    i_73_++;
			}
		    }
		}
	    }
	    bytebuffer.flip();
	    anInterface2_3845
		= aClass130_Sub2_3810.method1283(i, bytebuffer, false);
	    aClass7_3843 = new Class7(aClass130_Sub2_3810, anInterface2_3845,
				      5126, 3, 0);
	    aClass7_3844 = new Class7(aClass130_Sub2_3810, anInterface2_3845,
				      5121, 4, 12);
	    int i_81_;
	    if (anIntArrayArray3840 != null) {
		aClass7_3834 = new Class7(aClass130_Sub2_3810,
					  anInterface2_3845, 5126, 3, 16);
		i_81_ = 28;
	    } else {
		aClass7_3834 = new Class7(aClass130_Sub2_3810,
					  anInterface2_3845, 5126, 2, 16);
		i_81_ = 24;
	    }
	    if ((anInt3812 & 0x7) != 0) {
		aClass7_3837 = new Class7(aClass130_Sub2_3810,
					  anInterface2_3845, 5126, 3, i_81_);
		i_81_ += 12;
	    }
	    long[] ls = new long[aClass131_Sub28Array3833.length];
	    for (int i_82_ = 0; i_82_ < aClass131_Sub28Array3833.length;
		 i_82_++) {
		Class131_Sub28 class131_sub28
		    = aClass131_Sub28Array3833[i_82_];
		ls[i_82_] = class131_sub28.aLong1791;
		class131_sub28.method1846(anInt3814, 120);
	    }
	    Class113.method960(aClass131_Sub28Array3833, 0, ls);
	    if (aClass206_3823 != null)
		aClass206_3823.method2745(-17567);
	} else
	    aClass206_3823 = null;
	anIntArrayArrayArray3826 = anIntArrayArrayArray3820 = null;
	anIntArrayArrayArray3819 = null;
	anIntArrayArrayArray3824 = null;
	aClass131_Sub28ArrayArrayArray3817 = null;
	anIntArrayArrayArray3825 = null;
	aByteArrayArray3841 = null;
	aClass180_3846 = null;
	anIntArrayArray3840 = null;
	aFloatArrayArray3842 = aFloatArrayArray3839 = aFloatArrayArray3835
	    = null;
    }
    
    public int method712(int arg0, int arg1) {
	return anIntArrayArray3818[arg0][arg1];
    }
    
    public void method723(int arg0, int arg1, int[] arg2, int[] arg3,
			  int[] arg4, int[] arg5, int[] arg6, int[] arg7,
			  int[] arg8, int[] arg9, int[] arg10, int[] arg11,
			  int arg12, int arg13, boolean arg14) {
	int i = arg8.length;
	int[] is = new int[i * 3];
	int[] is_83_ = new int[i * 3];
	int[] is_84_ = new int[i * 3];
	int[] is_85_ = new int[i * 3];
	int[] is_86_ = new int[i * 3];
	int[] is_87_ = new int[i * 3];
	int[] is_88_ = arg3 != null ? new int[i * 3] : null;
	int i_89_ = 0;
	for (int i_90_ = 0; i_90_ < i; i_90_++) {
	    int i_91_ = arg5[i_90_];
	    int i_92_ = arg6[i_90_];
	    int i_93_ = arg7[i_90_];
	    is[i_89_] = arg2[i_91_];
	    is_83_[i_89_] = arg4[i_91_];
	    is_84_[i_89_] = arg8[i_90_];
	    is_85_[i_89_] = arg9[i_90_];
	    is_86_[i_89_] = arg10[i_90_];
	    is_87_[i_89_] = arg11[i_90_];
	    if (arg3 != null)
		is_88_[i_89_] = arg3[i_91_];
	    i_89_++;
	    is[i_89_] = arg2[i_92_];
	    is_83_[i_89_] = arg4[i_92_];
	    is_84_[i_89_] = arg8[i_90_];
	    is_85_[i_89_] = arg9[i_90_];
	    is_86_[i_89_] = arg10[i_90_];
	    is_87_[i_89_] = arg11[i_90_];
	    if (arg3 != null)
		is_88_[i_89_] = arg3[i_92_];
	    i_89_++;
	    is[i_89_] = arg2[i_93_];
	    is_83_[i_89_] = arg4[i_93_];
	    is_84_[i_89_] = arg8[i_90_];
	    is_85_[i_89_] = arg9[i_90_];
	    is_86_[i_89_] = arg10[i_90_];
	    is_87_[i_89_] = arg11[i_90_];
	    if (arg3 != null)
		is_88_[i_89_] = arg3[i_93_];
	    i_89_++;
	}
	method726(arg0, arg1, is, is_88_, is_83_, is_84_, is_85_, is_86_,
		  is_87_, arg12, arg13, arg14);
    }
    
    public void method719(Class131_Sub8 arg0, int[] arg1) {
	aClass119_3832.method1018((byte) -125,
				  new Class131_Sub34(aClass130_Sub2_3810, this,
						     arg0, arg1));
    }
    
    public void method710(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean[][] arg7) {
	if (anInt3838 > 0) {
	    opengl var_opengl = aClass130_Sub2_3810.anOpengl3304;
	    aClass130_Sub2_3810.method1321();
	    aClass130_Sub2_3810.method1338(false);
	    aClass130_Sub2_3810.method1325(false);
	    aClass130_Sub2_3810.method1293(false);
	    aClass130_Sub2_3810.method1345(false);
	    aClass130_Sub2_3810.method1284(0);
	    aClass130_Sub2_3810.method1322(-2);
	    aClass130_Sub2_3810.method1347(null);
	    aFloatArray3821[0]
		= (float) arg2 / (128.0F * (float) anInt3822
				  * (float) aClass130_Sub2_3810.anInt3323);
	    aFloatArray3821[1] = 0.0F;
	    aFloatArray3821[2] = 0.0F;
	    aFloatArray3821[3] = 0.0F;
	    aFloatArray3821[4] = 0.0F;
	    aFloatArray3821[5]
		= (float) arg2 / (128.0F * (float) anInt3822
				  * (float) aClass130_Sub2_3810.anInt3318);
	    aFloatArray3821[6] = 0.0F;
	    aFloatArray3821[7] = 0.0F;
	    aFloatArray3821[8] = 0.0F;
	    aFloatArray3821[9] = 0.0F;
	    aFloatArray3821[10] = 0.0F;
	    aFloatArray3821[11] = 0.0F;
	    aFloatArray3821[12]
		= -1.0F - (((float) (arg3 * arg2) / 128.0F
			    - (float) (arg0 * 2))
			   / (float) aClass130_Sub2_3810.anInt3323);
	    aFloatArray3821[13]
		= 1.0F - (((float) (2 * arg1) + (float) (arg6 * arg2) / 128.0F)
			  / (float) aClass130_Sub2_3810.anInt3318);
	    aFloatArray3821[14] = 0.0F;
	    aFloatArray3821[15] = 1.0F;
	    var_opengl.glMatrixMode(5889);
	    var_opengl.glLoadMatrixf(aFloatArray3821, 0);
	    aFloatArray3821[0] = 1.0F;
	    aFloatArray3821[1] = 0.0F;
	    aFloatArray3821[2] = 0.0F;
	    aFloatArray3821[3] = 0.0F;
	    aFloatArray3821[4] = 0.0F;
	    aFloatArray3821[5] = 0.0F;
	    aFloatArray3821[6] = 1.0F;
	    aFloatArray3821[7] = 0.0F;
	    aFloatArray3821[8] = 0.0F;
	    aFloatArray3821[9] = 1.0F;
	    aFloatArray3821[10] = 0.0F;
	    aFloatArray3821[11] = 0.0F;
	    aFloatArray3821[12] = 0.0F;
	    aFloatArray3821[13] = 0.0F;
	    aFloatArray3821[14] = 0.0F;
	    aFloatArray3821[15] = 1.0F;
	    var_opengl.glMatrixMode(5888);
	    var_opengl.glLoadMatrixf(aFloatArray3821, 0);
	    if ((anInt3812 & 0x7) != 0) {
		aClass130_Sub2_3810.method1325(true);
		aClass130_Sub2_3810.method1349();
	    } else
		aClass130_Sub2_3810.method1325(false);
	    aClass130_Sub2_3810.method1305(aClass7_3843, aClass7_3837,
					   aClass7_3844, aClass7_3834);
	    if (aStream_3813.data.length < anInt3829 * 2)
		aStream_3813 = new Stream(anInt3829 * 2);
	    else
		aStream_3813.offset = 0;
	    int i = 0;
	    if (aClass130_Sub2_3810.aBoolean3360) {
		for (int i_94_ = arg4; i_94_ < arg6; i_94_++) {
		    int i_95_ = i_94_ * anInt924 + arg3;
		    for (int i_96_ = arg3; i_96_ < arg5; i_96_++) {
			if (arg7[i_96_ - arg3][i_94_ - arg4]) {
			    short[] is = aShortArrayArray3831[i_95_];
			    if (is != null) {
				for (int i_97_ = 0; i_97_ < is.length;
				     i_97_++) {
				    aStream_3813.writeShort(is[i_97_]);
				    i++;
				}
			    }
			}
			i_95_++;
		    }
		}
	    } else {
		for (int i_98_ = arg4; i_98_ < arg6; i_98_++) {
		    int i_99_ = i_98_ * anInt924 + arg3;
		    for (int i_100_ = arg3; i_100_ < arg5; i_100_++) {
			if (arg7[i_100_ - arg3][i_98_ - arg4]) {
			    short[] is = aShortArrayArray3831[i_99_];
			    if (is != null) {
				for (int i_101_ = 0; i_101_ < is.length;
				     i_101_++) {
				    aStream_3813
					.method1773(677910600, is[i_101_]);
				    i++;
				}
			    }
			}
			i_99_++;
		    }
		}
	    }
	    if (i > 0) {
		aClass130_Sub2_3810.anInterface7_3430.method26
		    (5123, aStream_3813.data,
		     aStream_3813.offset);
		aClass130_Sub2_3810.method1312((aClass130_Sub2_3810
						.anInterface7_3430),
					       4, 0, i);
	    }
	}
    }
    
    public void method729(Class131_Sub41_Sub13_Sub1 arg0, int arg1, int arg2) {
	int[] is = anIntArrayArrayArray3826[arg1][arg2];
	int[] is_102_ = anIntArrayArrayArray3820[arg1][arg2];
	int i = is.length;
	if (anIntArray3830.length < i) {
	    anIntArray3830 = new int[i];
	    anIntArray3827 = new int[i];
	}
	for (int i_103_ = 0; i_103_ < i; i_103_++) {
	    anIntArray3830[i_103_]
		= (is[i_103_] & 0xff) >> aClass130_Sub2_3810.anInt3321;
	    anIntArray3827[i_103_]
		= (is_102_[i_103_] & 0xff) >> aClass130_Sub2_3810.anInt3321;
	}
	int i_104_ = 0;
	while (i_104_ < i) {
	    int i_105_ = anIntArray3830[i_104_];
	    int i_106_ = anIntArray3827[i_104_++];
	    int i_107_ = anIntArray3830[i_104_];
	    int i_108_ = anIntArray3827[i_104_++];
	    int i_109_ = anIntArray3830[i_104_];
	    int i_110_ = anIntArray3827[i_104_++];
	    if (((i_105_ - i_107_) * (i_108_ - i_110_)
		 - (i_108_ - i_106_) * (i_109_ - i_107_))
		> 0)
		arg0.method2020(i_109_, i_105_, i_106_, i_108_, -113, i_110_,
				i_107_);
	}
    }
    
    public Class131_Sub41_Sub13 method728(int arg0, int arg1,
					  Class131_Sub41_Sub13 arg2) {
	if ((aByteArrayArray3815[arg0][arg1] & 0x1) == 0)
	    return null;
	int i = anInt3822 >> aClass130_Sub2_3810.anInt3321;
	Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1
	    = (Class131_Sub41_Sub13_Sub1) arg2;
	Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1_111_;
	if (class131_sub41_sub13_sub1 != null
	    && class131_sub41_sub13_sub1.method2017(i, true, i)) {
	    class131_sub41_sub13_sub1_111_ = class131_sub41_sub13_sub1;
	    class131_sub41_sub13_sub1_111_.method2019(110);
	} else
	    class131_sub41_sub13_sub1_111_
		= new Class131_Sub41_Sub13_Sub1(aClass130_Sub2_3810, i, i);
	class131_sub41_sub13_sub1_111_.method2016((byte) -40, i, 0, 0, i);
	method729(class131_sub41_sub13_sub1_111_, arg0, arg1);
	return class131_sub41_sub13_sub1_111_;
    }
    
    public void method726(int arg0, int arg1, int[] arg2, int[] arg3,
			  int[] arg4, int[] arg5, int[] arg6, int[] arg7,
			  int[] arg8, int arg9, int arg10, boolean arg11) {
	anIntArrayArrayArray3824[arg0][arg1] = arg3;
	anIntArrayArrayArray3826[arg0][arg1] = arg2;
	anIntArrayArrayArray3820[arg0][arg1] = arg4;
	anIntArrayArrayArray3825[arg0][arg1] = arg5;
	anIntArrayArrayArray3819[arg0][arg1] = arg6;
	Class131_Sub28[] class131_sub28s
	    = (aClass131_Sub28ArrayArrayArray3817[arg0][arg1]
	       = new Class131_Sub28[arg5.length]);
	for (int i = 0; i < arg5.length; i++) {
	    long l = ((long) arg10 << 48 | (long) arg9 << 32
		      | (long) (arg7[i] << 16) | (long) arg8[i]);
	    Class131 class131 = aClass180_3846.method2521(-121, l);
	    if (class131 == null) {
		class131_sub28s[i]
		    = new Class131_Sub28(this, arg7[i], arg8[i], arg9, arg10);
		aClass180_3846.method2523(false, l, class131_sub28s[i]);
	    } else
		class131_sub28s[i] = (Class131_Sub28) class131;
	}
	if (arg11)
	    aByteArrayArray3815[arg0][arg1] |= 0x1;
	if (arg5.length > anInt3836)
	    anInt3836 = arg5.length;
	anInt3838 += arg5.length;
    }
    
    public void method721(Class131_Sub41_Sub13 arg0, int arg1, int arg2,
			  int arg3, int arg4, boolean arg5) {
	if (aClass206_3823 != null && arg0 != null) {
	    int i = (arg1 - (arg2 * aClass130_Sub2_3810.anInt3367 >> 8)
		     >> aClass130_Sub2_3810.anInt3321);
	    int i_112_ = (arg3 - (arg2 * aClass130_Sub2_3810.anInt3394 >> 8)
			  >> aClass130_Sub2_3810.anInt3321);
	    aClass206_3823.method2739(i, arg0, -1, i_112_);
	}
    }
    
    public void method709(Class131_Sub41_Sub13 arg0, int arg1, int arg2,
			  int arg3, int arg4, boolean arg5) {
	if (aClass206_3823 != null && arg0 != null) {
	    int i = (arg1 - (arg2 * aClass130_Sub2_3810.anInt3367 >> 8)
		     >> aClass130_Sub2_3810.anInt3321);
	    int i_113_ = (arg3 - (arg2 * aClass130_Sub2_3810.anInt3394 >> 8)
			  >> aClass130_Sub2_3810.anInt3321);
	    aClass206_3823.method2742(i, arg0, -1, i_113_);
	}
    }
    
    public void method711(int arg0, int arg1, int arg2, boolean[][] arg3,
			  boolean arg4) {
	if (aClass131_Sub28Array3833 != null) {
	    float f = aClass130_Sub2_3810.aFloat3413;
	    float f_114_ = aClass130_Sub2_3810.aFloat3384;
	    int i = arg2 + arg2 + 1;
	    i *= i;
	    if (anIntArray3828.length < i)
		anIntArray3828 = new int[i];
	    if (aStream_3813.data.length < anInt3829 * 2)
		aStream_3813 = new Stream(anInt3829 * 2);
	    int i_115_ = arg0 - arg2;
	    int i_116_ = i_115_;
	    if (i_115_ < 0)
		i_115_ = 0;
	    int i_117_ = arg1 - arg2;
	    int i_118_ = i_117_;
	    if (i_117_ < 0)
		i_117_ = 0;
	    int i_119_ = arg0 + arg2;
	    if (i_119_ > anInt924 - 1)
		i_119_ = anInt924 - 1;
	    int i_120_ = arg1 + arg2;
	    if (i_120_ > anInt916 - 1)
		i_120_ = anInt916 - 1;
	    anInt3816 = 0;
	    for (int i_121_ = i_115_; i_121_ <= i_119_; i_121_++) {
		boolean[] bools = arg3[i_121_ - i_116_];
		for (int i_122_ = i_117_; i_122_ <= i_120_; i_122_++) {
		    if (bools[i_122_ - i_118_])
			anIntArray3828[anInt3816++]
			    = i_122_ * anInt924 + i_121_;
		}
	    }
	    aClass130_Sub2_3810.method1329();
	    aClass130_Sub2_3810.method1325((anInt3812 & 0x7) != 0);
	    for (int i_123_ = 0; i_123_ < aClass131_Sub28Array3833.length - 0;
		 i_123_++)
		aClass131_Sub28Array3833[i_123_].method1844(anIntArray3828,
							    anInt3816, 21873);
	    if (!aClass119_3832.method1015(127)) {
		int i_124_ = aClass130_Sub2_3810.anInt3387;
		int i_125_ = aClass130_Sub2_3810.anInt3353;
		aClass130_Sub2_3810.method1212(0, i_125_);
		aClass130_Sub2_3810.method1252(f_114_, f - 4.0F);
		aClass130_Sub2_3810.method1325(false);
		aClass130_Sub2_3810.method1345(false);
		aClass130_Sub2_3810.method1284(130);
		aClass130_Sub2_3810.method1322(-2);
		aClass130_Sub2_3810
		    .method1347(aClass130_Sub2_3810.aClass36_Sub1_3401);
		aClass130_Sub2_3810.method1314(8448, 7681);
		aClass130_Sub2_3810.method1298(0, 34166, 770);
		aClass130_Sub2_3810.method1277(0, 34167, 770);
		for (Class131 class131 = aClass119_3832.method1007(0);
		     class131 != null;
		     class131 = aClass119_3832.method1014(0)) {
		    Class131_Sub34 class131_sub34 = (Class131_Sub34) class131;
		    class131_sub34.method1871(arg0, arg2, arg3, (byte) -29,
					      arg1);
		}
		aClass130_Sub2_3810.method1298(0, 5890, 768);
		aClass130_Sub2_3810.method1277(0, 5890, 770);
		aClass130_Sub2_3810.method1347(null);
		aClass130_Sub2_3810.method1212(i_124_, i_125_);
	    }
	    if (aClass206_3823 != null) {
		aClass130_Sub2_3810.method1252(f_114_, f - 8.0F);
		aClass130_Sub2_3810.method1329();
		aClass130_Sub2_3810.method1305(aClass7_3843, null, null,
					       aClass7_3834);
		aClass206_3823.method2744(arg2, 5888, arg0, arg4, arg3, arg1);
	    }
	    aClass130_Sub2_3810.method1252(f_114_, f);
	}
    }
    
    public Class68_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, int[][] arg5, int[][] arg6, int arg7) {
	super(arg3, arg4);
	aClass130_Sub2_3810 = arg0;
	anIntArrayArray3818 = arg5;
	anIntArrayArray3840 = arg6;
	anInt3812 = arg2;
	for (/**/; arg7 > 1; arg7 >>= 1)
	    anInt3811++;
	anInt3822 = 1 << anInt3811;
	anIntArrayArrayArray3824 = new int[arg3][arg4][];
	aClass131_Sub28ArrayArrayArray3817 = new Class131_Sub28[arg3][arg4][];
	anIntArrayArrayArray3826 = new int[arg3][arg4][];
	anIntArrayArrayArray3820 = new int[arg3][arg4][];
	anIntArrayArrayArray3825 = new int[arg3][arg4][];
	anIntArrayArrayArray3819 = new int[arg3][arg4][];
	aShortArrayArray3831 = new short[arg3 * arg4][];
	aByteArrayArray3815 = new byte[arg3][arg4];
	aByteArrayArray3841 = new byte[arg3 + 1][arg4 + 1];
	aFloatArrayArray3842 = new float[arg3 + 1][arg4 + 1];
	aFloatArrayArray3839 = new float[arg3 + 1][arg4 + 1];
	aFloatArrayArray3835 = new float[arg3 + 1][arg4 + 1];
	for (int i = 1; i < arg4; i++) {
	    for (int i_126_ = 1; i_126_ < arg3; i_126_++) {
		int i_127_ = (anIntArrayArray3818[i_126_ + 1][i]
			      - anIntArrayArray3818[i_126_ - 1][i]);
		int i_128_ = (anIntArrayArray3818[i_126_][i + 1]
			      - anIntArrayArray3818[i_126_][i - 1]);
		float f
		    = (float) (1.0
			       / Math.sqrt((double) (i_127_ * i_127_ + 65536
						     + i_128_ * i_128_)));
		aFloatArrayArray3842[i_126_][i] = (float) i_127_ * f;
		aFloatArrayArray3839[i_126_][i] = -256.0F * f;
		aFloatArrayArray3835[i_126_][i] = (float) i_128_ * f;
	    }
	}
	aClass180_3846 = new Class180(128);
	if ((anInt3812 & 0x10) != 0)
	    aClass206_3823 = new Class206(aClass130_Sub2_3810, this);
    }
    
    public void method727(int i, int i_129_) {
	/* empty */
    }
    
    public boolean method714(Class131_Sub41_Sub13 arg0, int arg1, int arg2,
			     int arg3, int arg4, boolean arg5) {
	if (aClass206_3823 == null || arg0 == null)
	    return false;
	int i = arg1 - (arg2 * aClass130_Sub2_3810.anInt3367 >> 8) >> 3;
	int i_130_ = arg3 - (arg2 * aClass130_Sub2_3810.anInt3394 >> 8) >> 3;
	return aClass206_3823.method2740(i, -1, i_130_, arg0);
    }
    
    public int method720(int arg0, int arg1) {
	int i = arg0 >> anInt3811;
	int i_131_ = arg1 >> anInt3811;
	if (i < 0 || i_131_ < 0 || i > anInt924 - 1 || i_131_ > anInt916 - 1)
	    return 0;
	int i_132_ = arg0 & anInt3822 - 1;
	int i_133_ = arg1 & anInt3822 - 1;
	int i_134_ = ((anIntArrayArray3818[i][i_131_] * (anInt3822 - i_132_)
		       + anIntArrayArray3818[i + 1][i_131_] * i_132_)
		      >> anInt3811);
	int i_135_
	    = ((anIntArrayArray3818[i][i_131_ + 1] * (anInt3822 - i_132_)
		+ anIntArrayArray3818[i + 1][i_131_ + 1] * i_132_)
	       >> anInt3811);
	return i_134_ * (anInt3822 - i_133_) + i_135_ * i_133_ >> anInt3811;
    }
}
