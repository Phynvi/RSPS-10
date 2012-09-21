/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148
{
    public static int anInt1974;
    public static char[] aCharArray1975 = new char[128];
    public static int anInt1976;
    public static Class158 aClass158_1977;
    public static int anInt1978;
    public static String aString1979 = null;
    public static int anInt1980;
    public static boolean aBoolean1981;
    public static int anInt1982 = 0;
    public static int[] anIntArray1983 = new int[250];
    public static int anInt1984;
    
    public static void method2176(Class130 arg0, Class68 arg1, Class19[] arg2,
				  int arg3, boolean arg4, byte arg5) {
	try {
	    anInt1980++;
	    if (!arg4) {
		for (int i = 0; i < 4; i++) {
		    for (int i_0_ = 0;
			 i_0_ < Class131_Sub41_Sub11_Sub1.anInt6546; i_0_++) {
			for (int i_1_ = 0;
			     i_1_ < Class131_Sub2_Sub26.anInt5931; i_1_++) {
			    if ((0x1
				 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				    [i][i_0_][i_1_]))
				!= 0) {
				int i_2_ = i;
				if (((Class23_Sub2_Sub1
				      .aByteArrayArrayArray4992[1][i_0_]
				      [i_1_]) & 0x2
				     ^ 0xffffffff)
				    != -1)
				    i_2_--;
				if ((i_2_ ^ 0xffffffff) <= -1)
				    arg2[i_2_].method244(i_1_, -53, i_0_);
			    }
			}
		    }
		}
	    }
	    int[][] is = (new int[Class131_Sub41_Sub11_Sub1.anInt6546]
			  [Class131_Sub2_Sub26.anInt5931]);
	    if (arg5 >= -103)
		method2177(63, -21, -109, false, true);
	    for (int i = 0; (i ^ 0xffffffff) > (arg3 ^ 0xffffffff); i++) {
		for (int i_3_ = 0;
		     ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
		      < (i_3_ ^ 0xffffffff));
		     i_3_++) {
		    Class131_Sub3.anIntArray4127[i_3_] = 0;
		    Class131_Sub22.anIntArray4448[i_3_] = 0;
		    Class78.anIntArray1054[i_3_] = 0;
		    Class131_Sub41_Sub11.anIntArray6301[i_3_] = 0;
		    Class83.anIntArray1097[i_3_] = 0;
		}
		for (int i_4_ = -5; i_4_ < Class131_Sub41_Sub11_Sub1.anInt6546;
		     i_4_++) {
		    for (int i_5_ = 0; i_5_ < Class131_Sub2_Sub26.anInt5931;
			 i_5_++) {
			int i_6_ = 5 + i_4_;
			if (i_6_ < Class131_Sub41_Sub11_Sub1.anInt6546) {
			    int i_7_ = 0xff & (Class88.aByteArrayArrayArray1150
					       [i][i_6_][i_5_]);
			    if ((i_7_ ^ 0xffffffff) < -1) {
				Class108 class108
				    = Class186.method2561(-114, i_7_ + -1);
				Class131_Sub3.anIntArray4127[i_5_]
				    += class108.anInt1408;
				Class131_Sub22.anIntArray4448[i_5_]
				    += class108.anInt1410;
				Class78.anIntArray1054[i_5_]
				    += class108.anInt1411;
				Class131_Sub41_Sub11.anIntArray6301[i_5_]
				    += class108.anInt1413;
				Class83.anIntArray1097[i_5_]++;
			    }
			}
			int i_8_ = i_4_ - 5;
			if ((i_8_ ^ 0xffffffff) <= -1) {
			    int i_9_ = 0xff & (Class88.aByteArrayArrayArray1150
					       [i][i_8_][i_5_]);
			    if (i_9_ > 0) {
				Class108 class108
				    = Class186.method2561(-128, i_9_ + -1);
				Class131_Sub3.anIntArray4127[i_5_]
				    -= class108.anInt1408;
				Class131_Sub22.anIntArray4448[i_5_]
				    -= class108.anInt1410;
				Class78.anIntArray1054[i_5_]
				    -= class108.anInt1411;
				Class131_Sub41_Sub11.anIntArray6301[i_5_]
				    -= class108.anInt1413;
				Class83.anIntArray1097[i_5_]--;
			    }
			}
		    }
		    if (i_4_ >= 0) {
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = 0;
			for (int i_15_ = -5;
			     ((i_15_ ^ 0xffffffff)
			      > (Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff));
			     i_15_++) {
			    int i_16_ = i_15_ - -5;
			    if (Class131_Sub2_Sub26.anInt5931 > i_16_) {
				i_11_ += Class131_Sub22.anIntArray4448[i_16_];
				i_13_ += (Class131_Sub41_Sub11.anIntArray6301
					  [i_16_]);
				i_14_ += Class83.anIntArray1097[i_16_];
				i_10_ += Class131_Sub3.anIntArray4127[i_16_];
				i_12_ += Class78.anIntArray1054[i_16_];
			    }
			    int i_17_ = -5 + i_15_;
			    if (i_17_ >= 0) {
				i_11_ -= Class131_Sub22.anIntArray4448[i_17_];
				i_10_ -= Class131_Sub3.anIntArray4127[i_17_];
				i_14_ -= Class83.anIntArray1097[i_17_];
				i_13_ -= (Class131_Sub41_Sub11.anIntArray6301
					  [i_17_]);
				i_12_ -= Class78.anIntArray1054[i_17_];
			    }
			    if ((i_15_ ^ 0xffffffff) <= -1
				&& (i_13_ ^ 0xffffffff) < -1 && i_14_ > 0)
				is[i_4_][i_15_]
				    = Class180.method2526(i_11_ / i_14_,
							  i_12_ / i_14_,
							  i_10_ * 256 / i_13_,
							  13552);
			}
		    }
		}
		Class131_Sub41_Sub11_Sub1.method2006
		    (arg0, Class121_Sub3_Sub1.aByteArrayArrayArray5434[i],
		     Class131_Sub2_Sub26.anInt5931,
		     Class75.aClass68Array1023[i],
		     Class88.aByteArrayArrayArray1150[i],
		     Class17.aByteArrayArrayArray184[i],
		     Class131_Sub41_Sub11_Sub1.anInt6546, (byte) 79, arg1, is,
		     arg4, i,
		     Class131_Sub41_Sub18.aByteArrayArrayArray6402[i]);
		Class88.aByteArrayArrayArray1150[i] = null;
		Class17.aByteArrayArrayArray184[i] = null;
		Class131_Sub41_Sub18.aByteArrayArrayArray6402[i] = null;
		Class121_Sub3_Sub1.aByteArrayArrayArray5434[i] = null;
	    }
	    if (!arg4) {
		if (Class167.aBoolean2235)
		    Class184.method2552();
		if ((Class131_Sub2_Sub16.anInt5779 ^ 0xffffffff) != -1)
		    Class163.method2402();
	    }
	    for (int i = 0; i < arg3; i++)
		Class75.aClass68Array1023[i].method713();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("pn.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static void method2177(int arg0, int arg1, int arg2, boolean arg3,
				  boolean arg4) {
	try {
	    anInt1974++;
	    Class131_Sub2_Sub4.aLong5601 = 0L;
	    int i = Class131_Sub18.method1806(-32);
	    if ((arg0 ^ 0xffffffff) == -4 || (i ^ 0xffffffff) == -4)
		arg3 = true;
	    if (!Class183_Sub1.aClass130_4960.method1170())
		arg3 = true;
	    Class33.method446(arg1, i, arg4, arg0, arg3, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pn.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2178(int arg0) {
	try {
	    Class131_Sub9.aFont4200 = null;
	    if (arg0 != -172)
		anInt1984 = 64;
	    anInt1978++;
	    Class126.anImage1701 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pn.C(" + arg0 + ')');
	}
    }
    
    public static void method2179(int arg0) {
	try {
	    if (arg0 < 6)
		aString1979 = null;
	    aCharArray1975 = null;
	    aClass158_1977 = null;
	    aString1979 = null;
	    anIntArray1983 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pn.B(" + arg0 + ')');
	}
    }
    
    public static void method2180(byte arg0, long arg1) {
	try {
	    if (arg0 > 52) {
		anInt1976++;
		try {
		    Thread.sleep(arg1);
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pn.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aBoolean1981 = false;
	anInt1984 = 500;
    }
}
