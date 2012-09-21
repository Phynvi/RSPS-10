/* Class83_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class83_Sub1_Sub1 extends Class83_Sub1
{
    public Class36_Sub3 aClass36_Sub3_5412;
    public static int[] anIntArray5413 = new int[4];
    public Class130_Sub2 aClass130_Sub2_5414;
    
    public Class36_Sub3 method802(int arg0) {
	Class36_Sub3 class36_sub3;
	try {
	    if (arg0 != -1457)
		method804(false);
	    class36_sub3 = aClass36_Sub3_5412;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class36_sub3;
    }
    
    public void method803(int arg0, Class36_Sub3 arg1, Class36_Sub3 arg2,
			  float arg3) {
	opengl var_opengl = aClass130_Sub2_5414.anOpengl3304;
	Class102 class102 = aClass130_Sub2_5414.aClass102_3377;
	if (((aClass130_Sub2_5414.aClass36_Sub1_3340.anInt5197 ^ 0xffffffff)
	     != (arg1.anInt5204 ^ 0xffffffff))
	    || ((arg1.anInt5204 ^ 0xffffffff)
		!= (aClass130_Sub2_5414.aClass36_Sub1_3340.anInt5196
		    ^ 0xffffffff)))
	    aClass130_Sub2_5414.aClass36_Sub1_3340
		= new Class36_Sub1(aClass130_Sub2_5414, 3553, 6408,
				   arg1.anInt5204, arg1.anInt5204);
	if (arg2.anInt5204 != aClass130_Sub2_5414.aClass36_Sub1_3434.anInt5197
	    || (arg2.anInt5204
		!= aClass130_Sub2_5414.aClass36_Sub1_3434.anInt5196))
	    aClass130_Sub2_5414.aClass36_Sub1_3434
		= new Class36_Sub1(aClass130_Sub2_5414, 3553, 6408,
				   arg2.anInt5204, arg2.anInt5204);
	aClass130_Sub2_5414.method1228(anIntArray5413);
	aClass130_Sub2_5414.method1244();
	aClass130_Sub2_5414.method1313(class102);
	aClass130_Sub2_5414.method1321();
	var_opengl.glMatrixMode(5889);
	var_opengl.glLoadIdentity();
	var_opengl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	var_opengl.glMatrixMode(5888);
	var_opengl.glLoadIdentity();
	var_opengl.glPushAttrib(2048);
	var_opengl.glViewport(0, arg0, aClass36_Sub3_5412.anInt5204,
			      aClass36_Sub3_5412.anInt5204);
	aClass130_Sub2_5414.method1338(false);
	aClass130_Sub2_5414.method1325(false);
	aClass130_Sub2_5414.method1293(false);
	aClass130_Sub2_5414.method1345(false);
	aClass130_Sub2_5414.method1322(-2);
	aClass130_Sub2_5414.method1280(1);
	aClass130_Sub2_5414.method1308(0.0F, 0.0F, 0.0F, arg3);
	aClass130_Sub2_5414.method1314(34165, 34165);
	aClass130_Sub2_5414.method1280(0);
	aClass130_Sub2_5414.method1342(0);
	for (int i = 0; 6 > i; i++) {
	    int i_0_ = i + 34069;
	    class102.method892(0, arg1, i_0_);
	    aClass130_Sub2_5414.aClass36_Sub1_3340
		.method484(0, 0, arg1.anInt5204, arg1.anInt5204, 0, 0);
	    class102.method892(0, arg2, i_0_);
	    aClass130_Sub2_5414.aClass36_Sub1_3434
		.method484(0, 0, arg2.anInt5204, arg2.anInt5204, 0, 0);
	    class102.method892(0, aClass36_Sub3_5412, i_0_);
	    aClass130_Sub2_5414.method1280(1);
	    aClass130_Sub2_5414
		.method1347(aClass130_Sub2_5414.aClass36_Sub1_3434);
	    aClass130_Sub2_5414.method1280(0);
	    aClass130_Sub2_5414
		.method1347(aClass130_Sub2_5414.aClass36_Sub1_3340);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    var_opengl.glVertex2f(0.0F, 0.0F);
	    var_opengl.glTexCoord2f(1.0F, 0.0F);
	    var_opengl.glMultiTexCoord2f(33985, 1.0F, 0.0F);
	    var_opengl.glVertex2f(1.0F, 0.0F);
	    var_opengl.glTexCoord2f(1.0F, 1.0F);
	    var_opengl.glMultiTexCoord2f(33985, 1.0F, 1.0F);
	    var_opengl.glVertex2f(1.0F, 1.0F);
	    var_opengl.glTexCoord2f(0.0F, 1.0F);
	    var_opengl.glMultiTexCoord2f(33985, 0.0F, 1.0F);
	    var_opengl.glVertex2f(0.0F, 1.0F);
	    var_opengl.glEnd();
	    aClass130_Sub2_5414.method1280(1);
	    aClass130_Sub2_5414.method1347(null);
	    aClass130_Sub2_5414.method1280(0);
	    aClass130_Sub2_5414.method1347(null);
	}
	aClass130_Sub2_5414.method1280(1);
	aClass130_Sub2_5414.method1314(8448, 8448);
	aClass130_Sub2_5414.method1280(0);
	class102.method889(0);
	var_opengl.glPopAttrib();
	aClass130_Sub2_5414.method1339(class102);
	aClass130_Sub2_5414.method1188(anIntArray5413[0], anIntArray5413[1],
				       anIntArray5413[2], anIntArray5413[3]);
	aClass36_Sub3_5412.method475();
    }
    
    public int method804(boolean arg0) {
	int i;
	try {
	    if (arg0 != true)
		method803(-103, null, null, -0.097263336F);
	    i = aClass36_Sub3_5412.anInt5204;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public Class83_Sub1_Sub1(Class130_Sub2 arg0, int arg1) {
	aClass130_Sub2_5414 = arg0;
	aClass36_Sub3_5412 = new Class36_Sub3(arg0, 6408, arg1);
    }
}
