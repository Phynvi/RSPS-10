/* Class131_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41 extends Class131
{
    public static int anInt4664;
    public static int anInt4665;
    public static Class158 aClass158_4666;
    public static int anInt4667;
    public Class131_Sub41 aClass131_Sub41_4668;
    public static int anInt4669;
    public static int anInt4670;
    public long aLong4671;
    public static int anInt4672 = 0;
    public static int anInt4673;
    public static int anInt4674;
    public static int anInt4675;
    public static int anInt4676;
    public Class131_Sub41 aClass131_Sub41_4677;
    
    public static void method1915(byte arg0) {
	try {
	    Class147.anInt1946 = 0;
	    anInt4674++;
	    Class66.aClass119_843.method1012(0);
	    Class66.aClass119_843.method1018((byte) -126,
					     Class9.aClass131_Sub21_109);
	    if (arg0 <= 29)
		anInt4672 = -18;
	    Class147.anInt1946++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"w.O(" + arg0 + ')');
	}
    }
    
    public static void method1916(boolean arg0) {
	aClass158_4666 = null;
	if (arg0 != true)
	    anInt4664 = 68;
    }
    
    public static Class131_Sub2 method1917(int arg0, Stream arg1) {
	try {
	    anInt4670++;
	    arg1.readUnsignedByte(-36);
	    int i = arg1.readUnsignedByte(-49);
	    Class131_Sub2 class131_sub2
		= Class131_Sub9.method1687((byte) 123, i);
	    class131_sub2.anInt4090 = arg1.readUnsignedByte(arg0 + 85);
	    int i_0_ = arg1.readUnsignedByte(106);
	    for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
		 i_1_++) {
		int i_2_ = arg1.readUnsignedByte(arg0 + 82);
		class131_sub2.method1455(i_2_, (byte) -49, arg1);
	    }
	    class131_sub2.method1471(arg0 ^ arg0);
	    return class131_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("w.Q(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method1918(int arg0) {
	try {
	    if (arg0 != -29860)
		method1915((byte) -95);
	    anInt4665++;
	    if (aClass131_Sub41_4677 == null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"w.N(" + arg0 + ')');
	}
    }
    
    public void method1919(int arg0) {
	try {
	    anInt4667++;
	    if (arg0 != -29183)
		anInt4675 = 0;
	    if (aClass131_Sub41_4677 != null) {
		aClass131_Sub41_4677.aClass131_Sub41_4668
		    = aClass131_Sub41_4668;
		aClass131_Sub41_4668.aClass131_Sub41_4677
		    = aClass131_Sub41_4677;
		aClass131_Sub41_4677 = null;
		aClass131_Sub41_4668 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"w.R(" + arg0 + ')');
	}
    }
    
    static {
	anInt4664 = 0;
    }
}
