/* Class121_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121_Sub1 extends Class121
{
    public static int anInt3980;
    public static Class173 aClass173_3981 = null;
    public static volatile int anInt3982 = -1;
    public static int anInt3983;
    public static int anInt3984;
    public static int anInt3985;
    
    public static void method1042(int arg0) {
	try {
	    if (arg0 >= 21)
		aClass173_3981 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nl.A(" + arg0 + ')');
	}
    }
    
    public static void method1043(int arg0) {
	try {
	    if (arg0 <= -27) {
		Class100.aBoolean1325 = true;
		anInt3985++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nl.E(" + arg0 + ')');
	}
    }
    
    public static void method1044(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt3984++;
	    int i = 0;
	    int i_0_ = arg0;
	    int i_1_ = -arg0;
	    int i_2_ = arg1;
	    int i_3_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg3 - -arg0);
	    int i_4_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg3 + -arg0);
	    Class131_Sub3.method1650(i_3_, Class56.anIntArrayArray740[arg4],
				     arg2, i_4_, arg1 ^ ~0x4f);
	    while ((i ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
		i_2_ += 2;
		i_1_ += i_2_;
		if ((i_1_ ^ 0xffffffff) < -1) {
		    i_0_--;
		    i_1_ -= i_0_ << -926792671;
		    int i_5_ = arg4 - i_0_;
		    int i_6_ = arg4 - -i_0_;
		    if ((i_6_ ^ 0xffffffff) <= (Class116.anInt1494
						^ 0xffffffff)
			&& (i_5_ ^ 0xffffffff) >= (Class125.anInt1629
						   ^ 0xffffffff)) {
			int i_7_
			    = Class180.method2517(-15543, Class115.anInt1477,
						  Class149.anInt1988,
						  arg3 - -i);
			int i_8_
			    = Class180.method2517(-15543, Class115.anInt1477,
						  Class149.anInt1988,
						  -i + arg3);
			if ((i_6_ ^ 0xffffffff)
			    >= (Class125.anInt1629 ^ 0xffffffff))
			    Class131_Sub3.method1650(i_7_,
						     (Class56
						      .anIntArrayArray740
						      [i_6_]),
						     arg2, i_8_, 86);
			if (Class116.anInt1494 <= i_5_)
			    Class131_Sub3.method1650(i_7_,
						     (Class56
						      .anIntArrayArray740
						      [i_5_]),
						     arg2, i_8_, arg1 + 61);
		    }
		}
		int i_9_ = -++i + arg4;
		int i_10_ = arg4 - -i;
		if (Class116.anInt1494 <= i_10_
		    && (i_9_ ^ 0xffffffff) >= (Class125.anInt1629
					       ^ 0xffffffff)) {
		    int i_11_ = Class180.method2517(-15543, Class115.anInt1477,
						    Class149.anInt1988,
						    arg3 - -i_0_);
		    int i_12_
			= Class180.method2517(-15543, Class115.anInt1477,
					      Class149.anInt1988, arg3 - i_0_);
		    if (i_10_ <= Class125.anInt1629)
			Class131_Sub3.method1650(i_11_,
						 (Class56.anIntArrayArray740
						  [i_10_]),
						 arg2, i_12_, 88);
		    if (Class116.anInt1494 <= i_9_)
			Class131_Sub3.method1650(i_11_,
						 (Class56.anIntArrayArray740
						  [i_9_]),
						 arg2, i_12_, 86);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nl.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1045(Class158 arg0, Class158 arg1, int arg2,
				  boolean arg3) {
	do {
	    try {
		Class23_Sub4_Sub1_Sub1.aClass158_6475 = arg1;
		anInt3983++;
		Class23_Sub4_Sub3.aClass158_5003 = arg0;
		Class35.aBoolean494 = arg3;
		if (arg2 == -2437)
		    break;
		method1044(49, 72, -30, 29, -17);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("nl.B("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ',' + arg3
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static int[][] method1046(int arg0, int arg1, int arg2, float arg3,
				     int arg4, boolean arg5, int arg6,
				     int arg7, int arg8) {
	try {
	    anInt3980++;
	    int[][] is = new int[arg2][arg6];
	    Class131_Sub2_Sub17 class131_sub2_sub17
		= new Class131_Sub2_Sub17();
	    if (arg0 != -11590)
		aClass173_3981 = null;
	    class131_sub2_sub17.anInt5806 = (int) (4096.0F * arg3);
	    class131_sub2_sub17.anInt5794 = arg8;
	    class131_sub2_sub17.anInt5802 = arg4;
	    class131_sub2_sub17.aBoolean5793 = arg5;
	    class131_sub2_sub17.anInt5805 = arg1;
	    class131_sub2_sub17.method1471(arg0 + 11590);
	    Class23_Sub4.method324(arg2, arg6, 104);
	    for (int i = 0; i < arg2; i++)
		class131_sub2_sub17.method1553(6967, is[i], i);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nl.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ')'));
	}
    }
}
