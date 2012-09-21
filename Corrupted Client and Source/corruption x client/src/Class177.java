/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class177
{
    public static int anInt2525 = 2;
    public int anInt2526;
    public static Class158 aClass158_2527;
    public int[] anIntArray2528;
    public int[] anIntArray2529;
    public static boolean aBoolean2530 = false;
    public static int anInt2531 = 0;
    
    public static void method2491(Class138 arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg1 == 1 && arg3 > 0)
	    Class1_Sub2.method103(arg0, arg2, arg3 - 1, arg4);
	else if (arg1 == 4 && arg3 <= Class210.anInt3068)
	    Class1_Sub2.method103(arg0, arg2, arg3 + 1, arg4);
	else if (arg1 == 8 && arg4 > 0)
	    Class1_Sub2.method103(arg0, arg2, arg3, arg4 - 1);
	else if (arg1 == 2 && arg4 <= Class131_Sub8_Sub1.anInt6099)
	    Class1_Sub2.method103(arg0, arg2, arg3, arg4 + 1);
	else if (arg1 == 16 && arg3 > 0
		 && arg4 <= Class131_Sub8_Sub1.anInt6099)
	    Class1_Sub2.method103(arg0, arg2, arg3 - 1, arg4 + 1);
	else if (arg1 == 32 && arg3 <= Class210.anInt3068
		 && arg4 <= Class131_Sub8_Sub1.anInt6099)
	    Class1_Sub2.method103(arg0, arg2, arg3 + 1, arg4 + 1);
	else if (arg1 == 128 && arg3 > 0 && arg4 > 0)
	    Class1_Sub2.method103(arg0, arg2, arg3 - 1, arg4 - 1);
	else if (arg1 == 64 && arg3 <= Class210.anInt3068 && arg4 > 0)
	    Class1_Sub2.method103(arg0, arg2, arg3 + 1, arg4 - 1);
	else
	    throw new RuntimeException("Unsupported wall shape " + arg1
				       + " in world2.setclosestlights_wall");
    }
    
    public static void method2492(byte arg0) {
	try {
	    if (arg0 == 113)
		aClass158_2527 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sc.B(" + arg0 + ')');
	}
    }
    
    public Class177(int arg0) {
	try {
	    anInt2526 = arg0;
	    anIntArray2528 = new int[anInt2526];
	    anIntArray2529 = new int[anInt2526];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sc.<init>(" + arg0 + ')');
	}
    }
}
