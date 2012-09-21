/* Class154_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class154_Sub1 extends Class154
{
    public Class7 aClass7_4787;
    public short aShort4788;
    public byte[] aByteArray4789;
    public boolean aBoolean4790;
    public Class95 aClass95_4791;
    public int anInt4792;
    public int anInt4793;
    public boolean aBoolean4794;
    public static float aFloat4795;
    public Interface2 anInterface2_4796;
    public short aShort4797;
    public byte aByte4798;
    public int anInt4799 = 0;
    public int[][] anIntArrayArray4800;
    public static float aFloat4801;
    public Class109 aClass109_4802;
    public int[] anIntArray4803;
    public static long[] aLongArray4804;
    public static RawStream aClass131_Sub15_Sub1_4805
	= new RawStream(8192);
    public Class130_Sub2 aClass130_Sub2_4806;
    public Class7 aClass7_4807;
    public int[][] anIntArrayArray4808;
    public short aShort4809;
    public Interface7 anInterface7_4810;
    public short[] aShortArray4811;
    public short aShort4812;
    public Class7 aClass7_4813;
    public float[] aFloatArray4814;
    public Class41[] aClass41Array4815;
    public short aShort4816;
    public float[] aFloatArray4817;
    public short aShort4818;
    public Class104[] aClass104Array4819;
    public short[] aShortArray4820;
    public short[] aShortArray4821;
    public int anInt4822;
    public static float aFloat4823;
    public short[] aShortArray4824;
    public short[] aShortArray4825;
    public short[] aShortArray4826;
    public short aShort4827;
    public byte[] aByteArray4828;
    public int[] anIntArray4829;
    public short[] aShortArray4830;
    public int[] anIntArray4831;
    public short[] aShortArray4832;
    public static float aFloat4833;
    public Class7 aClass7_4834;
    public short[] aShortArray4835;
    public static float aFloat4836;
    public int[] anIntArray4837;
    public int anInt4838;
    public short aShort4839;
    public int[] anIntArray4840;
    public int anInt4841;
    public short aShort4842;
    public short[] aShortArray4843;
    public static float aFloat4844;
    public short[] aShortArray4845;
    public static boolean aBoolean4846;
    public static int[] anIntArray4847;
    public static int[] anIntArray4848 = new int[1];
    public static int[] anIntArray4849;
    public static int[] anIntArray4850;
    public static int anInt4851;
    public static int[] anIntArray4852;
    public static int anInt4853;
    public static int anInt4854;
    
    public void method2260(short arg0, short arg1) {
	for (int i = 0; (i ^ 0xffffffff) > (anInt4799 ^ 0xffffffff); i++) {
	    if ((arg0 ^ 0xffffffff) == (aShortArray4826[i] ^ 0xffffffff))
		aShortArray4826[i] = arg1;
	}
	if (null != aClass7_4807)
	    aClass7_4807.anInterface2_101 = null;
    }
    
    public void method2251(int arg0) {
	int i = Class31.anIntArray434[arg0];
	int i_0_ = Class31.anIntArray425[arg0];
	for (int i_1_ = 0; anInt4792 > i_1_; i_1_++) {
	    int i_2_ = (anIntArray4837[i_1_] * i_0_ + i * anIntArray4803[i_1_]
			>> -1688941393);
	    anIntArray4803[i_1_]
		= (i_0_ * anIntArray4803[i_1_] + -(anIntArray4837[i_1_] * i)
		   >> -846454929);
	    anIntArray4837[i_1_] = i_2_;
	}
	aBoolean4790 = false;
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
    }
    
    public short method2290(int arg0, long arg1, int arg2, int arg3, byte arg4,
			    int arg5, int arg6, float arg7, float arg8,
			    Class116 arg9) {
	short i;
	try {
	    int i_3_ = anIntArray4840[arg2];
	    int i_4_ = anIntArray4840[arg2 - -1];
	    int i_5_ = 0;
	    for (int i_6_ = i_3_; (i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff);
		 i_6_++) {
		short i_7_ = aShortArray4824[i_6_];
		if (-1 == (i_7_ ^ 0xffffffff)) {
		    i_5_ = i_6_;
		    break;
		}
		if ((aLongArray4804[i_6_] ^ 0xffffffffffffffffL)
		    == (arg1 ^ 0xffffffffffffffffL))
		    return (short) (-1 + i_7_);
	    }
	    int i_8_ = 98 / ((-38 - arg4) / 57);
	    aShortArray4824[i_5_] = (short) (1 + anInt4793);
	    aLongArray4804[i_5_] = arg1;
	    aShortArray4820[anInt4793] = (short) arg0;
	    aShortArray4821[anInt4793] = (short) arg6;
	    aShortArray4825[anInt4793] = (short) arg3;
	    aByteArray4828[anInt4793] = (byte) arg5;
	    aFloatArray4814[anInt4793] = arg8;
	    aFloatArray4817[anInt4793] = arg7;
	    i = (short) anInt4793++;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2249() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(90);
	    i = aShort4809;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2263() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(-120);
	    i = aShort4788;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2252() {
	short i;
	try {
	    i = aShort4797;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2291(int arg0, short arg1, byte arg2, int arg3,
			  int arg4) {
	int i;
	try {
	    if (arg4 != 255)
		anInt4854 = 65;
	    int i_9_ = (Class131_Sub2_Sub37.anIntArray6058
			[method2301((byte) -124, arg0, arg3)]);
	    if (arg1 != -1) {
		Class42 class42 = aClass130_Sub2_4806.anInterface4_3303
				      .method10(-19907, arg1 & 0xffff);
		int i_10_ = class42.aByte570 & 0xff;
		if ((i_10_ ^ 0xffffffff) != -1) {
		    int i_11_;
		    if (arg3 >= 0) {
			if ((arg3 ^ 0xffffffff) >= -128)
			    i_11_ = arg3 * 131586;
			else
			    i_11_ = 16777215;
		    } else
			i_11_ = 0;
		    if (i_10_ == 256)
			i_9_ = i_11_;
		    else {
			int i_12_ = i_10_;
			int i_13_ = 256 + -i_10_;
			i_9_ = (((0xff00 & i_11_) * i_12_ - -(i_13_ * (0xff00
								       & i_9_))
				 & 0xff0000)
				+ (~0xff00ff & ((i_11_ & 0xff00ff) * i_12_
						- -((i_9_ & 0xff00ff)
						    * i_13_)))) >> -246596632;
		    }
		}
		int i_14_ = 0xff & class42.aByte577;
		if (i_14_ != 0) {
		    i_14_ += 256;
		    int i_15_ = ((i_9_ & 0xff0000) >> 1764745008) * i_14_;
		    if (i_15_ > 65535)
			i_15_ = 65535;
		    int i_16_ = ((0xff00 & i_9_) >> -2114366776) * i_14_;
		    if (65535 < i_16_)
			i_16_ = 65535;
		    int i_17_ = i_14_ * (i_9_ & 0xff);
		    if (-65536 > (i_17_ ^ 0xffffffff))
			i_17_ = 65535;
		    i_9_ = (i_17_ >> -2056476632) + ((i_16_ & 0xff00)
						     + (i_15_ << 1022141352
							& 0xff0030));
		}
	    }
	    i = 255 - (arg2 & 0xff) + (i_9_ << -1333042264);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method2257(int arg0, int arg1, int arg2, int arg3) {
	if (0 == arg0) {
	    anInt4854 = 0;
	    anInt4851 = 0;
	    int i = 0;
	    anInt4853 = 0;
	    for (int i_18_ = 0;
		 (anInt4792 ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
		anInt4851 += anIntArray4837[i_18_];
		anInt4853 += anIntArray4803[i_18_];
		i++;
		anInt4854 += anIntArray4831[i_18_];
	    }
	    if (-1 > (i ^ 0xffffffff)) {
		anInt4854 = anInt4854 / i - -arg3;
		anInt4853 = anInt4853 / i + arg2;
		anInt4851 = arg1 + anInt4851 / i;
	    } else {
		anInt4854 = arg3;
		anInt4853 = arg2;
		anInt4851 = arg1;
	    }
	} else if ((arg0 ^ 0xffffffff) == -2) {
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4792 ^ 0xffffffff); i++) {
		anIntArray4837[i] += arg1;
		anIntArray4803[i] += arg2;
		anIntArray4831[i] += arg3;
	    }
	} else if (arg0 == 2) {
	    for (int i = 0; i < anInt4792; i++) {
		anIntArray4837[i] -= anInt4851;
		anIntArray4803[i] -= anInt4853;
		anIntArray4831[i] -= anInt4854;
		if (0 != arg3) {
		    int i_19_ = Class31.anIntArray434[arg3];
		    int i_20_ = Class31.anIntArray425[arg3];
		    int i_21_ = ((anIntArray4837[i] * i_20_
				  + (i_19_ * anIntArray4803[i] + 32767))
				 >> -67683313);
		    anIntArray4803[i]
			= (32767 + anIntArray4803[i] * i_20_
			   - anIntArray4837[i] * i_19_) >> -558765969;
		    anIntArray4837[i] = i_21_;
		}
		if ((arg1 ^ 0xffffffff) != -1) {
		    int i_22_ = Class31.anIntArray434[arg1];
		    int i_23_ = Class31.anIntArray425[arg1];
		    int i_24_ = ((-(i_22_ * anIntArray4831[i])
				  + i_23_ * anIntArray4803[i] + 32767)
				 >> 1882981647);
		    anIntArray4831[i]
			= (32767 + anIntArray4803[i] * i_22_
			   - -(i_23_ * anIntArray4831[i])) >> 1623559599;
		    anIntArray4803[i] = i_24_;
		}
		if (0 != arg2) {
		    int i_25_ = Class31.anIntArray434[arg2];
		    int i_26_ = Class31.anIntArray425[arg2];
		    int i_27_ = ((i_26_ * anIntArray4837[i]
				  + (i_25_ * anIntArray4831[i] - -32767))
				 >> 1054477679);
		    anIntArray4831[i] = (-(i_25_ * anIntArray4837[i])
					 + (i_26_ * anIntArray4831[i]
					    - -32767)) >> -203640849;
		    anIntArray4837[i] = i_27_;
		}
		anIntArray4837[i] += anInt4851;
		anIntArray4803[i] += anInt4853;
		anIntArray4831[i] += anInt4854;
	    }
	} else if (-4 == (arg0 ^ 0xffffffff)) {
	    for (int i = 0; anInt4792 > i; i++) {
		anIntArray4837[i] -= anInt4851;
		anIntArray4803[i] -= anInt4853;
		anIntArray4831[i] -= anInt4854;
		anIntArray4837[i] = anIntArray4837[i] * arg1 / 128;
		anIntArray4803[i] = arg2 * anIntArray4803[i] / 128;
		anIntArray4831[i] = anIntArray4831[i] * arg3 / 128;
		anIntArray4837[i] += anInt4851;
		anIntArray4803[i] += anInt4853;
		anIntArray4831[i] += anInt4854;
	    }
	} else if (5 == arg0) {
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4799 ^ 0xffffffff); i++) {
		int i_28_ = (0xff & aByteArray4789[i]) + 8 * arg1;
		if (0 <= i_28_) {
		    if ((i_28_ ^ 0xffffffff) < -256)
			i_28_ = 255;
		} else
		    i_28_ = 0;
		aByteArray4789[i] = (byte) i_28_;
	    }
	    if (null != aClass7_4807)
		aClass7_4807.anInterface2_101 = null;
	} else if (-8 == (arg0 ^ 0xffffffff)) {
	    for (int i = 0; (anInt4799 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		int i_29_ = 0xffff & aShortArray4826[i];
		int i_30_ = (0xff96 & i_29_) >> 1470730058;
		int i_31_ = i_29_ >> -1868876505 & 0x7;
		i_31_ += arg2 / 4;
		int i_32_ = i_29_ & 0x7f;
		i_30_ = i_30_ + arg1 & 0x3f;
		i_32_ += arg3;
		if (-1 < (i_31_ ^ 0xffffffff))
		    i_31_ = 0;
		else if (i_31_ > 7)
		    i_31_ = 7;
		if (i_32_ < 0)
		    i_32_ = 0;
		else if (i_32_ > 127)
		    i_32_ = 127;
		aShortArray4826[i]
		    = (short) (Cryption.method2105
			       (i_32_,
				Cryption.method2105(i_30_ << 1006300330,
						    i_31_ << 353386055)));
	    }
	    if (aClass7_4807 != null)
		aClass7_4807.anInterface2_101 = null;
	}
    }
    
    public void method2243(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   int arg5, boolean arg6) {
	int i = arg1.length;
	if ((arg0 ^ 0xffffffff) == -1) {
	    arg2 <<= 4;
	    arg4 <<= 4;
	    arg3 <<= 4;
	    anInt4851 = 0;
	    int i_33_ = 0;
	    anInt4854 = 0;
	    anInt4853 = 0;
	    for (int i_34_ = 0; (i ^ 0xffffffff) < (i_34_ ^ 0xffffffff);
		 i_34_++) {
		int i_35_ = arg1[i_34_];
		if ((anIntArrayArray4800.length ^ 0xffffffff)
		    < (i_35_ ^ 0xffffffff)) {
		    int[] is = anIntArrayArray4800[i_35_];
		    for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
			int i_37_ = is[i_36_];
			anInt4851 += anIntArray4837[i_37_];
			anInt4853 += anIntArray4803[i_37_];
			anInt4854 += anIntArray4831[i_37_];
			i_33_++;
		    }
		}
	    }
	    if (0 < i_33_) {
		anInt4853 = arg3 + anInt4853 / i_33_;
		anInt4851 = arg2 + anInt4851 / i_33_;
		anInt4854 = anInt4854 / i_33_ - -arg4;
	    } else {
		anInt4853 = arg3;
		anInt4854 = arg4;
		anInt4851 = arg2;
	    }
	} else if ((arg0 ^ 0xffffffff) == -2) {
	    arg2 <<= 4;
	    arg4 <<= 4;
	    arg3 <<= 4;
	    for (int i_38_ = 0; i_38_ < i; i_38_++) {
		int i_39_ = arg1[i_38_];
		if (anIntArrayArray4800.length > i_39_) {
		    int[] is = anIntArrayArray4800[i_39_];
		    for (int i_40_ = 0;
			 (i_40_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
			 i_40_++) {
			int i_41_ = is[i_40_];
			anIntArray4837[i_41_] += arg2;
			anIntArray4803[i_41_] += arg3;
			anIntArray4831[i_41_] += arg4;
		    }
		}
	    }
	} else if (2 == arg0) {
	    for (int i_42_ = 0; i > i_42_; i_42_++) {
		int i_43_ = arg1[i_42_];
		if ((anIntArrayArray4800.length ^ 0xffffffff)
		    < (i_43_ ^ 0xffffffff)) {
		    int[] is = anIntArrayArray4800[i_43_];
		    if ((0x1 & arg5 ^ 0xffffffff) != -1) {
			for (int i_44_ = 0;
			     (is.length ^ 0xffffffff) < (i_44_ ^ 0xffffffff);
			     i_44_++) {
			    int i_45_ = is[i_44_];
			    anIntArray4837[i_45_] -= anInt4851;
			    anIntArray4803[i_45_] -= anInt4853;
			    anIntArray4831[i_45_] -= anInt4854;
			    if (arg2 != 0) {
				int i_46_ = Class31.anIntArray434[arg2];
				int i_47_ = Class31.anIntArray425[arg2];
				int i_48_ = ((-(anIntArray4831[i_45_] * i_46_)
					      + anIntArray4803[i_45_] * i_47_
					      + 32767)
					     >> -432789233);
				anIntArray4831[i_45_]
				    = (anIntArray4803[i_45_] * i_46_
				       + (anIntArray4831[i_45_] * i_47_
					  + 32767)) >> 2110041967;
				anIntArray4803[i_45_] = i_48_;
			    }
			    if (arg4 != 0) {
				int i_49_ = Class31.anIntArray434[arg4];
				int i_50_ = Class31.anIntArray425[arg4];
				int i_51_
				    = (32767 + (anIntArray4803[i_45_] * i_49_
						- -(i_50_
						    * anIntArray4837[i_45_]))
				       >> 1355298127);
				anIntArray4803[i_45_]
				    = (-(i_49_ * anIntArray4837[i_45_])
				       + (i_50_ * anIntArray4803[i_45_]
					  - -32767)) >> -1548474097;
				anIntArray4837[i_45_] = i_51_;
			    }
			    if (arg3 != 0) {
				int i_52_ = Class31.anIntArray434[arg3];
				int i_53_ = Class31.anIntArray425[arg3];
				int i_54_
				    = ((32767
					+ (i_53_ * anIntArray4837[i_45_]
					   + i_52_ * anIntArray4831[i_45_]))
				       >> -613186353);
				anIntArray4831[i_45_]
				    = (-(anIntArray4837[i_45_] * i_52_)
				       + (i_53_ * anIntArray4831[i_45_]
					  + 32767)) >> -44639697;
				anIntArray4837[i_45_] = i_54_;
			    }
			    anIntArray4837[i_45_] += anInt4851;
			    anIntArray4803[i_45_] += anInt4853;
			    anIntArray4831[i_45_] += anInt4854;
			}
		    } else {
			for (int i_55_ = 0; is.length > i_55_; i_55_++) {
			    int i_56_ = is[i_55_];
			    anIntArray4837[i_56_] -= anInt4851;
			    anIntArray4803[i_56_] -= anInt4853;
			    anIntArray4831[i_56_] -= anInt4854;
			    if (-1 != (arg4 ^ 0xffffffff)) {
				int i_57_ = Class31.anIntArray434[arg4];
				int i_58_ = Class31.anIntArray425[arg4];
				int i_59_
				    = ((32767
					+ (i_58_ * anIntArray4837[i_56_]
					   + i_57_ * anIntArray4803[i_56_]))
				       >> 1036786095);
				anIntArray4803[i_56_]
				    = (-(anIntArray4837[i_56_] * i_57_)
				       + i_58_ * anIntArray4803[i_56_]
				       + 32767) >> -2084089297;
				anIntArray4837[i_56_] = i_59_;
			    }
			    if (arg2 != 0) {
				int i_60_ = Class31.anIntArray434[arg2];
				int i_61_ = Class31.anIntArray425[arg2];
				int i_62_ = ((-(i_60_ * anIntArray4831[i_56_])
					      + (anIntArray4803[i_56_] * i_61_
						 - -32767))
					     >> -1454624113);
				anIntArray4831[i_56_]
				    = (32767 + (anIntArray4803[i_56_] * i_60_
						- -(i_61_
						    * anIntArray4831[i_56_]))
				       >> -376850673);
				anIntArray4803[i_56_] = i_62_;
			    }
			    if (-1 != (arg3 ^ 0xffffffff)) {
				int i_63_ = Class31.anIntArray434[arg3];
				int i_64_ = Class31.anIntArray425[arg3];
				int i_65_
				    = ((32767 + anIntArray4831[i_56_] * i_63_
					- -(i_64_ * anIntArray4837[i_56_]))
				       >> 1298153167);
				anIntArray4831[i_56_]
				    = (i_64_ * anIntArray4831[i_56_]
				       - (anIntArray4837[i_56_] * i_63_
					  + -32767)) >> -1749456625;
				anIntArray4837[i_56_] = i_65_;
			    }
			    anIntArray4837[i_56_] += anInt4851;
			    anIntArray4803[i_56_] += anInt4853;
			    anIntArray4831[i_56_] += anInt4854;
			}
		    }
		}
	    }
	    if (arg6) {
		for (int i_66_ = 0; (i ^ 0xffffffff) < (i_66_ ^ 0xffffffff);
		     i_66_++) {
		    int i_67_ = arg1[i_66_];
		    if ((anIntArrayArray4800.length ^ 0xffffffff)
			< (i_67_ ^ 0xffffffff)) {
			int[] is = anIntArrayArray4800[i_67_];
			for (int i_68_ = 0;
			     (is.length ^ 0xffffffff) < (i_68_ ^ 0xffffffff);
			     i_68_++) {
			    int i_69_ = is[i_68_];
			    int i_70_ = anIntArray4840[i_69_];
			    int i_71_ = anIntArray4840[1 + i_69_];
			    for (int i_72_ = i_70_;
				 (i_71_ ^ 0xffffffff) < (i_72_ ^ 0xffffffff);
				 i_72_++) {
				int i_73_ = aShortArray4824[i_72_] - 1;
				if (-1 == i_73_)
				    break;
				if (-1 != (arg4 ^ 0xffffffff)) {
				    int i_74_ = Class31.anIntArray434[arg4];
				    int i_75_ = Class31.anIntArray425[arg4];
				    int i_76_
					= ((32767
					    + (aShortArray4821[i_73_] * i_74_
					       + (aShortArray4820[i_73_]
						  * i_75_)))
					   >> 1665952623);
				    aShortArray4821[i_73_]
					= (short) ((-(aShortArray4820[i_73_]
						      * i_74_)
						    + ((aShortArray4821[i_73_]
							* i_75_)
						       + 32767))
						   >> -2143239505);
				    aShortArray4820[i_73_] = (short) i_76_;
				}
				if (0 != arg2) {
				    int i_77_ = Class31.anIntArray434[arg2];
				    int i_78_ = Class31.anIntArray425[arg2];
				    int i_79_
					= (32767 + (-(aShortArray4825[i_73_]
						      * i_77_)
						    + (aShortArray4821[i_73_]
						       * i_78_))
					   >> 1378015151);
				    aShortArray4825[i_73_]
					= (short) ((32767
						    + (aShortArray4825[i_73_]
						       * i_78_)
						    + (aShortArray4821[i_73_]
						       * i_77_))
						   >> 301868655);
				    aShortArray4821[i_73_] = (short) i_79_;
				}
				if (-1 != (arg3 ^ 0xffffffff)) {
				    int i_80_ = Class31.anIntArray434[arg3];
				    int i_81_ = Class31.anIntArray425[arg3];
				    int i_82_
					= ((aShortArray4820[i_73_] * i_81_
					    + i_80_ * aShortArray4825[i_73_]
					    - -32767)
					   >> -893259377);
				    aShortArray4825[i_73_]
					= (short) ((32767
						    + (i_81_ * (aShortArray4825
								[i_73_])
						       + -(i_80_
							   * (aShortArray4820
							      [i_73_]))))
						   >> -1760621713);
				    aShortArray4820[i_73_] = (short) i_82_;
				}
			    }
			}
		    }
		}
		if (aClass7_4787 == null && null != aClass7_4807)
		    aClass7_4807.anInterface2_101 = null;
		if (aClass7_4787 != null)
		    aClass7_4787.anInterface2_101 = null;
	    }
	} else if (3 == arg0) {
	    for (int i_83_ = 0; (i ^ 0xffffffff) < (i_83_ ^ 0xffffffff);
		 i_83_++) {
		int i_84_ = arg1[i_83_];
		if (i_84_ < anIntArrayArray4800.length) {
		    int[] is = anIntArrayArray4800[i_84_];
		    for (int i_85_ = 0;
			 (is.length ^ 0xffffffff) < (i_85_ ^ 0xffffffff);
			 i_85_++) {
			int i_86_ = is[i_85_];
			anIntArray4837[i_86_] -= anInt4851;
			anIntArray4803[i_86_] -= anInt4853;
			anIntArray4831[i_86_] -= anInt4854;
			anIntArray4837[i_86_]
			    = arg2 * anIntArray4837[i_86_] >> -1102618617;
			anIntArray4803[i_86_]
			    = arg3 * anIntArray4803[i_86_] >> -1507491705;
			anIntArray4831[i_86_]
			    = arg4 * anIntArray4831[i_86_] >> -48595481;
			anIntArray4837[i_86_] += anInt4851;
			anIntArray4803[i_86_] += anInt4853;
			anIntArray4831[i_86_] += anInt4854;
		    }
		}
	    }
	} else if (5 == arg0) {
	    if (anIntArrayArray4808 != null) {
		for (int i_87_ = 0; (i ^ 0xffffffff) < (i_87_ ^ 0xffffffff);
		     i_87_++) {
		    int i_88_ = arg1[i_87_];
		    if ((anIntArrayArray4808.length ^ 0xffffffff)
			< (i_88_ ^ 0xffffffff)) {
			int[] is = anIntArrayArray4808[i_88_];
			for (int i_89_ = 0;
			     (is.length ^ 0xffffffff) < (i_89_ ^ 0xffffffff);
			     i_89_++) {
			    int i_90_ = is[i_89_];
			    int i_91_
				= (aByteArray4789[i_90_] & 0xff) - -(arg2 * 8);
			    if (0 > i_91_)
				i_91_ = 0;
			    else if (i_91_ > 255)
				i_91_ = 255;
			    aByteArray4789[i_90_] = (byte) i_91_;
			}
			if ((is.length ^ 0xffffffff) < -1
			    && aClass7_4807 != null)
			    aClass7_4807.anInterface2_101 = null;
		    }
		}
	    }
	} else if ((arg0 ^ 0xffffffff) == -8) {
	    if (null != anIntArrayArray4808) {
		for (int i_92_ = 0; i_92_ < i; i_92_++) {
		    int i_93_ = arg1[i_92_];
		    if (i_93_ < anIntArrayArray4808.length) {
			int[] is = anIntArrayArray4808[i_93_];
			for (int i_94_ = 0; is.length > i_94_; i_94_++) {
			    int i_95_ = is[i_94_];
			    int i_96_ = 0xffff & aShortArray4826[i_95_];
			    int i_97_ = (0xfe4d & i_96_) >> -2002823350;
			    int i_98_ = 0x7 & i_96_ >> 670010503;
			    int i_99_ = 0x7f & i_96_;
			    i_98_ += arg3 / 4;
			    i_97_ = 0x3f & i_97_ - -arg2;
			    if ((i_98_ ^ 0xffffffff) > -1)
				i_98_ = 0;
			    else if (-8 > (i_98_ ^ 0xffffffff))
				i_98_ = 7;
			    i_99_ += arg4;
			    if ((i_99_ ^ 0xffffffff) > -1)
				i_99_ = 0;
			    else if (i_99_ > 127)
				i_99_ = 127;
			    aShortArray4826[i_95_]
				= (short) (Cryption.method2105
					   (i_99_, (Cryption.method2105
						    (i_97_ << -1752437718,
						     i_98_ << 899440231))));
			}
			if ((is.length ^ 0xffffffff) < -1
			    && null != aClass7_4807)
			    aClass7_4807.anInterface2_101 = null;
		    }
		}
	    }
	}
    }
    
    public void method2245(Class9 arg0, Class1_Sub5 arg1, int arg2, int arg3) {
	if (anInt4793 != 0) {
	    Class9_Sub1 class9_sub1 = aClass130_Sub2_4806.aClass9_Sub1_3404;
	    if (!aBoolean4790)
		method2298(-120);
	    Class9_Sub1 class9_sub1_100_ = (Class9_Sub1) arg0;
	    float f = (class9_sub1.aFloat3612
		       + class9_sub1_100_.aFloat3614 * class9_sub1.aFloat3608
		       + class9_sub1_100_.aFloat3605 * class9_sub1.aFloat3611
		       + class9_sub1.aFloat3606 * class9_sub1_100_.aFloat3612);
	    float f_101_
		= (class9_sub1_100_.aFloat3611 * class9_sub1.aFloat3606
		   + (class9_sub1_100_.aFloat3604 * class9_sub1.aFloat3611
		      + class9_sub1.aFloat3608 * class9_sub1_100_.aFloat3607));
	    float f_102_ = (float) aShort4827 * f_101_ + f;
	    float f_103_ = (float) aShort4812 * f_101_ + f;
	    float f_104_;
	    float f_105_;
	    if (f_103_ < f_102_) {
		f_105_ = f_102_ + (float) aShort4818;
		f_104_ = f_103_ - (float) aShort4818;
	    } else {
		f_104_ = f_102_ - (float) aShort4818;
		f_105_ = f_103_ + (float) aShort4818;
	    }
	    if (!(aClass130_Sub2_4806.aFloat3343 <= f_104_)
		&& !(f_105_ <= (float) aClass130_Sub2_4806.anInt3382)) {
		float f_106_
		    = (class9_sub1_100_.aFloat3614 * class9_sub1.aFloat3609
		       + class9_sub1.aFloat3614
		       + class9_sub1_100_.aFloat3605 * class9_sub1.aFloat3607
		       + class9_sub1_100_.aFloat3612 * class9_sub1.aFloat3602);
		float f_107_
		    = (class9_sub1_100_.aFloat3604 * class9_sub1.aFloat3607
		       + class9_sub1_100_.aFloat3607 * class9_sub1.aFloat3609
		       + class9_sub1_100_.aFloat3611 * class9_sub1.aFloat3602);
		float f_108_ = (float) aShort4827 * f_107_ + f_106_;
		float f_109_ = (float) aShort4812 * f_107_ + f_106_;
		float f_110_;
		float f_111_;
		if (f_108_ > f_109_) {
		    f_111_ = ((float) aClass130_Sub2_4806.anInt3375
			      * ((float) aShort4818 + f_108_));
		    f_110_ = ((f_109_ - (float) aShort4818)
			      * (float) aClass130_Sub2_4806.anInt3375);
		} else {
		    f_110_ = ((f_108_ - (float) aShort4818)
			      * (float) aClass130_Sub2_4806.anInt3375);
		    f_111_ = ((float) aClass130_Sub2_4806.anInt3375
			      * (f_109_ + (float) aShort4818));
		}
		if (!(aClass130_Sub2_4806.aFloat3361 <= f_110_ / (float) arg2)
		    && !(aClass130_Sub2_4806.aFloat3412
			 >= f_111_ / (float) arg2)) {
		    float f_112_
			= (class9_sub1.aFloat3610 * class9_sub1_100_.aFloat3612
			   + ((class9_sub1.aFloat3604
			       * class9_sub1_100_.aFloat3605)
			      + ((class9_sub1.aFloat3603
				  * class9_sub1_100_.aFloat3614)
				 + class9_sub1.aFloat3605)));
		    float f_113_
			= (class9_sub1_100_.aFloat3611 * class9_sub1.aFloat3610
			   + ((class9_sub1.aFloat3604
			       * class9_sub1_100_.aFloat3604)
			      + (class9_sub1.aFloat3603
				 * class9_sub1_100_.aFloat3607)));
		    float f_114_ = f_112_ + (float) aShort4827 * f_113_;
		    float f_115_ = f_112_ + (float) aShort4812 * f_113_;
		    float f_116_;
		    float f_117_;
		    if (f_115_ < f_114_) {
			f_116_ = (((float) aShort4818 + f_114_)
				  * (float) aClass130_Sub2_4806.anInt3372);
			f_117_ = ((float) aClass130_Sub2_4806.anInt3372
				  * ((float) -aShort4818 + f_115_));
		    } else {
			f_116_ = (((float) aShort4818 + f_115_)
				  * (float) aClass130_Sub2_4806.anInt3372);
			f_117_ = ((float) aClass130_Sub2_4806.anInt3372
				  * ((float) -aShort4818 + f_114_));
		    }
		    if (!(aClass130_Sub2_4806.aFloat3341
			  <= f_117_ / (float) arg2)
			&& !(f_116_ / (float) arg2
			     <= aClass130_Sub2_4806.aFloat3342)) {
			if (arg1 != null) {
			    float f_118_
				= ((class9_sub1.aFloat3602
				    * class9_sub1_100_.aFloat3608)
				   + ((class9_sub1.aFloat3609
				       * class9_sub1_100_.aFloat3609)
				      + (class9_sub1.aFloat3607
					 * class9_sub1_100_.aFloat3603)));
			    float f_119_ = ((class9_sub1_100_.aFloat3606
					     * class9_sub1.aFloat3602)
					    + ((class9_sub1.aFloat3607
						* class9_sub1_100_.aFloat3610)
					       + (class9_sub1_100_.aFloat3602
						  * class9_sub1.aFloat3609)));
			    float f_120_ = ((class9_sub1_100_.aFloat3609
					     * class9_sub1.aFloat3603)
					    + (class9_sub1_100_.aFloat3603
					       * class9_sub1.aFloat3604)
					    + (class9_sub1_100_.aFloat3608
					       * class9_sub1.aFloat3610));
			    float f_121_
				= ((class9_sub1_100_.aFloat3606
				    * class9_sub1.aFloat3610)
				   + ((class9_sub1.aFloat3603
				       * class9_sub1_100_.aFloat3602)
				      + (class9_sub1.aFloat3604
					 * class9_sub1_100_.aFloat3610)));
			    float f_122_ = ((class9_sub1_100_.aFloat3603
					     * class9_sub1.aFloat3611)
					    + (class9_sub1.aFloat3608
					       * class9_sub1_100_.aFloat3609)
					    + (class9_sub1.aFloat3606
					       * class9_sub1_100_.aFloat3608));
			    float f_123_ = ((class9_sub1_100_.aFloat3610
					     * class9_sub1.aFloat3611)
					    + (class9_sub1.aFloat3608
					       * class9_sub1_100_.aFloat3602)
					    + (class9_sub1.aFloat3606
					       * class9_sub1_100_.aFloat3606));
			    int i = aShort4842 + aShort4816 >> 396154625;
			    int i_124_
				= aShort4788 + aShort4809 >> -1846229151;
			    int i_125_ = (int) (f_106_ + f_118_ * (float) i
						+ (float) aShort4827 * f_107_
						+ (float) i_124_ * f_119_);
			    int i_126_
				= (int) ((float) i_124_ * f_121_
					 + ((float) aShort4827 * f_113_
					    + (f_120_ * (float) i + f_112_)));
			    int i_127_ = (int) ((float) aShort4827 * f_101_
						+ (f + f_122_ * (float) i)
						+ (float) i_124_ * f_123_);
			    int i_128_
				= (int) (f_119_ * (float) i_124_
					 + (f_107_ * (float) aShort4812
					    + (f_106_ + (float) i * f_118_)));
			    int i_129_
				= (int) (f_121_ * (float) i_124_
					 + ((float) i * f_120_ + f_112_
					    + f_113_ * (float) aShort4812));
			    arg1.anInt3559
				= (i_129_ * aClass130_Sub2_4806.anInt3372
				   / arg2) + aClass130_Sub2_4806.anInt3405;
			    arg1.anInt3557
				= (aClass130_Sub2_4806.anInt3405
				   + (i_126_ * aClass130_Sub2_4806.anInt3372
				      / arg2));
			    int i_130_
				= (int) (f_123_ * (float) i_124_
					 + (f + f_122_ * (float) i
					    + f_101_ * (float) aShort4812));
			    arg1.anInt3561
				= (aClass130_Sub2_4806.anInt3375 * i_125_
				   / arg2) + aClass130_Sub2_4806.anInt3365;
			    arg1.anInt3560
				= (aClass130_Sub2_4806.anInt3365
				   + (i_128_ * aClass130_Sub2_4806.anInt3375
				      / arg2));
			    if (i_127_ < aClass130_Sub2_4806.anInt3382
				&& i_130_ < aClass130_Sub2_4806.anInt3382) {
				arg1.anInt3558
				    = (-arg1.anInt3561
				       + (aClass130_Sub2_4806.anInt3375
					  * (i_125_ + aShort4818) / arg2)
				       + aClass130_Sub2_4806.anInt3365);
				arg1.aBoolean3556 = true;
			    }
			}
			aClass130_Sub2_4806.method1292((float) arg2);
			aClass130_Sub2_4806.method1336();
			aClass130_Sub2_4806.method1341(class9_sub1_100_);
			method2295(-80);
			aClass130_Sub2_4806.method1300();
		    }
		}
	    }
	}
    }
    
    public void method2292(byte arg0, Class131_Sub41_Sub13_Sub1 arg1) {
	if ((anInt4793 ^ 0xffffffff) < (anIntArray4849.length ^ 0xffffffff)) {
	    anIntArray4849 = new int[anInt4793];
	    anIntArray4848 = new int[anInt4793];
	}
	for (int i = 0; i < anInt4792; i++) {
	    int i_131_ = ((anIntArray4837[i] + -((aClass130_Sub2_4806.anInt3367
						  * anIntArray4803[i])
						 >> -628647320)
			   >> aClass130_Sub2_4806.anInt3321)
			  - arg1.anInt6559);
	    int i_132_
		= (-arg1.anInt6560
		   + ((anIntArray4831[i]
		       + -(aClass130_Sub2_4806.anInt3394 * anIntArray4803[i]
			   >> 1081694632))
		      >> aClass130_Sub2_4806.anInt3321));
	    int i_133_ = anIntArray4840[i];
	    int i_134_ = anIntArray4840[i - -1];
	    for (int i_135_ = i_133_; i_134_ > i_135_; i_135_++) {
		int i_136_ = -1 + aShortArray4824[i_135_];
		if (-1 == i_136_)
		    break;
		anIntArray4849[i_136_] = i_131_;
		anIntArray4848[i_136_] = i_132_;
	    }
	}
	if (arg0 == 52) {
	    for (int i = 0; anInt4799 > i; i++) {
		if (null == aByteArray4789 || 128 >= aByteArray4789[i]) {
		    short i_137_ = aShortArray4835[i];
		    short i_138_ = aShortArray4811[i];
		    short i_139_ = aShortArray4843[i];
		    int i_140_ = anIntArray4849[i_137_];
		    int i_141_ = anIntArray4849[i_138_];
		    int i_142_ = anIntArray4849[i_139_];
		    int i_143_ = anIntArray4848[i_137_];
		    int i_144_ = anIntArray4848[i_138_];
		    int i_145_ = anIntArray4848[i_139_];
		    if (((-i_145_ + i_144_) * (-i_141_ + i_140_)
			 + -((i_144_ - i_143_) * (i_142_ - i_141_)))
			> 0)
			arg1.method2020(i_142_, i_140_, i_143_, i_144_, -107,
					i_145_, i_141_);
		}
	    }
	}
    }
    
    public void method2293(boolean arg0, byte arg1) {
	if (6 * anInt4799 <= aClass131_Sub15_Sub1_4805.data.length)
	    aClass131_Sub15_Sub1_4805.offset = 0;
	else
	    aClass131_Sub15_Sub1_4805
		= new RawStream(600 + 6 * anInt4799);
	if (aClass130_Sub2_4806.aBoolean3360) {
	    for (int i = 0; (anInt4799 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		aClass131_Sub15_Sub1_4805.writeShort(aShortArray4835[i]);
		aClass131_Sub15_Sub1_4805.writeShort(aShortArray4811[i]);
		aClass131_Sub15_Sub1_4805.writeShort(aShortArray4843[i]);
	    }
	} else {
	    for (int i = 0; anInt4799 > i; i++) {
		aClass131_Sub15_Sub1_4805.method1773(677910600,
						     aShortArray4835[i]);
		aClass131_Sub15_Sub1_4805.method1773(677910600,
						     aShortArray4811[i]);
		aClass131_Sub15_Sub1_4805.method1773(677910600,
						     aShortArray4843[i]);
	    }
	}
	if (arg1 > -34)
	    method2252();
	if (!arg0)
	    aClass95_4791.anInterface7_1271
		= aClass130_Sub2_4806.method1287(5123,
						 (aClass131_Sub15_Sub1_4805
						  .data),
						 (aClass131_Sub15_Sub1_4805
						  .offset),
						 false);
	else {
	    if (null == anInterface7_4810)
		anInterface7_4810
		    = aClass130_Sub2_4806.method1287(5123,
						     (aClass131_Sub15_Sub1_4805
						      .data),
						     (aClass131_Sub15_Sub1_4805
						      .offset),
						     true);
	    else
		anInterface7_4810.method26(5123,
					   (aClass131_Sub15_Sub1_4805
					    .data),
					   (aClass131_Sub15_Sub1_4805
					    .offset));
	    aClass95_4791.anInterface7_1271 = anInterface7_4810;
	}
	if (!arg0)
	    aBoolean4794 = true;
    }
    
    public void method2261(Class9 arg0, Class1_Sub5 arg1, int arg2) {
	if (anInt4793 != 0) {
	    Class9_Sub1 class9_sub1 = aClass130_Sub2_4806.aClass9_Sub1_3404;
	    Class9_Sub1 class9_sub1_146_ = (Class9_Sub1) arg0;
	    if (!aBoolean4790)
		method2298(65);
	    method2308(class9_sub1_146_, false);
	    float f = (class9_sub1.aFloat3608 * class9_sub1_146_.aFloat3614
		       + class9_sub1.aFloat3612
		       + class9_sub1_146_.aFloat3605 * class9_sub1.aFloat3611
		       + class9_sub1.aFloat3606 * class9_sub1_146_.aFloat3612);
	    float f_147_
		= (class9_sub1.aFloat3606 * class9_sub1_146_.aFloat3611
		   + (class9_sub1.aFloat3611 * class9_sub1_146_.aFloat3604
		      + class9_sub1.aFloat3608 * class9_sub1_146_.aFloat3607));
	    float f_148_ = f + f_147_ * (float) aShort4827;
	    float f_149_ = f_147_ * (float) aShort4812 + f;
	    float f_150_;
	    float f_151_;
	    if (!(f_148_ > f_149_)) {
		f_150_ = (float) -aShort4818 + f_148_;
		f_151_ = (float) aShort4818 + f_149_;
	    } else {
		f_150_ = (float) -aShort4818 + f_149_;
		f_151_ = f_148_ + (float) aShort4818;
	    }
	    if (!(aClass130_Sub2_4806.aFloat3418 <= f_150_)
		&& !(f_151_ <= (float) aClass130_Sub2_4806.anInt3382)) {
		float f_152_
		    = (class9_sub1.aFloat3602 * class9_sub1_146_.aFloat3612
		       + (class9_sub1.aFloat3614
			  + (class9_sub1.aFloat3609
			     * class9_sub1_146_.aFloat3614)
			  + (class9_sub1.aFloat3607
			     * class9_sub1_146_.aFloat3605)));
		float f_153_
		    = (class9_sub1_146_.aFloat3611 * class9_sub1.aFloat3602
		       + (class9_sub1.aFloat3609 * class9_sub1_146_.aFloat3607
			  + (class9_sub1.aFloat3607
			     * class9_sub1_146_.aFloat3604)));
		float f_154_ = f_153_ * (float) aShort4827 + f_152_;
		float f_155_ = (float) aShort4812 * f_153_ + f_152_;
		float f_156_;
		float f_157_;
		if (!(f_154_ > f_155_)) {
		    f_157_ = ((f_155_ + (float) aShort4818)
			      * (float) aClass130_Sub2_4806.anInt3375);
		    f_156_ = ((float) aClass130_Sub2_4806.anInt3375
			      * (f_154_ - (float) aShort4818));
		} else {
		    f_156_ = ((float) aClass130_Sub2_4806.anInt3375
			      * ((float) -aShort4818 + f_155_));
		    f_157_ = ((float) aClass130_Sub2_4806.anInt3375
			      * ((float) aShort4818 + f_154_));
		}
		if (!(aClass130_Sub2_4806.aFloat3361 <= f_156_ / f_151_)
		    && !(f_157_ / f_151_ <= aClass130_Sub2_4806.aFloat3412)) {
		    float f_158_
			= (class9_sub1.aFloat3604 * class9_sub1_146_.aFloat3605
			   + ((class9_sub1.aFloat3603
			       * class9_sub1_146_.aFloat3614)
			      + class9_sub1.aFloat3605)
			   + (class9_sub1.aFloat3610
			      * class9_sub1_146_.aFloat3612));
		    float f_159_
			= (class9_sub1.aFloat3610 * class9_sub1_146_.aFloat3611
			   + ((class9_sub1.aFloat3603
			       * class9_sub1_146_.aFloat3607)
			      + (class9_sub1_146_.aFloat3604
				 * class9_sub1.aFloat3604)));
		    float f_160_ = f_158_ + f_159_ * (float) aShort4827;
		    float f_161_ = f_159_ * (float) aShort4812 + f_158_;
		    float f_162_;
		    float f_163_;
		    if (!(f_160_ > f_161_)) {
			f_163_ = (((float) -aShort4818 + f_160_)
				  * (float) aClass130_Sub2_4806.anInt3372);
			f_162_ = ((float) aClass130_Sub2_4806.anInt3372
				  * ((float) aShort4818 + f_161_));
		    } else {
			f_162_ = (((float) aShort4818 + f_160_)
				  * (float) aClass130_Sub2_4806.anInt3372);
			f_163_ = ((f_161_ - (float) aShort4818)
				  * (float) aClass130_Sub2_4806.anInt3372);
		    }
		    if (!(f_163_ / f_151_ >= aClass130_Sub2_4806.aFloat3341)
			&& !(aClass130_Sub2_4806.aFloat3342
			     >= f_162_ / f_151_)) {
			if (arg1 != null) {
			    boolean bool = false;
			    boolean bool_164_ = true;
			    float f_165_ = ((class9_sub1.aFloat3607
					     * class9_sub1_146_.aFloat3603)
					    + (class9_sub1_146_.aFloat3609
					       * class9_sub1.aFloat3609)
					    + (class9_sub1.aFloat3602
					       * class9_sub1_146_.aFloat3608));
			    float f_166_ = ((class9_sub1_146_.aFloat3606
					     * class9_sub1.aFloat3602)
					    + ((class9_sub1.aFloat3609
						* class9_sub1_146_.aFloat3602)
					       + (class9_sub1_146_.aFloat3610
						  * class9_sub1.aFloat3607)));
			    float f_167_ = ((class9_sub1_146_.aFloat3608
					     * class9_sub1.aFloat3610)
					    + ((class9_sub1_146_.aFloat3603
						* class9_sub1.aFloat3604)
					       + (class9_sub1_146_.aFloat3609
						  * class9_sub1.aFloat3603)));
			    float f_168_
				= ((class9_sub1_146_.aFloat3606
				    * class9_sub1.aFloat3610)
				   + ((class9_sub1.aFloat3604
				       * class9_sub1_146_.aFloat3610)
				      + (class9_sub1.aFloat3603
					 * class9_sub1_146_.aFloat3602)));
			    float f_169_ = ((class9_sub1_146_.aFloat3609
					     * class9_sub1.aFloat3608)
					    + (class9_sub1.aFloat3611
					       * class9_sub1_146_.aFloat3603)
					    + (class9_sub1_146_.aFloat3608
					       * class9_sub1.aFloat3606));
			    float f_170_ = ((class9_sub1.aFloat3608
					     * class9_sub1_146_.aFloat3602)
					    + (class9_sub1.aFloat3611
					       * class9_sub1_146_.aFloat3610)
					    + (class9_sub1.aFloat3606
					       * class9_sub1_146_.aFloat3606));
			    int i = aShort4842 + aShort4816 >> -2033568319;
			    int i_171_ = aShort4788 + aShort4809 >> 1222411329;
			    int i_172_ = (int) ((float) aShort4827 * f_153_
						+ (f_165_ * (float) i + f_152_)
						+ f_166_ * (float) i_171_);
			    int i_173_
				= (int) ((float) i_171_ * f_168_
					 + (f_159_ * (float) aShort4827
					    + ((float) i * f_167_ + f_158_)));
			    int i_174_ = (int) (f_147_ * (float) aShort4827
						+ ((float) i * f_169_ + f)
						+ (float) i_171_ * f_170_);
			    if ((i_174_ ^ 0xffffffff)
				<= (aClass130_Sub2_4806.anInt3382
				    ^ 0xffffffff)) {
				arg1.anInt3561
				    = (aClass130_Sub2_4806.anInt3365
				       + (aClass130_Sub2_4806.anInt3375
					  * i_172_ / i_174_));
				arg1.anInt3557
				    = (aClass130_Sub2_4806.anInt3405
				       + (aClass130_Sub2_4806.anInt3372
					  * i_173_ / i_174_));
			    } else
				bool = true;
			    int i_175_
				= (int) (f_166_ * (float) i_171_
					 + (f_152_ + (float) i * f_165_
					    + f_153_ * (float) aShort4812));
			    int i_176_
				= (int) (f_168_ * (float) i_171_
					 + ((float) aShort4812 * f_159_
					    + ((float) i * f_167_ + f_158_)));
			    int i_177_
				= (int) ((float) i_171_ * f_170_
					 + (f_147_ * (float) aShort4812
					    + (f_169_ * (float) i + f)));
			    if (i_177_ < aClass130_Sub2_4806.anInt3382)
				bool = true;
			    else {
				arg1.anInt3559
				    = (aClass130_Sub2_4806.anInt3405
				       - -(i_176_
					   * aClass130_Sub2_4806.anInt3372
					   / i_177_));
				arg1.anInt3560
				    = (aClass130_Sub2_4806.anInt3365
				       - -(i_175_
					   * aClass130_Sub2_4806.anInt3375
					   / i_177_));
			    }
			    if (bool) {
				if ((aClass130_Sub2_4806.anInt3382
				     ^ 0xffffffff) >= (i_174_ ^ 0xffffffff)
				    || ((i_177_ ^ 0xffffffff)
					<= (aClass130_Sub2_4806.anInt3382
					    ^ 0xffffffff))) {
				    if (i_174_
					< aClass130_Sub2_4806.anInt3382) {
					int i_178_
					    = (((-aClass130_Sub2_4806.anInt3382
						 + i_177_)
						<< 1680820720)
					       / (i_177_ - i_174_));
					int i_179_
					    = (i_175_
					       - -(i_178_ * (i_175_ - i_172_)
						   >> -1719802800));
					arg1.anInt3561
					    = (aClass130_Sub2_4806.anInt3365
					       + (i_179_
						  * (aClass130_Sub2_4806
						     .anInt3375)
						  / (aClass130_Sub2_4806
						     .anInt3382)));
					int i_180_
					    = (((i_176_ - i_173_) * i_178_
						>> -1681216080)
					       + i_176_);
					arg1.anInt3557
					    = (aClass130_Sub2_4806.anInt3405
					       - -(i_180_
						   * (aClass130_Sub2_4806
						      .anInt3372)
						   / (aClass130_Sub2_4806
						      .anInt3382)));
				    } else if ((aClass130_Sub2_4806.anInt3382
						^ 0xffffffff)
					       < (i_177_ ^ 0xffffffff)) {
					int i_181_
					    = (((-aClass130_Sub2_4806.anInt3382
						 + i_174_)
						<< -361374800)
					       / (i_174_ - i_177_));
					int i_182_
					    = ((i_181_ * (-i_175_ + i_172_)
						>> -1336450064)
					       + i_172_);
					int i_183_
					    = (((i_173_ + -i_176_) * i_181_
						>> -756472176)
					       + i_173_);
					arg1.anInt3561
					    = ((i_182_
						* aClass130_Sub2_4806.anInt3375
						/ (aClass130_Sub2_4806
						   .anInt3382))
					       + (aClass130_Sub2_4806
						  .anInt3365));
					arg1.anInt3557
					    = (aClass130_Sub2_4806.anInt3405
					       + (aClass130_Sub2_4806.anInt3372
						  * i_183_
						  / (aClass130_Sub2_4806
						     .anInt3382)));
				    }
				} else
				    bool_164_ = false;
			    }
			    if (bool_164_) {
				arg1.aBoolean3556 = true;
				if (i_174_ > i_177_)
				    arg1.anInt3558
					= (aClass130_Sub2_4806.anInt3365
					   - (-(aClass130_Sub2_4806.anInt3375
						* (aShort4818 + i_172_)
						/ i_174_)
					      - -arg1.anInt3561));
				else
				    arg1.anInt3558
					= (-arg1.anInt3560
					   + (aClass130_Sub2_4806.anInt3365
					      - -((aShort4818 + i_175_)
						  * (aClass130_Sub2_4806
						     .anInt3375)
						  / i_177_)));
			    }
			}
			aClass130_Sub2_4806.method1329();
			aClass130_Sub2_4806.method1341(class9_sub1_146_);
			method2295(-91);
			aClass130_Sub2_4806.method1300();
		    }
		}
	    }
	}
    }
    
    public boolean method2278(int arg0, int arg1, Class9 arg2, boolean arg3) {
	boolean bool;
	try {
	    Class9_Sub1 class9_sub1 = (Class9_Sub1) arg2;
	    Class9_Sub1 class9_sub1_184_
		= aClass130_Sub2_4806.aClass9_Sub1_3404;
	    float f
		= (class9_sub1.aFloat3612 * class9_sub1_184_.aFloat3602
		   + (class9_sub1_184_.aFloat3607 * class9_sub1.aFloat3605
		      + class9_sub1_184_.aFloat3609 * class9_sub1.aFloat3614)
		   + class9_sub1_184_.aFloat3614);
	    float f_185_
		= (class9_sub1_184_.aFloat3605
		   + (class9_sub1.aFloat3614 * class9_sub1_184_.aFloat3603
		      + class9_sub1_184_.aFloat3604 * class9_sub1.aFloat3605
		      + class9_sub1.aFloat3612 * class9_sub1_184_.aFloat3610));
	    float f_186_
		= (class9_sub1_184_.aFloat3612
		   + (class9_sub1.aFloat3605 * class9_sub1_184_.aFloat3611
		      + class9_sub1_184_.aFloat3608 * class9_sub1.aFloat3614
		      + class9_sub1.aFloat3612 * class9_sub1_184_.aFloat3606));
	    float f_187_
		= (class9_sub1_184_.aFloat3602 * class9_sub1.aFloat3608
		   + (class9_sub1.aFloat3603 * class9_sub1_184_.aFloat3607
		      + class9_sub1_184_.aFloat3609 * class9_sub1.aFloat3609));
	    float f_188_
		= (class9_sub1_184_.aFloat3602 * class9_sub1.aFloat3611
		   + (class9_sub1.aFloat3607 * class9_sub1_184_.aFloat3609
		      + class9_sub1.aFloat3604 * class9_sub1_184_.aFloat3607));
	    float f_189_
		= (class9_sub1.aFloat3606 * class9_sub1_184_.aFloat3602
		   + (class9_sub1.aFloat3610 * class9_sub1_184_.aFloat3607
		      + class9_sub1_184_.aFloat3609 * class9_sub1.aFloat3602));
	    float f_190_
		= (class9_sub1_184_.aFloat3603 * class9_sub1.aFloat3609
		   + class9_sub1_184_.aFloat3604 * class9_sub1.aFloat3603
		   + class9_sub1_184_.aFloat3610 * class9_sub1.aFloat3608);
	    float f_191_
		= (class9_sub1.aFloat3607 * class9_sub1_184_.aFloat3603
		   + class9_sub1.aFloat3604 * class9_sub1_184_.aFloat3604
		   + class9_sub1.aFloat3611 * class9_sub1_184_.aFloat3610);
	    float f_192_
		= (class9_sub1_184_.aFloat3610 * class9_sub1.aFloat3606
		   + (class9_sub1_184_.aFloat3603 * class9_sub1.aFloat3602
		      + class9_sub1_184_.aFloat3604 * class9_sub1.aFloat3610));
	    float f_193_
		= (class9_sub1.aFloat3608 * class9_sub1_184_.aFloat3606
		   + (class9_sub1.aFloat3603 * class9_sub1_184_.aFloat3611
		      + class9_sub1.aFloat3609 * class9_sub1_184_.aFloat3608));
	    float f_194_
		= (class9_sub1.aFloat3611 * class9_sub1_184_.aFloat3606
		   + (class9_sub1.aFloat3607 * class9_sub1_184_.aFloat3608
		      + class9_sub1.aFloat3604 * class9_sub1_184_.aFloat3611));
	    float f_195_
		= (class9_sub1.aFloat3606 * class9_sub1_184_.aFloat3606
		   + (class9_sub1_184_.aFloat3608 * class9_sub1.aFloat3602
		      + class9_sub1.aFloat3610 * class9_sub1_184_.aFloat3611));
	    boolean bool_196_ = false;
	    float f_197_ = 3.4028235E38F;
	    float f_198_ = -3.4028235E38F;
	    float f_199_ = 3.4028235E38F;
	    float f_200_ = -3.4028235E38F;
	    int i = aClass130_Sub2_4806.anInt3375;
	    int i_201_ = aClass130_Sub2_4806.anInt3372;
	    if (!aBoolean4790)
		method2298(-122);
	    anIntArray4852[0] = aShort4816;
	    anIntArray4850[0] = aShort4827;
	    anIntArray4847[0] = aShort4788;
	    anIntArray4852[1] = aShort4842;
	    anIntArray4850[1] = aShort4827;
	    anIntArray4852[2] = aShort4816;
	    anIntArray4847[1] = aShort4788;
	    anIntArray4850[2] = aShort4812;
	    anIntArray4847[2] = aShort4788;
	    anIntArray4852[3] = aShort4842;
	    anIntArray4850[3] = aShort4812;
	    anIntArray4847[3] = aShort4788;
	    anIntArray4852[4] = aShort4816;
	    anIntArray4850[4] = aShort4827;
	    anIntArray4852[5] = aShort4842;
	    anIntArray4847[4] = aShort4809;
	    anIntArray4850[5] = aShort4827;
	    anIntArray4847[5] = aShort4809;
	    anIntArray4852[6] = aShort4816;
	    anIntArray4850[6] = aShort4812;
	    anIntArray4852[7] = aShort4842;
	    anIntArray4847[6] = aShort4809;
	    anIntArray4850[7] = aShort4812;
	    anIntArray4847[7] = aShort4809;
	    for (int i_202_ = 0; i_202_ < 8; i_202_++) {
		float f_203_ = (float) anIntArray4852[i_202_];
		float f_204_ = (float) anIntArray4847[i_202_];
		float f_205_ = (float) anIntArray4850[i_202_];
		float f_206_ = (f_203_ * f_193_ + f_205_ * f_194_
				+ f_195_ * f_204_ + f_186_);
		float f_207_ = (f_189_ * f_204_
				+ (f_203_ * f_187_ + f_205_ * f_188_) + f);
		float f_208_
		    = f_185_ + (f_192_ * f_204_
				+ (f_205_ * f_191_ + f_190_ * f_203_));
		if ((float) aClass130_Sub2_4806.anInt3382 <= f_206_) {
		    float f_209_ = (f_207_ * (float) i / f_206_
				    + (float) aClass130_Sub2_4806.anInt3365);
		    if (f_198_ < f_209_)
			f_198_ = f_209_;
		    if (f_209_ < f_197_)
			f_197_ = f_209_;
		    float f_210_ = ((float) i_201_ * f_208_ / f_206_
				    + (float) aClass130_Sub2_4806.anInt3405);
		    if (f_210_ < f_199_)
			f_199_ = f_210_;
		    if (f_200_ < f_210_)
			f_200_ = f_210_;
		    bool_196_ = true;
		}
	    }
	    if (bool_196_ && (float) arg0 > f_197_ && (float) arg0 < f_198_
		&& (float) arg1 > f_199_ && f_200_ > (float) arg1) {
		if (arg3)
		    return true;
		if (anInt4793 > anIntArray4849.length) {
		    anIntArray4848 = new int[anInt4793];
		    anIntArray4849 = new int[anInt4793];
		}
		for (int i_211_ = 0; i_211_ < anInt4792; i_211_++) {
		    float f_212_ = (float) anIntArray4831[i_211_];
		    float f_213_ = (float) anIntArray4803[i_211_];
		    float f_214_ = (float) anIntArray4837[i_211_];
		    float f_215_
			= (f_195_ * f_212_
			   + (f_214_ * f_193_ + f_194_ * f_213_) + f_186_);
		    float f_216_ = (f_212_ * f_189_
				    + (f_187_ * f_214_ + f_188_ * f_213_) + f);
		    float f_217_
			= f_185_ + (f_212_ * f_192_
				    + (f_213_ * f_191_ + f_190_ * f_214_));
		    if (f_215_ >= (float) aClass130_Sub2_4806.anInt3382) {
			int i_218_
			    = (int) ((float) i * f_216_ / f_215_
				     + (float) aClass130_Sub2_4806.anInt3365);
			int i_219_
			    = (int) ((float) i_201_ * f_217_ / f_215_
				     + (float) aClass130_Sub2_4806.anInt3405);
			int i_220_ = anIntArray4840[i_211_];
			int i_221_ = anIntArray4840[i_211_ - -1];
			for (int i_222_ = i_220_; i_221_ > i_222_; i_222_++) {
			    int i_223_ = -1 + aShortArray4824[i_222_];
			    if (-1 == i_223_)
				break;
			    anIntArray4849[i_223_] = i_218_;
			    anIntArray4848[i_223_] = i_219_;
			}
		    } else {
			int i_224_ = anIntArray4840[i_211_];
			int i_225_ = anIntArray4840[1 + i_211_];
			for (int i_226_ = i_224_;
			     (i_225_ ^ 0xffffffff) < (i_226_ ^ 0xffffffff);
			     i_226_++) {
			    int i_227_ = aShortArray4824[i_226_] - 1;
			    if (i_227_ == -1)
				break;
			    anIntArray4849[-1 + aShortArray4824[i_226_]]
				= -999999;
			}
		    }
		}
		for (int i_228_ = 0; anInt4799 > i_228_; i_228_++) {
		    if (((anIntArray4849[aShortArray4835[i_228_]] ^ 0xffffffff)
			 != 999998)
			&& (anIntArray4849[aShortArray4811[i_228_]]
			    ^ 0xffffffff) != 999998
			&& -999999 != anIntArray4849[aShortArray4843[i_228_]]
			&& method2304(anIntArray4849[aShortArray4811[i_228_]],
				      anIntArray4848[aShortArray4811[i_228_]],
				      anIntArray4849[aShortArray4835[i_228_]],
				      arg0, arg1,
				      anIntArray4849[aShortArray4843[i_228_]],
				      anIntArray4848[aShortArray4843[i_228_]],
				      anIntArray4848[aShortArray4835[i_228_]],
				      true))
			return true;
		}
	    }
	    bool = false;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public boolean method2247() {
	boolean bool;
	try {
	    if (null == anIntArrayArray4800)
		return false;
	    for (int i = 0; (anInt4838 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		anIntArray4837[i] <<= 4;
		anIntArray4803[i] <<= 4;
		anIntArray4831[i] <<= 4;
	    }
	    anInt4854 = 0;
	    anInt4851 = 0;
	    anInt4853 = 0;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public void method2294(boolean arg0, byte arg1) {
	boolean bool
	    = null != aClass7_4807 && aClass7_4807.anInterface2_101 == null;
	boolean bool_229_
	    = null != aClass7_4787 && aClass7_4787.anInterface2_101 == null;
	boolean bool_230_
	    = null != aClass7_4834 && aClass7_4834.anInterface2_101 == null;
	boolean bool_231_
	    = aClass7_4813 != null && aClass7_4813.anInterface2_101 == null;
	if (arg0) {
	    bool_231_ = bool_231_ & (aByte4798 & 0x8) != 0;
	    bool_230_ = bool_230_ & -1 != (0x1 & aByte4798 ^ 0xffffffff);
	    bool_229_ = bool_229_ & 0 != (aByte4798 & 0x4);
	    bool = bool & (0x2 & aByte4798) != 0;
	}
	byte i = 0;
	byte i_232_ = 0;
	byte i_233_ = 0;
	byte i_234_ = 0;
	byte i_235_ = 0;
	if (bool_230_) {
	    i_232_ = i;
	    i += 12;
	}
	if (bool) {
	    i_233_ = i;
	    i += 4;
	}
	if (bool_229_) {
	    i_234_ = i;
	    i += 12;
	}
	if (bool_231_) {
	    i_235_ = i;
	    i += 8;
	}
	if (-1 != (i ^ 0xffffffff)) {
	    if ((i * anInt4793 ^ 0xffffffff)
		< (aClass131_Sub15_Sub1_4805.data.length
		   ^ 0xffffffff))
		aClass131_Sub15_Sub1_4805
		    = new RawStream(i * (anInt4793 - -100));
	    else
		aClass131_Sub15_Sub1_4805.offset = 0;
	    if (bool_230_) {
		if (aClass130_Sub2_4806.aBoolean3360) {
		    for (int i_236_ = 0;
			 (i_236_ ^ 0xffffffff) > (anInt4792 ^ 0xffffffff);
			 i_236_++) {
			int i_237_
			    = Float.floatToRawIntBits((float) anIntArray4837
							      [i_236_]);
			int i_238_
			    = Float.floatToRawIntBits((float) anIntArray4803
							      [i_236_]);
			int i_239_
			    = Float.floatToRawIntBits((float) anIntArray4831
							      [i_236_]);
			int i_240_ = anIntArray4840[i_236_];
			int i_241_ = anIntArray4840[1 + i_236_];
			for (int i_242_ = i_240_; i_241_ > i_242_; i_242_++) {
			    int i_243_ = -1 + aShortArray4824[i_242_];
			    if ((i_243_ ^ 0xffffffff) == 0)
				break;
			    aClass131_Sub15_Sub1_4805.offset = i_243_ * i;
			    aClass131_Sub15_Sub1_4805.writeInt(i_237_);
			    aClass131_Sub15_Sub1_4805.writeInt(i_238_);
			    aClass131_Sub15_Sub1_4805.writeInt(i_239_);
			}
		    }
		} else {
		    for (int i_244_ = 0; i_244_ < anInt4792; i_244_++) {
			int i_245_
			    = Float.floatToRawIntBits((float) anIntArray4837
							      [i_244_]);
			int i_246_
			    = Float.floatToRawIntBits((float) anIntArray4803
							      [i_244_]);
			int i_247_
			    = Float.floatToRawIntBits((float) anIntArray4831
							      [i_244_]);
			int i_248_ = anIntArray4840[i_244_];
			int i_249_ = anIntArray4840[i_244_ + 1];
			for (int i_250_ = i_248_; i_250_ < i_249_; i_250_++) {
			    int i_251_ = aShortArray4824[i_250_] - 1;
			    if (0 == (i_251_ ^ 0xffffffff))
				break;
			    aClass131_Sub15_Sub1_4805.offset = i_251_ * i;
			    aClass131_Sub15_Sub1_4805.writeLEInt(true, i_245_);
			    aClass131_Sub15_Sub1_4805.writeLEInt(true, i_246_);
			    aClass131_Sub15_Sub1_4805.writeLEInt(true, i_247_);
			}
		    }
		}
	    }
	    if (bool) {
		if (aClass7_4787 == null) {
		    short[] is;
		    byte[] is_252_;
		    short[] is_253_;
		    short[] is_254_;
		    if (null != aClass109_4802) {
			is_252_ = aClass109_4802.aByteArray1423;
			is_254_ = aClass109_4802.aShortArray1422;
			is = aClass109_4802.aShortArray1421;
			is_253_ = aClass109_4802.aShortArray1424;
		    } else {
			is = aShortArray4821;
			is_252_ = aByteArray4828;
			is_253_ = aShortArray4820;
			is_254_ = aShortArray4825;
		    }
		    float f = aClass130_Sub2_4806.aFloatArray3368[0];
		    float f_255_ = aClass130_Sub2_4806.aFloatArray3368[1];
		    float f_256_ = aClass130_Sub2_4806.aFloatArray3368[2];
		    float f_257_ = aClass130_Sub2_4806.aFloat3407;
		    float f_258_ = (768.0F * aClass130_Sub2_4806.aFloat3332
				    / (float) aShort4839);
		    float f_259_ = (aClass130_Sub2_4806.aFloat3389 * 768.0F
				    / (float) aShort4839);
		    for (int i_260_ = 0; i_260_ < anInt4799; i_260_++) {
			int i_261_ = method2291(aShortArray4826[i_260_],
						aShortArray4830[i_260_],
						aByteArray4789[i_260_],
						aShort4797, 255);
			int i_262_ = aShortArray4835[i_260_];
			float f_263_
			    = (aClass130_Sub2_4806.aFloat3397
			       * (float) ((0xff3af4 & i_261_) >> 1021560688));
			float f_264_ = (aClass130_Sub2_4806.aFloat3395
					* (float) (i_261_ >> 20570728 & 0xff));
			float f_265_ = ((float) (i_261_ >>> -1823468840)
					* aClass130_Sub2_4806.aFloat3358);
			short i_266_ = (short) is_252_[i_262_];
			float f_267_;
			if (i_266_ != 0)
			    f_267_ = (((float) is[i_262_] * f_255_
				       + (float) is_253_[i_262_] * f
				       + (float) is_254_[i_262_] * f_256_)
				      / (float) (i_266_ * 256));
			else
			    f_267_ = (0.0026041667F
				      * ((float) is[i_262_] * f_255_
					 + (float) is_253_[i_262_] * f
					 + f_256_ * (float) is_254_[i_262_]));
			float f_268_ = f_257_ + (!(f_267_ < 0.0F) ? f_258_
						 : f_259_) * f_267_;
			int i_269_ = (int) (f_268_ * f_265_);
			int i_270_ = (int) (f_263_ * f_268_);
			if ((i_269_ ^ 0xffffffff) <= -1) {
			    if (255 < i_269_)
				i_269_ = 255;
			} else
			    i_269_ = 0;
			int i_271_ = (int) (f_268_ * f_264_);
			if (i_270_ < 0)
			    i_270_ = 0;
			else if ((i_270_ ^ 0xffffffff) < -256)
			    i_270_ = 255;
			aClass131_Sub15_Sub1_4805.offset
			    = i_262_ * i + i_233_;
			if (-1 >= (i_271_ ^ 0xffffffff)) {
			    if (-256 > (i_271_ ^ 0xffffffff))
				i_271_ = 255;
			} else
			    i_271_ = 0;
			aClass131_Sub15_Sub1_4805.writeByte(i_269_);
			aClass131_Sub15_Sub1_4805.writeByte(i_270_);
			aClass131_Sub15_Sub1_4805.writeByte(i_271_);
			aClass131_Sub15_Sub1_4805.writeByte
			    (255 - (0xff & aByteArray4789[i_260_]));
			i_262_ = aShortArray4811[i_260_];
			i_266_ = (short) is_252_[i_262_];
			if (-1 != (i_266_ ^ 0xffffffff))
			    f_267_ = (((float) is_254_[i_262_] * f_256_
				       + (f * (float) is_253_[i_262_]
					  + f_255_ * (float) is[i_262_]))
				      / (float) (i_266_ * 256));
			else
			    f_267_ = ((f_256_ * (float) is_254_[i_262_]
				       + (f_255_ * (float) is[i_262_]
					  + f * (float) is_253_[i_262_]))
				      * 0.0026041667F);
			f_268_ = f_257_ + ((!(0.0F > f_267_) ? f_258_ : f_259_)
					   * f_267_);
			i_269_ = (int) (f_265_ * f_268_);
			if (-1 >= (i_269_ ^ 0xffffffff)) {
			    if (-256 > (i_269_ ^ 0xffffffff))
				i_269_ = 255;
			} else
			    i_269_ = 0;
			i_270_ = (int) (f_263_ * f_268_);
			i_271_ = (int) (f_268_ * f_264_);
			if (i_270_ < 0)
			    i_270_ = 0;
			else if (i_270_ > 255)
			    i_270_ = 255;
			if (i_271_ < 0)
			    i_271_ = 0;
			else if (-256 > (i_271_ ^ 0xffffffff))
			    i_271_ = 255;
			aClass131_Sub15_Sub1_4805.offset
			    = i * i_262_ + i_233_;
			aClass131_Sub15_Sub1_4805.writeByte(i_269_);
			aClass131_Sub15_Sub1_4805.writeByte(i_270_);
			aClass131_Sub15_Sub1_4805.writeByte(i_271_);
			aClass131_Sub15_Sub1_4805.writeByte(-((aByteArray4789
			[i_260_])
			   & 0xff) + 255);
			i_262_ = aShortArray4843[i_260_];
			i_266_ = (short) is_252_[i_262_];
			if (0 == i_266_)
			    f_267_ = (((float) is_254_[i_262_] * f_256_
				       + ((float) is_253_[i_262_] * f
					  + (float) is[i_262_] * f_255_))
				      * 0.0026041667F);
			else
			    f_267_ = (((float) is_253_[i_262_] * f
				       + f_255_ * (float) is[i_262_]
				       + (float) is_254_[i_262_] * f_256_)
				      / (float) (i_266_ * 256));
			f_268_ = (f_267_ * (!(f_267_ < 0.0F) ? f_258_ : f_259_)
				  + f_257_);
			i_269_ = (int) (f_265_ * f_268_);
			if (-1 >= (i_269_ ^ 0xffffffff)) {
			    if ((i_269_ ^ 0xffffffff) < -256)
				i_269_ = 255;
			} else
			    i_269_ = 0;
			i_270_ = (int) (f_263_ * f_268_);
			if (-1 >= (i_270_ ^ 0xffffffff)) {
			    if (255 < i_270_)
				i_270_ = 255;
			} else
			    i_270_ = 0;
			i_271_ = (int) (f_264_ * f_268_);
			aClass131_Sub15_Sub1_4805.offset
			    = i_233_ - -(i_262_ * i);
			if (0 <= i_271_) {
			    if (i_271_ > 255)
				i_271_ = 255;
			} else
			    i_271_ = 0;
			aClass131_Sub15_Sub1_4805.writeByte(i_269_);
			aClass131_Sub15_Sub1_4805.writeByte(i_270_);
			aClass131_Sub15_Sub1_4805.writeByte(i_271_);
			aClass131_Sub15_Sub1_4805.writeByte
			    (-(0xff & aByteArray4789[i_260_]) + 255);
		    }
		} else {
		    for (int i_272_ = 0; i_272_ < anInt4799; i_272_++) {
			int i_273_ = method2291(aShortArray4826[i_272_],
						aShortArray4830[i_272_],
						aByteArray4789[i_272_],
						aShort4797, 255);
			aClass131_Sub15_Sub1_4805.offset
			    = i * aShortArray4835[i_272_] + i_233_;
			aClass131_Sub15_Sub1_4805.writeInt(i_273_);
			aClass131_Sub15_Sub1_4805.offset
			    = aShortArray4811[i_272_] * i + i_233_;
			aClass131_Sub15_Sub1_4805.writeInt(i_273_);
			aClass131_Sub15_Sub1_4805.offset
			    = i_233_ + i * aShortArray4843[i_272_];
			aClass131_Sub15_Sub1_4805.writeInt(i_273_);
		    }
		}
	    }
	    if (bool_229_) {
		byte[] is;
		short[] is_274_;
		short[] is_275_;
		short[] is_276_;
		if (null != aClass109_4802) {
		    is_274_ = aClass109_4802.aShortArray1421;
		    is = aClass109_4802.aByteArray1423;
		    is_275_ = aClass109_4802.aShortArray1424;
		    is_276_ = aClass109_4802.aShortArray1422;
		} else {
		    is = aByteArray4828;
		    is_274_ = aShortArray4821;
		    is_275_ = aShortArray4820;
		    is_276_ = aShortArray4825;
		}
		float f = 3.0F / (float) aShort4839;
		aClass131_Sub15_Sub1_4805.offset = i_234_;
		float f_277_ = 3.0F / (float) (aShort4839 / 2 + aShort4839);
		if (!aClass130_Sub2_4806.aBoolean3360) {
		    for (int i_278_ = 0; anInt4793 > i_278_; i_278_++) {
			int i_279_ = is[i_278_] & 0xff;
			if (0 != i_279_) {
			    float f_280_ = f / (float) i_279_;
			    aClass131_Sub15_Sub1_4805.method1782
				(f_280_ * (float) is_275_[i_278_], (byte) -30);
			    aClass131_Sub15_Sub1_4805.method1782
				(f_280_ * (float) is_274_[i_278_], (byte) -30);
			    aClass131_Sub15_Sub1_4805.method1782
				((float) is_276_[i_278_] * f_280_, (byte) -30);
			} else {
			    aClass131_Sub15_Sub1_4805.method1782
				((float) is_275_[i_278_] * f_277_, (byte) -30);
			    aClass131_Sub15_Sub1_4805.method1782
				(f_277_ * (float) is_274_[i_278_], (byte) -30);
			    aClass131_Sub15_Sub1_4805.method1782
				(f_277_ * (float) is_276_[i_278_], (byte) -30);
			}
			aClass131_Sub15_Sub1_4805.offset += -12 + i;
		    }
		} else {
		    for (int i_281_ = 0;
			 (anInt4793 ^ 0xffffffff) < (i_281_ ^ 0xffffffff);
			 i_281_++) {
			int i_282_ = is[i_281_] & 0xff;
			if (i_282_ == 0) {
			    aClass131_Sub15_Sub1_4805.method1783
				((float) is_275_[i_281_] * f_277_, (byte) 126);
			    aClass131_Sub15_Sub1_4805.method1783
				(f_277_ * (float) is_274_[i_281_], (byte) 126);
			    aClass131_Sub15_Sub1_4805.method1783
				(f_277_ * (float) is_276_[i_281_], (byte) 126);
			} else {
			    float f_283_ = f / (float) i_282_;
			    aClass131_Sub15_Sub1_4805.method1783
				(f_283_ * (float) is_275_[i_281_], (byte) 126);
			    aClass131_Sub15_Sub1_4805.method1783
				(f_283_ * (float) is_274_[i_281_], (byte) 126);
			    aClass131_Sub15_Sub1_4805.method1783
				((float) is_276_[i_281_] * f_283_, (byte) 126);
			}
			aClass131_Sub15_Sub1_4805.offset += -12 + i;
		    }
		}
	    }
	    if (bool_231_) {
		aClass131_Sub15_Sub1_4805.offset = i_235_;
		if (aClass130_Sub2_4806.aBoolean3360) {
		    for (int i_284_ = 0; i_284_ < anInt4793; i_284_++) {
			aClass131_Sub15_Sub1_4805
			    .method1783(aFloatArray4814[i_284_], (byte) 126);
			aClass131_Sub15_Sub1_4805
			    .method1783(aFloatArray4817[i_284_], (byte) 126);
			aClass131_Sub15_Sub1_4805.offset += i - 8;
		    }
		} else {
		    for (int i_285_ = 0;
			 (i_285_ ^ 0xffffffff) > (anInt4793 ^ 0xffffffff);
			 i_285_++) {
			aClass131_Sub15_Sub1_4805
			    .method1782(aFloatArray4814[i_285_], (byte) -30);
			aClass131_Sub15_Sub1_4805
			    .method1782(aFloatArray4817[i_285_], (byte) -30);
			aClass131_Sub15_Sub1_4805.offset += i - 8;
		    }
		}
	    }
	    aClass131_Sub15_Sub1_4805.offset = i * anInt4793;
	    if (arg1 <= 45)
		method2262(-96, 48, -39);
	    Interface2 interface2;
	    if (!arg0) {
		interface2
		    = aClass130_Sub2_4806.method1301(i,
						     (aClass131_Sub15_Sub1_4805
						      .data),
						     (aClass131_Sub15_Sub1_4805
						      .offset),
						     false);
		aBoolean4794 = true;
	    } else {
		if (null != anInterface2_4796)
		    anInterface2_4796.method3(i,
					      (aClass131_Sub15_Sub1_4805
					       .data),
					      (aClass131_Sub15_Sub1_4805
					       .offset));
		else
		    anInterface2_4796
			= (aClass130_Sub2_4806.method1301
			   (i, aClass131_Sub15_Sub1_4805.data,
			    aClass131_Sub15_Sub1_4805.offset, true));
		aByte4798 = (byte) 0;
		interface2 = anInterface2_4796;
	    }
	    if (bool_230_) {
		aClass7_4834.aByte100 = i_232_;
		aClass7_4834.anInterface2_101 = interface2;
	    }
	    if (bool_231_) {
		aClass7_4813.anInterface2_101 = interface2;
		aClass7_4813.aByte100 = i_235_;
	    }
	    if (bool) {
		aClass7_4807.aByte100 = i_233_;
		aClass7_4807.anInterface2_101 = interface2;
	    }
	    if (bool_229_) {
		aClass7_4787.aByte100 = i_234_;
		aClass7_4787.anInterface2_101 = interface2;
	    }
	}
    }
    
    public void method2275(Class154 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	Class154_Sub1 class154_sub1 = (Class154_Sub1) arg0;
	if (0 != anInt4799 && class154_sub1.anInt4799 != 0) {
	    int i = class154_sub1.anInt4792;
	    int[] is = class154_sub1.anIntArray4837;
	    int[] is_286_ = class154_sub1.anIntArray4803;
	    int[] is_287_ = class154_sub1.anIntArray4831;
	    short[] is_288_ = class154_sub1.aShortArray4820;
	    short[] is_289_ = class154_sub1.aShortArray4821;
	    short[] is_290_ = class154_sub1.aShortArray4825;
	    byte[] is_291_ = class154_sub1.aByteArray4828;
	    byte[] is_292_;
	    short[] is_293_;
	    short[] is_294_;
	    short[] is_295_;
	    if (null == aClass109_4802) {
		is_294_ = null;
		is_292_ = null;
		is_293_ = null;
		is_295_ = null;
	    } else {
		is_292_ = aClass109_4802.aByteArray1423;
		is_293_ = aClass109_4802.aShortArray1421;
		is_294_ = aClass109_4802.aShortArray1422;
		is_295_ = aClass109_4802.aShortArray1424;
	    }
	    short[] is_296_;
	    byte[] is_297_;
	    short[] is_298_;
	    short[] is_299_;
	    if (class154_sub1.aClass109_4802 == null) {
		is_296_ = null;
		is_299_ = null;
		is_298_ = null;
		is_297_ = null;
	    } else {
		is_296_ = class154_sub1.aClass109_4802.aShortArray1421;
		is_297_ = class154_sub1.aClass109_4802.aByteArray1423;
		is_298_ = class154_sub1.aClass109_4802.aShortArray1422;
		is_299_ = class154_sub1.aClass109_4802.aShortArray1424;
	    }
	    int[] is_300_ = class154_sub1.anIntArray4840;
	    short[] is_301_ = class154_sub1.aShortArray4824;
	    if (!class154_sub1.aBoolean4790)
		class154_sub1.method2298(91);
	    int i_302_ = class154_sub1.aShort4827;
	    int i_303_ = class154_sub1.aShort4812;
	    int i_304_ = class154_sub1.aShort4816;
	    int i_305_ = class154_sub1.aShort4842;
	    int i_306_ = class154_sub1.aShort4788;
	    int i_307_ = class154_sub1.aShort4809;
	    for (int i_308_ = 0; anInt4792 > i_308_; i_308_++) {
		int i_309_ = -arg2 + anIntArray4803[i_308_];
		if ((i_302_ ^ 0xffffffff) >= (i_309_ ^ 0xffffffff)
		    && (i_309_ ^ 0xffffffff) >= (i_303_ ^ 0xffffffff)) {
		    int i_310_ = -arg1 + anIntArray4837[i_308_];
		    if ((i_310_ ^ 0xffffffff) <= (i_304_ ^ 0xffffffff)
			&& i_310_ <= i_305_) {
			int i_311_ = anIntArray4831[i_308_] - arg3;
			if ((i_311_ ^ 0xffffffff) <= (i_306_ ^ 0xffffffff)
			    && i_307_ >= i_311_) {
			    int i_312_ = -1;
			    int i_313_ = anIntArray4840[i_308_];
			    int i_314_ = anIntArray4840[1 + i_308_];
			    for (int i_315_ = i_313_; i_315_ < i_314_;
				 i_315_++) {
				i_312_ = aShortArray4824[i_315_] - 1;
				if ((i_312_ ^ 0xffffffff) == 0
				    || -1 != (aByteArray4828[i_312_]
					      ^ 0xffffffff))
				    break;
			    }
			    if (-1 != i_312_) {
				for (int i_316_ = 0; i > i_316_; i_316_++) {
				    if (i_310_ == is[i_316_]
					&& ((i_311_ ^ 0xffffffff)
					    == (is_287_[i_316_] ^ 0xffffffff))
					&& ((is_286_[i_316_] ^ 0xffffffff)
					    == (i_309_ ^ 0xffffffff))) {
					i_313_ = is_300_[i_316_];
					int i_317_ = -1;
					i_314_ = is_300_[i_316_ - -1];
					for (int i_318_ = i_313_;
					     ((i_318_ ^ 0xffffffff)
					      > (i_314_ ^ 0xffffffff));
					     i_318_++) {
					    i_317_ = -1 + is_301_[i_318_];
					    if (i_317_ == -1
						|| is_291_[i_317_] != 0)
						break;
					}
					if (0 != (i_317_ ^ 0xffffffff)) {
					    if (is_295_ == null) {
						aClass109_4802
						    = new Class109();
						is_295_
						    = aClass109_4802
							  .aShortArray1424
						    = (Class53.method605
						       (aShortArray4820, 79));
						is_293_
						    = aClass109_4802
							  .aShortArray1421
						    = (Class53.method605
						       (aShortArray4821, 111));
						is_294_
						    = aClass109_4802
							  .aShortArray1422
						    = (Class53.method605
						       (aShortArray4825, 41));
						is_292_
						    = aClass109_4802
							  .aByteArray1423
						    = (Class142.method2135
						       (aByteArray4828,
							false));
					    }
					    if (is_299_ == null) {
						Class109 class109
						    = (class154_sub1
							   .aClass109_4802
						       = new Class109());
						is_299_
						    = class109.aShortArray1424
						    = (Class53.method605
						       (is_288_, 65));
						is_296_
						    = class109.aShortArray1421
						    = (Class53.method605
						       (is_289_, 113));
						is_298_
						    = class109.aShortArray1422
						    = (Class53.method605
						       (is_290_, 76));
						is_297_
						    = class109.aByteArray1423
						    = (Class142.method2135
						       (is_291_, false));
					    }
					    short i_319_
						= aShortArray4820[i_312_];
					    short i_320_
						= aShortArray4821[i_312_];
					    short i_321_
						= aShortArray4825[i_312_];
					    i_313_ = is_300_[i_316_];
					    byte i_322_
						= aByteArray4828[i_312_];
					    i_314_ = is_300_[i_316_ - -1];
					    for (int i_323_ = i_313_;
						 i_314_ > i_323_; i_323_++) {
						int i_324_
						    = -1 + is_301_[i_323_];
						if (-1 == i_324_)
						    break;
						if (is_297_[i_324_] != 0) {
						    is_299_[i_324_] += i_319_;
						    is_296_[i_324_] += i_320_;
						    is_298_[i_324_] += i_321_;
						    is_297_[i_324_] += i_322_;
						}
					    }
					    i_314_
						= anIntArray4840[1 + i_308_];
					    i_322_ = is_291_[i_317_];
					    i_313_ = anIntArray4840[i_308_];
					    i_321_ = is_290_[i_317_];
					    i_320_ = is_289_[i_317_];
					    i_319_ = is_288_[i_317_];
					    for (int i_325_ = i_313_;
						 i_325_ < i_314_; i_325_++) {
						int i_326_
						    = -1 + (aShortArray4824
							    [i_325_]);
						if (0 == (i_326_ ^ 0xffffffff))
						    break;
						if (is_292_[i_326_] != 0) {
						    is_295_[i_326_] += i_319_;
						    is_293_[i_326_] += i_320_;
						    is_294_[i_326_] += i_321_;
						    is_292_[i_326_] += i_322_;
						}
					    }
					    if (null == aClass7_4787
						&& null != aClass7_4807)
						aClass7_4807.anInterface2_101
						    = null;
					    if (aClass7_4787 != null)
						aClass7_4787.anInterface2_101
						    = null;
					    if ((null
						 == class154_sub1.aClass7_4787)
						&& (class154_sub1.aClass7_4807
						    != null))
						class154_sub1.aClass7_4807
						    .anInterface2_101
						    = null;
					    if (class154_sub1.aClass7_4787
						!= null)
						class154_sub1.aClass7_4787
						    .anInterface2_101
						    = null;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2284(int arg0) {
	if (null != aClass7_4807)
	    aClass7_4807.anInterface2_101 = null;
	aShort4839 = (short) arg0;
	if (null != aClass7_4787)
	    aClass7_4787.anInterface2_101 = null;
    }
    
    public Class131_Sub41_Sub13 method2283(Class131_Sub41_Sub13 arg0) {
	Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1;
	try {
	    if (0 == anInt4793)
		return null;
	    if (!aBoolean4790)
		method2298(-128);
	    int i;
	    int i_327_;
	    if (-1 <= (aClass130_Sub2_4806.anInt3367 ^ 0xffffffff)) {
		i = (aShort4816 + -(aClass130_Sub2_4806.anInt3367 * aShort4827
				    >> -1639793848)
		     >> aClass130_Sub2_4806.anInt3321);
		i_327_ = (-(aClass130_Sub2_4806.anInt3367 * aShort4812
			    >> 1068817064) + aShort4842
			  >> aClass130_Sub2_4806.anInt3321);
	    } else {
		i = (aShort4816 - (aClass130_Sub2_4806.anInt3367 * aShort4812
				   >> 1210206824)
		     >> aClass130_Sub2_4806.anInt3321);
		i_327_
		    = (aShort4842 - (aClass130_Sub2_4806.anInt3367 * aShort4827
				     >> -1890660344)
		       >> aClass130_Sub2_4806.anInt3321);
	    }
	    int i_328_;
	    int i_329_;
	    if (-1 <= (aClass130_Sub2_4806.anInt3394 ^ 0xffffffff)) {
		i_328_ = (-(aClass130_Sub2_4806.anInt3394 * aShort4827
			    >> -290990328) + aShort4788
			  >> aClass130_Sub2_4806.anInt3321);
		i_329_ = (-(aClass130_Sub2_4806.anInt3394 * aShort4812
			    >> -1490429816) + aShort4809
			  >> aClass130_Sub2_4806.anInt3321);
	    } else {
		i_328_ = (-(aClass130_Sub2_4806.anInt3394 * aShort4812
			    >> -57719256) + aShort4788
			  >> aClass130_Sub2_4806.anInt3321);
		i_329_
		    = (aShort4809 - (aClass130_Sub2_4806.anInt3394 * aShort4827
				     >> 935364552)
		       >> aClass130_Sub2_4806.anInt3321);
	    }
	    int i_330_ = 1 + -i + i_327_;
	    int i_331_ = i_329_ - i_328_ - -1;
	    Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1_332_
		= (Class131_Sub41_Sub13_Sub1) arg0;
	    Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1_333_;
	    if (null != class131_sub41_sub13_sub1_332_
		&& class131_sub41_sub13_sub1_332_.method2017(i_331_, true,
							     i_330_)) {
		class131_sub41_sub13_sub1_333_
		    = class131_sub41_sub13_sub1_332_;
		class131_sub41_sub13_sub1_333_.method2019(125);
	    } else
		class131_sub41_sub13_sub1_333_
		    = new Class131_Sub41_Sub13_Sub1(aClass130_Sub2_4806,
						    i_330_, i_331_);
	    class131_sub41_sub13_sub1_333_.method2016((byte) 100, i_329_,
						      i_328_, i, i_327_);
	    method2292((byte) 52, class131_sub41_sub13_sub1_333_);
	    class131_sub41_sub13_sub1 = class131_sub41_sub13_sub1_333_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class131_sub41_sub13_sub1;
    }
    
    public void method2295(int arg0) {
	if (0 != anInt4799) {
	    if (-1 != (aByte4798 ^ 0xffffffff))
		method2294(true, (byte) 77);
	    method2294(false, (byte) 87);
	    if (null == aClass95_4791.anInterface7_1271)
		method2293((aByte4798 & 0x10 ^ 0xffffffff) != -1, (byte) -43);
	    method2302((byte) -120);
	    aClass130_Sub2_4806.method1325(null != aClass7_4787);
	    aClass130_Sub2_4806.method1305(aClass7_4834, aClass7_4787,
					   aClass7_4807, aClass7_4813);
	    int i = -1 + anIntArray4829.length;
	    if (arg0 >= -69)
		anIntArray4831 = null;
	    for (int i_334_ = 0; i > i_334_; i_334_++) {
		int i_335_ = anIntArray4829[i_334_];
		int i_336_ = anIntArray4829[1 + i_334_];
		int i_337_ = aShortArray4830[i_335_] & 0xffff;
		if ((i_337_ ^ 0xffffffff) == -65536)
		    i_337_ = -1;
		aClass130_Sub2_4806.method1315(i_337_, null != aClass7_4787);
		aClass130_Sub2_4806.method1312(aClass95_4791.anInterface7_1271,
					       4, i_335_ * 3,
					       (-i_335_ + i_336_) * 3);
	    }
	}
    }
    
    public void method2279() {
	for (int i = 0; (anInt4838 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    anIntArray4837[i] = 7 + anIntArray4837[i] >> 884815044;
	    anIntArray4803[i] = 7 + anIntArray4803[i] >> -342424188;
	    anIntArray4831[i] = anIntArray4831[i] - -7 >> 1338340132;
	}
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
	aBoolean4790 = false;
    }
    
    public void method2281(short arg0, short arg1) {
	Interface4 interface4 = aClass130_Sub2_4806.anInterface4_3303;
	for (int i = 0; anInt4799 > i; i++) {
	    if ((arg0 ^ 0xffffffff) == (aShortArray4830[i] ^ 0xffffffff))
		aShortArray4830[i] = arg1;
	}
	byte i = 0;
	byte i_338_ = 0;
	if (arg0 != -1) {
	    Class42 class42 = interface4.method10(-19907, 0xffff & arg0);
	    i = class42.aByte570;
	    i_338_ = class42.aByte577;
	}
	byte i_339_ = 0;
	byte i_340_ = 0;
	if (0 != (arg1 ^ 0xffffffff)) {
	    Class42 class42 = interface4.method10(-19907, arg1 & 0xffff);
	    i_339_ = class42.aByte570;
	    i_340_ = class42.aByte577;
	}
	if (aClass7_4807 != null & (i_338_ != i_340_ | i != i_339_))
	    aClass7_4807.anInterface2_101 = null;
    }
    
    public boolean method2286() {
	boolean bool;
	try {
	    if (aShortArray4830 == null)
		return true;
	    for (int i = 0; aShortArray4830.length > i; i++) {
		if (aShortArray4830[i] != -1
		    && !aClass130_Sub2_4806.anInterface4_3303
			    .method11(false, aShortArray4830[i]))
		    return false;
	    }
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public void method2248(int arg0) {
	anInt4822 = arg0;
	aBoolean4794 = true;
	if (null != aClass109_4802
	    && -1 == (0x8000 & anInt4822 ^ 0xffffffff)) {
	    aByteArray4828 = aClass109_4802.aByteArray1423;
	    aShortArray4821 = aClass109_4802.aShortArray1421;
	    aShortArray4825 = aClass109_4802.aShortArray1422;
	    aShortArray4820 = aClass109_4802.aShortArray1424;
	    aClass109_4802 = null;
	}
	method2302((byte) -118);
    }
    
    public void method2288(int arg0) {
	int i = Class31.anIntArray434[arg0];
	int i_341_ = Class31.anIntArray425[arg0];
	for (int i_342_ = 0; (i_342_ ^ 0xffffffff) > (anInt4792 ^ 0xffffffff);
	     i_342_++) {
	    int i_343_ = ((i_341_ * anIntArray4803[i_342_]
			   + -(i * anIntArray4831[i_342_]))
			  >> -1041959729);
	    anIntArray4831[i_342_]
		= (anIntArray4803[i_342_] * i + i_341_ * anIntArray4831[i_342_]
		   >> 955239151);
	    anIntArray4803[i_342_] = i_343_;
	}
	aBoolean4790 = false;
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
    }
    
    public static int method2296(float arg0, float arg1, boolean arg2,
				 float arg3) {
	int i;
	try {
	    float f = arg3 < 0.0F ? -arg3 : arg3;
	    if (arg2 != true)
		aFloat4844 = -0.22167517F;
	    float f_344_ = !(0.0F > arg1) ? arg1 : -arg1;
	    float f_345_ = arg0 < 0.0F ? -arg0 : arg0;
	    if (!(f_344_ > f) || !(f_344_ > f_345_)) {
		if (f_345_ > f && f_344_ < f_345_) {
		    if (!(0.0F < arg0))
			return 3;
		    return 2;
		}
		if (0.0F < arg3)
		    return 4;
		return 5;
	    }
	    if (!(0.0F < arg1))
		return 1;
	    i = 0;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public Class104[] method2266() {
	Class104[] class104s;
	try {
	    class104s = aClass104Array4819;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class104s;
    }
    
    public static void method2297(float[] arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, float arg6, float arg7,
				  int arg8, int arg9, int arg10) {
	arg5 -= arg2;
	arg8 -= arg10;
	arg3 -= arg4;
	float f = ((float) arg3 * arg0[2]
		   + ((float) arg8 * arg0[1] + arg0[arg1] * (float) arg5));
	float f_346_ = (arg0[3] * (float) arg5 + arg0[4] * (float) arg8
			+ arg0[5] * (float) arg3);
	float f_347_ = ((float) arg3 * arg0[8]
			+ ((float) arg5 * arg0[6] + arg0[7] * (float) arg8));
	float f_348_
	    = (0.5F
	       + (float) Math.atan2((double) f, (double) f_347_) / 6.2831855F);
	if (1.0F != arg6)
	    f_348_ *= arg6;
	float f_349_ = arg7 + (0.5F + f_346_);
	if (-2 == (arg9 ^ 0xffffffff)) {
	    float f_350_ = f_348_;
	    f_348_ = -f_349_;
	    f_349_ = f_350_;
	} else if ((arg9 ^ 0xffffffff) != -3) {
	    if (3 == arg9) {
		float f_351_ = f_348_;
		f_348_ = f_349_;
		f_349_ = -f_351_;
	    }
	} else {
	    f_348_ = -f_348_;
	    f_349_ = -f_349_;
	}
	aFloat4823 = f_349_;
	aFloat4844 = f_348_;
    }
    
    public int method2267() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(20);
	    i = aShort4842;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2253() {
	int i;
	try {
	    i = anInt4822;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method2298(int arg0) {
	int i = 32767;
	int i_352_ = -16 % ((-83 - arg0) / 37);
	int i_353_ = 32767;
	int i_354_ = 32767;
	int i_355_ = -32768;
	int i_356_ = -32768;
	int i_357_ = -32768;
	int i_358_ = 0;
	int i_359_ = 0;
	for (int i_360_ = 0; i_360_ < anInt4792; i_360_++) {
	    int i_361_ = anIntArray4837[i_360_];
	    int i_362_ = anIntArray4803[i_360_];
	    if (i_362_ > i_356_)
		i_356_ = i_362_;
	    if ((i_362_ ^ 0xffffffff) > (i_353_ ^ 0xffffffff))
		i_353_ = i_362_;
	    if ((i_355_ ^ 0xffffffff) > (i_361_ ^ 0xffffffff))
		i_355_ = i_361_;
	    if (i > i_361_)
		i = i_361_;
	    int i_363_ = anIntArray4831[i_360_];
	    if ((i_363_ ^ 0xffffffff) > (i_354_ ^ 0xffffffff))
		i_354_ = i_363_;
	    if (i_357_ < i_363_)
		i_357_ = i_363_;
	    int i_364_ = i_363_ * i_363_ + i_361_ * i_361_;
	    if ((i_364_ ^ 0xffffffff) < (i_358_ ^ 0xffffffff))
		i_358_ = i_364_;
	    i_364_ = i_362_ * i_362_ + i_361_ * i_361_ + i_363_ * i_363_;
	    if (i_364_ > i_359_)
		i_359_ = i_364_;
	}
	aShort4788 = (short) i_354_;
	aShort4809 = (short) i_357_;
	aShort4816 = (short) i;
	aShort4842 = (short) i_355_;
	aShort4827 = (short) i_353_;
	aShort4812 = (short) i_356_;
	aShort4818 = (short) (int) (0.99 + Math.sqrt((double) i_358_));
	Math.sqrt((double) i_359_);
	aBoolean4790 = true;
    }
    
    public int method2259() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(-121);
	    i = aShort4818;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public Class154 method2299(boolean arg0, int arg1, Class154_Sub1 arg2,
			       boolean arg3, Class154_Sub1 arg4,
			       boolean arg5) {
	Class154_Sub1 class154_sub1;
	try {
	    arg2.aByte4798 = (byte) 0;
	    arg2.aShort4797 = aShort4797;
	    arg2.anInt4793 = anInt4793;
	    arg2.anInt4841 = anInt4841;
	    arg2.anInt4838 = anInt4838;
	    arg2.anInt4799 = anInt4799;
	    arg2.anInt4822 = arg1;
	    arg2.aShort4839 = aShort4839;
	    arg2.anInt4792 = anInt4792;
	    boolean bool = Class194.method2655(arg1, -1, anInt4841);
	    boolean bool_365_
		= Class194.method2649(arg1, anInt4841, (byte) 98);
	    boolean bool_366_ = Class194.method2656(544, anInt4841, arg1);
	    boolean bool_367_ = bool | bool_365_ | bool_366_;
	    if (!bool_367_) {
		arg2.anIntArray4803 = anIntArray4803;
		arg2.anIntArray4831 = anIntArray4831;
		arg2.anIntArray4837 = anIntArray4837;
	    } else {
		if (bool) {
		    if (arg4.anIntArray4837 != null
			&& anInt4838 <= arg4.anIntArray4837.length)
			arg2.anIntArray4837 = arg4.anIntArray4837;
		    else
			arg2.anIntArray4837 = arg4.anIntArray4837
			    = new int[anInt4838];
		} else
		    arg2.anIntArray4837 = anIntArray4837;
		if (bool_365_) {
		    if (arg4.anIntArray4803 != null
			&& anInt4838 <= arg4.anIntArray4803.length)
			arg2.anIntArray4803 = arg4.anIntArray4803;
		    else
			arg2.anIntArray4803 = arg4.anIntArray4803
			    = new int[anInt4838];
		} else
		    arg2.anIntArray4803 = anIntArray4803;
		if (bool_366_) {
		    if (arg4.anIntArray4831 == null
			|| anInt4838 > arg4.anIntArray4831.length)
			arg2.anIntArray4831 = arg4.anIntArray4831
			    = new int[anInt4838];
		    else
			arg2.anIntArray4831 = arg4.anIntArray4831;
		} else
		    arg2.anIntArray4831 = anIntArray4831;
		for (int i = 0; (i ^ 0xffffffff) > (anInt4838 ^ 0xffffffff);
		     i++) {
		    if (bool)
			arg2.anIntArray4837[i] = anIntArray4837[i];
		    if (bool_365_)
			arg2.anIntArray4803[i] = anIntArray4803[i];
		    if (bool_366_)
			arg2.anIntArray4831[i] = anIntArray4831[i];
		}
	    }
	    if (!Class194.method2659(anInt4841, (byte) 83, arg1)) {
		if (Class194.method2641(arg1, anInt4841, -1))
		    arg2.aClass7_4834 = aClass7_4834;
		else
		    arg2.aClass7_4834 = null;
	    } else {
		if (arg3)
		    arg2.aByte4798 |= 0x1;
		arg2.aClass7_4834 = arg4.aClass7_4834;
		arg2.aClass7_4834.anInterface2_101
		    = aClass7_4834.anInterface2_101;
		arg2.aClass7_4834.aByte100 = aClass7_4834.aByte100;
	    }
	    if (Class194.method2642(anInt4841, arg1, 8320)) {
		if (arg4.aShortArray4826 != null
		    && arg4.aShortArray4826.length >= anInt4799)
		    arg2.aShortArray4826 = arg4.aShortArray4826;
		else
		    arg2.aShortArray4826 = arg4.aShortArray4826
			= new short[anInt4799];
		for (int i = 0; (anInt4799 ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    arg2.aShortArray4826[i] = aShortArray4826[i];
	    } else
		arg2.aShortArray4826 = aShortArray4826;
	    if (Class194.method2635(arg1, anInt4841, 1024)) {
		if (null == arg4.aByteArray4789
		    || (anInt4799 ^ 0xffffffff) < (arg4.aByteArray4789.length
						   ^ 0xffffffff))
		    arg2.aByteArray4789 = arg4.aByteArray4789
			= new byte[anInt4799];
		else
		    arg2.aByteArray4789 = arg4.aByteArray4789;
		for (int i = 0; (i ^ 0xffffffff) > (anInt4799 ^ 0xffffffff);
		     i++)
		    arg2.aByteArray4789[i] = aByteArray4789[i];
	    } else
		arg2.aByteArray4789 = aByteArray4789;
	    if (Class194.method2631(arg1, true, anInt4841)) {
		if (arg3)
		    arg2.aByte4798 |= 0x2;
		arg2.aClass7_4807 = arg4.aClass7_4807;
		arg2.aClass7_4807.aByte100 = aClass7_4807.aByte100;
		arg2.aClass7_4807.anInterface2_101
		    = aClass7_4807.anInterface2_101;
	    } else if (Class194.method2648(anInt4841, -1, arg1))
		arg2.aClass7_4807 = aClass7_4807;
	    else
		arg2.aClass7_4807 = null;
	    if (Class194.method2650(8970, anInt4841, arg1)) {
		if (arg4.aShortArray4820 == null
		    || ((arg4.aShortArray4820.length ^ 0xffffffff)
			> (anInt4793 ^ 0xffffffff))) {
		    int i = anInt4793;
		    arg2.aShortArray4825 = arg4.aShortArray4825 = new short[i];
		    arg2.aShortArray4820 = arg4.aShortArray4820 = new short[i];
		    arg2.aShortArray4821 = arg4.aShortArray4821 = new short[i];
		} else {
		    arg2.aShortArray4820 = arg4.aShortArray4820;
		    arg2.aShortArray4821 = arg4.aShortArray4821;
		    arg2.aShortArray4825 = arg4.aShortArray4825;
		}
		if (aClass109_4802 != null) {
		    if (arg4.aClass109_4802 == null)
			arg4.aClass109_4802 = new Class109();
		    Class109 class109
			= arg2.aClass109_4802 = arg4.aClass109_4802;
		    if (null == class109.aShortArray1424
			|| ((class109.aShortArray1424.length ^ 0xffffffff)
			    > (anInt4793 ^ 0xffffffff))) {
			int i = anInt4793;
			class109.aShortArray1421 = new short[i];
			class109.aShortArray1424 = new short[i];
			class109.aByteArray1423 = new byte[i];
			class109.aShortArray1422 = new short[i];
		    }
		    for (int i = 0; i < anInt4793; i++) {
			arg2.aShortArray4820[i] = aShortArray4820[i];
			arg2.aShortArray4821[i] = aShortArray4821[i];
			arg2.aShortArray4825[i] = aShortArray4825[i];
			class109.aShortArray1424[i]
			    = aClass109_4802.aShortArray1424[i];
			class109.aShortArray1421[i]
			    = aClass109_4802.aShortArray1421[i];
			class109.aShortArray1422[i]
			    = aClass109_4802.aShortArray1422[i];
			class109.aByteArray1423[i]
			    = aClass109_4802.aByteArray1423[i];
		    }
		} else {
		    for (int i = 0; anInt4793 > i; i++) {
			arg2.aShortArray4820[i] = aShortArray4820[i];
			arg2.aShortArray4821[i] = aShortArray4821[i];
			arg2.aShortArray4825[i] = aShortArray4825[i];
		    }
		}
		arg2.aByteArray4828 = aByteArray4828;
	    } else {
		arg2.aShortArray4821 = aShortArray4821;
		arg2.aShortArray4825 = aShortArray4825;
		arg2.aShortArray4820 = aShortArray4820;
		arg2.aClass109_4802 = aClass109_4802;
		arg2.aByteArray4828 = aByteArray4828;
	    }
	    if (!Class194.method2643(32768, anInt4841, arg1)) {
		if (!Class194.method2651(anInt4841, arg1, -114))
		    arg2.aClass7_4787 = null;
		else
		    arg2.aClass7_4787 = aClass7_4787;
	    } else {
		arg2.aClass7_4787 = arg4.aClass7_4787;
		if (arg3)
		    arg2.aByte4798 |= 0x4;
		arg2.aClass7_4787.aByte100 = aClass7_4787.aByte100;
		arg2.aClass7_4787.anInterface2_101
		    = aClass7_4787.anInterface2_101;
	    }
	    if (!Class194.method2657((byte) -97, anInt4841, arg1)) {
		arg2.aFloatArray4814 = aFloatArray4814;
		arg2.aFloatArray4817 = aFloatArray4817;
	    } else {
		if (arg4.aFloatArray4814 != null
		    && (anInt4799 ^ 0xffffffff) >= (arg4.aFloatArray4814.length
						    ^ 0xffffffff)) {
		    arg2.aFloatArray4817 = arg4.aFloatArray4817;
		    arg2.aFloatArray4814 = arg4.aFloatArray4814;
		} else {
		    int i = anInt4793;
		    arg2.aFloatArray4817 = arg4.aFloatArray4817 = new float[i];
		    arg2.aFloatArray4814 = arg4.aFloatArray4814 = new float[i];
		}
		for (int i = 0; anInt4793 > i; i++) {
		    arg2.aShortArray4835[i] = aShortArray4835[i];
		    arg2.aShortArray4811[i] = aShortArray4811[i];
		}
	    }
	    if (Class194.method2632(anInt4841, 6422, arg1)) {
		if (arg3)
		    arg2.aByte4798 |= 0x8;
		arg2.aClass7_4813 = arg4.aClass7_4813;
		arg2.aClass7_4813.anInterface2_101
		    = aClass7_4813.anInterface2_101;
		arg2.aClass7_4813.aByte100 = aClass7_4813.aByte100;
	    } else if (Class194.method2637(anInt4841, arg1, 33))
		arg2.aClass7_4813 = aClass7_4813;
	    else
		arg2.aClass7_4813 = null;
	    if (Class194.method2652((byte) 66, arg1, anInt4841)) {
		if (null == arg4.aShortArray4835
		    || anInt4799 > arg4.aShortArray4835.length) {
		    int i = anInt4799;
		    arg2.aShortArray4811 = arg4.aShortArray4811 = new short[i];
		    arg2.aShortArray4835 = arg4.aShortArray4835 = new short[i];
		    arg2.aShortArray4843 = arg4.aShortArray4843 = new short[i];
		} else {
		    arg2.aShortArray4811 = arg4.aShortArray4811;
		    arg2.aShortArray4835 = arg4.aShortArray4835;
		    arg2.aShortArray4843 = arg4.aShortArray4843;
		}
		for (int i = 0; (anInt4799 ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    arg2.aShortArray4835[i] = aShortArray4835[i];
		    arg2.aShortArray4811[i] = aShortArray4811[i];
		    arg2.aShortArray4843[i] = aShortArray4843[i];
		}
	    } else {
		arg2.aShortArray4811 = aShortArray4811;
		arg2.aShortArray4843 = aShortArray4843;
		arg2.aShortArray4835 = aShortArray4835;
	    }
	    if (Class194.method2661(arg1, anInt4841, -4342)) {
		arg2.aClass95_4791 = arg4.aClass95_4791;
		if (arg3)
		    arg2.aByte4798 |= 0x10;
		arg2.aClass95_4791.anInterface7_1271
		    = aClass95_4791.anInterface7_1271;
	    } else if (!Class194.method2633(anInt4841, -14331, arg1))
		arg2.aClass95_4791 = null;
	    else
		arg2.aClass95_4791 = aClass95_4791;
	    if (arg5 != true)
		method2297(null, 51, 123, 42, -61, -24, 0.5962638F, 0.5333432F,
			   11, -107, 91);
	    if (!Class194.method2638(arg1, (byte) 19, anInt4841))
		arg2.aShortArray4830 = aShortArray4830;
	    else {
		if (arg4.aShortArray4830 == null
		    || anInt4799 > arg4.aShortArray4830.length) {
		    int i = anInt4799;
		    arg2.aShortArray4830 = arg4.aShortArray4830 = new short[i];
		} else
		    arg2.aShortArray4830 = arg4.aShortArray4830;
		for (int i = 0; i < anInt4799; i++)
		    arg2.aShortArray4830[i] = aShortArray4830[i];
	    }
	    arg2.anIntArray4829 = anIntArray4829;
	    arg2.aShortArray4824 = aShortArray4824;
	    arg2.aClass104Array4819 = aClass104Array4819;
	    arg2.anIntArrayArray4800 = anIntArrayArray4800;
	    arg2.anIntArrayArray4808 = anIntArrayArray4808;
	    arg2.aClass41Array4815 = aClass41Array4815;
	    if (!aBoolean4790)
		arg2.aBoolean4790 = false;
	    else {
		arg2.aShort4816 = aShort4816;
		arg2.aShort4788 = aShort4788;
		arg2.aShort4818 = aShort4818;
		arg2.aShort4842 = aShort4842;
		arg2.aBoolean4790 = true;
		arg2.aShort4812 = aShort4812;
		arg2.aShort4827 = aShort4827;
		arg2.aShort4809 = aShort4809;
	    }
	    arg2.aShortArray4845 = aShortArray4845;
	    arg2.aShortArray4832 = aShortArray4832;
	    arg2.anIntArray4840 = anIntArray4840;
	    class154_sub1 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class154_sub1;
    }
    
    public void method2246() {
	if ((anInt4793 ^ 0xffffffff) < -1 && 0 < anInt4799) {
	    method2294(false, (byte) 66);
	    if (0 == (aByte4798 & 0x10)
		&& aClass95_4791.anInterface7_1271 == null)
		method2293(false, (byte) -41);
	    method2302((byte) -121);
	}
    }
    
    public int method2265() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(-125);
	    i = aShort4816;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public int method2277() {
	short i;
	try {
	    i = aShort4839;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public static void method2300(float arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  float[] arg8, int arg9) {
	arg7 -= arg2;
	arg9 -= arg1;
	arg6 -= arg4;
	float f = (arg8[2] * (float) arg9
		   + (arg8[0] * (float) arg7 + (float) arg6 * arg8[1]));
	float f_368_ = ((float) arg9 * arg8[5]
			+ ((float) arg7 * arg8[3] + arg8[4] * (float) arg6));
	float f_369_ = (arg8[7] * (float) arg6 + arg8[6] * (float) arg7
			+ (float) arg9 * arg8[8]);
	float f_370_ = (float) Math.sqrt((double) (f_368_ * f_368_ + f * f
						   + f_369_ * f_369_));
	float f_371_
	    = (0.5F
	       + (float) Math.atan2((double) f, (double) f_369_) / 6.2831855F);
	if (arg5 != -3866)
	    method2297(null, 41, -86, 42, -1, -108, -0.8345275F, -0.3289918F,
		       -90, -33, 81);
	float f_372_
	    = (arg0
	       + ((float) Math.asin((double) (f_368_ / f_370_)) / 3.1415927F
		  + 0.5F));
	if (1 != arg3) {
	    if ((arg3 ^ 0xffffffff) == -3) {
		f_371_ = -f_371_;
		f_372_ = -f_372_;
	    } else if (-4 == (arg3 ^ 0xffffffff)) {
		float f_373_ = f_371_;
		f_371_ = f_372_;
		f_372_ = -f_373_;
	    }
	} else {
	    float f_374_ = f_371_;
	    f_371_ = -f_372_;
	    f_372_ = f_374_;
	}
	aFloat4795 = f_371_;
	aFloat4833 = f_372_;
    }
    
    public void method2282(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   boolean arg5, int arg6, int[] arg7) {
	int i = arg1.length;
	if ((arg0 ^ 0xffffffff) == -1) {
	    arg4 <<= 4;
	    arg2 <<= 4;
	    arg3 <<= 4;
	    anInt4853 = 0;
	    anInt4851 = 0;
	    int i_375_ = 0;
	    anInt4854 = 0;
	    for (int i_376_ = 0; (i_376_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_376_++) {
		int i_377_ = arg1[i_376_];
		if (i_377_ < anIntArrayArray4800.length) {
		    int[] is = anIntArrayArray4800[i_377_];
		    for (int i_378_ = 0; i_378_ < is.length; i_378_++) {
			int i_379_ = is[i_378_];
			if (null == aShortArray4832
			    || ((arg6 & aShortArray4832[i_379_] ^ 0xffffffff)
				!= -1)) {
			    anInt4851 += anIntArray4837[i_379_];
			    anInt4853 += anIntArray4803[i_379_];
			    i_375_++;
			    anInt4854 += anIntArray4831[i_379_];
			}
		    }
		}
	    }
	    if (-1 <= (i_375_ ^ 0xffffffff)) {
		anInt4851 = arg2;
		anInt4853 = arg3;
		anInt4854 = arg4;
	    } else {
		anInt4853 = arg3 + anInt4853 / i_375_;
		anInt4854 = anInt4854 / i_375_ - -arg4;
		aBoolean4846 = true;
		anInt4851 = anInt4851 / i_375_ + arg2;
	    }
	} else if ((arg0 ^ 0xffffffff) == -2) {
	    if (arg7 != null) {
		int i_380_ = (arg7[0] * arg2 + (arg3 * arg7[1]
						- (-(arg7[2] * arg4) + -16384))
			      >> -555223153);
		int i_381_ = (16384 + arg7[3] * arg2 - (-(arg7[4] * arg3)
							+ -(arg7[5] * arg4))
			      >> -817081169);
		int i_382_
		    = (arg3 * arg7[7] + arg2 * arg7[6] - (-(arg7[8] * arg4)
							  - 16384)
		       >> 205010223);
		arg4 = i_382_;
		arg3 = i_381_;
		arg2 = i_380_;
	    }
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    for (int i_383_ = 0; (i_383_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_383_++) {
		int i_384_ = arg1[i_383_];
		if ((i_384_ ^ 0xffffffff)
		    > (anIntArrayArray4800.length ^ 0xffffffff)) {
		    int[] is = anIntArrayArray4800[i_384_];
		    for (int i_385_ = 0; i_385_ < is.length; i_385_++) {
			int i_386_ = is[i_385_];
			if (aShortArray4832 == null
			    || -1 != (arg6 & aShortArray4832[i_386_]
				      ^ 0xffffffff)) {
			    anIntArray4837[i_386_] += arg2;
			    anIntArray4803[i_386_] += arg3;
			    anIntArray4831[i_386_] += arg4;
			}
		    }
		}
	    }
	} else if (2 == arg0) {
	    if (arg7 != null) {
		int i_387_ = arg7[9] << -413978684;
		int i_388_ = arg7[10] << -2141256444;
		int i_389_ = arg7[11] << -101448604;
		int i_390_ = arg7[12] << -1266534396;
		int i_391_ = arg7[13] << 3774756;
		int i_392_ = arg7[14] << -26908764;
		if (aBoolean4846) {
		    int i_393_
			= ((16384 + (arg7[6] * anInt4854 + arg7[0] * anInt4851)
			    + arg7[3] * anInt4853)
			   >> 721490767);
		    int i_394_ = ((anInt4851 * arg7[1] + anInt4853 * arg7[4]
				   - -(arg7[7] * anInt4854) - -16384)
				  >> -1325069745);
		    i_394_ += i_391_;
		    int i_395_
			= ((16384 + anInt4853 * arg7[5]
			    + (arg7[2] * anInt4851 - -(anInt4854 * arg7[8])))
			   >> 1332985007);
		    i_393_ += i_390_;
		    anInt4853 = i_394_;
		    anInt4851 = i_393_;
		    i_395_ += i_392_;
		    anInt4854 = i_395_;
		    aBoolean4846 = false;
		}
		int[] is = new int[9];
		int i_396_ = Class31.anIntArray425[arg2];
		int i_397_ = Class31.anIntArray434[arg2];
		int i_398_ = Class31.anIntArray425[arg3];
		int i_399_ = Class31.anIntArray434[arg3];
		int i_400_ = Class31.anIntArray425[arg4];
		int i_401_ = Class31.anIntArray434[arg4];
		int i_402_ = 16384 + i_400_ * i_397_ >> 398202895;
		int i_403_ = 16384 + i_397_ * i_401_ >> 78273711;
		is[4] = i_396_ * i_400_ + 16384 >> 1535639215;
		is[8] = 16384 + i_396_ * i_398_ >> -816226641;
		is[2] = 16384 + i_396_ * i_399_ >> -337521009;
		is[1]
		    = 16384 + i_402_ * i_399_ + i_401_ * -i_398_ >> 231143439;
		is[0] = (i_398_ * i_400_ - -(i_403_ * i_399_) - -16384
			 >> 1640539887);
		is[5] = -i_397_;
		is[3] = 16384 + i_396_ * i_401_ >> 2045358159;
		is[7] = (16384 + i_399_ * i_401_ - -(i_398_ * i_402_)
			 >> -1376361681);
		is[6]
		    = 16384 + i_398_ * i_403_ + -i_399_ * i_400_ >> -15145681;
		int i_404_ = ((-anInt4854 * is[2] + -anInt4853 * is[1]
			       + (is[0] * -anInt4851 - -16384))
			      >> 1649489711);
		int i_405_ = (16384 + (is[5] * -anInt4854 + -anInt4851 * is[3]
				       - -(-anInt4853 * is[4]))
			      >> -1837156881);
		int i_406_ = (16384 + (is[8] * -anInt4854 + -anInt4853 * is[7])
			      + -anInt4851 * is[6]) >> -1966881905;
		int i_407_ = i_404_ + anInt4851;
		int i_408_ = anInt4853 + i_405_;
		int i_409_ = i_406_ - -anInt4854;
		int[] is_410_ = new int[9];
		for (int i_411_ = 0; (i_411_ ^ 0xffffffff) > -4; i_411_++) {
		    for (int i_412_ = 0; i_412_ < 3; i_412_++) {
			int i_413_ = 0;
			for (int i_414_ = 0; i_414_ < 3; i_414_++)
			    i_413_ += (arg7[i_414_ + 3 * i_412_]
				       * is[i_414_ + i_411_ * 3]);
			is_410_[i_412_ + i_411_ * 3]
			    = 16384 + i_413_ >> 2090095151;
		    }
		}
		int i_415_ = ((is[1] * i_391_
			       + (i_390_ * is[0] - -(is[2] * i_392_)) - -16384)
			      >> -1248436881);
		int i_416_ = (i_390_ * is[3] + (i_391_ * is[4]
						- -(i_392_ * is[5]) + 16384)
			      >> 58934479);
		int i_417_ = (i_390_ * is[6] - (-(i_391_ * is[7])
						+ -(is[8] * i_392_) + -16384)
			      >> -1686599409);
		i_415_ += i_407_;
		i_416_ += i_408_;
		i_417_ += i_409_;
		int[] is_418_ = new int[9];
		for (int i_419_ = 0; (i_419_ ^ 0xffffffff) > -4; i_419_++) {
		    for (int i_420_ = 0; 3 > i_420_; i_420_++) {
			int i_421_ = 0;
			for (int i_422_ = 0; i_422_ < 3; i_422_++)
			    i_421_ += (is_410_[i_422_ * 3 + i_420_]
				       * arg7[i_422_ + 3 * i_419_]);
			is_418_[i_420_ + 3 * i_419_]
			    = 16384 + i_421_ >> 1158987343;
		    }
		}
		int i_423_ = ((i_415_ * arg7[0] - -(i_416_ * arg7[1])
			       - (-(arg7[2] * i_417_) - 16384))
			      >> 90186255);
		int i_424_ = (16384 + (arg7[5] * i_417_ + arg7[3] * i_415_
				       + arg7[4] * i_416_)
			      >> -602045553);
		int i_425_ = ((16384 + (i_417_ * arg7[8] + i_415_ * arg7[6])
			       - -(arg7[7] * i_416_))
			      >> -1299886289);
		i_424_ += i_388_;
		i_423_ += i_387_;
		i_425_ += i_389_;
		for (int i_426_ = 0; (i ^ 0xffffffff) < (i_426_ ^ 0xffffffff);
		     i_426_++) {
		    int i_427_ = arg1[i_426_];
		    if ((i_427_ ^ 0xffffffff)
			> (anIntArrayArray4800.length ^ 0xffffffff)) {
			int[] is_428_ = anIntArrayArray4800[i_427_];
			for (int i_429_ = 0; i_429_ < is_428_.length;
			     i_429_++) {
			    int i_430_ = is_428_[i_429_];
			    if (aShortArray4832 == null
				|| (aShortArray4832[i_430_] & arg6
				    ^ 0xffffffff) != -1) {
				int i_431_
				    = (anIntArray4803[i_430_] * is_418_[1]
				       + (anIntArray4837[i_430_] * is_418_[0]
					  + is_418_[2] * anIntArray4831[i_430_]
					  - -16384)) >> -1237948369;
				int i_432_
				    = ((anIntArray4831[i_430_] * is_418_[5]
					+ anIntArray4803[i_430_] * is_418_[4]
					+ (anIntArray4837[i_430_] * is_418_[3]
					   - -16384))
				       >> 1678578927);
				i_431_ += i_423_;
				int i_433_
				    = (is_418_[7] * anIntArray4803[i_430_]
				       + anIntArray4837[i_430_] * is_418_[6]
				       - -(is_418_[8] * anIntArray4831[i_430_])
				       - -16384) >> 2032073263;
				i_432_ += i_424_;
				i_433_ += i_425_;
				anIntArray4837[i_430_] = i_431_;
				anIntArray4803[i_430_] = i_432_;
				anIntArray4831[i_430_] = i_433_;
			    }
			}
		    }
		}
	    } else {
		for (int i_434_ = 0; i_434_ < i; i_434_++) {
		    int i_435_ = arg1[i_434_];
		    if (i_435_ < anIntArrayArray4800.length) {
			int[] is = anIntArrayArray4800[i_435_];
			for (int i_436_ = 0; i_436_ < is.length; i_436_++) {
			    int i_437_ = is[i_436_];
			    if (aShortArray4832 == null
				|| (arg6 & aShortArray4832[i_437_]) != 0) {
				anIntArray4837[i_437_] -= anInt4851;
				anIntArray4803[i_437_] -= anInt4853;
				anIntArray4831[i_437_] -= anInt4854;
				if (arg4 != 0) {
				    int i_438_ = Class31.anIntArray434[arg4];
				    int i_439_ = Class31.anIntArray425[arg4];
				    int i_440_
					= ((32767
					    + anIntArray4837[i_437_] * i_439_
					    + anIntArray4803[i_437_] * i_438_)
					   >> -1648431185);
				    anIntArray4803[i_437_]
					= ((32767
					    + (i_439_ * anIntArray4803[i_437_]
					       - (i_438_
						  * anIntArray4837[i_437_])))
					   >> 1453821263);
				    anIntArray4837[i_437_] = i_440_;
				}
				if (-1 != (arg2 ^ 0xffffffff)) {
				    int i_441_ = Class31.anIntArray434[arg2];
				    int i_442_ = Class31.anIntArray425[arg2];
				    int i_443_
					= ((32767
					    + anIntArray4803[i_437_] * i_442_
					    + -(i_441_
						* anIntArray4831[i_437_]))
					   >> -2050716849);
				    anIntArray4831[i_437_]
					= (32767
					   + i_441_ * anIntArray4803[i_437_]
					   - -(anIntArray4831[i_437_]
					       * i_442_)) >> 1301205999;
				    anIntArray4803[i_437_] = i_443_;
				}
				if (-1 != (arg3 ^ 0xffffffff)) {
				    int i_444_ = Class31.anIntArray434[arg3];
				    int i_445_ = Class31.anIntArray425[arg3];
				    int i_446_
					= (anIntArray4831[i_437_] * i_444_
					   - -(i_445_ * anIntArray4837[i_437_])
					   - -32767) >> -704579217;
				    anIntArray4831[i_437_]
					= ((32767
					    + i_445_ * anIntArray4831[i_437_]
					    - anIntArray4837[i_437_] * i_444_)
					   >> 1929113839);
				    anIntArray4837[i_437_] = i_446_;
				}
				anIntArray4837[i_437_] += anInt4851;
				anIntArray4803[i_437_] += anInt4853;
				anIntArray4831[i_437_] += anInt4854;
			    }
			}
		    }
		}
		if (arg5) {
		    for (int i_447_ = 0;
			 (i_447_ ^ 0xffffffff) > (i ^ 0xffffffff); i_447_++) {
			int i_448_ = arg1[i_447_];
			if (anIntArrayArray4800.length > i_448_) {
			    int[] is = anIntArrayArray4800[i_448_];
			    for (int i_449_ = 0;
				 ((i_449_ ^ 0xffffffff)
				  > (is.length ^ 0xffffffff));
				 i_449_++) {
				int i_450_ = is[i_449_];
				if (null == aShortArray4832
				    || -1 != (aShortArray4832[i_450_] & arg6
					      ^ 0xffffffff)) {
				    int i_451_ = anIntArray4840[i_450_];
				    int i_452_ = anIntArray4840[i_450_ - -1];
				    for (int i_453_ = i_451_; i_453_ < i_452_;
					 i_453_++) {
					int i_454_
					    = -1 + aShortArray4824[i_453_];
					if (0 == (i_454_ ^ 0xffffffff))
					    break;
					if (0 != arg4) {
					    int i_455_
						= Class31.anIntArray434[arg4];
					    int i_456_
						= Class31.anIntArray425[arg4];
					    int i_457_
						= ((32767
						    + (aShortArray4820[i_454_]
						       * i_456_)
						    + (aShortArray4821[i_454_]
						       * i_455_))
						   >> 1682943215);
					    aShortArray4821[i_454_]
						= (short) (((aShortArray4821
							     [i_454_]) * i_456_
							    + -((aShortArray4820
								 [i_454_])
								* i_455_)
							    + 32767)
							   >> -485219985);
					    aShortArray4820[i_454_]
						= (short) i_457_;
					}
					if (arg2 != 0) {
					    int i_458_
						= Class31.anIntArray434[arg2];
					    int i_459_
						= Class31.anIntArray425[arg2];
					    int i_460_
						= ((aShortArray4821[i_454_]
						    * i_459_)
						   + (-(aShortArray4825[i_454_]
							* i_458_)
						      + 32767)) >> 49340591;
					    aShortArray4825[i_454_]
						= (short) ((32767
							    + ((i_458_
								* (aShortArray4821
								   [i_454_]))
							       + ((aShortArray4825
								   [i_454_])
								  * i_459_)))
							   >> -1177101745);
					    aShortArray4821[i_454_]
						= (short) i_460_;
					}
					if (-1 != (arg3 ^ 0xffffffff)) {
					    int i_461_
						= Class31.anIntArray434[arg3];
					    int i_462_
						= Class31.anIntArray425[arg3];
					    int i_463_
						= (((i_462_
						     * aShortArray4820[i_454_])
						    + (aShortArray4825[i_454_]
						       * i_461_)
						    - -32767)
						   >> -1553957425);
					    aShortArray4825[i_454_]
						= (short) (((i_462_
							     * (aShortArray4825
								[i_454_]))
							    + -((aShortArray4820
								 [i_454_])
								* i_461_)
							    - -32767)
							   >> -461520241);
					    aShortArray4820[i_454_]
						= (short) i_463_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass7_4787 == null && null != aClass7_4807)
			aClass7_4807.anInterface2_101 = null;
		    if (aClass7_4787 != null)
			aClass7_4787.anInterface2_101 = null;
		}
	    }
	} else if ((arg0 ^ 0xffffffff) == -4) {
	    if (arg7 == null) {
		for (int i_464_ = 0; (i_464_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_464_++) {
		    int i_465_ = arg1[i_464_];
		    if ((anIntArrayArray4800.length ^ 0xffffffff)
			< (i_465_ ^ 0xffffffff)) {
			int[] is = anIntArrayArray4800[i_465_];
			for (int i_466_ = 0;
			     (i_466_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
			     i_466_++) {
			    int i_467_ = is[i_466_];
			    if (aShortArray4832 == null
				|| (aShortArray4832[i_467_] & arg6
				    ^ 0xffffffff) != -1) {
				anIntArray4837[i_467_] -= anInt4851;
				anIntArray4803[i_467_] -= anInt4853;
				anIntArray4831[i_467_] -= anInt4854;
				anIntArray4837[i_467_]
				    = (anIntArray4837[i_467_] * arg2
				       >> -282144825);
				anIntArray4803[i_467_]
				    = (arg3 * anIntArray4803[i_467_]
				       >> -1816668729);
				anIntArray4831[i_467_]
				    = (arg4 * anIntArray4831[i_467_]
				       >> -572843289);
				anIntArray4837[i_467_] += anInt4851;
				anIntArray4803[i_467_] += anInt4853;
				anIntArray4831[i_467_] += anInt4854;
			    }
			}
		    }
		}
	    } else {
		int i_468_ = arg7[9] << -2063159932;
		int i_469_ = arg7[10] << -715489020;
		int i_470_ = arg7[11] << 1001194436;
		int i_471_ = arg7[12] << 1008517892;
		int i_472_ = arg7[13] << -1935025948;
		int i_473_ = arg7[14] << 373296388;
		if (aBoolean4846) {
		    int i_474_ = ((arg7[6] * anInt4854 + anInt4853 * arg7[3]
				   + (arg7[0] * anInt4851 + 16384))
				  >> 1743727727);
		    int i_475_
			= ((16384 + arg7[4] * anInt4853
			    + (anInt4851 * arg7[1] - -(anInt4854 * arg7[7])))
			   >> 90310735);
		    int i_476_ = ((arg7[8] * anInt4854 + anInt4851 * arg7[2]
				   - -(arg7[5] * anInt4853) - -16384)
				  >> -656013009);
		    i_474_ += i_471_;
		    i_475_ += i_472_;
		    anInt4853 = i_475_;
		    i_476_ += i_473_;
		    anInt4851 = i_474_;
		    aBoolean4846 = false;
		    anInt4854 = i_476_;
		}
		int i_477_ = arg2 << 1250548335 >> -2029019993;
		int i_478_ = arg3 << 810047279 >> 1174466791;
		int i_479_ = arg4 << 634447599 >> -26457401;
		int i_480_ = 16384 + -anInt4851 * i_477_ >> -1993726417;
		int i_481_ = -anInt4853 * i_478_ - -16384 >> 310951119;
		int i_482_ = 16384 + -anInt4854 * i_479_ >> 496574447;
		int i_483_ = i_480_ - -anInt4851;
		int i_484_ = i_481_ - -anInt4853;
		int i_485_ = anInt4854 + i_482_;
		int[] is = new int[9];
		is[1] = arg7[3] * i_477_ + 16384 >> 327062863;
		is[2] = arg7[6] * i_477_ + 16384 >> 397991567;
		is[0] = i_477_ * arg7[0] + 16384 >> 1151989551;
		is[6] = 16384 + arg7[2] * i_479_ >> -2109851441;
		is[5] = 16384 + arg7[7] * i_478_ >> 1238522959;
		is[4] = arg7[4] * i_478_ - -16384 >> 1766844847;
		is[3] = 16384 + i_478_ * arg7[1] >> 110044975;
		is[7] = i_479_ * arg7[5] - -16384 >> -696272273;
		is[8] = i_479_ * arg7[8] - -16384 >> -850595345;
		int i_486_ = i_477_ * i_471_ + 16384 >> 2047587855;
		int i_487_ = 16384 + i_478_ * i_472_ >> 617638447;
		i_486_ += i_483_;
		int i_488_ = 16384 + i_479_ * i_473_ >> -506532337;
		i_487_ += i_484_;
		i_488_ += i_485_;
		int[] is_489_ = new int[9];
		for (int i_490_ = 0; 3 > i_490_; i_490_++) {
		    for (int i_491_ = 0; -4 < (i_491_ ^ 0xffffffff);
			 i_491_++) {
			int i_492_ = 0;
			for (int i_493_ = 0; i_493_ < 3; i_493_++)
			    i_492_ += (arg7[i_490_ * 3 - -i_493_]
				       * is[i_491_ + 3 * i_493_]);
			is_489_[i_491_ + 3 * i_490_]
			    = 16384 + i_492_ >> -224849393;
		    }
		}
		int i_494_ = (arg7[1] * i_487_ + (arg7[0] * i_486_
						  + (arg7[2] * i_488_ + 16384))
			      >> -904411249);
		int i_495_ = ((i_486_ * arg7[3] - -(arg7[4] * i_487_)
			       + (i_488_ * arg7[5] - -16384))
			      >> -565619025);
		i_494_ += i_468_;
		int i_496_ = (i_488_ * arg7[8] + (arg7[7] * i_487_
						  + arg7[6] * i_486_ - -16384)
			      >> 1780214991);
		i_495_ += i_469_;
		i_496_ += i_470_;
		for (int i_497_ = 0; (i_497_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_497_++) {
		    int i_498_ = arg1[i_497_];
		    if ((anIntArrayArray4800.length ^ 0xffffffff)
			< (i_498_ ^ 0xffffffff)) {
			int[] is_499_ = anIntArrayArray4800[i_498_];
			for (int i_500_ = 0;
			     ((is_499_.length ^ 0xffffffff)
			      < (i_500_ ^ 0xffffffff));
			     i_500_++) {
			    int i_501_ = is_499_[i_500_];
			    if (null == aShortArray4832
				|| -1 != (arg6 & aShortArray4832[i_501_]
					  ^ 0xffffffff)) {
				int i_502_
				    = ((anIntArray4803[i_501_] * is_489_[1]
					+ (anIntArray4837[i_501_] * is_489_[0]
					   - -(is_489_[2]
					       * anIntArray4831[i_501_]))
					- -16384)
				       >> 853842575);
				int i_503_
				    = ((anIntArray4831[i_501_] * is_489_[5]
					+ is_489_[4] * anIntArray4803[i_501_]
					+ (is_489_[3] * anIntArray4837[i_501_]
					   + 16384))
				       >> -70431921);
				i_502_ += i_494_;
				int i_504_
				    = ((16384
					+ (is_489_[8] * anIntArray4831[i_501_]
					   + ((anIntArray4803[i_501_]
					       * is_489_[7])
					      + (anIntArray4837[i_501_]
						 * is_489_[6]))))
				       >> -919340145);
				i_503_ += i_495_;
				anIntArray4837[i_501_] = i_502_;
				i_504_ += i_496_;
				anIntArray4803[i_501_] = i_503_;
				anIntArray4831[i_501_] = i_504_;
			    }
			}
		    }
		}
	    }
	} else if (5 == arg0) {
	    if (anIntArrayArray4808 != null) {
		for (int i_505_ = 0; (i ^ 0xffffffff) < (i_505_ ^ 0xffffffff);
		     i_505_++) {
		    int i_506_ = arg1[i_505_];
		    if (anIntArrayArray4808.length > i_506_) {
			int[] is = anIntArrayArray4808[i_506_];
			for (int i_507_ = 0; is.length > i_507_; i_507_++) {
			    int i_508_ = is[i_507_];
			    if (aShortArray4845 == null
				|| (aShortArray4845[i_508_] & arg6
				    ^ 0xffffffff) != -1) {
				int i_509_ = 8 * arg2 + (aByteArray4789[i_508_]
							 & 0xff);
				if (i_509_ >= 0) {
				    if (-256 > (i_509_ ^ 0xffffffff))
					i_509_ = 255;
				} else
				    i_509_ = 0;
				aByteArray4789[i_508_] = (byte) i_509_;
				if (aClass7_4807 != null)
				    aClass7_4807.anInterface2_101 = null;
			    }
			}
		    }
		}
	    }
	} else if ((arg0 ^ 0xffffffff) == -8) {
	    if (null != anIntArrayArray4808) {
		for (int i_510_ = 0; i_510_ < i; i_510_++) {
		    int i_511_ = arg1[i_510_];
		    if ((anIntArrayArray4808.length ^ 0xffffffff)
			< (i_511_ ^ 0xffffffff)) {
			int[] is = anIntArrayArray4808[i_511_];
			for (int i_512_ = 0; is.length > i_512_; i_512_++) {
			    int i_513_ = is[i_512_];
			    if (null == aShortArray4845
				|| -1 != (arg6 & aShortArray4845[i_513_]
					  ^ 0xffffffff)) {
				int i_514_ = aShortArray4826[i_513_] & 0xffff;
				int i_515_ = i_514_ >> -813834934 & 0x3f;
				int i_516_ = 0x7 & i_514_ >> -712573433;
				i_515_ = 0x3f & i_515_ - -arg2;
				i_516_ += arg3 / 4;
				int i_517_ = 0x7f & i_514_;
				if (0 <= i_516_) {
				    if ((i_516_ ^ 0xffffffff) < -8)
					i_516_ = 7;
				} else
				    i_516_ = 0;
				i_517_ += arg4;
				if (i_517_ >= 0) {
				    if (-128 > (i_517_ ^ 0xffffffff))
					i_517_ = 127;
				} else
				    i_517_ = 0;
				aShortArray4826[i_513_]
				    = (short) (Cryption.method2105
					       (i_517_,
						(Cryption.method2105
						 (i_516_ << -76708505,
						  i_515_ << -1749207542))));
				if (aClass7_4807 != null)
				    aClass7_4807.anInterface2_101 = null;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2262(int arg0, int arg1, int arg2) {
	for (int i = 0; anInt4792 > i; i++) {
	    if ((arg0 ^ 0xffffffff) != -129)
		anIntArray4837[i] = anIntArray4837[i] * arg0 >> 998374215;
	    if (128 != arg1)
		anIntArray4803[i] = arg1 * anIntArray4803[i] >> -91475705;
	    if (arg2 != 128)
		anIntArray4831[i] = anIntArray4831[i] * arg2 >> -1348404537;
	}
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
	aBoolean4790 = false;
    }
    
    public void method2272(int arg0, int arg1, int arg2) {
	for (int i = 0; (anInt4792 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    if (arg0 != 0)
		anIntArray4837[i] += arg0;
	    if (-1 != (arg1 ^ 0xffffffff))
		anIntArray4803[i] += arg1;
	    if (-1 != (arg2 ^ 0xffffffff))
		anIntArray4831[i] += arg2;
	}
	if (null != aClass7_4834)
	    aClass7_4834.anInterface2_101 = null;
	aBoolean4790 = false;
    }
    
    public void method2269(int arg0, int arg1, Class68 arg2, Class68 arg3,
			   int arg4, int arg5, int arg6) {
	if (!aBoolean4790)
	    method2298(-127);
	int i = aShort4816 + arg4;
	int i_518_ = aShort4842 + arg4;
	int i_519_ = arg6 + aShort4788;
	int i_520_ = aShort4809 + arg6;
	if ((-2 != (arg0 ^ 0xffffffff) && arg0 != 2
	     && (arg0 ^ 0xffffffff) != -4 && -6 != (arg0 ^ 0xffffffff))
	    || ((i ^ 0xffffffff) <= -1
		&& i_518_ + 128 >> -1961564601 < arg2.anInt924
		&& (i_519_ ^ 0xffffffff) <= -1
		&& ((128 + i_520_ >> -1386577945 ^ 0xffffffff)
		    > (arg2.anInt916 ^ 0xffffffff)))) {
	    if (-5 != (arg0 ^ 0xffffffff) && arg0 != 5) {
		i >>= -254799001;
		i_520_ = i_520_ - -127 >> 397426087;
		i_519_ >>= -1406580665;
		i_518_ = 127 + i_518_ >> 1487250599;
		if (arg5 == arg2.method712(i, i_519_)
		    && arg5 == arg2.method712(i_518_, i_519_)
		    && ((arg2.method712(i, i_520_) ^ 0xffffffff)
			== (arg5 ^ 0xffffffff))
		    && ((arg2.method712(i_518_, i_520_) ^ 0xffffffff)
			== (arg5 ^ 0xffffffff)))
		    return;
	    } else if (arg3 == null
		       || ((i ^ 0xffffffff) > -1
			   || ((i_518_ - -128 >> 1461995079 ^ 0xffffffff)
			       <= (arg3.anInt924 ^ 0xffffffff))
			   || (i_519_ ^ 0xffffffff) > -1
			   || ((128 + i_520_ >> 1605829575 ^ 0xffffffff)
			       <= (arg3.anInt916 ^ 0xffffffff))))
		return;
	    if ((arg0 ^ 0xffffffff) != -2) {
		if ((arg0 ^ 0xffffffff) != -3) {
		    if (-4 == (arg0 ^ 0xffffffff)) {
			int i_521_ = 4 * (0xff & arg1);
			int i_522_ = ((0xff84 & arg1) >> -1709707288) * 4;
			if ((arg4 + -(i_521_ >> -81539743) ^ 0xffffffff) > -1
			    || ((arg2.anInt924 ^ 0xffffffff)
				>= (128 + (i_521_ >> 1759802209) + arg4
				    ^ 0xffffffff))
			    || 0 > arg6 + -(i_522_ >> 1954109409)
			    || (128 + (arg6 + (i_522_ >> -371665887))
				>= arg2.anInt916))
			    return;
			method2255(-1, arg4, arg5, arg2, i_521_, arg6, i_522_);
		    } else if (-5 == (arg0 ^ 0xffffffff)) {
			int i_523_ = aShort4812 - aShort4827;
			for (int i_524_ = 0;
			     (i_524_ ^ 0xffffffff) > (anInt4792 ^ 0xffffffff);
			     i_524_++)
			    anIntArray4803[i_524_]
				= (i_523_
				   + (anIntArray4803[i_524_]
				      - -arg3.method720(arg4 + (anIntArray4837
								[i_524_]),
							(anIntArray4831[i_524_]
							 + arg6))
				      + -arg5));
		    } else if (5 == arg0) {
			int i_525_ = -aShort4827 + aShort4812;
			for (int i_526_ = 0; anInt4792 > i_526_; i_526_++) {
			    int i_527_ = arg4 + anIntArray4837[i_526_];
			    int i_528_ = anIntArray4831[i_526_] + arg6;
			    int i_529_ = arg2.method720(i_527_, i_528_);
			    int i_530_ = arg3.method720(i_527_, i_528_);
			    int i_531_ = i_529_ + -i_530_;
			    anIntArray4803[i_526_]
				= -arg5 + (i_529_
					   + ((anIntArray4803[i_526_]
					       << -610817496) / i_525_ * i_531_
					      >> -1975440280));
			}
		    }
		} else {
		    int i_532_ = aShort4827;
		    if (i_532_ == 0)
			return;
		    for (int i_533_ = 0; i_533_ < anInt4792; i_533_++) {
			int i_534_
			    = (anIntArray4803[i_533_] << -453985456) / i_532_;
			if (arg1 > i_534_)
			    anIntArray4803[i_533_]
				= (anIntArray4803[i_533_]
				   - -((-arg5
					+ arg2.method720((anIntArray4837
							  [i_533_]) - -arg4,
							 arg6 + (anIntArray4831
								 [i_533_])))
				       * (-i_534_ + arg1) / arg1));
		    }
		}
	    } else {
		for (int i_535_ = 0; i_535_ < anInt4792; i_535_++)
		    anIntArray4803[i_535_]
			= (anIntArray4803[i_535_]
			   - (-arg2.method720(arg4 + anIntArray4837[i_535_],
					      anIntArray4831[i_535_] - -arg6)
			      + arg5));
	    }
	    if (null != aClass7_4834)
		aClass7_4834.anInterface2_101 = null;
	    aBoolean4790 = false;
	}
    }
    
    public static int method2301(byte arg0, int arg1, int arg2) {
	int i;
	try {
	    arg2 = arg2 * (arg1 & 0x7f) >> -355284153;
	    if (-3 >= (arg2 ^ 0xffffffff)) {
		if (126 < arg2)
		    arg2 = 126;
	    } else
		arg2 = 2;
	    if (arg0 >= -119)
		return 2;
	    i = arg2 + (arg1 & 0xff80);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method2302(byte arg0) {
	if (aBoolean4794) {
	    aBoolean4794 = false;
	    if (aClass41Array4815 == null && null == aClass104Array4819) {
		if (anIntArray4837 != null
		    && !Class194.method2653(anInt4841, (byte) 78, anInt4822)) {
		    if (aClass7_4834 != null
			&& null == aClass7_4834.anInterface2_101)
			aBoolean4794 = true;
		    else {
			if (!aBoolean4790)
			    method2298(125);
			anIntArray4837 = null;
		    }
		}
		if (anIntArray4803 != null
		    && !Class194.method2644(anInt4822, true, anInt4841)) {
		    if (aClass7_4834 == null
			|| null != aClass7_4834.anInterface2_101) {
			if (!aBoolean4790)
			    method2298(-122);
			anIntArray4803 = null;
		    } else
			aBoolean4794 = true;
		}
		if (null != anIntArray4831
		    && !Class194.method2634(97, anInt4822, anInt4841)) {
		    if (aClass7_4834 == null
			|| aClass7_4834.anInterface2_101 != null) {
			if (!aBoolean4790)
			    method2298(-122);
			anIntArray4831 = null;
		    } else
			aBoolean4794 = true;
		}
	    }
	    if (arg0 > -111)
		aShortArray4820 = null;
	    if (null != aShortArray4824 && anIntArray4837 == null
		&& anIntArray4803 == null && null == anIntArray4831) {
		anIntArray4840 = null;
		aShortArray4824 = null;
	    }
	    if (null != aByteArray4828
		&& !Class194.method2646(anInt4822, 32768, anInt4841)) {
		if (null == aClass7_4787) {
		    if (null != aClass7_4807
			&& null == aClass7_4807.anInterface2_101)
			aBoolean4794 = true;
		    else {
			aShortArray4820 = aShortArray4821 = aShortArray4825
			    = null;
			aByteArray4828 = null;
		    }
		} else if (aClass7_4787.anInterface2_101 != null) {
		    aShortArray4820 = aShortArray4821 = aShortArray4825 = null;
		    aByteArray4828 = null;
		} else
		    aBoolean4794 = true;
	    }
	    if (null != aShortArray4826
		&& !Class194.method2636(anInt4841, 0, anInt4822)) {
		if (null != aClass7_4807
		    && null == aClass7_4807.anInterface2_101)
		    aBoolean4794 = true;
		else
		    aShortArray4826 = null;
	    }
	    if (aByteArray4789 != null
		&& !Class194.method2654(anInt4841, (byte) 80, anInt4822)) {
		if (aClass7_4807 == null
		    || aClass7_4807.anInterface2_101 != null)
		    aByteArray4789 = null;
		else
		    aBoolean4794 = true;
	    }
	    if (aFloatArray4814 != null
		&& !Class194.method2640(anInt4822, 0, anInt4841)) {
		if (null == aClass7_4813
		    || aClass7_4813.anInterface2_101 != null)
		    aFloatArray4814 = aFloatArray4817 = null;
		else
		    aBoolean4794 = true;
	    }
	    if (aShortArray4830 != null
		&& !Class194.method2647((byte) 126, anInt4822, anInt4841)) {
		if (null == aClass7_4807
		    || aClass7_4807.anInterface2_101 != null)
		    aShortArray4830 = null;
		else
		    aBoolean4794 = true;
	    }
	    if (null != aShortArray4835
		&& !Class194.method2658(anInt4841, anInt4822, 16)) {
		if ((null != aClass95_4791
		     && null == aClass95_4791.anInterface7_1271)
		    || (aClass7_4807 != null
			&& null == aClass7_4807.anInterface2_101))
		    aBoolean4794 = true;
		else
		    aShortArray4835 = aShortArray4811 = aShortArray4843 = null;
	    }
	    if (anIntArrayArray4808 != null
		&& !Class194.method2645(anInt4841, anInt4822, 1024)) {
		anIntArrayArray4808 = null;
		aShortArray4845 = null;
	    }
	    if (anIntArrayArray4800 != null
		&& !Class194.method2660(anInt4822, anInt4841, 0)) {
		aShortArray4832 = null;
		anIntArrayArray4800 = null;
	    }
	    if (null != anIntArray4829
		&& -1 == (anInt4822 & 0x400 ^ 0xffffffff)
		&& (anInt4822 & 0x20000 ^ 0xffffffff) == -1)
		anIntArray4829 = null;
	}
    }
    
    public int method2258() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(93);
	    i = aShort4812;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public static byte[] method2303(int arg0, byte arg1, byte[] arg2) {
	byte[] is;
	try {
	    if (arg1 > -23)
		return null;
	    byte[] is_536_ = new byte[arg0];
	    Class61.method652(arg2, 0, is_536_, 0, arg0);
	    is = is_536_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return is;
    }
    
    public boolean method2304(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7, boolean arg8) {
	boolean bool;
	try {
	    if ((arg4 ^ 0xffffffff) > (arg7 ^ 0xffffffff) && arg1 > arg4
		&& arg4 < arg6)
		return false;
	    if ((arg4 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
		&& (arg1 ^ 0xffffffff) > (arg4 ^ 0xffffffff)
		&& (arg4 ^ 0xffffffff) < (arg6 ^ 0xffffffff))
		return false;
	    if ((arg2 ^ 0xffffffff) < (arg3 ^ 0xffffffff) && arg3 < arg0
		&& arg3 < arg5)
		return false;
	    if (arg8 != true)
		method2264(44);
	    if (arg3 > arg2 && arg3 > arg0 && arg3 > arg5)
		return false;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public static float[] method2305(int arg0, int arg1, float[] arg2) {
	float[] fs;
	try {
	    float[] fs_537_ = new float[arg1];
	    Class61.method653(arg2, 0, fs_537_, arg0, arg1);
	    fs = fs_537_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return fs;
    }
    
    public Class154 method2287(byte arg0, int arg1, boolean arg2) {
	Class154 class154;
	try {
	    Class154_Sub1 class154_sub1;
	    Class154_Sub1 class154_sub1_538_;
	    if (-2 == (arg0 ^ 0xffffffff)) {
		class154_sub1 = aClass130_Sub2_4806.aClass154_Sub1_3374;
		class154_sub1_538_ = aClass130_Sub2_4806.aClass154_Sub1_3392;
	    } else if (arg0 != 2) {
		if ((arg0 ^ 0xffffffff) == -4) {
		    class154_sub1 = aClass130_Sub2_4806.aClass154_Sub1_3346;
		    class154_sub1_538_
			= aClass130_Sub2_4806.aClass154_Sub1_3378;
		} else
		    class154_sub1_538_ = class154_sub1
			= new Class154_Sub1(aClass130_Sub2_4806);
	    } else {
		class154_sub1_538_ = aClass130_Sub2_4806.aClass154_Sub1_3402;
		class154_sub1 = aClass130_Sub2_4806.aClass154_Sub1_3391;
	    }
	    class154 = method2299(arg2, arg1, class154_sub1_538_, arg0 != 0,
				  class154_sub1, true);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class154;
    }
    
    public void method2264(int arg0) {
	int i = Class31.anIntArray434[arg0];
	int i_539_ = Class31.anIntArray425[arg0];
	for (int i_540_ = 0; (i_540_ ^ 0xffffffff) > (anInt4792 ^ 0xffffffff);
	     i_540_++) {
	    int i_541_
		= (anIntArray4831[i_540_] * i + i_539_ * anIntArray4837[i_540_]
		   >> 1647786831);
	    anIntArray4831[i_540_]
		= i_539_ * anIntArray4831[i_540_] + -(anIntArray4837[i_540_]
						      * i) >> 1258258191;
	    anIntArray4837[i_540_] = i_541_;
	}
	if (null != aClass7_4834)
	    aClass7_4834.anInterface2_101 = null;
	aBoolean4790 = false;
    }
    
    public static void method2306(int arg0, int arg1, int arg2, float arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, float arg9, float arg10, int arg11,
				  float[] arg12) {
	arg2 -= arg7;
	if (arg11 != 28605)
	    method2301((byte) 81, -88, -111);
	arg1 -= arg6;
	arg4 -= arg8;
	float f = ((float) arg4 * arg12[2]
		   + (arg12[0] * (float) arg2 + arg12[1] * (float) arg1));
	float f_542_ = (arg12[4] * (float) arg1 + (float) arg2 * arg12[3]
			+ (float) arg4 * arg12[5]);
	float f_543_ = (arg12[8] * (float) arg4
			+ ((float) arg1 * arg12[7] + (float) arg2 * arg12[6]));
	float f_544_;
	float f_545_;
	if (arg5 != 0) {
	    if (1 == arg5) {
		f_545_ = arg9 + f_543_ + 0.5F;
		f_544_ = 0.5F + (f + arg10);
	    } else if (arg5 != 2) {
		if (3 != arg5) {
		    if (4 != arg5) {
			f_544_ = -f_543_ + arg9 + 0.5F;
			f_545_ = 0.5F + (arg3 + -f_542_);
		    } else {
			f_545_ = 0.5F + (arg3 + -f_542_);
			f_544_ = 0.5F + (f_543_ + arg9);
		    }
		} else {
		    f_545_ = arg3 + -f_542_ + 0.5F;
		    f_544_ = arg10 + f + 0.5F;
		}
	    } else {
		f_544_ = -f + arg10 + 0.5F;
		f_545_ = 0.5F + (arg3 + -f_542_);
	    }
	} else {
	    f_544_ = 0.5F + (f + arg10);
	    f_545_ = -f_543_ + arg9 + 0.5F;
	}
	if (-2 != (arg0 ^ 0xffffffff)) {
	    if (arg0 == 2) {
		f_544_ = -f_544_;
		f_545_ = -f_545_;
	    } else if (arg0 == 3) {
		float f_546_ = f_544_;
		f_544_ = f_545_;
		f_545_ = -f_546_;
	    }
	} else {
	    float f_547_ = f_544_;
	    f_544_ = -f_545_;
	    f_545_ = f_547_;
	}
	aFloat4801 = f_544_;
	aFloat4836 = f_545_;
    }
    
    public static short[] method2307(int arg0, short[] arg1, byte arg2) {
	short[] is;
	try {
	    if (arg2 != 81)
		return null;
	    short[] is_548_ = new short[arg0];
	    Class61.method655(arg1, 0, is_548_, 0, arg0);
	    is = is_548_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return is;
    }
    
    public Class41[] method2254() {
	Class41[] class41s;
	try {
	    class41s = aClass41Array4815;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class41s;
    }
    
    public void method2289(int arg0) {
	int i = Class31.anIntArray434[arg0];
	int i_549_ = Class31.anIntArray425[arg0];
	for (int i_550_ = 0; anInt4792 > i_550_; i_550_++) {
	    int i_551_
		= (i * anIntArray4831[i_550_] + anIntArray4837[i_550_] * i_549_
		   >> 473304495);
	    anIntArray4831[i_550_]
		= (-(anIntArray4837[i_550_] * i)
		   + anIntArray4831[i_550_] * i_549_) >> 1754621583;
	    anIntArray4837[i_550_] = i_551_;
	}
	for (int i_552_ = 0; (anInt4793 ^ 0xffffffff) < (i_552_ ^ 0xffffffff);
	     i_552_++) {
	    int i_553_ = ((aShortArray4825[i_552_] * i
			   + i_549_ * aShortArray4820[i_552_])
			  >> 272776431);
	    aShortArray4825[i_552_]
		= (short) ((aShortArray4825[i_552_] * i_549_
			    + -(aShortArray4820[i_552_] * i))
			   >> 2088185743);
	    aShortArray4820[i_552_] = (short) i_553_;
	}
	if (aClass7_4787 == null && aClass7_4807 != null)
	    aClass7_4807.anInterface2_101 = null;
	if (aClass7_4787 != null)
	    aClass7_4787.anInterface2_101 = null;
	aBoolean4790 = false;
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
    }
    
    public void method2273(int arg0) {
	aShort4797 = (short) arg0;
	if (null != aClass7_4807)
	    aClass7_4807.anInterface2_101 = null;
    }
    
    public int method2256() {
	short i;
	try {
	    if (!aBoolean4790)
		method2298(89);
	    i = aShort4827;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method2308(Class9_Sub1 arg0, boolean arg1) {
	if (null != aClass41Array4815) {
	    for (int i = 0; aClass41Array4815.length > i; i++) {
		Class41 class41 = aClass41Array4815[i];
		Class41 class41_554_ = class41;
		if (null != class41.aClass41_546)
		    class41_554_ = class41.aClass41_546;
		class41_554_.anInt536
		    = (int) (arg0.aFloat3614
			     + ((arg0.aFloat3602
				 * (float) anIntArray4831[class41.anInt539])
				+ (((float) anIntArray4803[class41.anInt539]
				    * arg0.aFloat3607)
				   + (arg0.aFloat3609
				      * (float) (anIntArray4837
						 [class41.anInt539])))));
		class41_554_.anInt541
		    = (int) (((float) anIntArray4837[class41.anInt539]
			      * arg0.aFloat3603)
			     + ((float) anIntArray4803[class41.anInt539]
				* arg0.aFloat3604)
			     + ((float) anIntArray4831[class41.anInt539]
				* arg0.aFloat3610)
			     + arg0.aFloat3605);
		class41_554_.anInt549
		    = (int) (arg0.aFloat3612
			     + ((arg0.aFloat3606
				 * (float) anIntArray4831[class41.anInt539])
				+ ((arg0.aFloat3611
				    * (float) anIntArray4803[class41.anInt539])
				   + (arg0.aFloat3608
				      * (float) (anIntArray4837
						 [class41.anInt539])))));
		class41_554_.anInt543
		    = (int) (arg0.aFloat3614
			     + ((arg0.aFloat3609
				 * (float) anIntArray4837[class41.anInt552])
				+ (arg0.aFloat3607
				   * (float) anIntArray4803[class41.anInt552])
				+ (arg0.aFloat3602
				   * (float) (anIntArray4831
					      [class41.anInt552]))));
		class41_554_.anInt538
		    = (int) (((float) anIntArray4831[class41.anInt552]
			      * arg0.aFloat3610)
			     + ((arg0.aFloat3604
				 * (float) anIntArray4803[class41.anInt552])
				+ ((float) anIntArray4837[class41.anInt552]
				   * arg0.aFloat3603))
			     + arg0.aFloat3605);
		class41_554_.anInt547
		    = (int) (((float) anIntArray4831[class41.anInt552]
			      * arg0.aFloat3606)
			     + ((arg0.aFloat3608
				 * (float) anIntArray4837[class41.anInt552])
				+ ((float) anIntArray4803[class41.anInt552]
				   * arg0.aFloat3611))
			     + arg0.aFloat3612);
		class41_554_.anInt535
		    = (int) ((arg0.aFloat3602
			      * (float) anIntArray4831[class41.anInt540])
			     + (((float) anIntArray4803[class41.anInt540]
				 * arg0.aFloat3607)
				+ (arg0.aFloat3609
				   * (float) anIntArray4837[class41.anInt540]))
			     + arg0.aFloat3614);
		class41_554_.anInt555
		    = (int) ((arg0.aFloat3610
			      * (float) anIntArray4831[class41.anInt540])
			     + (((float) anIntArray4837[class41.anInt540]
				 * arg0.aFloat3603)
				+ ((float) anIntArray4803[class41.anInt540]
				   * arg0.aFloat3604))
			     + arg0.aFloat3605);
		class41_554_.anInt554
		    = (int) (arg0.aFloat3612
			     + (((float) anIntArray4831[class41.anInt540]
				 * arg0.aFloat3606)
				+ ((arg0.aFloat3611
				    * (float) anIntArray4803[class41.anInt540])
				   + ((float) anIntArray4837[class41.anInt540]
				      * arg0.aFloat3608))));
	    }
	}
	if (arg1)
	    method2289(-33);
	if (null != aClass104Array4819) {
	    for (int i = 0; i < aClass104Array4819.length; i++) {
		Class104 class104 = aClass104Array4819[i];
		Class104 class104_555_ = class104;
		if (class104.aClass104_1360 != null)
		    class104_555_ = class104.aClass104_1360;
		if (null == class104.aClass9_1356)
		    class104.aClass9_1356 = arg0.method194();
		else
		    class104.aClass9_1356.method180(arg0);
		class104_555_.anInt1366
		    = (int) (arg0.aFloat3614
			     + ((arg0.aFloat3607
				 * (float) anIntArray4803[class104.anInt1362])
				+ ((float) anIntArray4837[class104.anInt1362]
				   * arg0.aFloat3609)
				+ (arg0.aFloat3602
				   * (float) (anIntArray4831
					      [class104.anInt1362]))));
		class104_555_.anInt1363
		    = (int) (arg0.aFloat3605
			     + ((arg0.aFloat3604
				 * (float) anIntArray4803[class104.anInt1362])
				+ ((float) anIntArray4837[class104.anInt1362]
				   * arg0.aFloat3603)
				+ (arg0.aFloat3610
				   * (float) (anIntArray4831
					      [class104.anInt1362]))));
		class104_555_.anInt1361
		    = (int) (((float) anIntArray4831[class104.anInt1362]
			      * arg0.aFloat3606)
			     + ((arg0.aFloat3608
				 * (float) anIntArray4837[class104.anInt1362])
				+ (arg0.aFloat3611
				   * (float) (anIntArray4803
					      [class104.anInt1362])))
			     + arg0.aFloat3612);
	    }
	}
    }
    
    public void method2280() {
	for (int i = 0; i < anInt4792; i++)
	    anIntArray4831[i] = -anIntArray4831[i];
	for (int i = 0; (i ^ 0xffffffff) > (anInt4793 ^ 0xffffffff); i++)
	    aShortArray4825[i] = (short) -aShortArray4825[i];
	for (int i = 0; (i ^ 0xffffffff) > (anInt4799 ^ 0xffffffff); i++) {
	    short i_556_ = aShortArray4835[i];
	    aShortArray4835[i] = aShortArray4843[i];
	    aShortArray4843[i] = i_556_;
	}
	if (null == aClass7_4787 && null != aClass7_4807)
	    aClass7_4807.anInterface2_101 = null;
	if (null != aClass7_4787)
	    aClass7_4787.anInterface2_101 = null;
	if (aClass7_4834 != null)
	    aClass7_4834.anInterface2_101 = null;
	if (aClass95_4791 != null)
	    aClass95_4791.anInterface7_1271 = null;
	aBoolean4790 = false;
    }
    
    public static float[] method2309(float arg0, int arg1, int arg2,
				     float arg3, int arg4, int arg5, int arg6,
				     float arg7) {
	float[] fs;
	try {
	    float[] fs_557_ = new float[9];
	    float[] fs_558_ = new float[9];
	    int i = 94 / ((arg5 - -37) / 47);
	    float f = (float) Math.cos((double) (0.024543693F * (float) arg6));
	    float f_559_
		= (float) Math.sin((double) (0.024543693F * (float) arg6));
	    fs_557_[0] = f;
	    fs_557_[1] = 0.0F;
	    float f_560_ = -f + 1.0F;
	    fs_557_[5] = 0.0F;
	    fs_557_[2] = f_559_;
	    fs_557_[8] = f;
	    fs_557_[4] = 1.0F;
	    fs_557_[3] = 0.0F;
	    fs_557_[6] = -f_559_;
	    fs_557_[7] = 0.0F;
	    float[] fs_561_ = new float[9];
	    float f_562_ = 1.0F;
	    float f_563_ = 0.0F;
	    f = (float) arg2 / 32767.0F;
	    f_560_ = -f + 1.0F;
	    f_559_ = -(float) Math.sqrt((double) (-(f * f) + 1.0F));
	    float f_564_
		= (float) Math.sqrt((double) (arg1 * arg1 + arg4 * arg4));
	    if (f_564_ == 0.0F && f == 0.0F)
		fs_558_ = fs_557_;
	    else {
		if (f_564_ != 0.0F) {
		    f_563_ = (float) arg4 / f_564_;
		    f_562_ = (float) -arg1 / f_564_;
		}
		fs_561_[6] = f_560_ * (f_563_ * f_562_);
		fs_561_[8] = f + f_560_ * (f_563_ * f_563_);
		fs_561_[1] = f_563_ * f_559_;
		fs_561_[5] = f_562_ * f_559_;
		fs_561_[3] = -f_563_ * f_559_;
		fs_561_[2] = f_563_ * f_562_ * f_560_;
		fs_561_[7] = f_559_ * -f_562_;
		fs_561_[0] = f_560_ * (f_562_ * f_562_) + f;
		fs_561_[4] = f;
		fs_558_[0]
		    = fs_557_[2] * fs_561_[6] + (fs_557_[0] * fs_561_[0]
						 + fs_557_[1] * fs_561_[3]);
		fs_558_[1] = (fs_557_[0] * fs_561_[1] + fs_557_[1] * fs_561_[4]
			      + fs_557_[2] * fs_561_[7]);
		fs_558_[3]
		    = fs_561_[6] * fs_557_[5] + (fs_557_[3] * fs_561_[0]
						 + fs_557_[4] * fs_561_[3]);
		fs_558_[2] = (fs_561_[5] * fs_557_[1] + fs_557_[0] * fs_561_[2]
			      + fs_561_[8] * fs_557_[2]);
		fs_558_[4] = (fs_557_[3] * fs_561_[1] + fs_557_[4] * fs_561_[4]
			      + fs_561_[7] * fs_557_[5]);
		fs_558_[6] = (fs_561_[0] * fs_557_[6] + fs_561_[3] * fs_557_[7]
			      + fs_561_[6] * fs_557_[8]);
		fs_558_[5] = (fs_557_[3] * fs_561_[2] + fs_561_[5] * fs_557_[4]
			      + fs_561_[8] * fs_557_[5]);
		fs_558_[7] = (fs_561_[4] * fs_557_[7] + fs_561_[1] * fs_557_[6]
			      + fs_561_[7] * fs_557_[8]);
		fs_558_[8]
		    = fs_557_[8] * fs_561_[8] + (fs_557_[7] * fs_561_[5]
						 + fs_561_[2] * fs_557_[6]);
	    }
	    fs_558_[1] *= arg0;
	    fs_558_[4] *= arg7;
	    fs_558_[3] *= arg7;
	    fs_558_[0] *= arg0;
	    fs_558_[8] *= arg3;
	    fs_558_[2] *= arg0;
	    fs_558_[5] *= arg7;
	    fs_558_[7] *= arg3;
	    fs_558_[6] *= arg3;
	    fs = fs_558_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return fs;
    }
    
    public Class154_Sub1(Class130_Sub2 arg0) {
	aBoolean4790 = false;
	aBoolean4794 = true;
	anInt4792 = 0;
	anInt4838 = 0;
	anInt4793 = 0;
	aClass130_Sub2_4806 = arg0;
	aClass7_4834 = new Class7(aClass130_Sub2_4806, null, 5126, 3, 0);
	aClass7_4813 = new Class7(aClass130_Sub2_4806, null, 5126, 2, 0);
	aClass7_4787 = new Class7(aClass130_Sub2_4806, null, 5126, 3, 0);
	aClass7_4807 = new Class7(aClass130_Sub2_4806, null, 5121, 4, 0);
	aClass95_4791 = new Class95();
    }
    
    public Class154_Sub1(Class130_Sub2 arg0, Class116 arg1, int arg2, int arg3,
			 int arg4, int arg5) {
	aBoolean4790 = false;
	aBoolean4794 = true;
	anInt4792 = 0;
	anInt4838 = 0;
	anInt4793 = 0;
	anInt4822 = arg2;
	aClass130_Sub2_4806 = arg0;
	anInt4841 = arg5;
	if (Class194.method2641(arg2, arg5, -1))
	    aClass7_4834 = new Class7(aClass130_Sub2_4806, null, 5126, 3, 0);
	if (Class194.method2637(arg5, arg2, 33))
	    aClass7_4813 = new Class7(aClass130_Sub2_4806, null, 5126, 2, 0);
	if (Class194.method2651(arg5, arg2, -120))
	    aClass7_4787 = new Class7(aClass130_Sub2_4806, null, 5126, 3, 0);
	if (Class194.method2648(arg5, -1, arg2))
	    aClass7_4807 = new Class7(aClass130_Sub2_4806, null, 5121, 4, 0);
	if (Class194.method2633(arg5, -14331, arg2))
	    aClass95_4791 = new Class95();
	Interface4 interface4 = arg0.anInterface4_3303;
	int[] is = new int[arg1.anInt1536];
	anIntArray4840 = new int[1 + arg1.anInt1489];
	for (int i = 0; arg1.anInt1536 > i; i++) {
	    if ((arg1.aByteArray1493 == null
		 || -3 != (arg1.aByteArray1493[i] ^ 0xffffffff))
		&& (arg1.aShortArray1520 == null
		    || -1 == arg1.aShortArray1520[i]
		    || !(interface4.method10
			 (-19907, 0xffff & arg1.aShortArray1520[i])
			 .aBoolean569))) {
		is[anInt4799++] = i;
		anIntArray4840[arg1.aShortArray1514[i]]++;
		anIntArray4840[arg1.aShortArray1513[i]]++;
		anIntArray4840[arg1.aShortArray1541[i]]++;
	    }
	}
	long[] ls = new long[anInt4799];
	boolean bool = (0x100 & anInt4822) != 0;
	for (int i = 0; (anInt4799 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    int i_565_ = is[i];
	    Class42 class42 = null;
	    int i_566_ = 0;
	    int i_567_ = 0;
	    int i_568_ = 0;
	    int i_569_ = 0;
	    int i_570_ = -1;
	    if (arg1.aShortArray1520 != null) {
		i_570_ = arg1.aShortArray1520[i_565_];
		if (0 != (i_570_ ^ 0xffffffff)) {
		    class42 = interface4.method10(-19907, i_570_ & 0xffff);
		    i_568_ = class42.aByte576;
		    i_569_ = class42.aByte562;
		}
	    }
	    boolean bool_571_ = ((arg1.aByteArray1505 != null
				  && arg1.aByteArray1505[i_565_] != 0)
				 || null != class42 && !class42.aBoolean557);
	    if ((bool || bool_571_) && null != arg1.aByteArray1522)
		i_566_ += arg1.aByteArray1522[i_565_] << -768089423;
	    if (bool_571_)
		i_566_ += 65536;
	    i_566_ += (0xff & i_568_) << 1109562632;
	    i_567_ += i_570_ << 290215312 & ~0xffff;
	    i_566_ += i_569_ & 0xff;
	    i_567_ += 0xffff & i;
	    ls[i] = ((long) i_566_ << 1365439456) - -(long) i_567_;
	}
	RuntimeException_Sub1.method2838(is, ls, -76);
	anIntArray4837 = arg1.anIntArray1533;
	anIntArray4831 = arg1.anIntArray1534;
	anInt4838 = arg1.anInt1528;
	aShortArray4832 = arg1.aShortArray1502;
	anIntArray4803 = arg1.anIntArray1511;
	anInt4792 = arg1.anInt1489;
	aClass41Array4815 = arg1.aClass41Array1535;
	Class73[] class73s = new Class73[anInt4792];
	aClass104Array4819 = arg1.aClass104Array1499;
	int i = 3 * anInt4799;
	aFloatArray4814 = new float[i];
	aShortArray4843 = new short[anInt4799];
	aShort4839 = (short) arg4;
	if (null != arg1.aShortArray1525)
	    aShortArray4845 = new short[anInt4799];
	aShortArray4811 = new short[anInt4799];
	aShort4797 = (short) arg3;
	aShortArray4835 = new short[anInt4799];
	aFloatArray4817 = new float[i];
	aByteArray4789 = new byte[anInt4799];
	aShortArray4824 = new short[i];
	aShortArray4830 = new short[anInt4799];
	aShortArray4820 = new short[i];
	aShortArray4821 = new short[i];
	aShortArray4826 = new short[anInt4799];
	aLongArray4804 = new long[i];
	aByteArray4828 = new byte[i];
	aShortArray4825 = new short[i];
	int i_572_ = 0;
	for (int i_573_ = 0;
	     (arg1.anInt1489 ^ 0xffffffff) < (i_573_ ^ 0xffffffff); i_573_++) {
	    int i_574_ = anIntArray4840[i_573_];
	    anIntArray4840[i_573_] = i_572_;
	    class73s[i_573_] = new Class73();
	    i_572_ += i_574_;
	}
	anIntArray4840[arg1.anInt1489] = i_572_;
	int[] is_575_ = null;
	int[] is_576_ = null;
	int[] is_577_ = null;
	float[][] fs = null;
	if (arg1.aByteArray1540 != null) {
	    int i_578_ = arg1.anInt1495;
	    int[] is_579_ = new int[i_578_];
	    int[] is_580_ = new int[i_578_];
	    int[] is_581_ = new int[i_578_];
	    int[] is_582_ = new int[i_578_];
	    int[] is_583_ = new int[i_578_];
	    int[] is_584_ = new int[i_578_];
	    for (int i_585_ = 0; i_578_ > i_585_; i_585_++) {
		is_579_[i_585_] = 2147483647;
		is_580_[i_585_] = -2147483647;
		is_581_[i_585_] = 2147483647;
		is_582_[i_585_] = -2147483647;
		is_583_[i_585_] = 2147483647;
		is_584_[i_585_] = -2147483647;
	    }
	    is_576_ = new int[i_578_];
	    fs = new float[i_578_][];
	    for (int i_586_ = 0; anInt4799 > i_586_; i_586_++) {
		int i_587_ = is[i_586_];
		if (arg1.aByteArray1540[i_587_] != -1) {
		    int i_588_ = arg1.aByteArray1540[i_587_] & 0xff;
		    for (int i_589_ = 0; 3 > i_589_; i_589_++) {
			short i_590_;
			if (i_589_ != 0) {
			    if (i_589_ == 1)
				i_590_ = arg1.aShortArray1513[i_587_];
			    else
				i_590_ = arg1.aShortArray1541[i_587_];
			} else
			    i_590_ = arg1.aShortArray1514[i_587_];
			int i_591_ = arg1.anIntArray1533[i_590_];
			int i_592_ = arg1.anIntArray1511[i_590_];
			int i_593_ = arg1.anIntArray1534[i_590_];
			if (is_579_[i_588_] > i_591_)
			    is_579_[i_588_] = i_591_;
			if ((i_591_ ^ 0xffffffff)
			    < (is_580_[i_588_] ^ 0xffffffff))
			    is_580_[i_588_] = i_591_;
			if (is_581_[i_588_] > i_592_)
			    is_581_[i_588_] = i_592_;
			if ((is_582_[i_588_] ^ 0xffffffff)
			    > (i_592_ ^ 0xffffffff))
			    is_582_[i_588_] = i_592_;
			if ((is_583_[i_588_] ^ 0xffffffff)
			    < (i_593_ ^ 0xffffffff))
			    is_583_[i_588_] = i_593_;
			if ((is_584_[i_588_] ^ 0xffffffff)
			    > (i_593_ ^ 0xffffffff))
			    is_584_[i_588_] = i_593_;
		    }
		}
	    }
	    is_577_ = new int[i_578_];
	    is_575_ = new int[i_578_];
	    for (int i_594_ = 0; i_578_ > i_594_; i_594_++) {
		byte i_595_ = arg1.aByteArray1521[i_594_];
		if ((i_595_ ^ 0xffffffff) < -1) {
		    is_575_[i_594_] = (is_580_[i_594_] + is_579_[i_594_]) / 2;
		    is_576_[i_594_] = (is_582_[i_594_] + is_581_[i_594_]) / 2;
		    is_577_[i_594_] = (is_584_[i_594_] + is_583_[i_594_]) / 2;
		    float f;
		    float f_596_;
		    float f_597_;
		    if (i_595_ != 1) {
			if (i_595_ == 2) {
			    f = 64.0F / (float) (0xffff & (arg1.aShortArray1496
							   [i_594_]));
			    f_597_ = 64.0F / (float) (0xffff
						      & (arg1.aShortArray1530
							 [i_594_]));
			    f_596_ = 64.0F / (float) (0xffff
						      & (arg1.aShortArray1504
							 [i_594_]));
			} else {
			    f_597_ = ((float) arg1.aShortArray1530[i_594_]
				      / 1024.0F);
			    f = (float) arg1.aShortArray1496[i_594_] / 1024.0F;
			    f_596_ = ((float) arg1.aShortArray1504[i_594_]
				      / 1024.0F);
			}
		    } else {
			int i_598_ = arg1.aShortArray1496[i_594_];
			if (-1 != (i_598_ ^ 0xffffffff)) {
			    if (0 >= i_598_) {
				f = (float) -i_598_ / 1024.0F;
				f_596_ = 1.0F;
			    } else {
				f_596_ = (float) i_598_ / 1024.0F;
				f = 1.0F;
			    }
			} else {
			    f_596_ = 1.0F;
			    f = 1.0F;
			}
			f_597_
			    = 64.0F / (float) (0xffff
					       & arg1.aShortArray1530[i_594_]);
		    }
		    fs[i_594_]
			= method2309(f, arg1.aShortArray1512[i_594_],
				     arg1.aShortArray1537[i_594_], f_596_,
				     arg1.aShortArray1501[i_594_], -107,
				     Class90.method841((arg1.aByteArray1523
							[i_594_]),
						       255),
				     f_597_);
		}
	    }
	}
	Class48[] class48s = new Class48[arg1.anInt1536];
	for (int i_599_ = 0; arg1.anInt1536 > i_599_; i_599_++) {
	    short i_600_ = arg1.aShortArray1514[i_599_];
	    short i_601_ = arg1.aShortArray1513[i_599_];
	    short i_602_ = arg1.aShortArray1541[i_599_];
	    int i_603_ = -anIntArray4837[i_600_] + anIntArray4837[i_601_];
	    int i_604_ = anIntArray4803[i_601_] - anIntArray4803[i_600_];
	    int i_605_ = anIntArray4831[i_601_] + -anIntArray4831[i_600_];
	    int i_606_ = -anIntArray4837[i_600_] + anIntArray4837[i_602_];
	    int i_607_ = anIntArray4803[i_602_] - anIntArray4803[i_600_];
	    int i_608_ = anIntArray4831[i_602_] - anIntArray4831[i_600_];
	    int i_609_ = i_604_ * i_608_ - i_607_ * i_605_;
	    int i_610_ = -(i_608_ * i_603_) + i_606_ * i_605_;
	    int i_611_;
	    for (i_611_ = -(i_606_ * i_604_) + i_607_ * i_603_;
		 (-8193 > (i_609_ ^ 0xffffffff) || i_610_ > 8192
		  || i_611_ > 8192 || (i_609_ ^ 0xffffffff) > 8191
		  || i_610_ < -8192 || i_611_ < -8192);
		 i_609_ >>= 1) {
		i_611_ >>= 1;
		i_610_ >>= 1;
	    }
	    int i_612_ = (int) Math.sqrt((double) (i_611_ * i_611_
						   + (i_609_ * i_609_
						      + i_610_ * i_610_)));
	    if (-1 <= (i_612_ ^ 0xffffffff))
		i_612_ = 1;
	    i_609_ = 256 * i_609_ / i_612_;
	    i_610_ = 256 * i_610_ / i_612_;
	    i_611_ = i_611_ * 256 / i_612_;
	    byte i_613_ = (null == arg1.aByteArray1493 ? (byte) 0
			   : arg1.aByteArray1493[i_599_]);
	    if (-1 != (i_613_ ^ 0xffffffff)) {
		if (1 == i_613_) {
		    Class48 class48 = class48s[i_599_] = new Class48();
		    class48.anInt648 = i_610_;
		    class48.anInt650 = i_611_;
		    class48.anInt649 = i_609_;
		}
	    } else {
		Class73 class73 = class73s[i_600_];
		class73.anInt995 += i_611_;
		class73.anInt997 += i_610_;
		class73.anInt998 += i_609_;
		class73.anInt996++;
		class73 = class73s[i_601_];
		class73.anInt996++;
		class73.anInt998 += i_609_;
		class73.anInt995 += i_611_;
		class73.anInt997 += i_610_;
		class73 = class73s[i_602_];
		class73.anInt997 += i_610_;
		class73.anInt998 += i_609_;
		class73.anInt995 += i_611_;
		class73.anInt996++;
	    }
	}
	for (int i_614_ = 0; (i_614_ ^ 0xffffffff) > (anInt4799 ^ 0xffffffff);
	     i_614_++) {
	    int i_615_ = is[i_614_];
	    int i_616_ = 0xffff & arg1.aShortArray1516[i_615_];
	    short i_617_;
	    if (null != arg1.aShortArray1520)
		i_617_ = arg1.aShortArray1520[i_615_];
	    else
		i_617_ = (short) -1;
	    int i_618_;
	    if (null == arg1.aByteArray1540)
		i_618_ = -1;
	    else
		i_618_ = arg1.aByteArray1540[i_615_];
	    int i_619_;
	    if (null == arg1.aByteArray1505)
		i_619_ = 0;
	    else
		i_619_ = 0xff & arg1.aByteArray1505[i_615_];
	    float f = 0.0F;
	    float f_620_ = 0.0F;
	    float f_621_ = 0.0F;
	    float f_622_ = 0.0F;
	    float f_623_ = 0.0F;
	    float f_624_ = 0.0F;
	    int i_625_ = 0;
	    int i_626_ = 0;
	    int i_627_ = 0;
	    if (-1 != i_617_) {
		if ((i_618_ ^ 0xffffffff) != 0) {
		    i_618_ &= 0xff;
		    byte i_628_ = arg1.aByteArray1521[i_618_];
		    if (0 != i_628_) {
			short i_629_ = arg1.aShortArray1514[i_615_];
			short i_630_ = arg1.aShortArray1513[i_615_];
			short i_631_ = arg1.aShortArray1541[i_615_];
			int i_632_ = is_575_[i_618_];
			int i_633_ = is_576_[i_618_];
			int i_634_ = is_577_[i_618_];
			float[] fs_635_ = fs[i_618_];
			byte i_636_ = arg1.aByteArray1529[i_618_];
			float f_637_
			    = (float) arg1.aByteArray1515[i_618_] / 256.0F;
			if (1 != i_628_) {
			    if (-3 != (i_628_ ^ 0xffffffff)) {
				if (-4 == (i_628_ ^ 0xffffffff)) {
				    method2300(f_637_, i_634_, i_632_, i_636_,
					       i_633_, -3866,
					       arg1.anIntArray1511[i_629_],
					       arg1.anIntArray1533[i_629_],
					       fs_635_,
					       arg1.anIntArray1534[i_629_]);
				    f_620_ = aFloat4833;
				    f = aFloat4795;
				    method2300(f_637_, i_634_, i_632_, i_636_,
					       i_633_, -3866,
					       arg1.anIntArray1511[i_630_],
					       arg1.anIntArray1533[i_630_],
					       fs_635_,
					       arg1.anIntArray1534[i_630_]);
				    f_622_ = aFloat4833;
				    f_621_ = aFloat4795;
				    method2300(f_637_, i_634_, i_632_, i_636_,
					       i_633_, -3866,
					       arg1.anIntArray1511[i_631_],
					       arg1.anIntArray1533[i_631_],
					       fs_635_,
					       arg1.anIntArray1534[i_631_]);
				    f_624_ = aFloat4833;
				    f_623_ = aFloat4795;
				    if (0 == (i_636_ & 0x1)) {
					if (!(0.5F < -f + f_623_)) {
					    if (0.5F < f - f_623_) {
						i_626_ = 2;
						f_623_++;
					    }
					} else {
					    i_626_ = 1;
					    f_623_--;
					}
					if (!(0.5F < f_621_ - f)) {
					    if (0.5F < -f_621_ + f) {
						i_625_ = 2;
						f_621_++;
					    }
					} else {
					    i_625_ = 1;
					    f_621_--;
					}
				    } else {
					if (!(f_624_ - f_620_ > 0.5F)) {
					    if (0.5F < -f_624_ + f_620_) {
						i_626_ = 2;
						f_624_++;
					    }
					} else {
					    i_626_ = 1;
					    f_624_--;
					}
					if (0.5F < -f_620_ + f_622_) {
					    i_625_ = 1;
					    f_622_--;
					} else if (f_620_ - f_622_ > 0.5F) {
					    i_625_ = 2;
					    f_622_++;
					}
				    }
				}
			    } else {
				float f_638_
				    = ((float) arg1.aByteArray1491[i_618_]
				       / 256.0F);
				float f_639_
				    = ((float) arg1.aByteArray1532[i_618_]
				       / 256.0F);
				int i_640_ = (arg1.anIntArray1533[i_630_]
					      + -arg1.anIntArray1533[i_629_]);
				int i_641_ = (-arg1.anIntArray1511[i_629_]
					      + arg1.anIntArray1511[i_630_]);
				int i_642_ = (arg1.anIntArray1534[i_630_]
					      - arg1.anIntArray1534[i_629_]);
				int i_643_ = (-arg1.anIntArray1533[i_629_]
					      + arg1.anIntArray1533[i_631_]);
				int i_644_ = (arg1.anIntArray1511[i_631_]
					      - arg1.anIntArray1511[i_629_]);
				int i_645_ = (arg1.anIntArray1534[i_631_]
					      + -arg1.anIntArray1534[i_629_]);
				int i_646_ = i_641_ * i_645_ - i_642_ * i_644_;
				int i_647_ = i_642_ * i_643_ - i_645_ * i_640_;
				int i_648_
				    = -(i_643_ * i_641_) + i_640_ * i_644_;
				float f_649_
				    = (64.0F
				       / (float) (arg1.aShortArray1496[i_618_]
						  & 0xffff));
				float f_650_
				    = (64.0F
				       / (float) (arg1.aShortArray1530[i_618_]
						  & 0xffff));
				float f_651_
				    = (64.0F
				       / (float) (arg1.aShortArray1504[i_618_]
						  & 0xffff));
				float f_652_ = (((float) i_646_ * fs_635_[0]
						 + (float) i_647_ * fs_635_[1]
						 + fs_635_[2] * (float) i_648_)
						/ f_649_);
				float f_653_
				    = ((fs_635_[5] * (float) i_648_
					+ (fs_635_[4] * (float) i_647_
					   + (float) i_646_ * fs_635_[3]))
				       / f_650_);
				float f_654_
				    = (((float) i_648_ * fs_635_[8]
					+ ((float) i_646_ * fs_635_[6]
					   + (float) i_647_ * fs_635_[7]))
				       / f_651_);
				i_627_
				    = method2296(f_654_, f_653_, true, f_652_);
				method2306(i_636_, arg1.anIntArray1511[i_629_],
					   arg1.anIntArray1533[i_629_], f_638_,
					   arg1.anIntArray1534[i_629_], i_627_,
					   i_633_, i_632_, i_634_, f_639_,
					   f_637_, 28605, fs_635_);
				f_620_ = aFloat4836;
				f = aFloat4801;
				method2306(i_636_, arg1.anIntArray1511[i_630_],
					   arg1.anIntArray1533[i_630_], f_638_,
					   arg1.anIntArray1534[i_630_], i_627_,
					   i_633_, i_632_, i_634_, f_639_,
					   f_637_, 28605, fs_635_);
				f_621_ = aFloat4801;
				f_622_ = aFloat4836;
				method2306(i_636_, arg1.anIntArray1511[i_631_],
					   arg1.anIntArray1533[i_631_], f_638_,
					   arg1.anIntArray1534[i_631_], i_627_,
					   i_633_, i_632_, i_634_, f_639_,
					   f_637_, 28605, fs_635_);
				f_623_ = aFloat4801;
				f_624_ = aFloat4836;
			    }
			} else {
			    float f_655_
				= ((float) (arg1.aShortArray1504[i_618_]
					    & 0xffff)
				   / 1024.0F);
			    method2297(fs_635_, 0, i_632_,
				       arg1.anIntArray1534[i_629_], i_634_,
				       arg1.anIntArray1533[i_629_], f_655_,
				       f_637_, arg1.anIntArray1511[i_629_],
				       i_636_, i_633_);
			    f_620_ = aFloat4823;
			    f = aFloat4844;
			    method2297(fs_635_, 0, i_632_,
				       arg1.anIntArray1534[i_630_], i_634_,
				       arg1.anIntArray1533[i_630_], f_655_,
				       f_637_, arg1.anIntArray1511[i_630_],
				       i_636_, i_633_);
			    f_621_ = aFloat4844;
			    f_622_ = aFloat4823;
			    method2297(fs_635_, 0, i_632_,
				       arg1.anIntArray1534[i_631_], i_634_,
				       arg1.anIntArray1533[i_631_], f_655_,
				       f_637_, arg1.anIntArray1511[i_631_],
				       i_636_, i_633_);
			    f_623_ = aFloat4844;
			    f_624_ = aFloat4823;
			    float f_656_ = f_655_ / 2.0F;
			    if ((i_636_ & 0x1 ^ 0xffffffff) == -1) {
				if (f_623_ - f > f_656_) {
				    i_626_ = 1;
				    f_623_ -= f_655_;
				} else if (f_656_ < -f_623_ + f) {
				    f_623_ += f_655_;
				    i_626_ = 2;
				}
				if (!(f_656_ < f_621_ - f)) {
				    if (f_656_ < -f_621_ + f) {
					f_621_ += f_655_;
					i_625_ = 2;
				    }
				} else {
				    i_625_ = 1;
				    f_621_ -= f_655_;
				}
			    } else {
				if (-f_620_ + f_622_ > f_656_) {
				    i_625_ = 1;
				    f_622_ -= f_655_;
				} else if (-f_622_ + f_620_ > f_656_) {
				    i_625_ = 2;
				    f_622_ += f_655_;
				}
				if (!(-f_620_ + f_624_ > f_656_)) {
				    if (-f_624_ + f_620_ > f_656_) {
					f_624_ += f_655_;
					i_626_ = 2;
				    }
				} else {
				    i_626_ = 1;
				    f_624_ -= f_655_;
				}
			    }
			}
		    } else {
			short i_657_ = arg1.aShortArray1514[i_615_];
			short i_658_ = arg1.aShortArray1513[i_615_];
			short i_659_ = arg1.aShortArray1541[i_615_];
			short i_660_ = arg1.aShortArray1501[i_618_];
			short i_661_ = arg1.aShortArray1537[i_618_];
			short i_662_ = arg1.aShortArray1512[i_618_];
			float f_663_ = (float) arg1.anIntArray1533[i_660_];
			float f_664_ = (float) arg1.anIntArray1511[i_660_];
			float f_665_ = (float) arg1.anIntArray1534[i_660_];
			float f_666_
			    = (float) arg1.anIntArray1533[i_661_] - f_663_;
			float f_667_
			    = (float) arg1.anIntArray1511[i_661_] - f_664_;
			float f_668_
			    = (float) arg1.anIntArray1534[i_661_] - f_665_;
			float f_669_
			    = -f_663_ + (float) arg1.anIntArray1533[i_662_];
			float f_670_
			    = (float) arg1.anIntArray1511[i_662_] - f_664_;
			float f_671_
			    = (float) arg1.anIntArray1534[i_662_] - f_665_;
			float f_672_
			    = (float) arg1.anIntArray1533[i_657_] - f_663_;
			float f_673_
			    = -f_664_ + (float) arg1.anIntArray1511[i_657_];
			float f_674_
			    = (float) arg1.anIntArray1534[i_657_] - f_665_;
			float f_675_
			    = (float) arg1.anIntArray1533[i_658_] - f_663_;
			float f_676_
			    = (float) arg1.anIntArray1511[i_658_] - f_664_;
			float f_677_
			    = (float) arg1.anIntArray1534[i_658_] - f_665_;
			float f_678_
			    = -f_663_ + (float) arg1.anIntArray1533[i_659_];
			float f_679_
			    = (float) arg1.anIntArray1511[i_659_] - f_664_;
			float f_680_
			    = (float) arg1.anIntArray1534[i_659_] - f_665_;
			float f_681_ = f_671_ * f_667_ - f_670_ * f_668_;
			float f_682_ = -(f_671_ * f_666_) + f_669_ * f_668_;
			float f_683_ = -(f_667_ * f_669_) + f_670_ * f_666_;
			float f_684_ = -(f_682_ * f_671_) + f_670_ * f_683_;
			float f_685_ = -(f_669_ * f_683_) + f_671_ * f_681_;
			float f_686_ = f_682_ * f_669_ - f_670_ * f_681_;
			float f_687_
			    = 1.0F / (f_668_ * f_686_
				      + (f_667_ * f_685_ + f_666_ * f_684_));
			f = (f_686_ * f_674_
			     + (f_673_ * f_685_ + f_672_ * f_684_)) * f_687_;
			f_623_
			    = f_687_ * (f_680_ * f_686_
					+ (f_678_ * f_684_ + f_679_ * f_685_));
			f_621_ = f_687_ * (f_685_ * f_676_ + f_675_ * f_684_
					   + f_686_ * f_677_);
			f_685_ = f_668_ * f_681_ - f_666_ * f_683_;
			f_684_ = f_683_ * f_667_ - f_668_ * f_682_;
			f_686_ = f_666_ * f_682_ - f_681_ * f_667_;
			f_687_ = 1.0F / (f_684_ * f_669_ + f_685_ * f_670_
					 + f_686_ * f_671_);
			f_620_ = f_687_ * (f_673_ * f_685_ + f_684_ * f_672_
					   + f_674_ * f_686_);
			f_622_ = (f_675_ * f_684_ + f_685_ * f_676_
				  + f_686_ * f_677_) * f_687_;
			f_624_
			    = (f_680_ * f_686_
			       + (f_678_ * f_684_ + f_685_ * f_679_)) * f_687_;
		    }
		} else {
		    i_626_ = 2;
		    f_620_ = 1.0F;
		    i_625_ = 1;
		    f_624_ = 0.0F;
		    f_623_ = 0.0F;
		    f_621_ = 1.0F;
		    f = 0.0F;
		    f_622_ = 1.0F;
		}
	    }
	    byte i_688_;
	    if (null != arg1.aByteArray1493)
		i_688_ = arg1.aByteArray1493[i_615_];
	    else
		i_688_ = (byte) 0;
	    if (-1 == (i_688_ ^ 0xffffffff)) {
		long l = ((long) (i_618_ << -1060608190)
			  + ((long) i_619_ + ((long) (i_627_ << 1453214168)
					      - -(long) (i_616_ << -311583160))
			     << -838915680));
		short i_689_ = arg1.aShortArray1514[i_615_];
		short i_690_ = arg1.aShortArray1513[i_615_];
		short i_691_ = arg1.aShortArray1541[i_615_];
		Class73 class73 = class73s[i_689_];
		aShortArray4835[i_614_]
		    = method2290(class73.anInt998, l, i_689_, class73.anInt995,
				 (byte) 104, class73.anInt996,
				 class73.anInt997, f_620_, f, arg1);
		class73 = class73s[i_690_];
		aShortArray4811[i_614_]
		    = method2290(class73.anInt998, (long) i_625_ + l, i_690_,
				 class73.anInt995, (byte) -120,
				 class73.anInt996, class73.anInt997, f_622_,
				 f_621_, arg1);
		class73 = class73s[i_691_];
		aShortArray4843[i_614_]
		    = method2290(class73.anInt998, l + (long) i_626_, i_691_,
				 class73.anInt995, (byte) 63, class73.anInt996,
				 class73.anInt997, f_624_, f_623_, arg1);
	    } else if (i_688_ == 1) {
		Class48 class48 = class48s[i_615_];
		long l
		    = ((((long) (i_627_ << -1801378152)
			 - (-(long) (i_616_ << -243227224) + -(long) i_619_))
			<< 5875680)
		       + (long) ((256 + class48.anInt648 << 1712285836)
				 + ((i_618_ << 810325186)
				    + ((0 >= class48.anInt649 ? 2048 : 1024)
				       - -(256 + class48.anInt650
					   << 94446294)))));
		aShortArray4835[i_614_]
		    = method2290(class48.anInt649, l,
				 arg1.aShortArray1514[i_615_],
				 class48.anInt650, (byte) -100, 0,
				 class48.anInt648, f_620_, f, arg1);
		aShortArray4811[i_614_]
		    = method2290(class48.anInt649, (long) i_625_ + l,
				 arg1.aShortArray1513[i_615_],
				 class48.anInt650, (byte) 29, 0,
				 class48.anInt648, f_622_, f_621_, arg1);
		aShortArray4843[i_614_]
		    = method2290(class48.anInt649, (long) i_626_ + l,
				 arg1.aShortArray1541[i_615_],
				 class48.anInt650, (byte) 34, 0,
				 class48.anInt648, f_624_, f_623_, arg1);
	    }
	    if (null == arg1.aShortArray1520)
		aShortArray4830[i_614_] = (short) -1;
	    else
		aShortArray4830[i_614_] = arg1.aShortArray1520[i_615_];
	    if (arg1.aByteArray1505 != null)
		aByteArray4789[i_614_] = arg1.aByteArray1505[i_615_];
	    if (null != arg1.aShortArray1525)
		aShortArray4845[i_614_] = arg1.aShortArray1525[i_615_];
	    aShortArray4826[i_614_] = arg1.aShortArray1516[i_615_];
	}
	int i_692_ = 0;
	short i_693_ = -10000;
	for (int i_694_ = 0; (i_694_ ^ 0xffffffff) > (anInt4799 ^ 0xffffffff);
	     i_694_++) {
	    short i_695_ = aShortArray4830[i_694_];
	    if (i_695_ != i_693_) {
		i_693_ = i_695_;
		i_692_++;
	    }
	}
	anIntArray4829 = new int[1 + i_692_];
	i_692_ = 0;
	i_693_ = (short) -10000;
	for (int i_696_ = 0; anInt4799 > i_696_; i_696_++) {
	    short i_697_ = aShortArray4830[i_696_];
	    if (i_693_ != i_697_) {
		anIntArray4829[i_692_++] = i_696_;
		i_693_ = i_697_;
	    }
	}
	anIntArray4829[i_692_] = anInt4799;
	aLongArray4804 = null;
	aShortArray4820 = method2307(anInt4793, aShortArray4820, (byte) 81);
	aShortArray4821 = method2307(anInt4793, aShortArray4821, (byte) 81);
	aShortArray4825 = method2307(anInt4793, aShortArray4825, (byte) 81);
	aByteArray4828 = method2303(anInt4793, (byte) -24, aByteArray4828);
	aFloatArray4814 = method2305(0, anInt4793, aFloatArray4814);
	aFloatArray4817 = method2305(0, anInt4793, aFloatArray4817);
	if (null != arg1.anIntArray1500
	    && Class194.method2660(arg2, anInt4841, 0)) {
	    int[] is_698_ = new int[256];
	    int i_699_ = 0;
	    for (int i_700_ = 0; anInt4792 > i_700_; i_700_++) {
		int i_701_ = arg1.anIntArray1500[i_700_];
		if (-1 >= (i_701_ ^ 0xffffffff)) {
		    if ((i_699_ ^ 0xffffffff) > (i_701_ ^ 0xffffffff))
			i_699_ = i_701_;
		    is_698_[i_701_]++;
		}
	    }
	    anIntArrayArray4800 = new int[1 + i_699_][];
	    for (int i_702_ = 0;
		 (i_699_ ^ 0xffffffff) <= (i_702_ ^ 0xffffffff); i_702_++) {
		anIntArrayArray4800[i_702_] = new int[is_698_[i_702_]];
		is_698_[i_702_] = 0;
	    }
	    for (int i_703_ = 0; i_703_ < anInt4792; i_703_++) {
		int i_704_ = arg1.anIntArray1500[i_703_];
		if (-1 >= (i_704_ ^ 0xffffffff))
		    anIntArrayArray4800[i_704_][is_698_[i_704_]++] = i_703_;
	    }
	}
	if (null != arg1.anIntArray1524
	    && Class194.method2645(anInt4841, arg2, 1024)) {
	    int i_705_ = 0;
	    int[] is_706_ = new int[256];
	    for (int i_707_ = 0; i_707_ < anInt4799; i_707_++) {
		int i_708_ = arg1.anIntArray1524[is[i_707_]];
		if (i_708_ >= 0) {
		    if (i_708_ > i_705_)
			i_705_ = i_708_;
		    is_706_[i_708_]++;
		}
	    }
	    anIntArrayArray4808 = new int[1 + i_705_][];
	    for (int i_709_ = 0; i_709_ <= i_705_; i_709_++) {
		anIntArrayArray4808[i_709_] = new int[is_706_[i_709_]];
		is_706_[i_709_] = 0;
	    }
	    for (int i_710_ = 0;
		 (anInt4799 ^ 0xffffffff) < (i_710_ ^ 0xffffffff); i_710_++) {
		int i_711_ = arg1.anIntArray1524[is[i_710_]];
		if (-1 >= (i_711_ ^ 0xffffffff))
		    anIntArrayArray4808[i_711_][is_706_[i_711_]++] = i_710_;
	    }
	}
    }
    
    static {
	anIntArray4847 = new int[8];
	anIntArray4850 = new int[8];
	anIntArray4849 = new int[1];
	anIntArray4852 = new int[8];
    }
}
