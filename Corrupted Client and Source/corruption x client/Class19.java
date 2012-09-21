/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19
{
    public int anInt196;
    public static int anInt197;
    public static int anInt198;
    public static int anInt199;
    public static int anInt200;
    public static int anInt201;
    public static int anInt202;
    public static int anInt203;
    public static int anInt204;
    public static Class131_Sub37 aClass131_Sub37_205;
    public int anInt206;
    public static int anInt207;
    public static int anInt208;
    public static String aString209;
    public static byte[] aByteArray210 = new byte[520];
    public static int anInt211;
    public static int anInt212;
    public static int anInt213;
    public int anInt214;
    public static int anInt215;
    public static int anInt216;
    public static int anInt217;
    public int anInt218;
    public static int anInt219;
    public static int anInt220;
    public static int anInt221;
    public int[][] clipping;
    public static Class130 aClass130_223;
    public static int[] anIntArray224;
    public static String aString225;
    
    public void method234(int arg0, boolean arg1, int arg2, int arg3, int arg4,
			  byte arg5, boolean arg6) {
	try {
	    anInt219++;
	    int i = 256;
	    if (arg1)
		i |= 0x20000;
	    arg3 -= anInt206;
	    if (arg6)
		i |= 0x40000000;
	    arg4 -= anInt218;
	    int i_0_ = -14 % ((arg5 - -50) / 39);
	    for (int i_1_ = arg3; i_1_ < arg0 + arg3; i_1_++) {
		if ((i_1_ ^ 0xffffffff) <= -1 && anInt214 > i_1_) {
		    for (int i_2_ = arg4;
			 (arg4 - -arg2 ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
			 i_2_++) {
			if (i_2_ >= 0 && i_2_ < anInt196)
			    method252((byte) -91, i_2_, i_1_, i);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.J(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public void method235(boolean arg0, boolean arg1, byte arg2, int arg3,
			  int arg4, int arg5, int arg6) {
	arg6 -= anInt218;
	anInt202++;
	arg3 -= anInt206;
	if ((arg5 ^ 0xffffffff) == -1) {
	    if (arg4 == 0) {
		method252((byte) -124, arg6, arg3, 128);
		method252((byte) 49, arg6, -1 + arg3, 8);
	    }
	    if ((arg4 ^ 0xffffffff) == -2) {
		method252((byte) 59, arg6, arg3, 2);
		method252((byte) 101, arg6 + 1, arg3, 32);
	    }
	    if (arg4 == 2) {
		method252((byte) -91, arg6, arg3, 8);
		method252((byte) -96, arg6, 1 + arg3, 128);
	    }
	    if ((arg4 ^ 0xffffffff) == -4) {
		method252((byte) -117, arg6, arg3, 32);
		method252((byte) 119, arg6 + -1, arg3, 2);
	    }
	}
	if (arg5 == 1 || arg5 == 3) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method252((byte) -93, arg6, arg3, 1);
		method252((byte) -120, arg6 - -1, arg3 - 1, 16);
	    }
	    if (arg4 == 1) {
		method252((byte) 85, arg6, arg3, 4);
		method252((byte) 122, arg6 - -1, 1 + arg3, 64);
	    }
	    if ((arg4 ^ 0xffffffff) == -3) {
		method252((byte) 29, arg6, arg3, 16);
		method252((byte) -117, arg6 + -1, arg3 - -1, 1);
	    }
	    if (arg4 == 3) {
		method252((byte) -127, arg6, arg3, 64);
		method252((byte) 29, arg6 + -1, arg3 + -1, 4);
	    }
	}
	if (arg5 == 2) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method252((byte) -115, arg6, arg3, 130);
		method252((byte) -93, arg6, arg3 - 1, 8);
		method252((byte) -108, arg6 + 1, arg3, 32);
	    }
	    if (arg4 == 1) {
		method252((byte) -98, arg6, arg3, 10);
		method252((byte) -113, arg6 - -1, arg3, 32);
		method252((byte) -121, arg6, arg3 - -1, 128);
	    }
	    if ((arg4 ^ 0xffffffff) == -3) {
		method252((byte) -95, arg6, arg3, 40);
		method252((byte) -127, arg6, arg3 + 1, 128);
		method252((byte) 117, arg6 - 1, arg3, 2);
	    }
	    if (arg4 == 3) {
		method252((byte) -107, arg6, arg3, 160);
		method252((byte) -117, -1 + arg6, arg3, 2);
		method252((byte) -91, arg6, -1 + arg3, 8);
	    }
	}
	if (arg1) {
	    if ((arg5 ^ 0xffffffff) == -1) {
		if (arg4 == 0) {
		    method252((byte) -122, arg6, arg3, 65536);
		    method252((byte) 73, arg6, arg3 + -1, 4096);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) -124, arg6, arg3, 1024);
		    method252((byte) 57, 1 + arg6, arg3, 16384);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method252((byte) 18, arg6, arg3, 4096);
		    method252((byte) -92, arg6, arg3 + 1, 65536);
		}
		if (arg4 == 3) {
		    method252((byte) -125, arg6, arg3, 16384);
		    method252((byte) -105, -1 + arg6, arg3, 1024);
		}
	    }
	    if ((arg5 ^ 0xffffffff) == -2 || arg5 == 3) {
		if ((arg4 ^ 0xffffffff) == -1) {
		    method252((byte) 38, arg6, arg3, 512);
		    method252((byte) 83, 1 + arg6, -1 + arg3, 8192);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) 93, arg6, arg3, 2048);
		    method252((byte) 34, 1 + arg6, 1 + arg3, 32768);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method252((byte) 53, arg6, arg3, 8192);
		    method252((byte) -105, -1 + arg6, arg3 + 1, 512);
		}
		if ((arg4 ^ 0xffffffff) == -4) {
		    method252((byte) -99, arg6, arg3, 32768);
		    method252((byte) -128, arg6 - 1, arg3 - 1, 2048);
		}
	    }
	    if ((arg5 ^ 0xffffffff) == -3) {
		if (arg4 == 0) {
		    method252((byte) 115, arg6, arg3, 66560);
		    method252((byte) 38, arg6, arg3 + -1, 4096);
		    method252((byte) 72, arg6 + 1, arg3, 16384);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) -113, arg6, arg3, 5120);
		    method252((byte) 87, arg6 + 1, arg3, 16384);
		    method252((byte) 126, arg6, 1 + arg3, 65536);
		}
		if (arg4 == 2) {
		    method252((byte) 106, arg6, arg3, 20480);
		    method252((byte) -105, arg6, arg3 + 1, 65536);
		    method252((byte) 119, arg6 - 1, arg3, 1024);
		}
		if (arg4 == 3) {
		    method252((byte) -114, arg6, arg3, 81920);
		    method252((byte) -97, -1 + arg6, arg3, 1024);
		    method252((byte) -110, arg6, arg3 + -1, 4096);
		}
	    }
	}
	if (arg2 < 123)
	    clipping = null;
	if (arg0) {
	    if ((arg5 ^ 0xffffffff) == -1) {
		if ((arg4 ^ 0xffffffff) == -1) {
		    method252((byte) 49, arg6, arg3, 536870912);
		    method252((byte) 26, arg6, -1 + arg3, 33554432);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) 64, arg6, arg3, 8388608);
		    method252((byte) 69, arg6 + 1, arg3, 134217728);
		}
		if (arg4 == 2) {
		    method252((byte) 73, arg6, arg3, 33554432);
		    method252((byte) 29, arg6, arg3 + 1, 536870912);
		}
		if (arg4 == 3) {
		    method252((byte) -123, arg6, arg3, 134217728);
		    method252((byte) -121, arg6 + -1, arg3, 8388608);
		}
	    }
	    if (arg5 == 1 || arg5 == 3) {
		if ((arg4 ^ 0xffffffff) == -1) {
		    method252((byte) 97, arg6, arg3, 4194304);
		    method252((byte) -93, 1 + arg6, arg3 + -1, 67108864);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) -102, arg6, arg3, 16777216);
		    method252((byte) 97, arg6 - -1, 1 + arg3, 268435456);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method252((byte) -112, arg6, arg3, 67108864);
		    method252((byte) 83, -1 + arg6, arg3 - -1, 4194304);
		}
		if ((arg4 ^ 0xffffffff) == -4) {
		    method252((byte) 88, arg6, arg3, 268435456);
		    method252((byte) -102, arg6 - 1, arg3 - 1, 16777216);
		}
	    }
	    if ((arg5 ^ 0xffffffff) == -3) {
		if (arg4 == 0) {
		    method252((byte) 101, arg6, arg3, 545259520);
		    method252((byte) -127, arg6, -1 + arg3, 33554432);
		    method252((byte) 91, 1 + arg6, arg3, 134217728);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method252((byte) -96, arg6, arg3, 41943040);
		    method252((byte) 114, arg6 + 1, arg3, 134217728);
		    method252((byte) -94, arg6, 1 + arg3, 536870912);
		}
		if (arg4 == 2) {
		    method252((byte) 88, arg6, arg3, 167772160);
		    method252((byte) -96, arg6, arg3 - -1, 536870912);
		    method252((byte) 71, -1 + arg6, arg3, 8388608);
		}
		if (arg4 == 3) {
		    method252((byte) 104, arg6, arg3, 671088640);
		    method252((byte) -101, arg6 - 1, arg3, 8388608);
		    method252((byte) -105, arg6, -1 + arg3, 33554432);
		}
	    }
	}
    }
    
    public void method236(int arg0, boolean arg1, int arg2, int arg3) {
	try {
	    anInt197++;
	    if (arg1 != true)
		method245(-85, 20, -98, -34, (byte) 76, -105, -41);
	    clipping[arg3][arg2]
		= Class90.method841(clipping[arg3][arg2],
				    arg0 ^ 0xffffffff);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.Q(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method237(int arg0, int arg1, int arg2, int arg3, int arg4,
			  boolean arg5, boolean arg6) {
	anInt211++;
	arg2 -= anInt218;
	arg3 -= anInt206;
	if (arg4 > 14) {
	    if (arg1 == 0) {
		if (arg0 == 0) {
		    method236(128, true, arg2, arg3);
		    method236(8, true, arg2, -1 + arg3);
		}
		if ((arg0 ^ 0xffffffff) == -2) {
		    method236(2, true, arg2, arg3);
		    method236(32, true, arg2 + 1, arg3);
		}
		if ((arg0 ^ 0xffffffff) == -3) {
		    method236(8, true, arg2, arg3);
		    method236(128, true, arg2, 1 + arg3);
		}
		if ((arg0 ^ 0xffffffff) == -4) {
		    method236(32, true, arg2, arg3);
		    method236(2, true, -1 + arg2, arg3);
		}
	    }
	    if ((arg1 ^ 0xffffffff) == -2 || (arg1 ^ 0xffffffff) == -4) {
		if ((arg0 ^ 0xffffffff) == -1) {
		    method236(1, true, arg2, arg3);
		    method236(16, true, 1 + arg2, arg3 - 1);
		}
		if ((arg0 ^ 0xffffffff) == -2) {
		    method236(4, true, arg2, arg3);
		    method236(64, true, 1 + arg2, 1 + arg3);
		}
		if ((arg0 ^ 0xffffffff) == -3) {
		    method236(16, true, arg2, arg3);
		    method236(1, true, arg2 + -1, arg3 - -1);
		}
		if (arg0 == 3) {
		    method236(64, true, arg2, arg3);
		    method236(4, true, -1 + arg2, -1 + arg3);
		}
	    }
	    if (arg1 == 2) {
		if ((arg0 ^ 0xffffffff) == -1) {
		    method236(130, true, arg2, arg3);
		    method236(8, true, arg2, -1 + arg3);
		    method236(32, true, 1 + arg2, arg3);
		}
		if (arg0 == 1) {
		    method236(10, true, arg2, arg3);
		    method236(32, true, 1 + arg2, arg3);
		    method236(128, true, arg2, arg3 + 1);
		}
		if ((arg0 ^ 0xffffffff) == -3) {
		    method236(40, true, arg2, arg3);
		    method236(128, true, arg2, arg3 + 1);
		    method236(2, true, -1 + arg2, arg3);
		}
		if (arg0 == 3) {
		    method236(160, true, arg2, arg3);
		    method236(2, true, arg2 + -1, arg3);
		    method236(8, true, arg2, -1 + arg3);
		}
	    }
	    if (arg6) {
		if (arg1 == 0) {
		    if ((arg0 ^ 0xffffffff) == -1) {
			method236(65536, true, arg2, arg3);
			method236(4096, true, arg2, arg3 + -1);
		    }
		    if (arg0 == 1) {
			method236(1024, true, arg2, arg3);
			method236(16384, true, 1 + arg2, arg3);
		    }
		    if (arg0 == 2) {
			method236(4096, true, arg2, arg3);
			method236(65536, true, arg2, arg3 + 1);
		    }
		    if ((arg0 ^ 0xffffffff) == -4) {
			method236(16384, true, arg2, arg3);
			method236(1024, true, -1 + arg2, arg3);
		    }
		}
		if ((arg1 ^ 0xffffffff) == -2 || arg1 == 3) {
		    if ((arg0 ^ 0xffffffff) == -1) {
			method236(512, true, arg2, arg3);
			method236(8192, true, arg2 - -1, arg3 - 1);
		    }
		    if ((arg0 ^ 0xffffffff) == -2) {
			method236(2048, true, arg2, arg3);
			method236(32768, true, arg2 + 1, arg3 - -1);
		    }
		    if ((arg0 ^ 0xffffffff) == -3) {
			method236(8192, true, arg2, arg3);
			method236(512, true, arg2 + -1, arg3 - -1);
		    }
		    if (arg0 == 3) {
			method236(32768, true, arg2, arg3);
			method236(2048, true, arg2 - 1, -1 + arg3);
		    }
		}
		if ((arg1 ^ 0xffffffff) == -3) {
		    if ((arg0 ^ 0xffffffff) == -1) {
			method236(66560, true, arg2, arg3);
			method236(4096, true, arg2, -1 + arg3);
			method236(16384, true, 1 + arg2, arg3);
		    }
		    if (arg0 == 1) {
			method236(5120, true, arg2, arg3);
			method236(16384, true, 1 + arg2, arg3);
			method236(65536, true, arg2, 1 + arg3);
		    }
		    if ((arg0 ^ 0xffffffff) == -3) {
			method236(20480, true, arg2, arg3);
			method236(65536, true, arg2, 1 + arg3);
			method236(1024, true, -1 + arg2, arg3);
		    }
		    if ((arg0 ^ 0xffffffff) == -4) {
			method236(81920, true, arg2, arg3);
			method236(1024, true, -1 + arg2, arg3);
			method236(4096, true, arg2, arg3 - 1);
		    }
		}
	    }
	    if (arg5) {
		if (arg1 == 0) {
		    if (arg0 == 0) {
			method236(536870912, true, arg2, arg3);
			method236(33554432, true, arg2, arg3 + -1);
		    }
		    if (arg0 == 1) {
			method236(8388608, true, arg2, arg3);
			method236(134217728, true, 1 + arg2, arg3);
		    }
		    if (arg0 == 2) {
			method236(33554432, true, arg2, arg3);
			method236(536870912, true, arg2, 1 + arg3);
		    }
		    if ((arg0 ^ 0xffffffff) == -4) {
			method236(134217728, true, arg2, arg3);
			method236(8388608, true, arg2 + -1, arg3);
		    }
		}
		if (arg1 == 1 || arg1 == 3) {
		    if (arg0 == 0) {
			method236(4194304, true, arg2, arg3);
			method236(67108864, true, 1 + arg2, -1 + arg3);
		    }
		    if (arg0 == 1) {
			method236(16777216, true, arg2, arg3);
			method236(268435456, true, arg2 - -1, arg3 + 1);
		    }
		    if ((arg0 ^ 0xffffffff) == -3) {
			method236(67108864, true, arg2, arg3);
			method236(4194304, true, arg2 + -1, 1 + arg3);
		    }
		    if (arg0 == 3) {
			method236(268435456, true, arg2, arg3);
			method236(16777216, true, -1 + arg2, arg3 - 1);
		    }
		}
		if (arg1 == 2) {
		    if (arg0 == 0) {
			method236(545259520, true, arg2, arg3);
			method236(33554432, true, arg2, arg3 - 1);
			method236(134217728, true, arg2 - -1, arg3);
		    }
		    if (arg0 == 1) {
			method236(41943040, true, arg2, arg3);
			method236(134217728, true, 1 + arg2, arg3);
			method236(536870912, true, arg2, 1 + arg3);
		    }
		    if (arg0 == 2) {
			method236(167772160, true, arg2, arg3);
			method236(536870912, true, arg2, 1 + arg3);
			method236(8388608, true, -1 + arg2, arg3);
		    }
		    if (arg0 == 3) {
			method236(671088640, true, arg2, arg3);
			method236(8388608, true, arg2 + -1, arg3);
			method236(33554432, true, arg2, arg3 - 1);
		    }
		}
	    }
	}
    }
    
    public boolean method238(int arg0, int arg1, int arg2, boolean arg3,
			     int arg4, int arg5, int arg6, int arg7,
			     int arg8) { //routefind?
	try {
	    anInt213++;
	    if (arg6 > 1) {
		if (Class138.method2120(arg5, arg8, arg0, -11093, arg1, arg6,
					arg6, arg7, arg2))
		    return true;
		return method242(arg8, arg6, -120, arg4, arg5, arg0, arg7,
				 arg2, arg1, arg6);
	    }
	    int i = -1 + arg1 + arg8;
	    int i_3_ = arg7 + (arg2 + -1);
	    if ((arg0 ^ 0xffffffff) <= (arg8 ^ 0xffffffff)
		&& (i ^ 0xffffffff) <= (arg0 ^ 0xffffffff)
		&& (arg5 ^ 0xffffffff) <= (arg2 ^ 0xffffffff) && i_3_ >= arg5)
		return true;
	    if (arg8 - 1 == arg0 && (arg5 ^ 0xffffffff) <= (arg2 ^ 0xffffffff)
		&& i_3_ >= arg5
		&& ((0x8
		     & clipping[arg0 + -anInt206][arg5 + -anInt218])
		    ^ 0xffffffff) == -1
		&& (0x8 & arg4 ^ 0xffffffff) == -1)
		return true;
	    if ((1 + i ^ 0xffffffff) == (arg0 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) >= (arg5 ^ 0xffffffff) && arg5 <= i_3_
		&& ((0x80
		     & clipping[-anInt206 + arg0][arg5 - anInt218])
		    == 0)
		&& (arg4 & 0x2) == 0)
		return true;
	    if (arg3 != false)
		method251(null, 11, 101, (byte) 51, 114);
	    if ((arg5 ^ 0xffffffff) == (-1 + arg2 ^ 0xffffffff) && arg8 <= arg0
		&& arg0 <= i
		&& (clipping[arg0 + -anInt206][-anInt218 + arg5]
		    & 0x2) == 0
		&& (0x4 & arg4 ^ 0xffffffff) == -1)
		return true;
	    if ((i_3_ + 1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		&& (arg8 ^ 0xffffffff) >= (arg0 ^ 0xffffffff) && i >= arg0
		&& ((clipping[-anInt206 + arg0][-anInt218 + arg5]
		     & 0x20)
		    ^ 0xffffffff) == -1
		&& (0x1 & arg4 ^ 0xffffffff) == -1)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ')'));
	}
    }
    
    public static void method239(byte arg0, int arg1) {
	try {
	    anInt204++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(6, arg1, (byte) 1);
	    if (arg0 <= -122)
		class131_sub41_sub6.method1959(-103);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.L(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method240(Class158 arg0, int arg1) {
	try {
	    anInt215++;
	    Class110_Sub4.aClass158_3944 = arg0;
	    if (arg1 != -18066)
		method246(31);
	    Class131_Sub41_Sub2.anInt6188
		= Class110_Sub4.aClass158_3944.method2368(19, (byte) -72);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.R("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method241(int arg0, int arg1, int arg2) {
	try {
	    anInt220++;
	    arg2 -= anInt206;
	    arg1 -= anInt218;
	    int i = -49 / ((33 - arg0) / 59);
	    clipping[arg2][arg1]
		= Class90.method841(clipping[arg2][arg1], -262145);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method242(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7, int arg8,
			     int arg9) {
	try {
	    if (arg2 >= -65)
		anInt214 = -58;
	    anInt217++;
	    int i = arg9 + arg5;
	    int i_4_ = arg4 - -arg1;
	    int i_5_ = arg8 + arg0;
	    int i_6_ = arg6 + arg7;
	    if (arg5 == i_5_ && (arg3 & 0x2 ^ 0xffffffff) == -1) {
		int i_7_
		    = (arg4 ^ 0xffffffff) >= (arg7 ^ 0xffffffff) ? arg7 : arg4;
		for (int i_8_ = i_4_ < i_6_ ? i_4_ : i_6_;
		     (i_8_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
		    if ((0x8 & (clipping[-1 + i_5_ - anInt206]
				[-anInt218 + i_7_]))
			== 0)
			return true;
		}
	    } else if (i != arg0 || (arg3 & 0x8 ^ 0xffffffff) != -1) {
		if ((i_6_ ^ 0xffffffff) != (arg4 ^ 0xffffffff)
		    || (0x1 & arg3 ^ 0xffffffff) != -1) {
		    if (arg7 == i_4_ && (0x4 & arg3) == 0) {
			int i_9_ = arg0 < arg5 ? arg5 : arg0;
			for (int i_10_ = ((i ^ 0xffffffff) <= (i_5_
							       ^ 0xffffffff)
					  ? i_5_ : i);
			     (i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
			     i_9_++) {
			    if (((clipping[i_9_ - anInt206]
				  [arg7 + -anInt218])
				 & 0x20)
				== 0)
				return true;
			}
		    }
		} else {
		    int i_11_ = arg5 <= arg0 ? arg0 : arg5;
		    for (int i_12_ = i_5_ > i ? i : i_5_;
			 (i_11_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff);
			 i_11_++) {
			if ((0x2 & (clipping[-anInt206 + i_11_]
				    [-anInt218 + -1 + i_6_])
			     ^ 0xffffffff)
			    == -1)
			    return true;
		    }
		}
	    } else {
		int i_13_
		    = (arg4 ^ 0xffffffff) < (arg7 ^ 0xffffffff) ? arg4 : arg7;
		for (int i_14_ = i_6_ <= i_4_ ? i_6_ : i_4_;
		     (i_14_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
		    if ((0x80 & (clipping[-anInt206 + arg0]
				 [-anInt218 + i_13_])
			 ^ 0xffffffff)
			== -1)
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ')'));
	}
    }
    
    public void method243(int arg0, boolean arg1, boolean arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7) {
	anInt199++;
	int i = 256;
	if (arg1)
	    i |= 0x20000;
	if (arg2)
	    i |= 0x40000000;
	arg3 -= anInt206;
	if (arg7 == 1 || arg7 == 3) {
	    int i_15_ = arg5;
	    arg5 = arg0;
	    arg0 = i_15_;
	}
	arg6 -= anInt218;
	for (int i_16_ = arg3; arg5 + arg3 > i_16_; i_16_++) {
	    if ((i_16_ ^ 0xffffffff) <= -1
		&& (anInt214 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
		for (int i_17_ = arg6;
		     (arg6 + arg0 ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
		     i_17_++) {
		    if ((i_17_ ^ 0xffffffff) <= -1
			&& (i_17_ ^ 0xffffffff) > (anInt196 ^ 0xffffffff))
			method236(i, true, i_17_, i_16_);
		}
	    }
	}
	if (arg4 != -14463)
	    anInt196 = -27;
    }
    
    public void method244(int arg0, int arg1, int arg2) {
	try {
	    arg2 -= anInt206;
	    anInt208++;
	    if (arg1 >= -25)
		method241(44, -106, 106);
	    arg0 -= anInt218;
	    clipping[arg2][arg0]
		= Cryption.method2105(clipping[arg2][arg0], 2097152);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method245(int arg0, int arg1, int arg2, int arg3,
				 byte arg4, int arg5, int arg6) {
	try {
	    if ((Class149.anInt1988 ^ 0xffffffff) < (arg1 - arg5 ^ 0xffffffff)
		|| Class115.anInt1477 < arg1 + arg5
		|| (-arg5 + arg3 ^ 0xffffffff) > (Class116.anInt1494
						  ^ 0xffffffff)
		|| (arg5 + arg3 ^ 0xffffffff) < (Class125.anInt1629
						 ^ 0xffffffff))
		Class131_Sub27.method1841(-117, arg3, arg5, arg2, arg1, arg6,
					  arg0);
	    else
		Class121_Sub2.method1051(arg5, arg0, arg3, arg1, 877265224,
					 arg6, arg2);
	    if (arg4 >= -2)
		aClass130_223 = null;
	    anInt203++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.D(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public static void method246(int arg0) {
	try {
	    aClass131_Sub37_205 = null;
	    aByteArray210 = null;
	    aString225 = null;
	    int i = 46 / ((arg0 - 62) / 41);
	    anIntArray224 = null;
	    aString209 = null;
	    aClass130_223 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bi.T(" + arg0 + ')');
	}
    }
    
    public void method247(boolean arg0, int arg1, int arg2) {
	try {
	    arg1 -= anInt206;
	    anInt198++;
	    if (arg0 == true) {
		arg2 -= anInt218;
		clipping[arg1][arg2]
		    = Class90.method841(clipping[arg1][arg2],
					-2097153);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.M(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public boolean method248(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7) {
	try {
	    anInt212++;
	    if ((arg2 ^ 0xffffffff) != -2) {
		if ((arg6 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
		    && (arg6 ^ 0xffffffff) >= (arg7 - (-arg2 - -1)
					       ^ 0xffffffff)
		    && (arg4 ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
		    && (arg4 ^ 0xffffffff) >= (-1 + arg2 + arg4 ^ 0xffffffff))
		    return true;
	    } else if (arg7 == arg6 && arg0 == arg4)
		return true;
	    arg6 -= anInt206;
	    arg4 -= anInt218;
	    arg7 -= anInt206;
	    arg0 -= anInt218;
	    if (arg2 == 1) {
		if ((arg3 ^ 0xffffffff) == -7 || (arg3 ^ 0xffffffff) == -8) {
		    if (arg3 == 7)
			arg1 = 0x3 & arg1 - -2;
		    if (arg1 != 0) {
			if (arg1 == 1) {
			    if (arg7 == -1 + arg6 && arg0 == arg4
				&& (clipping[arg7][arg0] & 0x8) == 0)
				return true;
			    if (arg7 == arg6 && -1 + arg4 == arg0
				&& (0x2 & clipping[arg7][arg0]
				    ^ 0xffffffff) == -1)
				return true;
			} else if ((arg1 ^ 0xffffffff) == -3) {
			    if (-1 + arg6 == arg7 && arg4 == arg0
				&& (0x8 & clipping[arg7][arg0]
				    ^ 0xffffffff) == -1)
				return true;
			    if ((arg7 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
				&& 1 + arg4 == arg0
				&& ((0x20 & clipping[arg7][arg0])
				    == 0))
				return true;
			} else if ((arg1 ^ 0xffffffff) == -4) {
			    if ((arg6 - -1 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
				&& arg4 == arg0
				&& ((0x80 & clipping[arg7][arg0])
				    == 0))
				return true;
			    if ((arg7 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
				&& arg4 - -1 == arg0
				&& (clipping[arg7][arg0] & 0x20
				    ^ 0xffffffff) == -1)
				return true;
			}
		    } else {
			if ((arg7 ^ 0xffffffff) == (arg6 - -1 ^ 0xffffffff)
			    && arg4 == arg0
			    && (0x80 & clipping[arg7][arg0]) == 0)
			    return true;
			if ((arg7 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && arg4 + -1 == arg0
			    && (0x2 & clipping[arg7][arg0]) == 0)
			    return true;
		    }
		}
		if ((arg3 ^ 0xffffffff) == -9) {
		    if (arg6 == arg7
			&& (arg0 ^ 0xffffffff) == (1 + arg4 ^ 0xffffffff)
			&& (clipping[arg7][arg0] & 0x20) == 0)
			return true;
		    if (arg7 == arg6 && arg0 == -1 + arg4
			&& (0x2 & clipping[arg7][arg0]) == 0)
			return true;
		    if ((arg7 ^ 0xffffffff) == (-1 + arg6 ^ 0xffffffff)
			&& arg4 == arg0
			&& ((clipping[arg7][arg0] & 0x8 ^ 0xffffffff)
			    == -1))
			return true;
		    if (1 + arg6 == arg7
			&& (arg4 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
			&& (0x80 & clipping[arg7][arg0]) == 0)
			return true;
		}
	    } else {
		int i = arg7 - -arg2 - 1;
		int i_18_ = -1 + (arg0 + arg2);
		if ((arg3 ^ 0xffffffff) == -7 || (arg3 ^ 0xffffffff) == -8) {
		    if ((arg3 ^ 0xffffffff) == -8)
			arg1 = 0x3 & arg1 + 2;
		    if (arg1 != 0) {
			if (arg1 == 1) {
			    if ((-arg2 + arg6 ^ 0xffffffff) == (arg7
								^ 0xffffffff)
				&& arg0 <= arg4 && i_18_ >= arg4
				&& (clipping[i][arg4] & 0x8) == 0)
				return true;
			    if (arg6 >= arg7
				&& (i ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
				&& ((-arg2 + arg4 ^ 0xffffffff)
				    == (arg0 ^ 0xffffffff))
				&& ((clipping[arg6][i_18_] & 0x2)
				    == 0))
				return true;
			} else if ((arg1 ^ 0xffffffff) != -3) {
			    if ((arg1 ^ 0xffffffff) == -4) {
				if (arg7 == 1 + arg6
				    && (arg4 ^ 0xffffffff) <= (arg0
							       ^ 0xffffffff)
				    && (arg4 ^ 0xffffffff) >= (i_18_
							       ^ 0xffffffff)
				    && ((0x80 & clipping[arg7][arg4])
					== 0))
				    return true;
				if ((arg6 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
				    && (arg6 ^ 0xffffffff) >= (i ^ 0xffffffff)
				    && arg0 == arg4 + 1
				    && ((0x20 & clipping[arg6][arg0])
					== 0))
				    return true;
			    }
			} else {
			    if (arg6 - arg2 == arg7
				&& (arg0 ^ 0xffffffff) >= (arg4 ^ 0xffffffff)
				&& (arg4 ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)
				&& (0x8 & clipping[i][arg4]) == 0)
				return true;
			    if ((arg6 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
				&& i >= arg6 && 1 + arg4 == arg0
				&& (clipping[arg6][arg0] & 0x20
				    ^ 0xffffffff) == -1)
				return true;
			}
		    } else {
			if (arg7 == 1 + arg6
			    && (arg0 ^ 0xffffffff) >= (arg4 ^ 0xffffffff)
			    && arg4 <= i_18_
			    && (0x80 & clipping[arg7][arg4]) == 0)
			    return true;
			if (arg7 <= arg6 && i >= arg6 && arg0 == arg4 - arg2
			    && (clipping[arg6][i_18_] & 0x2
				^ 0xffffffff) == -1)
			    return true;
		    }
		}
		if (arg3 == 8) {
		    if ((arg6 ^ 0xffffffff) <= (arg7 ^ 0xffffffff) && arg6 <= i
			&& arg0 == 1 + arg4
			&& (0x20 & clipping[arg6][arg0]) == 0)
			return true;
		    if ((arg7 ^ 0xffffffff) >= (arg6 ^ 0xffffffff) && arg6 <= i
			&& arg0 == arg4 + -arg2
			&& (clipping[arg6][i_18_] & 0x2) == 0)
			return true;
		    if ((arg7 ^ 0xffffffff) == (-arg2 + arg6 ^ 0xffffffff)
			&& arg4 >= arg0
			&& (i_18_ ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
			&& (clipping[i][arg4] & 0x8) == 0)
			return true;
		    if (1 + arg6 == arg7 && arg0 <= arg4
			&& (i_18_ ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
			&& (clipping[arg7][arg4] & 0x80
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg5 <= 20)
		method240(null, 7);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public void method249(int arg0, int arg1, int arg2) {
	anInt201++;
	arg1 -= anInt218;
	arg0 -= anInt206;
	clipping[arg0][arg1]
	    = Cryption.method2105(clipping[arg0][arg1], 262144);
	if (arg2 != -32323)
	    anInt214 = -30;
    }
    
    public boolean method250(int arg0, int arg1, int arg2, int arg3, int arg4,
			     byte arg5, int arg6, int arg7) {
	try {
	    anInt221++;
	    if ((arg1 ^ 0xffffffff) == -2) {
		if (arg6 == arg3 && arg0 == arg7)
		    return true;
	    } else if ((arg6 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
		       && arg3 <= -1 + (arg1 + arg6)
		       && (arg0 ^ 0xffffffff) <= (arg0 ^ 0xffffffff)
		       && arg0 + (arg1 - 1) >= arg0)
		return true;
	    arg3 -= anInt206;
	    arg0 -= anInt218;
	    arg6 -= anInt206;
	    arg7 -= anInt218;
	    if ((arg1 ^ 0xffffffff) == -2) {
		if (arg4 == 0) {
		    if ((arg2 ^ 0xffffffff) == -1) {
			if (arg3 - 1 == arg6 && arg0 == arg7)
			    return true;
			if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && 1 + arg0 == arg7
			    && (0x2c0120 & clipping[arg6][arg7]
				^ 0xffffffff) == -1)
			    return true;
			if ((arg3 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && (arg7 ^ 0xffffffff) == (arg0 - 1 ^ 0xffffffff)
			    && (0x2c0102 & clipping[arg6][arg7]
				^ 0xffffffff) == -1)
			    return true;
		    } else if ((arg2 ^ 0xffffffff) != -2) {
			if ((arg2 ^ 0xffffffff) != -3) {
			    if ((arg2 ^ 0xffffffff) == -4) {
				if (arg6 == arg3 && ((-1 + arg0 ^ 0xffffffff)
						     == (arg7 ^ 0xffffffff)))
				    return true;
				if ((arg3 + -1 ^ 0xffffffff) == (arg6
								 ^ 0xffffffff)
				    && (arg0 ^ 0xffffffff) == (arg7
							       ^ 0xffffffff)
				    && (0x2c0108
					& clipping[arg6][arg7]) == 0)
				    return true;
				if ((1 + arg3 ^ 0xffffffff) == (arg6
								^ 0xffffffff)
				    && (arg0 ^ 0xffffffff) == (arg7
							       ^ 0xffffffff)
				    && (clipping[arg6][arg7]
					& 0x2c0180) == 0)
				    return true;
			    }
			} else {
			    if (1 + arg3 == arg6
				&& (arg0 ^ 0xffffffff) == (arg7 ^ 0xffffffff))
				return true;
			    if (arg6 == arg3
				&& (arg7 ^ 0xffffffff) == (arg0 - -1
							   ^ 0xffffffff)
				&& (0x2c0120 & clipping[arg6][arg7]
				    ^ 0xffffffff) == -1)
				return true;
			    if (arg3 == arg6
				&& (-1 + arg0 ^ 0xffffffff) == (arg7
								^ 0xffffffff)
				&& ((clipping[arg6][arg7] & 0x2c0102)
				    == 0))
				return true;
			}
		    } else {
			if (arg6 == arg3
			    && (arg7 ^ 0xffffffff) == (1 + arg0 ^ 0xffffffff))
			    return true;
			if ((arg3 + -1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && (arg0 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			    && (clipping[arg6][arg7] & 0x2c0108
				^ 0xffffffff) == -1)
			    return true;
			if (arg6 == 1 + arg3
			    && (arg0 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			    && (clipping[arg6][arg7] & 0x2c0180
				^ 0xffffffff) == -1)
			    return true;
		    }
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    if (arg2 != 0) {
			if ((arg2 ^ 0xffffffff) != -2) {
			    if (arg2 == 2) {
				if ((arg6 ^ 0xffffffff) == (arg3 - 1
							    ^ 0xffffffff)
				    && (arg7 ^ 0xffffffff) == (arg0
							       ^ 0xffffffff)
				    && ((clipping[arg6][arg7]
					 & 0x2c0108)
					^ 0xffffffff) == -1)
				    return true;
				if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
				    && ((1 + arg0 ^ 0xffffffff)
					== (arg7 ^ 0xffffffff))
				    && (clipping[arg6][arg7]
					& 0x2c0120) == 0)
				    return true;
				if (arg6 == arg3 + 1 && arg0 == arg7)
				    return true;
				if (arg6 == arg3 && arg7 == arg0 + -1)
				    return true;
			    } else if (arg2 == 3) {
				if (arg3 + -1 == arg6 && arg0 == arg7)
				    return true;
				if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
				    && ((1 + arg0 ^ 0xffffffff)
					== (arg7 ^ 0xffffffff))
				    && (clipping[arg6][arg7]
					& 0x2c0120) == 0)
				    return true;
				if (arg6 == arg3 + 1 && arg0 == arg7
				    && ((clipping[arg6][arg7]
					 & 0x2c0180)
					^ 0xffffffff) == -1)
				    return true;
				if (arg6 == arg3 && arg7 == -1 + arg0)
				    return true;
			    }
			} else {
			    if ((arg6 ^ 0xffffffff) == (arg3 + -1 ^ 0xffffffff)
				&& arg7 == arg0
				&& ((clipping[arg6][arg7] & 0x2c0108)
				    == 0))
				return true;
			    if (arg6 == arg3
				&& (1 + arg0 ^ 0xffffffff) == (arg7
							       ^ 0xffffffff))
				return true;
			    if ((arg6 ^ 0xffffffff) == (arg3 + 1 ^ 0xffffffff)
				&& (arg7 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
				return true;
			    if (arg3 == arg6
				&& (-1 + arg0 ^ 0xffffffff) == (arg7
								^ 0xffffffff)
				&& ((clipping[arg6][arg7] & 0x2c0102)
				    == 0))
				return true;
			}
		    } else {
			if (arg6 == -1 + arg3
			    && (arg7 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
			    return true;
			if (arg3 == arg6
			    && (arg7 ^ 0xffffffff) == (arg0 - -1 ^ 0xffffffff))
			    return true;
			if (arg6 == 1 + arg3
			    && (arg0 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			    && ((clipping[arg6][arg7] & 0x2c0180)
				== 0))
			    return true;
			if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && (arg0 + -1 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			    && ((clipping[arg6][arg7] & 0x2c0102)
				== 0))
			    return true;
		    }
		}
		if (arg4 == 9) {
		    if (arg3 == arg6
			&& (arg7 ^ 0xffffffff) == (arg0 + 1 ^ 0xffffffff)
			&& (clipping[arg6][arg7] & 0x20
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg6 == arg3 && arg0 + -1 == arg7
			&& ((0x2 & clipping[arg6][arg7] ^ 0xffffffff)
			    == -1))
			return true;
		    if (-1 + arg3 == arg6
			&& (arg7 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
			&& (clipping[arg6][arg7] & 0x8) == 0)
			return true;
		    if (arg6 == arg3 - -1
			&& (arg7 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
			&& (0x80 & clipping[arg6][arg7]) == 0)
			return true;
		}
	    } else {
		int i = arg6 - -arg1 + -1;
		int i_19_ = -1 + (arg7 - -arg1);
		if ((arg4 ^ 0xffffffff) == -1) {
		    if (arg2 == 0) {
			if (arg6 == -arg1 + arg3
			    && (arg0 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
			    && i_19_ >= arg0)
			    return true;
			if (arg3 >= arg6 && arg3 <= i
			    && (arg7 ^ 0xffffffff) == (arg0 - -1 ^ 0xffffffff)
			    && ((clipping[arg3][arg7] & 0x2c0120)
				== 0))
			    return true;
			if ((arg6 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
			    && (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
			    && arg7 == -arg1 + arg0
			    && (clipping[arg3][i_19_] & 0x2c0102
				^ 0xffffffff) == -1)
			    return true;
		    } else if ((arg2 ^ 0xffffffff) != -2) {
			if ((arg2 ^ 0xffffffff) == -3) {
			    if (1 + arg3 == arg6
				&& (arg7 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
				&& arg0 <= i_19_)
				return true;
			    if ((arg6 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
				&& (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
				&& (arg0 + 1 ^ 0xffffffff) == (arg7
							       ^ 0xffffffff)
				&& (clipping[arg3][arg7] & 0x2c0120
				    ^ 0xffffffff) == -1)
				return true;
			    if ((arg3 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
				&& arg3 <= i && arg7 == arg0 - arg1
				&& (0x2c0102
				    & clipping[arg3][i_19_]) == 0)
				return true;
			} else if (arg2 == 3) {
			    if ((arg3 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
				&& (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
				&& (arg7 ^ 0xffffffff) == (arg0 + -arg1
							   ^ 0xffffffff))
				return true;
			    if (-arg1 + arg3 == arg6 && arg0 >= arg7
				&& arg0 <= i_19_
				&& ((0x2c0108 & clipping[i][arg0])
				    == 0))
				return true;
			    if (arg6 == arg3 - -1 && arg7 <= arg0
				&& arg0 <= i_19_
				&& ((0x2c0180 & clipping[arg6][arg0])
				    == 0))
				return true;
			}
		    } else {
			if (arg6 <= arg3 && arg3 <= i && arg7 == arg0 - -1)
			    return true;
			if (arg6 == -arg1 + arg3 && arg0 >= arg7
			    && i_19_ >= arg0
			    && (0x2c0108 & clipping[i][arg0]) == 0)
			    return true;
			if (1 + arg3 == arg6 && arg7 <= arg0 && arg0 <= i_19_
			    && ((clipping[arg6][arg0] & 0x2c0180)
				== 0))
			    return true;
		    }
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    if ((arg2 ^ 0xffffffff) != -1) {
			if ((arg2 ^ 0xffffffff) != -2) {
			    if ((arg2 ^ 0xffffffff) == -3) {
				if (arg6 == arg3 - arg1 && arg0 >= arg7
				    && arg0 <= i_19_
				    && (clipping[i][arg0] & 0x2c0108
					^ 0xffffffff) == -1)
				    return true;
				if (arg3 >= arg6
				    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
				    && (arg7 ^ 0xffffffff) == (1 + arg0
							       ^ 0xffffffff)
				    && (0x2c0120
					& clipping[arg3][arg7]) == 0)
				    return true;
				if ((1 + arg3 ^ 0xffffffff) == (arg6
								^ 0xffffffff)
				    && (arg7 ^ 0xffffffff) >= (arg0
							       ^ 0xffffffff)
				    && arg0 <= i_19_)
				    return true;
				if (arg6 <= arg3
				    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
				    && -arg1 + arg0 == arg7)
				    return true;
			    } else if ((arg2 ^ 0xffffffff) == -4) {
				if (arg6 == arg3 - arg1
				    && (arg0 ^ 0xffffffff) <= (arg7
							       ^ 0xffffffff)
				    && (arg0 ^ 0xffffffff) >= (i_19_
							       ^ 0xffffffff))
				    return true;
				if (arg6 <= arg3
				    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
				    && ((1 + arg0 ^ 0xffffffff)
					== (arg7 ^ 0xffffffff))
				    && ((0x2c0120
					 & clipping[arg3][arg7])
					^ 0xffffffff) == -1)
				    return true;
				if (arg3 - -1 == arg6
				    && (arg7 ^ 0xffffffff) >= (arg0
							       ^ 0xffffffff)
				    && arg0 <= i_19_
				    && (0x2c0180
					& clipping[arg6][arg0]) == 0)
				    return true;
				if ((arg3 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
				    && i >= arg3
				    && (arg7 ^ 0xffffffff) == (arg0 + -arg1
							       ^ 0xffffffff))
				    return true;
			    }
			} else {
			    if ((arg6 ^ 0xffffffff) == (-arg1 + arg3
							^ 0xffffffff)
				&& (arg0 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
				&& i_19_ >= arg0
				&& ((0x2c0108 & clipping[i][arg0])
				    == 0))
				return true;
			    if ((arg6 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
				&& (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
				&& (arg7 ^ 0xffffffff) == (arg0 + 1
							   ^ 0xffffffff))
				return true;
			    if (arg6 == 1 + arg3
				&& (arg0 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
				&& i_19_ >= arg0)
				return true;
			    if ((arg6 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
				&& arg3 <= i
				&& (arg7 ^ 0xffffffff) == (arg0 - arg1
							   ^ 0xffffffff)
				&& (0x2c0102 & clipping[arg3][i_19_]
				    ^ 0xffffffff) == -1)
				return true;
			}
		    } else {
			if ((arg6 ^ 0xffffffff) == (-arg1 + arg3 ^ 0xffffffff)
			    && (arg0 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
			    && (i_19_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff))
			    return true;
			if (arg3 >= arg6
			    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
			    && (arg0 + 1 ^ 0xffffffff) == (arg7 ^ 0xffffffff))
			    return true;
			if ((arg6 ^ 0xffffffff) == (arg3 - -1 ^ 0xffffffff)
			    && (arg0 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
			    && i_19_ >= arg0
			    && ((clipping[arg6][arg0] & 0x2c0180)
				== 0))
			    return true;
			if (arg6 <= arg3 && arg3 <= i && arg7 == arg0 - arg1
			    && ((clipping[arg3][i_19_] & 0x2c0102)
				== 0))
			    return true;
		    }
		}
		if (arg4 == 9) {
		    if (arg3 >= arg6 && i >= arg3
			&& (arg0 - -1 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			&& (0x2c0120 & clipping[arg3][arg7]) == 0)
			return true;
		    if (arg6 <= arg3 && i >= arg3
			&& (arg7 ^ 0xffffffff) == (arg0 + -arg1 ^ 0xffffffff)
			&& (0x2c0102 & clipping[arg3][i_19_]) == 0)
			return true;
		    if (arg3 + -arg1 == arg6 && arg0 >= arg7 && arg0 <= i_19_
			&& (0x2c0108 & clipping[i][arg0]) == 0)
			return true;
		    if ((arg6 ^ 0xffffffff) == (1 + arg3 ^ 0xffffffff)
			&& arg7 <= arg0 && arg0 <= i_19_
			&& (clipping[arg6][arg0] & 0x2c0180) == 0)
			return true;
		}
	    }
	    if (arg5 <= 86)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.S(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static void method251(Class23_Sub4_Sub1 arg0, int arg1, int arg2,
				 byte arg3, int arg4) {
	try {
	    anInt200++;
	    int i = -112 / ((-83 - arg3) / 40);
	    Class72 class72 = arg0.method344(115);
	    int i_20_
		= 0x3fff & -arg0.aClass171_5297.anInt2285 + arg0.anInt5260;
	    if (arg4 == -1) {
		if ((i_20_ ^ 0xffffffff) == -1 && arg0.anInt5291 <= 25) {
		    if (!arg0.aBoolean5261
			|| !class72.method750(arg0.anInt5254, -28)) {
			arg0.anInt5254 = class72.method747((byte) -24);
			arg0.aBoolean5261 = arg0.anInt5254 != -1;
		    }
		} else {
		    arg0.aBoolean5261 = false;
		    if (arg1 >= 0 || class72.anInt958 == -1) {
			if ((arg1 ^ 0xffffffff) >= -1
			    || class72.anInt954 == -1)
			    arg0.anInt5254 = class72.anInt963;
			else
			    arg0.anInt5254 = class72.anInt954;
		    } else
			arg0.anInt5254 = class72.anInt958;
		}
	    } else if (arg0.anInt5255 == -1
		       || (i_20_ ^ 0xffffffff) > -10241 && i_20_ > 2048) {
		if ((i_20_ ^ 0xffffffff) == -1 && arg0.anInt5291 <= 25) {
		    arg0.aBoolean5261 = false;
		    if ((arg4 ^ 0xffffffff) == -3 && class72.anInt976 != -1)
			arg0.anInt5254 = class72.anInt976;
		    else if (arg4 != 0 || class72.anInt974 == -1)
			arg0.anInt5254 = class72.anInt963;
		    else
			arg0.anInt5254 = class72.anInt974;
		} else {
		    if (arg4 == 2 && (class72.anInt976 ^ 0xffffffff) != 0) {
			if (arg1 < 0 && class72.anInt989 != -1)
			    arg0.anInt5254 = class72.anInt989;
			else if (arg1 > 0 && class72.anInt952 != -1)
			    arg0.anInt5254 = class72.anInt952;
			else
			    arg0.anInt5254 = class72.anInt976;
		    } else if (arg4 != 0 || class72.anInt974 == -1) {
			if (arg1 < 0 && (class72.anInt990 ^ 0xffffffff) != 0)
			    arg0.anInt5254 = class72.anInt990;
			else if (arg1 <= 0
				 || (class72.anInt962 ^ 0xffffffff) == 0)
			    arg0.anInt5254 = class72.anInt963;
			else
			    arg0.anInt5254 = class72.anInt962;
		    } else if ((arg1 ^ 0xffffffff) > -1
			       && (class72.anInt983 ^ 0xffffffff) != 0)
			arg0.anInt5254 = class72.anInt983;
		    else if ((arg1 ^ 0xffffffff) < -1
			     && class72.anInt966 != -1)
			arg0.anInt5254 = class72.anInt966;
		    else
			arg0.anInt5254 = class72.anInt974;
		    arg0.aBoolean5261 = false;
		}
	    } else {
		int i_21_ = ((Class77.anIntArray1043[arg2]
			      - arg0.aClass171_5297.anInt2285)
			     & 0x3fff);
		arg0.aBoolean5261 = false;
		if ((arg4 ^ 0xffffffff) != -3
		    || (class72.anInt976 ^ 0xffffffff) == 0) {
		    if ((arg4 ^ 0xffffffff) == -1 && class72.anInt974 != -1) {
			if ((i_21_ ^ 0xffffffff) < -2049 && i_21_ <= 6144
			    && (class72.anInt977 ^ 0xffffffff) != 0)
			    arg0.anInt5254 = class72.anInt977;
			else if ((i_21_ ^ 0xffffffff) > -10241
				 || (i_21_ ^ 0xffffffff) <= -14337
				 || class72.anInt986 == -1) {
			    if (i_21_ <= 6144 || i_21_ >= 10240
				|| (class72.anInt987 ^ 0xffffffff) == 0)
				arg0.anInt5254 = class72.anInt974;
			    else
				arg0.anInt5254 = class72.anInt987;
			} else
			    arg0.anInt5254 = class72.anInt986;
		    } else if (i_21_ > 2048 && i_21_ <= 6144
			       && class72.anInt981 != -1)
			arg0.anInt5254 = class72.anInt981;
		    else if ((i_21_ ^ 0xffffffff) > -10241 || i_21_ >= 14336
			     || (class72.anInt953 ^ 0xffffffff) == 0) {
			if (i_21_ <= 6144 || i_21_ >= 10240
			    || class72.anInt949 == -1)
			    arg0.anInt5254 = class72.anInt963;
			else
			    arg0.anInt5254 = class72.anInt949;
		    } else
			arg0.anInt5254 = class72.anInt953;
		} else if ((i_21_ ^ 0xffffffff) < -2049
			   && (i_21_ ^ 0xffffffff) >= -6145
			   && (class72.anInt957 ^ 0xffffffff) != 0)
		    arg0.anInt5254 = class72.anInt957;
		else if (i_21_ < 10240 || i_21_ >= 14336
			 || class72.anInt985 == -1) {
		    if ((i_21_ ^ 0xffffffff) < -6145 && i_21_ < 10240
			&& (class72.anInt960 ^ 0xffffffff) != 0)
			arg0.anInt5254 = class72.anInt960;
		    else
			arg0.anInt5254 = class72.anInt976;
		} else
		    arg0.anInt5254 = class72.anInt985;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    public void method252(byte arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt207++;
	    int i = 49 % ((arg0 - -37) / 54);
	    clipping[arg2][arg1]
		= Cryption.method2105(clipping[arg2][arg1], arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bi.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method253(byte arg0) {
	try {
	    anInt216++;
	    if (arg0 == -107) {
		for (int i = 0; anInt214 > i; i++) {
		    for (int i_22_ = 0;
			 (anInt196 ^ 0xffffffff) < (i_22_ ^ 0xffffffff);
			 i_22_++) {
			if (i != 0 && (i_22_ ^ 0xffffffff) != -1
			    && (i ^ 0xffffffff) > (-5 + anInt214 ^ 0xffffffff)
			    && (i_22_ ^ 0xffffffff) > (-5 + anInt196
						       ^ 0xffffffff))
			    clipping[i][i_22_] = 2097152;
			else
			    clipping[i][i_22_] = -1;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bi.E(" + arg0 + ')');
	}
    }
    
    static {
	aString209 = "Loaded update list";
	aClass131_Sub37_205 = new Class131_Sub37(0, -1);
	anIntArray224 = new int[14];
	aString225 = "Stellar Dawn is loading - please wait...";
    }
}
