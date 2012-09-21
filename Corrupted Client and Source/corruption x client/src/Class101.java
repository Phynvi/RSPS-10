/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101
{
    public static int anInt1327;
    public static String aString1328 = "wave2:";
    public static int anInt1329;
    public static int[] anIntArray1330 = { 1, 0, -1, 0 };
    public static int anInt1331;
    
    public static boolean method884(Class131_Sub41_Sub13 arg0, int arg1,
				    int arg2, int arg3, boolean[] arg4) {
	boolean bool = false;
	if (Class75.aClass68Array1023 != Class85.aClass68Array1116) {
	    int i
		= Class131_Sub2_Sub37.aClass68Array6057[arg1].method720(arg2,
									arg3);
	    int i_0_ = 0;
	    for (/**/; i_0_ <= arg1; i_0_++) {
		Class68 class68 = Class131_Sub2_Sub37.aClass68Array6057[i_0_];
		if (class68 != null) {
		    int i_1_ = i - class68.method720(arg2, arg3);
		    if (arg4 != null) {
			arg4[i_0_] = class68.method714(arg0, arg2, i_1_, arg3,
						       0, false);
			if (!arg4[i_0_])
			    continue;
		    }
		    class68.method709(arg0, arg2, i_1_, arg3, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    public static String method885(Stream arg0, int arg1) {
	try {
	    if (arg1 != 32767)
		return null;
	    anInt1331++;
	    return Class131_Sub2_Sub12.method1528(32767, arg0, arg1 + -32648);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kp.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static boolean method886(int arg0, int arg1, int arg2) {
	try {
	    anInt1329++;
	    if (arg1 != 4)
		aString1328 = null;
	    if (!Class131_Sub2_Sub24.aBoolean5890)
		return false;
	    int i = arg0 >> -1766289040;
	    int i_2_ = 0xffff & arg0;
	    if (Class131_Sub2_Sub9.aClass173ArrayArray5684[i] == null
		|| Class131_Sub2_Sub9.aClass173ArrayArray5684[i][i_2_] == null)
		return false;
	    Class173 class173
		= Class131_Sub2_Sub9.aClass173ArrayArray5684[i][i_2_];
	    if (arg2 != -1 || (class173.anInt2470 ^ 0xffffffff) != -1) {
		for (Class131_Sub21 class131_sub21
			 = ((Class131_Sub21)
			    Class66.aClass119_843.method1007(0));
		     class131_sub21 != null;
		     class131_sub21 = ((Class131_Sub21)
				       Class66.aClass119_843.method1014(0))) {
		    if (((class131_sub21.anInt4444 ^ 0xffffffff)
			 == (arg2 ^ 0xffffffff))
			&& class131_sub21.anInt4441 == class173.anInt2455
			&& ((class131_sub21.anInt4442 ^ 0xffffffff) == -23
			    || (class131_sub21.anInt4442 ^ 0xffffffff) == -1007
			    || (class131_sub21.anInt4442 ^ 0xffffffff) == -5
			    || (class131_sub21.anInt4442 ^ 0xffffffff) == -37
			    || class131_sub21.anInt4442 == 24))
			return true;
		}
	    } else {
		for (Class131_Sub21 class131_sub21
			 = ((Class131_Sub21)
			    Class66.aClass119_843.method1007(0));
		     class131_sub21 != null;
		     class131_sub21 = ((Class131_Sub21)
				       Class66.aClass119_843.method1014(0))) {
		    if ((class131_sub21.anInt4442 ^ 0xffffffff) == -23
			|| class131_sub21.anInt4442 == 1006
			|| class131_sub21.anInt4442 == 4
			|| (class131_sub21.anInt4442 ^ 0xffffffff) == -37
			|| class131_sub21.anInt4442 == 24) {
			for (Class173 class173_3_
				 = Class190.method2615((class131_sub21
							.anInt4441),
						       -64);
			     class173_3_ != null;
			     class173_3_
				 = Class131_Sub41_Sub1
				       .method1921(class173_3_, (byte) -85)) {
			    if ((class173.anInt2455 ^ 0xffffffff)
				== (class173_3_.anInt2455 ^ 0xffffffff))
				return true;
			}
		    }
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kp.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static int method887(int arg0, int arg1) {
	try {
	    arg1--;
	    anInt1327++;
	    arg1 |= arg1 >>> -1810941663;
	    if (arg0 != 1388313616)
		method887(101, -30);
	    arg1 |= arg1 >>> 2010624802;
	    arg1 |= arg1 >>> 10996420;
	    arg1 |= arg1 >>> 491045480;
	    arg1 |= arg1 >>> 1388313616;
	    return 1 + arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kp.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method888(boolean arg0) {
	try {
	    if (arg0 == true) {
		aString1328 = null;
		anIntArray1330 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kp.C(" + arg0 + ')');
	}
    }
}
