/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

public class Class88 implements Runnable
{
    public static byte[][] aByteArrayArray1146;
    public static Class137 aClass137_1147;
    public static int anInt1148;
    public static String aString1149;
    public static byte[][][] aByteArrayArrayArray1150;
    public static int anInt1151;
    public static int anInt1152;
    public static Class158 aClass158_1153;
    public static int anInt1154;
    public static int anInt1155;
    public static int anInt1156;
    public static int anInt1157;
    public static int anInt1158;
    public static int anInt1159;
    public static int anInt1160;
    public static int anInt1161;
    public Class175 aClass175_1162 = new Class175();
    public static int anInt1163;
    public static int anInt1164 = 2;
    public static int anInt1165;
    public boolean aBoolean1166;
    public Thread aThread1167;
    public int anInt1168 = 0;
    public static int anInt1169;
    public static Class83 aClass83_1170;
    public static int[] anIntArray1171;
    public static int anInt1172;
    /*synthetic*/ public static Class aClass1173;
    
    public static void method823(int arg0, byte arg1) {
	try {
	    Class49.anInt655 = arg0;
	    anInt1151++;
	    if (arg1 < -56) {
		synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		    Class131_Sub2_Sub30.aClass214_5991.method2783(-126);
		}
		synchronized (OutputStream_Sub1.aClass214_66) {
		    OutputStream_Sub1.aClass214_66.method2783(-106);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("je.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method824(int arg0) {
	anInt1152++;
	for (Class131_Sub3 class131_sub3
		 = (Class131_Sub3) Class131_Sub3.aClass119_4118.method1007(0);
	     class131_sub3 != null;
	     class131_sub3 = ((Class131_Sub3)
			      Class131_Sub3.aClass119_4118.method1014(0))) {
	    if ((class131_sub3.anInt4109 ^ 0xffffffff) < -1)
		class131_sub3.anInt4109--;
	    if (class131_sub3.anInt4109 != 0) {
		if ((class131_sub3.anInt4117 ^ 0xffffffff) < -1)
		    class131_sub3.anInt4117--;
		if ((class131_sub3.anInt4117 ^ 0xffffffff) == -1
		    && class131_sub3.anInt4113 >= 1
		    && (class131_sub3.anInt4105 ^ 0xffffffff) <= -2
		    && ((Class131_Sub41_Sub11_Sub1.anInt6546 - 2 ^ 0xffffffff)
			<= (class131_sub3.anInt4113 ^ 0xffffffff))
		    && (-2 + Class131_Sub2_Sub26.anInt5931
			>= class131_sub3.anInt4105)
		    && ((class131_sub3.anInt4115 ^ 0xffffffff) > -1
			|| Class131_Sub2_Sub26.method1592((class131_sub3
							   .anInt4115),
							  22693,
							  (class131_sub3
							   .anInt4107)))) {
		    Class167.method2425(class131_sub3.anInt4122,
					class131_sub3.anInt4120,
					class131_sub3.anInt4105, -1,
					class131_sub3.anInt4121,
					class131_sub3.anInt4113,
					class131_sub3.anInt4115,
					class131_sub3.anInt4107, -101);
		    class131_sub3.anInt4117 = -1;
		    if (class131_sub3.anInt4115 != class131_sub3.anInt4108
			|| (class131_sub3.anInt4108 ^ 0xffffffff) != 0) {
			if (((class131_sub3.anInt4108 ^ 0xffffffff)
			     == (class131_sub3.anInt4115 ^ 0xffffffff))
			    && ((class131_sub3.anInt4121 ^ 0xffffffff)
				== (class131_sub3.anInt4106 ^ 0xffffffff))
			    && (class131_sub3.anInt4112
				== class131_sub3.anInt4107))
			    class131_sub3.method1355((byte) 121);
		    } else
			class131_sub3.method1355((byte) 120);
		}
	    } else if (class131_sub3.anInt4108 < 0
		       || Class131_Sub2_Sub26.method1592((class131_sub3
							  .anInt4108),
							 arg0 ^ ~0x58a7,
							 (class131_sub3
							  .anInt4112))) {
		Class167.method2425(class131_sub3.anInt4122,
				    class131_sub3.anInt4120,
				    class131_sub3.anInt4105, -1,
				    class131_sub3.anInt4106,
				    class131_sub3.anInt4113,
				    class131_sub3.anInt4108,
				    class131_sub3.anInt4112, 89);
		class131_sub3.method1355((byte) 122);
	    }
	}
	if (arg0 != -3)
	    aClass158_1153 = null;
    }
    
    public static void method825(int arg0) {
	try {
	    do {
		if (SignLink.anInt2902 != 2) {
		    try {
			Method method
			    = (aClass1173 != null ? aClass1173
			       : (aClass1173 = method834("java.lang.Runtime")))
				  .getMethod("maxMemory", new Class[0]);
			if (method != null) {
			    try {
				Runtime runtime = Runtime.getRuntime();
				Long var_long
				    = (Long) method.invoke(runtime, (Object[]) null);
				Class1_Sub4.anInt3554
				    = ((int) (var_long.longValue() / 1048576L)
				       + 1);
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			break;
		    } catch (Exception exception) {
			break;
		    }
		}
		Class1_Sub4.anInt3554 = 96;
	    } while (false);
	    if (arg0 == 1)
		anInt1165++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"je.G(" + arg0 + ')');
	}
    }
    
    public void run() {
	try {
	    while (!aBoolean1166) {
		Class131_Sub41_Sub21_Sub2 class131_sub41_sub21_sub2;
		synchronized (aClass175_1162) {
		    class131_sub41_sub21_sub2
			= ((Class131_Sub41_Sub21_Sub2)
			   aClass175_1162.method2476((byte) 67));
		    if (class131_sub41_sub21_sub2 != null)
			anInt1168--;
		    else {
			try {
			    aClass175_1162.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    if ((class131_sub41_sub21_sub2.anInt6585 ^ 0xffffffff)
			!= -3) {
			if (class131_sub41_sub21_sub2.anInt6585 == 3)
			    class131_sub41_sub21_sub2.aByteArray6596
				= (class131_sub41_sub21_sub2.aClass85_6590
				       .method811
				   ((byte) -4, (int) (class131_sub41_sub21_sub2
						      .aLong4671)));
		    } else
			class131_sub41_sub21_sub2.aClass85_6590.method808
			    ((int) class131_sub41_sub21_sub2.aLong4671,
			     class131_sub41_sub21_sub2.aByteArray6596.length,
			     class131_sub41_sub21_sub2.aByteArray6596, -1);
		} catch (Exception exception) {
		    Class45.method563(null, exception, 0);
		}
		class131_sub41_sub21_sub2.aBoolean6440 = false;
	    }
	    anInt1154++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"je.run(" + ')');
	}
    }
    
    public static int method826(byte arg0) {
	try {
	    if (arg0 < 6)
		return 116;
	    anInt1159++;
	    return Class192.anInt2823;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"je.K(" + arg0 + ')');
	}
    }
    
    public static void method827(int arg0) {
	anInt1148++;
	if (arg0 != 1)
	    anInt1161 = 27;
	if ((Class133.anInt1803 ^ 0xffffffff) == -11)
	    Class175.method2484(28, (byte) 9);
	if (Class133.anInt1803 == 30)
	    Class175.method2484(25, (byte) 32);
    }
    
    public void method828(int arg0) {
	aBoolean1166 = true;
	anInt1157++;
	synchronized (aClass175_1162) {
	    aClass175_1162.notifyAll();
	}
	try {
	    aThread1167.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread1167 = null;
	if (arg0 != -17566)
	    aByteArrayArray1146 = null;
    }
    
    public Class131_Sub41_Sub21_Sub2 method829(int arg0, Class85 arg1,
					       int arg2, byte[] arg3) {
	try {
	    anInt1155++;
	    Class131_Sub41_Sub21_Sub2 class131_sub41_sub21_sub2
		= new Class131_Sub41_Sub21_Sub2();
	    if (arg2 != -31152)
		method824(-121);
	    class131_sub41_sub21_sub2.aClass85_6590 = arg1;
	    class131_sub41_sub21_sub2.aByteArray6596 = arg3;
	    class131_sub41_sub21_sub2.aBoolean6439 = false;
	    class131_sub41_sub21_sub2.aLong4671 = (long) arg0;
	    class131_sub41_sub21_sub2.anInt6585 = 2;
	    method832((byte) -108, class131_sub41_sub21_sub2);
	    return class131_sub41_sub21_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("je.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method830(byte arg0) {
	try {
	    aByteArrayArrayArray1150 = null;
	    if (arg0 != -61)
		method825(-41);
	    aClass158_1153 = null;
	    anIntArray1171 = null;
	    aClass137_1147 = null;
	    aByteArrayArray1146 = null;
	    aString1149 = null;
	    aClass83_1170 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"je.C(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub21_Sub2 method831(byte arg0, int arg1,
					       Class85 arg2) {
	try {
	    anInt1156++;
	    Class131_Sub41_Sub21_Sub2 class131_sub41_sub21_sub2
		= new Class131_Sub41_Sub21_Sub2();
	    class131_sub41_sub21_sub2.anInt6585 = 1;
	    synchronized (aClass175_1162) {
		for (Class131_Sub41_Sub21_Sub2 class131_sub41_sub21_sub2_0_
			 = ((Class131_Sub41_Sub21_Sub2)
			    aClass175_1162.method2485(arg0 ^ 0x49));
		     class131_sub41_sub21_sub2_0_ != null;
		     class131_sub41_sub21_sub2_0_
			 = ((Class131_Sub41_Sub21_Sub2)
			    aClass175_1162.method2482(arg0 + -15))) {
		    if ((((long) arg1 ^ 0xffffffffffffffffL)
			 == (class131_sub41_sub21_sub2_0_.aLong4671
			     ^ 0xffffffffffffffffL))
			&& class131_sub41_sub21_sub2_0_.aClass85_6590 == arg2
			&& class131_sub41_sub21_sub2_0_.anInt6585 == 2) {
			class131_sub41_sub21_sub2.aByteArray6596
			    = class131_sub41_sub21_sub2_0_.aByteArray6596;
			class131_sub41_sub21_sub2.aBoolean6440 = false;
			return class131_sub41_sub21_sub2;
		    }
		}
	    }
	    class131_sub41_sub21_sub2.aByteArray6596
		= arg2.method811((byte) -4, arg1);
	    class131_sub41_sub21_sub2.aBoolean6440 = false;
	    class131_sub41_sub21_sub2.aBoolean6439 = true;
	    if (arg0 != -49)
		return null;
	    return class131_sub41_sub21_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("je.F(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method832(byte arg0, Class131_Sub41_Sub21_Sub2 arg1) {
	synchronized (aClass175_1162) {
	    aClass175_1162.method2477(arg1, -26);
	    anInt1168++;
	    aClass175_1162.notifyAll();
	}
	anInt1158++;
	if (arg0 >= -87)
	    aClass158_1153 = null;
    }
    
    public Class131_Sub41_Sub21_Sub2 method833(int arg0, int arg1,
					       Class85 arg2) {
	try {
	    anInt1160++;
	    Class131_Sub41_Sub21_Sub2 class131_sub41_sub21_sub2
		= new Class131_Sub41_Sub21_Sub2();
	    class131_sub41_sub21_sub2.aLong4671 = (long) arg1;
	    class131_sub41_sub21_sub2.aBoolean6439 = false;
	    class131_sub41_sub21_sub2.aClass85_6590 = arg2;
	    class131_sub41_sub21_sub2.anInt6585 = arg0;
	    method832((byte) -102, class131_sub41_sub21_sub2);
	    return class131_sub41_sub21_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("je.D(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class88(SignLink arg0) {
	aBoolean1166 = false;
	try {
	    Class139 class139 = arg0.method2692((byte) 107, this, 5);
	    while ((class139.anInt1864 ^ 0xffffffff) == -1)
		Class187.method2575(-56, 10L);
	    if ((class139.anInt1864 ^ 0xffffffff) == -3)
		throw new RuntimeException();
	    aThread1167 = (Thread) class139.anObject1866;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("je.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method834(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aString1149 = "K";
	anInt1163 = 0;
	aClass137_1147 = new Class137(64);
	anInt1169 = -1;
    }
}
