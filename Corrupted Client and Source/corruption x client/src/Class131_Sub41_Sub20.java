/* Class131_Sub41_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub20 extends Class131_Sub41
{
    public static int anInt6423;
    public static int anInt6424;
    public static Class152[] aClass152Array6425;
    public static int anInt6426;
    public static int anInt6427;
    public static int anInt6428;
    public static float aFloat6429;
    public static int anInt6430;
    public static int anInt6431;
    public Class180 aClass180_6432;
    public static boolean aBoolean6433 = false;
    public static int anInt6434;
    public static int anInt6435;
    public static int anInt6436;
    public static int anInt6437;
    
    public static boolean method2064(int arg0) {
	try {
	    anInt6426++;
	    Class131_Sub21 class131_sub21
		= ((Class131_Sub21)
		   Class66.aClass119_843.aClass131_1553.aClass131_1786);
	    if (class131_sub21 == null
		|| Class66.aClass119_843.aClass131_1553 == class131_sub21)
		return false;
	    if (class131_sub21.anInt4442 >= 2000)
		class131_sub21.anInt4442 -= 2000;
	    if (arg0 < 97)
		return true;
	    if (class131_sub21.anInt4442 == 1006)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wp.A(" + arg0 + ')');
	}
    }
    
    public static void method2065(boolean arg0) {
	try {
	    anInt6435++;
	    if (!Class131_Sub22.aBoolean4446) {
		Class131_Sub22.aBoolean4446 = true;
		if (!Class131_Sub6.aBoolean4143)
		    Cryption.aFloat1825
			+= (12.0F - Cryption.aFloat1825) / 2.0F;
		else
		    Class23_Sub1_Sub1.aFloat5082
			= (float) ((int) Class23_Sub1_Sub1.aFloat5082 + 47
				   & ~0xf);
		Class209.aBoolean3053 = arg0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wp.D(" + arg0 + ')');
	}
    }
    
    public void method2066(Stream arg0, byte arg1) {
	try {
	    if (arg1 > -95)
		anInt6430 = -79;
	    for (;;) {
		int i = arg0.readUnsignedByte(-54);
		if (i == 0)
		    break;
		method2067((byte) -103, arg0, i);
	    }
	    anInt6427++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wp.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method2067(byte arg0, Stream arg1, int arg2) {
	anInt6428++;
	if (arg2 == 249) {
	    int i = arg1.readUnsignedByte(-126);
	    if (aClass180_6432 == null) {
		int i_0_ = Class101.method887(1388313616, i);
		aClass180_6432 = new Class180(i_0_);
	    }
	    for (int i_1_ = 0; i > i_1_; i_1_++) {
		boolean bool = (arg1.readUnsignedByte(87) ^ 0xffffffff) == -2;
		int i_2_ = arg1.read3Bytes(false);
		Class131 class131;
		if (bool)
		    class131 = new Class131_Sub29(arg1.readString(false));
		else
		    class131 = new Class131_Sub24(arg1.readUnsignedInt(-2));
		aClass180_6432.method2523(false, (long) i_2_, class131);
	    }
	}
	if (arg0 >= -66)
	    method2071(61, -115, null);
    }
    
    public static void method2068(byte arg0) {
	try {
	    Class175.method2484(25, (byte) 78);
	    anInt6437++;
	    if (arg0 == -21) {
		Class112.method958(false);
		System.gc();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wp.F(" + arg0 + ')');
	}
    }
    
    public int method2069(int arg0, byte arg1, int arg2) {
	try {
	    int i = -88 % ((arg1 - -47) / 36);
	    anInt6423++;
	    if (aClass180_6432 == null)
		return arg0;
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_6432.method2521(57, (long) arg2);
	    if (class131_sub24 == null)
		return arg0;
	    return class131_sub24.anInt4465;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wp.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2070(byte arg0) {
	aClass152Array6425 = null;
	if (arg0 >= -123)
	    aClass152Array6425 = null;
    }
    
    public String method2071(int arg0, int arg1, String arg2) {
	try {
	    anInt6434++;
	    if (aClass180_6432 == null)
		return arg2;
	    if (arg1 != 0)
		method2071(52, 89, null);
	    Class131_Sub29 class131_sub29
		= (Class131_Sub29) aClass180_6432.method2521(63, (long) arg0);
	    if (class131_sub29 == null)
		return arg2;
	    return class131_sub29.aString4502;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wp.H(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	anInt6424 = 0;
    }
}
