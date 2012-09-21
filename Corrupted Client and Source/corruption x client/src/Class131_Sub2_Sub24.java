/* Class131_Sub2_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class131_Sub2_Sub24 extends Class131_Sub2
{
    public int anInt5889;
    public static boolean aBoolean5890;
    public static int anInt5891;
    public static int anInt5892 = 0;
    public int[][] anIntArrayArray5893;
    public int anInt5894 = 8;
    public static int anInt5895;
    public static int[] anIntArray5896 = new int[1000];
    public int[][] anIntArrayArray5897;
    public static int anInt5898;
    public int anInt5899 = 1024;
    public static int anInt5900;
    public int anInt5901;
    public int anInt5902;
    public int anInt5903;
    public int anInt5904;
    public int anInt5905 = 409;
    public static Class173 aClass173_5906;
    public int[] anIntArray5907;
    public static int anInt5908;
    public int anInt5909;
    public static int anInt5910;
    public int anInt5911;
    public int anInt5912;
    
    public void method1471(int arg0) {
	try {
	    if (arg0 != 0)
		method1455(33, (byte) -104, null);
	    anInt5895++;
	    method1584(4096);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nj.J(" + arg0 + ')');
	}
    }
    
    public void method1584(int arg0) {
	try {
	    anInt5910++;
	    Random random = new Random((long) anInt5894);
	    anInt5912 = 4096 / anInt5894;
	    anInt5901 = anInt5902 / 2;
	    anInt5909 = 4096 / anInt5911;
	    int i = anInt5909 / 2;
	    anIntArrayArray5893 = new int[anInt5894][1 + anInt5911];
	    anIntArray5907 = new int[anInt5894 + 1];
	    anIntArrayArray5897 = new int[anInt5894][anInt5911];
	    int i_0_ = anInt5912 / 2;
	    anIntArray5907[0] = 0;
	    for (int i_1_ = 0; (anInt5894 ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
		 i_1_++) {
		if ((i_1_ ^ 0xffffffff) < -1) {
		    int i_2_ = anInt5912;
		    int i_3_ = ((Class143.method2146(2044605728, random, 4096)
				 - 2048) * anInt5904
				>> -2009457396);
		    i_2_ += i_3_ * i_0_ >> -1401813812;
		    anIntArray5907[i_1_] = anIntArray5907[i_1_ + -1] - -i_2_;
		}
		anIntArrayArray5893[i_1_][0] = 0;
		for (int i_4_ = 0; anInt5911 > i_4_; i_4_++) {
		    if (i_4_ > 0) {
			int i_5_ = anInt5909;
			int i_6_
			    = (((-2048 + Class143.method2146(arg0 + 2044601632,
							     random, 4096))
				* anInt5905)
			       >> -932232820);
			i_5_ += i_6_ * i >> 1381872556;
			anIntArrayArray5893[i_1_][i_4_]
			    = i_5_ + anIntArrayArray5893[i_1_][i_4_ - 1];
		    }
		    anIntArrayArray5897[i_1_][i_4_]
			= (anInt5889 <= 0 ? 4096
			   : -(Class143.method2146
			       (Class23_Sub4_Sub5.method390(arg0, 2044601632),
				random, anInt5889)) + 4096);
		}
		anIntArrayArray5893[i_1_][anInt5911] = 4096;
	    }
	    anIntArray5907[anInt5894] = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nj.B(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	while_157_:
	    do {
	    while_156_:
		do {
		while_155_:
		    do {
		    while_154_:
			do {
			while_153_:
			    do {
			    while_152_:
				do {
				    do {
					if ((i ^ 0xffffffff) != -1) {
					    if (i != 1) {
						if ((i ^ 0xffffffff) != -3) {
						    if ((i ^ 0xffffffff)
							!= -4) {
							if (i != 4) {
							    if (i != 5) {
								if ((i
								     ^ 0xffffffff)
								    != -7) {
								    if ((i
									 ^ 0xffffffff)
									!= -8)
									break while_157_;
								} else
								    break while_155_;
								break while_156_;
							    }
							} else
							    break while_153_;
							break while_154_;
						    }
						} else
						    break;
						break while_152_;
					    }
					} else {
					    anInt5911 = arg2.readUnsignedByte(70);
					    break while_157_;
					}
					anInt5894 = arg2.readUnsignedByte(arg1 + 35);
					break while_157_;
				    } while (false);
				    anInt5905 = arg2.readUnsignedShort(8104);
				    break while_157_;
				} while (false);
				anInt5904 = arg2.readUnsignedShort(8104);
				break while_157_;
			    } while (false);
			    anInt5899 = arg2.readUnsignedShort(arg1 + 8153);
			    break while_157_;
			} while (false);
			anInt5903 = arg2.readUnsignedShort(8104);
			break while_157_;
		    } while (false);
		    anInt5902 = arg2.readUnsignedShort(8104);
		    break while_157_;
		} while (false);
		anInt5889 = arg2.readUnsignedShort(8104);
	    } while (false);
	    if (arg1 != -49)
		method1586(-109);
	    anInt5898++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nj.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1585(byte arg0, int arg1) {
	try {
	    anInt5908++;
	    if (arg0 != 98)
		anInt5892 = -12;
	    for (Class131 class131 = Class172.aClass180_2290.method2520(0);
		 class131 != null;
		 class131 = Class172.aClass180_2290.method2518(0)) {
		if ((long) arg1
		    == (class131.aLong1791 >> -832199376 & 0xffffL))
		    class131.method1355((byte) 119);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nj.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5900++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -114);
	    if (arg0 != -11543)
		return null;
	    if (aClass200_4087.aBoolean2927) {
		int i = 0;
		int i_7_;
		for (i_7_ = Class1_Sub7_Sub1.anIntArray5206[arg1] - -anInt5903;
		     (i_7_ ^ 0xffffffff) > -1; i_7_ += 4096) {
		    /* empty */
		}
		for (/**/; i_7_ > 4096; i_7_ -= 4096) {
		    /* empty */
		}
		for (/**/; (anInt5894 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    if (anIntArray5907[i] > i_7_)
			break;
		}
		int i_8_ = i + -1;
		boolean bool = (i & 0x1 ^ 0xffffffff) == -1;
		int i_9_ = anIntArray5907[i];
		int i_10_ = anIntArray5907[i - 1];
		if ((i_7_ ^ 0xffffffff) < (i_10_ - -anInt5901 ^ 0xffffffff)
		    && i_9_ + -anInt5901 > i_7_) {
		    for (int i_11_ = 0;
			 ((i_11_ ^ 0xffffffff)
			  > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			 i_11_++) {
			int i_12_ = 0;
			int i_13_ = !bool ? -anInt5899 : anInt5899;
			int i_14_;
			for (i_14_ = (Class1_Sub4.anIntArray3551[i_11_]
				      + (anInt5909 * i_13_ >> 992613452));
			     i_14_ < 0; i_14_ += 4096) {
			    /* empty */
			}
			for (/**/; (i_14_ ^ 0xffffffff) < -4097;
			     i_14_ -= 4096) {
			    /* empty */
			}
			for (/**/; i_12_ < anInt5911; i_12_++) {
			    if ((anIntArrayArray5893[i_8_][i_12_] ^ 0xffffffff)
				< (i_14_ ^ 0xffffffff))
				break;
			}
			int i_15_ = i_12_ + -1;
			int i_16_ = anIntArrayArray5893[i_8_][i_15_];
			int i_17_ = anIntArrayArray5893[i_8_][i_12_];
			if (i_14_ > anInt5901 + i_16_
			    && ((i_17_ - anInt5901 ^ 0xffffffff)
				< (i_14_ ^ 0xffffffff)))
			    is[i_11_] = anIntArrayArray5897[i_8_][i_15_];
			else
			    is[i_11_] = 0;
		    }
		} else
		    Class61.method651(is, 0, Class131_Sub2_Sub7.anInt5637, 0);
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nj.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1586(int arg0) {
	try {
	    if (arg0 == -18667) {
		anIntArray5896 = null;
		aClass173_5906 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nj.F(" + arg0 + ')');
	}
    }
    
    public static int method1587(int arg0, int arg1) {
	try {
	    if (arg1 != 1381872556)
		return 122;
	    anInt5891++;
	    return arg0 >>> -1593003993;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nj.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub24() {
	super(0, true);
	anInt5904 = 204;
	anInt5889 = 1024;
	anInt5911 = 4;
	anInt5903 = 0;
	anInt5902 = 81;
    }
    
    static {
	aBoolean5890 = false;
    }
}
