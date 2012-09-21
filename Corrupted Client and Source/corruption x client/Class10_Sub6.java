/* Class10_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class10_Sub6 extends Class10
{
    public Class54 aClass54_3646;
    public Class170 aClass170_3647;
    public static float[] aFloatArray3648 = new float[4];
    
    public void method201(Class36 arg0) {
	aClass130_Sub2_121.method1347(arg0);
    }
    
    public void method199() {
	aClass54_3646.method609('\001');
	aClass130_Sub2_121.method1280(1);
	aClass130_Sub2_121.method1347(null);
	aClass130_Sub2_121.method1280(0);
    }
    
    public void method202(boolean bool) {
	/* empty */
    }
    
    public void method200(int arg0) {
	float f = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
	float f_0_ = 5.0E-4F * (float) ((arg0 >> 3 & 0x3) + 1);
	float f_1_ = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (arg0 & 0x80) != 0;
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	aClass130_Sub2_121.method1280(1);
	if (bool) {
	    aFloatArray3648[0] = f_1_;
	    aFloatArray3648[1] = 0.0F;
	    aFloatArray3648[2] = 0.0F;
	    aFloatArray3648[3] = 0.0F;
	} else {
	    aFloatArray3648[0] = 0.0F;
	    aFloatArray3648[1] = 0.0F;
	    aFloatArray3648[2] = f_1_;
	    aFloatArray3648[3] = 0.0F;
	}
	var_opengl.glTexGenfv(8192, 9474, aFloatArray3648, 0);
	aFloatArray3648[0] = 0.0F;
	aFloatArray3648[1] = f_1_;
	aFloatArray3648[2] = 0.0F;
	aFloatArray3648[3] = (float) aClass130_Sub2_121.anInt3324 * f % 1.0F;
	var_opengl.glTexGenfv(8193, 9474, aFloatArray3648, 0);
	if (!aClass170_3647.aBoolean2276) {
	    int i
		= (int) (f_0_ * (float) aClass130_Sub2_121.anInt3324 * 16.0F);
	    aClass130_Sub2_121
		.method1347(aClass170_3647.aClass36_Sub1Array2275[i % 16]);
	} else {
	    aFloatArray3648[0] = 0.0F;
	    aFloatArray3648[1] = 0.0F;
	    aFloatArray3648[2] = 0.0F;
	    aFloatArray3648[3]
		= (float) aClass130_Sub2_121.anInt3324 * f_0_ % 1.0F;
	    var_opengl.glTexGenfv(8194, 9473, aFloatArray3648, 0);
	}
	aClass130_Sub2_121.method1280(0);
    }
    
    public Class10_Sub6(Class130_Sub2 arg0, Class170 arg1) {
	super(arg0);
	aClass170_3647 = arg1;
	opengl var_opengl = arg0.anOpengl3304;
	aClass54_3646 = new Class54(arg0, 2);
	aClass54_3646.method607(0);
	aClass130_Sub2_121.method1280(1);
	if (aClass170_3647.aBoolean2276) {
	    var_opengl.glTexGeni(8194, 9472, 9217);
	    var_opengl.glEnable(3170);
	}
	var_opengl.glTexGeni(8192, 9472, 9216);
	var_opengl.glTexGeni(8193, 9472, 9216);
	var_opengl.glEnable(3168);
	var_opengl.glEnable(3169);
	aClass130_Sub2_121.method1280(0);
	aClass54_3646.method608();
	aClass54_3646.method607(1);
	aClass130_Sub2_121.method1280(1);
	if (aClass170_3647.aBoolean2276)
	    var_opengl.glDisable(3170);
	var_opengl.glDisable(3168);
	var_opengl.glDisable(3169);
	aClass130_Sub2_121.method1280(0);
	aClass54_3646.method608();
    }
    
    public void method204(boolean arg0) {
	aClass54_3646.method609('\0');
	if (aClass170_3647.aBoolean2276) {
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(aClass170_3647.aClass36_Sub2_2270);
	    aClass130_Sub2_121.method1280(0);
	}
    }
    
    public boolean method203() {
	return true;
    }
}
