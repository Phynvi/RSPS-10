/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class192
{
    public static short[] aShortArray2819 = new short[256];
    public static int anInt2820;
    public static Interface3 anInterface3_2821 = null;
    public static int anInt2822;
    public static volatile int anInt2823 = 0;
    public static Class214 aClass214_2824 = new Class214(50);
    public static String aString2825 = "Connecting to update server";
    
    public static void method2621(int arg0) {
	try {
	    aString2825 = null;
	    aShortArray2819 = null;
	    anInterface3_2821 = null;
	    aClass214_2824 = null;
	    int i = -125 % ((20 - arg0) / 57);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tg.B(" + arg0 + ')');
	}
    }
    
    public static String method2622(byte arg0, String arg1) {
	try {
	    anInt2820++;
	    if (arg1 == null)
		return null;
	    int i = 0;
	    int i_0_;
	    for (i_0_ = arg1.length(); i < i_0_; i++) {
		if (!Class131_Sub2_Sub28.method1610(arg1.charAt(i), (byte) 54))
		    break;
	    }
	    for (/**/;
		 (i_0_ > i
		  && Class131_Sub2_Sub28.method1610(arg1.charAt(i_0_ + -1),
						    (byte) 77));
		 i_0_--) {
		/* empty */
	    }
	    if (arg0 < 29)
		anInt2823 = 82;
	    int i_1_ = -i + i_0_;
	    if ((i_1_ ^ 0xffffffff) > -2 || (i_1_ ^ 0xffffffff) < -13)
		return null;
	    StringBuffer stringbuffer = new StringBuffer(i_1_);
	    for (int i_2_ = i; (i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
		 i_2_++) {
		char c = arg1.charAt(i_2_);
		if (Class119.method1013(c, 0)) {
		    char c_3_ = Class23_Sub5_Sub2.method403(c, 376);
		    if (c_3_ != 0)
			stringbuffer.append(c_3_);
		}
	    }
	    if ((stringbuffer.length() ^ 0xffffffff) == -1)
		return null;
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tg.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2623(int arg0) {
	try {
	    int i = 44 % ((arg0 - -68) / 32);
	    anInt2822++;
	    Class196.method2667();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tg.A(" + arg0 + ')');
	}
    }
}
