/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213
{
    public static int anInt3118 = 0;
    public static int anInt3119;
    public static int[] anIntArray3120;
    public static Class203[] aClass203Array3121;
    
    public static void method2769(int arg0) {
	try {
	    aClass203Array3121 = null;
	    if (arg0 <= -111)
		anIntArray3120 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wb.C(" + arg0 + ')');
	}
    }
    
    public static void method2770(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, byte arg7) {
	try {
	    anInt3119++;
	    int i = 0;
	    if (arg7 == 31) {
		int i_0_ = arg4;
		int i_1_ = 0;
		int i_2_ = -arg0 + arg6;
		int i_3_ = -arg0 + arg4;
		int i_4_ = arg6 * arg6;
		int i_5_ = arg4 * arg4;
		int i_6_ = i_2_ * i_2_;
		int i_7_ = i_3_ * i_3_;
		int i_8_ = i_5_ << -1026974463;
		int i_9_ = i_4_ << 319190785;
		int i_10_ = i_7_ << 700178017;
		int i_11_ = i_6_ << 355130721;
		int i_12_ = arg4 << 1908731777;
		int i_13_ = i_3_ << 1883674145;
		int i_14_ = (1 - i_12_) * i_4_ + i_8_;
		int i_15_ = -((-1 + i_12_) * i_9_) + i_5_;
		int i_16_ = i_6_ * (-i_13_ + 1) - -i_10_;
		int i_17_ = i_7_ - i_11_ * (-1 + i_13_);
		int i_18_ = i_4_ << 2044373442;
		int i_19_ = i_5_ << 1768304738;
		int i_20_ = i_6_ << -57881790;
		int i_21_ = i_7_ << 1255504194;
		int i_22_ = 3 * i_8_;
		int i_23_ = (-3 + i_12_) * i_9_;
		int i_24_ = 3 * i_10_;
		int i_25_ = (-3 + i_13_) * i_11_;
		int i_26_ = i_19_;
		int i_27_ = (arg4 - 1) * i_18_;
		int i_28_ = i_21_;
		int i_29_ = i_20_ * (-1 + i_3_);
		int[] is = Class56.anIntArrayArray740[arg5];
		Class131_Sub3.method1650(-i_2_ + arg2, is, arg3, -arg6 + arg2,
					 126);
		Class131_Sub3.method1650(arg2 - -i_2_, is, arg1, -i_2_ + arg2,
					 62);
		Class131_Sub3.method1650(arg2 - -arg6, is, arg3, arg2 + i_2_,
					 125);
		while ((i_0_ ^ 0xffffffff) < -1) {
		    boolean bool = i_3_ >= i_0_;
		    if (i_14_ < 0) {
			while ((i_14_ ^ 0xffffffff) > -1) {
			    i_15_ += i_26_;
			    i_14_ += i_22_;
			    i_22_ += i_19_;
			    i_26_ += i_19_;
			    i++;
			}
		    }
		    if (bool) {
			if (i_16_ < 0) {
			    while (i_16_ < 0) {
				i_17_ += i_28_;
				i_16_ += i_24_;
				i_1_++;
				i_24_ += i_21_;
				i_28_ += i_21_;
			    }
			}
			if (i_17_ < 0) {
			    i_17_ += i_28_;
			    i_16_ += i_24_;
			    i_28_ += i_21_;
			    i_1_++;
			    i_24_ += i_21_;
			}
			i_17_ += -i_25_;
			i_16_ += -i_29_;
			i_29_ -= i_20_;
			i_25_ -= i_20_;
		    }
		    if (i_15_ < 0) {
			i_14_ += i_22_;
			i_15_ += i_26_;
			i++;
			i_26_ += i_19_;
			i_22_ += i_19_;
		    }
		    i_14_ += -i_27_;
		    i_15_ += -i_23_;
		    i_27_ -= i_18_;
		    i_0_--;
		    i_23_ -= i_18_;
		    int i_30_ = -i_0_ + arg5;
		    int i_31_ = arg5 + i_0_;
		    int i_32_ = arg2 + i;
		    int i_33_ = arg2 - i;
		    if (bool) {
			int i_34_ = i_1_ + arg2;
			int i_35_ = arg2 - i_1_;
			Class131_Sub3.method1650(i_35_,
						 (Class56.anIntArrayArray740
						  [i_30_]),
						 arg3, i_33_, 61);
			Class131_Sub3.method1650(i_34_,
						 (Class56.anIntArrayArray740
						  [i_30_]),
						 arg1, i_35_, 126);
			Class131_Sub3.method1650(i_32_,
						 (Class56.anIntArrayArray740
						  [i_30_]),
						 arg3, i_34_, 70);
			Class131_Sub3.method1650(i_35_,
						 (Class56.anIntArrayArray740
						  [i_31_]),
						 arg3, i_33_, 73);
			Class131_Sub3.method1650(i_34_,
						 (Class56.anIntArrayArray740
						  [i_31_]),
						 arg1, i_35_, 76);
			Class131_Sub3.method1650(i_32_,
						 (Class56.anIntArrayArray740
						  [i_31_]),
						 arg3, i_34_, arg7 ^ 0x45);
		    } else {
			Class131_Sub3.method1650(i_32_,
						 (Class56.anIntArrayArray740
						  [i_30_]),
						 arg3, i_33_, 100);
			Class131_Sub3.method1650(i_32_,
						 (Class56.anIntArrayArray740
						  [i_31_]),
						 arg3, i_33_, 116);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wb.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static void method2771() {
	if (PacketStream.aClass147ArrayArrayArray6124 != null) {
	    for (int i = 0;
		 i < PacketStream.aClass147ArrayArrayArray6124.length;
		 i++) {
		for (int i_36_ = 0; i_36_ < Class210.anInt3068; i_36_++) {
		    for (int i_37_ = 0; i_37_ < Class131_Sub8_Sub1.anInt6099;
			 i_37_++) {
			if ((PacketStream.aClass147ArrayArrayArray6124
			     [i][i_36_][i_37_])
			    != null)
			    PacketStream
				.aClass147ArrayArrayArray6124[i][i_36_][i_37_]
				.method2172((byte) 110);
			PacketStream.aClass147ArrayArrayArray6124[i]
			    [i_36_][i_37_]
			    = null;
		    }
		}
	    }
	}
	PacketStream.aClass147ArrayArrayArray6124 = null;
	Class131_Sub2_Sub37.aClass68Array6057 = null;
	if (Class82.aClass147ArrayArrayArray1092 != null) {
	    for (int i = 0; i < Class82.aClass147ArrayArrayArray1092.length;
		 i++) {
		for (int i_38_ = 0; i_38_ < Class210.anInt3068; i_38_++) {
		    for (int i_39_ = 0; i_39_ < Class131_Sub8_Sub1.anInt6099;
			 i_39_++) {
			if ((Class82.aClass147ArrayArrayArray1092[i][i_38_]
			     [i_39_])
			    != null)
			    Class82.aClass147ArrayArrayArray1092[i][i_38_]
				[i_39_].method2172((byte) 110);
			Class82.aClass147ArrayArrayArray1092[i][i_38_][i_39_]
			    = null;
		    }
		}
	    }
	}
	Class82.aClass147ArrayArrayArray1092 = null;
	Class85.aClass68Array1116 = null;
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 = null;
	Class75.aClass68Array1023 = null;
	Class23_Sub2_Sub1.anInt4995 = 0;
	if (aClass203Array3121 != null) {
	    for (int i = 0; i < Class23_Sub2_Sub1.anInt4995; i++)
		aClass203Array3121[i] = null;
	}
	if (Class180.aClass23_Sub4Array2579 != null) {
	    for (int i = 0; i < Class90.anInt1174; i++)
		Class180.aClass23_Sub4Array2579[i] = null;
	    Class90.anInt1174 = 0;
	}
	if (Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707 != null) {
	    for (int i = 0; i < Class172.anInt2293; i++)
		Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707[i] = null;
	    for (int i = 0; i < Class133.anInt1805; i++) {
		for (int i_40_ = 0; i_40_ < Class210.anInt3068; i_40_++) {
		    for (int i_41_ = 0; i_41_ < Class131_Sub8_Sub1.anInt6099;
			 i_41_++)
			Class64.anIntArrayArrayArray810[i][i_40_][i_41_] = 0;
		}
	    }
	    Class172.anInt2293 = 0;
	}
	Class163.anIntArrayArrayArray2186 = null;
	Applet_Sub1.method46((byte) -125);
	Class134.aClass50_1807.method587(0);
	Class153_Sub1.aClass120_4757 = null;
	Class218.anIntArrayArray3197 = null;
	Class131_Sub2_Sub22.aClass9_5859 = null;
	Class131_Sub2_Sub35.aClass130_6044 = null;
    }
}
