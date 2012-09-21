/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60
{
    public static boolean aBoolean786 = false;
    public static Class158 aClass158_787;
    public static byte[][] aByteArrayArray788;
    public static int[] anIntArray789 = new int[128];
    public static int anInt790;
    public static int anInt791;
    
    public static void method648(byte arg0, int arg1, int arg2, Class173 arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (Class23_Sub2_Sub2.aBoolean5191)
	    Class98.anInt1304 = 32;
	else
	    Class98.anInt1304 = 0;
	anInt791++;
	Class23_Sub2_Sub2.aBoolean5191 = false;
	if (arg0 != -92)
	    anIntArray789 = null;
	if (Class147.anInt1949 != 0) {
	    if ((arg2 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
		&& (arg5 - -16 ^ 0xffffffff) < (arg2 ^ 0xffffffff)
		&& arg7 >= arg1
		&& (arg7 ^ 0xffffffff) > (arg1 + 16 ^ 0xffffffff)) {
		arg3.anInt2415 -= 4;
		Class23_Sub4_Sub4.method383(-99, arg3);
	    } else if (arg5 > arg2 || arg5 - -16 <= arg2
		       || arg7 < -16 + arg4 + arg1
		       || (arg7 ^ 0xffffffff) <= (arg1 - -arg4 ^ 0xffffffff)) {
		if (arg2 >= arg5 - Class98.anInt1304
		    && (arg2 ^ 0xffffffff) > (16 + (arg5 - -Class98.anInt1304)
					      ^ 0xffffffff)
		    && (arg1 - -16 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
		    && (arg7 ^ 0xffffffff) > (arg1 + (arg4 + -16)
					      ^ 0xffffffff)) {
		    int i = (-32 + arg4) * arg4 / arg6;
		    if ((i ^ 0xffffffff) > -9)
			i = 8;
		    int i_0_ = -(i / 2) + arg7 - arg1 + -16;
		    int i_1_ = -i + arg4 + -32;
		    arg3.anInt2415 = i_0_ * (-arg4 + arg6) / i_1_;
		    Class23_Sub4_Sub4.method383(-109, arg3);
		    Class23_Sub2_Sub2.aBoolean5191 = true;
		}
	    } else {
		arg3.anInt2415 += 4;
		Class23_Sub4_Sub4.method383(-76, arg3);
	    }
	}
	if (Class1_Sub2.anInt3511 != 0) {
	    int i = arg3.anInt2411;
	    if ((arg2 ^ 0xffffffff) <= (arg5 + -i ^ 0xffffffff)
		&& (arg7 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) > (16 + arg5 ^ 0xffffffff)
		&& arg1 + arg4 >= arg7) {
		arg3.anInt2415 += 45 * Class1_Sub2.anInt3511;
		Class23_Sub4_Sub4.method383(-82, arg3);
	    }
	}
    }
    
    public static void method649(byte arg0) {
	try {
	    anIntArray789 = null;
	    int i = 122 / ((arg0 - -67) / 33);
	    aByteArrayArray788 = null;
	    aClass158_787 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gb.C(" + arg0 + ')');
	}
    }
    
    public static void method650(int arg0, Class173 arg1, int arg2,
				 byte arg3) {
	try {
	    Class77.aClass173_1044 = arg1;
	    Class219.anInt3205 = arg2;
	    Class88.anInt1169 = arg0;
	    if (arg3 < 4)
		method648((byte) -109, -92, -74, null, 28, -104, -30, -34);
	    anInt790++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gb.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
}
