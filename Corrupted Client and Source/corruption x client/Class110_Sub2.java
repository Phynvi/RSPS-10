/* Class110_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110_Sub2 extends Class110
{
    public int anInt3904;
    public static int anInt3905;
    public int anInt3906;
    public static int anInt3907;
    public static int anInt3908;
    public static Class76 aClass76_3909;
    public int anInt3910;
    public static int anInt3911;
    public int anInt3912;
    public static int anInt3913;
    public static int anInt3914 = -1;
    public static int anInt3915;
    
    public static void method944(int arg0) {
	try {
	    if (arg0 == 0)
		aClass76_3909 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ke.H(" + arg0 + ')');
	}
    }
    
    public void method938(int arg0, int arg1, int arg2) {
	anInt3905++;
	if (arg2 != 0)
	    method944(60);
    }
    
    public static String method945(int arg0, String arg1, Class173 arg2) {
	try {
	    if (arg0 != (arg1.indexOf("%") ^ 0xffffffff)) {
		for (;;) {
		    int i = arg1.indexOf("%1");
		    if ((i ^ 0xffffffff) == 0)
			break;
		    arg1
			= (arg1.substring(0, i)
			   + Class108.method927(113, Class147.method2175(73, 0,
									 arg2))
			   + arg1.substring(i + 2));
		}
		for (;;) {
		    int i = arg1.indexOf("%2");
		    if (i == -1)
			break;
		    arg1 = (arg1.substring(0, i)
			    + Class108.method927(93, Class147.method2175(41, 1,
									 arg2))
			    + arg1.substring(i + 2));
		}
		for (;;) {
		    int i = arg1.indexOf("%3");
		    if (i == -1)
			break;
		    arg1 = (arg1.substring(0, i)
			    + Class108.method927(119,
						 Class147.method2175(102, 2,
								     arg2))
			    + arg1.substring(2 + i));
		}
		for (;;) {
		    int i = arg1.indexOf("%4");
		    if ((i ^ 0xffffffff) == 0)
			break;
		    arg1 = (arg1.substring(0, i)
			    + Class108.method927(arg0 ^ 0x71,
						 Class147.method2175(112, 3,
								     arg2))
			    + arg1.substring(i - -2));
		}
		for (;;) {
		    int i = arg1.indexOf("%5");
		    if ((i ^ 0xffffffff) == 0)
			break;
		    arg1 = (arg1.substring(0, i)
			    + Class108.method927(117,
						 Class147.method2175((arg0
								      ^ 0x75),
								     4, arg2))
			    + arg1.substring(i - -2));
		}
		for (;;) {
		    int i = arg1.indexOf("%dns");
		    if ((i ^ 0xffffffff) == 0)
			break;
		    String string = "";
		    if (Class183_Sub1.aClass139_4955 != null) {
			if (Class183_Sub1.aClass139_4955.anObject1866 == null)
			    string
				= Class204.method2729(false, (Class183_Sub1
							      .aClass139_4955
							      .anInt1862));
			else
			    string = (String) (Class183_Sub1.aClass139_4955
					       .anObject1866);
		    }
		    arg1 = (arg1.substring(0, i) + string
			    + arg1.substring(i + 4));
		}
	    }
	    anInt3907++;
	    return arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ke.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method934(int arg0, int arg1, byte arg2) {
	try {
	    if (arg2 != 75)
		anInt3910 = 33;
	    anInt3915++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ke.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class110_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5) {
	super(-1, arg4, arg5);
	try {
	    anInt3906 = arg1;
	    anInt3904 = arg0;
	    anInt3912 = arg3;
	    anInt3910 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ke.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ')'));
	}
    }
    
    public void method936(int arg0, boolean arg1, int arg2) {
	try {
	    anInt3913++;
	    int i = arg2 * anInt3904 >> -1399339284;
	    int i_0_ = arg2 * anInt3910 >> -620863380;
	    int i_1_ = anInt3906 * arg0 >> -1014879476;
	    int i_2_ = anInt3912 * arg0 >> 1959604940;
	    Class166.method2418(anInt1428, i, i_0_, arg1, i_1_, i_2_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ke.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	aClass76_3909 = InputStream_Sub1.method84(false);
    }
}
