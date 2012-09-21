/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class165
{
    public static int anInt2195;
    public static String aString2196 = "Hidden";
    public static int anInt2197;
    public static int anInt2198 = 0;
    public static int anInt2199;
    public static int anInt2200;
    public static boolean aBoolean2201 = false;
    public static int anInt2202;
    public static int anInt2203;
    
    public static void method2411(boolean arg0) {
	try {
	    if (arg0 == false)
		aString2196 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rb.A(" + arg0 + ')');
	}
    }
    
    public static int method2412(int arg0, byte arg1) {
	try {
	    anInt2197++;
	    if (arg1 != 113)
		return 71;
	    return 0x7f & arg0 >> -809958741;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rb.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2413(SignLink arg0, byte arg1) {
	anInt2203++;
	Class8 class8 = null;
	try {
	    Class139 class139 = arg0.method2681(-1);
	    while (class139.anInt1864 == 0)
		Class187.method2575(arg1 + -107, 1L);
	    if (class139.anInt1864 == 1) {
		class8 = (Class8) class139.anObject1866;
		Stream stream = Class164.method2410(-15996);
		class8.method168(stream.data, 1, 0,
				 stream.offset);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (class8 != null)
		    class8.method170(1);
		if (arg1 == -7)
		    break;
		method2414(96, (byte) 37);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method2414(int arg0, byte arg1) {
	try {
	    if (arg1 != 53)
		method2412(21, (byte) -83);
	    anInt2195++;
	    if (arg0 != 0) {
		if (arg0 != 1) {
		    if (arg0 == 2)
			Class131_Sub41_Sub4.method1937(-1);
		    else {
			if ((arg0 ^ 0xffffffff) != -4)
			    throw new RuntimeException();
			Class131_Sub9.method1685((byte) 3);
		    }
		} else
		    Class189.method2604(-113);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rb.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	anInt2200 = -1;
    }
}
