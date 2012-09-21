/* Class131_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub1_Sub2 extends Class131_Sub1
{
    public int anInt5513;
    public int anInt5514;
    public int anInt5515;
    public int anInt5516;
    public int anInt5517;
    public int anInt5518;
    public int anInt5519;
    public int anInt5520;
    public int anInt5521;
    public int anInt5522;
    public int anInt5523;
    public boolean aBoolean5524;
    public int anInt5525;
    public int anInt5526;
    public int anInt5527;
    
    public static Class131_Sub1_Sub2 method1401(Class131_Sub12_Sub1 arg0,
						int arg1, int arg2) {
	if (arg0.aByteArray6113 == null || arg0.aByteArray6113.length == 0)
	    return null;
	return new Class131_Sub1_Sub2(arg0,
				      (int) ((long) arg0.anInt6115 * 256L
					     * (long) arg1
					     / (long) (100
						       * (Class131_Sub2_Sub14
							  .anInt5754))),
				      arg2 << 6);
    }
    
    public static int method1402(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 Class131_Sub1_Sub2 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2--] * arg4;
	arg8.anInt5525 = arg2 << 8;
	return arg3;
    }
    
    public int method1362() {
	if (anInt5523 == 0 && anInt5520 == 0)
	    return 0;
	return 1;
    }
    
    public void method1403() {
	anInt5526 = anInt5523;
	anInt5517 = method1413(anInt5523, anInt5514);
	anInt5515 = method1411(anInt5523, anInt5514);
    }
    
    public boolean method1404() {
	if (anInt5520 == 0)
	    return false;
	return true;
    }
    
    public static int method1405
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class131_Sub1_Sub2 arg13, int arg14, int arg15) {
	arg13.anInt5526 -= arg13.anInt5513 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt5526 += arg13.anInt5513 * arg5;
	arg13.anInt5517 = arg6;
	arg13.anInt5515 = arg7;
	arg13.anInt5525 = arg4;
	return arg5;
    }
    
    public static int method1406
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class131_Sub1_Sub2 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || ((arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12)
		> arg9))
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt5525 = arg4;
	return arg5 >> 1;
    }
    
    public int method1407(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt5520 > 0) {
	    int i = arg1 + anInt5520;
	    if (i > arg3)
		i = arg3;
	    anInt5520 += arg1;
	    if (anInt5519 == -256 && (anInt5525 & 0xff) == 0) {
		if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		    arg1 = method1440(0,
				      ((Class131_Sub12_Sub1)
				       aClass131_Sub12_4075).aByteArray6113,
				      arg0, anInt5525, arg1, anInt5517,
				      anInt5515, anInt5522, anInt5516, 0, i,
				      arg2, this);
		else
		    arg1 = method1412(((Class131_Sub12_Sub1)
				       aClass131_Sub12_4075).aByteArray6113,
				      arg0, anInt5525, arg1, anInt5526,
				      anInt5513, 0, i, arg2, this);
	    } else if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		arg1 = method1405(0, 0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5517, anInt5515,
				  anInt5522, anInt5516, 0, i, arg2, this,
				  anInt5519, arg4);
	    else
		arg1 = method1428(0, 0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5526, anInt5513,
				  0, i, arg2, this, anInt5519, arg4);
	    anInt5520 -= arg1;
	    if (anInt5520 != 0)
		return arg1;
	    if (method1430())
		return arg3;
	}
	if (anInt5519 == -256 && (anInt5525 & 0xff) == 0) {
	    if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		return method1438(0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5517, anInt5515,
				  0, arg3, arg2, this);
	    return method1402((((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			       .aByteArray6113),
			      arg0, anInt5525, arg1, anInt5526, 0, arg3, arg2,
			      this);
	}
	if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
	    return method1415(0, 0,
			      (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			       .aByteArray6113),
			      arg0, anInt5525, arg1, anInt5517, anInt5515, 0,
			      arg3, arg2, this, anInt5519, arg4);
	return method1431(0, 0,
			  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			   .aByteArray6113),
			  arg0, anInt5525, arg1, anInt5526, 0, arg3, arg2,
			  this, anInt5519, arg4);
    }
    
    public synchronized void method1408(boolean arg0) {
	anInt5519 = (anInt5519 ^ anInt5519 >> 31) + (anInt5519 >>> 31);
	if (arg0)
	    anInt5519 = -anInt5519;
    }
    
    public int method1361() {
	int i = anInt5526 * 3 >> 6;
	i = (i ^ i >> 31) + (i >>> 31);
	if (anInt5521 == 0)
	    i -= i * anInt5525 / ((((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113).length
				  << 8);
	else if (anInt5521 >= 0)
	    i -= i * anInt5518 / (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				  .aByteArray6113).length;
	if (i > 255)
	    return 255;
	return i;
    }
    
    public synchronized void method1409(int arg0) {
	method1427(arg0, method1410());
    }
    
    public synchronized int method1410() {
	if (anInt5514 < 0)
	    return -1;
	return anInt5514;
    }
    
    public static int method1411(int arg0, int arg1) {
	if (arg1 < 0)
	    return -arg0;
	return (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4)
		      + 0.5);
    }
    
    public Class131_Sub1 method1359() {
	return null;
    }
    
    public static int method1412(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, Class131_Sub1_Sub2 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg2 - (arg8 - 1)) > arg7)
	    arg6 = arg7;
	arg9.anInt5517 += arg9.anInt5522 * (arg6 - arg3);
	arg9.anInt5515 += arg9.anInt5516 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt5526 = arg4 >> 2;
	arg9.anInt5525 = arg2 << 8;
	return arg3;
    }
    
    public synchronized void method1363(int[] arg0, int arg1, int arg2) {
	if (anInt5523 == 0 && anInt5520 == 0)
	    method1360(arg2);
	else {
	    Class131_Sub12_Sub1 class131_sub12_sub1
		= (Class131_Sub12_Sub1) aClass131_Sub12_4075;
	    int i = anInt5518 << 8;
	    int i_0_ = anInt5527 << 8;
	    int i_1_ = class131_sub12_sub1.aByteArray6113.length << 8;
	    int i_2_ = i_0_ - i;
	    if (i_2_ <= 0)
		anInt5521 = 0;
	    int i_3_ = arg1;
	    arg2 += arg1;
	    if (anInt5525 < 0) {
		if (anInt5519 > 0)
		    anInt5525 = 0;
		else {
		    method1421();
		    this.method1355((byte) 120);
		    return;
		}
	    }
	    if (anInt5525 >= i_1_) {
		if (anInt5519 < 0)
		    anInt5525 = i_1_ - 1;
		else {
		    method1421();
		    this.method1355((byte) 117);
		    return;
		}
	    }
	    if (anInt5521 < 0) {
		if (aBoolean5524) {
		    if (anInt5519 < 0) {
			i_3_ = method1407(arg0, i_3_, i, arg2,
					  (class131_sub12_sub1.aByteArray6113
					   [anInt5518]));
			if (anInt5525 >= i)
			    return;
			anInt5525 = i + i - 1 - anInt5525;
			anInt5519 = -anInt5519;
		    }
		    for (;;) {
			i_3_ = method1436(arg0, i_3_, i_0_, arg2,
					  (class131_sub12_sub1.aByteArray6113
					   [anInt5527 - 1]));
			if (anInt5525 < i_0_)
			    break;
			anInt5525 = i_0_ + i_0_ - 1 - anInt5525;
			anInt5519 = -anInt5519;
			i_3_ = method1407(arg0, i_3_, i, arg2,
					  (class131_sub12_sub1.aByteArray6113
					   [anInt5518]));
			if (anInt5525 >= i)
			    break;
			anInt5525 = i + i - 1 - anInt5525;
			anInt5519 = -anInt5519;
		    }
		} else if (anInt5519 < 0) {
		    for (;;) {
			i_3_ = method1407(arg0, i_3_, i, arg2,
					  (class131_sub12_sub1.aByteArray6113
					   [anInt5527 - 1]));
			if (anInt5525 >= i)
			    break;
			anInt5525 = i_0_ - 1 - (i_0_ - 1 - anInt5525) % i_2_;
		    }
		} else {
		    for (;;) {
			i_3_ = method1436(arg0, i_3_, i_0_, arg2,
					  (class131_sub12_sub1.aByteArray6113
					   [anInt5518]));
			if (anInt5525 < i_0_)
			    break;
			anInt5525 = i + (anInt5525 - i) % i_2_;
		    }
		}
	    } else {
		do {
		    if (anInt5521 > 0) {
			if (aBoolean5524) {
			    if (anInt5519 < 0) {
				i_3_
				    = method1407(arg0, i_3_, i, arg2,
						 (class131_sub12_sub1
						  .aByteArray6113[anInt5518]));
				if (anInt5525 >= i)
				    return;
				anInt5525 = i + i - 1 - anInt5525;
				anInt5519 = -anInt5519;
				if (--anInt5521 == 0)
				    break;
			    }
			    do {
				i_3_ = method1436(arg0, i_3_, i_0_, arg2,
						  (class131_sub12_sub1
						   .aByteArray6113
						   [anInt5527 - 1]));
				if (anInt5525 < i_0_)
				    return;
				anInt5525 = i_0_ + i_0_ - 1 - anInt5525;
				anInt5519 = -anInt5519;
				if (--anInt5521 == 0)
				    break;
				i_3_
				    = method1407(arg0, i_3_, i, arg2,
						 (class131_sub12_sub1
						  .aByteArray6113[anInt5518]));
				if (anInt5525 >= i)
				    return;
				anInt5525 = i + i - 1 - anInt5525;
				anInt5519 = -anInt5519;
			    } while (--anInt5521 != 0);
			} else if (anInt5519 < 0) {
			    for (;;) {
				i_3_ = method1407(arg0, i_3_, i, arg2,
						  (class131_sub12_sub1
						   .aByteArray6113
						   [anInt5527 - 1]));
				if (anInt5525 >= i)
				    return;
				int i_4_ = (i_0_ - 1 - anInt5525) / i_2_;
				if (i_4_ >= anInt5521) {
				    anInt5525 += i_2_ * anInt5521;
				    anInt5521 = 0;
				    break;
				}
				anInt5525 += i_2_ * i_4_;
				anInt5521 -= i_4_;
			    }
			} else {
			    for (;;) {
				i_3_
				    = method1436(arg0, i_3_, i_0_, arg2,
						 (class131_sub12_sub1
						  .aByteArray6113[anInt5518]));
				if (anInt5525 < i_0_)
				    return;
				int i_5_ = (anInt5525 - i) / i_2_;
				if (i_5_ >= anInt5521) {
				    anInt5525 -= i_2_ * anInt5521;
				    anInt5521 = 0;
				    break;
				}
				anInt5525 -= i_2_ * i_5_;
				anInt5521 -= i_5_;
			    }
			}
		    }
		} while (false);
		if (anInt5519 < 0) {
		    method1407(arg0, i_3_, 0, arg2, 0);
		    if (anInt5525 < 0) {
			anInt5525 = -1;
			method1421();
			this.method1355((byte) 119);
		    }
		} else {
		    method1436(arg0, i_3_, i_1_, arg2, 0);
		    if (anInt5525 >= i_1_) {
			anInt5525 = i_1_;
			method1421();
			this.method1355((byte) 123);
		    }
		}
	    }
	}
    }
    
    public static int method1413(int arg0, int arg1) {
	if (arg1 < 0)
	    return arg0;
	return (int) (((double) arg0
		       * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4))
		      + 0.5);
    }
    
    public synchronized int method1414() {
	if (anInt5519 < 0)
	    return -anInt5519;
	return anInt5519;
    }
    
    public static int method1415
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class131_Sub1_Sub2 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt5525 = arg4;
	return arg5 >> 1;
    }
    
    public boolean method1416() {
	if (anInt5525 >= 0
	    && anInt5525 < (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			    .aByteArray6113).length << 8)
	    return false;
	return true;
    }
    
    public static int method1417
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class131_Sub1_Sub2 arg11, int arg12, int arg13) {
	arg11.anInt5517 -= arg11.anInt5522 * arg5;
	arg11.anInt5515 -= arg11.anInt5516 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9)
	    arg8 = arg9;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	arg11.anInt5517 += arg11.anInt5522 * arg5;
	arg11.anInt5515 += arg11.anInt5516 * arg5;
	arg11.anInt5526 = arg6;
	arg11.anInt5525 = arg4;
	return arg5;
    }
    
    public synchronized void method1418(int arg0) {
	method1427(arg0 << 6, method1410());
    }
    
    public synchronized void method1419(int arg0) {
	if (anInt5519 < 0)
	    anInt5519 = -arg0;
	else
	    anInt5519 = arg0;
    }
    
    public synchronized void method1420(int arg0, int arg1) {
	method1426(arg0, arg1, method1410());
    }
    
    public void method1421() {
	if (anInt5520 != 0) {
	    if (anInt5523 == -2147483648)
		anInt5523 = 0;
	    anInt5520 = 0;
	    method1403();
	}
    }
    
    public static int method1422(int arg0, int arg1, byte[] arg2, int[] arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, Class131_Sub1_Sub2 arg10,
				 int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg11;
	}
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
	    arg7 = arg8;
	arg1 = arg12;
	while (arg5 < arg7) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg4 += arg11;
	}
	arg10.anInt5525 = arg4;
	return arg5;
    }
    
    public static Class131_Sub1_Sub2 method1423(Class131_Sub12_Sub1 arg0,
						int arg1, int arg2, int arg3) {
	if (arg0.aByteArray6113 == null || arg0.aByteArray6113.length == 0)
	    return null;
	return new Class131_Sub1_Sub2(arg0, arg1, arg2, arg3);
    }
    
    public synchronized void method1424(int arg0) {
	int i = ((((Class131_Sub12_Sub1) aClass131_Sub12_4075)
		  .aByteArray6113).length
		 << 8);
	if (arg0 < -1)
	    arg0 = -1;
	if (arg0 > i)
	    arg0 = i;
	anInt5525 = arg0;
    }
    
    public static int method1425(int arg0, byte[] arg1, int[] arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 Class131_Sub1_Sub2 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg11 - arg3) > arg10)
	    arg9 = arg10;
	arg12.anInt5526 += arg12.anInt5513 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt5517 = arg5 >> 2;
	arg12.anInt5515 = arg6 >> 2;
	arg12.anInt5525 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public synchronized void method1426(int arg0, int arg1, int arg2) {
	if (arg0 == 0)
	    method1427(arg1, arg2);
	else {
	    int i = method1413(arg1, arg2);
	    int i_6_ = method1411(arg1, arg2);
	    if (anInt5517 == i && anInt5515 == i_6_)
		anInt5520 = 0;
	    else {
		int i_7_ = arg1 - anInt5526;
		if (anInt5526 - arg1 > i_7_)
		    i_7_ = anInt5526 - arg1;
		if (i - anInt5517 > i_7_)
		    i_7_ = i - anInt5517;
		if (anInt5517 - i > i_7_)
		    i_7_ = anInt5517 - i;
		if (i_6_ - anInt5515 > i_7_)
		    i_7_ = i_6_ - anInt5515;
		if (anInt5515 - i_6_ > i_7_)
		    i_7_ = anInt5515 - i_6_;
		if (arg0 > i_7_)
		    arg0 = i_7_;
		anInt5520 = arg0;
		anInt5523 = arg1;
		anInt5514 = arg2;
		anInt5513 = (arg1 - anInt5526) / arg0;
		anInt5522 = (i - anInt5517) / arg0;
		anInt5516 = (i_6_ - anInt5515) / arg0;
	    }
	}
    }
    
    public synchronized void method1427(int arg0, int arg1) {
	anInt5523 = arg0;
	anInt5514 = arg1;
	anInt5520 = 0;
	method1403();
    }
    
    public static int method1428
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class131_Sub1_Sub2 arg11, int arg12, int arg13) {
	arg11.anInt5517 -= arg11.anInt5522 * arg5;
	arg11.anInt5515 -= arg11.anInt5516 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg0 = arg13;
	arg1 = arg12;
	while (arg5 < arg8) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg1;
	}
	arg11.anInt5517 += arg11.anInt5522 * arg5;
	arg11.anInt5515 += arg11.anInt5516 * arg5;
	arg11.anInt5526 = arg6;
	arg11.anInt5525 = arg4;
	return arg5;
    }
    
    public Class131_Sub1 method1357() {
	return null;
    }
    
    public static int method1429
	(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, Class131_Sub1_Sub2 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg9 - arg3) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt5525 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public boolean method1430() {
	int i = anInt5523;
	int i_8_;
	int i_9_;
	if (i == -2147483648)
	    i = i_8_ = i_9_ = 0;
	else {
	    i_8_ = method1413(i, anInt5514);
	    i_9_ = method1411(i, anInt5514);
	}
	if (anInt5526 != i || anInt5517 != i_8_ || anInt5515 != i_9_) {
	    if (anInt5526 < i) {
		anInt5513 = 1;
		anInt5520 = i - anInt5526;
	    } else if (anInt5526 > i) {
		anInt5513 = -1;
		anInt5520 = anInt5526 - i;
	    } else
		anInt5513 = 0;
	    if (anInt5517 < i_8_) {
		anInt5522 = 1;
		if (anInt5520 == 0 || anInt5520 > i_8_ - anInt5517)
		    anInt5520 = i_8_ - anInt5517;
	    } else if (anInt5517 > i_8_) {
		anInt5522 = -1;
		if (anInt5520 == 0 || anInt5520 > anInt5517 - i_8_)
		    anInt5520 = anInt5517 - i_8_;
	    } else
		anInt5522 = 0;
	    if (anInt5515 < i_9_) {
		anInt5516 = 1;
		if (anInt5520 == 0 || anInt5520 > i_9_ - anInt5515)
		    anInt5520 = i_9_ - anInt5515;
	    } else if (anInt5515 > i_9_) {
		anInt5516 = -1;
		if (anInt5520 == 0 || anInt5520 > anInt5515 - i_9_)
		    anInt5520 = anInt5515 - i_9_;
	    } else
		anInt5516 = 0;
	    return false;
	}
	if (anInt5523 == -2147483648) {
	    anInt5523 = 0;
	    anInt5526 = anInt5517 = anInt5515 = 0;
	    this.method1355((byte) 115);
	    return true;
	}
	method1403();
	return false;
    }
    
    public synchronized void method1360(int arg0) {
	if (anInt5520 > 0) {
	    if (arg0 >= anInt5520) {
		if (anInt5523 == -2147483648) {
		    anInt5523 = 0;
		    anInt5526 = anInt5517 = anInt5515 = 0;
		    this.method1355((byte) 126);
		    arg0 = anInt5520;
		}
		anInt5520 = 0;
		method1403();
	    } else {
		anInt5526 += anInt5513 * arg0;
		anInt5517 += anInt5522 * arg0;
		anInt5515 += anInt5516 * arg0;
		anInt5520 -= arg0;
	    }
	}
	Class131_Sub12_Sub1 class131_sub12_sub1
	    = (Class131_Sub12_Sub1) aClass131_Sub12_4075;
	int i = anInt5518 << 8;
	int i_10_ = anInt5527 << 8;
	int i_11_ = class131_sub12_sub1.aByteArray6113.length << 8;
	int i_12_ = i_10_ - i;
	if (i_12_ <= 0)
	    anInt5521 = 0;
	if (anInt5525 < 0) {
	    if (anInt5519 > 0)
		anInt5525 = 0;
	    else {
		method1421();
		this.method1355((byte) 117);
		return;
	    }
	}
	if (anInt5525 >= i_11_) {
	    if (anInt5519 < 0)
		anInt5525 = i_11_ - 1;
	    else {
		method1421();
		this.method1355((byte) 125);
		return;
	    }
	}
	anInt5525 += anInt5519 * arg0;
	if (anInt5521 < 0) {
	    if (aBoolean5524) {
		if (anInt5519 < 0) {
		    if (anInt5525 >= i)
			return;
		    anInt5525 = i + i - 1 - anInt5525;
		    anInt5519 = -anInt5519;
		}
		while (anInt5525 >= i_10_) {
		    anInt5525 = i_10_ + i_10_ - 1 - anInt5525;
		    anInt5519 = -anInt5519;
		    if (anInt5525 >= i)
			break;
		    anInt5525 = i + i - 1 - anInt5525;
		    anInt5519 = -anInt5519;
		}
	    } else if (anInt5519 < 0) {
		if (anInt5525 < i)
		    anInt5525 = i_10_ - 1 - (i_10_ - 1 - anInt5525) % i_12_;
	    } else if (anInt5525 >= i_10_)
		anInt5525 = i + (anInt5525 - i) % i_12_;
	} else {
	    do {
		if (anInt5521 > 0) {
		    if (aBoolean5524) {
			if (anInt5519 < 0) {
			    if (anInt5525 >= i)
				return;
			    anInt5525 = i + i - 1 - anInt5525;
			    anInt5519 = -anInt5519;
			    if (--anInt5521 == 0)
				break;
			}
			do {
			    if (anInt5525 < i_10_)
				return;
			    anInt5525 = i_10_ + i_10_ - 1 - anInt5525;
			    anInt5519 = -anInt5519;
			    if (--anInt5521 == 0)
				break;
			    if (anInt5525 >= i)
				return;
			    anInt5525 = i + i - 1 - anInt5525;
			    anInt5519 = -anInt5519;
			} while (--anInt5521 != 0);
		    } else if (anInt5519 < 0) {
			if (anInt5525 >= i)
			    return;
			int i_13_ = (i_10_ - 1 - anInt5525) / i_12_;
			if (i_13_ >= anInt5521) {
			    anInt5525 += i_12_ * anInt5521;
			    anInt5521 = 0;
			} else {
			    anInt5525 += i_12_ * i_13_;
			    anInt5521 -= i_13_;
			    return;
			}
		    } else {
			if (anInt5525 < i_10_)
			    return;
			int i_14_ = (anInt5525 - i) / i_12_;
			if (i_14_ >= anInt5521) {
			    anInt5525 -= i_12_ * anInt5521;
			    anInt5521 = 0;
			} else {
			    anInt5525 -= i_12_ * i_14_;
			    anInt5521 -= i_14_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (anInt5519 < 0) {
		if (anInt5525 < 0) {
		    anInt5525 = -1;
		    method1421();
		    this.method1355((byte) 124);
		}
	    } else if (anInt5525 >= i_11_) {
		anInt5525 = i_11_;
		method1421();
		this.method1355((byte) 126);
	    }
	}
    }
    
    public static int method1431(int arg0, int arg1, byte[] arg2, int[] arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, Class131_Sub1_Sub2 arg10,
				 int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg4 += arg11;
	}
	if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	arg0 = arg12;
	arg1 = arg11;
	while (arg5 < arg7) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg1;
	}
	arg10.anInt5525 = arg4;
	return arg5;
    }
    
    public synchronized void method1432(int arg0) {
	if (arg0 == 0) {
	    method1409(0);
	    this.method1355((byte) 118);
	} else if (anInt5517 == 0 && anInt5515 == 0) {
	    anInt5520 = 0;
	    anInt5523 = 0;
	    anInt5526 = 0;
	    this.method1355((byte) 124);
	} else {
	    int i = -anInt5526;
	    if (anInt5526 > i)
		i = anInt5526;
	    if (-anInt5517 > i)
		i = -anInt5517;
	    if (anInt5517 > i)
		i = anInt5517;
	    if (-anInt5515 > i)
		i = -anInt5515;
	    if (anInt5515 > i)
		i = anInt5515;
	    if (arg0 > i)
		arg0 = i;
	    anInt5520 = arg0;
	    anInt5523 = -2147483648;
	    anInt5513 = -anInt5526 / arg0;
	    anInt5522 = -anInt5517 / arg0;
	    anInt5516 = -anInt5515 / arg0;
	}
    }
    
    public static int method1433(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, Class131_Sub1_Sub2 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg8 - arg2) > arg7)
	    arg6 = arg7;
	arg9.anInt5517 += arg9.anInt5522 * (arg6 - arg3);
	arg9.anInt5515 += arg9.anInt5516 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt5526 = arg4 >> 2;
	arg9.anInt5525 = arg2 << 8;
	return arg3;
    }
    
    public static int method1434
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class131_Sub1_Sub2 arg13, int arg14, int arg15) {
	arg13.anInt5526 -= arg13.anInt5513 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || ((arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14)
		> arg11))
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt5526 += arg13.anInt5513 * arg5;
	arg13.anInt5517 = arg6;
	arg13.anInt5515 = arg7;
	arg13.anInt5525 = arg4;
	return arg5;
    }
    
    public synchronized void method1435(int arg0) {
	anInt5521 = arg0;
    }
    
    public int method1436(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt5520 > 0) {
	    int i = arg1 + anInt5520;
	    if (i > arg3)
		i = arg3;
	    anInt5520 += arg1;
	    if (anInt5519 == 256 && (anInt5525 & 0xff) == 0) {
		if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		    arg1 = method1425(0,
				      ((Class131_Sub12_Sub1)
				       aClass131_Sub12_4075).aByteArray6113,
				      arg0, anInt5525, arg1, anInt5517,
				      anInt5515, anInt5522, anInt5516, 0, i,
				      arg2, this);
		else
		    arg1 = method1433(((Class131_Sub12_Sub1)
				       aClass131_Sub12_4075).aByteArray6113,
				      arg0, anInt5525, arg1, anInt5526,
				      anInt5513, 0, i, arg2, this);
	    } else if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		arg1 = method1434(0, 0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5517, anInt5515,
				  anInt5522, anInt5516, 0, i, arg2, this,
				  anInt5519, arg4);
	    else
		arg1 = method1417(0, 0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5526, anInt5513,
				  0, i, arg2, this, anInt5519, arg4);
	    anInt5520 -= arg1;
	    if (anInt5520 != 0)
		return arg1;
	    if (method1430())
		return arg3;
	}
	if (anInt5519 == 256 && (anInt5525 & 0xff) == 0) {
	    if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
		return method1429(0,
				  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
				   .aByteArray6113),
				  arg0, anInt5525, arg1, anInt5517, anInt5515,
				  0, arg3, arg2, this);
	    return method1439((((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			       .aByteArray6113),
			      arg0, anInt5525, arg1, anInt5526, 0, arg3, arg2,
			      this);
	}
	if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
	    return method1406(0, 0,
			      (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			       .aByteArray6113),
			      arg0, anInt5525, arg1, anInt5517, anInt5515, 0,
			      arg3, arg2, this, anInt5519, arg4);
	return method1422(0, 0,
			  (((Class131_Sub12_Sub1) aClass131_Sub12_4075)
			   .aByteArray6113),
			  arg0, anInt5525, arg1, anInt5526, 0, arg3, arg2,
			  this, anInt5519, arg4);
    }
    
    public synchronized int method1437() {
	if (anInt5523 == -2147483648)
	    return 0;
	return anInt5523;
    }
    
    public static int method1438
	(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, Class131_Sub1_Sub2 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg3 - (arg9 - 1)) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt5525 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static int method1439(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 Class131_Sub1_Sub2 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg7 - arg2) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2++] * arg4;
	arg8.anInt5525 = arg2 << 8;
	return arg3;
    }
    
    public static int method1440(int arg0, byte[] arg1, int[] arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 Class131_Sub1_Sub2 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg3 - (arg11 - 1)) > arg10)
	    arg9 = arg10;
	arg12.anInt5526 += arg12.anInt5513 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt5517 = arg5 >> 2;
	arg12.anInt5515 = arg6 >> 2;
	arg12.anInt5525 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public Class131_Sub1_Sub2(Class131_Sub12_Sub1 arg0, int arg1, int arg2) {
	aClass131_Sub12_4075 = arg0;
	anInt5518 = arg0.anInt6117;
	anInt5527 = arg0.anInt6114;
	aBoolean5524 = arg0.aBoolean6116;
	anInt5519 = arg1;
	anInt5523 = arg2;
	anInt5514 = 8192;
	anInt5525 = 0;
	method1403();
    }
    
    public Class131_Sub1_Sub2(Class131_Sub12_Sub1 arg0, int arg1, int arg2,
			      int arg3) {
	aClass131_Sub12_4075 = arg0;
	anInt5518 = arg0.anInt6117;
	anInt5527 = arg0.anInt6114;
	aBoolean5524 = arg0.aBoolean6116;
	anInt5519 = arg1;
	anInt5523 = arg2;
	anInt5514 = arg3;
	anInt5525 = 0;
	method1403();
    }
}
