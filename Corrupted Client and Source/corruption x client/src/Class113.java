/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113
{
    public static Class161[] aClass161Array1458;
    public Class131_Sub41_Sub8 aClass131_Sub41_Sub8_1459;
    public int[] anIntArray1460;
    public static byte[] aByteArray1461 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    public static int[] anIntArray1462;
    public static int anInt1463;
    public int anInt1464;
    
    public static void method960(Object[] arg0, int arg1, long[] arg2) {
	try {
	    anInt1463++;
	    Class131_Sub30.method1857(arg0, arg2, -1 + arg2.length, (byte) 117,
				      arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lm.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method961(byte arg0) {
	try {
	    aClass161Array1458 = null;
	    if (arg0 != 9)
		aByteArray1461 = null;
	    anIntArray1462 = null;
	    aByteArray1461 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lm.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass161Array1458 = new Class161[14];
    }
}
