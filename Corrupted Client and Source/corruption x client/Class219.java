/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class219
{
    public static int anInt3203;
    public static Class214 aClass214_3204;
    public static int anInt3205 = -1;
    public static long aLong3206 = 0L;
    public static Class158 aClass158_3207;
    public static String aString3208 = "glow1:";
    
    public static void method2821(boolean arg0) {
	try {
	    if (arg0 != false)
		method2821(true);
	    aString3208 = null;
	    aClass214_3204 = null;
	    aClass158_3207 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wn.B(" + arg0 + ')');
	}
    }
    
    public static void method2822(boolean arg0) {
	try {
	    if (arg0 == true) {
		anInt3203++;
		RuntimeException_Sub1.aClass214_3238.method2783(-85);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wn.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_3204 = new Class214(64);
    }
}
