/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96
{
    public static float[] aFloatArray1272;
    public static float[] aFloatArray1273 = new float[16384];
    
    static {
	aFloatArray1272 = new float[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
	    aFloatArray1273[i] = (float) Math.sin((double) i * d);
	    aFloatArray1272[i] = (float) Math.cos((double) i * d);
	}
    }
}
