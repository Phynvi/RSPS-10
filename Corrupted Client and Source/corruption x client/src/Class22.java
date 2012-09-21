/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class22
{
    public static int anInt243;
    public static Class137 aClass137_244 = new Class137(16);
    public static String aString245 = "red:";
    public static int anInt246;
    public static int anInt247 = -1;
    
    public abstract Class220 method263(int i);
    
    public abstract void method264(int i, int i_0_);
    
    public abstract byte[] method265(byte i, int i_1_);
    
    public abstract int method266(byte i, int i_2_);
    
    public static String method267(String arg0, byte arg1) {
	try {
	    anInt243++;
	    if (arg1 != -39)
		return null;
	    String string
		= Class51.method591(126, Class173.method2454(arg0, 65535));
	    if (string == null)
		string = "";
	    return string;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bs.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method268(byte arg0) {
	try {
	    if (arg0 > 28) {
		aClass137_244 = null;
		aString245 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bs.A(" + arg0 + ')');
	}
    }
    
    static {
	anInt246 = 0;
    }
}
