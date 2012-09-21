/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172
{
    public static Class119 aClass119_2289 = new Class119();
    public static Class180 aClass180_2290 = new Class180(512);
    public static int anInt2291;
    public static int anInt2292;
    public static int anInt2293;
    public static String aString2294 = "Loaded client variable data";
    public static long aLong2295 = 0L;
    
    public static void method2450(int arg0) {
	if (Class23_Sub1_Sub1.aFloat5082 < 1024.0F)
	    Class23_Sub1_Sub1.aFloat5082 = 1024.0F;
	anInt2292++;
	if (Class23_Sub1_Sub1.aFloat5082 > 3072.0F)
	    Class23_Sub1_Sub1.aFloat5082 = 3072.0F;
	for (/**/; Class120.aFloat1578 >= 16384.0F;
	     Class120.aFloat1578 -= 16384.0F) {
	    /* empty */
	}
	for (/**/; Class120.aFloat1578 < 0.0F;
	     Class120.aFloat1578 += 16384.0F) {
	    /* empty */
	}
	int i = Class131_Sub41_Sub9.anInt6275 >> 360752295;
	if (arg0 != -4)
	    anInt2293 = -33;
	int i_0_ = Class131_Sub3.anInt4126 >> -1859247257;
	int i_1_
	    = RuntimeException_Sub1.method2833(Class131_Sub3.anInt4126, -72,
					       Class131_Sub41_Sub9.anInt6275,
					       Class29.anInt300);
	int i_2_ = 0;
	if (i > 3 && i_0_ > 3 && i < 100 && (i_0_ ^ 0xffffffff) > -101) {
	    for (int i_3_ = i - 4;
		 (i_3_ ^ 0xffffffff) >= (i - -4 ^ 0xffffffff); i_3_++) {
		for (int i_4_ = -4 + i_0_; i_0_ + 4 >= i_4_; i_4_++) {
		    int i_5_ = Class29.anInt300;
		    if ((i_5_ ^ 0xffffffff) > -4
			&& Class91.method843(i_4_, (byte) 72, i_3_))
			i_5_++;
		    int i_6_ = 0;
		    if (Class29.aByteArrayArrayArray362 != null
			&& Class29.aByteArrayArrayArray362[i_5_] != null)
			i_6_ = (0xff & (Class29.aByteArrayArrayArray362[i_5_]
					[i_3_][i_4_])) * 8;
		    int i_7_ = i_6_ - Class75.aClass68Array1023[i_5_]
					  .method712(i_3_, i_4_) + i_1_;
		    if (i_2_ < i_7_)
			i_2_ = i_7_;
		}
	    }
	}
	int i_8_ = 1536 * i_2_;
	if (i_8_ > 786432)
	    i_8_ = 786432;
	if (i_8_ < 262144)
	    i_8_ = 262144;
	if ((i_8_ ^ 0xffffffff) < (Class64.anInt811 ^ 0xffffffff))
	    Class64.anInt811 += (-Class64.anInt811 + i_8_) / 24;
	else if ((Class64.anInt811 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
	    Class64.anInt811 += (i_8_ + -Class64.anInt811) / 80;
    }
    
    public static Class158 method2451(int arg0, int arg1, int arg2,
				      boolean arg3, boolean arg4) {
	try {
	    anInt2291++;
	    if (arg0 >= -74)
		method2451(1, -70, -95, false, true);
	    Class85 class85 = null;
	    if (PacketStream.aClass163_6136 != null)
		class85
		    = new Class85(arg1, PacketStream.aClass163_6136,
				  Class164.aClass163Array2188[arg1], 1000000);
	    Class167.aClass22_Sub1Array2227[arg1]
		= Class131_Sub2_Sub6.aClass176_5618.method2489((byte) 85, arg1,
							       (Class45
								.aClass85_621),
							       class85);
	    if (arg3)
		Class167.aClass22_Sub1Array2227[arg1].method276((byte) 123);
	    return new Class158(Class167.aClass22_Sub1Array2227[arg1], arg4,
				arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rn.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2452(byte arg0) {
	try {
	    aClass119_2289 = null;
	    aString2294 = null;
	    if (arg0 <= 6)
		aClass180_2290 = null;
	    aClass180_2290 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rn.A(" + arg0 + ')');
	}
    }
}
