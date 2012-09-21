/* Sensor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Sensor
{
    public Robot aRobot2570;
    public Component aComponent2571;
    
    public void method2513(int arg0, boolean arg1, Component arg2) {
	if (arg1)
	    arg2 = null;
	else if (arg2 == null)
	    throw new NullPointerException();
	if (aComponent2571 != arg2) {
	    if (aComponent2571 != null) {
		aComponent2571.setCursor(null);
		aComponent2571 = null;
	    }
	    if (arg2 != null) {
		arg2.setCursor(arg2.getToolkit().createCustomCursor
			       (new BufferedImage(1, 1, 2), new Point(0, 0),
				null));
		aComponent2571 = arg2;
	    }
	    if (arg0 > -24)
		aComponent2571 = null;
	}
    }
    
    public void method2514(int arg0, int arg1, int arg2) {
	aRobot2570.mouseMove(arg0, arg1);
	if (arg2 != 0)
	    aRobot2570 = null;
    }
    
    public void method2515(Point arg0, byte arg1, int[] arg2, int arg3,
			   Component arg4, int arg5) {
	int i = -78 / ((arg1 - -36) / 60);
	if (arg2 == null)
	    arg4.setCursor(null);
	else {
	    BufferedImage bufferedimage = new BufferedImage(arg3, arg5, 2);
	    bufferedimage.setRGB(0, 0, arg3, arg5, arg2, 0, arg3);
	    arg4.setCursor(arg4.getToolkit().createCustomCursor(bufferedimage,
								arg0, null));
	}
    }
    
    public Sensor() throws Exception {
	aRobot2570 = new Robot();
    }
}
