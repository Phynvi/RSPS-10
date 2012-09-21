/* Class10_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class10_Sub5 extends Class10
{
    public Class36_Sub3[] aClass36_Sub3Array3642;
    public boolean aBoolean3643;
    public Class54 aClass54_3644;
    public boolean aBoolean3645 = false;
    
    public void method200(int arg0) {
	if (aBoolean3645) {
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(aClass36_Sub3Array3642[arg0 - 1]);
	    aClass130_Sub2_121.method1280(0);
	}
    }
    
    public Class10_Sub5(Class130_Sub2 arg0) {
	super(arg0);
	if (arg0.aBoolean3386) {
	    aBoolean3643 = arg0.anInt3351 < 3;
	    int i = aBoolean3643 ? 48 : 127;
	    byte[][] is = new byte[6][4096];
	    byte[][] is_0_ = new byte[6][4096];
	    byte[][] is_1_ = new byte[6][4096];
	    int i_2_ = 0;
	    for (int i_3_ = 0; i_3_ < 64; i_3_++) {
		for (int i_4_ = 0; i_4_ < 64; i_4_++) {
		    float f = 2.0F * (float) i_4_ / 64.0F - 1.0F;
		    float f_5_ = 2.0F * (float) i_3_ / 64.0F - 1.0F;
		    float f_6_
			= (float) (1.0 / Math.sqrt((double) (f * f + 1.0F
							     + f_5_ * f_5_)));
		    f *= f_6_;
		    f_5_ *= f_6_;
		    for (int i_7_ = 0; i_7_ < 6; i_7_++) {
			float f_8_;
			if (i_7_ == 0)
			    f_8_ = -f;
			else if (i_7_ == 1)
			    f_8_ = f;
			else if (i_7_ == 2)
			    f_8_ = f_5_;
			else if (i_7_ == 3)
			    f_8_ = -f_5_;
			else if (i_7_ == 4)
			    f_8_ = f_6_;
			else
			    f_8_ = -f_6_;
			int i_9_;
			int i_10_;
			int i_11_;
			if (f_8_ > 0.0F) {
			    i_9_ = (int) (Math.pow((double) f_8_, 96.0)
					  * (double) i);
			    i_10_ = (int) (Math.pow((double) f_8_, 36.0)
					   * (double) i);
			    i_11_ = (int) (Math.pow((double) f_8_, 12.0)
					   * (double) i);
			} else
			    i_9_ = i_10_ = i_11_ = 0;
			is_0_[i_7_][i_2_] = (byte) i_9_;
			is_1_[i_7_][i_2_] = (byte) i_10_;
			is[i_7_][i_2_] = (byte) i_11_;
		    }
		    i_2_++;
		}
	    }
	    aClass36_Sub3Array3642 = new Class36_Sub3[3];
	    aClass36_Sub3Array3642[0]
		= new Class36_Sub3(aClass130_Sub2_121, 6406, 64, false, is_0_,
				   6406);
	    aClass36_Sub3Array3642[1]
		= new Class36_Sub3(aClass130_Sub2_121, 6406, 64, false, is_1_,
				   6406);
	    aClass36_Sub3Array3642[2]
		= new Class36_Sub3(aClass130_Sub2_121, 6406, 64, false, is,
				   6406);
	    method206();
	}
    }
    
    public void method204(boolean arg0) {
	if (aClass54_3644 != null && arg0) {
	    if (!aBoolean3643) {
		aClass130_Sub2_121.method1280(2);
		aClass130_Sub2_121
		    .method1347(aClass130_Sub2_121.aClass36_Sub1_3401);
		aClass130_Sub2_121.method1280(0);
	    }
	    aClass54_3644.method609('\0');
	    aBoolean3645 = true;
	} else
	    aClass130_Sub2_121.method1277(0, 34168, 770);
    }
    
    public void method206() {
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	aClass54_3644 = new Class54(aClass130_Sub2_121, 2);
	aClass54_3644.method607(0);
	aClass130_Sub2_121.method1280(1);
	var_opengl.glTexGeni(8192, 9472, 34065);
	var_opengl.glTexGeni(8193, 9472, 34065);
	var_opengl.glTexGeni(8194, 9472, 34065);
	var_opengl.glEnable(3168);
	var_opengl.glEnable(3169);
	var_opengl.glEnable(3170);
	var_opengl.glMatrixMode(5890);
	var_opengl.glLoadIdentity();
	var_opengl.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
	var_opengl.glMatrixMode(5888);
	if (!aBoolean3643) {
	    aClass130_Sub2_121.method1314(7681, 8448);
	    aClass130_Sub2_121.method1298(0, 34168, 768);
	    aClass130_Sub2_121.method1280(2);
	    aClass130_Sub2_121.method1314(260, 7681);
	    aClass130_Sub2_121.method1298(0, 34168, 768);
	    aClass130_Sub2_121.method1298(1, 34168, 770);
	    aClass130_Sub2_121.method1277(0, 34167, 770);
	} else {
	    aClass130_Sub2_121.method1314(260, 7681);
	    aClass130_Sub2_121.method1298(0, 5890, 770);
	    aClass130_Sub2_121.method1277(0, 34167, 770);
	}
	aClass130_Sub2_121.method1280(0);
	aClass54_3644.method608();
	aClass54_3644.method607(1);
	aClass130_Sub2_121.method1280(1);
	var_opengl.glDisable(3168);
	var_opengl.glDisable(3169);
	var_opengl.glDisable(3170);
	var_opengl.glMatrixMode(5890);
	var_opengl.glLoadIdentity();
	var_opengl.glMatrixMode(5888);
	if (!aBoolean3643) {
	    aClass130_Sub2_121.method1314(8448, 8448);
	    aClass130_Sub2_121.method1298(0, 5890, 768);
	    aClass130_Sub2_121.method1280(2);
	    aClass130_Sub2_121.method1314(8448, 8448);
	    aClass130_Sub2_121.method1298(0, 5890, 768);
	    aClass130_Sub2_121.method1298(1, 34168, 768);
	    aClass130_Sub2_121.method1277(0, 5890, 770);
	} else {
	    aClass130_Sub2_121.method1314(8448, 8448);
	    aClass130_Sub2_121.method1298(0, 5890, 768);
	    aClass130_Sub2_121.method1277(0, 5890, 770);
	}
	aClass130_Sub2_121.method1280(0);
	aClass54_3644.method608();
    }
    
    public void method199() {
	if (aBoolean3645) {
	    if (!aBoolean3643) {
		aClass130_Sub2_121.method1280(2);
		aClass130_Sub2_121.method1347(null);
	    }
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(null);
	    aClass130_Sub2_121.method1280(0);
	    aClass54_3644.method609('\001');
	    aBoolean3645 = false;
	} else
	    aClass130_Sub2_121.method1277(0, 5890, 770);
	aClass130_Sub2_121.method1314(8448, 8448);
    }
    
    public void method201(Class36 arg0) {
	aClass130_Sub2_121.method1347(arg0);
    }
    
    public void method202(boolean arg0) {
	aClass130_Sub2_121.method1314(8448, 7681);
    }
    
    public boolean method203() {
	return true;
    }
}
