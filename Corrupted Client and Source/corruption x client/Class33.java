/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class33 implements Runnable
{
    public static int anInt452;
    public static int anInt453;
    public static int anInt454;
    public static int[] anIntArray455
	= { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    public static int anInt456;
    public static String aString457 = "Take";
    public SignLink aSignLink_458;
    public int anInt459;
    public static int anInt460;
    public static int anInt461;
    public static int anInt462;
    public byte[] aByteArray463;
    public boolean aBoolean464 = false;
    public static Class173 aClass173_465;
    public Socket aSocket466;
    public static int anInt467;
    public OutputStream anOutputStream468;
    public static int anInt469;
    public InputStream anInputStream470;
    public static boolean aBoolean471;
    public static int anInt472;
    public static int anInt473;
    public static int anInt474;
    public boolean aBoolean475;
    public static String[] aStringArray476 = new String[100];
    public static int anInt477;
    public int anInt478;
    public static int anInt479;
    public static int anInt480;
    public static Class214 aClass214_481;
    public static int anInt482;
    public Class139 aClass139_483;

    public static void method442(int arg0) {
	try {
	    anInt467++;
	    if (arg0 <= -109) {
		int[] is = new int[Class131_Sub14.anInt4289];
		int i = 0;
		for (int i_0_ = 0;
		     ((i_0_ ^ 0xffffffff)
		      > (Class131_Sub14.anInt4289 ^ 0xffffffff));
		     i_0_++) {
		    Class29 class29 = Class131_Sub19.method1808(i_0_, false);
		    if (class29.anInt351 >= 0 || class29.anInt323 >= 0)
			is[i++] = i_0_;
		}
		Class135.anIntArray1815 = new int[i];
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_1_++)
		    Class135.anIntArray1815[i_1_] = is[i_1_];
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.G(" + arg0 + ')');
	}
    }
    
    public static void method443(int arg0) {
	try {
	    anInt460++;
	    synchronized (Class23_Sub4_Sub2.aClass214_5366) {
		Class23_Sub4_Sub2.aClass214_5366.method2775((byte) 56);
		if (arg0 != 4900)
		    method449((byte) 121);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.N(" + arg0 + ')');
	}
    }
    
    public int method444(int arg0) throws IOException {
	try {
	    anInt473++;
	    if (aBoolean464)
		return 0;
	    if (arg0 != -1707)
		aSocket466 = null;
	    return anInputStream470.read();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.D(" + arg0 + ')');
	}
    }
    
    public void finalize() {
	try {
	    method452(-1);
	    anInt454++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.finalize(" + ')');
	}
    }
    
    public static void method445(int arg0, int arg1) {
	try {
	    anInt477++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(9, arg1, (byte) 1);
	    if (arg0 > -52)
		method453(106, -41, -111, null);
	    class131_sub41_sub6.method1959(-120);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method446(int arg0, int arg1, boolean arg2, int arg3,
				 boolean arg4, int arg5) {
	try {
	    anInt452++;
	    if (arg4)
		Class131_Sub2_Sub28.method1607(115);
	    if (Class74.aFrame1014 != null
		&& (arg3 != 3 || Class90.anInt1176 != arg0
		    || arg5 != Class14.anInt163)) {
		Class131_Sub2_Sub5.method1491(Class23_Sub4.aSignLink_3734,
					      Class74.aFrame1014, true);
		Class74.aFrame1014 = null;
	    }
	    if (arg3 == 3 && Class74.aFrame1014 == null) {
		Class74.aFrame1014
		    = Class128.method1141(7439, arg0, arg5,
					  Class23_Sub4.aSignLink_3734, 0, 0);
		if (Class74.aFrame1014 != null) {
		    Class14.anInt163 = arg5;
		    Class90.anInt1176 = arg0;
		    Class165.method2413(Class23_Sub4.aSignLink_3734,
					(byte) -7);
		}
	    }
	    if (arg3 == 3 && Class74.aFrame1014 == null)
		method446(-1, arg1, true, Class91.anInt1184, true, -1);
	    else {
		java.awt.Container container;
		if (Class74.aFrame1014 != null) {
		    Class166.anInt2204 = arg0;
		    container = Class74.aFrame1014;
		    Class131_Sub41_Sub15.anInt6355 = arg5;
		} else if (Class158.aFrame2095 == null) {
		    container = Class23_Sub4.aSignLink_3734.anApplet2883;
		    Class166.anInt2204 = container.getSize().width;
		    Class131_Sub41_Sub15.anInt6355
			= container.getSize().height;
		} else {
		    Insets insets = Class158.aFrame2095.getInsets();
		    Class166.anInt2204 = (Class158.aFrame2095.getSize().width
					  - (insets.right + insets.left));
		    Class131_Sub41_Sub15.anInt6355
			= (Class158.aFrame2095.getSize().height - insets.top
			   - insets.bottom);
		    container = Class158.aFrame2095;
		}
		if (arg3 != 1) {
		    if ((Class1_Sub4.anInt3554 ^ 0xffffffff) > -97
			&& (Stream.anInt4299 ^ 0xffffffff) == -1) {
			int i = ((Class166.anInt2204 ^ 0xffffffff) < -1025
				 ? 1024 : Class166.anInt2204);
			int i_2_ = (Class131_Sub41_Sub15.anInt6355 <= 768
				    ? Class131_Sub41_Sub15.anInt6355 : 768);
			Class131_Sub1_Sub1.anInt5499 = i;
			Class71.anInt946 = (Class166.anInt2204 + -i) / 2;
			Class57.anInt750 = 0;
			Class218.anInt3201 = i_2_;
		    } else {
			Class71.anInt946 = 0;
			Class131_Sub1_Sub1.anInt5499 = Class166.anInt2204;
			Class218.anInt3201 = Class131_Sub41_Sub15.anInt6355;
			Class57.anInt750 = 0;
		    }
		} else {
		    Class131_Sub1_Sub1.anInt5499 = 765;
		    Class218.anInt3201 = 503;
		    Class71.anInt946 = (-765 + Class166.anInt2204) / 2;
		    Class57.anInt750 = 0;
		}
		if ((Class1_Sub7.anInt3581 ^ 0xffffffff) != -1) {
		    if ((Class131_Sub1_Sub1.anInt5499 ^ 0xffffffff) > -1025
			&& (Class218.anInt3201 ^ 0xffffffff) > -769) {
			/* empty */
		    }
		}
		if (arg4)
		    Class131_Sub2_Sub38.method1644(Stream.anInt4299,
						   -61);
		else {
		    Class131_Sub2_Sub15.aCanvas5768.setSize((Class131_Sub1_Sub1
							     .anInt5499),
							    (Class218
							     .anInt3201));
		    if (Class183_Sub1.aClass130_4960 != null)
			Class183_Sub1.aClass130_4960.method1221();
		    if (Class158.aFrame2095 != container)
			Class131_Sub2_Sub15.aCanvas5768
			    .setLocation(Class71.anInt946, Class57.anInt750);
		    else {
			Insets insets = Class158.aFrame2095.getInsets();
			Class131_Sub2_Sub15.aCanvas5768.setLocation
			    (Class71.anInt946 + insets.left,
			     Class57.anInt750 + insets.top);
		    }
		}
		if (arg3 >= 2)
		    Class85.aBoolean1104 = true;
		else
		    Class85.aBoolean1104 = false;
		if ((Class187.anInt2674 ^ 0xffffffff) != 0)
		    Class120_Sub2.method1036(-123, true);
		if (Class128_Sub1.aClass33_4013 != null
		    && (Class133.anInt1803 == 30 || Class133.anInt1803 == 25))
		    Class74.method759(-116);
		for (int i = 0; i < 100; i++)
		    Class131_Sub41_Sub16.aBooleanArray6371[i] = true;
		Class151.aBoolean2011 = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static int method447(int arg0, int arg1) {
	if (Class218.anIntArrayArray3197 != null)
	    return Class218.anIntArrayArray3197[arg0][arg1] >>> 21 & 0x7f8;
	return 0;
    }
    
    public void method448(int arg0) throws IOException {
	if (arg0 == -24448) {
	    anInt461++;
	    if (!aBoolean464) {
		if (aBoolean475) {
		    aBoolean475 = false;
		    throw new IOException();
		}
	    }
	}
    }
    
    public void run() {
	try {
	    try {
		for (;;) {
		    int i;
		    int i_3_;
		    synchronized (this) {
			if ((anInt478 ^ 0xffffffff)
			    == (anInt459 ^ 0xffffffff)) {
			    if (aBoolean464)
				break;
			    try {
				this.wait();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
			if (anInt459 >= anInt478)
			    i = -anInt478 + anInt459;
			else
			    i = 5000 + -anInt478;
			i_3_ = anInt478;
		    }
		    if ((i ^ 0xffffffff) < -1) {
			try {
			    anOutputStream468.write(aByteArray463, i_3_, i);
			} catch (IOException ioexception) {
			    aBoolean475 = true;
			}
			anInt478 = (i + anInt478) % 5000;
			try {
			    if ((anInt459 ^ 0xffffffff)
				== (anInt478 ^ 0xffffffff))
				anOutputStream468.flush();
			} catch (IOException ioexception) {
			    aBoolean475 = true;
			}
		    }
		}
		try {
		    if (anInputStream470 != null)
			anInputStream470.close();
		    if (anOutputStream468 != null)
			anOutputStream468.close();
		    if (aSocket466 != null)
			aSocket466.close();
		} catch (IOException ioexception) {
		    /* empty */
		}
		aByteArray463 = null;
	    } catch (Exception exception) {
		Class45.method563(null, exception, 0);
	    }
	    anInt479++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.run(" + ')');
	}
    }
    
    public static void method449(byte arg0) {
	aStringArray476 = null;
	aClass214_481 = null;
	aString457 = null;
	aClass173_465 = null;
	anIntArray455 = null;
	if (arg0 != 18)
	    aBoolean471 = false;
    }
    
    public int method450(byte arg0) throws IOException {
	try {
	    if (arg0 != 17)
		return -25;
	    anInt474++;
	    if (aBoolean464)
		return 0;
	    return anInputStream470.available();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.E(" + arg0 + ')');
	}
    }
    
    public void method451(int arg0, int arg1, byte[] arg2, int arg3)
	throws IOException {
	try {
	    if (arg0 <= 47)
		method453(87, -97, -51, null);
	    anInt456++;
	    if (!aBoolean464) {
		int i;
		for (/**/; arg3 > 0; arg3 -= i) {
		    i = anInputStream470.read(arg2, arg1, arg3);
		    if (i <= 0)
			throw new EOFException();
		    arg1 += i;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.J(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public void method452(int arg0) {
	try {
	    anInt472++;
	    if (!aBoolean464) {
		synchronized (this) {
		    if (arg0 != -1)
			aClass139_483 = null;
		    aBoolean464 = true;
		    this.notifyAll();
		}
		if (aClass139_483 != null) {
		    while ((aClass139_483.anInt1864 ^ 0xffffffff) == -1)
			Class187.method2575(arg0 + -96, 1L);
		    if ((aClass139_483.anInt1864 ^ 0xffffffff) == -2) {
			try {
			    ((Thread) aClass139_483.anObject1866).join();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		}
		aClass139_483 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.B(" + arg0 + ')');
	}
    }
    
    public static Class131_Sub41_Sub1 method453(int arg0, int arg1, int arg2,
						Class158 arg3) {
	try {
	    anInt453++;
	    Stream stream
		= new Stream(arg3.method2364(arg1, arg2, arg0));
	    Class131_Sub41_Sub1 class131_sub41_sub1
		= new Class131_Sub41_Sub1(arg1,
					  stream.readString(false),
					  stream.readString(false),
					  stream.readUnsignedInt(-2),
					  stream.readUnsignedInt(-2),
					  (stream.readUnsignedByte(arg0 + 74)
					   ^ 0xffffffff) == -2,
					  stream
					      .readUnsignedByte(arg0 ^ ~0x16));
	    int i = stream.readUnsignedByte(-29);
	    for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
		class131_sub41_sub1.aClass119_6172.method1018
		    ((byte) -122,
		     new Class131_Sub6(stream.readUnsignedByte(-23),
				       stream.readUnsignedShort(arg0 + 8104),
				       stream.readUnsignedShort(8104),
				       stream.readUnsignedShort(arg0 + 8104),
				       stream.readUnsignedShort(8104),
				       stream.readUnsignedShort(8104),
				       stream.readUnsignedShort(8104),
				       stream
					   .readUnsignedShort(arg0 ^ 0x1fa8),
				       stream.readUnsignedShort(8104)));
	    class131_sub41_sub1.method1924((byte) -87);
	    return class131_sub41_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method454(int arg0, int arg1, int arg2, byte[] arg3)
	throws IOException {
	try {
	    anInt462++;
	    if (!aBoolean464) {
		if (aBoolean475) {
		    aBoolean475 = false;
		    throw new IOException();
		}
		if (aByteArray463 == null)
		    aByteArray463 = new byte[5000];
		synchronized (this) {
		    for (int i = 0; (i ^ 0xffffffff) > (arg1 ^ 0xffffffff);
			 i++) {
			aByteArray463[anInt459] = arg3[i + arg2];
			anInt459 = (1 + anInt459) % 5000;
			if (((4900 + anInt478) % 5000 ^ 0xffffffff)
			    == (anInt459 ^ 0xffffffff))
			    throw new IOException();
		    }
		    if (aClass139_483 == null)
			aClass139_483
			    = aSignLink_458.method2692((byte) 107, this, 3);
		    this.notifyAll();
		    if (arg0 <= 29)
			aSignLink_458 = null;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method455(int arg0) {
	try {
	    if (arg0 <= 116)
		method443(93);
	    anInt482++;
	    if (!aBoolean464) {
		anInputStream470 = new InputStream_Sub1();
		anOutputStream468 = new OutputStream_Sub1();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"db.F(" + arg0 + ')');
	}
    }
    
    public Class33(Socket arg0, SignLink arg1) throws IOException {
	anInt459 = 0;
	anInt478 = 0;
	aBoolean475 = false;
	try {
	    aSocket466 = arg0;
	    aSignLink_458 = arg1;
	    aSocket466.setSoTimeout(30000);
	    aSocket466.setTcpNoDelay(true);
	    anInputStream470 = aSocket466.getInputStream();
	    anOutputStream468 = aSocket466.getOutputStream();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("db.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aClass173_465 = null;
	aBoolean471 = false;
	anInt469 = 0;
	anInt480 = 0;
	aClass214_481 = new Class214(4);
    }
}
