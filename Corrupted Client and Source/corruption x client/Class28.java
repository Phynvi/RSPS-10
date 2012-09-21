/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class28 implements KeyListener, FocusListener
{
    public static int anInt274;
    public static int anInt275;
    public static int anInt276 = 0;
    public static int anInt277;
    public static int anInt278;
    public static int anInt279;
    public static int anInt280;
    public static int anInt281;
    public static Class84[] aClass84Array282;
    public static Class158 aClass158_283;
    public static int anInt284;
    public static int anInt285;
    public static String aString286;
    public static boolean aBoolean287 = false;
    public static Class158 aClass158_288;
    public static int anInt289;
    
    public static void method411(byte arg0) {
	try {
	    anInt278++;
	    synchronized (Class131_Sub14.aClass214_4278) {
		Class131_Sub14.aClass214_4278.method2783(arg0 ^ 0x47);
		if (arg0 != -43)
		    anInt275 = -14;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cn.A(" + arg0 + ')');
	}
    }
    
    public void keyTyped(KeyEvent arg0) {
	try {
	    if (Class131_Sub2_Sub35.aClass28_6038 != null) {
		char c = arg0.getKeyChar();
		if ((c ^ 0xffffffff) != -1 && (c ^ 0xffffffff) != -65536
		    && Class34.method457((byte) 34, c)) {
		    int i = 1 + anInt276 & 0x7f;
		    if (Class204.anInt2979 != i) {
			Class131_Sub2_Sub4.anIntArray5595[anInt276] = -1;
			Class148.aCharArray1975[anInt276] = c;
			anInt276 = i;
		    }
		}
	    }
	    anInt274++;
	    arg0.consume();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.keyTyped("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class57 method412(byte arg0, int arg1) {
	try {
	    anInt279++;
	    Class57 class57;
	    synchronized (Class23_Sub4_Sub2.aClass214_5366) {
		class57 = (Class57) Class23_Sub4_Sub2.aClass214_5366
					.method2780(arg0 + 208, (long) arg1);
	    }
	    if (class57 != null)
		return class57;
	    byte[] is = Class219.aClass158_3207.method2364(arg1, 16, 0);
	    class57 = new Class57();
	    if (arg0 != -87)
		method414(-7, -23, 6, 92, 29, -88, 74, false, -15, 39);
	    if (is != null)
		class57.method634((byte) 126, new Stream(is));
	    synchronized (Class23_Sub4_Sub2.aClass214_5366) {
		Class23_Sub4_Sub2.aClass214_5366.method2773(true, class57,
							    (long) arg1);
	    }
	    return class57;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method413(boolean arg0) {
	try {
	    aString286 = null;
	    aClass84Array282 = null;
	    if (arg0 != false)
		method412((byte) -17, 63);
	    aClass158_288 = null;
	    aClass158_283 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cn.D(" + arg0 + ')');
	}
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	try {
	    if (Class131_Sub2_Sub35.aClass28_6038 != null)
		Class23_Sub2_Sub1.anInt4989 = -1;
	    anInt277++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.focusLost("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method414(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, boolean arg7,
				 int arg8, int arg9) {
	try {
	    if (arg7 != false)
		method412((byte) -93, 40);
	    if (arg4 < Class149.anInt1988 || arg4 > Class115.anInt1477
		|| (arg9 ^ 0xffffffff) > (Class149.anInt1988 ^ 0xffffffff)
		|| (arg9 ^ 0xffffffff) < (Class115.anInt1477 ^ 0xffffffff)
		|| arg3 < Class149.anInt1988
		|| (arg3 ^ 0xffffffff) < (Class115.anInt1477 ^ 0xffffffff)
		|| (arg6 ^ 0xffffffff) > (Class149.anInt1988 ^ 0xffffffff)
		|| arg6 > Class115.anInt1477 || arg5 < Class116.anInt1494
		|| arg5 > Class125.anInt1629
		|| (Class116.anInt1494 ^ 0xffffffff) < (arg1 ^ 0xffffffff)
		|| Class125.anInt1629 < arg1 || Class116.anInt1494 > arg2
		|| (arg2 ^ 0xffffffff) < (Class125.anInt1629 ^ 0xffffffff)
		|| Class116.anInt1494 > arg8 || Class125.anInt1629 < arg8)
		Class131_Sub35.method1876(arg1, arg4, arg5, arg8, arg6, arg9,
					  (byte) 111, arg2, arg0, arg3);
	    else
		Class215.method2791(arg3, arg0, arg5, arg1, arg2, arg4, arg7,
				    arg6, arg9, arg8);
	    anInt285++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public synchronized void keyPressed(KeyEvent arg0) {
	anInt281++;
	if (Class131_Sub2_Sub35.aClass28_6038 != null) {
	    Class131_Sub42.anInt4692 = 0;
	    int i = arg0.getKeyCode();
	    if (i < 0 || Class131_Sub2_Sub27.anIntArray5953.length <= i)
		i = -1;
	    else {
		i = Class131_Sub2_Sub27.anIntArray5953[i];
		if ((0x80 & i) != 0)
		    i = -1;
	    }
	    if (Class23_Sub2_Sub1.anInt4989 >= 0 && (i ^ 0xffffffff) <= -1) {
		Class12.anIntArray132[Class23_Sub2_Sub1.anInt4989] = i;
		Class23_Sub2_Sub1.anInt4989
		    = 1 + Class23_Sub2_Sub1.anInt4989 & 0x7f;
		if ((Class23_Sub2_Sub1.anInt4989 ^ 0xffffffff)
		    == (Class131_Sub2_Sub1.anInt5555 ^ 0xffffffff))
		    Class23_Sub2_Sub1.anInt4989 = -1;
	    }
	    if (i >= 0) {
		int i_0_ = anInt276 + 1 & 0x7f;
		if (i_0_ != Class204.anInt2979) {
		    Class131_Sub2_Sub4.anIntArray5595[anInt276] = i;
		    Class148.aCharArray1975[anInt276] = '\0';
		    anInt276 = i_0_;
		}
	    }
	    int i_1_ = arg0.getModifiers();
	    if ((i_1_ & 0xa ^ 0xffffffff) != -1 || i == 85 || i == 10)
		arg0.consume();
	}
    }
    
    public synchronized void keyReleased(KeyEvent arg0) {
	try {
	    if (Class131_Sub2_Sub35.aClass28_6038 != null) {
		Class131_Sub42.anInt4692 = 0;
		int i = arg0.getKeyCode();
		if (i >= 0 && (Class131_Sub2_Sub27.anIntArray5953.length
			       ^ 0xffffffff) < (i ^ 0xffffffff))
		    i = Class131_Sub2_Sub27.anIntArray5953[i] & ~0x80;
		else
		    i = -1;
		if (Class23_Sub2_Sub1.anInt4989 >= 0 && i >= 0) {
		    Class12.anIntArray132[Class23_Sub2_Sub1.anInt4989]
			= i ^ 0xffffffff;
		    Class23_Sub2_Sub1.anInt4989
			= 1 + Class23_Sub2_Sub1.anInt4989 & 0x7f;
		    if (Class23_Sub2_Sub1.anInt4989
			== Class131_Sub2_Sub1.anInt5555)
			Class23_Sub2_Sub1.anInt4989 = -1;
		}
	    }
	    anInt284++;
	    arg0.consume();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.keyReleased("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt280++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cn.focusGained("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	anInt275 = 0;
	aString286 = "Allocating memory";
    }
}
