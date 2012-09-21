/* Class131_Sub41_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub18 extends Class131_Sub41
{
    public static int[] anIntArray6394 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    public static int anInt6395;
    public static int anInt6396 = 0;
    public static int anInt6397;
    public static Class214 aClass214_6398 = new Class214(64);
    public static int anInt6399;
    public static int anInt6400;
    public static int anInt6401;
    public static byte[][][] aByteArrayArrayArray6402;
    public static int[] anIntArray6403;
    public static Class203[] aClass203Array6404;
    
    public static int method2052(boolean arg0, int arg1, int arg2) {
	try {
	    anInt6397++;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(53,
							       (long) arg2));
	    if (class131_sub13 == null)
		return 0;
	    if (arg1 == -1)
		return 0;
	    int i = 0;
	    int i_0_ = 0;
	    if (arg0 != true)
		method2053(false, 115, true, 106, 54, true, null, -113, 46,
			   -25, 20, -9);
	    for (/**/; i_0_ < class131_sub13.anIntArray4267.length; i_0_++) {
		if (class131_sub13.anIntArray4257[i_0_] == arg1)
		    i += class131_sub13.anIntArray4267[i_0_];
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tk.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2053(boolean arg0, int arg1, boolean arg2,
				  int arg3, int arg4, boolean arg5,
				  Stream arg6, int arg7, int arg8,
				  int arg9, int arg10, int arg11) {
	try {
	    if (arg4 != 1) {
		if ((arg4 ^ 0xffffffff) != -3) {
		    if (arg4 == 3)
			arg9 = 1;
		} else {
		    arg8 = 1;
		    arg9 = 1;
		}
	    } else
		arg8 = 1;
	    if (arg2 != false)
		aClass203Array6404 = null;
	    anInt6401++;
	    if ((arg3 ^ 0xffffffff) <= -1
		&& ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
		    < (arg3 ^ 0xffffffff))
		&& arg10 >= 0 && Class131_Sub2_Sub26.anInt5931 > arg10) {
		if (!arg0 && !arg5)
		    Class23_Sub2_Sub1.aByteArrayArrayArray4992[arg7][arg3]
			[arg10]
			= (byte) 0;
		for (;;) {
		    int i = arg6.readUnsignedByte(-24);
		    if ((i ^ 0xffffffff) == -1) {
			if (!arg0) {
			    if ((arg7 ^ 0xffffffff) == -1)
				Cryption.anIntArrayArrayArray1828[0]
				    [arg9 + arg3][arg10 - -arg8]
				    = -Class74.method756(556238 - -arg1,
							 (byte) -115,
							 arg11 + 932731) * 8;
			    else
				Cryption.anIntArrayArrayArray1828[arg7]
				    [arg3 + arg9][arg10 - -arg8]
				    = ((Cryption.anIntArrayArrayArray1828
					[arg7 - 1][arg9 + arg3][arg10 + arg8])
				       - 240);
			} else {
			    Cryption.anIntArrayArrayArray1828[0]
				[arg3 + arg9][arg8 + arg10]
				= Class131_Sub2_Sub37.aClass68Array6057[0]
				      .method712(arg9 + arg3, arg10 + arg8);
			    break;
			}
			break;
		    }
		    if (i == 1) {
			int i_1_ = arg6.readUnsignedByte(-124);
			if (!arg0) {
			    if (i_1_ == 1)
				i_1_ = 0;
			    if (arg7 == 0)
				Cryption.anIntArrayArrayArray1828[0]
				    [arg3 + arg9][arg8 + arg10]
				    = 8 * -i_1_;
			    else
				Cryption.anIntArrayArrayArray1828[arg7]
				    [arg3 - -arg9][arg8 + arg10]
				    = -(8 * i_1_) + (Cryption
						     .anIntArrayArrayArray1828
						     [-1 + arg7][arg3 - -arg9]
						     [arg8 + arg10]);
			} else {
			    Cryption.anIntArrayArrayArray1828[0]
				[arg9 + arg3][arg8 + arg10]
				= (Class131_Sub2_Sub37.aClass68Array6057[0]
				       .method712(arg3 - -arg9, arg8 + arg10)
				   - -(i_1_ * 8));
			    break;
			}
			break;
		    }
		    if (i <= 49) {
			if (arg5)
			    arg6.readUnsignedByte(-77);
			else {
			    Class17.aByteArrayArrayArray184[arg7][arg3][arg10]
				= arg6.readSignedByte((byte) 127);
			    aByteArrayArrayArray6402[arg7][arg3][arg10]
				= (byte) ((-2 + i) / 4);
			    Class121_Sub3_Sub1.aByteArrayArrayArray5434
				[arg7][arg3][arg10]
				= (byte) Class90.method841(3, arg4 + (i - 2));
			}
		    } else if (i <= 81) {
			if (!arg0 && !arg5)
			    Class23_Sub2_Sub1.aByteArrayArrayArray4992
				[arg7][arg3][arg10]
				= (byte) (-49 + i);
		    } else if (!arg5)
			Class88.aByteArrayArrayArray1150[arg7][arg3][arg10]
			    = (byte) (i + -81);
		}
	    } else {
		for (;;) {
		    int i = arg6.readUnsignedByte(-118);
		    if (i == 0)
			break;
		    if ((i ^ 0xffffffff) == -2) {
			arg6.readUnsignedByte(-28);
			break;
		    }
		    if (i <= 49)
			arg6.readUnsignedByte(-43);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tk.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ','
						 + (arg6 != null ? "{...}"
						    : "null")
						 + ',' + arg7 + ',' + arg8
						 + ',' + arg9 + ',' + arg10
						 + ',' + arg11 + ')'));
	}
    }
    
    public static void method2054(byte arg0) {
	aClass214_6398 = null;
	anIntArray6394 = null;
	aClass203Array6404 = null;
	anIntArray6403 = null;
	aByteArrayArrayArray6402 = null;
	if (arg0 != -79)
	    method2053(true, 101, true, -80, 81, true, null, -91, 22, 6, -127,
		       118);
    }
    
    public static boolean method2055(String arg0, byte arg1) {
	try {
	    if (arg1 != -38)
		return true;
	    anInt6399++;
	    return Class59.method643(true, 10, arg0, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tk.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method2056(byte arg0) {
	try {
	    anInt6395++;
	    if ((double) Class127.aFloat1710 == 3.0)
		return 37;
	    if ((double) Class127.aFloat1710 == 4.0)
		return 50;
	    if ((double) Class127.aFloat1710 == 6.0)
		return 75;
	    if (arg0 >= -58)
		method2055(null, (byte) 34);
	    if ((double) Class127.aFloat1710 == 8.0)
		return 100;
	    return 200;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tk.D(" + arg0 + ')');
	}
    }
}
