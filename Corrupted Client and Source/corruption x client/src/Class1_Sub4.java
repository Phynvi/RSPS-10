/* Class1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub4 extends Class1
{
    public Class23_Sub4_Sub1 aClass23_Sub4_Sub1_3545;
    public static int anInt3546;
    public static int anInt3547;
    public static int anInt3548;
    public int anInt3549;
    public static int anInt3550;
    public static int[] anIntArray3551;
    public int anInt3552;
    public int anInt3553;
    public static int anInt3554 = 64;
    public int anInt3555;
    
    public static void method108(byte arg0) {
	anIntArray3551 = null;
	if (arg0 != 47)
	    anInt3547 = 57;
    }
    
    public static void method109(int arg0, int arg1, int arg2, int arg3,
				 byte arg4) {
	try {
	    if (Class116.anInt1494 <= arg0 && arg0 <= Class125.anInt1629) {
		arg3 = Class180.method2517(arg4 + -15574, Class115.anInt1477,
					   Class149.anInt1988, arg3);
		arg2 = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg2);
		Class131_Sub2_Sub31.method1623(arg3, arg0, arg2, arg1,
					       (byte) 118);
	    }
	    if (arg4 != 31)
		method108((byte) -90);
	    anInt3548++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nm.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    static {
	anInt3547 = -1;
    }
}
