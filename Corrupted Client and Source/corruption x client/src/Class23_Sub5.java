/* Class23_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub5 extends Class23
{
    public int anInt3751;
    public static int anInt3752;
    public int anInt3753;
    public static float aFloat3754;
    public int anInt3755;
    public static byte[] aByteArray3756 = new byte[32896];
    public boolean aBoolean3757 = false;
    public static int anInt3758;
    public boolean aBoolean3759 = false;
    public static long[] aLongArray3760;
    public static boolean aBoolean3761;
    
    public static void method394(int arg0, int arg1) {
	anInt3752++;
	Class219.aClass214_3204.method2786(0, arg0);
	Class17.aClass214_182.method2786(0, arg0);
	if (arg1 <= 43)
	    method394(-29, -69);
    }
    
    public static void method395(int arg0) {
	try {
	    if (arg0 != 7893)
		method394(30, 19);
	    aLongArray3760 = null;
	    aByteArray3756 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"s.BA(" + arg0 + ')');
	}
    }
    
    public Class23_Sub5(int arg0, int arg1, int arg2, boolean arg3,
			boolean arg4) {
	try {
	    anInt3755 = arg1;
	    anInt3751 = arg2;
	    aBoolean3757 = arg3;
	    anInt3753 = arg0;
	    aBoolean3759 = arg4;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("s.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ')'));
	}
    }
    
    static {
	int i = 0;
	for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -257; i_0_++) {
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff);
		 i_1_++)
		aByteArray3756[i++]
		    = (byte) (int) (255.0
				    / Math.sqrt((double) ((float) (65535
								   + (i_1_
								      * i_1_)
								   + (i_0_
								      * i_0_))
							  / 65535.0F)));
	}
	aLongArray3760 = new long[256];
	anInt3758 = 1;
	for (int i_2_ = 0; i_2_ < 256; i_2_++) {
	    long l = (long) i_2_;
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -9; i_3_++) {
		if ((0x1L & l ^ 0xffffffffffffffffL) != -2L)
		    l >>>= 1;
		else
		    l = ~0x3693a86a2878f0bdL ^ l >>> 690819713;
	    }
	    aLongArray3760[i_2_] = l;
	}
	aBoolean3761 = false;
    }
}
