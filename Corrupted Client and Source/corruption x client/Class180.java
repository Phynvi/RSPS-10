/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180
{
    public static int anInt2572;
    public static int anInt2573 = 0;
    public Class131[] aClass131Array2574;
    public static int anInt2575;
    public Class131 aClass131_2576;
    public static int anInt2577;
    public static int anInt2578;
    public static Class23_Sub4[] aClass23_Sub4Array2579;
    public static int anInt2580;
    public static int anInt2581;
    public static int anInt2582;
    public static int anInt2583;
    public long aLong2584;
    public static int anInt2585;
    public int anInt2586;
    public static int anInt2587;
    public Class131 aClass131_2588;
    public int anInt2589 = 0;
    public static int anInt2590;
    public static String aString2591 = "Attack";
    public static int anInt2592;
    
    public Class131 method2516(int arg0) {
	try {
	    anInt2580++;
	    if (aClass131_2576 == null)
		return null;
	    for (Class131 class131
		     = aClass131Array2574[(int) ((long) (arg0 + anInt2586)
						 & aLong2584)];
		 aClass131_2576 != class131;
		 aClass131_2576 = aClass131_2576.aClass131_1783) {
		if ((aClass131_2576.aLong1791 ^ 0xffffffffffffffffL)
		    == (aLong2584 ^ 0xffffffffffffffffL)) {
		    Class131 class131_0_ = aClass131_2576;
		    aClass131_2576 = aClass131_2576.aClass131_1783;
		    return class131_0_;
		}
	    }
	    aClass131_2576 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.H(" + arg0 + ')');
	}
    }
    
    public static int method2517(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg0 != -15543)
		anInt2573 = 75;
	    anInt2587++;
	    if ((arg3 ^ 0xffffffff) > (arg2 ^ 0xffffffff))
		return arg2;
	    if ((arg1 ^ 0xffffffff) <= (arg3 ^ 0xffffffff))
		return arg3;
	    return arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sf.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class131 method2518(int arg0) {
	try {
	    anInt2578++;
	    if (anInt2589 > arg0
		&& aClass131_2588 != aClass131Array2574[anInt2589 + -1]) {
		Class131 class131 = aClass131_2588;
		aClass131_2588 = class131.aClass131_1783;
		return class131;
	    }
	    while (anInt2586 > anInt2589) {
		Class131 class131
		    = aClass131Array2574[anInt2589++].aClass131_1783;
		if (class131 != aClass131Array2574[-1 + anInt2589]) {
		    aClass131_2588 = class131.aClass131_1783;
		    return class131;
		}
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.A(" + arg0 + ')');
	}
    }
    
    public void method2519(int arg0) {
	try {
	    int i = 0;
	    int i_1_ = -27 % ((46 - arg0) / 43);
	    for (/**/; anInt2586 > i; i++) {
		Class131 class131 = aClass131Array2574[i];
		for (;;) {
		    Class131 class131_2_ = class131.aClass131_1783;
		    if (class131_2_ == class131)
			break;
		    class131_2_.method1355((byte) 124);
		}
	    }
	    anInt2572++;
	    aClass131_2576 = null;
	    aClass131_2588 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.C(" + arg0 + ')');
	}
    }
    
    public Class131 method2520(int arg0) {
	try {
	    anInt2582++;
	    anInt2589 = arg0;
	    return method2518(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.G(" + arg0 + ')');
	}
    }
    
    public Class131 method2521(int arg0, long arg1) {
	try {
	    anInt2585++;
	    aLong2584 = arg1;
	    Class131 class131
		= aClass131Array2574[(int) (arg1 & (long) (-1 + anInt2586))];
	    aClass131_2576 = class131.aClass131_1783;
	    int i = 87 / (arg0 / 42);
	    for (/**/; class131 != aClass131_2576;
		 aClass131_2576 = aClass131_2576.aClass131_1783) {
		if (arg1 == aClass131_2576.aLong1791) {
		    Class131 class131_3_ = aClass131_2576;
		    aClass131_2576 = aClass131_2576.aClass131_1783;
		    return class131_3_;
		}
	    }
	    aClass131_2576 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sf.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2522(int arg0) {
	try {
	    if (arg0 != 17167)
		return -14;
	    anInt2577++;
	    int i = 0;
	    for (int i_4_ = 0; anInt2586 > i_4_; i_4_++) {
		Class131 class131 = aClass131Array2574[i_4_];
		for (Class131 class131_5_ = class131.aClass131_1783;
		     class131 != class131_5_;
		     class131_5_ = class131_5_.aClass131_1783)
		    i++;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.K(" + arg0 + ')');
	}
    }
    
    public void method2523(boolean arg0, long arg1, Class131 arg2) {
	do {
	    try {
		anInt2590++;
		if (arg2.aClass131_1786 != null)
		    arg2.method1355((byte) 117);
		Class131 class131 = (aClass131Array2574
				     [(int) ((long) (-1 + anInt2586) & arg1)]);
		arg2.aClass131_1783 = class131;
		arg2.aClass131_1786 = class131.aClass131_1786;
		arg2.aClass131_1786.aClass131_1783 = arg2;
		arg2.aLong1791 = arg1;
		arg2.aClass131_1783.aClass131_1786 = arg2;
		if (arg0 == false)
		    break;
		method2520(-94);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("sf.L(" + arg0 + ','
						     + arg1 + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method2524(int arg0, int arg1, int arg2, int arg3) {
	if (Class218.anIntArrayArray3197 != null)
	    Class218.anIntArrayArray3197[arg0][arg1]
		= (arg3 & 0x7f8) << 21 | arg2 & 0xffffff;
    }
    
    public int method2525(int arg0) {
	try {
	    anInt2583++;
	    int i = -26 / ((27 - arg0) / 45);
	    return anInt2586;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.I(" + arg0 + ')');
	}
    }
    
    public static int method2526(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if ((arg1 ^ 0xffffffff) < -244)
		arg0 >>= 4;
	    else if ((arg1 ^ 0xffffffff) >= -218) {
		if (arg1 > 192)
		    arg0 >>= 2;
		else if ((arg1 ^ 0xffffffff) < -180)
		    arg0 >>= 1;
	    } else
		arg0 >>= 3;
	    if (arg3 != 13552)
		method2529((byte) -27);
	    anInt2581++;
	    return (((0xff & arg2) >> -187566334 << 1760042506)
		    + ((arg0 >> 1199928837 << -98741401)
		       - -(arg1 >> 2052538817)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sf.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class180(int arg0) {
	try {
	    aClass131Array2574 = new Class131[arg0];
	    anInt2586 = arg0;
	    for (int i = 0; i < arg0; i++) {
		Class131 class131 = aClass131Array2574[i] = new Class131();
		class131.aClass131_1786 = class131;
		class131.aClass131_1783 = class131;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.<init>(" + arg0 + ')');
	}
    }
    
    public static void method2527(Class158 arg0, int arg1) {
	try {
	    Class155.anInt2067 = 0;
	    Class131_Sub20.anInt4421 = arg1;
	    anInt2592++;
	    Class42.aClass50_574 = new Class50();
	    Class189.aClass1_Sub7_Sub1_Sub1Array2763
		= new Class1_Sub7_Sub1_Sub1[1024];
	    Class127_Sub1.method1133(arg0, 16383);
	    Class110.method937(46, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sf.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method2528(Class131[] arg0, int arg1) {
	try {
	    anInt2575++;
	    int i = arg1;
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (anInt2586 ^ 0xffffffff);
		 i_6_++) {
		Class131 class131 = aClass131Array2574[i_6_];
		for (Class131 class131_7_ = class131.aClass131_1783;
		     class131 != class131_7_;
		     class131_7_ = class131_7_.aClass131_1783)
		    arg0[i++] = class131_7_;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sf.J("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method2529(byte arg0) {
	try {
	    aClass23_Sub4Array2579 = null;
	    if (arg0 == 87)
		aString2591 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sf.N(" + arg0 + ')');
	}
    }
}
