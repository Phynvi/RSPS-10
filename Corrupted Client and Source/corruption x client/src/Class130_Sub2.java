/* Class130_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import jaggl.context;
import jaggl.opengl;

public class Class130_Sub2 extends Class130 implements Interface5
{
    public static float[] aFloatArray3299 = new float[4];
    public context aContext3300;
    public Class131_Sub40_Sub1 aClass131_Sub40_Sub1_3301;
    public Class122 aClass122_3302;
    public Interface4 anInterface4_3303;
    public opengl anOpengl3304;
    public Class117 aClass117_3305;
    public static Boolean aBoolean3306 = Boolean.FALSE;
    public Class86 aClass86_3307;
    public static float[] aFloatArray3308 = new float[4];
    public Canvas aCanvas3309;
    public Class174 aClass174_3310 = new Class174();
    public static int[] anIntArray3311 = new int[1000];
    public Class9 aClass9_3312 = new Class9_Sub1();
    public Interface5 anInterface5_3313;
    public int anInt3314 = 8;
    public int anInt3315;
    public int anInt3316;
    public boolean aBoolean3317;
    public int anInt3318;
    public Class119 aClass119_3319;
    public int anInt3320 = -1;
    public int anInt3321 = 3;
    public Interface5[] anInterface5Array3322 = new Interface5[4];
    public int anInt3323;
    public int anInt3324;
    public int anInt3325;
    public Class119 aClass119_3326;
    public Class119 aClass119_3327;
    public Class119 aClass119_3328;
    public Class119 aClass119_3329;
    public Class119 aClass119_3330;
    public Class119 aClass119_3331;
    public float aFloat3332;
    public boolean aBoolean3333;
    public Class83_Sub1 aClass83_Sub1_3334;
    public int anInt3335;
    public int anInt3336;
    public float[] aFloatArray3337;
    public boolean aBoolean3338;
    public boolean aBoolean3339;
    public Class36_Sub1 aClass36_Sub1_3340;
    public float aFloat3341;
    public float aFloat3342;
    public float aFloat3343;
    public int anInt3344;
    public boolean aBoolean3345;
    public Class154_Sub1 aClass154_Sub1_3346;
    public boolean aBoolean3347;
    public boolean aBoolean3348;
    public int anInt3349;
    public float[] aFloatArray3350;
    public int anInt3351;
    public int anInt3352;
    public int anInt3353;
    public boolean aBoolean3354;
    public Class36[] aClass36Array3355;
    public int anInt3356;
    public String aString3357;
    public float aFloat3358;
    public boolean aBoolean3359;
    public boolean aBoolean3360;
    public float aFloat3361;
    public boolean aBoolean3362;
    public float aFloat3363;
    public int anInt3364;
    public int anInt3365;
    public int anInt3366;
    public int anInt3367;
    public float[] aFloatArray3368;
    public float[] aFloatArray3369;
    public int anInt3370;
    public float aFloat3371;
    public int anInt3372;
    public Class9_Sub1 aClass9_Sub1_3373;
    public Class154_Sub1 aClass154_Sub1_3374;
    public int anInt3375;
    public int anInt3376;
    public Class102 aClass102_3377;
    public Class154_Sub1 aClass154_Sub1_3378;
    public long aLong3379;
    public boolean aBoolean3380;
    public int anInt3381;
    public int anInt3382;
    public float aFloat3383;
    public float aFloat3384;
    public boolean aBoolean3385;
    public boolean aBoolean3386;
    public int anInt3387;
    public int anInt3388;
    public float aFloat3389;
    public boolean aBoolean3390;
    public Class154_Sub1 aClass154_Sub1_3391;
    public Class154_Sub1 aClass154_Sub1_3392;
    public boolean aBoolean3393;
    public int anInt3394;
    public float aFloat3395;
    public int anInt3396;
    public float aFloat3397;
    public boolean aBoolean3398;
    public int anInt3399;
    public int anInt3400;
    public Class36_Sub1 aClass36_Sub1_3401;
    public Class154_Sub1 aClass154_Sub1_3402;
    public boolean aBoolean3403;
    public Class9_Sub1 aClass9_Sub1_3404;
    public int anInt3405;
    public boolean aBoolean3406;
    public float aFloat3407;
    public float[] aFloatArray3408;
    public boolean aBoolean3409;
    public float aFloat3410;
    public boolean aBoolean3411;
    public float aFloat3412;
    public float aFloat3413;
    public int anInt3414;
    public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_3415;
    public boolean aBoolean3416;
    public float aFloat3417;
    public float aFloat3418;
    public Interface7 anInterface7_3419;
    public int anInt3420;
    public boolean aBoolean3421;
    public boolean aBoolean3422;
    public float aFloat3423;
    public int anInt3424;
    public int anInt3425;
    public float aFloat3426;
    public int anInt3427;
    public int anInt3428;
    public String aString3429;
    public Interface7 anInterface7_3430;
    public Interface2 anInterface2_3431;
    public int anInt3432;
    public int anInt3433;
    public Class36_Sub1 aClass36_Sub1_3434;
    public int anInt3435;
    public int anInt3436;
    
    public void method1158() {
	if (anOpengl3304 != null) {
	    try {
		aClass122_3302.method1068();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anOpengl3304 = null;
	}
	if (aContext3300 != null) {
	    method1294();
	    try {
		aContext3300.destroy();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    aContext3300 = null;
	}
	if (aBoolean3317) {
	    Class131_Sub27.method1838(true, true, -1);
	    aBoolean3317 = false;
	}
    }
    
    public Class9 method1238() {
	return aClass9_3312;
    }
    
    public Class83 method1184(Class83 arg0, Class83 arg1, float arg2,
			      Class83 arg3) {
	if (arg0 != null && arg1 != null && aBoolean3386 && aBoolean3354) {
	    Class83_Sub1_Sub1 class83_sub1_sub1 = null;
	    Class83_Sub1 class83_sub1 = (Class83_Sub1) arg0;
	    Class83_Sub1 class83_sub1_0_ = (Class83_Sub1) arg1;
	    Class36_Sub3 class36_sub3 = class83_sub1.method802(-1457);
	    Class36_Sub3 class36_sub3_1_ = class83_sub1_0_.method802(-1457);
	    if (class36_sub3 != null && class36_sub3_1_ != null) {
		int i = (class36_sub3.anInt5204 > class36_sub3_1_.anInt5204
			 ? class36_sub3.anInt5204 : class36_sub3_1_.anInt5204);
		if (arg0 != arg3 && arg1 != arg3
		    && arg3 instanceof Class83_Sub1_Sub1) {
		    Class83_Sub1_Sub1 class83_sub1_sub1_2_
			= (Class83_Sub1_Sub1) arg3;
		    if (class83_sub1_sub1_2_.method804(true) == i)
			class83_sub1_sub1 = class83_sub1_sub1_2_;
		}
		if (class83_sub1_sub1 == null)
		    class83_sub1_sub1 = new Class83_Sub1_Sub1(this, i);
		class83_sub1_sub1.method803(0, class36_sub3, class36_sub3_1_,
					    arg2);
		return class83_sub1_sub1;
	    }
	}
	return arg2 < 0.5F ? arg0 : arg1;
    }
    
    public void method1276() {
	int i;
	if (aBoolean3362) {
	    anOpengl3304.glFogf(2915, 0.0F);
	    anOpengl3304.glFogf(2916, 1.0F);
	    i = anInt3376;
	} else {
	    aFloat3417 = (float) (anInt3428 - 256) - aFloat3423;
	    aFloat3426 = aFloat3417 - (float) anInt3353 * aFloat3383;
	    if (aFloat3426 < (float) anInt3382)
		aFloat3426 = (float) anInt3382;
	    anOpengl3304.glFogf(2915, aFloat3426);
	    anOpengl3304.glFogf(2916, aFloat3417);
	    i = anInt3387;
	}
	aFloatArray3308[0] = (float) (i & 0xff0000) / 1.671168E7F;
	aFloatArray3308[1] = (float) (i & 0xffff) / 65535.0F;
	aFloatArray3308[2] = (float) (i & 0xff) / 255.0F;
	anOpengl3304.glFogfv(2918, aFloatArray3308, 0);
    }
    
    public void method1277(int arg0, int arg1, int arg2) {
	anOpengl3304.glTexEnvi(8960, 34184 + arg0, arg1);
	anOpengl3304.glTexEnvi(8960, 34200 + arg0, arg2);
    }
    
    public void method1180(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	method1337();
	method1284(arg5);
	anOpengl3304.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
				(byte) arg4, (byte) (arg4 >> 24));
	anOpengl3304.glBegin(2);
	anOpengl3304.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
	anOpengl3304.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
	anOpengl3304.glEnd();
    }
    
    public synchronized void method1229(int arg0) {
	int i = 0;
	arg0 &= 0x7fffffff;
	while (!aClass119_3326.method1015(-97)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3326.method1005((byte) 93);
	    anIntArray3311[i++] = (int) class131_sub24.aLong1791;
	    anInt3316 -= class131_sub24.anInt4465;
	    if (i == 1000) {
		anOpengl3304.glDeleteBuffersARB(i, anIntArray3311, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    anOpengl3304.glDeleteBuffersARB(i, anIntArray3311, 0);
	    i = 0;
	}
	while (!aClass119_3327.method1015(122)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3327.method1005((byte) 93);
	    anIntArray3311[i++] = (int) class131_sub24.aLong1791;
	    anInt3325 -= class131_sub24.anInt4465;
	    if (i == 1000) {
		anOpengl3304.glDeleteTextures(i, anIntArray3311, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    anOpengl3304.glDeleteTextures(i, anIntArray3311, 0);
	    i = 0;
	}
	while (!aClass119_3328.method1015(127)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3328.method1005((byte) 93);
	    anIntArray3311[i++] = class131_sub24.anInt4465;
	    if (i == 1000) {
		anOpengl3304.glDeleteFramebuffersEXT(i, anIntArray3311, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    anOpengl3304.glDeleteFramebuffersEXT(i, anIntArray3311, 0);
	    i = 0;
	}
	while (!aClass119_3329.method1015(-18)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3329.method1005((byte) 93);
	    anIntArray3311[i++] = (int) class131_sub24.aLong1791;
	    anInt3315 -= class131_sub24.anInt4465;
	    if (i == 1000) {
		anOpengl3304.glDeleteRenderbuffersEXT(i, anIntArray3311, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    anOpengl3304.glDeleteRenderbuffersEXT(i, anIntArray3311, 0);
	    i = 0;
	}
	while (!aClass119_3330.method1015(12)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3330.method1005((byte) 93);
	    anIntArray3311[i++] = (int) class131_sub24.aLong1791;
	    if (i == 1000) {
		anOpengl3304.glDeleteProgramsARB(i, anIntArray3311, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    anOpengl3304.glDeleteProgramsARB(i, anIntArray3311, 0);
	    boolean bool = false;
	}
	while (!aClass119_3319.method1015(122)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3319.method1005((byte) 93);
	    anOpengl3304.glDeleteLists((int) class131_sub24.aLong1791,
				       class131_sub24.anInt4465);
	}
	while (!aClass119_3331.method1015(-85)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3331.method1005((byte) 93);
	    anOpengl3304.glDeleteObjectARB(class131_sub24.anInt4465);
	}
	while (!aClass119_3319.method1015(-107)) {
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass119_3319.method1005((byte) 93);
	    anOpengl3304.glDeleteLists((int) class131_sub24.aLong1791,
				       class131_sub24.anInt4465);
	}
	if (method1249() > 100663296
	    && Class208.method2749(-3913) > aLong3379 + 60000L) {
	    System.gc();
	    aLong3379 = Class208.method2749(-3913);
	}
	anInt3324 = arg0;
    }
    
    public int method1214() {
	int i = anInt3435;
	anInt3435 = 0;
	return i;
    }
    
    public void method1169() {
	method1345(true);
	anOpengl3304.glClear(256);
    }
    
    public void method1244() {
	anInt3364 = 0;
	anInt3400 = 0;
	anInt3349 = anInt3323;
	anInt3433 = anInt3318;
	anOpengl3304.glDisable(3089);
	method1331();
    }
    
    public void method1278(Interface2 arg0) {
	if (anInterface2_3431 != arg0 && aBoolean3398) {
	    anOpengl3304.glBindBufferARB(34962, arg0.method4());
	    anInterface2_3431 = arg0;
	}
    }
    
    public void method1279() {
	if (aBoolean3406 && aBoolean3362 | anInt3353 >= 0)
	    anOpengl3304.glEnable(2912);
	else
	    anOpengl3304.glDisable(2912);
    }
    
    public void method1280(int arg0) {
	if (anInt3427 != arg0) {
	    anOpengl3304.glActiveTexture(33984 + arg0);
	    anInt3427 = arg0;
	}
    }
    
    public void method1281() {
	method1322(-2);
	for (int i = anInt3351 - 1; i >= 0; i--) {
	    method1280(i);
	    method1347(null);
	    anOpengl3304.glTexEnvi(8960, 8704, 34160);
	}
	method1314(8448, 8448);
	method1298(2, 34168, 770);
	method1340();
	anOpengl3304.glEnable(3042);
	anOpengl3304.glBlendFunc(770, 771);
	anInt3399 = 1;
	anOpengl3304.glEnable(3008);
	anOpengl3304.glAlphaFunc(516, 0.0F);
	aBoolean3348 = true;
	anOpengl3304.glColorMask(true, true, true, true);
	aBoolean3347 = true;
	anInt3336 = 1;
	method1338(true);
	method1325(true);
	method1293(true);
	method1345(true);
	method1321();
	anOpengl3304.setSwapInterval(0);
	anOpengl3304.glShadeModel(7425);
	anOpengl3304.glClearDepth(1.0F);
	anOpengl3304.glDepthFunc(515);
	anOpengl3304.glPolygonMode(1028, 6914);
	anOpengl3304.glEnable(2884);
	anOpengl3304.glCullFace(1029);
	anOpengl3304.glMatrixMode(5888);
	anOpengl3304.glLoadIdentity();
	anOpengl3304.glColorMaterial(1028, 5634);
	anOpengl3304.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_3_ = 16384 + i;
	    anOpengl3304.glLightfv(i_3_, 4608, fs, 0);
	    anOpengl3304.glLightf(i_3_, 4615, 0.0F);
	    anOpengl3304.glLightf(i_3_, 4616, 0.0F);
	}
	anOpengl3304.glEnable(16384);
	anOpengl3304.glEnable(16385);
	anOpengl3304.glFogf(2914, 0.95F);
	anOpengl3304.glFogi(2917, 9729);
	anOpengl3304.glHint(3156, 4353);
	anInt3414 = anInt3387 = -1;
	method1244();
    }
    
    public int method1249() {
	return anInt3316 + anInt3325 + anInt3315;
    }
    
    public void method1282(int arg0, int arg1) {
	anInt3370 = arg0;
	anInt3424 = arg1;
	anOpengl3304.glViewport(arg0, arg1, anInt3323, anInt3318);
	method1306();
    }
    
    public void method1236(int arg0, int arg1, int arg2) {
	if (!aBoolean3362)
	    throw new RuntimeException
		      ("Can't call underwatermode_adjust without first enabling underwater mode");
	anInt3376 = arg1;
	anInt3344 = arg2;
	method1276();
	aClass86_3307.method816(true, arg0, false);
    }
    
    public void method1226(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, Class183 arg6, int arg7, int arg8) {
	Class183_Sub2 class183_sub2 = (Class183_Sub2) arg6;
	Class36_Sub1_Sub1 class36_sub1_sub1
	    = class183_sub2.aClass36_Sub1_Sub1_4966;
	method1299();
	method1347(class183_sub2.aClass36_Sub1_Sub1_4966);
	method1284(arg5);
	method1314(7681, 8448);
	method1298(0, 34167, 768);
	float f = (class36_sub1_sub1.aFloat6455
		   / (float) class36_sub1_sub1.anInt6459);
	float f_4_ = (class36_sub1_sub1.aFloat6458
		      / (float) class36_sub1_sub1.anInt6456);
	anOpengl3304.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
				(byte) arg4, (byte) (arg4 >> 24));
	anOpengl3304.glBegin(1);
	anOpengl3304.glTexCoord2f(f * (float) (arg0 - arg7),
				  f_4_ * (float) (arg1 - arg8));
	anOpengl3304.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
	anOpengl3304.glTexCoord2f(f * (float) (arg2 - arg7),
				  f_4_ * (float) (arg3 - arg8));
	anOpengl3304.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
	anOpengl3304.glEnd();
	method1298(0, 5890, 768);
    }
    
    public Interface2 method1283(int arg0, ByteBuffer arg1, boolean arg2) {
	if (aBoolean3398 && (!arg2 || aBoolean3385))
	    return new Class178_Sub2(this, arg0, arg1, arg2);
	return new Class38_Sub1(this, arg0, arg1);
    }
    
    public void method1284(int arg0) {
	if (anInt3336 != arg0) {
	    int i;
	    boolean bool;
	    boolean bool_5_;
	    if (arg0 == 1) {
		i = 1;
		bool = true;
		bool_5_ = true;
	    } else if (arg0 == 2) {
		i = 2;
		bool = true;
		bool_5_ = false;
	    } else if (arg0 == 128) {
		i = 2;
		bool = false;
		bool_5_ = true;
	    } else if (arg0 == 129) {
		i = 3;
		bool = false;
		bool_5_ = true;
	    } else if (arg0 == 130) {
		i = 4;
		bool = true;
		bool_5_ = true;
	    } else {
		i = 0;
		bool = true;
		bool_5_ = false;
	    }
	    if (bool != aBoolean3347) {
		anOpengl3304.glColorMask(bool, bool, bool, true);
		aBoolean3347 = bool;
	    }
	    if (bool_5_ != aBoolean3348) {
		if (bool_5_)
		    anOpengl3304.glEnable(3008);
		else
		    anOpengl3304.glDisable(3008);
		aBoolean3348 = bool_5_;
	    }
	    if (i != anInt3399) {
		if (i == 1) {
		    anOpengl3304.glEnable(3042);
		    anOpengl3304.glBlendEquation(32774);
		    anOpengl3304.glBlendFunc(770, 771);
		} else if (i == 2) {
		    anOpengl3304.glEnable(3042);
		    anOpengl3304.glBlendEquation(32774);
		    anOpengl3304.glBlendFunc(1, 1);
		} else if (i == 3) {
		    anOpengl3304.glEnable(3042);
		    anOpengl3304.glBlendEquation(32778);
		    anOpengl3304.glBlendFunc(1, 1);
		} else if (i == 4) {
		    anOpengl3304.glEnable(3042);
		    anOpengl3304.glBlendEquation(32774);
		    anOpengl3304.glBlendFunc(774, 1);
		} else
		    anOpengl3304.glDisable(3042);
		anInt3399 = i;
	    }
	    anInt3336 = arg0;
	    anInt3356 &= ~0x1c;
	}
    }
    
    public void method1190(Canvas arg0) {
	throw new IllegalStateException();
    }
    
    public Interface5 method1285() {
	return anInterface5_3313;
    }
    
    public void method1172(Class83 arg0) {
	aClass83_Sub1_3334 = (Class83_Sub1) arg0;
    }
    
    public void method1286() {
	if (anInt3420 != 1) {
	    anOpengl3304.glMatrixMode(5889);
	    anOpengl3304.glLoadIdentity();
	    anOpengl3304.glOrtho(0.0, (double) anInt3323, (double) anInt3318,
				 0.0, -1.0, 1.0);
	    anOpengl3304.glMatrixMode(5888);
	    anOpengl3304.glLoadIdentity();
	    anInt3420 = 1;
	    anInt3356 &= ~0x18;
	}
    }
    
    public Interface7 method1287(int arg0, byte[] arg1, int arg2,
				 boolean arg3) {
	if (aBoolean3398 && (!arg3 || aBoolean3385))
	    return new Class178_Sub1(this, arg0, arg1, arg2, arg3);
	return new Class38_Sub2(this, arg0, arg1, arg2);
    }
    
    public int method1288() {
	int i = 0;
	aString3429 = anOpengl3304.glGetString(7936);
	aString3357 = anOpengl3304.glGetString(7937);
	String string = aString3429.toLowerCase();
	if (string.indexOf("microsoft") != -1)
	    i |= 0x1;
	if (string.indexOf("brian paul") != -1 || string.indexOf("mesa") != -1)
	    i |= 0x1;
	String string_6_ = anOpengl3304.glGetString(7938);
	String[] strings
	    = Class131_Sub41_Sub21
		  .method2077((byte) 111, string_6_.replace('.', ' '), ' ');
	if (strings.length >= 2) {
	    try {
		int i_7_ = Class161.method2393(strings[0], (byte) 20);
		int i_8_ = Class161.method2393(strings[1], (byte) 20);
		anInt3396 = i_7_ * 10 + i_8_;
	    } catch (NumberFormatException numberformatexception) {
		i |= 0x4;
	    }
	} else
	    i |= 0x4;
	if (anInt3396 < 12)
	    i |= 0x2;
	if (!anOpengl3304.isExtensionAvailable("GL_ARB_multitexture"))
	    i |= 0x8;
	if (!anOpengl3304.isExtensionAvailable("GL_ARB_texture_env_combine"))
	    i |= 0x20;
	int[] is = new int[1];
	anOpengl3304.glGetIntegerv(34018, is, 0);
	anInt3351 = is[0];
	anOpengl3304.glGetIntegerv(34929, is, 0);
	anInt3425 = is[0];
	anOpengl3304.glGetIntegerv(34930, is, 0);
	anInt3352 = is[0];
	if (anInt3351 < 2 || anInt3425 < 2 || anInt3352 < 2)
	    i |= 0x10;
	aBoolean3411 = (SignLink.aString2901 != null
			&& SignLink.aString2901.startsWith("mac"));
	aBoolean3360 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
	aBoolean3398
	    = anOpengl3304.isExtensionAvailable("GL_ARB_vertex_buffer_object");
	aBoolean3393 = anOpengl3304.isExtensionAvailable("GL_ARB_multisample");
	aBoolean3403
	    = anOpengl3304.isExtensionAvailable("GL_ARB_vertex_program");
	anOpengl3304.isExtensionAvailable("GL_ARB_fragment_program");
	anOpengl3304.isExtensionAvailable("GL_ARB_vertex_shader");
	aBoolean3345
	    = anOpengl3304.isExtensionAvailable("GL_ARB_fragment_shader");
	aBoolean3333 = anOpengl3304.isExtensionAvailable("GL_EXT_texture3D");
	aBoolean3359
	    = anOpengl3304.isExtensionAvailable("GL_ARB_texture_rectangle");
	aBoolean3386
	    = anOpengl3304.isExtensionAvailable("GL_ARB_texture_cube_map");
	aBoolean3421
	    = anOpengl3304.isExtensionAvailable("GL_ARB_texture_float");
	aBoolean3416 = false;
	aBoolean3354
	    = anOpengl3304.isExtensionAvailable("GL_EXT_framebuffer_object");
	return i != 0 ? i : 0;
    }
    
    public boolean method1175() {
	return aClass131_Sub40_Sub1_3301.method1910(true);
    }
    
    public void method1289() {
	if (anInt3420 != 3) {
	    anInt3420 = 3;
	    method1328();
	    method1332();
	    anInt3356 &= ~0x7;
	}
    }
    
    public void method1290() {
	if (aFloat3413 != 0.0F) {
	    float f = aFloat3384 / (aFloat3413 + aFloat3384);
	    float f_9_ = f * f;
	    float f_10_ = -aFloat3371 * (1.0F - f) * (1.0F - f) / aFloat3413;
	    aFloatArray3350[10] = aFloat3363 + f_10_;
	    aFloatArray3350[14] = aFloat3371 * f_9_;
	} else {
	    aFloatArray3350[10] = aFloat3363;
	    aFloatArray3350[14] = aFloat3371;
	}
	method1327();
    }
    
    public void method1251() {
	aClass86_3307.method813(false, 0, false, 0);
	aBoolean3362 = false;
	method1276();
	method1279();
    }
    
    public int method1291(int arg0) {
	if (arg0 == 6406 || arg0 == 6409)
	    return 1;
	if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844)
	    return 2;
	if (arg0 == 6407)
	    return 3;
	if (arg0 == 6408 || arg0 == 34847)
	    return 4;
	if (arg0 == 34843)
	    return 6;
	if (arg0 == 34842)
	    return 8;
	if (arg0 == 6402)
	    return 3;
	if (arg0 == 6401)
	    return 1;
	return 0;
    }
    
    public boolean method1220() {
	return true;
    }
    
    public void method1168(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	float f = (float) arg0 + 0.35F;
	float f_11_ = (float) arg1 + 0.35F;
	float f_12_ = f + (float) arg2 - 1.0F;
	float f_13_ = f_11_ + (float) arg3 - 1.0F;
	method1337();
	method1284(arg5);
	anOpengl3304.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
				(byte) arg4, (byte) (arg4 >> 24));
	if (aBoolean3393)
	    anOpengl3304.glDisable(32925);
	anOpengl3304.glBegin(2);
	anOpengl3304.glVertex2f(f, f_11_);
	anOpengl3304.glVertex2f(f, f_13_);
	anOpengl3304.glVertex2f(f_12_, f_13_);
	anOpengl3304.glVertex2f(f_12_, f_11_);
	anOpengl3304.glEnd();
	if (aBoolean3393)
	    anOpengl3304.glEnable(32925);
    }
    
    public void method1292(float arg0) {
	if (aFloat3410 != arg0) {
	    aFloat3410 = arg0;
	    if (anInt3420 == 3)
		method1328();
	}
    }
    
    public void method1260(Class9 arg0) {
	aClass9_Sub1_3404 = (Class9_Sub1) arg0;
	aClass9_Sub1_3373.method196(0, aClass9_Sub1_3404);
	if (anInt3420 != 1)
	    method1332();
    }
    
    public Class9 method1257() {
	return new Class9_Sub1();
    }
    
    public void method1293(boolean arg0) {
	if (arg0 != aBoolean3422) {
	    if (arg0)
		anOpengl3304.glEnable(2929);
	    else
		anOpengl3304.glDisable(2929);
	    aBoolean3422 = arg0;
	    anInt3356 &= ~0x1f;
	}
    }
    
    public void method1294() {
	try {
	    aContext3300.releaseContext();
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    public void method1161(float arg0) {
	if (aFloat3407 != arg0) {
	    aFloat3407 = arg0;
	    method1335();
	}
    }
    
    public void method1171(boolean bool) {
	/* empty */
    }
    
    public void method1205(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, byte[] arg6, int arg7, int arg8) {
	float f;
	float f_14_;
	if (aClass36_Sub1_Sub1_3415 == null
	    || aClass36_Sub1_Sub1_3415.anInt5197 < arg2
	    || aClass36_Sub1_Sub1_3415.anInt5196 < arg3) {
	    aClass36_Sub1_Sub1_3415
		= Class36_Sub1_Sub1.method487(this, arg2, arg6, 6406, false,
					      6406, arg3, 28);
	    aClass36_Sub1_Sub1_3415.method485(false, false);
	    f = aClass36_Sub1_Sub1_3415.aFloat6458;
	    f_14_ = aClass36_Sub1_Sub1_3415.aFloat6455;
	} else {
	    aClass36_Sub1_Sub1_3415.method482(0, 0, arg2, arg3, arg6, 6406, 0,
					      0, false);
	    f = (aClass36_Sub1_Sub1_3415.aFloat6458 * (float) arg3
		 / (float) aClass36_Sub1_Sub1_3415.anInt5196);
	    f_14_ = (aClass36_Sub1_Sub1_3415.aFloat6455 * (float) arg2
		     / (float) aClass36_Sub1_Sub1_3415.anInt5197);
	}
	method1299();
	method1347(aClass36_Sub1_Sub1_3415);
	method1284(arg8);
	anOpengl3304.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
				(byte) arg4, (byte) (arg4 >> 24));
	method1316(arg5);
	method1314(34165, 34165);
	method1298(0, 34166, 768);
	method1298(2, 5890, 770);
	method1277(0, 34166, 770);
	method1277(2, 5890, 770);
	float f_15_ = (float) arg0;
	float f_16_ = (float) arg1;
	float f_17_ = f_15_ + (float) arg2;
	float f_18_ = f_16_ + (float) arg3;
	anOpengl3304.glBegin(7);
	anOpengl3304.glTexCoord2f(0.0F, 0.0F);
	anOpengl3304.glVertex2f(f_15_, f_16_);
	anOpengl3304.glTexCoord2f(0.0F, f_14_);
	anOpengl3304.glVertex2f(f_15_, f_18_);
	anOpengl3304.glTexCoord2f(f, f_14_);
	anOpengl3304.glVertex2f(f_17_, f_18_);
	anOpengl3304.glTexCoord2f(f, 0.0F);
	anOpengl3304.glVertex2f(f_17_, f_16_);
	anOpengl3304.glEnd();
	method1298(0, 5890, 768);
	method1298(2, 34166, 770);
	method1277(0, 5890, 770);
	method1277(2, 34166, 770);
    }
    
    public void method1295() {
	anOpengl3304.glDepthMask(aBoolean3380 && aBoolean3339);
    }
    
    public void method1166() {
	try {
	    aContext3300.swapBuffers();
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public int method1203(int arg0, int arg1) {
	return arg0 | arg1;
    }
    
    public boolean method1241() {
	return false;
    }
    
    public synchronized void method1296(int arg0, int arg1) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg1);
	class131_sub24.aLong1791 = (long) arg0;
	aClass119_3328.method1018((byte) -123, class131_sub24);
    }
    
    public void method1297() {
	if (aBoolean3409 && !aBoolean3338)
	    anOpengl3304.glEnable(2896);
	else
	    anOpengl3304.glDisable(2896);
    }
    
    public void method1298(int arg0, int arg1, int arg2) {
	anOpengl3304.glTexEnvi(8960, 34176 + arg0, arg1);
	anOpengl3304.glTexEnvi(8960, 34192 + arg0, arg2);
    }
    
    public boolean method1170() {
	return !aBoolean3411;
    }
    
    public void method1193(int arg0, int arg1, int arg2, int arg3) {
	anInt3365 = arg0;
	anInt3405 = arg1;
	anInt3375 = arg2;
	anInt3372 = arg3;
	float f = (float) (-anInt3365 * anInt3382) / (float) anInt3375;
	float f_19_ = (float) (-anInt3405 * anInt3382) / (float) anInt3372;
	float f_20_ = ((float) ((anInt3323 - anInt3365) * anInt3382)
		       / (float) anInt3375);
	float f_21_ = ((float) ((anInt3318 - anInt3405) * anInt3382)
		       / (float) anInt3372);
	method1318(f, f_20_, -f_21_, -f_19_, (float) anInt3382,
		   (float) anInt3428);
	if (anInt3420 != 1)
	    method1321();
	method1327();
	method1331();
    }
    
    public void method1219(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			   int i_26_, int i_27_, int i_28_, int i_29_,
			   int i_30_) {
	/* empty */
    }
    
    public void method1299() {
	if (anInt3356 != 2) {
	    method1286();
	    method1338(false);
	    method1325(false);
	    method1293(false);
	    method1345(false);
	    method1322(-2);
	    anInt3356 = 2;
	}
    }
    
    public void method1185(boolean bool) {
	/* empty */
    }
    
    public void method1300() {
	anOpengl3304.glPopMatrix();
    }
    
    public Interface2 method1301(int arg0, byte[] arg1, int arg2,
				 boolean arg3) {
	if (aBoolean3398 && (!arg3 || aBoolean3385))
	    return new Class178_Sub2(this, arg0, arg1, arg2, arg3);
	return new Class38_Sub1(this, arg0, arg1, arg2);
    }
    
    public void method1196(Class154[] arg0, Class9 arg1, Class1_Sub5[] arg2,
			   int arg3) {
	for (int i = 0; i < arg0.length; i++) {
	    if (arg0[i] != null)
		arg0[i].method2261(arg1, arg2 != null ? arg2[i] : null, arg3);
	}
    }
    
    public void method1234(Class154[] arg0, Class105 arg1, Class9 arg2,
			   Class1_Sub5[] arg3, int arg4) {
	method1196(arg0, arg2, arg3, arg4);
	method1215(arg1);
    }
    
    public void method1302() {
	aClass9_Sub1_3404 = new Class9_Sub1();
	aClass9_Sub1_3373 = new Class9_Sub1();
	aClass36Array3355 = new Class36[anInt3351];
	aClass36_Sub1_3401 = new Class36_Sub1(this, 3553, 6408, 1, 1);
	aClass36_Sub1_3340 = new Class36_Sub1(this, 3553, 6408, 1, 1);
	aClass36_Sub1_3434 = new Class36_Sub1(this, 3553, 6408, 1, 1);
	aClass154_Sub1_3392 = new Class154_Sub1(this);
	aClass154_Sub1_3402 = new Class154_Sub1(this);
	aClass154_Sub1_3378 = new Class154_Sub1(this);
	aClass154_Sub1_3374 = new Class154_Sub1(this);
	aClass154_Sub1_3391 = new Class154_Sub1(this);
	aClass154_Sub1_3346 = new Class154_Sub1(this);
	anInterface7_3430 = method1287(5123, null, 1024, true);
	if (aBoolean3354)
	    aClass102_3377 = new Class102(this);
	aClass174_3310.method2470(this);
    }
    
    public void method1215(Class105 arg0) {
	aClass174_3310.method2472(this, arg0);
    }
    
    public void method1303(int arg0, int arg1, int arg2) {
	anOpengl3304.glDrawArrays(arg0, arg1, arg2);
    }
    
    public synchronized void method1304(int arg0, int arg1) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg1);
	class131_sub24.aLong1791 = (long) arg0;
	aClass119_3326.method1018((byte) -120, class131_sub24);
    }
    
    public boolean method1259() {
	return true;
    }
    
    public void method1305(Class7 arg0, Class7 arg1, Class7 arg2,
			   Class7 arg3) {
	if (arg0 != null) {
	    anOpengl3304.glEnableClientState(32884);
	    arg0.method167(-28301);
	} else
	    anOpengl3304.glDisableClientState(32884);
	if (arg1 != null) {
	    anOpengl3304.glEnableClientState(32885);
	    arg1.method164(-80);
	} else
	    anOpengl3304.glDisableClientState(32885);
	if (arg2 != null) {
	    anOpengl3304.glEnableClientState(32886);
	    arg2.method166(true);
	} else
	    anOpengl3304.glDisableClientState(32886);
	if (arg3 != null) {
	    anOpengl3304.glEnableClientState(32888);
	    arg3.method165(-113);
	} else
	    anOpengl3304.glDisableClientState(32888);
    }
    
    public void method1306() {
	if (anInt3364 > anInt3349 || anInt3400 > anInt3433)
	    anOpengl3304.glScissor(0, 0, 0, 0);
	else
	    anOpengl3304.glScissor(anInt3370 + anInt3364,
				   anInt3424 + anInt3318 - anInt3433,
				   anInt3349 - anInt3364,
				   anInt3433 - anInt3400);
    }
    
    public boolean method1197() {
	return true;
    }
    
    public synchronized void method1307(int arg0) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg0);
	aClass119_3328.method1018((byte) -127, class131_sub24);
    }
    
    public float method1162() {
	return aFloat3384;
    }
    
    public int method1235() {
	int i = anInt3436;
	anInt3436 = 0;
	return i;
    }
    
    public void method1176(int arg0, int arg1, int arg2, int arg3, int arg4) {
	method1337();
	method1284(arg4);
	float f = (float) arg0 + 0.35F;
	float f_31_ = (float) arg1 + 0.35F;
	anOpengl3304.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
				(byte) arg3, (byte) (arg3 >> 24));
	anOpengl3304.glBegin(1);
	anOpengl3304.glVertex2f(f, f_31_);
	anOpengl3304.glVertex2f(f + (float) arg2, f_31_);
	anOpengl3304.glEnd();
    }
    
    public void method1308(float arg0, float arg1, float arg2, float arg3) {
	aFloatArray3308[0] = arg0;
	aFloatArray3308[1] = arg1;
	aFloatArray3308[2] = arg2;
	aFloatArray3308[3] = arg3;
	anOpengl3304.glTexEnvfv(8960, 8705, aFloatArray3308, 0);
    }
    
    public synchronized void method1309(int arg0) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg0);
	aClass119_3330.method1018((byte) -124, class131_sub24);
    }
    
    public void method1310(Interface7 arg0) {
	if (anInterface7_3419 != arg0 && aBoolean3398) {
	    anOpengl3304.glBindBufferARB(34963, arg0.method4());
	    anInterface7_3419 = arg0;
	}
    }
    
    public void method1230(int arg0, int arg1) {
	if (anInt3382 != arg0 || anInt3428 != arg1) {
	    anInt3382 = arg0;
	    anInt3428 = arg1;
	    method1321();
	    method1327();
	    method1276();
	}
    }
    
    public void method1311() {
	anOpengl3304.glMatrixMode(5889);
	anOpengl3304.glLoadMatrixf(aFloatArray3350, 0);
	anOpengl3304.glMatrixMode(5888);
    }
    
    public int method1164() {
	return anInt3428;
    }
    
    public void method1312(Interface7 arg0, int arg1, int arg2, int arg3) {
	method1310(arg0);
	arg0.method27(arg1, arg2, arg3);
    }
    
    public void method1228(int[] arg0) {
	arg0[0] = anInt3364;
	arg0[1] = anInt3400;
	arg0[2] = anInt3349;
	arg0[3] = anInt3433;
    }
    
    public void method1212(int arg0, int arg1) {
	if (anInt3387 != arg0 || anInt3353 != arg1) {
	    anInt3387 = arg0;
	    anInt3353 = arg1;
	    if (!aBoolean3362) {
		method1276();
		method1279();
	    }
	}
    }
    
    public void method1313(Interface5 arg0) {
	if (anInt3320 >= 3)
	    throw new RuntimeException();
	if (anInt3320 >= 0)
	    anInterface5Array3322[anInt3320].method15();
	anInterface5_3313 = anInterface5Array3322[++anInt3320] = arg0;
	anInterface5_3313.method16();
    }
    
    public void method1221() {
	anInt3323 = aCanvas3309.getWidth();
	anInt3318 = aCanvas3309.getHeight();
	anOpengl3304.glViewport(anInt3370, anInt3424, anInt3323, anInt3318);
	method1321();
	method1244();
    }
    
    public Class131_Sub27 method1256(int arg0) {
	return null;
    }
    
    public void method1192(int arg0, Class183 arg1, int arg2, int arg3) {
	Class183_Sub2 class183_sub2 = (Class183_Sub2) arg1;
	Class36_Sub1_Sub1 class36_sub1_sub1
	    = class183_sub2.aClass36_Sub1_Sub1_4966;
	method1299();
	method1347(class183_sub2.aClass36_Sub1_Sub1_4966);
	method1284(1);
	method1314(7681, 8448);
	method1298(0, 34167, 768);
	float f = (class36_sub1_sub1.aFloat6455
		   / (float) class36_sub1_sub1.anInt6459);
	float f_32_ = (class36_sub1_sub1.aFloat6458
		       / (float) class36_sub1_sub1.anInt6456);
	anOpengl3304.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8),
				(byte) arg0, (byte) (arg0 >> 24));
	anOpengl3304.glBegin(7);
	anOpengl3304.glTexCoord2f(f * (float) (anInt3364 - arg2),
				  f_32_ * (float) (anInt3400 - arg3));
	anOpengl3304.glVertex2i(anInt3364, anInt3400);
	anOpengl3304.glTexCoord2f(f * (float) (anInt3364 - arg2),
				  f_32_ * (float) (anInt3433 - arg3));
	anOpengl3304.glVertex2i(anInt3364, anInt3433);
	anOpengl3304.glTexCoord2f(f * (float) (anInt3349 - arg2),
				  f_32_ * (float) (anInt3433 - arg3));
	anOpengl3304.glVertex2i(anInt3349, anInt3433);
	anOpengl3304.glTexCoord2f(f * (float) (anInt3349 - arg2),
				  f_32_ * (float) (anInt3400 - arg3));
	anOpengl3304.glVertex2i(anInt3349, anInt3400);
	anOpengl3304.glEnd();
	method1298(0, 5890, 768);
    }
    
    public void method1252(float arg0, float arg1) {
	if (arg0 != aFloat3384 || arg1 != aFloat3413) {
	    aFloat3384 = arg0;
	    aFloat3413 = arg1;
	    method1290();
	    method1327();
	    if (anInt3420 == 3)
		method1328();
	    else if (anInt3420 == 2)
		method1311();
	}
    }
    
    public void method1242() {
	if (aClass131_Sub40_Sub1_3301.method1910(true)) {
	    aClass122_3302.method1062(aClass131_Sub40_Sub1_3301);
	    aClass117_3305.method999(3553);
	}
    }
    
    public void method1314(int arg0, int arg1) {
	if (anInt3427 == 0) {
	    boolean bool = false;
	    if (anInt3381 != arg0) {
		anOpengl3304.glTexEnvi(8960, 34161, arg0);
		anInt3381 = arg0;
		bool = true;
	    }
	    if (anInt3388 != arg1) {
		anOpengl3304.glTexEnvi(8960, 34162, arg1);
		anInt3388 = arg1;
		bool = true;
	    }
	    if (bool)
		anInt3356 &= ~0x1d;
	} else {
	    anOpengl3304.glTexEnvi(8960, 34161, arg0);
	    anOpengl3304.glTexEnvi(8960, 34162, arg1);
	}
    }
    
    public int method1165() {
	return 4;
    }
    
    public void method1315(int arg0, boolean arg1) {
	method1343(arg0, arg1, true);
    }
    
    public boolean method1223() {
	return true;
    }
    
    public void method1211(Rectangle[] arg0, int arg1) {
	method1166();
    }
    
    public void method1233(int arg0, int arg1, int arg2) {
	aBoolean3362 = true;
	anInt3376 = arg1;
	anInt3344 = arg2;
	method1276();
	method1279();
	aClass86_3307.method813(false, 3, false, 0);
	aClass86_3307.method816(true, arg0, false);
    }
    
    public void method1316(int arg0) {
	aFloatArray3308[0] = (float) (arg0 & 0xff0000) / 1.671168E7F;
	aFloatArray3308[1] = (float) (arg0 & 0xffff) / 65535.0F;
	aFloatArray3308[2] = (float) (arg0 & 0xff) / 255.0F;
	aFloatArray3308[3] = (float) (arg0 >>> 24) / 255.0F;
	anOpengl3304.glTexEnvfv(8960, 8705, aFloatArray3308, 0);
    }
    
    public void method1207(int arg0, int arg1, int arg2, int arg3, int arg4) {
	throw new IllegalStateException
		  ("Circle fill is not supported by the gl toolkit");
    }
    
    public void method1317() {
	if (anInt3356 != 4) {
	    method1286();
	    method1338(false);
	    method1325(false);
	    method1293(false);
	    method1345(false);
	    method1322(-2);
	    method1284(1);
	    method1342(1);
	    anInt3356 = 4;
	}
    }
    
    public void method1191(int arg0) {
	method1284(0);
	anOpengl3304.glClearColor((float) (arg0 & 0xff0000) / 1.671168E7F,
				  (float) (arg0 & 0xffff) / 65535.0F,
				  (float) (arg0 & 0xff) / 255.0F,
				  (float) (arg0 >>> 24) / 255.0F);
	anOpengl3304.glClear(16384);
    }
    
    public int[] method1174(int arg0, int arg1, int arg2, int arg3) {
	int[] is = new int[arg2 * arg3];
	for (int i = 0; i < arg3; i++)
	    anOpengl3304.glReadPixels(arg0, anInt3318 - arg1 - i, arg2, 1,
				      32993, anInt3432,
				      IntBuffer.wrap(is, i * arg2, arg2));
	return is;
    }
    
    public void method1187(int arg0) {
	method1294();
    }
    
    public void method1318(float arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5) {
	float f = arg4 * 2.0F;
	float[] fs = aFloatArray3350;
	fs[0] = f / (arg1 - arg0);
	fs[1] = 0.0F;
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = 0.0F;
	fs[5] = f / (arg3 - arg2);
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = (arg1 + arg0) / (arg1 - arg0);
	fs[9] = (arg3 + arg2) / (arg3 - arg2);
	fs[10] = aFloat3363 = -(arg5 + arg4) / (arg5 - arg4);
	fs[11] = -1.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = aFloat3371 = -(f * arg5) / (arg5 - arg4);
	fs[15] = 0.0F;
	method1290();
    }
    
    public boolean method1213() {
	return aClass131_Sub40_Sub1_3301.method1914();
    }
    
    public void method1202(int arg0, int arg1, int arg2, int arg3) {
	aClass122_3302.method1069(arg0, arg1, arg2, arg3);
    }
    
    public int method1319(int arg0) {
	if (arg0 == 5121 || arg0 == 5120)
	    return 1;
	if (arg0 == 5123 || arg0 == 5122)
	    return 2;
	if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126)
	    return 4;
	return 0;
    }
    
    public void method1320(float arg0, float arg1) {
	aFloat3383 = arg0;
	aFloat3423 = arg1;
	if (!aBoolean3362)
	    method1276();
    }
    
    public void method1321() {
	if (anInt3420 != 0) {
	    anInt3420 = 0;
	    anInt3356 &= ~0x1f;
	}
    }
    
    public void method1322(int arg0) {
	method1315(arg0, true);
    }
    
    public void method1246(float arg0, float arg1, float arg2) {
	Class131_Sub40_Sub1.aFloat6139 = arg0;
	Class131_Sub40_Sub1.aFloat6151 = arg1;
	Class131_Sub40_Sub1.aFloat6147 = arg2;
    }
    
    public Class36_Sub3 method1323() {
	return (aClass83_Sub1_3334 != null
		? aClass83_Sub1_3334.method802(-1457) : null);
    }
    
    public void method1194() {
	/* empty */
    }
    
    public void method1324() {
	aFloatArray3308[0] = aFloat3332 * aFloat3358;
	aFloatArray3308[1] = aFloat3332 * aFloat3397;
	aFloatArray3308[2] = aFloat3332 * aFloat3395;
	aFloatArray3308[3] = 1.0F;
	anOpengl3304.glLightfv(16384, 4609, aFloatArray3308, 0);
	aFloatArray3308[0] = -aFloat3389 * aFloat3358;
	aFloatArray3308[1] = -aFloat3389 * aFloat3397;
	aFloatArray3308[2] = -aFloat3389 * aFloat3395;
	aFloatArray3308[3] = 1.0F;
	anOpengl3304.glLightfv(16385, 4609, aFloatArray3308, 0);
    }
    
    public int method1208(int arg0, int arg1) {
	return arg0 & arg1 ^ arg1;
    }
    
    public void method1189(int arg0) {
	if (arg0 != 1)
	    throw new IllegalArgumentException
		      ("GL toolkit does not support more than 1 thread");
    }
    
    public void method1325(boolean arg0) {
	if (arg0 != aBoolean3409) {
	    aBoolean3409 = arg0;
	    method1297();
	    anInt3356 &= ~0x7;
	}
    }
    
    public synchronized void method1326(int arg0) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg0);
	aClass119_3331.method1018((byte) -124, class131_sub24);
    }
    
    public void method1327() {
	aFloat3418
	    = (aFloatArray3350[14] - (float) anInt3428) / aFloatArray3350[10];
	aFloat3343 = (float) anInt3428 - aFloat3413;
    }
    
    public void method1328() {
	float f = (float) -anInt3365 * aFloat3410 / (float) anInt3375;
	float f_33_ = (float) -anInt3405 * aFloat3410 / (float) anInt3372;
	float f_34_
	    = (float) (anInt3323 - anInt3365) * aFloat3410 / (float) anInt3375;
	float f_35_
	    = (float) (anInt3318 - anInt3405) * aFloat3410 / (float) anInt3372;
	anOpengl3304.glMatrixMode(5889);
	anOpengl3304.glLoadIdentity();
	anOpengl3304.glOrtho((double) f, (double) f_34_, (double) -f_35_,
			     (double) -f_33_,
			     (double) ((float) anInt3382 - aFloat3413),
			     (double) ((float) anInt3428 - aFloat3413));
	anOpengl3304.glMatrixMode(5888);
    }
    
    public void method1231(Class131_Sub27 class131_sub27) {
	/* empty */
    }
    
    public void method1232(int arg0, float arg1, float arg2, float arg3,
			   float arg4, float arg5) {
	boolean bool = anInt3414 != arg0;
	if (bool || aFloat3332 != arg1 || aFloat3389 != arg2) {
	    anInt3414 = arg0;
	    aFloat3332 = arg1;
	    aFloat3389 = arg2;
	    if (bool) {
		aFloat3358 = (float) (anInt3414 & 0xff0000) / 1.671168E7F;
		aFloat3397 = (float) (anInt3414 & 0xffff) / 65535.0F;
		aFloat3395 = (float) (anInt3414 & 0xff) / 255.0F;
		method1335();
	    }
	    method1324();
	}
	if (aFloatArray3408[0] != arg3 || aFloatArray3408[1] != arg4
	    || aFloatArray3408[2] != arg5) {
	    aFloatArray3408[0] = arg3;
	    aFloatArray3408[1] = arg4;
	    aFloatArray3408[2] = arg5;
	    aFloatArray3369[0] = -arg3;
	    aFloatArray3369[1] = -arg4;
	    aFloatArray3369[2] = -arg5;
	    float f
		= (float) (1.0 / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4
						     + arg5 * arg5)));
	    aFloatArray3368[0] = arg3 * f;
	    aFloatArray3368[1] = arg4 * f;
	    aFloatArray3368[2] = arg5 * f;
	    aFloatArray3337[0] = -aFloatArray3368[0];
	    aFloatArray3337[1] = -aFloatArray3368[1];
	    aFloatArray3337[2] = -aFloatArray3368[2];
	    method1349();
	    anInt3367 = (int) (arg3 * 256.0F / arg4);
	    anInt3394 = (int) (arg5 * 256.0F / arg4);
	}
    }
    
    public void method1329() {
	if (anInt3356 != 8) {
	    method1348();
	    method1338(true);
	    method1293(true);
	    method1345(true);
	    method1284(1);
	    method1342(1);
	    anInt3356 = 8;
	}
    }
    
    public int method1330(int arg0) {
	if (arg0 == 0)
	    return 7681;
	if (arg0 == 1)
	    return 8448;
	if (arg0 == 2)
	    return 34165;
	throw new IllegalArgumentException();
    }
    
    public void method1331() {
	aFloat3412 = (float) (anInt3364 - anInt3365);
	aFloat3361 = (float) (anInt3349 - anInt3365);
	aFloat3342 = (float) (anInt3400 - anInt3405);
	aFloat3341 = (float) (anInt3433 - anInt3405);
    }
    
    public void method1240(int arg0, int arg1, int arg2, int[] arg3) {
	float f = (aClass9_Sub1_3404.aFloat3608 * (float) arg0
		   + aClass9_Sub1_3404.aFloat3611 * (float) arg1
		   + aClass9_Sub1_3404.aFloat3606 * (float) arg2
		   + aClass9_Sub1_3404.aFloat3612);
	if (f < (float) anInt3382 || f > (float) anInt3428)
	    arg3[0] = arg3[1] = arg3[2] = -1;
	else {
	    int i = (int) ((float) anInt3375
			   * (aClass9_Sub1_3404.aFloat3609 * (float) arg0
			      + aClass9_Sub1_3404.aFloat3607 * (float) arg1
			      + aClass9_Sub1_3404.aFloat3602 * (float) arg2
			      + aClass9_Sub1_3404.aFloat3614)
			   / f);
	    int i_36_ = (int) ((float) anInt3372
			       * (aClass9_Sub1_3404.aFloat3603 * (float) arg0
				  + aClass9_Sub1_3404.aFloat3604 * (float) arg1
				  + aClass9_Sub1_3404.aFloat3610 * (float) arg2
				  + aClass9_Sub1_3404.aFloat3605)
			       / f);
	    if ((float) i >= aFloat3412 && (float) i <= aFloat3361
		&& (float) i_36_ >= aFloat3342
		&& (float) i_36_ <= aFloat3341) {
		arg3[0] = (int) ((float) i - aFloat3412);
		arg3[1] = (int) ((float) i_36_ - aFloat3342);
		arg3[2] = (int) f;
	    } else
		arg3[0] = arg3[1] = arg3[2] = -1;
	}
    }
    
    public void method1332() {
	anOpengl3304.glLoadIdentity();
	anOpengl3304.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
	anOpengl3304.glMultMatrixf(aClass9_Sub1_3404.method195((byte) 106), 0);
	method1349();
    }
    
    public boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5) {
	float f = (aClass9_Sub1_3404.aFloat3608 * (float) arg0
		   + aClass9_Sub1_3404.aFloat3611 * (float) arg1
		   + aClass9_Sub1_3404.aFloat3606 * (float) arg2
		   + aClass9_Sub1_3404.aFloat3612);
	if (f < 1.0F)
	    f = 1.0F;
	float f_37_ = (aClass9_Sub1_3404.aFloat3608 * (float) arg3
		       + aClass9_Sub1_3404.aFloat3611 * (float) arg4
		       + aClass9_Sub1_3404.aFloat3606 * (float) arg5
		       + aClass9_Sub1_3404.aFloat3612);
	if (f_37_ < 1.0F)
	    f_37_ = 1.0F;
	if (f < (float) anInt3382 && f_37_ < (float) anInt3382
	    || f > (float) anInt3428 && f_37_ > (float) anInt3428)
	    return false;
	int i = (int) ((float) anInt3375
		       * (aClass9_Sub1_3404.aFloat3609 * (float) arg0
			  + aClass9_Sub1_3404.aFloat3607 * (float) arg1
			  + aClass9_Sub1_3404.aFloat3602 * (float) arg2
			  + aClass9_Sub1_3404.aFloat3614)
		       / f);
	int i_38_ = (int) ((float) anInt3375
			   * (aClass9_Sub1_3404.aFloat3609 * (float) arg3
			      + aClass9_Sub1_3404.aFloat3607 * (float) arg4
			      + aClass9_Sub1_3404.aFloat3602 * (float) arg5
			      + aClass9_Sub1_3404.aFloat3614)
			   / f_37_);
	if ((float) i < aFloat3412 && (float) i_38_ < aFloat3412
	    || (float) i > aFloat3361 && (float) i_38_ > aFloat3361)
	    return false;
	int i_39_ = (int) ((float) anInt3372
			   * (aClass9_Sub1_3404.aFloat3603 * (float) arg0
			      + aClass9_Sub1_3404.aFloat3604 * (float) arg1
			      + aClass9_Sub1_3404.aFloat3610 * (float) arg2
			      + aClass9_Sub1_3404.aFloat3605)
			   / f);
	int i_40_ = (int) ((float) anInt3372
			   * (aClass9_Sub1_3404.aFloat3603 * (float) arg3
			      + aClass9_Sub1_3404.aFloat3604 * (float) arg4
			      + aClass9_Sub1_3404.aFloat3610 * (float) arg5
			      + aClass9_Sub1_3404.aFloat3605)
			   / f_37_);
	if ((float) i_39_ < aFloat3342 && (float) i_40_ < aFloat3342
	    || (float) i_39_ > aFloat3341 && (float) i_40_ > aFloat3341)
	    return false;
	return true;
    }
    
    public boolean method1159() {
	return false;
    }
    
    public boolean method1245() {
	return aBoolean3393;
    }
    
    public void method1333() {
	int i = 0;
    while_9_:
	for (;;) {
	    do {
		try {
		    if (!aContext3300.makeCurrent())
			break;
		} catch (Exception exception) {
		    break;
		}
		break while_9_;
	    } while (false);
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class187.method2575(-94, 1000L);
	}
    }
    
    public void method1334(float arg0, float arg1, float arg2) {
	anOpengl3304.glMatrixMode(5890);
	if (aBoolean3390)
	    anOpengl3304.glLoadIdentity();
	anOpengl3304.glTranslatef(arg0, arg1, arg2);
	anOpengl3304.glMatrixMode(5888);
	aBoolean3390 = true;
    }
    
    public boolean method1186() {
	return true;
    }
    
    public void method1217(int arg0, Class131_Sub8[] arg1) {
	int i;
	for (i = 0; i < arg0; i++) {
	    Class131_Sub8 class131_sub8 = arg1[i];
	    int i_41_ = 16386 + i;
	    aFloatArray3299[0] = (float) class131_sub8.anInt4195;
	    aFloatArray3299[1] = (float) class131_sub8.anInt4185;
	    aFloatArray3299[2] = (float) class131_sub8.anInt4191;
	    aFloatArray3299[3] = 1.0F;
	    anOpengl3304.glLightfv(i_41_, 4611, aFloatArray3299, 0);
	    int i_42_ = class131_sub8.anInt4189;
	    float f = class131_sub8.aFloat4187 / 255.0F;
	    aFloatArray3299[0] = (float) (i_42_ >> 16 & 0xff) * f;
	    aFloatArray3299[1] = (float) (i_42_ >> 8 & 0xff) * f;
	    aFloatArray3299[2] = (float) (i_42_ & 0xff) * f;
	    anOpengl3304.glLightfv(i_41_, 4609, aFloatArray3299, 0);
	    anOpengl3304.glLightf(i_41_, 4617,
				  1.0F / (float) (class131_sub8.anInt4192
						  * class131_sub8.anInt4192));
	    anOpengl3304.glEnable(i_41_);
	}
	for (/**/; i < anInt3335; i++)
	    anOpengl3304.glDisable(16386 + i);
	anInt3335 = arg0;
    }
    
    public void method1335() {
	aFloatArray3308[0] = aFloat3407 * aFloat3358;
	aFloatArray3308[1] = aFloat3407 * aFloat3397;
	aFloatArray3308[2] = aFloat3407 * aFloat3395;
	aFloatArray3308[3] = 1.0F;
	anOpengl3304.glLightModelfv(2899, aFloatArray3308, 0);
    }
    
    public Class68 method1237(int arg0, int arg1, int[][] arg2, int[][] arg3,
			      int arg4, int arg5, int arg6) {
	return new Class68_Sub1(this, arg5, arg6, arg0, arg1, arg2, arg3,
				arg4);
    }
    
    public void method1336() {
	if (anInt3356 != 16) {
	    method1289();
	    method1338(true);
	    method1293(true);
	    method1345(true);
	    method1284(1);
	    method1342(1);
	    anInt3356 = 16;
	}
    }
    
    public void method1188(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg2 > anInt3323)
	    arg2 = anInt3323;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg3 > anInt3318)
	    arg3 = anInt3318;
	anInt3364 = arg0;
	anInt3400 = arg1;
	anInt3349 = arg2;
	anInt3433 = arg3;
	anOpengl3304.glEnable(3089);
	method1331();
	method1306();
    }
    
    public void method1337() {
	if (anInt3356 != 1) {
	    method1286();
	    method1338(false);
	    method1325(false);
	    method1293(false);
	    method1345(false);
	    method1347(null);
	    method1322(-2);
	    method1342(0);
	    anInt3356 = 1;
	}
    }
    
    public void method1338(boolean arg0) {
	if (arg0 != aBoolean3406) {
	    aBoolean3406 = arg0;
	    method1279();
	    anInt3356 &= ~0x1f;
	}
    }
    
    public Class152 method1247(int[] arg0, int arg1, int arg2, int arg3,
			       int arg4) {
	return new Class152_Sub2(this, arg3, arg4, arg0, arg1, arg2);
    }
    
    public void method1339(Interface5 arg0) {
	if (anInt3320 < 0 || anInterface5Array3322[anInt3320] != arg0)
	    throw new RuntimeException();
	anInterface5Array3322[anInt3320--] = null;
	arg0.method15();
	if (anInt3320 >= 0) {
	    anInterface5_3313 = anInterface5Array3322[anInt3320];
	    anInterface5_3313.method16();
	}
    }
    
    public void method1340() {
	if (aBoolean3390) {
	    anOpengl3304.glMatrixMode(5890);
	    anOpengl3304.glLoadIdentity();
	    anOpengl3304.glMatrixMode(5888);
	    aBoolean3390 = false;
	}
    }
    
    public void method1183(int arg0) {
	method1333();
    }
    
    public void method1204(Class154 arg0, Class105 arg1, Class9 arg2,
			   Class1_Sub5 arg3, int arg4) {
	arg0.method2261(arg2, arg3, arg4);
	method1215(arg1);
    }
    
    public void method1248(int arg0, int arg1, int arg2, int arg3) {
	if (anInt3364 < arg0)
	    anInt3364 = arg0;
	if (anInt3349 > arg2)
	    anInt3349 = arg2;
	if (anInt3400 < arg1)
	    anInt3400 = arg1;
	if (anInt3433 > arg3)
	    anInt3433 = arg3;
	anOpengl3304.glEnable(3089);
	method1331();
	method1306();
    }
    
    public Class154 method1218(Class116 arg0, int arg1, int arg2, int arg3,
			       int arg4) {
	return new Class154_Sub1(this, arg0, arg1, arg3, arg4, arg2);
    }
    
    public boolean method1255() {
	return aClass86_3307.method814((byte) 126, 3);
    }
    
    public Class152 method1178(Class124 arg0, boolean arg1) {
	int[] is = new int[arg0.anInt1623 * arg0.anInt1619];
	int i = 0;
	int i_43_ = 0;
	if (arg0.aByteArray1622 != null) {
	    for (int i_44_ = 0; i_44_ < arg0.anInt1619; i_44_++) {
		for (int i_45_ = 0; i_45_ < arg0.anInt1623; i_45_++) {
		    is[i_43_++] = (arg0.aByteArray1622[i] << 24
				   | (arg0.anIntArray1624
				      [arg0.aByteArray1626[i] & 0xff]));
		    i++;
		}
	    }
	} else {
	    for (int i_46_ = 0; i_46_ < arg0.anInt1619; i_46_++) {
		for (int i_47_ = 0; i_47_ < arg0.anInt1623; i_47_++) {
		    int i_48_
			= arg0.anIntArray1624[arg0.aByteArray1626[i++] & 0xff];
		    is[i_43_++] = i_48_ != 0 ? ~0xffffff | i_48_ : 0;
		}
	    }
	}
	Class152 class152 = method1247(is, 0, arg0.anInt1623, arg0.anInt1623,
				       arg0.anInt1619);
	class152.method2208(arg0.anInt1625, arg0.anInt1618, arg0.anInt1620,
			    arg0.anInt1621);
	return class152;
    }
    
    public void method1177(boolean arg0) {
	aBoolean3339 = arg0;
	method1295();
    }
    
    public void method1341(Class9_Sub1 arg0) {
	anOpengl3304.glPushMatrix();
	anOpengl3304.glMultMatrixf(arg0.method195((byte) 127), 0);
    }
    
    public Class183 method1179(int arg0, int arg1, int[] arg2, int[] arg3) {
	return Class183_Sub2.method2548(6406, this, arg2, arg3, arg1, arg0);
    }
    
    public void method1250() {
	int i = anInt3364;
	int i_49_ = anInt3349;
	int i_50_ = anInt3400;
	int i_51_ = anInt3433;
	method1244();
	anOpengl3304.glReadBuffer(1028);
	anOpengl3304.glDrawBuffer(1029);
	method1321();
	method1338(false);
	method1325(false);
	method1293(false);
	method1345(false);
	method1347(null);
	method1322(-2);
	method1342(0);
	method1284(0);
	anOpengl3304.glMatrixMode(5889);
	anOpengl3304.glLoadIdentity();
	anOpengl3304.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	anOpengl3304.glMatrixMode(5888);
	anOpengl3304.glLoadIdentity();
	anOpengl3304.glRasterPos2i(0, 0);
	anOpengl3304.glCopyPixels(0, 0, anInt3323, anInt3318, 6144);
	anOpengl3304.glFlush();
	anOpengl3304.glReadBuffer(1029);
	anOpengl3304.glDrawBuffer(1029);
	method1188(i, i_50_, i_49_, i_51_);
    }
    
    public void method1342(int arg0) {
	if (arg0 == 0)
	    method1314(7681, 7681);
	else if (arg0 == 1)
	    method1314(8448, 8448);
	else if (arg0 == 2)
	    method1314(34165, 7681);
    }
    
    public boolean method1163() {
	return false;
    }
    
    public Class152 method1263(int arg0, int arg1, int arg2, int arg3,
			       boolean arg4) {
	return new Class152_Sub2(this, arg0, arg1, arg2, arg3);
    }
    
    public void method1182() {
	aClass122_3302.method1065();
    }
    
    public void method1343(int arg0, boolean arg1, boolean arg2) {
	if (arg0 != anInt3366) {
	    if (arg0 >= 0) {
		Class36_Sub1 class36_sub1
		    = aClass117_3305.method998(false, arg0);
		Class42 class42 = anInterface4_3303.method10(-19907, arg0);
		if (class42.aByte565 != 0 || class42.aByte559 != 0) {
		    int i = class42.aBoolean564 ? 64 : 128;
		    int i_52_ = i * 50;
		    method1334(((float) (anInt3324 % i_52_ * class42.aByte565)
				/ (float) i_52_),
			       ((float) (anInt3324 % i_52_ * class42.aByte559)
				/ (float) i_52_),
			       0.0F);
		} else
		    method1340();
		if (!aBoolean3362) {
		    aClass86_3307.method813(arg1, class42.aByte576, arg2, 0);
		    aClass86_3307.method816(false, class42.aByte562, false);
		    if (!aClass86_3307.method815(0, class36_sub1))
			method1347(class36_sub1);
		} else {
		    aClass86_3307.method813(arg1, 3, arg2, 0);
		    method1347(class36_sub1);
		}
	    } else {
		method1340();
		method1347(null);
		if (!aBoolean3362)
		    aClass86_3307.method813(arg1, 0, arg2, 0);
	    }
	    anInt3366 = arg0;
	}
	anInt3356 &= ~0x7;
    }
    
    public boolean method1216() {
	if (!aClass131_Sub40_Sub1_3301.method1910(true)) {
	    if (aClass122_3302.method1066(aClass131_Sub40_Sub1_3301))
		aClass117_3305.method999(3553);
	    else
		return false;
	}
	return true;
    }
    
    public float method1239() {
	return aFloat3413;
    }
    
    public Class83 method1181(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5) {
	return aBoolean3386 ? new Class83_Sub1_Sub2(this, arg0, arg1, arg2,
						    arg3, arg4, arg5) : null;
    }
    
    public Class44 method1224(Class55 arg0, Class124[] arg1, boolean arg2) {
	return new Class44_Sub3(this, arg0, arg1, arg2);
    }
    
    public void method1227(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	anOpengl3304.glLineWidth((float) arg5);
	method1180(arg0, arg1, arg2, arg3, arg4, arg6);
	anOpengl3304.glLineWidth(1.0F);
    }
    
    public synchronized void method1344(int arg0, int arg1) {
	Class131_Sub24 class131_sub24 = new Class131_Sub24(arg1);
	class131_sub24.aLong1791 = (long) arg0;
	aClass119_3327.method1018((byte) -128, class131_sub24);
    }
    
    public int method1261() {
	return anInt3382;
    }
    
    public void method15() {
	/* empty */
    }
    
    public boolean method1206() {
	return true;
    }
    
    public void method1345(boolean arg0) {
	if (arg0 != aBoolean3380) {
	    aBoolean3380 = arg0;
	    method1295();
	    anInt3356 &= ~0x1f;
	}
    }
    
    public void method1346(boolean arg0) {
	if (arg0 != aBoolean3338) {
	    aBoolean3338 = arg0;
	    method1297();
	}
    }
    
    public void method16() {
	/* empty */
    }
    
    public void method1347(Class36 arg0) {
	Class36 class36 = aClass36Array3355[anInt3427];
	if (class36 != arg0) {
	    if (arg0 != null) {
		if (class36 != null) {
		    if (arg0.anInt3454 != class36.anInt3454) {
			anOpengl3304.glDisable(class36.anInt3454);
			anOpengl3304.glEnable(arg0.anInt3454);
		    }
		} else
		    anOpengl3304.glEnable(arg0.anInt3454);
		anOpengl3304.glBindTexture(arg0.anInt3454, arg0.method471());
	    } else
		anOpengl3304.glDisable(class36.anInt3454);
	    aClass36Array3355[anInt3427] = arg0;
	}
	anInt3356 &= ~0x1;
    }
    
    public void method1348() {
	if (anInt3420 != 2) {
	    anInt3420 = 2;
	    method1311();
	    method1332();
	    anInt3356 &= ~0x7;
	}
    }
    
    public void method1173(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	float f = (float) arg0 + 0.35F;
	float f_53_ = (float) arg1 + 0.35F;
	float f_54_ = f + (float) arg2;
	float f_55_ = f_53_ + (float) arg3;
	method1337();
	method1284(arg5);
	anOpengl3304.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
				(byte) arg4, (byte) (arg4 >> 24));
	if (aBoolean3393)
	    anOpengl3304.glDisable(32925);
	anOpengl3304.glBegin(7);
	anOpengl3304.glVertex2f(f, f_53_);
	anOpengl3304.glVertex2f(f, f_55_);
	anOpengl3304.glVertex2f(f_54_, f_55_);
	anOpengl3304.glVertex2f(f_54_, f_53_);
	anOpengl3304.glEnd();
	if (aBoolean3393)
	    anOpengl3304.glEnable(32925);
    }
    
    public void method1349() {
	anOpengl3304.glLightfv(16384, 4611, aFloatArray3408, 0);
	anOpengl3304.glLightfv(16385, 4611, aFloatArray3369, 0);
    }
    
    public void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
	method1337();
	method1284(arg4);
	float f = (float) arg0 + 0.35F;
	float f_56_ = (float) arg1 + 0.35F;
	anOpengl3304.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
				(byte) arg3, (byte) (arg3 >> 24));
	anOpengl3304.glBegin(1);
	anOpengl3304.glVertex2f(f, f_56_);
	anOpengl3304.glVertex2f(f, f_56_ + (float) arg2);
	anOpengl3304.glEnd();
    }
    
    public int method17() {
	return anInt3318;
    }
    
    public Class130_Sub2(Canvas arg0, Interface4 arg1, int arg2, int arg3,
			 SignLink arg4) {
	aBoolean3317 = false;
	aClass119_3319 = new Class119();
	aClass119_3326 = new Class119();
	aClass119_3327 = new Class119();
	aClass119_3328 = new Class119();
	aClass119_3329 = new Class119();
	aClass119_3330 = new Class119();
	aClass119_3331 = new Class119();
	anInt3335 = 0;
	aFloat3343 = 3584.0F;
	anInt3349 = 0;
	aBoolean3339 = true;
	aFloat3332 = -1.0F;
	anInt3372 = 512;
	aFloatArray3350 = new float[16];
	anInt3375 = 512;
	aFloatArray3368 = new float[4];
	anInt3344 = -1;
	anInt3370 = 0;
	aFloat3389 = -1.0F;
	anInt3387 = -1;
	anInt3381 = 8448;
	aFloatArray3408 = new float[4];
	anInt3376 = -1;
	anInt3365 = 0;
	aFloat3395 = 1.0F;
	aFloatArray3337 = new float[4];
	aFloat3358 = 1.0F;
	anInt3405 = 0;
	aFloatArray3369 = new float[4];
	anInt3364 = 0;
	aFloat3418 = 3584.0F;
	anInt3400 = 0;
	anInt3382 = 50;
	aFloat3397 = 1.0F;
	aFloat3423 = 0.0F;
	anInt3428 = 3584;
	anInt3414 = -1;
	aFloat3383 = 1.0F;
	aFloat3410 = 1.0F;
	anInt3424 = 0;
	anInt3353 = -1;
	anInt3388 = 8448;
	anInt3433 = 0;
	aCanvas3309 = arg0;
	anInterface4_3303 = arg1;
	anInt1781 = arg2;
	int i = 0;
	while (!aCanvas3309.isShowing()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class187.method2575(-40, 1000L);
	}
	aCanvas3309.setIgnoreRepaint(true);
	try {
	    if (aBoolean3306 == null || !aBoolean3306.booleanValue()) {
		if (arg4 != null) {
		    Class139 class139 = arg4.method2694(this.getClass(), 10);
		    while (class139.anInt1864 == 0)
			Class187.method2575(-31, 100L);
		    if (class139.anInt1864 == 1)
			aBoolean3306 = Boolean.TRUE;
		} else {
		    System.loadLibrary("jawt");
		    System.loadLibrary("jaggl");
		    aBoolean3306 = Boolean.TRUE;
		}
	    }
	    if (aBoolean3306 == null || !aBoolean3306.booleanValue())
		throw new RuntimeException("");
	    aContext3300 = new context();
	    if (!aContext3300.choosePixelFormat(aCanvas3309, arg3, 0))
		throw new RuntimeException("");
	    if (!aContext3300.createContext())
		throw new RuntimeException("");
	    method1333();
	    anOpengl3304 = aContext3300.getGL();
	    int i_57_ = method1288();
	    if (i_57_ != 0)
		throw new RuntimeException("");
	    anInt3432 = aBoolean3360 ? 33639 : 5121;
	    String string = aString3429.toLowerCase();
	    String string_58_ = aString3357.toLowerCase();
	    if (string_58_.indexOf("radeon") != -1) {
		int i_59_ = 0;
		boolean bool = false;
		boolean bool_60_ = false;
		String[] strings
		    = Class131_Sub41_Sub21.method2077((byte) 109,
						      string_58_.replace('/',
									 ' '),
						      ' ');
		for (int i_61_ = 0; i_61_ < strings.length; i_61_++) {
		    String string_62_ = strings[i_61_];
		    try {
			if (string_62_.length() <= 0)
			    continue;
			if (string_62_.charAt(0) == 'x'
			    && string_62_.length() >= 3
			    && (Class131_Sub41_Sub18.method2055
				(string_62_.substring(1, 3), (byte) -38))) {
			    string_62_ = string_62_.substring(1);
			    bool_60_ = true;
			}
			if (string_62_.equals("hd")) {
			    bool = true;
			    continue;
			}
			if (string_62_.startsWith("hd")) {
			    string_62_ = string_62_.substring(2);
			    bool = true;
			}
			if (string_62_.length() < 4
			    || !(Class131_Sub41_Sub18.method2055
				 (string_62_.substring(0, 4), (byte) -38)))
			    continue;
			i_59_ = Class161.method2393(string_62_.substring(0, 4),
						    (byte) 20);
		    } catch (Exception exception) {
			continue;
		    }
		    break;
		}
		if (!bool_60_ && !bool) {
		    if (i_59_ >= 7000 && i_59_ <= 7999)
			aBoolean3398 = false;
		    if (i_59_ >= 7000 && i_59_ <= 9250)
			aBoolean3333 = false;
		}
		if (!bool || i_59_ < 4000)
		    aBoolean3421 = false;
		aBoolean3359
		    &= anOpengl3304
			   .isExtensionAvailable("GL_ARB_half_float_pixel");
		aBoolean3385 = aBoolean3398;
	    }
	    if (string.contains("intel"))
		aBoolean3354 = false;
	    if (aBoolean3398) {
		try {
		    int[] is = new int[1];
		    anOpengl3304.glGenBuffersARB(1, is, 0);
		} catch (Throwable throwable) {
		    throw new RuntimeException("", throwable);
		}
	    }
	    method1313(this);
	    method1221();
	    method1302();
	    new Class62(this);
	    aClass117_3305 = new Class117(this, anInterface4_3303);
	    Class149.method2185(-32, true, true);
	    aBoolean3317 = true;
	    aClass86_3307 = new Class86(this);
	    aClass122_3302 = new Class122(this);
	    aClass131_Sub40_Sub1_3301 = new Class131_Sub40_Sub1(this);
	    method1281();
	    anOpengl3304.glClear(16640);
	    i = 0;
	    for (;;) {
		try {
		    aContext3300.swapBuffers();
		    break;
		} catch (Exception exception) {
		    if (i++ > 5)
			throw new RuntimeException("");
		    Class187.method2575(-40, 100L);
		}
	    }
	    anOpengl3304.glClear(16384);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method1158();
	    throw new RuntimeException("OpenGL toolkit initialisation failed",
				       throwable);
	}
    }
}
