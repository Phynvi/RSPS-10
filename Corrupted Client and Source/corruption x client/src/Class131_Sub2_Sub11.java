/* Class131_Sub2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub11 extends Class131_Sub2
{
    public static int anInt5706;
    public static Class131_Sub8_Sub1[] aClass131_Sub8_Sub1Array5707;
    public static int anInt5708;
    public static int anInt5709;
    public static String aString5710 = "";
    public static String aString5711;
    public static int[] anIntArray5712 = new int[13];
    public static int anInt5713;
    public static String aString5714;
    public static int anInt5715;
    
    public static void method1521(byte arg0) {
	anInt5709++;
	Class23_Sub4.aClass173Array3736 = null;
	Class92.method850(0, Class187.anInt2674, -1, (byte) -35, 0,
			  Class131_Sub1_Sub1.anInt5499, Class218.anInt3201, 0,
			  0);
	if (Class23_Sub4.aClass173Array3736 != null) {
	    Class186.method2560(Class218.anInt3201, Class131_Sub2.anInt4089, 0,
				(Class23_Sub4_Sub1_Sub2.aClass173_6520
				 .anInt2321),
				0, Class23_Sub4.aClass173Array3736,
				Class131_Sub1_Sub1.anInt5499, 35, -1412584499,
				Class116.anInt1510);
	    Class23_Sub4.aClass173Array3736 = null;
	}
	if (arg0 > -126)
	    method1522(-104, -125, 62);
    }
    
    public Class131_Sub2_Sub11() {
	super(0, true);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5706++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 126);
	    if (aClass200_4087.aBoolean2927) {
		int i = Class1_Sub7_Sub1.anIntArray5206[arg1];
		for (int i_0_ = 0; i_0_ < Class131_Sub2_Sub7.anInt5637; i_0_++)
		    is[i_0_] = method1524(i, Class1_Sub4.anIntArray3551[i_0_],
					  60) % 4096;
	    }
	    if (arg0 != -11543)
		method1521((byte) -34);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ej.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method1522(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 > arg2) {
		int i = arg2;
		arg2 = arg1;
		arg1 = i;
	    }
	    anInt5708++;
	    if (arg0 != -1)
		method1523(-12);
	    int i;
	    for (/**/; (arg1 ^ 0xffffffff) != -1; arg1 = i) {
		i = arg2 % arg1;
		arg2 = arg1;
	    }
	    return arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ej.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1523(int arg0) {
	try {
	    int i = 82 / ((-57 - arg0) / 34);
	    aString5711 = null;
	    aString5714 = null;
	    aClass131_Sub8_Sub1Array5707 = null;
	    anIntArray5712 = null;
	    aString5710 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ej.F(" + arg0 + ')');
	}
    }
    
    public int method1524(int arg0, int arg1, int arg2) {
	try {
	    anInt5713++;
	    int i = arg1 + arg0 * 57;
	    if (arg2 < 6)
		aClass131_Sub8_Sub1Array5707 = null;
	    i ^= i << -1040636063;
	    return 4096 + -((0x7fffffff
			     & i * (789221 + i * i * 15731) - -1376312589)
			    / 262144);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ej.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	aString5711 = "M";
	aString5714 = "M";
    }
}
