/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Date;

public class Class168
{
    public static Class173 aClass173_2239;
    public static String[] aStringArray2240;
    public static int anInt2241;
    public static int anInt2242;
    public static int anInt2243;
    public static int[] anIntArray2244;
    public static Class173 aClass173_2245;
    public static String[] aStringArray2246;
    public static int anInt2247;
    public static int anInt2248;
    public static int[] anIntArray2249 = new int[1000];
    public static int anInt2250;
    public static Class113 aClass113_2251;
    public static int anInt2252;
    public static int anInt2253;
    public static int anInt2254;
    public static int[][] anIntArrayArray2255;
    public static int anInt2256;
    public static Class43[] aClass43Array2257;
    public static Calendar aCalendar2258;
    public static int[] anIntArray2259;
    public static int anInt2260;
    public static int anInt2261;
    public static int[] anIntArray2262;
    public static Class214 aClass214_2263;
    public static String[] aStringArray2264;
    
    public static void method2432(int arg0, int arg1, int arg2) {
	Class131_Sub41_Sub15 class131_sub41_sub15
	    = Class131_Sub37.method1877(arg1, arg2, arg0, 1679818576);
	if (class131_sub41_sub15 != null) {
	    anIntArray2244 = new int[class131_sub41_sub15.anInt6361];
	    aStringArray2240 = new String[class131_sub41_sub15.anInt6362];
	    if (class131_sub41_sub15.anInt6354 == 15
		|| class131_sub41_sub15.anInt6354 == 17
		|| class131_sub41_sub15.anInt6354 == 16) {
		int i = 0;
		int i_0_ = 0;
		if (Class121_Sub3.aClass173_4000 != null) {
		    i = Class121_Sub3.aClass173_4000.anInt2442;
		    i_0_ = Class121_Sub3.aClass173_4000.anInt2343;
		}
		anIntArray2244[0] = Class144.anInt1914 - i;
		anIntArray2244[1] = Class23_Sub4_Sub3.anInt5005 - i_0_;
	    }
	    method2435(class131_sub41_sub15, 200000);
	}
    }
    
    public static void method2433(int arg0) {
	if (arg0 != -1 && Class126.method1108((byte) -92, arg0)) {
	    Class173[] class173s
		= Class131_Sub2_Sub9.aClass173ArrayArray5684[arg0];
	    for (int i = 0; i < class173s.length; i++) {
		Class173 class173 = class173s[i];
		if (class173.anObjectArray2426 != null) {
		    Class131_Sub14 class131_sub14 = new Class131_Sub14();
		    class131_sub14.aClass173_4276 = class173;
		    class131_sub14.anObjectArray4281
			= class173.anObjectArray2426;
		    method2436(class131_sub14, 2000000);
		}
	    }
	}
    }
    
    public static void method2434() {
	anIntArray2244 = null;
	aStringArray2240 = null;
	anIntArray2259 = null;
	anIntArrayArray2255 = null;
	anIntArray2249 = null;
	aStringArray2246 = null;
	aClass43Array2257 = null;
	aClass173_2245 = null;
	aClass173_2239 = null;
	aClass113_2251 = null;
	aCalendar2258 = null;
	aStringArray2264 = null;
	anIntArray2262 = null;
	aClass214_2263 = null;
    }
    
    public static void method2435(Class131_Sub41_Sub15 arg0, int arg1) {
	int i = 0;
	int i_1_ = 0;
	int i_2_ = -1;
	int[] is = arg0.anIntArray6369;
	int[] is_3_ = arg0.anIntArray6356;
	int i_4_ = -1;
	anInt2247 = 0;
	try {
	    int i_5_ = 0;
	    for (;;) {
		if (++i_5_ > arg1)
		    throw new RuntimeException("slow");
		i_4_ = is[++i_2_];
		if (i_4_ < 100) {
		    if (i_4_ == 0) {
			anIntArray2249[i++] = is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 1) {
			int i_6_ = is_3_[i_2_];
			anIntArray2249[i++]
			    = Class131_Sub2_Sub13.anIntArray5735[i_6_];
			continue;
		    }
		    if (i_4_ == 2) {
			int i_7_ = is_3_[i_2_];
			Class131_Sub41_Sub10.method1997(i_7_, -4791,
							anIntArray2249[--i]);
			continue;
		    }
		    if (i_4_ == 3) {
			aStringArray2246[i_1_++] = arg0.aStringArray6358[i_2_];
			continue;
		    }
		    if (i_4_ == 6) {
			i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 7) {
			i -= 2;
			if (anIntArray2249[i] != anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 8) {
			i -= 2;
			if (anIntArray2249[i] == anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 9) {
			i -= 2;
			if (anIntArray2249[i] < anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 10) {
			i -= 2;
			if (anIntArray2249[i] > anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 21) {
			if (anInt2247 != 0) {
			    Class43 class43 = aClass43Array2257[--anInt2247];
			    arg0 = class43.aClass131_Sub41_Sub15_582;
			    is = arg0.anIntArray6369;
			    is_3_ = arg0.anIntArray6356;
			    i_2_ = class43.anInt583;
			    anIntArray2244 = class43.anIntArray581;
			    aStringArray2240 = class43.aStringArray589;
			    continue;
			}
			break;
		    }
		    if (i_4_ == 25) {
			int i_8_ = is_3_[i_2_];
			anIntArray2249[i++] = Class63.method667(i_8_, -1);
			continue;
		    }
		    if (i_4_ == 27) {
			int i_9_ = is_3_[i_2_];
			Class63.method665(anIntArray2249[--i], i_9_, 4);
			continue;
		    }
		    if (i_4_ == 31) {
			i -= 2;
			if (anIntArray2249[i] <= anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 32) {
			i -= 2;
			if (anIntArray2249[i] >= anIntArray2249[i + 1])
			    i_2_ += is_3_[i_2_];
			continue;
		    }
		    if (i_4_ == 33) {
			anIntArray2249[i++] = anIntArray2244[is_3_[i_2_]];
			continue;
		    }
		    if (i_4_ == 34) {
			anIntArray2244[is_3_[i_2_]] = anIntArray2249[--i];
			continue;
		    }
		    if (i_4_ == 35) {
			aStringArray2246[i_1_++]
			    = aStringArray2240[is_3_[i_2_]];
			continue;
		    }
		    if (i_4_ == 36) {
			aStringArray2240[is_3_[i_2_]]
			    = aStringArray2246[--i_1_];
			continue;
		    }
		    if (i_4_ == 37) {
			int i_10_ = is_3_[i_2_];
			i_1_ -= i_10_;
			String string
			    = Class131_Sub2_Sub19.method1568(i_1_,
							     aStringArray2246,
							     i_10_,
							     (byte) 124);
			aStringArray2246[i_1_++] = string;
			continue;
		    }
		    if (i_4_ == 38) {
			i--;
			continue;
		    }
		    if (i_4_ == 39) {
			i_1_--;
			continue;
		    }
		    if (i_4_ == 40) {
			int i_11_ = is_3_[i_2_];
			Class131_Sub41_Sub15 class131_sub41_sub15
			    = Class131_Sub24.method1826(-25652, i_11_);
			if (class131_sub41_sub15 == null)
			    throw new RuntimeException();
			int[] is_12_ = new int[class131_sub41_sub15.anInt6361];
			String[] strings
			    = new String[class131_sub41_sub15.anInt6362];
			for (int i_13_ = 0;
			     i_13_ < class131_sub41_sub15.anInt6366; i_13_++)
			    is_12_[i_13_]
				= anIntArray2249[i - (class131_sub41_sub15
						      .anInt6366) + i_13_];
			for (int i_14_ = 0;
			     i_14_ < class131_sub41_sub15.anInt6359; i_14_++)
			    strings[i_14_]
				= (aStringArray2246
				   [(i_1_ - class131_sub41_sub15.anInt6359
				     + i_14_)]);
			i -= class131_sub41_sub15.anInt6366;
			i_1_ -= class131_sub41_sub15.anInt6359;
			Class43 class43 = new Class43();
			class43.aClass131_Sub41_Sub15_582 = arg0;
			class43.anInt583 = i_2_;
			class43.anIntArray581 = anIntArray2244;
			class43.aStringArray589 = aStringArray2240;
			if (anInt2247 >= aClass43Array2257.length)
			    throw new RuntimeException();
			aClass43Array2257[anInt2247++] = class43;
			arg0 = class131_sub41_sub15;
			is = arg0.anIntArray6369;
			is_3_ = arg0.anIntArray6356;
			i_2_ = -1;
			anIntArray2244 = is_12_;
			aStringArray2240 = strings;
			continue;
		    }
		    if (i_4_ == 42) {
			anIntArray2249[i++]
			    = Class131_Sub2_Sub33.anIntArray6025[is_3_[i_2_]];
			continue;
		    }
		    if (i_4_ == 43) {
			int i_15_ = is_3_[i_2_];
			Class131_Sub2_Sub33.anIntArray6025[i_15_]
			    = anIntArray2249[--i];
			Class189.method2600(124, i_15_);
			Class131_Sub6.aBoolean4156
			    |= Class43.aBooleanArray586[i_15_];
			continue;
		    }
		    if (i_4_ == 44) {
			int i_16_ = is_3_[i_2_] >> 16;
			int i_17_ = is_3_[i_2_] & 0xffff;
			int i_18_ = anIntArray2249[--i];
			if (i_18_ < 0 || i_18_ > 5000)
			    throw new RuntimeException();
			anIntArray2259[i_16_] = i_18_;
			int i_19_ = -1;
			if (i_17_ == 105)
			    i_19_ = 0;
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
			    anIntArrayArray2255[i_16_][i_20_] = i_19_;
			continue;
		    }
		    if (i_4_ == 45) {
			int i_21_ = is_3_[i_2_];
			int i_22_ = anIntArray2249[--i];
			if (i_22_ < 0 || i_22_ >= anIntArray2259[i_21_])
			    throw new RuntimeException();
			anIntArray2249[i++]
			    = anIntArrayArray2255[i_21_][i_22_];
			continue;
		    }
		    if (i_4_ == 46) {
			int i_23_ = is_3_[i_2_];
			i -= 2;
			int i_24_ = anIntArray2249[i];
			if (i_24_ < 0 || i_24_ >= anIntArray2259[i_23_])
			    throw new RuntimeException();
			anIntArrayArray2255[i_23_][i_24_]
			    = anIntArray2249[i + 1];
			continue;
		    }
		    if (i_4_ == 47) {
			String string = Class76.aStringArray1036[is_3_[i_2_]];
			if (string == null)
			    string = "null";
			aStringArray2246[i_1_++] = string;
			continue;
		    }
		    if (i_4_ == 48) {
			int i_25_ = is_3_[i_2_];
			Class76.aStringArray1036[i_25_]
			    = aStringArray2246[--i_1_];
			Class131_Sub10.method1694(i_25_, 95);
			continue;
		    }
		    if (i_4_ == 51) {
			Class180 class180
			    = arg0.aClass180Array6353[is_3_[i_2_]];
			Class131_Sub24 class131_sub24
			    = ((Class131_Sub24)
			       class180.method2521(61, (long) (anIntArray2249
							       [--i])));
			if (class131_sub24 != null)
			    i_2_ += class131_sub24.anInt4465;
			continue;
		    }
		}
		boolean bool;
		if (is_3_[i_2_] == 1)
		    bool = true;
		else
		    bool = false;
	    while_12_:
		do {
		    if (i_4_ < 300) {
			if (i_4_ == 100) {
			    i -= 3;
			    int i_26_ = anIntArray2249[i];
			    int i_27_ = anIntArray2249[i + 1];
			    int i_28_ = anIntArray2249[i + 2];
			    if (i_27_ == 0)
				throw new RuntimeException();
			    Class173 class173
				= Class190.method2615(i_26_, -120);
			    if (class173.aClass173Array2326 == null)
				class173.aClass173Array2326
				    = new Class173[i_28_ + 1];
			    if (class173.aClass173Array2326.length <= i_28_) {
				Class173[] class173s = new Class173[i_28_ + 1];
				for (int i_29_ = 0;
				     (i_29_
				      < class173.aClass173Array2326.length);
				     i_29_++)
				    class173s[i_29_]
					= class173.aClass173Array2326[i_29_];
				class173.aClass173Array2326 = class173s;
			    }
			    if (i_28_ > 0
				&& (class173.aClass173Array2326[i_28_ - 1]
				    == null))
				throw new RuntimeException("Gap at:" + (i_28_
									- 1));
			    Class173 class173_30_ = new Class173();
			    class173_30_.anInt2470 = i_27_;
			    class173_30_.anInt2456 = class173_30_.anInt2455
				= class173.anInt2455;
			    class173_30_.anInt2350 = i_28_;
			    class173_30_.aBoolean2355 = true;
			    class173.aClass173Array2326[i_28_] = class173_30_;
			    if (bool)
				aClass173_2239 = class173_30_;
			    else
				aClass173_2245 = class173_30_;
			    Class23_Sub4_Sub4.method383(-109, class173);
			    break;
			}
			if (i_4_ == 101) {
			    Class173 class173
				= bool ? aClass173_2239 : aClass173_2245;
			    if (class173.anInt2350 == -1) {
				if (bool)
				    throw new RuntimeException
					      ("Tried to .cc_delete static .active-component!");
				throw new RuntimeException
					  ("Tried to cc_delete static active-component!");
			    }
			    Class173 class173_31_
				= Class190.method2615(class173.anInt2455, -19);
			    class173_31_.aClass173Array2326[class173.anInt2350]
				= null;
			    Class23_Sub4_Sub4.method383(-110, class173_31_);
			    break;
			}
			if (i_4_ == 102) {
			    Class173 class173
				= Class190.method2615(anIntArray2249[--i], -8);
			    class173.aClass173Array2326 = null;
			    Class23_Sub4_Sub4.method383(-97, class173);
			    break;
			}
			if (i_4_ == 200) {
			    i -= 2;
			    int i_32_ = anIntArray2249[i];
			    int i_33_ = anIntArray2249[i + 1];
			    Class173 class173
				= InputStream_Sub1.method87(i_33_, i_32_,
							    (byte) -101);
			    if (class173 != null && i_33_ != -1) {
				anIntArray2249[i++] = 1;
				if (bool)
				    aClass173_2239 = class173;
				else
				    aClass173_2245 = class173;
			    } else
				anIntArray2249[i++] = 0;
			    break;
			}
			if (i_4_ == 201) {
			    int i_34_ = anIntArray2249[--i];
			    Class173 class173
				= Class190.method2615(i_34_, -125);
			    if (class173 != null) {
				anIntArray2249[i++] = 1;
				if (bool)
				    aClass173_2239 = class173;
				else
				    aClass173_2245 = class173;
			    } else
				anIntArray2249[i++] = 0;
			    break;
			}
		    } else if (i_4_ < 500) {
			if (i_4_ == 403) {
			    i -= 2;
			    int i_35_ = anIntArray2249[i];
			    int i_36_ = anIntArray2249[i + 1];
			    for (int i_37_ = 0;
				 i_37_ < Class131_Sub43.anIntArray4695.length;
				 i_37_++) {
				if (Class131_Sub43.anIntArray4695[i_37_]
				    == i_35_) {
				    Class166.aClass23_Sub4_Sub1_Sub2_2216
					.aClass188_6513
					.method2588(108, i_37_, i_36_);
				    break while_12_;
				}
			    }
			    for (int i_38_ = 0;
				 i_38_ < Class153_Sub2.anIntArray4785.length;
				 i_38_++) {
				if (Class153_Sub2.anIntArray4785[i_38_]
				    == i_35_) {
				    Class166.aClass23_Sub4_Sub1_Sub2_2216
					.aClass188_6513
					.method2588(-69, i_38_, i_36_);
				    break;
				}
			    }
			    break;
			}
			if (i_4_ == 404) {
			    i -= 2;
			    int i_39_ = anIntArray2249[i];
			    int i_40_ = anIntArray2249[i + 1];
			    Class166.aClass23_Sub4_Sub1_Sub2_2216
				.aClass188_6513
				.method2589(i_40_, 16384, i_39_);
			    break;
			}
			if (i_4_ == 410) {
			    boolean bool_41_ = anIntArray2249[--i] != 0;
			    Class166.aClass23_Sub4_Sub1_Sub2_2216
				.aClass188_6513
				.method2586(703608168, bool_41_);
			    break;
			}
		    } else if (i_4_ >= 1000 && i_4_ < 1100
			       || i_4_ >= 2000 && i_4_ < 2100) {
			Class173 class173;
			if (i_4_ >= 2000) {
			    i_4_ -= 1000;
			    class173 = Class190.method2615(anIntArray2249[--i],
							   -103);
			} else
			    class173 = bool ? aClass173_2239 : aClass173_2245;
			if (i_4_ == 1000) {
			    i -= 4;
			    class173.anInt2445 = anIntArray2249[i];
			    class173.anInt2432 = anIntArray2249[i + 1];
			    int i_42_ = anIntArray2249[i + 2];
			    if (i_42_ < 0)
				i_42_ = 0;
			    else if (i_42_ > 5)
				i_42_ = 5;
			    int i_43_ = anIntArray2249[i + 3];
			    if (i_43_ < 0)
				i_43_ = 0;
			    else if (i_43_ > 5)
				i_43_ = 5;
			    class173.aByte2469 = (byte) i_42_;
			    class173.aByte2311 = (byte) i_43_;
			    Class23_Sub4_Sub4.method383(-76, class173);
			    PacketStream.method1795(class173, 0);
			    if (class173.anInt2350 == -1)
				Class111.method953(11, class173.anInt2455);
			    break;
			}
			if (i_4_ == 1001) {
			    i -= 4;
			    class173.anInt2440 = anIntArray2249[i];
			    class173.anInt2322 = anIntArray2249[i + 1];
			    class173.anInt2423 = 0;
			    class173.anInt2397 = 0;
			    int i_44_ = anIntArray2249[i + 2];
			    if (i_44_ < 0)
				i_44_ = 0;
			    else if (i_44_ > 4)
				i_44_ = 4;
			    int i_45_ = anIntArray2249[i + 3];
			    if (i_45_ < 0)
				i_45_ = 0;
			    else if (i_45_ > 4)
				i_45_ = 4;
			    class173.aByte2356 = (byte) i_44_;
			    class173.aByte2341 = (byte) i_45_;
			    Class23_Sub4_Sub4.method383(-124, class173);
			    PacketStream.method1795(class173, 0);
			    if (class173.anInt2470 == 0)
				Class89.method838(105, class173, false);
			    break;
			}
			if (i_4_ == 1003) {
			    boolean bool_46_ = anIntArray2249[--i] == 1;
			    if (class173.aBoolean2404 != bool_46_) {
				class173.aBoolean2404 = bool_46_;
				Class23_Sub4_Sub4.method383(-83, class173);
			    }
			    if (class173.anInt2350 == -1)
				Class131_Sub2.method1470((byte) 107,
							 class173.anInt2455);
			    break;
			}
			if (i_4_ == 1004) {
			    i -= 2;
			    class173.anInt2438 = anIntArray2249[i];
			    class173.anInt2394 = anIntArray2249[i + 1];
			    Class23_Sub4_Sub4.method383(-77, class173);
			    PacketStream.method1795(class173, 0);
			    if (class173.anInt2470 == 0)
				Class89.method838(87, class173, false);
			    break;
			}
			if (i_4_ == 1005) {
			    class173.aBoolean2429 = anIntArray2249[--i] == 1;
			    break;
			}
		    } else if (i_4_ >= 1100 && i_4_ < 1200
			       || i_4_ >= 2100 && i_4_ < 2200) {
			Class173 class173;
			if (i_4_ >= 2000) {
			    i_4_ -= 1000;
			    class173
				= Class190.method2615(anIntArray2249[--i], -9);
			} else
			    class173 = bool ? aClass173_2239 : aClass173_2245;
			if (i_4_ == 1100) {
			    i -= 2;
			    class173.anInt2427 = anIntArray2249[i];
			    if (class173.anInt2427
				> class173.anInt2444 - class173.anInt2411)
				class173.anInt2427
				    = class173.anInt2444 - class173.anInt2411;
			    if (class173.anInt2427 < 0)
				class173.anInt2427 = 0;
			    class173.anInt2415 = anIntArray2249[i + 1];
			    if (class173.anInt2415
				> class173.anInt2479 - class173.anInt2437)
				class173.anInt2415
				    = class173.anInt2479 - class173.anInt2437;
			    if (class173.anInt2415 < 0)
				class173.anInt2415 = 0;
			    Class23_Sub4_Sub4.method383(-81, class173);
			    if (class173.anInt2350 == -1)
				Class66.method702(12, class173.anInt2455);
			    break;
			}
			if (i_4_ == 1101) {
			    class173.anInt2467 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-108, class173);
			    if (class173.anInt2350 == -1)
				Class19.method239((byte) -126,
						  class173.anInt2455);
			    break;
			}
			if (i_4_ == 1102) {
			    class173.aBoolean2367 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-77, class173);
			    break;
			}
			if (i_4_ == 1103) {
			    class173.anInt2369 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-86, class173);
			    break;
			}
			if (i_4_ == 1104) {
			    class173.anInt2471 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-104, class173);
			    break;
			}
			if (i_4_ == 1105) {
			    int i_47_ = anIntArray2249[--i];
			    if (class173.anInt2377 != i_47_) {
				class173.anInt2377 = i_47_;
				Class23_Sub4_Sub4.method383(-83, class173);
			    }
			    if (class173.anInt2350 == -1)
				Class131_Sub2_Sub27
				    .method1600(-1, class173.anInt2455);
			    break;
			}
			if (i_4_ == 1106) {
			    class173.anInt2381 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-78, class173);
			    break;
			}
			if (i_4_ == 1107) {
			    class173.aBoolean2434 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-114, class173);
			    break;
			}
			if (i_4_ == 1108) {
			    class173.anInt2416 = 1;
			    class173.anInt2359 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-83, class173);
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1109) {
			    i -= 6;
			    class173.anInt2412 = anIntArray2249[i];
			    class173.anInt2390 = anIntArray2249[i + 1];
			    class173.anInt2461 = anIntArray2249[i + 2];
			    class173.anInt2482 = anIntArray2249[i + 3];
			    class173.anInt2308 = anIntArray2249[i + 4];
			    class173.anInt2403 = anIntArray2249[i + 5];
			    Class23_Sub4_Sub4.method383(-102, class173);
			    if (class173.anInt2350 == -1) {
				Class1_Sub8.method140((byte) 121,
						      class173.anInt2455);
				Class131_Sub2_Sub10_Sub1
				    .method1520(10, class173.anInt2455);
			    }
			    break;
			}
			if (i_4_ == 1110) {
			    int i_48_ = anIntArray2249[--i];
			    if (class173.anInt2443 != i_48_) {
				class173.anInt2443 = i_48_;
				class173.anInt2484 = 0;
				class173.anInt2481 = 1;
				class173.anInt2338 = 0;
				Class23_Sub4_Sub4.method383(-83, class173);
			    }
			    if (class173.anInt2350 == -1)
				Class126.method1104(false, class173.anInt2455);
			    break;
			}
			if (i_4_ == 1111) {
			    class173.aBoolean2476 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-87, class173);
			    break;
			}
			if (i_4_ == 1112) {
			    String string = aStringArray2246[--i_1_];
			    if (!string.equals(class173.aString2357)) {
				class173.aString2357 = string;
				Class23_Sub4_Sub4.method383(-96, class173);
			    }
			    if (class173.anInt2350 == -1)
				Class131_Sub2_Sub18
				    .method1559(-82, class173.anInt2455);
			    break;
			}
			if (i_4_ == 1113) {
			    class173.anInt2375 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-124, class173);
			    break;
			}
			if (i_4_ == 1114) {
			    i -= 3;
			    class173.anInt2312 = anIntArray2249[i];
			    class173.anInt2297 = anIntArray2249[i + 1];
			    class173.anInt2364 = anIntArray2249[i + 2];
			    Class23_Sub4_Sub4.method383(-88, class173);
			    break;
			}
			if (i_4_ == 1115) {
			    class173.aBoolean2366 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-95, class173);
			    break;
			}
			if (i_4_ == 1116) {
			    class173.anInt2433 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-89, class173);
			    break;
			}
			if (i_4_ == 1117) {
			    class173.anInt2325 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-90, class173);
			    break;
			}
			if (i_4_ == 1118) {
			    class173.aBoolean2419 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-81, class173);
			    break;
			}
			if (i_4_ == 1119) {
			    class173.aBoolean2342 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-78, class173);
			    break;
			}
			if (i_4_ == 1120) {
			    i -= 2;
			    class173.anInt2444 = anIntArray2249[i];
			    class173.anInt2479 = anIntArray2249[i + 1];
			    Class23_Sub4_Sub4.method383(-77, class173);
			    if (class173.anInt2470 == 0)
				Class89.method838(127, class173, false);
			    break;
			}
			if (i_4_ == 1121) {
			    i -= 2;
			    class173.aShort2383 = (short) anIntArray2249[i];
			    class173.aShort2420
				= (short) anIntArray2249[i + 1];
			    Class23_Sub4_Sub4.method383(-102, class173);
			    break;
			}
			if (i_4_ == 1122) {
			    class173.aBoolean2422 = anIntArray2249[--i] == 1;
			    Class23_Sub4_Sub4.method383(-95, class173);
			    break;
			}
			if (i_4_ == 1123) {
			    class173.anInt2403 = anIntArray2249[--i];
			    Class23_Sub4_Sub4.method383(-81, class173);
			    if (class173.anInt2350 == -1)
				Class1_Sub8.method140((byte) 89,
						      class173.anInt2455);
			    break;
			}
			if (i_4_ == 1124) {
			    int i_49_ = anIntArray2249[--i];
			    class173.aBoolean2306 = i_49_ == 1;
			    Class23_Sub4_Sub4.method383(-126, class173);
			    break;
			}
			if (i_4_ == 1125) {
			    i -= 2;
			    class173.anInt2480 = anIntArray2249[i];
			    class173.anInt2459 = anIntArray2249[i + 1];
			    Class23_Sub4_Sub4.method383(-78, class173);
			    break;
			}
		    } else if (i_4_ >= 1200 && i_4_ < 1300
			       || i_4_ >= 2200 && i_4_ < 2300) {
			Class173 class173;
			if (i_4_ >= 2000) {
			    i_4_ -= 1000;
			    class173 = Class190.method2615(anIntArray2249[--i],
							   -15);
			} else
			    class173 = bool ? aClass173_2239 : aClass173_2245;
			Class23_Sub4_Sub4.method383(-108, class173);
			if (i_4_ == 1200 || i_4_ == 1205 || i_4_ == 1208
			    || i_4_ == 1209 || i_4_ == 1212 || i_4_ == 1213) {
			    i -= 2;
			    int i_50_ = anIntArray2249[i];
			    int i_51_ = anIntArray2249[i + 1];
			    if (class173.anInt2350 == -1) {
				Class33.method445(-100, class173.anInt2455);
				Class1_Sub8.method140((byte) -33,
						      class173.anInt2455);
				Class131_Sub2_Sub10_Sub1
				    .method1520(10, class173.anInt2455);
			    }
			    if (i_50_ == -1) {
				class173.anInt2416 = 1;
				class173.anInt2359 = -1;
				class173.anInt2421 = -1;
			    } else {
				class173.anInt2421 = i_50_;
				class173.anInt2305 = i_51_;
				if (i_4_ == 1208 || i_4_ == 1209)
				    class173.aBoolean2393 = true;
				else
				    class173.aBoolean2393 = false;
				Class29 class29
				    = Class131_Sub19.method1808(i_50_, false);
				class173.anInt2461 = class29.anInt317;
				class173.anInt2482 = class29.anInt303;
				class173.anInt2308 = class29.anInt356;
				class173.anInt2412 = class29.anInt367;
				class173.anInt2390 = class29.anInt363;
				class173.anInt2403 = class29.anInt337;
				if (i_4_ == 1205 || i_4_ == 1209)
				    class173.anInt2474 = 0;
				else if (i_4_ == 1212 || i_4_ == 1213)
				    class173.anInt2474 = 1;
				else
				    class173.anInt2474 = 2;
				if (class173.anInt2423 > 0)
				    class173.anInt2403
					= (class173.anInt2403 * 32
					   / class173.anInt2423);
				else if (class173.anInt2440 > 0)
				    class173.anInt2403
					= (class173.anInt2403 * 32
					   / class173.anInt2440);
			    }
			    break;
			}
			if (i_4_ == 1201) {
			    class173.anInt2416 = 2;
			    class173.anInt2359 = anIntArray2249[--i];
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1202) {
			    class173.anInt2416 = 3;
			    class173.anInt2359 = -1;
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1203) {
			    class173.anInt2416 = 6;
			    class173.anInt2359 = anIntArray2249[--i];
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1204) {
			    class173.anInt2416 = 5;
			    class173.anInt2359 = anIntArray2249[--i];
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1206) {
			    i -= 4;
			    class173.anInt2453 = anIntArray2249[i];
			    class173.anInt2458 = anIntArray2249[i + 1];
			    class173.anInt2382 = anIntArray2249[i + 2];
			    class173.anInt2314 = anIntArray2249[i + 3];
			    Class23_Sub4_Sub4.method383(-102, class173);
			    break;
			}
			if (i_4_ == 1207) {
			    i -= 2;
			    class173.anInt2409 = anIntArray2249[i];
			    class173.anInt2300 = anIntArray2249[i + 1];
			    Class23_Sub4_Sub4.method383(-98, class173);
			    break;
			}
			if (i_4_ == 1210) {
			    i -= 4;
			    class173.anInt2359 = anIntArray2249[i];
			    class173.anInt2457 = anIntArray2249[i + 1];
			    if (anIntArray2249[i + 2] == 1)
				class173.anInt2416 = 9;
			    else
				class173.anInt2416 = 8;
			    if (anIntArray2249[i + 3] == 1)
				class173.aBoolean2393 = true;
			    else
				class173.aBoolean2393 = false;
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
			if (i_4_ == 1211) {
			    class173.anInt2416 = 5;
			    class173.anInt2359 = 2047;
			    class173.anInt2457 = 0;
			    if (class173.anInt2350 == -1)
				Class173.method2468((byte) -97,
						    class173.anInt2455);
			    break;
			}
		    } else if (i_4_ >= 1300 && i_4_ < 1400
			       || i_4_ >= 2300 && i_4_ < 2400) {
			Class173 class173;
			if (i_4_ >= 2000) {
			    i_4_ -= 1000;
			    class173 = Class190.method2615(anIntArray2249[--i],
							   -98);
			} else
			    class173 = bool ? aClass173_2239 : aClass173_2245;
			if (i_4_ == 1300) {
			    int i_52_ = anIntArray2249[--i] - 1;
			    if (i_52_ < 0 || i_52_ > 9)
				i_1_--;
			    else
				class173.method2464(-37,
						    aStringArray2246[--i_1_],
						    i_52_);
			    break;
			}
			if (i_4_ == 1301) {
			    i -= 2;
			    int i_53_ = anIntArray2249[i];
			    int i_54_ = anIntArray2249[i + 1];
			    class173.aClass173_2345
				= InputStream_Sub1.method87(i_54_, i_53_,
							    (byte) -125);
			    break;
			}
			if (i_4_ == 1302) {
			    class173.aBoolean2436 = anIntArray2249[--i] == 1;
			    break;
			}
			if (i_4_ == 1303) {
			    class173.anInt2335 = anIntArray2249[--i];
			    break;
			}
			if (i_4_ == 1304) {
			    class173.anInt2319 = anIntArray2249[--i];
			    break;
			}
			if (i_4_ == 1305) {
			    class173.aString2391 = aStringArray2246[--i_1_];
			    break;
			}
			if (i_4_ == 1306) {
			    class173.aString2463 = aStringArray2246[--i_1_];
			    break;
			}
			if (i_4_ == 1307) {
			    class173.aStringArray2385 = null;
			    break;
			}
			if (i_4_ == 1308) {
			    class173.anInt2374 = anIntArray2249[--i];
			    class173.anInt2303 = anIntArray2249[--i];
			    break;
			}
			if (i_4_ == 1309) {
			    int i_55_ = anIntArray2249[--i];
			    int i_56_ = anIntArray2249[--i];
			    if (i_56_ >= 1 && i_56_ <= 10)
				class173.method2458(i_55_, i_56_ - 1, -30016);
			    break;
			}
			if (i_4_ == 1310) {
			    class173.aString2330 = aStringArray2246[--i_1_];
			    break;
			}
		    } else {
			if (i_4_ >= 1400 && i_4_ < 1500
			    || i_4_ >= 2400 && i_4_ < 2500) {
			    Class173 class173;
			    if (i_4_ >= 2000) {
				i_4_ -= 1000;
				class173
				    = Class190.method2615(anIntArray2249[--i],
							  -85);
			    } else
				class173
				    = bool ? aClass173_2239 : aClass173_2245;
			    String string = aStringArray2246[--i_1_];
			    int[] is_57_ = null;
			    if (string.length() > 0
				&& string.charAt(string.length() - 1) == 'Y') {
				int i_58_ = anIntArray2249[--i];
				if (i_58_ > 0) {
				    is_57_ = new int[i_58_];
				    while (i_58_-- > 0)
					is_57_[i_58_] = anIntArray2249[--i];
				}
				string
				    = string.substring(0, string.length() - 1);
			    }
			    Object[] objects = new Object[string.length() + 1];
			    for (int i_59_ = objects.length - 1; i_59_ >= 1;
				 i_59_--) {
				if (string.charAt(i_59_ - 1) == 's')
				    objects[i_59_] = aStringArray2246[--i_1_];
				else
				    objects[i_59_]
					= new Integer(anIntArray2249[--i]);
			    }
			    int i_60_ = anIntArray2249[--i];
			    if (i_60_ != -1)
				objects[0] = new Integer(i_60_);
			    else
				objects = null;
			    if (i_4_ == 1400)
				class173.anObjectArray2313 = objects;
			    else if (i_4_ == 1401)
				class173.anObjectArray2395 = objects;
			    else if (i_4_ == 1402)
				class173.anObjectArray2328 = objects;
			    else if (i_4_ == 1403)
				class173.anObjectArray2462 = objects;
			    else if (i_4_ == 1404)
				class173.anObjectArray2402 = objects;
			    else if (i_4_ == 1405)
				class173.anObjectArray2331 = objects;
			    else if (i_4_ == 1406)
				class173.anObjectArray2371 = objects;
			    else if (i_4_ == 1407) {
				class173.anObjectArray2439 = objects;
				class173.anIntArray2452 = is_57_;
			    } else if (i_4_ == 1408)
				class173.anObjectArray2316 = objects;
			    else if (i_4_ == 1409)
				class173.anObjectArray2465 = objects;
			    else if (i_4_ == 1410)
				class173.anObjectArray2405 = objects;
			    else if (i_4_ == 1411)
				class173.anObjectArray2318 = objects;
			    else if (i_4_ == 1412)
				class173.anObjectArray2446 = objects;
			    else if (i_4_ == 1414) {
				class173.anObjectArray2454 = objects;
				class173.anIntArray2472 = is_57_;
			    } else if (i_4_ == 1415) {
				class173.anObjectArray2410 = objects;
				class173.anIntArray2360 = is_57_;
			    } else if (i_4_ == 1416)
				class173.anObjectArray2408 = objects;
			    else if (i_4_ == 1417)
				class173.anObjectArray2351 = objects;
			    else if (i_4_ == 1418)
				class173.anObjectArray2344 = objects;
			    else if (i_4_ == 1419)
				class173.anObjectArray2447 = objects;
			    else if (i_4_ == 1420)
				class173.anObjectArray2464 = objects;
			    else if (i_4_ == 1421)
				class173.anObjectArray2483 = objects;
			    else if (i_4_ == 1422)
				class173.anObjectArray2336 = objects;
			    else if (i_4_ == 1423)
				class173.anObjectArray2475 = objects;
			    else if (i_4_ == 1424)
				class173.anObjectArray2352 = objects;
			    else if (i_4_ == 1425)
				class173.anObjectArray2399 = objects;
			    else if (i_4_ == 1426)
				class173.anObjectArray2348 = objects;
			    else if (i_4_ == 1427)
				class173.anObjectArray2362 = objects;
			    else if (i_4_ == 1428) {
				class173.anObjectArray2302 = objects;
				class173.anIntArray2388 = is_57_;
			    } else if (i_4_ == 1429) {
				class173.anObjectArray2296 = objects;
				class173.anIntArray2299 = is_57_;
			    }
			    class173.aBoolean2353 = true;
			    break;
			}
			if (i_4_ < 1600) {
			    Class173 class173
				= bool ? aClass173_2239 : aClass173_2245;
			    if (i_4_ == 1500) {
				anIntArray2249[i++] = class173.anInt2442;
				break;
			    }
			    if (i_4_ == 1501) {
				anIntArray2249[i++] = class173.anInt2343;
				break;
			    }
			    if (i_4_ == 1502) {
				anIntArray2249[i++] = class173.anInt2411;
				break;
			    }
			    if (i_4_ == 1503) {
				anIntArray2249[i++] = class173.anInt2437;
				break;
			    }
			    if (i_4_ == 1504) {
				anIntArray2249[i++]
				    = class173.aBoolean2404 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 1505) {
				anIntArray2249[i++] = class173.anInt2456;
				break;
			    }
			} else if (i_4_ < 1700) {
			    Class173 class173
				= bool ? aClass173_2239 : aClass173_2245;
			    if (i_4_ == 1600) {
				anIntArray2249[i++] = class173.anInt2427;
				break;
			    }
			    if (i_4_ == 1601) {
				anIntArray2249[i++] = class173.anInt2415;
				break;
			    }
			    if (i_4_ == 1602) {
				aStringArray2246[i_1_++]
				    = class173.aString2357;
				break;
			    }
			    if (i_4_ == 1603) {
				anIntArray2249[i++] = class173.anInt2444;
				break;
			    }
			    if (i_4_ == 1604) {
				anIntArray2249[i++] = class173.anInt2479;
				break;
			    }
			    if (i_4_ == 1605) {
				anIntArray2249[i++] = class173.anInt2403;
				break;
			    }
			    if (i_4_ == 1606) {
				anIntArray2249[i++] = class173.anInt2461;
				break;
			    }
			    if (i_4_ == 1607) {
				anIntArray2249[i++] = class173.anInt2308;
				break;
			    }
			    if (i_4_ == 1608) {
				anIntArray2249[i++] = class173.anInt2482;
				break;
			    }
			    if (i_4_ == 1609) {
				anIntArray2249[i++] = class173.anInt2369;
				break;
			    }
			    if (i_4_ == 1610) {
				anIntArray2249[i++] = class173.anInt2412;
				break;
			    }
			    if (i_4_ == 1611) {
				anIntArray2249[i++] = class173.anInt2390;
				break;
			    }
			    if (i_4_ == 1612) {
				anIntArray2249[i++] = class173.anInt2377;
				break;
			    }
			} else if (i_4_ < 1800) {
			    Class173 class173
				= bool ? aClass173_2239 : aClass173_2245;
			    if (i_4_ == 1700) {
				anIntArray2249[i++] = class173.anInt2421;
				break;
			    }
			    if (i_4_ == 1701) {
				if (class173.anInt2421 != -1)
				    anIntArray2249[i++] = class173.anInt2305;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 1702) {
				anIntArray2249[i++] = class173.anInt2350;
				break;
			    }
			} else if (i_4_ < 1900) {
			    Class173 class173
				= bool ? aClass173_2239 : aClass173_2245;
			    if (i_4_ == 1800) {
				anIntArray2249[i++]
				    = client.method66(class173)
					  .method1888((byte) -79);
				break;
			    }
			    if (i_4_ == 1801) {
				int i_61_ = anIntArray2249[--i];
				i_61_--;
				if (class173.aStringArray2385 == null
				    || (i_61_
					>= class173.aStringArray2385.length)
				    || (class173.aStringArray2385[i_61_]
					== null))
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class173.aStringArray2385[i_61_];
				break;
			    }
			    if (i_4_ == 1802) {
				if (class173.aString2391 == null)
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class173.aString2391;
				break;
			    }
			} else if (i_4_ < 2600) {
			    Class173 class173
				= Class190.method2615(anIntArray2249[--i],
						      -55);
			    if (i_4_ == 2500) {
				anIntArray2249[i++] = class173.anInt2442;
				break;
			    }
			    if (i_4_ == 2501) {
				anIntArray2249[i++] = class173.anInt2343;
				break;
			    }
			    if (i_4_ == 2502) {
				anIntArray2249[i++] = class173.anInt2411;
				break;
			    }
			    if (i_4_ == 2503) {
				anIntArray2249[i++] = class173.anInt2437;
				break;
			    }
			    if (i_4_ == 2504) {
				anIntArray2249[i++]
				    = class173.aBoolean2404 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 2505) {
				anIntArray2249[i++] = class173.anInt2456;
				break;
			    }
			} else if (i_4_ < 2700) {
			    Class173 class173
				= Class190.method2615(anIntArray2249[--i],
						      -69);
			    if (i_4_ == 2600) {
				anIntArray2249[i++] = class173.anInt2427;
				break;
			    }
			    if (i_4_ == 2601) {
				anIntArray2249[i++] = class173.anInt2415;
				break;
			    }
			    if (i_4_ == 2602) {
				aStringArray2246[i_1_++]
				    = class173.aString2357;
				break;
			    }
			    if (i_4_ == 2603) {
				anIntArray2249[i++] = class173.anInt2444;
				break;
			    }
			    if (i_4_ == 2604) {
				anIntArray2249[i++] = class173.anInt2479;
				break;
			    }
			    if (i_4_ == 2605) {
				anIntArray2249[i++] = class173.anInt2403;
				break;
			    }
			    if (i_4_ == 2606) {
				anIntArray2249[i++] = class173.anInt2461;
				break;
			    }
			    if (i_4_ == 2607) {
				anIntArray2249[i++] = class173.anInt2308;
				break;
			    }
			    if (i_4_ == 2608) {
				anIntArray2249[i++] = class173.anInt2482;
				break;
			    }
			    if (i_4_ == 2609) {
				anIntArray2249[i++] = class173.anInt2369;
				break;
			    }
			    if (i_4_ == 2610) {
				anIntArray2249[i++] = class173.anInt2412;
				break;
			    }
			    if (i_4_ == 2611) {
				anIntArray2249[i++] = class173.anInt2390;
				break;
			    }
			    if (i_4_ == 2612) {
				anIntArray2249[i++] = class173.anInt2377;
				break;
			    }
			} else if (i_4_ < 2800) {
			    if (i_4_ == 2700) {
				Class173 class173
				    = Class190.method2615(anIntArray2249[--i],
							  -58);
				anIntArray2249[i++] = class173.anInt2421;
				break;
			    }
			    if (i_4_ == 2701) {
				Class173 class173
				    = Class190.method2615(anIntArray2249[--i],
							  -74);
				if (class173.anInt2421 != -1)
				    anIntArray2249[i++] = class173.anInt2305;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 2702) {
				int i_62_ = anIntArray2249[--i];
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       Class83.aClass180_1096
					   .method2521(109, (long) i_62_));
				if (class131_sub33 != null)
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 2703) {
				Class173 class173
				    = Class190.method2615(anIntArray2249[--i],
							  -98);
				if (class173.aClass173Array2326 == null)
				    anIntArray2249[i++] = 0;
				else {
				    int i_63_
					= class173.aClass173Array2326.length;
				    for (int i_64_ = 0;
					 i_64_ < (class173
						  .aClass173Array2326).length;
					 i_64_++) {
					if (class173.aClass173Array2326[i_64_]
					    == null) {
					    i_63_ = i_64_;
					    break;
					}
				    }
				    anIntArray2249[i++] = i_63_;
				}
				break;
			    }
			    if (i_4_ == 2704 || i_4_ == 2705) {
				i -= 2;
				int i_65_ = anIntArray2249[i];
				int i_66_ = anIntArray2249[i + 1];
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       Class83.aClass180_1096
					   .method2521(-73, (long) i_65_));
				if (class131_sub33 != null
				    && class131_sub33.anInt4556 == i_66_)
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			} else if (i_4_ < 2900) {
			    Class173 class173
				= Class190.method2615(anIntArray2249[--i],
						      -75);
			    if (i_4_ == 2800) {
				anIntArray2249[i++]
				    = client.method66(class173)
					  .method1888((byte) 94);
				break;
			    }
			    if (i_4_ == 2801) {
				int i_67_ = anIntArray2249[--i];
				i_67_--;
				if (class173.aStringArray2385 == null
				    || (i_67_
					>= class173.aStringArray2385.length)
				    || (class173.aStringArray2385[i_67_]
					== null))
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class173.aStringArray2385[i_67_];
				break;
			    }
			    if (i_4_ == 2802) {
				if (class173.aString2391 == null)
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class173.aString2391;
				break;
			    }
			} else if (i_4_ < 3200) {
			    if (i_4_ == 3100) {
				String string = aStringArray2246[--i_1_];
				Class186.method2562(string, (byte) 53);
				break;
			    }
			    if (i_4_ == 3101) {
				i -= 2;
				Class131_Sub41_Sub17.method2043
				    (anIntArray2249[i], (byte) 101,
				     anIntArray2249[i + 1],
				     Class166.aClass23_Sub4_Sub1_Sub2_2216);
				break;
			    }
			    if (i_4_ == 3103) {
				Class131_Sub2.method1458(0, true);
				break;
			    }
			    if (i_4_ == 3104) {
				String string = aStringArray2246[--i_1_];
				int i_68_ = 0;
				if (Class131_Sub41_Sub18
					.method2055(string, (byte) -38))
				    i_68_ = Class161.method2393(string,
								(byte) 20);
				anInt2248++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(206);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeInt(i_68_);
				break;
			    }
			    if (i_4_ == 3105) {
				String string = aStringArray2246[--i_1_];
				anInt2241++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(172);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(string.length() + 1);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string, (byte) -117);
				break;
			    }
			    if (i_4_ == 3106) {
				String string = aStringArray2246[--i_1_];
				anInt2256++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(197);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(string.length() + 1);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string, (byte) -107);
				break;
			    }
			    if (i_4_ == 3107) {
				int i_69_ = anIntArray2249[--i];
				String string = aStringArray2246[--i_1_];
				Class131_Sub2_Sub5.method1490(i_69_, string,
							      (byte) -116);
				break;
			    }
			    if (i_4_ == 3108) {
				i -= 3;
				int i_70_ = anIntArray2249[i];
				int i_71_ = anIntArray2249[i + 1];
				int i_72_ = anIntArray2249[i + 2];
				Class173 class173
				    = Class190.method2615(i_72_, -126);
				Class1_Sub2.method104(class173, i_70_, i_71_,
						      -117);
				break;
			    }
			    if (i_4_ == 3109) {
				i -= 2;
				int i_73_ = anIntArray2249[i];
				int i_74_ = anIntArray2249[i + 1];
				Class173 class173
				    = bool ? aClass173_2239 : aClass173_2245;
				Class1_Sub2.method104(class173, i_73_, i_74_,
						      -94);
				break;
			    }
			    if (i_4_ == 3110) {
				int i_75_ = anIntArray2249[--i];
				anInt2261++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(139);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeShort(i_75_);
				break;
			    }
			    if (i_4_ == 3111) {
				i -= 2;
				int i_76_ = anIntArray2249[i];
				int i_77_ = anIntArray2249[i + 1];
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       Class83.aClass180_1096
					   .method2521(-126, (long) i_76_));
				if (class131_sub33 != null)
				    Class204.method2730((class131_sub33
							 .anInt4556) != i_77_,
							25697, class131_sub33,
							true);
				Class131_Sub7.method1669(i_77_, 3, true, false,
							 i_76_);
				break;
			    }
			    if (i_4_ == 3112) {
				i--;
				int i_78_ = anIntArray2249[i];
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       Class83.aClass180_1096
					   .method2521(85, (long) i_78_));
				if (class131_sub33 != null
				    && class131_sub33.anInt4555 == 3)
				    Class204.method2730(true, 25697,
							class131_sub33, true);
				break;
			    }
			} else if (i_4_ < 3300) {
			    if (i_4_ == 3200) {
				i -= 3;
				Class131_Sub2_Sub13.method1535
				    (0, 255, anIntArray2249[i + 2],
				     anIntArray2249[i], anIntArray2249[i + 1]);
				break;
			    }
			    if (i_4_ == 3201) {
				Class111.method954(true, anIntArray2249[--i],
						   255);
				break;
			    }
			    if (i_4_ == 3202) {
				i -= 2;
				Class135.method2102(anIntArray2249[i], 255, 1,
						    anIntArray2249[i + 1]);
				break;
			    }
			} else if (i_4_ < 3400) {
			    if (i_4_ == 3300) {
				anIntArray2249[i++] = Class125.anInt1632;
				break;
			    }
			    if (i_4_ == 3301) {
				i -= 2;
				int i_79_ = anIntArray2249[i];
				int i_80_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class115.method983(i_80_, 1923345732,
							 i_79_);
				break;
			    }
			    if (i_4_ == 3302) {
				i -= 2;
				int i_81_ = anIntArray2249[i];
				int i_82_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class131_Sub41_Sub21_Sub2
					  .method2085(0, i_81_, i_82_);
				break;
			    }
			    if (i_4_ == 3303) {
				i -= 2;
				int i_83_ = anIntArray2249[i];
				int i_84_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class131_Sub41_Sub18
					  .method2052(true, i_84_, i_83_);
				break;
			    }
			    if (i_4_ == 3304) {
				int i_85_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class103.method907(5, i_85_).anInt6249;
				break;
			    }
			    if (i_4_ == 3305) {
				int i_86_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class2.anIntArray86[i_86_];
				break;
			    }
			    if (i_4_ == 3306) {
				int i_87_ = anIntArray2249[--i];
				anIntArray2249[i++] = (Class131_Sub2_Sub29
						       .anIntArray5975[i_87_]);
				break;
			    }
			    if (i_4_ == 3307) {
				int i_88_ = anIntArray2249[--i];
				anIntArray2249[i++] = (Class131_Sub2_Sub10_Sub1
						       .anIntArray6539[i_88_]);
				break;
			    }
			    if (i_4_ == 3308) {
				int i_89_ = Class29.anInt300;
				int i_90_
				    = (((Class166.aClass23_Sub4_Sub1_Sub2_2216
					 .anInt3733)
					>> 7)
				       + Class92.regionX);
				int i_91_
				    = (((Class166.aClass23_Sub4_Sub1_Sub2_2216
					 .anInt3747)
					>> 7)
				       + Class64.regionY);
				anIntArray2249[i++]
				    = (i_89_ << 28) + (i_90_ << 14) + i_91_;
				break;
			    }
			    if (i_4_ == 3309) {
				int i_92_ = anIntArray2249[--i];
				anIntArray2249[i++] = i_92_ >> 14 & 0x3fff;
				break;
			    }
			    if (i_4_ == 3310) {
				int i_93_ = anIntArray2249[--i];
				anIntArray2249[i++] = i_93_ >> 28;
				break;
			    }
			    if (i_4_ == 3311) {
				int i_94_ = anIntArray2249[--i];
				anIntArray2249[i++] = i_94_ & 0x3fff;
				break;
			    }
			    if (i_4_ == 3312) {
				anIntArray2249[i++]
				    = Class131_Sub9.aBoolean4218 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3313) {
				i -= 2;
				int i_95_ = anIntArray2249[i] + 32768;
				int i_96_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class115.method983(i_96_, 1923345732,
							 i_95_);
				break;
			    }
			    if (i_4_ == 3314) {
				i -= 2;
				int i_97_ = anIntArray2249[i] + 32768;
				int i_98_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class131_Sub41_Sub21_Sub2
					  .method2085(0, i_97_, i_98_);
				break;
			    }
			    if (i_4_ == 3315) {
				i -= 2;
				int i_99_ = anIntArray2249[i] + 32768;
				int i_100_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class131_Sub41_Sub18
					  .method2052(true, i_100_, i_99_);
				break;
			    }
			    if (i_4_ == 3316) {
				if (Class56.anInt745 >= 2)
				    anIntArray2249[i++] = Class56.anInt745;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3317) {
				anIntArray2249[i++] = Class160.anInt2129;
				break;
			    }
			    if (i_4_ == 3318) {
				anIntArray2249[i++] = Class110_Sub2.anInt3914;
				break;
			    }
			    if (i_4_ == 3321) {
				anIntArray2249[i++] = Class183_Sub1.anInt4965;
				break;
			    }
			    if (i_4_ == 3322) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub10.anInt5703;
				break;
			    }
			    if (i_4_ == 3323) {
				if (Class105.anInt1377 >= 5
				    && Class105.anInt1377 <= 9)
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3324) {
				if (Class105.anInt1377 >= 5
				    && Class105.anInt1377 <= 9)
				    anIntArray2249[i++] = Class105.anInt1377;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3325) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub1.aBoolean5570 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3326) {
				anIntArray2249[i++]
				    = (Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .anInt6515);
				break;
			    }
			    if (i_4_ == 3327) {
				anIntArray2249[i++]
				    = (Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .aClass188_6513.aBoolean2744) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3328) {
				anIntArray2249[i++]
				    = (Class103.aBoolean1353
				       && !Class60.aBoolean786) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3329) {
				anIntArray2249[i++]
				    = Class183_Sub1.aBoolean4956 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3330) {
				int i_101_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class1_Sub7.method126(5, i_101_);
				break;
			    }
			    if (i_4_ == 3331) {
				i -= 2;
				int i_102_ = anIntArray2249[i];
				int i_103_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class175.method2481(i_103_, i_102_, 0,
							  false);
				break;
			    }
			    if (i_4_ == 3332) {
				i -= 2;
				int i_104_ = anIntArray2249[i];
				int i_105_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = Class175.method2481(i_105_, i_104_, 0,
							  true);
				break;
			    }
			    if (i_4_ == 3333) {
				anIntArray2249[i++] = Class90.anInt1175;
				break;
			    }
			    if (i_4_ == 3335) {
				anIntArray2249[i++]
				    = Class1_Sub7_Sub1.anInt5208;
				break;
			    }
			    if (i_4_ == 3336) {
				i -= 4;
				int i_106_ = anIntArray2249[i];
				int i_107_ = anIntArray2249[i + 1];
				int i_108_ = anIntArray2249[i + 2];
				int i_109_ = anIntArray2249[i + 3];
				i_106_ += i_107_ << 14;
				i_106_ += i_108_ << 28;
				i_106_ += i_109_;
				anIntArray2249[i++] = i_106_;
				break;
			    }
			    if (i_4_ == 3337) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub22.anInt5863;
				break;
			    }
			    if (i_4_ == 3338) {
				anIntArray2249[i++]
				    = Class204.method2733(-65536);
				break;
			    }
			} else if (i_4_ < 3500) {
			    if (i_4_ == 3400) {
				i -= 2;
				int i_110_ = anIntArray2249[i];
				int i_111_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub14 class131_sub41_sub14
				    = Class161.method2396(256, i_110_);
				aStringArray2246[i_1_++]
				    = class131_sub41_sub14
					  .method2028((byte) -49, i_111_);
				break;
			    }
			    if (i_4_ == 3408) {
				i -= 4;
				int i_112_ = anIntArray2249[i];
				int i_113_ = anIntArray2249[i + 1];
				int i_114_ = anIntArray2249[i + 2];
				int i_115_ = anIntArray2249[i + 3];
				Class131_Sub41_Sub14 class131_sub41_sub14
				    = Class161.method2396(256, i_114_);
				if (class131_sub41_sub14.aChar6337 != i_112_
				    || (class131_sub41_sub14.aChar6345
					!= i_113_))
				    throw new RuntimeException("C3408-1");
				if (i_113_ == 115)
				    aStringArray2246[i_1_++]
					= class131_sub41_sub14
					      .method2028((byte) -49, i_115_);
				else
				    anIntArray2249[i++]
					= class131_sub41_sub14
					      .method2032(i_115_, 126);
				break;
			    }
			    if (i_4_ == 3409) {
				i -= 3;
				int i_116_ = anIntArray2249[i];
				int i_117_ = anIntArray2249[i + 1];
				int i_118_ = anIntArray2249[i + 2];
				if (i_117_ == -1)
				    throw new RuntimeException("C3409-2");
				Class131_Sub41_Sub14 class131_sub41_sub14
				    = Class161.method2396(256, i_117_);
				if (class131_sub41_sub14.aChar6345 != i_116_)
				    throw new RuntimeException("C3409-1");
				anIntArray2249[i++]
				    = (class131_sub41_sub14
					   .method2026(i_118_, (byte) 29)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 3410) {
				int i_119_ = anIntArray2249[--i];
				String string = aStringArray2246[--i_1_];
				if (i_119_ == -1)
				    throw new RuntimeException("C3410-2");
				Class131_Sub41_Sub14 class131_sub41_sub14
				    = Class161.method2396(256, i_119_);
				if (class131_sub41_sub14.aChar6345 != 's')
				    throw new RuntimeException("C3410-1");
				anIntArray2249[i++]
				    = (class131_sub41_sub14
					   .method2022((byte) -104, string)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 3411) {
				int i_120_ = anIntArray2249[--i];
				Class131_Sub41_Sub14 class131_sub41_sub14
				    = Class161.method2396(256, i_120_);
				anIntArray2249[i++]
				    = class131_sub41_sub14.aClass180_6348
					  .method2522(17167);
				break;
			    }
			} else if (i_4_ < 3700) {
			    if (i_4_ == 3600) {
				if (Applet_Sub1.anInt18 == 0)
				    anIntArray2249[i++] = -2;
				else if (Applet_Sub1.anInt18 == 1)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++] = Class33.anInt469;
				break;
			    }
			    if (i_4_ == 3601) {
				int i_121_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 == 2
				    && i_121_ < Class33.anInt469) {
				    aStringArray2246[i_1_++]
					= (Class23_Sub2.aStringArray3707
					   [i_121_]);
				    if (Class131_Sub25.aStringArray4477[i_121_]
					!= null)
					aStringArray2246[i_1_++]
					    = (Class131_Sub25.aStringArray4477
					       [i_121_]);
				    else
					aStringArray2246[i_1_++] = "";
				} else {
				    aStringArray2246[i_1_++] = "";
				    aStringArray2246[i_1_++] = "";
				}
				break;
			    }
			    if (i_4_ == 3602) {
				int i_122_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 == 2
				    && i_122_ < Class33.anInt469)
				    anIntArray2249[i++]
					= Class143.anIntArray1906[i_122_];
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3603) {
				int i_123_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 == 2
				    && i_123_ < Class33.anInt469)
				    anIntArray2249[i++]
					= Class20.anIntArray234[i_123_];
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3604) {
				String string = aStringArray2246[--i_1_];
				int i_124_ = anIntArray2249[--i];
				Class131_Sub24.method1825(i_124_, 1, string);
				break;
			    }
			    if (i_4_ == 3605) {
				String string = aStringArray2246[--i_1_];
				Class131_Sub41_Sub3.method1935(17923, string);
				break;
			    }
			    if (i_4_ == 3606) {
				String string = aStringArray2246[--i_1_];
				Class131_Sub2_Sub10.method1514(string,
							       (byte) -105);
				break;
			    }
			    if (i_4_ == 3607) {
				String string = aStringArray2246[--i_1_];
				Class164.method2408(string, false,
						    (byte) -122);
				break;
			    }
			    if (i_4_ == 3608) {
				String string = aStringArray2246[--i_1_];
				Class131_Sub19.method1810(string, (byte) -120);
				break;
			    }
			    if (i_4_ == 3609) {
				String string = aStringArray2246[--i_1_];
				if (string.startsWith("<img=0>")
				    || string.startsWith("<img=1>"))
				    string = string.substring(7);
				anIntArray2249[i++]
				    = (Class23_Sub4_Sub1_Sub1
					   .method348((byte) 91, string)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 3610) {
				int i_125_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 == 2
				    && i_125_ < Class33.anInt469)
				    aStringArray2246[i_1_++]
					= Class89.aStringArray3267[i_125_];
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3611) {
				if (Class193.aString2840 != null)
				    aStringArray2246[i_1_++]
					= Class22.method267((Class193
							     .aString2840),
							    (byte) -39);
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3612) {
				if (Class193.aString2840 != null)
				    anIntArray2249[i++] = Class74.anInt999;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3613) {
				int i_126_ = anIntArray2249[--i];
				if (Class193.aString2840 != null
				    && i_126_ < Class74.anInt999)
				    aStringArray2246[i_1_++]
					= (Canvas_Sub1.aClass184Array46[i_126_]
					   .aString2628);
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3614) {
				int i_127_ = anIntArray2249[--i];
				if (Class193.aString2840 != null
				    && i_127_ < Class74.anInt999)
				    anIntArray2249[i++]
					= (Canvas_Sub1.aClass184Array46[i_127_]
					   .anInt2632);
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3615) {
				int i_128_ = anIntArray2249[--i];
				if (Class193.aString2840 != null
				    && i_128_ < Class74.anInt999)
				    anIntArray2249[i++]
					= (Canvas_Sub1.aClass184Array46[i_128_]
					   .aByte2627);
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3616) {
				anIntArray2249[i++] = Class207.aByte3023;
				break;
			    }
			    if (i_4_ == 3617) {
				String string = aStringArray2246[--i_1_];
				Class37.method495(0, string);
				break;
			    }
			    if (i_4_ == 3618) {
				anIntArray2249[i++] = Class85.aByte1118;
				break;
			    }
			    if (i_4_ == 3619) {
				String string = aStringArray2246[--i_1_];
				Class131_Sub30.method1853((byte) 126, string);
				break;
			    }
			    if (i_4_ == 3620) {
				Class131_Sub41_Sub17.method2045((byte) -79);
				break;
			    }
			    if (i_4_ == 3621) {
				if (Applet_Sub1.anInt18 == 0)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++] = Class118.anInt1551;
				break;
			    }
			    if (i_4_ == 3622) {
				int i_129_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 != 0
				    && i_129_ < Class118.anInt1551) {
				    aStringArray2246[i_1_++]
					= Class89.aStringArray3255[i_129_];
				    if ((Class23_Sub1_Sub1.aStringArray5090
					 [i_129_])
					!= null)
					aStringArray2246[i_1_++]
					    = (Class23_Sub1_Sub1
					       .aStringArray5090[i_129_]);
				    else
					aStringArray2246[i_1_++] = "";
				} else {
				    aStringArray2246[i_1_++] = "";
				    aStringArray2246[i_1_++] = "";
				}
				break;
			    }
			    if (i_4_ == 3623) {
				String string = aStringArray2246[--i_1_];
				if (string.startsWith("<img=0>")
				    || string.startsWith("<img=1>"))
				    string = string.substring(7);
				anIntArray2249[i++]
				    = Class214.method2787(string, -87) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3624) {
				int i_130_ = anIntArray2249[--i];
				if (Canvas_Sub1.aClass184Array46 != null
				    && i_130_ < Class74.anInt999
				    && (Canvas_Sub1.aClass184Array46
					    [i_130_].aString2620
					    .equalsIgnoreCase
					(Class166.aClass23_Sub4_Sub1_Sub2_2216
					 .aString6491)))
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3625) {
				if (Class131_Sub27.aString4488 != null)
				    aStringArray2246[i_1_++]
					= Class131_Sub27.aString4488;
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3626) {
				int i_131_ = anIntArray2249[--i];
				if (Class193.aString2840 != null
				    && i_131_ < Class74.anInt999)
				    aStringArray2246[i_1_++]
					= (Canvas_Sub1.aClass184Array46[i_131_]
					   .aString2634);
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3627) {
				int i_132_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 == 2 && i_132_ >= 0
				    && i_132_ < Class33.anInt469)
				    anIntArray2249[i++]
					= (Class183_Sub1.aBooleanArray4952
					   [i_132_]) ? 1 : 0;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 3628) {
				String string = aStringArray2246[--i_1_];
				if (string.startsWith("<img=0>")
				    || string.startsWith("<img=1>"))
				    string = string.substring(7);
				anIntArray2249[i++]
				    = Class63.method658(0, string);
				break;
			    }
			    if (i_4_ == 3629) {
				anIntArray2249[i++] = Class131_Sub41.anInt4669;
				break;
			    }
			    if (i_4_ == 3630) {
				String string = aStringArray2246[--i_1_];
				Class164.method2408(string, true, (byte) -92);
				break;
			    }
			    if (i_4_ == 3631) {
				int i_133_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class111.aBooleanArray3275[i_133_] ? 1
				       : 0);
				break;
			    }
			    if (i_4_ == 3632) {
				int i_134_ = anIntArray2249[--i];
				if (Class193.aString2840 != null
				    && i_134_ < Class74.anInt999)
				    aStringArray2246[i_1_++]
					= (Canvas_Sub1.aClass184Array46[i_134_]
					   .aString2620);
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 3633) {
				int i_135_ = anIntArray2249[--i];
				if (Applet_Sub1.anInt18 != 0
				    && i_135_ < Class118.anInt1551)
				    aStringArray2246[i_1_++]
					= Class18.aStringArray194[i_135_];
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			} else if (i_4_ < 4000) {
			    if (i_4_ == 3903) {
				int i_136_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class23_Sub1.aClass52Array3699
					  [i_136_].method600((byte) -118);
				break;
			    }
			    if (i_4_ == 3904) {
				int i_137_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class23_Sub1.aClass52Array3699[i_137_]
				       .anInt688);
				break;
			    }
			    if (i_4_ == 3905) {
				int i_138_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class23_Sub1.aClass52Array3699[i_138_]
				       .anInt685);
				break;
			    }
			    if (i_4_ == 3906) {
				int i_139_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class23_Sub1.aClass52Array3699[i_139_]
				       .anInt692);
				break;
			    }
			    if (i_4_ == 3907) {
				int i_140_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class23_Sub1.aClass52Array3699[i_140_]
				       .anInt697);
				break;
			    }
			    if (i_4_ == 3908) {
				int i_141_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class23_Sub1.aClass52Array3699[i_141_]
				       .anInt690);
				break;
			    }
			    if (i_4_ == 3910) {
				int i_142_ = anIntArray2249[--i];
				int i_143_ = Class23_Sub1.aClass52Array3699
						 [i_142_].method599(true);
				anIntArray2249[i++] = i_143_ == 0 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3911) {
				int i_144_ = anIntArray2249[--i];
				int i_145_ = Class23_Sub1.aClass52Array3699
						 [i_144_].method599(true);
				anIntArray2249[i++] = i_145_ == 2 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3912) {
				int i_146_ = anIntArray2249[--i];
				int i_147_ = Class23_Sub1.aClass52Array3699
						 [i_146_].method599(true);
				anIntArray2249[i++] = i_147_ == 5 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 3913) {
				int i_148_ = anIntArray2249[--i];
				int i_149_ = Class23_Sub1.aClass52Array3699
						 [i_148_].method599(true);
				anIntArray2249[i++] = i_149_ == 1 ? 1 : 0;
				break;
			    }
			} else if (i_4_ < 4100) {
			    if (i_4_ == 4000) {
				i -= 2;
				int i_150_ = anIntArray2249[i];
				int i_151_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_150_ + i_151_;
				break;
			    }
			    if (i_4_ == 4001) {
				i -= 2;
				int i_152_ = anIntArray2249[i];
				int i_153_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_152_ - i_153_;
				break;
			    }
			    if (i_4_ == 4002) {
				i -= 2;
				int i_154_ = anIntArray2249[i];
				int i_155_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_154_ * i_155_;
				break;
			    }
			    if (i_4_ == 4003) {
				i -= 2;
				int i_156_ = anIntArray2249[i];
				int i_157_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_156_ / i_157_;
				break;
			    }
			    if (i_4_ == 4004) {
				int i_158_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (int) (Math.random() * (double) i_158_);
				break;
			    }
			    if (i_4_ == 4005) {
				int i_159_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (int) (Math.random()
					     * (double) (i_159_ + 1));
				break;
			    }
			    if (i_4_ == 4006) {
				i -= 5;
				int i_160_ = anIntArray2249[i];
				int i_161_ = anIntArray2249[i + 1];
				int i_162_ = anIntArray2249[i + 2];
				int i_163_ = anIntArray2249[i + 3];
				int i_164_ = anIntArray2249[i + 4];
				anIntArray2249[i++]
				    = i_160_ + ((i_161_ - i_160_)
						* (i_164_ - i_162_)
						/ (i_163_ - i_162_));
				break;
			    }
			    if (i_4_ == 4007) {
				i -= 2;
				long l = (long) anIntArray2249[i];
				long l_165_ = (long) anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (int) (l + l * l_165_ / 100L);
				break;
			    }
			    if (i_4_ == 4008) {
				i -= 2;
				int i_166_ = anIntArray2249[i];
				int i_167_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_166_ | 1 << i_167_;
				break;
			    }
			    if (i_4_ == 4009) {
				i -= 2;
				int i_168_ = anIntArray2249[i];
				int i_169_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = i_168_ & -1 - (1 << i_169_);
				break;
			    }
			    if (i_4_ == 4010) {
				i -= 2;
				int i_170_ = anIntArray2249[i];
				int i_171_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (i_170_ & 1 << i_171_) != 0 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 4011) {
				i -= 2;
				int i_172_ = anIntArray2249[i];
				int i_173_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_172_ % i_173_;
				break;
			    }
			    if (i_4_ == 4012) {
				i -= 2;
				int i_174_ = anIntArray2249[i];
				int i_175_ = anIntArray2249[i + 1];
				if (i_174_ == 0)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (int) Math.pow((double) i_174_,
							 (double) i_175_);
				break;
			    }
			    if (i_4_ == 4013) {
				i -= 2;
				int i_176_ = anIntArray2249[i];
				int i_177_ = anIntArray2249[i + 1];
				if (i_176_ == 0)
				    anIntArray2249[i++] = 0;
				else if (i_177_ == 0)
				    anIntArray2249[i++] = 2147483647;
				else
				    anIntArray2249[i++]
					= (int) Math.pow((double) i_176_,
							 (1.0
							  / (double) i_177_));
				break;
			    }
			    if (i_4_ == 4014) {
				i -= 2;
				int i_178_ = anIntArray2249[i];
				int i_179_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_178_ & i_179_;
				break;
			    }
			    if (i_4_ == 4015) {
				i -= 2;
				int i_180_ = anIntArray2249[i];
				int i_181_ = anIntArray2249[i + 1];
				anIntArray2249[i++] = i_180_ | i_181_;
				break;
			    }
			    if (i_4_ == 4016) {
				i -= 2;
				int i_182_ = anIntArray2249[i];
				int i_183_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = i_182_ < i_183_ ? i_182_ : i_183_;
				break;
			    }
			    if (i_4_ == 4017) {
				i -= 2;
				int i_184_ = anIntArray2249[i];
				int i_185_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = i_184_ > i_185_ ? i_184_ : i_185_;
				break;
			    }
			    if (i_4_ == 4018) {
				i -= 3;
				long l = (long) anIntArray2249[i];
				long l_186_ = (long) anIntArray2249[i + 1];
				long l_187_ = (long) anIntArray2249[i + 2];
				anIntArray2249[i++]
				    = (int) (l * l_187_ / l_186_);
				break;
			    }
			} else if (i_4_ < 4200) {
			    if (i_4_ == 4100) {
				String string = aStringArray2246[--i_1_];
				int i_188_ = anIntArray2249[--i];
				aStringArray2246[i_1_++] = string + i_188_;
				break;
			    }
			    if (i_4_ == 4101) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_189_
				    = aStringArray2246[i_1_ + 1];
				aStringArray2246[i_1_++]
				    = string + string_189_;
				break;
			    }
			    if (i_4_ == 4102) {
				String string = aStringArray2246[--i_1_];
				int i_190_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = string + Class209.method2752(100, true,
								   i_190_);
				break;
			    }
			    if (i_4_ == 4103) {
				String string = aStringArray2246[--i_1_];
				aStringArray2246[i_1_++]
				    = string.toLowerCase();
				break;
			    }
			    if (i_4_ == 4104) {
				int i_191_ = anIntArray2249[--i];
				long l = ((long) i_191_ + 11745L) * 86400000L;
				aCalendar2258.setTime(new Date(l));
				int i_192_ = aCalendar2258.get(5);
				int i_193_ = aCalendar2258.get(2);
				int i_194_ = aCalendar2258.get(1);
				aStringArray2246[i_1_++]
				    = (String.valueOf(i_192_) + "-"
				       + aStringArray2264[i_193_] + "-"
				       + i_194_);
				break;
			    }
			    if (i_4_ == 4105) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_195_
				    = aStringArray2246[i_1_ + 1];
				if ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .aClass188_6513) != null
				    && (Class166.aClass23_Sub4_Sub1_Sub2_2216
					.aClass188_6513.aBoolean2744))
				    aStringArray2246[i_1_++] = string_195_;
				else
				    aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 4106) {
				int i_196_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = Integer.toString(i_196_);
				break;
			    }
			    if (i_4_ == 4107) {
				i_1_ -= 2;
				anIntArray2249[i++]
				    = (Class23_Sub4_Sub1.method329
				       (aStringArray2246[i_1_], 125,
					Class1_Sub7_Sub1.anInt5208,
					aStringArray2246[i_1_ + 1]));
				break;
			    }
			    if (i_4_ == 4108) {
				String string = aStringArray2246[--i_1_];
				i -= 2;
				int i_197_ = anIntArray2249[i];
				int i_198_ = anIntArray2249[i + 1];
				Class55 class55
				    = (Class131_Sub41_Sub16.method2037
				       (Class157.aClass158_2076, (byte) -35, 0,
					i_198_));
				anIntArray2249[i++]
				    = class55.method616(-71, string, i_197_,
							(Class201
							 .aClass152Array2930));
				break;
			    }
			    if (i_4_ == 4109) {
				String string = aStringArray2246[--i_1_];
				i -= 2;
				int i_199_ = anIntArray2249[i];
				int i_200_ = anIntArray2249[i + 1];
				Class55 class55
				    = (Class131_Sub41_Sub16.method2037
				       (Class157.aClass158_2076, (byte) -35, 0,
					i_200_));
				anIntArray2249[i++]
				    = class55.method617((byte) -95, i_199_,
							string,
							(Class201
							 .aClass152Array2930));
				break;
			    }
			    if (i_4_ == 4110) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_201_
				    = aStringArray2246[i_1_ + 1];
				if (anIntArray2249[--i] == 1)
				    aStringArray2246[i_1_++] = string;
				else
				    aStringArray2246[i_1_++] = string_201_;
				break;
			    }
			    if (i_4_ == 4111) {
				String string = aStringArray2246[--i_1_];
				aStringArray2246[i_1_++]
				    = Class115.method981(0, string);
				break;
			    }
			    if (i_4_ == 4112) {
				String string = aStringArray2246[--i_1_];
				int i_202_ = anIntArray2249[--i];
				if (i_202_ == -1)
				    throw new RuntimeException("null char");
				aStringArray2246[i_1_++]
				    = string + (char) i_202_;
				break;
			    }
			    if (i_4_ == 4113) {
				int i_203_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class138.method2122((char) i_203_,
							  (byte) 122) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 4114) {
				int i_204_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class63.method661((char) i_204_, 18768)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 4115) {
				int i_205_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Login.method1156((char) i_205_, -100)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 4116) {
				int i_206_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class183_Sub1.method2543((byte) 106,
								(char) i_206_)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 4117) {
				String string = aStringArray2246[--i_1_];
				if (string != null)
				    anIntArray2249[i++] = string.length();
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 4118) {
				String string = aStringArray2246[--i_1_];
				i -= 2;
				int i_207_ = anIntArray2249[i];
				int i_208_ = anIntArray2249[i + 1];
				aStringArray2246[i_1_++]
				    = string.substring(i_207_, i_208_);
				break;
			    }
			    if (i_4_ == 4119) {
				String string = aStringArray2246[--i_1_];
				StringBuffer stringbuffer
				    = new StringBuffer(string.length());
				boolean bool_209_ = false;
				for (int i_210_ = 0; i_210_ < string.length();
				     i_210_++) {
				    char c = string.charAt(i_210_);
				    if (c == '<')
					bool_209_ = true;
				    else if (c == '>')
					bool_209_ = false;
				    else if (!bool_209_)
					stringbuffer.append(c);
				}
				aStringArray2246[i_1_++]
				    = stringbuffer.toString();
				break;
			    }
			    if (i_4_ == 4120) {
				String string = aStringArray2246[--i_1_];
				i -= 2;
				int i_211_ = anIntArray2249[i];
				int i_212_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = string.indexOf(i_211_, i_212_);
				break;
			    }
			    if (i_4_ == 4121) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_213_
				    = aStringArray2246[i_1_ + 1];
				int i_214_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = string.indexOf(string_213_, i_214_);
				break;
			    }
			    if (i_4_ == 4122) {
				int i_215_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Character.toLowerCase((char) i_215_);
				break;
			    }
			    if (i_4_ == 4123) {
				int i_216_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Character.toUpperCase((char) i_216_);
				break;
			    }
			    if (i_4_ == 4124) {
				boolean bool_217_ = anIntArray2249[--i] != 0;
				int i_218_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = Class167.method2426(bool_217_,
							  (long) i_218_, false,
							  (Class1_Sub7_Sub1
							   .anInt5208),
							  0);
				break;
			    }
			} else if (i_4_ < 4300) {
			    if (i_4_ == 4200) {
				int i_219_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = (Class131_Sub19.method1808(i_219_, false)
				       .aString341);
				break;
			    }
			    if (i_4_ == 4201) {
				i -= 2;
				int i_220_ = anIntArray2249[i];
				int i_221_ = anIntArray2249[i + 1];
				Class29 class29
				    = Class131_Sub19.method1808(i_220_, false);
				if (i_221_ >= 1 && i_221_ <= 5
				    && (class29.aStringArray365[i_221_ - 1]
					!= null))
				    aStringArray2246[i_1_++]
					= class29.aStringArray365[i_221_ - 1];
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 4202) {
				i -= 2;
				int i_222_ = anIntArray2249[i];
				int i_223_ = anIntArray2249[i + 1];
				Class29 class29
				    = Class131_Sub19.method1808(i_222_, false);
				if (i_223_ >= 1 && i_223_ <= 5
				    && (class29.aStringArray311[i_223_ - 1]
					!= null))
				    aStringArray2246[i_1_++]
					= class29.aStringArray311[i_223_ - 1];
				else
				    aStringArray2246[i_1_++] = "";
				break;
			    }
			    if (i_4_ == 4203) {
				int i_224_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class131_Sub19.method1808(i_224_, false)
				       .anInt298);
				break;
			    }
			    if (i_4_ == 4204) {
				int i_225_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class131_Sub19.method1808(i_225_, false)
				       .anInt304) == 1 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 4205) {
				int i_226_ = anIntArray2249[--i];
				Class29 class29
				    = Class131_Sub19.method1808(i_226_, false);
				if (class29.anInt318 == -1
				    && class29.anInt294 >= 0)
				    anIntArray2249[i++] = class29.anInt294;
				else
				    anIntArray2249[i++] = i_226_;
				break;
			    }
			    if (i_4_ == 4206) {
				int i_227_ = anIntArray2249[--i];
				Class29 class29
				    = Class131_Sub19.method1808(i_227_, false);
				if (class29.anInt318 >= 0
				    && class29.anInt294 >= 0)
				    anIntArray2249[i++] = class29.anInt294;
				else
				    anIntArray2249[i++] = i_227_;
				break;
			    }
			    if (i_4_ == 4207) {
				int i_228_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class131_Sub19.method1808(i_228_, false)
				       .aBoolean366) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 4208) {
				i -= 2;
				int i_229_ = anIntArray2249[i];
				int i_230_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub16 class131_sub41_sub16
				    = Class145.method2163(i_230_, true);
				if (class131_sub41_sub16
					.method2036((byte) -40))
				    aStringArray2246[i_1_++]
					= (Class131_Sub19.method1808
					       (i_229_, false).method422
					   ((byte) -106, i_230_,
					    class131_sub41_sub16.aString6377));
				else
				    anIntArray2249[i++]
					= (Class131_Sub19.method1808
					       (i_229_, false).method427
					   (-19,
					    class131_sub41_sub16.anInt6374,
					    i_230_));
				break;
			    }
			    if (i_4_ == 4210) {
				String string = aStringArray2246[--i_1_];
				int i_231_ = anIntArray2249[--i];
				Class84.method805(string, -1, i_231_ == 1);
				anIntArray2249[i++] = Class131_Sub22.anInt4449;
				break;
			    }
			    if (i_4_ == 4211) {
				if (Cryption.aShortArray1822 == null
				    || (Class88.anInt1172
					>= Class131_Sub22.anInt4449))
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= (Cryption.aShortArray1822
					   [Class88.anInt1172++]) & 0xffff;
				break;
			    }
			    if (i_4_ == 4212) {
				Class88.anInt1172 = 0;
				break;
			    }
			} else if (i_4_ < 4400) {
			    if (i_4_ == 4300) {
				i -= 2;
				int i_232_ = anIntArray2249[i];
				int i_233_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub16 class131_sub41_sub16
				    = Class145.method2163(i_233_, true);
				if (class131_sub41_sub16
					.method2036((byte) -40))
				    aStringArray2246[i_1_++]
					= (Class131_Sub41_Sub7.method1971
					       (i_232_, 119).method698
					   (class131_sub41_sub16.aString6377,
					    true, i_233_));
				else
				    anIntArray2249[i++]
					= (Class131_Sub41_Sub7.method1971
					       (i_232_, 69).method692
					   (i_233_,
					    class131_sub41_sub16.anInt6374,
					    65));
				break;
			    }
			} else if (i_4_ < 4500) {
			    if (i_4_ == 4400) {
				i -= 2;
				int i_234_ = anIntArray2249[i];
				int i_235_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub16 class131_sub41_sub16
				    = Class145.method2163(i_235_, true);
				if (class131_sub41_sub16
					.method2036((byte) -40))
				    aStringArray2246[i_1_++]
					= (Class55.method612(i_234_, -48)
					       .method2580
					   (i_235_,
					    class131_sub41_sub16.aString6377,
					    (byte) 47));
				else
				    anIntArray2249[i++]
					= (Class55.method612(i_234_, 31)
					       .method2572
					   (i_235_, false,
					    class131_sub41_sub16.anInt6374));
				break;
			    }
			} else if (i_4_ < 4600) {
			    if (i_4_ == 4500) {
				i -= 2;
				int i_236_ = anIntArray2249[i];
				int i_237_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub16 class131_sub41_sub16
				    = Class145.method2163(i_237_, true);
				if (class131_sub41_sub16
					.method2036((byte) -40))
				    aStringArray2246[i_1_++]
					= (Class131_Sub2_Sub38.method1641
					       (i_236_, 3).method2071
					   (i_237_, 0,
					    class131_sub41_sub16.aString6377));
				else
				    anIntArray2249[i++]
					= (Class131_Sub2_Sub38.method1641
					       (i_236_, 3).method2069
					   (class131_sub41_sub16.anInt6374,
					    (byte) 64, i_237_));
				break;
			    }
			} else if (i_4_ < 4700) {
			    if (i_4_ == 4600) {
				int i_238_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = (Class131_Sub41_Sub5.method1958
				       (i_238_, (byte) 120).anInt972);
				break;
			    }
			} else if (i_4_ < 5100) {
			    if (i_4_ == 5000) {
				anIntArray2249[i++]
				    = Class131_Sub41_Sub5.anInt6222;
				break;
			    }
			    if (i_4_ == 5001) {
				i -= 3;
				Class131_Sub41_Sub5.anInt6222
				    = anIntArray2249[i];
				Class145.anInt1930 = anIntArray2249[i + 1];
				Class131_Sub2_Sub2.anInt5583
				    = anIntArray2249[i + 2];
				anInt2254++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(59);
				Class93.aClass131_Sub15_Sub2_1226.writeByte
				    (Class131_Sub41_Sub5.anInt6222);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(Class145.anInt1930);
				Class93.aClass131_Sub15_Sub2_1226.writeByte
				    (Class131_Sub2_Sub2.anInt5583);
				break;
			    }
			    if (i_4_ == 5002) {
				String string = aStringArray2246[--i_1_];
				i -= 2;
				int i_239_ = anIntArray2249[i];
				int i_240_ = anIntArray2249[i + 1];
				anInt2252++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(118);
				Class93.aClass131_Sub15_Sub2_1226.writeByte
				    (Class131_Sub30.method1856((byte) -124,
								  string) + 2);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string, (byte) -127);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(i_239_ - 1);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(i_240_);
				break;
			    }
			    if (i_4_ == 5003) {
				int i_241_ = anIntArray2249[--i];
				String string = null;
				if (i_241_ < 100)
				    string = (Class131_Sub2_Sub28
					      .aStringArray5957[i_241_]);
				if (string == null)
				    string = "";
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5004) {
				int i_242_ = anIntArray2249[--i];
				int i_243_ = -1;
				if (i_242_ < 100
				    && (Class131_Sub2_Sub28.aStringArray5957
					[i_242_]) != null)
				    i_243_ = (Class131_Sub13.anIntArray4264
					      [i_242_]);
				anIntArray2249[i++] = i_243_;
				break;
			    }
			    if (i_4_ == 5005) {
				anIntArray2249[i++] = Class145.anInt1930;
				break;
			    }
			    if (i_4_ == 5008) {
				String string = aStringArray2246[--i_1_];
				if (Class56.anInt745 != 0
				    || ((!Class103.aBoolean1353
					 || Class60.aBoolean786)
					&& !Class183_Sub1.aBoolean4956)) {
				    String string_244_ = string.toLowerCase();
				    int i_245_ = 0;
				    if (string_244_.startsWith
					(Class131_Sub41_Sub21.aString6438)) {
					i_245_ = 0;
					string = (string.substring
						  (Class131_Sub41_Sub21
						       .aString6438.length()));
				    } else if (string_244_.startsWith
					       (Class87.aString1130)) {
					i_245_ = 1;
					string
					    = string.substring(Class87
								   .aString1130
								   .length());
				    } else if (string_244_.startsWith
					       (Class131_Sub7.aString4168)) {
					i_245_ = 2;
					string
					    = string.substring(Class131_Sub7
								   .aString4168
								   .length());
				    } else if (string_244_.startsWith
					       (Class35.aString498)) {
					i_245_ = 3;
					string
					    = string.substring(Class35
								   .aString498
								   .length());
				    } else if (string_244_.startsWith
					       (Class131_Sub32.aString4549)) {
					i_245_ = 4;
					string
					    = string.substring(Class131_Sub32
								   .aString4549
								   .length());
				    } else if (string_244_.startsWith
					       (Class131_Sub2_Sub29
						.aString5976)) {
					i_245_ = 5;
					string = (string.substring
						  (Class131_Sub2_Sub29
						       .aString5976.length()));
				    } else if (string_244_.startsWith
					       (Class131_Sub2_Sub21
						.aString5856)) {
					i_245_ = 6;
					string = (string.substring
						  (Class131_Sub2_Sub21
						       .aString5856.length()));
				    } else if (string_244_.startsWith
					       (Class131_Sub32.aString4551)) {
					i_245_ = 7;
					string
					    = string.substring(Class131_Sub32
								   .aString4551
								   .length());
				    } else if (string_244_.startsWith
					       (Class131_Sub2_Sub20
						.aString5835)) {
					i_245_ = 8;
					string = (string.substring
						  (Class131_Sub2_Sub20
						       .aString5835.length()));
				    } else if (string_244_.startsWith
					       (Class219.aString3208)) {
					i_245_ = 9;
					string
					    = string.substring(Class219
								   .aString3208
								   .length());
				    } else if (string_244_.startsWith
					       (Class100.aString1323)) {
					i_245_ = 10;
					string
					    = string.substring(Class100
								   .aString1323
								   .length());
				    } else if (string_244_.startsWith
					       (Class107.aString1392)) {
					i_245_ = 11;
					string
					    = string.substring(Class107
								   .aString1392
								   .length());
				    } else if (Class1_Sub7_Sub1.anInt5208
					       != 0) {
					if (string_244_.startsWith
					    (Class23.aString256)) {
					    i_245_ = 0;
					    string = (string.substring
						      (Class23.aString256
							   .length()));
					} else if (string_244_.startsWith
						   (Class22.aString245)) {
					    i_245_ = 1;
					    string = (string.substring
						      (Class22.aString245
							   .length()));
					} else if (string_244_.startsWith
						   (Class176.aString2514)) {
					    i_245_ = 2;
					    string = (string.substring
						      (Class176.aString2514
							   .length()));
					} else if (string_244_.startsWith
						   (Class131_Sub2_Sub19
						    .aString5823)) {
					    i_245_ = 3;
					    string = (string.substring
						      (Class131_Sub2_Sub19
							   .aString5823
							   .length()));
					} else if (string_244_.startsWith
						   (Class218.aString3199)) {
					    i_245_ = 4;
					    string = (string.substring
						      (Class218.aString3199
							   .length()));
					} else if (string_244_.startsWith
						   (Class66.aString890)) {
					    i_245_ = 5;
					    string = (string.substring
						      (Class66.aString890
							   .length()));
					} else if (string_244_.startsWith
						   (Class44.aString614)) {
					    i_245_ = 6;
					    string = (string.substring
						      (Class44.aString614
							   .length()));
					} else if (string_244_.startsWith
						   (Class131_Sub10
						    .aString4223)) {
					    i_245_ = 7;
					    string
						= (string.substring
						   (Class131_Sub10
							.aString4223
							.length()));
					} else if (string_244_.startsWith
						   (Class94.aString1246)) {
					    i_245_ = 8;
					    string = (string.substring
						      (Class94.aString1246
							   .length()));
					} else if (string_244_.startsWith
						   (Class131_Sub2_Sub13
						    .aString5739)) {
					    i_245_ = 9;
					    string = (string.substring
						      (Class131_Sub2_Sub13
							   .aString5739
							   .length()));
					} else if (string_244_.startsWith
						   (Class131_Sub41_Sub5
						    .aString6232)) {
					    i_245_ = 10;
					    string = (string.substring
						      (Class131_Sub41_Sub5
							   .aString6232
							   .length()));
					} else if (string_244_.startsWith
						   (Class14.aString151)) {
					    i_245_ = 11;
					    string = (string.substring
						      (Class14.aString151
							   .length()));
					}
				    }
				    string_244_ = string.toLowerCase();
				    int i_246_ = 0;
				    if (string_244_.startsWith
					(Class131_Sub41_Sub21.aString6441)) {
					i_246_ = 1;
					string = (string.substring
						  (Class131_Sub41_Sub21
						       .aString6441.length()));
				    } else if (string_244_.startsWith
					       (Class131_Sub2_Sub30
						.aString5992)) {
					i_246_ = 2;
					string = (string.substring
						  (Class131_Sub2_Sub30
						       .aString5992.length()));
				    } else if (string_244_.startsWith
					       (Class160.aString2130)) {
					i_246_ = 3;
					string
					    = string.substring(Class160
								   .aString2130
								   .length());
				    } else if (string_244_.startsWith
					       (Class23_Sub5_Sub1
						.aString5044)) {
					i_246_ = 4;
					string = (string.substring
						  (Class23_Sub5_Sub1
						       .aString5044.length()));
				    } else if (string_244_.startsWith
					       (Class131_Sub41_Sub11_Sub1
						.aString6544)) {
					i_246_ = 5;
					string = (string.substring
						  (Class131_Sub41_Sub11_Sub1
						       .aString6544.length()));
				    } else if (Class1_Sub7_Sub1.anInt5208
					       != 0) {
					if (string_244_.startsWith
					    (Class171.aString2277)) {
					    i_246_ = 1;
					    string = (string.substring
						      (Class171.aString2277
							   .length()));
					} else if (string_244_.startsWith
						   (Class101.aString1328)) {
					    i_246_ = 2;
					    string = (string.substring
						      (Class101.aString1328
							   .length()));
					} else if (string_244_.startsWith
						   (Class156.aString2073)) {
					    i_246_ = 3;
					    string = (string.substring
						      (Class156.aString2073
							   .length()));
					} else if (string_244_.startsWith
						   (Class110.aString1427)) {
					    i_246_ = 4;
					    string = (string.substring
						      (Class110.aString1427
							   .length()));
					} else if (string_244_.startsWith
						   (Class155.aString2068)) {
					    i_246_ = 5;
					    string = (string.substring
						      (Class155.aString2068
							   .length()));
					}
				    }
				    anInt2253++;
				    Class93.aClass131_Sub15_Sub2_1226
					.createPacket(182);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeByte(0);
				    int i_247_
					= (Class93.aClass131_Sub15_Sub2_1226
					   .offset);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeByte(i_245_);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeByte(i_246_);
				    Class98.method871
					(Class93.aClass131_Sub15_Sub2_1226,
					 string, -1996488705);
				    Class93.aClass131_Sub15_Sub2_1226
					.method1727
					((Class93.aClass131_Sub15_Sub2_1226
					  .offset) - i_247_,
					 (byte) -42);
				}
				break;
			    }
			    if (i_4_ == 5009) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_248_
				    = aStringArray2246[i_1_ + 1];
				if (Class56.anInt745 != 0
				    || ((!Class103.aBoolean1353
					 || Class60.aBoolean786)
					&& !Class183_Sub1.aBoolean4956)) {
				    anInt2260++;
				    Class93.aClass131_Sub15_Sub2_1226
					.createPacket(123);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeByte(0);
				    int i_249_
					= (Class93.aClass131_Sub15_Sub2_1226
					   .offset);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeString(string, (byte) 66);
				    Class98.method871
					(Class93.aClass131_Sub15_Sub2_1226,
					 string_248_, -1996488705);
				    Class93.aClass131_Sub15_Sub2_1226
					.method1727
					((Class93.aClass131_Sub15_Sub2_1226
					  .offset) - i_249_,
					 (byte) -42);
				}
				break;
			    }
			    if (i_4_ == 5010) {
				int i_250_ = anIntArray2249[--i];
				String string = null;
				if (i_250_ < 100)
				    string = (Class131_Sub41_Sub4
					      .aStringArray6206[i_250_]);
				if (string == null)
				    string = "";
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5011) {
				int i_251_ = anIntArray2249[--i];
				String string = null;
				if (i_251_ < 100)
				    string = Class112.aStringArray1434[i_251_];
				if (string == null)
				    string = "";
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5012) {
				int i_252_ = anIntArray2249[--i];
				int i_253_ = -1;
				if (i_252_ < 100)
				    i_253_ = (Class131_Sub41_Sub5
					      .anIntArray6231[i_252_]);
				anIntArray2249[i++] = i_253_;
				break;
			    }
			    if (i_4_ == 5015) {
				String string;
				if ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     != null)
				    && (Class166.aClass23_Sub4_Sub1_Sub2_2216
					.aString6531) != null)
				    string
					= Class166
					      .aClass23_Sub4_Sub1_Sub2_2216
					      .method363(true, true);
				else
				    string = Class64.aString809;
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5016) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub2.anInt5583;
				break;
			    }
			    if (i_4_ == 5017) {
				anIntArray2249[i++] = Class59.anInt785;
				break;
			    }
			    if (i_4_ == 5018) {
				int i_254_ = anIntArray2249[--i];
				int i_255_ = 0;
				if (i_254_ < 100
				    && (Class131_Sub2_Sub28.aStringArray5957
					[i_254_]) != null)
				    i_255_ = (Class131_Sub13.anIntArray4264
					      [i_254_]);
				anIntArray2249[i++] = i_255_;
				break;
			    }
			    if (i_4_ == 5019) {
				int i_256_ = anIntArray2249[--i];
				String string = null;
				if (i_256_ < 100)
				    string = (Class131_Sub27.aStringArray4486
					      [i_256_]);
				if (string == null)
				    string = "";
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5020) {
				String string;
				if ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     != null)
				    && (Class166.aClass23_Sub4_Sub1_Sub2_2216
					.aString6531) != null)
				    string
					= Class166
					      .aClass23_Sub4_Sub1_Sub2_2216
					      .method361(false, (byte) -44);
				else
				    string = Class64.aString809;
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5050) {
				int i_257_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = (Class131_Sub41_Sub15.method2033
				       (23752, i_257_).aString6198);
				break;
			    }
			    if (i_4_ == 5051) {
				int i_258_ = anIntArray2249[--i];
				Class131_Sub41_Sub4 class131_sub41_sub4
				    = Class131_Sub41_Sub15.method2033(23752,
								      i_258_);
				if (class131_sub41_sub4.anIntArray6209 == null)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (class131_sub41_sub4
					   .anIntArray6209).length;
				break;
			    }
			    if (i_4_ == 5052) {
				i -= 2;
				int i_259_ = anIntArray2249[i];
				int i_260_ = anIntArray2249[i + 1];
				Class131_Sub41_Sub4 class131_sub41_sub4
				    = Class131_Sub41_Sub15.method2033(23752,
								      i_259_);
				int i_261_ = (class131_sub41_sub4
					      .anIntArray6209[i_260_]);
				anIntArray2249[i++] = i_261_;
				break;
			    }
			    if (i_4_ == 5053) {
				int i_262_ = anIntArray2249[--i];
				Class131_Sub41_Sub4 class131_sub41_sub4
				    = Class131_Sub41_Sub15.method2033(23752,
								      i_262_);
				if (class131_sub41_sub4.anIntArray6210 == null)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (class131_sub41_sub4
					   .anIntArray6210).length;
				break;
			    }
			    if (i_4_ == 5054) {
				i -= 2;
				int i_263_ = anIntArray2249[i];
				int i_264_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (Class131_Sub41_Sub15.method2033
				       (23752, i_263_).anIntArray6210[i_264_]);
				break;
			    }
			    if (i_4_ == 5055) {
				int i_265_ = anIntArray2249[--i];
				aStringArray2246[i_1_++]
				    = Class14.method215(i_265_, (byte) -73)
					  .method1985(1);
				break;
			    }
			    if (i_4_ == 5056) {
				int i_266_ = anIntArray2249[--i];
				Class131_Sub41_Sub8 class131_sub41_sub8
				    = Class14.method215(i_266_, (byte) -73);
				if (class131_sub41_sub8.anIntArray6259 == null)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (class131_sub41_sub8
					   .anIntArray6259).length;
				break;
			    }
			    if (i_4_ == 5057) {
				i -= 2;
				int i_267_ = anIntArray2249[i];
				int i_268_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (Class14.method215(i_267_, (byte) 126)
				       .anIntArray6259[i_268_]);
				break;
			    }
			    if (i_4_ == 5058) {
				aClass113_2251 = new Class113();
				aClass113_2251.anInt1464 = anIntArray2249[--i];
				aClass113_2251.aClass131_Sub41_Sub8_1459
				    = Class14.method215((aClass113_2251
							 .anInt1464),
							(byte) -69);
				aClass113_2251.anIntArray1460
				    = new int[aClass113_2251
						  .aClass131_Sub41_Sub8_1459
						  .method1977(true)];
				break;
			    }
			    if (i_4_ == 5059) {
				anInt2243++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(68);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(0);
				int i_269_ = (Class93.aClass131_Sub15_Sub2_1226
					      .offset);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(0);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    (aClass113_2251.anInt1464);
				aClass113_2251.aClass131_Sub41_Sub8_1459
				    .method1983
				    (aClass113_2251.anIntArray1460, 127,
				     Class93.aClass131_Sub15_Sub2_1226);
				Class93.aClass131_Sub15_Sub2_1226.method1727
				    ((Class93.aClass131_Sub15_Sub2_1226
				      .offset) - i_269_,
				     (byte) -42);
				break;
			    }
			    if (i_4_ == 5060) {
				String string = aStringArray2246[--i_1_];
				anInt2242++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(62);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(0);
				int i_270_ = (Class93.aClass131_Sub15_Sub2_1226
					      .offset);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string, (byte) -107);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    (aClass113_2251.anInt1464);
				aClass113_2251.aClass131_Sub41_Sub8_1459
				    .method1983
				    (aClass113_2251.anIntArray1460, 127,
				     Class93.aClass131_Sub15_Sub2_1226);
				Class93.aClass131_Sub15_Sub2_1226.method1727
				    ((Class93.aClass131_Sub15_Sub2_1226
				      .offset) - i_270_,
				     (byte) -42);
				break;
			    }
			    if (i_4_ == 5061) {
				anInt2243++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(68);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(0);
				int i_271_ = (Class93.aClass131_Sub15_Sub2_1226
					      .offset);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(1);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    (aClass113_2251.anInt1464);
				aClass113_2251.aClass131_Sub41_Sub8_1459
				    .method1983
				    (aClass113_2251.anIntArray1460, 127,
				     Class93.aClass131_Sub15_Sub2_1226);
				Class93.aClass131_Sub15_Sub2_1226.method1727
				    ((Class93.aClass131_Sub15_Sub2_1226
				      .offset) - i_271_,
				     (byte) -42);
				break;
			    }
			    if (i_4_ == 5062) {
				i -= 2;
				int i_272_ = anIntArray2249[i];
				int i_273_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (Class131_Sub41_Sub15.method2033
				       (23752, i_272_).aCharArray6205[i_273_]);
				break;
			    }
			    if (i_4_ == 5063) {
				i -= 2;
				int i_274_ = anIntArray2249[i];
				int i_275_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (Class131_Sub41_Sub15.method2033
				       (23752, i_274_).aCharArray6195[i_275_]);
				break;
			    }
			    if (i_4_ == 5064) {
				i -= 2;
				int i_276_ = anIntArray2249[i];
				int i_277_ = anIntArray2249[i + 1];
				if (i_277_ == -1)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= (Class131_Sub41_Sub15.method2033
					       (23752, i_276_).method1948
					   ((char) i_277_, (byte) -122));
				break;
			    }
			    if (i_4_ == 5065) {
				i -= 2;
				int i_278_ = anIntArray2249[i];
				int i_279_ = anIntArray2249[i + 1];
				if (i_279_ == -1)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= Class131_Sub41_Sub15.method2033
					      (23752, i_278_)
					      .method1945((char) i_279_, 119);
				break;
			    }
			    if (i_4_ == 5066) {
				int i_280_ = anIntArray2249[--i];
				anIntArray2249[i++]
				    = Class14.method215(i_280_, (byte) -64)
					  .method1977(true);
				break;
			    }
			    if (i_4_ == 5067) {
				i -= 2;
				int i_281_ = anIntArray2249[i];
				int i_282_ = anIntArray2249[i + 1];
				int i_283_
				    = Class14.method215(i_281_, (byte) -49)
					  .method1979(0, i_282_);
				anIntArray2249[i++] = i_283_;
				break;
			    }
			    if (i_4_ == 5068) {
				i -= 2;
				int i_284_ = anIntArray2249[i];
				int i_285_ = anIntArray2249[i + 1];
				aClass113_2251.anIntArray1460[i_284_] = i_285_;
				break;
			    }
			    if (i_4_ == 5069) {
				i -= 2;
				int i_286_ = anIntArray2249[i];
				int i_287_ = anIntArray2249[i + 1];
				aClass113_2251.anIntArray1460[i_286_] = i_287_;
				break;
			    }
			    if (i_4_ == 5070) {
				i -= 3;
				int i_288_ = anIntArray2249[i];
				int i_289_ = anIntArray2249[i + 1];
				int i_290_ = anIntArray2249[i + 2];
				Class131_Sub41_Sub8 class131_sub41_sub8
				    = Class14.method215(i_288_, (byte) -38);
				if (class131_sub41_sub8.method1979(0, i_289_)
				    != 0)
				    throw new RuntimeException("bad command");
				anIntArray2249[i++]
				    = (class131_sub41_sub8.method1978
				       ((byte) -86, i_290_, i_289_));
				break;
			    }
			    if (i_4_ == 5071) {
				String string = aStringArray2246[--i_1_];
				boolean bool_291_ = anIntArray2249[--i] == 1;
				Class131_Sub2_Sub14.method1537(bool_291_, 0,
							       string);
				anIntArray2249[i++] = Class131_Sub22.anInt4449;
				break;
			    }
			    if (i_4_ == 5072) {
				if (Cryption.aShortArray1822 == null
				    || (Class88.anInt1172
					>= Class131_Sub22.anInt4449))
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= (Cryption.aShortArray1822
					   [Class88.anInt1172++]) & 0xffff;
				break;
			    }
			    if (i_4_ == 5073) {
				Class88.anInt1172 = 0;
				break;
			    }
			} else if (i_4_ < 5200) {
			    if (i_4_ == 5100) {
				if (Class131_Sub2_Sub39.aBooleanArray6080[86])
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 5101) {
				if (Class131_Sub2_Sub39.aBooleanArray6080[82])
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 5102) {
				if (Class131_Sub2_Sub39.aBooleanArray6080[81])
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			} else if (i_4_ < 5300) {
			    if (i_4_ == 5200) {
				Class121_Sub3.method1056(-90,
							 anIntArray2249[--i]);
				break;
			    }
			    if (i_4_ == 5201) {
				anIntArray2249[i++]
				    = Class131_Sub41_Sub18
					  .method2056((byte) -123);
				break;
			    }
			    if (i_4_ == 5205) {
				RuntimeException_Sub1.method2837
				    (-1, false, -1, -106, anIntArray2249[--i]);
				break;
			    }
			    if (i_4_ == 5206) {
				int i_292_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = Class127.method1127((i_292_ >> 14
							   & 0x3fff),
							  i_292_ & 0x3fff);
				if (class131_sub41_sub1 == null)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= class131_sub41_sub1.anInt6161;
				break;
			    }
			    if (i_4_ == 5207) {
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = Class127.method1132(anIntArray2249[--i]);
				if (class131_sub41_sub1 == null
				    || class131_sub41_sub1.aString6156 == null)
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class131_sub41_sub1.aString6156;
				break;
			    }
			    if (i_4_ == 5208) {
				anIntArray2249[i++] = Class190.anInt2813;
				anIntArray2249[i++] = Class12.anInt131;
				break;
			    }
			    if (i_4_ == 5209) {
				anIntArray2249[i++] = (Class131_Sub31.anInt4532
						       + Class127.anInt1725);
				anIntArray2249[i++]
				    = Class197.anInt2875 + Class127.anInt1728;
				break;
			    }
			    if (i_4_ == 5210) {
				int i_293_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = Class127.method1132(i_293_);
				if (class131_sub41_sub1 == null) {
				    anIntArray2249[i++] = 0;
				    anIntArray2249[i++] = 0;
				} else {
				    anIntArray2249[i++]
					= (class131_sub41_sub1.anInt6171 >> 14
					   & 0x3fff);
				    anIntArray2249[i++]
					= (class131_sub41_sub1.anInt6171
					   & 0x3fff);
				}
				break;
			    }
			    if (i_4_ == 5211) {
				int i_294_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = Class127.method1132(i_294_);
				if (class131_sub41_sub1 == null) {
				    anIntArray2249[i++] = 0;
				    anIntArray2249[i++] = 0;
				} else {
				    anIntArray2249[i++]
					= (class131_sub41_sub1.anInt6174
					   - class131_sub41_sub1.anInt6164);
				    anIntArray2249[i++]
					= (class131_sub41_sub1.anInt6157
					   - class131_sub41_sub1.anInt6165);
				}
				break;
			    }
			    if (i_4_ == 5212) {
				Class131_Sub20 class131_sub20
				    = Class215.method2803((byte) -50);
				if (class131_sub20 == null) {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = -1;
				} else {
				    anIntArray2249[i++]
					= class131_sub20.anInt4427;
				    int i_295_
					= (class131_sub20.anInt4431 << 28
					   | (class131_sub20.anInt4419
					      + Class127.anInt1725) << 14
					   | (class131_sub20.anInt4426
					      + Class127.anInt1728));
				    anIntArray2249[i++] = i_295_;
				}
				break;
			    }
			    if (i_4_ == 5213) {
				Class131_Sub20 class131_sub20
				    = Class125.method1098(true);
				if (class131_sub20 == null) {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = -1;
				} else {
				    anIntArray2249[i++]
					= class131_sub20.anInt4427;
				    int i_296_
					= (class131_sub20.anInt4431 << 28
					   | (class131_sub20.anInt4419
					      + Class127.anInt1725) << 14
					   | (class131_sub20.anInt4426
					      + Class127.anInt1728));
				    anIntArray2249[i++] = i_296_;
				}
				break;
			    }
			    if (i_4_ == 5214) {
				int i_297_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = InputStream_Sub1.method78(3);
				if (class131_sub41_sub1 != null) {
				    boolean bool_298_
					= (class131_sub41_sub1.method1922
					   (-89, i_297_ >> 14 & 0x3fff,
					    i_297_ >> 28 & 0x3,
					    i_297_ & 0x3fff, anIntArray2262));
				    if (bool_298_)
					Class1_Sub2.method98(anIntArray2262[1],
							     anIntArray2262[2],
							     (byte) 120);
				}
				break;
			    }
			    if (i_4_ == 5215) {
				i -= 2;
				int i_299_ = anIntArray2249[i];
				int i_300_ = anIntArray2249[i + 1];
				Class175 class175
				    = Class127.method1113((i_299_ >> 14
							   & 0x3fff),
							  i_299_ & 0x3fff);
				boolean bool_301_ = false;
				for (Class131_Sub41_Sub1 class131_sub41_sub1
					 = ((Class131_Sub41_Sub1)
					    class175.method2485(-18));
				     class131_sub41_sub1 != null;
				     class131_sub41_sub1
					 = ((Class131_Sub41_Sub1)
					    class175.method2482(-99))) {
				    if (class131_sub41_sub1.anInt6161
					== i_300_) {
					bool_301_ = true;
					break;
				    }
				}
				if (bool_301_)
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 5218) {
				int i_302_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = Class127.method1132(i_302_);
				if (class131_sub41_sub1 == null)
				    anIntArray2249[i++] = -1;
				else
				    anIntArray2249[i++]
					= class131_sub41_sub1.anInt6176;
				break;
			    }
			    if (i_4_ == 5220) {
				anIntArray2249[i++]
				    = (Class131_Sub2_Sub36.anInt6049 == 100 ? 1
				       : 0);
				break;
			    }
			    if (i_4_ == 5221) {
				int i_303_ = anIntArray2249[--i];
				Class1_Sub2.method98(i_303_ >> 14 & 0x3fff,
						     i_303_ & 0x3fff,
						     (byte) 119);
				break;
			    }
			    if (i_4_ == 5222) {
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = InputStream_Sub1.method78(3);
				if (class131_sub41_sub1 != null) {
				    boolean bool_304_
					= (class131_sub41_sub1.method1928
					   ((Class131_Sub31.anInt4532
					     + Class127.anInt1725),
					    anIntArray2262,
					    (Class197.anInt2875
					     + Class127.anInt1728),
					    (byte) -111));
				    if (bool_304_) {
					anIntArray2249[i++]
					    = anIntArray2262[1];
					anIntArray2249[i++]
					    = anIntArray2262[2];
				    } else {
					anIntArray2249[i++] = -1;
					anIntArray2249[i++] = -1;
				    }
				} else {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = -1;
				}
				break;
			    }
			    if (i_4_ == 5223) {
				i -= 2;
				int i_305_ = anIntArray2249[i];
				int i_306_ = anIntArray2249[i + 1];
				RuntimeException_Sub1.method2837
				    (i_306_ & 0x3fff, false,
				     i_306_ >> 14 & 0x3fff, -78, i_305_);
				break;
			    }
			    if (i_4_ == 5224) {
				int i_307_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = InputStream_Sub1.method78(3);
				if (class131_sub41_sub1 != null) {
				    boolean bool_308_
					= (class131_sub41_sub1.method1922
					   (123, i_307_ >> 14 & 0x3fff,
					    i_307_ >> 28 & 0x3,
					    i_307_ & 0x3fff, anIntArray2262));
				    if (bool_308_) {
					anIntArray2249[i++]
					    = anIntArray2262[1];
					anIntArray2249[i++]
					    = anIntArray2262[2];
				    } else {
					anIntArray2249[i++] = -1;
					anIntArray2249[i++] = -1;
				    }
				} else {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = -1;
				}
				break;
			    }
			    if (i_4_ == 5225) {
				int i_309_ = anIntArray2249[--i];
				Class131_Sub41_Sub1 class131_sub41_sub1
				    = InputStream_Sub1.method78(3);
				if (class131_sub41_sub1 != null) {
				    boolean bool_310_
					= (class131_sub41_sub1.method1928
					   (i_309_ >> 14 & 0x3fff,
					    anIntArray2262, i_309_ & 0x3fff,
					    (byte) -99));
				    if (bool_310_) {
					anIntArray2249[i++]
					    = anIntArray2262[1];
					anIntArray2249[i++]
					    = anIntArray2262[2];
				    } else {
					anIntArray2249[i++] = -1;
					anIntArray2249[i++] = -1;
				    }
				} else {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = -1;
				}
				break;
			    }
			    if (i_4_ == 5226) {
				Class146.method2171(anIntArray2249[--i],
						    (byte) -127);
				break;
			    }
			    if (i_4_ == 5227) {
				i -= 2;
				int i_311_ = anIntArray2249[i];
				int i_312_ = anIntArray2249[i + 1];
				RuntimeException_Sub1.method2837
				    (i_312_ & 0x3fff, true,
				     i_312_ >> 14 & 0x3fff, -116, i_311_);
				break;
			    }
			    if (i_4_ == 5228) {
				Class135.aBoolean1816
				    = anIntArray2249[--i] == 1;
				break;
			    }
			    if (i_4_ == 5229) {
				anIntArray2249[i++]
				    = Class135.aBoolean1816 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 5230) {
				int i_313_ = anIntArray2249[--i];
				Class131_Sub41_Sub7.method1973((byte) 38,
							       i_313_);
				break;
			    }
			    if (i_4_ == 5231) {
				i -= 2;
				int i_314_ = anIntArray2249[i];
				boolean bool_315_ = anIntArray2249[i + 1] == 1;
				if (Class6.aClass180_97 != null) {
				    Class131 class131
					= Class6.aClass180_97
					      .method2521(125, (long) i_314_);
				    if (class131 != null && !bool_315_)
					class131.method1355((byte) 124);
				    else if (class131 == null && bool_315_) {
					class131 = new Class131();
					Class6.aClass180_97.method2523
					    (false, (long) i_314_, class131);
				    }
				}
				break;
			    }
			    if (i_4_ == 5232) {
				int i_316_ = anIntArray2249[--i];
				if (Class6.aClass180_97 != null) {
				    Class131 class131
					= Class6.aClass180_97
					      .method2521(51, (long) i_316_);
				    anIntArray2249[i++]
					= class131 != null ? 1 : 0;
				} else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 5233) {
				i -= 2;
				int i_317_ = anIntArray2249[i];
				boolean bool_318_ = anIntArray2249[i + 1] == 1;
				if (Class131_Sub2_Sub10_Sub1.aClass180_6542
				    != null) {
				    Class131 class131
					= Class131_Sub2_Sub10_Sub1
					      .aClass180_6542
					      .method2521(98, (long) i_317_);
				    if (class131 != null && !bool_318_)
					class131.method1355((byte) 125);
				    else if (class131 == null && bool_318_) {
					class131 = new Class131();
					Class131_Sub2_Sub10_Sub1
					    .aClass180_6542.method2523
					    (false, (long) i_317_, class131);
				    }
				}
				break;
			    }
			    if (i_4_ == 5234) {
				int i_319_ = anIntArray2249[--i];
				if (Class131_Sub2_Sub10_Sub1.aClass180_6542
				    != null) {
				    Class131 class131
					= Class131_Sub2_Sub10_Sub1
					      .aClass180_6542
					      .method2521(90, (long) i_319_);
				    anIntArray2249[i++]
					= class131 != null ? 1 : 0;
				} else
				    anIntArray2249[i++] = 0;
				break;
			    }
			    if (i_4_ == 5235) {
				anIntArray2249[i++]
				    = ((Class127.aClass131_Sub41_Sub1_1703
					!= null)
				       ? (Class127.aClass131_Sub41_Sub1_1703
					  .anInt6161)
				       : -1);
				break;
			    }
			} else if (i_4_ < 5400) {
			    if (i_4_ == 5300) {
				i -= 2;
				int i_320_ = anIntArray2249[i];
				int i_321_ = anIntArray2249[i + 1];
				Class148.method2177(3, i_320_, i_321_, false,
						    true);
				anIntArray2249[i++]
				    = Class74.aFrame1014 != null ? 1 : 0;
				break;
			    }
			    if (i_4_ == 5301) {
				if (Class74.aFrame1014 != null)
				    Class148.method2177(Class91.anInt1184, -1,
							-1, false, true);
				break;
			    }
			    if (i_4_ == 5302) {
				Class39[] class39s
				    = Class131_Sub2_Sub6.method1496((byte) 96);
				anIntArray2249[i++] = class39s.length;
				break;
			    }
			    if (i_4_ == 5303) {
				int i_322_ = anIntArray2249[--i];
				Class39[] class39s
				    = Class131_Sub2_Sub6
					  .method1496((byte) 100);
				anIntArray2249[i++]
				    = class39s[i_322_].anInt510;
				anIntArray2249[i++]
				    = class39s[i_322_].anInt513;
				break;
			    }
			    if (i_4_ == 5305) {
				int i_323_ = Class90.anInt1176;
				int i_324_ = Class14.anInt163;
				int i_325_ = -1;
				Class39[] class39s
				    = Class131_Sub2_Sub6.method1496((byte) 62);
				for (int i_326_ = 0; i_326_ < class39s.length;
				     i_326_++) {
				    Class39 class39 = class39s[i_326_];
				    if (class39.anInt510 == i_323_
					&& class39.anInt513 == i_324_) {
					i_325_ = i_326_;
					break;
				    }
				}
				anIntArray2249[i++] = i_325_;
				break;
			    }
			    if (i_4_ == 5306) {
				anIntArray2249[i++]
				    = Class131_Sub18.method1806(-45);
				break;
			    }
			    if (i_4_ == 5307) {
				int i_327_ = anIntArray2249[--i];
				if (i_327_ >= 1 && i_327_ <= 2)
				    Class148.method2177(i_327_, -1, -1, false,
							true);
				break;
			    }
			    if (i_4_ == 5308) {
				anIntArray2249[i++] = Class91.anInt1184;
				break;
			    }
			    if (i_4_ == 5309) {
				int i_328_ = anIntArray2249[--i];
				if (i_328_ >= 1 && i_328_ <= 2) {
				    Class91.anInt1184 = i_328_;
				    Class165.method2413((Class23_Sub4
							 .aSignLink_3734),
							(byte) -7);
				}
				break;
			    }
			} else if (i_4_ < 5500) {
			    if (i_4_ == 5400) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_329_
				    = aStringArray2246[i_1_ + 1];
				int i_330_ = anIntArray2249[--i];
				anInt2250++;
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(228);
				Class93.aClass131_Sub15_Sub2_1226.writeByte
				    ((Class131_Sub30.method1856((byte) -124,
								string)
				      + Class131_Sub30.method1856((byte) -106,
								  string_329_)
				      + 1));
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string, (byte) 64);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeString(string_329_, (byte) 118);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(i_330_);
				break;
			    }
			    if (i_4_ == 5401) {
				i -= 2;
				Class159.aShortArray2123[anIntArray2249[i]]
				    = (short) (Class187.method2583
					       (94, anIntArray2249[i + 1]));
				RuntimeException_Sub1.method2831(15020);
				Class23_Sub4_Sub4.method382(false);
				Class153_Sub2.method2237((byte) -114);
				Class110.method939((byte) 86);
				Class131_Sub2_Sub16.method1548((byte) -125);
				break;
			    }
			    if (i_4_ == 5405) {
				i -= 2;
				int i_331_ = anIntArray2249[i];
				int i_332_ = anIntArray2249[i + 1];
				if (i_331_ >= 0 && i_331_ < 2)
				    Class131_Sub41_Sub4
					.anIntArrayArrayArray6200[i_331_]
					= new int[i_332_ << 1][4];
				break;
			    }
			    if (i_4_ == 5406) {
				i -= 7;
				int i_333_ = anIntArray2249[i];
				int i_334_ = anIntArray2249[i + 1] << 1;
				int i_335_ = anIntArray2249[i + 2];
				int i_336_ = anIntArray2249[i + 3];
				int i_337_ = anIntArray2249[i + 4];
				int i_338_ = anIntArray2249[i + 5];
				int i_339_ = anIntArray2249[i + 6];
				if (i_333_ >= 0 && i_333_ < 2
				    && ((Class131_Sub41_Sub4
					 .anIntArrayArrayArray6200[i_333_])
					!= null)
				    && i_334_ >= 0
				    && i_334_ < (Class131_Sub41_Sub4
						 .anIntArrayArrayArray6200
						 [i_333_]).length) {
				    Class131_Sub41_Sub4
					.anIntArrayArrayArray6200[i_333_]
					[i_334_]
					= (new int[]
					   { (i_335_ >> 14 & 0x3fff) * 128,
					     i_336_, (i_335_ & 0x3fff) * 128,
					     i_339_ });
				    Class131_Sub41_Sub4
					.anIntArrayArrayArray6200[i_333_]
					[i_334_ + 1]
					= (new int[]
					   { (i_337_ >> 14 & 0x3fff) * 128,
					     i_338_,
					     (i_337_ & 0x3fff) * 128 });
				}
				break;
			    }
			    if (i_4_ == 5407) {
				int i_340_ = ((Class131_Sub41_Sub4
					       .anIntArrayArrayArray6200
					       [anIntArray2249[--i]]).length
					      >> 1);
				anIntArray2249[i++] = i_340_;
				break;
			    }
			    if (i_4_ == 5411) {
				if (Class74.aFrame1014 != null)
				    Class148.method2177(Class91.anInt1184, -1,
							-1, false, true);
				if (Class158.aFrame2095 != null) {
				    Class131_Sub38.method1891(6);
				    System.exit(0);
				} else {
				    String string
					= (Class160.aString2128 != null
					   ? Class160.aString2128
					   : Class131_Sub41_Sub11_Sub1
						 .method2007(-98));
				    Class169.method2438
					(false, string,
					 Stream.anInt4299 == 1,
					 Class23_Sub4.aSignLink_3734, false);
				}
				break;
			    }
			    if (i_4_ == 5419) {
				String string = "";
				if (Class183_Sub1.aClass139_4955 != null) {
				    if ((Class183_Sub1.aClass139_4955
					 .anObject1866)
					!= null)
					string = (String) (Class183_Sub1
							   .aClass139_4955
							   .anObject1866);
				    else
					string = (Class204.method2729
						  (false, (Class183_Sub1
							   .aClass139_4955
							   .anInt1862)));
				}
				aStringArray2246[i_1_++] = string;
				break;
			    }
			    if (i_4_ == 5420) {
				anIntArray2249[i++]
				    = SignLink.anInt2902 == 3 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 5421) {
				if (Class74.aFrame1014 != null)
				    Class148.method2177(Class91.anInt1184, -1,
							-1, false, true);
				String string = aStringArray2246[--i_1_];
				boolean bool_341_ = anIntArray2249[--i] == 1;
				String string_342_ = (Class131_Sub41_Sub11_Sub1
							  .method2007(-110)
						      + string);
				Class169.method2438(false, string_342_,
						    (Stream.anInt4299
						     == 1),
						    (Class23_Sub4
						     .aSignLink_3734),
						    bool_341_);
				break;
			    }
			    if (i_4_ == 5422) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_343_
				    = aStringArray2246[i_1_ + 1];
				int i_344_ = anIntArray2249[--i];
				if (string.length() > 0) {
				    if (Class155.aStringArray2066 == null)
					Class155.aStringArray2066
					    = (new String
					       [(Class20.anIntArray237
						 [Class126.anInt1696])]);
				    Class155.aStringArray2066[i_344_] = string;
				}
				if (string_343_.length() > 0) {
				    if (Class175.aStringArray2506 == null)
					Class175.aStringArray2506
					    = (new String
					       [(Class20.anIntArray237
						 [Class126.anInt1696])]);
				    Class175.aStringArray2506[i_344_]
					= string_343_;
				}
				break;
			    }
			    if (i_4_ == 5423) {
				System.out.println(aStringArray2246[--i_1_]);
				break;
			    }
			    if (i_4_ == 5424) {
				i -= 11;
				Class131_Sub42.anInt4685 = anIntArray2249[i];
				Class131_Sub41_Sub17.anInt6388
				    = anIntArray2249[i + 1];
				Class131_Sub41_Sub16.anInt6380
				    = anIntArray2249[i + 2];
				Class51.anInt671 = anIntArray2249[i + 3];
				Class200.anInt2926 = anIntArray2249[i + 4];
				Class131_Sub2_Sub36.anInt6054
				    = anIntArray2249[i + 5];
				Class131_Sub25.anInt4474
				    = anIntArray2249[i + 6];
				Class166.anInt2225 = anIntArray2249[i + 7];
				Class131_Sub2_Sub5.anInt5605
				    = anIntArray2249[i + 8];
				Class184.anInt2631 = anIntArray2249[i + 9];
				Class131_Sub2_Sub4.anInt5598
				    = anIntArray2249[i + 10];
				Class128.aClass158_1746
				    .method2343(-116, Class200.anInt2926);
				Class128.aClass158_1746.method2343
				    (-116, Class131_Sub2_Sub36.anInt6054);
				Class128.aClass158_1746.method2343
				    (-119, Class131_Sub25.anInt4474);
				Class128.aClass158_1746
				    .method2343(-117, Class166.anInt2225);
				Class128.aClass158_1746.method2343
				    (-116, Class131_Sub2_Sub5.anInt5605);
				Class43.aClass152_584
				    = Class58.aClass152_759
				    = Class120_Sub1.aClass152_3950 = null;
				Class214.aClass152_3143
				    = Class131_Sub14.aClass152_4294
				    = Class44.aClass152_595 = null;
				Class120.aClass152_1582
				    = Class204.aClass152_2978 = null;
				Class131_Sub2_Sub28.aBoolean5961 = true;
				break;
			    }
			    if (i_4_ == 5425) {
				Class23_Sub4_Sub2.method368((byte) -103);
				Class131_Sub2_Sub28.aBoolean5961 = false;
				break;
			    }
			    if (i_4_ == 5426) {
				i -= 2;
				Class53.anInt708 = anIntArray2249[i];
				InputStream_Sub1.anInt57
				    = anIntArray2249[i + 1];
				break;
			    }
			    if (i_4_ == 5427) {
				i -= 2;
				Class218.anInt3200 = anIntArray2249[i];
				Class131_Sub2_Sub22.anInt5862
				    = anIntArray2249[i + 1];
				break;
			    }
			    if (i_4_ == 5428) {
				i -= 2;
				int i_345_ = anIntArray2249[i];
				int i_346_ = anIntArray2249[i + 1];
				anIntArray2249[i++]
				    = (Class101.method886(i_345_, 4, i_346_)
				       ? 1 : 0);
				break;
			    }
			    if (i_4_ == 5429) {
				Class131_Sub2_Sub30.method1617
				    (83, false, aStringArray2246[--i_1_]);
				break;
			    }
			} else if (i_4_ < 5600) {
			    if (i_4_ == 5500) {
				i -= 4;
				int i_347_ = anIntArray2249[i];
				int i_348_ = anIntArray2249[i + 1];
				int i_349_ = anIntArray2249[i + 2];
				int i_350_ = anIntArray2249[i + 3];
				Class204.method2731(false, (byte) -126, i_349_,
						    i_348_,
						    ((i_347_ >> 14 & 0x3fff)
						     - Class92.regionX),
						    i_350_,
						    ((i_347_ & 0x3fff)
						     - Class64.regionY));
				break;
			    }
			    if (i_4_ == 5501) {
				i -= 4;
				int i_351_ = anIntArray2249[i];
				int i_352_ = anIntArray2249[i + 1];
				int i_353_ = anIntArray2249[i + 2];
				int i_354_ = anIntArray2249[i + 3];
				Class103.method906(((i_351_ & 0x3fff)
						    - Class64.regionY),
						   i_352_, i_354_, -1260,
						   ((i_351_ >> 14 & 0x3fff)
						    - Class92.regionX),
						   i_353_);
				break;
			    }
			    if (i_4_ == 5502) {
				i -= 6;
				int i_355_ = anIntArray2249[i];
				if (i_355_ >= 2)
				    throw new RuntimeException();
				OutputStream_Sub1.anInt72 = i_355_;
				int i_356_ = anIntArray2249[i + 1];
				if (i_356_ + 1
				    >= ((Class131_Sub41_Sub4
					 .anIntArrayArrayArray6200
					 [OutputStream_Sub1.anInt72]).length
					>> 1))
				    throw new RuntimeException();
				Class131_Sub41_Sub11.anInt6304 = i_356_;
				Class180.anInt2573 = 0;
				Class68.anInt919 = anIntArray2249[i + 2];
				Class121_Sub3_Sub1.anInt5432
				    = anIntArray2249[i + 3];
				int i_357_ = anIntArray2249[i + 4];
				if (i_357_ >= 2)
				    throw new RuntimeException();
				Class105.anInt1376 = i_357_;
				int i_358_ = anIntArray2249[i + 5];
				if (i_358_ + 1
				    >= (Class131_Sub41_Sub4
					.anIntArrayArrayArray6200
					[Class105.anInt1376]).length >> 1)
				    throw new RuntimeException();
				Class23_Sub1_Sub1.anInt5087 = i_358_;
				Class131_Sub2_Sub34.anInt6035 = 3;
				break;
			    }
			    if (i_4_ == 5503) {
				Class190.method2613(0);
				break;
			    }
			    if (i_4_ == 5504) {
				i -= 2;
				Class131_Sub43.method2092(anIntArray2249[i],
							  (anIntArray2249
							   [i + 1]),
							  0, (byte) 108);
				break;
			    }
			    if (i_4_ == 5505) {
				anIntArray2249[i++]
				    = (int) Class23_Sub1_Sub1.aFloat5082 >> 3;
				break;
			    }
			    if (i_4_ == 5506) {
				anIntArray2249[i++]
				    = (int) Class120.aFloat1578 >> 3;
				break;
			    }
			    if (i_4_ == 5507) {
				Class131_Sub41_Sub20.method2065(true);
				break;
			    }
			    if (i_4_ == 5508) {
				Class90.method842(-81);
				break;
			    }
			    if (i_4_ == 5509) {
				Class74.method758(-91);
				break;
			    }
			    if (i_4_ == 5510) {
				Class34.method461(0);
				break;
			    }
			    if (i_4_ == 5511) {
				int i_359_ = anIntArray2249[--i];
				int i_360_ = i_359_ >> 14 & 0x3fff;
				int i_361_ = i_359_ & 0x3fff;
				i_360_ -= Class92.regionX;
				if (i_360_ < 0)
				    i_360_ = 0;
				else if (i_360_ >= (Class131_Sub41_Sub11_Sub1
						    .anInt6546))
				    i_360_
					= Class131_Sub41_Sub11_Sub1.anInt6546;
				i_361_ -= Class64.regionY;
				if (i_361_ < 0)
				    i_361_ = 0;
				else if (i_361_
					 >= Class131_Sub2_Sub26.anInt5931)
				    i_361_ = Class131_Sub2_Sub26.anInt5931;
				Class23_Sub2_Sub2.anInt5169
				    = i_360_ * 128 + 64;
				Class50.anInt657 = i_361_ * 128 + 64;
				Class131_Sub2_Sub34.anInt6035 = 4;
				break;
			    }
			    if (i_4_ == 5512) {
				Class209.method2751((byte) -58);
				break;
			    }
			} else if (i_4_ < 5700) {
			    if (i_4_ == 5600) {
				i_1_ -= 2;
				String string = aStringArray2246[i_1_];
				String string_362_
				    = aStringArray2246[i_1_ + 1];
				int i_363_ = anIntArray2249[--i];
				if (Class133.anInt1803 == 10) {
				    if (Class131_Sub41_Sub15.anInt6364 == 0
					&& Class75.anInt1024 == 0
					&& Class176.anInt2523 == 0
					&& Class66.anInt878 == 0)
					Class131_Sub31.method1861(23820,
								  string_362_,
								  i_363_,
								  string);
				}
				break;
			    }
			    if (i_4_ == 5601) {
				Class171.method2447(-6);
				break;
			    }
			    if (i_4_ == 5602) {
				if (Class75.anInt1024 == 0)
				    Class4.anInt3281 = -2;
				break;
			    }
			    if (i_4_ == 5603) {
				i -= 4;
				if (Class133.anInt1803 == 10) {
				    if (Class131_Sub41_Sub15.anInt6364 == 0
					&& Class75.anInt1024 == 0
					&& Class176.anInt2523 == 0
					&& Class66.anInt878 == 0)
					Class115.method979
					    (anIntArray2249[i + 3],
					     anIntArray2249[i], 0,
					     anIntArray2249[i + 2],
					     anIntArray2249[i + 1]);
				}
				break;
			    }
			    if (i_4_ == 5604) {
				i_1_--;
				if (Class133.anInt1803 == 10) {
				    if (Class131_Sub41_Sub15.anInt6364 == 0
					&& Class75.anInt1024 == 0
					&& Class176.anInt2523 == 0
					&& Class66.anInt878 == 0)
					Class85.method809(-123,
							  (Class173.method2454
							   ((aStringArray2246
							     [i_1_]),
							    65535)));
				}
				break;
			    }
			    if (i_4_ == 5605) {
				i_1_ -= 3;
				i -= 7;
				if (Class133.anInt1803 == 10) {
				    if (Class131_Sub41_Sub15.anInt6364 == 0
					&& Class75.anInt1024 == 0
					&& Class176.anInt2523 == 0
					&& Class66.anInt878 == 0)
					Class137.method2117
					    (aStringArray2246[i_1_ + 2],
					     anIntArray2249[i + 2],
					     aStringArray2246[i_1_ + 1],
					     (Class173.method2454
					      (aStringArray2246[i_1_], 65535)),
					     anIntArray2249[i + 1],
					     anIntArray2249[i + 3],
					     anIntArray2249[i + 5] == 1,
					     anIntArray2249[i], 24672,
					     anIntArray2249[i + 6] == 1,
					     anIntArray2249[i + 4] == 1);
				}
				break;
			    }
			    if (i_4_ == 5606) {
				if (Class176.anInt2523 == 0)
				    Class131_Sub2_Sub20.anInt5838 = -2;
				break;
			    }
			    if (i_4_ == 5607) {
				anIntArray2249[i++] = Class4.anInt3281;
				break;
			    }
			    if (i_4_ == 5608) {
				anIntArray2249[i++] = Class4.anInt3295;
				break;
			    }
			    if (i_4_ == 5609) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub20.anInt5838;
				break;
			    }
			    if (i_4_ == 5610) {
				for (int i_364_ = 0; i_364_ < 5; i_364_++)
				    aStringArray2246[i_1_++]
					= ((Class31.aStringArray440.length
					    > i_364_)
					   ? (Class22.method267
					      (Class31.aStringArray440[i_364_],
					       (byte) -39))
					   : "");
				Class31.aStringArray440 = null;
				break;
			    }
			    if (i_4_ == 5611) {
				anIntArray2249[i++] = Class1_Sub4.anInt3547;
				break;
			    }
			} else if (i_4_ < 6100) {
			    if (i_4_ == 6001) {
				int i_365_ = anIntArray2249[--i];
				if (i_365_ < 1)
				    i_365_ = 1;
				if (i_365_ > 4)
				    i_365_ = 4;
				Class134.anInt1809 = i_365_;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6002) {
				Class130.method1254(anIntArray2249[--i] == 1,
						    -44);
				Class105.method916(0);
				Class88.method827(1);
				Class201.method2718((byte) -101);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6003) {
				Class91.aBoolean1180
				    = anIntArray2249[--i] == 1;
				Class201.method2718((byte) -101);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6005) {
				Class135.aBoolean1818
				    = anIntArray2249[--i] == 1;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6006) {
				Class183.aBoolean2613
				    = anIntArray2249[--i] == 1;
				Class183_Sub1.aClass130_4960
				    .method1171(!Class183.aBoolean2613);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6007) {
				Class171.anInt2284 = anIntArray2249[--i];
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6008) {
				Class131_Sub33.aBoolean4557
				    = anIntArray2249[--i] == 1;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6009) {
				Class103.aBoolean1349
				    = anIntArray2249[--i] == 1;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6010) {
				Class121.aBoolean1588
				    = anIntArray2249[--i] == 1;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6011) {
				int i_366_ = anIntArray2249[--i];
				if (i_366_ < 0 || i_366_ > 2)
				    i_366_ = 0;
				Class131_Sub2_Sub16.anInt5779 = i_366_;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6012) {
				Class167.aBoolean2235
				    = anIntArray2249[--i] == 1;
				Class149.method2183(61);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6014) {
				Class23_Sub1_Sub2.aBoolean5159
				    = anIntArray2249[--i] == 1;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6015) {
				Class131_Sub8_Sub1.aBoolean6089
				    = anIntArray2249[--i] == 1;
				Class88.method827(1);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6016) {
				int i_367_ = anIntArray2249[--i];
				if (i_367_ < 0 || i_367_ > 2)
				    i_367_ = 0;
				Class131_Sub41_Sub21.anInt6442 = i_367_;
				Class131_Sub41_Sub4.method1947((byte) -115);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6017) {
				Class58.aBoolean765 = anIntArray2249[--i] == 1;
				Class200.method2717(22050);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6018) {
				int i_368_ = anIntArray2249[--i];
				if (i_368_ < 0)
				    i_368_ = 0;
				if (i_368_ > 127)
				    i_368_ = 127;
				Class23_Sub4_Sub2.anInt5380 = i_368_;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6019) {
				int i_369_ = anIntArray2249[--i];
				if (i_369_ < 0)
				    i_369_ = 0;
				if (i_369_ > 255)
				    i_369_ = 255;
				if (i_369_ != Class212.anInt3112) {
				    if (Class212.anInt3112 == 0
					&& (Class131_Sub2_Sub10.anInt5705
					    != -1)) {
					Class115.method978((Class131_Sub2_Sub10
							    .anInt5705),
							   0, i_369_, -127,
							   false,
							   (Class156
							    .aClass158_2074));
					Class23_Sub2.aBoolean3718 = false;
				    } else if (i_369_ == 0) {
					Class46.method571((byte) -116);
					Class23_Sub2.aBoolean3718 = false;
				    } else
					Class131_Sub2_Sub1.method1478(i_369_,
								      0);
				    Class212.anInt3112 = i_369_;
				}
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6020) {
				int i_370_ = anIntArray2249[--i];
				if (i_370_ < 0)
				    i_370_ = 0;
				if (i_370_ > 127)
				    i_370_ = 127;
				InputStream_Sub1.anInt55 = i_370_;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6021) {
				Class64.aBoolean814 = anIntArray2249[--i] == 1;
				Class201.method2718((byte) -101);
				break;
			    }
			    if (i_4_ == 6023) {
				int i_371_ = anIntArray2249[--i];
				boolean bool_372_ = false;
				if (i_371_ < 0)
				    i_371_ = 0;
				if (i_371_ > 2)
				    i_371_ = 2;
				if (Class1_Sub4.anInt3554 < 96) {
				    i_371_ = 0;
				    bool_372_ = true;
				}
				Class131_Sub41_Sub19.method2060(i_371_, 0);
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				anIntArray2249[i++] = bool_372_ ? 0 : 1;
				break;
			    }
			    if (i_4_ == 6024) {
				int i_373_ = anIntArray2249[--i];
				if (i_373_ < 0 || i_373_ > 2)
				    i_373_ = 0;
				Class131_Sub7.anInt4165 = i_373_;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6025) {
				int i_374_ = anIntArray2249[--i];
				if (i_374_ < 0 || i_374_ > 3)
				    i_374_ = 0;
				Class141.anInt1876 = i_374_;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			    if (i_4_ == 6027) {
				int i_375_ = anIntArray2249[--i];
				if (i_375_ < 0 || i_375_ > 1)
				    i_375_ = 0;
				Class46.method565(i_375_ == 1, 47);
				break;
			    }
			    if (i_4_ == 6028) {
				Class40.aBoolean533 = anIntArray2249[--i] != 0;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6029) {
				Class171.anInt2284 = anIntArray2249[--i];
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6030) {
				Class131_Sub13.aBoolean4268
				    = anIntArray2249[--i] != 0;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class88.method827(1);
				break;
			    }
			    if (i_4_ == 6031) {
				int i_376_ = anIntArray2249[--i];
				if (i_376_ < 0 || i_376_ > 3)
				    i_376_ = 2;
				Class131_Sub2_Sub38.method1644(i_376_, -106);
				break;
			    }
			    if (i_4_ == 6032) {
				int i_377_ = anIntArray2249[--i];
				if (i_377_ < 0 || i_377_ > 3)
				    i_377_ = 2;
				Class131_Sub2_Sub10_Sub1.anInt6537 = i_377_;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				Class131_Sub38.aBoolean4627 = false;
				break;
			    }
			} else if (i_4_ < 6200) {
			    if (i_4_ == 6101) {
				anIntArray2249[i++] = Class134.anInt1809;
				break;
			    }
			    if (i_4_ == 6102) {
				anIntArray2249[i++]
				    = Class9.method182((byte) 118) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6103) {
				anIntArray2249[i++]
				    = Class91.aBoolean1180 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6105) {
				anIntArray2249[i++]
				    = Class135.aBoolean1818 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6106) {
				anIntArray2249[i++]
				    = Class183.aBoolean2613 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6107) {
				anIntArray2249[i++] = Class171.anInt2284;
				break;
			    }
			    if (i_4_ == 6108) {
				anIntArray2249[i++]
				    = Class131_Sub33.aBoolean4557 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6109) {
				anIntArray2249[i++]
				    = Class103.aBoolean1349 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6110) {
				anIntArray2249[i++]
				    = Class121.aBoolean1588 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6111) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub16.anInt5779;
				break;
			    }
			    if (i_4_ == 6112) {
				anIntArray2249[i++]
				    = Class167.aBoolean2235 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6114) {
				anIntArray2249[i++]
				    = Class23_Sub1_Sub2.aBoolean5159 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6115) {
				anIntArray2249[i++]
				    = Class131_Sub8_Sub1.aBoolean6089 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6116) {
				anIntArray2249[i++]
				    = Class131_Sub41_Sub21.anInt6442;
				break;
			    }
			    if (i_4_ == 6117) {
				anIntArray2249[i++]
				    = Class58.aBoolean765 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6118) {
				anIntArray2249[i++]
				    = Class23_Sub4_Sub2.anInt5380;
				break;
			    }
			    if (i_4_ == 6119) {
				anIntArray2249[i++] = Class212.anInt3112;
				break;
			    }
			    if (i_4_ == 6120) {
				anIntArray2249[i++] = InputStream_Sub1.anInt55;
				break;
			    }
			    if (i_4_ == 6121) {
				anIntArray2249[i++]
				    = Class183_Sub1.aClass130_4960
					  .method1245() ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6123) {
				anIntArray2249[i++]
				    = Class186.method2563(-105);
				break;
			    }
			    if (i_4_ == 6124) {
				anIntArray2249[i++] = Class131_Sub7.anInt4165;
				break;
			    }
			    if (i_4_ == 6125) {
				anIntArray2249[i++] = Class141.anInt1876;
				break;
			    }
			    if (i_4_ == 6126) {
				anIntArray2249[i++]
				    = Class183_Sub1.aClass130_4960
					  .method1213() ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6127) {
				anIntArray2249[i++]
				    = Class177.aBoolean2530 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6128) {
				anIntArray2249[i++]
				    = Class40.aBoolean533 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6129) {
				anIntArray2249[i++] = Class171.anInt2284;
				break;
			    }
			    if (i_4_ == 6130) {
				anIntArray2249[i++]
				    = Class131_Sub13.aBoolean4268 ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6131) {
				anIntArray2249[i++] = Stream.anInt4299;
				break;
			    }
			    if (i_4_ == 6132) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub10_Sub1.anInt6537;
				break;
			    }
			    if (i_4_ == 6133) {
				anIntArray2249[i++]
				    = (SignLink.anInt2902 == 1
				       || SignLink.anInt2902 == 4) ? 1 : 0;
				break;
			    }
			} else if (i_4_ < 6300) {
			    if (i_4_ == 6200) {
				i -= 2;
				Class131_Sub41_Sub9.aShort6277
				    = (short) anIntArray2249[i];
				if (Class131_Sub41_Sub9.aShort6277 <= 0)
				    Class131_Sub41_Sub9.aShort6277
					= (short) 256;
				Class63.aShort804
				    = (short) anIntArray2249[i + 1];
				if (Class63.aShort804 <= 0)
				    Class63.aShort804 = (short) 205;
				break;
			    }
			    if (i_4_ == 6201) {
				i -= 2;
				Class131_Sub2_Sub14.aShort5750
				    = (short) anIntArray2249[i];
				if (Class131_Sub2_Sub14.aShort5750 <= 0)
				    Class131_Sub2_Sub14.aShort5750
					= (short) 256;
				Class204.aShort2977
				    = (short) anIntArray2249[i + 1];
				if (Class204.aShort2977 <= 0)
				    Class204.aShort2977 = (short) 320;
				break;
			    }
			    if (i_4_ == 6202) {
				i -= 4;
				Class131_Sub2_Sub17.aShort5814
				    = (short) anIntArray2249[i];
				if (Class131_Sub2_Sub17.aShort5814 <= 0)
				    Class131_Sub2_Sub17.aShort5814 = (short) 1;
				Class23_Sub1.aShort3698
				    = (short) anIntArray2249[i + 1];
				if (Class23_Sub1.aShort3698 <= 0)
				    Class23_Sub1.aShort3698 = (short) 32767;
				else if (Class23_Sub1.aShort3698
					 < Class131_Sub2_Sub17.aShort5814)
				    Class23_Sub1.aShort3698
					= Class131_Sub2_Sub17.aShort5814;
				Class131_Sub2_Sub1.aShort5557
				    = (short) anIntArray2249[i + 2];
				if (Class131_Sub2_Sub1.aShort5557 <= 0)
				    Class131_Sub2_Sub1.aShort5557 = (short) 1;
				Class23_Sub4_Sub4.aShort5382
				    = (short) anIntArray2249[i + 3];
				if (Class23_Sub4_Sub4.aShort5382 <= 0)
				    Class23_Sub4_Sub4.aShort5382
					= (short) 32767;
				else if (Class23_Sub4_Sub4.aShort5382
					 < Class131_Sub2_Sub1.aShort5557)
				    Class23_Sub4_Sub4.aShort5382
					= Class131_Sub2_Sub1.aShort5557;
				break;
			    }
			    if (i_4_ == 6203) {
				Class153_Sub1.method2235
				    (Class121_Sub1.aClass173_3981.anInt2437,
				     Class121_Sub1.aClass173_3981.anInt2411, 0,
				     false, 0, 3516);
				anIntArray2249[i++] = Class71.anInt947;
				anIntArray2249[i++]
				    = Class131_Sub2_Sub32.anInt6016;
				break;
			    }
			    if (i_4_ == 6204) {
				anIntArray2249[i++]
				    = Class131_Sub2_Sub14.aShort5750;
				anIntArray2249[i++] = Class204.aShort2977;
				break;
			    }
			    if (i_4_ == 6205) {
				anIntArray2249[i++]
				    = Class131_Sub41_Sub9.aShort6277;
				anIntArray2249[i++] = Class63.aShort804;
				break;
			    }
			} else if (i_4_ < 6400) {
			    if (i_4_ == 6300) {
				anIntArray2249[i++]
				    = (int) (Class208.method2749(-3913)
					     / 60000L);
				break;
			    }
			    if (i_4_ == 6301) {
				anIntArray2249[i++]
				    = (int) (Class208.method2749(-3913)
					     / 86400000L) - 11745;
				break;
			    }
			    if (i_4_ == 6302) {
				i -= 3;
				int i_378_ = anIntArray2249[i];
				int i_379_ = anIntArray2249[i + 1];
				int i_380_ = anIntArray2249[i + 2];
				aCalendar2258.clear();
				aCalendar2258.set(11, 12);
				aCalendar2258.set(i_380_, i_379_, i_378_);
				anIntArray2249[i++]
				    = (int) (aCalendar2258.getTime().getTime()
					     / 86400000L) - 11745;
				break;
			    }
			    if (i_4_ == 6303) {
				aCalendar2258.clear();
				aCalendar2258.setTime
				    (new Date(Class208.method2749(-3913)));
				anIntArray2249[i++] = aCalendar2258.get(1);
				break;
			    }
			    if (i_4_ == 6304) {
				int i_381_ = anIntArray2249[--i];
				boolean bool_382_ = true;
				if (i_381_ < 0)
				    bool_382_ = (i_381_ + 1) % 4 == 0;
				else if (i_381_ < 1582)
				    bool_382_ = i_381_ % 4 == 0;
				else if (i_381_ % 4 != 0)
				    bool_382_ = false;
				else if (i_381_ % 100 != 0)
				    bool_382_ = true;
				else if (i_381_ % 400 != 0)
				    bool_382_ = false;
				anIntArray2249[i++] = bool_382_ ? 1 : 0;
				break;
			    }
			} else if (i_4_ < 6500) {
			    if (i_4_ == 6405) {
				anIntArray2249[i++]
				    = Class188.method2590(3) ? 1 : 0;
				break;
			    }
			    if (i_4_ == 6406) {
				anIntArray2249[i++]
				    = Applet_Sub1.method52(13026) ? 1 : 0;
				break;
			    }
			} else if (i_4_ < 6600) {
			    if (i_4_ == 6500) {
				if (Class133.anInt1803 != 10
				    || Class131_Sub41_Sub15.anInt6364 != 0
				    || Class75.anInt1024 != 0
				    || Class176.anInt2523 != 0)
				    anIntArray2249[i++] = 1;
				else
				    anIntArray2249[i++]
					= (Class197.method2674(109) != -1 ? 1
					   : 0);
				break;
			    }
			    if (i_4_ == 6501) {
				Class128_Sub1 class128_sub1
				    = Class181.method2533(true);
				if (class128_sub1 != null) {
				    anIntArray2249[i++]
					= class128_sub1.anInt4022;
				    anIntArray2249[i++]
					= class128_sub1.anInt1749;
				    aStringArray2246[i_1_++]
					= class128_sub1.aString4020;
				    Class84 class84
					= class128_sub1.method1148(20203);
				    anIntArray2249[i++] = class84.anInt1102;
				    aStringArray2246[i_1_++]
					= class84.aString1100;
				    anIntArray2249[i++]
					= class128_sub1.anInt1744;
				    anIntArray2249[i++]
					= class128_sub1.anInt4015;
				} else {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = 0;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    anIntArray2249[i++] = 0;
				}
				break;
			    }
			    if (i_4_ == 6502) {
				Class128_Sub1 class128_sub1
				    = Class202.method2726(112);
				if (class128_sub1 != null) {
				    anIntArray2249[i++]
					= class128_sub1.anInt4022;
				    anIntArray2249[i++]
					= class128_sub1.anInt1749;
				    aStringArray2246[i_1_++]
					= class128_sub1.aString4020;
				    Class84 class84
					= class128_sub1.method1148(20203);
				    anIntArray2249[i++] = class84.anInt1102;
				    aStringArray2246[i_1_++]
					= class84.aString1100;
				    anIntArray2249[i++]
					= class128_sub1.anInt1744;
				    anIntArray2249[i++]
					= class128_sub1.anInt4015;
				} else {
				    anIntArray2249[i++] = -1;
				    anIntArray2249[i++] = 0;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    anIntArray2249[i++] = 0;
				}
				break;
			    }
			    if (i_4_ == 6503) {
				int i_383_ = anIntArray2249[--i];
				if (Class133.anInt1803 != 10
				    || Class131_Sub41_Sub15.anInt6364 != 0
				    || Class75.anInt1024 != 0
				    || Class176.anInt2523 != 0)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (Class179.method2502(i_383_, 50000)
					   ? 1 : 0);
				break;
			    }
			    if (i_4_ == 6504) {
				Class46_Sub1.anInt3787 = anIntArray2249[--i];
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6505) {
				anIntArray2249[i++] = Class46_Sub1.anInt3787;
				break;
			    }
			    if (i_4_ == 6506) {
				int i_384_ = anIntArray2249[--i];
				Class128_Sub1 class128_sub1
				    = OutputStream_Sub1.method89(i_384_,
								 (byte) 94);
				if (class128_sub1 != null) {
				    anIntArray2249[i++]
					= class128_sub1.anInt1749;
				    aStringArray2246[i_1_++]
					= class128_sub1.aString4020;
				    Class84 class84
					= class128_sub1.method1148(20203);
				    anIntArray2249[i++] = class84.anInt1102;
				    aStringArray2246[i_1_++]
					= class84.aString1100;
				    anIntArray2249[i++]
					= class128_sub1.anInt1744;
				    anIntArray2249[i++]
					= class128_sub1.anInt4015;
				} else {
				    anIntArray2249[i++] = -1;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    aStringArray2246[i_1_++] = "";
				    anIntArray2249[i++] = 0;
				    anIntArray2249[i++] = 0;
				}
				break;
			    }
			    if (i_4_ == 6507) {
				i -= 4;
				int i_385_ = anIntArray2249[i];
				boolean bool_386_ = anIntArray2249[i + 1] == 1;
				int i_387_ = anIntArray2249[i + 2];
				boolean bool_388_ = anIntArray2249[i + 3] == 1;
				Class76.method772(bool_388_, bool_386_, i_387_,
						  i_385_, (byte) 7);
				break;
			    }
			    if (i_4_ == 6508) {
				Class23_Sub4_Sub5.method391(-23144);
				break;
			    }
			    if (i_4_ == 6509) {
				if (Class133.anInt1803 == 10) {
				    if (anIntArray2249[--i] == 1) {
					if (Class131_Sub2_Sub7.aClass166_5635
					    == null)
					    Class131_Sub2_Sub7.aClass166_5635
						= new Class166();
				    } else if ((Class131_Sub2_Sub7
						.aClass166_5635)
					       != null) {
					Class131_Sub2_Sub7.aClass166_5635
					    .method2423(-11400);
					Class131_Sub2_Sub7.aClass166_5635
					    = null;
				    }
				}
				break;
			    }
			} else if (i_4_ < 6700) {
			    if (i_4_ == 6600) {
				Class131_Sub6.aBoolean4143
				    = anIntArray2249[--i] == 1;
				Class165.method2413((Class23_Sub4
						     .aSignLink_3734),
						    (byte) -7);
				break;
			    }
			    if (i_4_ == 6601) {
				anIntArray2249[i++]
				    = Class131_Sub6.aBoolean4143 ? 1 : 0;
				break;
			    }
			} else if (i_4_ < 6800 && Class214.anInt3138 == 2) {
			    if (i_4_ == 6700) {
				int i_389_
				    = Class83.aClass180_1096.method2522(17167);
				if (Class187.anInt2674 != -1)
				    i_389_++;
				anIntArray2249[i++] = i_389_;
				break;
			    }
			    if (i_4_ == 6701) {
				int i_390_ = anIntArray2249[--i];
				if (Class187.anInt2674 != -1) {
				    if (i_390_ == 0) {
					anIntArray2249[i++]
					    = Class187.anInt2674;
					break;
				    }
				    i_390_--;
				}
				Class131_Sub33 class131_sub33
				    = ((Class131_Sub33)
				       Class83.aClass180_1096.method2520(0));
				while (i_390_-- > 0)
				    class131_sub33
					= (Class131_Sub33) Class83
							       .aClass180_1096
							       .method2518(0);
				anIntArray2249[i++] = class131_sub33.anInt4556;
				break;
			    }
			    if (i_4_ == 6702) {
				int i_391_ = anIntArray2249[--i];
				if ((Class131_Sub2_Sub9.aClass173ArrayArray5684
				     [i_391_])
				    == null)
				    aStringArray2246[i_1_++] = "";
				else {
				    String string = (Class131_Sub2_Sub9
						     .aClass173ArrayArray5684
						     [i_391_][0].aString2473);
				    if (string == null)
					aStringArray2246[i_1_++] = "";
				    else
					aStringArray2246[i_1_++]
					    = (string.substring
					       (0, string.indexOf(':')));
				}
				break;
			    }
			    if (i_4_ == 6703) {
				int i_392_ = anIntArray2249[--i];
				if ((Class131_Sub2_Sub9.aClass173ArrayArray5684
				     [i_392_])
				    == null)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (Class131_Sub2_Sub9
					   .aClass173ArrayArray5684
					   [i_392_]).length;
				break;
			    }
			    if (i_4_ == 6704) {
				i -= 2;
				int i_393_ = anIntArray2249[i];
				int i_394_ = anIntArray2249[i + 1];
				if ((Class131_Sub2_Sub9.aClass173ArrayArray5684
				     [i_393_])
				    == null)
				    aStringArray2246[i_1_++] = "";
				else {
				    String string
					= (Class131_Sub2_Sub9
					   .aClass173ArrayArray5684[i_393_]
					   [i_394_].aString2473);
				    if (string == null)
					aStringArray2246[i_1_++] = "";
				    else
					aStringArray2246[i_1_++] = string;
				}
				break;
			    }
			    if (i_4_ == 6705) {
				i -= 2;
				int i_395_ = anIntArray2249[i];
				int i_396_ = anIntArray2249[i + 1];
				if ((Class131_Sub2_Sub9.aClass173ArrayArray5684
				     [i_395_])
				    == null)
				    anIntArray2249[i++] = 0;
				else
				    anIntArray2249[i++]
					= (Class131_Sub2_Sub9
					   .aClass173ArrayArray5684[i_395_]
					   [i_396_].anInt2340);
				break;
			    }
			    if (i_4_ == 6706)
				break;
			    if (i_4_ == 6707) {
				i -= 3;
				int i_397_ = anIntArray2249[i];
				int i_398_ = anIntArray2249[i + 1];
				int i_399_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_397_ << 16 | i_398_, 1,
						 i_399_);
				break;
			    }
			    if (i_4_ == 6708) {
				i -= 3;
				int i_400_ = anIntArray2249[i];
				int i_401_ = anIntArray2249[i + 1];
				int i_402_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_400_ << 16 | i_401_, 2,
						 i_402_);
				break;
			    }
			    if (i_4_ == 6709) {
				i -= 3;
				int i_403_ = anIntArray2249[i];
				int i_404_ = anIntArray2249[i + 1];
				int i_405_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_403_ << 16 | i_404_, 3,
						 i_405_);
				break;
			    }
			    if (i_4_ == 6710) {
				i -= 3;
				int i_406_ = anIntArray2249[i];
				int i_407_ = anIntArray2249[i + 1];
				int i_408_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_406_ << 16 | i_407_, 4,
						 i_408_);
				break;
			    }
			    if (i_4_ == 6711) {
				i -= 3;
				int i_409_ = anIntArray2249[i];
				int i_410_ = anIntArray2249[i + 1];
				int i_411_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_409_ << 16 | i_410_, 5,
						 i_411_);
				break;
			    }
			    if (i_4_ == 6712) {
				i -= 3;
				int i_412_ = anIntArray2249[i];
				int i_413_ = anIntArray2249[i + 1];
				int i_414_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_412_ << 16 | i_413_, 6,
						 i_414_);
				break;
			    }
			    if (i_4_ == 6713) {
				i -= 3;
				int i_415_ = anIntArray2249[i];
				int i_416_ = anIntArray2249[i + 1];
				int i_417_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_415_ << 16 | i_416_, 7,
						 i_417_);
				break;
			    }
			    if (i_4_ == 6714) {
				i -= 3;
				int i_418_ = anIntArray2249[i];
				int i_419_ = anIntArray2249[i + 1];
				int i_420_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_418_ << 16 | i_419_, 8,
						 i_420_);
				break;
			    }
			    if (i_4_ == 6715) {
				i -= 3;
				int i_421_ = anIntArray2249[i];
				int i_422_ = anIntArray2249[i + 1];
				int i_423_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_421_ << 16 | i_422_, 9,
						 i_423_);
				break;
			    }
			    if (i_4_ == 6716) {
				i -= 3;
				int i_424_ = anIntArray2249[i];
				int i_425_ = anIntArray2249[i + 1];
				int i_426_ = anIntArray2249[i + 2];
				Class5.method161((byte) 31, "",
						 i_424_ << 16 | i_425_, 10,
						 i_426_);
				break;
			    }
			    if (i_4_ == 6717) {
				i -= 3;
				int i_427_ = anIntArray2249[i];
				int i_428_ = anIntArray2249[i + 1];
				int i_429_ = anIntArray2249[i + 2];
				Class173 class173
				    = InputStream_Sub1.method87(i_429_,
								(i_427_ << 16
								 | i_428_),
								(byte) -118);
				Class63.method666(2878);
				Class131_Sub37 class131_sub37
				    = client.method66(class173);
				Class23_Sub1_Sub2.method303
				    (class131_sub37.anInt4602,
				     class173.anInt2374, i_429_, false,
				     class173.anInt2303,
				     class131_sub37.method1888((byte) 94),
				     i_427_ << 16 | i_428_);
				break;
			    }
			} else if (i_4_ < 6900) {
			    if (i_4_ == 6800) {
				int i_430_ = anIntArray2249[--i];
				Class94 class94
				    = Class131_Sub2_Sub32.method1626(i_430_,
								     (byte) 1);
				if (class94.aString1235 == null)
				    aStringArray2246[i_1_++] = "";
				else
				    aStringArray2246[i_1_++]
					= class94.aString1235;
				break;
			    }
			    if (i_4_ == 6801) {
				int i_431_ = anIntArray2249[--i];
				Class94 class94
				    = Class131_Sub2_Sub32.method1626(i_431_,
								     (byte) 1);
				anIntArray2249[i++] = class94.anInt1266;
				break;
			    }
			    if (i_4_ == 6802) {
				int i_432_ = anIntArray2249[--i];
				Class94 class94
				    = Class131_Sub2_Sub32.method1626(i_432_,
								     (byte) 1);
				anIntArray2249[i++] = class94.anInt1256;
				break;
			    }
			    if (i_4_ == 6803) {
				int i_433_ = anIntArray2249[--i];
				Class94 class94
				    = Class131_Sub2_Sub32.method1626(i_433_,
								     (byte) 1);
				anIntArray2249[i++] = class94.anInt1262;
				break;
			    }
			}
		    }
		    throw new IllegalStateException();
		} while (false);
	    }
	} catch (Exception exception) {
	    if (arg0.aString6352 != null) {
		Class186.method2562(("Clientscript error in: "
				     + arg0.aString6352),
				    (byte) 53);
		StringBuffer stringbuffer = new StringBuffer(30);
		stringbuffer.append("Clientscript error in: ").append
		    (arg0.aString6352).append("\n");
		for (int i_434_ = anInt2247 - 1; i_434_ >= 0; i_434_--)
		    stringbuffer.append("via: ").append
			(aClass43Array2257[i_434_].aClass131_Sub41_Sub15_582
			 .aString6352)
			.append("\n");
		stringbuffer.append("Op: ").append(i_4_).append("\n");
		String string = exception.getMessage();
		if (string != null && string.length() > 0)
		    stringbuffer.append("Message: ").append(string)
			.append("\n");
		Class45.method563(stringbuffer.toString(), exception, 0);
		Class131_Sub2_Sub15.method1540(-80, stringbuffer.toString());
	    } else {
		StringBuffer stringbuffer = new StringBuffer(30);
		stringbuffer.append("CS2: ").append(arg0.aLong1791)
		    .append(" ");
		for (int i_435_ = anInt2247 - 1; i_435_ >= 0; i_435_--)
		    stringbuffer.append("v: ").append
			(aClass43Array2257[i_435_].aClass131_Sub41_Sub15_582
			 .aLong1791)
			.append(" ");
		stringbuffer.append("op: ").append(i_4_);
		Class45.method563(stringbuffer.toString(), exception, 0);
	    }
	}
    }
    
    public static void method2436(Class131_Sub14 arg0, int arg1) {
	Object[] objects = arg0.anObjectArray4281;
	int i = ((Integer) objects[0]).intValue();
	Class131_Sub41_Sub15 class131_sub41_sub15
	    = Class131_Sub24.method1826(-25652, i);
	if (class131_sub41_sub15 != null) {
	    anIntArray2244 = new int[class131_sub41_sub15.anInt6361];
	    int i_436_ = 0;
	    aStringArray2240 = new String[class131_sub41_sub15.anInt6362];
	    int i_437_ = 0;
	    for (int i_438_ = 1; i_438_ < objects.length; i_438_++) {
		if (objects[i_438_] instanceof Integer) {
		    int i_439_ = ((Integer) objects[i_438_]).intValue();
		    if (i_439_ == -2147483647)
			i_439_ = arg0.anInt4279;
		    if (i_439_ == -2147483646)
			i_439_ = arg0.anInt4285;
		    if (i_439_ == -2147483645)
			i_439_ = (arg0.aClass173_4276 != null
				  ? arg0.aClass173_4276.anInt2455 : -1);
		    if (i_439_ == -2147483644)
			i_439_ = arg0.anInt4275;
		    if (i_439_ == -2147483643)
			i_439_ = (arg0.aClass173_4276 != null
				  ? arg0.aClass173_4276.anInt2350 : -1);
		    if (i_439_ == -2147483642)
			i_439_ = (arg0.aClass173_4280 != null
				  ? arg0.aClass173_4280.anInt2455 : -1);
		    if (i_439_ == -2147483641)
			i_439_ = (arg0.aClass173_4280 != null
				  ? arg0.aClass173_4280.anInt2350 : -1);
		    if (i_439_ == -2147483640)
			i_439_ = arg0.anInt4292;
		    if (i_439_ == -2147483639)
			i_439_ = arg0.anInt4283;
		    anIntArray2244[i_436_++] = i_439_;
		} else if (objects[i_438_] instanceof String) {
		    String string = (String) objects[i_438_];
		    if (string.equals("event_opbase"))
			string = arg0.aString4277;
		    aStringArray2240[i_437_++] = string;
		}
	    }
	    method2435(class131_sub41_sub15, arg1);
	}
    }
    
    public static void method2437(Class131_Sub14 arg0) {
	method2436(arg0, 200000);
    }
    
    static {
	anInt2247 = 0;
	aClass43Array2257 = new Class43[50];
	aStringArray2246 = new String[1000];
	anIntArray2259 = new int[5];
	anIntArrayArray2255 = new int[5][5000];
	aCalendar2258 = Calendar.getInstance();
	anIntArray2262 = new int[3];
	aStringArray2264
	    = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			     "Aug", "Sep", "Oct", "Nov", "Dec" };
	aClass214_2263 = new Class214(4);
    }
}
