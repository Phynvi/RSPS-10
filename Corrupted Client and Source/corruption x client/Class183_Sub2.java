/* Class183_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class183_Sub2 extends Class183
{
    public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_4966;
    
    public static Class183_Sub2 method2548(int arg0, Class130_Sub2 arg1,
					   int[] arg2, int[] arg3, int arg4,
					   int arg5) {
	Class183_Sub2 class183_sub2;
	try {
	    if (arg0 != 6406)
		return null;
	    byte[] is = new byte[arg4 * arg5];
	    for (int i = 0; i < arg4; i++) {
		int i_0_ = arg5 * i - -arg2[i];
		for (int i_1_ = 0;
		     (arg3[i] ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
		    is[i_0_++] = (byte) -1;
	    }
	    class183_sub2 = new Class183_Sub2(arg1, arg5, arg4, is);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class183_sub2;
    }
    
    public Class183_Sub2(Class130_Sub2 arg0, int arg1, int arg2, byte[] arg3) {
	aClass36_Sub1_Sub1_4966
	    = Class36_Sub1_Sub1.method487(arg0, arg1, arg3, 6406, false, 6406,
					  arg2, 20);
	aClass36_Sub1_Sub1_4966.method485(false, false);
    }
}
