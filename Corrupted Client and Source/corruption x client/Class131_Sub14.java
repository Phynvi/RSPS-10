/* Class131_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class131_Sub14 extends Class131
{
    public static int anInt4273;
    public static int anInt4274;
    public int anInt4275;
    public Class173 aClass173_4276;
    public String aString4277;
    public static Class214 aClass214_4278;
    public int anInt4279;
    public Class173 aClass173_4280;
    public Object[] anObjectArray4281;
    public boolean aBoolean4282;
    public int anInt4283;
    public static int anInt4284;
    public int anInt4285;
    public static Class163 aClass163_4286;
    public static int anInt4287;
    public static int anInt4288;
    public static int anInt4289;
    public static int anInt4290;
    public static String aString4291 = "";
    public int anInt4292;
    public static int[] anIntArray4293 = new int[4];
    public static Class152 aClass152_4294;
    
    public static void method1711(boolean arg0) {
	try {
	    anIntArray4293 = null;
	    if (arg0 != false)
		method1712(null, 121);
	    aClass214_4278 = null;
	    aClass163_4286 = null;
	    aClass152_4294 = null;
	    aString4291 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ic.D(" + arg0 + ')');
	}
    }
    
    public static void method1712(Class158 arg0, int arg1) {
	try {
	    if (arg1 >= -105)
		method1712(null, 73);
	    Class131_Sub10.aClass158_4222 = arg0;
	    anInt4290++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ic.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method1713(int arg0, int arg1) {
	try {
	    if (arg1 != 29059)
		anInt4289 = -97;
	    anInt4287++;
	    return arg0 & 0x3ff;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ic.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1714(boolean arg0, Class158 arg1, Class158 arg2,
				  Class158 arg3) {
	try {
	    Class131_Sub41_Sub17_Sub1.aClass158_6563 = arg3;
	    anInt4284++;
	    if (arg0 != true)
		method1714(false, null, null, null);
	    Class187.method2579(arg2, arg1, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("ic.C(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static Class113 method1715(int arg0, Stream arg1) {
	try {
	    anInt4274++;
	    if (arg0 != 10)
		aClass214_4278 = null;
	    Class113 class113 = new Class113();
	    class113.anInt1464 = arg1.readUnsignedShort(8104);
	    class113.aClass131_Sub41_Sub8_1459
		= Class14.method215(class113.anInt1464, (byte) -105);
	    return class113;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ic.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static String method1716(byte arg0, long arg1) {
	try {
	    Class138_Sub1.aCalendar4706.setTime(new Date(arg1));
	    anInt4273++;
	    int i = Class138_Sub1.aCalendar4706.get(7);
	    int i_0_ = Class138_Sub1.aCalendar4706.get(5);
	    int i_1_ = Class138_Sub1.aCalendar4706.get(2);
	    int i_2_ = Class138_Sub1.aCalendar4706.get(1);
	    int i_3_ = Class138_Sub1.aCalendar4706.get(11);
	    if (arg0 != 40)
		method1713(-66, 127);
	    int i_4_ = Class138_Sub1.aCalendar4706.get(12);
	    int i_5_ = Class138_Sub1.aCalendar4706.get(13);
	    return (Class131_Sub41_Sub1.aStringArray6173[i - 1] + ", "
		    + i_0_ / 10 + i_0_ % 10 + "-"
		    + Class131_Sub2_Sub38.aStringArray6068[i_1_] + "-" + i_2_
		    + " " + i_3_ / 10 + i_3_ % 10 + ":" + i_4_ / 10 + i_4_ % 10
		    + ":" + i_5_ / 10 + i_5_ % 10 + " GMT");
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ic.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	aClass214_4278 = new Class214(64);
    }
}
