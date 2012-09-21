/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212
{
    public static int anInt3110;
    public static Class152[] aClass152Array3111;
    public static int anInt3112 = 255;
    public static int anInt3113 = 0;
    public static int anInt3114;
    public static byte[][] aByteArrayArray3115;
    public static int anInt3116;
    public static int anInt3117;
    
    public static int method2766(int arg0, int arg1, byte arg2) {
	try {
	    anInt3117++;
	    if (arg2 != 58)
		return -79;
	    int i = arg1 >>> -1589580680;
	    int i_0_ = 255 - i;
	    arg1 = (0xff0000 & (0xff00 & arg1) * i
		    | (arg1 & 0xff00ff) * i & ~0xff00ff) >>> -2032135704;
	    return (((i_0_ * (0xff00 & arg0) & 0xff0000
		      | ~0xff00ff & (arg0 & 0xff00ff) * i_0_)
		     >>> -278926680)
		    + arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wa.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2767(int arg0) {
	try {
	    if (arg0 != -26610)
		aClass152Array3111 = null;
	    aByteArrayArray3115 = null;
	    aClass152Array3111 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wa.C(" + arg0 + ')');
	}
    }
    
    public static void method2768(int arg0, int arg1, int arg2) {
	try {
	    anInt3116++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(arg2, arg0, (byte) 1);
	    class131_sub41_sub6.method1962(arg2 + -5);
	    class131_sub41_sub6.anInt6244 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wa.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
}
