/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class146
{
    public static int anInt1936 = 0;
    public static int anInt1937;
    public static int anInt1938;
    public static Class152 aClass152_1939;
    public static int anInt1940 = -1;
    public static int anInt1941;
    public static byte[][][] aByteArrayArrayArray1942;
    
    public static void method2169(byte arg0) {
	try {
	    if (arg0 >= -63)
		method2171(-10, (byte) -30);
	    aByteArrayArrayArray1942 = null;
	    aClass152_1939 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ph.C(" + arg0 + ')');
	}
    }
    
    public static void method2170(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt1941++;
	    int i = Class180.method2517(-15543, Class125.anInt1629,
					Class116.anInt1494, arg5);
	    int i_0_ = Class180.method2517(arg2 + -15542, Class125.anInt1629,
					   Class116.anInt1494, arg1);
	    int i_1_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg4);
	    int i_2_ = Class180.method2517(arg2 ^ 0x3cb6, Class115.anInt1477,
					   Class149.anInt1988, arg6);
	    int i_3_ = Class180.method2517(arg2 ^ 0x3cb6, Class125.anInt1629,
					   Class116.anInt1494, arg5 - -arg0);
	    if (arg2 == -1) {
		int i_4_
		    = Class180.method2517(-15543, Class125.anInt1629,
					  Class116.anInt1494, -arg0 + arg1);
		for (int i_5_ = i; i_5_ < i_3_; i_5_++)
		    Class131_Sub3.method1650(i_2_,
					     Class56.anIntArrayArray740[i_5_],
					     arg7, i_1_, arg2 ^ ~0x78);
		for (int i_6_ = i_0_; i_4_ < i_6_; i_6_--)
		    Class131_Sub3.method1650(i_2_,
					     Class56.anIntArrayArray740[i_6_],
					     arg7, i_1_, 123);
		int i_7_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg4 + arg0);
		int i_8_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, -arg0 + arg6);
		for (int i_9_ = i_3_; i_4_ >= i_9_; i_9_++) {
		    int[] is = Class56.anIntArrayArray740[i_9_];
		    Class131_Sub3.method1650(i_7_, is, arg7, i_1_, 69);
		    Class131_Sub3.method1650(i_8_, is, arg3, i_7_, 112);
		    Class131_Sub3.method1650(i_2_, is, arg7, i_8_, arg2 + 99);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ph.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static void method2171(int arg0, byte arg1) {
	try {
	    Class151.anInt2019 = 100;
	    Class165.anInt2200 = arg0;
	    Class131_Sub41_Sub17.anInt6390 = -1;
	    if (arg1 != -127)
		anInt1936 = -111;
	    anInt1938++;
	    Class131_Sub7.anInt4173 = 3;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ph.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
