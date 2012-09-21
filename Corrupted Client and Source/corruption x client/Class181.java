/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181
{
    public Class131_Sub41 aClass131_Sub41_2593;
    public Class131_Sub41[] aClass131_Sub41Array2594;
    public static int anInt2595;
    public static int anInt2596;
    public static int anInt2597;
    public static int anInt2598;
    public long aLong2599;
    public static int anInt2600;
    public int anInt2601;
    
    public Class131_Sub41 method2530(int arg0) {
	try {
	    anInt2596++;
	    if (aClass131_Sub41_2593 == null)
		return null;
	    Class131_Sub41 class131_sub41
		= (aClass131_Sub41Array2594
		   [(int) ((long) (-1 + anInt2601) & aLong2599)]);
	    if (arg0 <= 35)
		method2530(117);
	    for (/**/; aClass131_Sub41_2593 != class131_sub41;
		 aClass131_Sub41_2593
		     = aClass131_Sub41_2593.aClass131_Sub41_4668) {
		if ((aLong2599 ^ 0xffffffffffffffffL)
		    == (aClass131_Sub41_2593.aLong4671
			^ 0xffffffffffffffffL)) {
		    Class131_Sub41 class131_sub41_0_ = aClass131_Sub41_2593;
		    aClass131_Sub41_2593
			= aClass131_Sub41_2593.aClass131_Sub41_4668;
		    return class131_sub41_0_;
		}
	    }
	    aClass131_Sub41_2593 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"si.C(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41 method2531(int arg0, long arg1) {
	try {
	    int i = 61 / ((arg0 - -48) / 50);
	    aLong2599 = arg1;
	    anInt2598++;
	    Class131_Sub41 class131_sub41
		= (aClass131_Sub41Array2594
		   [(int) ((long) (anInt2601 + -1) & arg1)]);
	    for (aClass131_Sub41_2593 = class131_sub41.aClass131_Sub41_4668;
		 class131_sub41 != aClass131_Sub41_2593;
		 aClass131_Sub41_2593
		     = aClass131_Sub41_2593.aClass131_Sub41_4668) {
		if (aClass131_Sub41_2593.aLong4671 == arg1) {
		    Class131_Sub41 class131_sub41_1_ = aClass131_Sub41_2593;
		    aClass131_Sub41_2593
			= aClass131_Sub41_2593.aClass131_Sub41_4668;
		    return class131_sub41_1_;
		}
	    }
	    aClass131_Sub41_2593 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("si.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method2532(int arg0, boolean arg1, int arg2,
				  Class173 arg3) {
	if ((arg3.aByte2469 ^ 0xffffffff) != -1) {
	    if (arg3.aByte2469 != 1) {
		if ((arg3.aByte2469 ^ 0xffffffff) != -3) {
		    if ((arg3.aByte2469 ^ 0xffffffff) == -4)
			arg3.anInt2442 = arg0 * arg3.anInt2445 >> 1752323630;
		    else if ((arg3.aByte2469 ^ 0xffffffff) == -5)
			arg3.anInt2442
			    = ((arg0 * arg3.anInt2445 >> -1867352370)
			       + (-arg3.anInt2411 + arg0) / 2);
		    else
			arg3.anInt2442 = (-(arg0 * arg3.anInt2445 >> 327359694)
					  + -arg3.anInt2411 + arg0);
		} else
		    arg3.anInt2442 = -arg3.anInt2411 + arg0 - arg3.anInt2445;
	    } else
		arg3.anInt2442 = arg3.anInt2445 + (arg0 + -arg3.anInt2411) / 2;
	} else
	    arg3.anInt2442 = arg3.anInt2445;
	anInt2600++;
	if (arg3.aByte2311 == 0)
	    arg3.anInt2343 = arg3.anInt2432;
	else if ((arg3.aByte2311 ^ 0xffffffff) == -2)
	    arg3.anInt2343 = arg3.anInt2432 + (arg2 + -arg3.anInt2437) / 2;
	else if (arg3.aByte2311 == 2)
	    arg3.anInt2343 = arg2 - (arg3.anInt2437 - -arg3.anInt2432);
	else if (arg3.aByte2311 != 3) {
	    if (arg3.aByte2311 != 4)
		arg3.anInt2343
		    = -(arg2 * arg3.anInt2432 >> -276051346) + (-arg3.anInt2437
								+ arg2);
	    else
		arg3.anInt2343 = ((arg2 * arg3.anInt2432 >> 1874470670)
				  + (-arg3.anInt2437 + arg2) / 2);
	} else
	    arg3.anInt2343 = arg3.anInt2432 * arg2 >> -1607582322;
	if (arg1 == true) {
	    if (Class23_Sub5.aBoolean3761
		&& (client.method66(arg3).anInt4601 != 0
		    || arg3.anInt2470 == 0)) {
		if (arg3.anInt2442 >= 0) {
		    if ((arg3.anInt2411 + arg3.anInt2442 ^ 0xffffffff)
			< (arg0 ^ 0xffffffff))
			arg3.anInt2442 = -arg3.anInt2411 + arg0;
		} else
		    arg3.anInt2442 = 0;
		if (arg3.anInt2343 >= 0) {
		    if (arg2 < arg3.anInt2437 + arg3.anInt2343)
			arg3.anInt2343 = arg2 + -arg3.anInt2437;
		} else
		    arg3.anInt2343 = 0;
	    }
	}
    }
    
    public static Class128_Sub1 method2533(boolean arg0) {
	try {
	    anInt2597++;
	    Class131_Sub2_Sub7.anInt5633 = 0;
	    if (arg0 != true)
		return null;
	    return Class202.method2726(119);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"si.A(" + arg0 + ')');
	}
    }
    
    public void method2534(boolean arg0, long arg1, Class131_Sub41 arg2) {
	try {
	    anInt2595++;
	    if (arg2.aClass131_Sub41_4677 != null)
		arg2.method1919(-29183);
	    Class131_Sub41 class131_sub41
		= (aClass131_Sub41Array2594
		   [(int) ((long) (-1 + anInt2601) & arg1)]);
	    arg2.aClass131_Sub41_4677 = class131_sub41.aClass131_Sub41_4677;
	    arg2.aClass131_Sub41_4668 = class131_sub41;
	    arg2.aClass131_Sub41_4677.aClass131_Sub41_4668 = arg2;
	    if (arg0 == true) {
		arg2.aClass131_Sub41_4668.aClass131_Sub41_4677 = arg2;
		arg2.aLong4671 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("si.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class181(int arg0) {
	try {
	    anInt2601 = arg0;
	    aClass131_Sub41Array2594 = new Class131_Sub41[arg0];
	    for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++) {
		Class131_Sub41 class131_sub41
		    = aClass131_Sub41Array2594[i] = new Class131_Sub41();
		class131_sub41.aClass131_Sub41_4668 = class131_sub41;
		class131_sub41.aClass131_Sub41_4677 = class131_sub41;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"si.<init>(" + arg0 + ')');
	}
    }
}
