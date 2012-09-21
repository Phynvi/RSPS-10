/* Class131_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

public class Class131_Sub3 extends Class131
{
    public int anInt4105;
    public int anInt4106;
    public int anInt4107;
    public int anInt4108;
    public int anInt4109 = -1;
    public static int anInt4110;
    public static String aString4111 = "Loading...";
    public int anInt4112;
    public int anInt4113;
    public static int anInt4114;
    public int anInt4115;
    public static int anInt4116 = 10;
    public int anInt4117 = 0;
    public static Class119 aClass119_4118 = new Class119();
    public static int anInt4119;
    public int anInt4120;
    public int anInt4121;
    public int anInt4122;
    public static PacketStream aClass131_Sub15_Sub2_4123
	= new PacketStream(5000);
    public static int anInt4124;
    public static boolean aBoolean4125 = false;
    public static int anInt4126;
    public static int[] anIntArray4127;
    
    public static void method1647(int arg0, Component arg1) {
	try {
	    anInt4114++;
	    if (arg0 <= 51)
		method1649(-115);
	    Method method = SignLink.aMethod2906;
	    if (method != null) {
		try {
		    method.invoke(arg1, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    arg1.addKeyListener(Class131_Sub2_Sub35.aClass28_6038);
	    arg1.addFocusListener(Class131_Sub2_Sub35.aClass28_6038);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("al.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1648(int arg0) {
	anInt4124++;
	if (arg0 == -1) {
	    if (Class126.aClass201_1689 != null) {
		synchronized (Class126.aClass201_1689) {
		    Class126.aClass201_1689 = null;
		}
	    }
	}
    }
    
    public static void method1649(int arg0) {
	try {
	    anIntArray4127 = null;
	    if (arg0 == 10) {
		aString4111 = null;
		aClass131_Sub15_Sub2_4123 = null;
		aClass119_4118 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"al.B(" + arg0 + ')');
	}
    }
    
    public static void method1650(int arg0, int[] arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt4110++;
	    if (arg4 >= 55) {
		arg3--;
		int i = --arg0 - 7;
		while ((i ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		    arg1[++arg3] = arg2;
		}
		while ((arg3 ^ 0xffffffff) > (arg0 ^ 0xffffffff))
		    arg1[++arg3] = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("al.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
}
