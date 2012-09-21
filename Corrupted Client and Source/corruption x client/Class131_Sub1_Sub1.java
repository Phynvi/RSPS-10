/* Class131_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub1_Sub1 extends Class131_Sub1
{
    public Class180 aClass180_5436;
    public int[] anIntArray5437;
    public int[] anIntArray5438;
    public static int anInt5439;
    public int anInt5440 = 256;
    public int[] anIntArray5441;
    public static int anInt5442;
    public static int anInt5443;
    public int[] anIntArray5444;
    public static int anInt5445;
    public static int anInt5446;
    public static int anInt5447;
    public static int anInt5448;
    public static int anInt5449;
    public int anInt5450 = 1000000;
    public static int anInt5451;
    public static int anInt5452;
    public static Class137 aClass137_5453 = new Class137(64);
    public static int anInt5454;
    public static int anInt5455;
    public static int anInt5456;
    public static int anInt5457;
    public static int anInt5458;
    public static int anInt5459;
    public static int anInt5460;
    public static int anInt5461;
    public int[] anIntArray5462;
    public static int anInt5463;
    public static int anInt5464;
    public static int anInt5465;
    public static int anInt5466;
    public Class114 aClass114_5467;
    public static int anInt5468;
    public static int anInt5469;
    public static int anInt5470;
    public static int anInt5471;
    public int[] anIntArray5472;
    public static int anInt5473;
    public static Class33 aClass33_5474;
    public static int anInt5475;
    public int[] anIntArray5476;
    public static int anInt5477;
    public Class131_Sub11[][] aClass131_Sub11ArrayArray5478;
    public static int anInt5479;
    public static int anInt5480;
    public static int anInt5481;
    public static int anInt5482;
    public int[] anIntArray5483;
    public int[] anIntArray5484;
    public int[] anIntArray5485;
    public static int anInt5486;
    public static int anInt5487;
    public static int anInt5488;
    public int[] anIntArray5489;
    public int[] anIntArray5490;
    public static int anInt5491;
    public static int anInt5492;
    public int[] anIntArray5493;
    public static int anInt5494;
    public Class131_Sub11[][] aClass131_Sub11ArrayArray5495;
    public static int[] anIntArray5496
	= { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
    public static int anInt5497;
    public static int anInt5498;
    public static int anInt5499;
    public int[] anIntArray5500;
    public int[] anIntArray5501;
    public int[] anIntArray5502;
    public static int anInt5503;
    public int anInt5504;
    public long aLong5505;
    public int anInt5506;
    public long aLong5507;
    public Class131_Sub1_Sub4 aClass131_Sub1_Sub4_5508;
    public boolean aBoolean5509;
    public boolean aBoolean5510;
    public Class131_Sub26 aClass131_Sub26_5511;
    public int anInt5512;
    
    public void method1364(int arg0, int arg1, int arg2) {
	anInt5439++;
	if (arg0 != -6)
	    method1365(false, (byte) 15);
    }
    
    public void method1365(boolean arg0, byte arg1) {
	try {
	    anInt5459++;
	    if (arg1 == 97) {
		if (arg0)
		    method1399(-1, false);
		else
		    method1380(arg1 ^ ~0x1c, -1);
		method1396(-1, (byte) 98);
		for (int i = 0; (i ^ 0xffffffff) > -17; i++)
		    anIntArray5501[i] = anIntArray5483[i];
		for (int i = 0; (i ^ 0xffffffff) > -17; i++)
		    anIntArray5472[i]
			= Class90.method841(-128, anIntArray5483[i]);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.LA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method1366(int arg0, Class131_Sub11 arg1) {
	try {
	    anInt5498++;
	    if (arg0 != -23879)
		anInt5440 = 119;
	    int i = anIntArray5441[arg1.anInt4244];
	    if (i < 8192)
		return arg1.anInt4231 * i - -32 >> 91014694;
	    return (-((128 - arg1.anInt4231) * (-i + 16384) - -32 >> 583411142)
		    + 16384);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.H(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method1367(Class131_Sub11 arg0, int arg1, int arg2,
			      int[] arg3, byte arg4) {
	try {
	    arg0.anInt4255 = Class131_Sub2_Sub14.anInt5754 / 100;
	    anInt5446++;
	    if ((arg0.anInt4230 ^ 0xffffffff) <= -1
		&& (arg0.aClass131_Sub1_Sub2_4232 == null
		    || arg0.aClass131_Sub1_Sub2_4232.method1416())) {
		arg0.method1699(97);
		arg0.method1355((byte) 119);
		if (arg0.anInt4251 > 0
		    && (aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			[arg0.anInt4251]) == arg0)
		    aClass131_Sub11ArrayArray5495[arg0.anInt4244][(arg0
								   .anInt4251)]
			= null;
		return true;
	    }
	    int i = arg0.anInt4239;
	    if (i > 0) {
		i -= (int) (0.5
			    + (16.0
			       * Math.pow(2.0,
					  (4.921259842519685E-4
					   * (double) (anIntArray5500
						       [arg0.anInt4244])))));
		if (i < 0)
		    i = 0;
		arg0.anInt4239 = i;
	    }
	    arg0.aClass131_Sub1_Sub2_4232.method1419(method1391(true, arg0));
	    Class207 class207 = arg0.aClass207_4229;
	    arg0.anInt4241 += class207.anInt3033;
	    arg0.anInt4254++;
	    boolean bool = false;
	    double d
		= (5.086263020833333E-6
		   * (double) ((arg0.anInt4239 * arg0.anInt4236 >> -473515956)
			       + (-60 + arg0.anInt4240 << -248064856)));
	    if (class207.anInt3024 > 0) {
		if (class207.anInt3026 <= 0)
		    arg0.anInt4235 += 128;
		else
		    arg0.anInt4235
			+= (int) (0.5
				  + (Math.pow(2.0,
					      (double) class207.anInt3026 * d)
				     * 128.0));
		if ((arg0.anInt4235 * class207.anInt3024 ^ 0xffffffff)
		    <= -819201)
		    bool = true;
	    }
	    if (class207.aByteArray3034 != null) {
		if (class207.anInt3020 > 0)
		    arg0.anInt4242
			+= (int) ((128.0
				   * Math.pow(2.0,
					      (double) class207.anInt3020 * d))
				  + 0.5);
		else
		    arg0.anInt4242 += 128;
		for (/**/;
		     (((-2 + class207.aByteArray3034.length ^ 0xffffffff)
		       < (arg0.anInt4252 ^ 0xffffffff))
		      && (0xff00 & (class207.aByteArray3034[2 + arg0.anInt4252]
				    << 76093768)) < arg0.anInt4242);
		     arg0.anInt4252 += 2) {
		    /* empty */
		}
		if (arg0.anInt4252 == class207.aByteArray3034.length - 2
		    && class207.aByteArray3034[1 + arg0.anInt4252] == 0)
		    bool = true;
	    }
	    if ((arg0.anInt4230 ^ 0xffffffff) <= -1
		&& class207.aByteArray3031 != null
		&& (anIntArray5437[arg0.anInt4244] & 0x1 ^ 0xffffffff) == -1
		&& (arg0.anInt4251 < 0
		    || (aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			[arg0.anInt4251]) != arg0)) {
		if (class207.anInt3030 <= 0)
		    arg0.anInt4230 += 128;
		else
		    arg0.anInt4230
			+= (int) (0.5
				  + (Math.pow(2.0,
					      d * (double) class207.anInt3030)
				     * 128.0));
		for (/**/;
		     (((-2 + class207.aByteArray3031.length ^ 0xffffffff)
		       < (arg0.anInt4228 ^ 0xffffffff))
		      && (((0xff & class207.aByteArray3031[2 + arg0.anInt4228])
			   << 12492040)
			  ^ 0xffffffff) > (arg0.anInt4230 ^ 0xffffffff));
		     arg0.anInt4228 += 2) {
		    /* empty */
		}
		if (arg0.anInt4228 == -2 + class207.aByteArray3031.length)
		    bool = true;
	    }
	    if (bool) {
		arg0.aClass131_Sub1_Sub2_4232.method1432(arg0.anInt4255);
		if (arg3 == null)
		    arg0.aClass131_Sub1_Sub2_4232.method1360(arg2);
		else
		    arg0.aClass131_Sub1_Sub2_4232.method1363(arg3, arg1, arg2);
		if (arg0.aClass131_Sub1_Sub2_4232.method1404())
		    aClass131_Sub1_Sub4_5508.aClass131_Sub1_Sub3_5550
			.method1446(arg0.aClass131_Sub1_Sub2_4232);
		arg0.method1699(118);
		if (arg0.anInt4230 >= 0) {
		    arg0.method1355((byte) 127);
		    if ((arg0.anInt4251 ^ 0xffffffff) < -1
			&& (aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			    [arg0.anInt4251]) == arg0)
			aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			    [arg0.anInt4251]
			    = null;
		}
		return true;
	    }
	    if (arg4 != -30)
		return true;
	    arg0.aClass131_Sub1_Sub2_4232.method1426(arg0.anInt4255,
						     method1395((byte) 56,
								arg0),
						     method1366(-23879, arg0));
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.U("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public synchronized void method1368(boolean arg0) {
	try {
	    anInt5445++;
	    if (arg0 != false)
		aClass131_Sub1_Sub4_5508 = null;
	    method1381(22525, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.D(" + arg0 + ')');
	}
    }
    
    public void method1369(int arg0, int arg1) {
	anInt5461++;
	int i = arg0 & 0xf0;
	if ((i ^ 0xffffffff) == -129) {
	    int i_0_ = arg0 & 0xf;
	    int i_1_ = (arg0 & 0x7fae) >> 1152723752;
	    int i_2_ = 0x7f & arg0 >> -1633030192;
	    method1389(0, i_0_, i_2_, i_1_);
	} else if (i == 144) {
	    int i_3_ = arg0 & 0xf;
	    int i_4_ = (arg0 & 0x7f61) >> 1502081384;
	    int i_5_ = (0x7f2eb5 & arg0) >> -842311376;
	    if ((i_5_ ^ 0xffffffff) < -1)
		method1378(i_4_, i_5_, 0, i_3_);
	    else
		method1389(0, i_3_, 64, i_4_);
	} else if (i == 160) {
	    int i_6_ = 0xf & arg0;
	    int i_7_ = 0x7f & arg0 >> 1448098632;
	    int i_8_ = arg0 >> 1814978000 & 0x7f;
	    method1387(i_8_, i_6_, i_7_, true);
	} else if ((i ^ 0xffffffff) == -177) {
	    int i_9_ = arg0 & 0xf;
	    int i_10_ = (0x7f9a & arg0) >> -1713622264;
	    int i_11_ = (arg0 & 0x7f0fde) >> 343058928;
	    if ((i_10_ ^ 0xffffffff) == -1)
		anIntArray5472[i_9_]
		    = (Class90.method841(-2080769, anIntArray5472[i_9_])
		       - -(i_11_ << -1447522290));
	    if (i_10_ == 32)
		anIntArray5472[i_9_]
		    = (Class90.method841(anIntArray5472[i_9_], -16257)
		       - -(i_11_ << 428955687));
	    if ((i_10_ ^ 0xffffffff) == -2)
		anIntArray5444[i_9_]
		    = (Class90.method841(anIntArray5444[i_9_], -16257)
		       + (i_11_ << 2090955303));
	    if ((i_10_ ^ 0xffffffff) == -34)
		anIntArray5444[i_9_]
		    = Class90.method841(anIntArray5444[i_9_], -128) + i_11_;
	    if ((i_10_ ^ 0xffffffff) == -6)
		anIntArray5500[i_9_]
		    = ((i_11_ << -114600729)
		       + Class90.method841(-16257, anIntArray5500[i_9_]));
	    if (i_10_ == 37)
		anIntArray5500[i_9_]
		    = i_11_ + Class90.method841(anIntArray5500[i_9_], -128);
	    if (i_10_ == 7)
		anIntArray5490[i_9_]
		    = ((i_11_ << -2089086553)
		       + Class90.method841(-16257, anIntArray5490[i_9_]));
	    if ((i_10_ ^ 0xffffffff) == -40)
		anIntArray5490[i_9_]
		    = i_11_ + Class90.method841(anIntArray5490[i_9_], -128);
	    if (i_10_ == 10)
		anIntArray5441[i_9_]
		    = ((i_11_ << 1777183623)
		       + Class90.method841(anIntArray5441[i_9_], -16257));
	    if ((i_10_ ^ 0xffffffff) == -43)
		anIntArray5441[i_9_]
		    = i_11_ + Class90.method841(-128, anIntArray5441[i_9_]);
	    if (i_10_ == 11)
		anIntArray5438[i_9_]
		    = ((i_11_ << -449750137)
		       + Class90.method841(anIntArray5438[i_9_], -16257));
	    if (i_10_ == 43)
		anIntArray5438[i_9_]
		    = Class90.method841(anIntArray5438[i_9_], -128) + i_11_;
	    if (i_10_ == 64) {
		if ((i_11_ ^ 0xffffffff) <= -65)
		    anIntArray5437[i_9_]
			= Cryption.method2105(anIntArray5437[i_9_], 1);
		else
		    anIntArray5437[i_9_]
			= Class90.method841(anIntArray5437[i_9_], -2);
	    }
	    if (i_10_ == 65) {
		if (i_11_ >= 64)
		    anIntArray5437[i_9_]
			= Cryption.method2105(anIntArray5437[i_9_], 2);
		else {
		    method1386(27010, i_9_);
		    anIntArray5437[i_9_]
			= Class90.method841(anIntArray5437[i_9_], -3);
		}
	    }
	    if (i_10_ == 99)
		anIntArray5484[i_9_]
		    = ((i_11_ << -507518809)
		       + Class90.method841(anIntArray5484[i_9_], 127));
	    if (i_10_ == 98)
		anIntArray5484[i_9_]
		    = i_11_ + Class90.method841(anIntArray5484[i_9_], 16256);
	    if (i_10_ == 101)
		anIntArray5484[i_9_]
		    = 16384 - (-Class90.method841(127, anIntArray5484[i_9_])
			       - (i_11_ << -973171737));
	    if ((i_10_ ^ 0xffffffff) == -101)
		anIntArray5484[i_9_]
		    = (16384 - -Class90.method841(16256, anIntArray5484[i_9_])
		       + i_11_);
	    if (i_10_ == 120)
		method1399(i_9_, false);
	    if (i_10_ == 121)
		method1396(i_9_, (byte) 112);
	    if (i_10_ == 123)
		method1380(-123, i_9_);
	    if (i_10_ == 6) {
		int i_12_ = anIntArray5484[i_9_];
		if (i_12_ == 16384)
		    anIntArray5485[i_9_]
			= ((i_11_ << 723604391)
			   + Class90.method841(-16257, anIntArray5485[i_9_]));
	    }
	    if ((i_10_ ^ 0xffffffff) == -39) {
		int i_13_ = anIntArray5484[i_9_];
		if (i_13_ == 16384)
		    anIntArray5485[i_9_]
			= i_11_ + Class90.method841(anIntArray5485[i_9_],
						    -128);
	    }
	    if ((i_10_ ^ 0xffffffff) == -17)
		anIntArray5462[i_9_]
		    = ((i_11_ << -2100318201)
		       + Class90.method841(-16257, anIntArray5462[i_9_]));
	    if (i_10_ == 48)
		anIntArray5462[i_9_]
		    = Class90.method841(anIntArray5462[i_9_], -128) + i_11_;
	    if ((i_10_ ^ 0xffffffff) == -82) {
		if (i_11_ >= 64)
		    anIntArray5437[i_9_]
			= Cryption.method2105(anIntArray5437[i_9_], 4);
		else {
		    method1398(false, i_9_);
		    anIntArray5437[i_9_]
			= Class90.method841(anIntArray5437[i_9_], -5);
		}
	    }
	    if (i_10_ == 17)
		method1371(2097152, i_9_, ((~0x3f80 & anIntArray5476[i_9_])
					   - -(i_11_ << 1140629895)));
	    if ((i_10_ ^ 0xffffffff) == -50)
		method1371(2097152, i_9_,
			   (anIntArray5476[i_9_] & ~0x7f) + i_11_);
	} else if (i == 192) {
	    int i_14_ = arg0 & 0xf;
	    int i_15_ = arg0 >> 735028232 & 0x7f;
	    method1394(i_14_, -75, anIntArray5472[i_14_] - -i_15_);
	} else if ((i ^ 0xffffffff) == -209) {
	    int i_16_ = 0xf & arg0;
	    int i_17_ = (arg0 & 0x7f44) >> 1403881480;
	    method1364(-6, i_17_, i_16_);
	} else if (i == 224) {
	    int i_18_ = arg0 & 0xf;
	    int i_19_ = ((arg0 >> 1262830857 & 0x3f80)
			 + ((0x7f46 & arg0) >> 1129700296));
	    method1372(i_18_, i_19_, true);
	} else {
	    i = arg0 & 0xff;
	    int i_20_ = 8 % ((arg1 - -6) / 58);
	    if (i == 255)
		method1365(true, (byte) 97);
	}
    }
    
    public static void method1370(int arg0) {
	try {
	    anInt5455++;
	    if (Class23_Sub1_Sub1.aString5085.length() != arg0) {
		Class131_Sub2_Sub15
		    .method1540(-108, "--> " + Class23_Sub1_Sub1.aString5085);
		Class131_Sub2_Sub30.method1617(74, false,
					       Class23_Sub1_Sub1.aString5085);
		Class131_Sub41_Sub4.anInt6204 = 0;
		Class23_Sub1_Sub1.aString5085 = "";
		Class128_Sub1.anInt4014 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.A(" + arg0 + ')');
	}
    }
    
    public void method1371(int arg0, int arg1, int arg2) {
	try {
	    anIntArray5476[arg1] = arg2;
	    anInt5471++;
	    anIntArray5493[arg1]
		= (int) (((double) arg0
			  * Math.pow(2.0, 5.4931640625E-4 * (double) arg2))
			 + 0.5);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.MA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1372(int arg0, int arg1, boolean arg2) {
	try {
	    anInt5442++;
	    if (arg2 != true)
		anIntArray5501 = null;
	    anIntArray5489[arg0] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.W(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method1373(byte arg0) {
	try {
	    anInt5480++;
	    if (arg0 <= 29)
		anInt5512 = 30;
	    return anInt5440;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.E(" + arg0 + ')');
	}
    }
    
    public synchronized void method1374(int arg0) {
	try {
	    anInt5463++;
	    for (Class131_Sub9 class131_sub9
		     = (Class131_Sub9) aClass180_5436.method2520(arg0 ^ arg0);
		 class131_sub9 != null;
		 class131_sub9 = (Class131_Sub9) aClass180_5436.method2518(0))
		class131_sub9.method1355((byte) 123);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.G(" + arg0 + ')');
	}
    }
    
    public synchronized boolean method1375(Class74 arg0, Class158 arg1,
					   byte arg2, Class131_Sub26 arg3,
					   int arg4) {
	try {
	    anInt5497++;
	    arg3.method1833();
	    boolean bool = true;
	    int[] is = null;
	    if ((arg4 ^ 0xffffffff) < -1)
		is = new int[] { arg4 };
	    if (arg2 <= 19)
		anInt5450 = -81;
	    for (Class131_Sub22 class131_sub22
		     = (Class131_Sub22) arg3.aClass180_4481.method2520(0);
		 class131_sub22 != null;
		 class131_sub22
		     = (Class131_Sub22) arg3.aClass180_4481.method2518(0)) {
		int i = (int) class131_sub22.aLong1791;
		Class131_Sub9 class131_sub9
		    = (Class131_Sub9) aClass180_5436.method2521(-73, (long) i);
		if (class131_sub9 == null) {
		    class131_sub9
			= Class131_Sub2_Sub3.method1485(i, false, arg1);
		    if (class131_sub9 == null) {
			bool = false;
			continue;
		    }
		    aClass180_5436.method2523(false, (long) i, class131_sub9);
		}
		if (!class131_sub9.method1692(is, arg0, 1,
					      class131_sub22.aByteArray4447))
		    bool = false;
	    }
	    if (bool)
		arg3.method1834();
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("hb.QA(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4
			+ ')'));
	}
    }
    
    public synchronized boolean method1376(int arg0) {
	try {
	    if (arg0 != 1000000)
		return false;
	    anInt5468++;
	    return aClass114_5467.method969();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.FA(" + arg0 + ')');
	}
    }
    
    public synchronized void method1377(int arg0, int arg1) {
	try {
	    anInt5494++;
	    if (arg0 == 1570943944)
		anInt5440 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.Q(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1378(int arg0, int arg1, int arg2, int arg3) {
	try {
	    method1389(0, arg3, 64, arg0);
	    anInt5447++;
	    if ((anIntArray5437[arg3] & 0x2) != arg2) {
		for (Class131_Sub11 class131_sub11
			 = (Class131_Sub11) aClass131_Sub1_Sub4_5508
						.aClass119_5543.method1017(0);
		     class131_sub11 != null;
		     class131_sub11
			 = (Class131_Sub11) aClass131_Sub1_Sub4_5508
						.aClass119_5543
						.method1006(-5525)) {
		    if ((arg3 ^ 0xffffffff) == (class131_sub11.anInt4244
						^ 0xffffffff)
			&& class131_sub11.anInt4230 < 0) {
			aClass131_Sub11ArrayArray5478[arg3][(class131_sub11
							     .anInt4240)]
			    = null;
			aClass131_Sub11ArrayArray5478[arg3][arg0]
			    = class131_sub11;
			int i = (((class131_sub11.anInt4239
				   * class131_sub11.anInt4236)
				  >> -1564017108)
				 + class131_sub11.anInt4249);
			class131_sub11.anInt4249
			    += -class131_sub11.anInt4240 + arg0 << 1570943944;
			class131_sub11.anInt4239 = 4096;
			class131_sub11.anInt4240 = arg0;
			class131_sub11.anInt4236
			    = i - class131_sub11.anInt4249;
			return;
		    }
		}
	    }
	    Class131_Sub9 class131_sub9
		= ((Class131_Sub9)
		   aClass180_5436.method2521(82, (long) anIntArray5501[arg3]));
	    if (class131_sub9 != null) {
		Class131_Sub12_Sub1 class131_sub12_sub1
		    = class131_sub9.aClass131_Sub12_Sub1Array4212[arg0];
		if (class131_sub12_sub1 != null) {
		    Class131_Sub11 class131_sub11 = new Class131_Sub11();
		    class131_sub11.anInt4244 = arg3;
		    class131_sub11.aClass131_Sub9_4237 = class131_sub9;
		    class131_sub11.aClass131_Sub12_Sub1_4250
			= class131_sub12_sub1;
		    class131_sub11.aClass207_4229
			= class131_sub9.aClass207Array4201[arg0];
		    class131_sub11.anInt4251
			= class131_sub9.aByteArray4205[arg0];
		    class131_sub11.anInt4240 = arg0;
		    class131_sub11.anInt4245
			= (1024 + (class131_sub9.anInt4197
				   * (arg1 * arg1
				      * class131_sub9.aByteArray4207[arg0]))
			   >> -121103445);
		    class131_sub11.anInt4231
			= 0xff & class131_sub9.aByteArray4203[arg0];
		    class131_sub11.anInt4249
			= (-(class131_sub9.aShortArray4202[arg0] & 0x7fff)
			   + (arg0 << 1498731368));
		    class131_sub11.anInt4252 = 0;
		    class131_sub11.anInt4235 = 0;
		    class131_sub11.anInt4242 = 0;
		    class131_sub11.anInt4230 = -1;
		    class131_sub11.anInt4228 = 0;
		    if (anIntArray5462[arg3] == 0)
			class131_sub11.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (class131_sub12_sub1,
				method1391(true, class131_sub11),
				method1395((byte) 56, class131_sub11),
				method1366(-23879, class131_sub11)));
		    else {
			class131_sub11.aClass131_Sub1_Sub2_4232
			    = (Class131_Sub1_Sub2.method1423
			       (class131_sub12_sub1,
				method1391(true, class131_sub11), 0,
				method1366(-23879, class131_sub11)));
			method1388(true, class131_sub11,
				   (class131_sub9.aShortArray4202[arg0]
				    ^ 0xffffffff) > -1);
		    }
		    if (class131_sub9.aShortArray4202[arg0] < 0)
			class131_sub11.aClass131_Sub1_Sub2_4232.method1435(-1);
		    if (class131_sub11.anInt4251 >= 0) {
			Class131_Sub11 class131_sub11_21_
			    = (aClass131_Sub11ArrayArray5495[arg3]
			       [class131_sub11.anInt4251]);
			if (class131_sub11_21_ != null
			    && class131_sub11_21_.anInt4230 < 0) {
			    aClass131_Sub11ArrayArray5478[arg3]
				[class131_sub11_21_.anInt4240]
				= null;
			    class131_sub11_21_.anInt4230 = 0;
			}
			aClass131_Sub11ArrayArray5495[arg3][(class131_sub11
							     .anInt4251)]
			    = class131_sub11;
		    }
		    aClass131_Sub1_Sub4_5508.aClass119_5543
			.method1018((byte) -123, class131_sub11);
		    aClass131_Sub11ArrayArray5478[arg3][arg0] = class131_sub11;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.CA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method1379(int arg0) {
	anInt5466++;
	int i = anInt5504;
	if (arg0 != -18059)
	    anIntArray5476 = null;
	int i_22_ = anInt5506;
	long l = aLong5507;
	if (aClass131_Sub26_5511 != null
	    && (anInt5512 ^ 0xffffffff) == (i_22_ ^ 0xffffffff)) {
	    method1390(false, aBoolean5510, aClass131_Sub26_5511,
		       aBoolean5509);
	    method1379(-18059);
	} else {
	    while ((i_22_ ^ 0xffffffff) == (anInt5506 ^ 0xffffffff)) {
		while ((i_22_ ^ 0xffffffff)
		       == (aClass114_5467.anIntArray1468[i] ^ 0xffffffff)) {
		    aClass114_5467.method976(i);
		    int i_23_ = aClass114_5467.method970(i);
		    if ((i_23_ ^ 0xffffffff) == -2) {
			aClass114_5467.method967();
			aClass114_5467.method972(i);
			if (aClass114_5467.method966()) {
			    if (aClass131_Sub26_5511 != null) {
				method1384(aBoolean5509, -128,
					   aClass131_Sub26_5511);
				method1379(arg0);
				return;
			    }
			    if (aBoolean5509 && i_22_ != 0)
				aClass114_5467.method977(l);
			    else {
				method1365(true, (byte) 97);
				aClass114_5467.method963();
				return;
			    }
			}
			break;
		    }
		    if ((0x80 & i_23_ ^ 0xffffffff) != -1)
			method1369(i_23_, 61);
		    aClass114_5467.method971(i);
		    aClass114_5467.method972(i);
		}
		i = aClass114_5467.method975();
		i_22_ = aClass114_5467.anIntArray1468[i];
		l = aClass114_5467.method968(i_22_);
	    }
	    anInt5506 = i_22_;
	    anInt5504 = i;
	    aLong5507 = l;
	    if (aClass131_Sub26_5511 != null
		&& (i_22_ ^ 0xffffffff) < (anInt5512 ^ 0xffffffff)) {
		anInt5504 = -1;
		anInt5506 = anInt5512;
		aLong5507 = aClass114_5467.method968(anInt5506);
	    }
	}
    }
    
    public void method1380(int arg0, int arg1) {
	try {
	    anInt5454++;
	    if (arg0 >= -115)
		method1389(115, 9, -38, -5);
	    for (Class131_Sub11 class131_sub11
		     = ((Class131_Sub11)
			aClass131_Sub1_Sub4_5508.aClass119_5543.method1007(0));
		 class131_sub11 != null;
		 class131_sub11
		     = (Class131_Sub11) aClass131_Sub1_Sub4_5508
					    .aClass119_5543.method1014(0)) {
		if ((arg1 < 0 || class131_sub11.anInt4244 == arg1)
		    && class131_sub11.anInt4230 < 0) {
		    aClass131_Sub11ArrayArray5478[class131_sub11.anInt4244]
			[class131_sub11.anInt4240]
			= null;
		    class131_sub11.anInt4230 = 0;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.BA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public synchronized void method1381(int arg0, boolean arg1) {
	try {
	    aClass114_5467.method963();
	    if (arg0 != 22525)
		anIntArray5444 = null;
	    anInt5488++;
	    aClass131_Sub26_5511 = null;
	    method1365(arg1, (byte) 97);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.AA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public synchronized void method1382(int arg0) {
	try {
	    for (Class131_Sub9 class131_sub9
		     = (Class131_Sub9) aClass180_5436.method2520(arg0 + arg0);
		 class131_sub9 != null;
		 class131_sub9
		     = (Class131_Sub9) aClass180_5436.method2518(arg0))
		class131_sub9.method1689((byte) 21);
	    anInt5469++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.O(" + arg0 + ')');
	}
    }
    
    public synchronized void method1383(int arg0, byte arg1, int arg2) {
	try {
	    if (arg1 != -48)
		anInt5504 = 42;
	    method1397(arg0, arg2, 77);
	    anInt5482++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.GA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public synchronized void method1363(int[] arg0, int arg1, int arg2) {
	try {
	    if (aClass114_5467.method969()) {
		int i = (anInt5450 * aClass114_5467.anInt1472
			 / Class131_Sub2_Sub14.anInt5754);
		do {
		    long l = aLong5505 + (long) arg2 * (long) i;
		    if (-l + aLong5507 >= 0L) {
			aLong5505 = l;
			break;
		    }
		    int i_24_
			= (int) ((aLong5507 + -aLong5505 + ((long) i + -1L))
				 / (long) i);
		    aLong5505 += (long) i * (long) i_24_;
		    aClass131_Sub1_Sub4_5508.method1363(arg0, arg1, i_24_);
		    arg2 -= i_24_;
		    arg1 += i_24_;
		    method1379(-18059);
		} while (aClass114_5467.method969());
	    }
	    anInt5464++;
	    aClass131_Sub1_Sub4_5508.method1363(arg0, arg1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.KA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public synchronized void method1384(boolean arg0, int arg1,
					Class131_Sub26 arg2) {
	try {
	    if (arg1 == -128) {
		method1390(false, true, arg2, arg0);
		anInt5475++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.DA(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method1385(Class131_Sub11 arg0, byte arg1) {
	try {
	    anInt5481++;
	    if (arg0.aClass131_Sub1_Sub2_4232 == null) {
		if (arg0.anInt4230 >= 0) {
		    arg0.method1355((byte) 117);
		    if (arg0.anInt4251 > 0
			&& (aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			    [arg0.anInt4251]) == arg0)
			aClass131_Sub11ArrayArray5495[arg0.anInt4244]
			    [arg0.anInt4251]
			    = null;
		}
		return true;
	    }
	    int i = 6 % ((-32 - arg1) / 40);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.NA("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method1386(int arg0, int arg1) {
	if ((anIntArray5437[arg1] & 0x2) != 0) {
	    for (Class131_Sub11 class131_sub11
		     = ((Class131_Sub11)
			aClass131_Sub1_Sub4_5508.aClass119_5543.method1007(0));
		 class131_sub11 != null;
		 class131_sub11
		     = (Class131_Sub11) aClass131_Sub1_Sub4_5508
					    .aClass119_5543.method1014(0)) {
		if (class131_sub11.anInt4244 == arg1
		    && (aClass131_Sub11ArrayArray5478[arg1]
			[class131_sub11.anInt4240]) == null
		    && class131_sub11.anInt4230 < 0)
		    class131_sub11.anInt4230 = 0;
	    }
	}
	anInt5465++;
	if (arg0 != 27010)
	    anIntArray5490 = null;
    }
    
    public synchronized Class131_Sub1 method1359() {
	try {
	    anInt5486++;
	    return aClass131_Sub1_Sub4_5508;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.S(" + ')');
	}
    }
    
    public synchronized int method1362() {
	try {
	    anInt5449++;
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.JA(" + ')');
	}
    }
    
    public void method1387(int arg0, int arg1, int arg2, boolean arg3) {
	anInt5458++;
	if (arg3 != true)
	    anIntArray5462 = null;
    }
    
    public void method1388(boolean arg0, Class131_Sub11 arg1, boolean arg2) {
	try {
	    anInt5492++;
	    int i = arg1.aClass131_Sub12_Sub1_4250.aByteArray6113.length;
	    int i_25_;
	    if (!arg2 || !arg1.aClass131_Sub12_Sub1_4250.aBoolean6116)
		i_25_ = (int) ((long) anIntArray5462[arg1.anInt4244] * (long) i
			       >> -1236403898);
	    else {
		int i_26_ = -arg1.aClass131_Sub12_Sub1_4250.anInt6117 + i - -i;
		i_25_ = (int) (((long) anIntArray5462[arg1.anInt4244]
				* (long) i_26_)
			       >> -1360179194);
		i <<= 8;
		if ((i ^ 0xffffffff) >= (i_25_ ^ 0xffffffff)) {
		    arg1.aClass131_Sub1_Sub2_4232.method1408(true);
		    i_25_ = i + i + -1 + -i_25_;
		}
	    }
	    if (arg0 == true)
		arg1.aClass131_Sub1_Sub2_4232.method1424(i_25_);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1389(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg0 != 0)
		method1398(true, -64);
	    anInt5457++;
	    Class131_Sub11 class131_sub11
		= aClass131_Sub11ArrayArray5478[arg1][arg3];
	    if (class131_sub11 != null) {
		aClass131_Sub11ArrayArray5478[arg1][arg3] = null;
		if ((anIntArray5437[arg1] & 0x2 ^ 0xffffffff) == -1)
		    class131_sub11.anInt4230 = 0;
		else {
		    for (Class131_Sub11 class131_sub11_27_
			     = (Class131_Sub11) aClass131_Sub1_Sub4_5508
						    .aClass119_5543
						    .method1007(0);
			 class131_sub11_27_ != null;
			 class131_sub11_27_
			     = (Class131_Sub11) aClass131_Sub1_Sub4_5508
						    .aClass119_5543
						    .method1014(0)) {
			if (((class131_sub11_27_.anInt4244 ^ 0xffffffff)
			     == (class131_sub11.anInt4244 ^ 0xffffffff))
			    && class131_sub11_27_.anInt4230 < 0
			    && class131_sub11_27_ != class131_sub11) {
			    class131_sub11.anInt4230 = 0;
			    break;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public synchronized void method1390(boolean arg0, boolean arg1,
					Class131_Sub26 arg2, boolean arg3) {
	try {
	    anInt5448++;
	    method1381(22525, arg1);
	    aClass114_5467.method962(arg2.aByteArray4482);
	    if (arg0 == false) {
		aLong5505 = 0L;
		aBoolean5509 = arg3;
		int i = aClass114_5467.method973();
		for (int i_28_ = 0; i_28_ < i; i_28_++) {
		    aClass114_5467.method976(i_28_);
		    aClass114_5467.method971(i_28_);
		    aClass114_5467.method972(i_28_);
		}
		anInt5504 = aClass114_5467.method975();
		anInt5506 = aClass114_5467.anIntArray1468[anInt5504];
		aLong5507 = aClass114_5467.method968(anInt5506);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.IA(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public int method1391(boolean arg0, Class131_Sub11 arg1) {
	try {
	    anInt5479++;
	    int i = (arg1.anInt4249
		     - -(arg1.anInt4236 * arg1.anInt4239 >> 1785670700));
	    i += (anIntArray5485[arg1.anInt4244]
		  * (-8192 + anIntArray5489[arg1.anInt4244])) >> 2054410220;
	    Class207 class207 = arg1.aClass207_4229;
	    if (arg0 != true)
		aClass131_Sub1_Sub4_5508 = null;
	    if (class207.anInt3033 > 0
		&& (class207.anInt3021 > 0
		    || anIntArray5444[arg1.anInt4244] > 0)) {
		int i_29_ = class207.anInt3021 << 1680020834;
		int i_30_ = class207.anInt3032 << -1064382207;
		if ((arg1.anInt4254 ^ 0xffffffff) > (i_30_ ^ 0xffffffff))
		    i_29_ = arg1.anInt4254 * i_29_ / i_30_;
		i_29_ += anIntArray5444[arg1.anInt4244] >> -1988587129;
		double d = Math.sin(0.01227184630308513
				    * (double) (0x1ff & arg1.anInt4241));
		i += (int) (d * (double) i_29_);
	    }
	    int i_31_
		= (int) (0.5
			 + ((double) (256 * (arg1.aClass131_Sub12_Sub1_4250
					     .anInt6115))
			    * Math.pow(2.0, 3.255208333333333E-4 * (double) i)
			    / (double) Class131_Sub2_Sub14.anInt5754));
	    if ((i_31_ ^ 0xffffffff) <= -2)
		return i_31_;
	    return 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.M(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public synchronized void method1360(int arg0) {
	try {
	    anInt5491++;
	    if (aClass114_5467.method969()) {
		int i = (aClass114_5467.anInt1472 * anInt5450
			 / Class131_Sub2_Sub14.anInt5754);
		do {
		    long l = aLong5505 + (long) i * (long) arg0;
		    if (-l + aLong5507 >= 0L) {
			aLong5505 = l;
			break;
		    }
		    int i_32_
			= (int) ((-1L + ((long) i + -aLong5505 + aLong5507))
				 / (long) i);
		    aLong5505 += (long) i * (long) i_32_;
		    arg0 -= i_32_;
		    aClass131_Sub1_Sub4_5508.method1360(i_32_);
		    method1379(-18059);
		} while (aClass114_5467.method969());
	    }
	    aClass131_Sub1_Sub4_5508.method1360(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.F(" + arg0 + ')');
	}
    }
    
    public synchronized Class131_Sub1 method1357() {
	try {
	    anInt5470++;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.L(" + ')');
	}
    }
    
    public static void method1392(boolean arg0) {
	try {
	    PacketParser.anInt5878 = Class64.anInt816
		= Class131_Sub41.anInt4664 = Class131_Sub41_Sub6.anInt6239 = 0;
	    if (arg0 != true)
		method1392(true);
	    anInt5487++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.RA(" + arg0 + ')');
	}
    }
    
    public static void method1393(byte arg0) {
	try {
	    aClass33_5474 = null;
	    if (arg0 >= 84) {
		anIntArray5496 = null;
		aClass137_5453 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.T(" + arg0 + ')');
	}
    }
    
    public void method1394(int arg0, int arg1, int arg2) {
	if (anIntArray5501[arg0] != arg2) {
	    anIntArray5501[arg0] = arg2;
	    for (int i = 0; i < 128; i++)
		aClass131_Sub11ArrayArray5495[arg0][i] = null;
	}
	anInt5451++;
	if (arg1 > -66)
	    method1396(55, (byte) -119);
    }
    
    public int method1395(byte arg0, Class131_Sub11 arg1) {
	try {
	    anInt5460++;
	    if ((anIntArray5502[arg1.anInt4244] ^ 0xffffffff) == -1)
		return 0;
	    Class207 class207 = arg1.aClass207_4229;
	    int i = ((anIntArray5438[arg1.anInt4244]
		      * anIntArray5490[arg1.anInt4244]) - -4096
		     >> 2126553421);
	    i = 16384 + i * i >> -440858609;
	    i = arg1.anInt4245 * i + 16384 >> 735382543;
	    i = 128 + i * anInt5440 >> -554565240;
	    if (arg0 != 56)
		return -77;
	    i = 128 + anIntArray5502[arg1.anInt4244] * i >> 50420872;
	    if ((class207.anInt3024 ^ 0xffffffff) < -1)
		i = (int) ((Math.pow(0.5,
				     (1.953125E-5 * (double) arg1.anInt4235
				      * (double) class207.anInt3024))
			    * (double) i)
			   + 0.5);
	    if (class207.aByteArray3034 != null) {
		int i_33_ = arg1.anInt4242;
		int i_34_ = class207.aByteArray3034[1 + arg1.anInt4252];
		if ((arg1.anInt4252 ^ 0xffffffff)
		    > (class207.aByteArray3034.length - 2 ^ 0xffffffff)) {
		    int i_35_
			= (class207.aByteArray3034[arg1.anInt4252] << 169264008
			   & 0xff00);
		    int i_36_ = ((class207.aByteArray3034[2 + arg1.anInt4252]
				  << 1425821128)
				 & 0xff00);
		    i_34_
			+= ((-i_35_ + i_33_)
			    * (-i_34_
			       + class207.aByteArray3034[arg1.anInt4252 - -3])
			    / (-i_35_ + i_36_));
		}
		i = i_34_ * i + 32 >> 1276242406;
	    }
	    if (arg1.anInt4230 > 0 && class207.aByteArray3031 != null) {
		int i_37_ = arg1.anInt4230;
		int i_38_ = class207.aByteArray3031[1 + arg1.anInt4228];
		if (class207.aByteArray3031.length + -2 > arg1.anInt4228) {
		    int i_39_
			= ((0xff & class207.aByteArray3031[arg1.anInt4228])
			   << -221558680);
		    int i_40_
			= 0xff00 & (class207.aByteArray3031[2 + arg1.anInt4228]
				    << 1190707432);
		    i_38_ += ((i_37_ + -i_39_)
			      * (-i_38_
				 + class207.aByteArray3031[3 + arg1.anInt4228])
			      / (-i_39_ + i_40_));
		}
		i = i * i_38_ + 32 >> 320850342;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.PA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method1396(int arg0, byte arg1) {
	try {
	    anInt5473++;
	    if (arg0 < 0) {
		for (arg0 = 0; arg0 < 16; arg0++)
		    method1396(arg0, (byte) 70);
	    } else {
		anIntArray5490[arg0] = 12800;
		anIntArray5441[arg0] = 8192;
		anIntArray5438[arg0] = 16383;
		if (arg1 < 9)
		    aClass137_5453 = null;
		anIntArray5489[arg0] = 8192;
		anIntArray5444[arg0] = 0;
		anIntArray5500[arg0] = 8192;
		method1386(27010, arg0);
		method1398(false, arg0);
		anIntArray5437[arg0] = 0;
		anIntArray5484[arg0] = 32767;
		anIntArray5485[arg0] = 256;
		anIntArray5462[arg0] = 0;
		method1371(2097152, arg0, 8192);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1397(int arg0, int arg1, int arg2) {
	try {
	    anIntArray5483[arg1] = arg0;
	    int i = -93 / ((19 - arg2) / 43);
	    anInt5443++;
	    anIntArray5472[arg1] = Class90.method841(-128, arg0);
	    method1394(arg1, -93, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.OA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method1398(boolean arg0, int arg1) {
	try {
	    if ((0x4 & anIntArray5437[arg1]) != 0) {
		for (Class131_Sub11 class131_sub11
			 = (Class131_Sub11) aClass131_Sub1_Sub4_5508
						.aClass119_5543.method1007(0);
		     class131_sub11 != null;
		     class131_sub11 = (Class131_Sub11) aClass131_Sub1_Sub4_5508
							   .aClass119_5543
							   .method1014(0)) {
		    if ((class131_sub11.anInt4244 ^ 0xffffffff)
			== (arg1 ^ 0xffffffff))
			class131_sub11.anInt4234 = 0;
		}
	    }
	    if (arg0 == false)
		anInt5477++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.EA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1399(int arg0, boolean arg1) {
	for (Class131_Sub11 class131_sub11
		 = ((Class131_Sub11)
		    aClass131_Sub1_Sub4_5508.aClass119_5543.method1007(0));
	     class131_sub11 != null;
	     class131_sub11
		 = ((Class131_Sub11)
		    aClass131_Sub1_Sub4_5508.aClass119_5543.method1014(0))) {
	    if (arg0 < 0
		|| (class131_sub11.anInt4244 ^ 0xffffffff) == (arg0
							       ^ 0xffffffff)) {
		if (class131_sub11.aClass131_Sub1_Sub2_4232 != null) {
		    class131_sub11.aClass131_Sub1_Sub2_4232
			.method1432(Class131_Sub2_Sub14.anInt5754 / 100);
		    if (class131_sub11.aClass131_Sub1_Sub2_4232.method1404())
			aClass131_Sub1_Sub4_5508.aClass131_Sub1_Sub3_5550
			    .method1446
			    (class131_sub11.aClass131_Sub1_Sub2_4232);
		    class131_sub11.method1699(116);
		}
		if (class131_sub11.anInt4230 < 0)
		    aClass131_Sub11ArrayArray5478[class131_sub11.anInt4244]
			[class131_sub11.anInt4240]
			= null;
		class131_sub11.method1355((byte) 115);
	    }
	}
	anInt5503++;
	if (arg1 != false)
	    method1392(true);
    }
    
    public synchronized void method1400(int arg0, int arg1, int arg2) {
	try {
	    if (arg2 >= (arg0 ^ 0xffffffff))
		anIntArray5502[arg0] = arg1;
	    else {
		for (int i = 0; i < 16; i++)
		    anIntArray5502[i] = arg1;
	    }
	    anInt5452++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hb.J(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub1_Sub1() {
	anIntArray5437 = new int[16];
	anIntArray5441 = new int[16];
	anIntArray5476 = new int[16];
	anIntArray5472 = new int[16];
	anIntArray5485 = new int[16];
	anIntArray5462 = new int[16];
	aClass131_Sub11ArrayArray5478 = new Class131_Sub11[16][128];
	anIntArray5490 = new int[16];
	anIntArray5484 = new int[16];
	anIntArray5489 = new int[16];
	anIntArray5483 = new int[16];
	anIntArray5493 = new int[16];
	aClass131_Sub11ArrayArray5495 = new Class131_Sub11[16][128];
	anIntArray5502 = new int[16];
	anIntArray5438 = new int[16];
	anIntArray5500 = new int[16];
	anIntArray5501 = new int[16];
	anIntArray5444 = new int[16];
	aClass114_5467 = new Class114();
	aClass131_Sub1_Sub4_5508 = new Class131_Sub1_Sub4(this);
	try {
	    aClass180_5436 = new Class180(128);
	    method1400(-1, 256, -1);
	    method1365(true, (byte) 97);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hb.<init>(" + ')');
	}
    }
}
