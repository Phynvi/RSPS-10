/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class42
{
    public boolean aBoolean556;
    public boolean aBoolean557;
    public boolean aBoolean558;
    public byte aByte559;
    public boolean aBoolean560;
    public byte aByte561;
    public byte aByte562;
    public static int anInt563 = 0;
    public boolean aBoolean564;
    public byte aByte565;
    public static int anInt566;
    public static int anInt567;
    public boolean aBoolean568;
    public boolean aBoolean569;
    public byte aByte570;
    public static boolean[] aBooleanArray571 = new boolean[8];
    public boolean aBoolean572;
    public static int anInt573;
    public static Class50 aClass50_574;
    public boolean aBoolean575;
    public byte aByte576;
    public byte aByte577;
    public short aShort578;
    public static int anInt579;
    public static int anInt580;
    
    public static void method516(int arg0) {
	Class127_Sub1.aClass214_4007.method2783(-85);
	anInt567++;
	if (arg0 < 16)
	    method519((byte) -106);
    }
    
    public static void method517(byte arg0, int arg1,
				 Class23_Sub4_Sub1_Sub2 arg2, int arg3) {
	anInt579++;
	if ((arg1 & 0x800) != 0) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedLEShortA(-1);
	    arg2.anInt5295 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteA((byte) -115);
	    arg2.anInt5259 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
	    arg2.aBoolean5312 = (0x8000 & i ^ 0xffffffff) != -1;
	    arg2.anInt5302 = i & 0x7fff;
	    arg2.anInt5269
		= arg2.anInt5295 + (Class125.anInt1632 + arg2.anInt5302);
	}
	if ((arg1 & 0x20 ^ 0xffffffff) != -1) {
	    arg2.aString5280 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				   .readString(false);
	    if ((arg2.aString5280.charAt(0) ^ 0xffffffff) != -127) {
		if (arg2 == Class166.aClass23_Sub4_Sub1_Sub2_2216)
		    Class131_Sub2_Sub10_Sub1.method1519
			(arg2.method361(false, (byte) -44), 2, -65,
			 arg2.method363(true, true), 0, arg2.aString5280);
	    } else {
		arg2.aString5280 = arg2.aString5280.substring(1);
		Class131_Sub2_Sub10_Sub1.method1519(arg2.method361(false,
								   (byte) -44),
						    2, -64,
						    arg2.method363(true, true),
						    0, arg2.aString5280);
	    }
	    arg2.anInt5276 = 150;
	    arg2.anInt5301 = 0;
	    arg2.anInt5283 = 0;
	}
	if ((0x4 & arg1) != 0) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readSmart(-1647926640);
	    int i_0_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			   .readUnsignedByteA((byte) -123);
	    arg2.method337(0, i, i_0_, Class125.anInt1632);
	    arg2.anInt5272 = Class125.anInt1632 - -300;
	    arg2.anInt5277
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	}
	if ((0x80 & arg1) != 0) {
	    arg2.anInt5255
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104);
	    if (arg2.anInt5255 == 65535)
		arg2.anInt5255 = -1;
	}
	if ((arg1 & 0x10 ^ 0xffffffff) != -1) {
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(102);
	    byte[] is = new byte[i];
	    Stream stream = new Stream(is);
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1737(is, i, 0,
								   (byte) 105);
	    Class55.aStreamArray726[arg3] = stream;
	    arg2.renderPlayer(stream, -44);
	}
	if ((arg1 & 0x2 ^ 0xffffffff) != -1) {
	    arg2.anInt5246 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
	    arg2.anInt5299
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedLEShortA(-1);
	}
	if ((0x200 & arg1 ^ 0xffffffff) != -1) {
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-97);
	    int[] is = new int[i];
	    int[] is_1_ = new int[i];
	    int[] is_2_ = new int[i];
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_3_++) {
		int i_4_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedShortA(false);
		if (i_4_ == 65535)
		    i_4_ = -1;
		is[i_3_] = i_4_;
		is_1_[i_3_] = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedByteA((byte) 61);
		is_2_[i_3_] = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShortA(false);
	    }
	    Class82.method795(arg2, is, false, is_2_, is_1_);
	}
	if ((0x8 & arg1) != 0) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readUnsignedShortA(false);
	    if (i == 65535)
		i = -1;
	    int i_5_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			   .readUnsignedByteS(14684);
	    Class131_Sub41_Sub17.method2043(i, (byte) -127, i_5_, arg2);
	}
	if (arg0 < 70)
	    method519((byte) 63);
	if ((0x100 & arg1) != 0) {
	    int i
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104);
	    if (i == 65535)
		i = -1;
	    int i_6_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			   .readUnsignedInt1(65280);
	    boolean bool = true;
	    if ((i ^ 0xffffffff) != 0 && arg2.anInt5253 != -1) {
		if (i == arg2.anInt5253) {
		    Class112 class112 = Class151.method2194(i, -6861);
		    if (class112.aBoolean1448 && class112.anInt1450 != -1) {
			Class161 class161
			    = Class145.method2159(class112.anInt1450,
						  (byte) -90);
			int i_7_ = class161.anInt2155;
			if (i_7_ != 0) {
			    if (i_7_ != 1) {
				if (i_7_ == 2) {
				    arg2.anInt5307 = 0;
				    bool = false;
				}
			    } else
				bool = true;
			} else
			    bool = false;
		    }
		} else {
		    Class112 class112 = Class151.method2194(i, -6861);
		    Class112 class112_8_
			= Class151.method2194(arg2.anInt5253, -6861);
		    if ((class112.anInt1450 ^ 0xffffffff) != 0
			&& (class112_8_.anInt1450 ^ 0xffffffff) != 0) {
			Class161 class161
			    = Class145.method2159(class112.anInt1450,
						  (byte) -123);
			Class161 class161_9_
			    = Class145.method2159(class112_8_.anInt1450,
						  (byte) -122);
			if ((class161.anInt2142 ^ 0xffffffff)
			    > (class161_9_.anInt2142 ^ 0xffffffff))
			    bool = false;
		    }
		}
	    }
	    if (bool) {
		arg2.anInt5288 = 0;
		arg2.anInt5251 = 1;
		arg2.anInt5287 = Class125.anInt1632 + (i_6_ & 0xffff);
		arg2.anInt5286 = i_6_ >> 1744323088;
		arg2.anInt5262 = 0;
		arg2.anInt5253 = i;
		if ((Class125.anInt1632 ^ 0xffffffff)
		    > (arg2.anInt5287 ^ 0xffffffff))
		    arg2.anInt5262 = -1;
		if (arg2.anInt5253 != -1
		    && Class125.anInt1632 == arg2.anInt5287) {
		    int i_10_
			= Class151.method2194(arg2.anInt5253, -6861).anInt1450;
		    if (i_10_ != -1) {
			Class161 class161
			    = Class145.method2159(i_10_, (byte) -120);
			if (class161 != null
			    && class161.anIntArray2139 != null)
			    Login.method1153
				(arg2.anInt3733, 21155,
				 Class166.aClass23_Sub4_Sub1_Sub2_2216 == arg2,
				 0, arg2.anInt3747, class161);
		    }
		}
	    }
	}
	if ((0x1000 & arg1 ^ 0xffffffff) != -1) {
	    arg2.anInt5281
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	    arg2.anInt5249
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(82);
	    arg2.anInt5271
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
	    arg2.anInt5266
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(98);
	    arg2.anInt5306
		= (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedShort(8104)
		   - -Class125.anInt1632);
	    arg2.anInt5245 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false) + Class125.anInt1632;
	    arg2.anInt5267 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteA((byte) -111);
	    arg2.anInt5334 = 1;
	    arg2.anInt5330 = 0;
	}
	if ((arg1 & 0x400 ^ 0xffffffff) != -1) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readSmart(-1647926640);
	    int i_11_
		= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-92);
	    arg2.method337(0, i, i_11_, Class125.anInt1632);
	}
	if ((arg1 & 0x40 ^ 0xffffffff) != -1) {
	    int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedLEShortA(-1);
	    int i_12_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByteA((byte) 85);
	    int i_13_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readUnsignedByteS(14684);
	    int i_14_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset;
	    boolean bool = (0x8000 & i ^ 0xffffffff) != -1;
	    if (arg2.aString6491 != null && arg2.aClass188_6513 != null) {
		boolean bool_15_ = false;
		if (i_12_ <= 1) {
		    if (!bool && (Class103.aBoolean1353 && !Class60.aBoolean786
				  || Class183_Sub1.aBoolean4956))
			bool_15_ = true;
		    else if (Class214.method2787(arg2.aString6491, -116))
			bool_15_ = true;
		}
		if (!bool_15_ && Class203.anInt2967 == 0) {
		    Class131_Sub9.aStream_4198.offset = 0;
		    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1768
			(0, i_13_, (byte) -83,
			 Class131_Sub9.aStream_4198.data);
		    Class131_Sub9.aStream_4198.offset = 0;
		    int i_16_ = -1;
		    String string;
		    if (bool) {
			i &= 0x7fff;
			Class113 class113
			    = (Class131_Sub14.method1715
			       (10, Class131_Sub9.aStream_4198));
			i_16_ = class113.anInt1464;
			string = (class113.aClass131_Sub41_Sub8_1459.method1984
				  (Class131_Sub9.aStream_4198, -8507));
		    } else
			string
			    = (Class115.method981
			       (0,
				(Class211.method2764
				 (63,
				  Class101.method885((Class131_Sub9
						      .aStream_4198),
						     32767)))));
		    arg2.aString5280 = string.trim();
		    arg2.anInt5276 = 150;
		    arg2.anInt5301 = i >> 1126703880;
		    arg2.anInt5283 = 0xff & i;
		    int i_17_;
		    if (i_12_ != 1 && (i_12_ ^ 0xffffffff) != -3)
			i_17_ = !bool ? 2 : 17;
		    else
			i_17_ = bool ? 17 : 1;
		    if (i_12_ == 2)
			Class23_Sub4_Sub3.method376
			    ("<img=1>" + arg2.method363(true, true),
			     "<img=1>" + arg2.method361(false, (byte) -44),
			     -23645, i_17_, string, 0, null, i_16_);
		    else if (i_12_ != 1)
			Class23_Sub4_Sub3.method376(arg2.method363(true, true),
						    arg2.method361(false,
								   (byte) -44),
						    -23645, i_17_, string, 0,
						    null, i_16_);
		    else
			Class23_Sub4_Sub3.method376
			    ("<img=0>" + arg2.method363(true, true),
			     "<img=0>" + arg2.method361(false, (byte) -44),
			     -23645, i_17_, string, 0, null, i_16_);
		}
	    }
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset
		= i_13_ + i_14_;
	}
    }
    
    public static void updatePlayer(int arg0) {
	try {
	    anInt573++;
	    Class202.anInt2943 = 0;
	    Class131_Sub2_Sub1.anInt5560 = 0;
	    Class68.method718(3943);
	    Class23_Sub1_Sub2.method301(5816);
	    Class137.method2113(5784);
	    Class23.method292(-1);
	    if (arg0 > 107) {
		for (int i = 0; Class131_Sub2_Sub1.anInt5560 > i; i++) {
		    int i_18_ = Class131_Sub35.anIntArray4589[i];
		    if (((Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_18_]
			  .anInt5285)
			 ^ 0xffffffff)
			!= (Class125.anInt1632 ^ 0xffffffff)) {
			if ((Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_18_]
			     .anInt6517)
			    > 0)
			    OutputStream_Sub1.method90
				((Class105.aClass23_Sub4_Sub1_Sub2Array1373
				  [i_18_]),
				 4);
			Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_18_]
			    = null;
		    }
		}
		if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset
		    != Class131_Sub8_Sub1.anInt6100)
		    throw new RuntimeException("gpp1 pos:"
					       + (Class23_Sub3_Sub1
						  .aClass131_Sub15_Sub2_5231
						  .offset)
					       + " psize:"
					       + Class131_Sub8_Sub1.anInt6100);
		for (int i = 0; ((Class131_Sub38.anInt4618 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    if ((Class105.aClass23_Sub4_Sub1_Sub2Array1373
			 [Class148.anIntArray1983[i]])
			== null)
			throw new RuntimeException("gpp2 pos:" + i + " size:"
						   + Class131_Sub38.anInt4618);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dp.D(" + arg0 + ')');
	}
    }
    
    public static void method519(byte arg0) {
	try {
	    if (arg0 >= 5) {
		aBooleanArray571 = null;
		aClass50_574 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dp.E(" + arg0 + ')');
	}
    }
    
    public static void method520(int arg0, String arg1) {
	try {
	    anInt566++;
	    Class23_Sub2_Sub2.aString5186 = arg1;
	    if (Class23_Sub4.aSignLink_3734.anApplet2883 != null) {
		try {
		    if (arg0 != 1)
			method519((byte) -111);
		    String string = Class23_Sub4.aSignLink_3734
					.anApplet2883
					.getParameter("cookieprefix");
		    String string_19_
			= Class23_Sub4.aSignLink_3734.anApplet2883
			      .getParameter("cookiehost");
		    String string_20_
			= (string + "settings=" + arg1
			   + "; version=1; path=/; domain=" + string_19_);
		    if (arg1.length() == 0)
			string_20_
			    += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
		    else
			string_20_
			    += ("; Expires="
				+ (Class131_Sub14.method1716
				   ((byte) 40,
				    94608000000L + Class208.method2749(-3913)))
				+ "; Max-Age=" + 94608000L);
		    Class30.method433(arg0 ^ 0x20a7,
				      "document.cookie=\"" + string_20_ + "\"",
				      (Class23_Sub4.aSignLink_3734
				       .anApplet2883));
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dp.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
