/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51
{
    public int anInt670;
    public static int anInt671;
    public static int anInt672;
    public static int anInt673;
    public int anInt674;
    public static int anInt675 = 0;
    public static int anInt676;
    public static int anInt677;
    public static int anInt678;
    public static int anInt679;
    public static int anInt680;
    public static int anInt681 = -1;
    public static int anInt682;
    public static int anInt683;
    public boolean aBoolean684 = false;
    
    public void method590(byte arg0, Stream arg1, int arg2) {
	for (;;) {
	    int i = arg1.readUnsignedByte(83);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method597(i, arg2, (byte) 76, arg1);
	}
	anInt678++;
	if (arg0 < 52)
	    method590((byte) -88, null, -121);
    }
    
    public static String method591(int arg0, long arg1) {
	try {
	    anInt672++;
	    if (arg1 <= 0L
		|| (arg1 ^ 0xffffffffffffffffL) <= -6582952005840035282L)
		return null;
	    if (arg1 % 37L == 0L)
		return null;
	    int i = 0;
	    long l = arg1;
	    while ((l ^ 0xffffffffffffffffL) != -1L) {
		l /= 37L;
		i++;
	    }
	    StringBuffer stringbuffer = new StringBuffer(i);
	    while (arg1 != 0L) {
		long l_0_ = arg1;
		arg1 /= 37L;
		char c = (Class131_Sub9.aCharArray4215
			  [(int) (l_0_ + -(37L * arg1))]);
		if (c == '_') {
		    int i_1_ = stringbuffer.length() + -1;
		    stringbuffer.setCharAt
			(i_1_,
			 Character.toUpperCase(stringbuffer.charAt(i_1_)));
		    c = '\u00a0';
		}
		stringbuffer.append(c);
	    }
	    stringbuffer.reverse();
	    if (arg0 <= 121)
		return null;
	    stringbuffer
		.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class131_Sub41_Sub9 method592(int arg0, int arg1) {
	try {
	    anInt677++;
	    Class131_Sub41_Sub9 class131_sub41_sub9
		= ((Class131_Sub41_Sub9)
		   Class131_Sub1_Sub1.aClass137_5453.method2111(-12,
								(long) arg0));
	    if (class131_sub41_sub9 != null)
		return class131_sub41_sub9;
	    byte[] is = Class110_Sub4.aClass158_3944.method2364(arg0, 19, 0);
	    class131_sub41_sub9 = new Class131_Sub41_Sub9();
	    int i = -21 / ((arg1 - 52) / 61);
	    if (is != null)
		class131_sub41_sub9.method1991(new Stream(is), -1);
	    Class131_Sub1_Sub1.aClass137_5453.method2110(class131_sub41_sub9,
							 false, (long) arg0);
	    return class131_sub41_sub9;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static byte method593(int arg0, byte arg1, int arg2) {
	try {
	    anInt676++;
	    if (arg1 != -75)
		return (byte) 79;
	    if ((arg0 ^ 0xffffffff) != -10)
		return (byte) 0;
	    if ((0x1 & arg2) != 0)
		return (byte) 2;
	    return (byte) 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class152 method594(boolean arg0, int arg1, int arg2,
			      Class130 arg3) {
	try {
	    anInt682++;
	    long l = (long) (arg3.anInt1781 << 1382486835
			     | ((arg0 ? 262144 : 0)
				| (arg1 << -403638320 | anInt670)));
	    Class152 class152
		= (Class152) Class100.aClass214_1317.method2780(124, l);
	    if (class152 != null)
		return class152;
	    if (!Class131_Sub33.aClass158_4558.method2343(-122, anInt670))
		return null;
	    Class124 class124
		= Class124.method1087(Class131_Sub33.aClass158_4558, anInt670,
				      0);
	    if (class124 != null) {
		class124.anInt1621 = class124.anInt1625
		    = class124.anInt1620 = class124.anInt1618 = 0;
		if (arg0)
		    class124.method1080();
		for (int i = 0; arg1 > i; i++)
		    class124.method1086();
	    }
	    class152 = arg3.method1178(class124, true);
	    if (class152 != null)
		Class100.aClass214_1317.method2773(true, class152, l);
	    if (arg2 != -31318)
		anInt670 = 78;
	    return class152;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method595(int arg0) {
	try {
	    if (arg0 != -7748)
		method594(true, -86, 44, null);
	    anInt673++;
	    return Class131_Sub33.aClass158_4558.method2343(-118, anInt670);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"f.D(" + arg0 + ')');
	}
    }
    
    public static byte[][][] method596(int arg0, int arg1) {
	try {
	    anInt679++;
	    byte[][][] is = new byte[8][4][];
	    int i = arg0;
	    int i_2_ = arg0;
	    byte[] is_3_ = new byte[i_2_ * i];
	    int i_4_ = 0;
	    for (int i_5_ = 0; i_2_ > i_5_; i_5_++) {
		for (int i_6_ = 0; i > i_6_; i_6_++) {
		    if ((i_6_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[0][0] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_7_ = i_2_ + -1; (i_7_ ^ 0xffffffff) <= -1; i_7_--) {
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		     i_8_++) {
		    if ((i_8_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[0][1] = is_3_;
	    is_3_ = new byte[i_2_ * i];
	    i_4_ = 0;
	    for (int i_9_ = 0; i_2_ > i_9_; i_9_++) {
		for (int i_10_ = 0; (i ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		     i_10_++) {
		    if ((i_10_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[0][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_11_ = -1 + i_2_; i_11_ >= 0; i_11_--) {
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
		    if ((i_12_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[0][3] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_13_ = -1 + i_2_; i_13_ >= 0; i_13_--) {
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
		    if ((i_13_ >> 952058849 ^ 0xffffffff)
			<= (i_14_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[1][0] = is_3_;
	    is_3_ = new byte[i * i_2_];
	    i_4_ = 0;
	    for (int i_15_ = 0; i_2_ > i_15_; i_15_++) {
		for (int i_16_ = 0; i > i_16_; i_16_++) {
		    if (i_4_ < 0
			|| (is_3_.length ^ 0xffffffff) >= (i_4_ ^ 0xffffffff))
			i_4_++;
		    else {
			if (i_15_ << 1524213025 <= i_16_)
			    is_3_[i_4_] = (byte) -1;
			i_4_++;
		    }
		}
	    }
	    is[1][1] = is_3_;
	    is_3_ = new byte[i * i_2_];
	    i_4_ = 0;
	    for (int i_17_ = 0; (i_2_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
		 i_17_++) {
		for (int i_18_ = -1 + i; i_18_ >= 0; i_18_--) {
		    if ((i_18_ ^ 0xffffffff)
			>= (i_17_ >> -61239871 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[1][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
		for (int i_20_ = -1 + i; i_20_ >= 0; i_20_--) {
		    if ((i_20_ ^ 0xffffffff)
			<= (i_19_ << 659571265 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[1][3] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_21_ = arg1 + i_2_; (i_21_ ^ 0xffffffff) <= -1;
		 i_21_--) {
		for (int i_22_ = -1 + i; i_22_ >= 0; i_22_--) {
		    if ((i_21_ >> -1551888799 ^ 0xffffffff)
			<= (i_22_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[2][0] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_23_ = -1 + i_2_; (i_23_ ^ 0xffffffff) <= -1; i_23_--) {
		for (int i_24_ = 0; (i ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
		     i_24_++) {
		    if ((i_24_ ^ 0xffffffff)
			<= (i_23_ << 1252704257 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[2][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_26_++) {
		    if (i_25_ >> -1818502399 >= i_26_)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[2][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_27_ = 0; i_2_ > i_27_; i_27_++) {
		for (int i_28_ = -1 + i; (i_28_ ^ 0xffffffff) <= -1; i_28_--) {
		    if ((i_28_ ^ 0xffffffff)
			<= (i_27_ << 1268872097 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[2][3] = is_3_;
	    is_3_ = new byte[i_2_ * i];
	    i_4_ = 0;
	    for (int i_29_ = -1 + i_2_; (i_29_ ^ 0xffffffff) <= -1; i_29_--) {
		for (int i_30_ = 0; (i ^ 0xffffffff) < (i_30_ ^ 0xffffffff);
		     i_30_++) {
		    if ((i_30_ ^ 0xffffffff)
			<= (i_29_ >> 406411873 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[3][0] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_31_++) {
		for (int i_32_ = 0; i > i_32_; i_32_++) {
		    if ((i_32_ ^ 0xffffffff)
			>= (i_31_ << -228819967 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[3][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_33_++) {
		for (int i_34_ = i + -1; i_34_ >= 0; i_34_--) {
		    if ((i_34_ ^ 0xffffffff)
			<= (i_33_ >> -1674550239 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[3][2] = is_3_;
	    is_3_ = new byte[i * i_2_];
	    i_4_ = 0;
	    for (int i_35_ = i_2_ + -1; (i_35_ ^ 0xffffffff) <= -1; i_35_--) {
		for (int i_36_ = i - 1; (i_36_ ^ 0xffffffff) <= -1; i_36_--) {
		    if ((i_35_ << -1140350399 ^ 0xffffffff)
			<= (i_36_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[3][3] = is_3_;
	    is_3_ = new byte[i_2_ * i];
	    i_4_ = 0;
	    for (int i_37_ = -1 + i_2_; i_37_ >= 0; i_37_--) {
		for (int i_38_ = i + -1; i_38_ >= 0; i_38_--) {
		    if ((i_37_ >> -565748351 ^ 0xffffffff)
			>= (i_38_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[4][0] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_39_ = -1 + i_2_; (i_39_ ^ 0xffffffff) <= -1; i_39_--) {
		for (int i_40_ = 0; i_40_ < i; i_40_++) {
		    if ((i_39_ << 772417953 ^ 0xffffffff)
			<= (i_40_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[4][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_41_ = 0; (i_2_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff);
		 i_41_++) {
		for (int i_42_ = 0; (i ^ 0xffffffff) < (i_42_ ^ 0xffffffff);
		     i_42_++) {
		    if (i_42_ >= i_41_ >> -1887020127)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[4][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_43_ = 0; i_2_ > i_43_; i_43_++) {
		for (int i_44_ = -1 + i; i_44_ >= 0; i_44_--) {
		    if ((i_44_ ^ 0xffffffff)
			>= (i_43_ << -1851273055 ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[4][3] = is_3_;
	    is_3_ = new byte[i * i_2_];
	    i_4_ = 0;
	    for (int i_45_ = 0; (i_2_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff);
		 i_45_++) {
		for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_46_++) {
		    if ((i / 2 ^ 0xffffffff) <= (i_46_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[5][0] = is_3_;
	    is_3_ = new byte[i_2_ * i];
	    i_4_ = 0;
	    for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_47_++) {
		for (int i_48_ = 0; (i ^ 0xffffffff) < (i_48_ ^ 0xffffffff);
		     i_48_++) {
		    if (i_47_ <= i_2_ / 2)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[5][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_49_ = 0; (i_2_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff);
		 i_49_++) {
		for (int i_50_ = 0; i > i_50_; i_50_++) {
		    if ((i / 2 ^ 0xffffffff) >= (i_50_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[5][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_51_ = 0; i_2_ > i_51_; i_51_++) {
		for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_52_++) {
		    if (i_51_ >= i_2_ / 2)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[5][3] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_53_++) {
		for (int i_54_ = 0; (i ^ 0xffffffff) < (i_54_ ^ 0xffffffff);
		     i_54_++) {
		    if ((i_53_ - i_2_ / 2 ^ 0xffffffff)
			<= (i_54_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[6][0] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_55_ = -1 + i_2_; i_55_ >= 0; i_55_--) {
		for (int i_56_ = 0; i > i_56_; i_56_++) {
		    if (i_56_ <= -(i_2_ / 2) + i_55_)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[6][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_57_ = i_2_ - 1; i_57_ >= 0; i_57_--) {
		for (int i_58_ = i + -1; (i_58_ ^ 0xffffffff) <= -1; i_58_--) {
		    if ((i_57_ + -(i_2_ / 2) ^ 0xffffffff)
			<= (i_58_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[6][2] = is_3_;
	    is_3_ = new byte[i * i_2_];
	    i_4_ = 0;
	    for (int i_59_ = 0; (i_2_ ^ 0xffffffff) < (i_59_ ^ 0xffffffff);
		 i_59_++) {
		for (int i_60_ = i + -1; (i_60_ ^ 0xffffffff) <= -1; i_60_--) {
		    if (i_59_ - i_2_ / 2 >= i_60_)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[6][3] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_61_++) {
		for (int i_62_ = 0; (i ^ 0xffffffff) < (i_62_ ^ 0xffffffff);
		     i_62_++) {
		    if (-(i_2_ / 2) + i_61_ <= i_62_)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[7][0] = is_3_;
	    is_3_ = new byte[i_2_ * i];
	    i_4_ = 0;
	    for (int i_63_ = -1 + i_2_; i_63_ >= 0; i_63_--) {
		for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_64_++) {
		    if ((i_63_ + -(i_2_ / 2) ^ 0xffffffff)
			>= (i_64_ ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[7][1] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i_2_ * i];
	    for (int i_65_ = -1 + i_2_; (i_65_ ^ 0xffffffff) <= -1; i_65_--) {
		for (int i_66_ = -1 + i; (i_66_ ^ 0xffffffff) <= -1; i_66_--) {
		    if ((i_66_ ^ 0xffffffff)
			<= (i_65_ + -(i_2_ / 2) ^ 0xffffffff))
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[7][2] = is_3_;
	    i_4_ = 0;
	    is_3_ = new byte[i * i_2_];
	    for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		 i_67_++) {
		for (int i_68_ = -1 + i; (i_68_ ^ 0xffffffff) <= -1; i_68_--) {
		    if (-(i_2_ / 2) + i_67_ <= i_68_)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	    is[7][3] = is_3_;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method597(int arg0, int arg1, byte arg2, Stream arg3) {
	try {
	    anInt683++;
	    if (arg0 == 1)
		anInt670 = arg3.readUnsignedShort(8104);
	    else if (arg0 != 2) {
		if (arg0 != 3) {
		    if ((arg0 ^ 0xffffffff) == -5)
			anInt670 = -1;
		} else
		    aBoolean684 = true;
	    } else
		anInt674 = arg3.read3Bytes(false);
	    int i = -24 / ((arg2 - 4) / 60);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("f.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
