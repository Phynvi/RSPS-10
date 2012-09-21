/* Class131_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub31 extends Class131
{
    public static int anInt4524 = 0;
    public static int anInt4525;
    public static int anInt4526;
    public static int anInt4527;
    public static int anInt4528;
    public int anInt4529;
    public static int[] anIntArray4530;
    public static int[] anIntArray4531;
    public static int anInt4532;
    public static int anInt4533;
    public int anInt4534;
    public static int anInt4535;
    public static int[] anIntArray4536;
    public static int anInt4537 = 1;
    public static String[] aStringArray4538;
    public static int[] anIntArray4539;
    public static int[] anIntArray4540;
    public static int anInt4541;
    public static Class214 aClass214_4542;
    public static int[] anIntArray4543;
    public static int anInt4544;
    public static Class214 aClass214_4545;
    public static int anInt4546;
    
    public static void method1860(int arg0, long arg1, String arg2, int arg3,
				  int arg4, String arg5, int arg6, int arg7) {
	try {
	    anInt4525++;
	    if (!Class131_Sub2_Sub24.aBoolean5890
		&& (Class147.anInt1946 ^ 0xffffffff) > -501) {
		arg0 = arg0 != arg3 ? arg0 : Class23_Sub5_Sub2.anInt5048;
		Class131_Sub21 class131_sub21
		    = new Class131_Sub21(arg2, arg5, arg0, arg7, arg1, arg4,
					 arg6);
		Class66.aClass119_843.method1018((byte) -128, class131_sub21);
		Class147.anInt1946++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("sk.D(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + (arg5 != null ? "{...}" : "null") + ','
			+ arg6 + ',' + arg7 + ')'));
	}
    }
    
    public static void method1861(int arg0, String arg1, int arg2,
				  String arg3) {
	do {
	    try {
		anInt4541++;
		Class90.anInt1175 = arg2;
		Class131_Sub2_Sub11.aString5710 = arg1;
		Class64.aString809 = arg3;
		if (Class64.aString809.equals("")
		    || Class131_Sub2_Sub11.aString5710.equals(""))
		    Class4.anInt3281 = 3;
		else if ((Class110_Sub2.anInt3914 ^ 0xffffffff) != 0)
		    Class153.method2227((byte) 78);
		else {
		    Class156.anInt2072 = 0;
		    Class4.anInt3281 = -3;
		    Class131_Sub29.anInt4506 = 0;
            Class75.anInt1024 = 1;
		    Stream stream = new Stream(128);
		    stream.writeByte(10);
		    stream.writeInt((int) (Math.random()
						     * 9.9999999E7));
		    stream.method1747
			((byte) 121,
			 Class173.method2454(Class64.aString809, 65535));
		    stream.writeInt((int) (Math.random()
						     * 9.9999999E7));
		    stream.writeString(Class131_Sub2_Sub11.aString5710,
					      (byte) -126);
		    stream.writeInt((int) (Math.random()
						     * 9.9999999E7));
		    stream.method1761((RuntimeException_Sub1
					       .aBigInteger3246),
					      (byte) -114,
					      (Class131_Sub2_Sub10
					       .aBigInteger5699));
		    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(24);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeByte(stream.offset + 2);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort(562);
		    Class93.aClass131_Sub15_Sub2_1226.method1734
			(0, arg0 + -23946, stream.data,
			 stream.offset);
		    if (arg0 == 23820)
			break;
		    method1860(58, 67L, null, 84, -75, null, -38, -100);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("sk.E(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ',' + arg2 + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1862(int arg0) {
	try {
	    anIntArray4543 = null;
	    aStringArray4538 = null;
	    anIntArray4531 = null;
	    anIntArray4540 = null;
	    aClass214_4545 = null;
	    aClass214_4542 = null;
	    anIntArray4539 = null;
	    anIntArray4536 = null;
	    if (arg0 <= 88)
		aClass214_4542 = null;
	    anIntArray4530 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sk.C(" + arg0 + ')');
	}
    }
    
    public static void method1863(int arg0) {
	try {
	    anInt4533++;
	    if (arg0 != -7830)
		anInt4532 = 70;
	    for (int i = 0; ((Class131_Sub41_Sub2.anInt6186 ^ 0xffffffff)
			     < (i ^ 0xffffffff)); i++) {
		int i_0_ = Class131_Sub41_Sub12.anIntArray6316[i];
		Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		    = Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i_0_];
		if (class23_sub4_sub1_sub1 != null)
		    Class131_Sub41_Sub6.method1967((class23_sub4_sub1_sub1
						    .aClass66_6474.anInt839),
						   -104,
						   class23_sub4_sub1_sub1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sk.B(" + arg0 + ')');
	}
    }
    
    public static void method1864(byte arg0) {
	if (Class150.anInt2005 != -1) {
	    RuntimeException_Sub1.method2837(-1, false, -1, -69,
					     Class150.anInt2005);
	    Class150.anInt2005 = -1;
	}
	anInt4528++;
	if (arg0 >= -14)
	    anIntArray4536 = null;
    }
    
    public Class131_Sub31(int arg0, int arg1) {
	try {
	    anInt4534 = arg1;
	    anInt4529 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sk.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    static {
	anInt4535 = 50;
	anIntArray4540 = new int[anInt4535];
	anIntArray4536 = new int[anInt4535];
	anIntArray4530 = new int[anInt4535];
	aStringArray4538 = new String[anInt4535];
	anIntArray4539 = new int[anInt4535];
	anIntArray4531 = new int[anInt4535];
	anIntArray4543 = new int[anInt4535];
	aClass214_4542 = new Class214(4);
	aClass214_4545 = new Class214(5);
    }
}
