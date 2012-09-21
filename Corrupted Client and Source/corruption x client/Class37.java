/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class37
{
    public static int anInt500;
    public static int[] anIntArray501
	= { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    public static int anInt502;
    public static int anInt503;
    public static Class158 aClass158_504;
    
    public static void method492(int arg0, int arg1) {
	anInt502++;
	if (!Class40.aBoolean533)
	    arg0 = -1;
	if (arg0 != Class63.anInt807 && arg1 == 1) {
	    if ((arg0 ^ 0xffffffff) != 0) {
		Class143 class143 = Class131.method1356(arg0, 0);
		Class124 class124 = class143.method2143(false);
		if (class124 != null) {
		    Class23_Sub4.aSignLink_3734.method2699
			(class124.method1093(), class124.method1089(),
			 new Point(class143.anInt1911, class143.anInt1909),
			 class124.method1081(),
			 Class131_Sub2_Sub15.aCanvas5768, -126);
		    Class63.anInt807 = arg0;
		} else
		    arg0 = -1;
	    }
	    if ((arg0 ^ 0xffffffff) == 0 && Class63.anInt807 != -1) {
		Class23_Sub4.aSignLink_3734.method2699(null, -1, new Point(),
						       -1,
						       (Class131_Sub2_Sub15
							.aCanvas5768),
						       arg1 ^ ~0x7f);
		Class63.anInt807 = -1;
	    }
	}
    }
    
    public static void method493(int arg0) {
	try {
	    anIntArray501 = null;
	    if (arg0 == 24069)
		aClass158_504 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"di.D(" + arg0 + ')');
	}
    }
    
    public static void method494(int arg0) {
	anInt500++;
	if ((Class133.anInt1803 ^ 0xffffffff) != -11
	    && (Class133.anInt1803 ^ 0xffffffff) != -29)
	    Class127_Sub1.method1134((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anIntArray5328[0]) >> -2101261853,
				     5000, true,
				     (Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anIntArray5331[0]) >> 890555427);
	else
	    Class127_Sub1.method1134(Class2.anInt84 >> 1888717226, 5000, true,
				     Class57.anInt753 >> 841255434);
	Class131_Sub2_Sub7.method1499(0);
	Class126.method1105(32767);
	Class133.method2094((byte) -58);
	Class158.method2346((byte) -67);
	if (arg0 != -9941)
	    anIntArray501 = null;
    }
    
    public static void method495(int arg0, String arg1) {
	try {
	    anInt503++;
	    if (Canvas_Sub1.aClass184Array46 != null) {
		Class93.aClass131_Sub15_Sub2_1226.createPacket(71);
		Class207.anInt3025++;
		Class93.aClass131_Sub15_Sub2_1226.writeByte
		    (Class131_Sub30.method1856((byte) -109, arg1));
		Class93.aClass131_Sub15_Sub2_1226.writeString(arg1, (byte) 85);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("di.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
