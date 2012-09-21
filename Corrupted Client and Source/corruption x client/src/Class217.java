/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class217 implements Interface9
{
    public int anInt3457;
    public Class130_Sub2 aClass130_Sub2_3458;
    public int anInt3459;
    public int anInt3460 = -1;
    public static int[] anIntArray3461 = new int[1];
    public int anInt3462;
    public int anInt3463;
    public int anInt3464;
    
    public void method2818() {
	if (anInt3462 > 0) {
	    aClass130_Sub2_3458.method1296(anInt3462, anInt3459);
	    anInt3462 = 0;
	}
    }
    
    public void method34() {
	aClass130_Sub2_3458.anOpengl3304
	    .glFramebufferRenderbufferEXT(36160, anInt3460, 36161, 0);
	anInt3460 = -1;
    }
    
    public void finalize() throws Throwable {
	method2818();
	super.finalize();
    }
    
    public void method2819(int arg0) {
	aClass130_Sub2_3458.anOpengl3304
	    .glFramebufferRenderbufferEXT(36160, arg0, 36161, anInt3462);
	anInt3460 = arg0;
    }
    
    public Class217(Class130_Sub2 arg0, int arg1, int arg2, int arg3) {
	aClass130_Sub2_3458 = arg0;
	anInt3463 = arg2;
	anInt3464 = arg3;
	anInt3457 = arg1;
	opengl var_opengl = aClass130_Sub2_3458.anOpengl3304;
	var_opengl.glGenRenderbuffersEXT(1, anIntArray3461, 0);
	anInt3462 = anIntArray3461[0];
	var_opengl.glBindRenderbufferEXT(36161, anInt3462);
	var_opengl.glRenderbufferStorageEXT(36161, anInt3457, anInt3463,
					    anInt3464);
	anInt3459 = (anInt3463 * anInt3464
		     * aClass130_Sub2_3458.method1291(anInt3457));
    }
}
