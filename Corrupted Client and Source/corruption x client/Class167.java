/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class167
{
    public static Class152[] aClass152Array2226;
    public static Class22_Sub1[] aClass22_Sub1Array2227 = new Class22_Sub1[29];
    public static int anInt2228;
    public static int anInt2229;
    public static int anInt2230;
    public static int anInt2231;
    public static int anInt2232;
    public static int anInt2233;
    public static int[][] anIntArrayArray2234
	= { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 },
	    { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 },
	    { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 },
	    { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 },
	    { 7, 7, 1, 2 } };
    public static boolean aBoolean2235;
    public static int[] anIntArray2236;
    public static int anInt2237;
    public static int anInt2238;
    
    public static void method2425(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = 88 % ((-11 - arg8) / 53);
	anInt2230++;
	if ((arg5 ^ 0xffffffff) <= -2 && (arg2 ^ 0xffffffff) <= -2
	    && -2 + Class131_Sub41_Sub11_Sub1.anInt6546 >= arg5
	    && (arg2 ^ 0xffffffff) >= (Class131_Sub2_Sub26.anInt5931 + -2
				       ^ 0xffffffff)) {
	    if ((Class9.method182((byte) -41)
		 || Class45.method561(arg5, true, arg2, arg0,
				      Class1_Sub8.anInt3600))
		&& Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
		int i_0_ = arg0;
		if (i_0_ < 3 && Class91.method843(arg2, (byte) 72, arg5))
		    i_0_++;
		Class131_Sub41_Sub4.method1943(arg1, arg5, arg0, (byte) -113,
					       Class183_Sub1.aClass130_4960,
					       i_0_,
					       (Class131_Sub2_Sub9
						.aClass19Array5682[arg0]),
					       arg2);
		if (arg6 >= 0) {
		    boolean bool = Class135.aBoolean1818;
		    Class135.aBoolean1818 = true;
		    Class145.method2168(false, arg6,
					Class183_Sub1.aClass130_4960,
					(byte) -91, i_0_,
					(Class131_Sub2_Sub9.aClass19Array5682
					 [arg0]),
					arg7, arg0, arg5, arg4, arg2, arg3,
					false);
		    Class135.aBoolean1818 = bool;
		}
	    }
	}
    }
    
    public static String method2426(boolean arg0, long arg1, boolean arg2,
				    int arg3, int arg4) {
	try {
	    anInt2228++;
	    char c = ',';
	    char c_1_ = '.';
	    if (arg3 == 0) {
		c = '.';
		c_1_ = ',';
	    }
	    if ((arg3 ^ 0xffffffff) == -3)
		c_1_ = '\u00a0';
	    boolean bool = arg2;
	    if (arg1 < 0L) {
		arg1 = -arg1;
		bool = true;
	    }
	    StringBuffer stringbuffer = new StringBuffer(26);
	    if ((arg4 ^ 0xffffffff) < -1) {
		for (int i = 0; i < arg4; i++) {
		    int i_2_ = (int) arg1;
		    arg1 /= 10L;
		    stringbuffer.append((char) (-((int) arg1 * 10)
						+ (i_2_ + 48)));
		}
		stringbuffer.append(c);
	    }
	    int i = 0;
	    for (;;) {
		int i_3_ = (int) arg1;
		arg1 /= 10L;
		stringbuffer.append((char) (-(10 * (int) arg1) + i_3_ + 48));
		if ((arg1 ^ 0xffffffffffffffffL) == -1L)
		    break;
		if (arg0 && ++i % 3 == 0)
		    stringbuffer.append(c_1_);
	    }
	    if (bool)
		stringbuffer.append('-');
	    return stringbuffer.reverse().toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rd.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2427(int arg0) {
	try {
	    synchronized (OutputStream_Sub1.aClass214_66) {
		OutputStream_Sub1.aClass214_66.method2775((byte) 56);
	    }
	    anInt2229++;
	    int i = 31 / ((61 - arg0) / 39);
	    synchronized (Class131_Sub2_Sub30.aClass214_5991) {
		Class131_Sub2_Sub30.aClass214_5991.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rd.G(" + arg0 + ')');
	}
    }
    
    public static void method2428(boolean arg0, Class158 arg1) {
	try {
	    if (arg0 != true)
		anIntArray2236 = null;
	    anInt2231++;
	    Class1_Sub7.aClass158_3589 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rd.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2429(byte arg0) {
	try {
	    int i = 116 / ((-32 - arg0) / 63);
	    anIntArray2236 = null;
	    aClass152Array2226 = null;
	    aClass22_Sub1Array2227 = null;
	    anIntArrayArray2234 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rd.E(" + arg0 + ')');
	}
    }
    
    public static void method2430(int arg0, boolean arg1) {
	for (Class131_Sub19 class131_sub19
		 = ((Class131_Sub19)
		    Class169.aClass119_2266.method1007(arg0 + -4));
	     class131_sub19 != null;
	     class131_sub19
		 = (Class131_Sub19) Class169.aClass119_2266.method1014(0)) {
	    if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
		Class78.aClass131_Sub1_Sub3_1057
		    .method1441(class131_sub19.aClass131_Sub1_Sub2_4393);
		class131_sub19.aClass131_Sub1_Sub2_4393 = null;
	    }
	    if (class131_sub19.aClass131_Sub1_Sub2_4391 != null) {
		Class78.aClass131_Sub1_Sub3_1057
		    .method1441(class131_sub19.aClass131_Sub1_Sub2_4391);
		class131_sub19.aClass131_Sub1_Sub2_4391 = null;
	    }
	    class131_sub19.method1355((byte) 120);
	}
	anInt2237++;
	if (arg0 != 4)
	    method2426(false, 55L, false, -37, -79);
	if (arg1) {
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub4.aClass119_4133.method1007(0));
		 class131_sub19 != null;
		 class131_sub19 = (Class131_Sub19) Class131_Sub4
						       .aClass119_4133
						       .method1014(0)) {
		if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
		    Class78.aClass131_Sub1_Sub3_1057
			.method1441(class131_sub19.aClass131_Sub1_Sub2_4393);
		    class131_sub19.aClass131_Sub1_Sub2_4393 = null;
		}
		class131_sub19.method1355((byte) 117);
	    }
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub23.aClass180_4460.method2520(0));
		 class131_sub19 != null;
		 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub23.aClass180_4460.method2518(0))) {
		if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
		    Class78.aClass131_Sub1_Sub3_1057
			.method1441(class131_sub19.aClass131_Sub1_Sub2_4393);
		    class131_sub19.aClass131_Sub1_Sub2_4393 = null;
		}
		class131_sub19.method1355((byte) 120);
	    }
	}
    }
    
    public static Class140 method2431(int arg0, int arg1) {
	try {
	    anInt2233++;
	    if ((arg1 ^ 0xffffffff) != -1) {
		if (arg1 != 1) {
		    if ((arg1 ^ 0xffffffff) == -3) {
			if ((double) Class127.aFloat1711 == 3.0)
			    return Class74.aClass140_1004;
			if ((double) Class127.aFloat1711 == 4.0)
			    return Class131_Sub2_Sub39.aClass140_6083;
			if ((double) Class127.aFloat1711 == 6.0)
			    return Class130.aClass140_1778;
			if ((double) Class127.aFloat1711 >= 8.0)
			    return Class63.aClass140_806;
		    }
		} else {
		    if ((double) Class127.aFloat1711 == 3.0)
			return Class67.aClass140_912;
		    if ((double) Class127.aFloat1711 == 4.0)
			return Class131_Sub25.aClass140_4478;
		    if ((double) Class127.aFloat1711 == 6.0)
			return Class74.aClass140_1004;
		    if ((double) Class127.aFloat1711 >= 8.0)
			return Class131_Sub2_Sub39.aClass140_6083;
		}
	    } else {
		if ((double) Class127.aFloat1711 == 3.0)
		    return Class131_Sub2_Sub15.aClass140_5776;
		if ((double) Class127.aFloat1711 == 4.0)
		    return Class125.aClass140_1630;
		if ((double) Class127.aFloat1711 == 6.0)
		    return Class67.aClass140_912;
		if ((double) Class127.aFloat1711 >= 8.0)
		    return Class131_Sub25.aClass140_4478;
	    }
	    if (arg0 >= -64)
		return null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rd.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	anInt2232 = 1;
	anIntArray2236 = new int[5];
	anInt2238 = 0;
    }
}
