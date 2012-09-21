/* Class131_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub6 extends Class131
{
    public static int anInt4142;
    public static boolean aBoolean4143;
    public static int anInt4144;
    public int anInt4145;
    public static byte[] aByteArray4146;
    public static int anInt4147;
    public int anInt4148;
    public static int anInt4149;
    public int anInt4150;
    public int anInt4151;
    public static int anInt4152;
    public int anInt4153;
    public static int anInt4154;
    public static int anInt4155;
    public static boolean aBoolean4156;
    public static String aString4157 = "Loaded world list data";
    public int anInt4158;
    public int anInt4159;
    public static Class82 aClass82_4160;
    public static int anInt4161;
    public int anInt4162;
    public static int anInt4163;
    public int anInt4164;
    
    public boolean method1656(boolean arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt4149++;
	    if (arg0 != false)
		method1662((byte) 32, -67, 91, null);
	    if ((arg2 ^ 0xffffffff) != (anInt4148 ^ 0xffffffff)
		|| arg1 < anInt4164
		|| (anInt4150 ^ 0xffffffff) > (arg1 ^ 0xffffffff)
		|| anInt4145 > arg3
		|| (anInt4151 ^ 0xffffffff) > (arg3 ^ 0xffffffff))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method1657(int arg0, int arg1, int arg2) {
	try {
	    anInt4142++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(arg1, arg2, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method1658(int arg0, int arg1, int arg2) {
	try {
	    anInt4152++;
	    if (arg2 >= -64)
		method1663(79, -58);
	    if (anInt4153 <= arg0
		&& (arg0 ^ 0xffffffff) >= (anInt4162 ^ 0xffffffff)
		&& anInt4159 <= arg1
		&& (arg1 ^ 0xffffffff) >= (anInt4158 ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method1659(byte arg0, int arg1, int arg2) {
	try {
	    anInt4163++;
	    int i = 119 % (arg0 / 34);
	    if (arg1 >= anInt4164
		&& (anInt4150 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
		&& (anInt4145 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) >= (anInt4151 ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1660(int[] arg0, int arg1, byte arg2, int arg3) {
	try {
	    anInt4154++;
	    arg0[2] = anInt4145 - (anInt4159 - arg1);
	    if (arg2 != -110)
		method1660(null, -89, (byte) -111, 1);
	    arg0[1] = arg3 + (anInt4164 - anInt4153);
	    arg0[0] = anInt4148;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method1661(int arg0) {
	try {
	    aByteArray4146 = null;
	    if (arg0 <= 119)
		aBoolean4143 = false;
	    aString4157 = null;
	    aClass82_4160 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"el.A(" + arg0 + ')');
	}
    }
    
    public void method1662(byte arg0, int arg1, int arg2, int[] arg3) {
	try {
	    anInt4144++;
	    arg3[1] = arg1 + (anInt4153 - anInt4164);
	    arg3[0] = 0;
	    if (arg0 > -52)
		method1662((byte) 19, -14, -74, null);
	    arg3[2] = arg2 + anInt4159 - anInt4145;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1663(int arg0, int arg1) {
	try {
	    synchronized (Class131_Sub41_Sub11.aClass214_6299) {
		Class131_Sub41_Sub11.aClass214_6299.method2786(0, arg1);
		if (arg0 <= 52)
		    method1663(-89, 45);
	    }
	    anInt4147++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1664(byte arg0, Class158 arg1) {
	anInt4155++;
	Class131_Sub2_Sub1.aClass158_5553 = arg1;
	if (arg0 != 8)
	    method1664((byte) -66, null);
    }
    
    public Class131_Sub6(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8) {
	try {
	    anInt4159 = arg6;
	    anInt4162 = arg7;
	    anInt4158 = arg8;
	    anInt4148 = arg0;
	    anInt4153 = arg5;
	    anInt4151 = arg4;
	    anInt4150 = arg3;
	    anInt4145 = arg2;
	    anInt4164 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("el.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ','
						 + arg7 + ',' + arg8 + ')'));
	}
    }
    
    static {
	aBoolean4156 = false;
	anInt4161 = 0;
    }
}
