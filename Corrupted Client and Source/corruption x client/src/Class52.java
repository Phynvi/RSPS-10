/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52
{
    public int anInt685;
    public static String aString686;
    public static int anInt687;
    public int anInt688;
    public static int anInt689 = 0;
    public int anInt690;
    public static int anInt691;
    public int anInt692;
    public static int anInt693;
    public static int anInt694;
    public static int anInt695;
    public byte aByte696;
    public int anInt697;
    public static int anInt698;
    
    public static void method598(byte arg0) {
	try {
	    aString686 = null;
	    int i = -42 / ((arg0 - -84) / 42);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fa.B(" + arg0 + ')');
	}
    }
    
    public int method599(boolean arg0) {
	try {
	    anInt698++;
	    if (arg0 != true)
		return -35;
	    return aByte696 & 0x7;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fa.A(" + arg0 + ')');
	}
    }
    
    public int method600(byte arg0) {
	try {
	    anInt687++;
	    if (arg0 > -108)
		return 49;
	    if ((aByte696 & 0x8 ^ 0xffffffff) != -9)
		return 0;
	    return 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fa.D(" + arg0 + ')');
	}
    }
    
    public static void method601(boolean arg0, byte arg1) {
	try {
	    if (arg0) {
		if (Class187.anInt2674 != -1)
		    RuntimeException_Sub1.method2832(Class187.anInt2674, 0);
		for (Class131_Sub33 class131_sub33
			 = ((Class131_Sub33)
			    Class83.aClass180_1096.method2520(0));
		     class131_sub33 != null;
		     class131_sub33 = ((Class131_Sub33)
				       Class83.aClass180_1096.method2518(0))) {
		    if (!class131_sub33.method1352(true)) {
			class131_sub33
			    = ((Class131_Sub33)
			       Class83.aClass180_1096.method2520(0));
			if (class131_sub33 == null)
			    break;
		    }
		    Class204.method2730(true, 25697, class131_sub33, false);
		}
		Class187.anInt2674 = -1;
		Class83.aClass180_1096 = new Class180(8);
		Class131_Sub41_Sub10.method1994(0);
		Class187.anInt2674 = Class111.anInt3280;
		Class120_Sub2.method1036(-70, false);
		Class131_Sub2_Sub16.method1548((byte) -125);
		Class168.method2433(Class187.anInt2674);
	    }
	    anInt691++;
	    Class171.method2449(1);
	    Class23_Sub5_Sub2.anInt5048 = -1;
	    Class37.method492(Class53.anInt708, 1);
	    Class166.aClass23_Sub4_Sub1_Sub2_2216
		= new Class23_Sub4_Sub1_Sub2();
	    Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0] = 52;
	    Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733 = 6656;
	    Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747 = 6656;
	    Class2.anInt84 = Class57.anInt753 = 0;
	    Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331[0] = 52;
	    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -3) {
		Class2.anInt84 = Class154.anInt2046 << 677723815;
		Class57.anInt753 = Class1_Sub3.anInt3536 << -2105738713;
	    } else
		Class69.method737((byte) 102);
	    Class121_Sub1.method1043(-125);
	    if (Class2.anInt84 != 0 && Class57.anInt753 != 0) {
		Class115.method984(false);
		Class175.method2484(28, (byte) -121);
	    } else
		Class175.method2484(10, (byte) -123);
	    int i = -46 % ((91 - arg1) / 32);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fa.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class52() {
	/* empty */
    }
    
    public Class52(Stream arg0) {
	try {
	    aByte696 = arg0.readSignedByte((byte) 127);
	    anInt688 = arg0.readUnsignedShort(8104);
	    anInt685 = arg0.readUnsignedInt(-2);
	    anInt692 = arg0.readUnsignedInt(-2);
	    anInt697 = arg0.readUnsignedInt(-2);
	    anInt690 = arg0.readUnsignedInt(-2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fa.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aString686 = " from your friend list first.";
    }
}
