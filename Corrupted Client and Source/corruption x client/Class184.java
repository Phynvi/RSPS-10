/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class184
{
    public String aString2620;
    public static int anInt2621;
    public static int anInt2622;
    public static String aString2623;
    public static String aString2624 = "Alexscape 562 is loading - please wait... ffs";
    public static int anInt2625;
    public static Class131_Sub30 aClass131_Sub30_2626;
    public byte aByte2627;
    public String aString2628;
    public static int[] anIntArray2629;
    public static Class158 aClass158_2630;
    public static int anInt2631;
    public int anInt2632;
    public static Class44 aClass44_2633;
    public String aString2634;
    /*synthetic*/ public static Class aClass2635;
    
    public static void method2549(byte arg0, Class23_Sub4_Sub1 arg1) {
	anInt2621++;
	if (arg0 == 80) {
	    boolean bool = false;
	    if (arg1.anInt5245 != Class125.anInt1632
		&& (arg1.anInt5247 ^ 0xffffffff) != 0 && arg1.anInt5256 == 0) {
		Class161 class161
		    = Class145.method2159(arg1.anInt5247, (byte) -126);
		if (class161.aBoolean2159
		    || ((class161.anIntArray2153[arg1.anInt5248] ^ 0xffffffff)
			> (arg1.anInt5237 - -1 ^ 0xffffffff)))
		    bool = true;
	    } else
		bool = true;
	    if (bool) {
		int i = arg1.anInt5245 + -arg1.anInt5306;
		int i_0_ = Class125.anInt1632 - arg1.anInt5306;
		int i_1_
		    = 128 * arg1.anInt5281 + 64 * arg1.method335((byte) -61);
		int i_2_ = (arg1.anInt5249 * 128
			    - -(arg1.method335((byte) -50) * 64));
		int i_3_ = (128 * arg1.anInt5271
			    - -(arg1.method335((byte) -52) * 64));
		int i_4_
		    = arg1.anInt5266 * 128 + 64 * arg1.method335((byte) -48);
		arg1.anInt3747 = (i_0_ * i_4_ + i_2_ * (-i_0_ + i)) / i;
		arg1.anInt3733 = (i_1_ * (i - i_0_) + i_0_ * i_3_) / i;
	    }
	    arg1.anInt5321 = 0;
	    if ((arg1.anInt5267 ^ 0xffffffff) == -1)
		arg1.method338(-108, 8192);
	    if ((arg1.anInt5267 ^ 0xffffffff) == -2)
		arg1.method338(arg0 + -177, 12288);
	    if ((arg1.anInt5267 ^ 0xffffffff) == -3)
		arg1.method338(-82, 0);
	    if (arg1.anInt5267 == 3)
		arg1.method338(-108, 4096);
	}
    }
    
    public static void method2550(int arg0) {
	try {
	    anIntArray2629 = null;
	    aClass131_Sub30_2626 = null;
	    aClass158_2630 = null;
	    if (arg0 == 0) {
		aString2623 = null;
		aClass44_2633 = null;
		aString2624 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"so.D(" + arg0 + ')');
	}
    }
    
    public static void method2551(Class158 arg0, boolean arg1) {
	Class127_Sub1.aClass158_4011 = arg0;
	anInt2625++;
	if (arg1 != true)
	    aClass44_2633 = null;
    }
    
    public static void method2552() {
	for (int i = 0; i < Class172.anInt2293; i++) {
	    if (!Class112.aBooleanArray1441[i]) {
		Class131_Sub8_Sub1 class131_sub8_sub1
		    = Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707[i];
		int i_5_ = class131_sub8_sub1.anInt6095;
		int i_6_ = class131_sub8_sub1.anInt4192 - 64;
		int i_7_ = 1 + (2 * i_6_ >> 7);
		int i_8_ = 0;
		int[] is = new int[i_7_ * i_7_];
		int i_9_ = class131_sub8_sub1.anInt4195 - i_6_ >> 7;
		int i_10_ = class131_sub8_sub1.anInt4191 - i_6_ >> 7;
		int i_11_ = class131_sub8_sub1.anInt4191 + i_6_ >> 7;
		if (i_10_ < 0) {
		    i_8_ -= i_10_;
		    i_10_ = 0;
		}
		if (i_11_ >= Class131_Sub8_Sub1.anInt6099)
		    i_11_ = Class131_Sub8_Sub1.anInt6099 - 1;
		for (int i_12_ = i_10_; i_12_ <= i_11_; i_12_++) {
		    int i_13_ = class131_sub8_sub1.aShortArray6104[i_8_];
		    int i_14_ = i_13_ >>> 8;
		    int i_15_ = i_8_ * i_7_ + i_14_;
		    int i_16_ = i_9_ + (i_13_ >>> 8);
		    int i_17_ = i_16_ + (i_13_ & 0xff) - 1;
		    if (i_16_ < 0) {
			i_15_ -= i_16_;
			i_16_ = 0;
		    }
		    if (i_17_ >= Class210.anInt3068)
			i_17_ = Class210.anInt3068 - 1;
		    for (int i_18_ = i_16_; i_18_ <= i_17_; i_18_++) {
			int i_19_ = 1;
			Class23_Sub4 class23_sub4
			    = (Class63.method662
			       (i_5_, i_18_, i_12_,
				(aClass2635 != null ? aClass2635
				 : (aClass2635
				    = method2553("Class23_Sub4")))));
			if (class23_sub4 != null
			    && class23_sub4.aByte3741 != 0) {
			    if (class23_sub4.aByte3741 == 1) {
				boolean bool = i_18_ - 1 >= i_16_;
				boolean bool_20_ = i_18_ + 1 <= i_17_;
				if (!bool && i_12_ + 1 <= i_11_) {
				    int i_21_ = (class131_sub8_sub1
						 .aShortArray6104[i_8_ + 1]);
				    int i_22_ = i_9_ + (i_21_ >>> 8);
				    int i_23_ = i_22_ + (i_21_ & 0xff);
				    bool = i_18_ > i_22_ && i_18_ < i_23_;
				}
				if (!bool_20_ && i_12_ - 1 >= i_10_) {
				    int i_24_ = (class131_sub8_sub1
						 .aShortArray6104[i_8_ - 1]);
				    int i_25_ = i_9_ + (i_24_ >>> 8);
				    int i_26_ = i_25_ + (i_24_ & 0xff);
				    bool_20_ = i_18_ > i_25_ && i_18_ < i_26_;
				}
				if (bool && !bool_20_)
				    i_19_ = 4;
				else if (bool_20_ && !bool)
				    i_19_ = 2;
			    } else {
				boolean bool = i_18_ - 1 >= i_16_;
				boolean bool_27_ = i_18_ + 1 <= i_17_;
				if (!bool && i_12_ - 1 >= i_10_) {
				    int i_28_ = (class131_sub8_sub1
						 .aShortArray6104[i_8_ - 1]);
				    int i_29_ = i_9_ + (i_28_ >>> 8);
				    int i_30_ = i_29_ + (i_28_ & 0xff);
				    bool = i_18_ > i_29_ && i_18_ < i_30_;
				}
				if (!bool_27_ && i_12_ + 1 <= i_11_) {
				    int i_31_ = (class131_sub8_sub1
						 .aShortArray6104[i_8_ + 1]);
				    int i_32_ = i_9_ + (i_31_ >>> 8);
				    int i_33_ = i_32_ + (i_31_ & 0xff);
				    bool_27_ = i_18_ > i_32_ && i_18_ < i_33_;
				}
				if (bool && !bool_27_)
				    i_19_ = 3;
				else if (bool_27_ && !bool)
				    i_19_ = 5;
			    }
			}
			is[i_15_++] = i_19_;
		    }
		    i_8_++;
		}
		Class112.aBooleanArray1441[i] = true;
		Class75.aClass68Array1023[i_5_].method719(class131_sub8_sub1,
							  is);
	    }
	}
    }
    
    /*synthetic*/ public static Class method2553(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aString2623 = "Opened title screen";
	anInt2622 = 0;
	aClass131_Sub30_2626 = null;
	anIntArray2629 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    }
}
