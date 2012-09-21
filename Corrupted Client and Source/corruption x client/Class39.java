/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class39
{
    public static int anInt509;
    public int anInt510;
    public int anInt511;
    public static int anInt512;
    public int anInt513;
    public static Random aRandom514 = new Random();
    public int anInt515;
    public static int anInt516;
    
    public static Class1_Sub4 method501(int arg0) {
	try {
	    anInt512++;
	    if (arg0 < 12)
		return null;
	    Class1_Sub4 class1_sub4
		= (Class1_Sub4) Class100.aClass50_1322.method588((byte) -32);
	    if (class1_sub4 != null) {
		Class153_Sub2.anInt4773--;
		return class1_sub4;
	    }
	    return new Class1_Sub4();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dk.A(" + arg0 + ')');
	}
    }
    
    public static void method502(int arg0) {
	aRandom514 = null;
	if (arg0 <= 46)
	    method501(-73);
    }
    
    public static void method503(int arg0, byte arg1) {
	try {
	    anInt509++;
	    synchronized (Class23_Sub4_Sub2.aClass214_5366) {
		if (arg1 < 9)
		    anInt516 = 81;
		Class23_Sub4_Sub2.aClass214_5366.method2786(0, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dk.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
