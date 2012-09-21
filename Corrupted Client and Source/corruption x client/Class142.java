/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142
{
    public static int anInt1885 = -1;
    public static int anInt1886;
    public Class1_Sub7 aClass1_Sub7_1887 = new Class1_Sub7();
    public static int anInt1888;
    public static int anInt1889;
    public Class1_Sub7 aClass1_Sub7_1890;
    public static int anInt1891;
    public static int anInt1892;
    public static int anInt1893;
    public static int anInt1894;
    public static int anInt1895;
    
    public static byte[] method2135(byte[] arg0, boolean arg1) {
	try {
	    anInt1895++;
	    if (arg0 == null)
		return null;
	    byte[] is = new byte[arg0.length];
	    Class61.method652(arg0, 0, is, 0, arg0.length);
	    if (arg1 != false)
		return null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pa.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method2136(byte arg0, Class131_Sub21 arg1) {
	try {
	    anInt1886++;
	    if (arg0 <= 101)
		method2136((byte) 69, null);
	    String string = client.method64(-61, arg1);
	    int[] is = null;
	    if (!Class85.method807((byte) 123, arg1.anInt4442)) {
		if (!Class23_Sub3.method319((byte) 45, arg1.anInt4442)) {
		    if (Class1_Sub2.method99(arg1.anInt4442, (byte) -102)) {
			if (arg1.anInt4442 != 1009)
			    is = (Class55.method612
				  ((int) (0x7fffffffL
					  & arg1.aLong4437 >>> 1625593184),
				   113)
				  .anIntArray2655);
			else
			    is = (Class55.method612((int) arg1.aLong4437, 121)
				  .anIntArray2655);
		    }
		} else {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [(int) arg1.aLong4437]);
		    if (class23_sub4_sub1_sub1 != null)
			is = (class23_sub4_sub1_sub1.aClass66_6474
			      .anIntArray885);
		}
	    } else
		is = (Class131_Sub19.method1808((int) arg1.aLong4437, false)
		      .anIntArray336);
	    if (is != null)
		string += Class75.method762(105, is);
	    return Class89.aClass55_3259.method614(Class167.aClass152Array2226,
						   string, (byte) -43);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pa.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class1_Sub7 method2137(int arg0) {
	try {
	    if (arg0 != 28148)
		return null;
	    anInt1893++;
	    Class1_Sub7 class1_sub7 = aClass1_Sub7_1890;
	    if (aClass1_Sub7_1887 == class1_sub7) {
		aClass1_Sub7_1890 = null;
		return null;
	    }
	    aClass1_Sub7_1890 = class1_sub7.aClass1_Sub7_3591;
	    return class1_sub7;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pa.A(" + arg0 + ')');
	}
    }
    
    public Class142() {
	try {
	    aClass1_Sub7_1887.aClass1_Sub7_3592 = aClass1_Sub7_1887;
	    aClass1_Sub7_1887.aClass1_Sub7_3591 = aClass1_Sub7_1887;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pa.<init>(" + ')');
	}
    }
    
    public void method2138(int arg0, Class1_Sub7 arg1) {
	try {
	    if (arg0 == 0) {
		if (arg1.aClass1_Sub7_3592 != null)
		    arg1.method129(5);
		anInt1892++;
		arg1.aClass1_Sub7_3591 = aClass1_Sub7_1887;
		arg1.aClass1_Sub7_3592 = aClass1_Sub7_1887.aClass1_Sub7_3592;
		arg1.aClass1_Sub7_3592.aClass1_Sub7_3591 = arg1;
		arg1.aClass1_Sub7_3591.aClass1_Sub7_3592 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pa.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class1_Sub7 method2139(byte arg0) {
	try {
	    anInt1891++;
	    if (arg0 < 37)
		method2136((byte) 30, null);
	    Class1_Sub7 class1_sub7 = aClass1_Sub7_1887.aClass1_Sub7_3591;
	    if (aClass1_Sub7_1887 == class1_sub7) {
		aClass1_Sub7_1890 = null;
		return null;
	    }
	    aClass1_Sub7_1890 = class1_sub7.aClass1_Sub7_3591;
	    return class1_sub7;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pa.F(" + arg0 + ')');
	}
    }
    
    public void method2140(boolean arg0) {
	try {
	    for (;;) {
		Class1_Sub7 class1_sub7 = aClass1_Sub7_1887.aClass1_Sub7_3591;
		if (aClass1_Sub7_1887 == class1_sub7)
		    break;
		class1_sub7.method129(5);
	    }
	    if (arg0 == false) {
		anInt1889++;
		aClass1_Sub7_1890 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pa.B(" + arg0 + ')');
	}
    }
}
