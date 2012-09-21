/* Class23_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub3 extends Class23
{
    public static int[] anIntArray3719;
    public static int anInt3720;
    public static int anInt3721;
    public static int anInt3722;
    public static Class16[] aClass16Array3723;
    public static int anInt3724;
    public static boolean aBoolean3725 = false;
    public static int anInt3726;
    public int anInt3727;
    public int anInt3728;
    public int anInt3729;
    public static int anInt3730;
    public boolean aBoolean3731;
    public static int anInt3732;
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    if (arg0 < -116) {
		anInt3732++;
		throw new IllegalStateException();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hl.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    anInt3730++;
	    if (arg0 != -115)
		method318((byte) -15);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hl.D(" + arg0 + ')');
	}
    }
    
    public static void method317(byte arg0) {
	try {
	    if (arg0 > -29)
		method318((byte) -77);
	    anIntArray3719 = null;
	    aClass16Array3723 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hl.L(" + arg0 + ')');
	}
    }
    
    public static void method318(byte arg0) {
	Class214.aClass130_3128.method1161(1.1523438F
					   * ((float) Class134.anInt1809 * 0.1F
					      + 0.7F));
	anInt3722++;
	Class214.aClass130_3128.method1232(Class131_Sub41_Sub8.anInt6268,
					   0.69921875F, 1.2F, -50.0F, -60.0F,
					   -50.0F);
	Class214.aClass130_3128.method1212(Class131_Sub25.anInt4479, -1);
	Class214.aClass130_3128.method1172(Class88.aClass83_1170);
	if (arg0 != 57)
	    aClass16Array3723 = null;
    }
    
    public static boolean method319(byte arg0, int arg1) {
	try {
	    anInt3720++;
	    if ((arg1 ^ 0xffffffff) == -44 || arg1 == 8 || arg1 == 41
		|| (arg1 ^ 0xffffffff) == -15 || (arg1 ^ 0xffffffff) == -2)
		return true;
	    if ((arg1 ^ 0xffffffff) == -24 || (arg1 ^ 0xffffffff) == -14
		|| (arg1 ^ 0xffffffff) == -1009)
		return true;
	    if (arg0 != 45)
		return false;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hl.N(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method295(int arg0) {
	try {
	    if (arg0 != 0)
		anIntArray3719 = null;
	    anInt3724++;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hl.E(" + arg0 + ')');
	}
    }
    
    public static void method320(Class147[][][] arg0, int arg1) {
	try {
	    anInt3721++;
	    if (arg1 != -17126)
		aBoolean3725 = false;
	    for (int i = 0; i < arg0.length; i++) {
		Class147[][] class147s = arg0[i];
		for (int i_0_ = 0; class147s.length > i_0_; i_0_++) {
		    for (int i_1_ = 0;
			 ((i_1_ ^ 0xffffffff)
			  > (class147s[i_0_].length ^ 0xffffffff));
			 i_1_++) {
			Class147 class147 = class147s[i_0_][i_1_];
			if (class147 != null) {
			    if (class147.aClass23_Sub5_1973
				instanceof Interface6)
				((Interface6) class147.aClass23_Sub5_1973)
				    .method25((byte) 6);
			    if (class147.aClass23_Sub2_1972
				instanceof Interface6)
				((Interface6) class147.aClass23_Sub2_1972)
				    .method25((byte) 6);
			    if (class147.aClass23_Sub2_1951
				instanceof Interface6)
				((Interface6) class147.aClass23_Sub2_1951)
				    .method25((byte) 6);
			    if (class147.aClass23_Sub1_1966
				instanceof Interface6)
				((Interface6) class147.aClass23_Sub1_1966)
				    .method25((byte) 6);
			    if (class147.aClass23_Sub1_1969
				instanceof Interface6)
				((Interface6) class147.aClass23_Sub1_1969)
				    .method25((byte) 6);
			    for (Class82 class82 = class147.aClass82_1958;
				 class82 != null;
				 class82 = class82.aClass82_1086) {
				Class23_Sub4 class23_sub4
				    = class82.aClass23_Sub4_1080;
				if (class23_sub4 instanceof Interface6)
				    ((Interface6) class23_sub4)
					.method25((byte) 6);
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hl.M("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	aClass16Array3723 = new Class16[50];
    }
}
