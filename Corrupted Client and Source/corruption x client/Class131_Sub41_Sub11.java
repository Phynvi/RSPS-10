/* Class131_Sub41_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class131_Sub41_Sub11 extends Class131_Sub41
{
    public static int anInt6297;
    public Interface1 anInterface1_6298;
    public static Class214 aClass214_6299;
    public static String aString6300 = "Created gameworld";
    public static int[] anIntArray6301;
    public static int anInt6302;
    public static long aLong6303;
    public static int anInt6304;
    public static int anInt6305;
    
    public static void method1999(int arg0) {
	try {
	    aString6300 = null;
	    aClass214_6299 = null;
	    if (arg0 != 0)
		method2004(-123, -15);
	    anIntArray6301 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"km.B(" + arg0 + ')');
	}
    }
    
    public abstract boolean method2000(int i);
    
    public abstract Object method2001(byte i);
    
    public static void method2002(int arg0) {
	do {
	    try {
		anInt6302++;
		Class156.aClass214_2070.method2783(-77);
		Class100.aClass214_1317.method2783(-111);
		if (arg0 <= -45)
		    break;
		anIntArray6301 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "km.D(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public Class131_Sub41_Sub11(Interface1 arg0) {
	try {
	    anInterface1_6298 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("km.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class1_Sub2 method2003(int arg0, int arg1) {
	try {
	    anInt6305++;
	    synchronized (Class210.aClass50Array3066) {
		Class1_Sub2 class1_sub2;
		if (arg0 < Class210.aClass50Array3066.length
		    && !Class210.aClass50Array3066[arg0]
			    .method583(arg1 + -12172)) {
		    class1_sub2 = (Class1_Sub2) Class210.aClass50Array3066
						    [arg0].method582(128);
		    class1_sub2.method95((byte) 71);
		    Class121_Sub2.anIntArray3993[arg0]--;
		} else {
		    class1_sub2 = new Class1_Sub2();
		    class1_sub2.aClass1_Sub5Array3500 = new Class1_Sub5[arg0];
		    for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff);
			 i++)
			class1_sub2.aClass1_Sub5Array3500[i]
			    = new Class1_Sub5();
		}
		if (arg1 != 12300)
		    anInt6304 = 7;
		return class1_sub2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("km.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method2004(int arg0, int arg1) {
	if (Class218.anIntArrayArray3197 != null)
	    return Class218.anIntArrayArray3197[arg0][arg1] & 0xffffff;
	return 0;
    }
    
    static {
	aClass214_6299 = new Class214(256);
	aLong6303 = 0L;
	anInt6304 = 0;
    }
}
