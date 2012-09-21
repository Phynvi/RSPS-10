/* Class100_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100_Sub1 extends Class100
{
    public long aLong3871;
    public long aLong3872 = 0L;
    public int anInt3873;
    public int anInt3874;
    public long[] aLongArray3875;
    public long aLong3876;
    
    public int method876(int arg0, int arg1) {
	try {
	    int i = 66 % ((arg1 - -11) / 35);
	    long l = 1000000L * (long) arg0;
	    aLong3872 += method881(1);
	    if ((aLong3871 ^ 0xffffffffffffffffL)
		>= (aLong3872 ^ 0xffffffffffffffffL)) {
		int i_0_ = 0;
		do
		    aLong3871 += l;
		while ((++i_0_ ^ 0xffffffff) > -11
		       && ((aLong3871 ^ 0xffffffffffffffffL)
			   > (aLong3872 ^ 0xffffffffffffffffL)));
		if (aLong3872 > aLong3871)
		    aLong3871 = aLong3872;
		return i_0_;
	    }
	    Class187.method2575(-23, (-aLong3872 + aLong3871) / 1000000L);
	    aLong3876 += -aLong3872 + aLong3871;
	    aLong3872 += -aLong3872 + aLong3871;
	    aLong3871 += l;
	    return 1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public long method881(int arg0) {
	try {
	    long l = Class208.method2749(-3913) * 1000000L;
	    long l_1_ = -aLong3876 + l;
	    aLong3876 = l;
	    if ((l_1_ ^ 0xffffffffffffffffL) < 4999999999L
		&& (l_1_ ^ 0xffffffffffffffffL) > -5000000001L) {
		aLongArray3875[anInt3873] = l_1_;
		anInt3873 = (anInt3873 + 1) % 10;
		if ((anInt3874 ^ 0xffffffff) > -11)
		    anInt3874++;
	    }
	    long l_2_ = 0L;
	    for (int i = arg0; i <= anInt3874; i++)
		l_2_ += aLongArray3875[(10 + (anInt3873 - i)) % 10];
	    return l_2_ / (long) anInt3874;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public long method880(int arg0) {
	try {
	    if (arg0 != 30786)
		return -18L;
	    return aLong3872;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method874(int arg0) {
	aLong3876 = 0L;
	int i = -119 / ((arg0 - 9) / 63);
	if (aLong3871 > aLong3872)
	    aLong3872 += aLong3871 - aLong3872;
    }
    
    public Class100_Sub1() {
	aLong3871 = 0L;
	anInt3873 = 0;
	aLongArray3875 = new long[10];
	aLong3876 = 0L;
	anInt3874 = 1;
    }
}
