/* Class131_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class131_Sub13 extends Class131
{
    public int[] anIntArray4257 = { -1 };
    public static int anInt4258;
    public static SignLink aSignLink_4259;
    public static int anInt4260;
    public static int anInt4261;
    public static int anInt4262;
    public static Class173 aClass173_4263;
    public static int[] anIntArray4264 = new int[100];
    public static int anInt4265;
    public static int anInt4266;
    public int[] anIntArray4267 = new int[1];
    public static boolean aBoolean4268 = true;
    public static int anInt4269;
    public static Class158 aClass158_4270;
    public static int anInt4271;
    public static int anInt4272;

    public static Class110_Sub2 method1701(int arg0, Stream arg1) {
	try {
	    anInt4262++;
	    if (arg0 != -1)
		anIntArray4264 = null;
	    return new Class110_Sub2(arg1.readSignedShort(arg0 ^ ~0x60e40000),
				     arg1.readSignedShort(1625554944),
				     arg1.readSignedShort(arg0 ^ ~0x60e40000),
				     arg1.readSignedShort(1625554944),
				     arg1.read3Bytes(false),
				     arg1.readUnsignedByte(-64));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ia.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class154 method1702(Class130 arg0, int arg1, Class161 arg2,
			       int arg3, boolean arg4, int arg5, int arg6,
			       boolean arg7, Class188 arg8, int arg9) {
	try {
	    anInt4266++;
	    Class154 class154 = null;
	    int i = arg6;
	    Class72 class72 = null;
	    if ((arg3 ^ 0xffffffff) != 0)
		class72 = Class131_Sub41_Sub5.method1958(arg3, (byte) -127);
	    int[] is = anIntArray4257;
	    if (class72 != null && class72.anIntArray971 != null) {
		is = new int[class72.anIntArray971.length];
		for (int i_0_ = 0; class72.anIntArray971.length > i_0_;
		     i_0_++) {
		    int i_1_ = class72.anIntArray971[i_0_];
		    if ((i_1_ ^ 0xffffffff) <= -1
			&& anIntArray4257.length > i_1_)
			is[i_0_] = anIntArray4257[i_1_];
		    else
			is[i_0_] = -1;
		}
	    }
	    boolean bool = arg7;
	    boolean bool_2_ = false;
	    boolean bool_3_ = false;
	    int i_4_ = -1;
	    int i_5_ = -1;
	    int i_6_ = 0;
	    Class131_Sub41_Sub10 class131_sub41_sub10 = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_7_ = null;
	    if (arg2 != null) {
		i_4_ = arg2.anIntArray2139[arg1];
		i |= 0x20;
		int i_8_ = i_4_ >>> -2117511696;
		class131_sub41_sub10 = Class34.method462((byte) -119, i_8_);
		i_4_ &= 0xffff;
		if (class131_sub41_sub10 != null) {
		    bool_2_ |= class131_sub41_sub10.method1992(65280, i_4_);
		    bool |= class131_sub41_sub10.method1995((byte) 0, i_4_);
		    bool_3_ |= arg2.aBoolean2141;
		}
		if ((arg2.aBoolean2159 || Class119.aBoolean1559)
		    && (arg5 ^ 0xffffffff) != 0
		    && arg5 < arg2.anIntArray2139.length) {
		    i_6_ = arg2.anIntArray2153[arg1];
		    i_5_ = arg2.anIntArray2139[arg5];
		    int i_9_ = i_5_ >>> 1989045904;
		    i_5_ &= 0xffff;
		    if (i_8_ != i_9_)
			class131_sub41_sub10_7_
			    = Class34.method462((byte) -119,
						i_5_ >>> -1625781808);
		    else
			class131_sub41_sub10_7_ = class131_sub41_sub10;
		    if (class131_sub41_sub10_7_ != null) {
			bool_2_
			    |= class131_sub41_sub10_7_.method1992(65280, i_5_);
			bool |= class131_sub41_sub10_7_.method1995((byte) 0,
								   i_5_);
		    }
		}
		if (bool_2_)
		    i |= 0x80;
		if (bool)
		    i |= 0x100;
		if (bool_3_)
		    i |= 0x200;
	    }
	    long l = method1705(arg8 != null ? arg8.anIntArray2756 : null,
				arg4, arg3, is, 19367);
	    if (RuntimeException_Sub1.aClass214_3238 != null)
		class154 = (Class154) RuntimeException_Sub1.aClass214_3238
					  .method2780(127, l);
	    if (class154 == null
		|| arg0.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg0.method1203(i, class154.method2253());
		int i_10_ = i;
		boolean bool_11_ = false;
		for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		    if (is[i_12_] != -1
			&& !Class131_Sub19.method1808(is[i_12_], false)
				.method415(!arg7, arg4))
			bool_11_ = true;
		}
		if (bool_11_)
		    return null;
		Class116[] class116s = new Class116[is.length];
		for (int i_13_ = 0;
		     (is.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
		     i_13_++) {
		    if (is[i_13_] != -1)
			class116s[i_13_]
			    = Class131_Sub19.method1808(is[i_13_], false)
				  .method417(true, arg4);
		}
		if (class72 != null && class72.anIntArrayArray979 != null) {
		    for (int i_14_ = 0;
			 i_14_ < class72.anIntArrayArray979.length; i_14_++) {
			if (class72.anIntArrayArray979[i_14_] != null
			    && class116s[i_14_] != null) {
			    int i_15_ = class72.anIntArrayArray979[i_14_][0];
			    int i_16_ = class72.anIntArrayArray979[i_14_][1];
			    int i_17_ = class72.anIntArrayArray979[i_14_][2];
			    int i_18_ = class72.anIntArrayArray979[i_14_][3];
			    int i_19_ = class72.anIntArrayArray979[i_14_][4];
			    int i_20_ = class72.anIntArrayArray979[i_14_][5];
			    if (i_18_ != 0 || (i_19_ ^ 0xffffffff) != -1
				|| i_20_ != 0)
				class116s[i_14_].method994(i_20_, i_19_, false,
							   i_18_);
			    if (i_15_ != 0 || i_16_ != 0
				|| (i_17_ ^ 0xffffffff) != -1)
				class116s[i_14_].method993(i_15_, i_17_, 124,
							   i_16_);
			}
		    }
		}
		Class116 class116 = new Class116(class116s, class116s.length);
		if (arg8 != null)
		    i_10_ |= 0x2000;
		class154
		    = arg0.method1218(class116, i_10_,
				      Class131_Sub41_Sub1.anInt6175, 64, 850);
		if (arg8 != null) {
		    for (int i_21_ = 0; i_21_ < 5; i_21_++) {
			if (((Class131_Sub41_Sub5.aShortArrayArray6233
			      [i_21_]).length
			     ^ 0xffffffff)
			    < (arg8.anIntArray2756[i_21_] ^ 0xffffffff))
			    class154.method2260(Class5.aShortArray89[i_21_],
						(Class131_Sub41_Sub5
						 .aShortArrayArray6233[i_21_]
						 [(arg8.anIntArray2756
						   [i_21_])]));
			if ((arg8.anIntArray2756[i_21_] ^ 0xffffffff)
			    > (Class63.aShortArrayArray800[i_21_].length
			       ^ 0xffffffff))
			    class154.method2260((Class144.aShortArray1916
						 [i_21_]),
						(Class63.aShortArrayArray800
						 [i_21_]
						 [(arg8.anIntArray2756
						   [i_21_])]));
		    }
		}
		if (RuntimeException_Sub1.aClass214_3238 != null) {
		    class154.method2248(i);
		    RuntimeException_Sub1.aClass214_3238
			.method2773(true, class154, l);
		}
	    }
	    if (arg2 == null || class131_sub41_sub10 == null)
		return class154;
	    Class154 class154_22_ = class154.method2287((byte) 1, i, true);
	    class154_22_.method2270(i_5_, 0, i_6_, 0, arg9 - 1,
				    class131_sub41_sub10_7_, arg2.aBoolean2141,
				    class131_sub41_sub10, i_4_);
	    return class154_22_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ia.D(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + (arg8 != null ? "{...}" : "null") + ','
			+ arg9 + ')'));
	}
    }
    
    public static int method1703(byte arg0, int arg1, int arg2) {
	try {
	    if (arg0 != 21)
		return 23;
	    anInt4265++;
	    int i = arg2 >> 1799541119 & -1 + arg1;
	    return ((arg2 >>> 1503847199) + arg2) % arg1 + i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ia.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1704(byte arg0) {
	try {
	    anInt4271++;
	    synchronized (Class173.aClass214_2425) {
		Class173.aClass214_2425.method2775((byte) 56);
	    }
	    synchronized (Class153.aClass214_2040) {
		Class153.aClass214_2040.method2775((byte) 56);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		Class131_Sub2_Sub30.aClass214_5988.method2775((byte) 56);
	    }
	    if (arg0 != 117)
		aBoolean4268 = true;
	    synchronized (Class192.aClass214_2824) {
		Class192.aClass214_2824.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ia.F(" + arg0 + ')');
	}
    }
    
    public long method1705(int[] arg0, boolean arg1, int arg2, int[] arg3,
			   int arg4) {
	try {
	    anInt4272++;
	    long[] ls = Class23_Sub5.aLongArray3760;
	    long l = -1L;
	    l = (ls[(int) (((long) (arg2 >> -1236543128) ^ l) & 0xffL)]
		 ^ l >>> -68060984);
	    l = l >>> 655676616 ^ ls[(int) (0xffL & (l ^ (long) arg2))];
	    if (arg4 != 19367)
		method1707(-125);
	    for (int i = 0; (i ^ 0xffffffff) > (arg3.length ^ 0xffffffff);
		 i++) {
		l = l >>> 1528043336 ^ ls[(int) ((l ^ (long) (arg3[i]
							      >> -719172264))
						 & 0xffL)];
		l = l >>> 1965060232 ^ ls[(int) ((l ^ (long) (arg3[i]
							      >> 411793360))
						 & 0xffL)];
		l = (ls[(int) (0xffL & (l ^ (long) (arg3[i] >> 381130088)))]
		     ^ l >>> 305421384);
		l = l >>> 1464046152 ^ ls[(int) ((l ^ (long) arg3[i])
						 & 0xffL)];
	    }
	    if (arg0 != null) {
		for (int i = 0; i < 5; i++)
		    l = (ls[(int) (((long) arg0[i] ^ l) & 0xffL)]
			 ^ l >>> -1886624568);
	    }
	    l = l >>> -1801478840 ^ ls[(int) ((l ^ (long) (arg1 ? 1 : 0))
					      & 0xffL)];
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ia.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1706(byte arg0) {
	try {
	    synchronized (Class56.aClass214_731) {
		Class56.aClass214_731.method2775((byte) 56);
	    }
	    anInt4261++;
	    synchronized (Login.aClass214_1757) {
		Login.aClass214_1757.method2775((byte) 56);
	    }
	    if (arg0 != 124)
		method1709(87, 30, (byte) -41);
	    synchronized (Class131_Sub31.aClass214_4545) {
		Class131_Sub31.aClass214_4545.method2775((byte) 56);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ia.J(" + arg0 + ')');
	}
    }
    
    public static void method1707(int arg0) {
	anInt4269++;
	if (Class131_Sub31.anInt4532 < 0) {
	    Class131_Sub31.anInt4532 = 0;
	    Class189.anInt2768 = -1;
	    Class146.anInt1940 = -1;
	}
	if ((Class131_Sub31.anInt4532 ^ 0xffffffff)
	    < (Class127.anInt1716 ^ 0xffffffff)) {
	    Class146.anInt1940 = -1;
	    Class189.anInt2768 = -1;
	    Class131_Sub31.anInt4532 = Class127.anInt1716;
	}
	if (arg0 < 123)
	    method1704((byte) -17);
	if (Class197.anInt2875 < 0) {
	    Class197.anInt2875 = 0;
	    Class189.anInt2768 = -1;
	    Class146.anInt1940 = -1;
	}
	if (Class127.anInt1730 < Class197.anInt2875) {
	    Class189.anInt2768 = -1;
	    Class197.anInt2875 = Class127.anInt1730;
	    Class146.anInt1940 = -1;
	}
    }
    
    public static void method1708(int arg0) {
	try {
	    aClass158_4270 = null;
	    aSignLink_4259 = null;
	    aClass173_4263 = null;
	    if (arg0 != -11003)
		anIntArray4264 = null;
	    anIntArray4264 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ia.G(" + arg0 + ')');
	}
    }
    
    public static Class131_Sub41_Sub6 method1709(int arg0, int arg1,
						 byte arg2) {
	try {
	    if (arg2 != 1)
		method1710(69, null, null, false);
	    anInt4260++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= ((Class131_Sub41_Sub6)
		   Class20.aClass180_231.method2521(-78,
						    ((long) arg0 << -470360416
						     | (long) arg1)));
	    if (class131_sub41_sub6 == null) {
		class131_sub41_sub6 = new Class131_Sub41_Sub6(arg0, arg1);
		Class20.aClass180_231.method2523(false,
						 class131_sub41_sub6.aLong1791,
						 class131_sub41_sub6);
	    }
	    return class131_sub41_sub6;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ia.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class130 method1710(int arg0, Canvas arg1, Interface4 arg2,
				      boolean arg3) {
	try {
	    anInt4258++;
	    if (arg3 != false)
		method1703((byte) 126, -92, 43);
	    return new Class130_Sub1(arg1, arg2, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ia.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
}
