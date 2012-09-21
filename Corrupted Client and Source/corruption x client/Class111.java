/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class111 implements Interface3
{
    public static int anInt3271;
    public static Class131_Sub41_Sub10[] aClass131_Sub41_Sub10Array3272
	= new Class131_Sub41_Sub10[14];
    public static int anInt3273;
    public static int anInt3274;
    public static boolean[] aBooleanArray3275 = new boolean[100];
    public static int anInt3276;
    public static int[] anIntArray3277 = new int[100];
    public static int anInt3278;
    public static int anInt3279;
    public static int anInt3280;
    
    public static void method951(int arg0, int arg1, int arg2) {
	try {
	    if (arg2 != 11)
		method954(false, -86, 109);
	    anInt3279++;
	    Class150 class150
		= Class131_Sub41_Sub12.aClass150ArrayArray6309[arg0][arg1];
	    if (class150 != null) {
		Class85.anInt1119 = class150.anInt1995;
		Class131_Sub2_Sub30.anInt5982 = class150.anInt2003;
		Class131_Sub41_Sub15.anInt6368 = class150.anInt1997;
	    }
	    Class126.method1105(arg2 ^ 0x7ff4);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lj.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method952(int arg0) {
	try {
	    aClass131_Sub41_Sub10Array3272 = null;
	    if (arg0 != 10)
		method953(-49, 101);
	    aBooleanArray3275 = null;
	    anIntArray3277 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lj.A(" + arg0 + ')');
	}
    }
    
    public static void method953(int arg0, int arg1) {
	try {
	    anInt3271++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(arg0, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(arg0 + -77);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lj.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public String method9(int[] arg0, int arg1, int arg2, long arg3) {
	try {
	    anInt3276++;
	    int i = -80 / ((-12 - arg2) / 52);
	    if (arg1 == 0) {
		Class131_Sub41_Sub14 class131_sub41_sub14
		    = Class161.method2396(256, arg0[0]);
		return class131_sub41_sub14.method2028((byte) -49, (int) arg3);
	    }
	    if (arg1 == 1 || arg1 == 10) {
		Class29 class29 = Class131_Sub19.method1808((int) arg3, false);
		return class29.aString341;
	    }
	    if ((arg1 ^ 0xffffffff) == -7 || (arg1 ^ 0xffffffff) == -8
		|| (arg1 ^ 0xffffffff) == -12)
		return Class161.method2396(256, arg0[0])
			   .method2028((byte) -49, (int) arg3);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lj.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method954(boolean arg0, int arg1, int arg2) {
	try {
	    if (arg0 != true)
		anInt3273 = 56;
	    anInt3278++;
	    arg2 = arg2 * Class212.anInt3112 >> -5097688;
	    if ((arg1 ^ 0xffffffff) == 0 && !Class23_Sub2.aBoolean3718)
		Class46.method571((byte) -109);
	    else if ((arg1 ^ 0xffffffff) != 0
		     && (Class131_Sub2_Sub10.anInt5705 != arg1
			 || !Class121_Sub2.method1048(0))
		     && arg2 != 0 && !Class23_Sub2.aBoolean3718)
		Class131_Sub20.method1814(arg2, Class156.aClass158_2074,
					  (byte) 104, 0, false, 2, arg1);
	    Class131_Sub2_Sub10.anInt5705 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lj.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
