/* Class121_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121_Sub3 extends Class121
{
    public static int anInt3994 = 0;
    public static int anInt3995;
    public static int anInt3996;
    public static int anInt3997;
    public static int anInt3998;
    public static int anInt3999 = 0;
    public static Class173 aClass173_4000;
    public static int anInt4001;
    
    public static boolean method1054(int arg0, byte[] arg1, int arg2,
				     int arg3) {
	try {
	    if (arg3 != 0)
		method1055(56, null, (byte) -63);
	    anInt3995++;
	    boolean bool = true;
	    Stream stream = new Stream(arg1);
	    int i = -1;
	    for (;;) {
		int i_0_ = stream.method1758(32767);
		if ((i_0_ ^ 0xffffffff) == -1)
		    break;
		i += i_0_;
		int i_1_ = 0;
		boolean bool_2_ = false;
		for (;;) {
		    if (bool_2_) {
			int i_3_
			    = stream.readSmart(arg3 + -1647926640);
			if (i_3_ == 0)
			    break;
			stream.readUnsignedByte(arg3 + 110);
		    } else {
			int i_4_ = stream.readSmart(-1647926640);
			if ((i_4_ ^ 0xffffffff) == -1)
			    break;
			i_1_ += i_4_ + -1;
			int i_5_ = 0x3f & i_1_;
			int i_6_ = 0x3f & i_1_ >> 1975270278;
			int i_7_
			    = stream.readUnsignedByte(-74) >> -1919360766;
			int i_8_ = arg0 + i_6_;
			int i_9_ = arg2 + i_5_;
			if (i_8_ > 0 && i_9_ > 0
			    && ((i_8_ ^ 0xffffffff)
				> (Class131_Sub41_Sub11_Sub1.anInt6546 - 1
				   ^ 0xffffffff))
			    && ((i_9_ ^ 0xffffffff)
				> (Class131_Sub2_Sub26.anInt5931 + -1
				   ^ 0xffffffff))) {
			    Class187 class187
				= Class55.method612(i, arg3 ^ 0x74);
			    if (i_7_ != 22 || Class135.aBoolean1818
				|| class187.anInt2663 != 0
				|| (class187.anInt2693 ^ 0xffffffff) == -2
				|| class187.aBoolean2651) {
				if (!class187.method2565(0)) {
				    Class131_Sub41_Sub17_Sub1.anInt6573++;
				    bool = false;
				}
				bool_2_ = true;
			    }
			}
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("q.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static int method1055(int arg0, byte[] arg1, byte arg2) {
	try {
	    anInt3998++;
	    int i = 47 / ((arg2 - -47) / 45);
	    return Class64.method672(-5, arg0, arg1, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("q.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1056(int arg0, int arg1) {
	try {
	    int i = -77 / ((arg0 - -1) / 56);
	    anInt3996++;
	    Class146.anInt1940 = -1;
	    if ((arg1 ^ 0xffffffff) != -38) {
		if ((arg1 ^ 0xffffffff) == -51)
		    Class127.aFloat1710 = 4.0F;
		else if (arg1 != 75) {
		    if ((arg1 ^ 0xffffffff) == -101)
			Class127.aFloat1710 = 8.0F;
		    else if ((arg1 ^ 0xffffffff) == -201)
			Class127.aFloat1710 = 16.0F;
		} else
		    Class127.aFloat1710 = 6.0F;
	    } else
		Class127.aFloat1710 = 3.0F;
	    Class146.anInt1940 = -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("q.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1057(byte arg0) {
	try {
	    if (arg0 != 61)
		method1058((byte) 105);
	    anInt3997++;
	    Class71.aClass214_944.method2783(arg0 + -143);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"q.E(" + arg0 + ')');
	}
    }
    
    public static void method1058(byte arg0) {
	aClass173_4000 = null;
	if (arg0 != -75)
	    anInt3994 = 56;
    }
}
