/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14
{
    public Class131_Sub41_Sub13 aClass131_Sub41_Sub13_148;
    public Class154 aClass154_149;
    public static int anInt150;
    public static String aString151;
    public static int anInt152;
    public static Class119 aClass119_153;
    public static int anInt154 = 0;
    public static String[] aStringArray155 = { "en", "de", "fr", "pt", "nl" };
    public static int anInt156;
    public static int anInt157;
    public static int anInt158;
    public static int anInt159 = 0;
    public static int anInt160;
    public static double aDouble161 = -1.0;
    public static String aString162;
    public static int anInt163;
    
    public static void method214(byte arg0) {
	aStringArray155 = null;
	aClass119_153 = null;
	aString162 = null;
	aString151 = null;
	if (arg0 != -15)
	    anInt154 = 47;
    }
    
    public static Class131_Sub41_Sub8 method215(int arg0, byte arg1) {
	try {
	    anInt150++;
	    Class131_Sub41_Sub8 class131_sub41_sub8
		= ((Class131_Sub41_Sub8)
		   Class131_Sub2_Sub28.aClass137_5955.method2111(-12,
								 (long) arg0));
	    if (class131_sub41_sub8 != null)
		return class131_sub41_sub8;
	    byte[] is;
	    if (arg0 < 32768)
		is = Class131_Sub2_Sub10.aClass158_5696.method2364(arg0, 1, 0);
	    else
		is = Class46_Sub1.aClass158_3804.method2364(0x7fff & arg0, 1,
							    0);
	    class131_sub41_sub8 = new Class131_Sub41_Sub8();
	    if (is != null)
		class131_sub41_sub8.method1975((byte) 72,
					       new Stream(is));
	    if (arg0 >= 32768)
		class131_sub41_sub8.method1982(false);
	    int i = 52 / ((arg1 - 28) / 37);
	    Class131_Sub2_Sub28.aClass137_5955.method2110(class131_sub41_sub8,
							  false, (long) arg0);
	    return class131_sub41_sub8;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bc.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static char method216(char arg0, boolean arg1) {
	try {
	    anInt157++;
	    if ((arg0 ^ 0xffffffff) == -182 || (arg0 ^ 0xffffffff) == -403)
		return arg0;
	    if (arg1 != false)
		return '\uff8b';
	    return Character.toTitleCase(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bc.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method217(boolean arg0) {
	try {
	    anInt158++;
	    if (arg0 == false)
		Class131_Sub1_Sub4.aClass214_5541.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bc.C(" + arg0 + ')');
	}
    }
    
    public static void method218(Class158 arg0, boolean arg1, Class158 arg2) {
	do {
	    try {
		anInt152++;
		Class131_Sub29.aClass158_4504 = arg0;
		Class77.aClass158_1040 = arg2;
		if (arg1 == false)
		    break;
		anInt154 = -55;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("bc.D("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ',' + arg1 + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	aString151 = "glow3:";
	aClass119_153 = new Class119();
	aString162 = "Loading - please wait.";
	anInt163 = 0;
    }
}
