/* Class131_Sub2_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub19 extends Class131_Sub2
{
    public static String aString5823 = "cyan:";
    public static int anInt5824;
    public static int anInt5825;
    public static int anInt5826;
    public static boolean aBoolean5827 = true;
    public static int anInt5828;
    public static int anInt5829;
    public static int anInt5830;
    public static int anInt5831;
    public boolean aBoolean5832 = true;
    public int anInt5833 = 4096;
    
    public Class131_Sub2_Sub19() {
	super(1, false);
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		return null;
	    anInt5831++;
	    int[][] is = aClass59_4097.method641(arg0, arg1 + -2);
	    if (aClass59_4097.aBoolean783) {
		int[] is_0_ = this.method1459(0, (byte) -40,
					      Class79.anInt1060 & -1 + arg0);
		int[] is_1_ = this.method1459(0, (byte) -40, arg0);
		int[] is_2_ = this.method1459(0, (byte) -40,
					      1 + arg0 & Class79.anInt1060);
		int[] is_3_ = is[0];
		int[] is_4_ = is[1];
		int[] is_5_ = is[2];
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++) {
		    int i_6_ = anInt5833 * (-is_0_[i] + is_2_[i]);
		    int i_7_
			= (anInt5833
			   * (-is_1_[i - 1 & Class23_Sub4_Sub4.anInt5404]
			      + is_1_[Class23_Sub4_Sub4.anInt5404 & 1 + i]));
		    int i_8_ = i_7_ >> 174680140;
		    int i_9_ = i_6_ >> -985655188;
		    int i_10_ = i_8_ * i_8_ >> -471425108;
		    int i_11_ = i_9_ * i_9_ >> 332413164;
		    int i_12_
			= (int) (Math.sqrt((double) ((float) (4096 + (i_10_
								      + i_11_))
						     / 4096.0F))
				 * 4096.0);
		    int i_13_;
		    int i_14_;
		    int i_15_;
		    if (i_12_ != 0) {
			i_13_ = i_6_ / i_12_;
			i_15_ = 16777216 / i_12_;
			i_14_ = i_7_ / i_12_;
		    } else {
			i_13_ = 0;
			i_14_ = 0;
			i_15_ = 0;
		    }
		    if (aBoolean5832) {
			i_15_ = (i_15_ >> -1367346719) + 2048;
			i_14_ = 2048 - -(i_14_ >> -1664322399);
			i_13_ = 2048 + (i_13_ >> -322571135);
		    }
		    is_3_[i] = i_14_;
		    is_4_[i] = i_13_;
		    is_5_[i] = i_15_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jh.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1564(int arg0) {
	try {
	    anInt5825++;
	    if (Class23_Sub2.aBoolean3713) {
		Class23_Sub2.aBoolean3713 = false;
		Class131_Sub2_Sub3.aClass152_5589 = null;
		if (arg0 == 16777216)
		    Class82.aClass152_1088 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jh.G(" + arg0 + ')');
	}
    }
    
    public static void method1565(int arg0, byte arg1) {
	try {
	    anInt5830++;
	    synchronized (Class137.aClass214_1834) {
		Class137.aClass214_1834.method2786(0, arg0);
	    }
	    synchronized (Class131_Sub2_Sub10.aClass214_5693) {
		Class131_Sub2_Sub10.aClass214_5693.method2786(0, arg0);
		if (arg1 != 50)
		    anInt5826 = -17;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jh.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5824++;
	if (arg1 == -49) {
	    int i = arg0;
	    do {
		if (i != 0) {
		    if ((i ^ 0xffffffff) != -2)
			break;
		} else {
		    anInt5833 = arg2.readUnsignedShort(8104);
		    break;
		}
		aBoolean5832 = arg2.readUnsignedByte(-48) == 1;
	    } while (false);
	}
    }
    
    public static void method1566(int arg0) {
	aString5823 = null;
	if (arg0 > -32)
	    method1564(122);
    }
    
    public static void method1567
	(Class23_Sub4_Sub1 arg0, Class23_Sub4_Sub1 arg1, int arg2, int arg3,
	 int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
	try {
	    anInt5828++;
	    int i = arg1.method346((byte) 115);
	    if (i != -1) {
		Object object = null;
		Class152 class152
		    = ((Class152)
		       Class49.aClass214_651.method2780(118, (long) i));
		if (class152 == null) {
		    Class124[] class124s
			= Class124.method1084(Class128.aClass158_1746, i, 0);
		    if (class124s == null)
			return;
		    class152
			= Class183_Sub1.aClass130_4960.method1178(class124s[0],
								  true);
		    Class49.aClass214_651.method2773(true, class152, (long) i);
		}
		Class18.method230(arg5, 31496, arg9 >> 268305249,
				  arg0.anInt3747, arg0.anInt3733,
				  arg3 >> 1221195489,
				  64 * arg0.method335((byte) -107), 0, arg6);
		int i_16_ = arg2 + Class131_Sub2_Sub6.anIntArray5629[0] - arg7;
		i_16_ += 18 * (arg4 / 4);
		int i_17_
		    = -70 + (Class131_Sub2_Sub6.anIntArray5629[1] + arg8);
		i_17_ += arg4 % 4 * 18;
		class152.method2211(i_16_, i_17_);
		if (arg1 == arg0)
		    Class183_Sub1.aClass130_4960.method1262(18, -1 + i_16_, 18,
							    false, -1 + i_17_,
							    -256);
		Class1_Sub4 class1_sub4 = Class39.method501(106);
		class1_sub4.aClass23_Sub4_Sub1_3545 = arg1;
		class1_sub4.anInt3549 = 16 + i_17_;
		class1_sub4.anInt3555 = i_16_;
		class1_sub4.anInt3553 = i_16_ + 16;
		class1_sub4.anInt3552 = i_17_;
		Class18.aClass50_188.method584(class1_sub4, (byte) -121);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("jh.H(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ')'));
	}
    }
    
    public static String method1568(int arg0, String[] arg1, int arg2,
				    byte arg3) {
	try {
	    anInt5829++;
	    if ((arg2 ^ 0xffffffff) == -1)
		return "";
	    if (arg3 != 124)
		method1564(60);
	    if (arg2 == 1) {
		String string = arg1[arg0];
		if (string != null)
		    return string.toString();
		return "null";
	    }
	    int i = arg2 + arg0;
	    int i_18_ = 0;
	    for (int i_19_ = arg0; i > i_19_; i_19_++) {
		String string = arg1[i_19_];
		if (string == null)
		    i_18_ += 4;
		else
		    i_18_ += string.length();
	    }
	    StringBuffer stringbuffer = new StringBuffer(i_18_);
	    for (int i_20_ = arg0; (i_20_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_20_++) {
		String string = arg1[i_20_];
		if (string != null)
		    stringbuffer.append(string);
		else
		    stringbuffer.append("null");
	    }
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jh.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
}
