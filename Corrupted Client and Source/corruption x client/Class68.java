/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class68
{
    public static int anInt914;
    public static int anInt915;
    public int anInt916;
    public static int anInt917;
    public static int anInt918;
    public static int anInt919;
    public static boolean[][] aBooleanArrayArray920;
    public static int anInt921;
    public static int[] anIntArray922;
    public static boolean aBoolean923 = false;
    public int anInt924;
    public static int anInt925;
    
    public abstract void method709(Class131_Sub41_Sub13 class131_sub41_sub13,
				   int i, int i_0_, int i_1_, int i_2_,
				   boolean bool);
    
    public abstract void method710(int i, int i_3_, int i_4_, int i_5_,
				   int i_6_, int i_7_, int i_8_,
				   boolean[][] bools);
    
    public abstract void method711(int i, int i_9_, int i_10_,
				   boolean[][] bools, boolean bool);
    
    public abstract int method712(int i, int i_11_);
    
    public abstract void method713();
    
    public abstract boolean method714
	(Class131_Sub41_Sub13 class131_sub41_sub13, int i, int i_12_,
	 int i_13_, int i_14_, boolean bool);
    
    public abstract void method715(int i, int i_15_, int i_16_);
    
    public static void method716(byte arg0) {
	try {
	    anInt918++;
	    if (arg0 <= 81)
		method725(11);
	    Class71.aClass214_944.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gm.W(" + arg0 + ')');
	}
    }
    
    public static int method717(boolean arg0) {
	try {
	    anInt914++;
	    if (Class131_Sub2_Sub24.aBoolean5890 || Class147.anInt1946 <= 0) {
		int i = Class144.anInt1914;
		int i_17_ = Class23_Sub4_Sub3.anInt5005;
		int i_18_ = Class131_Sub1_Sub4.anInt5537;
		int i_19_ = Class40.anInt525;
		int i_20_ = Class89.anInt3268;
		if (i_18_ < i
		    && (i ^ 0xffffffff) > (i_18_ + i_20_ ^ 0xffffffff)) {
		    int i_21_ = -1;
		    for (int i_22_ = 0; i_22_ < Class147.anInt1946; i_22_++) {
			if (Class131_Sub2_Sub28.aBoolean5961) {
			    int i_23_ = 33 + (i_19_ - -((Class147.anInt1946
							 - (1 + i_22_))
							* 16));
			    if ((i_17_ ^ 0xffffffff) < (-13 + i_23_
							^ 0xffffffff)
				&& i_23_ + 3 >= i_17_)
				i_21_ = i_22_;
			} else {
			    int i_24_
				= ((Class147.anInt1946 - (1 + i_22_)) * 16
				   + (31 + i_19_));
			    if ((i_17_ ^ 0xffffffff) < (-13 + i_24_
							^ 0xffffffff)
				&& i_24_ + 3 >= i_17_)
				i_21_ = i_22_;
			}
		    }
		    if ((i_21_ ^ 0xffffffff) != 0) {
			int i_25_ = 0;
			Class193 class193
			    = new Class193(Class66.aClass119_843);
			for (Class131_Sub21 class131_sub21
				 = ((Class131_Sub21)
				    class193.method2626((byte) -111));
			     class131_sub21 != null;
			     class131_sub21 = ((Class131_Sub21)
					       class193.method2627(-25293))) {
			    if (i_25_++ == i_21_)
				return class131_sub21.anInt4436;
			}
		    }
		}
	    } else {
		if (!Class209.aBoolean3044
		    || !Class131_Sub2_Sub39.aBooleanArray6080[81]
		    || (Class147.anInt1946 ^ 0xffffffff) >= -3)
		    return (((Class131_Sub21) (Class66.aClass119_843
					       .aClass131_1553.aClass131_1786))
			    .anInt4436);
		return (((Class131_Sub21) (Class66.aClass119_843.aClass131_1553
					   .aClass131_1786.aClass131_1786))
			.anInt4436);
	    }
	    if (arg0 != true)
		method722(-73, -26, -50, -98, null, null, -127);
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gm.CA(" + arg0 + ')');
	}
    }
    
    public static void method718(int arg0) {
	try {
	    anInt925++;
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
		.method1794(arg0 + -3828);
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readBits(1, false);
	    if (i != 0) {
		int i_26_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(2, false);
		if (i_26_ == 0)
		    Class128_Sub1.anIntArray4019[Class202.anInt2943++] = 2047;
		else if (i_26_ == 1) {
		    int i_27_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readBits(3, false);
		    Class166.aClass23_Sub4_Sub1_Sub2_2216.method339(i_27_,
								    true, 1);
		    int i_28_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readBits(1, false);
		    if ((i_28_ ^ 0xffffffff) == -2)
			Class128_Sub1.anIntArray4019[Class202.anInt2943++]
			    = 2047;
		} else {
		    if (arg0 != 3943)
			method722(-70, -116, -14, -120, null, null, -30);
		    if (i_26_ == 2) {
			if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(1, false)
			    == 1) {
			    int i_29_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    Class166.aClass23_Sub4_Sub1_Sub2_2216
				.method339(i_29_, true, 2);
			    int i_30_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    Class166.aClass23_Sub4_Sub1_Sub2_2216
				.method339(i_30_, true, 2);
			} else {
			    int i_31_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    Class166.aClass23_Sub4_Sub1_Sub2_2216
				.method339(i_31_, true, 0);
			}
			int i_32_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			if ((i_32_ ^ 0xffffffff) == -2)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= 2047;
		    } else if ((i_26_ ^ 0xffffffff) == -4) {
			int i_33_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			if (i_33_ == 1)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= 2047;
			Class29.anInt300
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readBits(2, false);
			int i_34_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			int i_35_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(7, false);
			int i_36_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(7, false);
			Class166.aClass23_Sub4_Sub1_Sub2_2216.method358
			    ((i_34_ ^ 0xffffffff) == -2, true, i_36_,
			     Class29.anInt300, i_35_);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gm.AA(" + arg0 + ')');
	}
    }
    
    public abstract void method719(Class131_Sub8 class131_sub8, int[] is);
    
    public abstract int method720(int i, int i_37_);
    
    public abstract void method721(Class131_Sub41_Sub13 class131_sub41_sub13,
				   int i, int i_38_, int i_39_, int i_40_,
				   boolean bool);
    
    public static void method722(int arg0, int arg1, int arg2, int arg3,
				 Class130 arg4, Interface4 arg5, int arg6) {
	do {
	    try {
		anInt915++;
		if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff) > -101)
		    Class166.method2419(arg5, arg4, -4648);
		arg4.method1188(arg1, arg2, arg1 + arg0, arg2 + arg6);
		if (Class131_Sub2_Sub36.anInt6049 < 100) {
		    int i = 20;
		    int i_41_ = arg1 + arg0 / 2;
		    arg4.method1173(arg1, arg2, arg0, arg6, -16777216, 0);
		    int i_42_ = -18 + arg6 / 2 + arg2 + -i;
		    arg4.method1168(i_41_ - 152, i_42_, 304, 34,
				    Class207.aColorArray3029
					[Class131_Sub2_Sub21.anInt5848]
					.getRGB(),
				    0);
		    arg4.method1173(-150 + i_41_, i_42_ - -2,
				    3 * Class131_Sub2_Sub36.anInt6049, 30,
				    Class31.aColorArray388
					[Class131_Sub2_Sub21.anInt5848]
					.getRGB(),
				    0);
		    Class93.aClass44_1222.method528((byte) 121, -1,
						    Class131_Sub3.aString4111,
						    Class1_Sub7_Sub1
							.aColorArray5221
							[(Class131_Sub2_Sub21
							  .anInt5848)]
							.getRGB(),
						    i_41_, i + i_42_);
		} else {
		    int i = (-(int) ((float) arg0 / Class127.aFloat1711)
			     + Class131_Sub31.anInt4532);
		    int i_43_ = ((int) ((float) arg6 / Class127.aFloat1711)
				 + Class197.anInt2875);
		    if (arg3 < -116) {
			int i_44_
			    = (Class131_Sub31.anInt4532
			       + (int) ((float) arg0 / Class127.aFloat1711));
			client.anInt3485
			    = (-(int) ((float) arg6 / Class127.aFloat1711)
			       + Class197.anInt2875);
			Class131_Sub41.anInt4673
			    = (Class131_Sub31.anInt4532
			       + -(int) ((float) arg0 / Class127.aFloat1711));
			Class190.anInt2813
			    = (int) ((float) (arg0 * 2) / Class127.aFloat1711);
			Class12.anInt131
			    = (int) ((float) (2 * arg6) / Class127.aFloat1711);
			int i_45_
			    = (-(int) ((float) arg6 / Class127.aFloat1711)
			       + Class197.anInt2875);
			Class127.method1123(Class127.anInt1725 + i,
					    Class127.anInt1728 + i_43_,
					    i_44_ - -Class127.anInt1725,
					    i_45_ - -Class127.anInt1728, arg1,
					    arg2, arg0 + arg1,
					    arg2 + arg6 - -1);
			Class127.method1118(arg4);
			Class119 class119 = Class127.method1115(arg4);
			RuntimeException_Sub1.method2836(true, arg4, 0,
							 class119, 0);
			if ((Class131_Sub7.anInt4173 ^ 0xffffffff) < -1) {
			    Class151.anInt2019--;
			    if (Class151.anInt2019 == 0) {
				Class131_Sub7.anInt4173--;
				Class151.anInt2019 = 20;
			    }
			}
			if (!Class165.aBoolean2201)
			    break;
			int i_46_ = -5 + arg0 + arg1;
			int i_47_ = -8 + (arg2 + arg6);
			Class184.aClass44_2633.method539(-1, (byte) -82, i_46_,
							 ("Fps:"
							  + (Class131_Sub43
							     .anInt4700)),
							 16776960, i_47_);
			i_47_ -= 15;
			Runtime runtime = Runtime.getRuntime();
			int i_48_ = (int) ((runtime.totalMemory()
					    + -runtime.freeMemory())
					   / 1024L);
			int i_49_ = 16776960;
			if ((i_48_ ^ 0xffffffff) < -65537)
			    i_49_ = 16711680;
			Class184.aClass44_2633.method539(-1, (byte) -74, i_46_,
							 "Mem:" + i_48_ + "k",
							 i_49_, i_47_);
			i_47_ -= 15;
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("gm.U(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + arg3 + ','
						     + (arg4 != null ? "{...}"
							: "null")
						     + ','
						     + (arg5 != null ? "{...}"
							: "null")
						     + ',' + arg6 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public abstract void method723
	(int i, int i_50_, int[] is, int[] is_51_, int[] is_52_, int[] is_53_,
	 int[] is_54_, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_,
	 int[] is_59_, int i_60_, int i_61_, boolean bool);
    
    public static void method724(int arg0, int arg1, int arg2,
				 Class23_Sub1 arg3, Class23_Sub1 arg4) {
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    == null)
	    Class1_Sub2.method101(arg0, arg1, arg2);
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub1_1966
	    = arg3;
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub1_1969
	    = arg4;
    }
    
    public static void method725(int arg0) {
	do {
	    try {
		anIntArray922 = null;
		aBooleanArrayArray920 = null;
		if (arg0 == -8657)
		    break;
		method716((byte) -32);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "gm.V(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public abstract void method726(int i, int i_62_, int[] is, int[] is_63_,
				   int[] is_64_, int[] is_65_, int[] is_66_,
				   int[] is_67_, int[] is_68_, int i_69_,
				   int i_70_, boolean bool);
    
    public abstract void method727(int i, int i_71_);
    
    public abstract Class131_Sub41_Sub13 method728
	(int i, int i_72_, Class131_Sub41_Sub13 class131_sub41_sub13);
    
    public Class68(int arg0, int arg1) {
	try {
	    anInt924 = arg0;
	    anInt916 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gm.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    static {
	anIntArray922 = new int[] { 2047, 16383, 65535 };
	anInt919 = 0;
	anInt921 = 0;
    }
}
