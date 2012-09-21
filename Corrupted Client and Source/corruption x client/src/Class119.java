/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class119
{
    public static int anInt1552;
    public Class131 aClass131_1553 = new Class131();
    public static int anInt1554;
    public static int anInt1555;
    public static int[] anIntArray1556 = new int[50];
    public static int anInt1557;
    public static int anInt1558;
    public static boolean aBoolean1559 = false;
    public static int anInt1560;
    public static int anInt1561;
    public Class131 aClass131_1562;
    public static int anInt1563;
    public static int anInt1564;
    public static int anInt1565;
    public static int anInt1566;
    public static boolean[] aBooleanArray1567 = new boolean[5];
    public static int anInt1568;
    public static int anInt1569;
    public static int anInt1570;
    
    public Class131 method1005(byte arg0) {
	try {
	    anInt1561++;
	    Class131 class131 = aClass131_1553.aClass131_1783;
	    if (aClass131_1553 == class131)
		return null;
	    class131.method1355((byte) 125);
	    if (arg0 != 93)
		method1013('A', -42);
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.B(" + arg0 + ')');
	}
    }
    
    public Class131 method1006(int arg0) {
	try {
	    anInt1565++;
	    if (arg0 != -5525)
		return null;
	    Class131 class131 = aClass131_1562;
	    if (class131 == aClass131_1553) {
		aClass131_1562 = null;
		return null;
	    }
	    aClass131_1562 = class131.aClass131_1786;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.N(" + arg0 + ')');
	}
    }
    
    public Class131 method1007(int arg0) {
	try {
	    anInt1563++;
	    Class131 class131 = aClass131_1553.aClass131_1783;
	    if (class131 == aClass131_1553) {
		aClass131_1562 = null;
		return null;
	    }
	    aClass131_1562 = class131.aClass131_1783;
	    if (arg0 != 0)
		return null;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.G(" + arg0 + ')');
	}
    }
    
    public static void method1008(int arg0) {
	try {
	    anIntArray1556 = null;
	    if (arg0 != 0)
		method1013('>', -57);
	    aBooleanArray1567 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.L(" + arg0 + ')');
	}
    }
    
    public void method1009(int arg0, Class119 arg1) {
	try {
	    anInt1554++;
	    method1011(arg1, aClass131_1553.aClass131_1783, 121);
	    int i = 4 % ((arg0 - 58) / 46);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mi.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method1010(int arg0) {
	try {
	    anInt1564++;
	    int i = 0;
	    Class131 class131 = aClass131_1553.aClass131_1783;
	    int i_0_ = -32 / ((arg0 - -23) / 55);
	    for (/**/; class131 != aClass131_1553;
		 class131 = class131.aClass131_1783)
		i++;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.H(" + arg0 + ')');
	}
    }
    
    public void method1011(Class119 arg0, Class131 arg1, int arg2) {
	do {
	    try {
		anInt1560++;
		Class131 class131 = aClass131_1553.aClass131_1786;
		aClass131_1553.aClass131_1786 = arg1.aClass131_1786;
		arg1.aClass131_1786.aClass131_1783 = aClass131_1553;
		if (arg2 <= 115)
		    anIntArray1556 = null;
		if (arg1 == aClass131_1553)
		    break;
		arg1.aClass131_1786 = arg0.aClass131_1553.aClass131_1786;
		arg1.aClass131_1786.aClass131_1783 = arg1;
		arg0.aClass131_1553.aClass131_1786 = class131;
		class131.aClass131_1783 = arg0.aClass131_1553;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("mi.E("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method1012(int arg0) {
	try {
	    anInt1570++;
	    if (arg0 != 0)
		method1014(-74);
	    for (;;) {
		Class131 class131 = aClass131_1553.aClass131_1783;
		if (class131 == aClass131_1553)
		    break;
		class131.method1355((byte) 123);
	    }
	    aClass131_1562 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.O(" + arg0 + ')');
	}
    }
    
    public static boolean method1013(char arg0, int arg1) {
	try {
	    anInt1566++;
	    if (Character.isISOControl(arg0))
		return false;
	    if (Class63.method661(arg0, 18768))
		return true;
	    char[] cs = Class1.aCharArray74;
	    for (int i = 0; i < cs.length; i++) {
		char c = cs[i];
		if (arg0 == c)
		    return true;
	    }
	    char[] cs_1_ = Class131_Sub2_Sub3.aCharArray5592;
	    for (int i = arg1; i < cs_1_.length; i++) {
		char c = cs_1_[i];
		if (c == arg0)
		    return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mi.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131 method1014(int arg0) {
	try {
	    anInt1555++;
	    if (arg0 != 0)
		return null;
	    Class131 class131 = aClass131_1562;
	    if (aClass131_1553 == class131) {
		aClass131_1562 = null;
		return null;
	    }
	    aClass131_1562 = class131.aClass131_1783;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.M(" + arg0 + ')');
	}
    }
    
    public boolean method1015(int arg0) {
	try {
	    anInt1557++;
	    int i = 97 % ((arg0 - 72) / 48);
	    if (aClass131_1553 != aClass131_1553.aClass131_1783)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.D(" + arg0 + ')');
	}
    }
    
    public Class119() {
	try {
	    aClass131_1553.aClass131_1786 = aClass131_1553;
	    aClass131_1553.aClass131_1783 = aClass131_1553;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.<init>(" + ')');
	}
    }
    
    public void method1016(Class131 arg0, int arg1) {
	try {
	    anInt1552++;
	    if (arg1 != 0)
		anIntArray1556 = null;
	    if (arg0.aClass131_1786 != null)
		arg0.method1355((byte) 126);
	    arg0.aClass131_1786 = aClass131_1553;
	    arg0.aClass131_1783 = aClass131_1553.aClass131_1783;
	    arg0.aClass131_1786.aClass131_1783 = arg0;
	    arg0.aClass131_1783.aClass131_1786 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mi.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class131 method1017(int arg0) {
	try {
	    if (arg0 != 0)
		return null;
	    anInt1558++;
	    Class131 class131 = aClass131_1553.aClass131_1786;
	    if (class131 == aClass131_1553) {
		aClass131_1562 = null;
		return null;
	    }
	    aClass131_1562 = class131.aClass131_1786;
	    return class131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.K(" + arg0 + ')');
	}
    }
    
    public void method1018(byte arg0, Class131 arg1) {
	try {
	    if (arg1.aClass131_1786 != null)
		arg1.method1355((byte) 123);
	    if (arg0 <= -119) {
		anInt1569++;
		arg1.aClass131_1783 = aClass131_1553;
		arg1.aClass131_1786 = aClass131_1553.aClass131_1786;
		arg1.aClass131_1786.aClass131_1783 = arg1;
		arg1.aClass131_1783.aClass131_1786 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mi.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1019(int arg0) {
	try {
	    anInt1568++;
	    int i = arg0;
	    for (int i_2_ = 0; Class131_Sub41_Sub11_Sub1.anInt6546 > i_2_;
		 i_2_++) {
		for (int i_3_ = 0; Class131_Sub2_Sub26.anInt5931 > i_3_;
		     i_3_++) {
		    if (Class215.method2805(i, true,
					    (Class131_Sub2_Sub29
					     .aClass147ArrayArrayArray5972),
					    -27508, i_3_, i_2_))
			i++;
		    if (i >= 512)
			return;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mi.J(" + arg0 + ')');
	}
    }
}
