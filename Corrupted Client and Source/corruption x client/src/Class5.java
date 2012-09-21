/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5
{
    public static String aString88 = "Loading config - ";
    public static short[] aShortArray89;
    public static int anInt90;
    public static int anInt91;
    
    public static void method159(int arg0, Class158 arg1) {
	try {
	    Class131.aClass158_1788 = arg1;
	    anInt91++;
	    int i = -55 % ((arg0 - 8) / 61);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ah.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method160(int arg0) {
	aString88 = null;
	aShortArray89 = null;
	if (arg0 != 0)
	    aString88 = null;
    }
    
    public static void method161(byte arg0, String arg1, int arg2, int arg3,
				 int arg4) {
	anInt90++;
	if (arg0 != 31)
	    aShortArray89 = null;
	Class173 class173 = InputStream_Sub1.method87(arg4, arg2, (byte) -114);
	if (class173 != null) {
	    if (class173.anObjectArray2465 != null) {
		Class131_Sub14 class131_sub14 = new Class131_Sub14();
		class131_sub14.aString4277 = arg1;
		class131_sub14.aClass173_4276 = class173;
		class131_sub14.anObjectArray4281 = class173.anObjectArray2465;
		class131_sub14.anInt4275 = arg3;
		Class168.method2437(class131_sub14);
	    }
	    boolean bool = true;
	    if ((class173.anInt2441 ^ 0xffffffff) < -1)
		bool = Class214.method2772(class173, -5241);
	    if (bool && client.method66(class173).method1880(-1 + arg3,
							     (byte) -115)) {
		if (arg3 == 1) {
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(216);
		    Class131_Sub29.anInt4505++;
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if ((arg3 ^ 0xffffffff) == -3) {
		    Class131_Sub1_Sub1.anInt5456++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(19);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if (arg3 == 3) {
		    Class131_Sub2.anInt4076++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(193);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if (arg3 == 4) {
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(76);
		    Class147.anInt1947++;
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if ((arg3 ^ 0xffffffff) == -6) {
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(173);
		    Class22_Sub1.anInt3653++;
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if ((arg3 ^ 0xffffffff) == -7) {
		    Class51.anInt680++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(89);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if (arg3 == 7) {
		    Class137.anInt1835++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(221);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if (arg3 == 8) {
		    Class23_Sub4_Sub3.anInt4999++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(137);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if ((arg3 ^ 0xffffffff) == -10) {
		    Class175.anInt2510++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(63);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
		if ((arg3 ^ 0xffffffff) == -11) {
		    Class23_Sub4_Sub3.anInt5019++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(3);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
		}
	    }
	}
    }
}
