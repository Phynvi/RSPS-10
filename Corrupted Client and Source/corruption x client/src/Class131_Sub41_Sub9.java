/* Class131_Sub41_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub9 extends Class131_Sub41
{
    public static int anInt6275;
    public static int anInt6276;
    public static short aShort6277;
    public static int anInt6278 = -13423323;
    public static int anInt6279;
    public static int anInt6280;
    public static int anInt6281;
    public static int anInt6282;
    public static int[] anIntArray6283;
    public char aChar6284;
    public int anInt6285 = 1;
    
    public static void method1986(byte arg0, int arg1) {
	try {
	    anInt6280++;
	    if (arg0 < 82)
		method1987(12, -82);
	    Class160.anInt2131 = arg1;
	    Class71.aClass214_944.method2783(-123);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ji.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method1987(int arg0, int arg1) {
	try {
	    anInt6276++;
	    if (arg0 != 15443)
		method1989(97);
	    return arg1 >>> 134238215;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ji.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1988(int arg0, int arg1, Stream arg2) {
	try {
	    anInt6279++;
	    if (arg1 != 1450045411)
		anInt6275 = 35;
	    if ((arg0 ^ 0xffffffff) != -2) {
		if ((arg0 ^ 0xffffffff) == -3)
		    anInt6285 = 0;
	    } else
		aChar6284
		    = Class214.method2782(112, arg2.readSignedByte((byte) 127));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ji.E(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1989(int arg0) {
	try {
	    if (arg0 == -128)
		anIntArray6283 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ji.D(" + arg0 + ')');
	}
    }
    
    public static void method1990(byte arg0, int arg1) {
	try {
	    int i = -13 % ((arg0 - -16) / 34);
	    anInt6282++;
	    int i_0_ = -Class211.anInt3081 + Class125.anInt1632;
	    if ((i_0_ ^ 0xffffffff) <= -101)
		Class131_Sub2_Sub34.anInt6035 = 1;
	    else {
		int i_1_ = (int) Class23_Sub1_Sub1.aFloat5082;
		if (i_1_ < Class64.anInt811 >> 1791807496)
		    i_1_ = Class64.anInt811 >> 690029640;
		if (Class119.aBooleanArray1567[4]
		    && ((128 + Class151.anIntArray2020[4] ^ 0xffffffff)
			< (i_1_ ^ 0xffffffff)))
		    i_1_ = Class151.anIntArray2020[4] - -128;
		int i_2_
		    = 0x3fff & (int) Class120.aFloat1578 + Class47.anInt647;
		Class89.method835(0,
				  (RuntimeException_Sub1.method2833
				   ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anInt3747),
				    -106,
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anInt3733),
				    Class29.anInt300)) - 50,
				  3 * (i_1_ >> 1450045411) + 600, i_1_, i_2_,
				  arg1, Class131_Sub3.anInt4126, anInt6275);
		float f = (-((float) ((-i_0_ + 100)
				      * ((-i_0_ + 100) * (100 - i_0_)))
			     / 1000000.0F)
			   + 1.0F);
		Class2.anInt84
		    = (int) ((float) (-Class193.anInt2837 + Class2.anInt84) * f
			     + (float) Class193.anInt2837);
		Class87.anInt1140 = (int) ((float) (-Class131_Sub38.anInt4611
						    + Class87.anInt1140) * f
					   + (float) Class131_Sub38.anInt4611);
		Stream.anInt4323
		    = (int) ((float) PacketStream.anInt6125
			     + f * (float) (-PacketStream.anInt6125
					    + Stream.anInt4323));
		Class57.anInt753
		    = (int) ((float) Class131_Sub41_Sub15.anInt6367
			     + ((float) (Class57.anInt753
					 + -Class131_Sub41_Sub15.anInt6367)
				* f));
		int i_3_ = -Class118.anInt1547 + Class131_Sub41_Sub4.anInt6213;
		if (i_3_ > 8192)
		    i_3_ -= 16384;
		else if ((i_3_ ^ 0xffffffff) > 8191)
		    i_3_ += 16384;
		Class131_Sub41_Sub4.anInt6213
		    = (int) ((float) i_3_ * f + (float) Class118.anInt1547);
		Class131_Sub41_Sub4.anInt6213 &= 0x3fff;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ji.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1991(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readUnsignedByte(113);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method1988(i, 1450045411, arg0);
	}
	anInt6281++;
	if (arg1 != -1)
	    method1991(null, -19);
    }
    
    static {
	aShort6277 = (short) 256;
	anIntArray6283 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    }
}
