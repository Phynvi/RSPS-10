/* Class38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub2 extends Class38 implements Interface7
{
    public int anInt3447;
    public int anInt3448;
    
    public Class38_Sub2(Class130_Sub2 arg0, int arg1, byte[] arg2, int arg3) {
	super(arg0, arg2, arg3);
	anInt3448 = arg1;
	anInt3447 = aClass130_Sub2_507.method1319(anInt3448);
    }
    
    public int method4() {
	return 0;
    }
    
    public void method27(int arg0, int arg1, int arg2) {
	aClass130_Sub2_507.anOpengl3304.glDrawElements
	    (arg0, arg2, anInt3448, aByteBuffer508.position(arg1 * anInt3447));
    }
    
    public void method26(int arg0, byte[] arg1, int arg2) {
	method500(arg1, arg2);
	anInt3448 = arg0;
	anInt3447 = aClass130_Sub2_507.method1319(anInt3448);
    }
}
