/* Class131_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class131_Sub2_Sub5 extends Class131_Sub2
{
    public static int anInt5602;
    public static int anInt5603;
    public int anInt5604 = 0;
    public static int anInt5605;
    public int anInt5606;
    public int anInt5607;
    public static int[] anIntArray5608;
    public static int anInt5609;
    public int anInt5610 = 20;
    public static int[][] anIntArrayArray5611;
    public static Class87[] aClass87Array5612 = new Class87[8];
    public static int anInt5613;
    public static int anInt5614;
    public static String aString5615 = "skill: ";
    public static Class158 aClass158_5616;
    
    public static void method1490(int arg0, String arg1, byte arg2) {
	try {
	    anInt5613++;
	    boolean bool = false;
	    for (int i = 0; i < Class131_Sub38.anInt4618; i++) {
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
		       [Class148.anIntArray1983[i]]);
		if (class23_sub4_sub1_sub2 != null
		    && class23_sub4_sub1_sub2.aString6491 != null
		    && class23_sub4_sub1_sub2.aString6491
			   .equalsIgnoreCase(arg1)) {
		    if ((arg0 ^ 0xffffffff) == -2) {
			Class121.anInt1592++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(152);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeByteS(0);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (Class148.anIntArray1983[i]);
		    } else if ((arg0 ^ 0xffffffff) == -5) {
			Class154.anInt2054++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(114);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class148.anIntArray1983[i]);
			Class93.aClass131_Sub15_Sub2_1226.writeByteC(-29012,
								     0);
		    } else if (arg0 == 5) {
			client.anInt3476++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(94);
			Class93.aClass131_Sub15_Sub2_1226.writeByte(0);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			    (Class148.anIntArray1983[i], (byte) -115);
		    } else if (arg0 == 6) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(35);
			Class23_Sub5_Sub1.anInt5032++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class148.anIntArray1983[i]);
			Class93.aClass131_Sub15_Sub2_1226.writeByteC(-29012,
								     0);
		    } else if ((arg0 ^ 0xffffffff) == -8) {
			Class146.anInt1937++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(128);
			Class93.aClass131_Sub15_Sub2_1226.writeShortA
			    (Class148.anIntArray1983[i], (byte) -125);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA(true, 0);
		    }
		    bool = true;
		    break;
		}
	    }
	    if (!bool)
		Class186.method2562(Class131_Sub2_Sub9.aString5672 + arg1,
				    (byte) 53);
	    int i = -111 % ((arg2 - 58) / 53);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cl.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub2_Sub5() {
	super(0, true);
	anInt5606 = 1365;
	anInt5607 = 0;
    }
    
    public static void method1491(SignLink arg0, Frame arg1, boolean arg2) {
	try {
	    anInt5603++;
	    for (;;) {
		Class139 class139 = arg0.method2679(arg1, 127);
		while ((class139.anInt1864 ^ 0xffffffff) == -1)
		    Class187.method2575(-56, 10L);
		if (class139.anInt1864 == 1)
		    break;
		Class187.method2575(-35, 100L);
	    }
	    arg1.setVisible(false);
	    if (arg2 != true)
		method1491(null, null, true);
	    arg1.dispose();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cl.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static String method1492(byte arg0, Class173 arg1, int arg2) {
	try {
	    if (arg0 != 19)
		method1491(null, null, true);
	    anInt5614++;
	    if (!client.method66(arg1).method1880(arg2, (byte) -102)
		&& arg1.anObjectArray2465 == null)
		return null;
	    if (arg1.aStringArray2385 == null
		|| arg1.aStringArray2385.length <= arg2
		|| arg1.aStringArray2385[arg2] == null
		|| arg1.aStringArray2385[arg2].trim().length() == 0) {
		if (Class23_Sub5.aBoolean3761)
		    return "Hidden-" + arg2;
		return null;
	    }
	    return arg1.aStringArray2385[arg2];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cl.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5609++;
	if (arg1 == -49) {
	    int i = arg0;
	while_32_:
	    do {
	    while_31_:
		do {
		    do {
			if ((i ^ 0xffffffff) != -1) {
			    if ((i ^ 0xffffffff) != -2) {
				if (i != 2) {
				    if (i != 3)
					break while_32_;
				} else
				    break;
				break while_31_;
			    }
			} else {
			    anInt5606 = arg2.readUnsignedShort(8104);
			    return;
			}
			anInt5610 = arg2.readUnsignedShort(8104);
			return;
		    } while (false);
		    anInt5604 = arg2.readUnsignedShort(8104);
		    return;
		} while (false);
		anInt5607 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	    } while (false);
	}
    }
    
    public static void method1493(byte arg0) {
	try {
	    if (arg0 == -9) {
		aClass158_5616 = null;
		anIntArray5608 = null;
		aString5615 = null;
		anIntArrayArray5611 = null;
		aClass87Array5612 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cl.B(" + arg0 + ')');
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5602++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 77);
	    if (arg0 != -11543)
		method1493((byte) -61);
	    if (aClass200_4087.aBoolean2927) {
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    int i_0_ = (((Class1_Sub4.anIntArray3551[i] << 1237064012)
				 / anInt5606)
				+ anInt5604);
		    int i_1_
			= anInt5607 + (Class1_Sub7_Sub1.anIntArray5206[arg1]
				       << 450079532) / anInt5606;
		    int i_2_ = i_0_;
		    int i_3_ = i_1_;
		    int i_4_ = i_0_;
		    int i_5_ = i_1_;
		    int i_6_ = i_0_ * i_0_ >> 1308154540;
		    int i_7_ = i_1_ * i_1_ >> 470004268;
		    int i_8_;
		    for (i_8_ = 0; i_7_ + i_6_ < 16384 && i_8_ < anInt5610;
			 i_8_++) {
			i_5_ = 2 * (i_5_ * i_4_ >> -694319828) + i_3_;
			i_4_ = i_6_ + (-i_7_ - -i_2_);
			i_7_ = i_5_ * i_5_ >> -954994708;
			i_6_ = i_4_ * i_4_ >> -1137811156;
		    }
		    is[i]
			= ((i_8_ ^ 0xffffffff) > (-1 + anInt5610 ^ 0xffffffff)
			   ? (i_8_ << -80033076) / anInt5610 : 0);
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cl.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    static {
	anIntArrayArray5611
	    = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 },
			    { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 },
			    { 0, 4, 4, 4 }, { 4, 4, 4, 0 },
			    { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 },
			    { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 },
			    { 0, 4, 4, 4 } };
	anIntArray5608 = new int[500];
    }
}
