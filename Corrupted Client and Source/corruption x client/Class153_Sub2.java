/* Class153_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153_Sub2 extends Class153
{
    public static int anInt4768;
    public static int anInt4769;
    public static int anInt4770;
    public int anInt4771;
    public int anInt4772;
    public static int anInt4773;
    public static boolean aBoolean4774;
    public int anInt4775;
    public static int anInt4776;
    public static short[] aShortArray4777 = new short[256];
    public static int anInt4778;
    public static int anInt4779;
    public int anInt4780;
    public int anInt4781;
    public byte[] aByteArray4782;
    public int anInt4783;
    public int anInt4784;
    public static int[] anIntArray4785;
    public int anInt4786;
    
    public void method2230(int arg0, int arg1, int arg2) {
	try {
	    if ((arg2 ^ 0xffffffff) == -1) {
		anInt4781
		    = anInt4784 - ((arg0 ^ 0xffffffff) > -1 ? -arg0 : arg0);
		anInt4783 = 4096;
		anInt4781 = anInt4781 * anInt4781 >> -1916917204;
		anInt4780 = anInt4781;
	    } else {
		anInt4783 = anInt4772 * anInt4781 >> -2118255412;
		if ((anInt4783 ^ 0xffffffff) > -1)
		    anInt4783 = 0;
		else if (anInt4783 > 4096)
		    anInt4783 = 4096;
		anInt4781 = anInt4784 - (arg0 >= 0 ? arg0 : -arg0);
		anInt4781 = anInt4781 * anInt4781 >> 331056748;
		anInt4781 = anInt4781 * anInt4783 >> 405694732;
		anInt4780 += anInt4775 * anInt4781 >> -252099284;
		anInt4775 = anInt4775 * anInt4786 >> -1175218004;
	    }
	    anInt4768++;
	    int i = -19 % ((arg1 - 67) / 50);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rq.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method2223(byte arg0) {
	try {
	    anInt4771 = 0;
	    if (arg0 == 122) {
		anInt4778++;
		anInt4780 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rq.C(" + arg0 + ')');
	}
    }
    
    public static void method2237(byte arg0) {
	try {
	    synchronized (Login.aClass214_1757) {
		if (arg0 != -114)
		    return;
		Login.aClass214_1757.method2783(arg0 + 23);
	    }
	    anInt4776++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rq.L(" + arg0 + ')');
	}
    }
    
    public static void method2238(int arg0) {
	anIntArray4785 = null;
	aShortArray4777 = null;
	if (arg0 != -1)
	    aShortArray4777 = null;
    }
    
    public Class153_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			 float arg5, float arg6, float arg7) {
	super(arg0, arg1, arg2, arg3, arg4);
	try {
	    anInt4784 = (int) (arg6 * 4096.0F);
	    anInt4772 = (int) (4096.0F * arg7);
	    anInt4775 = anInt4786
		= (int) (4096.0 * Math.pow(0.5, (double) -arg5));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rq.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ','
						 + arg3 + ',' + arg4 + ','
						 + arg5 + ',' + arg6 + ','
						 + arg7 + ')'));
	}
    }
    
    public void method2231(boolean arg0) {
	try {
	    if (arg0 != false)
		anIntArray4785 = null;
	    anInt4780 >>= 4;
	    anInt4775 = anInt4786;
	    anInt4779++;
	    if (anInt4780 >= 0) {
		if ((anInt4780 ^ 0xffffffff) < -256)
		    anInt4780 = 255;
	    } else
		anInt4780 = 0;
	    method2239(anInt4771++, (byte) anInt4780);
	    anInt4780 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rq.E(" + arg0 + ')');
	}
    }
    
    public void method2239(int arg0, byte arg1) {
	try {
	    anInt4770++;
	    aByteArray4782[arg0] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rq.J(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2240(int arg0, String arg1) {
	anInt4769++;
	System.out.println("Error: " + Class131_Sub42.method2090(arg1, "%0a",
								 "\n",
								 arg0 + -4));
	if (arg0 != 4)
	    method2238(-13);
    }
    
    static {
	anInt4773 = 0;
	aBoolean4774 = false;
	anIntArray4785 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
    }
}
