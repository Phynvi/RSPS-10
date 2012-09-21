/* Class131_Sub2_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub33 extends Class131_Sub2
{
    public int anInt6020;
    public static int anInt6021;
    public int anInt6022;
    public static Class152[] aClass152Array6023;
    public static int anInt6024;
    public static int[] anIntArray6025;
    public static int anInt6026;
    public static int anInt6027;
    public int anInt6028;
    
    public Class131_Sub2_Sub33(int arg0) {
	super(0, false);
	try {
	    method1628(1, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"t.<init>(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2_Sub33() {
	this(0);
    }
    
    public static void method1627(int arg0) {
	try {
	    if (arg0 == 4080) {
		aClass152Array6023 = null;
		anIntArray6025 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"t.B(" + arg0 + ')');
	}
    }
    
    public void method1628(int arg0, int arg1) {
	anInt6022 = arg1 >> -1644753340 & 0xff0;
	anInt6028 = 0xff0 & arg1 << 437999972;
	anInt6021++;
	anInt6020 = (0xff0000 & arg1) >> -124014292;
	if (arg0 != 1)
	    method1455(8, (byte) 31, null);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt6024++;
	    if (arg1 != 0)
		method1455(-57, (byte) 95, null);
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[] is_0_ = is[0];
		int[] is_1_ = is[1];
		int[] is_2_ = is[2];
		for (int i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++) {
		    is_0_[i] = anInt6020;
		    is_1_[i] = anInt6022;
		    is_2_[i] = anInt6028;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("t.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 == -49) {
		int i = arg0;
		if (i == 0)
		    method1628(arg1 ^ ~0x31, arg2.read3Bytes(false));
		anInt6027++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("t.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
