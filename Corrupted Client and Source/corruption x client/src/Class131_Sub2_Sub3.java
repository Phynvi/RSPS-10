/* Class131_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub3 extends Class131_Sub2
{
    public static short[] aShortArray5585 = { 49, 51, 10, 28, 59, 21, 20, 16 };
    public static int anInt5586;
    public static Class158 aClass158_5587;
    public static int anInt5588;
    public static Class152 aClass152_5589;
    public static short[] aShortArray5590 = { -10304, 9104, -1, -1, -1 };
    public static int anInt5591;
    public static char[] aCharArray5592 = { '[', ']', '#' };
    public static int anInt5593;
    
    public Class131_Sub2_Sub3() {
	super(1, true);
    }
    
    public static Class131_Sub9 method1485(int arg0, boolean arg1,
					   Class158 arg2) {
	try {
	    anInt5588++;
	    byte[] is = arg2.method2358(arg0, -106);
	    if (arg1 != false)
		aClass158_5587 = null;
	    if (is == null)
		return null;
	    return new Class131_Sub9(is);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bj.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		return null;
	    anInt5591++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -113);
	    if (aClass200_4087.aBoolean2927) {
		int[][] is_0_ = this.method1463(0, (byte) 124, arg1);
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		for (int i = 0; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++)
		    is[i] = (is_1_[i] - -is_2_[i] + is_3_[i]) / 3;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bj.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1486(int arg0) {
	anInt5593++;
	for (int i = 0; Class57.anInt746 > i; i++) {
	    Class119.anIntArray1556[i]--;
	    if ((Class119.anIntArray1556[i] ^ 0xffffffff) > 9) {
		Class57.anInt746--;
		for (int i_4_ = i;
		     (Class57.anInt746 ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		     i_4_++) {
		    Class154.anIntArray2056[i_4_]
			= Class154.anIntArray2056[i_4_ - -1];
		    Class23_Sub3.aClass16Array3723[i_4_]
			= Class23_Sub3.aClass16Array3723[1 + i_4_];
		    Class69.anIntArray928[i_4_]
			= Class69.anIntArray928[i_4_ - -1];
		    Class119.anIntArray1556[i_4_]
			= Class119.anIntArray1556[1 + i_4_];
		    InputStream_Sub1.anIntArray58[i_4_]
			= InputStream_Sub1.anIntArray58[i_4_ + 1];
		    Class46_Sub1.anIntArray3805[i_4_]
			= Class46_Sub1.anIntArray3805[i_4_ + 1];
		}
		i--;
	    } else {
		Class16 class16 = Class23_Sub3.aClass16Array3723[i];
		if (class16 == null) {
		    class16 = Class16.method226(Class135.aClass158_1814,
						Class154.anIntArray2056[i], 0);
		    if (class16 == null)
			continue;
		    Class119.anIntArray1556[i] += class16.method224();
		    Class23_Sub3.aClass16Array3723[i] = class16;
		}
		if ((Class119.anIntArray1556[i] ^ 0xffffffff) > -1) {
		    int i_5_;
		    if (InputStream_Sub1.anIntArray58[i] != 0) {
			int i_6_
			    = 128 * (0xff & InputStream_Sub1.anIntArray58[i]);
			int i_7_
			    = ((InputStream_Sub1.anIntArray58[i] & 0xff950e)
			       >> 490670384);
			int i_8_ = (128 * i_7_ + 64
				    - (Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .anInt3733));
			if (i_8_ < 0)
			    i_8_ = -i_8_;
			int i_9_ = ((InputStream_Sub1.anIntArray58[i] & 0xfffb)
				    >> 640945288);
			int i_10_
			    = (-Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
			       + (i_9_ * 128 - -64));
			if (i_10_ < 0)
			    i_10_ = -i_10_;
			int i_11_ = -128 + i_10_ + i_8_;
			if (i_11_ > i_6_) {
			    Class119.anIntArray1556[i] = -100;
			    continue;
			}
			if ((i_11_ ^ 0xffffffff) > -1)
			    i_11_ = 0;
			i_5_ = (Class46_Sub1.anIntArray3805[i]
				* InputStream_Sub1.anInt55 * (-i_11_ + i_6_)
				/ i_6_) >> -1099090872;
		    } else
			i_5_ = (Class46_Sub1.anIntArray3805[i]
				* Class23_Sub4_Sub2.anInt5380) >> 2085921416;
		    if (i_5_ > 0) {
			Class131_Sub12_Sub1 class131_sub12_sub1
			    = class16.method225()
				  .method1700(Class49.aClass71_653);
			Class131_Sub1_Sub2 class131_sub1_sub2
			    = Class131_Sub1_Sub2
				  .method1401(class131_sub12_sub1, 100, i_5_);
			class131_sub1_sub2
			    .method1435(-1 + Class69.anIntArray928[i]);
			Class78.aClass131_Sub1_Sub3_1057
			    .method1446(class131_sub1_sub2);
		    }
		    Class119.anIntArray1556[i] = -100;
		}
	    }
	}
	if (Class23_Sub2.aBoolean3718 && !Class121_Sub2.method1048(0)) {
	    if ((Class212.anInt3112 ^ 0xffffffff) != -1
		&& (Class131_Sub2_Sub10.anInt5705 ^ 0xffffffff) != 0)
		Class115.method978(Class131_Sub2_Sub10.anInt5705, 0,
				   Class212.anInt3112, 73, false,
				   Class156.aClass158_2074);
	    Class23_Sub2.aBoolean3718 = false;
	} else if (Class212.anInt3112 != 0
		   && (Class131_Sub2_Sub10.anInt5705 ^ 0xffffffff) != 0
		   && !Class121_Sub2.method1048(0)) {
	    Class131_Sub20.anInt4430++;
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(176);
	    Class93.aClass131_Sub15_Sub2_1226
		.writeInt(Class131_Sub2_Sub10.anInt5705);
	    Class131_Sub2_Sub10.anInt5705 = -1;
	}
	if (arg0 < 40)
	    aShortArray5585 = null;
    }
    
    public static void method1487(int arg0, int arg1, Class183 arg2, int arg3,
				  Class152 arg4, int arg5, Class173 arg6,
				  int arg7) {
	try {
	    anInt5586++;
	    if (arg4 != null) {
		int i;
		if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -5)
		    i = 0x3fff & (int) Class120.aFloat1578;
		else
		    i = ((int) Class120.aFloat1578 - -Class148.anInt1982
			 & 0x3fff);
		int i_12_
		    = Math.max(arg6.anInt2411 / 2, arg6.anInt2437 / 2) - -10;
		int i_13_ = arg1 * arg1 + arg7 * arg7;
		if ((i_12_ * i_12_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) {
		    int i_14_ = Class31.anIntArray434[i];
		    int i_15_ = Class31.anIntArray425[i];
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) != -5) {
			i_14_ = 256 * i_14_ / (256 + Class1_Sub7.anInt3590);
			i_15_ = 256 * i_15_ / (Class1_Sub7.anInt3590 + 256);
		    }
		    int i_16_ = i_15_ * arg7 + i_14_ * arg1 >> 740047375;
		    int i_17_ = -(arg7 * i_14_) + i_15_ * arg1 >> -513542705;
		    arg4.method2214((arg6.anInt2411 / 2
				     + (arg0
					+ (i_16_ - arg4.method2216() / 2))),
				    -i_17_ + (arg5
					      - (-(arg6.anInt2437 / 2)
						 + arg4.method2198() / arg3)),
				    arg2, arg0, arg5);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("bj.F(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7
			+ ')'));
	}
    }
    
    public static void method1488(int arg0) {
	try {
	    aCharArray5592 = null;
	    aClass152_5589 = null;
	    aClass158_5587 = null;
	    aShortArray5590 = null;
	    if (arg0 < -6)
		aShortArray5585 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bj.D(" + arg0 + ')');
	}
    }
}
