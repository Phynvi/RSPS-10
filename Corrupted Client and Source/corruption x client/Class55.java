/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55
{
    public byte[][] aByteArrayArray711;
    public static int anInt712;
    public static int anInt713;
    public static int anInt714;
    public static int anInt715;
    public static int anInt716;
    public int anInt717;
    public static int anInt718;
    public static int anInt719;
    public byte[] aByteArray720;
    public static int anInt721;
    public static int anInt722;
    public int anInt723;
    public static int anInt724;
    public static int anInt725;
    public static Stream[] aStreamArray726
	= new Stream[2048];
    public int anInt727;
    public static int anInt728;
    public static int anInt729;
    public static int anInt730;

    public int method610(int arg0, int arg1) {
	try {
	    anInt730++;
	    if (arg1 <= 79)
		method615(-87, -39, 74);
	    return aByteArray720[arg0] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int[] method611(int arg0, int[] arg1, int arg2) {
	try {
	    anInt721++;
	    if (arg2 != 36)
		aStreamArray726 = null;
	    int[] is = new int[1152];
	    int i = 0;
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -33; i_0_++) {
		for (int i_1_ = 0; i_1_ < 36; i_1_++) {
		    int i_2_ = arg1[i];
		    if (i_2_ == 0) {
			if (i_1_ > 0 && (arg1[i + -1] ^ 0xffffffff) != -1)
			    i_2_ = arg0;
			else if (i_0_ <= 0 || arg1[i - 36] == 0) {
			    if ((i_1_ ^ 0xffffffff) <= -36
				|| arg1[i - -1] == 0) {
				if (i_0_ < 31 && arg1[i + 36] != 0)
				    i_2_ = arg0;
			    } else
				i_2_ = arg0;
			} else
			    i_2_ = arg0;
		    }
		    is[i++] = i_2_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class187 method612(int arg0, int arg1) {
	try {
	    anInt722++;
	    Class187 class187;
	    synchronized (Class173.aClass214_2425) {
		class187 = (Class187) Class173.aClass214_2425
					  .method2780(122, (long) arg0);
	    }
	    if (class187 != null)
		return class187;
	    byte[] is
		= (Class177.aClass158_2527.method2364
		   (Class131_Sub27.method1840(-10210, arg0),
		    Class131_Sub2_Sub12.method1529(1867186728, arg0), 0));
	    class187 = new Class187();
	    class187.anInt2713 = arg0;
	    if (is != null)
		class187.method2577(new Stream(is), 4204);
	    class187.method2568(true);
	    if (!Class131_Sub2_Sub13.aBoolean5738 && class187.aBoolean2721) {
		class187.aStringArray2682 = null;
		class187.anIntArray2655 = null;
	    }
	    if (class187.aBoolean2724) {
		class187.anInt2693 = 0;
		class187.aBoolean2691 = false;
	    }
	    synchronized (Class173.aClass214_2425) {
		Class173.aClass214_2425.method2773(true, class187,
						   (long) arg0);
	    }
	    int i = 71 / ((arg1 - 79) / 34);
	    return class187;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method613(char arg0, boolean arg1, int arg2) {
	try {
	    anInt728++;
	    if (arg1 != false)
		method617((byte) 126, -9, null, null);
	    if (aByteArrayArray711 == null)
		return 0;
	    return aByteArrayArray711[arg2][arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method614(Class152[] arg0, String arg1, byte arg2) {
	try {
	    anInt725++;
	    if (arg1 == null)
		return 0;
	    int i = -1;
	    int i_3_ = -1;
	    int i_4_ = 0;
	    int i_5_ = arg1.length();
	    if (arg2 != -43)
		return 91;
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		char c = arg1.charAt(i_6_);
		if (c == 60)
		    i = i_6_;
		else {
		    if ((c ^ 0xffffffff) == -63 && i != -1) {
			String string = arg1.substring(1 + i, i_6_);
			i = -1;
			if (!string.equals("lt")) {
			    if (!string.equals("gt")) {
				if (string.equals("nbsp"))
				    c = '\u00a0';
				else if (string.equals("shy"))
				    c = '\u00ad';
				else if (string.equals("times"))
				    c = '\u00d7';
				else if (!string.equals("euro")) {
				    if (string.equals("copy"))
					c = '\u00a9';
				    else if (string.equals("reg"))
					c = '\u00ae';
				    else {
					if (string.startsWith("img=")
					    && arg0 != null) {
					    try {
						int i_7_
						    = (Class161.method2393
						       (string.substring(4),
							(byte) 20));
						i_4_
						    += arg0[i_7_].method2216();
						i_3_ = -1;
					    } catch (Exception exception) {
						/* empty */
					    }
					}
					continue;
				    }
				} else
				    c = '\u20ac';
			    } else
				c = '>';
			} else
			    c = '<';
		    }
		    if (i == -1) {
			i_4_ += 0xff & (aByteArray720
					[0xff & Class44.method542(c, true)]);
			if (aByteArrayArray711 != null
			    && (i_3_ ^ 0xffffffff) != 0)
			    i_4_ += aByteArrayArray711[i_3_][c];
			i_3_ = c;
		    }
		}
	    }
	    return i_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.K("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static int method615(int arg0, int arg1, int arg2) {
	try {
	    anInt712++;
	    if ((arg0 ^ 0xffffffff) == -2 || arg0 == 3)
		return Class161.anIntArray2150[arg2 & 0x3];
	    if (arg1 != 10036)
		return -56;
	    return Class203.anIntArray2963[0x3 & arg2];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.M(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method616(int arg0, String arg1, int arg2, Class152[] arg3) {
	try {
	    anInt715++;
	    int i = -26 / ((-11 - arg0) / 41);
	    return method620(new int[] { arg2 }, 117, arg1,
			     Class131_Sub41_Sub17_Sub1.aStringArray6570, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method617(byte arg0, int arg1, String arg2, Class152[] arg3) {
	try {
	    anInt716++;
	    int i
		= method620(new int[] { arg1 }, -39, arg2,
			    Class131_Sub41_Sub17_Sub1.aStringArray6570, arg3);
	    int i_8_ = 0;
	    if (arg0 >= -54)
		anInt723 = -82;
	    for (int i_9_ = 0; (i ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		 i_9_++) {
		int i_10_
		    = method614(arg3, (Class131_Sub41_Sub17_Sub1
				       .aStringArray6570[i_9_]), (byte) -43);
		if ((i_10_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
		    i_8_ = i_10_;
	    }
	    return i_8_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.L(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method618(Class152[] arg0, String arg1, int arg2, int arg3,
			 int arg4) {
	try {
	    if (arg4 == 0)
		arg4 = anInt727;
	    anInt719++;
	    int i
		= method620(new int[] { arg2 }, arg3 + 110, arg1,
			    Class131_Sub41_Sub17_Sub1.aStringArray6570, arg0);
	    int i_11_ = (i - arg3) * arg4;
	    return anInt717 + anInt723 + i_11_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method619(int arg0) {
	try {
	    for (Class131_Sub21 class131_sub21
		     = (Class131_Sub21) Class66.aClass119_843.method1007(0);
		 class131_sub21 != null;
		 class131_sub21
		     = (Class131_Sub21) Class66.aClass119_843.method1014(0)) {
		if (Class23_Sub4_Sub1_Sub2.method365(class131_sub21.anInt4442,
						     63))
		    Class115.method982(false, class131_sub21);
	    }
	    anInt724++;
	    if ((Class147.anInt1946 ^ 0xffffffff) == -2) {
		Class131_Sub2_Sub24.aBoolean5890 = false;
		Class12.method213(Class131_Sub1_Sub4.anInt5537,
				  Class131_Sub41_Sub17.anInt6384,
				  Class40.anInt525, Class89.anInt3268, -118);
	    } else {
		Class12.method213(Class131_Sub1_Sub4.anInt5537,
				  Class131_Sub41_Sub17.anInt6384,
				  Class40.anInt525, Class89.anInt3268, -76);
		int i = (Class89.aClass55_3259.method621
			 ((byte) 100, Class131_Sub41_Sub21_Sub2.aString6593));
		for (Class131_Sub21 class131_sub21
			 = ((Class131_Sub21)
			    Class66.aClass119_843.method1007(0));
		     class131_sub21 != null;
		     class131_sub21 = ((Class131_Sub21)
				       Class66.aClass119_843.method1014(0))) {
		    int i_12_
			= Class142.method2136((byte) 120, class131_sub21);
		    if (i < i_12_)
			i = i_12_;
		}
		Class131_Sub41_Sub17.anInt6384
		    = (16 * Class147.anInt1946
		       + (!Class131_Sub2_Sub28.aBoolean5961 ? 22 : 26));
		Class89.anInt3268 = 8 + i;
	    }
	    int i = -66 % ((45 - arg0) / 59);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fi.A(" + arg0 + ')');
	}
    }
    
    public int method620(int[] arg0, int arg1, String arg2, String[] arg3,
			 Class152[] arg4) {
	try {
	    anInt713++;
	    if (arg2 == null)
		return 0;
	    int i = 0;
	    int i_13_ = 0;
	    int i_14_ = -1;
	    int i_15_ = 0;
	    int i_16_ = 0;
	    int i_17_ = -1;
	    int i_18_ = -1;
	    int i_19_ = 0;
	    int i_20_ = arg2.length();
	    for (int i_21_ = 0; (i_20_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
		 i_21_++) {
		int i_22_ = 0xff & Class44.method542(arg2.charAt(i_21_), true);
		int i_23_ = 0;
		if (i_22_ == 60)
		    i_17_ = i_21_;
		else {
		    int i_24_;
		    if (i_17_ != -1) {
			if (i_22_ != 62)
			    continue;
			i_24_ = i_17_;
			String string = arg2.substring(1 + i_17_, i_21_);
			i_17_ = -1;
			if (!string.equals("br")) {
			    if (string.equals("lt")) {
				i_23_ += method610(60, 97);
				if (aByteArrayArray711 != null && i_18_ != -1)
				    i_23_ += aByteArrayArray711[i_18_][60];
				i_18_ = 60;
			    } else if (string.equals("gt")) {
				i_23_ += method610(62, 103);
				if (aByteArrayArray711 != null
				    && (i_18_ ^ 0xffffffff) != 0)
				    i_23_ += aByteArrayArray711[i_18_][62];
				i_18_ = 62;
			    } else if (!string.equals("nbsp")) {
				if (string.equals("shy")) {
				    i_23_ += method610(173, 117);
				    if (aByteArrayArray711 != null
					&& (i_18_ ^ 0xffffffff) != 0)
					i_23_
					    += aByteArrayArray711[i_18_][173];
				    i_18_ = 173;
				} else if (string.equals("times")) {
				    i_23_ += method610(215, 117);
				    if (aByteArrayArray711 != null
					&& (i_18_ ^ 0xffffffff) != 0)
					i_23_
					    += aByteArrayArray711[i_18_][215];
				    i_18_ = 215;
				} else if (string.equals("euro")) {
				    i_23_ += method610(8364, 116);
				    if (aByteArrayArray711 != null
					&& i_18_ != -1)
					i_23_
					    += aByteArrayArray711[i_18_][8364];
				    i_18_ = 8364;
				} else if (string.equals("copy")) {
				    i_23_ += method610(169, 83);
				    if (aByteArrayArray711 != null
					&& (i_18_ ^ 0xffffffff) != 0)
					i_23_
					    += aByteArrayArray711[i_18_][169];
				    i_18_ = 169;
				} else if (string.equals("reg")) {
				    i_23_ += method610(174, 108);
				    if (aByteArrayArray711 != null
					&& i_18_ != -1)
					i_23_
					    += aByteArrayArray711[i_18_][174];
				    i_18_ = 174;
				} else if (string.startsWith("img=")
					   && arg4 != null) {
				    try {
					int i_25_ = (Class161.method2393
						     (string.substring(4),
						      (byte) 20));
					i_23_ += arg4[i_25_].method2216();
					i_18_ = -1;
				    } catch (Exception exception) {
					/* empty */
				    }
				}
			    } else {
				i_23_ += method610(160, 92);
				if (aByteArrayArray711 != null && i_18_ != -1)
				    i_23_ += aByteArrayArray711[i_18_][160];
				i_18_ = 160;
			    }
			} else {
			    arg3[i_19_] = arg2.substring(i_13_, i_21_ + 1);
			    i_19_++;
			    if (arg3.length <= i_19_)
				return 0;
			    i_14_ = -1;
			    i_13_ = 1 + i_21_;
			    i_18_ = -1;
			    i = 0;
			    continue;
			}
			i_22_ = -1;
		    } else {
			i_23_ += method610(i_22_, 108);
			i_24_ = i_21_;
			if (aByteArrayArray711 != null && i_18_ != -1)
			    i_23_ += aByteArrayArray711[i_18_][i_22_];
			i_18_ = i_22_;
		    }
		    if ((i_23_ ^ 0xffffffff) < -1) {
			i += i_23_;
			if (arg0 != null) {
			    if (i_22_ == 32) {
				i_16_ = 1;
				i_15_ = i;
				i_14_ = i_21_;
			    }
			    if (arg0[(((arg0.length ^ 0xffffffff)
				       < (i_19_ ^ 0xffffffff))
				      ? i_19_ : arg0.length - 1)]
				< i) {
				if (i_14_ >= 0) {
				    arg3[i_19_]
					= arg2.substring(i_13_,
							 -i_16_ + (1 + i_14_));
				    if (++i_19_ >= arg3.length)
					return 0;
				    i_13_ = 1 + i_14_;
				    i -= i_15_;
				    i_18_ = -1;
				    i_14_ = -1;
				} else {
				    arg3[i_19_] = arg2.substring(i_13_, i_24_);
				    i_19_++;
				    if (arg3.length <= i_19_)
					return 0;
				    i_13_ = i_24_;
				    i_18_ = -1;
				    i = i_23_;
				    i_14_ = -1;
				}
			    }
			    if (i_22_ == 45) {
				i_16_ = 0;
				i_15_ = i;
				i_14_ = i_21_;
			    }
			}
		    }
		}
	    }
	    if ((arg2.length() ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
		arg3[i_19_] = arg2.substring(i_13_, arg2.length());
		i_19_++;
	    }
	    int i_26_ = 25 % ((66 - arg1) / 39);
	    return i_19_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fi.D(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int method621(byte arg0, String arg1) {
	try {
	    anInt729++;
	    int i = -71 % ((29 - arg0) / 45);
	    return method614(null, arg1, (byte) -43);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class55(byte[] arg0) {
	try {
	    Stream stream = new Stream(arg0);
	    int i = stream.readUnsignedByte(86);
	    if (i != 0)
		throw new RuntimeException("");
	    boolean bool = stream.readUnsignedByte(65) == 1;
	    aByteArray720 = new byte[256];
	    stream.method1768(0, 256, (byte) -101, aByteArray720);
	    if (bool) {
		int[] is = new int[256];
		int[] is_27_ = new int[256];
		for (int i_28_ = 0; i_28_ < 256; i_28_++)
		    is[i_28_] = stream.readUnsignedByte(71);
		for (int i_29_ = 0; i_29_ < 256; i_29_++)
		    is_27_[i_29_] = stream.readUnsignedByte(-56);
		byte[][] is_30_ = new byte[256][];
		for (int i_31_ = 0; i_31_ < 256; i_31_++) {
		    is_30_[i_31_] = new byte[is[i_31_]];
		    byte i_32_ = 0;
		    for (int i_33_ = 0; is_30_[i_31_].length > i_33_;
			 i_33_++) {
			i_32_ += stream.readSignedByte((byte) 127);
			is_30_[i_31_][i_33_] = i_32_;
		    }
		}
		byte[][] is_34_ = new byte[256][];
		for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -257; i_35_++) {
		    is_34_[i_35_] = new byte[is[i_35_]];
		    byte i_36_ = 0;
		    for (int i_37_ = 0; is_34_[i_35_].length > i_37_;
			 i_37_++) {
			i_36_ += stream.readSignedByte((byte) 127);
			is_34_[i_35_][i_37_] = i_36_;
		    }
		}
		aByteArrayArray711 = new byte[256][256];
		for (int i_38_ = 0; i_38_ < 256; i_38_++) {
		    if (i_38_ != 32 && (i_38_ ^ 0xffffffff) != -161) {
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -257;
			     i_39_++) {
			    if (i_39_ != 32 && (i_39_ ^ 0xffffffff) != -161)
				aByteArrayArray711[i_38_][i_39_]
				    = (byte) (Class22_Sub1.method280
					      (i_38_, false, is_34_,
					       aByteArray720, i_39_, is,
					       is_30_, is_27_));
			}
		    }
		}
		anInt727 = is[32] + is_27_[32];
	    } else
		anInt727 = stream.readUnsignedByte(-45);
	    stream.readUnsignedByte(64);
	    stream.readUnsignedByte(63);
	    anInt723 = stream.readUnsignedByte(123);
	    anInt717 = stream.readUnsignedByte(104);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fi.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method622(int arg0) {
	aStreamArray726 = null;
	if (arg0 < 32)
	    anInt714 = -33;
    }
    
    static {
	anInt718 = -14475237;
    }
}
