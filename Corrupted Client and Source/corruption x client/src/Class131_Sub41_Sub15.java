/* Class131_Sub41_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub15 extends Class131_Sub41
{
    public static int anInt6350;
    public static int anInt6351;
    public String aString6352;
    public Class180[] aClass180Array6353;
    public int anInt6354;
    public static int anInt6355;
    public int[] anIntArray6356;
    public static int anInt6357;
    public String[] aStringArray6358;
    public int anInt6359;
    public static Class158 aClass158_6360;
    public int anInt6361;
    public int anInt6362;
    public static Class152[] aClass152Array6363;
    public static int anInt6364 = 0;
    public static int anInt6365;
    public int anInt6366;
    public static int anInt6367;
    public static int anInt6368 = -50;
    public int[] anIntArray6369;
    
    public static Class131_Sub41_Sub4 method2033(int arg0, int arg1) {
	try {
	    anInt6365++;
	    Class131_Sub41_Sub4 class131_sub41_sub4
		= ((Class131_Sub41_Sub4)
		   Class88.aClass137_1147.method2111(-12, (long) arg1));
	    if (class131_sub41_sub4 != null)
		return class131_sub41_sub4;
	    if (arg0 != 23752)
		return null;
	    byte[] is;
	    if (arg1 >= 32768)
		is = Class77.aClass158_1040.method2364(0x7fff & arg1, 0, 0);
	    else
		is = Class131_Sub29.aClass158_4504.method2364(arg1, 0, 0);
	    class131_sub41_sub4 = new Class131_Sub41_Sub4();
	    if (is != null)
		class131_sub41_sub4.method1939(new Stream(is), -32);
	    if (arg1 >= 32768)
		class131_sub41_sub4.method1944((byte) 99);
	    Class88.aClass137_1147.method2110(class131_sub41_sub4, false,
					      (long) arg1);
	    return class131_sub41_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oo.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method2034(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt6357++;
	    if (arg0 != 32768)
		anInt6355 = -121;
	    int i = (65536 - Class31.anIntArray425[arg3 * 8192 / arg2]
		     >> 2015297217);
	    return ((i * arg4 >> -1810216976)
		    + ((65536 - i) * arg1 >> 550980944));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("oo.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2035(int arg0) {
	try {
	    if (arg0 == 0) {
		aClass158_6360 = null;
		aClass152Array6363 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"oo.A(" + arg0 + ')');
	}
    }
}
