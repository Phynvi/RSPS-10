/* Class131_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub35 extends Class131
{
    public static int[] anIntArray4578;
    public static int anInt4579;
    public Class152 aClass152_4580;
    public static int anInt4581;
    public boolean aBoolean4582;
    public static int anInt4583 = 0;
    public static int anInt4584;
    public static Class152[] aClass152Array4585;
    public static int anInt4586;
    public static int anInt4587 = 0;
    public static Class215 aClass215_4588;
    public static int[] anIntArray4589 = new int[1000];
    
    public static void method1872(boolean arg0) {
	try {
	    anInt4584++;
	    synchronized (Class135.aClass214_1811) {
		if (arg0 != true)
		    anIntArray4578 = null;
		Class135.aClass214_1811.method2783(-64);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tm.E(" + arg0 + ')');
	}
    }
    
    public static void method1873(boolean arg0, Class23_Sub4_Sub1_Sub1 arg1) {
	try {
	    anInt4579++;
	    if (arg0 != true)
		anInt4583 = -45;
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub4.aClass119_4133.method1007(0));
		 class131_sub19 != null;
		 class131_sub19 = (Class131_Sub19) Class131_Sub4
						       .aClass119_4133
						       .method1014(0)) {
		if (class131_sub19.aClass23_Sub4_Sub1_Sub1_4410 == arg1) {
		    if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
			Class78.aClass131_Sub1_Sub3_1057.method1441
			    (class131_sub19.aClass131_Sub1_Sub2_4393);
			class131_sub19.aClass131_Sub1_Sub2_4393 = null;
		    }
		    class131_sub19.method1355((byte) 115);
		    break;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tm.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1874(int arg0, int arg1, int arg2,
				  Class23_Sub2 arg3, Class23_Sub2 arg4) {
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    == null)
	    Class1_Sub2.method101(arg0, arg1, arg2);
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub2_1972
	    = arg3;
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub2_1951
	    = arg4;
    }
    
    public static void method1875(int arg0) {
	try {
	    anIntArray4589 = null;
	    if (arg0 >= 95) {
		aClass152Array4585 = null;
		anIntArray4578 = null;
		aClass215_4588 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tm.D(" + arg0 + ')');
	}
    }
    
    public static void method1876(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, byte arg6, int arg7,
				  int arg8, int arg9) {
	try {
	    if (arg6 <= 110)
		aClass152Array4585 = null;
	    anInt4581++;
	    if ((arg1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		&& (arg0 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		&& (arg4 ^ 0xffffffff) == (arg9 ^ 0xffffffff)
		&& (arg7 ^ 0xffffffff) == (arg3 ^ 0xffffffff))
		Class166.method2418(arg8, arg1, arg4, false, arg2, arg3);
	    else {
		int i = arg1;
		int i_0_ = arg2;
		int i_1_ = arg1 * 3;
		int i_2_ = arg2 * 3;
		int i_3_ = 3 * arg5;
		int i_4_ = arg0 * 3;
		int i_5_ = 3 * arg9;
		int i_6_ = arg7 * 3;
		int i_7_ = arg4 - i_5_ + (i_3_ - arg1);
		int i_8_ = -arg2 + arg3 + -i_6_ - -i_4_;
		int i_9_ = i_5_ + (-i_3_ - (i_3_ - i_1_));
		int i_10_ = i_6_ - i_4_ + (-i_4_ - -i_2_);
		int i_11_ = i_3_ - i_1_;
		int i_12_ = i_4_ + -i_2_;
		for (int i_13_ = 128; (i_13_ ^ 0xffffffff) >= -4097;
		     i_13_ += 128) {
		    int i_14_ = i_13_ * i_13_ >> 191830252;
		    int i_15_ = i_13_ * i_14_ >> 231180812;
		    int i_16_ = i_15_ * i_7_;
		    int i_17_ = i_15_ * i_8_;
		    int i_18_ = i_9_ * i_14_;
		    int i_19_ = i_14_ * i_10_;
		    int i_20_ = i_11_ * i_13_;
		    int i_21_ = i_12_ * i_13_;
		    int i_22_ = arg1 - -(i_20_ + i_16_ - -i_18_ >> 817129644);
		    int i_23_ = arg2 + (i_21_ + (i_19_ + i_17_) >> 302254732);
		    Class166.method2418(arg8, i, i_22_, false, i_0_, i_23_);
		    i = i_22_;
		    i_0_ = i_23_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tm.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
}
