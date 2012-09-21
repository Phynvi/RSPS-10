/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91
{
    public static SignLink aSignLink_1178;
    public static int anInt1179;
    public static boolean aBoolean1180;
    public static int anInt1181;
    public static int anInt1182;
    public static int anInt1183;
    public static int anInt1184 = 2;
    public static int anInt1185;
    public static Class150 aClass150_1186;
    public static int anInt1187;

    public static boolean method843(int arg0, byte arg1, int arg2) {
	try {
	    anInt1185++;
	    if (((Class23_Sub2_Sub1.aByteArrayArrayArray4992[1][arg2][arg0]
		  & 0x2)
		 ^ 0xffffffff)
		!= -1)
		return true;
	    if (arg1 != 72)
		aBoolean1180 = true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jm.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method844(boolean arg0, Class23_Sub4_Sub1 arg1,
				 boolean arg2) {
	anInt1187++;
	Class72 class72 = arg1.method344(125);
	if (arg0 != false)
	    method844(false, null, true);
	if (arg1.anInt5334 == 0) {
	    Class182.anInt2605 = -1;
	    Class131_Sub41_Sub21.anInt6446 = 0;
	    arg1.anInt5321 = 0;
	} else {
	    if ((arg1.anInt5247 ^ 0xffffffff) != 0 && arg1.anInt5256 == 0) {
		Class161 class161
		    = Class145.method2159(arg1.anInt5247, (byte) -104);
		if (arg1.anInt5330 > 0
		    && (class161.anInt2140 ^ 0xffffffff) == -1) {
		    Class131_Sub41_Sub21.anInt6446 = 0;
		    Class182.anInt2605 = -1;
		    arg1.anInt5321++;
		    return;
		}
		if ((arg1.anInt5330 ^ 0xffffffff) >= -1
		    && class161.anInt2162 == 0) {
		    arg1.anInt5321++;
		    Class182.anInt2605 = -1;
		    Class131_Sub41_Sub21.anInt6446 = 0;
		    return;
		}
	    }
	    if (arg1.anInt5253 != -1 && arg1.anInt5287 <= Class125.anInt1632) {
		Class112 class112 = Class151.method2194(arg1.anInt5253, -6861);
		if (class112.aBoolean1448 && class112.anInt1450 != -1) {
		    Class161 class161
			= Class145.method2159(class112.anInt1450, (byte) -102);
		    if (arg1.anInt5330 > 0 && class161.anInt2140 == 0) {
			arg1.anInt5321++;
			Class131_Sub41_Sub21.anInt6446 = 0;
			Class182.anInt2605 = -1;
			return;
		    }
		    if ((arg1.anInt5330 ^ 0xffffffff) >= -1
			&& class161.anInt2162 == 0) {
			Class131_Sub41_Sub21.anInt6446 = 0;
			Class182.anInt2605 = -1;
			arg1.anInt5321++;
			return;
		    }
		}
	    }
	    int i = arg1.anInt3733;
	    int i_0_ = arg1.anInt3747;
	    int i_1_ = (arg1.anIntArray5328[-1 + arg1.anInt5334] * 128
			- -(64 * arg1.method335((byte) -40)));
	    int i_2_ = (arg1.anIntArray5331[-1 + arg1.anInt5334] * 128
			+ arg1.method335((byte) -101) * 64);
	    if (!arg2 && (i_1_ + -i > 256 || i_1_ + -i < -256
			  || (i_2_ - i_0_ ^ 0xffffffff) < -257
			  || i_2_ - i_0_ < -256)) {
		Class131_Sub41_Sub21.anInt6446 = 0;
		arg1.anInt3733 = i_1_;
		arg1.anInt3747 = i_2_;
		Class182.anInt2605 = -1;
	    } else {
		if (i >= i_1_) {
		    if (i_1_ < i) {
			if ((i_2_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
			    arg1.method347(-1408718297, 6144);
			else if ((i_2_ ^ 0xffffffff) <= (i_0_ ^ 0xffffffff))
			    arg1.method347(-1408718297, 4096);
			else
			    arg1.method347(-1408718297, 2048);
		    } else if (i_2_ > i_0_)
			arg1.method347(-1408718297, 8192);
		    else if (i_2_ < i_0_)
			arg1.method347(-1408718297, 0);
		} else if (i_0_ >= i_2_) {
		    if ((i_0_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
			arg1.method347(-1408718297, 12288);
		    else
			arg1.method347(-1408718297, 14336);
		} else
		    arg1.method347(-1408718297, 10240);
		int i_3_ = 4;
		boolean bool = true;
		if (arg1 instanceof Class23_Sub4_Sub1_Sub1)
		    bool = (((Class23_Sub4_Sub1_Sub1) arg1).aClass66_6474
			    .aBoolean852);
		if (bool) {
		    int i_4_ = arg1.anInt5260 - arg1.aClass171_5297.anInt2285;
		    if (i_4_ != 0 && arg1.anInt5255 == -1
			&& arg1.anInt5310 != 0)
			i_3_ = 2;
		    if (!arg2 && (arg1.anInt5334 ^ 0xffffffff) < -3)
			i_3_ = 6;
		    if (!arg2 && (arg1.anInt5334 ^ 0xffffffff) < -4)
			i_3_ = 8;
		} else {
		    if (!arg2 && (arg1.anInt5334 ^ 0xffffffff) < -2)
			i_3_ = 6;
		    if (!arg2 && arg1.anInt5334 > 2)
			i_3_ = 8;
		}
		if ((arg1.anInt5321 ^ 0xffffffff) < -1
		    && (arg1.anInt5334 ^ 0xffffffff) < -2) {
		    arg1.anInt5321--;
		    i_3_ = 8;
		}
		byte i_5_ = arg1.aByteArray5322[-1 + arg1.anInt5334];
		if (i_5_ != 2) {
		    if (i_5_ == 0)
			i_3_ >>= 1;
		} else
		    i_3_ <<= 1;
		if (class72.anInt951 != -1) {
		    i_3_ <<= 7;
		    if ((arg1.anInt5334 ^ 0xffffffff) != -2) {
			if ((arg1.anInt5318 ^ 0xffffffff)
			    <= (i_3_ ^ 0xffffffff)) {
			    if ((arg1.anInt5318 ^ 0xffffffff) < -1) {
				arg1.anInt5318 -= class72.anInt951;
				if ((arg1.anInt5318 ^ 0xffffffff) > -1)
				    arg1.anInt5318 = 0;
			    }
			} else {
			    arg1.anInt5318 += class72.anInt951;
			    if (arg1.anInt5318 > i_3_)
				arg1.anInt5318 = i_3_;
			}
		    } else {
			int i_6_ = arg1.anInt5318 * arg1.anInt5318;
			int i_7_ = (((i_1_ ^ 0xffffffff) <= (arg1.anInt3733
							     ^ 0xffffffff)
				     ? -arg1.anInt3733 + i_1_
				     : -i_1_ + arg1.anInt3733)
				    << -310631385);
			int i_8_ = (((i_2_ ^ 0xffffffff) > (arg1.anInt3747
							    ^ 0xffffffff)
				     ? -i_2_ + arg1.anInt3747
				     : -arg1.anInt3747 + i_2_)
				    << 1608755175);
			int i_9_ = ((i_7_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)
				    ? i_8_ : i_7_);
			int i_10_ = 2 * (class72.anInt951 * i_9_);
			if (i_6_ > i_10_)
			    arg1.anInt5318 /= 2;
			else if (i_6_ / 2 <= i_9_) {
			    if ((arg1.anInt5318 ^ 0xffffffff)
				> (i_3_ ^ 0xffffffff)) {
				arg1.anInt5318 += class72.anInt951;
				if (arg1.anInt5318 > i_3_)
				    arg1.anInt5318 = i_3_;
			    }
			} else {
			    arg1.anInt5318 -= class72.anInt951;
			    if ((arg1.anInt5318 ^ 0xffffffff) > -1)
				arg1.anInt5318 = 0;
			}
		    }
		    i_3_ = arg1.anInt5318 >> 522289895;
		    if ((i_3_ ^ 0xffffffff) > -2)
			i_3_ = 1;
		}
		Class131_Sub41_Sub21.anInt6446 = 0;
		if ((i_1_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
		    arg1.anInt3733 += i_3_;
		    Class131_Sub41_Sub21.anInt6446 |= 0x4;
		    if (arg1.anInt3733 > i_1_)
			arg1.anInt3733 = i_1_;
		} else if ((i ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
		    Class131_Sub41_Sub21.anInt6446 |= 0x8;
		    arg1.anInt3733 -= i_3_;
		    if (i_1_ > arg1.anInt3733)
			arg1.anInt3733 = i_1_;
		}
		if ((i_2_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
		    if (i_0_ > i_2_) {
			Class131_Sub41_Sub21.anInt6446 |= 0x2;
			arg1.anInt3747 -= i_3_;
			if ((arg1.anInt3747 ^ 0xffffffff)
			    > (i_2_ ^ 0xffffffff))
			    arg1.anInt3747 = i_2_;
		    }
		} else {
		    arg1.anInt3747 += i_3_;
		    Class131_Sub41_Sub21.anInt6446 |= 0x1;
		    if (arg1.anInt3747 > i_2_)
			arg1.anInt3747 = i_2_;
		}
		if ((i_3_ ^ 0xffffffff) <= -9)
		    Class182.anInt2605 = 2;
		else
		    Class182.anInt2605 = i_5_;
		if ((i_1_ ^ 0xffffffff) == (arg1.anInt3733 ^ 0xffffffff)
		    && i_2_ == arg1.anInt3747) {
		    if (arg1.anInt5330 > 0)
			arg1.anInt5330--;
		    arg1.anInt5334--;
		}
	    }
	}
    }
    
    public static void method845(int arg0) {
	aSignLink_1178 = null;
	aClass150_1186 = null;
	if (arg0 > -62)
	    method845(-120);
    }
    
    static {
	anInt1179 = 0;
	aBoolean1180 = true;
	anInt1181 = 0;
    }
}
