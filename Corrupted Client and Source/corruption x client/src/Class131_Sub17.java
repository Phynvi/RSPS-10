/* Class131_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub17 extends Class131
{
    public static int anInt4366;
    public int[] anIntArray4367;
    public int anInt4368;
    public int[][] anIntArrayArray4369;
    public static int anInt4370 = 0;
    public static int anInt4371;
    public boolean[] aBooleanArray4372;
    public int anInt4373;
    public static int anInt4374;
    public int[] anIntArray4375;
    public static Class158 aClass158_4376;
    public static int anInt4377;
    
    public static int method1800(int arg0, int arg1) {
	try {
	    anInt4366++;
	    int i = (arg1 * arg1 >> -1636941588) * arg1 >> -386779092;
	    int i_0_ = -61440 + arg1 * arg0;
	    int i_1_ = (i_0_ * arg1 >> -223099092) + 40960;
	    return i_1_ * i >> 3748108;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jp.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1801(int arg0, int arg1, boolean arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    if (arg2 == false) {
		for (Class1_Sub8 class1_sub8
			 = ((Class1_Sub8)
			    Class34.aClass50_491.method586((byte) 42));
		     class1_sub8 != null;
		     class1_sub8
			 = (Class1_Sub8) Class34.aClass50_491.method589(57)) {
		    if ((class1_sub8.anInt3596 ^ 0xffffffff)
			>= (Class125.anInt1632 ^ 0xffffffff))
			class1_sub8.method95((byte) 71);
		    else {
			Class131_Sub2_Sub12.method1527
			    ((class1_sub8.anInt3601 << 300418759) - -64,
			     arg5 >> 1586457793, arg6 >> 1350248705,
			     class1_sub8.anInt3599 * 2, 0, arg1,
			     (class1_sub8.anInt3598 << -1214684313) - -64,
			     arg0);
			Class93.aClass44_1222.method528
			    ((byte) 89, 0, class1_sub8.aString3593,
			     class1_sub8.anInt3594 | ~0xffffff,
			     Class131_Sub2_Sub6.anIntArray5629[0] + arg3,
			     arg4 - -Class131_Sub2_Sub6.anIntArray5629[1]);
		    }
		}
		anInt4374++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jp.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method1802(int arg0) {
	try {
	    if (arg0 == 0)
		aClass158_4376 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jp.C(" + arg0 + ')');
	}
    }
    
    public Class131_Sub17(int arg0, byte[] arg1) {
	try {
	    anInt4373 = arg0;
	    Stream stream = new Stream(arg1);
	    anInt4368 = stream.readUnsignedByte(73);
	    anIntArray4367 = new int[anInt4368];
	    anIntArrayArray4369 = new int[anInt4368][];
	    aBooleanArray4372 = new boolean[anInt4368];
	    anIntArray4375 = new int[anInt4368];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4368 ^ 0xffffffff); i++)
		anIntArray4375[i] = stream.readUnsignedByte(-26);
	    for (int i = 0; anInt4368 > i; i++)
		aBooleanArray4372[i]
		    = (stream.readUnsignedByte(97) ^ 0xffffffff) == -2;
	    for (int i = 0; (anInt4368 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		anIntArray4367[i] = stream.readUnsignedShort(8104);
	    for (int i = 0; anInt4368 > i; i++)
		anIntArrayArray4369[i]
		    = new int[stream.readUnsignedByte(-126)];
	    for (int i = 0; i < anInt4368; i++) {
		for (int i_2_ = 0;
		     ((i_2_ ^ 0xffffffff)
		      > (anIntArrayArray4369[i].length ^ 0xffffffff));
		     i_2_++)
		    anIntArrayArray4369[i][i_2_]
			= stream.readUnsignedByte(-60);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jp.<init>(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
