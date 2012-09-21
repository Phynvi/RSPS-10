/* Class131_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class131_Sub2_Sub2 extends Class131_Sub2
{
    public static int anInt5572;
    public static int anInt5573;
    public static int[][] anIntArrayArray5574
	= { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 },
	    { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
	    { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 },
	    { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 },
	    { 0, 1, 2, 3 } };
    public static Class214 aClass214_5575 = new Class214(128);
    public static int anInt5576;
    public static int anInt5577;
    public static int anInt5578;
    public static int anInt5579;
    public static int anInt5580;
    public Class110[] aClass110Array5581;
    public static int anInt5582;
    public static int anInt5583 = 0;
    public static int[] anIntArray5584
	= { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
    
    public static void method1479(int arg0, Class183 arg1, int arg2, int arg3,
				  byte arg4, int arg5, Class173 arg6, int arg7,
				  int arg8) {
	try {
	    anInt5577++;
	    int i = arg7 * arg7 + arg8 * arg8;
	    if ((i ^ 0xffffffff) >= (arg3 ^ 0xffffffff)) {
		int i_0_ = Math.min(arg6.anInt2411 / 2, arg6.anInt2437 / 2);
		int i_1_ = -108 % ((20 - arg4) / 50);
		if (i > i_0_ * i_0_) {
		    i_0_ -= 10;
		    int i_2_;
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) != -5)
			i_2_ = (Class148.anInt1982 + (int) Class120.aFloat1578
				& 0x3fff);
		    else
			i_2_ = (int) Class120.aFloat1578 & 0x3fff;
		    int i_3_ = Class31.anIntArray434[i_2_];
		    int i_4_ = Class31.anIntArray425[i_2_];
		    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) != -5) {
			i_3_ = 256 * i_3_ / (Class1_Sub7.anInt3590 - -256);
			i_4_ = i_4_ * 256 / (256 + Class1_Sub7.anInt3590);
		    }
		    int i_5_ = arg8 * i_3_ + i_4_ * arg7 >> -1273474961;
		    int i_6_ = arg8 * i_4_ - arg7 * i_3_ >> 997889679;
		    double d = Math.atan2((double) i_5_, (double) i_6_);
		    int i_7_ = (int) ((double) i_0_ * Math.sin(d));
		    int i_8_ = (int) ((double) i_0_ * Math.cos(d));
		    Class131_Sub41_Sub20.aClass152Array6425[arg0].method2209
			((float) i_7_ + ((float) arg6.anInt2411 / 2.0F
					 + (float) arg2),
			 (float) -i_8_ + ((float) arg6.anInt2437 / 2.0F
					  + (float) arg5),
			 4096, (int) (-d / 6.283185307179586 * 65535.0));
		} else
		    Class131_Sub2_Sub3.method1487(arg2, arg8, arg1, 2,
						  (Class153_Sub1
						   .aClass152Array4761[arg0]),
						  arg5, arg6, arg7);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ','
						 + (arg6 != null ? "{...}"
						    : "null")
						 + ',' + arg7 + ',' + arg8
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    anInt5572++;
	    if (arg1 == -49) {
		if (arg0 != 0) {
		    if ((arg0 ^ 0xffffffff) == -2)
			aBoolean4093 = arg2.readUnsignedByte(122) == 1;
		} else {
		    aClass110Array5581
			= new Class110[arg2.readUnsignedByte(arg1 ^ ~0x74)];
		    int i = 0;
		while_23_:
		    for (/**/; i < aClass110Array5581.length; i++) {
			int i_9_ = arg2.readUnsignedByte(-78);
			int i_10_ = i_9_;
		    while_21_:
			do {
			    do {
				if ((i_10_ ^ 0xffffffff) != -1) {
				    if ((i_10_ ^ 0xffffffff) != -2) {
					if (i_10_ != 2) {
					    if (i_10_ != 3)
						continue while_23_;
					} else
					    break;
					break while_21_;
				    }
				} else {
				    aClass110Array5581[i]
					= Class131_Sub13.method1701(arg1 + 48,
								    arg2);
				    continue while_23_;
				}
				aClass110Array5581[i]
				    = Class120_Sub1.method1031(arg2,
							       arg1 + -76);
				continue while_23_;
			    } while (false);
			    aClass110Array5581[i]
				= (Class1_Sub7.method128
				   (Class23_Sub4_Sub5.method390(arg1, -11),
				    arg2));
			    continue while_23_;
			} while (false);
			aClass110Array5581[i]
			    = Class23_Sub4_Sub2.method374(0, arg2);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		method1479(56, null, 110, 19, (byte) 47, -65, null, -38, 5);
	    anInt5578++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -122);
	    if (aClass200_4087.aBoolean2927)
		method1482(-104, aClass200_4087.method2715((byte) -110));
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method1480(int arg0, int arg1) {
	try {
	    if (arg0 != 0)
		return -77;
	    anInt5582++;
	    return arg1 >>> 1416501898;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub2() {
	super(0, true);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5579++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (arg1 != 0)
		aClass214_5575 = null;
	    if (aClass59_4097.aBoolean783) {
		int i = Class131_Sub2_Sub7.anInt5637;
		int i_11_ = Class120_Sub2.anInt3975;
		int[][] is_12_ = new int[i_11_][i];
		int[][][] is_13_ = aClass59_4097.method647((byte) 53);
		method1482(-125, is_12_);
		for (int i_14_ = 0; i_14_ < Class120_Sub2.anInt3975; i_14_++) {
		    int[] is_15_ = is_12_[i_14_];
		    int[][] is_16_ = is_13_[i_14_];
		    int[] is_17_ = is_16_[0];
		    int[] is_18_ = is_16_[1];
		    int[] is_19_ = is_16_[2];
		    for (int i_20_ = 0;
			 ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
			  < (i_20_ ^ 0xffffffff));
			 i_20_++) {
			int i_21_ = is_15_[i_20_];
			is_19_[i_20_]
			    = Class90.method841(4080, i_21_ << -1623756700);
			is_18_[i_20_]
			    = Class90.method841(i_21_ >> -397809756, 4080);
			is_17_[i_20_] = (Class90.method841(16711680, i_21_)
					 >> -1469573076);
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class139 method1481(String arg0, SignLink arg1, byte arg2,
				      int arg3) {
	try {
	    anInt5573++;
	    if ((arg3 ^ 0xffffffff) == -1)
		return arg1.method2704(arg0, 104);
	    if (arg3 == 1) {
		try {
		    Class30.method434(arg1.anApplet2883,
				      (new Object[]
				       { new URL
					     (arg1.anApplet2883.getCodeBase(),
					      arg0)
					     .toString() }),
				      true, "openjs");
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 1;
		    return class139;
		} catch (Throwable throwable) {
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 2;
		    return class139;
		}
	    }
	    if ((arg3 ^ 0xffffffff) == -3) {
		try {
		    arg1.anApplet2883.getAppletContext().showDocument
			(new URL(arg1.anApplet2883.getCodeBase(), arg0),
			 "_blank");
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 1;
		    return class139;
		} catch (Exception exception) {
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 2;
		    return class139;
		}
	    }
	    if (arg2 > -47)
		anIntArrayArray5574 = null;
	    if ((arg3 ^ 0xffffffff) == -4) {
		try {
		    Class30.method432(arg1.anApplet2883, (byte) -100,
				      "loggedout");
		} catch (Throwable throwable) {
		    /* empty */
		}
		try {
		    arg1.anApplet2883.getAppletContext().showDocument
			(new URL(arg1.anApplet2883.getCodeBase(), arg0),
			 "_top");
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 1;
		    return class139;
		} catch (Exception exception) {
		    Class139 class139 = new Class139();
		    class139.anInt1864 = 2;
		    return class139;
		}
	    }
	    throw new IllegalArgumentException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method1482(int arg0, int[][] arg1) {
	if (arg0 > -78)
	    anIntArray5584 = null;
	anInt5576++;
	int i = Class131_Sub2_Sub7.anInt5637;
	int i_22_ = Class120_Sub2.anInt3975;
	Class23_Sub4_Sub3.method379(arg1, 17);
	Class121.method1039(Class23_Sub4_Sub4.anInt5404, Class79.anInt1060, 0,
			    0, false);
	if (aClass110Array5581 != null) {
	    for (int i_23_ = 0; ((aClass110Array5581.length ^ 0xffffffff)
				 < (i_23_ ^ 0xffffffff)); i_23_++) {
		Class110 class110 = aClass110Array5581[i_23_];
		int i_24_ = class110.anInt1432;
		int i_25_ = class110.anInt1428;
		if (i_24_ >= 0) {
		    if (i_25_ >= 0)
			class110.method938(i, i_22_, 0);
		    else
			class110.method934(i_22_, i, (byte) 75);
		} else if ((i_25_ ^ 0xffffffff) <= -1)
		    class110.method936(i_22_, false, i);
	    }
	}
    }
    
    public static void method1483(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg2 < 74)
		anInt5583 = -62;
	    anInt5580++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(9, arg0, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg3;
	    class131_sub41_sub6.anInt6234 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bh.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method1484(byte arg0) {
	try {
	    if (arg0 > -39)
		method1479(117, null, 125, -127, (byte) 34, 75, null, 83, -98);
	    aClass214_5575 = null;
	    anIntArrayArray5574 = null;
	    anIntArray5584 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bh.B(" + arg0 + ')');
	}
    }
}
