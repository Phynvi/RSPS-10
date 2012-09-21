/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58
{
    public static Class152 aClass152_759;
    public static int anInt760;
    public static int anInt761;
    public static int anInt762;
    public static int anInt763 = 0;
    public static int anInt764;
    public static boolean aBoolean765;
    public static int[] anIntArray766
	= { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
    public static int anInt767;
    
    public static void method636(boolean arg0) {
	anIntArray766 = null;
	aClass152_759 = null;
	if (arg0 != true)
	    aClass152_759 = null;
    }
    
    public static void method637(int arg0, int arg1) {
	try {
	    if (arg0 != -4028)
		method637(84, -98);
	    anInt767++;
	    Class173.aClass214_2425 = new Class214(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fr.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method638(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if ((Class125.anInt1629 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
	    && (Class116.anInt1494 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)) {
	    boolean bool;
	    if ((Class149.anInt1988 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)) {
		if ((Class115.anInt1477 ^ 0xffffffff) > (arg1 ^ 0xffffffff)) {
		    bool = false;
		    arg1 = Class115.anInt1477;
		} else
		    bool = true;
	    } else {
		arg1 = Class149.anInt1988;
		bool = false;
	    }
	    boolean bool_0_;
	    if (arg4 >= Class149.anInt1988) {
		if ((Class115.anInt1477 ^ 0xffffffff) > (arg4 ^ 0xffffffff)) {
		    bool_0_ = false;
		    arg4 = Class115.anInt1477;
		} else
		    bool_0_ = true;
	    } else {
		bool_0_ = false;
		arg4 = Class149.anInt1988;
	    }
	    if (Class116.anInt1494 > arg5)
		arg5 = Class116.anInt1494;
	    else
		Class131_Sub3.method1650(arg4,
					 Class56.anIntArrayArray740[arg5++],
					 arg0, arg1, arg2 + -865);
	    if ((arg3 ^ 0xffffffff) < (Class125.anInt1629 ^ 0xffffffff))
		arg3 = Class125.anInt1629;
	    else
		Class131_Sub3.method1650(arg4,
					 Class56.anIntArrayArray740[arg3--],
					 arg0, arg1, arg2 ^ 0x3cd);
	    if (bool && bool_0_) {
		for (int i = arg5; (arg3 ^ 0xffffffff) <= (i ^ 0xffffffff);
		     i++) {
		    int[] is = Class56.anIntArrayArray740[i];
		    is[arg1] = is[arg4] = arg0;
		}
	    } else if (!bool) {
		if (bool_0_) {
		    for (int i = arg5; (arg3 ^ 0xffffffff) <= (i ^ 0xffffffff);
			 i++)
			Class56.anIntArrayArray740[i][arg4] = arg0;
		}
	    } else {
		for (int i = arg5; (i ^ 0xffffffff) >= (arg3 ^ 0xffffffff);
		     i++)
		    Class56.anIntArrayArray740[i][arg1] = arg0;
	    }
	}
	anInt760++;
	if (arg2 != 921)
	    anIntArray766 = null;
    }
    
    public static byte method639(int arg0, int arg1, int arg2) {
	try {
	    anInt761++;
	    if (arg0 != 17626)
		method640(-50, null, false, -32, null);
	    if ((arg1 ^ 0xffffffff) != -10)
		return (byte) 0;
	    if ((0x1 & arg2 ^ 0xffffffff) == -1)
		return (byte) 1;
	    return (byte) 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fr.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method640(int arg0, Class130 arg1, boolean arg2,
				 int arg3, int[][] arg4) {
	try {
	    anInt762++;
	    if (arg3 <= -116) {
		for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++) {
		    int[][] is;
		    if (arg4 != null) {
			is = (new int[1 + Class131_Sub41_Sub11_Sub1.anInt6546]
			      [Class131_Sub2_Sub26.anInt5931 + 1]);
			for (int i_1_ = 0;
			     ((i_1_ ^ 0xffffffff)
			      >= (Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff));
			     i_1_++) {
			    for (int i_2_ = 0;
				 i_2_ <= Class131_Sub41_Sub11_Sub1.anInt6546;
				 i_2_++)
				is[i_2_][i_1_]
				    = (Cryption.anIntArrayArrayArray1828[i]
				       [i_2_][i_1_]) + -arg4[i_2_][i_1_];
			}
		    } else
			is = null;
		    int i_3_ = 0;
		    int i_4_ = 0;
		    if (!arg2) {
			if (Class167.aBoolean2235)
			    i_3_ |= 0x2;
			if (Class23_Sub1_Sub2.aBoolean5159)
			    i_4_ |= 0x8;
			if ((Class131_Sub2_Sub16.anInt5779 ^ 0xffffffff)
			    != -1) {
			    if ((i ^ 0xffffffff) == -1
				|| (Class1_Sub4.anInt3554 ^ 0xffffffff) <= -97)
				i_4_ |= 0x10;
			    i_3_ |= 0x1;
			}
		    }
		    if (Class167.aBoolean2235)
			i_4_ |= 0x7;
		    Class68 class68
			= arg1.method1237(Class131_Sub41_Sub11_Sub1.anInt6546,
					  Class131_Sub2_Sub26.anInt5931,
					  Cryption.anIntArrayArrayArray1828[i],
					  is, 128, i_3_, i_4_);
		    Class131_Sub8.method1671(i, class68);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fr.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aBoolean765 = true;
    }
}
