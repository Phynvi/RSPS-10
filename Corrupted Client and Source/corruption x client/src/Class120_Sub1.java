/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub1 extends Class120
{
    public static int anInt3946;
    public static int anInt3947;
    public static int anInt3948;
    public static int anInt3949;
    public static Class152 aClass152_3950;
    public static int anInt3951;
    public Object anObject3952 = new Object();
    public static int anInt3953;
    public static int anInt3954;
    public static int anInt3955;
    public static int anInt3956;
    public static int anInt3957;
    public int anInt3958;
    public int anInt3959 = 0;
    public static int anInt3960;
    public Class138_Sub1[] aClass138_Sub1Array3961;
    public static int anInt3962;
    
    public void method1029(int arg0, byte arg1) {
	anInt3947++;
	if (arg1 <= -89) {
	    aByteArray1572[anInt1574] = (byte) (arg0 + 10);
	    anInt1574++;
	    anInt1573++;
	    if (anInt1574 >= 5000)
		anInt1574 = 0;
	    anInt1571++;
	    if (anInt3958 > 0) {
		synchronized (anObject3952) {
		    anObject3952.notifyAll();
		}
	    }
	}
    }
    
    public void method1026(byte arg0, Class147 arg1) {
	try {
	    synchronized (anObject3952) {
		aByteArray1572[anInt1574] = (byte) 21;
		anObjectArray1583[anInt1574] = arg1;
		anInt1574++;
		anInt1571++;
		anInt1573++;
		if (anInt1574 >= 5000)
		    anInt1574 = 0;
		if ((anInt3958 ^ 0xffffffff) < -1)
		    anObject3952.notifyAll();
		if (arg0 != 121)
		    aClass152_3950 = null;
	    }
	    anInt3946++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.K(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1020(Class147 arg0, byte arg1) {
	try {
	    anInt3949++;
	    synchronized (anObject3952) {
		aByteArray1572[anInt1574] = (byte) 20;
		anObjectArray1583[anInt1574] = arg0;
		int i = -65 % ((arg1 - -6) / 55);
		anInt1574++;
		if ((anInt1574 ^ 0xffffffff) <= -5001)
		    anInt1574 = 0;
		anInt1573++;
		anInt1571++;
		if ((anInt3958 ^ 0xffffffff) < -1)
		    anObject3952.notifyAll();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1030(int arg0, int arg1) {
	aByteArray1572[anInt1574] = (byte) arg1;
	anInt3960++;
	anInt1574++;
	if ((anInt1574 ^ 0xffffffff) <= -5001)
	    anInt1574 = 0;
	anInt1573++;
	anInt1571++;
	if (anInt3958 > 0) {
	    synchronized (anObject3952) {
		anObject3952.notifyAll();
	    }
	}
	if (arg0 != -16968)
	    method1024(null, 0.50579524F, false, 97, (byte) 43);
    }
    
    public static Class110_Sub3 method1031(Stream arg0, int arg1) {
	try {
	    anInt3956++;
	    if (arg1 >= -98)
		method1031(null, -95);
	    return new Class110_Sub3(arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.readSignedShort(1625554944),
				     arg0.read3Bytes(false),
				     arg0.readUnsignedByte(117));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1027(int arg0) {
	try {
	    synchronized (anObject3952) {
		for (int i = 0; anInt3959 > i; i++) {
		    if (aClass138_Sub1Array3961[i].anInt4708 >= 0)
			method1029(aClass138_Sub1Array3961[i].anInt4708,
				   (byte) -121);
		}
		if (arg0 != 15226)
		    anInt3959 = 21;
	    }
	    anInt3957++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bk.L(" + arg0 + ')');
	}
    }
    
    public void method1024(Class68 arg0, float arg1, boolean arg2, int arg3,
			   byte arg4) {
	try {
	    anInt3951++;
	    synchronized (anObject3952) {
		aByteArray1572[anInt1574]
		    = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
		anObjectArray1583[anInt1574] = arg0;
		aFloatArray1576[anInt1574] = arg1;
		anInt1574++;
		if (anInt1574 >= 5000)
		    anInt1574 = 0;
		int i = 21 / ((arg4 - 9) / 57);
		anInt1573++;
		anInt1571++;
		if (anInt3958 > 0)
		    anObject3952.notifyAll();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    public void method1025(int arg0, Class147 arg1) {
	try {
	    anInt3954++;
	    synchronized (anObject3952) {
		anInt1580--;
		if ((anInt1580 ^ 0xffffffff) > -1)
		    anInt1580 = 4999;
		aByteArray1572[anInt1580] = (byte) 21;
		anObjectArray1583[anInt1580] = arg1;
		anInt1571++;
		if (arg0 != 5000)
		    anObject3952 = null;
		anInt1573++;
		if (anInt3958 > 0)
		    anObject3952.notifyAll();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1028(int arg0) {
	try {
	    anInt3955++;
	    try {
		synchronized (anObject3952) {
		    while (anInt1571 != 0)
			anObject3952.wait();
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    int i = -117 % ((48 - arg0) / 59);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bk.M(" + arg0 + ')');
	}
    }
    
    public void method1032(Class138_Sub1 arg0, byte arg1) {
	try {
	    anInt3953++;
	    boolean bool = false;
	    try {
		boolean bool_0_ = false;
		float f = 0.0F;
		int i;
		synchronized (anObject3952) {
		    if (arg1 != 23)
			method1022(-76, (byte) 64);
		    while ((anInt1573 ^ 0xffffffff) == -1) {
			anInt3958++;
			anObject3952.wait();
			anInt3958--;
		    }
		    i = aByteArray1572[anInt1580];
		    if (arg0.anInt4708 >= 0) {
			if (i < 0 || (i ^ 0xffffffff) < -4)
			    bool = true;
		    } else if (i >= 0 && i <= 3)
			bool = true;
		    if (bool) {
			arg0.anObject1858 = anObjectArray1583[anInt1580];
			f = aFloatArray1576[anInt1580];
			anObjectArray1583[anInt1580] = null;
			anInt1580++;
			if ((anInt1580 ^ 0xffffffff) <= -5001)
			    anInt1580 = 0;
			anInt1573--;
		    }
		}
		if (!bool)
		    Thread.yield();
		else if (arg0.anInt4708 < 0) {
		    if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) >= -4) {
			arg0.anInt4708 = i;
			Class131_Sub2_Sub35.aClass130_6044.method1183(i);
		    }
		} else if ((i ^ 0xffffffff) == -22)
		    InputStream_Sub1.method80(arg0,
					      (Class147) arg0.anObject1858);
		else if ((i ^ 0xffffffff) == -21) {
		    Class147 class147 = (Class147) arg0.anObject1858;
		    if (class147.aClass23_Sub1_1966 != null)
			class147.aClass23_Sub1_1966.method294
			    (Class131_Sub2_Sub35.aClass130_6044, arg1 ^ 0x17);
		    if (class147.aClass23_Sub1_1969 != null)
			class147.aClass23_Sub1_1969.method294
			    (Class131_Sub2_Sub35.aClass130_6044, arg1 ^ 0x17);
		    if (class147.aClass23_Sub2_1972 != null)
			class147.aClass23_Sub2_1972
			    .method294(Class131_Sub2_Sub35.aClass130_6044, 0);
		    if (class147.aClass23_Sub2_1951 != null)
			class147.aClass23_Sub2_1951
			    .method294(Class131_Sub2_Sub35.aClass130_6044, 0);
		    if (class147.aClass23_Sub5_1973 != null)
			class147.aClass23_Sub5_1973
			    .method294(Class131_Sub2_Sub35.aClass130_6044, 0);
		    for (Class82 class82 = class147.aClass82_1958;
			 class82 != null; class82 = class82.aClass82_1086)
			class82.aClass23_Sub4_1080.method294
			    (Class131_Sub2_Sub35.aClass130_6044, arg1 ^ 0x17);
		} else if ((i ^ 0xffffffff) > -31 || (i ^ 0xffffffff) < -34) {
		    if (i >= 40 && i <= 43) {
			Class131_Sub2_Sub35.aClass130_6044
			    .method1252(3000.0F, 1.5F * f);
			((Class68) arg0.anObject1858).method711
			    (Class210.anInt3063, Class47.anInt643,
			     Class131_Sub2_Sub32.anInt6011,
			     Class23_Sub5_Sub2.aBooleanArrayArray5059,
			     i + -40 == 0);
		    } else if (i != 22) {
			if ((i ^ 0xffffffff) == -24)
			    Class131_Sub2_Sub35.aClass130_6044.method1251();
			else if (i == 24)
			    Class131_Sub2_Sub35.aClass130_6044
				.method1217(0, null);
			else if ((i ^ 0xffffffff) <= -11
				 && (i ^ 0xffffffff) >= -14) {
			    Class131_Sub2_Sub35.aClass130_6044
				.method1187(arg0.anInt4708);
			    arg0.anInt4708 = -1;
			}
		    } else
			Class131_Sub2_Sub35.aClass130_6044
			    .method1233(-1, 1583160, 40);
		} else {
		    Class131_Sub2_Sub35.aClass130_6044.method1252(3000.0F,
								  1.5F * f);
		    ((Class68) arg0.anObject1858).method711
			(Class210.anInt3063, Class47.anInt643,
			 Class131_Sub2_Sub32.anInt6011,
			 Class68.aBooleanArrayArray920,
			 (-30 + i ^ 0xffffffff) == -1);
		}
	    } catch (Exception exception) {
		/* empty */
	    } finally {
		if (bool) {
		    synchronized (anObject3952) {
			anInt1571--;
			if ((anInt1571 ^ 0xffffffff) == -1)
			    anObject3952.notifyAll();
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.J("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1021(int arg0, byte arg1) {
	try {
	    anInt3948++;
	    synchronized (anObject3952) {
		aByteArray1572[anInt1574] = (byte) arg0;
		anInt1574++;
		anInt1573++;
		anInt1571++;
		if ((anInt1574 ^ 0xffffffff) <= -5001)
		    anInt1574 = 0;
		if (arg1 >= -126) {
		    /* empty */
		} else if ((anInt3958 ^ 0xffffffff) < -1)
		    anObject3952.notifyAll();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1022(int arg0, byte arg1) {
	try {
	    anInt3962++;
	    int i = 0;
	    synchronized (anObject3952) {
		if ((anInt3959 ^ 0xffffffff) == (arg0 ^ 0xffffffff)) {
		    for (int i_1_ = 0; i_1_ < anInt3959; i_1_++)
			method1030(arg1 + -17094, i++);
		} else {
		    for (int i_2_ = 0; anInt3959 > i_2_; i_2_++)
			aClass138_Sub1Array3961[i_2_].method2125((byte) 87);
		    anInt3959 = arg0;
		    if (arg1 != 126)
			method1024(null, 1.7343023F, false, -46, (byte) 16);
		    aClass138_Sub1Array3961 = new Class138_Sub1[anInt3959];
		    for (int i_3_ = 0; anInt3959 > i_3_; i_3_++) {
			aClass138_Sub1Array3961[i_3_]
			    = new Class138_Sub1(this);
			aClass138_Sub1Array3961[i_3_].method2126((byte) 96);
			method1030(arg1 ^ ~0x4239, i++);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bk.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class120_Sub1() {
	anInt3958 = 0;
	aClass138_Sub1Array3961 = new Class138_Sub1[0];
    }
    
    public static void method1033(int arg0) {
	try {
	    if (arg0 >= -70)
		aClass152_3950 = null;
	    aClass152_3950 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bk.E(" + arg0 + ')');
	}
    }
}
