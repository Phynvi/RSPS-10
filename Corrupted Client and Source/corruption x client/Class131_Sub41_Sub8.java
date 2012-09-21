/* Class131_Sub41_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class131_Sub41_Sub8 extends Class131_Sub41
{
    public static int anInt6258;
    public int[] anIntArray6259;
    public static int anInt6260;
    public static int anInt6261;
    public static int anInt6262;
    public static int anInt6263;
    public static int anInt6264;
    public static int anInt6265;
    public boolean aBoolean6266 = true;
    public int[][] anIntArrayArray6267;
    public static int anInt6268 = 16777215;
    public static int[] anIntArray6269 = new int[32];
    public static int anInt6270;
    public static int anInt6271;
    public String[] aStringArray6272;
    public int[] anIntArray6273;
    public static int anInt6274;
    
    public void method1975(byte arg0, Stream arg1) {
	anInt6263++;
	for (;;) {
	    int i = arg1.readUnsignedByte(arg0 + 32);
	    if (i == 0)
		break;
	    method1981(arg1, i, (byte) -127);
	}
	if (arg0 != 72)
	    method1978((byte) 70, 119, 90);
    }
    
    public static void method1976(boolean arg0) {
	try {
	    if (arg0 == false)
		anIntArray6269 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ie.H(" + arg0 + ')');
	}
    }
    
    public int method1977(boolean arg0) {
	try {
	    if (arg0 != true)
		return -95;
	    anInt6261++;
	    if (anIntArray6273 == null)
		return 0;
	    return anIntArray6273.length;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ie.D(" + arg0 + ')');
	}
    }
    
    public int method1978(byte arg0, int arg1, int arg2) {
	try {
	    if (arg0 != -86)
		return 97;
	    anInt6258++;
	    if (anIntArray6273 == null || (arg2 ^ 0xffffffff) > -1
		|| arg2 > anIntArray6273.length)
		return -1;
	    if (anIntArrayArray6267[arg2] == null || arg1 < 0
		|| anIntArrayArray6267[arg2].length < arg1)
		return -1;
	    return anIntArrayArray6267[arg2][arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ie.J(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method1979(int arg0, int arg1) {
	try {
	    if (arg0 != 0)
		method1980(-90);
	    anInt6260++;
	    if (anIntArray6273 == null || arg1 < 0
		|| anIntArray6273.length < arg1)
		return -1;
	    return anIntArray6273[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ie.I(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1980(int arg0) {
	anInt6265++;
	if ((Class176.anInt2523 ^ 0xffffffff) != -1) {
	    try {
		if ((++Class35.anInt496 ^ 0xffffffff) < -2001) {
		    if (Class128_Sub1.aClass33_4013 != null) {
			Class128_Sub1.aClass33_4013.method452(-1);
			Class128_Sub1.aClass33_4013 = null;
		    }
		    if (Class131_Sub2_Sub21.anInt5854 >= 1) {
			Class131_Sub2_Sub20.anInt5838 = -5;
			Class176.anInt2523 = 0;
			return;
		    }
		    Class176.anInt2523 = 1;
		    Class131_Sub2_Sub21.anInt5854++;
		    if ((Class43.anInt590 ^ 0xffffffff)
			== (Class131_Sub2_Sub31.anInt6007 ^ 0xffffffff))
			Class131_Sub2_Sub31.anInt6007
			    = Class131_Sub14.anInt4288;
		    else
			Class131_Sub2_Sub31.anInt6007 = Class43.anInt590;
		    Class35.anInt496 = 0;
		}
		if ((Class176.anInt2523 ^ 0xffffffff) == -2) {
		    Class17.aClass139_183
			= (Class23_Sub4.aSignLink_3734.method2703
			   (Class191.aString2817, (byte) 120,
			    Class131_Sub2_Sub31.anInt6007));
		    Class176.anInt2523 = 2;
		}
		if ((Class176.anInt2523 ^ 0xffffffff) == -3) {
		    if (Class17.aClass139_183.anInt1864 == 2)
			throw new IOException();
		    if (Class17.aClass139_183.anInt1864 != 1)
			return;
		    Class128_Sub1.aClass33_4013
			= new Class33(((Socket)
				       Class17.aClass139_183.anObject1866),
				      Class23_Sub4.aSignLink_3734);
		    Class17.aClass139_183 = null;
		    Class128_Sub1.aClass33_4013.method454
			(arg0 + 31634,
			 Class93.aClass131_Sub15_Sub2_1226.offset, 0,
			 Class93.aClass131_Sub15_Sub2_1226.data);
		    if (Class131_Sub35.aClass215_4588 != null)
			Class131_Sub35.aClass215_4588.method2800(0);
		    if (client.aClass215_3470 != null)
			client.aClass215_3470.method2800(0);
		    int i = Class128_Sub1.aClass33_4013.method444(-1707);
		    if (Class131_Sub35.aClass215_4588 != null)
			Class131_Sub35.aClass215_4588.method2800(0);
		    if (client.aClass215_3470 != null)
			client.aClass215_3470.method2800(arg0 ^ ~0x7b5c);
		    if ((i ^ 0xffffffff) == -22)
			Class176.anInt2523 = 3;
		    else {
			Class131_Sub2_Sub20.anInt5838 = i;
			Class176.anInt2523 = 0;
			Class128_Sub1.aClass33_4013.method452(-1);
			Class128_Sub1.aClass33_4013 = null;
			return;
		    }
		}
		if (Class176.anInt2523 == 3) {
		    if ((Class128_Sub1.aClass33_4013.method450((byte) 17)
			 ^ 0xffffffff)
			> -2)
			return;
		    Class31.aStringArray440
			= (new String
			   [Class128_Sub1.aClass33_4013.method444(-1707)]);
		    Class176.anInt2523 = 4;
		}
		if (arg0 == -31581) {
		    if ((Class176.anInt2523 ^ 0xffffffff) == -5) {
			if (Class128_Sub1.aClass33_4013.method450((byte) 17)
			    >= 8 * Class31.aStringArray440.length) {
			    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.offset
				= 0;
			    Class128_Sub1.aClass33_4013.method451
				(72, 0,
				 (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .data),
				 8 * Class31.aStringArray440.length);
			    for (int i = 0; Class31.aStringArray440.length > i;
				 i++)
				Class31.aStringArray440[i]
				    = (Class131_Sub41_Sub21_Sub1.method2080
				       (31013, Class23_Sub3_Sub1
						   .aClass131_Sub15_Sub2_5231
						   .readLong(arg0 + 31491)));
			    Class176.anInt2523 = 0;
			    Class131_Sub2_Sub20.anInt5838 = 21;
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;
			}
		    }
		}
	    } catch (IOException ioexception) {
		if (Class128_Sub1.aClass33_4013 != null) {
		    Class128_Sub1.aClass33_4013.method452(-1);
		    Class128_Sub1.aClass33_4013 = null;
		}
		if ((Class131_Sub2_Sub21.anInt5854 ^ 0xffffffff) > -2) {
		    Class176.anInt2523 = 1;
		    Class35.anInt496 = 0;
		    Class131_Sub2_Sub21.anInt5854++;
		    if ((Class131_Sub2_Sub31.anInt6007 ^ 0xffffffff)
			!= (Class43.anInt590 ^ 0xffffffff))
			Class131_Sub2_Sub31.anInt6007 = Class43.anInt590;
		    else
			Class131_Sub2_Sub31.anInt6007
			    = Class131_Sub14.anInt4288;
		} else {
		    Class131_Sub2_Sub20.anInt5838 = -4;
		    Class176.anInt2523 = 0;
		}
	    }
	}
    }
    
    public void method1981(Stream arg0, int arg1, byte arg2) {
	try {
	    if (arg2 != -127)
		method1977(false);
	    anInt6264++;
	    if (arg1 == 1)
		aStringArray6272
		    = Class131_Sub41_Sub21
			  .method2077((byte) 103, arg0.readString(false), '<');
	    else if (arg1 != 2) {
		if (arg1 == 3) {
		    int i = arg0.readUnsignedByte(arg2 ^ 0x55);
		    anIntArrayArray6267 = new int[i][];
		    anIntArray6273 = new int[i];
		    for (int i_0_ = 0; i > i_0_; i_0_++) {
			int i_1_ = arg0.readUnsignedShort(arg2 + 8231);
			anIntArray6273[i_0_] = i_1_;
			anIntArrayArray6267[i_0_]
			    = (new int
			       [Class131_Sub2_Sub39.anIntArray6081[i_1_]]);
			for (int i_2_ = 0;
			     i_2_ < Class131_Sub2_Sub39.anIntArray6081[i_1_];
			     i_2_++)
			    anIntArrayArray6267[i_0_][i_2_]
				= arg0.readUnsignedShort(Class23_Sub4_Sub5
						      .method390(arg2, -8151));
		    }
		} else if ((arg1 ^ 0xffffffff) == -5)
		    aBoolean6266 = false;
	    } else {
		int i = arg0.readUnsignedByte(-122);
		anIntArray6259 = new int[i];
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_3_++)
		    anIntArray6259[i_3_] = arg0.readUnsignedShort(8104);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ie.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public void method1982(boolean arg0) {
	anInt6270++;
	if (arg0 == false) {
	    if (anIntArray6259 != null) {
		for (int i = 0;
		     (anIntArray6259.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    anIntArray6259[i]
			= Cryption.method2105(anIntArray6259[i], 32768);
	    }
	}
    }
    
    public void method1983(int[] arg0, int arg1, Stream arg2) {
	do {
	    try {
		anInt6262++;
		if (anIntArray6273 != null) {
		    for (int i = 0; ((i ^ 0xffffffff) > (anIntArray6273.length
							 ^ 0xffffffff)
				     && arg0.length > i); i++) {
			int i_4_ = Class58.anIntArray766[method1979(0, i)];
			if (i_4_ > 0)
			    arg2.method1725((long) arg0[i], i_4_, -8);
		    }
		    if (arg1 >= 126)
			break;
		    anIntArray6273 = null;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("ie.C("
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
    
    public String method1984(Stream arg0, int arg1) {
	try {
	    anInt6274++;
	    StringBuffer stringbuffer = new StringBuffer(80);
	    if (anIntArray6273 != null) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (anIntArray6273.length ^ 0xffffffff);
		     i++) {
		    stringbuffer.append(aStringArray6272[i]);
		    stringbuffer.append(Class131_Sub41_Sub4.method1936
					(true,
					 arg0.method1717((Class153
							  .anIntArray2045
							  [anIntArray6273[i]]),
							 0),
					 anIntArrayArray6267[i],
					 anIntArray6273[i]));
		}
	    }
	    if (arg1 != -8507)
		return null;
	    stringbuffer
		.append(aStringArray6272[-1 + aStringArray6272.length]);
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ie.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public String method1985(int arg0) {
	try {
	    anInt6271++;
	    StringBuffer stringbuffer = new StringBuffer(80);
	    if (aStringArray6272 == null)
		return "";
	    stringbuffer.append(aStringArray6272[0]);
	    for (int i = arg0; aStringArray6272.length > i; i++) {
		stringbuffer.append("...");
		stringbuffer.append(aStringArray6272[i]);
	    }
	    return stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ie.G(" + arg0 + ')');
	}
    }
}
