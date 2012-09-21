/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class76
{
    public static int anInt1032;
    public static int anInt1033;
    public static int anInt1034;
    public static int anInt1035;
    public static String[] aStringArray1036;
    public static boolean[] aBooleanArray1037
	= { true, true, true, true, true, true, true, true, true, true, true,
	    true, true, true, true, true, true, true, true, true, true, true,
	    true, true, false };
    public static int anInt1038;
    public static int anInt1039;
    
    public static void method767(int arg0) {
	try {
	    if (arg0 != -31742)
		aStringArray1036 = null;
	    aStringArray1036 = null;
	    aBooleanArray1037 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hq.D(" + arg0 + ')');
	}
    }
    
    public static void method768(int arg0) {
	try {
	    if (arg0 != 0)
		aStringArray1036 = null;
	    Class131_Sub2_Sub15.aClass214_5775.method2783(-85);
	    anInt1032++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hq.E(" + arg0 + ')');
	}
    }
    
    public static int method769(byte arg0, int arg1) {
	try {
	    anInt1033++;
	    if (arg0 != 122)
		aBooleanArray1037 = null;
	    return arg1 & 0x7f;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hq.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method770(Stream arg0, int arg1) {
	try {
	    anInt1035++;
	    int i = arg0.readSmart(arg1 + -1647926640);
	    Class28.aClass84Array282 = new Class84[i];
	    for (int i_0_ = arg1; i_0_ < i; i_0_++) {
		Class28.aClass84Array282[i_0_] = new Class84();
		Class28.aClass84Array282[i_0_].anInt1102
		    = arg0.readSmart(-1647926640);
		Class28.aClass84Array282[i_0_].aString1100
		    = arg0.method1721(5);
	    }
	    Class127_Sub1.anInt4008 = arg0.readSmart(-1647926640);
	    Class212.anInt3110 = arg0.readSmart(-1647926640);
	    Class131_Sub2_Sub19.anInt5826 = arg0.readSmart(-1647926640);
	    Class193.aClass128_Sub1Array2835
		= new Class128_Sub1[1 + (Class212.anInt3110
					 + -Class127_Sub1.anInt4008)];
	    for (int i_1_ = 0; Class131_Sub2_Sub19.anInt5826 > i_1_; i_1_++) {
		int i_2_ = arg0.readSmart(arg1 ^ ~0x62395d6f);
		Class128_Sub1 class128_sub1
		    = (Class193.aClass128_Sub1Array2835[i_2_]
		       = new Class128_Sub1());
		class128_sub1.anInt1751 = arg0.readUnsignedByte(-118);
		class128_sub1.anInt1749 = arg0.readUnsignedInt(-2);
		class128_sub1.anInt4022 = Class127_Sub1.anInt4008 + i_2_;
		class128_sub1.aString4020 = arg0.method1721(arg1 + 5);
		class128_sub1.aString4017 = arg0.method1721(5);
	    }
	    Class131_Sub17.anInt4371 = arg0.readUnsignedInt(-2);
	    Class23_Sub1.aBoolean3701 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hq.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public abstract Class131_Sub41_Sub11 method771
	(Class131_Sub41_Sub11 class131_sub41_sub11, byte i);
    
    public static void method772(boolean arg0, boolean arg1, int arg2,
				 int arg3, byte arg4) {
	try {
	    if (arg4 != 7)
		method772(true, false, -76, 52, (byte) 127);
	    anInt1034++;
	    Class179.method2495(-1 + (Class110_Sub4
				      .aClass128_Sub1Array3939).length,
				arg0, arg1, 0, false, arg3, arg2);
	    Class184.aClass131_Sub30_2626 = null;
	    Class131_Sub29.anInt4511 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hq.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
}
