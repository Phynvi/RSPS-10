/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105
{
    public static int anInt1367;
    public static int anInt1368;
    public static int anInt1369;
    public static int anInt1370;
    public static int anInt1371;
    public static int anInt1372;
    public static Class23_Sub4_Sub1_Sub2[] aClass23_Sub4_Sub1_Sub2Array1373
	= new Class23_Sub4_Sub1_Sub2[2048];
    public static int anInt1374;
    public Class142 aClass142_1375 = new Class142();
    public static int anInt1376;
    public static int anInt1377;
    public int anInt1378;
    public int anInt1379;
    public boolean aBoolean1380 = false;
    
    public static void method912(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    anInt1370++;
	    int i = -102 % ((57 - arg2) / 53);
	    int i_0_ = Class180.method2517(-15543, Class125.anInt1629,
					   Class116.anInt1494, arg3);
	    int i_1_ = Class180.method2517(-15543, Class125.anInt1629,
					   Class116.anInt1494, arg4);
	    int i_2_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg1);
	    int i_3_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg5);
	    int i_4_ = Class180.method2517(-15543, Class125.anInt1629,
					   Class116.anInt1494, arg6 + arg3);
	    int i_5_ = Class180.method2517(-15543, Class125.anInt1629,
					   Class116.anInt1494, -arg6 + arg4);
	    for (int i_6_ = i_0_; (i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff);
		 i_6_++)
		Class131_Sub3.method1650(i_3_,
					 Class56.anIntArrayArray740[i_6_],
					 arg0, i_2_, 56);
	    for (int i_7_ = i_1_; i_5_ < i_7_; i_7_--)
		Class131_Sub3.method1650(i_3_,
					 Class56.anIntArrayArray740[i_7_],
					 arg0, i_2_, 68);
	    int i_8_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg1 + arg6);
	    int i_9_ = Class180.method2517(-15543, Class115.anInt1477,
					   Class149.anInt1988, arg5 - arg6);
	    for (int i_10_ = i_4_; (i_10_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff);
		 i_10_++) {
		int[] is = Class56.anIntArrayArray740[i_10_];
		Class131_Sub3.method1650(i_8_, is, arg0, i_2_, 108);
		Class131_Sub3.method1650(i_3_, is, arg0, i_9_, 99);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lc.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method913(int arg0, int[] arg1, int arg2, long[] arg3,
				 int arg4) {
	try {
	    if ((arg4 ^ 0xffffffff) > (arg2 ^ 0xffffffff)) {
		int i = (arg4 + arg2) / 2;
		int i_11_ = arg4;
		long l = arg3[i];
		arg3[i] = arg3[arg2];
		arg3[arg2] = l;
		int i_12_ = arg1[i];
		arg1[i] = arg1[arg2];
		arg1[arg2] = i_12_;
		for (int i_13_ = arg4;
		     (i_13_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_13_++) {
		    if (((long) (0x1 & i_13_) + l ^ 0xffffffffffffffffL)
			< (arg3[i_13_] ^ 0xffffffffffffffffL)) {
			long l_14_ = arg3[i_13_];
			arg3[i_13_] = arg3[i_11_];
			arg3[i_11_] = l_14_;
			int i_15_ = arg1[i_13_];
			arg1[i_13_] = arg1[i_11_];
			arg1[i_11_++] = i_15_;
		    }
		}
		arg3[arg2] = arg3[i_11_];
		arg3[i_11_] = l;
		arg1[arg2] = arg1[i_11_];
		arg1[i_11_] = i_12_;
		method913(-116, arg1, i_11_ + -1, arg3, arg4);
		method913(-127, arg1, arg2, arg3, 1 + i_11_);
	    }
	    anInt1372++;
	    int i = 10 % ((8 - arg0) / 47);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lc.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method914(int arg0) {
	try {
	    synchronized (OutputStream_Sub1.aClass214_66) {
		OutputStream_Sub1.aClass214_66.method2783(-66);
	    }
	    anInt1369++;
	    synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		Class131_Sub2_Sub30.aClass214_5991.method2783(-78);
		int i = -1 / ((-59 - arg0) / 46);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lc.A(" + arg0 + ')');
	}
    }
    
    public static void method915(int arg0, Class158 arg1) {
	anInt1374++;
	Class131_Sub2_Sub5.aClass158_5616 = arg1;
	Class118.anInt1550
	    = Class131_Sub2_Sub5.aClass158_5616.method2368(4, (byte) -72);
	if (arg0 != 21187)
	    method912(-109, 17, 6, 47, -75, -3, 10);
    }
    
    public static void method916(int arg0) {
	try {
	    anInt1367++;
	    synchronized (Class173.aClass214_2425) {
		Class173.aClass214_2425.method2783(arg0 + -69);
	    }
	    synchronized (Class153.aClass214_2040) {
		Class153.aClass214_2040.method2783(-102);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		Class131_Sub2_Sub30.aClass214_5988.method2783(-95);
		if (arg0 != 0)
		    aClass23_Sub4_Sub1_Sub2Array1373 = null;
	    }
	    synchronized (Class192.aClass214_2824) {
		Class192.aClass214_2824.method2783(-120);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lc.E(" + arg0 + ')');
	}
    }
    
    public static void method917(int arg0) {
	try {
	    if (arg0 >= -105)
		anInt1376 = 4;
	    aClass23_Sub4_Sub1_Sub2Array1373 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lc.D(" + arg0 + ')');
	}
    }
    
    static {
	anInt1371 = 0;
	anInt1377 = 0;
	anInt1376 = -1;
    }
}
