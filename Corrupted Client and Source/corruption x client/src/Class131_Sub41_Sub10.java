/* Class131_Sub41_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub10 extends Class131_Sub41
{
    public static int anInt6286;
    public static int anInt6287;
    public static int anInt6288;
    public Class195[] aClass195Array6289;
    public int anInt6290;
    public static int anInt6291;
    public static int anInt6292;
    public static int anInt6293 = 1;
    public static int anInt6294;
    public byte[][] aByteArrayArray6295;
    public static byte[] aByteArray6296 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    
    public boolean method1992(int arg0, int arg1) {
	try {
	    anInt6286++;
	    if (arg0 != 65280)
		method1998(26);
	    return aClass195Array6289[arg1].aBoolean2854;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kj.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1993(int arg0, Class130 arg1, Class158 arg2) {
	try {
	    anInt6288++;
	    if (!Class23_Sub2.aBoolean3713) {
		arg1.method1191(0);
		Class82.aClass152_1088
		    = arg1.method1178(Class124.method1082(arg2,
							  Class199.anInt2909),
				      true);
		Class82.aClass152_1088.method2211((Class131_Sub1_Sub1.anInt5499
						   - Class82.aClass152_1088
							 .method2216()) / 2,
						  (Class218.anInt3201
						   - Class82.aClass152_1088
							 .method2198()) / 2);
		Class131_Sub2_Sub3.aClass152_5589
		    = arg1.method1178(Class124.method1082(arg2,
							  (Class131_Sub41_Sub1
							   .anInt6168)),
				      true);
		Class131_Sub2_Sub3.aClass152_5589.method2211
		    ((Class131_Sub1_Sub1.anInt5499
		      + -Class131_Sub2_Sub3.aClass152_5589.method2216()) / 2,
		     18);
		if (arg0 >= -122)
		    method1993(41, null, null);
		Class23_Sub2.aBoolean3713 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kj.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1994(int arg0) {
	try {
	    Class131_Sub2_Sub9.aClass173ArrayArray5684
		= (new Class173[Class150.aClass158_1994.method2361((byte) 126)]
		   []);
	    anInt6291++;
	    if (arg0 != 0)
		anInt6293 = -92;
	    Class67.aBooleanArray913
		= new boolean[Class150.aClass158_1994.method2361((byte) 47)];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kj.D(" + arg0 + ')');
	}
    }
    
    public boolean method1995(byte arg0, int arg1) {
	try {
	    anInt6294++;
	    if (arg0 != 0)
		return true;
	    return aClass195Array6289[arg1].aBoolean2845;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kj.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method1996(int arg0) {
	try {
	    anInt6287++;
	    if (aClass195Array6289 != null)
		return true;
	    if (aByteArrayArray6295 == null) {
		if (!Class131_Sub41_Sub13.aClass158_6322.method2367(anInt6290,
								    (byte) 42))
		    return false;
		int[] is = Class131_Sub41_Sub13.aClass158_6322
			       .method2349((byte) -114, anInt6290);
		aByteArrayArray6295 = new byte[is.length][];
		for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    aByteArrayArray6295[i]
			= Class131_Sub41_Sub13.aClass158_6322
			      .method2364(is[i], anInt6290, 0);
	    }
	    boolean bool = true;
	    for (int i = 0; i < aByteArrayArray6295.length; i++) {
		byte[] is = aByteArrayArray6295[i];
		int i_0_ = 0xff & is[1] | 0xff00 & is[0] << 1212433352;
		bool &= Class100.aClass158_1324.method2343(-116, i_0_);
	    }
	    if (!bool)
		return false;
	    if (arg0 != 1)
		return true;
	    Class119 class119 = new Class119();
	    int i = Class131_Sub41_Sub13.aClass158_6322.method2368(anInt6290,
								   (byte) -72);
	    aClass195Array6289 = new Class195[i];
	    int[] is
		= Class131_Sub41_Sub13.aClass158_6322.method2349((byte) -114,
								 anInt6290);
	    for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
		byte[] is_2_ = aByteArrayArray6295[i_1_];
		int i_3_ = is_2_[0] << 221024264 & 0xff00 | is_2_[1] & 0xff;
		Class131_Sub17 class131_sub17 = null;
		for (Class131_Sub17 class131_sub17_4_
			 = (Class131_Sub17) class119.method1007(0);
		     class131_sub17_4_ != null;
		     class131_sub17_4_
			 = (Class131_Sub17) class119.method1014(0)) {
		    if (i_3_ == class131_sub17_4_.anInt4373) {
			class131_sub17 = class131_sub17_4_;
			break;
		    }
		}
		if (class131_sub17 == null) {
		    class131_sub17
			= new Class131_Sub17(i_3_, Class100.aClass158_1324
						       .method2358(i_3_, 37));
		    class119.method1018((byte) -128, class131_sub17);
		}
		aClass195Array6289[is[i_1_]]
		    = new Class195(is_2_, class131_sub17);
	    }
	    aByteArrayArray6295 = null;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kj.B(" + arg0 + ')');
	}
    }
    
    public static void method1997(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != -4791)
		method1998(-99);
	    Class131_Sub2_Sub13.anIntArray5735[arg0] = arg2;
	    anInt6292++;
	    Class131_Sub32 class131_sub32
		= ((Class131_Sub32)
		   Class50.aClass180_665.method2521(-104, (long) arg0));
	    if (class131_sub32 != null)
		class131_sub32.aLong4550 = 500L + Class208.method2749(-3913);
	    else {
		class131_sub32
		    = new Class131_Sub32(500L
					 + Class208.method2749(arg1 + 878));
		Class50.aClass180_665.method2523(false, (long) arg0,
						 class131_sub32);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kj.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub41_Sub10(int arg0) {
	try {
	    anInt6290 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kj.<init>(" + arg0 + ')');
	}
    }
    
    public static void method1998(int arg0) {
	try {
	    if (arg0 < 45)
		method1998(73);
	    aByteArray6296 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kj.E(" + arg0 + ')');
	}
    }
}
