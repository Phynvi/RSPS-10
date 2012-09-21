/* Class121_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121_Sub2 extends Class121
{
    public static int anInt3986;
    public static int anInt3987;
    public static int anInt3988;
    public static String aString3989 = " is already on your friend list.";
    public static int anInt3990;
    public static int anInt3991;
    public static String aString3992;
    public static int[] anIntArray3993;
    
    public static int method1047(boolean arg0, char arg1, String arg2) {
	try {
	    anInt3991++;
	    int i = 0;
	    int i_0_ = arg2.length();
	    int i_1_ = 0;
	    if (arg0 != true)
		aString3989 = null;
	    for (/**/; i_0_ > i_1_; i_1_++) {
		if (arg1 == arg2.charAt(i_1_))
		    i++;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pk.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static boolean method1048(int arg0) {
	try {
	    anInt3986++;
	    if (arg0 != Class214.anInt3139)
		return true;
	    return Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
		       .method1376(1000000);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pk.E(" + arg0 + ')');
	}
    }
    
    public static void method1049(byte arg0) {
	try {
	    aString3992 = null;
	    anIntArray3993 = null;
	    aString3989 = null;
	    int i = -48 % (arg0 / 39);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pk.C(" + arg0 + ')');
	}
    }
    
    public static void readMapRegion(boolean arg0, boolean arg1) {
	try {
	    if (arg1 != true)
		method1051(43, 85, -100, 78, 104, 95, 46);
	    anInt3988++;
	    Class131_Sub4.aBoolean4134 = arg0;
	    if (Class131_Sub4.aBoolean4134) {
		boolean bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByteS(14684)
				== 1);
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(8104);
		int i_2_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedByteA((byte) -103);
		int i_3_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedLEShortA(-1);
		int i_4_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedShortA(false);
		int i_5_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedByteC(4095);
		int i_6_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedShort(8104);
		Class81.method789(4, i_2_);
		Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1794(115);
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++) {
		    for (int i_8_ = 0;
			 (Class131_Sub41_Sub11_Sub1.anInt6546 >> -188209405
			  > i_8_);
			 i_8_++) {
			for (int i_9_ = 0;
			     ((Class131_Sub2_Sub26.anInt5931 >> -332538173
			       ^ 0xffffffff)
			      < (i_9_ ^ 0xffffffff));
			     i_9_++) {
			    int i_10_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(1, false);
			    if (i_10_ != 1)
				Class141.anIntArrayArrayArray1882[i_7_]
				    [i_8_][i_9_]
				    = -1;
			    else
				Class141.anIntArrayArrayArray1882[i_7_]
				    [i_8_][i_9_]
				    = Class23_Sub3_Sub1
					  .aClass131_Sub15_Sub2_5231
					  .readBits(26, !arg1);
			}
		    }
		}
		Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1788(320);
		int i_11_ = ((Class131_Sub8_Sub1.anInt6100
			      - (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .offset))
			     / 16);
		Class131_Sub2_Sub14.anIntArrayArray5746 = new int[i_11_][4];
		for (int i_12_ = 0;
		     (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++) {
		    for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -5; i_13_++)
			Class131_Sub2_Sub14.anIntArrayArray5746[i_12_][i_13_]
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedInt(-2);
		}
		Class131_Sub2_Sub16.anIntArray5777 = new int[i_11_];
		Class74.anIntArray1003 = new int[i_11_];
		Class131_Sub41_Sub18.anIntArray6403 = null;
		Class88.aByteArrayArray1146 = new byte[i_11_][];
		Class212.aByteArrayArray3115 = new byte[i_11_][];
		Class108.aByteArrayArray1420 = null;
		Class166.anIntArray2218 = new int[i_11_];
		Class131_Sub41_Sub2.anIntArray6182 = new int[i_11_];
		Class23_Sub3.anIntArray3719 = new int[i_11_];
		Class60.aByteArrayArray788 = new byte[i_11_][];
		Class23.aByteArrayArray254 = new byte[i_11_][];
		i_11_ = 0;
		for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -5; i_14_++) {
		    for (int i_15_ = 0;
			 ((i_15_ ^ 0xffffffff)
			  > (Class131_Sub41_Sub11_Sub1.anInt6546 >> 1358520323
			     ^ 0xffffffff));
			 i_15_++) {
			for (int i_16_ = 0;
			     ((i_16_ ^ 0xffffffff)
			      > (Class131_Sub2_Sub26.anInt5931 >> 1930168515
				 ^ 0xffffffff));
			     i_16_++) {
			    int i_17_ = (Class141.anIntArrayArrayArray1882
					 [i_14_][i_15_][i_16_]);
			    if ((i_17_ ^ 0xffffffff) != 0) {
				int i_18_ = (0xffdb81 & i_17_) >> 1643303182;
				int i_19_ = 0x7ff & i_17_ >> 1928945827;
				int i_20_
				    = (i_18_ / 8 << 877265224) + i_19_ / 8;
				for (int i_21_ = 0;
				     ((i_21_ ^ 0xffffffff)
				      > (i_11_ ^ 0xffffffff));
				     i_21_++) {
				    if ((Class74.anIntArray1003[i_21_]
					 ^ 0xffffffff)
					== (i_20_ ^ 0xffffffff)) {
					i_20_ = -1;
					break;
				    }
				}
				if ((i_20_ ^ 0xffffffff) != 0) {
				    Class74.anIntArray1003[i_11_] = i_20_;
				    int i_22_ = i_20_ >> 525163944 & 0xff;
				    int i_23_ = 0xff & i_20_;
				    Class166.anIntArray2218[i_11_]
					= (Class37.aClass158_504.method2359
					   (118, "m" + i_22_ + "_" + i_23_));
				    Class23_Sub3.anIntArray3719[i_11_]
					= (Class37.aClass158_504.method2359
					   (109, "l" + i_22_ + "_" + i_23_));
				    Class131_Sub41_Sub2.anIntArray6182[i_11_]
					= (Class37.aClass158_504.method2359
					   (101, "um" + i_22_ + "_" + i_23_));
				    Class131_Sub2_Sub16.anIntArray5777[i_11_]
					= (Class37.aClass158_504.method2359
					   (122, "ul" + i_22_ + "_" + i_23_));
				    i_11_++;
				}
			    }
			}
		    }
		}
		Class110_Sub3.method948(false, i, bool, i_6_, i_4_, i_5_, 24,
					i_3_);
	    } else {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedLEShortA(-1);
		int i_24_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_25_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-37);
		boolean bool = ((Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedByteA((byte) -120)
				 ^ 0xffffffff)
				== -2);
		int i_26_
		    = ((-Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset
			+ Class131_Sub8_Sub1.anInt6100)
		       / 16);
		Class131_Sub2_Sub14.anIntArrayArray5746 = new int[i_26_][4];
		for (int i_27_ = 0;
		     (i_27_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff); i_27_++) {
		    for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -5; i_28_++)
			Class131_Sub2_Sub14.anIntArrayArray5746[i_27_][i_28_]
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedInt(-2);
		}
		int i_29_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByteA((byte) 35);
		int i_30_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_31_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		Class81.method789(4, i_25_);
		Class74.anIntArray1003 = new int[i_26_];
		Class23_Sub3.anIntArray3719 = new int[i_26_];
		Class131_Sub41_Sub18.anIntArray6403 = null;
		Class212.aByteArrayArray3115 = new byte[i_26_][];
		Class166.anIntArray2218 = new int[i_26_];
		Class60.aByteArrayArray788 = new byte[i_26_][];
		Class131_Sub41_Sub2.anIntArray6182 = new int[i_26_];
		Class108.aByteArrayArray1420 = null;
		Class131_Sub2_Sub16.anIntArray5777 = new int[i_26_];
		Class23.aByteArrayArray254 = new byte[i_26_][];
		Class88.aByteArrayArray1146 = new byte[i_26_][];
		boolean bool_32_ = false;
		if (((i / 8 ^ 0xffffffff) == -49
		     || (i / 8 ^ 0xffffffff) == -50)
		    && i_31_ / 8 == 48)
		    bool_32_ = true;
		i_26_ = 0;
		if ((i / 8 ^ 0xffffffff) == -49 && i_31_ / 8 == 148)
		    bool_32_ = true;
		for (int i_33_ = (i - (Class131_Sub41_Sub11_Sub1.anInt6546
				       >> -468535292)) / 8;
		     (((Class131_Sub41_Sub11_Sub1.anInt6546 >> -538649532)
		       + i) / 8
		      >= i_33_);
		     i_33_++) {
		    for (int i_34_ = (i_31_ + -(Class131_Sub2_Sub26.anInt5931
						>> 1265916740)) / 8;
			 (((Class131_Sub2_Sub26.anInt5931 >> 1959665924)
			   + i_31_) / 8
			  >= i_34_);
			 i_34_++) {
			int i_35_ = i_34_ + (i_33_ << -275096216);
			if (bool_32_
			    && (i_34_ == 49 || i_34_ == 149
				|| (i_34_ ^ 0xffffffff) == -148
				|| (i_33_ ^ 0xffffffff) == -51
				|| (i_33_ == 49
				    && (i_34_ ^ 0xffffffff) == -48))) {
			    Class74.anIntArray1003[i_26_] = i_35_;
			    Class166.anIntArray2218[i_26_] = -1;
			    Class23_Sub3.anIntArray3719[i_26_] = -1;
			    Class131_Sub41_Sub2.anIntArray6182[i_26_] = -1;
			    Class131_Sub2_Sub16.anIntArray5777[i_26_] = -1;
			} else {
			    Class74.anIntArray1003[i_26_] = i_35_;
			    Class166.anIntArray2218[i_26_]
				= Class37.aClass158_504.method2359(97,
								   ("m" + i_33_
								    + "_"
								    + i_34_));
			    Class23_Sub3.anIntArray3719[i_26_]
				= Class37.aClass158_504.method2359(115,
								   ("l" + i_33_
								    + "_"
								    + i_34_));
			    Class131_Sub41_Sub2.anIntArray6182[i_26_]
				= Class37.aClass158_504.method2359(98,
								   ("um"
								    + i_33_
								    + "_"
								    + i_34_));
			    Class131_Sub2_Sub16.anIntArray5777[i_26_]
				= Class37.aClass158_504.method2359(124,
								   ("ul"
								    + i_33_
								    + "_"
								    + i_34_));
			}
			i_26_++;
		    }
		}
		Class110_Sub3.method948(false, i_31_, bool, i, i_24_, i_29_,
					24, i_30_);
	    }
    	PacketParser.dumpClipping();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pk.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1051(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	anInt3987++;
	Login.method1150(arg0, (byte) -103);
	int i = 0;
	int i_36_ = -arg6 + arg0;
	if (i_36_ < 0)
	    i_36_ = 0;
	int i_37_ = arg0;
	int i_38_ = -arg0;
	int i_39_ = i_36_;
	int i_40_ = -i_36_;
	int i_41_ = -1;
	int i_42_ = -1;
	int[] is = Class56.anIntArrayArray740[arg2];
	int i_43_ = arg3 + -i_36_;
	Class131_Sub3.method1650(i_43_, is, arg5, -arg0 + arg3, 87);
	int i_44_ = i_36_ + arg3;
	Class131_Sub3.method1650(i_44_, is, arg1, i_43_, 73);
	Class131_Sub3.method1650(arg3 - -arg0, is, arg5, i_44_, 86);
	while (i < i_37_) {
	    i_42_ += 2;
	    i_41_ += 2;
	    i_38_ += i_41_;
	    i_40_ += i_42_;
	    if (i_40_ >= 0 && (i_39_ ^ 0xffffffff) <= -2) {
		Class113.anIntArray1462[i_39_] = i;
		i_39_--;
		i_40_ -= i_39_ << 2147166241;
	    }
	    i++;
	    if (i_38_ >= 0) {
		i_37_--;
		i_38_ -= i_37_ << 771172481;
		if ((i_36_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff)) {
		    int[] is_45_ = Class56.anIntArrayArray740[i_37_ + arg2];
		    int[] is_46_ = Class56.anIntArrayArray740[arg2 - i_37_];
		    int i_47_ = Class113.anIntArray1462[i_37_];
		    int i_48_ = i + arg3;
		    int i_49_ = -i + arg3;
		    int i_50_ = arg3 + i_47_;
		    int i_51_ = arg3 - i_47_;
		    Class131_Sub3.method1650(i_51_, is_45_, arg5, i_49_, 87);
		    Class131_Sub3.method1650(i_50_, is_45_, arg1, i_51_,
					     arg4 + -877265099);
		    Class131_Sub3.method1650(i_48_, is_45_, arg5, i_50_,
					     arg4 ^ 0x344a0112);
		    Class131_Sub3.method1650(i_51_, is_46_, arg5, i_49_,
					     arg4 + -877265106);
		    Class131_Sub3.method1650(i_50_, is_46_, arg1, i_51_, 116);
		    Class131_Sub3.method1650(i_48_, is_46_, arg5, i_50_, 121);
		} else {
		    int[] is_52_ = Class56.anIntArrayArray740[arg2 - -i_37_];
		    int[] is_53_ = Class56.anIntArrayArray740[arg2 + -i_37_];
		    int i_54_ = arg3 + i;
		    int i_55_ = -i + arg3;
		    Class131_Sub3.method1650(i_54_, is_52_, arg5, i_55_, 100);
		    Class131_Sub3.method1650(i_54_, is_53_, arg5, i_55_, 119);
		}
	    }
	    int[] is_56_ = Class56.anIntArrayArray740[i + arg2];
	    int[] is_57_ = Class56.anIntArrayArray740[arg2 + -i];
	    int i_58_ = i_37_ + arg3;
	    int i_59_ = arg3 + -i_37_;
	    if (i >= i_36_) {
		Class131_Sub3.method1650(i_58_, is_56_, arg5, i_59_, 59);
		Class131_Sub3.method1650(i_58_, is_57_, arg5, i_59_, 72);
	    } else {
		int i_60_ = i_39_ < i ? Class113.anIntArray1462[i] : i_39_;
		int i_61_ = i_60_ + arg3;
		int i_62_ = arg3 - i_60_;
		Class131_Sub3.method1650(i_62_, is_56_, arg5, i_59_, 91);
		Class131_Sub3.method1650(i_61_, is_56_, arg1, i_62_, 73);
		Class131_Sub3.method1650(i_58_, is_56_, arg5, i_61_, 62);
		Class131_Sub3.method1650(i_62_, is_57_, arg5, i_59_, 102);
		Class131_Sub3.method1650(i_61_, is_57_, arg1, i_62_, 57);
		Class131_Sub3.method1650(i_58_, is_57_, arg5, i_61_, 76);
	    }
	}
	if (arg4 != 877265224)
	    method1047(false, '\017', null);
    }
    
    public static long method1052(int arg0) {
	try {
	    if (arg0 != -5)
		method1049((byte) -22);
	    anInt3990++;
	    return Class93.aClass100_1219.method880(30786);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pk.A(" + arg0 + ')');
	}
    }
    
    static {
	new Class137(64);
	aString3992 = "Loading fonts - ";
	anIntArray3993 = new int[5];
    }
}
