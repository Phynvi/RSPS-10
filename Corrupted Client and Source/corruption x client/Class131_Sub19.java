/* Class131_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub19 extends Class131
{
    public Class131_Sub1_Sub2 aClass131_Sub1_Sub2_4391;
    public int anInt4392;
    public Class131_Sub1_Sub2 aClass131_Sub1_Sub2_4393;
    public int anInt4394;
    public int anInt4395;
    public int anInt4396;
    public static Class175 aClass175_4397 = new Class175();
    public Class23_Sub4_Sub1_Sub2 aClass23_Sub4_Sub1_Sub2_4398;
    public static int anInt4399;
    public static int anInt4400;
    public int anInt4401;
    public boolean aBoolean4402;
    public int anInt4403 = 0;
    public static String aString4404 = "Examine";
    public int anInt4405;
    public int anInt4406;
    public int anInt4407;
    public static int anInt4408;
    public static int anInt4409;
    public Class23_Sub4_Sub1_Sub1 aClass23_Sub4_Sub1_Sub1_4410;
    public int anInt4411;
    public static int anInt4412;
    public int anInt4413;
    public int[] anIntArray4414;
    public int anInt4415;
    public Class187 aClass187_4416;
    
    public static Class29 method1808(int arg0, boolean arg1) {
	try {
	    anInt4399++;
	    Class29 class29;
	    synchronized (Class169.aClass214_2267) {
		class29 = (Class29) Class169.aClass214_2267
					.method2780(126, (long) arg0);
		if (arg1 != false)
		    aClass175_4397 = null;
	    }
	    if (class29 != null)
		return class29;
	    byte[] is = (Class131_Sub17.aClass158_4376.method2364
			 (Class131_Sub2_Sub13.method1532(3676, arg0),
			  Class67.method708(-348018488, arg0), 0));
	    class29 = new Class29();
	    class29.anInt349 = arg0;
	    if (is != null)
		class29.method426(-126, new Stream(is));
	    class29.method429(128);
	    if ((class29.anInt318 ^ 0xffffffff) != 0)
		class29.method420(method1808(class29.anInt294, false), false,
				  method1808(class29.anInt318, arg1));
	    if (class29.anInt309 != -1)
		class29.method416(method1808(class29.anInt309, false),
				  method1808(class29.anInt361, false),
				  (byte) 100);
	    if (!Class131_Sub2_Sub34.aBoolean6033 && class29.aBoolean366) {
		class29.aStringArray311 = Class214.aStringArray3147;
		class29.aStringArray365 = Class125.aStringArray1637;
		class29.aString341 = Class189.aString2761;
		class29.aBoolean327 = false;
		class29.anIntArray336 = null;
		class29.anInt295 = 0;
	    }
	    synchronized (Class169.aClass214_2267) {
		Class169.aClass214_2267.method2773(true, class29, (long) arg0);
	    }
	    return class29;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ks.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1809(int arg0, boolean arg1, String arg2) {
	anInt4400++;
	Class131_Sub41_Sub6 class131_sub41_sub6
	    = Class131_Sub13.method1709(2, arg0, (byte) 1);
	class131_sub41_sub6.method1962(0);
	class131_sub41_sub6.aString6241 = arg2;
	if (arg1 != true)
	    aClass175_4397 = null;
    }
    
    public static void method1810(String arg0, byte arg1) {
	try {
	    int i = -125 % ((-50 - arg1) / 54);
	    anInt4408++;
	    if (arg0 != null) {
		String string = Class192.method2622((byte) 69, arg0);
		if (string != null) {
		    for (int i_0_ = 0; i_0_ < Class118.anInt1551; i_0_++) {
			String string_1_
			    = Class192.method2622((byte) 125,
						  (Class89.aStringArray3255
						   [i_0_]));
			if (string_1_ != null && string_1_.equals(string)) {
			    Class118.anInt1551--;
			    for (int i_2_ = i_0_;
				 ((Class118.anInt1551 ^ 0xffffffff)
				  < (i_2_ ^ 0xffffffff));
				 i_2_++) {
				Class89.aStringArray3255[i_2_]
				    = Class89.aStringArray3255[1 + i_2_];
				Class18.aStringArray194[i_2_]
				    = Class18.aStringArray194[i_2_ + 1];
				Class23_Sub1_Sub1.aStringArray5090[i_2_]
				    = (Class23_Sub1_Sub1.aStringArray5090
				       [1 + i_2_]);
				Class215.aStringArray3159[i_2_]
				    = Class215.aStringArray3159[1 + i_2_];
				Class111.aBooleanArray3275[i_2_]
				    = Class111.aBooleanArray3275[i_2_ - -1];
			    }
			    Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
			    InputStream_Sub1.anInt62++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(30);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(Class131_Sub30.method1856((byte) -127, arg0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeString(arg0, (byte) -110);
			    break;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ks.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method1811(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    if (arg0 != -6459)
		return 89;
	    if ((0x1 & arg5 ^ 0xffffffff) == -2) {
		int i = arg3;
		arg3 = arg2;
		arg2 = i;
	    }
	    arg6 &= 0x3;
	    anInt4409++;
	    if (arg6 == 0)
		return arg1;
	    if (arg6 == 1)
		return 1 - (arg3 - -arg4) + 7;
	    if (arg6 == 2)
		return 7 + (-arg1 - -1 - arg2);
	    return arg4;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ks.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method1812(int arg0) {
	aString4404 = null;
	aClass175_4397 = null;
	if (arg0 < 76)
	    method1809(-51, true, null);
    }
    
    public void method1813(boolean arg0) {
	if (arg0 != true)
	    anInt4407 = 10;
	anInt4412++;
	int i = anInt4401;
	if (aClass187_4416 == null) {
	    if (aClass23_Sub4_Sub1_Sub1_4410 == null) {
		if (aClass23_Sub4_Sub1_Sub2_4398 != null) {
		    anInt4401
			= Class131_Sub2_Sub30
			      .method1615(aClass23_Sub4_Sub1_Sub2_4398, 10);
		    anInt4396 = aClass23_Sub4_Sub1_Sub2_4398.anInt6495;
		    anInt4394 = 128 * aClass23_Sub4_Sub1_Sub2_4398.anInt6517;
		}
	    } else {
		int i_3_
		    = Class220.method2825(18, aClass23_Sub4_Sub1_Sub1_4410);
		if (i_3_ != i) {
		    anInt4401 = i_3_;
		    Class66 class66
			= aClass23_Sub4_Sub1_Sub1_4410.aClass66_6474;
		    if (class66.anIntArray845 != null)
			class66 = class66.method697(true);
		    if (class66 != null) {
			anInt4396 = class66.anInt850;
			anInt4394 = 128 * class66.anInt875;
		    } else
			anInt4396 = anInt4394 = 0;
		}
	    }
	} else {
	    Class187 class187 = aClass187_4416.method2573(18);
	    if (class187 != null) {
		anInt4394 = class187.anInt2689 * 128;
		anIntArray4414 = class187.anIntArray2684;
		anInt4405 = class187.anInt2672;
		anInt4396 = class187.anInt2696;
		anInt4401 = class187.anInt2726;
		anInt4395 = class187.anInt2685;
	    } else {
		anIntArray4414 = null;
		anInt4394 = 0;
		anInt4401 = -1;
		anInt4405 = 0;
		anInt4395 = 0;
		anInt4396 = 0;
	    }
	}
	if ((anInt4401 ^ 0xffffffff) != (i ^ 0xffffffff)
	    && aClass131_Sub1_Sub2_4393 != null) {
	    Class78.aClass131_Sub1_Sub3_1057
		.method1441(aClass131_Sub1_Sub2_4393);
	    aClass131_Sub1_Sub2_4393 = null;
	}
    }
}
