/* Class138_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class138_Sub1 extends Class138 implements Runnable
{
    public Class120_Sub1 aClass120_Sub1_4702;
    public static int anInt4703;
    public static int anInt4704;
    public static int anInt4705;
    public static Calendar aCalendar4706
	= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    public static int anInt4707;
    public int anInt4708 = -1;
    public boolean aBoolean4709 = true;
    
    public void run() {
	try {
	    anInt4707++;
	    while (aBoolean4709)
		aClass120_Sub1_4702.method1032(this, (byte) 23);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pr.run(" + ')');
	}
    }
    
    public static boolean method2123(int arg0) {
	try {
	    anInt4705++;
	    synchronized (Class131_Sub2_Sub35.aClass28_6038) {
		if (Class204.anInt2979 == Class14.anInt154)
		    return false;
		int i = 53 % ((-11 - arg0) / 58);
		Class131_Sub2_Sub1.anInt5563
		    = Class131_Sub2_Sub4.anIntArray5595[Class204.anInt2979];
		Class23_Sub5_Sub1.aChar5038
		    = Class148.aCharArray1975[Class204.anInt2979];
		Class204.anInt2979 = 0x7f & Class204.anInt2979 + 1;
		return true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pr.B(" + arg0 + ')');
	}
    }
    
    public static void method2124(int arg0) {
	aCalendar4706 = null;
	if (arg0 >= -3)
	    aCalendar4706 = null;
    }
    
    public void method2125(byte arg0) {
	aBoolean4709 = false;
	anInt4704++;
	if (arg0 <= 69)
	    method2124(32);
    }
    
    public void method2126(byte arg0) {
	new Thread(this, "a").start();
	anInt4703++;
	if (arg0 < 71)
	    aBoolean4709 = false;
    }
    
    public Class138_Sub1(Class120_Sub1 arg0) {
	try {
	    aClass120_Sub1_4702 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pr.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
