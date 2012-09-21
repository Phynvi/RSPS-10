/* Class36_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import jaggl.opengl;

public class Class36_Sub3 extends Class36
{
    public int anInt5203;
    public int anInt5204;
    
    public void method490(int arg0, int arg1, int arg2) {
	aClass130_Sub2_3450.anOpengl3304
	    .glFramebufferTexture2DEXT(36160, arg0, arg2, anInt3452, arg1);
	anInt5203 = arg0;
    }
    
    public Class36_Sub3(Class130_Sub2 arg0, int arg1, int arg2, boolean arg3,
			int[][] arg4) {
	super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	anInt5204 = arg2;
	aClass130_Sub2_3450.method1347(this);
	if (arg3) {
	    for (int i = 0; i < 6; i++)
		method470(var_opengl, 34069 + i, anInt3449, arg2, arg2, 32993,
			  aClass130_Sub2_3450.anInt3432, arg4[i]);
	} else {
	    for (int i = 0; i < 6; i++)
		var_opengl.glTexImage2D(34069 + i, 0, anInt3449, arg2, arg2, 0,
					32993, aClass130_Sub2_3450.anInt3432,
					IntBuffer.wrap(arg4[i]));
	}
	method477(true);
    }
    
    public Class36_Sub3(Class130_Sub2 arg0, int arg1, int arg2, boolean arg3,
			byte[][] arg4, int arg5) {
	super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	anInt5204 = arg2;
	aClass130_Sub2_3450.method1347(this);
	for (int i = 0; i < 6; i++)
	    var_opengl.glTexImage2D(34069 + i, 0, anInt3449, arg2, arg2, 0,
				    arg5, 5121, ByteBuffer.wrap(arg4[i]));
	method477(true);
    }
    
    public Class36_Sub3(Class130_Sub2 arg0, int arg1, int arg2) {
	super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	anInt5204 = arg2;
	aClass130_Sub2_3450.method1347(this);
	for (int i = 0; i < 6; i++)
	    var_opengl.glTexImage2D(34069 + i, 0, anInt3449, arg2, arg2, 0,
				    32993, aClass130_Sub2_3450.anInt3432,
				    null);
	method477(true);
    }
    
    public void method34() {
	aClass130_Sub2_3450.anOpengl3304
	    .glFramebufferTexture2DEXT(36160, anInt5203, 3553, 0, 0);
	anInt5203 = -1;
    }
}
