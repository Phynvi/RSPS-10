/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub1 extends OutputStream
{
    public static int anInt64;
    public static int anInt65;
    public static Class214 aClass214_66;
    public static Class158 aClass158_67;
    public static int anInt68;
    public static int anInt69;
    public static int anInt70;
    public static int anInt71;
    public static int anInt72 = -1;
    /*synthetic*/ public static Class aClass73;
    
    public void write(int arg0) throws IOException {
	try {
	    anInt64++;
	    throw new IOException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ge.write(" + arg0 + ')');
	}
    }
    
    public static byte[] method88(String arg0, byte arg1) {
	try {
	    anInt65++;
	    int i = -103 / ((75 - arg1) / 36);
	    int i_0_ = arg0.length();
	    byte[] is = new byte[i_0_];
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
		 i_1_++) {
		int i_2_ = arg0.charAt(i_1_);
		if (((i_2_ ^ 0xffffffff) >= -1 || i_2_ >= 128)
		    && (i_2_ < 160 || i_2_ > 255)) {
		    if ((i_2_ ^ 0xffffffff) != -8365) {
			if ((i_2_ ^ 0xffffffff) == -8219)
			    is[i_1_] = (byte) -126;
			else if ((i_2_ ^ 0xffffffff) == -403)
			    is[i_1_] = (byte) -125;
			else if (i_2_ == 8222)
			    is[i_1_] = (byte) -124;
			else if (i_2_ != 8230) {
			    if ((i_2_ ^ 0xffffffff) != -8225) {
				if ((i_2_ ^ 0xffffffff) != -8226) {
				    if ((i_2_ ^ 0xffffffff) == -711)
					is[i_1_] = (byte) -120;
				    else if (i_2_ == 8240)
					is[i_1_] = (byte) -119;
				    else if ((i_2_ ^ 0xffffffff) == -353)
					is[i_1_] = (byte) -118;
				    else if ((i_2_ ^ 0xffffffff) != -8250) {
					if (i_2_ == 338)
					    is[i_1_] = (byte) -116;
					else if (i_2_ == 381)
					    is[i_1_] = (byte) -114;
					else if ((i_2_ ^ 0xffffffff) == -8217)
					    is[i_1_] = (byte) -111;
					else if (i_2_ == 8217)
					    is[i_1_] = (byte) -110;
					else if (i_2_ != 8220) {
					    if (i_2_ == 8221)
						is[i_1_] = (byte) -108;
					    else if ((i_2_ ^ 0xffffffff)
						     == -8227)
						is[i_1_] = (byte) -107;
					    else if ((i_2_ ^ 0xffffffff)
						     != -8212) {
						if (i_2_ == 8212)
						    is[i_1_] = (byte) -105;
						else if ((i_2_ ^ 0xffffffff)
							 != -733) {
						    if (i_2_ != 8482) {
							if (i_2_ == 353)
							    is[i_1_]
								= (byte) -102;
							else if (i_2_
								 != 8250) {
							    if ((i_2_
								 ^ 0xffffffff)
								== -340)
								is[i_1_]
								    = (byte) -100;
							    else if (i_2_
								     != 382) {
								if (i_2_
								    == 376)
								    is[i_1_]
									= (byte) -97;
								else
								    is[i_1_]
									= (byte) 63;
							    } else
								is[i_1_]
								    = (byte) -98;
							} else
							    is[i_1_]
								= (byte) -101;
						    } else
							is[i_1_] = (byte) -103;
						} else
						    is[i_1_] = (byte) -104;
					    } else
						is[i_1_] = (byte) -106;
					} else
					    is[i_1_] = (byte) -109;
				    } else
					is[i_1_] = (byte) -117;
				} else
				    is[i_1_] = (byte) -121;
			    } else
				is[i_1_] = (byte) -122;
			} else
			    is[i_1_] = (byte) -123;
		    } else
			is[i_1_] = (byte) -128;
		} else
		    is[i_1_] = (byte) i_2_;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ge.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static Class128_Sub1 method89(int arg0, byte arg1) {
	try {
	    anInt70++;
	    if (!Class23_Sub1.aBoolean3701
		|| (arg0 ^ 0xffffffff) > (Class127_Sub1.anInt4008 ^ 0xffffffff)
		|| (arg0 ^ 0xffffffff) < (Class212.anInt3110 ^ 0xffffffff))
		return null;
	    if (arg1 < 66)
		method90(null, 125);
	    return (Class193.aClass128_Sub1Array2835
		    [-Class127_Sub1.anInt4008 + arg0]);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ge.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method90(Class23_Sub4_Sub1_Sub2 arg0, int arg1) {
	anInt68++;
	Class131_Sub19 class131_sub19
	    = (Class131_Sub19) Class131_Sub23.aClass180_4460
				   .method2521(-74, (long) arg0.anInt5274);
	if (class131_sub19 != null) {
	    if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
		Class78.aClass131_Sub1_Sub3_1057
		    .method1441(class131_sub19.aClass131_Sub1_Sub2_4393);
		class131_sub19.aClass131_Sub1_Sub2_4393 = null;
	    }
	    class131_sub19.method1355((byte) 127);
	}
	if (arg1 != 4)
	    method93(-124, -96, 115);
    }
    
    public static void method91(int arg0) {
	aClass214_66 = null;
	aClass158_67 = null;
	if (arg0 != 1)
	    method90(null, 115);
    }
    
    public static void method92(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7) {
	anInt69++;
	if ((arg7 ^ 0xffffffff) <= -1 && arg4 >= 0
	    && arg7 < -1 + Class131_Sub41_Sub11_Sub1.anInt6546
	    && Class131_Sub2_Sub26.anInt5931 - 1 > arg4) {
	    if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 == null)
		return;
	    if ((arg6 ^ 0xffffffff) != -1) {
		if (arg6 != 1) {
		    if ((arg6 ^ 0xffffffff) != -3) {
			if (arg6 == 3) {
			    Interface6 interface6
				= ((Interface6)
				   Class186.method2564(arg3, arg7, arg4));
			    if (interface6 != null) {
				if (!(interface6 instanceof Class23_Sub5_Sub1))
				    Class167.method2425
					(arg3, arg6, arg4, arg1, arg5, arg7,
					 interface6.method23((byte) -124),
					 arg2, -124);
				else
				    ((Class23_Sub5_Sub1) interface6)
					.aClass190_5039
					.method2619(arg1, arg0 + -8143);
			    }
			}
		    } else {
			Interface6 interface6
			    = ((Interface6)
			       (Class63.method662
				(arg3, arg7, arg4,
				 (aClass73 != null ? aClass73
				  : (aClass73 = method94("Interface6"))))));
			if (interface6 != null) {
			    if ((arg2 ^ 0xffffffff) == -12)
				arg2 = 10;
			    if (!(interface6 instanceof Class23_Sub4_Sub3))
				Class167.method2425(arg3, arg6, arg4, arg1,
						    arg5, arg7,
						    interface6
							.method23((byte) -128),
						    arg2, 101);
			    else
				((Class23_Sub4_Sub3) interface6)
				    .aClass190_5010.method2619(arg1, 95);
			}
		    }
		} else {
		    Interface6 interface6
			= (Interface6) Class106.method918(arg3, arg7, arg4);
		    if (interface6 != null) {
			if (interface6 instanceof Class23_Sub2_Sub1)
			    ((Class23_Sub2_Sub1) interface6).aClass190_4980
				.method2619(arg1, arg0 ^ 0x205d);
			else {
			    int i = interface6.method23((byte) -121);
			    if ((arg2 ^ 0xffffffff) == -5
				|| (arg2 ^ 0xffffffff) == -6)
				Class167.method2425(arg3, arg6, arg4, arg1,
						    arg5, arg7, i, 4, 79);
			    else if ((arg2 ^ 0xffffffff) != -7) {
				if (arg2 != 7) {
				    if ((arg2 ^ 0xffffffff) == -9) {
					Class167.method2425(arg3, arg6, arg4,
							    arg1, 4 + arg5,
							    arg7, i, 4, 115);
					Class167.method2425(arg3, arg6, arg4,
							    arg1,
							    4 + (0x3
								 & 2 + arg5),
							    arg7, i, 4, 100);
				    }
				} else
				    Class167.method2425(arg3, arg6, arg4, arg1,
							4 + (arg5 + 2 & 0x3),
							arg7, i, 4,
							arg0 ^ ~0x2056);
			    } else
				Class167.method2425(arg3, arg6, arg4, arg1,
						    4 + arg5, arg7, i, 4,
						    arg0 ^ 0x206c);
			}
		    }
		}
	    } else {
		Interface6 interface6
		    = (Interface6) Class43.method521(arg3, arg7, arg4);
		Interface6 interface6_3_
		    = ((Interface6)
		       Class131_Sub2_Sub15.method1545(arg3, arg7, arg4));
		if (interface6 != null && (arg2 ^ 0xffffffff) != -3) {
		    if (!(interface6 instanceof Class23_Sub1_Sub1))
			Class167.method2425(arg3, arg6, arg4, arg1, arg5, arg7,
					    interface6.method23((byte) -127),
					    arg2, -108);
		    else
			((Class23_Sub1_Sub1) interface6).aClass190_5077
			    .method2619(arg1, 74);
		}
		if (interface6_3_ != null) {
		    if (interface6_3_ instanceof Class23_Sub1_Sub1)
			((Class23_Sub1_Sub1) interface6_3_).aClass190_5077
			    .method2619(arg1, arg0 + -8125);
		    else
			Class167.method2425(arg3, arg6, arg4, arg1, arg5, arg7,
					    interface6_3_
						.method23((byte) -111),
					    arg2, arg0 + -8136);
		}
	    }
	}
	if (arg0 != 8230)
	    aClass158_67 = null;
    }
    
    public static void method93(int arg0, int arg1, int arg2) {
	try {
	    anInt71++;
	    int i = -37 / ((65 - arg1) / 42);
	    Class151 class151 = Class202.method2722(arg0, 0);
	    int i_4_ = class151.anInt2018;
	    int i_5_ = class151.anInt2024;
	    int i_6_ = class151.anInt2021;
	    int i_7_ = Class131_Sub38.anIntArray4612[i_6_ - i_5_];
	    if (arg2 < 0 || arg2 > i_7_)
		arg2 = 0;
	    i_7_ <<= i_5_;
	    Class193.method2624(i_4_, -92,
				(Class79.anIntArray1062[i_4_] & (i_7_
								 ^ 0xffffffff)
				 | arg2 << i_5_ & i_7_));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ge.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method94(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass214_66 = new Class214(260);
    }
}
