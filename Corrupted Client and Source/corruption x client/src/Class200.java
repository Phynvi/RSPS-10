/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class200
{
    public int anInt2913 = -1;
    public static int anInt2914;
    public Class131_Sub43[] aClass131_Sub43Array2915;
    public Class119 aClass119_2916;
    public static int anInt2917;
    public static int anInt2918;
    public static int anInt2919;
    public int anInt2920;
    public int anInt2921;
    public int[][] anIntArrayArray2922;
    public static int anInt2923;
    public int anInt2924 = 0;
    public static int anInt2925;
    public static int anInt2926;
    public boolean aBoolean2927;
    
    public static void method2713(int arg0) {
	try {
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class169.aClass119_2266.method1007(arg0 ^ arg0));
		 class131_sub19 != null;
		 class131_sub19
		     = ((Class131_Sub19)
			Class169.aClass119_2266.method1014(arg0 ^ 0x5622))) {
		if (class131_sub19.aBoolean4402)
		    class131_sub19.method1813(true);
	    }
	    anInt2919++;
	    for (Class131_Sub19 class131_sub19
		     = (Class131_Sub19) Class131_Sub4.aClass119_4133
					    .method1007(arg0 ^ 0x5622);
		 class131_sub19 != null;
		 class131_sub19 = (Class131_Sub19) Class131_Sub4
						       .aClass119_4133
						       .method1014(0)) {
		if (class131_sub19.aBoolean4402)
		    class131_sub19.method1813(true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ug.D(" + arg0 + ')');
	}
    }
    
    public int[] method2714(int arg0, byte arg1) {
	try {
	    anInt2918++;
	    int i = 74 / ((7 - arg1) / 59);
	    if ((anInt2920 ^ 0xffffffff) == (anInt2921 ^ 0xffffffff)) {
		aBoolean2927 = aClass131_Sub43Array2915[arg0] == null;
		aClass131_Sub43Array2915[arg0] = Class190.aClass131_Sub43_2800;
		return anIntArrayArray2922[arg0];
	    }
	    if ((anInt2921 ^ 0xffffffff) != -2) {
		Class131_Sub43 class131_sub43 = aClass131_Sub43Array2915[arg0];
		if (class131_sub43 == null) {
		    aBoolean2927 = true;
		    if ((anInt2921 ^ 0xffffffff) < (anInt2924 ^ 0xffffffff)) {
			class131_sub43 = new Class131_Sub43(arg0, anInt2924);
			anInt2924++;
		    } else {
			Class131_Sub43 class131_sub43_0_
			    = (Class131_Sub43) aClass119_2916.method1017(0);
			class131_sub43
			    = new Class131_Sub43(arg0,
						 class131_sub43_0_.anInt4698);
			aClass131_Sub43Array2915[class131_sub43_0_.anInt4701]
			    = null;
			class131_sub43_0_.method1355((byte) 126);
		    }
		    aClass131_Sub43Array2915[arg0] = class131_sub43;
		} else
		    aBoolean2927 = false;
		aClass119_2916.method1016(class131_sub43, 0);
		return anIntArrayArray2922[class131_sub43.anInt4698];
	    }
	    aBoolean2927 = anInt2913 != arg0;
	    anInt2913 = arg0;
	    return anIntArrayArray2922[0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ug.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[][] method2715(byte arg0) {
	try {
	    anInt2917++;
	    int i = 4 % ((arg0 - -35) / 57);
	    if (anInt2921 != anInt2920)
		throw new RuntimeException
			  ("Can only retrieve a full image cache");
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (anInt2921 ^ 0xffffffff);
		 i_1_++)
		aClass131_Sub43Array2915[i_1_] = Class190.aClass131_Sub43_2800;
	    return anIntArrayArray2922;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ug.E(" + arg0 + ')');
	}
    }
    
    public void method2716(byte arg0) {
	try {
	    if (arg0 >= -61)
		anInt2913 = 23;
	    for (int i = 0; anInt2921 > i; i++)
		anIntArrayArray2922[i] = null;
	    anInt2923++;
	    aClass131_Sub43Array2915 = null;
	    anIntArrayArray2922 = null;
	    aClass119_2916.method1012(0);
	    aClass119_2916 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ug.B(" + arg0 + ')');
	}
    }
    
    public static void method2717(int arg0) {
	try {
	    if (Class131_Sub35.aClass215_4588 != null)
		Class131_Sub35.aClass215_4588.method2799(14682);
	    anInt2914++;
	    if (client.aClass215_3470 != null)
		client.aClass215_3470.method2799(14682);
	    Class131_Sub2_Sub12.method1531((byte) -95, 2, Class58.aBoolean765,
					   22050);
	    Class131_Sub35.aClass215_4588
		= Class77.method774(Class131_Sub2_Sub15.aCanvas5768,
				    Class23_Sub4.aSignLink_3734, arg0,
				    (byte) 91, 0);
	    Class131_Sub35.aClass215_4588
		.method2806(Class211.aClass131_Sub1_Sub1_3104, -26391);
	    client.aClass215_3470
		= Class77.method774(Class131_Sub2_Sub15.aCanvas5768,
				    Class23_Sub4.aSignLink_3734, 2048,
				    (byte) 91, 1);
	    client.aClass215_3470.method2806(Class78.aClass131_Sub1_Sub3_1057,
					     -26391);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ug.C(" + arg0 + ')');
	}
    }
    
    public Class200(int arg0, int arg1, int arg2) {
	aClass119_2916 = new Class119();
	aBoolean2927 = false;
	try {
	    anInt2920 = arg1;
	    anInt2921 = arg0;
	    anIntArrayArray2922 = new int[anInt2921][arg2];
	    aClass131_Sub43Array2915 = new Class131_Sub43[anInt2920];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ug.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ')'));
	}
    }
}
