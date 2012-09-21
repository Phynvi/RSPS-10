/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public abstract class Class128
{
    public static int anInt1738;
    public static int anInt1739;
    public static int anInt1740;
    public static int anInt1741;
    public static Class39[] aClass39Array1742;
    public static int anInt1743;
    public int anInt1744;
    public static Class158 aClass158_1745;
    public static Class158 aClass158_1746;
    public static int anInt1747;
    public static short[] aShortArray1748 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
    public int anInt1749;
    public static int anInt1750;
    public int anInt1751;
    public static int anInt1752;
    
    public static void method1137(byte arg0) {
	try {
	    aClass158_1745 = null;
	    aShortArray1748 = null;
	    aClass158_1746 = null;
	    if (arg0 < -96)
		aClass39Array1742 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ni.E(" + arg0 + ')');
	}
    }
    
    public boolean method1138(byte arg0) {
	try {
	    anInt1750++;
	    if (arg0 > -46)
		method1137((byte) -63);
	    if ((anInt1749 & 0x8) == 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ni.F(" + arg0 + ')');
	}
    }
    
    public boolean method1139(int arg0) {
	try {
	    anInt1747++;
	    if (arg0 <= 4)
		aClass158_1745 = null;
	    if ((anInt1749 & 0x1) == 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ni.D(" + arg0 + ')');
	}
    }
    
    public static void method1140(boolean arg0) {
	if (arg0) {
	    Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
		= Class82.aClass147ArrayArrayArray1092;
	    Class75.aClass68Array1023 = Class85.aClass68Array1116;
	} else {
	    Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
		= PacketStream.aClass147ArrayArrayArray6124;
	    Class75.aClass68Array1023 = Class131_Sub2_Sub37.aClass68Array6057;
	}
	Class133.anInt1805
	    = Class131_Sub2_Sub29.aClass147ArrayArrayArray5972.length;
    }
    
    public static Frame method1141(int arg0, int arg1, int arg2, SignLink arg3,
				   int arg4, int arg5) {
	try {
	    if (arg0 != 7439)
		return null;
	    anInt1741++;
	    if (!arg3.method2709(1774773648))
		return null;
	    if (arg5 == 0) {
		Class39[] class39s = Class131_Sub29.method1852(arg3, -31353);
		if (class39s == null)
		    return null;
		boolean bool = false;
		for (int i = 0;
		     (i ^ 0xffffffff) > (class39s.length ^ 0xffffffff); i++) {
		    if ((class39s[i].anInt510 ^ 0xffffffff) == (arg1
								^ 0xffffffff)
			&& arg2 == class39s[i].anInt513
			&& (arg4 == 0 || class39s[i].anInt511 == arg4)
			&& (!bool || ((class39s[i].anInt515 ^ 0xffffffff)
				      < (arg5 ^ 0xffffffff)))) {
			arg5 = class39s[i].anInt515;
			bool = true;
		    }
		}
		if (!bool)
		    return null;
	    }
	    Class139 class139
		= arg3.method2687(arg1, arg4, (byte) -37, arg5, arg2);
	    while ((class139.anInt1864 ^ 0xffffffff) == -1)
		Class187.method2575(arg0 ^ ~0x1d4a, 10L);
	    Frame frame = (Frame) class139.anObject1866;
	    if (frame == null)
		return null;
	    if ((class139.anInt1864 ^ 0xffffffff) == -3) {
		Class131_Sub2_Sub5.method1491(arg3, frame, true);
		return null;
	    }
	    return frame;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ni.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method1142(int arg0) {
	Class93.aClass131_Sub15_Sub2_1226.createPacket(5);
	anInt1738++;
	Class67.anInt911++;
	Class93.aClass131_Sub15_Sub2_1226.writeShort(Class131_Sub11.anInt4233);
	if (arg0 != -11983)
	    method1137((byte) -121);
    }
    
    public boolean method1143(int arg0) {
	try {
	    if (arg0 < 10)
		method1137((byte) -97);
	    anInt1739++;
	    if ((anInt1749 & 0x2 ^ 0xffffffff) == -1)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ni.H(" + arg0 + ')');
	}
    }
    
    public boolean method1144(int arg0) {
	try {
	    anInt1752++;
	    int i = -125 % ((-37 - arg0) / 34);
	    if ((anInt1749 & 0x4) == 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ni.G(" + arg0 + ')');
	}
    }
}
