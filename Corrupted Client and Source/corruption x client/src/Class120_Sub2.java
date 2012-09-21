/* Class120_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub2 extends Class120
{
    public static int anInt3963;
    public static int anInt3964;
    public Class138 aClass138_3965;
    public static int anInt3966 = 0;
    public static int anInt3967;
    public static int anInt3968;
    public static int anInt3969;
    public int anInt3970 = 0;
    public static int anInt3971;
    public static int anInt3972;
    public static int anInt3973;
    public static int anInt3974;
    public static int anInt3975;
    public static int anInt3976;
    public static int anInt3977;
    public static int anInt3978;
    public static int anInt3979;
    
    public void method1034(int arg0) {
	try {
	    anInt3974++;
	    int i = anInt1580;
	    if (arg0 < -125) {
		anInt1580++;
		if ((anInt1580 ^ 0xffffffff) <= -5001)
		    anInt1580 = 0;
		anInt3970 = aByteArray1572[i];
		Object object = anObjectArray1583[i];
		anObjectArray1583[i] = null;
		if (anInt3970 != 21) {
		    if ((anInt3970 ^ 0xffffffff) == -21) {
			Class147 class147 = (Class147) object;
			if (class147.aClass23_Sub1_1966 != null)
			    class147.aClass23_Sub1_1966.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
			if (class147.aClass23_Sub1_1969 != null)
			    class147.aClass23_Sub1_1969.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
			if (class147.aClass23_Sub2_1972 != null)
			    class147.aClass23_Sub2_1972.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
			if (class147.aClass23_Sub2_1951 != null)
			    class147.aClass23_Sub2_1951.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
			if (class147.aClass23_Sub5_1973 != null)
			    class147.aClass23_Sub5_1973.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
			for (Class82 class82 = class147.aClass82_1958;
			     class82 != null; class82 = class82.aClass82_1086)
			    class82.aClass23_Sub4_1080.method294
				(Class131_Sub2_Sub35.aClass130_6044, 0);
		    } else if (anInt3970 < 30
			       || (anInt3970 ^ 0xffffffff) < -34) {
			if (anInt3970 >= 40
			    && (anInt3970 ^ 0xffffffff) >= -44) {
			    Class131_Sub2_Sub35.aClass130_6044.method1252
				(3000.0F, aFloatArray1576[i] * 1.5F);
			    ((Class68) object).method711
				(Class210.anInt3063, Class47.anInt643,
				 Class131_Sub2_Sub32.anInt6011,
				 Class23_Sub5_Sub2.aBooleanArrayArray5059,
				 anInt3970 + -40 == 0);
			} else if ((anInt3970 ^ 0xffffffff) == -23)
			    Class131_Sub2_Sub35.aClass130_6044
				.method1233(-1, 1583160, 40);
			else if (anInt3970 != 23) {
			    if ((anInt3970 ^ 0xffffffff) == -25)
				Class131_Sub2_Sub35.aClass130_6044
				    .method1217(0, null);
			} else
			    Class131_Sub2_Sub35.aClass130_6044.method1251();
		    } else {
			Class131_Sub2_Sub35.aClass130_6044
			    .method1252(3000.0F, aFloatArray1576[i] * 1.5F);
			((Class68) object).method711
			    (Class210.anInt3063, Class47.anInt643,
			     Class131_Sub2_Sub32.anInt6011,
			     Class68.aBooleanArrayArray920,
			     (anInt3970 + -30 ^ 0xffffffff) == -1);
		    }
		} else
		    InputStream_Sub1.method80(aClass138_3965,
					      (Class147) object);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dm.D(" + arg0 + ')');
	}
    }
    
    public void method1024(Class68 arg0, float arg1, boolean arg2, int arg3,
			   byte arg4) {
	int i = 73 / ((9 - arg4) / 57);
	aByteArray1572[anInt1574] = (byte) (!arg2 ? 30 + arg3 : arg3 + 40);
	anInt3978++;
	anObjectArray1583[anInt1574] = arg0;
	aFloatArray1576[anInt1574] = arg1;
	anInt1574++;
	if (anInt1574 >= 5000)
	    anInt1574 = 0;
    }
    
    public void method1025(int arg0, Class147 arg1) {
	try {
	    anInt1580--;
	    anInt3969++;
	    if (anInt1580 < 0)
		anInt1580 = 4999;
	    aByteArray1572[anInt1580] = (byte) 21;
	    if (arg0 != 5000)
		anInt3976 = -80;
	    anObjectArray1583[anInt1580] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dm.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1021(int arg0, byte arg1) {
	if (arg1 > -126)
	    method1034(-31);
	aByteArray1572[anInt1574] = (byte) arg0;
	anInt3979++;
	anInt1574++;
	if ((anInt1574 ^ 0xffffffff) <= -5001)
	    anInt1574 = 0;
    }
    
    public void method1027(int arg0) {
	try {
	    if (arg0 != 15226)
		anInt3975 = -20;
	    anInt3963++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dm.L(" + arg0 + ')');
	}
    }
    
    public void method1020(Class147 arg0, byte arg1) {
	anInt3971++;
	aByteArray1572[anInt1574] = (byte) 20;
	int i = 48 % ((-6 - arg1) / 55);
	anObjectArray1583[anInt1574] = arg0;
	anInt1574++;
	if ((anInt1574 ^ 0xffffffff) <= -5001)
	    anInt1574 = 0;
    }
    
    public void method1028(int arg0) {
	try {
	    anInt3973++;
	    int i = 114 / ((48 - arg0) / 59);
	    while (anInt1580 != anInt1574)
		method1034(-126);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dm.M(" + arg0 + ')');
	}
    }
    
    public void method1026(byte arg0, Class147 arg1) {
	aByteArray1572[anInt1574] = (byte) 21;
	anInt3967++;
	anObjectArray1583[anInt1574] = arg1;
	anInt1574++;
	if (arg0 != 121)
	    aClass138_3965 = null;
	if ((anInt1574 ^ 0xffffffff) <= -5001)
	    anInt1574 = 0;
    }
    
    public static void method1035(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt3977++;
	    String string = ("crabstick " + arg0 + "," + (arg2 >> -2017680122) + ","
			     + (arg1 >> -102843258) + "," + (arg2 & 0x3f) + ","
			     + (arg3 & arg1));
	    System.out.println(string);
	    Class131_Sub2_Sub30.method1617(66, true, string);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dm.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method1036(int arg0, boolean arg1) {
	try {
	    if (arg0 >= -67)
		anInt3975 = -88;
	    Class56.method626(Class131_Sub1_Sub1.anInt5499, Class218.anInt3201,
			      arg1, Class187.anInt2674, (byte) 125);
	    anInt3968++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dm.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1022(int arg0, byte arg1) {
	anInt3964++;
	if (arg1 != 126)
	    method1036(-124, true);
    }
    
    public Class120_Sub2() {
	aClass138_3965 = new Class138();
    }
}
