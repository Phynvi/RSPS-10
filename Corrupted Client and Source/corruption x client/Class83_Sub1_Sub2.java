/* Class83_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83_Sub1_Sub2 extends Class83_Sub1
{
    public int anInt5415;
    public Class36_Sub3 aClass36_Sub3_5416;
    public int anInt5417;
    public int anInt5418;
    public int anInt5419;
    public int anInt5420;
    public Class130_Sub2 aClass130_Sub2_5421;
    public static int[] anIntArray5422 = new int[6];
    public static int[][] anIntArrayArray5423 = new int[6][];
    public int anInt5424;
    
    public Class36_Sub3 method802(int arg0) {
	Class36_Sub3 class36_sub3;
	try {
	    if (aClass36_Sub3_5416 == null) {
		Interface4 interface4 = aClass130_Sub2_5421.anInterface4_3303;
		anIntArray5422[0] = anInt5424;
		anIntArray5422[3] = anInt5420;
		anIntArray5422[5] = anInt5419;
		anIntArray5422[1] = anInt5415;
		anIntArray5422[4] = anInt5417;
		anIntArray5422[2] = anInt5418;
		int i = 0;
		int i_0_ = 0;
		for (int i_1_ = 0; 6 > i_1_; i_1_++) {
		    if (!interface4.method11(false, anIntArray5422[i_1_]))
			return null;
		    Class42 class42
			= interface4.method10(-19907, anIntArray5422[i_1_]);
		    int i_2_ = !class42.aBoolean564 ? 128 : 64;
		    if ((i_0_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
			i_0_ = i_2_;
		    if (class42.aByte561 > 0)
			i = 1;
		}
		for (int i_3_ = 0; -7 < (i_3_ ^ 0xffffffff); i_3_++)
		    anIntArrayArray5423[i_3_]
			= interface4.method14(1.0F, i_0_, anIntArray5422[i_3_],
					      i_0_, false, false);
		aClass36_Sub3_5416
		    = new Class36_Sub3(aClass130_Sub2_5421, 6407, i_0_,
				       -1 != (i ^ 0xffffffff),
				       anIntArrayArray5423);
	    }
	    if (arg0 != -1457)
		method802(-22);
	    class36_sub3 = aClass36_Sub3_5416;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class36_sub3;
    }
    
    public Class83_Sub1_Sub2(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			     int arg4, int arg5, int arg6) {
	anInt5418 = arg3;
	anInt5415 = arg2;
	anInt5417 = arg5;
	aClass130_Sub2_5421 = arg0;
	anInt5424 = arg1;
	anInt5419 = arg6;
	anInt5420 = arg4;
    }
}
