/* Class131_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub4 extends Class131
{
    public static int anInt4128 = -11713997;
    public static int anInt4129 = 52;
    public static Class74 aClass74_4130;
    public static int anInt4131 = -1;
    public String aString4132;
    public static Class119 aClass119_4133 = new Class119();
    public static boolean aBoolean4134;
    public static int anInt4135 = 2;
    
    public static void method1651(int arg0) {
	try {
	    int i = 44 % ((arg0 - -20) / 53);
	    aClass74_4130 = null;
	    aClass119_4133 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bl.B(" + arg0 + ')');
	}
    }
    
    public static boolean method1652(int arg0, int arg1, int arg2) {
	int i = Class163.anIntArrayArrayArray2186[arg0][arg1][arg2];
	if (i == -Class131_Sub41_Sub20.anInt6431)
	    return false;
	if (i == Class131_Sub41_Sub20.anInt6431)
	    return true;
	int i_0_ = arg1 << 7;
	int i_1_ = arg2 << 7;
	if (Class131_Sub2_Sub27.method1605(i_0_ + 1,
					   Class75.aClass68Array1023[arg0]
					       .method712(arg1, arg2),
					   i_1_ + 1)
	    && Class131_Sub2_Sub27.method1605(i_0_ + 128 - 1,
					      Class75.aClass68Array1023
						  [arg0]
						  .method712(arg1 + 1, arg2),
					      i_1_ + 1)
	    && (Class131_Sub2_Sub27.method1605
		(i_0_ + 128 - 1,
		 Class75.aClass68Array1023[arg0].method712(arg1 + 1, arg2 + 1),
		 i_1_ + 128 - 1))
	    && Class131_Sub2_Sub27.method1605(i_0_ + 1,
					      Class75.aClass68Array1023
						  [arg0]
						  .method712(arg1, arg2 + 1),
					      i_1_ + 128 - 1)) {
	    Class163.anIntArrayArrayArray2186[arg0][arg1][arg2]
		= Class131_Sub41_Sub20.anInt6431;
	    return true;
	}
	Class163.anIntArrayArrayArray2186[arg0][arg1][arg2]
	    = -Class131_Sub41_Sub20.anInt6431;
	return false;
    }
    
    public Class131_Sub4() {
	/* empty */
    }
    
    public Class131_Sub4(String arg0, int arg1) {
	try {
	    aString4132 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bl.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	aBoolean4134 = false;
    }
}
