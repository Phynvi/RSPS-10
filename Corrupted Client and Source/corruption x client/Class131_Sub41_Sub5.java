/* Class131_Sub41_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub5 extends Class131_Sub41
{
    public static int anInt6219;
    public static int anInt6220;
    public static int anInt6221;
    public static int anInt6222 = 0;
    public static int anInt6223;
    public static boolean aBoolean6224 = false;
    public static int anInt6225;
    public static Class214 aClass214_6226 = new Class214(50);
    public static int anInt6227;
    public static int anInt6228;
    public byte[] aByteArray6229;
    public static int anInt6230;
    public static int[] anIntArray6231 = new int[100];
    public static String aString6232 = "glow2:";
    public static short[][] aShortArrayArray6233;
    
    public static int method1950(int arg0, int arg1, int arg2) {
	try {
	    anInt6228++;
	    if (arg1 == 1 || arg1 == 3)
		return Class6.anIntArray98[arg0 & 0x3];
	    int i = 16 % ((arg2 - 82) / 38);
	    return Class131_Sub2_Sub10.anIntArray5704[arg0 & 0x3];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gr.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1951(int arg0) {
	try {
	    anInt6225++;
	    if (arg0 == -3403) {
		synchronized (Class131_Sub41_Sub18.aClass214_6398) {
		    Class131_Sub41_Sub18.aClass214_6398.method2775((byte) 56);
		}
		synchronized (Class131_Sub2_Sub14.aClass214_5749) {
		    Class131_Sub2_Sub14.aClass214_5749.method2775((byte) 56);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gr.H(" + arg0 + ')');
	}
    }
    
    public static void method1952(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt6227++;
	    if (arg2 != 1)
		aClass214_6226 = null;
	    if ((arg4 ^ 0xffffffff) == (arg5 ^ 0xffffffff))
		Class19.method245(arg1, arg6, arg0, arg3, (byte) -94, arg5,
				  arg7);
	    else if ((arg6 + -arg5 ^ 0xffffffff) <= (Class149.anInt1988
						     ^ 0xffffffff)
		     && arg6 + arg5 <= Class115.anInt1477
		     && Class116.anInt1494 <= -arg4 + arg3
		     && (arg3 - -arg4 ^ 0xffffffff) >= (Class125.anInt1629
							^ 0xffffffff))
		Class213.method2770(arg0, arg1, arg6, arg7, arg4, arg3, arg5,
				    (byte) 31);
	    else
		Class131_Sub2_Sub17.method1558(arg7, arg1, arg0, (byte) 96,
					       arg3, arg6, arg5, arg4);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gr.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static void method1953(int arg0) {
	try {
	    aString6232 = null;
	    aShortArrayArray6233 = null;
	    if (arg0 < 81)
		method1958(94, (byte) -69);
	    aClass214_6226 = null;
	    anIntArray6231 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gr.G(" + arg0 + ')');
	}
    }
    
    public static void method1954(boolean arg0, int arg1) {
	anInt6220++;
	synchronized (Class56.aClass214_731) {
	    Class56.aClass214_731.method2786(0, arg1);
	}
	synchronized (Login.aClass214_1757) {
	    Login.aClass214_1757.method2786(0, arg1);
	}
	synchronized (Class131_Sub31.aClass214_4545) {
	    Class131_Sub31.aClass214_4545.method2786(0, arg1);
	}
	if (arg0 != false)
	    method1953(-126);
    }
    
    public static void method1955(byte arg0, Class158 arg1, Class158 arg2) {
	do {
	    try {
		anInt6221++;
		Class154.aClass158_2058 = arg2;
		Class23_Sub3_Sub1.aClass158_5234 = arg1;
		if (arg0 > 109)
		    break;
		anIntArray6231 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("gr.C(" + arg0 + ','
						     + (arg1 != null ? "{...}"
							: "null")
						     + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1956(Class131_Sub41_Sub13 arg0, int arg1,
				  int arg2, int arg3, boolean[] arg4) {
	if (Class75.aClass68Array1023 != Class85.aClass68Array1116) {
	    int i
		= Class131_Sub2_Sub37.aClass68Array6057[arg1].method720(arg2,
									arg3);
	    for (int i_0_ = 0; i_0_ <= arg1; i_0_++) {
		if (arg4 == null || arg4[i_0_]) {
		    Class68 class68
			= Class131_Sub2_Sub37.aClass68Array6057[i_0_];
		    if (class68 != null)
			class68.method721(arg0, arg2,
					  i - class68.method720(arg2, arg3),
					  arg3, 0, false);
		}
	    }
	}
    }
    
    public static void method1957(boolean arg0, int arg1, String arg2,
				  Class44 arg3) {
	do {
	    try {
		anInt6219++;
		int i = 4;
		int i_1_ = i + 6;
		int i_2_ = i + 6;
		if (arg1 == -29854) {
		    int i_3_ = Class131_Sub24.aClass55_4469
				   .method617((byte) -75, 250, arg2, null);
		    int i_4_ = 13 * Class131_Sub24.aClass55_4469
					.method616(-123, arg2, 250, null);
		    Class183_Sub1.aClass130_4960.method1173(-i + i_1_,
							    i_2_ + -i,
							    i + (i + i_3_),
							    i + (i_4_ + i),
							    -16777216, 0);
		    Class183_Sub1.aClass130_4960.method1168(-i + i_1_,
							    i_2_ + -i,
							    i + (i_3_ + i),
							    i + i_4_ + i, -1,
							    0);
		    arg3.method533(null, null, 0, 1, i_2_, -1, 0, -1, i_4_, 0,
				   arg1 ^ ~0x2d7d, arg2, null, i_1_, i_3_, 1);
		    Class12.method213(-i + i_1_, i + (i_4_ - -i), -i + i_2_,
				      i + (i + i_3_), -113);
		    if (!arg0)
			break;
		    Class183_Sub1.aClass130_4960.method1166();
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("gr.F(" + arg0 + ','
						     + arg1 + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class131_Sub41_Sub5(byte[] arg0) {
	try {
	    aByteArray6229 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gr.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class72 method1958(int arg0, byte arg1) {
	try {
	    anInt6223++;
	    Class72 class72;
	    synchronized (Class131_Sub14.aClass214_4278) {
		class72 = (Class72) Class131_Sub14.aClass214_4278
					.method2780(119, (long) arg0);
	    }
	    int i = 17 % ((57 - arg1) / 56);
	    if (class72 != null)
		return class72;
	    byte[] is = Class1_Sub7.aClass158_3589.method2364(arg0, 32, 0);
	    class72 = new Class72();
	    if (is != null)
		class72.method752(124, new Stream(is));
	    class72.method751(0);
	    synchronized (Class131_Sub14.aClass214_4278) {
		Class131_Sub14.aClass214_4278.method2773(true, class72,
							 (long) arg0);
	    }
	    return class72;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gr.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
