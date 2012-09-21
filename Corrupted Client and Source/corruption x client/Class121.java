/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121
{
    public static int anInt1584;
    public static String aString1585;
    public static int anInt1586;
    public static int anInt1587;
    public static boolean aBoolean1588 = true;
    public static int anInt1589;
    public static byte[][][] aByteArrayArrayArray1590;
    public static int anInt1591;
    public static int anInt1592;
    public static int anInt1593;
    
    public static void method1037(int arg0, Class131_Sub41 arg1,
				  Class131_Sub41 arg2) {
	try {
	    if (arg2.aClass131_Sub41_4677 != null)
		arg2.method1919(-29183);
	    if (arg0 >= 53) {
		anInt1591++;
		arg2.aClass131_Sub41_4668 = arg1.aClass131_Sub41_4668;
		arg2.aClass131_Sub41_4677 = arg1;
		arg2.aClass131_Sub41_4677.aClass131_Sub41_4668 = arg2;
		arg2.aClass131_Sub41_4668.aClass131_Sub41_4677 = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ml.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method1038(byte arg0, Class130 arg1, Class189 arg2) {
	try {
	    anInt1586++;
	    if (arg2.anInt2776 != -1)
		return arg2.anInt2776;
	    if (arg2.anInt2760 != -1) {
		Class42 class42
		    = (Class131_Sub2_Sub8.anInterface4_5660.method10
		       (arg0 ^ ~0x4df0,
			!arg1.method1223() ? arg2.anInt2765 : arg2.anInt2760));
		if (!class42.aBoolean556)
		    return class42.aShort578;
	    }
	    if (arg0 != 50)
		method1041(38);
	    return arg2.anInt2766;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ml.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1039(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4) {
	try {
	    Class149.anInt1988 = arg3;
	    Class116.anInt1494 = arg2;
	    if (arg4 != false)
		aString1585 = null;
	    Class115.anInt1477 = arg0;
	    Class125.anInt1629 = arg1;
	    anInt1589++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ml.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1040(byte arg0, int arg1) {
	try {
	    anInt1584++;
	    if (Class126.method1108((byte) -92, arg1) && arg0 < -65) {
		Class173[] class173s
		    = Class131_Sub2_Sub9.aClass173ArrayArray5684[arg1];
		for (int i = 0; i < class173s.length; i++) {
		    Class173 class173 = class173s[i];
		    if (class173 != null) {
			class173.anInt2338 = 0;
			class173.anInt2484 = 0;
			class173.anInt2481 = 1;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ml.L(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1041(int arg0) {
	try {
	    if (arg0 == 21521) {
		aString1585 = null;
		aByteArrayArrayArray1590 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ml.M(" + arg0 + ')');
	}
    }
    
    static {
	aString1585 = "Allocated memory";
	anInt1593 = 0;
    }
}
