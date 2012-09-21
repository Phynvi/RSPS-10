/* Class152_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152_Sub1_Sub2 extends Class152_Sub1
{
    public byte[] aByteArray6450;
    public int[] anIntArray6451;
    
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
			    is[i_8_++]
				= (anIntArray6451
				   [aByteArray6450[(i >> 16) + i_15_] & 0xff]);
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
			    int i_24_
				= (anIntArray6451
				   [aByteArray6450[(i >> 16) + i_22_] & 0xff]);
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
			    int i_36_
				= (anIntArray6451
				   [aByteArray6450[(i >> 16) + i_34_] & 0xff]);
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
			    int i_41_ = aByteArray6450[(i >> 16) + i_39_];
			    if (i_41_ != 0)
				is[i_8_++] = anIntArray6451[i_41_ & 0xff];
			    else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_37_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_42_ = i;
		    if ((arg5 & 0xffffff) == 16777215) {
			int i_43_ = arg5 >>> 24;
			int i_44_ = 256 - i_43_;
			for (int i_45_ = -arg3; i_45_ < 0; i_45_++) {
			    int i_46_ = (i_0_ >> 16) * anInt4729;
			    for (int i_47_ = -arg2; i_47_ < 0; i_47_++) {
				int i_48_ = aByteArray6450[(i >> 16) + i_46_];
				if (i_48_ != 0) {
				    int i_49_ = anIntArray6451[i_48_ & 0xff];
				    int i_50_ = is[i_8_];
				    is[i_8_++]
					= ((((i_49_ & 0xff00ff) * i_43_
					     + (i_50_ & 0xff00ff) * i_44_)
					    & ~0xff00ff)
					   + (((i_49_ & 0xff00) * i_43_
					       + (i_50_ & 0xff00) * i_44_)
					      & 0xff0000)) >> 8;
				} else
				    i_8_++;
				i += i_4_;
			    }
			    i_0_ += i_5_;
			    i = i_42_;
			    i_8_ += i_9_;
			}
		    } else {
			int i_51_ = (arg5 & 0xff0000) >> 16;
			int i_52_ = (arg5 & 0xff00) >> 8;
			int i_53_ = arg5 & 0xff;
			int i_54_ = arg5 >>> 24;
			int i_55_ = 256 - i_54_;
			for (int i_56_ = -arg3; i_56_ < 0; i_56_++) {
			    int i_57_ = (i_0_ >> 16) * anInt4729;
			    for (int i_58_ = -arg2; i_58_ < 0; i_58_++) {
				int i_59_ = aByteArray6450[(i >> 16) + i_57_];
				if (i_59_ != 0) {
				    int i_60_ = anIntArray6451[i_59_ & 0xff];
				    if (i_54_ != 255) {
					int i_61_ = ((i_60_ & 0xff0000) * i_51_
						     & ~0xffffff);
					int i_62_ = ((i_60_ & 0xff00) * i_52_
						     & 0xff0000);
					int i_63_
					    = (i_60_ & 0xff) * i_53_ & 0xff00;
					i_60_ = (i_61_ | i_62_ | i_63_) >>> 8;
					int i_64_ = is[i_8_];
					is[i_8_++]
					    = ((((i_60_ & 0xff00ff) * i_54_
						 + (i_64_ & 0xff00ff) * i_55_)
						& ~0xff00ff)
					       + (((i_60_ & 0xff00) * i_54_
						   + (i_64_ & 0xff00) * i_55_)
						  & 0xff0000)) >> 8;
				    } else {
					int i_65_ = ((i_60_ & 0xff0000) * i_51_
						     & ~0xffffff);
					int i_66_ = ((i_60_ & 0xff00) * i_52_
						     & 0xff0000);
					int i_67_
					    = (i_60_ & 0xff) * i_53_ & 0xff00;
					is[i_8_++]
					    = (i_65_ | i_66_ | i_67_) >>> 8;
				    }
				} else
				    i_8_++;
				i += i_4_;
			    }
			    i_0_ += i_5_;
			    i = i_42_;
			    i_8_ += i_9_;
			}
			return;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_68_ = arg5 >>> 24;
		    int i_69_ = 256 - i_68_;
		    int i_70_ = (arg5 & 0xff00ff) * i_69_ & ~0xff00ff;
		    int i_71_ = (arg5 & 0xff00) * i_69_ & 0xff0000;
		    arg5 = (i_70_ | i_71_) >>> 8;
		    int i_72_ = i;
		    for (int i_73_ = -arg3; i_73_ < 0; i_73_++) {
			int i_74_ = (i_0_ >> 16) * anInt4729;
			for (int i_75_ = -arg2; i_75_ < 0; i_75_++) {
			    int i_76_ = aByteArray6450[(i >> 16) + i_74_];
			    if (i_76_ != 0) {
				int i_77_ = anIntArray6451[i_76_ & 0xff];
				i_70_ = (i_77_ & 0xff00ff) * i_68_ & ~0xff00ff;
				i_71_ = (i_77_ & 0xff00) * i_68_ & 0xff0000;
				is[i_8_++] = ((i_70_ | i_71_) >>> 8) + arg5;
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_72_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg6 == 2) {
		if (arg4 == 0) {
		    int i_78_ = i;
		    for (int i_79_ = -arg3; i_79_ < 0; i_79_++) {
			int i_80_ = (i_0_ >> 16) * anInt4729;
			for (int i_81_ = -arg2; i_81_ < 0; i_81_++) {
			    int i_82_ = aByteArray6450[(i >> 16) + i_80_];
			    if (i_82_ != 0) {
				int i_83_ = anIntArray6451[i_82_ & 0xff];
				int i_84_ = is[i_8_];
				int i_85_ = i_83_ + i_84_;
				int i_86_
				    = (i_83_ & 0xff00ff) + (i_84_ & 0xff00ff);
				i_84_ = (i_86_ & 0x1000100) + (i_85_ - i_86_
							       & 0x10000);
				is[i_8_++]
				    = i_85_ - i_84_ | i_84_ - (i_84_ >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_78_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_87_ = i;
		    int i_88_ = (arg5 & 0xff0000) >> 16;
		    int i_89_ = (arg5 & 0xff00) >> 8;
		    int i_90_ = arg5 & 0xff;
		    for (int i_91_ = -arg3; i_91_ < 0; i_91_++) {
			int i_92_ = (i_0_ >> 16) * anInt4729;
			for (int i_93_ = -arg2; i_93_ < 0; i_93_++) {
			    int i_94_ = aByteArray6450[(i >> 16) + i_92_];
			    if (i_94_ != 0) {
				int i_95_ = anIntArray6451[i_94_ & 0xff];
				int i_96_
				    = (i_95_ & 0xff0000) * i_88_ & ~0xffffff;
				int i_97_
				    = (i_95_ & 0xff00) * i_89_ & 0xff0000;
				int i_98_ = (i_95_ & 0xff) * i_90_ & 0xff00;
				i_95_ = (i_96_ | i_97_ | i_98_) >>> 8;
				int i_99_ = is[i_8_];
				int i_100_ = i_95_ + i_99_;
				int i_101_
				    = (i_95_ & 0xff00ff) + (i_99_ & 0xff00ff);
				i_99_ = (i_101_ & 0x1000100) + (i_100_ - i_101_
								& 0x10000);
				is[i_8_++]
				    = i_100_ - i_99_ | i_99_ - (i_99_ >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_87_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_102_ = arg5 >>> 24;
		    int i_103_ = 256 - i_102_;
		    int i_104_ = (arg5 & 0xff00ff) * i_103_ & ~0xff00ff;
		    int i_105_ = (arg5 & 0xff00) * i_103_ & 0xff0000;
		    arg5 = (i_104_ | i_105_) >>> 8;
		    int i_106_ = i;
		    for (int i_107_ = -arg3; i_107_ < 0; i_107_++) {
			int i_108_ = (i_0_ >> 16) * anInt4729;
			for (int i_109_ = -arg2; i_109_ < 0; i_109_++) {
			    int i_110_ = aByteArray6450[(i >> 16) + i_108_];
			    if (i_110_ != 0) {
				int i_111_ = anIntArray6451[i_110_ & 0xff];
				i_104_
				    = (i_111_ & 0xff00ff) * i_102_ & ~0xff00ff;
				i_105_ = (i_111_ & 0xff00) * i_102_ & 0xff0000;
				i_111_ = ((i_104_ | i_105_) >>> 8) + arg5;
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
			i = i_106_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    public void method2220(int arg0, int arg1) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	if (Class152_Sub1.anInt4718 == 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_115_ = Class152_Sub1.anInt4725;
		    int i_116_ = Class152_Sub1.anInt4723;
		    int i_117_ = Class152_Sub1.anInt4741;
		    int i_118_ = Class152_Sub1.anInt4739;
		    if (i_116_ >= 0 && i_117_ >= 0
			&& i_116_ - (anInt4729 << 12) < 0
			&& i_117_ - (anInt4735 << 12) < 0) {
			for (/**/; i_118_ < 0; i_118_++) {
			    int i_119_
				= (i_117_ >> 12) * anInt4729 + (i_116_ >> 12);
			    int i_120_ = i_115_++;
			    int[] is_121_ = is;
			    int i_122_ = arg0;
			    int i_123_ = arg1;
			    if (i_123_ == 0) {
				if (i_122_ == 0)
				    is_121_[i_120_]
					= (anIntArray6451
					   [aByteArray6450[i_119_] & 0xff]);
				else if (i_122_ == 1) {
				    int i_124_
					= (anIntArray6451
					   [aByteArray6450[i_119_] & 0xff]);
				    int i_125_ = (((i_124_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_126_ = (((i_124_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_127_ = (((i_124_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_121_[i_120_]
					= (i_125_ | i_126_ | i_127_) >>> 8;
				} else if (i_122_ == 2) {
				    int i_128_
					= (anIntArray6451
					   [aByteArray6450[i_119_] & 0xff]);
				    int i_129_ = (((i_128_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_130_ = (((i_128_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_121_[i_120_]
					= (((i_129_ | i_130_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_123_ == 1) {
				if (i_122_ == 0) {
				    int i_131_ = aByteArray6450[i_119_];
				    if (i_131_ != 0)
					is_121_[i_120_]
					    = anIntArray6451[i_131_ & 0xff];
				} else if (i_122_ == 1) {
				    int i_132_ = aByteArray6450[i_119_];
				    if (i_132_ != 0) {
					int i_133_
					    = anIntArray6451[i_132_ & 0xff];
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_134_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_135_ = 256 - i_134_;
					    int i_136_ = is_121_[i_120_];
					    is_121_[i_120_]
						= (((((i_133_ & 0xff00ff)
						      * i_134_)
						     + ((i_136_ & 0xff00ff)
							* i_135_))
						    & ~0xff00ff)
						   + ((((i_133_ & 0xff00)
							* i_134_)
						       + ((i_136_ & 0xff00)
							  * i_135_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_137_
						= (((i_133_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_138_
						= (((i_133_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_139_
						= (((i_133_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_133_ = (i_137_ | i_138_
						      | i_139_) >>> 8;
					    int i_140_ = is_121_[i_120_];
					    is_121_[i_120_]
						= (((((i_133_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_140_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_133_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_140_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_141_
						= (((i_133_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_142_
						= (((i_133_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_143_
						= (((i_133_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_121_[i_120_] = (i_141_ | i_142_
							       | i_143_) >>> 8;
					}
				    }
				} else if (i_122_ == 2) {
				    int i_144_ = aByteArray6450[i_119_];
				    if (i_144_ != 0) {
					int i_145_
					    = anIntArray6451[i_144_ & 0xff];
					int i_146_
					    = (((i_145_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_147_
					    = (((i_145_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_121_[i_120_++]
					    = (((i_146_ | i_147_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_123_ == 2) {
				if (i_122_ == 0) {
				    int i_148_ = aByteArray6450[i_119_];
				    if (i_148_ != 0) {
					int i_149_
					    = anIntArray6451[i_148_ & 0xff];
					int i_150_ = is_121_[i_120_];
					int i_151_ = i_149_ + i_150_;
					int i_152_ = ((i_149_ & 0xff00ff)
						      + (i_150_ & 0xff00ff));
					i_150_
					    = ((i_152_ & 0x1000100)
					       + (i_151_ - i_152_ & 0x10000));
					is_121_[i_120_]
					    = (i_151_ - i_150_
					       | i_150_ - (i_150_ >>> 8));
				    }
				} else if (i_122_ == 1) {
				    int i_153_ = aByteArray6450[i_119_];
				    if (i_153_ != 0) {
					int i_154_
					    = anIntArray6451[i_153_ & 0xff];
					int i_155_
					    = (((i_154_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_156_
					    = (((i_154_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_157_
					    = (((i_154_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_154_
					    = (i_155_ | i_156_ | i_157_) >>> 8;
					int i_158_ = is_121_[i_120_];
					int i_159_ = i_154_ + i_158_;
					int i_160_ = ((i_154_ & 0xff00ff)
						      + (i_158_ & 0xff00ff));
					i_158_
					    = ((i_160_ & 0x1000100)
					       + (i_159_ - i_160_ & 0x10000));
					is_121_[i_120_]
					    = (i_159_ - i_158_
					       | i_158_ - (i_158_ >>> 8));
				    }
				} else if (i_122_ == 2) {
				    int i_161_ = aByteArray6450[i_119_];
				    if (i_161_ != 0) {
					int i_162_
					    = anIntArray6451[i_161_ & 0xff];
					int i_163_
					    = (((i_162_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_164_
					    = (((i_162_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_162_ = (((i_163_ | i_164_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_165_ = is_121_[i_120_];
					int i_166_ = i_162_ + i_165_;
					int i_167_ = ((i_162_ & 0xff00ff)
						      + (i_165_ & 0xff00ff));
					i_165_
					    = ((i_167_ & 0x1000100)
					       + (i_166_ - i_167_ & 0x10000));
					is_121_[i_120_]
					    = (i_166_ - i_165_
					       | i_165_ - (i_165_ >>> 8));
				    }
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
		    int i_168_ = Class152_Sub1.anInt4725;
		    int i_169_ = Class152_Sub1.anInt4723;
		    int i_170_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_171_ = Class152_Sub1.anInt4739;
		    if (i_169_ >= 0 && i_169_ - (anInt4729 << 12) < 0) {
			int i_172_;
			if ((i_172_ = i_170_ - (anInt4735 << 12)) >= 0) {
			    i_172_ = ((Class152_Sub1.anInt4731 - i_172_)
				      / Class152_Sub1.anInt4731);
			    i_171_ += i_172_;
			    i_170_ += Class152_Sub1.anInt4731 * i_172_;
			    i_168_ += i_172_;
			}
			if ((i_172_ = ((i_170_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_171_)
			    i_171_ = i_172_;
			for (/**/; i_171_ < 0; i_171_++) {
			    int i_173_
				= (i_170_ >> 12) * anInt4729 + (i_169_ >> 12);
			    int i_174_ = i_168_++;
			    int[] is_175_ = is;
			    int i_176_ = arg0;
			    int i_177_ = arg1;
			    if (i_177_ == 0) {
				if (i_176_ == 0)
				    is_175_[i_174_]
					= (anIntArray6451
					   [aByteArray6450[i_173_] & 0xff]);
				else if (i_176_ == 1) {
				    int i_178_
					= (anIntArray6451
					   [aByteArray6450[i_173_] & 0xff]);
				    int i_179_ = (((i_178_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_180_ = (((i_178_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_181_ = (((i_178_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_175_[i_174_]
					= (i_179_ | i_180_ | i_181_) >>> 8;
				} else if (i_176_ == 2) {
				    int i_182_
					= (anIntArray6451
					   [aByteArray6450[i_173_] & 0xff]);
				    int i_183_ = (((i_182_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_184_ = (((i_182_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_175_[i_174_]
					= (((i_183_ | i_184_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_177_ == 1) {
				if (i_176_ == 0) {
				    int i_185_ = aByteArray6450[i_173_];
				    if (i_185_ != 0)
					is_175_[i_174_]
					    = anIntArray6451[i_185_ & 0xff];
				} else if (i_176_ == 1) {
				    int i_186_ = aByteArray6450[i_173_];
				    if (i_186_ != 0) {
					int i_187_
					    = anIntArray6451[i_186_ & 0xff];
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_188_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_189_ = 256 - i_188_;
					    int i_190_ = is_175_[i_174_];
					    is_175_[i_174_]
						= (((((i_187_ & 0xff00ff)
						      * i_188_)
						     + ((i_190_ & 0xff00ff)
							* i_189_))
						    & ~0xff00ff)
						   + ((((i_187_ & 0xff00)
							* i_188_)
						       + ((i_190_ & 0xff00)
							  * i_189_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_191_
						= (((i_187_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_192_
						= (((i_187_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_193_
						= (((i_187_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_187_ = (i_191_ | i_192_
						      | i_193_) >>> 8;
					    int i_194_ = is_175_[i_174_];
					    is_175_[i_174_]
						= (((((i_187_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_194_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_187_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_194_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_195_
						= (((i_187_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_196_
						= (((i_187_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_197_
						= (((i_187_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_175_[i_174_] = (i_195_ | i_196_
							       | i_197_) >>> 8;
					}
				    }
				} else if (i_176_ == 2) {
				    int i_198_ = aByteArray6450[i_173_];
				    if (i_198_ != 0) {
					int i_199_
					    = anIntArray6451[i_198_ & 0xff];
					int i_200_
					    = (((i_199_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_201_
					    = (((i_199_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_175_[i_174_++]
					    = (((i_200_ | i_201_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_177_ == 2) {
				if (i_176_ == 0) {
				    int i_202_ = aByteArray6450[i_173_];
				    if (i_202_ != 0) {
					int i_203_
					    = anIntArray6451[i_202_ & 0xff];
					int i_204_ = is_175_[i_174_];
					int i_205_ = i_203_ + i_204_;
					int i_206_ = ((i_203_ & 0xff00ff)
						      + (i_204_ & 0xff00ff));
					i_204_
					    = ((i_206_ & 0x1000100)
					       + (i_205_ - i_206_ & 0x10000));
					is_175_[i_174_]
					    = (i_205_ - i_204_
					       | i_204_ - (i_204_ >>> 8));
				    }
				} else if (i_176_ == 1) {
				    int i_207_ = aByteArray6450[i_173_];
				    if (i_207_ != 0) {
					int i_208_
					    = anIntArray6451[i_207_ & 0xff];
					int i_209_
					    = (((i_208_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_210_
					    = (((i_208_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_211_
					    = (((i_208_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_208_
					    = (i_209_ | i_210_ | i_211_) >>> 8;
					int i_212_ = is_175_[i_174_];
					int i_213_ = i_208_ + i_212_;
					int i_214_ = ((i_208_ & 0xff00ff)
						      + (i_212_ & 0xff00ff));
					i_212_
					    = ((i_214_ & 0x1000100)
					       + (i_213_ - i_214_ & 0x10000));
					is_175_[i_174_]
					    = (i_213_ - i_212_
					       | i_212_ - (i_212_ >>> 8));
				    }
				} else if (i_176_ == 2) {
				    int i_215_ = aByteArray6450[i_173_];
				    if (i_215_ != 0) {
					int i_216_
					    = anIntArray6451[i_215_ & 0xff];
					int i_217_
					    = (((i_216_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_218_
					    = (((i_216_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_216_ = (((i_217_ | i_218_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_219_ = is_175_[i_174_];
					int i_220_ = i_216_ + i_219_;
					int i_221_ = ((i_216_ & 0xff00ff)
						      + (i_219_ & 0xff00ff));
					i_219_
					    = ((i_221_ & 0x1000100)
					       + (i_220_ - i_221_ & 0x10000));
					is_175_[i_174_]
					    = (i_220_ - i_219_
					       | i_219_ - (i_219_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_170_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_222_ = Class152_Sub1.anInt4725;
		    int i_223_ = Class152_Sub1.anInt4723;
		    int i_224_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_225_ = Class152_Sub1.anInt4739;
		    if (i_223_ >= 0 && i_223_ - (anInt4729 << 12) < 0) {
			if (i_224_ < 0) {
			    int i_226_
				= ((Class152_Sub1.anInt4731 - 1 - i_224_)
				   / Class152_Sub1.anInt4731);
			    i_225_ += i_226_;
			    i_224_ += Class152_Sub1.anInt4731 * i_226_;
			    i_222_ += i_226_;
			}
			int i_227_;
			if ((i_227_ = ((1 + i_224_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_225_)
			    i_225_ = i_227_;
			for (/**/; i_225_ < 0; i_225_++) {
			    int i_228_
				= (i_224_ >> 12) * anInt4729 + (i_223_ >> 12);
			    int i_229_ = i_222_++;
			    int[] is_230_ = is;
			    int i_231_ = arg0;
			    int i_232_ = arg1;
			    if (i_232_ == 0) {
				if (i_231_ == 0)
				    is_230_[i_229_]
					= (anIntArray6451
					   [aByteArray6450[i_228_] & 0xff]);
				else if (i_231_ == 1) {
				    int i_233_
					= (anIntArray6451
					   [aByteArray6450[i_228_] & 0xff]);
				    int i_234_ = (((i_233_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_235_ = (((i_233_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_236_ = (((i_233_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_230_[i_229_]
					= (i_234_ | i_235_ | i_236_) >>> 8;
				} else if (i_231_ == 2) {
				    int i_237_
					= (anIntArray6451
					   [aByteArray6450[i_228_] & 0xff]);
				    int i_238_ = (((i_237_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_239_ = (((i_237_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_230_[i_229_]
					= (((i_238_ | i_239_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_232_ == 1) {
				if (i_231_ == 0) {
				    int i_240_ = aByteArray6450[i_228_];
				    if (i_240_ != 0)
					is_230_[i_229_]
					    = anIntArray6451[i_240_ & 0xff];
				} else if (i_231_ == 1) {
				    int i_241_ = aByteArray6450[i_228_];
				    if (i_241_ != 0) {
					int i_242_
					    = anIntArray6451[i_241_ & 0xff];
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_243_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_244_ = 256 - i_243_;
					    int i_245_ = is_230_[i_229_];
					    is_230_[i_229_]
						= (((((i_242_ & 0xff00ff)
						      * i_243_)
						     + ((i_245_ & 0xff00ff)
							* i_244_))
						    & ~0xff00ff)
						   + ((((i_242_ & 0xff00)
							* i_243_)
						       + ((i_245_ & 0xff00)
							  * i_244_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_246_
						= (((i_242_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_247_
						= (((i_242_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_248_
						= (((i_242_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_242_ = (i_246_ | i_247_
						      | i_248_) >>> 8;
					    int i_249_ = is_230_[i_229_];
					    is_230_[i_229_]
						= (((((i_242_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_249_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_242_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_249_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_250_
						= (((i_242_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_251_
						= (((i_242_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_252_
						= (((i_242_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_230_[i_229_] = (i_250_ | i_251_
							       | i_252_) >>> 8;
					}
				    }
				} else if (i_231_ == 2) {
				    int i_253_ = aByteArray6450[i_228_];
				    if (i_253_ != 0) {
					int i_254_
					    = anIntArray6451[i_253_ & 0xff];
					int i_255_
					    = (((i_254_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_256_
					    = (((i_254_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_230_[i_229_++]
					    = (((i_255_ | i_256_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_232_ == 2) {
				if (i_231_ == 0) {
				    int i_257_ = aByteArray6450[i_228_];
				    if (i_257_ != 0) {
					int i_258_
					    = anIntArray6451[i_257_ & 0xff];
					int i_259_ = is_230_[i_229_];
					int i_260_ = i_258_ + i_259_;
					int i_261_ = ((i_258_ & 0xff00ff)
						      + (i_259_ & 0xff00ff));
					i_259_
					    = ((i_261_ & 0x1000100)
					       + (i_260_ - i_261_ & 0x10000));
					is_230_[i_229_]
					    = (i_260_ - i_259_
					       | i_259_ - (i_259_ >>> 8));
				    }
				} else if (i_231_ == 1) {
				    int i_262_ = aByteArray6450[i_228_];
				    if (i_262_ != 0) {
					int i_263_
					    = anIntArray6451[i_262_ & 0xff];
					int i_264_
					    = (((i_263_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_265_
					    = (((i_263_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_266_
					    = (((i_263_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_263_
					    = (i_264_ | i_265_ | i_266_) >>> 8;
					int i_267_ = is_230_[i_229_];
					int i_268_ = i_263_ + i_267_;
					int i_269_ = ((i_263_ & 0xff00ff)
						      + (i_267_ & 0xff00ff));
					i_267_
					    = ((i_269_ & 0x1000100)
					       + (i_268_ - i_269_ & 0x10000));
					is_230_[i_229_]
					    = (i_268_ - i_267_
					       | i_267_ - (i_267_ >>> 8));
				    }
				} else if (i_231_ == 2) {
				    int i_270_ = aByteArray6450[i_228_];
				    if (i_270_ != 0) {
					int i_271_
					    = anIntArray6451[i_270_ & 0xff];
					int i_272_
					    = (((i_271_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_273_
					    = (((i_271_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_271_ = (((i_272_ | i_273_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_274_ = is_230_[i_229_];
					int i_275_ = i_271_ + i_274_;
					int i_276_ = ((i_271_ & 0xff00ff)
						      + (i_274_ & 0xff00ff));
					i_274_
					    = ((i_276_ & 0x1000100)
					       + (i_275_ - i_276_ & 0x10000));
					is_230_[i_229_]
					    = (i_275_ - i_274_
					       | i_274_ - (i_274_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_224_ += Class152_Sub1.anInt4731;
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
		    int i_277_ = Class152_Sub1.anInt4725;
		    int i_278_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_279_ = Class152_Sub1.anInt4741;
		    int i_280_ = Class152_Sub1.anInt4739;
		    if (i_279_ >= 0 && i_279_ - (anInt4735 << 12) < 0) {
			int i_281_;
			if ((i_281_ = i_278_ - (anInt4729 << 12)) >= 0) {
			    i_281_ = ((Class152_Sub1.anInt4718 - i_281_)
				      / Class152_Sub1.anInt4718);
			    i_280_ += i_281_;
			    i_278_ += Class152_Sub1.anInt4718 * i_281_;
			    i_277_ += i_281_;
			}
			if ((i_281_ = ((i_278_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_280_)
			    i_280_ = i_281_;
			for (/**/; i_280_ < 0; i_280_++) {
			    int i_282_
				= (i_279_ >> 12) * anInt4729 + (i_278_ >> 12);
			    int i_283_ = i_277_++;
			    int[] is_284_ = is;
			    int i_285_ = arg0;
			    int i_286_ = arg1;
			    if (i_286_ == 0) {
				if (i_285_ == 0)
				    is_284_[i_283_]
					= (anIntArray6451
					   [aByteArray6450[i_282_] & 0xff]);
				else if (i_285_ == 1) {
				    int i_287_
					= (anIntArray6451
					   [aByteArray6450[i_282_] & 0xff]);
				    int i_288_ = (((i_287_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_289_ = (((i_287_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_290_ = (((i_287_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_284_[i_283_]
					= (i_288_ | i_289_ | i_290_) >>> 8;
				} else if (i_285_ == 2) {
				    int i_291_
					= (anIntArray6451
					   [aByteArray6450[i_282_] & 0xff]);
				    int i_292_ = (((i_291_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_293_ = (((i_291_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_284_[i_283_]
					= (((i_292_ | i_293_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_286_ == 1) {
				if (i_285_ == 0) {
				    int i_294_ = aByteArray6450[i_282_];
				    if (i_294_ != 0)
					is_284_[i_283_]
					    = anIntArray6451[i_294_ & 0xff];
				} else if (i_285_ == 1) {
				    int i_295_ = aByteArray6450[i_282_];
				    if (i_295_ != 0) {
					int i_296_
					    = anIntArray6451[i_295_ & 0xff];
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_297_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_298_ = 256 - i_297_;
					    int i_299_ = is_284_[i_283_];
					    is_284_[i_283_]
						= (((((i_296_ & 0xff00ff)
						      * i_297_)
						     + ((i_299_ & 0xff00ff)
							* i_298_))
						    & ~0xff00ff)
						   + ((((i_296_ & 0xff00)
							* i_297_)
						       + ((i_299_ & 0xff00)
							  * i_298_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_300_
						= (((i_296_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_301_
						= (((i_296_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_302_
						= (((i_296_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_296_ = (i_300_ | i_301_
						      | i_302_) >>> 8;
					    int i_303_ = is_284_[i_283_];
					    is_284_[i_283_]
						= (((((i_296_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_303_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_296_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_303_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_304_
						= (((i_296_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_305_
						= (((i_296_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_306_
						= (((i_296_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_284_[i_283_] = (i_304_ | i_305_
							       | i_306_) >>> 8;
					}
				    }
				} else if (i_285_ == 2) {
				    int i_307_ = aByteArray6450[i_282_];
				    if (i_307_ != 0) {
					int i_308_
					    = anIntArray6451[i_307_ & 0xff];
					int i_309_
					    = (((i_308_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_310_
					    = (((i_308_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_284_[i_283_++]
					    = (((i_309_ | i_310_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_286_ == 2) {
				if (i_285_ == 0) {
				    int i_311_ = aByteArray6450[i_282_];
				    if (i_311_ != 0) {
					int i_312_
					    = anIntArray6451[i_311_ & 0xff];
					int i_313_ = is_284_[i_283_];
					int i_314_ = i_312_ + i_313_;
					int i_315_ = ((i_312_ & 0xff00ff)
						      + (i_313_ & 0xff00ff));
					i_313_
					    = ((i_315_ & 0x1000100)
					       + (i_314_ - i_315_ & 0x10000));
					is_284_[i_283_]
					    = (i_314_ - i_313_
					       | i_313_ - (i_313_ >>> 8));
				    }
				} else if (i_285_ == 1) {
				    int i_316_ = aByteArray6450[i_282_];
				    if (i_316_ != 0) {
					int i_317_
					    = anIntArray6451[i_316_ & 0xff];
					int i_318_
					    = (((i_317_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_319_
					    = (((i_317_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_320_
					    = (((i_317_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_317_
					    = (i_318_ | i_319_ | i_320_) >>> 8;
					int i_321_ = is_284_[i_283_];
					int i_322_ = i_317_ + i_321_;
					int i_323_ = ((i_317_ & 0xff00ff)
						      + (i_321_ & 0xff00ff));
					i_321_
					    = ((i_323_ & 0x1000100)
					       + (i_322_ - i_323_ & 0x10000));
					is_284_[i_283_]
					    = (i_322_ - i_321_
					       | i_321_ - (i_321_ >>> 8));
				    }
				} else if (i_285_ == 2) {
				    int i_324_ = aByteArray6450[i_282_];
				    if (i_324_ != 0) {
					int i_325_
					    = anIntArray6451[i_324_ & 0xff];
					int i_326_
					    = (((i_325_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_327_
					    = (((i_325_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_325_ = (((i_326_ | i_327_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_328_ = is_284_[i_283_];
					int i_329_ = i_325_ + i_328_;
					int i_330_ = ((i_325_ & 0xff00ff)
						      + (i_328_ & 0xff00ff));
					i_328_
					    = ((i_330_ & 0x1000100)
					       + (i_329_ - i_330_ & 0x10000));
					is_284_[i_283_]
					    = (i_329_ - i_328_
					       | i_328_ - (i_328_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_278_ += Class152_Sub1.anInt4718;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_331_ = Class152_Sub1.anInt4725;
		    int i_332_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_333_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_334_ = Class152_Sub1.anInt4739;
		    int i_335_;
		    if ((i_335_ = i_332_ - (anInt4729 << 12)) >= 0) {
			i_335_ = ((Class152_Sub1.anInt4718 - i_335_)
				  / Class152_Sub1.anInt4718);
			i_334_ += i_335_;
			i_332_ += Class152_Sub1.anInt4718 * i_335_;
			i_333_ += Class152_Sub1.anInt4731 * i_335_;
			i_331_ += i_335_;
		    }
		    if ((i_335_ = ((i_332_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_334_)
			i_334_ = i_335_;
		    if ((i_335_ = i_333_ - (anInt4735 << 12)) >= 0) {
			i_335_ = ((Class152_Sub1.anInt4731 - i_335_)
				  / Class152_Sub1.anInt4731);
			i_334_ += i_335_;
			i_332_ += Class152_Sub1.anInt4718 * i_335_;
			i_333_ += Class152_Sub1.anInt4731 * i_335_;
			i_331_ += i_335_;
		    }
		    if ((i_335_ = ((i_333_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_334_)
			i_334_ = i_335_;
		    for (/**/; i_334_ < 0; i_334_++) {
			int i_336_
			    = (i_333_ >> 12) * anInt4729 + (i_332_ >> 12);
			int i_337_ = i_331_++;
			int[] is_338_ = is;
			int i_339_ = arg0;
			int i_340_ = arg1;
			if (i_340_ == 0) {
			    if (i_339_ == 0)
				is_338_[i_337_]
				    = (anIntArray6451
				       [aByteArray6450[i_336_] & 0xff]);
			    else if (i_339_ == 1) {
				int i_341_ = (anIntArray6451
					      [aByteArray6450[i_336_] & 0xff]);
				int i_342_ = (((i_341_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_343_ = (((i_341_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_344_ = (((i_341_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_338_[i_337_]
				    = (i_342_ | i_343_ | i_344_) >>> 8;
			    } else if (i_339_ == 2) {
				int i_345_ = (anIntArray6451
					      [aByteArray6450[i_336_] & 0xff]);
				int i_346_ = (((i_345_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_347_ = (((i_345_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_338_[i_337_] = (((i_346_ | i_347_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_340_ == 1) {
			    if (i_339_ == 0) {
				int i_348_ = aByteArray6450[i_336_];
				if (i_348_ != 0)
				    is_338_[i_337_]
					= anIntArray6451[i_348_ & 0xff];
			    } else if (i_339_ == 1) {
				int i_349_ = aByteArray6450[i_336_];
				if (i_349_ != 0) {
				    int i_350_ = anIntArray6451[i_349_ & 0xff];
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_351_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_352_ = 256 - i_351_;
					int i_353_ = is_338_[i_337_];
					is_338_[i_337_]
					    = ((((i_350_ & 0xff00ff) * i_351_
						 + ((i_353_ & 0xff00ff)
						    * i_352_))
						& ~0xff00ff)
					       + (((i_350_ & 0xff00) * i_351_
						   + ((i_353_ & 0xff00)
						      * i_352_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_354_
					    = (((i_350_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_355_
					    = (((i_350_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_356_
					    = (((i_350_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_350_
					    = (i_354_ | i_355_ | i_356_) >>> 8;
					int i_357_ = is_338_[i_337_];
					is_338_[i_337_]
					    = (((((i_350_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_357_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_350_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_357_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_358_
					    = (((i_350_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_359_
					    = (((i_350_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_360_
					    = (((i_350_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_338_[i_337_]
					    = (i_358_ | i_359_ | i_360_) >>> 8;
				    }
				}
			    } else if (i_339_ == 2) {
				int i_361_ = aByteArray6450[i_336_];
				if (i_361_ != 0) {
				    int i_362_ = anIntArray6451[i_361_ & 0xff];
				    int i_363_ = (((i_362_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_364_ = (((i_362_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_338_[i_337_++]
					= (((i_363_ | i_364_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_340_ == 2) {
			    if (i_339_ == 0) {
				int i_365_ = aByteArray6450[i_336_];
				if (i_365_ != 0) {
				    int i_366_ = anIntArray6451[i_365_ & 0xff];
				    int i_367_ = is_338_[i_337_];
				    int i_368_ = i_366_ + i_367_;
				    int i_369_ = ((i_366_ & 0xff00ff)
						  + (i_367_ & 0xff00ff));
				    i_367_ = ((i_369_ & 0x1000100)
					      + (i_368_ - i_369_ & 0x10000));
				    is_338_[i_337_]
					= i_368_ - i_367_ | i_367_ - (i_367_
								      >>> 8);
				}
			    } else if (i_339_ == 1) {
				int i_370_ = aByteArray6450[i_336_];
				if (i_370_ != 0) {
				    int i_371_ = anIntArray6451[i_370_ & 0xff];
				    int i_372_ = (((i_371_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_373_ = (((i_371_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_374_ = (((i_371_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_371_ = (i_372_ | i_373_ | i_374_) >>> 8;
				    int i_375_ = is_338_[i_337_];
				    int i_376_ = i_371_ + i_375_;
				    int i_377_ = ((i_371_ & 0xff00ff)
						  + (i_375_ & 0xff00ff));
				    i_375_ = ((i_377_ & 0x1000100)
					      + (i_376_ - i_377_ & 0x10000));
				    is_338_[i_337_]
					= i_376_ - i_375_ | i_375_ - (i_375_
								      >>> 8);
				}
			    } else if (i_339_ == 2) {
				int i_378_ = aByteArray6450[i_336_];
				if (i_378_ != 0) {
				    int i_379_ = anIntArray6451[i_378_ & 0xff];
				    int i_380_ = (((i_379_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_381_ = (((i_379_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_379_ = (((i_380_ | i_381_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_382_ = is_338_[i_337_];
				    int i_383_ = i_379_ + i_382_;
				    int i_384_ = ((i_379_ & 0xff00ff)
						  + (i_382_ & 0xff00ff));
				    i_382_ = ((i_384_ & 0x1000100)
					      + (i_383_ - i_384_ & 0x10000));
				    is_338_[i_337_]
					= i_383_ - i_382_ | i_382_ - (i_382_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_332_ += Class152_Sub1.anInt4718;
			i_333_ += Class152_Sub1.anInt4731;
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_385_ = Class152_Sub1.anInt4725;
		    int i_386_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_387_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_388_ = Class152_Sub1.anInt4739;
		    int i_389_;
		    if ((i_389_ = i_386_ - (anInt4729 << 12)) >= 0) {
			i_389_ = ((Class152_Sub1.anInt4718 - i_389_)
				  / Class152_Sub1.anInt4718);
			i_388_ += i_389_;
			i_386_ += Class152_Sub1.anInt4718 * i_389_;
			i_387_ += Class152_Sub1.anInt4731 * i_389_;
			i_385_ += i_389_;
		    }
		    if ((i_389_ = ((i_386_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_388_)
			i_388_ = i_389_;
		    if (i_387_ < 0) {
			i_389_ = ((Class152_Sub1.anInt4731 - 1 - i_387_)
				  / Class152_Sub1.anInt4731);
			i_388_ += i_389_;
			i_386_ += Class152_Sub1.anInt4718 * i_389_;
			i_387_ += Class152_Sub1.anInt4731 * i_389_;
			i_385_ += i_389_;
		    }
		    if ((i_389_ = ((1 + i_387_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_388_)
			i_388_ = i_389_;
		    for (/**/; i_388_ < 0; i_388_++) {
			int i_390_
			    = (i_387_ >> 12) * anInt4729 + (i_386_ >> 12);
			int i_391_ = i_385_++;
			int[] is_392_ = is;
			int i_393_ = arg0;
			int i_394_ = arg1;
			if (i_394_ == 0) {
			    if (i_393_ == 0)
				is_392_[i_391_]
				    = (anIntArray6451
				       [aByteArray6450[i_390_] & 0xff]);
			    else if (i_393_ == 1) {
				int i_395_ = (anIntArray6451
					      [aByteArray6450[i_390_] & 0xff]);
				int i_396_ = (((i_395_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_397_ = (((i_395_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_398_ = (((i_395_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_392_[i_391_]
				    = (i_396_ | i_397_ | i_398_) >>> 8;
			    } else if (i_393_ == 2) {
				int i_399_ = (anIntArray6451
					      [aByteArray6450[i_390_] & 0xff]);
				int i_400_ = (((i_399_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_401_ = (((i_399_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_392_[i_391_] = (((i_400_ | i_401_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_394_ == 1) {
			    if (i_393_ == 0) {
				int i_402_ = aByteArray6450[i_390_];
				if (i_402_ != 0)
				    is_392_[i_391_]
					= anIntArray6451[i_402_ & 0xff];
			    } else if (i_393_ == 1) {
				int i_403_ = aByteArray6450[i_390_];
				if (i_403_ != 0) {
				    int i_404_ = anIntArray6451[i_403_ & 0xff];
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_405_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_406_ = 256 - i_405_;
					int i_407_ = is_392_[i_391_];
					is_392_[i_391_]
					    = ((((i_404_ & 0xff00ff) * i_405_
						 + ((i_407_ & 0xff00ff)
						    * i_406_))
						& ~0xff00ff)
					       + (((i_404_ & 0xff00) * i_405_
						   + ((i_407_ & 0xff00)
						      * i_406_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_408_
					    = (((i_404_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_409_
					    = (((i_404_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_410_
					    = (((i_404_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_404_
					    = (i_408_ | i_409_ | i_410_) >>> 8;
					int i_411_ = is_392_[i_391_];
					is_392_[i_391_]
					    = (((((i_404_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_411_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_404_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_411_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_412_
					    = (((i_404_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_413_
					    = (((i_404_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_414_
					    = (((i_404_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_392_[i_391_]
					    = (i_412_ | i_413_ | i_414_) >>> 8;
				    }
				}
			    } else if (i_393_ == 2) {
				int i_415_ = aByteArray6450[i_390_];
				if (i_415_ != 0) {
				    int i_416_ = anIntArray6451[i_415_ & 0xff];
				    int i_417_ = (((i_416_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_418_ = (((i_416_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_392_[i_391_++]
					= (((i_417_ | i_418_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_394_ == 2) {
			    if (i_393_ == 0) {
				int i_419_ = aByteArray6450[i_390_];
				if (i_419_ != 0) {
				    int i_420_ = anIntArray6451[i_419_ & 0xff];
				    int i_421_ = is_392_[i_391_];
				    int i_422_ = i_420_ + i_421_;
				    int i_423_ = ((i_420_ & 0xff00ff)
						  + (i_421_ & 0xff00ff));
				    i_421_ = ((i_423_ & 0x1000100)
					      + (i_422_ - i_423_ & 0x10000));
				    is_392_[i_391_]
					= i_422_ - i_421_ | i_421_ - (i_421_
								      >>> 8);
				}
			    } else if (i_393_ == 1) {
				int i_424_ = aByteArray6450[i_390_];
				if (i_424_ != 0) {
				    int i_425_ = anIntArray6451[i_424_ & 0xff];
				    int i_426_ = (((i_425_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_427_ = (((i_425_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_428_ = (((i_425_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_425_ = (i_426_ | i_427_ | i_428_) >>> 8;
				    int i_429_ = is_392_[i_391_];
				    int i_430_ = i_425_ + i_429_;
				    int i_431_ = ((i_425_ & 0xff00ff)
						  + (i_429_ & 0xff00ff));
				    i_429_ = ((i_431_ & 0x1000100)
					      + (i_430_ - i_431_ & 0x10000));
				    is_392_[i_391_]
					= i_430_ - i_429_ | i_429_ - (i_429_
								      >>> 8);
				}
			    } else if (i_393_ == 2) {
				int i_432_ = aByteArray6450[i_390_];
				if (i_432_ != 0) {
				    int i_433_ = anIntArray6451[i_432_ & 0xff];
				    int i_434_ = (((i_433_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_435_ = (((i_433_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_433_ = (((i_434_ | i_435_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_436_ = is_392_[i_391_];
				    int i_437_ = i_433_ + i_436_;
				    int i_438_ = ((i_433_ & 0xff00ff)
						  + (i_436_ & 0xff00ff));
				    i_436_ = ((i_438_ & 0x1000100)
					      + (i_437_ - i_438_ & 0x10000));
				    is_392_[i_391_]
					= i_437_ - i_436_ | i_436_ - (i_436_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_386_ += Class152_Sub1.anInt4718;
			i_387_ += Class152_Sub1.anInt4731;
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
		int i_439_ = Class152_Sub1.anInt4725;
		int i_440_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_441_ = Class152_Sub1.anInt4741;
		int i_442_ = Class152_Sub1.anInt4739;
		if (i_441_ >= 0 && i_441_ - (anInt4735 << 12) < 0) {
		    if (i_440_ < 0) {
			int i_443_ = ((Class152_Sub1.anInt4718 - 1 - i_440_)
				      / Class152_Sub1.anInt4718);
			i_442_ += i_443_;
			i_440_ += Class152_Sub1.anInt4718 * i_443_;
			i_439_ += i_443_;
		    }
		    int i_444_;
		    if ((i_444_ = ((1 + i_440_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_442_)
			i_442_ = i_444_;
		    for (/**/; i_442_ < 0; i_442_++) {
			int i_445_
			    = (i_441_ >> 12) * anInt4729 + (i_440_ >> 12);
			int i_446_ = i_439_++;
			int[] is_447_ = is;
			int i_448_ = arg0;
			int i_449_ = arg1;
			if (i_449_ == 0) {
			    if (i_448_ == 0)
				is_447_[i_446_]
				    = (anIntArray6451
				       [aByteArray6450[i_445_] & 0xff]);
			    else if (i_448_ == 1) {
				int i_450_ = (anIntArray6451
					      [aByteArray6450[i_445_] & 0xff]);
				int i_451_ = (((i_450_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_452_ = (((i_450_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_453_ = (((i_450_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_447_[i_446_]
				    = (i_451_ | i_452_ | i_453_) >>> 8;
			    } else if (i_448_ == 2) {
				int i_454_ = (anIntArray6451
					      [aByteArray6450[i_445_] & 0xff]);
				int i_455_ = (((i_454_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_456_ = (((i_454_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_447_[i_446_] = (((i_455_ | i_456_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_449_ == 1) {
			    if (i_448_ == 0) {
				int i_457_ = aByteArray6450[i_445_];
				if (i_457_ != 0)
				    is_447_[i_446_]
					= anIntArray6451[i_457_ & 0xff];
			    } else if (i_448_ == 1) {
				int i_458_ = aByteArray6450[i_445_];
				if (i_458_ != 0) {
				    int i_459_ = anIntArray6451[i_458_ & 0xff];
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_460_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_461_ = 256 - i_460_;
					int i_462_ = is_447_[i_446_];
					is_447_[i_446_]
					    = ((((i_459_ & 0xff00ff) * i_460_
						 + ((i_462_ & 0xff00ff)
						    * i_461_))
						& ~0xff00ff)
					       + (((i_459_ & 0xff00) * i_460_
						   + ((i_462_ & 0xff00)
						      * i_461_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_463_
					    = (((i_459_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_464_
					    = (((i_459_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_465_
					    = (((i_459_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_459_
					    = (i_463_ | i_464_ | i_465_) >>> 8;
					int i_466_ = is_447_[i_446_];
					is_447_[i_446_]
					    = (((((i_459_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_466_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_459_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_466_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_467_
					    = (((i_459_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_468_
					    = (((i_459_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_469_
					    = (((i_459_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_447_[i_446_]
					    = (i_467_ | i_468_ | i_469_) >>> 8;
				    }
				}
			    } else if (i_448_ == 2) {
				int i_470_ = aByteArray6450[i_445_];
				if (i_470_ != 0) {
				    int i_471_ = anIntArray6451[i_470_ & 0xff];
				    int i_472_ = (((i_471_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_473_ = (((i_471_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_447_[i_446_++]
					= (((i_472_ | i_473_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_449_ == 2) {
			    if (i_448_ == 0) {
				int i_474_ = aByteArray6450[i_445_];
				if (i_474_ != 0) {
				    int i_475_ = anIntArray6451[i_474_ & 0xff];
				    int i_476_ = is_447_[i_446_];
				    int i_477_ = i_475_ + i_476_;
				    int i_478_ = ((i_475_ & 0xff00ff)
						  + (i_476_ & 0xff00ff));
				    i_476_ = ((i_478_ & 0x1000100)
					      + (i_477_ - i_478_ & 0x10000));
				    is_447_[i_446_]
					= i_477_ - i_476_ | i_476_ - (i_476_
								      >>> 8);
				}
			    } else if (i_448_ == 1) {
				int i_479_ = aByteArray6450[i_445_];
				if (i_479_ != 0) {
				    int i_480_ = anIntArray6451[i_479_ & 0xff];
				    int i_481_ = (((i_480_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_482_ = (((i_480_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_483_ = (((i_480_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_480_ = (i_481_ | i_482_ | i_483_) >>> 8;
				    int i_484_ = is_447_[i_446_];
				    int i_485_ = i_480_ + i_484_;
				    int i_486_ = ((i_480_ & 0xff00ff)
						  + (i_484_ & 0xff00ff));
				    i_484_ = ((i_486_ & 0x1000100)
					      + (i_485_ - i_486_ & 0x10000));
				    is_447_[i_446_]
					= i_485_ - i_484_ | i_484_ - (i_484_
								      >>> 8);
				}
			    } else if (i_448_ == 2) {
				int i_487_ = aByteArray6450[i_445_];
				if (i_487_ != 0) {
				    int i_488_ = anIntArray6451[i_487_ & 0xff];
				    int i_489_ = (((i_488_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_490_ = (((i_488_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_488_ = (((i_489_ | i_490_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_491_ = is_447_[i_446_];
				    int i_492_ = i_488_ + i_491_;
				    int i_493_ = ((i_488_ & 0xff00ff)
						  + (i_491_ & 0xff00ff));
				    i_491_ = ((i_493_ & 0x1000100)
					      + (i_492_ - i_493_ & 0x10000));
				    is_447_[i_446_]
					= i_492_ - i_491_ | i_491_ - (i_491_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_440_ += Class152_Sub1.anInt4718;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else if (Class152_Sub1.anInt4731 < 0) {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_494_ = Class152_Sub1.anInt4725;
		int i_495_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_496_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_497_ = Class152_Sub1.anInt4739;
		if (i_495_ < 0) {
		    int i_498_ = ((Class152_Sub1.anInt4718 - 1 - i_495_)
				  / Class152_Sub1.anInt4718);
		    i_497_ += i_498_;
		    i_495_ += Class152_Sub1.anInt4718 * i_498_;
		    i_496_ += Class152_Sub1.anInt4731 * i_498_;
		    i_494_ += i_498_;
		}
		int i_499_;
		if ((i_499_
		     = (1 + i_495_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_497_)
		    i_497_ = i_499_;
		if ((i_499_ = i_496_ - (anInt4735 << 12)) >= 0) {
		    i_499_ = ((Class152_Sub1.anInt4731 - i_499_)
			      / Class152_Sub1.anInt4731);
		    i_497_ += i_499_;
		    i_495_ += Class152_Sub1.anInt4718 * i_499_;
		    i_496_ += Class152_Sub1.anInt4731 * i_499_;
		    i_494_ += i_499_;
		}
		if ((i_499_ = ((i_496_ - Class152_Sub1.anInt4731)
			       / Class152_Sub1.anInt4731))
		    > i_497_)
		    i_497_ = i_499_;
		for (/**/; i_497_ < 0; i_497_++) {
		    int i_500_ = (i_496_ >> 12) * anInt4729 + (i_495_ >> 12);
		    int i_501_ = i_494_++;
		    int[] is_502_ = is;
		    int i_503_ = arg0;
		    int i_504_ = arg1;
		    if (i_504_ == 0) {
			if (i_503_ == 0)
			    is_502_[i_501_]
				= (anIntArray6451
				   [aByteArray6450[i_500_] & 0xff]);
			else if (i_503_ == 1) {
			    int i_505_ = (anIntArray6451
					  [aByteArray6450[i_500_] & 0xff]);
			    int i_506_ = (((i_505_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_507_
				= ((i_505_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_508_
				= ((i_505_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_502_[i_501_] = (i_506_ | i_507_ | i_508_) >>> 8;
			} else if (i_503_ == 2) {
			    int i_509_ = (anIntArray6451
					  [aByteArray6450[i_500_] & 0xff]);
			    int i_510_ = (((i_509_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_511_
				= ((i_509_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_502_[i_501_] = (((i_510_ | i_511_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_504_ == 1) {
			if (i_503_ == 0) {
			    int i_512_ = aByteArray6450[i_500_];
			    if (i_512_ != 0)
				is_502_[i_501_]
				    = anIntArray6451[i_512_ & 0xff];
			} else if (i_503_ == 1) {
			    int i_513_ = aByteArray6450[i_500_];
			    if (i_513_ != 0) {
				int i_514_ = anIntArray6451[i_513_ & 0xff];
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_515_
					= Class152_Sub1.anInt4726 >>> 24;
				    int i_516_ = 256 - i_515_;
				    int i_517_ = is_502_[i_501_];
				    is_502_[i_501_]
					= ((((i_514_ & 0xff00ff) * i_515_
					     + (i_517_ & 0xff00ff) * i_516_)
					    & ~0xff00ff)
					   + (((i_514_ & 0xff00) * i_515_
					       + (i_517_ & 0xff00) * i_516_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_518_ = (((i_514_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_519_ = (((i_514_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_520_ = (((i_514_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_514_ = (i_518_ | i_519_ | i_520_) >>> 8;
				    int i_521_ = is_502_[i_501_];
				    is_502_[i_501_]
					= (((((i_514_ & 0xff00ff)
					      * Class152_Sub1.anInt4711)
					     + ((i_521_ & 0xff00ff)
						* Class152_Sub1.anInt4727))
					    & ~0xff00ff)
					   + ((((i_514_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       + ((i_521_ & 0xff00)
						  * Class152_Sub1.anInt4727))
					      & 0xff0000)) >> 8;
				} else {
				    int i_522_ = (((i_514_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_523_ = (((i_514_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_524_ = (((i_514_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_502_[i_501_]
					= (i_522_ | i_523_ | i_524_) >>> 8;
				}
			    }
			} else if (i_503_ == 2) {
			    int i_525_ = aByteArray6450[i_500_];
			    if (i_525_ != 0) {
				int i_526_ = anIntArray6451[i_525_ & 0xff];
				int i_527_ = (((i_526_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_528_ = (((i_526_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_502_[i_501_++]
				    = (((i_527_ | i_528_) >>> 8)
				       + Class152_Sub1.anInt4722);
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_504_ == 2) {
			if (i_503_ == 0) {
			    int i_529_ = aByteArray6450[i_500_];
			    if (i_529_ != 0) {
				int i_530_ = anIntArray6451[i_529_ & 0xff];
				int i_531_ = is_502_[i_501_];
				int i_532_ = i_530_ + i_531_;
				int i_533_ = ((i_530_ & 0xff00ff)
					      + (i_531_ & 0xff00ff));
				i_531_
				    = (i_533_ & 0x1000100) + (i_532_ - i_533_
							      & 0x10000);
				is_502_[i_501_]
				    = i_532_ - i_531_ | i_531_ - (i_531_
								  >>> 8);
			    }
			} else if (i_503_ == 1) {
			    int i_534_ = aByteArray6450[i_500_];
			    if (i_534_ != 0) {
				int i_535_ = anIntArray6451[i_534_ & 0xff];
				int i_536_ = (((i_535_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_537_ = (((i_535_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_538_ = (((i_535_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_535_ = (i_536_ | i_537_ | i_538_) >>> 8;
				int i_539_ = is_502_[i_501_];
				int i_540_ = i_535_ + i_539_;
				int i_541_ = ((i_535_ & 0xff00ff)
					      + (i_539_ & 0xff00ff));
				i_539_
				    = (i_541_ & 0x1000100) + (i_540_ - i_541_
							      & 0x10000);
				is_502_[i_501_]
				    = i_540_ - i_539_ | i_539_ - (i_539_
								  >>> 8);
			    }
			} else if (i_503_ == 2) {
			    int i_542_ = aByteArray6450[i_500_];
			    if (i_542_ != 0) {
				int i_543_ = anIntArray6451[i_542_ & 0xff];
				int i_544_ = (((i_543_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_545_ = (((i_543_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_543_ = (((i_544_ | i_545_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_546_ = is_502_[i_501_];
				int i_547_ = i_543_ + i_546_;
				int i_548_ = ((i_543_ & 0xff00ff)
					      + (i_546_ & 0xff00ff));
				i_546_
				    = (i_548_ & 0x1000100) + (i_547_ - i_548_
							      & 0x10000);
				is_502_[i_501_]
				    = i_547_ - i_546_ | i_546_ - (i_546_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_495_ += Class152_Sub1.anInt4718;
		    i_496_ += Class152_Sub1.anInt4731;
		}
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_549_ = Class152_Sub1.anInt4725;
		int i_550_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_551_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_552_ = Class152_Sub1.anInt4739;
		if (i_550_ < 0) {
		    int i_553_ = ((Class152_Sub1.anInt4718 - 1 - i_550_)
				  / Class152_Sub1.anInt4718);
		    i_552_ += i_553_;
		    i_550_ += Class152_Sub1.anInt4718 * i_553_;
		    i_551_ += Class152_Sub1.anInt4731 * i_553_;
		    i_549_ += i_553_;
		}
		int i_554_;
		if ((i_554_
		     = (1 + i_550_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_552_)
		    i_552_ = i_554_;
		if (i_551_ < 0) {
		    i_554_ = ((Class152_Sub1.anInt4731 - 1 - i_551_)
			      / Class152_Sub1.anInt4731);
		    i_552_ += i_554_;
		    i_550_ += Class152_Sub1.anInt4718 * i_554_;
		    i_551_ += Class152_Sub1.anInt4731 * i_554_;
		    i_549_ += i_554_;
		}
		if ((i_554_
		     = (1 + i_551_ - (anInt4735 << 12)
			- Class152_Sub1.anInt4731) / Class152_Sub1.anInt4731)
		    > i_552_)
		    i_552_ = i_554_;
		for (/**/; i_552_ < 0; i_552_++) {
		    int i_555_ = (i_551_ >> 12) * anInt4729 + (i_550_ >> 12);
		    int i_556_ = i_549_++;
		    int[] is_557_ = is;
		    int i_558_ = arg0;
		    int i_559_ = arg1;
		    if (i_559_ == 0) {
			if (i_558_ == 0)
			    is_557_[i_556_]
				= (anIntArray6451
				   [aByteArray6450[i_555_] & 0xff]);
			else if (i_558_ == 1) {
			    int i_560_ = (anIntArray6451
					  [aByteArray6450[i_555_] & 0xff]);
			    int i_561_ = (((i_560_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_562_
				= ((i_560_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_563_
				= ((i_560_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_557_[i_556_] = (i_561_ | i_562_ | i_563_) >>> 8;
			} else if (i_558_ == 2) {
			    int i_564_ = (anIntArray6451
					  [aByteArray6450[i_555_] & 0xff]);
			    int i_565_ = (((i_564_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_566_
				= ((i_564_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_557_[i_556_] = (((i_565_ | i_566_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_559_ == 1) {
			if (i_558_ == 0) {
			    int i_567_ = aByteArray6450[i_555_];
			    if (i_567_ != 0)
				is_557_[i_556_]
				    = anIntArray6451[i_567_ & 0xff];
			} else if (i_558_ == 1) {
			    int i_568_ = aByteArray6450[i_555_];
			    if (i_568_ != 0) {
				int i_569_ = anIntArray6451[i_568_ & 0xff];
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_570_
					= Class152_Sub1.anInt4726 >>> 24;
				    int i_571_ = 256 - i_570_;
				    int i_572_ = is_557_[i_556_];
				    is_557_[i_556_]
					= ((((i_569_ & 0xff00ff) * i_570_
					     + (i_572_ & 0xff00ff) * i_571_)
					    & ~0xff00ff)
					   + (((i_569_ & 0xff00) * i_570_
					       + (i_572_ & 0xff00) * i_571_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_573_ = (((i_569_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_574_ = (((i_569_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_575_ = (((i_569_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_569_ = (i_573_ | i_574_ | i_575_) >>> 8;
				    int i_576_ = is_557_[i_556_];
				    is_557_[i_556_]
					= (((((i_569_ & 0xff00ff)
					      * Class152_Sub1.anInt4711)
					     + ((i_576_ & 0xff00ff)
						* Class152_Sub1.anInt4727))
					    & ~0xff00ff)
					   + ((((i_569_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       + ((i_576_ & 0xff00)
						  * Class152_Sub1.anInt4727))
					      & 0xff0000)) >> 8;
				} else {
				    int i_577_ = (((i_569_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_578_ = (((i_569_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_579_ = (((i_569_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_557_[i_556_]
					= (i_577_ | i_578_ | i_579_) >>> 8;
				}
			    }
			} else if (i_558_ == 2) {
			    int i_580_ = aByteArray6450[i_555_];
			    if (i_580_ != 0) {
				int i_581_ = anIntArray6451[i_580_ & 0xff];
				int i_582_ = (((i_581_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_583_ = (((i_581_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_557_[i_556_++]
				    = (((i_582_ | i_583_) >>> 8)
				       + Class152_Sub1.anInt4722);
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_559_ == 2) {
			if (i_558_ == 0) {
			    int i_584_ = aByteArray6450[i_555_];
			    if (i_584_ != 0) {
				int i_585_ = anIntArray6451[i_584_ & 0xff];
				int i_586_ = is_557_[i_556_];
				int i_587_ = i_585_ + i_586_;
				int i_588_ = ((i_585_ & 0xff00ff)
					      + (i_586_ & 0xff00ff));
				i_586_
				    = (i_588_ & 0x1000100) + (i_587_ - i_588_
							      & 0x10000);
				is_557_[i_556_]
				    = i_587_ - i_586_ | i_586_ - (i_586_
								  >>> 8);
			    }
			} else if (i_558_ == 1) {
			    int i_589_ = aByteArray6450[i_555_];
			    if (i_589_ != 0) {
				int i_590_ = anIntArray6451[i_589_ & 0xff];
				int i_591_ = (((i_590_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_592_ = (((i_590_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_593_ = (((i_590_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_590_ = (i_591_ | i_592_ | i_593_) >>> 8;
				int i_594_ = is_557_[i_556_];
				int i_595_ = i_590_ + i_594_;
				int i_596_ = ((i_590_ & 0xff00ff)
					      + (i_594_ & 0xff00ff));
				i_594_
				    = (i_596_ & 0x1000100) + (i_595_ - i_596_
							      & 0x10000);
				is_557_[i_556_]
				    = i_595_ - i_594_ | i_594_ - (i_594_
								  >>> 8);
			    }
			} else if (i_558_ == 2) {
			    int i_597_ = aByteArray6450[i_555_];
			    if (i_597_ != 0) {
				int i_598_ = anIntArray6451[i_597_ & 0xff];
				int i_599_ = (((i_598_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_600_ = (((i_598_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_598_ = (((i_599_ | i_600_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_601_ = is_557_[i_556_];
				int i_602_ = i_598_ + i_601_;
				int i_603_ = ((i_598_ & 0xff00ff)
					      + (i_601_ & 0xff00ff));
				i_601_
				    = (i_603_ & 0x1000100) + (i_602_ - i_603_
							      & 0x10000);
				is_557_[i_556_]
				    = i_602_ - i_601_ | i_601_ - (i_601_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_550_ += Class152_Sub1.anInt4718;
		    i_551_ += Class152_Sub1.anInt4731;
		}
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	}
    }
    
    public Class152_Sub1_Sub2(Class130_Sub1 arg0, byte[] arg1, int[] arg2,
			      int arg3, int arg4) {
	super(arg0, arg3, arg4);
	aByteArray6450 = arg1;
	anIntArray6451 = arg2;
    }
    
    public void method2214(int arg0, int arg1, Class183 arg2, int arg3,
			   int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i = 0;
	int i_604_ = aClass130_Sub1_4715.anInt4029;
	int i_605_ = anInt4729;
	int i_606_ = anInt4735;
	int i_607_ = i_604_ - i_605_;
	int i_608_ = 0;
	int i_609_ = arg0 + arg1 * i_604_;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_610_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_606_ -= i_610_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i += i_610_ * i_605_;
	    i_609_ += i_610_ * i_604_;
	}
	if (arg1 + i_606_ > aClass130_Sub1_4715.anInt4024)
	    i_606_ -= arg1 + i_606_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_611_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_605_ -= i_611_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i += i_611_;
	    i_609_ += i_611_;
	    i_608_ += i_611_;
	    i_607_ += i_611_;
	}
	if (arg0 + i_605_ > aClass130_Sub1_4715.anInt4067) {
	    int i_612_ = arg0 + i_605_ - aClass130_Sub1_4715.anInt4067;
	    i_605_ -= i_612_;
	    i_608_ += i_612_;
	    i_607_ += i_612_;
	}
	if (i_605_ > 0 && i_606_ > 0) {
	    Class183_Sub1 class183_sub1 = (Class183_Sub1) arg2;
	    int[] is = class183_sub1.anIntArray4954;
	    int[] is_613_ = class183_sub1.anIntArray4963;
	    int[] is_614_ = aClass130_Sub1_4715.anIntArray4026;
	    int i_615_ = arg1;
	    if (arg4 > i_615_) {
		i_615_ = arg4;
		i_609_ += (arg4 - arg1) * i_604_;
		i += (arg4 - arg1) * anInt4729;
	    }
	    int i_616_ = (arg4 + is.length < arg1 + i_606_ ? arg4 + is.length
			  : arg1 + i_606_);
	    for (int i_617_ = i_615_; i_617_ < i_616_; i_617_++) {
		int i_618_ = is[i_617_ - arg4] + arg3;
		int i_619_ = is_613_[i_617_ - arg4];
		int i_620_ = i_605_;
		if (arg0 > i_618_) {
		    int i_621_ = arg0 - i_618_;
		    if (i_621_ >= i_619_) {
			i += i_605_ + i_608_;
			i_609_ += i_605_ + i_607_;
			continue;
		    }
		    i_619_ -= i_621_;
		} else {
		    int i_622_ = i_618_ - arg0;
		    if (i_622_ >= i_605_) {
			i += i_605_ + i_608_;
			i_609_ += i_605_ + i_607_;
			continue;
		    }
		    i += i_622_;
		    i_620_ -= i_622_;
		    i_609_ += i_622_;
		}
		int i_623_ = 0;
		if (i_620_ < i_619_)
		    i_619_ = i_620_;
		else
		    i_623_ = i_620_ - i_619_;
		for (int i_624_ = -i_619_; i_624_ < 0; i_624_++) {
		    int i_625_ = aByteArray6450[i++];
		    if (i_625_ != 0)
			is_614_[i_609_++] = anIntArray6451[i_625_ & 0xff];
		    else
			i_609_++;
		}
		i += i_623_ + i_608_;
		i_609_ += i_623_ + i_607_;
	    }
	}
    }
    
    public void method2218(int[] arg0, int[] arg1, int arg2, int arg3) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	if (Class152_Sub1.anInt4718 == 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_626_ = i + arg3;
		    if (i_626_ >= 0) {
			if (i_626_ >= arg0.length)
			    break;
			int i_627_ = Class152_Sub1.anInt4725;
			int i_628_ = Class152_Sub1.anInt4723;
			int i_629_ = Class152_Sub1.anInt4741;
			int i_630_ = Class152_Sub1.anInt4739;
			if (i_628_ >= 0 && i_629_ >= 0
			    && i_628_ - (anInt4729 << 12) < 0
			    && i_629_ - (anInt4735 << 12) < 0) {
			    int i_631_ = arg0[i_626_] - arg2;
			    int i_632_ = -arg1[i_626_];
			    int i_633_
				= i_631_ - (i_627_ - Class152_Sub1.anInt4725);
			    if (i_633_ > 0) {
				i_627_ += i_633_;
				i_630_ += i_633_;
				i_628_ += Class152_Sub1.anInt4718 * i_633_;
				i_629_ += Class152_Sub1.anInt4731 * i_633_;
			    } else
				i_632_ -= i_633_;
			    if (i_630_ < i_632_)
				i_630_ = i_632_;
			    for (/**/; i_630_ < 0; i_630_++) {
				int i_634_
				    = (aByteArray6450
				       [(i_629_ >> 12) * anInt4729 + (i_628_
								      >> 12)]);
				if (i_634_ != 0)
				    is[i_627_++]
					= anIntArray6451[i_634_ & 0xff];
				else
				    i_627_++;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_635_ = i + arg3;
		    if (i_635_ >= 0) {
			if (i_635_ >= arg0.length)
			    break;
			int i_636_ = Class152_Sub1.anInt4725;
			int i_637_ = Class152_Sub1.anInt4723;
			int i_638_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_639_ = Class152_Sub1.anInt4739;
			if (i_637_ >= 0 && i_637_ - (anInt4729 << 12) < 0) {
			    int i_640_;
			    if ((i_640_ = i_638_ - (anInt4735 << 12)) >= 0) {
				i_640_ = ((Class152_Sub1.anInt4731 - i_640_)
					  / Class152_Sub1.anInt4731);
				i_639_ += i_640_;
				i_638_ += Class152_Sub1.anInt4731 * i_640_;
				i_636_ += i_640_;
			    }
			    if ((i_640_ = ((i_638_ - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_639_)
				i_639_ = i_640_;
			    int i_641_ = arg0[i_635_] - arg2;
			    int i_642_ = -arg1[i_635_];
			    int i_643_
				= i_641_ - (i_636_ - Class152_Sub1.anInt4725);
			    if (i_643_ > 0) {
				i_636_ += i_643_;
				i_639_ += i_643_;
				i_637_ += Class152_Sub1.anInt4718 * i_643_;
				i_638_ += Class152_Sub1.anInt4731 * i_643_;
			    } else
				i_642_ -= i_643_;
			    if (i_639_ < i_642_)
				i_639_ = i_642_;
			    for (/**/; i_639_ < 0; i_639_++) {
				int i_644_
				    = (aByteArray6450
				       [(i_638_ >> 12) * anInt4729 + (i_637_
								      >> 12)]);
				if (i_644_ != 0)
				    is[i_636_++]
					= anIntArray6451[i_644_ & 0xff];
				else
				    i_636_++;
				i_638_ += Class152_Sub1.anInt4731;
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
		    int i_645_ = i + arg3;
		    if (i_645_ >= 0) {
			if (i_645_ >= arg0.length)
			    break;
			int i_646_ = Class152_Sub1.anInt4725;
			int i_647_ = Class152_Sub1.anInt4723;
			int i_648_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_649_ = Class152_Sub1.anInt4739;
			if (i_647_ >= 0 && i_647_ - (anInt4729 << 12) < 0) {
			    if (i_648_ < 0) {
				int i_650_
				    = ((Class152_Sub1.anInt4731 - 1 - i_648_)
				       / Class152_Sub1.anInt4731);
				i_649_ += i_650_;
				i_648_ += Class152_Sub1.anInt4731 * i_650_;
				i_646_ += i_650_;
			    }
			    int i_651_;
			    if ((i_651_ = ((1 + i_648_ - (anInt4735 << 12)
					    - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_649_)
				i_649_ = i_651_;
			    int i_652_ = arg0[i_645_] - arg2;
			    int i_653_ = -arg1[i_645_];
			    int i_654_
				= i_652_ - (i_646_ - Class152_Sub1.anInt4725);
			    if (i_654_ > 0) {
				i_646_ += i_654_;
				i_649_ += i_654_;
				i_647_ += Class152_Sub1.anInt4718 * i_654_;
				i_648_ += Class152_Sub1.anInt4731 * i_654_;
			    } else
				i_653_ -= i_654_;
			    if (i_649_ < i_653_)
				i_649_ = i_653_;
			    for (/**/; i_649_ < 0; i_649_++) {
				int i_655_
				    = (aByteArray6450
				       [(i_648_ >> 12) * anInt4729 + (i_647_
								      >> 12)]);
				if (i_655_ != 0)
				    is[i_646_++]
					= anIntArray6451[i_655_ & 0xff];
				else
				    i_646_++;
				i_648_ += Class152_Sub1.anInt4731;
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
		    int i_656_ = i + arg3;
		    if (i_656_ >= 0) {
			if (i_656_ >= arg0.length)
			    break;
			int i_657_ = Class152_Sub1.anInt4725;
			int i_658_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_659_ = Class152_Sub1.anInt4741;
			int i_660_ = Class152_Sub1.anInt4739;
			if (i_659_ >= 0 && i_659_ - (anInt4735 << 12) < 0) {
			    int i_661_;
			    if ((i_661_ = i_658_ - (anInt4729 << 12)) >= 0) {
				i_661_ = ((Class152_Sub1.anInt4718 - i_661_)
					  / Class152_Sub1.anInt4718);
				i_660_ += i_661_;
				i_658_ += Class152_Sub1.anInt4718 * i_661_;
				i_657_ += i_661_;
			    }
			    if ((i_661_ = ((i_658_ - Class152_Sub1.anInt4718)
					   / Class152_Sub1.anInt4718))
				> i_660_)
				i_660_ = i_661_;
			    int i_662_ = arg0[i_656_] - arg2;
			    int i_663_ = -arg1[i_656_];
			    int i_664_
				= i_662_ - (i_657_ - Class152_Sub1.anInt4725);
			    if (i_664_ > 0) {
				i_657_ += i_664_;
				i_660_ += i_664_;
				i_658_ += Class152_Sub1.anInt4718 * i_664_;
				i_659_ += Class152_Sub1.anInt4731 * i_664_;
			    } else
				i_663_ -= i_664_;
			    if (i_660_ < i_663_)
				i_660_ = i_663_;
			    for (/**/; i_660_ < 0; i_660_++) {
				int i_665_
				    = (aByteArray6450
				       [(i_659_ >> 12) * anInt4729 + (i_658_
								      >> 12)]);
				if (i_665_ != 0)
				    is[i_657_++]
					= anIntArray6451[i_665_ & 0xff];
				else
				    i_657_++;
				i_658_ += Class152_Sub1.anInt4718;
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
		    int i_666_ = i + arg3;
		    if (i_666_ >= 0) {
			if (i_666_ >= arg0.length)
			    break;
			int i_667_ = Class152_Sub1.anInt4725;
			int i_668_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_669_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_670_ = Class152_Sub1.anInt4739;
			int i_671_;
			if ((i_671_ = i_668_ - (anInt4729 << 12)) >= 0) {
			    i_671_ = ((Class152_Sub1.anInt4718 - i_671_)
				      / Class152_Sub1.anInt4718);
			    i_670_ += i_671_;
			    i_668_ += Class152_Sub1.anInt4718 * i_671_;
			    i_669_ += Class152_Sub1.anInt4731 * i_671_;
			    i_667_ += i_671_;
			}
			if ((i_671_ = ((i_668_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_670_)
			    i_670_ = i_671_;
			if ((i_671_ = i_669_ - (anInt4735 << 12)) >= 0) {
			    i_671_ = ((Class152_Sub1.anInt4731 - i_671_)
				      / Class152_Sub1.anInt4731);
			    i_670_ += i_671_;
			    i_668_ += Class152_Sub1.anInt4718 * i_671_;
			    i_669_ += Class152_Sub1.anInt4731 * i_671_;
			    i_667_ += i_671_;
			}
			if ((i_671_ = ((i_669_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_670_)
			    i_670_ = i_671_;
			int i_672_ = arg0[i_666_] - arg2;
			int i_673_ = -arg1[i_666_];
			int i_674_
			    = i_672_ - (i_667_ - Class152_Sub1.anInt4725);
			if (i_674_ > 0) {
			    i_667_ += i_674_;
			    i_670_ += i_674_;
			    i_668_ += Class152_Sub1.anInt4718 * i_674_;
			    i_669_ += Class152_Sub1.anInt4731 * i_674_;
			} else
			    i_673_ -= i_674_;
			if (i_670_ < i_673_)
			    i_670_ = i_673_;
			for (/**/; i_670_ < 0; i_670_++) {
			    int i_675_
				= (aByteArray6450
				   [(i_669_ >> 12) * anInt4729 + (i_668_
								  >> 12)]);
			    if (i_675_ != 0)
				is[i_667_++] = anIntArray6451[i_675_ & 0xff];
			    else
				i_667_++;
			    i_668_ += Class152_Sub1.anInt4718;
			    i_669_ += Class152_Sub1.anInt4731;
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
		    int i_676_ = i + arg3;
		    if (i_676_ >= 0) {
			if (i_676_ >= arg0.length)
			    break;
			int i_677_ = Class152_Sub1.anInt4725;
			int i_678_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_679_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_680_ = Class152_Sub1.anInt4739;
			int i_681_;
			if ((i_681_ = i_678_ - (anInt4729 << 12)) >= 0) {
			    i_681_ = ((Class152_Sub1.anInt4718 - i_681_)
				      / Class152_Sub1.anInt4718);
			    i_680_ += i_681_;
			    i_678_ += Class152_Sub1.anInt4718 * i_681_;
			    i_679_ += Class152_Sub1.anInt4731 * i_681_;
			    i_677_ += i_681_;
			}
			if ((i_681_ = ((i_678_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_680_)
			    i_680_ = i_681_;
			if (i_679_ < 0) {
			    i_681_ = ((Class152_Sub1.anInt4731 - 1 - i_679_)
				      / Class152_Sub1.anInt4731);
			    i_680_ += i_681_;
			    i_678_ += Class152_Sub1.anInt4718 * i_681_;
			    i_679_ += Class152_Sub1.anInt4731 * i_681_;
			    i_677_ += i_681_;
			}
			if ((i_681_ = ((1 + i_679_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_680_)
			    i_680_ = i_681_;
			int i_682_ = arg0[i_676_] - arg2;
			int i_683_ = -arg1[i_676_];
			int i_684_
			    = i_682_ - (i_677_ - Class152_Sub1.anInt4725);
			if (i_684_ > 0) {
			    i_677_ += i_684_;
			    i_680_ += i_684_;
			    i_678_ += Class152_Sub1.anInt4718 * i_684_;
			    i_679_ += Class152_Sub1.anInt4731 * i_684_;
			} else
			    i_683_ -= i_684_;
			if (i_680_ < i_683_)
			    i_680_ = i_683_;
			for (/**/; i_680_ < 0; i_680_++) {
			    int i_685_
				= (aByteArray6450
				   [(i_679_ >> 12) * anInt4729 + (i_678_
								  >> 12)]);
			    if (i_685_ != 0)
				is[i_677_++] = anIntArray6451[i_685_ & 0xff];
			    else
				i_677_++;
			    i_678_ += Class152_Sub1.anInt4718;
			    i_679_ += Class152_Sub1.anInt4731;
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
		int i_686_ = i + arg3;
		if (i_686_ >= 0) {
		    if (i_686_ >= arg0.length)
			break;
		    int i_687_ = Class152_Sub1.anInt4725;
		    int i_688_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_689_ = Class152_Sub1.anInt4741;
		    int i_690_ = Class152_Sub1.anInt4739;
		    if (i_689_ >= 0 && i_689_ - (anInt4735 << 12) < 0) {
			if (i_688_ < 0) {
			    int i_691_
				= ((Class152_Sub1.anInt4718 - 1 - i_688_)
				   / Class152_Sub1.anInt4718);
			    i_690_ += i_691_;
			    i_688_ += Class152_Sub1.anInt4718 * i_691_;
			    i_687_ += i_691_;
			}
			int i_692_;
			if ((i_692_ = ((1 + i_688_ - (anInt4729 << 12)
					- Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_690_)
			    i_690_ = i_692_;
			int i_693_ = arg0[i_686_] - arg2;
			int i_694_ = -arg1[i_686_];
			int i_695_
			    = i_693_ - (i_687_ - Class152_Sub1.anInt4725);
			if (i_695_ > 0) {
			    i_687_ += i_695_;
			    i_690_ += i_695_;
			    i_688_ += Class152_Sub1.anInt4718 * i_695_;
			    i_689_ += Class152_Sub1.anInt4731 * i_695_;
			} else
			    i_694_ -= i_695_;
			if (i_690_ < i_694_)
			    i_690_ = i_694_;
			for (/**/; i_690_ < 0; i_690_++) {
			    int i_696_
				= (aByteArray6450
				   [(i_689_ >> 12) * anInt4729 + (i_688_
								  >> 12)]);
			    if (i_696_ != 0)
				is[i_687_++] = anIntArray6451[i_696_ & 0xff];
			    else
				i_687_++;
			    i_688_ += Class152_Sub1.anInt4718;
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
		int i_697_ = i + arg3;
		if (i_697_ >= 0) {
		    if (i_697_ >= arg0.length)
			break;
		    int i_698_ = Class152_Sub1.anInt4725;
		    int i_699_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_700_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_701_ = Class152_Sub1.anInt4739;
		    if (i_699_ < 0) {
			int i_702_ = ((Class152_Sub1.anInt4718 - 1 - i_699_)
				      / Class152_Sub1.anInt4718);
			i_701_ += i_702_;
			i_699_ += Class152_Sub1.anInt4718 * i_702_;
			i_700_ += Class152_Sub1.anInt4731 * i_702_;
			i_698_ += i_702_;
		    }
		    int i_703_;
		    if ((i_703_ = ((1 + i_699_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_701_)
			i_701_ = i_703_;
		    if ((i_703_ = i_700_ - (anInt4735 << 12)) >= 0) {
			i_703_ = ((Class152_Sub1.anInt4731 - i_703_)
				  / Class152_Sub1.anInt4731);
			i_701_ += i_703_;
			i_699_ += Class152_Sub1.anInt4718 * i_703_;
			i_700_ += Class152_Sub1.anInt4731 * i_703_;
			i_698_ += i_703_;
		    }
		    if ((i_703_ = ((i_700_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_701_)
			i_701_ = i_703_;
		    int i_704_ = arg0[i_697_] - arg2;
		    int i_705_ = -arg1[i_697_];
		    int i_706_ = i_704_ - (i_698_ - Class152_Sub1.anInt4725);
		    if (i_706_ > 0) {
			i_698_ += i_706_;
			i_701_ += i_706_;
			i_699_ += Class152_Sub1.anInt4718 * i_706_;
			i_700_ += Class152_Sub1.anInt4731 * i_706_;
		    } else
			i_705_ -= i_706_;
		    if (i_701_ < i_705_)
			i_701_ = i_705_;
		    for (/**/; i_701_ < 0; i_701_++) {
			int i_707_
			    = (aByteArray6450
			       [(i_700_ >> 12) * anInt4729 + (i_699_ >> 12)]);
			if (i_707_ != 0)
			    is[i_698_++] = anIntArray6451[i_707_ & 0xff];
			else
			    i_698_++;
			i_699_ += Class152_Sub1.anInt4718;
			i_700_ += Class152_Sub1.anInt4731;
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
		int i_708_ = i + arg3;
		if (i_708_ >= 0) {
		    if (i_708_ >= arg0.length)
			break;
		    int i_709_ = Class152_Sub1.anInt4725;
		    int i_710_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_711_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_712_ = Class152_Sub1.anInt4739;
		    if (i_710_ < 0) {
			int i_713_ = ((Class152_Sub1.anInt4718 - 1 - i_710_)
				      / Class152_Sub1.anInt4718);
			i_712_ += i_713_;
			i_710_ += Class152_Sub1.anInt4718 * i_713_;
			i_711_ += Class152_Sub1.anInt4731 * i_713_;
			i_709_ += i_713_;
		    }
		    int i_714_;
		    if ((i_714_ = ((1 + i_710_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_712_)
			i_712_ = i_714_;
		    if (i_711_ < 0) {
			i_714_ = ((Class152_Sub1.anInt4731 - 1 - i_711_)
				  / Class152_Sub1.anInt4731);
			i_712_ += i_714_;
			i_710_ += Class152_Sub1.anInt4718 * i_714_;
			i_711_ += Class152_Sub1.anInt4731 * i_714_;
			i_709_ += i_714_;
		    }
		    if ((i_714_ = ((1 + i_711_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_712_)
			i_712_ = i_714_;
		    int i_715_ = arg0[i_708_] - arg2;
		    int i_716_ = -arg1[i_708_];
		    int i_717_ = i_715_ - (i_709_ - Class152_Sub1.anInt4725);
		    if (i_717_ > 0) {
			i_709_ += i_717_;
			i_712_ += i_717_;
			i_710_ += Class152_Sub1.anInt4718 * i_717_;
			i_711_ += Class152_Sub1.anInt4731 * i_717_;
		    } else
			i_716_ -= i_717_;
		    if (i_712_ < i_716_)
			i_712_ = i_716_;
		    for (/**/; i_712_ < 0; i_712_++) {
			int i_718_
			    = (aByteArray6450
			       [(i_711_ >> 12) * anInt4729 + (i_710_ >> 12)]);
			if (i_718_ != 0)
			    is[i_709_++] = anIntArray6451[i_718_ & 0xff];
			else
			    i_709_++;
			i_710_ += Class152_Sub1.anInt4718;
			i_711_ += Class152_Sub1.anInt4731;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	}
    }
    
    public void method2202(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	int i = aClass130_Sub1_4715.anInt4029;
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i_719_ = arg1 * i + arg0;
	int i_720_ = 0;
	int i_721_ = anInt4735;
	int i_722_ = anInt4729;
	int i_723_ = i - i_722_;
	int i_724_ = 0;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_725_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_721_ -= i_725_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i_720_ += i_725_ * i_722_;
	    i_719_ += i_725_ * i;
	}
	if (arg1 + i_721_ > aClass130_Sub1_4715.anInt4024)
	    i_721_ -= arg1 + i_721_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_726_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_722_ -= i_726_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i_720_ += i_726_;
	    i_719_ += i_726_;
	    i_724_ += i_726_;
	    i_723_ += i_726_;
	}
	if (arg0 + i_722_ > aClass130_Sub1_4715.anInt4067) {
	    int i_727_ = arg0 + i_722_ - aClass130_Sub1_4715.anInt4067;
	    i_722_ -= i_727_;
	    i_724_ += i_727_;
	    i_723_ += i_727_;
	}
	if (i_722_ > 0 && i_721_ > 0) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    if (arg4 == 0) {
		if (arg2 == 0) {
		    for (int i_728_ = -i_721_; i_728_ < 0; i_728_++) {
			int i_729_ = i_719_ + i_722_ - 3;
			while (i_719_ < i_729_) {
			    is[i_719_++] = (anIntArray6451
					    [aByteArray6450[i_720_++] & 0xff]);
			    is[i_719_++] = (anIntArray6451
					    [aByteArray6450[i_720_++] & 0xff]);
			    is[i_719_++] = (anIntArray6451
					    [aByteArray6450[i_720_++] & 0xff]);
			    is[i_719_++] = (anIntArray6451
					    [aByteArray6450[i_720_++] & 0xff]);
			}
			i_729_ += 3;
			while (i_719_ < i_729_)
			    is[i_719_++] = (anIntArray6451
					    [aByteArray6450[i_720_++] & 0xff]);
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_730_ = (arg3 & 0xff0000) >> 16;
		    int i_731_ = (arg3 & 0xff00) >> 8;
		    int i_732_ = arg3 & 0xff;
		    for (int i_733_ = -i_721_; i_733_ < 0; i_733_++) {
			for (int i_734_ = -i_722_; i_734_ < 0; i_734_++) {
			    int i_735_ = (anIntArray6451
					  [aByteArray6450[i_720_++] & 0xff]);
			    int i_736_
				= (i_735_ & 0xff0000) * i_730_ & ~0xffffff;
			    int i_737_ = (i_735_ & 0xff00) * i_731_ & 0xff0000;
			    int i_738_ = (i_735_ & 0xff) * i_732_ & 0xff00;
			    is[i_719_++] = (i_736_ | i_737_ | i_738_) >>> 8;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_739_ = arg3 >>> 24;
		    int i_740_ = 256 - i_739_;
		    int i_741_ = (arg3 & 0xff00ff) * i_740_ & ~0xff00ff;
		    int i_742_ = (arg3 & 0xff00) * i_740_ & 0xff0000;
		    arg3 = (i_741_ | i_742_) >>> 8;
		    for (int i_743_ = -i_721_; i_743_ < 0; i_743_++) {
			for (int i_744_ = -i_722_; i_744_ < 0; i_744_++) {
			    int i_745_ = (anIntArray6451
					  [aByteArray6450[i_720_++] & 0xff]);
			    i_741_ = (i_745_ & 0xff00ff) * i_739_ & ~0xff00ff;
			    i_742_ = (i_745_ & 0xff00) * i_739_ & 0xff0000;
			    is[i_719_++] = ((i_741_ | i_742_) >>> 8) + arg3;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 1) {
		if (arg2 == 0) {
		    for (int i_746_ = -i_721_; i_746_ < 0; i_746_++) {
			int i_747_ = i_719_ + i_722_ - 3;
			while (i_719_ < i_747_) {
			    int i_748_ = aByteArray6450[i_720_++];
			    if (i_748_ != 0)
				is[i_719_++] = anIntArray6451[i_748_ & 0xff];
			    else
				i_719_++;
			    i_748_ = aByteArray6450[i_720_++];
			    if (i_748_ != 0)
				is[i_719_++] = anIntArray6451[i_748_ & 0xff];
			    else
				i_719_++;
			    i_748_ = aByteArray6450[i_720_++];
			    if (i_748_ != 0)
				is[i_719_++] = anIntArray6451[i_748_ & 0xff];
			    else
				i_719_++;
			    i_748_ = aByteArray6450[i_720_++];
			    if (i_748_ != 0)
				is[i_719_++] = anIntArray6451[i_748_ & 0xff];
			    else
				i_719_++;
			}
			i_747_ += 3;
			while (i_719_ < i_747_) {
			    int i_749_ = aByteArray6450[i_720_++];
			    if (i_749_ != 0)
				is[i_719_++] = anIntArray6451[i_749_ & 0xff];
			    else
				i_719_++;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    if ((arg3 & 0xffffff) == 16777215) {
			int i_750_ = arg3 >>> 24;
			int i_751_ = 256 - i_750_;
			for (int i_752_ = -i_721_; i_752_ < 0; i_752_++) {
			    for (int i_753_ = -i_722_; i_753_ < 0; i_753_++) {
				int i_754_ = aByteArray6450[i_720_++];
				if (i_754_ != 0) {
				    int i_755_ = anIntArray6451[i_754_ & 0xff];
				    int i_756_ = is[i_719_];
				    is[i_719_++]
					= ((((i_755_ & 0xff00ff) * i_750_
					     + (i_756_ & 0xff00ff) * i_751_)
					    & ~0xff00ff)
					   + (((i_755_ & 0xff00) * i_750_
					       + (i_756_ & 0xff00) * i_751_)
					      & 0xff0000)) >> 8;
				} else
				    i_719_++;
			    }
			    i_719_ += i_723_;
			    i_720_ += i_724_;
			}
		    } else {
			int i_757_ = (arg3 & 0xff0000) >> 16;
			int i_758_ = (arg3 & 0xff00) >> 8;
			int i_759_ = arg3 & 0xff;
			int i_760_ = arg3 >>> 24;
			int i_761_ = 256 - i_760_;
			for (int i_762_ = -i_721_; i_762_ < 0; i_762_++) {
			    for (int i_763_ = -i_722_; i_763_ < 0; i_763_++) {
				int i_764_ = aByteArray6450[i_720_++];
				if (i_764_ != 0) {
				    int i_765_ = anIntArray6451[i_764_ & 0xff];
				    if (i_760_ != 255) {
					int i_766_
					    = ((i_765_ & 0xff0000) * i_757_
					       & ~0xffffff);
					int i_767_
					    = ((i_765_ & 0xff00) * i_758_
					       & 0xff0000);
					int i_768_ = ((i_765_ & 0xff) * i_759_
						      & 0xff00);
					i_765_
					    = (i_766_ | i_767_ | i_768_) >>> 8;
					int i_769_ = is[i_719_];
					is[i_719_++]
					    = ((((i_765_ & 0xff00ff) * i_760_
						 + ((i_769_ & 0xff00ff)
						    * i_761_))
						& ~0xff00ff)
					       + (((i_765_ & 0xff00) * i_760_
						   + ((i_769_ & 0xff00)
						      * i_761_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_770_
					    = ((i_765_ & 0xff0000) * i_757_
					       & ~0xffffff);
					int i_771_
					    = ((i_765_ & 0xff00) * i_758_
					       & 0xff0000);
					int i_772_ = ((i_765_ & 0xff) * i_759_
						      & 0xff00);
					is[i_719_++]
					    = (i_770_ | i_771_ | i_772_) >>> 8;
				    }
				} else
				    i_719_++;
			    }
			    i_719_ += i_723_;
			    i_720_ += i_724_;
			}
			return;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_773_ = arg3 >>> 24;
		    int i_774_ = 256 - i_773_;
		    int i_775_ = (arg3 & 0xff00ff) * i_774_ & ~0xff00ff;
		    int i_776_ = (arg3 & 0xff00) * i_774_ & 0xff0000;
		    arg3 = (i_775_ | i_776_) >>> 8;
		    for (int i_777_ = -i_721_; i_777_ < 0; i_777_++) {
			for (int i_778_ = -i_722_; i_778_ < 0; i_778_++) {
			    int i_779_ = aByteArray6450[i_720_++];
			    if (i_779_ != 0) {
				int i_780_ = anIntArray6451[i_779_ & 0xff];
				i_775_
				    = (i_780_ & 0xff00ff) * i_773_ & ~0xff00ff;
				i_776_ = (i_780_ & 0xff00) * i_773_ & 0xff0000;
				is[i_719_++]
				    = ((i_775_ | i_776_) >>> 8) + arg3;
			    } else
				i_719_++;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 2) {
		if (arg2 == 0) {
		    for (int i_781_ = -i_721_; i_781_ < 0; i_781_++) {
			for (int i_782_ = -i_722_; i_782_ < 0; i_782_++) {
			    int i_783_ = aByteArray6450[i_720_++];
			    if (i_783_ != 0) {
				int i_784_ = anIntArray6451[i_783_ & 0xff];
				int i_785_ = is[i_719_];
				int i_786_ = i_784_ + i_785_;
				int i_787_ = ((i_784_ & 0xff00ff)
					      + (i_785_ & 0xff00ff));
				i_785_
				    = (i_787_ & 0x1000100) + (i_786_ - i_787_
							      & 0x10000);
				is[i_719_++]
				    = i_786_ - i_785_ | i_785_ - (i_785_
								  >>> 8);
			    } else
				i_719_++;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_788_ = (arg3 & 0xff0000) >> 16;
		    int i_789_ = (arg3 & 0xff00) >> 8;
		    int i_790_ = arg3 & 0xff;
		    for (int i_791_ = -i_721_; i_791_ < 0; i_791_++) {
			for (int i_792_ = -i_722_; i_792_ < 0; i_792_++) {
			    int i_793_ = aByteArray6450[i_720_++];
			    if (i_793_ != 0) {
				int i_794_ = anIntArray6451[i_793_ & 0xff];
				int i_795_
				    = (i_794_ & 0xff0000) * i_788_ & ~0xffffff;
				int i_796_
				    = (i_794_ & 0xff00) * i_789_ & 0xff0000;
				int i_797_ = (i_794_ & 0xff) * i_790_ & 0xff00;
				i_794_ = (i_795_ | i_796_ | i_797_) >>> 8;
				int i_798_ = is[i_719_];
				int i_799_ = i_794_ + i_798_;
				int i_800_ = ((i_794_ & 0xff00ff)
					      + (i_798_ & 0xff00ff));
				i_798_
				    = (i_800_ & 0x1000100) + (i_799_ - i_800_
							      & 0x10000);
				is[i_719_++]
				    = i_799_ - i_798_ | i_798_ - (i_798_
								  >>> 8);
			    } else
				i_719_++;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_801_ = arg3 >>> 24;
		    int i_802_ = 256 - i_801_;
		    int i_803_ = (arg3 & 0xff00ff) * i_802_ & ~0xff00ff;
		    int i_804_ = (arg3 & 0xff00) * i_802_ & 0xff0000;
		    arg3 = (i_803_ | i_804_) >>> 8;
		    for (int i_805_ = -i_721_; i_805_ < 0; i_805_++) {
			for (int i_806_ = -i_722_; i_806_ < 0; i_806_++) {
			    int i_807_ = aByteArray6450[i_720_++];
			    if (i_807_ != 0) {
				int i_808_ = anIntArray6451[i_807_ & 0xff];
				i_803_
				    = (i_808_ & 0xff00ff) * i_801_ & ~0xff00ff;
				i_804_ = (i_808_ & 0xff00) * i_801_ & 0xff0000;
				i_808_ = ((i_803_ | i_804_) >>> 8) + arg3;
				int i_809_ = is[i_719_];
				int i_810_ = i_808_ + i_809_;
				int i_811_ = ((i_808_ & 0xff00ff)
					      + (i_809_ & 0xff00ff));
				i_809_
				    = (i_811_ & 0x1000100) + (i_810_ - i_811_
							      & 0x10000);
				is[i_719_++]
				    = i_810_ - i_809_ | i_809_ - (i_809_
								  >>> 8);
			    } else
				i_719_++;
			}
			i_719_ += i_723_;
			i_720_ += i_724_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    public void method2199(int arg0, int arg1, int arg2) {
	throw new IllegalStateException();
    }
    
    public void method2215(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	throw new IllegalStateException();
    }
}
