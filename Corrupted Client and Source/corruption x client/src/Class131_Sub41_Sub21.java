/* Class131_Sub41_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class131_Sub41_Sub21 extends Class131_Sub41
{
    public static String aString6438 = "yellow:";
    public boolean aBoolean6439;
    public volatile boolean aBoolean6440 = true;
    public static String aString6441 = "wave:";
    public static int anInt6442 = 0;
    public boolean aBoolean6443;
    public static int anInt6444;
    public static int anInt6445;
    public static int anInt6446;
    public static int anInt6447;
    public static int anInt6448 = 0;
    
    public static boolean method2072(boolean arg0, boolean arg1) {
	try {
	    return arg0 | arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wr.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public abstract byte[] method2073(int i);
    
    public static void method2074(int arg0) {
	try {
	    aString6438 = null;
	    if (arg0 != 0)
		anInt6442 = -51;
	    aString6441 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wr.I(" + arg0 + ')');
	}
    }
    
    public abstract int method2075(int i);
    
    public static void method2076(Class131 arg0, Class131 arg1, int arg2) {
	try {
	    anInt6444++;
	    if (arg1.aClass131_1786 != null)
		arg1.method1355((byte) 127);
	    arg1.aClass131_1783 = arg0;
	    if (arg2 != 2564)
		anInt6442 = 122;
	    arg1.aClass131_1786 = arg0.aClass131_1786;
	    arg1.aClass131_1786.aClass131_1783 = arg1;
	    arg1.aClass131_1783.aClass131_1786 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wr.J("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static String[] method2077(byte arg0, String arg1, char arg2) {
	try {
	    anInt6445++;
	    int i = Class121_Sub2.method1047(true, arg2, arg1);
	    if (arg0 <= 95)
		method2077((byte) -103, null, '\uff8a');
	    String[] strings = new String[i - -1];
	    int i_0_ = 0;
	    int i_1_ = 0;
	    for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_;
		for (i_3_ = i_1_;
		     (arg2 ^ 0xffffffff) != (arg1.charAt(i_3_) ^ 0xffffffff);
		     i_3_++) {
		    /* empty */
		}
		strings[i_0_++] = arg1.substring(i_1_, i_3_);
		i_1_ = 1 + i_3_;
	    }
	    strings[i] = arg1.substring(i_1_);
	    return strings;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wr.K(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
}
