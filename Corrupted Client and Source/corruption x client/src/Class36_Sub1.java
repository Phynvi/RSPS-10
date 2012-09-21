/* Class36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import jaggl.opengl;

public class Class36_Sub1 extends Class36
{
    public int anInt5196;
    public int anInt5197;
    public int anInt5198 = -1;
    
    public Class36_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, boolean arg5, float[] arg6, int arg7) {
	super(arg0, arg1, arg2, arg3 * arg4, arg5);
	anInt5197 = arg3;
	anInt5196 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	if (arg5 && anInt3454 != 34037) {
	    method479(var_opengl, arg1, arg2, arg3, arg4, arg7, arg6);
	    method480(true);
	} else {
	    var_opengl.glTexImage2D(anInt3454, 0, anInt3449, anInt5197,
				    anInt5196, 0, arg7, 5126,
				    FloatBuffer.wrap(arg6));
	    method480(false);
	}
	method477(true);
    }
    
    public Class36_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4) {
	super(arg0, arg1, arg2, arg3 * arg4, false);
	anInt5197 = arg3;
	anInt5196 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glTexImage2D(anInt3454, 0, anInt3449, arg3, arg4, 0,
				method469(anInt3449), 5121, null);
	method477(true);
    }
    
    public void method482(int arg0, int arg1, int arg2, int arg3, byte[] arg4,
			  int arg5, int arg6, int arg7, boolean arg8) {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	if (arg7 == 0)
	    arg7 = arg2;
	if (arg8) {
	    int i = method478(arg5);
	    int i_0_ = i * arg2;
	    int i_1_ = i * arg7;
	    byte[] is = new byte[i_0_ * arg3];
	    for (int i_2_ = 0; i_2_ < arg3; i_2_++) {
		int i_3_ = i_2_ * i_0_;
		int i_4_ = (arg3 - i_2_ - 1) * i_1_ + arg6;
		for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
		    is[i_3_++] = arg4[i_4_++];
	    }
	    arg4 = is;
	}
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glPixelStorei(3317, 1);
	if (arg7 != arg2)
	    var_opengl.glPixelStorei(3314, arg7);
	var_opengl.glTexSubImage2D(anInt3454, 0, arg0, arg1, arg2, arg3, arg5,
				   5121,
				   ByteBuffer.wrap(arg4, arg6,
						   arg4.length - arg6));
	if (arg7 != arg2)
	    var_opengl.glPixelStorei(3314, 0);
	var_opengl.glPixelStorei(3317, 4);
    }
    
    public void method34() {
	aClass130_Sub2_3450.anOpengl3304
	    .glFramebufferTexture2DEXT(36160, anInt5198, anInt3454, 0, 0);
	anInt5198 = -1;
    }
    
    public void method483(int arg0, int arg1) {
	aClass130_Sub2_3450.anOpengl3304.glFramebufferTexture2DEXT(36160, arg0,
								   anInt3454,
								   anInt3452,
								   arg1);
	anInt5198 = arg0;
    }
    
    public Class36_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
	super(arg0, arg1, 6407, arg4 * arg5, false);
	anInt5197 = arg4;
	anInt5196 = arg5;
	opengl var_opengl = arg0.anOpengl3304;
	int i = aClass130_Sub2_3450.method1285().method17() - (arg3 + arg5);
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glCopyTexImage2D(anInt3454, 0, anInt3449, arg2, i, arg4,
				    arg5, 0);
	method477(true);
    }
    
    public Class36_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, boolean arg5, byte[] arg6, int arg7,
			boolean arg8) {
	super(arg0, arg1, arg2, arg3 * arg4, arg5);
	anInt5197 = arg3;
	anInt5196 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	if (arg8) {
	    byte[] is = new byte[arg6.length];
	    for (int i = 0; i < arg4; i++) {
		int i_6_ = i * arg3;
		int i_7_ = (arg4 - i - 1) * arg3;
		for (int i_8_ = 0; i_8_ < arg3; i_8_++)
		    is[i_6_++] = arg6[i_7_++];
	    }
	    arg6 = is;
	}
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glPixelStorei(3317, 1);
	if (arg5 && anInt3454 != 34037) {
	    method472(var_opengl, arg1, arg2, arg3, arg4, arg7, arg6);
	    method480(true);
	} else {
	    var_opengl.glTexImage2D(anInt3454, 0, anInt3449, anInt5197,
				    anInt5196, 0, arg7, 5121,
				    ByteBuffer.wrap(arg6));
	    method480(false);
	}
	var_opengl.glPixelStorei(3317, 4);
	method477(true);
    }
    
    public void method484(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	int i = aClass130_Sub2_3450.method1285().method17() - (arg5 + arg3);
	aClass130_Sub2_3450.method1347(this);
	aClass130_Sub2_3450.anOpengl3304.glCopyTexSubImage2D(anInt3454, 0,
							     arg0,
							     (anInt5196
							      - (arg1 + arg3)),
							     arg4, i, arg2,
							     arg3);
	aClass130_Sub2_3450.anOpengl3304.glFlush();
    }
    
    public void method485(boolean arg0, boolean arg1) {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	if (anInt3454 == 3553) {
	    aClass130_Sub2_3450.method1347(this);
	    var_opengl.glTexParameteri(anInt3454, 10242, arg0 ? 10497 : 33071);
	    var_opengl.glTexParameteri(anInt3454, 10243, arg1 ? 10497 : 33071);
	}
    }
    
    public Class36_Sub1(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, boolean arg5, int[] arg6, boolean arg7) {
	super(arg0, arg1, arg2, arg3 * arg4, arg5);
	anInt5197 = arg3;
	anInt5196 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	if (arg7) {
	    int[] is = new int[arg6.length];
	    for (int i = 0; i < arg4; i++) {
		int i_9_ = i * arg3;
		int i_10_ = (arg4 - i - 1) * arg3;
		for (int i_11_ = 0; i_11_ < arg3; i_11_++)
		    is[i_9_++] = arg6[i_10_++];
	    }
	    arg6 = is;
	}
	aClass130_Sub2_3450.method1347(this);
	if (arg5 && anInt3454 != 34037) {
	    method470(var_opengl, anInt3454, anInt3449, anInt5197, anInt5196,
		      32993, aClass130_Sub2_3450.anInt3432, arg6);
	    method480(true);
	} else {
	    var_opengl.glTexImage2D(anInt3454, 0, anInt3449, anInt5197,
				    anInt5196, 0, 32993,
				    aClass130_Sub2_3450.anInt3432,
				    IntBuffer.wrap(arg6));
	    method480(false);
	}
	method477(true);
    }
    
    public void method486(int arg0, int arg1, int arg2, int arg3, int[] arg4,
			  int arg5, int arg6, boolean arg7) {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	if (arg6 == 0)
	    arg6 = arg2;
	if (arg7) {
	    int[] is = new int[arg2 * arg3];
	    for (int i = 0; i < arg3; i++) {
		int i_12_ = i * arg2;
		int i_13_ = (arg3 - i - 1) * arg6 + arg5;
		for (int i_14_ = 0; i_14_ < arg2; i_14_++)
		    is[i_12_++] = arg4[i_13_++];
	    }
	    arg4 = is;
	}
	aClass130_Sub2_3450.method1347(this);
	if (arg2 != arg6)
	    var_opengl.glPixelStorei(3314, arg6);
	var_opengl.glTexSubImage2D(anInt3454, 0, arg0, arg1, arg2, arg3, 32993,
				   aClass130_Sub2_3450.anInt3432,
				   IntBuffer.wrap(arg4, arg5,
						  arg4.length - arg5));
	if (arg2 != arg6)
	    var_opengl.glPixelStorei(3314, 0);
    }
}
