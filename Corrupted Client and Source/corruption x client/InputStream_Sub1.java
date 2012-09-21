/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

public class InputStream_Sub1 extends InputStream
{
    public static int anInt48;
    public static int anInt49;
    public static int anInt50;
    public static Class152 aClass152_51;
    public static int anInt52 = -1;
    public static int anInt53;
    public static int anInt54;
    public static int anInt55;
    public static boolean aBoolean56 = false;
    public static int anInt57;
    public static int[] anIntArray58;
    public static int anInt59;
    public static int anInt60;
    public static int anInt61;
    public static int anInt62;
    public static int anInt63;
    
    public int read() {
	try {
	    Class187.method2575(-126, 30000L);
	    anInt54++;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"md.read(" + ')');
	}
    }
    
    public static Class131_Sub41_Sub1 method78(int arg0) {
	try {
	    anInt63++;
	    if (arg0 != 3)
		method86((byte) -3);
	    return Class127.aClass131_Sub41_Sub1_1703;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"md.A(" + arg0 + ')');
	}
    }
    
    public static void method79(int arg0, Class130 arg1, int arg2, byte arg3,
				int arg4, Class131_Sub20 arg5, Class140 arg6,
				Class94 arg7) {
	try {
	    anInt49++;
	    int i = arg5.anInt4428 + -(arg2 / 2) + -5;
	    int i_0_ = 2 + arg0;
	    if ((arg7.anInt1254 ^ 0xffffffff) != -1)
		arg1.method1201(arg2 - -10,
				arg6.method2127() * arg4 + arg0 - i_0_ + 1, i,
				i_0_, arg7.anInt1254, arg3 ^ ~0x78);
	    if (arg7.anInt1257 != 0)
		arg1.method1262(1 + (-i_0_
				     + (arg0 - -(arg6.method2127() * arg4))),
				i, arg2 + 10, false, i_0_, arg7.anInt1257);
	    if (arg3 != 38)
		anInt55 = 119;
	    int i_1_ = arg7.anInt1232;
	    if (arg5.aBoolean4418 && arg7.anInt1268 != -1)
		i_1_ = arg7.anInt1268;
	    for (int i_2_ = 0; arg4 > i_2_; i_2_++) {
		String string = Class1_Sub2.aStringArray3509[i_2_];
		if ((i_2_ ^ 0xffffffff) > (arg4 - 1 ^ 0xffffffff))
		    string = string.substring(0, string.length() - 4);
		arg6.method2133(arg1, string, arg5.anInt4428, arg0, i_1_,
				true);
		arg0 += arg6.method2127();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("md.D(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method80(Class138 arg0, Class147 arg1) {
	if (arg1.aBoolean1967) {
	    int i = arg1.aShort1950;
	    int i_3_ = arg1.aShort1963;
	    byte i_4_ = arg1.aByte1962;
	    byte i_5_ = arg1.aByte1965;
	    int i_6_ = (i << 7) + 64;
	    int i_7_ = (i_3_ << 7) + 64;
	    Class147[][] class147s
		= Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i_4_];
	    float f;
	    if (Class85.aClass68Array1116 == Class75.aClass68Array1023) {
		int i_8_ = Class218.anIntArrayArray3197[i][i_3_];
		Class131_Sub2_Sub35.aClass130_6044.method1236
		    (Class131_Sub2_Sub37.aClass68Array6057[0].method720(i_6_,
									i_7_),
		     i_8_ & 0xffffff, i_8_ >>> 21 & 0x7f8);
		f = 201.5F;
	    } else
		f = 201.5F - 50.0F * (float) (i_5_ + 1);
	    Class131_Sub2_Sub35.aClass130_6044.method1252(3000.0F, f * 1.5F);
	    if (arg1.aBoolean1954) {
		if (Class131_Sub2_Sub19.aBoolean5827) {
		    if (i_4_ > 0) {
			Class147 class147
			    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			       [i_4_ - 1][i][i_3_]);
			if (class147 != null && class147.aBoolean1967)
			    return;
		    }
		    if (i <= Class210.anInt3063 && i > Class52.anInt695) {
			Class147 class147 = class147s[i - 1][i_3_];
			if (class147 != null && class147.aBoolean1967
			    && (class147.aBoolean1954
				|| (arg1.aByte1953 & 0x1) == 0))
			    return;
		    }
		    if (i >= Class210.anInt3063
			&& i < Class120_Sub2.anInt3976 - 1) {
			Class147 class147 = class147s[i + 1][i_3_];
			if (class147 != null && class147.aBoolean1967
			    && (class147.aBoolean1954
				|| (arg1.aByte1953 & 0x4) == 0))
			    return;
		    }
		    if (i_3_ <= Class47.anInt643
			&& i_3_ > Class23_Sub1.anInt3702) {
			Class147 class147 = class147s[i][i_3_ - 1];
			if (class147 != null && class147.aBoolean1967
			    && (class147.aBoolean1954
				|| (arg1.aByte1953 & 0x8) == 0))
			    return;
		    }
		    if (i_3_ >= Class47.anInt643
			&& i_3_ < Stream.anInt4350 - 1) {
			Class147 class147 = class147s[i][i_3_ + 1];
			if (class147 != null && class147.aBoolean1967
			    && (class147.aBoolean1954
				|| (arg1.aByte1953 & 0x2) == 0))
			    return;
		    }
		} else
		    Class131_Sub2_Sub19.aBoolean5827 = true;
		arg1.aBoolean1954 = false;
		if (arg1.aClass147_1952 != null) {
		    Class147 class147 = arg1.aClass147_1952;
		    Class131_Sub2_Sub35.aClass130_6044.method1252
			(3000.0F, (201.5F - 50.0F * (float) (class147.aByte1965
							     + 1)) * 1.5F);
		    if (!Class131_Sub4.method1652(class147.aByte1965, i, i_3_))
			Class75.aClass68Array1023[class147.aByte1965]
			    .method727(i, i_3_);
		    Class23_Sub1 class23_sub1 = class147.aClass23_Sub1_1966;
		    if (class23_sub1 != null) {
			if (Class23_Sub2.aBoolean3709) {
			    if ((class23_sub1.anInt3697 & arg1.aShort1964)
				!= 0)
				Class177.method2491(arg0,
						    class23_sub1.anInt3697,
						    i_5_, i, i_3_);
			    else
				Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			class23_sub1.method288((Class131_Sub2_Sub35
						.aClass130_6044),
					       false);
		    }
		    for (Class82 class82 = class147.aClass82_1958;
			 class82 != null; class82 = class82.aClass82_1086) {
			Class23_Sub4 class23_sub4 = class82.aClass23_Sub4_1080;
			if (class23_sub4 != null) {
			    if (Class23_Sub2.aBoolean3709) {
				Class1_Sub2.method103(arg0, i_4_, i, i_3_);
				Class131_Sub2_Sub35.aClass130_6044.method1217
				    (arg0.anInt1852,
				     arg0.aClass131_Sub8_Sub1Array1851);
			    }
			    class23_sub4.method288((Class131_Sub2_Sub35
						    .aClass130_6044),
						   false);
			}
		    }
		    Class131_Sub2_Sub35.aClass130_6044.method1252(3000.0F,
								  f * 1.5F);
		}
		boolean bool = !Class131_Sub4.method1652(i_5_, i, i_3_);
		if (bool) {
		    Class75.aClass68Array1023[i_5_].method727(i, i_3_);
		    Class23_Sub5 class23_sub5 = arg1.aClass23_Sub5_1973;
		    if (class23_sub5 != null && class23_sub5.aBoolean3759) {
			if (class23_sub5.aBoolean3757)
			    Class131_Sub2_Sub35.aClass130_6044.method1252
				(3000.0F, (f + 50.0F - 1.5F) * 1.5F);
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub5.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub5;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -128);
			}
			if (class23_sub5.aBoolean3757)
			    Class131_Sub2_Sub35.aClass130_6044
				.method1252(3000.0F, f * 1.5F);
		    }
		}
		int i_9_ = 0;
		int i_10_ = 0;
		Class23_Sub1 class23_sub1 = arg1.aClass23_Sub1_1966;
		Class23_Sub2 class23_sub2 = arg1.aClass23_Sub2_1972;
		if (class23_sub1 != null || class23_sub2 != null) {
		    if (Class210.anInt3063 == i)
			i_9_++;
		    else if (Class210.anInt3063 < i)
			i_9_ += 2;
		    if (Class47.anInt643 == i_3_)
			i_9_ += 3;
		    else if (Class47.anInt643 > i_3_)
			i_9_ += 6;
		    i_10_ = Class184.anIntArray2629[i_9_];
		    arg1.aShort1964 = Class128.aShortArray1748[i_9_];
		}
		if (class23_sub1 != null) {
		    if ((class23_sub1.anInt3697 & Class33.anIntArray455[i_9_])
			!= 0) {
			if (class23_sub1.anInt3697 == 16) {
			    arg1.aByte1961 = (byte) 3;
			    arg1.aByte1956 = Class113.aByteArray1461[i_9_];
			    arg1.aByte1959 = (byte) (3 - arg1.aByte1956);
			} else if (class23_sub1.anInt3697 == 32) {
			    arg1.aByte1961 = (byte) 6;
			    arg1.aByte1956
				= Class131_Sub2_Sub14.aByteArray5747[i_9_];
			    arg1.aByte1959 = (byte) (6 - arg1.aByte1956);
			} else if (class23_sub1.anInt3697 == 64) {
			    arg1.aByte1961 = (byte) 12;
			    arg1.aByte1956
				= Class131_Sub41_Sub10.aByteArray6296[i_9_];
			    arg1.aByte1959 = (byte) (12 - arg1.aByte1956);
			} else {
			    arg1.aByte1961 = (byte) 9;
			    arg1.aByte1956 = Class144.aByteArray1913[i_9_];
			    arg1.aByte1959 = (byte) (9 - arg1.aByte1956);
			}
		    } else
			arg1.aByte1961 = (byte) 0;
		    if ((class23_sub1.anInt3697 & i_10_) != 0
			&& !Class87.method819(i_5_, i, i_3_,
					      class23_sub1.anInt3697)) {
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub1.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub1;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -111);
			}
		    }
		    Class23_Sub1 class23_sub1_11_ = arg1.aClass23_Sub1_1969;
		    if (class23_sub1_11_ != null
			&& (class23_sub1_11_.anInt3697 & i_10_) != 0
			&& !Class87.method819(i_5_, i, i_3_,
					      class23_sub1_11_.anInt3697)) {
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub1_11_.method288((Class131_Sub2_Sub35
							  .aClass130_6044),
							 false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub1_11_;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -122);
			}
		    }
		}
		if (class23_sub2 != null
		    && !Class163.method2397(i_5_, i, i_3_,
					    class23_sub2.method310(-87))) {
		    Class23_Sub2 class23_sub2_12_ = arg1.aClass23_Sub2_1951;
		    Class131_Sub2_Sub35.aClass130_6044
			.method1252(3000.0F, (f - 0.5F) * 1.5F);
		    if ((class23_sub2.anInt3704 & i_10_) != 0) {
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub2.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub2;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -123);
			}
		    } else if (class23_sub2.anInt3704 == 256) {
			int i_13_ = class23_sub2.anInt3711 - Class50.anInt668;
			int i_14_
			    = class23_sub2.anInt3714 - Class176.anInt2513;
			int i_15_ = class23_sub2.anInt3705;
			int i_16_;
			if (i_15_ == 1 || i_15_ == 2)
			    i_16_ = -i_13_;
			else
			    i_16_ = i_13_;
			int i_17_;
			if (i_15_ == 2 || i_15_ == 3)
			    i_17_ = -i_14_;
			else
			    i_17_ = i_14_;
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			if (i_17_ < i_16_) {
			    Class1_Sub2 class1_sub2
				= class23_sub2.method288((Class131_Sub2_Sub35
							  .aClass130_6044),
							 false);
			    if (class1_sub2 != null) {
				class1_sub2.aClass23_3503 = class23_sub2;
				class1_sub2.anInt3501 = i_4_;
				class1_sub2.anInt3508 = i;
				class1_sub2.anInt3504 = i_3_;
				Class134.aClass50_1807.method584(class1_sub2,
								 (byte) -126);
			    }
			} else if (class23_sub2_12_ != null) {
			    Class1_Sub2 class1_sub2
				= (class23_sub2_12_.method288
				   (Class131_Sub2_Sub35.aClass130_6044,
				    false));
			    if (class1_sub2 != null) {
				class1_sub2.aClass23_3503 = class23_sub2_12_;
				class1_sub2.anInt3501 = i_4_;
				class1_sub2.anInt3508 = i;
				class1_sub2.anInt3504 = i_3_;
				Class134.aClass50_1807.method584(class1_sub2,
								 (byte) -128);
			    }
			}
		    }
		    Class131_Sub2_Sub35.aClass130_6044.method1252(3000.0F,
								  f * 1.5F);
		}
		if (bool) {
		    Class23_Sub5 class23_sub5 = arg1.aClass23_Sub5_1973;
		    if (class23_sub5 != null && !class23_sub5.aBoolean3759) {
			if (class23_sub5.aBoolean3757)
			    Class131_Sub2_Sub35.aClass130_6044.method1252
				(3000.0F, (f + 50.0F - 1.5F) * 1.5F);
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub5.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub5;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -126);
			}
			if (class23_sub5.aBoolean3757)
			    Class131_Sub2_Sub35.aClass130_6044
				.method1252(3000.0F, f * 1.5F);
		    }
		    Class23_Sub3 class23_sub3 = arg1.aClass23_Sub3_1970;
		    if (class23_sub3 != null && !class23_sub3.aBoolean3731) {
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub3.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub3;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -111);
			}
		    }
		}
		byte i_18_ = arg1.aByte1953;
		if (i_18_ != 0) {
		    if (i < Class210.anInt3063 && (i_18_ & 0x4) != 0) {
			Class147 class147 = class147s[i + 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i_3_ < Class47.anInt643 && (i_18_ & 0x2) != 0) {
			Class147 class147 = class147s[i][i_3_ + 1];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i > Class210.anInt3063 && (i_18_ & 0x1) != 0) {
			Class147 class147 = class147s[i - 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i_3_ > Class47.anInt643 && (i_18_ & 0x8) != 0) {
			Class147 class147 = class147s[i][i_3_ - 1];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		}
	    }
	    if (arg1.aByte1961 != 0) {
		boolean bool = true;
		for (Class82 class82 = arg1.aClass82_1958; class82 != null;
		     class82 = class82.aClass82_1086) {
		    if ((class82.aClass23_Sub4_1080.anInt3750
			 != Class131_Sub41_Sub20.anInt6431)
			&& ((class82.anInt1081 & arg1.aByte1961)
			    == arg1.aByte1956)) {
			bool = false;
			break;
		    }
		}
		if (bool) {
		    Class23_Sub1 class23_sub1 = arg1.aClass23_Sub1_1966;
		    if (!Class87.method819(i_5_, i, i_3_,
					   class23_sub1.anInt3697)) {
			if (Class23_Sub2.aBoolean3709) {
			    do {
				if (class23_sub1.anInt3697 >= 16) {
				    int i_19_ = i - Class210.anInt3063;
				    int i_20_ = i_3_ - Class47.anInt643;
				    if (class23_sub1.anInt3697 == 16) {
					i_19_ -= 64;
					i_20_ += 64;
					if (i_20_ < i_19_ && i > 0
					    && i_3_ <= (Class131_Sub8_Sub1
							.anInt6099)) {
					    Class1_Sub2.method103(arg0, i_4_,
								  i - 1,
								  i_3_ + 1);
					    break;
					}
				    } else if (class23_sub1.anInt3697 == 32) {
					i_19_ += 64;
					i_20_ += 64;
					if (i_20_ < -i_19_
					    && i < Class210.anInt3068
					    && i_3_ < (Class131_Sub8_Sub1
						       .anInt6099)) {
					    Class1_Sub2.method103(arg0, i_4_,
								  i + 1,
								  i_3_ + 1);
					    break;
					}
				    } else if (class23_sub1.anInt3697 == 64) {
					i_19_ += 64;
					i_20_ -= 64;
					if (i_20_ > i_19_
					    && i < Class210.anInt3068
					    && i_3_ > 0) {
					    Class1_Sub2.method103(arg0, i_4_,
								  i + 1,
								  i_3_ - 1);
					    break;
					}
				    } else if (class23_sub1.anInt3697 == 128) {
					i_19_ -= 64;
					i_20_ -= 64;
					if (i_20_ > -i_19_ && i > 0
					    && i_3_ > 0) {
					    Class1_Sub2.method103(arg0, i_4_,
								  i - 1,
								  i_3_ - 1);
					    break;
					}
				    }
				}
				Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    } while (false);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub1.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub1;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -113);
			}
		    }
		    arg1.aByte1961 = (byte) 0;
		}
	    }
	    if (arg1.aBoolean1971) {
		try {
		    arg1.aBoolean1971 = false;
		    int i_21_ = 0;
		while_226_:
		    for (Class82 class82 = arg1.aClass82_1958; class82 != null;
			 class82 = class82.aClass82_1086) {
			Class23_Sub4 class23_sub4 = class82.aClass23_Sub4_1080;
			if (class23_sub4.anInt3750
			    != Class131_Sub41_Sub20.anInt6431) {
			    for (int i_22_ = class23_sub4.aShort3745;
				 i_22_ <= class23_sub4.aShort3742; i_22_++) {
				for (int i_23_ = class23_sub4.aShort3737;
				     i_23_ <= class23_sub4.aShort3735;
				     i_23_++) {
				    Class147 class147
					= class147s[i_22_][i_23_];
				    if (class147.aBoolean1954) {
					arg1.aBoolean1971 = true;
					continue while_226_;
				    }
				    if (class147.aByte1961 != 0) {
					int i_24_ = 0;
					if (i_22_ > class23_sub4.aShort3745)
					    i_24_++;
					if (i_22_ < class23_sub4.aShort3742)
					    i_24_ += 4;
					if (i_23_ > class23_sub4.aShort3737)
					    i_24_ += 8;
					if (i_23_ < class23_sub4.aShort3735)
					    i_24_ += 2;
					if ((i_24_ & class147.aByte1961)
					    == arg1.aByte1959) {
					    arg1.aBoolean1971 = true;
					    continue while_226_;
					}
				    }
				}
			    }
			    int i_25_
				= Class210.anInt3063 - class23_sub4.aShort3745;
			    int i_26_
				= class23_sub4.aShort3742 - Class210.anInt3063;
			    if (i_26_ > i_25_)
				i_25_ = i_26_;
			    int i_27_
				= Class47.anInt643 - class23_sub4.aShort3737;
			    int i_28_
				= class23_sub4.aShort3735 - Class47.anInt643;
			    if (i_28_ > i_27_)
				i_27_ = i_28_;
			    arg0.aClass23_Sub4Array1850[i_21_] = class23_sub4;
			    arg0.anIntArray1854[i_21_++] = i_25_ + i_27_;
			}
		    }
		    while (i_21_ > 0) {
			int i_29_ = -50;
			int i_30_ = -1;
			for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
			    Class23_Sub4 class23_sub4
				= arg0.aClass23_Sub4Array1850[i_31_];
			    if (class23_sub4.anInt3750
				!= Class131_Sub41_Sub20.anInt6431) {
				int i_32_ = arg0.anIntArray1854[i_31_];
				if (i_32_ > i_29_) {
				    i_29_ = i_32_;
				    i_30_ = i_31_;
				} else if (i_32_ == i_29_) {
				    int i_33_ = (class23_sub4.anInt3733
						 - Class50.anInt668);
				    int i_34_ = (class23_sub4.anInt3747
						 - Class176.anInt2513);
				    int i_35_ = ((arg0.aClass23_Sub4Array1850
						  [i_30_].anInt3733)
						 - Class50.anInt668);
				    int i_36_ = ((arg0.aClass23_Sub4Array1850
						  [i_30_].anInt3747)
						 - Class176.anInt2513);
				    if (i_33_ * i_33_ + i_34_ * i_34_
					> i_35_ * i_35_ + i_36_ * i_36_)
					i_30_ = i_31_;
				}
			    }
			}
			if (i_30_ == -1)
			    break;
			Class23_Sub4 class23_sub4
			    = arg0.aClass23_Sub4Array1850[i_30_];
			class23_sub4.anInt3750
			    = Class131_Sub41_Sub20.anInt6431;
			if (!Class23_Sub5_Sub1.method397
			     (i_5_, class23_sub4.aShort3745,
			      class23_sub4.aShort3742, class23_sub4.aShort3737,
			      class23_sub4.aShort3735,
			      class23_sub4.method323(-86))) {
			    if (Class23_Sub2.aBoolean3709) {
				if (class23_sub4.aByte3741 != 0) {
				    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
				    int i_37_ = i - Class210.anInt3063;
				    int i_38_ = i_3_ - Class47.anInt643;
				    if (class23_sub4.aByte3741 == 2) {
					if (i_38_ > -i_37_)
					    Class131_Sub2_Sub34.method1632
						(arg0, i_4_, i, i_3_ - 1,
						 i - 1, i_3_);
					else
					    Class131_Sub2_Sub34.method1632
						(arg0, i_4_, i, i_3_ + 1,
						 i + 1, i_3_);
				    } else if (i_38_ > i_37_)
					Class131_Sub2_Sub34.method1632(arg0,
								       i_4_, i,
								       (i_3_
									- 1),
								       i + 1,
								       i_3_);
				    else
					Class131_Sub2_Sub34.method1632(arg0,
								       i_4_, i,
								       (i_3_
									+ 1),
								       i - 1,
								       i_3_);
				} else
				    Class118.method1000
					(arg0, i_4_, class23_sub4.aShort3745,
					 class23_sub4.aShort3737,
					 class23_sub4.aShort3742,
					 class23_sub4.aShort3735);
				Class131_Sub2_Sub35.aClass130_6044.method1217
				    (arg0.anInt1852,
				     arg0.aClass131_Sub8_Sub1Array1851);
			    }
			    Class1_Sub2 class1_sub2
				= class23_sub4.method288((Class131_Sub2_Sub35
							  .aClass130_6044),
							 false);
			    if (class1_sub2 != null) {
				class1_sub2.aClass23_3503 = class23_sub4;
				class1_sub2.anInt3501 = i_4_;
				class1_sub2.anInt3508
				    = class23_sub4.aShort3745;
				class1_sub2.anInt3504
				    = class23_sub4.aShort3737;
				Class134.aClass50_1807.method584(class1_sub2,
								 (byte) -127);
			    }
			}
			for (int i_39_ = class23_sub4.aShort3745;
			     i_39_ <= class23_sub4.aShort3742; i_39_++) {
			    for (int i_40_ = class23_sub4.aShort3737;
				 i_40_ <= class23_sub4.aShort3735; i_40_++) {
				Class147 class147 = class147s[i_39_][i_40_];
				if (class147.aByte1961 != 0)
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
				else if ((i_39_ != i || i_40_ != i_3_)
					 && class147.aBoolean1967)
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
			    }
			}
		    }
		    if (arg1.aBoolean1971)
			return;
		} catch (Exception exception) {
		    arg1.aBoolean1971 = false;
		}
	    }
	    if (arg1.aClass105_1957 != null) {
		if (arg1.aByte1968
		    == (byte) (Class121_Sub3.anInt4001 & 0xff)) {
		    Class105 class105 = arg1.aClass105_1957;
		    int i_41_
			= Class75.aClass68Array1023[i_4_].method712(i, i_3_);
		    int i_42_;
		    if (i_4_ < 3)
			i_42_
			    = (Class75.aClass68Array1023[i_4_].method712(i,
									 i_3_)
			       - Class75.aClass68Array1023[i_4_ + 1]
				     .method712(i, i_3_));
		    else
			i_42_ = 1024;
		    Class131_Sub2_Sub22.aClass9_5859
			.method186(i_6_, i_41_, i_7_, arg0.anIntArray1849);
		    int i_43_ = arg0.anIntArray1849[2];
		    Class131_Sub2_Sub22.aClass9_5859.method186
			(i_6_, i_41_ - i_42_, i_7_, arg0.anIntArray1849);
		    int i_44_ = arg0.anIntArray1849[2];
		    int i_45_ = i_43_;
		    int i_46_ = i_44_;
		    if (i_43_ > i_44_) {
			i_45_ = i_44_;
			i_46_ = i_43_;
		    }
		    i_45_ -= 91;
		    i_46_ += 91;
		    if (i_45_ < i_46_ - 1597)
			i_45_ = i_46_ - 1597;
		    class105.anInt1378 = i_45_;
		    class105.anInt1379 = i_46_;
		    class105.aBoolean1380 = true;
		    Class131_Sub2_Sub35.aClass130_6044.method1215(class105);
		} else
		    arg1.aClass105_1957 = null;
	    }
	    if (arg1.aBoolean1967) {
		if (arg1.aByte1961 == 0) {
		    if (i <= Class210.anInt3063 && i > Class52.anInt695) {
			Class147 class147 = class147s[i - 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    return;
		    }
		    if (i >= Class210.anInt3063
			&& i < Class120_Sub2.anInt3976 - 1) {
			Class147 class147 = class147s[i + 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    return;
		    }
		    if (i_3_ <= Class47.anInt643
			&& i_3_ > Class23_Sub1.anInt3702) {
			Class147 class147 = class147s[i][i_3_ - 1];
			if (class147 != null && class147.aBoolean1967)
			    return;
		    }
		    if (i_3_ >= Class47.anInt643
			&& i_3_ < Stream.anInt4350 - 1) {
			Class147 class147 = class147s[i][i_3_ + 1];
			if (class147 != null && class147.aBoolean1967)
			    return;
		    }
		    arg1.aBoolean1967 = false;
		    Class100.anInt1321--;
		    Class23_Sub3 class23_sub3 = arg1.aClass23_Sub3_1970;
		    if (class23_sub3 != null && class23_sub3.aBoolean3731) {
			if (Class23_Sub2.aBoolean3709) {
			    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
			    Class131_Sub2_Sub35.aClass130_6044.method1217
				(arg0.anInt1852,
				 arg0.aClass131_Sub8_Sub1Array1851);
			}
			Class1_Sub2 class1_sub2
			    = class23_sub3.method288((Class131_Sub2_Sub35
						      .aClass130_6044),
						     false);
			if (class1_sub2 != null) {
			    class1_sub2.aClass23_3503 = class23_sub3;
			    class1_sub2.anInt3501 = i_4_;
			    class1_sub2.anInt3508 = i;
			    class1_sub2.anInt3504 = i_3_;
			    Class134.aClass50_1807.method584(class1_sub2,
							     (byte) -111);
			}
		    }
		    if (arg1.aShort1964 != 0) {
			Class23_Sub2 class23_sub2 = arg1.aClass23_Sub2_1972;
			if (class23_sub2 != null
			    && !Class163.method2397(i_5_, i, i_3_,
						    class23_sub2
							.method310(-59))) {
			    if ((class23_sub2.anInt3704 & arg1.aShort1964)
				!= 0) {
				if (Class23_Sub2.aBoolean3709) {
				    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
				    Class131_Sub2_Sub35.aClass130_6044
					.method1217
					(arg0.anInt1852,
					 arg0.aClass131_Sub8_Sub1Array1851);
				}
				Class1_Sub2 class1_sub2
				    = (class23_sub2.method288
				       (Class131_Sub2_Sub35.aClass130_6044,
					false));
				if (class1_sub2 != null) {
				    class1_sub2.aClass23_3503 = class23_sub2;
				    class1_sub2.anInt3501 = i_4_;
				    class1_sub2.anInt3508 = i;
				    class1_sub2.anInt3504 = i_3_;
				    Class134.aClass50_1807
					.method584(class1_sub2, (byte) -114);
				}
			    } else if (class23_sub2.anInt3704 == 256) {
				int i_47_ = (class23_sub2.anInt3711
					     - Class50.anInt668);
				int i_48_ = (class23_sub2.anInt3714
					     - Class176.anInt2513);
				int i_49_ = class23_sub2.anInt3705;
				int i_50_;
				if (i_49_ == 1 || i_49_ == 2)
				    i_50_ = -i_47_;
				else
				    i_50_ = i_47_;
				int i_51_;
				if (i_49_ == 2 || i_49_ == 3)
				    i_51_ = -i_48_;
				else
				    i_51_ = i_48_;
				if (Class23_Sub2.aBoolean3709) {
				    Class1_Sub2.method103(arg0, i_4_, i, i_3_);
				    Class131_Sub2_Sub35.aClass130_6044
					.method1217
					(arg0.anInt1852,
					 arg0.aClass131_Sub8_Sub1Array1851);
				}
				Class23_Sub2 class23_sub2_52_
				    = arg1.aClass23_Sub2_1951;
				if (i_51_ > i_50_) {
				    Class1_Sub2 class1_sub2
					= (class23_sub2.method288
					   (Class131_Sub2_Sub35.aClass130_6044,
					    false));
				    if (class1_sub2 != null) {
					class1_sub2.aClass23_3503
					    = class23_sub2;
					class1_sub2.anInt3501 = i_4_;
					class1_sub2.anInt3508 = i;
					class1_sub2.anInt3504 = i_3_;
					Class134.aClass50_1807.method584
					    (class1_sub2, (byte) -112);
				    }
				} else if (class23_sub2_52_ != null) {
				    Class1_Sub2 class1_sub2
					= (class23_sub2_52_.method288
					   (Class131_Sub2_Sub35.aClass130_6044,
					    false));
				    if (class1_sub2 != null) {
					class1_sub2.aClass23_3503
					    = class23_sub2_52_;
					class1_sub2.anInt3501 = i_4_;
					class1_sub2.anInt3508 = i;
					class1_sub2.anInt3504 = i_3_;
					Class134.aClass50_1807.method584
					    (class1_sub2, (byte) -125);
				    }
				}
			    }
			}
			Class23_Sub1 class23_sub1 = arg1.aClass23_Sub1_1966;
			Class23_Sub1 class23_sub1_53_
			    = arg1.aClass23_Sub1_1969;
			if (class23_sub1_53_ != null
			    && ((class23_sub1_53_.anInt3697 & arg1.aShort1964)
				!= 0)
			    && !Class87.method819(i_5_, i, i_3_,
						  (class23_sub1_53_
						   .anInt3697))) {
			    if (Class23_Sub2.aBoolean3709) {
				Class177.method2491(arg0,
						    class23_sub1_53_.anInt3697,
						    i_4_, i, i_3_);
				Class131_Sub2_Sub35.aClass130_6044.method1217
				    (arg0.anInt1852,
				     arg0.aClass131_Sub8_Sub1Array1851);
			    }
			    Class1_Sub2 class1_sub2
				= (class23_sub1_53_.method288
				   (Class131_Sub2_Sub35.aClass130_6044,
				    false));
			    if (class1_sub2 != null) {
				class1_sub2.aClass23_3503 = class23_sub1_53_;
				class1_sub2.anInt3501 = i_4_;
				class1_sub2.anInt3508 = i;
				class1_sub2.anInt3504 = i_3_;
				Class134.aClass50_1807.method584(class1_sub2,
								 (byte) -112);
			    }
			}
			if (class23_sub1 != null
			    && (class23_sub1.anInt3697 & arg1.aShort1964) != 0
			    && !Class87.method819(i_5_, i, i_3_,
						  class23_sub1.anInt3697)) {
			    if (Class23_Sub2.aBoolean3709) {
				Class177.method2491(arg0,
						    class23_sub1.anInt3697,
						    i_4_, i, i_3_);
				Class131_Sub2_Sub35.aClass130_6044.method1217
				    (arg0.anInt1852,
				     arg0.aClass131_Sub8_Sub1Array1851);
			    }
			    Class1_Sub2 class1_sub2
				= class23_sub1.method288((Class131_Sub2_Sub35
							  .aClass130_6044),
							 false);
			    if (class1_sub2 != null) {
				class1_sub2.aClass23_3503 = class23_sub1;
				class1_sub2.anInt3501 = i_4_;
				class1_sub2.anInt3508 = i;
				class1_sub2.anInt3504 = i_3_;
				Class134.aClass50_1807.method584(class1_sub2,
								 (byte) -121);
			    }
			}
		    }
		    if (i_4_ < Class133.anInt1805 - 1) {
			Class147 class147
			    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			       [i_4_ + 1][i][i_3_]);
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1025(5000,
								    class147);
		    }
		    if (i < Class210.anInt3063) {
			Class147 class147 = class147s[i + 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i_3_ < Class47.anInt643) {
			Class147 class147 = class147s[i][i_3_ + 1];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i > Class210.anInt3063) {
			Class147 class147 = class147s[i - 1][i_3_];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		    if (i_3_ > Class47.anInt643) {
			Class147 class147 = class147s[i][i_3_ - 1];
			if (class147 != null && class147.aBoolean1967)
			    Class153_Sub1.aClass120_4757.method1026((byte) 121,
								    class147);
		    }
		}
	    }
	}
    }
    
    public static void method81(byte arg0, byte arg1) {
	if (Class146.aByteArrayArrayArray1942 == null)
	    Class146.aByteArrayArrayArray1942
		= (new byte[4][Class131_Sub41_Sub11_Sub1.anInt6546]
		   [Class131_Sub2_Sub26.anInt5931]);
	anInt48++;
	for (int i = 0; i < 4; i++) {
	    for (int i_54_ = 0;
		 ((i_54_ ^ 0xffffffff)
		  > (Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff));
		 i_54_++) {
		for (int i_55_ = 0; i_55_ < Class131_Sub2_Sub26.anInt5931;
		     i_55_++)
		    Class146.aByteArrayArrayArray1942[i][i_54_][i_55_] = arg1;
	    }
	}
	if (arg0 >= -26)
	    aBoolean56 = false;
    }
    
    public static void method82(byte arg0) {
	aClass152_51 = null;
	anIntArray58 = null;
	if (arg0 != 41)
	    anInt52 = 127;
    }
    
    public static char method83(char arg0, boolean arg1, int arg2) {
	try {
	    anInt60++;
	    if ((arg0 ^ 0xffffffff) <= -193 && arg0 <= 255) {
		if ((arg0 ^ 0xffffffff) <= -193 && arg0 <= 198)
		    return 'A';
		if ((arg0 ^ 0xffffffff) == -200)
		    return 'C';
		if ((arg0 ^ 0xffffffff) <= -201 && (arg0 ^ 0xffffffff) >= -204)
		    return 'E';
		if ((arg0 ^ 0xffffffff) <= -205 && (arg0 ^ 0xffffffff) >= -208)
		    return 'I';
		if ((arg0 ^ 0xffffffff) == -210 && (arg2 ^ 0xffffffff) != -1)
		    return 'N';
		if (arg0 >= 210 && arg0 <= 214)
		    return 'O';
		if ((arg0 ^ 0xffffffff) <= -218 && arg0 <= 220)
		    return 'U';
		if ((arg0 ^ 0xffffffff) == -222)
		    return 'Y';
		if (arg0 == 223)
		    return 's';
		if (arg0 >= 224 && (arg0 ^ 0xffffffff) >= -231)
		    return 'a';
		if (arg0 == 231)
		    return 'c';
		if (arg0 >= 232 && arg0 <= 235)
		    return 'e';
		if ((arg0 ^ 0xffffffff) <= -237 && (arg0 ^ 0xffffffff) >= -240)
		    return 'i';
		if (arg0 == 241 && (arg2 ^ 0xffffffff) != -1)
		    return 'n';
		if (arg0 >= 242 && arg0 <= 246)
		    return 'o';
		if ((arg0 ^ 0xffffffff) <= -250 && arg0 <= 252)
		    return 'u';
		if (arg0 == 253 || arg0 == 255)
		    return 'y';
	    }
	    if (arg0 == 338)
		return 'O';
	    if ((arg0 ^ 0xffffffff) == -340)
		return 'o';
	    if (arg0 == 376)
		return 'Y';
	    if (arg1 != false)
		aBoolean56 = false;
	    return arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("md.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class76 method84(boolean arg0) {
	try {
	    anInt59++;
	    try {
		if (arg0 != false)
		    anInt52 = 123;
		return (Class76) Class.forName("Class76_Sub1").newInstance();
	    } catch (Throwable throwable) {
		return null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"md.G(" + arg0 + ')');
	}
    }
    
    public static void method85(Class130 arg0, Class23 arg1, int arg2,
				int arg3, int arg4) {
	if (arg3 < Class210.anInt3068) {
	    Class147 class147
		= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg2]
		   [arg3 + 1][arg4]);
	    if (class147 != null && class147.aClass23_Sub5_1973 != null
		&& class147.aClass23_Sub5_1973.method289((byte) -115))
		arg1.method293((byte) -127, arg0, 0, 128, true,
			       class147.aClass23_Sub5_1973, 0);
	}
	if (arg4 < Class210.anInt3068) {
	    Class147 class147
		= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg2][arg3]
		   [arg4 + 1]);
	    if (class147 != null && class147.aClass23_Sub5_1973 != null
		&& class147.aClass23_Sub5_1973.method289((byte) -115))
		arg1.method293((byte) -123, arg0, 128, 0, true,
			       class147.aClass23_Sub5_1973, 0);
	}
	if (arg3 < Class210.anInt3068 && arg4 < Class131_Sub8_Sub1.anInt6099) {
	    Class147 class147
		= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg2]
		   [arg3 + 1][arg4 + 1]);
	    if (class147 != null && class147.aClass23_Sub5_1973 != null
		&& class147.aClass23_Sub5_1973.method289((byte) -115))
		arg1.method293((byte) -118, arg0, 128, 128, true,
			       class147.aClass23_Sub5_1973, 0);
	}
	if (arg3 < Class210.anInt3068 && arg4 > 0) {
	    Class147 class147
		= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg2]
		   [arg3 + 1][arg4 - 1]);
	    if (class147 != null && class147.aClass23_Sub5_1973 != null
		&& class147.aClass23_Sub5_1973.method289((byte) -115))
		arg1.method293((byte) -117, arg0, -128, 128, true,
			       class147.aClass23_Sub5_1973, 0);
	}
    }
    
    public static void method86(byte arg0) {
	try {
	    Class131_Sub1_Sub4.aClass214_5541.method2783(-121);
	    if (arg0 == 101)
		anInt53++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"md.E(" + arg0 + ')');
	}
    }
    
    public static Class173 method87(int arg0, int arg1, byte arg2) {
	try {
	    anInt50++;
	    if (arg2 >= -99)
		return null;
	    Class173 class173 = Class190.method2615(arg1, -128);
	    if ((arg0 ^ 0xffffffff) == 0)
		return class173;
	    if (class173 == null || class173.aClass173Array2326 == null
		|| class173.aClass173Array2326.length <= arg0)
		return null;
	    return class173.aClass173Array2326[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("md.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	anInt55 = 127;
	anInt57 = -1;
	anIntArray58 = new int[50];
    }
}
