/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class115 implements Runnable
{
    public static int anInt1474;
    public volatile boolean aBoolean1475;
    public static int anInt1476;
    public static int anInt1477 = 100;
    public volatile Class215[] aClass215Array1478 = new Class215[2];
    public static int anInt1479;
    public volatile boolean aBoolean1480;
    public static int anInt1481;
    public static int anInt1482;
    public SignLink aSignLink_1483;
    public static int anInt1484;
    public static int anInt1485;
    public static int anInt1486;
    public static int anInt1487;
    public static int anInt1488;

    public static void method978(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4, Class158 arg5) {
	try {
	    anInt1488++;
	    Class183_Sub1.anInt4962 = arg2;
	    Class83.aBoolean1094 = arg4;
	    Class131_Sub20.anInt4432 = arg1;
	    int i = -38 % ((-75 - arg3) / 43);
	    Class131_Sub33.anInt4554 = 10000;
	    Cryption.anInt1824 = arg0;
	    Class214.anInt3139 = 1;
	    Class23_Sub4_Sub5.aClass158_5111 = arg5;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ls.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method979(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt1486++;
	    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(20);
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(arg1);
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(arg4);
	    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg3);
	    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg0);
	    Class35.anInt496 = arg2;
	    Class131_Sub2_Sub21.anInt5854 = 0;
	    Class176.anInt2523 = 1;
	    Class131_Sub2_Sub20.anInt5838 = -3;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ls.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public void run() {
	try {
	    aBoolean1480 = true;
	    anInt1485++;
	    try {
		while (!aBoolean1475) {
		    for (int i = 0; i < 2; i++) {
			Class215 class215 = aClass215Array1478[i];
			if (class215 != null)
			    class215.method2789(95);
		    }
		    Class187.method2575(-45, 10L);
		    client.method68(null, 107, aSignLink_1483);
		}
	    } catch (Exception exception) {
		Class45.method563(null, exception, 0);
	    } finally {
		aBoolean1480 = false;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ls.run(" + ')');
	}
    }
    
    public static void method980(boolean arg0) {
	try {
	    anInt1474++;
	    Class20.aClass180_231.method2519(98);
	    if (arg0 != false)
		anInt1482 = 98;
	    Class34.aClass175_485.method2479((byte) 111);
	    Class131_Sub19.aClass175_4397.method2479((byte) 116);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ls.E(" + arg0 + ')');
	}
    }
    
    public static String method981(int arg0, String arg1) {
	try {
	    anInt1487++;
	    int i = arg1.length();
	    int i_0_ = 0;
	    for (int i_1_ = 0; i > i_1_; i_1_++) {
		char c = arg1.charAt(i_1_);
		if (c == '<' || c == '>')
		    i_0_ += 3;
	    }
	    StringBuffer stringbuffer = new StringBuffer(i - -i_0_);
	    for (int i_2_ = arg0; i_2_ < i; i_2_++) {
		char c = arg1.charAt(i_2_);
		if (c == '<')
		    stringbuffer.append("<lt>");
		else if (c == '>')
		    stringbuffer.append("<gt>");
		else
		    stringbuffer.append(c);
	    }
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ls.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method982(boolean arg0, Class131_Sub21 arg1) {
	try {
	    anInt1476++;
	    if (!Class131_Sub2_Sub24.aBoolean5890) {
		arg1.method1355((byte) 125);
		if (arg0 != false)
		    method982(false, null);
		Class147.anInt1946--;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ls.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method983(int arg0, int arg1, int arg2) {
	try {
	    anInt1484++;
	    if (arg1 != 1923345732)
		return 112;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(58,
							       (long) arg2));
	    if (class131_sub13 == null)
		return -1;
	    if ((arg0 ^ 0xffffffff) > -1
		|| arg0 >= class131_sub13.anIntArray4257.length)
		return -1;
	    return class131_sub13.anIntArray4257[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ls.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method984(boolean arg0) {
	try {
	    anInt1479++;
	    Class81.method789(4, Class141.anInt1876);
	    int i = ((Class2.anInt84 >> 493912522)
		     + (Class92.regionX >> 881886403));
	    int i_3_ = ((Class57.anInt753 >> -1538484374)
			+ (Class64.regionY >> 1808995907));
	    int i_4_ = 0;
	    int i_5_ = 8;
	    int i_6_ = 8;
	    int i_7_ = 18;
	    Class88.aByteArrayArray1146 = new byte[i_7_][];
	    Class60.aByteArrayArray788 = new byte[i_7_][];
	    Class108.aByteArrayArray1420 = new byte[i_7_][];
	    Class212.aByteArrayArray3115 = new byte[i_7_][];
	    Class166.anIntArray2218 = new int[i_7_];
	    Class131_Sub2_Sub16.anIntArray5777 = new int[i_7_];
	    Class23.aByteArrayArray254 = new byte[i_7_][];
	    Class74.anIntArray1003 = new int[i_7_];
	    Class23_Sub3.anIntArray3719 = new int[i_7_];
	    Class131_Sub2_Sub14.anIntArrayArray5746 = new int[i_7_][4];
	    Class131_Sub41_Sub2.anIntArray6182 = new int[i_7_];
	    Class131_Sub41_Sub18.anIntArray6403 = new int[i_7_];
	    i_7_ = 0;
	    for (int i_8_ = (-(Class131_Sub41_Sub11_Sub1.anInt6546
			       >> -1623184028)
			     + i) / 8;
		 i_8_ <= ((Class131_Sub41_Sub11_Sub1.anInt6546 >> 561345988)
			  + i) / 8;
		 i_8_++) {
		for (int i_9_ = (-(Class131_Sub2_Sub26.anInt5931
				   >> -1274701820)
				 + i_3_) / 8;
		     i_9_ <= ((Class131_Sub2_Sub26.anInt5931 >> 1923345732)
			      + i_3_) / 8;
		     i_9_++) {
		    int i_10_ = i_9_ + (i_8_ << -2006941208);
		    Class74.anIntArray1003[i_7_] = i_10_;
		    Class166.anIntArray2218[i_7_]
			= Class37.aClass158_504
			      .method2359(108, "m" + i_8_ + "_" + i_9_);
		    Class23_Sub3.anIntArray3719[i_7_]
			= Class37.aClass158_504
			      .method2359(121, "l" + i_8_ + "_" + i_9_);
		    Class131_Sub41_Sub18.anIntArray6403[i_7_]
			= Class37.aClass158_504
			      .method2359(119, "n" + i_8_ + "_" + i_9_);
		    Class131_Sub41_Sub2.anIntArray6182[i_7_]
			= Class37.aClass158_504
			      .method2359(111, "um" + i_8_ + "_" + i_9_);
		    Class131_Sub2_Sub16.anIntArray5777[i_7_]
			= Class37.aClass158_504
			      .method2359(110, "ul" + i_8_ + "_" + i_9_);
		    if ((Class131_Sub41_Sub18.anIntArray6403[i_7_]
			 ^ 0xffffffff)
			== 0) {
			Class166.anIntArray2218[i_7_] = -1;
			Class23_Sub3.anIntArray3719[i_7_] = -1;
			Class131_Sub41_Sub2.anIntArray6182[i_7_] = -1;
			Class131_Sub2_Sub16.anIntArray5777[i_7_] = -1;
		    }
		    i_7_++;
		}
	    }
	    for (int i_11_ = i_7_;
		 ((i_11_ ^ 0xffffffff)
		  > (Class131_Sub41_Sub18.anIntArray6403.length ^ 0xffffffff));
		 i_11_++) {
		Class131_Sub41_Sub18.anIntArray6403[i_11_] = -1;
		Class166.anIntArray2218[i_11_] = -1;
		Class23_Sub3.anIntArray3719[i_11_] = -1;
		Class131_Sub41_Sub2.anIntArray6182[i_11_] = -1;
		Class131_Sub2_Sub16.anIntArray5777[i_11_] = -1;
	    }
	    Class110_Sub3.method948(true, i_3_, arg0, i, i_6_, i_4_, 24, i_5_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ls.G(" + arg0 + ')');
	}
    }
    
    public Class115() {
	aBoolean1475 = false;
	aBoolean1480 = false;
    }
}
