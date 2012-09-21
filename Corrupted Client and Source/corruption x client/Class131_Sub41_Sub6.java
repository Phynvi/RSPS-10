/* Class131_Sub41_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub6 extends Class131_Sub41
{
    public int anInt6234;
    public static int anInt6235;
    public int anInt6236;
    public static int anInt6237;
    public static int anInt6238;
    public static int anInt6239 = 0;
    public static int anInt6240;
    public String aString6241;
    public static int anInt6242;
    public static String aString6243 = "Loaded fonts";
    public int anInt6244;
    public static int anInt6245;
    public static int anInt6246;
    public static int anInt6247;
    
    public void method1959(int arg0) {
	try {
	    if (arg0 < -57) {
		aLong4671 = (aLong4671 & ~0x7fffffffffffffffL
			     | Class208.method2749(-3913) + 500L);
		anInt6242++;
		Class34.aClass175_485.method2477(this, -26);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hn.G(" + arg0 + ')');
	}
    }
    
    public static void method1960(int arg0, int arg1, int arg2, int arg3,
				  byte arg4, int arg5, int arg6) {
	try {
	    if (arg4 != 63)
		anInt6239 = -59;
	    Class87[] class87s = Class131_Sub2_Sub5.aClass87Array5612;
	    for (int i = 0; (class87s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class87 class87 = class87s[i];
		if (class87 != null
		    && (class87.anInt1135 ^ 0xffffffff) == -3) {
		    Class131_Sub2_Sub12.method1527
			(((class87.anInt1127 - Class92.regionX << -934193721)
			  + class87.anInt1131),
			 arg0 >> -1730192447, arg3 >> 942189249,
			 2 * class87.anInt1132, 0, arg6,
			 (class87.anInt1136
			  + (class87.anInt1137 - Class64.regionY
			     << 60894855)),
			 arg1);
		    if (Class131_Sub2_Sub6.anIntArray5629[0] > -1
			&& Class125.anInt1632 % 20 < 10)
			Class131_Sub35.aClass152Array4585
			    [class87.anInt1143].method2211
			    (-12 + (Class131_Sub2_Sub6.anIntArray5629[0]
				    + arg5),
			     (Class131_Sub2_Sub6.anIntArray5629[1] + arg2
			      + -28));
		}
	    }
	    anInt6245++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hn.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public long method1961(int arg0) {
	try {
	    anInt6238++;
	    if (arg0 != 2)
		anInt6236 = 6;
	    return 0x7fffffffffffffffL & aLong4671;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hn.H(" + arg0 + ')');
	}
    }
    
    public void method1962(int arg0) {
	aLong4671 |= ~0x7fffffffffffffffL;
	anInt6237++;
	if ((method1961(2) ^ 0xffffffffffffffffL) == -1L)
	    Class131_Sub19.aClass175_4397.method2477(this, -26);
	if (arg0 != 0)
	    method1961(-46);
    }
    
    public int method1963(int arg0) {
	try {
	    anInt6247++;
	    if (arg0 != -1255099360)
		aString6241 = null;
	    return (int) (0xffL & aLong1791 >>> -1255099360);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hn.F(" + arg0 + ')');
	}
    }
    
    public static void method1964(boolean arg0) {
	aString6243 = null;
	if (arg0 != false)
	    aString6243 = null;
    }
    
    public int method1965(byte arg0) {
	try {
	    if (arg0 >= -51)
		anInt6239 = 81;
	    anInt6240++;
	    return (int) aLong1791;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hn.J(" + arg0 + ')');
	}
    }
    
    public static int[] method1966(int arg0, int arg1, int arg2, int arg3,
				   int arg4, boolean arg5, boolean arg6,
				   float arg7) {
	try {
	    anInt6235++;
	    int[] is = new int[arg2];
	    Class131_Sub2_Sub17 class131_sub2_sub17
		= new Class131_Sub2_Sub17();
	    class131_sub2_sub17.anInt5809 = arg3;
	    class131_sub2_sub17.anInt5805 = arg1;
	    class131_sub2_sub17.aBoolean5793 = arg5;
	    if (arg6 != true)
		method1966(76, -82, -84, 74, 10, false, true, 0.95689183F);
	    class131_sub2_sub17.anInt5806 = (int) (arg7 * 4096.0F);
	    class131_sub2_sub17.anInt5794 = arg0;
	    class131_sub2_sub17.anInt5802 = arg4;
	    class131_sub2_sub17.method1471(0);
	    Class23_Sub4.method324(1, arg2, 108);
	    class131_sub2_sub17.method1553(6967, is, 0);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hn.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public Class131_Sub41_Sub6(int arg0, int arg1) {
	try {
	    aLong1791 = (long) arg0 << 108113120 | (long) arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hn.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    public static void method1967(int arg0, int arg1, Class23_Sub4_Sub1 arg2) {
	try {
	    anInt6246++;
	    int i = -1;
	    if (arg1 >= -100)
		method1967(-94, -74, null);
	    int i_0_ = 0;
	    if ((Class125.anInt1632 ^ 0xffffffff)
		> (arg2.anInt5306 ^ 0xffffffff))
		Class110_Sub1.method940(arg2, -103);
	    else if ((arg2.anInt5245 ^ 0xffffffff)
		     <= (Class125.anInt1632 ^ 0xffffffff))
		Class184.method2549((byte) 80, arg2);
	    else {
		Class91.method844(false, arg2, false);
		i_0_ = Class131_Sub41_Sub21.anInt6446;
		i = Class182.anInt2605;
	    }
	    if (arg2.anInt3733 < 128 || (arg2.anInt3747 ^ 0xffffffff) > -129
		|| (arg2.anInt3733
		    >= 128 * (-1 + Class131_Sub41_Sub11_Sub1.anInt6546))
		|| ((arg2.anInt3747 ^ 0xffffffff)
		    <= (128 * Class131_Sub2_Sub26.anInt5931 - 128
			^ 0xffffffff))) {
		arg2.anInt5245 = 0;
		arg2.anInt5247 = -1;
		arg2.anInt5306 = 0;
		arg2.anInt5253 = -1;
		arg2.anInt3733 = (arg2.anIntArray5328[0] * 128
				  - -(arg2.method335((byte) -118) * 64));
		arg2.anInt3747 = (128 * arg2.anIntArray5331[0]
				  + 64 * arg2.method335((byte) -52));
		arg2.method343(true);
	    }
	    if (Class166.aClass23_Sub4_Sub1_Sub2_2216 == arg2
		&& ((arg2.anInt3733 ^ 0xffffffff) > -1537
		    || (arg2.anInt3747 ^ 0xffffffff) > -1537
		    || (Class131_Sub41_Sub11_Sub1.anInt6546 * 128 + -1536
			<= arg2.anInt3733)
		    || ((arg2.anInt3747 ^ 0xffffffff)
			<= (128 * (Class131_Sub2_Sub26.anInt5931 + -12)
			    ^ 0xffffffff)))) {
		arg2.anInt5253 = -1;
		arg2.anInt5247 = -1;
		arg2.anInt5245 = 0;
		arg2.anInt5306 = 0;
		arg2.anInt3733 = (arg2.anIntArray5328[0] * 128
				  - -(arg2.method335((byte) -84) * 64));
		arg2.anInt3747 = (128 * arg2.anIntArray5331[0]
				  - -(64 * arg2.method335((byte) -54)));
		arg2.method343(true);
	    }
	    int i_1_ = Class131_Sub18.method1807(arg2, 16383);
	    Class19.method251(arg2, i_1_, i_0_, (byte) -17, i);
	    Class75.method761(arg2, (byte) -67);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hn.A(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1968(int arg0, int arg1) {
	Class131_Sub41_Sub13 class131_sub41_sub13 = null;
	for (int i = arg0; i < arg1; i++) {
	    Class68 class68 = Class131_Sub2_Sub37.aClass68Array6057[i];
	    if (class68 != null) {
		for (int i_2_ = 0; i_2_ < Class131_Sub8_Sub1.anInt6099;
		     i_2_++) {
		    for (int i_3_ = 0; i_3_ < Class210.anInt3068; i_3_++) {
			class131_sub41_sub13
			    = class68.method728(i_3_, i_2_,
						class131_sub41_sub13);
			if (class131_sub41_sub13 != null) {
			    int i_4_ = i_3_ << 7;
			    int i_5_ = i_2_ << 7;
			    for (int i_6_ = i - 1; i_6_ >= 0; i_6_--) {
				Class68 class68_7_
				    = (Class131_Sub2_Sub37.aClass68Array6057
				       [i_6_]);
				if (class68_7_ != null) {
				    int i_8_
					= (class68.method712(i_3_, i_2_)
					   - class68_7_.method712(i_3_, i_2_));
				    int i_9_
					= (class68.method712(i_3_ + 1, i_2_)
					   - class68_7_.method712(i_3_ + 1,
								  i_2_));
				    int i_10_
					= (class68.method712(i_3_ + 1,
							     i_2_ + 1)
					   - class68_7_.method712(i_3_ + 1,
								  i_2_ + 1));
				    int i_11_
					= (class68.method712(i_3_, i_2_ + 1)
					   - class68_7_.method712(i_3_,
								  i_2_ + 1));
				    class68_7_.method709(class131_sub41_sub13,
							 i_4_,
							 (i_8_ + i_9_ + i_10_
							  + i_11_) / 4,
							 i_5_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
}
