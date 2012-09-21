/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class145
{
    public Inflater anInflater1924;
    public static int anInt1925;
    public static int anInt1926;
    public static int anInt1927;
    public static int anInt1928;
    public static int anInt1929;
    public static int anInt1930;
    public static String aString1931
	= "Please wait - attempting to reestablish.";
    public static int anInt1932;
    public static int anInt1933;
    public static int anInt1934;
    public static int anInt1935;
    
    public static Class161 method2159(int arg0, byte arg1) {
	try {
	    anInt1932++;
	    Class161 class161;
	    synchronized (Class137.aClass214_1834) {
		class161 = (Class161) Class137.aClass214_1834
					  .method2780(120, (long) arg0);
	    }
	    if (class161 != null)
		return class161;
	    byte[] is
		= (Class131_Sub41_Sub17_Sub1.aClass158_6563.method2364
		   (Class23_Sub4_Sub2.method369((byte) 60, arg0),
		    Class131_Sub2_Sub24.method1587(arg0, 1381872556), 0));
	    if (arg1 >= -86)
		anInt1930 = 95;
	    class161 = new Class161();
	    class161.anInt2137 = arg0;
	    if (is != null)
		class161.method2392(256, new Stream(is));
	    class161.method2394(107);
	    synchronized (Class137.aClass214_1834) {
		Class137.aClass214_1834.method2773(true, class161,
						   (long) arg0);
	    }
	    return class161;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pe.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2160(Stream arg0, byte[] arg1, boolean arg2) {
	try {
	    anInt1927++;
	    if (arg2 != true)
		anInt1930 = 126;
	    if ((arg0.data[arg0.offset] ^ 0xffffffff) != -32
		|| arg0.data[arg0.offset + 1] != -117)
		throw new RuntimeException("Invalid GZIP header!");
	    if (anInflater1924 == null)
		anInflater1924 = new Inflater(true);
	    try {
		anInflater1924.setInput(arg0.data,
					10 + arg0.offset,
					(-10 - arg0.offset
					 - (8 - arg0.data.length)));
		anInflater1924.inflate(arg1);
	    } catch (Exception exception) {
		anInflater1924.reset();
		throw new RuntimeException("Invalid GZIP compressed data!");
	    }
	    anInflater1924.reset();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pe.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2161(byte arg0) {
	try {
	    anInt1933++;
	    Class1_Sub4 class1_sub4
		= (Class1_Sub4) Class18.aClass50_188.method588((byte) -56);
	    int i = -55 / ((arg0 - 30) / 39);
	    for (/**/; class1_sub4 != null;
		 class1_sub4 = ((Class1_Sub4)
				Class18.aClass50_188.method588((byte) 125)))
		Class29.method425(class1_sub4, 20);
	    client.method72();
	    client.method67();
	    client.method58();
	    client.method65();
	    client.method69();
	    client.method71();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pe.E(" + arg0 + ')');
	}
    }
    
    public static Class55 method2162(int arg0, Class158 arg1, int arg2) {
	try {
	    anInt1935++;
	    if (arg2 >= -96)
		method2163(-7, false);
	    byte[] is = arg1.method2358(arg0, -123);
	    if (is == null)
		return null;
	    return new Class55(is);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pe.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class145() {
	this(-1, 1000000, 1000000);
    }
    
    public static Class131_Sub41_Sub16 method2163(int arg0, boolean arg1) {
	try {
	    anInt1926++;
	    Class131_Sub41_Sub16 class131_sub41_sub16
		= ((Class131_Sub41_Sub16)
		   Class23_Sub5_Sub1.aClass137_5033.method2111(-12,
							       (long) arg0));
	    if (class131_sub41_sub16 != null)
		return class131_sub41_sub16;
	    byte[] is = Class127_Sub1.aClass158_4011.method2364(arg0, 11, 0);
	    class131_sub41_sub16 = new Class131_Sub41_Sub16();
	    if (is != null)
		class131_sub41_sub16.method2039(new Stream(is),
						(byte) 114);
	    Class23_Sub5_Sub1.aClass137_5033.method2110(class131_sub41_sub16,
							false, (long) arg0);
	    if (arg1 != true)
		method2159(-127, (byte) -1);
	    return class131_sub41_sub16;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pe.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2164(byte arg0) {
	try {
	    anInt1928++;
	    Class131_Sub8.method1676((long) Class125.anInt1632, -117,
				     Class183_Sub1.aClass130_4960);
	    if (Class187.anInt2674 != -1)
		Class131_Sub2_Sub26.method1596((byte) 45, Class187.anInt2674);
	    if (arg0 < 56)
		anInt1930 = 104;
	    for (int i = 0; Class131_Sub29.anInt4514 > i; i++) {
		if (Class131_Sub41_Sub16.aBooleanArray6371[i])
		    Class128_Sub1.aBooleanArray4018[i] = true;
		Class110_Sub4.aBooleanArray3934[i]
		    = Class131_Sub41_Sub16.aBooleanArray6371[i];
		Class131_Sub41_Sub16.aBooleanArray6371[i] = false;
	    }
	    Class131_Sub1_Sub4.anInt5538 = Class125.anInt1632;
	    if (Class183_Sub1.aClass130_4960.method1223())
		Class28.aBoolean287 = true;
	    Class131_Sub13.aClass173_4263 = null;
	    if (Class187.anInt2674 != -1) {
		Class131_Sub29.anInt4514 = 0;
		Class131_Sub2_Sub11.method1521((byte) -128);
	    }
	    Class183_Sub1.aClass130_4960.method1244();
	    Class37.method492(Class53.anInt708, 1);
	    Class42.anInt563 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pe.H(" + arg0 + ')');
	}
    }
    
    public static void method2165(int arg0, int arg1, byte arg2) {
	Class156.aClass214_2070 = new Class214(arg1);
	anInt1925++;
	Class100.aClass214_1317 = new Class214(arg0);
	if (arg2 != 0)
	    anInt1930 = 30;
    }
    
    public static void method2166(int arg0) {
	try {
	    Class131_Sub2_Sub6.LocalX = -1;
	    Class169.LocalY = -1;
	    Class131_Sub31.anInt4524 = 0;
	    anInt1934++;
	    if (arg0 != -1322)
		anInt1930 = 22;
	    Class22.anInt247 = -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pe.B(" + arg0 + ')');
	}
    }
    
    public static void method2167(boolean arg0) {
	try {
	    if (arg0 != false)
		anInt1930 = -97;
	    aString1931 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pe.I(" + arg0 + ')');
	}
    }
    
    public Class145(int arg0, int arg1, int arg2) {
	/* empty */
    }
    
    public static void method2168(boolean arg0, int arg1, Class130 arg2,
				  byte arg3, int arg4, Class19 arg5, int arg6,
				  int arg7, int arg8, int arg9, int arg10,
				  int arg11, boolean arg12) {
	try {
	    anInt1929++;
	    if (Class9.method182((byte) 121)
		|| Class45.method561(arg8, true, arg10, arg7,
				     Class1_Sub8.anInt3600)) {
		if ((Class193.anInt2830 ^ 0xffffffff) < (arg7 ^ 0xffffffff))
		    Class193.anInt2830 = arg7;
		Class187 class187 = Class55.method612(arg1, -51);
		if ((Stream.anInt4299 ^ 0xffffffff) != -2
		    || !class187.aBoolean2671) {
		    int i;
		    int i_0_;
		    if ((arg9 ^ 0xffffffff) != -2 && arg9 != 3) {
			i_0_ = class187.anInt2668;
			i = class187.anInt2702;
		    } else {
			i = class187.anInt2668;
			i_0_ = class187.anInt2702;
		    }
		    if (arg3 != -91)
			method2165(-76, 43, (byte) -100);
		    int i_1_;
		    int i_2_;
		    if ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
			> (arg8 + i ^ 0xffffffff)) {
			i_1_ = arg8;
			i_2_ = 1 + arg8;
		    } else {
			i_1_ = (i >> 1336200929) + arg8;
			i_2_ = (i - -1 >> -664240799) + arg8;
		    }
		    int i_3_;
		    int i_4_;
		    if (Class131_Sub2_Sub26.anInt5931 < i_0_ + arg10) {
			i_4_ = arg10;
			i_3_ = 1 + arg10;
		    } else {
			i_3_ = (i_0_ + 1 >> -1062032543) + arg10;
			i_4_ = (i_0_ >> 810130401) + arg10;
		    }
		    Class68 class68 = Class75.aClass68Array1023[arg4];
		    int i_5_ = ((class68.method712(i_1_, i_4_)
				 + class68.method712(i_2_, i_4_)
				 + (class68.method712(i_1_, i_3_)
				    - -class68.method712(i_2_, i_3_)))
				>> -671109630);
		    int i_6_ = (arg8 << 761908999) + (i << -1104026682);
		    int i_7_ = (arg10 << -1501455289) - -(i_0_ << -888271482);
		    boolean bool = arg0 && !arg12 && class187.aBoolean2673;
		    if (class187.method2582(0))
			Class131_Sub2_Sub10.method1513(null, arg9, arg10, null,
						       false, arg7, class187,
						       arg8);
		    boolean bool_8_ = ((arg11 ^ 0xffffffff) == 0
				       && class187.anInt2718 == -1
				       && class187.anIntArray2657 == null
				       && class187.anIntArray2653 == null
				       && !class187.aBoolean2660);
		    if (!Class93.aBoolean1223
			|| (class187.anInt2690 ^ 0xffffffff) == -2) {
			if (arg6 == 22) {
			    if (Class135.aBoolean1818
				|| (class187.anInt2663 ^ 0xffffffff) != -1
				|| class187.anInt2693 == 1
				|| class187.aBoolean2651) {
				Class23_Sub5 class23_sub5;
				if (bool_8_) {
				    Class23_Sub5_Sub2 class23_sub5_sub2
					= new Class23_Sub5_Sub2(arg2, class187,
								arg4, i_6_,
								i_5_, i_7_,
								arg12, arg9,
								bool);
				    class23_sub5 = class23_sub5_sub2;
				    if (class23_sub5_sub2.method19((byte) 115))
					class23_sub5_sub2
					    .method22(arg3 + 25601, arg2);
				} else
				    class23_sub5
					= new Class23_Sub5_Sub1(arg2, class187,
								arg9, arg7,
								arg4, i_6_,
								i_5_, i_7_,
								arg12, arg11);
				Class155.method2339(arg7, arg8, arg10,
						    class23_sub5);
				if ((class187.anInt2693 ^ 0xffffffff) == -2
				    && arg5 != null)
				    arg5.method249(arg8, arg10, -32323);
			    }
			} else if (arg6 == 10 || (arg6 ^ 0xffffffff) == -12) {
			    Class23_Sub4_Sub5 class23_sub4_sub5 = null;
			    int i_9_;
			    Class23_Sub4 class23_sub4;
			    if (bool_8_) {
				Class23_Sub4_Sub5 class23_sub4_sub5_10_
				    = new Class23_Sub4_Sub5(arg2, class187,
							    arg7, arg4, i_6_,
							    i_5_, i_7_, arg12,
							    arg8,
							    -1 + (i + arg8),
							    arg10,
							    -1 + i_0_ + arg10,
							    arg6, arg9, bool);
				i_9_ = class23_sub4_sub5_10_
					   .method393((byte) 122);
				class23_sub4_sub5 = class23_sub4_sub5_10_;
				class23_sub4 = class23_sub4_sub5_10_;
			    } else {
				i_9_ = 15;
				class23_sub4
				    = new Class23_Sub4_Sub3(arg2, class187,
							    arg6, arg9, arg7,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg8,
							    -1 + (arg8 + i),
							    arg10,
							    -1 + (arg10
								  - -i_0_),
							    arg11);
			    }
			    if (Class131_Sub23.method1823(class23_sub4,
							  false)) {
				if (class23_sub4_sub5 != null
				    && class23_sub4_sub5.method19((byte) 124))
				    class23_sub4_sub5.method22(arg3 ^ ~0x63fc,
							       arg2);
				if (class187.aBoolean2664 && arg0) {
				    if (i_9_ > 30)
					i_9_ = 30;
				    for (int i_11_ = 0;
					 ((i_11_ ^ 0xffffffff)
					  >= (i ^ 0xffffffff));
					 i_11_++) {
					for (int i_12_ = 0;
					     ((i_0_ ^ 0xffffffff)
					      <= (i_12_ ^ 0xffffffff));
					     i_12_++)
					    class68.method715(arg8 + i_11_,
							      i_12_ + arg10,
							      i_9_);
				    }
				}
			    }
			    if (class187.anInt2693 != 0 && arg5 != null)
				arg5.method234(i, class187.aBoolean2691, i_0_,
					       arg8, arg10, (byte) -112,
					       !class187.aBoolean2724);
			} else if (arg6 >= 12 && arg6 <= 17
				   || ((arg6 ^ 0xffffffff) <= -19
				       && arg6 <= 21)) {
			    Class23_Sub4 class23_sub4;
			    if (!bool_8_)
				class23_sub4
				    = new Class23_Sub4_Sub3(arg2, class187,
							    arg6, arg9, arg7,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg8,
							    -1 + i + arg8,
							    arg10,
							    -1 + arg10 - -i_0_,
							    arg11);
			    else {
				Class23_Sub4_Sub5 class23_sub4_sub5
				    = new Class23_Sub4_Sub5(arg2, class187,
							    arg7, arg4, i_6_,
							    i_5_, i_7_, arg12,
							    arg8,
							    arg8 - (-i + 1),
							    arg10,
							    -1 + arg10 + i_0_,
							    arg6, arg9, bool);
				class23_sub4 = class23_sub4_sub5;
				if (class23_sub4_sub5.method19((byte) 119))
				    class23_sub4_sub5.method22(arg3 + 25601,
							       arg2);
			    }
			    Class131_Sub23.method1823(class23_sub4, false);
			    if (arg0 && !arg12 && (arg6 ^ 0xffffffff) <= -13
				&& (arg6 ^ 0xffffffff) >= -18
				&& (arg6 ^ 0xffffffff) != -14 && arg7 > 0
				&& (class187.anInt2690 ^ 0xffffffff) != -1)
				Class121.aByteArrayArrayArray1590[arg7]
				    [arg8][arg10]
				    = (byte) (Cryption.method2105
					      ((Class121
						.aByteArrayArrayArray1590[arg7]
						[arg8][arg10]),
					       4));
			    if (class187.anInt2693 != 0 && arg5 != null)
				arg5.method234(i, class187.aBoolean2691, i_0_,
					       arg8, arg10, (byte) -125,
					       !class187.aBoolean2724);
			} else if (arg6 == 0) {
			    Class23_Sub1 class23_sub1;
			    if (bool_8_) {
				Class23_Sub1_Sub2 class23_sub1_sub2
				    = new Class23_Sub1_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg6,
							    arg9, bool);
				if (class23_sub1_sub2.method19((byte) 124))
				    class23_sub1_sub2.method22(25510, arg2);
				class23_sub1 = class23_sub1_sub2;
			    } else
				class23_sub1
				    = new Class23_Sub1_Sub1(arg2, class187, 0,
							    arg9, arg7, arg4,
							    i_6_, i_5_, i_7_,
							    arg12, arg11);
			    Class68.method724(arg7, arg8, arg10, class23_sub1,
					      null);
			    if (arg0) {
				if (arg9 != 0) {
				    if (arg9 != 1) {
					if ((arg9 ^ 0xffffffff) != -3) {
					    if (arg9 == 3) {
						if (class187.aBoolean2664) {
						    class68.method715(arg8,
								      arg10,
								      50);
						    class68.method715(1 + arg8,
								      arg10,
								      50);
						}
						if ((class187.anInt2690
						     ^ 0xffffffff) == -2
						    && !arg12)
						    Class121
							.aByteArrayArrayArray1590
							[arg7][arg8][arg10]
							= (byte) (Cryption
								      .method2105
								  ((Class121
								    .aByteArrayArrayArray1590
								    [arg7]
								    [arg8]
								    [arg10]),
								   2));
					    }
					} else {
					    if (class187.aBoolean2664) {
						class68.method715(1 + arg8,
								  arg10, 50);
						class68.method715(arg8 + 1,
								  1 + arg10,
								  50);
					    }
					    if (class187.anInt2690 == 1
						&& !arg12)
						Class121
						    .aByteArrayArrayArray1590
						    [arg7][arg8 - -1][arg10]
						    = (byte) (Cryption
								  .method2105
							      ((Class121
								.aByteArrayArrayArray1590
								[arg7]
								[arg8 - -1]
								[arg10]),
							       1));
					}
				    } else {
					if (class187.aBoolean2664) {
					    class68.method715(arg8, 1 + arg10,
							      50);
					    class68.method715(1 + arg8,
							      arg10 - -1, 50);
					}
					if (((class187.anInt2690 ^ 0xffffffff)
					     == -2)
					    && !arg12)
					    Class121
						.aByteArrayArrayArray1590[arg7]
						[arg8][1 + arg10]
						= (byte) (Cryption.method2105
							  ((Class121
							    .aByteArrayArrayArray1590
							    [arg7][arg8]
							    [1 + arg10]),
							   2));
				    }
				} else {
				    if (class187.aBoolean2664) {
					class68.method715(arg8, arg10, 50);
					class68.method715(arg8, 1 + arg10, 50);
				    }
				    if (class187.anInt2690 == 1 && !arg12)
					Class121.aByteArrayArrayArray1590
					    [arg7][arg8][arg10]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg7][arg8][arg10]),
						       1));
				}
			    }
			    if (class187.anInt2693 != 0 && arg5 != null)
				arg5.method235(!class187.aBoolean2724,
					       class187.aBoolean2691,
					       (byte) 124, arg8, arg9, arg6,
					       arg10);
			    if (class187.anInt2670 != 16)
				Class143.method2145(arg7, arg8, arg10,
						    class187.anInt2670);
			} else if (arg6 == 1) {
			    Class23_Sub1 class23_sub1;
			    if (bool_8_) {
				Class23_Sub1_Sub2 class23_sub1_sub2
				    = new Class23_Sub1_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg6,
							    arg9, bool);
				if (class23_sub1_sub2.method19((byte) 111))
				    class23_sub1_sub2.method22(25510, arg2);
				class23_sub1 = class23_sub1_sub2;
			    } else
				class23_sub1
				    = new Class23_Sub1_Sub1(arg2, class187, 1,
							    arg9, arg7, arg4,
							    i_6_, i_5_, i_7_,
							    arg12, arg11);
			    Class68.method724(arg7, arg8, arg10, class23_sub1,
					      null);
			    if (class187.aBoolean2664 && arg0) {
				if ((arg9 ^ 0xffffffff) == -1)
				    class68.method715(arg8, arg10 - -1, 50);
				else if ((arg9 ^ 0xffffffff) == -2)
				    class68.method715(1 + arg8, arg10 - -1,
						      50);
				else if (arg9 == 2)
				    class68.method715(1 + arg8, arg10, 50);
				else if ((arg9 ^ 0xffffffff) == -4)
				    class68.method715(arg8, arg10, 50);
			    }
			    if (class187.anInt2693 != 0 && arg5 != null)
				arg5.method235(!class187.aBoolean2724,
					       class187.aBoolean2691,
					       (byte) 124, arg8, arg9, arg6,
					       arg10);
			} else if (arg6 == 2) {
			    int i_13_ = 0x3 & arg9 + 1;
			    Class23_Sub1 class23_sub1;
			    Class23_Sub1 class23_sub1_14_;
			    if (bool_8_) {
				Class23_Sub1_Sub2 class23_sub1_sub2
				    = new Class23_Sub1_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg6,
							    arg9 + 4, bool);
				Class23_Sub1_Sub2 class23_sub1_sub2_15_
				    = new Class23_Sub1_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg6,
							    i_13_, bool);
				if (class23_sub1_sub2.method19((byte) 107))
				    class23_sub1_sub2.method22(25510, arg2);
				class23_sub1 = class23_sub1_sub2;
				class23_sub1_14_ = class23_sub1_sub2_15_;
				if (class23_sub1_sub2_15_.method19((byte) 114))
				    class23_sub1_sub2_15_.method22(25510,
								   arg2);
			    } else {
				class23_sub1
				    = new Class23_Sub1_Sub1(arg2, class187, 2,
							    arg9 + 4, arg7,
							    arg4, i_6_, i_5_,
							    i_7_, arg12,
							    arg11);
				class23_sub1_14_
				    = new Class23_Sub1_Sub1(arg2, class187, 2,
							    i_13_, arg7, arg4,
							    i_6_, i_5_, i_7_,
							    arg12, arg11);
			    }
			    Class68.method724(arg7, arg8, arg10, class23_sub1,
					      class23_sub1_14_);
			    if ((class187.anInt2690 ^ 0xffffffff) == -2 && arg0
				&& !arg12) {
				if ((arg9 ^ 0xffffffff) != -1) {
				    if ((arg9 ^ 0xffffffff) == -2) {
					Class121.aByteArrayArrayArray1590
					    [arg7][arg8][arg10 + 1]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg7][arg8]
							[arg10 + 1]),
						       2));
					Class121.aByteArrayArrayArray1590
					    [arg7][1 + arg8][arg10]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg7][1 + arg8]
							[arg10]),
						       1));
				    } else if (arg9 != 2) {
					if ((arg9 ^ 0xffffffff) == -4) {
					    Class121
						.aByteArrayArrayArray1590[arg7]
						[arg8][arg10]
						= (byte) (Cryption.method2105
							  ((Class121
							    .aByteArrayArrayArray1590
							    [arg7][arg8]
							    [arg10]),
							   2));
					    Class121
						.aByteArrayArrayArray1590[arg7]
						[arg8][arg10]
						= (byte) (Cryption.method2105
							  ((Class121
							    .aByteArrayArrayArray1590
							    [arg7][arg8]
							    [arg10]),
							   1));
					}
				    } else {
					Class121.aByteArrayArrayArray1590
					    [arg7][1 + arg8][arg10]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg7][1 + arg8]
							[arg10]),
						       1));
					Class121.aByteArrayArrayArray1590
					    [arg7][arg8][arg10]
					    = (byte) (Cryption.method2105
						      ((Class121
							.aByteArrayArrayArray1590
							[arg7][arg8][arg10]),
						       2));
				    }
				} else {
				    Class121.aByteArrayArrayArray1590[arg7]
					[arg8][arg10]
					= (byte) (Cryption.method2105
						  ((Class121
						    .aByteArrayArrayArray1590
						    [arg7][arg8][arg10]),
						   1));
				    Class121.aByteArrayArrayArray1590[arg7]
					[arg8][arg10 + 1]
					= (byte) (Cryption.method2105
						  ((Class121
						    .aByteArrayArrayArray1590
						    [arg7][arg8][arg10 + 1]),
						   2));
				}
			    }
			    if ((class187.anInt2693 ^ 0xffffffff) != -1
				&& arg5 != null)
				arg5.method235(!class187.aBoolean2724,
					       class187.aBoolean2691,
					       (byte) 124, arg8, arg9, arg6,
					       arg10);
			    if (class187.anInt2670 != 16)
				Class143.method2145(arg7, arg8, arg10,
						    class187.anInt2670);
			} else if (arg6 == 3) {
			    Class23_Sub1 class23_sub1;
			    if (bool_8_) {
				Class23_Sub1_Sub2 class23_sub1_sub2
				    = new Class23_Sub1_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg6,
							    arg9, bool);
				if (class23_sub1_sub2.method19((byte) 126))
				    class23_sub1_sub2.method22(25510, arg2);
				class23_sub1 = class23_sub1_sub2;
			    } else
				class23_sub1
				    = new Class23_Sub1_Sub1(arg2, class187, 3,
							    arg9, arg7, arg4,
							    i_6_, i_5_, i_7_,
							    arg12, arg11);
			    Class68.method724(arg7, arg8, arg10, class23_sub1,
					      null);
			    if (class187.aBoolean2664 && arg0) {
				if (arg9 != 0) {
				    if (arg9 != 1) {
					if (arg9 != 2) {
					    if (arg9 == 3)
						class68.method715(arg8, arg10,
								  50);
					} else
					    class68.method715(1 + arg8, arg10,
							      50);
				    } else
					class68.method715(1 + arg8, 1 + arg10,
							  50);
				} else
				    class68.method715(arg8, arg10 + 1, 50);
			    }
			    if (class187.anInt2693 != 0 && arg5 != null)
				arg5.method235(!class187.aBoolean2724,
					       class187.aBoolean2691,
					       (byte) 127, arg8, arg9, arg6,
					       arg10);
			} else if ((arg6 ^ 0xffffffff) == -10) {
			    Class23_Sub4 class23_sub4;
			    if (bool_8_) {
				Class23_Sub4_Sub5 class23_sub4_sub5
				    = new Class23_Sub4_Sub5(arg2, class187,
							    arg7, arg4, i_6_,
							    i_5_, i_7_, arg12,
							    arg8, arg8, arg10,
							    arg10, arg6, arg9,
							    bool);
				if (class23_sub4_sub5.method19((byte) 123))
				    class23_sub4_sub5.method22(25510, arg2);
				class23_sub4 = class23_sub4_sub5;
			    } else
				class23_sub4
				    = new Class23_Sub4_Sub3(arg2, class187,
							    arg6, arg9, arg7,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg8,
							    arg8 + (i + -1),
							    arg10,
							    arg10 - -i_0_ - 1,
							    arg11);
			    Class131_Sub23.method1823(class23_sub4, false);
			    if ((class187.anInt2693 ^ 0xffffffff) != -1
				&& arg5 != null)
				arg5.method234(i, class187.aBoolean2691, i_0_,
					       arg8, arg10, (byte) -124,
					       !class187.aBoolean2724);
			    if ((class187.anInt2670 ^ 0xffffffff) != -17)
				Class143.method2145(arg7, arg8, arg10,
						    class187.anInt2670);
			} else if ((arg6 ^ 0xffffffff) == -5) {
			    Class23_Sub2 class23_sub2;
			    if (bool_8_) {
				Class23_Sub2_Sub2 class23_sub2_sub2
				    = new Class23_Sub2_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, 0, 0,
							    0, arg6, arg9);
				if (class23_sub2_sub2.method19((byte) 126))
				    class23_sub2_sub2.method22(25510, arg2);
				class23_sub2 = class23_sub2_sub2;
			    } else
				class23_sub2
				    = new Class23_Sub2_Sub1(arg2, class187,
							    arg6, arg9, arg7,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, 0, 0,
							    0, arg11);
			    Class131_Sub35.method1874(arg7, arg8, arg10,
						      class23_sub2, null);
			} else if (arg6 == 5) {
			    int i_16_ = 16;
			    Interface6 interface6
				= ((Interface6)
				   Class43.method521(arg7, arg8, arg10));
			    if (interface6 != null)
				i_16_
				    = (Class55.method612
				       (interface6.method23((byte) -120), 125)
				       .anInt2670);
			    Class23_Sub2 class23_sub2;
			    if (bool_8_) {
				Class23_Sub2_Sub2 class23_sub2_sub2
				    = (new Class23_Sub2_Sub2
				       (arg2, class187, arg4, i_6_, i_5_, i_7_,
					arg12, 0,
					i_16_ * Class101.anIntArray1330[arg9],
					(Class131_Sub43.anIntArray4699[arg9]
					 * i_16_),
					arg6, arg9));
				if (class23_sub2_sub2.method19((byte) 123))
				    class23_sub2_sub2.method22(25510, arg2);
				class23_sub2 = class23_sub2_sub2;
			    } else
				class23_sub2
				    = (new Class23_Sub2_Sub1
				       (arg2, class187, arg6, arg9, arg7, arg4,
					i_6_, i_5_, i_7_, arg12, 0,
					i_16_ * Class101.anIntArray1330[arg9],
					(Class131_Sub43.anIntArray4699[arg9]
					 * i_16_),
					arg11));
			    Class131_Sub35.method1874(arg7, arg8, arg10,
						      class23_sub2, null);
			} else if ((arg6 ^ 0xffffffff) == -7) {
			    int i_17_ = 8;
			    Interface6 interface6
				= ((Interface6)
				   Class43.method521(arg7, arg8, arg10));
			    if (interface6 != null)
				i_17_ = (Class55.method612
					 (interface6.method23((byte) -126),
					  arg3 ^ ~0x29)
					 .anInt2670) / 2;
			    Class23_Sub2 class23_sub2;
			    if (bool_8_) {
				Class23_Sub2_Sub2 class23_sub2_sub2
				    = (new Class23_Sub2_Sub2
				       (arg2, class187, arg4, i_6_, i_5_, i_7_,
					arg12, arg9,
					i_17_ * Class101.anIntArray1330[arg9],
					i_17_ * (Class131_Sub43.anIntArray4699
						 [arg9]),
					arg6, arg9 + 4));
				if (class23_sub2_sub2.method19((byte) 120))
				    class23_sub2_sub2.method22(arg3 ^ ~0x63fc,
							       arg2);
				class23_sub2 = class23_sub2_sub2;
			    } else
				class23_sub2
				    = (new Class23_Sub2_Sub1
				       (arg2, class187, arg6, arg9 + 4, arg7,
					arg4, i_6_, i_5_, i_7_, arg12, arg9,
					Class23.anIntArray255[arg9] * i_17_,
					Class107.anIntArray1401[arg9] * i_17_,
					arg11));
			    Class131_Sub35.method1874(arg7, arg8, arg10,
						      class23_sub2, null);
			} else if ((arg6 ^ 0xffffffff) == -8) {
			    int i_18_ = 0x3 & arg9 - -2;
			    Class23_Sub2 class23_sub2;
			    if (!bool_8_)
				class23_sub2
				    = new Class23_Sub2_Sub1(arg2, class187,
							    arg6, i_18_ + 4,
							    arg7, arg4, i_6_,
							    i_5_, i_7_, arg12,
							    i_18_, 0, 0,
							    arg11);
			    else {
				Class23_Sub2_Sub2 class23_sub2_sub2
				    = new Class23_Sub2_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, i_18_,
							    0, 0, arg6,
							    4 + i_18_);
				if (class23_sub2_sub2.method19((byte) 127))
				    class23_sub2_sub2.method22(25510, arg2);
				class23_sub2 = class23_sub2_sub2;
			    }
			    Class131_Sub35.method1874(arg7, arg8, arg10,
						      class23_sub2, null);
			} else if (arg6 == 8) {
			    int i_19_ = arg9 + 2 & 0x3;
			    int i_20_ = 8;
			    Interface6 interface6
				= ((Interface6)
				   Class43.method521(arg7, arg8, arg10));
			    if (interface6 != null)
				i_20_
				    = (Class55.method612
				       (interface6.method23((byte) -113), -100)
				       .anInt2670) / 2;
			    Class23_Sub2 class23_sub2;
			    Class23_Sub2 class23_sub2_21_;
			    if (!bool_8_) {
				Class23_Sub2_Sub1 class23_sub2_sub1
				    = (new Class23_Sub2_Sub1
				       (arg2, class187, arg6, arg9 + 4, arg7,
					arg4, i_6_, i_5_, i_7_, arg12, arg9,
					i_20_ * Class23.anIntArray255[arg9],
					i_20_ * Class107.anIntArray1401[arg9],
					arg11));
				Class23_Sub2_Sub1 class23_sub2_sub1_22_
				    = new Class23_Sub2_Sub1(arg2, class187,
							    arg6, 4 + i_19_,
							    arg7, arg4, i_6_,
							    i_5_, i_7_, arg12,
							    arg9, 0, 0, arg11);
				class23_sub2_21_ = class23_sub2_sub1;
				class23_sub2 = class23_sub2_sub1_22_;
			    } else {
				Class23_Sub2_Sub2 class23_sub2_sub2
				    = (new Class23_Sub2_Sub2
				       (arg2, class187, arg4, i_6_, i_5_, i_7_,
					arg12, arg9,
					i_20_ * Class23.anIntArray255[arg9],
					Class107.anIntArray1401[arg9] * i_20_,
					arg6, 4 + arg9));
				Class23_Sub2_Sub2 class23_sub2_sub2_23_
				    = new Class23_Sub2_Sub2(arg2, class187,
							    arg4, i_6_, i_5_,
							    i_7_, arg12, arg9,
							    0, 0, arg6,
							    i_19_ + 4);
				if (class23_sub2_sub2.method19((byte) 115))
				    class23_sub2_sub2.method22(25510, arg2);
				if (class23_sub2_sub2_23_.method19((byte) 117))
				    class23_sub2_sub2_23_.method22(25510,
								   arg2);
				class23_sub2 = class23_sub2_sub2_23_;
				class23_sub2_21_ = class23_sub2_sub2;
			    }
			    Class131_Sub35.method1874(arg7, arg8, arg10,
						      class23_sub2_21_,
						      class23_sub2);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("pe.J(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + (arg5 != null ? "{...}" : "null") + ','
			+ arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ','
			+ arg10 + ',' + arg11 + ',' + arg12 + ')'));
	}
    }
    
    static {
	anInt1930 = 0;
    }
}
