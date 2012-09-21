/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class93
{
    public int anInt1214 = 0;
    public static int anInt1215;
    public static int anInt1216;
    public int anInt1217 = 0;
    public static Class214 aClass214_1218 = new Class214(16);
    public static Class100 aClass100_1219;
    public static int anInt1220;
    public static int anInt1221;
    public static Class44 aClass44_1222;
    public static boolean aBoolean1223;
    public static int[] anIntArray1224 = new int[14];
    public static int anInt1225;
    public static PacketStream aClass131_Sub15_Sub2_1226;
    public static int anInt1227;
    public int anInt1228;
    public int anInt1229 = 2048;
    
    public void method852(int arg0, int arg1, Stream arg2, int arg3) {
	try {
	    if (arg1 == 1)
		anInt1214 = arg2.readUnsignedByte(-10);
	    else if (arg1 != 2) {
		if ((arg1 ^ 0xffffffff) == -4)
		    anInt1228 = arg2.readUnsignedShort(8104);
		else if ((arg1 ^ 0xffffffff) == -5)
		    anInt1217 = arg2.readSignedShort(1625554944);
	    } else
		anInt1229 = arg2.readUnsignedShort(8104);
	    if (arg0 == -4)
		anInt1215++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jr.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public void method853(int arg0, int arg1, Stream arg2) {
	try {
	    if (arg0 == 14) {
		anInt1220++;
		for (;;) {
		    int i = arg2.readUnsignedByte(arg0 ^ 0x30);
		    if (i == 0)
			break;
		    method852(arg0 ^ ~0xd, i, arg2, arg1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jr.A(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method854(int arg0) {
	aClass100_1219 = null;
	aClass131_Sub15_Sub2_1226 = null;
	aClass214_1218 = null;
	anIntArray1224 = null;
	aClass44_1222 = null;
	if (arg0 != 2048)
	    method854(-53);
    }
    
    public Class93() {
	anInt1228 = 2048;
    }
    
    static {
	aBoolean1223 = false;
	anInt1227 = 1;
	aClass131_Sub15_Sub2_1226 = new PacketStream(5000);
    }
}
