/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47
{
    public static int anInt641;
    public static int[] anIntArray642;
    public static int anInt643;
    public static int anInt644;
    public static boolean aBoolean645 = false;
    public static long aLong646;
    public static int anInt647 = 0;
    
    public static int method576(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt644++;
	    if ((Class23_Sub2_Sub1.aByteArrayArrayArray4992[arg3][arg0][arg2]
		 & 0x8)
		!= 0)
		return 0;
	    if (arg1 >= -17)
		method577(-55);
	    if (arg3 > 0
		&& (Class23_Sub2_Sub1.aByteArrayArrayArray4992[1][arg0][arg2]
		    & 0x2) != 0)
		return arg3 - 1;
	    return arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eb.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method577(int arg0) {
	try {
	    int i = -29 % ((arg0 - -35) / 53);
	    anIntArray642 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"eb.C(" + arg0 + ')');
	}
    }
    
    public static void method578(int arg0, int arg1, byte arg2) {
	try {
	    anInt641++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(15, 0, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg1;
	    if (arg2 != 126)
		method578(-110, 6, (byte) 58);
	    class131_sub41_sub6.anInt6234 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eb.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
