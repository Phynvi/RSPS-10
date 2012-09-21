/* Class131_Sub2_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub31 extends Class131_Sub2
{
    public int anInt5996 = 4096;
    public static int anInt5997;
    public int anInt5998 = 409;
    public static int anInt5999;
    public static int anInt6000;
    public static String aString6001 = "Loaded sprites";
    public int anInt6002;
    public int[] anIntArray6003 = new int[3];
    public static int anInt6004;
    public static int anInt6005;
    public static volatile int anInt6006 = -1;
    public static int anInt6007;
    public int anInt6008;
    
    public static void method1621(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11,
				  int arg12) {
	try {
	    anInt6005++;
	    Class131_Sub38 class131_sub38 = new Class131_Sub38();
	    class131_sub38.anInt4613 = arg5;
	    class131_sub38.anInt4616 = arg11;
	    class131_sub38.anInt4626 = arg12;
	    class131_sub38.anInt4624 = arg6;
	    class131_sub38.anInt4610 = arg3;
	    class131_sub38.anInt4621 = arg9;
	    class131_sub38.anInt4614 = arg8;
	    class131_sub38.anInt4625 = arg10;
	    class131_sub38.anInt4619 = arg2;
	    class131_sub38.anInt4623 = arg0;
	    class131_sub38.anInt4620 = arg7;
	    if (arg4 != true)
		anInt6006 = -78;
	    class131_sub38.anInt4615 = arg1;
	    Class103.aClass119_1334.method1018((byte) -125, class131_sub38);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rm.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ',' + arg11
						 + ',' + arg12 + ')'));
	}
    }
    
    public static void method1622(int arg0) {
	try {
	    if (arg0 == 0)
		aString6001 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rm.G(" + arg0 + ')');
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5999++;
	    int[][] is = aClass59_4097.method641(arg0, arg1 + -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_0_ = this.method1463(0, (byte) 121, arg0);
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		for (int i = 0; i < Class131_Sub2_Sub7.anInt5637; i++) {
		    int i_7_ = is_1_[i];
		    int i_8_ = i_7_ + -anIntArray6003[0];
		    if (i_8_ < 0)
			i_8_ = -i_8_;
		    if (anInt5998 < i_8_) {
			is_4_[i] = i_7_;
			is_5_[i] = is_2_[i];
			is_6_[i] = is_3_[i];
		    } else {
			int i_9_ = is_2_[i];
			i_8_ = -anIntArray6003[1] + i_9_;
			if (i_8_ < 0)
			    i_8_ = -i_8_;
			if ((anInt5998 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
			    is_4_[i] = i_7_;
			    is_5_[i] = i_9_;
			    is_6_[i] = is_3_[i];
			} else {
			    int i_10_ = is_3_[i];
			    i_8_ = i_10_ - anIntArray6003[2];
			    if (i_8_ < 0)
				i_8_ = -i_8_;
			    if ((anInt5998 ^ 0xffffffff)
				> (i_8_ ^ 0xffffffff)) {
				is_4_[i] = i_7_;
				is_5_[i] = i_9_;
				is_6_[i] = i_10_;
			    } else {
				is_4_[i] = anInt5996 * i_7_ >> -1794906484;
				is_5_[i] = i_9_ * anInt6002 >> -1222042772;
				is_6_[i] = i_10_ * anInt6008 >> -518931380;
			    }
			}
		    }
		}
	    }
	    if (arg1 != 0)
		return null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rm.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1623(int arg0, int arg1, int arg2, int arg3,
				  byte arg4) {
	if ((arg2 ^ 0xffffffff) > (arg0 ^ 0xffffffff))
	    Class131_Sub3.method1650(arg0, Class56.anIntArrayArray740[arg1],
				     arg3, arg2, 123);
	else
	    Class131_Sub3.method1650(arg2, Class56.anIntArrayArray740[arg1],
				     arg3, arg0, 125);
	anInt6000++;
	if (arg4 <= 113)
	    method1624(false, 2);
    }
    
    public Class131_Sub2_Sub31() {
	super(1, false);
	anInt6002 = 4096;
	anInt6008 = 4096;
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	int i = arg0;
    while_107_:
	do {
	while_106_:
	    do {
	    while_105_:
		do {
		    do {
			if (i != 0) {
			    if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) != -3) {
				    if (i != 3) {
					if (i == 4)
					    break while_106_;
					break while_107_;
				    }
				} else
				    break;
				break while_105_;
			    }
			} else {
			    anInt5998 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
			    break while_107_;
			}
			anInt6008 = arg2.readUnsignedShort(8104);
			break while_107_;
		    } while (false);
		    anInt6002 = arg2.readUnsignedShort(8104);
		    break while_107_;
		} while (false);
		anInt5996 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
		break while_107_;
	    } while (false);
	    int i_11_ = arg2.read3Bytes(false);
	    anIntArray6003[2] = Class90.method841(i_11_, 255) >> 213440972;
	    anIntArray6003[0]
		= Class90.method841(267386880, i_11_ << -214797212);
	    anIntArray6003[1] = Class90.method841(i_11_ >> -1904702844, 4080);
	} while (false);
	anInt5997++;
	if (arg1 != -49)
	    method1623(-105, -37, -40, -70, (byte) 45);
    }
    
    public static boolean method1624(boolean arg0, int arg1) {
	try {
	    anInt6004++;
	    if (arg0 != false)
		return true;
	    if ((-arg1 & arg1 ^ 0xffffffff) != (arg1 ^ 0xffffffff))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rm.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
