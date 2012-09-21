/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class110
{
    public int anInt1425;
    public static int anInt1426;
    public static String aString1427 = "scroll:";
    public int anInt1428;
    public static int anInt1429;
    public static int anInt1430;
    public static int anInt1431 = 0;
    public int anInt1432;
    public static int anInt1433 = -1;
    
    public static int method933(Class128_Sub1 arg0, boolean arg1, int arg2,
				int arg3, Class128_Sub1 arg4, int arg5,
				boolean arg6) {
	try {
	    anInt1426++;
	    int i = Class20.method257(arg1, arg3, arg0, true, arg4);
	    if (i != 0) {
		if (!arg1)
		    return i;
		return -i;
	    }
	    if (arg5 != -30906)
		method939((byte) 5);
	    if ((arg2 ^ 0xffffffff) == 0)
		return 0;
	    int i_0_ = Class20.method257(arg6, arg2, arg0, true, arg4);
	    if (!arg6)
		return i_0_;
	    return -i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("li.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ',' + arg6
						 + ')'));
	}
    }
    
    public abstract void method934(int i, int i_1_, byte i_2_);
    
    public static void method935(byte arg0) {
	try {
	    if (arg0 > -113)
		method935((byte) 90);
	    aString1427 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"li.B(" + arg0 + ')');
	}
    }
    
    public abstract void method936(int i, boolean bool, int i_3_);
    
    public static void method937(int arg0, Class158 arg1) {
	try {
	    int i = -13 / ((arg0 - -74) / 50);
	    anInt1429++;
	    Class98.aClass158_1296 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("li.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public abstract void method938(int i, int i_4_, int i_5_);
    
    public static void method939(byte arg0) {
	do {
	    try {
		anInt1430++;
		synchronized (Class131_Sub31.aClass214_4545) {
		    Class131_Sub31.aClass214_4545.method2783(-105);
		}
		if (arg0 == 86)
		    break;
		method939((byte) 118);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "li.E(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public Class110(int arg0, int arg1, int arg2) {
	try {
	    anInt1432 = arg0;
	    anInt1428 = arg1;
	    anInt1425 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("li.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ')'));
	}
    }
}
