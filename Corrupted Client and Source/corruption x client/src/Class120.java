/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class120
{
    public volatile int anInt1571;
    public byte[] aByteArray1572;
    public volatile int anInt1573 = 0;
    public int anInt1574;
    public static int anInt1575 = 0;
    public float[] aFloatArray1576;
    public static String aString1577
	= "Your ignore list is full. Max of 100 users.";
    public static float aFloat1578;
    public static boolean aBoolean1579 = false;
    public int anInt1580;
    public static int anInt1581;
    public static Class152 aClass152_1582;
    public Object[] anObjectArray1583;
    
    public abstract void method1020(Class147 class147, byte i);
    
    public abstract void method1021(int i, byte i_0_);
    
    public abstract void method1022(int i, byte i_1_);
    
    public static void method1023(int arg0) {
	do {
	    try {
		aClass152_1582 = null;
		aString1577 = null;
		if (arg0 > 58)
		    break;
		anInt1581 = -48;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "mj.N(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public abstract void method1024(Class68 class68, float f, boolean bool,
				    int i, byte i_2_);
    
    public abstract void method1025(int i, Class147 class147);
    
    public abstract void method1026(byte i, Class147 class147);
    
    public abstract void method1027(int i);
    
    public abstract void method1028(int i);
    
    public Class120() {
	aByteArray1572 = new byte[5000];
	anInt1571 = 0;
	aFloatArray1576 = new float[5000];
	anInt1574 = 0;
	anInt1580 = 0;
	anObjectArray1583 = new Object[5000];
    }
    
    static {
	aFloat1578 = 0.0F;
    }
}
