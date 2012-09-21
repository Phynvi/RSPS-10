/* Class131_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub43 extends Class131
{
    public static int[] anIntArray4695 = { 0, 1, 2, 3, 4, 5, 6, 14 };
    public static int anInt4696 = 0;
    public static int anInt4697;
    public int anInt4698;
    public static int[] anIntArray4699 = { 0, -1, 0, 1 };
    public static int anInt4700 = 0;
    public int anInt4701;
    
    public static void method2092(int arg0, int arg1, int arg2, byte arg3) {
	try {
	    arg0 <<= 3;
	    arg2 <<= 3;
	    if (arg3 <= 0)
		method2092(-96, 34, 91, (byte) 91);
	    arg1 <<= 3;
	    anInt4697++;
	    Class120.aFloat1578 = (float) arg1;
	    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -3) {
		Stream.anInt4323 = arg0;
		Class131_Sub41_Sub4.anInt6213 = arg1;
		Login.anInt1762 = arg2;
	    }
	    Class23_Sub1_Sub1.aFloat5082 = (float) arg0;
	    Class172.method2450(-4);
	    Class209.aBoolean3053 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wq.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method2093(int arg0) {
	try {
	    int i = -27 / ((-60 - arg0) / 61);
	    anIntArray4699 = null;
	    anIntArray4695 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wq.B(" + arg0 + ')');
	}
    }
    
    public Class131_Sub43(int arg0, int arg1) {
	try {
	    anInt4698 = arg1;
	    anInt4701 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wq.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
}
