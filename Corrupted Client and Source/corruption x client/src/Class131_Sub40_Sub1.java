/* Class131_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class131_Sub40_Sub1 extends Class131_Sub40
{
    public static float aFloat6139 = 1.0F;
    public int anInt6140;
    public Class25 aClass25_6141;
    public Class36_Sub1 aClass36_Sub1_6142;
    public Class25 aClass25_6143;
    public Class102 aClass102_6144;
    public Class25 aClass25_6145;
    public int anInt6146;
    public static float aFloat6147 = 0.25F;
    public int anInt6148;
    public Class25 aClass25_6149;
    public Class36_Sub1[] aClass36_Sub1Array6150;
    public static float aFloat6151 = 1.0F;
    public Class36_Sub1 aClass36_Sub1_6152;
    public Class102 aClass102_6153;
    public int anInt6154;
    
    public boolean method1914() {
	return (aClass130_Sub2_4662.aBoolean3354
		&& aClass130_Sub2_4662.aBoolean3345
		&& aClass130_Sub2_4662.aBoolean3421);
    }
    
    public void method1906() {
	aClass102_6153 = null;
	aClass36_Sub1Array6150 = null;
	aClass102_6144 = null;
	aClass36_Sub1_6142 = null;
	aClass36_Sub1_6152 = null;
	aClass25_6143 = null;
	aClass25_6149 = null;
	aClass25_6145 = null;
	aClass25_6141 = null;
    }
    
    public void method1913(int arg0) {
	aClass130_Sub2_4662.anOpengl3304.glUseProgramObjectARB(0);
	aClass130_Sub2_4662.method1280(1);
	aClass130_Sub2_4662.method1347(null);
	aClass130_Sub2_4662.method1280(0);
    }
    
    public int method1909() {
	return 1;
    }
    
    public Class131_Sub40_Sub1(Class130_Sub2 arg0) {
	super(arg0);
    }
    
    public boolean method1905() {
	return aClass102_6144 != null;
    }
    
    public boolean method1908() {
	if (aClass130_Sub2_4662.aBoolean3354
	    && aClass130_Sub2_4662.aBoolean3345
	    && aClass130_Sub2_4662.aBoolean3421) {
	    aClass102_6144 = new Class102(aClass130_Sub2_4662);
	    aClass36_Sub1_6142
		= new Class36_Sub1(aClass130_Sub2_4662, 3553, 34842, 256, 256);
	    aClass36_Sub1_6142.method485(false, false);
	    aClass36_Sub1_6152
		= new Class36_Sub1(aClass130_Sub2_4662, 3553, 34842, 256, 256);
	    aClass36_Sub1_6152.method485(false, false);
	    aClass130_Sub2_4662.method1313(aClass102_6144);
	    aClass102_6144.method896(0, aClass36_Sub1_6142);
	    aClass102_6144.method896(1, aClass36_Sub1_6152);
	    aClass102_6144.method890(0);
	    if (!aClass102_6144.method894()) {
		aClass130_Sub2_4662.method1339(aClass102_6144);
		return false;
	    }
	    aClass130_Sub2_4662.method1339(aClass102_6144);
	    aClass25_6143
		= (Class25.method405
		   (aClass130_Sub2_4662,
		    (new Class70[]
		     { Class70.method740
		       (aClass130_Sub2_4662, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass25_6149
		= (Class25.method405
		   (aClass130_Sub2_4662,
		    (new Class70[]
		     { Class70.method740
		       (aClass130_Sub2_4662, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass25_6145
		= (Class25.method405
		   (aClass130_Sub2_4662,
		    (new Class70[]
		     { Class70.method740
		       (aClass130_Sub2_4662, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
	    aClass25_6141
		= (Class25.method405
		   (aClass130_Sub2_4662,
		    (new Class70[]
		     { Class70.method740
		       (aClass130_Sub2_4662, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass25_6149 != null && aClass25_6143 != null
		    && aClass25_6145 != null && aClass25_6141 != null);
	}
	return false;
    }
    
    public void method1911(int arg0, int arg1) {
	anInt6148 = arg0;
	anInt6146 = arg1;
	int i = Class144.method2152(anInt6148, (byte) 91);
	int i_0_ = Class144.method2152(anInt6146, (byte) 98);
	if (anInt6154 != i || anInt6140 != i_0_) {
	    if (aClass36_Sub1Array6150 != null) {
		for (int i_1_ = 0; i_1_ < aClass36_Sub1Array6150.length;
		     i_1_++)
		    aClass36_Sub1Array6150[i_1_].method473();
		aClass36_Sub1Array6150 = null;
	    }
	    if (i > 256 || i_0_ > 256) {
		int i_2_ = i;
		int i_3_ = i_0_;
		int i_4_ = 0;
		while (i_2_ > 256 || i_3_ > 256) {
		    if (i_2_ > 256)
			i_2_ >>= 1;
		    if (i_3_ > 256)
			i_3_ >>= 1;
		    i_4_++;
		}
		if (aClass102_6153 == null)
		    aClass102_6153 = new Class102(aClass130_Sub2_4662);
		aClass36_Sub1Array6150 = new Class36_Sub1[i_4_];
		i_2_ = i;
		i_3_ = i_0_;
		i_4_ = 0;
		while (i_2_ > 256 || i_3_ > 256) {
		    aClass36_Sub1Array6150[i_4_++]
			= new Class36_Sub1(aClass130_Sub2_4662, 3553, 34842,
					   i_2_, i_3_);
		    if (i_2_ > 256)
			i_2_ >>= 1;
		    if (i_3_ > 256)
			i_3_ >>= 1;
		}
	    } else
		aClass102_6153 = null;
	    anInt6154 = i;
	    anInt6140 = i_0_;
	}
    }
    
    public void method1912(int arg0, Class36_Sub1 arg1, Class36_Sub1 arg2) {
	opengl var_opengl = aClass130_Sub2_4662.anOpengl3304;
	var_opengl.glPushAttrib(2048);
	var_opengl.glMatrixMode(5889);
	var_opengl.glPushMatrix();
	var_opengl.glLoadIdentity();
	var_opengl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass36_Sub1Array6150 != null) {
	    aClass130_Sub2_4662.method1313(aClass102_6153);
	    int i = Class144.method2152(anInt6148, (byte) 81);
	    int i_5_ = Class144.method2152(anInt6146, (byte) 120);
	    int i_6_ = 0;
	    while (i > 256 || i_5_ > 256) {
		var_opengl.glViewport(0, 0, i, i_5_);
		aClass102_6153.method896(0, aClass36_Sub1Array6150[i_6_]);
		if (i_6_ == 0) {
		    aClass130_Sub2_4662.method1347(arg1);
		    var_opengl.glBegin(7);
		    var_opengl.glTexCoord2f(0.0F, 0.0F);
		    var_opengl.glVertex2i(0, 0);
		    var_opengl.glTexCoord2f((float) anInt6148, 0.0F);
		    var_opengl.glVertex2i(1, 0);
		    var_opengl.glTexCoord2f((float) anInt6148,
					    (float) anInt6146);
		    var_opengl.glVertex2i(1, 1);
		    var_opengl.glTexCoord2f(0.0F, (float) anInt6146);
		    var_opengl.glVertex2i(0, 1);
		    var_opengl.glEnd();
		} else {
		    aClass130_Sub2_4662
			.method1347(aClass36_Sub1Array6150[i_6_ - 1]);
		    var_opengl.glBegin(7);
		    var_opengl.glTexCoord2f(0.0F, 0.0F);
		    var_opengl.glVertex2i(0, 0);
		    var_opengl.glTexCoord2f(1.0F, 0.0F);
		    var_opengl.glVertex2i(1, 0);
		    var_opengl.glTexCoord2f(1.0F, 1.0F);
		    var_opengl.glVertex2i(1, 1);
		    var_opengl.glTexCoord2f(0.0F, 1.0F);
		    var_opengl.glVertex2i(0, 1);
		    var_opengl.glEnd();
		}
		if (i > 256)
		    i >>= 1;
		if (i_5_ > 256)
		    i_5_ >>= 1;
		i_6_++;
	    }
	    aClass130_Sub2_4662.method1339(aClass102_6153);
	    aClass130_Sub2_4662.method1347(aClass36_Sub1Array6150[i_6_ - 1]);
	    aClass130_Sub2_4662.method1313(aClass102_6144);
	    aClass102_6144.method890(0);
	    var_opengl.glViewport(0, 0, 256, 256);
	    int i_7_ = aClass25_6149.anInt264;
	    var_opengl.glUseProgramObjectARB(i_7_);
	    var_opengl.glUniform1iARB
		(var_opengl.glGetUniformLocation(i_7_, "sceneTex"), 0);
	    var_opengl.glUniform3fARB
		(var_opengl.glGetUniformLocation(i_7_, "params"), aFloat6139,
		 0.0F, 0.0F);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(0, 0);
	    var_opengl.glTexCoord2f(1.0F, 0.0F);
	    var_opengl.glVertex2i(1, 0);
	    var_opengl.glTexCoord2f(1.0F, 1.0F);
	    var_opengl.glVertex2i(1, 1);
	    var_opengl.glTexCoord2f(0.0F, 1.0F);
	    var_opengl.glVertex2i(0, 1);
	    var_opengl.glEnd();
	} else {
	    aClass130_Sub2_4662.method1347(arg1);
	    aClass130_Sub2_4662.method1313(aClass102_6144);
	    aClass102_6144.method890(0);
	    var_opengl.glViewport(0, 0, 256, 256);
	    int i = aClass25_6143.anInt264;
	    var_opengl.glUseProgramObjectARB(i);
	    var_opengl.glUniform1iARB(var_opengl
					  .glGetUniformLocation(i, "sceneTex"),
				      0);
	    var_opengl.glUniform3fARB(var_opengl
					  .glGetUniformLocation(i, "params"),
				      aFloat6139, 0.0F, 0.0F);
	    var_opengl.glBegin(7);
	    var_opengl.glTexCoord2f(0.0F, 0.0F);
	    var_opengl.glVertex2i(0, 0);
	    var_opengl.glTexCoord2f((float) anInt6148, 0.0F);
	    var_opengl.glVertex2i(1, 0);
	    var_opengl.glTexCoord2f((float) anInt6148, (float) anInt6146);
	    var_opengl.glVertex2i(1, 1);
	    var_opengl.glTexCoord2f(0.0F, (float) anInt6146);
	    var_opengl.glVertex2i(0, 1);
	    var_opengl.glEnd();
	}
	aClass102_6144.method890(1);
	aClass130_Sub2_4662.method1347(aClass36_Sub1_6142);
	int i = aClass25_6141.anInt264;
	var_opengl.glUseProgramObjectARB(i);
	var_opengl
	    .glUniform1iARB(var_opengl.glGetUniformLocation(i, "baseTex"), 0);
	var_opengl.glUniform3fARB(var_opengl.glGetUniformLocation(i, "step"),
				  0.00390625F, 0.0F, 0.0F);
	var_opengl.glBegin(7);
	var_opengl.glTexCoord2f(0.0F, 0.0F);
	var_opengl.glVertex2i(0, 0);
	var_opengl.glTexCoord2f(1.0F, 0.0F);
	var_opengl.glVertex2i(1, 0);
	var_opengl.glTexCoord2f(1.0F, 1.0F);
	var_opengl.glVertex2i(1, 1);
	var_opengl.glTexCoord2f(0.0F, 1.0F);
	var_opengl.glVertex2i(0, 1);
	var_opengl.glEnd();
	aClass102_6144.method890(0);
	aClass130_Sub2_4662.method1347(aClass36_Sub1_6152);
	var_opengl.glUniform3fARB(var_opengl.glGetUniformLocation(i, "step"),
				  0.0F, 0.00390625F, 0.0F);
	var_opengl.glBegin(7);
	var_opengl.glTexCoord2f(0.0F, 0.0F);
	var_opengl.glVertex2i(0, 0);
	var_opengl.glTexCoord2f(1.0F, 0.0F);
	var_opengl.glVertex2i(1, 0);
	var_opengl.glTexCoord2f(1.0F, 1.0F);
	var_opengl.glVertex2i(1, 1);
	var_opengl.glTexCoord2f(0.0F, 1.0F);
	var_opengl.glVertex2i(0, 1);
	var_opengl.glEnd();
	var_opengl.glPopAttrib();
	var_opengl.glPopMatrix();
	var_opengl.glMatrixMode(5888);
	aClass130_Sub2_4662.method1339(aClass102_6144);
	int i_8_ = aClass25_6145.anInt264;
	var_opengl.glUseProgramObjectARB(i_8_);
	var_opengl.glUniform1iARB(var_opengl.glGetUniformLocation(i_8_,
								  "sceneTex"),
				  0);
	var_opengl.glUniform1iARB(var_opengl.glGetUniformLocation(i_8_,
								  "bloomTex"),
				  1);
	var_opengl.glUniform3fARB(var_opengl.glGetUniformLocation(i_8_,
								  "params"),
				  aFloat6147, aFloat6151, 0.0F);
	aClass130_Sub2_4662.method1280(1);
	aClass130_Sub2_4662.method1347(aClass36_Sub1_6142);
	aClass130_Sub2_4662.method1280(0);
	aClass130_Sub2_4662.method1347(arg1);
    }
}
