/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
    public static char[] aCharArray74
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    public static long aLong75 = 0L;
    public static int anInt76;
    public static int anInt77;
    public Class1 aClass1_78;
    public static long aLong79 = 0L;
    public Class1 aClass1_80;
    
    public void method95(byte arg0) {
	try {
	    anInt76++;
	    if (aClass1_80 != null) {
		aClass1_80.aClass1_78 = aClass1_78;
		aClass1_78.aClass1_80 = aClass1_80;
		if (arg0 != 71)
		    anInt77 = 22;
		aClass1_80 = null;
		aClass1_78 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"aa.J(" + arg0 + ')');
	}
    }
    
    public static void method96(int arg0) {
	try {
	    if (arg0 == 199)
		aCharArray74 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"aa.I(" + arg0 + ')');
	}
    }
}
