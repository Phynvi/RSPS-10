/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public abstract class Class34
{
    public static int anInt484;
    public static Class175 aClass175_485;
    public static int anInt486;
    public static int anInt487;
    public static int anInt488;
    public static int anInt489 = 0;
    public static String aString490;
    public static Class50 aClass50_491;
    
    public abstract void method456(byte i, Component component);
    
    public static boolean method457(byte arg0, char arg1) {
	try {
	    if (arg0 != 34)
		method457((byte) 61, '\006');
	    anInt486++;
	    if (arg1 > 0 && (arg1 ^ 0xffffffff) > -129
		|| (arg1 ^ 0xffffffff) <= -161 && arg1 <= 255)
		return true;
	    if ((arg1 ^ 0xffffffff) != -1) {
		char[] cs = Class131_Sub41_Sub17.aCharArray6385;
		for (int i = 0; cs.length > i; i++) {
		    int i_0_ = cs[i];
		    if ((i_0_ ^ 0xffffffff) == (arg1 ^ 0xffffffff))
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dc.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method458(int arg0) {
	do {
	    try {
		aString490 = null;
		aClass50_491 = null;
		aClass175_485 = null;
		if (arg0 == -14600)
		    break;
		anInt489 = -110;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "dc.F(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public abstract void method459(int i, Component component);
    
    public abstract int method460(int i);
    
    public static void method461(int arg0) {
	try {
	    if (arg0 != 0)
		aString490 = null;
	    anInt484++;
	    if (!Class81.aBoolean1075) {
		Class209.aBoolean3053 = true;
		if (!Class131_Sub6.aBoolean4143)
		    Class131_Sub18.aFloat4378
			+= (-Class131_Sub18.aFloat4378 + -24.0F) / 2.0F;
		else
		    Class120.aFloat1578
			= (float) (~0x7f & -65 + (int) Class120.aFloat1578);
		Class81.aBoolean1075 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dc.C(" + arg0 + ')');
	}
    }
    
    public static Class131_Sub41_Sub10 method462(byte arg0, int arg1) {
	try {
	    anInt487++;
	    Class131_Sub41_Sub10 class131_sub41_sub10;
	    synchronized (Class131_Sub2_Sub10.aClass214_5693) {
		class131_sub41_sub10
		    = (Class131_Sub41_Sub10) Class131_Sub2_Sub10
						 .aClass214_5693
						 .method2780(126, (long) arg1);
		if (class131_sub41_sub10 == null) {
		    class131_sub41_sub10 = new Class131_Sub41_Sub10(arg1);
		    Class131_Sub2_Sub10.aClass214_5693
			.method2773(true, class131_sub41_sub10, (long) arg1);
		}
	    }
	    if (arg0 != -119)
		anInt489 = 82;
	    synchronized (class131_sub41_sub10) {
		if (!class131_sub41_sub10.method1996(arg0 + 120))
		    return null;
	    }
	    return class131_sub41_sub10;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dc.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aClass175_485 = new Class175();
	aString490 = "Loaded config";
	aClass50_491 = new Class50();
    }
}
