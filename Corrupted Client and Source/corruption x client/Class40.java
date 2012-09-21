/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40
{
    public static int anInt517;
    public int[] anIntArray518;
    public static int anInt519;
    public static int anInt520;
    public static int[] anIntArray521 = new int[1000];
    public static int anInt522;
    public static int anInt523;
    public short[] aShortArray524;
    public static int anInt525;
    public int anInt526;
    public static int anInt527;
    public static int anInt528;
    public short[] aShortArray529;
    public short[] aShortArray530;
    public boolean aBoolean531 = false;
    public short[] aShortArray532;
    public static boolean aBoolean533 = true;
    public int[] anIntArray534;
    
    public void method504(Stream arg0, boolean arg1) {
	try {
	    for (;;) {
		int i = arg0.readUnsignedByte(-86);
		if (i == 0)
		    break;
		method510(i, arg0, -73);
	    }
	    if (arg1 != false)
		aBoolean533 = true;
	    anInt522++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dl.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method505(byte arg0) {
	try {
	    anInt517++;
	    if (anIntArray518 == null)
		return true;
	    boolean bool = true;
	    synchronized (Class89.aClass158_3261) {
		for (int i = 0; anIntArray518.length > i; i++) {
		    if (!Class89.aClass158_3261.method2354(0, anIntArray518[i],
							   123))
			bool = false;
		}
		if (arg0 > -114)
		    method511(40);
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dl.G(" + arg0 + ')');
	}
    }
    
    public Class116 method506(int arg0) {
	try {
	    anInt527++;
	    Class116[] class116s = new Class116[5];
	    int i = 0;
	    synchronized (Class89.aClass158_3261) {
		for (int i_0_ = 0; i_0_ < 5; i_0_++) {
		    if (anIntArray534[i_0_] != -1)
			class116s[i++]
			    = Class134.method2097(anIntArray534[i_0_], 0,
						  Class89.aClass158_3261, 1);
		}
		if (arg0 != -20658)
		    method508(57);
	    }
	    Class116 class116 = new Class116(class116s, i);
	    if (aShortArray532 != null) {
		for (int i_1_ = 0; i_1_ < aShortArray532.length; i_1_++)
		    class116.method992(aShortArray529[i_1_],
				       aShortArray532[i_1_], -126);
	    }
	    if (aShortArray524 != null) {
		for (int i_2_ = 0; aShortArray524.length > i_2_; i_2_++)
		    class116.method989(arg0 + 20536, aShortArray524[i_2_],
				       aShortArray530[i_2_]);
	    }
	    return class116;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dl.C(" + arg0 + ')');
	}
    }
    
    public boolean method507(boolean arg0) {
	try {
	    anInt528++;
	    boolean bool = arg0;
	    synchronized (Class89.aClass158_3261) {
		for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
		    if (anIntArray534[i] != -1
			&& !Class89.aClass158_3261
				.method2354(0, anIntArray534[i], 106))
			bool = false;
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dl.F(" + arg0 + ')');
	}
    }
    
    public Class116 method508(int arg0) {
	try {
	    anInt519++;
	    if (anIntArray518 == null)
		return null;
	    Class116[] class116s = new Class116[anIntArray518.length];
	    synchronized (Class89.aClass158_3261) {
		for (int i = 0; i < anIntArray518.length; i++)
		    class116s[i] = Class134.method2097(anIntArray518[i], 0,
						       Class89.aClass158_3261,
						       arg0 + 14649);
		if (arg0 != -14648)
		    aShortArray524 = null;
	    }
	    Class116 class116;
	    if ((class116s.length ^ 0xffffffff) != -2)
		class116 = new Class116(class116s, class116s.length);
	    else
		class116 = class116s[0];
	    if (class116 == null)
		return null;
	    if (aShortArray532 != null) {
		for (int i = 0;
		     (aShortArray532.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    class116.method992(aShortArray529[i], aShortArray532[i],
				       77);
	    }
	    if (aShortArray524 != null) {
		for (int i = 0; aShortArray524.length > i; i++)
		    class116.method989(-122, aShortArray524[i],
				       aShortArray530[i]);
	    }
	    return class116;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dl.A(" + arg0 + ')');
	}
    }
    
    public static void method509(int arg0, byte arg1) {
	try {
	    int i = -68 / ((arg1 - 59) / 43);
	    Class131_Sub2_Sub35.anInt6041 = 1000 / arg0;
	    anInt520++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dl.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method510(int arg0, Stream arg1, int arg2) {
	try {
	    anInt523++;
	    int i = 37 % ((arg2 - 1) / 59);
	    if ((arg0 ^ 0xffffffff) != -2) {
		if (arg0 != 2) {
		    if (arg0 == 3)
			aBoolean531 = true;
		    else if (arg0 != 40) {
			if ((arg0 ^ 0xffffffff) != -42) {
			    if (arg0 >= 60 && (arg0 ^ 0xffffffff) > -71)
				anIntArray534[-60 + arg0]
				    = arg1.readUnsignedShort(8104);
			} else {
			    int i_3_ = arg1.readUnsignedByte(117);
			    aShortArray530 = new short[i_3_];
			    aShortArray524 = new short[i_3_];
			    for (int i_4_ = 0;
				 (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
				 i_4_++) {
				aShortArray524[i_4_]
				    = (short) arg1.readUnsignedShort(8104);
				aShortArray530[i_4_]
				    = (short) arg1.readUnsignedShort(8104);
			    }
			}
		    } else {
			int i_5_ = arg1.readUnsignedByte(87);
			aShortArray529 = new short[i_5_];
			aShortArray532 = new short[i_5_];
			for (int i_6_ = 0;
			     (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
			     i_6_++) {
			    aShortArray532[i_6_]
				= (short) arg1.readUnsignedShort(8104);
			    aShortArray529[i_6_]
				= (short) arg1.readUnsignedShort(8104);
			}
		    }
		} else {
		    int i_7_ = arg1.readUnsignedByte(90);
		    anIntArray518 = new int[i_7_];
		    for (int i_8_ = 0;
			 (i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_8_++)
			anIntArray518[i_8_] = arg1.readUnsignedShort(8104);
		}
	    } else
		anInt526 = arg1.readUnsignedByte(-33);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dl.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method511(int arg0) {
	try {
	    if (arg0 != 0)
		method511(-99);
	    anIntArray521 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dl.H(" + arg0 + ')');
	}
    }
    
    public Class40() {
	anInt526 = -1;
	anIntArray534 = new int[] { -1, -1, -1, -1, -1 };
    }
}
