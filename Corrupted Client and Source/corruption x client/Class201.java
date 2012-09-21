/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class201
    implements MouseListener, MouseMotionListener, FocusListener
{
    public static int anInt2928;
    public static int anInt2929;
    public static Class152[] aClass152Array2930;
    public static int anInt2931;
    public static int anInt2932;
    public static int anInt2933;
    public static Class150 aClass150_2934;
    public static int anInt2935;
    public static int anInt2936;
    public static int anInt2937;
    public static int anInt2938;
    public static int anInt2939;
    public static int anInt2940;
    public static int anInt2941;
    public static int anInt2942;
    
    public synchronized void mouseMoved(MouseEvent arg0) {
	try {
	    if (Class126.aClass201_1689 != null) {
		Class192.anInt2823 = 0;
		Class131_Sub2_Sub31.anInt6006 = arg0.getX();
		Class121_Sub1.anInt3982 = arg0.getY();
	    }
	    anInt2941++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uh.mouseMoved("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	anInt2936++;
	if (Class126.aClass201_1689 != null)
	    Class131_Sub41_Sub4.anInt6212 = 0;
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt2939++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uh.focusGained("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void mouseReleased(MouseEvent arg0) {
	anInt2937++;
	if (Class126.aClass201_1689 != null) {
	    Class192.anInt2823 = 0;
	    Class131_Sub41_Sub4.anInt6212 = 0;
	    int i = arg0.getModifiers();
	}
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
    
    public synchronized void mouseDragged(MouseEvent arg0) {
	anInt2938++;
	if (Class126.aClass201_1689 != null) {
	    Class192.anInt2823 = 0;
	    Class131_Sub2_Sub31.anInt6006 = arg0.getX();
	    Class121_Sub1.anInt3982 = arg0.getY();
	}
    }
    
    public synchronized void mousePressed(MouseEvent arg0) {
	anInt2929++;
	if (Class126.aClass201_1689 != null) {
	    Class192.anInt2823 = 0;
	    Class131_Sub2_Sub36.anInt6052 = arg0.getX();
	    Class131_Sub18.anInt4389 = arg0.getY();
	    Class23_Sub2_Sub2.aLong5174 = Class208.method2749(-3913);
	    if (!arg0.isMetaDown()) {
		client.anInt3467 = 1;
		Class131_Sub41_Sub4.anInt6212 = 1;
	    } else {
		client.anInt3467 = 2;
		Class131_Sub41_Sub4.anInt6212 = 2;
	    }
	    int i = arg0.getModifiers();
	}
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
    
    public static void method2718(byte arg0) {
	try {
	    anInt2928++;
	    if (arg0 != -101)
		method2719(null, 119, false, -85);
	    int i = Class131_Sub41_Sub17_Sub1.method2048(28804);
	    if ((i ^ 0xffffffff) == -1) {
		Class146.aByteArrayArrayArray1942 = null;
		Class179.method2499(0, 27309);
	    } else if ((i ^ 0xffffffff) != -2) {
		InputStream_Sub1.method81((byte) -48,
					  (byte) (-4 + Class83.anInt1093
						  & 0xff));
		Class179.method2499(2, 27309);
	    } else {
		InputStream_Sub1.method81((byte) -62, (byte) 0);
		Class179.method2499(512, arg0 ^ ~0x6ac9);
		if (Class23_Sub2_Sub1.aByteArrayArrayArray4992 != null)
		    Class119.method1019(0);
	    }
	    Class23_Sub1_Sub1.anInt5092 = Class29.anInt300;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uh.C(" + arg0 + ')');
	}
    }
    
    public static int method2719(String arg0, int arg1, boolean arg2,
				 int arg3) {
	try {
	    anInt2940++;
	    if (arg3 < 2 || arg3 > 36)
		throw new IllegalArgumentException("Invalid radix:" + arg3);
	    if (arg1 != -8470)
		aClass152Array2930 = null;
	    boolean bool = false;
	    boolean bool_0_ = false;
	    int i = 0;
	    int i_1_ = arg0.length();
	    for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = arg0.charAt(i_2_);
		if (i_2_ == 0) {
		    if (i_3_ == 45) {
			bool = true;
			continue;
		    }
		    if ((i_3_ ^ 0xffffffff) == -44 && arg2)
			continue;
		}
		if ((i_3_ ^ 0xffffffff) > -49 || (i_3_ ^ 0xffffffff) < -58) {
		    if (i_3_ >= 65 && (i_3_ ^ 0xffffffff) >= -91)
			i_3_ -= 55;
		    else if (i_3_ >= 97 && (i_3_ ^ 0xffffffff) >= -123)
			i_3_ -= 87;
		    else
			throw new NumberFormatException();
		} else
		    i_3_ -= 48;
		if ((i_3_ ^ 0xffffffff) <= (arg3 ^ 0xffffffff))
		    throw new NumberFormatException();
		if (bool)
		    i_3_ = -i_3_;
		int i_4_ = i_3_ + arg3 * i;
		if ((i ^ 0xffffffff) != (i_4_ / arg3 ^ 0xffffffff))
		    throw new NumberFormatException();
		bool_0_ = true;
		i = i_4_;
	    }
	    if (!bool_0_)
		throw new NumberFormatException();
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uh.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public void mouseClicked(MouseEvent arg0) {
	try {
	    if (arg0.isPopupTrigger())
		arg0.consume();
	    anInt2935++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("uh.mouseClicked("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void mouseEntered(MouseEvent arg0) {
	anInt2933++;
	if (Class126.aClass201_1689 != null) {
	    Class192.anInt2823 = 0;
	    Class131_Sub2_Sub31.anInt6006 = arg0.getX();
	    Class121_Sub1.anInt3982 = arg0.getY();
	}
    }
    
    public static void method2720(byte arg0) {
	try {
	    aClass150_2934 = null;
	    if (arg0 != -63)
		aClass152Array2930 = null;
	    aClass152Array2930 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"uh.A(" + arg0 + ')');
	}
    }
    
    public synchronized void mouseExited(MouseEvent arg0) {
	anInt2931++;
	if (Class126.aClass201_1689 != null) {
	    Class192.anInt2823 = 0;
	    Class131_Sub2_Sub31.anInt6006 = -1;
	    Class121_Sub1.anInt3982 = -1;
	}
    }
}
