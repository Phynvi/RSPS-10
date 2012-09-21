/* Class131_Sub2_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub22 extends Class131_Sub2
{
    public static Class9 aClass9_5859;
    public static int anInt5860;
    public static int anInt5861;
    public static int anInt5862;
    public static int anInt5863 = 0;
    public static int anInt5864;
    public static volatile boolean aBoolean5865;
    public static int anInt5866;
    public static int anInt5867;
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 != -49)
		anInt5862 = 72;
	    if ((arg0 ^ 0xffffffff) == -1)
		aBoolean4093 = arg2.readUnsignedByte(-84) == 1;
	    anInt5864++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mo.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1574(boolean arg0) {
	try {
	    if (arg0 != false)
		aBoolean5865 = false;
	    aClass9_5859 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mo.F(" + arg0 + ')');
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5867++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -113);
	    if (arg0 != -11543)
		anInt5862 = 77;
	    if (aClass200_4087.aBoolean2927) {
		int[] is_0_ = this.method1459(0, (byte) -40, arg1);
		int[] is_1_ = this.method1459(1, (byte) -40, arg1);
		int[] is_2_ = this.method1459(2, (byte) -40, arg1);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++) {
		    int i_3_ = is_2_[i];
		    if ((i_3_ ^ 0xffffffff) != -4097) {
			if ((i_3_ ^ 0xffffffff) != -1)
			    is[i]
				= (is_0_[i] * i_3_ + (-i_3_ + 4096) * is_1_[i]
				   >> -1881951572);
			else
			    is[i] = is_1_[i];
		    } else
			is[i] = is_0_[i];
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mo.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub22() {
	super(3, false);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		method1574(true);
	    anInt5860++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[] is_4_ = this.method1459(2, (byte) -40, arg0);
		int[][] is_5_ = this.method1463(0, (byte) 117, arg0);
		int[][] is_6_ = this.method1463(1, (byte) 115, arg0);
		int[] is_7_ = is[0];
		int[] is_8_ = is[1];
		int[] is_9_ = is[2];
		int[] is_10_ = is_5_[0];
		int[] is_11_ = is_5_[1];
		int[] is_12_ = is_5_[2];
		int[] is_13_ = is_6_[0];
		int[] is_14_ = is_6_[1];
		int[] is_15_ = is_6_[2];
		for (int i = 0; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    int i_16_ = is_4_[i];
		    if (i_16_ != 4096) {
			if ((i_16_ ^ 0xffffffff) == -1) {
			    is_7_[i] = is_13_[i];
			    is_8_[i] = is_14_[i];
			    is_9_[i] = is_15_[i];
			} else {
			    int i_17_ = -i_16_ + 4096;
			    is_7_[i] = (i_17_ * is_13_[i] + is_10_[i] * i_16_
					>> -1866844564);
			    is_8_[i] = (is_14_[i] * i_17_ + is_11_[i] * i_16_
					>> -1024782164);
			    is_9_[i] = (is_12_[i] * i_16_ + i_17_ * is_15_[i]
					>> 707286892);
			}
		    } else {
			is_7_[i] = is_10_[i];
			is_8_[i] = is_11_[i];
			is_9_[i] = is_12_[i];
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mo.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static short method1575(byte arg0, int arg1) {
	try {
	    anInt5861++;
	    int i = (arg1 & 0xfcd6) >> -866599478;
	    int i_18_ = 0x70 & arg1 >> 68279395;
	    int i_19_ = -18 / ((-74 - arg0) / 51);
	    int i_20_ = arg1 & 0x7f;
	    i_18_ = (i_20_ > 64 ? i_18_ * (-i_20_ + 127) >> -1813850105
		     : i_20_ * i_18_ >> 1548008423);
	    int i_21_ = i_20_ + i_18_;
	    int i_22_;
	    if ((i_21_ ^ 0xffffffff) == -1)
		i_22_ = i_18_ << -1801096703;
	    else
		i_22_ = (i_18_ << 1567197064) / i_21_;
	    int i_23_ = i_21_;
	    return (short) (i_23_ | (i << -1843742358
				     | i_22_ >> -318473340 << -1680328121));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mo.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1576(int arg0, int arg1, int arg2) {
	try {
	    anInt5866++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(arg0, arg2, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    class131_sub41_sub6.anInt6244 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mo.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	anInt5862 = -1;
	aBoolean5865 = true;
    }
}
