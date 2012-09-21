/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class155
{
    public static int anInt2060;
    public static int anInt2061;
    public static int anInt2062;
    public static boolean aBoolean2063 = false;
    public static int anInt2064;
    public static Class83 aClass83_2065;
    public static String[] aStringArray2066;
    public static int anInt2067 = 0;
    public static String aString2068 = "slide:";
    
    public static void method2335(int arg0) {
	try {
	    if (arg0 != 65459)
		method2338(null, 96, null);
	    aString2068 = null;
	    aClass83_2065 = null;
	    aStringArray2066 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qf.E(" + arg0 + ')');
	}
    }
    
    public static void method2336(int arg0, byte arg1) {
	try {
	    if (arg1 < 5)
		anInt2067 = 21;
	    Class71.aClass214_944.method2786(0, arg0);
	    anInt2060++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qf.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2337(byte arg0) {
	for (Class1_Sub6 class1_sub6
		 = (Class1_Sub6) Class42.aClass50_574.method586((byte) 42);
	     class1_sub6 != null;
	     class1_sub6 = (Class1_Sub6) Class42.aClass50_574.method589(74))
	    class1_sub6.method122();
	anInt2064++;
	if (arg0 >= -74)
	    method2338(null, 108, null);
    }
    
    public static void method2338(Class158 arg0, int arg1, Class158 arg2) {
	try {
	    Class28.aClass158_288 = arg0;
	    anInt2061++;
	    Class89.aClass158_3261 = arg2;
	    if (arg1 < -21)
		Class120.anInt1581
		    = Class28.aClass158_288.method2368(3, (byte) -72);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qf.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2339(int arg0, int arg1, int arg2,
				  Class23_Sub5 arg3) {
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    == null)
	    Class1_Sub2.method101(arg0, arg1, arg2);
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub5_1973
	    = arg3;
    }
}
