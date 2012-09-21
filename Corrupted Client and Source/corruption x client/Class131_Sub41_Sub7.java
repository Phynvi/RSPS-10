/* Class131_Sub41_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub7 extends Class131_Sub41
{
    public static int anInt6248;
    public int anInt6249 = 0;
    public static int anInt6250;
    public static Class75 aClass75_6251;
    public static int anInt6252;
    public static String[] aStringArray6253;
    public static Class158 aClass158_6254;
    public static boolean aBoolean6255 = false;
    public static int anInt6256;
    public static int anInt6257;
    
    public static void method1969(int arg0) {
	aClass75_6251 = null;
	aClass158_6254 = null;
	aStringArray6253 = null;
	if (arg0 < 117)
	    aStringArray6253 = null;
    }
    
    public static void method1970(byte arg0, int[] arg1, int[] arg2,
				  int[] arg3, Class23_Sub4_Sub1_Sub1 arg4) {
	try {
	    anInt6248++;
	    if (arg0 != 18)
		method1969(75);
	    for (int i = 0; (arg1.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_0_ = arg1[i];
		int i_1_ = arg2[i];
		int i_2_ = arg3[i];
		for (int i_3_ = 0;
		     ((i_1_ ^ 0xffffffff) != -1
		      && i_3_ < arg4.aClass141Array5313.length);
		     i_1_ >>>= 1) {
		    if ((i_1_ & 0x1 ^ 0xffffffff) != -1) {
			if ((i_0_ ^ 0xffffffff) != 0) {
			    Class161 class161
				= Class145.method2159(i_0_, (byte) -91);
			    int i_4_ = class161.anInt2155;
			    Class141 class141 = arg4.aClass141Array5313[i_3_];
			    if (class141 != null) {
				if (i_0_ == class141.anInt1881) {
				    if ((i_4_ ^ 0xffffffff) == -1)
					class141
					    = arg4.aClass141Array5313[i_3_]
					    = null;
				    else if ((i_4_ ^ 0xffffffff) != -2) {
					if ((i_4_ ^ 0xffffffff) == -3)
					    class141.anInt1877 = 0;
				    } else {
					class141.anInt1884 = 0;
					class141.anInt1877 = 0;
					class141.anInt1878 = 1;
					class141.anInt1880 = i_2_;
					class141.anInt1879 = 0;
					Login.method1153(arg4.anInt3733,
							    21155, false, 0,
							    arg4.anInt3747,
							    class161);
				    }
				} else if ((class161.anInt2142 ^ 0xffffffff)
					   <= ((Class145.method2159
						(class141.anInt1881,
						 (byte) -95)
						.anInt2142)
					       ^ 0xffffffff))
				    class141
					= arg4.aClass141Array5313[i_3_] = null;
			    }
			    if (class141 == null) {
				class141 = arg4.aClass141Array5313[i_3_]
				    = new Class141();
				class141.anInt1884 = 0;
				class141.anInt1877 = 0;
				class141.anInt1879 = 0;
				class141.anInt1878 = 1;
				class141.anInt1881 = i_0_;
				class141.anInt1880 = i_2_;
				Login.method1153(arg4.anInt3733, 21155,
						    false, 0, arg4.anInt3747,
						    class161);
			    }
			} else
			    arg4.aClass141Array5313[i_3_] = null;
		    }
		    i_3_++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ib.B(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static Class66 method1971(int arg0, int arg1) {
	try {
	    if (arg1 < 32)
		method1973((byte) 29, 30);
	    anInt6256++;
	    Class66 class66;
	    synchronized (Class56.aClass214_731) {
		class66
		    = (Class66) Class56.aClass214_731.method2780(120,
								 (long) arg0);
	    }
	    if (class66 != null)
		return class66;
	    byte[] is = (Class23_Sub4_Sub1_Sub1.aClass158_6475.method2364
			 (Class76.method769((byte) 122, arg0),
			  Class131_Sub41_Sub9.method1987(15443, arg0), 0));
	    class66 = new Class66();
	    class66.anInt900 = arg0;
	    if (is != null)
		class66.method699(-114, new Stream(is));
	    class66.method694(16172);
	    synchronized (Class56.aClass214_731) {
		Class56.aClass214_731.method2773(true, class66, (long) arg0);
	    }
	    return class66;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ib.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1972(int arg0, int arg1, Stream arg2) {
	try {
	    if (arg0 == -17821) {
		if ((arg1 ^ 0xffffffff) == -3)
		    anInt6249 = arg2.readUnsignedShort(8104);
		anInt6257++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ib.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1973(byte arg0, int arg1) {
	try {
	    anInt6250++;
	    Class165.anInt2200 = -1;
	    int i = 25 / ((arg0 - -63) / 32);
	    Class131_Sub7.anInt4173 = 3;
	    Class131_Sub41_Sub17.anInt6390 = arg1;
	    Class151.anInt2019 = 100;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ib.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1974(Stream arg0, int arg1) {
	try {
	    if (arg1 != -1)
		method1973((byte) 96, -90);
	    for (;;) {
		int i = arg0.readUnsignedByte(97);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method1972(-17821, i, arg0);
	    }
	    anInt6252++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ib.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
}
