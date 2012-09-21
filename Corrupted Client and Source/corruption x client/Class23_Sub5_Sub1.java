/* Class23_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub5_Sub1 extends Class23_Sub5 implements Interface6
{
    public static int anInt5021;
    public static int anInt5022;
    public static int anInt5023;
    public static int anInt5024;
    public static int anInt5025;
    public static int anInt5026;
    public static int anInt5027;
    public static int anInt5028;
    public static int anInt5029;
    public static int anInt5030;
    public static int anInt5031;
    public static int anInt5032;
    public static Class137 aClass137_5033 = new Class137(64);
    public static int anInt5034;
    public static int anInt5035;
    public static int anInt5036;
    public boolean aBoolean5037;
    public static char aChar5038;
    public Class190 aClass190_5039;
    public static int anInt5040;
    public static Class180 aClass180_5041 = new Class180(32);
    public static long aLong5042;
    public static int[][] anIntArrayArray5043
	= { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 },
	    { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 },
	    { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 },
	    { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 },
	    { 1, 6, 7, 1 } };
    public static String aString5044;
    
    public void method20(Class130 arg0, boolean arg1) {
	aClass190_5039.method2611(arg0, 4);
	anInt5021++;
	if (arg1 != false)
	    aString5044 = null;
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt5029++;
	    Class154 class154
		= aClass190_5039.method2608(1024, arg0, anInt3753, anInt3751,
					    true, false, -62);
	    if (class154 == null)
		return null;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3753, anInt3755, anInt3751);
	    Class1_Sub2 class1_sub2 = null;
	    if (aBoolean5037)
		class1_sub2 = Class131_Sub41_Sub11.method2003(1, 12300);
	    if (aClass190_5039.aClass1_Sub6_2816 != null) {
		Class105 class105
		    = aClass190_5039.aClass1_Sub6_2816.method113();
		arg0.method1204(class154, class105, class9,
				(class1_sub2 == null ? null
				 : class1_sub2.aClass1_Sub5Array3500[0]),
				0);
	    } else
		class154.method2261(class9,
				    (class1_sub2 == null ? null
				     : class1_sub2.aClass1_Sub5Array3500[0]),
				    0);
	    aClass190_5039.method2607(anInt3753 >> 2090840647, true,
				      anInt3751 >> 1613368839, class154, arg0,
				      anInt3751 >> 2085284711, arg1,
				      anInt3753 >> 1764531431);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method19(byte arg0) {
	try {
	    anInt5035++;
	    if (arg0 <= 102)
		return true;
	    return aClass190_5039.method2612(-1724944720);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.K(" + arg0 + ')');
	}
    }
    
    public void method295(int arg0) {
	try {
	    if (arg0 == 0) {
		anInt5026++;
		throw new IllegalStateException();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.E(" + arg0 + ')');
	}
    }
    
    public int method23(byte arg0) {
	try {
	    anInt5023++;
	    if (arg0 >= -110)
		method20(null, false);
	    return aClass190_5039.anInt2803;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.S(" + arg0 + ')');
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    if (arg0 != -115)
		return true;
	    anInt5030++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.D(" + arg0 + ')');
	}
    }
    
    public void method25(byte arg0) {
	try {
	    if (arg0 != 6)
		method19((byte) -41);
	    anInt5024++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.M(" + arg0 + ')');
	}
    }
    
    public static void method396(int arg0) {
	try {
	    aClass180_5041 = null;
	    if (arg0 != 1)
		method398(52, null, (byte) -39, 115);
	    aClass137_5033 = null;
	    anIntArrayArray5043 = null;
	    aString5044 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.N(" + arg0 + ')');
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    if (arg0 < -116) {
		anInt5028++;
		throw new IllegalStateException();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public static boolean method397(int arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5) {
	if (arg1 == arg2 && arg3 == arg4) {
	    if (!Class131_Sub4.method1652(arg0, arg1, arg3))
		return false;
	    int i = arg1 << 7;
	    int i_0_ = arg3 << 7;
	    if (Class131_Sub2_Sub27.method1605(i + 1,
					       (Class75.aClass68Array1023
						    [arg0]
						    .method712(arg1, arg3)
						+ arg5),
					       i_0_ + 1)
		&& (Class131_Sub2_Sub27.method1605
		    (i + 128 - 1,
		     (Class75.aClass68Array1023[arg0].method712(arg1 + 1, arg3)
		      + arg5),
		     i_0_ + 1))
		&& (Class131_Sub2_Sub27.method1605
		    (i + 128 - 1,
		     (Class75.aClass68Array1023[arg0].method712(arg1 + 1,
								arg3 + 1)
		      + arg5),
		     i_0_ + 128 - 1))
		&& (Class131_Sub2_Sub27.method1605
		    (i + 1,
		     (Class75.aClass68Array1023[arg0].method712(arg1, arg3 + 1)
		      + arg5),
		     i_0_ + 128 - 1)))
		return true;
	    return false;
	}
	for (int i = arg1; i <= arg2; i++) {
	    for (int i_1_ = arg3; i_1_ <= arg4; i_1_++) {
		if (Class163.anIntArrayArrayArray2186[arg0][i][i_1_]
		    == -Class131_Sub41_Sub20.anInt6431)
		    return false;
	    }
	}
	int i = (arg1 << 7) + 1;
	int i_2_ = (arg3 << 7) + 2;
	int i_3_
	    = Class75.aClass68Array1023[arg0].method712(arg1, arg3) + arg5;
	if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_2_))
	    return false;
	int i_4_ = (arg2 << 7) - 1;
	if (!Class131_Sub2_Sub27.method1605(i_4_, i_3_, i_2_))
	    return false;
	int i_5_ = (arg4 << 7) - 1;
	if (!Class131_Sub2_Sub27.method1605(i, i_3_, i_5_))
	    return false;
	if (!Class131_Sub2_Sub27.method1605(i_4_, i_3_, i_5_))
	    return false;
	return true;
    }
    
    public void method22(int arg0, Class130 arg1) {
	try {
	    aClass190_5039.method2618(arg1, (byte) -5);
	    if (arg0 != 25510)
		aLong5042 = -67L;
	    anInt5031++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.P(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class154 method18(byte arg0, int arg1, Class130 arg2) {
	try {
	    anInt5040++;
	    int i = 56 % ((arg0 - -32) / 61);
	    return aClass190_5039.method2608(arg1, arg2, 0, 0, false, false,
					     -95);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.T(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	if (arg1 != 0)
	    method18((byte) 42, -27, null);
	anInt5022++;
	Class154 class154
	    = aClass190_5039.method2608(131072, arg0, anInt3753, anInt3751,
					true, true, 83);
	if (class154 != null)
	    aClass190_5039.method2607(anInt3753 >> -893601689, false,
				      anInt3751 >> -528425593, class154, arg0,
				      anInt3751 >> -2052013593, false,
				      anInt3753 >> 1022683207);
    }
    
    public static long method398(int arg0, Interface6 arg1, byte arg2,
				 int arg3) {
	try {
	    anInt5036++;
	    long l = 4194304L;
	    long l_6_ = 2147483648L;
	    if (arg2 != -108)
		anIntArrayArray5043 = null;
	    long l_7_ = -9223372036854775808L;
	    Class187 class187
		= Class55.method612(arg1.method23((byte) -111), 115);
	    long l_8_ = (long) (arg1.method21(-22056) << 819163246
				| (arg0 | arg3 << -844507641)
				| arg1.method24((byte) -68) << 854789012
				| 0x40000000);
	    if ((class187.anInt2663 ^ 0xffffffff) == -1)
		l_8_ |= l_7_;
	    if (class187.anInt2703 == 1)
		l_8_ |= l;
	    if (class187.aBoolean2680)
		l_8_ |= l_6_;
	    l_8_ |= (long) arg1.method23((byte) -112) << -180832928;
	    return l_8_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.U(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt5034++;
	    if (arg3 <= 12)
		method20(null, true);
	    Class154 class154
		= aClass190_5039.method2608(65536, arg1, anInt3753, anInt3751,
					    false, false, -42);
	    if (class154 == null)
		return false;
	    Class9 class9 = arg1.method1238();
	    class9.method181(anInt3753, anInt3755, anInt3751);
	    return class154.method2278(arg2, arg0, class9, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jj.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class23_Sub5_Sub1(Class130 arg0, Class187 arg1, int arg2, int arg3,
			     int arg4, int arg5, int arg6, int arg7,
			     boolean arg8, int arg9) {
	super(arg5, arg6, arg7, arg1.aBoolean2678, arg1.aBoolean2680);
	try {
	    aClass190_5039 = new Class190(arg0, arg1, 22, arg2, arg3, arg4,
					  arg5, arg7, arg8, arg9);
	    aBoolean5037 = arg1.anInt2663 != 0 && !arg8;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("jj.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ')'));
	}
    }
    
    public int method21(int arg0) {
	try {
	    if (arg0 != -22056)
		anIntArrayArray5043 = null;
	    anInt5027++;
	    return aClass190_5039.anInt2804;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.O(" + arg0 + ')');
	}
    }
    
    public int method24(byte arg0) {
	try {
	    if (arg0 != -68)
		return -126;
	    anInt5025++;
	    return aClass190_5039.anInt2806;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jj.L(" + arg0 + ')');
	}
    }
    
    static {
	aLong5042 = 0L;
	aString5044 = "scroll:";
    }
}
