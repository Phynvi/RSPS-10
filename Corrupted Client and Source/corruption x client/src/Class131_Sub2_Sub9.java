/* Class131_Sub2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub9 extends Class131_Sub2
{
    public static int[] anIntArray5662 = new int[14];
    public static String aString5663 = "Prepared sound engine";
    public static int anInt5664;
    public int anInt5665;
    public static int anInt5666;
    public int anInt5667;
    public static int anInt5668;
    public int anInt5669;
    public int anInt5670;
    public int anInt5671;
    public static String aString5672;
    public static int anInt5673;
    public int anInt5674;
    public static int[] anIntArray5675 = new int[14];
    public static Class119 aClass119_5676;
    public int anInt5677;
    public int anInt5678 = 0;
    public int anInt5679 = 0;
    public static int anInt5680;
    public static int anInt5681;
    public static Class19[] aClass19Array5682;
    public static Class158 aClass158_5683;
    public static Class173[][] aClass173ArrayArray5684;
    
    public void method1509(int arg0, int arg1, int arg2, int arg3) {
	anInt5666++;
	int i = ((arg1 ^ 0xffffffff) < -2049
		 ? arg1 - -arg3 - (arg3 * arg1 >> -1807042260)
		 : (arg3 + 4096) * arg1 >> 2056134220);
	if (arg0 != 8055)
	    anInt5680 = -1;
	if (i <= 0)
	    anInt5671 = anInt5669 = anInt5670 = arg1;
	else {
	    arg2 *= 6;
	    int i_0_ = arg1 + (arg1 + -i);
	    int i_1_ = (-i_0_ + i << 785861260) / i;
	    int i_2_ = arg2 >> -2003449460;
	    int i_3_ = -(i_2_ << -1845168020) + arg2;
	    int i_4_ = i;
	    i_4_ = i_4_ * i_1_ >> -581129236;
	    i_4_ = i_4_ * i_3_ >> -182351764;
	    int i_5_ = i_0_ - -i_4_;
	    int i_6_ = i - i_4_;
	    int i_7_ = i_2_;
	while_27_:
	    do {
	    while_26_:
		do {
		while_25_:
		    do {
		    while_24_:
			do {
			    do {
				if (i_7_ != 0) {
				    if ((i_7_ ^ 0xffffffff) != -2) {
					if ((i_7_ ^ 0xffffffff) != -3) {
					    if (i_7_ != 3) {
						if (i_7_ != 4) {
						    if (i_7_ != 5)
							break while_27_;
						} else
						    break while_25_;
						break while_26_;
					    }
					} else
					    break;
					break while_24_;
				    }
				} else {
				    anInt5671 = i;
				    anInt5670 = i_0_;
				    anInt5669 = i_5_;
				    return;
				}
				anInt5671 = i_6_;
				anInt5669 = i;
				anInt5670 = i_0_;
				return;
			    } while (false);
			    anInt5671 = i_0_;
			    anInt5669 = i;
			    anInt5670 = i_5_;
			    return;
			} while (false);
			anInt5669 = i_6_;
			anInt5670 = i;
			anInt5671 = i_0_;
			return;
		    } while (false);
		    anInt5670 = i;
		    anInt5671 = i_5_;
		    anInt5669 = i_0_;
		    return;
		} while (false);
		anInt5670 = i_6_;
		anInt5669 = i_0_;
		anInt5671 = i;
	    } while (false);
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	int i = arg0;
    while_28_:
	do {
	    do {
		if ((i ^ 0xffffffff) != -1) {
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 2)
			    break;
			break while_28_;
		    }
		} else {
		    anInt5679 = arg2.readSignedShort(1625554944);
		    break while_28_;
		}
		anInt5677 = (arg2.readSignedByte((byte) 127) << 854297356) / 100;
		break while_28_;
	    } while (false);
	    anInt5678 = (arg2.readSignedByte((byte) 127) << 289132492) / 100;
	} while (false);
	anInt5681++;
	if (arg1 != -49)
	    aClass19Array5682 = null;
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5673++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_8_ = this.method1463(0, (byte) 124, arg0);
		int[] is_9_ = is_8_[0];
		int[] is_10_ = is_8_[1];
		int[] is_11_ = is_8_[2];
		int[] is_12_ = is[0];
		int[] is_13_ = is[1];
		int[] is_14_ = is[2];
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    method1511(is_10_[i], -107, is_9_[i], is_11_[i]);
		    anInt5674 += anInt5677;
		    anInt5665 += anInt5678;
		    for (anInt5667 += anInt5679; (anInt5667 ^ 0xffffffff) > -1;
			 anInt5667 += 4096) {
			/* empty */
		    }
		    for (/**/; (anInt5667 ^ 0xffffffff) < -4097;
			 anInt5667 -= 4096) {
			/* empty */
		    }
		    if (anInt5674 < 0)
			anInt5674 = 0;
		    if ((anInt5674 ^ 0xffffffff) < -4097)
			anInt5674 = 4096;
		    if (anInt5665 < 0)
			anInt5665 = 0;
		    if (anInt5665 > 4096)
			anInt5665 = 4096;
		    method1509(8055, anInt5665, anInt5667, anInt5674);
		    is_12_[i] = anInt5671;
		    is_13_[i] = anInt5669;
		    is_14_[i] = anInt5670;
		}
	    }
	    if (arg1 != 0)
		method1511(-74, -96, -10, -2);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eh.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub9() {
	super(1, false);
	anInt5677 = 0;
    }
    
    public static void method1510(int arg0) {
	try {
	    aClass19Array5682 = null;
	    aString5663 = null;
	    aClass173ArrayArray5684 = null;
	    aClass119_5676 = null;
	    if (arg0 != 20480)
		method1512(null, -124, -119);
	    aString5672 = null;
	    anIntArray5662 = null;
	    anIntArray5675 = null;
	    aClass158_5683 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"eh.G(" + arg0 + ')');
	}
    }
    
    public void method1511(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt5668++;
	    if (arg1 >= -30)
		anInt5670 = -106;
	    int i = arg0 < arg2 ? arg2 : arg0;
	    int i_15_ = arg0 > arg2 ? arg2 : arg0;
	    i = arg3 <= i ? i : arg3;
	    i_15_ = i_15_ <= arg3 ? i_15_ : arg3;
	    int i_16_ = -i_15_ + i;
	    anInt5665 = (i_15_ - -i) / 2;
	    if ((anInt5665 ^ 0xffffffff) >= -1 || anInt5665 >= 4096)
		anInt5674 = 0;
	    else
		anInt5674 = ((i_16_ << -1613682900)
			     / ((anInt5665 ^ 0xffffffff) >= -2049
				? 2 * anInt5665 : -(2 * anInt5665) + 8192));
	    if ((i_16_ ^ 0xffffffff) < -1) {
		int i_17_ = (-arg2 + i << 1987682188) / i_16_;
		int i_18_ = (i + -arg0 << -1758193524) / i_16_;
		int i_19_ = (i + -arg3 << -598583060) / i_16_;
		if (arg2 != i) {
		    if (arg0 != i)
			anInt5667
			    = ((arg2 ^ 0xffffffff) != (i_15_ ^ 0xffffffff)
			       ? -i_17_ + 20480 : 12288 + i_18_);
		    else
			anInt5667
			    = arg3 != i_15_ ? -i_19_ + 12288 : 4096 - -i_17_;
		} else
		    anInt5667 = i_15_ != arg0 ? -i_18_ + 4096 : 20480 + i_19_;
		anInt5667 /= 6;
	    } else
		anInt5667 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eh.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static Class82 method1512(Class23_Sub4 arg0, int arg1, int arg2) {
	try {
	    anInt5664++;
	    Class82 class82;
	    if (Class131_Sub6.aClass82_4160 != null) {
		class82 = Class131_Sub6.aClass82_4160;
		Class131_Sub6.aClass82_4160
		    = Class131_Sub6.aClass82_4160.aClass82_1086;
		class82.aClass82_1086 = null;
		Class52.anInt689--;
	    } else
		class82 = new Class82();
	    class82.anInt1081 = arg2;
	    if (arg1 < 54)
		return null;
	    class82.aClass23_Sub4_1080 = arg0;
	    return class82;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eh.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    static {
	aString5672 = "Unable to find ";
	aClass119_5676 = new Class119();
	aClass19Array5682 = new Class19[4];
    }
}
