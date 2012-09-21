/* Class131_Sub2_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub21 extends Class131_Sub2
{
    public int anInt5846;
    public int anInt5847 = 3072;
    public static int anInt5848 = 0;
    public static int anInt5849;
    public static int anInt5850;
    public static int anInt5851;
    public static int anInt5852;
    public static Class137 aClass137_5853 = new Class137(128);
    public static int anInt5854 = 0;
    public static int anInt5855 = 0;
    public static String aString5856 = "flash1:";
    public int anInt5857;
    public static int anInt5858;
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	if (arg1 != -49)
	    anInt5848 = -67;
	anInt5858++;
	int i = arg0;
    while_136_:
	do {
	    do {
		if (i != 0) {
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 2)
			    break;
			break while_136_;
		    }
		} else {
		    anInt5857 = arg2.readUnsignedShort(8104);
		    return;
		}
		anInt5847 = arg2.readUnsignedShort(8104);
		return;
	    } while (false);
	    aBoolean4093 = (arg2.readUnsignedByte(74) ^ 0xffffffff) == -2;
	} while (false);
    }
    
    public static void method1572(boolean arg0) {
	try {
	    if (arg0 == false) {
		aString5856 = null;
		aClass137_5853 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kh.D(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2_Sub21() {
	super(1, false);
	anInt5846 = 2048;
	anInt5857 = 1024;
    }
    
    public void method1471(int arg0) {
	anInt5846 = -anInt5857 + anInt5847;
	anInt5852++;
	if (arg0 != 0)
	    anInt5855 = -114;
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		method1462(52, -27);
	    anInt5849++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_0_ = this.method1463(0, (byte) 118, arg0);
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		for (int i = 0; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    is_4_[i]
			= (anInt5846 * is_1_[i] >> -1350606452) + anInt5857;
		    is_5_[i]
			= anInt5857 - -(is_2_[i] * anInt5846 >> 1443823532);
		    is_6_[i]
			= anInt5857 - -(anInt5846 * is_3_[i] >> 1102211852);
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kh.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5850++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 121);
	    if (arg0 != -11543)
		anInt5848 = -28;
	    if (aClass200_4087.aBoolean2927) {
		int[] is_7_ = this.method1459(0, (byte) -40, arg1);
		for (int i = 0; ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++)
		    is[i] = anInt5857 + (anInt5846 * is_7_[i] >> -1233160852);
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kh.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class51 method1573(byte arg0, int arg1) {
	try {
	    anInt5851++;
	    Class51 class51
		= ((Class51)
		   Class156.aClass214_2070.method2780(124, (long) arg1));
	    if (class51 != null)
		return class51;
	    byte[] is = Class184.aClass158_2630.method2364(arg1, 34, 0);
	    class51 = new Class51();
	    if (is != null)
		class51.method590((byte) 85, new Stream(is), arg1);
	    if (arg0 != -110)
		return null;
	    Class156.aClass214_2070.method2773(true, class51, (long) arg1);
	    return class51;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kh.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
