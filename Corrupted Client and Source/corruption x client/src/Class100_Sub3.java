/* Class100_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

public class Class100_Sub3 extends Class100
{
    public long aLong3883 = 0L;
    public long aLong3884 = 0L;
    public long aLong3885;
    public long[] aLongArray3886;
    public int anInt3887 = 1;
    public int anInt3888;
    
    public long method883(int arg0) {
	try {
	    long l = jagmisc.nanoTime();
	    long l_0_ = l + -aLong3885;
	    aLong3885 = l;
	    if (l_0_ > -5000000000L
		&& (l_0_ ^ 0xffffffffffffffffL) > -5000000001L) {
		aLongArray3886[anInt3888] = l_0_;
		anInt3888 = (anInt3888 + 1) % 10;
		if (anInt3887 < 1)
		    anInt3887++;
	    }
	    long l_1_ = 0L;
	    if (arg0 >= -98)
		method874(9);
	    for (int i = 1; anInt3887 >= i; i++)
		l_1_ += aLongArray3886[(anInt3888 - (i + -10)) % 10];
	    return l_1_ / (long) anInt3887;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public long method880(int arg0) {
	try {
	    if (arg0 != 30786)
		return 79L;
	    return aLong3884;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public int method876(int arg0, int arg1) {
	try {
	    long l = (long) arg0 * 1000000L;
	    int i = 36 % ((arg1 - -11) / 35);
	    aLong3884 += method883(-117);
	    if (aLong3883 > aLong3884) {
		Class187.method2575(-108, (aLong3883 + -aLong3884) / 1000000L);
		aLong3885 += -aLong3884 + aLong3883;
		aLong3884 += -aLong3884 + aLong3883;
		aLong3883 += l;
		return 1;
	    }
	    int i_2_ = 0;
	    do {
		i_2_++;
		aLong3883 += l;
	    } while ((i_2_ ^ 0xffffffff) > -11
		     && ((aLong3884 ^ 0xffffffffffffffffL)
			 < (aLong3883 ^ 0xffffffffffffffffL)));
	    if ((aLong3884 ^ 0xffffffffffffffffL)
		< (aLong3883 ^ 0xffffffffffffffffL))
		aLong3883 = aLong3884;
	    return i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method874(int arg0) {
	try {
	    aLong3885 = 0L;
	    if ((aLong3883 ^ 0xffffffffffffffffL)
		< (aLong3884 ^ 0xffffffffffffffffL))
		aLong3884 += -aLong3884 + aLong3883;
	    int i = 58 / ((arg0 - 9) / 63);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class100_Sub3() {
	aLong3885 = 0L;
	aLongArray3886 = new long[10];
	anInt3888 = 0;
	aLong3883 = aLong3884 = jagmisc.nanoTime();
	if ((aLong3884 ^ 0xffffffffffffffffL) == -1L)
	    throw new RuntimeException();
    }
}
