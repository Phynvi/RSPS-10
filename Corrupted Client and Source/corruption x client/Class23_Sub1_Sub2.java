/* Class23_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub1_Sub2 extends Class23_Sub1 implements Interface6
{
    public byte aByte5131;
    public Class154 aClass154_5132;
    public static int anInt5133;
    public static int anInt5134;
    public static int anInt5135;
    public static int anInt5136;
    public static int anInt5137;
    public static int anInt5138;
    public static String aString5139;
    public static int anInt5140;
    public static int anInt5141;
    public static int anInt5142;
    public static int anInt5143;
    public static int anInt5144;
    public static Class83 aClass83_5145;
    public Class131_Sub41_Sub13 aClass131_Sub41_Sub13_5146;
    public byte aByte5147;
    public static int anInt5148;
    public static int anInt5149;
    public boolean aBoolean5150;
    public static int anInt5151;
    public byte aByte5152;
    public static int anInt5153;
    public static int anInt5154;
    public boolean aBoolean5155;
    public static int anInt5156;
    public static int anInt5157;
    public boolean aBoolean5158;
    public static boolean aBoolean5159 = true;
    public boolean aBoolean5160;
    public static int anInt5161;
    public static int anInt5162;
    public short aShort5163;
    public static int anInt5164;
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt5137++;
	    if (aClass154_5132 == null)
		return null;
	    if (arg1 != false)
		aBoolean5158 = false;
	    Class9 class9 = arg0.method1238();
	    class9.method181(anInt3700, anInt3703, anInt3696);
	    Class1_Sub2 class1_sub2 = null;
	    if (aBoolean5155)
		class1_sub2 = Class131_Sub41_Sub11.method2003(1, 12300);
	    aClass154_5132.method2261(class9,
				      (class1_sub2 != null
				       ? class1_sub2.aClass1_Sub5Array3500[0]
				       : null),
				      0);
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method301(int arg0) {
	try {
	    anInt5157++;
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readBits(8, false);
	    if ((Class131_Sub38.anInt4618 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		for (int i_0_ = i; i_0_ < Class131_Sub38.anInt4618; i_0_++)
		    Class131_Sub35.anIntArray4589
			[Class131_Sub2_Sub1.anInt5560++]
			= Class148.anIntArray1983[i_0_];
	    }
	    if (Class131_Sub38.anInt4618 < i)
		throw new RuntimeException("gppov1");
	    Class131_Sub38.anInt4618 = 0;
	    if (arg0 != 5816)
		anInt5156 = -83;
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		int i_2_ = Class148.anIntArray1983[i_1_];
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_2_];
		int i_3_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(1, false);
		if (i_3_ == 0) {
		    Class148.anIntArray1983[Class131_Sub38.anInt4618++] = i_2_;
		    class23_sub4_sub1_sub2.anInt5285 = Class125.anInt1632;
		} else {
		    int i_4_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				   .readBits(2, false);
		    if ((i_4_ ^ 0xffffffff) == -1) {
			Class148.anIntArray1983[Class131_Sub38.anInt4618++]
			    = i_2_;
			class23_sub4_sub1_sub2.anInt5285 = Class125.anInt1632;
			Class128_Sub1.anIntArray4019[Class202.anInt2943++]
			    = i_2_;
		    } else if ((i_4_ ^ 0xffffffff) == -2) {
			Class148.anIntArray1983[Class131_Sub38.anInt4618++]
			    = i_2_;
			class23_sub4_sub1_sub2.anInt5285 = Class125.anInt1632;
			int i_5_ = Class23_Sub3_Sub1
				       .aClass131_Sub15_Sub2_5231
				       .readBits(3, false);
			class23_sub4_sub1_sub2.method339(i_5_, true, 1);
			int i_6_ = Class23_Sub3_Sub1
				       .aClass131_Sub15_Sub2_5231
				       .readBits(1, false);
			if (i_6_ == 1)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= i_2_;
		    } else if (i_4_ == 2) {
			Class148.anIntArray1983[Class131_Sub38.anInt4618++]
			    = i_2_;
			class23_sub4_sub1_sub2.anInt5285 = Class125.anInt1632;
			if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readBits(1, false)
			    != 1) {
			    int i_7_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub2.method339(i_7_, true, 0);
			} else {
			    int i_8_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub2.method339(i_8_, true, 2);
			    int i_9_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readBits(3, false);
			    class23_sub4_sub1_sub2.method339(i_9_, true, 2);
			}
			int i_10_ = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readBits(1, false);
			if ((i_10_ ^ 0xffffffff) == -2)
			    Class128_Sub1.anIntArray4019[Class202.anInt2943++]
				= i_2_;
		    } else if (i_4_ == 3)
			Class131_Sub35.anIntArray4589
			    [Class131_Sub2_Sub1.anInt5560++]
			    = i_2_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.U(" + arg0 + ')');
	}
    }
    
    public int method21(int arg0) {
	try {
	    anInt5144++;
	    if (arg0 != -22056)
		method294(null, 63);
	    return aByte5131;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.O(" + arg0 + ')');
	}
    }
    
    public Class23_Sub1_Sub2(Class130 arg0, Class187 arg1, int arg2, int arg3,
			     int arg4, int arg5, boolean arg6, int arg7,
			     int arg8, boolean arg9) {
	super(arg3, arg4, arg5,
	      Class131_Sub41_Sub5.method1950(arg8, arg7, -47));
	do {
	    try {
		aByte5147 = (byte) arg2;
		anInt3700 = (short) arg3;
		aByte5152 = (byte) arg8;
		aBoolean5150 = arg9;
		aByte5131 = (byte) arg7;
		aShort5163 = (short) arg1.anInt2713;
		anInt3696 = (short) arg5;
		aBoolean5158 = arg6;
		aBoolean5155 = arg1.anInt2663 != 0 && !arg6;
		aBoolean5160
		    = (arg0.method1259() && arg1.aBoolean2735 && !aBoolean5158
		       && Class131_Sub2_Sub16.anInt5779 != 0);
		int i = 1024;
		if (aBoolean5150)
		    i |= 0x8000;
		Class14 class14
		    = method304((byte) -126, aBoolean5160, arg0, i);
		if (class14 == null)
		    break;
		aClass154_5132 = class14.aClass154_149;
		aClass131_Sub41_Sub13_5146 = class14.aClass131_Sub41_Sub13_148;
		if (!aBoolean5150)
		    break;
		aClass154_5132 = aClass154_5132.method2287((byte) 0, i, false);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("to.<init>(" + (arg0 != null ? "{...}" : "null")
			    + ',' + (arg1 != null ? "{...}" : "null") + ','
			    + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ','
			    + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9
			    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method302(String arg0, int arg1, int arg2) {
	try {
	    anInt5133++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(3, arg2, (byte) 1);
	    class131_sub41_sub6.method1962(arg1 ^ arg1);
	    class131_sub41_sub6.aString6241 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.AA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public static void method303(int arg0, int arg1, int arg2, boolean arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    anInt5151++;
	    Class173 class173
		= InputStream_Sub1.method87(arg2, arg6, (byte) -111);
	    if (class173 != null && class173.anObjectArray2408 != null) {
		Class131_Sub14 class131_sub14 = new Class131_Sub14();
		class131_sub14.aClass173_4276 = class173;
		class131_sub14.anObjectArray4281 = class173.anObjectArray2408;
		Class168.method2437(class131_sub14);
	    }
	    Class98.anInt1306 = arg2;
	    Class131_Sub41_Sub21.anInt6447 = arg4;
	    Class193.anInt2839 = arg5;
	    if (arg3 == false) {
		Class23_Sub5_Sub2.anInt5048 = arg1;
		Class154.aBoolean2047 = true;
		Class88.anInt1161 = arg6;
		Class153.anInt2042 = arg0;
		Class23_Sub4_Sub4.method383(-74, class173);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.R(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    if (arg3 < 12)
		return false;
	    anInt5162++;
	    Class154 class154 = method307((byte) 119, arg1, 65536);
	    if (class154 != null) {
		Class9 class9 = arg1.method1238();
		class9.method181(anInt3700, anInt3703, anInt3696);
		return class154.method2278(arg2, arg0, class9, false);
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	do {
	    try {
		anInt5135++;
		if (arg0 >= -116)
		    method304((byte) -6, false, null, 80);
		if (!(arg5 instanceof Class23_Sub1_Sub2)) {
		    if (arg5 instanceof Class23_Sub4_Sub5) {
			Class23_Sub4_Sub5 class23_sub4_sub5
			    = (Class23_Sub4_Sub5) arg5;
			if (aClass154_5132 != null
			    && class23_sub4_sub5.aClass154_5120 != null)
			    aClass154_5132.method2275((class23_sub4_sub5
						       .aClass154_5120),
						      arg3, arg6, arg2, arg4);
		    }
		} else {
		    Class23_Sub1_Sub2 class23_sub1_sub2
			= (Class23_Sub1_Sub2) arg5;
		    if (aClass154_5132 == null
			|| class23_sub1_sub2.aClass154_5132 == null)
			break;
		    aClass154_5132.method2275(class23_sub1_sub2.aClass154_5132,
					      arg3, arg6, arg2, arg4);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("to.J(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ',' + arg3
						     + ',' + arg4 + ','
						     + (arg5 != null ? "{...}"
							: "null")
						     + ',' + arg6 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class14 method304(byte arg0, boolean arg1, Class130 arg2,
			     int arg3) {
	try {
	    anInt5154++;
	    Class187 class187 = Class55.method612(aShort5163 & 0xffff, 119);
	    if (arg0 > -113)
		return null;
	    Class68 class68;
	    Class68 class68_11_;
	    if (!aBoolean5158) {
		class68 = Class131_Sub2_Sub37.aClass68Array6057[aByte5147];
		if (aByte5147 < 3)
		    class68_11_ = (Class131_Sub2_Sub37.aClass68Array6057
				   [aByte5147 - -1]);
		else
		    class68_11_ = null;
	    } else {
		class68 = Class85.aClass68Array1116[aByte5147];
		class68_11_ = Class131_Sub2_Sub37.aClass68Array6057[0];
	    }
	    return class187.method2569(aByte5131, arg2, class68, aByte5152,
				       anInt3696, anInt3700, anInt3703, arg3,
				       class68_11_, 118, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.BA(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static int method305(int arg0, String arg1, int arg2) {
	try {
	    if (arg2 != 14006)
		method305(13, null, -109);
	    anInt5149++;
	    return Class201.method2719(arg1, -8470, true, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.CA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class154 method18(byte arg0, int arg1, Class130 arg2) {
	try {
	    int i = -80 / ((arg0 - -32) / 61);
	    anInt5161++;
	    return method307((byte) 119, arg2, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.T(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method306(byte arg0) {
	try {
	    aClass83_5145 = null;
	    int i = -119 % ((arg0 - -21) / 34);
	    aString5139 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.W(" + arg0 + ')');
	}
    }
    
    public void method25(byte arg0) {
	try {
	    if (aClass154_5132 != null)
		aClass154_5132.method2246();
	    if (arg0 != 6)
		aClass131_Sub41_Sub13_5146 = null;
	    anInt5136++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.M(" + arg0 + ')');
	}
    }
    
    public void method20(Class130 arg0, boolean arg1) {
	if (arg1 != false)
	    aBoolean5159 = false;
	anInt5164++;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5146 == null && aBoolean5160) {
	    Class14 class14 = method304((byte) -114, true, arg0, 131072);
	    class131_sub41_sub13
		= class14 != null ? class14.aClass131_Sub41_Sub13_148 : null;
	} else {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5146;
	    aClass131_Sub41_Sub13_5146 = null;
	}
	if (class131_sub41_sub13 != null)
	    Class131_Sub41_Sub5.method1956(class131_sub41_sub13, aByte5147,
					   anInt3700, anInt3696, null);
    }
    
    public int method24(byte arg0) {
	try {
	    if (arg0 != -68)
		method18((byte) -108, 93, null);
	    anInt5153++;
	    return aByte5152;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.L(" + arg0 + ')');
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    if (arg0 != -115)
		method287(67, null, -112, 83);
	    anInt5142++;
	    return aBoolean5150;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.D(" + arg0 + ')');
	}
    }
    
    public void method22(int arg0, Class130 arg1) {
	anInt5134++;
	if (arg0 != 25510)
	    aClass154_5132 = null;
	Object object = null;
	Class131_Sub41_Sub13 class131_sub41_sub13;
	if (aClass131_Sub41_Sub13_5146 == null && aBoolean5160) {
	    Class14 class14 = method304((byte) -121, true, arg1, 131072);
	    class131_sub41_sub13
		= class14 != null ? class14.aClass131_Sub41_Sub13_148 : null;
	} else {
	    class131_sub41_sub13 = aClass131_Sub41_Sub13_5146;
	    aClass131_Sub41_Sub13_5146 = null;
	}
	if (class131_sub41_sub13 != null)
	    Class101.method884(class131_sub41_sub13, aByte5147, anInt3700,
			       anInt3696, null);
    }
    
    public Class154 method307(byte arg0, Class130 arg1, int arg2) {
	try {
	    anInt5143++;
	    if (aClass154_5132 != null
		&& arg1.method1208(aClass154_5132.method2253(), arg2) == 0)
		return aClass154_5132;
	    Class14 class14 = method304((byte) -119, false, arg1, arg2);
	    if (arg0 != 119)
		return null;
	    if (class14 == null)
		return null;
	    return class14.aClass154_149;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("to.V(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method19(byte arg0) {
	try {
	    if (arg0 < 102)
		aString5139 = null;
	    anInt5140++;
	    return aBoolean5160;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.K(" + arg0 + ')');
	}
    }
    
    public int method23(byte arg0) {
	try {
	    anInt5138++;
	    if (arg0 >= -110)
		method302(null, 6, 86);
	    return aShort5163 & 0xffff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"to.S(" + arg0 + ')');
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	anInt5148++;
	if (arg1 != 0)
	    aBoolean5159 = true;
    }
    
    public void method295(int arg0) {
	aBoolean5150 = false;
	anInt5141++;
	if (aClass154_5132 != null)
	    aClass154_5132.method2248(aClass154_5132.method2253() & ~0x8000);
	if (arg0 != 0)
	    method293((byte) -120, null, 95, 105, false, null, 93);
    }
    
    static {
	aString5139 = "Loaded title screen";
    }
}
