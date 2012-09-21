/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class138
{
    public int[] anIntArray1849;
    public Class23_Sub4[] aClass23_Sub4Array1850 = new Class23_Sub4[100];
    public Class131_Sub8_Sub1[] aClass131_Sub8_Sub1Array1851;
    public int anInt1852;
    public static int anInt1853;
    public int[] anIntArray1854;
    public static int anInt1855;
    public static int anInt1856;
    public static int[] anIntArray1857
	= { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };
    public Object anObject1858;
    public static int anInt1859;
    public static int anInt1860;
    
    public static void method2119(boolean arg0) {
	anIntArray1857 = null;
	if (arg0 != false)
	    method2122('\uffbe', (byte) 105);
    }
    
    public static boolean method2120(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6, int arg7,
				     int arg8) {
	try {
	    if (arg3 != -11093)
		anInt1855 = -19;
	    anInt1859++;
	    if (arg2 >= arg1 + arg4
		|| (arg1 ^ 0xffffffff) <= (arg2 + arg6 ^ 0xffffffff))
		return false;
	    if ((arg0 ^ 0xffffffff) <= (arg8 - -arg7 ^ 0xffffffff)
		|| arg8 >= arg0 - -arg5)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oq.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ')'));
	}
    }
    
    public static void method2121(boolean arg0) {
	try {
	    anInt1853++;
	    if (Class33.anInt480 > 0)
		Class41.method512(2);
	    else {
		Class183.aClass33_2617 = Class128_Sub1.aClass33_4013;
		if (arg0 != true)
		    method2122('\u007f', (byte) 23);
		Class128_Sub1.aClass33_4013 = null;
		Class175.method2484(40, (byte) 112);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"oq.E(" + arg0 + ')');
	}
    }
    
    public static boolean method2122(char arg0, byte arg1) {
	try {
	    anInt1856++;
	    if (arg1 != 122)
		return true;
	    if (arg0 >= 32 && (arg0 ^ 0xffffffff) >= -127)
		return true;
	    if (arg0 >= 160 && (arg0 ^ 0xffffffff) >= -256)
		return true;
	    if (arg0 == 8364 || arg0 == 338 || (arg0 ^ 0xffffffff) == -8213
		|| (arg0 ^ 0xffffffff) == -340 || (arg0 ^ 0xffffffff) == -377)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oq.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class138() {
	anIntArray1849 = new int[3];
	aClass131_Sub8_Sub1Array1851 = new Class131_Sub8_Sub1[8];
	anIntArray1854 = new int[100];
    }
}
