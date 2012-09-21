/* Class110_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class110_Sub3 extends Class110
{
    public int anInt3916;
    public static int anInt3917;
    public int anInt3918;
    public int anInt3919;
    public int anInt3920;
    public static int anInt3921;
    public int anInt3922;
    public static int anInt3923;
    public static int anInt3924;
    public static int anInt3925;
    public int anInt3926;
    public int anInt3927;
    public static Class14 aClass14_3928 = new Class14();
    public int anInt3929;
    public static int anInt3930;
    public static Class158 aClass158_3931;
    
    public static void method946(int arg0) {
	try {
	    if (arg0 != 0)
		aClass158_3931 = null;
	    aClass14_3928 = null;
	    aClass158_3931 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mn.J(" + arg0 + ')');
	}
    }
    
    public void method938(int arg0, int arg1, int arg2) {
	anInt3921++;
	if (arg2 != 0)
	    anInt3916 = -38;
    }
    
    public void method936(int arg0, boolean arg1, int arg2) {
	try {
	    anInt3925++;
	    int i = arg2 * anInt3927 >> -1222415412;
	    int i_0_ = anInt3916 * arg0 >> 56607788;
	    int i_1_ = anInt3918 * arg2 >> -2012083700;
	    int i_2_ = anInt3922 * arg0 >> 1318812460;
	    int i_3_ = anInt3919 * arg2 >> -1084944884;
	    int i_4_ = anInt3920 * arg0 >> -1682494836;
	    int i_5_ = anInt3926 * arg2 >> 1825861516;
	    int i_6_ = arg0 * anInt3929 >> 1342712396;
	    Class28.method414(anInt1428, i_2_, i_4_, i_3_, i, i_0_, i_5_, arg1,
			      i_6_, i_1_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mn.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method947(Stream arg0, int arg1) {
	try {
	    anInt3923++;
	    byte[] is = new byte[24];
	    if (Class131_Sub14.aClass163_4286 != null) {
		try {
		    Class131_Sub14.aClass163_4286.method2398(0, 0L);
		    Class131_Sub14.aClass163_4286.method2400(-1, is);
		    int i;
		    for (i = 0; i < 24; i++) {
			if ((is[i] ^ 0xffffffff) != -1)
			    break;
		    }
		    if ((i ^ 0xffffffff) <= -25)
			throw new IOException();
		} catch (Exception exception) {
		    for (int i = 0; i < 24; i++)
			is[i] = (byte) -1;
		}
	    }
	    int i = -108 % ((arg1 - -68) / 32);
	    arg0.method1734(0, -86, is, 24);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mn.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class110_Sub3(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9) {
	super(-1, arg8, arg9);
	try {
	    anInt3926 = arg6;
	    anInt3918 = arg2;
	    anInt3927 = arg0;
	    anInt3919 = arg4;
	    anInt3916 = arg1;
	    anInt3922 = arg3;
	    anInt3929 = arg7;
	    anInt3920 = arg5;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mn.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ','
						 + arg7 + ',' + arg8 + ','
						 + arg9 + ')'));
	}
    }
    
    public static void method948(boolean arg0, int arg1, boolean arg2,
				 int arg3, int arg4, int arg5, int arg6,
				 int arg7) {
	try {
	    anInt3917++;
	    if (arg2 || arg3 != Class131_Sub41_Sub13.anInt6326
		|| Class173.anInt2372 != arg1
		|| (arg5 != Class1_Sub8.anInt3600
		    && !Class9.method182((byte) -32))) {
		Class131_Sub41_Sub13.anInt6326 = arg3;
		Class1_Sub8.anInt3600 = arg5;
		Class173.anInt2372 = arg1;
		if (Class9.method182((byte) 124))
		    Class1_Sub8.anInt3600 = 0;
		if (!arg0)
		    Class175.method2484(25, (byte) -126);
		else
		    Class175.method2484(28, (byte) -126);
		Class131_Sub41_Sub5.method1957(true, arg6 ^ ~0x7485,
					       Class14.aString162,
					       Class184.aClass44_2633);
		int i = Class92.regionX;
		int i_7_ = Class64.regionY;
		Class92.regionX = (Class131_Sub41_Sub13.anInt6326
				     + -(Class131_Sub41_Sub11_Sub1.anInt6546
					 >> -1977238876)) * 8;
		Class64.regionY
		    = 8 * (-(Class131_Sub2_Sub26.anInt5931 >> 787680644)
			   + Class173.anInt2372);
		Class131_Sub2_Sub36.aClass131_Sub41_Sub1_6051
		    = Class127.method1127(Class131_Sub41_Sub13.anInt6326 * 8,
					  8 * Class173.anInt2372);
		Class131_Sub8.aClass177_4188 = null;
		int i_8_ = Class92.regionX + -i;
		int i_9_ = -i_7_ + Class64.regionY;
		if (!arg0) {
		    for (int i_10_ = 0; i_10_ < 32768; i_10_++) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_10_]);
			if (class23_sub4_sub1_sub1 != null) {
			    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -11;
				 i_11_++) {
				class23_sub4_sub1_sub1.anIntArray5328[i_11_]
				    -= i_8_;
				class23_sub4_sub1_sub1.anIntArray5331[i_11_]
				    -= i_9_;
			    }
			    class23_sub4_sub1_sub1.anInt3733 -= 128 * i_8_;
			    class23_sub4_sub1_sub1.anInt3747 -= i_9_ * 128;
			}
		    }
		} else {
		    Class131_Sub41_Sub2.anInt6186 = 0;
		    int i_12_
			= Class131_Sub41_Sub11_Sub1.anInt6546 * 128 - 128;
		    int i_13_ = Class131_Sub2_Sub26.anInt5931 * 128 + -128;
		    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -32769;
			 i_14_++) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_14_]);
			if (class23_sub4_sub1_sub1 != null) {
			    class23_sub4_sub1_sub1.anInt3747 -= 128 * i_9_;
			    class23_sub4_sub1_sub1.anInt3733 -= i_8_ * 128;
			    if ((class23_sub4_sub1_sub1.anInt3733
				 ^ 0xffffffff) > -1
				|| class23_sub4_sub1_sub1.anInt3733 > i_12_
				|| (class23_sub4_sub1_sub1.anInt3747
				    ^ 0xffffffff) > -1
				|| i_13_ < class23_sub4_sub1_sub1.anInt3747) {
				Class23_Sub4_Sub2
				    .aClass23_Sub4_Sub1_Sub1Array5379[i_14_]
				    .method349(-72, null);
				Class23_Sub4_Sub2
				    .aClass23_Sub4_Sub1_Sub1Array5379[i_14_]
				    = null;
			    } else {
				boolean bool = true;
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -11;
				     i_15_++) {
				    class23_sub4_sub1_sub1.anIntArray5328
					[i_15_]
					-= i_8_;
				    class23_sub4_sub1_sub1.anIntArray5331
					[i_15_]
					-= i_9_;
				    if (((class23_sub4_sub1_sub1.anIntArray5328
					  [i_15_])
					 ^ 0xffffffff) > -1
					|| (Class131_Sub41_Sub11_Sub1.anInt6546
					    <= (class23_sub4_sub1_sub1
						.anIntArray5328[i_15_]))
					|| (class23_sub4_sub1_sub1
					    .anIntArray5331[i_15_]) < 0
					|| ((class23_sub4_sub1_sub1
					     .anIntArray5331[i_15_])
					    >= Class131_Sub2_Sub26.anInt5931))
					bool = false;
				}
				if (!bool) {
				    Class23_Sub4_Sub2
					.aClass23_Sub4_Sub1_Sub1Array5379
					[i_14_].method349(arg6 + -146, null);
				    Class23_Sub4_Sub2
					.aClass23_Sub4_Sub1_Sub1Array5379
					[i_14_]
					= null;
				} else
				    Class131_Sub41_Sub12.anIntArray6316
					[Class131_Sub41_Sub2.anInt6186++]
					= i_14_;
			    }
			}
		    }
		}
		for (int i_16_ = 0; i_16_ < 2048; i_16_++) {
		    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_16_];
		    if (class23_sub4_sub1_sub2 != null) {
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -11;
			     i_17_++) {
			    class23_sub4_sub1_sub2.anIntArray5328[i_17_]
				-= i_8_;
			    class23_sub4_sub1_sub2.anIntArray5331[i_17_]
				-= i_9_;
			}
			class23_sub4_sub1_sub2.anInt3733 -= 128 * i_8_;
			class23_sub4_sub1_sub2.anInt3747 -= i_9_ * 128;
		    }
		}
		Class29.anInt300 = arg5;
		Class166.aClass23_Sub4_Sub1_Sub2_2216
		    .method358(false, true, arg4, Class29.anInt300, arg7);
		Class127_Sub1.method1136(i_9_, i_8_, 16383);
		for (Class131_Sub3 class131_sub3
			 = ((Class131_Sub3)
			    Class131_Sub3.aClass119_4118.method1007(0));
		     class131_sub3 != null;
		     class131_sub3
			 = ((Class131_Sub3)
			    Class131_Sub3.aClass119_4118.method1014(0))) {
		    class131_sub3.anInt4105 -= i_9_;
		    class131_sub3.anInt4113 -= i_8_;
		    if ((class131_sub3.anInt4113 ^ 0xffffffff) > -1
			|| class131_sub3.anInt4105 < 0
			|| (class131_sub3.anInt4113
			    >= Class131_Sub41_Sub11_Sub1.anInt6546)
			|| ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			    >= (class131_sub3.anInt4105 ^ 0xffffffff)))
			class131_sub3.method1355((byte) 127);
		}
		Class57.anInt746 = 0;
		if ((Class131_Sub2_Sub6.LocalX ^ 0xffffffff) != -1) {
		    Class131_Sub2_Sub6.LocalX -= i_8_;
		    Class169.LocalY -= i_9_;
		}
		if (!arg0) {
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) != -5)
			Class131_Sub2_Sub34.anInt6035 = 1;
		    else {
			Class131_Sub3.anInt4126 -= 128 * i_9_;
			Class50.anInt657 -= i_9_ * 128;
			Class131_Sub41_Sub9.anInt6275 -= 128 * i_8_;
			Class23_Sub2_Sub2.anInt5169 -= i_8_ * 128;
		    }
		} else {
		    Class57.anInt753 -= 128 * i_9_;
		    Class154.anInt2046 -= i_8_;
		    Class23.anInt250 -= i_8_;
		    Class131_Sub41.anInt4675 -= i_9_;
		    Class1_Sub3.anInt3536 -= i_9_;
		    Class2.anInt84 -= i_8_ * 128;
		    if (Math.abs(i_8_) > Class131_Sub41_Sub11_Sub1.anInt6546
			|| ((Math.abs(i_9_) ^ 0xffffffff)
			    < (Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)))
			Class121_Sub1.method1043(-37);
		}
		Class131_Sub41.method1915((byte) 33);
		Class131_Sub2_Sub1.method1475((byte) 50);
		Class131_Sub2_Sub9.aClass119_5676.method1012(0);
		Class53.aClass119_703.method1012(0);
		Class34.aClass50_491.method587(arg6 ^ arg6);
		Class20.method256((byte) -6);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mn.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public void method934(int arg0, int arg1, byte arg2) {
	try {
	    if (arg2 != 75)
		anInt3922 = -128;
	    anInt3924++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mn.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
