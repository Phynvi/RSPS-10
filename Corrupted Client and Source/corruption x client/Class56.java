/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56 implements Runnable
{
    public static Class214 aClass214_731;
    public Object anObject732;
    public static int anInt733;
    public boolean aBoolean734 = true;
    public static int anInt735;
    public static int anInt736;
    public static int anInt737;
    public static int anInt738 = 0;
    public static int anInt739;
    public static int[][] anIntArrayArray740;
    public int[] anIntArray741;
    public int[] anIntArray742;
    public static int anInt743;
    public int anInt744;
    public static int anInt745;
    
    public static void method623(byte arg0) {
	int i = 99 % ((arg0 - 15) / 34);
	anInt735++;
	if (!Class9.method182((byte) -101)
	    && Class29.anInt300 != Class1_Sub8.anInt3600)
	    Class110_Sub3.method948(false, Class173.anInt2372, false,
				    Class131_Sub41_Sub13.anInt6326,
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5331[0]),
				    Class29.anInt300, 24,
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5328[0]));
	else {
	    Class131_Sub24.method1828(Class183_Sub1.aClass130_4960, -1262);
	    if (Class29.anInt300 != Class23_Sub1_Sub1.anInt5092)
		Class201.method2718((byte) -101);
	}
    }
    
    public void run() {
	try {
	    anInt736++;
	    while (aBoolean734) {
		synchronized (anObject732) {
		    if ((anInt744 ^ 0xffffffff) > -501) {
			anIntArray742[anInt744] = Class144.anInt1914;
			anIntArray741[anInt744] = Class23_Sub4_Sub3.anInt5005;
			anInt744++;
		    }
		}
		Class187.method2575(-38, 50L);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fo.run(" + ')');
	}
    }
    
    public static int method624(int arg0, byte arg1, int arg2) {
	try {
	    if (arg1 != -33)
		method624(36, (byte) 14, 127);
	    anInt737++;
	    arg0 = (arg2 & 0x7f) * arg0 >> -1455256345;
	    if ((arg0 ^ 0xffffffff) <= -3) {
		if ((arg0 ^ 0xffffffff) < -127)
		    arg0 = 126;
	    } else
		arg0 = 2;
	    return arg0 + (0xff80 & arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fo.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class177 method625(String arg0, Class158 arg1, byte arg2,
				     boolean arg3) {
	try {
	    anInt733++;
	    int i = arg1.method2359(113, arg0);
	    if (i == -1)
		return new Class177(0);
	    int[] is = arg1.method2349((byte) -114, i);
	    if (arg2 < 60)
		method624(-37, (byte) -91, 39);
	    Class177 class177 = new Class177(is.length);
	    int i_0_ = 0;
	    int i_1_ = 0;
	    while (i_0_ < class177.anInt2526) {
		Stream stream
		    = new Stream(arg1.method2364(is[i_1_++], i, 0));
		int i_2_ = stream.readUnsignedInt(-2);
		int i_3_ = stream.readUnsignedShort(8104);
		int i_4_ = stream.readUnsignedByte(91);
		if (!arg3 && (i_4_ ^ 0xffffffff) == -2)
		    class177.anInt2526--;
		else {
		    class177.anIntArray2528[i_0_] = i_2_;
		    class177.anIntArray2529[i_0_] = i_3_;
		    i_0_++;
		}
	    }
	    return class177;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fo.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method626(int arg0, int arg1, boolean arg2, int arg3,
				 byte arg4) {
	try {
	    anInt739++;
	    if (Class126.method1108((byte) -92, arg3)) {
		if (arg4 < 115)
		    method624(-121, (byte) -16, 122);
		Class171.method2443(arg2,
				    (Class131_Sub2_Sub9.aClass173ArrayArray5684
				     [arg3]),
				    -36, arg0, arg1, -1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fo.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method627(int arg0) {
	try {
	    aClass214_731 = null;
	    if (arg0 < 90)
		anInt738 = 113;
	    anIntArrayArray740 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fo.C(" + arg0 + ')');
	}
    }
    
    public Class56() {
	anObject732 = new Object();
	anIntArray742 = new int[500];
	anIntArray741 = new int[500];
	anInt744 = 0;
    }
    
    static {
	aClass214_731 = new Class214(64);
	anInt743 = 0;
	anInt745 = 0;
    }
}
