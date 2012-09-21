/* Class131_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

public abstract class Class131_Sub2 extends Class131
{
    public static int anInt4076;
    public static int anInt4077;
    public static int anInt4078;
    public static int[] anIntArray4079;
    public static int anInt4080;
    public static int anInt4081;
    public static int anInt4082;
    public static int anInt4083;
    public static int anInt4084;
    public static int anInt4085;
    public static int anInt4086;
    public Class200 aClass200_4087;
    public static int anInt4088;
    public static int anInt4089;
    public int anInt4090;
    public static int anInt4091;
    public static int anInt4092;
    public boolean aBoolean4093;
    public static int anInt4094;
    public static int anInt4095;
    public static volatile boolean aBoolean4096 = false;
    public Class59 aClass59_4097;
    public static Class214 aClass214_4098;
    public static int anInt4099;
    public static int anInt4100;
    public Class131_Sub2[] aClass131_Sub2Array4101;
    public static int anInt4102;
    public static String aString4103;
    public static int anInt4104;
    
    public int method1454(int arg0) {
	try {
	    anInt4099++;
	    if (arg0 != -3)
		return -51;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ak.V(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt4077++;
	if (arg1 != -49)
	    method1466(-38, 16);
    }
    
    public int method1456(byte arg0) {
	try {
	    anInt4084++;
	    if (arg0 < 96)
		return -75;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ak.T(" + arg0 + ')');
	}
    }
    
    public static void method1457(byte arg0) {
	anInt4082++;
	if (Class74.aFrame1014 == null) {
	    int i = Class71.anInt946;
	    int i_0_ = Class57.anInt750;
	    if (arg0 != 106)
		aString4103 = null;
	    int i_1_
		= -i + (Class166.anInt2204 + -Class131_Sub1_Sub1.anInt5499);
	    int i_2_
		= Class131_Sub41_Sub15.anInt6355 - Class218.anInt3201 + -i_0_;
	    do {
		if (i > 0 || (i_1_ ^ 0xffffffff) < -1 || i_0_ > 0
		    || (i_2_ ^ 0xffffffff) < -1) {
		    try {
			java.awt.Container container;
			if (Class158.aFrame2095 == null)
			    container
				= Class23_Sub4.aSignLink_3734.anApplet2883;
			else
			    container = Class158.aFrame2095;
			int i_3_ = 0;
			int i_4_ = 0;
			if (container == Class158.aFrame2095) {
			    Insets insets = Class158.aFrame2095.getInsets();
			    i_4_ = insets.top;
			    i_3_ = insets.left;
			}
			Graphics graphics = container.getGraphics();
			graphics.setColor(Color.black);
			if (i > 0)
			    graphics.fillRect(i_3_, i_4_, i,
					      Class131_Sub41_Sub15.anInt6355);
			if ((i_0_ ^ 0xffffffff) < -1)
			    graphics.fillRect(i_3_, i_4_, Class166.anInt2204,
					      i_0_);
			if (i_1_ > 0)
			    graphics.fillRect((-i_1_ + Class166.anInt2204
					       + i_3_),
					      i_4_, i_1_,
					      Class131_Sub41_Sub15.anInt6355);
			if (i_2_ <= 0)
			    break;
			graphics.fillRect(i_3_,
					  (Class131_Sub41_Sub15.anInt6355
					   + i_4_ + -i_2_),
					  Class166.anInt2204, i_2_);
		    } catch (Exception exception) {
			break;
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    public static void method1458(int arg0, boolean arg1) {
	Class76.anInt1039++;
	Class93.aClass131_Sub15_Sub2_1226.createPacket(91);
	anInt4100++;
	for (Class131_Sub33 class131_sub33
		 = (Class131_Sub33) Class83.aClass180_1096.method2520(0);
	     class131_sub33 != null;
	     class131_sub33
		 = (Class131_Sub33) Class83.aClass180_1096.method2518(0)) {
	    if (!class131_sub33.method1352(true)) {
		class131_sub33
		    = (Class131_Sub33) Class83.aClass180_1096.method2520(arg0);
		if (class131_sub33 == null)
		    break;
	    }
	    if (class131_sub33.anInt4555 == 0)
		Class204.method2730(true, arg0 ^ 0x6461, class131_sub33, arg1);
	}
	if (Class164.aClass173_2193 != null) {
	    Class23_Sub4_Sub4.method383(-89, Class164.aClass173_2193);
	    Class164.aClass173_2193 = null;
	}
    }
    
    public int[] method1459(int arg0, byte arg1, int arg2) {
	try {
	    if (arg1 != -40)
		return null;
	    anInt4092++;
	    if (!aClass131_Sub2Array4101[arg0].aBoolean4093)
		return aClass131_Sub2Array4101[arg0].method1462(arg2, 0)[0];
	    return aClass131_Sub2Array4101[arg0].method1466(arg1 + -11503,
							    arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.HA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1460(int arg0) {
	try {
	    if (arg0 != 15)
		method1469(null, 112);
	    anInt4080++;
	    if (aBoolean4093) {
		aClass200_4087.method2716((byte) -112);
		aClass200_4087 = null;
	    } else {
		aClass59_4097.method646(0);
		aClass59_4097 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ak.Q(" + arg0 + ')');
	}
    }
    
    public void method1461(int arg0, int arg1, int arg2) {
	try {
	    anInt4088++;
	    int i = -46 % ((-29 - arg0) / 63);
	    int i_5_ = (anInt4090 ^ 0xffffffff) == -256 ? arg1 : anInt4090;
	    if (aBoolean4093)
		aClass200_4087 = new Class200(i_5_, arg1, arg2);
	    else
		aClass59_4097 = new Class59(i_5_, arg1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.W(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    if (arg1 != 0)
		aClass131_Sub2Array4101 = null;
	    anInt4083++;
	    throw new IllegalStateException
		      ("This operation does not have a colour output");
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[][] method1463(int arg0, byte arg1, int arg2) {
	try {
	    if (arg1 < 114)
		aString4103 = null;
	    anInt4102++;
	    if (!aClass131_Sub2Array4101[arg0].aBoolean4093)
		return aClass131_Sub2Array4101[arg0].method1462(arg2, 0);
	    int[] is = aClass131_Sub2Array4101[arg0].method1466(-11543, arg2);
	    int[][] is_6_ = new int[3][];
	    is_6_[0] = is;
	    is_6_[2] = is;
	    is_6_[1] = is;
	    return is_6_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.PA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1464(byte arg0) {
	anIntArray4079 = null;
	aClass214_4098 = null;
	aString4103 = null;
	if (arg0 > -71)
	    aBoolean4096 = false;
    }
    
    public static Class173 method1465(byte arg0, Class173 arg1) {
	try {
	    int i = -39 / ((-68 - arg0) / 52);
	    anInt4085++;
	    Class173 class173 = client.method53(arg1);
	    if (class173 == null)
		class173 = arg1.aClass173_2345;
	    return class173;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.JA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    if (arg0 != -11543)
		anIntArray4079 = null;
	    anInt4091++;
	    throw new IllegalStateException
		      ("This operation does not have a monochrome output");
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1467(Class130 arg0, int arg1) {
	try {
	    anInt4078++;
	    if (((Class147.anInt1946 ^ 0xffffffff) <= -3
		 || Class131_Sub1_Sub4.anInt5546 != 0 || Class154.aBoolean2047)
		&& arg1 == -25084) {
		String string;
		if ((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff) == -2
		    && (Class147.anInt1946 ^ 0xffffffff) > -3)
		    string = (Class158.aString2090 + Class203.aString2966
			      + Class148.aString1979 + " ->");
		else if (Class154.aBoolean2047 && Class147.anInt1946 < 2)
		    string = (Class131_Sub41_Sub2.aString6191
			      + Class203.aString2966 + Class112.aString1453
			      + " ->");
		else if (!Class209.aBoolean3044
			 || !Class131_Sub2_Sub39.aBooleanArray6080[81]
			 || Class147.anInt1946 <= 2) {
		    Class131_Sub21 class131_sub21
			= (Class131_Sub21) (Class66.aClass119_843
					    .aClass131_1553.aClass131_1786);
		    string = client.method64(arg1 + 24968, class131_sub21);
		    int[] is = null;
		    if (!Class85.method807((byte) 111,
					   class131_sub21.anInt4442)) {
			if (!Class23_Sub3.method319((byte) 45, (class131_sub21
								.anInt4442))) {
			    if (Class1_Sub2.method99(class131_sub21.anInt4442,
						     (byte) -104)) {
				if (class131_sub21.anInt4442 != 1009)
				    is = (Class55.method612
					  ((int) (0x7fffffffL
						  & (class131_sub21.aLong4437
						     >>> 1971046176)),
					   114)
					  .anIntArray2655);
				else
				    is = (Class55.method612
					  ((int) class131_sub21.aLong4437, 124)
					  .anIntArray2655);
			    }
			} else {
			    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				= (Class23_Sub4_Sub2
				   .aClass23_Sub4_Sub1_Sub1Array5379
				   [(int) class131_sub21.aLong4437]);
			    if (class23_sub4_sub1_sub1 != null)
				is = (class23_sub4_sub1_sub1.aClass66_6474
				      .anIntArray885);
			}
		    } else
			is = (Class131_Sub19.method1808
			      ((int) class131_sub21.aLong4437, false)
			      .anIntArray336);
		    if (is != null)
			string += Class75.method762(arg1 ^ ~0x618c, is);
		} else
		    string
			= client.method64(-47, ((Class131_Sub21)
						(Class66.aClass119_843
						 .aClass131_1553.aClass131_1786
						 .aClass131_1786)));
		if (Class147.anInt1946 > 2)
		    string += ("<col=ffffff> / " + (Class147.anInt1946 + -2)
			       + Class131_Sub2_Sub15.aString5773);
		if (Class193.aClass173_2836 == null) {
		    if (Class77.aClass173_1044 != null
			&& Class126.anInt1696 == 0) {
			int i = (Class93.aClass44_1222.method540
				 (Class39.aRandom514, 16777215, true,
				  Class131_Sub2_Sub33.anInt6026,
				  4 + Class88.anInt1169,
				  Class167.aClass152Array2226, 0,
				  16 + Class219.anInt3205, string,
				  Class213.anIntArray3120));
			Class12.method213(4 + Class88.anInt1169, 16,
					  Class219.anInt3205,
					  (Class89.aClass55_3259
					       .method621((byte) 117, string)
					   + i),
					  -126);
		    }
		} else {
		    Class44 class44
			= Class193.aClass173_2836.method2467(false, arg0);
		    if (class44 == null)
			class44 = Class93.aClass44_1222;
		    class44.method530(Class193.aClass173_2836.anInt2437,
				      Class193.aClass173_2836.anInt2297,
				      Class78.anInt1052,
				      Class193.aClass173_2836.anInt2411,
				      string, Class103.anInt1337,
				      Class39.aRandom514,
				      Class131_Sub14.anIntArray4293, 31,
				      Class193.aClass173_2836.anInt2312,
				      Class193.aClass173_2836.anInt2325,
				      Class131_Sub2_Sub33.anInt6026,
				      Class193.aClass173_2836.anInt2467,
				      Class213.anIntArray3120,
				      Class167.aClass152Array2226);
		    Class12.method213(Class131_Sub14.anIntArray4293[0],
				      Class131_Sub14.anIntArray4293[3],
				      Class131_Sub14.anIntArray4293[1],
				      Class131_Sub14.anIntArray4293[2], -93);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.OA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method1468(int arg0, byte arg1, int arg2) {
	try {
	    anInt4095++;
	    if (arg1 != -80)
		aString4103 = null;
	    if (arg0 == -1)
		return 12345678;
	    arg2 = arg2 * (0x7f & arg0) >> 1417844839;
	    if ((arg2 ^ 0xffffffff) > -3)
		arg2 = 2;
	    else if ((arg2 ^ 0xffffffff) < -127)
		arg2 = 126;
	    return arg2 + (arg0 & 0xff80);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.NA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1469(Class158 arg0, int arg1) {
	Class153_Sub1.aClass158_4756 = arg0;
	anInt4086++;
	Class153_Sub1.aClass158_4756.method2368(35, (byte) -72);
	if (arg1 != 6193)
	    method1464((byte) -115);
    }
    
    public static void method1470(byte arg0, int arg1) {
	try {
	    anInt4081++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(7, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(-119);
	    int i = -59 / ((arg0 - 32) / 54);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.KA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1471(int arg0) {
	try {
	    if (arg0 != 0)
		aClass59_4097 = null;
	    anInt4094++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ak.J(" + arg0 + ')');
	}
    }
    
    public Class131_Sub2(int arg0, boolean arg1) {
	try {
	    aBoolean4093 = arg1;
	    aClass131_Sub2Array4101 = new Class131_Sub2[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ak.<init>(" + arg0 + ','
						 + arg1 + ')'));
	}
    }
    
    static {
	anIntArray4079
	    = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047,
			  4095, 8191, 16383, 32767, 65535, 131071, 262143,
			  524287, 1048575, 2097151, 4194303, 8388607, 16777215,
			  33554431, 67108863, 134217727, 268435455, 536870911,
			  1073741823, 2147483647, -1 };
	aClass214_4098 = new Class214(64);
	aString4103 = " has logged out.";
	anInt4104 = 0;
    }
}
