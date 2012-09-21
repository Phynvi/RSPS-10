/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135
{
    public static Class214 aClass214_1811 = new Class214(64);
    public static int anInt1812;
    public static int anInt1813;
    public static Class158 aClass158_1814;
    public static int[] anIntArray1815;
    public static boolean aBoolean1816;
    public static int anInt1817;
    public static boolean aBoolean1818 = true;
    
    public static void method2100(int arg0) {
	try {
	    if (arg0 != 1)
		method2100(52);
	    aClass158_1814 = null;
	    anIntArray1815 = null;
	    aClass214_1811 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"oj.A(" + arg0 + ')');
	}
    }
    
    public static Class83 method2101(byte arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6) {
	try {
	    anInt1812++;
	    long l = ((long) arg6 * 475427L
		      ^ (97549L * (long) arg2 ^ 67481L * (long) arg5)
		      ^ (long) arg1 * 986053L ^ (long) arg4 * 32147369L
		      ^ 76724863L * (long) arg3);
	    Class83 class83
		= (Class83) Class151.aClass214_2016.method2780(126, l);
	    if (class83 != null)
		return class83;
	    if (arg0 != -17)
		aClass214_1811 = null;
	    class83 = Class214.aClass130_3128.method1181(arg5, arg2, arg6,
							 arg1, arg4, arg3);
	    Class151.aClass214_2016.method2773(true, class83, l);
	    return class83;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oj.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method2102(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 != 1)
	    aBoolean1818 = false;
	arg1 = Class212.anInt3112 * arg1 >> -1069075096;
	anInt1817++;
	if (arg1 != 0 && arg0 != -1) {
	    Class115.method978(arg0, 0, arg1, -118, false,
			       Class82.aClass158_1091);
	    Class23_Sub2.aBoolean3718 = true;
	}
    }
    
    public static void method2103(int arg0, int arg1) {
	try {
	    if (arg0 != -1)
		anIntArray1815 = null;
	    anInt1813++;
	    synchronized (Class182.aClass214_2603) {
		Class182.aClass214_2603.method2783(-83);
		Class182.aClass214_2603 = new Class214(arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oj.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aBoolean1816 = false;
    }
}
