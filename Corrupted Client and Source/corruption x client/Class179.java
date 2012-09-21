/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;

public class Class179
{
    public static int anInt2538;
    public static int anInt2539;
    public static int anInt2540;
    public static int[] anIntArray2541 = { 1, 2, 4, 8 };
    public static int anInt2542;
    public static int anInt2543 = -1;
    public static int anInt2544;
    public static int anInt2545;
    public static int anInt2546;
    public static int anInt2547;
    public static int anInt2548;
    public static int anInt2549;
    public static int anInt2550;
    public static int anInt2551;
    public static int anInt2552;
    public static int anInt2553;
    public static int anInt2554;
    public Class175 aClass175_2555 = new Class175();
    public static int anInt2556;
    public Class175 aClass175_2557 = new Class175();
    public static int anInt2558;
    public Class175 aClass175_2559 = new Class175();
    public Class175 aClass175_2560 = new Class175();
    public int anInt2561;
    public Stream aStream_2562 = new Stream(4);
    public long aLong2563;
    public Class33 aClass33_2564;
    public byte aByte2565 = 0;
    public volatile int anInt2566 = 0;
    public Stream aStream_2567;
    public volatile int anInt2568 = 0;
    public Class131_Sub41_Sub21_Sub1 aClass131_Sub41_Sub21_Sub1_2569;

    public static void method2495(int arg0, boolean arg1, boolean arg2,
				  int arg3, boolean arg4, int arg5, int arg6) {
	try {
	    if ((arg0 ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
		int i = (arg0 + arg3) / 2;
		int i_0_ = arg3;
		Class128_Sub1 class128_sub1
		    = Class110_Sub4.aClass128_Sub1Array3939[i];
		Class110_Sub4.aClass128_Sub1Array3939[i]
		    = Class110_Sub4.aClass128_Sub1Array3939[arg0];
		Class110_Sub4.aClass128_Sub1Array3939[arg0] = class128_sub1;
		for (int i_1_ = arg3;
		     (i_1_ ^ 0xffffffff) > (arg0 ^ 0xffffffff); i_1_++) {
		    if (Class110.method933(class128_sub1, arg2, arg6, arg5,
					   (Class110_Sub4
					    .aClass128_Sub1Array3939[i_1_]),
					   -30906, arg1)
			<= 0) {
			Class128_Sub1 class128_sub1_2_
			    = Class110_Sub4.aClass128_Sub1Array3939[i_1_];
			Class110_Sub4.aClass128_Sub1Array3939[i_1_]
			    = Class110_Sub4.aClass128_Sub1Array3939[i_0_];
			Class110_Sub4.aClass128_Sub1Array3939[i_0_++]
			    = class128_sub1_2_;
		    }
		}
		Class110_Sub4.aClass128_Sub1Array3939[arg0]
		    = Class110_Sub4.aClass128_Sub1Array3939[i_0_];
		Class110_Sub4.aClass128_Sub1Array3939[i_0_] = class128_sub1;
		method2495(-1 + i_0_, arg1, arg2, arg3, false, arg5, arg6);
		method2495(arg0, arg1, arg2, 1 + i_0_, false, arg5, arg6);
	    }
	    if (arg4 == false)
		anInt2552++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.R(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public int method2496(boolean arg0) {
	try {
	    if (arg0 != false)
		method2495(-120, false, false, 102, false, -111, 1);
	    anInt2548++;
	    return (aClass175_2559.method2475(0)
		    - -aClass175_2560.method2475(0));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.E(" + arg0 + ')');
	}
    }
    
    public void method2497(boolean arg0, int arg1) {
	try {
	    anInt2539++;
	    if (aClass33_2564 != null) {
		try {
		    aStream_2562.offset = 0;
		    aStream_2562.writeByte(arg0 ? 2 : 3);
		    aStream_2562.method1726((byte) 59, 0);
		    if (arg1 >= -14)
			anInt2543 = 68;
		    aClass33_2564.method454(118, 4, 0, (aStream_2562
							.data));
		} catch (IOException ioexception) {
		    try {
			aClass33_2564.method452(-1);
		    } catch (Exception exception) {
			/* empty */
		    }
		    anInt2568 = -2;
		    aClass33_2564 = null;
		    anInt2566++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.K(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method2498(int arg0) {
	try {
	    if (aClass33_2564 != null) {
		long l = Class208.method2749(-3913);
		int i = (int) (l - aLong2563);
		aLong2563 = l;
		if ((i ^ 0xffffffff) < -201)
		    i = 200;
		anInt2561 += i;
		if (anInt2561 > 30000) {
		    try {
			aClass33_2564.method452(-1);
		    } catch (Exception exception) {
			/* empty */
		    }
		    aClass33_2564 = null;
		}
	    }
	    anInt2554++;
	    if (aClass33_2564 == null) {
		if ((method2506(4) ^ 0xffffffff) == -1
		    && (method2496(false) ^ 0xffffffff) == -1)
		    return true;
		return false;
	    }
	    try {
		aClass33_2564.method448(-24448);
		Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
		    = ((Class131_Sub41_Sub21_Sub1)
		       aClass175_2555.method2485(-108));
		if (arg0 > -127)
		    method2508(-47, null, false);
		for (/**/; class131_sub41_sub21_sub1 != null;
		     class131_sub41_sub21_sub1
			 = ((Class131_Sub41_Sub21_Sub1)
			    aClass175_2555.method2482(-77))) {
		    aStream_2562.offset = 0;
		    aStream_2562.writeByte(1);
		    aStream_2562.method1726
			((byte) 59, (int) class131_sub41_sub21_sub1.aLong4671);
		    aClass33_2564.method454(81, 4, 0, (aStream_2562
						       .data));
		    aClass175_2557.method2477(class131_sub41_sub21_sub1, -26);
		}
		for (Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1_3_
			 = ((Class131_Sub41_Sub21_Sub1)
			    aClass175_2559.method2485(-70));
		     class131_sub41_sub21_sub1_3_ != null;
		     class131_sub41_sub21_sub1_3_
			 = ((Class131_Sub41_Sub21_Sub1)
			    aClass175_2559.method2482(-85))) {
		    aStream_2562.offset = 0;
		    aStream_2562.writeByte(0);
		    aStream_2562.method1726
			((byte) 59,
			 (int) class131_sub41_sub21_sub1_3_.aLong4671);
		    aClass33_2564.method454(126, 4, 0, (aStream_2562
							.data));
		    aClass175_2560.method2477(class131_sub41_sub21_sub1_3_,
					      -26);
		}
		for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
		    int i_4_ = aClass33_2564.method450((byte) 17);
		    if ((i_4_ ^ 0xffffffff) > -1)
			throw new IOException();
		    if (i_4_ == 0)
			break;
		    anInt2561 = 0;
		    int i_5_ = 0;
		    if (aClass131_Sub41_Sub21_Sub1_2569 == null)
			i_5_ = 8;
		    else if (aClass131_Sub41_Sub21_Sub1_2569.anInt6582 == 0)
			i_5_ = 1;
		    if (i_5_ <= 0) {
			int i_6_ = (-aClass131_Sub41_Sub21_Sub1_2569.aByte6575
				    + (aClass131_Sub41_Sub21_Sub1_2569
				       .aStream_6576
				       .data).length);
			int i_7_
			    = 512 - aClass131_Sub41_Sub21_Sub1_2569.anInt6582;
			if ((-(aClass131_Sub41_Sub21_Sub1_2569
			       .aStream_6576.offset) + i_6_
			     ^ 0xffffffff)
			    > (i_7_ ^ 0xffffffff))
			    i_7_ = i_6_ + -(aClass131_Sub41_Sub21_Sub1_2569
					    .aStream_6576.offset);
			if (i_4_ < i_7_)
			    i_7_ = i_4_;
			aClass33_2564.method451
			    (122,
			     (aClass131_Sub41_Sub21_Sub1_2569
			      .aStream_6576.offset),
			     (aClass131_Sub41_Sub21_Sub1_2569
			      .aStream_6576.data),
			     i_7_);
			if (aByte2565 != 0) {
			    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				aClass131_Sub41_Sub21_Sub1_2569
				    .aStream_6576.data
				    [(aClass131_Sub41_Sub21_Sub1_2569
				      .aStream_6576.offset) - -i_8_]
				    = (byte) (Class23_Sub4_Sub5.method390
					      ((aClass131_Sub41_Sub21_Sub1_2569
						.aStream_6576
						.data
						[(aClass131_Sub41_Sub21_Sub1_2569
						  .aStream_6576
						  .offset) + i_8_]),
					       aByte2565));
			}
			aClass131_Sub41_Sub21_Sub1_2569.anInt6582 += i_7_;
			aClass131_Sub41_Sub21_Sub1_2569
			    .aStream_6576.offset
			    += i_7_;
			if (i_6_ == (aClass131_Sub41_Sub21_Sub1_2569
				     .aStream_6576.offset)) {
			    aClass131_Sub41_Sub21_Sub1_2569.method1919(-29183);
			    aClass131_Sub41_Sub21_Sub1_2569.aBoolean6440
				= false;
			    aClass131_Sub41_Sub21_Sub1_2569 = null;
			} else if (aClass131_Sub41_Sub21_Sub1_2569.anInt6582
				   == 512)
			    aClass131_Sub41_Sub21_Sub1_2569.anInt6582 = 0;
		    } else {
			int i_9_ = -aStream_2567.offset + i_5_;
			if (i_9_ > i_4_)
			    i_9_ = i_4_;
			aClass33_2564.method451(124,
						aStream_2567.offset,
						(aStream_2567
						 .data),
						i_9_);
			if ((aByte2565 ^ 0xffffffff) != -1) {
			    for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
				aStream_2567.data
				    [i_10_ + aStream_2567.offset]
				    = (byte) (Class23_Sub4_Sub5.method390
					      ((aStream_2567
						.data
						[i_10_ + (aStream_2567
							  .offset)]),
					       aByte2565));
			}
			aStream_2567.offset += i_9_;
			if ((aStream_2567.offset ^ 0xffffffff)
			    <= (i_5_ ^ 0xffffffff)) {
			    if (aClass131_Sub41_Sub21_Sub1_2569 == null) {
				aStream_2567.offset = 0;
				int i_11_
				    = aStream_2567.readUnsignedByte(115);
				int i_12_
				    = aStream_2567.readUnsignedShort(8104);
				int i_13_
				    = aStream_2567.readUnsignedByte(122);
				int i_14_
				    = aStream_2567.readUnsignedInt(-2);
				int i_15_ = 0x7f & i_13_;
				boolean bool = (0x80 & i_13_) != 0;
				long l
				    = (long) (i_12_ + (i_11_ << -1433810608));
				Object object = null;
				Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1_16_;
				if (bool) {
				    for (class131_sub41_sub21_sub1_16_
					     = ((Class131_Sub41_Sub21_Sub1)
						aClass175_2560
						    .method2485(-42));
					 class131_sub41_sub21_sub1_16_ != null;
					 class131_sub41_sub21_sub1_16_
					     = ((Class131_Sub41_Sub21_Sub1)
						aClass175_2560
						    .method2482(-121))) {
					if (((class131_sub41_sub21_sub1_16_
					      .aLong4671)
					     ^ 0xffffffffffffffffL)
					    == (l ^ 0xffffffffffffffffL))
					    break;
				    }
				} else {
				    for (class131_sub41_sub21_sub1_16_
					     = ((Class131_Sub41_Sub21_Sub1)
						aClass175_2557
						    .method2485(-55));
					 class131_sub41_sub21_sub1_16_ != null;
					 class131_sub41_sub21_sub1_16_
					     = ((Class131_Sub41_Sub21_Sub1)
						aClass175_2557
						    .method2482(-121))) {
					if ((class131_sub41_sub21_sub1_16_
					     .aLong4671)
					    == l)
					    break;
				    }
				}
				if (class131_sub41_sub21_sub1_16_ == null)
				    throw new IOException();
				aClass131_Sub41_Sub21_Sub1_2569
				    = class131_sub41_sub21_sub1_16_;
				int i_17_ = i_15_ == 0 ? 5 : 9;
				aClass131_Sub41_Sub21_Sub1_2569
				    .aStream_6576
				    = (new Stream
				       ((aClass131_Sub41_Sub21_Sub1_2569
					 .aByte6575) + (i_14_ + i_17_)));
				aClass131_Sub41_Sub21_Sub1_2569
				    .aStream_6576
				    .writeByte(i_15_);
				aClass131_Sub41_Sub21_Sub1_2569
				    .aStream_6576
				    .writeInt(i_14_);
				aClass131_Sub41_Sub21_Sub1_2569.anInt6582 = 8;
				aStream_2567.offset = 0;
			    } else if (((aClass131_Sub41_Sub21_Sub1_2569
					 .anInt6582)
					^ 0xffffffff)
				       == -1) {
				if ((aStream_2567.data[0]
				     ^ 0xffffffff)
				    != 0)
				    aClass131_Sub41_Sub21_Sub1_2569 = null;
				else {
				    aClass131_Sub41_Sub21_Sub1_2569.anInt6582
					= 1;
				    aStream_2567.offset = 0;
				}
			    } else
				throw new IOException();
			}
		    }
		}
		return true;
	    } catch (IOException ioexception) {
		try {
		    aClass33_2564.method452(-1);
		} catch (Exception exception) {
		    /* empty */
		}
		anInt2566++;
		aClass33_2564 = null;
		anInt2568 = -2;
		if (method2506(4) != 0 || method2496(false) != 0)
		    return false;
		return true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.C(" + arg0 + ')');
	}
    }
    
    public static void method2499(int arg0, int arg1) {
	try {
	    Class153.anIntArray2028 = new int[arg0];
	    Class131_Sub2_Sub12.anIntArray5723 = new int[arg0];
	    Class53.anIntArray699 = new int[arg0];
	    if (arg1 == 27309) {
		Class121_Sub2_Sub1.anIntArray5425 = new int[arg0];
		anInt2540++;
		Class131_Sub2_Sub25.anIntArray5915 = new int[arg0];
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.J(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2500(boolean arg0) {
	try {
	    try {
		aClass33_2564.method452(-1);
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt2545++;
	    if (arg0 != true)
		method2504(-96, true, (byte) 37, -107, -55);
	    anInt2566++;
	    aClass33_2564 = null;
	    aByte2565 = (byte) (int) (1.0 + 255.0 * Math.random());
	    anInt2568 = -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.O(" + arg0 + ')');
	}
    }
    
    public void method2501(boolean arg0) {
	try {
	    if (arg0 == true) {
		anInt2549++;
		if (aClass33_2564 != null) {
		    try {
			aStream_2562.offset = 0;
			aStream_2562.writeByte(6);
			aStream_2562.method1726((byte) 59, 3);
			aClass33_2564.method454(93, 4, 0, (aStream_2562
							   .data));
		    } catch (IOException ioexception) {
			try {
			    aClass33_2564.method452(-1);
			} catch (Exception exception) {
			    /* empty */
			}
			anInt2566++;
			aClass33_2564 = null;
			anInt2568 = -2;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.P(" + arg0 + ')');
	}
    }
    
    public static boolean method2502(int arg0, int arg1) {
	try {
	    anInt2558++;
	    Class128_Sub1 class128_sub1
		= OutputStream_Sub1.method89(arg0, (byte) 123);
	    if (class128_sub1 == null)
		return false;
	    if ((SignLink.anInt2902 ^ 0xffffffff) != -4) {
		Class191.aString2817 = class128_sub1.aString4017;
		Class110_Sub2.anInt3914 = class128_sub1.anInt4022;
		if ((Class1_Sub7.anInt3581 ^ 0xffffffff) != -1) {
		    Class131_Sub14.anInt4288 = 50000 + Class110_Sub2.anInt3914;
		    Class43.anInt590 = Class110_Sub2.anInt3914 + 40000;
		    Class131_Sub2_Sub31.anInt6007 = Class43.anInt590;
		}
		return true;
	    }
	    String string = "";
	    if (Class1_Sub7.anInt3581 != 0)
		string = ":" + (7000 + class128_sub1.anInt4022);
	    String string_18_ = "";
	    if (Class23_Sub2_Sub2.aString5186 != null)
		string_18_ = "/p=" + Class23_Sub2_Sub2.aString5186;
	    if (arg1 != 50000)
		method2495(120, true, true, 14, false, 74, 11);
	    String string_19_
		= ("http://" + class128_sub1.aString4017 + string + "/l="
		   + Class1_Sub7_Sub1.anInt5208 + "/a="
		   + Class131_Sub2_Sub22.anInt5863 + string_18_ + "/j"
		   + (!Class131_Sub24.aBoolean4472 ? "0" : "1") + ",o"
		   + (Class112.aBoolean1447 ? "1" : "0") + ",a2");
	    try {
		Class131_Sub2_Sub39.aClient6084.getAppletContext()
		    .showDocument(new URL(string_19_), "_self");
	    } catch (Exception exception) {
		return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2503(int arg0) {
	try {
	    if (arg0 >= -18)
		anInt2568 = 13;
	    if (aClass33_2564 != null)
		aClass33_2564.method455(119);
	    anInt2544++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.G(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub21_Sub1 method2504
	(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
	try {
	    anInt2551++;
	    long l = (long) ((arg3 << -1797036688) + arg0);
	    Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
		= new Class131_Sub41_Sub21_Sub1();
	    class131_sub41_sub21_sub1.aLong4671 = l;
	    if (arg4 != 20)
		return null;
	    class131_sub41_sub21_sub1.aBoolean6439 = arg1;
	    class131_sub41_sub21_sub1.aByte6575 = arg2;
	    if (arg1) {
		if ((method2506(arg4 ^ 0x10) ^ 0xffffffff) <= -21)
		    throw new RuntimeException();
		aClass175_2555.method2477(class131_sub41_sub21_sub1, -26);
	    } else {
		if (method2496(false) >= 20)
		    throw new RuntimeException();
		aClass175_2559.method2477(class131_sub41_sub21_sub1, -26);
	    }
	    return class131_sub41_sub21_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public boolean method2505(int arg0) {
	try {
	    anInt2538++;
	    if (arg0 != -27332)
		return false;
	    if ((method2506(4) ^ 0xffffffff) > -21)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.B(" + arg0 + ')');
	}
    }
    
    public int method2506(int arg0) {
	try {
	    if (arg0 != 4)
		return -58;
	    anInt2547++;
	    return (aClass175_2555.method2475(0)
		    - -aClass175_2557.method2475(arg0 ^ 0x4));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.M(" + arg0 + ')');
	}
    }
    
    public boolean method2507(byte arg0) {
	try {
	    anInt2553++;
	    if (arg0 > -76)
		return true;
	    if (method2496(false) < 20)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.D(" + arg0 + ')');
	}
    }
    
    public void method2508(int arg0, Class33 arg1, boolean arg2) {
	try {
	    if (aClass33_2564 != null) {
		try {
		    aClass33_2564.method452(-1);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass33_2564 = null;
	    }
	    anInt2542++;
	    aClass33_2564 = arg1;
	    method2501(true);
	    method2497(arg2, -55);
	    aStream_2567.offset = 0;
	    aClass131_Sub41_Sub21_Sub1_2569 = null;
	    for (;;) {
		Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
		    = ((Class131_Sub41_Sub21_Sub1)
		       aClass175_2557.method2476((byte) 67));
		if (class131_sub41_sub21_sub1 == null)
		    break;
		aClass175_2555.method2477(class131_sub41_sub21_sub1, -26);
	    }
	    for (;;) {
		Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
		    = ((Class131_Sub41_Sub21_Sub1)
		       aClass175_2560.method2476((byte) 67));
		if (class131_sub41_sub21_sub1 == null)
		    break;
		aClass175_2559.method2477(class131_sub41_sub21_sub1, -26);
	    }
	    if ((aByte2565 ^ 0xffffffff) != -1) {
		try {
		    aStream_2562.offset = 0;
		    aStream_2562.writeByte(4);
		    aStream_2562.writeByte(aByte2565);
		    aStream_2562.writeShort(0);
		    aClass33_2564.method454(40, 4, 0, (aStream_2562
						       .data));
		} catch (IOException ioexception) {
		    try {
			aClass33_2564.method452(-1);
		    } catch (Exception exception) {
			/* empty */
		    }
		    anInt2568 = -2;
		    aClass33_2564 = null;
		    anInt2566++;
		}
	    }
	    anInt2561 = arg0;
	    aLong2563 = Class208.method2749(arg0 + -3913);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2509(int arg0, int arg1) {
	try {
	    anInt2550++;
	    synchronized (Class21.aClass214_239) {
		Class21.aClass214_239.method2786(0, arg1);
		if (arg0 != 7000)
		    method2499(53, -127);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("se.Q(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2510(int arg0) {
	try {
	    if (arg0 != 0)
		anInt2543 = -105;
	    anIntArray2541 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.L(" + arg0 + ')');
	}
    }
    
    public void method2511(int arg0) {
	try {
	    anInt2546++;
	    if (arg0 < -12 && aClass33_2564 != null) {
		try {
		    aStream_2562.offset = 0;
		    aStream_2562.writeByte(7);
		    aStream_2562.method1726((byte) 59, 0);
		    aClass33_2564.method454(51, 4, 0, (aStream_2562
						       .data));
		} catch (IOException ioexception) {
		    try {
			aClass33_2564.method452(-1);
		    } catch (Exception exception) {
			/* empty */
		    }
		    aClass33_2564 = null;
		    anInt2568 = -2;
		    anInt2566++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.N(" + arg0 + ')');
	}
    }
    
    public void method2512(byte arg0) {
	try {
	    int i = -123 / ((-28 - arg0) / 57);
	    if (aClass33_2564 != null)
		aClass33_2564.method452(-1);
	    anInt2556++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"se.H(" + arg0 + ')');
	}
    }
    
    public Class179() {
	aStream_2567 = new Stream(8);
    }
}
