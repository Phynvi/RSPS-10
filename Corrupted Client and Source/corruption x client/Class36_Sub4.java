/* Class36_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaggl.opengl;

public class Class36_Sub4 extends Class36
{
    public int anInt5205;
    
    public void method491(int arg0, boolean arg1) {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glTexParameteri(anInt3454, arg0, !arg1 ? 33071 : 10497);
    }
    
    public void method34() {
	/* empty */
    }
    
    public Class36_Sub4(Class130_Sub2 arg0, int arg1, int arg2, byte[] arg3,
			int arg4) {
	super(arg0, 3552, arg1, arg2, false);
	anInt5205 = arg2;
	opengl var_opengl = arg0.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	var_opengl.glPixelStorei(3317, 1);
	var_opengl.glTexImage1D(anInt3454, 0, anInt3449, anInt5205, 0, arg4,
				5121, ByteBuffer.wrap(arg3));
	var_opengl.glPixelStorei(3317, 4);
	method477(true);
    }
}
