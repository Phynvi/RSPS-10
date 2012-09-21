/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class45
{
    public static int[] anIntArray620;
    public static Class85 aClass85_621;
    public static int anInt622;
    public static int anInt623;
    public static int anInt624;
    public static boolean[][] aBooleanArrayArray625;
    public static boolean aBoolean626 = false;
    public static int anInt627;
    public static int anInt628;
    public static int anInt629;
    
    public static void method559(int arg0) {
	try {
	    aBooleanArrayArray625 = null;
	    anIntArray620 = null;
	    if (arg0 == 671288225)
		aClass85_621 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ds.A(" + arg0 + ')');
	}
    }
    
    public static int method560(byte arg0, int arg1, int arg2) {
	try {
	    anInt629++;
	    if ((arg2 ^ 0xffffffff) == 1)
		return 12345678;
	    if (arg2 == -1) {
		if ((arg1 ^ 0xffffffff) <= -3) {
		    if ((arg1 ^ 0xffffffff) < -127)
			arg1 = 126;
		} else
		    arg1 = 2;
		return arg1;
	    }
	    arg1 = arg1 * (arg2 & 0x7f) >> 1754684135;
	    if ((arg1 ^ 0xffffffff) <= -3) {
		if (arg1 > 126)
		    arg1 = 126;
	    } else
		arg1 = 2;
	    if (arg0 > -11)
		return -26;
	    return arg1 + (0xff80 & arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ds.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static boolean method561(int arg0, boolean arg1, int arg2, int arg3,
				    int arg4) {
	try {
	    anInt622++;
	    if ((0x2
		 & Class23_Sub2_Sub1.aByteArrayArrayArray4992[0][arg0][arg2])
		!= 0)
		return true;
	    if ((Class23_Sub2_Sub1.aByteArrayArrayArray4992[arg3][arg0][arg2]
		 & 0x10)
		!= 0)
		return false;
	    if (arg1 != true)
		method559(77);
	    if ((Class47.method576(arg0, -49, arg2, arg3) ^ 0xffffffff)
		== (arg4 ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ds.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method562(int arg0, Class158 arg1, boolean arg2,
				 Class158 arg3) {
	do {
	    try {
		Class131_Sub2_Sub13.aBoolean5738 = arg2;
		anInt623++;
		Class177.aClass158_2527 = arg3;
		Class131_Sub41_Sub7.aClass158_6254 = arg1;
		if (arg0 == 2)
		    break;
		aBooleanArrayArray625 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("ds.E(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method563(String arg0, Throwable arg1, int arg2) {
	anInt628++;
	do {
	    try {
		String string = "";
		if (arg1 != null)
		    string = Class12.method210((byte) 117, arg1);
		if (arg0 != null) {
		    if (arg1 != null)
			string += " | ";
		    string += (String) arg0;
		}
		Class153_Sub2.method2240(4, string);
		string = Class131_Sub42.method2090(string, ":", "%3a", arg2);
		string = Class131_Sub42.method2090(string, "@", "%40",
						   arg2 + arg2);
		string = Class131_Sub42.method2090(string, "&", "%26", 0);
		string = Class131_Sub42.method2090(string, "#", "%23", 0);
		if (Class131_Sub13.aSignLink_4259.anApplet2883 != null) {
		    Class139 class139
			= (Class131_Sub13.aSignLink_4259.method2691
			   ((byte) 91, new URL(Class131_Sub13
						   .aSignLink_4259.anApplet2883
						   .getCodeBase(),
					       ("clienterror.ws?c="
						+ Class131_Sub8_Sub1.anInt6091
						+ "&u=" + Class173.aLong2428
						+ "&v1=" + SignLink.aString2904
						+ "&v2=" + SignLink.aString2893
						+ "&e=" + string))));
		    while ((class139.anInt1864 ^ 0xffffffff) == -1)
			Class187.method2575(-28, 1L);
		    if (class139.anInt1864 != 1)
			break;
		    DataInputStream datainputstream
			= (DataInputStream) class139.anObject1866;
		    datainputstream.read();
		    datainputstream.close();
		}
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method564(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    anInt624++;
	    int i = 0;
	    int i_0_ = arg1;
	    int i_1_ = arg3 * arg3;
	    int i_2_ = arg1 * arg1;
	    int i_3_ = i_2_ << 671288225;
	    int i_4_ = i_1_ << 1621943329;
	    int i_5_ = arg1 << -1653452799;
	    int i_6_ = i_1_ * (-i_5_ + 1) + i_3_;
	    int i_7_ = i_2_ - (i_5_ + -1) * i_4_;
	    int i_8_ = i_1_ << -1377774014;
	    int i_9_ = i_2_ << -1728653054;
	    int i_10_ = i_3_ * ((i << 1827594657) - -3);
	    int i_11_ = i_4_ * (-3 + (i_0_ << -638153727));
	    if (arg2 != 21697)
		method560((byte) 27, -93, 29);
	    int i_12_ = i_9_ * (i - -1);
	    if (arg4 >= Class116.anInt1494
		&& (Class125.anInt1629 ^ 0xffffffff) <= (arg4 ^ 0xffffffff)) {
		int i_13_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg5 + arg3);
		int i_14_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, -arg3 + arg5);
		Class131_Sub3.method1650(i_13_,
					 Class56.anIntArrayArray740[arg4],
					 arg0, i_14_, arg2 + -21602);
	    }
	    int i_15_ = (-1 + i_0_) * i_8_;
	    while (i_0_ > 0) {
		if ((i_6_ ^ 0xffffffff) > -1) {
		    while ((i_6_ ^ 0xffffffff) > -1) {
			i_7_ += i_12_;
			i_6_ += i_10_;
			i_12_ += i_9_;
			i++;
			i_10_ += i_9_;
		    }
		}
		if ((i_7_ ^ 0xffffffff) > -1) {
		    i_6_ += i_10_;
		    i_7_ += i_12_;
		    i++;
		    i_12_ += i_9_;
		    i_10_ += i_9_;
		}
		i_6_ += -i_15_;
		i_7_ += -i_11_;
		i_0_--;
		i_11_ -= i_8_;
		i_15_ -= i_8_;
		int i_16_ = arg4 - i_0_;
		int i_17_ = arg4 + i_0_;
		if ((i_17_ ^ 0xffffffff) <= (Class116.anInt1494 ^ 0xffffffff)
		    && i_16_ <= Class125.anInt1629) {
		    int i_18_
			= Class180.method2517(-15543, Class115.anInt1477,
					      Class149.anInt1988, arg5 + i);
		    int i_19_
			= Class180.method2517(-15543, Class115.anInt1477,
					      Class149.anInt1988, arg5 + -i);
		    if ((Class116.anInt1494 ^ 0xffffffff)
			>= (i_16_ ^ 0xffffffff))
			Class131_Sub3.method1650(i_18_,
						 (Class56.anIntArrayArray740
						  [i_16_]),
						 arg0, i_19_, arg2 ^ 0x54a9);
		    if ((i_17_ ^ 0xffffffff)
			>= (Class125.anInt1629 ^ 0xffffffff))
			Class131_Sub3.method1650(i_18_,
						 (Class56.anIntArrayArray740
						  [i_17_]),
						 arg0, i_19_, 86);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ds.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    static {
	aBooleanArrayArray625
	    = (new boolean[][]
	       { new boolean[4], { false, true, true, false },
		 { true, false, true, false }, { true, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { true, false, true, false }, { true, false, false, true },
		 { true, false, false, true }, { true, true, false, false },
		 new boolean[4], { false, true, false, true },
		 new boolean[4] });
	anIntArray620 = new int[1000];
    }
}
