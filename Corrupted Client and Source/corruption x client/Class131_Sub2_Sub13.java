/* Class131_Sub2_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub13 extends Class131_Sub2
{
    public static int[] anIntArray5735;
    public static int anInt5736;
    public static int anInt5737;
    public static boolean aBoolean5738;
    public static String aString5739 = "glow1:";
    public static int anInt5740;
    public static int anInt5741;
    public static int anInt5742;
    public static int anInt5743;
    public int anInt5744 = 585;
    
    public static int method1532(int arg0, int arg1) {
	try {
	    anInt5743++;
	    if (arg0 != 3676)
		aString5739 = null;
	    return arg1 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fc.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1533(int arg0, Class158 arg1, Class158 arg2) {
	try {
	    Class131_Sub41_Sub15.aClass158_6360 = arg2;
	    anInt5737++;
	    Class214.aClass158_3131 = arg1;
	    Class131_Sub41_Sub15.aClass158_6360.method2368(arg0, (byte) -72);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fc.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1534(int arg0, Class23_Sub4_Sub1_Sub1 arg1,
				  int arg2, int arg3) {
	try {
	    if (arg1.anInt5247 != arg2 || (arg2 ^ 0xffffffff) == 0) {
		if ((arg2 ^ 0xffffffff) == 0
		    || (arg1.anInt5247 ^ 0xffffffff) == 0
		    || ((Class145.method2159(arg2, (byte) -110).anInt2142
			 ^ 0xffffffff)
			<= ((Class145.method2159(arg1.anInt5247, (byte) -87)
			     .anInt2142)
			    ^ 0xffffffff))) {
		    arg1.anInt5256 = arg3;
		    arg1.anInt5247 = arg2;
		    arg1.anInt5330 = arg1.anInt5334;
		    arg1.anInt5307 = 0;
		    arg1.anInt5258 = 1;
		    arg1.anInt5237 = 0;
		    arg1.anInt5248 = 0;
		    if (arg1.anInt5247 != -1)
			Login.method1153(arg1.anInt3733, 21155, false,
					    arg1.anInt5248, arg1.anInt3747,
					    Class145.method2159(arg1.anInt5247,
								(byte) -99));
		}
	    } else {
		Class161 class161 = Class145.method2159(arg2, (byte) -98);
		int i = class161.anInt2155;
		if (i == 1) {
		    arg1.anInt5307 = 0;
		    arg1.anInt5258 = 1;
		    arg1.anInt5256 = arg3;
		    arg1.anInt5237 = 0;
		    arg1.anInt5248 = 0;
		    Login.method1153(arg1.anInt3733, 21155, false,
					arg1.anInt5248, arg1.anInt3747,
					class161);
		}
		if (i == 2)
		    arg1.anInt5307 = 0;
	    }
	    if (arg0 != 0)
		aBoolean5738 = false;
	    anInt5740++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fc.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	if (arg1 != -49)
	    anIntArray5735 = null;
	anInt5736++;
	int i = arg0;
	if ((i ^ 0xffffffff) == -1)
	    anInt5744 = arg2.readUnsignedShort(8104);
    }
    
    public static void method1535(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    if (Class23_Sub4_Sub2.anInt5380 != arg0
		&& (arg4 ^ 0xffffffff) != -1 && Class57.anInt746 < 50
		&& arg3 != -1) {
		Class154.anIntArray2056[Class57.anInt746] = arg3;
		Class69.anIntArray928[Class57.anInt746] = arg4;
		Class119.anIntArray1556[Class57.anInt746] = arg2;
		Class23_Sub3.aClass16Array3723[Class57.anInt746] = null;
		InputStream_Sub1.anIntArray58[Class57.anInt746] = 0;
		Class46_Sub1.anIntArray3805[Class57.anInt746] = arg1;
		Class57.anInt746++;
	    }
	    anInt5742++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fc.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public Class131_Sub2_Sub13() {
	super(0, true);
    }
    
    public static void method1536(byte arg0) {
	aString5739 = null;
	anIntArray5735 = null;
	if (arg0 != -79)
	    method1532(-40, -1);
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5741++;
	    if (arg0 != -11543)
		return null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 92);
	    if (aClass200_4087.aBoolean2927) {
		int i = Class1_Sub7_Sub1.anIntArray5206[arg1];
		for (int i_0_ = 0; Class131_Sub2_Sub7.anInt5637 > i_0_;
		     i_0_++) {
		    int i_1_ = Class1_Sub4.anIntArray3551[i_0_];
		    if (anInt5744 < i_1_ && 4096 - anInt5744 > i_1_
			&& (i ^ 0xffffffff) < (2048 + -anInt5744 ^ 0xffffffff)
			&& anInt5744 + 2048 > i) {
			int i_2_ = 2048 - i_1_;
			i_2_ = i_2_ < 0 ? -i_2_ : i_2_;
			i_2_ <<= 12;
			i_2_ /= -anInt5744 + 2048;
			is[i_0_] = -i_2_ + 4096;
		    } else if ((i_1_ ^ 0xffffffff) < (2048 - anInt5744
						      ^ 0xffffffff)
			       && 2048 - -anInt5744 > i_1_) {
			int i_3_ = i - 2048;
			i_3_ = i_3_ >= 0 ? i_3_ : -i_3_;
			i_3_ -= anInt5744;
			i_3_ <<= 12;
			is[i_0_] = i_3_ / (2048 - anInt5744);
		    } else if (anInt5744 > i
			       || ((-anInt5744 + 4096 ^ 0xffffffff)
				   > (i ^ 0xffffffff))) {
			int i_4_ = -2048 + i_1_;
			i_4_ = i_4_ < 0 ? -i_4_ : i_4_;
			i_4_ -= anInt5744;
			i_4_ <<= 12;
			is[i_0_] = i_4_ / (-anInt5744 + 2048);
		    } else if ((i_1_ ^ 0xffffffff) > (anInt5744 ^ 0xffffffff)
			       || -anInt5744 + 4096 < i_1_) {
			int i_5_ = -i + 2048;
			i_5_ = i_5_ >= 0 ? i_5_ : -i_5_;
			i_5_ <<= 12;
			i_5_ /= -anInt5744 + 2048;
			is[i_0_] = 4096 + -i_5_;
		    } else
			is[i_0_] = 0;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fc.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	anIntArray5735 = new int[2500];
    }
}
