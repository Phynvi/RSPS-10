/* Class131_Sub41_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub12 extends Class131_Sub41
{
    public static String aString6306;
    public int anInt6307;
    public static int anInt6308;
    public static Class150[][] aClass150ArrayArray6309;
    public Class104 aClass104_6310;
    public int anInt6311;
    public static Class145 aClass145_6312;
    public int anInt6313;
    public int anInt6314;
    public static int anInt6315;
    public static int[] anIntArray6316 = new int[1024];
    public Class107 aClass107_6317;
    public static int anInt6318;
    public int anInt6319;
    public static int anInt6320;
    public static Class173 aClass173_6321;
    
    public void method2009(int arg0) {
	try {
	    anInt6307 = aClass104_6310.anInt1361;
	    anInt6314 = aClass104_6310.anInt1366;
	    anInt6311 = aClass104_6310.anInt1363;
	    anInt6315++;
	    if (aClass104_6310.aClass9_1356 != null)
		aClass104_6310.aClass9_1356.method186(aClass107_6317.anInt1400,
						      aClass107_6317.anInt1384,
						      aClass107_6317.anInt1393,
						      (Class23_Sub4_Sub2
						       .anIntArray5381));
	    anInt6319 = Class23_Sub4_Sub2.anIntArray5381[2];
	    anInt6313 = Class23_Sub4_Sub2.anIntArray5381[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mg.B(" + arg0 + ')');
	}
    }
    
    public static void method2010(byte arg0) {
	try {
	    if (arg0 >= 31) {
		Class151.aClass214_2016.method2783(-99);
		anInt6318++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mg.C(" + arg0 + ')');
	}
    }
    
    public static void method2011(boolean arg0) {
	try {
	    aClass145_6312 = null;
	    if (arg0 != false)
		anIntArray6316 = null;
	    aClass150ArrayArray6309 = null;
	    aClass173_6321 = null;
	    aString6306 = null;
	    anIntArray6316 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mg.A(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub12(Class104 arg0, Class1_Sub6 arg1) {
	try {
	    aClass104_6310 = arg0;
	    aClass107_6317
		= Class131_Sub2_Sub28.method1609(arg0.anInt1358, (byte) -127);
	    method2009(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mg.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aString6306 = null;
	aClass145_6312 = new Class145();
	anInt6320 = 0;
    }
}
