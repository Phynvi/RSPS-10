/* Class10_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class10_Sub7 extends Class10
{
    public Class54 aClass54_3649;
    public static float[] aFloatArray3650 = { 0.0F, 0.0F, 0.0F, 0.0F };
    public Class170 aClass170_3651;
    public Class36_Sub4 aClass36_Sub4_3652;
    
    public void method204(boolean arg0) {
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	if (aClass130_Sub2_121.anInt3353 > 0) {
	    float f = -0.5F / (float) aClass130_Sub2_121.anInt3353;
	    aClass130_Sub2_121.method1280(1);
	    aFloatArray3650[0] = 0.0F;
	    aFloatArray3650[1] = 0.0F;
	    aFloatArray3650[2] = f;
	    aFloatArray3650[3] = aClass130_Sub2_121.aFloat3426 * f + 0.25F;
	    var_opengl.glPushMatrix();
	    var_opengl.glLoadIdentity();
	    var_opengl.glTexGenfv(8192, 9474, aFloatArray3650, 0);
	    var_opengl.glPopMatrix();
	    aClass130_Sub2_121
		.method1320(0.5F, (float) aClass130_Sub2_121.anInt3353);
	    aClass130_Sub2_121.method1347(aClass36_Sub4_3652);
	    aClass130_Sub2_121.method1280(0);
	}
	aClass54_3649.method609('\0');
	var_opengl.glMatrixMode(5890);
	var_opengl.glPushMatrix();
	var_opengl.glScalef(0.25F, 0.25F, 1.0F);
	var_opengl.glMatrixMode(5888);
    }
    
    public void method200(int arg0) {
	if ((arg0 & 0x1) == 1) {
	    if (aClass170_3651.aBoolean2276) {
		aClass130_Sub2_121
		    .method1347(aClass170_3651.aClass36_Sub2_2271);
		aFloatArray3650[0] = 0.0F;
		aFloatArray3650[1] = 0.0F;
		aFloatArray3650[2] = 0.0F;
		aFloatArray3650[3]
		    = (float) (aClass130_Sub2_121.anInt3324 % 4000) / 4000.0F;
		aClass130_Sub2_121.anOpengl3304.glTexGenfv(8194, 9473,
							   aFloatArray3650, 0);
	    } else {
		int i = aClass130_Sub2_121.anInt3324 % 4000 * 16 / 4000;
		aClass130_Sub2_121
		    .method1347(aClass170_3651.aClass36_Sub1Array2272[i]);
	    }
	} else if (aClass170_3651.aBoolean2276) {
	    aClass130_Sub2_121.method1347(aClass170_3651.aClass36_Sub2_2271);
	    aFloatArray3650[0] = 0.0F;
	    aFloatArray3650[1] = 0.0F;
	    aFloatArray3650[2] = 0.0F;
	    aFloatArray3650[3] = 0.0F;
	    aClass130_Sub2_121.anOpengl3304.glTexGenfv(8194, 9473,
						       aFloatArray3650, 0);
	} else
	    aClass130_Sub2_121
		.method1347(aClass170_3651.aClass36_Sub1Array2272[0]);
    }
    
    public void method202(boolean arg0) {
	aClass130_Sub2_121.method1314(260, 8448);
    }
    
    public void method201(Class36 class36) {
	/* empty */
    }
    
    public void method199() {
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	aClass54_3649.method609('\001');
	if (aClass130_Sub2_121.anInt3353 > 0) {
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(null);
	    aClass130_Sub2_121.method1320(1.0F, 0.0F);
	    aClass130_Sub2_121.method1280(0);
	}
	aClass130_Sub2_121.method1314(8448, 8448);
	var_opengl.glMatrixMode(5890);
	var_opengl.glPopMatrix();
	var_opengl.glMatrixMode(5888);
    }
    
    public void method207() {
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	aClass54_3649 = new Class54(aClass130_Sub2_121, 2);
	aClass54_3649.method607(0);
	aClass130_Sub2_121.method1280(1);
	aClass130_Sub2_121.method1314(7681, 260);
	aClass130_Sub2_121.method1298(0, 34168, 768);
	var_opengl.glTexGeni(8192, 9472, 9216);
	var_opengl.glEnable(3168);
	aClass130_Sub2_121.method1280(0);
	var_opengl.glTexEnvf(8960, 34163, 2.0F);
	if (aClass170_3651.aBoolean2276) {
	    var_opengl.glTexGeni(8194, 9472, 9217);
	    var_opengl.glTexGeni(8195, 9472, 9217);
	    var_opengl.glTexGenfv(8195, 9473,
				  new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    var_opengl.glEnable(3170);
	    var_opengl.glEnable(3171);
	}
	aClass54_3649.method608();
	aClass54_3649.method607(1);
	aClass130_Sub2_121.method1280(1);
	aClass130_Sub2_121.method1314(8448, 8448);
	aClass130_Sub2_121.method1298(0, 5890, 768);
	var_opengl.glDisable(3168);
	aClass130_Sub2_121.method1280(0);
	var_opengl.glTexEnvf(8960, 34163, 1.0F);
	if (aClass170_3651.aBoolean2276) {
	    var_opengl.glDisable(3170);
	    var_opengl.glDisable(3171);
	}
	aClass54_3649.method608();
    }
    
    public boolean method203() {
	return true;
    }
    
    public Class10_Sub7(Class130_Sub2 arg0, Class170 arg1) {
	super(arg0);
	aClass170_3651 = arg1;
	method207();
	aClass36_Sub4_3652 = new Class36_Sub4(aClass130_Sub2_121, 6406, 2,
					      new byte[] { 0, -1 }, 6406);
	aClass36_Sub4_3652.method491(10242, false);
    }
}
