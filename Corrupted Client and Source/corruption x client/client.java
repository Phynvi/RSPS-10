/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.net.Socket;
import java.util.GregorianCalendar;

public class client extends Applet_Sub1
{
    public static int anInt3465;
    public static int anInt3466;
    public static volatile int anInt3467 = 0;
    public static int anInt3468;
    public static int anInt3469;
    public static Class215 aClass215_3470;
    public static int anInt3471;
    public static int anInt3472;
    public static int anInt3473;
    public static int anInt3474;
    public static int anInt3475;
    public static int anInt3476;
    public static int anInt3477;
    public static int anInt3478;
    public static int anInt3479;
    public static int anInt3480;
    public static int anInt3481;
    public static int anInt3482;
    public static int anInt3483;
    public static int anInt3484;
    public static int anInt3485;
    public static int anInt3486;
    public static int[][] anIntArrayArray3487 = new int[128][128];
    public static int anInt3488;
    public static int anInt3489;
    
	public static void sendMessage(String string) {
		System.out.println(string);
		
	}
    public static Class173 method53(Class173 arg0) {
	int i = method66(arg0).method1887(-114);
	if (i == 0)
	    return null;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    arg0 = Class190.method2615(arg0.anInt2456, -70);
	    if (arg0 == null)
		return null;
	}
	return arg0;
    }
    
    public static boolean method54(Class173 arg0) {
	if (Class23_Sub5.aBoolean3761) {
	    if (method66(arg0).anInt4601 != 0)
		return false;
	    if (arg0.anInt2470 == 0)
		return false;
	}
	return arg0.aBoolean2404;
    }
    
    public static void method55(byte arg0) {
	try {
	    if (arg0 == 0) {
		aClass215_3470 = null;
		anIntArrayArray3487 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.T(" + arg0 + ')');
	}
    }
    
    public void method56(int arg0) {
	anInt3473++;
	if (Class121_Sub3.anInt3994 < Class46.aClass179_640.anInt2566) {
	    if ((Class131_Sub2_Sub31.anInt6007 ^ 0xffffffff)
		== (Class43.anInt590 ^ 0xffffffff))
		Class131_Sub2_Sub31.anInt6007 = Class131_Sub14.anInt4288;
	    else
		Class131_Sub2_Sub31.anInt6007 = Class43.anInt590;
	    Class56.anInt743
		= 5 * (Class46.aClass179_640.anInt2566 * 50 + -50);
	    if (Class56.anInt743 > 3000)
		Class56.anInt743 = 3000;
	    if (Class46.aClass179_640.anInt2566 >= 2
		&& Class46.aClass179_640.anInt2568 == 6) {
		this.method47(1, "js5connect_outofdate");
		Class133.anInt1803 = 1000;
		return;
	    }
	    if (Class46.aClass179_640.anInt2566 >= 4
		&& Class46.aClass179_640.anInt2568 == -1) {
		this.method47(1, "js5crc");
		Class133.anInt1803 = 1000;
		return;
	    }
	    if (Class46.aClass179_640.anInt2566 >= 4
		&& (Class133.anInt1803 == 0
		    || (Class133.anInt1803 ^ 0xffffffff) == -6)) {
		if (Class46.aClass179_640.anInt2568 != 7
		    && (Class46.aClass179_640.anInt2568 ^ 0xffffffff) != -10) {
		    if ((Class46.aClass179_640.anInt2568 ^ 0xffffffff) < -1)
			this.method47(1, "js5connect");
		    else
			this.method47(1, "js5io");
		} else
		    this.method47(1, "js5connect_full");
		Class133.anInt1803 = 1000;
		return;
	    }
	}
	Class121_Sub3.anInt3994 = Class46.aClass179_640.anInt2566;
	if (Class56.anInt743 > 0)
	    Class56.anInt743--;
	else {
	    do {
		try {
		    if (Class131_Sub2_Sub29.anInt5971 == 0) {
			Class23_Sub2_Sub1.aClass139_4990
			    = (Class23_Sub4.aSignLink_3734.method2703
			       (Class191.aString2817, (byte) 125,
				Class131_Sub2_Sub31.anInt6007));
			Class131_Sub2_Sub29.anInt5971++;
		    }
		    int i = 19 % ((-48 - arg0) / 44);
		    if ((Class131_Sub2_Sub29.anInt5971 ^ 0xffffffff) == -2) {
			if ((Class23_Sub2_Sub1.aClass139_4990.anInt1864
			     ^ 0xffffffff)
			    == -3) {
			    method60(-81, 1000);
			    break;
			}
			if (Class23_Sub2_Sub1.aClass139_4990.anInt1864 == 1)
			    Class131_Sub2_Sub29.anInt5971++;
		    }
		    if (Class131_Sub2_Sub29.anInt5971 == 2) {
			Class131_Sub1_Sub1.aClass33_5474
			    = new Class33((Socket) (Class23_Sub2_Sub1
						    .aClass139_4990
						    .anObject1866),
					  Class23_Sub4.aSignLink_3734);
			Stream stream = new Stream(5);
			stream.writeByte(15);
			stream.writeInt(562);
			Class131_Sub1_Sub1.aClass33_5474.method454
			    (45, 5, 0, stream.data);
			Class131_Sub2_Sub29.anInt5971++;
			Class47.aLong646 = Class208.method2749(-3913);
		    }
		    if ((Class131_Sub2_Sub29.anInt5971 ^ 0xffffffff) == -4) {
			if ((Class133.anInt1803 ^ 0xffffffff) != -1
			    && (Class133.anInt1803 ^ 0xffffffff) != -6
			    && Class131_Sub1_Sub1.aClass33_5474
				   .method450((byte) 17) <= 0) {
			    if ((-Class47.aLong646 + Class208.method2749(-3913)
				 ^ 0xffffffffffffffffL)
				< -30001L) {
				method60(-108, 1001);
				break;
			    }
			} else {
			    int i_1_ = Class131_Sub1_Sub1.aClass33_5474
					   .method444(-1707);
			    if (i_1_ != 0) {
				method60(-112, i_1_);
				break;
			    }
			    Class131_Sub2_Sub29.anInt5971++;
			}
		    }
		    if ((Class131_Sub2_Sub29.anInt5971 ^ 0xffffffff) != -5)
			break;
		    boolean bool
			= ((Class133.anInt1803 ^ 0xffffffff) == -6
			   || (Class133.anInt1803 ^ 0xffffffff) == -11
			   || (Class133.anInt1803 ^ 0xffffffff) == -29);
		    Class46.aClass179_640.method2508(0,
						     (Class131_Sub1_Sub1
						      .aClass33_5474),
						     !bool);
		    Class131_Sub2_Sub29.anInt5971 = 0;
		    Class131_Sub1_Sub1.aClass33_5474 = null;
		    Class23_Sub2_Sub1.aClass139_4990 = null;
		} catch (java.io.IOException ioexception) {
		    method60(-119, 1002);
		    break;
		}
		break;
	    } while (false);
	}
    }
    
    public void method50(boolean arg0) {
	if (arg0 != true)
	    anInt3485 = 22;
	anInt3469++;
	Frame frame = new Frame("Jagex");
	frame.pack();
	frame.dispose();
	Class85.method812((byte) -116);
	Class131_Sub42.aClass88_4688
	    = new Class88(Class23_Sub4.aSignLink_3734);
	Class46.aClass179_640 = new Class179();
	if ((Class214.anInt3138 ^ 0xffffffff) != -1)
	    Class131_Sub41_Sub19.aByteArrayArray6412 = new byte[50][];
	Class108.method930(2, Class23_Sub4.aSignLink_3734);
	if (Class1_Sub7.anInt3581 == 0) {
	    Class131_Sub2_Sub7.aString5636 = this.getCodeBase().getHost();
	    Class91.anInt1183 = 443;
	    Class131_Sub41_Sub20.anInt6436 = 43594;
	} else if (Class1_Sub7.anInt3581 == 1) {
	    Class131_Sub2_Sub7.aString5636 = this.getCodeBase().getHost();
	    Class131_Sub41_Sub20.anInt6436 = Class93.anInt1227 + 40000;
	    Class91.anInt1183 = 50000 + Class93.anInt1227;
	} else if ((Class1_Sub7.anInt3581 ^ 0xffffffff) == -3) {
	    Class91.anInt1183 = Class93.anInt1227 + 50000;
	    Class131_Sub41_Sub20.anInt6436 = 43594;
	    Class131_Sub2_Sub7.aString5636 = "127.0.0.1";
	}
	Class131_Sub14.anInt4288 = Class91.anInt1183;
	Class147.anInt1960 = Class131_Sub41_Sub20.anInt6436;
	Class43.anInt590 = Class131_Sub41_Sub20.anInt6436;
	Class191.aString2817 = Class131_Sub2_Sub7.aString5636;
	Class131_Sub2_Sub31.anInt6007 = Class147.anInt1960;
	if (Class126.anInt1696 != 1) {
	    Class131_Sub41_Sub5.aShortArrayArray6233
		= Class131_Sub2_Sub32.aShortArrayArray6017;
	    Class63.aShortArrayArray800
		= Class131_Sub2_Sub39.aShortArrayArray6076;
	    Class5.aShortArray89 = Class103.aShortArray1348;
	    Class144.aShortArray1916 = Class131_Sub2_Sub3.aShortArray5590;
	} else {
	    Class131_Sub41_Sub5.aShortArrayArray6233
		= RuntimeException_Sub1.aShortArrayArray3236;
	    Class131_Sub41_Sub8.anInt6268 = 16777215;
	    Class131_Sub25.anInt4479 = 0;
	    Class5.aShortArray89 = Class72.aShortArray982;
	    Class144.aShortArray1916 = Class67.aShortArray904;
	    Class63.aShortArrayArray800 = Class75.aShortArrayArray1027;
	    Class209.aBoolean3044 = true;
	}
	Class159.aShortArray2123 = Class153_Sub2.aShortArray4777
	    = Class192.aShortArray2819 = Class160.aShortArray2132
	    = new short[256];
	if (SignLink.anInt2902 == 3)
	    Class110_Sub2.anInt3914 = Class93.anInt1227;
	Class131_Sub2_Sub30.method1618((byte) -91);
	Class131_Sub3.method1647(119, Class131_Sub2_Sub15.aCanvas5768);
	Class104.method910(-12951, Class131_Sub2_Sub15.aCanvas5768);
	Class164.aClass34_2189 = method57(34);
	if (Class164.aClass34_2189 != null)
	    Class164.aClass34_2189.method456((byte) -43,
					     Class131_Sub2_Sub15.aCanvas5768);
	Class1.anInt77 = SignLink.anInt2902;
	try {
	    if (Class23_Sub4.aSignLink_3734.aClass8_2892 != null) {
		PacketStream.aClass163_6136
		    = new Class163(Class23_Sub4.aSignLink_3734.aClass8_2892,
				   5200, 0);
		for (int i = 0; i < 29; i++)
		    Class164.aClass163Array2188[i]
			= new Class163((Class23_Sub4.aSignLink_3734
					.aClass8Array2888[i]),
				       6000, 0);
		Class183.aClass163_2616
		    = new Class163(Class23_Sub4.aSignLink_3734.aClass8_2885,
				   6000, 0);
		Class45.aClass85_621
		    = new Class85(255, PacketStream.aClass163_6136,
				  Class183.aClass163_2616, 500000);
		Class131_Sub14.aClass163_4286
		    = new Class163(Class23_Sub4.aSignLink_3734.aClass8_2884,
				   24, 0);
		Class23_Sub4.aSignLink_3734.aClass8Array2888 = null;
		Class23_Sub4.aSignLink_3734.aClass8_2892 = null;
		Class23_Sub4.aSignLink_3734.aClass8_2885 = null;
		Class23_Sub4.aSignLink_3734.aClass8_2884 = null;
	    }
	} catch (java.io.IOException ioexception) {
	    Class45.aClass85_621 = null;
	    Class131_Sub14.aClass163_4286 = null;
	    Class183.aClass163_2616 = null;
	    PacketStream.aClass163_6136 = null;
	}
	if ((Class1_Sub7.anInt3581 ^ 0xffffffff) != -1)
	    Class165.aBoolean2201 = false;
	if (Class126.anInt1696 == 0)
	    Class131_Sub41_Sub12.aString6306 = Class184.aString2624;
	else if (Class126.anInt1696 == 1)
	    Class131_Sub41_Sub12.aString6306 = Class19.aString225;
    }
    
    public static Class34 method57(int arg0) {
	try {
	    anInt3478++;
	    try {
		int i = 90 / ((-2 - arg0) / 36);
		return (Class34) Class.forName("Class34_Sub1").newInstance();
	    } catch (Throwable throwable) {
		return null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.IA(" + arg0 + ')');
	}
    }
    
    public static void method58() {
	for (int i = -1;
	     i < Class131_Sub38.anInt4618 + Class131_Sub41_Sub2.anInt6186;
	     i++) {
	    Class23_Sub4_Sub1 class23_sub4_sub1;
	    if (i < 0)
		class23_sub4_sub1 = Class166.aClass23_Sub4_Sub1_Sub2_2216;
	    else if (i < Class131_Sub38.anInt4618)
		class23_sub4_sub1 = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				     [Class148.anIntArray1983[i]]);
	    else
		class23_sub4_sub1
		    = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		       [(Class131_Sub41_Sub12.anIntArray6316
			 [i - Class131_Sub38.anInt4618])]);
	    if (class23_sub4_sub1.anInt5273 >= 0) {
		int i_2_ = class23_sub4_sub1.method335((byte) -96);
		if ((i_2_ & 0x1) == 0) {
		    if ((class23_sub4_sub1.anInt3733 & 0x7f) != 0
			|| (class23_sub4_sub1.anInt3747 & 0x7f) != 0)
			continue;
		} else if ((class23_sub4_sub1.anInt3733 & 0x7f) != 64
			   || (class23_sub4_sub1.anInt3747 & 0x7f) != 64)
		    continue;
		if (i_2_ == 1) {
		    int i_3_ = class23_sub4_sub1.anInt3733 >> 7;
		    int i_4_ = class23_sub4_sub1.anInt3747 >> 7;
		    if (class23_sub4_sub1.anInt5273
			> (Class131_Sub41_Sub19.anIntArrayArray6407[i_3_]
			   [i_4_])) {
			Class131_Sub41_Sub19.anIntArrayArray6407[i_3_][i_4_]
			    = class23_sub4_sub1.anInt5273;
			Class151.anIntArrayArray2025[i_3_][i_4_] = 1;
		    } else if (class23_sub4_sub1.anInt5273
			       == (Class131_Sub41_Sub19.anIntArrayArray6407
				   [i_3_][i_4_]))
			Class151.anIntArrayArray2025[i_3_][i_4_]++;
		} else {
		    int i_5_ = (i_2_ - 1) * 64 + 60;
		    int i_6_ = class23_sub4_sub1.anInt3733 - i_5_ >> 7;
		    int i_7_ = class23_sub4_sub1.anInt3747 - i_5_ >> 7;
		    int i_8_ = class23_sub4_sub1.anInt3733 + i_5_ >> 7;
		    int i_9_ = class23_sub4_sub1.anInt3747 + i_5_ >> 7;
		    for (int i_10_ = i_6_; i_10_ <= i_8_; i_10_++) {
			for (int i_11_ = i_7_; i_11_ <= i_9_; i_11_++) {
			    if (class23_sub4_sub1.anInt5273
				> (Class131_Sub41_Sub19.anIntArrayArray6407
				   [i_10_][i_11_])) {
				Class131_Sub41_Sub19.anIntArrayArray6407
				    [i_10_][i_11_]
				    = class23_sub4_sub1.anInt5273;
				Class151.anIntArrayArray2025[i_10_][i_11_] = 1;
			    } else if (class23_sub4_sub1.anInt5273
				       == (Class131_Sub41_Sub19
					   .anIntArrayArray6407[i_10_][i_11_]))
				Class151.anIntArrayArray2025[i_10_][i_11_]++;
			}
		    }
		}
	    }
	}
    }
    
    public void method59(byte arg0) {
	Class22.anInt246 = 0;
	anInt3488++;
	while (Class138_Sub1.method2123(-71) && Class22.anInt246 < 128) {
	    if (!Class144.method2155(14848)
		|| (Class23_Sub5_Sub1.aChar5038 != '`'
		    && (Class23_Sub5_Sub1.aChar5038 ^ 0xffffffff) != -168)) {
		Class131_Sub2_Sub7.anIntArray5640[Class22.anInt246]
		    = Class131_Sub2_Sub1.anInt5563;
		Class60.anIntArray789[Class22.anInt246]
		    = Class23_Sub5_Sub1.aChar5038;
		Class22.anInt246++;
	    } else if (Class134.method2099(0))
		Class75.method763(false);
	    else
		Class149.method2182(100);
	}
	if (Class134.method2099(0))
	    Class1_Sub2.method100(false);
	Class42.anInt563++;
	Class60.method650(-1, null, -1, (byte) 117);
	Class131_Sub41_Sub19.method2058(null, true, -1, -1);
	Class131_Sub41_Sub14.method2024(68);
	Class23_Sub5.anInt3758++;
	int i = -37 % ((64 - arg0) / 49);
	for (int i_12_ = 0; i_12_ < 32768; i_12_++) {
	    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		= Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[i_12_];
	    if (class23_sub4_sub1_sub1 != null) {
		byte i_13_ = class23_sub4_sub1_sub1.aClass66_6474.aByte867;
		if ((i_13_ & 0x1 ^ 0xffffffff) != -1) {
		    int i_14_ = class23_sub4_sub1_sub1.method335((byte) -106);
		    if ((i_13_ & 0x2 ^ 0xffffffff) != -1
			&& ((class23_sub4_sub1_sub1.anInt5334 ^ 0xffffffff)
			    == -1)
			&& Math.random() * 1000.0 < 10.0) {
			int i_15_
			    = (int) Math.round(-5.0 + Math.random() * 10.0);
			int i_16_
			    = (int) Math.round(Math.random() * 10.0 - 5.0);
			if (i_15_ != 0 || i_16_ != 0) {
			    int i_17_
				= (i_15_
				   + class23_sub4_sub1_sub1.anIntArray5328[0]);
			    int i_18_
				= (i_16_
				   + class23_sub4_sub1_sub1.anIntArray5331[0]);
			    if ((i_17_ ^ 0xffffffff) <= -1) {
				if ((i_17_ ^ 0xffffffff)
				    < (-1 + (-i_14_
					     + (Class131_Sub41_Sub11_Sub1
						.anInt6546))
				       ^ 0xffffffff))
				    i_17_ = -i_14_ + (Class131_Sub41_Sub11_Sub1
						      .anInt6546) + -1;
			    } else
				i_17_ = 0;
			    if ((i_18_ ^ 0xffffffff) <= -1) {
				if ((i_18_ ^ 0xffffffff)
				    < ((-i_14_ + Class131_Sub2_Sub26.anInt5931
					+ -1)
				       ^ 0xffffffff))
				    i_18_ = (-i_14_
					     + (Class131_Sub2_Sub26.anInt5931
						- 1));
			    } else
				i_18_ = 0;
			    int i_19_
				= (Class143.method2141
				   (class23_sub4_sub1_sub1.anIntArray5331[0],
				    0,
				    class23_sub4_sub1_sub1.anIntArray5328[0],
				    0, Class131_Sub2_Sub18.anIntArray5821,
				    true, -12757,
				    Class131_Sub24.anIntArray4473, i_14_,
				    i_14_, i_18_, -1, i_17_, i_14_,
				    (Class131_Sub2_Sub9.aClass19Array5682
				     [class23_sub4_sub1_sub1.aByte3740])));
			    if (i_19_ > 0) {
				if (i_19_ > 9)
				    i_19_ = 9;
				for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
				    class23_sub4_sub1_sub1.anIntArray5328
					[i_20_]
					= (Class131_Sub2_Sub18.anIntArray5821
					   [-1 + -i_20_ + i_19_]);
				    class23_sub4_sub1_sub1.anIntArray5331
					[i_20_]
					= (Class131_Sub24.anIntArray4473
					   [-1 + (-i_20_ + i_19_)]);
				    class23_sub4_sub1_sub1.aByteArray5322
					[i_20_]
					= (byte) 1;
				}
				class23_sub4_sub1_sub1.anInt5334 = i_19_;
			    }
			}
		    }
		    Class91.method844(false, class23_sub4_sub1_sub1, true);
		    int i_21_
			= Class131_Sub18.method1807(class23_sub4_sub1_sub1,
						    16383);
		    Class19.method251(class23_sub4_sub1_sub1, i_21_,
				      Class131_Sub41_Sub21.anInt6446,
				      (byte) -124, Class182.anInt2605);
		    Class75.method761(class23_sub4_sub1_sub1, (byte) -96);
		}
	    }
	}
	if (Class75.anInt1024 == 0 && Class176.anInt2523 == 0) {
	    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff) == -3)
		Class20.method258(-2511);
	    else
		Class69.method737((byte) 115);
	    if (Class2.anInt84 >> -1717176537 < 14
		|| (Class2.anInt84 >> -701224089
		    >= Class131_Sub41_Sub11_Sub1.anInt6546 + -14)
		|| (Class57.anInt753 >> 1903167751 ^ 0xffffffff) > -15
		|| ((Class131_Sub2_Sub26.anInt5931 + -14 ^ 0xffffffff)
		    >= (Class57.anInt753 >> 2032086727 ^ 0xffffffff)))
		Class115.method984(false);
	}
	for (;;) {
	    Class131_Sub14 class131_sub14
		= ((Class131_Sub14)
		   Class172.aClass119_2289.method1005((byte) 93));
	    if (class131_sub14 == null)
		break;
	    Class173 class173 = class131_sub14.aClass173_4276;
	    if ((class173.anInt2350 ^ 0xffffffff) <= -1) {
		Class173 class173_22_
		    = Class190.method2615(class173.anInt2456, -122);
		if (class173_22_ == null
		    || class173_22_.aClass173Array2326 == null
		    || (class173_22_.aClass173Array2326.length
			<= class173.anInt2350)
		    || (class173_22_.aClass173Array2326[class173.anInt2350]
			!= class173))
		    continue;
	    }
	    Class168.method2437(class131_sub14);
	}
	for (;;) {
	    Class131_Sub14 class131_sub14
		= ((Class131_Sub14)
		   Class131_Sub24.aClass119_4467.method1005((byte) 93));
	    if (class131_sub14 == null)
		break;
	    Class173 class173 = class131_sub14.aClass173_4276;
	    if (class173.anInt2350 >= 0) {
		Class173 class173_23_
		    = Class190.method2615(class173.anInt2456, -98);
		if (class173_23_ == null
		    || class173_23_.aClass173Array2326 == null
		    || ((class173.anInt2350 ^ 0xffffffff)
			<= (class173_23_.aClass173Array2326.length
			    ^ 0xffffffff))
		    || class173 != (class173_23_.aClass173Array2326
				    [class173.anInt2350]))
		    continue;
	    }
	    Class168.method2437(class131_sub14);
	}
	for (;;) {
	    Class131_Sub14 class131_sub14
		= ((Class131_Sub14)
		   Class87.aClass119_1138.method1005((byte) 93));
	    if (class131_sub14 == null)
		break;
	    Class173 class173 = class131_sub14.aClass173_4276;
	    if (class173.anInt2350 >= 0) {
		Class173 class173_24_
		    = Class190.method2615(class173.anInt2456, -67);
		if (class173_24_ == null
		    || class173_24_.aClass173Array2326 == null
		    || (class173_24_.aClass173Array2326.length
			<= class173.anInt2350)
		    || class173 != (class173_24_.aClass173Array2326
				    [class173.anInt2350]))
		    continue;
	    }
	    Class168.method2437(class131_sub14);
	}
	if (Class22_Sub1.aClass173_3666 != null)
	    Class130.method1200(99);
	if ((Class125.anInt1632 % 1500 ^ 0xffffffff) == -1)
	    Class137.method2118(-119);
	Class159.method2380(64);
	if (Class131_Sub6.aBoolean4156
	    && ((Class131_Sub41_Sub2.aLong6180 ^ 0xffffffffffffffffL)
		> (Class208.method2749(-3913) - 60000L ^ 0xffffffffffffffffL)))
	    Class131_Sub38.method1891(6);
    }
    
    public void method44(int arg0) {
	if (Class131_Sub6.aBoolean4156)
	    Class131_Sub38.method1891(6);
	anInt3468++;
	if (Class183_Sub1.aClass130_4960 != null)
	    Class183_Sub1.aClass130_4960.method1167(arg0 + -31588);
	if (Class74.aFrame1014 != null) {
	    Class131_Sub2_Sub5.method1491(Class23_Sub4.aSignLink_3734,
					  Class74.aFrame1014, true);
	    Class74.aFrame1014 = null;
	}
	if (Class6.aClass56_96 != null)
	    Class6.aClass56_96.aBoolean734 = false;
	Class6.aClass56_96 = null;
	if (Class128_Sub1.aClass33_4013 != null) {
	    Class128_Sub1.aClass33_4013.method452(arg0 + -3);
	    Class128_Sub1.aClass33_4013 = null;
	}
	Class22_Sub1.method271(Class131_Sub2_Sub15.aCanvas5768, (byte) 2);
	Class131_Sub37.method1886(Class131_Sub2_Sub15.aCanvas5768,
				  arg0 ^ 0x3fd);
	if (Class164.aClass34_2189 != null)
	    Class164.aClass34_2189.method459(255,
					     Class131_Sub2_Sub15.aCanvas5768);
	Class134.method2096(true);
	Class131_Sub3.method1648(-1);
	if (arg0 != 2)
	    method49((byte) -34);
	Class164.aClass34_2189 = null;
	if (Class131_Sub35.aClass215_4588 != null)
	    Class131_Sub35.aClass215_4588.method2799(14682);
	if (aClass215_3470 != null)
	    aClass215_3470.method2799(14682);
	Class46.aClass179_640.method2512((byte) -86);
	Class131_Sub42.aClass88_4688.method828(arg0 + -17568);
	if (Class131_Sub2_Sub7.aClass166_5635 != null) {
	    Class131_Sub2_Sub7.aClass166_5635.method2423(-11400);
	    Class131_Sub2_Sub7.aClass166_5635 = null;
	}
    }
    
    public void method60(int arg0, int arg1) {
	Class23_Sub2_Sub1.aClass139_4990 = null;
	anInt3483++;
	Class131_Sub1_Sub1.aClass33_5474 = null;
	Class46.aClass179_640.anInt2566++;
	Class131_Sub2_Sub29.anInt5971 = 0;
	Class46.aClass179_640.anInt2568 = arg1;
	if (arg0 > -80)
	    method61((byte) -40, null);
    }
    
    public static void method61(byte arg0, Class158 arg1) {
	try {
	    Class98.aClass158_1295 = arg1;
	    if (arg0 > 79)
		anInt3479++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("client.CA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method62(int arg0) {
	try {
	    if (arg0 > 116) {
		Class131_Sub2_Sub10_Sub1.aClass180_6542.method2519(-18);
		anInt3486++;
		Class6.aClass180_97.method2519(-121);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.NA(" + arg0 + ')');
	}
    }
    
    public void method43(byte arg0) {
	try {
	    anInt3475++;
	    if (Class133.anInt1803 != 1000) {
		Class125.anInt1632++;
		if (Class125.anInt1632 % 1000 == 1) {
		    GregorianCalendar gregoriancalendar
			= new GregorianCalendar();
		    Class131_Sub2_Sub33.anInt6026
			= (gregoriancalendar.get(11) * 600
			   + gregoriancalendar.get(12) * 10
			   - -(gregoriancalendar.get(13) / 6));
		    Class39.aRandom514
			.setSeed((long) Class131_Sub2_Sub33.anInt6026);
		}
		method63(-87);
		if (Class131_Sub2_Sub6.aClass176_5618 != null)
		    Class131_Sub2_Sub6.aClass176_5618.method2488(arg0 + -10);
		Class151.method2195(arg0 ^ ~0x4d);
		Class43.method522(-109);
		Class131_Sub2_Sub17.method1550((byte) -75);
		if (arg0 != 77)
		    method50(false);
		Class110_Sub1.method941(107);
		if (Class183_Sub1.aClass130_4960 != null)
		    Class183_Sub1.aClass130_4960
			.method1229((int) Class208.method2749(-3913));
		if (Class164.aClass34_2189 != null) {
		    int i = Class164.aClass34_2189.method460(-128);
		    Class1_Sub2.anInt3511 = i;
		}
		Class131_Sub7.method1667(19560);
		if ((Class133.anInt1803 ^ 0xffffffff) == -1) {
		    method74((byte) -84);
		    Class100.method877(-1);
		} else if (Class133.anInt1803 != 5) {
		    if ((Class133.anInt1803 ^ 0xffffffff) == -26
			|| (Class133.anInt1803 ^ 0xffffffff) == -29)
			Class202.method2723(false);
		} else {
		    method74((byte) -107);
		    Class100.method877(-1);
		}
		if (Class133.anInt1803 != 10) {
		    if (Class133.anInt1803 == 30)
			PacketParser.method1581(false);
		    else if (Class133.anInt1803 == 40) {
			Login.method1149((byte) 7);
			if (Class4.anInt3281 != -3) {
			    if ((Class4.anInt3281 ^ 0xffffffff) == -16)
				Class41.method513((byte) 53);
			    else if (Class4.anInt3281 != 2)
				Class41.method512(2);
			}
		    }
		} else {
		    method59((byte) 113);
		    Class131_Sub41_Sub8.method1980(-31581);
		    Class197.method2677(true);
		    Login.method1149((byte) 7);
		}
		Class4.method156(Class183_Sub1.aClass130_4960, -81);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.M(" + arg0 + ')');
	}
    }
    
    public void method63(int arg0) {
	if (arg0 >= -36)
	    aClass215_3470 = null;
	anInt3472++;
	boolean bool = Class46.aClass179_640.method2498(-128);
	if (!bool)
	    method56(-124);
    }
    
    public static String method64(int arg0, Class131_Sub21 arg1) {
	try {
	    anInt3482++;
	    if (arg0 > -29)
		aClass215_3470 = null;
	    if (arg1.aString4445 != null
		&& (arg1.aString4445.length() ^ 0xffffffff) < -1)
		return (arg1.aString4440 + Class203.aString2966
			+ arg1.aString4445);
	    return arg1.aString4440;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("client.V(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void init() {
	try {
	    anInt3465++;
	    if (this.method51((byte) -61)) {
		Class93.anInt1227
		    = Integer.parseInt(this.getParameter("worldid"));
		Class1_Sub7.anInt3581
		    = Integer.parseInt(this.getParameter("modewhere"));
		if ((Class1_Sub7.anInt3581 ^ 0xffffffff) > -1
		    || Class1_Sub7.anInt3581 > 1)
		    Class1_Sub7.anInt3581 = 0;
		Class214.anInt3138
		    = Integer.parseInt(this.getParameter("modewhat"));
		if ((Class214.anInt3138 ^ 0xffffffff) > -1
		    || Class214.anInt3138 > 2)
		    Class214.anInt3138 = 0;
		try {
		    Class1_Sub7_Sub1.anInt5208
			= Integer.parseInt(this.getParameter("lang"));
		} catch (Exception exception) {
		    Class1_Sub7_Sub1.anInt5208 = 0;
		}
		Class165.method2414(Class1_Sub7_Sub1.anInt5208, (byte) 53);
		String string = this.getParameter("objecttag");
		if (string != null && string.equals("1"))
		    Class112.aBoolean1447 = true;
		else
		    Class112.aBoolean1447 = false;
		String string_25_ = this.getParameter("js");
		if (string_25_ != null && string_25_.equals("1"))
		    Class131_Sub24.aBoolean4472 = true;
		else
		    Class131_Sub24.aBoolean4472 = false;
		String string_26_ = this.getParameter("game");
		if (string_26_ == null || !string_26_.equals("1"))
		    Class126.anInt1696 = 0;
		else
		    Class126.anInt1696 = 1;
		try {
		    Class131_Sub2_Sub22.anInt5863
			= Integer.parseInt(this.getParameter("affid"));
		} catch (Exception exception) {
		    Class131_Sub2_Sub22.anInt5863 = 0;
		}
		Class160.aString2128 = this.getParameter("quiturl");
		Class23_Sub2_Sub2.aString5186 = this.getParameter("settings");
		if (Class23_Sub2_Sub2.aString5186 == null)
		    Class23_Sub2_Sub2.aString5186 = "";
		String string_27_ = this.getParameter("country");
		if (string_27_ != null) {
		    try {
			Class131_Sub41.anInt4669
			    = Integer.parseInt(string_27_);
		    } catch (Exception exception) {
			Class131_Sub41.anInt4669 = 0;
		    }
		}
		Class131_Sub2_Sub21.anInt5848
		    = Integer.parseInt(this.getParameter("colourid"));
		if (Class131_Sub2_Sub21.anInt5848 < 0
		    || ((Class31.aColorArray388.length ^ 0xffffffff)
			>= (Class131_Sub2_Sub21.anInt5848 ^ 0xffffffff)))
		    Class131_Sub2_Sub21.anInt5848 = 0;
		Class131_Sub2_Sub39.aClient6084 = this;
		this.method36(503, (byte) 76, Class214.anInt3138 + 32, 765,
			      562);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.init(" + ')');
	}
    }
    
    public static void main(String[] arg0) {
	try {
	    try {
		if (arg0.length != 4)
		    Class89.method837("argument count", false);
		Class93.anInt1227 = Integer.parseInt(arg0[0]);
		Class1_Sub7.anInt3581 = 2;
		if (arg0[1].equals("live"))
		    Class214.anInt3138 = 0;
		else if (!arg0[1].equals("rc")) {
		    if (arg0[1].equals("wip"))
			Class214.anInt3138 = 2;
		    else
			Class89.method837("modewhat", false);
		} else
		    Class214.anInt3138 = 1;
		Class1_Sub7_Sub1.anInt5208
		    = Class131_Sub2_Sub34.method1629(true, arg0[2]);
		if (Class1_Sub7_Sub1.anInt5208 == -1) {
		    if (arg0[2].equals("english"))
			Class1_Sub7_Sub1.anInt5208 = 0;
		    else if (arg0[2].equals("german"))
			Class1_Sub7_Sub1.anInt5208 = 1;
		    else
			Class89.method837("language", false);
		}
		Class165.method2414(Class1_Sub7_Sub1.anInt5208, (byte) 53);
		Class131_Sub24.aBoolean4472 = false;
		Class112.aBoolean1447 = false;
		if (!arg0[3].equals("game0")) {
		    if (arg0[3].equals("game1"))
			Class126.anInt1696 = 1;
		    else
			Class89.method837("game", false);
		} else
		    Class126.anInt1696 = 0;
		Class131_Sub41.anInt4669 = 0;
		Class131_Sub2_Sub21.anInt5848 = Class126.anInt1696;
		Class131_Sub2_Sub22.anInt5863 = 0;
		Class23_Sub2_Sub2.aString5186 = "";
		client var_client = new client();
		Class131_Sub2_Sub39.aClient6084 = var_client;
		var_client.method40((byte) 39, 562, 29,
				    32 - -Class214.anInt3138, 503, false, 765,
				    ((Class126.anInt1696 ^ 0xffffffff) != -2
				     ? "runescape" : "stellardawn"));
		Class158.aFrame2095.setLocation(40, 40);
	    } catch (Exception exception) {
		Class45.method563(null, exception, 0);
	    }
	    anInt3477++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("client.main("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method65() {
	int i = (Canvas_Sub1.aBoolean42 ? Class131_Sub38.anInt4618
		 : Class131_Sub38.anInt4618 + Class131_Sub41_Sub2.anInt6186);
	for (int i_28_ = -1; i_28_ < i; i_28_++) {
	    Class23_Sub4_Sub1 class23_sub4_sub1;
	    if (i_28_ < 0)
		class23_sub4_sub1 = Class166.aClass23_Sub4_Sub1_Sub2_2216;
	    else if (i_28_ < Class131_Sub38.anInt4618)
		class23_sub4_sub1 = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				     [Class148.anIntArray1983[i_28_]]);
	    else
		class23_sub4_sub1
		    = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		       [(Class131_Sub41_Sub12.anIntArray6316
			 [i_28_ - Class131_Sub38.anInt4618])]);
	    class23_sub4_sub1.anInt5263 = 0;
	    if (class23_sub4_sub1.anInt5273 < 0)
		class23_sub4_sub1.aBoolean5293 = false;
	    else {
		int i_29_ = class23_sub4_sub1.method335((byte) -98);
		if ((i_29_ & 0x1) == 0) {
		    if ((class23_sub4_sub1.anInt3733 & 0x7f) != 0
			|| (class23_sub4_sub1.anInt3747 & 0x7f) != 0) {
			class23_sub4_sub1.aBoolean5293 = false;
			continue;
		    }
		} else if ((class23_sub4_sub1.anInt3733 & 0x7f) != 64
			   || (class23_sub4_sub1.anInt3747 & 0x7f) != 64) {
		    class23_sub4_sub1.aBoolean5293 = false;
		    continue;
		}
		if (i_29_ == 1) {
		    int i_30_ = class23_sub4_sub1.anInt3733 >> 7;
		    int i_31_ = class23_sub4_sub1.anInt3747 >> 7;
		    if (class23_sub4_sub1.anInt5273
			!= (Class131_Sub41_Sub19.anIntArrayArray6407[i_30_]
			    [i_31_])) {
			class23_sub4_sub1.aBoolean5293 = true;
			continue;
		    }
		    if (Class151.anIntArrayArray2025[i_30_][i_31_] > 1) {
			Class151.anIntArrayArray2025[i_30_][i_31_]--;
			class23_sub4_sub1.aBoolean5293 = true;
			continue;
		    }
		} else {
		    int i_32_ = (i_29_ - 1) * 64 + 60;
		    int i_33_ = class23_sub4_sub1.anInt3733 - i_32_ >> 7;
		    int i_34_ = class23_sub4_sub1.anInt3747 - i_32_ >> 7;
		    int i_35_ = class23_sub4_sub1.anInt3733 + i_32_ >> 7;
		    int i_36_ = class23_sub4_sub1.anInt3747 + i_32_ >> 7;
		    if (!Class125.method1097(i_35_,
					     class23_sub4_sub1.anInt5273,
					     i_33_, 100, i_34_, i_36_)) {
			for (int i_37_ = i_33_; i_37_ <= i_35_; i_37_++) {
			    for (int i_38_ = i_34_; i_38_ <= i_36_; i_38_++) {
				if (class23_sub4_sub1.anInt5273
				    == (Class131_Sub41_Sub19
					.anIntArrayArray6407[i_37_][i_38_]))
				    Class151.anIntArrayArray2025[i_37_]
					[i_38_]--;
			    }
			}
			class23_sub4_sub1.aBoolean5293 = true;
			continue;
		    }
		}
		if (class23_sub4_sub1 instanceof Class23_Sub4_Sub1_Sub2
		    && class23_sub4_sub1.anInterface6_5333 != null
		    && Class125.anInt1632 >= class23_sub4_sub1.anInt5324
		    && Class125.anInt1632 < class23_sub4_sub1.anInt5332)
		    ((Class23_Sub4_Sub1_Sub2) class23_sub4_sub1).aBoolean6510
			= false;
		class23_sub4_sub1.aBoolean5293 = false;
		class23_sub4_sub1.anInt3746
		    = RuntimeException_Sub1.method2833((class23_sub4_sub1
							.anInt3747),
						       119,
						       (class23_sub4_sub1
							.anInt3733),
						       Class29.anInt300);
		Class131_Sub23.method1823(class23_sub4_sub1, true);
	    }
	}
    }
    
    public static Class131_Sub37 method66(Class173 arg0) {
	Class131_Sub37 class131_sub37
	    = ((Class131_Sub37)
	       Class172.aClass180_2290.method2521(-82,
						  (((long) arg0.anInt2455
						    << 32)
						   + (long) arg0.anInt2350)));
	if (class131_sub37 != null)
	    return class131_sub37;
	return arg0.aClass131_Sub37_2398;
    }
    
    public static void method67() {
	boolean bool
	    = (Class171.anInt2284 == 1 && Class131_Sub38.anInt4618 > 200
	       || Class171.anInt2284 == 0 && Class131_Sub38.anInt4618 > 50);
	for (int i = 0; i < Class131_Sub38.anInt4618; i++) {
	    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
		   [Class148.anIntArray1983[i]]);
	    if (!class23_sub4_sub1_sub2.method359(false))
		class23_sub4_sub1_sub2.anInt5273 = -1;
	    else {
		class23_sub4_sub1_sub2.method325((byte) -70);
		if (class23_sub4_sub1_sub2.aShort3745 < 0
		    || class23_sub4_sub1_sub2.aShort3737 < 0
		    || (class23_sub4_sub1_sub2.aShort3742
			>= Class131_Sub41_Sub11_Sub1.anInt6546)
		    || (class23_sub4_sub1_sub2.aShort3735
			>= Class131_Sub2_Sub26.anInt5931))
		    class23_sub4_sub1_sub2.anInt5273 = -1;
		else {
		    class23_sub4_sub1_sub2.aBoolean6510
			= class23_sub4_sub1_sub2.aBoolean5261 ? bool : false;
		    int i_39_ = 0;
		    if (!class23_sub4_sub1_sub2.aBoolean5293)
			i_39_++;
		    if (class23_sub4_sub1_sub2.anInt5272 > Class125.anInt1632)
			i_39_ += 2;
		    i_39_ += (5 - class23_sub4_sub1_sub2.method335((byte) -51)
			      << 2);
		    if (Class131_Sub2_Sub12.anInt5725 == 0)
			i_39_ += 32;
		    else
			i_39_ += 128;
		    i_39_ += 256;
		    class23_sub4_sub1_sub2.anInt5273 = i_39_ + 1;
		}
	    }
	}
	for (int i = 0; i < Class131_Sub41_Sub2.anInt6186; i++) {
	    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		   [Class131_Sub41_Sub12.anIntArray6316[i]]);
	    if (!class23_sub4_sub1_sub1.method350(false)
		|| !class23_sub4_sub1_sub1.aClass66_6474
			.method690((byte) -128))
		class23_sub4_sub1_sub1.anInt5273 = -1;
	    else {
		class23_sub4_sub1_sub1.method325((byte) -115);
		if (class23_sub4_sub1_sub1.aShort3745 < 0
		    || class23_sub4_sub1_sub1.aShort3737 < 0
		    || (class23_sub4_sub1_sub1.aShort3742
			>= Class131_Sub41_Sub11_Sub1.anInt6546)
		    || (class23_sub4_sub1_sub1.aShort3735
			>= Class131_Sub2_Sub26.anInt5931))
		    class23_sub4_sub1_sub1.anInt5273 = -1;
		else {
		    int i_40_ = 0;
		    if (!class23_sub4_sub1_sub1.aBoolean5293)
			i_40_++;
		    if (class23_sub4_sub1_sub1.anInt5272 > Class125.anInt1632)
			i_40_ += 2;
		    i_40_ += (5 - class23_sub4_sub1_sub1.method335((byte) -49)
			      << 2);
		    if (Class131_Sub2_Sub12.anInt5725 == 0) {
			if (class23_sub4_sub1_sub1.aClass66_6474.aBoolean849)
			    i_40_ += 64;
			else
			    i_40_ += 128;
		    } else if (Class131_Sub2_Sub12.anInt5725 == 1) {
			if (class23_sub4_sub1_sub1.aClass66_6474.aBoolean849)
			    i_40_ += 32;
			else
			    i_40_ += 64;
		    }
		    if (class23_sub4_sub1_sub1.aClass66_6474.aBoolean863)
			i_40_ += 512;
		    else if (!class23_sub4_sub1_sub1.aClass66_6474.aBoolean856)
			i_40_ += 256;
		    class23_sub4_sub1_sub1.anInt5273 = i_40_ + 1;
		}
	    }
	}
	for (int i = 0; i < Class131_Sub2_Sub5.aClass87Array5612.length; i++) {
	    Class87 class87 = Class131_Sub2_Sub5.aClass87Array5612[i];
	    if (class87 != null) {
		if (class87.anInt1135 == 1) {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [class87.anInt1126]);
		    if (class23_sub4_sub1_sub1 != null
			&& class23_sub4_sub1_sub1.anInt5273 >= 0)
			class23_sub4_sub1_sub1.anInt5273 += 1024;
		} else if (class87.anInt1135 == 10) {
		    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
			   [class87.anInt1126]);
		    if (class23_sub4_sub1_sub2 != null
			&& class23_sub4_sub1_sub2.anInt5273 >= 0)
			class23_sub4_sub1_sub2.anInt5273 += 1024;
		}
	    }
	}
	Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt5273 = 2147483647;
    }
    
    public static void method68(Object arg0, int arg1, SignLink arg2) {
	do {
	    try {
		anInt3484++;
		if (arg2.anEventQueue2894 != null) {
		    for (int i = 0;
			 i < 50 && arg2.anEventQueue2894.peekEvent() != null;
			 i++)
			Class187.method2575(-59, 1L);
		    int i = -80 / ((39 - arg1) / 62);
		    if (arg0 == null)
			break;
		    arg2.anEventQueue2894.postEvent(new ActionEvent(arg0, 1001,
								    "dummy"));
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("client.FA("
						     + (arg0 != null ? "{...}"
							: "null")
						     + ',' + arg1 + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method69() {
	Class165.anInt2198 = 0;
	for (int i = 0; i < Class131_Sub41_Sub2.anInt6186; i++) {
	    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		   [Class131_Sub41_Sub12.anIntArray6316[i]]);
	    if (class23_sub4_sub1_sub1.aBoolean5293
		&& class23_sub4_sub1_sub1.method346((byte) 115) != -1) {
		int i_41_
		    = ((class23_sub4_sub1_sub1.method335((byte) -78) - 1) * 64
		       + 60);
		int i_42_ = class23_sub4_sub1_sub1.anInt3733 - i_41_ >> 7;
		int i_43_ = class23_sub4_sub1_sub1.anInt3747 - i_41_ >> 7;
		Class23_Sub4_Sub1 class23_sub4_sub1
		    = Class131_Sub8.method1677(i_42_, Class29.anInt300, i_43_,
					       (byte) 27);
		if (class23_sub4_sub1 != null) {
		    int i_44_ = class23_sub4_sub1.anInt5274;
		    if (class23_sub4_sub1 instanceof Class23_Sub4_Sub1_Sub1)
			i_44_ += 2048;
		    if (class23_sub4_sub1.anInt5263 == 0
			&& class23_sub4_sub1.method346((byte) 115) != -1) {
			Class156.anIntArray2071[Class165.anInt2198] = i_44_;
			Class131_Sub2_Sub5.anIntArray5608[Class165.anInt2198]
			    = i_44_;
			Class165.anInt2198++;
			class23_sub4_sub1.anInt5263++;
		    }
		    Class156.anIntArray2071[Class165.anInt2198] = i_44_;
		    Class131_Sub2_Sub5.anIntArray5608[Class165.anInt2198]
			= class23_sub4_sub1_sub1.anInt5274 + 2048;
		    Class165.anInt2198++;
		    class23_sub4_sub1.anInt5263++;
		}
	    }
	}
	Class131_Sub42.method2086(0, (byte) 43, Class156.anIntArray2071,
				  Class131_Sub2_Sub5.anIntArray5608,
				  Class165.anInt2198 - 1);
    }
    
    public static void method70(Class173[] arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9) {
	for (int i = 0; i < arg0.length; i++) {
	    Class173 class173 = arg0[i];
	    if (class173 != null && class173.anInt2456 == arg1) {
		int i_45_ = class173.anInt2442 + arg6;
		int i_46_ = class173.anInt2343 + arg7;
		int i_47_;
		int i_48_;
		int i_49_;
		int i_50_;
		if (class173.anInt2470 == 2) {
		    i_47_ = arg2;
		    i_48_ = arg3;
		    i_49_ = arg4;
		    i_50_ = arg5;
		} else {
		    int i_51_ = i_45_ + class173.anInt2411;
		    int i_52_ = i_46_ + class173.anInt2437;
		    if (class173.anInt2470 == 9) {
			i_51_++;
			i_52_++;
		    }
		    i_47_ = i_45_ > arg2 ? i_45_ : arg2;
		    i_48_ = i_46_ > arg3 ? i_46_ : arg3;
		    i_49_ = i_51_ < arg4 ? i_51_ : arg4;
		    i_50_ = i_52_ < arg5 ? i_52_ : arg5;
		}
		if (class173.aBoolean2355 && class173.anInt2470 != 0
		    && !class173.aBoolean2353
		    && method66(class173).anInt4601 == 0
		    && class173 != Class23_Sub4_Sub1_Sub2.aClass173_6520
		    && class173.anInt2441 != 1338) {
		    if (i_47_ < i_49_ && i_48_ < i_50_)
			Class23_Sub1_Sub1.method300(arg2, i_45_, arg5, arg4,
						    true, i_46_, arg3,
						    class173);
		} else if (!class173.aBoolean2355 || !method54(class173)) {
		    if (class173 == Class22_Sub1.aClass173_3666) {
			Class33.aBoolean471 = true;
			Class142.anInt1885 = i_45_;
			InputStream_Sub1.anInt52 = i_46_;
		    }
		    if (!class173.aBoolean2355 || class173.aBoolean2401
			|| i_47_ < i_49_ && i_48_ < i_50_) {
			if (class173.anInt2470 == 0) {
			    if (!class173.aBoolean2355 && method54(class173)
				&& Class1_Sub7.aClass173_3585 != class173)
				continue;
			    if (class173.aBoolean2429 && arg8 >= i_47_
				&& arg9 >= i_48_ && arg8 < i_49_
				&& arg9 < i_50_) {
				for (Class131_Sub14 class131_sub14
					 = (Class131_Sub14) Class87
								.aClass119_1138
								.method1007(0);
				     class131_sub14 != null;
				     class131_sub14 = ((Class131_Sub14)
						       Class87
							   .aClass119_1138
							   .method1014(0))) {
				    if (class131_sub14.aBoolean4282) {
					class131_sub14.method1355((byte) 115);
					class131_sub14.aClass173_4276
					    .aBoolean2413
					    = false;
				    }
				}
				if (Class9.anInt120 == 0) {
				    Class22_Sub1.aClass173_3666 = null;
				    Class23_Sub4_Sub1_Sub2.aClass173_6520
					= null;
				}
				Class23_Sub5_Sub2.anInt5063 = 0;
				Class23_Sub3.aBoolean3725 = false;
				Class17.aBoolean181 = false;
				if (!Class131_Sub2_Sub24.aBoolean5890)
				    Class131_Sub41.method1915((byte) 88);
			    }
			}
			boolean bool;
			if (Class144.anInt1914 >= i_47_
			    && Class23_Sub4_Sub3.anInt5005 >= i_48_
			    && Class144.anInt1914 < i_49_
			    && Class23_Sub4_Sub3.anInt5005 < i_50_)
			    bool = true;
			else
			    bool = false;
			if (!Class131_Sub2_Sub24.aBoolean5890 && arg8 >= i_47_
			    && arg9 >= i_48_ && arg8 < i_49_ && arg9 < i_50_)
			    Class107.method924(2, arg9 - i_46_, arg8 - i_45_,
					       class173);
			if (class173.aBoolean2355) {
			    boolean bool_53_ = false;
			    if (Class147.anInt1949 == 1 && bool)
				bool_53_ = true;
			    boolean bool_54_ = false;
			    if (Class131_Sub23.anInt4458 == 1
				&& Class207.anInt3022 >= i_47_
				&& Class131_Sub11.anInt4246 >= i_48_
				&& Class207.anInt3022 < i_49_
				&& Class131_Sub11.anInt4246 < i_50_)
				bool_54_ = true;
			    if (class173.aByteArray2317 != null) {
				for (int i_55_ = 0;
				     i_55_ < class173.aByteArray2317.length;
				     i_55_++) {
				    if (!Class131_Sub2_Sub39.aBooleanArray6080
					 [class173.aByteArray2317[i_55_]]) {
					if (class173.anIntArray2379 != null)
					    class173.anIntArray2379[i_55_] = 0;
				    } else if (class173.anIntArray2379 == null
					       || (Class125.anInt1632
						   >= (class173.anIntArray2379
						       [i_55_]))) {
					byte i_56_
					    = class173.aByteArray2417[i_55_];
					if (i_56_ == 0
					    || (((i_56_ & 0x8) == 0
						 || (!(Class131_Sub2_Sub39
						       .aBooleanArray6080[86])
						     && !(Class131_Sub2_Sub39
							  .aBooleanArray6080
							  [82])
						     && !(Class131_Sub2_Sub39
							  .aBooleanArray6080
							  [81])))
						&& ((i_56_ & 0x2) == 0
						    || (Class131_Sub2_Sub39
							.aBooleanArray6080
							[86]))
						&& ((i_56_ & 0x1) == 0
						    || (Class131_Sub2_Sub39
							.aBooleanArray6080
							[82]))
						&& ((i_56_ & 0x4) == 0
						    || (Class131_Sub2_Sub39
							.aBooleanArray6080
							[81])))) {
					    Class5.method161((byte) 31, "",
							     (class173
							      .anInt2455),
							     i_55_ + 1, -1);
					    int i_57_
						= (class173.anIntArray2449
						   [i_55_]);
					    if (class173.anIntArray2379
						== null)
						class173.anIntArray2379
						    = (new int
						       [(class173
							 .aByteArray2317).length]);
					    if (i_57_ != 0)
						class173.anIntArray2379[i_55_]
						    = (Class125.anInt1632
						       + i_57_);
					    else
						class173.anIntArray2379[i_55_]
						    = 2147483647;
					}
				    }
				}
			    }
			    if (bool_54_)
				Class1_Sub2.method104
				    (class173, Class207.anInt3022 - i_45_,
				     Class131_Sub11.anInt4246 - i_46_, -115);
			    if (Class22_Sub1.aClass173_3666 != null
				&& Class22_Sub1.aClass173_3666 != class173
				&& bool
				&& method66(class173).method1879(false))
				Class33.aClass173_465 = class173;
			    if (class173
				== Class23_Sub4_Sub1_Sub2.aClass173_6520) {
				Class131_Sub3.aBoolean4125 = true;
				Class182.anInt2606 = i_45_;
				Class131_Sub4.anInt4131 = i_46_;
			    }
			    if (class173.aBoolean2353
				|| class173.anInt2441 != 0) {
				if (bool && Class1_Sub2.anInt3511 != 0
				    && class173.anObjectArray2351 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aBoolean4282 = true;
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anInt4285
					= Class1_Sub2.anInt3511;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2351;
				    Class87.aClass119_1138.method1018
					((byte) -128, class131_sub14);
				}
				if (Class22_Sub1.aClass173_3666 != null
				    || (Class131_Sub2_Sub24.aClass173_5906
					!= null)
				    || Class131_Sub2_Sub24.aBoolean5890
				    || (class173.anInt2441 != 1400
					&& Class23_Sub5_Sub2.anInt5063 > 0)) {
				    bool_54_ = false;
				    bool_53_ = false;
				    bool = false;
				}
				if (class173.anInt2441 != 0) {
				    if (class173.anInt2441 == 1337
					|| class173.anInt2441 == 1403) {
					Class121_Sub1.aClass173_3981
					    = class173;
					if (Class98.aClass209_1307 != null)
					    Class98.aClass209_1307.method2750
						(class173.anInt2437, -18995,
						 Class183_Sub1.aClass130_4960);
					if (class173.anInt2441 == 1337) {
					    if (!(Class131_Sub2_Sub24
						  .aBoolean5890)
						&& arg8 >= i_47_
						&& arg9 >= i_48_
						&& arg8 < i_49_
						&& arg9 < i_50_) {
						Class1_Sub7_Sub1.method131
						    ((Class183_Sub1
						      .aClass130_4960),
						     arg9, arg8, 127);
						for (Class1_Sub4 class1_sub4
							 = ((Class1_Sub4)
							    (Class18
								 .aClass50_188
								 .method586
							     ((byte) 42)));
						     class1_sub4 != null;
						     class1_sub4
							 = ((Class1_Sub4)
							    (Class18
								 .aClass50_188
								 .method589
							     (-87)))) {
						    if (arg8 >= (class1_sub4
								 .anInt3555)
							&& arg8 < (class1_sub4
								   .anInt3553)
							&& arg9 >= (class1_sub4
								    .anInt3552)
							&& (arg9
							    < (class1_sub4
							       .anInt3549))) {
							Class131_Sub41
							    .method1915
							    ((byte) 45);
							Class64.method670
							    (1,
							     (class1_sub4
							      .aClass23_Sub4_Sub1_3545));
						    }
						}
					    }
					    Class60.method650(i_45_, class173,
							      i_46_,
							      (byte) 12);
					    continue;
					}
				    }
				    if (class173.anInt2441 == 1338) {
					if (((class173.method2455
					      (0,
					       Class183_Sub1.aClass130_4960))
					     != null)
					    && (Class131_Sub31.anInt4524 == 0
						|| (Class131_Sub31.anInt4524
						    == 3))
					    && !(Class131_Sub2_Sub24
						 .aBoolean5890)
					    && arg8 >= i_47_ && arg9 >= i_48_
					    && arg8 < i_49_ && arg9 < i_50_) {
					    int i_58_ = arg8 - i_45_;
					    int i_59_ = arg9 - i_46_;
					    int i_60_
						= (class173.anIntArray2478
						   [i_59_]);
					    if (i_58_ >= i_60_
						&& (i_58_
						    <= i_60_ + (class173
								.anIntArray2310
								[i_59_]))) {
						i_58_
						    -= class173.anInt2411 / 2;
						i_59_
						    -= class173.anInt2437 / 2;
						int i_61_;
						if ((Class131_Sub2_Sub34
						     .anInt6035)
						    == 4)
						    i_61_
							= ((int) (Class120
								  .aFloat1578)
							   & 0x3fff);
						else
						    i_61_
							= (((int) (Class120
								   .aFloat1578)
							    + (Class148
							       .anInt1982))
							   & 0x3fff);
						int i_62_
						    = (Class31.anIntArray434
						       [i_61_]);
						int i_63_
						    = (Class31.anIntArray425
						       [i_61_]);
						if ((Class131_Sub2_Sub34
						     .anInt6035)
						    != 4) {
						    i_62_
							= i_62_ * ((Class1_Sub7
								    .anInt3590)
								   + 256) >> 8;
						    i_63_
							= i_63_ * ((Class1_Sub7
								    .anInt3590)
								   + 256) >> 8;
						}
						int i_64_ = ((i_59_ * i_62_
							      + i_58_ * i_63_)
							     >> 15);
						int i_65_ = ((i_59_ * i_63_
							      - i_58_ * i_62_)
							     >> 15);
						int i_66_;
						int i_67_;
						if ((Class131_Sub2_Sub34
						     .anInt6035)
						    == 4) {
						    i_66_
							= (((Class23_Sub2_Sub2
							     .anInt5169)
							    >> 7)
							   + (i_64_ >> 2));
						    i_67_ = ((Class50.anInt657
							      >> 7)
							     - (i_65_ >> 2));
						} else {
						    int i_68_
							= ((Class166
								.aClass23_Sub4_Sub1_Sub2_2216
								.method335
							    ((byte) -113))
							   - 1) * 64;
						    i_66_
							= ((Class166
							    .aClass23_Sub4_Sub1_Sub2_2216
							    .anInt3733) - i_68_
							   >> 7) + (i_64_ >> 2);
						    i_67_
							= ((Class166
							    .aClass23_Sub4_Sub1_Sub2_2216
							    .anInt3747) - i_68_
							   >> 7) - (i_65_ >> 2);
						}
						if (Class154.aBoolean2047
						    && (Class193.anInt2839
							& 0x40) != 0) {
						    Class173 class173_69_
							= (InputStream_Sub1
							       .method87
							   (Class98.anInt1306,
							    Class88.anInt1161,
							    (byte) -120));
						    if (class173_69_ != null)
							Class131_Sub31
							    .method1860
							    ((Class131_Sub41_Sub21
							      .anInt6447),
							     1L,
							     (Class131_Sub41_Sub2
							      .aString6191),
							     -1, i_66_, " ->",
							     i_67_, 50);
						    else
							Class63
							    .method666(2878);
						} else {
						    if (Class126.anInt1696
							== 1)
							Class131_Sub31
							    .method1860
							    (-1, 1L,
							     (Class144
							      .aString1919),
							     -1, i_66_, "",
							     i_67_, 17);
						    Class131_Sub31.method1860
							(-1, 1L,
							 Class143.aString1910,
							 -1, i_66_, "", i_67_,
							 57);
						}
					    }
					}
					continue;
				    }
				    if (class173.anInt2441 == 1400) {
					Class121_Sub3.aClass173_4000
					    = class173;
					if (bool)
					    Class23_Sub3.aBoolean3725 = true;
					if (bool_54_) {
					    int i_70_
						= (int) ((double) ((Class207
								    .anInt3022)
								   - i_45_
								   - ((class173
								       .anInt2411)
								      / 2))
							 * 2.0
							 / (double) (Class127
								     .aFloat1711));
					    int i_71_
						= (int) -((double) ((Class131_Sub11
								     .anInt4246)
								    - i_46_
								    - ((class173
									.anInt2437)
								       / 2))
							  * 2.0
							  / (double) (Class127
								      .aFloat1711));
					    int i_72_
						= (Class131_Sub31.anInt4532
						   + i_70_
						   + Class127.anInt1725);
					    int i_73_
						= (Class197.anInt2875 + i_71_
						   + Class127.anInt1728);
					    Class131_Sub41_Sub1 class131_sub41_sub1
						= InputStream_Sub1.method78(3);
					    if (class131_sub41_sub1 != null) {
						int[] is = new int[3];
						class131_sub41_sub1.method1928
						    (i_72_, is, i_73_,
						     (byte) -121);
						if (is != null) {
						    if ((Class131_Sub2_Sub39
							 .aBooleanArray6080
							 [82])
							&& (Class56.anInt745
							    > 0)) {
							Class120_Sub2
							    .method1035
							    (is[0], is[2],
							     is[1], 63);
							continue;
						    }
						    Class17.aBoolean181 = true;
						    Class69.anInt927 = is[0];
						    Class131_Sub41_Sub15
							.anInt6351
							= is[1];
						    Class131_Sub8.anInt4190
							= is[2];
						}
						Class23_Sub5_Sub2.anInt5063
						    = 1;
						InputStream_Sub1.aBoolean56
						    = false;
						RuntimeException_Sub1.anInt3243
						    = Class144.anInt1914;
						Class1_Sub7_Sub1.anInt5212
						    = (Class23_Sub4_Sub3
						       .anInt5005);
					    }
					} else if (bool_53_
						   && (Class23_Sub5_Sub2
						       .anInt5063) > 0) {
					    if ((Class23_Sub5_Sub2.anInt5063
						 == 1)
						&& (((RuntimeException_Sub1
						      .anInt3243)
						     != Class144.anInt1914)
						    || ((Class1_Sub7_Sub1
							 .anInt5212)
							!= (Class23_Sub4_Sub3
							    .anInt5005)))) {
						Class52.anInt694
						    = Class131_Sub31.anInt4532;
						Class156.anInt2069
						    = Class197.anInt2875;
						Class23_Sub5_Sub2.anInt5063
						    = 2;
					    }
					    if (Class23_Sub5_Sub2.anInt5063
						== 2) {
						InputStream_Sub1.aBoolean56
						    = true;
						Class131_Sub2_Sub26.method1598
						    (-1,
						     (Class52.anInt694
						      + (int) ((double) ((RuntimeException_Sub1
									  .anInt3243)
									 - (Class144
									    .anInt1914))
							       * 2.0
							       / (double) (Class127
									   .aFloat1710))));
						Class121_Sub3_Sub1.method1060
						    ((byte) 99,
						     (Class156.anInt2069
						      - (int) ((double) ((Class1_Sub7_Sub1
									  .anInt5212)
									 - (Class23_Sub4_Sub3
									    .anInt5005))
							       * 2.0
							       / (double) (Class127
									   .aFloat1710))));
					    }
					} else {
					    if (Class23_Sub5_Sub2.anInt5063 > 0
						&& !(InputStream_Sub1
						     .aBoolean56)) {
						if (((Class131_Sub27.anInt4491
						      == 1)
						     || Class131_Sub41_Sub20
							    .method2064(108))
						    && Class147.anInt1946 > 2)
						    Class161.method2387(-123,
									2);
						else if (Class98
							     .method864(17762))
						    Class161.method2387(-125,
									1);
					    }
					    Class23_Sub5_Sub2.anInt5063 = 0;
					}
					continue;
				    }
				    if (class173.anInt2441 == 1401) {
					if (bool_53_)
					    Class131_Sub9.method1691
						(class173.anInt2411, 23,
						 class173.anInt2437,
						 Class144.anInt1914 - i_45_,
						 (Class23_Sub4_Sub3.anInt5005
						  - i_46_));
					continue;
				    }
				    if (class173.anInt2441 == 1402) {
					Class23_Sub4_Sub4.method383(-90,
								    class173);
					continue;
				    }
				    if (class173.anInt2441 == 1406) {
					Class131_Sub41_Sub19.method2058
					    (class173, true, i_45_, i_46_);
					continue;
				    }
				}
				if (!class173.aBoolean2380 && bool_54_) {
				    class173.aBoolean2380 = true;
				    if (class173.anObjectArray2313 != null) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aBoolean4282 = true;
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anInt4279
					    = Class207.anInt3022 - i_45_;
					class131_sub14.anInt4285
					    = Class131_Sub11.anInt4246 - i_46_;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2313;
					Class87.aClass119_1138.method1018
					    ((byte) -123, class131_sub14);
				    }
				}
				if (class173.aBoolean2380 && bool_53_
				    && class173.anObjectArray2318 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aBoolean4282 = true;
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anInt4279
					= Class144.anInt1914 - i_45_;
				    class131_sub14.anInt4285
					= Class23_Sub4_Sub3.anInt5005 - i_46_;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2318;
				    Class87.aClass119_1138.method1018
					((byte) -122, class131_sub14);
				}
				if (class173.aBoolean2380 && !bool_53_) {
				    class173.aBoolean2380 = false;
				    if (class173.anObjectArray2328 != null) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aBoolean4282 = true;
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anInt4279
					    = Class144.anInt1914 - i_45_;
					class131_sub14.anInt4285
					    = (Class23_Sub4_Sub3.anInt5005
					       - i_46_);
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2328;
					Class131_Sub24.aClass119_4467
					    .method1018
					    ((byte) -125, class131_sub14);
				    }
				}
				if (bool_53_
				    && class173.anObjectArray2395 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aBoolean4282 = true;
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anInt4279
					= Class144.anInt1914 - i_45_;
				    class131_sub14.anInt4285
					= Class23_Sub4_Sub3.anInt5005 - i_46_;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2395;
				    Class87.aClass119_1138.method1018
					((byte) -125, class131_sub14);
				}
				if (!class173.aBoolean2413 && bool) {
				    class173.aBoolean2413 = true;
				    if (class173.anObjectArray2462 != null) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aBoolean4282 = true;
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anInt4279
					    = Class144.anInt1914 - i_45_;
					class131_sub14.anInt4285
					    = (Class23_Sub4_Sub3.anInt5005
					       - i_46_);
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2462;
					Class87.aClass119_1138.method1018
					    ((byte) -126, class131_sub14);
				    }
				}
				if (class173.aBoolean2413 && bool
				    && class173.anObjectArray2446 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aBoolean4282 = true;
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anInt4279
					= Class144.anInt1914 - i_45_;
				    class131_sub14.anInt4285
					= Class23_Sub4_Sub3.anInt5005 - i_46_;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2446;
				    Class87.aClass119_1138.method1018
					((byte) -126, class131_sub14);
				}
				if (class173.aBoolean2413 && !bool) {
				    class173.aBoolean2413 = false;
				    if (class173.anObjectArray2402 != null) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aBoolean4282 = true;
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anInt4279
					    = Class144.anInt1914 - i_45_;
					class131_sub14.anInt4285
					    = (Class23_Sub4_Sub3.anInt5005
					       - i_46_);
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2402;
					Class131_Sub24.aClass119_4467
					    .method1018
					    ((byte) -122, class131_sub14);
				    }
				}
				if (class173.anObjectArray2316 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2316;
				    Class172.aClass119_2289.method1018
					((byte) -128, class131_sub14);
				}
				if (class173.anObjectArray2302 != null
				    && (Class193.anInt2838
					> class173.anInt2435)) {
				    if (class173.anIntArray2388 == null
					|| (Class193.anInt2838
					    - class173.anInt2435) > 32) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2302;
					Class87.aClass119_1138.method1018
					    ((byte) -120, class131_sub14);
				    } else {
				    while_4_:
					for (int i_74_ = class173.anInt2435;
					     i_74_ < Class193.anInt2838;
					     i_74_++) {
					    int i_75_ = (Class1_Sub7_Sub1
							 .anIntArray5213
							 [i_74_ & 0x1f]);
					    for (int i_76_ = 0;
						 (i_76_
						  < (class173
						     .anIntArray2388).length);
						 i_76_++) {
						if ((class173.anIntArray2388
						     [i_76_])
						    == i_75_) {
						    Class131_Sub14 class131_sub14
							= new Class131_Sub14();
						    class131_sub14
							.aClass173_4276
							= class173;
						    class131_sub14
							.anObjectArray4281
							= (class173
							   .anObjectArray2302);
						    Class87.aClass119_1138
							.method1018
							((byte) -125,
							 class131_sub14);
						    break while_4_;
						}
					    }
					}
				    }
				    class173.anInt2435 = Class193.anInt2838;
				}
				if (class173.anObjectArray2296 != null
				    && (Class131_Sub2_Sub24.anInt5892
					> class173.anInt2333)) {
				    if (class173.anIntArray2299 == null
					|| (Class131_Sub2_Sub24.anInt5892
					    - class173.anInt2333) > 32) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2296;
					Class87.aClass119_1138.method1018
					    ((byte) -128, class131_sub14);
				    } else {
				    while_5_:
					for (int i_77_ = class173.anInt2333;
					     (i_77_
					      < Class131_Sub2_Sub24.anInt5892);
					     i_77_++) {
					    int i_78_ = (Class131_Sub41_Sub8
							 .anIntArray6269
							 [i_77_ & 0x1f]);
					    for (int i_79_ = 0;
						 (i_79_
						  < (class173
						     .anIntArray2299).length);
						 i_79_++) {
						if ((class173.anIntArray2299
						     [i_79_])
						    == i_78_) {
						    Class131_Sub14 class131_sub14
							= new Class131_Sub14();
						    class131_sub14
							.aClass173_4276
							= class173;
						    class131_sub14
							.anObjectArray4281
							= (class173
							   .anObjectArray2296);
						    Class87.aClass119_1138
							.method1018
							((byte) -127,
							 class131_sub14);
						    break while_5_;
						}
					    }
					}
				    }
				    class173.anInt2333
					= Class131_Sub2_Sub24.anInt5892;
				}
				if (class173.anObjectArray2439 != null
				    && (Class212.anInt3113
					> class173.anInt2389)) {
				    if (class173.anIntArray2452 == null
					|| (Class212.anInt3113
					    - class173.anInt2389) > 32) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2439;
					Class87.aClass119_1138.method1018
					    ((byte) -123, class131_sub14);
				    } else {
				    while_6_:
					for (int i_80_ = class173.anInt2389;
					     i_80_ < Class212.anInt3113;
					     i_80_++) {
					    int i_81_
						= (Class159.anIntArray2124
						   [i_80_ & 0x1f]);
					    for (int i_82_ = 0;
						 (i_82_
						  < (class173
						     .anIntArray2452).length);
						 i_82_++) {
						if ((class173.anIntArray2452
						     [i_82_])
						    == i_81_) {
						    Class131_Sub14 class131_sub14
							= new Class131_Sub14();
						    class131_sub14
							.aClass173_4276
							= class173;
						    class131_sub14
							.anObjectArray4281
							= (class173
							   .anObjectArray2439);
						    Class87.aClass119_1138
							.method1018
							((byte) -123,
							 class131_sub14);
						    break while_6_;
						}
					    }
					}
				    }
				    class173.anInt2389 = Class212.anInt3113;
				}
				if (class173.anObjectArray2454 != null
				    && (Class131_Sub43.anInt4696
					> class173.anInt2396)) {
				    if (class173.anIntArray2472 == null
					|| (Class131_Sub43.anInt4696
					    - class173.anInt2396) > 32) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2454;
					Class87.aClass119_1138.method1018
					    ((byte) -124, class131_sub14);
				    } else {
				    while_7_:
					for (int i_83_ = class173.anInt2396;
					     i_83_ < Class131_Sub43.anInt4696;
					     i_83_++) {
					    int i_84_
						= (Class190.anIntArray2809
						   [i_83_ & 0x1f]);
					    for (int i_85_ = 0;
						 (i_85_
						  < (class173
						     .anIntArray2472).length);
						 i_85_++) {
						if ((class173.anIntArray2472
						     [i_85_])
						    == i_84_) {
						    Class131_Sub14 class131_sub14
							= new Class131_Sub14();
						    class131_sub14
							.aClass173_4276
							= class173;
						    class131_sub14
							.anObjectArray4281
							= (class173
							   .anObjectArray2454);
						    Class87.aClass119_1138
							.method1018
							((byte) -120,
							 class131_sub14);
						    break while_7_;
						}
					    }
					}
				    }
				    class173.anInt2396
					= Class131_Sub43.anInt4696;
				}
				if (class173.anObjectArray2410 != null
				    && (Class131_Sub2.anInt4104
					> class173.anInt2347)) {
				    if (class173.anIntArray2360 == null
					|| (Class131_Sub2.anInt4104
					    - class173.anInt2347) > 32) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2410;
					Class87.aClass119_1138.method1018
					    ((byte) -127, class131_sub14);
				    } else {
				    while_8_:
					for (int i_86_ = class173.anInt2347;
					     i_86_ < Class131_Sub2.anInt4104;
					     i_86_++) {
					    int i_87_ = (Class131_Sub2_Sub36
							 .anIntArray6050
							 [i_86_ & 0x1f]);
					    for (int i_88_ = 0;
						 (i_88_
						  < (class173
						     .anIntArray2360).length);
						 i_88_++) {
						if ((class173.anIntArray2360
						     [i_88_])
						    == i_87_) {
						    Class131_Sub14 class131_sub14
							= new Class131_Sub14();
						    class131_sub14
							.aClass173_4276
							= class173;
						    class131_sub14
							.anObjectArray4281
							= (class173
							   .anObjectArray2410);
						    Class87.aClass119_1138
							.method1018
							((byte) -120,
							 class131_sub14);
						    break while_8_;
						}
					    }
					}
				    }
				    class173.anInt2347
					= Class131_Sub2.anInt4104;
				}
				if ((Class131_Sub17.anInt4370
				     > class173.anInt2365)
				    && class173.anObjectArray2344 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2344;
				    Class87.aClass119_1138.method1018
					((byte) -122, class131_sub14);
				}
				if ((Class131_Sub35.anInt4587
				     > class173.anInt2365)
				    && class173.anObjectArray2464 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2464;
				    Class87.aClass119_1138.method1018
					((byte) -122, class131_sub14);
				}
				if (Class126.anInt1692 > class173.anInt2365
				    && class173.anObjectArray2483 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2483;
				    Class87.aClass119_1138.method1018
					((byte) -127, class131_sub14);
				}
				if ((Class131_Sub41_Sub20.anInt6424
				     > class173.anInt2365)
				    && class173.anObjectArray2399 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2399;
				    Class87.aClass119_1138.method1018
					((byte) -120, class131_sub14);
				}
				if ((Class131_Sub2_Sub39.anInt6079
				     > class173.anInt2365)
				    && class173.anObjectArray2336 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2336;
				    Class87.aClass119_1138.method1018
					((byte) -123, class131_sub14);
				}
				class173.anInt2365 = Class23_Sub5.anInt3758;
				if (class173.anObjectArray2447 != null) {
				    for (int i_89_ = 0;
					 i_89_ < Class22.anInt246; i_89_++) {
					Class131_Sub14 class131_sub14
					    = new Class131_Sub14();
					class131_sub14.aClass173_4276
					    = class173;
					class131_sub14.anInt4292
					    = (Class131_Sub2_Sub7
					       .anIntArray5640[i_89_]);
					class131_sub14.anInt4283
					    = Class60.anIntArray789[i_89_];
					class131_sub14.anObjectArray4281
					    = class173.anObjectArray2447;
					Class87.aClass119_1138.method1018
					    ((byte) -124, class131_sub14);
				    }
				}
				if (Class131_Sub32.aBoolean4553
				    && class173.anObjectArray2348 != null) {
				    Class131_Sub14 class131_sub14
					= new Class131_Sub14();
				    class131_sub14.aClass173_4276 = class173;
				    class131_sub14.anObjectArray4281
					= class173.anObjectArray2348;
				    Class87.aClass119_1138.method1018
					((byte) -126, class131_sub14);
				}
			    }
			    if (class173.anInt2470 == 5
				&& class173.anInt2453 != -1)
				class173.method2460((byte) 119).method2750
				    (class173.anInt2437, -18995,
				     Class183_Sub1.aClass130_4960);
			}
			if (!class173.aBoolean2355
			    && Class22_Sub1.aClass173_3666 == null
			    && Class131_Sub2_Sub24.aClass173_5906 == null
			    && !Class131_Sub2_Sub24.aBoolean5890) {
			    if ((class173.anInt2448 >= 0
				 || class173.anInt2451 != 0)
				&& Class144.anInt1914 >= i_47_
				&& Class23_Sub4_Sub3.anInt5005 >= i_48_
				&& Class144.anInt1914 < i_49_
				&& Class23_Sub4_Sub3.anInt5005 < i_50_) {
				if (class173.anInt2448 >= 0)
				    Class1_Sub7.aClass173_3585
					= arg0[class173.anInt2448];
				else
				    Class1_Sub7.aClass173_3585 = class173;
			    }
			    if (class173.anInt2470 == 8
				&& Class144.anInt1914 >= i_47_
				&& Class23_Sub4_Sub3.anInt5005 >= i_48_
				&& Class144.anInt1914 < i_49_
				&& Class23_Sub4_Sub3.anInt5005 < i_50_)
				Class18.aClass173_193 = class173;
			    if (class173.anInt2479 > class173.anInt2437)
				Class60.method648((byte) -92, i_46_,
						  Class144.anInt1914, class173,
						  class173.anInt2437,
						  i_45_ + class173.anInt2411,
						  class173.anInt2479,
						  Class23_Sub4_Sub3.anInt5005);
			}
			Class23_Sub1_Sub1.method300(arg2, i_45_, arg5, arg4,
						    true, i_46_, arg3,
						    class173);
			if (class173.anInt2470 == 0) {
			    method70(arg0, class173.anInt2455, i_47_, i_48_,
				     i_49_, i_50_, i_45_ - class173.anInt2427,
				     i_46_ - class173.anInt2415, arg8, arg9);
			    if (class173.aClass173Array2326 != null)
				method70(class173.aClass173Array2326,
					 class173.anInt2455, i_47_, i_48_,
					 i_49_, i_50_,
					 i_45_ - class173.anInt2427,
					 i_46_ - class173.anInt2415, arg8,
					 arg9);
			    Class131_Sub33 class131_sub33
				= ((Class131_Sub33)
				   (Class83.aClass180_1096.method2521
				    (-101, (long) class173.anInt2455)));
			    if (class131_sub33 != null) {
				if (class131_sub33.anInt4555 == 0
				    && !Class131_Sub2_Sub24.aBoolean5890
				    && bool && !Class23_Sub5.aBoolean3761)
				    Class131_Sub41.method1915((byte) 51);
				Class143.method2150(i_48_, -91, i_46_, i_47_,
						    i_45_, i_50_, arg9, i_49_,
						    arg8,
						    class131_sub33.anInt4556);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method71() {
	int i = (Canvas_Sub1.aBoolean42 ? Class131_Sub38.anInt4618
		 : Class131_Sub38.anInt4618 + Class131_Sub41_Sub2.anInt6186);
	for (int i_90_ = -1; i_90_ < i; i_90_++) {
	    Class23_Sub4_Sub1 class23_sub4_sub1;
	    if (i_90_ < 0)
		class23_sub4_sub1 = Class166.aClass23_Sub4_Sub1_Sub2_2216;
	    else if (i_90_ < Class131_Sub38.anInt4618)
		class23_sub4_sub1 = (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				     [Class148.anIntArray1983[i_90_]]);
	    else
		class23_sub4_sub1
		    = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		       [(Class131_Sub41_Sub12.anIntArray6316
			 [i_90_ - Class131_Sub38.anInt4618])]);
	    if (class23_sub4_sub1.anInt5273 >= 0) {
		int i_91_ = class23_sub4_sub1.method335((byte) -62);
		if ((i_91_ & 0x1) == 0) {
		    if ((class23_sub4_sub1.anInt3733 & 0x7f) == 0
			&& (class23_sub4_sub1.anInt3747 & 0x7f) == 0)
			continue;
		} else if ((class23_sub4_sub1.anInt3733 & 0x7f) == 64
			   && (class23_sub4_sub1.anInt3747 & 0x7f) == 64)
		    continue;
		if (class23_sub4_sub1 instanceof Class23_Sub4_Sub1_Sub2
		    && class23_sub4_sub1.anInterface6_5333 != null
		    && Class125.anInt1632 >= class23_sub4_sub1.anInt5324
		    && Class125.anInt1632 < class23_sub4_sub1.anInt5332)
		    ((Class23_Sub4_Sub1_Sub2) class23_sub4_sub1).aBoolean6510
			= false;
		class23_sub4_sub1.anInt3746
		    = RuntimeException_Sub1.method2833((class23_sub4_sub1
							.anInt3747),
						       -86,
						       (class23_sub4_sub1
							.anInt3733),
						       Class29.anInt300);
		Class131_Sub23.method1823(class23_sub4_sub1, true);
	    }
	}
    }
    
    public void method48(int arg0) {
	try {
	    anInt3466++;
	    method55((byte) 0);
	    Class101.method888(true);
	    Class144.method2154((byte) -117);
	    Class100.method873(false);
	    Class9.method184((byte) 41);
	    Class130.method1199(-29885);
	    Class56.method627(93);
	    Class87.method818(64);
	    Class33.method449((byte) 18);
	    Class179.method2510(0);
	    Class88.method830((byte) -61);
	    Class176.method2487((byte) 0);
	    Class22_Sub1.method281(95);
	    Class158.method2350(false);
	    Class163.method2399((byte) 120);
	    Class85.method806(520);
	    Class214.method2788((byte) 102);
	    Class23_Sub4_Sub1_Sub1.method354(-14754);
	    PacketStream.method1797(arg0 + 36639);
	    Class19.method246(-109);
	    Class131_Sub41_Sub1.method1927(-1);
	    Class177.method2492((byte) 113);
	    Class209.method2757((byte) -48);
	    Class50.method581(0);
	    Class173.method2456(3);
	    Class39.method502(arg0 ^ ~0x106e);
	    Class23_Sub4_Sub1_Sub2.method364(arg0 ^ 0x1026);
	    Class180.method2529((byte) 87);
	    Class119.method1008(0);
	    Class34.method458(-14600);
	    Class184.method2550(0);
	    Class52.method598((byte) -127);
	    Class131_Sub1_Sub1.method1393((byte) 111);
	    Class215.method2801((byte) 107);
	    Class71.method743(arg0 ^ ~0x6cde);
	    Class188.method2599((byte) -89);
	    Class161.method2385(false);
	    Class23_Sub4_Sub1.method334((byte) 117);
	    Class44.method536((byte) -19);
	    Class147.method2173(arg0 ^ ~0x105b);
	    Class131_Sub3.method1649(10);
	    Class131_Sub18.method1805((byte) -80);
	    Class131_Sub33.method1868((byte) 115);
	    Class131_Sub37.method1890(arg0 ^ 0x598fa635);
	    Class183.method2538(18391);
	    Class131_Sub27.method1837((byte) -53);
	    Class55.method622(arg0 + 4252);
	    Class116.method997(77);
	    Class154.method2271(false);
	    Class68.method725(-8657);
	    Class105.method917(-110);
	    Class131_Sub8.method1672(74);
	    Class83.method800(-16033);
	    Class53.method606((byte) 77);
	    Class131.method1350((byte) 55);
	    Class175.method2480((byte) -32);
	    Cryption.method2104(false);
	    Class1.method96(199);
	    Class159.method2377(119);
	    Class131_Sub41_Sub10.method1998(117);
	    Class141.method2134(14);
	    Class37.method493(arg0 + 28256);
	    Class12.method212(1);
	    RuntimeException_Sub1.method2835((byte) -66);
	    Class146.method2169((byte) -110);
	    Class131_Sub41_Sub21_Sub2.method2081(true);
	    Class131_Sub41_Sub21_Sub1.method2079(0);
	    Class172.method2452((byte) 95);
	    Class187.method2571(0);
	    Class213.method2769(-115);
	    Class150.method2189(arg0 + 4312);
	    Class204.method2732(25106);
	    Class14.method214((byte) -15);
	    Class66.method693(arg0 ^ ~0x105a);
	    Class29.method428(-25276);
	    Class103.method902(0);
	    Class28.method413(false);
	    Class201.method2720((byte) -63);
	    Class192.method2621(123);
	    Class74.method754((byte) -58);
	    Class118.method1003((byte) -118);
	    Class79.method783(2);
	    Class126.method1109((byte) -65);
	    Class91.method845(-128);
	    Class18.method233((byte) -128);
	    Class133.method2095(-124);
	    Class45.method559(671288225);
	    Class47.method577(arg0 ^ 0x1002);
	    Class128_Sub1.method1147((byte) 4);
	    Class69.method738(81);
	    Class166.method2421((byte) 127);
	    Class131_Sub30.method1855((byte) 64);
	    Class131_Sub11.method1697((byte) 85);
	    Class114.method964();
	    Class131_Sub1_Sub4.method1448(7);
	    Class131_Sub9.method1688((byte) -26);
	    Class212.method2767(arg0 + -22423);
	    Class220.method2829(-1);
	    Class145.method2167(false);
	    Class22.method268((byte) 39);
	    Class127_Sub1.method1135(64);
	    Class168.method2434();
	    Class127.method1111();
	    Class219.method2821(false);
	    Class131_Sub20.method1816(-11532);
	    Class140.method2130();
	    Class193.method2628(12141);
	    Class94.method863(0);
	    Class131_Sub41_Sub21.method2074(0);
	    Class4.method157(-151);
	    Class137.method2115((byte) -65);
	    Class42.method519((byte) 116);
	    Class131_Sub41_Sub19.method2062(true);
	    Class78.method779((byte) 66);
	    Class131_Sub41_Sub16.method2040((byte) -56);
	    Class131_Sub41.method1916(true);
	    Class189.method2602(arg0 + 4178);
	    Class108.method931((byte) 39);
	    Class40.method511(arg0 ^ ~0x105a);
	    Class131_Sub41_Sub20.method2070((byte) -126);
	    Class148.method2179(48);
	    Class135.method2100(1);
	    Class72.method749((byte) 124);
	    Class112.method959(false);
	    Class151.method2190(false);
	    Class57.method628(-109);
	    Class131_Sub41_Sub7.method1969(126);
	    Class131_Sub41_Sub8.method1976(false);
	    Class111.method952(arg0 ^ ~0x1050);
	    Class131_Sub41_Sub4.method1946(32335);
	    Class63.method659(false);
	    Class98.method865((byte) 127);
	    Class93.method854(2048);
	    Class143.method2142(false);
	    Class92.method847((byte) -48);
	    Class131_Sub41_Sub9.method1989(-128);
	    Class131_Sub41_Sub18.method2054((byte) -79);
	    Class58.method636(true);
	    Class75.method765((byte) 61);
	    Class134.method2098(false);
	    Class49.method580(arg0 ^ ~0x1059);
	    Class196.method2664();
	    Class43.method524((byte) 115);
	    Class113.method961((byte) 9);
	    Class131_Sub14.method1711(false);
	    Class131_Sub41_Sub15.method2035(0);
	    Class23_Sub4.method322(arg0 ^ ~0x105a);
	    Class23.method296(-22215);
	    Class1_Sub2.method97((byte) 26);
	    Class171.method2444(30262);
	    Class1_Sub6.method114();
	    Class120.method1023(69);
	    Class203.method2727((byte) 56);
	    Class131_Sub8_Sub1.method1678(-21);
	    Class23_Sub5.method395(7893);
	    Class23_Sub3.method317((byte) -110);
	    Class23_Sub1.method297((byte) 80);
	    Class23_Sub2.method309(10191);
	    Class82.method794(1);
	    Class138.method2119(false);
	    Class131_Sub41_Sub13.method2015((byte) 94);
	    Class21.method262(6044);
	    Class218.method2820(-1);
	    Class131_Sub13.method1708(-11003);
	    Class182.method2537((byte) 112);
	    Class6.method163(32);
	    Class164.method2409((byte) -102);
	    Class131_Sub32.method1865(arg0 ^ ~0x800);
	    Class131_Sub41_Sub6.method1964(false);
	    Class131_Sub19.method1812(95);
	    Class31.method436((byte) 23);
	    Class107.method921(32);
	    Class155.method2335(65459);
	    Class165.method2411(false);
	    Class131_Sub38.method1892((byte) 55);
	    Class205.method2734();
	    Class5.method160(0);
	    Class160.method2381(false);
	    Class1_Sub4.method108((byte) 47);
	    Class23_Sub4_Sub2.method366(88);
	    Class23_Sub4_Sub4.method385((byte) 117);
	    Class2.method144(42);
	    Class17.method227((byte) 64);
	    Class131_Sub10.method1693(true);
	    Class23_Sub3_Sub1.method321(-128);
	    Class23_Sub1_Sub1.method298(false);
	    Class190.method2609(-110);
	    Class23_Sub2_Sub1.method311(false);
	    Class23_Sub4_Sub3.method375(0);
	    Class23_Sub5_Sub1.method396(1);
	    Class167.method2429((byte) -126);
	    Class131_Sub17.method1802(arg0 + 4187);
	    Class195.method2662();
	    Class104.method911(98);
	    Class20.method255(arg0 ^ ~0x100a);
	    Class67.method703((byte) -30);
	    Canvas_Sub1.method75((byte) 38);
	    Class60.method649((byte) 119);
	    Class169.method2439((byte) -125);
	    Class191.method2620((byte) -117);
	    Login.method1155(arg0 ^ arg0);
	    Class197.method2675(-44);
	    Class3.method148();
	    Class211.method2762(14230);
	    Class131_Sub41_Sub17.method2046(732);
	    Class131_Sub41_Sub17_Sub1.method2051((byte) -87);
	    Class106.method920(arg0 + -3447);
	    Class131_Sub6.method1661(123);
	    Class131_Sub22.method1821(85);
	    Class207.method2748((byte) -119);
	    Class215_Sub1.method2808();
	    Class185.method2554();
	    Class1_Sub7.method127(arg0 ^ 0x1032);
	    Class210.method2761(-23369);
	    Class156.method2340(18000);
	    Class131_Sub29.method1848(0);
	    Class131_Sub24.method1827((byte) -65);
	    Class131_Sub41_Sub11.method1999(0);
	    Class131_Sub41_Sub11_Sub1.method2005((byte) 86);
	    Class76.method767(-31742);
	    Class131_Sub39.method1895();
	    Class216.method2816();
	    Class128.method1137((byte) -100);
	    Class35.method464(false);
	    Class123.method1076();
	    Class64.method668((byte) -128);
	    Class131_Sub2.method1464((byte) -125);
	    Class199.method2712(64);
	    Class131_Sub2_Sub4.method1489(arg0 ^ 0x1075);
	    Class59.method645((byte) -40);
	    Class131_Sub2_Sub10.method1516(arg0 ^ 0x1066);
	    Class131_Sub2_Sub12.method1530((byte) 65);
	    Class131_Sub4.method1651(arg0 ^ ~0x1034);
	    Class131_Sub2_Sub17.method1554((byte) 112);
	    Class1_Sub7_Sub1.method133(32);
	    Class131_Sub41_Sub12.method2011(false);
	    Class120_Sub1.method1033(-78);
	    Class138_Sub1.method2124(arg0 + 4083);
	    Class153.method2225(false);
	    Class131_Sub7.method1665(arg0 + 4313);
	    Class157.method2342(-102);
	    Class77.method776((byte) -116);
	    Class23_Sub5_Sub2.method404(4214);
	    Class23_Sub4_Sub5.method388(arg0 ^ ~0x105a);
	    Class23_Sub1_Sub2.method306((byte) 37);
	    Class23_Sub2_Sub2.method316(true);
	    Class46.method570((byte) 21);
	    Class125.method1102((byte) -20);
	    Class131_Sub35.method1875(106);
	    Class131_Sub2_Sub33.method1627(4080);
	    Class131_Sub2_Sub26.method1595((byte) 21);
	    Class131_Sub2_Sub35.method1633((byte) 54);
	    Class131_Sub2_Sub24.method1586(arg0 + -14480);
	    Class131_Sub2_Sub32.method1625(true);
	    Class131_Sub2_Sub14.method1539(-2399);
	    Class131_Sub2_Sub36.method1635(false);
	    Class131_Sub2_Sub7.method1502(113);
	    Class131_Sub2_Sub28.method1608(120);
	    Class131_Sub2_Sub25.method1590(-97);
	    Class131_Sub2_Sub39.method1646(28835);
	    Class131_Sub2_Sub20.method1570(false);
	    Class131_Sub2_Sub11.method1523(arg0 + 4198);
	    Class131_Sub2_Sub13.method1536((byte) -79);
	    Class131_Sub2_Sub15.method1542(arg0 ^ 0x1022);
	    Class131_Sub2_Sub38.method1643((byte) -113);
	    Class131_Sub2_Sub9.method1510(20480);
	    Class131_Sub2_Sub10_Sub1.method1518(arg0 ^ ~0x1025);
	    Class131_Sub2_Sub29.method1612(85);
	    Class131_Sub2_Sub1.method1476(1);
	    Class131_Sub2_Sub22.method1574(false);
	    Class131_Sub2_Sub18.method1562(arg0 + 4189);
	    Class131_Sub2_Sub3.method1488(arg0 ^ 0x1011);
	    Class131_Sub2_Sub31.method1622(arg0 + 4187);
	    Class131_Sub2_Sub37.method1638(-30260);
	    Class131_Sub2_Sub16.method1547(false);
	    Class131_Sub2_Sub27.method1603(8);
	    Class131_Sub2_Sub2.method1484((byte) -78);
	    Class131_Sub2_Sub21.method1572(false);
	    Class131_Sub2_Sub5.method1493((byte) -9);
	    Class131_Sub2_Sub8.method1508(true);
	    Class131_Sub2_Sub19.method1566(arg0 + 4076);
	    Class131_Sub2_Sub30.method1616(42);
	    PacketParser.method1577(arg0 + 4267);
	    Class131_Sub2_Sub6.method1494((byte) -127);
	    Class154_Sub2.method2316();
	    Class131_Sub5.method1654();
	    Class183_Sub1.method2547((byte) -79);
	    Class46_Sub1.method574((byte) -124);
	    Class153_Sub2.method2238(-1);
	    Class121_Sub2.method1049((byte) 115);
	    Class121.method1041(21521);
	    Class121_Sub2_Sub1.method1053((byte) 41);
	    Class121_Sub1.method1042(47);
	    Class121_Sub3_Sub1.method1061(true);
	    Class121_Sub3.method1058((byte) -75);
	    Class153_Sub1.method2234(32731);
	    Class131_Sub25.method1829(arg0 + 4285);
	    Class131_Sub41_Sub2.method1931((byte) 83);
	    InputStream_Sub1.method82((byte) 41);
	    OutputStream_Sub1.method91(1);
	    Class89.method836((byte) 112);
	    Class131_Sub23.method1824((byte) 48);
	    Class131_Sub42.method2091(320);
	    Class131_Sub41_Sub5.method1953(120);
	    Class131_Sub31.method1862(89);
	    Class131_Sub43.method2093(-121);
	    Class110.method935((byte) -121);
	    Class110_Sub2.method944(arg0 + 4187);
	    Class110_Sub3.method946(arg0 ^ ~0x105a);
	    Class110_Sub1.method942(18161);
	    Class110_Sub4.method950(-63);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"client.H(" + arg0 + ')');
	}
    }
    
    public static void method72() {
	for (int i = 0; i < Class131_Sub41_Sub11_Sub1.anInt6546; i++) {
	    int[] is = Class131_Sub41_Sub19.anIntArrayArray6407[i];
	    for (int i_92_ = 0; i_92_ < Class131_Sub2_Sub26.anInt5931; i_92_++)
		is[i_92_] = 0;
	}
    }
    
    public void method73(int arg0, byte[] arg1) {
	try {
	    anInt3481++;
	    if (arg0 != 16)
		method69();
	    Stream stream = new Stream(arg1);
	    for (;;) {
		int i = stream.readUnsignedByte(86);
		if ((i ^ 0xffffffff) == -1)
		    break;
		if ((i ^ 0xffffffff) != -2) {
		    if ((i ^ 0xffffffff) == -5) {
			int i_93_ = stream.readUnsignedByte(74);
			Class104.anIntArray1357 = new int[i_93_];
			for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
			    Class104.anIntArray1357[i_94_]
				= stream.readUnsignedShort(8104);
			    if (Class104.anIntArray1357[i_94_] == 65535)
				Class104.anIntArray1357[i_94_] = -1;
			}
		    }
		} else {
		    int[] is = Class107.anIntArray1391 = new int[6];
		    is[0] = stream.readUnsignedShort(8104);
		    is[1] = stream.readUnsignedShort(8104);
		    is[2] = (stream.readUnsignedShort
			     (Class23_Sub4_Sub5.method390(arg0, 8120)));
		    is[3] = stream.readUnsignedShort(8104);
		    is[4] = stream.readUnsignedShort(8104);
		    is[5] = stream.readUnsignedShort(8104);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("client.EA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method74(byte arg0) {
	if (!Class131_Sub41_Sub7.aBoolean6255) {
	    while (Class138_Sub1.method2123(-77)) {
		if ((Class23_Sub5_Sub1.aChar5038 ^ 0xffffffff) == -116
		    || Class23_Sub5_Sub1.aChar5038 == 'S')
		    Class131_Sub41_Sub7.aBoolean6255 = true;
	    }
	}
	anInt3480++;
	if ((Class131_Sub41_Sub17_Sub1.anInt6572 ^ 0xffffffff) == -1) {
	    Runtime runtime = Runtime.getRuntime();
	    int i = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			   / 1024L);
	    long l = Class208.method2749(-3913);
	    if (Class131_Sub41_Sub11.aLong6303 == 0L)
		Class131_Sub41_Sub11.aLong6303 = l;
	    if ((i ^ 0xffffffff) < -16385
		&& ((-Class131_Sub41_Sub11.aLong6303 + l ^ 0xffffffffffffffffL)
		    > -5001L)) {
		if ((l - Class1_Sub7.aLong3580 ^ 0xffffffffffffffffL)
		    < -1001L) {
		    System.gc();
		    Class1_Sub7.aLong3580 = l;
		}
		Class131_Sub3.anInt4116 = 5;
		Class131_Sub14.aString4291 = Class28.aString286;
	    } else {
		Class131_Sub14.aString4291 = Class121.aString1585;
		Class131_Sub3.anInt4116 = 5;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 10;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 10) {
	    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
		Class131_Sub2_Sub9.aClass19Array5682[i]
		    = (RuntimeException_Sub1.method2834
		       (false, Class131_Sub41_Sub11_Sub1.anInt6546,
			Class131_Sub2_Sub26.anInt5931));
	    Class131_Sub3.anInt4116 = 10;
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 20;
	    Class131_Sub14.aString4291 = Class131_Sub41_Sub11.aString6300;
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 20) {
	    if (Class131_Sub2_Sub6.aClass176_5618 == null)
		Class131_Sub2_Sub6.aClass176_5618
		    = new Class176(Class46.aClass179_640,
				   Class131_Sub42.aClass88_4688);
	    if (!Class131_Sub2_Sub6.aClass176_5618.method2490((byte) -90)) {
		Class131_Sub3.anInt4116 = 12;
		Class131_Sub14.aString4291 = Class192.aString2825;
	    } else {
		Class131_Sub37.aClass158_4596
		    = Class172.method2451(-118, 0, 1, true, false);
		Class28.aClass158_283
		    = Class172.method2451(-105, 1, 1, true, false);
		Class116.aClass158_1506
		    = Class172.method2451(-88, 2, 1, true, false);
		Class128_Sub1.aClass158_4012
		    = Class172.method2451(-89, 3, 1, true, false);
		Class135.aClass158_1814
		    = Class172.method2451(-124, 4, 1, true, false);
		Class37.aClass158_504
		    = Class172.method2451(-124, 5, 1, true, true);
		Class156.aClass158_2074
		    = Class172.method2451(-108, 6, 1, false, true);
		Class57.aClass158_752
		    = Class172.method2451(-85, 7, 1, true, false);
		Class128.aClass158_1746
		    = Class172.method2451(-124, 8, 1, true, false);
		Class131_Sub2_Sub3.aClass158_5587
		    = Class172.method2451(-103, 9, 1, true, false);
		Class147.aClass158_1943
		    = Class172.method2451(-115, 10, 1, true, false);
		Class82.aClass158_1091
		    = Class172.method2451(-121, 11, 1, true, false);
		Class160.aClass158_2133
		    = Class172.method2451(-102, 12, 1, true, false);
		Class157.aClass158_2076
		    = Class172.method2451(-120, 13, 1, true, false);
		Class164.aClass158_2194
		    = Class172.method2451(-87, 14, 1, false, false);
		Class131_Sub41_Sub21_Sub1.aClass158_6583
		    = Class172.method2451(-96, 15, 1, true, false);
		Class110_Sub3.aClass158_3931
		    = Class172.method2451(-127, 16, 1, true, false);
		Class131_Sub2_Sub25.aClass158_5923
		    = Class172.method2451(-80, 17, 1, true, false);
		Class131_Sub41.aClass158_4666
		    = Class172.method2451(-103, 18, 1, true, false);
		Class131_Sub2_Sub10_Sub1.aClass158_6535
		    = Class172.method2451(-105, 19, 1, true, false);
		Class108.aClass158_1415
		    = Class172.method2451(-88, 20, 1, true, false);
		Class131_Sub41_Sub11_Sub1.aClass158_6549
		    = Class172.method2451(-106, 21, 1, true, false);
		Class23_Sub4_Sub1_Sub1.aClass158_6481
		    = Class172.method2451(-98, 22, 1, true, false);
		Class88.aClass158_1153
		    = Class172.method2451(-93, 23, 1, true, true);
		Class125.aClass158_1627
		    = Class172.method2451(-120, 24, 1, true, false);
		Class20.aClass158_236
		    = Class172.method2451(-112, 25, 1, true, false);
		Class131_Sub2_Sub28.aClass158_5964
		    = Class172.method2451(-126, 26, 1, true, true);
		Class17.aClass158_186
		    = Class172.method2451(-90, 27, 1, true, false);
		Class21.aClass158_242
		    = Class172.method2451(-103, 28, 1, true, true);
		Class131_Sub14.aString4291 = Class131_Sub41_Sub2.aString6190;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 30;
		Class131_Sub3.anInt4116 = 15;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 30) {
	    int i = 0;
	    for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > -30; i_95_++)
		i += (Class167.aClass22_Sub1Array2227[i_95_].method270(0)
		      * Class159.anIntArray2126[i_95_] / 100);
	    if ((i ^ 0xffffffff) != -101) {
		if ((i ^ 0xffffffff) != -1)
		    Class131_Sub14.aString4291
			= Class126.aString1699 + i + "%";
		Class131_Sub3.anInt4116 = 20;
	    } else {
		Class131_Sub3.anInt4116 = 20;
		Class131_Sub14.aString4291 = Class19.aString209;
		Class210.method2760(1, Class128.aClass158_1746);
		Class131_Sub2_Sub12.method1526(-2141602260,
					       Class128.aClass158_1746);
		Class131_Sub41_Sub17_Sub1.anInt6572 = 40;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 40) {
	    if (!Class21.aClass158_242.method2351(true)) {
		Class131_Sub14.aString4291
		    = (Class133.aString1799
		       + Class21.aClass158_242.method2355(112) + "%");
		Class131_Sub3.anInt4116 = 25;
	    } else {
		method73(16, Class21.aClass158_242.method2358(1, 124));
		Class131_Sub41_Sub17_Sub1.anInt6572 = 50;
		Class131_Sub14.aString4291 = Class59.aString782;
		Class131_Sub3.anInt4116 = 25;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 50) {
	    Class131_Sub2_Sub12.method1531((byte) -122, 2, Class58.aBoolean765,
					   22050);
	    Class211.aClass131_Sub1_Sub1_3104 = new Class131_Sub1_Sub1();
	    Class211.aClass131_Sub1_Sub1_3104.method1383(128, (byte) -48, 9);
	    Class131_Sub35.aClass215_4588
		= Class77.method774(Class131_Sub2_Sub15.aCanvas5768,
				    Class23_Sub4.aSignLink_3734, 22050,
				    (byte) 91, 0);
	    Class131_Sub35.aClass215_4588
		.method2806(Class211.aClass131_Sub1_Sub1_3104, -26391);
	    Class131_Sub2_Sub15.method1543(Class211.aClass131_Sub1_Sub1_3104,
					   (Class131_Sub41_Sub21_Sub1
					    .aClass158_6583),
					   Class164.aClass158_2194,
					   Class135.aClass158_1814, -34);
	    aClass215_3470 = Class77.method774(Class131_Sub2_Sub15.aCanvas5768,
					       Class23_Sub4.aSignLink_3734,
					       2048, (byte) 91, 1);
	    Class78.aClass131_Sub1_Sub3_1057 = new Class131_Sub1_Sub3();
	    aClass215_3470.method2806(Class78.aClass131_Sub1_Sub3_1057,
				      -26391);
	    Class49.aClass71_653
		= new Class71(22050, Class131_Sub2_Sub14.anInt5754);
	    Class141.anInt1883
		= Class156.aClass158_2074.method2359(126, "scape main");
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 60;
	    Class131_Sub3.anInt4116 = 30;
	    Class131_Sub14.aString4291 = Class131_Sub2_Sub9.aString5663;
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 60) {
	    int i = Class82.method796(Class157.aClass158_2076, (byte) -127,
				      Class128.aClass158_1746);
	    int i_96_ = Class150.method2188((byte) 21);
	    if (i < i_96_) {
		Class131_Sub3.anInt4116 = 35;
		Class131_Sub14.aString4291
		    = Class121_Sub2.aString3992 + 100 * i / i_96_ + "%";
	    } else {
		Class131_Sub3.anInt4116 = 35;
		Class131_Sub14.aString4291 = Class131_Sub41_Sub6.aString6243;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 70;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 70) {
	    int i = Class131.method1353(0, Class128.aClass158_1746);
	    int i_97_ = Class131_Sub41_Sub21_Sub2.method2084(-96);
	    if ((i ^ 0xffffffff) > (i_97_ ^ 0xffffffff)) {
		Class131_Sub14.aString4291
		    = Class131_Sub2_Sub14.aString5755 + 100 * i / i_97_ + "%";
		Class131_Sub3.anInt4116 = 40;
	    } else {
		Class131_Sub41_Sub17_Sub1.anInt6572 = 80;
		Class131_Sub14.aString4291 = Class23_Sub1_Sub2.aString5139;
		Class131_Sub3.anInt4116 = 40;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 80) {
	    if (!Class131_Sub2_Sub28.aClass158_5964.method2351(true)) {
		Class131_Sub14.aString4291
		    = (Class131_Sub2_Sub30.aString5980
		       + Class131_Sub2_Sub28.aClass158_5964.method2355(108)
		       + "%");
		Class131_Sub3.anInt4116 = 45;
	    } else {
		Class131_Sub2_Sub8.anInterface4_5660
		    = new Class4(Class131_Sub2_Sub28.aClass158_5964,
				 Class131_Sub2_Sub3.aClass158_5587,
				 Class128.aClass158_1746);
		Class131_Sub3.anInt4116 = 45;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 90;
		Class131_Sub14.aString4291 = Class131_Sub2_Sub10.aString5698;
	    }
	} else if ((Class131_Sub41_Sub17_Sub1.anInt6572 ^ 0xffffffff) == -91) {
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 95;
	    Class131_Sub14.aString4291 = Class199.aString2911;
	    Class131_Sub3.anInt4116 = 50;
	} else if ((Class131_Sub41_Sub17_Sub1.anInt6572 ^ 0xffffffff) == -96) {
	    if (Class131_Sub41_Sub7.aBoolean6255) {
		Class131_Sub7.anInt4165 = 0;
		Class91.anInt1184 = 1;
		Class131_Sub41_Sub21.anInt6442 = 0;
		Class131_Sub2_Sub10_Sub1.anInt6537 = 0;
		Class141.anInt1876 = 0;
	    }
	    Class131_Sub41_Sub7.aBoolean6255 = true;
	    Class165.method2413(Class23_Sub4.aSignLink_3734, (byte) -7);
	    Class149.method2183(120);
	    Login.method1154(Class131_Sub2_Sub10_Sub1.anInt6537, (byte) 32,
				false);
	    Class131_Sub3.anInt4116 = 55;
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 100;
	    Class131_Sub14.aString4291 = Class100.aString1326;
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 100) {
	    Class118.method1002(Class128.aClass158_1746, -22073,
				Class157.aClass158_2076,
				Class183_Sub1.aClass130_4960);
	    Class131_Sub3.anInt4116 = 60;
	    Class131_Sub14.aString4291 = Class184.aString2623;
	    Class175.method2484(5, (byte) 80);
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 110;
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 110) {
	    int i = 0;
	    Class116.aClass158_1506.method2351(true);
	    i += Class116.aClass158_1506.method2355(116);
	    Class110_Sub3.aClass158_3931.method2351(true);
	    i += Class110_Sub3.aClass158_3931.method2355(124);
	    Class131_Sub2_Sub25.aClass158_5923.method2351(true);
	    i += Class131_Sub2_Sub25.aClass158_5923.method2355(112);
	    Class131_Sub41.aClass158_4666.method2351(true);
	    i += Class131_Sub41.aClass158_4666.method2355(125);
	    Class131_Sub2_Sub10_Sub1.aClass158_6535.method2351(true);
	    i += Class131_Sub2_Sub10_Sub1.aClass158_6535.method2355(125);
	    Class108.aClass158_1415.method2351(true);
	    i += Class108.aClass158_1415.method2355(119);
	    Class131_Sub41_Sub11_Sub1.aClass158_6549.method2351(true);
	    i += Class131_Sub41_Sub11_Sub1.aClass158_6549.method2355(118);
	    Class23_Sub4_Sub1_Sub1.aClass158_6481.method2351(true);
	    i += Class23_Sub4_Sub1_Sub1.aClass158_6481.method2355(117);
	    Class125.aClass158_1627.method2351(true);
	    i += Class125.aClass158_1627.method2355(117);
	    Class20.aClass158_236.method2351(true);
	    i += Class20.aClass158_236.method2355(112);
	    Class17.aClass158_186.method2351(true);
	    i += Class17.aClass158_186.method2355(116);
	    if (i < 1100) {
		Class131_Sub14.aString4291 = Class5.aString88 + i / 11 + "%";
		Class131_Sub3.anInt4116 = 65;
	    } else {
		Class184.method2551(Class116.aClass158_1506, true);
		Class105.method915(21187, Class116.aClass158_1506);
		Class151.method2192(Class116.aClass158_1506, 2);
		Class155.method2338(Class116.aClass158_1506, -83,
				    Class57.aClass158_752);
		Class45.method562(2, Class57.aClass158_752, true,
				  Class110_Sub3.aClass158_3931);
		Class121_Sub1.method1045(Class57.aClass158_752,
					 Class131_Sub41.aClass158_4666, -2437,
					 true);
		Class131_Sub41_Sub21_Sub2.method2082((Class131_Sub2_Sub10_Sub1
						      .aClass158_6535),
						     Class57.aClass158_752,
						     (byte) -55, true);
		Class131_Sub6.method1664((byte) 8, Class116.aClass158_1506);
		Class131_Sub14.method1714(true, Class131_Sub37.aClass158_4596,
					  Class28.aClass158_283,
					  Class108.aClass158_1415);
		Class167.method2428(true, Class116.aClass158_1506);
		Class31.method440(Class131_Sub41_Sub11_Sub1.aClass158_6549,
				  Class57.aClass158_752, (byte) 113);
		Class131_Sub14
		    .method1712(Class23_Sub4_Sub1_Sub1.aClass158_6481, -109);
		Class17.method228(Class116.aClass158_1506, (byte) 124);
		Class57.method629(Class57.aClass158_752,
				  Class128_Sub1.aClass158_4012,
				  Class157.aClass158_2076,
				  Class128.aClass158_1746, (byte) 120);
		Class5.method159(-98, Class116.aClass158_1506);
		Class23.method290((byte) 87,
				  Class131_Sub2_Sub25.aClass158_5923);
		Class131_Sub2_Sub26.method1594(Class20.aClass158_236, 1,
					       Class125.aClass158_1627,
					       new Class111());
		Class14.method218(Class125.aClass158_1627, false,
				  Class20.aClass158_236);
		method61((byte) 84, Class116.aClass158_1506);
		Class131_Sub2_Sub27.method1604(true, Class116.aClass158_1506);
		Class43.method523(Class116.aClass158_1506, false);
		Class131_Sub41_Sub5.method1955((byte) 122,
					       Class116.aClass158_1506,
					       Class128.aClass158_1746);
		Class131_Sub2_Sub26.method1593(Class116.aClass158_1506, -21443,
					       Class128.aClass158_1746);
		Class131_Sub2.method1469(Class116.aClass158_1506, 6193);
		Class131_Sub2_Sub13.method1533(36, Class128.aClass158_1746,
					       Class116.aClass158_1506);
		Class19.method240(Class116.aClass158_1506, -18066);
		Class64.method671(-93, Class116.aClass158_1506);
		Class131_Sub14.aString4291 = Class34.aString490;
		Class131_Sub3.anInt4116 = 65;
		Class33.method442(-117);
		Class131_Sub41_Sub17_Sub1.anInt6572 = 120;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 120) {
	    int i = Class207.method2747(3160, Class128.aClass158_1746);
	    int i_98_ = Class166.method2416((byte) -107);
	    if (i_98_ > i) {
		Class131_Sub14.aString4291
		    = Class131_Sub41_Sub13.aString6329 + 100 * i / i_98_ + "%";
		Class131_Sub3.anInt4116 = 70;
	    } else {
		Class166.method2415(Class183_Sub1.aClass130_4960, -31889,
				    Class128.aClass158_1746);
		Class131_Sub25.method1831((byte) -31,
					  Class201.aClass152Array2930);
		Class131_Sub3.anInt4116 = 70;
		Class131_Sub14.aString4291 = Class131_Sub2_Sub31.aString6001;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 130;
	    }
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 130) {
	    Class6.aClass56_96 = new Class56();
	    Class23_Sub4.aSignLink_3734.method2692((byte) 107,
						   Class6.aClass56_96, 10);
	    Class131_Sub3.anInt4116 = 75;
	    Class131_Sub41_Sub17_Sub1.anInt6572 = 140;
	    Class131_Sub14.aString4291 = Class131_Sub18.aString4386;
	} else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 140) {
	    if (!Class147.aClass158_1943.method2363(-1, "", "huffman")) {
		Class131_Sub14.aString4291 = Class153.aString2036 + "0%";
		Class131_Sub3.anInt4116 = 80;
	    } else {
		Class75 class75
		    = new Class75(Class147.aClass158_1943
				      .method2370("huffman", "", (byte) 108));
		Class131_Sub7.method1670(class75, true);
		Class131_Sub3.anInt4116 = 80;
		Class131_Sub41_Sub17_Sub1.anInt6572 = 150;
		Class131_Sub14.aString4291 = Class131_Sub10.aString4220;
	    }
	} else {
	    if (arg0 > -39)
		anInt3467 = 73;
	    if (Class131_Sub41_Sub17_Sub1.anInt6572 == 150) {
		if (!Class128_Sub1.aClass158_4012.method2351(true)) {
		    Class131_Sub14.aString4291
			= (Class131_Sub37.aString4608
			   + (Class128_Sub1.aClass158_4012.method2355(114) * 3
			      / 4)
			   + "%");
		    Class131_Sub3.anInt4116 = 85;
		} else if (!Class160.aClass158_2133.method2351(true)) {
		    Class131_Sub14.aString4291
			= (Class131_Sub37.aString4608
			   + (Class160.aClass158_2133.method2355(122) / 10
			      + 75)
			   + "%");
		    Class131_Sub3.anInt4116 = 85;
		} else if (!Class157.aClass158_2076.method2351(true)) {
		    Class131_Sub14.aString4291
			= (Class131_Sub37.aString4608
			   + (85
			      + Class157.aClass158_2076.method2355(124) / 20)
			   + "%");
		    Class131_Sub3.anInt4116 = 85;
		} else if (!Class88.aClass158_1153.method2345((byte) 58,
							      "details")) {
		    Class131_Sub14.aString4291
			= (Class131_Sub37.aString4608
			   + ((Class88.aClass158_1153.method2362("details", 0)
			       / 10)
			      + 90)
			   + "%");
		    Class131_Sub3.anInt4116 = 85;
		} else {
		    Class127.method1116(Class88.aClass158_1153);
		    Class180.method2527(Class17.aClass158_186, 0);
		    Class23_Sub5_Sub2.method400(Class57.aClass158_752,
						(Class131_Sub2_Sub8
						 .anInterface4_5660),
						(byte) 125);
		    Class131_Sub41_Sub17_Sub1.anInt6572 = 170;
		    Class131_Sub14.aString4291
			= Class131_Sub2_Sub4.aString5600;
		    Class131_Sub3.anInt4116 = 90;
		}
	    } else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 160) {
		int i = Class197.method2674(61);
		if ((i ^ 0xffffffff) == 0) {
		    Class131_Sub3.anInt4116 = 90;
		    Class131_Sub14.aString4291 = Class21.aString241;
		} else if ((i ^ 0xffffffff) == -8 || i == 9) {
		    this.method47(1, "worldlistfull");
		    Class175.method2484(1000, (byte) -124);
		} else if (!Class23_Sub1.aBoolean3701) {
		    this.method47(1, "worldlistio_" + i);
		    Class175.method2484(1000, (byte) -121);
		} else {
		    Class131_Sub14.aString4291 = Class131_Sub6.aString4157;
		    Class131_Sub41_Sub17_Sub1.anInt6572 = 170;
		    Class131_Sub3.anInt4116 = 90;
		}
	    } else if ((Class131_Sub41_Sub17_Sub1.anInt6572 ^ 0xffffffff)
		       == -171) {
		Class76.aStringArray1036
		    = new String[Class23_Sub1_Sub2.anInt5156];
		Class131_Sub2_Sub33.anIntArray6025
		    = new int[Class131_Sub41_Sub2.anInt6188];
		Class43.aBooleanArray586
		    = new boolean[Class131_Sub41_Sub2.anInt6188];
		for (int i = 0; Class131_Sub41_Sub2.anInt6188 > i; i++) {
		    if ((Class51.method592(i, -39).anInt6285 ^ 0xffffffff)
			== -1) {
			Class43.aBooleanArray586[i] = true;
			Class57.anInt747++;
		    }
		    Class131_Sub2_Sub33.anIntArray6025[i] = -1;
		}
		Class183_Sub1.method2545((byte) 126);
		Class111.anInt3280
		    = Class128_Sub1.aClass158_4012.method2359(127,
							      "loginscreen");
		Class37.aClass158_504.method2348(-1, true, false);
		Class156.aClass158_2074.method2348(-1, true, true);
		Class128.aClass158_1746.method2348(-1, true, true);
		Class157.aClass158_2076.method2348(-1, true, true);
		Class147.aClass158_1943.method2348(-1, true, true);
		Class128_Sub1.aClass158_4012.method2348(-1, true, true);
		Class116.aClass158_1506.anInt2097 = 2;
		Class47.aBoolean645 = true;
		Class131_Sub2_Sub25.aClass158_5923.anInt2097 = 2;
		Class110_Sub3.aClass158_3931.anInt2097 = 2;
		Class131_Sub41.aClass158_4666.anInt2097 = 2;
		Class131_Sub2_Sub10_Sub1.aClass158_6535.anInt2097 = 2;
		Class108.aClass158_1415.anInt2097 = 2;
		Class131_Sub41_Sub11_Sub1.aClass158_6549.anInt2097 = 2;
		Class148.method2177(Class91.anInt1184, -1, -1, false, true);
		Class131_Sub41_Sub17_Sub1.anInt6572 = 180;
		Class131_Sub3.anInt4116 = 95;
		Class131_Sub14.aString4291 = Class172.aString2294;
	    } else if (Class131_Sub41_Sub17_Sub1.anInt6572 == 180)
		Class52.method601(true, (byte) 127);
	}
    }
    
    public void method49(byte arg0) {
	anInt3471++;
	if ((Class133.anInt1803 ^ 0xffffffff) != -1001) {
	    long l
		= Class121_Sub2.method1052(-5) / 1000000L - Class210.aLong3062;
	    if (arg0 != -88)
		method68(null, -45, null);
	    Class210.aLong3062 = Class121_Sub2.method1052(-5) / 1000000L;
	    boolean bool = Class131_Sub9.method1690(-11354);
	    if (bool && Class23_Sub2.aBoolean3718
		&& Class131_Sub35.aClass215_4588 != null)
		Class131_Sub35.aClass215_4588.method2793((byte) -117);
	    if (Class133.anInt1803 == 30 || Class133.anInt1803 == 10) {
		if ((Class131_Sub2_Sub4.aLong5601 ^ 0xffffffffffffffffL) != -1L
		    && ((Class208.method2749(-3913) ^ 0xffffffffffffffffL)
			< (Class131_Sub2_Sub4.aLong5601
			   ^ 0xffffffffffffffffL)))
		    Class148.method2177(Class131_Sub18.method1806(-127),
					Class90.anInt1176, Class14.anInt163,
					false, true);
		else if (Class183_Sub1.aClass130_4960.method1163()
			 && Class131_Sub2.aBoolean4096)
		    Class131_Sub41_Sub4.method1947((byte) -77);
	    }
	    if (Class74.aFrame1014 == null) {
		java.awt.Container container;
		if (Class158.aFrame2095 == null)
		    container = Class23_Sub4.aSignLink_3734.anApplet2883;
		else
		    container = Class158.aFrame2095;
		int i = container.getSize().width;
		int i_99_ = container.getSize().height;
		if (container == Class158.aFrame2095) {
		    Insets insets = Class158.aFrame2095.getInsets();
		    i -= insets.right + insets.left;
		    i_99_ -= insets.top - -insets.bottom;
		}
		if ((i ^ 0xffffffff) != (Class166.anInt2204 ^ 0xffffffff)
		    || i_99_ != Class131_Sub41_Sub15.anInt6355) {
		    if (Class183_Sub1.aClass130_4960 == null
			|| Class183_Sub1.aClass130_4960.method1170())
			Class85.method812((byte) -128);
		    else {
			Class131_Sub41_Sub15.anInt6355 = i_99_;
			Class166.anInt2204 = i;
		    }
		    Class131_Sub2_Sub4.aLong5601
			= Class208.method2749(-3913) - -500L;
		}
	    }
	    if (Class74.aFrame1014 != null && !Class77.aBoolean1046
		&& (Class133.anInt1803 == 30
		    || (Class133.anInt1803 ^ 0xffffffff) == -11))
		Class148.method2177(Class91.anInt1184, -1, -1, false, true);
	    boolean bool_100_ = false;
	    if (Class151.aBoolean2011) {
		Class151.aBoolean2011 = false;
		bool_100_ = true;
	    }
	    if (bool_100_)
		Class131_Sub2.method1457((byte) 106);
	    if ((Class183_Sub1.aClass130_4960 != null
		 && Class183_Sub1.aClass130_4960.method1206())
		|| Class131_Sub18.method1806(-47) != 1)
		Class131_Sub2_Sub16.method1548((byte) -125);
	    if ((Class133.anInt1803 ^ 0xffffffff) != -1) {
		if ((Class133.anInt1803 ^ 0xffffffff) == -6)
		    Class4.method155(Class1_Sub7_Sub1.aColorArray5221
					 [Class131_Sub2_Sub21.anInt5848]
					 .getRGB(),
				     (byte) 127, Class93.aClass44_1222,
				     bool_100_ | Class183_Sub1
						     .aClass130_4960
						     .method1206(),
				     Class31.aColorArray388
					 [Class131_Sub2_Sub21.anInt5848]
					 .getRGB(),
				     Class183_Sub1.aClass130_4960,
				     Class207.aColorArray3029
					 [Class131_Sub2_Sub21.anInt5848]
					 .getRGB());
		else if (Class133.anInt1803 == 10)
		    Class145.method2164((byte) 127);
		else if ((Class133.anInt1803 ^ 0xffffffff) == -26
			 || (Class133.anInt1803 ^ 0xffffffff) == -29) {
		    if ((Class131_Sub8_Sub1.anInt6098 ^ 0xffffffff) == -2) {
			if (Class87.anInt1144 > Class167.anInt2232)
			    Class167.anInt2232 = Class87.anInt1144;
			int i = ((Class167.anInt2232 + -Class87.anInt1144) * 50
				 / Class167.anInt2232);
			Class131_Sub41_Sub5.method1957(true, -29854,
						       (Class14.aString162
							+ "<br>(" + i + "%)"),
						       Class184.aClass44_2633);
		    } else if ((Class131_Sub8_Sub1.anInt6098 ^ 0xffffffff)
			       != -3)
			Class131_Sub41_Sub5.method1957(true, -29854,
						       Class14.aString162,
						       Class184.aClass44_2633);
		    else {
			if ((Class131_Sub41_Sub10.anInt6293 ^ 0xffffffff)
			    > (Class131_Sub41_Sub17_Sub1.anInt6573
			       ^ 0xffffffff))
			    Class131_Sub41_Sub10.anInt6293
				= Class131_Sub41_Sub17_Sub1.anInt6573;
			int i = ((50
				  * (-Class131_Sub41_Sub17_Sub1.anInt6573
				     + Class131_Sub41_Sub10.anInt6293)
				  / Class131_Sub41_Sub10.anInt6293)
				 + 50);
			Class131_Sub41_Sub5.method1957(true, -29854,
						       (Class14.aString162
							+ "<br>(" + i + "%)"),
						       Class184.aClass44_2633);
		    }
		} else if ((Class133.anInt1803 ^ 0xffffffff) != -31) {
		    if (Class133.anInt1803 == 40)
			Class131_Sub41_Sub5.method1957(true, -29854,
						       (Class220.aString3210
							+ "<br>"
							+ (Class145
							   .aString1931)),
						       Class184.aClass44_2633);
		} else
		    Class131_Sub2_Sub38.method1642(0, l);
	    } else
		Class187.method2578((Class31.aColorArray388
				     [Class131_Sub2_Sub21.anInt5848]),
				    (Class207.aColorArray3029
				     [Class131_Sub2_Sub21.anInt5848]),
				    (Class1_Sub7_Sub1.aColorArray5221
				     [Class131_Sub2_Sub21.anInt5848]),
				    Class131_Sub3.anInt4116, bool_100_,
				    Class131_Sub14.aString4291, arg0 ^ ~0x57);
	    if ((Class131_Sub2_Sub12.anInt5728 ^ 0xffffffff) == -4) {
		for (int i = 0; Class131_Sub29.anInt4514 > i; i++) {
		    Rectangle rectangle = Class98.aRectangleArray1305[i];
		    if (!Class110_Sub4.aBooleanArray3934[i]) {
			if (Class128_Sub1.aBooleanArray4018[i])
			    Class183_Sub1.aClass130_4960.method1201
				(rectangle.width, rectangle.height,
				 rectangle.x, rectangle.y, -1996554240,
				 arg0 + -26);
		    } else
			Class183_Sub1.aClass130_4960.method1201
			    (rectangle.width, rectangle.height, rectangle.x,
			     rectangle.y, -1996553985, 109);
		}
	    }
	    if (Class134.method2099(arg0 ^ ~0x57))
		Class131_Sub41_Sub4.method1941(Class183_Sub1.aClass130_4960,
					       arg0 ^ 0x4d34);
	    if ((Class133.anInt1803 != 30
		 && (Class133.anInt1803 ^ 0xffffffff) != -11)
		|| (Class131_Sub2_Sub12.anInt5728 ^ 0xffffffff) != -1
		|| Class131_Sub18.method1806(-41) != 1 || bool_100_
		|| !SignLink.aString2893.equals("1.1")) {
		if (Class133.anInt1803 != 0) {
		    Class183_Sub1.aClass130_4960.method1166();
		    for (int i = 0;
			 ((i ^ 0xffffffff)
			  > (Class131_Sub29.anInt4514 ^ 0xffffffff));
			 i++)
			Class128_Sub1.aBooleanArray4018[i] = false;
		}
	    } else {
		int i = 0;
		for (int i_101_ = 0;
		     ((i_101_ ^ 0xffffffff)
		      > (Class131_Sub29.anInt4514 ^ 0xffffffff));
		     i_101_++) {
		    if (Class128_Sub1.aBooleanArray4018[i_101_]) {
			Class128_Sub1.aBooleanArray4018[i_101_] = false;
			Class59.aRectangleArray784[i++]
			    = Class98.aRectangleArray1305[i_101_];
		    }
		}
		Class183_Sub1.aClass130_4960
		    .method1211(Class59.aRectangleArray784, i);
	    }
	    if (Class47.aBoolean645)
		Class1_Sub7.method125(74);
	    if (Class131_Sub41_Sub7.aBoolean6255
		&& (Class133.anInt1803 ^ 0xffffffff) == -11
		&& Class187.anInt2674 != -1) {
		Class131_Sub41_Sub7.aBoolean6255 = false;
		Class165.method2413(Class23_Sub4.aSignLink_3734, (byte) -7);
	    }
	}
    }
}
