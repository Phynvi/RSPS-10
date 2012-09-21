/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151
{
    public static int anInt2010;
    public static volatile boolean aBoolean2011 = true;
    public static int anInt2012;
    public static int anInt2013;
    public static int anInt2014;
    public static int anInt2015;
    public static Class214 aClass214_2016 = new Class214(8);
    public static int anInt2017;
    public int anInt2018;
    public static int anInt2019;
    public static int[] anIntArray2020 = new int[5];
    public int anInt2021;
    public static int anInt2022;
    public static Class106 aClass106_2023 = Class125.method1096((byte) 118);
    public int anInt2024;
    public static int[][] anIntArrayArray2025;
    
    public static void method2190(boolean arg0) {
	try {
	    if (arg0 == false) {
		aClass214_2016 = null;
		anIntArray2020 = null;
		anIntArrayArray2025 = null;
		aClass106_2023 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ps.B(" + arg0 + ')');
	}
    }
    
    public void method2191(byte arg0, Stream arg1) {
	try {
	    anInt2010++;
	    if (arg0 != -9)
		anInt2018 = 50;
	    for (;;) {
		int i = arg1.readUnsignedByte(99);
		if (i == 0)
		    break;
		method2196(arg1, i, -4531);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ps.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2192(Class158 arg0, int arg1) {
	try {
	    Class207.aClass158_3027 = arg0;
	    if (arg1 != 2)
		method2193(true, null);
	    anInt2022++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ps.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method2193(boolean arg0, Class23_Sub4_Sub1_Sub2 arg1) {
	try {
	    if (arg0 == true) {
		anInt2017++;
		Class131_Sub19 class131_sub19
		    = ((Class131_Sub19)
		       Class131_Sub23.aClass180_4460
			   .method2521(-124, (long) arg1.anInt5274));
		if (class131_sub19 != null)
		    class131_sub19.method1813(true);
		else
		    Class131_Sub2_Sub10.method1513(arg1, 0,
						   arg1.anIntArray5331[0],
						   null, false,
						   Class29.anInt300, null,
						   arg1.anIntArray5328[0]);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ps.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class112 method2194(int arg0, int arg1) {
	try {
	    anInt2013++;
	    Class112 class112;
	    synchronized (Class131_Sub41_Sub18.aClass214_6398) {
		class112 = (Class112) Class131_Sub41_Sub18.aClass214_6398
					  .method2780(127, (long) arg0);
	    }
	    if (class112 != null)
		return class112;
	    byte[] is = (Class131_Sub13.aClass158_4270.method2364
			 (Class153.method2228(arg0, arg1 + -35566055),
			  Class166.method2422(arg0, (byte) -43), 0));
	    class112 = new Class112();
	    class112.anInt1452 = arg0;
	    if (is != null)
		class112.method957(0, new Stream(is));
	    if (arg1 != -6861)
		return null;
	    synchronized (Class131_Sub41_Sub18.aClass214_6398) {
		Class131_Sub41_Sub18.aClass214_6398.method2773(true, class112,
							       (long) arg0);
	    }
	    return class112;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ps.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2195(int arg0) {
	anInt2015++;
	if (arg0 == -1) {
	    do {
		try {
		    if ((Class214.anInt3139 ^ 0xffffffff) != -2)
			break;
		    int i = Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
				.method1373((byte) 39);
		    if ((i ^ 0xffffffff) < -1
			&& Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			       .method1376(arg0 ^ ~0xf4240)) {
			i -= Class131_Sub33.anInt4554;
			if (i < 0)
			    i = 0;
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			    .method1377(1570943944, i);
		    } else {
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			    .method1368(false);
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			    .method1374(-128);
			if (Class23_Sub4_Sub5.aClass158_5111 != null)
			    Class214.anInt3139 = 2;
			else
			    Class214.anInt3139 = 0;
			Class188.aClass131_Sub26_2757 = null;
			Class131_Sub4.aClass74_4130 = null;
		    }
		} catch (Exception exception) {
		    exception.printStackTrace();
		    Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			.method1368(false);
		    Class214.anInt3139 = 0;
		    Class188.aClass131_Sub26_2757 = null;
		    Class23_Sub4_Sub5.aClass158_5111 = null;
		    Class131_Sub4.aClass74_4130 = null;
		    break;
		}
		break;
	    } while (false);
	}
    }
    
    public void method2196(Stream arg0, int arg1, int arg2) {
	if ((arg1 ^ 0xffffffff) == -2) {
	    anInt2018 = arg0.readUnsignedShort(8104);
	    anInt2024 = arg0.readUnsignedByte(113);
	    anInt2021 = arg0.readUnsignedByte(-23);
	}
	anInt2012++;
	if (arg2 != -4531)
	    aBoolean2011 = true;
    }
    
    public static void method2197(byte[] arg0, boolean arg1, int arg2,
				  int arg3, Class130 arg4, int arg5,
				  Class19[] arg6) {
	try {
	    anInt2014++;
	    Stream stream = new Stream(arg0);
	    if (arg2 > -23)
		anIntArrayArray2025 = null;
	    int i = -1;
	    for (;;) {
		int i_0_ = stream.method1758(32767);
		if ((i_0_ ^ 0xffffffff) == -1)
		    break;
		i += i_0_;
		int i_1_ = 0;
		for (;;) {
		    int i_2_ = stream.readSmart(-1647926640);
		    if ((i_2_ ^ 0xffffffff) == -1)
			break;
		    i_1_ += -1 + i_2_;
		    int i_3_ = i_1_ & 0x3f;
		    int i_4_ = i_1_ >> -176819578 & 0x3f;
		    int i_5_ = i_1_ >> 1504800076;
		    int i_6_ = stream.readUnsignedByte(114);
		    int i_7_ = i_6_ >> -534154942;
		    int i_8_ = 0x3 & i_6_;
		    int i_9_ = arg5 + i_4_;
		    int i_10_ = i_3_ - -arg3;
		    if (i_9_ > 0 && i_10_ > 0
			&& -1 + Class131_Sub41_Sub11_Sub1.anInt6546 > i_9_
			&& ((i_10_ ^ 0xffffffff)
			    > (-1 + Class131_Sub2_Sub26.anInt5931
			       ^ 0xffffffff))) {
			Class19 class19 = null;
			if (!arg1) {
			    int i_11_ = i_5_;
			    if ((0x2
				 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				    [1][i_9_][i_10_]))
				== 2)
				i_11_--;
			    if (i_11_ >= 0)
				class19 = arg6[i_11_];
			}
			Class145.method2168(true, i, arg4, (byte) -91, i_5_,
					    class19, i_7_, i_5_, i_9_, i_8_,
					    i_10_, -1, arg1);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ps.C(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ')'));
	}
    }
}
