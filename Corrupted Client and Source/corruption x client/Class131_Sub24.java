/* Class131_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub24 extends Class131
{
    public static int anInt4462;
    public static int anInt4463;
    public static int anInt4464;
    public int anInt4465;
    public static int anInt4466;
    public static Class119 aClass119_4467 = new Class119();
    public static Class180 aClass180_4468 = new Class180(64);
    public static Class55 aClass55_4469;
    public static int anInt4470;
    public static int anInt4471;
    public static boolean aBoolean4472;
    public static int[] anIntArray4473 = new int[50];
    
    public static void method1825(int arg0, int arg1, String arg2) {
	try {
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(47);
	    anInt4466++;
	    Class131_Sub41_Sub16.anInt6375++;
	    Class93.aClass131_Sub15_Sub2_1226.writeByte
		(arg1 - -Class131_Sub30.method1856((byte) -128, arg2));
	    Class93.aClass131_Sub15_Sub2_1226.writeString(arg2, (byte) 78);
	    Class93.aClass131_Sub15_Sub2_1226.writeByteA(true, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nn.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class131_Sub41_Sub15 method1826(int arg0, int arg1) {
	try {
	    if (arg0 != -25652)
		return null;
	    anInt4464++;
	    Class131_Sub41_Sub15 class131_sub41_sub15
		= ((Class131_Sub41_Sub15)
		   Class204.aClass137_2980.method2111(-12, (long) arg1));
	    if (class131_sub41_sub15 != null)
		return class131_sub41_sub15;
	    byte[] is = Class160.aClass158_2133.method2364(0, arg1, 0);
	    if (is == null || is.length <= 1)
		return null;
	    class131_sub41_sub15 = Class18.method231(is, -2);
	    Class204.aClass137_2980.method2110(class131_sub41_sub15, false,
					       (long) arg1);
	    return class131_sub41_sub15;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nn.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub24() {
	/* empty */
    }
    
    public static void method1827(byte arg0) {
	anIntArray4473 = null;
	aClass55_4469 = null;
	aClass180_4468 = null;
	aClass119_4467 = null;
	if (arg0 >= -4)
	    anInt4470 = 18;
    }
    
    public static void method1828(Class130 arg0, int arg1) {
	anInt4463++;
	if (arg1 != -1262)
	    method1825(123, -127, null);
	if (Class22.anInt247 != Class29.anInt300
	    && Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
	    if (Class131_Sub30.method1858(arg0, Class29.anInt300, 20))
		Class22.anInt247 = Class29.anInt300;
	}
    }
    
    public Class131_Sub24(int arg0) {
	try {
	    anInt4465 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nn.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean4472 = false;
    }
}
