/* Class131_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub1 extends Class131_Sub2
{
    public static int anInt5551;
    public int anInt5552;
    public static Class158 aClass158_5553;
    public static int anInt5554;
    public static int anInt5555;
    public static int anInt5556;
    public static short aShort5557 = 1;
    public static int anInt5558;
    public static int anInt5559;
    public static int anInt5560;
    public static int anInt5561 = 0;
    public static int anInt5562;
    public static int anInt5563;
    public int anInt5564 = 4;
    public static boolean aBoolean5565;
    public static int anInt5566;
    public static int anInt5567;
    public static int anInt5568;
    public static int anInt5569;
    public static boolean aBoolean5570;
    public static int[] anIntArray5571;
    
    public static void method1472(Class173 arg0, int arg1, Class55 arg2,
				  Class44 arg3, Class183 arg4, int arg5,
				  String arg6, int arg7, int arg8, byte arg9,
				  int arg10, int arg11) {
	try {
	    anInt5568++;
	    int i;
	    if (Class131_Sub2_Sub34.anInt6035 == 4)
		i = (int) Class120.aFloat1578 & 0x3fff;
	    else
		i = Class148.anInt1982 + (int) Class120.aFloat1578 & 0x3fff;
	    int i_0_ = 10 + Math.max(arg0.anInt2411 / 2, arg0.anInt2437 / 2);
	    int i_1_ = arg8 * arg8 + arg1 * arg1;
	    if ((i_1_ ^ 0xffffffff) >= (i_0_ * i_0_ ^ 0xffffffff)) {
		int i_2_ = Class31.anIntArray434[i];
		int i_3_ = Class31.anIntArray425[i];
		if (Class131_Sub2_Sub34.anInt6035 != 4) {
		    i_3_ = 256 * i_3_ / (Class1_Sub7.anInt3590 + 256);
		    i_2_ = 256 * i_2_ / (Class1_Sub7.anInt3590 + 256);
		}
		int i_4_ = i_2_ * arg8 + arg1 * i_3_ >> 773591407;
		if (arg9 <= 31)
		    anInt5561 = -39;
		int i_5_ = -(i_2_ * arg1) + arg8 * i_3_ >> -2089791601;
		int i_6_ = arg2.method617((byte) -68, 100, arg6, null);
		i_4_ -= i_6_ / 2;
		int i_7_ = arg2.method618(null, arg6, 100, 1, 0);
		if ((-arg0.anInt2411 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)
		    && (arg0.anInt2411 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)
		    && (-arg0.anInt2437 ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)
		    && arg0.anInt2437 >= i_5_)
		    arg3.method533(null, arg4, arg10, 0,
				   -i_7_ + (arg0.anInt2437 / 2 + arg10 + -i_5_
					    - arg5),
				   0, arg7, arg11, 50, 0, 23008, arg6, null,
				   arg0.anInt2411 / 2 + arg7 + i_4_, i_6_, 1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("b.F(" + (arg0 != null ? "{...}" : "null") + ',' + arg1
			+ ',' + (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7 + ','
			+ arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11
			+ ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		method1455(-21, (byte) 114, null);
	    anInt5567++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 83);
	    if (aClass200_4087.aBoolean2927) {
		int i = Class131_Sub2_Sub7.anInt5637 / anInt5552;
		int i_8_ = Class120_Sub2.anInt3975 / anInt5564;
		int[] is_9_;
		if ((i_8_ ^ 0xffffffff) >= -1)
		    is_9_ = this.method1459(0, (byte) -40, 0);
		else {
		    int i_10_ = arg1 % i_8_;
		    is_9_ = this.method1459(0, (byte) -40,
					    (i_10_ * Class120_Sub2.anInt3975
					     / i_8_));
		}
		for (int i_11_ = 0;
		     ((i_11_ ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i_11_++) {
		    if ((i ^ 0xffffffff) < -1) {
			int i_12_ = i_11_ % i;
			is[i_11_]
			    = is_9_[i_12_ * Class131_Sub2_Sub7.anInt5637 / i];
		    } else
			is[i_11_] = is_9_[0];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("b.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class154 method1473
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
	 Class154 arg6, Class130 arg7, int arg8, int arg9, int arg10) {
	try {
	    anInt5566++;
	    int i = 76 / ((arg0 - 56) / 42);
	    long l = (long) arg9;
	    Class154 class154
		= (Class154) Class71.aClass214_944.method2780(127, l);
	    int i_13_ = 1031;
	    if (class154 == null) {
		Class116 class116
		    = Class134.method2097(arg9, 0, Class57.aClass158_752, 1);
		if (class116 == null)
		    return null;
		class154 = arg7.method1218(class116, i_13_, Class160.anInt2131,
					   64, 768);
		Class71.aClass214_944.method2773(true, class154, l);
	    }
	    class154 = class154.method2287((byte) 2, i_13_, true);
	    if (arg1 != 0)
		class154.method2264(arg1);
	    if (arg2 != 0)
		class154.method2288(arg2);
	    if (arg5 != 0)
		class154.method2251(arg5);
	    if ((arg8 ^ 0xffffffff) != -1)
		class154.method2272(0, arg8, 0);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("b.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + arg4 + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ',' + arg10 + ')'));
	}
    }
    
    public static void method1474(Class130 arg0, int arg1) {
	try {
	    anInt5554++;
	    if (arg1 != 0)
		aBoolean5565 = true;
	    if (Class131_Sub2_Sub24.aBoolean5890)
		Class209.method2753(-122, arg0);
	    else
		Class131_Sub2.method1467(arg0, -25084);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("b.K("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method1475(byte arg0) {
	try {
	    anInt5558++;
	    Class22.anInt247 = -1;
	    if (arg0 == 50)
		Class131_Sub20.aClass152_4423 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"b.H(" + arg0 + ')');
	}
    }
    
    public static void method1476(int arg0) {
	aClass158_5553 = null;
	anIntArray5571 = null;
	if (arg0 != 1)
	    method1476(101);
    }
    
    public Class131_Sub2_Sub1() {
	super(1, false);
	anInt5552 = 4;
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5556++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int i = Class131_Sub2_Sub7.anInt5637 / anInt5552;
		int i_14_ = Class120_Sub2.anInt3975 / anInt5564;
		int[][] is_15_;
		if ((i_14_ ^ 0xffffffff) >= -1)
		    is_15_ = this.method1463(0, (byte) 127, 0);
		else {
		    int i_16_ = arg0 % i_14_;
		    is_15_ = this.method1463(0, (byte) 115,
					     (Class120_Sub2.anInt3975 * i_16_
					      / i_14_));
		}
		int[] is_17_ = is_15_[0];
		int[] is_18_ = is_15_[1];
		int[] is_19_ = is_15_[2];
		int[] is_20_ = is[0];
		int[] is_21_ = is[1];
		int[] is_22_ = is[2];
		for (int i_23_ = 0;
		     ((i_23_ ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i_23_++) {
		    int i_24_;
		    if (i > 0) {
			int i_25_ = i_23_ % i;
			i_24_ = i_25_ * Class131_Sub2_Sub7.anInt5637 / i;
		    } else
			i_24_ = 0;
		    is_20_[i_23_] = is_17_[i_24_];
		    is_21_[i_23_] = is_18_[i_24_];
		    is_22_[i_23_] = is_19_[i_24_];
		}
	    }
	    if (arg1 != 0)
		return null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("b.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static long method1477(int arg0, String arg1) {
	try {
	    anInt5559++;
	    int i = arg1.length();
	    long l = 0L;
	    for (int i_26_ = 0; i > i_26_; i_26_++)
		l = -l + (l << 187991173) - -(long) arg1.charAt(i_26_);
	    if (arg0 != -1)
		method1474(null, 109);
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("b.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1478(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		aClass158_5553 = null;
	    anInt5569++;
	    if ((Class214.anInt3139 ^ 0xffffffff) != -1)
		Class183_Sub1.anInt4962 = arg0;
	    else
		Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
		    .method1377(1570943944, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("b.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5551++;
	if (arg1 == -49) {
	    int i = arg0;
	    do {
		if (i != 0) {
		    if (i != 1)
			break;
		} else {
		    anInt5552 = arg2.readUnsignedByte(101);
		    break;
		}
		anInt5564 = arg2.readUnsignedByte(arg1 ^ 0xf);
	    } while (false);
	}
    }
    
    static {
	anInt5555 = 0;
	anInt5560 = 0;
	aBoolean5565 = false;
	aBoolean5570 = false;
    }
}
