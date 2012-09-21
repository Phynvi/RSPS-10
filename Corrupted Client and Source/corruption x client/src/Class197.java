/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class197
{
    public static int anInt2875;
    public static int[] anIntArray2876 = new int[4096];
    public static int anInt2877;
    public static int anInt2878;
    public static int anInt2879 = 50;
    public static boolean[] aBooleanArray2880;
    public static int anInt2881;
    
    public static int method2674(int arg0) {
	try {
	    if (arg0 <= 14)
		anIntArray2876 = null;
	    anInt2877++;
	    try {
		if ((Class66.anInt878 ^ 0xffffffff) == -1) {
		    if ((Class23_Sub5_Sub1.aLong5042 ^ 0xffffffffffffffffL)
			< (Class208.method2749(-3913) - 5000L
			   ^ 0xffffffffffffffffL))
			return 0;
		    Class106.aClass139_1382
			= (Class23_Sub4.aSignLink_3734.method2703
			   (Class131_Sub2_Sub7.aString5636, (byte) 124,
			    Class147.anInt1960));
		    Class172.aLong2295 = Class208.method2749(-3913);
		    Class66.anInt878 = 1;
		}
		if (Class172.aLong2295 - -30000L < Class208.method2749(-3913))
		    return Class22_Sub1.method285(1000, -46);
		if (Class66.anInt878 == 1) {
		    if (Class106.aClass139_1382.anInt1864 == 2)
			return Class22_Sub1.method285(1001, -56);
		    if ((Class106.aClass139_1382.anInt1864 ^ 0xffffffff) != -2)
			return -1;
		    Class128_Sub1.aClass33_4013
			= new Class33(((Socket)
				       Class106.aClass139_1382.anObject1866),
				      Class23_Sub4.aSignLink_3734);
		    Class106.aClass139_1382 = null;
		    int i = 0;
		    if (Class23_Sub1.aBoolean3701)
			i = Class131_Sub17.anInt4371;
		    Class93.aClass131_Sub15_Sub2_1226.offset = 0;
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(23);
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(i);
		    Class128_Sub1.aClass33_4013.method454
			(119, Class93.aClass131_Sub15_Sub2_1226.offset, 0,
			 Class93.aClass131_Sub15_Sub2_1226.data);
		    if (Class131_Sub35.aClass215_4588 != null)
			Class131_Sub35.aClass215_4588.method2800(0);
		    if (client.aClass215_3470 != null)
			client.aClass215_3470.method2800(0);
		    int i_0_ = Class128_Sub1.aClass33_4013.method444(-1707);
		    if (Class131_Sub35.aClass215_4588 != null)
			Class131_Sub35.aClass215_4588.method2800(0);
		    if (client.aClass215_3470 != null)
			client.aClass215_3470.method2800(0);
		    if ((i_0_ ^ 0xffffffff) != -1)
			return Class22_Sub1.method285(i_0_, -122);
		    Class66.anInt878 = 2;
		}
		if ((Class66.anInt878 ^ 0xffffffff) == -3) {
		    if (Class128_Sub1.aClass33_4013.method450((byte) 17) < 2)
			return -1;
		    Class166.anInt2221
			= Class128_Sub1.aClass33_4013.method444(-1707);
		    Class166.anInt2221 <<= 8;
		    Class166.anInt2221
			+= Class128_Sub1.aClass33_4013.method444(-1707);
		    Class66.anInt878 = 3;
		    Class131_Sub6.aByteArray4146
			= new byte[Class166.anInt2221];
		    Class131.anInt1792 = 0;
		}
		if ((Class66.anInt878 ^ 0xffffffff) == -4) {
		    int i = Class128_Sub1.aClass33_4013.method450((byte) 17);
		    if (i < 1)
			return -1;
		    if (-Class131.anInt1792 + Class166.anInt2221 < i)
			i = Class166.anInt2221 - Class131.anInt1792;
		    Class128_Sub1.aClass33_4013.method451(113,
							  Class131.anInt1792,
							  (Class131_Sub6
							   .aByteArray4146),
							  i);
		    Class131.anInt1792 += i;
		    if ((Class131.anInt1792 ^ 0xffffffff)
			> (Class166.anInt2221 ^ 0xffffffff))
			return -1;
		    if (!Class94.method857(Class131_Sub6.aByteArray4146, 0))
			return Class22_Sub1.method285(1002, -72);
		    Class110_Sub4.aClass128_Sub1Array3939
			= new Class128_Sub1[Class131_Sub2_Sub19.anInt5826];
		    int i_1_ = 0;
		    for (int i_2_ = Class127_Sub1.anInt4008;
			 Class212.anInt3110 >= i_2_; i_2_++) {
			Class128_Sub1 class128_sub1
			    = OutputStream_Sub1.method89(i_2_, (byte) 92);
			if (class128_sub1 != null)
			    Class110_Sub4.aClass128_Sub1Array3939[i_1_++]
				= class128_sub1;
		    }
		    Class184.aClass131_Sub30_2626 = null;
		    Class131_Sub29.anInt4511 = 0;
		    Class128_Sub1.aClass33_4013.method452(-1);
		    Class183_Sub1.anInt4964 = 0;
		    Class128_Sub1.aClass33_4013 = null;
		    Class66.anInt878 = 0;
		    Class131_Sub6.aByteArray4146 = null;
		    Class23_Sub5_Sub1.aLong5042 = Class208.method2749(-3913);
		    return 0;
		}
	    } catch (IOException ioexception) {
		return Class22_Sub1.method285(1003, -66);
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ub.D(" + arg0 + ')');
	}
    }
    
    public static void method2675(int arg0) {
	try {
	    if (arg0 > -33)
		method2677(false);
	    aBooleanArray2880 = null;
	    anIntArray2876 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ub.C(" + arg0 + ')');
	}
    }
    
    public abstract void method2676(byte[] is, int i);
    
    public static void method2677(boolean arg0) {
	do {
	    try {
		anInt2878++;
		if ((Class131_Sub41_Sub15.anInt6364 ^ 0xffffffff) != -1) {
		    try {
			if ((++Class131_Sub29.anInt4506 ^ 0xffffffff)
			    < -1501) {
			    if (Class128_Sub1.aClass33_4013 != null) {
				Class128_Sub1.aClass33_4013.method452(-1);
				Class128_Sub1.aClass33_4013 = null;
			    }
			    if (Class156.anInt2072 < 1) {
				Class156.anInt2072++;
				if (Class131_Sub41_Sub20.anInt6436
				    != Class147.anInt1960)
				    Class147.anInt1960
					= Class131_Sub41_Sub20.anInt6436;
				else
				    Class147.anInt1960 = Class91.anInt1183;
				Class131_Sub29.anInt4506 = 0;
				Class131_Sub41_Sub15.anInt6364 = 1;
			    } else {
				Class131_Sub41_Sub15.anInt6364 = 0;
				Class4.anInt3281 = -5;
				break;
			    }
			}
			if ((Class131_Sub41_Sub15.anInt6364 ^ 0xffffffff)
			    == -2) {
			    Class17.aClass139_183
				= (Class23_Sub4.aSignLink_3734.method2703
				   (Class131_Sub2_Sub7.aString5636, (byte) 125,
				    Class147.anInt1960));
			    Class131_Sub41_Sub15.anInt6364 = 2;
			}
			if ((Class131_Sub41_Sub15.anInt6364 ^ 0xffffffff)
			    == -3) {
			    if ((Class17.aClass139_183.anInt1864 ^ 0xffffffff)
				== -3)
				throw new IOException();
			    if (Class17.aClass139_183.anInt1864 != 1)
				break;
			    Class128_Sub1.aClass33_4013
				= new Class33((Socket) (Class17.aClass139_183
							.anObject1866),
					      Class23_Sub4.aSignLink_3734);
			    Class17.aClass139_183 = null;
			    Class128_Sub1.aClass33_4013.method454
				(94,
				 Class93.aClass131_Sub15_Sub2_1226.offset,
				 0,
				 (Class93.aClass131_Sub15_Sub2_1226
				  .data));
			    if (Class131_Sub35.aClass215_4588 != null)
				Class131_Sub35.aClass215_4588.method2800(0);
			    if (client.aClass215_3470 != null)
				client.aClass215_3470.method2800(0);
			    int i
				= Class128_Sub1.aClass33_4013.method444(-1707);
			    if (Class131_Sub35.aClass215_4588 != null)
				Class131_Sub35.aClass215_4588.method2800(0);
			    if (client.aClass215_3470 != null)
				client.aClass215_3470.method2800(0);
			    if (i == 101)
				Class131_Sub41_Sub15.anInt6364 = 3;
			    else {
				Class4.anInt3281 = i;
				Class131_Sub41_Sub15.anInt6364 = 0;
				Class128_Sub1.aClass33_4013.method452(-1);
				Class128_Sub1.aClass33_4013 = null;
				break;
			    }
			}
			if (Class131_Sub41_Sub15.anInt6364 == 3) {
			    if ((Class128_Sub1.aClass33_4013
				     .method450((byte) 17)
				 ^ 0xffffffff)
				<= -3) {
				int i = (Class128_Sub1.aClass33_4013
					     .method444(-1707) << -1569378840
					 | Class128_Sub1.aClass33_4013
					       .method444(-1707));
				Class179.method2502(i, 50000);
				if (Class110_Sub2.anInt3914 == -1) {
				    Class4.anInt3281 = 6;
				    Class131_Sub41_Sub15.anInt6364 = 0;
				    Class128_Sub1.aClass33_4013.method452(-1);
				    Class128_Sub1.aClass33_4013 = null;
				} else {
				    Class131_Sub41_Sub15.anInt6364 = 0;
				    Class128_Sub1.aClass33_4013.method452(-1);
				    Class128_Sub1.aClass33_4013 = null;
				    Class153.method2227((byte) 116);
				}
			    }
			} else {
			    if (arg0 == true)
				break;
			    aBooleanArray2880 = null;
			}
		    } catch (IOException ioexception) {
			if (Class128_Sub1.aClass33_4013 != null) {
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;
			}
			if ((Class156.anInt2072 ^ 0xffffffff) <= -2) {
			    Class131_Sub41_Sub15.anInt6364 = 0;
			    Class4.anInt3281 = -4;
			} else {
			    Class131_Sub29.anInt4506 = 0;
			    if (Class147.anInt1960
				!= Class131_Sub41_Sub20.anInt6436)
				Class147.anInt1960
				    = Class131_Sub41_Sub20.anInt6436;
			    else
				Class147.anInt1960 = Class91.anInt1183;
			    Class131_Sub41_Sub15.anInt6364 = 1;
			    Class156.anInt2072++;
			}
		    }
		    break;
		}
		break;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "ub.E(" + arg0 + ')');
	    }
	} while (false);
    }
    
    public abstract byte[] method2678(byte i);
}
