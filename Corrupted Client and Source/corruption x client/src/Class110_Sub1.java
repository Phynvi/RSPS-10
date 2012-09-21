/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class110_Sub1 extends Class110
{
    public static int anInt3889;
    public static int anInt3890;
    public static int anInt3891;
    public static int anInt3892;
    public int anInt3893;
    public static String aString3894 = " has logged in.";
    public int anInt3895;
    public static int anInt3896;
    public static int anInt3897;
    public int anInt3898;
    public static int[] anIntArray3899;
    public static int[] anIntArray3900;
    public int anInt3901;
    public static int anInt3902;
    public static int anInt3903;
    
    public void method934(int arg0, int arg1, byte arg2) {
	try {
	    anInt3891++;
	    int i = anInt3898 * arg1 >> 2065163148;
	    int i_0_ = anInt3895 * arg1 >> 70769868;
	    if (arg2 == 75) {
		int i_1_ = arg0 * anInt3893 >> -1694431316;
		int i_2_ = arg0 * anInt3901 >> -1799218836;
		Class82.method797(i, i_1_, anInt1432, 1, i_0_, i_2_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jo.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method940(Class23_Sub4_Sub1 arg0, int arg1) {
	if (arg1 <= -82) {
	    anInt3902++;
	    int i = arg0.anInt5306 + -Class125.anInt1632;
	    int i_3_
		= arg0.anInt5281 * 128 - -(arg0.method335((byte) -116) * 64);
	    int i_4_ = arg0.anInt5249 * 128 + 64 * arg0.method335((byte) -98);
	    arg0.anInt5321 = 0;
	    arg0.anInt3747 += (-arg0.anInt3747 + i_4_) / i;
	    arg0.anInt3733 += (i_3_ - arg0.anInt3733) / i;
	    if ((arg0.anInt5267 ^ 0xffffffff) == -1)
		arg0.method347(-1408718297, 8192);
	    if (arg0.anInt5267 == 1)
		arg0.method347(-1408718297, 12288);
	    if (arg0.anInt5267 == 2)
		arg0.method347(-1408718297, 0);
	    if ((arg0.anInt5267 ^ 0xffffffff) == -4)
		arg0.method347(-1408718297, 4096);
	}
    }
    
    public Class110_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	try {
	    anInt3901 = arg3;
	    anInt3893 = arg1;
	    anInt3895 = arg2;
	    anInt3898 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jo.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ')'));
	}
    }
    
    public static void method941(int arg0) {
	try {
	    synchronized (Class126.aClass201_1689) {
		Class147.anInt1949 = Class131_Sub41_Sub4.anInt6212;
		Class192.anInt2823++;
		Class144.anInt1914 = Class131_Sub2_Sub31.anInt6006;
		int i = 27 / ((arg0 - -42) / 59);
		Class23_Sub4_Sub3.anInt5005 = Class121_Sub1.anInt3982;
		Class131_Sub23.anInt4458 = client.anInt3467;
		Class207.anInt3022 = Class131_Sub2_Sub36.anInt6052;
		Class131_Sub11.anInt4246 = Class131_Sub18.anInt4389;
		PacketParser.aLong5871 = Class23_Sub2_Sub2.aLong5174;
		client.anInt3467 = 0;
	    }
	    anInt3889++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jo.H(" + arg0 + ')');
	}
    }
    
    public void method936(int arg0, boolean arg1, int arg2) {
	try {
	    anInt3897++;
	    int i = arg2 * anInt3898 >> -1999548436;
	    int i_5_ = anInt3895 * arg2 >> -1992668724;
	    int i_6_ = arg0 * anInt3893 >> -158850868;
	    int i_7_ = anInt3901 * arg0 >> 497497132;
	    Class137.method2116(i, i_5_, anInt1428, i_7_, arg1, i_6_,
				anInt1425);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jo.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method942(int arg0) {
	aString3894 = null;
	anIntArray3900 = null;
	anIntArray3899 = null;
	if (arg0 != 18161)
	    method942(8);
    }
    
    public void method938(int arg0, int arg1, int arg2) {
	try {
	    anInt3903++;
	    int i = arg0 * anInt3898 >> 1533783276;
	    int i_8_ = anInt3895 * arg0 >> 1575741484;
	    int i_9_ = arg1 * anInt3893 >> -1880731796;
	    int i_10_ = arg1 * anInt3901 >> -386286772;
	    if (arg2 != 0)
		method942(56);
	    Cryption.method2108(i_9_, anInt1425, i_8_, 256, anInt1432,
				anInt1428, i, i_10_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jo.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class46 method943(Canvas arg0, byte arg1) {
	try {
	    anInt3896++;
	    try {
		Class var_class = Class.forName("Class46_Sub2");
		Class46 class46 = (Class46) var_class.newInstance();
		int i = 4 / ((19 - arg1) / 59);
		class46.method569(arg0, 115);
		return class46;
	    } catch (Throwable throwable) {
		Class46_Sub1 class46_sub1 = new Class46_Sub1();
		class46_sub1.method569(arg0, -45);
		return class46_sub1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jo.I("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	anInt3890 = -1;
	anIntArray3900 = new int[4096];
	anIntArray3899 = new int[13];
    }
}
