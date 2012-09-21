/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class176
{
    public static int anInt2513;
    public static String aString2514 = "green:";
    public Class22_Sub1[] aClass22_Sub1Array2515;
    public Class88 aClass88_2516;
    public static int anInt2517;
    public Class131_Sub41_Sub21_Sub1 aClass131_Sub41_Sub21_Sub1_2518;
    public Class179 aClass179_2519;
    public Stream aStream_2520;
    public static int anInt2521;
    public static int anInt2522;
    public static int anInt2523 = 0;
    public static int anInt2524;

    public Class22_Sub1 method2486(Class85 arg0, boolean arg1, int arg2,
				   Class85 arg3, int arg4) {
	try {
	    anInt2522++;
	    if (aStream_2520 == null)
		throw new RuntimeException();
	    aStream_2520.offset = arg2 * 8 + 5;
	    if ((aStream_2520.offset ^ 0xffffffff)
		<= (aStream_2520.data.length ^ 0xffffffff))
		throw new RuntimeException();
	    if (aClass22_Sub1Array2515[arg2] != null)
		return aClass22_Sub1Array2515[arg2];
	    int i = aStream_2520.readUnsignedInt(arg4 + 32066);
	    if (arg4 != -32068)
		return null;
	    int i_0_ = aStream_2520.readUnsignedInt(-2);
	    Class22_Sub1 class22_sub1
		= new Class22_Sub1(arg2, arg0, arg3, aClass179_2519,
				   aClass88_2516, i, i_0_, arg1);
	    aClass22_Sub1Array2515[arg2] = class22_sub1;
	    return class22_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rs.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2487(byte arg0) {
	try {
	    if (arg0 != 0)
		aString2514 = null;
	    aString2514 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rs.D(" + arg0 + ')');
	}
    }
    
    public void method2488(int arg0) {
	anInt2524++;
	if (aClass22_Sub1Array2515 != null) {
	    for (int i = 0; aClass22_Sub1Array2515.length > i; i++) {
		if (aClass22_Sub1Array2515[i] != null)
		    aClass22_Sub1Array2515[i].method277((byte) 2);
	    }
	    for (int i = 0; aClass22_Sub1Array2515.length > i; i++) {
		if (aClass22_Sub1Array2515[i] != null)
		    aClass22_Sub1Array2515[i].method269(false);
	    }
	    if (arg0 < 65)
		aString2514 = null;
	}
    }
    
    public Class22_Sub1 method2489(byte arg0, int arg1, Class85 arg2,
				   Class85 arg3) {
	try {
	    anInt2517++;
	    if (arg0 <= 43)
		return null;
	    return method2486(arg3, true, arg1, arg2, -32068);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rs.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class176(Class179 arg0, Class88 arg1) {
	do {
	    try {
		aClass179_2519 = arg0;
		aClass88_2516 = arg1;
		if (aClass179_2519.method2505(-27332))
		    break;
		aClass131_Sub41_Sub21_Sub1_2518
		    = aClass179_2519.method2504(255, true, (byte) 0, 255, 20);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("rs.<init>("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public boolean method2490(byte arg0) {
	try {
	    if (arg0 != -90)
		method2486(null, true, -2, null, 108);
	    anInt2521++;
	    if (aStream_2520 != null)
		return true;
	    if (aClass131_Sub41_Sub21_Sub1_2518 == null) {
		if (aClass179_2519.method2505(-27332))
		    return false;
		aClass131_Sub41_Sub21_Sub1_2518
		    = aClass179_2519.method2504(255, true, (byte) 0, 255, 20);
	    }
	    if (aClass131_Sub41_Sub21_Sub1_2518.aBoolean6440)
		return false;
	    aStream_2520
		= new Stream(aClass131_Sub41_Sub21_Sub1_2518
					 .method2073(6));
	    aClass22_Sub1Array2515
		= (new Class22_Sub1
		   [(-5 + aStream_2520.data.length) / 8]);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rs.E(" + arg0 + ')');
	}
    }
}
