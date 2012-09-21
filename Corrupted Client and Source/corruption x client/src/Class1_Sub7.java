/* Class1_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub7 extends Class1
{
    public static long aLong3580 = 0L;
    public static int anInt3581;
    public static int anInt3582;
    public static int anInt3583 = -1;
    public static int anInt3584;
    public static Class173 aClass173_3585;
    public static int anInt3586;
    public static int anInt3587;
    public static int anInt3588;
    public static Class158 aClass158_3589;
    public static int anInt3590;
    public Class1_Sub7 aClass1_Sub7_3591;
    public Class1_Sub7 aClass1_Sub7_3592;
    
    public static void method124(int arg0) {
	anInt3586++;
	synchronized (Class21.aClass214_239) {
	    Class21.aClass214_239.method2775((byte) 56);
	}
	if (arg0 != 5)
	    anInt3581 = -123;
    }
    
    public static void method125(int arg0) {
	try {
	    anInt3587++;
	    Class1_Sub7_Sub1.method132(5, -558);
	    Class22_Sub1.method286(5, (byte) -74);
	    Class23_Sub4.method327(5, -102);
	    Class131_Sub41_Sub14.method2027(5, 9);
	    Class131_Sub41_Sub5.method1954(false, 5);
	    Class131_Sub41_Sub21_Sub2.method2083(40, 5);
	    Class131_Sub2_Sub19.method1565(5, (byte) 50);
	    Class20.method254(5, (byte) -60);
	    Class66.method700((byte) -1, 5);
	    Class39.method503(5, (byte) 10);
	    Class125.method1095(5, 32);
	    Class131_Sub7.method1668(-12425, 5);
	    if (arg0 < 20)
		anInt3583 = 109;
	    Class46.method567(5, false);
	    Class131_Sub29.method1850(1311157154, 5);
	    Class23_Sub5_Sub2.method401((byte) 34, 5);
	    Class83.method801(5, 0);
	    Class130.method1198(true, 5);
	    Class23_Sub5.method394(5, 48);
	    Class131_Sub6.method1663(106, 5);
	    Class131_Sub41_Sub2.method1933(5, (byte) 103);
	    Class59.method644(50, -8);
	    Class155.method2336(5, (byte) 30);
	    Class179.method2509(7000, 5);
	    Class131_Sub31.aClass214_4542.method2786(0, 5);
	    Class33.aClass214_481.method2786(0, 5);
	    Class49.aClass214_651.method2786(0, 5);
	    Class131_Sub41_Sub13.aClass214_6324.method2786(0, 5);
	    Class168.aClass214_2263.method2786(0, 5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uc.K(" + arg0 + ')');
	}
    }
    
    public static int method126(int arg0, int arg1) {
	try {
	    anInt3582++;
	    if ((arg1 ^ 0xffffffff) > -1)
		return 0;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(-64,
							       (long) arg1));
	    if (class131_sub13 == null)
		return Class103.method907(5, arg1).anInt6249;
	    int i = 0;
	    for (int i_0_ = 0; class131_sub13.anIntArray4257.length > i_0_;
		 i_0_++) {
		if ((class131_sub13.anIntArray4257[i_0_] ^ 0xffffffff) == 0)
		    i++;
	    }
	    i += (Class103.method907(arg0, arg1).anInt6249
		  - class131_sub13.anIntArray4257.length);
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uc.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method127(int arg0) {
	try {
	    int i = -10 / ((61 - arg0) / 50);
	    aClass158_3589 = null;
	    aClass173_3585 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uc.M(" + arg0 + ')');
	}
    }
    
    public static Class110_Sub1 method128(int arg0, Stream arg1) {
	try {
	    if (arg0 < 36)
		return null;
	    anInt3584++;
	    return new Class110_Sub1(arg1.readSignedShort(1625554944),
				     arg1.readSignedShort(1625554944),
				     arg1.readSignedShort(1625554944),
				     arg1.readSignedShort(1625554944),
				     arg1.read3Bytes(false),
				     arg1.read3Bytes(false),
				     arg1.readUnsignedByte(-115));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uc.L(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method129(int arg0) {
	try {
	    anInt3588++;
	    if (aClass1_Sub7_3592 != null) {
		aClass1_Sub7_3592.aClass1_Sub7_3591 = aClass1_Sub7_3591;
		aClass1_Sub7_3591.aClass1_Sub7_3592 = aClass1_Sub7_3592;
		if (arg0 != 5)
		    aClass173_3585 = null;
		aClass1_Sub7_3591 = null;
		aClass1_Sub7_3592 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uc.F(" + arg0 + ')');
	}
    }
    
    static {
	anInt3581 = 0;
	anInt3590 = 0;
    }
}
