/* Class131_Sub41_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub1 extends Class131_Sub41
{
    public static String aString6155
	= "You can't add yourself to your own ignore list.";
    public String aString6156;
    public int anInt6157 = 0;
    public static int anInt6158;
    public boolean aBoolean6159;
    public static int anInt6160;
    public int anInt6161;
    public static int anInt6162;
    public static int anInt6163;
    public int anInt6164;
    public int anInt6165 = 12800;
    public int anInt6166 = -1;
    public String aString6167;
    public static int anInt6168 = -1;
    public static int anInt6169;
    public static int anInt6170;
    public int anInt6171;
    public Class119 aClass119_6172;
    public static String[] aStringArray6173
	= { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    public int anInt6174 = 0;
    public static int anInt6175;
    public int anInt6176;
    public static int anInt6177;
    public static int anInt6178;
    
    public static void method1920(int arg0) {
	anInt6178++;
	Class59.aClass119_772 = new Class119();
	if (arg0 != 4120)
	    method1923(38, -34, -113);
    }
    
    public static Class173 method1921(Class173 arg0, byte arg1) {
	try {
	    anInt6169++;
	    if (arg0.anInt2456 != -1)
		return Class190.method2615(arg0.anInt2456, -14);
	    int i = arg0.anInt2455 >>> 470700848;
	    int i_0_ = -97 % ((75 - arg1) / 35);
	    Class20 class20 = new Class20(Class83.aClass180_1096);
	    for (Class131_Sub33 class131_sub33
		     = (Class131_Sub33) class20.method260(24056);
		 class131_sub33 != null;
		 class131_sub33
		     = (Class131_Sub33) class20.method259((byte) 105)) {
		if (i == class131_sub33.anInt4556)
		    return Class190.method2615((int) class131_sub33.aLong1791,
					       -105);
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method1922(int arg0, int arg1, int arg2, int arg3,
			      int[] arg4) {
	try {
	    anInt6170++;
	    int i = -57 % ((arg0 - 39) / 51);
	    for (Class131_Sub6 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1007(0);
		 class131_sub6 != null;
		 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1014(0)) {
		if (class131_sub6.method1656(false, arg1, arg2, arg3)) {
		    class131_sub6.method1662((byte) -116, arg1, arg3, arg4);
		    return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1923(int arg0, int arg1, int arg2) {
	try {
	    anInt6158++;
	    if (arg0 == -1) {
		Class131_Sub41_Sub6 class131_sub41_sub6
		    = Class131_Sub13.method1709(7, arg2, (byte) 1);
		class131_sub41_sub6.method1962(0);
		class131_sub41_sub6.anInt6244 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1924(byte arg0) {
	try {
	    anInt6162++;
	    anInt6165 = 12800;
	    anInt6164 = 12800;
	    anInt6174 = 0;
	    anInt6157 = 0;
	    if (arg0 > -43)
		anInt6175 = -38;
	    for (Class131_Sub6 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1007(0);
		 class131_sub6 != null;
		 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1014(0)) {
		if (anInt6165 > class131_sub6.anInt4159)
		    anInt6165 = class131_sub6.anInt4159;
		if (class131_sub6.anInt4153 < anInt6164)
		    anInt6164 = class131_sub6.anInt4153;
		if ((anInt6174 ^ 0xffffffff)
		    > (class131_sub6.anInt4162 ^ 0xffffffff))
		    anInt6174 = class131_sub6.anInt4162;
		if ((anInt6157 ^ 0xffffffff)
		    > (class131_sub6.anInt4158 ^ 0xffffffff))
		    anInt6157 = class131_sub6.anInt4158;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"as.I(" + arg0 + ')');
	}
    }
    
    public boolean method1925(int arg0, int arg1, byte arg2) {
	try {
	    if (arg2 != 109)
		return false;
	    anInt6177++;
	    for (Class131_Sub6 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1007(0);
		 class131_sub6 != null;
		 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1014(0)) {
		if (class131_sub6.method1659((byte) -124, arg1, arg0))
		    return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method1926(int arg0, int[] arg1, int arg2, int arg3) {
	try {
	    anInt6160++;
	    if (arg3 != -1)
		aBoolean6159 = true;
	    for (Class131_Sub6 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1007(arg3 + 1);
		 class131_sub6 != null;
		 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1014(0)) {
		if (class131_sub6.method1659((byte) -60, arg0, arg2)) {
		    class131_sub6.method1662((byte) -76, arg0, arg2, arg1);
		    return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method1927(int arg0) {
	try {
	    if (arg0 != -1)
		aStringArray6173 = null;
	    aStringArray6173 = null;
	    aString6155 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"as.A(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub1(int arg0, String arg1, String arg2, int arg3,
			       int arg4, boolean arg5, int arg6) {
	anInt6164 = 12800;
	anInt6176 = -1;
	aBoolean6159 = true;
	try {
	    anInt6161 = arg0;
	    aString6167 = arg1;
	    aBoolean6159 = arg5;
	    anInt6171 = arg3;
	    aString6156 = arg2;
	    anInt6166 = arg4;
	    anInt6176 = arg6;
	    if ((anInt6176 ^ 0xffffffff) == -256)
		anInt6176 = 0;
	    aClass119_6172 = new Class119();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.<init>(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ',' + arg6
						 + ')'));
	}
    }
    
    public boolean method1928(int arg0, int[] arg1, int arg2, byte arg3) {
	try {
	    if (arg3 > -96)
		return false;
	    anInt6163++;
	    for (Class131_Sub6 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1007(0);
		 class131_sub6 != null;
		 class131_sub6
		     = (Class131_Sub6) aClass119_6172.method1014(0)) {
		if (class131_sub6.method1658(arg0, arg2, -112)) {
		    class131_sub6.method1660(arg1, arg2, (byte) -110, arg0);
		    return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("as.H(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
}
