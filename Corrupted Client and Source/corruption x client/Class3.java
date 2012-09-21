/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3
{
    public static Class211 aClass211_87 = new Class211();
    
    public static void method145(int[] arg0, int[] arg1, int[] arg2,
				 byte[] arg3, int arg4, int arg5, int arg6) {
	int i = 0;
	for (int i_0_ = arg4; i_0_ <= arg5; i_0_++) {
	    for (int i_1_ = 0; i_1_ < arg6; i_1_++) {
		if (arg3[i_1_] == i_0_) {
		    arg2[i] = i_1_;
		    i++;
		}
	    }
	}
	for (int i_2_ = 0; i_2_ < 23; i_2_++)
	    arg1[i_2_] = 0;
	for (int i_3_ = 0; i_3_ < arg6; i_3_++)
	    arg1[arg3[i_3_] + 1]++;
	for (int i_4_ = 1; i_4_ < 23; i_4_++)
	    arg1[i_4_] += arg1[i_4_ - 1];
	for (int i_5_ = 0; i_5_ < 23; i_5_++)
	    arg0[i_5_] = 0;
	int i_6_ = 0;
	for (int i_7_ = arg4; i_7_ <= arg5; i_7_++) {
	    i_6_ += arg1[i_7_ + 1] - arg1[i_7_];
	    arg0[i_7_] = i_6_ - 1;
	    i_6_ <<= 1;
	}
	for (int i_8_ = arg4 + 1; i_8_ <= arg5; i_8_++)
	    arg1[i_8_] = (arg0[i_8_ - 1] + 1 << 1) - arg1[i_8_];
    }
    
    public static int method146(byte[] arg0, int arg1, byte[] arg2, int arg3,
				int arg4) {
	synchronized (aClass211_87) {
	    aClass211_87.aByteArray3109 = arg2;
	    aClass211_87.anInt3074 = arg4;
	    aClass211_87.aByteArray3079 = arg0;
	    aClass211_87.anInt3100 = 0;
	    aClass211_87.anInt3093 = arg1;
	    aClass211_87.anInt3088 = 0;
	    aClass211_87.anInt3078 = 0;
	    aClass211_87.anInt3085 = 0;
	    aClass211_87.anInt3097 = 0;
	    method150(aClass211_87);
	    arg1 -= aClass211_87.anInt3093;
	    aClass211_87.aByteArray3109 = null;
	    aClass211_87.aByteArray3079 = null;
	    return arg1;
	}
    }
    
    public static byte method147(Class211 arg0) {
	return (byte) method152(8, arg0);
    }
    
    public static void method148() {
	aClass211_87 = null;
    }
    
    public static void method149(Class211 arg0) {
	arg0.anInt3073 = 0;
	for (int i = 0; i < 256; i++) {
	    if (arg0.aBooleanArray3103[i]) {
		arg0.aByteArray3107[arg0.anInt3073] = (byte) i;
		arg0.anInt3073++;
	    }
	}
    }
    
    public static void method150(Class211 arg0) {
	boolean bool = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	boolean bool_19_ = false;
	boolean bool_20_ = false;
	boolean bool_21_ = false;
	boolean bool_22_ = false;
	boolean bool_23_ = false;
	boolean bool_24_ = false;
	boolean bool_25_ = false;
	int i = 0;
	int[] is = null;
	int[] is_26_ = null;
	int[] is_27_ = null;
	arg0.anInt3096 = 1;
	if (Class131_Sub2_Sub16.anIntArray5786 == null)
	    Class131_Sub2_Sub16.anIntArray5786
		= new int[arg0.anInt3096 * 100000];
	boolean bool_28_ = true;
	while (bool_28_) {
	    byte i_29_ = method147(arg0);
	    if (i_29_ == 23)
		break;
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method147(arg0);
	    i_29_ = method153(arg0);
	    arg0.anInt3083 = 0;
	    int i_30_ = method147(arg0);
	    arg0.anInt3083 = arg0.anInt3083 << 8 | i_30_ & 0xff;
	    i_30_ = method147(arg0);
	    arg0.anInt3083 = arg0.anInt3083 << 8 | i_30_ & 0xff;
	    i_30_ = method147(arg0);
	    arg0.anInt3083 = arg0.anInt3083 << 8 | i_30_ & 0xff;
	    for (int i_31_ = 0; i_31_ < 16; i_31_++) {
		i_29_ = method153(arg0);
		if (i_29_ == 1)
		    arg0.aBooleanArray3072[i_31_] = true;
		else
		    arg0.aBooleanArray3072[i_31_] = false;
	    }
	    for (int i_32_ = 0; i_32_ < 256; i_32_++)
		arg0.aBooleanArray3103[i_32_] = false;
	    for (int i_33_ = 0; i_33_ < 16; i_33_++) {
		if (arg0.aBooleanArray3072[i_33_]) {
		    for (int i_34_ = 0; i_34_ < 16; i_34_++) {
			i_29_ = method153(arg0);
			if (i_29_ == 1)
			    arg0.aBooleanArray3103[i_33_ * 16 + i_34_] = true;
		    }
		}
	    }
	    method149(arg0);
	    int i_35_ = arg0.anInt3073 + 2;
	    int i_36_ = method152(3, arg0);
	    int i_37_ = method152(15, arg0);
	    for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
		int i_39_ = 0;
		for (;;) {
		    i_29_ = method153(arg0);
		    if (i_29_ == 0)
			break;
		    i_39_++;
		}
		arg0.aByteArray3094[i_38_] = (byte) i_39_;
	    }
	    byte[] is_40_ = new byte[6];
	    for (byte i_41_ = 0; i_41_ < i_36_; i_41_++)
		is_40_[i_41_] = i_41_;
	    for (int i_42_ = 0; i_42_ < i_37_; i_42_++) {
		byte i_43_ = arg0.aByteArray3094[i_42_];
		byte i_44_ = is_40_[i_43_];
		for (/**/; i_43_ > 0; i_43_--)
		    is_40_[i_43_] = is_40_[i_43_ - 1];
		is_40_[0] = i_44_;
		arg0.aByteArray3076[i_42_] = i_44_;
	    }
	    for (int i_45_ = 0; i_45_ < i_36_; i_45_++) {
		int i_46_ = method152(5, arg0);
		for (int i_47_ = 0; i_47_ < i_35_; i_47_++) {
		    for (;;) {
			i_29_ = method153(arg0);
			if (i_29_ == 0)
			    break;
			i_29_ = method153(arg0);
			if (i_29_ == 0)
			    i_46_++;
			else
			    i_46_--;
		    }
		    arg0.aByteArrayArray3098[i_45_][i_47_] = (byte) i_46_;
		}
	    }
	    for (int i_48_ = 0; i_48_ < i_36_; i_48_++) {
		int i_49_ = 32;
		byte i_50_ = 0;
		for (int i_51_ = 0; i_51_ < i_35_; i_51_++) {
		    if (arg0.aByteArrayArray3098[i_48_][i_51_] > i_50_)
			i_50_ = arg0.aByteArrayArray3098[i_48_][i_51_];
		    if (arg0.aByteArrayArray3098[i_48_][i_51_] < i_49_)
			i_49_ = arg0.aByteArrayArray3098[i_48_][i_51_];
		}
		method145(arg0.anIntArrayArray3095[i_48_],
			  arg0.anIntArrayArray3082[i_48_],
			  arg0.anIntArrayArray3099[i_48_],
			  arg0.aByteArrayArray3098[i_48_], i_49_, i_50_,
			  i_35_);
		arg0.anIntArray3090[i_48_] = i_49_;
	    }
	    int i_52_ = arg0.anInt3073 + 1;
	    int i_53_ = -1;
	    int i_54_ = 0;
	    for (int i_55_ = 0; i_55_ <= 255; i_55_++)
		arg0.anIntArray3075[i_55_] = 0;
	    int i_56_ = 4095;
	    for (int i_57_ = 15; i_57_ >= 0; i_57_--) {
		for (int i_58_ = 15; i_58_ >= 0; i_58_--) {
		    arg0.aByteArray3101[i_56_] = (byte) (i_57_ * 16 + i_58_);
		    i_56_--;
		}
		arg0.anIntArray3092[i_57_] = i_56_ + 1;
	    }
	    int i_59_ = 0;
	    if (i_54_ == 0) {
		i_53_++;
		i_54_ = 50;
		byte i_60_ = arg0.aByteArray3076[i_53_];
		i = arg0.anIntArray3090[i_60_];
		is = arg0.anIntArrayArray3095[i_60_];
		is_27_ = arg0.anIntArrayArray3099[i_60_];
		is_26_ = arg0.anIntArrayArray3082[i_60_];
	    }
	    i_54_--;
	    int i_61_ = i;
	    int i_62_;
	    int i_63_;
	    for (i_63_ = method152(i_61_, arg0); i_63_ > is[i_61_];
		 i_63_ = i_63_ << 1 | i_62_) {
		i_61_++;
		i_62_ = method153(arg0);
	    }
	    int i_64_ = is_27_[i_63_ - is_26_[i_61_]];
	    while (i_64_ != i_52_) {
		if (i_64_ == 0 || i_64_ == 1) {
		    int i_65_ = -1;
		    int i_66_ = 1;
		    do {
			if (i_64_ == 0)
			    i_65_ += i_66_;
			else if (i_64_ == 1)
			    i_65_ += 2 * i_66_;
			i_66_ *= 2;
			if (i_54_ == 0) {
			    i_53_++;
			    i_54_ = 50;
			    byte i_67_ = arg0.aByteArray3076[i_53_];
			    i = arg0.anIntArray3090[i_67_];
			    is = arg0.anIntArrayArray3095[i_67_];
			    is_27_ = arg0.anIntArrayArray3099[i_67_];
			    is_26_ = arg0.anIntArrayArray3082[i_67_];
			}
			i_54_--;
			i_61_ = i;
			for (i_63_ = method152(i_61_, arg0); i_63_ > is[i_61_];
			     i_63_ = i_63_ << 1 | i_62_) {
			    i_61_++;
			    i_62_ = method153(arg0);
			}
			i_64_ = is_27_[i_63_ - is_26_[i_61_]];
		    } while (i_64_ == 0 || i_64_ == 1);
		    i_65_++;
		    i_30_ = (arg0.aByteArray3107
			     [(arg0.aByteArray3101[arg0.anIntArray3092[0]]
			       & 0xff)]);
		    arg0.anIntArray3075[i_30_ & 0xff] += i_65_;
		    for (/**/; i_65_ > 0; i_65_--) {
			Class131_Sub2_Sub16.anIntArray5786[i_59_]
			    = i_30_ & 0xff;
			i_59_++;
		    }
		} else {
		    int i_68_ = i_64_ - 1;
		    if (i_68_ < 16) {
			int i_69_ = arg0.anIntArray3092[0];
			i_29_ = arg0.aByteArray3101[i_69_ + i_68_];
			for (/**/; i_68_ > 3; i_68_ -= 4) {
			    int i_70_ = i_69_ + i_68_;
			    arg0.aByteArray3101[i_70_]
				= arg0.aByteArray3101[i_70_ - 1];
			    arg0.aByteArray3101[i_70_ - 1]
				= arg0.aByteArray3101[i_70_ - 2];
			    arg0.aByteArray3101[i_70_ - 2]
				= arg0.aByteArray3101[i_70_ - 3];
			    arg0.aByteArray3101[i_70_ - 3]
				= arg0.aByteArray3101[i_70_ - 4];
			}
			for (/**/; i_68_ > 0; i_68_--)
			    arg0.aByteArray3101[i_69_ + i_68_]
				= arg0.aByteArray3101[i_69_ + i_68_ - 1];
			arg0.aByteArray3101[i_69_] = i_29_;
		    } else {
			int i_71_ = i_68_ / 16;
			int i_72_ = i_68_ % 16;
			int i_73_ = arg0.anIntArray3092[i_71_] + i_72_;
			i_29_ = arg0.aByteArray3101[i_73_];
			for (/**/; i_73_ > arg0.anIntArray3092[i_71_]; i_73_--)
			    arg0.aByteArray3101[i_73_]
				= arg0.aByteArray3101[i_73_ - 1];
			arg0.anIntArray3092[i_71_]++;
			for (/**/; i_71_ > 0; i_71_--) {
			    arg0.anIntArray3092[i_71_]--;
			    arg0.aByteArray3101[arg0.anIntArray3092[i_71_]]
				= (arg0.aByteArray3101
				   [arg0.anIntArray3092[i_71_ - 1] + 16 - 1]);
			}
			arg0.anIntArray3092[0]--;
			arg0.aByteArray3101[arg0.anIntArray3092[0]] = i_29_;
			if (arg0.anIntArray3092[0] == 0) {
			    int i_74_ = 4095;
			    for (int i_75_ = 15; i_75_ >= 0; i_75_--) {
				for (int i_76_ = 15; i_76_ >= 0; i_76_--) {
				    arg0.aByteArray3101[i_74_]
					= (arg0.aByteArray3101
					   [(arg0.anIntArray3092[i_75_]
					     + i_76_)]);
				    i_74_--;
				}
				arg0.anIntArray3092[i_75_] = i_74_ + 1;
			    }
			}
		    }
		    arg0.anIntArray3075[(arg0.aByteArray3107[i_29_ & 0xff]
					 & 0xff)]++;
		    Class131_Sub2_Sub16.anIntArray5786[i_59_]
			= arg0.aByteArray3107[i_29_ & 0xff] & 0xff;
		    i_59_++;
		    if (i_54_ == 0) {
			i_53_++;
			i_54_ = 50;
			byte i_77_ = arg0.aByteArray3076[i_53_];
			i = arg0.anIntArray3090[i_77_];
			is = arg0.anIntArrayArray3095[i_77_];
			is_27_ = arg0.anIntArrayArray3099[i_77_];
			is_26_ = arg0.anIntArrayArray3082[i_77_];
		    }
		    i_54_--;
		    i_61_ = i;
		    for (i_63_ = method152(i_61_, arg0); i_63_ > is[i_61_];
			 i_63_ = i_63_ << 1 | i_62_) {
			i_61_++;
			i_62_ = method153(arg0);
		    }
		    i_64_ = is_27_[i_63_ - is_26_[i_61_]];
		}
	    }
	    arg0.anInt3080 = 0;
	    arg0.aByte3108 = (byte) 0;
	    arg0.anIntArray3091[0] = 0;
	    for (int i_78_ = 1; i_78_ <= 256; i_78_++)
		arg0.anIntArray3091[i_78_] = arg0.anIntArray3075[i_78_ - 1];
	    for (int i_79_ = 1; i_79_ <= 256; i_79_++)
		arg0.anIntArray3091[i_79_] += arg0.anIntArray3091[i_79_ - 1];
	    for (int i_80_ = 0; i_80_ < i_59_; i_80_++) {
		i_30_ = (byte) (Class131_Sub2_Sub16.anIntArray5786[i_80_]
				& 0xff);
		Class131_Sub2_Sub16.anIntArray5786[(arg0.anIntArray3091
						    [i_30_ & 0xff])]
		    |= i_80_ << 8;
		arg0.anIntArray3091[i_30_ & 0xff]++;
	    }
	    arg0.anInt3106
		= Class131_Sub2_Sub16.anIntArray5786[arg0.anInt3083] >> 8;
	    arg0.anInt3071 = 0;
	    arg0.anInt3106
		= Class131_Sub2_Sub16.anIntArray5786[arg0.anInt3106];
	    arg0.anInt3070 = (byte) (arg0.anInt3106 & 0xff);
	    arg0.anInt3106 >>= 8;
	    arg0.anInt3071++;
	    arg0.anInt3077 = i_59_;
	    method151(arg0);
	    if (arg0.anInt3071 == arg0.anInt3077 + 1 && arg0.anInt3080 == 0)
		bool_28_ = true;
	    else
		bool_28_ = false;
	}
    }
    
    public static void method151(Class211 arg0) {
	byte i = arg0.aByte3108;
	int i_81_ = arg0.anInt3080;
	int i_82_ = arg0.anInt3071;
	int i_83_ = arg0.anInt3070;
	int[] is = Class131_Sub2_Sub16.anIntArray5786;
	int i_84_ = arg0.anInt3106;
	byte[] is_85_ = arg0.aByteArray3079;
	int i_86_ = arg0.anInt3100;
	int i_87_ = arg0.anInt3093;
	int i_88_ = i_87_;
	int i_89_ = arg0.anInt3077 + 1;
    while_68_:
	for (;;) {
	    if (i_81_ > 0) {
		for (;;) {
		    if (i_87_ == 0)
			break while_68_;
		    if (i_81_ == 1)
			break;
		    is_85_[i_86_] = i;
		    i_81_--;
		    i_86_++;
		    i_87_--;
		}
		if (i_87_ == 0) {
		    i_81_ = 1;
		    break;
		}
		is_85_[i_86_] = i;
		i_86_++;
		i_87_--;
	    }
	    boolean bool = true;
	    while (bool) {
		bool = false;
		if (i_82_ == i_89_) {
		    i_81_ = 0;
		    break while_68_;
		}
		i = (byte) i_83_;
		i_84_ = is[i_84_];
		int i_90_ = (byte) (i_84_ & 0xff);
		i_84_ >>= 8;
		i_82_++;
		if (i_90_ != i_83_) {
		    i_83_ = i_90_;
		    if (i_87_ == 0) {
			i_81_ = 1;
			break while_68_;
		    }
		    is_85_[i_86_] = i;
		    i_86_++;
		    i_87_--;
		    bool = true;
		} else if (i_82_ == i_89_) {
		    if (i_87_ == 0) {
			i_81_ = 1;
			break while_68_;
		    }
		    is_85_[i_86_] = i;
		    i_86_++;
		    i_87_--;
		    bool = true;
		}
	    }
	    i_81_ = 2;
	    i_84_ = is[i_84_];
	    int i_91_ = (byte) (i_84_ & 0xff);
	    i_84_ >>= 8;
	    if (++i_82_ != i_89_) {
		if (i_91_ != i_83_)
		    i_83_ = i_91_;
		else {
		    i_81_ = 3;
		    i_84_ = is[i_84_];
		    i_91_ = (byte) (i_84_ & 0xff);
		    i_84_ >>= 8;
		    if (++i_82_ != i_89_) {
			if (i_91_ != i_83_)
			    i_83_ = i_91_;
			else {
			    i_84_ = is[i_84_];
			    i_91_ = (byte) (i_84_ & 0xff);
			    i_84_ >>= 8;
			    i_82_++;
			    i_81_ = (i_91_ & 0xff) + 4;
			    i_84_ = is[i_84_];
			    i_83_ = (byte) (i_84_ & 0xff);
			    i_84_ >>= 8;
			    i_82_++;
			}
		    }
		}
	    }
	}
	int i_92_ = arg0.anInt3097;
	arg0.anInt3097 += i_88_ - i_87_;
	arg0.aByte3108 = i;
	arg0.anInt3080 = i_81_;
	arg0.anInt3071 = i_82_;
	arg0.anInt3070 = i_83_;
	Class131_Sub2_Sub16.anIntArray5786 = is;
	arg0.anInt3106 = i_84_;
	arg0.aByteArray3079 = is_85_;
	arg0.anInt3100 = i_86_;
	arg0.anInt3093 = i_87_;
    }
    
    public static int method152(int arg0, Class211 arg1) {
	int i;
	for (;;) {
	    if (arg1.anInt3088 >= arg0) {
		int i_93_ = (arg1.anInt3078 >> arg1.anInt3088 - arg0
			     & (1 << arg0) - 1);
		arg1.anInt3088 -= arg0;
		i = i_93_;
		break;
	    }
	    arg1.anInt3078 = (arg1.anInt3078 << 8
			      | arg1.aByteArray3109[arg1.anInt3074] & 0xff);
	    arg1.anInt3088 += 8;
	    arg1.anInt3074++;
	    arg1.anInt3085++;
	}
	return i;
    }
    
    public static byte method153(Class211 arg0) {
	return (byte) method152(1, arg0);
    }
}
