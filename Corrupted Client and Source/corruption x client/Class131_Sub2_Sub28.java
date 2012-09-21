/* Class131_Sub2_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub28 extends Class131_Sub2
{
    public static Class137 aClass137_5955;
    public static int anInt5956;
    public static String[] aStringArray5957;
    public static int anInt5958;
    public boolean aBoolean5959 = true;
    public static int anInt5960;
    public static boolean aBoolean5961 = false;
    public static int anInt5962;
    public boolean aBoolean5963 = true;
    public static Class158 aClass158_5964;
    public static int anInt5965;
    public static int anInt5966;
    public static int anInt5967;
    /*synthetic*/ public static Class aClass5968;
    
    public Class131_Sub2_Sub28() {
	super(1, false);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		return null;
	    anInt5960++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_0_
		    = this.method1463(0, (byte) 125,
				      (aBoolean5963 ? Class79.anInt1060 - arg0
				       : arg0));
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		if (aBoolean5959) {
		    for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
			is_4_[i] = is_1_[Class23_Sub4_Sub4.anInt5404 - i];
			is_5_[i] = is_2_[-i + Class23_Sub4_Sub4.anInt5404];
			is_6_[i] = is_3_[-i + Class23_Sub4_Sub4.anInt5404];
		    }
		} else {
		    for (int i = 0;
			 ((i ^ 0xffffffff)
			  > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			 i++) {
			is_4_[i] = is_1_[i];
			is_5_[i] = is_2_[i];
			is_6_[i] = is_3_[i];
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pl.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1606(int arg0, int arg1, int arg2, int arg3,
				  Class130 arg4, boolean arg5, int arg6,
				  int arg7, int arg8) {
	anInt5965++;
	if (arg5 != true)
	    method1606(-47, -7, -16, 98, null, false, -34, 57, 105);
	Interface6 interface6
	    = (Interface6) Class43.method521(arg3, arg7, arg6);
	if (interface6 != null) {
	    Class187 class187
		= Class55.method612(interface6.method23((byte) -120), -80);
	    int i = 0x3 & interface6.method24((byte) -68);
	    int i_7_ = interface6.method21(-22056);
	    if (class187.anInt2708 == -1) {
		int i_8_ = arg0;
		if (class187.anInt2663 > 0)
		    i_8_ = arg1;
		if ((i_7_ ^ 0xffffffff) == -1 || i_7_ == 2) {
		    if ((i ^ 0xffffffff) == -1)
			arg4.method1253(true, arg8, i_8_, arg2, 4);
		    else if (i != 1) {
			if ((i ^ 0xffffffff) != -3) {
			    if (i == 3)
				arg4.method1225(arg2, i_8_, (byte) -103, 4,
						arg8 - -3);
			} else
			    arg4.method1253(arg5, arg8, i_8_, arg2 - -3, 4);
		    } else
			arg4.method1225(arg2, i_8_, (byte) -106, 4, arg8);
		}
		if ((i_7_ ^ 0xffffffff) == -4) {
		    if (i != 0) {
			if (i != 1) {
			    if (i == 2)
				arg4.method1201(1, 1, arg2 - -3, arg8 + 3,
						i_8_, -122);
			    else if ((i ^ 0xffffffff) == -4)
				arg4.method1201(1, 1, arg2, arg8 - -3, i_8_,
						40);
			} else
			    arg4.method1201(1, 1, 3 + arg2, arg8, i_8_, 73);
		    } else
			arg4.method1201(1, 1, arg2, arg8, i_8_, -90);
		}
		if (i_7_ == 2) {
		    if (i == 0)
			arg4.method1225(arg2, i_8_, (byte) -94, 4, arg8);
		    else if (i != 1) {
			if (i == 2)
			    arg4.method1225(arg2, i_8_, (byte) -104, 4,
					    3 + arg8);
			else if ((i ^ 0xffffffff) == -4)
			    arg4.method1253(true, arg8, i_8_, arg2, 4);
		    } else
			arg4.method1253(arg5, arg8, i_8_, 3 + arg2, 4);
		}
	    } else
		Class2.method142(arg8, arg2, false, arg4, class187, i);
	}
	interface6
	    = (Interface6) Class63.method662(arg3, arg7, arg6,
					     (aClass5968 != null ? aClass5968
					      : (aClass5968
						 = method1611("Interface6"))));
	if (interface6 != null) {
	    Class187 class187
		= Class55.method612(interface6.method23((byte) -122), 113);
	    int i = interface6.method24((byte) -68) & 0x3;
	    int i_9_ = interface6.method21(-22056);
	    if ((class187.anInt2708 ^ 0xffffffff) != 0)
		Class2.method142(arg8, arg2, false, arg4, class187, i);
	    else if (i_9_ == 9) {
		int i_10_ = -1118482;
		if ((class187.anInt2663 ^ 0xffffffff) < -1)
		    i_10_ = -1179648;
		if (i == 0 || (i ^ 0xffffffff) == -3)
		    arg4.method1195(true, arg8, 3 + arg2, 3 + arg8, arg2,
				    i_10_);
		else
		    arg4.method1195(true, arg8 - -3, 3 + arg2, arg8, arg2,
				    i_10_);
	    }
	}
	interface6 = (Interface6) Class186.method2564(arg3, arg7, arg6);
	if (interface6 != null) {
	    Class187 class187
		= Class55.method612(interface6.method23((byte) -122), -60);
	    int i = interface6.method24((byte) -68) & 0x3;
	    if (class187.anInt2708 != -1)
		Class2.method142(arg8, arg2, !arg5, arg4, class187, i);
	}
    }
    
    public static void method1607(int arg0) {
	if (arg0 <= 107)
	    method1608(74);
	anInt5956++;
	if (Class183_Sub1.aClass130_4960 != null) {
	    Class134.aClass50_1807.method587(0);
	    Class213.method2771();
	    Class131_Sub2_Sub1.method1475((byte) 50);
	    Class23_Sub4_Sub2.method368((byte) -116);
	    Applet_Sub1.method46((byte) -125);
	    Class211.method2763(true);
	    if (Class98.aClass209_1307 != null)
		Class98.aClass209_1307.method2755(119);
	    Class192.method2623(-125);
	    Class131_Sub2_Sub10_Sub1.method1517(8110);
	    Class131_Sub2_Sub30.method1613(-32);
	    Class199.method2711(0, false);
	    Class131_Sub2_Sub19.method1564(16777216);
	    for (int i = 0; i < 2048; i++) {
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i];
		if (class23_sub4_sub1_sub2 != null) {
		    class23_sub4_sub1_sub2.anInterface6_5333 = null;
		    for (int i_11_ = 0;
			 (i_11_
			  < class23_sub4_sub1_sub2.aClass154Array5329.length);
			 i_11_++)
			class23_sub4_sub1_sub2.aClass154Array5329[i_11_]
			    = null;
		}
	    }
	    for (int i = 0;
		 ((Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379.length
		   ^ 0xffffffff)
		  < (i ^ 0xffffffff));
		 i++) {
		Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		    = Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i];
		if (class23_sub4_sub1_sub1 != null) {
		    for (int i_12_ = 0;
			 (class23_sub4_sub1_sub1.aClass154Array5329.length
			  > i_12_);
			 i_12_++)
			class23_sub4_sub1_sub1.aClass154Array5329[i_12_]
			    = null;
		}
	    }
	    Class183_Sub1.aClass130_4960.method1167(-31586);
	    Class183_Sub1.aClass130_4960 = null;
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5967++;
	int i = arg0;
    while_108_:
	do {
	    do {
		if ((i ^ 0xffffffff) != -1) {
		    if ((i ^ 0xffffffff) != -2) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_108_;
		    }
		} else {
		    aBoolean5959 = arg2.readUnsignedByte(108) == 1;
		    break while_108_;
		}
		aBoolean5963 = (arg2.readUnsignedByte(97) ^ 0xffffffff) == -2;
		break while_108_;
	    } while (false);
	    aBoolean4093 = arg2.readUnsignedByte(-24) == 1;
	} while (false);
	if (arg1 != -49)
	    aClass137_5955 = null;
    }
    
    public static void method1608(int arg0) {
	try {
	    if (arg0 < 43)
		aBoolean5961 = false;
	    aClass158_5964 = null;
	    aStringArray5957 = null;
	    aClass137_5955 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pl.D(" + arg0 + ')');
	}
    }
    
    public static Class107 method1609(int arg0, byte arg1) {
	try {
	    if (arg1 >= -75)
		aBoolean5961 = true;
	    anInt5966++;
	    Class107 class107
		= ((Class107)
		   Class127_Sub1.aClass214_4007.method2780(127, (long) arg0));
	    if (class107 != null)
		return class107;
	    byte[] is = Class98.aClass158_1296.method2364(arg0, 1, 0);
	    class107 = new Class107();
	    class107.anInt1383 = arg0;
	    if (is != null)
		class107.method925(-1, new Stream(is));
	    class107.method922(8);
	    if ((class107.anInt1398 ^ 0xffffffff) == -3
		&& (Class87.aClass180_1142.method2521(-45, (long) arg0)
		    == null)) {
		Class87.aClass180_1142.method2523
		    (false, (long) arg0,
		     new Class131_Sub24(Class121_Sub3.anInt3999));
		Class166.aClass107Array2219[Class121_Sub3.anInt3999++]
		    = class107;
	    }
	    Class127_Sub1.aClass214_4007.method2773(true, class107,
						    (long) arg0);
	    return class107;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pl.H(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5962++;
	    if (arg0 != -11543)
		method1455(-32, (byte) -2, null);
	    int[] is = aClass200_4087.method2714(arg1, (byte) -117);
	    if (aClass200_4087.aBoolean2927) {
		int[] is_13_
		    = this.method1459(0, (byte) -40,
				      (aBoolean5963 ? -arg1 + Class79.anInt1060
				       : arg1));
		if (aBoolean5959) {
		    for (int i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++)
			is[i] = is_13_[Class23_Sub4_Sub4.anInt5404 - i];
		} else
		    Class61.method657(is_13_, 0, is, 0,
				      Class131_Sub2_Sub7.anInt5637);
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pl.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static boolean method1610(char arg0, byte arg1) {
	try {
	    int i = 28 % ((arg1 - -67) / 47);
	    anInt5958++;
	    if (arg0 != 160 && arg0 != 32 && arg0 != 95
		&& (arg0 ^ 0xffffffff) != -46)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pl.G(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method1611(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aStringArray5957 = new String[100];
	aClass137_5955 = new Class137(64);
    }
}
