/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class26
{
    public static int[] anIntArray265 = new int[1];
    public int anInt266;
    public Class130_Sub2 aClass130_Sub2_267;
    
    public static Class26 method406(Class130_Sub2 arg0, int arg1,
				    String arg2) {
	opengl var_opengl = arg0.anOpengl3304;
	var_opengl.glGenProgramsARB(1, anIntArray265, 0);
	int i = anIntArray265[0];
	var_opengl.glBindProgramARB(arg1, i);
	var_opengl.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
	var_opengl.glGetIntegerv(34379, anIntArray265, 0);
	if (anIntArray265[0] != -1) {
	    var_opengl.glBindProgramARB(arg1, 0);
	    return null;
	}
	var_opengl.glBindProgramARB(arg1, 0);
	return new Class26(arg0, arg1, i);
    }
    
    public void finalize() throws Throwable {
	aClass130_Sub2_267.method1309(anInt266);
	super.finalize();
    }
    
    public Class26(Class130_Sub2 arg0, int arg1, int arg2) {
	aClass130_Sub2_267 = arg0;
	anInt266 = arg2;
    }
}
