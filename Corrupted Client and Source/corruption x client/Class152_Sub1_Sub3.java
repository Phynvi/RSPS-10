/* Class152_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152_Sub1_Sub3 extends Class152_Sub1
{
    public int[] anIntArray6452;
    
    public void method2201(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	if (arg2 > 0 && arg3 > 0) {
	    int i = 0;
	    int i_0_ = 0;
	    int i_1_ = aClass130_Sub1_4715.anInt4029;
	    int i_2_ = anInt4728 + anInt4729 + anInt4710;
	    int i_3_ = anInt4736 + anInt4735 + anInt4737;
	    int i_4_ = (i_2_ << 16) / arg2;
	    int i_5_ = (i_3_ << 16) / arg3;
	    if (anInt4728 > 0) {
		int i_6_ = ((anInt4728 << 16) + i_4_ - 1) / i_4_;
		arg0 += i_6_;
		i += i_6_ * i_4_ - (anInt4728 << 16);
	    }
	    if (anInt4736 > 0) {
		int i_7_ = ((anInt4736 << 16) + i_5_ - 1) / i_5_;
		arg1 += i_7_;
		i_0_ += i_7_ * i_5_ - (anInt4736 << 16);
	    }
	    if (anInt4729 < i_2_)
		arg2 = ((anInt4729 << 16) - i + i_4_ - 1) / i_4_;
	    if (anInt4735 < i_3_)
		arg3 = ((anInt4735 << 16) - i_0_ + i_5_ - 1) / i_5_;
	    int i_8_ = arg0 + arg1 * i_1_;
	    int i_9_ = i_1_ - arg2;
	    if (arg1 + arg3 > aClass130_Sub1_4715.anInt4024)
		arg3 -= arg1 + arg3 - aClass130_Sub1_4715.anInt4024;
	    if (arg1 < aClass130_Sub1_4715.anInt4061) {
		int i_10_ = aClass130_Sub1_4715.anInt4061 - arg1;
		arg3 -= i_10_;
		i_8_ += i_10_ * i_1_;
		i_0_ += i_5_ * i_10_;
	    }
	    if (arg0 + arg2 > aClass130_Sub1_4715.anInt4067) {
		int i_11_ = arg0 + arg2 - aClass130_Sub1_4715.anInt4067;
		arg2 -= i_11_;
		i_9_ += i_11_;
	    }
	    if (arg0 < aClass130_Sub1_4715.anInt4066) {
		int i_12_ = aClass130_Sub1_4715.anInt4066 - arg0;
		arg2 -= i_12_;
		i_8_ += i_12_;
		i += i_4_ * i_12_;
		i_9_ += i_12_;
	    }
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    if (arg6 == 0) {
		if (arg4 == 0) {
		    int i_13_ = i;
		    for (int i_14_ = -arg3; i_14_ < 0; i_14_++) {
			int i_15_ = (i_0_ >> 16) * anInt4729;
			for (int i_16_ = -arg2; i_16_ < 0; i_16_++) {
			    is[i_8_++] = anIntArray6452[(i >> 16) + i_15_];
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_13_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_17_ = (arg5 & 0xff0000) >> 16;
		    int i_18_ = (arg5 & 0xff00) >> 8;
		    int i_19_ = arg5 & 0xff;
		    int i_20_ = i;
		    for (int i_21_ = -arg3; i_21_ < 0; i_21_++) {
			int i_22_ = (i_0_ >> 16) * anInt4729;
			for (int i_23_ = -arg2; i_23_ < 0; i_23_++) {
			    int i_24_ = anIntArray6452[(i >> 16) + i_22_];
			    int i_25_ = (i_24_ & 0xff0000) * i_17_ & ~0xffffff;
			    int i_26_ = (i_24_ & 0xff00) * i_18_ & 0xff0000;
			    int i_27_ = (i_24_ & 0xff) * i_19_ & 0xff00;
			    is[i_8_++] = (i_25_ | i_26_ | i_27_) >>> 8;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_20_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_28_ = arg5 >>> 24;
		    int i_29_ = 256 - i_28_;
		    int i_30_ = (arg5 & 0xff00ff) * i_29_ & ~0xff00ff;
		    int i_31_ = (arg5 & 0xff00) * i_29_ & 0xff0000;
		    arg5 = (i_30_ | i_31_) >>> 8;
		    int i_32_ = i;
		    for (int i_33_ = -arg3; i_33_ < 0; i_33_++) {
			int i_34_ = (i_0_ >> 16) * anInt4729;
			for (int i_35_ = -arg2; i_35_ < 0; i_35_++) {
			    int i_36_ = anIntArray6452[(i >> 16) + i_34_];
			    i_30_ = (i_36_ & 0xff00ff) * i_28_ & ~0xff00ff;
			    i_31_ = (i_36_ & 0xff00) * i_28_ & 0xff0000;
			    is[i_8_++] = ((i_30_ | i_31_) >>> 8) + arg5;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_32_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg6 == 1) {
		if (arg4 == 0) {
		    int i_37_ = i;
		    for (int i_38_ = -arg3; i_38_ < 0; i_38_++) {
			int i_39_ = (i_0_ >> 16) * anInt4729;
			for (int i_40_ = -arg2; i_40_ < 0; i_40_++) {
			    int i_41_ = anIntArray6452[(i >> 16) + i_39_];
			    int i_42_ = i_41_ >>> 24;
			    int i_43_ = 256 - i_42_;
			    int i_44_ = is[i_8_];
			    is[i_8_++] = ((((i_41_ & 0xff00ff) * i_42_
					    + (i_44_ & 0xff00ff) * i_43_)
					   & ~0xff00ff)
					  + (((i_41_ & 0xff00) * i_42_
					      + (i_44_ & 0xff00) * i_43_)
					     & 0xff0000)) >> 8;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_37_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_45_ = i;
		    if ((arg5 & 0xffffff) == 16777215) {
			for (int i_46_ = -arg3; i_46_ < 0; i_46_++) {
			    int i_47_ = (i_0_ >> 16) * anInt4729;
			    for (int i_48_ = -arg2; i_48_ < 0; i_48_++) {
				int i_49_ = anIntArray6452[(i >> 16) + i_47_];
				int i_50_
				    = (i_49_ >>> 24) * (arg5 >>> 24) >> 8;
				int i_51_ = 256 - i_50_;
				int i_52_ = is[i_8_];
				is[i_8_++] = ((((i_49_ & 0xff00ff) * i_50_
						+ (i_52_ & 0xff00ff) * i_51_)
					       & ~0xff00ff)
					      + (((i_49_ & 0xff00) * i_50_
						  + (i_52_ & 0xff00) * i_51_)
						 & 0xff0000)) >> 8;
				i += i_4_;
			    }
			    i_0_ += i_5_;
			    i = i_45_;
			    i_8_ += i_9_;
			}
		    } else {
			int i_53_ = (arg5 & 0xff0000) >> 16;
			int i_54_ = (arg5 & 0xff00) >> 8;
			int i_55_ = arg5 & 0xff;
			for (int i_56_ = -arg3; i_56_ < 0; i_56_++) {
			    int i_57_ = (i_0_ >> 16) * anInt4729;
			    for (int i_58_ = -arg2; i_58_ < 0; i_58_++) {
				int i_59_ = anIntArray6452[(i >> 16) + i_57_];
				int i_60_
				    = (i_59_ >>> 24) * (arg5 >>> 24) >> 8;
				int i_61_ = 256 - i_60_;
				if (i_60_ != 255) {
				    int i_62_ = ((i_59_ & 0xff0000) * i_53_
						 & ~0xffffff);
				    int i_63_
					= (i_59_ & 0xff00) * i_54_ & 0xff0000;
				    int i_64_
					= (i_59_ & 0xff) * i_55_ & 0xff00;
				    i_59_ = (i_62_ | i_63_ | i_64_) >>> 8;
				    int i_65_ = is[i_8_];
				    is[i_8_++]
					= ((((i_59_ & 0xff00ff) * i_60_
					     + (i_65_ & 0xff00ff) * i_61_)
					    & ~0xff00ff)
					   + (((i_59_ & 0xff00) * i_60_
					       + (i_65_ & 0xff00) * i_61_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_66_ = ((i_59_ & 0xff0000) * i_53_
						 & ~0xffffff);
				    int i_67_
					= (i_59_ & 0xff00) * i_54_ & 0xff0000;
				    int i_68_
					= (i_59_ & 0xff) * i_55_ & 0xff00;
				    is[i_8_++] = (i_66_ | i_67_ | i_68_) >>> 8;
				}
				i += i_4_;
			    }
			    i_0_ += i_5_;
			    i = i_45_;
			    i_8_ += i_9_;
			}
			return;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_69_ = arg5 >>> 24;
		    int i_70_ = 256 - i_69_;
		    int i_71_ = (arg5 & 0xff00ff) * i_70_ & ~0xff00ff;
		    int i_72_ = (arg5 & 0xff00) * i_70_ & 0xff0000;
		    arg5 = (i_71_ | i_72_) >>> 8;
		    int i_73_ = i;
		    for (int i_74_ = -arg3; i_74_ < 0; i_74_++) {
			int i_75_ = (i_0_ >> 16) * anInt4729;
			for (int i_76_ = -arg2; i_76_ < 0; i_76_++) {
			    int i_77_ = anIntArray6452[(i >> 16) + i_75_];
			    int i_78_ = i_77_ >>> 24;
			    int i_79_ = 256 - i_78_;
			    i_71_ = (i_77_ & 0xff00ff) * i_69_ & ~0xff00ff;
			    i_72_ = (i_77_ & 0xff00) * i_69_ & 0xff0000;
			    i_77_ = ((i_71_ | i_72_) >>> 8) + arg5;
			    int i_80_ = is[i_8_];
			    is[i_8_++] = ((((i_77_ & 0xff00ff) * i_78_
					    + (i_80_ & 0xff00ff) * i_79_)
					   & ~0xff00ff)
					  + (((i_77_ & 0xff00) * i_78_
					      + (i_80_ & 0xff00) * i_79_)
					     & 0xff0000)) >> 8;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_73_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg6 == 2) {
		if (arg4 == 0) {
		    int i_81_ = i;
		    for (int i_82_ = -arg3; i_82_ < 0; i_82_++) {
			int i_83_ = (i_0_ >> 16) * anInt4729;
			for (int i_84_ = -arg2; i_84_ < 0; i_84_++) {
			    int i_85_ = anIntArray6452[(i >> 16) + i_83_];
			    if (i_85_ != 0) {
				int i_86_ = is[i_8_];
				int i_87_ = i_85_ + i_86_;
				int i_88_
				    = (i_85_ & 0xff00ff) + (i_86_ & 0xff00ff);
				i_86_ = (i_88_ & 0x1000100) + (i_87_ - i_88_
							       & 0x10000);
				is[i_8_++]
				    = i_87_ - i_86_ | i_86_ - (i_86_ >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_81_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_89_ = i;
		    int i_90_ = (arg5 & 0xff0000) >> 16;
		    int i_91_ = (arg5 & 0xff00) >> 8;
		    int i_92_ = arg5 & 0xff;
		    for (int i_93_ = -arg3; i_93_ < 0; i_93_++) {
			int i_94_ = (i_0_ >> 16) * anInt4729;
			for (int i_95_ = -arg2; i_95_ < 0; i_95_++) {
			    int i_96_ = anIntArray6452[(i >> 16) + i_94_];
			    if (i_96_ != 0) {
				int i_97_
				    = (i_96_ & 0xff0000) * i_90_ & ~0xffffff;
				int i_98_
				    = (i_96_ & 0xff00) * i_91_ & 0xff0000;
				int i_99_ = (i_96_ & 0xff) * i_92_ & 0xff00;
				i_96_ = (i_97_ | i_98_ | i_99_) >>> 8;
				int i_100_ = is[i_8_];
				int i_101_ = i_96_ + i_100_;
				int i_102_
				    = (i_96_ & 0xff00ff) + (i_100_ & 0xff00ff);
				i_100_
				    = (i_102_ & 0x1000100) + (i_101_ - i_102_
							      & 0x10000);
				is[i_8_++]
				    = i_101_ - i_100_ | i_100_ - (i_100_
								  >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_89_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_103_ = arg5 >>> 24;
		    int i_104_ = 256 - i_103_;
		    int i_105_ = (arg5 & 0xff00ff) * i_104_ & ~0xff00ff;
		    int i_106_ = (arg5 & 0xff00) * i_104_ & 0xff0000;
		    arg5 = (i_105_ | i_106_) >>> 8;
		    int i_107_ = i;
		    for (int i_108_ = -arg3; i_108_ < 0; i_108_++) {
			int i_109_ = (i_0_ >> 16) * anInt4729;
			for (int i_110_ = -arg2; i_110_ < 0; i_110_++) {
			    int i_111_ = anIntArray6452[(i >> 16) + i_109_];
			    if (i_111_ != 0) {
				i_105_
				    = (i_111_ & 0xff00ff) * i_103_ & ~0xff00ff;
				i_106_ = (i_111_ & 0xff00) * i_103_ & 0xff0000;
				i_111_ = ((i_105_ | i_106_) >>> 8) + arg5;
				int i_112_ = is[i_8_];
				int i_113_ = i_111_ + i_112_;
				int i_114_ = ((i_111_ & 0xff00ff)
					      + (i_112_ & 0xff00ff));
				i_112_
				    = (i_114_ & 0x1000100) + (i_113_ - i_114_
							      & 0x10000);
				is[i_8_++]
				    = i_113_ - i_112_ | i_112_ - (i_112_
								  >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_107_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    public void method2199(int arg0, int arg1, int arg2) {
	if (arg2 == 0) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    for (int i = 0; i < anInt4735; i++) {
		int i_115_ = i * anInt4729;
		int i_116_ = (arg1 + i) * aClass130_Sub1_4715.anInt4029 + arg0;
		for (int i_117_ = 0; i_117_ < anInt4729; i_117_++)
		    anIntArray6452[i_115_ + i_117_]
			= (anIntArray6452[i_115_ + i_117_] & 0xffffff
			   | is[i_116_ + i_117_] << 8 & ~0xffffff);
	    }
	} else if (arg2 == 1) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    for (int i = 0; i < anInt4735; i++) {
		int i_118_ = i * anInt4729;
		int i_119_ = (arg1 + i) * aClass130_Sub1_4715.anInt4029 + arg0;
		for (int i_120_ = 0; i_120_ < anInt4729; i_120_++)
		    anIntArray6452[i_118_ + i_120_]
			= (anIntArray6452[i_118_ + i_120_] & 0xffffff
			   | is[i_119_ + i_120_] << 16 & ~0xffffff);
	    }
	} else if (arg2 == 2) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    for (int i = 0; i < anInt4735; i++) {
		int i_121_ = i * anInt4729;
		int i_122_ = (arg1 + i) * aClass130_Sub1_4715.anInt4029 + arg0;
		for (int i_123_ = 0; i_123_ < anInt4729; i_123_++)
		    anIntArray6452[i_121_ + i_123_]
			= (anIntArray6452[i_121_ + i_123_] & 0xffffff
			   | is[i_122_ + i_123_] << 24 & ~0xffffff);
	    }
	} else if (arg2 == 3) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    for (int i = 0; i < anInt4735; i++) {
		int i_124_ = i * anInt4729;
		int i_125_ = (arg1 + i) * aClass130_Sub1_4715.anInt4029 + arg0;
		for (int i_126_ = 0; i_126_ < anInt4729; i_126_++)
		    anIntArray6452[i_124_ + i_126_]
			= (anIntArray6452[i_124_ + i_126_] & 0xffffff
			   | (is[i_125_ + i_126_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method2214(int arg0, int arg1, Class183 arg2, int arg3,
			   int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i = 0;
	int i_127_ = aClass130_Sub1_4715.anInt4029;
	int i_128_ = anInt4729;
	int i_129_ = anInt4735;
	int i_130_ = i_127_ - i_128_;
	int i_131_ = 0;
	int i_132_ = arg0 + arg1 * i_127_;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_133_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_129_ -= i_133_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i += i_133_ * i_128_;
	    i_132_ += i_133_ * i_127_;
	}
	if (arg1 + i_129_ > aClass130_Sub1_4715.anInt4024)
	    i_129_ -= arg1 + i_129_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_134_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_128_ -= i_134_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i += i_134_;
	    i_132_ += i_134_;
	    i_131_ += i_134_;
	    i_130_ += i_134_;
	}
	if (arg0 + i_128_ > aClass130_Sub1_4715.anInt4067) {
	    int i_135_ = arg0 + i_128_ - aClass130_Sub1_4715.anInt4067;
	    i_128_ -= i_135_;
	    i_131_ += i_135_;
	    i_130_ += i_135_;
	}
	if (i_128_ > 0 && i_129_ > 0) {
	    Class183_Sub1 class183_sub1 = (Class183_Sub1) arg2;
	    int[] is = class183_sub1.anIntArray4954;
	    int[] is_136_ = class183_sub1.anIntArray4963;
	    int[] is_137_ = aClass130_Sub1_4715.anIntArray4026;
	    int i_138_ = arg1;
	    if (arg4 > i_138_) {
		i_138_ = arg4;
		i_132_ += (arg4 - arg1) * i_127_;
		i += (arg4 - arg1) * anInt4729;
	    }
	    int i_139_ = (arg4 + is.length < arg1 + i_129_ ? arg4 + is.length
			  : arg1 + i_129_);
	    for (int i_140_ = i_138_; i_140_ < i_139_; i_140_++) {
		int i_141_ = is[i_140_ - arg4] + arg3;
		int i_142_ = is_136_[i_140_ - arg4];
		int i_143_ = i_128_;
		if (arg0 > i_141_) {
		    int i_144_ = arg0 - i_141_;
		    if (i_144_ >= i_142_) {
			i += i_128_ + i_131_;
			i_132_ += i_128_ + i_130_;
			continue;
		    }
		    i_142_ -= i_144_;
		} else {
		    int i_145_ = i_141_ - arg0;
		    if (i_145_ >= i_128_) {
			i += i_128_ + i_131_;
			i_132_ += i_128_ + i_130_;
			continue;
		    }
		    i += i_145_;
		    i_143_ -= i_145_;
		    i_132_ += i_145_;
		}
		int i_146_ = 0;
		if (i_143_ < i_142_)
		    i_142_ = i_143_;
		else
		    i_146_ = i_143_ - i_142_;
		for (int i_147_ = -i_142_; i_147_ < 0; i_147_++) {
		    int i_148_ = anIntArray6452[i++];
		    int i_149_ = i_148_ >>> 24;
		    int i_150_ = 256 - i_149_;
		    int i_151_ = is_137_[i_132_];
		    is_137_[i_132_++] = ((((i_148_ & 0xff00ff) * i_149_
					   + (i_151_ & 0xff00ff) * i_150_)
					  & ~0xff00ff)
					 + (((i_148_ & 0xff00) * i_149_
					     + (i_151_ & 0xff00) * i_150_)
					    & 0xff0000)) >> 8;
		}
		i += i_146_ + i_131_;
		i_132_ += i_146_ + i_130_;
	    }
	}
    }
    
    public void method2202(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	int i = aClass130_Sub1_4715.anInt4029;
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i_152_ = arg1 * i + arg0;
	int i_153_ = 0;
	int i_154_ = anInt4735;
	int i_155_ = anInt4729;
	int i_156_ = i - i_155_;
	int i_157_ = 0;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_158_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_154_ -= i_158_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i_153_ += i_158_ * i_155_;
	    i_152_ += i_158_ * i;
	}
	if (arg1 + i_154_ > aClass130_Sub1_4715.anInt4024)
	    i_154_ -= arg1 + i_154_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_159_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_155_ -= i_159_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i_153_ += i_159_;
	    i_152_ += i_159_;
	    i_157_ += i_159_;
	    i_156_ += i_159_;
	}
	if (arg0 + i_155_ > aClass130_Sub1_4715.anInt4067) {
	    int i_160_ = arg0 + i_155_ - aClass130_Sub1_4715.anInt4067;
	    i_155_ -= i_160_;
	    i_157_ += i_160_;
	    i_156_ += i_160_;
	}
	if (i_155_ > 0 && i_154_ > 0) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    if (arg4 == 0) {
		if (arg2 == 0) {
		    for (int i_161_ = -i_154_; i_161_ < 0; i_161_++) {
			int i_162_ = i_152_ + i_155_ - 3;
			while (i_152_ < i_162_) {
			    is[i_152_++] = anIntArray6452[i_153_++];
			    is[i_152_++] = anIntArray6452[i_153_++];
			    is[i_152_++] = anIntArray6452[i_153_++];
			    is[i_152_++] = anIntArray6452[i_153_++];
			}
			i_162_ += 3;
			while (i_152_ < i_162_)
			    is[i_152_++] = anIntArray6452[i_153_++];
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_163_ = (arg3 & 0xff0000) >> 16;
		    int i_164_ = (arg3 & 0xff00) >> 8;
		    int i_165_ = arg3 & 0xff;
		    for (int i_166_ = -i_154_; i_166_ < 0; i_166_++) {
			for (int i_167_ = -i_155_; i_167_ < 0; i_167_++) {
			    int i_168_ = anIntArray6452[i_153_++];
			    int i_169_
				= (i_168_ & 0xff0000) * i_163_ & ~0xffffff;
			    int i_170_ = (i_168_ & 0xff00) * i_164_ & 0xff0000;
			    int i_171_ = (i_168_ & 0xff) * i_165_ & 0xff00;
			    is[i_152_++] = (i_169_ | i_170_ | i_171_) >>> 8;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_172_ = arg3 >>> 24;
		    int i_173_ = 256 - i_172_;
		    int i_174_ = (arg3 & 0xff00ff) * i_173_ & ~0xff00ff;
		    int i_175_ = (arg3 & 0xff00) * i_173_ & 0xff0000;
		    arg3 = (i_174_ | i_175_) >>> 8;
		    for (int i_176_ = -i_154_; i_176_ < 0; i_176_++) {
			for (int i_177_ = -i_155_; i_177_ < 0; i_177_++) {
			    int i_178_ = anIntArray6452[i_153_++];
			    i_174_ = (i_178_ & 0xff00ff) * i_172_ & ~0xff00ff;
			    i_175_ = (i_178_ & 0xff00) * i_172_ & 0xff0000;
			    is[i_152_++] = ((i_174_ | i_175_) >>> 8) + arg3;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 1) {
		if (arg2 == 0) {
		    for (int i_179_ = -i_154_; i_179_ < 0; i_179_++) {
			for (int i_180_ = -i_155_; i_180_ < 0; i_180_++) {
			    int i_181_ = anIntArray6452[i_153_++];
			    int i_182_ = i_181_ >>> 24;
			    int i_183_ = 256 - i_182_;
			    int i_184_ = is[i_152_];
			    is[i_152_++] = ((((i_181_ & 0xff00ff) * i_182_
					      + (i_184_ & 0xff00ff) * i_183_)
					     & ~0xff00ff)
					    + (((i_181_ & 0xff00) * i_182_
						+ (i_184_ & 0xff00) * i_183_)
					       & 0xff0000)) >> 8;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    if ((arg3 & 0xffffff) == 16777215) {
			for (int i_185_ = -i_154_; i_185_ < 0; i_185_++) {
			    for (int i_186_ = -i_155_; i_186_ < 0; i_186_++) {
				int i_187_ = anIntArray6452[i_153_++];
				int i_188_
				    = (i_187_ >>> 24) * (arg3 >>> 24) >> 8;
				int i_189_ = 256 - i_188_;
				int i_190_ = is[i_152_];
				is[i_152_++]
				    = ((((i_187_ & 0xff00ff) * i_188_
					 + (i_190_ & 0xff00ff) * i_189_)
					& ~0xff00ff)
				       + (((i_187_ & 0xff00) * i_188_
					   + (i_190_ & 0xff00) * i_189_)
					  & 0xff0000)) >> 8;
			    }
			    i_152_ += i_156_;
			    i_153_ += i_157_;
			}
		    } else {
			int i_191_ = (arg3 & 0xff0000) >> 16;
			int i_192_ = (arg3 & 0xff00) >> 8;
			int i_193_ = arg3 & 0xff;
			for (int i_194_ = -i_154_; i_194_ < 0; i_194_++) {
			    for (int i_195_ = -i_155_; i_195_ < 0; i_195_++) {
				int i_196_ = anIntArray6452[i_153_++];
				int i_197_
				    = (i_196_ >>> 24) * (arg3 >>> 24) >> 8;
				int i_198_ = 256 - i_197_;
				if (i_197_ != 255) {
				    int i_199_ = ((i_196_ & 0xff0000) * i_191_
						  & ~0xffffff);
				    int i_200_ = ((i_196_ & 0xff00) * i_192_
						  & 0xff0000);
				    int i_201_
					= (i_196_ & 0xff) * i_193_ & 0xff00;
				    i_196_ = (i_199_ | i_200_ | i_201_) >>> 8;
				    int i_202_ = is[i_152_];
				    is[i_152_++]
					= ((((i_196_ & 0xff00ff) * i_197_
					     + (i_202_ & 0xff00ff) * i_198_)
					    & ~0xff00ff)
					   + (((i_196_ & 0xff00) * i_197_
					       + (i_202_ & 0xff00) * i_198_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_203_ = ((i_196_ & 0xff0000) * i_191_
						  & ~0xffffff);
				    int i_204_ = ((i_196_ & 0xff00) * i_192_
						  & 0xff0000);
				    int i_205_
					= (i_196_ & 0xff) * i_193_ & 0xff00;
				    is[i_152_++]
					= (i_203_ | i_204_ | i_205_) >>> 8;
				}
			    }
			    i_152_ += i_156_;
			    i_153_ += i_157_;
			}
			return;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_206_ = arg3 >>> 24;
		    int i_207_ = 256 - i_206_;
		    int i_208_ = (arg3 & 0xff00ff) * i_207_ & ~0xff00ff;
		    int i_209_ = (arg3 & 0xff00) * i_207_ & 0xff0000;
		    arg3 = (i_208_ | i_209_) >>> 8;
		    for (int i_210_ = -i_154_; i_210_ < 0; i_210_++) {
			for (int i_211_ = -i_155_; i_211_ < 0; i_211_++) {
			    int i_212_ = anIntArray6452[i_153_++];
			    int i_213_ = i_212_ >>> 24;
			    int i_214_ = 256 - i_213_;
			    i_208_ = (i_212_ & 0xff00ff) * i_206_ & ~0xff00ff;
			    i_209_ = (i_212_ & 0xff00) * i_206_ & 0xff0000;
			    i_212_ = ((i_208_ | i_209_) >>> 8) + arg3;
			    int i_215_ = is[i_152_];
			    is[i_152_++] = ((((i_212_ & 0xff00ff) * i_213_
					      + (i_215_ & 0xff00ff) * i_214_)
					     & ~0xff00ff)
					    + (((i_212_ & 0xff00) * i_213_
						+ (i_215_ & 0xff00) * i_214_)
					       & 0xff0000)) >> 8;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 2) {
		if (arg2 == 0) {
		    for (int i_216_ = -i_154_; i_216_ < 0; i_216_++) {
			for (int i_217_ = -i_155_; i_217_ < 0; i_217_++) {
			    int i_218_ = anIntArray6452[i_153_++];
			    if (i_218_ != 0) {
				int i_219_ = is[i_152_];
				int i_220_ = i_218_ + i_219_;
				int i_221_ = ((i_218_ & 0xff00ff)
					      + (i_219_ & 0xff00ff));
				i_219_
				    = (i_221_ & 0x1000100) + (i_220_ - i_221_
							      & 0x10000);
				is[i_152_++]
				    = i_220_ - i_219_ | i_219_ - (i_219_
								  >>> 8);
			    } else
				i_152_++;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_222_ = (arg3 & 0xff0000) >> 16;
		    int i_223_ = (arg3 & 0xff00) >> 8;
		    int i_224_ = arg3 & 0xff;
		    for (int i_225_ = -i_154_; i_225_ < 0; i_225_++) {
			for (int i_226_ = -i_155_; i_226_ < 0; i_226_++) {
			    int i_227_ = anIntArray6452[i_153_++];
			    if (i_227_ != 0) {
				int i_228_
				    = (i_227_ & 0xff0000) * i_222_ & ~0xffffff;
				int i_229_
				    = (i_227_ & 0xff00) * i_223_ & 0xff0000;
				int i_230_ = (i_227_ & 0xff) * i_224_ & 0xff00;
				i_227_ = (i_228_ | i_229_ | i_230_) >>> 8;
				int i_231_ = is[i_152_];
				int i_232_ = i_227_ + i_231_;
				int i_233_ = ((i_227_ & 0xff00ff)
					      + (i_231_ & 0xff00ff));
				i_231_
				    = (i_233_ & 0x1000100) + (i_232_ - i_233_
							      & 0x10000);
				is[i_152_++]
				    = i_232_ - i_231_ | i_231_ - (i_231_
								  >>> 8);
			    } else
				i_152_++;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_234_ = arg3 >>> 24;
		    int i_235_ = 256 - i_234_;
		    int i_236_ = (arg3 & 0xff00ff) * i_235_ & ~0xff00ff;
		    int i_237_ = (arg3 & 0xff00) * i_235_ & 0xff0000;
		    arg3 = (i_236_ | i_237_) >>> 8;
		    for (int i_238_ = -i_154_; i_238_ < 0; i_238_++) {
			for (int i_239_ = -i_155_; i_239_ < 0; i_239_++) {
			    int i_240_ = anIntArray6452[i_153_++];
			    if (i_240_ != 0) {
				i_236_
				    = (i_240_ & 0xff00ff) * i_234_ & ~0xff00ff;
				i_237_ = (i_240_ & 0xff00) * i_234_ & 0xff0000;
				i_240_ = ((i_236_ | i_237_) >>> 8) + arg3;
				int i_241_ = is[i_152_];
				int i_242_ = i_240_ + i_241_;
				int i_243_ = ((i_240_ & 0xff00ff)
					      + (i_241_ & 0xff00ff));
				i_241_
				    = (i_243_ & 0x1000100) + (i_242_ - i_243_
							      & 0x10000);
				is[i_152_++]
				    = i_242_ - i_241_ | i_241_ - (i_241_
								  >>> 8);
			    } else
				i_152_++;
			}
			i_152_ += i_156_;
			i_153_ += i_157_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    public void method2215(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	for (int i = 0; i < arg3; i++) {
	    int i_244_ = (arg1 + i) * arg2 + arg0;
	    int i_245_ = (arg5 + i) * arg2 + arg4;
	    for (int i_246_ = 0; i_246_ < arg2; i_246_++)
		anIntArray6452[i_244_ + i_246_]
		    = is[i_245_ + i_246_] & 0xffffff;
	}
    }
    
    public Class152_Sub1_Sub3(Class130_Sub1 arg0, int[] arg1, int arg2,
			      int arg3) {
	super(arg0, arg2, arg3);
	anIntArray6452 = arg1;
    }
    
    public Class152_Sub1_Sub3(Class130_Sub1 arg0, int[] arg1, int arg2,
			      int arg3, int arg4, int arg5) {
	super(arg0, arg4, arg5);
	anIntArray6452 = new int[arg4 * arg5];
	arg3 -= anInt4729;
	int i = 0;
	for (int i_247_ = 0; i_247_ < arg5; i_247_++) {
	    for (int i_248_ = 0; i_248_ < arg4; i_248_++)
		anIntArray6452[i++] = arg1[arg2++];
	    arg2 += arg3;
	}
    }
    
    public void method2220(int arg0, int arg1) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	if (Class152_Sub1.anInt4718 == 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_249_ = Class152_Sub1.anInt4725;
		    int i_250_ = Class152_Sub1.anInt4723;
		    int i_251_ = Class152_Sub1.anInt4741;
		    int i_252_ = Class152_Sub1.anInt4739;
		    if (i_250_ >= 0 && i_251_ >= 0
			&& i_250_ - (anInt4729 << 12) < 0
			&& i_251_ - (anInt4735 << 12) < 0) {
			for (/**/; i_252_ < 0; i_252_++) {
			    int i_253_
				= (i_251_ >> 12) * anInt4729 + (i_250_ >> 12);
			    int i_254_ = i_249_++;
			    int[] is_255_ = is;
			    int i_256_ = arg0;
			    int i_257_ = arg1;
			    if (i_257_ == 0) {
				if (i_256_ == 0)
				    is_255_[i_254_] = anIntArray6452[i_253_];
				else if (i_256_ == 1) {
				    int i_258_ = anIntArray6452[i_253_++];
				    int i_259_ = (((i_258_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_260_ = (((i_258_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_261_ = (((i_258_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_255_[i_254_]
					= (i_259_ | i_260_ | i_261_) >>> 8;
				} else if (i_256_ == 2) {
				    int i_262_ = anIntArray6452[i_253_];
				    int i_263_ = (((i_262_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_264_ = (((i_262_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_255_[i_254_]
					= (((i_263_ | i_264_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_257_ == 1) {
				if (i_256_ == 0) {
				    int i_265_ = anIntArray6452[i_253_];
				    int i_266_ = i_265_ >>> 24;
				    int i_267_ = 256 - i_266_;
				    int i_268_ = is_255_[i_254_];
				    is_255_[i_254_]
					= ((((i_265_ & 0xff00ff) * i_266_
					     + (i_268_ & 0xff00ff) * i_267_)
					    & ~0xff00ff)
					   + (((i_265_ & 0xff00) * i_266_
					       + (i_268_ & 0xff00) * i_267_)
					      & 0xff0000)) >> 8;
				} else if (i_256_ == 1) {
				    int i_269_ = anIntArray6452[i_253_];
				    int i_270_ = (((i_269_ >>> 24)
						   * Class152_Sub1.anInt4711)
						  >> 8);
				    int i_271_ = 256 - i_270_;
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_272_ = is_255_[i_254_];
					is_255_[i_254_]
					    = ((((i_269_ & 0xff00ff) * i_270_
						 + ((i_272_ & 0xff00ff)
						    * i_271_))
						& ~0xff00ff)
					       + (((i_269_ & 0xff00) * i_270_
						   + ((i_272_ & 0xff00)
						      * i_271_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_273_
					    = (((i_269_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_274_
					    = (((i_269_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_275_
					    = (((i_269_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_269_
					    = (i_273_ | i_274_ | i_275_) >>> 8;
					int i_276_ = is_255_[i_254_];
					is_255_[i_254_]
					    = ((((i_269_ & 0xff00ff) * i_270_
						 + ((i_276_ & 0xff00ff)
						    * i_271_))
						& ~0xff00ff)
					       + (((i_269_ & 0xff00) * i_270_
						   + ((i_276_ & 0xff00)
						      * i_271_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_277_
					    = (((i_269_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_278_
					    = (((i_269_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_279_
					    = (((i_269_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_255_[i_254_]
					    = (i_277_ | i_278_ | i_279_) >>> 8;
				    }
				} else if (i_256_ == 2) {
				    int i_280_ = anIntArray6452[i_253_];
				    int i_281_ = i_280_ >>> 24;
				    int i_282_ = 256 - i_281_;
				    int i_283_ = (((i_280_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_284_ = (((i_280_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_280_ = (((i_283_ | i_284_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_285_ = is_255_[i_254_];
				    is_255_[i_254_]
					= ((((i_280_ & 0xff00ff) * i_281_
					     + (i_285_ & 0xff00ff) * i_282_)
					    & ~0xff00ff)
					   + (((i_280_ & 0xff00) * i_281_
					       + (i_285_ & 0xff00) * i_282_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_257_ == 2) {
				if (i_256_ == 0) {
				    int i_286_ = anIntArray6452[i_253_];
				    int i_287_ = is_255_[i_254_];
				    int i_288_ = i_286_ + i_287_;
				    int i_289_ = ((i_286_ & 0xff00ff)
						  + (i_287_ & 0xff00ff));
				    i_287_ = ((i_289_ & 0x1000100)
					      + (i_288_ - i_289_ & 0x10000));
				    is_255_[i_254_]
					= i_288_ - i_287_ | i_287_ - (i_287_
								      >>> 8);
				} else if (i_256_ == 1) {
				    int i_290_ = anIntArray6452[i_253_];
				    int i_291_ = (((i_290_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_292_ = (((i_290_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_293_ = (((i_290_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_290_ = (i_291_ | i_292_ | i_293_) >>> 8;
				    int i_294_ = is_255_[i_254_];
				    int i_295_ = i_290_ + i_294_;
				    int i_296_ = ((i_290_ & 0xff00ff)
						  + (i_294_ & 0xff00ff));
				    i_294_ = ((i_296_ & 0x1000100)
					      + (i_295_ - i_296_ & 0x10000));
				    is_255_[i_254_]
					= i_295_ - i_294_ | i_294_ - (i_294_
								      >>> 8);
				} else if (i_256_ == 2) {
				    int i_297_ = anIntArray6452[i_253_];
				    int i_298_ = (((i_297_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_299_ = (((i_297_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_297_ = (((i_298_ | i_299_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_300_ = is_255_[i_254_];
				    int i_301_ = i_297_ + i_300_;
				    int i_302_ = ((i_297_ & 0xff00ff)
						  + (i_300_ & 0xff00ff));
				    i_300_ = ((i_302_ & 0x1000100)
					      + (i_301_ - i_302_ & 0x10000));
				    is_255_[i_254_]
					= i_301_ - i_300_ | i_300_ - (i_300_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			}
		    }
		    i++;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_303_ = Class152_Sub1.anInt4725;
		    int i_304_ = Class152_Sub1.anInt4723;
		    int i_305_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_306_ = Class152_Sub1.anInt4739;
		    if (i_304_ >= 0 && i_304_ - (anInt4729 << 12) < 0) {
			int i_307_;
			if ((i_307_ = i_305_ - (anInt4735 << 12)) >= 0) {
			    i_307_ = ((Class152_Sub1.anInt4731 - i_307_)
				      / Class152_Sub1.anInt4731);
			    i_306_ += i_307_;
			    i_305_ += Class152_Sub1.anInt4731 * i_307_;
			    i_303_ += i_307_;
			}
			if ((i_307_ = ((i_305_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_306_)
			    i_306_ = i_307_;
			for (/**/; i_306_ < 0; i_306_++) {
			    int i_308_
				= (i_305_ >> 12) * anInt4729 + (i_304_ >> 12);
			    int i_309_ = i_303_++;
			    int[] is_310_ = is;
			    int i_311_ = arg0;
			    int i_312_ = arg1;
			    if (i_312_ == 0) {
				if (i_311_ == 0)
				    is_310_[i_309_] = anIntArray6452[i_308_];
				else if (i_311_ == 1) {
				    int i_313_ = anIntArray6452[i_308_++];
				    int i_314_ = (((i_313_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_315_ = (((i_313_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_316_ = (((i_313_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_310_[i_309_]
					= (i_314_ | i_315_ | i_316_) >>> 8;
				} else if (i_311_ == 2) {
				    int i_317_ = anIntArray6452[i_308_];
				    int i_318_ = (((i_317_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_319_ = (((i_317_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_310_[i_309_]
					= (((i_318_ | i_319_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_312_ == 1) {
				if (i_311_ == 0) {
				    int i_320_ = anIntArray6452[i_308_];
				    int i_321_ = i_320_ >>> 24;
				    int i_322_ = 256 - i_321_;
				    int i_323_ = is_310_[i_309_];
				    is_310_[i_309_]
					= ((((i_320_ & 0xff00ff) * i_321_
					     + (i_323_ & 0xff00ff) * i_322_)
					    & ~0xff00ff)
					   + (((i_320_ & 0xff00) * i_321_
					       + (i_323_ & 0xff00) * i_322_)
					      & 0xff0000)) >> 8;
				} else if (i_311_ == 1) {
				    int i_324_ = anIntArray6452[i_308_];
				    int i_325_ = (((i_324_ >>> 24)
						   * Class152_Sub1.anInt4711)
						  >> 8);
				    int i_326_ = 256 - i_325_;
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_327_ = is_310_[i_309_];
					is_310_[i_309_]
					    = ((((i_324_ & 0xff00ff) * i_325_
						 + ((i_327_ & 0xff00ff)
						    * i_326_))
						& ~0xff00ff)
					       + (((i_324_ & 0xff00) * i_325_
						   + ((i_327_ & 0xff00)
						      * i_326_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_328_
					    = (((i_324_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_329_
					    = (((i_324_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_330_
					    = (((i_324_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_324_
					    = (i_328_ | i_329_ | i_330_) >>> 8;
					int i_331_ = is_310_[i_309_];
					is_310_[i_309_]
					    = ((((i_324_ & 0xff00ff) * i_325_
						 + ((i_331_ & 0xff00ff)
						    * i_326_))
						& ~0xff00ff)
					       + (((i_324_ & 0xff00) * i_325_
						   + ((i_331_ & 0xff00)
						      * i_326_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_332_
					    = (((i_324_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_333_
					    = (((i_324_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_334_
					    = (((i_324_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_310_[i_309_]
					    = (i_332_ | i_333_ | i_334_) >>> 8;
				    }
				} else if (i_311_ == 2) {
				    int i_335_ = anIntArray6452[i_308_];
				    int i_336_ = i_335_ >>> 24;
				    int i_337_ = 256 - i_336_;
				    int i_338_ = (((i_335_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_339_ = (((i_335_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_335_ = (((i_338_ | i_339_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_340_ = is_310_[i_309_];
				    is_310_[i_309_]
					= ((((i_335_ & 0xff00ff) * i_336_
					     + (i_340_ & 0xff00ff) * i_337_)
					    & ~0xff00ff)
					   + (((i_335_ & 0xff00) * i_336_
					       + (i_340_ & 0xff00) * i_337_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_312_ == 2) {
				if (i_311_ == 0) {
				    int i_341_ = anIntArray6452[i_308_];
				    int i_342_ = is_310_[i_309_];
				    int i_343_ = i_341_ + i_342_;
				    int i_344_ = ((i_341_ & 0xff00ff)
						  + (i_342_ & 0xff00ff));
				    i_342_ = ((i_344_ & 0x1000100)
					      + (i_343_ - i_344_ & 0x10000));
				    is_310_[i_309_]
					= i_343_ - i_342_ | i_342_ - (i_342_
								      >>> 8);
				} else if (i_311_ == 1) {
				    int i_345_ = anIntArray6452[i_308_];
				    int i_346_ = (((i_345_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_347_ = (((i_345_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_348_ = (((i_345_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_345_ = (i_346_ | i_347_ | i_348_) >>> 8;
				    int i_349_ = is_310_[i_309_];
				    int i_350_ = i_345_ + i_349_;
				    int i_351_ = ((i_345_ & 0xff00ff)
						  + (i_349_ & 0xff00ff));
				    i_349_ = ((i_351_ & 0x1000100)
					      + (i_350_ - i_351_ & 0x10000));
				    is_310_[i_309_]
					= i_350_ - i_349_ | i_349_ - (i_349_
								      >>> 8);
				} else if (i_311_ == 2) {
				    int i_352_ = anIntArray6452[i_308_];
				    int i_353_ = (((i_352_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_354_ = (((i_352_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_352_ = (((i_353_ | i_354_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_355_ = is_310_[i_309_];
				    int i_356_ = i_352_ + i_355_;
				    int i_357_ = ((i_352_ & 0xff00ff)
						  + (i_355_ & 0xff00ff));
				    i_355_ = ((i_357_ & 0x1000100)
					      + (i_356_ - i_357_ & 0x10000));
				    is_310_[i_309_]
					= i_356_ - i_355_ | i_355_ - (i_355_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_305_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_358_ = Class152_Sub1.anInt4725;
		    int i_359_ = Class152_Sub1.anInt4723;
		    int i_360_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_361_ = Class152_Sub1.anInt4739;
		    if (i_359_ >= 0 && i_359_ - (anInt4729 << 12) < 0) {
			if (i_360_ < 0) {
			    int i_362_
				= ((Class152_Sub1.anInt4731 - 1 - i_360_)
				   / Class152_Sub1.anInt4731);
			    i_361_ += i_362_;
			    i_360_ += Class152_Sub1.anInt4731 * i_362_;
			    i_358_ += i_362_;
			}
			int i_363_;
			if ((i_363_ = ((1 + i_360_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_361_)
			    i_361_ = i_363_;
			for (/**/; i_361_ < 0; i_361_++) {
			    int i_364_
				= (i_360_ >> 12) * anInt4729 + (i_359_ >> 12);
			    int i_365_ = i_358_++;
			    int[] is_366_ = is;
			    int i_367_ = arg0;
			    int i_368_ = arg1;
			    if (i_368_ == 0) {
				if (i_367_ == 0)
				    is_366_[i_365_] = anIntArray6452[i_364_];
				else if (i_367_ == 1) {
				    int i_369_ = anIntArray6452[i_364_++];
				    int i_370_ = (((i_369_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_371_ = (((i_369_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_372_ = (((i_369_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_366_[i_365_]
					= (i_370_ | i_371_ | i_372_) >>> 8;
				} else if (i_367_ == 2) {
				    int i_373_ = anIntArray6452[i_364_];
				    int i_374_ = (((i_373_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_375_ = (((i_373_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_366_[i_365_]
					= (((i_374_ | i_375_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_368_ == 1) {
				if (i_367_ == 0) {
				    int i_376_ = anIntArray6452[i_364_];
				    int i_377_ = i_376_ >>> 24;
				    int i_378_ = 256 - i_377_;
				    int i_379_ = is_366_[i_365_];
				    is_366_[i_365_]
					= ((((i_376_ & 0xff00ff) * i_377_
					     + (i_379_ & 0xff00ff) * i_378_)
					    & ~0xff00ff)
					   + (((i_376_ & 0xff00) * i_377_
					       + (i_379_ & 0xff00) * i_378_)
					      & 0xff0000)) >> 8;
				} else if (i_367_ == 1) {
				    int i_380_ = anIntArray6452[i_364_];
				    int i_381_ = (((i_380_ >>> 24)
						   * Class152_Sub1.anInt4711)
						  >> 8);
				    int i_382_ = 256 - i_381_;
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_383_ = is_366_[i_365_];
					is_366_[i_365_]
					    = ((((i_380_ & 0xff00ff) * i_381_
						 + ((i_383_ & 0xff00ff)
						    * i_382_))
						& ~0xff00ff)
					       + (((i_380_ & 0xff00) * i_381_
						   + ((i_383_ & 0xff00)
						      * i_382_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_384_
					    = (((i_380_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_385_
					    = (((i_380_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_386_
					    = (((i_380_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_380_
					    = (i_384_ | i_385_ | i_386_) >>> 8;
					int i_387_ = is_366_[i_365_];
					is_366_[i_365_]
					    = ((((i_380_ & 0xff00ff) * i_381_
						 + ((i_387_ & 0xff00ff)
						    * i_382_))
						& ~0xff00ff)
					       + (((i_380_ & 0xff00) * i_381_
						   + ((i_387_ & 0xff00)
						      * i_382_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_388_
					    = (((i_380_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_389_
					    = (((i_380_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_390_
					    = (((i_380_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_366_[i_365_]
					    = (i_388_ | i_389_ | i_390_) >>> 8;
				    }
				} else if (i_367_ == 2) {
				    int i_391_ = anIntArray6452[i_364_];
				    int i_392_ = i_391_ >>> 24;
				    int i_393_ = 256 - i_392_;
				    int i_394_ = (((i_391_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_395_ = (((i_391_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_391_ = (((i_394_ | i_395_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_396_ = is_366_[i_365_];
				    is_366_[i_365_]
					= ((((i_391_ & 0xff00ff) * i_392_
					     + (i_396_ & 0xff00ff) * i_393_)
					    & ~0xff00ff)
					   + (((i_391_ & 0xff00) * i_392_
					       + (i_396_ & 0xff00) * i_393_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_368_ == 2) {
				if (i_367_ == 0) {
				    int i_397_ = anIntArray6452[i_364_];
				    int i_398_ = is_366_[i_365_];
				    int i_399_ = i_397_ + i_398_;
				    int i_400_ = ((i_397_ & 0xff00ff)
						  + (i_398_ & 0xff00ff));
				    i_398_ = ((i_400_ & 0x1000100)
					      + (i_399_ - i_400_ & 0x10000));
				    is_366_[i_365_]
					= i_399_ - i_398_ | i_398_ - (i_398_
								      >>> 8);
				} else if (i_367_ == 1) {
				    int i_401_ = anIntArray6452[i_364_];
				    int i_402_ = (((i_401_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_403_ = (((i_401_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_404_ = (((i_401_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_401_ = (i_402_ | i_403_ | i_404_) >>> 8;
				    int i_405_ = is_366_[i_365_];
				    int i_406_ = i_401_ + i_405_;
				    int i_407_ = ((i_401_ & 0xff00ff)
						  + (i_405_ & 0xff00ff));
				    i_405_ = ((i_407_ & 0x1000100)
					      + (i_406_ - i_407_ & 0x10000));
				    is_366_[i_365_]
					= i_406_ - i_405_ | i_405_ - (i_405_
								      >>> 8);
				} else if (i_367_ == 2) {
				    int i_408_ = anIntArray6452[i_364_];
				    int i_409_ = (((i_408_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_410_ = (((i_408_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_408_ = (((i_409_ | i_410_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_411_ = is_366_[i_365_];
				    int i_412_ = i_408_ + i_411_;
				    int i_413_ = ((i_408_ & 0xff00ff)
						  + (i_411_ & 0xff00ff));
				    i_411_ = ((i_413_ & 0x1000100)
					      + (i_412_ - i_413_ & 0x10000));
				    is_366_[i_365_]
					= i_412_ - i_411_ | i_411_ - (i_411_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_360_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    }
	} else if (Class152_Sub1.anInt4718 < 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_414_ = Class152_Sub1.anInt4725;
		    int i_415_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_416_ = Class152_Sub1.anInt4741;
		    int i_417_ = Class152_Sub1.anInt4739;
		    if (i_416_ >= 0 && i_416_ - (anInt4735 << 12) < 0) {
			int i_418_;
			if ((i_418_ = i_415_ - (anInt4729 << 12)) >= 0) {
			    i_418_ = ((Class152_Sub1.anInt4718 - i_418_)
				      / Class152_Sub1.anInt4718);
			    i_417_ += i_418_;
			    i_415_ += Class152_Sub1.anInt4718 * i_418_;
			    i_414_ += i_418_;
			}
			if ((i_418_ = ((i_415_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_417_)
			    i_417_ = i_418_;
			for (/**/; i_417_ < 0; i_417_++) {
			    int i_419_
				= (i_416_ >> 12) * anInt4729 + (i_415_ >> 12);
			    int i_420_ = i_414_++;
			    int[] is_421_ = is;
			    int i_422_ = arg0;
			    int i_423_ = arg1;
			    if (i_423_ == 0) {
				if (i_422_ == 0)
				    is_421_[i_420_] = anIntArray6452[i_419_];
				else if (i_422_ == 1) {
				    int i_424_ = anIntArray6452[i_419_++];
				    int i_425_ = (((i_424_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_426_ = (((i_424_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_427_ = (((i_424_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_421_[i_420_]
					= (i_425_ | i_426_ | i_427_) >>> 8;
				} else if (i_422_ == 2) {
				    int i_428_ = anIntArray6452[i_419_];
				    int i_429_ = (((i_428_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_430_ = (((i_428_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_421_[i_420_]
					= (((i_429_ | i_430_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_423_ == 1) {
				if (i_422_ == 0) {
				    int i_431_ = anIntArray6452[i_419_];
				    int i_432_ = i_431_ >>> 24;
				    int i_433_ = 256 - i_432_;
				    int i_434_ = is_421_[i_420_];
				    is_421_[i_420_]
					= ((((i_431_ & 0xff00ff) * i_432_
					     + (i_434_ & 0xff00ff) * i_433_)
					    & ~0xff00ff)
					   + (((i_431_ & 0xff00) * i_432_
					       + (i_434_ & 0xff00) * i_433_)
					      & 0xff0000)) >> 8;
				} else if (i_422_ == 1) {
				    int i_435_ = anIntArray6452[i_419_];
				    int i_436_ = (((i_435_ >>> 24)
						   * Class152_Sub1.anInt4711)
						  >> 8);
				    int i_437_ = 256 - i_436_;
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_438_ = is_421_[i_420_];
					is_421_[i_420_]
					    = ((((i_435_ & 0xff00ff) * i_436_
						 + ((i_438_ & 0xff00ff)
						    * i_437_))
						& ~0xff00ff)
					       + (((i_435_ & 0xff00) * i_436_
						   + ((i_438_ & 0xff00)
						      * i_437_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_439_
					    = (((i_435_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_440_
					    = (((i_435_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_441_
					    = (((i_435_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_435_
					    = (i_439_ | i_440_ | i_441_) >>> 8;
					int i_442_ = is_421_[i_420_];
					is_421_[i_420_]
					    = ((((i_435_ & 0xff00ff) * i_436_
						 + ((i_442_ & 0xff00ff)
						    * i_437_))
						& ~0xff00ff)
					       + (((i_435_ & 0xff00) * i_436_
						   + ((i_442_ & 0xff00)
						      * i_437_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_443_
					    = (((i_435_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_444_
					    = (((i_435_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_445_
					    = (((i_435_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_421_[i_420_]
					    = (i_443_ | i_444_ | i_445_) >>> 8;
				    }
				} else if (i_422_ == 2) {
				    int i_446_ = anIntArray6452[i_419_];
				    int i_447_ = i_446_ >>> 24;
				    int i_448_ = 256 - i_447_;
				    int i_449_ = (((i_446_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_450_ = (((i_446_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_446_ = (((i_449_ | i_450_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_451_ = is_421_[i_420_];
				    is_421_[i_420_]
					= ((((i_446_ & 0xff00ff) * i_447_
					     + (i_451_ & 0xff00ff) * i_448_)
					    & ~0xff00ff)
					   + (((i_446_ & 0xff00) * i_447_
					       + (i_451_ & 0xff00) * i_448_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_423_ == 2) {
				if (i_422_ == 0) {
				    int i_452_ = anIntArray6452[i_419_];
				    int i_453_ = is_421_[i_420_];
				    int i_454_ = i_452_ + i_453_;
				    int i_455_ = ((i_452_ & 0xff00ff)
						  + (i_453_ & 0xff00ff));
				    i_453_ = ((i_455_ & 0x1000100)
					      + (i_454_ - i_455_ & 0x10000));
				    is_421_[i_420_]
					= i_454_ - i_453_ | i_453_ - (i_453_
								      >>> 8);
				} else if (i_422_ == 1) {
				    int i_456_ = anIntArray6452[i_419_];
				    int i_457_ = (((i_456_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_458_ = (((i_456_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_459_ = (((i_456_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_456_ = (i_457_ | i_458_ | i_459_) >>> 8;
				    int i_460_ = is_421_[i_420_];
				    int i_461_ = i_456_ + i_460_;
				    int i_462_ = ((i_456_ & 0xff00ff)
						  + (i_460_ & 0xff00ff));
				    i_460_ = ((i_462_ & 0x1000100)
					      + (i_461_ - i_462_ & 0x10000));
				    is_421_[i_420_]
					= i_461_ - i_460_ | i_460_ - (i_460_
								      >>> 8);
				} else if (i_422_ == 2) {
				    int i_463_ = anIntArray6452[i_419_];
				    int i_464_ = (((i_463_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_465_ = (((i_463_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_463_ = (((i_464_ | i_465_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_466_ = is_421_[i_420_];
				    int i_467_ = i_463_ + i_466_;
				    int i_468_ = ((i_463_ & 0xff00ff)
						  + (i_466_ & 0xff00ff));
				    i_466_ = ((i_468_ & 0x1000100)
					      + (i_467_ - i_468_ & 0x10000));
				    is_421_[i_420_]
					= i_467_ - i_466_ | i_466_ - (i_466_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_415_ += Class152_Sub1.anInt4718;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_469_ = Class152_Sub1.anInt4725;
		    int i_470_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_471_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_472_ = Class152_Sub1.anInt4739;
		    int i_473_;
		    if ((i_473_ = i_470_ - (anInt4729 << 12)) >= 0) {
			i_473_ = ((Class152_Sub1.anInt4718 - i_473_)
				  / Class152_Sub1.anInt4718);
			i_472_ += i_473_;
			i_470_ += Class152_Sub1.anInt4718 * i_473_;
			i_471_ += Class152_Sub1.anInt4731 * i_473_;
			i_469_ += i_473_;
		    }
		    if ((i_473_ = ((i_470_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_472_)
			i_472_ = i_473_;
		    if ((i_473_ = i_471_ - (anInt4735 << 12)) >= 0) {
			i_473_ = ((Class152_Sub1.anInt4731 - i_473_)
				  / Class152_Sub1.anInt4731);
			i_472_ += i_473_;
			i_470_ += Class152_Sub1.anInt4718 * i_473_;
			i_471_ += Class152_Sub1.anInt4731 * i_473_;
			i_469_ += i_473_;
		    }
		    if ((i_473_ = ((i_471_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_472_)
			i_472_ = i_473_;
		    for (/**/; i_472_ < 0; i_472_++) {
			int i_474_
			    = (i_471_ >> 12) * anInt4729 + (i_470_ >> 12);
			int i_475_ = i_469_++;
			int[] is_476_ = is;
			int i_477_ = arg0;
			int i_478_ = arg1;
			if (i_478_ == 0) {
			    if (i_477_ == 0)
				is_476_[i_475_] = anIntArray6452[i_474_];
			    else if (i_477_ == 1) {
				int i_479_ = anIntArray6452[i_474_++];
				int i_480_ = (((i_479_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_481_ = (((i_479_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_482_ = (((i_479_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_476_[i_475_]
				    = (i_480_ | i_481_ | i_482_) >>> 8;
			    } else if (i_477_ == 2) {
				int i_483_ = anIntArray6452[i_474_];
				int i_484_ = (((i_483_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_485_ = (((i_483_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_476_[i_475_] = (((i_484_ | i_485_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_478_ == 1) {
			    if (i_477_ == 0) {
				int i_486_ = anIntArray6452[i_474_];
				int i_487_ = i_486_ >>> 24;
				int i_488_ = 256 - i_487_;
				int i_489_ = is_476_[i_475_];
				is_476_[i_475_]
				    = ((((i_486_ & 0xff00ff) * i_487_
					 + (i_489_ & 0xff00ff) * i_488_)
					& ~0xff00ff)
				       + (((i_486_ & 0xff00) * i_487_
					   + (i_489_ & 0xff00) * i_488_)
					  & 0xff0000)) >> 8;
			    } else if (i_477_ == 1) {
				int i_490_ = anIntArray6452[i_474_];
				int i_491_ = (((i_490_ >>> 24)
					       * Class152_Sub1.anInt4711)
					      >> 8);
				int i_492_ = 256 - i_491_;
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_493_ = is_476_[i_475_];
				    is_476_[i_475_]
					= ((((i_490_ & 0xff00ff) * i_491_
					     + (i_493_ & 0xff00ff) * i_492_)
					    & ~0xff00ff)
					   + (((i_490_ & 0xff00) * i_491_
					       + (i_493_ & 0xff00) * i_492_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_494_ = (((i_490_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_495_ = (((i_490_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_496_ = (((i_490_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_490_ = (i_494_ | i_495_ | i_496_) >>> 8;
				    int i_497_ = is_476_[i_475_];
				    is_476_[i_475_]
					= ((((i_490_ & 0xff00ff) * i_491_
					     + (i_497_ & 0xff00ff) * i_492_)
					    & ~0xff00ff)
					   + (((i_490_ & 0xff00) * i_491_
					       + (i_497_ & 0xff00) * i_492_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_498_ = (((i_490_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_499_ = (((i_490_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_500_ = (((i_490_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_476_[i_475_]
					= (i_498_ | i_499_ | i_500_) >>> 8;
				}
			    } else if (i_477_ == 2) {
				int i_501_ = anIntArray6452[i_474_];
				int i_502_ = i_501_ >>> 24;
				int i_503_ = 256 - i_502_;
				int i_504_ = (((i_501_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_505_ = (((i_501_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_501_ = (((i_504_ | i_505_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_506_ = is_476_[i_475_];
				is_476_[i_475_]
				    = ((((i_501_ & 0xff00ff) * i_502_
					 + (i_506_ & 0xff00ff) * i_503_)
					& ~0xff00ff)
				       + (((i_501_ & 0xff00) * i_502_
					   + (i_506_ & 0xff00) * i_503_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_478_ == 2) {
			    if (i_477_ == 0) {
				int i_507_ = anIntArray6452[i_474_];
				int i_508_ = is_476_[i_475_];
				int i_509_ = i_507_ + i_508_;
				int i_510_ = ((i_507_ & 0xff00ff)
					      + (i_508_ & 0xff00ff));
				i_508_
				    = (i_510_ & 0x1000100) + (i_509_ - i_510_
							      & 0x10000);
				is_476_[i_475_]
				    = i_509_ - i_508_ | i_508_ - (i_508_
								  >>> 8);
			    } else if (i_477_ == 1) {
				int i_511_ = anIntArray6452[i_474_];
				int i_512_ = (((i_511_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_513_ = (((i_511_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_514_ = (((i_511_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_511_ = (i_512_ | i_513_ | i_514_) >>> 8;
				int i_515_ = is_476_[i_475_];
				int i_516_ = i_511_ + i_515_;
				int i_517_ = ((i_511_ & 0xff00ff)
					      + (i_515_ & 0xff00ff));
				i_515_
				    = (i_517_ & 0x1000100) + (i_516_ - i_517_
							      & 0x10000);
				is_476_[i_475_]
				    = i_516_ - i_515_ | i_515_ - (i_515_
								  >>> 8);
			    } else if (i_477_ == 2) {
				int i_518_ = anIntArray6452[i_474_];
				int i_519_ = (((i_518_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_520_ = (((i_518_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_518_ = (((i_519_ | i_520_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_521_ = is_476_[i_475_];
				int i_522_ = i_518_ + i_521_;
				int i_523_ = ((i_518_ & 0xff00ff)
					      + (i_521_ & 0xff00ff));
				i_521_
				    = (i_523_ & 0x1000100) + (i_522_ - i_523_
							      & 0x10000);
				is_476_[i_475_]
				    = i_522_ - i_521_ | i_521_ - (i_521_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_470_ += Class152_Sub1.anInt4718;
			i_471_ += Class152_Sub1.anInt4731;
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_524_ = Class152_Sub1.anInt4725;
		    int i_525_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_526_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_527_ = Class152_Sub1.anInt4739;
		    int i_528_;
		    if ((i_528_ = i_525_ - (anInt4729 << 12)) >= 0) {
			i_528_ = ((Class152_Sub1.anInt4718 - i_528_)
				  / Class152_Sub1.anInt4718);
			i_527_ += i_528_;
			i_525_ += Class152_Sub1.anInt4718 * i_528_;
			i_526_ += Class152_Sub1.anInt4731 * i_528_;
			i_524_ += i_528_;
		    }
		    if ((i_528_ = ((i_525_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_527_)
			i_527_ = i_528_;
		    if (i_526_ < 0) {
			i_528_ = ((Class152_Sub1.anInt4731 - 1 - i_526_)
				  / Class152_Sub1.anInt4731);
			i_527_ += i_528_;
			i_525_ += Class152_Sub1.anInt4718 * i_528_;
			i_526_ += Class152_Sub1.anInt4731 * i_528_;
			i_524_ += i_528_;
		    }
		    if ((i_528_ = ((1 + i_526_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_527_)
			i_527_ = i_528_;
		    for (/**/; i_527_ < 0; i_527_++) {
			int i_529_
			    = (i_526_ >> 12) * anInt4729 + (i_525_ >> 12);
			int i_530_ = i_524_++;
			int[] is_531_ = is;
			int i_532_ = arg0;
			int i_533_ = arg1;
			if (i_533_ == 0) {
			    if (i_532_ == 0)
				is_531_[i_530_] = anIntArray6452[i_529_];
			    else if (i_532_ == 1) {
				int i_534_ = anIntArray6452[i_529_++];
				int i_535_ = (((i_534_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_536_ = (((i_534_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_537_ = (((i_534_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_531_[i_530_]
				    = (i_535_ | i_536_ | i_537_) >>> 8;
			    } else if (i_532_ == 2) {
				int i_538_ = anIntArray6452[i_529_];
				int i_539_ = (((i_538_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_540_ = (((i_538_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_531_[i_530_] = (((i_539_ | i_540_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_533_ == 1) {
			    if (i_532_ == 0) {
				int i_541_ = anIntArray6452[i_529_];
				int i_542_ = i_541_ >>> 24;
				int i_543_ = 256 - i_542_;
				int i_544_ = is_531_[i_530_];
				is_531_[i_530_]
				    = ((((i_541_ & 0xff00ff) * i_542_
					 + (i_544_ & 0xff00ff) * i_543_)
					& ~0xff00ff)
				       + (((i_541_ & 0xff00) * i_542_
					   + (i_544_ & 0xff00) * i_543_)
					  & 0xff0000)) >> 8;
			    } else if (i_532_ == 1) {
				int i_545_ = anIntArray6452[i_529_];
				int i_546_ = (((i_545_ >>> 24)
					       * Class152_Sub1.anInt4711)
					      >> 8);
				int i_547_ = 256 - i_546_;
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_548_ = is_531_[i_530_];
				    is_531_[i_530_]
					= ((((i_545_ & 0xff00ff) * i_546_
					     + (i_548_ & 0xff00ff) * i_547_)
					    & ~0xff00ff)
					   + (((i_545_ & 0xff00) * i_546_
					       + (i_548_ & 0xff00) * i_547_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_549_ = (((i_545_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_550_ = (((i_545_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_551_ = (((i_545_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_545_ = (i_549_ | i_550_ | i_551_) >>> 8;
				    int i_552_ = is_531_[i_530_];
				    is_531_[i_530_]
					= ((((i_545_ & 0xff00ff) * i_546_
					     + (i_552_ & 0xff00ff) * i_547_)
					    & ~0xff00ff)
					   + (((i_545_ & 0xff00) * i_546_
					       + (i_552_ & 0xff00) * i_547_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_553_ = (((i_545_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_554_ = (((i_545_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_555_ = (((i_545_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_531_[i_530_]
					= (i_553_ | i_554_ | i_555_) >>> 8;
				}
			    } else if (i_532_ == 2) {
				int i_556_ = anIntArray6452[i_529_];
				int i_557_ = i_556_ >>> 24;
				int i_558_ = 256 - i_557_;
				int i_559_ = (((i_556_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_560_ = (((i_556_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_556_ = (((i_559_ | i_560_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_561_ = is_531_[i_530_];
				is_531_[i_530_]
				    = ((((i_556_ & 0xff00ff) * i_557_
					 + (i_561_ & 0xff00ff) * i_558_)
					& ~0xff00ff)
				       + (((i_556_ & 0xff00) * i_557_
					   + (i_561_ & 0xff00) * i_558_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_533_ == 2) {
			    if (i_532_ == 0) {
				int i_562_ = anIntArray6452[i_529_];
				int i_563_ = is_531_[i_530_];
				int i_564_ = i_562_ + i_563_;
				int i_565_ = ((i_562_ & 0xff00ff)
					      + (i_563_ & 0xff00ff));
				i_563_
				    = (i_565_ & 0x1000100) + (i_564_ - i_565_
							      & 0x10000);
				is_531_[i_530_]
				    = i_564_ - i_563_ | i_563_ - (i_563_
								  >>> 8);
			    } else if (i_532_ == 1) {
				int i_566_ = anIntArray6452[i_529_];
				int i_567_ = (((i_566_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_568_ = (((i_566_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_569_ = (((i_566_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_566_ = (i_567_ | i_568_ | i_569_) >>> 8;
				int i_570_ = is_531_[i_530_];
				int i_571_ = i_566_ + i_570_;
				int i_572_ = ((i_566_ & 0xff00ff)
					      + (i_570_ & 0xff00ff));
				i_570_
				    = (i_572_ & 0x1000100) + (i_571_ - i_572_
							      & 0x10000);
				is_531_[i_530_]
				    = i_571_ - i_570_ | i_570_ - (i_570_
								  >>> 8);
			    } else if (i_532_ == 2) {
				int i_573_ = anIntArray6452[i_529_];
				int i_574_ = (((i_573_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_575_ = (((i_573_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_573_ = (((i_574_ | i_575_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_576_ = is_531_[i_530_];
				int i_577_ = i_573_ + i_576_;
				int i_578_ = ((i_573_ & 0xff00ff)
					      + (i_576_ & 0xff00ff));
				i_576_
				    = (i_578_ & 0x1000100) + (i_577_ - i_578_
							      & 0x10000);
				is_531_[i_530_]
				    = i_577_ - i_576_ | i_576_ - (i_576_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_525_ += Class152_Sub1.anInt4718;
			i_526_ += Class152_Sub1.anInt4731;
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    }
	} else if (Class152_Sub1.anInt4731 == 0) {
	    int i = Class152_Sub1.anInt4719;
	    while (i < 0) {
		int i_579_ = Class152_Sub1.anInt4725;
		int i_580_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_581_ = Class152_Sub1.anInt4741;
		int i_582_ = Class152_Sub1.anInt4739;
		if (i_581_ >= 0 && i_581_ - (anInt4735 << 12) < 0) {
		    if (i_580_ < 0) {
			int i_583_ = ((Class152_Sub1.anInt4718 - 1 - i_580_)
				      / Class152_Sub1.anInt4718);
			i_582_ += i_583_;
			i_580_ += Class152_Sub1.anInt4718 * i_583_;
			i_579_ += i_583_;
		    }
		    int i_584_;
		    if ((i_584_ = ((1 + i_580_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_582_)
			i_582_ = i_584_;
		    for (/**/; i_582_ < 0; i_582_++) {
			int i_585_
			    = (i_581_ >> 12) * anInt4729 + (i_580_ >> 12);
			int i_586_ = i_579_++;
			int[] is_587_ = is;
			int i_588_ = arg0;
			int i_589_ = arg1;
			if (i_589_ == 0) {
			    if (i_588_ == 0)
				is_587_[i_586_] = anIntArray6452[i_585_];
			    else if (i_588_ == 1) {
				int i_590_ = anIntArray6452[i_585_++];
				int i_591_ = (((i_590_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_592_ = (((i_590_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_593_ = (((i_590_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_587_[i_586_]
				    = (i_591_ | i_592_ | i_593_) >>> 8;
			    } else if (i_588_ == 2) {
				int i_594_ = anIntArray6452[i_585_];
				int i_595_ = (((i_594_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_596_ = (((i_594_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_587_[i_586_] = (((i_595_ | i_596_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_589_ == 1) {
			    if (i_588_ == 0) {
				int i_597_ = anIntArray6452[i_585_];
				int i_598_ = i_597_ >>> 24;
				int i_599_ = 256 - i_598_;
				int i_600_ = is_587_[i_586_];
				is_587_[i_586_]
				    = ((((i_597_ & 0xff00ff) * i_598_
					 + (i_600_ & 0xff00ff) * i_599_)
					& ~0xff00ff)
				       + (((i_597_ & 0xff00) * i_598_
					   + (i_600_ & 0xff00) * i_599_)
					  & 0xff0000)) >> 8;
			    } else if (i_588_ == 1) {
				int i_601_ = anIntArray6452[i_585_];
				int i_602_ = (((i_601_ >>> 24)
					       * Class152_Sub1.anInt4711)
					      >> 8);
				int i_603_ = 256 - i_602_;
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_604_ = is_587_[i_586_];
				    is_587_[i_586_]
					= ((((i_601_ & 0xff00ff) * i_602_
					     + (i_604_ & 0xff00ff) * i_603_)
					    & ~0xff00ff)
					   + (((i_601_ & 0xff00) * i_602_
					       + (i_604_ & 0xff00) * i_603_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_605_ = (((i_601_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_606_ = (((i_601_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_607_ = (((i_601_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_601_ = (i_605_ | i_606_ | i_607_) >>> 8;
				    int i_608_ = is_587_[i_586_];
				    is_587_[i_586_]
					= ((((i_601_ & 0xff00ff) * i_602_
					     + (i_608_ & 0xff00ff) * i_603_)
					    & ~0xff00ff)
					   + (((i_601_ & 0xff00) * i_602_
					       + (i_608_ & 0xff00) * i_603_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_609_ = (((i_601_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_610_ = (((i_601_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_611_ = (((i_601_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_587_[i_586_]
					= (i_609_ | i_610_ | i_611_) >>> 8;
				}
			    } else if (i_588_ == 2) {
				int i_612_ = anIntArray6452[i_585_];
				int i_613_ = i_612_ >>> 24;
				int i_614_ = 256 - i_613_;
				int i_615_ = (((i_612_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_616_ = (((i_612_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_612_ = (((i_615_ | i_616_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_617_ = is_587_[i_586_];
				is_587_[i_586_]
				    = ((((i_612_ & 0xff00ff) * i_613_
					 + (i_617_ & 0xff00ff) * i_614_)
					& ~0xff00ff)
				       + (((i_612_ & 0xff00) * i_613_
					   + (i_617_ & 0xff00) * i_614_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_589_ == 2) {
			    if (i_588_ == 0) {
				int i_618_ = anIntArray6452[i_585_];
				int i_619_ = is_587_[i_586_];
				int i_620_ = i_618_ + i_619_;
				int i_621_ = ((i_618_ & 0xff00ff)
					      + (i_619_ & 0xff00ff));
				i_619_
				    = (i_621_ & 0x1000100) + (i_620_ - i_621_
							      & 0x10000);
				is_587_[i_586_]
				    = i_620_ - i_619_ | i_619_ - (i_619_
								  >>> 8);
			    } else if (i_588_ == 1) {
				int i_622_ = anIntArray6452[i_585_];
				int i_623_ = (((i_622_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_624_ = (((i_622_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_625_ = (((i_622_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_622_ = (i_623_ | i_624_ | i_625_) >>> 8;
				int i_626_ = is_587_[i_586_];
				int i_627_ = i_622_ + i_626_;
				int i_628_ = ((i_622_ & 0xff00ff)
					      + (i_626_ & 0xff00ff));
				i_626_
				    = (i_628_ & 0x1000100) + (i_627_ - i_628_
							      & 0x10000);
				is_587_[i_586_]
				    = i_627_ - i_626_ | i_626_ - (i_626_
								  >>> 8);
			    } else if (i_588_ == 2) {
				int i_629_ = anIntArray6452[i_585_];
				int i_630_ = (((i_629_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_631_ = (((i_629_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_629_ = (((i_630_ | i_631_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_632_ = is_587_[i_586_];
				int i_633_ = i_629_ + i_632_;
				int i_634_ = ((i_629_ & 0xff00ff)
					      + (i_632_ & 0xff00ff));
				i_632_
				    = (i_634_ & 0x1000100) + (i_633_ - i_634_
							      & 0x10000);
				is_587_[i_586_]
				    = i_633_ - i_632_ | i_632_ - (i_632_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_580_ += Class152_Sub1.anInt4718;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else if (Class152_Sub1.anInt4731 < 0) {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_635_ = Class152_Sub1.anInt4725;
		int i_636_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_637_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_638_ = Class152_Sub1.anInt4739;
		if (i_636_ < 0) {
		    int i_639_ = ((Class152_Sub1.anInt4718 - 1 - i_636_)
				  / Class152_Sub1.anInt4718);
		    i_638_ += i_639_;
		    i_636_ += Class152_Sub1.anInt4718 * i_639_;
		    i_637_ += Class152_Sub1.anInt4731 * i_639_;
		    i_635_ += i_639_;
		}
		int i_640_;
		if ((i_640_
		     = (1 + i_636_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_638_)
		    i_638_ = i_640_;
		if ((i_640_ = i_637_ - (anInt4735 << 12)) >= 0) {
		    i_640_ = ((Class152_Sub1.anInt4731 - i_640_)
			      / Class152_Sub1.anInt4731);
		    i_638_ += i_640_;
		    i_636_ += Class152_Sub1.anInt4718 * i_640_;
		    i_637_ += Class152_Sub1.anInt4731 * i_640_;
		    i_635_ += i_640_;
		}
		if ((i_640_ = ((i_637_ - Class152_Sub1.anInt4731)
			       / Class152_Sub1.anInt4731))
		    > i_638_)
		    i_638_ = i_640_;
		for (/**/; i_638_ < 0; i_638_++) {
		    int i_641_ = (i_637_ >> 12) * anInt4729 + (i_636_ >> 12);
		    int i_642_ = i_635_++;
		    int[] is_643_ = is;
		    int i_644_ = arg0;
		    int i_645_ = arg1;
		    if (i_645_ == 0) {
			if (i_644_ == 0)
			    is_643_[i_642_] = anIntArray6452[i_641_];
			else if (i_644_ == 1) {
			    int i_646_ = anIntArray6452[i_641_++];
			    int i_647_ = (((i_646_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_648_
				= ((i_646_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_649_
				= ((i_646_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_643_[i_642_] = (i_647_ | i_648_ | i_649_) >>> 8;
			} else if (i_644_ == 2) {
			    int i_650_ = anIntArray6452[i_641_];
			    int i_651_ = (((i_650_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_652_
				= ((i_650_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_643_[i_642_] = (((i_651_ | i_652_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_645_ == 1) {
			if (i_644_ == 0) {
			    int i_653_ = anIntArray6452[i_641_];
			    int i_654_ = i_653_ >>> 24;
			    int i_655_ = 256 - i_654_;
			    int i_656_ = is_643_[i_642_];
			    is_643_[i_642_]
				= ((((i_653_ & 0xff00ff) * i_654_
				     + (i_656_ & 0xff00ff) * i_655_)
				    & ~0xff00ff)
				   + (((i_653_ & 0xff00) * i_654_
				       + (i_656_ & 0xff00) * i_655_)
				      & 0xff0000)) >> 8;
			} else if (i_644_ == 1) {
			    int i_657_ = anIntArray6452[i_641_];
			    int i_658_
				= ((i_657_ >>> 24) * Class152_Sub1.anInt4711
				   >> 8);
			    int i_659_ = 256 - i_658_;
			    if ((Class152_Sub1.anInt4726 & 0xffffff)
				== 16777215) {
				int i_660_ = is_643_[i_642_];
				is_643_[i_642_]
				    = ((((i_657_ & 0xff00ff) * i_658_
					 + (i_660_ & 0xff00ff) * i_659_)
					& ~0xff00ff)
				       + (((i_657_ & 0xff00) * i_658_
					   + (i_660_ & 0xff00) * i_659_)
					  & 0xff0000)) >> 8;
			    } else if (Class152_Sub1.anInt4711 != 255) {
				int i_661_ = (((i_657_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_662_ = (((i_657_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_663_ = (((i_657_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_657_ = (i_661_ | i_662_ | i_663_) >>> 8;
				int i_664_ = is_643_[i_642_];
				is_643_[i_642_]
				    = ((((i_657_ & 0xff00ff) * i_658_
					 + (i_664_ & 0xff00ff) * i_659_)
					& ~0xff00ff)
				       + (((i_657_ & 0xff00) * i_658_
					   + (i_664_ & 0xff00) * i_659_)
					  & 0xff0000)) >> 8;
			    } else {
				int i_665_ = (((i_657_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_666_ = (((i_657_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_667_ = (((i_657_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_643_[i_642_]
				    = (i_665_ | i_666_ | i_667_) >>> 8;
			    }
			} else if (i_644_ == 2) {
			    int i_668_ = anIntArray6452[i_641_];
			    int i_669_ = i_668_ >>> 24;
			    int i_670_ = 256 - i_669_;
			    int i_671_ = (((i_668_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_672_
				= ((i_668_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    i_668_ = (((i_671_ | i_672_) >>> 8)
				      + Class152_Sub1.anInt4722);
			    int i_673_ = is_643_[i_642_];
			    is_643_[i_642_]
				= ((((i_668_ & 0xff00ff) * i_669_
				     + (i_673_ & 0xff00ff) * i_670_)
				    & ~0xff00ff)
				   + (((i_668_ & 0xff00) * i_669_
				       + (i_673_ & 0xff00) * i_670_)
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_645_ == 2) {
			if (i_644_ == 0) {
			    int i_674_ = anIntArray6452[i_641_];
			    int i_675_ = is_643_[i_642_];
			    int i_676_ = i_674_ + i_675_;
			    int i_677_
				= (i_674_ & 0xff00ff) + (i_675_ & 0xff00ff);
			    i_675_ = (i_677_ & 0x1000100) + (i_676_ - i_677_
							     & 0x10000);
			    is_643_[i_642_]
				= i_676_ - i_675_ | i_675_ - (i_675_ >>> 8);
			} else if (i_644_ == 1) {
			    int i_678_ = anIntArray6452[i_641_];
			    int i_679_ = (((i_678_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_680_
				= ((i_678_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_681_
				= ((i_678_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    i_678_ = (i_679_ | i_680_ | i_681_) >>> 8;
			    int i_682_ = is_643_[i_642_];
			    int i_683_ = i_678_ + i_682_;
			    int i_684_
				= (i_678_ & 0xff00ff) + (i_682_ & 0xff00ff);
			    i_682_ = (i_684_ & 0x1000100) + (i_683_ - i_684_
							     & 0x10000);
			    is_643_[i_642_]
				= i_683_ - i_682_ | i_682_ - (i_682_ >>> 8);
			} else if (i_644_ == 2) {
			    int i_685_ = anIntArray6452[i_641_];
			    int i_686_ = (((i_685_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_687_
				= ((i_685_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    i_685_ = (((i_686_ | i_687_) >>> 8)
				      + Class152_Sub1.anInt4722);
			    int i_688_ = is_643_[i_642_];
			    int i_689_ = i_685_ + i_688_;
			    int i_690_
				= (i_685_ & 0xff00ff) + (i_688_ & 0xff00ff);
			    i_688_ = (i_690_ & 0x1000100) + (i_689_ - i_690_
							     & 0x10000);
			    is_643_[i_642_]
				= i_689_ - i_688_ | i_688_ - (i_688_ >>> 8);
			}
		    } else
			throw new IllegalArgumentException();
		    i_636_ += Class152_Sub1.anInt4718;
		    i_637_ += Class152_Sub1.anInt4731;
		}
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_691_ = Class152_Sub1.anInt4725;
		int i_692_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_693_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_694_ = Class152_Sub1.anInt4739;
		if (i_692_ < 0) {
		    int i_695_ = ((Class152_Sub1.anInt4718 - 1 - i_692_)
				  / Class152_Sub1.anInt4718);
		    i_694_ += i_695_;
		    i_692_ += Class152_Sub1.anInt4718 * i_695_;
		    i_693_ += Class152_Sub1.anInt4731 * i_695_;
		    i_691_ += i_695_;
		}
		int i_696_;
		if ((i_696_
		     = (1 + i_692_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_694_)
		    i_694_ = i_696_;
		if (i_693_ < 0) {
		    i_696_ = ((Class152_Sub1.anInt4731 - 1 - i_693_)
			      / Class152_Sub1.anInt4731);
		    i_694_ += i_696_;
		    i_692_ += Class152_Sub1.anInt4718 * i_696_;
		    i_693_ += Class152_Sub1.anInt4731 * i_696_;
		    i_691_ += i_696_;
		}
		if ((i_696_
		     = (1 + i_693_ - (anInt4735 << 12)
			- Class152_Sub1.anInt4731) / Class152_Sub1.anInt4731)
		    > i_694_)
		    i_694_ = i_696_;
		for (/**/; i_694_ < 0; i_694_++) {
		    int i_697_ = (i_693_ >> 12) * anInt4729 + (i_692_ >> 12);
		    int i_698_ = i_691_++;
		    int[] is_699_ = is;
		    int i_700_ = arg0;
		    int i_701_ = arg1;
		    if (i_701_ == 0) {
			if (i_700_ == 0)
			    is_699_[i_698_] = anIntArray6452[i_697_];
			else if (i_700_ == 1) {
			    int i_702_ = anIntArray6452[i_697_++];
			    int i_703_ = (((i_702_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_704_
				= ((i_702_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_705_
				= ((i_702_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_699_[i_698_] = (i_703_ | i_704_ | i_705_) >>> 8;
			} else if (i_700_ == 2) {
			    int i_706_ = anIntArray6452[i_697_];
			    int i_707_ = (((i_706_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_708_
				= ((i_706_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_699_[i_698_] = (((i_707_ | i_708_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_701_ == 1) {
			if (i_700_ == 0) {
			    int i_709_ = anIntArray6452[i_697_];
			    int i_710_ = i_709_ >>> 24;
			    int i_711_ = 256 - i_710_;
			    int i_712_ = is_699_[i_698_];
			    is_699_[i_698_]
				= ((((i_709_ & 0xff00ff) * i_710_
				     + (i_712_ & 0xff00ff) * i_711_)
				    & ~0xff00ff)
				   + (((i_709_ & 0xff00) * i_710_
				       + (i_712_ & 0xff00) * i_711_)
				      & 0xff0000)) >> 8;
			} else if (i_700_ == 1) {
			    int i_713_ = anIntArray6452[i_697_];
			    int i_714_
				= ((i_713_ >>> 24) * Class152_Sub1.anInt4711
				   >> 8);
			    int i_715_ = 256 - i_714_;
			    if ((Class152_Sub1.anInt4726 & 0xffffff)
				== 16777215) {
				int i_716_ = is_699_[i_698_];
				is_699_[i_698_]
				    = ((((i_713_ & 0xff00ff) * i_714_
					 + (i_716_ & 0xff00ff) * i_715_)
					& ~0xff00ff)
				       + (((i_713_ & 0xff00) * i_714_
					   + (i_716_ & 0xff00) * i_715_)
					  & 0xff0000)) >> 8;
			    } else if (Class152_Sub1.anInt4711 != 255) {
				int i_717_ = (((i_713_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_718_ = (((i_713_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_719_ = (((i_713_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_713_ = (i_717_ | i_718_ | i_719_) >>> 8;
				int i_720_ = is_699_[i_698_];
				is_699_[i_698_]
				    = ((((i_713_ & 0xff00ff) * i_714_
					 + (i_720_ & 0xff00ff) * i_715_)
					& ~0xff00ff)
				       + (((i_713_ & 0xff00) * i_714_
					   + (i_720_ & 0xff00) * i_715_)
					  & 0xff0000)) >> 8;
			    } else {
				int i_721_ = (((i_713_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_722_ = (((i_713_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_723_ = (((i_713_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_699_[i_698_]
				    = (i_721_ | i_722_ | i_723_) >>> 8;
			    }
			} else if (i_700_ == 2) {
			    int i_724_ = anIntArray6452[i_697_];
			    int i_725_ = i_724_ >>> 24;
			    int i_726_ = 256 - i_725_;
			    int i_727_ = (((i_724_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_728_
				= ((i_724_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    i_724_ = (((i_727_ | i_728_) >>> 8)
				      + Class152_Sub1.anInt4722);
			    int i_729_ = is_699_[i_698_];
			    is_699_[i_698_]
				= ((((i_724_ & 0xff00ff) * i_725_
				     + (i_729_ & 0xff00ff) * i_726_)
				    & ~0xff00ff)
				   + (((i_724_ & 0xff00) * i_725_
				       + (i_729_ & 0xff00) * i_726_)
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_701_ == 2) {
			if (i_700_ == 0) {
			    int i_730_ = anIntArray6452[i_697_];
			    int i_731_ = is_699_[i_698_];
			    int i_732_ = i_730_ + i_731_;
			    int i_733_
				= (i_730_ & 0xff00ff) + (i_731_ & 0xff00ff);
			    i_731_ = (i_733_ & 0x1000100) + (i_732_ - i_733_
							     & 0x10000);
			    is_699_[i_698_]
				= i_732_ - i_731_ | i_731_ - (i_731_ >>> 8);
			} else if (i_700_ == 1) {
			    int i_734_ = anIntArray6452[i_697_];
			    int i_735_ = (((i_734_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_736_
				= ((i_734_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_737_
				= ((i_734_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    i_734_ = (i_735_ | i_736_ | i_737_) >>> 8;
			    int i_738_ = is_699_[i_698_];
			    int i_739_ = i_734_ + i_738_;
			    int i_740_
				= (i_734_ & 0xff00ff) + (i_738_ & 0xff00ff);
			    i_738_ = (i_740_ & 0x1000100) + (i_739_ - i_740_
							     & 0x10000);
			    is_699_[i_698_]
				= i_739_ - i_738_ | i_738_ - (i_738_ >>> 8);
			} else if (i_700_ == 2) {
			    int i_741_ = anIntArray6452[i_697_];
			    int i_742_ = (((i_741_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_743_
				= ((i_741_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    i_741_ = (((i_742_ | i_743_) >>> 8)
				      + Class152_Sub1.anInt4722);
			    int i_744_ = is_699_[i_698_];
			    int i_745_ = i_741_ + i_744_;
			    int i_746_
				= (i_741_ & 0xff00ff) + (i_744_ & 0xff00ff);
			    i_744_ = (i_746_ & 0x1000100) + (i_745_ - i_746_
							     & 0x10000);
			    is_699_[i_698_]
				= i_745_ - i_744_ | i_744_ - (i_744_ >>> 8);
			}
		    } else
			throw new IllegalArgumentException();
		    i_692_ += Class152_Sub1.anInt4718;
		    i_693_ += Class152_Sub1.anInt4731;
		}
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	}
    }
    
    public void method2218(int[] arg0, int[] arg1, int arg2, int arg3) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	if (Class152_Sub1.anInt4718 == 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_747_ = i + arg3;
		    if (i_747_ >= 0) {
			if (i_747_ >= arg0.length)
			    break;
			int i_748_ = Class152_Sub1.anInt4725;
			int i_749_ = Class152_Sub1.anInt4723;
			int i_750_ = Class152_Sub1.anInt4741;
			int i_751_ = Class152_Sub1.anInt4739;
			if (i_749_ >= 0 && i_750_ >= 0
			    && i_749_ - (anInt4729 << 12) < 0
			    && i_750_ - (anInt4735 << 12) < 0) {
			    int i_752_ = arg0[i_747_] - arg2;
			    int i_753_ = -arg1[i_747_];
			    int i_754_
				= i_752_ - (i_748_ - Class152_Sub1.anInt4725);
			    if (i_754_ > 0) {
				i_748_ += i_754_;
				i_751_ += i_754_;
				i_749_ += Class152_Sub1.anInt4718 * i_754_;
				i_750_ += Class152_Sub1.anInt4731 * i_754_;
			    } else
				i_753_ -= i_754_;
			    if (i_751_ < i_753_)
				i_751_ = i_753_;
			    for (/**/; i_751_ < 0; i_751_++) {
				int i_755_
				    = (anIntArray6452
				       [(i_750_ >> 12) * anInt4729 + (i_749_
								      >> 12)]);
				int i_756_ = i_755_ >>> 24;
				int i_757_ = 256 - i_756_;
				int i_758_ = is[i_748_];
				is[i_748_++]
				    = ((((i_755_ & 0xff00ff) * i_756_
					 + (i_758_ & 0xff00ff) * i_757_)
					& ~0xff00ff)
				       + (((i_755_ & 0xff00) * i_756_
					   + (i_758_ & 0xff00) * i_757_)
					  & 0xff0000)) >> 8;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_759_ = i + arg3;
		    if (i_759_ >= 0) {
			if (i_759_ >= arg0.length)
			    break;
			int i_760_ = Class152_Sub1.anInt4725;
			int i_761_ = Class152_Sub1.anInt4723;
			int i_762_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_763_ = Class152_Sub1.anInt4739;
			if (i_761_ >= 0 && i_761_ - (anInt4729 << 12) < 0) {
			    int i_764_;
			    if ((i_764_ = i_762_ - (anInt4735 << 12)) >= 0) {
				i_764_ = ((Class152_Sub1.anInt4731 - i_764_)
					  / Class152_Sub1.anInt4731);
				i_763_ += i_764_;
				i_762_ += Class152_Sub1.anInt4731 * i_764_;
				i_760_ += i_764_;
			    }
			    if ((i_764_ = ((i_762_ - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_763_)
				i_763_ = i_764_;
			    int i_765_ = arg0[i_759_] - arg2;
			    int i_766_ = -arg1[i_759_];
			    int i_767_
				= i_765_ - (i_760_ - Class152_Sub1.anInt4725);
			    if (i_767_ > 0) {
				i_760_ += i_767_;
				i_763_ += i_767_;
				i_761_ += Class152_Sub1.anInt4718 * i_767_;
				i_762_ += Class152_Sub1.anInt4731 * i_767_;
			    } else
				i_766_ -= i_767_;
			    if (i_763_ < i_766_)
				i_763_ = i_766_;
			    for (/**/; i_763_ < 0; i_763_++) {
				int i_768_
				    = (anIntArray6452
				       [(i_762_ >> 12) * anInt4729 + (i_761_
								      >> 12)]);
				int i_769_ = i_768_ >>> 24;
				int i_770_ = 256 - i_769_;
				int i_771_ = is[i_760_];
				is[i_760_++]
				    = ((((i_768_ & 0xff00ff) * i_769_
					 + (i_771_ & 0xff00ff) * i_770_)
					& ~0xff00ff)
				       + (((i_768_ & 0xff00) * i_769_
					   + (i_771_ & 0xff00) * i_770_)
					  & 0xff0000)) >> 8;
				i_762_ += Class152_Sub1.anInt4731;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_772_ = i + arg3;
		    if (i_772_ >= 0) {
			if (i_772_ >= arg0.length)
			    break;
			int i_773_ = Class152_Sub1.anInt4725;
			int i_774_ = Class152_Sub1.anInt4723;
			int i_775_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_776_ = Class152_Sub1.anInt4739;
			if (i_774_ >= 0 && i_774_ - (anInt4729 << 12) < 0) {
			    if (i_775_ < 0) {
				int i_777_
				    = ((Class152_Sub1.anInt4731 - 1 - i_775_)
				       / Class152_Sub1.anInt4731);
				i_776_ += i_777_;
				i_775_ += Class152_Sub1.anInt4731 * i_777_;
				i_773_ += i_777_;
			    }
			    int i_778_;
			    if ((i_778_ = ((1 + i_775_ - (anInt4735 << 12)
					    - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_776_)
				i_776_ = i_778_;
			    int i_779_ = arg0[i_772_] - arg2;
			    int i_780_ = -arg1[i_772_];
			    int i_781_
				= i_779_ - (i_773_ - Class152_Sub1.anInt4725);
			    if (i_781_ > 0) {
				i_773_ += i_781_;
				i_776_ += i_781_;
				i_774_ += Class152_Sub1.anInt4718 * i_781_;
				i_775_ += Class152_Sub1.anInt4731 * i_781_;
			    } else
				i_780_ -= i_781_;
			    if (i_776_ < i_780_)
				i_776_ = i_780_;
			    for (/**/; i_776_ < 0; i_776_++) {
				int i_782_
				    = (anIntArray6452
				       [(i_775_ >> 12) * anInt4729 + (i_774_
								      >> 12)]);
				int i_783_ = i_782_ >>> 24;
				int i_784_ = 256 - i_783_;
				int i_785_ = is[i_773_];
				is[i_773_++]
				    = ((((i_782_ & 0xff00ff) * i_783_
					 + (i_785_ & 0xff00ff) * i_784_)
					& ~0xff00ff)
				       + (((i_782_ & 0xff00) * i_783_
					   + (i_785_ & 0xff00) * i_784_)
					  & 0xff0000)) >> 8;
				i_775_ += Class152_Sub1.anInt4731;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    }
	} else if (Class152_Sub1.anInt4718 < 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_786_ = i + arg3;
		    if (i_786_ >= 0) {
			if (i_786_ >= arg0.length)
			    break;
			int i_787_ = Class152_Sub1.anInt4725;
			int i_788_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_789_ = Class152_Sub1.anInt4741;
			int i_790_ = Class152_Sub1.anInt4739;
			if (i_789_ >= 0 && i_789_ - (anInt4735 << 12) < 0) {
			    int i_791_;
			    if ((i_791_ = i_788_ - (anInt4729 << 12)) >= 0) {
				i_791_ = ((Class152_Sub1.anInt4718 - i_791_)
					  / Class152_Sub1.anInt4718);
				i_790_ += i_791_;
				i_788_ += Class152_Sub1.anInt4718 * i_791_;
				i_787_ += i_791_;
			    }
			    if ((i_791_ = ((i_788_ - Class152_Sub1.anInt4718)
					   / Class152_Sub1.anInt4718))
				> i_790_)
				i_790_ = i_791_;
			    int i_792_ = arg0[i_786_] - arg2;
			    int i_793_ = -arg1[i_786_];
			    int i_794_
				= i_792_ - (i_787_ - Class152_Sub1.anInt4725);
			    if (i_794_ > 0) {
				i_787_ += i_794_;
				i_790_ += i_794_;
				i_788_ += Class152_Sub1.anInt4718 * i_794_;
				i_789_ += Class152_Sub1.anInt4731 * i_794_;
			    } else
				i_793_ -= i_794_;
			    if (i_790_ < i_793_)
				i_790_ = i_793_;
			    for (/**/; i_790_ < 0; i_790_++) {
				int i_795_
				    = (anIntArray6452
				       [(i_789_ >> 12) * anInt4729 + (i_788_
								      >> 12)]);
				int i_796_ = i_795_ >>> 24;
				int i_797_ = 256 - i_796_;
				int i_798_ = is[i_787_];
				is[i_787_++]
				    = ((((i_795_ & 0xff00ff) * i_796_
					 + (i_798_ & 0xff00ff) * i_797_)
					& ~0xff00ff)
				       + (((i_795_ & 0xff00) * i_796_
					   + (i_798_ & 0xff00) * i_797_)
					  & 0xff0000)) >> 8;
				i_788_ += Class152_Sub1.anInt4718;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_799_ = i + arg3;
		    if (i_799_ >= 0) {
			if (i_799_ >= arg0.length)
			    break;
			int i_800_ = Class152_Sub1.anInt4725;
			int i_801_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_802_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_803_ = Class152_Sub1.anInt4739;
			int i_804_;
			if ((i_804_ = i_801_ - (anInt4729 << 12)) >= 0) {
			    i_804_ = ((Class152_Sub1.anInt4718 - i_804_)
				      / Class152_Sub1.anInt4718);
			    i_803_ += i_804_;
			    i_801_ += Class152_Sub1.anInt4718 * i_804_;
			    i_802_ += Class152_Sub1.anInt4731 * i_804_;
			    i_800_ += i_804_;
			}
			if ((i_804_ = ((i_801_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_803_)
			    i_803_ = i_804_;
			if ((i_804_ = i_802_ - (anInt4735 << 12)) >= 0) {
			    i_804_ = ((Class152_Sub1.anInt4731 - i_804_)
				      / Class152_Sub1.anInt4731);
			    i_803_ += i_804_;
			    i_801_ += Class152_Sub1.anInt4718 * i_804_;
			    i_802_ += Class152_Sub1.anInt4731 * i_804_;
			    i_800_ += i_804_;
			}
			if ((i_804_ = ((i_802_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_803_)
			    i_803_ = i_804_;
			int i_805_ = arg0[i_799_] - arg2;
			int i_806_ = -arg1[i_799_];
			int i_807_
			    = i_805_ - (i_800_ - Class152_Sub1.anInt4725);
			if (i_807_ > 0) {
			    i_800_ += i_807_;
			    i_803_ += i_807_;
			    i_801_ += Class152_Sub1.anInt4718 * i_807_;
			    i_802_ += Class152_Sub1.anInt4731 * i_807_;
			} else
			    i_806_ -= i_807_;
			if (i_803_ < i_806_)
			    i_803_ = i_806_;
			for (/**/; i_803_ < 0; i_803_++) {
			    int i_808_
				= (anIntArray6452
				   [(i_802_ >> 12) * anInt4729 + (i_801_
								  >> 12)]);
			    int i_809_ = i_808_ >>> 24;
			    int i_810_ = 256 - i_809_;
			    int i_811_ = is[i_800_];
			    is[i_800_++] = ((((i_808_ & 0xff00ff) * i_809_
					      + (i_811_ & 0xff00ff) * i_810_)
					     & ~0xff00ff)
					    + (((i_808_ & 0xff00) * i_809_
						+ (i_811_ & 0xff00) * i_810_)
					       & 0xff0000)) >> 8;
			    i_801_ += Class152_Sub1.anInt4718;
			    i_802_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_812_ = i + arg3;
		    if (i_812_ >= 0) {
			if (i_812_ >= arg0.length)
			    break;
			int i_813_ = Class152_Sub1.anInt4725;
			int i_814_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_815_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_816_ = Class152_Sub1.anInt4739;
			int i_817_;
			if ((i_817_ = i_814_ - (anInt4729 << 12)) >= 0) {
			    i_817_ = ((Class152_Sub1.anInt4718 - i_817_)
				      / Class152_Sub1.anInt4718);
			    i_816_ += i_817_;
			    i_814_ += Class152_Sub1.anInt4718 * i_817_;
			    i_815_ += Class152_Sub1.anInt4731 * i_817_;
			    i_813_ += i_817_;
			}
			if ((i_817_ = ((i_814_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_816_)
			    i_816_ = i_817_;
			if (i_815_ < 0) {
			    i_817_ = ((Class152_Sub1.anInt4731 - 1 - i_815_)
				      / Class152_Sub1.anInt4731);
			    i_816_ += i_817_;
			    i_814_ += Class152_Sub1.anInt4718 * i_817_;
			    i_815_ += Class152_Sub1.anInt4731 * i_817_;
			    i_813_ += i_817_;
			}
			if ((i_817_ = ((1 + i_815_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_816_)
			    i_816_ = i_817_;
			int i_818_ = arg0[i_812_] - arg2;
			int i_819_ = -arg1[i_812_];
			int i_820_
			    = i_818_ - (i_813_ - Class152_Sub1.anInt4725);
			if (i_820_ > 0) {
			    i_813_ += i_820_;
			    i_816_ += i_820_;
			    i_814_ += Class152_Sub1.anInt4718 * i_820_;
			    i_815_ += Class152_Sub1.anInt4731 * i_820_;
			} else
			    i_819_ -= i_820_;
			if (i_816_ < i_819_)
			    i_816_ = i_819_;
			for (/**/; i_816_ < 0; i_816_++) {
			    int i_821_
				= (anIntArray6452
				   [(i_815_ >> 12) * anInt4729 + (i_814_
								  >> 12)]);
			    int i_822_ = i_821_ >>> 24;
			    int i_823_ = 256 - i_822_;
			    int i_824_ = is[i_813_];
			    is[i_813_++] = ((((i_821_ & 0xff00ff) * i_822_
					      + (i_824_ & 0xff00ff) * i_823_)
					     & ~0xff00ff)
					    + (((i_821_ & 0xff00) * i_822_
						+ (i_824_ & 0xff00) * i_823_)
					       & 0xff0000)) >> 8;
			    i_814_ += Class152_Sub1.anInt4718;
			    i_815_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    }
	} else if (Class152_Sub1.anInt4731 == 0) {
	    int i = Class152_Sub1.anInt4719;
	    while (i < 0) {
		int i_825_ = i + arg3;
		if (i_825_ >= 0) {
		    if (i_825_ >= arg0.length)
			break;
		    int i_826_ = Class152_Sub1.anInt4725;
		    int i_827_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_828_ = Class152_Sub1.anInt4741;
		    int i_829_ = Class152_Sub1.anInt4739;
		    if (i_828_ >= 0 && i_828_ - (anInt4735 << 12) < 0) {
			if (i_827_ < 0) {
			    int i_830_
				= ((Class152_Sub1.anInt4718 - 1 - i_827_)
				   / Class152_Sub1.anInt4718);
			    i_829_ += i_830_;
			    i_827_ += Class152_Sub1.anInt4718 * i_830_;
			    i_826_ += i_830_;
			}
			int i_831_;
			if ((i_831_ = ((1 + i_827_ - (anInt4729 << 12)
					- Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_829_)
			    i_829_ = i_831_;
			int i_832_ = arg0[i_825_] - arg2;
			int i_833_ = -arg1[i_825_];
			int i_834_
			    = i_832_ - (i_826_ - Class152_Sub1.anInt4725);
			if (i_834_ > 0) {
			    i_826_ += i_834_;
			    i_829_ += i_834_;
			    i_827_ += Class152_Sub1.anInt4718 * i_834_;
			    i_828_ += Class152_Sub1.anInt4731 * i_834_;
			} else
			    i_833_ -= i_834_;
			if (i_829_ < i_833_)
			    i_829_ = i_833_;
			for (/**/; i_829_ < 0; i_829_++) {
			    int i_835_
				= (anIntArray6452
				   [(i_828_ >> 12) * anInt4729 + (i_827_
								  >> 12)]);
			    int i_836_ = i_835_ >>> 24;
			    int i_837_ = 256 - i_836_;
			    int i_838_ = is[i_826_];
			    is[i_826_++] = ((((i_835_ & 0xff00ff) * i_836_
					      + (i_838_ & 0xff00ff) * i_837_)
					     & ~0xff00ff)
					    + (((i_835_ & 0xff00) * i_836_
						+ (i_838_ & 0xff00) * i_837_)
					       & 0xff0000)) >> 8;
			    i_827_ += Class152_Sub1.anInt4718;
			}
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else if (Class152_Sub1.anInt4731 < 0) {
	    int i = Class152_Sub1.anInt4719;
	    while (i < 0) {
		int i_839_ = i + arg3;
		if (i_839_ >= 0) {
		    if (i_839_ >= arg0.length)
			break;
		    int i_840_ = Class152_Sub1.anInt4725;
		    int i_841_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_842_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_843_ = Class152_Sub1.anInt4739;
		    if (i_841_ < 0) {
			int i_844_ = ((Class152_Sub1.anInt4718 - 1 - i_841_)
				      / Class152_Sub1.anInt4718);
			i_843_ += i_844_;
			i_841_ += Class152_Sub1.anInt4718 * i_844_;
			i_842_ += Class152_Sub1.anInt4731 * i_844_;
			i_840_ += i_844_;
		    }
		    int i_845_;
		    if ((i_845_ = ((1 + i_841_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_843_)
			i_843_ = i_845_;
		    if ((i_845_ = i_842_ - (anInt4735 << 12)) >= 0) {
			i_845_ = ((Class152_Sub1.anInt4731 - i_845_)
				  / Class152_Sub1.anInt4731);
			i_843_ += i_845_;
			i_841_ += Class152_Sub1.anInt4718 * i_845_;
			i_842_ += Class152_Sub1.anInt4731 * i_845_;
			i_840_ += i_845_;
		    }
		    if ((i_845_ = ((i_842_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_843_)
			i_843_ = i_845_;
		    int i_846_ = arg0[i_839_] - arg2;
		    int i_847_ = -arg1[i_839_];
		    int i_848_ = i_846_ - (i_840_ - Class152_Sub1.anInt4725);
		    if (i_848_ > 0) {
			i_840_ += i_848_;
			i_843_ += i_848_;
			i_841_ += Class152_Sub1.anInt4718 * i_848_;
			i_842_ += Class152_Sub1.anInt4731 * i_848_;
		    } else
			i_847_ -= i_848_;
		    if (i_843_ < i_847_)
			i_843_ = i_847_;
		    for (/**/; i_843_ < 0; i_843_++) {
			int i_849_
			    = (anIntArray6452
			       [(i_842_ >> 12) * anInt4729 + (i_841_ >> 12)]);
			int i_850_ = i_849_ >>> 24;
			int i_851_ = 256 - i_850_;
			int i_852_ = is[i_840_];
			is[i_840_++] = ((((i_849_ & 0xff00ff) * i_850_
					  + (i_852_ & 0xff00ff) * i_851_)
					 & ~0xff00ff)
					+ (((i_849_ & 0xff00) * i_850_
					    + (i_852_ & 0xff00) * i_851_)
					   & 0xff0000)) >> 8;
			i_841_ += Class152_Sub1.anInt4718;
			i_842_ += Class152_Sub1.anInt4731;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else {
	    int i = Class152_Sub1.anInt4719;
	    while (i < 0) {
		int i_853_ = i + arg3;
		if (i_853_ >= 0) {
		    if (i_853_ >= arg0.length)
			break;
		    int i_854_ = Class152_Sub1.anInt4725;
		    int i_855_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_856_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_857_ = Class152_Sub1.anInt4739;
		    if (i_855_ < 0) {
			int i_858_ = ((Class152_Sub1.anInt4718 - 1 - i_855_)
				      / Class152_Sub1.anInt4718);
			i_857_ += i_858_;
			i_855_ += Class152_Sub1.anInt4718 * i_858_;
			i_856_ += Class152_Sub1.anInt4731 * i_858_;
			i_854_ += i_858_;
		    }
		    int i_859_;
		    if ((i_859_ = ((1 + i_855_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_857_)
			i_857_ = i_859_;
		    if (i_856_ < 0) {
			i_859_ = ((Class152_Sub1.anInt4731 - 1 - i_856_)
				  / Class152_Sub1.anInt4731);
			i_857_ += i_859_;
			i_855_ += Class152_Sub1.anInt4718 * i_859_;
			i_856_ += Class152_Sub1.anInt4731 * i_859_;
			i_854_ += i_859_;
		    }
		    if ((i_859_ = ((1 + i_856_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_857_)
			i_857_ = i_859_;
		    int i_860_ = arg0[i_853_] - arg2;
		    int i_861_ = -arg1[i_853_];
		    int i_862_ = i_860_ - (i_854_ - Class152_Sub1.anInt4725);
		    if (i_862_ > 0) {
			i_854_ += i_862_;
			i_857_ += i_862_;
			i_855_ += Class152_Sub1.anInt4718 * i_862_;
			i_856_ += Class152_Sub1.anInt4731 * i_862_;
		    } else
			i_861_ -= i_862_;
		    if (i_857_ < i_861_)
			i_857_ = i_861_;
		    for (/**/; i_857_ < 0; i_857_++) {
			int i_863_
			    = (anIntArray6452
			       [(i_856_ >> 12) * anInt4729 + (i_855_ >> 12)]);
			int i_864_ = i_863_ >>> 24;
			int i_865_ = 256 - i_864_;
			int i_866_ = is[i_854_];
			is[i_854_++] = ((((i_863_ & 0xff00ff) * i_864_
					  + (i_866_ & 0xff00ff) * i_865_)
					 & ~0xff00ff)
					+ (((i_863_ & 0xff00) * i_864_
					    + (i_866_ & 0xff00) * i_865_)
					   & 0xff0000)) >> 8;
			i_855_ += Class152_Sub1.anInt4718;
			i_856_ += Class152_Sub1.anInt4731;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	}
    }
}
