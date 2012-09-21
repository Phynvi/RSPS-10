/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class143
{
    public static int anInt1896;
    public static int anInt1897;
    public static int anInt1898;
    public static int anInt1899;
    public static int anInt1900;
    public static int anInt1901;
    public static int anInt1902;
    public static boolean aBoolean1903;
    public static int anInt1904;
    public int anInt1905;
    public static int[] anIntArray1906 = new int[200];
    public static int anInt1907;
    public static int anInt1908 = 0;
    public int anInt1909;
    public static String aString1910;
    public int anInt1911;
    public static int method2141
	(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5,
	 int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, int arg13, Class19 arg14) { //routefinder steps
	try {
	    anInt1896++;
	    for (int i = 0; (i ^ 0xffffffff) > -129; i++) {
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -129; i_0_++) {
		    client.anIntArrayArray3487[i][i_0_] = 0;
		    Class131_Sub2_Sub20.anIntArrayArray5837[i][i_0_]
			= 99999999;
		}
	    }
	    if (arg6 != -12757)
		return -104;
	    boolean bool;
	    if ((arg9 ^ 0xffffffff) == -2) //routefind something
		bool = Class131_Sub23.method1822(arg11, arg14, arg3, arg0,
						 arg10, arg13, arg12, arg2,
						 arg8, arg1, (byte) 101);
	    else if ((arg9 ^ 0xffffffff) == -3)
		bool = Stream.method1772(arg12, arg14, arg11, arg2, 1,
						 arg0, arg1, arg8, arg13,
						 arg10, arg3);
	    else
		bool = Class9.method183(arg13, arg9, arg8, arg10, arg3, arg11,
					arg0, arg1, arg12, arg2, -1, arg14);
	    int i = -64 + arg2;
	    int i_1_ = -64 + arg0;
	    int i_2_ = Class131_Sub41_Sub13.anInt6330;
	    int i_3_ = Class75.anInt1022;
		 if (!bool) {
			//client.sendMessage("YERFY IS OWNER");
		if (!arg5) {
		    return -1;
		}
		int i_4_ = 2147483647;
		int i_5_ = 2147483647;
		int i_6_ = 10;
		for (int i_7_ = arg12 + -i_6_;
		     (i_7_ ^ 0xffffffff) >= (arg12 - -i_6_ ^ 0xffffffff);
		     i_7_++) {
		    for (int i_8_ = -i_6_ + arg10; i_8_ <= arg10 - -i_6_;
			 i_8_++) {
			int i_9_ = i_7_ + -i;
			int i_10_ = i_8_ - i_1_;
			if ((i_9_ ^ 0xffffffff) <= -1
			    && (i_10_ ^ 0xffffffff) <= -1
			    && (i_9_ ^ 0xffffffff) > -129
			    && (i_10_ ^ 0xffffffff) > -129
			    && (Class131_Sub2_Sub20.anIntArrayArray5837[i_9_]
				[i_10_]) < 100) {
			    int i_11_ = 0;
			    if (arg12 <= i_7_) {
				if (-1 + arg12 + arg13 < i_7_)
				    i_11_ = -arg12 + (-arg13 - -1 + i_7_);
			    } else
				i_11_ = -i_7_ + arg12;
			    int i_12_ = 0;
			    if ((arg10 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
				i_12_ = -i_8_ + arg10;
			    else if ((arg10 - (-arg8 + 1) ^ 0xffffffff)
				     > (i_8_ ^ 0xffffffff))
				i_12_ = 1 + -arg8 + -arg10 + i_8_;
			    int i_13_ = i_11_ * i_11_ + i_12_ * i_12_;
			    if ((i_13_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)
				|| ((i_13_ ^ 0xffffffff) == (i_4_ ^ 0xffffffff)
				    && ((Class131_Sub2_Sub20
					 .anIntArrayArray5837[i_9_][i_10_])
					^ 0xffffffff) > (i_5_ ^ 0xffffffff))) {
				i_3_ = i_8_;
				i_5_ = (Class131_Sub2_Sub20.anIntArrayArray5837
					[i_9_][i_10_]);
				i_2_ = i_7_;
				i_4_ = i_13_;
			    }
			}
		    }
		}
		if (i_4_ == 2147483647)
		    return -1;
	    }
	    if ((i_2_ ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		&& (i_3_ ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		return 0;
	    int i_14_ = 0;
	    Class183.anIntArray2615[i_14_] = i_2_;
	    Class116.anIntArray1490[i_14_++] = i_3_;
	    int i_16_;
	    int i_15_
		= i_16_ = client.anIntArrayArray3487[i_2_ - i][-i_1_ + i_3_];
	    while ((arg2 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)
		   || arg0 != i_3_) {
		if (i_15_ != i_16_) {
		    Class183.anIntArray2615[i_14_] = i_2_;
		    i_16_ = i_15_;
		    Class116.anIntArray1490[i_14_++] = i_3_;
		}
		if ((i_15_ & 0x1 ^ 0xffffffff) != -1)
		    i_3_++;
		else if ((0x4 & i_15_ ^ 0xffffffff) != -1)
		    i_3_--;
		if ((0x2 & i_15_ ^ 0xffffffff) == -1) {
		    if ((i_15_ & 0x8) != 0)
			i_2_--;
		} else
		    i_2_++;
		i_15_ = client.anIntArrayArray3487[i_2_ - i][i_3_ + -i_1_];
	    }
	    int i_17_ = 0;
	    while (i_14_-- > 0) {
		arg4[i_17_] = Class183.anIntArray2615[i_14_];
		arg7[i_17_++] = Class116.anIntArray1490[i_14_];
		if (i_17_ >= arg4.length)
		    break;
	    }
	    return i_17_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("pb.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ',' + arg5
			+ ',' + arg6 + ',' + (arg7 != null ? "{...}" : "null")
			+ ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11
			+ ',' + arg12 + ',' + arg13 + ','
			+ (arg14 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method2142(boolean arg0) {
	try {
	    anIntArray1906 = null;
	    if (arg0 != false)
		method2146(-57, null, -34);
	    aString1910 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pb.A(" + arg0 + ')');
	}
    }
    
    public Class124 method2143(boolean arg0) {
	try {
	    anInt1902++;
	    if (arg0 != false)
		method2142(false);
	    Class124 class124
		= ((Class124)
		   Class17.aClass214_182.method2780(127, (long) anInt1905));
	    if (class124 != null)
		return class124;
	    class124
		= Class124.method1087(Class154.aClass158_2058, anInt1905, 0);
	    if (class124 != null)
		Class17.aClass214_182.method2773(true, class124,
						 (long) anInt1905);
	    return class124;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pb.J(" + arg0 + ')');
	}
    }
    
    public void method2144(int arg0, boolean arg1, Stream arg2) {
	try {
	    if (arg1 == true) {
		for (;;) {
		    int i = arg2.readUnsignedByte(71);
		    if ((i ^ 0xffffffff) == -1)
			break;
		    method2149(arg2, i, !arg1, arg0);
		}
		anInt1900++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pb.K(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2145(int arg0, int arg1, int arg2, int arg3) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 != null) {
	    Class23_Sub2 class23_sub2 = class147.aClass23_Sub2_1972;
	    Class23_Sub2 class23_sub2_18_ = class147.aClass23_Sub2_1951;
	    if (class23_sub2 != null) {
		class23_sub2.anInt3712 = class23_sub2.anInt3712 * arg3 / 16;
		class23_sub2.anInt3706 = class23_sub2.anInt3706 * arg3 / 16;
	    }
	    if (class23_sub2_18_ != null) {
		class23_sub2_18_.anInt3712
		    = class23_sub2_18_.anInt3712 * arg3 / 16;
		class23_sub2_18_.anInt3706
		    = class23_sub2_18_.anInt3706 * arg3 / 16;
	    }
	}
    }
    
    public static int method2146(int arg0, Random arg1, int arg2) {
	try {
	    anInt1907++;
	    if (arg2 <= 0)
		throw new IllegalArgumentException();
	    if (Class131_Sub2_Sub31.method1624(false, arg2))
		return (int) ((((long) arg1.nextInt() & 0xffffffffL)
			       * (long) arg2)
			      >> 2044605728);
	    if (arg0 != 2044605728)
		return 54;
	    int i = -2147483648 + -(int) (4294967296L % (long) arg2);
	    int i_19_;
	    do
		i_19_ = arg1.nextInt();
	    while (i <= i_19_);
	    return Class131_Sub13.method1703((byte) 21, arg2, i_19_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pb.H(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2147(int arg0) {
	try {
	    Class220.aClass214_3212.method2783(-128);
	    if (arg0 != 0)
		method2151((byte) 16);
	    anInt1899++;
	    Class131_Sub2.aClass214_4098.method2783(-118);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pb.F(" + arg0 + ')');
	}
    }
    
    public static void method2148(int arg0) {
	try {
	    if (arg0 <= 9)
		anInt1908 = -53;
	    anInt1898++;
	    synchronized (Class137.aClass214_1834) {
		Class137.aClass214_1834.method2783(-79);
	    }
	    synchronized (Class131_Sub2_Sub10.aClass214_5693) {
		Class131_Sub2_Sub10.aClass214_5693.method2783(-123);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pb.B(" + arg0 + ')');
	}
    }
    
    public void method2149(Stream arg0, int arg1, boolean arg2,
			   int arg3) {
	try {
	    if ((arg1 ^ 0xffffffff) != -2) {
		if ((arg1 ^ 0xffffffff) == -3) {
		    anInt1911 = arg0.readUnsignedByte(63);
		    anInt1909 = arg0.readUnsignedByte(77);
		}
	    } else
		anInt1905 = arg0.readUnsignedShort(8104);
	    if (arg2 != false)
		method2148(-115);
	    anInt1901++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pb.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method2150(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	try {
	    anInt1897++;
	    int i = 10 % ((-32 - arg1) / 55);
	    if (Class126.method1108((byte) -92, arg9))
		client.method70((Class131_Sub2_Sub9.aClass173ArrayArray5684
				 [arg9]),
				-1, arg3, arg0, arg7, arg5, arg4, arg2, arg8,
				arg6);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pb.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public static void method2151(byte arg0) {
	try {
	    int i = -117 % ((74 - arg0) / 45);
	    anInt1904++;
	    Class93.aClass214_1218.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pb.C(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean1903 = false;
    }
}
