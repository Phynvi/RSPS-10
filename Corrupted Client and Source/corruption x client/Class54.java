/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
    public int anInt709;
    public Class130_Sub2 aClass130_Sub2_710;
    
    public void method607(int arg0) {
	aClass130_Sub2_710.anOpengl3304.glNewList(anInt709 + arg0, 4864);
    }
    
    public void method608() {
	aClass130_Sub2_710.anOpengl3304.glEndList();
    }
    
    public Class54(Class130_Sub2 arg0, int arg1) {
	aClass130_Sub2_710 = arg0;
	anInt709 = aClass130_Sub2_710.anOpengl3304.glGenLists(arg1);
    }
    
    public void method609(char arg0) {
	aClass130_Sub2_710.anOpengl3304.glCallList(anInt709 + arg0);
    }
}
