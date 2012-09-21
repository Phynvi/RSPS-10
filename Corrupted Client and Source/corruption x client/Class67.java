/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67
{
    public static int anInt903;
    public static short[] aShortArray904
	= { -4160, -4163, -8256, -8259, 22461 };
    public static int[] anIntArray905;
    public static int anInt906;
    public static int anInt907;
    public static int anInt908;
    public static int anInt909;
    public static int anInt910;
    public static int anInt911;
    public static Class140 aClass140_912;
    public static boolean[] aBooleanArray913;
    
    public static void method703(byte arg0) {
	try {
	    anIntArray905 = null;
	    aBooleanArray913 = null;
	    aClass140_912 = null;
	    int i = -14 / ((32 - arg0) / 58);
	    aShortArray904 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gl.D(" + arg0 + ')');
	}
    }
    
    public static void method704(boolean arg0, byte arg1) {
	try {
	    anInt909++;
	    byte[][] is;
	    int i;
	    if (arg0) {
		i = 1;
		is = Class23.aByteArrayArray254;
	    } else {
		is = Class60.aByteArrayArray788;
		i = 4;
	    }
	    int i_0_ = is.length;
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
		int[] is_2_ = null;
		byte[] is_3_ = is[i_1_];
		int i_4_ = Class74.anIntArray1003[i_1_] >> -1670060632;
		int i_5_ = 0xff & Class74.anIntArray1003[i_1_];
		int i_6_ = -Class92.regionX + i_4_ * 64;
		int i_7_ = -Class64.regionY + 64 * i_5_;
		if (is_3_ != null) {
		    Class43.method522(99);
		    is_2_ = (Class131_Sub2_Sub35.method1634
			     (i_6_, Class183_Sub1.aClass130_4960, arg0,
			      (byte) 82, Class92.regionX, i,
			      Class131_Sub2_Sub9.aClass19Array5682, is_3_,
			      Class64.regionY, i_7_));
		}
		if (!arg0 && Class131_Sub41_Sub13.anInt6326 / 8 == i_4_
		    && ((Class173.anInt2372 / 8 ^ 0xffffffff)
			== (i_5_ ^ 0xffffffff))) {
		    if (is_2_ != null) {
			Class98.aClass209_1307
			    = Login.method1152(is_2_[0], is_2_[1], is_2_[3],
						  (byte) 104, is_2_[2]);
			Class131_Sub41_Sub4.anInt6199 = is_2_[4];
		    } else
			Class98.aClass209_1307 = null;
		}
	    }
	    int i_8_ = -116 % ((arg1 - -68) / 49);
	    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		int i_10_
		    = (-Class92.regionX
		       + 64 * (Class74.anIntArray1003[i_9_] >> -2023849624));
		int i_11_ = (-Class64.regionY
			     + 64 * (0xff & Class74.anIntArray1003[i_9_]));
		byte[] is_12_ = is[i_9_];
		if (is_12_ == null
		    && (Class173.anInt2372 ^ 0xffffffff) > -801) {
		    Class43.method522(-87);
		    for (int i_13_ = 0; i_13_ < i; i_13_++)
			Class209.method2754(64, i_11_, 64, -22467, i_13_,
					    i_10_);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gl.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method705(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt903++;
	    arg3 = (0xff0000 & arg1 * (0xff00 & arg3)
		    | arg0 & arg1 * (arg3 & 0xff00ff)) >>> -1441725496;
	    int i = 255 - arg1;
	    return (((0xff0000 & i * (0xff00 & arg2)
		      | ~0xff00ff & i * (arg2 & 0xff00ff))
		     >>> 2109297512)
		    - -arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gl.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method706(byte arg0) {
	for (int i = 0; ((i ^ 0xffffffff)
			 > (Class23_Sub2_Sub1.aByteArrayArrayArray4992.length
			    ^ 0xffffffff)); i++) {
	    for (int i_14_ = 0;
		 i_14_ < Class23_Sub2_Sub1.aByteArrayArrayArray4992[0].length;
		 i_14_++) {
		for (int i_15_ = 0;
		     ((Class23_Sub2_Sub1.aByteArrayArrayArray4992[0][0].length
		       ^ 0xffffffff)
		      < (i_15_ ^ 0xffffffff));
		     i_15_++)
		    Class23_Sub2_Sub1.aByteArrayArrayArray4992[i][i_14_][i_15_]
			= (byte) 0;
	    }
	}
	anInt908++;
	if (arg0 > -101)
	    method703((byte) -4);
    }
    
    public static void method707(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, Class130 arg11,
				 byte[][][] arg12) {
	try {
	    anInt907++;
	    if (arg0 != 0 && arg1 != 0) {
		if (arg2 != 16711680)
		    method706((byte) 101);
		if ((arg0 ^ 0xffffffff) == -10) {
		    arg0 = 1;
		    arg3 = 1 + arg3 & 0x3;
		}
		if ((arg0 ^ 0xffffffff) == -11) {
		    arg3 = 0x3 & 3 + arg3;
		    arg0 = 1;
		}
		if ((arg0 ^ 0xffffffff) == -12) {
		    arg0 = 8;
		    arg3 = 3 + arg3 & 0x3;
		}
		arg11.method1205(arg7, arg8, arg9, arg4, arg10, arg5,
				 arg12[-1 + arg0][arg3], arg1, arg6);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("gl.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7
			+ ',' + arg8 + ',' + arg9 + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ','
			+ (arg12 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static int method708(int arg0, int arg1) {
	try {
	    anInt910++;
	    if (arg0 != -348018488)
		method708(-79, 14);
	    return arg1 >>> -348018488;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gl.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
