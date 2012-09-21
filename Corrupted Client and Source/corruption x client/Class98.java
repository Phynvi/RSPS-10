/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class98
{
    public static int anInt1284;
    public int anInt1285 = 8;
    public static int anInt1286;
    public int anInt1287;
    public int anInt1288;
    public boolean aBoolean1289;
    public static float aFloat1290;
    public int anInt1291;
    public static int anInt1292;
    public int anInt1293;
    public static int anInt1294;
    public static Class158 aClass158_1295;
    public static Class158 aClass158_1296;
    public static int anInt1297;
    public static int anInt1298;
    public int anInt1299;
    public static int anInt1300;
    public int anInt1301 = 16777215;
    public static int anInt1302 = 0;
    public static int anInt1303;
    public static int anInt1304 = 0;
    public static Rectangle[] aRectangleArray1305 = new Rectangle[100];
    public static int anInt1306;
    public static Class209 aClass209_1307;
    
    public static boolean method864(int arg0) {
	try {
	    anInt1297++;
	    if (arg0 != 17762)
		method867(null, (byte) -25);
	    if (Class147.anInt1946 <= 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ki.E(" + arg0 + ')');
	}
    }
    
    public static void method865(byte arg0) {
	try {
	    aClass158_1296 = null;
	    aClass209_1307 = null;
	    if (arg0 > 114) {
		aClass158_1295 = null;
		aRectangleArray1305 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ki.A(" + arg0 + ')');
	}
    }
    
    public void method866(int arg0, Stream arg1, int arg2,
			  boolean arg3) {
	try {
	    if (arg2 == 1)
		anInt1285 = arg1.readUnsignedShort(8104);
	    else if ((arg2 ^ 0xffffffff) != -3) {
		if ((arg2 ^ 0xffffffff) == -4) {
		    anInt1287 = arg1.readSignedShort(1625554944);
		    anInt1293 = arg1.readSignedShort(1625554944);
		    anInt1291 = arg1.readSignedShort(1625554944);
		} else if (arg2 == 4)
		    anInt1299 = arg1.readUnsignedByte(102);
		else if (arg2 != 5) {
		    if ((arg2 ^ 0xffffffff) == -7)
			anInt1301 = arg1.read3Bytes(false);
		} else
		    anInt1288 = arg1.readUnsignedShort(8104);
	    } else
		aBoolean1289 = true;
	    if (arg3 != false)
		aFloat1290 = -0.44831973F;
	    anInt1300++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ki.H(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static String[] method867(String[] arg0, byte arg1) {
	try {
	    anInt1284++;
	    String[] strings = new String[5];
	    int i = 31 / ((31 - arg1) / 47);
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -6; i_0_++) {
		strings[i_0_] = String.valueOf(i_0_) + ": ";
		if (arg0 != null && arg0[i_0_] != null)
		    strings[i_0_] = strings[i_0_] + arg0[i_0_];
	    }
	    return strings;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ki.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method868(int arg0) {
	try {
	    Class23_Sub2_Sub1.aClass214_4976.method2783(-128);
	    if (arg0 >= -112)
		aClass209_1307 = null;
	    anInt1292++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ki.B(" + arg0 + ')');
	}
    }
    
    public void method869(int arg0, Stream arg1, byte arg2) {
	try {
	    for (;;) {
		int i = arg1.readUnsignedByte(-59);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method866(arg0, arg1, i, false);
	    }
	    int i = -54 % ((24 - arg2) / 56);
	    anInt1286++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ki.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method870(int arg0, Class130 arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	arg1.method1188(arg5, arg2, arg3 + arg5, arg2 - -arg4);
	anInt1298++;
	arg1.method1201(arg3, arg4, arg5, arg2, -16777216, -116);
	if (Class131_Sub2_Sub36.anInt6049 >= 100) {
	    float f = (float) Class127.anInt1730 / (float) Class127.anInt1716;
	    int i = arg3;
	    int i_1_ = arg4;
	    if (!(f < 1.0F))
		i = (int) ((float) arg4 / f);
	    else
		i_1_ = (int) (f * (float) arg3);
	    arg5 += (-i + arg3) / 2;
	    arg2 += (arg4 - i_1_) / 2;
	    if (InputStream_Sub1.aClass152_51 == null
		|| ((arg3 ^ 0xffffffff)
		    != (InputStream_Sub1.aClass152_51.method2206()
			^ 0xffffffff))
		|| InputStream_Sub1.aClass152_51.method2204() != arg4) {
		Class127.method1123(Class127.anInt1725,
				    Class127.anInt1730 + Class127.anInt1728,
				    Class127.anInt1725 - -Class127.anInt1716,
				    Class127.anInt1728, arg5, arg2, i + arg5,
				    i_1_ + arg2);
		Class127.method1118(arg1);
		InputStream_Sub1.aClass152_51
		    = arg1.method1263(arg5, arg2, i, i_1_, false);
	    }
	    InputStream_Sub1.aClass152_51.method2211(arg5, arg2);
	    int i_2_ = i * Class190.anInt2813 / Class127.anInt1716;
	    int i_3_ = -33 % ((arg0 - -63) / 37);
	    int i_4_ = i_1_ * Class12.anInt131 / Class127.anInt1730;
	    int i_5_
		= Class131_Sub41.anInt4673 * i / Class127.anInt1716 + arg5;
	    int i_6_
		= (i_1_ + arg2
		   + (-(i_1_ * client.anInt3485 / Class127.anInt1730) - i_4_));
	    int i_7_ = -1996554240;
	    if (Class126.anInt1696 == 1)
		i_7_ = -1996488705;
	    arg1.method1173(i_5_, i_6_, i_2_, i_4_, i_7_, 1);
	    arg1.method1168(i_5_, i_6_, i_2_, i_4_, i_7_, 0);
	    if ((Class131_Sub7.anInt4173 ^ 0xffffffff) < -1) {
		int i_8_;
		if (Class151.anInt2019 <= 50)
		    i_8_ = Class151.anInt2019 * 5;
		else
		    i_8_ = 5 * (100 - Class151.anInt2019);
		for (Class131_Sub20 class131_sub20
			 = ((Class131_Sub20)
			    Class127.aClass119_1715.method1007(0));
		     class131_sub20 != null;
		     class131_sub20 = (Class131_Sub20) Class127
							   .aClass119_1715
							   .method1014(0)) {
		    Class94 class94
			= Class131_Sub2_Sub32
			      .method1626(class131_sub20.anInt4427, (byte) 1);
		    if (Class220.method2824(class94, -1225)) {
			if ((class131_sub20.anInt4427 ^ 0xffffffff)
			    == (Class165.anInt2200 ^ 0xffffffff)) {
			    int i_9_ = ((class131_sub20.anInt4419 * i
					 / Class127.anInt1716)
					+ arg5);
			    int i_10_ = arg2 - -(i_1_
						 * (-class131_sub20.anInt4426
						    + Class127.anInt1730)
						 / Class127.anInt1730);
			    arg1.method1201(4, 4, i_9_ - 2, -2 + i_10_,
					    0xffff00 | i_8_ << -1322077288,
					    127);
			} else if (Class131_Sub41_Sub17.anInt6390 != -1
				   && ((class94.anInt1262 ^ 0xffffffff)
				       == (Class131_Sub41_Sub17.anInt6390
					   ^ 0xffffffff))) {
			    int i_11_ = ((class131_sub20.anInt4419 * i
					  / Class127.anInt1716)
					 + arg5);
			    int i_12_ = arg2 - -((-class131_sub20.anInt4426
						  + Class127.anInt1730)
						 * i_1_ / Class127.anInt1730);
			    arg1.method1201(4, 4, -2 + i_11_, i_12_ - 2,
					    i_8_ << -801098088 | 0xffff00,
					    120);
			}
		    }
		}
	    }
	}
    }
    
    public static int method871(Stream arg0, String arg1, int arg2) {
	try {
	    anInt1294++;
	    int i = arg0.offset;
	    byte[] is = OutputStream_Sub1.method88(arg1, (byte) -125);
	    if (arg2 != -1996488705)
		method868(23);
	    arg0.method1771(arg2 + 1996521473, is.length);
	    arg0.offset += (Class131_Sub41_Sub7.aClass75_6251.method766
			       (arg0.offset, arg2 ^ ~0x77000040, is.length,
				arg0.data, 0, is));
	    return arg0.offset + -i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ki.F("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    static {
	for (int i = 0; i < 100; i++)
	    aRectangleArray1305[i] = new Rectangle();
	anInt1306 = -1;
    }
}
