/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import jagex3.jagmisc.jagmisc;

public abstract class Applet_Sub1 extends Applet
    implements Runnable, FocusListener, WindowListener
{
    public boolean aBoolean1 = false;
    public static int anInt2;
    public static int anInt3;
    public static int anInt4;
    public static int anInt5;
    public static int anInt6;
    public static int anInt7;
    public static int anInt8;
    public static int anInt9;
    public static int anInt10;
    public static int anInt11;
    public static int anInt12;
    public boolean aBoolean13 = false;
    public static int anInt14;
    public static int anInt15;
    public static int anInt16;
    public static int anInt17;
    public static int anInt18 = 0;
    public static int anInt19;
    public static int anInt20;
    public static int anInt21;
    public static int anInt22;
    public static int anInt23;
    public static int anInt24;
    public static int anInt25;
    public static int anInt26;
    public static int anInt27;
    public static int anInt28;
    public static int anInt29;
    public static int anInt30;
    public static int anInt31;
    public static int anInt32;
    public static int anInt33;
    public static int anInt34;
    public static int anInt35;
    public static int anInt36;
    public static boolean aBoolean37;
    public static boolean aBoolean38;
    public static boolean aBoolean39;
    public static boolean aBoolean40;
    public static boolean aBoolean41;
    
    public void method35(byte arg0) {
	try {
	    anInt27++;
	    long l = Class208.method2749(-3913);
	    long l_0_ = Class166.aLongArray2212[Class39.anInt516];
	    Class166.aLongArray2212[Class39.anInt516] = l;
	    if (l_0_ != 0L && l_0_ < l) {
		int i = (int) (-l_0_ + l);
		Class131_Sub43.anInt4700 = (32000 + (i >> -2006790399)) / i;
	    }
	    Class39.anInt516 = 0x1f & Class39.anInt516 + 1;
	    if ((Class148.anInt1984++ ^ 0xffffffff) < -51) {
		Class151.aBoolean2011 = true;
		Class148.anInt1984 -= 50;
		Class131_Sub2_Sub15.aCanvas5768
		    .setSize(Class131_Sub1_Sub1.anInt5499, Class218.anInt3201);
		Class131_Sub2_Sub15.aCanvas5768.setVisible(true);
		if (Class158.aFrame2095 != null
		    && Class74.aFrame1014 == null) {
		    Insets insets = Class158.aFrame2095.getInsets();
		    Class131_Sub2_Sub15.aCanvas5768.setLocation
			(insets.left + Class71.anInt946,
			 Class57.anInt750 + insets.top);
		} else
		    Class131_Sub2_Sub15.aCanvas5768
			.setLocation(Class71.anInt946, Class57.anInt750);
	    }
	    if (arg0 == -11)
		method49((byte) -88);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.C(" + arg0 + ')');
	}
    }
    
    public void stop() {
	try {
	    anInt30++;
	    if (this == Class9.anApplet_Sub1_111 && !Class68.aBoolean923)
		Class219.aLong3206 = Class208.method2749(-3913) + 4000L;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.stop(" + ')');
	}
    }
    
    public void method36(int arg0, byte arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt7++;
	    try {
		if (Class9.anApplet_Sub1_111 != null) {
		    Class69.anInt932++;
		    if (Class69.anInt932 >= 3)
			method47(1, "alreadyloaded");
		    else
			getAppletContext().showDocument(getDocumentBase(),
							"_self");
		} else {
		    Class71.anInt946 = 0;
		    Class166.anInt2204 = Class131_Sub1_Sub1.anInt5499 = arg3;
		    Class57.anInt750 = 0;
		    Class9.anApplet_Sub1_111 = this;
		    Class131_Sub41_Sub15.anInt6355 = Class218.anInt3201 = arg0;
		    Class131_Sub8_Sub1.anInt6091 = arg4;
		    int i = -24 / ((arg1 - -22) / 36);
		    if (Class23_Sub4.aSignLink_3734 == null)
			Class131_Sub13.aSignLink_4259
			    = Class23_Sub4.aSignLink_3734
			    = new SignLink(this, arg2, null, 0);
		    Class139 class139
			= Class23_Sub4.aSignLink_3734.method2692((byte) 107,
								 this, 1);
		    while (class139.anInt1864 == 0)
			Class187.method2575(-37, 10L);
		}
	    } catch (Exception exception) {
		Class45.method563(null, exception, 0);
		method47(1, "crash");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method37(byte arg0) {
	try {
	    anInt32++;
	    if (arg0 == 63) {
		if (Class209.aBoolean3044
		    && Class131_Sub2_Sub39.aBooleanArray6080[81]
		    && Class147.anInt1946 > 2)
		    Class2.method143(((Class131_Sub21)
				      (Class66.aClass119_843.aClass131_1553
				       .aClass131_1786.aClass131_1786)),
				     94);
		else
		    Class2.method143((Class131_Sub21) (Class66.aClass119_843
						       .aClass131_1553
						       .aClass131_1786),
				     80);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.K(" + arg0 + ')');
	}
    }
    
    public void method38(int arg0) {
	anInt11++;
	if (!aBoolean13) {
	    try {
		Class139 class139
		    = Class23_Sub4.aSignLink_3734
			  .method2683(98, Class9.anApplet_Sub1_111.getClass());
		while ((class139.anInt1864 ^ 0xffffffff) == -1)
		    Class187.method2575(-80, 100L);
		if (class139.anObject1866 != null)
		    throw (Throwable) class139.anObject1866;
		jagmisc.init();
		aBoolean13 = true;
		Class93.aClass100_1219
		    = Class131_Sub41_Sub11_Sub1.method2008(0);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (arg0 > -17)
	    aBoolean13 = true;
    }
    
    public static int method39(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg0 != 1)
		anInt18 = 108;
	    anInt15++;
	    arg3 &= 0x3;
	    if (arg3 == 0)
		return arg1;
	    if ((arg3 ^ 0xffffffff) == -2)
		return -arg2 + 7;
	    if ((arg3 ^ 0xffffffff) == -3)
		return 7 - arg1;
	    return arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.R(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void update(Graphics arg0) {
	try {
	    anInt22++;
	    paint(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.update("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void windowActivated(WindowEvent arg0) {
	try {
	    anInt31++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowActivated("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method40(byte arg0, int arg1, int arg2, int arg3, int arg4,
			 boolean arg5, int arg6, String arg7) {
	try {
	    try {
		Class166.anInt2204 = Class131_Sub1_Sub1.anInt5499 = arg6;
		Class71.anInt946 = 0;
		Class131_Sub8_Sub1.anInt6091 = arg1;
		Class131_Sub41_Sub15.anInt6355 = Class218.anInt3201 = arg4;
		Class57.anInt750 = 0;
		Class9.anApplet_Sub1_111 = this;
		Class158.aFrame2095 = new Frame();
		Class158.aFrame2095.setTitle("corrution x  go to  corruption x client/applet_sub1.java  and search on corr then cange this to your server name");
		Class158.aFrame2095.setResizable(true);
		Class158.aFrame2095.addWindowListener(new CloseWindow());
		Class158.aFrame2095.setVisible(true);
		Class158.aFrame2095.toFront();
		Insets insets = Class158.aFrame2095.getInsets();
		Class158.aFrame2095.setSize((insets.right + Class166.anInt2204
					     - -insets.left),
					    (Class131_Sub41_Sub15.anInt6355
					     - -insets.top - -insets.bottom));
		Class131_Sub13.aSignLink_4259 = Class23_Sub4.aSignLink_3734
		    = new SignLink(null, arg3, arg7, arg2);
		Class139 class139
		    = Class23_Sub4.aSignLink_3734.method2692((byte) 107, this,
							     1);
		if (arg0 != 39)
		    stop();
		while (class139.anInt1864 == 0)
		    Class187.method2575(-128, 10L);
	    } catch (Exception exception) {
		Class45.method563(null, exception, 0);
	    }
	    anInt3++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ','
						 + (arg7 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt9++;
	    Class131_Sub2_Sub22.aBoolean5865 = true;
	    Class151.aBoolean2011 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.focusGained("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method41(byte arg0) {
	anInt25++;
	long l = Class208.method2749(-3913);
	long l_1_ = Class144.aLongArray1920[Class23_Sub4_Sub4.anInt5389];
	Class144.aLongArray1920[Class23_Sub4_Sub4.anInt5389] = l;
	if ((l_1_ ^ 0xffffffffffffffffL) != -1L
	    && (l_1_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
	    /* empty */
	}
	Class23_Sub4_Sub4.anInt5389 = Class23_Sub4_Sub4.anInt5389 - -1 & 0x1f;
	synchronized (this) {
	    Class77.aBoolean1046 = Class131_Sub2_Sub22.aBoolean5865;
	}
	method43((byte) 77);
	if (arg0 != -22)
	    windowActivated(null);
    }
    
    public synchronized void method42(int arg0) {
	try {
	    if (Class131_Sub2_Sub15.aCanvas5768 != null) {
		Class131_Sub2_Sub15.aCanvas5768.removeFocusListener(this);
		Class131_Sub2_Sub15.aCanvas5768.getParent()
		    .remove(Class131_Sub2_Sub15.aCanvas5768);
	    }
	    anInt21++;
	    Container container;
	    if (Class74.aFrame1014 != null)
		container = Class74.aFrame1014;
	    else if (Class158.aFrame2095 != null)
		container = Class158.aFrame2095;
	    else
		container = Class23_Sub4.aSignLink_3734.anApplet2883;
	    container.setLayout(null);
	    Class131_Sub2_Sub15.aCanvas5768 = new Canvas_Sub1(this);
	    container.add(Class131_Sub2_Sub15.aCanvas5768);
	    Class131_Sub2_Sub15.aCanvas5768
		.setSize(Class131_Sub1_Sub1.anInt5499, Class218.anInt3201);
	    Class131_Sub2_Sub15.aCanvas5768.setVisible(true);
	    if (arg0 != -15896)
		aBoolean1 = true;
	    if (container != Class158.aFrame2095)
		Class131_Sub2_Sub15.aCanvas5768.setLocation(Class71.anInt946,
							    Class57.anInt750);
	    else {
		Insets insets = Class158.aFrame2095.getInsets();
		Class131_Sub2_Sub15.aCanvas5768.setLocation
		    (insets.left - -Class71.anInt946,
		     insets.top + Class57.anInt750);
	    }
	    Class131_Sub2_Sub15.aCanvas5768.addFocusListener(this);
	    Class131_Sub2_Sub15.aCanvas5768.requestFocus();
	    Class131_Sub2_Sub22.aBoolean5865 = true;
	    Class77.aBoolean1046 = true;
	    Class151.aBoolean2011 = true;
	    Class131_Sub2.aBoolean4096 = false;
	    RuntimeException_Sub1.aLong3247 = Class208.method2749(-3913);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.D(" + arg0 + ')');
	}
    }
    
    public abstract void method43(byte i);
    
    public abstract void method44(int i);
    
    public URL getCodeBase() {
	try {
	    anInt8++;
	    if (Class158.aFrame2095 != null)
		return null;
	    if (Class23_Sub4.aSignLink_3734 != null
		&& this != Class23_Sub4.aSignLink_3734.anApplet2883)
		return Class23_Sub4.aSignLink_3734.anApplet2883.getCodeBase();
	    return super.getCodeBase();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void windowClosing(WindowEvent arg0) {
	try {
	    destroy();
	    anInt36++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowClosing("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void destroy() {
	try {
	    anInt19++;
	    if (this == Class9.anApplet_Sub1_111 && !Class68.aBoolean923) {
		Class219.aLong3206 = Class208.method2749(-3913);
		Class187.method2575(-56, 5000L);
		Class131_Sub13.aSignLink_4259 = null;
		method45(false, (byte) -100);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.destroy(" + ')');
	}
    }
    
    public void windowOpened(WindowEvent arg0) {
	try {
	    anInt28++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowOpened("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void windowDeiconified(WindowEvent arg0) {
	try {
	    anInt23++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowDeiconified("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public AppletContext getAppletContext() {
	try {
	    anInt6++;
	    if (Class158.aFrame2095 != null)
		return null;
	    if (Class23_Sub4.aSignLink_3734 != null
		&& this != Class23_Sub4.aSignLink_3734.anApplet2883)
		return Class23_Sub4.aSignLink_3734.anApplet2883
			   .getAppletContext();
	    return super.getAppletContext();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.getAppletContext(" + ')');
	}
    }
    
    public void method45(boolean arg0, byte arg1) {
	try {
	    anInt35++;
	    synchronized (this) {
		if (Class68.aBoolean923)
		    return;
		Class68.aBoolean923 = true;
	    }
	    if (Class23_Sub4.aSignLink_3734.anApplet2883 != null)
		Class23_Sub4.aSignLink_3734.anApplet2883.destroy();
	    try {
		method44(2);
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aBoolean13) {
		try {
		    jagmisc.quit();
		} catch (Throwable throwable) {
		    /* empty */
		}
		aBoolean13 = false;
	    }
	    if (arg1 <= -56) {
		Class139 class139
		    = Class23_Sub4.aSignLink_3734
			  .method2705(Class9.anApplet_Sub1_111.getClass(), 97);
		while (class139.anInt1864 == 0)
		    Class187.method2575(-87, 100L);
		if (Class131_Sub2_Sub15.aCanvas5768 != null) {
		    try {
			Class131_Sub2_Sub15.aCanvas5768
			    .removeFocusListener(this);
			Class131_Sub2_Sub15.aCanvas5768.getParent()
			    .remove(Class131_Sub2_Sub15.aCanvas5768);
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		if (Class23_Sub4.aSignLink_3734 != null) {
		    try {
			Class23_Sub4.aSignLink_3734.method2710(0);
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		method48(-4187);
		if (Class158.aFrame2095 != null) {
		    try {
			System.exit(0);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method46(byte arg0) {
	try {
	    if (arg0 >= -123)
		method39(-123, 37, -119, 2);
	    synchronized (Class210.aClass50Array3066) {
		for (int i = 0; Class210.aClass50Array3066.length > i; i++) {
		    Class210.aClass50Array3066[i] = new Class50();
		    Class121_Sub2.anIntArray3993[i] = 0;
		}
	    }
	    anInt16++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.O(" + arg0 + ')');
	}
    }
    
    public void method47(int arg0, String arg1) {
	try {
	    anInt4++;
	    if (arg0 != 1)
		anInt18 = -97;
	    if (!aBoolean1) {
		aBoolean1 = true;
		System.out.println("error_game_" + arg1);
		try {
		    Class30.method432(Class23_Sub4.aSignLink_3734.anApplet2883,
				      (byte) -100, "loggedout");
		} catch (Throwable throwable) {
		    /* empty */
		}
		try {
		    getAppletContext().showDocument(new URL(getCodeBase(),
							    ("error_game_"
							     + arg1 + ".ws")),
						    "_top");
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.P(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public abstract void method48(int i);
    
    public abstract void method49(byte i);
    
    public abstract void init();
    
    public String getParameter(String arg0) {
	try {
	    anInt14++;
	    if (Class158.aFrame2095 != null)
		return null;
	    if (Class23_Sub4.aSignLink_3734 != null
		&& Class23_Sub4.aSignLink_3734.anApplet2883 != this)
		return Class23_Sub4.aSignLink_3734.anApplet2883
			   .getParameter(arg0);
	    return super.getParameter(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.getParameter("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void providesignlink(SignLink arg0) {
	try {
	    anInt5++;
	    Class131_Sub13.aSignLink_4259 = Class23_Sub4.aSignLink_3734 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.providesignlink("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void start() {
	try {
	    anInt17++;
	    if (this == Class9.anApplet_Sub1_111 && !Class68.aBoolean923)
		Class219.aLong3206 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.start(" + ')');
	}
    }
    
    public abstract void method50(boolean bool);
    
    public boolean method51(byte arg0) {
	try {
	    anInt12++;
	    String string = getDocumentBase().getHost().toLowerCase();
	    if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
		return true;
	    if (string.equals("runescape.com")
		|| string.endsWith(".runescape.com"))
		return true;
	    if (arg0 != -61)
		return false;
	    if (string.equals("stellardawn.com")
		|| string.endsWith(".stellardawn.com"))
		return true;
	    if (string.endsWith("127.0.0.1"))
		return true;
	    for (/**/;
		 ((string.length() ^ 0xffffffff) < -1
		  && string.charAt(-1 + string.length()) >= '0'
		  && string.charAt(string.length() + -1) <= '9');
		 string = string.substring(0, string.length() + -1)) {
		/* empty */
	    }
	    if (string.endsWith("192.168.1."))
		return true;
	    method47(1, "invalidhost");
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.J(" + arg0 + ')');
	}
    }
    
    public void focusLost(FocusEvent arg0) {
	try {
	    anInt34++;
	    Class131_Sub2_Sub22.aBoolean5865 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.focusLost("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void paint(Graphics arg0) {
	do {
	    try {
		anInt2++;
		if (this == Class9.anApplet_Sub1_111 && !Class68.aBoolean923) {
		    Class151.aBoolean2011 = true;
		    if (!Class131_Sub41_Sub20.aBoolean6433
			|| ((-RuntimeException_Sub1.aLong3247
			     + Class208.method2749(-3913))
			    ^ 0xffffffffffffffffL) >= -1001L)
			break;
		    Rectangle rectangle = arg0.getClipBounds();
		    if (rectangle == null
			|| (Class166.anInt2204 <= rectangle.width
			    && (Class131_Sub41_Sub15.anInt6355
				<= rectangle.height)))
			Class131_Sub2.aBoolean4096 = true;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("gk.paint("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static boolean method52(int arg0) {
	try {
	    anInt29++;
	    if (arg0 != 13026)
		return false;
	    if (Class131_Sub24.aBoolean4472) {
		try {
		    if (((Boolean)
			 Class30.method432((Class23_Sub4.aSignLink_3734
					    .anApplet2883),
					   (byte) -100, "showingVideoAd"))
			    .booleanValue())
			return false;
		    return true;
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.E(" + arg0 + ')');
	}
    }
    
    public URL getDocumentBase() {
	try {
	    anInt20++;
	    if (Class158.aFrame2095 != null)
		return null;
	    if (Class23_Sub4.aSignLink_3734 != null
		&& this != Class23_Sub4.aSignLink_3734.anApplet2883)
		return Class23_Sub4.aSignLink_3734.anApplet2883
			   .getDocumentBase();
	    return super.getDocumentBase();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.getDocumentBase(" + ')');
	}
    }
    
    public void run() {
	try {
	    do {
		try {
		    if (SignLink.aString2904 != null) {
			String string = SignLink.aString2904.toLowerCase();
			if (string.indexOf("sun") != -1
			    || string.indexOf("apple") != -1) {
			    String string_2_ = SignLink.aString2893;
			    if (string_2_.equals("1.1")
				|| string_2_.startsWith("1.1.")
				|| string_2_.equals("1.2")
				|| string_2_.startsWith("1.2.")) {
				method47(1, "wrongjava");
				break;
			    }
			} else if (string.indexOf("ibm") != -1
				   && (SignLink.aString2893 == null
				       || SignLink.aString2893
					      .equals("1.4.2"))) {
			    method47(1, "wrongjava");
			    break;
			}
		    }
		    if (SignLink.aString2893 != null
			&& SignLink.aString2893.startsWith("1.")) {
			int i = 2;
			int i_3_ = 0;
			while ((i ^ 0xffffffff)
			       > (SignLink.aString2893.length()
				  ^ 0xffffffff)) {
			    int i_4_ = SignLink.aString2893.charAt(i);
			    if ((i_4_ ^ 0xffffffff) > -49
				|| (i_4_ ^ 0xffffffff) < -58)
				break;
			    i++;
			    i_3_ = i_3_ * 10 + (i_4_ - 48);
			}
			if (i_3_ >= 5)
			    Class131_Sub41_Sub20.aBoolean6433 = true;
		    }
		    if (Class23_Sub4.aSignLink_3734.anApplet2883 != null) {
			Method method = SignLink.aMethod2908;
			if (method != null) {
			    try {
				method.invoke((Class23_Sub4.aSignLink_3734
					       .anApplet2883),
					      new Object[] { Boolean.TRUE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    }
		    Class88.method825(1);
		    Class144.method2153((byte) -61);
		    method42(-15896);
		    method50(true);
		    Class93.aClass100_1219
			= Class131_Sub41_Sub11_Sub1.method2008(0);
		    method38(-85);
		    while (Class219.aLong3206 == 0L
			   || (Class219.aLong3206
			       > Class208.method2749(-3913))) {
			Class131_Sub1_Sub4.anInt5544
			    = (Class93.aClass100_1219.method876
			       (Class131_Sub2_Sub35.anInt6041, -122));
			for (int i = 0; i < Class131_Sub1_Sub4.anInt5544; i++)
			    method41((byte) -22);
			method35((byte) -11);
			if (Class131_Sub8_Sub1.anInt6111 == 1)
			    Class187.method2575(-94, 5L);
			client.method68(Class131_Sub2_Sub15.aCanvas5768, 101,
					Class23_Sub4.aSignLink_3734);
		    }
		} catch (Exception exception) {
		    Class45.method563(null, exception, 0);
		    method47(1, "crash");
		}
	    } while (false);
	    anInt10++;
	    method45(true, (byte) -74);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gk.run(" + ')');
	}
    }
    
    public void windowClosed(WindowEvent arg0) {
	try {
	    anInt26++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowClosed("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void windowDeactivated(WindowEvent arg0) {
	try {
	    anInt24++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowDeactivated("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void windowIconified(WindowEvent arg0) {
	try {
	    anInt33++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gk.windowIconified("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
