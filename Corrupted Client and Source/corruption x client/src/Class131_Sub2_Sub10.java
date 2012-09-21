/* Class131_Sub2_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class131_Sub2_Sub10 extends Class131_Sub2
{
    public static int anInt5685;
    public static int anInt5686;
    public static int anInt5687;
    public static int anInt5688;
    public int anInt5689;
    public static int anInt5690;
    public static int anInt5691;
    public static int anInt5692;
    public static Class214 aClass214_5693 = new Class214(100);
    public int[] anIntArray5694;
    public int anInt5695 = -1;
    public static Class158 aClass158_5696;
    public static boolean aBoolean5697;
    public static String aString5698 = "Loaded textures";
    public static BigInteger aBigInteger5699;
    public int anInt5700;
    public static Class152[] aClass152Array5701;
    public static boolean aBoolean5702;
    public static int anInt5703;
    public static int[] anIntArray5704;
    public static int anInt5705;
    
    public static void method1513(Class23_Sub4_Sub1_Sub2 arg0, int arg1,
				  int arg2, Class23_Sub4_Sub1_Sub1 arg3,
				  boolean arg4, int arg5, Class187 arg6,
				  int arg7) {
	try {
	    if (arg4 != false)
		method1516(34);
	    anInt5688++;
	    Class131_Sub19 class131_sub19 = new Class131_Sub19();
	    class131_sub19.anInt4415 = 128 * arg7;
	    class131_sub19.anInt4407 = 128 * arg2;
	    class131_sub19.anInt4392 = arg5;
	    if (arg6 == null) {
		if (arg3 != null) {
		    class131_sub19.aClass23_Sub4_Sub1_Sub1_4410 = arg3;
		    Class66 class66 = arg3.aClass66_6474;
		    if (class66.anIntArray845 != null) {
			class131_sub19.aBoolean4402 = true;
			class66 = class66.method697(true);
		    }
		    if (class66 != null) {
			class131_sub19.anInt4411
			    = (arg7 + class66.anInt839) * 128;
			class131_sub19.anInt4413
			    = (arg2 - -class66.anInt839) * 128;
			class131_sub19.anInt4401
			    = Class220.method2825(74, arg3);
			class131_sub19.anInt4394 = class66.anInt875 * 128;
			class131_sub19.anInt4396 = class66.anInt850;
		    }
		    Class131_Sub4.aClass119_4133.method1018((byte) -121,
							    class131_sub19);
		} else if (arg0 != null) {
		    class131_sub19.aClass23_Sub4_Sub1_Sub2_4398 = arg0;
		    class131_sub19.anInt4411
			= (arg0.method335((byte) -36) + arg7) * 128;
		    class131_sub19.anInt4413
			= (arg2 - -arg0.method335((byte) -104)) * 128;
		    class131_sub19.anInt4401
			= Class131_Sub2_Sub30.method1615(arg0, 10);
		    class131_sub19.anInt4394 = arg0.anInt6517 * 128;
		    class131_sub19.anInt4396 = arg0.anInt6495;
		    Class131_Sub23.aClass180_4460.method2523
			(false, (long) arg0.anInt5274, class131_sub19);
		}
	    } else {
		class131_sub19.aClass187_4416 = arg6;
		int i = arg6.anInt2702;
		int i_0_ = arg6.anInt2668;
		if (arg1 == 1 || (arg1 ^ 0xffffffff) == -4) {
		    i_0_ = arg6.anInt2702;
		    i = arg6.anInt2668;
		}
		class131_sub19.anInt4405 = arg6.anInt2672;
		class131_sub19.anIntArray4414 = arg6.anIntArray2684;
		class131_sub19.anInt4395 = arg6.anInt2685;
		class131_sub19.anInt4401 = arg6.anInt2726;
		class131_sub19.anInt4413 = (arg2 - -i_0_) * 128;
		class131_sub19.anInt4394 = 128 * arg6.anInt2689;
		class131_sub19.anInt4396 = arg6.anInt2696;
		class131_sub19.anInt4411 = 128 * (arg7 - -i);
		if (arg6.anIntArray2653 != null) {
		    class131_sub19.aBoolean4402 = true;
		    class131_sub19.method1813(true);
		}
		if (class131_sub19.anIntArray4414 != null)
		    class131_sub19.anInt4406
			= (class131_sub19.anInt4405
			   + (int) ((double) (class131_sub19.anInt4395
					      + -class131_sub19.anInt4405)
				    * Math.random()));
		Class169.aClass119_2266.method1018((byte) -127,
						   class131_sub19);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ei.S(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ arg5 + ',' + (arg6 != null ? "{...}" : "null") + ','
			+ arg7 + ')'));
	}
    }
    
    public static void method1514(String arg0, byte arg1) {
	try {
	    anInt5686++;
	    if (arg0 != null) {
		int i = 101 % ((-8 - arg1) / 41);
		String string = Class192.method2622((byte) 84, arg0);
		if (string != null) {
		    for (int i_1_ = 0; Class33.anInt469 > i_1_; i_1_++) {
			String string_2_
			    = Class192.method2622((byte) 92,
						  (Class23_Sub2
						   .aStringArray3707[i_1_]));
			if (string_2_ != null && string_2_.equals(string)) {
			    Class33.anInt469--;
			    for (int i_3_ = i_1_;
				 ((i_3_ ^ 0xffffffff)
				  > (Class33.anInt469 ^ 0xffffffff));
				 i_3_++) {
				Class23_Sub2.aStringArray3707[i_3_]
				    = Class23_Sub2.aStringArray3707[1 + i_3_];
				Class131_Sub25.aStringArray4477[i_3_]
				    = (Class131_Sub25.aStringArray4477
				       [1 + i_3_]);
				Class143.anIntArray1906[i_3_]
				    = Class143.anIntArray1906[1 + i_3_];
				Class89.aStringArray3267[i_3_]
				    = Class89.aStringArray3267[i_3_ + 1];
				Class20.anIntArray234[i_3_]
				    = Class20.anIntArray234[i_3_ - -1];
				Class183_Sub1.aBooleanArray4952[i_3_]
				    = (Class183_Sub1.aBooleanArray4952
				       [i_3_ - -1]);
			    }
			    Class18.anInt190++;
			    Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(92);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(Class131_Sub30.method1856((byte) -106, arg0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeString(arg0, (byte) -120);
			    break;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ei.O("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg0 == 0)
		anInt5695 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	    if (arg1 != -49)
		anInt5689 = -7;
	    anInt5692++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ei.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method1515(int arg0) {
	try {
	    anInt5687++;
	    if (anIntArray5694 != null)
		return true;
	    if (arg0 <= anInt5695) {
		Class124 class124
		    = (Class104.anInt1365 < 0
		       ? Class124.method1082(Class131_Sub2_Sub9.aClass158_5683,
					     anInt5695)
		       : Class124.method1087(Class131_Sub2_Sub9.aClass158_5683,
					     Class104.anInt1365, anInt5695));
		class124.method1085();
		anIntArray5694 = class124.method1093();
		anInt5689 = class124.anInt1623;
		anInt5700 = class124.anInt1619;
		return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ei.R(" + arg0 + ')');
	}
    }
    
    public int method1456(byte arg0) {
	try {
	    anInt5685++;
	    if (arg0 <= 96)
		method1456((byte) 3);
	    return anInt5695;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ei.T(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2_Sub10() {
	super(0, false);
    }
    
    public void method1460(int arg0) {
	try {
	    anInt5691++;
	    super.method1460(arg0);
	    anIntArray5694 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ei.Q(" + arg0 + ')');
	}
    }
    
    public static void method1516(int arg0) {
	try {
	    aClass214_5693 = null;
	    aClass158_5696 = null;
	    anIntArray5704 = null;
	    aClass152Array5701 = null;
	    aBigInteger5699 = null;
	    if (arg0 >= -28)
		method1513(null, -76, 124, null, false, 11, null, -52);
	    aString5698 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ei.P(" + arg0 + ')');
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5690++;
	    int[][] is = aClass59_4097.method641(arg0, arg1 + -2);
	    if (aClass59_4097.aBoolean783 && method1515(0)) {
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		int i = ((anInt5700 == Class120_Sub2.anInt3975 ? arg0
			  : anInt5700 * arg0 / Class120_Sub2.anInt3975)
			 * anInt5689);
		if (Class131_Sub2_Sub7.anInt5637 != anInt5689) {
		    for (int i_7_ = 0;
			 ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
			  < (i_7_ ^ 0xffffffff));
			 i_7_++) {
			int i_8_
			    = anInt5689 * i_7_ / Class131_Sub2_Sub7.anInt5637;
			int i_9_ = anIntArray5694[i - -i_8_];
			is_6_[i_7_]
			    = Class90.method841(i_9_ << 218008868, 4080);
			is_5_[i_7_]
			    = Class90.method841(i_9_ >> -618356412, 4080);
			is_4_[i_7_]
			    = Class90.method841(i_9_ >> 232210892, 4080);
		    }
		} else {
		    for (int i_10_ = 0;
			 ((i_10_ ^ 0xffffffff)
			  > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			 i_10_++) {
			int i_11_ = anIntArray5694[i++];
			is_6_[i_10_]
			    = Class90.method841(4080, i_11_ << -2096290684);
			is_5_[i_10_]
			    = Class90.method841(i_11_ >> 794378756, 4080);
			is_4_[i_10_]
			    = Class90.method841(i_11_ >> 754905996, 4080);
		    }
		}
	    }
	    if (arg1 != 0)
		return null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ei.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aBoolean5697 = false;
	aBigInteger5699
	    = (new BigInteger
	       ("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
	aBoolean5702 = false;
	anInt5703 = 0;
	anIntArray5704 = new int[] { 1, 2, 4, 8 };
	anInt5705 = -1;
    }
}
