/* Class131_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class131_Sub37 extends Class131
{
    public static int anInt4592;
    public static int anInt4593;
    public static int anInt4594;
    public static int anInt4595;
    public static Class158 aClass158_4596;
    public static int anInt4597;
    public static int anInt4598;
    public static int anInt4599;
    public static int anInt4600;
    public int anInt4601;
    public int anInt4602;
    public static int anInt4603;
    public static int anInt4604;
    public static int anInt4605;
    public static int anInt4606;
    public static int anInt4607;
    public static String aString4608 = "Loading interfaces - ";
    public static int anInt4609;
    
    public static Class131_Sub41_Sub15 method1877(int arg0, int arg1, int arg2,
						  int arg3) {
	try {
	    anInt4597++;
	    int i = arg2 | arg0 << -1088535576;
	    Class131_Sub41_Sub15 class131_sub41_sub15
		= ((Class131_Sub41_Sub15)
		   Class204.aClass137_2980
		       .method2111(-12, (long) i << -1135446192));
	    if (class131_sub41_sub15 != null)
		return class131_sub41_sub15;
	    byte[] is = (Class160.aClass158_2133.method2358
			 (Class160.aClass158_2133.method2372((byte) -121, i),
			  arg3 + -1679818700));
	    if (is != null) {
		if (is.length <= 1)
		    return null;
		class131_sub41_sub15 = Class18.method231(is, -2);
		class131_sub41_sub15.anInt6354 = arg2;
		Class204.aClass137_2980.method2110(class131_sub41_sub15, false,
						   (long) i << -176777584);
		return class131_sub41_sub15;
	    }
	    i = arg2 | arg1 + 65536 << 1719100936;
	    class131_sub41_sub15
		= ((Class131_Sub41_Sub15)
		   Class204.aClass137_2980
		       .method2111(-12, (long) i << -1489056944));
	    if (class131_sub41_sub15 != null)
		return class131_sub41_sub15;
	    is = (Class160.aClass158_2133.method2358
		  (Class160.aClass158_2133.method2372((byte) 125, i),
		   arg3 ^ 0x641fff05));
	    if (is != null) {
		if ((is.length ^ 0xffffffff) >= -2)
		    return null;
		class131_sub41_sub15 = Class18.method231(is, -2);
		class131_sub41_sub15.anInt6354 = arg2;
		Class204.aClass137_2980.method2110(class131_sub41_sub15, false,
						   (long) i << -1502590576);
		return class131_sub41_sub15;
	    }
	    i = arg2 | 0xffff00;
	    class131_sub41_sub15
		= ((Class131_Sub41_Sub15)
		   Class204.aClass137_2980.method2111(-12,
						      (long) i << -619550000));
	    if (class131_sub41_sub15 != null)
		return class131_sub41_sub15;
	    is = (Class160.aClass158_2133.method2358
		  (Class160.aClass158_2133.method2372((byte) -47, i), -116));
	    if (is != null) {
		if ((is.length ^ 0xffffffff) >= -2)
		    return null;
		class131_sub41_sub15
		    = Class18.method231(is, arg3 ^ ~0x641fff51);
		class131_sub41_sub15.anInt6354 = arg2;
		Class204.aClass137_2980.method2110(class131_sub41_sub15, false,
						   (long) i << 1679818576);
		return class131_sub41_sub15;
	    }
	    if (arg3 != 1679818576)
		aClass158_4596 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("um.M(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static String method1878(int arg0, boolean arg1) {
	try {
	    anInt4595++;
	    if (arg1 != false)
		method1886(null, 108);
	    if ((arg0 ^ 0xffffffff) > -100001)
		return "<col=ffff00>" + arg0 + "</col>";
	    if (arg0 < 10000000)
		return ("<col=ffffff>" + arg0 / 1000 + Class88.aString1149
			+ "</col>");
	    return ("<col=00ff80>" + arg0 / 1000000
		    + Class131_Sub2_Sub11.aString5714 + "</col>");
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("um.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method1879(boolean arg0) {
	try {
	    anInt4593++;
	    if (arg0 != false)
		aClass158_4596 = null;
	    if (((0x2eaa42 & anInt4601) >> -1445214219 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.B(" + arg0 + ')');
	}
    }
    
    public boolean method1880(int arg0, byte arg1) {
	try {
	    anInt4598++;
	    if (arg1 > -101)
		aClass158_4596 = null;
	    if ((anInt4601 >> 1 + arg0 & 0x1 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("um.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method1881(int arg0) {
	try {
	    anInt4607++;
	    if (arg0 != -1)
		method1885((byte) -21);
	    if (((0x55f65fb5 & anInt4601) >> 1601172318 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.A(" + arg0 + ')');
	}
    }
    
    public boolean method1882(int arg0) {
	try {
	    int i = -24 % ((59 - arg0) / 41);
	    anInt4603++;
	    if (((anInt4601 & 0x1fa3c81f) >> -233371236 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.L(" + arg0 + ')');
	}
    }
    
    public boolean method1883(byte arg0) {
	try {
	    if (arg0 != 47)
		return true;
	    anInt4606++;
	    if ((0x1 & anInt4601 >> 111606079 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.F(" + arg0 + ')');
	}
    }
    
    public boolean method1884(int arg0) {
	try {
	    anInt4592++;
	    if (arg0 != -1)
		return true;
	    if ((0x1 & anInt4601 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.J(" + arg0 + ')');
	}
    }
    
    public boolean method1885(byte arg0) {
	try {
	    anInt4605++;
	    if (arg0 > -106)
		return false;
	    if ((0x1 & anInt4601 >> 1361505174 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.H(" + arg0 + ')');
	}
    }
    
    public static void method1886(Component arg0, int arg1) {
	try {
	    if (arg1 == 1023) {
		arg0.removeMouseListener(Class126.aClass201_1689);
		anInt4594++;
		arg0.removeMouseMotionListener(Class126.aClass201_1689);
		arg0.removeFocusListener(Class126.aClass201_1689);
		Class131_Sub41_Sub4.anInt6212 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("um.I("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method1887(int arg0) {
	try {
	    anInt4599++;
	    int i = -9 / ((arg0 - 44) / 53);
	    return (anInt4601 & 0x1f873d) >> 1483551026;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.N(" + arg0 + ')');
	}
    }
    
    public int method1888(byte arg0) {
	try {
	    int i = 72 % ((-6 - arg0) / 61);
	    anInt4600++;
	    return Class165.method2412(anInt4601, (byte) 113);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.K(" + arg0 + ')');
	}
    }
    
    public Class131_Sub37(int arg0, int arg1) {
	try {
	    anInt4601 = arg0;
	    anInt4602 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("um.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    public static void method1889(int arg0) {
	try {
	    synchronized (Class135.aClass214_1811) {
		Class135.aClass214_1811.method2775((byte) 56);
		if (arg0 <= 8)
		    method1878(-119, true);
	    }
	    anInt4604++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"um.E(" + arg0 + ')');
	}
    }
    
    public static void method1890(int arg0) {
	aClass158_4596 = null;
	aString4608 = null;
	if (arg0 != -1502590576)
	    method1877(-67, 52, 30, 105);
    }
}
