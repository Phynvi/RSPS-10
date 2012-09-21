/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147
{
    public static Class158 aClass158_1943;
    public static int anInt1944;
    public static int anInt1945;
    public static int anInt1946 = 0;
    public static int anInt1947;
    public static int anInt1948;
    public static int anInt1949 = 0;
    public short aShort1950;
    public Class23_Sub2 aClass23_Sub2_1951;
    public Class147 aClass147_1952;
    public byte aByte1953 = 0;
    public boolean aBoolean1954;
    public static int anInt1955;
    public byte aByte1956;
    public Class105 aClass105_1957;
    public Class82 aClass82_1958;
    public byte aByte1959;
    public static int anInt1960;
    public byte aByte1961;
    public byte aByte1962;
    public short aShort1963;
    public short aShort1964;
    public byte aByte1965;
    public Class23_Sub1 aClass23_Sub1_1966;
    public boolean aBoolean1967;
    public byte aByte1968;
    public Class23_Sub1 aClass23_Sub1_1969;
    public Class23_Sub3 aClass23_Sub3_1970;
    public boolean aBoolean1971;
    public Class23_Sub2 aClass23_Sub2_1972;
    public Class23_Sub5 aClass23_Sub5_1973;
    
    public void method2172(byte arg0) {
	try {
	    if (arg0 != 110)
		method2173(-6);
	    anInt1944++;
	    Class82 class82;
	    for (/**/; aClass82_1958 != null; aClass82_1958 = class82) {
		class82 = aClass82_1958.aClass82_1086;
		aClass82_1958.method793(0);
	    }
	    aByte1953 = (byte) 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pm.C(" + arg0 + ')');
	}
    }
    
    public Class147(int arg0, int arg1, int arg2) {
	try {
	    aShort1950 = (short) arg1;
	    aByte1965 = aByte1962 = (byte) arg0;
	    aShort1963 = (short) arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pm.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2173(int arg0) {
	aClass158_1943 = null;
	if (arg0 != 1)
	    method2174(1, 10, 53, (byte) 113, null);
    }
    
    public static void method2174(int arg0, int arg1, int arg2, byte arg3,
				  Class131_Sub18 arg4) {
	try {
	    anInt1948++;
	    long l = (long) (arg2 | (arg0 << -491790596 | arg1 << 1414041390));
	    Class131_Sub10 class131_sub10
		= ((Class131_Sub10)
		   Class131_Sub24.aClass180_4468.method2521(-60, l));
	    if (class131_sub10 == null) {
		class131_sub10 = new Class131_Sub10();
		Class131_Sub24.aClass180_4468.method2523(false, l,
							 class131_sub10);
		class131_sub10.aClass119_4226.method1018((byte) -121, arg4);
	    } else {
		Class29 class29
		    = Class131_Sub19.method1808(arg4.anInt4384, false);
		int i = class29.anInt298;
		if (class29.anInt304 == 1)
		    i *= 1 + arg4.anInt4379;
		for (Class131_Sub18 class131_sub18
			 = (Class131_Sub18) class131_sub10.aClass119_4226
						.method1007(arg3 + 55);
		     class131_sub18 != null;
		     class131_sub18
			 = ((Class131_Sub18)
			    class131_sub10.aClass119_4226.method1014(0))) {
		    class29
			= Class131_Sub19.method1808(class131_sub18.anInt4384,
						    false);
		    int i_0_ = class29.anInt298;
		    if ((class29.anInt304 ^ 0xffffffff) == -2)
			i_0_ *= class131_sub18.anInt4379 - -1;
		    if (i_0_ < i) {
			Class131_Sub41_Sub21.method2076(class131_sub18, arg4,
							arg3 ^ ~0xa32);
			return;
		    }
		}
		if (arg3 != -55)
		    method2174(83, -18, -27, (byte) -87, null);
		class131_sub10.aClass119_4226.method1018((byte) -124, arg4);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pm.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method2175(int arg0, int arg1, Class173 arg2) {
	try {
	    anInt1955++;
	    if (arg2.anIntArrayArray2327 == null
		|| arg2.anIntArrayArray2327.length <= arg1)
		return -2;
	    try {
		int[] is = arg2.anIntArrayArray2327[arg1];
		int i = 0;
		int i_1_ = 0;
		int i_2_ = 0;
		for (;;) {
		    int i_3_ = is[i_1_++];
		    int i_4_ = 0;
		    int i_5_ = 0;
		    if ((i_3_ ^ 0xffffffff) == -1)
			return i;
		    if ((i_3_ ^ 0xffffffff) == -2)
			i_4_ = Class2.anIntArray86[is[i_1_++]];
		    if (i_3_ == 2)
			i_4_ = Class131_Sub2_Sub29.anIntArray5975[is[i_1_++]];
		    if ((i_3_ ^ 0xffffffff) == -4)
			i_4_ = (Class131_Sub2_Sub10_Sub1.anIntArray6539
				[is[i_1_++]]);
		    if ((i_3_ ^ 0xffffffff) == -5) {
			int i_6_ = is[i_1_++] << 836574800;
			i_6_ += is[i_1_++];
			Class173 class173 = Class190.method2615(i_6_, -39);
			int i_7_ = is[i_1_++];
			if ((i_7_ ^ 0xffffffff) != 0
			    && (!(Class131_Sub19.method1808(i_7_, false)
				  .aBoolean366)
				|| Class131_Sub9.aBoolean4218)) {
			    for (int i_8_ = 0;
				 ((i_8_ ^ 0xffffffff)
				  > (class173.anIntArray2400.length
				     ^ 0xffffffff));
				 i_8_++) {
				if ((1 + i_7_ ^ 0xffffffff)
				    == (class173.anIntArray2400[i_8_]
					^ 0xffffffff))
				    i_4_ += class173.anIntArray2418[i_8_];
			    }
			}
		    }
		    if ((i_3_ ^ 0xffffffff) == -6)
			i_4_ = Class131_Sub2_Sub13.anIntArray5735[is[i_1_++]];
		    if ((i_3_ ^ 0xffffffff) == -7)
			i_4_ = (Class23_Sub4_Sub1_Sub2.anIntArray6505
				[-1 + (Class131_Sub2_Sub29.anIntArray5975
				       [is[i_1_++]])]);
		    if ((i_3_ ^ 0xffffffff) == -8)
			i_4_ = (Class131_Sub2_Sub13.anIntArray5735[is[i_1_++]]
				* 100 / 46875);
		    if ((i_3_ ^ 0xffffffff) == -9)
			i_4_ = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6515;
		    if ((i_3_ ^ 0xffffffff) == -10) {
			for (int i_9_ = 0; i_9_ < 25; i_9_++) {
			    if (Class76.aBooleanArray1037[i_9_])
				i_4_ += (Class131_Sub2_Sub29.anIntArray5975
					 [i_9_]);
			}
		    }
		    if (i_3_ == 10) {
			int i_10_ = is[i_1_++] << -945429168;
			i_10_ += is[i_1_++];
			Class173 class173 = Class190.method2615(i_10_, -34);
			int i_11_ = is[i_1_++];
			if ((i_11_ ^ 0xffffffff) != 0
			    && (!(Class131_Sub19.method1808(i_11_, false)
				  .aBoolean366)
				|| Class131_Sub9.aBoolean4218)) {
			    for (int i_12_ = 0;
				 i_12_ < class173.anIntArray2400.length;
				 i_12_++) {
				if (1 + i_11_
				    == class173.anIntArray2400[i_12_]) {
				    i_4_ = 999999999;
				    break;
				}
			    }
			}
		    }
		    if (i_3_ == 11)
			i_4_ = Class183_Sub1.anInt4965;
		    if ((i_3_ ^ 0xffffffff) == -13)
			i_4_ = Class131_Sub2_Sub10.anInt5703;
		    if ((i_3_ ^ 0xffffffff) == -14) {
			int i_13_
			    = Class131_Sub2_Sub13.anIntArray5735[is[i_1_++]];
			int i_14_ = is[i_1_++];
			i_4_ = (i_13_ & 1 << i_14_) == 0 ? 0 : 1;
		    }
		    if (i_3_ == 15)
			i_5_ = 1;
		    if ((i_3_ ^ 0xffffffff) == -15) {
			int i_15_ = is[i_1_++];
			i_4_ = Class63.method667(i_15_, -1);
		    }
		    if ((i_3_ ^ 0xffffffff) == -17)
			i_5_ = 2;
		    if (i_3_ == 17)
			i_5_ = 3;
		    if (i_3_ == 18)
			i_4_ = (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3733
				>> 481084423) + Class92.regionX;
		    if (i_3_ == 19)
			i_4_ = (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt3747
				>> -2102541881) - -Class64.regionY;
		    if ((i_3_ ^ 0xffffffff) == -21)
			i_4_ = is[i_1_++];
		    if ((i_5_ ^ 0xffffffff) == -1) {
			if ((i_2_ ^ 0xffffffff) == -1)
			    i += i_4_;
			if (i_2_ == 1)
			    i -= i_4_;
			if (i_2_ == 2 && i_4_ != 0)
			    i /= i_4_;
			if (i_2_ == 3)
			    i *= i_4_;
			i_2_ = 0;
		    } else
			i_2_ = i_5_;
		}
	    } catch (Exception exception) {
		if (arg0 <= 37)
		    method2173(92);
		return -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pm.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
