/* Class23_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class23_Sub4_Sub1 extends Class23_Sub4
{ //entity
    public int anInt5235;
    public int anInt5236 = 0;
    public int anInt5237;
    public static int anInt5238;
    public static int anInt5239;
    public static int anInt5240;
    public static int anInt5241;
    public int anInt5242 = -1;
    public static int anInt5243;
    public static int[] anIntArray5244 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2,
					   2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    public int anInt5245;
    public int anInt5246;
    public int anInt5247;
    public int anInt5248;
    public int anInt5249;
    public static int anInt5250;
    public int anInt5251;
    public int anInt5252;
    public int anInt5253;
    public int anInt5254;
    public int anInt5255;
    public int anInt5256;
    public static int anInt5257;
    public int anInt5258;
    public int anInt5259;
    public int anInt5260;
    public boolean aBoolean5261;
    public int anInt5262;
    public int anInt5263 = 0;
    public int anInt5264;
    public static int anInt5265;
    public int anInt5266;
    public int anInt5267;
    public static int anInt5268;
    public int anInt5269;
    public int[] anIntArray5270;
    public int anInt5271;
    public int anInt5272;
    public int anInt5273;
    public int anInt5274;
    public int anInt5275;
    public int anInt5276;
    public int anInt5277;
    public int anInt5278;
    public int[] anIntArray5279;
    public String aString5280;
    public int anInt5281;
    public static int anInt5282;
    public int anInt5283;
    public static int anInt5284;
    public int anInt5285;
    public int anInt5286;
    public int anInt5287;
    public int anInt5288;
    public static int anInt5289;
    public static int anInt5290;
    public int anInt5291;
    public static int anInt5292;
    public boolean aBoolean5293;
    public static int anInt5294;
    public int anInt5295;
    public static int anInt5296;
    public Class171 aClass171_5297;
    public static int anInt5298;
    public int anInt5299;
    public int anInt5300;
    public int anInt5301;
    public int anInt5302;
    public static int anInt5303;
    public int anInt5304;
    public int anInt5305;
    public int anInt5306;
    public int anInt5307;
    public int[] anIntArray5308;
    public boolean aBoolean5309;
    public int anInt5310;
    public static int anInt5311;
    public boolean aBoolean5312;
    public Class141[] aClass141Array5313;
    public Class171 aClass171_5314;
    public Class171 aClass171_5315;
    public Class1_Sub6 aClass1_Sub6_5316;
    public int anInt5317;
    public int anInt5318;
    public int anInt5319;
    public int anInt5320;
    public int anInt5321;
    public byte[] aByteArray5322;
    public int anInt5323;
    public int anInt5324;
    public int anInt5325;
    public boolean aBoolean5326;
    public int anInt5327;
    public int[] anIntArray5328;
    public Class154[] aClass154Array5329;
    public int anInt5330;
    public int[] anIntArray5331;
    public int anInt5332;
    public Interface6 anInterface6_5333;
    public int anInt5334;
    public int anInt5335;
    
    public void method328(int arg0, boolean arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	aByte3740 = (byte) arg4;
	anInt5265++;
	if ((anInt5247 ^ 0xffffffff) != 0
	    && Class145.method2159(anInt5247, (byte) -94).anInt2162 == 1)
	    anInt5247 = -1;
	if (anInt5253 != -1) {
	    Class112 class112 = Class151.method2194(anInt5253, -6861);
	    if (class112.aBoolean1448 && (class112.anInt1450 ^ 0xffffffff) != 0
		&& ((Class145.method2159(class112.anInt1450, (byte) -112)
		     .anInt2162)
		    ^ 0xffffffff) == -2)
		anInt5253 = -1;
	}
	if (!arg1) {
	    int i = arg0 - anIntArray5328[0];
	    int i_0_ = -anIntArray5331[0] + arg5;
	    if ((i ^ 0xffffffff) <= 7 && i <= 8 && (i_0_ ^ 0xffffffff) <= 7
		&& i_0_ <= 8) {
		if ((anInt5334 ^ 0xffffffff) > -10)
		    anInt5334++;
		for (int i_1_ = anInt5334; i_1_ > 0; i_1_--) {
		    anIntArray5328[i_1_] = anIntArray5328[i_1_ + -1];
		    anIntArray5331[i_1_] = anIntArray5331[-1 + i_1_];
		    aByteArray5322[i_1_] = aByteArray5322[i_1_ - 1];
		}
		anIntArray5328[0] = arg0;
		aByteArray5322[0] = (byte) 1;
		anIntArray5331[0] = arg5;
		return;
	    }
	}
	anInt5321 = 0;
	anIntArray5328[0] = arg0;
	anInt5330 = 0;
	anInt5334 = 0;
	if (arg2 != 16383)
	    anInt5302 = 107;
	anIntArray5331[0] = arg5;
	anInt3733 = anIntArray5328[0] * 128 + 64 * arg3;
	anInt3747 = arg3 * 64 + anIntArray5331[0] * 128;
	if (Class166.aClass23_Sub4_Sub1_Sub2_2216 == this)
	    Class121_Sub1.method1043(arg2 + -16417);
	if (aClass1_Sub6_5316 != null)
	    aClass1_Sub6_5316.method121();
    }
    
    public static int method329(String arg0, int arg1, int arg2, String arg3) {
	try {
	    anInt5239++;
	    int i = arg0.length();
	    int i_2_ = arg3.length();
	    int i_3_ = 0;
	    int i_4_ = 0;
	    char c = '\0';
	    char c_5_ = '\0';
	while_13_:
	    do {
		char c_6_;
		char c_7_;
		for (;;) {
		    if (i <= i_3_ + -c && -c_5_ + i_4_ >= i_2_)
			break while_13_;
		    if ((-c + i_3_ ^ 0xffffffff) <= (i ^ 0xffffffff))
			return -1;
		    if (-c_5_ + i_4_ >= i_2_)
			return 1;
		    if ((c ^ 0xffffffff) == -1)
			c_6_ = arg0.charAt(i_3_++);
		    else {
			c_6_ = c;
			boolean bool = false;
		    }
		    if (c_5_ != 0) {
			c_7_ = c_5_;
			boolean bool = false;
		    } else
			c_7_ = arg3.charAt(i_4_++);
		    c = Class131_Sub2_Sub25.method1589(c_6_, 118);
		    c_5_ = Class131_Sub2_Sub25.method1589(c_7_, -95);
		    c_6_ = InputStream_Sub1.method83(c_6_, false, arg2);
		    c_7_ = InputStream_Sub1.method83(c_7_, false, arg2);
		    if ((c_7_ ^ 0xffffffff) != (c_6_ ^ 0xffffffff)
			&& ((Character.toUpperCase(c_6_) ^ 0xffffffff)
			    != (Character.toUpperCase(c_7_) ^ 0xffffffff))) {
			c_6_ = Character.toLowerCase(c_6_);
			c_7_ = Character.toLowerCase(c_7_);
			if ((c_7_ ^ 0xffffffff) != (c_6_ ^ 0xffffffff))
			    break;
		    }
		}
		return (Class182.method2536(1, arg2, c_6_)
			- Class182.method2536(1, arg2, c_7_));
	    } while (false);
	    int i_8_ = Math.min(i, i_2_);
	    for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		 i_9_++) {
		if ((arg2 ^ 0xffffffff) == -3) {
		    i_4_ = -i_9_ + i_2_ + -1;
		    i_3_ = i - 1 - i_9_;
		} else
		    i_3_ = i_4_ = i_9_;
		char c_10_ = arg0.charAt(i_3_);
		char c_11_ = arg3.charAt(i_4_);
		if (c_10_ != c_11_ && (Character.toUpperCase(c_10_)
				       != Character.toUpperCase(c_11_))) {
		    c_10_ = Character.toLowerCase(c_10_);
		    c_11_ = Character.toLowerCase(c_11_);
		    if (c_10_ != c_11_)
			return (Class182.method2536(1, arg2, c_10_)
				- Class182.method2536(1, arg2, c_11_));
		}
	    }
	    int i_12_ = i + -i_2_;
	    if ((i_12_ ^ 0xffffffff) != -1)
		return i_12_;
	    for (int i_13_ = 0; i_8_ > i_13_; i_13_++) {
		char c_14_ = arg0.charAt(i_13_);
		char c_15_ = arg3.charAt(i_13_);
		if (c_14_ != c_15_)
		    return (Class182.method2536(1, arg2, c_14_)
			    - Class182.method2536(1, arg2, c_15_));
	    }
	    if (arg1 < 93)
		anIntArray5244 = null;
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.IA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method330(int arg0) {
	try {
	    anInt5257++;
	    Class72 class72 = method344(124);
	    int i = aClass171_5297.anInt2285;
	    boolean bool;
	    if ((class72.anInt992 ^ 0xffffffff) == -1)
		bool = aClass171_5297.method2442(1, anInt5260, anInt5310,
						 anInt5310);
	    else
		bool
		    = aClass171_5297.method2442(1, anInt5260, class72.anInt980,
						class72.anInt992);
	    if (arg0 != 2)
		return -33;
	    int i_16_ = aClass171_5297.anInt2285 + -i;
	    if ((i_16_ ^ 0xffffffff) == -1) {
		anInt5291 = 0;
		aClass171_5297.method2446(true, anInt5260);
	    } else
		anInt5291++;
	    if (!bool) {
		if (class72.anInt988 == 0)
		    aClass171_5314.method2446(true, 0);
		else
		    aClass171_5314.method2442(arg0 ^ 0x3, 0, class72.anInt961,
					      class72.anInt988);
		if (class72.anInt993 == 0)
		    aClass171_5315.method2446(true, 0);
		else
		    aClass171_5315.method2442(1, 0, class72.anInt969,
					      class72.anInt993);
	    } else {
		if (class72.anInt988 != 0) {
		    if ((i_16_ ^ 0xffffffff) >= -1)
			aClass171_5314.method2442(1, -class72.anInt956,
						  class72.anInt961,
						  class72.anInt988);
		    else
			aClass171_5314.method2442(1, class72.anInt956,
						  class72.anInt961,
						  class72.anInt988);
		}
		if ((class72.anInt993 ^ 0xffffffff) != -1)
		    aClass171_5315.method2442(1, class72.anInt965,
					      class72.anInt969,
					      class72.anInt993);
	    }
	    return i_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.DA(" + arg0 + ')');
	}
    }
    
    public void method331(byte arg0, Class130 arg1, Class154[] arg2,
			  boolean arg3) {
	do {
	    try {
		anInt5238++;
		if (!arg3) {
		    Class154 class154 = arg2[0];
		    Class154 class154_17_ = arg2[1];
		    if (class154 != null) {
			Class41[] class41s = class154.method2254();
			Class104[] class104s = class154.method2266();
			Class41[] class41s_18_ = null;
			Class104[] class104s_19_ = null;
			if (class154_17_ != null) {
			    class41s_18_ = class154_17_.method2254();
			    class104s_19_ = class154_17_.method2266();
			}
			if ((aClass1_Sub6_5316 == null
			     || aClass1_Sub6_5316.aBoolean3563)
			    && (class41s != null || class104s != null
				|| (class154_17_ != null
				    && (class41s_18_ != null
					|| class104s_19_ != null))))
			    aClass1_Sub6_5316
				= new Class1_Sub6(Class125.anInt1632);
			if (aClass1_Sub6_5316 != null) {
			    Object object = null;
			    Class41[] class41s_20_;
			    if (class41s_18_ != null) {
				if (class41s == null)
				    class41s_20_ = class41s_18_;
				else {
				    class41s_20_
					= new Class41[(class41s_18_.length
						       + class41s.length)];
				    Class61.method654(class41s, 0,
						      class41s_20_, 0,
						      class41s.length);
				    Class61.method654(class41s_18_, 0,
						      class41s_20_,
						      class41s.length,
						      class41s_18_.length);
				}
			    } else
				class41s_20_ = class41s;
			    Object object_21_ = null;
			    Class104[] class104s_22_;
			    if (class104s_19_ == null)
				class104s_22_ = class104s;
			    else if (class104s == null)
				class104s_22_ = class104s_19_;
			    else {
				class104s_22_
				    = new Class104[(class104s.length
						    + class104s_19_.length)];
				Class61.method654(class104s, 0, class104s_22_,
						  0, class104s.length);
				Class61.method654(class104s_19_, 0,
						  class104s_22_,
						  class104s.length,
						  class104s_19_.length);
			    }
			    aClass1_Sub6_5316.method120(arg1,
							(long) (Class125
								.anInt1632),
							class41s_20_,
							class104s_22_, false);
			}
			aBoolean5326 = true;
		    }
		} else if (aClass1_Sub6_5316 != null)
		    aClass1_Sub6_5316.method115((long) Class125.anInt1632);
		if (arg0 > -21)
		    method335((byte) 28);
		if (aClass1_Sub6_5316 == null)
		    break;
		aClass1_Sub6_5316.method123(aByte3740, aShort3745, aShort3742,
					    aShort3737, aShort3735);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("fg.U(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ',' + arg3 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public abstract int method332(byte i);
    
    public static void method333(int arg0, int arg1, int arg2, long arg3) {
	try {
	    anInt5292++;
	    if (arg2 != 25242)
		anIntArray5244 = null;
	    int i = (0x7fb60 & (int) arg3) >> 52024430;
	    int i_23_ = ((int) arg3 & 0x368aa9) >> 712940852;
	    int i_24_ = (int) (arg3 >>> 190464608) & 0x7fffffff;
	    if (i != 10 && i != 11 && (i ^ 0xffffffff) != -23)
		Class210.Flag(i, arg0, 0, 105, arg1, 0,
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5328[0]),
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5331[0]),
				    i_23_, 0, true);
	    else {
		Class187 class187 = Class55.method612(i_24_, -62);
		int i_25_;
		int i_26_;
		if (i_23_ != 0 && i_23_ != 2) {
		    i_26_ = class187.anInt2702;
		    i_25_ = class187.anInt2668;
		} else {
		    i_25_ = class187.anInt2702;
		    i_26_ = class187.anInt2668;
		}
		int i_27_ = class187.anInt2698;
		if (i_23_ != 0)
		    i_27_ = (0xf & i_27_ << i_23_) + (i_27_ >> 4 + -i_23_);
		Class210.Flag(0, arg0, i_27_, 103, arg1, i_26_,
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5328[0]),
				    (Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5331[0]),
				    0, i_25_, true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.LA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method334(byte arg0) {
	try {
	    int i = 59 / ((arg0 - 47) / 52);
	    anIntArray5244 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.KA(" + arg0 + ')');
	}
    }
    
    public int method335(byte arg0) {
	try {
	    anInt5303++;
	    if (arg0 >= -29)
		anInt5271 = -118;
	    return anInt5300;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.FA(" + arg0 + ')');
	}
    }
    
    public void method336(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt5243++;
	    int i = aShort3742 - -aShort3745 >> 2060159937;
	    int i_28_ = aShort3735 - -aShort3737 >> 1420898017;
	    int i_29_ = Class31.anIntArray434[arg3];
	    int i_30_ = Class31.anIntArray425[arg3];
	    int i_31_ = -arg2 / 2;
	    int i_32_ = -arg0 / 2;
	    int i_33_ = i_32_ * i_29_ + i_30_ * i_31_ >> -1876826257;
	    int i_34_ = i_32_ * i_30_ - i_31_ * i_29_ >> -989521105;
	    int i_35_ = Class131_Sub2_Sub34.method1630(-668, i_33_ + anInt3733,
						       i_28_, Class29.anInt300,
						       i, i_34_ + anInt3747);
	    if (arg1 != 2)
		anInt5277 = -115;
	    int i_36_ = arg2 / 2;
	    int i_37_ = -arg0 / 2;
	    int i_38_ = i_29_ * i_37_ - -(i_36_ * i_30_) >> -1130145233;
	    int i_39_ = -(i_29_ * i_36_) + i_37_ * i_30_ >> 1192918607;
	    int i_40_ = Class131_Sub2_Sub34.method1630(-668, i_38_ + anInt3733,
						       i_28_, Class29.anInt300,
						       i, anInt3747 + i_39_);
	    int i_41_ = -arg2 / 2;
	    int i_42_ = arg0 / 2;
	    int i_43_ = i_30_ * i_41_ + i_42_ * i_29_ >> 193575247;
	    int i_44_ = i_30_ * i_42_ - i_29_ * i_41_ >> -1996570865;
	    int i_45_ = Class131_Sub2_Sub34.method1630(-668, i_43_ + anInt3733,
						       i_28_, Class29.anInt300,
						       i, anInt3747 + i_44_);
	    int i_46_ = arg2 / 2;
	    int i_47_ = arg0 / 2;
	    int i_48_ = i_47_ * i_29_ - -(i_30_ * i_46_) >> -1145838097;
	    int i_49_ = i_47_ * i_30_ + -(i_46_ * i_29_) >> -2056620369;
	    int i_50_
		= Class131_Sub2_Sub34.method1630(-668, anInt3733 - -i_48_,
						 i_28_, Class29.anInt300, i,
						 i_49_ + anInt3747);
	    int i_51_
		= (i_35_ ^ 0xffffffff) <= (i_40_ ^ 0xffffffff) ? i_40_ : i_35_;
	    int i_52_
		= (i_50_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff) ? i_45_ : i_50_;
	    int i_53_ = i_40_ < i_50_ ? i_40_ : i_50_;
	    anInt5252 = 0x3fff & (int) (Math.atan2((double) (-i_52_ + i_51_),
						   (double) arg0)
					* 2607.5945876176133);
	    int i_54_
		= (i_45_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff) ? i_35_ : i_45_;
	    anInt5275
		= (int) (Math.atan2((double) (-i_53_ + i_54_), (double) arg2)
			 * 2607.5945876176133) & 0x3fff;
	    anInt5236 = i_35_ + i_50_;
	    if (i_45_ + i_40_ < anInt5236)
		anInt5236 = i_45_ + i_40_;
	    anInt5236 = -anInt3746 + (anInt5236 >> -198048927);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.MA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method337(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt5250++;
	    for (int i = arg0; (i ^ 0xffffffff) > -5; i++) {
		if (anIntArray5279[i] <= arg3) {
		    anIntArray5308[i] = arg1;
		    anIntArray5270[i] = arg2;
		    anIntArray5279[i] = 70 + arg3;
		    break;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.EA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method338(int arg0, int arg1) {
	do {
	    try {
		anInt5241++;
		anInt5260 = arg1 & 0x3fff;
		aClass171_5297.method2446(true, anInt5260);
		if (arg0 <= -40)
		    break;
		anInt5285 = -54;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("fg.CA(" + arg0 + ','
						     + arg1 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method325(byte arg0) {
	do {
	    try {
		anInt5282++;
		int i = 60 + (-1 + anInt5300) * 64;
		aShort3742 = (short) (anInt3733 + i >> -942999257);
		if (arg0 >= -15)
		    method329(null, -118, 41, null);
		aShort3735 = (short) (anInt3747 + i >> 618412039);
		aShort3737 = (short) (anInt3747 + -i >> 1817908903);
		aShort3745 = (short) (-i + anInt3733 >> -1408718297);
		if (aBoolean5309) {
		    int i_55_ = aClass171_5297.method2441((byte) 127);
		    if ((i_55_ ^ 0xffffffff) < -9217 && i_55_ < 15360)
			aShort3742++;
		    if (i_55_ > 1024 && i_55_ < 7168)
			aShort3745--;
		    if (i_55_ > 13312 || (i_55_ ^ 0xffffffff) > -3073)
			aShort3737--;
		    if (i_55_ > 5120 && i_55_ < 11264)
			aShort3735++;
		}
		if (anInterface6_5333 == null)
		    break;
		if (anInt5319 > aShort3742)
		    aShort3742 = (short) anInt5319;
		if (aShort3735 < anInt5335)
		    aShort3735 = (short) anInt5335;
		if (anInt5317 < aShort3745)
		    aShort3745 = (short) anInt5317;
		if (anInt5320 >= aShort3737)
		    break;
		aShort3737 = (short) anInt5320;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "fg.AA(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public void method339(int arg0, boolean arg1, int arg2) {
	do {
	    try {
		anInt5298++;
		int i = anIntArray5328[0];
		int i_56_ = anIntArray5331[0];
		if ((arg0 ^ 0xffffffff) == -1) {
		    i_56_++;
		    i--;
		}
		if ((arg0 ^ 0xffffffff) == -2)
		    i_56_++;
		if (arg0 == 2) {
		    i_56_++;
		    i++;
		}
		if (arg0 == 3)
		    i--;
		if ((arg0 ^ 0xffffffff) == -5)
		    i++;
		if ((arg0 ^ 0xffffffff) == -6) {
		    i--;
		    i_56_--;
		}
		if (arg0 == 6)
		    i_56_--;
		if ((arg0 ^ 0xffffffff) == -8) {
		    i_56_--;
		    i++;
		}
		if (anInt5247 != -1
		    && (Class145.method2159(anInt5247, (byte) -113).anInt2162
			^ 0xffffffff) == -2)
		    anInt5247 = -1;
		if ((anInt5253 ^ 0xffffffff) != 0) {
		    Class112 class112 = Class151.method2194(anInt5253, -6861);
		    if (class112.aBoolean1448
			&& (class112.anInt1450 ^ 0xffffffff) != 0
			&& ((Class145.method2159
			     (class112.anInt1450, (byte) -91).anInt2162)
			    ^ 0xffffffff) == -2)
			anInt5253 = -1;
		}
		if (anInt5334 < 9)
		    anInt5334++;
		for (int i_57_ = anInt5334; i_57_ > 0; i_57_--) {
		    anIntArray5328[i_57_] = anIntArray5328[i_57_ + -1];
		    anIntArray5331[i_57_] = anIntArray5331[-1 + i_57_];
		    aByteArray5322[i_57_] = aByteArray5322[-1 + i_57_];
		}
		anIntArray5328[0] = i;
		anIntArray5331[0] = i_56_;
		aByteArray5322[0] = (byte) arg2;
		if (arg1 == true)
		    break;
		method328(-111, false, 44, 64, -89, -3);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("fg.V(" + arg0 + ','
						     + arg1 + ',' + arg2
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method340(boolean arg0, int arg1) {
	do {
	    try {
		anInt5311++;
		anInt5300 = arg1;
		if (arg0 == true)
		    break;
		finalize();
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("fg.N(" + arg0 + ','
						     + arg1 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class23_Sub4_Sub1() {
	super(0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
	anInt5255 = -1;
	anInt5235 = 0;
	anInt5253 = -1;
	anInt5247 = -1;
	anInt5237 = 0;
	anInt5258 = -1;
	anInt5254 = -1;
	aBoolean5261 = false;
	anIntArray5270 = new int[4];
	anInt5251 = -1;
	anInt5273 = 0;
	anInt5256 = 0;
	anInt5252 = 0;
	anInt5269 = -1000;
	anInt5246 = 0;
	anInt5285 = 0;
	anInt5275 = 0;
	aString5280 = null;
	anInt5291 = 0;
	anIntArray5279 = new int[4];
	anInt5276 = 100;
	anInt5264 = -32768;
	anInt5248 = 0;
	anInt5262 = 0;
	anInt5299 = 0;
	anInt5278 = 0;
	anInt5272 = -1000;
	anInt5288 = 0;
	anInt5304 = -1;
	aBoolean5293 = true;
	anInt5300 = 1;
	anIntArray5308 = new int[4];
	anInt5305 = 0;
	anInt5301 = 0;
	anInt5283 = 0;
	aBoolean5309 = false;
	anInt5307 = 0;
	aBoolean5312 = false;
	aClass141Array5313 = new Class141[12];
	anInt5310 = 256;
	aClass171_5297 = new Class171();
	aClass171_5314 = new Class171();
	aClass171_5315 = new Class171();
	anInt5318 = 0;
	aByteArray5322 = new byte[10];
	aBoolean5326 = false;
	anInt5324 = 0;
	aClass154Array5329 = new Class154[3];
	anInt5330 = 0;
	anInt5332 = 0;
	anInt5321 = 0;
	anInt5334 = 0;
	anIntArray5331 = new int[10];
	anIntArray5328 = new int[10];
    }
    
    public void method341(int arg0, Class154 arg1) {
	try {
	    if (arg0 != 14889)
		method331((byte) 91, null, null, false);
	    anInt5296++;
	    int i = aClass171_5314.anInt2285;
	    int i_58_ = aClass171_5315.anInt2285;
	    if ((i ^ 0xffffffff) != -1 || i_58_ != 0) {
		int i_59_ = arg1.method2256() / 2;
		arg1.method2272(0, -i_59_, 0);
		arg1.method2251(0x3fff & i);
		arg1.method2288(i_58_ & 0x3fff);
		arg1.method2272(0, i_59_, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.PA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method342(byte arg0, int arg1, int arg2) {
	try {
	    anInt5289++;
	    int i = 1;
	    if (arg0 != 118)
		return 101;
	    while (arg2 > 1) {
		if ((0x1 & arg2 ^ 0xffffffff) != -1)
		    i *= arg1;
		arg2 >>= 1;
		arg1 *= arg1;
	    }
	    if (arg2 == 1)
		return i * arg1;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.R(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method343(boolean arg0) {
	try {
	    anInt5334 = 0;
	    anInt5330 = 0;
	    if (arg0 != true)
		anInt5275 = 25;
	    anInt5290++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.BA(" + arg0 + ')');
	}
    }
    
    public Class72 method344(int arg0) {
	try {
	    anInt5284++;
	    int i = method332((byte) 119);
	    if (arg0 < 91)
		return null;
	    if ((i ^ 0xffffffff) == 0)
		return Class193.aClass72_2829;
	    return Class131_Sub41_Sub5.method1958(i, (byte) 122);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.JA(" + arg0 + ')');
	}
    }
    
    public void finalize() {
	do {
	    try {
		anInt5240++;
		if (aClass1_Sub6_5316 == null)
		    break;
		aClass1_Sub6_5316.method119();
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "fg.finalize(" + ')');
	    }
	    break;
	} while (false);
    }
    
    public int method345(byte arg0) {
	try {
	    anInt5268++;
	    if (arg0 <= 78)
		return -28;
	    Class72 class72 = method344(124);
	    if ((class72.anInt964 ^ 0xffffffff) != 0)
		return class72.anInt964;
	    if (anInt5264 == -32768)
		return 200;
	    return -anInt5264;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fg.GA(" + arg0 + ')');
	}
    }
    
    public abstract int method346(byte i);
    
    public void method347(int arg0, int arg1) {
	try {
	    aClass171_5297.method2445(128);
	    anInt5294++;
	    if (arg0 != -1408718297)
		method331((byte) -19, null, null, true);
	    int i = 0x3fff & arg1 + -aClass171_5297.anInt2285;
	    if ((i ^ 0xffffffff) >= -8193)
		anInt5260 = i + aClass171_5297.anInt2285;
	    else
		anInt5260 = -16384 - (-i - aClass171_5297.anInt2285);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fg.W(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
