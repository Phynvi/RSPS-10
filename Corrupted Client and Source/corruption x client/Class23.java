/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23
{
    public static int anInt248;
    public static int[] anIntArray249;
    public static int anInt250;
    public static byte[][] aByteArrayArray251 = new byte[50][];
    public static int anInt252;
    public static int anInt253;
    public static byte[][] aByteArrayArray254;
    public static int[] anIntArray255 = { 1, -1, -1, 1 };
    public static String aString256 = "yellow:";
    public static int anInt257;
    public static boolean aBoolean258;
    
    public abstract boolean method287(int i, Class130 class130, int i_0_,
				      int i_1_);
    
    public abstract Class1_Sub2 method288(Class130 class130, boolean bool);
    
    public abstract boolean method289(byte i);
    
    public static void method290(byte arg0, Class158 arg1) {
	do {
	    try {
		Class112.aClass158_1437 = arg1;
		anInt248++;
		if (arg0 > 54)
		    break;
		anInt250 = -73;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("cb.A(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static int method291(int arg0) {
	try {
	    anInt253++;
	    if (arg0 != -1)
		return 10;
	    return Class131_Sub42.anInt4692;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cb.F(" + arg0 + ')');
	}
    }
    
    public static void method292(int arg0) {
	try {
	    for (int i = 0; i < Class202.anInt2943; i++) {
		int i_2_ = Class128_Sub1.anIntArray4019[i];
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_2_];
		int i_3_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedByte(117);
		if ((i_3_ & 0x1) != 0)
		    i_3_ += Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-63) << -1492307448;
		Class42.method517((byte) 77, i_3_, class23_sub4_sub1_sub2,
				  i_2_);
	    }
	    if (arg0 != -1)
		anIntArray249 = null;
	    anInt252++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cb.I(" + arg0 + ')');
	}
    }
    
    public abstract void method293(byte i, Class130 class130, int i_4_,
				   int i_5_, boolean bool, Class23 class23_6_,
				   int i_7_);
    
    public abstract void method294(Class130 class130, int i);
    
    public abstract void method295(int i);
    
    public static void method296(int arg0) {
	try {
	    aByteArrayArray251 = null;
	    if (arg0 != -22215)
		anIntArray255 = null;
	    anIntArray249 = null;
	    aByteArrayArray254 = null;
	    aString256 = null;
	    anIntArray255 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cb.G(" + arg0 + ')');
	}
    }
    
    static {
	anIntArray249 = new int[5];
	aBoolean258 = false;
    }
}
