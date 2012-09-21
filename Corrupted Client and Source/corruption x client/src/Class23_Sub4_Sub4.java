/* Class23_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub4 extends Class23_Sub4
{
    public static short aShort5382 = 32767;
    public int anInt5383 = -1;
    public static int anInt5384;
    public int anInt5385;
    public static int anInt5386;
    public static int anInt5387;
    public Class1_Sub6 aClass1_Sub6_5388;
    public static int anInt5389;
    public static int anInt5390;
    public static int anInt5391;
    public static int anInt5392;
    public static int anInt5393;
    public Class161 aClass161_5394;
    public static int anInt5395;
    public static int anInt5396;
    public static int anInt5397;
    public static int anInt5398;
    public int anInt5399 = 0;
    public static int anInt5400 = 0;
    public static int anInt5401;
    public int anInt5402;
    public static Class214 aClass214_5403 = new Class214(64);
    public static int anInt5404;
    public boolean aBoolean5405 = false;
    public int anInt5406 = -32768;
    public int anInt5407;
    public static int anInt5408;
    public static int anInt5409;
    public static int anInt5410;
    public static int anInt5411;
    
    public void method380(byte arg0) {
	try {
	    anInt5408++;
	    if (aClass1_Sub6_5388 != null)
		aClass1_Sub6_5388.method119();
	    int i = -81 % ((31 - arg0) / 45);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.AB(" + arg0 + ')');
	}
    }
    
    public static void method381(byte arg0, int arg1, int arg2) {
	try {
	    if (arg0 != -103)
		aShort5382 = (short) 58;
	    anInt5396++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(6, arg1, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jl.QA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method382(boolean arg0) {
	anInt5397++;
	synchronized (Class23_Sub3_Sub1.aClass103_5226) {
	    Class23_Sub3_Sub1.aClass103_5226.method899((byte) -86);
	}
	if (arg0 != false)
	    aShort5382 = (short) -111;
    }
    
    public void method295(int arg0) {
	try {
	    if (arg0 == 0) {
		anInt5391++;
		throw new IllegalStateException();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.E(" + arg0 + ')');
	}
    }
    
    public int method323(int arg0) {
	try {
	    anInt5401++;
	    if (arg0 > -7)
		method288(null, true);
	    return anInt5406;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.UA(" + arg0 + ')');
	}
    }
    
    public static void method383(int arg0, Class173 arg1) {
	anInt5387++;
	if (arg0 >= -72)
	    anInt5400 = 125;
	if (arg1.anInt2361 == Class131_Sub1_Sub4.anInt5538)
	    Class131_Sub41_Sub16.aBooleanArray6371[arg1.anInt2321] = true;
    }
    
    public boolean method289(byte arg0) {
	try {
	    anInt5384++;
	    if (arg0 != -115)
		method387(null, null, false);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.D(" + arg0 + ')');
	}
    }
    
    public Class23_Sub4_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7, int arg8, int arg9,
			     int arg10) {
	super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false,
	      (byte) 0);
	anInt5402 = 0;
	anInt5407 = arg2 + arg1;
	anInt5385 = arg0;
	int i = Class151.method2194(anInt5385, -6861).anInt1450;
	if (i == -1)
	    aBoolean5405 = true;
	else {
	    aBoolean5405 = false;
	    aClass161_5394 = Class145.method2159(i, (byte) -108);
	}
	if (arg2 == anInt5407)
	    Login.method1153(anInt3733, 21155, false, anInt5399, anInt3747,
				aClass161_5394);
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt5410++;
	    Class154 class154 = method384(arg0, -32768, 1024);
	    if (class154 == null)
		return null;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    if (aClass1_Sub6_5388 == null)
		class154.method2261(class9, null, 0);
	    else {
		Class105 class105 = aClass1_Sub6_5388.method113();
		arg0.method1204(class154, class105, class9, null, 0);
	    }
	    anInt5406 = class154.method2256();
	    method387(class154, arg0, arg1);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jl.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class154 method384(Class130 arg0, int arg1, int arg2) {
	try {
	    anInt5390++;
	    if (arg1 != -32768)
		aClass214_5403 = null;
	    Class112 class112 = Class151.method2194(anInt5385, arg1 + 25907);
	    if (aBoolean5405)
		return class112.method956(-1, -1, 0, -1, arg2, arg0);
	    return class112.method956(arg1 ^ 0x7fff, anInt5399, anInt5402,
				      anInt5383, arg2, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jl.VA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public static void method385(byte arg0) {
	try {
	    if (arg0 < 116)
		aShort5382 = (short) -123;
	    aClass214_5403 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.TA(" + arg0 + ')');
	}
    }
    
    public void finalize() {
	try {
	    if (aClass1_Sub6_5388 != null)
		aClass1_Sub6_5388.method119();
	    anInt5398++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jl.finalize(" + ')');
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    anInt5392++;
	    if (arg0 >= -116)
		method384(null, 93, -105);
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jl.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public void method386(int arg0, byte arg1) {
	anInt5386++;
	if (arg1 >= 58 && !aBoolean5405) {
	    anInt5402 += arg0;
	    while ((aClass161_5394.anIntArray2153[anInt5399] ^ 0xffffffff)
		   > (anInt5402 ^ 0xffffffff)) {
		anInt5402 -= aClass161_5394.anIntArray2153[anInt5399];
		anInt5399++;
		if ((anInt5399 ^ 0xffffffff)
		    <= (aClass161_5394.anIntArray2139.length ^ 0xffffffff)) {
		    aBoolean5405 = true;
		    break;
		}
	    }
	    if (!aBoolean5405)
		Login.method1153(anInt3733, 21155, false, anInt5399,
				    anInt3747, aClass161_5394);
	}
    }
    
    public void method387(Class154 arg0, Class130 arg1, boolean arg2) {
	do {
	    try {
		anInt5395++;
		Class41[] class41s = arg0.method2254();
		if (arg2 == false) {
		    Class104[] class104s = arg0.method2266();
		    if ((aClass1_Sub6_5388 == null
			 || aClass1_Sub6_5388.aBoolean3563)
			&& (class41s != null || class104s != null))
			aClass1_Sub6_5388
			    = new Class1_Sub6(Class125.anInt1632);
		    if (aClass1_Sub6_5388 == null)
			break;
		    aClass1_Sub6_5388.method120(arg1,
						(long) Class125.anInt1632,
						class41s, class104s, false);
		    aClass1_Sub6_5388.method123(aByte3740, aShort3745,
						aShort3742, aShort3737,
						aShort3735);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("jl.SA("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    if (arg3 <= 12)
		aClass214_5403 = null;
	    anInt5393++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jl.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	anInt5411++;
	Class154 class154 = method384(arg0, -32768, arg1);
	if (class154 != null)
	    method387(class154, arg0, false);
    }
}
