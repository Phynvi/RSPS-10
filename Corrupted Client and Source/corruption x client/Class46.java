/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;

public abstract class Class46
{
    public int[] anIntArray630;
    public static int anInt631;
    public static int anInt632;
    public static int anInt633;
    public int anInt634;
    public static Class137 aClass137_635 = new Class137(64);
    public int anInt636;
    public static boolean[][] aBooleanArrayArray637;
    public static int[] anIntArray638 = { 32, 39, 44, 47 };
    public static String aString639;
    public static Class179 aClass179_640;
    
    public static boolean method565(boolean arg0, int arg1) {
	try {
	    anInt632++;
	    if (arg1 != 47)
		method567(87, false);
	    boolean bool = Class183_Sub1.aClass130_4960.method1175();
	    if (bool == !arg0) {
		if (arg0) {
		    if (!Class183_Sub1.aClass130_4960.method1216())
			arg0 = false;
		} else
		    Class183_Sub1.aClass130_4960.method1242();
		if (!bool == arg0) {
		    Class177.aBoolean2530 = arg0;
		    Class165.method2413(Class23_Sub4.aSignLink_3734,
					(byte) -7);
		    return true;
		}
		return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("e.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public abstract void method566(int i, int i_0_, int i_1_,
				   Graphics graphics);
    
    public static void method567(int arg0, boolean arg1) {
	try {
	    if (arg1 != false)
		aClass179_640 = null;
	    anInt633++;
	    Class131_Sub2_Sub17.aClass214_5811.method2786(0, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("e.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public abstract void method568(int i, int i_2_, byte i_3_,
				   Graphics graphics, int i_4_, int i_5_);
    
    public abstract void method569(Canvas canvas, int i);
    
    public static void method570(byte arg0) {
	try {
	    aString639 = null;
	    if (arg0 != 21)
		aBooleanArrayArray637 = null;
	    aClass179_640 = null;
	    aClass137_635 = null;
	    aBooleanArrayArray637 = null;
	    anIntArray638 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"e.D(" + arg0 + ')');
	}
    }
    
    public static void method571(byte arg0) {
	try {
	    anInt631++;
	    if (arg0 > -105)
		method567(-107, false);
	    Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106.method1368(false);
	    Class23_Sub4_Sub5.aClass158_5111 = null;
	    Class214.anInt3139 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"e.F(" + arg0 + ')');
	}
    }
    
    static {
	aBooleanArrayArray637
	    = new boolean[][] { { true, true, true, true, true, true, true,
				  true, true, true, true, true, true },
				{ true, true, true, false, false, false, true,
				  true, false, false, false, false, true },
				{ true, false, false, false, false, true, true,
				  true, false, false, false, false, false },
				{ false, false, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ true, true, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ true, true, true, false, false, true, true,
				  true, false, false, false, false, false },
				{ true, true, false, false, false, true, true,
				  true, false, false, false, false, true },
				{ true, true, false, false, false, false,
				  false, true, false, false, false, false,
				  false },
				{ false, true, true, true, true, true, true,
				  true, false, false, false, false, false },
				{ true, false, false, false, true, true, true,
				  true, true, true, false, false, false },
				{ true, true, true, true, true, false, false,
				  false, true, true, false, false, false },
				{ true, true, true, false, false, false, false,
				  false, false, false, true, true, false },
				new boolean[13],
				{ true, true, true, true, true, true, true,
				  true, true, true, true, true, true },
				new boolean[13] };
	aString639 = "rating: ";
    }
}
