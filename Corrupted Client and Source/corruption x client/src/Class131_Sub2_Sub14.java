/* Class131_Sub2_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub14 extends Class131_Sub2
{
    public int anInt5745 = 0;
    public static int[][] anIntArrayArray5746;
    public static byte[] aByteArray5747 = { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    public static int anInt5748;
    public static Class214 aClass214_5749;
    public static short aShort5750 = 256;
    public static int anInt5751;
    public static int anInt5752;
    public int anInt5753 = 4096;
    public static int anInt5754;
    public static String aString5755;
    public static int anInt5756;
    public static int anInt5757;
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5751++;
	    if (arg1 != 0)
		anInt5754 = -3;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_0_ = this.method1463(0, (byte) 119, arg0);
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    int i_7_ = is_1_[i];
		    int i_8_ = is_2_[i];
		    int i_9_ = is_3_[i];
		    if (anInt5745 > i_7_)
			is_4_[i] = anInt5745;
		    else if ((anInt5753 ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
			is_4_[i] = anInt5753;
		    else
			is_4_[i] = i_7_;
		    if ((i_8_ ^ 0xffffffff) <= (anInt5745 ^ 0xffffffff)) {
			if (anInt5753 < i_8_)
			    is_5_[i] = anInt5753;
			else
			    is_5_[i] = i_8_;
		    } else
			is_5_[i] = anInt5745;
		    if (anInt5745 <= i_9_) {
			if (i_9_ > anInt5753)
			    is_6_[i] = anInt5753;
			else
			    is_6_[i] = i_9_;
		    } else
			is_6_[i] = anInt5745;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ff.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1537(boolean arg0, int arg1, String arg2) {
	try {
	    anInt5748++;
	    arg2 = arg2.toLowerCase();
	    short[] is = new short[16];
	    int i = arg1;
	    int i_10_ = arg0 ? 32768 : 0;
	    int i_11_
		= (arg0 ? Class131_Sub6.anInt4161 : Class98.anInt1302) + i_10_;
	    for (int i_12_ = i_10_; i_11_ > i_12_; i_12_++) {
		Class131_Sub41_Sub8 class131_sub41_sub8
		    = Class14.method215(i_12_, (byte) 97);
		if (class131_sub41_sub8.aBoolean6266
		    && (class131_sub41_sub8.method1985(arg1 + 1).toLowerCase
			    ().indexOf(arg2)
			^ 0xffffffff) != 0) {
		    if (i >= 50) {
			Class131_Sub22.anInt4449 = -1;
			Cryption.aShortArray1822 = null;
			return;
		    }
		    if (i >= is.length) {
			short[] is_13_ = new short[2 * is.length];
			for (int i_14_ = 0;
			     (i ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
			    is_13_[i_14_] = is[i_14_];
			is = is_13_;
		    }
		    is[i++] = (short) i_12_;
		}
	    }
	    Class131_Sub22.anInt4449 = i;
	    Class88.anInt1172 = 0;
	    Cryption.aShortArray1822 = is;
	    String[] strings = new String[Class131_Sub22.anInt4449];
	    for (int i_15_ = 0; ((Class131_Sub22.anInt4449 ^ 0xffffffff)
				 < (i_15_ ^ 0xffffffff)); i_15_++)
		strings[i_15_] = Class14.method215(is[i_15_], (byte) 70)
				     .method1985(arg1 + 1);
	    Class94.method860(arg1 + -1, Cryption.aShortArray1822, strings);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ff.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		return null;
	    anInt5752++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -77);
	    if (aClass200_4087.aBoolean2927) {
		int[] is_16_ = this.method1459(0, (byte) -40, arg1);
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    int i_17_ = is_16_[i];
		    if ((i_17_ ^ 0xffffffff) > (anInt5745 ^ 0xffffffff))
			is[i] = anInt5745;
		    else if (anInt5753 < i_17_)
			is[i] = anInt5753;
		    else
			is[i] = i_17_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ff.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class63 method1538(int arg0, int arg1) {
	try {
	    anInt5757++;
	    Class63 class63
		= ((Class63)
		   Class93.aClass214_1218.method2780(119, (long) arg1));
	    if (arg0 != -1624)
		method1539(114);
	    if (class63 != null)
		return class63;
	    byte[] is = Class98.aClass158_1295.method2364(arg1, 29, 0);
	    class63 = new Class63();
	    if (is != null)
		class63.method660(-59, new Stream(is), arg1);
	    Class93.aClass214_1218.method2773(true, class63, (long) arg1);
	    return class63;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ff.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub14() {
	super(1, false);
    }
    
    public static void method1539(int arg0) {
	try {
	    aClass214_5749 = null;
	    anIntArrayArray5746 = null;
	    if (arg0 == -2399) {
		aString5755 = null;
		aByteArray5747 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ff.D(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 != -49)
		aByteArray5747 = null;
	    int i = arg0;
	while_119_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_119_;
			}
		    } else {
			anInt5745 = arg2.readUnsignedShort(8104);
			break while_119_;
		    }
		    anInt5753 = arg2.readUnsignedShort(8104);
		    break while_119_;
		} while (false);
		aBoolean4093 = (arg2.readUnsignedByte(-43) ^ 0xffffffff) == -2;
	    } while (false);
	    anInt5756++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ff.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aClass214_5749 = new Class214(30);
	aString5755 = "Loading title screen - ";
    }
}
