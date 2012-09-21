/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaggl.opengl;

public abstract class Class178
{
    public boolean aBoolean2532;
    public static int[] anIntArray2533 = new int[1];
    public int anInt2534;
    public Class130_Sub2 aClass130_Sub2_2535;
    public int anInt2536;
    public int anInt2537;
    
    public int method4() {
	return anInt2537;
    }
    
    public abstract void method2493();
    
    public void finalize() throws Throwable {
	aClass130_Sub2_2535.method1304(anInt2537, anInt2536);
	super.finalize();
    }
    
    public void method2494(byte[] arg0, int arg1) {
	method2493();
	if (arg1 > anInt2536) {
	    aClass130_Sub2_2535.anOpengl3304.glBufferDataARB
		(anInt2534, arg1, ByteBuffer.wrap(arg0, 0, arg1),
		 aBoolean2532 ? 35040 : 35044);
	    aClass130_Sub2_2535.anInt3316 += arg1 - anInt2536;
	    anInt2536 = arg1;
	} else
	    aClass130_Sub2_2535.anOpengl3304.glBufferSubDataARB
		(anInt2534, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
    }
    
    public Class178(Class130_Sub2 arg0, int arg1, byte[] arg2, int arg3,
		    boolean arg4) {
	aClass130_Sub2_2535 = arg0;
	anInt2534 = arg1;
	anInt2536 = arg3;
	aBoolean2532 = arg4;
	opengl var_opengl = arg0.anOpengl3304;
	var_opengl.glGenBuffersARB(1, anIntArray2533, 0);
	anInt2537 = anIntArray2533[0];
	method2493();
	var_opengl.glBufferDataARB(arg1, anInt2536,
				   (arg2 != null
				    ? ByteBuffer.wrap(arg2, 0, anInt2536)
				    : null),
				   aBoolean2532 ? 35040 : 35044);
	aClass130_Sub2_2535.anInt3316 += anInt2536;
    }
    
    public Class178(Class130_Sub2 arg0, int arg1, ByteBuffer arg2,
		    boolean arg3) {
	aClass130_Sub2_2535 = arg0;
	anInt2534 = arg1;
	anInt2536 = arg2.limit();
	aBoolean2532 = arg3;
	opengl var_opengl = arg0.anOpengl3304;
	var_opengl.glGenBuffersARB(1, anIntArray2533, 0);
	anInt2537 = anIntArray2533[0];
	method2493();
	var_opengl.glBufferDataARB(arg1, anInt2536, arg2,
				   aBoolean2532 ? 35040 : 35044);
	aClass130_Sub2_2535.anInt3316 += anInt2536;
    }
}
