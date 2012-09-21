/* Class46_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public class Class46_Sub1 extends Class46 implements ImageProducer
{
    public static int anInt3786;
    public static int anInt3787 = 0;
    public static int anInt3788;
    public static int anInt3789;
    public ColorModel aColorModel3790;
    public static int anInt3791;
    public static int anInt3792;
    public static int anInt3793;
    public ImageConsumer anImageConsumer3794;
    public static int anInt3795;
    public Canvas aCanvas3796;
    public static int anInt3797;
    public static int anInt3798;
    public static int anInt3799;
    public static int anInt3800;
    public static int anInt3801;
    public static int anInt3802;
    public Image anImage3803;
    public static Class158 aClass158_3804;
    public static int[] anIntArray3805 = new int[50];
    
    public synchronized void method572(int arg0, int arg1, int arg2, int arg3,
				       int arg4) {
	try {
	    anInt3786++;
	    if (anImageConsumer3794 != null && arg1 == 5417) {
		anImageConsumer3794.setPixels(arg2, arg0, arg4, arg3,
					      aColorModel3790, anIntArray630,
					      arg0 * anInt636 - -arg2,
					      anInt636);
		anImageConsumer3794.imageComplete(2);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.J(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public void method568(int arg0, int arg1, byte arg2, Graphics arg3,
			  int arg4, int arg5) {
	method572(arg5, 5417, arg4, arg0, arg1);
	anInt3795++;
	Shape shape = arg3.getClip();
	arg3.clipRect(arg4, arg5, arg1, arg0);
	arg3.drawImage(anImage3803, 0, 0, aCanvas3796);
	arg3.setClip(shape);
	if (arg2 != -100)
	    anInt3787 = -104;
    }
    
    public void startProduction(ImageConsumer arg0) {
	try {
	    anInt3788++;
	    addConsumer(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.startProduction("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void addConsumer(ImageConsumer arg0) {
	try {
	    anImageConsumer3794 = arg0;
	    anInt3792++;
	    arg0.setDimensions(anInt636, anInt634);
	    arg0.setProperties(null);
	    arg0.setColorModel(aColorModel3790);
	    arg0.setHints(14);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.addConsumer("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized boolean isConsumer(ImageConsumer arg0) {
	try {
	    anInt3802++;
	    if (anImageConsumer3794 != arg0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.isConsumer("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void method573(int arg0) {
	anInt3799++;
	if (anImageConsumer3794 != null) {
	    anImageConsumer3794.setPixels(0, 0, anInt636, anInt634,
					  aColorModel3790, anIntArray630, 0,
					  anInt636);
	    anImageConsumer3794.imageComplete(2);
	    if (arg0 != -24341)
		anInt3787 = 38;
	}
    }
    
    public synchronized void removeConsumer(ImageConsumer arg0) {
	anInt3798++;
	if (anImageConsumer3794 == arg0)
	    anImageConsumer3794 = null;
    }
    
    public static void method574(byte arg0) {
	try {
	    aClass158_3804 = null;
	    if (arg0 > -64)
		aClass158_3804 = null;
	    anIntArray3805 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tp.I(" + arg0 + ')');
	}
    }
    
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	try {
	    anInt3793++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("tp.requestTopDownLeftRightResend("
			+ (arg0 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method566(int arg0, int arg1, int arg2, Graphics arg3) {
	try {
	    anInt3791++;
	    if (arg2 != 32)
		aClass158_3804 = null;
	    method573(-24341);
	    arg3.drawImage(anImage3803, arg0, arg1, aCanvas3796);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method575(int arg0, int arg1, boolean arg2, int arg3) {
	try {
	    anInt3800++;
	    if (arg2 != true)
		return 79;
	    arg0 &= 0x3;
	    if (arg0 == 0)
		return arg3;
	    if ((arg0 ^ 0xffffffff) == -2)
		return arg1;
	    if (arg0 == 2)
		return 7 + -arg3;
	    return 7 + -arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method569(Canvas arg0, int arg1) {
	try {
	    aCanvas3796 = arg0;
	    anInt3789++;
	    anInt636 = aCanvas3796.getSize().width;
	    anInt634 = aCanvas3796.getSize().height;
	    int i = -74 / ((arg1 - 26) / 48);
	    anIntArray630 = new int[anInt636 * anInt634];
	    aColorModel3790 = new DirectColorModel(32, 16711680, 65280, 255);
	    anImage3803 = aCanvas3796.createImage(this);
	    method573(-24341);
	    aCanvas3796.prepareImage(anImage3803, aCanvas3796);
	    method573(-24341);
	    aCanvas3796.prepareImage(anImage3803, aCanvas3796);
	    method573(-24341);
	    aCanvas3796.prepareImage(anImage3803, aCanvas3796);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tp.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
}
