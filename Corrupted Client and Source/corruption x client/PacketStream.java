/* PacketStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PacketStream extends Stream
{
    public static int anInt6118;
    public static int anInt6119;
    public static int anInt6120;
    public int anInt6121;
    public Cryption aCryption_6122;
    public static int anInt6123;
    public static Class147[][][] aClass147ArrayArrayArray6124;
    public static int anInt6125;
    public static int anInt6126;
    public static int anInt6127;
    public static int anInt6128;
    public static int anInt6129;
    public static int anInt6130 = 0;
    public static int anInt6131;
    public static int anInt6132;
    public static int anInt6133;
    public static int anInt6134;
    public static int anInt6135 = -1;
    public static Class163 aClass163_6136;
    public static float aFloat6137;
    public static int anInt6138;

    public static int method1784(int arg0, boolean arg1) {
	try {
	    anInt6120++;
	    long l = Class208.method2749(-3913);
	    for (Class131_Sub32 class131_sub32
		     = (arg1
			? (Class131_Sub32) Class50.aClass180_665.method2520(0)
			: ((Class131_Sub32)
			   Class50.aClass180_665.method2518(0)));
		 class131_sub32 != null;
		 class131_sub32
		     = (Class131_Sub32) Class50.aClass180_665.method2518(0)) {
		if ((0x3fffffffffffffffL & class131_sub32.aLong4550) < l) {
		    if ((class131_sub32.aLong4550 & 0x4000000000000000L
			 ^ 0xffffffffffffffffL)
			!= -1L) {
			int i = (int) class131_sub32.aLong1791;
			Class131_Sub2_Sub13.anIntArray5735[i]
			    = Class79.anIntArray1062[i];
			class131_sub32.method1355((byte) 123);
			return i;
		    }
		    class131_sub32.method1355((byte) 121);
		}
	    }
	    if (arg0 >= -54)
		updateNPC((byte) -17);
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method1785(int arg0, byte arg1) {
	try {
	    anInt6134++;
	    if (arg1 < 100)
		method1786(-77L, -49);
	    return -anInt6121 + arg0 * 8;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1786(long arg0, int arg1) {
	try {
	    anInt6127++;
	    int i = (Class213.anInt3118
		     + Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733);
	    if (arg1 != 2)
		aClass163_6136 = null;
	    int i_0_ = (Class131_Sub2_Sub25.anInt5919
			+ Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747);
	    if ((-i + Class131_Sub41_Sub9.anInt6275 ^ 0xffffffff) > 499
		|| (-i + Class131_Sub41_Sub9.anInt6275 ^ 0xffffffff) < -501
		|| (-i_0_ + Class131_Sub3.anInt4126 ^ 0xffffffff) > 499
		|| (Class131_Sub3.anInt4126 - i_0_ ^ 0xffffffff) < -501) {
		Class131_Sub3.anInt4126 = i_0_;
		Class131_Sub41_Sub9.anInt6275 = i;
	    }
	    if ((i ^ 0xffffffff)
		!= (Class131_Sub41_Sub9.anInt6275 ^ 0xffffffff)) {
		int i_1_ = -Class131_Sub41_Sub9.anInt6275 + i;
		int i_2_ = (int) (arg0 * (long) i_1_ / 320L);
		if (i_1_ > 0) {
		    if (i_2_ == 0)
			i_2_ = 1;
		    else if (i_2_ > i_1_)
			i_2_ = i_1_;
		} else if (i_2_ != 0) {
		    if ((i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
			i_2_ = i_1_;
		} else
		    i_2_ = -1;
		Class131_Sub41_Sub9.anInt6275 += i_2_;
	    }
	    if ((Class131_Sub3.anInt4126 ^ 0xffffffff)
		!= (i_0_ ^ 0xffffffff)) {
		int i_3_ = i_0_ + -Class131_Sub3.anInt4126;
		int i_4_ = (int) ((long) i_3_ * arg0 / 320L);
		if ((i_3_ ^ 0xffffffff) >= -1) {
		    if ((i_4_ ^ 0xffffffff) != -1) {
			if (i_4_ < i_3_)
			    i_4_ = i_3_;
		    } else
			i_4_ = -1;
		} else if (i_4_ == 0)
		    i_4_ = 1;
		else if ((i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
		    i_4_ = i_3_;
		Class131_Sub3.anInt4126 += i_4_;
	    }
	    if (!Class131_Sub6.aBoolean4143) {
		Class23_Sub1_Sub1.aFloat5082
		    += (float) arg0 * Cryption.aFloat1825 / 6.0F;
		Class120.aFloat1578
		    += (float) arg0 * Class131_Sub18.aFloat4378 / 6.0F;
	    }
	    Class172.method2450(-4);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1787(int arg0, int arg1, int arg2, byte[] arg3) {
	try {
	    if (arg2 == 8156) {
		anInt6138++;
		for (int i = 0; (arg1 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		    arg3[i - -arg0]
			= (byte) (data[offset++]
				  + -aCryption_6122.method2107((byte) 119));
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1788(int arg0) {
	try {
	    if (arg0 == 320) {
		offset = (7 + anInt6121) / 8;
		anInt6126++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vg.E(" + arg0 + ')');
	}
    }
    
    public void createPacket(int packetId) {
	try {
		if (packetId == 119 || packetId == 163) {
			data[offset++] = (byte) (packetId + aCryption_6122.method2107((byte) 81));	
			anInt6129++;
			return;
		}
			
		data[offset++] = (byte) (packetId + aCryption_6122.method2107((byte) 81));
		
		anInt6129++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.D("+ packetId
						 + ')'));
	}
    }
    
    public void method1790(int[] arg0, int arg1) {
	try {
	    if (arg1 != 3)
		method1794(-63);
	    aCryption_6122 = new Cryption(arg0);
	    anInt6128++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void updateNPC(byte arg0) {
	try {
	    if (arg0 == -112) {
		Class202.anInt2943 = 0;
		anInt6118++;
		Class131_Sub2_Sub1.anInt5560 = 0;
		Class209.method2758(2);
		Class183_Sub1.method2542((byte) 101);
		Class188.method2591((byte) 120);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub1.anInt5560 ^ 0xffffffff));
		     i++) {
		    int i_5_ = Class131_Sub35.anIntArray4589[i];
		    if (((Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			  [i_5_].anInt5285)
			 ^ 0xffffffff)
			!= (Class125.anInt1632 ^ 0xffffffff)) {
			if (Class23_Sub4_Sub2
				.aClass23_Sub4_Sub1_Sub1Array5379[i_5_]
				.aClass66_6474.method691(arg0 + 112))
			    Class131_Sub35.method1873
				(true,
				 (Class23_Sub4_Sub2
				  .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]));
			Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			    [i_5_].method349(-126, null);
			Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			    [i_5_]
			    = null;
		    }
		}
		if ((Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset
		     ^ 0xffffffff)
		    != (Class131_Sub8_Sub1.anInt6100 ^ 0xffffffff))
		    throw new RuntimeException("gnp1 pos:"
					       + (Class23_Sub3_Sub1
						  .aClass131_Sub15_Sub2_5231
						  .offset)
					       + " psize:"
					       + Class131_Sub8_Sub1.anInt6100);
		for (int i = 0; ((Class131_Sub41_Sub2.anInt6186 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    if ((Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			 [Class131_Sub41_Sub12.anIntArray6316[i]])
			== null)
			throw new RuntimeException("gnp2 pos:" + i + " size:"
						   + (Class131_Sub41_Sub2
						      .anInt6186));
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vg.A(" + arg0 + ')');
	}
    }
    
    public static void method1792(int arg0, int arg1, int arg2, boolean arg3,
				  Class173 arg4) {
	anInt6132++;
	int i = arg4.anInt2411;
	if (arg4.aByte2356 == 0)
	    arg4.anInt2411 = arg4.anInt2440;
	else if ((arg4.aByte2356 ^ 0xffffffff) != -2) {
	    if (arg4.aByte2356 != 2) {
		if ((arg4.aByte2356 ^ 0xffffffff) == -4) {
		    if (arg4.anInt2470 == 2)
			arg4.anInt2411
			    = 32 * arg4.anInt2440 - -(arg4.anInt2332
						      * (-1 + arg4.anInt2440));
		    else if ((arg4.anInt2470 ^ 0xffffffff) == -8)
			arg4.anInt2411
			    = (arg4.anInt2440 * 115
			       + (arg4.anInt2440 - 1) * arg4.anInt2332);
		}
	    } else
		arg4.anInt2411 = arg2 * arg4.anInt2440 >> -1844372882;
	} else
	    arg4.anInt2411 = -arg4.anInt2440 + arg2;
	if (arg0 != 255)
	    anInt6130 = -96;
	int i_6_ = arg4.anInt2437;
	if ((arg4.aByte2341 ^ 0xffffffff) != -1) {
	    if (arg4.aByte2341 == 1)
		arg4.anInt2437 = arg1 + -arg4.anInt2322;
	    else if (arg4.aByte2341 != 2) {
		if (arg4.aByte2341 == 3) {
		    if ((arg4.anInt2470 ^ 0xffffffff) == -3)
			arg4.anInt2437
			    = 32 * arg4.anInt2322 - -((-1 + arg4.anInt2322)
						      * arg4.anInt2414);
		    else if ((arg4.anInt2470 ^ 0xffffffff) == -8)
			arg4.anInt2437
			    = ((arg4.anInt2322 + -1) * arg4.anInt2414
			       + arg4.anInt2322 * 12);
		}
	    } else
		arg4.anInt2437 = arg4.anInt2322 * arg1 >> -1053732754;
	} else
	    arg4.anInt2437 = arg4.anInt2322;
	if ((arg4.aByte2356 ^ 0xffffffff) == -5)
	    arg4.anInt2411 = arg4.anInt2438 * arg4.anInt2437 / arg4.anInt2394;
	if ((arg4.aByte2341 ^ 0xffffffff) == -5)
	    arg4.anInt2437 = arg4.anInt2411 * arg4.anInt2394 / arg4.anInt2438;
	if (Class23_Sub5.aBoolean3761
	    && (client.method66(arg4).anInt4601 != 0
		|| (arg4.anInt2470 ^ 0xffffffff) == -1)) {
	    if (arg4.anInt2437 < 5 && arg4.anInt2411 < 5) {
		arg4.anInt2437 = 5;
		arg4.anInt2411 = 5;
	    } else {
		if (arg4.anInt2411 <= 0)
		    arg4.anInt2411 = 5;
		if (arg4.anInt2437 <= 0)
		    arg4.anInt2437 = 5;
	    }
	}
	if ((arg4.anInt2441 ^ 0xffffffff) == -1338)
	    Class121_Sub1.aClass173_3981 = arg4;
	if (arg3 && arg4.anObjectArray2362 != null
	    && (i != arg4.anInt2411
		|| (i_6_ ^ 0xffffffff) != (arg4.anInt2437 ^ 0xffffffff))) {
	    Class131_Sub14 class131_sub14 = new Class131_Sub14();
	    class131_sub14.anObjectArray4281 = arg4.anObjectArray2362;
	    class131_sub14.aClass173_4276 = arg4;
	    Class87.aClass119_1138.method1018((byte) -122, class131_sub14);
	}
    }
    
    public int method1793(int arg0) {
	try {
	    if (arg0 != 5663)
		anInt6130 = 119;
	    anInt6133++;
	    return ((data[offset++]
		     - aCryption_6122.method2107((byte) -107))
		    & 0xff);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vg.L(" + arg0 + ')');
	}
    }
    
    public void method1794(int arg0) {
	anInt6121 = offset * 8;
	anInt6119++;
	if (arg0 != 115)
	    method1792(-123, 59, -65, true, null);
    }
    
    public static void method1795(Class173 arg0, int arg1) {
	try {
	    anInt6123++;
	    Class173 class173
		= Class131_Sub41_Sub1.method1921(arg0, (byte) 123);
	    int i;
	    int i_7_;
	    if (class173 == null) {
		i_7_ = Class218.anInt3201;
		i = Class131_Sub1_Sub1.anInt5499;
	    } else {
		i = class173.anInt2411;
		i_7_ = class173.anInt2437;
	    }
	    method1792(255, i_7_, i, false, arg0);
	    if (arg1 == 0)
		Class181.method2532(i, true, i_7_, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.M("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int readBits(int arg0, boolean arg1) {
	try {
	    anInt6131++;
	    int i = anInt6121 >> 1779819011;
	    if (arg1 != false)
		anInt6135 = 36;
	    int i_8_ = -(0x7 & anInt6121) + 8;
	    anInt6121 += arg0;
	    int i_9_ = 0;
	    for (/**/; (arg0 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_ = 8) {
		i_9_ += (Class131_Sub2.anIntArray4079[i_8_]
			 & data[i++]) << -i_8_ + arg0;
		arg0 -= i_8_;
	    }
	    if ((i_8_ ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		i_9_ += data[i] & Class131_Sub2.anIntArray4079[i_8_];
	    else
		i_9_ += (data[i] >> -arg0 + i_8_
			 & Class131_Sub2.anIntArray4079[arg0]);
	    return i_9_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vg.N(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public PacketStream(int arg0) {
	super(arg0);
    }
    
    public static void method1797(int arg0) {
	try {
	    if (arg0 != 32452)
		anInt6130 = -89;
	    aClass163_6136 = null;
	    aClass147ArrayArrayArray6124 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vg.C(" + arg0 + ')');
	}
    }
}
