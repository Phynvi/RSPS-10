/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90
{
    public static int anInt1174 = 0;
    public static int anInt1175;
    public static int anInt1176 = 0;
    public static int anInt1177;
    
    public static int method841(int arg0, int arg1) {
	try {
	    return arg0 & arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jk.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method842(int arg0) {
	try {
	    anInt1177++;
	    if (!Class131_Sub22.aBoolean4446) {
		Class131_Sub22.aBoolean4446 = true;
		if (!Class131_Sub6.aBoolean4143)
		    Cryption.aFloat1825
			+= (-12.0F - Cryption.aFloat1825) / 2.0F;
		else
		    Class23_Sub1_Sub1.aFloat5082
			= (float) (-17 + (int) Class23_Sub1_Sub1.aFloat5082
				   & ~0xf);
		if (arg0 >= -59)
		    method842(-103);
		Class209.aBoolean3053 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jk.A(" + arg0 + ')');
	}
    }
    
    static {
	anInt1175 = -1;
    }
}
