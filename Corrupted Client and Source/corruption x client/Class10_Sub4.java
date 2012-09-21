/* Class10_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class10_Sub4 extends Class10
{
    public Class54 aClass54_3640;
    public boolean aBoolean3641 = false;
    
    public void method202(boolean arg0) {
	aClass130_Sub2_121.method1314(8448, 7681);
    }
    
    public void method200(int i) {
	/* empty */
    }
    
    public void method199() {
	if (aBoolean3641) {
	    aClass54_3640.method609('\001');
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(null);
	    aClass130_Sub2_121.method1280(0);
	} else
	    aClass130_Sub2_121.method1277(0, 5890, 770);
	aClass130_Sub2_121.method1314(8448, 8448);
	aBoolean3641 = false;
    }
    
    public void method201(Class36 arg0) {
	aClass130_Sub2_121.method1347(arg0);
    }
    
    public Class10_Sub4(Class130_Sub2 arg0) {
	super(arg0);
	if (arg0.aBoolean3386) {
	    opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	    aClass54_3640 = new Class54(arg0, 2);
	    aClass54_3640.method607(0);
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1314(34165, 7681);
	    aClass130_Sub2_121.method1298(2, 34168, 770);
	    aClass130_Sub2_121.method1277(0, 34167, 770);
	    var_opengl.glTexGeni(8192, 9472, 34066);
	    var_opengl.glTexGeni(8193, 9472, 34066);
	    var_opengl.glTexGeni(8194, 9472, 34066);
	    var_opengl.glEnable(3168);
	    var_opengl.glEnable(3169);
	    var_opengl.glEnable(3170);
	    aClass130_Sub2_121.method1280(0);
	    aClass54_3640.method608();
	    aClass54_3640.method607(1);
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1314(8448, 8448);
	    aClass130_Sub2_121.method1298(2, 34166, 770);
	    aClass130_Sub2_121.method1277(0, 5890, 770);
	    var_opengl.glDisable(3168);
	    var_opengl.glDisable(3169);
	    var_opengl.glDisable(3170);
	    var_opengl.glMatrixMode(5890);
	    var_opengl.glLoadIdentity();
	    var_opengl.glMatrixMode(5888);
	    aClass130_Sub2_121.method1280(0);
	    aClass54_3640.method608();
	}
    }
    
    public boolean method203() {
	return true;
    }
    
    public void method204(boolean arg0) {
	Class36_Sub3 class36_sub3 = aClass130_Sub2_121.method1323();
	if (aClass54_3640 != null && class36_sub3 != null && arg0) {
	    opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	    aClass54_3640.method609('\0');
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(class36_sub3);
	    var_opengl.glMatrixMode(5890);
	    var_opengl.glLoadMatrixf(aClass130_Sub2_121.aClass9_Sub1_3373
					 .method197(-111),
				     0);
	    var_opengl.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
	    var_opengl.glMatrixMode(5888);
	    aClass130_Sub2_121.method1280(0);
	    aBoolean3641 = true;
	} else
	    aClass130_Sub2_121.method1277(0, 34168, 770);
    }
}
