/* Class128_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub1 extends Class128
{
    public static Class158 aClass158_4012;
    public static Class33 aClass33_4013;
    public static int anInt4014 = 0;
    public int anInt4015 = -1;
    public static int[] anIntArray4016;
    public String aString4017;
    public static boolean[] aBooleanArray4018 = new boolean[100];
    public static int[] anIntArray4019 = new int[250];
    public String aString4020;
    public static int anInt4021;
    public int anInt4022;
    public static int anInt4023;
    
    public static void method1145(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(112);
	    anInt4021++;
	    Class212.anInt3114++;
	    Class93.aClass131_Sub15_Sub2_1226.writeInt(arg0);
	    Class93.aClass131_Sub15_Sub2_1226.writeShort(arg4);
	    if (arg3 <= 19)
		aClass158_4012 = null;
	    Class93.aClass131_Sub15_Sub2_1226.writeShortA(arg1, (byte) -127);
	    Class93.aClass131_Sub15_Sub2_1226.writeInt1((byte) -55, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("c.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1146(int arg0, int arg1) {
	Class147 class147
	    = Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg0][arg1];
	for (int i = 0; i < 3; i++) {
	    Class147 class147_0_
		= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i]
		       [arg0][arg1]
		   = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i + 1]
		      [arg0][arg1]));
	    if (class147_0_ != null) {
		class147_0_.aByte1962--;
		for (Class82 class82 = class147_0_.aClass82_1958;
		     class82 != null; class82 = class82.aClass82_1086) {
		    Class23_Sub4 class23_sub4 = class82.aClass23_Sub4_1080;
		    if (class23_sub4.aShort3745 == arg0
			&& class23_sub4.aShort3737 == arg1)
			class23_sub4.aByte3740--;
		}
	    }
	}
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg0][arg1]
	    == null) {
	    Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg0][arg1]
		= new Class147(0, arg0, arg1);
	    Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg0][arg1]
		.aByte1965
		= (byte) 1;
	}
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg0][arg1]
	    .aClass147_1952
	    = class147;
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[3][arg0][arg1] = null;
    }
    
    public static void method1147(byte arg0) {
	try {
	    anIntArray4016 = null;
	    aBooleanArray4018 = null;
	    anIntArray4019 = null;
	    if (arg0 == 4) {
		aClass158_4012 = null;
		aClass33_4013 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"c.I(" + arg0 + ')');
	}
    }
    
    public Class84 method1148(int arg0) {
	try {
	    anInt4023++;
	    if (arg0 != 20203)
		aString4020 = null;
	    return Class28.aClass84Array282[anInt1751];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"c.L(" + arg0 + ')');
	}
    }
    
    static {
	anIntArray4016 = new int[14];
    }
}
