/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89 implements Interface1
{
    public static int anInt3248;
    public boolean aBoolean3249;
    public int anInt3250;
    public static int anInt3251;
    public int anInt3252;
    public int anInt3253;
    public static int anInt3254;
    public static String[] aStringArray3255 = new String[100];
    public int anInt3256;
    public static int anInt3257;
    public static int anInt3258;
    public static Class55 aClass55_3259;
    public static int anInt3260;
    public static Class158 aClass158_3261;
    public static int anInt3262;
    public static int anInt3263;
    public int anInt3264;
    public int anInt3265;
    public static int anInt3266;
    public static String[] aStringArray3267;
    public static int anInt3268;
    
    public static void method835(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt3254++;
	    int i = arg5 + -334;
	    if ((i ^ 0xffffffff) <= -1) {
		if ((i ^ 0xffffffff) < -101)
		    i = 100;
	    } else
		i = 0;
	    int i_0_ = (i * (-Class131_Sub2_Sub14.aShort5750
			     + Class204.aShort2977) / 100
			+ Class131_Sub2_Sub14.aShort5750);
	    arg2 = arg2 * i_0_ >> -614315512;
	    int i_1_ = 16384 - arg3 & 0x3fff;
	    int i_2_ = -arg4 + 16384 & 0x3fff;
	    int i_3_ = 0;
	    int i_4_ = arg0;
	    int i_5_ = arg2;
	    if ((i_1_ ^ 0xffffffff) != -1) {
		i_4_ = -i_5_ * Class31.anIntArray434[i_1_] >> 1202361935;
		i_5_ = i_5_ * Class31.anIntArray425[i_1_] >> -2049489137;
	    }
	    if ((i_2_ ^ 0xffffffff) != -1) {
		i_3_ = i_5_ * Class31.anIntArray434[i_2_] >> -2025526769;
		i_5_ = Class31.anIntArray425[i_2_] * i_5_ >> -686993489;
	    }
	    Class57.anInt753 = arg6 + -i_5_;
	    Class2.anInt84 = arg7 - i_3_;
	    Class131_Sub41_Sub4.anInt6213 = arg4;
	    Class87.anInt1140 = arg1 + -i_4_;
	    Stream.anInt4323 = arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jg.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static void method836(byte arg0) {
	aStringArray3267 = null;
	aClass55_3259 = null;
	aStringArray3255 = null;
	aClass158_3261 = null;
	if (arg0 < 75)
	    aClass158_3261 = null;
    }
    
    public static void method837(String arg0, boolean arg1) {
	anInt3251++;
	System.out.println
	    ("Bad " + arg0
	     + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
	System.exit(1);
	if (arg1 != false)
	    method838(-90, null, false);
    }
    
    public static void method838(int arg0, Class173 arg1, boolean arg2) {
	anInt3262++;
	int i = ((arg1.anInt2444 ^ 0xffffffff) == -1 ? arg1.anInt2411
		 : arg1.anInt2444);
	int i_6_ = ((arg1.anInt2479 ^ 0xffffffff) == -1 ? arg1.anInt2437
		    : arg1.anInt2479);
	Class171.method2443(arg2,
			    (Class131_Sub2_Sub9.aClass173ArrayArray5684
			     [arg1.anInt2455 >> -1035566544]),
			    -31, i, i_6_, arg1.anInt2455);
	if (arg1.aClass173Array2326 != null)
	    Class171.method2443(arg2, arg1.aClass173Array2326, -53, i, i_6_,
				arg1.anInt2455);
	Class131_Sub33 class131_sub33
	    = ((Class131_Sub33)
	       Class83.aClass180_1096.method2521(126, (long) arg1.anInt2455));
	if (arg0 < 64)
	    method839(34, -82);
	if (class131_sub33 != null)
	    Class56.method626(i, i_6_, arg2, class131_sub33.anInt4556,
			      (byte) 120);
    }
    
    public boolean method2(Interface1 arg0, int arg1) {
	try {
	    anInt3263++;
	    if (!(arg0 instanceof Class89))
		return false;
	    Class89 class89 = (Class89) arg0;
	    if ((anInt3253 ^ 0xffffffff) != (class89.anInt3253 ^ 0xffffffff))
		return false;
	    if ((anInt3252 ^ 0xffffffff) != (class89.anInt3252 ^ 0xffffffff))
		return false;
	    if (arg1 > -106)
		method838(41, null, true);
	    if (class89.anInt3250 != anInt3250)
		return false;
	    if ((anInt3265 ^ 0xffffffff) != (class89.anInt3265 ^ 0xffffffff))
		return false;
	    if ((class89.anInt3256 ^ 0xffffffff) != (anInt3256 ^ 0xffffffff))
		return false;
	    if (class89.anInt3264 != anInt3264)
		return false;
	    if (class89.aBoolean3249 != aBoolean3249)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jg.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method839(int arg0, int arg1) {
	try {
	    anInt3257++;
	    int i = arg0 & 0x3f;
	    if (arg1 > -94)
		aClass158_3261 = null;
	    int i_7_ = (arg0 & 0xd9) >> -1838671834;
	    if ((i ^ 0xffffffff) == -19) {
		if ((i_7_ ^ 0xffffffff) == -1)
		    return 1;
		if (i_7_ == 1)
		    return 2;
		if ((i_7_ ^ 0xffffffff) == -3)
		    return 4;
		if (i_7_ == 3)
		    return 8;
	    } else if (i == 19 || i == 21) {
		if (i_7_ == 0)
		    return 16;
		if (i_7_ == 1)
		    return 32;
		if (i_7_ == 2)
		    return 64;
		if ((i_7_ ^ 0xffffffff) == -4)
		    return 128;
	    }
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jg.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public long method1(int arg0) {
	try {
	    anInt3260++;
	    long[] ls = Class23_Sub5.aLongArray3760;
	    long l = -1L;
	    l = l >>> 1471269128 ^ ls[(int) (((long) anInt3253 ^ l) & 0xffL)];
	    l = (ls[(int) ((l ^ (long) (anInt3252 >> -2042816280)) & 0xffL)]
		 ^ l >>> -57169720);
	    l = l >>> 428385032 ^ ls[(int) (((long) anInt3252 ^ l) & 0xffL)];
	    l = (l >>> 1170529992
		 ^ ls[(int) (0xffL & ((long) (anInt3250 >> 1736697592) ^ l))]);
	    l = (ls[(int) (0xffL & (l ^ (long) (anInt3250 >> 762741392)))]
		 ^ l >>> -1350101176);
	    l = l >>> 1936346696 ^ ls[(int) (0xffL
					     & (l ^ (long) (anInt3250
							    >> -1346653304)))];
	    l = ls[(int) ((l ^ (long) anInt3250) & 0xffL)] ^ l >>> -1772134328;
	    l = l >>> -1300819768 ^ ls[(int) (0xffL & (l ^ (long) anInt3265))];
	    l = (ls[(int) ((l ^ (long) (anInt3256 >> 1511074936)) & 0xffL)]
		 ^ l >>> -903358904);
	    l = (l >>> 1086658440
		 ^ ls[(int) (((long) (anInt3256 >> -797534256) ^ l) & 0xffL)]);
	    l = (ls[(int) (0xffL & (l ^ (long) (anInt3256 >> 953116104)))]
		 ^ l >>> -1831400312);
	    l = l >>> 1041659208 ^ ls[(int) (0xffL & (l ^ (long) anInt3256))];
	    l = ls[(int) (((long) anInt3264 ^ l) & 0xffL)] ^ l >>> 1968644232;
	    l = (ls[(int) (0xffL & ((long) (!aBoolean3249 ? 0 : 1) ^ l))]
		 ^ l >>> 611554632);
	    if (arg0 != 21209)
		anInt3250 = 39;
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jg.E(" + arg0 + ')');
	}
    }
    
    public static void method840(int arg0) {
	try {
	    Class147.anInt1946 = 0;
	    anInt3266++;
	    Class66.aClass119_843.method1012(0);
	    if (arg0 <= -114)
		Class131_Sub2_Sub24.aBoolean5890 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jg.G(" + arg0 + ')');
	}
    }
    
    static {
	anInt3248 = 0;
	anInt3258 = 0;
	aStringArray3267 = new String[200];
    }
}
