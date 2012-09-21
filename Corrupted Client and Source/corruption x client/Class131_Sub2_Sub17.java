/* Class131_Sub2_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub17 extends Class131_Sub2
{
    public short[] aShortArray5792;
    public boolean aBoolean5793;
    public int anInt5794 = 4;
    public static int anInt5795;
    public static int anInt5796;
    public static int anInt5797;
    public static int anInt5798;
    public static int anInt5799;
    public static int anInt5800;
    public byte[] aByteArray5801 = new byte[512];
    public int anInt5802;
    public static int anInt5803;
    public static int anInt5804;
    public int anInt5805 = 4;
    public int anInt5806;
    public static int anInt5807;
    public short[] aShortArray5808;
    public int anInt5809;
    public static int anInt5810;
    public static Class214 aClass214_5811 = new Class214(64);
    public static int anInt5812;
    public static int anInt5813 = 0;
    public static short aShort5814 = 1;
    
    public void method1471(int arg0) {
	aByteArray5801 = Class57.method633(false, anInt5809);
	if (arg0 != 0)
	    aClass214_5811 = null;
	anInt5812++;
	method1551((byte) 101);
	for (int i = -1 + anInt5802; i >= 1; i--) {
	    short i_0_ = aShortArray5792[i];
	    if ((i_0_ ^ 0xffffffff) < -9)
		break;
	    if ((i_0_ ^ 0xffffffff) > 7)
		break;
	    anInt5802--;
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5798++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -100);
	    if (arg0 != -11543)
		method1555(null, true);
	    if (aClass200_4087.aBoolean2927)
		method1553(6967, is, arg1);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1550(byte arg0) {
	try {
	    synchronized (Class131_Sub2_Sub35.aClass28_6038) {
		Class204.anInt2979 = Class14.anInt154;
		Class131_Sub42.anInt4692++;
		if (Class23_Sub2_Sub1.anInt4989 >= 0) {
		    while ((Class23_Sub2_Sub1.anInt4989 ^ 0xffffffff)
			   != (Class131_Sub2_Sub1.anInt5555 ^ 0xffffffff)) {
			int i = (Class12.anIntArray132
				 [Class131_Sub2_Sub1.anInt5555]);
			Class131_Sub2_Sub1.anInt5555
			    = 1 + Class131_Sub2_Sub1.anInt5555 & 0x7f;
			if (i < 0)
			    Class131_Sub2_Sub39.aBooleanArray6080
				[i ^ 0xffffffff]
				= false;
			else
			    Class131_Sub2_Sub39.aBooleanArray6080[i] = true;
		    }
		} else {
		    for (int i = 0; (i ^ 0xffffffff) > -113; i++)
			Class131_Sub2_Sub39.aBooleanArray6080[i] = false;
		    Class23_Sub2_Sub1.anInt4989 = Class131_Sub2_Sub1.anInt5555;
		}
		Class14.anInt154 = Class28.anInt276;
		if (arg0 != -75)
		    method1554((byte) 124);
	    }
	    anInt5799++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ho.B(" + arg0 + ')');
	}
    }
    
    public void method1551(byte arg0) {
	try {
	    int i = -32 % ((17 - arg0) / 54);
	    if (anInt5806 <= 0) {
		if (aShortArray5792 != null
		    && anInt5802 == aShortArray5792.length) {
		    aShortArray5808 = new short[anInt5802];
		    for (int i_1_ = 0;
			 (i_1_ ^ 0xffffffff) > (anInt5802 ^ 0xffffffff);
			 i_1_++)
			aShortArray5808[i_1_]
			    = (short) (int) Math.pow(2.0, (double) i_1_);
		}
	    } else {
		aShortArray5792 = new short[anInt5802];
		aShortArray5808 = new short[anInt5802];
		for (int i_2_ = 0;
		     (i_2_ ^ 0xffffffff) > (anInt5802 ^ 0xffffffff); i_2_++) {
		    aShortArray5792[i_2_]
			= (short) (int) (4096.0
					 * Math.pow((double) ((float) anInt5806
							      / 4096.0F),
						    (double) i_2_));
		    aShortArray5808[i_2_]
			= (short) (int) Math.pow(2.0, (double) i_2_);
		}
	    }
	    anInt5797++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ho.K(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2_Sub17() {
	super(0, true);
	anInt5802 = 4;
	anInt5806 = 1638;
	anInt5809 = 0;
	aBoolean5793 = true;
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	int i = arg0;
    while_167_:
	do {
	while_166_:
	    do {
	    while_165_:
		do {
		while_164_:
		    do {
		    while_163_:
			do {
			    do {
				if (i != 0) {
				    if (i != 1) {
					if ((i ^ 0xffffffff) != -3) {
					    if ((i ^ 0xffffffff) != -4) {
						if (i != 4) {
						    if (i != 5) {
							if ((i ^ 0xffffffff)
							    == -7)
							    break while_166_;
							break while_167_;
						    }
						} else
						    break while_164_;
						break while_165_;
					    }
					} else
					    break;
					break while_163_;
				    }
				} else {
				    aBoolean5793 = (arg2.readUnsignedByte(-32)
						    ^ 0xffffffff) == -2;
				    break while_167_;
				}
				anInt5802 = arg2.readUnsignedByte(62);
				break while_167_;
			    } while (false);
			    anInt5806 = arg2.readSignedShort(1625554944);
			    if (anInt5806 < 0) {
				aShortArray5792 = new short[anInt5802];
				for (i = 0; ((anInt5802 ^ 0xffffffff)
					     < (i ^ 0xffffffff)); i++)
				    aShortArray5792[i]
					= (short) arg2.readSignedShort(1625554944);
			    }
			    break while_167_;
			} while (false);
			anInt5805 = anInt5794 = arg2.readUnsignedByte(arg1 + 151);
			break while_167_;
		    } while (false);
		    anInt5809 = arg2.readUnsignedByte(-115);
		    break while_167_;
		} while (false);
		anInt5805 = arg2.readUnsignedByte(93);
		break while_167_;
	    } while (false);
	    anInt5794 = arg2.readUnsignedByte(126);
	} while (false);
	anInt5796++;
	if (arg1 != -49)
	    method1550((byte) -99);
    }
    
    public static String method1552(Class173 arg0, byte arg1) {
	try {
	    anInt5807++;
	    if (arg1 != 90)
		return null;
	    if (client.method66(arg0).method1888((byte) 122) == 0)
		return null;
	    if (arg0.aString2463 == null
		|| (arg0.aString2463.trim().length() ^ 0xffffffff) == -1) {
		if (Class23_Sub5.aBoolean3761)
		    return "Hidden-use";
		return null;
	    }
	    return arg0.aString2463;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1553(int arg0, int[] arg1, int arg2) {
	anInt5804++;
	int i = anInt5794 * Class1_Sub7_Sub1.anIntArray5206[arg2];
	if (anInt5802 != 1) {
	    int i_3_ = aShortArray5792[0];
	    if (i_3_ > 8 || (i_3_ ^ 0xffffffff) > 7) {
		int i_4_ = aShortArray5808[0] << 1076045132;
		int i_5_ = i_4_ * anInt5805 >> -123318612;
		int i_6_ = i_4_ * anInt5794 >> 1914853452;
		int i_7_ = i_4_ * i >> 1820516204;
		int i_8_ = i_7_ >> 163827788;
		int i_9_ = i_8_ - -1;
		if (i_6_ <= i_9_)
		    i_9_ = 0;
		i_7_ &= 0xfff;
		int i_10_ = 0xff & aByteArray5801[0xff & i_9_];
		int i_11_ = aByteArray5801[0xff & i_8_] & 0xff;
		int i_12_ = Class4.anIntArray3282[i_7_];
		for (int i_13_ = 0; i_13_ < Class131_Sub2_Sub7.anInt5637;
		     i_13_++) {
		    int i_14_ = Class1_Sub4.anIntArray3551[i_13_] * anInt5805;
		    int i_15_
			= method1556(i_7_, i_4_ * i_14_ >> 14697324,
				     (byte) -102, i_5_, i_12_, i_11_, i_10_);
		    arg1[i_13_] = i_3_ * i_15_ >> -339424724;
		}
	    }
	    for (int i_16_ = 1; anInt5802 > i_16_; i_16_++) {
		i_3_ = aShortArray5792[i_16_];
		if ((i_3_ ^ 0xffffffff) < -9 || (i_3_ ^ 0xffffffff) > 7) {
		    int i_17_ = aShortArray5808[i_16_] << -2060775316;
		    int i_18_ = i_17_ * i >> 1440535660;
		    int i_19_ = anInt5805 * i_17_ >> 1300323052;
		    int i_20_ = anInt5794 * i_17_ >> -1832679060;
		    int i_21_ = i_18_ >> -913198516;
		    int i_22_ = i_21_ + 1;
		    if ((i_20_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff))
			i_22_ = 0;
		    i_18_ &= 0xfff;
		    int i_23_ = Class4.anIntArray3282[i_18_];
		    int i_24_ = 0xff & aByteArray5801[i_21_ & 0xff];
		    int i_25_ = aByteArray5801[0xff & i_22_] & 0xff;
		    if (!aBoolean5793
			|| (i_16_ ^ 0xffffffff) != (-1 + anInt5802
						    ^ 0xffffffff)) {
			for (int i_26_ = 0;
			     ((i_26_ ^ 0xffffffff)
			      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			     i_26_++) {
			    int i_27_ = (anInt5805
					 * Class1_Sub4.anIntArray3551[i_26_]);
			    int i_28_ = method1556(i_18_,
						   i_17_ * i_27_ >> -442108980,
						   (byte) -102, i_19_, i_23_,
						   i_24_, i_25_);
			    arg1[i_26_] += i_3_ * i_28_ >> -2061900372;
			}
		    } else {
			for (int i_29_ = 0;
			     i_29_ < Class131_Sub2_Sub7.anInt5637; i_29_++) {
			    int i_30_ = (anInt5805
					 * Class1_Sub4.anIntArray3551[i_29_]);
			    int i_31_
				= method1556(i_18_,
					     i_17_ * i_30_ >> -1062273620,
					     (byte) -102, i_19_, i_23_, i_24_,
					     i_25_);
			    i_31_
				= arg1[i_29_] - -(i_31_ * i_3_ >> 1885855788);
			    arg1[i_29_] = 2048 + (i_31_ >> -1091313439);
			}
		    }
		}
	    }
	} else {
	    int i_32_ = aShortArray5792[0];
	    int i_33_ = aShortArray5808[0] << -506109428;
	    int i_34_ = i_33_ * i >> -1714461300;
	    int i_35_ = i_33_ * anInt5794 >> -1157605812;
	    int i_36_ = i_33_ * anInt5805 >> -1785248756;
	    int i_37_ = i_34_ >> -458591156;
	    int i_38_ = 1 + i_37_;
	    if (i_38_ >= i_35_)
		i_38_ = 0;
	    i_34_ &= 0xfff;
	    int i_39_ = aByteArray5801[0xff & i_37_] & 0xff;
	    int i_40_ = Class4.anIntArray3282[i_34_];
	    int i_41_ = 0xff & aByteArray5801[i_38_ & 0xff];
	    if (aBoolean5793) {
		for (int i_42_ = 0; Class131_Sub2_Sub7.anInt5637 > i_42_;
		     i_42_++) {
		    int i_43_ = Class1_Sub4.anIntArray3551[i_42_] * anInt5805;
		    int i_44_
			= method1556(i_34_, i_43_ * i_33_ >> -1575595700,
				     (byte) -102, i_36_, i_40_, i_39_, i_41_);
		    i_44_ = i_44_ * i_32_ >> 728429516;
		    arg1[i_42_] = 2048 - -(i_44_ >> 9732353);
		}
	    } else {
		for (int i_45_ = 0;
		     ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
		      < (i_45_ ^ 0xffffffff));
		     i_45_++) {
		    int i_46_ = Class1_Sub4.anIntArray3551[i_45_] * anInt5805;
		    int i_47_
			= method1556(i_34_, i_33_ * i_46_ >> 436336204,
				     (byte) -102, i_36_, i_40_, i_39_, i_41_);
		    arg1[i_45_] = i_47_ * i_32_ >> -1667485876;
		}
	    }
	}
	if (arg0 != 6967)
	    method1551((byte) 120);
    }
    
    public static void method1554(byte arg0) {
	try {
	    if (arg0 == 112)
		aClass214_5811 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ho.H(" + arg0 + ')');
	}
    }
    
    public static void method1555(Class1_Sub2 arg0, boolean arg1) {
	try {
	    anInt5795++;
	    arg0.aClass23_3503 = null;
	    int i = arg0.aClass1_Sub5Array3500.length;
	    if (arg1 == true) {
		for (int i_48_ = 0; i_48_ < i; i_48_++)
		    arg0.aClass1_Sub5Array3500[i_48_].aBoolean3556 = false;
		synchronized (Class210.aClass50Array3066) {
		    if ((i ^ 0xffffffff) > (Class210.aClass50Array3066.length
					    ^ 0xffffffff)
			&& Class121_Sub2.anIntArray3993[i] < 200) {
			Class210.aClass50Array3066[i].method584(arg0,
								(byte) -121);
			Class121_Sub2.anIntArray3993[i]++;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.I("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method1556(int arg0, int arg1, byte arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	try {
	    anInt5803++;
	    int i = arg1 >> -1144100148;
	    int i_49_ = 1 + i;
	    if ((i_49_ ^ 0xffffffff) <= (arg3 ^ 0xffffffff))
		i_49_ = 0;
	    i &= 0xff;
	    arg1 &= 0xfff;
	    int i_50_ = -4096 + arg0;
	    i_49_ &= 0xff;
	    int i_51_ = -4096 + arg1;
	    int i_52_ = Class4.anIntArray3282[arg1];
	    int i_53_ = aByteArray5801[i - -arg5] & 0x3;
	    int i_54_;
	    if (i_53_ <= 1)
		i_54_ = i_53_ == 0 ? arg1 + arg0 : arg0 + -arg1;
	    else
		i_54_
		    = (i_53_ ^ 0xffffffff) != -3 ? -arg0 + -arg1 : arg1 - arg0;
	    if (arg2 != -102)
		anInt5809 = -90;
	    i_53_ = 0x3 & aByteArray5801[arg5 + i_49_];
	    int i_55_;
	    if ((i_53_ ^ 0xffffffff) < -2)
		i_55_ = i_53_ == 2 ? -arg0 + i_51_ : -arg0 + -i_51_;
	    else
		i_55_ = i_53_ != 0 ? arg0 - i_51_ : arg0 + i_51_;
	    int i_56_ = ((i_55_ + -i_54_) * i_52_ >> -531508852) + i_54_;
	    i_53_ = aByteArray5801[i - -arg6] & 0x3;
	    if ((i_53_ ^ 0xffffffff) < -2)
		i_54_ = ((i_53_ ^ 0xffffffff) == -3 ? -i_50_ + arg1
			 : -arg1 + -i_50_);
	    else
		i_54_ = ((i_53_ ^ 0xffffffff) != -1 ? -arg1 + i_50_
			 : i_50_ + arg1);
	    i_53_ = 0x3 & aByteArray5801[i_49_ + arg6];
	    if ((i_53_ ^ 0xffffffff) < -2)
		i_55_ = i_53_ == 2 ? -i_50_ + i_51_ : -i_51_ + -i_50_;
	    else
		i_55_ = i_53_ != 0 ? i_50_ - i_51_ : i_50_ + i_51_;
	    int i_57_ = i_54_ + (i_52_ * (-i_54_ + i_55_) >> -160038868);
	    return (arg4 * (-i_56_ + i_57_) >> 2065400780) + i_56_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method1557(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    anInt5810++;
	    int i = 0;
	    int i_58_ = arg3;
	    int i_59_ = arg1 * arg1;
	    int i_60_ = arg3 * arg3;
	    int i_61_ = i_60_ << -703663167;
	    int i_62_ = i_59_ << -110306175;
	    int i_63_ = arg3 << -1577156927;
	    int i_64_ = i_59_ * (1 - i_63_) - -i_61_;
	    int i_65_ = i_60_ - (i_63_ + -1) * i_62_;
	    int i_66_ = i_59_ << 249042114;
	    int i_67_ = i_60_ << -850370110;
	    if (arg2 != 4096)
		anInt5813 = 65;
	    int i_68_ = ((i << 1105324417) + 3) * i_61_;
	    int i_69_ = (-3 + (i_58_ << 342359041)) * i_62_;
	    int i_70_ = i_67_ * (i - -1);
	    Class131_Sub3.method1650(arg1 + arg0,
				     Class56.anIntArrayArray740[arg5], arg4,
				     arg0 + -arg1, 122);
	    int i_71_ = (i_58_ + -1) * i_66_;
	    while ((i_58_ ^ 0xffffffff) < -1) {
		if (i_64_ < 0) {
		    while (i_64_ < 0) {
			i_64_ += i_68_;
			i_65_ += i_70_;
			i_68_ += i_67_;
			i_70_ += i_67_;
			i++;
		    }
		}
		if (i_65_ < 0) {
		    i_64_ += i_68_;
		    i_65_ += i_70_;
		    i_70_ += i_67_;
		    i_68_ += i_67_;
		    i++;
		}
		i_65_ += -i_69_;
		i_64_ += -i_71_;
		i_58_--;
		i_69_ -= i_66_;
		i_71_ -= i_66_;
		int i_72_ = -i_58_ + arg5;
		int i_73_ = arg5 + i_58_;
		int i_74_ = i + arg0;
		int i_75_ = arg0 + -i;
		Class131_Sub3.method1650(i_74_,
					 Class56.anIntArrayArray740[i_72_],
					 arg4, i_75_, arg2 + -3982);
		Class131_Sub3.method1650(i_74_,
					 Class56.anIntArrayArray740[i_73_],
					 arg4, i_75_, arg2 + -4032);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.M(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method1558(int arg0, int arg1, int arg2, byte arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt5800++;
	    int i = 0;
	    int i_76_ = arg7;
	    int i_77_ = 0;
	    int i_78_ = -arg2 + arg6;
	    int i_79_ = arg7 - arg2;
	    int i_80_ = arg6 * arg6;
	    int i_81_ = arg7 * arg7;
	    if (arg3 != 96)
		aClass214_5811 = null;
	    int i_82_ = i_78_ * i_78_;
	    int i_83_ = i_79_ * i_79_;
	    int i_84_ = i_81_ << 1714823425;
	    int i_85_ = i_80_ << 286655329;
	    int i_86_ = i_83_ << -1335393087;
	    int i_87_ = i_82_ << -1779510335;
	    int i_88_ = arg7 << -1049362879;
	    int i_89_ = i_79_ << 227884705;
	    int i_90_ = (1 - i_88_) * i_80_ + i_84_;
	    int i_91_ = i_81_ + -(i_85_ * (i_88_ + -1));
	    int i_92_ = i_86_ + i_82_ * (1 - i_89_);
	    int i_93_ = i_83_ + -(i_87_ * (i_89_ + -1));
	    int i_94_ = i_80_ << -898623710;
	    int i_95_ = i_81_ << 28360514;
	    int i_96_ = i_82_ << -1789065470;
	    int i_97_ = i_83_ << -1079863390;
	    int i_98_ = i_84_ * 3;
	    int i_99_ = i_85_ * (i_88_ - 3);
	    int i_100_ = 3 * i_86_;
	    int i_101_ = (-3 + i_89_) * i_87_;
	    int i_102_ = i_95_;
	    int i_103_ = i_94_ * (arg7 + -1);
	    int i_104_ = i_97_;
	    if (arg4 >= Class116.anInt1494 && arg4 <= Class125.anInt1629) {
		int[] is = Class56.anIntArrayArray740[arg4];
		int i_105_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, -arg6 + arg5);
		int i_106_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg6 + arg5);
		int i_107_
		    = Class180.method2517(arg3 ^ ~0x3cd6, Class115.anInt1477,
					  Class149.anInt1988, -i_78_ + arg5);
		int i_108_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg5 + i_78_);
		Class131_Sub3.method1650(i_107_, is, arg0, i_105_, 90);
		Class131_Sub3.method1650(i_108_, is, arg1, i_107_, 102);
		Class131_Sub3.method1650(i_106_, is, arg0, i_108_, 67);
	    }
	    int i_109_ = (i_79_ - 1) * i_96_;
	    while (i_76_ > 0) {
		boolean bool = i_79_ >= i_76_;
		if ((i_90_ ^ 0xffffffff) > -1) {
		    while ((i_90_ ^ 0xffffffff) > -1) {
			i_90_ += i_98_;
			i_91_ += i_102_;
			i++;
			i_102_ += i_95_;
			i_98_ += i_95_;
		    }
		}
		if (bool) {
		    if ((i_92_ ^ 0xffffffff) > -1) {
			while ((i_92_ ^ 0xffffffff) > -1) {
			    i_92_ += i_100_;
			    i_93_ += i_104_;
			    i_104_ += i_97_;
			    i_77_++;
			    i_100_ += i_97_;
			}
		    }
		    if (i_93_ < 0) {
			i_93_ += i_104_;
			i_92_ += i_100_;
			i_77_++;
			i_100_ += i_97_;
			i_104_ += i_97_;
		    }
		    i_92_ += -i_109_;
		    i_93_ += -i_101_;
		    i_109_ -= i_96_;
		    i_101_ -= i_96_;
		}
		if ((i_91_ ^ 0xffffffff) > -1) {
		    i_91_ += i_102_;
		    i_90_ += i_98_;
		    i_102_ += i_95_;
		    i_98_ += i_95_;
		    i++;
		}
		i_91_ += -i_99_;
		i_90_ += -i_103_;
		i_99_ -= i_94_;
		i_76_--;
		i_103_ -= i_94_;
		int i_110_ = -i_76_ + arg4;
		int i_111_ = arg4 - -i_76_;
		if ((Class116.anInt1494 ^ 0xffffffff) >= (i_111_ ^ 0xffffffff)
		    && (i_110_ ^ 0xffffffff) >= (Class125.anInt1629
						 ^ 0xffffffff)) {
		    int i_112_
			= Class180.method2517(arg3 + -15639,
					      Class115.anInt1477,
					      Class149.anInt1988, i + arg5);
		    int i_113_
			= Class180.method2517(-15543, Class115.anInt1477,
					      Class149.anInt1988, -i + arg5);
		    if (bool) {
			int i_114_
			    = Class180.method2517(-15543, Class115.anInt1477,
						  Class149.anInt1988,
						  i_77_ + arg5);
			int i_115_
			    = Class180.method2517(-15543, Class115.anInt1477,
						  Class149.anInt1988,
						  arg5 + -i_77_);
			if (i_110_ >= Class116.anInt1494) {
			    int[] is = Class56.anIntArrayArray740[i_110_];
			    Class131_Sub3.method1650(i_115_, is, arg0, i_113_,
						     94);
			    Class131_Sub3.method1650(i_114_, is, arg1, i_115_,
						     95);
			    Class131_Sub3.method1650(i_112_, is, arg0, i_114_,
						     84);
			}
			if ((i_111_ ^ 0xffffffff)
			    >= (Class125.anInt1629 ^ 0xffffffff)) {
			    int[] is = Class56.anIntArrayArray740[i_111_];
			    Class131_Sub3.method1650(i_115_, is, arg0, i_113_,
						     123);
			    Class131_Sub3.method1650(i_114_, is, arg1, i_115_,
						     117);
			    Class131_Sub3.method1650(i_112_, is, arg0, i_114_,
						     107);
			}
		    } else {
			if ((Class116.anInt1494 ^ 0xffffffff)
			    >= (i_110_ ^ 0xffffffff))
			    Class131_Sub3.method1650(i_112_,
						     (Class56
						      .anIntArrayArray740
						      [i_110_]),
						     arg0, i_113_,
						     arg3 ^ 0x2f);
			if (Class125.anInt1629 >= i_111_)
			    Class131_Sub3.method1650(i_112_,
						     (Class56
						      .anIntArrayArray740
						      [i_111_]),
						     arg0, i_113_, 90);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ho.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
}
