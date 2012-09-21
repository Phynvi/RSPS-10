/* Class23_Sub4_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub5 extends Class23_Sub4 implements Interface6
{
    public short aShort5100;
    public boolean aBoolean5101;
    public boolean aBoolean5102;
    public static int anInt5103;
    public boolean aBoolean5104;
    public static int anInt5105;
    public static int anInt5106;
    public static int anInt5107;
    public static int anInt5108;
    public static int anInt5109;
    public static int anInt5110;
    public static Class158 aClass158_5111;
    public static int anInt5112;
    public Class131_Sub41_Sub13 aClass131_Sub41_Sub13_5113;
    public static int[] anIntArray5114 = new int[8];
    public static int anInt5115;
    public byte aByte5116;
    public static int anInt5117;
    public byte aByte5118;
    public static int anInt5119;
    public Class154 aClass154_5120;
    public byte aByte5121;
    public static int anInt5122;
    public static int anInt5123;
    public boolean aBoolean5124;
    public static int anInt5125;
    public static int anInt5126;
    public static int anInt5127;
    public static int anInt5128;
    public static int anInt5129;
    public static int anInt5130;
    
    public void method295(int arg0) {
	aBoolean5101 = false;
	if (arg0 != 0)
	    method25((byte) -14);
	anInt5110++;
	if (aClass154_5120 != null)
	    aClass154_5120.method2248(~0x8000 & aClass154_5120.method2253());
    }
    
    public void method20(Class130 arg0, boolean arg1) {
	if (arg1 != false)
	    method22(35, null);
	anInt5129++;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5113 != null || !aBoolean5102) {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5113;
	    aClass131_Sub41_Sub13_5113 = null;
	} else {
	    Class14 class14 = method389(32653, arg0, true, 131072);
	    class131_sub41_sub13
		= class14 != null ? class14.aClass131_Sub41_Sub13_148 : null;
	}
	if (class131_sub41_sub13 != null)
	    Class131_Sub41_Sub5.method1956(class131_sub41_sub13, aByte5116,
					   anInt3733, anInt3747, null);
    }
    
    public static void method388(int arg0) {
	try {
	    anIntArray5114 = null;
	    if (arg0 != 0)
		method388(38);
	    aClass158_5111 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.W(" + arg0 + ')');
	}
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    if (arg1 != false)
		aByte5118 = (byte) -11;
	    anInt5123++;
	    if (aClass154_5120 == null)
		return null;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    Class1_Sub2 class1_sub2 = null;
	    if (aBoolean5124)
		class1_sub2 = Class131_Sub41_Sub11.method2003(1, 12300);
	    aClass154_5120.method2261(class9,
				      (class1_sub2 != null
				       ? class1_sub2.aClass1_Sub5Array3500[0]
				       : null),
				      0);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method25(byte arg0) {
	try {
	    if (aClass154_5120 != null)
		aClass154_5120.method2246();
	    if (arg0 == 6)
		anInt5126++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.M(" + arg0 + ')');
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	do {
	    try {
		if (!(arg5 instanceof Class23_Sub1_Sub2)) {
		    if (arg5 instanceof Class23_Sub4_Sub5) {
			Class23_Sub4_Sub5 class23_sub4_sub5
			    = (Class23_Sub4_Sub5) arg5;
			if (aClass154_5120 != null
			    && class23_sub4_sub5.aClass154_5120 != null)
			    aClass154_5120.method2275((class23_sub4_sub5
						       .aClass154_5120),
						      arg3, arg6, arg2, arg4);
		    }
		} else {
		    Class23_Sub1_Sub2 class23_sub1_sub2
			= (Class23_Sub1_Sub2) arg5;
		    if (aClass154_5120 != null
			&& class23_sub1_sub2.aClass154_5132 != null)
			aClass154_5120.method2275((class23_sub1_sub2
						   .aClass154_5132),
						  arg3, arg6, arg2, arg4);
		}
		anInt5130++;
		if (arg0 < -116)
		    break;
		aByte5116 = (byte) 74;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("ql.J(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ',' + arg3
						     + ',' + arg4 + ','
						     + (arg5 != null ? "{...}"
							: "null")
						     + ',' + arg6 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class14 method389(int arg0, Class130 arg1, boolean arg2, int arg3) {
	try {
	    anInt5107++;
	    if (arg0 != 32653)
		return null;
	    Class187 class187 = Class55.method612(0xffff & aShort5100, -31);
	    Class68 class68;
	    Class68 class68_0_;
	    if (aBoolean5104) {
		class68_0_ = Class131_Sub2_Sub37.aClass68Array6057[0];
		class68 = Class85.aClass68Array1116[aByte5116];
	    } else {
		class68 = Class131_Sub2_Sub37.aClass68Array6057[aByte5116];
		if ((aByte5116 ^ 0xffffffff) > -4)
		    class68_0_
			= Class131_Sub2_Sub37.aClass68Array6057[1 + aByte5116];
		else
		    class68_0_ = null;
	    }
	    return class187.method2569(aByte5121 == 11 ? 10 : aByte5121, arg1,
				       class68,
				       (aByte5121 == 11 ? (int) (aByte5118 + 4)
					: aByte5118),
				       anInt3747, anInt3733, anInt3746, arg3,
				       class68_0_, 108, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.R(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public int method24(byte arg0) {
	try {
	    if (arg0 != -68)
		aBoolean5102 = false;
	    anInt5122++;
	    return aByte5118;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.L(" + arg0 + ')');
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    anInt5108++;
	    if (arg0 != -115)
		return true;
	    return aBoolean5101;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.D(" + arg0 + ')');
	}
    }
    
    public static int method390(int arg0, int arg1) {
	try {
	    return arg0 ^ arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.U(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method23(byte arg0) {
	try {
	    if (arg0 > -110)
		method323(113);
	    anInt5117++;
	    return aShort5100 & 0xffff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.S(" + arg0 + ')');
	}
    }
    
    public static void method391(int arg0) {
	try {
	    if (arg0 != -23144)
		method388(113);
	    if ((SignLink.anInt2902 ^ 0xffffffff) != -4)
		Class110_Sub2.anInt3914 = -1;
	    anInt5128++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.V(" + arg0 + ')');
	}
    }
    
    public int method21(int arg0) {
	try {
	    if (arg0 != -22056)
		return -26;
	    anInt5106++;
	    return aByte5121;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.O(" + arg0 + ')');
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	try {
	    if (arg1 == 0)
		anInt5115++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class23_Sub4_Sub5(Class130 arg0, Class187 arg1, int arg2, int arg3,
			     int arg4, int arg5, int arg6, boolean arg7,
			     int arg8, int arg9, int arg10, int arg11,
			     int arg12, int arg13, boolean arg14) {
	super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11,
	      arg1.anInt2703 == 1,
	      Class51.method593(arg12, (byte) -75, arg13));
	do {
	    try {
		aBoolean5101 = arg14;
		aShort5100 = (short) arg1.anInt2713;
		aBoolean5104 = arg7;
		aByte5118 = (byte) arg13;
		aBoolean5124 = arg1.anInt2663 != 0 && !arg7;
		aByte5121 = (byte) arg12;
		aByte5116 = (byte) arg3;
		aBoolean5102
		    = (arg0.method1259() && arg1.aBoolean2735 && !aBoolean5104
		       && (Class131_Sub2_Sub16.anInt5779 ^ 0xffffffff) != -1);
		int i = 1024;
		if (aBoolean5101)
		    i |= 0x8000;
		Class14 class14 = method389(32653, arg0, aBoolean5102, i);
		if (class14 == null)
		    break;
		aClass131_Sub41_Sub13_5113 = class14.aClass131_Sub41_Sub13_148;
		aClass154_5120 = class14.aClass154_149;
		if (!aBoolean5101)
		    break;
		aClass154_5120 = aClass154_5120.method2287((byte) 0, i, false);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("ql.<init>(" + (arg0 != null ? "{...}" : "null")
			    + ',' + (arg1 != null ? "{...}" : "null") + ','
			    + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ','
			    + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ','
			    + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13
			    + ',' + arg14 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class154 method392(Class130 arg0, byte arg1, int arg2) {
	try {
	    if (arg1 != -37)
		aClass154_5120 = null;
	    anInt5103++;
	    if (aClass154_5120 != null
		&& arg0.method1208(aClass154_5120.method2253(), arg2) == 0)
		return aClass154_5120;
	    Class14 class14 = method389(32653, arg0, false, arg2);
	    if (class14 == null)
		return null;
	    return class14.aClass154_149;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.N("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt5127++;
	    Class154 class154 = method392(arg1, (byte) -37, 65536);
	    if (class154 != null) {
		Class9 class9 = arg1.method1238();
		class9.method181(anInt3733, anInt3746, anInt3747);
		return class154.method2278(arg2, arg0, class9, false);
	    }
	    if (arg3 < 12)
		method287(96, null, 82, -68);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public int method323(int arg0) {
	try {
	    anInt5105++;
	    if (arg0 > -7)
		return -10;
	    if (aClass154_5120 == null)
		return 0;
	    return aClass154_5120.method2256();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.UA(" + arg0 + ')');
	}
    }
    
    public void method22(int arg0, Class130 arg1) {
	if (arg0 != 25510)
	    method24((byte) 48);
	anInt5119++;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5113 != null || !aBoolean5102) {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5113;
	    aClass131_Sub41_Sub13_5113 = null;
	} else {
	    Class14 class14 = method389(32653, arg1, true, 131072);
	    class131_sub41_sub13
		= class14 == null ? null : class14.aClass131_Sub41_Sub13_148;
	}
	if (class131_sub41_sub13 != null)
	    Class101.method884(class131_sub41_sub13, aByte5116, anInt3733,
			       anInt3747, null);
    }
    
    public int method393(byte arg0) {
	try {
	    if (arg0 < 89)
		aClass131_Sub41_Sub13_5113 = null;
	    anInt5125++;
	    if (aClass154_5120 != null)
		return aClass154_5120.method2259() / 4;
	    return 15;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.BA(" + arg0 + ')');
	}
    }
    
    public boolean method19(byte arg0) {
	try {
	    if (arg0 <= 102)
		aBoolean5104 = false;
	    anInt5112++;
	    return aBoolean5102;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ql.K(" + arg0 + ')');
	}
    }
    
    public Class154 method18(byte arg0, int arg1, Class130 arg2) {
	try {
	    int i = -35 / ((-32 - arg0) / 61);
	    anInt5109++;
	    return method392(arg2, (byte) -37, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ql.T(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
