/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class209
{
    public static int anInt3037;
    public static int anInt3038;
    public Class196[] aClass196Array3039;
    public Class196 aClass196_3040;
    public int anInt3041 = -1;
    public static Class214 aClass214_3042 = new Class214(4);
    public int anInt3043;
    public static boolean aBoolean3044 = false;
    public static int anInt3045;
    public int anInt3046;
    public static int anInt3047;
    public int anInt3048;
    public boolean aBoolean3049 = true;
    public static int anInt3050;
    public static int anInt3051;
    public Class152 aClass152_3052;
    public static boolean aBoolean3053 = true;
    public int anInt3054;
    public static int anInt3055;
    public int anInt3056;
    public Class196[] aClass196Array3057;
    public int anInt3058;
    public static int anInt3059;
    public static int anInt3060;
    public static int anInt3061;
    
    public boolean method2750(int arg0, int arg1, Class130 arg2) {
	try {
	    anInt3059++;
	    if (arg0 != anInt3041) {
		anInt3041 = arg0;
		int i = Class101.method887(1388313616, arg0);
		if ((i ^ 0xffffffff) < (arg0 ^ 0xffffffff))
		    i = Class144.method2152(arg0, (byte) 78);
		if (i > 512)
		    i = 512;
		if (anInt3054 != i) {
		    anInt3054 = i;
		    aClass152_3052 = null;
		}
		if (aClass196Array3039 != null) {
		    anInt3058 = 0;
		    int[] is = new int[aClass196Array3039.length];
		    for (int i_0_ = 0;
			 ((aClass196Array3039.length ^ 0xffffffff)
			  < (i_0_ ^ 0xffffffff));
			 i_0_++) {
			Class196 class196 = aClass196Array3039[i_0_];
			if (class196.method2666(anInt3046, anInt3043,
						anInt3048, anInt3041)) {
			    is[anInt3058] = class196.anInt2868;
			    aClass196Array3057[anInt3058++] = class196;
			}
		    }
		    Class118.method1004(-1 + anInt3058, is, aClass196Array3057,
					0, 116);
		}
		aBoolean3049 = true;
	    }
	    boolean bool = false;
	    if (aBoolean3049) {
		aBoolean3049 = false;
		for (int i = -1 + anInt3058; (i ^ 0xffffffff) <= -1; i--) {
		    boolean bool_1_
			= aClass196Array3057[i].method2673(arg2,
							   aClass196_3040);
		    Class209 class209 = this;
		    class209.aBoolean3049 = class209.aBoolean3049 | !bool_1_;
		    bool |= bool_1_;
		}
	    }
	    if (arg1 != -18995)
		method2758(-55);
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vb.G(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2751(byte arg0) {
	try {
	    if (arg0 == -58) {
		anInt3061++;
		for (int i = 0; i < 5; i++)
		    Class119.aBooleanArray1567[i] = false;
		Class118.anInt1547 = Class131_Sub41_Sub4.anInt6213;
		OutputStream_Sub1.anInt72 = -1;
		PacketStream.anInt6125 = Stream.anInt4323;
		Class131_Sub38.anInt4611 = Class87.anInt1140;
		Class211.anInt3081 = Class125.anInt1632;
		Class218.anInt3202 = 0;
		Class166.anInt2224 = 0;
		Class193.anInt2837 = Class2.anInt84;
		Class131_Sub2_Sub34.anInt6035 = 5;
		Class131_Sub41_Sub15.anInt6367 = Class57.anInt753;
		Class105.anInt1376 = -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vb.A(" + arg0 + ')');
	}
    }
    
    public static String method2752(int arg0, boolean arg1, int arg2) {
	try {
	    if (arg0 < 68)
		return null;
	    anInt3051++;
	    if (!arg1 || (arg2 ^ 0xffffffff) > -1)
		return Integer.toString(arg2);
	    return Class131_Sub41_Sub13.method2013(arg2, arg1, 10,
						   (byte) -124);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vb.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2753(int arg0, Class130 arg1) {
	try {
	    if (!Class131_Sub2_Sub28.aBoolean5961)
		Class220.method2823(-1, arg1);
	    else
		Class203.method2728((byte) 67, arg1);
	    if (arg0 >= -94)
		method2758(118);
	    anInt3060++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vb.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2754(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	anInt3045++;
	for (int i = arg1; arg1 - -arg2 > i; i++) {
	    for (int i_2_ = arg5; i_2_ < arg5 - -arg0; i_2_++) {
		if ((i_2_ ^ 0xffffffff) <= -1
		    && ((i_2_ ^ 0xffffffff)
			> (Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff))
		    && i >= 0
		    && (i ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
					   ^ 0xffffffff))
		    Cryption.anIntArrayArrayArray1828[arg4][i_2_][i]
			= ((arg4 ^ 0xffffffff) >= -1 ? 0
			   : -240 + (Cryption.anIntArrayArrayArray1828
				     [arg4 + -1][i_2_][i]));
	    }
	}
	if (arg5 > 0 && ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			 < (arg5 ^ 0xffffffff))) {
	    for (int i = 1 + arg1; arg2 + arg1 > i; i++) {
		if (i >= 0 && ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			       < (i ^ 0xffffffff)))
		    Cryption.anIntArrayArrayArray1828[arg4][arg5][i]
			= (Cryption.anIntArrayArrayArray1828[arg4][-1 + arg5]
			   [i]);
	    }
	}
	if (arg3 != -22467)
	    method2752(-11, false, 91);
	if ((arg1 ^ 0xffffffff) < -1 && Class131_Sub2_Sub26.anInt5931 > arg1) {
	    for (int i = arg5 - -1;
		 (arg0 + arg5 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if ((i ^ 0xffffffff) <= -1
		    && Class131_Sub41_Sub11_Sub1.anInt6546 > i)
		    Cryption.anIntArrayArrayArray1828[arg4][i][arg1]
			= (Cryption.anIntArrayArrayArray1828[arg4][i]
			   [-1 + arg1]);
	    }
	}
	if ((arg5 ^ 0xffffffff) <= -1 && arg1 >= 0
	    && (arg5 ^ 0xffffffff) > (Class131_Sub41_Sub11_Sub1.anInt6546
				      ^ 0xffffffff)
	    && (arg1 ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
				      ^ 0xffffffff)) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		if (arg5 <= 0
		    || (Cryption.anIntArrayArrayArray1828[arg4][arg5 - 1][arg1]
			== 0)) {
		    if ((arg1 ^ 0xffffffff) < -1
			&& ((Cryption.anIntArrayArrayArray1828[arg4][arg5]
			     [arg1 + -1])
			    ^ 0xffffffff) != -1)
			Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
			    = (Cryption.anIntArrayArrayArray1828[arg4][arg5]
			       [-1 + arg1]);
		    else if ((arg5 ^ 0xffffffff) < -1 && arg1 > 0
			     && (Cryption.anIntArrayArrayArray1828[arg4]
				 [arg5 + -1][arg1 - 1]) != 0)
			Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
			    = (Cryption.anIntArrayArrayArray1828[arg4]
			       [-1 + arg5][-1 + arg1]);
		} else
		    Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
			= (Cryption.anIntArrayArrayArray1828[arg4][-1 + arg5]
			   [arg1]);
	    } else if (arg5 <= 0 || ((Cryption.anIntArrayArrayArray1828
				      [-1 + arg4][-1 + arg5][arg1])
				     == (Cryption.anIntArrayArrayArray1828
					 [arg4][-1 + arg5][arg1]))) {
		if (arg1 <= 0
		    || (Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1 - 1]
			== (Cryption.anIntArrayArrayArray1828[-1 + arg4][arg5]
			    [arg1 + -1]))) {
		    if ((arg5 ^ 0xffffffff) < -1 && arg1 > 0
			&& ((Cryption.anIntArrayArrayArray1828[arg4][-1 + arg5]
			     [-1 + arg1])
			    != (Cryption.anIntArrayArrayArray1828[arg4 + -1]
				[arg5 - 1][-1 + arg1])))
			Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
			    = (Cryption.anIntArrayArrayArray1828[arg4]
			       [arg5 + -1][-1 + arg1]);
		} else
		    Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
			= (Cryption.anIntArrayArrayArray1828[arg4][arg5]
			   [arg1 + -1]);
	    } else
		Cryption.anIntArrayArrayArray1828[arg4][arg5][arg1]
		    = Cryption.anIntArrayArrayArray1828[arg4][-1 + arg5][arg1];
	}
    }
    
    public void method2755(int arg0) {
	anInt3047++;
	if (aClass196Array3039 != null) {
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aClass196Array3039.length ^ 0xffffffff);
		 i++)
		aClass196Array3039[i].method2670();
	}
	aClass152_3052 = null;
	if (arg0 < 99)
	    aBoolean3044 = false;
    }
    
    public void method2756(int arg0, Class130 arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6, int arg7, int arg8,
			   int arg9) {
	try {
	    anInt3050++;
	    arg5 = arg3 + arg5 & 0x3fff;
	    if (anInt3056 != -1) {
		Class42 class42
		    = Class131_Sub10.anInterface4_4227.method10(arg0 ^ 0x2b3c,
								anInt3056);
		if (aClass152_3052 == null
		    && Class131_Sub10.anInterface4_4227.method11(false,
								 anInt3056)) {
		    int[] is = (!class42.aBoolean557
				? (Class131_Sub10.anInterface4_4227.method12
				   (anInt3054, anInt3056, false, -11047, 0.7F,
				    anInt3054))
				: (Class131_Sub10.anInterface4_4227.method14
				   (0.7F, anInt3054, anInt3056, anInt3054,
				    false, false)));
		    aClass152_3052 = arg1.method1247(is, 0, anInt3054,
						     anInt3054, anInt3054);
		}
		if (!class42.aBoolean557)
		    arg1.method1173(arg7, arg4, arg8, arg9, arg6, 0);
		if (aClass152_3052 != null) {
		    int i = !class42.aBoolean557 ? 1 : 0;
		    int i_3_ = arg9 * arg2 / -4096;
		    int i_4_;
		    for (i_4_ = arg9 * arg5 / 4096 + (arg8 + -arg9) / 2;
			 i_4_ > arg9; i_4_ -= arg9) {
			/* empty */
		    }
		    for (/**/; i_4_ < 0; i_4_ += arg9) {
			/* empty */
		    }
		    for (/**/; arg9 < i_3_; i_3_ -= arg9) {
			/* empty */
		    }
		    for (/**/; i_3_ < 0; i_3_ += arg9) {
			/* empty */
		    }
		    for (int i_5_ = -arg9 + i_4_;
			 (arg8 ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
			 i_5_ += arg9) {
			for (int i_6_ = -arg9 + i_3_; i_6_ < arg9;
			     i_6_ += arg9)
			    aClass152_3052.method2201(i_5_ - -arg7,
						      arg4 + i_6_, arg9, arg9,
						      0, 0, i);
		    }
		}
	    } else
		arg1.method1173(arg7, arg4, arg8, arg9, arg6, 0);
	    if (arg0 != -26367)
		method2754(-37, -47, 22, -98, 67, 79);
	    for (int i = -1 + anInt3058; (i ^ 0xffffffff) <= -1; i--)
		aClass196Array3057[i].method2668(arg1, arg7, arg4, arg8, arg9,
						 arg2, arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vb.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public static void method2757(byte arg0) {
	aClass214_3042 = null;
	if (arg0 > -24)
	    aClass214_3042 = null;
    }
    
    public static void method2758(int arg0) {
	try {
	    if (arg0 != 2)
		anInt3038 = 84;
	    anInt3037++;
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1794(115);
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readBits(8, false);
	    if (i < Class131_Sub41_Sub2.anInt6186) {
		for (int i_7_ = i;
		     ((i_7_ ^ 0xffffffff)
		      > (Class131_Sub41_Sub2.anInt6186 ^ 0xffffffff));
		     i_7_++)
		    Class131_Sub35.anIntArray4589
			[Class131_Sub2_Sub1.anInt5560++]
			= Class131_Sub41_Sub12.anIntArray6316[i_7_];
	    }
	    if ((Class131_Sub41_Sub2.anInt6186 ^ 0xffffffff)
		> (i ^ 0xffffffff))
		throw new RuntimeException("gnpov1");
	    Class131_Sub41_Sub2.anInt6186 = 0;
	    for (int i_8_ = 0; i_8_ < i; i_8_++) {
		int i_9_ = Class131_Sub41_Sub12.anIntArray6316[i_8_];
		Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		    = Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i_9_];
		int i_10_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(1, false);
		if (i_10_ == 0) {
		    Class131_Sub41_Sub12.anIntArray6316
			[Class131_Sub41_Sub2.anInt6186++]
			= i_9_;
		    class23_sub4_sub1_sub1.anInt5285 = Class125.anInt1632;
		} else {
		    int i_11_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readBits(2, false);
		    if ((i_11_ ^ 0xffffffff) == -1) {
			Class131_Sub41_Sub12.anIntArray6316
			    [Class131_Sub41_Sub2.anInt6186++]
			    = i_9_;
			class23_sub4_sub1_sub1.anInt5285 = Class125.anInt1632;
			Class128_Sub1.anIntArray4019[Class202.anInt2943++]
			    = i_9_;
		    } else if (i_11_ == 1) {
			Class131_Sub41_Sub12.anIntArray6316
			    [Class131_Sub41_Sub2.anInt6186++]
			    = i_9_;
			class23_sub4_sub1_sub1.anInt5285 = Class125.anInt1632;
			int i_12_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(3, false);
			class23_sub4_sub1_sub1.method339(i_12_, true, 1);
			int i_13_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			if (i_13_ == 1)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= i_9_;
		    } else if (i_11_ == 2) {
			Class131_Sub41_Sub12.anIntArray6316
			    [Class131_Sub41_Sub2.anInt6186++]
			    = i_9_;
			class23_sub4_sub1_sub1.anInt5285 = Class125.anInt1632;
			if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(1, false)
			    != 1) {
			    int i_14_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub1.method339(i_14_, true, 0);
			} else {
			    int i_15_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub1.method339(i_15_, true, 2);
			    int i_16_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub1.method339(i_16_, true, 2);
			}
			int i_17_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			if (i_17_ == 1)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= i_9_;
		    } else if ((i_11_ ^ 0xffffffff) == -4)
			Class131_Sub35.anIntArray4589
			    [Class131_Sub2_Sub1.anInt5560++]
			    = i_9_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vb.C(" + arg0 + ')');
	}
    }
    
    public Class209(int arg0, Class196[] arg1, int arg2, int arg3, int arg4,
		    int arg5) {
	try {
	    anInt3056 = arg0;
	    anInt3046 = arg3;
	    aClass196Array3039 = arg1;
	    anInt3043 = arg4;
	    anInt3048 = arg5;
	    if (arg1 != null) {
		aClass196Array3057 = new Class196[arg1.length];
		aClass196_3040 = arg2 < 0 ? null : arg1[arg2];
	    } else {
		aClass196_3040 = null;
		aClass196Array3057 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vb.<init>(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
}
