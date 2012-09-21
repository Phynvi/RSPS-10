/* Class131_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub39 extends Class131
{
    public static float[] aFloatArray4628;
    public static int anInt4629;
    public static int[] anIntArray4630;
    public int anInt4631;
    public static int anInt4632;
    public static Class216[] aClass216Array4633;
    public int anInt4634;
    public static Class27[] aClass27Array4635;
    public int anInt4636;
    public static float[] aFloatArray4637;
    public static float[] aFloatArray4638;
    public float[] aFloatArray4639;
    public static int[] anIntArray4640;
    public boolean aBoolean4641;
    public static float[] aFloatArray4642;
    public static int anInt4643;
    public static float[] aFloatArray4644;
    public boolean aBoolean4645;
    public static boolean[] aBooleanArray4646;
    public static boolean aBoolean4647 = false;
    public byte[][] aByteArrayArray4648;
    public int anInt4649;
    public int anInt4650;
    public static byte[] aByteArray4651;
    public static int[] anIntArray4652;
    public static float[] aFloatArray4653;
    public static Class162[] aClass162Array4654;
    public static int anInt4655;
    public static float[] aFloatArray4656;
    public int anInt4657;
    public int anInt4658;
    public int anInt4659;
    public byte[] aByteArray4660;
    public static Class11[] aClass11Array4661;
    
    public void method1893(byte[] arg0) {
	Stream stream = new Stream(arg0);
	anInt4636 = stream.readUnsignedInt(-2);
	anInt4634 = stream.readUnsignedInt(-2);
	anInt4649 = stream.readUnsignedInt(-2);
	anInt4657 = stream.readUnsignedInt(-2);
	if (anInt4657 < 0) {
	    anInt4657 = anInt4657 ^ 0xffffffff;
	    aBoolean4645 = true;
	}
	int i = stream.readUnsignedInt(-2);
	aByteArrayArray4648 = new byte[i][];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = 0;
	    int i_2_;
	    do {
		i_2_ = stream.readUnsignedByte(115);
		i_1_ += i_2_;
	    } while (i_2_ >= 255);
	    byte[] is = new byte[i_1_];
	    stream.method1768(0, i_1_, (byte) -110, is);
	    aByteArrayArray4648[i_0_] = is;
	}
    }
    
    public static float method1894(int arg0) {
	int i = arg0 & 0x1fffff;
	int i_3_ = arg0 & ~0x7fffffff;
	int i_4_ = (arg0 & 0x7fe00000) >> 21;
	if (i_3_ != 0)
	    i = -i;
	return (float) ((double) i * Math.pow(2.0, (double) (i_4_ - 788)));
    }
    
    public static void method1895() {
	aByteArray4651 = null;
	aClass27Array4635 = null;
	aClass216Array4633 = null;
	aClass11Array4661 = null;
	aClass162Array4654 = null;
	aBooleanArray4646 = null;
	anIntArray4652 = null;
	aFloatArray4638 = null;
	aFloatArray4637 = null;
	aFloatArray4653 = null;
	aFloatArray4642 = null;
	aFloatArray4644 = null;
	aFloatArray4656 = null;
	aFloatArray4628 = null;
	anIntArray4630 = null;
	anIntArray4640 = null;
    }
    
    public static int method1896(int arg0) {
	int i = 0;
	int i_5_ = 0;
	int i_6_;
	for (/**/; arg0 >= 8 - anInt4632; arg0 -= i_6_) {
	    i_6_ = 8 - anInt4632;
	    int i_7_ = (1 << i_6_) - 1;
	    i += (aByteArray4651[anInt4629] >> anInt4632 & i_7_) << i_5_;
	    anInt4632 = 0;
	    anInt4629++;
	    i_5_ += i_6_;
	}
	if (arg0 > 0) {
	    i_6_ = (1 << arg0) - 1;
	    i += (aByteArray4651[anInt4629] >> anInt4632 & i_6_) << i_5_;
	    anInt4632 += arg0;
	}
	return i;
    }
    
    public float[] method1897(int arg0) {
	method1898(aByteArrayArray4648[arg0], 0);
	method1902();
	int i = method1896(Class82.method798(1, anIntArray4652.length - 1));
	boolean bool = aBooleanArray4646[i];
	int i_8_ = bool ? anInt4655 : anInt4643;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	if (bool) {
	    bool_9_ = method1902() != 0;
	    bool_10_ = method1902() != 0;
	}
	int i_11_ = i_8_ >> 1;
	int i_12_;
	int i_13_;
	int i_14_;
	if (bool && !bool_9_) {
	    i_12_ = (i_8_ >> 2) - (anInt4643 >> 2);
	    i_13_ = (i_8_ >> 2) + (anInt4643 >> 2);
	    i_14_ = anInt4643 >> 1;
	} else {
	    i_12_ = 0;
	    i_13_ = i_11_;
	    i_14_ = i_8_ >> 1;
	}
	int i_15_;
	int i_16_;
	int i_17_;
	if (bool && !bool_10_) {
	    i_15_ = i_8_ - (i_8_ >> 2) - (anInt4643 >> 2);
	    i_16_ = i_8_ - (i_8_ >> 2) + (anInt4643 >> 2);
	    i_17_ = anInt4643 >> 1;
	} else {
	    i_15_ = i_11_;
	    i_16_ = i_8_;
	    i_17_ = i_8_ >> 1;
	}
	Class162 class162 = aClass162Array4654[anIntArray4652[i]];
	int i_18_ = class162.anInt2166;
	int i_19_ = class162.anIntArray2167[i_18_];
	boolean bool_20_ = !aClass216Array4633[i_19_].method2811();
	boolean bool_21_ = bool_20_;
	for (int i_22_ = 0; i_22_ < class162.anInt2164; i_22_++) {
	    Class11 class11
		= aClass11Array4661[class162.anIntArray2165[i_22_]];
	    float[] fs = aFloatArray4638;
	    class11.method208(fs, i_8_ >> 1, bool_21_);
	}
	if (!bool_20_) {
	    int i_23_ = class162.anInt2166;
	    int i_24_ = class162.anIntArray2167[i_23_];
	    aClass216Array4633[i_24_].method2812(aFloatArray4638, i_8_ >> 1);
	}
	if (bool_20_) {
	    for (int i_25_ = i_8_ >> 1; i_25_ < i_8_; i_25_++)
		aFloatArray4638[i_25_] = 0.0F;
	} else {
	    int i_26_ = i_8_ >> 1;
	    int i_27_ = i_8_ >> 2;
	    int i_28_ = i_8_ >> 3;
	    float[] fs = aFloatArray4638;
	    for (int i_29_ = 0; i_29_ < i_26_; i_29_++)
		fs[i_29_] *= 0.5F;
	    for (int i_30_ = i_26_; i_30_ < i_8_; i_30_++)
		fs[i_30_] = -fs[i_8_ - i_30_ - 1];
	    float[] fs_31_ = bool ? aFloatArray4644 : aFloatArray4637;
	    float[] fs_32_ = bool ? aFloatArray4656 : aFloatArray4653;
	    float[] fs_33_ = bool ? aFloatArray4628 : aFloatArray4642;
	    int[] is = bool ? anIntArray4640 : anIntArray4630;
	    for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
		float f = fs[4 * i_34_] - fs[i_8_ - 4 * i_34_ - 1];
		float f_35_ = fs[4 * i_34_ + 2] - fs[i_8_ - 4 * i_34_ - 3];
		float f_36_ = fs_31_[2 * i_34_];
		float f_37_ = fs_31_[2 * i_34_ + 1];
		fs[i_8_ - 4 * i_34_ - 1] = f * f_36_ - f_35_ * f_37_;
		fs[i_8_ - 4 * i_34_ - 3] = f * f_37_ + f_35_ * f_36_;
	    }
	    for (int i_38_ = 0; i_38_ < i_28_; i_38_++) {
		float f = fs[i_26_ + 3 + 4 * i_38_];
		float f_39_ = fs[i_26_ + 1 + 4 * i_38_];
		float f_40_ = fs[4 * i_38_ + 3];
		float f_41_ = fs[4 * i_38_ + 1];
		fs[i_26_ + 3 + 4 * i_38_] = f + f_40_;
		fs[i_26_ + 1 + 4 * i_38_] = f_39_ + f_41_;
		float f_42_ = fs_31_[i_26_ - 4 - 4 * i_38_];
		float f_43_ = fs_31_[i_26_ - 3 - 4 * i_38_];
		fs[4 * i_38_ + 3]
		    = (f - f_40_) * f_42_ - (f_39_ - f_41_) * f_43_;
		fs[4 * i_38_ + 1]
		    = (f_39_ - f_41_) * f_42_ + (f - f_40_) * f_43_;
	    }
	    int i_44_ = Class82.method798(1, i_8_ - 1);
	    for (int i_45_ = 0; i_45_ < i_44_ - 3; i_45_++) {
		int i_46_ = i_8_ >> i_45_ + 2;
		int i_47_ = 8 << i_45_;
		for (int i_48_ = 0; i_48_ < 2 << i_45_; i_48_++) {
		    int i_49_ = i_8_ - i_46_ * 2 * i_48_;
		    int i_50_ = i_8_ - i_46_ * (2 * i_48_ + 1);
		    for (int i_51_ = 0; i_51_ < i_8_ >> i_45_ + 4; i_51_++) {
			int i_52_ = 4 * i_51_;
			float f = fs[i_49_ - 1 - i_52_];
			float f_53_ = fs[i_49_ - 3 - i_52_];
			float f_54_ = fs[i_50_ - 1 - i_52_];
			float f_55_ = fs[i_50_ - 3 - i_52_];
			fs[i_49_ - 1 - i_52_] = f + f_54_;
			fs[i_49_ - 3 - i_52_] = f_53_ + f_55_;
			float f_56_ = fs_31_[i_51_ * i_47_];
			float f_57_ = fs_31_[i_51_ * i_47_ + 1];
			fs[i_50_ - 1 - i_52_]
			    = (f - f_54_) * f_56_ - (f_53_ - f_55_) * f_57_;
			fs[i_50_ - 3 - i_52_]
			    = (f_53_ - f_55_) * f_56_ + (f - f_54_) * f_57_;
		    }
		}
	    }
	    for (int i_58_ = 1; i_58_ < i_28_ - 1; i_58_++) {
		int i_59_ = is[i_58_];
		if (i_58_ < i_59_) {
		    int i_60_ = 8 * i_58_;
		    int i_61_ = 8 * i_59_;
		    float f = fs[i_60_ + 1];
		    fs[i_60_ + 1] = fs[i_61_ + 1];
		    fs[i_61_ + 1] = f;
		    f = fs[i_60_ + 3];
		    fs[i_60_ + 3] = fs[i_61_ + 3];
		    fs[i_61_ + 3] = f;
		    f = fs[i_60_ + 5];
		    fs[i_60_ + 5] = fs[i_61_ + 5];
		    fs[i_61_ + 5] = f;
		    f = fs[i_60_ + 7];
		    fs[i_60_ + 7] = fs[i_61_ + 7];
		    fs[i_61_ + 7] = f;
		}
	    }
	    for (int i_62_ = 0; i_62_ < i_26_; i_62_++)
		fs[i_62_] = fs[2 * i_62_ + 1];
	    for (int i_63_ = 0; i_63_ < i_28_; i_63_++) {
		fs[i_8_ - 1 - 2 * i_63_] = fs[4 * i_63_];
		fs[i_8_ - 2 - 2 * i_63_] = fs[4 * i_63_ + 1];
		fs[i_8_ - i_27_ - 1 - 2 * i_63_] = fs[4 * i_63_ + 2];
		fs[i_8_ - i_27_ - 2 - 2 * i_63_] = fs[4 * i_63_ + 3];
	    }
	    for (int i_64_ = 0; i_64_ < i_28_; i_64_++) {
		float f = fs_33_[2 * i_64_];
		float f_65_ = fs_33_[2 * i_64_ + 1];
		float f_66_ = fs[i_26_ + 2 * i_64_];
		float f_67_ = fs[i_26_ + 2 * i_64_ + 1];
		float f_68_ = fs[i_8_ - 2 - 2 * i_64_];
		float f_69_ = fs[i_8_ - 1 - 2 * i_64_];
		float f_70_ = f_65_ * (f_66_ - f_68_) + f * (f_67_ + f_69_);
		fs[i_26_ + 2 * i_64_] = (f_66_ + f_68_ + f_70_) * 0.5F;
		fs[i_8_ - 2 - 2 * i_64_] = (f_66_ + f_68_ - f_70_) * 0.5F;
		f_70_ = f_65_ * (f_67_ + f_69_) - f * (f_66_ - f_68_);
		fs[i_26_ + 2 * i_64_ + 1] = (f_67_ - f_69_ + f_70_) * 0.5F;
		fs[i_8_ - 1 - 2 * i_64_] = (-f_67_ + f_69_ + f_70_) * 0.5F;
	    }
	    for (int i_71_ = 0; i_71_ < i_27_; i_71_++) {
		fs[i_71_]
		    = (fs[2 * i_71_ + i_26_] * fs_32_[2 * i_71_]
		       + fs[2 * i_71_ + 1 + i_26_] * fs_32_[2 * i_71_ + 1]);
		fs[i_26_ - 1 - i_71_]
		    = (fs[2 * i_71_ + i_26_] * fs_32_[2 * i_71_ + 1]
		       - fs[2 * i_71_ + 1 + i_26_] * fs_32_[2 * i_71_]);
	    }
	    for (int i_72_ = 0; i_72_ < i_27_; i_72_++)
		fs[i_8_ - i_27_ + i_72_] = -fs[i_72_];
	    for (int i_73_ = 0; i_73_ < i_27_; i_73_++)
		fs[i_73_] = fs[i_27_ + i_73_];
	    for (int i_74_ = 0; i_74_ < i_27_; i_74_++)
		fs[i_27_ + i_74_] = -fs[i_27_ - i_74_ - 1];
	    for (int i_75_ = 0; i_75_ < i_27_; i_75_++)
		fs[i_26_ + i_75_] = fs[i_8_ - i_75_ - 1];
	    for (int i_76_ = i_12_; i_76_ < i_13_; i_76_++) {
		float f = (float) Math.sin(((double) (i_76_ - i_12_) + 0.5)
					   / (double) i_14_ * 0.5
					   * 3.141592653589793);
		aFloatArray4638[i_76_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	    for (int i_77_ = i_15_; i_77_ < i_16_; i_77_++) {
		float f = (float) Math.sin((((double) (i_77_ - i_15_) + 0.5)
					    / (double) i_17_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		aFloatArray4638[i_77_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	}
	float[] fs = null;
	if (anInt4650 > 0) {
	    int i_78_ = anInt4650 + i_8_ >> 2;
	    fs = new float[i_78_];
	    if (!aBoolean4641) {
		for (int i_79_ = 0; i_79_ < anInt4631; i_79_++) {
		    int i_80_ = (anInt4650 >> 1) + i_79_;
		    fs[i_79_] += aFloatArray4639[i_80_];
		}
	    }
	    if (!bool_20_) {
		for (int i_81_ = i_12_; i_81_ < i_8_ >> 1; i_81_++) {
		    int i_82_ = fs.length - (i_8_ >> 1) + i_81_;
		    fs[i_82_] += aFloatArray4638[i_81_];
		}
	    }
	}
	float[] fs_83_ = aFloatArray4639;
	aFloatArray4639 = aFloatArray4638;
	aFloatArray4638 = fs_83_;
	anInt4650 = i_8_;
	anInt4631 = i_16_ - (i_8_ >> 1);
	aBoolean4641 = bool_20_;
	return fs;
    }
    
    public static void method1898(byte[] arg0, int arg1) {
	aByteArray4651 = arg0;
	anInt4629 = arg1;
	anInt4632 = 0;
    }
    
    public static Class131_Sub39 method1899(Class158 arg0, int arg1,
					    int arg2) {
	if (!method1901(arg0)) {
	    arg0.method2354(arg2, arg1, 127);
	    return null;
	}
	byte[] is = arg0.method2364(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class131_Sub39(is);
    }
    
    public Class131_Sub12_Sub1 method1900(int[] arg0) {
	if (arg0 != null && arg0[0] <= 0)
	    return null;
	if (aByteArray4660 == null) {
	    anInt4650 = 0;
	    aFloatArray4639 = new float[anInt4655];
	    aByteArray4660 = new byte[anInt4634];
	    anInt4658 = 0;
	    anInt4659 = 0;
	}
	for (/**/; anInt4659 < aByteArrayArray4648.length; anInt4659++) {
	    if (arg0 != null && arg0[0] <= 0)
		return null;
	    float[] fs = method1897(anInt4659);
	    if (fs != null) {
		int i = anInt4658;
		int i_84_ = fs.length;
		if (i_84_ > anInt4634 - i)
		    i_84_ = anInt4634 - i;
		for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
		    int i_86_ = (int) (128.0F + fs[i_85_] * 128.0F);
		    if ((i_86_ & ~0xff) != 0)
			i_86_ = (i_86_ ^ 0xffffffff) >> 31;
		    aByteArray4660[i++] = (byte) (i_86_ - 128);
		}
		if (arg0 != null)
		    arg0[0] -= i - anInt4658;
		anInt4658 = i;
	    }
	}
	aFloatArray4639 = null;
	byte[] is = aByteArray4660;
	aByteArray4660 = null;
	return new Class131_Sub12_Sub1(anInt4636, is, anInt4649, anInt4657,
				       aBoolean4645);
    }
    
    public static boolean method1901(Class158 arg0) {
	if (!aBoolean4647) {
	    byte[] is = arg0.method2364(0, 0, 0);
	    if (is == null)
		return false;
	    method1903(is);
	    aBoolean4647 = true;
	}
	return true;
    }
    
    public Class131_Sub39(byte[] arg0) {
	method1893(arg0);
    }
    
    public static int method1902() {
	int i = aByteArray4651[anInt4629] >> anInt4632 & 0x1;
	anInt4632++;
	anInt4629 += anInt4632 >> 3;
	anInt4632 &= 0x7;
	return i;
    }
    
    public static void method1903(byte[] arg0) {
	method1898(arg0, 0);
	anInt4643 = 1 << method1896(4);
	anInt4655 = 1 << method1896(4);
	aFloatArray4638 = new float[anInt4655];
	for (int i = 0; i < 2; i++) {
	    int i_87_ = i != 0 ? anInt4655 : anInt4643;
	    int i_88_ = i_87_ >> 1;
	    int i_89_ = i_87_ >> 2;
	    int i_90_ = i_87_ >> 3;
	    float[] fs = new float[i_88_];
	    for (int i_91_ = 0; i_91_ < i_89_; i_91_++) {
		fs[2 * i_91_]
		    = (float) Math.cos((double) (4 * i_91_) * 3.141592653589793
				       / (double) i_87_);
		fs[2 * i_91_ + 1]
		    = -(float) Math.sin((double) (4 * i_91_)
					* 3.141592653589793 / (double) i_87_);
	    }
	    float[] fs_92_ = new float[i_88_];
	    for (int i_93_ = 0; i_93_ < i_89_; i_93_++) {
		fs_92_[2 * i_93_] = (float) Math.cos((double) (2 * i_93_ + 1)
						     * 3.141592653589793
						     / (double) (2 * i_87_));
		fs_92_[2 * i_93_ + 1]
		    = (float) Math.sin((double) (2 * i_93_ + 1)
				       * 3.141592653589793
				       / (double) (2 * i_87_));
	    }
	    float[] fs_94_ = new float[i_89_];
	    for (int i_95_ = 0; i_95_ < i_90_; i_95_++) {
		fs_94_[2 * i_95_]
		    = (float) Math.cos((double) (4 * i_95_ + 2)
				       * 3.141592653589793 / (double) i_87_);
		fs_94_[2 * i_95_ + 1]
		    = -(float) Math.sin((double) (4 * i_95_ + 2)
					* 3.141592653589793 / (double) i_87_);
	    }
	    int[] is = new int[i_90_];
	    int i_96_ = Class82.method798(1, i_90_ - 1);
	    for (int i_97_ = 0; i_97_ < i_90_; i_97_++)
		is[i_97_] = Class131_Sub41_Sub16.method2042(i_96_, i_97_, 0);
	    if (i != 0) {
		aFloatArray4644 = fs;
		aFloatArray4656 = fs_92_;
		aFloatArray4628 = fs_94_;
		anIntArray4640 = is;
	    } else {
		aFloatArray4637 = fs;
		aFloatArray4653 = fs_92_;
		aFloatArray4642 = fs_94_;
		anIntArray4630 = is;
	    }
	}
	int i = method1896(8) + 1;
	aClass27Array4635 = new Class27[i];
	for (int i_98_ = 0; i_98_ < i; i_98_++)
	    aClass27Array4635[i_98_] = new Class27();
	int i_99_ = method1896(6) + 1;
	for (int i_100_ = 0; i_100_ < i_99_; i_100_++)
	    method1896(16);
	int i_101_ = method1896(6) + 1;
	aClass216Array4633 = new Class216[i_101_];
	for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
	    aClass216Array4633[i_102_] = new Class216();
	int i_103_ = method1896(6) + 1;
	aClass11Array4661 = new Class11[i_103_];
	for (int i_104_ = 0; i_104_ < i_103_; i_104_++)
	    aClass11Array4661[i_104_] = new Class11();
	int i_105_ = method1896(6) + 1;
	aClass162Array4654 = new Class162[i_105_];
	for (int i_106_ = 0; i_106_ < i_105_; i_106_++)
	    aClass162Array4654[i_106_] = new Class162();
	int i_107_ = method1896(6) + 1;
	aBooleanArray4646 = new boolean[i_107_];
	anIntArray4652 = new int[i_107_];
	for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
	    aBooleanArray4646[i_108_] = method1902() != 0;
	    method1896(16);
	    method1896(16);
	    anIntArray4652[i_108_] = method1896(8);
	}
    }
}
