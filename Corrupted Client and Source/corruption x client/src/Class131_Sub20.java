/* Class131_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub20 extends Class131
{
    public static Class158 aClass158_4417;
    public boolean aBoolean4418 = false;
    public int anInt4419;
    public static byte[][] aByteArrayArray4420 = new byte[1000][];
    public static int anInt4421 = 0;
    public static int anInt4422;
    public static Class152 aClass152_4423;
    public static Class158 aClass158_4424;
    public static int anInt4425;
    public int anInt4426;
    public int anInt4427 = -1;
    public int anInt4428;
    public int anInt4429;
    public static int anInt4430;
    public int anInt4431;
    public static int anInt4432;
    public static int anInt4433;
    
    public static void method1814(int arg0, Class158 arg1, byte arg2, int arg3,
				  boolean arg4, int arg5, int arg6) {
	try {
	    Class183_Sub1.anInt4962 = arg0;
	    if (arg2 <= 55)
		anInt4432 = -9;
	    Class23_Sub4_Sub5.aClass158_5111 = arg1;
	    Class83.aBoolean1094 = arg4;
	    anInt4425++;
	    Cryption.anInt1824 = arg6;
	    anInt4432 = arg3;
	    Class131_Sub33.anInt4554 = arg5;
	    Class214.anInt3139 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lo.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method1815(int arg0, int arg1, Class130 arg2, int arg3,
				  Class173 arg4) {
	try {
	    if (arg4.anInt2470 != 2) {
		if (arg4.anInt2470 == 5) {
		    boolean bool
			= Class202.method2724(arg2, 1483, arg4.anInt2421,
					      ~0xffffff | arg4.anInt2325,
					      (!arg4.aBoolean2393 ? null
					       : (Class166
						  .aClass23_Sub4_Sub1_Sub2_2216
						  .aClass188_6513)),
					      arg4.anInt2305, arg4.anInt2474,
					      arg4.anInt2433) == null;
		    if (bool)
			Class14.aClass119_153.method1018
			    ((byte) -127,
			     new Class131_Sub23(arg4.anInt2421, arg4.anInt2305,
						arg4.anInt2433,
						arg4.anInt2325 | ~0xffffff,
						arg4.anInt2474,
						arg4.aBoolean2393));
		}
	    } else {
		for (int i = arg1; (arg0 ^ 0xffffffff) <= (i ^ 0xffffffff);
		     i++) {
		    int i_0_ = -1 + arg4.anIntArray2400[i];
		    if ((i_0_ ^ 0xffffffff) != 0) {
			if ((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff) != -2
			    || (i ^ 0xffffffff) != (Class209.anInt3038
						    ^ 0xffffffff)
			    || ((Class182.anInt2604 ^ 0xffffffff)
				!= (arg4.anInt2455 ^ 0xffffffff))) {
			    boolean bool
				= (Class202.method2724(arg2, 1483, i_0_,
						       -13623264, null,
						       arg4.anIntArray2418[i],
						       arg4.anInt2474, 1)
				   == null);
			    if (bool)
				Class14.aClass119_153.method1018
				    ((byte) -121,
				     new Class131_Sub23(i_0_,
							arg4.anIntArray2418[i],
							1, -13623264,
							arg4.anInt2474,
							false));
			} else {
			    boolean bool
				= (Class202.method2724(arg2, 1483, i_0_, 0,
						       null,
						       arg4.anIntArray2418[i],
						       arg4.anInt2474, 2)
				   == null);
			    if (bool)
				Class14.aClass119_153.method1018
				    ((byte) -121,
				     new Class131_Sub23(i_0_,
							arg4.anIntArray2418[i],
							2, 0, arg4.anInt2474,
							false));
			}
		    }
		}
	    }
	    if (arg3 <= 118)
		method1816(10);
	    anInt4422++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lo.A(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1816(int arg0) {
	try {
	    aClass152_4423 = null;
	    aClass158_4424 = null;
	    if (arg0 == -11532) {
		aClass158_4417 = null;
		aByteArrayArray4420 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lo.B(" + arg0 + ')');
	}
    }
    
    public static int method1817(int arg0, int arg1) {
	try {
	    arg1
		= (arg1 & 0x55555555) - -((~0x55555554 & arg1) >>> 1866621377);
	    anInt4433++;
	    arg1 = (arg1 >>> 1603813890 & ~0x4ccccccc) + (arg1 & 0x33333333);
	    if (arg0 != 28135)
		method1814(-38, null, (byte) -125, -53, false, 52, 46);
	    arg1 = 0xf0f0f0f & arg1 - -(arg1 >>> -1924915100);
	    arg1 += arg1 >>> 1217941032;
	    arg1 += arg1 >>> 1049020912;
	    return arg1 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lo.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub20(int arg0) {
	try {
	    anInt4427 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"lo.<init>(" + arg0 + ')');
	}
    }
}
