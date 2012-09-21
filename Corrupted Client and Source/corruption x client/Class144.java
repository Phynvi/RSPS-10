/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

public class Class144
{
    public static int anInt1912;
    public static byte[] aByteArray1913;
    public static int anInt1914 = 0;
    public static int anInt1915;
    public static short[] aShortArray1916;
    public static int anInt1917;
    public static int anInt1918;
    public static String aString1919;
    public static long[] aLongArray1920;
    public static int anInt1921;
    public static int anInt1922;
    /*synthetic*/ public static Class aClass1923;
    
    public static int method2152(int arg0, byte arg1) {
	try {
	    anInt1921++;
	    if (arg1 < 74)
		aByteArray1913 = null;
	    int i = arg0 >>> -1693461887;
	    i |= i >>> -1241031359;
	    i |= i >>> -416659998;
	    i |= i >>> -1462199260;
	    i |= i >>> 1755493704;
	    i |= i >>> 1438889456;
	    return (i ^ 0xffffffff) & arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pc.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2153(byte arg0) {
	anInt1922++;
	do {
	    try {
		Method method
		    = (aClass1923 != null ? aClass1923
		       : (aClass1923 = method2158("java.lang.Runtime")))
			  .getMethod("availableProcessors", new Class[0]);
		if (method != null) {
		    try {
			Runtime runtime = Runtime.getRuntime();
			Integer integer
			    = (Integer) method.invoke(runtime, (Object[]) null);
			Class131_Sub8_Sub1.anInt6111 = integer.intValue();
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		if (arg0 < -50)
		    break;
		aByteArray1913 = null;
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method2154(byte arg0) {
	try {
	    aLongArray1920 = null;
	    aString1919 = null;
	    aByteArray1913 = null;
	    if (arg0 != -117)
		method2156(127, -111, -8, -29, 42, 16);
	    aShortArray1916 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pc.D(" + arg0 + ')');
	}
    }
    
    public static boolean method2155(int arg0) {
	try {
	    if (arg0 != 14848)
		return true;
	    anInt1915++;
	    if ((Class1_Sub7.anInt3581 ^ 0xffffffff) == -1
		&& (Class56.anInt745 ^ 0xffffffff) > -3)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pc.A(" + arg0 + ')');
	}
    }
    
    public static void method2156(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    anInt1917++;
	    int i = (arg1 - 32) * arg1 / arg3;
	    if ((i ^ 0xffffffff) > -9)
		i = 8;
	    int i_0_ = (arg1 + -32 - i) * arg5 / (arg3 - arg1);
	    Class131_Sub2_Sub30.aClass152Array5994[0].method2211(arg0, arg2);
	    Class131_Sub2_Sub30.aClass152Array5994[1]
		.method2211(arg0, -16 + arg2 + arg1);
	    if (arg4 >= -53)
		aByteArray1913 = null;
	    Class183_Sub1.aClass130_4960.method1201(16, -32 + arg1, arg0,
						    arg2 + 16,
						    Class55.anInt718, 77);
	    Class183_Sub1.aClass130_4960.method1201(16, i, arg0,
						    i_0_ + 16 + arg2,
						    Class131_Sub4.anInt4128,
						    83);
	    Class183_Sub1.aClass130_4960.method1253(true, i_0_ + (arg2 - -16),
						    Class110_Sub4.anInt3938,
						    arg0, i);
	    Class183_Sub1.aClass130_4960.method1253(true, arg2 - (-16 + -i_0_),
						    Class110_Sub4.anInt3938,
						    1 + arg0, i);
	    Class183_Sub1.aClass130_4960.method1225(arg0,
						    Class110_Sub4.anInt3938,
						    (byte) -96, 16,
						    i_0_ + (arg2 + 16));
	    Class183_Sub1.aClass130_4960.method1225(arg0,
						    Class110_Sub4.anInt3938,
						    (byte) -94, 16,
						    17 + arg2 + i_0_);
	    Class183_Sub1.aClass130_4960.method1253(true, arg2 - -16 + i_0_,
						    (Class131_Sub41_Sub9
						     .anInt6278),
						    15 + arg0, i);
	    Class183_Sub1.aClass130_4960.method1253(true, arg2 - (-17 - i_0_),
						    (Class131_Sub41_Sub9
						     .anInt6278),
						    arg0 - -14, -1 + i);
	    Class183_Sub1.aClass130_4960.method1225(arg0,
						    (Class131_Sub41_Sub9
						     .anInt6278),
						    (byte) -123, 16,
						    arg2 - -15 - (-i_0_ + -i));
	    Class183_Sub1.aClass130_4960.method1225(arg0 - -1,
						    (Class131_Sub41_Sub9
						     .anInt6278),
						    (byte) -127, 15,
						    arg2 - (-14 + -i_0_ - i));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pc.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method2157(byte arg0, Class187 arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt1918++;
	    if (arg0 <= 82)
		aShortArray1916 = null;
	    for (Class131_Sub19 class131_sub19
		     = (Class131_Sub19) Class169.aClass119_2266.method1007(0);
		 class131_sub19 != null;
		 class131_sub19 = ((Class131_Sub19)
				   Class169.aClass119_2266.method1014(0))) {
		if (class131_sub19.anInt4392 == arg4
		    && 128 * arg2 == class131_sub19.anInt4415
		    && class131_sub19.anInt4407 == arg3 * 128
		    && ((arg1.anInt2713 ^ 0xffffffff)
			== (class131_sub19.aClass187_4416.anInt2713
			    ^ 0xffffffff))) {
		    if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
			Class78.aClass131_Sub1_Sub3_1057.method1441
			    (class131_sub19.aClass131_Sub1_Sub2_4393);
			class131_sub19.aClass131_Sub1_Sub2_4393 = null;
		    }
		    if (class131_sub19.aClass131_Sub1_Sub2_4391 != null) {
			Class78.aClass131_Sub1_Sub3_1057.method1441
			    (class131_sub19.aClass131_Sub1_Sub2_4391);
			class131_sub19.aClass131_Sub1_Sub2_4391 = null;
		    }
		    class131_sub19.method1355((byte) 124);
		    break;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pc.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method2158(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aByteArray1913 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	aString1919 = "Face here";
	aLongArray1920 = new long[32];
    }
}
