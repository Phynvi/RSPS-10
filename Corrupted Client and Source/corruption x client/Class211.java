/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class211
{
    public int anInt3070;
    public int anInt3071;
    public boolean[] aBooleanArray3072;
    public int anInt3073;
    public int anInt3074;
    public int[] anIntArray3075;
    public byte[] aByteArray3076;
    public int anInt3077;
    public int anInt3078;
    public byte[] aByteArray3079;
    public int anInt3080;
    public static int anInt3081 = 0;
    public int[][] anIntArrayArray3082 = new int[6][258];
    public int anInt3083;
    public static int[] anIntArray3084;
    public int anInt3085;
    public static int[] anIntArray3086
	= { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    public static int anInt3087;
    public int anInt3088;
    public static int anInt3089;
    public int[] anIntArray3090;
    public int[] anIntArray3091;
    public int[] anIntArray3092;
    public int anInt3093;
    public byte[] aByteArray3094 = new byte[18002];
    public int[][] anIntArrayArray3095;
    public int anInt3096;
    public int anInt3097;
    public byte[][] aByteArrayArray3098;
    public int[][] anIntArrayArray3099;
    public int anInt3100;
    public byte[] aByteArray3101;
    public static int anInt3102;
    public boolean[] aBooleanArray3103;
    public static Class131_Sub1_Sub1 aClass131_Sub1_Sub1_3104;
    public static int anInt3105;
    public int anInt3106;
    public byte[] aByteArray3107;
    public byte aByte3108;
    public byte[] aByteArray3109;
    
    public static void method2762(int arg0) {
	try {
	    if (arg0 != 14230)
		anIntArray3084 = null;
	    anIntArray3084 = null;
	    anIntArray3086 = null;
	    aClass131_Sub1_Sub1_3104 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vm.A(" + arg0 + ')');
	}
    }
    
    public static void method2763(boolean arg0) {
	try {
	    anInt3105++;
	    Class131_Sub41_Sub12.method2010((byte) 73);
	    Class155.aClass83_2065 = null;
	    Class131_Sub41_Sub12.aClass150ArrayArray6309 = null;
	    Class23_Sub1_Sub2.aClass83_5145 = null;
	    Class88.aClass83_1170 = null;
	    if (arg0 == true)
		Class214.aClass130_3128 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vm.B(" + arg0 + ')');
	}
    }
    
    public static String method2764(int arg0, String arg1) {
	try {
	    anInt3089++;
	    int i = arg1.length();
	    char[] cs = new char[i];
	    int i_0_ = 2;
	    if (arg0 != 63)
		method2764(75, null);
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		char c = arg1.charAt(i_1_);
		if ((i_0_ ^ 0xffffffff) != -1) {
		    if ((i_0_ ^ 0xffffffff) == -3 || Character.isUpperCase(c))
			c = Class14.method216(c, false);
		} else
		    c = Character.toLowerCase(c);
		if (!Character.isLetter(c)) {
		    if (c == '.' || c == '?' || c == '!')
			i_0_ = 2;
		    else if (!Character.isSpaceChar(c))
			i_0_ = 1;
		    else if (i_0_ != 2)
			i_0_ = 1;
		} else
		    i_0_ = 0;
		cs[i_1_] = c;
	    }
	    return new String(cs);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vm.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2765(int arg0, Class173 arg1, Class130 arg2) {
	try {
	    if (arg0 != 6)
		method2764(108, null);
	    anInt3087++;
	    Class131_Sub20.method1815(0, 0, arg2, arg0 + 121, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vm.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class211() {
	aBooleanArray3072 = new boolean[16];
	anIntArray3090 = new int[6];
	anInt3074 = 0;
	anInt3100 = 0;
	aByteArray3101 = new byte[4096];
	anIntArray3091 = new int[257];
	aBooleanArray3103 = new boolean[256];
	anIntArray3075 = new int[256];
	anIntArray3092 = new int[16];
	anIntArrayArray3099 = new int[6][258];
	aByteArray3076 = new byte[18002];
	anIntArrayArray3095 = new int[6][258];
	aByteArrayArray3098 = new byte[6][258];
	aByteArray3107 = new byte[256];
    }
}
