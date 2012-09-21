/* Class23_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub3_Sub1 extends Class23_Sub3
{
    public int anInt5223;
    public int anInt5224;
    public int anInt5225;
    public static Class103 aClass103_5226 = new Class103(100);
    public static int anInt5227;
    public static int anInt5228;
    public int anInt5229;
    public static int anInt5230;
    public static PacketStream aClass131_Sub15_Sub2_5231
	= new PacketStream(5000);
    public int anInt5232;
    public int anInt5233 = -1;
    public static Class158 aClass158_5234;
    
    public void method294(Class130 arg0, int arg1) {
	anInt5227++;
	if (arg1 != 0)
	    aClass158_5234 = null;
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    if (arg1 != false)
		anInt5223 = 71;
	    anInt5228++;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3728, anInt3727, anInt3729);
	    Class1_Sub2 class1_sub2
		= Class131_Sub41_Sub11.method2003(3, 12300);
	    if (anInt5233 != -1) {
		Class154 class154
		    = (Class131_Sub19.method1808(anInt5233, false).method424
		       ((byte) -59, anInt5224, arg0, 0, 0, 1024, null, null,
			-1));
		if (class154 != null)
		    class154.method2261(class9,
					class1_sub2.aClass1_Sub5Array3500[2],
					0);
	    }
	    if (anInt5223 != -1) {
		Class154 class154
		    = (Class131_Sub19.method1808(anInt5223, arg1).method424
		       ((byte) -59, anInt5229, arg0, 0, 0, 1024, null, null,
			-1));
		if (class154 != null)
		    class154.method2261(class9,
					class1_sub2.aClass1_Sub5Array3500[1],
					0);
	    }
	    Class154 class154
		= (Class131_Sub19.method1808(anInt5232, arg1).method424
		   ((byte) -59, anInt5225, arg0, 0, 0, 1024, null, null, -1));
	    if (class154 != null)
		class154.method2261(class9,
				    class1_sub2.aClass1_Sub5Array3500[0], 0);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("te.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method321(int arg0) {
	try {
	    aClass103_5226 = null;
	    if (arg0 <= -112) {
		aClass158_5234 = null;
		aClass131_Sub15_Sub2_5231 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"te.K(" + arg0 + ')');
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt5230++;
	    Class9 class9 = arg1.method1238();
	    if (arg3 <= 12)
		method288(null, false);
	    class9.method181(anInt3728, anInt3727, anInt3729);
	    Class154 class154
		= (Class131_Sub19.method1808(anInt5232, false).method424
		   ((byte) -59, anInt5225, arg1, 0, 0, 65536, null, null, -1));
	    if (class154 != null
		&& class154.method2278(arg2, arg0, class9, true))
		return true;
	    if ((anInt5223 ^ 0xffffffff) != 0) {
		class154
		    = (Class131_Sub19.method1808(anInt5223, false).method424
		       ((byte) -59, anInt5229, arg1, 0, 0, 65536, null, null,
			-1));
		if (class154 != null
		    && class154.method2278(arg2, arg0, class9, true))
		    return true;
	    }
	    if (anInt5233 != -1) {
		class154
		    = (Class131_Sub19.method1808(anInt5233, false).method424
		       ((byte) -59, anInt5224, arg1, 0, 0, 65536, null, null,
			-1));
		if (class154 != null
		    && class154.method2278(arg2, arg0, class9, true))
		    return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("te.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class23_Sub3_Sub1() {
	anInt5223 = -1;
    }
}
