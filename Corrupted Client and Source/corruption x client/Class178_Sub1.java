/* Class178_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class178_Sub1 extends Class178 implements Interface7
{
    public int anInt3445;
    public int anInt3446;
    
    public void method26(int arg0, byte[] arg1, int arg2) {
	method2494(arg1, arg2);
	anInt3445 = arg0;
	anInt3446 = aClass130_Sub2_2535.method1319(anInt3445);
    }
    
    public void method27(int arg0, int arg1, int arg2) {
	aClass130_Sub2_2535.anOpengl3304
	    .glDrawElements(arg0, arg2, anInt3445, (long) (arg1 * anInt3446));
    }
    
    public int method4() {
	return super.method4();
    }
    
    public void method2493() {
	aClass130_Sub2_2535.method1310(this);
    }
    
    public Class178_Sub1(Class130_Sub2 arg0, int arg1, byte[] arg2, int arg3,
			 boolean arg4) {
	super(arg0, 34963, arg2, arg3, arg4);
	anInt3445 = arg1;
	anInt3446 = aClass130_Sub2_2535.method1319(anInt3445);
    }
}
