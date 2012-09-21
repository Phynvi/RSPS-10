/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114
{
    public static byte[] aByteArray1465
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public Stream aStream_1466;
    public int[] anIntArray1467;
    public int[] anIntArray1468;
    public long aLong1469;
    public int anInt1470;
    public int[] anIntArray1471;
    public int anInt1472;
    public int[] anIntArray1473;

    public void method962(byte[] arg0) {
	aStream_1466.data = arg0;
	aStream_1466.offset = 10;
	int i = aStream_1466.readUnsignedShort(8104);
	anInt1472 = aStream_1466.readUnsignedShort(8104);
	anInt1470 = 500000;
	anIntArray1471 = new int[i];
	int i_0_ = 0;
	while (i_0_ < i) {
	    int i_1_ = aStream_1466.readUnsignedInt(-2);
	    int i_2_ = aStream_1466.readUnsignedInt(-2);
	    if (i_1_ == 1297379947) {
		anIntArray1471[i_0_] = aStream_1466.offset;
		i_0_++;
	    }
	    aStream_1466.offset += i_2_;
	}
	aLong1469 = 0L;
	anIntArray1473 = new int[i];
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    anIntArray1473[i_3_] = anIntArray1471[i_3_];
	anIntArray1468 = new int[i];
	anIntArray1467 = new int[i];
    }
    
    public void method963() {
	aStream_1466.data = null;
	anIntArray1471 = null;
	anIntArray1473 = null;
	anIntArray1468 = null;
	anIntArray1467 = null;
    }
    
    public static void method964() {
	aByteArray1465 = null;
    }
    
    public int method965(int arg0, int arg1) {
	if (arg1 == 255) {
	    int i = aStream_1466.readUnsignedByte(-51);
	    int i_4_ = aStream_1466.method1739(true);
	    if (i == 47) {
		aStream_1466.offset += i_4_;
		return 1;
	    }
	    if (i == 81) {
		int i_5_ = aStream_1466.read3Bytes(false);
		i_4_ -= 3;
		int i_6_ = anIntArray1468[arg0];
		aLong1469 += (long) i_6_ * (long) (anInt1470 - i_5_);
		anInt1470 = i_5_;
		aStream_1466.offset += i_4_;
		return 2;
	    }
	    aStream_1466.offset += i_4_;
	    return 3;
	}
	byte i = aByteArray1465[arg1 - 128];
	int i_7_ = arg1;
	if (i >= 1)
	    i_7_ |= aStream_1466.readUnsignedByte(127) << 8;
	if (i >= 2)
	    i_7_ |= aStream_1466.readUnsignedByte(-19) << 16;
	return i_7_;
    }
    
    public boolean method966() {
	int i = anIntArray1473.length;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    if (anIntArray1473[i_8_] >= 0)
		return false;
	}
	return true;
    }
    
    public void method967() {
	aStream_1466.offset = -1;
    }
    
    public long method968(int arg0) {
	return aLong1469 + (long) arg0 * (long) anInt1470;
    }
    
    public boolean method969() {
	if (aStream_1466.data == null)
	    return false;
	return true;
    }
    
    public int method970(int arg0) {
	int i = method974(arg0);
	return i;
    }
    
    public void method971(int arg0) {
	int i = aStream_1466.method1739(true);
	anIntArray1468[arg0] += i;
    }
    
    public void method972(int arg0) {
	anIntArray1473[arg0] = aStream_1466.offset;
    }
    
    public int method973() {
	return anIntArray1473.length;
    }
    
    public int method974(int arg0) {
	int i = (aStream_1466.data
		 [aStream_1466.offset]);
	if (i < 0) {
	    i &= 0xff;
	    anIntArray1467[arg0] = i;
	    aStream_1466.offset++;
	} else
	    i = anIntArray1467[arg0];
	if (i == 240 || i == 247) {
	    int i_9_ = aStream_1466.method1739(true);
	    if (i == 247 && i_9_ > 0) {
		int i_10_ = ((aStream_1466.data
			      [aStream_1466.offset])
			     & 0xff);
		if (i_10_ >= 241 && i_10_ <= 243 || i_10_ == 246
		    || i_10_ == 248 || i_10_ >= 250 && i_10_ <= 252
		    || i_10_ == 254) {
		    aStream_1466.offset++;
		    anIntArray1467[arg0] = i_10_;
		    return method965(arg0, i_10_);
		}
	    }
	    aStream_1466.offset += i_9_;
	    return 0;
	}
	return method965(arg0, i);
    }
    
    public int method975() {
	int i = anIntArray1473.length;
	int i_11_ = -1;
	int i_12_ = 2147483647;
	for (int i_13_ = 0; i_13_ < i; i_13_++) {
	    if (anIntArray1473[i_13_] >= 0 && anIntArray1468[i_13_] < i_12_) {
		i_11_ = i_13_;
		i_12_ = anIntArray1468[i_13_];
	    }
	}
	return i_11_;
    }
    
    public void method976(int arg0) {
	aStream_1466.offset = anIntArray1473[arg0];
    }
    
    public void method977(long arg0) {
	aLong1469 = arg0;
	int i = anIntArray1473.length;
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    anIntArray1468[i_14_] = 0;
	    anIntArray1467[i_14_] = 0;
	    aStream_1466.offset = anIntArray1471[i_14_];
	    method971(i_14_);
	    anIntArray1473[i_14_] = aStream_1466.offset;
	}
    }
    
    public Class114() {
	aStream_1466 = new Stream(null);
    }
    
    public Class114(byte[] arg0) {
	aStream_1466 = new Stream(null);
	method962(arg0);
    }
}
