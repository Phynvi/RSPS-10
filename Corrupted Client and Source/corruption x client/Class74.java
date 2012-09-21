/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class74
{
    public static int anInt999;
    public static int anInt1000;
    public static int anInt1001;
    public static int anInt1002;
    public static int[] anIntArray1003;
    public static Class140 aClass140_1004;
    public static int anInt1005;
    public static int anInt1006;
    public Class180 aClass180_1007 = new Class180(256);
    public Class158 aClass158_1008;
    public static int anInt1009;
    public Class158 aClass158_1010;
    public static Class119 aClass119_1011;
    public static int anInt1012;
    public static int anInt1013;
    public static Frame aFrame1014;
    public static int anInt1015;
    public Class180 aClass180_1016 = new Class180(256);
    
    public Class131_Sub12_Sub1 method753(int arg0, int arg1, int[] arg2,
					 int arg3) {
	try {
	    anInt1006++;
	    int i
		= arg1 ^ (0xfff2 & arg0 << 1212771492 | arg0 >>> -1322078772);
	    i |= arg0 << -80826288;
	    long l = (long) i ^ 0x100000000L;
	    Class131_Sub12_Sub1 class131_sub12_sub1
		= (Class131_Sub12_Sub1) aClass180_1016.method2521(-48, l);
	    if (class131_sub12_sub1 != null)
		return class131_sub12_sub1;
	    if (arg2 != null && arg2[0] <= 0)
		return null;
	    Class131_Sub39 class131_sub39
		= (Class131_Sub39) aClass180_1007.method2521(arg3 + -355, l);
	    if (arg3 != 256)
		anInt999 = 7;
	    if (class131_sub39 == null) {
		class131_sub39
		    = Class131_Sub39.method1899(aClass158_1008, arg0, arg1);
		if (class131_sub39 == null)
		    return null;
		aClass180_1007.method2523(false, l, class131_sub39);
	    }
	    class131_sub12_sub1 = class131_sub39.method1900(arg2);
	    if (class131_sub12_sub1 == null)
		return null;
	    class131_sub39.method1355((byte) 125);
	    aClass180_1016.method2523(false, l, class131_sub12_sub1);
	    return class131_sub12_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.D(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method754(byte arg0) {
	try {
	    if (arg0 >= 0)
		method754((byte) 29);
	    anIntArray1003 = null;
	    aFrame1014 = null;
	    aClass119_1011 = null;
	    aClass140_1004 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hj.H(" + arg0 + ')');
	}
    }
    
    public Class131_Sub12_Sub1 method755(int arg0, int[] arg1, int arg2,
					 int arg3) {
	try {
	    anInt1012++;
	    int i = arg2 ^ (arg3 >>> 590139724 | (0xfff & arg3) << -851649788);
	    i |= arg3 << 1987529936;
	    long l = (long) i;
	    if (arg0 != 18334)
		method755(101, null, 87, -55);
	    Class131_Sub12_Sub1 class131_sub12_sub1
		= (Class131_Sub12_Sub1) aClass180_1016.method2521(-63, l);
	    if (class131_sub12_sub1 != null)
		return class131_sub12_sub1;
	    if (arg1 != null && arg1[0] <= 0)
		return null;
	    Class16 class16 = Class16.method226(aClass158_1010, arg3, arg2);
	    if (class16 == null)
		return null;
	    class131_sub12_sub1 = class16.method225();
	    aClass180_1016.method2523(false, l, class131_sub12_sub1);
	    if (arg1 != null)
		arg1[0] -= class131_sub12_sub1.aByteArray6113.length;
	    return class131_sub12_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static int method756(int arg0, byte arg1, int arg2) {
	try {
	    int i = -1 / ((arg1 - -47) / 59);
	    anInt1015++;
	    int i_0_
		= (-128
		   + (Class23_Sub4_Sub1_Sub2.method360(arg0 + 91923, (byte) -7,
						       45365 + arg2, 4)
		      - -((-128
			   + Class23_Sub4_Sub1_Sub2.method360(arg0 - -37821,
							      (byte) -7,
							      10294 + arg2, 2))
			  >> 2147344513)
		      + (-128 + Class23_Sub4_Sub1_Sub2
				    .method360(arg0, (byte) -7, arg2, 1)
			 >> 118874242)));
	    i_0_ = (int) ((double) i_0_ * 0.3) - -35;
	    if (i_0_ < 10)
		i_0_ = 10;
	    else if ((i_0_ ^ 0xffffffff) < -61)
		i_0_ = 60;
	    return i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub12_Sub1 method757(int arg0, int arg1, int[] arg2) {
	try {
	    anInt1001++;
	    if ((aClass158_1008.method2361((byte) -125) ^ 0xffffffff) == -2)
		return method753(0, arg0, arg2, 256);
	    if (arg1 >= -85)
		anInt999 = 7;
	    if (aClass158_1008.method2368(arg0, (byte) -72) == 1)
		return method753(arg0, 0, arg2, 256);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.A(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method758(int arg0) {
	try {
	    anInt1002++;
	    if (!Class81.aBoolean1075) {
		Class209.aBoolean3053 = true;
		if (!Class131_Sub6.aBoolean4143)
		    Class131_Sub18.aFloat4378
			+= (24.0F - Class131_Sub18.aFloat4378) / 2.0F;
		else
		    Class120.aFloat1578
			= (float) (~0x7f & 191 + (int) Class120.aFloat1578);
		Class81.aBoolean1075 = true;
		int i = -102 % ((arg0 - -1) / 59);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hj.E(" + arg0 + ')');
	}
    }
    
    public static void method759(int arg0) {
	try {
	    anInt1005++;
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(170);
	    Class1_Sub8.anInt3595++;
	    Class93.aClass131_Sub15_Sub2_1226
		.writeByte(Class131_Sub18.method1806(-70));
	    if (arg0 >= -95)
		anInt1009 = -61;
	    Class93.aClass131_Sub15_Sub2_1226
		.writeShort(Class131_Sub1_Sub1.anInt5499);
	    Class93.aClass131_Sub15_Sub2_1226.writeShort(Class218.anInt3201);
	    Class93.aClass131_Sub15_Sub2_1226
		.writeByte(Class131_Sub41_Sub21.anInt6442);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hj.G(" + arg0 + ')');
	}
    }
    
    public Class131_Sub12_Sub1 method760(byte arg0, int[] arg1, int arg2) {
	try {
	    if (arg0 <= 55)
		aClass158_1010 = null;
	    anInt1000++;
	    if (aClass158_1010.method2361((byte) -8) == 1)
		return method755(18334, arg1, arg2, 0);
	    if (aClass158_1010.method2368(arg2, (byte) -72) == 1)
		return method755(18334, arg1, 0, arg2);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class74(Class158 arg0, Class158 arg1) {
	try {
	    aClass158_1008 = arg1;
	    aClass158_1010 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hj.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
