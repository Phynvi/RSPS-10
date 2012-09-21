/* Class131_Sub2_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub16 extends Class131_Sub2
{
    public static int[] anIntArray5777;
    public int[] anIntArray5778;
    public static int anInt5779 = 2;
    public int anInt5780;
    public static int anInt5781;
    public static int anInt5782;
    public int anInt5783 = 0;
    public int[] anIntArray5784;
    public int anInt5785;
    public static int[] anIntArray5786;
    public static int anInt5787;
    public static int anInt5788;
    public static int[] anIntArray5789;
    public static int anInt5790;
    public static int anInt5791;
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5791++;
	    if (arg0 != -11543)
		return null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -128);
	    if (aClass200_4087.aBoolean2927) {
		int i = Class1_Sub7_Sub1.anIntArray5206[arg1];
		if ((anInt5783 ^ 0xffffffff) == -1) {
		    int i_0_ = 0;
		    for (int i_1_ = 0; anInt5780 > i_1_; i_1_++) {
			if (anIntArray5784[i_1_] <= i
			    && (i ^ 0xffffffff) > (anIntArray5784[i_1_ - -1]
						   ^ 0xffffffff)) {
			    if (anIntArray5778[i_1_] > i)
				i_0_ = 4096;
			    break;
			}
		    }
		    Class61.method651(is, 0, Class131_Sub2_Sub7.anInt5637,
				      i_0_);
		} else {
		    for (int i_2_ = 0;
			 ((i_2_ ^ 0xffffffff)
			  > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
			 i_2_++) {
			int i_3_ = 0;
			int i_4_ = 0;
			int i_5_ = Class1_Sub4.anIntArray3551[i_2_];
			int i_6_ = anInt5783;
		    while_168_:
			do {
			    do {
				if (i_6_ != 1) {
				    if ((i_6_ ^ 0xffffffff) != -3) {
					if (i_6_ == 3)
					    break;
					break while_168_;
				    }
				} else {
				    i_3_ = i_5_;
				    break while_168_;
				}
				i_3_ = ((-4096 + (i + i_5_) >> 1882168769)
					+ 2048);
				break while_168_;
			    } while (false);
			    i_3_ = 2048 + (i_5_ + -i >> -1746454559);
			} while (false);
			for (i_6_ = 0; i_6_ < anInt5780; i_6_++) {
			    if (anIntArray5784[i_6_] <= i_3_
				&& anIntArray5784[i_6_ + 1] > i_3_) {
				if ((anIntArray5778[i_6_] ^ 0xffffffff)
				    < (i_3_ ^ 0xffffffff))
				    i_4_ = 4096;
				break;
			    }
			}
			is[i_2_] = i_4_;
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("go.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1546(byte arg0) {
	try {
	    anInt5790++;
	    anIntArray5778 = new int[anInt5780 + 1];
	    anIntArray5784 = new int[1 + anInt5780];
	    int i = 0;
	    int i_7_ = 4096 / anInt5780;
	    int i_8_ = i_7_ * anInt5785 >> 481931436;
	    for (int i_9_ = 0; anInt5780 > i_9_; i_9_++) {
		anIntArray5784[i_9_] = i;
		anIntArray5778[i_9_] = i_8_ + i;
		i += i_7_;
	    }
	    if (arg0 != 76)
		anIntArray5784 = null;
	    anIntArray5784[anInt5780] = 4096;
	    anIntArray5778[anInt5780] = anIntArray5778[0] + 4096;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"go.B(" + arg0 + ')');
	}
    }
    
    public static void method1547(boolean arg0) {
	anIntArray5777 = null;
	anIntArray5786 = null;
	anIntArray5789 = null;
	if (arg0 != false)
	    anInt5779 = -93;
    }
    
    public void method1471(int arg0) {
	try {
	    anInt5788++;
	    if (arg0 == 0)
		method1546((byte) 76);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"go.J(" + arg0 + ')');
	}
    }
    
    public static void method1548(byte arg0) {
	for (int i = 0; (i ^ 0xffffffff) > -101; i++)
	    Class131_Sub41_Sub16.aBooleanArray6371[i] = true;
	anInt5781++;
	if (arg0 != -125)
	    method1548((byte) -102);
    }
    
    public Class131_Sub2_Sub16() {
	super(0, true);
	anInt5780 = 10;
	anInt5785 = 2048;
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5782++;
	if (arg1 != -49)
	    anInt5780 = -122;
	int i = arg0;
    while_169_:
	do {
	    do {
		if ((i ^ 0xffffffff) != -1) {
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 2)
			    break;
			break while_169_;
		    }
		} else {
		    anInt5780 = arg2.readUnsignedByte(105);
		    return;
		}
		anInt5785 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
		return;
	    } while (false);
	    anInt5783 = arg2.readUnsignedByte(101);
	} while (false);
    }
    
    public static boolean method1549(int arg0) {
	try {
	    anInt5787++;
	    try {
		if (arg0 != 9316)
		    anIntArray5777 = null;
		return PacketParser.method1582(-78);
	    } catch (java.io.IOException ioexception) {
		Class138.method2121(true);
		return true;
	    } catch (Exception exception) {
		String string = ("T2 - " + Class131_Sub35.anInt4583 + ","
				 + Class56.anInt738 + ","
				 + Class131_Sub41_Sub19.anInt6414 + " - "
				 + Class131_Sub8_Sub1.anInt6100 + ","
				 + (Class92.regionX
				    + (Class166.aClass23_Sub4_Sub1_Sub2_2216
				       .anIntArray5328[0]))
				 + ","
				 + ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				     .anIntArray5331[0])
				    + Class64.regionY)
				 + " - ");
		for (int i = 0; i < Class131_Sub8_Sub1.anInt6100 && i < 50;
		     i++)
		    string += (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .data[i]) + ",";
		Class45.method563(string, exception, 0);
		Class41.method512(arg0 + -9314);
		return true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"go.D(" + arg0 + ')');
	}
    }
}
