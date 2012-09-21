/* Class183_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class183_Sub1 extends Class183
{
    public static int anInt4951;
    public static boolean[] aBooleanArray4952 = new boolean[200];
    public static int anInt4953;
    public int[] anIntArray4954;
    public static Class139 aClass139_4955;
    public static boolean aBoolean4956 = false;
    public static int anInt4957;
    public static int anInt4958;
    public static int anInt4959;
    public static Class130 aClass130_4960;
    public static int anInt4961;
    public static int anInt4962;
    public int[] anIntArray4963;
    public static int anInt4964 = 0;
    public static int anInt4965 = 0;
    
    public static void method2541(byte arg0) {
	anInt4957++;
	Class23_Sub4_Sub4.aClass214_5403.method2783(-83);
	if (arg0 != -1)
	    anInt4964 = 73;
    }
    
    public static void method2542(byte arg0) {
	try {
	    while ((Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.method1785(Class131_Sub8_Sub1.anInt6100, (byte) 112)
		    ^ 0xffffffff)
		   <= -28) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readBits(15, false);
		if ((i ^ 0xffffffff) == -32768)
		    break;
		boolean bool = false;
		if (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i]
		    == null) {
		    Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i]
			= new Class23_Sub4_Sub1_Sub1();
		    bool = true;
		    Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i]
			.anInt5274
			= i;
		}
		Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		    = Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i];
		Class131_Sub41_Sub12.anIntArray6316
		    [Class131_Sub41_Sub2.anInt6186++]
		    = i;
		class23_sub4_sub1_sub1.anInt5285 = Class125.anInt1632;
		if (class23_sub4_sub1_sub1.aClass66_6474 != null
		    && class23_sub4_sub1_sub1.aClass66_6474.method691(0))
		    Class131_Sub35.method1873(true, class23_sub4_sub1_sub1);
		int i_0_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(1, false);
		int i_1_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(1, false);
		if ((i_1_ ^ 0xffffffff) == -2)
		    Class128_Sub1.anIntArray4019[Class202.anInt2943++] = i;
		int i_2_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(5, false);
		if ((i_2_ ^ 0xffffffff) < -16)
		    i_2_ -= 32;
		class23_sub4_sub1_sub1.method349
		    (114, (Class131_Sub41_Sub7.method1971
			   (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(14, false),
			    95)));
		int i_3_ = (Class138.anIntArray1857
			    [Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readBits(3, false)]);
		int i_4_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(5, false);
		class23_sub4_sub1_sub1.method340(true,
						 (class23_sub4_sub1_sub1
						  .aClass66_6474.anInt839));
		if (i_4_ > 15)
		    i_4_ -= 32;
		class23_sub4_sub1_sub1.anInt5310
		    = (class23_sub4_sub1_sub1.aClass66_6474.anInt853
		       << 1847067587);
		if (class23_sub4_sub1_sub1.anInt5310 == 0)
		    class23_sub4_sub1_sub1.method338(-109, 0);
		else if (bool)
		    class23_sub4_sub1_sub1.method338(-84, i_3_);
		class23_sub4_sub1_sub1.method328
		    (i_4_ + (Class166.aClass23_Sub4_Sub1_Sub2_2216
			     .anIntArray5328[0]),
		     i_0_ == 1, 16383,
		     class23_sub4_sub1_sub1.method335((byte) -116),
		     Class29.anInt300,
		     i_2_ + (Class166.aClass23_Sub4_Sub1_Sub2_2216
			     .anIntArray5331[0]));
		if (class23_sub4_sub1_sub1.aClass66_6474.method691(0))
		    Class131_Sub2_Sub10.method1513
			(null, 0, class23_sub4_sub1_sub1.anIntArray5331[0],
			 class23_sub4_sub1_sub1, false, Class29.anInt300, null,
			 class23_sub4_sub1_sub1.anIntArray5328[0]);
	    }
	    if (arg0 != 101)
		anInt4965 = -34;
	    anInt4951++;
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1788(320);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"on.F(" + arg0 + ')');
	}
    }
    
    public static boolean method2543(byte arg0, char arg1) {
	try {
	    int i = 24 % ((-5 - arg0) / 59);
	    anInt4953++;
	    if ((arg1 ^ 0xffffffff) > -49 || (arg1 ^ 0xffffffff) < -58)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("on.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2544(int arg0, int arg1, int arg2, byte arg3) {
	Class23_Sub2_Sub1.aByteArrayArrayArray4992
	    = new byte[arg2][arg1][arg0];
	anInt4961++;
	if (arg3 <= 74)
	    aClass130_4960 = null;
    }
    
    public static void method2545(byte arg0) {
	anInt4959++;
	if (arg0 < 102)
	    method2546(-47, 7, null);
	Class8 class8 = null;
	try {
	    Class139 class139 = Class23_Sub4.aSignLink_3734.method2684(16389);
	    while (class139.anInt1864 == 0)
		Class187.method2575(-36, 1L);
	    if (class139.anInt1864 == 1) {
		class8 = (Class8) class139.anObject1866;
		byte[] is = new byte[(int) class8.method172(-112)];
		int i;
		for (int i_5_ = 0; i_5_ < is.length; i_5_ += i) {
		    i = class8.method173(is.length + -i_5_, is, i_5_, 0);
		    if ((i ^ 0xffffffff) == 0)
			throw new IOException("EOF");
		}
		Class118.method1001(104, new Stream(is));
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (class8 == null)
		    break;
		class8.method170(1);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method2546(int arg0, int arg1, Class173[] arg2) {
	try {
	    for (int i = arg1; (arg2.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class173 class173 = arg2[i];
		if (class173 != null && arg0 == class173.anInt2456
		    && (!class173.aBoolean2355
			|| !client.method54(class173))) {
		    if ((class173.anInt2470 ^ 0xffffffff) == -1) {
			if (!class173.aBoolean2355 && client.method54(class173)
			    && Class1_Sub7.aClass173_3585 != class173)
			    continue;
			method2546(class173.anInt2455, arg1, arg2);
			if (class173.aClass173Array2326 != null)
			    method2546(class173.anInt2455, 0,
				       class173.aClass173Array2326);
			Class131_Sub33 class131_sub33
			    = ((Class131_Sub33)
			       Class83.aClass180_1096
				   .method2521(69, (long) class173.anInt2455));
			if (class131_sub33 != null)
			    Class131_Sub2_Sub26.method1596((byte) -123,
							   (class131_sub33
							    .anInt4556));
		    }
		    if ((class173.anInt2470 ^ 0xffffffff) == -7) {
			if (class173.anInt2443 != -1
			    || (class173.anInt2298 ^ 0xffffffff) != 0) {
			    boolean bool
				= Class44.method532(class173, (byte) 57);
			    int i_6_;
			    if (bool)
				i_6_ = class173.anInt2298;
			    else
				i_6_ = class173.anInt2443;
			    if (i_6_ != -1) {
				Class161 class161
				    = Class145.method2159(i_6_, (byte) -113);
				if (class161 != null) {
				    class173.anInt2338 += Class42.anInt563;
				    while ((class173.anInt2338 ^ 0xffffffff)
					   < ((class161.anIntArray2153
					       [class173.anInt2484])
					      ^ 0xffffffff)) {
					class173.anInt2338
					    -= (class161.anIntArray2153
						[class173.anInt2484]);
					class173.anInt2484++;
					if ((class173.anInt2484 ^ 0xffffffff)
					    <= (class161.anIntArray2139.length
						^ 0xffffffff)) {
					    class173.anInt2484
						-= class161.anInt2163;
					    if ((class173.anInt2484
						 ^ 0xffffffff) > -1
						|| (((class161
						      .anIntArray2139).length
						     ^ 0xffffffff)
						    >= (class173.anInt2484
							^ 0xffffffff)))
						class173.anInt2484 = 0;
					}
					class173.anInt2481
					    = 1 + class173.anInt2484;
					if (class173.anInt2481
					    >= (class161
						.anIntArray2139).length) {
					    class173.anInt2481
						-= class161.anInt2163;
					    if (class173.anInt2481 < 0
						|| ((class173.anInt2481
						     ^ 0xffffffff)
						    <= ((class161
							 .anIntArray2139).length
							^ 0xffffffff)))
						class173.anInt2481 = -1;
					}
					Class23_Sub4_Sub4
					    .method383(arg1 ^ ~0x7d, class173);
				    }
				}
			    }
			}
			if (class173.anInt2450 != 0
			    && !class173.aBoolean2355) {
			    int i_7_ = class173.anInt2450 >> -646383920;
			    int i_8_ = (class173.anInt2450 << 1188289776
					>> -514527344);
			    i_7_ *= Class42.anInt563;
			    i_8_ *= Class42.anInt563;
			    class173.anInt2461
				= class173.anInt2461 - -i_7_ & 0x3fff;
			    class173.anInt2482
				= class173.anInt2482 - -i_8_ & 0x3fff;
			    Class23_Sub4_Sub4.method383(arg1 + -105, class173);
			}
		    }
		}
	    }
	    anInt4958++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("on.G(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2547(byte arg0) {
	try {
	    aClass139_4955 = null;
	    if (arg0 != -79)
		aClass139_4955 = null;
	    aBooleanArray4952 = null;
	    aClass130_4960 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"on.D(" + arg0 + ')');
	}
    }
    
    public Class183_Sub1(int arg0, int arg1, int[] arg2, int[] arg3) {
	try {
	    anIntArray4963 = arg3;
	    anIntArray4954 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("on.<init>(" + arg0 + ','
						 + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
