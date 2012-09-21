/* Class131_Sub41_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub2 extends Class131_Sub41
{
    public static int anInt6179;
    public static long aLong6180 = -1L;
    public static int anInt6181;
    public static int[] anIntArray6182;
    public static int anInt6183;
    public static int anInt6184;
    public static int anInt6185;
    public static int anInt6186;
    public Class23_Sub4_Sub2 aClass23_Sub4_Sub2_6187;
    public static int anInt6188;
    public static int anInt6189;
    public static String aString6190;
    public static String aString6191 = null;
    
    public static void method1929(byte arg0) {
	try {
	    for (int i = 0;
		 (Class159.anInt2118 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		Class57 class57 = Class28.method412((byte) -87, i);
		if (class57 != null && (class57.anInt748 ^ 0xffffffff) == -1) {
		    Class79.anIntArray1062[i] = 0;
		    Class131_Sub2_Sub13.anIntArray5735[i] = 0;
		}
	    }
	    int i = 109 / ((arg0 - -62) / 47);
	    anInt6189++;
	    Class50.aClass180_665 = new Class180(128);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dh.A(" + arg0 + ')');
	}
    }
    
    public static void method1930(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4) {
	try {
	    anInt6181++;
	    if (arg4 != false)
		method1933(-68, (byte) -54);
	    if (arg0 >= arg2) {
		for (int i = arg2; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++)
		    Class56.anIntArrayArray740[i][arg1] = arg3;
	    } else {
		for (int i = arg0; (i ^ 0xffffffff) > (arg2 ^ 0xffffffff); i++)
		    Class56.anIntArrayArray740[i][arg1] = arg3;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dh.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1931(byte arg0) {
	try {
	    aString6191 = null;
	    aString6190 = null;
	    int i = -8 % ((arg0 - -19) / 47);
	    anIntArray6182 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dh.C(" + arg0 + ')');
	}
    }
    
    public static Class131_Sub13 method1932(int arg0, int arg1) {
	try {
	    anInt6185++;
	    if (arg1 != 0)
		method1931((byte) 124);
	    return ((Class131_Sub13)
		    Class23_Sub5_Sub1.aClass180_5041.method2521(81,
								(long) arg0));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dh.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub41_Sub2(Class23_Sub4_Sub2 arg0) {
	try {
	    aClass23_Sub4_Sub2_6187 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dh.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1933(int arg0, byte arg1) {
	try {
	    anInt6179++;
	    synchronized (OutputStream_Sub1.aClass214_66) {
		OutputStream_Sub1.aClass214_66.method2786(arg1 ^ 0x67, arg0);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		if (arg1 != 103) {
		    /* empty */
		} else
		    Class131_Sub2_Sub30.aClass214_5991.method2786(arg1 + -103,
								  arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dh.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class method1934(boolean arg0, String arg1)
	throws ClassNotFoundException {
	try {
	    anInt6184++;
	    if (arg1.equals("B"))
		return Byte.TYPE;
	    if (arg1.equals("I"))
		return Integer.TYPE;
	    if (arg1.equals("S"))
		return Short.TYPE;
	    if (arg1.equals("J"))
		return Long.TYPE;
	    if (arg1.equals("Z"))
		return Boolean.TYPE;
	    if (arg1.equals("F"))
		return Float.TYPE;
	    if (arg1.equals("D"))
		return Double.TYPE;
	    if (arg0 != false)
		return null;
	    if (arg1.equals("C"))
		return Character.TYPE;
	    return Class.forName(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dh.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aString6190 = "Connected to update server";
	anInt6183 = -1;
	anInt6186 = 0;
    }
}
