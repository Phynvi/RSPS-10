/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public class Class126
{
    public static Class201 aClass201_1689 = new Class201();
    public static int anInt1690;
    public static int anInt1691;
    public static int anInt1692 = 0;
    public static int anInt1693;
    public static int anInt1694;
    public static int anInt1695;
    public static int anInt1696 = 0;
    public static int anInt1697;
    public static int anInt1698;
    public static String aString1699 = "Checking for updates - ";
    public static int anInt1700;
    public static Image anImage1701;
    public static String aString1702 = "Close";
    
    public static void method1104(boolean arg0, int arg1) {
	try {
	    anInt1694++;
	    if (arg0 != false)
		aString1699 = null;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(5, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(-128);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nc.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1105(int arg0) {
	try {
	    Class214.aClass130_3128.method1161((((float) Class134.anInt1809
						 * 0.1F)
						+ 0.7F) * Class85.aFloat1105);
	    anInt1690++;
	    if (arg0 != 32767)
		anInt1692 = -99;
	    Class214.aClass130_3128.method1232
		(Class115.anInt1482, Class149.aFloat1985,
		 Class23_Sub5.aFloat3754, (float) Class85.anInt1119,
		 (float) Class131_Sub2_Sub30.anInt5982,
		 (float) Class131_Sub41_Sub15.anInt6368);
	    Class214.aClass130_3128
		.method1172(Class23_Sub1_Sub2.aClass83_5145);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nc.A(" + arg0 + ')');
	}
    }
    
    public static void method1106(Class130 arg0, int arg1, Class94 arg2,
				  Class131_Sub20 arg3) {
	try {
	    anInt1695++;
	    Class152 class152 = arg2.method862(arg0, -1);
	    if (class152 != null) {
		int i = class152.method2206();
		if (class152.method2204() > i)
		    i = class152.method2204();
		int i_0_ = 10;
		int i_1_ = arg3.anInt4428;
		int i_2_ = arg3.anInt4429;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (arg2.aString1235 != null) {
		    i_3_
			= Class169.aClass55_2269.method620(null, 108,
							   arg2.aString1235,
							   (Class1_Sub2
							    .aStringArray3509),
							   null);
		    for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			String string = Class1_Sub2.aStringArray3509[i_6_];
			if (i_6_ < -1 + i_3_)
			    string = string.substring(0, -4 + string.length());
			int i_7_ = Class67.aClass140_912.method2131(string);
			if (i_4_ < i_7_)
			    i_4_ = i_7_;
		    }
		    i_5_ = (Class67.aClass140_912.method2127() * i_3_
			    - -(Class67.aClass140_912.method2132() / 2));
		}
		int i_8_ = arg3.anInt4428 + i / 2;
		int i_9_ = arg3.anInt4429;
		if (i_1_ >= Class127.anInt1737 - -i) {
		    if (i_1_ > Class127.anInt1718 + -i) {
			i_1_ = Class127.anInt1718 - i;
			i_8_ = -5 + (-(i_4_ / 2) + Class127.anInt1718
				     + -(i / 2) + -i_0_);
		    }
		} else {
		    i_1_ = Class127.anInt1737;
		    i_8_
			= 5 + i_4_ / 2 + (i_0_ + (i / 2 + Class127.anInt1737));
		}
		if ((i + Class127.anInt1722 ^ 0xffffffff)
		    >= (i_2_ ^ 0xffffffff)) {
		    if (i_2_ > -i + Class127.anInt1719) {
			i_2_ = Class127.anInt1719 + -i;
			i_9_
			    = -i_5_ + (Class127.anInt1719 + (-(i / 2) - i_0_));
		    }
		} else {
		    i_9_ = i / 2 + (i_0_ + Class127.anInt1722);
		    i_2_ = Class127.anInt1722;
		}
		int i_10_
		    = (0xffff
		       & (int) (32767.0
				* (Math.atan2((double) (-arg3.anInt4428
							+ i_1_),
					      (double) (i_2_
							+ -arg3.anInt4429))
				   / 3.141592653589793)));
		class152.method2209((float) i_1_ + (float) i / 2.0F,
				    (float) i_2_ + (float) i / 2.0F, 4096,
				    i_10_);
		int i_11_ = -2;
		int i_12_ = -2;
		int i_13_ = -2;
		int i_14_ = -2;
		if (arg2.aString1235 != null) {
		    i_11_ = -5 + (-(i_4_ / 2) + i_8_);
		    i_12_ = i_9_;
		    i_13_ = i_11_ + (i_4_ - -10);
		    i_14_ = 3 + (Class67.aClass140_912.method2127() * i_3_
				 + i_12_);
		    if ((arg2.anInt1254 ^ 0xffffffff) != -1)
			arg0.method1201(i_13_ + -i_11_, i_14_ + -i_12_, i_11_,
					i_12_, arg2.anInt1254, -92);
		    if ((arg2.anInt1257 ^ 0xffffffff) != -1)
			arg0.method1262(-i_12_ + i_14_, i_11_, -i_11_ + i_13_,
					false, i_12_, arg2.anInt1257);
		    for (int i_15_ = 0;
			 (i_3_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			String string = Class1_Sub2.aStringArray3509[i_15_];
			if ((-1 + i_3_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff))
			    string = string.substring(0, -4 + string.length());
			Class67.aClass140_912.method2133(arg0, string, i_8_,
							 i_9_, arg2.anInt1232,
							 true);
			i_9_ += Class67.aClass140_912.method2127();
		    }
		}
		if (arg1 != arg2.anInt1266 || arg2.aString1235 != null) {
		    i >>= 1;
		    Class131_Sub42 class131_sub42 = new Class131_Sub42(arg3);
		    class131_sub42.anInt4681 = i_2_ + -i;
		    class131_sub42.anInt4684 = -i + i_1_;
		    class131_sub42.anInt4687 = i_1_ + i;
		    class131_sub42.anInt4682 = i_13_;
		    class131_sub42.anInt4680 = i_14_;
		    class131_sub42.anInt4679 = i_12_;
		    class131_sub42.anInt4678 = i_11_;
		    class131_sub42.anInt4690 = i_2_ - -i;
		    Class74.aClass119_1011.method1018((byte) -128,
						      class131_sub42);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("nc.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method1107(Stream arg0, SignLink arg1, int arg2,
				  byte arg3) {
	try {
	    anInt1700++;
	    Class131_Sub7 class131_sub7 = new Class131_Sub7();
	    class131_sub7.anInt4174 = arg0.readUnsignedByte(114);
	    class131_sub7.anInt4172 = arg0.readUnsignedInt(-2);
	    class131_sub7.anIntArray4170 = new int[class131_sub7.anInt4174];
	    if (arg3 < 58)
		aString1699 = null;
	    class131_sub7.aClass139Array4179
		= new Class139[class131_sub7.anInt4174];
	    class131_sub7.anIntArray4181 = new int[class131_sub7.anInt4174];
	    class131_sub7.anIntArray4167 = new int[class131_sub7.anInt4174];
	    class131_sub7.aClass139Array4177
		= new Class139[class131_sub7.anInt4174];
	    class131_sub7.aByteArrayArrayArray4166
		= new byte[class131_sub7.anInt4174][][];
	    for (int i = 0; i < class131_sub7.anInt4174; i++) {
		try {
		    int i_16_ = arg0.readUnsignedByte(-107);
		    if (i_16_ == 0 || i_16_ == 1 || i_16_ == 2) {
			String string = arg0.readString(false);
			String string_17_ = arg0.readString(false);
			int i_18_ = 0;
			if (i_16_ == 1)
			    i_18_ = arg0.readUnsignedInt(-2);
			class131_sub7.anIntArray4167[i] = i_16_;
			class131_sub7.anIntArray4181[i] = i_18_;
			class131_sub7.aClass139Array4179[i]
			    = arg1.method2708((byte) 81, string_17_,
					      Class131_Sub41_Sub2
						  .method1934(false, string));
		    } else if (i_16_ == 3 || i_16_ == 4) {
			String string = arg0.readString(false);
			String string_19_ = arg0.readString(false);
			int i_20_ = arg0.readUnsignedByte(-82);
			String[] strings = new String[i_20_];
			for (int i_21_ = 0;
			     (i_21_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
			     i_21_++)
			    strings[i_21_] = arg0.readString(false);
			byte[][] is = new byte[i_20_][];
			if ((i_16_ ^ 0xffffffff) == -4) {
			    for (int i_22_ = 0;
				 (i_22_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff);
				 i_22_++) {
				int i_23_ = arg0.readUnsignedInt(-2);
				is[i_22_] = new byte[i_23_];
				arg0.method1768(0, i_23_, (byte) -39,
						is[i_22_]);
			    }
			}
			class131_sub7.anIntArray4167[i] = i_16_;
			Class[] var_classes = new Class[i_20_];
			for (int i_24_ = 0;
			     (i_20_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
			     i_24_++)
			    var_classes[i_24_]
				= Class131_Sub41_Sub2
				      .method1934(false, strings[i_24_]);
			class131_sub7.aClass139Array4177[i]
			    = arg1.method2690(string_19_, var_classes, -82,
					      Class131_Sub41_Sub2
						  .method1934(false, string));
			class131_sub7.aByteArrayArrayArray4166[i] = is;
		    }
		} catch (ClassNotFoundException classnotfoundexception) {
		    class131_sub7.anIntArray4170[i] = -1;
		} catch (SecurityException securityexception) {
		    class131_sub7.anIntArray4170[i] = -2;
		} catch (NullPointerException nullpointerexception) {
		    class131_sub7.anIntArray4170[i] = -3;
		} catch (Exception exception) {
		    class131_sub7.anIntArray4170[i] = -4;
		} catch (Throwable throwable) {
		    class131_sub7.anIntArray4170[i] = -5;
		}
	    }
	    Class59.aClass119_772.method1018((byte) -126, class131_sub7);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nc.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static boolean method1108(byte arg0, int arg1) {
	try {
	    anInt1697++;
	    if (Class67.aBooleanArray913[arg1])
		return true;
	    if (!Class150.aClass158_1994.method2367(arg1, (byte) 42))
		return false;
	    int i = Class150.aClass158_1994.method2368(arg1, (byte) -72);
	    if (i == 0) {
		Class67.aBooleanArray913[arg1] = true;
		return true;
	    }
	    if (Class131_Sub2_Sub9.aClass173ArrayArray5684[arg1] == null)
		Class131_Sub2_Sub9.aClass173ArrayArray5684[arg1]
		    = new Class173[i];
	    if (arg0 != -92)
		aString1702 = null;
	    for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_25_++) {
		if (Class131_Sub2_Sub9.aClass173ArrayArray5684[arg1][i_25_]
		    == null) {
		    byte[] is
			= Class150.aClass158_1994.method2364(i_25_, arg1, 0);
		    if (is != null) {
			Class173 class173
			    = (Class131_Sub2_Sub9.aClass173ArrayArray5684
				   [arg1][i_25_]
			       = new Class173());
			class173.anInt2455 = i_25_ + (arg1 << 1597590704);
			if (is[0] != -1)
			    class173.method2453(new Stream(is),
						arg0 + -9688);
			else
			    class173.method2459(new Stream(is), 65535);
		    }
		}
	    }
	    Class67.aBooleanArray913[arg1] = true;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nc.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1109(byte arg0) {
	aClass201_1689 = null;
	aString1699 = null;
	aString1702 = null;
	anImage1701 = null;
	if (arg0 != -65)
	    aString1699 = null;
    }
}
