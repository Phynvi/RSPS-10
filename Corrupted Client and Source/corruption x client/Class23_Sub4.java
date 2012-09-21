/* Class23_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub4 extends Class23
{
    public int anInt3733;
    public static SignLink aSignLink_3734;
    public short aShort3735;
    public static Class173[] aClass173Array3736;
    public short aShort3737;
    public static int anInt3738;
    public static int anInt3739;
    public byte aByte3740;
    public byte aByte3741;
    public short aShort3742;
    public static Class9 aClass9_3743;
    public static int anInt3744;
    public short aShort3745;
    public int anInt3746;
    public int anInt3747;
    public static int anInt3748;
    public boolean aBoolean3749;
    public int anInt3750;

    public static void method322(int arg0) {
	aClass9_3743 = null;
	aSignLink_3734 = null;
	aClass173Array3736 = null;
	if (arg0 != 0)
	    method326(-7);
    }
    
    public abstract int method323(int i);
    
    public static void method324(int arg0, int arg1, int arg2) {
	do {
	    try {
		anInt3744++;
		int i = -58 % ((-16 - arg2) / 53);
		if ((arg1 ^ 0xffffffff)
		    != (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)) {
		    Class1_Sub4.anIntArray3551 = new int[arg1];
		    for (int i_0_ = 0;
			 (arg1 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
			Class1_Sub4.anIntArray3551[i_0_]
			    = (i_0_ << 1377114732) / arg1;
		    Class93.anInt1221 = arg1 * 32;
		    Class131_Sub2_Sub7.anInt5637 = arg1;
		    Class23_Sub4_Sub4.anInt5404 = arg1 + -1;
		}
		if (Class120_Sub2.anInt3975 == arg0)
		    break;
		if (arg0 == Class131_Sub2_Sub7.anInt5637)
		    Class1_Sub7_Sub1.anIntArray5206
			= Class1_Sub4.anIntArray3551;
		else {
		    Class1_Sub7_Sub1.anIntArray5206 = new int[arg0];
		    for (int i_1_ = 0; arg0 > i_1_; i_1_++)
			Class1_Sub7_Sub1.anIntArray5206[i_1_]
			    = (i_1_ << 1567162732) / arg0;
		}
		Class79.anInt1060 = arg0 + -1;
		Class120_Sub2.anInt3975 = arg0;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("me.CB(" + arg0 + ','
						     + arg1 + ',' + arg2
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method325(byte arg0) {
	try {
	    if (arg0 <= -15)
		anInt3738++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"me.AA(" + arg0 + ')');
	}
    }
    
    public static void method326(int arg0) {
	try {
	    anInt3748++;
	    if (!Class153_Sub2.aBoolean4774) {
		if (arg0 < 123)
		    aSignLink_3734 = null;
		Class23_Sub3.method320((PacketStream
					.aClass147ArrayArrayArray6124),
				       -17126);
		if (Class82.aClass147ArrayArrayArray1092 != null)
		    Class23_Sub3.method320((Class82
					    .aClass147ArrayArrayArray1092),
					   -17126);
		Class153_Sub2.aBoolean4774 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"me.EB(" + arg0 + ')');
	}
    }
    
    public static void method327(int arg0, int arg1) {
	try {
	    synchronized (Class135.aClass214_1811) {
		int i = 69 % ((arg1 - -28) / 54);
		Class135.aClass214_1811.method2786(0, arg0);
	    }
	    anInt3739++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("me.FB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class23_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, boolean arg8,
			byte arg9) {
	try {
	    aShort3745 = (short) arg4;
	    aByte3741 = arg9;
	    anInt3747 = (short) arg3;
	    aBoolean3749 = arg8;
	    aByte3740 = (byte) arg0;
	    aShort3742 = (short) arg5;
	    aShort3737 = (short) arg6;
	    aShort3735 = (short) arg7;
	    anInt3746 = (short) arg2;
	    anInt3733 = (short) arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("me.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ','
						 + arg7 + ',' + arg8 + ','
						 + arg9 + ')'));
	}
    }
}
