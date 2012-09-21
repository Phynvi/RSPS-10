/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class4 implements Interface4
{
    public static int anInt3281;
    public static int[] anIntArray3282;
    public Class137 aClass137_3283 = new Class137(256);
    public static int anInt3284;
    public static int anInt3285;
    public Class158 aClass158_3286;
    public static int anInt3287;
    public static int anInt3288;
    public static int anInt3289;
    public Class158 aClass158_3290;
    public static String[] aStringArray3291 = new String[8];
    public static int anInt3292;
    public Class42[] aClass42Array3293;
    public static int anInt3294;
    public static int anInt3295;
    public static int anInt3296;
    public static int anInt3297;
    public static int anInt3298;
    
    public boolean method11(boolean arg0, int arg1) {
	try {
	    anInt3298++;
	    Class131_Sub41_Sub19 class131_sub41_sub19 = method158(322, arg1);
	    if (arg0 != false)
		aClass158_3286 = null;
	    if (class131_sub41_sub19 == null
		|| !class131_sub41_sub19.method2061(126, this, aClass158_3286))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[] method14(float arg0, int arg1, int arg2, int arg3,
			  boolean arg4, boolean arg5) {
	try {
	    anInt3285++;
	    if (arg4 != false)
		anInt3281 = 53;
	    return method158(322, arg2).method2063(arg4, arg1, (double) arg0,
						   arg3, aClass158_3286, this,
						   (aClass42Array3293[arg2]
						    .aBoolean572),
						   arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public int[] method12(int arg0, int arg1, boolean arg2, int arg3,
			  float arg4, int arg5) {
	try {
	    if (arg3 != -11047)
		return null;
	    anInt3294++;
	    return method158(322, arg1).method2057(arg0, this,
						   (aClass42Array3293[arg1]
						    .aBoolean572),
						   (double) arg4, arg5,
						   aClass158_3286, (byte) -37);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method154(boolean arg0) {
	try {
	    anInt3292++;
	    if (arg0 == false)
		Class23_Sub4_Sub4.aClass214_5403.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ae.F(" + arg0 + ')');
	}
    }
    
    public Class42 method10(int arg0, int arg1) {
	try {
	    if (arg0 != -19907)
		return null;
	    anInt3289++;
	    return aClass42Array3293[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method155(int arg0, byte arg1, Class44 arg2,
				 boolean arg3, int arg4, Class130 arg5,
				 int arg6) {
	try {
	    anInt3296++;
	    if (arg3) {
		Class82.aClass152_1088.method2211((Class131_Sub1_Sub1.anInt5499
						   - Class82.aClass152_1088
							 .method2216()) / 2,
						  (Class218.anInt3201
						   + -Class82
							  .aClass152_1088
							  .method2198()) / 2);
		Class131_Sub2_Sub3.aClass152_5589.method2211
		    ((Class131_Sub1_Sub1.anInt5499
		      + -Class131_Sub2_Sub3.aClass152_5589.method2216()) / 2,
		     18);
	    }
	    arg2.method528((byte) 106, -1,
			   ((Class126.anInt1696 ^ 0xffffffff) == -2
			    ? Class19.aString225 : Class184.aString2624),
			   arg0, Class131_Sub1_Sub1.anInt5499 / 2,
			   Class218.anInt3201 / 2 - 26);
	    int i = Class218.anInt3201 / 2 - 18;
	    arg5.method1168(-152 + Class131_Sub1_Sub1.anInt5499 / 2, i, 304,
			    34, arg6, 0);
	    arg5.method1168(Class131_Sub1_Sub1.anInt5499 / 2 + -151, i - -1,
			    302, 32, 0, 0);
	    arg5.method1173(Class131_Sub1_Sub1.anInt5499 / 2 + -150, 2 + i,
			    Class131_Sub3.anInt4116 * 3, 30, arg4, 0);
	    int i_0_ = 126 % ((63 - arg1) / 59);
	    arg5.method1173((Class131_Sub1_Sub1.anInt5499 / 2 + -150
			     - -(3 * Class131_Sub3.anInt4116)),
			    2 + i, 300 + -(Class131_Sub3.anInt4116 * 3), 30, 0,
			    0);
	    arg2.method528((byte) 110, -1, Class131_Sub14.aString4291, arg0,
			   Class131_Sub1_Sub1.anInt5499 / 2,
			   4 + Class218.anInt3201 / 2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.E(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method156(Class130 arg0, int arg1) {
	try {
	    if (arg1 >= -52)
		method155(44, (byte) -14, null, true, 81, null, 9);
	    anInt3297++;
	    if ((Class14.aClass119_153.method1010(-115) ^ 0xffffffff) != -1) {
		if (Stream.anInt4299 != 0
		    && (Stream.anInt4299 ^ 0xffffffff) != -3) {
		    if (Class19.aClass130_223 == null) {
			Canvas canvas = new Canvas();
			canvas.setSize(36, 32);
			Class19.aClass130_223
			    = Class130.method1157(0, -9426,
						  Class23_Sub4.aSignLink_3734,
						  canvas, 0,
						  (Class131_Sub2_Sub8
						   .anInterface4_5660));
			Class53.aClass44_707
			    = (Class19.aClass130_223.method1224
			       ((Class131_Sub41_Sub16.method2037
				 (Class157.aClass158_2076, (byte) -35, 0,
				  Class131_Sub2_Sub32.anInt6014)),
				Class124.method1084(Class128.aClass158_1746,
						    (Class131_Sub2_Sub32
						     .anInt6014),
						    0),
				true));
		    }
		    for (Class131_Sub23 class131_sub23
			     = ((Class131_Sub23)
				Class14.aClass119_153.method1007(0));
			 class131_sub23 != null;
			 class131_sub23
			     = ((Class131_Sub23)
				Class14.aClass119_153.method1014(0))) {
			Class153_Sub1.method2233
			    (class131_sub23.anInt4459, arg0, 0,
			     Class53.aClass44_707, class131_sub23.anInt4455,
			     false, false, class131_sub23.anInt4454,
			     class131_sub23.anInt4457,
			     (class131_sub23.aBoolean4452
			      ? (Class166.aClass23_Sub4_Sub1_Sub2_2216
				 .aClass188_6513)
			      : null),
			     class131_sub23.anInt4461, Class19.aClass130_223);
			class131_sub23.method1355((byte) 122);
		    }
		} else {
		    for (Class131_Sub23 class131_sub23
			     = ((Class131_Sub23)
				Class14.aClass119_153.method1007(0));
			 class131_sub23 != null;
			 class131_sub23
			     = ((Class131_Sub23)
				Class14.aClass119_153.method1014(0))) {
			Class153_Sub1.method2233
			    (class131_sub23.anInt4459, arg0, 0,
			     Class204.aClass44_2982, class131_sub23.anInt4455,
			     false, false, class131_sub23.anInt4454,
			     class131_sub23.anInt4457,
			     (!class131_sub23.aBoolean4452 ? null
			      : (Class166.aClass23_Sub4_Sub1_Sub2_2216
				 .aClass188_6513)),
			     class131_sub23.anInt4461, arg0);
			class131_sub23.method1355((byte) 118);
		    }
		    Class131_Sub2_Sub16.method1548((byte) -125);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public float[] method13(int arg0, byte arg1, boolean arg2, float arg3,
			    int arg4, int arg5) {
	try {
	    if (arg1 != -88)
		method155(-118, (byte) -66, null, false, -57, null, 119);
	    anInt3287++;
	    return (method158(arg1 ^ ~0x115, arg4).method2059
		    (aClass158_3286, arg5, arg1 ^ ~0x2f, this, arg0,
		     aClass42Array3293[arg4].aBoolean572));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public static void method157(int arg0) {
	aStringArray3291 = null;
	anIntArray3282 = null;
	if (arg0 != -151)
	    aStringArray3291 = null;
    }
    
    public Class131_Sub41_Sub19 method158(int arg0, int arg1) {
	try {
	    anInt3284++;
	    Class131_Sub41 class131_sub41
		= aClass137_3283.method2111(-12, (long) arg1);
	    if (class131_sub41 != null)
		return (Class131_Sub41_Sub19) class131_sub41;
	    if (arg0 != 322)
		aClass42Array3293 = null;
	    byte[] is = aClass158_3290.method2358(arg1, 70);
	    if (is == null)
		return null;
	    Class131_Sub41_Sub19 class131_sub41_sub19
		= new Class131_Sub41_Sub19(new Stream(is));
	    aClass137_3283.method2110(class131_sub41_sub19, false,
				      (long) arg1);
	    return class131_sub41_sub19;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ae.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class4(Class158 arg0, Class158 arg1, Class158 arg2) {
	try {
	    aClass158_3290 = arg1;
	    aClass158_3286 = arg2;
	    Stream stream
		= new Stream(arg0.method2364(0, 0, 0));
	    int i = stream.readUnsignedShort(8104);
	    aClass42Array3293 = new Class42[i];
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_1_++) {
		if (stream.readUnsignedByte(-119) == 1)
		    aClass42Array3293[i_1_] = new Class42();
	    }
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_2_++) {
		if (aClass42Array3293[i_2_] != null)
		    aClass42Array3293[i_2_].aBoolean556
			= stream.readUnsignedByte(56) == 0;
	    }
	    for (int i_3_ = 0; i > i_3_; i_3_++) {
		if (aClass42Array3293[i_3_] != null)
		    aClass42Array3293[i_3_].aBoolean557
			= stream.readUnsignedByte(77) == 1;
	    }
	    for (int i_4_ = 0; i > i_4_; i_4_++) {
		if (aClass42Array3293[i_4_] != null)
		    aClass42Array3293[i_4_].aBoolean564
			= stream.readUnsignedByte(90) == 1;
	    }
	    for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
		 i_5_++) {
		if (aClass42Array3293[i_5_] != null)
		    aClass42Array3293[i_5_].aBoolean569
			= (stream.readUnsignedByte(123) ^ 0xffffffff) == -2;
	    }
	    for (int i_6_ = 0; i_6_ < i; i_6_++) {
		if (aClass42Array3293[i_6_] != null)
		    aClass42Array3293[i_6_].aByte577
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_7_ = 0; i > i_7_; i_7_++) {
		if (aClass42Array3293[i_7_] != null)
		    aClass42Array3293[i_7_].aByte570
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_8_++) {
		if (aClass42Array3293[i_8_] != null)
		    aClass42Array3293[i_8_].aByte576
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_9_++) {
		if (aClass42Array3293[i_9_] != null)
		    aClass42Array3293[i_9_].aByte562
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_10_ = 0; (i ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		 i_10_++) {
		if (aClass42Array3293[i_10_] != null)
		    aClass42Array3293[i_10_].aShort578
			= (short) stream.readUnsignedShort(8104);
	    }
	    for (int i_11_ = 0; i_11_ < i; i_11_++) {
		if (aClass42Array3293[i_11_] != null)
		    aClass42Array3293[i_11_].aByte565
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_12_ = 0; (i ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
		 i_12_++) {
		if (aClass42Array3293[i_12_] != null)
		    aClass42Array3293[i_12_].aByte559
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_13_ = 0; i > i_13_; i_13_++) {
		if (aClass42Array3293[i_13_] != null)
		    aClass42Array3293[i_13_].aBoolean558
			= (stream.readUnsignedByte(110) ^ 0xffffffff) == -2;
	    }
	    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_14_++) {
		if (aClass42Array3293[i_14_] != null)
		    aClass42Array3293[i_14_].aBoolean572
			= (stream.readUnsignedByte(-44) ^ 0xffffffff) == -2;
	    }
	    for (int i_15_ = 0; i > i_15_; i_15_++) {
		if (aClass42Array3293[i_15_] != null)
		    aClass42Array3293[i_15_].aByte561
			= stream.readSignedByte((byte) 127);
	    }
	    for (int i_16_ = 0; (i ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
		 i_16_++) {
		if (aClass42Array3293[i_16_] != null)
		    aClass42Array3293[i_16_].aBoolean560
			= stream.readUnsignedByte(72) == 1;
	    }
	    for (int i_17_ = 0; i > i_17_; i_17_++) {
		if (aClass42Array3293[i_17_] != null)
		    aClass42Array3293[i_17_].aBoolean568
			= (stream.readUnsignedByte(-87) ^ 0xffffffff) == -2;
	    }
	    for (int i_18_ = 0; i > i_18_; i_18_++) {
		if (aClass42Array3293[i_18_] != null)
		    aClass42Array3293[i_18_].aBoolean575
			= (stream.readUnsignedByte(121) ^ 0xffffffff) == -2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ae.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ')'));
	}
    }
    
    static {
	anInt3281 = -2;
	anInt3295 = 0;
	anIntArray3282 = new int[4096];
	for (int i = 0; i < 4096; i++)
	    anIntArray3282[i] = Class131_Sub17.method1800(6, i);
    }
}
