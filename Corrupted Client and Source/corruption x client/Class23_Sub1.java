/* Class23_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub1 extends Class23
{
    public int anInt3696;
    public int anInt3697;
    public static short aShort3698;
    public static Class52[] aClass52Array3699;
    public int anInt3700;
    public static boolean aBoolean3701 = false;
    public static int anInt3702;
    public int anInt3703;
    
    public static void method297(byte arg0) {
	try {
	    if (arg0 == 80)
		aClass52Array3699 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"br.N(" + arg0 + ')');
	}
    }
    
    public Class23_Sub1(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt3703 = arg1;
	    anInt3700 = arg0;
	    anInt3697 = arg3;
	    anInt3696 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("br.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ')'));
	}
    }
    
    static {
	aClass52Array3699 = new Class52[6];
	aShort3698 = (short) 32767;
    }
}
