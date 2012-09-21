/* Class23_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub3 extends Class23_Sub4 implements Interface6
{
    public static int anInt4996;
    public static int anInt4997;
    public static int anInt4998;
    public static int anInt4999;
    public static int anInt5000;
    public static int anInt5001;
    public static int anInt5002;
    public static Class158 aClass158_5003;
    public static int anInt5004;
    public static int anInt5005 = 0;
    public static int anInt5006;
    public static int anInt5007;
    public static int anInt5008;
    public static int anInt5009;
    public Class190 aClass190_5010;
    public static int anInt5011;
    public static int anInt5012;
    public static int anInt5013;
    public static int anInt5014;
    public static int anInt5015;
    public static int anInt5016;
    public static int anInt5017;
    public boolean aBoolean5018;
    public static int anInt5019;
    public static int anInt5020;
    
    public static void method375(int arg0) {
	try {
	    if (arg0 == 0)
		aClass158_5003 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.V(" + arg0 + ')');
	}
    }
    
    public static void method376(String arg0, String arg1, int arg2, int arg3,
				 String arg4, int arg5, String arg6,
				 int arg7) {
	try {
	    anInt4997++;
	    for (int i = 99; i > 0; i--) {
		Class131_Sub13.anIntArray4264[i]
		    = Class131_Sub13.anIntArray4264[i - 1];
		Class111.anIntArray3277[i] = Class111.anIntArray3277[-1 + i];
		Class131_Sub41_Sub4.aStringArray6206[i]
		    = Class131_Sub41_Sub4.aStringArray6206[i - 1];
		Class131_Sub27.aStringArray4486[i]
		    = Class131_Sub27.aStringArray4486[-1 + i];
		Class131_Sub2_Sub28.aStringArray5957[i]
		    = Class131_Sub2_Sub28.aStringArray5957[i - 1];
		Class112.aStringArray1434[i]
		    = Class112.aStringArray1434[i - 1];
		Class131_Sub41_Sub5.anIntArray6231[i]
		    = Class131_Sub41_Sub5.anIntArray6231[-1 + i];
	    }
	    if (arg2 != -23645)
		aClass158_5003 = null;
	    Class131_Sub13.anIntArray4264[0] = arg3;
	    Class111.anIntArray3277[0] = arg5;
	    Class131_Sub41_Sub4.aStringArray6206[0] = arg0;
	    Class131_Sub27.aStringArray4486[0] = arg1;
	    Class131_Sub2_Sub28.aStringArray5957[0] = arg4;
	    Class112.aStringArray1434[0] = arg6;
	    Class131_Sub17.anInt4370 = Class23_Sub5.anInt3758;
	    Class131_Sub41_Sub5.anIntArray6231[0] = arg7;
	    Class59.anInt785++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fm.W(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ','
			+ arg5 + ',' + (arg6 != null ? "{...}" : "null") + ','
			+ arg7 + ')'));
	}
    }
    
    public int method23(byte arg0) {
	try {
	    if (arg0 > -110)
		aClass158_5003 = null;
	    anInt5001++;
	    return aClass190_5010.anInt2803;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.S(" + arg0 + ')');
	}
    }
    
    public int method21(int arg0) {
	try {
	    anInt5007++;
	    if (arg0 != -22056)
		method22(-128, null);
	    return aClass190_5010.anInt2804;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.O(" + arg0 + ')');
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    if (arg3 <= 12)
		method379(null, 104);
	    anInt5008++;
	    Class154 class154
		= aClass190_5010.method2608(65536, arg1, anInt3733, anInt3747,
					    false, false, 95);
	    if (class154 == null)
		return false;
	    Class9 class9 = arg1.method1238();
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    return class154.method2278(arg2, arg0, class9, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class23_Sub4_Sub3(Class130 arg0, Class187 arg1, int arg2, int arg3,
			     int arg4, int arg5, int arg6, int arg7, int arg8,
			     boolean arg9, int arg10, int arg11, int arg12,
			     int arg13, int arg14) {
	super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13,
	      (arg1.anInt2703 ^ 0xffffffff) == -2,
	      Class58.method639(17626, arg2, arg3));
	try {
	    aClass190_5010 = new Class190(arg0, arg1, arg2, arg3, aByte3740,
					  arg5, arg6, arg8, arg9, arg14);
	    aBoolean5018 = arg1.anInt2663 != 0 && !arg9;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("fm.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ','
			+ arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14
			+ ')'));
	}
    }
    
    public int method24(byte arg0) {
	try {
	    anInt5016++;
	    if (arg0 != -68)
		return -103;
	    return aClass190_5010.anInt2806;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.L(" + arg0 + ')');
	}
    }
    
    public Class154 method18(byte arg0, int arg1, Class130 arg2) {
	try {
	    anInt5011++;
	    int i = -8 % ((arg0 - -32) / 61);
	    return aClass190_5010.method2608(arg1, arg2, 0, 0, false, false,
					     -45);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.T(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static byte[] method377(byte[] arg0, byte arg1) {
	try {
	    anInt4998++;
	    Stream stream = new Stream(arg0);
	    int i = stream.readUnsignedByte(-62);
	    int i_0_ = stream.readUnsignedInt(-2);
	    if (arg1 != -91)
		method376(null, null, -91, -24, null, -62, null, 57);
	    if ((i_0_ ^ 0xffffffff) > -1
		|| ((Class153.anInt2043 ^ 0xffffffff) != -1
		    && (Class153.anInt2043 ^ 0xffffffff) > (i_0_
							    ^ 0xffffffff)))
		throw new RuntimeException();
	    if ((i ^ 0xffffffff) != -1) {
		int i_1_ = stream.readUnsignedInt(-2);
	    if ((i_1_ >= 10000000) || (i_1_ < 0)) {
	       client.sendMessage("No mapdata: "+(i_1_>> 8));
	        return new byte[1];
	      }
		if (i_1_ < 0 || (Class153.anInt2043 != 0
				 && (i_1_ ^ 0xffffffff) < (Class153.anInt2043
							   ^ 0xffffffff)))
		    //throw new RuntimeException();
	        return new byte[100];
		byte[] is = new byte[i_1_];
		if (i == 1)
		    Class3.method146(is, i_1_, arg0, i_0_, 9);
		else
		    Class131_Sub41_Sub12.aClass145_6312
			.method2160(stream, is, true);
		return is;
	    }
	    byte[] is = new byte[i_0_];
	    stream.method1768(0, i_0_, (byte) -42, is);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.U("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt5013++;
	    Class154 class154
		= aClass190_5010.method2608(1024, arg0, anInt3733, anInt3747,
					    true, false, -71);
	    if (class154 == null)
		return null;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    Class1_Sub2 class1_sub2 = null;
	    if (aBoolean5018)
		class1_sub2 = Class131_Sub41_Sub11.method2003(1, 12300);
	    if (aClass190_5010.aClass1_Sub6_2816 != null) {
		Class105 class105
		    = aClass190_5010.aClass1_Sub6_2816.method113();
		arg0.method1204(class154, class105, class9,
				(class1_sub2 != null
				 ? class1_sub2.aClass1_Sub5Array3500[0]
				 : null),
				0);
	    } else
		class154.method2261(class9,
				    (class1_sub2 != null
				     ? class1_sub2.aClass1_Sub5Array3500[0]
				     : null),
				    0);
	    aClass190_5010.method2607(aShort3745, true, aShort3735, class154,
				      arg0, aShort3737, arg1, aShort3742);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method378(int arg0) {
	try {
	    Class131_Sub41_Sub7.aStringArray6253 = new String[arg0];
	    InputStream_Sub1.anInt61
		= (2 + Class131_Sub24.aClass55_4469.anInt717
		   + Class131_Sub24.aClass55_4469.anInt723);
	    Class131_Sub24.anInt4471 = 2 + (Class89.aClass55_3259.anInt717
					    + Class89.aClass55_3259.anInt723);
	    anInt5000++;
	    for (int i = 0;
		 ((Class131_Sub41_Sub7.aStringArray6253.length ^ 0xffffffff)
		  < (i ^ 0xffffffff));
		 i++)
		Class131_Sub41_Sub7.aStringArray6253[i] = "";
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.R(" + arg0 + ')');
	}
    }
    
    public static void method379(int[][] arg0, int arg1) {
	try {
	    Class56.anIntArrayArray740 = arg0;
	    if (arg1 > 14)
		anInt4996++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.N("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method323(int arg0) {
	try {
	    anInt5002++;
	    if (arg0 > -7)
		aClass190_5010 = null;
	    return aClass190_5010.method2617((byte) 95);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.UA(" + arg0 + ')');
	}
    }
    
    public void method25(byte arg0) {
	try {
	    if (arg0 != 6)
		anInt5005 = -55;
	    anInt5006++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.M(" + arg0 + ')');
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    if (arg0 != -115)
		return false;
	    anInt5020++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.D(" + arg0 + ')');
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	if (arg1 == 0) {
	    anInt5014++;
	    Class154 class154
		= aClass190_5010.method2608(131072, arg0, anInt3733, anInt3747,
					    true, true, -50);
	    if (class154 != null)
		aClass190_5010.method2607(aShort3745, false, aShort3735,
					  class154, arg0, aShort3737, false,
					  aShort3742);
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    anInt5012++;
	    if (arg0 > -116)
		method21(100);
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public void method295(int arg0) {
	try {
	    if (arg0 != 0)
		anInt5005 = 37;
	    anInt5015++;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.E(" + arg0 + ')');
	}
    }
    
    public void method20(Class130 arg0, boolean arg1) {
	try {
	    aClass190_5010.method2611(arg0, 4);
	    if (arg1 == false)
		anInt5004++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.Q("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method22(int arg0, Class130 arg1) {
	try {
	    if (arg0 == 25510) {
		anInt5009++;
		aClass190_5010.method2618(arg1, (byte) -5);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fm.P(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method19(byte arg0) {
	try {
	    anInt5017++;
	    if (arg0 <= 102)
		return true;
	    return aClass190_5010.method2612(-1724944720);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fm.K(" + arg0 + ')');
	}
    }
}
