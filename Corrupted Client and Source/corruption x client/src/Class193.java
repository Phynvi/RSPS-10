/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class193
{
    public Class131 aClass131_2826;
    public static int anInt2827;
    public static int anInt2828;
    public static Class72 aClass72_2829;
    public static int anInt2830 = 99;
    public static int anInt2831;
    public static int anInt2832;
    public static int anInt2833;
    public Class119 aClass119_2834;
    public static Class128_Sub1[] aClass128_Sub1Array2835;
    public static Class173 aClass173_2836;
    public static int anInt2837;
    public static int anInt2838;
    public static int anInt2839;
    public static String aString2840;
    
    public static void method2624(int arg0, int arg1, int arg2) {
	try {
	    Class79.anIntArray1062[arg0] = arg2;
	    anInt2828++;
	    Class131_Sub32 class131_sub32
		= ((Class131_Sub32)
		   Class50.aClass180_665.method2521(-110, (long) arg0));
	    if (class131_sub32 == null) {
		class131_sub32 = new Class131_Sub32(4611686018427387905L);
		Class50.aClass180_665.method2523(false, (long) arg0,
						 class131_sub32);
	    } else if (class131_sub32.aLong4550 != 4611686018427387905L)
		class131_sub32.aLong4550
		    = 0x4000000000000000L | 500L + Class208.method2749(-3913);
	    int i = -45 / ((-11 - arg1) / 49);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("th.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2625(int arg0, int arg1, int arg2, byte arg3,
				  int arg4) {
	for (int i = 0;
	     (Class131_Sub29.anInt4514 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    Rectangle rectangle = Class98.aRectangleArray1305[i];
	    if ((arg4 ^ 0xffffffff) > (rectangle.x - -rectangle.width
				       ^ 0xffffffff)
		&& arg4 + arg1 > rectangle.x
		&& ((rectangle.height + rectangle.y ^ 0xffffffff)
		    < (arg0 ^ 0xffffffff))
		&& rectangle.y < arg2 + arg0)
		Class128_Sub1.aBooleanArray4018[i] = true;
	}
	anInt2827++;
	if (arg3 != 63)
	    method2629(66, -67, -26, 114, 73, 103, -60);
    }
    
    public Class131 method2626(byte arg0) {
	try {
	    anInt2832++;
	    Class131 class131 = aClass119_2834.aClass131_1553.aClass131_1783;
	    if (class131 == aClass119_2834.aClass131_1553) {
		aClass131_2826 = null;
		return null;
	    }
	    if (arg0 != -111)
		anInt2830 = -96;
	    aClass131_2826 = class131.aClass131_1783;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"th.B(" + arg0 + ')');
	}
    }
    
    public Class131 method2627(int arg0) {
	try {
	    anInt2831++;
	    Class131 class131 = aClass131_2826;
	    if (arg0 != -25293)
		method2628(53);
	    if (aClass119_2834.aClass131_1553 == class131) {
		aClass131_2826 = null;
		return null;
	    }
	    aClass131_2826 = class131.aClass131_1783;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"th.F(" + arg0 + ')');
	}
    }
    
    public static void method2628(int arg0) {
	try {
	    if (arg0 == 12141) {
		aString2840 = null;
		aClass128_Sub1Array2835 = null;
		aClass72_2829 = null;
		aClass173_2836 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"th.D(" + arg0 + ')');
	}
    }
    
    public static void method2629(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	Class203 class203 = new Class203();
	class203.anInt2959 = arg1 >> 7;
	class203.anInt2965 = arg2 >> 7;
	class203.anInt2958 = arg3 >> 7;
	class203.anInt2957 = arg4 >> 7;
	class203.anInt2972 = arg0;
	class203.anInt2954 = arg1;
	class203.anInt2952 = arg2;
	class203.anInt2961 = arg3;
	class203.anInt2974 = arg4;
	class203.anInt2975 = arg5;
	class203.anInt2953 = arg6;
	Class213.aClass203Array3121[Class23_Sub2_Sub1.anInt4995++] = class203;
    }
    
    public void method2630(Class119 arg0, byte arg1) {
	try {
	    aClass119_2834 = arg0;
	    if (arg1 < -55)
		anInt2833++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("th.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class193() {
	/* empty */
    }
    
    public Class193(Class119 arg0) {
	try {
	    aClass119_2834 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("th.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aClass72_2829 = new Class72();
	aClass173_2836 = null;
	anInt2838 = 0;
	aString2840 = null;
    }
}
