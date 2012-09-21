/* Class131_Sub2_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub20 extends Class131_Sub2
{
    public static int anInt5834;
    public static String aString5835;
    public static int anInt5836;
    public static int[][] anIntArrayArray5837 = new int[128][128];
    public static int anInt5838 = -2;
    public static int anInt5839 = -1;
    public int anInt5840;
    public static int anInt5841;
    public int anInt5842;
    public int anInt5843 = 0;
    public static int anInt5844;
    public static int anInt5845;
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		method1466(-102, 105);
	    anInt5845++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 89);
	    if (aClass200_4087.aBoolean2927) {
		int i = Class1_Sub7_Sub1.anIntArray5206[arg1];
		int i_0_ = i + -2048 >> 222948577;
		for (int i_1_ = 0; Class131_Sub2_Sub7.anInt5637 > i_1_;
		     i_1_++) {
		    int i_2_ = Class1_Sub4.anIntArray3551[i_1_];
		    int i_3_ = i_2_ - 2048 >> 606422945;
		    int i_4_;
		    if (anInt5840 != 0) {
			int i_5_ = i_0_ * i_0_ + i_3_ * i_3_ >> -859806036;
			i_4_
			    = (int) (4096.0 * Math.sqrt((double) ((float) i_5_
								  / 4096.0F)));
			i_4_ = (int) ((double) (anInt5842 * i_4_)
				      * 3.141592653589793);
		    } else
			i_4_ = anInt5842 * (i_2_ + -i);
		    i_4_ -= i_4_ & ~0xfff;
		    if ((anInt5843 ^ 0xffffffff) != -1) {
			if ((anInt5843 ^ 0xffffffff) == -3) {
			    i_4_ -= 2048;
			    if (i_4_ < 0)
				i_4_ = -i_4_;
			    i_4_ = 2048 + -i_4_ << -822518847;
			}
		    } else
			i_4_ = ((Class131_Sub29.anIntArray4510
				 [i_4_ >> 625439812 & 0xff]) - -4096
				>> 380387873);
		    is[i_1_] = i_4_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("k.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub20() {
	super(0, true);
	anInt5842 = 1;
	anInt5840 = 0;
    }
    
    public static void method1569(int arg0) {
	try {
	    int i = 72 % ((arg0 - -53) / 36);
	    anInt5834++;
	    synchronized (Class21.aClass214_239) {
		Class21.aClass214_239.method2783(-106);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"k.F(" + arg0 + ')');
	}
    }
    
    public static void method1570(boolean arg0) {
	try {
	    if (arg0 == false) {
		aString5835 = null;
		anIntArrayArray5837 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"k.B(" + arg0 + ')');
	}
    }
    
    public static void method1571(int arg0, int arg1) {
	try {
	    anInt5841++;
	    synchronized (Class126.aClass201_1689) {
		Class192.anInt2823 = arg0;
		if (arg1 != 606422945)
		    method1570(true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("k.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1471(int arg0) {
	try {
	    anInt5844++;
	    Class103.method904(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"k.J(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    int i = arg0;
	while_135_:
	    do {
		do {
		    if ((i ^ 0xffffffff) != -1) {
			if (i != 1) {
			    if ((i ^ 0xffffffff) == -4)
				break;
			    break while_135_;
			}
		    } else {
			anInt5840 = arg2.readUnsignedByte(-15);
			break while_135_;
		    }
		    anInt5843 = arg2.readUnsignedByte(arg1 ^ ~0x6a);
		    break while_135_;
		} while (false);
		anInt5842 = arg2.readUnsignedByte(arg1 + 149);
	    } while (false);
	    if (arg1 != -49)
		method1569(-55);
	    anInt5836++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("k.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aString5835 = "flash3:";
    }
}
