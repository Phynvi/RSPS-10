/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124
{
    public int anInt1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public byte[] aByteArray1622;
    public int anInt1623;
    public int[] anIntArray1624;
    public int anInt1625;
    public byte[] aByteArray1626;
    
    public void method1080() {
	byte[] is = aByteArray1626;
	if (aByteArray1622 == null) {
	    for (int i = (anInt1619 >> 1) - 1; i >= 0; i--) {
		int i_0_ = i * anInt1623;
		int i_1_ = (anInt1619 - i - 1) * anInt1623;
		for (int i_2_ = -anInt1623; i_2_ < 0; i_2_++) {
		    byte i_3_ = is[i_0_];
		    is[i_0_] = is[i_1_];
		    is[i_1_] = i_3_;
		    i_0_++;
		    i_1_++;
		}
	    }
	} else {
	    byte[] is_4_ = aByteArray1622;
	    for (int i = (anInt1619 >> 1) - 1; i >= 0; i--) {
		int i_5_ = i * anInt1623;
		int i_6_ = (anInt1619 - i - 1) * anInt1623;
		for (int i_7_ = -anInt1623; i_7_ < 0; i_7_++) {
		    byte i_8_ = is[i_5_];
		    is[i_5_] = is[i_6_];
		    is[i_6_] = i_8_;
		    i_8_ = is_4_[i_5_];
		    is_4_[i_5_] = is_4_[i_6_];
		    is_4_[i_6_] = i_8_;
		    i_5_++;
		    i_6_++;
		}
	    }
	}
	int i = anInt1618;
	anInt1618 = anInt1621;
	anInt1621 = i;
    }
    
    public int method1081() {
	return anInt1619 + anInt1618 + anInt1621;
    }
    
    public static Class124 method1082(Class158 arg0, int arg1) {
	byte[] is = arg0.method2358(arg1, 119);
	if (is == null)
	    return null;
	return method1083(is)[0];
    }
    
    public static Class124[] method1083(byte[] arg0) {
	Stream stream = new Stream(arg0);
	stream.offset = arg0.length - 2;
	int i = stream.readUnsignedShort(8104);
	Class124[] class124s = new Class124[i];
	for (int i_9_ = 0; i_9_ < i; i_9_++)
	    class124s[i_9_] = new Class124();
	stream.offset = arg0.length - 7 - i * 8;
	int i_10_ = stream.readUnsignedShort(8104);
	int i_11_ = stream.readUnsignedShort(8104);
	int i_12_ = (stream.readUnsignedByte(127) & 0xff) + 1;
	for (int i_13_ = 0; i_13_ < i; i_13_++)
	    class124s[i_13_].anInt1625 = stream.readUnsignedShort(8104);
	for (int i_14_ = 0; i_14_ < i; i_14_++)
	    class124s[i_14_].anInt1618 = stream.readUnsignedShort(8104);
	for (int i_15_ = 0; i_15_ < i; i_15_++)
	    class124s[i_15_].anInt1623 = stream.readUnsignedShort(8104);
	for (int i_16_ = 0; i_16_ < i; i_16_++)
	    class124s[i_16_].anInt1619 = stream.readUnsignedShort(8104);
	for (int i_17_ = 0; i_17_ < i; i_17_++) {
	    Class124 class124 = class124s[i_17_];
	    class124.anInt1620
		= i_10_ - class124.anInt1623 - class124.anInt1625;
	    class124.anInt1621
		= i_11_ - class124.anInt1619 - class124.anInt1618;
	}
	stream.offset = arg0.length - 7 - i * 8 - (i_12_ - 1) * 3;
	int[] is = new int[i_12_];
	for (int i_18_ = 1; i_18_ < i_12_; i_18_++) {
	    is[i_18_] = stream.read3Bytes(false);
	    if (is[i_18_] == 0)
		is[i_18_] = 1;
	}
	for (int i_19_ = 0; i_19_ < i; i_19_++)
	    class124s[i_19_].anIntArray1624 = is;
	stream.offset = 0;
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    Class124 class124 = class124s[i_20_];
	    int i_21_ = class124.anInt1623 * class124.anInt1619;
	    class124.aByteArray1626 = new byte[i_21_];
	    int i_22_ = stream.readUnsignedByte(-113);
	    if ((i_22_ & 0x2) == 0) {
		if ((i_22_ & 0x1) == 0) {
		    for (int i_23_ = 0; i_23_ < i_21_; i_23_++)
			class124.aByteArray1626[i_23_]
			    = stream.readSignedByte((byte) 127);
		} else {
		    for (int i_24_ = 0; i_24_ < class124.anInt1623; i_24_++) {
			for (int i_25_ = 0; i_25_ < class124.anInt1619;
			     i_25_++)
			    class124.aByteArray1626
				[i_24_ + i_25_ * class124.anInt1623]
				= stream.readSignedByte((byte) 127);
		    }
		}
	    } else {
		boolean bool = false;
		class124.aByteArray1622 = new byte[i_21_];
		if ((i_22_ & 0x1) == 0) {
		    for (int i_26_ = 0; i_26_ < i_21_; i_26_++)
			class124.aByteArray1626[i_26_]
			    = stream.readSignedByte((byte) 127);
		    for (int i_27_ = 0; i_27_ < i_21_; i_27_++) {
			byte i_28_ = (class124.aByteArray1622[i_27_]
				      = stream.readSignedByte((byte) 127));
			bool = bool | i_28_ != -1;
		    }
		} else {
		    for (int i_29_ = 0; i_29_ < class124.anInt1623; i_29_++) {
			for (int i_30_ = 0; i_30_ < class124.anInt1619;
			     i_30_++)
			    class124.aByteArray1626
				[i_29_ + i_30_ * class124.anInt1623]
				= stream.readSignedByte((byte) 127);
		    }
		    for (int i_31_ = 0; i_31_ < class124.anInt1623; i_31_++) {
			for (int i_32_ = 0; i_32_ < class124.anInt1619;
			     i_32_++) {
			    byte i_33_
				= (class124.aByteArray1622
				       [i_31_ + i_32_ * class124.anInt1623]
				   = stream.readSignedByte((byte) 127));
			    bool = bool | i_33_ != -1;
			}
		    }
		}
		if (!bool)
		    class124.aByteArray1622 = null;
	    }
	}
	return class124s;
    }
    
    public static Class124[] method1084(Class158 arg0, int arg1, int arg2) {
	byte[] is = arg0.method2364(arg2, arg1, 0);
	if (is == null)
	    return null;
	return method1083(is);
    }
    
    public void method1085() {
	int i = method1089();
	int i_34_ = method1081();
	if (anInt1623 != i || anInt1619 != i_34_) {
	    byte[] is = new byte[i * i_34_];
	    if (aByteArray1622 != null) {
		byte[] is_35_ = new byte[i * i_34_];
		for (int i_36_ = 0; i_36_ < anInt1619; i_36_++) {
		    int i_37_ = i_36_ * anInt1623;
		    int i_38_ = (i_36_ + anInt1618) * i + anInt1625;
		    for (int i_39_ = 0; i_39_ < anInt1623; i_39_++) {
			is[i_38_] = aByteArray1626[i_37_];
			is_35_[i_38_++] = aByteArray1622[i_37_++];
		    }
		}
		aByteArray1622 = is_35_;
	    } else {
		for (int i_40_ = 0; i_40_ < anInt1619; i_40_++) {
		    int i_41_ = i_40_ * anInt1623;
		    int i_42_ = (i_40_ + anInt1618) * i + anInt1625;
		    for (int i_43_ = 0; i_43_ < anInt1623; i_43_++)
			is[i_42_++] = aByteArray1626[i_41_++];
		}
	    }
	    anInt1625 = anInt1620 = anInt1618 = anInt1621 = 0;
	    anInt1623 = i;
	    anInt1619 = i_34_;
	    aByteArray1626 = is;
	}
    }
    
    public void method1086() {
	byte[] is = new byte[anInt1623 * anInt1619];
	int i = 0;
	if (aByteArray1622 == null) {
	    for (int i_44_ = 0; i_44_ < anInt1623; i_44_++) {
		for (int i_45_ = anInt1619 - 1; i_45_ >= 0; i_45_--)
		    is[i++] = aByteArray1626[i_44_ + i_45_ * anInt1623];
	    }
	    aByteArray1626 = is;
	} else {
	    byte[] is_46_ = new byte[anInt1623 * anInt1619];
	    for (int i_47_ = 0; i_47_ < anInt1623; i_47_++) {
		for (int i_48_ = anInt1619 - 1; i_48_ >= 0; i_48_--) {
		    is[i] = aByteArray1626[i_47_ + i_48_ * anInt1623];
		    is_46_[i++] = aByteArray1622[i_47_ + i_48_ * anInt1623];
		}
	    }
	    aByteArray1626 = is;
	    aByteArray1622 = is_46_;
	}
	int i_49_ = anInt1618;
	anInt1618 = anInt1625;
	anInt1625 = anInt1621;
	anInt1621 = anInt1620;
	anInt1620 = anInt1618;
	i_49_ = anInt1619;
	anInt1619 = anInt1623;
	anInt1623 = i_49_;
    }
    
    public static Class124 method1087(Class158 arg0, int arg1, int arg2) {
	byte[] is = arg0.method2364(arg2, arg1, 0);
	if (is == null)
	    return null;
	return method1083(is)[0];
    }
    
    public void method1088(int arg0) {
	int i = -1;
	if (anIntArray1624.length < 255) {
	    for (int i_50_ = 0; i_50_ < anIntArray1624.length; i_50_++) {
		if (anIntArray1624[i_50_] == arg0) {
		    i = i_50_;
		    break;
		}
	    }
	    if (i == -1) {
		i = anIntArray1624.length;
		int[] is = new int[anIntArray1624.length + 1];
		Class61.method657(anIntArray1624, 0, is, 0,
				  anIntArray1624.length);
		anIntArray1624 = is;
		is[i] = arg0;
	    }
	} else {
	    int i_51_ = 2147483647;
	    int i_52_ = arg0 >> 16 & 0xff;
	    int i_53_ = arg0 >> 8 & 0xff;
	    int i_54_ = arg0 & 0xff;
	    for (int i_55_ = 0; i_55_ < anIntArray1624.length; i_55_++) {
		int i_56_ = anIntArray1624[i_55_];
		int i_57_ = i_56_ >> 16 & 0xff;
		int i_58_ = i_56_ >> 8 & 0xff;
		int i_59_ = i_56_ & 0xff;
		int i_60_ = i_52_ - i_57_;
		if (i_60_ < 0)
		    i_60_ = -i_60_;
		int i_61_ = i_53_ - i_58_;
		if (i_61_ < 0)
		    i_61_ = -i_61_;
		int i_62_ = i_54_ - i_59_;
		if (i_62_ < 0)
		    i_62_ = -i_62_;
		int i_63_ = i_60_ + i_61_ + i_62_;
		if (i_63_ < i_51_) {
		    i_51_ = i_63_;
		    i = i_55_;
		}
	    }
	}
	for (int i_64_ = anInt1619 - 1; i_64_ > 0; i_64_--) {
	    int i_65_ = i_64_ * anInt1623;
	    for (int i_66_ = anInt1623 - 1; i_66_ > 0; i_66_--) {
		if (anIntArray1624[aByteArray1626[i_66_ + i_65_] & 0xff] == 0
		    && (anIntArray1624[aByteArray1626[(i_66_ + i_65_ - 1
						       - anInt1623)] & 0xff]
			!= 0))
		    aByteArray1626[i_66_ + i_65_] = (byte) i;
	    }
	}
    }
    
    public int method1089() {
	return anInt1623 + anInt1625 + anInt1620;
    }
    
    public static Class124[] method1090(Class158 arg0, int arg1) {
	byte[] is = arg0.method2358(arg1, 30);
	if (is == null)
	    return null;
	return method1083(is);
    }
    
    public void method1091(int arg0) {
	int i = method1089();
	int i_67_ = method1081();
	if (anInt1623 != i || anInt1619 != i_67_) {
	    int i_68_ = arg0;
	    if (i_68_ > anInt1625)
		i_68_ = anInt1625;
	    int i_69_ = arg0;
	    if (i_69_ + anInt1625 + anInt1623 > i)
		i_69_ = i - anInt1625 - anInt1623;
	    int i_70_ = arg0;
	    if (i_70_ > anInt1618)
		i_70_ = anInt1618;
	    int i_71_ = arg0;
	    if (i_71_ + anInt1618 + anInt1619 > i_67_)
		i_71_ = i_67_ - anInt1618 - anInt1619;
	    int i_72_ = anInt1623 + i_68_ + i_69_;
	    int i_73_ = anInt1619 + i_70_ + i_71_;
	    byte[] is = new byte[i_72_ * i_73_];
	    if (aByteArray1622 == null) {
		for (int i_74_ = 0; i_74_ < anInt1619; i_74_++) {
		    int i_75_ = i_74_ * anInt1623;
		    int i_76_ = (i_74_ + i_70_) * i_72_ + i_68_;
		    for (int i_77_ = 0; i_77_ < anInt1623; i_77_++)
			is[i_76_++] = aByteArray1626[i_75_++];
		}
	    } else {
		byte[] is_78_ = new byte[i_72_ * i_73_];
		for (int i_79_ = 0; i_79_ < anInt1619; i_79_++) {
		    int i_80_ = i_79_ * anInt1623;
		    int i_81_ = (i_79_ + i_70_) * i_72_ + i_68_;
		    for (int i_82_ = 0; i_82_ < anInt1623; i_82_++) {
			is_78_[i_81_] = aByteArray1622[i_80_];
			is[i_81_++] = aByteArray1626[i_80_++];
		    }
		}
		aByteArray1622 = is_78_;
	    }
	    anInt1625 -= i_68_;
	    anInt1618 -= i_70_;
	    anInt1620 -= i_69_;
	    anInt1621 -= i_71_;
	    anInt1623 = i_72_;
	    anInt1619 = i_73_;
	    aByteArray1626 = is;
	}
    }
    
    public void method1092() {
	byte[] is = aByteArray1626;
	if (aByteArray1622 == null) {
	    for (int i = anInt1619 - 1; i >= 0; i--) {
		int i_83_ = i * anInt1623;
		for (int i_84_ = (i + 1) * anInt1623; i_83_ < i_84_; i_83_++) {
		    i_84_--;
		    byte i_85_ = is[i_83_];
		    is[i_83_] = is[i_84_];
		    is[i_84_] = i_85_;
		}
	    }
	} else {
	    byte[] is_86_ = aByteArray1622;
	    for (int i = anInt1619 - 1; i >= 0; i--) {
		int i_87_ = i * anInt1623;
		for (int i_88_ = (i + 1) * anInt1623; i_87_ < i_88_; i_87_++) {
		    i_88_--;
		    byte i_89_ = is[i_87_];
		    is[i_87_] = is[i_88_];
		    is[i_88_] = i_89_;
		    i_89_ = is_86_[i_87_];
		    is_86_[i_87_] = is_86_[i_88_];
		    is_86_[i_88_] = i_89_;
		}
	    }
	}
	int i = anInt1625;
	anInt1625 = anInt1620;
	anInt1620 = i;
    }
    
    public int[] method1093() {
	int i = method1089();
	int[] is = new int[i * method1081()];
	if (aByteArray1622 != null) {
	    for (int i_90_ = 0; i_90_ < anInt1619; i_90_++) {
		int i_91_ = i_90_ * anInt1623;
		int i_92_ = anInt1625 + (i_90_ + anInt1618) * i;
		for (int i_93_ = 0; i_93_ < anInt1623; i_93_++) {
		    is[i_92_++]
			= (aByteArray1622[i_91_] << 24
			   | anIntArray1624[aByteArray1626[i_91_] & 0xff]);
		    i_91_++;
		}
	    }
	} else {
	    for (int i_94_ = 0; i_94_ < anInt1619; i_94_++) {
		int i_95_ = i_94_ * anInt1623;
		int i_96_ = anInt1625 + (i_94_ + anInt1618) * i;
		for (int i_97_ = 0; i_97_ < anInt1623; i_97_++) {
		    int i_98_ = anIntArray1624[aByteArray1626[i_95_++] & 0xff];
		    if (i_98_ != 0)
			is[i_96_++] = ~0xffffff | i_98_;
		    else
			is[i_96_++] = 0;
		}
	    }
	}
	return is;
    }
    
    public void method1094(int arg0) {
	int i = -1;
	if (anIntArray1624.length < 255) {
	    for (int i_99_ = 0; i_99_ < anIntArray1624.length; i_99_++) {
		if (anIntArray1624[i_99_] == arg0) {
		    i = i_99_;
		    break;
		}
	    }
	    if (i == -1) {
		i = anIntArray1624.length;
		int[] is = new int[anIntArray1624.length + 1];
		Class61.method657(anIntArray1624, 0, is, 0,
				  anIntArray1624.length);
		anIntArray1624 = is;
		is[i] = arg0;
	    }
	} else {
	    int i_100_ = 2147483647;
	    int i_101_ = arg0 >> 16 & 0xff;
	    int i_102_ = arg0 >> 8 & 0xff;
	    int i_103_ = arg0 & 0xff;
	    for (int i_104_ = 0; i_104_ < anIntArray1624.length; i_104_++) {
		int i_105_ = anIntArray1624[i_104_];
		int i_106_ = i_105_ >> 16 & 0xff;
		int i_107_ = i_105_ >> 8 & 0xff;
		int i_108_ = i_105_ & 0xff;
		int i_109_ = i_101_ - i_106_;
		if (i_109_ < 0)
		    i_109_ = -i_109_;
		int i_110_ = i_102_ - i_107_;
		if (i_110_ < 0)
		    i_110_ = -i_110_;
		int i_111_ = i_103_ - i_108_;
		if (i_111_ < 0)
		    i_111_ = -i_111_;
		int i_112_ = i_109_ + i_110_ + i_111_;
		if (i_112_ < i_100_) {
		    i_100_ = i_112_;
		    i = i_104_;
		}
	    }
	}
	int i_113_ = 0;
	byte[] is = new byte[anInt1623 * anInt1619];
	for (int i_114_ = 0; i_114_ < anInt1619; i_114_++) {
	    for (int i_115_ = 0; i_115_ < anInt1623; i_115_++) {
		int i_116_ = aByteArray1626[i_113_] & 0xff;
		if (anIntArray1624[i_116_] == 0) {
		    if (i_115_ > 0
			&& (anIntArray1624[aByteArray1626[i_113_ - 1] & 0xff]
			    != 0))
			i_116_ = i;
		    else if (i_114_ > 0
			     && ((anIntArray1624
				  [aByteArray1626[i_113_ - anInt1623] & 0xff])
				 != 0))
			i_116_ = i;
		    else if (i_115_ < anInt1623 - 1
			     && (anIntArray1624
				 [aByteArray1626[i_113_ + 1] & 0xff]) != 0)
			i_116_ = i;
		    else if (i_114_ < anInt1619 - 1
			     && ((anIntArray1624
				  [aByteArray1626[i_113_ + anInt1623] & 0xff])
				 != 0))
			i_116_ = i;
		}
		is[i_113_++] = (byte) i_116_;
	    }
	}
	aByteArray1626 = is;
    }
}
