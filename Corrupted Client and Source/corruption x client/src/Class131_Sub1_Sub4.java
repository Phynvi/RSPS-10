/* Class131_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub1_Sub4 extends Class131_Sub1
{
    public static boolean aBoolean5532 = false;
    public static int anInt5533;
    public static int anInt5534;
    public static int anInt5535;
    public static int anInt5536;
    public static int anInt5537;
    public static int anInt5538 = -2;
    public Class131_Sub1_Sub1 aClass131_Sub1_Sub1_5539;
    public static int anInt5540;
    public static Class214 aClass214_5541 = new Class214(16);
    public static int anInt5542;
    public Class119 aClass119_5543 = new Class119();
    public static int anInt5544;
    public static int anInt5545;
    public static int anInt5546 = 0;
    public static int anInt5547;
    public static int anInt5548;
    public static int anInt5549;
    public Class131_Sub1_Sub3 aClass131_Sub1_Sub3_5550
	= new Class131_Sub1_Sub3();
    
    public static void method1448(int arg0) {
	aClass214_5541 = null;
	if (arg0 != 7)
	    anInt5544 = 77;
    }
    
    public void method1449(int arg0, int[] arg1, Class131_Sub11 arg2, int arg3,
			   int arg4, int arg5) {
	try {
	    anInt5535++;
	    if (arg3 != -8921)
		anInt5546 = 53;
	    if ((aClass131_Sub1_Sub1_5539.anIntArray5437[arg2.anInt4244]
		 & 0x4) != 0
		&& (arg2.anInt4230 ^ 0xffffffff) > -1) {
		int i
		    = (aClass131_Sub1_Sub1_5539.anIntArray5493[arg2.anInt4244]
		       / Class131_Sub2_Sub14.anInt5754);
		for (;;) {
		    int i_0_ = (1048575 - -i + -arg2.anInt4234) / i;
		    if (arg5 < i_0_)
			break;
		    arg2.aClass131_Sub1_Sub2_4232.method1363(arg1, arg0, i_0_);
		    arg5 -= i_0_;
		    arg2.anInt4234 += -1048576 + i * i_0_;
		    arg0 += i_0_;
		    int i_1_ = Class131_Sub2_Sub14.anInt5754 / 100;
		    int i_2_ = 262144 / i;
		    if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
			i_1_ = i_2_;
		    Class131_Sub1_Sub2 class131_sub1_sub2
			= arg2.aClass131_Sub1_Sub2_4232;
		    if (aClass131_Sub1_Sub1_5539.anIntArray5462[arg2.anInt4244]
			!= 0) {
			arg2.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (arg2.aClass131_Sub12_Sub1_4250,
				class131_sub1_sub2.method1414(), 0,
				class131_sub1_sub2.method1410()));
			aClass131_Sub1_Sub1_5539.method1388
			    (true, arg2, ((arg2.aClass131_Sub9_4237
					   .aShortArray4202[arg2.anInt4240])
					  ^ 0xffffffff) > -1);
			arg2.aClass131_Sub1_Sub2_4232
			    .method1420(i_1_, class131_sub1_sub2.method1437());
		    } else
			arg2.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (arg2.aClass131_Sub12_Sub1_4250,
				class131_sub1_sub2.method1414(),
				class131_sub1_sub2.method1437(),
				class131_sub1_sub2.method1410()));
		    if ((arg2.aClass131_Sub9_4237.aShortArray4202
			 [arg2.anInt4240])
			< 0)
			arg2.aClass131_Sub1_Sub2_4232.method1435(-1);
		    class131_sub1_sub2.method1432(i_1_);
		    class131_sub1_sub2.method1363(arg1, arg0, arg4 - arg0);
		    if (class131_sub1_sub2.method1404())
			aClass131_Sub1_Sub3_5550
			    .method1446(class131_sub1_sub2);
		}
		arg2.anInt4234 += i * arg5;
	    }
	    arg2.aClass131_Sub1_Sub2_4232.method1363(arg1, arg0, arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pj.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ')'));
	}
    }
    
    public static void method1450(int arg0, int arg1, int arg2) {
	try {
	    anInt5540++;
	    if (Class154.aBoolean2047) {
		Class93.aClass131_Sub15_Sub2_1226.createPacket(145);
		int i = 44 / ((-3 - arg2) / 62);
		Class46_Sub1.anInt3801++;
		Class93.aClass131_Sub15_Sub2_1226.writeInt(arg0);
		Class93.aClass131_Sub15_Sub2_1226.writeLEShort(arg1,
							     (byte) -115);
		Class93.aClass131_Sub15_Sub2_1226
		    .writeInt1((byte) -32, Class88.anInt1161);
		Class93.aClass131_Sub15_Sub2_1226.writeLEShort(Class98.anInt1306,
							     (byte) -115);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pj.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1363(int[] arg0, int arg1, int arg2) {
	try {
	    anInt5542++;
	    aClass131_Sub1_Sub3_5550.method1363(arg0, arg1, arg2);
	    Class131_Sub11 class131_sub11
		= (Class131_Sub11) aClass119_5543.method1007(0);
	while_74_:
	    for (/**/; class131_sub11 != null;
		 class131_sub11
		     = (Class131_Sub11) aClass119_5543.method1014(0)) {
		if (!aClass131_Sub1_Sub1_5539.method1385(class131_sub11,
							 (byte) -102)) {
		    int i = arg2;
		    int i_3_ = arg1;
		    while (class131_sub11.anInt4255 < i) {
			method1449(i_3_, arg0, class131_sub11, -8921, i + i_3_,
				   class131_sub11.anInt4255);
			i_3_ += class131_sub11.anInt4255;
			i -= class131_sub11.anInt4255;
			if (aClass131_Sub1_Sub1_5539.method1367(class131_sub11,
								i_3_, i, arg0,
								(byte) -30))
			    continue while_74_;
		    }
		    method1449(i_3_, arg0, class131_sub11, -8921, i + i_3_, i);
		    class131_sub11.anInt4255 -= i;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pj.KA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public void method1451(byte arg0, int arg1, Class131_Sub11 arg2) {
	try {
	    if ((0x4 & aClass131_Sub1_Sub1_5539.anIntArray5437[arg2.anInt4244]
		 ^ 0xffffffff) != -1
		&& (arg2.anInt4230 ^ 0xffffffff) > -1) {
		int i
		    = (aClass131_Sub1_Sub1_5539.anIntArray5493[arg2.anInt4244]
		       / Class131_Sub2_Sub14.anInt5754);
		int i_4_ = (-arg2.anInt4234 + 1048575 + i) / i;
		arg2.anInt4234 = 0xfffff & arg1 * i + arg2.anInt4234;
		if ((arg1 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)) {
		    if (((aClass131_Sub1_Sub1_5539.anIntArray5462
			  [arg2.anInt4244])
			 ^ 0xffffffff)
			!= -1) {
			arg2.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (arg2.aClass131_Sub12_Sub1_4250,
				arg2.aClass131_Sub1_Sub2_4232.method1414(), 0,
				arg2.aClass131_Sub1_Sub2_4232.method1410()));
			aClass131_Sub1_Sub1_5539.method1388
			    (true, arg2, ((arg2.aClass131_Sub9_4237
					   .aShortArray4202[arg2.anInt4240])
					  ^ 0xffffffff) > -1);
		    } else
			arg2.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (arg2.aClass131_Sub12_Sub1_4250,
				arg2.aClass131_Sub1_Sub2_4232.method1414(),
				arg2.aClass131_Sub1_Sub2_4232.method1437(),
				arg2.aClass131_Sub1_Sub2_4232.method1410()));
		    if ((arg2.aClass131_Sub9_4237.aShortArray4202
			 [arg2.anInt4240])
			< 0)
			arg2.aClass131_Sub1_Sub2_4232.method1435(-1);
		    arg1 = arg2.anInt4234 / i;
		}
	    }
	    anInt5545++;
	    if (arg0 != 13)
		method1360(-48);
	    arg2.aClass131_Sub1_Sub2_4232.method1360(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pj.G(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1452(byte arg0) {
	anInt5549++;
	Class219.aClass214_3204.method2783(-107);
	Class17.aClass214_182.method2783(-102);
	if (arg0 != 111)
	    anInt5544 = -2;
    }
    
    public static void method1453(byte arg0) {
	anInt5533++;
	if (Class131_Sub35.anInt4583 == 15) {
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-61);
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(111);
	    int i_5_ = (i >> 217556612 & 0x7) + Class131_Sub41_Sub19.anInt6418;
	    int i_6_ = (0x7 & i) + Class131_Sub37.anInt4609;
	    int i_7_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104);
	    int i_8_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			   .readUnsignedByte(arg0 + -32);
	    int i_9_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			   .read3Bytes(false);
	    String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readString(false);
	    Class187.method2584(i_6_, i_7_, 6, i_8_, i_9_, i_5_, string);
	} else if (Class131_Sub35.anInt4583 == 115) {
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	    int i_10_
		= Class131_Sub41_Sub19.anInt6418 - -(0x7 & i >> 343874180);
	    int i_11_ = (0x7 & i) + Class131_Sub37.anInt4609;
	    int i_12_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedLEShortA(arg0 + 92);
	    int i_13_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	    int i_14_ = i_13_ >> 1295095778;
	    int i_15_ = 0x3 & i_13_;
	    int i_16_ = Class23_Sub4_Sub1.anIntArray5244[i_14_];
	    if ((i_10_ ^ 0xffffffff) <= -1 && i_11_ >= 0
		&& (i_10_ ^ 0xffffffff) > (Class131_Sub41_Sub11_Sub1.anInt6546
					   ^ 0xffffffff)
		&& (i_11_ ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
					   ^ 0xffffffff))
		Stream.method1753(i_14_, i_10_, -1, i_16_, i_11_,
					  -29403, i_15_, 0, Class29.anInt300,
					  i_12_);
	} else if (Class131_Sub35.anInt4583 == 22) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedLEShortA(-1);
	    int i_17_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(arg0 ^ ~0x1ff4);
	    int i_18_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	    int i_19_
		= Class131_Sub41_Sub19.anInt6418 + (i_18_ >> 875781124 & 0x7);
	    int i_20_ = Class131_Sub37.anInt4609 - -(0x7 & i_18_);
	    if (i_19_ >= 0 && i_20_ >= 0
		&& Class131_Sub41_Sub11_Sub1.anInt6546 > i_19_
		&& ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
		    < (i_20_ ^ 0xffffffff))) {
		Class147.method2174(Class29.anInt300, i_20_, i_19_, (byte) -55,
				    new Class131_Sub18(i_17_, i));
		Class131.method1354(i_20_, -71, Class29.anInt300, i_19_);
	    }
	} else if (Class131_Sub35.anInt4583 == 229) {
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-70);
	    int i_21_ = (2 * Class131_Sub41_Sub19.anInt6418
			 - -(0xf & i >> -1363533852));
	    int i_22_ = Class131_Sub37.anInt4609 * 2 - -(i & 0xf);
	    int i_23_ = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readSignedByte((byte) 127)
			 + i_21_);
	    int i_24_ = i_22_ + Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readSignedByte((byte) 127);
	    int i_25_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readSignedShort(1625554944);
	    int i_26_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readSignedShort(arg0 ^ ~0x60e4005c);
	    int i_27_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(arg0 ^ ~0x1ff4);
	    int i_28_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readSignedByte((byte) 127);
	    int i_29_ = 4 * Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(109);
	    int i_30_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(arg0 ^ ~0x1ff4);
	    int i_31_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104);
	    int i_32_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(59);
	    int i_33_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-19);
	    if (i_32_ == 255)
		i_32_ = -1;
	    if (i_21_ >= 0 && i_22_ >= 0 && (i_21_ ^ 0xffffffff) > -209
		&& i_22_ < 208 && i_23_ >= 0 && (i_24_ ^ 0xffffffff) <= -1
		&& (i_23_ ^ 0xffffffff) > -209 && (i_24_ ^ 0xffffffff) > -209
		&& i_27_ != 65535) {
		i_22_ = 64 * i_22_;
		i_23_ = 64 * i_23_;
		i_24_ *= 64;
		i_21_ *= 64;
		if ((i_25_ ^ 0xffffffff) != -1) {
		    int i_34_;
		    Class23_Sub4_Sub1 class23_sub4_sub1;
		    if (i_25_ < 0) {
			int i_35_ = -i_25_ + -1;
			int i_36_ = i_35_ & 0x7ff;
			i_34_ = (0x7eac & i_35_) >> -916976853;
			if (i_36_ != Class110.anInt1433)
			    class23_sub4_sub1
				= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				   [i_36_]);
			else
			    class23_sub4_sub1
				= Class166.aClass23_Sub4_Sub1_Sub2_2216;
		    } else {
			int i_37_ = i_25_ - 1;
			i_34_ = i_37_ >> -2004019253 & 0xf;
			int i_38_ = i_37_ & 0x7ff;
			class23_sub4_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_38_]);
		    }
		    if (class23_sub4_sub1 != null) {
			Class72 class72 = class23_sub4_sub1.method344(124);
			if (class72.anIntArrayArray979 != null
			    && class72.anIntArrayArray979[i_34_] != null) {
			    int i_39_ = class72.anIntArrayArray979[i_34_][0];
			    int i_40_ = class72.anIntArrayArray979[i_34_][2];
			    int i_41_ = class23_sub4_sub1.aClass171_5297
					    .method2441((byte) 127);
			    int i_42_ = Class31.anIntArray434[i_41_];
			    int i_43_ = Class31.anIntArray425[i_41_];
			    int i_44_ = (i_40_ * i_42_ - -(i_43_ * i_39_)
					 >> 625283919);
			    i_40_ = (i_40_ * i_43_ + -(i_42_ * i_39_)
				     >> -1885787185);
			    i_39_ = i_44_;
			    i_22_ += i_40_;
			    i_28_ -= class72.anIntArrayArray979[i_34_][1];
			    i_21_ += i_39_;
			}
		    }
		}
		Class23_Sub4_Sub2 class23_sub4_sub2
		    = (new Class23_Sub4_Sub2
		       (i_27_, Class29.anInt300, i_21_, i_22_,
			(RuntimeException_Sub1.method2833(i_22_, -46, i_21_,
							  Class29.anInt300)
			 + -i_28_),
			i_30_ - -Class125.anInt1632,
			Class125.anInt1632 + i_31_, i_32_, i_33_, i_26_,
			i_29_));
		class23_sub4_sub2.method373
		    (Class125.anInt1632 + i_30_, 7403,
		     (-i_29_
		      + RuntimeException_Sub1.method2833(i_24_, -70, i_23_,
							 Class29.anInt300)),
		     i_23_, i_24_);
		Class53.aClass119_703.method1018
		    ((byte) -124, new Class131_Sub41_Sub2(class23_sub4_sub2));
	    }
	} else if (Class131_Sub35.anInt4583 == 212) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(66);
	    int i_45_ = (((0xf3 & i) >> -672776988)
			 + Class131_Sub41_Sub19.anInt6418 * 2);
	    int i_46_ = (i & 0xf) + 2 * Class131_Sub37.anInt4609;
	    int i_47_ = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readSignedByte((byte) 127)
			 + i_45_);
	    int i_48_ = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readSignedByte((byte) 127)
			 + i_46_);
	    int i_49_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readSignedShort(arg0 + 1625555037);
	    int i_50_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(arg0 + 8197);
	    int i_51_
		= (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(65)
		   * 4);
	    int i_52_
		= (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-60)
		   * 4);
	    int i_53_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(arg0 ^ ~0x1ff4);
	    int i_54_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104);
	    int i_55_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-67);
	    if (i_55_ == 255)
		i_55_ = -1;
	    int i_56_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-33);
	    if ((i_45_ ^ 0xffffffff) <= -1 && (i_46_ ^ 0xffffffff) <= -1
		&& i_45_ < 208 && (i_46_ ^ 0xffffffff) > -209
		&& (i_47_ ^ 0xffffffff) <= -1 && i_48_ >= 0
		&& (i_47_ ^ 0xffffffff) > -209 && i_48_ < 208
		&& (i_50_ ^ 0xffffffff) != -65536) {
		i_48_ = 64 * i_48_;
		i_46_ = 64 * i_46_;
		i_47_ *= 64;
		i_45_ = 64 * i_45_;
		Class23_Sub4_Sub2 class23_sub4_sub2
		    = (new Class23_Sub4_Sub2
		       (i_50_, Class29.anInt300, i_45_, i_46_,
			(RuntimeException_Sub1.method2833(i_46_, 93, i_45_,
							  Class29.anInt300)
			 - i_51_),
			i_53_ + Class125.anInt1632, i_54_ + Class125.anInt1632,
			i_55_, i_56_, i_49_, i_52_));
		class23_sub4_sub2.method373
		    (Class125.anInt1632 + i_53_, 7403,
		     (RuntimeException_Sub1.method2833(i_48_, 107, i_47_,
						       Class29.anInt300)
		      + -i_52_),
		     i_47_, i_48_);
		Class53.aClass119_703.method1018
		    ((byte) -123, new Class131_Sub41_Sub2(class23_sub4_sub2));
	    }
	} else {
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -7) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByteS(14684);
		int i_57_ = (((i & 0x73) >> 1276234372)
			     + Class131_Sub41_Sub19.anInt6418);
		int i_58_ = Class131_Sub37.anInt4609 + (i & 0x7);
		byte i_59_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByteC((byte) -99);
		int i_60_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShortA(false);
		int i_61_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readSignedLEShortA(65536);
		byte i_62_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .method1731(252);
		byte i_63_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByteC((byte) 75);
		byte i_64_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByteS(-6266);
		int i_65_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_66_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShortA(false);
		int i_67_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByteS(14684);
		int i_68_ = i_67_ >> -1256942302;
		int i_69_ = 0x3 & i_67_;
		if (!Class183_Sub1.aClass130_4960.method1223())
		    Class131_Sub2_Sub31.method1621(i_57_, i_64_, i_59_, i_65_,
						   true, i_61_, i_66_, i_58_,
						   i_68_, i_69_, i_63_, i_62_,
						   i_60_);
	    }
	    if (Class131_Sub35.anInt4583 == 221) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByteS(14684);
		int i_70_ = (Class131_Sub41_Sub19.anInt6418
			     - -((i & 0x76) >> -537289532));
		int i_71_ = Class131_Sub37.anInt4609 + (i & 0x7);
		int i_72_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(arg0 ^ ~0x1ff4);
		if ((i_70_ ^ 0xffffffff) <= -1 && (i_71_ ^ 0xffffffff) <= -1
		    && ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			< (i_70_ ^ 0xffffffff))
		    && (i_71_ ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
					       ^ 0xffffffff)) {
		    Class131_Sub10 class131_sub10
			= ((Class131_Sub10)
			   (Class131_Sub24.aClass180_4468.method2521
			    (-93,
			     (long) (i_70_ | (Class29.anInt300 << 994355612
					      | i_71_ << -2132180882)))));
		    if (class131_sub10 != null) {
			for (Class131_Sub18 class131_sub18
				 = (Class131_Sub18) class131_sub10
							.aClass119_4226
							.method1007(0);
			     class131_sub18 != null;
			     class131_sub18
				 = ((Class131_Sub18)
				    class131_sub10.aClass119_4226
					.method1014(arg0 ^ ~0x5c))) {
			    if ((0x7fff & i_72_ ^ 0xffffffff)
				== (class131_sub18.anInt4384 ^ 0xffffffff)) {
				class131_sub18.method1355((byte) 123);
				break;
			    }
			}
			if (class131_sub10.aClass119_4226.method1015(-81))
			    class131_sub10.method1355((byte) 119);
			Class131.method1354(i_71_, -67, Class29.anInt300,
					    i_70_);
		    }
		}
	    } else if (Class131_Sub35.anInt4583 == 27) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByteA((byte) 111);
		int i_73_
		    = (i >> -312589884 & 0x7) + Class131_Sub41_Sub19.anInt6418;
		int i_74_ = Class131_Sub37.anInt4609 + (0x7 & i);
		int i_75_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByteC(4095);
		int i_76_ = i_75_ >> 1398192418;
		int i_77_ = 0x3 & i_75_;
		int i_78_ = Class23_Sub4_Sub1.anIntArray5244[i_76_];
		if (i_73_ >= 0 && (i_74_ ^ 0xffffffff) <= -1
		    && Class131_Sub41_Sub11_Sub1.anInt6546 > i_73_
		    && i_74_ < Class131_Sub2_Sub26.anInt5931)
		    Stream.method1753(i_76_, i_73_, -1, i_78_, i_74_,
					      -29403, i_77_, 0,
					      Class29.anInt300, -1);
	    } else if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -224) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByte(arg0 ^ 0x31);
		int i_79_ = (Class131_Sub41_Sub19.anInt6418
			     + ((0x7c & i) >> 1243213668));
		int i_80_ = Class131_Sub37.anInt4609 - -(0x7 & i);
		int i_81_ = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByte((byte) 127)
			     + i_79_);
		int i_82_
		    = i_80_ - -Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				   .readSignedByte((byte) 127);
		int i_83_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readSignedShort(1625554944);
		int i_84_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_85_ = 4 * Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByte(76);
		int i_86_ = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-28)
			     * 4);
		int i_87_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_88_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(arg0 ^ ~0x1ff4);
		int i_89_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-97);
		if ((i_89_ ^ 0xffffffff) == -256)
		    i_89_ = -1;
		int i_90_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(109);
		if ((i_79_ ^ 0xffffffff) <= -1 && i_80_ >= 0
		    && ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			< (i_79_ ^ 0xffffffff))
		    && (i_80_ ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
					       ^ 0xffffffff)
		    && i_81_ >= 0 && i_82_ >= 0
		    && i_81_ < Class131_Sub41_Sub11_Sub1.anInt6546
		    && i_82_ < Class131_Sub2_Sub26.anInt5931
		    && (i_84_ ^ 0xffffffff) != -65536) {
		    i_80_ = 128 * i_80_ + 64;
		    i_81_ = 128 * i_81_ - -64;
		    i_82_ = i_82_ * 128 - -64;
		    i_79_ = 128 * i_79_ - -64;
		    Class23_Sub4_Sub2 class23_sub4_sub2
			= new Class23_Sub4_Sub2(i_84_, Class29.anInt300, i_79_,
						i_80_,
						-i_85_ + (RuntimeException_Sub1
							      .method2833
							  (i_80_, 97, i_79_,
							   Class29.anInt300)),
						i_87_ + Class125.anInt1632,
						Class125.anInt1632 + i_88_,
						i_89_, i_90_, i_83_, i_86_);
		    class23_sub4_sub2.method373
			(Class125.anInt1632 + i_87_, arg0 + 7496,
			 (RuntimeException_Sub1.method2833(i_82_, -35, i_81_,
							   Class29.anInt300)
			  + -i_86_),
			 i_81_, i_82_);
		    Class53.aClass119_703.method1018
			((byte) -128,
			 new Class131_Sub41_Sub2(class23_sub4_sub2));
		}
	    } else if (Class131_Sub35.anInt4583 == 155) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByte(-78);
		int i_91_
		    = (0x7 & i >> 763211908) + Class131_Sub41_Sub19.anInt6418;
		int i_92_ = (0x7 & i) + Class131_Sub37.anInt4609;
		int i_93_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		if (i_93_ == 65535)
		    i_93_ = -1;
		int i_94_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(arg0 ^ ~0x7);
		int i_95_ = 0xf & i_94_ >> -1221982204;
		int i_96_ = i_94_ & 0x7;
		int i_97_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-27);
		int i_98_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-11);
		if (i_91_ >= 0 && (i_92_ ^ 0xffffffff) <= -1
		    && ((i_91_ ^ 0xffffffff)
			> (Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff))
		    && Class131_Sub2_Sub26.anInt5931 > i_92_) {
		    int i_99_ = 1 + i_95_;
		    if (((i_91_ + -i_99_ ^ 0xffffffff)
			 >= ((Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0])
			     ^ 0xffffffff))
			&& ((Class166.aClass23_Sub4_Sub1_Sub2_2216
			     .anIntArray5328[0])
			    ^ 0xffffffff) >= (i_91_ - -i_99_ ^ 0xffffffff)
			&& -i_99_ + i_92_ <= (Class166
					      .aClass23_Sub4_Sub1_Sub2_2216
					      .anIntArray5331[0])
			&& (Class166.aClass23_Sub4_Sub1_Sub2_2216
			    .anIntArray5331[0]) <= i_99_ + i_92_
			&& InputStream_Sub1.anInt55 != 0 && i_96_ > 0
			&& Class57.anInt746 < 50
			&& (i_93_ ^ 0xffffffff) != 0) {
			Class154.anIntArray2056[Class57.anInt746] = i_93_;
			Class69.anIntArray928[Class57.anInt746] = i_96_;
			Class119.anIntArray1556[Class57.anInt746] = i_97_;
			Class23_Sub3.aClass16Array3723[Class57.anInt746]
			    = null;
			InputStream_Sub1.anIntArray58[Class57.anInt746]
			    = ((i_92_ << 236153064) + (i_91_ << -1800679152)
			       + i_95_);
			Class46_Sub1.anIntArray3805[Class57.anInt746] = i_98_;
			Class57.anInt746++;
		    }
		}
	    } else if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -250) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByte(102);
		int i_100_
		    = (i >> 1588225476 & 0x7) + Class131_Sub41_Sub19.anInt6418;
		int i_101_ = Class131_Sub37.anInt4609 + (0x7 & i);
		int i_102_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(arg0 + 8197);
		int i_103_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(arg0 ^ ~0x4);
		int i_104_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (i_100_ >= 0 && (i_101_ ^ 0xffffffff) <= -1
		    && ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			< (i_100_ ^ 0xffffffff))
		    && (i_101_ ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
						^ 0xffffffff)) {
		    int i_105_ = 128 * i_100_ - -64;
		    int i_106_ = 64 + 128 * i_101_;
		    Class23_Sub4_Sub4 class23_sub4_sub4
			= (new Class23_Sub4_Sub4
			   (i_102_, i_104_, Class125.anInt1632,
			    Class29.anInt300, i_105_,
			    (-i_103_
			     + RuntimeException_Sub1.method2833(i_106_, 119,
								i_105_,
								(Class29
								 .anInt300))),
			    i_106_, i_100_, i_100_, i_101_, i_101_));
		    Class131_Sub2_Sub9.aClass119_5676.method1018
			((byte) -123,
			 new Class131_Sub41_Sub3(class23_sub4_sub4));
		}
	    } else if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -113) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedShort(8104);
		int i_107_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteC(4095);
		int i_108_ = (Class131_Sub41_Sub19.anInt6418
			      - -(0x7 & i_107_ >> 1644011972));
		int i_109_ = (0x7 & i_107_) + Class131_Sub37.anInt4609;
		int i_110_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_111_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		if (i_108_ >= 0 && i_109_ >= 0
		    && ((i_108_ ^ 0xffffffff)
			> (Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff))
		    && i_109_ < Class131_Sub2_Sub26.anInt5931
		    && (i ^ 0xffffffff) != (Class110.anInt1433 ^ 0xffffffff)) {
		    Class147.method2174(Class29.anInt300, i_109_, i_108_,
					(byte) -55,
					new Class131_Sub18(i_110_, i_111_));
		    Class131.method1354(i_109_, 54, Class29.anInt300, i_108_);
		}
	    } else if (Class131_Sub35.anInt4583 == 82) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByte(54);
		int i_112_ = (((i & 0x71) >> -1796831036)
			      + Class131_Sub41_Sub19.anInt6418);
		int i_113_ = (i & 0x7) + Class131_Sub37.anInt4609;
		int i_114_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_115_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_116_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(arg0 + 8197);
		if (Class131_Sub24.aClass180_4468 != null
		    && (i_112_ ^ 0xffffffff) <= -1 && i_113_ >= 0
		    && i_112_ < Class131_Sub41_Sub11_Sub1.anInt6546
		    && (i_113_ ^ 0xffffffff) > (Class131_Sub2_Sub26.anInt5931
						^ 0xffffffff)) {
		    Class131_Sub10 class131_sub10
			= ((Class131_Sub10)
			   (Class131_Sub24.aClass180_4468.method2521
			    (122, (long) (i_113_ << 875162062
					  | Class29.anInt300 << -692783108
					  | i_112_))));
		    if (class131_sub10 != null) {
			for (Class131_Sub18 class131_sub18
				 = ((Class131_Sub18)
				    class131_sub10.aClass119_4226
					.method1007(arg0 ^ ~0x5c));
			     class131_sub18 != null;
			     class131_sub18
				 = ((Class131_Sub18)
				    class131_sub10.aClass119_4226
					.method1014(arg0 ^ ~0x5c))) {
			    if (((0x7fff & i_114_ ^ 0xffffffff)
				 == (class131_sub18.anInt4384 ^ 0xffffffff))
				&& i_115_ == class131_sub18.anInt4379) {
				class131_sub18.method1355((byte) 114);
				class131_sub18.anInt4379 = i_116_;
				Class147.method2174(Class29.anInt300, i_113_,
						    i_112_, (byte) -55,
						    class131_sub18);
				break;
			    }
			}
			Class131.method1354(i_113_, 121, Class29.anInt300,
					    i_112_);
		    }
		}
	    } else {
		if (arg0 != -93)
		    aBoolean5532 = true;
		if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -255) {
		    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		    if ((i ^ 0xffffffff) == -65536)
			i = -1;
		    int i_117_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedByte(arg0 ^ ~0x13);
		    int i_118_ = i_117_ >> 1327661090;
		    int i_119_ = i_117_ & 0x3;
		    int i_120_ = Class23_Sub4_Sub1.anIntArray5244[i_118_];
		    int i_121_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedByteA((byte) -102);
		    int i_122_ = (Class131_Sub41_Sub19.anInt6418
				  - -(0x7 & i_121_ >> 602229956));
		    int i_123_ = (0x7 & i_121_) + Class131_Sub37.anInt4609;
		    OutputStream_Sub1.method92(8230, i, i_118_,
					       Class29.anInt300, i_123_,
					       i_119_, i_120_, i_122_);
		} else if (Class131_Sub35.anInt4583 == 78) {
		    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		    int i_124_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedByte(-81);
		    Class55.method612(i, 124).method2566(i_124_, (byte) 40);
		}
	    }
	}
    }
    
    public Class131_Sub1 method1357() {
	try {
	    anInt5547++;
	    Class131_Sub11 class131_sub11;
	    do {
		class131_sub11 = (Class131_Sub11) aClass119_5543.method1014(0);
		if (class131_sub11 == null)
		    return null;
	    } while (class131_sub11.aClass131_Sub1_Sub2_4232 == null);
	    return class131_sub11.aClass131_Sub1_Sub2_4232;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pj.L(" + ')');
	}
    }
    
    public void method1360(int arg0) {
	try {
	    aClass131_Sub1_Sub3_5550.method1360(arg0);
	    anInt5536++;
	    Class131_Sub11 class131_sub11
		= (Class131_Sub11) aClass119_5543.method1007(0);
	while_76_:
	    for (/**/; class131_sub11 != null;
		 class131_sub11
		     = (Class131_Sub11) aClass119_5543.method1014(0)) {
		if (!aClass131_Sub1_Sub1_5539.method1385(class131_sub11,
							 (byte) 50)) {
		    int i = arg0;
		    while ((i ^ 0xffffffff)
			   < (class131_sub11.anInt4255 ^ 0xffffffff)) {
			method1451((byte) 13, class131_sub11.anInt4255,
				   class131_sub11);
			i -= class131_sub11.anInt4255;
			if (aClass131_Sub1_Sub1_5539.method1367(class131_sub11,
								0, i, null,
								(byte) -30))
			    continue while_76_;
		    }
		    method1451((byte) 13, i, class131_sub11);
		    class131_sub11.anInt4255 -= i;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pj.F(" + arg0 + ')');
	}
    }
    
    public Class131_Sub1 method1359() {
	try {
	    anInt5548++;
	    Class131_Sub11 class131_sub11
		= (Class131_Sub11) aClass119_5543.method1007(0);
	    if (class131_sub11 == null)
		return null;
	    if (class131_sub11.aClass131_Sub1_Sub2_4232 != null)
		return class131_sub11.aClass131_Sub1_Sub2_4232;
	    return method1357();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pj.S(" + ')');
	}
    }
    
    public int method1362() {
	try {
	    anInt5534++;
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pj.JA(" + ')');
	}
    }
    
    public Class131_Sub1_Sub4(Class131_Sub1_Sub1 arg0) {
	try {
	    aClass131_Sub1_Sub1_5539 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pj.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
