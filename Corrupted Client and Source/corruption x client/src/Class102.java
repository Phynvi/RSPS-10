/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102 implements Interface5
{
    public int anInt3437;
    public Class130_Sub2 aClass130_Sub2_3438;
    public static int[] anIntArray3439 = new int[1];
    public int anInt3440;
    public int anInt3441;
    public static int[] anIntArray3442
	= { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
    public int anInt3443;
    public Interface9[] anInterface9Array3444 = new Interface9[9];
    
    public void method16() {
	aClass130_Sub2_3438.anOpengl3304.glBindFramebufferEXT(36160,
							      anInt3440);
    }
    
    public void method15() {
	aClass130_Sub2_3438.anOpengl3304.glBindFramebufferEXT(36160, 0);
    }
    
    public void method889(int arg0) {
	if (anInterface9Array3444[arg0] != null)
	    anInterface9Array3444[arg0].method34();
	anInt3437 &= 1 << arg0 ^ 0xffffffff;
	anInterface9Array3444[arg0] = null;
    }
    
    public void method890(int arg0) {
	if (this != aClass130_Sub2_3438.method1285())
	    throw new RuntimeException();
	aClass130_Sub2_3438.anOpengl3304.glDrawBuffer(anIntArray3442[arg0]);
    }
    
    public void method891(int arg0, Class217 arg1) {
	if (this != aClass130_Sub2_3438.method1285())
	    throw new RuntimeException();
	int i = 1 << arg0;
	if ((anInt3437 & (i ^ 0xffffffff)) != 0) {
	    if (arg1.anInt3463 != anInt3441 || arg1.anInt3464 != anInt3443)
		throw new RuntimeException();
	} else {
	    anInt3441 = arg1.anInt3463;
	    anInt3443 = arg1.anInt3464;
	}
	arg1.method2819(anIntArray3442[arg0]);
	anInterface9Array3444[arg0] = arg1;
	anInt3437 |= i;
    }
    
    public void finalize() throws Throwable {
	aClass130_Sub2_3438.method1307(anInt3440);
	super.finalize();
    }
    
    public int method17() {
	return anInt3443;
    }
    
    public void method892(int arg0, Class36_Sub3 arg1, int arg2) {
	method895(arg0, arg1, 0, arg2);
    }
    
    public void method893(int arg0, Class36_Sub1 arg1, int arg2) {
	if (this != aClass130_Sub2_3438.method1285())
	    throw new RuntimeException();
	int i = 1 << arg0;
	if ((anInt3437 & (i ^ 0xffffffff)) != 0) {
	    if (arg1.anInt5197 != anInt3441 || arg1.anInt5196 != anInt3443)
		throw new RuntimeException();
	} else {
	    anInt3441 = arg1.anInt5197;
	    anInt3443 = arg1.anInt5196;
	}
	arg1.method483(anIntArray3442[arg0], arg2);
	anInterface9Array3444[arg0] = arg1;
	anInt3437 |= i;
    }
    
    public boolean method894() {
	int i = aClass130_Sub2_3438.anOpengl3304
		    .glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method895(int arg0, Class36_Sub3 arg1, int arg2, int arg3) {
	if (this != aClass130_Sub2_3438.method1285())
	    throw new RuntimeException();
	int i = 1 << arg0;
	if ((anInt3437 & (i ^ 0xffffffff)) != 0) {
	    if (arg1.anInt5204 != anInt3441 || arg1.anInt5204 != anInt3443)
		throw new RuntimeException();
	} else {
	    anInt3441 = arg1.anInt5204;
	    anInt3443 = arg1.anInt5204;
	}
	arg1.method490(anIntArray3442[arg0], arg2, arg3);
	anInterface9Array3444[arg0] = arg1;
	anInt3437 |= i;
    }
    
    public void method896(int arg0, Class36_Sub1 arg1) {
	method893(arg0, arg1, 0);
    }
    
    public Class102(Class130_Sub2 arg0) {
	if (!arg0.aBoolean3354)
	    throw new IllegalStateException("");
	aClass130_Sub2_3438 = arg0;
	aClass130_Sub2_3438.anOpengl3304
	    .glGenFramebuffersEXT(1, anIntArray3439, 0);
	anInt3440 = anIntArray3439[0];
    }
}
