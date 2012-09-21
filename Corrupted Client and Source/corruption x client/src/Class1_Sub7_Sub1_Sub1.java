/* Class1_Sub7_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub7_Sub1_Sub1 extends Class1_Sub7_Sub1
{
    public int anInt6460;
    public short aShort6461;
    public short aShort6462;
    public short aShort6463;
    public Class1_Sub3 aClass1_Sub3_6464;
    public short aShort6465;
    public int anInt6466;
    public short aShort6467;
    public short aShort6468;
    
    public void method135() {
	aClass1_Sub3_6464.aClass1_Sub6_3542.aClass1_Sub7_Sub1_Sub1Array3566
	    [aShort6463]
	    = null;
	Class189.aClass1_Sub7_Sub1_Sub1Array2763[Class155.anInt2067] = this;
	Class155.anInt2067 = Class155.anInt2067 + 1 & 0x3ff;
	this.method95((byte) 71);
	this.method129(5);
    }
    
    public void method136(long arg0, int arg1) {
	aShort6465 -= arg1;
	if (aShort6465 <= 0)
	    method135();
	else {
	    int i = anInt5215 >> Class202.anInt2949;
	    int i_0_ = anInt5219 >> Class202.anInt2949;
	    int i_1_ = anInt5211 >> Class202.anInt2949;
	    Class1_Sub6 class1_sub6 = aClass1_Sub3_6464.aClass1_Sub6_3542;
	    Class31 class31 = aClass1_Sub3_6464.aClass31_3512;
	    if (class31.anInt382 != 0) {
		if (aShort6467 - aShort6465 <= class31.anInt430) {
		    int i_2_
			= ((anInt5214 >> 8 & 0xff00) + (anInt6460 >> 16 & 0xff)
			   + class31.anInt437 * arg1);
		    int i_3_ = ((anInt5214 & 0xff00) + (anInt6460 >> 8 & 0xff)
				+ class31.anInt407 * arg1);
		    int i_4_ = ((anInt5214 << 8 & 0xff00) + (anInt6460 & 0xff)
				+ class31.anInt396 * arg1);
		    if (i_2_ < 0)
			i_2_ = 0;
		    else if (i_2_ > 65535)
			i_2_ = 65535;
		    if (i_3_ < 0)
			i_3_ = 0;
		    else if (i_3_ > 65535)
			i_3_ = 65535;
		    if (i_4_ < 0)
			i_4_ = 0;
		    else if (i_4_ > 65535)
			i_4_ = 65535;
		    anInt5214 &= ~0xffffff;
		    anInt5214 |= (((i_2_ & 0xff00) << 8) + (i_3_ & 0xff00)
				  + ((i_4_ & 0xff00) >> 8));
		    anInt6460 &= ~0xffffff;
		    anInt6460 |= (((i_2_ & 0xff) << 16) + ((i_3_ & 0xff) << 8)
				  + (i_4_ & 0xff));
		}
		if (aShort6467 - aShort6465 <= class31.anInt408) {
		    int i_5_ = ((anInt5214 >> 16 & 0xff00)
				+ (anInt6460 >> 24 & 0xff)
				+ class31.anInt383 * arg1);
		    if (i_5_ < 0)
			i_5_ = 0;
		    else if (i_5_ > 65535)
			i_5_ = 65535;
		    anInt5214 &= 0xffffff;
		    anInt5214 |= (i_5_ & 0xff00) << 16;
		    anInt6460 &= 0xffffff;
		    anInt6460 |= (i_5_ & 0xff) << 24;
		}
	    }
	    if (class31.anInt395 != -1
		&& aShort6467 - aShort6465 <= class31.anInt381)
		anInt6466 += class31.anInt376 * arg1;
	    if (class31.anInt377 != -1
		&& aShort6467 - aShort6465 <= class31.anInt417)
		anInt5210 += class31.anInt431 * arg1;
	    int i_6_ = aShort6461;
	    int i_7_ = aShort6462;
	    int i_8_ = aShort6468;
	    boolean bool = false;
	    if (class31.anInt420 == 1) {
		int i_9_ = i - aClass1_Sub3_6464.anInt3543;
		int i_10_ = i_0_ - aClass1_Sub3_6464.anInt3515;
		int i_11_ = i_1_ - aClass1_Sub3_6464.anInt3530;
		int i_12_
		    = (int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_
						+ i_11_ * i_11_));
		long l = (long) (class31.anInt415 * i_12_ * arg1);
		anInt6466 -= (long) anInt6466 * l >> 18;
	    } else if (class31.anInt420 == 2) {
		int i_13_ = i - aClass1_Sub3_6464.anInt3543;
		int i_14_ = i_0_ - aClass1_Sub3_6464.anInt3515;
		int i_15_ = i_1_ - aClass1_Sub3_6464.anInt3530;
		int i_16_ = i_13_ * i_13_ + i_14_ * i_14_ + i_15_ * i_15_;
		long l = (long) (class31.anInt415 * i_16_ * arg1);
		anInt6466 -= (long) anInt6466 * l >> 28;
	    }
	    if (class31.anIntArray419 != null) {
		Class131 class131 = class1_sub6.aClass119_3572.aClass131_1553;
		for (Class131 class131_17_ = class131.aClass131_1783;
		     class131_17_ != class131;
		     class131_17_ = class131_17_.aClass131_1783) {
		    Class131_Sub41_Sub12 class131_sub41_sub12
			= (Class131_Sub41_Sub12) class131_17_;
		    Class107 class107 = class131_sub41_sub12.aClass107_6317;
		    if (class107.anInt1398 != 1) {
			boolean bool_18_ = false;
			for (int i_19_ = 0;
			     i_19_ < class31.anIntArray419.length; i_19_++) {
			    if (class31.anIntArray419[i_19_]
				== class107.anInt1383) {
				bool_18_ = true;
				break;
			    }
			}
			if (bool_18_) {
			    int i_20_ = i - class131_sub41_sub12.anInt6314;
			    int i_21_ = i_0_ - class131_sub41_sub12.anInt6311;
			    int i_22_ = i_1_ - class131_sub41_sub12.anInt6307;
			    long l = (long) (i_20_ * i_20_ + i_21_ * i_21_
					     + i_22_ * i_22_);
			    if (l <= class107.aLong1390) {
				int i_23_ = (int) Math.sqrt((double) l);
				if (i_23_ == 0)
				    i_23_ = 1;
				long l_24_
				    = ((long) (i_20_ * (class131_sub41_sub12
							.anInt6313)
					       + i_21_ * class107.anInt1384
					       + i_22_ * (class131_sub41_sub12
							  .anInt6319))
				       * 65535L
				       / (long) (class107.anInt1396 * i_23_));
				if (l_24_ >= (long) class107.anInt1403) {
				    int i_25_ = 0;
				    if (class107.anInt1387 == 1)
					i_25_ = ((i_23_ >> 4)
						 * class107.anInt1395);
				    else if (class107.anInt1387 == 2)
					i_25_ = ((i_23_ >> 4) * (i_23_ >> 4)
						 * class107.anInt1395);
				    if (class107.anInt1386 == 0) {
					if (class107.anInt1388 == 0) {
					    i_6_ += ((class131_sub41_sub12
						      .anInt6313)
						     - i_25_) * arg1;
					    i_7_ += (class107.anInt1384
						     - i_25_) * arg1;
					    i_8_ += ((class131_sub41_sub12
						      .anInt6319)
						     - i_25_) * arg1;
					    bool = true;
					} else {
					    anInt5215 += ((class131_sub41_sub12
							   .anInt6313)
							  - i_25_) * arg1;
					    anInt5219 += (class107.anInt1384
							  - i_25_) * arg1;
					    anInt5211 += ((class131_sub41_sub12
							   .anInt6319)
							  - i_25_) * arg1;
					}
				    } else {
					int i_26_ = ((i_20_ << 15) / i_23_
						     * class107.anInt1396);
					int i_27_ = ((i_21_ << 15) / i_23_
						     * class107.anInt1396);
					int i_28_ = ((i_22_ << 15) / i_23_
						     * class107.anInt1396);
					if (class107.anInt1388 == 0) {
					    i_6_ += i_26_ * arg1 >> 15;
					    i_7_ += i_27_ * arg1 >> 15;
					    i_8_ += i_28_ * arg1 >> 15;
					    bool = true;
					} else {
					    anInt5215 += i_26_ * arg1 >> 15;
					    anInt5219 += i_27_ * arg1 >> 15;
					    anInt5211 += i_28_ * arg1 >> 15;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class31.anIntArray385 != null) {
		for (int i_29_ = 0; i_29_ < class31.anIntArray385.length;
		     i_29_++) {
		    Class131_Sub41_Sub12 class131_sub41_sub12
			= ((Class131_Sub41_Sub12)
			   (Class50.aClass181_663.method2531
			    (114, (long) class31.anIntArray385[i_29_])));
		    while (class131_sub41_sub12 != null) {
			Class107 class107
			    = class131_sub41_sub12.aClass107_6317;
			int i_30_ = i - class131_sub41_sub12.anInt6314;
			int i_31_ = i_0_ - class131_sub41_sub12.anInt6311;
			int i_32_ = i_1_ - class131_sub41_sub12.anInt6307;
			long l = (long) (i_30_ * i_30_ + i_31_ * i_31_
					 + i_32_ * i_32_);
			if (l > class107.aLong1390)
			    class131_sub41_sub12
				= ((Class131_Sub41_Sub12)
				   Class50.aClass181_663.method2530(46));
			else {
			    int i_33_ = (int) Math.sqrt((double) l);
			    if (i_33_ == 0)
				i_33_ = 1;
			    long l_34_
				= ((long) ((i_30_
					    * class131_sub41_sub12.anInt6313)
					   + i_31_ * class107.anInt1384
					   + i_32_ * (class131_sub41_sub12
						      .anInt6319))
				   * 65535L
				   / (long) (class107.anInt1396 * i_33_));
			    if (l_34_ < (long) class107.anInt1403)
				class131_sub41_sub12
				    = ((Class131_Sub41_Sub12)
				       Class50.aClass181_663.method2530(49));
			    else {
				int i_35_ = 0;
				if (class107.anInt1387 == 1)
				    i_35_ = (i_33_ >> 4) * class107.anInt1395;
				else if (class107.anInt1387 == 2)
				    i_35_ = ((i_33_ >> 4) * (i_33_ >> 4)
					     * class107.anInt1395);
				if (class107.anInt1386 == 0) {
				    if (class107.anInt1388 == 0) {
					i_6_ += (class131_sub41_sub12.anInt6313
						 - i_35_) * arg1;
					i_7_ += ((class107.anInt1384 - i_35_)
						 * arg1);
					i_8_ += (class131_sub41_sub12.anInt6319
						 - i_35_) * arg1;
					bool = true;
				    } else {
					anInt5215
					    += (class131_sub41_sub12.anInt6313
						- i_35_) * arg1;
					anInt5219 += (class107.anInt1384
						      - i_35_) * arg1;
					anInt5211
					    += (class131_sub41_sub12.anInt6319
						- i_35_) * arg1;
				    }
				} else {
				    int i_36_ = ((i_30_ << 15) / i_33_
						 * class107.anInt1396);
				    int i_37_ = ((i_31_ << 15) / i_33_
						 * class107.anInt1396);
				    int i_38_ = ((i_32_ << 15) / i_33_
						 * class107.anInt1396);
				    if (class107.anInt1388 == 0) {
					i_6_ += i_36_ * arg1 >> 15;
					i_7_ += i_37_ * arg1 >> 15;
					i_8_ += i_38_ * arg1 >> 15;
					bool = true;
				    } else {
					anInt5215 += i_36_ * arg1 >> 15;
					anInt5219 += i_37_ * arg1 >> 15;
					anInt5211 += i_38_ * arg1 >> 15;
				    }
				}
				class131_sub41_sub12
				    = ((Class131_Sub41_Sub12)
				       Class50.aClass181_663.method2530(98));
			    }
			}
		    }
		}
	    }
	    if (class31.anIntArray405 != null) {
		if (class31.anIntArray439 == null) {
		    class31.anIntArray439
			= new int[class31.anIntArray405.length];
		    for (int i_39_ = 0; i_39_ < class31.anIntArray405.length;
			 i_39_++) {
			Class131_Sub2_Sub28.method1609((class31.anIntArray405
							[i_39_]),
						       (byte) -105);
			class31.anIntArray439[i_39_]
			    = (((Class131_Sub24)
				(Class87.aClass180_1142.method2521
				 (-54, (long) class31.anIntArray405[i_39_])))
			       .anInt4465);
		    }
		}
		for (int i_40_ = 0; i_40_ < class31.anIntArray439.length;
		     i_40_++) {
		    Class107 class107 = (Class166.aClass107Array2219
					 [class31.anIntArray439[i_40_]]);
		    if (class107.anInt1388 == 0) {
			i_6_ += class107.anInt1400 * arg1;
			i_7_ += class107.anInt1384 * arg1;
			i_8_ += class107.anInt1393 * arg1;
			bool = true;
		    } else {
			anInt5215 += class107.anInt1400 * arg1;
			anInt5219 += class107.anInt1384 * arg1;
			anInt5211 += class107.anInt1393 * arg1;
		    }
		}
	    }
	    if (bool) {
		while (i_6_ > 32767 || i_7_ > 32767 || i_8_ > 32767
		       || i_6_ < -32767 || i_7_ < -32767 || i_8_ < -32767) {
		    i_6_ >>= 1;
		    i_7_ >>= 1;
		    i_8_ >>= 1;
		    anInt6466 <<= 1;
		}
		aShort6461 = (short) i_6_;
		aShort6462 = (short) i_7_;
		aShort6468 = (short) i_8_;
	    }
	    anInt5215
		+= ((long) aShort6461 * (long) anInt6466 >> 23) * (long) arg1;
	    anInt5219
		+= ((long) aShort6462 * (long) anInt6466 >> 23) * (long) arg1;
	    anInt5211
		+= ((long) aShort6468 * (long) anInt6466 >> 23) * (long) arg1;
	}
    }
    
    public void method137(Class1_Sub3 arg0, int arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9, int arg10, int arg11, boolean arg12) {
	aClass1_Sub3_6464 = arg0;
	anInt5215 = arg1 << Class202.anInt2949;
	anInt5219 = arg2 << Class202.anInt2949;
	anInt5211 = arg3 << Class202.anInt2949;
	anInt5214 = arg9;
	aShort6467 = aShort6465 = (short) arg8;
	anInt5210 = arg10;
	anInt5207 = arg11;
	aShort6461 = (short) arg4;
	aShort6462 = (short) arg5;
	aShort6468 = (short) arg6;
	anInt6466 = arg7;
	aByte5218 = aClass1_Sub3_6464.aClass41_3532.aByte550;
	method139();
    }
    
    public void method138(long arg0) {
	int i = anInt5215 >> 19;
	int i_41_ = anInt5211 >> 19;
	int i_42_ = anInt5219 >> Class202.anInt2949;
	if (i_42_ > 0 || i_42_ < -65535 || i < 0 || i >= Class210.anInt3068
	    || i_41_ < 0 || i_41_ >= Class131_Sub8_Sub1.anInt6099)
	    method135();
	else {
	    Class1_Sub6 class1_sub6 = aClass1_Sub3_6464.aClass1_Sub6_3542;
	    Class31 class31 = aClass1_Sub3_6464.aClass31_3512;
	    Class68[] class68s = Class75.aClass68Array1023;
	    int i_43_ = class68s[class1_sub6.anInt3573].method712(i, i_41_);
	    int i_44_;
	    if (class1_sub6.anInt3573 < 3)
		i_44_
		    = class68s[class1_sub6.anInt3573 + 1].method712(i, i_41_);
	    else
		i_44_ = i_43_ - 1024;
	    if (class31.aBoolean394) {
		if (class31.anInt397 == -1 && i_42_ > i_43_) {
		    method135();
		    return;
		}
		if (class31.anInt397 >= 0
		    && i_42_ > class68s[class31.anInt397].method712(i,
								    i_41_)) {
		    method135();
		    return;
		}
		if (class31.anInt413 == -1 && i_42_ < i_44_) {
		    method135();
		    return;
		}
		if (class31.anInt413 >= 0
		    && i_42_ < class68s[class31.anInt413 + 1]
				   .method712(i, i_41_)) {
		    method135();
		    return;
		}
	    }
	    if (i < class1_sub6.anInt3578 || i > class1_sub6.anInt3574
		|| i_41_ < class1_sub6.anInt3579
		|| i_41_ > class1_sub6.anInt3574 || i_42_ > i_43_
		|| i_42_ < i_44_) {
		int i_45_ = 3;
		if (i_42_ > class68s[1].method712(i, i_41_))
		    i_45_ = 0;
		else if (i_42_ > class68s[2].method712(i, i_41_))
		    i_45_ = 1;
		else if (i_42_ > class68s[3].method712(i, i_41_))
		    i_45_ = 2;
		else if (i_42_ < class68s[3].method712(i, i_41_) - 1024) {
		    method135();
		    return;
		}
		Class147 class147
		    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i_45_]
		       [i][i_41_]);
		if (class147 == null) {
		    boolean bool
			= ((Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0]
			    [i][i_41_].aClass147_1952)
			   != null);
		    if (i_45_ == 3 && bool) {
			method135();
			return;
		    }
		    for (int i_46_ = 1; i_46_ <= i_45_; i_46_++) {
			if ((Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [i_46_][i][i_41_])
			    == null) {
			    class147
				= Class131_Sub2_Sub29
				      .aClass147ArrayArrayArray5972[i_46_][i]
				      [i_41_]
				= new Class147(i_46_, i, i_41_);
			    if (bool)
				class147.aByte1965++;
			}
		    }
		}
		if (class147.aClass105_1957 == null) {
		    class147.aClass105_1957 = new Class105();
		    class147.aByte1968 = (byte) (int) (arg0 & 0xffL);
		} else if (class147.aByte1968 != (byte) (int) (arg0 & 0xffL)) {
		    class147.aClass105_1957 = new Class105();
		    class147.aByte1968 = (byte) (int) (arg0 & 0xffL);
		}
		class147.aClass105_1957.aClass142_1375.method2138(0, this);
	    } else
		class1_sub6.aClass105_3576.aClass142_1375.method2138(0, this);
	}
    }
    
    public void method139() {
	int i = aClass1_Sub3_6464.aClass1_Sub6_3542.anInt3565;
	if ((aClass1_Sub3_6464.aClass1_Sub6_3542
	     .aClass1_Sub7_Sub1_Sub1Array3566[i])
	    != null)
	    aClass1_Sub3_6464.aClass1_Sub6_3542
		.aClass1_Sub7_Sub1_Sub1Array3566[i].method135();
	aClass1_Sub3_6464.aClass1_Sub6_3542.aClass1_Sub7_Sub1_Sub1Array3566[i]
	    = this;
	aShort6463 = (short) aClass1_Sub3_6464.aClass1_Sub6_3542.anInt3565;
	aClass1_Sub3_6464.aClass1_Sub6_3542.anInt3565 = i + 1 & 0x1fff;
	aClass1_Sub3_6464.aClass50_3522.method584(this, (byte) -128);
    }
    
    public Class1_Sub7_Sub1_Sub1(Class1_Sub3 arg0, int arg1, int arg2,
				 int arg3, int arg4, int arg5, int arg6,
				 int arg7, int arg8, int arg9, int arg10,
				 int arg11, boolean arg12) {
	aClass1_Sub3_6464 = arg0;
	anInt5215 = arg1 << Class202.anInt2949;
	anInt5219 = arg2 << Class202.anInt2949;
	anInt5211 = arg3 << Class202.anInt2949;
	anInt5214 = arg9;
	aShort6467 = aShort6465 = (short) arg8;
	anInt5210 = arg10;
	anInt5207 = arg11;
	aShort6461 = (short) arg4;
	aShort6462 = (short) arg5;
	aShort6468 = (short) arg6;
	anInt6466 = arg7;
	aByte5218 = aClass1_Sub3_6464.aClass41_3532.aByte550;
	method139();
    }
}
