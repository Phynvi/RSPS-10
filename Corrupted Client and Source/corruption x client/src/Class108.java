/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class108
{
    public boolean aBoolean1404;
    public static int[] anIntArray1405
	= { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    public static int anInt1406;
    public static int anInt1407;
    public int anInt1408;
    public int anInt1409 = -1;
    public int anInt1410;
    public int anInt1411;
    public static int anInt1412;
    public int anInt1413;
    public static int anInt1414;
    public static Class158 aClass158_1415;
    public int anInt1416;
    public static int anInt1417;
    public int anInt1418;
    public static int anInt1419;
    public static byte[][] aByteArrayArray1420;
    
    public void method926(int arg0, int arg1, int arg2, Stream arg3) {
	if (arg1 == 1) {
	    anInt1418 = arg3.read3Bytes(false);
	    method929(127, anInt1418);
	} else if (arg1 != 2) {
	    if ((arg1 ^ 0xffffffff) != -4) {
		if (arg1 == 4)
		    aBoolean1404 = false;
	    } else
		anInt1416 = arg3.readUnsignedShort(8104);
	} else {
	    anInt1409 = arg3.readUnsignedShort(8104);
	    if ((anInt1409 ^ 0xffffffff) == -65536)
		anInt1409 = -1;
	}
	anInt1419++;
	if (arg2 != 2)
	    aBoolean1404 = true;
    }
    
    public static String method927(int arg0, int arg1) {
	try {
	    anInt1406++;
	    int i = -101 % ((20 - arg0) / 38);
	    if ((arg1 ^ 0xffffffff) > -1000000000)
		return Integer.toString(arg1);
	    return "*";
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lf.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method928(Stream arg0, int arg1, boolean arg2) {
	for (;;) {
	    int i = arg0.readUnsignedByte(69);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method926(arg1, i, 2, arg0);
	}
	anInt1414++;
	if (arg2 != true)
	    anInt1411 = 52;
    }
    
    public void method929(int arg0, int arg1) {
	try {
	    anInt1412++;
	    double d = (double) (arg1 >> 1357946736 & 0xff) / 256.0;
	    double d_0_ = (double) ((arg1 & 0xff8f) >> -449050008) / 256.0;
	    double d_1_ = (double) (0xff & arg1) / 256.0;
	    double d_2_ = d;
	    if (d_0_ < d_2_)
		d_2_ = d_0_;
	    if (d_2_ > d_1_)
		d_2_ = d_1_;
	    double d_3_ = d;
	    if (d_3_ < d_0_)
		d_3_ = d_0_;
	    if (d_3_ < d_1_)
		d_3_ = d_1_;
	    if (arg0 != 127)
		method928(null, 68, true);
	    double d_4_ = 0.0;
	    double d_5_ = 0.0;
	    double d_6_ = (d_3_ + d_2_) / 2.0;
	    if (d_3_ != d_2_) {
		if (d_6_ < 0.5)
		    d_5_ = (d_3_ - d_2_) / (d_3_ + d_2_);
		if (d == d_3_)
		    d_4_ = (-d_1_ + d_0_) / (d_3_ - d_2_);
		else if (d_0_ == d_3_)
		    d_4_ = 2.0 + (-d + d_1_) / (d_3_ - d_2_);
		else if (d_1_ == d_3_)
		    d_4_ = 4.0 + (d - d_0_) / (d_3_ - d_2_);
		if (d_6_ >= 0.5)
		    d_5_ = (-d_2_ + d_3_) / (-d_2_ + (2.0 - d_3_));
	    }
	    anInt1410 = (int) (d_5_ * 256.0);
	    anInt1411 = (int) (256.0 * d_6_);
	    d_4_ /= 6.0;
	    if (d_6_ > 0.5)
		anInt1413 = (int) (512.0 * (d_5_ * (1.0 - d_6_)));
	    else
		anInt1413 = (int) (d_5_ * d_6_ * 512.0);
	    if (anInt1411 >= 0) {
		if (anInt1411 > 255)
		    anInt1411 = 255;
	    } else
		anInt1411 = 0;
	    if ((anInt1410 ^ 0xffffffff) > -1)
		anInt1410 = 0;
	    else if (anInt1410 > 255)
		anInt1410 = 255;
	    if (anInt1413 < 1)
		anInt1413 = 1;
	    anInt1408 = (int) ((double) anInt1413 * d_4_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("lf.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method930(int arg0, SignLink arg1) {
	anInt1417++;
	Class134.anInt1809 = 3;
	Class130.method1254(true, -73);
	Class131_Sub41_Sub21.anInt6442 = 0;
	Class103.aBoolean1349 = true;
	Class91.aBoolean1180 = true;
	Class171.anInt2284 = 1;
	Class23_Sub4_Sub2.anInt5380 = 127;
	Class131_Sub8_Sub1.aBoolean6089 = true;
	InputStream_Sub1.anInt55 = 127;
	Class131_Sub2_Sub16.anInt5779 = 2;
	Class135.aBoolean1818 = true;
	Class14.anInt163 = 0;
	Class23_Sub1_Sub2.aBoolean5159 = true;
	Class58.aBoolean765 = true;
	Class131_Sub33.aBoolean4557 = true;
	Class183.aBoolean2613 = true;
	Class167.aBoolean2235 = true;
	Class90.anInt1176 = 0;
	Class121.aBoolean1588 = true;
	Class212.anInt3112 = 255;
	Class131_Sub7.anInt4165 = 0;
	if (Class1_Sub4.anInt3554 >= 96)
	    Class131_Sub41_Sub19.method2060(2, arg0 + -2);
	else
	    Class131_Sub41_Sub19.method2060(0, 0);
	Class91.anInt1184 = 2;
	Class40.aBoolean533 = true;
	Class131_Sub41_Sub7.aBoolean6255 = false;
	Class141.anInt1876 = 0;
	Class131_Sub13.aBoolean4268 = true;
	Class46_Sub1.anInt3787 = 0;
	Class131_Sub2_Sub10_Sub1.anInt6537 = arg0;
	Class177.aBoolean2530 = false;
	Class131_Sub6.aBoolean4143 = false;
	Class8 class8 = null;
	try {
	    Class139 class139 = arg1.method2681(-1);
	    while ((class139.anInt1864 ^ 0xffffffff) == -1)
		Class187.method2575(-31, 1L);
	    if (class139.anInt1864 == 1) {
		class8 = (Class8) class139.anObject1866;
		byte[] is = new byte[(int) class8.method172(arg0 ^ ~0x61)];
		int i;
		for (int i_7_ = 0;
		     (is.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
		     i_7_ += i) {
		    i = class8.method173(-i_7_ + is.length, is, i_7_, 0);
		    if ((i ^ 0xffffffff) == 0)
			throw new IOException("EOF");
		}
		Class131_Sub9.method1686(new Stream(is), (byte) -104);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (class8 == null)
		    break;
		class8.method170(1);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method931(byte arg0) {
	aByteArrayArray1420 = null;
	anIntArray1405 = null;
	aClass158_1415 = null;
	if (arg0 != 39)
	    method932(-75, -104, -11, -2, -31);
    }
    
    public static void method932(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if (arg0 == 7787) {
	    anInt1407++;
	    if ((Class149.anInt1988 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
		&& (Class115.anInt1477 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)) {
		arg4 = Class180.method2517(-15543, Class125.anInt1629,
					   Class116.anInt1494, arg4);
		arg2 = Class180.method2517(arg0 + -23330, Class125.anInt1629,
					   Class116.anInt1494, arg2);
		Class131_Sub41_Sub2.method1930(arg2, arg1, arg4, arg3, false);
	    }
	}
    }
    
    public Class108() {
	aBoolean1404 = true;
	anInt1418 = 0;
	anInt1416 = 128;
    }
}
