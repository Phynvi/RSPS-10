/* Class131_Sub2_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub32 extends Class131_Sub2
{
    public int anInt6009 = 1;
    public static int anInt6010;
    public static int anInt6011;
    public static int[][] anIntArrayArray6012
	= { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 },
	    { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 },
	    { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 },
	    { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 },
	    { 2, 4, 6, 0 } };
    public static int anInt6013;
    public static int anInt6014;
    public static int anInt6015;
    public static int anInt6016;
    public static short[][] aShortArrayArray6017
	= { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
	      2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571,
	      908, 21830, 28946, -15701, -14010 },
	    { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153,
	      -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	    { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
	      10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	    { 4626, 11146, 6439, 12, 4758, 10270 },
	    { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    public static int anInt6018;
    public int anInt6019 = 1;
    
    public static void method1625(boolean arg0) {
	try {
	    aShortArrayArray6017 = null;
	    if (arg0 != true)
		aShortArrayArray6017 = null;
	    anIntArrayArray6012 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sq.D(" + arg0 + ')');
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt6013++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (arg1 != 0)
		anInt6011 = 100;
	    if (aClass59_4097.aBoolean783) {
		int i = 1 + (anInt6009 + anInt6009);
		int i_0_ = 65536 / i;
		int i_1_ = 1 + (anInt6019 + anInt6019);
		int i_2_ = 65536 / i_1_;
		int[][][] is_3_ = new int[i][][];
		for (int i_4_ = arg0 + -anInt6009; arg0 + anInt6009 >= i_4_;
		     i_4_++) {
		    int[][] is_5_ = this.method1463(0, (byte) 124,
						    Class79.anInt1060 & i_4_);
		    int[][] is_6_ = new int[3][Class131_Sub2_Sub7.anInt5637];
		    int i_7_ = 0;
		    int i_8_ = 0;
		    int i_9_ = 0;
		    int[] is_10_ = is_5_[0];
		    int[] is_11_ = is_5_[1];
		    int[] is_12_ = is_5_[2];
		    for (int i_13_ = -anInt6019; anInt6019 >= i_13_; i_13_++) {
			int i_14_ = Class23_Sub4_Sub4.anInt5404 & i_13_;
			i_8_ += is_11_[i_14_];
			i_7_ += is_10_[i_14_];
			i_9_ += is_12_[i_14_];
		    }
		    int[] is_15_ = is_6_[0];
		    int[] is_16_ = is_6_[1];
		    int[] is_17_ = is_6_[2];
		    int i_18_ = 0;
		    while (i_18_ < Class131_Sub2_Sub7.anInt5637) {
			is_15_[i_18_] = i_2_ * i_7_ >> 153218160;
			is_16_[i_18_] = i_8_ * i_2_ >> 126082128;
			is_17_[i_18_] = i_2_ * i_9_ >> -1985318800;
			int i_19_
			    = Class23_Sub4_Sub4.anInt5404 & i_18_ - anInt6019;
			i_7_ -= is_10_[i_19_];
			i_18_++;
			i_8_ -= is_11_[i_19_];
			i_9_ -= is_12_[i_19_];
			i_19_
			    = Class23_Sub4_Sub4.anInt5404 & anInt6019 + i_18_;
			i_7_ += is_10_[i_19_];
			i_9_ += is_12_[i_19_];
			i_8_ += is_11_[i_19_];
		    }
		    is_3_[i_4_ - (-anInt6009 + arg0)] = is_6_;
		}
		int[] is_20_ = is[0];
		int[] is_21_ = is[1];
		int[] is_22_ = is[2];
		for (int i_23_ = 0;
		     ((i_23_ ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i_23_++) {
		    int i_24_ = 0;
		    int i_25_ = 0;
		    int i_26_ = 0;
		    for (int i_27_ = 0; i_27_ < i; i_27_++) {
			int[][] is_28_ = is_3_[i_27_];
			i_26_ += is_28_[2][i_23_];
			i_24_ += is_28_[0][i_23_];
			i_25_ += is_28_[1][i_23_];
		    }
		    is_20_[i_23_] = i_24_ * i_0_ >> -1549388784;
		    is_21_[i_23_] = i_0_ * i_25_ >> 1230996816;
		    is_22_[i_23_] = i_0_ * i_26_ >> -1136877232;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sq.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	while_104_:
	    do {
		do {
		    if (i != 0) {
			if (i != 1) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_104_;
			}
		    } else {
			anInt6019 = arg2.readUnsignedByte(-63);
			break while_104_;
		    }
		    anInt6009 = arg2.readUnsignedByte(arg1 ^ 0x25);
		    break while_104_;
		} while (false);
		aBoolean4093 = arg2.readUnsignedByte(97) == 1;
	    } while (false);
	    if (arg1 != -49)
		method1455(-28, (byte) -118, null);
	    anInt6018++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sq.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class94 method1626(int arg0, byte arg1) {
	try {
	    anInt6010++;
	    Class94 class94
		= ((Class94)
		   Class220.aClass214_3212.method2780(126, (long) arg0));
	    if (class94 != null)
		return class94;
	    if (arg1 != 1)
		aShortArrayArray6017 = null;
	    byte[] is
		= Class131_Sub41_Sub15.aClass158_6360.method2364(arg0, 36, 0);
	    class94 = new Class94();
	    class94.anInt1233 = arg0;
	    if (is != null)
		class94.method859(new Stream(is), -102);
	    class94.method856((byte) -48);
	    Class220.aClass214_3212.method2773(true, class94, (long) arg0);
	    return class94;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sq.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt6015++;
	    if (arg0 != -11543)
		method1626(-80, (byte) 25);
	    int[] is = aClass200_4087.method2714(arg1, (byte) 88);
	    if (aClass200_4087.aBoolean2927) {
		int i = 1 + (anInt6009 + anInt6009);
		int i_29_ = 65536 / i;
		int i_30_ = anInt6019 + anInt6019 + 1;
		int i_31_ = 65536 / i_30_;
		int[][] is_32_ = new int[i][];
		for (int i_33_ = arg1 + -anInt6009;
		     (i_33_ ^ 0xffffffff) >= (anInt6009 + arg1 ^ 0xffffffff);
		     i_33_++) {
		    int[] is_34_ = this.method1459(0, (byte) -40,
						   Class79.anInt1060 & i_33_);
		    int[] is_35_ = new int[Class131_Sub2_Sub7.anInt5637];
		    int i_36_ = 0;
		    for (int i_37_ = -anInt6019;
			 (anInt6019 ^ 0xffffffff) <= (i_37_ ^ 0xffffffff);
			 i_37_++)
			i_36_ += is_34_[Class23_Sub4_Sub4.anInt5404 & i_37_];
		    int i_38_ = 0;
		    while (i_38_ < Class131_Sub2_Sub7.anInt5637) {
			is_35_[i_38_] = i_31_ * i_36_ >> -332903920;
			i_36_ -= is_34_[(-anInt6019 + i_38_
					 & Class23_Sub4_Sub4.anInt5404)];
			i_38_++;
			i_36_ += is_34_[(i_38_ + anInt6019
					 & Class23_Sub4_Sub4.anInt5404)];
		    }
		    is_32_[-arg1 + (i_33_ - -anInt6009)] = is_35_;
		}
		for (int i_39_ = 0;
		     ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
		      < (i_39_ ^ 0xffffffff));
		     i_39_++) {
		    int i_40_ = 0;
		    for (int i_41_ = 0;
			 (i_41_ ^ 0xffffffff) > (i ^ 0xffffffff); i_41_++)
			i_40_ += is_32_[i_41_][i_39_];
		    is[i_39_] = i_29_ * i_40_ >> -1174464336;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sq.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub32() {
	super(1, false);
    }
    
    static {
	anInt6016 = 0;
    }
}
