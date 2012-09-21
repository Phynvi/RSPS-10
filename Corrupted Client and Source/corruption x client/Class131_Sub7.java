/* Class131_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub7 extends Class131
{
    public static int anInt4165 = 0;
    public byte[][][] aByteArrayArrayArray4166;
    public int[] anIntArray4167;
    public static String aString4168;
    public static int[] anIntArray4169 = new int[256];
    public int[] anIntArray4170;
    public static int anInt4171;
    public int anInt4172;
    public static int anInt4173;
    public int anInt4174;
    public static int anInt4175;
    public static int anInt4176;
    public Class139[] aClass139Array4177;
    public static int anInt4178;
    public Class139[] aClass139Array4179;
    public static Class214 aClass214_4180;
    public int[] anIntArray4181;
    public static int anInt4182;
    
    public static void method1665(int arg0) {
	try {
	    int i = 92 / ((84 - arg0) / 39);
	    anIntArray4169 = null;
	    aString4168 = null;
	    aClass214_4180 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"es.E(" + arg0 + ')');
	}
    }
    
    public static void method1666(int arg0, int arg1, int arg2) {
	try {
	    anInt4178++;
	    int i = 117 / ((61 - arg2) / 41);
	    Class220.aClass214_3212 = new Class214(arg0);
	    Class131_Sub2.aClass214_4098 = new Class214(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("es.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1667(int arg0) {
	if (arg0 != 19560)
	    method1669(-37, -56, false, true, -24);
	anInt4176++;
	if (Class31.aClass139_442 != null) {
	    if (Class31.aClass139_442.anInt1864 == 1)
		Class31.aClass139_442 = null;
	    else if ((Class31.aClass139_442.anInt1864 ^ 0xffffffff) == -3) {
		Class131_Sub2_Sub2.method1481(Class131_Sub41_Sub19.aString6408,
					      Class91.aSignLink_1178,
					      (byte) -124, 2);
		Class31.aClass139_442 = null;
	    }
	}
    }
    
    public static void method1668(int arg0, int arg1) {
	try {
	    anInt4175++;
	    Class156.aClass214_2070.method2786(arg0 ^ arg0, arg1);
	    Class100.aClass214_1317.method2786(0, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("es.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class131_Sub33 method1669(int arg0, int arg1, boolean arg2,
					    boolean arg3, int arg4) {
	try {
	    anInt4171++;
	    Class131_Sub33 class131_sub33 = new Class131_Sub33();
	    class131_sub33.anInt4555 = arg1;
	    class131_sub33.anInt4556 = arg0;
	    Class83.aClass180_1096.method2523(arg3, (long) arg4,
					      class131_sub33);
	    Class121.method1040((byte) -69, arg0);
	    Class173 class173 = Class190.method2615(arg4, -24);
	    if (class173 != null)
		Class23_Sub4_Sub4.method383(-96, class173);
	    if (Class164.aClass173_2193 != null) {
		Class23_Sub4_Sub4.method383(-100, Class164.aClass173_2193);
		Class164.aClass173_2193 = null;
	    }
	    Class55.method619(124);
	    if (class173 != null)
		Class89.method838(73, class173, !arg2);
	    if (!arg2)
		Class168.method2433(arg0);
	    if (!arg2 && (Class187.anInt2674 ^ 0xffffffff) != 0)
		Class9.method185(Class187.anInt2674, 4095, 1);
	    return class131_sub33;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("es.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1670(Class75 arg0, boolean arg1) {
	try {
	    anInt4182++;
	    if (arg1 != true)
		method1667(-22);
	    Class131_Sub41_Sub7.aClass75_6251 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("es.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	aString4168 = "green:";
	for (int i = 0; i < 256; i++) {
	    int i_0_ = i;
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -9; i_1_++) {
		if ((0x1 & i_0_) != 1)
		    i_0_ >>>= 1;
		else
		    i_0_ = i_0_ >>> 2115567137 ^ ~0x12477cdf;
	    }
	    anIntArray4169[i] = i_0_;
	}
	aClass214_4180 = new Class214(20);
    }
}
