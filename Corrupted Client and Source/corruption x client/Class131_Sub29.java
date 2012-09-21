/* Class131_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub29 extends Class131
{
    public String aString4502;
    public static int anInt4503;
    public static Class158 aClass158_4504;
    public static int anInt4505;
    public static int anInt4506 = 0;
    public static int anInt4507;
    public static int anInt4508;
    public static int anInt4509;
    public static int[] anIntArray4510;
    public static int anInt4511 = 0;
    public static int anInt4512;
    public static int anInt4513;
    public static int anInt4514 = 0;
    
    public static void method1848(int arg0) {
	try {
	    aClass158_4504 = null;
	    if (arg0 != 0)
		method1849(95, 95, 81);
	    anIntArray4510 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rf.C(" + arg0 + ')');
	}
    }
    
    public static void method1849(int arg0, int arg1, int arg2) {
	try {
	    anInt4507++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(12, arg0, (byte) 1);
	    class131_sub41_sub6.method1962(0);
	    if (arg2 <= 37)
		method1848(44);
	    class131_sub41_sub6.anInt6244 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rf.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1850(int arg0, int arg1) {
	try {
	    anInt4508++;
	    Class220.aClass214_3212.method2786(0, arg1);
	    Class131_Sub2.aClass214_4098.method2786(arg0 ^ arg0, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rf.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1851(Stream arg0, int arg1, int arg2) {
	if (Class131_Sub14.aClass163_4286 != null) {
	    try {
		Class131_Sub14.aClass163_4286.method2398(arg2 + -20164, 0L);
		Class131_Sub14.aClass163_4286.method2405(arg0.data,
							 24, arg1, 79);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	anInt4512++;
	if (arg2 != 20164)
	    anInt4506 = 77;
    }
    
    public Class131_Sub29() {
	/* empty */
    }
    
    public Class131_Sub29(String arg0) {
	try {
	    aString4502 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rf.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static Class39[] method1852(SignLink arg0, int arg1) {
	try {
	    anInt4503++;
	    if (!arg0.method2709(1774773648))
		return new Class39[0];
	    Class139 class139 = arg0.method2707(14);
	    while ((class139.anInt1864 ^ 0xffffffff) == -1)
		Class187.method2575(-50, 10L);
	    if (class139.anInt1864 == 2)
		return new Class39[0];
	    int[] is = (int[]) class139.anObject1866;
	    Class39[] class39s = new Class39[is.length >> 1064811362];
	    for (int i = 0; (class39s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class39 class39 = new Class39();
		class39s[i] = class39;
		class39.anInt510 = is[i << 2040895170];
		class39.anInt513 = is[(i << 1311157154) - -1];
		class39.anInt515 = is[(i << 1849163554) - -2];
		class39.anInt511 = is[3 + (i << -1297359262)];
	    }
	    if (arg1 != -31353)
		anIntArray4510 = null;
	    return class39s;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rf.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
}
