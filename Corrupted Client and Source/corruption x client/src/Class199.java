/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class199
{
    public static int anInt2909;
    public static int anInt2910;
    public static String aString2911 = "Starting 3d Library";
    public static int anInt2912;
    
    public static void method2711(int arg0, boolean arg1) {
	try {
	    if (!arg1 || Class127.aClass131_Sub41_Sub1_1703 == null)
		Class150.anInt2005 = -1;
	    else
		Class150.anInt2005
		    = Class127.aClass131_Sub41_Sub1_1703.anInt6161;
	    anInt2910++;
	    Class127.aClass131_Sub41_Sub1_1703 = null;
	    Class121_Sub3.aClass173_4000 = null;
	    Class74.aClass119_1011 = null;
	    Class131_Sub2_Sub36.anInt6049 = 0;
	    Class127.method1124();
	    Class127.aClass119_1715.method1012(0);
	    Class127.aClass177_1706 = null;
	    Class63.aClass140_806 = null;
	    InputStream_Sub1.aClass152_51 = null;
	    Class67.aClass140_912 = null;
	    Class146.anInt1940 = -1;
	    Class130.aClass140_1778 = null;
	    Class131_Sub2_Sub39.aClass140_6083 = null;
	    Class131_Sub25.aClass140_4478 = null;
	    Class125.aClass140_1630 = null;
	    Class189.anInt2768 = -1;
	    Class131_Sub2_Sub15.aClass140_5776 = null;
	    Class74.aClass140_1004 = null;
	    Class143.method2147(arg0);
	    Class131_Sub7.method1666(128, 64, -101);
	    Class145.method2165(64, 64, (byte) 0);
	    Class58.method637(-4028, 64);
	    Class135.method2103(arg0 ^ 0xffffffff, 64);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uf.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2712(int arg0) {
	aString2911 = null;
	if (arg0 != 64)
	    anInt2912 = 66;
    }
    
    static {
	anInt2909 = -1;
	anInt2912 = 0;
    }
}
