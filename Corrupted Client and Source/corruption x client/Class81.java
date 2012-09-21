/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81
{
    public static int anInt1073;
    public static int anInt1074;
    public static boolean aBoolean1075 = false;
    public static int anInt1076;
    public static int anInt1077;
    public static int anInt1078;
    public static int anInt1079;
    
    public static int method788(int arg0, byte arg1) {
	try {
	    anInt1076++;
	    if ((arg0 ^ 0xffffffff) == -16711936)
		return -1;
	    if (arg1 != 106)
		return 46;
	    return Class187.method2583(74, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("iq.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method789(int arg0, int arg1) {
	try {
	    anInt1079++;
	    if (arg1 != Class131_Sub2_Sub20.anInt5839) {
		Class131_Sub41_Sub11_Sub1.anInt6546
		    = Class131_Sub2_Sub26.anInt5931
		    = Class182.anIntArray2602[arg1];
		Class183_Sub1.aClass130_4960.method1230
		    (50, (int) ((double) Class131_Sub41_Sub11_Sub1.anInt6546
				* 34.46));
		Class151.anIntArrayArray2025
		    = (new int[Class131_Sub41_Sub11_Sub1.anInt6546]
		       [Class131_Sub2_Sub26.anInt5931]);
		Class141.anIntArrayArrayArray1882
		    = (new int[4]
		       [Class131_Sub41_Sub11_Sub1.anInt6546 >> 1974316483]
		       [Class131_Sub2_Sub26.anInt5931 >> 1517515555]);
		Class131_Sub41_Sub19.anIntArrayArray6407
		    = (new int[Class131_Sub41_Sub11_Sub1.anInt6546]
		       [Class131_Sub2_Sub26.anInt5931]);
		for (int i = 0; i < 4; i++)
		    Class131_Sub2_Sub9.aClass19Array5682[i]
			= (RuntimeException_Sub1.method2834
			   (false, Class131_Sub41_Sub11_Sub1.anInt6546,
			    Class131_Sub2_Sub26.anInt5931));
		Class146.aByteArrayArrayArray1942
		    = (new byte[4][Class131_Sub41_Sub11_Sub1.anInt6546]
		       [Class131_Sub2_Sub26.anInt5931]);
		Class183_Sub1.method2544(Class131_Sub2_Sub26.anInt5931,
					 Class131_Sub41_Sub11_Sub1.anInt6546,
					 arg0, (byte) 106);
		Class23_Sub2_Sub2.method313((Class131_Sub2_Sub26.anInt5931
					     >> 2144237635),
					    (Class131_Sub41_Sub11_Sub1
					     .anInt6546) >> -1635147709,
					    123, Class183_Sub1.aClass130_4960);
		Class131_Sub2_Sub20.anInt5839 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("iq.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static synchronized byte[] method790(int arg0, int arg1) {
	try {
	    anInt1078++;
	    if (arg1 == 100 && Class110_Sub4.anInt3933 > 0) {
		byte[] is = (Class131_Sub20.aByteArrayArray4420
			     [--Class110_Sub4.anInt3933]);
		Class131_Sub20.aByteArrayArray4420[Class110_Sub4.anInt3933]
		    = null;
		return is;
	    }
	    if (arg0 != -23323)
		method788(-90, (byte) -56);
	    if (arg1 == 5000 && Class167.anInt2238 > 0) {
		byte[] is = Class53.aByteArrayArray702[--Class167.anInt2238];
		Class53.aByteArrayArray702[Class167.anInt2238] = null;
		return is;
	    }
	    if (arg1 == 30000 && (Class173.anInt2378 ^ 0xffffffff) < -1) {
		byte[] is = Class23.aByteArrayArray251[--Class173.anInt2378];
		Class23.aByteArrayArray251[Class173.anInt2378] = null;
		return is;
	    }
	    return new byte[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("iq.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method791(byte arg0) {
	try {
	    anInt1074++;
	    synchronized (Class182.aClass214_2603) {
		if (arg0 < 90)
		    aBoolean1075 = true;
		Class182.aClass214_2603.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"iq.D(" + arg0 + ')');
	}
    }
    
    public static int method792(int arg0, int arg1, boolean arg2) {
	try {
	    anInt1073++;
	    int i = arg0 >>> -204450113;
	    if (arg2 != true)
		method788(33, (byte) -103);
	    return (i + arg0) / arg1 + -i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("iq.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
