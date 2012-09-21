/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49
{
    public static Class214 aClass214_651 = new Class214(8);
    public static int anInt652;
    public static Class71 aClass71_653;
    public static int anInt654;
    public static int anInt655;
    
    public static int method579(int arg0, int arg1, int arg2, byte arg3) {
	try {
	    anInt654++;
	    if (arg3 <= 55)
		method579(-76, 53, -77, (byte) 2);
	    arg2 &= 0x3;
	    if ((arg2 ^ 0xffffffff) == -1)
		return arg0;
	    if (arg2 == 1)
		return arg1;
	    if (arg2 == 2)
		return 1023 - arg0;
	    return -arg1 + 1023;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("em.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method580(int arg0) {
	aClass214_651 = null;
	aClass71_653 = null;
	if (arg0 != 3)
	    anInt655 = -64;
    }
}
