/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class31
{
    public boolean aBoolean368 = true;
    public int anInt369;
    public int anInt370 = -1;
    public int anInt371;
    public int anInt372;
    public int anInt373;
    public static int anInt374;
    public int anInt375;
    public int anInt376;
    public int anInt377;
    public short aShort378;
    public int anInt379;
    public boolean aBoolean380;
    public int anInt381;
    public int anInt382;
    public int anInt383;
    public int anInt384;
    public int[] anIntArray385;
    public int anInt386;
    public int anInt387;
    public static Color[] aColorArray388
	= { new Color(9179409), new Color(3289650) };
    public int anInt389;
    public int anInt390;
    public short aShort391;
    public int anInt392;
    public int anInt393;
    public boolean aBoolean394;
    public int anInt395 = -1;
    public int anInt396;
    public int anInt397;
    public static int anInt398;
    public static int anInt399;
    public int anInt400;
    public boolean aBoolean401;
    public short aShort402;
    public int anInt403 = 100;
    public int anInt404;
    public int[] anIntArray405;
    public boolean aBoolean406;
    public int anInt407;
    public int anInt408;
    public int anInt409;
    public int anInt410;
    public short aShort411;
    public int anInt412;
    public int anInt413;
    public static int anInt414;
    public int anInt415;
    public int anInt416;
    public int anInt417;
    public int anInt418;
    public int[] anIntArray419;
    public int anInt420;
    public int anInt421;
    public int anInt422;
    public int anInt423;
    public int anInt424;
    public static int[] anIntArray425 = new int[16384];
    public static int anInt426;
    public static Class116[] aClass116Array427 = new Class116[4];
    public boolean aBoolean428;
    public int anInt429;
    public int anInt430;
    public int anInt431;
    public int anInt432;
    public int anInt433;
    public static int[] anIntArray434 = new int[16384];
    public int anInt435;
    public int anInt436;
    public int anInt437;
    public int anInt438;
    public int[] anIntArray439;
    public static String[] aStringArray440;
    public static boolean aBoolean441;
    public static Class139 aClass139_442;
    public static int[][] anIntArrayArray443;
    public static int anInt444;
    
    public void method435(Stream arg0, int arg1, int arg2) {
	anInt398++;
	if ((arg1 ^ 0xffffffff) == -2) {
	    aShort378 = (short) arg0.readUnsignedShort(8104);
	    aShort391 = (short) arg0.readUnsignedShort(8104);
	    aShort411 = (short) arg0.readUnsignedShort(8104);
	    aShort402 = (short) arg0.readUnsignedShort(8104);
	    int i = 3;
	    aShort411 <<= i;
	    aShort402 <<= i;
	    aShort378 <<= i;
	    aShort391 <<= i;
	} else if (arg1 == 2)
	    arg0.readUnsignedByte(102);
	else if ((arg1 ^ 0xffffffff) != -4) {
	    if (arg1 == 4) {
		anInt420 = arg0.readUnsignedByte(-29);
		anInt415 = arg0.readSignedByte((byte) 127);
	    } else if ((arg1 ^ 0xffffffff) == -6)
		anInt400 = anInt369 = arg0.readUnsignedShort(8104) << 1047037228;
	    else if ((arg1 ^ 0xffffffff) != -7) {
		if ((arg1 ^ 0xffffffff) == -8) {
		    anInt384 = arg0.readUnsignedShort(8104);
		    anInt410 = arg0.readUnsignedShort(8104);
		} else if ((arg1 ^ 0xffffffff) == -9) {
		    anInt433 = arg0.readUnsignedShort(8104);
		    anInt421 = arg0.readUnsignedShort(8104);
		} else if ((arg1 ^ 0xffffffff) != -10) {
		    if ((arg1 ^ 0xffffffff) == -11) {
			int i = arg0.readUnsignedByte(54);
			anIntArray405 = new int[i];
			for (int i_0_ = 0;
			     (i ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
			    anIntArray405[i_0_] = arg0.readUnsignedShort(8104);
		    } else if ((arg1 ^ 0xffffffff) != -13) {
			if (arg1 != 13) {
			    if (arg1 != 14) {
				if ((arg1 ^ 0xffffffff) == -16)
				    anInt370 = arg0.readUnsignedShort(8104);
				else if (arg1 == 16) {
				    aBoolean401 = arg0.readUnsignedByte(-94) == 1;
				    anInt392 = arg0.readUnsignedShort(8104);
				    anInt409 = arg0.readUnsignedShort(8104);
				    aBoolean380 = arg0.readUnsignedByte(-46) == 1;
				} else if ((arg1 ^ 0xffffffff) != -18) {
				    if ((arg1 ^ 0xffffffff) == -19)
					anInt382 = arg0.readUnsignedInt(-2);
				    else if (arg1 != 19) {
					if (arg1 == 20)
					    anInt403 = arg0.readUnsignedByte(-110);
					else if (arg1 != 21) {
					    if (arg1 != 22) {
						if (arg1 != 23) {
						    if (arg1 == 24)
							aBoolean368 = false;
						    else if (arg1 != 25) {
							if (arg1 != 26) {
							    if (arg1 == 27)
								anInt377
								    = ((arg0.readUnsignedShort
									(8104))
								       << 1310960940);
							    else if ((arg1
								      ^ 0xffffffff)
								     == -29)
								anInt386
								    = (arg0.readUnsignedByte
								       (-64));
							    else if (arg1
								     != 29) {
								if (arg1
								    != 30) {
								    if ((arg1
									 ^ 0xffffffff)
									== -32) {
									anInt400
									    = arg0.readUnsignedShort(8104) << -80424596;
									anInt369
									    = arg0.readUnsignedShort(8104) << -837198036;
								    }
								} else
								    aBoolean428
									= true;
							    } else
								arg0.readSignedShort
								    (1625554944);
							} else
							    aBoolean406
								= false;
						    } else {
							int i
							    = (arg0.readUnsignedByte
							       (-102));
							anIntArray385
							    = new int[i];
							for (int i_1_ = 0;
							     ((i_1_
							       ^ 0xffffffff)
							      > (i
								 ^ 0xffffffff));
							     i_1_++)
							    anIntArray385[i_1_]
								= (arg0.readUnsignedShort
								   (8104));
						    }
						} else
						    anInt432
							= arg0.readUnsignedByte(-45);
					    } else
						anInt395 = arg0.readUnsignedInt(-2);
					} else
					    anInt372 = arg0.readUnsignedByte(-79);
				    } else
					anInt416 = arg0.readUnsignedByte(69);
				} else
				    anInt371 = arg0.readUnsignedShort(8104);
			    } else
				anInt393 = arg0.readUnsignedShort(8104);
			} else
			    anInt413 = arg0.readSignedByte((byte) 127);
		    } else
			anInt397 = arg0.readSignedByte((byte) 127);
		} else {
		    int i = arg0.readUnsignedByte(69);
		    anIntArray419 = new int[i];
		    for (int i_2_ = 0; i > i_2_; i_2_++)
			anIntArray419[i_2_] = arg0.readUnsignedShort(8104);
		}
	    } else {
		anInt424 = arg0.readUnsignedInt(-2);
		anInt375 = arg0.readUnsignedInt(-2);
	    }
	} else {
	    anInt436 = arg0.readUnsignedInt(-2);
	    anInt435 = arg0.readUnsignedInt(-2);
	}
	if (arg2 > -66)
	    anInt404 = -14;
    }
    
    public static void method436(byte arg0) {
	try {
	    if (arg0 > 17) {
		aClass116Array427 = null;
		anIntArray425 = null;
		anIntArray434 = null;
		aStringArray440 = null;
		aClass139_442 = null;
		aColorArray388 = null;
		anIntArrayArray443 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cr.D(" + arg0 + ')');
	}
    }
    
    public void method437(byte arg0) {
	if ((anInt397 ^ 0xffffffff) < 1 || (anInt413 ^ 0xffffffff) < 1)
	    aBoolean394 = true;
	anInt404 = anInt424 >> -488239952 & 0xff;
	anInt429 = (0xff8539 & anInt375) >> -1775221328;
	anInt444++;
	anInt438 = 0xff & anInt375 >> 1839484872;
	if (arg0 >= 58) {
	    anInt412 = (anInt424 & 0xffac) >> -682116024;
	    anInt379 = anInt429 + -anInt404;
	    anInt390 = anInt424 & 0xff;
	    anInt373 = anInt375 & 0xff;
	    anInt387 = anInt438 - anInt412;
	    anInt422 = 0xff & anInt424 >> 223746264;
	    anInt423 = anInt375 >> 943193912 & 0xff;
	    anInt389 = -anInt390 + anInt373;
	    anInt418 = anInt423 + -anInt422;
	    if ((anInt382 ^ 0xffffffff) != -1) {
		anInt430 = anInt403 * anInt410 / 100;
		anInt408 = anInt410 * anInt372 / 100;
		if (anInt430 == 0)
		    anInt430 = 1;
		anInt437 = ((((0xff2423 & anInt382) >> 143572720)
			     + -(anInt379 / 2) + -anInt404)
			    << 82382504) / anInt430;
		anInt407 = (-(anInt387 / 2) - (anInt412 - ((anInt382 & 0xffdc)
							   >> -2108794744))
			    << 2015976776) / anInt430;
		anInt396 = ((anInt382 & 0xff) - (anInt389 / 2 + anInt390)
			    << -288615416) / anInt430;
		if ((anInt408 ^ 0xffffffff) == -1)
		    anInt408 = 1;
		anInt383 = ((anInt382 >> 1322566776 & 0xff) + (-anInt422
							       - anInt418 / 2)
			    << -138370776) / anInt408;
		Class31 class31 = this;
		class31.anInt437 = class31.anInt437 + (anInt437 > 0 ? -4 : 4);
		Class31 class31_3_ = this;
		class31_3_.anInt396
		    = class31_3_.anInt396 + ((anInt396 ^ 0xffffffff) >= -1 ? 4
					     : -4);
		Class31 class31_4_ = this;
		class31_4_.anInt407
		    = class31_4_.anInt407 + (anInt407 > 0 ? -4 : 4);
		Class31 class31_5_ = this;
		class31_5_.anInt383
		    = class31_5_.anInt383 + ((anInt383 ^ 0xffffffff) < -1 ? -4
					     : 4);
	    }
	    if (anInt377 != -1) {
		anInt417 = anInt386 * anInt410 / 100;
		if ((anInt417 ^ 0xffffffff) == -1)
		    anInt417 = 1;
		anInt431 = (-anInt400 - ((anInt369 - anInt400) / 2
					 - anInt377)) / anInt417;
	    }
	    if ((anInt395 ^ 0xffffffff) != 0) {
		anInt381 = anInt410 * anInt432 / 100;
		if (anInt381 == 0)
		    anInt381 = 1;
		anInt376 = (-anInt436 - ((-anInt436 + anInt435) / 2
					 - anInt395)) / anInt381;
	    }
	}
    }
    
    public static void method438(int arg0) {
	try {
	    Class23_Sub4_Sub1_Sub1.aClass214_6477.method2783(-103);
	    anInt399++;
	    if (arg0 < 58)
		method438(38);
	    Class2.aClass214_83.method2783(-94);
	    Class131_Sub7.aClass214_4180.method2783(-107);
	    Class82.aClass214_1087.method2783(-106);
	    Class209.aClass214_3042.method2783(-60);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"cr.A(" + arg0 + ')');
	}
    }
    
    public static void method439(Class173 arg0, int arg1) {
	if (arg1 != -2108)
	    aColorArray388 = null;
	anInt426++;
	int i = arg0.anInt2441;
	if ((i ^ 0xffffffff) == -325) {
	    if ((Class179.anInt2543 ^ 0xffffffff) == 0) {
		Class110_Sub1.anInt3890 = arg0.anInt2349;
		Class179.anInt2543 = arg0.anInt2377;
	    }
	    if (Class87.aClass188_1141.aBoolean2744)
		arg0.anInt2377 = Class179.anInt2543;
	    else
		arg0.anInt2377 = Class110_Sub1.anInt3890;
	} else if ((i ^ 0xffffffff) == -326) {
	    if (Class179.anInt2543 == -1) {
		Class179.anInt2543 = arg0.anInt2377;
		Class110_Sub1.anInt3890 = arg0.anInt2349;
	    }
	    if (!Class87.aClass188_1141.aBoolean2744)
		arg0.anInt2377 = Class179.anInt2543;
	    else
		arg0.anInt2377 = Class110_Sub1.anInt3890;
	} else if ((i ^ 0xffffffff) == -328) {
	    arg0.anInt2461 = 150;
	    arg0.anInt2482
		= ((int) (Math.sin((double) Class125.anInt1632 / 40.0) * 256.0)
		   & 0x3fff);
	    arg0.anInt2416 = 5;
	    arg0.anInt2359 = -1;
	} else if ((i ^ 0xffffffff) == -329) {
	    if (Class166.aClass23_Sub4_Sub1_Sub2_2216.aString6491 == null) {
		arg0.anInt2457 = 0;
		arg0.anInt2359 = 0;
	    } else {
		arg0.anInt2461 = 150;
		arg0.anInt2482
		    = (0x7ff
		       & (int) (Math.sin((double) Class125.anInt1632 / 40.0)
				* 256.0));
		arg0.anInt2416 = 5;
		arg0.anInt2359 = 2047;
		arg0.anInt2457
		    = Class131_Sub21.method1819(-127,
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .aString6491));
		arg0.anInt2481
		    = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt5304;
		arg0.anInt2338 = 0;
		arg0.anInt2484
		    = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt5235;
		arg0.anInt2443
		    = Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt5254;
	    }
	}
    }
    
    public static void method440(Class158 arg0, Class158 arg1, byte arg2) {
	try {
	    Class121_Sub2_Sub1.aClass158_5426 = arg1;
	    if (arg2 <= 100)
		aClass116Array427 = null;
	    Class131_Sub13.aClass158_4270 = arg0;
	    anInt374++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("cr.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public void method441(Stream arg0, boolean arg1) {
	for (;;) {
	    int i = arg0.readUnsignedByte(-26);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method435(arg0, i, -111);
	}
	anInt414++;
	if (arg1 != true)
	    method435(null, 127, -82);
    }
    
    public Class31() {
	anInt393 = 0;
	anInt397 = -2;
	aBoolean380 = true;
	anInt371 = -1;
	aBoolean406 = true;
	anInt416 = 0;
	aBoolean394 = false;
	anInt386 = 100;
	anInt377 = -1;
	anInt420 = 0;
	anInt392 = -1;
	aBoolean428 = false;
	anInt409 = -1;
	anInt432 = 100;
	anInt372 = 100;
	anInt413 = -2;
	aBoolean401 = true;
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    anIntArray434[i] = (int) (Math.sin((double) i * d) * 32768.0);
	    anIntArray425[i] = (int) (32768.0 * Math.cos((double) i * d));
	}
	aBoolean441 = false;
	anIntArrayArray443
	    = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 },
			    { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			    { -1, 4, -1, 1 }, { -1, 1, 3, -1 },
			    { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
			    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    }
}
