/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class25
{
    public static int[] anIntArray262 = new int[2];
    public Class130_Sub2 aClass130_Sub2_263;
    public int anInt264;
    
    public static Class25 method405(Class130_Sub2 arg0, Class70[] arg1) {
	for (int i = 0; i < arg1.length; i++) {
	    if (arg1[i] == null || arg1[i].anInt935 <= 0)
		return null;
	}
	opengl var_opengl = arg0.anOpengl3304;
	int i = var_opengl.glCreateProgramObjectARB();
	for (int i_0_ = 0; i_0_ < arg1.length; i_0_++)
	    var_opengl.glAttachObjectARB(i, arg1[i_0_].anInt935);
	var_opengl.glLinkProgramARB(i);
	var_opengl.glGetObjectParameterivARB(i, 35714, anIntArray262, 0);
	if (anIntArray262[0] == 0) {
	    if (anIntArray262[0] == 0)
		System.out.println("Shader linking failed:");
	    var_opengl.glGetObjectParameterivARB(i, 35716, anIntArray262, 1);
	    if (anIntArray262[1] > 1) {
		byte[] is = new byte[anIntArray262[1]];
		var_opengl.glGetInfoLogARB(i, anIntArray262[1], anIntArray262,
					   0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray262[0] == 0) {
		for (int i_1_ = 0; i_1_ < arg1.length; i_1_++)
		    var_opengl.glDetachObjectARB(i, arg1[i_1_].anInt935);
		var_opengl.glDeleteObjectARB(i);
		return null;
	    }
	}
	return new Class25(arg0, i, arg1);
    }
    
    public void finalize() throws Throwable {
	aClass130_Sub2_263.method1326(anInt264);
	super.finalize();
    }
    
    public Class25(Class130_Sub2 arg0, int arg1, Class70[] arg2) {
	aClass130_Sub2_263 = arg0;
	anInt264 = arg1;
    }
}
