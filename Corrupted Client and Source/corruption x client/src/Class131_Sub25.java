/* Class131_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub25 extends Class131
{
    public static int anInt4474;
    public short aShort4475;
    public static int anInt4476;
    public static String[] aStringArray4477 = new String[200];
    public static Class140 aClass140_4478;
    public static int anInt4479 = 13156520;
    public static int anInt4480;
    
    public static void method1829(int arg0) {
	try {
	    aClass140_4478 = null;
	    if (arg0 <= 85)
		aStringArray4477 = null;
	    aStringArray4477 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nq.B(" + arg0 + ')');
	}
    }
    
    public static void method1830(int arg0, int arg1, byte arg2) {
	try {
	    if (arg2 != 61)
		anInt4474 = -9;
	    anInt4476++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(14, arg1, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nq.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub25() {
	/* empty */
    }
    
    public Class131_Sub25(short arg0) {
	try {
	    aShort4475 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nq.<init>(" + arg0 + ')');
	}
    }
    
    public static void method1831(byte arg0, Class152[] arg1) {
	try {
	    Class131_Sub41_Sub20.anInt6430 = arg1.length;
	    if (arg0 < -22) {
		anInt4480++;
		Class167.aClass152Array2226
		    = new Class152[10 + Class131_Sub41_Sub20.anInt6430];
		Class213.anIntArray3120
		    = new int[10 + Class131_Sub41_Sub20.anInt6430];
		Class61.method654(arg1, 0, Class167.aClass152Array2226, 0,
				  Class131_Sub41_Sub20.anInt6430);
		for (int i = 0; ((Class131_Sub41_Sub20.anInt6430 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++)
		    Class213.anIntArray3120[i]
			= Class167.aClass152Array2226[i].method2198();
		for (int i = Class131_Sub41_Sub20.anInt6430;
		     ((i ^ 0xffffffff)
		      > (Class167.aClass152Array2226.length ^ 0xffffffff));
		     i++)
		    Class213.anIntArray3120[i] = 12;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nq.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
