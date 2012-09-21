/* Class1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub3 extends Class1
{
    public Class31 aClass31_3512;
    public int anInt3513;
    public long aLong3514;
    public int anInt3515;
    public int anInt3516;
    public int anInt3517;
    public static int anInt3518;
    public int anInt3519;
    public int anInt3520;
    public int anInt3521;
    public Class50 aClass50_3522;
    public int anInt3523;
    public int anInt3524;
    public int anInt3525;
    public boolean aBoolean3526 = false;
    public static int anInt3527;
    public static int anInt3528;
    public int anInt3529;
    public int anInt3530;
    public static int anInt3531;
    public Class41 aClass41_3532;
    public boolean aBoolean3533 = false;
    public int anInt3534;
    public int anInt3535;
    public static int anInt3536;
    public int anInt3537 = 0;
    public int anInt3538;
    public int anInt3539;
    public int anInt3540;
    public int anInt3541;
    public Class1_Sub6 aClass1_Sub6_3542;
    public int anInt3543;
    public int anInt3544;
    
    public void method105(long arg0, int arg1) {
	do {
	    try {
		for (Class1_Sub7_Sub1_Sub1 class1_sub7_sub1_sub1
			 = ((Class1_Sub7_Sub1_Sub1)
			    aClass50_3522.method586((byte) 42));
		     class1_sub7_sub1_sub1 != null;
		     class1_sub7_sub1_sub1
			 = (Class1_Sub7_Sub1_Sub1) aClass50_3522.method589(87))
		    class1_sub7_sub1_sub1.method138(arg0);
		anInt3527++;
		if (arg1 == 721491592)
		    break;
		method106(-5);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("js.A(" + arg0 + ','
						     + arg1 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method106(int arg0) {
	try {
	    anInt3517 = aClass41_3532.anInt555;
	    if (arg0 == -24415) {
		anInt3518++;
		anInt3513 = aClass41_3532.anInt536;
		anInt3519 = aClass41_3532.anInt547;
		anInt3544 = aClass41_3532.anInt535;
		anInt3523 = aClass41_3532.anInt549;
		anInt3541 = aClass41_3532.anInt541;
		anInt3538 = aClass41_3532.anInt543;
		anInt3516 = aClass41_3532.anInt554;
		anInt3529 = aClass41_3532.anInt538;
		if (anInt3538 == anInt3513
		    && (anInt3538 ^ 0xffffffff) == (anInt3544 ^ 0xffffffff)
		    && anInt3541 == anInt3529 && anInt3529 == anInt3517
		    && anInt3519 == anInt3523 && anInt3519 == anInt3516)
		    aBoolean3533 = true;
		else {
		    aBoolean3533 = false;
		    int i = (anInt3538 + (anInt3513 - -anInt3544)) / 3;
		    int i_0_ = (anInt3529 + anInt3541 + anInt3517) / 3;
		    int i_1_ = (anInt3523 + anInt3519 - -anInt3516) / 3;
		    if ((i ^ 0xffffffff) != (anInt3543 ^ 0xffffffff)
			|| anInt3515 != i_0_ || i_1_ != anInt3530) {
			anInt3530 = i_1_;
			anInt3543 = i;
			anInt3515 = i_0_;
			int i_2_ = anInt3538 + -anInt3513;
			int i_3_ = anInt3529 - anInt3541;
			int i_4_ = anInt3519 + -anInt3523;
			int i_5_ = -anInt3513 + anInt3544;
			int i_6_ = -anInt3541 + anInt3517;
			int i_7_ = -anInt3523 + anInt3516;
			anInt3520 = i_4_ * i_5_ - i_7_ * i_2_;
			anInt3525 = i_7_ * i_3_ + -(i_4_ * i_6_);
			for (anInt3535 = i_6_ * i_2_ + -(i_5_ * i_3_);
			     (anInt3525 > 32767 || anInt3520 > 32767
			      || anInt3535 > 32767 || anInt3525 < -32767
			      || anInt3520 < -32767
			      || (anInt3535 ^ 0xffffffff) > 32766);
			     anInt3535 >>= 1) {
			    anInt3525 >>= 1;
			    anInt3520 >>= 1;
			}
			int i_8_
			    = (int) Math.sqrt((double) (anInt3520 * anInt3520
							+ ((anInt3525
							    * anInt3525)
							   + (anInt3535
							      * anInt3535))));
			if ((i_8_ ^ 0xffffffff) >= -1)
			    i_8_ = 1;
			anInt3520 = anInt3520 * 32767 / i_8_;
			anInt3535 = anInt3535 * 32767 / i_8_;
			anInt3525 = 32767 * anInt3525 / i_8_;
			if (aClass31_3512.aShort391 > 0
			    || aClass31_3512.aShort402 > 0) {
			    int i_9_
				= (int) (2607.5945876176133
					 * Math.atan2((double) anInt3535,
						      (double) anInt3525));
			    int i_10_
				= (int) (2607.5945876176133
					 * (Math.atan2
					    ((double) anInt3520,
					     (Math.sqrt
					      ((double) (anInt3535 * anInt3535
							 + (anInt3525
							    * anInt3525)))))));
			    anInt3540 = (-aClass31_3512.aShort378
					 + aClass31_3512.aShort391);
			    anInt3539 = (aClass31_3512.aShort402
					 + -aClass31_3512.aShort411);
			    anInt3524 = (-(anInt3540 >> 410824897)
					 + (i_9_ - -aClass31_3512.aShort378));
			    anInt3534 = (aClass31_3512.aShort411 + i_10_
					 - (anInt3539 >> -780579103));
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"js.C(" + arg0 + ')');
	}
    }
    
    public void method107(Class130 arg0, int arg1, boolean arg2, long arg3,
			  int arg4) {
	try {
	    anInt3531++;
	    if (aBoolean3526)
		arg2 = false;
	    else if (aClass31_3512.anInt416 > Class82.anInt1085)
		arg2 = false;
	    else if ((Class120.anInt1575 ^ 0xffffffff)
		     >= (Class68.anIntArray922[Class82.anInt1085]
			 ^ 0xffffffff)) {
		if (!aBoolean3533) {
		    if ((aClass31_3512.anInt409 ^ 0xffffffff) != 0) {
			int i = (int) (arg3 + -aLong3514);
			if (aClass31_3512.aBoolean380
			    || (i ^ 0xffffffff) >= (aClass31_3512.anInt409
						    ^ 0xffffffff))
			    i %= aClass31_3512.anInt409;
			else
			    arg2 = false;
			if (!aClass31_3512.aBoolean401
			    && (i ^ 0xffffffff) > (aClass31_3512.anInt392
						   ^ 0xffffffff))
			    arg2 = false;
			if (aClass31_3512.aBoolean401
			    && i >= aClass31_3512.anInt392)
			    arg2 = false;
		    }
		} else
		    arg2 = false;
	    } else
		arg2 = false;
	    if (arg2) {
		anInt3537 += (int) (((double) aClass31_3512.anInt433
				     + (Math.random()
					* (double) (aClass31_3512.anInt421
						    - aClass31_3512.anInt433)))
				    * (double) arg1);
		if ((anInt3537 ^ 0xffffffff) < -64) {
		    int i = anInt3537 >> -1821380218;
		    anInt3537 &= 0x3f;
		    for (int i_11_ = 0; i_11_ < i; i_11_++) {
			int i_12_;
			int i_13_;
			int i_14_;
			if (aClass31_3512.aShort391 <= 0
			    && aClass31_3512.aShort402 <= 0) {
			    i_14_ = anInt3535;
			    i_13_ = anInt3520;
			    i_12_ = anInt3525;
			} else {
			    int i_15_
				= ((int) (Math.random() * (double) anInt3540)
				   + anInt3524);
			    i_15_ &= 0x3fff;
			    int i_16_ = Class31.anIntArray434[i_15_];
			    int i_17_ = Class31.anIntArray425[i_15_];
			    int i_18_ = anInt3534 - -(int) ((double) anInt3539
							    * Math.random());
			    i_18_ &= 0x1fff;
			    int i_19_ = Class31.anIntArray434[i_18_];
			    int i_20_ = Class31.anIntArray425[i_18_];
			    i_12_ = i_17_ * i_19_ >> -1973629137;
			    i_13_ = i_20_ * -1;
			    i_14_ = i_16_ * i_19_ >> -210771985;
			}
			int i_21_ = (int) (Math.random() * 65535.0);
			int i_22_ = (int) (Math.random() * 65535.0);
			if (i_21_ - -i_22_ > 65535) {
			    i_21_ = -i_21_ + 65535;
			    i_22_ = -i_22_ + 65535;
			}
			int i_23_ = 65535 - i_21_ - i_22_;
			int i_24_ = ((i_21_ * anInt3513 - -(anInt3538 * i_22_)
				      - -(i_23_ * anInt3544))
				     >> 771866352);
			int i_25_
			    = (i_23_ * anInt3517 + (anInt3541 * i_21_
						    - -(i_22_ * anInt3529))
			       >> -1642457360);
			int i_26_ = (i_23_ * anInt3516 + (anInt3519 * i_22_
							  + i_21_ * anInt3523)
				     >> -882221296);
			int i_27_
			    = (aClass31_3512.anInt436
			       - -(int) ((double) (-aClass31_3512.anInt436
						   + aClass31_3512.anInt435)
					 * Math.random()));
			int i_28_
			    = (aClass31_3512.anInt384
			       - -(int) (Math.random()
					 * (double) (aClass31_3512.anInt410
						     + -(aClass31_3512
							 .anInt384))));
			int i_29_
			    = (aClass31_3512.anInt400
			       - -(int) ((double) (aClass31_3512.anInt369
						   - aClass31_3512.anInt400)
					 * Math.random()));
			int i_30_;
			if (!aClass31_3512.aBoolean368)
			    i_30_
				= (((int) (((double) aClass31_3512.anInt418
					    * Math.random())
					   + (double) aClass31_3512.anInt422)
				    << -424482632)
				   | ((int) ((double) aClass31_3512.anInt390
					     + ((double) aClass31_3512.anInt389
						* Math.random()))
				      | (((int) ((double) (aClass31_3512
							   .anInt404)
						 + ((double) (aClass31_3512
							      .anInt379)
						    * Math.random()))
					  << -1405334576)
					 | ((int) (((double) (aClass31_3512
							      .anInt387)
						    * Math.random())
						   + (double) (aClass31_3512
							       .anInt412))
					    << 2089408776))));
			else {
			    double d = Math.random();
			    i_30_
				= ((int) ((double) aClass31_3512.anInt389 * d
					  + (double) aClass31_3512.anInt390)
				   | (((int) (((double) aClass31_3512.anInt387
					       * d)
					      + (double) (aClass31_3512
							  .anInt412))
				       << 721491592)
				      | ((int) ((double) aClass31_3512.anInt404
						+ d * (double) (aClass31_3512
								.anInt379))
					 << 1001255280))
				   | (int) ((double) aClass31_3512.anInt422
					    + ((double) aClass31_3512.anInt418
					       * d)) << -503540712);
			}
			int i_31_ = aClass31_3512.anInt370;
			if (!arg0.method1220() && !aClass31_3512.aBoolean428)
			    i_31_ = -1;
			if (Class131_Sub20.anInt4421 != Class155.anInt2067) {
			    Class1_Sub7_Sub1_Sub1 class1_sub7_sub1_sub1
				= (Class189.aClass1_Sub7_Sub1_Sub1Array2763
				   [Class131_Sub20.anInt4421]);
			    Class131_Sub20.anInt4421
				= 1 + Class131_Sub20.anInt4421 & 0x3ff;
			    class1_sub7_sub1_sub1.method137
				(this, i_24_, i_25_, i_26_, i_12_, i_13_,
				 i_14_, i_27_, i_28_, i_30_, i_29_, i_31_,
				 aClass31_3512.aBoolean406);
			} else {
			    Class1_Sub7_Sub1_Sub1 class1_sub7_sub1_sub1
				= (new Class1_Sub7_Sub1_Sub1
				   (this, i_24_, i_25_, i_26_, i_12_, i_13_,
				    i_14_, i_27_, i_28_, i_30_, i_29_, i_31_,
				    aClass31_3512.aBoolean406));
			}
		    }
		}
	    }
	    anInt3521 = 0;
	    if (arg4 != 65535)
		method106(-120);
	    for (Class1_Sub7_Sub1_Sub1 class1_sub7_sub1_sub1
		     = ((Class1_Sub7_Sub1_Sub1)
			aClass50_3522.method586((byte) 42));
		 class1_sub7_sub1_sub1 != null;
		 class1_sub7_sub1_sub1
		     = (Class1_Sub7_Sub1_Sub1) aClass50_3522.method589(-88)) {
		class1_sub7_sub1_sub1.method136(arg3, arg1);
		anInt3521++;
	    }
	    Class131_Sub18.anInt4385 += anInt3521;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("js.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ',' + arg4
						 + ')'));
	}
    }
    
    public Class1_Sub3(Class130 arg0, Class41 arg1, Class1_Sub6 arg2,
		       long arg3) {
	try {
	    aClass1_Sub6_3542 = arg2;
	    aClass41_3532 = arg1;
	    aLong3514 = arg3;
	    aClass31_3512
		= Class53.method604((byte) 117, aClass41_3532.anInt537);
	    if (!arg0.method1220() && aClass31_3512.anInt371 != -1)
		aClass31_3512
		    = Class53.method604((byte) 119, aClass31_3512.anInt371);
	    aClass50_3522 = new Class50();
	    anInt3537 += Math.random() * 64.0;
	    method106(-24415);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("js.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3
			+ ')'));
	}
    }
}
