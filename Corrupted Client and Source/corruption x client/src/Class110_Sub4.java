/* Class110_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110_Sub4 extends Class110
{
    public static int anInt3932;
    public static int anInt3933 = 0;
    public static boolean[] aBooleanArray3934 = new boolean[100];
    public int anInt3935;
    public static int anInt3936;
    public static int anInt3937;
    public static int anInt3938;
    public static Class128_Sub1[] aClass128_Sub1Array3939;
    public static int anInt3940 = 0;
    public int anInt3941;
    public int anInt3942;
    public int anInt3943;
    public static Class158 aClass158_3944;
    public static int anInt3945;
    
    public void method936(int arg0, boolean arg1, int arg2) {
	anInt3937++;
	if (arg1 != false)
	    method938(36, 103, -38);
    }
    
    public static void method949(boolean arg0, int arg1) {
	anInt3945++;
	Class131_Sub24.anInt4470 = arg1;
	synchronized (Class131_Sub2_Sub14.aClass214_5749) {
	    Class131_Sub2_Sub14.aClass214_5749.method2783(-124);
	}
	if (arg0 != true)
	    method949(false, -25);
    }
    
    public void method934(int arg0, int arg1, byte arg2) {
	try {
	    anInt3936++;
	    int i = anInt3935 * arg1 >> 1818231596;
	    if (arg2 == 75) {
		int i_0_ = anInt3942 * arg1 >> -251199316;
		int i_1_ = arg0 * anInt3943 >> -1455704372;
		int i_2_ = arg0 * anInt3941 >> 360304332;
		Class131_Sub41_Sub13.method2014(i, i_2_, (byte) -126, i_0_,
						anInt1432, i_1_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uq.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method938(int arg0, int arg1, int arg2) {
	try {
	    anInt3932++;
	    int i = arg0 * anInt3935 >> -1391134932;
	    int i_3_ = arg0 * anInt3942 >> 427047660;
	    int i_4_ = arg1 * anInt3943 >> -1056824788;
	    if (arg2 == 0) {
		int i_5_ = anInt3941 * arg1 >> -1726564244;
		Class131_Sub41_Sub5.method1952(anInt1425, anInt1432, 1, i_4_,
					       i_5_, i_3_, i, anInt1428);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uq.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class110_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	try {
	    anInt3935 = arg0;
	    anInt3943 = arg1;
	    anInt3941 = arg3;
	    anInt3942 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uq.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ')'));
	}
    }
    
    public static void method950(int arg0) {
	try {
	    aClass128_Sub1Array3939 = null;
	    aBooleanArray3934 = null;
	    aClass158_3944 = null;
	    int i = 33 / ((arg0 - 26) / 37);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uq.H(" + arg0 + ')');
	}
    }
    
    static {
	aClass128_Sub1Array3939 = new Class128_Sub1[0];
	anInt3938 = -9017772;
    }
}
