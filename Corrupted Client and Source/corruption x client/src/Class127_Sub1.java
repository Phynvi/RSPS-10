/* Class127_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127_Sub1 extends Class127
{
    public static int anInt4002 = 0;
    public static String aString4003 = "Continue";
    public static int anInt4004;
    public static int anInt4005;
    public static int anInt4006;
    public static Class214 aClass214_4007 = new Class214(64);
    public static int anInt4008;
    public static int anInt4009;
    public static int anInt4010;
    public static Class158 aClass158_4011;
    
    public static void method1133(Class158 arg0, int arg1) {
	anInt4010++;
	Cryption.aClass158_1832 = arg0;
	if (arg1 != 16383)
	    anInt4002 = -125;
    }
    
    public static void method1134(int arg0, int arg1, boolean arg2, int arg3) {
	anInt4005++;
	Class150 class150
	    = Class131_Sub41_Sub12.aClass150ArrayArray6309[arg0][arg3];
	Class131_Sub41_Sub14.method2029(0, arg1, (class150 == null
						  ? Class201.aClass150_2934
						  : class150));
	if (arg2 != true)
	    aString4003 = null;
    }
    
    public static void method1135(int arg0) {
	try {
	    aString4003 = null;
	    if (arg0 != 64)
		method1136(-69, -102, 123);
	    aClass214_4007 = null;
	    aClass158_4011 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ma.DA(" + arg0 + ')');
	}
    }
    
    public static void method1136(int arg0, int arg1, int arg2) {
	try {
	    anInt4004++;
	    Class180 class180 = new Class180(16);
	    for (Class131_Sub10 class131_sub10
		     = ((Class131_Sub10)
			Class131_Sub24.aClass180_4468.method2520(0));
		 class131_sub10 != null;
		 class131_sub10
		     = ((Class131_Sub10)
			Class131_Sub24.aClass180_4468.method2518(0))) {
		class131_sub10.method1355((byte) 122);
		int i = (int) (class131_sub10.aLong1791 >> -625323492);
		int i_0_
		    = -arg0 + (int) (class131_sub10.aLong1791 >> -728916466
				     & 0x3fffL);
		int i_1_ = (int) (class131_sub10.aLong1791 & 0x3fffL) + -arg1;
		if (i_1_ >= 0 && i_0_ >= 0
		    && Class131_Sub41_Sub11_Sub1.anInt6546 > i_1_
		    && ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			< (i_0_ ^ 0xffffffff)))
		    class180.method2523(false,
					(long) (i << -1997647428
						| i_0_ << -1985283282 | i_1_),
					class131_sub10);
	    }
	    if (arg2 != 16383)
		method1135(103);
	    Class131_Sub24.aClass180_4468 = class180;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ma.AA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
