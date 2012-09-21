/* Class178_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class178_Sub2 extends Class178 implements Interface2
{
    public int anInt3270;
    
    public void method8(Class7 arg0) {
	aClass130_Sub2_2535.anOpengl3304.glColorPointer(arg0.aByte99,
							arg0.aShort103,
							anInt3270,
							(long) arg0.aByte100);
    }
    
    public int method4() {
	return super.method4();
    }
    
    public void method7(Class7 arg0) {
	aClass130_Sub2_2535.anOpengl3304
	    .glNormalPointer(arg0.aShort103, anInt3270, (long) arg0.aByte100);
    }
    
    public void method2493() {
	aClass130_Sub2_2535.method1278(this);
    }
    
    public void method5(Class7 arg0) {
	aClass130_Sub2_2535.anOpengl3304.glVertexPointer(arg0.aByte99,
							 arg0.aShort103,
							 anInt3270,
							 (long) arg0.aByte100);
    }
    
    public Class178_Sub2(Class130_Sub2 arg0, int arg1, byte[] arg2, int arg3,
			 boolean arg4) {
	super(arg0, 34962, arg2, arg3, arg4);
	anInt3270 = arg1;
    }
    
    public Class178_Sub2(Class130_Sub2 arg0, int arg1, ByteBuffer arg2,
			 boolean arg3) {
	super(arg0, 34962, arg2, arg3);
	anInt3270 = arg1;
    }
    
    public void method6(Class7 arg0) {
	aClass130_Sub2_2535.anOpengl3304.glTexCoordPointer(arg0.aByte99,
							   arg0.aShort103,
							   anInt3270,
							   (long) (arg0
								   .aByte100));
    }
    
    public void method3(int arg0, byte[] arg1, int arg2) {
	method2494(arg1, arg2);
	anInt3270 = arg0;
    }
}
