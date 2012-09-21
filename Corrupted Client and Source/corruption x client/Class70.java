/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class70
{
    public int anInt935;
    public Class130_Sub2 aClass130_Sub2_936;
    public static int[] anIntArray937 = new int[2];
    
    public void finalize() throws Throwable {
	aClass130_Sub2_936.method1326(anInt935);
	super.finalize();
    }
    
    public static Class70 method740(Class130_Sub2 arg0, int arg1,
				    String arg2) {
	opengl var_opengl = arg0.anOpengl3304;
	int i = var_opengl.glCreateShaderObjectARB(arg1);
	var_opengl.glShaderSourceARB(i, 1, new String[] { arg2 },
				     new int[] { arg2.length() }, 0);
	var_opengl.glCompileShaderARB(i);
	var_opengl.glGetObjectParameterivARB(i, 35713, anIntArray937, 0);
	if (anIntArray937[0] == 0) {
	    if (anIntArray937[0] == 0)
		System.out.println("Shader compile failed:");
	    var_opengl.glGetObjectParameterivARB(i, 35716, anIntArray937, 1);
	    if (anIntArray937[1] > 1) {
		byte[] is = new byte[anIntArray937[1]];
		var_opengl.glGetInfoLogARB(i, anIntArray937[1], anIntArray937,
					   0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray937[0] == 0) {
		var_opengl.glDeleteObjectARB(i);
		return null;
	    }
	}
	return new Class70(arg0, i, arg1);
    }
    
    public Class70(Class130_Sub2 arg0, int arg1, int arg2) {
	aClass130_Sub2_936 = arg0;
	anInt935 = arg1;
    }
}
