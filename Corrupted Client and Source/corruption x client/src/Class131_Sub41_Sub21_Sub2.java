/* Class131_Sub41_Sub21_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub21_Sub2 extends Class131_Sub41_Sub21
{
    public static int anInt6584;
    public int anInt6585;
    public static int anInt6586;
    public static Class119 aClass119_6587;
    public static int anInt6588;
    public static int anInt6589;
    public Class85 aClass85_6590;
    public static int anInt6591;
    public static int[][] anIntArrayArray6592
	= { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
	    { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 },
	    { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 },
	    { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    public static String aString6593 = "Choose Option";
    public static int anInt6594;
    public static int anInt6595;
    public byte[] aByteArray6596;
    
    public static void method2081(boolean arg0) {
	try {
	    aString6593 = null;
	    if (arg0 != true)
		aString6593 = null;
	    anIntArrayArray6592 = null;
	    aClass119_6587 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lq.D(" + arg0 + ')');
	}
    }
    
    public static void method2082(Class158 arg0, Class158 arg1, byte arg2,
				  boolean arg3) {
	try {
	    Class131_Sub17.aClass158_4376 = arg0;
	    Class131_Sub2_Sub34.aBoolean6033 = arg3;
	    if (arg2 > -40)
		method2085(-94, 62, 115);
	    anInt6588++;
	    Class77.aClass158_1047 = arg1;
	    int i = -1 + Class131_Sub17.aClass158_4376.method2361((byte) -126);
	    Class131_Sub14.anInt4289
		= (256 * i
		   + Class131_Sub17.aClass158_4376.method2368(i, (byte) -72));
	    Class125.aStringArray1637
		= new String[] { null, null, Class33.aString457, null, null };
	    Class214.aStringArray3147
		= new String[] { null, null, null, null,
				 Class23_Sub2_Sub2.aString5195 };
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lq.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public byte[] method2073(int arg0) {
	try {
	    anInt6589++;
	    if (aBoolean6440)
		throw new RuntimeException();
	    if (arg0 != 6)
		return null;
	    return aByteArray6596;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lq.C(" + arg0 + ')');
	}
    }
    
    public int method2075(int arg0) {
	try {
	    anInt6591++;
	    if (arg0 != 2)
		return -25;
	    if (aBoolean6440)
		return 0;
	    return 100;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lq.A(" + arg0 + ')');
	}
    }
    
    public static void method2083(int arg0, int arg1) {
	try {
	    int i = -125 % ((arg0 - -14) / 39);
	    synchronized (Class169.aClass214_2267) {
		Class169.aClass214_2267.method2786(0, arg1);
	    }
	    anInt6584++;
	    synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		Class131_Sub41_Sub5.aClass214_6226.method2786(0, arg1);
	    }
	    synchronized (Class23_Sub3_Sub1.aClass103_5226) {
		Class23_Sub3_Sub1.aClass103_5226.method908(arg1, (byte) 12);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lq.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method2084(int arg0) {
	try {
	    if (arg0 != -96)
		method2084(-124);
	    anInt6594++;
	    return 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lq.F(" + arg0 + ')');
	}
    }
    
    public static int method2085(int arg0, int arg1, int arg2) {
	try {
	    anInt6586++;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(arg0 ^ 0x31,
							       (long) arg1));
	    if (class131_sub13 == null)
		return 0;
	    if (arg0 > arg2 || class131_sub13.anIntArray4267.length <= arg2)
		return 0;
	    return class131_sub13.anIntArray4267[arg2];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lq.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	aClass119_6587 = new Class119();
    }
}
