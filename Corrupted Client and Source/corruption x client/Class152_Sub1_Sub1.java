/* Class152_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152_Sub1_Sub1 extends Class152_Sub1
{
    public int[] anIntArray6449;
    
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
			    is[i_8_++] = anIntArray6449[(i >> 16) + i_15_];
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
			    int i_24_ = anIntArray6449[(i >> 16) + i_22_];
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
			    int i_36_ = anIntArray6449[(i >> 16) + i_34_];
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
			    int i_41_ = anIntArray6449[(i >> 16) + i_39_];
			    if (i_41_ != 0)
				is[i_8_++] = i_41_;
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
				int i_48_ = anIntArray6449[(i >> 16) + i_46_];
				if (i_48_ != 0) {
				    int i_49_ = is[i_8_];
				    is[i_8_++]
					= ((((i_48_ & 0xff00ff) * i_43_
					     + (i_49_ & 0xff00ff) * i_44_)
					    & ~0xff00ff)
					   + (((i_48_ & 0xff00) * i_43_
					       + (i_49_ & 0xff00) * i_44_)
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
			int i_50_ = (arg5 & 0xff0000) >> 16;
			int i_51_ = (arg5 & 0xff00) >> 8;
			int i_52_ = arg5 & 0xff;
			int i_53_ = arg5 >>> 24;
			int i_54_ = 256 - i_53_;
			for (int i_55_ = -arg3; i_55_ < 0; i_55_++) {
			    int i_56_ = (i_0_ >> 16) * anInt4729;
			    for (int i_57_ = -arg2; i_57_ < 0; i_57_++) {
				int i_58_ = anIntArray6449[(i >> 16) + i_56_];
				if (i_58_ != 0) {
				    if (i_53_ != 255) {
					int i_59_ = ((i_58_ & 0xff0000) * i_50_
						     & ~0xffffff);
					int i_60_ = ((i_58_ & 0xff00) * i_51_
						     & 0xff0000);
					int i_61_
					    = (i_58_ & 0xff) * i_52_ & 0xff00;
					i_58_ = (i_59_ | i_60_ | i_61_) >>> 8;
					int i_62_ = is[i_8_];
					is[i_8_++]
					    = ((((i_58_ & 0xff00ff) * i_53_
						 + (i_62_ & 0xff00ff) * i_54_)
						& ~0xff00ff)
					       + (((i_58_ & 0xff00) * i_53_
						   + (i_62_ & 0xff00) * i_54_)
						  & 0xff0000)) >> 8;
				    } else {
					int i_63_ = ((i_58_ & 0xff0000) * i_50_
						     & ~0xffffff);
					int i_64_ = ((i_58_ & 0xff00) * i_51_
						     & 0xff0000);
					int i_65_
					    = (i_58_ & 0xff) * i_52_ & 0xff00;
					is[i_8_++]
					    = (i_63_ | i_64_ | i_65_) >>> 8;
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
		    int i_66_ = arg5 >>> 24;
		    int i_67_ = 256 - i_66_;
		    int i_68_ = (arg5 & 0xff00ff) * i_67_ & ~0xff00ff;
		    int i_69_ = (arg5 & 0xff00) * i_67_ & 0xff0000;
		    arg5 = (i_68_ | i_69_) >>> 8;
		    int i_70_ = i;
		    for (int i_71_ = -arg3; i_71_ < 0; i_71_++) {
			int i_72_ = (i_0_ >> 16) * anInt4729;
			for (int i_73_ = -arg2; i_73_ < 0; i_73_++) {
			    int i_74_ = anIntArray6449[(i >> 16) + i_72_];
			    if (i_74_ != 0) {
				i_68_ = (i_74_ & 0xff00ff) * i_66_ & ~0xff00ff;
				i_69_ = (i_74_ & 0xff00) * i_66_ & 0xff0000;
				is[i_8_++] = ((i_68_ | i_69_) >>> 8) + arg5;
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_70_;
			i_8_ += i_9_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg6 == 2) {
		if (arg4 == 0) {
		    int i_75_ = i;
		    for (int i_76_ = -arg3; i_76_ < 0; i_76_++) {
			int i_77_ = (i_0_ >> 16) * anInt4729;
			for (int i_78_ = -arg2; i_78_ < 0; i_78_++) {
			    int i_79_ = anIntArray6449[(i >> 16) + i_77_];
			    if (i_79_ != 0) {
				int i_80_ = is[i_8_];
				int i_81_ = i_79_ + i_80_;
				int i_82_
				    = (i_79_ & 0xff00ff) + (i_80_ & 0xff00ff);
				i_80_ = (i_82_ & 0x1000100) + (i_81_ - i_82_
							       & 0x10000);
				is[i_8_++]
				    = i_81_ - i_80_ | i_80_ - (i_80_ >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_75_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 1) {
		    int i_83_ = i;
		    int i_84_ = (arg5 & 0xff0000) >> 16;
		    int i_85_ = (arg5 & 0xff00) >> 8;
		    int i_86_ = arg5 & 0xff;
		    for (int i_87_ = -arg3; i_87_ < 0; i_87_++) {
			int i_88_ = (i_0_ >> 16) * anInt4729;
			for (int i_89_ = -arg2; i_89_ < 0; i_89_++) {
			    int i_90_ = anIntArray6449[(i >> 16) + i_88_];
			    if (i_90_ != 0) {
				int i_91_
				    = (i_90_ & 0xff0000) * i_84_ & ~0xffffff;
				int i_92_
				    = (i_90_ & 0xff00) * i_85_ & 0xff0000;
				int i_93_ = (i_90_ & 0xff) * i_86_ & 0xff00;
				i_90_ = (i_91_ | i_92_ | i_93_) >>> 8;
				int i_94_ = is[i_8_];
				int i_95_ = i_90_ + i_94_;
				int i_96_
				    = (i_90_ & 0xff00ff) + (i_94_ & 0xff00ff);
				i_94_ = (i_96_ & 0x1000100) + (i_95_ - i_96_
							       & 0x10000);
				is[i_8_++]
				    = i_95_ - i_94_ | i_94_ - (i_94_ >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_83_;
			i_8_ += i_9_;
		    }
		    return;
		}
		if (arg4 == 2) {
		    int i_97_ = arg5 >>> 24;
		    int i_98_ = 256 - i_97_;
		    int i_99_ = (arg5 & 0xff00ff) * i_98_ & ~0xff00ff;
		    int i_100_ = (arg5 & 0xff00) * i_98_ & 0xff0000;
		    arg5 = (i_99_ | i_100_) >>> 8;
		    int i_101_ = i;
		    for (int i_102_ = -arg3; i_102_ < 0; i_102_++) {
			int i_103_ = (i_0_ >> 16) * anInt4729;
			for (int i_104_ = -arg2; i_104_ < 0; i_104_++) {
			    int i_105_ = anIntArray6449[(i >> 16) + i_103_];
			    if (i_105_ != 0) {
				i_99_
				    = (i_105_ & 0xff00ff) * i_97_ & ~0xff00ff;
				i_100_ = (i_105_ & 0xff00) * i_97_ & 0xff0000;
				i_105_ = ((i_99_ | i_100_) >>> 8) + arg5;
				int i_106_ = is[i_8_];
				int i_107_ = i_105_ + i_106_;
				int i_108_ = ((i_105_ & 0xff00ff)
					      + (i_106_ & 0xff00ff));
				i_106_
				    = (i_108_ & 0x1000100) + (i_107_ - i_108_
							      & 0x10000);
				is[i_8_++]
				    = i_107_ - i_106_ | i_106_ - (i_106_
								  >>> 8);
			    } else
				i_8_++;
			    i += i_4_;
			}
			i_0_ += i_5_;
			i = i_101_;
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
	throw new IllegalStateException
		  ("Can't capture alpha into a java_sprite_24");
    }
    
    public void method2220(int arg0, int arg1) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	if (Class152_Sub1.anInt4718 == 0) {
	    if (Class152_Sub1.anInt4731 == 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_109_ = Class152_Sub1.anInt4725;
		    int i_110_ = Class152_Sub1.anInt4723;
		    int i_111_ = Class152_Sub1.anInt4741;
		    int i_112_ = Class152_Sub1.anInt4739;
		    if (i_110_ >= 0 && i_111_ >= 0
			&& i_110_ - (anInt4729 << 12) < 0
			&& i_111_ - (anInt4735 << 12) < 0) {
			for (/**/; i_112_ < 0; i_112_++) {
			    int i_113_
				= (i_111_ >> 12) * anInt4729 + (i_110_ >> 12);
			    int i_114_ = i_109_++;
			    int[] is_115_ = is;
			    int i_116_ = arg0;
			    int i_117_ = arg1;
			    if (i_117_ == 0) {
				if (i_116_ == 0)
				    is_115_[i_114_] = anIntArray6449[i_113_];
				else if (i_116_ == 1) {
				    int i_118_ = anIntArray6449[i_113_++];
				    int i_119_ = (((i_118_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_120_ = (((i_118_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_121_ = (((i_118_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_115_[i_114_]
					= (i_119_ | i_120_ | i_121_) >>> 8;
				} else if (i_116_ == 2) {
				    int i_122_ = anIntArray6449[i_113_];
				    int i_123_ = (((i_122_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_124_ = (((i_122_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_115_[i_114_]
					= (((i_123_ | i_124_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_117_ == 1) {
				if (i_116_ == 0) {
				    int i_125_ = anIntArray6449[i_113_];
				    if (i_125_ != 0)
					is_115_[i_114_] = i_125_;
				} else if (i_116_ == 1) {
				    int i_126_ = anIntArray6449[i_113_];
				    if (i_126_ != 0) {
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_127_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_128_ = 256 - i_127_;
					    int i_129_ = is_115_[i_114_];
					    is_115_[i_114_]
						= (((((i_126_ & 0xff00ff)
						      * i_127_)
						     + ((i_129_ & 0xff00ff)
							* i_128_))
						    & ~0xff00ff)
						   + ((((i_126_ & 0xff00)
							* i_127_)
						       + ((i_129_ & 0xff00)
							  * i_128_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_130_
						= (((i_126_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_131_
						= (((i_126_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_132_
						= (((i_126_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_126_ = (i_130_ | i_131_
						      | i_132_) >>> 8;
					    int i_133_ = is_115_[i_114_];
					    is_115_[i_114_]
						= (((((i_126_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_133_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_126_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_133_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_134_
						= (((i_126_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_135_
						= (((i_126_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_136_
						= (((i_126_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_115_[i_114_] = (i_134_ | i_135_
							       | i_136_) >>> 8;
					}
				    }
				} else if (i_116_ == 2) {
				    int i_137_ = anIntArray6449[i_113_];
				    if (i_137_ != 0) {
					int i_138_
					    = (((i_137_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_139_
					    = (((i_137_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_115_[i_114_++]
					    = (((i_138_ | i_139_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_117_ == 2) {
				if (i_116_ == 0) {
				    int i_140_ = anIntArray6449[i_113_];
				    if (i_140_ != 0) {
					int i_141_ = is_115_[i_114_];
					int i_142_ = i_140_ + i_141_;
					int i_143_ = ((i_140_ & 0xff00ff)
						      + (i_141_ & 0xff00ff));
					i_141_
					    = ((i_143_ & 0x1000100)
					       + (i_142_ - i_143_ & 0x10000));
					is_115_[i_114_]
					    = (i_142_ - i_141_
					       | i_141_ - (i_141_ >>> 8));
				    }
				} else if (i_116_ == 1) {
				    int i_144_ = anIntArray6449[i_113_];
				    if (i_144_ != 0) {
					int i_145_
					    = (((i_144_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_146_
					    = (((i_144_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_147_
					    = (((i_144_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_144_
					    = (i_145_ | i_146_ | i_147_) >>> 8;
					int i_148_ = is_115_[i_114_];
					int i_149_ = i_144_ + i_148_;
					int i_150_ = ((i_144_ & 0xff00ff)
						      + (i_148_ & 0xff00ff));
					i_148_
					    = ((i_150_ & 0x1000100)
					       + (i_149_ - i_150_ & 0x10000));
					is_115_[i_114_]
					    = (i_149_ - i_148_
					       | i_148_ - (i_148_ >>> 8));
				    }
				} else if (i_116_ == 2) {
				    int i_151_ = anIntArray6449[i_113_];
				    if (i_151_ != 0) {
					int i_152_
					    = (((i_151_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_153_
					    = (((i_151_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_151_ = (((i_152_ | i_153_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_154_ = is_115_[i_114_];
					int i_155_ = i_151_ + i_154_;
					int i_156_ = ((i_151_ & 0xff00ff)
						      + (i_154_ & 0xff00ff));
					i_154_
					    = ((i_156_ & 0x1000100)
					       + (i_155_ - i_156_ & 0x10000));
					is_115_[i_114_]
					    = (i_155_ - i_154_
					       | i_154_ - (i_154_ >>> 8));
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
		    int i_157_ = Class152_Sub1.anInt4725;
		    int i_158_ = Class152_Sub1.anInt4723;
		    int i_159_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_160_ = Class152_Sub1.anInt4739;
		    if (i_158_ >= 0 && i_158_ - (anInt4729 << 12) < 0) {
			int i_161_;
			if ((i_161_ = i_159_ - (anInt4735 << 12)) >= 0) {
			    i_161_ = ((Class152_Sub1.anInt4731 - i_161_)
				      / Class152_Sub1.anInt4731);
			    i_160_ += i_161_;
			    i_159_ += Class152_Sub1.anInt4731 * i_161_;
			    i_157_ += i_161_;
			}
			if ((i_161_ = ((i_159_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_160_)
			    i_160_ = i_161_;
			for (/**/; i_160_ < 0; i_160_++) {
			    int i_162_
				= (i_159_ >> 12) * anInt4729 + (i_158_ >> 12);
			    int i_163_ = i_157_++;
			    int[] is_164_ = is;
			    int i_165_ = arg0;
			    int i_166_ = arg1;
			    if (i_166_ == 0) {
				if (i_165_ == 0)
				    is_164_[i_163_] = anIntArray6449[i_162_];
				else if (i_165_ == 1) {
				    int i_167_ = anIntArray6449[i_162_++];
				    int i_168_ = (((i_167_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_169_ = (((i_167_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_170_ = (((i_167_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_164_[i_163_]
					= (i_168_ | i_169_ | i_170_) >>> 8;
				} else if (i_165_ == 2) {
				    int i_171_ = anIntArray6449[i_162_];
				    int i_172_ = (((i_171_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_173_ = (((i_171_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_164_[i_163_]
					= (((i_172_ | i_173_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_166_ == 1) {
				if (i_165_ == 0) {
				    int i_174_ = anIntArray6449[i_162_];
				    if (i_174_ != 0)
					is_164_[i_163_] = i_174_;
				} else if (i_165_ == 1) {
				    int i_175_ = anIntArray6449[i_162_];
				    if (i_175_ != 0) {
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_176_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_177_ = 256 - i_176_;
					    int i_178_ = is_164_[i_163_];
					    is_164_[i_163_]
						= (((((i_175_ & 0xff00ff)
						      * i_176_)
						     + ((i_178_ & 0xff00ff)
							* i_177_))
						    & ~0xff00ff)
						   + ((((i_175_ & 0xff00)
							* i_176_)
						       + ((i_178_ & 0xff00)
							  * i_177_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_179_
						= (((i_175_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_180_
						= (((i_175_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_181_
						= (((i_175_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_175_ = (i_179_ | i_180_
						      | i_181_) >>> 8;
					    int i_182_ = is_164_[i_163_];
					    is_164_[i_163_]
						= (((((i_175_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_182_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_175_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_182_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_183_
						= (((i_175_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_184_
						= (((i_175_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_185_
						= (((i_175_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_164_[i_163_] = (i_183_ | i_184_
							       | i_185_) >>> 8;
					}
				    }
				} else if (i_165_ == 2) {
				    int i_186_ = anIntArray6449[i_162_];
				    if (i_186_ != 0) {
					int i_187_
					    = (((i_186_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_188_
					    = (((i_186_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_164_[i_163_++]
					    = (((i_187_ | i_188_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_166_ == 2) {
				if (i_165_ == 0) {
				    int i_189_ = anIntArray6449[i_162_];
				    if (i_189_ != 0) {
					int i_190_ = is_164_[i_163_];
					int i_191_ = i_189_ + i_190_;
					int i_192_ = ((i_189_ & 0xff00ff)
						      + (i_190_ & 0xff00ff));
					i_190_
					    = ((i_192_ & 0x1000100)
					       + (i_191_ - i_192_ & 0x10000));
					is_164_[i_163_]
					    = (i_191_ - i_190_
					       | i_190_ - (i_190_ >>> 8));
				    }
				} else if (i_165_ == 1) {
				    int i_193_ = anIntArray6449[i_162_];
				    if (i_193_ != 0) {
					int i_194_
					    = (((i_193_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_195_
					    = (((i_193_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_196_
					    = (((i_193_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_193_
					    = (i_194_ | i_195_ | i_196_) >>> 8;
					int i_197_ = is_164_[i_163_];
					int i_198_ = i_193_ + i_197_;
					int i_199_ = ((i_193_ & 0xff00ff)
						      + (i_197_ & 0xff00ff));
					i_197_
					    = ((i_199_ & 0x1000100)
					       + (i_198_ - i_199_ & 0x10000));
					is_164_[i_163_]
					    = (i_198_ - i_197_
					       | i_197_ - (i_197_ >>> 8));
				    }
				} else if (i_165_ == 2) {
				    int i_200_ = anIntArray6449[i_162_];
				    if (i_200_ != 0) {
					int i_201_
					    = (((i_200_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_202_
					    = (((i_200_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_200_ = (((i_201_ | i_202_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_203_ = is_164_[i_163_];
					int i_204_ = i_200_ + i_203_;
					int i_205_ = ((i_200_ & 0xff00ff)
						      + (i_203_ & 0xff00ff));
					i_203_
					    = ((i_205_ & 0x1000100)
					       + (i_204_ - i_205_ & 0x10000));
					is_164_[i_163_]
					    = (i_204_ - i_203_
					       | i_203_ - (i_203_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_159_ += Class152_Sub1.anInt4731;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_206_ = Class152_Sub1.anInt4725;
		    int i_207_ = Class152_Sub1.anInt4723;
		    int i_208_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_209_ = Class152_Sub1.anInt4739;
		    if (i_207_ >= 0 && i_207_ - (anInt4729 << 12) < 0) {
			if (i_208_ < 0) {
			    int i_210_
				= ((Class152_Sub1.anInt4731 - 1 - i_208_)
				   / Class152_Sub1.anInt4731);
			    i_209_ += i_210_;
			    i_208_ += Class152_Sub1.anInt4731 * i_210_;
			    i_206_ += i_210_;
			}
			int i_211_;
			if ((i_211_ = ((1 + i_208_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_209_)
			    i_209_ = i_211_;
			for (/**/; i_209_ < 0; i_209_++) {
			    int i_212_
				= (i_208_ >> 12) * anInt4729 + (i_207_ >> 12);
			    int i_213_ = i_206_++;
			    int[] is_214_ = is;
			    int i_215_ = arg0;
			    int i_216_ = arg1;
			    if (i_216_ == 0) {
				if (i_215_ == 0)
				    is_214_[i_213_] = anIntArray6449[i_212_];
				else if (i_215_ == 1) {
				    int i_217_ = anIntArray6449[i_212_++];
				    int i_218_ = (((i_217_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_219_ = (((i_217_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_220_ = (((i_217_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_214_[i_213_]
					= (i_218_ | i_219_ | i_220_) >>> 8;
				} else if (i_215_ == 2) {
				    int i_221_ = anIntArray6449[i_212_];
				    int i_222_ = (((i_221_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_223_ = (((i_221_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_214_[i_213_]
					= (((i_222_ | i_223_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_216_ == 1) {
				if (i_215_ == 0) {
				    int i_224_ = anIntArray6449[i_212_];
				    if (i_224_ != 0)
					is_214_[i_213_] = i_224_;
				} else if (i_215_ == 1) {
				    int i_225_ = anIntArray6449[i_212_];
				    if (i_225_ != 0) {
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_226_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_227_ = 256 - i_226_;
					    int i_228_ = is_214_[i_213_];
					    is_214_[i_213_]
						= (((((i_225_ & 0xff00ff)
						      * i_226_)
						     + ((i_228_ & 0xff00ff)
							* i_227_))
						    & ~0xff00ff)
						   + ((((i_225_ & 0xff00)
							* i_226_)
						       + ((i_228_ & 0xff00)
							  * i_227_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_229_
						= (((i_225_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_230_
						= (((i_225_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_231_
						= (((i_225_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_225_ = (i_229_ | i_230_
						      | i_231_) >>> 8;
					    int i_232_ = is_214_[i_213_];
					    is_214_[i_213_]
						= (((((i_225_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_232_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_225_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_232_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_233_
						= (((i_225_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_234_
						= (((i_225_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_235_
						= (((i_225_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_214_[i_213_] = (i_233_ | i_234_
							       | i_235_) >>> 8;
					}
				    }
				} else if (i_215_ == 2) {
				    int i_236_ = anIntArray6449[i_212_];
				    if (i_236_ != 0) {
					int i_237_
					    = (((i_236_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_238_
					    = (((i_236_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_214_[i_213_++]
					    = (((i_237_ | i_238_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_216_ == 2) {
				if (i_215_ == 0) {
				    int i_239_ = anIntArray6449[i_212_];
				    if (i_239_ != 0) {
					int i_240_ = is_214_[i_213_];
					int i_241_ = i_239_ + i_240_;
					int i_242_ = ((i_239_ & 0xff00ff)
						      + (i_240_ & 0xff00ff));
					i_240_
					    = ((i_242_ & 0x1000100)
					       + (i_241_ - i_242_ & 0x10000));
					is_214_[i_213_]
					    = (i_241_ - i_240_
					       | i_240_ - (i_240_ >>> 8));
				    }
				} else if (i_215_ == 1) {
				    int i_243_ = anIntArray6449[i_212_];
				    if (i_243_ != 0) {
					int i_244_
					    = (((i_243_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_245_
					    = (((i_243_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_246_
					    = (((i_243_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_243_
					    = (i_244_ | i_245_ | i_246_) >>> 8;
					int i_247_ = is_214_[i_213_];
					int i_248_ = i_243_ + i_247_;
					int i_249_ = ((i_243_ & 0xff00ff)
						      + (i_247_ & 0xff00ff));
					i_247_
					    = ((i_249_ & 0x1000100)
					       + (i_248_ - i_249_ & 0x10000));
					is_214_[i_213_]
					    = (i_248_ - i_247_
					       | i_247_ - (i_247_ >>> 8));
				    }
				} else if (i_215_ == 2) {
				    int i_250_ = anIntArray6449[i_212_];
				    if (i_250_ != 0) {
					int i_251_
					    = (((i_250_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_252_
					    = (((i_250_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_250_ = (((i_251_ | i_252_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_253_ = is_214_[i_213_];
					int i_254_ = i_250_ + i_253_;
					int i_255_ = ((i_250_ & 0xff00ff)
						      + (i_253_ & 0xff00ff));
					i_253_
					    = ((i_255_ & 0x1000100)
					       + (i_254_ - i_255_ & 0x10000));
					is_214_[i_213_]
					    = (i_254_ - i_253_
					       | i_253_ - (i_253_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_208_ += Class152_Sub1.anInt4731;
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
		    int i_256_ = Class152_Sub1.anInt4725;
		    int i_257_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_258_ = Class152_Sub1.anInt4741;
		    int i_259_ = Class152_Sub1.anInt4739;
		    if (i_258_ >= 0 && i_258_ - (anInt4735 << 12) < 0) {
			int i_260_;
			if ((i_260_ = i_257_ - (anInt4729 << 12)) >= 0) {
			    i_260_ = ((Class152_Sub1.anInt4718 - i_260_)
				      / Class152_Sub1.anInt4718);
			    i_259_ += i_260_;
			    i_257_ += Class152_Sub1.anInt4718 * i_260_;
			    i_256_ += i_260_;
			}
			if ((i_260_ = ((i_257_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_259_)
			    i_259_ = i_260_;
			for (/**/; i_259_ < 0; i_259_++) {
			    int i_261_
				= (i_258_ >> 12) * anInt4729 + (i_257_ >> 12);
			    int i_262_ = i_256_++;
			    int[] is_263_ = is;
			    int i_264_ = arg0;
			    int i_265_ = arg1;
			    if (i_265_ == 0) {
				if (i_264_ == 0)
				    is_263_[i_262_] = anIntArray6449[i_261_];
				else if (i_264_ == 1) {
				    int i_266_ = anIntArray6449[i_261_++];
				    int i_267_ = (((i_266_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_268_ = (((i_266_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_269_ = (((i_266_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_263_[i_262_]
					= (i_267_ | i_268_ | i_269_) >>> 8;
				} else if (i_264_ == 2) {
				    int i_270_ = anIntArray6449[i_261_];
				    int i_271_ = (((i_270_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_272_ = (((i_270_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_263_[i_262_]
					= (((i_271_ | i_272_) >>> 8)
					   + Class152_Sub1.anInt4722);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_265_ == 1) {
				if (i_264_ == 0) {
				    int i_273_ = anIntArray6449[i_261_];
				    if (i_273_ != 0)
					is_263_[i_262_] = i_273_;
				} else if (i_264_ == 1) {
				    int i_274_ = anIntArray6449[i_261_];
				    if (i_274_ != 0) {
					if ((Class152_Sub1.anInt4726
					     & 0xffffff)
					    == 16777215) {
					    int i_275_
						= (Class152_Sub1.anInt4726
						   >>> 24);
					    int i_276_ = 256 - i_275_;
					    int i_277_ = is_263_[i_262_];
					    is_263_[i_262_]
						= (((((i_274_ & 0xff00ff)
						      * i_275_)
						     + ((i_277_ & 0xff00ff)
							* i_276_))
						    & ~0xff00ff)
						   + ((((i_274_ & 0xff00)
							* i_275_)
						       + ((i_277_ & 0xff00)
							  * i_276_))
						      & 0xff0000)) >> 8;
					} else if (Class152_Sub1.anInt4711
						   != 255) {
					    int i_278_
						= (((i_274_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_279_
						= (((i_274_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_280_
						= (((i_274_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    i_274_ = (i_278_ | i_279_
						      | i_280_) >>> 8;
					    int i_281_ = is_263_[i_262_];
					    is_263_[i_262_]
						= (((((i_274_ & 0xff00ff)
						      * (Class152_Sub1
							 .anInt4711))
						     + ((i_281_ & 0xff00ff)
							* (Class152_Sub1
							   .anInt4727)))
						    & ~0xff00ff)
						   + ((((i_274_ & 0xff00)
							* (Class152_Sub1
							   .anInt4711))
						       + ((i_281_ & 0xff00)
							  * (Class152_Sub1
							     .anInt4727)))
						      & 0xff0000)) >> 8;
					} else {
					    int i_282_
						= (((i_274_ & 0xff0000)
						    * Class152_Sub1.anInt4714)
						   & ~0xffffff);
					    int i_283_
						= (((i_274_ & 0xff00)
						    * Class152_Sub1.anInt4742)
						   & 0xff0000);
					    int i_284_
						= (((i_274_ & 0xff)
						    * Class152_Sub1.anInt4724)
						   & 0xff00);
					    is_263_[i_262_] = (i_282_ | i_283_
							       | i_284_) >>> 8;
					}
				    }
				} else if (i_264_ == 2) {
				    int i_285_ = anIntArray6449[i_261_];
				    if (i_285_ != 0) {
					int i_286_
					    = (((i_285_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_287_
					    = (((i_285_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					is_263_[i_262_++]
					    = (((i_286_ | i_287_) >>> 8)
					       + Class152_Sub1.anInt4722);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_265_ == 2) {
				if (i_264_ == 0) {
				    int i_288_ = anIntArray6449[i_261_];
				    if (i_288_ != 0) {
					int i_289_ = is_263_[i_262_];
					int i_290_ = i_288_ + i_289_;
					int i_291_ = ((i_288_ & 0xff00ff)
						      + (i_289_ & 0xff00ff));
					i_289_
					    = ((i_291_ & 0x1000100)
					       + (i_290_ - i_291_ & 0x10000));
					is_263_[i_262_]
					    = (i_290_ - i_289_
					       | i_289_ - (i_289_ >>> 8));
				    }
				} else if (i_264_ == 1) {
				    int i_292_ = anIntArray6449[i_261_];
				    if (i_292_ != 0) {
					int i_293_
					    = (((i_292_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_294_
					    = (((i_292_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_295_
					    = (((i_292_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_292_
					    = (i_293_ | i_294_ | i_295_) >>> 8;
					int i_296_ = is_263_[i_262_];
					int i_297_ = i_292_ + i_296_;
					int i_298_ = ((i_292_ & 0xff00ff)
						      + (i_296_ & 0xff00ff));
					i_296_
					    = ((i_298_ & 0x1000100)
					       + (i_297_ - i_298_ & 0x10000));
					is_263_[i_262_]
					    = (i_297_ - i_296_
					       | i_296_ - (i_296_ >>> 8));
				    }
				} else if (i_264_ == 2) {
				    int i_299_ = anIntArray6449[i_261_];
				    if (i_299_ != 0) {
					int i_300_
					    = (((i_299_ & 0xff00ff)
						* Class152_Sub1.anInt4711)
					       & ~0xff00ff);
					int i_301_
					    = (((i_299_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       & 0xff0000);
					i_299_ = (((i_300_ | i_301_) >>> 8)
						  + Class152_Sub1.anInt4722);
					int i_302_ = is_263_[i_262_];
					int i_303_ = i_299_ + i_302_;
					int i_304_ = ((i_299_ & 0xff00ff)
						      + (i_302_ & 0xff00ff));
					i_302_
					    = ((i_304_ & 0x1000100)
					       + (i_303_ - i_304_ & 0x10000));
					is_263_[i_262_]
					    = (i_303_ - i_302_
					       | i_302_ - (i_302_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_257_ += Class152_Sub1.anInt4718;
			}
		    }
		    i++;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_305_ = Class152_Sub1.anInt4725;
		    int i_306_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_307_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_308_ = Class152_Sub1.anInt4739;
		    int i_309_;
		    if ((i_309_ = i_306_ - (anInt4729 << 12)) >= 0) {
			i_309_ = ((Class152_Sub1.anInt4718 - i_309_)
				  / Class152_Sub1.anInt4718);
			i_308_ += i_309_;
			i_306_ += Class152_Sub1.anInt4718 * i_309_;
			i_307_ += Class152_Sub1.anInt4731 * i_309_;
			i_305_ += i_309_;
		    }
		    if ((i_309_ = ((i_306_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_308_)
			i_308_ = i_309_;
		    if ((i_309_ = i_307_ - (anInt4735 << 12)) >= 0) {
			i_309_ = ((Class152_Sub1.anInt4731 - i_309_)
				  / Class152_Sub1.anInt4731);
			i_308_ += i_309_;
			i_306_ += Class152_Sub1.anInt4718 * i_309_;
			i_307_ += Class152_Sub1.anInt4731 * i_309_;
			i_305_ += i_309_;
		    }
		    if ((i_309_ = ((i_307_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_308_)
			i_308_ = i_309_;
		    for (/**/; i_308_ < 0; i_308_++) {
			int i_310_
			    = (i_307_ >> 12) * anInt4729 + (i_306_ >> 12);
			int i_311_ = i_305_++;
			int[] is_312_ = is;
			int i_313_ = arg0;
			int i_314_ = arg1;
			if (i_314_ == 0) {
			    if (i_313_ == 0)
				is_312_[i_311_] = anIntArray6449[i_310_];
			    else if (i_313_ == 1) {
				int i_315_ = anIntArray6449[i_310_++];
				int i_316_ = (((i_315_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_317_ = (((i_315_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_318_ = (((i_315_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_312_[i_311_]
				    = (i_316_ | i_317_ | i_318_) >>> 8;
			    } else if (i_313_ == 2) {
				int i_319_ = anIntArray6449[i_310_];
				int i_320_ = (((i_319_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_321_ = (((i_319_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_312_[i_311_] = (((i_320_ | i_321_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_314_ == 1) {
			    if (i_313_ == 0) {
				int i_322_ = anIntArray6449[i_310_];
				if (i_322_ != 0)
				    is_312_[i_311_] = i_322_;
			    } else if (i_313_ == 1) {
				int i_323_ = anIntArray6449[i_310_];
				if (i_323_ != 0) {
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_324_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_325_ = 256 - i_324_;
					int i_326_ = is_312_[i_311_];
					is_312_[i_311_]
					    = ((((i_323_ & 0xff00ff) * i_324_
						 + ((i_326_ & 0xff00ff)
						    * i_325_))
						& ~0xff00ff)
					       + (((i_323_ & 0xff00) * i_324_
						   + ((i_326_ & 0xff00)
						      * i_325_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_327_
					    = (((i_323_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_328_
					    = (((i_323_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_329_
					    = (((i_323_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_323_
					    = (i_327_ | i_328_ | i_329_) >>> 8;
					int i_330_ = is_312_[i_311_];
					is_312_[i_311_]
					    = (((((i_323_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_330_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_323_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_330_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_331_
					    = (((i_323_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_332_
					    = (((i_323_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_333_
					    = (((i_323_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_312_[i_311_]
					    = (i_331_ | i_332_ | i_333_) >>> 8;
				    }
				}
			    } else if (i_313_ == 2) {
				int i_334_ = anIntArray6449[i_310_];
				if (i_334_ != 0) {
				    int i_335_ = (((i_334_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_336_ = (((i_334_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_312_[i_311_++]
					= (((i_335_ | i_336_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_314_ == 2) {
			    if (i_313_ == 0) {
				int i_337_ = anIntArray6449[i_310_];
				if (i_337_ != 0) {
				    int i_338_ = is_312_[i_311_];
				    int i_339_ = i_337_ + i_338_;
				    int i_340_ = ((i_337_ & 0xff00ff)
						  + (i_338_ & 0xff00ff));
				    i_338_ = ((i_340_ & 0x1000100)
					      + (i_339_ - i_340_ & 0x10000));
				    is_312_[i_311_]
					= i_339_ - i_338_ | i_338_ - (i_338_
								      >>> 8);
				}
			    } else if (i_313_ == 1) {
				int i_341_ = anIntArray6449[i_310_];
				if (i_341_ != 0) {
				    int i_342_ = (((i_341_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_343_ = (((i_341_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_344_ = (((i_341_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_341_ = (i_342_ | i_343_ | i_344_) >>> 8;
				    int i_345_ = is_312_[i_311_];
				    int i_346_ = i_341_ + i_345_;
				    int i_347_ = ((i_341_ & 0xff00ff)
						  + (i_345_ & 0xff00ff));
				    i_345_ = ((i_347_ & 0x1000100)
					      + (i_346_ - i_347_ & 0x10000));
				    is_312_[i_311_]
					= i_346_ - i_345_ | i_345_ - (i_345_
								      >>> 8);
				}
			    } else if (i_313_ == 2) {
				int i_348_ = anIntArray6449[i_310_];
				if (i_348_ != 0) {
				    int i_349_ = (((i_348_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_350_ = (((i_348_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_348_ = (((i_349_ | i_350_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_351_ = is_312_[i_311_];
				    int i_352_ = i_348_ + i_351_;
				    int i_353_ = ((i_348_ & 0xff00ff)
						  + (i_351_ & 0xff00ff));
				    i_351_ = ((i_353_ & 0x1000100)
					      + (i_352_ - i_353_ & 0x10000));
				    is_312_[i_311_]
					= i_352_ - i_351_ | i_351_ - (i_351_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_306_ += Class152_Sub1.anInt4718;
			i_307_ += Class152_Sub1.anInt4731;
		    }
		    i++;
		    Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		    Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_354_ = Class152_Sub1.anInt4725;
		    int i_355_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_356_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_357_ = Class152_Sub1.anInt4739;
		    int i_358_;
		    if ((i_358_ = i_355_ - (anInt4729 << 12)) >= 0) {
			i_358_ = ((Class152_Sub1.anInt4718 - i_358_)
				  / Class152_Sub1.anInt4718);
			i_357_ += i_358_;
			i_355_ += Class152_Sub1.anInt4718 * i_358_;
			i_356_ += Class152_Sub1.anInt4731 * i_358_;
			i_354_ += i_358_;
		    }
		    if ((i_358_ = ((i_355_ - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_357_)
			i_357_ = i_358_;
		    if (i_356_ < 0) {
			i_358_ = ((Class152_Sub1.anInt4731 - 1 - i_356_)
				  / Class152_Sub1.anInt4731);
			i_357_ += i_358_;
			i_355_ += Class152_Sub1.anInt4718 * i_358_;
			i_356_ += Class152_Sub1.anInt4731 * i_358_;
			i_354_ += i_358_;
		    }
		    if ((i_358_ = ((1 + i_356_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_357_)
			i_357_ = i_358_;
		    for (/**/; i_357_ < 0; i_357_++) {
			int i_359_
			    = (i_356_ >> 12) * anInt4729 + (i_355_ >> 12);
			int i_360_ = i_354_++;
			int[] is_361_ = is;
			int i_362_ = arg0;
			int i_363_ = arg1;
			if (i_363_ == 0) {
			    if (i_362_ == 0)
				is_361_[i_360_] = anIntArray6449[i_359_];
			    else if (i_362_ == 1) {
				int i_364_ = anIntArray6449[i_359_++];
				int i_365_ = (((i_364_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_366_ = (((i_364_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_367_ = (((i_364_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_361_[i_360_]
				    = (i_365_ | i_366_ | i_367_) >>> 8;
			    } else if (i_362_ == 2) {
				int i_368_ = anIntArray6449[i_359_];
				int i_369_ = (((i_368_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_370_ = (((i_368_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_361_[i_360_] = (((i_369_ | i_370_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_363_ == 1) {
			    if (i_362_ == 0) {
				int i_371_ = anIntArray6449[i_359_];
				if (i_371_ != 0)
				    is_361_[i_360_] = i_371_;
			    } else if (i_362_ == 1) {
				int i_372_ = anIntArray6449[i_359_];
				if (i_372_ != 0) {
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_373_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_374_ = 256 - i_373_;
					int i_375_ = is_361_[i_360_];
					is_361_[i_360_]
					    = ((((i_372_ & 0xff00ff) * i_373_
						 + ((i_375_ & 0xff00ff)
						    * i_374_))
						& ~0xff00ff)
					       + (((i_372_ & 0xff00) * i_373_
						   + ((i_375_ & 0xff00)
						      * i_374_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_376_
					    = (((i_372_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_377_
					    = (((i_372_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_378_
					    = (((i_372_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_372_
					    = (i_376_ | i_377_ | i_378_) >>> 8;
					int i_379_ = is_361_[i_360_];
					is_361_[i_360_]
					    = (((((i_372_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_379_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_372_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_379_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_380_
					    = (((i_372_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_381_
					    = (((i_372_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_382_
					    = (((i_372_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_361_[i_360_]
					    = (i_380_ | i_381_ | i_382_) >>> 8;
				    }
				}
			    } else if (i_362_ == 2) {
				int i_383_ = anIntArray6449[i_359_];
				if (i_383_ != 0) {
				    int i_384_ = (((i_383_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_385_ = (((i_383_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_361_[i_360_++]
					= (((i_384_ | i_385_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_363_ == 2) {
			    if (i_362_ == 0) {
				int i_386_ = anIntArray6449[i_359_];
				if (i_386_ != 0) {
				    int i_387_ = is_361_[i_360_];
				    int i_388_ = i_386_ + i_387_;
				    int i_389_ = ((i_386_ & 0xff00ff)
						  + (i_387_ & 0xff00ff));
				    i_387_ = ((i_389_ & 0x1000100)
					      + (i_388_ - i_389_ & 0x10000));
				    is_361_[i_360_]
					= i_388_ - i_387_ | i_387_ - (i_387_
								      >>> 8);
				}
			    } else if (i_362_ == 1) {
				int i_390_ = anIntArray6449[i_359_];
				if (i_390_ != 0) {
				    int i_391_ = (((i_390_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_392_ = (((i_390_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_393_ = (((i_390_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_390_ = (i_391_ | i_392_ | i_393_) >>> 8;
				    int i_394_ = is_361_[i_360_];
				    int i_395_ = i_390_ + i_394_;
				    int i_396_ = ((i_390_ & 0xff00ff)
						  + (i_394_ & 0xff00ff));
				    i_394_ = ((i_396_ & 0x1000100)
					      + (i_395_ - i_396_ & 0x10000));
				    is_361_[i_360_]
					= i_395_ - i_394_ | i_394_ - (i_394_
								      >>> 8);
				}
			    } else if (i_362_ == 2) {
				int i_397_ = anIntArray6449[i_359_];
				if (i_397_ != 0) {
				    int i_398_ = (((i_397_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_399_ = (((i_397_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_397_ = (((i_398_ | i_399_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_400_ = is_361_[i_360_];
				    int i_401_ = i_397_ + i_400_;
				    int i_402_ = ((i_397_ & 0xff00ff)
						  + (i_400_ & 0xff00ff));
				    i_400_ = ((i_402_ & 0x1000100)
					      + (i_401_ - i_402_ & 0x10000));
				    is_361_[i_360_]
					= i_401_ - i_400_ | i_400_ - (i_400_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_355_ += Class152_Sub1.anInt4718;
			i_356_ += Class152_Sub1.anInt4731;
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
		int i_403_ = Class152_Sub1.anInt4725;
		int i_404_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_405_ = Class152_Sub1.anInt4741;
		int i_406_ = Class152_Sub1.anInt4739;
		if (i_405_ >= 0 && i_405_ - (anInt4735 << 12) < 0) {
		    if (i_404_ < 0) {
			int i_407_ = ((Class152_Sub1.anInt4718 - 1 - i_404_)
				      / Class152_Sub1.anInt4718);
			i_406_ += i_407_;
			i_404_ += Class152_Sub1.anInt4718 * i_407_;
			i_403_ += i_407_;
		    }
		    int i_408_;
		    if ((i_408_ = ((1 + i_404_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_406_)
			i_406_ = i_408_;
		    for (/**/; i_406_ < 0; i_406_++) {
			int i_409_
			    = (i_405_ >> 12) * anInt4729 + (i_404_ >> 12);
			int i_410_ = i_403_++;
			int[] is_411_ = is;
			int i_412_ = arg0;
			int i_413_ = arg1;
			if (i_413_ == 0) {
			    if (i_412_ == 0)
				is_411_[i_410_] = anIntArray6449[i_409_];
			    else if (i_412_ == 1) {
				int i_414_ = anIntArray6449[i_409_++];
				int i_415_ = (((i_414_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_416_ = (((i_414_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_417_ = (((i_414_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				is_411_[i_410_]
				    = (i_415_ | i_416_ | i_417_) >>> 8;
			    } else if (i_412_ == 2) {
				int i_418_ = anIntArray6449[i_409_];
				int i_419_ = (((i_418_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_420_ = (((i_418_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_411_[i_410_] = (((i_419_ | i_420_) >>> 8)
						   + Class152_Sub1.anInt4722);
			    } else
				throw new IllegalArgumentException();
			} else if (i_413_ == 1) {
			    if (i_412_ == 0) {
				int i_421_ = anIntArray6449[i_409_];
				if (i_421_ != 0)
				    is_411_[i_410_] = i_421_;
			    } else if (i_412_ == 1) {
				int i_422_ = anIntArray6449[i_409_];
				if (i_422_ != 0) {
				    if ((Class152_Sub1.anInt4726 & 0xffffff)
					== 16777215) {
					int i_423_
					    = Class152_Sub1.anInt4726 >>> 24;
					int i_424_ = 256 - i_423_;
					int i_425_ = is_411_[i_410_];
					is_411_[i_410_]
					    = ((((i_422_ & 0xff00ff) * i_423_
						 + ((i_425_ & 0xff00ff)
						    * i_424_))
						& ~0xff00ff)
					       + (((i_422_ & 0xff00) * i_423_
						   + ((i_425_ & 0xff00)
						      * i_424_))
						  & 0xff0000)) >> 8;
				    } else if (Class152_Sub1.anInt4711
					       != 255) {
					int i_426_
					    = (((i_422_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_427_
					    = (((i_422_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_428_
					    = (((i_422_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					i_422_
					    = (i_426_ | i_427_ | i_428_) >>> 8;
					int i_429_ = is_411_[i_410_];
					is_411_[i_410_]
					    = (((((i_422_ & 0xff00ff)
						  * Class152_Sub1.anInt4711)
						 + ((i_429_ & 0xff00ff)
						    * Class152_Sub1.anInt4727))
						& ~0xff00ff)
					       + ((((i_422_ & 0xff00)
						    * Class152_Sub1.anInt4711)
						   + ((i_429_ & 0xff00)
						      * (Class152_Sub1
							 .anInt4727)))
						  & 0xff0000)) >> 8;
				    } else {
					int i_430_
					    = (((i_422_ & 0xff0000)
						* Class152_Sub1.anInt4714)
					       & ~0xffffff);
					int i_431_
					    = (((i_422_ & 0xff00)
						* Class152_Sub1.anInt4742)
					       & 0xff0000);
					int i_432_
					    = (((i_422_ & 0xff)
						* Class152_Sub1.anInt4724)
					       & 0xff00);
					is_411_[i_410_]
					    = (i_430_ | i_431_ | i_432_) >>> 8;
				    }
				}
			    } else if (i_412_ == 2) {
				int i_433_ = anIntArray6449[i_409_];
				if (i_433_ != 0) {
				    int i_434_ = (((i_433_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_435_ = (((i_433_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    is_411_[i_410_++]
					= (((i_434_ | i_435_) >>> 8)
					   + Class152_Sub1.anInt4722);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_413_ == 2) {
			    if (i_412_ == 0) {
				int i_436_ = anIntArray6449[i_409_];
				if (i_436_ != 0) {
				    int i_437_ = is_411_[i_410_];
				    int i_438_ = i_436_ + i_437_;
				    int i_439_ = ((i_436_ & 0xff00ff)
						  + (i_437_ & 0xff00ff));
				    i_437_ = ((i_439_ & 0x1000100)
					      + (i_438_ - i_439_ & 0x10000));
				    is_411_[i_410_]
					= i_438_ - i_437_ | i_437_ - (i_437_
								      >>> 8);
				}
			    } else if (i_412_ == 1) {
				int i_440_ = anIntArray6449[i_409_];
				if (i_440_ != 0) {
				    int i_441_ = (((i_440_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_442_ = (((i_440_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_443_ = (((i_440_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_440_ = (i_441_ | i_442_ | i_443_) >>> 8;
				    int i_444_ = is_411_[i_410_];
				    int i_445_ = i_440_ + i_444_;
				    int i_446_ = ((i_440_ & 0xff00ff)
						  + (i_444_ & 0xff00ff));
				    i_444_ = ((i_446_ & 0x1000100)
					      + (i_445_ - i_446_ & 0x10000));
				    is_411_[i_410_]
					= i_445_ - i_444_ | i_444_ - (i_444_
								      >>> 8);
				}
			    } else if (i_412_ == 2) {
				int i_447_ = anIntArray6449[i_409_];
				if (i_447_ != 0) {
				    int i_448_ = (((i_447_ & 0xff00ff)
						   * Class152_Sub1.anInt4711)
						  & ~0xff00ff);
				    int i_449_ = (((i_447_ & 0xff00)
						   * Class152_Sub1.anInt4711)
						  & 0xff0000);
				    i_447_ = (((i_448_ | i_449_) >>> 8)
					      + Class152_Sub1.anInt4722);
				    int i_450_ = is_411_[i_410_];
				    int i_451_ = i_447_ + i_450_;
				    int i_452_ = ((i_447_ & 0xff00ff)
						  + (i_450_ & 0xff00ff));
				    i_450_ = ((i_452_ & 0x1000100)
					      + (i_451_ - i_452_ & 0x10000));
				    is_411_[i_410_]
					= i_451_ - i_450_ | i_450_ - (i_450_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_404_ += Class152_Sub1.anInt4718;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else if (Class152_Sub1.anInt4731 < 0) {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_453_ = Class152_Sub1.anInt4725;
		int i_454_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_455_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_456_ = Class152_Sub1.anInt4739;
		if (i_454_ < 0) {
		    int i_457_ = ((Class152_Sub1.anInt4718 - 1 - i_454_)
				  / Class152_Sub1.anInt4718);
		    i_456_ += i_457_;
		    i_454_ += Class152_Sub1.anInt4718 * i_457_;
		    i_455_ += Class152_Sub1.anInt4731 * i_457_;
		    i_453_ += i_457_;
		}
		int i_458_;
		if ((i_458_
		     = (1 + i_454_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_456_)
		    i_456_ = i_458_;
		if ((i_458_ = i_455_ - (anInt4735 << 12)) >= 0) {
		    i_458_ = ((Class152_Sub1.anInt4731 - i_458_)
			      / Class152_Sub1.anInt4731);
		    i_456_ += i_458_;
		    i_454_ += Class152_Sub1.anInt4718 * i_458_;
		    i_455_ += Class152_Sub1.anInt4731 * i_458_;
		    i_453_ += i_458_;
		}
		if ((i_458_ = ((i_455_ - Class152_Sub1.anInt4731)
			       / Class152_Sub1.anInt4731))
		    > i_456_)
		    i_456_ = i_458_;
		for (/**/; i_456_ < 0; i_456_++) {
		    int i_459_ = (i_455_ >> 12) * anInt4729 + (i_454_ >> 12);
		    int i_460_ = i_453_++;
		    int[] is_461_ = is;
		    int i_462_ = arg0;
		    int i_463_ = arg1;
		    if (i_463_ == 0) {
			if (i_462_ == 0)
			    is_461_[i_460_] = anIntArray6449[i_459_];
			else if (i_462_ == 1) {
			    int i_464_ = anIntArray6449[i_459_++];
			    int i_465_ = (((i_464_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_466_
				= ((i_464_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_467_
				= ((i_464_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_461_[i_460_] = (i_465_ | i_466_ | i_467_) >>> 8;
			} else if (i_462_ == 2) {
			    int i_468_ = anIntArray6449[i_459_];
			    int i_469_ = (((i_468_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_470_
				= ((i_468_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_461_[i_460_] = (((i_469_ | i_470_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_463_ == 1) {
			if (i_462_ == 0) {
			    int i_471_ = anIntArray6449[i_459_];
			    if (i_471_ != 0)
				is_461_[i_460_] = i_471_;
			} else if (i_462_ == 1) {
			    int i_472_ = anIntArray6449[i_459_];
			    if (i_472_ != 0) {
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_473_
					= Class152_Sub1.anInt4726 >>> 24;
				    int i_474_ = 256 - i_473_;
				    int i_475_ = is_461_[i_460_];
				    is_461_[i_460_]
					= ((((i_472_ & 0xff00ff) * i_473_
					     + (i_475_ & 0xff00ff) * i_474_)
					    & ~0xff00ff)
					   + (((i_472_ & 0xff00) * i_473_
					       + (i_475_ & 0xff00) * i_474_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_476_ = (((i_472_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_477_ = (((i_472_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_478_ = (((i_472_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_472_ = (i_476_ | i_477_ | i_478_) >>> 8;
				    int i_479_ = is_461_[i_460_];
				    is_461_[i_460_]
					= (((((i_472_ & 0xff00ff)
					      * Class152_Sub1.anInt4711)
					     + ((i_479_ & 0xff00ff)
						* Class152_Sub1.anInt4727))
					    & ~0xff00ff)
					   + ((((i_472_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       + ((i_479_ & 0xff00)
						  * Class152_Sub1.anInt4727))
					      & 0xff0000)) >> 8;
				} else {
				    int i_480_ = (((i_472_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_481_ = (((i_472_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_482_ = (((i_472_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_461_[i_460_]
					= (i_480_ | i_481_ | i_482_) >>> 8;
				}
			    }
			} else if (i_462_ == 2) {
			    int i_483_ = anIntArray6449[i_459_];
			    if (i_483_ != 0) {
				int i_484_ = (((i_483_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_485_ = (((i_483_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_461_[i_460_++]
				    = (((i_484_ | i_485_) >>> 8)
				       + Class152_Sub1.anInt4722);
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_463_ == 2) {
			if (i_462_ == 0) {
			    int i_486_ = anIntArray6449[i_459_];
			    if (i_486_ != 0) {
				int i_487_ = is_461_[i_460_];
				int i_488_ = i_486_ + i_487_;
				int i_489_ = ((i_486_ & 0xff00ff)
					      + (i_487_ & 0xff00ff));
				i_487_
				    = (i_489_ & 0x1000100) + (i_488_ - i_489_
							      & 0x10000);
				is_461_[i_460_]
				    = i_488_ - i_487_ | i_487_ - (i_487_
								  >>> 8);
			    }
			} else if (i_462_ == 1) {
			    int i_490_ = anIntArray6449[i_459_];
			    if (i_490_ != 0) {
				int i_491_ = (((i_490_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_492_ = (((i_490_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_493_ = (((i_490_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_490_ = (i_491_ | i_492_ | i_493_) >>> 8;
				int i_494_ = is_461_[i_460_];
				int i_495_ = i_490_ + i_494_;
				int i_496_ = ((i_490_ & 0xff00ff)
					      + (i_494_ & 0xff00ff));
				i_494_
				    = (i_496_ & 0x1000100) + (i_495_ - i_496_
							      & 0x10000);
				is_461_[i_460_]
				    = i_495_ - i_494_ | i_494_ - (i_494_
								  >>> 8);
			    }
			} else if (i_462_ == 2) {
			    int i_497_ = anIntArray6449[i_459_];
			    if (i_497_ != 0) {
				int i_498_ = (((i_497_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_499_ = (((i_497_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_497_ = (((i_498_ | i_499_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_500_ = is_461_[i_460_];
				int i_501_ = i_497_ + i_500_;
				int i_502_ = ((i_497_ & 0xff00ff)
					      + (i_500_ & 0xff00ff));
				i_500_
				    = (i_502_ & 0x1000100) + (i_501_ - i_502_
							      & 0x10000);
				is_461_[i_460_]
				    = i_501_ - i_500_ | i_500_ - (i_500_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_454_ += Class152_Sub1.anInt4718;
		    i_455_ += Class152_Sub1.anInt4731;
		}
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	} else {
	    for (int i = Class152_Sub1.anInt4719; i < 0; i++) {
		int i_503_ = Class152_Sub1.anInt4725;
		int i_504_ = Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		int i_505_ = Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		int i_506_ = Class152_Sub1.anInt4739;
		if (i_504_ < 0) {
		    int i_507_ = ((Class152_Sub1.anInt4718 - 1 - i_504_)
				  / Class152_Sub1.anInt4718);
		    i_506_ += i_507_;
		    i_504_ += Class152_Sub1.anInt4718 * i_507_;
		    i_505_ += Class152_Sub1.anInt4731 * i_507_;
		    i_503_ += i_507_;
		}
		int i_508_;
		if ((i_508_
		     = (1 + i_504_ - (anInt4729 << 12)
			- Class152_Sub1.anInt4718) / Class152_Sub1.anInt4718)
		    > i_506_)
		    i_506_ = i_508_;
		if (i_505_ < 0) {
		    i_508_ = ((Class152_Sub1.anInt4731 - 1 - i_505_)
			      / Class152_Sub1.anInt4731);
		    i_506_ += i_508_;
		    i_504_ += Class152_Sub1.anInt4718 * i_508_;
		    i_505_ += Class152_Sub1.anInt4731 * i_508_;
		    i_503_ += i_508_;
		}
		if ((i_508_
		     = (1 + i_505_ - (anInt4735 << 12)
			- Class152_Sub1.anInt4731) / Class152_Sub1.anInt4731)
		    > i_506_)
		    i_506_ = i_508_;
		for (/**/; i_506_ < 0; i_506_++) {
		    int i_509_ = (i_505_ >> 12) * anInt4729 + (i_504_ >> 12);
		    int i_510_ = i_503_++;
		    int[] is_511_ = is;
		    int i_512_ = arg0;
		    int i_513_ = arg1;
		    if (i_513_ == 0) {
			if (i_512_ == 0)
			    is_511_[i_510_] = anIntArray6449[i_509_];
			else if (i_512_ == 1) {
			    int i_514_ = anIntArray6449[i_509_++];
			    int i_515_ = (((i_514_ & 0xff0000)
					   * Class152_Sub1.anInt4714)
					  & ~0xffffff);
			    int i_516_
				= ((i_514_ & 0xff00) * Class152_Sub1.anInt4742
				   & 0xff0000);
			    int i_517_
				= ((i_514_ & 0xff) * Class152_Sub1.anInt4724
				   & 0xff00);
			    is_511_[i_510_] = (i_515_ | i_516_ | i_517_) >>> 8;
			} else if (i_512_ == 2) {
			    int i_518_ = anIntArray6449[i_509_];
			    int i_519_ = (((i_518_ & 0xff00ff)
					   * Class152_Sub1.anInt4711)
					  & ~0xff00ff);
			    int i_520_
				= ((i_518_ & 0xff00) * Class152_Sub1.anInt4711
				   & 0xff0000);
			    is_511_[i_510_] = (((i_519_ | i_520_) >>> 8)
					       + Class152_Sub1.anInt4722);
			} else
			    throw new IllegalArgumentException();
		    } else if (i_513_ == 1) {
			if (i_512_ == 0) {
			    int i_521_ = anIntArray6449[i_509_];
			    if (i_521_ != 0)
				is_511_[i_510_] = i_521_;
			} else if (i_512_ == 1) {
			    int i_522_ = anIntArray6449[i_509_];
			    if (i_522_ != 0) {
				if ((Class152_Sub1.anInt4726 & 0xffffff)
				    == 16777215) {
				    int i_523_
					= Class152_Sub1.anInt4726 >>> 24;
				    int i_524_ = 256 - i_523_;
				    int i_525_ = is_511_[i_510_];
				    is_511_[i_510_]
					= ((((i_522_ & 0xff00ff) * i_523_
					     + (i_525_ & 0xff00ff) * i_524_)
					    & ~0xff00ff)
					   + (((i_522_ & 0xff00) * i_523_
					       + (i_525_ & 0xff00) * i_524_)
					      & 0xff0000)) >> 8;
				} else if (Class152_Sub1.anInt4711 != 255) {
				    int i_526_ = (((i_522_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_527_ = (((i_522_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_528_ = (((i_522_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    i_522_ = (i_526_ | i_527_ | i_528_) >>> 8;
				    int i_529_ = is_511_[i_510_];
				    is_511_[i_510_]
					= (((((i_522_ & 0xff00ff)
					      * Class152_Sub1.anInt4711)
					     + ((i_529_ & 0xff00ff)
						* Class152_Sub1.anInt4727))
					    & ~0xff00ff)
					   + ((((i_522_ & 0xff00)
						* Class152_Sub1.anInt4711)
					       + ((i_529_ & 0xff00)
						  * Class152_Sub1.anInt4727))
					      & 0xff0000)) >> 8;
				} else {
				    int i_530_ = (((i_522_ & 0xff0000)
						   * Class152_Sub1.anInt4714)
						  & ~0xffffff);
				    int i_531_ = (((i_522_ & 0xff00)
						   * Class152_Sub1.anInt4742)
						  & 0xff0000);
				    int i_532_ = (((i_522_ & 0xff)
						   * Class152_Sub1.anInt4724)
						  & 0xff00);
				    is_511_[i_510_]
					= (i_530_ | i_531_ | i_532_) >>> 8;
				}
			    }
			} else if (i_512_ == 2) {
			    int i_533_ = anIntArray6449[i_509_];
			    if (i_533_ != 0) {
				int i_534_ = (((i_533_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_535_ = (((i_533_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				is_511_[i_510_++]
				    = (((i_534_ | i_535_) >>> 8)
				       + Class152_Sub1.anInt4722);
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_513_ == 2) {
			if (i_512_ == 0) {
			    int i_536_ = anIntArray6449[i_509_];
			    if (i_536_ != 0) {
				int i_537_ = is_511_[i_510_];
				int i_538_ = i_536_ + i_537_;
				int i_539_ = ((i_536_ & 0xff00ff)
					      + (i_537_ & 0xff00ff));
				i_537_
				    = (i_539_ & 0x1000100) + (i_538_ - i_539_
							      & 0x10000);
				is_511_[i_510_]
				    = i_538_ - i_537_ | i_537_ - (i_537_
								  >>> 8);
			    }
			} else if (i_512_ == 1) {
			    int i_540_ = anIntArray6449[i_509_];
			    if (i_540_ != 0) {
				int i_541_ = (((i_540_ & 0xff0000)
					       * Class152_Sub1.anInt4714)
					      & ~0xffffff);
				int i_542_ = (((i_540_ & 0xff00)
					       * Class152_Sub1.anInt4742)
					      & 0xff0000);
				int i_543_ = (((i_540_ & 0xff)
					       * Class152_Sub1.anInt4724)
					      & 0xff00);
				i_540_ = (i_541_ | i_542_ | i_543_) >>> 8;
				int i_544_ = is_511_[i_510_];
				int i_545_ = i_540_ + i_544_;
				int i_546_ = ((i_540_ & 0xff00ff)
					      + (i_544_ & 0xff00ff));
				i_544_
				    = (i_546_ & 0x1000100) + (i_545_ - i_546_
							      & 0x10000);
				is_511_[i_510_]
				    = i_545_ - i_544_ | i_544_ - (i_544_
								  >>> 8);
			    }
			} else if (i_512_ == 2) {
			    int i_547_ = anIntArray6449[i_509_];
			    if (i_547_ != 0) {
				int i_548_ = (((i_547_ & 0xff00ff)
					       * Class152_Sub1.anInt4711)
					      & ~0xff00ff);
				int i_549_ = (((i_547_ & 0xff00)
					       * Class152_Sub1.anInt4711)
					      & 0xff0000);
				i_547_ = (((i_548_ | i_549_) >>> 8)
					  + Class152_Sub1.anInt4722);
				int i_550_ = is_511_[i_510_];
				int i_551_ = i_547_ + i_550_;
				int i_552_ = ((i_547_ & 0xff00ff)
					      + (i_550_ & 0xff00ff));
				i_550_
				    = (i_552_ & 0x1000100) + (i_551_ - i_552_
							      & 0x10000);
				is_511_[i_510_]
				    = i_551_ - i_550_ | i_550_ - (i_550_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_504_ += Class152_Sub1.anInt4718;
		    i_505_ += Class152_Sub1.anInt4731;
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
		    int i_553_ = i + arg3;
		    if (i_553_ >= 0) {
			if (i_553_ >= arg0.length)
			    break;
			int i_554_ = Class152_Sub1.anInt4725;
			int i_555_ = Class152_Sub1.anInt4723;
			int i_556_ = Class152_Sub1.anInt4741;
			int i_557_ = Class152_Sub1.anInt4739;
			if (i_555_ >= 0 && i_556_ >= 0
			    && i_555_ - (anInt4729 << 12) < 0
			    && i_556_ - (anInt4735 << 12) < 0) {
			    int i_558_ = arg0[i_553_] - arg2;
			    int i_559_ = -arg1[i_553_];
			    int i_560_
				= i_558_ - (i_554_ - Class152_Sub1.anInt4725);
			    if (i_560_ > 0) {
				i_554_ += i_560_;
				i_557_ += i_560_;
				i_555_ += Class152_Sub1.anInt4718 * i_560_;
				i_556_ += Class152_Sub1.anInt4731 * i_560_;
			    } else
				i_559_ -= i_560_;
			    if (i_557_ < i_559_)
				i_557_ = i_559_;
			    for (/**/; i_557_ < 0; i_557_++) {
				int i_561_
				    = (anIntArray6449
				       [(i_556_ >> 12) * anInt4729 + (i_555_
								      >> 12)]);
				if (i_561_ != 0)
				    is[i_554_++] = i_561_;
				else
				    i_554_++;
			    }
			}
		    }
		    i++;
		    Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
		}
	    } else if (Class152_Sub1.anInt4731 < 0) {
		int i = Class152_Sub1.anInt4719;
		while (i < 0) {
		    int i_562_ = i + arg3;
		    if (i_562_ >= 0) {
			if (i_562_ >= arg0.length)
			    break;
			int i_563_ = Class152_Sub1.anInt4725;
			int i_564_ = Class152_Sub1.anInt4723;
			int i_565_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_566_ = Class152_Sub1.anInt4739;
			if (i_564_ >= 0 && i_564_ - (anInt4729 << 12) < 0) {
			    int i_567_;
			    if ((i_567_ = i_565_ - (anInt4735 << 12)) >= 0) {
				i_567_ = ((Class152_Sub1.anInt4731 - i_567_)
					  / Class152_Sub1.anInt4731);
				i_566_ += i_567_;
				i_565_ += Class152_Sub1.anInt4731 * i_567_;
				i_563_ += i_567_;
			    }
			    if ((i_567_ = ((i_565_ - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_566_)
				i_566_ = i_567_;
			    int i_568_ = arg0[i_562_] - arg2;
			    int i_569_ = -arg1[i_562_];
			    int i_570_
				= i_568_ - (i_563_ - Class152_Sub1.anInt4725);
			    if (i_570_ > 0) {
				i_563_ += i_570_;
				i_566_ += i_570_;
				i_564_ += Class152_Sub1.anInt4718 * i_570_;
				i_565_ += Class152_Sub1.anInt4731 * i_570_;
			    } else
				i_569_ -= i_570_;
			    if (i_566_ < i_569_)
				i_566_ = i_569_;
			    for (/**/; i_566_ < 0; i_566_++) {
				int i_571_
				    = (anIntArray6449
				       [(i_565_ >> 12) * anInt4729 + (i_564_
								      >> 12)]);
				if (i_571_ != 0)
				    is[i_563_++] = i_571_;
				else
				    i_563_++;
				i_565_ += Class152_Sub1.anInt4731;
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
		    int i_572_ = i + arg3;
		    if (i_572_ >= 0) {
			if (i_572_ >= arg0.length)
			    break;
			int i_573_ = Class152_Sub1.anInt4725;
			int i_574_ = Class152_Sub1.anInt4723;
			int i_575_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_576_ = Class152_Sub1.anInt4739;
			if (i_574_ >= 0 && i_574_ - (anInt4729 << 12) < 0) {
			    if (i_575_ < 0) {
				int i_577_
				    = ((Class152_Sub1.anInt4731 - 1 - i_575_)
				       / Class152_Sub1.anInt4731);
				i_576_ += i_577_;
				i_575_ += Class152_Sub1.anInt4731 * i_577_;
				i_573_ += i_577_;
			    }
			    int i_578_;
			    if ((i_578_ = ((1 + i_575_ - (anInt4735 << 12)
					    - Class152_Sub1.anInt4731)
					   / Class152_Sub1.anInt4731))
				> i_576_)
				i_576_ = i_578_;
			    int i_579_ = arg0[i_572_] - arg2;
			    int i_580_ = -arg1[i_572_];
			    int i_581_
				= i_579_ - (i_573_ - Class152_Sub1.anInt4725);
			    if (i_581_ > 0) {
				i_573_ += i_581_;
				i_576_ += i_581_;
				i_574_ += Class152_Sub1.anInt4718 * i_581_;
				i_575_ += Class152_Sub1.anInt4731 * i_581_;
			    } else
				i_580_ -= i_581_;
			    if (i_576_ < i_580_)
				i_576_ = i_580_;
			    for (/**/; i_576_ < 0; i_576_++) {
				int i_582_
				    = (anIntArray6449
				       [(i_575_ >> 12) * anInt4729 + (i_574_
								      >> 12)]);
				if (i_582_ != 0)
				    is[i_573_++] = i_582_;
				else
				    i_573_++;
				i_575_ += Class152_Sub1.anInt4731;
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
		    int i_583_ = i + arg3;
		    if (i_583_ >= 0) {
			if (i_583_ >= arg0.length)
			    break;
			int i_584_ = Class152_Sub1.anInt4725;
			int i_585_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_586_ = Class152_Sub1.anInt4741;
			int i_587_ = Class152_Sub1.anInt4739;
			if (i_586_ >= 0 && i_586_ - (anInt4735 << 12) < 0) {
			    int i_588_;
			    if ((i_588_ = i_585_ - (anInt4729 << 12)) >= 0) {
				i_588_ = ((Class152_Sub1.anInt4718 - i_588_)
					  / Class152_Sub1.anInt4718);
				i_587_ += i_588_;
				i_585_ += Class152_Sub1.anInt4718 * i_588_;
				i_584_ += i_588_;
			    }
			    if ((i_588_ = ((i_585_ - Class152_Sub1.anInt4718)
					   / Class152_Sub1.anInt4718))
				> i_587_)
				i_587_ = i_588_;
			    int i_589_ = arg0[i_583_] - arg2;
			    int i_590_ = -arg1[i_583_];
			    int i_591_
				= i_589_ - (i_584_ - Class152_Sub1.anInt4725);
			    if (i_591_ > 0) {
				i_584_ += i_591_;
				i_587_ += i_591_;
				i_585_ += Class152_Sub1.anInt4718 * i_591_;
				i_586_ += Class152_Sub1.anInt4731 * i_591_;
			    } else
				i_590_ -= i_591_;
			    if (i_587_ < i_590_)
				i_587_ = i_590_;
			    for (/**/; i_587_ < 0; i_587_++) {
				int i_592_
				    = (anIntArray6449
				       [(i_586_ >> 12) * anInt4729 + (i_585_
								      >> 12)]);
				if (i_592_ != 0)
				    is[i_584_++] = i_592_;
				else
				    i_584_++;
				i_585_ += Class152_Sub1.anInt4718;
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
		    int i_593_ = i + arg3;
		    if (i_593_ >= 0) {
			if (i_593_ >= arg0.length)
			    break;
			int i_594_ = Class152_Sub1.anInt4725;
			int i_595_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_596_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_597_ = Class152_Sub1.anInt4739;
			int i_598_;
			if ((i_598_ = i_595_ - (anInt4729 << 12)) >= 0) {
			    i_598_ = ((Class152_Sub1.anInt4718 - i_598_)
				      / Class152_Sub1.anInt4718);
			    i_597_ += i_598_;
			    i_595_ += Class152_Sub1.anInt4718 * i_598_;
			    i_596_ += Class152_Sub1.anInt4731 * i_598_;
			    i_594_ += i_598_;
			}
			if ((i_598_ = ((i_595_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_597_)
			    i_597_ = i_598_;
			if ((i_598_ = i_596_ - (anInt4735 << 12)) >= 0) {
			    i_598_ = ((Class152_Sub1.anInt4731 - i_598_)
				      / Class152_Sub1.anInt4731);
			    i_597_ += i_598_;
			    i_595_ += Class152_Sub1.anInt4718 * i_598_;
			    i_596_ += Class152_Sub1.anInt4731 * i_598_;
			    i_594_ += i_598_;
			}
			if ((i_598_ = ((i_596_ - Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_597_)
			    i_597_ = i_598_;
			int i_599_ = arg0[i_593_] - arg2;
			int i_600_ = -arg1[i_593_];
			int i_601_
			    = i_599_ - (i_594_ - Class152_Sub1.anInt4725);
			if (i_601_ > 0) {
			    i_594_ += i_601_;
			    i_597_ += i_601_;
			    i_595_ += Class152_Sub1.anInt4718 * i_601_;
			    i_596_ += Class152_Sub1.anInt4731 * i_601_;
			} else
			    i_600_ -= i_601_;
			if (i_597_ < i_600_)
			    i_597_ = i_600_;
			for (/**/; i_597_ < 0; i_597_++) {
			    int i_602_
				= (anIntArray6449
				   [(i_596_ >> 12) * anInt4729 + (i_595_
								  >> 12)]);
			    if (i_602_ != 0)
				is[i_594_++] = i_602_;
			    else
				i_594_++;
			    i_595_ += Class152_Sub1.anInt4718;
			    i_596_ += Class152_Sub1.anInt4731;
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
		    int i_603_ = i + arg3;
		    if (i_603_ >= 0) {
			if (i_603_ >= arg0.length)
			    break;
			int i_604_ = Class152_Sub1.anInt4725;
			int i_605_ = (Class152_Sub1.anInt4723
				      + Class152_Sub1.anInt4732);
			int i_606_ = (Class152_Sub1.anInt4741
				      + Class152_Sub1.anInt4713);
			int i_607_ = Class152_Sub1.anInt4739;
			int i_608_;
			if ((i_608_ = i_605_ - (anInt4729 << 12)) >= 0) {
			    i_608_ = ((Class152_Sub1.anInt4718 - i_608_)
				      / Class152_Sub1.anInt4718);
			    i_607_ += i_608_;
			    i_605_ += Class152_Sub1.anInt4718 * i_608_;
			    i_606_ += Class152_Sub1.anInt4731 * i_608_;
			    i_604_ += i_608_;
			}
			if ((i_608_ = ((i_605_ - Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_607_)
			    i_607_ = i_608_;
			if (i_606_ < 0) {
			    i_608_ = ((Class152_Sub1.anInt4731 - 1 - i_606_)
				      / Class152_Sub1.anInt4731);
			    i_607_ += i_608_;
			    i_605_ += Class152_Sub1.anInt4718 * i_608_;
			    i_606_ += Class152_Sub1.anInt4731 * i_608_;
			    i_604_ += i_608_;
			}
			if ((i_608_ = ((1 + i_606_ - (anInt4735 << 12)
					- Class152_Sub1.anInt4731)
				       / Class152_Sub1.anInt4731))
			    > i_607_)
			    i_607_ = i_608_;
			int i_609_ = arg0[i_603_] - arg2;
			int i_610_ = -arg1[i_603_];
			int i_611_
			    = i_609_ - (i_604_ - Class152_Sub1.anInt4725);
			if (i_611_ > 0) {
			    i_604_ += i_611_;
			    i_607_ += i_611_;
			    i_605_ += Class152_Sub1.anInt4718 * i_611_;
			    i_606_ += Class152_Sub1.anInt4731 * i_611_;
			} else
			    i_610_ -= i_611_;
			if (i_607_ < i_610_)
			    i_607_ = i_610_;
			for (/**/; i_607_ < 0; i_607_++) {
			    int i_612_
				= (anIntArray6449
				   [(i_606_ >> 12) * anInt4729 + (i_605_
								  >> 12)]);
			    if (i_612_ != 0)
				is[i_604_++] = i_612_;
			    else
				i_604_++;
			    i_605_ += Class152_Sub1.anInt4718;
			    i_606_ += Class152_Sub1.anInt4731;
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
		int i_613_ = i + arg3;
		if (i_613_ >= 0) {
		    if (i_613_ >= arg0.length)
			break;
		    int i_614_ = Class152_Sub1.anInt4725;
		    int i_615_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_616_ = Class152_Sub1.anInt4741;
		    int i_617_ = Class152_Sub1.anInt4739;
		    if (i_616_ >= 0 && i_616_ - (anInt4735 << 12) < 0) {
			if (i_615_ < 0) {
			    int i_618_
				= ((Class152_Sub1.anInt4718 - 1 - i_615_)
				   / Class152_Sub1.anInt4718);
			    i_617_ += i_618_;
			    i_615_ += Class152_Sub1.anInt4718 * i_618_;
			    i_614_ += i_618_;
			}
			int i_619_;
			if ((i_619_ = ((1 + i_615_ - (anInt4729 << 12)
					- Class152_Sub1.anInt4718)
				       / Class152_Sub1.anInt4718))
			    > i_617_)
			    i_617_ = i_619_;
			int i_620_ = arg0[i_613_] - arg2;
			int i_621_ = -arg1[i_613_];
			int i_622_
			    = i_620_ - (i_614_ - Class152_Sub1.anInt4725);
			if (i_622_ > 0) {
			    i_614_ += i_622_;
			    i_617_ += i_622_;
			    i_615_ += Class152_Sub1.anInt4718 * i_622_;
			    i_616_ += Class152_Sub1.anInt4731 * i_622_;
			} else
			    i_621_ -= i_622_;
			if (i_617_ < i_621_)
			    i_617_ = i_621_;
			for (/**/; i_617_ < 0; i_617_++) {
			    int i_623_
				= (anIntArray6449
				   [(i_616_ >> 12) * anInt4729 + (i_615_
								  >> 12)]);
			    if (i_623_ != 0)
				is[i_614_++] = i_623_;
			    else
				i_614_++;
			    i_615_ += Class152_Sub1.anInt4718;
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
		int i_624_ = i + arg3;
		if (i_624_ >= 0) {
		    if (i_624_ >= arg0.length)
			break;
		    int i_625_ = Class152_Sub1.anInt4725;
		    int i_626_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_627_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_628_ = Class152_Sub1.anInt4739;
		    if (i_626_ < 0) {
			int i_629_ = ((Class152_Sub1.anInt4718 - 1 - i_626_)
				      / Class152_Sub1.anInt4718);
			i_628_ += i_629_;
			i_626_ += Class152_Sub1.anInt4718 * i_629_;
			i_627_ += Class152_Sub1.anInt4731 * i_629_;
			i_625_ += i_629_;
		    }
		    int i_630_;
		    if ((i_630_ = ((1 + i_626_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_628_)
			i_628_ = i_630_;
		    if ((i_630_ = i_627_ - (anInt4735 << 12)) >= 0) {
			i_630_ = ((Class152_Sub1.anInt4731 - i_630_)
				  / Class152_Sub1.anInt4731);
			i_628_ += i_630_;
			i_626_ += Class152_Sub1.anInt4718 * i_630_;
			i_627_ += Class152_Sub1.anInt4731 * i_630_;
			i_625_ += i_630_;
		    }
		    if ((i_630_ = ((i_627_ - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_628_)
			i_628_ = i_630_;
		    int i_631_ = arg0[i_624_] - arg2;
		    int i_632_ = -arg1[i_624_];
		    int i_633_ = i_631_ - (i_625_ - Class152_Sub1.anInt4725);
		    if (i_633_ > 0) {
			i_625_ += i_633_;
			i_628_ += i_633_;
			i_626_ += Class152_Sub1.anInt4718 * i_633_;
			i_627_ += Class152_Sub1.anInt4731 * i_633_;
		    } else
			i_632_ -= i_633_;
		    if (i_628_ < i_632_)
			i_628_ = i_632_;
		    for (/**/; i_628_ < 0; i_628_++) {
			int i_634_
			    = (anIntArray6449
			       [(i_627_ >> 12) * anInt4729 + (i_626_ >> 12)]);
			if (i_634_ != 0)
			    is[i_625_++] = i_634_;
			else
			    i_625_++;
			i_626_ += Class152_Sub1.anInt4718;
			i_627_ += Class152_Sub1.anInt4731;
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
		int i_635_ = i + arg3;
		if (i_635_ >= 0) {
		    if (i_635_ >= arg0.length)
			break;
		    int i_636_ = Class152_Sub1.anInt4725;
		    int i_637_
			= Class152_Sub1.anInt4723 + Class152_Sub1.anInt4732;
		    int i_638_
			= Class152_Sub1.anInt4741 + Class152_Sub1.anInt4713;
		    int i_639_ = Class152_Sub1.anInt4739;
		    if (i_637_ < 0) {
			int i_640_ = ((Class152_Sub1.anInt4718 - 1 - i_637_)
				      / Class152_Sub1.anInt4718);
			i_639_ += i_640_;
			i_637_ += Class152_Sub1.anInt4718 * i_640_;
			i_638_ += Class152_Sub1.anInt4731 * i_640_;
			i_636_ += i_640_;
		    }
		    int i_641_;
		    if ((i_641_ = ((1 + i_637_ - (anInt4729 << 12)
				    - Class152_Sub1.anInt4718)
				   / Class152_Sub1.anInt4718))
			> i_639_)
			i_639_ = i_641_;
		    if (i_638_ < 0) {
			i_641_ = ((Class152_Sub1.anInt4731 - 1 - i_638_)
				  / Class152_Sub1.anInt4731);
			i_639_ += i_641_;
			i_637_ += Class152_Sub1.anInt4718 * i_641_;
			i_638_ += Class152_Sub1.anInt4731 * i_641_;
			i_636_ += i_641_;
		    }
		    if ((i_641_ = ((1 + i_638_ - (anInt4735 << 12)
				    - Class152_Sub1.anInt4731)
				   / Class152_Sub1.anInt4731))
			> i_639_)
			i_639_ = i_641_;
		    int i_642_ = arg0[i_635_] - arg2;
		    int i_643_ = -arg1[i_635_];
		    int i_644_ = i_642_ - (i_636_ - Class152_Sub1.anInt4725);
		    if (i_644_ > 0) {
			i_636_ += i_644_;
			i_639_ += i_644_;
			i_637_ += Class152_Sub1.anInt4718 * i_644_;
			i_638_ += Class152_Sub1.anInt4731 * i_644_;
		    } else
			i_643_ -= i_644_;
		    if (i_639_ < i_643_)
			i_639_ = i_643_;
		    for (/**/; i_639_ < 0; i_639_++) {
			int i_645_
			    = (anIntArray6449
			       [(i_638_ >> 12) * anInt4729 + (i_637_ >> 12)]);
			if (i_645_ != 0)
			    is[i_636_++] = i_645_;
			else
			    i_636_++;
			i_637_ += Class152_Sub1.anInt4718;
			i_638_ += Class152_Sub1.anInt4731;
		    }
		}
		i++;
		Class152_Sub1.anInt4723 += Class152_Sub1.anInt4712;
		Class152_Sub1.anInt4741 += Class152_Sub1.anInt4720;
		Class152_Sub1.anInt4725 += Class152_Sub1.anInt4738;
	    }
	}
    }
    
    public Class152_Sub1_Sub1(Class130_Sub1 arg0, int[] arg1, int arg2,
			      int arg3) {
	super(arg0, arg2, arg3);
	anIntArray6449 = arg1;
    }
    
    public void method2202(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	int i = aClass130_Sub1_4715.anInt4029;
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i_646_ = arg1 * i + arg0;
	int i_647_ = 0;
	int i_648_ = anInt4735;
	int i_649_ = anInt4729;
	int i_650_ = i - i_649_;
	int i_651_ = 0;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_652_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_648_ -= i_652_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i_647_ += i_652_ * i_649_;
	    i_646_ += i_652_ * i;
	}
	if (arg1 + i_648_ > aClass130_Sub1_4715.anInt4024)
	    i_648_ -= arg1 + i_648_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_653_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_649_ -= i_653_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i_647_ += i_653_;
	    i_646_ += i_653_;
	    i_651_ += i_653_;
	    i_650_ += i_653_;
	}
	if (arg0 + i_649_ > aClass130_Sub1_4715.anInt4067) {
	    int i_654_ = arg0 + i_649_ - aClass130_Sub1_4715.anInt4067;
	    i_649_ -= i_654_;
	    i_651_ += i_654_;
	    i_650_ += i_654_;
	}
	if (i_649_ > 0 && i_648_ > 0) {
	    int[] is = aClass130_Sub1_4715.anIntArray4026;
	    if (arg4 == 0) {
		if (arg2 == 0) {
		    for (int i_655_ = -i_648_; i_655_ < 0; i_655_++) {
			int i_656_ = i_646_ + i_649_ - 3;
			while (i_646_ < i_656_) {
			    is[i_646_++] = anIntArray6449[i_647_++];
			    is[i_646_++] = anIntArray6449[i_647_++];
			    is[i_646_++] = anIntArray6449[i_647_++];
			    is[i_646_++] = anIntArray6449[i_647_++];
			}
			i_656_ += 3;
			while (i_646_ < i_656_)
			    is[i_646_++] = anIntArray6449[i_647_++];
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_657_ = (arg3 & 0xff0000) >> 16;
		    int i_658_ = (arg3 & 0xff00) >> 8;
		    int i_659_ = arg3 & 0xff;
		    for (int i_660_ = -i_648_; i_660_ < 0; i_660_++) {
			for (int i_661_ = -i_649_; i_661_ < 0; i_661_++) {
			    int i_662_ = anIntArray6449[i_647_++];
			    int i_663_
				= (i_662_ & 0xff0000) * i_657_ & ~0xffffff;
			    int i_664_ = (i_662_ & 0xff00) * i_658_ & 0xff0000;
			    int i_665_ = (i_662_ & 0xff) * i_659_ & 0xff00;
			    is[i_646_++] = (i_663_ | i_664_ | i_665_) >>> 8;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_666_ = arg3 >>> 24;
		    int i_667_ = 256 - i_666_;
		    int i_668_ = (arg3 & 0xff00ff) * i_667_ & ~0xff00ff;
		    int i_669_ = (arg3 & 0xff00) * i_667_ & 0xff0000;
		    arg3 = (i_668_ | i_669_) >>> 8;
		    for (int i_670_ = -i_648_; i_670_ < 0; i_670_++) {
			for (int i_671_ = -i_649_; i_671_ < 0; i_671_++) {
			    int i_672_ = anIntArray6449[i_647_++];
			    i_668_ = (i_672_ & 0xff00ff) * i_666_ & ~0xff00ff;
			    i_669_ = (i_672_ & 0xff00) * i_666_ & 0xff0000;
			    is[i_646_++] = ((i_668_ | i_669_) >>> 8) + arg3;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 1) {
		if (arg2 == 0) {
		    for (int i_673_ = -i_648_; i_673_ < 0; i_673_++) {
			int i_674_ = i_646_ + i_649_ - 3;
			while (i_646_ < i_674_) {
			    int i_675_ = anIntArray6449[i_647_++];
			    if (i_675_ != 0)
				is[i_646_++] = i_675_;
			    else
				i_646_++;
			    i_675_ = anIntArray6449[i_647_++];
			    if (i_675_ != 0)
				is[i_646_++] = i_675_;
			    else
				i_646_++;
			    i_675_ = anIntArray6449[i_647_++];
			    if (i_675_ != 0)
				is[i_646_++] = i_675_;
			    else
				i_646_++;
			    i_675_ = anIntArray6449[i_647_++];
			    if (i_675_ != 0)
				is[i_646_++] = i_675_;
			    else
				i_646_++;
			}
			i_674_ += 3;
			while (i_646_ < i_674_) {
			    int i_676_ = anIntArray6449[i_647_++];
			    if (i_676_ != 0)
				is[i_646_++] = i_676_;
			    else
				i_646_++;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    if ((arg3 & 0xffffff) == 16777215) {
			int i_677_ = arg3 >>> 24;
			int i_678_ = 256 - i_677_;
			for (int i_679_ = -i_648_; i_679_ < 0; i_679_++) {
			    for (int i_680_ = -i_649_; i_680_ < 0; i_680_++) {
				int i_681_ = anIntArray6449[i_647_++];
				if (i_681_ != 0) {
				    int i_682_ = is[i_646_];
				    is[i_646_++]
					= ((((i_681_ & 0xff00ff) * i_677_
					     + (i_682_ & 0xff00ff) * i_678_)
					    & ~0xff00ff)
					   + (((i_681_ & 0xff00) * i_677_
					       + (i_682_ & 0xff00) * i_678_)
					      & 0xff0000)) >> 8;
				} else
				    i_646_++;
			    }
			    i_646_ += i_650_;
			    i_647_ += i_651_;
			}
		    } else {
			int i_683_ = (arg3 & 0xff0000) >> 16;
			int i_684_ = (arg3 & 0xff00) >> 8;
			int i_685_ = arg3 & 0xff;
			int i_686_ = arg3 >>> 24;
			int i_687_ = 256 - i_686_;
			for (int i_688_ = -i_648_; i_688_ < 0; i_688_++) {
			    for (int i_689_ = -i_649_; i_689_ < 0; i_689_++) {
				int i_690_ = anIntArray6449[i_647_++];
				if (i_690_ != 0) {
				    if (i_686_ != 255) {
					int i_691_
					    = ((i_690_ & 0xff0000) * i_683_
					       & ~0xffffff);
					int i_692_
					    = ((i_690_ & 0xff00) * i_684_
					       & 0xff0000);
					int i_693_ = ((i_690_ & 0xff) * i_685_
						      & 0xff00);
					i_690_
					    = (i_691_ | i_692_ | i_693_) >>> 8;
					int i_694_ = is[i_646_];
					is[i_646_++]
					    = ((((i_690_ & 0xff00ff) * i_686_
						 + ((i_694_ & 0xff00ff)
						    * i_687_))
						& ~0xff00ff)
					       + (((i_690_ & 0xff00) * i_686_
						   + ((i_694_ & 0xff00)
						      * i_687_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_695_
					    = ((i_690_ & 0xff0000) * i_683_
					       & ~0xffffff);
					int i_696_
					    = ((i_690_ & 0xff00) * i_684_
					       & 0xff0000);
					int i_697_ = ((i_690_ & 0xff) * i_685_
						      & 0xff00);
					is[i_646_++]
					    = (i_695_ | i_696_ | i_697_) >>> 8;
				    }
				} else
				    i_646_++;
			    }
			    i_646_ += i_650_;
			    i_647_ += i_651_;
			}
			return;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_698_ = arg3 >>> 24;
		    int i_699_ = 256 - i_698_;
		    int i_700_ = (arg3 & 0xff00ff) * i_699_ & ~0xff00ff;
		    int i_701_ = (arg3 & 0xff00) * i_699_ & 0xff0000;
		    arg3 = (i_700_ | i_701_) >>> 8;
		    for (int i_702_ = -i_648_; i_702_ < 0; i_702_++) {
			for (int i_703_ = -i_649_; i_703_ < 0; i_703_++) {
			    int i_704_ = anIntArray6449[i_647_++];
			    if (i_704_ != 0) {
				i_700_
				    = (i_704_ & 0xff00ff) * i_698_ & ~0xff00ff;
				i_701_ = (i_704_ & 0xff00) * i_698_ & 0xff0000;
				is[i_646_++]
				    = ((i_700_ | i_701_) >>> 8) + arg3;
			    } else
				i_646_++;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (arg4 == 2) {
		if (arg2 == 0) {
		    for (int i_705_ = -i_648_; i_705_ < 0; i_705_++) {
			for (int i_706_ = -i_649_; i_706_ < 0; i_706_++) {
			    int i_707_ = anIntArray6449[i_647_++];
			    if (i_707_ != 0) {
				int i_708_ = is[i_646_];
				int i_709_ = i_707_ + i_708_;
				int i_710_ = ((i_707_ & 0xff00ff)
					      + (i_708_ & 0xff00ff));
				i_708_
				    = (i_710_ & 0x1000100) + (i_709_ - i_710_
							      & 0x10000);
				is[i_646_++]
				    = i_709_ - i_708_ | i_708_ - (i_708_
								  >>> 8);
			    } else
				i_646_++;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		if (arg2 == 1) {
		    int i_711_ = (arg3 & 0xff0000) >> 16;
		    int i_712_ = (arg3 & 0xff00) >> 8;
		    int i_713_ = arg3 & 0xff;
		    for (int i_714_ = -i_648_; i_714_ < 0; i_714_++) {
			for (int i_715_ = -i_649_; i_715_ < 0; i_715_++) {
			    int i_716_ = anIntArray6449[i_647_++];
			    if (i_716_ != 0) {
				int i_717_
				    = (i_716_ & 0xff0000) * i_711_ & ~0xffffff;
				int i_718_
				    = (i_716_ & 0xff00) * i_712_ & 0xff0000;
				int i_719_ = (i_716_ & 0xff) * i_713_ & 0xff00;
				i_716_ = (i_717_ | i_718_ | i_719_) >>> 8;
				int i_720_ = is[i_646_];
				int i_721_ = i_716_ + i_720_;
				int i_722_ = ((i_716_ & 0xff00ff)
					      + (i_720_ & 0xff00ff));
				i_720_
				    = (i_722_ & 0x1000100) + (i_721_ - i_722_
							      & 0x10000);
				is[i_646_++]
				    = i_721_ - i_720_ | i_720_ - (i_720_
								  >>> 8);
			    } else
				i_646_++;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		if (arg2 == 2) {
		    int i_723_ = arg3 >>> 24;
		    int i_724_ = 256 - i_723_;
		    int i_725_ = (arg3 & 0xff00ff) * i_724_ & ~0xff00ff;
		    int i_726_ = (arg3 & 0xff00) * i_724_ & 0xff0000;
		    arg3 = (i_725_ | i_726_) >>> 8;
		    for (int i_727_ = -i_648_; i_727_ < 0; i_727_++) {
			for (int i_728_ = -i_649_; i_728_ < 0; i_728_++) {
			    int i_729_ = anIntArray6449[i_647_++];
			    if (i_729_ != 0) {
				i_725_
				    = (i_729_ & 0xff00ff) * i_723_ & ~0xff00ff;
				i_726_ = (i_729_ & 0xff00) * i_723_ & 0xff0000;
				i_729_ = ((i_725_ | i_726_) >>> 8) + arg3;
				int i_730_ = is[i_646_];
				int i_731_ = i_729_ + i_730_;
				int i_732_ = ((i_729_ & 0xff00ff)
					      + (i_730_ & 0xff00ff));
				i_730_
				    = (i_732_ & 0x1000100) + (i_731_ - i_732_
							      & 0x10000);
				is[i_646_++]
				    = i_731_ - i_730_ | i_730_ - (i_730_
								  >>> 8);
			    } else
				i_646_++;
			}
			i_646_ += i_650_;
			i_647_ += i_651_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    public Class152_Sub1_Sub1(Class130_Sub1 arg0, int[] arg1, int arg2,
			      int arg3, int arg4, int arg5) {
	super(arg0, arg4, arg5);
	anIntArray6449 = new int[arg4 * arg5];
	arg3 -= anInt4729;
	int i = 0;
	for (int i_733_ = 0; i_733_ < arg5; i_733_++) {
	    for (int i_734_ = 0; i_734_ < arg4; i_734_++) {
		int i_735_ = arg1[arg2++];
		if (i_735_ >>> 24 == 255) {
		    int i_736_ = i_735_ & 0xffffff;
		    if (i_736_ != 0)
			anIntArray6449[i++] = i_736_;
		    else
			anIntArray6449[i++] = 1;
		} else
		    anIntArray6449[i++] = 0;
	    }
	    arg2 += arg3;
	}
    }
    
    public void method2214(int arg0, int arg1, Class183 arg2, int arg3,
			   int arg4) {
	if (aClass130_Sub1_4715.method1272())
	    throw new IllegalStateException();
	arg0 += anInt4728;
	arg1 += anInt4736;
	int i = 0;
	int i_737_ = aClass130_Sub1_4715.anInt4029;
	int i_738_ = anInt4729;
	int i_739_ = anInt4735;
	int i_740_ = i_737_ - i_738_;
	int i_741_ = 0;
	int i_742_ = arg0 + arg1 * i_737_;
	if (arg1 < aClass130_Sub1_4715.anInt4061) {
	    int i_743_ = aClass130_Sub1_4715.anInt4061 - arg1;
	    i_739_ -= i_743_;
	    arg1 = aClass130_Sub1_4715.anInt4061;
	    i += i_743_ * i_738_;
	    i_742_ += i_743_ * i_737_;
	}
	if (arg1 + i_739_ > aClass130_Sub1_4715.anInt4024)
	    i_739_ -= arg1 + i_739_ - aClass130_Sub1_4715.anInt4024;
	if (arg0 < aClass130_Sub1_4715.anInt4066) {
	    int i_744_ = aClass130_Sub1_4715.anInt4066 - arg0;
	    i_738_ -= i_744_;
	    arg0 = aClass130_Sub1_4715.anInt4066;
	    i += i_744_;
	    i_742_ += i_744_;
	    i_741_ += i_744_;
	    i_740_ += i_744_;
	}
	if (arg0 + i_738_ > aClass130_Sub1_4715.anInt4067) {
	    int i_745_ = arg0 + i_738_ - aClass130_Sub1_4715.anInt4067;
	    i_738_ -= i_745_;
	    i_741_ += i_745_;
	    i_740_ += i_745_;
	}
	if (i_738_ > 0 && i_739_ > 0) {
	    Class183_Sub1 class183_sub1 = (Class183_Sub1) arg2;
	    int[] is = class183_sub1.anIntArray4954;
	    int[] is_746_ = class183_sub1.anIntArray4963;
	    int[] is_747_ = aClass130_Sub1_4715.anIntArray4026;
	    int i_748_ = arg1;
	    if (arg4 > i_748_) {
		i_748_ = arg4;
		i_742_ += (arg4 - arg1) * i_737_;
		i += (arg4 - arg1) * anInt4729;
	    }
	    int i_749_ = (arg4 + is.length < arg1 + i_739_ ? arg4 + is.length
			  : arg1 + i_739_);
	    for (int i_750_ = i_748_; i_750_ < i_749_; i_750_++) {
		int i_751_ = is[i_750_ - arg4] + arg3;
		int i_752_ = is_746_[i_750_ - arg4];
		int i_753_ = i_738_;
		if (arg0 > i_751_) {
		    int i_754_ = arg0 - i_751_;
		    if (i_754_ >= i_752_) {
			i += i_738_ + i_741_;
			i_742_ += i_738_ + i_740_;
			continue;
		    }
		    i_752_ -= i_754_;
		} else {
		    int i_755_ = i_751_ - arg0;
		    if (i_755_ >= i_738_) {
			i += i_738_ + i_741_;
			i_742_ += i_738_ + i_740_;
			continue;
		    }
		    i += i_755_;
		    i_753_ -= i_755_;
		    i_742_ += i_755_;
		}
		int i_756_ = 0;
		if (i_753_ < i_752_)
		    i_752_ = i_753_;
		else
		    i_756_ = i_753_ - i_752_;
		for (int i_757_ = -i_752_; i_757_ < 0; i_757_++) {
		    int i_758_ = anIntArray6449[i++];
		    if (i_758_ != 0)
			is_747_[i_742_++] = i_758_;
		    else
			i_742_++;
		}
		i += i_756_ + i_741_;
		i_742_ += i_756_ + i_740_;
	    }
	}
    }
    
    public void method2215(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	int[] is = aClass130_Sub1_4715.anIntArray4026;
	for (int i = 0; i < arg3; i++) {
	    int i_759_ = (arg1 + i) * anInt4729 + arg0;
	    int i_760_ = (arg5 + i) * aClass130_Sub1_4715.anInt4029 + arg4;
	    for (int i_761_ = 0; i_761_ < arg2; i_761_++)
		anIntArray6449[i_759_ + i_761_] = is[i_760_ + i_761_];
	}
    }
}
