/* Class131_Sub41_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub14 extends Class131_Sub41
{
    public static int anInt6332;
    public Class180 aClass180_6333;
    public static int anInt6334;
    public static int anInt6335;
    public static int anInt6336;
    public char aChar6337;
    public String aString6338 = "null";
    public static int anInt6339;
    public static int anInt6340;
    public static int anInt6341;
    public static int anInt6342;
    public static int anInt6343;
    public static int anInt6344;
    public char aChar6345;
    public static int anInt6346;
    public static int anInt6347;
    public Class180 aClass180_6348;
    public int anInt6349;
    
    public void method2021(int arg0, Stream arg1, int arg2) {
	try {
	    if (arg2 == 0) {
		if (arg0 == 1)
		    aChar6337
			= Class214.method2782(52, arg1.readSignedByte((byte) 127));
		else if ((arg0 ^ 0xffffffff) != -3) {
		    if ((arg0 ^ 0xffffffff) != -4) {
			if (arg0 == 4)
			    anInt6349 = arg1.readUnsignedInt(arg2 + -2);
			else if ((arg0 ^ 0xffffffff) == -6
				 || (arg0 ^ 0xffffffff) == -7) {
			    int i = arg1.readUnsignedShort(8104);
			    aClass180_6348
				= new Class180(Class101.method887(1388313616,
								  i));
			    for (int i_0_ = 0;
				 (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff);
				 i_0_++) {
				int i_1_ = arg1.readUnsignedInt(-2);
				Class131 class131;
				if (arg0 == 5)
				    class131 = (new Class131_Sub29
						(arg1.readString(false)));
				else
				    class131 = (new Class131_Sub24
						(arg1.readUnsignedInt(-2)));
				aClass180_6348.method2523(false, (long) i_1_,
							  class131);
			    }
			}
		    } else
			aString6338 = arg1.readString(false);
		} else
		    aChar6345
			= Class214.method2782(44, arg1.readSignedByte((byte) 127));
		anInt6346++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method2022(byte arg0, String arg1) {
	try {
	    anInt6336++;
	    if (aClass180_6348 == null)
		return false;
	    if (aClass180_6333 == null)
		method2023((byte) -99);
	    for (Class131_Sub4 class131_sub4
		     = ((Class131_Sub4)
			(aClass180_6333.method2521
			 (84,
			  Class131_Sub2_Sub1.method1477(arg0 ^ 0x67, arg1))));
		 class131_sub4 != null;
		 class131_sub4
		     = (Class131_Sub4) aClass180_6333.method2516(-1)) {
		if (class131_sub4.aString4132.equals(arg1))
		    return true;
	    }
	    if (arg0 != -104)
		anInt6349 = 20;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.K(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method2023(byte arg0) {
	aClass180_6333 = new Class180(aClass180_6348.method2525(arg0 + 179));
	anInt6342++;
	for (Class131_Sub29 class131_sub29
		 = (Class131_Sub29) aClass180_6348.method2520(0);
	     class131_sub29 != null;
	     class131_sub29 = (Class131_Sub29) aClass180_6348.method2518(0)) {
	    Class131_Sub4 class131_sub4
		= new Class131_Sub4(class131_sub29.aString4502,
				    (int) class131_sub29.aLong1791);
	    aClass180_6333.method2523
		(false,
		 Class131_Sub2_Sub1.method1477(-1, class131_sub29.aString4502),
		 class131_sub4);
	}
	if (arg0 != -99)
	    aClass180_6348 = null;
    }
    
    public static void method2024(int arg0) {
	anInt6335++;
	if (Class187.anInt2674 != -1) {
	    if (arg0 < 33)
		method2024(-35);
	    int i = Class144.anInt1914;
	    int i_2_ = Class23_Sub4_Sub3.anInt5005;
	    if (Class131_Sub23.anInt4458 != 0) {
		i_2_ = Class131_Sub11.anInt4246;
		i = Class207.anInt3022;
	    }
	    Class143.method2150(0, -121, 0, 0, 0, Class218.anInt3201, i_2_,
				Class131_Sub1_Sub1.anInt5499, i,
				Class187.anInt2674);
	    if (Class121_Sub3.aClass173_4000 != null)
		Class161.method2391(i_2_, 62, i);
	}
    }
    
    public void method2025(int arg0) {
	try {
	    aClass180_6333
		= new Class180(aClass180_6348.method2525(arg0 + -46));
	    anInt6341++;
	    if (arg0 == 4) {
		for (Class131_Sub24 class131_sub24
			 = (Class131_Sub24) aClass180_6348.method2520(0);
		     class131_sub24 != null;
		     class131_sub24
			 = (Class131_Sub24) aClass180_6348.method2518(0)) {
		    Class131_Sub24 class131_sub24_3_
			= new Class131_Sub24((int) class131_sub24.aLong1791);
		    aClass180_6333.method2523(false,
					      (long) class131_sub24.anInt4465,
					      class131_sub24_3_);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"of.G(" + arg0 + ')');
	}
    }
    
    public boolean method2026(int arg0, byte arg1) {
	try {
	    anInt6340++;
	    if (aClass180_6348 == null)
		return false;
	    if (aClass180_6333 == null)
		method2025(4);
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_6333.method2521(70, (long) arg0);
	    if (arg1 != 29)
		aChar6337 = 'R';
	    if (class131_sub24 == null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2027(int arg0, int arg1) {
	try {
	    anInt6339++;
	    synchronized (Class173.aClass214_2425) {
		Class173.aClass214_2425.method2786(0, arg0);
	    }
	    synchronized (Class153.aClass214_2040) {
		Class153.aClass214_2040.method2786(0, arg0);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		Class131_Sub2_Sub30.aClass214_5988.method2786(0, arg0);
	    }
	    synchronized (Class192.aClass214_2824) {
		Class192.aClass214_2824.method2786(0, arg0);
		int i = -92 % ((arg1 - 64) / 55);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public String method2028(byte arg0, int arg1) {
	try {
	    anInt6332++;
	    if (arg0 != -49)
		method2025(98);
	    if (aClass180_6348 == null)
		return aString6338;
	    Class131_Sub29 class131_sub29
		= ((Class131_Sub29)
		   aClass180_6348.method2521(arg0 + -4, (long) arg1));
	    if (class131_sub29 == null)
		return aString6338;
	    return class131_sub29.aString4502;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2029(int arg0, int arg1, Class150 arg2) {
	try {
	    if (arg0 != 0)
		method2027(49, 112);
	    if (Class100.aBoolean1325) {
		Class100.aBoolean1325 = false;
		arg1 = 0;
	    }
	    anInt6334++;
	    if (Class91.aClass150_1186 == null
		|| !Class91.aClass150_1186.method2186(arg2, (byte) -7)) {
		Class91.aClass150_1186 = arg2;
		Class1.aLong75 = Class208.method2749(-3913);
		Class131_Sub41_Sub17.anInt6391 = Class202.anInt2944 = arg1;
		if (Class131_Sub41_Sub17.anInt6391 == 0)
		    Class131_Sub2_Sub7.method1499(0);
		else {
		    Class69.aFloat929 = Class218.aFloat3198;
		    Class98.aFloat1290 = Class85.aFloat1105;
		    Class28.anInt289 = Class115.anInt1482;
		    Class187.aFloat2662 = Class149.aFloat1985;
		    Class173.anInt2460 = Class111.anInt3273;
		    Class155.aClass83_2065 = Class23_Sub1_Sub2.aClass83_5145;
		    PacketStream.aFloat6137
			= Class131_Sub41_Sub20.aFloat6429;
		    Class164.aFloat2191 = Class175.aFloat2498;
		    Class133.aFloat1801 = Class23_Sub5.aFloat3754;
		    Class131_Sub2_Sub4.anInt5597
			= Class131_Sub2_Sub26.anInt5927;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.F(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method2030(Stream arg0, int arg1) {
	try {
	    for (;;) {
		int i = arg0.readUnsignedByte(104);
		if (i == 0)
		    break;
		method2021(i, arg0, 0);
	    }
	    if (arg1 != -11607)
		method2027(-112, -14);
	    anInt6347++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static Class40 method2031(byte arg0, int arg1) {
	try {
	    anInt6344++;
	    Class40 class40;
	    synchronized (Class135.aClass214_1811) {
		class40 = (Class40) Class135.aClass214_1811
					.method2780(120, (long) arg1);
	    }
	    if (class40 != null)
		return class40;
	    byte[] is = Class28.aClass158_288.method2364(arg1, 3, 0);
	    class40 = new Class40();
	    if (arg0 >= -63)
		return null;
	    if (is != null)
		class40.method504(new Stream(is), false);
	    synchronized (Class135.aClass214_1811) {
		Class135.aClass214_1811.method2773(true, class40, (long) arg1);
	    }
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.J(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2032(int arg0, int arg1) {
	try {
	    if (arg1 <= 59)
		aString6338 = null;
	    anInt6343++;
	    if (aClass180_6348 == null)
		return anInt6349;
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_6348.method2521(105, (long) arg0);
	    if (class131_sub24 == null)
		return anInt6349;
	    return class131_sub24.anInt4465;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("of.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
