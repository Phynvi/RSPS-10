/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82
{
    public Class23_Sub4 aClass23_Sub4_1080;
    public int anInt1081;
    public static int anInt1082;
    public static int anInt1083;
    public static int anInt1084;
    public static int anInt1085 = 2;
    public Class82 aClass82_1086;
    public static Class214 aClass214_1087 = new Class214(8);
    public static Class152 aClass152_1088;
    public static int anInt1089;
    public static int anInt1090;
    public static Class158 aClass158_1091;
    public static Class147[][][] aClass147ArrayArrayArray1092;
    
    public void method793(int arg0) {
	try {
	    anInt1090++;
	    if (Class52.anInt689 < 500) {
		anInt1081 = arg0;
		aClass82_1086 = Class131_Sub6.aClass82_4160;
		aClass23_Sub4_1080 = null;
		Class52.anInt689++;
		Class131_Sub6.aClass82_4160 = this;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"is.F(" + arg0 + ')');
	}
    }
    
    public static void method794(int arg0) {
	try {
	    aClass152_1088 = null;
	    if (arg0 != 1)
		method798(-33, 5);
	    aClass158_1091 = null;
	    aClass214_1087 = null;
	    aClass147ArrayArrayArray1092 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"is.D(" + arg0 + ')');
	}
    }
    
    public static void method795(Class23_Sub4_Sub1_Sub2 arg0, int[] arg1,
				 boolean arg2, int[] arg3, int[] arg4) {
	try {
	    if (arg2 != false)
		aClass152_1088 = null;
	    for (int i = 0; i < arg1.length; i++) {
		int i_0_ = arg1[i];
		int i_1_ = arg3[i];
		int i_2_ = arg4[i];
		for (int i_3_ = 0;
		     i_1_ != 0 && arg0.aClass141Array5313.length > i_3_;
		     i_1_ >>>= 1) {
		    if ((0x1 & i_1_ ^ 0xffffffff) != -1) {
			if (i_0_ == -1)
			    arg0.aClass141Array5313[i_3_] = null;
			else {
			    Class161 class161
				= Class145.method2159(i_0_, (byte) -111);
			    int i_4_ = class161.anInt2155;
			    Class141 class141 = arg0.aClass141Array5313[i_3_];
			    if (class141 != null) {
				if ((class141.anInt1881 ^ 0xffffffff)
				    == (i_0_ ^ 0xffffffff)) {
				    if ((i_4_ ^ 0xffffffff) != -1) {
					if ((i_4_ ^ 0xffffffff) != -2) {
					    if ((i_4_ ^ 0xffffffff) == -3)
						class141.anInt1877 = 0;
					} else {
					    class141.anInt1880 = i_2_;
					    class141.anInt1884 = 0;
					    class141.anInt1877 = 0;
					    class141.anInt1878 = 1;
					    class141.anInt1879 = 0;
					    Login.method1153
						(arg0.anInt3733, 21155,
						 (arg0
						  == (Class166
						      .aClass23_Sub4_Sub1_Sub2_2216)),
						 0, arg0.anInt3747, class161);
					}
				    } else
					class141
					    = arg0.aClass141Array5313[i_3_]
					    = null;
				} else if (class161.anInt2142
					   >= (Class145.method2159
					       (class141.anInt1881,
						(byte) -109)
					       .anInt2142))
				    class141
					= arg0.aClass141Array5313[i_3_] = null;
			    }
			    if (class141 == null) {
				class141 = arg0.aClass141Array5313[i_3_]
				    = new Class141();
				class141.anInt1880 = i_2_;
				class141.anInt1884 = 0;
				class141.anInt1879 = 0;
				class141.anInt1881 = i_0_;
				class141.anInt1878 = 1;
				class141.anInt1877 = 0;
				Login.method1153
				    (arg0.anInt3733, 21155,
				     arg0 == (Class166
					      .aClass23_Sub4_Sub1_Sub2_2216),
				     0, arg0.anInt3747, class161);
			    }
			}
		    }
		    i_3_++;
		}
	    }
	    anInt1084++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("is.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static int method796(Class158 arg0, byte arg1, Class158 arg2) {
	try {
	    if (arg1 > -6)
		return -93;
	    anInt1082++;
	    int i = 0;
	    if (arg2.method2343(-124, Class131_Sub2_Sub32.anInt6014))
		i++;
	    if (arg2.method2343(-114, Class128.anInt1743))
		i++;
	    if (arg2.method2343(-115, PacketParser.anInt5872))
		i++;
	    if (arg0.method2343(-121, Class131_Sub2_Sub32.anInt6014))
		i++;
	    if (arg0.method2343(-128, Class128.anInt1743))
		i++;
	    if (arg0.method2343(-111, PacketParser.anInt5872))
		i++;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("is.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method797(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if (arg0 < Class149.anInt1988 || Class115.anInt1477 < arg4
	    || arg1 < Class116.anInt1494 || arg5 > Class125.anInt1629)
	    Class125.method1100(arg0, arg2, arg4, arg5, arg1, (byte) -128);
	else
	    Class9.method191(arg5, arg0, arg4, arg2, 12, arg1);
	anInt1089++;
	if (arg3 != 1)
	    aClass158_1091 = null;
    }
    
    public static int method798(int arg0, int arg1) {
	try {
	    anInt1083++;
	    int i = 0;
	    if ((arg1 ^ 0xffffffff) > -1 || (arg1 ^ 0xffffffff) <= -65537) {
		arg1 >>>= 16;
		i += 16;
	    }
	    if ((arg1 ^ 0xffffffff) <= -257) {
		arg1 >>>= 8;
		i += 8;
	    }
	    if ((arg1 ^ 0xffffffff) <= -17) {
		arg1 >>>= 4;
		i += 4;
	    }
	    if (arg1 >= 4) {
		arg1 >>>= 2;
		i += 2;
	    }
	    if (arg1 >= arg0) {
		i++;
		arg1 >>>= 1;
	    }
	    return arg1 + i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("is.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
