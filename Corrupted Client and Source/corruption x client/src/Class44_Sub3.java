/* Class44_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class44_Sub3 extends Class44
{
    public Class130_Sub2 aClass130_Sub2_3776;
    public Class54 aClass54_3777;
    public boolean aBoolean3778;
    public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_3779;
    
    public Class44_Sub3(Class130_Sub2 arg0, Class55 arg1, Class124[] arg2,
			boolean arg3) {
	super(arg0, arg1);
	aClass130_Sub2_3776 = arg0;
	opengl var_opengl = arg0.anOpengl3304;
	int i = 0;
	for (int i_0_ = 0; i_0_ < 256; i_0_++) {
	    Class124 class124 = arg2[i_0_];
	    if (class124.anInt1619 > i)
		i = class124.anInt1619;
	    if (class124.anInt1623 > i)
		i = class124.anInt1623;
	}
	int i_1_ = i * 16;
	if (arg3) {
	    byte[] is = new byte[i_1_ * i_1_];
	    for (int i_2_ = 0; i_2_ < 256; i_2_++) {
		Class124 class124 = arg2[i_2_];
		byte[] is_3_ = class124.aByteArray1626;
		int i_4_ = class124.anInt1619;
		int i_5_ = class124.anInt1623;
		int i_6_ = i_2_ % 16 * i;
		int i_7_ = i_2_ / 16 * i;
		int i_8_ = i_7_ * i_1_ + i_6_;
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
		    for (int i_11_ = 0; i_11_ < i_5_; i_11_++)
			is[i_8_++] = is_3_[i_9_++] == 0 ? (byte) 0 : (byte) -1;
		    i_8_ += i_1_ - i_5_;
		}
	    }
	    aClass36_Sub1_Sub1_3779
		= Class36_Sub1_Sub1.method487(arg0, i_1_, is, 6406, false,
					      6406, i_1_, -128);
	    aBoolean3778 = true;
	} else {
	    int[] is = new int[i_1_ * i_1_];
	    for (int i_12_ = 0; i_12_ < 256; i_12_++) {
		Class124 class124 = arg2[i_12_];
		int[] is_13_ = class124.anIntArray1624;
		byte[] is_14_ = class124.aByteArray1622;
		byte[] is_15_ = class124.aByteArray1626;
		int i_16_ = class124.anInt1619;
		int i_17_ = class124.anInt1623;
		int i_18_ = i_12_ % 16 * i;
		int i_19_ = i_12_ / 16 * i;
		int i_20_ = i_19_ * i_1_ + i_18_;
		int i_21_ = 0;
		if (is_14_ != null) {
		    for (int i_22_ = 0; i_22_ < i_16_; i_22_++) {
			for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
			    is[i_20_++] = (is_14_[i_21_] << 24
					   | is_13_[is_15_[i_21_] & 0xff]);
			    i_21_++;
			}
			i_20_ += i_1_ - i_17_;
		    }
		} else {
		    for (int i_24_ = 0; i_24_ < i_16_; i_24_++) {
			for (int i_25_ = 0; i_25_ < i_17_; i_25_++)
			    is[i_20_++]
				= ~0xffffff | is_13_[is_15_[i_21_++] & 0xff];
			i_20_ += i_1_ - i_17_;
		    }
		}
	    }
	    aClass36_Sub1_Sub1_3779
		= Class36_Sub1_Sub1.method488(i_1_, arg0, i_1_, 126, is,
					      false);
	    aBoolean3778 = false;
	}
	aClass36_Sub1_Sub1_3779.method477(false);
	aClass54_3777 = new Class54(arg0, 256);
	float f = (aClass36_Sub1_Sub1_3779.aFloat6455
		   / (float) aClass36_Sub1_Sub1_3779.anInt6459);
	float f_26_ = (aClass36_Sub1_Sub1_3779.aFloat6458
		       / (float) aClass36_Sub1_Sub1_3779.anInt6456);
	for (int i_27_ = 0; i_27_ < 256; i_27_++) {
	    Class124 class124 = arg2[i_27_];
	    int i_28_ = class124.anInt1619;
	    int i_29_ = class124.anInt1623;
	    int i_30_ = class124.anInt1618;
	    int i_31_ = class124.anInt1625;
	    float f_32_ = (float) (i_27_ % 16 * i);
	    float f_33_ = (float) (i_27_ / 16 * i);
	    float f_34_ = f_32_ * f;
	    float f_35_ = f_33_ * f_26_;
	    float f_36_ = (f_32_ + (float) i_29_) * f;
	    float f_37_ = (f_33_ + (float) i_28_) * f_26_;
	    aClass54_3777.method607(i_27_);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(f_34_, (aClass36_Sub1_Sub1_3779.aFloat6458
					    - f_35_));
	    var_opengl.glVertex2i(i_31_, i_30_);
	    var_opengl.glTexCoord2f(f_34_, (aClass36_Sub1_Sub1_3779.aFloat6458
					    - f_37_));
	    var_opengl.glVertex2i(i_31_, i_30_ + i_28_);
	    var_opengl.glTexCoord2f(f_36_, (aClass36_Sub1_Sub1_3779.aFloat6458
					    - f_37_));
	    var_opengl.glVertex2i(i_31_ + i_29_, i_30_ + i_28_);
	    var_opengl.glTexCoord2f(f_36_, (aClass36_Sub1_Sub1_3779.aFloat6458
					    - f_35_));
	    var_opengl.glVertex2i(i_31_ + i_29_, i_30_);
	    var_opengl.glEnd();
	    aClass54_3777.method608();
	}
    }
    
    public void method544(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	opengl var_opengl = aClass130_Sub2_3776.anOpengl3304;
	aClass130_Sub2_3776.method1317();
	aClass130_Sub2_3776.method1347(aClass36_Sub1_Sub1_3779);
	if (aBoolean3778 || arg4) {
	    aClass130_Sub2_3776.method1314(7681, 8448);
	    aClass130_Sub2_3776.method1298(0, 34168, 768);
	}
	var_opengl.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
			      (byte) arg3, (byte) (arg3 >> 24));
	var_opengl.glTranslatef((float) arg1, (float) arg2, 0.0F);
	aClass54_3777.method609(arg0);
	var_opengl.glLoadIdentity();
	if (aBoolean3778 || arg4)
	    aClass130_Sub2_3776.method1298(0, 5890, 768);
    }
    
    public void method534(char arg0, int arg1, int arg2, int arg3,
			  boolean arg4, Class183 arg5, int arg6, int arg7) {
	Class183_Sub2 class183_sub2 = (Class183_Sub2) arg5;
	Class36_Sub1_Sub1 class36_sub1_sub1
	    = class183_sub2.aClass36_Sub1_Sub1_4966;
	opengl var_opengl = aClass130_Sub2_3776.anOpengl3304;
	aClass130_Sub2_3776.method1317();
	aClass130_Sub2_3776.method1347(aClass36_Sub1_Sub1_3779);
	if (aBoolean3778 || arg4) {
	    aClass130_Sub2_3776.method1314(7681, 8448);
	    aClass130_Sub2_3776.method1298(0, 34168, 768);
	}
	aClass130_Sub2_3776.method1280(1);
	aClass130_Sub2_3776.method1347(class36_sub1_sub1);
	aClass130_Sub2_3776.method1314(7681, 8448);
	aClass130_Sub2_3776.method1298(0, 34168, 768);
	var_opengl.glTexGeni(8192, 9472, 9216);
	var_opengl.glTexGeni(8193, 9472, 9216);
	float f = (class36_sub1_sub1.aFloat6455
		   / (float) class36_sub1_sub1.anInt6459);
	float f_38_ = (class36_sub1_sub1.aFloat6458
		       / (float) class36_sub1_sub1.anInt6456);
	var_opengl.glTexGenfv(8192, 9474,
			      new float[] { f, 0.0F, 0.0F, (float) -arg6 * f },
			      0);
	var_opengl.glTexGenfv(8193, 9474,
			      new float[] { 0.0F, f_38_, 0.0F,
					    (float) -arg7 * f_38_ },
			      0);
	var_opengl.glEnable(3168);
	var_opengl.glEnable(3169);
	var_opengl.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
			      (byte) arg3, (byte) (arg3 >> 24));
	var_opengl.glTranslatef((float) arg1, (float) arg2, 0.0F);
	aClass54_3777.method609(arg0);
	var_opengl.glLoadIdentity();
	var_opengl.glDisable(3168);
	var_opengl.glDisable(3169);
	aClass130_Sub2_3776.method1298(0, 5890, 768);
	aClass130_Sub2_3776.method1314(8448, 8448);
	aClass130_Sub2_3776.method1347(null);
	aClass130_Sub2_3776.method1280(0);
	if (aBoolean3778 || arg4)
	    aClass130_Sub2_3776.method1298(0, 5890, 768);
    }
}
