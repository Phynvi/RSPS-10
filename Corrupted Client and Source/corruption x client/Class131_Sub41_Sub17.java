/* Class131_Sub41_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class131_Sub41_Sub17 extends Class131_Sub41
{
    public static int anInt6383;
    public static int anInt6384;
    public static char[] aCharArray6385
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    public static Class131_Sub31 aClass131_Sub31_6386;
    public static boolean aBoolean6387 = true;
    public static int anInt6388;
    public static int anInt6389;
    public static int anInt6390;
    public static int anInt6391;
    public static int anInt6392;
    public static int anInt6393;
    
    public static void method2043(int arg0, byte arg1, int arg2,
				  Class23_Sub4_Sub1_Sub2 arg3) {
	try {
	    int i = -91 / ((-54 - arg1) / 56);
	    if ((arg3.anInt5247 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
		&& arg0 != -1) {
		Class161 class161 = Class145.method2159(arg0, (byte) -88);
		int i_0_ = class161.anInt2155;
		if ((i_0_ ^ 0xffffffff) == -2) {
		    arg3.anInt5256 = arg2;
		    arg3.anInt5248 = 0;
		    arg3.anInt5237 = 0;
		    arg3.anInt5307 = 0;
		    arg3.anInt5258 = 1;
		    Login.method1153(arg3.anInt3733, 21155,
					(Class166.aClass23_Sub4_Sub1_Sub2_2216
					 == arg3),
					arg3.anInt5248, arg3.anInt3747,
					class161);
		}
		if ((i_0_ ^ 0xffffffff) == -3)
		    arg3.anInt5307 = 0;
	    } else if ((arg0 ^ 0xffffffff) == 0
		       || (arg3.anInt5247 ^ 0xffffffff) == 0
		       || (Class145.method2159(arg0, (byte) -94).anInt2142
			   >= (Class145.method2159(arg3.anInt5247, (byte) -121)
			       .anInt2142))) {
		arg3.anInt5256 = arg2;
		arg3.anInt5258 = 1;
		arg3.anInt5307 = 0;
		arg3.anInt5248 = 0;
		arg3.anInt5247 = arg0;
		arg3.anInt5330 = arg3.anInt5334;
		arg3.anInt5237 = 0;
		if ((arg3.anInt5247 ^ 0xffffffff) != 0)
		    Login.method1153(arg3.anInt3733, 21155,
					(arg3
					 == (Class166
					     .aClass23_Sub4_Sub1_Sub2_2216)),
					arg3.anInt5248, arg3.anInt3747,
					Class145.method2159(arg3.anInt5247,
							    (byte) -97));
	    }
	    anInt6392++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qq.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public abstract Object method2044(int i);
    
    public static void method2045(byte arg0) {
	try {
	    Class131_Sub32.anInt4552++;
	    anInt6389++;
	    if (arg0 >= -14)
		aCharArray6385 = null;
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(36);
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qq.E(" + arg0 + ')');
	}
    }
    
    public static void method2046(int arg0) {
	try {
	    aCharArray6385 = null;
	    if (arg0 != 732)
		method2046(79);
	    aClass131_Sub31_6386 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qq.D(" + arg0 + ')');
	}
    }
    
    public abstract boolean method2047(int i);
    
    static {
	anInt6383 = 0;
	aClass131_Sub31_6386 = new Class131_Sub31(0, 0);
	anInt6390 = -1;
	anInt6391 = 0;
    }
}
