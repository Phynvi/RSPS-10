/* Class131_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub22 extends Class131
{
    public static boolean aBoolean4446 = false;
    public byte[] aByteArray4447;
    public static int[] anIntArray4448;
    public static int anInt4449;
    
    public static void method1821(int arg0) {
	try {
	    if (arg0 >= 71)
		anIntArray4448 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mq.A(" + arg0 + ')');
	}
    }
    
    public Class131_Sub22(byte[] arg0) {
	try {
	    aByteArray4447 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mq.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
