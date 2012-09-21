/* Class131_Sub41_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub16 extends Class131_Sub41
{
    public static int anInt6370;
    public static boolean[] aBooleanArray6371 = new boolean[100];
    public static int anInt6372;
    public static int anInt6373;
    public int anInt6374;
    public static int anInt6375;
    public static int anInt6376;
    public String aString6377;
    public char aChar6378;
    public static int anInt6379;
    public static int anInt6380;
    public static int anInt6381;
    public static int anInt6382;
    
    public boolean method2036(byte arg0) {
	try {
	    if (arg0 != -40)
		return true;
	    anInt6381++;
	    if ((aChar6378 ^ 0xffffffff) != -116)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pd.E(" + arg0 + ')');
	}
    }
    
    public static Class55 method2037(Class158 arg0, byte arg1, int arg2,
				     int arg3) {
	try {
	    anInt6379++;
	    byte[] is = arg0.method2364(arg2, arg3, 0);
	    if (is == null)
		return null;
	    if (arg1 != -35)
		method2042(12, 63, 23);
	    return new Class55(is);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pd.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public void method2038(int arg0, Stream arg1, boolean arg2) {
	anInt6372++;
	if (arg0 != 1) {
	    if (arg0 == 2)
		anInt6374 = arg1.readUnsignedInt(-2);
	    else if ((arg0 ^ 0xffffffff) == -6)
		aString6377 = arg1.readString(false);
	} else
	    aChar6378 = Class214.method2782(60, arg1.readSignedByte((byte) 127));
	if (arg2 != false)
	    aString6377 = null;
    }
    
    public void method2039(Stream arg0, byte arg1) {
	try {
	    for (;;) {
		int i = arg0.readUnsignedByte(-72);
		if (i == 0)
		    break;
		method2038(i, arg0, false);
	    }
	    if (arg1 < 109)
		method2042(-87, -2, -108);
	    anInt6376++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pd.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method2040(byte arg0) {
	try {
	    if (arg0 <= -33)
		aBooleanArray6371 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pd.D(" + arg0 + ')');
	}
    }
    
    public static void method2041(int arg0, byte arg1, Class173 arg2,
				  int arg3) {
	try {
	    anInt6373++;
	    Class183 class183
		= arg2.method2455(0, Class183_Sub1.aClass130_4960);
	    if (class183 != null && arg1 == -55) {
		Class183_Sub1.aClass130_4960.method1188(arg3, arg0,
							arg3 - -arg2.anInt2411,
							arg0 + arg2.anInt2437);
		if ((Class131_Sub31.anInt4524 ^ 0xffffffff) <= -4)
		    Class183_Sub1.aClass130_4960
			.method1192(-16777216, class183, arg3, arg0);
		else
		    Class146.aClass152_1939.method2212
			((float) arg3 + (float) arg2.anInt2411 / 2.0F,
			 (float) arg2.anInt2437 / 2.0F + (float) arg0, 4096,
			 ((int) -Class120.aFloat1578 & 0x3fff) << 1996957666,
			 class183, arg3, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pd.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static int method2042(int arg0, int arg1, int arg2) {
	try {
	    anInt6382++;
	    int i = arg2;
	    for (/**/; arg0 > 0; arg0--) {
		i = 0x1 & arg1 | i << 454696257;
		arg1 >>>= 1;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pd.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
