/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107
{
    public int anInt1383;
    public int anInt1384;
    public static int anInt1385;
    public int anInt1386;
    public int anInt1387;
    public int anInt1388 = 0;
    public boolean aBoolean1389;
    public long aLong1390;
    public static int[] anIntArray1391;
    public static String aString1392 = "glow3:";
    public int anInt1393;
    public int anInt1394;
    public int anInt1395;
    public int anInt1396;
    public static int anInt1397;
    public int anInt1398;
    public static int anInt1399;
    public int anInt1400;
    public static int[] anIntArray1401 = { -1, -1, 1, 1 };
    public static int anInt1402;
    public int anInt1403;
    
    public static void method921(int arg0) {
	try {
	    anIntArray1391 = null;
	    if (arg0 != 32)
		method924(97, -112, -5, null);
	    anIntArray1401 = null;
	    aString1392 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"le.E(" + arg0 + ')');
	}
    }
    
    public void method922(int arg0) {
	anInt1397++;
	anInt1403 = Class31.anIntArray425[anInt1394 << -44456445];
	if (arg0 == 8) {
	    anInt1396
		= (int) Math.sqrt((double) (anInt1384 * anInt1384
					    + (anInt1400 * anInt1400
					       - -(anInt1393 * anInt1393))));
	    if ((anInt1395 ^ 0xffffffff) == -1)
		anInt1395 = 1;
	    if ((anInt1387 ^ 0xffffffff) != -1) {
		if ((anInt1387 ^ 0xffffffff) == -2) {
		    aLong1390 = (long) (8 * anInt1396 / anInt1395);
		    aLong1390 *= aLong1390;
		} else if (anInt1387 == 2)
		    aLong1390 = (long) (8 * anInt1396 / anInt1395);
	    } else
		aLong1390 = 2147483647L;
	    if (aBoolean1389)
		anInt1396 *= -1;
	}
    }
    
    public void method923(int arg0, int arg1, Stream arg2) {
	anInt1402++;
	if ((arg1 ^ 0xffffffff) != -2) {
	    if ((arg1 ^ 0xffffffff) != -3) {
		if (arg1 != 3) {
		    if (arg1 != 4) {
			if (arg1 == 6)
			    anInt1398 = arg2.readUnsignedByte(arg0 + 6492);
			else if ((arg1 ^ 0xffffffff) != -9) {
			    if ((arg1 ^ 0xffffffff) != -10) {
				if (arg1 == 10)
				    aBoolean1389 = true;
			    } else
				anInt1386 = 1;
			} else
			    anInt1388 = 1;
		    } else {
			anInt1387 = arg2.readUnsignedByte(-115);
			anInt1395 = arg2.readUnsignedInt(arg0 ^ 0x1983);
		    }
		} else {
		    anInt1400 = arg2.readUnsignedInt(-2);
		    anInt1384 = arg2.readUnsignedInt(-2);
		    anInt1393 = arg2.readUnsignedInt(-2);
		}
	    } else
		arg2.readUnsignedByte(-17);
	} else
	    anInt1394 = arg2.readUnsignedShort(8104);
	if (arg0 != -6531)
	    method922(81);
    }
    
    public static void method924(int arg0, int arg1, int arg2, Class173 arg3) {
	anInt1399++;
	if ((arg3.anInt2324 ^ 0xffffffff) == -2) {
	    Class131_Sub31.method1860(-1, 0L, arg3.aString2329, arg0 ^ ~0x2, 0,
				      "", arg3.anInt2455, 29);
	    Class23_Sub3.anInt3726++;
	}
	if ((arg3.anInt2324 ^ 0xffffffff) == -3 && !Class154.aBoolean2047) {
	    String string = Class131_Sub2_Sub17.method1552(arg3, (byte) 90);
	    if (string != null) {
		Class131_Sub31.method1860(-1, 0L, string, -1, -1,
					  "<col=00ff00>" + arg3.aString2373,
					  arg3.anInt2455, 4);
		Class131_Sub3.anInt4119++;
	    }
	}
	if ((arg3.anInt2324 ^ 0xffffffff) == -4) {
	    Class131_Sub2_Sub1.anInt5562++;
	    Class131_Sub31.method1860(-1, 0L, Class126.aString1702, -1, 0, "",
				      arg3.anInt2455, 40);
	}
	if (arg3.anInt2324 == 4) {
	    Class131_Sub10.anInt4221++;
	    Class131_Sub31.method1860(-1, 0L, arg3.aString2329, -1, 0, "",
				      arg3.anInt2455, 34);
	}
	if (arg3.anInt2324 == 5) {
	    Class131_Sub31.method1860(-1, 0L, arg3.aString2329, arg0 ^ ~0x2, 0,
				      "", arg3.anInt2455, 38);
	    Class4.anInt3288++;
	}
	if (arg3.anInt2324 == 6 && Class164.aClass173_2193 == null) {
	    Class131_Sub31.method1860(-1, 0L, arg3.aString2329, -1, -1, "",
				      arg3.anInt2455, 24);
	    Class201.anInt2932++;
	}
	if (arg0 != 2)
	    aString1392 = null;
	if (arg3.anInt2470 == 2) {
	    int i = 0;
	    for (int i_0_ = 0; i_0_ < arg3.anInt2322; i_0_++) {
		for (int i_1_ = 0; arg3.anInt2440 > i_1_; i_1_++) {
		    int i_2_ = (32 - -arg3.anInt2332) * i_1_;
		    int i_3_ = i_0_ * (32 - -arg3.anInt2414);
		    if ((i ^ 0xffffffff) > -21) {
			i_2_ += arg3.anIntArray2323[i];
			i_3_ += arg3.anIntArray2337[i];
		    }
		    if (arg2 >= i_2_
			&& (i_3_ ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
			&& (32 + i_2_ ^ 0xffffffff) < (arg2 ^ 0xffffffff)
			&& (32 + i_3_ ^ 0xffffffff) < (arg1 ^ 0xffffffff)) {
			Class131_Sub13.aClass173_4263 = arg3;
			Class34.anInt489 = i;
			if (arg3.anIntArray2400[i] > 0) {
			    Class131_Sub37 class131_sub37
				= client.method66(arg3);
			    Class29 class29
				= (Class131_Sub19.method1808
				   (-1 + arg3.anIntArray2400[i], false));
			    if (((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff)
				 != -2)
				|| !class131_sub37.method1881(-1)) {
				if (!Class154.aBoolean2047
				    || !class131_sub37.method1881(-1)) {
				    String[] strings = class29.aStringArray311;
				    if (class131_sub37.method1881(arg0 + -3)) {
					for (int i_4_ = 4; i_4_ >= 3; i_4_--) {
					    if (strings != null
						&& strings[i_4_] != null) {
						int i_5_ = -1;
						int i_6_;
						if (i_4_ == 3)
						    i_6_ = 31;
						else
						    i_6_ = 2;
						if ((i_4_ ^ 0xffffffff)
						    == (class29.anInt322
							^ 0xffffffff))
						    i_5_ = class29.anInt348;
						if (i_4_ == class29.anInt354)
						    i_5_ = class29.anInt302;
						Class131_Sub31.method1860
						    (i_5_,
						     (long) class29.anInt349,
						     strings[i_4_], -1, i,
						     ("<col=ff9040>"
						      + class29.aString341),
						     arg3.anInt2455, i_6_);
						Class46_Sub1.anInt3797++;
					    }
					}
				    }
				    if (class131_sub37.method1883((byte) 47)) {
					Class131_Sub21.anInt4443++;
					Class131_Sub31.method1860
					    (Class218.anInt3200,
					     (long) class29.anInt349,
					     Class158.aString2090, -1, i,
					     ("<col=ff9040>"
					      + class29.aString341),
					     arg3.anInt2455, 11);
				    }
				    if (class131_sub37.method1881(-1)
					&& strings != null) {
					for (int i_7_ = 2; i_7_ >= 0; i_7_--) {
					    if (strings[i_7_] != null) {
						int i_8_ = 0;
						if ((i_7_ ^ 0xffffffff) == -1)
						    i_8_ = 30;
						int i_9_ = -1;
						if (i_7_ == 1)
						    i_8_ = 26;
						if ((i_7_ ^ 0xffffffff) == -3)
						    i_8_ = 42;
						if ((class29.anInt322
						     ^ 0xffffffff)
						    == (i_7_ ^ 0xffffffff))
						    i_9_ = class29.anInt348;
						if (i_7_ == class29.anInt354)
						    i_9_ = class29.anInt302;
						Class131_Sub31.method1860
						    (i_9_,
						     (long) class29.anInt349,
						     strings[i_7_], -1, i,
						     ("<col=ff9040>"
						      + class29.aString341),
						     arg3.anInt2455, i_8_);
						Class126.anInt1698++;
					    }
					}
				    }
				    strings = arg3.aStringArray2363;
				    if (strings != null) {
					for (int i_10_ = 4; i_10_ >= 0;
					     i_10_--) {
					    if (strings[i_10_] != null) {
						int i_11_ = 0;
						int i_12_ = -1;
						if ((i_10_ ^ 0xffffffff) == -1)
						    i_11_ = 6;
						if ((i_10_ ^ 0xffffffff) == -2)
						    i_11_ = 3;
						if ((i_10_ ^ 0xffffffff) == -3)
						    i_11_ = 48;
						if ((i_10_ ^ 0xffffffff) == -4)
						    i_11_ = 15;
						if (i_10_ == 4)
						    i_11_ = 19;
						if (class29.anInt322 == i_10_)
						    i_12_ = class29.anInt348;
						if (class29.anInt354 == i_10_)
						    i_12_ = class29.anInt302;
						Class131_Sub31.method1860
						    (i_12_,
						     (long) class29.anInt349,
						     strings[i_10_], -1, i,
						     ("<col=ff9040>"
						      + class29.aString341),
						     arg3.anInt2455, i_11_);
						Class23_Sub4_Sub1_Sub1
						    .anInt6488++;
					    }
					}
				    }
				    Class131_Sub31.method1860
					(Class131_Sub2_Sub22.anInt5862,
					 (long) class29.anInt349,
					 Class131_Sub19.aString4404, -1, i,
					 "<col=ff9040>" + class29.aString341,
					 arg3.anInt2455, 1012);
				    Class75.anInt1021++;
				} else {
				    Class131_Sub41_Sub16 class131_sub41_sub16
					= (((Class153.anInt2042 ^ 0xffffffff)
					    != 0)
					   ? Class145.method2163((Class153
								  .anInt2042),
								 true)
					   : null);
				    if ((Class193.anInt2839 & 0x10) != 0
					&& (class131_sub41_sub16 == null
					    || ((class29.method427
						 (126,
						  (class131_sub41_sub16
						   .anInt6374),
						  Class153.anInt2042))
						!= (class131_sub41_sub16
						    .anInt6374)))) {
					Class131_Sub31.method1860
					    (Class131_Sub41_Sub21.anInt6447,
					     (long) class29.anInt349,
					     Class131_Sub41_Sub2.aString6191,
					     -1, i,
					     (Class112.aString1453
					      + " -> <col=ff9040>"
					      + class29.aString341),
					     arg3.anInt2455, 18);
					Class138.anInt1860++;
				    }
				}
			    } else if (Class182.anInt2604 != arg3.anInt2455
				       || ((i ^ 0xffffffff)
					   != (Class209.anInt3038
					       ^ 0xffffffff))) {
				Class106.anInt1381++;
				Class131_Sub31.method1860
				    (Class218.anInt3200,
				     (long) class29.anInt349,
				     Class158.aString2090, -1, i,
				     (Class148.aString1979 + " -> <col=ff9040>"
				      + class29.aString341),
				     arg3.anInt2455, 35);
			    }
			}
		    }
		    i++;
		}
	    }
	}
	if (arg3.aBoolean2355) {
	    if (Class154.aBoolean2047) {
		if (client.method66(arg3).method1885((byte) -108)
		    && (0x20 & Class193.anInt2839 ^ 0xffffffff) != -1) {
		    Class131_Sub31.method1860(Class131_Sub41_Sub21.anInt6447,
					      0L,
					      Class131_Sub41_Sub2.aString6191,
					      -1, arg3.anInt2350,
					      (Class112.aString1453 + " -> "
					       + arg3.aString2391),
					      arg3.anInt2455, 22);
		    Class23_Sub5_Sub2.anInt5058++;
		}
	    } else {
		for (int i = 9; (i ^ 0xffffffff) <= -6; i--) {
		    String string
			= Class131_Sub2_Sub5.method1492((byte) 19, arg3, i);
		    if (string != null) {
			Class131_Sub31.method1860
			    (Class131_Sub2_Sub18.method1561(arg3, (byte) -95,
							    i),
			     (long) (1 + i), string, -1, arg3.anInt2350,
			     arg3.aString2391, arg3.anInt2455, 1006);
			Class153.anInt2039++;
		    }
		}
		String string
		    = Class131_Sub2_Sub17.method1552(arg3, (byte) 90);
		if (string != null) {
		    Class131_Sub3.anInt4119++;
		    Class131_Sub31.method1860(-1, 0L, string, -1,
					      arg3.anInt2350, arg3.aString2391,
					      arg3.anInt2455, 4);
		}
		for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
		    String string_13_
			= Class131_Sub2_Sub5.method1492((byte) 19, arg3, i);
		    if (string_13_ != null) {
			Class131_Sub31.method1860
			    (Class131_Sub2_Sub18.method1561(arg3, (byte) 115,
							    i),
			     (long) (i - -1), string_13_, -1, arg3.anInt2350,
			     arg3.aString2391, arg3.anInt2455, 36);
			Class153.anInt2039++;
		    }
		}
		if (client.method66(arg3).method1884(-1)) {
		    Class201.anInt2932++;
		    if (arg3.aString2330 != null)
			Class131_Sub31.method1860(-1, 0L, arg3.aString2330, -1,
						  arg3.anInt2350, "",
						  arg3.anInt2455, 24);
		    else
			Class131_Sub31.method1860(-1, 0L,
						  Class127_Sub1.aString4003,
						  -1, arg3.anInt2350, "",
						  arg3.anInt2455, 24);
		}
	    }
	}
    }
    
    public void method925(int arg0, Stream arg1) {
	try {
	    for (;;) {
		int i = arg1.readUnsignedByte(-22);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method923(-6531, i, arg1);
	    }
	    if (arg0 != -1)
		anInt1394 = 76;
	    anInt1385++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("le.D(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class107() {
	anInt1386 = 0;
	aBoolean1389 = false;
    }
}
