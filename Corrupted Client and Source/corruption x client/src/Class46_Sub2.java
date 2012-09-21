/* Class46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class46_Sub2 extends Class46
{
    public Rectangle aRectangle3806;
    public Image anImage3807;
    public Canvas aCanvas3808;
    public Shape aShape3809;
    
    public void method568(int arg0, int arg1, byte arg2, Graphics arg3,
			  int arg4, int arg5) {
	aShape3809 = arg3.getClip();
	aRectangle3806.height = arg0;
	aRectangle3806.y = arg5;
	aRectangle3806.x = arg4;
	aRectangle3806.width = arg1;
	if (arg2 != -100)
	    method569(null, -34);
	arg3.setClip(aRectangle3806);
	arg3.drawImage(anImage3807, 0, 0, aCanvas3808);
	arg3.setClip(aShape3809);
    }
    
    public void method569(Canvas arg0, int arg1) {
	aCanvas3808 = arg0;
	aRectangle3806 = new Rectangle();
	anInt636 = aCanvas3808.getSize().width;
	anInt634 = aCanvas3808.getSize().height;
	anIntArray630 = new int[anInt634 * anInt636];
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray630, anIntArray630.length);
	int i = 69 / ((arg1 - 26) / 48);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       (directcolormodel.createCompatibleSampleModel(anInt636,
							     anInt634),
		databufferint, null));
	anImage3807 = new BufferedImage(directcolormodel, writableraster,
					false, new Hashtable());
    }
    
    public void method566(int arg0, int arg1, int arg2, Graphics arg3) {
	if (arg2 == 32)
	    arg3.drawImage(anImage3807, arg0, arg1, aCanvas3808);
    }
}
