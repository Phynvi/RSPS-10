/* Class131_Sub2_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub29 extends Class131_Sub2
{
    public static int anInt5969;
    public static int anInt5970;
    public static int anInt5971;
    public static Class147[][][] aClass147ArrayArrayArray5972;
    public static int anInt5973;
    public int anInt5974 = 32768;
    public static int[] anIntArray5975 = new int[25];
    public static String aString5976 = "white:";
    public static int anInt5977;
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5977++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[] is_0_ = this.method1459(1, (byte) -40, arg0);
		int[] is_1_ = this.method1459(2, (byte) -40, arg0);
		int[] is_2_ = is[0];
		int[] is_3_ = is[1];
		int[] is_4_ = is[2];
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    int i_5_ = (0xffe58 & 255 * is_0_[i]) >> 823007820;
		    int i_6_ = is_1_[i] * anInt5974 >> 1645356396;
		    int i_7_ = (i_6_ * Class153_Sub1.anIntArray4763[i_5_]
				>> 1405549100);
		    int i_8_ = (i_6_ * Class131_Sub29.anIntArray4510[i_5_]
				>> -1511643476);
		    int i_9_ = ((i_7_ >> -201601236) + i
				& Class23_Sub4_Sub4.anInt5404);
		    int i_10_
			= Class79.anInt1060 & (i_8_ >> -885296596) + arg0;
		    int[][] is_11_ = this.method1463(0, (byte) 121, i_10_);
		    is_2_[i] = is_11_[0][i_9_];
		    is_3_[i] = is_11_[1][i_9_];
		    is_4_[i] = is_11_[2][i_9_];
		}
	    }
	    if (arg1 != 0)
		method1471(46);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pq.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub29() {
	super(3, false);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5969++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -112);
	    if (arg0 != -11543)
		anInt5974 = 33;
	    if (aClass200_4087.aBoolean2927) {
		int[] is_12_ = this.method1459(1, (byte) -40, arg1);
		int[] is_13_ = this.method1459(2, (byte) -40, arg1);
		for (int i = 0; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    int i_14_ = is_12_[i] >> -121677052 & 0xff;
		    int i_15_ = anInt5974 * is_13_[i] >> -857545748;
		    int i_16_ = (i_15_ * Class153_Sub1.anIntArray4763[i_14_]
				 >> 508115948);
		    int i_17_ = (i_15_ * Class131_Sub29.anIntArray4510[i_14_]
				 >> -155876052);
		    int i_18_ = (i - -(i_16_ >> 1705057996)
				 & Class23_Sub4_Sub4.anInt5404);
		    int i_19_
			= Class79.anInt1060 & (i_17_ >> 1539117804) + arg1;
		    int[] is_20_ = this.method1459(0, (byte) -40, i_19_);
		    is[i] = is_20_[i_18_];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pq.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1471(int arg0) {
	try {
	    Class103.method904(arg0);
	    anInt5970++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pq.J(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5973++;
	int i = arg0;
	do {
	    if (i != 0) {
		if ((i ^ 0xffffffff) != -2)
		    break;
	    } else {
		anInt5974 = arg2.readUnsignedShort(arg1 + 8153) << -508616732;
		break;
	    }
	    aBoolean4093 = arg2.readUnsignedByte(114) == 1;
	} while (false);
	if (arg1 != -49)
	    anIntArray5975 = null;
    }
    
    public static void method1612(int arg0) {
	try {
	    anIntArray5975 = null;
	    if (arg0 < 21)
		method1612(-14);
	    aClass147ArrayArrayArray5972 = null;
	    aString5976 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pq.B(" + arg0 + ')');
	}
    }
    
    static {
	anInt5971 = 0;
    }
}
