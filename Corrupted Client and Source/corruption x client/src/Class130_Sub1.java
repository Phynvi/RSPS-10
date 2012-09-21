/* Class130_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Class130_Sub1 extends Class130
{
    public int anInt4024;
    public boolean aBoolean4025;
    public int[] anIntArray4026;
    public int anInt4027;
    public Class214 aClass214_4028;
    public int anInt4029;
    public int anInt4030;
    public int anInt4031;
    public boolean aBoolean4032;
    public float aFloat4033;
    public int anInt4034;
    public int anInt4035;
    public int anInt4036;
    public int anInt4037 = 78642;
    public int anInt4038;
    public boolean aBoolean4039;
    public Class125[] aClass125Array4040;
    public int anInt4041;
    public Class214 aClass214_4042;
    public int anInt4043;
    public Class46 aClass46_4044;
    public int anInt4045;
    public boolean aBoolean4046;
    public int anInt4047;
    public int anInt4048;
    public int anInt4049;
    public int anInt4050;
    public int anInt4051;
    public int anInt4052;
    public int anInt4053;
    public int anInt4054;
    public int anInt4055;
    public boolean aBoolean4056;
    public int anInt4057;
    public Class9_Sub2 aClass9_Sub2_4058;
    public int anInt4059;
    public int anInt4060;
    public int anInt4061;
    public float aFloat4062;
    public Canvas aCanvas4063;
    public int anInt4064;
    public int anInt4065;
    public int anInt4066;
    public int anInt4067;
    public int anInt4068;
    public Interface4 anInterface4_4069;
    public int anInt4070;
    public Class131_Sub35 aClass131_Sub35_4071;
    
    public void method1168(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	method1176(arg0, arg1, arg2, arg4, arg5);
	method1176(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
	method1160(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
	method1160(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }
    
    public boolean method1264(int arg0) {
	if (aBoolean4039
	    || anInterface4_4069.method10(-19907, arg0).aBoolean564)
	    return true;
	return false;
    }
    
    public void method1233(int arg0, int arg1, int arg2) {
	anInt4031 = anInt4045;
	anInt4035 = arg0;
	anInt4045 = arg1;
	anInt4027 = arg2;
	aBoolean4056 = true;
    }
    
    public int method1208(int arg0, int arg1) {
	arg0 |= 0x10400;
	return arg0 & arg1 ^ arg1;
    }
    
    public int[] method1265(int arg0) {
	Class131_Sub5 class131_sub5;
	synchronized (aClass214_4028) {
	    class131_sub5
		= (Class131_Sub5) aClass214_4028.method2780(119, (long) arg0);
	    if (class131_sub5 == null) {
		if (!anInterface4_4069.method11(false, arg0))
		    return null;
		Class42 class42 = anInterface4_4069.method10(-19907, arg0);
		int i = class42.aBoolean564 || aBoolean4039 ? 64 : 128;
		class131_sub5
		    = new Class131_Sub5(arg0, i,
					anInterface4_4069.method14(0.7F, i,
								   arg0, i,
								   false,
								   true),
					class42.aBoolean558);
		aClass214_4028.method2773(true, class131_sub5, (long) arg0);
	    }
	}
	class131_sub5.aBoolean4137 = true;
	return class131_sub5.method1655();
    }
    
    public Class152 method1263(int arg0, int arg1, int arg2, int arg3,
			       boolean arg4) {
	int[] is = new int[arg2 * arg3];
	int i = arg1 * anInt4029 + arg0;
	int i_0_ = anInt4029 - arg2;
	for (int i_1_ = 0; i_1_ < arg3; i_1_++) {
	    int i_2_ = i_1_ * arg2;
	    for (int i_3_ = 0; i_3_ < arg2; i_3_++)
		is[i_2_ + i_3_] = anIntArray4026[i++];
	    i += i_0_;
	}
	if (arg4)
	    return new Class152_Sub1_Sub3(this, is, arg2, arg3);
	return new Class152_Sub1_Sub1(this, is, arg2, arg3);
    }
    
    public boolean method1206() {
	return false;
    }
    
    public void method1166() {
	if (aCanvas4063 == null || aClass46_4044 == null)
	    throw new IllegalStateException("Can't flip an offscreen toolkit");
	try {
	    Graphics graphics = aCanvas4063.getGraphics();
	    aClass46_4044.method566(0, 0, 32, graphics);
	} catch (Exception exception) {
	    aCanvas4063.repaint();
	}
    }
    
    public int method1214() {
	int i = anInt4055;
	anInt4055 = 0;
	return i;
    }
    
    public void method1227(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	Class125 class125 = method1267(Thread.currentThread());
	Class65 class65 = class125.aClass65_1638;
	int i = arg2 - arg0;
	int i_4_ = arg3 - arg1;
	int i_5_ = i >= 0 ? i : -i;
	int i_6_ = i_4_ >= 0 ? i_4_ : -i_4_;
	int i_7_ = i_5_;
	if (i_7_ < i_6_)
	    i_7_ = i_6_;
	if (i_7_ != 0) {
	    int i_8_ = (i << 16) / i_7_;
	    int i_9_ = (i_4_ << 16) / i_7_;
	    if (i_9_ <= i_8_)
		i_8_ = -i_8_;
	    else
		i_9_ = -i_9_;
	    int i_10_ = arg5 * i_9_ >> 17;
	    int i_11_ = arg5 * i_9_ + 1 >> 17;
	    int i_12_ = arg5 * i_8_ >> 17;
	    int i_13_ = arg5 * i_8_ + 1 >> 17;
	    arg0 -= class65.method676();
	    arg1 -= class65.method677();
	    int i_14_ = arg0 + i_10_;
	    int i_15_ = arg0 - i_11_;
	    int i_16_ = arg0 + i - i_11_;
	    int i_17_ = arg0 + i + i_10_;
	    int i_18_ = arg1 + i_12_;
	    int i_19_ = arg1 - i_13_;
	    int i_20_ = arg1 + i_4_ - i_13_;
	    int i_21_ = arg1 + i_4_ + i_12_;
	    if (arg6 == 0)
		class65.anInt819 = 0;
	    else if (arg6 == 1)
		class65.anInt819 = 255 - (arg4 >> 24);
	    else
		throw new IllegalArgumentException();
	    class65.aBoolean820 = (i_14_ < 0 || i_14_ > class65.anInt825
				   || i_15_ < 0 || i_15_ > class65.anInt825
				   || i_16_ < 0 || i_16_ > class65.anInt825);
	    class65.method682(i_18_, i_19_, i_20_, i_14_, i_15_, i_16_, arg4);
	    class65.aBoolean820 = (i_14_ < 0 || i_14_ > class65.anInt825
				   || i_15_ < 0 || i_15_ > class65.anInt825
				   || i_17_ < 0 || i_17_ > class65.anInt825);
	    class65.method682(i_18_, i_20_, i_21_, i_14_, i_16_, i_17_, arg4);
	}
    }
    
    public Class152 method1178(Class124 arg0, boolean arg1) {
	int[] is = arg0.anIntArray1624;
	byte[] is_22_ = arg0.aByteArray1626;
	int i = arg0.anInt1623;
	int i_23_ = arg0.anInt1619;
	Class152_Sub1 class152_sub1;
	if (arg1 && arg0.aByteArray1622 == null) {
	    int[] is_24_ = new int[is.length];
	    byte[] is_25_ = new byte[i * i_23_];
	    for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
		int i_27_ = i_26_ * i;
		for (int i_28_ = 0; i_28_ < i; i_28_++)
		    is_25_[i_27_ + i_28_] = is_22_[i_27_ + i_28_];
	    }
	    for (int i_29_ = 0; i_29_ < is.length; i_29_++)
		is_24_[i_29_] = is[i_29_];
	    class152_sub1
		= new Class152_Sub1_Sub2(this, is_25_, is_24_, i, i_23_);
	} else {
	    int[] is_30_ = new int[i * i_23_];
	    byte[] is_31_ = arg0.aByteArray1622;
	    if (is_31_ != null) {
		for (int i_32_ = 0; i_32_ < i_23_; i_32_++) {
		    int i_33_ = i_32_ * i;
		    for (int i_34_ = 0; i_34_ < i; i_34_++)
			is_30_[i_33_ + i_34_]
			    = (is[is_22_[i_33_ + i_34_] & 0xff]
			       | is_31_[i_33_ + i_34_] << 24);
		}
		class152_sub1 = new Class152_Sub1_Sub3(this, is_30_, i, i_23_);
	    } else {
		for (int i_35_ = 0; i_35_ < i_23_; i_35_++) {
		    int i_36_ = i_35_ * i;
		    for (int i_37_ = 0; i_37_ < i; i_37_++)
			is_30_[i_36_ + i_37_]
			    = is[is_22_[i_36_ + i_37_] & 0xff];
		}
		Class152_Sub1_Sub3 class152_sub1_sub3
		    = new Class152_Sub1_Sub3(this, is_30_, i, i_23_);
		class152_sub1 = new Class152_Sub1_Sub1(this, is_30_, i, i_23_);
	    }
	}
	class152_sub1.method2208(arg0.anInt1625, arg0.anInt1618,
				 arg0.anInt1620, arg0.anInt1621);
	return class152_sub1;
    }
    
    public boolean method1223() {
	return false;
    }
    
    public void method1246(float f, float f_38_, float f_39_) {
	/* empty */
    }
    
    public void method1260(Class9 arg0) {
	aClass9_Sub2_4058 = (Class9_Sub2) arg0;
    }
    
    public void method1266() {
	aClass214_4028 = new Class214(20);
	aClass9_Sub2_4058 = new Class9_Sub2();
	Class149.method2185(-105, true, false);
	aBoolean4025 = true;
	method1189(1);
	method1183(0);
	method1244();
    }
    
    public void method1176(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg1 >= anInt4061 && arg1 < anInt4024) {
	    if (arg0 < anInt4066) {
		arg2 -= anInt4066 - arg0;
		arg0 = anInt4066;
	    }
	    if (arg0 + arg2 > anInt4067)
		arg2 = anInt4067 - arg0;
	    int i = arg0 + arg1 * anInt4029;
	    int i_40_ = arg3 >>> 24;
	    if (arg4 == 0 || arg4 == 1 && i_40_ == 255) {
		for (int i_41_ = 0; i_41_ < arg2; i_41_++)
		    anIntArray4026[i + i_41_] = arg3;
	    } else if (arg4 == 1) {
		arg3 = (((arg3 & 0xff00ff) * i_40_ >> 8 & 0xff00ff)
			+ ((arg3 & 0xff00) * i_40_ >> 8 & 0xff00)
			+ (i_40_ << 24));
		int i_42_ = 256 - i_40_;
		for (int i_43_ = 0; i_43_ < arg2; i_43_++) {
		    int i_44_ = anIntArray4026[i + i_43_];
		    i_44_ = (((i_44_ & 0xff00ff) * i_42_ >> 8 & 0xff00ff)
			     + ((i_44_ & 0xff00) * i_42_ >> 8 & 0xff00));
		    anIntArray4026[i + i_43_] = arg3 + i_44_;
		}
	    } else if (arg4 == 2) {
		for (int i_45_ = 0; i_45_ < arg2; i_45_++) {
		    int i_46_ = anIntArray4026[i + i_45_];
		    int i_47_ = arg3 + i_46_;
		    int i_48_ = (arg3 & 0xff00ff) + (i_46_ & 0xff00ff);
		    i_46_ = (i_48_ & 0x1000100) + (i_47_ - i_48_ & 0x10000);
		    anIntArray4026[i + i_45_]
			= i_47_ - i_46_ | i_46_ - (i_46_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class125 method1267(Runnable arg0) {
	for (int i = 0; i < anInt4049; i++) {
	    if (aClass125Array4040[i].aRunnable1628 == arg0)
		return aClass125Array4040[i];
	}
	return null;
    }
    
    public Class9 method1257() {
	return new Class9_Sub2();
    }
    
    public boolean method1186() {
	return false;
    }
    
    public Class68 method1237(int arg0, int arg1, int[][] arg2, int[][] arg3,
			      int arg4, int arg5, int arg6) {
	return new Class68_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3,
				arg4);
    }
    
    public int[] method1268(int arg0) {
	Class131_Sub5 class131_sub5;
	synchronized (aClass214_4028) {
	    class131_sub5
		= (Class131_Sub5) aClass214_4028.method2780(119, (long) arg0);
	    if (class131_sub5 == null) {
		if (!anInterface4_4069.method11(false, arg0))
		    return null;
		Class42 class42 = anInterface4_4069.method10(-19907, arg0);
		int i = class42.aBoolean564 || aBoolean4039 ? 64 : 128;
		class131_sub5
		    = new Class131_Sub5(arg0, i,
					anInterface4_4069.method12(i, arg0,
								   true,
								   -11047,
								   0.7F, i),
					class42.aBoolean558);
		aClass214_4028.method2773(true, class131_sub5, (long) arg0);
	    }
	}
	class131_sub5.aBoolean4137 = true;
	return class131_sub5.method1655();
    }
    
    public void method1188(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg2 > anInt4029)
	    arg2 = anInt4029;
	if (arg3 > anInt4064)
	    arg3 = anInt4064;
	anInt4066 = arg0;
	anInt4067 = arg2;
	anInt4061 = arg1;
	anInt4024 = arg3;
	method1269();
    }
    
    public boolean method1220() {
	return false;
    }
    
    public void method1193(int arg0, int arg1, int arg2, int arg3) {
	anInt4053 = arg0;
	anInt4065 = arg1;
	anInt4068 = arg2;
	anInt4036 = arg3;
	method1269();
    }
    
    public float method1162() {
	return aFloat4062;
    }
    
    public void method1251() {
	anInt4045 = anInt4031;
	aBoolean4056 = false;
    }
    
    public void method1269() {
	anInt4057 = anInt4066 - anInt4053;
	anInt4038 = anInt4067 - anInt4053;
	anInt4060 = anInt4061 - anInt4065;
	anInt4059 = anInt4024 - anInt4065;
	for (int i = 0; i < anInt4049; i++) {
	    Class65 class65 = aClass125Array4040[i].aClass65_1638;
	    class65.anInt822 = anInt4053 - anInt4066;
	    class65.anInt821 = anInt4065 - anInt4061;
	    class65.anInt825 = anInt4067 - anInt4066;
	    class65.anInt824 = anInt4024 - anInt4061;
	}
	int i = anInt4061 * anInt4029 + anInt4066;
	for (int i_49_ = anInt4061; i_49_ < anInt4024; i_49_++) {
	    for (int i_50_ = 0; i_50_ < anInt4049; i_50_++)
		aClass125Array4040[i_50_].aClass65_1638.anIntArray829
		    [i_49_ - anInt4061]
		    = i;
	    i += anInt4029;
	}
    }
    
    public int method1165() {
	return 0;
    }
    
    public void method1212(int arg0, int arg1) {
	anInt4045 = arg0 & 0xffffff;
	int i = anInt4045 >>> 16 & 0xff;
	if (i < 2)
	    i = 2;
	int i_51_ = anInt4045 >> 8 & 0xff;
	if (i_51_ < 2)
	    i_51_ = 2;
	int i_52_ = anInt4045 & 0xff;
	if (i_52_ < 2)
	    i_52_ = 2;
	anInt4045 = i << 16 | i_51_ << 8 | i_52_;
	if (arg1 < 0)
	    aBoolean4046 = false;
	else
	    aBoolean4046 = true;
    }
    
    public boolean method1159() {
	return true;
    }
    
    public void method1250() {
	/* empty */
    }
    
    public int method1261() {
	return anInt4043;
    }
    
    public Class131_Sub27 method1256(int arg0) {
	return null;
    }
    
    public void method1183(int arg0) {
	aClass125Array4040[arg0].method1101(Thread.currentThread(), 113);
    }
    
    public void method1194() {
	aClass214_4028.method2783(-95);
    }
    
    public void method1207(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 < 0)
	    arg2 = -arg2;
	int i = arg1 - arg2;
	if (i < anInt4061)
	    i = anInt4061;
	int i_53_ = arg1 + arg2 + 1;
	if (i_53_ > anInt4024)
	    i_53_ = anInt4024;
	int i_54_ = i;
	int i_55_ = arg2 * arg2;
	int i_56_ = 0;
	int i_57_ = arg1 - i_54_;
	int i_58_ = i_57_ * i_57_;
	int i_59_ = i_58_ - i_57_;
	if (arg1 > i_53_)
	    arg1 = i_53_;
	int i_60_ = arg3 >>> 24;
	if (arg4 == 0 || arg4 == 1 && i_60_ == 255) {
	    while (i_54_ < arg1) {
		for (/**/; i_59_ <= i_55_ || i_58_ <= i_55_;
		     i_59_ += i_56_++ + i_56_)
		    i_58_ += i_56_ + i_56_;
		int i_61_ = arg0 - i_56_ + 1;
		if (i_61_ < anInt4066)
		    i_61_ = anInt4066;
		int i_62_ = arg0 + i_56_;
		if (i_62_ > anInt4067)
		    i_62_ = anInt4067;
		int i_63_ = i_61_ + i_54_ * anInt4029;
		for (int i_64_ = i_61_; i_64_ < i_62_; i_64_++)
		    anIntArray4026[i_63_++] = arg3;
		i_54_++;
		i_58_ -= i_57_-- + i_57_;
		i_59_ -= i_57_ + i_57_;
	    }
	    i_56_ = arg2;
	    i_57_ = i_54_ - arg1;
	    i_59_ = i_57_ * i_57_ + i_55_;
	    i_58_ = i_59_ - i_56_;
	    i_59_ -= i_57_;
	    while (i_54_ < i_53_) {
		for (/**/; i_59_ > i_55_ && i_58_ > i_55_;
		     i_58_ -= i_56_ + i_56_)
		    i_59_ -= i_56_-- + i_56_;
		int i_65_ = arg0 - i_56_;
		if (i_65_ < anInt4066)
		    i_65_ = anInt4066;
		int i_66_ = arg0 + i_56_;
		if (i_66_ > anInt4067 - 1)
		    i_66_ = anInt4067 - 1;
		int i_67_ = i_65_ + i_54_ * anInt4029;
		for (int i_68_ = i_65_; i_68_ <= i_66_; i_68_++)
		    anIntArray4026[i_67_++] = arg3;
		i_54_++;
		i_59_ += i_57_ + i_57_;
		i_58_ += i_57_++ + i_57_;
	    }
	} else if (arg4 == 1) {
	    arg3 = (((arg3 & 0xff00ff) * i_60_ >> 8 & 0xff00ff)
		    + ((arg3 & 0xff00) * i_60_ >> 8 & 0xff00) + (i_60_ << 24));
	    int i_69_ = 256 - i_60_;
	    while (i_54_ < arg1) {
		for (/**/; i_59_ <= i_55_ || i_58_ <= i_55_;
		     i_59_ += i_56_++ + i_56_)
		    i_58_ += i_56_ + i_56_;
		int i_70_ = arg0 - i_56_ + 1;
		if (i_70_ < anInt4066)
		    i_70_ = anInt4066;
		int i_71_ = arg0 + i_56_;
		if (i_71_ > anInt4067)
		    i_71_ = anInt4067;
		int i_72_ = i_70_ + i_54_ * anInt4029;
		for (int i_73_ = i_70_; i_73_ < i_71_; i_73_++) {
		    int i_74_ = anIntArray4026[i_72_];
		    i_74_ = (((i_74_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			     + ((i_74_ & 0xff00) * i_69_ >> 8 & 0xff00));
		    anIntArray4026[i_72_++] = arg3 + i_74_;
		}
		i_54_++;
		i_58_ -= i_57_-- + i_57_;
		i_59_ -= i_57_ + i_57_;
	    }
	    i_56_ = arg2;
	    i_57_ = -i_57_;
	    i_59_ = i_57_ * i_57_ + i_55_;
	    i_58_ = i_59_ - i_56_;
	    i_59_ -= i_57_;
	    while (i_54_ < i_53_) {
		for (/**/; i_59_ > i_55_ && i_58_ > i_55_;
		     i_58_ -= i_56_ + i_56_)
		    i_59_ -= i_56_-- + i_56_;
		int i_75_ = arg0 - i_56_;
		if (i_75_ < anInt4066)
		    i_75_ = anInt4066;
		int i_76_ = arg0 + i_56_;
		if (i_76_ > anInt4067 - 1)
		    i_76_ = anInt4067 - 1;
		int i_77_ = i_75_ + i_54_ * anInt4029;
		for (int i_78_ = i_75_; i_78_ <= i_76_; i_78_++) {
		    int i_79_ = anIntArray4026[i_77_];
		    i_79_ = (((i_79_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			     + ((i_79_ & 0xff00) * i_69_ >> 8 & 0xff00));
		    anIntArray4026[i_77_++] = arg3 + i_79_;
		}
		i_54_++;
		i_59_ += i_57_ + i_57_;
		i_58_ += i_57_++ + i_57_;
	    }
	} else if (arg4 == 2) {
	    while (i_54_ < arg1) {
		for (/**/; i_59_ <= i_55_ || i_58_ <= i_55_;
		     i_59_ += i_56_++ + i_56_)
		    i_58_ += i_56_ + i_56_;
		int i_80_ = arg0 - i_56_ + 1;
		if (i_80_ < anInt4066)
		    i_80_ = anInt4066;
		int i_81_ = arg0 + i_56_;
		if (i_81_ > anInt4067)
		    i_81_ = anInt4067;
		int i_82_ = i_80_ + i_54_ * anInt4029;
		for (int i_83_ = i_80_; i_83_ < i_81_; i_83_++) {
		    int i_84_ = anIntArray4026[i_82_];
		    int i_85_ = arg3 + i_84_;
		    int i_86_ = (arg3 & 0xff00ff) + (i_84_ & 0xff00ff);
		    i_84_ = (i_86_ & 0x1000100) + (i_85_ - i_86_ & 0x10000);
		    anIntArray4026[i_82_++]
			= i_85_ - i_84_ | i_84_ - (i_84_ >>> 8);
		}
		i_54_++;
		i_58_ -= i_57_-- + i_57_;
		i_59_ -= i_57_ + i_57_;
	    }
	    i_56_ = arg2;
	    i_57_ = -i_57_;
	    i_59_ = i_57_ * i_57_ + i_55_;
	    i_58_ = i_59_ - i_56_;
	    i_59_ -= i_57_;
	    while (i_54_ < i_53_) {
		for (/**/; i_59_ > i_55_ && i_58_ > i_55_;
		     i_58_ -= i_56_ + i_56_)
		    i_59_ -= i_56_-- + i_56_;
		int i_87_ = arg0 - i_56_;
		if (i_87_ < anInt4066)
		    i_87_ = anInt4066;
		int i_88_ = arg0 + i_56_;
		if (i_88_ > anInt4067 - 1)
		    i_88_ = anInt4067 - 1;
		int i_89_ = i_87_ + i_54_ * anInt4029;
		for (int i_90_ = i_87_; i_90_ <= i_88_; i_90_++) {
		    int i_91_ = anIntArray4026[i_89_];
		    int i_92_ = arg3 + i_91_;
		    int i_93_ = (arg3 & 0xff00ff) + (i_91_ & 0xff00ff);
		    i_91_ = (i_93_ & 0x1000100) + (i_92_ - i_93_ & 0x10000);
		    anIntArray4026[i_89_++]
			= i_92_ - i_91_ | i_91_ - (i_91_ >>> 8);
		}
		i_54_++;
		i_59_ += i_57_ + i_57_;
		i_58_ += i_57_++ + i_57_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method1169() {
	/* empty */
    }
    
    public void method1236(int arg0, int arg1, int arg2) {
	anInt4035 = arg0;
	anInt4045 = arg1;
	anInt4027 = arg2;
    }
    
    public void method1161(float arg0) {
	anInt4051 = (int) (arg0 * 65535.0F);
    }
    
    public void method1215(Class105 arg0) {
	Class1_Sub7 class1_sub7 = arg0.aClass142_1375.aClass1_Sub7_1887;
	for (Class1_Sub7 class1_sub7_94_ = class1_sub7.aClass1_Sub7_3591;
	     class1_sub7_94_ != class1_sub7;
	     class1_sub7_94_ = class1_sub7_94_.aClass1_Sub7_3591) {
	    Class1_Sub7_Sub1 class1_sub7_sub1
		= (Class1_Sub7_Sub1) class1_sub7_94_;
	    int i = class1_sub7_sub1.anInt5215 >> 12;
	    int i_95_ = class1_sub7_sub1.anInt5219 >> 12;
	    int i_96_ = class1_sub7_sub1.anInt5211 >> 12;
	    int i_97_ = (aClass9_Sub2_4058.anInt3619
			 + ((aClass9_Sub2_4058.anInt3623 * i
			     + aClass9_Sub2_4058.anInt3621 * i_95_
			     + aClass9_Sub2_4058.anInt3620 * i_96_)
			    >> 15));
	    if (i_97_ >= anInt4043 && i_97_ <= anInt4030) {
		int i_98_ = (anInt4053
			     + (anInt4068
				* (aClass9_Sub2_4058.anInt3626
				   + ((aClass9_Sub2_4058.anInt3617 * i
				       + aClass9_Sub2_4058.anInt3615 * i_95_
				       + aClass9_Sub2_4058.anInt3618 * i_96_)
				      >> 15))
				/ i_97_));
		int i_99_ = (anInt4065
			     + (anInt4036
				* (aClass9_Sub2_4058.anInt3624
				   + ((aClass9_Sub2_4058.anInt3625 * i
				       + aClass9_Sub2_4058.anInt3616 * i_95_
				       + aClass9_Sub2_4058.anInt3622 * i_96_)
				      >> 15))
				/ i_97_));
		if (i_98_ >= anInt4066 && i_98_ <= anInt4067
		    && i_99_ >= anInt4061 && i_99_ <= anInt4024) {
		    if (i_97_ == 0)
			i_97_ = 1;
		    method1273(class1_sub7_sub1, i_98_, i_99_,
			       (class1_sub7_sub1.anInt5210 >> 2) / i_97_);
		}
	    }
	}
    }
    
    public void method1240(int arg0, int arg1, int arg2, int[] arg3) {
	int i = (aClass9_Sub2_4058.anInt3619
		 + ((aClass9_Sub2_4058.anInt3623 * arg0
		     + aClass9_Sub2_4058.anInt3621 * arg1
		     + aClass9_Sub2_4058.anInt3620 * arg2)
		    >> 15));
	if (i < anInt4043 || i > anInt4030)
	    arg3[0] = arg3[1] = arg3[2] = -1;
	else {
	    int i_100_ = anInt4068 * (aClass9_Sub2_4058.anInt3626
				      + ((aClass9_Sub2_4058.anInt3617 * arg0
					  + aClass9_Sub2_4058.anInt3615 * arg1
					  + aClass9_Sub2_4058.anInt3618 * arg2)
					 >> 15)) / i;
	    int i_101_ = anInt4036 * (aClass9_Sub2_4058.anInt3624
				      + ((aClass9_Sub2_4058.anInt3625 * arg0
					  + aClass9_Sub2_4058.anInt3616 * arg1
					  + aClass9_Sub2_4058.anInt3622 * arg2)
					 >> 15)) / i;
	    if (i_100_ >= anInt4057 && i_100_ <= anInt4038
		&& i_101_ >= anInt4060 && i_101_ <= anInt4059) {
		arg3[0] = i_100_ - anInt4057;
		arg3[1] = i_101_ - anInt4060;
		arg3[2] = i;
	    } else
		arg3[0] = arg3[1] = arg3[2] = -1;
	}
    }
    
    public void method1158() {
	if (aBoolean4025) {
	    Class131_Sub27.method1838(false, true, -1);
	    aBoolean4025 = false;
	}
	aCanvas4063 = null;
	anInterface4_4069 = null;
	aClass46_4044 = null;
	aBoolean4032 = true;
    }
    
    public boolean method1175() {
	return false;
    }
    
    public void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg0 >= anInt4066 && arg0 < anInt4067) {
	    if (arg1 < anInt4061) {
		arg2 -= anInt4061 - arg1;
		arg1 = anInt4061;
	    }
	    if (arg1 + arg2 > anInt4024)
		arg2 = anInt4024 - arg1;
	    int i = arg0 + arg1 * anInt4029;
	    int i_102_ = arg3 >>> 24;
	    if (arg4 == 0 || arg4 == 1 && i_102_ == 255) {
		for (int i_103_ = 0; i_103_ < arg2; i_103_++)
		    anIntArray4026[i + i_103_ * anInt4029] = arg3;
	    } else if (arg4 == 1) {
		arg3 = (((arg3 & 0xff00ff) * i_102_ >> 8 & 0xff00ff)
			+ ((arg3 & 0xff00) * i_102_ >> 8 & 0xff00)
			+ (i_102_ << 24));
		int i_104_ = 256 - i_102_;
		for (int i_105_ = 0; i_105_ < arg2; i_105_++) {
		    int i_106_ = i + i_105_ * anInt4029;
		    int i_107_ = anIntArray4026[i_106_];
		    i_107_ = (((i_107_ & 0xff00ff) * i_104_ >> 8 & 0xff00ff)
			      + ((i_107_ & 0xff00) * i_104_ >> 8 & 0xff00));
		    anIntArray4026[i_106_] = arg3 + i_107_;
		}
	    } else if (arg4 == 2) {
		for (int i_108_ = 0; i_108_ < arg2; i_108_++) {
		    int i_109_ = i + i_108_ * anInt4029;
		    int i_110_ = anIntArray4026[i_109_];
		    int i_111_ = arg3 + i_110_;
		    int i_112_ = (arg3 & 0xff00ff) + (i_110_ & 0xff00ff);
		    i_110_
			= (i_112_ & 0x1000100) + (i_111_ - i_112_ & 0x10000);
		    anIntArray4026[i_109_]
			= i_111_ - i_110_ | i_110_ - (i_110_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1171(boolean arg0) {
	aBoolean4039 = arg0;
	aClass214_4028.method2783(-85);
    }
    
    public void method1248(int arg0, int arg1, int arg2, int arg3) {
	if (anInt4066 < arg0)
	    anInt4066 = arg0;
	if (anInt4061 < arg1)
	    anInt4061 = arg1;
	if (anInt4067 > arg2)
	    anInt4067 = arg2;
	if (anInt4024 > arg3)
	    anInt4024 = arg3;
	method1269();
    }
    
    public Class183 method1179(int arg0, int arg1, int[] arg2, int[] arg3) {
	return new Class183_Sub1(arg0, arg1, arg2, arg3);
    }
    
    public void method1221() {
	aClass46_4044 = Class110_Sub1.method943(aCanvas4063, (byte) -125);
	anIntArray4026 = aClass46_4044.anIntArray630;
	anInt4029 = aClass46_4044.anInt636;
	anInt4064 = aClass46_4044.anInt634;
	for (int i = 0; i < anInt4049; i++)
	    aClass125Array4040[i].method1103(13232);
	method1244();
    }
    
    public void method1226(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, Class183 arg6, int arg7, int arg8) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg6;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_113_ = class183_sub1.anIntArray4963;
	int i = anInt4061 > arg8 ? anInt4061 : arg8;
	int i_114_
	    = anInt4024 < arg8 + is.length ? anInt4024 : arg8 + is.length;
	arg2 -= arg0;
	arg3 -= arg1;
	if (arg2 + arg3 < 0) {
	    arg0 += arg2;
	    arg2 = -arg2;
	    arg1 += arg3;
	    arg3 = -arg3;
	}
	if (arg2 > arg3) {
	    arg1 <<= 16;
	    arg1 += 32768;
	    arg3 <<= 16;
	    int i_115_ = (int) Math.floor((double) arg3 / (double) arg2 + 0.5);
	    arg2 += arg0;
	    if (arg0 < anInt4066) {
		arg1 += i_115_ * (anInt4066 - arg0);
		arg0 = anInt4066;
	    }
	    if (arg2 >= anInt4067)
		arg2 = anInt4067 - 1;
	    int i_116_ = arg4 >>> 24;
	    if (arg5 == 0 || arg5 == 1 && i_116_ == 255) {
		for (/**/; arg0 <= arg2; arg0++) {
		    int i_117_ = arg1 >> 16;
		    int i_118_ = i_117_ - arg8;
		    if (i_117_ >= i && i_117_ < i_114_) {
			int i_119_ = arg7 + is[i_118_];
			if (arg0 >= i_119_ && arg0 < i_119_ + is_113_[i_118_])
			    anIntArray4026[arg0 + i_117_ * anInt4029] = arg4;
		    }
		    arg1 += i_115_;
		}
		return;
	    }
	    if (arg5 == 1) {
		arg4 = (((arg4 & 0xff00ff) * i_116_ >> 8 & 0xff00ff)
			+ ((arg4 & 0xff00) * i_116_ >> 8 & 0xff00)
			+ (i_116_ << 24));
		int i_120_ = 256 - i_116_;
		for (/**/; arg0 <= arg2; arg0++) {
		    int i_121_ = arg1 >> 16;
		    int i_122_ = i_121_ - arg8;
		    if (i_121_ >= i && i_121_ < i_114_) {
			int i_123_ = arg7 + is[i_122_];
			if (arg0 >= i_123_
			    && arg0 < i_123_ + is_113_[i_122_]) {
			    int i_124_ = arg0 + i_121_ * anInt4029;
			    int i_125_ = anIntArray4026[i_124_];
			    i_125_ = (((i_125_ & 0xff00ff) * i_120_ >> 8
				       & 0xff00ff)
				      + ((i_125_ & 0xff00) * i_120_ >> 8
					 & 0xff00));
			    anIntArray4026[i_124_] = arg4 + i_125_;
			}
		    }
		    arg1 += i_115_;
		}
		return;
	    }
	    if (arg5 == 2) {
		for (/**/; arg0 <= arg2; arg0++) {
		    int i_126_ = arg1 >> 16;
		    int i_127_ = i_126_ - arg8;
		    if (i_126_ >= i && i_126_ < i_114_) {
			int i_128_ = arg7 + is[i_127_];
			if (arg0 >= i_128_
			    && arg0 < i_128_ + is_113_[i_127_]) {
			    int i_129_ = arg0 + i_126_ * anInt4029;
			    int i_130_ = anIntArray4026[i_129_];
			    int i_131_ = arg4 + i_130_;
			    int i_132_
				= (arg4 & 0xff00ff) + (i_130_ & 0xff00ff);
			    i_130_ = (i_132_ & 0x1000100) + (i_131_ - i_132_
							     & 0x10000);
			    anIntArray4026[i_129_]
				= i_131_ - i_130_ | i_130_ - (i_130_ >>> 8);
			}
		    }
		    arg1 += i_115_;
		}
		return;
	    }
	    throw new IllegalArgumentException();
	}
	arg0 <<= 16;
	arg0 += 32768;
	arg2 <<= 16;
	int i_133_ = (int) Math.floor((double) arg2 / (double) arg3 + 0.5);
	arg3 += arg1;
	if (arg1 < i) {
	    arg0 += i_133_ * (i - arg1);
	    arg1 = i;
	}
	if (arg3 >= i_114_)
	    arg3 = i_114_ - 1;
	int i_134_ = arg4 >>> 24;
	if (arg5 == 0 || arg5 == 1 && i_134_ == 255) {
	    for (/**/; arg1 <= arg3; arg1++) {
		int i_135_ = arg0 >> 16;
		int i_136_ = arg1 - arg8;
		int i_137_ = arg7 + is[i_136_];
		if (i_135_ >= anInt4066 && i_135_ < anInt4067
		    && i_135_ >= i_137_ && i_135_ < i_137_ + is_113_[i_136_])
		    anIntArray4026[i_135_ + arg1 * anInt4029] = arg4;
		arg0 += i_133_;
	    }
	} else if (arg5 == 1) {
	    arg4 = (((arg4 & 0xff00ff) * i_134_ >> 8 & 0xff00ff)
		    + ((arg4 & 0xff00) * i_134_ >> 8 & 0xff00)
		    + (i_134_ << 24));
	    int i_138_ = 256 - i_134_;
	    for (/**/; arg1 <= arg3; arg1++) {
		int i_139_ = arg0 >> 16;
		int i_140_ = arg1 - arg8;
		int i_141_ = arg7 + is[i_140_];
		if (i_139_ >= anInt4066 && i_139_ < anInt4067
		    && i_139_ >= i_141_ && i_139_ < i_141_ + is_113_[i_140_]) {
		    int i_142_ = i_139_ + arg1 * anInt4029;
		    int i_143_ = anIntArray4026[i_142_];
		    i_143_ = (((i_143_ & 0xff00ff) * i_138_ >> 8 & 0xff00ff)
			      + ((i_143_ & 0xff00) * i_138_ >> 8 & 0xff00));
		    anIntArray4026[i_139_ + arg1 * anInt4029] = arg4 + i_143_;
		}
		arg0 += i_133_;
	    }
	} else if (arg5 == 2) {
	    for (/**/; arg1 <= arg3; arg1++) {
		int i_144_ = arg0 >> 16;
		int i_145_ = arg1 - arg8;
		int i_146_ = arg7 + is[i_145_];
		if (i_144_ >= anInt4066 && i_144_ < anInt4067
		    && i_144_ >= i_146_ && i_144_ < i_146_ + is_113_[i_145_]) {
		    int i_147_ = i_144_ + arg1 * anInt4029;
		    int i_148_ = anIntArray4026[i_147_];
		    int i_149_ = arg4 + i_148_;
		    int i_150_ = (arg4 & 0xff00ff) + (i_148_ & 0xff00ff);
		    i_148_
			= (i_150_ & 0x1000100) + (i_149_ - i_150_ & 0x10000);
		    anIntArray4026[i_147_]
			= i_149_ - i_148_ | i_148_ - (i_148_ >>> 8);
		}
		arg0 += i_133_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public boolean method1241() {
	return false;
    }
    
    public void method1190(Canvas arg0) {
	aCanvas4063 = arg0;
	method1221();
    }
    
    public void method1211(Rectangle[] arg0, int arg1) {
	if (aCanvas4063 == null || aClass46_4044 == null)
	    throw new IllegalStateException("Can't flip an offscreen toolkit");
	try {
	    Graphics graphics = aCanvas4063.getGraphics();
	    for (int i = 0; i < arg1; i++) {
		Rectangle rectangle = arg0[i];
		if (rectangle.x <= anInt4029 && rectangle.y <= anInt4064
		    && rectangle.x + rectangle.width > 0
		    && rectangle.y + rectangle.height > 0)
		    aClass46_4044.method568(rectangle.height, rectangle.width,
					    (byte) -100, graphics, rectangle.x,
					    rectangle.y);
	    }
	} catch (Exception exception) {
	    aCanvas4063.repaint();
	}
    }
    
    public boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5) {
	int i = (((aClass9_Sub2_4058.anInt3623 * arg0
		   + aClass9_Sub2_4058.anInt3621 * arg1
		   + aClass9_Sub2_4058.anInt3620 * arg2)
		  >> 15)
		 + aClass9_Sub2_4058.anInt3619);
	if (i < 1)
	    i = 1;
	int i_151_ = (((aClass9_Sub2_4058.anInt3623 * arg3
			+ aClass9_Sub2_4058.anInt3621 * arg4
			+ aClass9_Sub2_4058.anInt3620 * arg5)
		       >> 15)
		      + aClass9_Sub2_4058.anInt3619);
	if (i_151_ < 1)
	    i_151_ = 1;
	if (i < anInt4043 && i_151_ < anInt4043
	    || i > anInt4030 && i_151_ > anInt4030)
	    return false;
	int i_152_ = anInt4068 * (((aClass9_Sub2_4058.anInt3617 * arg0
				    + aClass9_Sub2_4058.anInt3615 * arg1
				    + aClass9_Sub2_4058.anInt3618 * arg2)
				   >> 15)
				  + aClass9_Sub2_4058.anInt3626) / i;
	int i_153_ = anInt4068 * (((aClass9_Sub2_4058.anInt3617 * arg3
				    + aClass9_Sub2_4058.anInt3615 * arg4
				    + aClass9_Sub2_4058.anInt3618 * arg5)
				   >> 15)
				  + aClass9_Sub2_4058.anInt3626) / i_151_;
	if (i_152_ < anInt4057 && i_153_ < anInt4057
	    || i_152_ > anInt4038 && i_153_ > anInt4038)
	    return false;
	int i_154_ = anInt4036 * (((aClass9_Sub2_4058.anInt3625 * arg0
				    + aClass9_Sub2_4058.anInt3616 * arg1
				    + aClass9_Sub2_4058.anInt3622 * arg2)
				   >> 15)
				  + aClass9_Sub2_4058.anInt3624) / i;
	int i_155_ = anInt4036 * (((aClass9_Sub2_4058.anInt3625 * arg3
				    + aClass9_Sub2_4058.anInt3616 * arg4
				    + aClass9_Sub2_4058.anInt3622 * arg5)
				   >> 15)
				  + aClass9_Sub2_4058.anInt3624) / i_151_;
	if (i_154_ < anInt4060 && i_155_ < anInt4060
	    || i_154_ > anInt4059 && i_155_ > anInt4059)
	    return false;
	return true;
    }
    
    public boolean method1163() {
	return true;
    }
    
    public Class154 method1218(Class116 arg0, int arg1, int arg2, int arg3,
			       int arg4) {
	return new Class154_Sub2(this, arg0, arg1, arg3, arg4, arg2);
    }
    
    public void method1189(int arg0) {
	if (anInt4049 != arg0) {
	    anInt4049 = arg0;
	    aClass125Array4040 = new Class125[anInt4049];
	    for (int i = 0; i < anInt4049; i++)
		aClass125Array4040[i] = new Class125(this);
	}
    }
    
    public void method1180(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	arg2 -= arg0;
	arg3 -= arg1;
	if (arg3 == 0) {
	    if (arg2 >= 0)
		method1176(arg0, arg1, arg2 + 1, arg4, arg5);
	    else
		method1176(arg0 + arg2, arg1, -arg2 + 1, arg4, arg5);
	} else if (arg2 == 0) {
	    if (arg3 >= 0)
		method1160(arg0, arg1, arg3 + 1, arg4, arg5);
	    else
		method1160(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
	} else {
	    if (arg2 + arg3 < 0) {
		arg0 += arg2;
		arg2 = -arg2;
		arg1 += arg3;
		arg3 = -arg3;
	    }
	    if (arg2 > arg3) {
		arg1 <<= 16;
		arg1 += 32768;
		arg3 <<= 16;
		int i = (int) Math.floor((double) arg3 / (double) arg2 + 0.5);
		arg2 += arg0;
		if (arg0 < anInt4066) {
		    arg1 += i * (anInt4066 - arg0);
		    arg0 = anInt4066;
		}
		if (arg2 >= anInt4067)
		    arg2 = anInt4067 - 1;
		int i_156_ = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && i_156_ == 255) {
		    for (/**/; arg0 <= arg2; arg0++) {
			int i_157_ = arg1 >> 16;
			if (i_157_ >= anInt4061 && i_157_ < anInt4024)
			    anIntArray4026[arg0 + i_157_ * anInt4029] = arg4;
			arg1 += i;
		    }
		    return;
		}
		if (arg5 == 1) {
		    arg4 = (((arg4 & 0xff00ff) * i_156_ >> 8 & 0xff00ff)
			    + ((arg4 & 0xff00) * i_156_ >> 8 & 0xff00)
			    + (i_156_ << 24));
		    int i_158_ = 256 - i_156_;
		    for (/**/; arg0 <= arg2; arg0++) {
			int i_159_ = arg1 >> 16;
			if (i_159_ >= anInt4061 && i_159_ < anInt4024) {
			    int i_160_ = arg0 + i_159_ * anInt4029;
			    int i_161_ = anIntArray4026[i_160_];
			    i_161_ = (((i_161_ & 0xff00ff) * i_158_ >> 8
				       & 0xff00ff)
				      + ((i_161_ & 0xff00) * i_158_ >> 8
					 & 0xff00));
			    anIntArray4026[i_160_] = arg4 + i_161_;
			}
			arg1 += i;
		    }
		    return;
		}
		if (arg5 == 2) {
		    for (/**/; arg0 <= arg2; arg0++) {
			int i_162_ = arg1 >> 16;
			if (i_162_ >= anInt4061 && i_162_ < anInt4024) {
			    int i_163_ = arg0 + i_162_ * anInt4029;
			    int i_164_ = anIntArray4026[i_163_];
			    int i_165_ = arg4 + i_164_;
			    int i_166_
				= (arg4 & 0xff00ff) + (i_164_ & 0xff00ff);
			    i_164_ = (i_166_ & 0x1000100) + (i_165_ - i_166_
							     & 0x10000);
			    anIntArray4026[i_163_]
				= i_165_ - i_164_ | i_164_ - (i_164_ >>> 8);
			}
			arg1 += i;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    arg0 <<= 16;
	    arg0 += 32768;
	    arg2 <<= 16;
	    int i = (int) Math.floor((double) arg2 / (double) arg3 + 0.5);
	    arg3 += arg1;
	    if (arg1 < anInt4061) {
		arg0 += i * (anInt4061 - arg1);
		arg1 = anInt4061;
	    }
	    if (arg3 >= anInt4024)
		arg3 = anInt4024 - 1;
	    int i_167_ = arg4 >>> 24;
	    if (arg5 == 0 || arg5 == 1 && i_167_ == 255) {
		for (/**/; arg1 <= arg3; arg1++) {
		    int i_168_ = arg0 >> 16;
		    if (i_168_ >= anInt4066 && i_168_ < anInt4067)
			anIntArray4026[i_168_ + arg1 * anInt4029] = arg4;
		    arg0 += i;
		}
	    } else if (arg5 == 1) {
		arg4 = (((arg4 & 0xff00ff) * i_167_ >> 8 & 0xff00ff)
			+ ((arg4 & 0xff00) * i_167_ >> 8 & 0xff00)
			+ (i_167_ << 24));
		int i_169_ = 256 - i_167_;
		for (/**/; arg1 <= arg3; arg1++) {
		    int i_170_ = arg0 >> 16;
		    if (i_170_ >= anInt4066 && i_170_ < anInt4067) {
			int i_171_ = i_170_ + arg1 * anInt4029;
			int i_172_ = anIntArray4026[i_171_];
			i_172_
			    = (((i_172_ & 0xff00ff) * i_169_ >> 8 & 0xff00ff)
			       + ((i_172_ & 0xff00) * i_169_ >> 8 & 0xff00));
			anIntArray4026[i_170_ + arg1 * anInt4029]
			    = arg4 + i_172_;
		    }
		    arg0 += i;
		}
	    } else if (arg5 == 2) {
		for (/**/; arg1 <= arg3; arg1++) {
		    int i_173_ = arg0 >> 16;
		    if (i_173_ >= anInt4066 && i_173_ < anInt4067) {
			int i_174_ = i_173_ + arg1 * anInt4029;
			int i_175_ = anIntArray4026[i_174_];
			int i_176_ = arg4 + i_175_;
			int i_177_ = (arg4 & 0xff00ff) + (i_175_ & 0xff00ff);
			i_175_ = (i_177_ & 0x1000100) + (i_176_ - i_177_
							 & 0x10000);
			anIntArray4026[i_174_]
			    = i_176_ - i_175_ | i_175_ - (i_175_ >>> 8);
		    }
		    arg0 += i;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class83 method1184(Class83 arg0, Class83 arg1, float arg2,
			      Class83 arg3) {
	return null;
    }
    
    public void method1242() {
	/* empty */
    }
    
    public boolean method1270(int arg0) {
	return anInterface4_4069.method11(false, arg0);
    }
    
    public void method1205(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, byte[] arg6, int arg7, int arg8) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = 0;
	    int i_178_ = 0;
	    int i_179_ = (arg7 << 16) / arg2;
	    int i_180_ = (arg6.length / arg7 << 16) / arg3;
	    int i_181_ = arg0 + arg1 * anInt4029;
	    int i_182_ = anInt4029 - arg2;
	    if (arg1 + arg3 > anInt4024)
		arg3 -= arg1 + arg3 - anInt4024;
	    if (arg1 < anInt4061) {
		int i_183_ = anInt4061 - arg1;
		arg3 -= i_183_;
		i_181_ += i_183_ * anInt4029;
		i_178_ += i_180_ * i_183_;
	    }
	    if (arg0 + arg2 > anInt4067) {
		int i_184_ = arg0 + arg2 - anInt4067;
		arg2 -= i_184_;
		i_182_ += i_184_;
	    }
	    if (arg0 < anInt4066) {
		int i_185_ = anInt4066 - arg0;
		arg2 -= i_185_;
		i_181_ += i_185_;
		i += i_179_ * i_185_;
		i_182_ += i_185_;
	    }
	    int i_186_ = arg4 >>> 24;
	    int i_187_ = arg5 >>> 24;
	    if (arg8 == 0 || arg8 == 1 && i_186_ == 255 && i_187_ == 255) {
		int i_188_ = i;
		for (int i_189_ = -arg3; i_189_ < 0; i_189_++) {
		    int i_190_ = (i_178_ >> 16) * arg7;
		    for (int i_191_ = -arg2; i_191_ < 0; i_191_++) {
			if (arg6[(i >> 16) + i_190_] != 0)
			    anIntArray4026[i_181_++] = arg5;
			else
			    anIntArray4026[i_181_++] = arg4;
			i += i_179_;
		    }
		    i_178_ += i_180_;
		    i = i_188_;
		    i_181_ += i_182_;
		}
	    } else if (arg8 == 1) {
		int i_192_ = i;
		for (int i_193_ = -arg3; i_193_ < 0; i_193_++) {
		    int i_194_ = (i_178_ >> 16) * arg7;
		    for (int i_195_ = -arg2; i_195_ < 0; i_195_++) {
			int i_196_ = arg4;
			if (arg6[(i >> 16) + i_194_] != 0)
			    i_196_ = arg5;
			int i_197_ = i_196_ >>> 24;
			int i_198_ = 255 - i_197_;
			int i_199_ = anIntArray4026[i_181_];
			anIntArray4026[i_181_++]
			    = ((((i_196_ & 0xff00ff) * i_197_
				 + (i_199_ & 0xff00ff) * i_198_)
				& ~0xff00ff)
			       + (((i_196_ & 0xff00) * i_197_
				   + (i_199_ & 0xff00) * i_198_)
				  & 0xff0000)) >> 8;
			i += i_179_;
		    }
		    i_178_ += i_180_;
		    i = i_192_;
		    i_181_ += i_182_;
		}
	    } else if (arg8 == 2) {
		int i_200_ = i;
		for (int i_201_ = -arg3; i_201_ < 0; i_201_++) {
		    int i_202_ = (i_178_ >> 16) * arg7;
		    for (int i_203_ = -arg2; i_203_ < 0; i_203_++) {
			int i_204_ = arg4;
			if (arg6[(i >> 16) + i_202_] != 0)
			    i_204_ = arg5;
			if (i_204_ != 0) {
			    int i_205_ = anIntArray4026[i_181_];
			    int i_206_ = i_204_ + i_205_;
			    int i_207_
				= (i_204_ & 0xff00ff) + (i_205_ & 0xff00ff);
			    i_205_ = (i_207_ & 0x1000100) + (i_206_ - i_207_
							     & 0x10000);
			    anIntArray4026[i_181_++]
				= i_206_ - i_205_ | i_205_ - (i_205_ >>> 8);
			} else
			    i_181_++;
			i += i_179_;
		    }
		    i_178_ += i_180_;
		    i = i_200_;
		    i_181_ += i_182_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public int method1271(int arg0) {
	return anInterface4_4069.method10(-19907, arg0).aShort578 & 0xffff;
    }
    
    public boolean method1272() {
	return aBoolean4032;
    }
    
    public boolean method1245() {
	return false;
    }
    
    public void method1229(int arg0) {
	int i = arg0 - anInt4054;
	for (Object object = aClass214_4028.method2777(-129); object != null;
	     object = aClass214_4028.method2784(-128)) {
	    Class131_Sub5 class131_sub5 = (Class131_Sub5) object;
	    if (class131_sub5.aBoolean4137) {
		class131_sub5.anInt4136 += i;
		int i_208_ = class131_sub5.anInt4136 / 20;
		if (i_208_ > 0) {
		    Class42 class42
			= anInterface4_4069.method10(-19907,
						     class131_sub5.anInt4139);
		    class131_sub5.method1653(class42.aByte565 * i * 50 / 1000,
					     class42.aByte559 * i * 50 / 1000);
		    class131_sub5.anInt4136 -= i_208_ * 20;
		}
		class131_sub5.aBoolean4137 = false;
	    }
	}
	anInt4054 = arg0;
	aClass214_4042.method2786(0, 5);
    }
    
    public void method1173(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	if (arg0 < anInt4066) {
	    arg2 -= anInt4066 - arg0;
	    arg0 = anInt4066;
	}
	if (arg1 < anInt4061) {
	    arg3 -= anInt4061 - arg1;
	    arg1 = anInt4061;
	}
	if (arg0 + arg2 > anInt4067)
	    arg2 = anInt4067 - arg0;
	if (arg1 + arg3 > anInt4024)
	    arg3 = anInt4024 - arg1;
	if (arg2 > 0 && arg3 > 0 && arg0 <= anInt4067 && arg1 <= anInt4024) {
	    int i = anInt4029 - arg2;
	    int i_209_ = arg0 + arg1 * anInt4029;
	    int i_210_ = arg4 >>> 24;
	    if (arg5 == 0 || arg5 == 1 && i_210_ == 255) {
		int i_211_ = arg2 >> 3;
		int i_212_ = arg2 & 0x7;
		arg2 = i_209_ - 1;
		for (int i_213_ = -arg3; i_213_ < 0; i_213_++) {
		    if (i_211_ > 0) {
			arg0 = i_211_;
			do {
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			    anIntArray4026[++arg2] = arg4;
			} while (--arg0 > 0);
		    }
		    if (i_212_ > 0) {
			arg0 = i_212_;
			do
			    anIntArray4026[++arg2] = arg4;
			while (--arg0 > 0);
		    }
		    arg2 += i;
		}
	    } else if (arg5 == 1) {
		arg4 = (((arg4 & 0xff00ff) * i_210_ >> 8 & 0xff00ff)
			+ ((arg4 & 0xff00) * i_210_ >> 8 & 0xff00)
			+ (i_210_ << 24));
		int i_214_ = 256 - i_210_;
		for (int i_215_ = 0; i_215_ < arg3; i_215_++) {
		    for (int i_216_ = -arg2; i_216_ < 0; i_216_++) {
			int i_217_ = anIntArray4026[i_209_];
			i_217_
			    = (((i_217_ & 0xff00ff) * i_214_ >> 8 & 0xff00ff)
			       + ((i_217_ & 0xff00) * i_214_ >> 8 & 0xff00));
			anIntArray4026[i_209_++] = arg4 + i_217_;
		    }
		    i_209_ += i;
		}
	    } else if (arg5 == 2) {
		for (int i_218_ = 0; i_218_ < arg3; i_218_++) {
		    for (int i_219_ = -arg2; i_219_ < 0; i_219_++) {
			int i_220_ = anIntArray4026[i_209_];
			int i_221_ = arg4 + i_220_;
			int i_222_ = (arg4 & 0xff00ff) + (i_220_ & 0xff00ff);
			i_220_ = (i_222_ & 0x1000100) + (i_221_ - i_222_
							 & 0x10000);
			anIntArray4026[i_209_++]
			    = i_221_ - i_220_ | i_220_ - (i_220_ >>> 8);
		    }
		    i_209_ += i;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1172(Class83 class83) {
	/* empty */
    }
    
    public void method1228(int[] arg0) {
	arg0[0] = anInt4066;
	arg0[1] = anInt4061;
	arg0[2] = anInt4067;
	arg0[3] = anInt4024;
    }
    
    public void method1185(boolean bool) {
	/* empty */
    }
    
    public Class44 method1224(Class55 arg0, Class124[] arg1, boolean arg2) {
	int[] is = new int[arg1.length];
	int[] is_223_ = new int[arg1.length];
	boolean bool = false;
	for (int i = 0; i < arg1.length; i++) {
	    is[i] = arg1[i].anInt1623;
	    is_223_[i] = arg1[i].anInt1619;
	    if (arg1[i].aByteArray1622 != null)
		bool = true;
	}
	if (arg2)
	    return new Class44_Sub4(this, arg0, arg1, is, is_223_);
	if (bool)
	    return new Class44_Sub2(this, arg0, arg1, is, is_223_);
	return new Class44_Sub1(this, arg0, arg1, is, is_223_);
    }
    
    public int method1235() {
	int i = anInt4041;
	anInt4041 = 0;
	return i;
    }
    
    public boolean method1255() {
	return true;
    }
    
    public void method1182() {
	/* empty */
    }
    
    public void method1273(Class1_Sub7_Sub1 arg0, int arg1, int arg2,
			   int arg3) {
	int i = arg3 >> 1;
	int i_224_ = arg0.anInt5207;
	if (i_224_ == -1)
	    method1207(arg1, arg2, i, arg0.anInt5214, 1);
	else {
	    if (aClass131_Sub35_4071 == null
		|| aClass131_Sub35_4071.aLong1791 != (long) i_224_)
		aClass131_Sub35_4071
		    = ((Class131_Sub35)
		       aClass214_4042.method2780(120, (long) i_224_));
	    if (aClass131_Sub35_4071 == null) {
		int[] is = method1268(i_224_);
		if (is != null) {
		    aClass131_Sub35_4071 = new Class131_Sub35();
		    aClass131_Sub35_4071.aBoolean4582 = method1264(i_224_);
		    int i_225_ = aClass131_Sub35_4071.aBoolean4582 ? 64 : 128;
		    aClass131_Sub35_4071.aClass152_4580
			= method1247(is, 0, i_225_, i_225_, i_225_);
		    aClass214_4042.method2773(true, aClass131_Sub35_4071,
					      (long) i_224_);
		} else
		    return;
	    }
	    if (aClass131_Sub35_4071.aBoolean4582) {
		i <<= 1;
		arg3 <<= 1;
	    }
	    aClass131_Sub35_4071.aClass152_4580.method2201(arg1 - i, arg2 - i,
							   arg3, arg3, 1,
							   arg0.anInt5214, 1);
	}
    }
    
    public void method1202(int i, int i_226_, int i_227_, int i_228_) {
	/* empty */
    }
    
    public Class9 method1238() {
	Class125 class125 = method1267(Thread.currentThread());
	return class125.aClass9_Sub2_1634;
    }
    
    public void method1196(Class154[] arg0, Class9 arg1, Class1_Sub5[] arg2,
			   int arg3) {
	Class154_Sub2[] class154_sub2s = new Class154_Sub2[arg0.length];
	for (int i = 0; i < arg0.length; i++) {
	    if (arg0[i] != null)
		class154_sub2s[i] = (Class154_Sub2) arg0[i];
	}
	Class154_Sub2 class154_sub2
	    = Class154_Sub2.method2333(this, class154_sub2s);
	class154_sub2.method2327(arg1, arg2 != null ? arg2[0] : null, null,
				 arg3);
    }
    
    public void method1244() {
	anInt4066 = 0;
	anInt4061 = 0;
	anInt4067 = anInt4029;
	anInt4024 = anInt4064;
	method1269();
    }
    
    public Class83 method1181(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5) {
	return null;
    }
    
    public void method1230(int arg0, int arg1) {
	anInt4043 = arg0;
	anInt4030 = arg1;
	anInt4048 = anInt4030 - 255;
	method1275();
    }
    
    public void method1204(Class154 arg0, Class105 arg1, Class9 arg2,
			   Class1_Sub5 arg3, int arg4) {
	((Class154_Sub2) arg0).method2327(arg2, arg3, arg1, arg4);
    }
    
    public boolean method1213() {
	return false;
    }
    
    public boolean method1274(int arg0) {
	return anInterface4_4069.method10(-19907, arg0).aBoolean557;
    }
    
    public boolean method1216() {
	return false;
    }
    
    public int[] method1174(int arg0, int arg1, int arg2, int arg3) {
	int[] is = new int[arg2 * arg3];
	int i = 0;
	for (int i_229_ = 0; i_229_ < arg3; i_229_++) {
	    int i_230_ = (arg1 + i_229_) * anInt4029 + arg0;
	    for (int i_231_ = 0; i_231_ < arg2; i_231_++)
		is[i++] = anIntArray4026[i_230_ + i_231_];
	}
	return is;
    }
    
    public boolean method1170() {
	return true;
    }
    
    public void method1191(int arg0) {
	method1173(0, 0, anInt4029, anInt4064, arg0, 0);
    }
    
    public void method1217(int i, Class131_Sub8[] class131_sub8s) {
	/* empty */
    }
    
    public void method1187(int arg0) {
	aClass125Array4040[arg0].method1101(null, -112);
    }
    
    public Class152 method1247(int[] arg0, int arg1, int arg2, int arg3,
			       int arg4) {
	boolean bool = false;
	int i = arg1;
    while_10_:
	for (int i_232_ = 0; i_232_ < arg4; i_232_++) {
	    for (int i_233_ = 0; i_233_ < arg3; i_233_++) {
		int i_234_ = arg0[i++] >>> 24;
		if (i_234_ != 0 && i_234_ != 255) {
		    bool = true;
		    break while_10_;
		}
	    }
	}
	if (bool)
	    return new Class152_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4);
	return new Class152_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
    }
    
    public int method1164() {
	return anInt4030;
    }
    
    public int method1249() {
	return 0;
    }
    
    public int method1203(int arg0, int arg1) {
	return arg0 | arg1;
    }
    
    public void method1275() {
	if (aFloat4033 != 0.0F) {
	    float f = (float) anInt4030;
	    float f_235_ = (float) anInt4043;
	    float f_236_ = -(2.0F * f_235_ * f) / (f - f_235_);
	    float f_237_ = aFloat4062 / (aFloat4033 + aFloat4062);
	    float f_238_ = f_237_ * f_237_;
	    float f_239_
		= -f_236_ * (1.0F - f_237_) * (1.0F - f_237_) / aFloat4033;
	    anInt4050
		= (int) (0.5F + (((float) anInt4030 - f_236_ * f_238_)
				 / ((f + f_235_) / (f - f_235_) - f_239_)));
	} else
	    anInt4050 = anInt4030;
    }
    
    public void method1219(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, int arg8, int arg9) {
	Class125 class125 = method1267(Thread.currentThread());
	Class65 class65 = class125.aClass65_1638;
	class65.aBoolean823 = false;
	int i = arg6 >>> 24;
	if (arg9 == 0 || arg9 == 1 && i == 255) {
	    class65.aBoolean823 = false;
	    class65.anInt819 = 0;
	    class65.aBoolean820 = true;
	    class65.method689(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7,
			      arg8);
	} else if (arg9 == 1) {
	    class65.aBoolean823 = false;
	    class65.anInt819 = 255 - i;
	    class65.aBoolean820 = true;
	    class65.method689(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7,
			      arg8);
	} else {
	    if (arg9 == 2)
		throw new IllegalStateException();
	    throw new IllegalArgumentException();
	}
	class65.aBoolean823 = true;
    }
    
    public boolean method1259() {
	return false;
    }
    
    public boolean method1197() {
	return false;
    }
    
    public void method1231(Class131_Sub27 class131_sub27) {
	/* empty */
    }
    
    public void method1232(int arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5) {
	anInt4034 = (int) (arg1 * 65535.0F);
	anInt4037 = (int) (arg2 * 65535.0F);
	float f = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4
					      + arg5 * arg5));
	anInt4052 = (int) (arg3 * 65535.0F / f);
	anInt4070 = (int) (arg4 * 65535.0F / f);
	anInt4047 = (int) (arg5 * 65535.0F / f);
    }
    
    public float method1239() {
	return aFloat4033;
    }
    
    public void method1252(float arg0, float arg1) {
	aFloat4062 = arg0;
	aFloat4033 = arg1;
	method1275();
    }
    
    public void method1177(boolean bool) {
	/* empty */
    }
    
    public void method1192(int arg0, Class183 arg1, int arg2, int arg3) {
	Class183_Sub1 class183_sub1 = (Class183_Sub1) arg1;
	int[] is = class183_sub1.anIntArray4954;
	int[] is_240_ = class183_sub1.anIntArray4963;
	int i;
	if (anInt4024 < arg3 + is.length)
	    i = anInt4024 - arg3;
	else
	    i = is.length;
	int i_241_;
	if (anInt4061 > arg3) {
	    i_241_ = anInt4061 - arg3;
	    arg3 = anInt4061;
	} else
	    i_241_ = 0;
	if (i - i_241_ > 0) {
	    int i_242_ = arg3 * anInt4029;
	    for (int i_243_ = i_241_; i_243_ < i; i_243_++) {
		int i_244_ = arg2 + is[i_243_];
		int i_245_ = is_240_[i_243_];
		if (anInt4066 > i_244_) {
		    i_245_ -= anInt4066 - i_244_;
		    i_244_ = anInt4066;
		}
		if (anInt4067 < i_244_ + i_245_)
		    i_245_ = anInt4067 - i_244_;
		i_244_ += i_242_;
		for (int i_246_ = -i_245_; i_246_ < 0; i_246_++)
		    anIntArray4026[i_244_++] = arg0;
		i_242_ += anInt4029;
	    }
	}
    }
    
    public void method1234(Class154[] arg0, Class105 arg1, Class9 arg2,
			   Class1_Sub5[] arg3, int arg4) {
	Class154_Sub2[] class154_sub2s = new Class154_Sub2[arg0.length];
	for (int i = 0; i < arg0.length; i++) {
	    if (arg0[i] != null)
		class154_sub2s[i] = (Class154_Sub2) arg0[i];
	}
	Class154_Sub2 class154_sub2
	    = Class154_Sub2.method2333(this, class154_sub2s);
	class154_sub2.method2327(arg2, arg3 != null ? arg3[0] : null, arg1,
				 arg4);
    }
    
    public Class130_Sub1(Canvas arg0, Interface4 arg1, int arg2) {
	anInt4024 = 0;
	anInt4030 = 3500;
	anInt4031 = 0;
	anInt4041 = 0;
	anInt4036 = 512;
	anInt4034 = 45823;
	anInt4035 = 0;
	anInt4051 = 75518;
	anInt4045 = 0;
	aBoolean4032 = false;
	anInt4050 = 3500;
	anInt4048 = anInt4030 - 255;
	aBoolean4039 = false;
	anInt4061 = 0;
	aBoolean4025 = false;
	aBoolean4056 = false;
	anInt4043 = 50;
	anInt4055 = 0;
	anInt4066 = 0;
	anInt4027 = 0;
	anInt4068 = 512;
	anInt4067 = 0;
	aClass214_4042 = new Class214(16);
	aCanvas4063 = arg0;
	anInterface4_4069 = arg1;
	anInt1781 = arg2;
	aClass46_4044 = Class110_Sub1.method943(aCanvas4063, (byte) 127);
	anIntArray4026 = aClass46_4044.anIntArray630;
	anInt4029 = aClass46_4044.anInt636;
	anInt4064 = aClass46_4044.anInt634;
	method1266();
    }
}
