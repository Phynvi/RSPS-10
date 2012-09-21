/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63
{
    public int anInt792;
    public static Interface4 anInterface4_793;
    public int anInt794 = -1;
    public static int anInt795;
    public static int anInt796;
    public int[] anIntArray797;
    public static int anInt798;
    public static int anInt799;
    public static short[][] aShortArrayArray800;
    public static int anInt801;
    public static int[][] anIntArrayArray802;
    public static int anInt803;
    public static short aShort804 = 205;
    public static int anInt805;
    public static Class140 aClass140_806;
    public static int anInt807;
    
    public static int method658(int arg0, String arg1) {
	try {
	    anInt796++;
	    if (arg1 == null)
		return -1;
	    for (int i = arg0; Class33.anInt469 > i; i++) {
		if (arg1.equalsIgnoreCase(Class23_Sub2.aStringArray3707[i]))
		    return i;
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method659(boolean arg0) {
	try {
	    if (arg0 != false)
		anInterface4_793 = null;
	    aShortArrayArray800 = null;
	    aClass140_806 = null;
	    anInterface4_793 = null;
	    anIntArrayArray802 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gg.C(" + arg0 + ')');
	}
    }
    
    public void method660(int arg0, Stream arg1, int arg2) {
	try {
	    int i = -9 / ((arg0 - 63) / 47);
	    anInt805++;
	    for (;;) {
		int i_0_ = arg1.readUnsignedByte(-42);
		if (i_0_ == 0)
		    break;
		method663(i_0_, arg1, arg2, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static boolean method661(char arg0, int arg1) {
	try {
	    anInt803++;
	    if (arg1 != 18768)
		return false;
	    if (((arg0 ^ 0xffffffff) > -49 || (arg0 ^ 0xffffffff) < -58)
		&& (arg0 < 65 || (arg0 ^ 0xffffffff) < -91)
		&& ((arg0 ^ 0xffffffff) > -98 || arg0 > 122))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class23_Sub4 method662(int arg0, int arg1, int arg2,
					 Class arg3) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 == null)
	    return null;
	for (Class82 class82 = class147.aClass82_1958; class82 != null;
	     class82 = class82.aClass82_1086) {
	    Class23_Sub4 class23_sub4 = class82.aClass23_Sub4_1080;
	    if (arg3.isAssignableFrom(class23_sub4.getClass())
		&& class23_sub4.aShort3745 == arg1
		&& class23_sub4.aShort3737 == arg2)
		return class23_sub4;
	}
	return null;
    }
    
    public void method663(int arg0, Stream arg1, int arg2, int arg3) {
	try {
	    if ((arg0 ^ 0xffffffff) == -2)
		anInt792 = arg1.readUnsignedShort(8104);
	    else if (arg0 == 2) {
		anIntArray797 = new int[arg1.readUnsignedByte(-58)];
		for (int i = 0; anIntArray797.length > i; i++)
		    anIntArray797[i] = arg1.readUnsignedShort(8104);
	    } else if ((arg0 ^ 0xffffffff) == -4)
		anInt794 = arg1.readUnsignedByte(-92);
	    if (arg3 == 0)
		anInt799++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method664(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 != null) {
	    if (class147.aClass23_Sub5_1973 != null)
		class147.aClass23_Sub5_1973 = null;
	}
    }
    
    public static void method665(int arg0, int arg1, int arg2) {
	try {
	    anInt795++;
	    Class151 class151 = Class202.method2722(arg1, 0);
	    int i = class151.anInt2018;
	    int i_1_ = class151.anInt2024;
	    int i_2_ = class151.anInt2021;
	    int i_3_ = Class131_Sub38.anIntArray4612[-i_1_ + i_2_];
	    if (arg0 < 0 || (i_3_ ^ 0xffffffff) > (arg0 ^ 0xffffffff))
		arg0 = 0;
	    i_3_ <<= i_1_;
	    if (arg2 != 4)
		method662(16, 1, -8, null);
	    Class131_Sub41_Sub10.method1997(i, -4791,
					    (i_3_ & arg0 << i_1_
					     | ((i_3_ ^ 0xffffffff)
						& (Class131_Sub2_Sub13
						   .anIntArray5735[i]))));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method666(int arg0) {
	try {
	    if (arg0 != 2878)
		method666(-112);
	    anInt801++;
	    if (Class154.aBoolean2047) {
		Class173 class173
		    = InputStream_Sub1.method87(Class98.anInt1306,
						Class88.anInt1161,
						(byte) -111);
		if (class173 != null && class173.anObjectArray2371 != null) {
		    Class131_Sub14 class131_sub14 = new Class131_Sub14();
		    class131_sub14.anObjectArray4281
			= class173.anObjectArray2371;
		    class131_sub14.aClass173_4276 = class173;
		    Class168.method2437(class131_sub14);
		}
		Class154.aBoolean2047 = false;
		Class23_Sub5_Sub2.anInt5048 = -1;
		Class23_Sub4_Sub4.method383(-117, class173);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gg.H(" + arg0 + ')');
	}
    }
    
    public static int method667(int arg0, int arg1) {
	try {
	    anInt798++;
	    Class151 class151 = Class202.method2722(arg0, 0);
	    int i = class151.anInt2018;
	    int i_4_ = class151.anInt2024;
	    if (arg1 != -1)
		method667(-34, 22);
	    int i_5_ = class151.anInt2021;
	    int i_6_ = Class131_Sub38.anIntArray4612[i_5_ - i_4_];
	    return Class131_Sub2_Sub13.anIntArray5735[i] >> i_4_ & i_6_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gg.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class63() {
	anInt792 = -1;
    }
    
    static {
	anIntArrayArray802
	    = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 },
			    { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 },
			    { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 },
			    { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 },
			    { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 },
			    { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	anInt807 = -1;
    }
}
