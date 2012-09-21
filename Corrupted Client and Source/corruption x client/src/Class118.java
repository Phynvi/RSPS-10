/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class118
{
    public static int anInt1545;
    public static int anInt1546;
    public static int anInt1547;
    public static int[] anIntArray1548;
    public static int anInt1549;
    public static int anInt1550;
    public static int anInt1551 = 0;
    
    public static void method1000(Class138 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	arg0.anInt1852 = 0;
    while_134_:
	for (int i = arg2; i <= arg4; i++) {
	    for (int i_0_ = arg3; i_0_ <= arg5; i_0_++) {
		int i_1_ = Class64.anIntArrayArrayArray810[arg1][i][i_0_];
		int i_2_ = 0;
	    while_133_:
		while (i_2_ <= 24) {
		    int i_3_ = i_1_ >>> i_2_ & 0xff;
		    if (i_3_ <= 0)
			break;
		    Class131_Sub8_Sub1 class131_sub8_sub1
			= (Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707
			   [i_3_ - 1]);
		    for (int i_4_ = 0; i_4_ < arg0.anInt1852; i_4_++) {
			if (arg0.aClass131_Sub8_Sub1Array1851[i_4_]
			    == class131_sub8_sub1) {
			    i_2_ += 8;
			    continue while_133_;
			}
		    }
		    arg0.aClass131_Sub8_Sub1Array1851[arg0.anInt1852++]
			= class131_sub8_sub1;
		    if (arg0.anInt1852 == 4)
			break while_134_;
		    i_2_ += 8;
		}
	    }
	}
	for (int i = arg0.anInt1852; i < 4; i++)
	    arg0.aClass131_Sub8_Sub1Array1851[i] = null;
    }
    
    public static void method1001(int arg0, Stream arg1) {
	try {
	    anInt1549++;
	    if (-arg1.offset + arg1.data.length >= 1) {
		if (arg0 <= 102)
		    anInt1551 = -52;
		int i = arg1.readUnsignedByte(90);
		if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) >= -2
		    && arg1.data.length - arg1.offset >= 2) {
		    int i_5_ = arg1.readUnsignedShort(8104);
		    if (6 * i_5_
			== arg1.data.length + -arg1.offset) {
			while ((arg1.offset ^ 0xffffffff)
			       > (arg1.data.length ^ 0xffffffff)) {
			    int i_6_ = arg1.readUnsignedShort(8104);
			    int i_7_ = arg1.readUnsignedInt(-2);
			    if ((i_6_
				 < Class131_Sub2_Sub33.anIntArray6025.length)
				&& Class43.aBooleanArray586[i_6_]
				&& ((Class51.method592(i_6_, 122).aChar6284
				     != '1')
				    || (i_7_ ^ 0xffffffff) <= 0 && i_7_ <= 1))
				Class131_Sub2_Sub33.anIntArray6025[i_6_]
				    = i_7_;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mh.E(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1002(Class158 arg0, int arg1, Class158 arg2,
				  Class130 arg3) {
	try {
	    Class169.aClass55_2269
		= Class131_Sub41_Sub16.method2037(arg2, (byte) -35, 0,
						  (Class131_Sub2_Sub32
						   .anInt6014));
	    anInt1545++;
	    Class204.aClass44_2982
		= arg3.method1224(Class169.aClass55_2269,
				  Class124.method1084(arg0,
						      (Class131_Sub2_Sub32
						       .anInt6014),
						      0),
				  true);
	    Class131_Sub24.aClass55_4469
		= Class131_Sub41_Sub16.method2037(arg2, (byte) -35, 0,
						  Class128.anInt1743);
	    if (arg1 == -22073) {
		Class184.aClass44_2633
		    = arg3.method1224(Class131_Sub24.aClass55_4469,
				      Class124.method1084(arg0,
							  Class128.anInt1743,
							  0),
				      true);
		Class89.aClass55_3259
		    = Class131_Sub41_Sub16.method2037(arg2, (byte) -35, 0,
						      (PacketParser
						       .anInt5872));
		Class93.aClass44_1222
		    = arg3.method1224(Class89.aClass55_3259,
				      Class124.method1084(arg0,
							  (PacketParser
							   .anInt5872),
							  0),
				      true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("mh.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method1003(byte arg0) {
	anIntArray1548 = null;
	if (arg0 >= -9)
	    method1003((byte) -42);
    }
    
    public static void method1004(int arg0, int[] arg1, Object[] arg2,
				  int arg3, int arg4) {
	try {
	    if (arg4 > 103) {
		if ((arg0 ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
		    int i = (arg3 + arg0) / 2;
		    int i_8_ = arg3;
		    int i_9_ = arg1[i];
		    arg1[i] = arg1[arg0];
		    arg1[arg0] = i_9_;
		    Object object = arg2[i];
		    arg2[i] = arg2[arg0];
		    arg2[arg0] = object;
		    for (int i_10_ = arg3; arg0 > i_10_; i_10_++) {
			if ((i_10_ & 0x1) + i_9_ > arg1[i_10_]) {
			    int i_11_ = arg1[i_10_];
			    arg1[i_10_] = arg1[i_8_];
			    arg1[i_8_] = i_11_;
			    Object object_12_ = arg2[i_10_];
			    arg2[i_10_] = arg2[i_8_];
			    arg2[i_8_++] = object_12_;
			}
		    }
		    arg1[arg0] = arg1[i_8_];
		    arg1[i_8_] = i_9_;
		    arg2[arg0] = arg2[i_8_];
		    arg2[i_8_] = object;
		    method1004(-1 + i_8_, arg1, arg2, arg3, 109);
		    method1004(arg0, arg1, arg2, i_8_ + 1, 117);
		}
		anInt1546++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mh.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    static {
	anIntArray1548 = new int[] { 28, 35, 40, 44 };
    }
}
