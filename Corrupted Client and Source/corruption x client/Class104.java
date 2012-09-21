/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class104
{
    public static int anInt1354;
    public static int anInt1355;
    public Class9 aClass9_1356;
    public static int[] anIntArray1357;
    public int anInt1358;
    public static int anInt1359;
    public Class104 aClass104_1360;
    public int anInt1361;
    public int anInt1362;
    public int anInt1363;
    public static int anInt1364;
    public static int anInt1365 = -1;
    public int anInt1366;
    
    public static int method909(byte arg0) {
	try {
	    anInt1359++;
	    if (arg0 != 59)
		return -81;
	    return ((((Class212.anInt3112 ^ 0xffffffff) != -1 ? 1 : 0)
		     << -701177387)
		    + (((Class58.aBoolean765 ? 1 : 0) << -1789840077)
		       + (Class141.anInt1876 << -782556847)
		       + (((!Class23_Sub1_Sub2.aBoolean5159 ? 0 : 1)
			   << -1655880817)
			  + ((!Class167.aBoolean2235 ? 0 : 1) << -1054012563)
			  + (((Class131_Sub2_Sub16.anInt5779 & 0x3)
			      << -242491637)
			     + (((!Class121.aBoolean1588 ? 0 : 1)
				 << 1681639242)
				+ ((Class103.aBoolean1349 ? 1 : 0)
				   << 1605673385))))
		       + ((!Class183.aBoolean2613 ? 0 : 1) << 1338103558))
		    + (((Class135.aBoolean1818 ? 1 : 0) << 1002282981)
		       + ((Class134.anInt1809 & 0x7)
			  - -((!Class131_Sub9.aBoolean4213 ? 0 : 1)
			      << 1428002787)))
		    - (-((!Class91.aBoolean1180 ? 0 : 1) << -68422780)
		       + (-((Class131_Sub33.aBoolean4557 ? 1 : 0) << 816875560)
			  + -((!Class131_Sub8_Sub1.aBoolean6089 ? 0 : 1)
			      << 1433979536)
			  - (((Class23_Sub4_Sub2.anInt5380 ^ 0xffffffff) == -1
			      ? 0 : 1)
			     << 2106318772)
			  + (-(((InputStream_Sub1.anInt55 ^ 0xffffffff) != -1
				? 1 : 0)
			       << -1036834314)
			     + -(Class186.method2563(72) << 885983959)
			     + (-(Class171.anInt2284 << -77285191)
				+ -((Class131_Sub13.aBoolean4268 ? 1 : 0)
				    << -1198068101))))
		       + -(Class131_Sub2_Sub10_Sub1.anInt6537 << 1991695580)));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"la.A(" + arg0 + ')');
	}
    }
    
    public static void method910(int arg0, Component arg1) {
	try {
	    anInt1354++;
	    arg1.addMouseListener(Class126.aClass201_1689);
	    arg1.addMouseMotionListener(Class126.aClass201_1689);
	    if (arg0 == -12951)
		arg1.addFocusListener(Class126.aClass201_1689);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("la.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method911(int arg0) {
	try {
	    if (arg0 <= 88)
		method909((byte) 35);
	    anIntArray1357 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"la.C(" + arg0 + ')');
	}
    }
    
    public Class104(int arg0, int arg1) {
	try {
	    anInt1358 = arg0;
	    anInt1362 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("la.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    public Class104(Class104 arg0, int arg1) {
	try {
	    aClass104_1360 = arg0;
	    anInt1358 = aClass104_1360.anInt1358;
	    aClass9_1356 = aClass104_1360.aClass9_1356;
	    anInt1362 = arg1 + aClass104_1360.anInt1362;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("la.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    static {
	anInt1364 = 0;
    }
}
