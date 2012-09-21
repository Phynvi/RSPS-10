/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class220
{
    public int[] anIntArray3209;
    public static String aString3210 = "Connection lost.";
    public int[] anIntArray3211;
    public static Class214 aClass214_3212 = new Class214(128);
    public int anInt3213;
    public int[][] anIntArrayArray3214;
    public Login[] aLoginArray3215;
    public int anInt3216;
    public static int anInt3217;
    public int anInt3218;
    public int[][] anIntArrayArray3219;
    public static int anInt3220;
    public int[] anIntArray3221;
    public static int anInt3222;
    public int[] anIntArray3223;
    public int anInt3224;
    public Login aLogin_3225;
    public static int anInt3226;
    public int[] anIntArray3227;
    public static int anInt3228;
    public static int anInt3229;
    public static int anInt3230;
    public static int anInt3231 = 0;
    public int[] anIntArray3232;

    public static void method2823(int arg0, Class130 arg1) {
	try {
	    anInt3230++;
	    int i = Class131_Sub1_Sub4.anInt5537;
	    int i_0_ = Class40.anInt525;
	    int i_1_ = Class89.anInt3268;
	    int i_2_ = Class131_Sub41_Sub17.anInt6384;
	    int i_3_ = -10660793;
	    arg1.method1201(i_1_, i_2_, i, i_0_, i_3_, arg0 ^ 0x72);
	    arg1.method1201(i_1_ + -2, 16, i + 1, i_0_ + 1, -16777216, -111);
	    arg1.method1262(i_2_ + -19, 1 + i, i_1_ - 2, false, i_0_ - -18,
			    -16777216);
	    Class93.aClass44_1222.method529(-8219,
					    (Class131_Sub41_Sub21_Sub2
					     .aString6593),
					    i_3_, 14 + i_0_, 3 + i, arg0);
	    int i_4_ = Class144.anInt1914;
	    int i_5_ = Class23_Sub4_Sub3.anInt5005;
	    int i_6_ = 0;
	    for (Class131_Sub21 class131_sub21
		     = ((Class131_Sub21)
			Class66.aClass119_843.method1007(arg0 + 1));
		 class131_sub21 != null;
		 class131_sub21
		     = (Class131_Sub21) Class66.aClass119_843.method1014(0)) {
		int i_7_
		    = 16 * (-i_6_ + (-1 + Class147.anInt1946)) + 31 + i_0_;
		int i_8_ = -1;
		if ((i_4_ ^ 0xffffffff) < (i ^ 0xffffffff)
		    && (i + i_1_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff)
		    && i_5_ > -13 + i_7_
		    && (i_7_ + 3 ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
		    i_8_ = -256;
		int[] is = null;
		if (Class85.method807((byte) 107, class131_sub21.anInt4442))
		    is = (Class131_Sub19.method1808
			  ((int) class131_sub21.aLong4437, false)
			  .anIntArray336);
		else if (Class23_Sub3.method319((byte) 45,
						class131_sub21.anInt4442)) {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [(int) class131_sub21.aLong4437]);
		    if (class23_sub4_sub1_sub1 != null)
			is = (class23_sub4_sub1_sub1.aClass66_6474
			      .anIntArray885);
		} else if (Class1_Sub2.method99(class131_sub21.anInt4442,
						(byte) -109)) {
		    if ((class131_sub21.anInt4442 ^ 0xffffffff) == -1010)
			is = Class55.method612((int) class131_sub21.aLong4437,
					       -126).anIntArray2655;
		    else
			is = (Class55.method612
			      ((int) (class131_sub21.aLong4437 >>> 2015511648
				      & 0x7fffffffL),
			       -76)
			      .anIntArray2655);
		}
		String string = client.method64(-122, class131_sub21);
		if (is != null)
		    string += Class75.method762(arg0 ^ ~0x73, is);
		i_6_++;
		Class93.aClass44_1222.method547(i_8_, 4712, string,
						Class167.aClass152Array2226,
						Class213.anIntArray3120, i + 3,
						0, i_7_);
	    }
	    Class193.method2625(Class40.anInt525, Class89.anInt3268,
				Class131_Sub41_Sub17.anInt6384, (byte) 63,
				Class131_Sub1_Sub4.anInt5537);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static boolean method2824(Class94 arg0, int arg1) {
	try {
	    anInt3229++;
	    if (arg1 != -1225)
		return true;
	    if (arg0 == null)
		return false;
	    if (!arg0.aBoolean1244)
		return false;
	    if (!arg0.method861(-1))
		return false;
	    if (Class131_Sub2_Sub10_Sub1.aClass180_6542
		    .method2521(-55, (long) arg0.anInt1233)
		!= null)
		return false;
	    if (Class6.aClass180_97.method2521(arg1 ^ 0x4ad,
					       (long) arg0.anInt1262)
		!= null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method2825(int arg0, Class23_Sub4_Sub1_Sub1 arg1) {
	try {
	    anInt3217++;
	    Class66 class66 = arg1.aClass66_6474;
	    if (class66.anIntArray845 != null) {
		class66 = class66.method697(true);
		if (class66 == null)
		    return -1;
	    }
	    int i = class66.anInt884;
	    Class72 class72 = arg1.method344(124);
	    int i_9_ = 106 / ((arg0 - -29) / 43);
	    if (arg1.aBoolean5261)
		i = class66.anInt876;
	    else if ((class72.anInt976 ^ 0xffffffff) != (arg1.anInt5254
							 ^ 0xffffffff)
		     && class72.anInt960 != arg1.anInt5254
		     && class72.anInt957 != arg1.anInt5254
		     && arg1.anInt5254 != class72.anInt985) {
		if (arg1.anInt5254 == class72.anInt974
		    || arg1.anInt5254 == class72.anInt987
		    || arg1.anInt5254 == class72.anInt977
		    || (class72.anInt986 ^ 0xffffffff) == (arg1.anInt5254
							   ^ 0xffffffff))
		    i = class66.anInt842;
	    } else
		i = class66.anInt871;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2826(int arg0, int arg1, int arg2, Class arg3) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 != null) {
	    for (Class82 class82 = class147.aClass82_1958; class82 != null;
		 class82 = class82.aClass82_1086) {
		Class23_Sub4 class23_sub4 = class82.aClass23_Sub4_1080;
		if (arg3.isAssignableFrom(class23_sub4.getClass())
		    && class23_sub4.aShort3745 == arg1
		    && class23_sub4.aShort3737 == arg2) {
		    Class190.method2610(class23_sub4);
		    break;
		}
	    }
	}
    }
    
    public void method2827(byte[] arg0, int arg1) {
	anInt3228++;
	Stream stream
	    = new Stream(Class23_Sub4_Sub3.method377(arg0,
							     (byte) -91));
	int i = stream.readUnsignedByte(arg1 ^ ~0x1a);
	if ((i ^ 0xffffffff) != -6 && i != 6)
	    throw new RuntimeException();
	if ((i ^ 0xffffffff) > -7)
	    anInt3218 = 0;
	else
	    anInt3218 = stream.readUnsignedInt(arg1 ^ ~0x1);
	int i_10_ = stream.readUnsignedByte(-84);
	anInt3224 = stream.readUnsignedShort(8104);
	int i_11_ = 0;
	anIntArray3221 = new int[anInt3224];
	int i_12_ = -1;
	for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (anInt3224 ^ 0xffffffff);
	     i_13_++) {
	    anIntArray3221[i_13_] = i_11_
		+= stream
		       .readUnsignedShort(Class23_Sub4_Sub5.method390(arg1, 8104));
	    if (anIntArray3221[i_13_] > i_12_)
		i_12_ = anIntArray3221[i_13_];
	}
	anInt3213 = 1 + i_12_;
	anIntArray3232 = new int[anInt3213];
	anIntArray3227 = new int[anInt3213];
	anIntArrayArray3219 = new int[anInt3213][];
	anIntArray3209 = new int[anInt3213];
	anIntArray3223 = new int[anInt3213];
	if ((i_10_ ^ 0xffffffff) != -1) {
	    anIntArray3211 = new int[anInt3213];
	    for (int i_14_ = 0;
		 (anInt3213 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
		anIntArray3211[i_14_] = -1;
	    for (int i_15_ = 0;
		 (i_15_ ^ 0xffffffff) > (anInt3224 ^ 0xffffffff); i_15_++)
		anIntArray3211[anIntArray3221[i_15_]]
		    = stream.readUnsignedInt(-2);
	    aLogin_3225 = new Login(anIntArray3211);
	}
	for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (anInt3224 ^ 0xffffffff);
	     i_16_++)
	    anIntArray3232[anIntArray3221[i_16_]]
		= stream.readUnsignedInt(-2);
	for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (anInt3224 ^ 0xffffffff);
	     i_17_++)
	    anIntArray3227[anIntArray3221[i_17_]]
		= stream.readUnsignedInt(-2);
	for (int i_18_ = 0; i_18_ < anInt3224; i_18_++)
	    anIntArray3223[anIntArray3221[i_18_]]
		= stream.readUnsignedShort(8104);
	for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (anInt3224 ^ 0xffffffff);
	     i_19_++) {
	    int i_20_ = anIntArray3221[i_19_];
	    int i_21_ = anIntArray3223[i_20_];
	    i_11_ = 0;
	    anIntArrayArray3219[i_20_] = new int[i_21_];
	    int i_22_ = -1;
	    for (int i_23_ = 0; (i_21_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
		 i_23_++) {
		int i_24_ = (anIntArrayArray3219[i_20_][i_23_] = i_11_
			     += stream.readUnsignedShort(8104));
		if (i_24_ > i_22_)
		    i_22_ = i_24_;
	    }
	    anIntArray3209[i_20_] = i_22_ + 1;
	    if (i_22_ + 1 == i_21_)
		anIntArrayArray3219[i_20_] = null;
	}
	if (i_10_ != arg1) {
	    anIntArrayArray3214 = new int[i_12_ + 1][];
	    aLoginArray3215 = new Login[i_12_ - -1];
	    for (int i_25_ = 0; i_25_ < anInt3224; i_25_++) {
		int i_26_ = anIntArray3221[i_25_];
		int i_27_ = anIntArray3223[i_26_];
		anIntArrayArray3214[i_26_] = new int[anIntArray3209[i_26_]];
		for (int i_28_ = 0; ((anIntArray3209[i_26_] ^ 0xffffffff)
				     < (i_28_ ^ 0xffffffff)); i_28_++)
		    anIntArrayArray3214[i_26_][i_28_] = -1;
		for (int i_29_ = 0; i_27_ > i_29_; i_29_++) {
		    int i_30_;
		    if (anIntArrayArray3219[i_26_] != null)
			i_30_ = anIntArrayArray3219[i_26_][i_29_];
		    else
			i_30_ = i_29_;
		    anIntArrayArray3214[i_26_][i_30_]
			= stream.readUnsignedInt(Class23_Sub4_Sub5
							.method390(arg1, -2));
		}
		aLoginArray3215[i_26_]
		    = new Login(anIntArrayArray3214[i_26_]);
	    }
	}
    }
    
    public static void method2828(byte arg0, boolean arg1) {
	try {
	    anInt3222++;
	    byte[][] is;
	    if (!arg1)
		is = Class88.aByteArrayArray1146;
	    else
		is = Class212.aByteArrayArray3115;
	    if (arg0 != -93)
		method2826(26, -98, 88, null);
	    int i = Class60.aByteArrayArray788.length;
	    for (int i_31_ = 0; i_31_ < i; i_31_++) {
		byte[] is_32_ = is[i_31_];
		if (is_32_ != null) {
		    int i_33_
			= ((Class74.anIntArray1003[i_31_] >> -986814840) * 64
			   + -Class92.regionX);
		    int i_34_ = (64 * (0xff & Class74.anIntArray1003[i_31_])
				 - Class64.regionY);
		    Class43.method522(-58);
		    Class151.method2197(is_32_, arg1, -53, i_34_,
					Class183_Sub1.aClass130_4960, i_33_,
					Class131_Sub2_Sub9.aClass19Array5682);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2829(int arg0) {
	try {
	    if (arg0 != -1)
		method2823(-116, null);
	    aClass214_3212 = null;
	    aString3210 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wo.F(" + arg0 + ')');
	}
    }
    
    public static void method2830(int arg0, int arg1, byte arg2, int arg3,
				  int arg4) {
	try {
	    anInt3226++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(4, arg3, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    if (arg2 == 67) {
		class131_sub41_sub6.anInt6236 = arg0;
		class131_sub41_sub6.anInt6234 = arg4;
		class131_sub41_sub6.anInt6244 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public Class220(byte[] arg0, int arg1) {
	try {
	    anInt3216
		= Class121_Sub3.method1055(arg0.length, arg0, (byte) 123);
	    if (arg1 != anInt3216)
		throw new RuntimeException();
	    method2827(arg0, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wo.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
}
