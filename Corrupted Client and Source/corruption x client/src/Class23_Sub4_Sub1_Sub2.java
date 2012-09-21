/* Class23_Sub4_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class Class23_Sub4_Sub1_Sub2 extends Class23_Sub4_Sub1
{ //player update
    public String aString6491;
    public int anInt6492 = -1;
    public static int anInt6493;
    public static int anInt6494;
    public int anInt6495;
    public static int anInt6496;
    public byte aByte6497;
    public int anInt6498;
    public static int anInt6499;
    public static int anInt6500;
    public int anInt6501;
    public static int anInt6502;
    public static int anInt6503;
    public static int anInt6504;
    public static int[] anIntArray6505 = new int[99];
    public static int anInt6506;
    public byte aByte6507;
    public int anInt6508 = -1;
    public int anInt6509 = -1;
    public boolean aBoolean6510;
    public static int anInt6511;
    public static int anInt6512;
    public Class188 aClass188_6513;
    public static int anInt6514;
    public int anInt6515;
    public int anInt6516;
    public int anInt6517;
    public static int anInt6518;
    public int anInt6519;
    public static Class173 aClass173_6520;
    public static int anInt6521;
    public int anInt6522;
    public static int anInt6523;
    public static int anInt6524;
    public static int anInt6525;
    public static int anInt6526;
    public int anInt6527;
    public static int anInt6528;
    public int anInt6529;
    public int anInt6530;
    public String aString6531;
    public static int[][] anIntArrayArray6532;
    
    public boolean method356(int arg0, int arg1, Class130 arg2) {
	try {
	    anInt6499++;
	    int i = arg1;
	    Class72 class72 = this.method344(106);
	    Class161 class161
		= (((anInt5247 ^ 0xffffffff) == 0
		    || (anInt5256 ^ 0xffffffff) != -1)
		   ? null : Class145.method2159(anInt5247, (byte) -109));
	    Class161 class161_0_
		= ((anInt5254 == -1 || aBoolean6510
		    || aBoolean5261 && class161 != null)
		   ? null : Class145.method2159(anInt5254, (byte) -111));
	    int i_1_ = class72.anInt973;
	    int i_2_ = class72.anInt975;
	    if (i_1_ != 0 || (i_2_ ^ 0xffffffff) != -1 || class72.anInt956 != 0
		|| class72.anInt965 != 0)
		arg1 |= 0x7;
	    aClass154Array5329[0]
		= aClass188_6513.method2595(anInt5305, anInt5248, anInt5304,
					    anInt5258, arg2, class161_0_,
					    anInt5235, (byte) -103, arg1,
					    aClass141Array5313, class161,
					    anInt5237, true);
	    int i_3_ = Class131.method1351(-32251);
	    if (Class1_Sub4.anInt3554 < 96 && i_3_ > 50)
		Class23_Sub4.method326(127);
	    if ((Class214.anInt3138 ^ 0xffffffff) == -1 || i_3_ >= 50) {
		if ((Class214.anInt3138 ^ 0xffffffff) != -1) {
		    Class131_Sub41_Sub19.aByteArrayArray6412 = new byte[50][];
		    Class131_Sub41.anInt4672 = 0;
		}
	    } else {
		int i_4_;
		for (i_4_ = -i_3_ + 50; Class131_Sub41.anInt4672 < i_4_;
		     Class131_Sub41.anInt4672++)
		    Class131_Sub41_Sub19.aByteArrayArray6412[(Class131_Sub41
							      .anInt4672)]
			= new byte[102400];
		while (Class131_Sub41.anInt4672 > i_4_) {
		    Class131_Sub41.anInt4672--;
		    Class131_Sub41_Sub19.aByteArrayArray6412[(Class131_Sub41
							      .anInt4672)]
			= null;
		}
	    }
	    if (aClass154Array5329[0] == null)
		return false;
	    anInt5264 = aClass154Array5329[0].method2256();
	    this.method341(14889, aClass154Array5329[0]);
	    if (arg0 <= 61)
		method323(-30);
	    int i_5_ = aClass171_5297.method2441((byte) -51);
	    anInt5275 = 0;
	    anInt5252 = 0;
	    anInt5236 = 0;
	    if (i_1_ != 0 || i_2_ != 0) {
		this.method336(i_2_, 2, i_1_, i_5_);
		if ((anInt5252 ^ 0xffffffff) != -1)
		    aClass154Array5329[0].method2288(anInt5252);
		if ((anInt5275 ^ 0xffffffff) != -1)
		    aClass154Array5329[0].method2251(anInt5275);
		if ((anInt5236 ^ 0xffffffff) != -1)
		    aClass154Array5329[0].method2272(0, anInt5236, 0);
	    } else
		this.method336(method335((byte) -34) << 2047716935, 2,
			       method335((byte) -99) << 1447735047, i_5_);
	    aClass154Array5329[1] = null;
	    if (!aBoolean6510 && anInt5253 != -1
		&& (anInt5262 ^ 0xffffffff) != 0) {
		Class112 class112 = Class151.method2194(anInt5253, -6861);
		Class154 class154
		    = class112.method956(-1, anInt5262, anInt5288, anInt5251,
					 (!class112.aBoolean1442 ? 2 : 7) | i,
					 arg2);
		if (class154 != null) {
		    class154.method2272(0, -anInt5286, 0);
		    if (class112.aBoolean1442
			&& (i_1_ != 0 || (i_2_ ^ 0xffffffff) != -1)) {
			if (anInt5252 != 0)
			    class154.method2288(anInt5252);
			if ((anInt5275 ^ 0xffffffff) != -1)
			    class154.method2251(anInt5275);
			if ((anInt5236 ^ 0xffffffff) != -1)
			    class154.method2272(0, anInt5236, 0);
		    }
		    aClass154Array5329[1] = class154;
		}
	    }
	    aClass154Array5329[2] = null;
	    if (!aBoolean6510 && anInterface6_5333 != null) {
		if ((Class125.anInt1632 ^ 0xffffffff)
		    <= (anInt5332 ^ 0xffffffff))
		    anInterface6_5333 = null;
		if ((Class125.anInt1632 ^ 0xffffffff) <= (anInt5324
							  ^ 0xffffffff)
		    && Class125.anInt1632 < anInt5332) {
		    Class154 class154
			= anInterface6_5333.method18((byte) -108, i | 0x7,
						     arg2);
		    if (class154 != null) {
			class154.method2272(anInt5327 + -anInt3733,
					    anInt5325 - anInt3746,
					    -anInt3747 + anInt5323);
			if (i_5_ != 0)
			    class154.method2264(0x3fff & -i_5_);
			aClass154Array5329[2] = class154;
		    }
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.K(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void renderPlayer(Stream arg0, int arg1) {
	anInt6496++;
	arg0.offset = 0;
	int i = arg0.readUnsignedByte(56);
	int i_6_ = i & 0x1;
	boolean bool = (0x2 & i ^ 0xffffffff) != -1;
	boolean bool_7_ = (0x4 & i) != 0;
	int i_8_ = super.method335((byte) -75);
	this.method340(true, (i >> -1549427869 & 0x7) - -1);
	aByte6507 = (byte) ((i & 0xeb) >> 888773382);
	anInt3733 += (method335((byte) -87) - i_8_) * 64;
	anInt3747 += (-i_8_ + method335((byte) -56)) * 64;
	if (arg1 >= -27)
	    method360(72, (byte) 37, 72, 61);
	aByte6497 = arg0.readSignedByte((byte) 127);
	anInt6529 = arg0.readSignedByte((byte) 127);
	anInt6509 = arg0.readSignedByte((byte) 127);
	anInt6530 = 0;
	int i_9_ = -1;
	int[] is = new int[12];
	for (int i_10_ = 0; i_10_ < 12; i_10_++) {
	    int i_11_ = arg0.readUnsignedByte(-80);
	    if (i_11_ == 0)
		is[i_10_] = 0;
	    else {
		int i_12_ = arg0.readUnsignedByte(98);
		int i_13_ = (i_11_ << 979933224) + i_12_;
		if (i_10_ == 0 && i_13_ == 65535) {
		    i_9_ = arg0.readUnsignedShort(8104);
		    anInt6530 = arg0.readUnsignedByte(79);
		    break;
		}
		if ((i_13_ ^ 0xffffffff) <= -32769) {
		    i_13_ = Class135.anIntArray1815[i_13_ + -32768];
		    is[i_10_] = Cryption.method2105(i_13_, 1073741824);
		    int i_14_
			= Class131_Sub19.method1808(i_13_, false).anInt295;
		    if (i_14_ != 0)
			anInt6530 = i_14_;
		} else
		    is[i_10_] = Cryption.method2105(-256 + i_13_, -2147483648);
	    }
	}
	int[] is_15_ = new int[5];
	for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -6; i_16_++) {
	    int i_17_ = arg0.readUnsignedByte(-50);
	    if ((i_17_ ^ 0xffffffff) > -1
		|| (Class131_Sub41_Sub5.aShortArrayArray6233[i_16_].length
		    ^ 0xffffffff) >= (i_17_ ^ 0xffffffff))
		i_17_ = 0;
	    is_15_[i_16_] = i_17_;
	}
	anInt6527 = arg0.readUnsignedShort(8104);
	aString6531 = arg0.readString(false);
	if (!bool)
	    aString6491 = aString6531;
	else
	    aString6491 = arg0.readString(false);
	anInt6515 = arg0.readUnsignedByte(-90);
	if (!bool_7_) {
	    anInt6498 = 0;
	    anInt6522 = arg0.readUnsignedByte(125);
	    anInt6492 = arg0.readUnsignedByte(-127);
	    if (anInt6492 == 255)
		anInt6492 = -1;
	} else {
	    anInt6498 = arg0.readUnsignedShort(8104);
	    anInt6522 = anInt6515;
	    anInt6492 = -1;
	}
	int i_18_ = anInt6517;
	anInt6517 = arg0.readUnsignedByte(-113);
	if (anInt6517 != 0) {
	    int i_19_ = anInt6501;
	    int i_20_ = anInt6519;
	    int i_21_ = anInt6508;
	    int i_22_ = anInt6516;
	    int i_23_ = anInt6495;
	    anInt6501 = arg0.readUnsignedShort(8104);
	    anInt6519 = arg0.readUnsignedShort(8104);
	    anInt6508 = arg0.readUnsignedShort(8104);
	    anInt6516 = arg0.readUnsignedShort(8104);
	    anInt6495 = arg0.readUnsignedByte(109);
	    if ((anInt6517 ^ 0xffffffff) != (i_18_ ^ 0xffffffff)
		|| (anInt6501 ^ 0xffffffff) != (i_19_ ^ 0xffffffff)
		|| (anInt6519 ^ 0xffffffff) != (i_20_ ^ 0xffffffff)
		|| i_21_ != anInt6508
		|| (anInt6516 ^ 0xffffffff) != (i_22_ ^ 0xffffffff)
		|| (anInt6495 ^ 0xffffffff) != (i_23_ ^ 0xffffffff))
		Class151.method2193(true, this);
	} else
	    OutputStream_Sub1.method90(this, 4);
	if (aClass188_6513 == null)
	    aClass188_6513 = new Class188();
	int i_24_ = aClass188_6513.anInt2746;
	int[] is_25_ = aClass188_6513.anIntArray2756;
	aClass188_6513.method2592(i_9_, is, (byte) 96, i_6_ == 1,
				  method332((byte) -126), is_15_);
	if (i_9_ != i_24_) {
	    anInt3733 = 128 * anIntArray5328[0] + 64 * method335((byte) -44);
	    anInt3747 = anIntArray5331[0] * 128 + method335((byte) -74) * 64;
	}
	if ((anInt5274 ^ 0xffffffff) == -2048 && is_25_ != null) {
	    for (int i_26_ = 0;
		 (i_26_ ^ 0xffffffff) > (is_15_.length ^ 0xffffffff);
		 i_26_++) {
		if (is_25_[i_26_] != is_15_[i_26_]) {
		    Class23_Sub4_Sub4.method382(false);
		    break;
		}
	    }
	}
	if (aClass1_Sub6_5316 != null)
	    aClass1_Sub6_5316.method121();
	if (anInt5254 != -1 && aBoolean5261) {
	    Class72 class72 = this.method344(95);
	    if (!class72.method750(anInt5254, -28)) {
		anInt5254 = -1;
		aBoolean5261 = false;
	    }
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    anInt6502++;
	    if (arg0 != -115)
		aClass173_6520 = null;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.D(" + arg0 + ')');
	}
    }
    
    public int method335(byte arg0) {
	try {
	    anInt6521++;
	    if (aClass188_6513 != null
		&& (aClass188_6513.anInt2746 ^ 0xffffffff) != 0)
		return (Class131_Sub41_Sub7.method1971
			(aClass188_6513.anInt2746, 48).anInt839);
	    if (arg0 > -29)
		method360(-72, (byte) -10, 7, -41);
	    return super.method335((byte) -61);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.FA(" + arg0 + ')');
	}
    }
    
    public void method358(boolean arg0, boolean arg1, int arg2, int arg3,
			  int arg4) {
	try {
	    if (arg1 != true)
		anInt6508 = -84;
	    anInt6500++;
	    super.method328(arg4, arg0, 16383, method335((byte) -96), arg3,
			    arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.O(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public int method323(int arg0) {
	try {
	    anInt6523++;
	    if (arg0 >= -7)
		method359(false);
	    return anInt5264;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.UA(" + arg0 + ')');
	}
    }
    
    public boolean method359(boolean arg0) {
	try {
	    anInt6504++;
	    if (aClass188_6513 == null)
		return false;
	    if (arg0 != false)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.L(" + arg0 + ')');
	}
    }
    
    public void method295(int arg0) {
	try {
	    anInt6506++;
	    if (arg0 != 0)
		method332((byte) -58);
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.E(" + arg0 + ')');
	}
    }
    
    public int method346(byte arg0) {
	try {
	    if (arg0 != 115)
		anInt6519 = 1;
	    anInt6494++;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.NA(" + arg0 + ')');
	}
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt6511++;
	    if (aClass188_6513 == null || !method356(101, 1024, arg0))
		return null;
	    Class9 class9 = arg0.method1238();
	    int i = aClass171_5297.method2441((byte) 127);
	    class9.method177(i);
	    class9.method174(anInt3733, anInt3746, anInt3747);
	    float f = arg0.method1162();
	    float f_27_ = arg0.method1239();
	    if (Class121.aBoolean1588) {
		Class72 class72 = this.method344(97);
		if (class72.aBoolean978
		    && ((aClass188_6513.anInt2746 ^ 0xffffffff) == 0
			|| (Class131_Sub41_Sub7.method1971
			    (aClass188_6513.anInt2746, 91).aBoolean857))) {
		    Class161 class161
			= (anInt5247 != -1 && (anInt5256 ^ 0xffffffff) == -1
			   ? Class145.method2159(anInt5247, (byte) -120)
			   : null);
		    Class161 class161_28_
			= (((anInt5254 ^ 0xffffffff) == 0 || aBoolean6510
			    || aBoolean5261 && class161 != null)
			   ? null
			   : Class145.method2159(anInt5254, (byte) -93));
		    Class154 class154
			= (Class131_Sub2_Sub27.method1601
			   (0, arg0,
			    class161_28_ != null ? class161_28_ : class161,
			    240, anInt5236, i, aBoolean5309,
			    class161_28_ == null ? anInt5248 : anInt5235,
			    aClass154Array5329[0], anInt5252, anInt5275, 0, 1,
			    160, (byte) 22));
		    if (class154 != null) {
			arg0.method1252(f, -128.0F + f_27_);
			arg0.method1177(false);
			class154.method2261(class9, null, 0);
			arg0.method1177(true);
		    }
		}
	    }
	    if (this == Class166.aClass23_Sub4_Sub1_Sub2_2216) {
		arg0.method1252(f, -144.0F + f_27_);
		class9.method181(anInt3733, anInt3746, anInt3747);
		for (int i_29_
			 = Class131_Sub2_Sub5.aClass87Array5612.length - 1;
		     i_29_ >= 0; i_29_--) {
		    Class87 class87
			= Class131_Sub2_Sub5.aClass87Array5612[i_29_];
		    if (class87 != null && class87.anInt1139 != -1) {
			if (class87.anInt1135 == 1
			    && (class87.anInt1126 ^ 0xffffffff) <= -1
			    && ((class87.anInt1126 ^ 0xffffffff)
				> ((Class23_Sub4_Sub2
				    .aClass23_Sub4_Sub1_Sub1Array5379).length
				   ^ 0xffffffff))) {
			    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				= (Class23_Sub4_Sub2
				   .aClass23_Sub4_Sub1_Sub1Array5379
				   [class87.anInt1126]);
			    if (class23_sub4_sub1_sub1 != null) {
				int i_30_
				    = (-((Class166.aClass23_Sub4_Sub1_Sub2_2216
					  .anInt3733)
					 / 32)
				       + (class23_sub4_sub1_sub1.anInt3733
					  / 32));
				int i_31_
				    = (-((Class166.aClass23_Sub4_Sub1_Sub2_2216
					  .anInt3747)
					 / 32)
				       + (class23_sub4_sub1_sub1.anInt3747
					  / 32));
				method362(aClass154Array5329[0], 0, arg0,
					  class87.anInt1139, i_30_, i_31_,
					  360000, class9);
			    }
			}
			if ((class87.anInt1135 ^ 0xffffffff) == -3) {
			    int i_32_
				= (-((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt3733)
				     / 32)
				   + (((class87.anInt1127 - Class92.regionX)
				       * 4)
				      + 2));
			    int i_33_ = 2 + (4 * (class87.anInt1137
						  + -Class64.regionY)
					     + -((Class166
						  .aClass23_Sub4_Sub1_Sub2_2216
						  .anInt3747)
						 / 32));
			    int i_34_ = 4 * class87.anInt1134;
			    i_34_ *= i_34_;
			    method362(aClass154Array5329[0], 0, arg0,
				      class87.anInt1139, i_32_, i_33_, i_34_,
				      class9);
			}
			if ((class87.anInt1135 ^ 0xffffffff) == -11
			    && class87.anInt1126 >= 0
			    && (((Class105
				  .aClass23_Sub4_Sub1_Sub2Array1373).length
				 ^ 0xffffffff)
				< (class87.anInt1126 ^ 0xffffffff))) {
			    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
				= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				   [class87.anInt1126]);
			    if (class23_sub4_sub1_sub2 != null) {
				int i_35_
				    = (-((Class166.aClass23_Sub4_Sub1_Sub2_2216
					  .anInt3733)
					 / 32)
				       + (class23_sub4_sub1_sub2.anInt3733
					  / 32));
				int i_36_
				    = (class23_sub4_sub1_sub2.anInt3747 / 32
				       + -((Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .anInt3747)
					   / 32));
				method362(aClass154Array5329[0], 0, arg0,
					  class87.anInt1139, i_35_, i_36_,
					  360000, class9);
			    }
			}
		    }
		}
		class9.method177(i);
		class9.method174(anInt3733, anInt3746, anInt3747);
	    }
	    arg0.method1252(f, f_27_);
	    Class1_Sub2 class1_sub2
		= Class131_Sub41_Sub11.method2003(aClass154Array5329.length,
						  12300);
	    if (aClass1_Sub6_5316 != null) {
		Class105 class105 = aClass1_Sub6_5316.method113();
		arg0.method1234(aClass154Array5329, class105, class9,
				class1_sub2.aClass1_Sub5Array3500,
				(this == Class166.aClass23_Sub4_Sub1_Sub2_2216
				 ? 1 : 0));
	    } else
		arg0.method1196(aClass154Array5329, class9,
				class1_sub2.aClass1_Sub5Array3500,
				(this == Class166.aClass23_Sub4_Sub1_Sub2_2216
				 ? 1 : 0));
	    this.method331((byte) -40, arg0, aClass154Array5329, arg1);
	    if (aClass154Array5329[2] != null) {
		if (i != 0)
		    aClass154Array5329[2].method2264(i);
		aClass154Array5329[2].method2272(anInt3733 + -anInt5327,
						 -anInt5325 + anInt3746,
						 anInt3747 + -anInt5323);
	    }
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method360(int arg0, byte arg1, int arg2, int arg3) {
	try {
	    anInt6512++;
	    int i = arg2 / arg3;
	    int i_37_ = arg3 + -1 & arg2;
	    int i_38_ = arg0 / arg3;
	    int i_39_ = arg0 & -1 + arg3;
	    int i_40_ = Class69.method736(i, arg1 + 6, i_38_);
	    int i_41_ = Class69.method736(1 + i, -1, i_38_);
	    int i_42_ = Class69.method736(i, -1, 1 + i_38_);
	    int i_43_ = Class69.method736(i - -1, -1, 1 + i_38_);
	    int i_44_ = Class131_Sub41_Sub15.method2034(32768, i_40_, arg3,
							i_37_, i_41_);
	    if (arg1 != -7)
		return -75;
	    int i_45_ = Class131_Sub41_Sub15.method2034(arg1 ^ ~0x8006, i_42_,
							arg3, i_37_, i_43_);
	    return Class131_Sub41_Sub15.method2034(32768, i_44_, arg3, i_39_,
						   i_45_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.S(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	try {
	    if (arg1 != 0)
		renderPlayer(null, -124);
	    anInt6514++;
	    if (aClass188_6513 != null
		&& (aBoolean5326 || method356(103, 0, arg0)))
		this.method331((byte) -123, arg0, aClass154Array5329,
			       aBoolean5326);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    anInt6525++;
	    if (arg0 >= -116)
		anInt6498 = 86;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public String method361(boolean arg0, byte arg1) {
	try {
	    if (arg1 != -44)
		anInt6508 = 73;
	    anInt6503++;
	    if (arg0)
		return aString6531;
	    return aString6491;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.RA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method362(Class154 arg0, int arg1, Class130 arg2, int arg3,
			  int arg4, int arg5, int arg6, Class9 arg7) {
	do {
	    try {
		anInt6518++;
		int i = arg4 * arg4 + arg5 * arg5;
		if (i >= 16 && arg6 >= i && arg1 == 0) {
		    int i_46_ = (int) (Math.atan2((double) arg4, (double) arg5)
				       * 2607.5945876176133) & 0x3fff;
		    Class154 class154
			= Class131_Sub2_Sub1.method1473(126, i_46_, anInt5252,
							anInt3747, anInt3733,
							anInt5275, arg0, arg2,
							anInt5236, arg3,
							anInt3746);
		    if (class154 == null)
			break;
		    arg2.method1177(false);
		    class154.method2261(arg7, null, 0);
		    arg2.method1177(true);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("vp.M(" + (arg0 != null ? "{...}" : "null") + ','
			    + arg1 + ',' + (arg2 != null ? "{...}" : "null")
			    + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6
			    + ',' + (arg7 != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
    
    public String method363(boolean arg0, boolean arg1) {
	try {
	    if (arg1 != true)
		aString6491 = null;
	    anInt6493++;
	    String string = "";
	    if (Class155.aStringArray2066 != null)
		string += Class155.aStringArray2066[aByte6507];
	    if (Class104.anIntArray1357 != null
		&& Class104.anIntArray1357[aByte6507] != -1) {
		Class131_Sub41_Sub14 class131_sub41_sub14
		    = Class161.method2396(256,
					  Class104.anIntArray1357[aByte6507]);
		if (class131_sub41_sub14.aChar6345 != 's') {
		    Class45.method563("gdn1", new Throwable(), 0);
		    Class104.anIntArray1357[aByte6507] = -1;
		} else
		    string
			+= class131_sub41_sub14.method2028((byte) -49,
							   aByte6497 & 0xff);
	    }
	    if (!arg0)
		string += aString6491;
	    else
		string += aString6531;
	    if (Class175.aStringArray2506 != null)
		string += Class175.aStringArray2506[aByte6507];
	    return string;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.QA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method364(int arg0) {
	anIntArray6505 = null;
	aClass173_6520 = null;
	anIntArrayArray6532 = null;
	if (arg0 >= -116)
	    method360(15, (byte) 95, -52, -86);
    }
    
    public int method332(byte arg0) {
	try {
	    int i = -109 % ((-66 - arg0) / 59);
	    anInt6528++;
	    return anInt6527;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vp.HA(" + arg0 + ')');
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt6526++;
	    if (arg3 < 12)
		method361(false, (byte) -48);
	    if (aClass188_6513 == null || !method356(78, 65536, arg1))
		return true;
	    Class9 class9 = arg1.method1238();
	    int i = aClass171_5297.method2441((byte) -17);
	    class9.method177(i);
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    for (int i_47_ = 0;
		 ((i_47_ ^ 0xffffffff)
		  > (aClass154Array5329.length ^ 0xffffffff));
		 i_47_++) {
		if (aClass154Array5329[i_47_] != null)
		    return aClass154Array5329[i_47_].method2278(arg2, arg0,
								class9, true);
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static boolean method365(int arg0, int arg1) {
	try {
	    anInt6524++;
	    if ((arg0 ^ 0xffffffff) == -31 || arg0 == 26 || arg0 == 42
		|| arg0 == 31 || (arg0 ^ 0xffffffff) == -3
		|| (arg0 ^ 0xffffffff) == -12 || (arg0 ^ 0xffffffff) == -36
		|| (arg0 ^ 0xffffffff) == -19)
		return true;
	    if ((arg0 ^ 0xffffffff) == -37 || (arg0 ^ 0xffffffff) == -23
		|| (arg0 ^ 0xffffffff) == -1013 || arg0 == 1006)
		return true;
	    if (arg1 < 20)
		return true;
	    if (arg0 == 6 || arg0 == 3 || (arg0 ^ 0xffffffff) == -49
		|| (arg0 ^ 0xffffffff) == -16 || arg0 == 19)
		return true;
	    if ((arg0 ^ 0xffffffff) == -30 || (arg0 ^ 0xffffffff) == -5
		|| arg0 == 40 || (arg0 ^ 0xffffffff) == -35 || arg0 == 38
		|| arg0 == 24)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vp.P(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class23_Sub4_Sub1_Sub2() {
	aByte6497 = (byte) 0;
	anInt6501 = -1;
	anInt6495 = 255;
	aBoolean6510 = false;
	aByte6507 = (byte) 0;
	anInt6517 = 0;
	anInt6498 = 0;
	anInt6515 = 0;
	anInt6516 = -1;
	anInt6519 = -1;
	anInt6529 = -1;
	anInt6522 = 0;
	anInt6530 = 0;
    }
    
    static {
	int i = 0;
	for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > -100; i_48_++) {
	    int i_49_ = i_48_ - -1;
	    int i_50_ = (int) ((double) i_49_
			       + 300.0 * Math.pow(2.0, (double) i_49_ / 7.0));
	    i += i_50_;
	    anIntArray6505[i_48_] = i / 4;
	}
	aClass173_6520 = null;
	anIntArrayArray6532
	    = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 },
			    { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
			    { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 },
			    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 },
			    { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 },
			    { 12, 12, 12, 12 } };
    }
}
