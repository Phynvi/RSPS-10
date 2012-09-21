/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Stream extends Class131
{
    public static int anInt4295;
    public static int anInt4296;
    public static int anInt4297;
    public static int anInt4298;
    public static int anInt4299 = 0;
    public static int anInt4300;
    public static int anInt4301;
    public static int anInt4302;
    public static int anInt4303;
    public static int anInt4304;
    public static int anInt4305;
    public static int anInt4306;
    public static int anInt4307;
    public static int anInt4308;
    public static int anInt4309;
    public static int anInt4310;
    public static int anInt4311;
    public static int anInt4312;
    public static int anInt4313;
    public static int anInt4314;
    public static int anInt4315;
    public static int anInt4316;
    public static int anInt4317;
    public static int anInt4318;
    public static int anInt4319;
    public static int anInt4320;
    public static int anInt4321;
    public static int anInt4322;
    public static int anInt4323;
    public byte[] data;
    public static int anInt4325;
    public static int anInt4326;
    public static int anInt4327;
    public static int anInt4328;
    public static int anInt4329;
    public static int anInt4330;
    public static int anInt4331;
    public static int anInt4332;
    public static int anInt4333;
    public static int anInt4334;
    public static int anInt4335;
    public static int anInt4336;
    public static int anInt4337;
    public static int anInt4338;
    public static int anInt4339;
    public static int anInt4340;
    public static int anInt4341;
    public static int anInt4342;
    public static int anInt4343;
    public static int anInt4344;
    public static int anInt4345;
    public static int anInt4346;
    public static int anInt4347;
    public static int anInt4348;
    public static int anInt4349;
    public static int anInt4350;
    public static int anInt4351;
    public static int anInt4352;
    public static int anInt4353;
    public static int anInt4354;
    public static int anInt4355;
    public static int anInt4356;
    public static int anInt4357;
    public static int anInt4358;
    public static int anInt4359;
    public int offset;
    public static int anInt4361;
    public static int anInt4362;
    public static int anInt4363;
    public static int anInt4364;

    public long method1717(int arg0, int arg1) {
	try {
	    anInt4344++;
	    arg0--;
	    if (arg1 > arg0 || arg0 > 7)
		throw new IllegalArgumentException();
	    int i = 8 * arg0;
	    long l = 0L;
	    for (/**/; i >= 0; i -= 8)
		l |= ((long) data[offset++] & 0xffL) << i;
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.IB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1718(int arg0, int arg1, boolean arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    anInt4325++;
	    int i = -arg5 + arg3;
	    int i_0_ = -arg0 + arg1;
	    if (i_0_ == 0) {
		if ((i ^ 0xffffffff) != -1)
		    Class131_Sub41_Sub2.method1930(arg3, arg0, arg5, arg4,
						   false);
	    } else if (i == 0)
		Class131_Sub2_Sub31.method1623(arg0, arg5, arg1, arg4,
					       (byte) 119);
	    else {
		if (i_0_ < 0)
		    i_0_ = -i_0_;
		if (arg2 != false)
		    anInt4350 = 112;
		if (i < 0)
		    i = -i;
		boolean bool = (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff);
		if (bool) {
		    int i_1_ = arg0;
		    int i_2_ = arg1;
		    arg0 = arg5;
		    arg5 = i_1_;
		    arg1 = arg3;
		    arg3 = i_2_;
		}
		if (arg1 < arg0) {
		    int i_3_ = arg0;
		    int i_4_ = arg5;
		    arg0 = arg1;
		    arg5 = arg3;
		    arg1 = i_3_;
		    arg3 = i_4_;
		}
		int i_5_ = arg5;
		int i_6_ = arg1 + -arg0;
		int i_7_ = arg3 + -arg5;
		int i_8_ = -(i_6_ >> 943621121);
		int i_9_ = (arg3 ^ 0xffffffff) >= (arg5 ^ 0xffffffff) ? -1 : 1;
		if ((i_7_ ^ 0xffffffff) > -1)
		    i_7_ = -i_7_;
		if (bool) {
		    for (int i_10_ = arg0; i_10_ <= arg1; i_10_++) {
			Class56.anIntArrayArray740[i_10_][i_5_] = arg4;
			i_8_ += i_7_;
			if ((i_8_ ^ 0xffffffff) < -1) {
			    i_5_ += i_9_;
			    i_8_ -= i_6_;
			}
		    }
		} else {
		    for (int i_11_ = arg0;
			 (arg1 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff);
			 i_11_++) {
			Class56.anIntArrayArray740[i_5_][i_11_] = arg4;
			i_8_ += i_7_;
			if (i_8_ > 0) {
			    i_8_ -= i_6_;
			    i_5_ += i_9_;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.JB(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public int readSignedShortA(byte arg0) {
	try {
	    anInt4362++;
	    if (arg0 != -34)
		return -24;
	    offset += 2;
	    int i = (((0xff & data[offset + -2]) << 2071987400)
		     + (0xff & data[-1 + offset] - 128));
	    if (i > 32767)
		i -= 65536;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.MB(" + arg0 + ')');
	}
    }
    
    public void writeString(String arg0, byte arg1) {
	try {
	    anInt4353++;
	    int i = arg0.indexOf('\0');
	    if ((i ^ 0xffffffff) <= -1)
		throw new IllegalArgumentException("NUL character at " + i
						   + " - cannot pjstr");
	    offset += Class57.method635(offset, arg0, 0, arg0.length(),
					   data, -25945);
	    int i_12_ = 12 / ((-54 - arg1) / 43);
	    data[offset++] = (byte) 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.QB("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public String method1721(int arg0) {
	try {
	    anInt4316++;
	    byte i = data[offset++];
	    if ((i ^ 0xffffffff) != -1)
		throw new IllegalStateException
			  ("Bad version number in gjstr2");
	    int i_13_ = offset;
	    while (data[offset++] != 0) {
		/* empty */
	    }
	    int i_14_ = -1 + (offset + -i_13_);
	    if ((i_14_ ^ 0xffffffff) == -1)
		return "";
	    if (arg0 != 5)
		return null;
	    return Class131_Sub8_Sub1.method1682(i_14_, i_13_, 4238,
						 data);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.KA(" + arg0 + ')');
	}
    }
    
    public int readSignedLEShort(int arg0) {
	try {
	    anInt4328++;
	    offset += 2;
	    int i = -27 % ((-48 - arg0) / 59);
	    int i_15_
		= ((data[-1 + offset] << -1722813400 & 0xff00)
		   + (data[-2 + offset] & 0xff));
	    if ((i_15_ ^ 0xffffffff) < -32768)
		i_15_ -= 65536;
	    return i_15_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.AB(" + arg0 + ')');
	}
    }
    
    public int readUnsignedByteS(int arg0) {
	try {
	    anInt4347++;
	    if (arg0 != 14684)
		offset = -7;
	    return 128 + -data[offset++] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.EB(" + arg0 + ')');
	}
    }
    
    public int readUnsignedInt(int arg0) {
	try {
	    if (arg0 != -2)
		return -78;
	    offset += 4;
	    anInt4361++;
	    return ((data[-1 + offset] & 0xff)
		    + ((data[-4 + offset] & 0xff) << -333510440)
		    + ((0xff0000
			& data[offset - 3] << -1647926640)
		       - -((0xff & data[-2 + offset])
			   << 20426280)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.HB(" + arg0 + ')');
	}
    }
    
    public void method1725(long arg0, int arg1, int arg2) {
	do {
	    try {
		arg1--;
		anInt4312++;
		if (arg1 < 0 || (arg1 ^ 0xffffffff) < -8)
		    throw new IllegalArgumentException();
		for (int i = arg1 * 8; (i ^ 0xffffffff) <= -1; i -= 8)
		    data[offset++] = (byte) (int) (arg0 >> i);
		if (arg2 == -8)
		    break;
		method1734(-81, -3, null, 35);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("il.UA(" + arg0 + ','
						     + arg1 + ',' + arg2
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method1726(byte arg0, int arg1) {
	try {
	    data[offset++] = (byte) (arg1 >> -1764671728);
	    if (arg0 == 59) {
		anInt4335++;
		data[offset++] = (byte) (arg1 >> 1113657384);
		data[offset++] = (byte) arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.PA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1727(int arg0, byte arg1) {
	try {
	    data[-arg0 + (offset + -1)] = (byte) arg0;
	    if (arg1 != -42)
		writeLEInt(false, 45);
	    anInt4304++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.LA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeLEShort(int arg0, byte arg1) {
	try {
	    anInt4346++;
	    data[offset++] = (byte) arg0;
	    if (arg1 == -115)
		data[offset++] = (byte) (arg0 >> 1847423400);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.HA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int readUnsignedLEInt(int arg0) {
	try {
	    offset += 4;
	    anInt4315++;
	    if (arg0 != -16777216)
		readSmart(83);
	    return ((0xff & data[offset - 4])
		    + (data[offset + -3] << 1853884680 & 0xff00)
		    + (((data[offset + -2] & 0xff) << -66500496)
		       + (~0xffffff
			  & data[-1 + offset] << 595053592)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.FC(" + arg0 + ')');
	}
    }
    
    public byte readSignedByteC(byte arg0) {
	try {
	    int i = -76 / ((-2 - arg0) / 61);
	    anInt4332++;
	    return (byte) -data[offset++];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.SB(" + arg0 + ')');
	}
    }
    
    public byte method1731(int arg0) {
	try {
	    anInt4319++;
	    if (arg0 != 252)
		method1771(-37, 53);
	    return (byte) (data[offset++] + -128);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.IC(" + arg0 + ')');
	}
    }
    
    public int readUnsignedByteA(byte arg0) {
	try {
	    anInt4309++;
	    int i = 57 / ((arg0 - -50) / 52);
	    return data[offset++] - 128 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.OB(" + arg0 + ')');
	}
    }
    
    public byte readSignedByteS(int arg0) {
	try {
	    anInt4298++;
	    if (arg0 != -6266)
		method1780(110);
	    return (byte) (128 + -data[offset++]);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.RB(" + arg0 + ')');
	}
    }
    
    public void method1734(int arg0, int arg1, byte[] arg2, int arg3) {
	try {
	    if (arg1 <= -56) {
		for (int i = arg0;
		     (arg0 - -arg3 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		    data[offset++] = arg2[i];
		anInt4358++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.WB(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public int method1735(int arg0, int arg1) {
	try {
	    if (arg1 > -97)
		data = null;
	    anInt4359++;
	    int i = Class64.method672(-5, offset, data, arg0);
	    writeInt(i);
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.DB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method1736(byte arg0, String arg1) {
	try {
	    anInt4338++;
	    int i = arg1.length();
	    int i_16_ = 0;
	    if (arg0 < 92)
		anInt4299 = -92;
	    for (int i_17_ = 0; i > i_17_; i_17_++)
		i_16_ = -i_16_ + ((i_16_ << 474338629)
				  - -Class44.method542(arg1.charAt(i_17_),
						       true));
	    return i_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.V(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1737(byte[] arg0, int arg1, int arg2, byte arg3) {
	anInt4342++;
	for (int i = arg2; (arg2 + arg1 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    arg0[i] = (byte) (-128 + data[offset++]);
	if (arg3 <= 28)
	    method1717(65, -27);
    }
    
    public int readSmart(int arg0) {
	try {
	    anInt4295++;
	    if (arg0 != -1647926640)
		return 81;
	    int i = 0xff & data[offset];
	    if (i >= 128)
		return -32768 + readUnsignedShort(8104);
	    return readUnsignedByte(69);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.O(" + arg0 + ')');
	}
    }
    
    public int method1739(boolean arg0) {
	try {
	    anInt4340++;
	    if (arg0 != true)
		method1747((byte) -90, 33L);
	    int i = data[offset++];
	    int i_18_ = 0;
	    for (/**/; i < 0; i = data[offset++])
		i_18_ = (i & 0x7f | i_18_) << 1629193447;
	    return i | i_18_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.GA(" + arg0 + ')');
	}
    }
    
    public int readUnsignedInt1(int arg0) {
	try {
	    offset += 4;
	    anInt4337++;
	    if (arg0 != 65280)
		return -33;
	    return ((data[-3 + offset] & 0xff)
		    + ((data[-2 + offset] & 0xff) << 2099657112)
		    - -(0xff0000 & data[offset - 1] << -7773264)
		    - -(data[offset + -4] << -1353828088
			& 0xff00));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.VB(" + arg0 + ')');
	}
    }
    
    public int readSignedLEShortA(int arg0) {
	try {
	    offset += 2;
	    anInt4331++;
	    if (arg0 != 65536)
		return 89;
	    int i
		= ((0xff & -128 + data[offset - 2])
		   + ((data[-1 + offset] & 0xff) << -2059746488));
	    if (i > 32767)
		i -= 65536;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.DA(" + arg0 + ')');
	}
    }
    
    public int readUnsignedLEShort(byte arg0) {
	try {
	    anInt4364++;
	    offset += 2;
	    if (arg0 != 79)
		return -50;
	    return ((data[-2 + offset] & 0xff)
		    + (0xff00 & data[offset - 1] << -1168455832));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.WA(" + arg0 + ')');
	}
    }
    
    public int readUnsignedShort(int arg0) {
	try {
	    anInt4330++;
	    if (arg0 != 8104)
		writeShort(60);
	    offset += 2;
	    return ((data[-2 + offset] << 21257576 & 0xff00)
		    - -(data[-1 + offset] & 0xff));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.AC(" + arg0 + ')');
	}
    }
    
    public void method1744(int arg0, int arg1) {
	try {
	    anInt4343++;
	    if (arg1 != 65280)
		data = null;
	    data[-4 + offset + -arg0]
		= (byte) (arg0 >> 550543064);
	    data[offset + (-arg0 + -3)]
		= (byte) (arg0 >> 2049230864);
	    data[-2 + (-arg0 + offset)]
		= (byte) (arg0 >> -192297144);
	    data[-1 + offset - arg0] = (byte) arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.UB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeByteC(int arg0, int arg1) {
	try {
	    data[offset++] = (byte) -arg1;
	    if (arg0 != -29012)
		method1739(true);
	    anInt4352++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.BB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeLEInt(boolean arg0, int arg1) {
	try {
	    data[offset++] = (byte) arg1;
	    anInt4351++;
	    data[offset++] = (byte) (arg1 >> -405341848);
	    data[offset++] = (byte) (arg1 >> -1926585200);
	    if (arg0 != true)
		anInt4323 = 18;
	    data[offset++] = (byte) (arg1 >> 710132120);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.VA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1747(byte arg0, long arg1) {
	try {
	    anInt4321++;
	    if (arg0 > 112) {
		data[offset++]
		    = (byte) (int) (arg1 >> 1423295288);
		data[offset++]
		    = (byte) (int) (arg1 >> -849956560);
		data[offset++]
		    = (byte) (int) (arg1 >> 1972133160);
		data[offset++]
		    = (byte) (int) (arg1 >> 1078688608);
		data[offset++] = (byte) (int) (arg1 >> 613759896);
		data[offset++]
		    = (byte) (int) (arg1 >> 1784471184);
		data[offset++] = (byte) (int) (arg1 >> 533841800);
		data[offset++] = (byte) (int) arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.PB(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1748(int arg0, int[] arg1) {
	try {
	    anInt4333++;
	    int i = offset / 8;
	    offset = arg0;
	    for (int i_19_ = 0; i_19_ < i; i_19_++) {
		int i_20_ = readUnsignedInt(arg0 ^ ~0x1);
		int i_21_ = readUnsignedInt(-2);
		int i_22_ = 0;
		int i_23_ = -1640531527;
		int i_24_ = 32;
		while (i_24_-- > 0) {
		    i_20_
			+= i_22_ + arg1[0x3 & i_22_] ^ ((i_21_ >>> -2112999835
							 ^ i_21_ << -971420604)
							- -i_21_);
		    i_22_ += i_23_;
		    i_21_
			+= ((i_20_ >>> -323657883 ^ i_20_ << 195222628) + i_20_
			    ^ (i_22_
			       - -arg1[0x3f200003 & i_22_ >>> 1287977067]));
		}
		offset -= 8;
		writeInt(i_20_);
		writeInt(i_21_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.LB(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int read3Bytes(boolean arg0) {
	try {
	    anInt4302++;
	    offset += 3;
	    if (arg0 != false)
		offset = -30;
	    return ((data[-3 + offset] << 46512016 & 0xff0000)
		    - -(0xff00 & data[-2 + offset] << -1540663864)
		    - -(0xff & data[offset + -1]));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.GB(" + arg0 + ')');
	}
    }
    
    public void writeInt2(int arg0, int arg1) {
	try {
	    data[offset++] = (byte) (arg1 >> -1867560368);
	    anInt4339++;
	    if (arg0 != 113414280)
		anInt4350 = 68;
	    data[offset++] = (byte) (arg1 >> -950119176);
	    data[offset++] = (byte) arg1;
	    data[offset++] = (byte) (arg1 >> -330524760);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.BC(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeShort(int arg0) {
	try {
	    anInt4314++;
	    data[offset++] = (byte) (arg0 >> -1846218616);
	    data[offset++] = (byte) arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.FB(" + arg0 + ',' + arg0
						 + ')'));
	}
    }
    
    public int readUnsignedLEShortA(int arg0) {
	try {
	    anInt4355++;
	    offset += 2;
	    if (arg0 != -1)
		return -60;
	    return (((data[offset - 1] & 0xff) << 1916370184)
		    - -(-128 + data[-2 + offset] & 0xff));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.RA(" + arg0 + ')');
	}
    }
    
    public static void method1753(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	anInt4354++;
	Class131_Sub3 class131_sub3 = null;
	for (Class131_Sub3 class131_sub3_25_
		 = (Class131_Sub3) Class131_Sub3.aClass119_4118.method1007(0);
	     class131_sub3_25_ != null;
	     class131_sub3_25_ = (Class131_Sub3) Class131_Sub3
						     .aClass119_4118
						     .method1014(0)) {
	    if ((class131_sub3_25_.anInt4122 ^ 0xffffffff) == (arg8
							       ^ 0xffffffff)
		&& arg1 == class131_sub3_25_.anInt4113
		&& (arg4 ^ 0xffffffff) == (class131_sub3_25_.anInt4105
					   ^ 0xffffffff)
		&& class131_sub3_25_.anInt4120 == arg3) {
		class131_sub3 = class131_sub3_25_;
		break;
	    }
	}
	if (class131_sub3 == null) {
	    class131_sub3 = new Class131_Sub3();
	    class131_sub3.anInt4122 = arg8;
	    class131_sub3.anInt4113 = arg1;
	    class131_sub3.anInt4120 = arg3;
	    class131_sub3.anInt4105 = arg4;
	    Class131_Sub2_Sub30.method1614(class131_sub3, 0);
	    Class131_Sub3.aClass119_4118.method1018((byte) -120,
						    class131_sub3);
	}
	class131_sub3.anInt4107 = arg0;
	class131_sub3.anInt4109 = arg2;
	class131_sub3.anInt4115 = arg9;
	class131_sub3.anInt4117 = arg7;
	class131_sub3.anInt4121 = arg6;
	if (arg5 != -29403)
	    method1736((byte) -86, null);
    }
    
    public void writeByteA(boolean arg0, int arg1) {
	anInt4341++;
	data[offset++] = (byte) (128 + arg1);
	if (arg0 != true)
	    anInt4323 = 38;
    }
    
    public int readUnsignedByte(int arg0) {
	try {
	    anInt4348++;
	    return data[offset++] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.SA(" + + ')');
	}
    }
    
    public int readSignedShort(int arg0) {
	try {
	    offset += 2;
	    anInt4297++;
	    if (arg0 != 1625554944)
		return -65;
	    int i = (((0xff & data[-2 + offset]) << -2024060696)
		     - -(data[-1 + offset] & 0xff));
	    if (i > 32767)
		i -= 65536;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.R(" + arg0 + ')');
	}
    }
    
    public void method1757(byte arg0, int arg1, int arg2, int[] arg3) {
	try {
	    anInt4336++;
	    if (arg0 < 40)
		writeInt(45);
	    int i = offset;
	    offset = arg1;
	    int i_26_ = (-arg1 + arg2) / 8;
	    for (int i_27_ = 0; (i_26_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff);
		 i_27_++) {
		int i_28_ = readUnsignedInt(-2);
		int i_29_ = readUnsignedInt(-2);
		int i_30_ = -957401312;
		int i_31_ = -1640531527;
		int i_32_ = 32;
		while ((i_32_-- ^ 0xffffffff) < -1) {
		    i_29_ -= (((i_28_ >>> -887288507 ^ i_28_ << 1138822660)
			       + i_28_)
			      ^ (arg3[0x37e00003 & i_30_ >>> -1821633909]
				 + i_30_));
		    i_30_ -= i_31_;
		    i_28_ -= (i_29_ + (i_29_ >>> -1387988699
				       ^ i_29_ << 262054212)
			      ^ arg3[0x3 & i_30_] + i_30_);
		}
		offset -= 8;
		writeInt(i_28_);
		writeInt(i_29_);
	    }
	    offset = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.CB(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method1758(int arg0) {
	try {
	    anInt4322++;
	    int i = 0;
	    int i_33_ = readSmart(arg0 ^ ~0x62392290);
	    if (arg0 != 32767)
		method1717(-82, 97);
	    while ((i_33_ ^ 0xffffffff) == -32768) {
		i_33_ = readSmart(-1647926640);
		i += 32767;
	    }
	    i += i_33_;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.NA(" + arg0 + ')');
	}
    }
    
    public int readLE3Bytes(byte arg0) {
	try {
	    anInt4326++;
	    offset += 3;
	    int i = 124 / ((arg0 - 13) / 50);
	    return ((0xff00 & data[offset - 3] << -2002974712)
		    + ((data[-2 + offset] << -622563248
			& 0xff0000)
		       + (data[offset + -1] & 0xff)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.HC(" + arg0 + ')');
	}
    }
    
    public int readUnsignedByteC(int arg0) {
	try {
	    if (arg0 != 4095)
		return -9;
	    anInt4310++;
	    return -data[offset++] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.NB(" + arg0 + ')');
	}
    }
    
    public void method1761(BigInteger arg0, byte arg1, BigInteger arg2) {
	try {
	    /*anInt4307++;
	    if (arg1 <= -113) {
		int i = anInt4360;
		anInt4360 = 0;
		byte[] is = new byte[i];
		method1768(0, i, (byte) -113, is);
		BigInteger biginteger = new BigInteger(is);
		BigInteger biginteger_34_ = biginteger.modPow(arg2, arg0);
		byte[] is_35_ = biginteger_34_.toByteArray();
		anInt4360 = 0;
		writeByte(-110, is_35_.length);
		method1734(0, -111, is_35_, is_35_.length);
	    }*/
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.JA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void writeInt(int arg0) {
	try {
	    data[offset++] = (byte) (arg0 >> -224603784);
	    anInt4308++;
	    data[offset++] = (byte) (arg0 >> 494555664);
	   /*if (arg1 < 124)
		writeLEShort(18, (byte) -39);*/
	    data[offset++] = (byte) (arg0 >> 1685993256);
	    data[offset++] = (byte) arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.W(" + arg0 + ',' + arg0
						 + ')'));
	}
    }
    
    public int readUnsignedShortA(boolean arg0) {
	try {
	    if (arg0 != false)
		return 99;
	    offset += 2;
	    anInt4318++;
	    return ((-128 + data[-1 + offset] & 0xff)
		    + (0xff00 & data[offset + -2] << 1257944136));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.TB(" + arg0 + ')');
	}
    }
    
    public void writeLEShortA(int arg0, int arg1) {
	try {
	    data[offset++] = (byte) (arg1 + 128);
	    if (arg0 == -12614) {
		anInt4334++;
		data[offset++] = (byte) (arg1 >> 1122756488);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.QA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeByte(int arg1) {
	try {
	    anInt4345++;
	    data[offset++] = (byte) arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.CC(" + arg1 + ',' + arg1
						 + ')'));
	}
    }
    
    public byte readSignedByte(byte arg0) {
	try {
	    anInt4329++;
	    if (arg0 < 126)
		read3Bytes(true);
	    return data[offset++];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.MA(" + arg0 + ')');
	}
    }
    
    public int readUnsignedInt2(int arg0) {
	try {
	    anInt4317++;
	    offset += 4;
	    if (arg0 != 0)
		return -96;
	    return ((0xff00 & data[offset + -1] << 1305884392)
		    + (((data[offset - 3] & 0xff) << 818471544)
		       + (0xff0000
			  & data[-4 + offset] << -2113534448))
		    + (0xff & data[-2 + offset]));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.Q(" + arg0 + ')');
	}
    }
    
    public void method1768(int arg0, int arg1, byte arg2, byte[] arg3) {
	try {
	    anInt4363++;
	    if (arg2 < -19) {
		for (int i = arg0; i < arg0 + arg1; i++)
		    arg3[i] = data[offset++];
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.BA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1769(int arg0, int arg1) {
	try {
	    anInt4300++;
	    data[offset++] = (byte) arg0;
	    if (arg1 != -2062)
		anInt4323 = -89;
	    data[offset++] = (byte) (arg0 >> -288905880);
	    data[offset++] = (byte) (arg0 >> -1047377712);
	    data[offset++] = (byte) (arg0 >> 562377624);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.JC(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public String readString(boolean arg0) {
	try {
	    anInt4356++;
	    int i = offset;
	    while (data[offset++] != 0) {
		/* empty */
	    }
	    int i_36_ = -1 + (offset + -i);
	    if (i_36_ == 0)
		return "";
	    if (arg0 != false)
		method1744(-45, -112);
	    return Class131_Sub8_Sub1.method1682(i_36_, i, 4238,
						 data);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.OA(" + arg0 + ')');
	}
    }
    
    public void method1771(int arg0, int arg1) {
	try {
	    anInt4327++;
	    if (arg0 != 32768)
		method1718(9, -38, true, 2, 112, -117);
	    if (arg1 >= 0 && (arg1 ^ 0xffffffff) > -129)
		writeByte(arg1);
	    else if (arg1 >= 0 && arg1 < 32768)
		writeShort(arg1 + 32768);
	    else
		throw new IllegalArgumentException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.S(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static boolean method1772(int arg0, Class19 arg1, int arg2,
				     int arg3, int arg4, int arg5, int arg6,
				     int arg7, int arg8, int arg9, int arg10) {
	try {
	    anInt4349++;
	    int i = arg3;
	    int i_37_ = arg5;
	    int i_38_ = 64;
	    int i_39_ = 64;
	    int i_40_ = arg3 - i_38_;
	    client.anIntArrayArray3487[i_38_][i_39_] = 99;
	    int i_41_ = -i_39_ + arg5;
	    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_][i_39_] = 0;
	    int i_42_ = 0;
	    Class183.anIntArray2615[i_42_] = i;
	    int i_43_ = 0;
	    Class116.anIntArray1490[i_42_++] = i_37_;
	    int[][] is = arg1.clipping;
	    while (i_43_ != i_42_) {
		i = Class183.anIntArray2615[i_43_];
		i_37_ = Class116.anIntArray1490[i_43_];
		i_38_ = -i_40_ + i;
		i_43_ = 0xfff & i_43_ + 1;
		i_39_ = -i_41_ + i_37_;
		int i_44_ = i + -arg1.anInt206;
		int i_45_ = i_37_ + -arg1.anInt218;
		int i_46_ = arg2;
	    while_3_:
		do {
		while_2_:
		    do {
		    while_1_:
			do {
			while_0_:
			    do {
				do {
				    if ((i_46_ ^ 0xffffffff) != 3) {
					if (i_46_ != -3) {
					    if ((i_46_ ^ 0xffffffff) != 1) {
						if ((i_46_ ^ 0xffffffff)
						    != 0) {
						    if (i_46_ == 0
							|| (i_46_
							    ^ 0xffffffff) == -2
							|| (i_46_
							    ^ 0xffffffff) == -3
							|| i_46_ == 3
							|| i_46_ == 9)
							break while_1_;
						    break while_2_;
						}
					    } else
						break;
					    break while_0_;
					}
				    } else {
					if (i == arg0
					    && ((i_37_ ^ 0xffffffff)
						== (arg9 ^ 0xffffffff))) {
					    Class131_Sub41_Sub13.anInt6330 = i;
					    Class75.anInt1022 = i_37_;
					    return true;
					}
					break while_3_;
				    }
				    if (Class138.method2120(i_37_, arg0, i,
							    -11093, arg8, 2, 2,
							    arg7, arg9)) {
					Class131_Sub41_Sub13.anInt6330 = i;
					Class75.anInt1022 = i_37_;
					return true;
				    }
				    break while_3_;
				} while (false);
				if (arg1.method242(arg0, 2, arg4 ^ ~0x4e, arg6,
						   i_37_, i, arg7, arg9, arg8,
						   2)) {
				    Class75.anInt1022 = i_37_;
				    Class131_Sub41_Sub13.anInt6330 = i;
				    return true;
				}
				break while_3_;
			    } while (false);
			    if (arg1.method238(i, arg8, arg9, false, arg6,
					       i_37_, 2, arg7, arg0)) {
				Class75.anInt1022 = i_37_;
				Class131_Sub41_Sub13.anInt6330 = i;
				return true;
			    }
			    break while_3_;
			} while (false);
			if (arg1.method250(arg9, 2, arg10, arg0, arg2,
					   (byte) 112, i, i_37_)) {
			    Class131_Sub41_Sub13.anInt6330 = i;
			    Class75.anInt1022 = i_37_;
			    return true;
			}
			break while_3_;
		    } while (false);
		    if (arg1.method248(i_37_, arg10, 2, arg2, arg9, 121, arg0,
				       i)) {
			Class131_Sub41_Sub13.anInt6330 = i;
			Class75.anInt1022 = i_37_;
			return true;
		    }
		} while (false);
		i_46_ = 1 + (Class131_Sub2_Sub20.anIntArrayArray5837[i_38_]
			     [i_39_]);
		if (i_38_ > 0
		    && client.anIntArrayArray3487[-1 + i_38_][i_39_] == 0
		    && (0x43a40000 & is[-1 + i_44_][i_45_]) == 0
		    && (is[-1 + i_44_][i_45_ - -1] & 0x4e240000) == 0) {
		    Class183.anIntArray2615[i_42_] = i - 1;
		    Class116.anIntArray1490[i_42_] = i_37_;
		    client.anIntArrayArray3487[i_38_ + -1][i_39_] = 2;
		    i_42_ = 0xfff & i_42_ + 1;
		    Class131_Sub2_Sub20.anIntArrayArray5837[-1 + i_38_][i_39_]
			= i_46_;
		}
		if ((i_38_ ^ 0xffffffff) > -127
		    && client.anIntArrayArray3487[i_38_ + 1][i_39_] == 0
		    && (is[2 + i_44_][i_45_] & 0x60e40000 ^ 0xffffffff) == -1
		    && (0x78240000 & is[i_44_ - -2][i_45_ + 1]) == 0) {
		    Class183.anIntArray2615[i_42_] = i + 1;
		    Class116.anIntArray1490[i_42_] = i_37_;
		    i_42_ = 0xfff & 1 + i_42_;
		    client.anIntArrayArray3487[i_38_ + 1][i_39_] = 8;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_ - -1][i_39_]
			= i_46_;
		}
		if ((i_39_ ^ 0xffffffff) < -1
		    && client.anIntArrayArray3487[i_38_][i_39_ + -1] == 0
		    && (is[i_44_][-1 + i_45_] & 0x43a40000) == 0
		    && ((0x60e40000 & is[1 + i_44_][-1 + i_45_] ^ 0xffffffff)
			== -1)) {
		    Class183.anIntArray2615[i_42_] = i;
		    Class116.anIntArray1490[i_42_] = i_37_ + -1;
		    client.anIntArrayArray3487[i_38_][-1 + i_39_] = 1;
		    i_42_ = 0xfff & i_42_ + 1;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_][i_39_ - 1]
			= i_46_;
		}
		if ((i_39_ ^ 0xffffffff) > -127
		    && client.anIntArrayArray3487[i_38_][i_39_ - -1] == 0
		    && (0x4e240000 & is[i_44_][i_45_ + 2]) == 0
		    && (is[1 + i_44_][i_45_ - -2] & 0x78240000) == 0) {
		    Class183.anIntArray2615[i_42_] = i;
		    Class116.anIntArray1490[i_42_] = 1 + i_37_;
		    client.anIntArrayArray3487[i_38_][i_39_ - -1] = 4;
		    i_42_ = 1 + i_42_ & 0xfff;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_][i_39_ - -1]
			= i_46_;
		}
		if ((i_38_ ^ 0xffffffff) < -1 && (i_39_ ^ 0xffffffff) < -1
		    && (client.anIntArrayArray3487[-1 + i_38_][i_39_ - 1]
			^ 0xffffffff) == -1
		    && (0x4fa40000 & is[i_44_ - 1][i_45_] ^ 0xffffffff) == -1
		    && ((0x43a40000 & is[i_44_ - 1][-1 + i_45_] ^ 0xffffffff)
			== -1)
		    && (0x63e40000 & is[i_44_][i_45_ + -1]) == 0) {
		    Class183.anIntArray2615[i_42_] = -1 + i;
		    Class116.anIntArray1490[i_42_] = i_37_ + -1;
		    i_42_ = 0xfff & i_42_ + 1;
		    client.anIntArrayArray3487[-1 + i_38_][i_39_ + -1] = 3;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_ + -1]
			[-1 + i_39_]
			= i_46_;
		}
		if (i_38_ < 126 && i_39_ > 0
		    && (client.anIntArrayArray3487[i_38_ + 1][-1 + i_39_]
			^ 0xffffffff) == -1
		    && (0x63e40000 & is[1 + i_44_][i_45_ + -1]) == 0
		    && ((is[i_44_ - -2][i_45_ - 1] & 0x60e40000 ^ 0xffffffff)
			== -1)
		    && ((0x78e40000 & is[i_44_ - -2][i_45_] ^ 0xffffffff)
			== -1)) {
		    Class183.anIntArray2615[i_42_] = 1 + i;
		    Class116.anIntArray1490[i_42_] = -1 + i_37_;
		    i_42_ = i_42_ - -1 & 0xfff;
		    client.anIntArrayArray3487[1 + i_38_][i_39_ - 1] = 9;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_ + 1]
			[-1 + i_39_]
			= i_46_;
		}
		if ((i_38_ ^ 0xffffffff) < -1 && i_39_ < 126
		    && (client.anIntArrayArray3487[i_38_ - 1][i_39_ - -1]
			^ 0xffffffff) == -1
		    && (is[i_44_ - 1][1 + i_45_] & 0x4fa40000) == 0
		    && ((is[-1 + i_44_][2 + i_45_] & 0x4e240000 ^ 0xffffffff)
			== -1)
		    && ((0x7e240000 & is[i_44_][i_45_ + 2] ^ 0xffffffff)
			== -1)) {
		    Class183.anIntArray2615[i_42_] = -1 + i;
		    Class116.anIntArray1490[i_42_] = i_37_ - -1;
		    client.anIntArrayArray3487[-1 + i_38_][i_39_ - -1] = 6;
		    i_42_ = 0xfff & i_42_ - -1;
		    Class131_Sub2_Sub20.anIntArrayArray5837[-1 + i_38_][(i_39_
									 + 1)]
			= i_46_;
		}
		if ((i_38_ ^ 0xffffffff) > -127 && i_39_ < 126
		    && client.anIntArrayArray3487[1 + i_38_][i_39_ - -1] == 0
		    && ((is[1 + i_44_][i_45_ + 2] & 0x7e240000 ^ 0xffffffff)
			== -1)
		    && ((0x78240000 & is[2 + i_44_][2 + i_45_] ^ 0xffffffff)
			== -1)
		    && (is[i_44_ - -2][1 + i_45_] & 0x78e40000) == 0) {
		    Class183.anIntArray2615[i_42_] = i + 1;
		    Class116.anIntArray1490[i_42_] = i_37_ - -1;
		    i_42_ = 0xfff & 1 + i_42_;
		    client.anIntArrayArray3487[1 + i_38_][i_39_ - -1] = 12;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i_38_ + 1][(i_39_
									+ 1)]
			= i_46_;
		}
	    }
	    Class75.anInt1022 = i_37_;
	    if (arg4 != 1)
		return false;
	    Class131_Sub41_Sub13.anInt6330 = i;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.CA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ')'));
	}
    }
    
    public void method1773(int arg0, int arg1) {
	try {
	    data[offset++] = (byte) arg1;
	    anInt4320++;
	    if (arg0 != 677910600)
		data = null;
	    data[offset++] = (byte) (arg1 >> 677910600);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.IA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void writeInt1(byte arg0, int arg1) {
	data[offset++] = (byte) (arg1 >> 587541000);
	anInt4301++;
	data[offset++] = (byte) arg1;
	data[offset++] = (byte) (arg1 >> -1072044872);
	data[offset++] = (byte) (arg1 >> -1844246544);
	if (arg0 >= -5)
	    offset = -24;
    }
    
    public int method1775(byte arg0) {
	try {
	    anInt4305++;
	    if (arg0 != 35)
		return 45;
	    int i = 0xff & data[offset];
	    if ((i ^ 0xffffffff) <= -129)
		return -49152 + readUnsignedShort(8104);
	    return -64 + readUnsignedByte(arg0 + -147);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.EC(" + arg0 + ')');
	}
    }
    
    public void writeShortA(int arg0, byte arg1) {
	try {
	    anInt4303++;
	    data[offset++] = (byte) (arg0 >> 130279336);
	    data[offset++] = (byte) (arg0 + 128);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.EA(" + arg0 + ',' + arg0
						 + ')'));
	}
    }
    
    public void writeByteS(int arg0) {
	try {
		data[offset++] = (byte) (128 + -arg0);
		anInt4357++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.FA(" + arg0 + ',' + arg0
						 + ')'));
	}
    }
    
    public Stream(int arg0) {
	try {
	    offset = 0;
	    data = Class81.method790(-23323, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.<init>(" + arg0 + ')');
	}
    }
    
    public long readLong(int arg0) {
	try {
	    anInt4306++;
	    int i = -93 % ((arg0 - 41) / 50);
	    long l = (long) readUnsignedInt(-2) & 0xffffffffL;
	    long l_47_ = 0xffffffffL & (long) readUnsignedInt(-2);
	    return (l << 295408672) + l_47_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.P(" + arg0 + ')');
	}
    }
    
    public String method1779(int arg0) {
	try {
	    anInt4296++;
	    if (data[offset] == 0) {
		offset++;
		return null;
	    }
	    if (arg0 != -22016)
		return null;
	    return readString(false);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.U(" + arg0 + ')');
	}
    }
    
    public Stream(byte[] arg0) {
	try {
	    data = arg0;
	    offset = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method1780(int arg0) {
	try {
	    offset -= 4;
	    anInt4311++;
	    int i = Class64.method672(-5, offset, data, 0);
	    int i_48_ = readUnsignedInt(-2);
	    if (arg0 > -54)
		return true;
	    if ((i ^ 0xffffffff) == (i_48_ ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"il.T(" + arg0 + ')');
	}
    }
    
    public void method1781(byte arg0, int arg1) {
	try {
	    if (arg0 != -55)
		anInt4299 = 23;
	    anInt4313++;
	    if ((arg1 & ~0x7f ^ 0xffffffff) != -1) {
		if ((~0x3fff & arg1) != 0) {
		    if ((~0x1fffff & arg1 ^ 0xffffffff) != -1) {
			if ((arg1 & ~0xfffffff) != 0)
			    writeByte(arg1 >>> -841188 | 0x80);
			writeByte(arg1 >>> 619483541 | 0x80);
		    }
		    writeByte(0x80 | arg1 >>> -1589385682);
		}
		writeByte((0x4028 | arg1) >>> -2014028121);
	    }
	    writeByte(0x7f & arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("il.AA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
