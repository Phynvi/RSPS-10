/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class112
{
    public static String[] aStringArray1434 = new String[100];
    public short[] aShortArray1435;
    public static int anInt1436;
    public static Class158 aClass158_1437;
    public short[] aShortArray1438;
    public static int[] anIntArray1439 = new int[14];
    public int anInt1440;
    public static boolean[] aBooleanArray1441;
    public boolean aBoolean1442;
    public static int anInt1443;
    public static int anInt1444;
    public int anInt1445;
    public int anInt1446;
    public static boolean aBoolean1447;
    public boolean aBoolean1448 = false;
    public int anInt1449;
    public int anInt1450;
    public int anInt1451;
    public int anInt1452;
    public static String aString1453 = null;
    public int anInt1454;
    public short[] aShortArray1455;
    public short[] aShortArray1456;
    public static int anInt1457;
    
    public void method955(Stream arg0, int arg1, byte arg2) {
	try {
	    if (arg1 != 1) {
		if ((arg1 ^ 0xffffffff) == -3)
		    anInt1450 = arg0.readUnsignedShort(8104);
		else if (arg1 == 4)
		    anInt1446 = arg0.readUnsignedShort(8104);
		else if (arg1 != 5) {
		    if ((arg1 ^ 0xffffffff) != -7) {
			if (arg1 == 7)
			    anInt1440 = arg0.readUnsignedByte(101);
			else if ((arg1 ^ 0xffffffff) == -9)
			    anInt1451 = arg0.readUnsignedByte(102);
			else if (arg1 != 9) {
			    if (arg1 != 10) {
				if (arg1 != 40) {
				    if ((arg1 ^ 0xffffffff) == -42) {
					int i = arg0.readUnsignedByte(-65);
					aShortArray1455 = new short[i];
					aShortArray1435 = new short[i];
					for (int i_0_ = 0; i > i_0_; i_0_++) {
					    aShortArray1455[i_0_]
						= (short) (arg0.readUnsignedShort
							   (8104));
					    aShortArray1435[i_0_]
						= (short) (arg0.readUnsignedShort
							   (8104));
					}
				    }
				} else {
				    int i = arg0.readUnsignedByte(59);
				    aShortArray1438 = new short[i];
				    aShortArray1456 = new short[i];
				    for (int i_1_ = 0;
					 ((i ^ 0xffffffff)
					  < (i_1_ ^ 0xffffffff));
					 i_1_++) {
					aShortArray1438[i_1_]
					    = (short) arg0.readUnsignedShort(8104);
					aShortArray1456[i_1_]
					    = (short) arg0.readUnsignedShort(8104);
				    }
				}
			    } else
				aBoolean1448 = true;
			} else
			    aBoolean1442 = true;
		    } else
			anInt1454 = arg0.readUnsignedShort(8104);
		} else
		    anInt1449 = arg0.readUnsignedShort(8104);
	    } else
		anInt1445 = arg0.readUnsignedShort(8104);
	    if (arg2 > 111)
		anInt1444++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ll.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public Class154 method956(int arg0, int arg1, int arg2, int arg3, int arg4,
			      Class130 arg5) {
	try {
	    anInt1457++;
	    int i = arg4;
	    Class161 class161
		= ((anInt1450 ^ 0xffffffff) == 0 || arg1 == -1 ? null
		   : Class145.method2159(anInt1450, (byte) -91));
	    if (class161 != null)
		i |= class161.method2389(1, false, arg3, arg1);
	    if (anInt1449 != 128)
		i |= 0x2;
	    if ((anInt1446 ^ 0xffffffff) != -129
		|| (anInt1454 ^ 0xffffffff) != -1)
		i |= 0x5;
	    Class154 class154;
	    synchronized (Class131_Sub2_Sub14.aClass214_5749) {
		class154
		    = (Class154) (Class131_Sub2_Sub14.aClass214_5749.method2780
				  (120,
				   (long) (anInt1452
					   |= arg5.anInt1781 << 1086416765)));
	    }
	    if (class154 == null
		|| arg5.method1208(class154.method2253(), i) != 0) {
		if (class154 != null)
		    i = arg5.method1203(i, class154.method2253());
		int i_2_ = i;
		if (aShortArray1438 != null)
		    i_2_ |= 0x2000;
		if (aShortArray1455 != null)
		    i_2_ |= 0x4000;
		Class116 class116
		    = Class134.method2097(anInt1445, 0,
					  Class121_Sub2_Sub1.aClass158_5426,
					  1);
		if (class116 == null)
		    return null;
		class154
		    = arg5.method1218(class116, i_2_, Class131_Sub24.anInt4470,
				      64 + anInt1440, 850 + anInt1451);
		if (aShortArray1438 != null) {
		    for (int i_3_ = 0;
			 ((i_3_ ^ 0xffffffff)
			  > (aShortArray1438.length ^ 0xffffffff));
			 i_3_++)
			class154.method2260(aShortArray1438[i_3_],
					    aShortArray1456[i_3_]);
		}
		if (aShortArray1455 != null) {
		    for (int i_4_ = 0; ((aShortArray1455.length ^ 0xffffffff)
					< (i_4_ ^ 0xffffffff)); i_4_++)
			class154.method2281(aShortArray1455[i_4_],
					    aShortArray1435[i_4_]);
		}
		class154.method2248(i);
		synchronized (Class131_Sub2_Sub14.aClass214_5749) {
		    Class131_Sub2_Sub14.aClass214_5749.method2773
			(true, class154,
			 (long) (anInt1452 |= arg5.anInt1781 << 109290909));
		}
	    }
	    Class154 class154_5_
		= (class161 != null
		   ? class161.method2390(arg3, arg1, i, (byte) 2, arg2, 0,
					 class154, (byte) -101)
		   : class154.method2287((byte) 2, i, true));
	    if (anInt1446 != 128 || (anInt1449 ^ 0xffffffff) != -129)
		class154_5_.method2262(anInt1446, anInt1449, anInt1446);
	    if ((anInt1454 ^ 0xffffffff) != arg0) {
		if (anInt1454 == 90)
		    class154_5_.method2264(4096);
		if (anInt1454 == 180)
		    class154_5_.method2264(8192);
		if (anInt1454 == 270)
		    class154_5_.method2264(12288);
	    }
	    class154_5_.method2248(arg4);
	    return class154_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ll.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method957(int arg0, Stream arg1) {
	for (;;) {
	    int i = arg1.readUnsignedByte(-63);
	    if (i == 0)
		break;
	    method955(arg1, i, (byte) 116);
	}
	anInt1436++;
	if (arg0 != 0)
	    method955(null, -124, (byte) 74);
    }
    
    public static void method958(boolean arg0) {
	anInt1443++;
	Class199.method2711(0, arg0);
	if ((Class1_Sub7.anInt3583 ^ 0xffffffff) <= -1
	    && (Class1_Sub7.anInt3583 ^ 0xffffffff) != -1) {
	    Class131_Sub2_Sub38.method1644(Class1_Sub7.anInt3583, 93);
	    Class1_Sub7.anInt3583 = -1;
	}
    }
    
    public static void method959(boolean arg0) {
	try {
	    aBooleanArray1441 = null;
	    aClass158_1437 = null;
	    aStringArray1434 = null;
	    if (arg0 != false)
		anIntArray1439 = null;
	    anIntArray1439 = null;
	    aString1453 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ll.D(" + arg0 + ')');
	}
    }
    
    public Class112() {
	anInt1446 = 128;
	aBoolean1442 = false;
	anInt1449 = 128;
	anInt1451 = 0;
	anInt1450 = -1;
	anInt1454 = 0;
	anInt1440 = 0;
    }
    
    static {
	aBoolean1447 = false;
    }
}
