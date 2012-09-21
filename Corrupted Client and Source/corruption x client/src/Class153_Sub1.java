/* Class153_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153_Sub1 extends Class153
{
    public static int anInt4752;
    public int[] anIntArray4753;
    public static int anInt4754;
    public int anInt4755;
    public static Class158 aClass158_4756;
    public static Class120 aClass120_4757;
    public static int[] anIntArray4758 = new int[14];
    public int anInt4759;
    public static int anInt4760;
    public static Class152[] aClass152Array4761;
    public static int anInt4762;
    public static int[] anIntArray4763;
    public static Class131_Sub41_Sub10[] aClass131_Sub41_Sub10Array4764
	= new Class131_Sub41_Sub10[14];
    public byte[] aByteArray4765;
    public static int anInt4766;
    public static int anInt4767;
    
    public void method2231(boolean arg0) {
	try {
	    if (arg0 != false)
		method2234(4);
	    anInt4759 = Math.abs(anInt4759);
	    anInt4760++;
	    if ((anInt4759 ^ 0xffffffff) <= -4097)
		anInt4759 = 4095;
	    method2232(anInt4755++, (byte) (anInt4759 >> -796864028));
	    anInt4759 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"he.E(" + arg0 + ')');
	}
    }
    
    public void method2230(int arg0, int arg1, int arg2) {
	try {
	    anInt4759 += anIntArray4753[arg2] * arg0 >> 1180432012;
	    int i = -12 / ((67 - arg1) / 50);
	    anInt4752++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("he.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2232(int arg0, byte arg1) {
	try {
	    aByteArray4765[anInt4755++]
		= (byte) (127 + (Class90.method841(arg1, 255) >> -895787583));
	    anInt4767++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("he.J(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class152 method2233
	(int arg0, Class130 arg1, int arg2, Class44 arg3, int arg4,
	 boolean arg5, boolean arg6, int arg7, int arg8, Class188 arg9,
	 int arg10, Class130 arg11) {
	try {
	    anInt4762++;
	    Class152 class152 = Class202.method2724(arg1, 1483, arg4, arg0,
						    arg9, arg10, arg8, arg7);
	    if (class152 != null)
		return class152;
	    Class29 class29 = Class131_Sub19.method1808(arg4, false);
	    if (arg10 > 1 && class29.anIntArray360 != null) {
		int i = -1;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
		    if (class29.anIntArray292[i_0_] <= arg10
			&& (class29.anIntArray292[i_0_] ^ 0xffffffff) != -1)
			i = class29.anIntArray360[i_0_];
		}
		if ((i ^ 0xffffffff) != 0)
		    class29 = Class131_Sub19.method1808(i, false);
	    }
	    Class116 class116 = Class134.method2097(class29.anInt293, 0,
						    Class77.aClass158_1047, 1);
	    if (class116 == null)
		return null;
	    if (class29.aShortArray310 != null) {
		for (int i = 0; class29.aShortArray310.length > i; i++) {
		    if (class29.aByteArray359 != null
			&& i < class29.aByteArray359.length)
			class116.method992((Class160.aShortArray2132
					    [class29.aByteArray359[i] & 0xff]),
					   class29.aShortArray310[i], 113);
		    else
			class116.method992(class29.aShortArray324[i],
					   class29.aShortArray310[i], -120);
		}
	    }
	    if (class29.aShortArray319 != null) {
		for (int i = 0; i < class29.aShortArray319.length; i++)
		    class116.method989(arg2 ^ ~0x79, class29.aShortArray319[i],
				       class29.aShortArray338[i]);
	    }
	    if (arg9 != null) {
		for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
		    if (arg9.anIntArray2756[i]
			< Class131_Sub41_Sub5.aShortArrayArray6233[i].length)
			class116.method992((Class131_Sub41_Sub5
					    .aShortArrayArray6233[i]
					    [arg9.anIntArray2756[i]]),
					   Class5.aShortArray89[i], 116);
		    if ((arg9.anIntArray2756[i] ^ 0xffffffff)
			> (Class63.aShortArrayArray800[i].length ^ 0xffffffff))
			class116.method992((Class63.aShortArrayArray800[i]
					    [arg9.anIntArray2756[i]]),
					   Class144.aShortArray1916[i], -93);
		}
	    }
	    int i = 1024;
	    boolean bool = false;
	    if (class29.anInt342 != 128
		|| (class29.anInt335 ^ 0xffffffff) != -129
		|| (class29.anInt364 ^ 0xffffffff) != -129) {
		bool = true;
		i |= 0x7;
	    }
	    Class154 class154
		= arg11.method1218(class116, i, 0, 64 + class29.anInt352,
				   class29.anInt332 + 768);
	    if (!class154.method2286())
		return null;
	    if (bool)
		class154.method2262(class29.anInt342, class29.anInt335,
				    class29.anInt364);
	    Class152 class152_1_ = null;
	    if ((class29.anInt318 ^ 0xffffffff) != 0) {
		class152_1_ = method2233(0, arg1, 0, arg3, class29.anInt294,
					 true, true, 1, 0, arg9, 10, arg11);
		if (class152_1_ == null)
		    return null;
	    } else if (class29.anInt309 != -1) {
		class152_1_
		    = method2233(arg0, arg1, arg2, arg3, class29.anInt361,
				 true, false, arg7, 0, arg9, arg10, arg11);
		if (class152_1_ == null)
		    return null;
	    }
	    int i_2_ = class29.anInt337;
	    arg11.method1193(16, 16, 512, 512);
	    if (arg6)
		i_2_ *= 1.5;
	    else if ((arg7 ^ 0xffffffff) == -3)
		i_2_ = (int) (1.04 * (double) i_2_);
	    Class9 class9 = arg11.method1257();
	    class9.method189();
	    arg11.method1260(class9);
	    arg11.method1161(1.0F);
	    arg11.method1232(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
	    Class9 class9_3_ = arg11.method1238();
	    class9_3_.method175(-class29.anInt356 << 1649798435);
	    class9_3_.method192(class29.anInt303 << -2014643261);
	    class9_3_.method174
		(class29.anInt367,
		 ((Class31.anIntArray434[class29.anInt317 << -41814653] * i_2_
		   >> 964707343)
		  - (class154.method2256() / 2 + -class29.anInt363)),
		 class29.anInt363 + (i_2_ * (Class31.anIntArray425
					     [class29.anInt317 << -1489907069])
				     >> 2104520303));
	    class9_3_.method179(class29.anInt317 << -1193455421);
	    int i_4_ = arg11.method1261();
	    int i_5_ = arg11.method1164();
	    arg11.method1230(50, 2147483647);
	    arg11.method1169();
	    arg11.method1244();
	    arg11.method1173(0, 0, 36, 32, 0, arg2);
	    class154.method2261(class9_3_, null, 1);
	    arg11.method1230(i_4_, i_5_);
	    int[] is = arg11.method1174(0, 0, 36, 32);
	    if (arg7 >= 1) {
		is = Class55.method611(-16777215, is, 36);
		if (arg7 >= 2)
		    is = Class55.method611(-1, is, 36);
	    }
	    if (arg0 != 0)
		Class131_Sub2_Sub7.method1505(is, arg0, -22286);
	    arg11.method1247(is, 0, 36, 36, 32).method2211(0, 0);
	    if (class29.anInt318 != -1)
		class152_1_.method2211(0, 0);
	    else if (class29.anInt309 != -1)
		class152_1_.method2211(0, 0);
	    if ((arg8 ^ 0xffffffff) == -2
		|| ((arg8 ^ 0xffffffff) == -3
		    && (class29.anInt304 == 1 || (arg10 ^ 0xffffffff) != -2)
		    && arg10 != -1))
		arg3.method529(arg2 ^ ~0x201a,
			       Class131_Sub37.method1878(arg10, false), -256,
			       9, 0, -16777215);
	    is = arg11.method1174(0, 0, 36, 32);
	    for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
		if ((is[i_6_] & 0xffffff) == 0)
		    is[i_6_] = 0;
		else
		    is[i_6_] = Cryption.method2105(is[i_6_], -16777216);
	    }
	    Class152 class152_7_;
	    if (!arg5)
		class152_7_ = arg1.method1247(is, 0, 36, 36, 32);
	    else
		class152_7_ = arg11.method1247(is, 0, 36, 36, 32);
	    if (!arg5) {
		Class89 class89 = new Class89();
		class89.anInt3265 = arg7;
		class89.anInt3256 = arg0;
		class89.anInt3250 = arg10;
		class89.anInt3252 = arg4;
		class89.aBoolean3249 = arg9 != null;
		class89.anInt3253 = arg1.anInt1781;
		class89.anInt3264 = arg8;
		Class23_Sub3_Sub1.aClass103_5226.method903(class89, 0,
							   class152_7_);
	    }
	    return class152_7_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("he.M(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public Class153_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 float arg5) {
	super(arg0, arg1, arg2, arg3, arg4);
	try {
	    anIntArray4753 = new int[anInt2035];
	    for (int i = 0; i < anInt2035; i++)
		anIntArray4753[i]
		    = (short) (int) (4096.0
				     * Math.pow((double) arg5, (double) i));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("he.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ')'));
	}
    }
    
    public static void method2234(int arg0) {
	try {
	    aClass158_4756 = null;
	    anIntArray4758 = null;
	    aClass131_Sub41_Sub10Array4764 = null;
	    if (arg0 != 32731)
		method2235(-84, 79, -5, false, -18, -89);
	    aClass120_4757 = null;
	    aClass152Array4761 = null;
	    anIntArray4763 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"he.L(" + arg0 + ')');
	}
    }
    
    public static void method2235(int arg0, int arg1, int arg2, boolean arg3,
				  int arg4, int arg5) {
	try {
	    if (arg1 < 1)
		arg1 = 1;
	    if ((arg0 ^ 0xffffffff) > -2)
		arg0 = 1;
	    anInt4754++;
	    int i = -334 + arg0;
	    if (i >= 0) {
		if ((i ^ 0xffffffff) < -101)
		    i = 100;
	    } else
		i = 0;
	    int i_8_ = (i * (Class63.aShort804
			     + -Class131_Sub41_Sub9.aShort6277) / 100
			+ Class131_Sub41_Sub9.aShort6277);
	    if ((i_8_ ^ 0xffffffff)
		> (Class131_Sub2_Sub17.aShort5814 ^ 0xffffffff))
		i_8_ = Class131_Sub2_Sub17.aShort5814;
	    else if ((Class23_Sub1.aShort3698 ^ 0xffffffff)
		     > (i_8_ ^ 0xffffffff))
		i_8_ = Class23_Sub1.aShort3698;
	    int i_9_ = 512 * (arg0 * i_8_) / (334 * arg1);
	    if ((i_9_ ^ 0xffffffff)
		> (Class131_Sub2_Sub1.aShort5557 ^ 0xffffffff)) {
		i_9_ = Class131_Sub2_Sub1.aShort5557;
		i_8_ = 334 * i_9_ * arg1 / (arg0 * 512);
		if (Class23_Sub1.aShort3698 < i_8_) {
		    i_8_ = Class23_Sub1.aShort3698;
		    int i_10_ = arg0 * i_8_ * 512 / (334 * i_9_);
		    int i_11_ = (-i_10_ + arg1) / 2;
		    if (arg3) {
			Class183_Sub1.aClass130_4960.method1244();
			Class183_Sub1.aClass130_4960.method1201(i_11_, arg0,
								arg4, arg2,
								-16777216,
								-105);
			Class183_Sub1.aClass130_4960.method1201
			    (i_11_, arg0, -i_11_ + (arg1 + arg4), arg2,
			     -16777216, -111);
		    }
		    arg4 += i_11_;
		    arg1 -= 2 * i_11_;
		}
	    } else if ((i_9_ ^ 0xffffffff)
		       < (Class23_Sub4_Sub4.aShort5382 ^ 0xffffffff)) {
		i_9_ = Class23_Sub4_Sub4.aShort5382;
		i_8_ = 334 * arg1 * i_9_ / (512 * arg0);
		if (Class131_Sub2_Sub17.aShort5814 > i_8_) {
		    i_8_ = Class131_Sub2_Sub17.aShort5814;
		    int i_12_ = 334 * i_9_ * arg1 / (i_8_ * 512);
		    int i_13_ = (-i_12_ + arg0) / 2;
		    if (arg3) {
			Class183_Sub1.aClass130_4960.method1244();
			Class183_Sub1.aClass130_4960.method1201(arg1, i_13_,
								arg4, arg2,
								-16777216,
								arg5 + -3622);
			Class183_Sub1.aClass130_4960.method1201(arg1, i_13_,
								arg4,
								(-i_13_ + arg0
								 + arg2),
								-16777216, 33);
		    }
		    arg0 -= 2 * i_13_;
		    arg2 += i_13_;
		}
	    }
	    Class146.anInt1936 = arg0 * i_8_ / 334;
	    Class121.anInt1593 = arg2;
	    Class41.anInt544 = arg4;
	    if (arg5 != 3516)
		anIntArray4763 = null;
	    Class71.anInt947 = (short) arg1;
	    Class131_Sub2_Sub32.anInt6016 = (short) arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("he.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public void method2223(byte arg0) {
	anInt4766++;
	anInt4755 = 0;
	anInt4759 = 0;
	if (arg0 != 122)
	    anIntArray4753 = null;
    }
}
