/* Class36_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaggl.opengl;

public class Class36_Sub2 extends Class36
{
    public int anInt5199;
    public int anInt5200 = -1;
    public int anInt5201;
    public int anInt5202;
    
    public Class36_Sub2(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
			int arg4, byte[] arg5, int arg6) {
	super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
	anInt5201 = arg2;
	anInt5199 = arg3;
	anInt5202 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glTexImage3D(anInt3454, 0, anInt3449, anInt5201, anInt5199,
				anInt5202, 0, arg6, 5121,
				ByteBuffer.wrap(arg5));
	method477(true);
    }
    
    public void method34() {
	aClass130_Sub2_3450.anOpengl3304
	    .glFramebufferTexture3DEXT(36160, anInt5200, anInt3454, 0, 0, 0);
	anInt5200 = -1;
    }
}
