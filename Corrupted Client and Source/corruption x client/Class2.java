/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2
{
    public static int anInt81;
    public static int anInt82;
    public static Class214 aClass214_83;
    public static int anInt84;
    public static int anInt85;
    public static int[] anIntArray86 = new int[25];
    
    public static void method141(byte arg0, int arg1) {
	try {
	    Class131_Sub41_Sub21_Sub2.anInt6595 = arg1;
	    anInt82++;
	    synchronized (Class153.aClass214_2040) {
		if (arg0 != -120)
		    return;
		Class153.aClass214_2040.method2783(-97);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		Class131_Sub2_Sub30.aClass214_5988.method2783(-100);
	    }
	    synchronized (Class192.aClass214_2824) {
		Class192.aClass214_2824.method2783(-109);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ab.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method142(int arg0, int arg1, boolean arg2,
				 Class130 arg3, Class187 arg4, int arg5) {
	try {
	    anInt81++;
	    Class51 class51
		= Class131_Sub2_Sub21.method1573((byte) -110, arg4.anInt2708);
	    if (class51.anInt670 != -1) {
		if (!arg4.aBoolean2719)
		    arg5 = 0;
		else {
		    arg5 += arg4.anInt2695;
		    arg5 &= 0x3;
		}
		Class152 class152
		    = class51.method594(arg4.aBoolean2722, arg5, -31318, arg3);
		if (class152 != null) {
		    int i = arg4.anInt2702;
		    int i_0_ = arg4.anInt2668;
		    if ((arg5 & 0x1) == 1) {
			i_0_ = arg4.anInt2702;
			i = arg4.anInt2668;
		    }
		    int i_1_ = class152.method2216();
		    if (arg2 != false)
			method143(null, -65);
		    int i_2_ = class152.method2198();
		    if (class51.aBoolean684) {
			i_2_ = i_0_ * 4;
			i_1_ = 4 * i;
		    }
		    if (class51.anInt674 == 0)
			class152.method2200(arg1, arg0 - i_0_ * 4 + 4, i_1_,
					    i_2_);
		    else
			class152.method2201(arg1, -(i_0_ * 4) - (-4 - arg0),
					    i_1_, i_2_, 1,
					    class51.anInt674 | ~0xffffff, 1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ab.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ')'));
	}
    }
    
    public static void method143(Class131_Sub21 arg0, int arg1) {
	anInt85++;
	if (arg0 != null && arg0 != Class66.aClass119_843.aClass131_1553) {
	    int i = arg0.anInt4444;
	    int i_3_ = arg0.anInt4441;
	    int i_4_ = arg0.anInt4442;
	    int i_5_ = (int) arg0.aLong4437;
	    if ((i_4_ ^ 0xffffffff) <= -2001)
		i_4_ -= 2000;
	    long l = arg0.aLong4437;
	    if (i_4_ == 59) {
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		if (class23_sub4_sub1_sub2 != null) {
		    Class91.anInt1181 = 2;
		    client.anInt3476++;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(94);
		    Class93.aClass131_Sub15_Sub2_1226.writeByte
			(Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i_5_,
								 (byte) -115);
		    Class210.Flag
			(-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0, 123,
			 class23_sub4_sub1_sub2.anIntArray5331[0],
			 class23_sub4_sub1_sub2.method335((byte) -78),
			 (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328
			  [0]),
			 (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331
			  [0]),
			 0, class23_sub4_sub1_sub2.method335((byte) -126),
			 true);
		}
	    }
	    if (i_4_ == 2) {
		Class93.aClass131_Sub15_Sub2_1226.createPacket(248);
		Class120_Sub2.anInt3972++;
		Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_);
		Class93.aClass131_Sub15_Sub2_1226.writeShortA(i, (byte) -121);
		Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i_5_,
							     (byte) -115);
		Class131_Sub2_Sub1.anInt5561 = 0;
		Class131_Sub41_Sub12.aClass173_6321
		    = Class190.method2615(i_3_, -54);
		Class71.anInt948 = i;
	    }
	    if (i_4_ == 4) {
		Class173 class173
		    = InputStream_Sub1.method87(i, i_3_, (byte) -109);
		if (class173 != null) {
		    Class63.method666(2878);
		    Class131_Sub37 class131_sub37 = client.method66(class173);
		    Class23_Sub1_Sub2.method303(class131_sub37.anInt4602,
						class173.anInt2374, i, false,
						class173.anInt2303,
						class131_sub37
						    .method1888((byte) 101),
						i_3_);
		    Class131_Sub1_Sub4.anInt5546 = 0;
		    Class131_Sub41_Sub2.aString6191
			= Class131_Sub2_Sub17.method1552(class173, (byte) 90);
		    if (Class131_Sub41_Sub2.aString6191 == null)
			Class131_Sub41_Sub2.aString6191 = "Null";
		    if (class173.aBoolean2355)
			Class112.aString1453
			    = class173.aString2391 + "<col=ffffff>";
		    else
			Class112.aString1453
			    = ("<col=00ff00>" + class173.aString2373
			       + "<col=ffffff>");
		}
	    } else {
		if (i_4_ == 1007 || i_4_ == 1002 || i_4_ == 1010
		    || i_4_ == 1003 || i_4_ == 1004)
		    Class131_Sub2_Sub37.method1637(i, -9328, i_4_, i_5_);
		if (i_4_ == 1009) {
		    Class34.anInt488++;
		    Class91.anInt1181 = 2;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(142);
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i_5_,
								 (byte) -127);
		}
		if (i_4_ == 18) {
		    Class93.anInt1216++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(78);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_);
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i_5_,
								 (byte) -120);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeShort(Class98.anInt1306);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i,
								 (byte) -115);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeInt1((byte) -98, Class88.anInt1161);
		    Class131_Sub2_Sub1.anInt5561 = 0;
		    Class131_Sub41_Sub12.aClass173_6321
			= Class190.method2615(i_3_, -4);
		    Class71.anInt948 = i;
		}
		if (i_4_ == 1005) {
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class91.anInt1181 = 2;
		    Class131_Sub29.anInt4513++;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(124);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614, i_5_);
		}
		if ((i_4_ ^ 0xffffffff) == -50) {
		    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		    if (class23_sub4_sub1_sub2 != null) {
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class121.anInt1592++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(152);
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82] ? 0
			      : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_);
			Class210.FlagNpcPlayer
			    (-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0,
			     -61, class23_sub4_sub1_sub2.anIntArray5331[0],
			     class23_sub4_sub1_sub2.method335((byte) -81),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub2.method335((byte) -85),
			     true);
		    }
		}
		if (i_4_ == 23) {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [i_5_]);
		    if (class23_sub4_sub1_sub1 != null) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class1_Sub4.anInt3550++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(136);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -55, Class182.anInt2604);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class210.Flag
			    (-2, class23_sub4_sub1_sub1.anIntArray5328[0], 0,
			     101, class23_sub4_sub1_sub1.anIntArray5331[0],
			     class23_sub4_sub1_sub1.method335((byte) -104),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub1.method335((byte) -38),
			     true);
		    }
		}
		if ((i_4_ ^ 0xffffffff) == -17) {
		    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		    if (class23_sub4_sub1_sub2 != null) {
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131.anInt1787++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(185);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_);
			Class210.Flag
			    (-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0,
			     99, class23_sub4_sub1_sub2.anIntArray5331[0],
			     class23_sub4_sub1_sub2.method335((byte) -102),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub2.method335((byte) -53),
			     true);
		    }
		}
		if (i_4_ == 42) {
		    Class131_Sub2_Sub11.anInt5715++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(69);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_);
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i,
								 (byte) -122);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614, i_5_);
		    Class131_Sub2_Sub1.anInt5561 = 0;
		    Class131_Sub41_Sub12.aClass173_6321
			= Class190.method2615(i_3_, -67);
		    Class71.anInt948 = i;
		}
		if (i_4_ == 1011) {
		    Class131_Sub41_Sub11_Sub1.anInt6554++;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class91.anInt1181 = 2;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(143);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA
			(-12614, (int) (l >>> -1337525664) & 0x7fffffff);
		    Class93.aClass131_Sub15_Sub2_1226.writeByteA
			(true,
			 Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeLEShortA(-12614, i + Class92.regionX);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeLEShortA(-12614, i_3_ - -Class64.regionY);
		    Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		}
		if (i_4_ == 11) {
		    Class63.method666(2878);
		    Class173 class173 = Class190.method2615(i_3_, -83);
		    Class209.anInt3038 = i;
		    Class131_Sub1_Sub4.anInt5546 = 1;
		    Class17.anInt178 = i_5_;
		    Class182.anInt2604 = i_3_;
		    Class23_Sub4_Sub4.method383(-125, class173);
		    Class148.aString1979
			= ("<col=ff9040>"
			   + Class131_Sub19.method1808(i_5_, false).aString341
			   + "<col=ffffff>");
		    if (Class148.aString1979 == null)
			Class148.aString1979 = "null";
		} else {
		    if (i_4_ == 44) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class121.anInt1587++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(159);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class98.anInt1306);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> -1466489760));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -58, Class88.anInt1161);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i - -Class92.regionX, (byte) -126);
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82] ? 0
			      : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ + Class64.regionY);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -9) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class126.anInt1693++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(207);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteS
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.FlagNpcPlayer
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -87,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -121),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -64),
				 true);
			}
		    }
		    if (i_4_ == 10) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class74.anInt1013++;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(141);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				((Class131_Sub2_Sub39.aBooleanArray6080[82]
				      ? 1 : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_);
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 14,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -38),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -93),
				 true);
			}
		    }
		    if (i_4_ == 38) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
			Class111.anInt3274++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class173 class173 = Class190.method2615(i_3_, -58);
			if (class173.anIntArrayArray2327 != null
			    && class173.anIntArrayArray2327[0][0] == 5) {
			    int i_6_ = class173.anIntArrayArray2327[0][1];
			    if ((Class131_Sub2_Sub13.anIntArray5735[i_6_]
				 ^ 0xffffffff)
				!= (class173.anIntArray2407[0] ^ 0xffffffff)) {
				Class131_Sub2_Sub13.anIntArray5735[i_6_]
				    = class173.anIntArray2407[0];
				Class131_Sub8_Sub1.method1683((byte) 102,
							      i_6_);
			    }
			}
		    }
		    if (i_4_ == 25) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class215.anInt3156++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(79);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class98.anInt1306, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt2(113414280, Class88.anInt1161);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -117);
			    Class210.FlagNpcPlayer
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 114,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -32),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -103),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -48) {
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class131_Sub2_Sub37.anInt6063++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(26);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i + Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA
			    (-12614, (int) (l >>> 425620320) & 0x7fffffff);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ - -Class64.regionY);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -41)
			Class131_Sub2.method1458(0, false);
		    if ((i_4_ ^ 0xffffffff) == -21) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class146.anInt1937++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(128);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -128);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteA
				(true,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 103,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -67),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -51),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -46) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class1_Sub4.anInt3546++;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(190);
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.regionY, (byte) -121);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> 11498848));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class92.regionX + i);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -15) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17_Sub1.anInt6562++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(38);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -108,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -52),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -92),
				 true);
			}
		    }
		    if (i_4_ == 46) {
			Class49.anInt652++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(194);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class64.regionY + i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -120);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i - -Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if ((i_4_ ^ 0xffffffff) == -33) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class203.anInt2956++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(40);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class64.regionY + i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(Class182.anInt2604);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i + Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 57) {
			if ((Class56.anInt745 ^ 0xffffffff) < -1
			    && Class131_Sub2_Sub39.aBooleanArray6080[82]
			    && Class131_Sub2_Sub39.aBooleanArray6080[81])
			    Class120_Sub2.method1035(Class29.anInt300,
						     i_3_ + Class64.regionY,
						     i + Class92.regionX,
						     63);
			else {
			    Class210.routeFinder(-4, i, 0, 126, i_3_, 1,
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5328[0]),
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5331[0]),
						0, 1, true, i_5_);
			    if (i_5_ != 1) {
				Class23_Sub4_Sub4.anInt5400 = 0;
				Class120_Sub2.anInt3966 = Class207.anInt3022;
				Class91.anInt1181 = 1;
				Class131_Sub41_Sub17.anInt6383
				    = Class131_Sub11.anInt4246;
			    //Class23_Sub4_Sub1_Sub1.method355(i_3_, i_5_, 0, i);
			    } else {
			    	// Class23_Sub4_Sub1_Sub1.method355(i_3_, i_5_, 0, i);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(-1);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(-1);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((int) Class120.aFloat1578);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(57);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(Class148.anInt1982);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(Class1_Sub7.anInt3590);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(89);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt3733));
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt3747));
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(63);
			    }
			    Class210.Flag(-4, i, 0, 126, i_3_, 1,
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5328[0]),
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5331[0]),
						0, 1, true, i_5_);
			}
		    }
		    if (i_4_ == 60) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class110_Sub2.anInt3908++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(174);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i + Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -124);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class64.regionY + i_3_);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if ((i_4_ ^ 0xffffffff) == -23)
			Class131_Sub1_Sub4.method1450(i_3_, i, -112);
		    if ((i_4_ ^ 0xffffffff) == -1009) {
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class66 class66
				= class23_sub4_sub1_sub1.aClass66_6474;
			    if (class66.anIntArray845 != null)
				class66 = class66.method697(true);
			    if (class66 != null) {
				Class93.aClass131_Sub15_Sub2_1226
				    .createPacket(49);
				Class22_Sub1.anInt3659++;
				Class93.aClass131_Sub15_Sub2_1226
				    .writeLEShort(class66.anInt900, (byte) -115);
			    }
			}
		    }
		    if (i_4_ == 5) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class81.anInt1077++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(6);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class64.regionY + i_3_, (byte) -121);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i - -Class92.regionX, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 29) {
			Class173 class173 = Class190.method2615(i_3_, -58);
			boolean bool = true;
			if (class173.anInt2441 > 0)
			    bool = Class214.method2772(class173, -5241);
			if (bool) {
			    Class111.anInt3274++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt(i_3_);
			}
		    }
		    if (i_4_ == 15) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(168);
			Class115.anInt1481++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -6);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 41) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class131_Sub29.anInt4509++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(254);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -128);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -32,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -98),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -99),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -37 || i_4_ == 1006)
			Class5.method161((byte) 31, arg0.aString4445, i_3_,
					 i_5_, i);
		    if (i_4_ == 34) {
			Class111.anInt3274++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class173 class173 = Class190.method2615(i_3_, -66);
			if (class173.anIntArrayArray2327 != null
			    && class173.anIntArrayArray2327[0][0] == 5) {
			    int i_7_ = class173.anIntArrayArray2327[0][1];
			    Class131_Sub2_Sub13.anIntArray5735[i_7_]
				= 1 - Class131_Sub2_Sub13.anIntArray5735[i_7_];
			    Class131_Sub8_Sub1.method1683((byte) 37, i_7_);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -40) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class131_Sub2_Sub26.anInt5928++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(12);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.regionY, (byte) -123);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class92.regionX + i);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				   ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (arg1 < 79)
			aClass214_83 = null;
		    if ((i_4_ ^ 0xffffffff) == -25
			&& Class164.aClass173_2193 == null) {
			Class160.method2383(false, i_3_, i);
			Class164.aClass173_2193
			    = InputStream_Sub1.method87(i, i_3_, (byte) -101);
			Class23_Sub4_Sub4.method383(-117,
						    Class164.aClass173_2193);
		    }
		    if (i_4_ == 48) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(111);
			Class1_Sub2.anInt3506++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -22);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 50) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class58.anInt764++;
			Class91.anInt1181 = 1;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(241);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.regionY, (byte) -124);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i + Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226
			    .method1769(Class88.anInt1161, -2062);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(Class98.anInt1306, (byte) -115);
			Class210.Flag(-4, i, 0, 113, i_3_, 1,
					    (Class166
					     .aClass23_Sub4_Sub1_Sub2_2216
					     .anIntArray5328[0]),
					    (Class166
					     .aClass23_Sub4_Sub1_Sub2_2216
					     .anIntArray5331[0]),
					    0, 1, true);
		    }
		    if ((i_4_ ^ 0xffffffff) == -13) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41.anInt4676++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(202);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_3_ - -Class64.regionY, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			    (0x7fffffff & (int) (l >>> -771693984),
			     (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -61, Class182.anInt2604);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class17.anInt178, (byte) -125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class209.anInt3038, (byte) -123);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i + Class92.regionX, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -27) {
			Class131_Sub41_Sub11.anInt6297++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(229);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -93);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 58) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class6.anInt94++;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(151);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class92.regionX + i);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_3_ + Class64.regionY);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 1 : 0));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 21) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub5_Sub1.anInt5032++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(35);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 88,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -108),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -82),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -18) {
			if (Class56.anInt745 > 0
			    && Class131_Sub2_Sub39.aBooleanArray6080[82]
			    && Class131_Sub2_Sub39.aBooleanArray6080[81])
			    Class120_Sub2.method1035(Class29.anInt300,
						     Class64.regionY - -i_3_,
						     Class92.regionX - -i,
						     63);
			else {
			    Class131_Sub23.anInt4450++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 1;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(160);
			    Class93.aClass131_Sub15_Sub2_1226.writeShortA
				(i + Class92.regionX, (byte) -127);
			    Class93.aClass131_Sub15_Sub2_1226.writeLEShort
				(i_3_ + Class64.regionY, (byte) -115);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -29) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class91.anInt1181 = 2;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class154.anInt2054++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(114);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, -62,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -45),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -67),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -2) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class52.anInt693++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(95);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, 87,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -39),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -35),
				 true);
			}
		    }
		    if (i_4_ == 7) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class130.anInt1768++;
			Class91.anInt1181 = 2;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(54);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class98.anInt1306);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 1 : 0));
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i - -Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -127, Class88.anInt1161);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_3_ - -Class64.regionY);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if ((i_4_ ^ 0xffffffff) == -14) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class67.anInt906++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(84);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class98.anInt1306, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteA
				(true,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt2(113414280, Class88.anInt1161);
			    Class210.Flag
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, 0,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -67),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -83),
				 true);
			}
		    }
		    if (i_4_ == 51) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class91.anInt1181 = 2;
			    Class131_Sub9.anInt4204++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(140);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 105,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -82),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -33),
				 true);
			}
		    }
		    if ((i_4_ ^ 0xffffffff) == -34) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class127_Sub1.anInt4006++;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(181);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class92.regionX + i, (byte) -127);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ + Class64.regionY);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> -203828896));
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    ((Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -38) {
			Class166.anInt2211++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(45);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i - -Class92.regionX);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			    (0x7fffffff & (int) (l >>> 1058159840),
			     (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_3_ + Class64.regionY, (byte) -115);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if ((i_4_ ^ 0xffffffff) == -32) {
			Class131_Sub21.anInt4435++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(29);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -94);
			Class71.anInt948 = i;
		    }
		    if ((i_4_ ^ 0xffffffff) == -20) {
			Class92.anInt1190++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(53);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -127);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i, (byte) -122);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -30);
			Class71.anInt948 = i;
		    }
		    if ((i_4_ ^ 0xffffffff) == -7) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(234);
			Class200.anInt2925++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -108);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 35) {
			Class44.anInt592++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(117);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .method1769(Class182.anInt2604, -2062);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -64);
			Class71.anInt948 = i;
		    }
		    if ((i_4_ ^ 0xffffffff) == -4) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(189);
			Class75.anInt1031++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -41);
			Class71.anInt948 = i;
		    }
		    if ((i_4_ ^ 0xffffffff) == -1013) {
			Class173 class173 = Class190.method2615(i_3_, -15);
			if (class173 == null || (class173.anIntArray2418[i]
						 ^ 0xffffffff) > -100001) {
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(124);
			    Class131_Sub29.anInt4513++;
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShortA(-12614, i_5_);
			} else
			    Class186.method2562((String.valueOf(class173
								.anIntArray2418
								[i])
						 + " x "
						 + (Class131_Sub19.method1808
						    (i_5_, false).aString341)),
						(byte) 53);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -113);
			Class71.anInt948 = i;
		    }
		    if ((i_4_ ^ 0xffffffff) == -10) {
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub13.anInt6323++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(138);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class209.anInt3038, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShortA(-12614, Class17.anInt178);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt(Class182.anInt2604);
			    Class210.Flag
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 99,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -45),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -30),
				 true);
			}
		    }
		    if (i_4_ == 30) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(66);
			Class76.anInt1038++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i, (byte) -121);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -5);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 43) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class131_Sub27.anInt4490++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(217);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteS
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -117);
			    Class210.Flag
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -99,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -99),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -76),
				 true);
			}
		    }
		    if ((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff) != -1) {
			Class131_Sub1_Sub4.anInt5546 = 0;
			Class23_Sub4_Sub4.method383
			    (-88,
			     Class190.method2615(Class182.anInt2604, -106));
		    }
		    if (Class154.aBoolean2047)
			Class63.method666(2878);
		    if (Class131_Sub41_Sub12.aClass173_6321 != null
			&& (Class131_Sub2_Sub1.anInt5561 ^ 0xffffffff) == -1)
			Class23_Sub4_Sub4.method383(-109, (Class131_Sub41_Sub12
							   .aClass173_6321));
		}
	    }
	}
    }
    
    public static void method144(int arg0) {
	try {
	    if (arg0 != 42)
		anIntArray86 = null;
	    anIntArray86 = null;
	    aClass214_83 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ab.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_83 = new Class214(50);
    }
}
