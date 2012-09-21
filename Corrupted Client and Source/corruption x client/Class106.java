/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class106
{
    public static int anInt1381;
    public static Class139 aClass139_1382 = null;
    
    public static Class23_Sub2 method918(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 == null)
	    return null;
	return class147.aClass23_Sub2_1972;
    }
    
    public abstract Class131_Sub41_Sub17 method919
	(Class131_Sub41_Sub17 class131_sub41_sub17, int i);
    
    public static void method920(int arg0) {
	try {
	    if (arg0 != -7634)
		method918(-37, 21, -32);
	    aClass139_1382 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ld.A(" + arg0 + ')');
	}
    }
}
