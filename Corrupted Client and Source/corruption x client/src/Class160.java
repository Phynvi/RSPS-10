/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160
{
    public static int anInt2127;
    public static String aString2128;
    public static int anInt2129 = 0;
    public static String aString2130;
    public static int anInt2131;
    public static short[] aShortArray2132 = new short[256];
    public static Class158 aClass158_2133;
    public static int anInt2134;
    
    public static void method2381(boolean arg0) {
	aString2130 = null;
	aShortArray2132 = null;
	aClass158_2133 = null;
	aString2128 = null;
	if (arg0 != false)
	    aClass158_2133 = null;
    }
    
    public static void method2382(Class130 arg0) {
	for (int i = Class51.anInt675; i < Class133.anInt1805; i++) {
	    for (int i_0_ = 0; i_0_ < Class210.anInt3068; i_0_++) {
		for (int i_1_ = 0; i_1_ < Class131_Sub8_Sub1.anInt6099;
		     i_1_++) {
		    Class147 class147
			= (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i]
			   [i_0_][i_1_]);
		    if (class147 != null) {
			Class23_Sub1 class23_sub1
			    = class147.aClass23_Sub1_1966;
			Class23_Sub1 class23_sub1_2_
			    = class147.aClass23_Sub1_1969;
			if (class23_sub1 != null
			    && class23_sub1.method289((byte) -115)) {
			    Class21.method261(arg0, class23_sub1, i, i_0_,
					      i_1_, 1, 1);
			    if (class23_sub1_2_ != null
				&& class23_sub1_2_.method289((byte) -115)) {
				Class21.method261(arg0, class23_sub1_2_, i,
						  i_0_, i_1_, 1, 1);
				class23_sub1_2_.method293((byte) -128, arg0, 0,
							  0, false,
							  class23_sub1, 0);
				class23_sub1_2_.method295(0);
			    }
			    class23_sub1.method295(0);
			}
			for (Class82 class82 = class147.aClass82_1958;
			     class82 != null;
			     class82 = class82.aClass82_1086) {
			    Class23_Sub4 class23_sub4
				= class82.aClass23_Sub4_1080;
			    if (class23_sub4 != null
				&& class23_sub4.method289((byte) -115)) {
				Class21.method261(arg0, class23_sub4, i, i_0_,
						  i_1_,
						  (class23_sub4.aShort3742
						   - class23_sub4.aShort3745
						   + 1),
						  (class23_sub4.aShort3735
						   - class23_sub4.aShort3737
						   + 1));
				class23_sub4.method295(0);
			    }
			}
			Class23_Sub5 class23_sub5
			    = class147.aClass23_Sub5_1973;
			if (class23_sub5 != null
			    && class23_sub5.method289((byte) -115)) {
			    InputStream_Sub1.method85(arg0, class23_sub5, i,
						      i_0_, i_1_);
			    class23_sub5.method295(0);
			}
		    }
		}
	    }
	}
    }
    
    public static void method2383(boolean arg0, int arg1, int arg2) {
	try {
	    if (arg0 != false)
		method2381(true);
	    anInt2127++;
	    Class131_Sub41_Sub11_Sub1.anInt6543++;
	    Class93.aClass131_Sub15_Sub2_1226.createPacket(147);
	    Class93.aClass131_Sub15_Sub2_1226.writeLEShort(arg2, (byte) -115);
	    Class93.aClass131_Sub15_Sub2_1226.writeInt1((byte) -8, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qo.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2384(int arg0, boolean arg1) {
	try {
	    anInt2134++;
	    if (arg0 == 3037 && arg1 == !Class35.aBoolean494) {
		Class35.aBoolean494 = arg1;
		Class78.method778((byte) 110);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qo.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aString2130 = "shake:";
    }
}
