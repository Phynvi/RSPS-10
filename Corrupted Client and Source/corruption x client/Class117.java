/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117
{
    public Interface4 anInterface4_1542;
    public Class214 aClass214_1543 = new Class214(256);
    public Class130_Sub2 aClass130_Sub2_1544;
    
    public Class36_Sub1 method998(boolean arg0, int arg1) {
	Class36_Sub1 class36_sub1;
	try {
	    Object object = aClass214_1543.method2780(127, (long) arg1);
	    if (null != object)
		return (Class36_Sub1) object;
	    if (!anInterface4_1542.method11(arg0, arg1))
		return null;
	    Class42 class42 = anInterface4_1542.method10(-19907, arg1);
	    int i = !class42.aBoolean564 ? 128 : 64;
	    Class36_Sub1 class36_sub1_0_;
	    if (class42.aBoolean575 && aClass130_Sub2_1544.method1175()) {
		float[] fs = anInterface4_1542.method13(i, (byte) -88, false,
							0.7F, arg1, i);
		class36_sub1_0_
		    = new Class36_Sub1(aClass130_Sub2_1544, 3553, 34842, i, i,
				       -1 != (class42.aByte561 ^ 0xffffffff),
				       fs, 6408);
	    } else {
		int[] is = anInterface4_1542.method12(i, arg1, false, -11047,
						      0.7F, i);
		int i_1_ = 6408;
		class36_sub1_0_
		    = new Class36_Sub1(aClass130_Sub2_1544, 3553, i_1_, i, i,
				       -1 != (class42.aByte561 ^ 0xffffffff),
				       is, false);
	    }
	    class36_sub1_0_.method485(class42.aBoolean560,
				      class42.aBoolean568);
	    aClass214_1543.method2773(true, class36_sub1_0_, (long) arg1);
	    class36_sub1 = class36_sub1_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class36_sub1;
    }
    
    public void method999(int arg0) {
	if (arg0 != 3553)
	    aClass214_1543 = null;
	aClass214_1543.method2783(-102);
    }
    
    public Class117(Class130_Sub2 arg0, Interface4 arg1) {
	aClass130_Sub2_1544 = arg0;
	anInterface4_1542 = arg1;
    }
}
