/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class207
{
    public int anInt3020;
    public int anInt3021;
    public static int anInt3022 = 0;
    public static byte aByte3023;
    public int anInt3024;
    public static int anInt3025;
    public int anInt3026;
    public static Class158 aClass158_3027;
    public static int anInt3028;
    public static Color[] aColorArray3029
	= { new Color(9179409), new Color(16777215) };
    public int anInt3030;
    public byte[] aByteArray3031;
    public int anInt3032;
    public int anInt3033;
    public byte[] aByteArray3034;
    
    public static int method2747(int arg0, Class158 arg1) {
	try {
	    anInt3028++;
	    if (arg0 != 3160)
		method2748((byte) 6);
	    int i = 0;
	    if (arg1.method2343(-114, Class131_Sub17.anInt4377))
		i++;
	    if (arg1.method2343(-126, Class203.anInt2962))
		i++;
	    if (arg1.method2343(-121, Class85.anInt1111))
		i++;
	    if (arg1.method2343(-112, Class55.anInt714))
		i++;
	    if (arg1.method2343(-120, Class110_Sub1.anInt3892))
		i++;
	    if (arg1.method2343(arg0 + -3276, Class44.anInt600))
		i++;
	    if (arg1.method2343(-117, Class131_Sub31.anInt4527))
		i++;
	    if (arg1.method2343(-118, Class93.anInt1225))
		i++;
	    if (arg1.method2343(-127, Class74.anInt1009))
		i++;
	    if (arg1.method2343(-127, Class209.anInt3055))
		i++;
	    if (arg1.method2343(-122, Class131_Sub2_Sub9.anInt5680))
		i++;
	    if (arg1.method2343(arg0 ^ ~0xc24, Class105.anInt1368))
		i++;
	    if (arg1.method2343(arg0 ^ ~0xc2c, Class131_Sub21.anInt4434))
		i++;
	    if (arg1.method2343(-124, Class131_Sub41_Sub5.anInt6230))
		i++;
	    if (arg1.method2343(-123, Class130.anInt1769))
		i++;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("v.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2748(byte arg0) {
	try {
	    int i = -34 / ((arg0 - -33) / 37);
	    aColorArray3029 = null;
	    aClass158_3027 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"v.B(" + arg0 + ')');
	}
    }
}
