/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116
{
    public int anInt1489;
    public static int[] anIntArray1490;
    public byte[] aByteArray1491;
    public static int anInt1492;
    public byte[] aByteArray1493;
    public static int anInt1494 = 0;
    public int anInt1495 = 0;
    public short[] aShortArray1496;
    public static int anInt1497;
    public static int anInt1498;
    public Class104[] aClass104Array1499;
    public int[] anIntArray1500;
    public short[] aShortArray1501;
    public short[] aShortArray1502;
    public static int anInt1503;
    public short[] aShortArray1504;
    public byte[] aByteArray1505;
    public static Class158 aClass158_1506;
    public static int anInt1507;
    public static int anInt1508;
    public static int anInt1509;
    public static int anInt1510;
    public int[] anIntArray1511;
    public short[] aShortArray1512;
    public short[] aShortArray1513;
    public short[] aShortArray1514;
    public byte[] aByteArray1515;
    public short[] aShortArray1516;
    public static int anInt1517;
    public static int[] anIntArray1518;
    public static int anInt1519;
    public short[] aShortArray1520;
    public byte[] aByteArray1521;
    public byte[] aByteArray1522;
    public byte[] aByteArray1523;
    public int[] anIntArray1524;
    public short[] aShortArray1525;
    public static int anInt1526;
    public static int anInt1527;
    public int anInt1528;
    public byte[] aByteArray1529;
    public short[] aShortArray1530;
    public byte aByte1531;
    public byte[] aByteArray1532;
    public int[] anIntArray1533;
    public int[] anIntArray1534;
    public Class41[] aClass41Array1535;
    public int anInt1536;
    public short[] aShortArray1537;
    public static int anInt1538;
    public static int anInt1539;
    public byte[] aByteArray1540;
    public short[] aShortArray1541;
    
    public int[][] method985(int arg0) {
	try {
	    anInt1498++;
	    int[] is = new int[256];
	    int i = arg0;
	    for (int i_0_ = 0; anInt1489 > i_0_; i_0_++) {
		int i_1_ = anIntArray1500[i_0_];
		if ((i_1_ ^ 0xffffffff) <= -1) {
		    is[i_1_]++;
		    if ((i_1_ ^ 0xffffffff) < (i ^ 0xffffffff))
			i = i_1_;
		}
	    }
	    int[][] is_2_ = new int[1 + i][];
	    for (int i_3_ = 0; (i ^ 0xffffffff) <= (i_3_ ^ 0xffffffff);
		 i_3_++) {
		is_2_[i_3_] = new int[is[i_3_]];
		is[i_3_] = 0;
	    }
	    for (int i_4_ = 0; anInt1489 > i_4_; i_4_++) {
		int i_5_ = anIntArray1500[i_4_];
		if ((i_5_ ^ 0xffffffff) <= -1)
		    is_2_[i_5_][is[i_5_]++] = i_4_;
	    }
	    return is_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"m.F(" + arg0 + ')');
	}
    }
    
    public int[][] method986(byte arg0) {
	try {
	    anInt1503++;
	    int[] is = new int[256];
	    int i = 0;
	    if (arg0 != -95)
		return null;
	    for (int i_6_ = 0; anInt1536 > i_6_; i_6_++) {
		int i_7_ = anIntArray1524[i_6_];
		if (i_7_ >= 0) {
		    is[i_7_]++;
		    if (i_7_ > i)
			i = i_7_;
		}
	    }
	    int[][] is_8_ = new int[1 + i][];
	    for (int i_9_ = 0; i_9_ <= i; i_9_++) {
		is_8_[i_9_] = new int[is[i_9_]];
		is[i_9_] = 0;
	    }
	    for (int i_10_ = 0; anInt1536 > i_10_; i_10_++) {
		int i_11_ = anIntArray1524[i_10_];
		if ((i_11_ ^ 0xffffffff) <= -1)
		    is_8_[i_11_][is[i_11_]++] = i_10_;
	    }
	    return is_8_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"m.C(" + arg0 + ')');
	}
    }
    
    public int method987(short arg0, byte arg1, int arg2, Class116 arg3) {
	try {
	    anInt1508++;
	    int i = arg3.anIntArray1533[arg2];
	    int i_12_ = arg3.anIntArray1511[arg2];
	    int i_13_ = arg3.anIntArray1534[arg2];
	    for (int i_14_ = 0;
		 (anInt1528 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
		if ((i ^ 0xffffffff) == (anIntArray1533[i_14_] ^ 0xffffffff)
		    && (anIntArray1511[i_14_] ^ 0xffffffff) == (i_12_
								^ 0xffffffff)
		    && i_13_ == anIntArray1534[i_14_]) {
		    aShortArray1502[i_14_]
			= (short) Cryption.method2105(aShortArray1502[i_14_],
						      arg0);
		    return i_14_;
		}
	    }
	    if (arg1 != 121)
		aShortArray1504 = null;
	    anIntArray1533[anInt1528] = i;
	    anIntArray1511[anInt1528] = i_12_;
	    anIntArray1534[anInt1528] = i_13_;
	    aShortArray1502[anInt1528] = arg0;
	    anIntArray1500[anInt1528]
		= arg3.anIntArray1500 != null ? arg3.anIntArray1500[arg2] : -1;
	    return anInt1528++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method988(boolean arg0, byte[] arg1) {
	anInt1519++;
	boolean bool = false;
	boolean bool_15_ = false;
	Stream stream = new Stream(arg1);
	Stream stream_16_ = new Stream(arg1);
	Stream stream_17_ = new Stream(arg1);
	Stream stream_18_ = new Stream(arg1);
	Stream stream_19_ = new Stream(arg1);
	stream.offset = -18 + arg1.length;
	anInt1528 = stream.readUnsignedShort(8104);
	anInt1536 = stream.readUnsignedShort(8104);
	anInt1495 = stream.readUnsignedByte(-128);
	int i = stream.readUnsignedByte(-35);
	int i_20_ = stream.readUnsignedByte(-116);
	int i_21_ = stream.readUnsignedByte(57);
	int i_22_ = stream.readUnsignedByte(112);
	int i_23_ = stream.readUnsignedByte(-80);
	int i_24_ = stream.readUnsignedShort(8104);
	int i_25_ = stream.readUnsignedShort(8104);
	int i_26_ = stream.readUnsignedShort(8104);
	int i_27_ = stream.readUnsignedShort(8104);
	int i_28_ = 0;
	int i_29_ = i_28_;
	i_28_ += anInt1528;
	int i_30_ = i_28_;
	i_28_ += anInt1536;
	int i_31_ = i_28_;
	if ((i_20_ ^ 0xffffffff) == -256)
	    i_28_ += anInt1536;
	int i_32_ = i_28_;
	if (i_22_ == 1)
	    i_28_ += anInt1536;
	int i_33_ = i_28_;
	if ((i ^ 0xffffffff) == -2)
	    i_28_ += anInt1536;
	int i_34_ = i_28_;
	if ((i_23_ ^ 0xffffffff) == -2)
	    i_28_ += anInt1528;
	int i_35_ = i_28_;
	if ((i_21_ ^ 0xffffffff) == -2)
	    i_28_ += anInt1536;
	int i_36_ = i_28_;
	i_28_ += i_27_;
	int i_37_ = i_28_;
	i_28_ += anInt1536 * 2;
	int i_38_ = i_28_;
	i_28_ += anInt1495 * 6;
	int i_39_ = i_28_;
	i_28_ += i_24_;
	int i_40_ = i_28_;
	i_28_ += i_25_;
	int i_41_ = i_28_;
	if (i_21_ == 1)
	    aByteArray1505 = new byte[anInt1536];
	aShortArray1516 = new short[anInt1536];
	stream.offset = i_29_;
	if ((i_22_ ^ 0xffffffff) == -2)
	    anIntArray1524 = new int[anInt1536];
	anIntArray1534 = new int[anInt1528];
	if ((i_20_ ^ 0xffffffff) != -256)
	    aByte1531 = (byte) i_20_;
	else
	    aByteArray1522 = new byte[anInt1536];
	i_28_ += i_26_;
	anIntArray1533 = new int[anInt1528];
	anIntArray1511 = new int[anInt1528];
	aShortArray1513 = new short[anInt1536];
	if ((i ^ 0xffffffff) == -2) {
	    aByteArray1493 = new byte[anInt1536];
	    aShortArray1520 = new short[anInt1536];
	    aByteArray1540 = new byte[anInt1536];
	}
	if ((anInt1495 ^ 0xffffffff) < -1) {
	    aShortArray1512 = new short[anInt1495];
	    aShortArray1537 = new short[anInt1495];
	    aByteArray1521 = new byte[anInt1495];
	    aShortArray1501 = new short[anInt1495];
	}
	aShortArray1514 = new short[anInt1536];
	aShortArray1541 = new short[anInt1536];
	if (i_23_ == 1)
	    anIntArray1500 = new int[anInt1528];
	stream_16_.offset = i_39_;
	stream_17_.offset = i_40_;
	stream_18_.offset = i_41_;
	stream_19_.offset = i_34_;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < anInt1528; i_45_++) {
	    int i_46_ = stream.readUnsignedByte(104);
	    int i_47_ = 0;
	    if ((i_46_ & 0x1 ^ 0xffffffff) != -1)
		i_47_ = stream_16_.method1775((byte) 35);
	    int i_48_ = 0;
	    if ((i_46_ & 0x2) != 0)
		i_48_ = stream_17_.method1775((byte) 35);
	    int i_49_ = 0;
	    if ((0x4 & i_46_ ^ 0xffffffff) != -1)
		i_49_ = stream_18_.method1775((byte) 35);
	    anIntArray1533[i_45_] = i_42_ + i_47_;
	    anIntArray1511[i_45_] = i_43_ - -i_48_;
	    anIntArray1534[i_45_] = i_44_ + i_49_;
	    i_43_ = anIntArray1511[i_45_];
	    i_42_ = anIntArray1533[i_45_];
	    i_44_ = anIntArray1534[i_45_];
	    if ((i_23_ ^ 0xffffffff) == -2)
		anIntArray1500[i_45_] = stream_19_.readUnsignedByte(112);
	}
	stream.offset = i_37_;
	stream_16_.offset = i_33_;
	stream_17_.offset = i_31_;
	stream_18_.offset = i_35_;
	stream_19_.offset = i_32_;
	for (int i_50_ = 0; (anInt1536 ^ 0xffffffff) < (i_50_ ^ 0xffffffff);
	     i_50_++) {
	    aShortArray1516[i_50_] = (short) stream.readUnsignedShort(8104);
	    if (i == 1) {
		int i_51_ = stream_16_.readUnsignedByte(101);
		if ((i_51_ & 0x1 ^ 0xffffffff) != -2)
		    aByteArray1493[i_50_] = (byte) 0;
		else {
		    bool = true;
		    aByteArray1493[i_50_] = (byte) 1;
		}
		if ((i_51_ & 0x2 ^ 0xffffffff) == -3) {
		    aByteArray1540[i_50_] = (byte) (i_51_ >> -1804536926);
		    aShortArray1520[i_50_] = aShortArray1516[i_50_];
		    aShortArray1516[i_50_] = (short) 127;
		    if (aShortArray1520[i_50_] != -1)
			bool_15_ = true;
		} else {
		    aByteArray1540[i_50_] = (byte) -1;
		    aShortArray1520[i_50_] = (short) -1;
		}
	    }
	    if ((i_20_ ^ 0xffffffff) == -256)
		aByteArray1522[i_50_]
		    = stream_17_.readSignedByte((byte) 127);
	    if (i_21_ == 1)
		aByteArray1505[i_50_]
		    = stream_18_.readSignedByte((byte) 127);
	    if ((i_22_ ^ 0xffffffff) == -2)
		anIntArray1524[i_50_] = stream_19_.readUnsignedByte(127);
	}
	anInt1489 = -1;
	stream.offset = i_36_;
	stream_16_.offset = i_30_;
	short i_52_ = 0;
	short i_53_ = 0;
	short i_54_ = 0;
	int i_55_ = 0;
	for (int i_56_ = 0; i_56_ < anInt1536; i_56_++) {
	    int i_57_ = stream_16_.readUnsignedByte(63);
	    if (i_57_ == 1) {
		i_52_ = (short) (i_55_ + stream.method1775((byte) 35));
		i_55_ = i_52_;
		i_53_ = (short) (stream.method1775((byte) 35) + i_55_);
		i_55_ = i_53_;
		i_54_ = (short) (stream.method1775((byte) 35) + i_55_);
		i_55_ = i_54_;
		aShortArray1514[i_56_] = i_52_;
		aShortArray1513[i_56_] = i_53_;
		aShortArray1541[i_56_] = i_54_;
		if (anInt1489 < i_52_)
		    anInt1489 = i_52_;
		if (i_53_ > anInt1489)
		    anInt1489 = i_53_;
		if (anInt1489 < i_54_)
		    anInt1489 = i_54_;
	    }
	    if ((i_57_ ^ 0xffffffff) == -3) {
		i_53_ = i_54_;
		i_54_ = (short) (i_55_ + stream.method1775((byte) 35));
		i_55_ = i_54_;
		aShortArray1514[i_56_] = i_52_;
		aShortArray1513[i_56_] = i_53_;
		aShortArray1541[i_56_] = i_54_;
		if ((anInt1489 ^ 0xffffffff) > (i_54_ ^ 0xffffffff))
		    anInt1489 = i_54_;
	    }
	    if (i_57_ == 3) {
		i_52_ = i_54_;
		i_54_ = (short) (stream.method1775((byte) 35) + i_55_);
		i_55_ = i_54_;
		aShortArray1514[i_56_] = i_52_;
		aShortArray1513[i_56_] = i_53_;
		aShortArray1541[i_56_] = i_54_;
		if (i_54_ > anInt1489)
		    anInt1489 = i_54_;
	    }
	    if ((i_57_ ^ 0xffffffff) == -5) {
		short i_58_ = i_52_;
		i_52_ = i_53_;
		i_54_ = (short) (stream.method1775((byte) 35) + i_55_);
		i_53_ = i_58_;
		aShortArray1514[i_56_] = i_52_;
		i_55_ = i_54_;
		aShortArray1513[i_56_] = i_53_;
		aShortArray1541[i_56_] = i_54_;
		if ((anInt1489 ^ 0xffffffff) > (i_54_ ^ 0xffffffff))
		    anInt1489 = i_54_;
	    }
	}
	stream.offset = i_38_;
	anInt1489++;
	for (int i_59_ = 0; (anInt1495 ^ 0xffffffff) < (i_59_ ^ 0xffffffff);
	     i_59_++) {
	    aByteArray1521[i_59_] = (byte) 0;
	    aShortArray1501[i_59_] = (short) stream.readUnsignedShort(8104);
	    aShortArray1537[i_59_] = (short) stream.readUnsignedShort(8104);
	    aShortArray1512[i_59_] = (short) stream.readUnsignedShort(8104);
	}
	if (aByteArray1540 != null) {
	    boolean bool_60_ = false;
	    for (int i_61_ = 0;
		 (i_61_ ^ 0xffffffff) > (anInt1536 ^ 0xffffffff); i_61_++) {
		int i_62_ = 0xff & aByteArray1540[i_61_];
		if ((i_62_ ^ 0xffffffff) != -256) {
		    if (aShortArray1514[i_61_] != (aShortArray1501[i_62_]
						   & 0xffff)
			|| ((aShortArray1513[i_61_] ^ 0xffffffff)
			    != (0xffff & aShortArray1537[i_62_] ^ 0xffffffff))
			|| aShortArray1541[i_61_] != (aShortArray1512[i_62_]
						      & 0xffff))
			bool_60_ = true;
		    else
			aByteArray1540[i_61_] = (byte) -1;
		}
	    }
	    if (!bool_60_)
		aByteArray1540 = null;
	}
	if (!bool_15_)
	    aShortArray1520 = null;
	if (!bool)
	    aByteArray1493 = null;
	if (arg0 != true)
	    method993(106, -114, -65, 70);
    }
    
    public void method989(int arg0, short arg1, short arg2) {
	try {
	    anInt1527++;
	    if (aShortArray1520 != null) {
		if (arg0 > -121)
		    anIntArray1490 = null;
		for (int i = 0; (anInt1536 ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if ((aShortArray1520[i] ^ 0xffffffff)
			== (arg1 ^ 0xffffffff))
			aShortArray1520[i] = arg2;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method990(int arg0, int arg1, short arg2, int arg3, byte arg4,
			 byte arg5, short arg6, byte arg7, byte arg8) {
	try {
	    anInt1497++;
	    aShortArray1514[anInt1536] = (short) arg1;
	    aShortArray1513[anInt1536] = (short) arg3;
	    aShortArray1541[anInt1536] = (short) arg0;
	    int i = 88 % ((-4 - arg7) / 57);
	    aByteArray1493[anInt1536] = arg5;
	    aByteArray1540[anInt1536] = arg4;
	    aShortArray1516[anInt1536] = arg2;
	    aByteArray1505[anInt1536] = arg8;
	    aShortArray1520[anInt1536] = arg6;
	    return anInt1536++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.M(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ')'));
	}
    }
    
    public int method991(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg3 != -2)
		aShortArray1516 = null;
	    anInt1539++;
	    for (int i = 0; (anInt1528 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (arg1 == anIntArray1533[i] && anIntArray1511[i] == arg2
		    && anIntArray1534[i] == arg0)
		    return i;
	    }
	    anIntArray1533[anInt1528] = arg1;
	    anIntArray1511[anInt1528] = arg2;
	    anIntArray1534[anInt1528] = arg0;
	    anInt1489 = 1 + anInt1528;
	    return anInt1528++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.J(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method992(short arg0, short arg1, int arg2) {
	try {
	    anInt1517++;
	    for (int i = 0; (anInt1536 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (arg1 == aShortArray1516[i])
		    aShortArray1516[i] = arg0;
	    }
	    int i = -7 % ((-38 - arg2) / 43);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method993(int arg0, int arg1, int arg2, int arg3) {
	try {
	    int i = 0;
	    if (arg2 < 8)
		anInt1489 = -54;
	    for (/**/; i < anInt1528; i++) {
		anIntArray1533[i] += arg0;
		anIntArray1511[i] += arg3;
		anIntArray1534[i] += arg1;
	    }
	    anInt1492++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method994(int arg0, int arg1, boolean arg2, int arg3) {
	if (arg2 != false)
	    method985(54);
	anInt1538++;
	if ((arg0 ^ 0xffffffff) != -1) {
	    int i = Class31.anIntArray434[arg0];
	    int i_63_ = Class31.anIntArray425[arg0];
	    for (int i_64_ = 0;
		 (i_64_ ^ 0xffffffff) > (anInt1528 ^ 0xffffffff); i_64_++) {
		int i_65_ = ((anIntArray1511[i_64_] * i
			      + anIntArray1533[i_64_] * i_63_)
			     >> -1902584753);
		anIntArray1511[i_64_]
		    = (-(i * anIntArray1533[i_64_])
		       + anIntArray1511[i_64_] * i_63_) >> 633906639;
		anIntArray1533[i_64_] = i_65_;
	    }
	}
	if (arg3 != 0) {
	    int i = Class31.anIntArray434[arg3];
	    int i_66_ = Class31.anIntArray425[arg3];
	    for (int i_67_ = 0;
		 (anInt1528 ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
		int i_68_ = ((-(i * anIntArray1534[i_67_])
			      + i_66_ * anIntArray1511[i_67_])
			     >> 1343462767);
		anIntArray1534[i_67_]
		    = (anIntArray1534[i_67_] * i_66_
		       + i * anIntArray1511[i_67_]) >> 248564751;
		anIntArray1511[i_67_] = i_68_;
	    }
	}
	if ((arg1 ^ 0xffffffff) != -1) {
	    int i = Class31.anIntArray434[arg1];
	    int i_69_ = Class31.anIntArray425[arg1];
	    for (int i_70_ = 0;
		 (i_70_ ^ 0xffffffff) > (anInt1528 ^ 0xffffffff); i_70_++) {
		int i_71_ = ((i_69_ * anIntArray1533[i_70_]
			      + anIntArray1534[i_70_] * i)
			     >> 263826959);
		anIntArray1534[i_70_]
		    = (-(anIntArray1533[i_70_] * i)
		       + anIntArray1534[i_70_] * i_69_) >> -949532913;
		anIntArray1533[i_70_] = i_71_;
	    }
	}
    }
    
    public void method995(byte[] arg0, int arg1) {
	anInt1526++;
	Stream stream = new Stream(arg0);
	Stream stream_72_ = new Stream(arg0);
	Stream stream_73_ = new Stream(arg0);
	Stream stream_74_ = new Stream(arg0);
	Stream stream_75_ = new Stream(arg0);
	Stream stream_76_ = new Stream(arg0);
	Stream stream_77_ = new Stream(arg0);
	stream.offset = arg0.length - arg1;
	anInt1528 = stream.readUnsignedShort(8104);
	anInt1536 = stream.readUnsignedShort(8104);
	anInt1495 = stream.readUnsignedByte(-99);
	int i = stream.readUnsignedByte(arg1 + 84);
	boolean bool = (0x1 & i ^ 0xffffffff) == -2;
	boolean bool_78_ = (i & 0x2 ^ 0xffffffff) == -3;
	int i_79_ = stream.readUnsignedByte(73);
	int i_80_ = stream.readUnsignedByte(-80);
	int i_81_ = stream.readUnsignedByte(92);
	int i_82_ = stream.readUnsignedByte(-53);
	int i_83_ = stream.readUnsignedByte(118);
	int i_84_ = stream.readUnsignedShort(arg1 + 8081);
	int i_85_ = stream.readUnsignedShort(arg1 ^ 0x1fbf);
	int i_86_ = stream.readUnsignedShort(arg1 + 8081);
	int i_87_ = stream.readUnsignedShort(8104);
	int i_88_ = stream.readUnsignedShort(arg1 ^ 0x1fbf);
	int i_89_ = 0;
	int i_90_ = 0;
	int i_91_ = 0;
	if ((anInt1495 ^ 0xffffffff) < -1) {
	    stream.offset = 0;
	    aByteArray1521 = new byte[anInt1495];
	    for (int i_92_ = 0;
		 (i_92_ ^ 0xffffffff) > (anInt1495 ^ 0xffffffff); i_92_++) {
		byte i_93_ = (aByteArray1521[i_92_]
			      = stream.readSignedByte((byte) 127));
		if ((i_93_ ^ 0xffffffff) == -3)
		    i_91_++;
		if ((i_93_ ^ 0xffffffff) == -1)
		    i_89_++;
		if ((i_93_ ^ 0xffffffff) <= -2 && (i_93_ ^ 0xffffffff) >= -4)
		    i_90_++;
	    }
	}
	int i_94_ = anInt1495;
	int i_95_ = i_94_;
	i_94_ += anInt1528;
	int i_96_ = i_94_;
	if (bool)
	    i_94_ += anInt1536;
	int i_97_ = i_94_;
	i_94_ += anInt1536;
	int i_98_ = i_94_;
	if ((i_79_ ^ 0xffffffff) == -256)
	    i_94_ += anInt1536;
	int i_99_ = i_94_;
	if (i_81_ == 1)
	    i_94_ += anInt1536;
	int i_100_ = i_94_;
	if ((i_83_ ^ 0xffffffff) == -2)
	    i_94_ += anInt1528;
	int i_101_ = i_94_;
	if ((i_80_ ^ 0xffffffff) == -2)
	    i_94_ += anInt1536;
	int i_102_ = i_94_;
	i_94_ += i_87_;
	int i_103_ = i_94_;
	if ((i_82_ ^ 0xffffffff) == -2)
	    i_94_ += anInt1536 * 2;
	int i_104_ = i_94_;
	i_94_ += i_88_;
	int i_105_ = i_94_;
	i_94_ += anInt1536 * 2;
	int i_106_ = i_94_;
	i_94_ += i_84_;
	int i_107_ = i_94_;
	i_94_ += i_85_;
	int i_108_ = i_94_;
	i_94_ += i_86_;
	int i_109_ = i_94_;
	i_94_ += i_89_ * 6;
	int i_110_ = i_94_;
	i_94_ += 6 * i_90_;
	int i_111_ = i_94_;
	i_94_ += i_90_ * 6;
	int i_112_ = i_94_;
	i_94_ += i_90_;
	int i_113_ = i_94_;
	i_94_ += i_90_;
	int i_114_ = i_94_;
	i_94_ += i_90_ - -(i_91_ * 2);
	if ((i_80_ ^ 0xffffffff) == -2)
	    aByteArray1505 = new byte[anInt1536];
	if (bool)
	    aByteArray1493 = new byte[anInt1536];
	if (i_79_ == 255)
	    aByteArray1522 = new byte[anInt1536];
	else
	    aByte1531 = (byte) i_79_;
	if (i_83_ == 1)
	    anIntArray1500 = new int[anInt1528];
	anIntArray1511 = new int[anInt1528];
	if ((anInt1495 ^ 0xffffffff) < -1) {
	    if ((i_90_ ^ 0xffffffff) < -1) {
		aShortArray1530 = new short[i_90_];
		aByteArray1529 = new byte[i_90_];
		aShortArray1496 = new short[i_90_];
		aShortArray1504 = new short[i_90_];
		aByteArray1515 = new byte[i_90_];
		aByteArray1523 = new byte[i_90_];
	    }
	    if (i_91_ > 0) {
		aByteArray1532 = new byte[i_91_];
		aByteArray1491 = new byte[i_91_];
	    }
	    aShortArray1512 = new short[anInt1495];
	    aShortArray1537 = new short[anInt1495];
	    aShortArray1501 = new short[anInt1495];
	}
	anIntArray1533 = new int[anInt1528];
	if ((i_81_ ^ 0xffffffff) == -2)
	    anIntArray1524 = new int[anInt1536];
	int i_115_ = i_94_;
	stream.offset = i_95_;
	anIntArray1534 = new int[anInt1528];
	aShortArray1513 = new short[anInt1536];
	if ((i_82_ ^ 0xffffffff) == -2)
	    aShortArray1520 = new short[anInt1536];
	aShortArray1514 = new short[anInt1536];
	if ((i_82_ ^ 0xffffffff) == -2 && anInt1495 > 0)
	    aByteArray1540 = new byte[anInt1536];
	aShortArray1516 = new short[anInt1536];
	aShortArray1541 = new short[anInt1536];
	stream_72_.offset = i_106_;
	stream_73_.offset = i_107_;
	stream_74_.offset = i_108_;
	stream_75_.offset = i_100_;
	int i_116_ = 0;
	int i_117_ = 0;
	int i_118_ = 0;
	for (int i_119_ = 0; anInt1528 > i_119_; i_119_++) {
	    int i_120_ = stream.readUnsignedByte(92);
	    int i_121_ = 0;
	    if ((i_120_ & 0x1 ^ 0xffffffff) != -1)
		i_121_ = stream_72_.method1775((byte) 35);
	    int i_122_ = 0;
	    if ((0x2 & i_120_) != 0)
		i_122_ = stream_73_.method1775((byte) 35);
	    int i_123_ = 0;
	    if ((0x4 & i_120_ ^ 0xffffffff) != -1)
		i_123_ = stream_74_.method1775((byte) 35);
	    anIntArray1533[i_119_] = i_116_ - -i_121_;
	    anIntArray1511[i_119_] = i_122_ + i_117_;
	    anIntArray1534[i_119_] = i_123_ + i_118_;
	    i_117_ = anIntArray1511[i_119_];
	    i_116_ = anIntArray1533[i_119_];
	    i_118_ = anIntArray1534[i_119_];
	    if (i_83_ == 1)
		anIntArray1500[i_119_] = stream_75_.readUnsignedByte(90);
	}
	stream.offset = i_105_;
	stream_72_.offset = i_96_;
	stream_73_.offset = i_98_;
	stream_74_.offset = i_101_;
	stream_75_.offset = i_99_;
	stream_76_.offset = i_103_;
	stream_77_.offset = i_104_;
	for (int i_124_ = 0; (anInt1536 ^ 0xffffffff) < (i_124_ ^ 0xffffffff);
	     i_124_++) {
	    aShortArray1516[i_124_]
		= (short) stream.readUnsignedShort(arg1 + 8081);
	    if (bool)
		aByteArray1493[i_124_]
		    = stream_72_.readSignedByte((byte) 127);
	    if ((i_79_ ^ 0xffffffff) == -256)
		aByteArray1522[i_124_]
		    = stream_73_.readSignedByte((byte) 127);
	    if ((i_80_ ^ 0xffffffff) == -2)
		aByteArray1505[i_124_]
		    = stream_74_.readSignedByte((byte) 127);
	    if ((i_81_ ^ 0xffffffff) == -2)
		anIntArray1524[i_124_] = stream_75_.readUnsignedByte(102);
	    if (i_82_ == 1)
		aShortArray1520[i_124_]
		    = (short) (-1 + stream_76_.readUnsignedShort(8104));
	    if (aByteArray1540 != null) {
		if (aShortArray1520[i_124_] == -1)
		    aByteArray1540[i_124_] = (byte) -1;
		else
		    aByteArray1540[i_124_]
			= (byte) (stream_77_.readUnsignedByte(67) + -1);
	    }
	}
	stream.offset = i_102_;
	anInt1489 = -1;
	stream_72_.offset = i_97_;
	short i_125_ = 0;
	short i_126_ = 0;
	short i_127_ = 0;
	int i_128_ = 0;
	for (int i_129_ = 0; i_129_ < anInt1536; i_129_++) {
	    int i_130_ = stream_72_.readUnsignedByte(80);
	    if (i_130_ == 1) {
		i_125_
		    = (short) (stream.method1775((byte) 35) + i_128_);
		i_128_ = i_125_;
		i_126_
		    = (short) (stream.method1775((byte) 35) + i_128_);
		i_128_ = i_126_;
		i_127_
		    = (short) (i_128_ + stream.method1775((byte) 35));
		i_128_ = i_127_;
		aShortArray1514[i_129_] = i_125_;
		aShortArray1513[i_129_] = i_126_;
		aShortArray1541[i_129_] = i_127_;
		if ((i_125_ ^ 0xffffffff) < (anInt1489 ^ 0xffffffff))
		    anInt1489 = i_125_;
		if (i_126_ > anInt1489)
		    anInt1489 = i_126_;
		if (i_127_ > anInt1489)
		    anInt1489 = i_127_;
	    }
	    if ((i_130_ ^ 0xffffffff) == -3) {
		i_126_ = i_127_;
		i_127_
		    = (short) (stream.method1775((byte) 35) + i_128_);
		i_128_ = i_127_;
		aShortArray1514[i_129_] = i_125_;
		aShortArray1513[i_129_] = i_126_;
		aShortArray1541[i_129_] = i_127_;
		if ((i_127_ ^ 0xffffffff) < (anInt1489 ^ 0xffffffff))
		    anInt1489 = i_127_;
	    }
	    if (i_130_ == 3) {
		i_125_ = i_127_;
		i_127_
		    = (short) (i_128_ + stream.method1775((byte) 35));
		i_128_ = i_127_;
		aShortArray1514[i_129_] = i_125_;
		aShortArray1513[i_129_] = i_126_;
		aShortArray1541[i_129_] = i_127_;
		if ((i_127_ ^ 0xffffffff) < (anInt1489 ^ 0xffffffff))
		    anInt1489 = i_127_;
	    }
	    if ((i_130_ ^ 0xffffffff) == -5) {
		short i_131_ = i_125_;
		i_125_ = i_126_;
		i_126_ = i_131_;
		i_127_
		    = (short) (stream.method1775((byte) 35) + i_128_);
		i_128_ = i_127_;
		aShortArray1514[i_129_] = i_125_;
		aShortArray1513[i_129_] = i_126_;
		aShortArray1541[i_129_] = i_127_;
		if (anInt1489 < i_127_)
		    anInt1489 = i_127_;
	    }
	}
	anInt1489++;
	stream.offset = i_109_;
	stream_72_.offset = i_110_;
	stream_73_.offset = i_111_;
	stream_74_.offset = i_112_;
	stream_75_.offset = i_113_;
	stream_76_.offset = i_114_;
	for (int i_132_ = 0; (anInt1495 ^ 0xffffffff) < (i_132_ ^ 0xffffffff);
	     i_132_++) {
	    int i_133_ = 0xff & aByteArray1521[i_132_];
	    if (i_133_ == 0) {
		aShortArray1501[i_132_]
		    = (short) stream.readUnsignedShort(arg1 + 8081);
		aShortArray1537[i_132_]
		    = (short) stream.readUnsignedShort(8104);
		aShortArray1512[i_132_]
		    = (short) stream.readUnsignedShort(8104);
	    }
	    if ((i_133_ ^ 0xffffffff) == -2) {
		aShortArray1501[i_132_]
		    = (short) stream_72_.readUnsignedShort(arg1 + 8081);
		aShortArray1537[i_132_]
		    = (short) stream_72_.readUnsignedShort(8104);
		aShortArray1512[i_132_]
		    = (short) (stream_72_.readUnsignedShort
			       (Class23_Sub4_Sub5.method390(arg1, 8127)));
		aShortArray1496[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aShortArray1530[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aShortArray1504[i_132_]
		    = (short) stream_73_.readUnsignedShort(arg1 + 8081);
		aByteArray1523[i_132_]
		    = stream_74_.readSignedByte((byte) 127);
		aByteArray1529[i_132_]
		    = stream_75_.readSignedByte((byte) 127);
		aByteArray1515[i_132_]
		    = stream_76_.readSignedByte((byte) 127);
	    }
	    if (i_133_ == 2) {
		aShortArray1501[i_132_]
		    = (short) (stream_72_.readUnsignedShort
			       (Class23_Sub4_Sub5.method390(arg1, 8127)));
		aShortArray1537[i_132_]
		    = (short) stream_72_.readUnsignedShort(8104);
		aShortArray1512[i_132_]
		    = (short) stream_72_.readUnsignedShort(8104);
		aShortArray1496[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aShortArray1530[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aShortArray1504[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aByteArray1523[i_132_]
		    = stream_74_.readSignedByte((byte) 127);
		aByteArray1529[i_132_]
		    = stream_75_.readSignedByte((byte) 127);
		aByteArray1515[i_132_]
		    = stream_76_.readSignedByte((byte) 127);
		aByteArray1491[i_132_]
		    = stream_76_.readSignedByte((byte) 127);
		aByteArray1532[i_132_]
		    = stream_76_.readSignedByte((byte) 127);
	    }
	    if (i_133_ == 3) {
		aShortArray1501[i_132_]
		    = (short) (stream_72_.readUnsignedShort
			       (Class23_Sub4_Sub5.method390(arg1, 8127)));
		aShortArray1537[i_132_]
		    = (short) stream_72_.readUnsignedShort(8104);
		aShortArray1512[i_132_]
		    = (short) (stream_72_.readUnsignedShort
			       (Class23_Sub4_Sub5.method390(arg1, 8127)));
		aShortArray1496[i_132_]
		    = (short) stream_73_.readUnsignedShort(arg1 + 8081);
		aShortArray1530[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aShortArray1504[i_132_]
		    = (short) stream_73_.readUnsignedShort(8104);
		aByteArray1523[i_132_]
		    = stream_74_.readSignedByte((byte) 127);
		aByteArray1529[i_132_]
		    = stream_75_.readSignedByte((byte) 127);
		aByteArray1515[i_132_]
		    = stream_76_.readSignedByte((byte) 127);
	    }
	}
	if (bool_78_) {
	    stream.offset = i_115_;
	    int i_134_ = stream.readUnsignedByte(-106);
	    if ((i_134_ ^ 0xffffffff) < -1) {
		aClass41Array1535 = new Class41[i_134_];
		for (int i_135_ = 0; i_135_ < i_134_; i_135_++) {
		    int i_136_ = stream.readUnsignedShort(8104);
		    int i_137_ = stream.readUnsignedShort(8104);
		    byte i_138_;
		    if ((i_79_ ^ 0xffffffff) == -256)
			i_138_ = aByteArray1522[i_137_];
		    else
			i_138_ = (byte) i_79_;
		    aClass41Array1535[i_135_]
			= new Class41(i_136_, aShortArray1514[i_137_],
				      aShortArray1513[i_137_],
				      aShortArray1541[i_137_], i_138_);
		}
	    }
	    int i_139_ = stream.readUnsignedByte(-20);
	    if ((i_139_ ^ 0xffffffff) < -1) {
		aClass104Array1499 = new Class104[i_139_];
		for (int i_140_ = 0; i_140_ < i_139_; i_140_++)
		    aClass104Array1499[i_140_]
			= new Class104(stream.readUnsignedShort(8104),
				       stream.readUnsignedShort(8104));
	    }
	}
    }
    
    public byte method996(short arg0, int arg1, byte arg2, short arg3,
			  byte arg4, short arg5, short arg6, byte arg7,
			  short arg8, short arg9) {
	try {
	    anInt1507++;
	    if (arg1 != -1286)
		return (byte) -93;
	    if (anInt1495 >= 255)
		throw new IllegalStateException();
	    aByteArray1521[anInt1495] = (byte) 3;
	    aShortArray1501[anInt1495] = arg3;
	    aShortArray1537[anInt1495] = arg0;
	    aShortArray1512[anInt1495] = arg9;
	    aShortArray1496[anInt1495] = arg8;
	    aShortArray1530[anInt1495] = arg5;
	    aShortArray1504[anInt1495] = arg6;
	    aByteArray1523[anInt1495] = arg2;
	    aByteArray1529[anInt1495] = arg7;
	    aByteArray1515[anInt1495] = arg4;
	    return (byte) anInt1495++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public static void method997(int arg0) {
	try {
	    anIntArray1518 = null;
	    int i = -69 % ((-30 - arg0) / 41);
	    anIntArray1490 = null;
	    aClass158_1506 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"m.B(" + arg0 + ')');
	}
    }
    
    public Class116(byte[] arg0) {
	anInt1489 = 0;
	aByte1531 = (byte) 0;
	anInt1528 = 0;
	anInt1536 = 0;
	try {
	    if (arg0[arg0.length + -1] == -1 && arg0[-2 + arg0.length] == -1)
		method995(arg0, 23);
	    else
		method988(true, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class116(int arg0, int arg1, int arg2) {
	anInt1489 = 0;
	aByte1531 = (byte) 0;
	anInt1528 = 0;
	anInt1536 = 0;
	try {
	    anIntArray1500 = new int[arg0];
	    aShortArray1541 = new short[arg1];
	    if ((arg2 ^ 0xffffffff) < -1) {
		aByteArray1523 = new byte[arg2];
		aByteArray1532 = new byte[arg2];
		aShortArray1512 = new short[arg2];
		aShortArray1530 = new short[arg2];
		aByteArray1521 = new byte[arg2];
		aShortArray1504 = new short[arg2];
		aByteArray1515 = new byte[arg2];
		aShortArray1496 = new short[arg2];
		aByteArray1529 = new byte[arg2];
		aShortArray1501 = new short[arg2];
		aShortArray1537 = new short[arg2];
		aByteArray1491 = new byte[arg2];
	    }
	    aShortArray1520 = new short[arg1];
	    aByteArray1505 = new byte[arg1];
	    aByteArray1540 = new byte[arg1];
	    anIntArray1524 = new int[arg1];
	    anIntArray1534 = new int[arg0];
	    aByteArray1493 = new byte[arg1];
	    aShortArray1513 = new short[arg1];
	    aShortArray1516 = new short[arg1];
	    anIntArray1533 = new int[arg0];
	    anIntArray1511 = new int[arg0];
	    aByteArray1522 = new byte[arg1];
	    aShortArray1514 = new short[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public Class116(Class116[] arg0, int arg1) {
	anInt1489 = 0;
	aByte1531 = (byte) 0;
	anInt1528 = 0;
	anInt1536 = 0;
	try {
	    anInt1495 = 0;
	    anInt1536 = 0;
	    anInt1528 = 0;
	    int i = 0;
	    int i_141_ = 0;
	    boolean bool = false;
	    boolean bool_142_ = false;
	    boolean bool_143_ = false;
	    boolean bool_144_ = false;
	    boolean bool_145_ = false;
	    boolean bool_146_ = false;
	    aByte1531 = (byte) -1;
	    for (int i_147_ = 0; (i_147_ ^ 0xffffffff) > (arg1 ^ 0xffffffff);
		 i_147_++) {
		Class116 class116 = arg0[i_147_];
		if (class116 != null) {
		    anInt1528 += class116.anInt1528;
		    anInt1536 += class116.anInt1536;
		    anInt1495 += class116.anInt1495;
		    if (class116.aClass104Array1499 != null)
			i_141_ += class116.aClass104Array1499.length;
		    bool = bool | class116.aByteArray1493 != null;
		    if (class116.aClass41Array1535 != null)
			i += class116.aClass41Array1535.length;
		    if (class116.aByteArray1522 == null) {
			if ((aByte1531 ^ 0xffffffff) == 0)
			    aByte1531 = class116.aByte1531;
			if (aByte1531 != class116.aByte1531)
			    bool_142_ = true;
		    } else
			bool_142_ = true;
		    bool_145_ = bool_145_ | class116.aShortArray1520 != null;
		    bool_143_ = bool_143_ | class116.aByteArray1505 != null;
		    bool_146_ = bool_146_ | class116.anIntArray1524 != null;
		    bool_144_ = bool_144_ | class116.aByteArray1540 != null;
		}
	    }
	    anIntArray1500 = new int[anInt1528];
	    aShortArray1513 = new short[anInt1536];
	    if (bool_143_)
		aByteArray1505 = new byte[anInt1536];
	    if (bool)
		aByteArray1493 = new byte[anInt1536];
	    aShortArray1514 = new short[anInt1536];
	    aShortArray1502 = new short[anInt1528];
	    aShortArray1516 = new short[anInt1536];
	    if ((i_141_ ^ 0xffffffff) < -1)
		aClass104Array1499 = new Class104[i_141_];
	    anIntArray1533 = new int[anInt1528];
	    aShortArray1525 = new short[anInt1536];
	    anIntArray1534 = new int[anInt1528];
	    if (bool_145_)
		aShortArray1520 = new short[anInt1536];
	    if ((i ^ 0xffffffff) < -1)
		aClass41Array1535 = new Class41[i];
	    if (bool_146_)
		anIntArray1524 = new int[anInt1536];
	    anIntArray1511 = new int[anInt1528];
	    aShortArray1541 = new short[anInt1536];
	    if (bool_144_)
		aByteArray1540 = new byte[anInt1536];
	    if (bool_142_)
		aByteArray1522 = new byte[anInt1536];
	    if (anInt1495 > 0) {
		aByteArray1515 = new byte[anInt1495];
		aShortArray1496 = new short[anInt1495];
		aShortArray1512 = new short[anInt1495];
		aByteArray1532 = new byte[anInt1495];
		aShortArray1537 = new short[anInt1495];
		aShortArray1504 = new short[anInt1495];
		aByteArray1529 = new byte[anInt1495];
		aByteArray1521 = new byte[anInt1495];
		aShortArray1501 = new short[anInt1495];
		aByteArray1491 = new byte[anInt1495];
		aShortArray1530 = new short[anInt1495];
		aByteArray1523 = new byte[anInt1495];
	    }
	    anInt1495 = 0;
	    anInt1528 = 0;
	    i_141_ = 0;
	    i = 0;
	    anInt1536 = 0;
	    for (int i_148_ = 0; arg1 > i_148_; i_148_++) {
		short i_149_ = (short) (1 << i_148_);
		Class116 class116 = arg0[i_148_];
		if (class116 != null) {
		    for (int i_150_ = 0; i_150_ < class116.anInt1536;
			 i_150_++) {
			if (bool && class116.aByteArray1493 != null)
			    aByteArray1493[anInt1536]
				= class116.aByteArray1493[i_150_];
			if (bool_142_) {
			    if (class116.aByteArray1522 != null)
				aByteArray1522[anInt1536]
				    = class116.aByteArray1522[i_150_];
			    else
				aByteArray1522[anInt1536] = class116.aByte1531;
			}
			if (bool_143_ && class116.aByteArray1505 != null)
			    aByteArray1505[anInt1536]
				= class116.aByteArray1505[i_150_];
			if (bool_145_) {
			    if (class116.aShortArray1520 == null)
				aShortArray1520[anInt1536] = (short) -1;
			    else
				aShortArray1520[anInt1536]
				    = class116.aShortArray1520[i_150_];
			}
			if (bool_146_) {
			    if (class116.anIntArray1524 != null)
				anIntArray1524[anInt1536]
				    = class116.anIntArray1524[i_150_];
			    else
				anIntArray1524[anInt1536] = -1;
			}
			aShortArray1514[anInt1536]
			    = (short) method987(i_149_, (byte) 121,
						(class116.aShortArray1514
						 [i_150_]),
						class116);
			aShortArray1513[anInt1536]
			    = (short) method987(i_149_, (byte) 121,
						(class116.aShortArray1513
						 [i_150_]),
						class116);
			aShortArray1541[anInt1536]
			    = (short) method987(i_149_, (byte) 121,
						(class116.aShortArray1541
						 [i_150_]),
						class116);
			aShortArray1525[anInt1536] = i_149_;
			aShortArray1516[anInt1536]
			    = class116.aShortArray1516[i_150_];
			anInt1536++;
		    }
		    if (class116.aClass41Array1535 != null) {
			for (int i_151_ = 0;
			     class116.aClass41Array1535.length > i_151_;
			     i_151_++) {
			    int i_152_ = method987(i_149_, (byte) 121,
						   (class116.aClass41Array1535
						    [i_151_].anInt539),
						   class116);
			    int i_153_ = method987(i_149_, (byte) 121,
						   (class116.aClass41Array1535
						    [i_151_].anInt552),
						   class116);
			    int i_154_ = method987(i_149_, (byte) 121,
						   (class116.aClass41Array1535
						    [i_151_].anInt540),
						   class116);
			    aClass41Array1535[i]
				= new Class41((class116.aClass41Array1535
					       [i_151_].anInt537),
					      i_152_, i_153_, i_154_,
					      (class116.aClass41Array1535
					       [i_151_].aByte550));
			    i++;
			}
		    }
		    if (class116.aClass104Array1499 != null) {
			for (int i_155_ = 0;
			     class116.aClass104Array1499.length > i_155_;
			     i_155_++) {
			    int i_156_ = method987(i_149_, (byte) 121,
						   (class116.aClass104Array1499
						    [i_155_].anInt1362),
						   class116);
			    aClass104Array1499[i_141_]
				= new Class104((class116.aClass104Array1499
						[i_155_].anInt1358),
					       i_156_);
			    i_141_++;
			}
		    }
		}
	    }
	    anInt1489 = anInt1528;
	    int i_157_ = 0;
	    for (int i_158_ = 0; arg1 > i_158_; i_158_++) {
		short i_159_ = (short) (1 << i_158_);
		Class116 class116 = arg0[i_158_];
		if (class116 != null) {
		    for (int i_160_ = 0; class116.anInt1536 > i_160_;
			 i_160_++) {
			if (bool_144_)
			    aByteArray1540[i_157_++]
				= (byte) ((class116.aByteArray1540 != null
					   && (class116.aByteArray1540[i_160_]
					       ^ 0xffffffff) != 0)
					  ? (class116.aByteArray1540[i_160_]
					     + anInt1495)
					  : -1);
		    }
		    for (int i_161_ = 0;
			 ((i_161_ ^ 0xffffffff)
			  > (class116.anInt1495 ^ 0xffffffff));
			 i_161_++) {
			byte i_162_ = (aByteArray1521[anInt1495]
				       = class116.aByteArray1521[i_161_]);
			if (i_162_ == 0) {
			    aShortArray1501[anInt1495]
				= (short) method987(i_159_, (byte) 121,
						    (class116.aShortArray1501
						     [i_161_]),
						    class116);
			    aShortArray1537[anInt1495]
				= (short) method987(i_159_, (byte) 121,
						    (class116.aShortArray1537
						     [i_161_]),
						    class116);
			    aShortArray1512[anInt1495]
				= (short) method987(i_159_, (byte) 121,
						    (class116.aShortArray1512
						     [i_161_]),
						    class116);
			}
			if (i_162_ >= 1 && i_162_ <= 3) {
			    aShortArray1501[anInt1495]
				= class116.aShortArray1501[i_161_];
			    aShortArray1537[anInt1495]
				= class116.aShortArray1537[i_161_];
			    aShortArray1512[anInt1495]
				= class116.aShortArray1512[i_161_];
			    aShortArray1496[anInt1495]
				= class116.aShortArray1496[i_161_];
			    aShortArray1530[anInt1495]
				= class116.aShortArray1530[i_161_];
			    aShortArray1504[anInt1495]
				= class116.aShortArray1504[i_161_];
			    aByteArray1523[anInt1495]
				= class116.aByteArray1523[i_161_];
			    aByteArray1529[anInt1495]
				= class116.aByteArray1529[i_161_];
			    aByteArray1515[anInt1495]
				= class116.aByteArray1515[i_161_];
			}
			if ((i_162_ ^ 0xffffffff) == -3) {
			    aByteArray1491[anInt1495]
				= class116.aByteArray1491[i_161_];
			    aByteArray1532[anInt1495]
				= class116.aByteArray1532[i_161_];
			}
			anInt1495++;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("m.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	anIntArray1490 = new int[4096];
	anInt1509 = 0;
    }
}
