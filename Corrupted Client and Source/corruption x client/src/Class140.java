/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class140
{
    public int[] anIntArray1868;
    public boolean aBoolean1869 = false;
    public Class152[] aClass152Array1870;
    public int anInt1871;
    public static int anInt1872
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
	      .length();
    public static int[] anIntArray1873 = new int[256];
    public int anInt1874;
    public int[] anIntArray1875 = new int[4];
    
    public int method2127() {
	return anInt1874 - 1;
    }
    
    public void method2128(Class130 arg0, String arg1, int[] arg2, int arg3,
			   int arg4, int arg5, boolean arg6) {
	if (arg5 == 0)
	    arg6 = false;
	arg5 |= ~0xffffff;
	for (int i = 0; i < arg1.length(); i++) {
	    int i_0_ = anIntArray1873[arg1.charAt(i)];
	    if (arg6)
		aClass152Array1870[i_0_].method2202(arg3 + 1, arg4 + 1, 1,
						    -16777216, 1);
	    aClass152Array1870[i_0_].method2202(arg3, arg4, 1, arg5, 1);
	    arg3 += anIntArray1868[i_0_];
	}
    }
    
    public void method2129(Class130 arg0, Font arg1, FontMetrics arg2,
			   char arg3, int arg4, boolean arg5) {
	int i = arg2.charWidth(arg3);
	int i_1_ = i;
	if (arg5) {
	    try {
		if (arg3 == '/')
		    arg5 = false;
		if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v'
		    || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A'
		    || arg3 == 'V' || arg3 == 'W')
		    i++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_2_ = arg2.getMaxAscent();
	int i_3_ = arg2.getMaxAscent() + arg2.getMaxDescent();
	int i_4_ = arg2.getHeight();
	Image image = Class131_Sub2_Sub15.aCanvas5768.createImage(i, i_3_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i, i_3_);
	graphics.setColor(Color.white);
	graphics.setFont(arg1);
	graphics.drawString(String.valueOf(arg3), 0, i_2_);
	if (arg5)
	    graphics.drawString(String.valueOf(arg3), 1, i_2_);
	int[] is = new int[i * i_3_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i, i_3_, is, 0, i);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_5_ = 0;
    while_11_:
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    for (int i_7_ = 0; i_7_ < i; i_7_++) {
		int i_8_ = is[i_7_ + i_6_ * i];
		if ((i_8_ & 0xffffff) != 0) {
		    i_5_ = i_6_;
		    break while_11_;
		}
	    }
	}
	for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
	    if ((is[i_9_] & 0xffffff) == 0)
		is[i_9_] = 0;
	}
	anInt1871 = i_2_ - i_5_;
	anInt1874 = i_4_;
	anIntArray1868[arg4] = i_1_;
	aClass152Array1870[arg4] = arg0.method1247(is, 0, i, i, i_3_);
    }
    
    public static void method2130() {
	anIntArray1873 = null;
    }
    
    public int method2131(String arg0) {
	int i = 0;
	for (int i_10_ = 0; i_10_ < arg0.length(); i_10_++) {
	    int i_11_ = anIntArray1873[arg0.charAt(i_10_)];
	    i += anIntArray1868[i_11_];
	}
	return i;
    }
    
    public int method2132() {
	return anInt1871;
    }
    
    public void method2133(Class130 arg0, String arg1, int arg2, int arg3,
			   int arg4, boolean arg5) {
	int i = method2131(arg1) / 2;
	arg0.method1228(anIntArray1875);
	if (arg2 - i <= anIntArray1875[2] && arg2 + i >= anIntArray1875[0]
	    && arg3 - anInt1871 <= anIntArray1875[3]
	    && arg3 + anInt1874 >= anIntArray1875[1])
	    method2128(arg0, arg1, anIntArray1875, arg2 - i, arg3, arg4, arg5);
    }
    
    public Class140(Class130 arg0, int arg1, boolean arg2, Component arg3) {
	aBoolean1869 = false;
	aClass152Array1870 = new Class152[256];
	anIntArray1868 = new int[256];
	Font font = new Font("Helvetica", arg2 ? 1 : 0, arg1);
	FontMetrics fontmetrics = arg3.getFontMetrics(font);
	for (int i = 0; i < anInt1872; i++)
	    method2129
		(arg0, font, fontmetrics,
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		     .charAt(i),
		 i, false);
	if (arg2 && aBoolean1869) {
	    aBoolean1869 = false;
	    font = new Font("Helvetica", 0, arg1);
	    fontmetrics = arg3.getFontMetrics(font);
	    for (int i = 0; i < anInt1872; i++)
		method2129
		    (arg0, font, fontmetrics,
		     "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			 .charAt(i),
		     i, false);
	    if (!aBoolean1869) {
		aBoolean1869 = false;
		for (int i = 0; i < anInt1872; i++)
		    method2129
			(arg0, font, fontmetrics,
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			     .charAt(i),
			 i, true);
	    }
	}
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_12_
		= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .indexOf(i);
	    if (i_12_ == -1)
		i_12_ = 74;
	    anIntArray1873[i] = i_12_;
	}
    }
}
