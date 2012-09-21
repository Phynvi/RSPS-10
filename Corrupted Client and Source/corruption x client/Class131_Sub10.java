/* Class131_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub10 extends Class131
{
    public static String aString4220;
    public static int anInt4221;
    public static Class158 aClass158_4222;
    public static String aString4223 = "flash2:";
    public static int anInt4224;
    public static int anInt4225;
    public Class119 aClass119_4226 = new Class119();
    public static Interface4 anInterface4_4227;
    
    public static void method1693(boolean arg0) {
	aString4220 = null;
	aClass158_4222 = null;
	anInterface4_4227 = null;
	aString4223 = null;
	if (arg0 != true)
	    method1693(false);
    }
    
    public static void method1694(int arg0, int arg1) {
	try {
	    anInt4224++;
	    int i = -48 % ((-46 - arg1) / 47);
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(2, arg0, (byte) 1);
	    class131_sub41_sub6.method1959(-118);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hm.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1695(int arg0, int[] arg1, Object[] arg2) {
	do {
	    try {
		Class118.method1004(arg1.length - 1, arg1, arg2, 0, 123);
		anInt4225++;
		if (arg0 == 2175)
		    break;
		aString4223 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("hm.B(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	aString4220 = "Loaded wordpack";
    }
}
