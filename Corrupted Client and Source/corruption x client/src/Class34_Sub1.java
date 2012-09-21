/* Class34_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class34_Sub1 extends Class34 implements MouseWheelListener
{
    public int anInt3762 = 0;
    
    public void method459(int arg0, Component arg1) {
	arg1.removeMouseWheelListener(this);
	if (arg0 != 255)
	    anInt3762 = -117;
    }
    
    public void method456(byte arg0, Component arg1) {
	arg1.addMouseWheelListener(this);
	if (arg0 != -43)
	    anInt3762 = 9;
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
	anInt3762 += arg0.getWheelRotation();
    }
    
    public synchronized int method460(int arg0) {
	int i;
	try {
	    if (arg0 != -128)
		anInt3762 = 120;
	    int i_0_ = anInt3762;
	    anInt3762 = 0;
	    i = i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
}
