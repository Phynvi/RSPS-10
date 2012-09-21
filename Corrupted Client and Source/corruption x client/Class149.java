/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class149
{
    public static float aFloat1985;
    public static int anInt1986;
    public static int anInt1987;
    public static int anInt1988 = 0;
    public static int anInt1989;
    public static int anInt1990;
    public static int anInt1991;
    
    public static void method2181(byte arg0) {
	try {
	    if (arg0 != -117)
		method2182(-71);
	    anInt1991++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(15, 0, (byte) 1);
	    class131_sub41_sub6.method1959(arg0 ^ 0x29);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"po.D(" + arg0 + ')');
	}
    }
    
    public static void method2182(int arg0) {
	anInt1990++;
	if (Class144.method2155(14848)) {
	    if (Class131_Sub41_Sub7.aStringArray6253 == null)
		Class23_Sub4_Sub3.method378(500);
	    Class197.aBooleanArray2880 = new boolean[100];
	    Class23_Sub2_Sub2.anIntArray5167 = new int[100];
	    Class131_Sub30.anIntArray4517 = new int[100];
	    Class131_Sub2_Sub27.aBoolean5940 = true;
	    Class84.anInt1101 = 0;
	    Class131_Sub2_Sub1.anIntArray5571 = new int[100];
	    for (int i = 0; i < 100; i++) {
		Class131_Sub30.anIntArray4517[i]
		    = (int) (Math.random()
			     * (double) Class131_Sub1_Sub1.anInt5499);
		Class23_Sub2_Sub2.anIntArray5167[i]
		    = (int) (Math.random() * 350.0);
		Class131_Sub2_Sub1.anIntArray5571[i]
		    = (int) (Math.random() * 102.0);
		Class197.aBooleanArray2880[i] = Math.random() < 0.5;
	    }
	    try {
		Class1_Sub2.aClipboard3498
		    = Class131_Sub2_Sub39.aClient6084.getToolkit()
			  .getSystemClipboard();
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (arg0 != 100)
	    method2183(-85);
    }
    
    public static void method2183(int arg0) {
	anInt1989++;
	int i = 0;
	if (Class167.aBoolean2235) {
	    i |= 0x1;
	    i |= 0x10;
	    i |= 0x20;
	    i |= 0x2;
	    i |= 0x4;
	}
	Class23_Sub4_Sub1_Sub1.method352(-1, i);
	Class2.method141((byte) -120, i);
	Class35.method463(-4, i);
	Class159.method2378(i, 2);
	Class110_Sub4.method949(true, i);
	if (arg0 > 42) {
	    Class131_Sub41_Sub9.method1986((byte) 112, i);
	    Class1_Sub7_Sub1.method130(-1, i);
	    Class88.method823(i, (byte) -64);
	    Class125.method1099((byte) 103, i);
	    if ((Class133.anInt1803 ^ 0xffffffff) == -11)
		Class175.method2484(28, (byte) 11);
	    else if (Class133.anInt1803 == 30)
		Class175.method2484(25, (byte) 24);
	}
    }
    
    public static void method2184(int arg0) {
	try {
	    if (arg0 != 21712)
		method2182(34);
	    Class156.aClass214_2070.method2775((byte) 56);
	    anInt1986++;
	    Class100.aClass214_1317.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"po.A(" + arg0 + ')');
	}
    }
    
    public static void method2185(int arg0, boolean arg1, boolean arg2) {
	if (arg1) {
	    Class116.anInt1509++;
	    Class29.method419(1086676003);
	}
	anInt1987++;
	if (arg0 >= -31)
	    anInt1988 = -82;
	if (arg2) {
	    Class18.anInt189++;
	    Class131_Sub41_Sub17_Sub1.method2049(256);
	}
    }
}
