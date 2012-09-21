/* Class131_Sub41_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class131_Sub41_Sub13 extends Class131_Sub41
{
    public static Class158 aClass158_6322;
    public static int anInt6323;
    public static Class214 aClass214_6324 = new Class214(8);
    public static int anInt6325;
    public static int anInt6326;
    public static int anInt6327;
    public static int[] anIntArray6328;
    public static String aString6329 = "Loading sprites - ";
    public static int anInt6330;
    public static int anInt6331;
    
    public static void method2012(int arg0, int arg1, int arg2) {
	try {
	    anInt6327++;
	    int i = Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0];
	    int i_0_
		= Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331[arg0];
	    if ((Class126.anInt1696 ^ 0xffffffff) != -2) {
		if (!Class210.Flag(-3, arg2, 0, 93, arg1, 1, i, i_0_, 0,
					 1, false))
		    Class210.Flag(-2, arg2, 0, arg0 + 113, arg1, 1, i,
					i_0_, 0, 1, false);
	    } else if (!Class210.Flag(-2, arg2, 0, 106, arg1, 1, i, i_0_,
					    0, 1, false))
		Class210.Flag(-3, arg2, 0, 97, arg1, 1, i, i_0_, 0, 1,
				    false);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oc.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static String method2013(int arg0, boolean arg1, int arg2,
				    byte arg3) {
	try {
	    anInt6325++;
	    if ((arg2 ^ 0xffffffff) > -3 || arg2 > 36)
		throw new IllegalArgumentException("Invalid radix:" + arg2);
	    if (!arg1 || arg0 < 0)
		return Integer.toString(arg0, arg2);
	    if (arg3 > -108)
		method2012(109, -6, 17);
	    int i = 2;
	    for (int i_1_ = arg0 / arg2; i_1_ != 0; i_1_ /= arg2)
		i++;
	    char[] cs = new char[i];
	    cs[0] = '+';
	    for (int i_2_ = -1 + i; i_2_ > 0; i_2_--) {
		int i_3_ = arg0;
		arg0 /= arg2;
		int i_4_ = -(arg0 * arg2) + i_3_;
		if ((i_4_ ^ 0xffffffff) <= -11)
		    cs[i_2_] = (char) (i_4_ + 87);
		else
		    cs[i_2_] = (char) (48 + i_4_);
	    }
	    return new String(cs);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oc.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method2014(int arg0, int arg1, byte arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    anInt6331++;
	    int i = 76 % ((arg2 - -77) / 35);
	    if ((arg1 ^ 0xffffffff) == (arg3 ^ 0xffffffff))
		Class18.method232(arg0, false, arg3, arg5, arg4);
	    else if (Class149.anInt1988 > -arg3 + arg0
		     || (Class115.anInt1477 ^ 0xffffffff) > (arg3 + arg0
							     ^ 0xffffffff)
		     || (Class116.anInt1494 ^ 0xffffffff) < (-arg1 + arg5
							     ^ 0xffffffff)
		     || (Class125.anInt1629 ^ 0xffffffff) > (arg5 - -arg1
							     ^ 0xffffffff))
		Class45.method564(arg4, arg1, 21697, arg3, arg5, arg0);
	    else
		Class131_Sub2_Sub17.method1557(arg0, arg3, 4096, arg1, arg4,
					       arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oc.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method2015(byte arg0) {
	try {
	    if (arg0 == 94) {
		aClass214_6324 = null;
		aClass158_6322 = null;
		anIntArray6328 = null;
		aString6329 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"oc.B(" + arg0 + ')');
	}
    }
    
    static {
	anIntArray6328 = new int[6];
    }
}
