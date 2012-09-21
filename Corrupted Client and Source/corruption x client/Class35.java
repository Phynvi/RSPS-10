/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35
{
    public static int anInt492;
    public static int anInt493;
    public static boolean aBoolean494;
    public static int anInt495;
    public static int anInt496;
    public static int anInt497;
    public static String aString498 = "cyan:";
    public static int anInt499;
    
    public static void method463(int arg0, int arg1) {
	try {
	    if (arg0 != -4)
		method467(-120, 35, -38, -32, 99);
	    anInt499++;
	    Class1_Sub3.anInt3528 = arg1;
	    synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		Class131_Sub41_Sub5.aClass214_6226.method2783(-118);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dd.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method464(boolean arg0) {
	try {
	    if (arg0 != false)
		anInt496 = -75;
	    aString498 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dd.D(" + arg0 + ')');
	}
    }
    
    public static String method465(int arg0, boolean arg1) {
	try {
	    anInt497++;
	    if (arg1 != true)
		return null;
	    String string = Integer.toString(arg0);
	    for (int i = -3 + string.length(); i > 0; i -= 3)
		string = string.substring(0, i) + "," + string.substring(i);
	    if ((string.length() ^ 0xffffffff) < -10)
		return (" <col=00ff80>"
			+ string.substring(0, string.length() + -8)
			+ Class131_Sub2_Sub11.aString5711 + " (" + string
			+ ")</col>");
	    if (string.length() > 6)
		return (" <col=ffffff>"
			+ string.substring(0, string.length() + -4)
			+ Class121_Sub3_Sub1.aString5431 + " (" + string
			+ ")</col>");
	    return " <col=ffff00>" + string + "</col>";
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dd.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method466(int arg0) {
	anInt492++;
	if (Class131_Sub41_Sub17_Sub1.method2048(28804) == 2) {
	    byte i = (byte) (Class83.anInt1093 - 4 & 0xff);
	    int i_0_ = Class83.anInt1093 % Class131_Sub41_Sub11_Sub1.anInt6546;
	    for (int i_1_ = 0; i_1_ < 4; i_1_++) {
		for (int i_2_ = 0; Class131_Sub2_Sub26.anInt5931 > i_2_;
		     i_2_++)
		    Class146.aByteArrayArrayArray1942[i_1_][i_0_][i_2_] = i;
	    }
	    int i_3_ = -94 % ((33 - arg0) / 50);
	    if (Class29.anInt300 != 3) {
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -3; i_4_++) {
		    Class53.anIntArray699[i_4_] = -1000000;
		    Class153.anIntArray2028[i_4_] = 1000000;
		    Class121_Sub2_Sub1.anIntArray5425[i_4_] = 0;
		    Class131_Sub2_Sub25.anIntArray5915[i_4_] = 1000000;
		    Class131_Sub2_Sub12.anIntArray5723[i_4_] = 0;
		}
		if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -2) {
		    if (((Class23_Sub2_Sub1.aByteArrayArrayArray4992
			  [Class29.anInt300]
			  [(Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
			    >> -1038667001)]
			  [(Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
			    >> 459998215)])
			 & 0x4)
			!= 0)
			Class215.method2805
			    (0, false,
			     Class131_Sub2_Sub29.aClass147ArrayArrayArray5972,
			     -27508,
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
			      >> -299078169),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
			      >> -1976019449));
		    if (Stream.anInt4323 < 2560) {
			int i_5_ = Class2.anInt84 >> 1609611367;
			int i_6_ = Class57.anInt753 >> 1857729159;
			int i_7_
			    = (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
			       >> 39275367);
			int i_8_
			    = (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
			       >> 1173868775);
			int i_9_;
			if ((i_5_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff))
			    i_9_ = -i_7_ + i_5_;
			else
			    i_9_ = -i_5_ + i_7_;
			int i_10_;
			if ((i_6_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))
			    i_10_ = i_8_ + -i_6_;
			else
			    i_10_ = -i_8_ + i_6_;
			if ((i_9_ ^ 0xffffffff) == -1 && i_10_ == 0
			    || ((i_9_ ^ 0xffffffff)
				>= (-Class131_Sub41_Sub11_Sub1.anInt6546
				    ^ 0xffffffff))
			    || ((i_9_ ^ 0xffffffff)
				<= (Class131_Sub41_Sub11_Sub1.anInt6546
				    ^ 0xffffffff))
			    || ((i_10_ ^ 0xffffffff)
				>= (-Class131_Sub2_Sub26.anInt5931
				    ^ 0xffffffff))
			    || i_10_ >= Class131_Sub2_Sub26.anInt5931)
			    Class45.method563(("RC: " + i_5_ + "," + i_6_ + " "
					       + i_7_ + "," + i_8_ + " "
					       + Class92.regionX + ","
					       + Class64.regionY),
					      null, 0);
			else if ((i_9_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
			    int i_11_ = i_9_ * 65536 / i_10_;
			    int i_12_ = 32768;
			    while ((i_6_ ^ 0xffffffff)
				   != (i_8_ ^ 0xffffffff)) {
				if (i_8_ > i_6_)
				    i_6_++;
				else if (i_6_ > i_8_)
				    i_6_--;
				if (((Class23_Sub2_Sub1
				      .aByteArrayArrayArray4992
				      [Class29.anInt300][i_5_][i_6_])
				     & 0x4)
				    != 0) {
				    Class215.method2805
					(1, false,
					 (Class131_Sub2_Sub29
					  .aClass147ArrayArrayArray5972),
					 -27508, i_6_, i_5_);
				    break;
				}
				i_12_ += i_11_;
				if ((i_12_ ^ 0xffffffff) <= -65537) {
				    i_12_ -= 65536;
				    if ((i_5_ ^ 0xffffffff)
					> (i_7_ ^ 0xffffffff))
					i_5_++;
				    else if ((i_7_ ^ 0xffffffff)
					     > (i_5_ ^ 0xffffffff))
					i_5_--;
				    if ((0x4
					 & (Class23_Sub2_Sub1
					    .aByteArrayArrayArray4992
					    [Class29.anInt300][i_5_][i_6_]))
					!= 0) {
					Class215.method2805
					    (1, false,
					     (Class131_Sub2_Sub29
					      .aClass147ArrayArrayArray5972),
					     -27508, i_6_, i_5_);
					break;
				    }
				}
			    }
			} else {
			    int i_13_ = 65536 * i_10_ / i_9_;
			    int i_14_ = 32768;
			    while (i_5_ != i_7_) {
				if ((i_5_ ^ 0xffffffff)
				    <= (i_7_ ^ 0xffffffff)) {
				    if (i_7_ < i_5_)
					i_5_--;
				} else
				    i_5_++;
				if ((0x4 & (Class23_Sub2_Sub1
					    .aByteArrayArrayArray4992
					    [Class29.anInt300][i_5_][i_6_]))
				    != 0) {
				    Class215.method2805
					(1, false,
					 (Class131_Sub2_Sub29
					  .aClass147ArrayArrayArray5972),
					 -27508, i_6_, i_5_);
				    break;
				}
				i_14_ += i_13_;
				if (i_14_ >= 65536) {
				    i_14_ -= 65536;
				    if (i_6_ >= i_8_) {
					if (i_6_ > i_8_)
					    i_6_--;
				    } else
					i_6_++;
				    if ((0x4
					 & (Class23_Sub2_Sub1
					    .aByteArrayArrayArray4992
					    [Class29.anInt300][i_5_][i_6_]))
					!= 0) {
					Class215.method2805
					    (1, false,
					     (Class131_Sub2_Sub29
					      .aClass147ArrayArrayArray5972),
					     -27508, i_6_, i_5_);
					break;
				    }
				}
			    }
			}
		    }
		} else {
		    int i_15_
			= RuntimeException_Sub1.method2833(Class57.anInt753,
							   114, Class2.anInt84,
							   Class29.anInt300);
		    if ((i_15_ + -Class87.anInt1140 ^ 0xffffffff) > -801
			&& (0x4
			    & (Class23_Sub2_Sub1.aByteArrayArrayArray4992
			       [Class29.anInt300][Class2.anInt84 >> -380463993]
			       [Class57.anInt753 >> 2032585383])) != 0)
			Class215.method2805(1, false,
					    (Class131_Sub2_Sub29
					     .aClass147ArrayArrayArray5972),
					    -27508,
					    Class57.anInt753 >> -54374425,
					    Class2.anInt84 >> -1063385753);
		}
	    }
	}
    }
    
    public static void method467(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt493++;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(arg4 + 21087,
							       (long) arg1));
	    if (arg4 != -21180)
		aString498 = null;
	    if (class131_sub13 == null) {
		class131_sub13 = new Class131_Sub13();
		Class23_Sub5_Sub1.aClass180_5041.method2523(false, (long) arg1,
							    class131_sub13);
	    }
	    if ((class131_sub13.anIntArray4257.length ^ 0xffffffff)
		>= (arg2 ^ 0xffffffff)) {
		int[] is = new int[arg2 + 1];
		int[] is_16_ = new int[1 + arg2];
		for (int i = 0;
		     ((class131_sub13.anIntArray4257.length ^ 0xffffffff)
		      < (i ^ 0xffffffff));
		     i++) {
		    is[i] = class131_sub13.anIntArray4257[i];
		    is_16_[i] = class131_sub13.anIntArray4267[i];
		}
		for (int i = class131_sub13.anIntArray4257.length;
		     (arg2 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    is[i] = -1;
		    is_16_[i] = 0;
		}
		class131_sub13.anIntArray4267 = is_16_;
		class131_sub13.anIntArray4257 = is;
	    }
	    class131_sub13.anIntArray4257[arg2] = arg3;
	    class131_sub13.anIntArray4267[arg2] = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dd.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static int method468(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6) {
	try {
	    arg6 &= 0x3;
	    if ((arg4 & 0x1 ^ 0xffffffff) == -2) {
		int i = arg2;
		arg2 = arg1;
		arg1 = i;
	    }
	    anInt495++;
	    if (arg6 == 0)
		return arg5;
	    if (arg3 != 65536)
		method467(-69, 26, -21, 98, -101);
	    if ((arg6 ^ 0xffffffff) == -2)
		return arg0;
	    if (arg6 == 2)
		return -arg5 + (7 - arg2) + 1;
	    return -arg0 + (7 - arg1 - -1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dd.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    static {
	anInt496 = 0;
    }
}
