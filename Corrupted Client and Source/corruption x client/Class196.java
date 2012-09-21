/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class196
{
    public static int[] anIntArray2857 = new int[4];
    public int anInt2858;
    public int anInt2859;
    public int anInt2860;
    public static Class154 aClass154_2861;
    public static Class152 aClass152_2862;
    public int anInt2863;
    public int anInt2864;
    public int anInt2865;
    public static Class152 aClass152_2866;
    public int anInt2867;
    public int anInt2868;
    public boolean aBoolean2869;
    public int anInt2870;
    public int anInt2871;
    public Class152 aClass152_2872;
    public int anInt2873;
    public int anInt2874;
    
    public void method2663(Class130 arg0, Class196 arg1) {
	Class116 class116
	    = Class134.method2097(anInt2864, 0, Class148.aClass158_1977, 1);
	if (class116 != null) {
	    arg0.method1228(anIntArray2857);
	    arg0.method1188(0, 0, anInt2860, anInt2860);
	    arg0.method1173(0, 0, anInt2860, anInt2860, 0, 0);
	    int i = 0;
	    int i_0_ = 0;
	    int i_1_ = 256;
	    if (arg1 != null) {
		if (arg1.aBoolean2869) {
		    i = -arg1.anInt2871;
		    i_0_ = -arg1.anInt2858;
		    i_1_ = -arg1.anInt2865;
		} else {
		    i = anInt2871 - arg1.anInt2871;
		    i_0_ = anInt2858 - arg1.anInt2858;
		    i_1_ = anInt2865 - arg1.anInt2865;
		}
	    }
	    if (anInt2870 != 0) {
		int i_2_ = -anInt2870 & 0x3fff;
		int i_3_ = Class31.anIntArray434[i_2_];
		int i_4_ = Class31.anIntArray425[i_2_];
		int i_5_ = i_0_ * i_4_ - i_1_ * i_3_ >> 15;
		i_1_ = i_0_ * i_3_ + i_1_ * i_4_ >> 15;
		i_0_ = i_5_;
	    }
	    if (anInt2863 != 0) {
		int i_6_ = -anInt2863 & 0x3fff;
		int i_7_ = Class31.anIntArray434[i_6_];
		int i_8_ = Class31.anIntArray425[i_6_];
		int i_9_ = i_1_ * i_7_ + i * i_8_ >> 15;
		i_1_ = i_1_ * i_8_ - i * i_7_ >> 15;
		i = i_9_;
	    }
	    arg0.method1161(1.0F);
	    arg0.method1232(16777215, 1.0F, 1.0F, (float) i, (float) i_0_,
			    (float) i_1_);
	    Class154 class154 = arg0.method1218(class116, 1024, 0, 64, 768);
	    int i_10_ = class154.method2267() - class154.method2265();
	    int i_11_ = class154.method2258() - class154.method2256();
	    int i_12_ = class154.method2265() + i_10_ / 2;
	    int i_13_ = class154.method2256() + i_11_ / 2;
	    int i_14_ = i_10_ > i_11_ ? i_10_ : i_11_;
	    arg0.method1193(i_12_, i_13_, i_14_, i_14_);
	    arg0.method1260(arg0.method1257());
	    Class9 class9 = arg0.method1238();
	    class9.method181(0, 0, arg0.method1261() - class154.method2263());
	    class154.method2245(class9, null, arg0.method1261(), 1);
	    aClass152_2872 = arg0.method1263(0, 0, anInt2860, anInt2860, true);
	    aClass152_2872.method2199(0, 0, 3);
	    arg0.method1188(anIntArray2857[0], anIntArray2857[1],
			    anIntArray2857[2], anIntArray2857[3]);
	}
    }
    
    public static void method2664() {
	aClass154_2861 = null;
	aClass152_2862 = null;
	aClass152_2866 = null;
	anIntArray2857 = null;
    }
    
    public boolean method2665(Class130 arg0, Class196 arg1) {
	if (aClass152_2872 == null) {
	    if (anInt2873 == 0) {
		if (Class131_Sub10.anInterface4_4227.method11(false,
							      anInt2864)) {
		    int[] is
			= Class131_Sub10.anInterface4_4227.method12(anInt2860,
								    anInt2864,
								    false,
								    -11047,
								    0.7F,
								    anInt2860);
		    aClass152_2872 = arg0.method1247(is, 0, anInt2860,
						     anInt2860, anInt2860);
		}
	    } else if (anInt2873 == 2)
		method2663(arg0, arg1);
	    else if (anInt2873 == 1)
		method2669(arg0, arg1);
	}
	if (aClass152_2872 == null)
	    return false;
	return true;
    }
    
    public boolean method2666(int arg0, int arg1, int arg2, int arg3) {
	int i;
	int i_15_;
	int i_16_;
	if (!aBoolean2869) {
	    i = anInt2871 - arg0;
	    i_15_ = anInt2858 - arg1;
	    i_16_ = anInt2865 - arg2;
	    anInt2868 = (int) Math.sqrt((double) (i * i + i_15_ * i_15_
						  + i_16_ * i_16_));
	    if (anInt2868 == 0)
		anInt2868 = 1;
	    i = (i << 8) / anInt2868;
	    i_15_ = (i_15_ << 8) / anInt2868;
	    i_16_ = (i_16_ << 8) / anInt2868;
	} else {
	    anInt2868 = 1073741823;
	    i = anInt2871;
	    i_15_ = anInt2858;
	    i_16_ = anInt2865;
	}
	int i_17_ = (int) (Math.sqrt((double) (i * i + i_15_ * i_15_
					       + i_16_ * i_16_))
			   * 256.0);
	if (i_17_ > 128) {
	    i = (i << 16) / i_17_;
	    i_15_ = (i_15_ << 16) / i_17_;
	    i_16_ = (i_16_ << 16) / i_17_;
	    anInt2859 = anInt2867 * arg3 / (aBoolean2869 ? 1024 : anInt2868);
	} else
	    anInt2859 = 0;
	if (anInt2859 < 8) {
	    aClass152_2872 = null;
	    return false;
	}
	int i_18_ = Class101.method887(1388313616, anInt2859);
	if (i_18_ > arg3)
	    i_18_ = Class144.method2152(arg3, (byte) 103);
	if (i_18_ > 512)
	    i_18_ = 512;
	if (i_18_ != anInt2860)
	    anInt2860 = i_18_;
	anInt2870 = (int) (Math.asin((double) ((float) i_15_ / 256.0F))
			   * 5215.189175235227) & 0x3fff;
	anInt2863 = (int) (Math.atan2((double) i, (double) -i_16_)
			   * 5215.189175235227) & 0x3fff;
	aClass152_2872 = null;
	return true;
    }
    
    public static void method2667() {
	aClass154_2861 = null;
	aClass152_2866 = null;
    }
    
    public void method2668(Class130 arg0, int arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6) {
	if (aClass152_2872 != null) {
	    int i = anInt2870 - arg5 & 0x3fff;
	    int i_19_ = anInt2863 - arg6 & 0x3fff;
	    if (i_19_ > 8192)
		i_19_ -= 16384;
	    if (i > 8192)
		i -= 16384;
	    int i_20_ = i * arg4 / 4096 + (arg4 - anInt2859) / 2;
	    int i_21_ = i_19_ * arg4 / -4096 + (arg3 - anInt2859) / 2;
	    if (i_20_ < arg4 && i_20_ + anInt2859 > 0 && i_21_ < arg3
		&& i_21_ + anInt2859 > 0)
		aClass152_2872.method2200(i_21_ + arg1, i_20_ + arg2,
					  anInt2859, anInt2859);
	}
    }
    
    public void method2669(Class130 arg0, Class196 arg1) {
	method2671(arg0);
	method2672(arg0);
	arg0.method1228(anIntArray2857);
	arg0.method1188(0, 0, anInt2860, anInt2860);
	arg0.method1169();
	arg0.method1173(0, 0, anInt2860, anInt2860, ~0xffffff | anInt2874, 0);
	int i = 0;
	int i_22_ = 0;
	int i_23_ = 256;
	if (arg1 != null) {
	    if (arg1.aBoolean2869) {
		i = -arg1.anInt2871;
		i_22_ = -arg1.anInt2858;
		i_23_ = -arg1.anInt2865;
	    } else {
		i = arg1.anInt2871 - anInt2871;
		i_22_ = arg1.anInt2858 - anInt2858;
		i_23_ = arg1.anInt2865 - anInt2865;
	    }
	}
	if (anInt2870 != 0) {
	    int i_24_ = Class31.anIntArray434[anInt2870];
	    int i_25_ = Class31.anIntArray425[anInt2870];
	    int i_26_ = i_22_ * i_25_ - i_23_ * i_24_ >> 15;
	    i_23_ = i_22_ * i_24_ + i_23_ * i_25_ >> 15;
	    i_22_ = i_26_;
	}
	if (anInt2863 != 0) {
	    int i_27_ = Class31.anIntArray434[anInt2863];
	    int i_28_ = Class31.anIntArray425[anInt2863];
	    int i_29_ = i_23_ * i_27_ + i * i_28_ >> 15;
	    i_23_ = i_23_ * i_28_ - i * i_27_ >> 15;
	    i = i_29_;
	}
	Class154 class154 = aClass154_2861.method2287((byte) 0, 25600, true);
	if (!arg0.method1197()) {
	    class154.method2260((short) 127,
				(Class131_Sub10.anInterface4_4227.method10
				 (-19907, anInt2864).aShort578));
	    class154.method2281((short) 0, (short) -1);
	} else
	    class154.method2281((short) 0, (short) anInt2864);
	arg0.method1161(1.0F);
	arg0.method1232(16777215, 1.0F, 1.0F, (float) i, (float) i_22_,
			(float) i_23_);
	int i_30_ = (1024 * anInt2860
		     / (class154.method2267() - class154.method2265()));
	if (anInt2874 != 0)
	    i_30_ = i_30_ * 13 / 16;
	arg0.method1193(anInt2860 / 2, anInt2860 / 2, i_30_, i_30_);
	arg0.method1260(arg0.method1257());
	Class9 class9 = arg0.method1257();
	class9.method181(0, 0, arg0.method1261() - class154.method2263());
	class154.method2245(class9, null, 1024, 1);
	int i_31_ = anInt2860 * 13 / 16;
	int i_32_ = (anInt2860 - i_31_) / 2;
	aClass152_2862.method2201(i_32_, i_32_, i_31_, i_31_, 1,
				  ~0xffffff | anInt2874, 1);
	aClass152_2872 = arg0.method1263(0, 0, anInt2860, anInt2860, true);
	arg0.method1169();
	arg0.method1173(0, 0, anInt2860, anInt2860, 0, 0);
	aClass152_2866.method2201(0, 0, anInt2860, anInt2860, 0, 0, 0);
	aClass152_2872.method2199(0, 0, 0);
	arg0.method1188(anIntArray2857[0], anIntArray2857[1],
			anIntArray2857[2], anIntArray2857[3]);
    }
    
    public void method2670() {
	aClass152_2872 = null;
    }
    
    public static void method2671(Class130 arg0) {
	if (aClass154_2861 == null) {
	    Class116 class116 = new Class116(580, 1104, 1);
	    class116.method996((short) 32767, -1286, (byte) 0, (short) 0,
			       (byte) 0, (short) 1024, (short) 1024, (byte) 0,
			       (short) 1024, (short) 0);
	    class116.method991(0, 0, 128, -2);
	    class116.method991(0, 0, -128, -2);
	    for (int i = 0; i <= 24; i++) {
		int i_33_ = i * 8192 / 24;
		int i_34_ = Class31.anIntArray434[i_33_];
		int i_35_ = Class31.anIntArray425[i_33_];
		for (int i_36_ = 1; i_36_ < 24; i_36_++) {
		    int i_37_ = i_36_ * 8192 / 24;
		    int i_38_ = Class31.anIntArray425[i_37_] >> 8;
		    int i_39_ = Class31.anIntArray434[i_37_] * i_34_ >> 23;
		    int i_40_ = Class31.anIntArray434[i_37_] * i_35_ >> 23;
		    class116.method991(-i_39_, i_40_, i_38_, -2);
		}
		if (i > 0) {
		    int i_41_ = i * 23 + 2;
		    int i_42_ = i_41_ - 23;
		    class116.method990(i_41_, 0, (short) 127, i_42_, (byte) 0,
				       (byte) 0, (short) 0, (byte) -88,
				       (byte) 0);
		    for (int i_43_ = 1; i_43_ < 23; i_43_++) {
			int i_44_ = i_42_ + 1;
			int i_45_ = i_41_ + 1;
			class116.method990(i_41_, i_42_, (short) 127, i_44_,
					   (byte) 0, (byte) 0, (short) 0,
					   (byte) -105, (byte) 0);
			class116.method990(i_41_, i_44_, (short) 127, i_45_,
					   (byte) 0, (byte) 0, (short) 0,
					   (byte) -63, (byte) 0);
			i_42_ = i_44_;
			i_41_ = i_45_;
		    }
		    class116.method990(1, i_41_, (short) 127, i_42_, (byte) 0,
				       (byte) 0, (short) 0, (byte) 105,
				       (byte) 0);
		}
	    }
	    class116.anInt1489 = class116.anInt1528;
	    class116.anIntArray1524 = null;
	    class116.anIntArray1500 = null;
	    class116.aByteArray1522 = null;
	    aClass154_2861 = arg0.method1218(class116, 25600, 33, 64, 768);
	}
    }
    
    public Class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
		    int arg6, boolean arg7) {
	anInt2871 = arg2;
	anInt2858 = arg3;
	anInt2865 = arg4;
	aBoolean2869 = arg7;
	anInt2864 = arg1;
	anInt2874 = arg6;
	anInt2867 = arg5;
	anInt2873 = arg0;
    }
    
    public static void method2672(Class130 arg0) {
	if (aClass152_2866 == null) {
	    int[] is = new int[16384];
	    int[] is_46_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_47_ = 64 - i;
		i_47_ *= i_47_;
		int i_48_ = 128 - i - 1;
		int i_49_ = i * 128;
		int i_50_ = i_48_ * 128;
		for (int i_51_ = 0; i_51_ < 64; i_51_++) {
		    int i_52_ = 64 - i_51_;
		    i_52_ *= i_52_;
		    int i_53_ = 128 - i_51_ - 1;
		    int i_54_ = 256 - (i_52_ + i_47_ << 8) / 4096;
		    i_54_ = i_54_ * 16 * 192 / 1536;
		    if (i_54_ < 0)
			i_54_ = 0;
		    else if (i_54_ > 255)
			i_54_ = 255;
		    int i_55_ = i_54_ / 2;
		    is_46_[i_49_ + i_51_] = is_46_[i_49_ + i_53_]
			= is_46_[i_50_ + i_51_] = is_46_[i_50_ + i_53_]
			= ~0xffffff | i_54_ << 16;
		    is[i_49_ + i_51_] = is[i_49_ + i_53_]
			= is[i_50_ + i_51_] = is[i_50_ + i_53_]
			= 127 - i_55_ << 24 | 0xffffff;
		}
	    }
	    aClass152_2866 = arg0.method1247(is_46_, 0, 128, 128, 128);
	    aClass152_2862 = arg0.method1247(is, 0, 128, 128, 128);
	}
    }
    
    public boolean method2673(Class130 arg0, Class196 arg1) {
	if (aClass152_2872 == null && !method2665(arg0, arg1))
	    return false;
	return true;
    }
}
