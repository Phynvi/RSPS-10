/* Class23_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub2 extends Class23
{
    public int anInt3704;
    public int anInt3705;
    public int anInt3706;
    public static String[] aStringArray3707 = new String[200];
    public int anInt3708;
    public static boolean aBoolean3709;
    public static int anInt3710;
    public int anInt3711;
    public int anInt3712;
    public static boolean aBoolean3713;
    public int anInt3714;
    public static int anInt3715;
    public static int anInt3716;
    public static int anInt3717;
    public static boolean aBoolean3718 = false;
    
    public static void method308(byte arg0, int arg1) {
	try {
	    Class23_Sub4_Sub5.aClass158_5111 = null;
	    Class131_Sub33.anInt4554 = arg1;
	    Class131_Sub20.anInt4432 = -1;
	    Class83.aBoolean1094 = false;
	    anInt3715++;
	    if (arg0 == 34) {
		Class183_Sub1.anInt4962 = 0;
		Class214.anInt3139 = 1;
		Cryption.anInt1824 = -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("de.U(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    if (arg0 > -116)
		aBoolean3709 = true;
	    anInt3716++;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("de.J(" + arg0 + ','
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
	    if (arg0 != -115)
		method289((byte) -52);
	    anInt3717++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"de.D(" + arg0 + ')');
	}
    }
    
    public void method295(int arg0) {
	try {
	    anInt3710++;
	    if (arg0 == 0)
		throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"de.E(" + arg0 + ')');
	}
    }
    
    public static void method309(int arg0) {
	aStringArray3707 = null;
	if (arg0 != 10191)
	    method308((byte) 127, 41);
    }
    
    public abstract int method310(int i);
    
    public Class23_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
	try {
	    anInt3705 = arg3;
	    anInt3714 = arg2;
	    anInt3704 = arg6;
	    anInt3712 = arg4;
	    anInt3711 = arg0;
	    anInt3708 = arg1;
	    anInt3706 = arg5;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("de.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ')'));
	}
    }
}
