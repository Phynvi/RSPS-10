/* Class152_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class152_Sub2 extends Class152
{
    public int anInt4743 = 0;
    public int anInt4744;
    public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_4745;
    public int anInt4746;
    public int anInt4747 = 0;
    public Class130_Sub2 aClass130_Sub2_4748;
    public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_4749;
    public int anInt4750;
    public boolean aBoolean4751;
    
    public void method2221() {
	aClass130_Sub2_4748.method1280(1);
	aClass130_Sub2_4748.method1347(null);
	aClass130_Sub2_4748.method1314(8448, 8448);
	aClass130_Sub2_4748.method1298(1, 34168, 768);
	aClass130_Sub2_4748.method1277(0, 5890, 770);
	aClass130_Sub2_4748.method1280(0);
	aClass130_Sub2_4748.method1298(1, 34168, 768);
    }
    
    public void method2205(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	int i = arg0 + arg2;
	int i_0_ = arg1 + arg3;
	aClass36_Sub1_Sub1_4745.method477(false);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	aClass130_Sub2_4748.method1284(arg6);
	aClass130_Sub2_4748.method1342(arg4);
	var_opengl.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8),
			      (byte) arg5, (byte) (arg5 >> 24));
	if (aClass36_Sub1_Sub1_4745.aBoolean6457 && !aBoolean4751) {
	    float f = (aClass36_Sub1_Sub1_4745.aFloat6458 * (float) arg3
		       / (float) aClass36_Sub1_Sub1_4745.anInt6456);
	    float f_1_ = (aClass36_Sub1_Sub1_4745.aFloat6455 * (float) arg2
			  / (float) aClass36_Sub1_Sub1_4745.anInt6459);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, f);
	    var_opengl.glVertex2i(arg0, arg1);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(arg0, i_0_);
	    var_opengl.glTexCoord2f(f_1_, 0.0F);
	    var_opengl.glVertex2i(i, i_0_);
	    var_opengl.glTexCoord2f(f_1_, f);
	    var_opengl.glVertex2i(i, arg1);
	    var_opengl.glEnd();
	} else {
	    var_opengl.glPushMatrix();
	    var_opengl.glTranslatef((float) anInt4747, (float) anInt4743,
				    0.0F);
	    int i_2_ = method2216();
	    int i_3_ = method2198();
	    int i_4_ = arg1 + aClass36_Sub1_Sub1_4745.anInt6456;
	    var_opengl.glBegin(7);
	    int i_5_ = arg1;
	    for (/**/; i_4_ <= i_0_; i_4_ += i_3_) {
		int i_6_ = arg0 + aClass36_Sub1_Sub1_4745.anInt6459;
		int i_7_ = arg0;
		while (i_6_ <= i) {
		    var_opengl.glTexCoord2f(0.0F, (aClass36_Sub1_Sub1_4745
						   .aFloat6458));
		    var_opengl.glVertex2i(i_7_, i_5_);
		    var_opengl.glTexCoord2f(0.0F, 0.0F);
		    var_opengl.glVertex2i(i_7_, i_4_);
		    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					    0.0F);
		    var_opengl.glVertex2i(i_6_, i_4_);
		    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					    (aClass36_Sub1_Sub1_4745
					     .aFloat6458));
		    var_opengl.glVertex2i(i_6_, i_5_);
		    i_6_ += i_2_;
		    i_7_ += i_2_;
		}
		if (i_7_ < i) {
		    float f = (aClass36_Sub1_Sub1_4745.aFloat6455
			       * (float) (i - i_7_)
			       / (float) aClass36_Sub1_Sub1_4745.anInt6459);
		    var_opengl.glTexCoord2f(0.0F, (aClass36_Sub1_Sub1_4745
						   .aFloat6458));
		    var_opengl.glVertex2i(i_7_, i_5_);
		    var_opengl.glTexCoord2f(0.0F, 0.0F);
		    var_opengl.glVertex2i(i_7_, i_4_);
		    var_opengl.glTexCoord2f(f, 0.0F);
		    var_opengl.glVertex2i(i, i_4_);
		    var_opengl
			.glTexCoord2f(f, aClass36_Sub1_Sub1_4745.aFloat6458);
		    var_opengl.glVertex2i(i, i_5_);
		}
		i_5_ += i_3_;
	    }
	    if (i_5_ < i_0_) {
		float f = (aClass36_Sub1_Sub1_4745.aFloat6458
			   * (float) (aClass36_Sub1_Sub1_4745.anInt6456
				      - (i_0_ - i_5_))
			   / (float) aClass36_Sub1_Sub1_4745.anInt6456);
		int i_8_ = arg0 + aClass36_Sub1_Sub1_4745.anInt6459;
		int i_9_ = arg0;
		while (i_8_ <= i) {
		    var_opengl.glTexCoord2f(0.0F, (aClass36_Sub1_Sub1_4745
						   .aFloat6458));
		    var_opengl.glVertex2i(i_9_, i_5_);
		    var_opengl.glTexCoord2f(0.0F, f);
		    var_opengl.glVertex2i(i_9_, i_0_);
		    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					    f);
		    var_opengl.glVertex2i(i_8_, i_0_);
		    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					    (aClass36_Sub1_Sub1_4745
					     .aFloat6458));
		    var_opengl.glVertex2i(i_8_, i_5_);
		    i_8_ += i_2_;
		    i_9_ += i_2_;
		}
		if (i_9_ < i) {
		    float f_10_
			= (aClass36_Sub1_Sub1_4745.aFloat6455
			   * (float) (i - i_9_)
			   / (float) aClass36_Sub1_Sub1_4745.anInt6459);
		    var_opengl.glTexCoord2f(0.0F, (aClass36_Sub1_Sub1_4745
						   .aFloat6458));
		    var_opengl.glVertex2i(i_9_, i_5_);
		    var_opengl.glTexCoord2f(0.0F, f);
		    var_opengl.glVertex2i(i_9_, i_0_);
		    var_opengl.glTexCoord2f(f_10_, f);
		    var_opengl.glVertex2i(i, i_0_);
		    var_opengl.glTexCoord2f(f_10_, (aClass36_Sub1_Sub1_4745
						    .aFloat6458));
		    var_opengl.glVertex2i(i, i_5_);
		}
	    }
	    var_opengl.glEnd();
	    var_opengl.glPopMatrix();
	}
    }
    
    public void method2215(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	aClass36_Sub1_Sub1_4745.method484(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    
    public int method2216() {
	return aClass36_Sub1_Sub1_4745.anInt6459 + anInt4747 + anInt4746;
    }
    
    public void method2214(int arg0, int arg1, Class183 arg2, int arg3,
			   int arg4) {
	Class183_Sub2 class183_sub2 = (Class183_Sub2) arg2;
	Class36_Sub1_Sub1 class36_sub1_sub1
	    = class183_sub2.aClass36_Sub1_Sub1_4966;
	aClass36_Sub1_Sub1_4745.method477(false);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	aClass130_Sub2_4748.method1342(0);
	aClass130_Sub2_4748.method1280(1);
	aClass130_Sub2_4748.method1347(class36_sub1_sub1);
	aClass130_Sub2_4748.method1314(7681, 8448);
	aClass130_Sub2_4748.method1298(0, 34168, 768);
	aClass130_Sub2_4748.method1284(1);
	arg0 += anInt4747;
	arg1 += anInt4743;
	int i = arg0 + aClass36_Sub1_Sub1_4745.anInt6459;
	int i_11_ = arg1 + aClass36_Sub1_Sub1_4745.anInt6456;
	float f = (class36_sub1_sub1.aFloat6455
		   / (float) class36_sub1_sub1.anInt6459);
	float f_12_ = (class36_sub1_sub1.aFloat6458
		       / (float) class36_sub1_sub1.anInt6456);
	float f_13_ = (float) (arg0 - arg3) * f;
	float f_14_ = (float) (i - arg3) * f;
	float f_15_
	    = class36_sub1_sub1.aFloat6458 - (float) (arg1 - arg4) * f_12_;
	float f_16_
	    = class36_sub1_sub1.aFloat6458 - (float) (i_11_ - arg4) * f_12_;
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	var_opengl.glBegin(7);
	var_opengl.glColor3f(1.0F, 1.0F, 1.0F);
	var_opengl.glMultiTexCoord2f(33984, 0.0F,
				     aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glMultiTexCoord2f(33985, f_13_, f_15_);
	var_opengl.glVertex2i(arg0, arg1);
	var_opengl.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	var_opengl.glMultiTexCoord2f(33985, f_13_, f_16_);
	var_opengl.glVertex2i(arg0, arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	var_opengl.glMultiTexCoord2f(33984, aClass36_Sub1_Sub1_4745.aFloat6455,
				     0.0F);
	var_opengl.glMultiTexCoord2f(33985, f_14_, f_16_);
	var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459,
			      arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	var_opengl.glMultiTexCoord2f(33984, aClass36_Sub1_Sub1_4745.aFloat6455,
				     aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glMultiTexCoord2f(33985, f_14_, f_15_);
	var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459, arg1);
	var_opengl.glEnd();
	aClass130_Sub2_4748.method1298(0, 5890, 768);
	aClass130_Sub2_4748.method1342(1);
	aClass130_Sub2_4748.method1347(null);
	aClass130_Sub2_4748.method1280(0);
    }
    
    public void method2208(int arg0, int arg1, int arg2, int arg3) {
	anInt4747 = arg0;
	anInt4743 = arg1;
	anInt4746 = arg2;
	anInt4744 = arg3;
	aBoolean4751 = (anInt4747 != 0 || anInt4743 != 0 || anInt4746 != 0
			|| anInt4744 != 0);
    }
    
    public int method2204() {
	return aClass36_Sub1_Sub1_4745.anInt6456;
    }
    
    public int method2198() {
	return aClass36_Sub1_Sub1_4745.anInt6456 + anInt4743 + anInt4744;
    }
    
    public void method2217(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5, int arg6, int arg7,
			   int arg8) {
	if (aBoolean4751) {
	    float f = (float) method2216();
	    float f_17_ = (float) method2198();
	    float f_18_ = (arg2 - arg0) / f;
	    float f_19_ = (arg3 - arg1) / f;
	    float f_20_ = (arg4 - arg0) / f_17_;
	    float f_21_ = (arg5 - arg1) / f_17_;
	    float f_22_ = f_20_ * (float) anInt4743;
	    float f_23_ = f_21_ * (float) anInt4743;
	    float f_24_ = f_18_ * (float) anInt4747;
	    float f_25_ = f_19_ * (float) anInt4747;
	    float f_26_ = -f_18_ * (float) anInt4746;
	    float f_27_ = -f_19_ * (float) anInt4746;
	    float f_28_ = -f_20_ * (float) anInt4744;
	    float f_29_ = -f_21_ * (float) anInt4744;
	    arg0 = arg0 + f_24_ + f_22_;
	    arg1 = arg1 + f_25_ + f_23_;
	    arg2 = arg2 + f_26_ + f_22_;
	    arg3 = arg3 + f_27_ + f_23_;
	    arg4 = arg4 + f_24_ + f_28_;
	    arg5 = arg5 + f_25_ + f_29_;
	}
	float f = arg4 + (arg2 - arg0);
	float f_30_ = arg3 + (arg5 - arg1);
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	aClass36_Sub1_Sub1_4745.method477(true);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	aClass130_Sub2_4748.method1284(arg8);
	aClass130_Sub2_4748.method1342(arg6);
	var_opengl.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8),
			      (byte) arg7, (byte) (arg7 >> 24));
	var_opengl.glBegin(7);
	var_opengl.glTexCoord2f(0.0F, aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glVertex2f(arg0, arg1);
	var_opengl.glTexCoord2f(0.0F, 0.0F);
	var_opengl.glVertex2f(arg4, arg5);
	var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455, 0.0F);
	var_opengl.glVertex2f(f, f_30_);
	var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
				aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glVertex2f(arg2, arg3);
	var_opengl.glEnd();
    }
    
    public void method2199(int arg0, int arg1, int arg2) {
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	var_opengl.glPixelTransferf(3348, 0.5F);
	var_opengl.glPixelTransferf(3349, 0.499F);
	var_opengl.glPixelTransferf(3352, 0.5F);
	var_opengl.glPixelTransferf(3353, 0.499F);
	var_opengl.glPixelTransferf(3354, 0.5F);
	var_opengl.glPixelTransferf(3355, 0.499F);
	aClass36_Sub1_Sub1_4749
	    = Class36_Sub1_Sub1.method489(aClass36_Sub1_Sub1_4745.anInt6456,
					  aClass130_Sub2_4748, arg1,
					  aClass36_Sub1_Sub1_4745.anInt6459,
					  arg0, (byte) 116);
	anInt4750 = arg2;
	var_opengl.glPixelTransferf(3348, 1.0F);
	var_opengl.glPixelTransferf(3349, 0.0F);
	var_opengl.glPixelTransferf(3352, 1.0F);
	var_opengl.glPixelTransferf(3353, 0.0F);
	var_opengl.glPixelTransferf(3354, 1.0F);
	var_opengl.glPixelTransferf(3355, 0.0F);
    }
    
    public void method2202(int arg0, int arg1, int arg2, int arg3, int arg4) {
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	aClass36_Sub1_Sub1_4745.method477(false);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1284(arg4);
	var_opengl.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
			      (byte) arg3, (byte) (arg3 >> 24));
	arg0 += anInt4747;
	arg1 += anInt4743;
	if (aClass36_Sub1_Sub1_4749 == null) {
	    aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	    aClass130_Sub2_4748.method1342(arg2);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0, arg1);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(arg0,
				  arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455, 0.0F);
	    var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459,
				  arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
				    aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459,
				  arg1);
	    var_opengl.glEnd();
	} else {
	    method2222(arg2);
	    aClass36_Sub1_Sub1_4749.method477(false);
	    var_opengl.glBegin(7);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F,
					 aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glTexCoord2f(0.0F, aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0, arg1);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(arg0,
				  arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	    var_opengl.glMultiTexCoord2f(33985,
					 aClass36_Sub1_Sub1_4745.aFloat6455,
					 0.0F);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455, 0.0F);
	    var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459,
				  arg1 + aClass36_Sub1_Sub1_4745.anInt6456);
	    var_opengl.glMultiTexCoord2f(33985,
					 aClass36_Sub1_Sub1_4745.aFloat6455,
					 aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
				    aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0 + aClass36_Sub1_Sub1_4745.anInt6459,
				  arg1);
	    var_opengl.glEnd();
	    method2221();
	}
    }
    
    public void method2222(int arg0) {
	aClass130_Sub2_4748.method1280(1);
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	aClass130_Sub2_4748.method1314(aClass130_Sub2_4748.method1330(arg0),
				       7681);
	aClass130_Sub2_4748.method1298(1, 34167, 768);
	aClass130_Sub2_4748.method1277(0, 34168, 770);
	aClass130_Sub2_4748.method1280(0);
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4749);
	aClass130_Sub2_4748.method1314(34479, 7681);
	aClass130_Sub2_4748.method1298(1, 34166, 768);
	if (anInt4750 == 0)
	    aClass130_Sub2_4748.method1308(1.0F, 0.5F, 0.5F, 0.0F);
	else if (anInt4750 == 1)
	    aClass130_Sub2_4748.method1308(0.5F, 1.0F, 0.5F, 0.0F);
	else if (anInt4750 == 2)
	    aClass130_Sub2_4748.method1308(0.5F, 0.5F, 1.0F, 0.0F);
	else if (anInt4750 == 3)
	    aClass130_Sub2_4748.method1308(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    public void method2207(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5, Class183 arg6, int arg7,
			   int arg8) {
	Class36_Sub1_Sub1 class36_sub1_sub1
	    = ((Class183_Sub2) arg6).aClass36_Sub1_Sub1_4966;
	if (aBoolean4751) {
	    float f = (float) method2216();
	    float f_31_ = (float) method2198();
	    float f_32_ = (arg2 - arg0) / f;
	    float f_33_ = (arg3 - arg1) / f;
	    float f_34_ = (arg4 - arg0) / f_31_;
	    float f_35_ = (arg5 - arg1) / f_31_;
	    float f_36_ = f_34_ * (float) anInt4743;
	    float f_37_ = f_35_ * (float) anInt4743;
	    float f_38_ = f_32_ * (float) anInt4747;
	    float f_39_ = f_33_ * (float) anInt4747;
	    float f_40_ = -f_32_ * (float) anInt4746;
	    float f_41_ = -f_33_ * (float) anInt4746;
	    float f_42_ = -f_34_ * (float) anInt4744;
	    float f_43_ = -f_35_ * (float) anInt4744;
	    arg0 = arg0 + f_38_ + f_36_;
	    arg1 = arg1 + f_39_ + f_37_;
	    arg2 = arg2 + f_40_ + f_36_;
	    arg3 = arg3 + f_41_ + f_37_;
	    arg4 = arg4 + f_38_ + f_42_;
	    arg5 = arg5 + f_39_ + f_43_;
	}
	float f = arg4 + (arg2 - arg0);
	float f_44_ = arg3 + (arg5 - arg1);
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	aClass36_Sub1_Sub1_4745.method477(true);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	aClass130_Sub2_4748.method1342(0);
	aClass130_Sub2_4748.method1280(1);
	aClass130_Sub2_4748.method1347(class36_sub1_sub1);
	aClass130_Sub2_4748.method1314(7681, 8448);
	aClass130_Sub2_4748.method1298(0, 34168, 768);
	aClass130_Sub2_4748.method1284(1);
	float f_45_ = (class36_sub1_sub1.aFloat6455
		       / (float) class36_sub1_sub1.anInt6459);
	float f_46_ = (class36_sub1_sub1.aFloat6458
		       / (float) class36_sub1_sub1.anInt6456);
	var_opengl.glBegin(7);
	var_opengl.glColor3f(1.0F, 1.0F, 1.0F);
	var_opengl.glMultiTexCoord2f(33984, 0.0F,
				     aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glMultiTexCoord2f(33985, f_45_ * (arg0 - (float) arg7),
				     (class36_sub1_sub1.aFloat6458
				      - f_46_ * (arg1 - (float) arg8)));
	var_opengl.glVertex2f(arg0, arg1);
	var_opengl.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	var_opengl.glMultiTexCoord2f(33985, f_45_ * (arg4 - (float) arg7),
				     (class36_sub1_sub1.aFloat6458
				      - f_46_ * (arg5 - (float) arg8)));
	var_opengl.glVertex2f(arg4, arg5);
	var_opengl.glMultiTexCoord2f(33984, aClass36_Sub1_Sub1_4745.aFloat6455,
				     0.0F);
	var_opengl.glMultiTexCoord2f(33985, f_45_ * (f - (float) arg7),
				     (class36_sub1_sub1.aFloat6458
				      - f_46_ * (f_44_ - (float) arg8)));
	var_opengl.glVertex2f(f, f_44_);
	var_opengl.glMultiTexCoord2f(33984, aClass36_Sub1_Sub1_4745.aFloat6455,
				     aClass36_Sub1_Sub1_4745.aFloat6458);
	var_opengl.glMultiTexCoord2f(33985, f_45_ * (arg2 - (float) arg7),
				     (class36_sub1_sub1.aFloat6458
				      - f_46_ * (arg3 - (float) arg8)));
	var_opengl.glVertex2f(arg2, arg3);
	var_opengl.glEnd();
	aClass130_Sub2_4748.method1298(0, 5890, 768);
	aClass130_Sub2_4748.method1342(1);
	aClass130_Sub2_4748.method1347(null);
	aClass130_Sub2_4748.method1280(0);
    }
    
    public int method2206() {
	return aClass36_Sub1_Sub1_4745.anInt6459;
    }
    
    public Class152_Sub2(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			 int arg4) {
	anInt4744 = 0;
	anInt4746 = 0;
	anInt4750 = 0;
	aBoolean4751 = false;
	aClass130_Sub2_4748 = arg0;
	aClass36_Sub1_Sub1_4745
	    = Class36_Sub1_Sub1.method489(arg4, arg0, arg2, arg3, arg1,
					  (byte) 116);
    }
    
    public Class152_Sub2(Class130_Sub2 arg0, int arg1, int arg2, int[] arg3,
			 int arg4, int arg5) {
	anInt4744 = 0;
	anInt4746 = 0;
	anInt4750 = 0;
	aBoolean4751 = false;
	aClass130_Sub2_4748 = arg0;
	aClass36_Sub1_Sub1_4745
	    = Class36_Sub1_Sub1.method488(arg2, arg0, arg1, -100, arg3, false);
    }
    
    public void method2201(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	opengl var_opengl = aClass130_Sub2_4748.anOpengl3304;
	aClass36_Sub1_Sub1_4745.method477(true);
	aClass130_Sub2_4748.method1299();
	aClass130_Sub2_4748.method1284(arg6);
	var_opengl.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8),
			      (byte) arg5, (byte) (arg5 >> 24));
	if (aBoolean4751) {
	    float f = (float) arg2 / (float) method2216();
	    float f_47_ = (float) arg3 / (float) method2198();
	    float f_48_ = (float) arg0 + (float) anInt4747 * f;
	    float f_49_ = (float) arg1 + (float) anInt4743 * f_47_;
	    float f_50_
		= f_48_ + (float) aClass36_Sub1_Sub1_4745.anInt6459 * f;
	    float f_51_
		= f_49_ + (float) aClass36_Sub1_Sub1_4745.anInt6456 * f_47_;
	    if (aClass36_Sub1_Sub1_4749 == null) {
		aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
		aClass130_Sub2_4748.method1342(arg4);
		var_opengl.glBegin(7);
		var_opengl.glTexCoord2f(0.0F,
					aClass36_Sub1_Sub1_4745.aFloat6458);
		var_opengl.glVertex2f(f_48_, f_49_);
		var_opengl.glTexCoord2f(0.0F, 0.0F);
		var_opengl.glVertex2f(f_48_, f_51_);
		var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					0.0F);
		var_opengl.glVertex2f(f_50_, f_51_);
		var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					aClass36_Sub1_Sub1_4745.aFloat6458);
		var_opengl.glVertex2f(f_50_, f_49_);
		var_opengl.glEnd();
	    } else {
		method2222(arg4);
		aClass36_Sub1_Sub1_4749.method477(true);
		var_opengl.glBegin(7);
		var_opengl.glMultiTexCoord2f(33985, 0.0F,
					     (aClass36_Sub1_Sub1_4745
					      .aFloat6458));
		var_opengl.glTexCoord2f(0.0F,
					aClass36_Sub1_Sub1_4745.aFloat6458);
		var_opengl.glVertex2f(f_48_, f_49_);
		var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		var_opengl.glTexCoord2f(0.0F, 0.0F);
		var_opengl.glVertex2f(f_48_, f_51_);
		var_opengl.glMultiTexCoord2f(33985, (aClass36_Sub1_Sub1_4745
						     .aFloat6455), 0.0F);
		var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					0.0F);
		var_opengl.glVertex2f(f_50_, f_51_);
		var_opengl.glMultiTexCoord2f(33985,
					     (aClass36_Sub1_Sub1_4745
					      .aFloat6455),
					     (aClass36_Sub1_Sub1_4745
					      .aFloat6458));
		var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
					aClass36_Sub1_Sub1_4745.aFloat6458);
		var_opengl.glVertex2f(f_50_, f_49_);
		var_opengl.glEnd();
		method2221();
	    }
	} else if (aClass36_Sub1_Sub1_4749 == null) {
	    aClass130_Sub2_4748.method1347(aClass36_Sub1_Sub1_4745);
	    aClass130_Sub2_4748.method1342(arg4);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0, arg1);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(arg0, arg1 + arg3);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455, 0.0F);
	    var_opengl.glVertex2i(arg0 + arg2, arg1 + arg3);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
				    aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0 + arg2, arg1);
	    var_opengl.glEnd();
	} else {
	    method2222(arg4);
	    aClass36_Sub1_Sub1_4749.method477(true);
	    var_opengl.glBegin(7);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F,
					 aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glTexCoord2f(0.0F, aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0, arg1);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(arg0, arg1 + arg3);
	    var_opengl.glMultiTexCoord2f(33985,
					 aClass36_Sub1_Sub1_4745.aFloat6455,
					 0.0F);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455, 0.0F);
	    var_opengl.glVertex2i(arg0 + arg2, arg1 + arg3);
	    var_opengl.glMultiTexCoord2f(33985,
					 aClass36_Sub1_Sub1_4745.aFloat6455,
					 aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glTexCoord2f(aClass36_Sub1_Sub1_4745.aFloat6455,
				    aClass36_Sub1_Sub1_4745.aFloat6458);
	    var_opengl.glVertex2i(arg0 + arg2, arg1);
	    var_opengl.glEnd();
	    method2221();
	}
    }
}
