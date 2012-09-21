/* Class121_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121_Sub3_Sub1 extends Class121_Sub3
{
    public static int[] anIntArray5429
	= { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };
    public static int anInt5430 = 1;
    public static String aString5431;
    public static int anInt5432 = 0;
    public static int anInt5433;
    public static byte[][][] aByteArrayArrayArray5434;
    public static Class158 aClass158_5435;
    
    public static void method1059(int arg0) {
	Class51.anInt675 = arg0;
	for (int i = 0; i < Class210.anInt3068; i++) {
	    for (int i_0_ = 0; i_0_ < Class131_Sub8_Sub1.anInt6099; i_0_++) {
		if ((Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][i]
		     [i_0_])
		    == null)
		    Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0]
			[i][i_0_]
			= new Class147(arg0, i, i_0_);
	    }
	}
    }
    
    public static void method1060(byte arg0, int arg1) {
	try {
	    anInt5433++;
	    if (arg0 == 99) {
		Class146.anInt1940 = -1;
		Class197.anInt2875 = arg1;
		Class146.anInt1940 = -1;
		Class131_Sub13.method1707(127);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gs.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1061(boolean arg0) {
	try {
	    aClass158_5435 = null;
	    aString5431 = null;
	    if (arg0 != true)
		aClass158_5435 = null;
	    anIntArray5429 = null;
	    aByteArrayArrayArray5434 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gs.B(" + arg0 + ')');
	}
    }
    
    static {
	aString5431 = "K";
    }
}
