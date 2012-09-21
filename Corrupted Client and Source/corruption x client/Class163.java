/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Class163
{
    public static int anInt2168;
    public long aLong2169;
    public int anInt2170 = 0;
    public static int anInt2171;
    public static int anInt2172;
    public long aLong2173;
    public static int anInt2174;
    public Class8 aClass8_2175;
    public long aLong2176;
    public long aLong2177;
    public static int anInt2178;
    public byte[] aByteArray2179;
    public static int anInt2180;
    public static int anInt2181;
    public byte[] aByteArray2182;
    public long aLong2183;
    public long aLong2184;
    public static int anInt2185;
    public static int[][][] anIntArrayArrayArray2186;
    public int anInt2187;
    
    public static boolean method2397(int arg0, int arg1, int arg2, int arg3) {
	if (!Class131_Sub4.method1652(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_0_ = arg2 << 7;
	if (Class131_Sub2_Sub27.method1605(i + 1,
					   Class75.aClass68Array1023[arg0]
					       .method712(arg1, arg2) + arg3,
					   i_0_ + 1)
	    && Class131_Sub2_Sub27.method1605(i + 128 - 1,
					      (Class75.aClass68Array1023
						   [arg0]
						   .method712(arg1 + 1, arg2)
					       + arg3),
					      i_0_ + 1)
	    && (Class131_Sub2_Sub27.method1605
		(i + 128 - 1,
		 (Class75.aClass68Array1023[arg0].method712(arg1 + 1, arg2 + 1)
		  + arg3),
		 i_0_ + 128 - 1))
	    && Class131_Sub2_Sub27.method1605(i + 1,
					      (Class75.aClass68Array1023
						   [arg0]
						   .method712(arg1, arg2 + 1)
					       + arg3),
					      i_0_ + 128 - 1))
	    return true;
	return false;
    }
    
    public void method2398(int arg0, long arg1) throws IOException {
	do {
	    try {
		anInt2180++;
		if ((arg1 ^ 0xffffffffffffffffL) > -1L)
		    throw new IOException("Invalid seek to " + arg1
					  + " in file " + method2403(26715));
		aLong2184 = arg1;
		if (arg0 == 0)
		    break;
		aLong2173 = 8L;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("r.D(" + arg0 + ',' + arg1
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method2399(byte arg0) {
	try {
	    if (arg0 < 119)
		method2399((byte) -65);
	    anIntArrayArrayArray2186 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"r.I(" + arg0 + ')');
	}
    }
    
    public void method2400(int arg0, byte[] arg1) throws IOException {
	try {
	    if (arg0 != -1)
		aClass8_2175 = null;
	    method2404(arg1, (byte) 95, 0, arg1.length);
	    anInt2178++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("r.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public long method2401(int arg0) {
	try {
	    anInt2171++;
	    if (arg0 > -49)
		method2401(-49);
	    return aLong2173;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"r.E(" + arg0 + ')');
	}
    }
    
    public static void method2402() {
	Class131_Sub41_Sub6.method1968(1, Class133.anInt1805);
    }
    
    public File method2403(int arg0) {
	try {
	    anInt2172++;
	    if (arg0 != 26715)
		aByteArray2182 = null;
	    return aClass8_2175.method171((byte) -114);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"r.K(" + arg0 + ')');
	}
    }
    
    public void method2404(byte[] arg0, byte arg1, int arg2, int arg3)
	throws IOException {
	int i = -31 / (arg1 / 43);
	anInt2174++;
	try {
	    if ((arg0.length ^ 0xffffffff) > (arg2 - -arg3 ^ 0xffffffff))
		throw new ArrayIndexOutOfBoundsException(-arg0.length
							 + (arg3 + arg2));
	    if ((aLong2169 ^ 0xffffffffffffffffL) != 0L
		&& aLong2169 <= aLong2184
		&& (((long) anInt2170 + aLong2169 ^ 0xffffffffffffffffL)
		    <= ((long) arg3 + aLong2184 ^ 0xffffffffffffffffL))) {
		Class61.method652(aByteArray2182,
				  (int) (-aLong2169 + aLong2184), arg0, arg2,
				  arg3);
		aLong2184 += (long) arg3;
		return;
	    }
	    long l = aLong2184;
	    int i_1_ = arg2;
	    int i_2_ = arg3;
	    if (aLong2177 <= aLong2184
		&& aLong2184 < (long) anInt2187 + aLong2177) {
		int i_3_ = (int) ((long) anInt2187 + (-aLong2184 + aLong2177));
		if (i_3_ > arg3)
		    i_3_ = arg3;
		Class61.method652(aByteArray2179,
				  (int) (aLong2184 - aLong2177), arg0, arg2,
				  i_3_);
		arg2 += i_3_;
		arg3 -= i_3_;
		aLong2184 += (long) i_3_;
	    }
	    if ((arg3 ^ 0xffffffff) >= (aByteArray2179.length ^ 0xffffffff)) {
		if (arg3 > 0) {
		    method2406((byte) 69);
		    int i_4_ = arg3;
		    if ((anInt2187 ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
			i_4_ = anInt2187;
		    Class61.method652(aByteArray2179, 0, arg0, arg2, i_4_);
		    arg2 += i_4_;
		    arg3 -= i_4_;
		    aLong2184 += (long) i_4_;
		}
	    } else {
		aClass8_2175.method169(aLong2184, -16156);
		aLong2183 = aLong2184;
		while (arg3 > 0) {
		    int i_5_ = aClass8_2175.method173(arg3, arg0, arg2, 0);
		    if ((i_5_ ^ 0xffffffff) == 0)
			break;
		    arg3 -= i_5_;
		    arg2 += i_5_;
		    aLong2184 += (long) i_5_;
		    aLong2183 += (long) i_5_;
		}
	    }
	    if ((aLong2169 ^ 0xffffffffffffffffL) != 0L) {
		if ((aLong2169 ^ 0xffffffffffffffffL) < (aLong2184
							 ^ 0xffffffffffffffffL)
		    && arg3 > 0) {
		    int i_6_ = arg2 + (int) (aLong2169 - aLong2184);
		    if (arg2 - -arg3 < i_6_)
			i_6_ = arg3 + arg2;
		    while ((arg2 ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
			arg0[arg2++] = (byte) 0;
			arg3--;
			aLong2184++;
		    }
		}
		long l_7_ = -1L;
		if (aLong2169 < l
		    || ((aLong2169 ^ 0xffffffffffffffffL)
			<= ((long) i_2_ + l ^ 0xffffffffffffffffL))) {
		    if (aLong2169 <= l && l < (long) anInt2170 + aLong2169)
			l_7_ = l;
		} else
		    l_7_ = aLong2169;
		long l_8_ = -1L;
		if ((long) anInt2170 + aLong2169 <= l
		    || (((long) i_2_ + l ^ 0xffffffffffffffffL)
			> ((long) anInt2170 + aLong2169
			   ^ 0xffffffffffffffffL))) {
		    if ((long) i_2_ + l > aLong2169
			&& (((long) i_2_ + l ^ 0xffffffffffffffffL)
			    >= ((long) anInt2170 + aLong2169
				^ 0xffffffffffffffffL)))
			l_8_ = l - -(long) i_2_;
		} else
		    l_8_ = (long) anInt2170 + aLong2169;
		if ((l_7_ ^ 0xffffffffffffffffL) < 0L
		    && ((l_8_ ^ 0xffffffffffffffffL)
			< (l_7_ ^ 0xffffffffffffffffL))) {
		    int i_9_ = (int) (-l_7_ + l_8_);
		    Class61.method652(aByteArray2182,
				      (int) (-aLong2169 + l_7_), arg0,
				      i_1_ + (int) (l_7_ - l), i_9_);
		    if ((l_8_ ^ 0xffffffffffffffffL)
			< (aLong2184 ^ 0xffffffffffffffffL)) {
			arg3 -= -aLong2184 + l_8_;
			aLong2184 = l_8_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong2183 = -1L;
	    throw ioexception;
	}
	if (arg3 > 0)
	    throw new EOFException();
    }
    
    public void method2405(byte[] arg0, int arg1, int arg2, int arg3)
	throws IOException {
	anInt2181++;
	try {
	    if (((long) arg1 + aLong2184 ^ 0xffffffffffffffffL)
		< (aLong2173 ^ 0xffffffffffffffffL))
		aLong2173 = (long) arg1 + aLong2184;
	    if ((aLong2169 ^ 0xffffffffffffffffL) != 0L
		&& ((aLong2169 ^ 0xffffffffffffffffL) < (aLong2184
							 ^ 0xffffffffffffffffL)
		    || ((aLong2184 ^ 0xffffffffffffffffL)
			< (aLong2169 + (long) anInt2170
			   ^ 0xffffffffffffffffL))))
		method2407((byte) -92);
	    if (arg3 < 60)
		method2403(-58);
	    if (aLong2169 != -1L && ((long) aByteArray2182.length + aLong2169
				     < aLong2184 - -(long) arg1)) {
		int i = (int) (-aLong2184
			       - (-aLong2169 - (long) aByteArray2182.length));
		Class61.method652(arg0, arg2, aByteArray2182,
				  (int) (aLong2184 + -aLong2169), i);
		arg1 -= i;
		aLong2184 += (long) i;
		arg2 += i;
		anInt2170 = aByteArray2182.length;
		method2407((byte) -92);
	    }
	    if (aByteArray2182.length < arg1) {
		if (aLong2184 != aLong2183) {
		    aClass8_2175.method169(aLong2184, -16156);
		    aLong2183 = aLong2184;
		}
		aClass8_2175.method168(arg0, 1, arg2, arg1);
		aLong2183 += (long) arg1;
		if (aLong2176 < aLong2183)
		    aLong2176 = aLong2183;
		long l = -1L;
		if ((aLong2184 ^ 0xffffffffffffffffL) > (aLong2177
							 ^ 0xffffffffffffffffL)
		    || ((aLong2184 ^ 0xffffffffffffffffL)
			<= (aLong2177 + (long) anInt2187
			    ^ 0xffffffffffffffffL))) {
		    if (aLong2184 <= aLong2177
			&& ((aLong2177 ^ 0xffffffffffffffffL)
			    > (aLong2184 + (long) arg1 ^ 0xffffffffffffffffL)))
			l = aLong2177;
		} else
		    l = aLong2184;
		long l_10_ = -1L;
		if ((((long) arg1 + aLong2184 ^ 0xffffffffffffffffL)
		     < (aLong2177 ^ 0xffffffffffffffffL))
		    && ((aLong2177 + (long) anInt2187 ^ 0xffffffffffffffffL)
			<= (aLong2184 - -(long) arg1 ^ 0xffffffffffffffffL)))
		    l_10_ = (long) arg1 + aLong2184;
		else if ((((long) anInt2187 + aLong2177 ^ 0xffffffffffffffffL)
			  < (aLong2184 ^ 0xffffffffffffffffL))
			 && (((long) anInt2187 + aLong2177
			      ^ 0xffffffffffffffffL)
			     >= ((long) arg1 + aLong2184
				 ^ 0xffffffffffffffffL)))
		    l_10_ = (long) anInt2187 + aLong2177;
		if ((l ^ 0xffffffffffffffffL) < 0L
		    && ((l_10_ ^ 0xffffffffffffffffL)
			< (l ^ 0xffffffffffffffffL))) {
		    int i = (int) (-l + l_10_);
		    Class61.method652(arg0,
				      (int) (-aLong2184 + (long) arg2 - -l),
				      aByteArray2179, (int) (l + -aLong2177),
				      i);
		}
		aLong2184 += (long) arg1;
	    } else if (arg1 > 0) {
		if ((aLong2169 ^ 0xffffffffffffffffL) == 0L)
		    aLong2169 = aLong2184;
		Class61.method652(arg0, arg2, aByteArray2182,
				  (int) (-aLong2169 + aLong2184), arg1);
		aLong2184 += (long) arg1;
		if (((long) anInt2170 ^ 0xffffffffffffffffL)
		    > (aLong2184 + -aLong2169 ^ 0xffffffffffffffffL))
		    anInt2170 = (int) (-aLong2169 + aLong2184);
	    }
	} catch (IOException ioexception) {
	    aLong2183 = -1L;
	    throw ioexception;
	}
    }
    
    public void method2406(byte arg0) throws IOException {
	try {
	    anInt2187 = 0;
	    anInt2168++;
	    if ((aLong2183 ^ 0xffffffffffffffffL)
		!= (aLong2184 ^ 0xffffffffffffffffL)) {
		aClass8_2175.method169(aLong2184, -16156);
		aLong2183 = aLong2184;
	    }
	    if (arg0 <= 16)
		method2397(-31, -127, -14, -98);
	    aLong2177 = aLong2184;
	    int i;
	    for (/**/; aByteArray2179.length > anInt2187; anInt2187 += i) {
		int i_11_ = aByteArray2179.length + -anInt2187;
		if ((i_11_ ^ 0xffffffff) < -200000001)
		    i_11_ = 200000000;
		i = aClass8_2175.method173(i_11_, aByteArray2179, anInt2187,
					   0);
		if ((i ^ 0xffffffff) == 0)
		    break;
		aLong2183 += (long) i;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"r.H(" + arg0 + ')');
	}
    }
    
    public void method2407(byte arg0) throws IOException {
	anInt2185++;
	if (arg0 == -92) {
	    if ((aLong2169 ^ 0xffffffffffffffffL) != 0L) {
		if ((aLong2169 ^ 0xffffffffffffffffL)
		    != (aLong2183 ^ 0xffffffffffffffffL)) {
		    aClass8_2175.method169(aLong2169, -16156);
		    aLong2183 = aLong2169;
		}
		aClass8_2175.method168(aByteArray2182, 1, 0, anInt2170);
		aLong2183 += (long) anInt2170;
		if ((aLong2176 ^ 0xffffffffffffffffL)
		    > (aLong2183 ^ 0xffffffffffffffffL))
		    aLong2176 = aLong2183;
		long l = -1L;
		if (((aLong2177 ^ 0xffffffffffffffffL)
		     >= (aLong2169 ^ 0xffffffffffffffffL))
		    && (long) anInt2187 + aLong2177 > aLong2169)
		    l = aLong2169;
		else if (((aLong2169 ^ 0xffffffffffffffffL)
			  >= (aLong2177 ^ 0xffffffffffffffffL))
			 && ((aLong2177 ^ 0xffffffffffffffffL)
			     > ((long) anInt2170 + aLong2169
				^ 0xffffffffffffffffL)))
		    l = aLong2177;
		long l_12_ = -1L;
		if (((aLong2177 ^ 0xffffffffffffffffL)
		     <= (aLong2169 + (long) anInt2170 ^ 0xffffffffffffffffL))
		    || ((aLong2169 + (long) anInt2170 ^ 0xffffffffffffffffL)
			< ((long) anInt2187 + aLong2177
			   ^ 0xffffffffffffffffL))) {
		    if ((long) anInt2187 + aLong2177 > aLong2169
			&& ((aLong2169 - -(long) anInt2170
			     ^ 0xffffffffffffffffL)
			    <= ((long) anInt2187 + aLong2177
				^ 0xffffffffffffffffL)))
			l_12_ = (long) anInt2187 + aLong2177;
		} else
		    l_12_ = (long) anInt2170 + aLong2169;
		if (l > -1L
		    && (l ^ 0xffffffffffffffffL) > (l_12_
						    ^ 0xffffffffffffffffL)) {
		    int i = (int) (l_12_ - l);
		    Class61.method652(aByteArray2182, (int) (l - aLong2169),
				      aByteArray2179, (int) (l - aLong2177),
				      i);
		}
		aLong2169 = -1L;
		anInt2170 = 0;
	    }
	}
    }
    
    public Class163(Class8 arg0, int arg1, int arg2) throws IOException {
	aLong2169 = -1L;
	aLong2177 = -1L;
	try {
	    aClass8_2175 = arg0;
	    aLong2173 = aLong2176 = arg0.method172(-116);
	    aLong2184 = 0L;
	    aByteArray2182 = new byte[arg2];
	    aByteArray2179 = new byte[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("r.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
}
