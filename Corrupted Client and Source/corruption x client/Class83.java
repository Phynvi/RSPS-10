/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class83
{
    public static int anInt1093 = 0;
    public static boolean aBoolean1094;
    public static int anInt1095;
    public static Class180 aClass180_1096 = new Class180(8);
    public static int[] anIntArray1097;
    public static int anInt1098;
    
    public static void method799(byte arg0, Stream arg1) {
	try {
	    int i = 0;
	    if (arg0 != -67)
		anInt1093 = -112;
	    for (/**/; Class131_Sub2_Sub19.anInt5826 > i; i++) {
		int i_0_ = arg1.readSmart(-1647926640);
		int i_1_ = arg1.readUnsignedShort(8104);
		if ((i_1_ ^ 0xffffffff) == -65536)
		    i_1_ = -1;
		if (Class193.aClass128_Sub1Array2835[i_0_] != null)
		    Class193.aClass128_Sub1Array2835[i_0_].anInt1744 = i_1_;
	    }
	    anInt1095++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("j.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method800(int arg0) {
	try {
	    if (arg0 == -16033) {
		aClass180_1096 = null;
		anIntArray1097 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"j.D(" + arg0 + ')');
	}
    }
    
    public static void method801(int arg0, int arg1) {
	try {
	    Class131_Sub1_Sub4.aClass214_5541.method2786(arg1 + arg1, arg0);
	    anInt1098++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("j.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
