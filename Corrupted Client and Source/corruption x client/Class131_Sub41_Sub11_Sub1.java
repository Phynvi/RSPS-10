/* Class131_Sub41_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub11_Sub1 extends Class131_Sub41_Sub11
{
    public static int anInt6543;
    public static String aString6544;
    public static int anInt6545;
    public static int anInt6546 = 104;
    public static int anInt6547;
    public Object anObject6548;
    public static Class158 aClass158_6549;
    public static int anInt6550;
    public static int anInt6551;
    public static int anInt6552;
    public static int anInt6553;
    public static int anInt6554;
    public static String aString6555;
    
    public static void method2005(byte arg0) {
	try {
	    aString6544 = null;
	    aClass158_6549 = null;
	    if (arg0 <= 0)
		aString6555 = null;
	    aString6555 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bm.J(" + arg0 + ')');
	}
    }
    
    public Object method2001(byte arg0) {
	try {
	    if (arg0 > -111)
		return null;
	    anInt6551++;
	    return anObject6548;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bm.C(" + arg0 + ')');
	}
    }
    
    public boolean method2000(int arg0) {
	try {
	    if (arg0 <= 118)
		return false;
	    anInt6550++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bm.E(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub11_Sub1(Interface1 arg0, Object arg1) {
	super(arg0);
	try {
	    anObject6548 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bm.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2006
	(Class130 arg0, byte[][] arg1, int arg2, Class68 arg3, byte[][] arg4,
	 byte[][] arg5, int arg6, byte arg7, Class68 arg8, int[][] arg9,
	 boolean arg10, int arg11, byte[][] arg12) {
	try {
	    if (Stream.anInt4299 == 0 && !Class131_Sub13.aBoolean4268)
		Class154.method2242(arg8, arg3, arg9, arg6, arg12, arg11, arg2,
				    arg4, arg1, arg0, arg5, arg10, (byte) 98);
	    else
		Class171.method2448(arg6, arg9, arg12, arg3, arg8, arg2, -108,
				    arg5, arg1, arg0, arg11, arg4, arg10);
	    if (arg7 < 78)
		method2008(53);
	    anInt6547++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("bm.I(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ','
			+ arg11 + ',' + (arg12 != null ? "{...}" : "null")
			+ ')'));
	}
    }
    
    public static String method2007(int arg0) {
	try {
	    anInt6545++;
	    String string = "www";
	    if (Class1_Sub7.anInt3581 != 0)
		string = "www-wtqa";
	    String string_0_ = "";
	    if (Class23_Sub2_Sub2.aString5186 != null)
		string_0_ = "/p=" + Class23_Sub2_Sub2.aString5186;
	    int i = -42 % ((arg0 - -35) / 63);
	    if (Class126.anInt1696 != 1)
		return ("http://" + string + ".runescape.com/l="
			+ Class1_Sub7_Sub1.anInt5208 + "/a="
			+ Class131_Sub2_Sub22.anInt5863 + string_0_ + "/");
	    return ("http://" + string + ".stellardawn.com/l="
		    + Class1_Sub7_Sub1.anInt5208 + "/a="
		    + Class131_Sub2_Sub22.anInt5863 + string_0_ + "/");
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bm.H(" + arg0 + ')');
	}
    }
    
    public static Class100 method2008(int arg0) {
	try {
	    anInt6553++;
	    try {
		return new Class100_Sub3();
	    } catch (Throwable throwable) {
		if (arg0 != 0)
		    method2006(null, null, -40, null, null, null, 86,
			       (byte) 22, null, null, true, -32, null);
		try {
		    return ((Class100)
			    Class.forName("Class100_Sub2").newInstance());
		} catch (Throwable throwable_1_) {
		    return new Class100_Sub1();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bm.G(" + arg0 + ')');
	}
    }
    
    static {
	aString6544 = "slide:";
	anInt6552 = 0;
	aString6555 = "Walk here";
    }
}
