/* Class131_Sub41_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub13_Sub1 extends Class131_Sub41_Sub13
{
    public int anInt6557;
    public byte[] aByteArray6558;
    public int anInt6559;
    public int anInt6560;
    public int anInt6561;
    
    public void method2016(byte arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt6559 = arg3;
	anInt6561 = -arg3 + arg4;
	anInt6557 = -arg2 + arg1;
	int i = 47 / ((arg0 - 21) / 59);
	anInt6560 = arg2;
    }
    
    public boolean method2017(int arg0, boolean arg1, int arg2) {
	boolean bool;
	try {
	    if (arg1 != true)
		return false;
	    bool = arg0 * arg2 <= aByteArray6558.length;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public static void method2018(byte[] arg0, int arg1, int arg2, int arg3,
				  byte arg4, int arg5) {
	if (arg2 < arg3) {
	    arg1 += arg2;
	    arg5 = arg3 + -arg2 >> -1945049790;
	    while (-1 >= (--arg5 ^ 0xffffffff)) {
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
	    }
	    arg5 = 0x3 & -arg2 + arg3;
	    while (0 <= --arg5)
		arg0[arg1++] = (byte) 1;
	    int i = -101 % ((42 - arg4) / 36);
	}
    }
    
    public void method2019(int arg0) {
	if (arg0 <= 75)
	    method2020(-54, -57, -47, -42, -113, 84, 17);
	int i = -1;
	int i_0_ = -8 + aByteArray6558.length;
	while (i_0_ > i) {
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	    aByteArray6558[++i] = (byte) 0;
	}
	while (-1 + aByteArray6558.length > i)
	    aByteArray6558[++i] = (byte) 0;
    }
    
    public void method2020(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	try {
	    int i = 0;
	    if (arg2 != arg3)
		i = (-arg1 + arg6 << 519096208) / (-arg2 + arg3);
	    if (arg4 <= -104) {
		int i_1_ = 0;
		if ((arg3 ^ 0xffffffff) != (arg5 ^ 0xffffffff))
		    i_1_ = (-arg6 + arg0 << -848608880) / (-arg3 + arg5);
		int i_2_ = 0;
		if (arg5 != arg2)
		    i_2_ = (-arg0 + arg1 << 1966370256) / (arg2 + -arg5);
		if (arg3 >= arg2 && arg5 >= arg2) {
		    if (arg5 <= arg3) {
			arg6 = arg1 <<= -910175664;
			if (-1 < (arg2 ^ 0xffffffff)) {
			    arg6 -= arg2 * i_2_;
			    arg1 -= i * arg2;
			    arg2 = 0;
			}
			arg0 <<= 1121975504;
			if (arg5 < 0) {
			    arg0 -= i_1_ * arg5;
			    arg5 = 0;
			}
			if (arg5 != arg2 && i_2_ < i
			    || (arg5 == arg2
				&& (i ^ 0xffffffff) > (i_1_ ^ 0xffffffff))) {
			    arg3 -= arg5;
			    arg5 -= arg2;
			    arg2 *= anInt6561;
			    while (0 <= --arg5) {
				method2018(aByteArray6558, arg2,
					   arg6 >> 327337808,
					   arg1 >> 345796752, (byte) 114, 0);
				arg2 += anInt6561;
				arg1 += i;
				arg6 += i_2_;
			    }
			    while (--arg3 >= 0) {
				method2018(aByteArray6558, arg2,
					   arg0 >> 1157705040,
					   arg1 >> 396538608, (byte) -84, 0);
				arg1 += i;
				arg0 += i_1_;
				arg2 += anInt6561;
			    }
			} else {
			    arg3 -= arg5;
			    arg5 -= arg2;
			    arg2 = anInt6561 * arg2;
			    while (--arg5 >= 0) {
				method2018(aByteArray6558, arg2,
					   arg1 >> -666312880,
					   arg6 >> 423009072, (byte) 126, 0);
				arg6 += i_2_;
				arg2 += anInt6561;
				arg1 += i;
			    }
			    while (--arg3 >= 0) {
				method2018(aByteArray6558, arg2,
					   arg1 >> -1094491408,
					   arg0 >> -2034442544, (byte) -10, 0);
				arg0 += i_1_;
				arg1 += i;
				arg2 += anInt6561;
			    }
			}
		    } else {
			arg0 = arg1 <<= 1032606832;
			arg6 <<= -1967810416;
			if (-1 < (arg2 ^ 0xffffffff)) {
			    arg0 -= arg2 * i_2_;
			    arg1 -= arg2 * i;
			    arg2 = 0;
			}
			if (0 > arg3) {
			    arg6 -= i_1_ * arg3;
			    arg3 = 0;
			}
			if (((arg2 ^ 0xffffffff) != (arg3 ^ 0xffffffff)
			     && i_2_ < i)
			    || ((arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
				&& i_2_ > i_1_)) {
			    arg5 -= arg3;
			    arg3 -= arg2;
			    arg2 = anInt6561 * arg2;
			    while (--arg3 >= 0) {
				method2018(aByteArray6558, arg2,
					   arg0 >> -1852274800,
					   arg1 >> 1708761456, (byte) 89, 0);
				arg1 += i;
				arg0 += i_2_;
				arg2 += anInt6561;
			    }
			    while (-1 >= (--arg5 ^ 0xffffffff)) {
				method2018(aByteArray6558, arg2,
					   arg0 >> 28932624,
					   arg6 >> -801396592, (byte) -98, 0);
				arg2 += anInt6561;
				arg6 += i_1_;
				arg0 += i_2_;
			    }
			} else {
			    arg5 -= arg3;
			    arg3 -= arg2;
			    arg2 *= anInt6561;
			    while (-1 >= (--arg3 ^ 0xffffffff)) {
				method2018(aByteArray6558, arg2,
					   arg1 >> 1690274032,
					   arg0 >> 489926000, (byte) -74, 0);
				arg1 += i;
				arg0 += i_2_;
				arg2 += anInt6561;
			    }
			    while (-1 >= (--arg5 ^ 0xffffffff)) {
				method2018(aByteArray6558, arg2,
					   arg6 >> -1389895184,
					   arg0 >> 374574384, (byte) 115, 0);
				arg0 += i_2_;
				arg6 += i_1_;
				arg2 += anInt6561;
			    }
			}
		    }
		} else if ((arg3 ^ 0xffffffff) >= (arg5 ^ 0xffffffff)) {
		    if ((arg5 ^ 0xffffffff) > (arg2 ^ 0xffffffff)) {
			arg1 = arg6 <<= -956743088;
			arg0 <<= 1883633552;
			if ((arg3 ^ 0xffffffff) > -1) {
			    arg6 -= i_1_ * arg3;
			    arg1 -= i * arg3;
			    arg3 = 0;
			}
			if (0 > arg5) {
			    arg0 -= arg5 * i_2_;
			    arg5 = 0;
			}
			if (arg3 != arg5 && i_1_ > i
			    || arg5 == arg3 && i_2_ < i) {
			    arg2 -= arg5;
			    arg5 -= arg3;
			    arg3 *= anInt6561;
			    while (--arg5 >= 0) {
				method2018(aByteArray6558, arg3,
					   arg1 >> 1956282128,
					   arg6 >> 956273456, (byte) 114, 0);
				arg3 += anInt6561;
				arg6 += i_1_;
				arg1 += i;
			    }
			    while (0 <= --arg2) {
				method2018(aByteArray6558, arg3,
					   arg1 >> -1716324432,
					   arg0 >> -153454000, (byte) -41, 0);
				arg3 += anInt6561;
				arg0 += i_2_;
				arg1 += i;
			    }
			} else {
			    arg2 -= arg5;
			    arg5 -= arg3;
			    arg3 *= anInt6561;
			    while (--arg5 >= 0) {
				method2018(aByteArray6558, arg3,
					   arg6 >> 562207024,
					   arg1 >> -1514502384, (byte) -18, 0);
				arg1 += i;
				arg6 += i_1_;
				arg3 += anInt6561;
			    }
			    while (-1 >= (--arg2 ^ 0xffffffff)) {
				method2018(aByteArray6558, arg3,
					   arg0 >> -549331856,
					   arg1 >> 1237850928, (byte) -19, 0);
				arg0 += i_2_;
				arg3 += anInt6561;
				arg1 += i;
			    }
			}
		    } else {
			arg0 = arg6 <<= 1133723792;
			if (0 > arg3) {
			    arg0 -= arg3 * i;
			    arg6 -= arg3 * i_1_;
			    arg3 = 0;
			}
			arg1 <<= -688553968;
			if ((arg2 ^ 0xffffffff) > -1) {
			    arg1 -= i_2_ * arg2;
			    arg2 = 0;
			}
			if (i < i_1_) {
			    arg5 -= arg2;
			    arg2 -= arg3;
			    arg3 = anInt6561 * arg3;
			    while ((--arg2 ^ 0xffffffff) <= -1) {
				method2018(aByteArray6558, arg3,
					   arg0 >> -1800485904,
					   arg6 >> 1213455824, (byte) 113, 0);
				arg3 += anInt6561;
				arg6 += i_1_;
				arg0 += i;
			    }
			    while (-1 >= (--arg5 ^ 0xffffffff)) {
				method2018(aByteArray6558, arg3,
					   arg1 >> 267883856,
					   arg6 >> -2131007472, (byte) 81, 0);
				arg6 += i_1_;
				arg1 += i_2_;
				arg3 += anInt6561;
			    }
			} else {
			    arg5 -= arg2;
			    arg2 -= arg3;
			    arg3 *= anInt6561;
			    while (0 <= --arg2) {
				method2018(aByteArray6558, arg3,
					   arg6 >> -1116526288,
					   arg0 >> 1873749104, (byte) -112, 0);
				arg0 += i;
				arg3 += anInt6561;
				arg6 += i_1_;
			    }
			    while ((--arg5 ^ 0xffffffff) <= -1) {
				method2018(aByteArray6558, arg3,
					   arg6 >> 2042541424,
					   arg1 >> 1573912976, (byte) 119, 0);
				arg3 += anInt6561;
				arg1 += i_2_;
				arg6 += i_1_;
			    }
			}
		    }
		} else if ((arg2 ^ 0xffffffff) <= (arg3 ^ 0xffffffff)) {
		    arg1 = arg0 <<= 588078928;
		    arg6 <<= 1273547696;
		    if ((arg5 ^ 0xffffffff) > -1) {
			arg1 -= arg5 * i_1_;
			arg0 -= i_2_ * arg5;
			arg5 = 0;
		    }
		    if ((arg3 ^ 0xffffffff) > -1) {
			arg6 -= i * arg3;
			arg3 = 0;
		    }
		    if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
			arg2 -= arg3;
			arg3 -= arg5;
			arg5 *= anInt6561;
			while ((--arg3 ^ 0xffffffff) <= -1) {
			    method2018(aByteArray6558, arg5, arg1 >> 290461008,
				       arg0 >> 1751467600, (byte) -113, 0);
			    arg5 += anInt6561;
			    arg0 += i_2_;
			    arg1 += i_1_;
			}
			while ((--arg2 ^ 0xffffffff) <= -1) {
			    method2018(aByteArray6558, arg5, arg6 >> 597611856,
				       arg0 >> -132672624, (byte) -41, 0);
			    arg5 += anInt6561;
			    arg0 += i_2_;
			    arg6 += i;
			}
		    } else {
			arg2 -= arg3;
			arg3 -= arg5;
			arg5 = anInt6561 * arg5;
			while (-1 >= (--arg3 ^ 0xffffffff)) {
			    method2018(aByteArray6558, arg5, arg0 >> 827145360,
				       arg1 >> 820417968, (byte) 110, 0);
			    arg5 += anInt6561;
			    arg0 += i_2_;
			    arg1 += i_1_;
			}
			while (--arg2 >= 0) {
			    method2018(aByteArray6558, arg5,
				       arg0 >> -1855067568, arg6 >> 38995472,
				       (byte) 118, 0);
			    arg0 += i_2_;
			    arg5 += anInt6561;
			    arg6 += i;
			}
		    }
		} else {
		    arg6 = arg0 <<= 49985296;
		    if ((arg5 ^ 0xffffffff) > -1) {
			arg0 -= i_2_ * arg5;
			arg6 -= i_1_ * arg5;
			arg5 = 0;
		    }
		    arg1 <<= 1426216368;
		    if (0 > arg2) {
			arg1 -= arg2 * i;
			arg2 = 0;
		    }
		    if ((i_2_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
			arg3 -= arg2;
			arg2 -= arg5;
			arg5 *= anInt6561;
			while (-1 >= (--arg2 ^ 0xffffffff)) {
			    method2018(aByteArray6558, arg5, arg6 >> 969832912,
				       arg0 >> -1019061200, (byte) -30, 0);
			    arg5 += anInt6561;
			    arg0 += i_2_;
			    arg6 += i_1_;
			}
			while ((--arg3 ^ 0xffffffff) <= -1) {
			    method2018(aByteArray6558, arg5,
				       arg6 >> -1428451472, arg1 >> 1614168560,
				       (byte) -6, 0);
			    arg5 += anInt6561;
			    arg6 += i_1_;
			    arg1 += i;
			}
		    } else {
			arg3 -= arg2;
			arg2 -= arg5;
			arg5 = anInt6561 * arg5;
			while (0 <= --arg2) {
			    method2018(aByteArray6558, arg5,
				       arg0 >> -627949552, arg6 >> -542977584,
				       (byte) 92, 0);
			    arg6 += i_1_;
			    arg5 += anInt6561;
			    arg0 += i_2_;
			}
			while ((--arg3 ^ 0xffffffff) <= -1) {
			    method2018(aByteArray6558, arg5, arg1 >> 476931888,
				       arg6 >> 1062582832, (byte) 79, 0);
			    arg5 += anInt6561;
			    arg6 += i_1_;
			    arg1 += i;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class131_Sub41_Sub13_Sub1(Class130_Sub2 arg0, int arg1, int arg2) {
	aByteArray6558 = new byte[arg1 * arg2];
    }
}
