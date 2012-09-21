/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class204
{
    public static int anInt2976;
    public static short aShort2977 = 320;
    public static Class152 aClass152_2978;
    public static int anInt2979 = 0;
    public static Class137 aClass137_2980 = new Class137(128);
    public static int anInt2981;
    public static Class44 aClass44_2982;
    public static int anInt2983;
    public static int anInt2984;
    public static int anInt2985;
    
    public static String method2729(boolean arg0, int arg1) {
	try {
	    if (arg0 != false)
		return null;
	    anInt2983++;
	    return (String.valueOf(arg1 >> -800742600 & 0xff) + "."
		    + ((0xff2585 & arg1) >> -92504400) + "."
		    + ((arg1 & 0xff35) >> -659346872) + "." + (arg1 & 0xff));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("un.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2730(boolean arg0, int arg1, Class131_Sub33 arg2,
				  boolean arg3) {
	try {
	    anInt2985++;
	    int i = arg2.anInt4556;
	    int i_0_ = (int) arg2.aLong1791;
	    arg2.method1355((byte) 116);
	    if (arg0)
		RuntimeException_Sub1.method2832(i, 0);
	    Class131_Sub2_Sub24.method1585((byte) 98, i);
	    if (arg1 != 25697)
		method2732(-24);
	    Class173 class173 = Class190.method2615(i_0_, -87);
	    if (class173 != null)
		Class23_Sub4_Sub4.method383(-101, class173);
	    Class55.method619(-85);
	    if (!arg3 && (Class187.anInt2674 ^ 0xffffffff) != 0)
		Class9.method185(Class187.anInt2674, 4095, 1);
	    Class20 class20 = new Class20(Class83.aClass180_1096);
	    for (Class131_Sub33 class131_sub33
		     = (Class131_Sub33) class20.method260(24056);
		 class131_sub33 != null;
		 class131_sub33
		     = (Class131_Sub33) class20.method259((byte) 93)) {
		if (!class131_sub33.method1352(true)) {
		    class131_sub33 = (Class131_Sub33) class20.method260(24056);
		    if (class131_sub33 == null)
			break;
		}
		if (class131_sub33.anInt4555 == 3) {
		    int i_1_ = (int) class131_sub33.aLong1791;
		    if (i == i_1_ >>> -763547920)
			method2730(true, 25697, class131_sub33, arg3);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("un.A(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method2731(boolean arg0, byte arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    Class154.anInt2046 = arg4;
	    Class131_Sub2_Sub7.anInt5647 = arg5;
	    Class23_Sub2_Sub1.anInt4985 = arg2;
	    Class1_Sub3.anInt3536 = arg6;
	    int i = 58 / ((arg1 - -55) / 50);
	    Class131_Sub38.anInt4617 = arg3;
	    anInt2981++;
	    if (arg0 && Class131_Sub2_Sub7.anInt5647 >= 100) {
		Class2.anInt84 = 64 + Class154.anInt2046 * 128;
		Class57.anInt753 = 128 * Class1_Sub3.anInt3536 + 64;
		Class87.anInt1140
		    = (RuntimeException_Sub1.method2833(Class57.anInt753, -29,
							Class2.anInt84,
							Class29.anInt300)
		       + -Class131_Sub38.anInt4617);
	    }
	    Class131_Sub2_Sub34.anInt6035 = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("un.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method2732(int arg0) {
	aClass152_2978 = null;
	aClass137_2980 = null;
	aClass44_2982 = null;
	if (arg0 != 25106)
	    anInt2979 = 108;
    }
    
    public static int method2733(int arg0) {
	try {
	    anInt2984++;
	    Class130 class130 = Class183_Sub1.aClass130_4960;
	    boolean bool = false;
	    if ((Stream.anInt4299 ^ 0xffffffff) != -1) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		bool = true;
		class130
		    = Class130.method1157(0, -9426, null, canvas, 0, null);
	    }
	    long l = Class208.method2749(arg0 ^ 0xf0b7);
	    int i = 0;
	    if (arg0 != -65536)
		method2730(true, 54, null, false);
	    for (/**/; (i ^ 0xffffffff) > -10001; i++)
		class130.method1219(5, 10, 75, 50, 15, 90, -65536, -65536,
				    -65536, 1);
	    int i_2_ = (int) (-l + Class208.method2749(-3913));
	    class130.method1201(100, 100, 0, 0, -16777216, 120);
	    if (bool)
		class130.method1167(-31586);
	    return i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"un.C(" + arg0 + ')');
	}
    }
}
