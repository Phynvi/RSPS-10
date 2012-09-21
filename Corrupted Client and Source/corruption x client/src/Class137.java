/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class137
{
    public static Class214 aClass214_1834 = new Class214(64);
    public static int anInt1835;
    public static int anInt1836;
    public static int anInt1837;
    public Class131_Sub41 aClass131_Sub41_1838 = new Class131_Sub41();
    public static int anInt1839;
    public static int anInt1840;
    public int anInt1841;
    public static int anInt1842;
    public Class180 aClass180_1843;
    public int anInt1844;
    public static int anInt1845;
    public Class175 aClass175_1846 = new Class175();
    public static int anInt1847;
    public static int anInt1848;
    
    public void method2110(Class131_Sub41 arg0, boolean arg1, long arg2) {
	try {
	    anInt1837++;
	    if ((anInt1844 ^ 0xffffffff) == -1) {
		Class131_Sub41 class131_sub41
		    = aClass175_1846.method2476((byte) 67);
		class131_sub41.method1355((byte) 114);
		class131_sub41.method1919(-29183);
		if (aClass131_Sub41_1838 == class131_sub41) {
		    class131_sub41 = aClass175_1846.method2476((byte) 67);
		    class131_sub41.method1355((byte) 114);
		    class131_sub41.method1919(-29183);
		}
	    } else
		anInt1844--;
	    aClass180_1843.method2523(arg1, arg2, arg0);
	    aClass175_1846.method2477(arg0, -26);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("op.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public Class131_Sub41 method2111(int arg0, long arg1) {
	try {
	    anInt1842++;
	    if (arg0 != -12)
		method2117(null, 2, null, 49L, 9, 6, false, 25, 67, false,
			   true);
	    Class131_Sub41 class131_sub41
		= (Class131_Sub41) aClass180_1843.method2521(111, arg1);
	    if (class131_sub41 != null)
		aClass175_1846.method2477(class131_sub41, -26);
	    return class131_sub41;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("op.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2112(int arg0) {
	try {
	    anInt1847++;
	    aClass175_1846.method2479((byte) -118);
	    aClass180_1843.method2519(124);
	    aClass131_Sub41_1838 = new Class131_Sub41();
	    anInt1844 = anInt1841;
	    int i = 125 % ((arg0 - 36) / 49);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"op.B(" + arg0 + ')');
	}
    }
    
    public static void method2113(int arg0) {
	try {
	    anInt1840++;
	    while ((Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.method1785(Class131_Sub8_Sub1.anInt6100, (byte) 106)
		    ^ 0xffffffff)
		   <= -12) {
		int i = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			    .readBits(11, false);
		if ((i ^ 0xffffffff) == -2048)
		    break;
		boolean bool = false;
		if (Class105.aClass23_Sub4_Sub1_Sub2Array1373[i] == null) {
		    Class105.aClass23_Sub4_Sub1_Sub2Array1373[i]
			= new Class23_Sub4_Sub1_Sub2();
		    Class105.aClass23_Sub4_Sub1_Sub2Array1373[i].anInt5274 = i;
		    if (Class55.aStreamArray726[i] != null)
			Class105.aClass23_Sub4_Sub1_Sub2Array1373[i].renderPlayer
			    (Class55.aStreamArray726[i],
			     arg0 ^ ~0x16f2);
		    bool = true;
		}
		Class148.anIntArray1983[Class131_Sub38.anInt4618++] = i;
		Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i];
		class23_sub4_sub1_sub2.anInt5285 = Class125.anInt1632;
		int i_0_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(5, false);
		if (i_0_ > 15)
		    i_0_ -= 32;
		int i_1_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(5, false);
		if (i_1_ > 15)
		    i_1_ -= 32;
		int i_2_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(1, false);
		int i_3_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readBits(1, false);
		if ((i_3_ ^ 0xffffffff) == -2)
		    Class128_Sub1.anIntArray4019[Class202.anInt2943++] = i;
		int i_4_ = (Class138.anIntArray1857
			    [Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readBits(3, false)]);
		if (bool)
		    class23_sub4_sub1_sub2.method338(arg0 + -5886, i_4_);
		class23_sub4_sub1_sub2.method358
		    (i_2_ == 1, true,
		     i_0_ + (Class166.aClass23_Sub4_Sub1_Sub2_2216
			     .anIntArray5331[0]),
		     Class29.anInt300,
		     (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0]
		      - -i_1_));
	    }
	    if (arg0 != 5784)
		method2116(-103, 49, 39, 26, true, 82, -113);
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
		.method1788(arg0 ^ 0x17d8);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"op.E(" + arg0 + ')');
	}
    }
    
    public static void method2114(boolean arg0, double arg1) {
	try {
	    if (arg1 != Class14.aDouble161) {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
		    int i_5_
			= (int) (255.0 * Math.pow((double) i / 255.0, arg1));
		    Class17.anIntArray185[i]
			= (i_5_ ^ 0xffffffff) < -256 ? 255 : i_5_;
		}
		Class14.aDouble161 = arg1;
	    }
	    if (arg0 != true)
		method2114(false, 0.6226619863472215);
	    anInt1836++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("op.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2115(byte arg0) {
	try {
	    if (arg0 != -65)
		aClass214_1834 = null;
	    aClass214_1834 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"op.A(" + arg0 + ')');
	}
    }
    
    public static void method2116(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, int arg5, int arg6) {
	anInt1839++;
	if (arg0 < Class149.anInt1988
	    || (Class115.anInt1477 ^ 0xffffffff) > (arg1 ^ 0xffffffff)
	    || (Class116.anInt1494 ^ 0xffffffff) < (arg5 ^ 0xffffffff)
	    || Class125.anInt1629 < arg3) {
	    if (arg6 == 1)
		Class58.method638(arg2, arg0, 921, arg3, arg1, arg5);
	    else
		Class105.method912(arg2, arg0, 115, arg5, arg3, arg1, arg6);
	} else if ((arg6 ^ 0xffffffff) != -2)
	    Class9.method193(-1, arg2, arg6, arg3, arg0, arg5, arg1);
	else
	    Class131_Sub2_Sub30.method1619((byte) -103, arg0, arg1, arg5, arg2,
					   arg3);
	if (arg4 != false)
	    aClass214_1834 = null;
    }
    
    public static void method2117
	(String arg0, int arg1, String arg2, long arg3, int arg4, int arg5,
	 boolean arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
	try {
	    anInt1848++;
	    int[] is = new int[4];
	    for (int i = 0; (i ^ 0xffffffff) > -4; i++)
		is[i] = (int) (9.9999999E7 * Math.random());
	    if (arg8 != 24672)
		method2116(96, 115, 38, 12, false, 20, -91);
	    Stream stream = new Stream(128);
	    stream.writeByte(10);
	    stream.writeShort((arg9 ? 4 : 0) | ((!arg6 ? 0 : 2)
							| (!arg10 ? 0 : 1)));
	    stream.method1747((byte) 119, arg3);
	    stream.writeInt(is[0]);
	    stream.writeString(arg2, (byte) -99);
	    stream.writeInt(is[1]);
	    stream.writeShort(Class131_Sub2_Sub22.anInt5863);
	    stream.writeByte(arg7);
	    stream.writeByte(arg4);
	    stream.writeInt(is[2]);
	    stream.writeShort(arg1);
	    stream.writeShort(arg5);
	    stream.writeInt(is[3]);
	    stream.method1761(RuntimeException_Sub1.aBigInteger3246,
				      (byte) -120,
				      Class131_Sub2_Sub10.aBigInteger5699);
	    Stream stream_6_ = new Stream(350);
	    stream_6_.writeString(arg0, (byte) -124);
	    int i = -(Class131_Sub30.method1856((byte) -118, arg0) % 8) + 8;
	    for (int i_7_ = 0; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
		stream_6_.writeByte((int) (255.0 * Math.random()));
	    stream_6_.method1748(0, is);
	    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
	    Class93.aClass131_Sub15_Sub2_1226.writeByte(22);
	    Class93.aClass131_Sub15_Sub2_1226.writeShort
		(stream.offset + (2 - -stream_6_.offset));
	    Class93.aClass131_Sub15_Sub2_1226.writeShort(562);
	    Class93.aClass131_Sub15_Sub2_1226.method1734(0, -81,
							 (stream
							  .data),
							 (stream
							  .offset));
	    Class93.aClass131_Sub15_Sub2_1226.method1734(0, -114,
							 (stream_6_
							  .data),
							 (stream_6_
							  .offset));
	    Class35.anInt496 = 0;
	    Class131_Sub2_Sub21.anInt5854 = 0;
	    Class131_Sub2_Sub20.anInt5838 = -3;
	    Class176.anInt2523 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("op.H(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')'));
	}
    }
    
    public static void method2118(int arg0) {
	try {
	    anInt1845++;
	    if (Class1_Sub7.anInt3581 != 2) {
		try {
		    if (arg0 > -100)
			aClass214_1834 = null;
		    Class30.method432(Class131_Sub2_Sub39.aClient6084,
				      (byte) -100, "tbrefresh");
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"op.G(" + arg0 + ')');
	}
    }
    
    public Class137(int arg0) {
	try {
	    anInt1841 = arg0;
	    anInt1844 = arg0;
	    int i;
	    for (i = 1; (arg0 ^ 0xffffffff) < (i + i ^ 0xffffffff); i += i) {
		/* empty */
	    }
	    aClass180_1843 = new Class180(i);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"op.<init>(" + arg0 + ')');
	}
    }
}
