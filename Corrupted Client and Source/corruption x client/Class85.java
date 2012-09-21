/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

public class Class85
{
    public static int anInt1103;
    public static boolean aBoolean1104 = true;
    public static float aFloat1105;
    public static int anInt1106;
    public static int anInt1107;
    public static int anInt1108;
    public Class163 aClass163_1109 = null;
    public static int anInt1110;
    public static int anInt1111;
    public int anInt1112;
    public static int anInt1113;
    public Class163 aClass163_1114 = null;
    public static int anInt1115;
    public static Class68[] aClass68Array1116;
    public int anInt1117;
    public static byte aByte1118;
    public static int anInt1119 = -50;
    
    public static void method806(int arg0) {
	aClass68Array1116 = null;
	if (arg0 != 520)
	    anInt1111 = 123;
    }
    
    public static boolean method807(byte arg0, int arg1) {
	try {
	    anInt1107++;
	    if (arg1 == 5 || (arg1 ^ 0xffffffff) == -40
		|| (arg1 ^ 0xffffffff) == -47 || arg1 == 58
		|| (arg1 ^ 0xffffffff) == -61)
		return true;
	    if ((arg1 ^ 0xffffffff) == -33 || (arg1 ^ 0xffffffff) == -8
		|| (arg1 ^ 0xffffffff) == -1006)
		return true;
	    if (arg1 == 30 || arg1 == 26 || arg1 == 42 || arg1 == 31
		|| arg1 == 2)
		return true;
	    if (arg0 <= 103)
		return false;
	    if ((arg1 ^ 0xffffffff) == -36 || arg1 == 18
		|| (arg1 ^ 0xffffffff) == -1013 || (arg1 ^ 0xffffffff) == -12)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method808(int arg0, int arg1, byte[] arg2, int arg3) {
	try {
	    anInt1108++;
	    synchronized (aClass163_1114) {
		if (arg3 < (arg1 ^ 0xffffffff)
		    || (anInt1112 ^ 0xffffffff) > (arg1 ^ 0xffffffff))
		    throw new IllegalArgumentException();
		boolean bool = method810(arg2, (byte) 30, true, arg0, arg1);
		if (!bool)
		    bool = method810(arg2, (byte) 52, false, arg0, arg1);
		return bool;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.E(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method809(int arg0, long arg1) {
	try {
	    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
	    anInt1110++;
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(21);
	    Class93.aClass131_Sub15_Sub2_1226.method1747((byte) 119, arg1);
	    Class131_Sub2_Sub21.anInt5854 = 0;
	    if (arg0 >= -75)
		method807((byte) -27, -13);
	    Class176.anInt2523 = 1;
	    Class131_Sub2_Sub20.anInt5838 = -3;
	    Class35.anInt496 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method810(byte[] arg0, byte arg1, boolean arg2, int arg3,
			     int arg4) {
	try {
	    anInt1115++;
	    synchronized (aClass163_1114) {
		try {
		    int i;
		    if (!arg2) {
			i = (int) ((aClass163_1114.method2401(-72) - -519L)
				   / 520L);
			if (i == 0)
			    i = 1;
		    } else {
			if (aClass163_1109.method2401(-64)
			    < (long) (6 + arg3 * 6))
			    return false;
			aClass163_1109.method2398(0, (long) (arg3 * 6));
			aClass163_1109.method2404(Class19.aByteArray210,
						  (byte) 92, 0, 6);
			i = (((Class19.aByteArray210[4] & 0xff) << -206339416)
			     + (((0xff & Class19.aByteArray210[3]) << 23375984)
				- -(Class19.aByteArray210[5] & 0xff)));
			if (i <= 0
			    || ((long) i
				> aClass163_1114.method2401(-72) / 520L))
			    return false;
		    }
		    Class19.aByteArray210[2] = (byte) arg4;
		    Class19.aByteArray210[0] = (byte) (arg4 >> -2033352368);
		    if (arg1 <= 16)
			return true;
		    Class19.aByteArray210[3] = (byte) (i >> 2124336560);
		    Class19.aByteArray210[1] = (byte) (arg4 >> 1809829480);
		    Class19.aByteArray210[5] = (byte) i;
		    Class19.aByteArray210[4] = (byte) (i >> -710017752);
		    aClass163_1109.method2398(0, (long) (6 * arg3));
		    aClass163_1109.method2405(Class19.aByteArray210, 6, 0, 90);
		    int i_0_ = 0;
		    int i_1_ = 0;
		    while (i_0_ < arg4) {
			int i_2_ = 0;
			if (arg2) {
			    aClass163_1114.method2398(0, (long) (i * 520));
			    try {
				aClass163_1114.method2404((Class19
							   .aByteArray210),
							  (byte) 71, 0, 8);
			    } catch (java.io.EOFException eofexception) {
				break;
			    }
			    int i_3_
				= ((0xff00
				    & Class19.aByteArray210[0] << 1746926344)
				   + (0xff & Class19.aByteArray210[1]));
			    i_2_ = (((0xff & Class19.aByteArray210[4])
				     << 383544432)
				    + (((0xff & Class19.aByteArray210[5])
					<< 181936392)
				       - -(0xff & Class19.aByteArray210[6])));
			    int i_4_ = ((0xff & Class19.aByteArray210[3])
					+ ((0xff & Class19.aByteArray210[2])
					   << -980203000));
			    int i_5_ = Class19.aByteArray210[7] & 0xff;
			    if (arg3 != i_3_
				|| (i_4_ ^ 0xffffffff) != (i_1_ ^ 0xffffffff)
				|| (anInt1117 ^ 0xffffffff) != (i_5_
								^ 0xffffffff))
				return false;
			    if ((i_2_ ^ 0xffffffff) > -1
				|| ((aClass163_1114.method2401(-121) / 520L
				     ^ 0xffffffffffffffffL)
				    > ((long) i_2_ ^ 0xffffffffffffffffL)))
				return false;
			}
			if ((i_2_ ^ 0xffffffff) == -1) {
			    i_2_ = (int) ((aClass163_1114.method2401(-84)
					   + 519L)
					  / 520L);
			    arg2 = false;
			    if ((i_2_ ^ 0xffffffff) == -1)
				i_2_++;
			    if (i == i_2_)
				i_2_++;
			}
			Class19.aByteArray210[2] = (byte) (i_1_ >> 918854792);
			if ((arg4 - i_0_ ^ 0xffffffff) >= -513)
			    i_2_ = 0;
			Class19.aByteArray210[1] = (byte) arg3;
			Class19.aByteArray210[3] = (byte) i_1_;
			Class19.aByteArray210[0]
			    = (byte) (arg3 >> -1449414776);
			Class19.aByteArray210[6] = (byte) i_2_;
			Class19.aByteArray210[7] = (byte) anInt1117;
			Class19.aByteArray210[5] = (byte) (i_2_ >> -188055992);
			Class19.aByteArray210[4]
			    = (byte) (i_2_ >> -1496253104);
			aClass163_1114.method2398(0, (long) (520 * i));
			aClass163_1114.method2405(Class19.aByteArray210, 8, 0,
						  78);
			int i_6_ = arg4 + -i_0_;
			if (i_6_ > 512)
			    i_6_ = 512;
			aClass163_1114.method2405(arg0, i_6_, i_0_, 79);
			i_0_ += i_6_;
			i_1_++;
			i = i_2_;
		    }
		    return true;
		} catch (java.io.IOException ioexception) {
		    return false;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    public byte[] method811(byte arg0, int arg1) {
	try {
	    anInt1106++;
	    synchronized (aClass163_1114) {
		try {
		    if ((aClass163_1109.method2401(arg0 ^ 0x44)
			 ^ 0xffffffffffffffffL)
			> ((long) (6 * arg1 - -6) ^ 0xffffffffffffffffL))
			return null;
		    if (arg0 != -4)
			aBoolean1104 = true;
		    aClass163_1109.method2398(arg0 ^ ~0x3, (long) (arg1 * 6));
		    aClass163_1109.method2404(Class19.aByteArray210,
					      (byte) 127, 0, 6);
		    int i
			= (((Class19.aByteArray210[0] & 0xff) << -1645610960)
			   - -((0xff & Class19.aByteArray210[1]) << 1652703912)
			   - -(Class19.aByteArray210[2] & 0xff));
		    int i_7_
			= ((Class19.aByteArray210[5] & 0xff)
			   + ((0xff00 & Class19.aByteArray210[4] << 1670824776)
			      + (Class19.aByteArray210[3] << -741436368
				 & 0xff0000)));
		    if ((i ^ 0xffffffff) > -1 || i > anInt1112)
			return null;
		    if (i_7_ <= 0
			|| (((long) i_7_ ^ 0xffffffffffffffffL)
			    < (aClass163_1114.method2401(arg0 ^ 0x60) / 520L
			       ^ 0xffffffffffffffffL)))
			return null;
		    byte[] is = new byte[i];
		    int i_8_ = 0;
		    int i_9_ = 0;
		    while ((i_8_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
			if ((i_7_ ^ 0xffffffff) == -1)
			    return null;
			aClass163_1114.method2398(0, (long) (520 * i_7_));
			int i_10_ = -i_8_ + i;
			if (i_10_ > 512)
			    i_10_ = 512;
			aClass163_1114.method2404(Class19.aByteArray210,
						  (byte) -72, 0, 8 + i_10_);
			int i_11_ = (((0xff & Class19.aByteArray210[0])
				      << -1670710168)
				     + (Class19.aByteArray210[1] & 0xff));
			int i_12_ = ((0xff & Class19.aByteArray210[3])
				     + (Class19.aByteArray210[2] << 1109542984
					& 0xff00));
			int i_13_
			    = ((Class19.aByteArray210[6] & 0xff)
			       + (((Class19.aByteArray210[5] & 0xff)
				   << 44708648)
				  + (Class19.aByteArray210[4] << -508718576
				     & 0xff0000)));
			int i_14_ = Class19.aByteArray210[7] & 0xff;
			if ((i_11_ ^ 0xffffffff) != (arg1 ^ 0xffffffff)
			    || (i_9_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff)
			    || (i_14_ ^ 0xffffffff) != (anInt1117
							^ 0xffffffff))
			    return null;
			if ((i_13_ ^ 0xffffffff) > -1
			    || ((aClass163_1114.method2401(-100) / 520L
				 ^ 0xffffffffffffffffL)
				> ((long) i_13_ ^ 0xffffffffffffffffL)))
			    return null;
			i_9_++;
			i_7_ = i_13_;
			for (int i_15_ = 0;
			     (i_10_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
			     i_15_++)
			    is[i_8_++] = Class19.aByteArray210[i_15_ - -8];
		    }
		    return is;
		} catch (java.io.IOException ioexception) {
		    return null;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public String toString() {
	try {
	    anInt1103++;
	    return "Cache:" + anInt1117;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jb.toString(" + ')');
	}
    }
    
    public Class85(int arg0, Class163 arg1, Class163 arg2, int arg3) {
	anInt1112 = 65000;
	try {
	    anInt1112 = arg3;
	    aClass163_1114 = arg1;
	    anInt1117 = arg0;
	    aClass163_1109 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jb.<init>(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method812(byte arg0) {
	try {
	    anInt1113++;
	    if (Class74.aFrame1014 == null) {
		java.awt.Container container;
		if (Class158.aFrame2095 != null)
		    container = Class158.aFrame2095;
		else
		    container = Class23_Sub4.aSignLink_3734.anApplet2883;
		Class166.anInt2204 = container.getSize().width;
		Class131_Sub41_Sub15.anInt6355 = container.getSize().height;
		if (container == Class158.aFrame2095) {
		    Insets insets = Class158.aFrame2095.getInsets();
		    Class166.anInt2204 -= insets.left + insets.right;
		    Class131_Sub41_Sub15.anInt6355
			-= insets.top + insets.bottom;
		}
		if (Class131_Sub18.method1806(-96) != 1) {
		    if (Class1_Sub4.anInt3554 >= 96
			|| Stream.anInt4299 != 0) {
			Class131_Sub1_Sub1.anInt5499 = Class166.anInt2204;
			Class71.anInt946 = 0;
			Class57.anInt750 = 0;
			Class218.anInt3201 = Class131_Sub41_Sub15.anInt6355;
		    } else {
			int i = ((Class166.anInt2204 ^ 0xffffffff) >= -1025
				 ? Class166.anInt2204 : 1024);
			Class131_Sub1_Sub1.anInt5499 = i;
			int i_16_ = ((Class131_Sub41_Sub15.anInt6355
				      ^ 0xffffffff) >= -769
				     ? Class131_Sub41_Sub15.anInt6355 : 768);
			Class71.anInt946 = (Class166.anInt2204 + -i) / 2;
			Class218.anInt3201 = i_16_;
			Class57.anInt750 = 0;
		    }
		} else {
		    Class57.anInt750 = 0;
		    Class131_Sub1_Sub1.anInt5499 = 765;
		    Class218.anInt3201 = 503;
		    Class71.anInt946 = (Class166.anInt2204 - 765) / 2;
		}
		if ((Class1_Sub7.anInt3581 ^ 0xffffffff) != -1) {
		    if ((Class131_Sub1_Sub1.anInt5499 ^ 0xffffffff) > -1025
			&& Class218.anInt3201 < 768) {
			/* empty */
		    }
		}
		Class131_Sub2_Sub15.aCanvas5768
		    .setSize(Class131_Sub1_Sub1.anInt5499, Class218.anInt3201);
		if (Class183_Sub1.aClass130_4960 != null)
		    Class183_Sub1.aClass130_4960.method1221();
		if (container != Class158.aFrame2095)
		    Class131_Sub2_Sub15.aCanvas5768
			.setLocation(Class71.anInt946, Class57.anInt750);
		else {
		    Insets insets = Class158.aFrame2095.getInsets();
		    Class131_Sub2_Sub15.aCanvas5768.setLocation
			(insets.left + Class71.anInt946,
			 Class57.anInt750 + insets.top);
		}
		if (Class187.anInt2674 != -1)
		    Class120_Sub2.method1036(-123, true);
		if (arg0 <= -82)
		    Class131_Sub2.method1457((byte) 106);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jb.B(" + arg0 + ')');
	}
    }
}
