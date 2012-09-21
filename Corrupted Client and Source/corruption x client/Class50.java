/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50
{
    public static int anInt656;
    public static int anInt657 = 0;
    public static int anInt658;
    public static int anInt659;
    public static int anInt660;
    public static int anInt661;
    public static int anInt662;
    public static Class181 aClass181_663 = new Class181(8);
    public static int anInt664;
    public static Class180 aClass180_665 = new Class180(128);
    public static int anInt666;
    public Class1 aClass1_667 = new Class1();
    public static int anInt668;
    public Class1 aClass1_669;
    
    public static void method581(int arg0) {
	try {
	    if (arg0 != 0)
		method581(35);
	    aClass180_665 = null;
	    aClass181_663 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.B(" + arg0 + ')');
	}
    }
    
    public Class1 method582(int arg0) {
	try {
	    anInt659++;
	    Class1 class1 = aClass1_667.aClass1_80;
	    if (arg0 != 128)
		anInt657 = -111;
	    if (class1 == aClass1_667) {
		aClass1_669 = null;
		return null;
	    }
	    aClass1_669 = class1.aClass1_80;
	    return class1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.D(" + arg0 + ')');
	}
    }
    
    public boolean method583(int arg0) {
	try {
	    if (arg0 != 128)
		aClass180_665 = null;
	    anInt660++;
	    if (aClass1_667 != aClass1_667.aClass1_78)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.G(" + arg0 + ')');
	}
    }
    
    public void method584(Class1 arg0, byte arg1) {
	try {
	    if (arg0.aClass1_80 != null)
		arg0.method95((byte) 71);
	    anInt661++;
	    if (arg1 >= -109)
		aClass1_667 = null;
	    arg0.aClass1_78 = aClass1_667;
	    arg0.aClass1_80 = aClass1_667.aClass1_80;
	    arg0.aClass1_80.aClass1_78 = arg0;
	    arg0.aClass1_78.aClass1_80 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ep.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method585(int arg0) {
	try {
	    anInt664++;
	    int i = 0;
	    if (arg0 != 18337)
		return -75;
	    Class1 class1 = aClass1_667.aClass1_78;
	    while (class1 != aClass1_667) {
		class1 = class1.aClass1_78;
		i++;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.I(" + arg0 + ')');
	}
    }
    
    public Class1 method586(byte arg0) {
	try {
	    anInt658++;
	    Class1 class1 = aClass1_667.aClass1_78;
	    if (arg0 != 42)
		return null;
	    if (aClass1_667 == class1) {
		aClass1_669 = null;
		return null;
	    }
	    aClass1_669 = class1.aClass1_78;
	    return class1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.H(" + arg0 + ')');
	}
    }
    
    public void method587(int arg0) {
	anInt656++;
	for (;;) {
	    Class1 class1 = aClass1_667.aClass1_78;
	    if (class1 == aClass1_667)
		break;
	    class1.method95((byte) 71);
	}
	aClass1_669 = null;
	if (arg0 != 0)
	    aClass180_665 = null;
    }
    
    public Class1 method588(byte arg0) {
	try {
	    int i = -50 % ((31 - arg0) / 62);
	    anInt662++;
	    Class1 class1 = aClass1_667.aClass1_78;
	    if (class1 == aClass1_667)
		return null;
	    class1.method95((byte) 71);
	    return class1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.C(" + arg0 + ')');
	}
    }
    
    public Class1 method589(int arg0) {
	try {
	    int i = -79 / ((-28 - arg0) / 45);
	    anInt666++;
	    Class1 class1 = aClass1_669;
	    if (class1 == aClass1_667) {
		aClass1_669 = null;
		return null;
	    }
	    aClass1_669 = class1.aClass1_78;
	    return class1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.E(" + arg0 + ')');
	}
    }
    
    public Class50() {
	try {
	    aClass1_667.aClass1_78 = aClass1_667;
	    aClass1_667.aClass1_80 = aClass1_667;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ep.<init>(" + ')');
	}
    }
}
