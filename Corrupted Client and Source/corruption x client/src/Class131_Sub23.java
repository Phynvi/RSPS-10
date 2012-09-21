/* Class131_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub23 extends Class131
{
    public static int anInt4450;
    public static int anInt4451 = 0;
    public boolean aBoolean4452;
    public static int anInt4453;
    public int anInt4454;
    public int anInt4455;
    public static int anInt4456;
    public int anInt4457;
    public static int anInt4458 = 0;
    public int anInt4459;
    public static Class180 aClass180_4460 = new Class180(16);
    public int anInt4461;
    
    public static boolean method1822
	(int arg0, Class19 arg1, int arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, byte arg10) { //route find
	try {
	    anInt4456++;
	    int i = arg7;
	    int i_0_ = arg3;
	    int i_1_ = 64;
	    int i_2_ = 64;
	    int i_3_ = arg7 + -i_1_;
	    client.anIntArrayArray3487[i_1_][i_2_] = 99;
	    if (arg10 <= 22)
		aClass180_4460 = null;
	    int i_4_ = -i_2_ + arg3;
	    Class131_Sub2_Sub20.anIntArrayArray5837[i_1_][i_2_] = 0; 
	    int i_5_ = 0;
	    Class183.anIntArray2615[i_5_] = i; //ClipedX
	    int i_6_ = 0;
	    Class116.anIntArray1490[i_5_++] = i_0_; //clipedY
	    int[][] is = arg1.clipping;
	    while (i_5_ != i_6_) {
		i_0_ = Class116.anIntArray1490[i_6_];
		i = Class183.anIntArray2615[i_6_];
		int i_7_ = -arg1.anInt218 + i_0_;
		int i_8_ = -arg1.anInt206 + i;
		i_1_ = -i_3_ + i;
		i_2_ = i_0_ + -i_4_;
		i_6_ = 1 + i_6_ & 0xfff;
		int i_9_ = arg0;
	    while_211_:
		do {
		while_210_:
		    do {
		    while_209_:
			do {
			while_208_:
			    do {
				do {
				    if (i_9_ != -4) {
					if (i_9_ != -3) {
					    if ((i_9_ ^ 0xffffffff) != 1) {
						if ((i_9_ ^ 0xffffffff) != 0) {
						    if (((i_9_ ^ 0xffffffff)
							 == -1)
							|| ((i_9_ ^ 0xffffffff)
							    == -2)
							|| ((i_9_ ^ 0xffffffff)
							    == -3)
							|| ((i_9_ ^ 0xffffffff)
							    == -4)
							|| ((i_9_ ^ 0xffffffff)
							    == -10))
							break while_209_;
						    break while_210_;
						}
					    } else
						break;
					    break while_208_;
					}
				    } else {
					if (i == arg6 && i_0_ == arg4) {
					    Class131_Sub41_Sub13.anInt6330 = i;
					    Class75.anInt1022 = i_0_;
					    return true;
					}
					break while_211_;
				    }
				    if (Class138.method2120(i_0_, arg6, i,
							    -11093, arg5, 1, 1,
							    arg8, arg4)) {
					Class75.anInt1022 = i_0_;
					Class131_Sub41_Sub13.anInt6330 = i;
					return true;
				    }
				    break while_211_;
				} while (false);
				if (arg1.method242(arg6, 1, -70, arg9, i_0_, i,
						   arg8, arg4, arg5, 1)) {
				    Class75.anInt1022 = i_0_;
				    Class131_Sub41_Sub13.anInt6330 = i;
				    return true;
				}
				break while_211_;
			    } while (false);
			    if (arg1.method238(i, arg5, arg4, false, arg9,
					       i_0_, 1, arg8, arg6)) {
				Class131_Sub41_Sub13.anInt6330 = i;
				Class75.anInt1022 = i_0_;
				return true;
			    }
			    break while_211_;
			} while (false);
			if (arg1.method250(arg4, 1, arg2, arg6, arg0,
					   (byte) 119, i, i_0_)) {
			    Class75.anInt1022 = i_0_;
			    Class131_Sub41_Sub13.anInt6330 = i;
			    return true;
			}
			break while_211_;
		    } while (false);
		    if (arg1.method248(i_0_, arg2, 1, arg0, arg4, 76, arg6,
				       i)) {
			Class75.anInt1022 = i_0_;
			Class131_Sub41_Sub13.anInt6330 = i;
			return true;
		    }
		} while (false);
		i_9_ = 1 + Class131_Sub2_Sub20.anIntArrayArray5837[i_1_][i_2_];
		if (i_1_ > 0
		    && client.anIntArrayArray3487[-1 + i_1_][i_2_] == 0
		    && (is[i_8_ - 1][i_7_] & 0x42240000 ^ 0xffffffff) == -1) {
		    Class183.anIntArray2615[i_5_] = -1 + i;
		    Class116.anIntArray1490[i_5_] = i_0_;
		    i_5_ = i_5_ + 1 & 0xfff;
		    client.anIntArrayArray3487[-1 + i_1_][i_2_] = 2;
		    Class131_Sub2_Sub20.anIntArrayArray5837[-1 + i_1_][i_2_]
			= i_9_;
		}
		if (i_1_ < 127
		    && (client.anIntArrayArray3487[1 + i_1_][i_2_]
			^ 0xffffffff) == -1
		    && (is[i_8_ + 1][i_7_] & 0x60240000) == 0) {
		    Class183.anIntArray2615[i_5_] = 1 + i;
		    Class116.anIntArray1490[i_5_] = i_0_;
		    client.anIntArrayArray3487[i_1_ + 1][i_2_] = 8;
		    i_5_ = 0xfff & 1 + i_5_;
		    Class131_Sub2_Sub20.anIntArrayArray5837[1 + i_1_][i_2_]
			= i_9_;
		}
		if ((i_2_ ^ 0xffffffff) < -1
		    && client.anIntArrayArray3487[i_1_][-1 + i_2_] == 0
		    && (0x40a40000 & is[i_8_][-1 + i_7_] ^ 0xffffffff) == -1) {
		    Class183.anIntArray2615[i_5_] = i;
		    Class116.anIntArray1490[i_5_] = i_0_ - 1;
		    client.anIntArrayArray3487[i_1_][-1 + i_2_] = 1;
		    i_5_ = 0xfff & 1 + i_5_;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_1_][-1 + i_2_]
			= i_9_;
		}
		if ((i_2_ ^ 0xffffffff) > -128
		    && client.anIntArrayArray3487[i_1_][1 + i_2_] == 0
		    && (0x48240000 & is[i_8_][1 + i_7_]) == 0) {
		    Class183.anIntArray2615[i_5_] = i;
		    Class116.anIntArray1490[i_5_] = i_0_ + 1;
		    i_5_ = 1 + i_5_ & 0xfff;
		    client.anIntArrayArray3487[i_1_][1 + i_2_] = 4;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_1_][1 + i_2_]
			= i_9_;
		}
		if ((i_1_ ^ 0xffffffff) < -1 && i_2_ > 0
		    && (client.anIntArrayArray3487[i_1_ + -1][i_2_ - 1]
			^ 0xffffffff) == -1
		    && ((0x43a40000 & is[i_8_ - 1][i_7_ + -1] ^ 0xffffffff)
			== -1)
		    && (0x42240000 & is[i_8_ + -1][i_7_] ^ 0xffffffff) == -1
		    && (0x40a40000 & is[i_8_][i_7_ - 1] ^ 0xffffffff) == -1) {
		    Class183.anIntArray2615[i_5_] = i + -1;
		    Class116.anIntArray1490[i_5_] = i_0_ + -1;
		    i_5_ = 1 + i_5_ & 0xfff;
		    client.anIntArrayArray3487[i_1_ + -1][i_2_ - 1] = 3;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_1_ - 1][(i_2_
								       + -1)]
			= i_9_;
		}
		if ((i_1_ ^ 0xffffffff) > -128 && (i_2_ ^ 0xffffffff) < -1
		    && (client.anIntArrayArray3487[1 + i_1_][-1 + i_2_]
			^ 0xffffffff) == -1
		    && ((0x60e40000 & is[1 + i_8_][-1 + i_7_] ^ 0xffffffff)
			== -1)
		    && (is[i_8_ + 1][i_7_] & 0x60240000 ^ 0xffffffff) == -1
		    && (is[i_8_][i_7_ - 1] & 0x40a40000) == 0) {
		    Class183.anIntArray2615[i_5_] = i + 1;
		    Class116.anIntArray1490[i_5_] = i_0_ - 1;
		    i_5_ = 0xfff & i_5_ + 1;
		    client.anIntArrayArray3487[1 + i_1_][-1 + i_2_] = 9;
		    Class131_Sub2_Sub20.anIntArrayArray5837[1 + i_1_][(-1
								       + i_2_)]
			= i_9_;
		}
		if (i_1_ > 0 && i_2_ < 127
		    && client.anIntArrayArray3487[-1 + i_1_][i_2_ + 1] == 0
		    && (0x4e240000 & is[i_8_ - 1][1 + i_7_]) == 0
		    && (0x42240000 & is[-1 + i_8_][i_7_]) == 0
		    && (0x48240000 & is[i_8_][1 + i_7_] ^ 0xffffffff) == -1) {
		    Class183.anIntArray2615[i_5_] = i - 1;
		    Class116.anIntArray1490[i_5_] = i_0_ + 1;
		    client.anIntArrayArray3487[-1 + i_1_][1 + i_2_] = 6;
		    i_5_ = 0xfff & i_5_ + 1;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_1_ + -1][(i_2_
									+ 1)]
			= i_9_;
		}
		if ((i_1_ ^ 0xffffffff) > -128 && i_2_ < 127
		    && client.anIntArrayArray3487[i_1_ - -1][1 + i_2_] == 0
		    && ((0x78240000 & is[1 + i_8_][i_7_ - -1] ^ 0xffffffff)
			== -1)
		    && (is[i_8_ - -1][i_7_] & 0x60240000 ^ 0xffffffff) == -1
		    && (0x48240000 & is[i_8_][i_7_ + 1] ^ 0xffffffff) == -1) {
		    Class183.anIntArray2615[i_5_] = 1 + i;
		    Class116.anIntArray1490[i_5_] = 1 + i_0_;
		    client.anIntArrayArray3487[i_1_ + 1][i_2_ + 1] = 12;
		    i_5_ = 0xfff & 1 + i_5_;
		    Class131_Sub2_Sub20.anIntArrayArray5837[1 + i_1_][(i_2_
								       - -1)]
			= i_9_;
		}
	    }
	    Class75.anInt1022 = i_0_;
	    Class131_Sub41_Sub13.anInt6330 = i;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mr.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ')'));
	}
    }
    
    public static boolean method1823(Class23_Sub4 arg0, boolean arg1) {
	boolean bool = Class75.aClass68Array1023 == Class85.aClass68Array1116;
	int i = 0;
	arg0.method325((byte) -73);
	if (arg0.aShort3745 < 0 || arg0.aShort3737 < 0
	    || arg0.aShort3742 >= Class210.anInt3068
	    || arg0.aShort3735 >= Class131_Sub8_Sub1.anInt6099)
	    return false;
	for (int i_10_ = arg0.aShort3745; i_10_ <= arg0.aShort3742; i_10_++) {
	    for (int i_11_ = arg0.aShort3737; i_11_ <= arg0.aShort3735;
		 i_11_++) {
		int i_12_ = 0;
		if (i_10_ > arg0.aShort3745)
		    i_12_++;
		if (i_10_ < arg0.aShort3742)
		    i_12_ += 4;
		if (i_11_ > arg0.aShort3737)
		    i_12_ += 8;
		if (i_11_ < arg0.aShort3735)
		    i_12_ += 2;
		Class1_Sub2.method101(arg0.aByte3740, i_10_, i_11_);
		Class147 class147
		    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
		       [arg0.aByte3740][i_10_][i_11_]);
		Class82 class82
		    = Class131_Sub2_Sub9.method1512(arg0, 125, i_12_);
		Class82 class82_13_ = class147.aClass82_1958;
		if (class82_13_ == null)
		    class147.aClass82_1958 = class82;
		else {
		    for (/**/; class82_13_.aClass82_1086 != null;
			 class82_13_ = class82_13_.aClass82_1086) {
			/* empty */
		    }
		    class82_13_.aClass82_1086 = class82;
		}
		class147.aByte1953 |= i_12_;
		if (bool && Class218.anIntArrayArray3197[i_10_][i_11_] != 0)
		    i = Class218.anIntArrayArray3197[i_10_][i_11_];
	    }
	}
	if (bool && i != 0) {
	    for (int i_14_ = arg0.aShort3745; i_14_ <= arg0.aShort3742;
		 i_14_++) {
		for (int i_15_ = arg0.aShort3737; i_15_ <= arg0.aShort3735;
		     i_15_++) {
		    if (Class218.anIntArrayArray3197[i_14_][i_15_] == 0)
			Class218.anIntArrayArray3197[i_14_][i_15_] = i;
		}
	    }
	}
	if (arg1)
	    Class180.aClass23_Sub4Array2579[Class90.anInt1174++] = arg0;
	return true;
    }
    
    public static void method1824(byte arg0) {
	try {
	    int i = -36 % ((arg0 - -9) / 39);
	    aClass180_4460 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mr.C(" + arg0 + ')');
	}
    }
    
    public Class131_Sub23(int arg0, int arg1, int arg2, int arg3, int arg4,
			  boolean arg5) {
	try {
	    anInt4454 = arg2;
	    anInt4457 = arg4;
	    aBoolean4452 = arg5;
	    anInt4455 = arg0;
	    anInt4459 = arg3;
	    anInt4461 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mr.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ')'));
	}
    }
}
