/* Class131_Sub2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub7 extends Class131_Sub2
{
    public short[] aShortArray5632 = new short[257];
    public static int anInt5633;
    public int[] anIntArray5634;
    public static Class166 aClass166_5635;
    public static String aString5636;
    public static int anInt5637;
    public static int anInt5638;
    public int[] anIntArray5639;
    public static int[] anIntArray5640 = new int[128];
    public static int anInt5641;
    public int anInt5642 = 0;
    public static int anInt5643;
    public static int anInt5644;
    public static int anInt5645;
    public static int anInt5646;
    public static int anInt5647;
    public static int anInt5648;
    public int[][] anIntArrayArray5649;
    public static int anInt5650;
    
    public static void method1499(int arg0) {
	try {
	    if (Class202.anInt2944 >= arg0) {
		long l = Class208.method2749(-3913);
		Class202.anInt2944 -= l + -Class1.aLong75;
		if (Class202.anInt2944 > 0) {
		    int i = ((Class202.anInt2944 << -2045756792)
			     / Class131_Sub41_Sub17.anInt6391);
		    int i_0_ = 255 - i;
		    float f = (float) i / 255.0F;
		    float f_1_ = -f + 1.0F;
		    Class115.anInt1482
			= ((((0xff00ff & Class28.anInt289) * i
			     + ((Class91.aClass150_1186.anInt1992 & 0xff00ff)
				* i_0_))
			    & ~0xff00ff)
			   + (((Class28.anInt289 & 0xff00) * i
			       - -((0xff00 & Class91.aClass150_1186.anInt1992)
				   * i_0_))
			      & 0xff0000)) >>> -1355841944;
		    Class149.aFloat1985
			= (Class187.aFloat2662
			   + f_1_ * (-Class187.aFloat2662
				     + Class91.aClass150_1186.aFloat2009));
		    Class175.aFloat2498
			= (Class164.aFloat2191
			   + f_1_ * (Class91.aClass150_1186.aFloat2000
				     - Class164.aFloat2191));
		    Class85.aFloat1105
			= (Class91.aClass150_1186.aFloat2008
			   - Class98.aFloat1290) * f_1_ + Class98.aFloat1290;
		    Class131_Sub41_Sub20.aFloat6429
			= (f_1_ * (Class91.aClass150_1186.aFloat2007
				   - PacketStream.aFloat6137)
			   + PacketStream.aFloat6137);
		    Class131_Sub2_Sub26.anInt5927
			= (((i_0_ * (Class91.aClass150_1186.anInt1999 & 0xff00)
			     + i * (Class131_Sub2_Sub4.anInt5597 & 0xff00))
			    & 0xff0000)
			   + ((i * (Class131_Sub2_Sub4.anInt5597 & 0xff00ff)
			       + ((0xff00ff & Class91.aClass150_1186.anInt1999)
				  * i_0_))
			      & ~0xff00ff)) >>> -449608984;
		    Class23_Sub5.aFloat3754
			= (Class133.aFloat1801
			   + (Class91.aClass150_1186.aFloat2004
			      - Class133.aFloat1801) * f_1_);
		    Class218.aFloat3198
			= (Class69.aFloat929
			   + f_1_ * (Class91.aClass150_1186.aFloat1998
				     - Class69.aFloat929));
		    Class111.anInt3273
			= ((i * Class173.anInt2460
			    + i_0_ * Class91.aClass150_1186.anInt2001)
			   >> -859141368);
		    if (Class155.aClass83_2065
			!= Class91.aClass150_1186.aClass83_1993)
			Class23_Sub1_Sub2.aClass83_5145
			    = (Class214.aClass130_3128.method1184
			       (Class155.aClass83_2065,
				Class91.aClass150_1186.aClass83_1993, f_1_,
				Class23_Sub1_Sub2.aClass83_5145));
		} else {
		    Class115.anInt1482 = Class91.aClass150_1186.anInt1992;
		    Class23_Sub1_Sub2.aClass83_5145
			= Class91.aClass150_1186.aClass83_1993;
		    Class149.aFloat1985 = Class91.aClass150_1186.aFloat2009;
		    Class131_Sub41_Sub20.aFloat6429
			= Class91.aClass150_1186.aFloat2007;
		    Class202.anInt2944 = -1;
		    Class85.aFloat1105 = Class91.aClass150_1186.aFloat2008;
		    Class23_Sub5.aFloat3754
			= Class91.aClass150_1186.aFloat2004;
		    Class131_Sub2_Sub26.anInt5927
			= Class91.aClass150_1186.anInt1999;
		    Class218.aFloat3198 = Class91.aClass150_1186.aFloat1998;
		    Class111.anInt3273 = Class91.aClass150_1186.anInt2001;
		    Class175.aFloat2498 = Class91.aClass150_1186.aFloat2000;
		}
		Class1.aLong75 = l;
	    }
	    anInt5644++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ef.F(" + arg0 + ')');
	}
    }
    
    public void method1500(int arg0) {
	try {
	    anInt5645++;
	    if (arg0 == 754461868) {
		int[] is = anIntArrayArray5649[0];
		int[] is_2_ = anIntArrayArray5649[1];
		int[] is_3_
		    = anIntArrayArray5649[anIntArrayArray5649.length + -2];
		int[] is_4_
		    = anIntArrayArray5649[-1 + anIntArrayArray5649.length];
		anIntArray5634 = new int[] { is[0] + -is_2_[0] + is[0],
					     is[1] + -is_2_[1] + is[1] };
		anIntArray5639
		    = new int[] { is_3_[0] - is_4_[0] + is_3_[0],
				  is_3_[1] - (-is_3_[1] + is_4_[1]) };
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ef.H(" + arg0 + ')');
	}
    }
    
    public int[] method1501(int arg0, int arg1) {
	try {
	    anInt5650++;
	    if ((arg1 ^ 0xffffffff) > -1)
		return anIntArray5634;
	    if (arg0 != 2947)
		anIntArray5640 = null;
	    if ((anIntArrayArray5649.length ^ 0xffffffff)
		>= (arg1 ^ 0xffffffff))
		return anIntArray5639;
	    return anIntArrayArray5649[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ef.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1471(int arg0) {
	try {
	    if (anIntArrayArray5649 == null)
		anIntArrayArray5649
		    = new int[][] { new int[2], { 4096, 4096 } };
	    anInt5648++;
	    if (anIntArrayArray5649.length < 2)
		throw new RuntimeException
			  ("Curve operation requires at least two markers");
	    if ((anInt5642 ^ 0xffffffff) == -3)
		method1500(754461868);
	    Class103.method904(arg0 ^ arg0);
	    method1503((byte) -84);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ef.J(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2_Sub7() {
	super(1, true);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5638++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -72);
	    if (arg0 != -11543)
		return null;
	    if (aClass200_4087.aBoolean2927) {
		int[] is_5_ = this.method1459(0, (byte) -40, arg1);
		for (int i = 0; i < anInt5637; i++) {
		    int i_6_ = is_5_[i] >> 385990244;
		    if (i_6_ < 0)
			i_6_ = 0;
		    if ((i_6_ ^ 0xffffffff) < -257)
			i_6_ = 256;
		    is[i] = aShortArray5632[i_6_];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ef.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1502(int arg0) {
	try {
	    aString5636 = null;
	    anIntArray5640 = null;
	    if (arg0 <= 30)
		method1502(-53);
	    aClass166_5635 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ef.G(" + arg0 + ')');
	}
    }
    
    public void method1503(byte arg0) {
	try {
	    if (arg0 <= -42) {
		int i = anInt5642;
	    while_29_:
		do {
		    do {
			if (i != 2) {
			    if (i != 1)
				break;
			} else {
			    for (i = 0; i < 257; i++) {
				int i_7_ = i << -581857276;
				int i_8_;
				for (i_8_ = 1;
				     ((anIntArrayArray5649.length - 1
				       ^ 0xffffffff)
				      < (i_8_ ^ 0xffffffff));
				     i_8_++) {
				    if (anIntArrayArray5649[i_8_][0] > i_7_)
					break;
				}
				int[] is = anIntArrayArray5649[-1 + i_8_];
				int[] is_9_ = anIntArrayArray5649[i_8_];
				int i_10_ = method1501(2947, -2 + i_8_)[1];
				int i_11_ = is[1];
				int i_12_ = is_9_[1];
				int i_13_ = method1501(2947, 1 + i_8_)[1];
				int i_14_ = ((-is[0] + i_7_ << 754461868)
					     / (is_9_[0] - is[0]));
				int i_15_ = i_14_ * i_14_ >> 1416341356;
				int i_16_ = i_11_ + -i_10_ + (-i_12_ + i_13_);
				int i_17_ = -i_16_ + (i_10_ - i_11_);
				int i_18_ = i_12_ + -i_10_;
				int i_19_ = i_11_;
				int i_20_
				    = (i_15_ * (i_14_ * i_16_ >> -1852159476)
				       >> 121051660);
				int i_21_ = i_15_ * i_17_ >> 1636999820;
				int i_22_ = i_14_ * i_18_ >> 760564844;
				int i_23_ = i_21_ + (i_20_ - -i_22_) - -i_19_;
				if (i_23_ <= -32768)
				    i_23_ = -32767;
				if (i_23_ >= 32768)
				    i_23_ = 32767;
				aShortArray5632[i] = (short) i_23_;
			    }
			    break while_29_;
			}
			for (i = 0; (i ^ 0xffffffff) > -258; i++) {
			    int i_24_ = i << -398883100;
			    int i_25_;
			    for (i_25_ = 1; ((i_25_ ^ 0xffffffff)
					     > (-1 + anIntArrayArray5649.length
						^ 0xffffffff)); i_25_++) {
				if ((anIntArrayArray5649[i_25_][0]
				     ^ 0xffffffff)
				    < (i_24_ ^ 0xffffffff))
				    break;
			    }
			    int[] is = anIntArrayArray5649[-1 + i_25_];
			    int[] is_26_ = anIntArrayArray5649[i_25_];
			    int i_27_ = ((i_24_ - is[0] << -421715476)
					 / (-is[0] + is_26_[0]));
			    int i_28_
				= (-(Class153_Sub1.anIntArray4763
				     [(i_27_ & 0x1ff7) >> -1414701723]) + 4096
				   >> 1979601281);
			    int i_29_ = -i_28_ + 4096;
			    int i_30_ = (is_26_[1] * i_28_ + i_29_ * is[1]
					 >> 421474188);
			    if ((i_30_ ^ 0xffffffff) >= 32767)
				i_30_ = -32767;
			    if ((i_30_ ^ 0xffffffff) <= -32769)
				i_30_ = 32767;
			    aShortArray5632[i] = (short) i_30_;
			}
			break while_29_;
		    } while (false);
		    for (i = 0; i < 257; i++) {
			int i_31_ = i << 1566443396;
			int i_32_;
			for (i_32_ = 1;
			     ((anIntArrayArray5649.length - 1 ^ 0xffffffff)
			      < (i_32_ ^ 0xffffffff));
			     i_32_++) {
			    if (anIntArrayArray5649[i_32_][0] > i_31_)
				break;
			}
			int[] is = anIntArrayArray5649[-1 + i_32_];
			int[] is_33_ = anIntArrayArray5649[i_32_];
			int i_34_ = ((i_31_ - is[0] << -1765641908)
				     / (is_33_[0] - is[0]));
			int i_35_ = 4096 - i_34_;
			int i_36_ = (is[1] * i_35_ - -(i_34_ * is_33_[1])
				     >> 161804300);
			if (i_36_ <= -32768)
			    i_36_ = -32767;
			if ((i_36_ ^ 0xffffffff) <= -32769)
			    i_36_ = 32767;
			aShortArray5632[i] = (short) i_36_;
		    }
		} while (false);
		anInt5643++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ef.B(" + arg0 + ')');
	}
    }
    
    public static void method1504(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, boolean arg5) {
	Class210.anInt3068 = arg1;
	Class131_Sub8_Sub1.anInt6099 = arg2;
	Class131_Sub2_Sub32.anInt6011 = arg3;
	PacketStream.aClass147ArrayArrayArray6124
	    = (new Class147[arg0][Class210.anInt3068]
	       [Class131_Sub8_Sub1.anInt6099]);
	Class131_Sub2_Sub37.aClass68Array6057 = new Class68[arg0];
	if (arg4) {
	    Class82.aClass147ArrayArrayArray1092
		= (new Class147[1][Class210.anInt3068]
		   [Class131_Sub8_Sub1.anInt6099]);
	    Class218.anIntArrayArray3197
		= new int[Class210.anInt3068][Class131_Sub8_Sub1.anInt6099];
	    Class85.aClass68Array1116 = new Class68[1];
	} else {
	    Class82.aClass147ArrayArrayArray1092 = null;
	    Class218.anIntArrayArray3197 = null;
	    Class85.aClass68Array1116 = null;
	}
	if (arg5) {
	    Class64.anIntArrayArrayArray810 = new int[arg0][arg1][arg2];
	    Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707
		= new Class131_Sub8_Sub1[255];
	    Class112.aBooleanArray1441 = new boolean[255];
	    Class172.anInt2293 = 0;
	} else {
	    Class64.anIntArrayArrayArray810 = null;
	    Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707 = null;
	    Class112.aBooleanArray1441 = null;
	    Class172.anInt2293 = 0;
	}
	Class128.method1140(false);
	Class213.aClass203Array3121 = new Class203[500];
	Class23_Sub2_Sub1.anInt4995 = 0;
	Class131_Sub41_Sub18.aClass203Array6404 = new Class203[500];
	Class131_Sub41_Sub21.anInt6448 = 0;
	Class163.anIntArrayArrayArray2186
	    = (new int[arg0][Class210.anInt3068 + 1]
	       [Class131_Sub8_Sub1.anInt6099 + 1]);
	Class180.aClass23_Sub4Array2579 = new Class23_Sub4[5000];
	Class90.anInt1174 = 0;
	Class68.aBooleanArrayArray920
	    = (new boolean
	       [(Class131_Sub2_Sub32.anInt6011 + Class131_Sub2_Sub32.anInt6011
		 + 1)]
	       [(Class131_Sub2_Sub32.anInt6011 + Class131_Sub2_Sub32.anInt6011
		 + 1)]);
	Class23_Sub5_Sub2.aBooleanArrayArray5059
	    = (new boolean
	       [(Class131_Sub2_Sub32.anInt6011 + Class131_Sub2_Sub32.anInt6011
		 + 2)]
	       [(Class131_Sub2_Sub32.anInt6011 + Class131_Sub2_Sub32.anInt6011
		 + 2)]);
	Class153_Sub1.aClass120_4757 = null;
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if ((arg0 ^ 0xffffffff) == -1) {
		anInt5642 = arg2.readUnsignedByte(115);
		anIntArrayArray5649 = new int[arg2.readUnsignedByte(arg1 + -17)][2];
		for (int i = 0; i < anIntArrayArray5649.length; i++) {
		    anIntArrayArray5649[i][0] = arg2.readUnsignedShort(8104);
		    anIntArrayArray5649[i][1] = arg2.readUnsignedShort(8104);
		}
	    }
	    if (arg1 != -49)
		method1503((byte) 119);
	    anInt5646++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ef.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1505(int[] arg0, int arg1, int arg2) {
	anInt5641++;
	for (int i = 31; (i ^ 0xffffffff) < -1; i--) {
	    int i_37_ = 36 * i;
	    for (int i_38_ = 35; (i_38_ ^ 0xffffffff) < -1; i_38_--) {
		if (arg0[i_38_ - -i_37_] == 0
		    && (arg0[-1 + i_38_ + i_37_ - 36] ^ 0xffffffff) != -1)
		    arg0[i_37_ + i_38_] = arg1;
	    }
	}
	if (arg2 != -22286)
	    method1502(-86);
    }
    
    static {
	anInt5633 = 999999;
    }
}
