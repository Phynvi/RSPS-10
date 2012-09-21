/* Class131_Sub2_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub34 extends Class131_Sub2
{
    public static int anInt6029;
    public static int anInt6030;
    public static int anInt6031;
    public static int anInt6032 = 0;
    public static boolean aBoolean6033;
    public static int anInt6034;
    public static int anInt6035;
    public static int anInt6036;
    public static int anInt6037;
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt6036++;
	    if (arg0 != -11543)
		return null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 119);
	    if (aClass200_4087.aBoolean2927) {
		int[] is_0_ = this.method1459(0, (byte) -40, arg1);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++)
		    is[i] = -is_0_[i] + 4096;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ti.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub34() {
	super(1, false);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt6030++;
	    if (arg1 != 0)
		method1462(60, -122);
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_1_ = this.method1463(0, (byte) 117, arg0);
		int[] is_2_ = is_1_[0];
		int[] is_3_ = is_1_[1];
		int[] is_4_ = is_1_[2];
		int[] is_5_ = is[0];
		int[] is_6_ = is[1];
		int[] is_7_ = is[2];
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    is_5_[i] = -is_2_[i] + 4096;
		    is_6_[i] = -is_3_[i] + 4096;
		    is_7_[i] = -is_4_[i] + 4096;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ti.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method1629(boolean arg0, String arg1) {
	try {
	    if (arg0 != true)
		method1631(true, -125);
	    anInt6031++;
	    for (int i = 0; (i ^ 0xffffffff) > (Class14.aStringArray155.length
						^ 0xffffffff); i++) {
		if (Class14.aStringArray155[i].equalsIgnoreCase(arg1))
		    return i;
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ti.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method1630(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    anInt6029++;
	    if (Class75.aClass68Array1023 == null)
		return 0;
	    if (arg0 != -668)
		return 11;
	    if ((arg3 ^ 0xffffffff) > -4) {
		int i = arg1 >> 832734919;
		int i_8_ = arg5 >> 1011150471;
		if (arg4 < 0 || (arg2 ^ 0xffffffff) > -1
		    || ((arg4 ^ 0xffffffff)
			< (-1 + Class131_Sub41_Sub11_Sub1.anInt6546
			   ^ 0xffffffff))
		    || arg2 > Class131_Sub2_Sub26.anInt5931 + -1)
		    return 0;
		if ((i ^ 0xffffffff) > -2 || i_8_ < 1
		    || Class131_Sub41_Sub11_Sub1.anInt6546 + -1 < i
		    || i_8_ > -1 + Class131_Sub2_Sub26.anInt5931)
		    return 0;
		boolean bool
		    = (((Class23_Sub2_Sub1.aByteArrayArrayArray4992[1]
			 [arg1 >> -1787732185][arg5 >> 918631719]) & 0x2
			^ 0xffffffff)
		       != -1);
		if ((0x7f & arg1 ^ 0xffffffff) == -1) {
		    boolean bool_9_
			= ((0x2 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [1][-1 + i][arg5 >> -242691833])
			    ^ 0xffffffff)
			   != -1);
		    boolean bool_10_
			= ((0x2 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [1][i][arg5 >> 1179762631]))
			   != 0);
		    if (!bool_10_ != !bool_9_)
			bool = ((Class23_Sub2_Sub1.aByteArrayArrayArray4992[1]
				 [arg4][arg2]) & 0x2
				^ 0xffffffff) != -1;
		}
		if ((arg5 & 0x7f ^ 0xffffffff) == -1) {
		    boolean bool_11_
			= ((0x2 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [1][arg1 >> -1506973465][-1 + i_8_])
			    ^ 0xffffffff)
			   != -1);
		    boolean bool_12_
			= ((0x2 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [1][arg1 >> 1110081223][i_8_]))
			   != 0);
		    if (bool_12_ == !bool_11_)
			bool = (0x2
				& (Class23_Sub2_Sub1.aByteArrayArrayArray4992
				   [1][arg4][arg2])) != 0;
		}
		if (bool)
		    arg3++;
	    }
	    return Class75.aClass68Array1023[arg3].method720(arg1, arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ti.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	if (arg0 == 0)
	    aBoolean4093 = (arg2.readUnsignedByte(arg1 ^ 0x45) ^ 0xffffffff) == -2;
	anInt6034++;
	if (arg1 != -49)
	    anInt6032 = 32;
    }
    
    public static void method1631(boolean arg0, int arg1) {
	try {
	    anInt6037++;
	    if (!arg0 != !aBoolean6033) {
		aBoolean6033 = arg0;
		Class131_Sub30.method1854(104);
		int i = -121 / ((11 - arg1) / 50);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ti.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1632(Class138 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	arg0.anInt1852 = 0;
	for (int i = 0; i < 4; i++) {
	    if (arg0.aClass131_Sub8_Sub1Array1851[i] != null)
		arg0.anInt1852++;
	}
    while_103_:
	for (int i = 0; i < arg0.anInt1852; i++) {
	    int i_13_ = Class64.anIntArrayArrayArray810[arg1][arg2][arg3];
	    while (i_13_ != 0) {
		Class131_Sub8_Sub1 class131_sub8_sub1
		    = (Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707
		       [(i_13_ & 0xff) - 1]);
		i_13_ >>>= 8;
		if (class131_sub8_sub1 == arg0.aClass131_Sub8_Sub1Array1851[i])
		    continue while_103_;
	    }
	    i_13_ = Class64.anIntArrayArrayArray810[arg1][arg4][arg5];
	    while (i_13_ != 0) {
		Class131_Sub8_Sub1 class131_sub8_sub1
		    = (Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707
		       [(i_13_ & 0xff) - 1]);
		i_13_ >>>= 8;
		if (class131_sub8_sub1 == arg0.aClass131_Sub8_Sub1Array1851[i])
		    continue while_103_;
	    }
	    for (int i_14_ = i; i_14_ < arg0.anInt1852 - 1; i_14_++)
		arg0.aClass131_Sub8_Sub1Array1851[i_14_]
		    = arg0.aClass131_Sub8_Sub1Array1851[i_14_ + 1];
	    arg0.anInt1852--;
	}
    }
}
