/* Class131_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub4 extends Class131_Sub2
{
    public static int anInt5594;
    public static int[] anIntArray5595 = new int[128];
    public static int anInt5596;
    public static int anInt5597;
    public static int anInt5598;
    public int anInt5599 = 4096;
    public static String aString5600;
    public static long aLong5601 = 0L;
    
    public Class131_Sub2_Sub4(int arg0) {
	super(0, true);
	try {
	    anInt5599 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bn.<init>(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	    if (i == 0)
		anInt5599 = (arg2.readUnsignedByte(108) << 241633868) / 255;
	    if (arg1 == -49)
		anInt5596++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bn.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5594++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 121);
	    if (arg0 != -11543)
		anInt5599 = -60;
	    if (aClass200_4087.aBoolean2927)
		Class61.method651(is, 0, Class131_Sub2_Sub7.anInt5637,
				  anInt5599);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bn.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub4() {
	this(4096);
    }
    
    public static void method1489(int arg0) {
	try {
	    anIntArray5595 = null;
	    if (arg0 < -3)
		aString5600 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bn.B(" + arg0 + ')');
	}
    }
    
    static {
	aString5600 = "Loaded interfaces";
    }
}
