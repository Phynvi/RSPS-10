/* Class131_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub38 extends Class131
{
    public int anInt4610;
    public static int anInt4611;
    public static int[] anIntArray4612;
    public int anInt4613;
    public int anInt4614;
    public int anInt4615;
    public int anInt4616;
    public static int anInt4617;
    public static int anInt4618 = 0;
    public int anInt4619;
    public int anInt4620;
    public int anInt4621;
    public static int anInt4622;
    public int anInt4623;
    public int anInt4624;
    public int anInt4625;
    public int anInt4626;
    public static boolean aBoolean4627;
    
    public static void method1891(int arg0) {
	try {
	    anInt4622++;
	    Class8 class8 = null;
	    try {
		if (arg0 != 6)
		    return;
		Class139 class139
		    = Class23_Sub4.aSignLink_3734.method2684(16389);
		while (class139.anInt1864 == 0)
		    Class187.method2575(-81, 1L);
		if ((class139.anInt1864 ^ 0xffffffff) == -2) {
		    class8 = (Class8) class139.anObject1866;
		    Stream stream
			= new Stream(6 * Class57.anInt747 + 3);
		    stream.writeByte(1);
		    stream.writeShort(Class57.anInt747);
		    for (int i = 0; ((Class131_Sub2_Sub33.anIntArray6025.length
				      ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++) {
			if (Class43.aBooleanArray586[i]) {
			    stream.writeShort(i);
			    stream.writeInt((Class131_Sub2_Sub33
						       .anIntArray6025[i]));
			}
		    }
		    class8.method168(stream.data, 1, 0,
				     stream.offset);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    try {
		if (class8 != null)
		    class8.method170(1);
	    } catch (Exception exception) {
		/* empty */
	    }
	    Class131_Sub41_Sub2.aLong6180 = Class208.method2749(arg0 + -3919);
	    Class131_Sub6.aBoolean4156 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vf.B(" + arg0 + ')');
	}
    }
    
    public static void method1892(byte arg0) {
	anIntArray4612 = null;
	if (arg0 != 55)
	    method1892((byte) -47);
    }
    
    static {
	anIntArray4612 = new int[32];
	int i = 2;
	for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -33; i_0_++) {
	    anIntArray4612[i_0_] = -1 + i;
	    i += i;
	}
	aBoolean4627 = true;
    }
}
