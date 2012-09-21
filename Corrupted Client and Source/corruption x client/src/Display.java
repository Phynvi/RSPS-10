/* Display - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Display
{
    public GraphicsDevice aGraphicsDevice505;
    public DisplayMode aDisplayMode506;
    
    public void method496(byte arg0) {
	int i = 87 / ((52 - arg0) / 56);
	if (null != aDisplayMode506) {
	    aGraphicsDevice505.setDisplayMode(aDisplayMode506);
	    if (!aGraphicsDevice505.getDisplayMode().equals(aDisplayMode506))
		throw new RuntimeException
			  ("Did not return to correct resolution!");
	    aDisplayMode506 = null;
	}
	method497(31520, null);
    }
    
    public void method497(int arg0, Frame arg1) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_0_
		= ((Boolean) field.get(aGraphicsDevice505)).booleanValue();
	    if (bool_0_) {
		bool = true;
		field.set(aGraphicsDevice505, Boolean.FALSE);
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	if (arg0 != 31520)
	    aDisplayMode506 = null;
	try {
	    aGraphicsDevice505.setFullScreenWindow(arg1);
	} catch (RuntimeException runtimeexception) {
	    if (bool) {
		try {
		Field field = Class.forName("sun.awt.Win32GraphicsDevice")
				  .getDeclaredField("valid");
		field.set(aGraphicsDevice505, Boolean.TRUE);
		} catch (Throwable throwable) {
		}
	    }
	}
	if (bool) {
	    try {
		Field field = Class.forName("sun.awt.Win32GraphicsDevice")
				  .getDeclaredField("valid");
		field.set(aGraphicsDevice505, Boolean.TRUE);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    public int[] method498(boolean arg0) {
	DisplayMode[] displaymodes = aGraphicsDevice505.getDisplayModes();
	int[] is = new int[displaymodes.length << 1311272770];
	for (int i = 0; displaymodes.length > i; i++) {
	    is[i << 128986722] = displaymodes[i].getWidth();
	    is[(i << 1886628706) + 1] = displaymodes[i].getHeight();
	    is[(i << 1024154466) - -2] = displaymodes[i].getBitDepth();
	    is[(i << -644689598) - -3] = displaymodes[i].getRefreshRate();
	}
	if (arg0 != true)
	    aDisplayMode506 = null;
	int[] is_1_ = is;
	return is_1_;
    }
    
    public void method499(int arg0, int arg1, Frame arg2, byte arg3, int arg4,
			  int arg5) {
	aDisplayMode506 = aGraphicsDevice505.getDisplayMode();
	if (arg3 == -113) {
	    if (aDisplayMode506 == null)
		throw new NullPointerException();
	    arg2.setUndecorated(true);
	    arg2.enableInputMethods(false);
	    method497(31520, arg2);
	    if (0 == arg0) {
		int i = aDisplayMode506.getRefreshRate();
		DisplayMode[] displaymodes
		    = aGraphicsDevice505.getDisplayModes();
		boolean bool = false;
		for (int i_2_ = 0;
		     (displaymodes.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++) {
		    if (arg4 == displaymodes[i_2_].getWidth()
			&& arg1 == displaymodes[i_2_].getHeight()
			&& displaymodes[i_2_].getBitDepth() == arg5) {
			int i_3_ = displaymodes[i_2_].getRefreshRate();
			if (!bool
			    || Math.abs(-i + i_3_) < Math.abs(-i + arg0)) {
			    arg0 = i_3_;
			    bool = true;
			}
		    }
		}
		if (!bool)
		    arg0 = i;
	    }
	    aGraphicsDevice505.setDisplayMode(new DisplayMode(arg4, arg1, arg5,
							      arg0));
	}
    }
    
    public Display() throws Exception {
	GraphicsEnvironment graphicsenvironment
	    = GraphicsEnvironment.getLocalGraphicsEnvironment();
	aGraphicsDevice505 = graphicsenvironment.getDefaultScreenDevice();
	if (!aGraphicsDevice505.isFullScreenSupported()) {
	    GraphicsDevice[] graphicsdevices
		= graphicsenvironment.getScreenDevices();
	    GraphicsDevice[] graphicsdevices_4_ = graphicsdevices;
	    for (int i = 0;
		 (graphicsdevices_4_.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		GraphicsDevice graphicsdevice = graphicsdevices_4_[i];
		if (null != graphicsdevice
		    && graphicsdevice.isFullScreenSupported()) {
		    aGraphicsDevice505 = graphicsdevice;
		    return;
		}
	    }
	    throw new Exception();
	}
    }
}
