/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127
{
    public static Class131_Sub41_Sub1 aClass131_Sub41_Sub1_1703;
    public static Class180 aClass180_1704 = new Class180(16);
    public static Class158 aClass158_1705;
    public static Class177 aClass177_1706;
    public static int anInt1707 = (int) (Math.random() * 17.0) - 8;
    public static short[] aShortArray1708 = new short[1];
    public static int anInt1709;
    public static float aFloat1710;
    public static float aFloat1711;
    public static byte[] aByteArray1712 = new byte[1];
    public static byte[][][] aByteArrayArrayArray1713;
    public static int anInt1714;
    public static Class119 aClass119_1715;
    public static int anInt1716;
    public static byte[] aByteArray1717;
    public static int anInt1718;
    public static int anInt1719;
    public static byte[] aByteArray1720;
    public static short[] aShortArray1721;
    public static int anInt1722;
    public static int anInt1723;
    public static int anInt1724;
    public static int anInt1725;
    public static int anInt1726;
    public static Class180 aClass180_1727;
    public static int anInt1728;
    public static byte[] aByteArray1729;
    public static int anInt1730;
    public static short[] aShortArray1731;
    public static Class50[][][] aClass50ArrayArrayArray1732;
    public static byte[] aByteArray1733;
    public static int[] anIntArray1734;
    public static byte[] aByteArray1735;
    public static int anInt1736;
    public static int anInt1737;
    
    public static void method1110(Class130 arg0, int arg1, int arg2, int arg3,
				  int arg4, short[] arg5, byte[] arg6) {
	if (arg5 != null) {
	    for (int i = 0; i < arg5.length; i++) {
		Class187 class187 = Class55.method612(arg5[i] & 0xffff, 120);
		int i_0_ = class187.anInt2708;
		if (i_0_ != -1) {
		    Class51 class51
			= Class131_Sub2_Sub21.method1573((byte) -110, i_0_);
		    Class152 class152
			= class51.method594((class187.aBoolean2722
					     ? class187.aBoolean2687 : false),
					    (class187.aBoolean2719
					     ? arg6[i] >> 6 & 0x3 : 0),
					    -31318, arg0);
		    if (class152 != null) {
			int i_1_ = arg3 * class152.method2216() >> 2;
			int i_2_ = arg4 * class152.method2198() >> 2;
			if (class51.aBoolean684) {
			    int i_3_ = class187.anInt2702;
			    int i_4_ = class187.anInt2668;
			    if ((arg6[i] >> 6 & 0x1) == 1) {
				int i_5_ = i_3_;
				i_3_ = i_4_;
				i_4_ = i_5_;
			    }
			    i_1_ = i_3_ * arg3;
			    i_2_ = i_4_ * arg4;
			}
			if (i_1_ != 0 && i_2_ != 0) {
			    if (class51.anInt674 != 0)
				class152.method2201(arg1, arg2 - i_2_ + arg4,
						    i_1_, i_2_, 1,
						    (~0xffffff
						     | class51.anInt674),
						    1);
			    else
				class152.method2200(arg1, arg2 - i_2_ + arg4,
						    i_1_, i_2_);
			}
		    }
		}
	    }
	}
    }
    
    public static void method1111() {
	aClass131_Sub41_Sub1_1703 = null;
	aClass158_1705 = null;
	aClass180_1704 = null;
	aByteArrayArrayArray1713 = null;
	aShortArray1708 = null;
	aByteArray1712 = null;
	aClass177_1706 = null;
	aClass119_1715 = null;
	anIntArray1734 = null;
	aByteArray1720 = null;
	aByteArray1735 = null;
	aShortArray1731 = null;
	aByteArray1733 = null;
	aByteArray1717 = null;
	aShortArray1721 = null;
	aByteArray1729 = null;
	aClass180_1727 = null;
	aClass50ArrayArrayArray1732 = null;
    }
    
    public static void method1112(Class130 arg0, Stream arg1, int arg2,
				  int arg3, int arg4, int arg5, int[] arg6,
				  int[] arg7) {
	int i = arg1.readUnsignedByte(124);
	if ((i & 0x1) == 0) {
	    boolean bool = (i & 0x2) == 0;
	    int i_6_ = i >> 2 & 0x3f;
	    if (i_6_ != 62) {
		if (i_6_ == 63)
		    i_6_ = arg1.readUnsignedByte(-126);
		else if (bool)
		    i_6_ = arg6[i_6_];
		else
		    i_6_ = arg7[i_6_];
		if (bool) {
		    aByteArray1720[arg4 + arg5 * anInt1716] = (byte) i_6_;
		    aByteArray1733[arg4 + arg5 * anInt1716] = (byte) 0;
		} else {
		    aByteArray1733[arg4 + arg5 * anInt1716] = (byte) i_6_;
		    aByteArray1717[arg4 + arg5 * anInt1716] = (byte) 0;
		    aByteArray1720[arg4 + arg5 * anInt1716]
			= arg1.readSignedByte((byte) 127);
		}
	    }
	} else {
	    int i_7_ = (i >> 1 & 0x3) + 1;
	    boolean bool = (i & 0x8) != 0;
	    boolean bool_8_ = (i & 0x10) != 0;
	    for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
		int i_10_ = arg1.readUnsignedByte(-75);
		int i_11_ = 0;
		int i_12_ = 0;
		if (bool) {
		    i_11_ = arg1.readUnsignedByte(120);
		    i_12_ = arg1.readUnsignedByte(79);
		}
		int i_13_ = 0;
		if (bool_8_)
		    i_13_ = arg1.readUnsignedByte(-113);
		if (i_9_ == 0) {
		    aByteArray1720[arg4 + arg5 * anInt1716] = (byte) i_10_;
		    aByteArray1733[arg4 + arg5 * anInt1716] = (byte) i_11_;
		    aByteArray1717[arg4 + arg5 * anInt1716] = (byte) i_12_;
		    if (i_13_ == 1) {
			aShortArray1721[arg4 + arg5 * anInt1716]
			    = (short) (arg1.readUnsignedShort(8104) + 1);
			aByteArray1729[arg4 + arg5 * anInt1716]
			    = arg1.readSignedByte((byte) 127);
		    } else if (i_13_ > 1) {
			aShortArray1721[arg4 + arg5 * anInt1716] = (short) -1;
			short[] is = new short[i_13_];
			byte[] is_14_ = new byte[i_13_];
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
			    is[i_15_] = (short) arg1.readUnsignedShort(8104);
			    is_14_[i_15_] = arg1.readSignedByte((byte) 127);
			}
			aClass180_1727.method2523(false,
						  (long) (arg4 << 16 | arg5),
						  new Class131_Sub36(is,
								     is_14_));
		    }
		} else {
		    short[] is = null;
		    byte[] is_16_ = null;
		    if (i_13_ > 0) {
			is = new short[i_13_];
			is_16_ = new byte[i_13_];
			for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
			    is[i_17_] = (short) arg1.readUnsignedShort(8104);
			    is_16_[i_17_] = arg1.readSignedByte((byte) 127);
			}
		    }
		    if ((aClass50ArrayArrayArray1732[i_9_ - 1]
			 [arg2 - (anInt1725 >> 6)][arg3 - (anInt1728 >> 6)])
			== null)
			aClass50ArrayArrayArray1732[i_9_ - 1]
			    [arg2 - (anInt1725 >> 6)][arg3 - (anInt1728 >> 6)]
			    = new Class50();
		    Class1_Sub1 class1_sub1
			= new Class1_Sub1(arg4 & 0x3f, arg5 & 0x3f, i_10_,
					  i_11_, i_12_, is, is_16_);
		    aClass50ArrayArrayArray1732[i_9_ - 1]
			[arg2 - (anInt1725 >> 6)][arg3 - (anInt1728 >> 6)]
			.method584(class1_sub1, (byte) -127);
		}
	    }
	}
    }
    
    public static Class175 method1113(int arg0, int arg1) {
	Class175 class175 = new Class175();
	for (Class131_Sub41_Sub1 class131_sub41_sub1
		 = (Class131_Sub41_Sub1) aClass180_1704.method2520(0);
	     class131_sub41_sub1 != null;
	     class131_sub41_sub1
		 = (Class131_Sub41_Sub1) aClass180_1704.method2518(0)) {
	    if (class131_sub41_sub1.aBoolean6159
		&& class131_sub41_sub1.method1925(arg1, arg0, (byte) 109))
		class175.method2477(class131_sub41_sub1, -26);
	}
	return class175;
    }
    
    public static void method1114() {
	int[] is = new int[3];
	for (int i = 0; i < aClass177_1706.anInt2526; i++) {
	    boolean bool
		= (aClass131_Sub41_Sub1_1703.method1922
		   (94, aClass177_1706.anIntArray2528[i] >> 14 & 0x3fff,
		    aClass177_1706.anIntArray2528[i] >> 28 & 0x3,
		    aClass177_1706.anIntArray2528[i] & 0x3fff, is));
	    if (bool) {
		Class131_Sub20 class131_sub20
		    = new Class131_Sub20(aClass177_1706.anIntArray2529[i]);
		class131_sub20.anInt4419 = is[1] - anInt1725;
		class131_sub20.anInt4426 = is[2] - anInt1728;
		aClass119_1715.method1018((byte) -128, class131_sub20);
	    }
	}
    }
    
    public static Class119 method1115(Class130 arg0) {
	int i = anInt1736 - anInt1726;
	int i_18_ = anInt1723 - anInt1724;
	int i_19_ = (anInt1718 - anInt1737 << 16) / i;
	int i_20_ = (anInt1719 - anInt1722 << 16) / i_18_;
	return method1122(arg0, i_19_, i_20_, 0, 0);
    }
    
    public static void method1116(Class158 arg0) {
	aClass158_1705 = arg0;
	aClass180_1704.method2519(116);
	int i = aClass158_1705.method2359(119, "details");
	int[] is = aClass158_1705.method2349((byte) -114, i);
	for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
	    Class131_Sub41_Sub1 class131_sub41_sub1
		= Class33.method453(0, is[i_21_], i, aClass158_1705);
	    aClass180_1704.method2523(false,
				      (long) class131_sub41_sub1.anInt6161,
				      class131_sub41_sub1);
	}
	Class149.method2185(-70, true, false);
    }
    
    public static void method1117(Class130 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  short[] arg8, byte[] arg9, boolean arg10) {
	if (arg10 || arg5 != 0 || arg6 > 0) {
	    if (arg6 == 0)
		arg0.method1173(arg1, arg2, arg3, arg4, arg5, 0);
	    else {
		int i = arg7 & 0x3f;
		if (i == 0 || arg3 <= 1 || arg4 <= 1) {
		    int i_22_ = anIntArray1734[arg6];
		    if (arg10 || i_22_ != 0)
			arg0.method1173(arg1, arg2, arg3, arg4, i_22_, 0);
		} else {
		    int i_23_ = arg10 ? 0 : 1;
		    Class67.method707(i, anInt1714, 16711680, arg7 >> 6 & 0x3,
				      arg4, anIntArray1734[arg6], i_23_, arg1,
				      arg2, arg3, arg5, arg0,
				      aByteArrayArrayArray1713);
		}
	    }
	}
	if (arg8 != null) {
	    int i;
	    if (arg3 == 1)
		i = arg1;
	    else
		i = arg1 + arg3 - 1;
	    int i_24_;
	    if (arg4 == 1)
		i_24_ = arg2;
	    else
		i_24_ = arg2 + arg4 - 1;
	    for (int i_25_ = 0; i_25_ < arg8.length; i_25_++) {
		int i_26_ = arg9[i_25_] & 0x3f;
		if (i_26_ == 0 || i_26_ == 2 || i_26_ == 3 || i_26_ == 9) {
		    Class187 class187
			= Class55.method612(arg8[i_25_] & 0xffff, -16);
		    if (class187.anInt2708 == -1) {
			int i_27_ = -3355444;
			if (class187.anInt2663 == 1)
			    i_27_ = -3407872;
			int i_28_ = arg9[i_25_] >> 6 & 0x3;
			if (i_26_ == 0) {
			    if (i_28_ == 0)
				arg0.method1160(arg1, arg2, arg4, i_27_, 0);
			    else if (i_28_ == 1)
				arg0.method1176(arg1, arg2, arg3, i_27_, 0);
			    else if (i_28_ == 2)
				arg0.method1160(i, arg2, arg4, i_27_, 0);
			    else
				arg0.method1176(arg1, i_24_, arg3, i_27_, 0);
			} else if (i_26_ == 2) {
			    if (i_28_ == 0) {
				arg0.method1160(arg1, arg2, arg4, -1, 0);
				arg0.method1176(arg1, arg2, arg3, i_27_, 0);
			    } else if (i_28_ == 1) {
				arg0.method1160(i, arg2, arg4, -1, 0);
				arg0.method1176(arg1, arg2, arg3, i_27_, 0);
			    } else if (i_28_ == 2) {
				arg0.method1160(i, arg2, arg4, -1, 0);
				arg0.method1176(arg1, i_24_, arg3, i_27_, 0);
			    } else {
				arg0.method1160(arg1, arg2, arg4, -1, 0);
				arg0.method1176(arg1, i_24_, arg3, i_27_, 0);
			    }
			} else if (i_26_ == 3) {
			    if (i_28_ == 0)
				arg0.method1176(arg1, arg2, 1, i_27_, 0);
			    else if (i_28_ == 1)
				arg0.method1176(i, arg2, 1, i_27_, 0);
			    else if (i_28_ == 2)
				arg0.method1176(i, i_24_, 1, i_27_, 0);
			    else
				arg0.method1176(arg1, i_24_, 1, i_27_, 0);
			} else if (i_26_ == 9) {
			    if (i_28_ == 0 || i_28_ == 2) {
				for (int i_29_ = 0; i_29_ < arg4; i_29_++)
				    arg0.method1176(arg1 + i_29_,
						    i_24_ - i_29_, 1, i_27_,
						    0);
			    } else {
				for (int i_30_ = 0; i_30_ < arg4; i_30_++)
				    arg0.method1176(arg1 + i_30_, arg2 + i_30_,
						    1, i_27_, 0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method1118(Class130 arg0) {
	int i = anInt1736 - anInt1726;
	int i_31_ = anInt1723 - anInt1724;
	int i_32_ = (anInt1718 - anInt1737 << 16) / i;
	int i_33_ = (anInt1719 - anInt1722 << 16) / i_31_;
	method1119(arg0, i_32_, i_33_, 0, 0);
    }
    
    public static void method1119(Class130 arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	int i = anInt1736 - anInt1726;
	int i_34_ = anInt1723 - anInt1724;
	if (anInt1736 < anInt1716)
	    i++;
	if (anInt1723 < anInt1730)
	    i_34_++;
	for (int i_35_ = 0; i_35_ < i; i_35_++) {
	    int i_36_ = (arg3 + arg1 * i_35_ >> 16) + anInt1737;
	    int i_37_ = (arg3 + arg1 * (i_35_ + 1) >> 16) + anInt1737;
	    int i_38_ = i_37_ - i_36_;
	    if (i_38_ > 0) {
		int i_39_ = anInt1726 + i_35_;
		if (i_39_ < 0 || i_39_ >= anInt1716) {
		    for (int i_40_ = 0; i_40_ < i_34_; i_40_++) {
			int i_41_
			    = anInt1719 - (arg4 + arg2 * (i_40_ + 1) >> 16);
			int i_42_ = anInt1719 - (arg4 + arg2 * i_40_ >> 16);
			int i_43_ = i_42_ - i_41_;
			int i_44_;
			if (aClass131_Sub41_Sub1_1703.anInt6166 != -1)
			    i_44_ = (~0xffffff
				     | aClass131_Sub41_Sub1_1703.anInt6166);
			else if ((i_35_ + anInt1726 & 0x4)
				 != (i_40_ + anInt1723 & 0x4))
			    i_44_ = -11840664;
			else
			    i_44_ = anIntArray1734[Class105.anInt1371 + 1];
			if (i_44_ == 0)
			    i_44_ = -16777216;
			arg0.method1173(i_36_, i_41_, i_38_, i_43_, i_44_, 0);
		    }
		} else {
		    for (int i_45_ = 0; i_45_ < i_34_; i_45_++) {
			int i_46_
			    = anInt1719 - (arg4 + arg2 * (i_45_ + 1) >> 16);
			int i_47_ = anInt1719 - (arg4 + arg2 * i_45_ >> 16);
			int i_48_ = i_47_ - i_46_;
			if (i_48_ > 0) {
			    int i_49_ = i_45_ + anInt1724;
			    int i_50_ = i_39_ + i_49_ * anInt1716;
			    int i_51_ = 0;
			    int i_52_ = 0;
			    int i_53_ = 0;
			    if (i_49_ >= 0 && i_49_ < anInt1730) {
				i_51_ = ((aByteArray1735[i_50_] & 0xff) << 16
					 | aShortArray1731[i_50_] & 0xffff);
				if (i_51_ != 0)
				    i_51_ |= ~0xffffff;
				i_52_ = aByteArray1733[i_50_] & 0xff;
				i_53_ = aShortArray1721[i_50_] & 0xffff;
			    }
			    if (i_51_ == 0 && i_52_ == 0 && i_53_ == 0) {
				if (aClass131_Sub41_Sub1_1703.anInt6166 != -1)
				    i_51_ = (~0xffffff
					     | (aClass131_Sub41_Sub1_1703
						.anInt6166));
				else if ((i_35_ + anInt1726 & 0x4)
					 != (i_45_ + anInt1723 & 0x4))
				    i_51_ = -11840664;
				else
				    i_51_ = (anIntArray1734
					     [Class105.anInt1371 + 1]);
				if (i_51_ == 0)
				    i_51_ = -16777216;
				arg0.method1173(i_36_, i_46_, i_38_, i_48_,
						i_51_, 0);
			    } else if (i_53_ > 0) {
				if (i_53_ == 65535) {
				    Class131_Sub36 class131_sub36
					= ((Class131_Sub36)
					   (aClass180_1727.method2521
					    (119,
					     (long) (i_39_ << 16 | i_49_))));
				    if (class131_sub36 != null)
					method1117(arg0, i_36_, i_46_, i_38_,
						   i_48_, i_51_, i_52_,
						   aByteArray1717[i_50_],
						   (class131_sub36
						    .aShortArray4590),
						   (class131_sub36
						    .aByteArray4591),
						   true);
				} else {
				    aShortArray1708[0] = (short) (i_53_ - 1);
				    aByteArray1712[0] = aByteArray1729[i_50_];
				    method1117(arg0, i_36_, i_46_, i_38_,
					       i_48_, i_51_, i_52_,
					       aByteArray1717[i_50_],
					       aShortArray1708, aByteArray1712,
					       true);
				}
			    } else
				method1117(arg0, i_36_, i_46_, i_38_, i_48_,
					   i_51_, i_52_, aByteArray1717[i_50_],
					   null, null, true);
			}
		    }
		}
	    }
	}
	for (int i_54_ = -16; i_54_ < i + 16; i_54_++) {
	    int i_55_ = (arg3 + arg1 * i_54_ >> 16) + anInt1737;
	    int i_56_ = (arg3 + arg1 * (i_54_ + 1) >> 16) + anInt1737;
	    int i_57_ = i_56_ - i_55_;
	    if (i_57_ > 0) {
		int i_58_ = i_54_ + anInt1726;
		if (i_58_ >= 0 && i_58_ < anInt1716) {
		    for (int i_59_ = -16; i_59_ < i_34_ + 16; i_59_++) {
			int i_60_
			    = anInt1719 - (arg4 + arg2 * (i_59_ + 1) >> 16);
			int i_61_ = anInt1719 - (arg4 + arg2 * i_59_ >> 16);
			int i_62_ = i_61_ - i_60_;
			if (i_62_ > 0) {
			    int i_63_ = i_59_ + anInt1724;
			    if (i_63_ >= 0 && i_63_ < anInt1730) {
				int i_64_ = ((aShortArray1721
					      [i_58_ + i_63_ * anInt1716])
					     & 0xffff);
				if (i_64_ > 0) {
				    if (i_64_ == 65535) {
					Class131_Sub36 class131_sub36
					    = ((Class131_Sub36)
					       (aClass180_1727.method2521
						(107, (long) (i_58_ << 16
							      | i_63_))));
					if (class131_sub36 != null)
					    method1110(arg0, i_55_, i_60_,
						       i_57_, i_62_,
						       (class131_sub36
							.aShortArray4590),
						       (class131_sub36
							.aByteArray4591));
				    } else {
					aShortArray1708[0]
					    = (short) (i_64_ - 1);
					aByteArray1712[0]
					    = (aByteArray1729
					       [i_58_ + i_63_ * anInt1716]);
					method1110(arg0, i_55_, i_60_, i_57_,
						   i_62_, aShortArray1708,
						   aByteArray1712);
				    }
				} else
				    method1110(arg0, i_55_, i_60_, i_57_,
					       i_62_, null, null);
			    }
			}
		    }
		}
	    }
	}
	int i_65_ = anInt1726 >> 6;
	int i_66_ = anInt1724 >> 6;
	if (i_65_ < 0)
	    i_65_ = 0;
	if (i_66_ < 0)
	    i_66_ = 0;
	int i_67_ = anInt1736 >> 6;
	int i_68_ = anInt1723 >> 6;
	if (i_67_ >= aClass50ArrayArrayArray1732[0].length)
	    i_67_ = aClass50ArrayArrayArray1732[0].length - 1;
	if (i_68_ >= aClass50ArrayArrayArray1732[0][0].length)
	    i_68_ = aClass50ArrayArrayArray1732[0][0].length - 1;
	for (int i_69_ = 0; i_69_ < 3; i_69_++) {
	    for (int i_70_ = i_65_; i_70_ <= i_67_; i_70_++) {
		for (int i_71_ = i_66_; i_71_ <= i_68_; i_71_++) {
		    Class50 class50
			= aClass50ArrayArrayArray1732[i_69_][i_70_][i_71_];
		    if (class50 != null) {
			int i_72_ = (i_70_ + (anInt1725 >> 6)) * 64;
			int i_73_ = (i_71_ + (anInt1728 >> 6)) * 64;
			for (Class1_Sub1 class1_sub1
				 = (Class1_Sub1) class50.method586((byte) 42);
			     class1_sub1 != null;
			     class1_sub1
				 = (Class1_Sub1) class50.method589(80)) {
			    int i_74_ = (i_72_ + class1_sub1.aByte3493
					 - anInt1725 - anInt1726);
			    int i_75_ = (i_73_ + class1_sub1.aByte3495
					 - anInt1728 - anInt1724);
			    int i_76_
				= (arg3 + arg1 * i_74_ >> 16) + anInt1737;
			    int i_77_ = ((arg3 + arg1 * (i_74_ + 1) >> 16)
					 + anInt1737);
			    int i_78_ = (anInt1719
					 - (arg4 + arg2 * (i_75_ + 1) >> 16));
			    int i_79_
				= anInt1719 - (arg4 + arg2 * i_75_ >> 16);
			    method1117(arg0, i_76_, i_78_, i_77_ - i_76_,
				       i_79_ - i_78_, class1_sub1.anInt3494,
				       class1_sub1.aByte3490 & 0xff,
				       class1_sub1.aByte3492,
				       class1_sub1.aShortArray3491,
				       class1_sub1.aByteArray3496, false);
			}
		    }
		}
	    }
	    for (int i_80_ = i_65_; i_80_ <= i_67_; i_80_++) {
		for (int i_81_ = i_66_; i_81_ <= i_68_; i_81_++) {
		    Class50 class50
			= aClass50ArrayArrayArray1732[i_69_][i_80_][i_81_];
		    if (class50 != null) {
			int i_82_ = (i_80_ + (anInt1725 >> 6)) * 64;
			int i_83_ = (i_81_ + (anInt1728 >> 6)) * 64;
			for (Class1_Sub1 class1_sub1
				 = (Class1_Sub1) class50.method586((byte) 42);
			     class1_sub1 != null;
			     class1_sub1
				 = (Class1_Sub1) class50.method589(53)) {
			    int i_84_ = (i_82_ + class1_sub1.aByte3493
					 - anInt1725 - anInt1726);
			    int i_85_ = (i_83_ + class1_sub1.aByte3495
					 - anInt1728 - anInt1724);
			    int i_86_
				= (arg3 + arg1 * i_84_ >> 16) + anInt1737;
			    int i_87_ = ((arg3 + arg1 * (i_84_ + 1) >> 16)
					 + anInt1737);
			    int i_88_ = (anInt1719
					 - (arg4 + arg2 * (i_85_ + 1) >> 16));
			    int i_89_
				= anInt1719 - (arg4 + arg2 * i_85_ >> 16);
			    method1110(arg0, i_86_, i_88_, i_87_ - i_86_,
				       i_89_ - i_88_,
				       class1_sub1.aShortArray3491,
				       class1_sub1.aByteArray3496);
			}
		    }
		}
	    }
	}
    }
    
    public static void method1120(Interface4 arg0, int arg1, int arg2) {
	for (int i = 0; i < Class118.anInt1550; i++)
	    anIntArray1734[i + 1] = method1121(arg0, i, arg1, arg2);
    }
    
    public static int method1121(Interface4 arg0, int arg1, int arg2,
				 int arg3) {
	Class189 class189 = Class187.method2570(false, arg1);
	if (class189 == null)
	    return 0;
	int i = class189.anInt2760;
	if (i >= 0 && arg0.method10(-19907, i).aBoolean556)
	    i = -1;
	int i_90_;
	if (class189.anInt2776 >= 0) {
	    int i_91_ = class189.anInt2776;
	    int i_92_ = (i_91_ & 0x7f) + arg3;
	    if (i_92_ < 0)
		i_92_ = 0;
	    else if (i_92_ > 127)
		i_92_ = 127;
	    int i_93_ = (i_91_ + arg2 & 0xfc00) + (i_91_ & 0x380) + i_92_;
	    i_90_ = ~0xffffff | (Class88.anIntArray1171
				 [((Class131_Sub2_Sub22.method1575
				    ((byte) -127,
				     Class45.method560((byte) -18, 96, i_93_)))
				   & 0xffff)]);
	} else if (i >= 0)
	    i_90_
		= ~0xffffff | (Class88.anIntArray1171
			       [(Class131_Sub2_Sub22.method1575
				 ((byte) -128,
				  Class45.method560((byte) -119, 96,
						    (arg0.method10(-19907, i)
						     .aShort578)))) & 0xffff]);
	else if (class189.anInt2766 == -1)
	    i_90_ = 0;
	else {
	    int i_94_ = class189.anInt2766;
	    int i_95_ = (i_94_ & 0x7f) + arg3;
	    if (i_95_ < 0)
		i_95_ = 0;
	    else if (i_95_ > 127)
		i_95_ = 127;
	    int i_96_ = (i_94_ + arg2 & 0xfc00) + (i_94_ & 0x380) + i_95_;
	    i_90_ = ~0xffffff | (Class88.anIntArray1171
				 [((Class131_Sub2_Sub22.method1575
				    ((byte) -23,
				     Class45.method560((byte) -90, 96, i_96_)))
				   & 0xffff)]);
	}
	return i_90_;
    }
    
    public static Class119 method1122(Class130 arg0, int arg1, int arg2,
				      int arg3, int arg4) {
	for (Class131_Sub20 class131_sub20
		 = (Class131_Sub20) aClass119_1715.method1007(0);
	     class131_sub20 != null;
	     class131_sub20 = (Class131_Sub20) aClass119_1715.method1014(0))
	    method1130(arg0, class131_sub20, arg1, arg2, arg3, arg4);
	return aClass119_1715;
    }
    
    public static void method1123(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	anInt1726 = arg0 - anInt1725;
	anInt1723 = arg1 - anInt1728;
	anInt1736 = arg2 - anInt1725;
	anInt1724 = arg3 - anInt1728;
	anInt1737 = arg4;
	anInt1722 = arg5;
	anInt1718 = arg6;
	anInt1719 = arg7;
    }
    
    public static void method1124() {
	aByteArray1720 = null;
	aByteArray1735 = null;
	aShortArray1731 = null;
	aByteArray1733 = null;
	aByteArray1717 = null;
	aShortArray1721 = null;
	aByteArray1729 = null;
	aClass180_1727 = null;
	aClass50ArrayArrayArray1732 = null;
	anIntArray1734 = null;
    }
    
    public static void method1125(Class130 arg0, int arg1, int arg2) {
	Stream stream
	    = new Stream(aClass158_1705.method2370
				 (aClass131_Sub41_Sub1_1703.aString6167,
				  "area", (byte) 104));
	int i = stream.readUnsignedByte(60);
	int[] is = new int[i];
	for (int i_97_ = 0; i_97_ < i; i_97_++)
	    is[i_97_] = stream.readUnsignedByte(117);
	int i_98_ = stream.readUnsignedByte(109);
	int[] is_99_ = new int[i_98_];
	for (int i_100_ = 0; i_100_ < i_98_; i_100_++)
	    is_99_[i_100_] = stream.readUnsignedByte(-51);
	while (stream.offset
	       < stream.data.length) {
	    if (stream.readUnsignedByte(-82) == 0) {
		int i_101_ = stream.readUnsignedByte(57);
		int i_102_ = stream.readUnsignedByte(-18);
		for (int i_103_ = 0; i_103_ < 64; i_103_++) {
		    for (int i_104_ = 0; i_104_ < 64; i_104_++) {
			int i_105_ = i_101_ * 64 + i_103_ - anInt1725;
			int i_106_ = i_102_ * 64 + i_104_ - anInt1728;
			method1112(arg0, stream, i_101_, i_102_,
				   i_105_, i_106_, is, is_99_);
		    }
		}
	    } else {
		int i_107_ = stream.readUnsignedByte(74);
		int i_108_ = stream.readUnsignedByte(-128);
		int i_109_ = stream.readUnsignedByte(60);
		int i_110_ = stream.readUnsignedByte(-99);
		for (int i_111_ = 0; i_111_ < 8; i_111_++) {
		    for (int i_112_ = 0; i_112_ < 8; i_112_++) {
			int i_113_
			    = i_107_ * 64 + i_109_ * 8 + i_111_ - anInt1725;
			int i_114_
			    = i_108_ * 64 + i_110_ * 8 + i_112_ - anInt1728;
			method1112(arg0, stream, i_107_, i_108_,
				   i_113_, i_114_, is, is_99_);
		    }
		}
	    }
	}
	Object object = null;
	aByteArray1735 = new byte[anInt1716 * anInt1730];
	aShortArray1731 = new short[anInt1716 * anInt1730];
	for (int i_115_ = 0; i_115_ < 3; i_115_++) {
	    byte[] is_116_ = new byte[anInt1716 * anInt1730];
	    for (int i_117_ = 0;
		 i_117_ < aClass50ArrayArrayArray1732[i_115_].length;
		 i_117_++) {
		for (int i_118_ = 0;
		     i_118_ < aClass50ArrayArrayArray1732[i_115_][0].length;
		     i_118_++) {
		    Class50 class50
			= aClass50ArrayArrayArray1732[i_115_][i_117_][i_118_];
		    if (class50 != null) {
			for (Class1_Sub1 class1_sub1
				 = (Class1_Sub1) class50.method586((byte) 42);
			     class1_sub1 != null;
			     class1_sub1 = (Class1_Sub1) class50.method589(44))
			    is_116_[(i_117_ * 64 + class1_sub1.aByte3493
				     + ((i_118_ * 64 + class1_sub1.aByte3495)
					* anInt1716))]
				= (byte) class1_sub1.anInt3494;
		    }
		}
	    }
	    method1128(is_116_, aByteArray1735, aShortArray1731, arg1, arg2);
	    for (int i_119_ = 0;
		 i_119_ < aClass50ArrayArrayArray1732[i_115_].length;
		 i_119_++) {
		for (int i_120_ = 0;
		     i_120_ < aClass50ArrayArrayArray1732[i_115_][0].length;
		     i_120_++) {
		    Class50 class50
			= aClass50ArrayArrayArray1732[i_115_][i_119_][i_120_];
		    if (class50 != null) {
			for (Class1_Sub1 class1_sub1
				 = (Class1_Sub1) class50.method586((byte) 42);
			     class1_sub1 != null;
			     class1_sub1
				 = (Class1_Sub1) class50.method589(93)) {
			    int i_121_
				= (i_119_ * 64 + class1_sub1.aByte3493
				   + ((i_120_ * 64 + class1_sub1.aByte3495)
				      * anInt1716));
			    class1_sub1.anInt3494
				= ((aByteArray1735[i_121_] & 0xff) << 16
				   | aShortArray1731[i_121_] & 0xffff);
			    if (class1_sub1.anInt3494 != 0)
				class1_sub1.anInt3494 |= ~0xffffff;
			}
		    }
		}
	    }
	}
	method1128(aByteArray1720, aByteArray1735, aShortArray1731, arg1,
		   arg2);
	aByteArray1720 = null;
	method1126();
    }
    
    public static void method1126() {
	for (int i = 0; i < anInt1716; i++) {
	    for (int i_122_ = 0; i_122_ < anInt1730; i_122_++) {
		int i_123_ = aShortArray1721[i + i_122_ * anInt1716] & 0xffff;
		if (i_123_ != 0) {
		    if (i_123_ == 65535) {
			Class131_Sub36 class131_sub36
			    = ((Class131_Sub36)
			       aClass180_1727.method2521(-88,
							 (long) (i << 16
								 | i_122_)));
			if (class131_sub36 != null) {
			    for (int i_124_ = 0;
				 (i_124_
				  < class131_sub36.aShortArray4590.length);
				 i_124_++) {
				Class187 class187
				    = Class55.method612((class131_sub36
							 .aShortArray4590
							 [i_124_]) & 0xffff,
							120);
				int i_125_ = class187.anInt2688;
				if (class187.anIntArray2653 != null) {
				    class187 = class187.method2573(18);
				    if (class187 != null)
					i_125_ = class187.anInt2688;
				}
				if (i_125_ != -1) {
				    Class131_Sub20 class131_sub20
					= new Class131_Sub20(i_125_);
				    class131_sub20.anInt4419 = i;
				    class131_sub20.anInt4426 = i_122_;
				    aClass119_1715.method1018((byte) -123,
							      class131_sub20);
				}
			    }
			}
		    } else {
			Class187 class187 = Class55.method612(i_123_ - 1, -88);
			int i_126_ = class187.anInt2688;
			if (class187.anIntArray2653 != null) {
			    class187 = class187.method2573(18);
			    if (class187 != null)
				i_126_ = class187.anInt2688;
			}
			if (i_126_ != -1) {
			    Class131_Sub20 class131_sub20
				= new Class131_Sub20(i_126_);
			    class131_sub20.anInt4419 = i;
			    class131_sub20.anInt4426 = i_122_;
			    aClass119_1715.method1018((byte) -128,
						      class131_sub20);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_127_ = 0;
		 i_127_ < aClass50ArrayArrayArray1732[0].length; i_127_++) {
		for (int i_128_ = 0;
		     i_128_ < aClass50ArrayArrayArray1732[0][0].length;
		     i_128_++) {
		    Class50 class50
			= aClass50ArrayArrayArray1732[i][i_127_][i_128_];
		    if (class50 != null) {
			for (Class1_Sub1 class1_sub1
				 = (Class1_Sub1) class50.method586((byte) 42);
			     class1_sub1 != null;
			     class1_sub1
				 = (Class1_Sub1) class50.method589(-121)) {
			    if (class1_sub1.aShortArray3491 != null) {
				for (int i_129_ = 0;
				     (i_129_
				      < class1_sub1.aShortArray3491.length);
				     i_129_++) {
				    Class187 class187
					= Class55.method612(((class1_sub1
							      .aShortArray3491
							      [i_129_])
							     & 0xffff),
							    -125);
				    int i_130_ = class187.anInt2688;
				    if (class187.anIntArray2653 != null) {
					class187 = class187.method2573(18);
					if (class187 != null)
					    i_130_ = class187.anInt2688;
				    }
				    if (i_130_ != -1) {
					Class131_Sub20 class131_sub20
					    = new Class131_Sub20(i_130_);
					class131_sub20.anInt4419
					    = ((i_127_ + (anInt1725 >> 6)) * 64
					       + class1_sub1.aByte3493
					       - anInt1725);
					class131_sub20.anInt4426
					    = ((i_128_ + (anInt1728 >> 6)) * 64
					       + class1_sub1.aByte3495
					       - anInt1728);
					aClass119_1715.method1018
					    ((byte) -127, class131_sub20);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static Class131_Sub41_Sub1 method1127(int arg0, int arg1) {
	for (Class131_Sub41_Sub1 class131_sub41_sub1
		 = (Class131_Sub41_Sub1) aClass180_1704.method2520(0);
	     class131_sub41_sub1 != null;
	     class131_sub41_sub1
		 = (Class131_Sub41_Sub1) aClass180_1704.method2518(0)) {
	    if (class131_sub41_sub1.aBoolean6159
		&& class131_sub41_sub1.method1925(arg1, arg0, (byte) 109))
		return class131_sub41_sub1;
	}
	return null;
    }
    
    public static void method1128(byte[] arg0, byte[] arg1, short[] arg2,
				  int arg3, int arg4) {
	int[] is = new int[anInt1730];
	int[] is_131_ = new int[anInt1730];
	int[] is_132_ = new int[anInt1730];
	int[] is_133_ = new int[anInt1730];
	int[] is_134_ = new int[anInt1730];
	for (int i = -5; i < anInt1716; i++) {
	    int i_135_ = i + 5;
	    int i_136_ = i - 5;
	    for (int i_137_ = 0; i_137_ < anInt1730; i_137_++) {
		if (i_135_ < anInt1716) {
		    int i_138_ = arg0[i_135_ + i_137_ * anInt1716] & 0xff;
		    if (i_138_ > 0) {
			Class108 class108
			    = Class186.method2561(-122, i_138_ - 1);
			is[i_137_] += class108.anInt1408;
			is_131_[i_137_] += class108.anInt1410;
			is_132_[i_137_] += class108.anInt1411;
			is_133_[i_137_] += class108.anInt1413;
			is_134_[i_137_]++;
		    }
		}
		if (i_136_ >= 0) {
		    int i_139_ = arg0[i_136_ + i_137_ * anInt1716] & 0xff;
		    if (i_139_ > 0) {
			Class108 class108
			    = Class186.method2561(-121, i_139_ - 1);
			is[i_137_] -= class108.anInt1408;
			is_131_[i_137_] -= class108.anInt1410;
			is_132_[i_137_] -= class108.anInt1411;
			is_133_[i_137_] -= class108.anInt1413;
			is_134_[i_137_]--;
		    }
		}
	    }
	    if (i >= 0) {
		int i_140_ = 0;
		int i_141_ = 0;
		int i_142_ = 0;
		int i_143_ = 0;
		int i_144_ = 0;
		for (int i_145_ = -5; i_145_ < anInt1730; i_145_++) {
		    int i_146_ = i_145_ + 5;
		    if (i_146_ < anInt1730) {
			i_140_ += is[i_146_];
			i_141_ += is_131_[i_146_];
			i_142_ += is_132_[i_146_];
			i_143_ += is_133_[i_146_];
			i_144_ += is_134_[i_146_];
		    }
		    int i_147_ = i_145_ - 5;
		    if (i_147_ >= 0) {
			i_140_ -= is[i_147_];
			i_141_ -= is_131_[i_147_];
			i_142_ -= is_132_[i_147_];
			i_143_ -= is_133_[i_147_];
			i_144_ -= is_134_[i_147_];
		    }
		    if (i_145_ >= 0 && i_144_ > 0) {
			if ((arg0[i + i_145_ * anInt1716] & 0xff) == 0) {
			    int i_148_ = i + i_145_ * anInt1716;
			    arg1[i_148_] = (byte) 0;
			    arg2[i_148_] = (short) 0;
			} else {
			    int i_149_
				= (i_143_ == 0 ? 0
				   : Class180.method2526(i_141_ / i_144_,
							 i_142_ / i_144_,
							 i_140_ * 256 / i_143_,
							 13552));
			    int i_150_ = (i_149_ & 0x7f) + arg4;
			    if (i_150_ < 0)
				i_150_ = 0;
			    else if (i_150_ > 127)
				i_150_ = 127;
			    int i_151_ = ((i_149_ + arg3 & 0xfc00)
					  + (i_149_ & 0x380) + i_150_);
			    int i_152_ = i + i_145_ * anInt1716;
			    int i_153_
				= (Class88.anIntArray1171
				   [((Class131_Sub2_Sub22.method1575
				      ((byte) -16,
				       Class131_Sub2.method1468(i_151_,
								(byte) -80,
								96)))
				     & 0xffff)]);
			    arg1[i_152_] = (byte) (i_153_ >> 16 & 0xff);
			    arg2[i_152_] = (short) (i_153_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    public static void method1129() {
	aByteArray1720 = new byte[anInt1716 * anInt1730];
	aByteArray1733 = new byte[anInt1716 * anInt1730];
	aByteArray1717 = new byte[anInt1716 * anInt1730];
	aShortArray1721 = new short[anInt1716 * anInt1730];
	aByteArray1729 = new byte[anInt1716 * anInt1730];
	aClass180_1727 = new Class180(1024);
	aClass50ArrayArrayArray1732
	    = new Class50[3][anInt1716 >> 6][anInt1730 >> 6];
	anIntArray1734 = new int[Class118.anInt1550 + 1];
    }
    
    public static void method1130(Class130 arg0, Class131_Sub20 arg1, int arg2,
				  int arg3, int arg4, int arg5) {
	arg1.anInt4428
	    = anInt1737 + (arg4 + arg2 * (arg1.anInt4419 - anInt1726) >> 16);
	arg1.anInt4429
	    = anInt1719 - (arg5 + arg3 * (arg1.anInt4426 - anInt1724) >> 16);
    }
    
    public static void method1131(int arg0) {
	aClass131_Sub41_Sub1_1703
	    = (Class131_Sub41_Sub1) aClass180_1704.method2521(79, (long) arg0);
    }
    
    public static Class131_Sub41_Sub1 method1132(int arg0) {
	return ((Class131_Sub41_Sub1)
		aClass180_1704.method2521(94, (long) arg0));
    }
    
    static {
	anInt1709 = (int) (Math.random() * 11.0) - 5;
	aClass119_1715 = new Class119();
    }
}
