/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class57
{
    public static int anInt746 = 0;
    public static int anInt747;
    public int anInt748 = 0;
    public static int anInt749;
    public static int anInt750 = 0;
    public static int anInt751;
    public static Class158 aClass158_752;
    public static int anInt753;
    public static int anInt754;
    public static int anInt755;
    public static int anInt756;
    public static int anInt757;
    public static int anInt758;
    
    public static void method628(int arg0) {
	aClass158_752 = null;
	if (arg0 >= -95)
	    anInt747 = 111;
    }
    
    public static void method629(Class158 arg0, Class158 arg1, Class158 arg2,
				 Class158 arg3, byte arg4) {
	try {
	    anInt751++;
	    Class131_Sub20.aClass158_4417 = arg3;
	    Class150.aClass158_1994 = arg1;
	    Class78.aClass158_1053 = arg2;
	    Class131_Sub20.aClass158_4424 = arg0;
	    Class131_Sub2_Sub9.aClass173ArrayArray5684
		= (new Class173
		   [Class150.aClass158_1994.method2361((byte) -125)][]);
	    if (arg4 < 113)
		anInt747 = -120;
	    Class67.aBooleanArray913
		= new boolean[Class150.aClass158_1994.method2361((byte) -128)];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fp.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4
			+ ')'));
	}
    }
    
    public static int method630(boolean arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt758++;
	    if ((arg1 ^ 0xffffffff) == (arg3 ^ 0xffffffff))
		return arg3;
	    if (arg0 != true)
		method632(70, 69, 118, -89, -21);
	    int i = -arg2 + 128;
	    int i_0_ = arg2 * (0x7f & arg1) + i * (0x7f & arg3) >> -2104575673;
	    int i_1_
		= (arg1 & 0x380) * arg2 + i * (0x380 & arg3) >> -1382623897;
	    int i_2_ = ((0xfc00 & arg3) * i - -((arg1 & 0xfc00) * arg2)
			>> 1877834151);
	    return i_1_ & 0x380 | 0xfc00 & i_2_ | i_0_ & 0x7f;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method631(Stream arg0, int arg1, boolean arg2) {
	try {
	    if (arg2 != false)
		anInt753 = -90;
	    if (arg1 == 5)
		anInt748 = arg0.readUnsignedShort(8104);
	    anInt754++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public static int method632(int arg0, int arg1, int arg2, int arg3,
				int arg4) {
	try {
	    anInt755++;
	    int i = 0xf & arg3;
	    int i_3_ = i >= 8 ? arg2 : arg0;
	    int i_4_ = (i < 4 ? arg2 : (i ^ 0xffffffff) == -13 || i == 14
			? arg0 : arg4);
	    if (arg1 < 81)
		aClass158_752 = null;
	    return (((0x1 & i ^ 0xffffffff) == -1 ? i_3_ : -i_3_)
		    + ((i & 0x2) == 0 ? i_4_ : -i_4_));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static byte[] method633(boolean arg0, int arg1) {
	try {
	    anInt757++;
	    Class131_Sub41_Sub5 class131_sub41_sub5
		= ((Class131_Sub41_Sub5)
		   Class22.aClass137_244.method2111(-12, (long) arg1));
	    if (class131_sub41_sub5 == null) {
		byte[] is = new byte[512];
		Random random = new Random((long) arg1);
		for (int i = 0; i < 255; i++)
		    is[i] = (byte) i;
		for (int i = 0; (i ^ 0xffffffff) > -256; i++) {
		    int i_5_ = 255 - i;
		    int i_6_ = Class143.method2146(2044605728, random, i_5_);
		    byte i_7_ = is[i_6_];
		    is[i_6_] = is[i_5_];
		    is[i_5_] = is[511 + -i] = i_7_;
		}
		class131_sub41_sub5 = new Class131_Sub41_Sub5(is);
		Class22.aClass137_244.method2110(class131_sub41_sub5, false,
						 (long) arg1);
	    }
	    if (arg0 != false)
		return null;
	    return class131_sub41_sub5.aByteArray6229;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method634(byte arg0, Stream arg1) {
	try {
	    if (arg0 > 120) {
		anInt756++;
		for (;;) {
		    int i = arg1.readUnsignedByte(-109);
		    if ((i ^ 0xffffffff) == -1)
			break;
		    method631(arg1, i, false);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method635(int arg0, String arg1, int arg2, int arg3,
				byte[] arg4, int arg5) {
	try {
	    anInt749++;
	    if (arg5 != -25945)
		method633(false, 40);
	    int i = -arg2 + arg3;
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_8_++) {
		int i_9_ = arg1.charAt(arg2 + i_8_);
		if (i_9_ > 0 && (i_9_ ^ 0xffffffff) > -129
		    || i_9_ >= 160 && (i_9_ ^ 0xffffffff) >= -256)
		    arg4[i_8_ + arg0] = (byte) i_9_;
		else if ((i_9_ ^ 0xffffffff) != -8365) {
		    if ((i_9_ ^ 0xffffffff) != -8219) {
			if (i_9_ == 402)
			    arg4[arg0 + i_8_] = (byte) -125;
			else if ((i_9_ ^ 0xffffffff) != -8223) {
			    if ((i_9_ ^ 0xffffffff) == -8231)
				arg4[arg0 - -i_8_] = (byte) -123;
			    else if ((i_9_ ^ 0xffffffff) != -8225) {
				if (i_9_ == 8225)
				    arg4[i_8_ + arg0] = (byte) -121;
				else if ((i_9_ ^ 0xffffffff) == -711)
				    arg4[arg0 - -i_8_] = (byte) -120;
				else if (i_9_ == 8240)
				    arg4[arg0 + i_8_] = (byte) -119;
				else if ((i_9_ ^ 0xffffffff) == -353)
				    arg4[i_8_ + arg0] = (byte) -118;
				else if (i_9_ == 8249)
				    arg4[arg0 + i_8_] = (byte) -117;
				else if ((i_9_ ^ 0xffffffff) == -339)
				    arg4[arg0 + i_8_] = (byte) -116;
				else if (i_9_ != 381) {
				    if (i_9_ != 8216) {
					if (i_9_ != 8217) {
					    if ((i_9_ ^ 0xffffffff) == -8221)
						arg4[i_8_ + arg0]
						    = (byte) -109;
					    else if ((i_9_ ^ 0xffffffff)
						     != -8222) {
						if ((i_9_ ^ 0xffffffff)
						    == -8227)
						    arg4[i_8_ + arg0]
							= (byte) -107;
						else if (i_9_ == 8211)
						    arg4[arg0 + i_8_]
							= (byte) -106;
						else if ((i_9_ ^ 0xffffffff)
							 != -8213) {
						    if ((i_9_ ^ 0xffffffff)
							!= -733) {
							if ((i_9_ ^ 0xffffffff)
							    != -8483) {
							    if ((i_9_
								 ^ 0xffffffff)
								!= -354) {
								if ((i_9_
								     ^ 0xffffffff)
								    == -8251)
								    arg4[(i_8_
									  + arg0)]
									= (byte) -101;
								else if ((i_9_
									  ^ 0xffffffff)
									 != -340) {
								    if ((i_9_
									 ^ 0xffffffff)
									!= -383) {
									if ((i_9_
									     ^ 0xffffffff)
									    == -377)
									    arg4[i_8_ + arg0] = (byte) -97;
									else
									    arg4[i_8_ + arg0] = (byte) 63;
								    } else
									arg4[arg0 + i_8_]
									    = (byte) -98;
								} else
								    arg4[(i_8_
									  + arg0)]
									= (byte) -100;
							    } else
								arg4[(i_8_
								      + arg0)]
								    = (byte) -102;
							} else
							    arg4[arg0 - -i_8_]
								= (byte) -103;
						    } else
							arg4[arg0 + i_8_]
							    = (byte) -104;
						} else
						    arg4[i_8_ + arg0]
							= (byte) -105;
					    } else
						arg4[arg0 - -i_8_]
						    = (byte) -108;
					} else
					    arg4[arg0 + i_8_] = (byte) -110;
				    } else
					arg4[i_8_ + arg0] = (byte) -111;
				} else
				    arg4[i_8_ + arg0] = (byte) -114;
			    } else
				arg4[arg0 - -i_8_] = (byte) -122;
			} else
			    arg4[arg0 + i_8_] = (byte) -124;
		    } else
			arg4[arg0 + i_8_] = (byte) -126;
		} else
		    arg4[i_8_ + arg0] = (byte) -128;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fp.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ')'));
	}
    }
    
    static {
	anInt747 = 0;
    }
}
