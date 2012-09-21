/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class215
{
    public static int anInt3148;
    public int anInt3149 = 32;
    public static int anInt3150;
    public boolean aBoolean3151 = false;
    public static int[] anIntArray3152;
    public Class131_Sub1 aClass131_Sub1_3153;
    public static int anInt3154;
    public static int anInt3155;
    public static int anInt3156;
    public static int anInt3157;
    public static int anInt3158;
    public static String[] aStringArray3159 = new String[100];
    public static int anInt3160;
    public static int anInt3161;
    public static int anInt3162;
    public static int anInt3163;
    public static int anInt3164;
    public static int anInt3165;
    public static int anInt3166;
    public static int anInt3167;
    public static int anInt3168;
    public int[] anIntArray3169;
    public static int anInt3170;
    public long aLong3171 = Class208.method2749(-3913);
    public int anInt3172;
    public int anInt3173 = 0;
    public int anInt3174;
    public long aLong3175 = 0L;
    public long aLong3176;
    public int anInt3177 = 0;
    public static int anInt3178;
    public Class131_Sub1[] aClass131_Sub1Array3179 = new Class131_Sub1[8];
    public Class131_Sub1[] aClass131_Sub1Array3180;
    public int anInt3181;
    public int anInt3182;
    public boolean aBoolean3183;
    public int anInt3184;
    
    public synchronized void method2789(int arg0) {
	try {
	    anInt3150++;
	    if (!aBoolean3151) {
		long l = Class208.method2749(-3913);
		try {
		    if ((aLong3171 - -500000L ^ 0xffffffffffffffffL)
			> (l ^ 0xffffffffffffffffL))
			aLong3171 = -500000L + l;
		    for (/**/;
			 ((aLong3171 + 5000L ^ 0xffffffffffffffffL)
			  > (l ^ 0xffffffffffffffffL));
			 aLong3171 += (long) (256000
					      / Class131_Sub2_Sub14.anInt5754))
			method2790(127, 256);
		} catch (Exception exception) {
		    aLong3171 = l;
		}
		if (anIntArray3169 != null) {
		    try {
			if ((aLong3176 ^ 0xffffffffffffffffL) != -1L) {
			    if ((aLong3176 ^ 0xffffffffffffffffL)
				< (l ^ 0xffffffffffffffffL))
				return;
			    method2797(anInt3181);
			    aLong3176 = 0L;
			    aBoolean3183 = true;
			}
			int i = method2792();
			if (anInt3173 < -i + anInt3172)
			    anInt3173 = anInt3172 - i;
			int i_0_ = anInt3184 + anInt3174;
			if ((256 + i_0_ ^ 0xffffffff) < -16385)
			    i_0_ = 16128;
			if (i_0_ + 256 > anInt3181) {
			    anInt3181 += 1024;
			    if (anInt3181 > 16384)
				anInt3181 = 16384;
			    method2794();
			    method2797(anInt3181);
			    i = 0;
			    if ((256 + i_0_ ^ 0xffffffff)
				< (anInt3181 ^ 0xffffffff)) {
				i_0_ = -256 + anInt3181;
				anInt3184 = i_0_ - anInt3174;
			    }
			    aBoolean3183 = true;
			}
			if (arg0 <= 88)
			    method2791(54, 18, 32, -9, 107, 105, false, -28,
				       -10, -79);
			for (/**/; (i ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
			     i += 256) {
			    method2795(anIntArray3169, 256);
			    method2807();
			}
			if ((aLong3175 ^ 0xffffffffffffffffL)
			    > (l ^ 0xffffffffffffffffL)) {
			    if (aBoolean3183)
				aBoolean3183 = false;
			    else {
				if ((anInt3173 ^ 0xffffffff) == -1
				    && (anInt3177 ^ 0xffffffff) == -1) {
				    method2794();
				    aLong3176 = 2000L + l;
				    return;
				}
				anInt3184 = Math.min(anInt3177, anInt3173);
				anInt3177 = anInt3173;
			    }
			    aLong3175 = l - -2000L;
			    anInt3173 = 0;
			}
			anInt3172 = i;
		    } catch (Exception exception) {
			method2794();
			aLong3176 = l + 2000L;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.N(" + arg0 + ')');
	}
    }
    
    public void method2790(int arg0, int arg1) {
	anInt3164++;
	if (arg0 >= 85) {
	    anInt3182 -= arg1;
	    if (anInt3182 < 0)
		anInt3182 = 0;
	    if (aClass131_Sub1_3153 != null)
		aClass131_Sub1_3153.method1360(arg1);
	}
    }
    
    public static void method2791(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, boolean arg6, int arg7,
				  int arg8, int arg9) {
	try {
	    if (arg6 != false)
		method2791(-54, 95, 81, 61, -80, 102, false, -34, 71, -122);
	    if ((arg5 ^ 0xffffffff) == (arg8 ^ 0xffffffff)
		&& (arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		&& (arg0 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
		&& (arg4 ^ 0xffffffff) == (arg9 ^ 0xffffffff))
		Stream.method1718(arg5, arg7, false, arg9, arg1, arg2);
	    else {
		int i = arg5;
		int i_1_ = arg2;
		int i_2_ = arg5 * 3;
		int i_3_ = 3 * arg2;
		int i_4_ = arg8 * 3;
		int i_5_ = arg3 * 3;
		int i_6_ = arg0 * 3;
		int i_7_ = arg4 * 3;
		int i_8_ = arg7 + -i_6_ + i_4_ + -arg5;
		int i_9_ = -i_7_ + arg9 + i_5_ + -arg2;
		int i_10_ = i_2_ + i_6_ - i_4_ - i_4_;
		int i_11_ = -i_5_ + (i_7_ + (-i_5_ - -i_3_));
		int i_12_ = -i_2_ + i_4_;
		int i_13_ = i_5_ - i_3_;
		for (int i_14_ = 128; (i_14_ ^ 0xffffffff) >= -4097;
		     i_14_ += 128) {
		    int i_15_ = i_14_ * i_14_ >> 58326668;
		    int i_16_ = i_14_ * i_15_ >> -163029812;
		    int i_17_ = i_8_ * i_16_;
		    int i_18_ = i_16_ * i_9_;
		    int i_19_ = i_10_ * i_15_;
		    int i_20_ = i_15_ * i_11_;
		    int i_21_ = i_14_ * i_12_;
		    int i_22_ = i_13_ * i_14_;
		    int i_23_ = (i_21_ + i_17_ - -i_19_ >> -1477558868) + arg5;
		    int i_24_
			= arg2 - -(i_18_ - (-i_20_ - i_22_) >> -417215860);
		    Stream.method1718(i, i_23_, false, i_24_, arg1,
					      i_1_);
		    i_1_ = i_24_;
		    i = i_23_;
		}
	    }
	    anInt3160++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wi.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public int method2792() throws Exception {
	try {
	    anInt3165++;
	    return anInt3181;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.B(" + ')');
	}
    }
    
    public synchronized void method2793(byte arg0) {
	try {
	    aBoolean3183 = true;
	    anInt3168++;
	    try {
		method2804();
		int i = -106 % ((arg0 - 25) / 56);
	    } catch (Exception exception) {
		method2794();
		aLong3176 = Class208.method2749(-3913) + 2000L;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.K(" + arg0 + ')');
	}
    }
    
    public void method2794() {
	try {
	    anInt3157++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.D(" + ')');
	}
    }
    
    public void method2795(int[] arg0, int arg1) {
	int i = arg1;
	if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
	    i <<= 1;
	Class61.method656(arg0, 0, i);
	anInt3182 -= arg1;
	if (aClass131_Sub1_3153 != null && anInt3182 <= 0) {
	    anInt3182 += Class131_Sub2_Sub14.anInt5754 >> 4;
	    Class77.method777(false, aClass131_Sub1_3153);
	    method2798(aClass131_Sub1_3153.method1361(), -106,
		       aClass131_Sub1_3153);
	    int i_25_ = 0;
	    int i_26_ = 255;
	    int i_27_ = 7;
	while_79_:
	    while (i_26_ != 0) {
		int i_28_;
		int i_29_;
		if (i_27_ < 0) {
		    i_28_ = i_27_ & 0x3;
		    i_29_ = -(i_27_ >> 2);
		} else {
		    i_28_ = i_27_;
		    i_29_ = 0;
		}
		for (int i_30_ = i_26_ >>> i_28_ & 0x11111111; i_30_ != 0;
		     i_30_ >>>= 4) {
		    if ((i_30_ & 0x1) != 0) {
			i_26_ &= 1 << i_28_ ^ 0xffffffff;
			Class131_Sub1 class131_sub1 = null;
			Class131_Sub1 class131_sub1_31_
			    = aClass131_Sub1Array3179[i_28_];
			while (class131_sub1_31_ != null) {
			    Class131_Sub12 class131_sub12
				= class131_sub1_31_.aClass131_Sub12_4075;
			    if (class131_sub12 != null
				&& class131_sub12.anInt4256 > i_29_) {
				i_26_ |= 1 << i_28_;
				class131_sub1 = class131_sub1_31_;
				class131_sub1_31_
				    = class131_sub1_31_.aClass131_Sub1_4072;
			    } else {
				class131_sub1_31_.aBoolean4073 = true;
				int i_32_ = class131_sub1_31_.method1362();
				i_25_ += i_32_;
				if (class131_sub12 != null)
				    class131_sub12.anInt4256 += i_32_;
				if (i_25_ >= anInt3149)
				    break while_79_;
				Class131_Sub1 class131_sub1_33_
				    = class131_sub1_31_.method1359();
				if (class131_sub1_33_ != null) {
				    int i_34_ = class131_sub1_31_.anInt4074;
				    for (/**/; class131_sub1_33_ != null;
					 class131_sub1_33_
					     = class131_sub1_31_.method1357())
					method2798((i_34_ * class131_sub1_33_
								.method1361()
						    >> 8),
						   -86, class131_sub1_33_);
				}
				Class131_Sub1 class131_sub1_35_
				    = class131_sub1_31_.aClass131_Sub1_4072;
				class131_sub1_31_.aClass131_Sub1_4072 = null;
				if (class131_sub1 == null)
				    aClass131_Sub1Array3179[i_28_]
					= class131_sub1_35_;
				else
				    class131_sub1.aClass131_Sub1_4072
					= class131_sub1_35_;
				if (class131_sub1_35_ == null)
				    aClass131_Sub1Array3180[i_28_]
					= class131_sub1;
				class131_sub1_31_ = class131_sub1_35_;
			    }
			}
		    }
		    i_28_ += 4;
		    i_29_++;
		}
		i_27_--;
	    }
	    for (int i_36_ = 0; i_36_ < 8; i_36_++) {
		Class131_Sub1 class131_sub1 = aClass131_Sub1Array3179[i_36_];
		aClass131_Sub1Array3179[i_36_]
		    = aClass131_Sub1Array3180[i_36_] = null;
		Class131_Sub1 class131_sub1_37_;
		for (/**/; class131_sub1 != null;
		     class131_sub1 = class131_sub1_37_) {
		    class131_sub1_37_ = class131_sub1.aClass131_Sub1_4072;
		    class131_sub1.aClass131_Sub1_4072 = null;
		}
	    }
	}
	if (anInt3182 < 0)
	    anInt3182 = 0;
	if (aClass131_Sub1_3153 != null)
	    aClass131_Sub1_3153.method1363(arg0, 0, arg1);
	aLong3171 = Class208.method2749(-3913);
    }
    
    public void method2796(Component arg0) throws Exception {
	try {
	    anInt3148++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.C(" + (arg0 != null
							   ? "{...}"
							   : "null") + ')');
	}
    }
    
    public void method2797(int arg0) throws Exception {
	try {
	    anInt3167++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.E(" + arg0 + ')');
	}
    }
    
    public void method2798(int arg0, int arg1, Class131_Sub1 arg2) {
	try {
	    if (arg1 >= -49)
		method2798(103, -99, null);
	    anInt3178++;
	    int i = arg0 >> -102913051;
	    Class131_Sub1 class131_sub1 = aClass131_Sub1Array3180[i];
	    if (class131_sub1 == null)
		aClass131_Sub1Array3179[i] = arg2;
	    else
		class131_sub1.aClass131_Sub1_4072 = arg2;
	    aClass131_Sub1Array3180[i] = arg2;
	    arg2.anInt4074 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wi.J(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void method2799(int arg0) {
	try {
	    anInt3161++;
	    if (Class210.aClass115_3069 != null) {
		boolean bool = true;
		for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
		    if (this == Class210.aClass115_3069.aClass215Array1478[i])
			Class210.aClass115_3069.aClass215Array1478[i] = null;
		    if (Class210.aClass115_3069.aClass215Array1478[i] != null)
			bool = false;
		}
		if (bool) {
		    Class210.aClass115_3069.aBoolean1475 = true;
		    while (Class210.aClass115_3069.aBoolean1480)
			Class187.method2575(-22, 50L);
		    Class210.aClass115_3069 = null;
		}
	    }
	    if (arg0 == 14682) {
		method2794();
		aBoolean3151 = true;
		anIntArray3169 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.H(" + arg0 + ')');
	}
    }
    
    public void method2800(int arg0) {
	try {
	    if (arg0 != 0)
		method2800(54);
	    aBoolean3183 = true;
	    anInt3158++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.R(" + arg0 + ')');
	}
    }
    
    public static void method2801(byte arg0) {
	try {
	    anIntArray3152 = null;
	    aStringArray3159 = null;
	    int i = -77 % ((-15 - arg0) / 57);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.I(" + arg0 + ')');
	}
    }
    
    public static void method2802(int arg0, boolean arg1) {
	try {
	    anInt3166++;
	    if (Class131_Sub2_Sub13.aBoolean5738 != arg1) {
		Class131_Sub2_Sub13.aBoolean5738 = arg1;
		Class105.method916(0);
		int i = -111 % ((22 - arg0) / 43);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wi.T(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class131_Sub20 method2803(byte arg0) {
	try {
	    anInt3162++;
	    if (Class127.aClass119_1715 == null
		|| Class43.aClass193_588 == null)
		return null;
	    if (arg0 != -50)
		return null;
	    Class43.aClass193_588.method2630(Class127.aClass119_1715,
					     (byte) -120);
	    Class131_Sub20 class131_sub20
		= ((Class131_Sub20)
		   Class43.aClass193_588.method2626((byte) -111));
	    if (class131_sub20 == null)
		return null;
	    Class94 class94
		= Class131_Sub2_Sub32.method1626(class131_sub20.anInt4427,
						 (byte) 1);
	    if (class94 == null || !class94.aBoolean1239
		|| !class94.method861(-1))
		return Class125.method1098(true);
	    return class131_sub20;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.M(" + arg0 + ')');
	}
    }
    
    public void method2804() throws Exception {
	try {
	    anInt3170++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.A(" + ')');
	}
    }
    
    public static boolean method2805(int arg0, boolean arg1,
				     Class147[][][] arg2, int arg3, int arg4,
				     int arg5) {
	try {
	    anInt3155++;
	    byte i = arg1 ? (byte) 1 : (byte) (0xff & Class83.anInt1093);
	    if (((Class146.aByteArrayArrayArray1942[Class29.anInt300][arg5]
		  [arg4])
		 ^ 0xffffffff)
		== (i ^ 0xffffffff))
		return false;
	    if ((0x4 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
			[Class29.anInt300][arg5][arg4]))
		== 0)
		return false;
	    int i_38_ = 0;
	    if (arg3 != -27508)
		return false;
	    int i_39_ = 0;
	    Class197.anIntArray2876[i_38_] = arg5;
	    Class110_Sub1.anIntArray3900[i_38_++] = arg4;
	    Class146.aByteArrayArrayArray1942[Class29.anInt300][arg5][arg4]
		= i;
	    while (i_38_ != i_39_) {
		int i_40_ = Class197.anIntArray2876[i_39_] & 0xffff;
		int i_41_ = Class197.anIntArray2876[i_39_] >> 156443760 & 0xff;
		int i_42_
		    = Class197.anIntArray2876[i_39_] >> -1031677416 & 0xff;
		int i_43_ = Class110_Sub1.anIntArray3900[i_39_] & 0xffff;
		int i_44_
		    = (0xff
		       & Class110_Sub1.anIntArray3900[i_39_] >> -2028299056);
		i_39_ = 0xfff & i_39_ + 1;
		boolean bool = false;
		if ((0x4 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
			    [Class29.anInt300][i_40_][i_43_]))
		    == 0)
		    bool = true;
		boolean bool_45_ = false;
	    while_81_:
		for (int i_46_ = Class29.anInt300 + 1;
		     (i_46_ ^ 0xffffffff) >= -4; i_46_++) {
		    if ((0x8 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				[i_46_][i_40_][i_43_])
			 ^ 0xffffffff)
			== -1) {
			if (bool && arg2[i_46_][i_40_][i_43_] != null) {
			    if (arg2[i_46_][i_40_][i_43_].aClass23_Sub1_1966
				!= null) {
				int i_47_ = Class89.method839(i_41_, -110);
				if (i_47_ == (arg2[i_46_][i_40_][i_43_]
					      .aClass23_Sub1_1966.anInt3697)
				    || ((arg2[i_46_][i_40_][i_43_]
					 .aClass23_Sub1_1969) != null
					&& ((arg2[i_46_][i_40_][i_43_]
					     .aClass23_Sub1_1969.anInt3697)
					    == i_47_)))
				    continue;
				if (i_42_ != 0) {
				    int i_48_ = Class89.method839(i_42_, -114);
				    if (((arg2[i_46_][i_40_][i_43_]
					  .aClass23_Sub1_1966.anInt3697)
					 ^ 0xffffffff) == (i_48_ ^ 0xffffffff)
					|| ((arg2[i_46_][i_40_][i_43_]
					     .aClass23_Sub1_1969) != null
					    && (((arg2[i_46_][i_40_][i_43_]
						  .aClass23_Sub1_1969
						  .anInt3697)
						 ^ 0xffffffff)
						== (i_48_ ^ 0xffffffff))))
					continue;
				}
				if (i_44_ != 0) {
				    int i_49_
					= Class89.method839(i_44_,
							    arg3 ^ 0x6b11);
				    if (((i_49_ ^ 0xffffffff)
					 == ((arg2[i_46_][i_40_][i_43_]
					      .aClass23_Sub1_1966.anInt3697)
					     ^ 0xffffffff))
					|| ((arg2[i_46_][i_40_][i_43_]
					     .aClass23_Sub1_1969) != null
					    && (((arg2[i_46_][i_40_][i_43_]
						  .aClass23_Sub1_1969
						  .anInt3697)
						 ^ 0xffffffff)
						== (i_49_ ^ 0xffffffff))))
					continue;
				}
			    }
			    Class147 class147 = arg2[i_46_][i_40_][i_43_];
			    if (class147.aClass82_1958 != null) {
				for (Class82 class82 = class147.aClass82_1958;
				     class82 != null;
				     class82 = class82.aClass82_1086) {
				    Class23_Sub4 class23_sub4
					= class82.aClass23_Sub4_1080;
				    if (class23_sub4 instanceof Interface6) {
					Interface6 interface6
					    = (Interface6) class23_sub4;
					int i_50_
					    = interface6.method21(arg3 + 5452);
					if (i_50_ == 21)
					    i_50_ = 19;
					int i_51_
					    = interface6.method24((byte) -68);
					int i_52_ = i_50_ | i_51_ << 300509286;
					if (((i_41_ ^ 0xffffffff)
					     == (i_52_ ^ 0xffffffff))
					    || ((i_42_ ^ 0xffffffff) != -1
						&& i_42_ == i_52_)
					    || (i_44_ != 0
						&& ((i_52_ ^ 0xffffffff)
						    == (i_44_ ^ 0xffffffff))))
					    continue while_81_;
				    }
				}
			    }
			}
			Class147 class147 = arg2[i_46_][i_40_][i_43_];
			if (class147 != null
			    && class147.aClass82_1958 != null) {
			    for (Class82 class82 = class147.aClass82_1958;
				 class82 != null;
				 class82 = class82.aClass82_1086) {
				Class23_Sub4 class23_sub4
				    = class82.aClass23_Sub4_1080;
				if ((class23_sub4.aShort3745
				     != class23_sub4.aShort3742)
				    || (class23_sub4.aShort3735
					!= class23_sub4.aShort3737)) {
				    for (int i_53_ = class23_sub4.aShort3745;
					 i_53_ <= class23_sub4.aShort3742;
					 i_53_++) {
					for (int i_54_
						 = class23_sub4.aShort3737;
					     ((class23_sub4.aShort3735
					       ^ 0xffffffff)
					      <= (i_54_ ^ 0xffffffff));
					     i_54_++)
					    Class146
						.aByteArrayArrayArray1942
						[i_46_][i_53_][i_54_]
						= i;
				    }
				}
			    }
			}
			bool_45_ = true;
			Class146.aByteArrayArrayArray1942[i_46_][i_40_][i_43_]
			    = i;
		    }
		}
		if (bool_45_) {
		    int i_55_ = Class75.aClass68Array1023
				    [Class29.anInt300 + 1]
				    .method712(i_40_, i_43_);
		    if ((i_55_ ^ 0xffffffff)
			< (Class53.anIntArray699[arg0] ^ 0xffffffff))
			Class53.anIntArray699[arg0] = i_55_;
		    int i_56_ = i_40_ << 1299542983;
		    int i_57_ = i_43_ << 1917798759;
		    if (i_56_ >= Class153.anIntArray2028[arg0]) {
			if (Class121_Sub2_Sub1.anIntArray5425[arg0] < i_56_)
			    Class121_Sub2_Sub1.anIntArray5425[arg0] = i_56_;
		    } else
			Class153.anIntArray2028[arg0] = i_56_;
		    if (i_57_ >= Class131_Sub2_Sub25.anIntArray5915[arg0]) {
			if ((Class131_Sub2_Sub12.anIntArray5723[arg0]
			     ^ 0xffffffff)
			    > (i_57_ ^ 0xffffffff))
			    Class131_Sub2_Sub12.anIntArray5723[arg0] = i_57_;
		    } else
			Class131_Sub2_Sub25.anIntArray5915[arg0] = i_57_;
		}
		if (!bool) {
		    if (i_40_ >= 1
			&& i != (Class146.aByteArrayArrayArray1942
				 [Class29.anInt300][-1 + i_40_][i_43_])) {
			Class197.anIntArray2876[i_38_]
			    = Cryption.method2105(Cryption.method2105((i_40_
								       + -1),
								      1179648),
						  -754974720);
			Class110_Sub1.anIntArray3900[i_38_]
			    = Cryption.method2105(i_43_, 1245184);
			Class146.aByteArrayArrayArray1942[Class29.anInt300]
			    [i_40_ - 1][i_43_]
			    = i;
			i_38_ = 0xfff & i_38_ - -1;
		    }
		    if ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			< (++i_43_ ^ 0xffffffff)) {
			if (i_40_ + -1 >= 0
			    && ((i ^ 0xffffffff)
				!= ((Class146.aByteArrayArrayArray1942
				     [Class29.anInt300][i_40_ + -1][i_43_])
				    ^ 0xffffffff))
			    && ((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				 [Class29.anInt300][i_40_][i_43_]) & 0x4
				^ 0xffffffff) == -1
			    && ((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				 [Class29.anInt300][i_40_ + -1][i_43_ + -1])
				& 0x4) == 0) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (Cryption.method2105(i_40_ - 1, 1179648),
				    1375731712));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(1245184, i_43_);
			    i_38_ = 0xfff & i_38_ + 1;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][-1 + i_40_][i_43_]
				= i;
			}
			if (i != (Class146.aByteArrayArrayArray1942
				  [Class29.anInt300][i_40_][i_43_])) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (Cryption.method2105(i_40_, 5373952),
				    318767104));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(5439488, i_43_);
			    i_38_ = 0xfff & i_38_ + 1;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][i_40_][i_43_]
				= i;
			}
			if (i_40_ + 1 < Class131_Sub41_Sub11_Sub1.anInt6546
			    && (Class146.aByteArrayArrayArray1942
				[Class29.anInt300][i_40_ + 1][i_43_]) != i
			    && ((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				 [Class29.anInt300][i_40_][i_43_]) & 0x4
				^ 0xffffffff) == -1
			    && (((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				  [Class29.anInt300][1 + i_40_][-1 + i_43_])
				 & 0x4)
				^ 0xffffffff) == -1) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (-1845493760,
				    Cryption.method2105(5373952, 1 + i_40_)));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(i_43_, 5439488);
			    i_38_ = 0xfff & i_38_ - -1;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][i_40_ + 1][i_43_]
				= i;
			}
		    }
		    i_43_--;
		    if (((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			 < (i_40_ + 1 ^ 0xffffffff))
			&& ((Class146.aByteArrayArrayArray1942
			     [Class29.anInt300][i_40_ - -1][i_43_])
			    ^ 0xffffffff) != (i ^ 0xffffffff)) {
			Class197.anIntArray2876[i_38_]
			    = (Cryption.method2105
			       (1392508928,
				Cryption.method2105(1 + i_40_, 9568256)));
			Class110_Sub1.anIntArray3900[i_38_]
			    = Cryption.method2105(i_43_, 9633792);
			Class146.aByteArrayArrayArray1942[Class29.anInt300]
			    [1 + i_40_][i_43_]
			    = i;
			i_38_ = 0xfff & 1 + i_38_;
		    }
		    if (--i_43_ >= 0) {
			if ((-1 + i_40_ ^ 0xffffffff) <= -1
			    && i != (Class146.aByteArrayArrayArray1942
				     [Class29.anInt300][-1 + i_40_][i_43_])
			    && (0x4
				& (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [Class29.anInt300][i_40_][i_43_])) == 0
			    && (((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				  [Class29.anInt300][i_40_ + -1][1 + i_43_])
				 & 0x4)
				^ 0xffffffff) == -1) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (301989888,
				    Cryption.method2105(i_40_ - 1, 13762560)));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(i_43_, 13828096);
			    i_38_ = 0xfff & 1 + i_38_;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][-1 + i_40_][i_43_]
				= i;
			}
			if ((Class146.aByteArrayArrayArray1942
			     [Class29.anInt300][i_40_][i_43_])
			    != i) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (-1828716544,
				    Cryption.method2105(i_40_, 13762560)));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(i_43_, 13828096);
			    i_38_ = i_38_ - -1 & 0xfff;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][i_40_][i_43_]
				= i;
			}
			if (((1 + i_40_ ^ 0xffffffff)
			     > (Class131_Sub41_Sub11_Sub1.anInt6546
				^ 0xffffffff))
			    && i != (Class146.aByteArrayArrayArray1942
				     [Class29.anInt300][1 + i_40_][i_43_])
			    && ((Class23_Sub2_Sub1.aByteArrayArrayArray4992
				 [Class29.anInt300][i_40_][i_43_])
				& 0x4) == 0
			    && ((0x4
				 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				    [Class29.anInt300][i_40_ - -1][1 + i_43_]))
				^ 0xffffffff) == -1) {
			    Class197.anIntArray2876[i_38_]
				= (Cryption.method2105
				   (-771751936,
				    Cryption.method2105(1 + i_40_, 9568256)));
			    Class110_Sub1.anIntArray3900[i_38_]
				= Cryption.method2105(9633792, i_43_);
			    i_38_ = 0xfff & 1 + i_38_;
			    Class146.aByteArrayArrayArray1942
				[Class29.anInt300][i_40_ - -1][i_43_]
				= i;
			}
		    }
		}
	    }
	    if (Class53.anIntArray699[arg0] != -1000000) {
		Class53.anIntArray699[arg0] += 10;
		Class153.anIntArray2028[arg0] -= 50;
		Class121_Sub2_Sub1.anIntArray5425[arg0] += 50;
		Class131_Sub2_Sub12.anIntArray5723[arg0] += 50;
		Class131_Sub2_Sub25.anIntArray5915[arg0] -= 50;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wi.S(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ')'));
	}
    }
    
    public synchronized void method2806(Class131_Sub1 arg0, int arg1) {
	anInt3154++;
	aClass131_Sub1_3153 = arg0;
	if (arg1 != -26391)
	    aLong3171 = 10L;
    }
    
    public void method2807() throws Exception {
	try {
	    anInt3163++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wi.F(" + ')');
	}
    }
    
    public Class215() {
	anInt3172 = 0;
	anInt3182 = 0;
	aClass131_Sub1Array3180 = new Class131_Sub1[8];
	aLong3176 = 0L;
	aBoolean3183 = true;
    }
}
