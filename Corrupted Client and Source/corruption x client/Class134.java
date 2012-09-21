/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class134
{
    public static int anInt1806;
    public static Class50 aClass50_1807 = new Class50();
    public static int anInt1808;
    public static int anInt1809 = 3;
    public static int anInt1810;
    
    public static void method2096(boolean arg0) {
	anInt1808++;
	if (Class131_Sub2_Sub35.aClass28_6038 != null) {
	    synchronized (Class131_Sub2_Sub35.aClass28_6038) {
		Class131_Sub2_Sub35.aClass28_6038 = null;
	    }
	}
	if (arg0 != true)
	    method2098(false);
    }
    
    public static Class116 method2097(int arg0, int arg1, Class158 arg2,
				      int arg3) {
	try {
	    anInt1810++;
	    byte[] is = arg2.method2364(arg1, arg0, 0);
	    if (is == null)
		return null;
	    if (arg3 != 1)
		method2099(29);
	    return new Class116(is);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("og.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method2098(boolean arg0) {
	try {
	    if (arg0 != false)
		aClass50_1807 = null;
	    aClass50_1807 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"og.B(" + arg0 + ')');
	}
    }
    
    public static boolean method2099(int arg0) {
	try {
	    anInt1806++;
	    if (arg0 != 0)
		anInt1809 = 88;
	    return Class131_Sub2_Sub27.aBoolean5940;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"og.D(" + arg0 + ')');
	}
    }
}
