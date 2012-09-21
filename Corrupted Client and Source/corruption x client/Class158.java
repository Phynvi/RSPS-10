/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class158
{
    public static int anInt2078;
    public static int anInt2079;
    public static int anInt2080;
    public Object[][] anObjectArrayArray2081;
    public static int anInt2082;
    public static int anInt2083;
    public static int anInt2084;
    public static int anInt2085;
    public static int anInt2086;
    public static int anInt2087;
    public static int anInt2088;
    public static int anInt2089;
    public static String aString2090 = "Use";
    public static int anInt2091;
    public static int anInt2092;
    public static int anInt2093;
    public Object[] anObjectArray2094;
    public static Frame aFrame2095;
    public static int anInt2096;
    public int anInt2097;
    public static int anInt2098;
    public static int anInt2099;
    public Class220 aClass220_2100 = null;
    public static int anInt2101;
    public static int anInt2102;
    public static int anInt2103;
    public static int anInt2104;
    public static int anInt2105;
    public static int anInt2106;
    public Class22 aClass22_2107;
    public static int anInt2108;
    public static int anInt2109;
    public static int anInt2110;
    public static int anInt2111;
    public static int anInt2112;
    public static int anInt2113;
    public static int anInt2114;
    public boolean aBoolean2115;
    public static int anInt2116;
    public static int anInt2117;
    
    public boolean method2343(int arg0, int arg1) {
	try {
	    anInt2082++;
	    if (!method2347((byte) 39))
		return false;
	    if ((aClass220_2100.anIntArray3209.length ^ 0xffffffff) == -2)
		return method2354(arg1, 0, 105);
	    if (!method2374(arg1, true))
		return false;
	    if (arg0 > -109)
		return false;
	    if ((aClass220_2100.anIntArray3209[arg1] ^ 0xffffffff) == -2)
		return method2354(0, arg1, 105);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.CA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2344(int arg0, int arg1) {
	if (arg1 != 0)
	    method2351(true);
	anInt2110++;
	if (method2374(arg0, true)) {
	    if (anObjectArrayArray2081 != null)
		anObjectArrayArray2081[arg0] = null;
	}
    }
    
    public boolean method2345(byte arg0, String arg1) {
	try {
	    anInt2088++;
	    if (arg0 != 58)
		aString2090 = null;
	    if (!method2347((byte) 39))
		return false;
	    arg1 = arg1.toLowerCase();
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (124, Stream.method1736((byte) 107, arg1)));
	    return method2367(i, (byte) 42);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.P(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2346(byte arg0) {
	try {
	    anInt2080++;
	    if (arg0 == -67)
		Class214.aClass130_3128.method1212
		    (Class131_Sub2_Sub26.anInt5927,
		     (!Class131_Sub8_Sub1.aBoolean6089 ? -1
		      : Class111.anInt3273 + 256));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.B(" + arg0 + ')');
	}
    }
    
    public boolean method2347(byte arg0) {
	try {
	    anInt2089++;
	    if (aClass220_2100 == null) {
		aClass220_2100 = aClass22_2107.method263(255);
		if (aClass220_2100 == null)
		    return false;
		anObjectArrayArray2081
		    = new Object[aClass220_2100.anInt3213][];
		anObjectArray2094 = new Object[aClass220_2100.anInt3213];
	    }
	    if (arg0 != 39)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.GA(" + arg0 + ')');
	}
    }
    
    public void method2348(int arg0, boolean arg1, boolean arg2) {
	anInt2109++;
	if (method2347((byte) 39)) {
	    if (arg2) {
		aClass220_2100.anIntArray3211 = null;
		aClass220_2100.aLogin_3225 = null;
	    }
	    if (arg1) {
		aClass220_2100.anIntArrayArray3214 = null;
		aClass220_2100.aLoginArray3215 = null;
	    }
	    if (arg0 != -1)
		aString2090 = null;
	}
    }
    
    public int[] method2349(byte arg0, int arg1) {
	try {
	    anInt2087++;
	    if (!method2374(arg1, true))
		return null;
	    if (arg0 != -114)
		return null;
	    int[] is = aClass220_2100.anIntArrayArray3219[arg1];
	    if (is == null) {
		is = new int[aClass220_2100.anIntArray3223[arg1]];
		for (int i = 0; i < is.length; i++)
		    is[i] = i;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.AA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2350(boolean arg0) {
	aString2090 = null;
	aFrame2095 = null;
	if (arg0 != false)
	    aString2090 = null;
    }
    
    public boolean method2351(boolean arg0) {
	try {
	    anInt2113++;
	    if (!method2347((byte) 39))
		return false;
	    boolean bool = arg0;
	    for (int i = 0; aClass220_2100.anIntArray3221.length > i; i++) {
		int i_0_ = aClass220_2100.anIntArray3221[i];
		if (anObjectArray2094[i_0_] == null) {
		    method2366(i_0_, 0);
		    if (anObjectArray2094[i_0_] == null)
			bool = false;
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.A(" + arg0 + ')');
	}
    }
    
    public void method2352(int arg0, int arg1) {
	try {
	    anInt2114++;
	    if (arg0 != 0)
		anObjectArray2094 = null;
	    aClass22_2107.method264(7355, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2353(byte arg0, String arg1) {
	try {
	    if (arg0 < 115)
		method2357(null, 97, -122, 37);
	    anInt2103++;
	    if (method2347((byte) 39)) {
		arg1 = arg1.toLowerCase();
		int i = (aClass220_2100.aLogin_3225.method1151
			 (125, Stream.method1736((byte) 127, arg1)));
		method2352(0, i);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.V(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method2354(int arg0, int arg1, int arg2) {
	try {
	    anInt2084++;
	    if (!method2365(arg0, arg1, (byte) 88))
		return false;
	    if (arg2 < 99)
		return true;
	    if (anObjectArrayArray2081[arg1] != null
		&& anObjectArrayArray2081[arg1][arg0] != null)
		return true;
	    if (anObjectArray2094[arg1] != null)
		return true;
	    method2366(arg1, 0);
	    if (anObjectArray2094[arg1] != null)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method2355(int arg0) {
	try {
	    anInt2092++;
	    if (!method2347((byte) 39))
		return 0;
	    int i = 0;
	    int i_1_ = 0;
	    for (int i_2_ = 0;
		 (i_2_ ^ 0xffffffff) > (anObjectArray2094.length ^ 0xffffffff);
		 i_2_++) {
		if ((aClass220_2100.anIntArray3223[i_2_] ^ 0xffffffff) < -1) {
		    i += 100;
		    i_1_ += method2375(i_2_, -122);
		}
	    }
	    if (i == 0)
		return 100;
	    int i_3_ = 100 * i_1_ / i;
	    if (arg0 < 107)
		method2356(false);
	    return i_3_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.DA(" + arg0 + ')');
	}
    }
    
    public void method2356(boolean arg0) {
	if (arg0 != false)
	    method2372((byte) 100, -10);
	anInt2083++;
	if (anObjectArrayArray2081 != null) {
	    for (int i = 0; i < anObjectArrayArray2081.length; i++)
		anObjectArrayArray2081[i] = null;
	}
    }
    
    public boolean method2357(int[] arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt2078++;
	    if (!method2374(arg3, true))
		return false;
	    if (anObjectArray2094[arg3] == null)
		return false;
	    int i = aClass220_2100.anIntArray3223[arg3];
	    int[] is = aClass220_2100.anIntArrayArray3219[arg3];
	    if (anObjectArrayArray2081[arg3] == null)
		anObjectArrayArray2081[arg3]
		    = new Object[aClass220_2100.anIntArray3209[arg3]];
	    Object[] objects = anObjectArrayArray2081[arg3];
	    boolean bool = true;
	    for (int i_4_ = 0; i > i_4_; i_4_++) {
		int i_5_;
		if (is != null)
		    i_5_ = is[i_4_];
		else
		    i_5_ = i_4_;
		if (objects[i_5_] == null) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	    byte[] is_6_;
	    if (arg0 == null || (arg0[0] == 0 && (arg0[1] ^ 0xffffffff) == -1
				 && arg0[2] == 0 && arg0[3] == 0))
		is_6_ = Class131_Sub32.method1866(0, false,
						  anObjectArray2094[arg3]);
	    else {
		is_6_ = Class131_Sub32.method1866(0, true,
						  anObjectArray2094[arg3]);
		Stream stream = new Stream(is_6_);
		stream.method1757((byte) 127, 5,
					  stream.data.length,
					  arg0);
	    }
	    int i_7_ = -56 / ((13 - arg1) / 50);
	    byte[] is_8_;
	    try {
		is_8_ = Class23_Sub4_Sub3.method377(is_6_, (byte) -91);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("T3 - " + (arg0 != null) + "," + arg3 + ","
			    + is_6_.length + ","
			    + Class121_Sub3.method1055(is_6_.length, is_6_,
						       (byte) 20)
			    + ","
			    + Class121_Sub3.method1055(is_6_.length - 2, is_6_,
						       (byte) 90)
			    + "," + aClass220_2100.anIntArray3232[arg3] + ","
			    + aClass220_2100.anInt3216));
	    }
	    if (aBoolean2115)
		anObjectArray2094[arg3] = null;
	    if (i <= 1) {
		int i_9_;
		if (is == null)
		    i_9_ = 0;
		else
		    i_9_ = is[0];
		if ((anInt2097 ^ 0xffffffff) != -1)
		    objects[i_9_] = is_8_;
		else
		    objects[i_9_] = Class9.method176(is_8_, false, (byte) 122);
	    } else if ((anInt2097 ^ 0xffffffff) == -3) {
		int i_10_ = is_8_.length;
		int i_11_ = is_8_[--i_10_] & 0xff;
		i_10_ -= i_11_ * (i * 4);
		Stream stream = new Stream(is_8_);
		int i_12_ = 0;
		stream.offset = i_10_;
		int i_13_ = 0;
		for (int i_14_ = 0;
		     (i_14_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_14_++) {
		    int i_15_ = 0;
		    for (int i_16_ = 0; i_16_ < i; i_16_++) {
			i_15_ += stream.readUnsignedInt(-2);
			int i_17_;
			if (is == null)
			    i_17_ = i_16_;
			else
			    i_17_ = is[i_16_];
			if (arg2 == i_17_) {
			    i_12_ += i_15_;
			    i_13_ = i_17_;
			}
		    }
		}
		if (i_12_ == 0)
		    return true;
		byte[] is_18_ = new byte[i_12_];
		i_12_ = 0;
		stream.offset = i_10_;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < i_11_; i_20_++) {
		    int i_21_ = 0;
		    for (int i_22_ = 0; i > i_22_; i_22_++) {
			i_21_ += stream.readUnsignedInt(-2);
			int i_23_;
			if (is != null)
			    i_23_ = is[i_22_];
			else
			    i_23_ = i_22_;
			if (i_23_ == arg2) {
			    Class61.method652(is_8_, i_19_, is_18_, i_12_,
					      i_21_);
			    i_12_ += i_21_;
			}
			i_19_ += i_21_;
		    }
		}
		objects[i_13_] = is_18_;
	    } else {
		int i_24_ = is_8_.length;
		int i_25_ = 0xff & is_8_[--i_24_];
		i_24_ -= 4 * (i_25_ * i);
		Stream stream = new Stream(is_8_);
		stream.offset = i_24_;
		int[] is_26_ = new int[i];
		for (int i_27_ = 0; i_25_ > i_27_; i_27_++) {
		    int i_28_ = 0;
		    for (int i_29_ = 0;
			 (i_29_ ^ 0xffffffff) > (i ^ 0xffffffff); i_29_++) {
			i_28_ += stream.readUnsignedInt(-2);
			is_26_[i_29_] += i_28_;
		    }
		}
		byte[][] is_30_ = new byte[i][];
		for (int i_31_ = 0; (i ^ 0xffffffff) < (i_31_ ^ 0xffffffff);
		     i_31_++) {
		    is_30_[i_31_] = new byte[is_26_[i_31_]];
		    is_26_[i_31_] = 0;
		}
		stream.offset = i_24_;
		int i_32_ = 0;
		for (int i_33_ = 0;
		     (i_33_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff); i_33_++) {
		    int i_34_ = 0;
		    for (int i_35_ = 0; i_35_ < i; i_35_++) {
			i_34_ += stream.readUnsignedInt(-2);
			Class61.method652(is_8_, i_32_, is_30_[i_35_],
					  is_26_[i_35_], i_34_);
			i_32_ += i_34_;
			is_26_[i_35_] += i_34_;
		    }
		}
		for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_36_++) {
		    int i_37_;
		    if (is == null)
			i_37_ = i_36_;
		    else
			i_37_ = is[i_36_];
		    if (anInt2097 == 0)
			objects[i_37_] = Class9.method176(is_30_[i_36_], false,
							  (byte) 115);
		    else
			objects[i_37_] = is_30_[i_36_];
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.BA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public byte[] method2358(int arg0, int arg1) {
	try {
	    anInt2098++;
	    if (!method2347((byte) 39))
		return null;
	    if (aClass220_2100.anIntArray3209.length == 1)
		return method2364(arg0, 0, 0);
	    if (!method2374(arg0, true))
		return null;
	    int i = -60 / ((-50 - arg1) / 53);
	    if (aClass220_2100.anIntArray3209[arg0] == 1)
		return method2364(0, arg0, 0);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.R(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2359(int arg0, String arg1) {
	try {
	    anInt2099++;
	    if (!method2347((byte) 39))
		return -1;
	    if (arg0 <= 94)
		method2356(true);
	    arg1 = arg1.toLowerCase();
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (127, Stream.method1736((byte) 108, arg1)));
	    if (!method2374(i, true))
		return -1;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public byte[] method2360(int[] arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg2 != 8610)
		method2365(88, 50, (byte) -43);
	    anInt2085++;
	    if (!method2365(arg3, arg1, (byte) 125))
		return null;
	    if (anObjectArrayArray2081[arg1] == null
		|| anObjectArrayArray2081[arg1][arg3] == null) {
		boolean bool = method2357(arg0, -75, arg3, arg1);
		if (!bool) {
		    method2366(arg1, 0);
		    bool = method2357(arg0, arg2 + -8506, arg3, arg1);
		    if (!bool)
			return null;
		}
	    }
	    byte[] is
		= Class131_Sub32.method1866(0, false, (anObjectArrayArray2081
						       [arg1][arg3]));
	    if (anInt2097 == 1) {
		anObjectArrayArray2081[arg1][arg3] = null;
		if (aClass220_2100.anIntArray3209[arg1] == 1)
		    anObjectArrayArray2081[arg1] = null;
	    } else if ((anInt2097 ^ 0xffffffff) == -3)
		anObjectArrayArray2081[arg1] = null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.O("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public int method2361(byte arg0) {
	try {
	    anInt2079++;
	    if (!method2347((byte) 39))
		return -1;
	    int i = 76 / ((arg0 - -93) / 32);
	    return aClass220_2100.anIntArray3209.length;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.J(" + arg0 + ')');
	}
    }
    
    public int method2362(String arg0, int arg1) {
	try {
	    anInt2108++;
	    if (!method2347((byte) 39))
		return 0;
	    arg0 = arg0.toLowerCase();
	    if (arg1 != 0)
		return -103;
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (127, Stream.method1736((byte) 125, arg0)));
	    return method2375(i, -97);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.W("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method2363(int arg0, String arg1, String arg2) {
	try {
	    anInt2112++;
	    if (!method2347((byte) 39))
		return false;
	    arg2 = arg2.toLowerCase();
	    arg1 = arg1.toLowerCase();
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (120, Stream.method1736((byte) 121, arg2)));
	    if (!method2374(i, true))
		return false;
	    int i_38_ = (aClass220_2100.aLoginArray3215[i].method1151
			 (99, Stream.method1736((byte) 107, arg1)));
	    if (arg0 != -1)
		method2349((byte) -122, -57);
	    return method2354(i_38_, i, 106);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public byte[] method2364(int arg0, int arg1, int arg2) {
	try {
	    anInt2111++;
	    if (arg2 != 0)
		return null;
	    return method2360(null, arg1, 8610, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method2365(int arg0, int arg1, byte arg2) {
	try {
	    anInt2096++;
	    if (!method2347((byte) 39))
		return false;
	    if (arg2 <= 82)
		anObjectArray2094 = null;
	    if ((arg1 ^ 0xffffffff) > -1 || (arg0 ^ 0xffffffff) > -1
		|| ((aClass220_2100.anIntArray3209.length ^ 0xffffffff)
		    >= (arg1 ^ 0xffffffff))
		|| arg0 >= aClass220_2100.anIntArray3209[arg1]) {
		if (Class186.aBoolean2646)
		    throw new IllegalArgumentException(String.valueOf(arg1)
						       + "," + arg0);
		return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.JA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2366(int arg0, int arg1) {
	anInt2116++;
	if (aBoolean2115)
	    anObjectArray2094[arg0]
		= aClass22_2107.method265((byte) 108, arg0);
	else
	    anObjectArray2094[arg0]
		= Class9.method176(aClass22_2107.method265((byte) 100, arg0),
				   false, (byte) 127);
	if (arg1 != 0)
	    method2343(-19, 17);
    }
    
    public boolean method2367(int arg0, byte arg1) {
	try {
	    if (arg1 != 42)
		return true;
	    anInt2117++;
	    if (!method2374(arg0, true))
		return false;
	    if (anObjectArray2094[arg0] != null)
		return true;
	    method2366(arg0, 0);
	    if (anObjectArray2094[arg0] != null)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.Q(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2368(int arg0, byte arg1) {
	try {
	    anInt2101++;
	    if (arg1 != -72)
		method2375(-89, 95);
	    if (!method2374(arg0, true))
		return 0;
	    return aClass220_2100.anIntArray3209[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.HA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2369(int arg0) {
	try {
	    if (arg0 > -4)
		method2375(17, 84);
	    anInt2102++;
	    if (!method2347((byte) 39))
		throw new IllegalStateException("");
	    return aClass220_2100.anInt3216;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qj.IA(" + arg0 + ')');
	}
    }
    
    public byte[] method2370(String arg0, String arg1, byte arg2) {
	try {
	    anInt2106++;
	    if (!method2347((byte) 39))
		return null;
	    arg0 = arg0.toLowerCase();
	    arg1 = arg1.toLowerCase();
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (106, Stream.method1736((byte) 102, arg0)));
	    if (!method2374(i, true))
		return null;
	    int i_39_ = 109 / ((21 - arg2) / 57);
	    int i_40_ = (aClass220_2100.aLoginArray3215[i].method1151
			 (112, Stream.method1736((byte) 96, arg1)));
	    return method2364(i_40_, i, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.M("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method2371(int arg0, String arg1) {
	try {
	    anInt2093++;
	    if (!method2347((byte) 39))
		return false;
	    arg1 = arg1.toLowerCase();
	    int i = (aClass220_2100.aLogin_3225.method1151
		     (102, Stream.method1736((byte) 120, arg1)));
	    if ((i ^ 0xffffffff) > arg0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.EA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int method2372(byte arg0, int arg1) {
	try {
	    int i = -38 / ((42 - arg0) / 62);
	    anInt2086++;
	    if (!method2347((byte) 39))
		return -1;
	    int i_41_ = aClass220_2100.aLogin_3225.method1151(102, arg1);
	    if (!method2374(i_41_, true))
		return -1;
	    return i_41_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2373(boolean arg0) {
	if (anObjectArray2094 != null) {
	    for (int i = 0;
		 (anObjectArray2094.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		anObjectArray2094[i] = null;
	}
	anInt2104++;
	if (arg0 != true)
	    method2350(true);
    }
    
    public boolean method2374(int arg0, boolean arg1) {
	try {
	    anInt2105++;
	    if (!method2347((byte) 39))
		return false;
	    if (arg1 != true)
		method2360(null, 67, -4, 113);
	    if (arg0 < 0 || aClass220_2100.anIntArray3209.length <= arg0
		|| (aClass220_2100.anIntArray3209[arg0] ^ 0xffffffff) == -1) {
		if (Class186.aBoolean2646)
		    throw new IllegalArgumentException(Integer.toString(arg0));
		return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.N(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method2375(int arg0, int arg1) {
	try {
	    if (arg1 > -86)
		return -55;
	    anInt2091++;
	    if (!method2374(arg0, true))
		return 0;
	    if (anObjectArray2094[arg0] != null)
		return 100;
	    return aClass22_2107.method266((byte) 22, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.L(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class158(Class22 arg0, boolean arg1, int arg2) {
	try {
	    if (arg2 < 0 || arg2 > 2)
		throw new IllegalArgumentException
			  ("js5: Invalid value " + arg2
			   + " supplied for discardunpacked");
	    aClass22_2107 = arg0;
	    anInt2097 = arg2;
	    aBoolean2115 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qj.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
}
