/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

public class Class166 implements Runnable
{
    public static int anInt2204;
    public static int anInt2205;
    public static int anInt2206;
    public static int anInt2207;
    public static int anInt2208;
    public static int anInt2209;
    public static int anInt2210;
    public static int anInt2211;
    public static long[] aLongArray2212;
    public Class119 aClass119_2213 = new Class119();
    public static int anInt2214;
    public static int anInt2215;
    public static Class23_Sub4_Sub1_Sub2 aClass23_Sub4_Sub1_Sub2_2216;
    public static int[] anIntArray2217;
    public static int[] anIntArray2218;
    public static Class107[] aClass107Array2219 = new Class107[16];
    public static int anInt2220;
    public static int anInt2221 = 0;
    public static int anInt2222;
    public Thread aThread2223;
    public static int anInt2224;
    public static int anInt2225;
    
    public static void method2415(Class130 arg0, int arg1, Class158 arg2) {
	try {
	    anInt2220++;
	    Class124[] class124s
		= Class124.method1084(arg2, Class131_Sub17.anInt4377, 0);
	    Class131_Sub2_Sub10.aClass152Array5701
		= new Class152[class124s.length];
	    for (int i = 0; i < class124s.length; i++)
		Class131_Sub2_Sub10.aClass152Array5701[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class203.anInt2962, 0);
	    Class125.aClass152Array1631 = new Class152[class124s.length];
	    for (int i = 0; class124s.length > i; i++)
		Class125.aClass152Array1631[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class85.anInt1111, 0);
	    Class212.aClass152Array3111 = new Class152[class124s.length];
	    for (int i = 0; (class124s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		Class212.aClass152Array3111[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class55.anInt714, 0);
	    Class131_Sub11.aClass152Array4253 = new Class152[class124s.length];
	    for (int i = 0; class124s.length > i; i++)
		Class131_Sub11.aClass152Array4253[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class110_Sub1.anInt3892, 0);
	    Class131_Sub41_Sub15.aClass152Array6363
		= new Class152[class124s.length];
	    for (int i = 0; (i ^ 0xffffffff) > (class124s.length ^ 0xffffffff);
		 i++)
		Class131_Sub41_Sub15.aClass152Array6363[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class44.anInt600, 0);
	    Class131_Sub35.aClass152Array4585 = new Class152[class124s.length];
	    for (int i = 0; (class124s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		Class131_Sub35.aClass152Array4585[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class131_Sub31.anInt4527, 0);
	    Class153_Sub1.aClass152Array4761 = new Class152[class124s.length];
	    for (int i = 0; (class124s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		Class153_Sub1.aClass152Array4761[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class93.anInt1225, 0);
	    Class131_Sub2_Sub33.aClass152Array6023
		= new Class152[class124s.length];
	    for (int i = 0; class124s.length > i; i++)
		Class131_Sub2_Sub33.aClass152Array6023[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class74.anInt1009, 0);
	    Class29.aClass152Array330 = new Class152[class124s.length];
	    for (int i = 0; i < class124s.length; i++)
		Class29.aClass152Array330[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class209.anInt3055, 0);
	    Class156.aClass152Array2075 = new Class152[class124s.length];
	    for (int i = 0; (class124s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		Class156.aClass152Array2075[i]
		    = arg0.method1178(class124s[i], true);
	    class124s
		= Class124.method1084(arg2, Class131_Sub2_Sub9.anInt5680, 0);
	    Class131_Sub2_Sub30.aClass152Array5994
		= new Class152[class124s.length];
	    for (int i = 0; (class124s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		Class131_Sub2_Sub30.aClass152Array5994[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class105.anInt1368, 0);
	    Class201.aClass152Array2930 = new Class152[class124s.length];
	    for (int i = 0; (i ^ 0xffffffff) > (class124s.length ^ 0xffffffff);
		 i++)
		Class201.aClass152Array2930[i]
		    = arg0.method1178(class124s[i], true);
	    class124s = Class124.method1084(arg2, Class130.anInt1769, 0);
	    Class131_Sub41_Sub20.aClass152Array6425
		= new Class152[class124s.length];
	    if (arg1 != -31889)
		method2420(-117, (byte) -33);
	    for (int i = 0; (i ^ 0xffffffff) > (class124s.length ^ 0xffffffff);
		 i++)
		Class131_Sub41_Sub20.aClass152Array6425[i]
		    = arg0.method1178(class124s[i], true);
	    Class146.aClass152_1939
		= arg0.method1178(Class124.method1087(arg2,
						      (Class131_Sub41_Sub5
						       .anInt6230),
						      0),
				  true);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method2416(byte arg0) {
	try {
	    anInt2207++;
	    if (arg0 >= -37)
		return -87;
	    return 15;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rc.I(" + arg0 + ')');
	}
    }
    
    public void method2417(int arg0, Class131 arg1) {
	try {
	    synchronized (aClass119_2213) {
		aClass119_2213.method1018((byte) -122, arg1);
		aClass119_2213.notify();
		if (arg0 != 85)
		    anIntArray2218 = null;
	    }
	    anInt2222++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2418(int arg0, int arg1, int arg2, boolean arg3,
				  int arg4, int arg5) {
	try {
	    anInt2206++;
	    int i = arg2 - arg1;
	    int i_0_ = -arg4 + arg5;
	    if (i != 0) {
		if (i_0_ == 0) {
		    Class1_Sub4.method109(arg4, arg0, arg2, arg1, (byte) 31);
		    return;
		}
	    } else {
		if ((i_0_ ^ 0xffffffff) != -1)
		    Class108.method932(7787, arg1, arg5, arg0, arg4);
		return;
	    }
	    int i_1_ = (i_0_ << 951618892) / i;
	    int i_2_ = arg4 - (i_1_ * arg1 >> 352694380);
	    int i_3_;
	    int i_4_;
	    if (arg1 >= Class149.anInt1988) {
		if ((Class115.anInt1477 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)) {
		    i_3_ = arg4;
		    i_4_ = arg1;
		} else {
		    i_3_ = i_2_ + (Class115.anInt1477 * i_1_ >> 1265181836);
		    i_4_ = Class115.anInt1477;
		}
	    } else {
		i_3_ = i_2_ - -(Class149.anInt1988 * i_1_ >> 19087628);
		i_4_ = Class149.anInt1988;
	    }
	    int i_5_;
	    int i_6_;
	    if ((Class149.anInt1988 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)) {
		if ((arg2 ^ 0xffffffff) >= (Class115.anInt1477 ^ 0xffffffff)) {
		    i_6_ = arg2;
		    i_5_ = arg5;
		} else {
		    i_6_ = Class115.anInt1477;
		    i_5_ = (i_1_ * Class115.anInt1477 >> 1183043116) + i_2_;
		}
	    } else {
		i_5_ = (i_1_ * Class149.anInt1988 >> 587654636) + i_2_;
		i_6_ = Class149.anInt1988;
	    }
	    if ((Class116.anInt1494 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
		i_3_ = Class116.anInt1494;
		i_4_ = (-i_2_ + Class116.anInt1494 << 43223372) / i_1_;
	    } else if ((Class125.anInt1629 ^ 0xffffffff)
		       > (i_3_ ^ 0xffffffff)) {
		i_3_ = Class125.anInt1629;
		i_4_ = (-i_2_ + Class125.anInt1629 << 524735436) / i_1_;
	    }
	    if ((Class116.anInt1494 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
		i_6_ = (-i_2_ + Class116.anInt1494 << -874391668) / i_1_;
		i_5_ = Class116.anInt1494;
	    } else if (Class125.anInt1629 < i_5_) {
		i_5_ = Class125.anInt1629;
		i_6_ = (-i_2_ + Class125.anInt1629 << 872720012) / i_1_;
	    }
	    Stream.method1718(i_4_, i_6_, arg3, i_5_, arg0, i_3_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public void run() {
	try {
	    anInt2205++;
	    for (;;) {
		Class131_Sub30 class131_sub30;
		synchronized (aClass119_2213) {
		    Class131 class131;
		    for (class131 = aClass119_2213.method1005((byte) 93);
			 class131 == null;
			 class131 = aClass119_2213.method1005((byte) 93)) {
			try {
			    aClass119_2213.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    if (!(class131 instanceof Class131_Sub30))
			break;
		    class131_sub30 = (Class131_Sub30) class131;
		}
		int i;
		try {
		    byte[] is = InetAddress.getByName
				    (class131_sub30.aString4520).getAddress();
		    i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
		} catch (Throwable throwable) {
		    i = 1000;
		}
		class131_sub30.anInt4521 = i;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rc.run(" + ')');
	}
    }
    
    public static void method2419(Interface4 arg0, Class130 arg1, int arg2) {
	try {
	    anInt2209++;
	    if (arg2 != -4648)
		method2415(null, -17, null);
	    if (Class127.aClass131_Sub41_Sub1_1703 != null) {
		if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff) > -11) {
		    if (!Class127.aClass158_1705.method2345
			 ((byte) 58,
			  Class127.aClass131_Sub41_Sub1_1703.aString6167)) {
			Class131_Sub2_Sub36.anInt6049
			    = (Class88.aClass158_1153.method2362
			       (Class127.aClass131_Sub41_Sub1_1703.aString6167,
				0)) / 10;
			return;
		    }
		    Class131_Sub21.method1820((byte) -56);
		    Class131_Sub2_Sub36.anInt6049 = 10;
		}
		if (Class131_Sub2_Sub36.anInt6049 == 10) {
		    Class127.anInt1728
			= (Class127.aClass131_Sub41_Sub1_1703.anInt6165
			   >> -1228515450 << 1704999750);
		    Class127.anInt1725
			= (Class127.aClass131_Sub41_Sub1_1703.anInt6164
			   >> -472635642 << 723404422);
		    Class127.anInt1730
			= 64 + (-Class127.anInt1728
				+ (Class127.aClass131_Sub41_Sub1_1703.anInt6157
				   >> -1093587194 << -1053738426));
		    Class127.anInt1716
			= 64 + (Class127.aClass131_Sub41_Sub1_1703.anInt6174
				>> 235394022
				<< 565732902) + -Class127.anInt1725;
		    int[] is = new int[3];
		    int i = -1;
		    int i_7_ = -1;
		    if (Class127.aClass131_Sub41_Sub1_1703.method1922
			(-120,
			 (Class92.regionX
			  - -(aClass23_Sub4_Sub1_Sub2_2216.anInt3733
			      >> 1268607975)),
			 Class29.anInt300,
			 (Class64.regionY
			  + (aClass23_Sub4_Sub1_Sub2_2216.anInt3747
			     >> -775528217)),
			 is)) {
			i_7_ = is[2] - Class127.anInt1728;
			i = is[1] - Class127.anInt1725;
		    }
		    if (Class148.aBoolean1981 || i < 0
			|| (Class127.anInt1716 ^ 0xffffffff) >= (i
								 ^ 0xffffffff)
			|| i_7_ < 0
			|| ((Class127.anInt1730 ^ 0xffffffff)
			    >= (i_7_ ^ 0xffffffff))) {
			if ((PacketStream.anInt6135 ^ 0xffffffff) != 0
			    && Class131_Sub41_Sub3.anInt6193 != -1) {
			    Class127.aClass131_Sub41_Sub1_1703.method1926
				(PacketStream.anInt6135, is,
				 Class131_Sub41_Sub3.anInt6193, arg2 ^ 0x1227);
			    if (is != null) {
				Class197.anInt2875
				    = is[2] + -Class127.anInt1728;
				Class131_Sub31.anInt4532
				    = -Class127.anInt1725 + is[1];
			    }
			    PacketStream.anInt6135
				= Class131_Sub41_Sub3.anInt6193 = -1;
			    Class148.aBoolean1981 = false;
			} else {
			    Class127.aClass131_Sub41_Sub1_1703.method1926
				((0xfffdffb
				  & (Class127.aClass131_Sub41_Sub1_1703
				     .anInt6171)) >> 916396078,
				 is,
				 (Class127.aClass131_Sub41_Sub1_1703.anInt6171
				  & 0x3fff),
				 -1);
			    Class197.anInt2875 = -Class127.anInt1728 + is[2];
			    Class131_Sub31.anInt4532
				= is[1] + -Class127.anInt1725;
			}
		    } else {
			i_7_ += -5 + (int) (Math.random() * 10.0);
			i += -5 + (int) (10.0 * Math.random());
			Class197.anInt2875 = i_7_;
			Class131_Sub31.anInt4532 = i;
		    }
		    if ((Class127.aClass131_Sub41_Sub1_1703.anInt6176
			 ^ 0xffffffff)
			!= -38) {
			if (Class127.aClass131_Sub41_Sub1_1703.anInt6176
			    != 50) {
			    if (Class127.aClass131_Sub41_Sub1_1703.anInt6176
				== 75)
				Class127.aFloat1710 = Class127.aFloat1711
				    = 6.0F;
			    else if (((Class127.aClass131_Sub41_Sub1_1703
				       .anInt6176)
				      ^ 0xffffffff)
				     == -101)
				Class127.aFloat1710 = Class127.aFloat1711
				    = 8.0F;
			    else if (((Class127.aClass131_Sub41_Sub1_1703
				       .anInt6176)
				      ^ 0xffffffff)
				     != -201)
				Class127.aFloat1710 = Class127.aFloat1711
				    = 8.0F;
			    else
				Class127.aFloat1710 = Class127.aFloat1711
				    = 16.0F;
			} else
			    Class127.aFloat1710 = Class127.aFloat1711 = 4.0F;
		    } else
			Class127.aFloat1710 = Class127.aFloat1711 = 3.0F;
		    Class127.anInt1714
			= (int) Class127.aFloat1711 >> 481920769;
		    Class127.aByteArrayArrayArray1713
			= Class51.method596(Class127.anInt1714, -1);
		    Class131_Sub13.method1707(125);
		    Class127.method1129();
		    Class74.aClass119_1011 = new Class119();
		    Class127.anInt1709 += -2 + (int) (Math.random() * 5.0);
		    if (Class127.anInt1709 < -8)
			Class127.anInt1709 = -8;
		    if ((Class127.anInt1709 ^ 0xffffffff) < -9)
			Class127.anInt1709 = 8;
		    Class127.anInt1707 += -2 + (int) (5.0 * Math.random());
		    if ((Class127.anInt1707 ^ 0xffffffff) > 15)
			Class127.anInt1707 = -16;
		    if ((Class127.anInt1707 ^ 0xffffffff) < -17)
			Class127.anInt1707 = 16;
		    Class127.method1120(arg0,
					(Class127.anInt1709 >> -847160350
					 << 1142565866),
					Class127.anInt1707 >> -983315231);
		    Class131_Sub7.method1666(1024, 256, -60);
		    Class145.method2165(256, 256, (byte) 0);
		    Class58.method637(-4028, 4096);
		    Class135.method2103(arg2 ^ 0x1227, 256);
		    Class131_Sub2_Sub36.anInt6049 = 20;
		} else if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff)
			   == -21) {
		    Class79.method784((byte) 44, true);
		    Class127.method1125(arg1, Class127.anInt1709,
					Class127.anInt1707);
		    Class131_Sub2_Sub36.anInt6049 = 60;
		    Class79.method784((byte) 104, true);
		    Class100.method877(arg2 ^ 0x1227);
		} else if (Class131_Sub2_Sub36.anInt6049 == 60) {
		    if (Class127.aClass158_1705.method2371
			(-1, (Class127.aClass131_Sub41_Sub1_1703.aString6167
			      + "_staticelements"))) {
			if (!Class127.aClass158_1705.method2345
			     ((byte) 58,
			      (Class127.aClass131_Sub41_Sub1_1703.aString6167
			       + "_staticelements")))
			    return;
			Class127.aClass177_1706
			    = Class56.method625(((Class127
						  .aClass131_Sub41_Sub1_1703
						  .aString6167)
						 + "_staticelements"),
						Class127.aClass158_1705,
						(byte) 61,
						Class131_Sub9.aBoolean4218);
		    } else
			Class127.aClass177_1706 = new Class177(0);
		    Class127.method1114();
		    Class131_Sub2_Sub36.anInt6049 = 70;
		    Class79.method784((byte) -119, true);
		    Class100.method877(-1);
		} else if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff)
			   == -71) {
		    Class131_Sub2_Sub15.aClass140_5776
			= new Class140(arg1, 11, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 73;
		    Class79.method784((byte) -125, true);
		    Class100.method877(-1);
		} else if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff)
			   == -74) {
		    Class125.aClass140_1630
			= new Class140(arg1, 12, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 76;
		    Class79.method784((byte) 65, true);
		    Class100.method877(-1);
		} else if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff)
			   == -77) {
		    Class67.aClass140_912
			= new Class140(arg1, 14, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 79;
		    Class79.method784((byte) 86, true);
		    Class100.method877(-1);
		} else if ((Class131_Sub2_Sub36.anInt6049 ^ 0xffffffff)
			   == -80) {
		    Class131_Sub25.aClass140_4478
			= new Class140(arg1, 17, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 82;
		    Class79.method784((byte) 116, true);
		    Class100.method877(-1);
		} else if (Class131_Sub2_Sub36.anInt6049 == 82) {
		    Class74.aClass140_1004
			= new Class140(arg1, 19, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 85;
		    Class79.method784((byte) -124, true);
		    Class100.method877(-1);
		} else if (Class131_Sub2_Sub36.anInt6049 == 85) {
		    Class131_Sub2_Sub39.aClass140_6083
			= new Class140(arg1, 22, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 88;
		    Class79.method784((byte) -127, true);
		    Class100.method877(-1);
		} else if (Class131_Sub2_Sub36.anInt6049 == 88) {
		    Class130.aClass140_1778
			= new Class140(arg1, 26, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 91;
		    Class79.method784((byte) 79, true);
		    Class100.method877(arg2 ^ 0x1227);
		} else {
		    Class63.aClass140_806
			= new Class140(arg1, 30, true,
				       Class131_Sub2_Sub15.aCanvas5768);
		    Class131_Sub2_Sub36.anInt6049 = 100;
		    Class79.method784((byte) 108, true);
		    Class100.method877(-1);
		    System.gc();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2420(int arg0, byte arg1) {
	try {
	    anInt2215++;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(123,
							       (long) arg0));
	    if (class131_sub13 != null) {
		if (arg1 < 17)
		    method2419(null, null, 120);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (class131_sub13.anIntArray4257.length ^ 0xffffffff));
		     i++) {
		    class131_sub13.anIntArray4257[i] = -1;
		    class131_sub13.anIntArray4267[i] = 0;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2421(byte arg0) {
	aClass23_Sub4_Sub1_Sub2_2216 = null;
	aLongArray2212 = null;
	anIntArray2217 = null;
	aClass107Array2219 = null;
	anIntArray2218 = null;
	if (arg0 <= 123)
	    aClass107Array2219 = null;
    }
    
    public static int method2422(int arg0, byte arg1) {
	try {
	    if (arg1 != -43)
		method2422(-22, (byte) -58);
	    anInt2214++;
	    return arg0 >>> 735411752;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2423(int arg0) {
	try {
	    anInt2208++;
	    if (aThread2223 != null) {
		method2417(85, new Class131());
		try {
		    aThread2223.join();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
		if (arg0 != -11400)
		    anInt2224 = -104;
		aThread2223 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rc.F(" + arg0 + ')');
	}
    }
    
    public Class131_Sub30 method2424(String arg0, boolean arg1) {
	try {
	    anInt2210++;
	    if (aThread2223 == null)
		throw new IllegalStateException("");
	    if (arg0 == null)
		throw new IllegalArgumentException("");
	    Class131_Sub30 class131_sub30 = new Class131_Sub30(arg0);
	    if (arg1 != false)
		return null;
	    method2417(85, class131_sub30);
	    return class131_sub30;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rc.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public Class166() {
	try {
	    aThread2223 = new Thread(this);
	    aThread2223.setDaemon(true);
	    aThread2223.start();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rc.<init>(" + ')');
	}
    }
    
    static {
	anIntArray2217 = new int[64];
	aLongArray2212 = new long[32];
    }
}
