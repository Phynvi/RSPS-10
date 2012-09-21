/* Class154_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class154_Sub2 extends Class154
{
    public boolean aBoolean4855 = false;
    public int anInt4856;
    public int[][] anIntArrayArray4857;
    public int[] anIntArray4858;
    public Class104[] aClass104Array4859;
    public int anInt4860 = 0;
    public short aShort4861;
    public int anInt4862 = 0;
    public Class154_Sub2 aClass154_Sub2_4863;
    public short aShort4864;
    public Class65 aClass65_4865;
    public Class41[] aClass41Array4866;
    public int[] anIntArray4867;
    public int[] anIntArray4868;
    public int[][] anIntArrayArray4869;
    public int[] anIntArray4870;
    public int[] anIntArray4871;
    public boolean aBoolean4872 = false;
    public int[][] anIntArrayArray4873;
    public byte[] aByteArray4874;
    public int[] anIntArray4875;
    public boolean[] aBooleanArray4876;
    public int[] anIntArray4877;
    public byte[] aByteArray4878;
    public short aShort4879;
    public short[] aShortArray4880;
    public int[] anIntArray4881;
    public short aShort4882;
    public int[] anIntArray4883;
    public boolean aBoolean4884 = false;
    public Class154_Sub2 aClass154_Sub2_4885;
    public Class9_Sub2 aClass9_Sub2_4886;
    public Class154_Sub2 aClass154_Sub2_4887;
    public Class130_Sub1 aClass130_Sub1_4888;
    public short aShort4889;
    public int[] anIntArray4890;
    public short aShort4891;
    public int[] anIntArray4892;
    public int[] anIntArray4893;
    public int[] anIntArray4894;
    public int[] anIntArray4895;
    public int[] anIntArray4896;
    public boolean aBoolean4897;
    public int[][] anIntArrayArray4898;
    public int[] anIntArray4899;
    public int[] anIntArray4900;
    public short[] aShortArray4901;
    public int[] anIntArray4902;
    public short[] aShortArray4903;
    public int[] anIntArray4904;
    public static int anInt4905;
    public int anInt4906;
    public static int[] anIntArray4907 = new int[2048];
    public byte[] aByteArray4908;
    public int[] anIntArray4909;
    public int[] anIntArray4910;
    public Class125 aClass125_4911;
    public short[] aShortArray4912;
    public int anInt4913;
    public int anInt4914;
    public short aShort4915;
    public int anInt4916 = 0;
    public int anInt4917 = 0;
    public int[] anIntArray4918;
    public int[] anIntArray4919;
    public Class24[] aClass24Array4920;
    public Class154_Sub2 aClass154_Sub2_4921;
    public Class125 aClass125_4922;
    public int[] anIntArray4923;
    public short[] aShortArray4924;
    public boolean[] aBooleanArray4925;
    public int[] anIntArray4926;
    public int[] anIntArray4927;
    public int[] anIntArray4928;
    public short[] aShortArray4929;
    public Class154_Sub2 aClass154_Sub2_4930;
    public short[] aShortArray4931;
    public byte aByte4932 = -1;
    public Class132[] aClass132Array4933;
    public byte[] aByteArray4934;
    public Class132[] aClass132Array4935;
    public boolean aBoolean4936;
    public Class154_Sub2 aClass154_Sub2_4937;
    public int[] anIntArray4938;
    public int anInt4939 = 0;
    public int[] anIntArray4940;
    public Class1_Sub7_Sub1[] aClass1_Sub7_Sub1Array4941;
    public int[] anIntArray4942;
    public int[] anIntArray4943;
    public int[] anIntArray4944;
    public int[] anIntArray4945;
    public int[][] anIntArrayArray4946;
    public int anInt4947;
    public int[] anIntArray4948;
    public int anInt4949;
    public int[] anIntArray4950;
    
    public int method2267() {
	if (!aBoolean4872)
	    method2331();
	return aShort4889;
    }
    
    public int method2249() {
	if (!aBoolean4872)
	    method2331();
	return aShort4864;
    }
    
    public int method2263() {
	if (!aBoolean4872)
	    method2331();
	return aShort4882;
    }
    
    public void method2288(int arg0) {
	if ((anInt4914 & 0x6) != 6)
	    throw new IllegalStateException();
	int i = Class31.anIntArray434[arg0];
	int i_0_ = Class31.anIntArray425[arg0];
	for (int i_1_ = 0; i_1_ < anInt4916; i_1_++) {
	    int i_2_
		= anIntArray4919[i_1_] * i_0_ - anIntArray4902[i_1_] * i >> 15;
	    anIntArray4902[i_1_]
		= anIntArray4919[i_1_] * i + anIntArray4902[i_1_] * i_0_ >> 15;
	    anIntArray4919[i_1_] = i_2_;
	}
	method2326();
    }
    
    public void method2310(Thread arg0) {
	Class125 class125 = aClass130_Sub1_4888.method1267(arg0);
	if (class125 != aClass125_4922) {
	    aClass125_4922 = class125;
	    aClass154_Sub2_4863 = aClass125_4922.aClass154_Sub2_1686;
	    aClass154_Sub2_4930 = aClass125_4922.aClass154_Sub2_1668;
	    aClass154_Sub2_4887 = aClass125_4922.aClass154_Sub2_1673;
	    aClass154_Sub2_4885 = aClass125_4922.aClass154_Sub2_1649;
	    aClass154_Sub2_4937 = aClass125_4922.aClass154_Sub2_1672;
	    aClass154_Sub2_4921 = aClass125_4922.aClass154_Sub2_1651;
	}
    }
    
    public int method2258() {
	if (!aBoolean4872)
	    method2331();
	return aShort4915;
    }
    
    public int method2252() {
	return anInt4856;
    }
    
    public void method2279() {
	if (aBoolean4897) {
	    for (int i = 0; i < anInt4916; i++) {
		anIntArray4893[i] = anIntArray4893[i] + 7 >> 4;
		anIntArray4919[i] = anIntArray4919[i] + 7 >> 4;
		anIntArray4902[i] = anIntArray4902[i] + 7 >> 4;
	    }
	    aBoolean4897 = false;
	}
	if (aBoolean4936) {
	    method2320();
	    aBoolean4936 = false;
	}
	aBoolean4872 = false;
    }
    
    public Class131_Sub41_Sub13 method2283(Class131_Sub41_Sub13 arg0) {
	return null;
    }
    
    public void method2311(boolean arg0) {
	synchronized (this) {
	    if (anInt4917 == 1)
		method2320();
	    else if (anInt4917 == 2) {
		if ((anInt4914 & 0xba98) == 0)
		    aShortArray4903 = null;
		if (arg0)
		    aByteArray4874 = null;
	    } else {
		method2321();
		int i = aClass130_Sub1_4888.anInt4052;
		int i_3_ = aClass130_Sub1_4888.anInt4070;
		int i_4_ = aClass130_Sub1_4888.anInt4047;
		int i_5_ = aClass130_Sub1_4888.anInt4051 >> 8;
		int i_6_ = aClass130_Sub1_4888.anInt4034 * 768 / anInt4947;
		int i_7_ = aClass130_Sub1_4888.anInt4037 * 768 / anInt4947;
		if (anIntArray4918 == null) {
		    anIntArray4918 = new int[anInt4939];
		    anIntArray4942 = new int[anInt4939];
		    anIntArray4927 = new int[anInt4939];
		}
		for (int i_8_ = 0; i_8_ < anInt4939; i_8_++) {
		    byte i_9_;
		    if (aByteArray4874 == null)
			i_9_ = (byte) 0;
		    else
			i_9_ = aByteArray4874[i_8_];
		    byte i_10_;
		    if (aByteArray4908 == null)
			i_10_ = (byte) 0;
		    else
			i_10_ = aByteArray4908[i_8_];
		    short i_11_;
		    if (aShortArray4929 == null)
			i_11_ = (short) -1;
		    else
			i_11_ = aShortArray4929[i_8_];
		    if (i_10_ == -2)
			i_9_ = (byte) 3;
		    if (i_10_ == -1)
			i_9_ = (byte) 2;
		    if (i_11_ == -1) {
			if (i_9_ == 0) {
			    int i_12_ = aShortArray4903[i_8_] & 0xffff;
			    int i_13_ = (i_12_ & 0x7f) * anInt4856 >> 7;
			    short i_14_
				= Class131_Sub2_Sub22.method1575((byte) 74,
								 (i_12_ & ~0x7f
								  | i_13_));
			    Class132 class132;
			    if (aClass132Array4933 != null
				&& (aClass132Array4933[aShortArray4931[i_8_]]
				    != null))
				class132 = (aClass132Array4933
					    [aShortArray4931[i_8_]]);
			    else
				class132 = (aClass132Array4935
					    [aShortArray4931[i_8_]]);
			    int i_15_ = (((i * class132.anInt1796
					   + i_3_ * class132.anInt1797
					   + i_4_ * class132.anInt1798)
					  / class132.anInt1795)
					 >> 16);
			    int i_16_ = i_15_ > 256 ? i_6_ : i_7_;
			    int i_17_ = (i_5_ >> 1) + (i_16_ * i_15_ >> 17);
			    anIntArray4918[i_8_]
				= i_17_ << 17 | Class56.method624(i_17_,
								  (byte) -33,
								  i_14_);
			    if (aClass132Array4933 != null
				&& (aClass132Array4933[aShortArray4901[i_8_]]
				    != null))
				class132 = (aClass132Array4933
					    [aShortArray4901[i_8_]]);
			    else
				class132 = (aClass132Array4935
					    [aShortArray4901[i_8_]]);
			    i_15_ = ((i * class132.anInt1796
				      + i_3_ * class132.anInt1797
				      + i_4_ * class132.anInt1798)
				     / class132.anInt1795) >> 16;
			    i_16_ = i_15_ > 256 ? i_6_ : i_7_;
			    i_17_ = (i_5_ >> 1) + (i_16_ * i_15_ >> 17);
			    anIntArray4942[i_8_]
				= i_17_ << 17 | Class56.method624(i_17_,
								  (byte) -33,
								  i_14_);
			    if (aClass132Array4933 != null
				&& (aClass132Array4933[aShortArray4912[i_8_]]
				    != null))
				class132 = (aClass132Array4933
					    [aShortArray4912[i_8_]]);
			    else
				class132 = (aClass132Array4935
					    [aShortArray4912[i_8_]]);
			    i_15_ = ((i * class132.anInt1796
				      + i_3_ * class132.anInt1797
				      + i_4_ * class132.anInt1798)
				     / class132.anInt1795) >> 16;
			    i_16_ = i_15_ > 256 ? i_6_ : i_7_;
			    i_17_ = (i_5_ >> 1) + (i_16_ * i_15_ >> 17);
			    anIntArray4927[i_8_]
				= i_17_ << 17 | Class56.method624(i_17_,
								  (byte) -33,
								  i_14_);
			} else if (i_9_ == 1) {
			    int i_18_ = aShortArray4903[i_8_] & 0xffff;
			    int i_19_ = (i_18_ & 0x7f) * anInt4856 >> 7;
			    short i_20_
				= Class131_Sub2_Sub22.method1575((byte) 120,
								 (i_18_ & ~0x7f
								  | i_19_));
			    Class24 class24 = aClass24Array4920[i_8_];
			    int i_21_ = ((i * class24.anInt259
					  + i_3_ * class24.anInt260
					  + i_4_ * class24.anInt261)
					 >> 16);
			    int i_22_ = i_21_ > 256 ? i_6_ : i_7_;
			    int i_23_ = (i_5_ >> 1) + (i_22_ * i_21_ >> 17);
			    anIntArray4918[i_8_]
				= i_23_ << 17 | Class56.method624(i_23_,
								  (byte) -33,
								  i_20_);
			    anIntArray4927[i_8_] = -1;
			} else if (i_9_ == 3) {
			    anIntArray4918[i_8_] = 128;
			    anIntArray4927[i_8_] = -1;
			} else
			    anIntArray4927[i_8_] = -2;
		    } else if (i_9_ == 0) {
			Class132 class132;
			if (aClass132Array4933 != null
			    && (aClass132Array4933[aShortArray4931[i_8_]]
				!= null))
			    class132
				= aClass132Array4933[aShortArray4931[i_8_]];
			else
			    class132
				= aClass132Array4935[aShortArray4931[i_8_]];
			int i_24_ = (((i * class132.anInt1796
				       + i_3_ * class132.anInt1797
				       + i_4_ * class132.anInt1798)
				      / class132.anInt1795)
				     >> 16);
			int i_25_ = i_24_ > 256 ? i_6_ : i_7_;
			int i_26_ = (i_5_ >> 2) + (i_25_ * i_24_ >> 18);
			anIntArray4918[i_8_] = method2317(i_26_);
			if (aClass132Array4933 != null
			    && (aClass132Array4933[aShortArray4901[i_8_]]
				!= null))
			    class132
				= aClass132Array4933[aShortArray4901[i_8_]];
			else
			    class132
				= aClass132Array4935[aShortArray4901[i_8_]];
			i_24_ = ((i * class132.anInt1796
				  + i_3_ * class132.anInt1797
				  + i_4_ * class132.anInt1798)
				 / class132.anInt1795) >> 16;
			i_25_ = i_24_ > 256 ? i_6_ : i_7_;
			i_26_ = (i_5_ >> 2) + (i_25_ * i_24_ >> 18);
			anIntArray4942[i_8_] = method2317(i_26_);
			if (aClass132Array4933 != null
			    && (aClass132Array4933[aShortArray4912[i_8_]]
				!= null))
			    class132
				= aClass132Array4933[aShortArray4912[i_8_]];
			else
			    class132
				= aClass132Array4935[aShortArray4912[i_8_]];
			i_24_ = ((i * class132.anInt1796
				  + i_3_ * class132.anInt1797
				  + i_4_ * class132.anInt1798)
				 / class132.anInt1795) >> 16;
			i_25_ = i_24_ > 256 ? i_6_ : i_7_;
			i_26_ = (i_5_ >> 2) + (i_25_ * i_24_ >> 18);
			anIntArray4927[i_8_] = method2317(i_26_);
		    } else if (i_9_ == 1) {
			Class24 class24 = aClass24Array4920[i_8_];
			int i_27_
			    = ((i * class24.anInt259 + i_3_ * class24.anInt260
				+ i_4_ * class24.anInt261)
			       >> 16);
			int i_28_ = i_27_ > 256 ? i_6_ : i_7_;
			int i_29_ = (i_5_ >> 2) + (i_28_ * i_27_ >> 18);
			anIntArray4918[i_8_] = method2317(i_29_);
			anIntArray4927[i_8_] = -1;
		    } else
			anIntArray4927[i_8_] = -2;
		}
		aClass132Array4935 = null;
		aClass132Array4933 = null;
		aClass24Array4920 = null;
		if ((anInt4914 & 0xba98) == 0)
		    aShortArray4903 = null;
		if (arg0)
		    aByteArray4874 = null;
		anInt4917 = 2;
	    }
	}
    }
    
    public Class104[] method2266() {
	return aClass104Array4859;
    }
    
    public boolean method2286() {
	if (aShortArray4929 == null)
	    return true;
	for (int i = 0; i < aShortArray4929.length; i++) {
	    if (aShortArray4929[i] != -1
		&& !aClass130_Sub1_4888.method1270(aShortArray4929[i]))
		return false;
	}
	return true;
    }
    
    public void method2245(Class9 arg0, Class1_Sub5 arg1, int arg2, int arg3) {
	method2314(arg0, arg1, null, arg2, arg3);
    }
    
    public void method2312(int arg0) {
	int i = 0;
	int i_30_ = aClass130_Sub1_4888.anInt4043;
	int i_31_ = aShortArray4931[arg0];
	int i_32_ = aShortArray4901[arg0];
	int i_33_ = aShortArray4912[arg0];
	int i_34_ = anIntArray4940[i_31_];
	int i_35_ = anIntArray4940[i_32_];
	int i_36_ = anIntArray4940[i_33_];
	if (aByteArray4908 == null)
	    aClass65_4865.anInt819 = 0;
	else
	    aClass65_4865.anInt819 = aByteArray4908[arg0] & 0xff;
	if (i_34_ >= i_30_) {
	    anIntArray4945[i] = anIntArray4904[i_31_];
	    anIntArray4899[i] = anIntArray4890[i_31_];
	    anIntArray4894[i++] = anIntArray4918[arg0] & 0xffff;
	} else {
	    int i_37_ = anIntArray4909[i_31_];
	    int i_38_ = anIntArray4858[i_31_];
	    int i_39_ = anIntArray4918[arg0] & 0xffff;
	    if (i_36_ >= i_30_) {
		int i_40_ = (i_30_ - i_34_) * anIntArray4907[i_36_ - i_34_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_37_
			   + ((anIntArray4909[i_33_] - i_37_) * i_40_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_38_
			   + ((anIntArray4858[i_33_] - i_38_) * i_40_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_39_ + (((anIntArray4927[arg0] & 0xffff)
						- i_39_) * i_40_
					       >> 16);
	    }
	    if (i_35_ >= i_30_) {
		int i_41_ = (i_30_ - i_34_) * anIntArray4907[i_35_ - i_34_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_37_
			   + ((anIntArray4909[i_32_] - i_37_) * i_41_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_38_
			   + ((anIntArray4858[i_32_] - i_38_) * i_41_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_39_ + (((anIntArray4942[arg0] & 0xffff)
						- i_39_) * i_41_
					       >> 16);
	    }
	}
	if (i_35_ >= i_30_) {
	    anIntArray4945[i] = anIntArray4904[i_32_];
	    anIntArray4899[i] = anIntArray4890[i_32_];
	    anIntArray4894[i++] = anIntArray4942[arg0] & 0xffff;
	} else {
	    int i_42_ = anIntArray4909[i_32_];
	    int i_43_ = anIntArray4858[i_32_];
	    int i_44_ = anIntArray4942[arg0] & 0xffff;
	    if (i_34_ >= i_30_) {
		int i_45_ = (i_30_ - i_35_) * anIntArray4907[i_34_ - i_35_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_42_
			   + ((anIntArray4909[i_31_] - i_42_) * i_45_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_43_
			   + ((anIntArray4858[i_31_] - i_43_) * i_45_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_44_ + (((anIntArray4918[arg0] & 0xffff)
						- i_44_) * i_45_
					       >> 16);
	    }
	    if (i_36_ >= i_30_) {
		int i_46_ = (i_30_ - i_35_) * anIntArray4907[i_36_ - i_35_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_42_
			   + ((anIntArray4909[i_33_] - i_42_) * i_46_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_43_
			   + ((anIntArray4858[i_33_] - i_43_) * i_46_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_44_ + (((anIntArray4927[arg0] & 0xffff)
						- i_44_) * i_46_
					       >> 16);
	    }
	}
	if (i_36_ >= i_30_) {
	    anIntArray4945[i] = anIntArray4904[i_33_];
	    anIntArray4899[i] = anIntArray4890[i_33_];
	    anIntArray4894[i++] = anIntArray4927[arg0] & 0xffff;
	} else {
	    int i_47_ = anIntArray4909[i_33_];
	    int i_48_ = anIntArray4858[i_33_];
	    int i_49_ = anIntArray4927[arg0] & 0xffff;
	    if (i_35_ >= i_30_) {
		int i_50_ = (i_30_ - i_36_) * anIntArray4907[i_35_ - i_36_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_47_
			   + ((anIntArray4909[i_32_] - i_47_) * i_50_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_48_
			   + ((anIntArray4858[i_32_] - i_48_) * i_50_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_49_ + (((anIntArray4942[arg0] & 0xffff)
						- i_49_) * i_50_
					       >> 16);
	    }
	    if (i_34_ >= i_30_) {
		int i_51_ = (i_30_ - i_36_) * anIntArray4907[i_34_ - i_36_];
		anIntArray4945[i]
		    = (aClass125_4911.anInt1677
		       + ((i_47_
			   + ((anIntArray4909[i_31_] - i_47_) * i_51_ >> 16))
			  * aClass130_Sub1_4888.anInt4068 / i_30_));
		anIntArray4899[i]
		    = (aClass125_4911.anInt1647
		       + ((i_48_
			   + ((anIntArray4858[i_31_] - i_48_) * i_51_ >> 16))
			  * aClass130_Sub1_4888.anInt4036 / i_30_));
		anIntArray4894[i++] = i_49_ + (((anIntArray4918[arg0] & 0xffff)
						- i_49_) * i_51_
					       >> 16);
	    }
	}
	int i_52_ = anIntArray4945[0];
	int i_53_ = anIntArray4945[1];
	int i_54_ = anIntArray4945[2];
	int i_55_ = anIntArray4899[0];
	int i_56_ = anIntArray4899[1];
	int i_57_ = anIntArray4899[2];
	aClass65_4865.aBoolean820 = false;
	if (i == 3) {
	    if (i_52_ < 0 || i_53_ < 0 || i_54_ < 0
		|| i_52_ > aClass125_4911.anInt1669
		|| i_53_ > aClass125_4911.anInt1669
		|| i_54_ > aClass125_4911.anInt1669)
		aClass65_4865.aBoolean820 = true;
	    if (aShortArray4929 == null || aShortArray4929[arg0] == -1) {
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method682(i_55_, i_56_, i_57_, i_52_, i_53_,
					    i_54_,
					    (Class88.anIntArray1171
					     [anIntArray4918[arg0] & 0xffff]));
		else
		    aClass65_4865.method688(i_55_, i_56_, i_57_, i_52_, i_53_,
					    i_54_, anIntArray4894[0],
					    anIntArray4894[1],
					    anIntArray4894[2]);
	    } else {
		int i_58_;
		int i_59_;
		int i_60_;
		if (aByteArray4878 != null && aByteArray4878[arg0] != -1) {
		    int i_61_ = aByteArray4878[arg0] & 0xff;
		    i_58_ = anIntArray4870[i_61_];
		    i_59_ = anIntArray4948[i_61_];
		    i_60_ = anIntArray4881[i_61_];
		} else {
		    i_58_ = i_31_;
		    i_59_ = i_32_;
		    i_60_ = i_33_;
		}
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method687
			(i_55_, i_56_, i_57_, i_52_, i_53_, i_54_,
			 anIntArray4918[arg0], anIntArray4918[arg0],
			 anIntArray4918[arg0], anIntArray4909[i_58_],
			 anIntArray4909[i_59_], anIntArray4909[i_60_],
			 anIntArray4858[i_58_], anIntArray4858[i_59_],
			 anIntArray4858[i_60_], anIntArray4940[i_58_],
			 anIntArray4940[i_59_], anIntArray4940[i_60_],
			 aShortArray4929[arg0]);
		else
		    aClass65_4865.method687
			(i_55_, i_56_, i_57_, i_52_, i_53_, i_54_,
			 anIntArray4894[0], anIntArray4894[1],
			 anIntArray4894[2], anIntArray4909[i_58_],
			 anIntArray4909[i_59_], anIntArray4909[i_60_],
			 anIntArray4858[i_58_], anIntArray4858[i_59_],
			 anIntArray4858[i_60_], anIntArray4940[i_58_],
			 anIntArray4940[i_59_], anIntArray4940[i_60_],
			 aShortArray4929[arg0]);
	    }
	}
	if (i == 4) {
	    if (i_52_ < 0 || i_53_ < 0 || i_54_ < 0
		|| i_52_ > aClass125_4911.anInt1669
		|| i_53_ > aClass125_4911.anInt1669
		|| i_54_ > aClass125_4911.anInt1669 || anIntArray4945[3] < 0
		|| anIntArray4945[3] > aClass125_4911.anInt1669)
		aClass65_4865.aBoolean820 = true;
	    if (aShortArray4929 == null || aShortArray4929[arg0] == -1) {
		if (anIntArray4927[arg0] == -1) {
		    int i_62_ = (Class88.anIntArray1171
				 [anIntArray4918[arg0] & 0xffff]);
		    aClass65_4865.method682(i_55_, i_56_, i_57_, i_52_, i_53_,
					    i_54_, i_62_);
		    aClass65_4865.method682(i_55_, i_57_, anIntArray4899[3],
					    i_52_, i_54_, anIntArray4945[3],
					    i_62_);
		} else {
		    aClass65_4865.method688(i_55_, i_56_, i_57_, i_52_, i_53_,
					    i_54_, anIntArray4894[0],
					    anIntArray4894[1],
					    anIntArray4894[2]);
		    aClass65_4865.method688(i_55_, i_57_, anIntArray4899[3],
					    i_52_, i_54_, anIntArray4945[3],
					    anIntArray4894[0],
					    anIntArray4894[2],
					    anIntArray4894[3]);
		}
	    } else {
		int i_63_;
		int i_64_;
		int i_65_;
		if (aByteArray4878 != null && aByteArray4878[arg0] != -1) {
		    int i_66_ = aByteArray4878[arg0] & 0xff;
		    i_63_ = anIntArray4870[i_66_];
		    i_64_ = anIntArray4948[i_66_];
		    i_65_ = anIntArray4881[i_66_];
		} else {
		    i_63_ = i_31_;
		    i_64_ = i_32_;
		    i_65_ = i_33_;
		}
		short i_67_ = aShortArray4929[arg0];
		if (anIntArray4927[arg0] == -1) {
		    aClass65_4865.method687
			(i_55_, i_56_, i_57_, i_52_, i_53_, i_54_,
			 anIntArray4918[arg0], anIntArray4918[arg0],
			 anIntArray4918[arg0], anIntArray4909[i_63_],
			 anIntArray4909[i_64_], anIntArray4909[i_65_],
			 anIntArray4858[i_63_], anIntArray4858[i_64_],
			 anIntArray4858[i_65_], anIntArray4940[i_63_],
			 anIntArray4940[i_64_], anIntArray4940[i_65_], i_67_);
		    aClass65_4865.method687
			(i_55_, i_57_, anIntArray4899[3], i_52_, i_54_,
			 anIntArray4945[3], anIntArray4918[arg0],
			 anIntArray4918[arg0], anIntArray4918[arg0],
			 anIntArray4909[i_63_], anIntArray4909[i_64_],
			 anIntArray4909[i_65_], anIntArray4858[i_63_],
			 anIntArray4858[i_64_], anIntArray4858[i_65_],
			 anIntArray4940[i_63_], anIntArray4940[i_64_],
			 anIntArray4940[i_65_], i_67_);
		} else {
		    aClass65_4865.method687
			(i_55_, i_56_, i_57_, i_52_, i_53_, i_54_,
			 anIntArray4894[0], anIntArray4894[1],
			 anIntArray4894[2], anIntArray4909[i_63_],
			 anIntArray4909[i_64_], anIntArray4909[i_65_],
			 anIntArray4858[i_63_], anIntArray4858[i_64_],
			 anIntArray4858[i_65_], anIntArray4940[i_63_],
			 anIntArray4940[i_64_], anIntArray4940[i_65_], i_67_);
		    aClass65_4865.method687
			(i_55_, i_57_, anIntArray4899[3], i_52_, i_54_,
			 anIntArray4945[3], anIntArray4894[0],
			 anIntArray4894[2], anIntArray4894[3],
			 anIntArray4909[i_63_], anIntArray4909[i_64_],
			 anIntArray4909[i_65_], anIntArray4858[i_63_],
			 anIntArray4858[i_64_], anIntArray4858[i_65_],
			 anIntArray4940[i_63_], anIntArray4940[i_64_],
			 anIntArray4940[i_65_], i_67_);
		}
	    }
	}
    }
    
    public void method2313() {
	for (int i = 0; i < anInt4916; i++) {
	    anIntArray4893[i] = -anIntArray4893[i];
	    anIntArray4902[i] = -anIntArray4902[i];
	}
	method2326();
    }
    
    public void method2282(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   boolean arg5, int arg6, int[] arg7) {
	int i = arg1.length;
	if (arg0 == 0) {
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    if (!aBoolean4897) {
		for (int i_68_ = 0; i_68_ < anInt4916; i_68_++) {
		    anIntArray4893[i_68_] <<= 4;
		    anIntArray4919[i_68_] <<= 4;
		    anIntArray4902[i_68_] <<= 4;
		}
		aBoolean4897 = true;
	    }
	    int i_69_ = 0;
	    anInt4906 = 0;
	    anInt4949 = 0;
	    anInt4913 = 0;
	    for (int i_70_ = 0; i_70_ < i; i_70_++) {
		int i_71_ = arg1[i_70_];
		if (i_71_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_71_];
		    for (int i_72_ = 0; i_72_ < is.length; i_72_++) {
			int i_73_ = is[i_72_];
			if (aShortArray4880 == null
			    || (arg6 & aShortArray4880[i_73_]) != 0) {
			    anInt4906 += anIntArray4893[i_73_];
			    anInt4949 += anIntArray4919[i_73_];
			    anInt4913 += anIntArray4902[i_73_];
			    i_69_++;
			}
		    }
		}
	    }
	    if (i_69_ > 0) {
		anInt4906 = anInt4906 / i_69_ + arg2;
		anInt4949 = anInt4949 / i_69_ + arg3;
		anInt4913 = anInt4913 / i_69_ + arg4;
		aBoolean4884 = true;
	    } else {
		anInt4906 = arg2;
		anInt4949 = arg3;
		anInt4913 = arg4;
	    }
	} else if (arg0 == 1) {
	    if (arg7 != null) {
		int i_74_
		    = (arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384
		       >> 15);
		int i_75_
		    = (arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384
		       >> 15);
		int i_76_
		    = (arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384
		       >> 15);
		arg2 = i_74_;
		arg3 = i_75_;
		arg4 = i_76_;
	    }
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    if (!aBoolean4897) {
		for (int i_77_ = 0; i_77_ < anInt4916; i_77_++) {
		    anIntArray4893[i_77_] <<= 4;
		    anIntArray4919[i_77_] <<= 4;
		    anIntArray4902[i_77_] <<= 4;
		}
		aBoolean4897 = true;
	    }
	    for (int i_78_ = 0; i_78_ < i; i_78_++) {
		int i_79_ = arg1[i_78_];
		if (i_79_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_79_];
		    for (int i_80_ = 0; i_80_ < is.length; i_80_++) {
			int i_81_ = is[i_80_];
			if (aShortArray4880 == null
			    || (arg6 & aShortArray4880[i_81_]) != 0) {
			    anIntArray4893[i_81_] += arg2;
			    anIntArray4919[i_81_] += arg3;
			    anIntArray4902[i_81_] += arg4;
			}
		    }
		}
	    }
	} else if (arg0 == 2) {
	    if (arg7 != null) {
		if (!aBoolean4897) {
		    for (int i_82_ = 0; i_82_ < anInt4916; i_82_++) {
			anIntArray4893[i_82_] <<= 4;
			anIntArray4919[i_82_] <<= 4;
			anIntArray4902[i_82_] <<= 4;
		    }
		    aBoolean4897 = true;
		}
		int i_83_ = arg7[9] << 4;
		int i_84_ = arg7[10] << 4;
		int i_85_ = arg7[11] << 4;
		int i_86_ = arg7[12] << 4;
		int i_87_ = arg7[13] << 4;
		int i_88_ = arg7[14] << 4;
		if (aBoolean4884) {
		    int i_89_ = ((arg7[0] * anInt4906 + arg7[3] * anInt4949
				  + arg7[6] * anInt4913 + 16384)
				 >> 15);
		    int i_90_ = ((arg7[1] * anInt4906 + arg7[4] * anInt4949
				  + arg7[7] * anInt4913 + 16384)
				 >> 15);
		    int i_91_ = ((arg7[2] * anInt4906 + arg7[5] * anInt4949
				  + arg7[8] * anInt4913 + 16384)
				 >> 15);
		    i_89_ += i_86_;
		    i_90_ += i_87_;
		    i_91_ += i_88_;
		    anInt4906 = i_89_;
		    anInt4949 = i_90_;
		    anInt4913 = i_91_;
		    aBoolean4884 = false;
		}
		int[] is = new int[9];
		int i_92_ = Class31.anIntArray425[arg2];
		int i_93_ = Class31.anIntArray434[arg2];
		int i_94_ = Class31.anIntArray425[arg3];
		int i_95_ = Class31.anIntArray434[arg3];
		int i_96_ = Class31.anIntArray425[arg4];
		int i_97_ = Class31.anIntArray434[arg4];
		int i_98_ = i_93_ * i_96_ + 16384 >> 15;
		int i_99_ = i_93_ * i_97_ + 16384 >> 15;
		is[0] = i_94_ * i_96_ + i_95_ * i_99_ + 16384 >> 15;
		is[1] = -i_94_ * i_97_ + i_95_ * i_98_ + 16384 >> 15;
		is[2] = i_95_ * i_92_ + 16384 >> 15;
		is[3] = i_92_ * i_97_ + 16384 >> 15;
		is[4] = i_92_ * i_96_ + 16384 >> 15;
		is[5] = -i_93_;
		is[6] = -i_95_ * i_96_ + i_94_ * i_99_ + 16384 >> 15;
		is[7] = i_95_ * i_97_ + i_94_ * i_98_ + 16384 >> 15;
		is[8] = i_94_ * i_92_ + 16384 >> 15;
		int i_100_ = ((is[0] * -anInt4906 + is[1] * -anInt4949
			       + is[2] * -anInt4913 + 16384)
			      >> 15);
		int i_101_ = ((is[3] * -anInt4906 + is[4] * -anInt4949
			       + is[5] * -anInt4913 + 16384)
			      >> 15);
		int i_102_ = ((is[6] * -anInt4906 + is[7] * -anInt4949
			       + is[8] * -anInt4913 + 16384)
			      >> 15);
		int i_103_ = i_100_ + anInt4906;
		int i_104_ = i_101_ + anInt4949;
		int i_105_ = i_102_ + anInt4913;
		int[] is_106_ = new int[9];
		for (int i_107_ = 0; i_107_ < 3; i_107_++) {
		    for (int i_108_ = 0; i_108_ < 3; i_108_++) {
			int i_109_ = 0;
			for (int i_110_ = 0; i_110_ < 3; i_110_++)
			    i_109_ += (is[i_107_ * 3 + i_110_]
				       * arg7[i_108_ * 3 + i_110_]);
			is_106_[i_107_ * 3 + i_108_] = i_109_ + 16384 >> 15;
		    }
		}
		int i_111_
		    = (is[0] * i_86_ + is[1] * i_87_ + is[2] * i_88_ + 16384
		       >> 15);
		int i_112_
		    = (is[3] * i_86_ + is[4] * i_87_ + is[5] * i_88_ + 16384
		       >> 15);
		int i_113_
		    = (is[6] * i_86_ + is[7] * i_87_ + is[8] * i_88_ + 16384
		       >> 15);
		i_111_ += i_103_;
		i_112_ += i_104_;
		i_113_ += i_105_;
		int[] is_114_ = new int[9];
		for (int i_115_ = 0; i_115_ < 3; i_115_++) {
		    for (int i_116_ = 0; i_116_ < 3; i_116_++) {
			int i_117_ = 0;
			for (int i_118_ = 0; i_118_ < 3; i_118_++)
			    i_117_ += (arg7[i_115_ * 3 + i_118_]
				       * is_106_[i_116_ + i_118_ * 3]);
			is_114_[i_115_ * 3 + i_116_] = i_117_ + 16384 >> 15;
		    }
		}
		int i_119_ = ((arg7[0] * i_111_ + arg7[1] * i_112_
			       + arg7[2] * i_113_ + 16384)
			      >> 15);
		int i_120_ = ((arg7[3] * i_111_ + arg7[4] * i_112_
			       + arg7[5] * i_113_ + 16384)
			      >> 15);
		int i_121_ = ((arg7[6] * i_111_ + arg7[7] * i_112_
			       + arg7[8] * i_113_ + 16384)
			      >> 15);
		i_119_ += i_83_;
		i_120_ += i_84_;
		i_121_ += i_85_;
		for (int i_122_ = 0; i_122_ < i; i_122_++) {
		    int i_123_ = arg1[i_122_];
		    if (i_123_ < anIntArrayArray4898.length) {
			int[] is_124_ = anIntArrayArray4898[i_123_];
			for (int i_125_ = 0; i_125_ < is_124_.length;
			     i_125_++) {
			    int i_126_ = is_124_[i_125_];
			    if (aShortArray4880 == null
				|| (arg6 & aShortArray4880[i_126_]) != 0) {
				int i_127_
				    = ((is_114_[0] * anIntArray4893[i_126_]
					+ is_114_[1] * anIntArray4919[i_126_]
					+ is_114_[2] * anIntArray4902[i_126_]
					+ 16384)
				       >> 15);
				int i_128_
				    = ((is_114_[3] * anIntArray4893[i_126_]
					+ is_114_[4] * anIntArray4919[i_126_]
					+ is_114_[5] * anIntArray4902[i_126_]
					+ 16384)
				       >> 15);
				int i_129_
				    = ((is_114_[6] * anIntArray4893[i_126_]
					+ is_114_[7] * anIntArray4919[i_126_]
					+ is_114_[8] * anIntArray4902[i_126_]
					+ 16384)
				       >> 15);
				i_127_ += i_119_;
				i_128_ += i_120_;
				i_129_ += i_121_;
				anIntArray4893[i_126_] = i_127_;
				anIntArray4919[i_126_] = i_128_;
				anIntArray4902[i_126_] = i_129_;
			    }
			}
		    }
		}
	    } else {
		for (int i_130_ = 0; i_130_ < i; i_130_++) {
		    int i_131_ = arg1[i_130_];
		    if (i_131_ < anIntArrayArray4898.length) {
			int[] is = anIntArrayArray4898[i_131_];
			for (int i_132_ = 0; i_132_ < is.length; i_132_++) {
			    int i_133_ = is[i_132_];
			    if (aShortArray4880 == null
				|| (arg6 & aShortArray4880[i_133_]) != 0) {
				anIntArray4893[i_133_] -= anInt4906;
				anIntArray4919[i_133_] -= anInt4949;
				anIntArray4902[i_133_] -= anInt4913;
				if (arg4 != 0) {
				    int i_134_ = Class31.anIntArray434[arg4];
				    int i_135_ = Class31.anIntArray425[arg4];
				    int i_136_
					= ((anIntArray4919[i_133_] * i_134_
					    + anIntArray4893[i_133_] * i_135_
					    + 32767)
					   >> 15);
				    anIntArray4919[i_133_]
					= (anIntArray4919[i_133_] * i_135_
					   - anIntArray4893[i_133_] * i_134_
					   + 32767) >> 15;
				    anIntArray4893[i_133_] = i_136_;
				}
				if (arg2 != 0) {
				    int i_137_ = Class31.anIntArray434[arg2];
				    int i_138_ = Class31.anIntArray425[arg2];
				    int i_139_
					= ((anIntArray4919[i_133_] * i_138_
					    - anIntArray4902[i_133_] * i_137_
					    + 32767)
					   >> 15);
				    anIntArray4902[i_133_]
					= (anIntArray4919[i_133_] * i_137_
					   + anIntArray4902[i_133_] * i_138_
					   + 32767) >> 15;
				    anIntArray4919[i_133_] = i_139_;
				}
				if (arg3 != 0) {
				    int i_140_ = Class31.anIntArray434[arg3];
				    int i_141_ = Class31.anIntArray425[arg3];
				    int i_142_
					= ((anIntArray4902[i_133_] * i_140_
					    + anIntArray4893[i_133_] * i_141_
					    + 32767)
					   >> 15);
				    anIntArray4902[i_133_]
					= (anIntArray4902[i_133_] * i_141_
					   - anIntArray4893[i_133_] * i_140_
					   + 32767) >> 15;
				    anIntArray4893[i_133_] = i_142_;
				}
				anIntArray4893[i_133_] += anInt4906;
				anIntArray4919[i_133_] += anInt4949;
				anIntArray4902[i_133_] += anInt4913;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 3) {
	    if (arg7 != null) {
		if (!aBoolean4897) {
		    for (int i_143_ = 0; i_143_ < anInt4916; i_143_++) {
			anIntArray4893[i_143_] <<= 4;
			anIntArray4919[i_143_] <<= 4;
			anIntArray4902[i_143_] <<= 4;
		    }
		    aBoolean4897 = true;
		}
		int i_144_ = arg7[9] << 4;
		int i_145_ = arg7[10] << 4;
		int i_146_ = arg7[11] << 4;
		int i_147_ = arg7[12] << 4;
		int i_148_ = arg7[13] << 4;
		int i_149_ = arg7[14] << 4;
		if (aBoolean4884) {
		    int i_150_ = ((arg7[0] * anInt4906 + arg7[3] * anInt4949
				   + arg7[6] * anInt4913 + 16384)
				  >> 15);
		    int i_151_ = ((arg7[1] * anInt4906 + arg7[4] * anInt4949
				   + arg7[7] * anInt4913 + 16384)
				  >> 15);
		    int i_152_ = ((arg7[2] * anInt4906 + arg7[5] * anInt4949
				   + arg7[8] * anInt4913 + 16384)
				  >> 15);
		    i_150_ += i_147_;
		    i_151_ += i_148_;
		    i_152_ += i_149_;
		    anInt4906 = i_150_;
		    anInt4949 = i_151_;
		    anInt4913 = i_152_;
		    aBoolean4884 = false;
		}
		int i_153_ = arg2 << 15 >> 7;
		int i_154_ = arg3 << 15 >> 7;
		int i_155_ = arg4 << 15 >> 7;
		int i_156_ = i_153_ * -anInt4906 + 16384 >> 15;
		int i_157_ = i_154_ * -anInt4949 + 16384 >> 15;
		int i_158_ = i_155_ * -anInt4913 + 16384 >> 15;
		int i_159_ = i_156_ + anInt4906;
		int i_160_ = i_157_ + anInt4949;
		int i_161_ = i_158_ + anInt4913;
		int[] is = new int[9];
		is[0] = i_153_ * arg7[0] + 16384 >> 15;
		is[1] = i_153_ * arg7[3] + 16384 >> 15;
		is[2] = i_153_ * arg7[6] + 16384 >> 15;
		is[3] = i_154_ * arg7[1] + 16384 >> 15;
		is[4] = i_154_ * arg7[4] + 16384 >> 15;
		is[5] = i_154_ * arg7[7] + 16384 >> 15;
		is[6] = i_155_ * arg7[2] + 16384 >> 15;
		is[7] = i_155_ * arg7[5] + 16384 >> 15;
		is[8] = i_155_ * arg7[8] + 16384 >> 15;
		int i_162_ = i_153_ * i_147_ + 16384 >> 15;
		int i_163_ = i_154_ * i_148_ + 16384 >> 15;
		int i_164_ = i_155_ * i_149_ + 16384 >> 15;
		i_162_ += i_159_;
		i_163_ += i_160_;
		i_164_ += i_161_;
		int[] is_165_ = new int[9];
		for (int i_166_ = 0; i_166_ < 3; i_166_++) {
		    for (int i_167_ = 0; i_167_ < 3; i_167_++) {
			int i_168_ = 0;
			for (int i_169_ = 0; i_169_ < 3; i_169_++)
			    i_168_ += (arg7[i_166_ * 3 + i_169_]
				       * is[i_167_ + i_169_ * 3]);
			is_165_[i_166_ * 3 + i_167_] = i_168_ + 16384 >> 15;
		    }
		}
		int i_170_ = ((arg7[0] * i_162_ + arg7[1] * i_163_
			       + arg7[2] * i_164_ + 16384)
			      >> 15);
		int i_171_ = ((arg7[3] * i_162_ + arg7[4] * i_163_
			       + arg7[5] * i_164_ + 16384)
			      >> 15);
		int i_172_ = ((arg7[6] * i_162_ + arg7[7] * i_163_
			       + arg7[8] * i_164_ + 16384)
			      >> 15);
		i_170_ += i_144_;
		i_171_ += i_145_;
		i_172_ += i_146_;
		for (int i_173_ = 0; i_173_ < i; i_173_++) {
		    int i_174_ = arg1[i_173_];
		    if (i_174_ < anIntArrayArray4898.length) {
			int[] is_175_ = anIntArrayArray4898[i_174_];
			for (int i_176_ = 0; i_176_ < is_175_.length;
			     i_176_++) {
			    int i_177_ = is_175_[i_176_];
			    if (aShortArray4880 == null
				|| (arg6 & aShortArray4880[i_177_]) != 0) {
				int i_178_
				    = ((is_165_[0] * anIntArray4893[i_177_]
					+ is_165_[1] * anIntArray4919[i_177_]
					+ is_165_[2] * anIntArray4902[i_177_]
					+ 16384)
				       >> 15);
				int i_179_
				    = ((is_165_[3] * anIntArray4893[i_177_]
					+ is_165_[4] * anIntArray4919[i_177_]
					+ is_165_[5] * anIntArray4902[i_177_]
					+ 16384)
				       >> 15);
				int i_180_
				    = ((is_165_[6] * anIntArray4893[i_177_]
					+ is_165_[7] * anIntArray4919[i_177_]
					+ is_165_[8] * anIntArray4902[i_177_]
					+ 16384)
				       >> 15);
				i_178_ += i_170_;
				i_179_ += i_171_;
				i_180_ += i_172_;
				anIntArray4893[i_177_] = i_178_;
				anIntArray4919[i_177_] = i_179_;
				anIntArray4902[i_177_] = i_180_;
			    }
			}
		    }
		}
	    } else {
		for (int i_181_ = 0; i_181_ < i; i_181_++) {
		    int i_182_ = arg1[i_181_];
		    if (i_182_ < anIntArrayArray4898.length) {
			int[] is = anIntArrayArray4898[i_182_];
			for (int i_183_ = 0; i_183_ < is.length; i_183_++) {
			    int i_184_ = is[i_183_];
			    if (aShortArray4880 == null
				|| (arg6 & aShortArray4880[i_184_]) != 0) {
				anIntArray4893[i_184_] -= anInt4906;
				anIntArray4919[i_184_] -= anInt4949;
				anIntArray4902[i_184_] -= anInt4913;
				anIntArray4893[i_184_]
				    = anIntArray4893[i_184_] * arg2 / 128;
				anIntArray4919[i_184_]
				    = anIntArray4919[i_184_] * arg3 / 128;
				anIntArray4902[i_184_]
				    = anIntArray4902[i_184_] * arg4 / 128;
				anIntArray4893[i_184_] += anInt4906;
				anIntArray4919[i_184_] += anInt4949;
				anIntArray4902[i_184_] += anInt4913;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 5) {
	    if (anIntArrayArray4946 != null && aByteArray4908 != null) {
		for (int i_185_ = 0; i_185_ < i; i_185_++) {
		    int i_186_ = arg1[i_185_];
		    if (i_186_ < anIntArrayArray4946.length) {
			int[] is = anIntArrayArray4946[i_186_];
			for (int i_187_ = 0; i_187_ < is.length; i_187_++) {
			    int i_188_ = is[i_187_];
			    if (aShortArray4924 == null
				|| (arg6 & aShortArray4924[i_188_]) != 0) {
				int i_189_ = ((aByteArray4908[i_188_] & 0xff)
					      + arg2 * 8);
				if (i_189_ < 0)
				    i_189_ = 0;
				else if (i_189_ > 255)
				    i_189_ = 255;
				aByteArray4908[i_188_] = (byte) i_189_;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 7 && anIntArrayArray4946 != null) {
	    for (int i_190_ = 0; i_190_ < i; i_190_++) {
		int i_191_ = arg1[i_190_];
		if (i_191_ < anIntArrayArray4946.length) {
		    int[] is = anIntArrayArray4946[i_191_];
		    for (int i_192_ = 0; i_192_ < is.length; i_192_++) {
			int i_193_ = is[i_192_];
			if (aShortArray4924 == null
			    || (arg6 & aShortArray4924[i_193_]) != 0) {
			    int i_194_ = aShortArray4903[i_193_] & 0xffff;
			    int i_195_ = i_194_ >> 10 & 0x3f;
			    int i_196_ = i_194_ >> 7 & 0x7;
			    int i_197_ = i_194_ & 0x7f;
			    i_195_ = i_195_ + arg2 & 0x3f;
			    i_196_ += arg3;
			    if (i_196_ < 0)
				i_196_ = 0;
			    else if (i_196_ > 7)
				i_196_ = 7;
			    i_197_ += arg4;
			    if (i_197_ < 0)
				i_197_ = 0;
			    else if (i_197_ > 127)
				i_197_ = 127;
			    aShortArray4903[i_193_]
				= (short) (i_195_ << 10 | i_196_ << 7
					   | i_197_);
			}
		    }
		    aBoolean4936 = true;
		}
	    }
	}
    }
    
    public void method2273(int arg0) {
	if ((anInt4914 & 0x800) != 2048)
	    throw new IllegalStateException();
	anInt4856 = arg0;
	anInt4917 = 0;
    }
    
    public void method2260(short arg0, short arg1) {
	for (int i = 0; i < anInt4939; i++) {
	    if (aShortArray4903[i] == arg0)
		aShortArray4903[i] = arg1;
	}
	if (anInt4917 == 2)
	    anInt4917 = 1;
    }
    
    public void method2289(int arg0) {
	if ((anInt4914 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass132Array4935 != null) {
	    if (arg0 == 4096)
		method2318();
	    else if (arg0 == 8192)
		method2322();
	    else if (arg0 == 12288)
		method2319();
	    else {
		int i = Class31.anIntArray434[arg0];
		int i_198_ = Class31.anIntArray425[arg0];
		for (int i_199_ = 0; i_199_ < anInt4860; i_199_++) {
		    int i_200_ = ((anIntArray4902[i_199_] * i
				   + anIntArray4893[i_199_] * i_198_)
				  >> 15);
		    anIntArray4902[i_199_]
			= (anIntArray4902[i_199_] * i_198_
			   - anIntArray4893[i_199_] * i) >> 15;
		    anIntArray4893[i_199_] = i_200_;
		    if (aClass132Array4935[i_199_] != null) {
			i_200_ = (aClass132Array4935[i_199_].anInt1798 * i
				  + (aClass132Array4935[i_199_].anInt1796
				     * i_198_)) >> 15;
			aClass132Array4935[i_199_].anInt1798
			    = ((aClass132Array4935[i_199_].anInt1798 * i_198_
				- aClass132Array4935[i_199_].anInt1796 * i)
			       >> 15);
			aClass132Array4935[i_199_].anInt1796 = i_200_;
		    }
		}
		if (aClass24Array4920 != null) {
		    for (int i_201_ = 0; i_201_ < anInt4939; i_201_++) {
			if (aClass24Array4920[i_201_] != null) {
			    int i_202_
				= ((aClass24Array4920[i_201_].anInt261 * i
				    + (aClass24Array4920[i_201_].anInt259
				       * i_198_))
				   >> 15);
			    aClass24Array4920[i_201_].anInt261
				= ((aClass24Array4920[i_201_].anInt261 * i_198_
				    - aClass24Array4920[i_201_].anInt259 * i)
				   >> 15);
			    aClass24Array4920[i_201_].anInt259 = i_202_;
			}
		    }
		}
		for (int i_203_ = anInt4860; i_203_ < anInt4916; i_203_++) {
		    int i_204_ = ((anIntArray4902[i_203_] * i
				   + anIntArray4893[i_203_] * i_198_)
				  >> 15);
		    anIntArray4902[i_203_]
			= (anIntArray4902[i_203_] * i_198_
			   - anIntArray4893[i_203_] * i) >> 15;
		    anIntArray4893[i_203_] = i_204_;
		}
		anInt4917 = 0;
		aBoolean4872 = false;
	    }
	} else
	    method2264(arg0);
    }
    
    public void method2314(Class9 arg0, Class1_Sub5 arg1, Class105 arg2,
			   int arg3, int arg4) {
	if (anInt4860 >= 1) {
	    aClass9_Sub2_4886 = (Class9_Sub2) arg0;
	    Class9_Sub2 class9_sub2 = aClass130_Sub1_4888.aClass9_Sub2_4058;
	    if (!aBoolean4872)
		method2331();
	    method2332(aClass9_Sub2_4886);
	    boolean bool = false;
	    if (aClass9_Sub2_4886.anInt3617 == 32768
		&& aClass9_Sub2_4886.anInt3615 == 0
		&& aClass9_Sub2_4886.anInt3618 == 0
		&& aClass9_Sub2_4886.anInt3625 == 0
		&& aClass9_Sub2_4886.anInt3616 == 32768
		&& aClass9_Sub2_4886.anInt3622 == 0
		&& aClass9_Sub2_4886.anInt3623 == 0
		&& aClass9_Sub2_4886.anInt3621 == 0
		&& aClass9_Sub2_4886.anInt3620 == 32768)
		bool = true;
	    int i = ((class9_sub2.anInt3619 << 15)
		     + class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3626
		     + class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3624
		     + class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3619);
	    int i_205_;
	    if (bool)
		i_205_ = class9_sub2.anInt3621;
	    else
		i_205_
		    = ((class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3615
			+ class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3616
			+ class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3621)
		       >> 15);
	    int i_206_ = i + aShort4879 * i_205_ >> 15;
	    int i_207_ = i + aShort4915 * i_205_ >> 15;
	    int i_208_;
	    int i_209_;
	    if (i_206_ > i_207_) {
		i_208_ = i_207_ - aShort4891;
		i_209_ = i_206_ + aShort4891;
	    } else {
		i_208_ = i_206_ - aShort4891;
		i_209_ = i_207_ + aShort4891;
	    }
	    if (i_208_ < aClass130_Sub1_4888.anInt4050
		&& i_209_ > aClass130_Sub1_4888.anInt4043) {
		int i_210_
		    = ((class9_sub2.anInt3626 << 15)
		       + class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3626
		       + class9_sub2.anInt3615 * aClass9_Sub2_4886.anInt3624
		       + class9_sub2.anInt3618 * aClass9_Sub2_4886.anInt3619);
		int i_211_;
		if (bool)
		    i_211_ = class9_sub2.anInt3615;
		else
		    i_211_
			= (class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3615
			   + (class9_sub2.anInt3615
			      * aClass9_Sub2_4886.anInt3616)
			   + (class9_sub2.anInt3618
			      * aClass9_Sub2_4886.anInt3621)) >> 15;
		int i_212_ = i_210_ + aShort4879 * i_211_ >> 15;
		int i_213_ = i_210_ + aShort4915 * i_211_ >> 15;
		int i_214_;
		int i_215_;
		if (i_212_ > i_213_) {
		    i_214_ = ((i_213_ - aShort4891)
			      * aClass130_Sub1_4888.anInt4068);
		    i_215_ = ((i_212_ + aShort4891)
			      * aClass130_Sub1_4888.anInt4068);
		} else {
		    i_214_ = ((i_212_ - aShort4891)
			      * aClass130_Sub1_4888.anInt4068);
		    i_215_ = ((i_213_ + aShort4891)
			      * aClass130_Sub1_4888.anInt4068);
		}
		if (i_214_ / i_209_ < aClass130_Sub1_4888.anInt4038
		    && i_215_ / i_209_ > aClass130_Sub1_4888.anInt4057) {
		    int i_216_ = ((class9_sub2.anInt3624 << 15)
				  + (class9_sub2.anInt3625
				     * aClass9_Sub2_4886.anInt3626)
				  + (class9_sub2.anInt3616
				     * aClass9_Sub2_4886.anInt3624)
				  + (class9_sub2.anInt3622
				     * aClass9_Sub2_4886.anInt3619));
		    int i_217_;
		    if (bool)
			i_217_ = class9_sub2.anInt3616;
		    else
			i_217_ = ((class9_sub2.anInt3625
				   * aClass9_Sub2_4886.anInt3615)
				  + (class9_sub2.anInt3616
				     * aClass9_Sub2_4886.anInt3616)
				  + (class9_sub2.anInt3622
				     * aClass9_Sub2_4886.anInt3621)) >> 15;
		    int i_218_ = i_216_ + aShort4879 * i_217_ >> 15;
		    int i_219_ = i_216_ + aShort4915 * i_217_ >> 15;
		    int i_220_;
		    int i_221_;
		    if (i_218_ > i_219_) {
			i_220_ = ((i_219_ - aShort4891)
				  * aClass130_Sub1_4888.anInt4036);
			i_221_ = ((i_218_ + aShort4891)
				  * aClass130_Sub1_4888.anInt4036);
		    } else {
			i_220_ = ((i_218_ - aShort4891)
				  * aClass130_Sub1_4888.anInt4036);
			i_221_ = ((i_219_ + aShort4891)
				  * aClass130_Sub1_4888.anInt4036);
		    }
		    if (i_220_ / i_209_ < aClass130_Sub1_4888.anInt4059
			&& i_221_ / i_209_ > aClass130_Sub1_4888.anInt4060) {
			int i_222_;
			int i_223_;
			int i_224_;
			int i_225_;
			int i_226_;
			int i_227_;
			if (bool) {
			    i_222_ = class9_sub2.anInt3617;
			    i_223_ = class9_sub2.anInt3625;
			    i_224_ = class9_sub2.anInt3623;
			    i_225_ = class9_sub2.anInt3618;
			    i_226_ = class9_sub2.anInt3622;
			    i_227_ = class9_sub2.anInt3620;
			} else {
			    i_222_ = ((class9_sub2.anInt3617
				       * aClass9_Sub2_4886.anInt3617)
				      + (class9_sub2.anInt3615
					 * aClass9_Sub2_4886.anInt3625)
				      + (class9_sub2.anInt3618
					 * aClass9_Sub2_4886.anInt3623)) >> 15;
			    i_223_ = ((class9_sub2.anInt3625
				       * aClass9_Sub2_4886.anInt3617)
				      + (class9_sub2.anInt3616
					 * aClass9_Sub2_4886.anInt3625)
				      + (class9_sub2.anInt3622
					 * aClass9_Sub2_4886.anInt3623)) >> 15;
			    i_224_ = ((class9_sub2.anInt3623
				       * aClass9_Sub2_4886.anInt3617)
				      + (class9_sub2.anInt3621
					 * aClass9_Sub2_4886.anInt3625)
				      + (class9_sub2.anInt3620
					 * aClass9_Sub2_4886.anInt3623)) >> 15;
			    i_225_ = ((class9_sub2.anInt3617
				       * aClass9_Sub2_4886.anInt3618)
				      + (class9_sub2.anInt3615
					 * aClass9_Sub2_4886.anInt3622)
				      + (class9_sub2.anInt3618
					 * aClass9_Sub2_4886.anInt3620)) >> 15;
			    i_226_ = ((class9_sub2.anInt3625
				       * aClass9_Sub2_4886.anInt3618)
				      + (class9_sub2.anInt3616
					 * aClass9_Sub2_4886.anInt3622)
				      + (class9_sub2.anInt3622
					 * aClass9_Sub2_4886.anInt3620)) >> 15;
			    i_227_ = ((class9_sub2.anInt3623
				       * aClass9_Sub2_4886.anInt3618)
				      + (class9_sub2.anInt3621
					 * aClass9_Sub2_4886.anInt3622)
				      + (class9_sub2.anInt3620
					 * aClass9_Sub2_4886.anInt3620)) >> 15;
			}
			if (aClass130_Sub1_4888.anInt4049 > 1) {
			    synchronized (this) {
				while (aBoolean4855) {
				    try {
					this.wait();
				    } catch (InterruptedException interruptedexception) {
					/* empty */
				    }
				}
			    }
			    aBoolean4855 = true;
			}
			method2329(Thread.currentThread());
			boolean bool_228_ = false;
			boolean bool_229_
			    = i_208_ <= aClass130_Sub1_4888.anInt4043;
			boolean bool_230_ = (bool_229_ || anInt4862 > 0
					     || aClass41Array4866 != null
					     || aClass104Array4859 != null);
			aClass125_4911.anInt1669 = aClass65_4865.anInt825;
			aClass125_4911.anInt1677 = aClass65_4865.anInt822;
			aClass125_4911.anInt1647 = aClass65_4865.anInt821;
			int i_231_ = aClass130_Sub1_4888.anInt4068;
			int i_232_ = aClass130_Sub1_4888.anInt4036;
			int i_233_ = aClass130_Sub1_4888.anInt4043;
			if (arg3 == -1) {
			    for (int i_234_ = 0; i_234_ < anInt4916;
				 i_234_++) {
				int i_235_ = anIntArray4893[i_234_];
				int i_236_ = anIntArray4919[i_234_];
				int i_237_ = anIntArray4902[i_234_];
				int i_238_
				    = ((i_210_ + i_222_ * i_235_
					+ i_211_ * i_236_ + i_225_ * i_237_)
				       >> 15);
				int i_239_
				    = ((i_216_ + i_223_ * i_235_
					+ i_217_ * i_236_ + i_226_ * i_237_)
				       >> 15);
				int i_240_
				    = ((i + i_224_ * i_235_ + i_205_ * i_236_
					+ i_227_ * i_237_)
				       >> 15);
				anIntArray4895[i_234_] = i_240_ - i_208_;
				anIntArray4867[i_234_] = i_240_;
				if (i_240_ >= i_233_) {
				    anIntArray4904[i_234_]
					= (aClass125_4911.anInt1677
					   + i_238_ * i_231_ / i_240_);
				    anIntArray4890[i_234_]
					= (aClass125_4911.anInt1647
					   + i_239_ * i_232_ / i_240_);
				} else {
				    anIntArray4904[i_234_] = -5000;
				    bool_228_ = true;
				}
				if (bool_230_) {
				    anIntArray4909[i_234_] = i_238_;
				    anIntArray4858[i_234_] = i_239_;
				    anIntArray4940[i_234_] = i_240_;
				}
				if (aClass130_Sub1_4888.aBoolean4056)
				    anIntArray4910[i_234_]
					= (aClass9_Sub2_4886.anInt3624
					   + (((aClass9_Sub2_4886.anInt3625
						* i_235_)
					       + (aClass9_Sub2_4886.anInt3616
						  * i_236_)
					       + (aClass9_Sub2_4886.anInt3622
						  * i_237_))
					      >> 15));
			    }
			} else {
			    for (int i_241_ = 0; i_241_ < anInt4916;
				 i_241_++) {
				int i_242_ = anIntArray4893[i_241_];
				int i_243_ = anIntArray4919[i_241_];
				int i_244_ = anIntArray4902[i_241_];
				int i_245_
				    = ((i_210_ + i_222_ * i_242_
					+ i_211_ * i_243_ + i_225_ * i_244_)
				       >> 15);
				int i_246_
				    = ((i_216_ + i_223_ * i_242_
					+ i_217_ * i_243_ + i_226_ * i_244_)
				       >> 15);
				int i_247_
				    = ((i + i_224_ * i_242_ + i_205_ * i_243_
					+ i_227_ * i_244_)
				       >> 15);
				anIntArray4895[i_241_] = i_247_ - i_208_;
				anIntArray4867[i_241_] = i_247_;
				if (i_247_ >= i_233_) {
				    anIntArray4904[i_241_]
					= (aClass125_4911.anInt1677
					   + i_245_ * i_231_ / arg3);
				    anIntArray4890[i_241_]
					= (aClass125_4911.anInt1647
					   + i_246_ * i_232_ / arg3);
				} else {
				    anIntArray4904[i_241_] = -5000;
				    bool_228_ = true;
				}
				if (bool_230_) {
				    anIntArray4909[i_241_] = i_245_;
				    anIntArray4858[i_241_] = i_246_;
				    anIntArray4940[i_241_] = i_247_;
				}
				if (aClass130_Sub1_4888.aBoolean4056)
				    anIntArray4910[i_241_]
					= (aClass9_Sub2_4886.anInt3624
					   + (((aClass9_Sub2_4886.anInt3625
						* i_242_)
					       + (aClass9_Sub2_4886.anInt3616
						  * i_243_)
					       + (aClass9_Sub2_4886.anInt3622
						  * i_244_))
					      >> 15));
			    }
			}
			int i_248_ = 0;
			if (arg2 != null) {
			    for (Class1_Sub7_Sub1 class1_sub7_sub1
				     = ((Class1_Sub7_Sub1)
					arg2.aClass142_1375
					    .method2139((byte) 113));
				 class1_sub7_sub1 != null;
				 class1_sub7_sub1 = ((Class1_Sub7_Sub1)
						     arg2.aClass142_1375
							 .method2137(28148))) {
				int i_249_ = class1_sub7_sub1.anInt5215 >> 12;
				int i_250_ = class1_sub7_sub1.anInt5219 >> 12;
				int i_251_ = class1_sub7_sub1.anInt5211 >> 12;
				int i_252_
				    = (class9_sub2.anInt3626
				       + ((class9_sub2.anInt3617 * i_249_
					   + class9_sub2.anInt3615 * i_250_
					   + class9_sub2.anInt3618 * i_251_)
					  >> 15));
				int i_253_
				    = (class9_sub2.anInt3624
				       + ((class9_sub2.anInt3625 * i_249_
					   + class9_sub2.anInt3616 * i_250_
					   + class9_sub2.anInt3622 * i_251_)
					  >> 15));
				int i_254_
				    = (class9_sub2.anInt3619
				       + ((class9_sub2.anInt3623 * i_249_
					   + class9_sub2.anInt3621 * i_250_
					   + class9_sub2.anInt3620 * i_251_)
					  >> 15));
				if (i_254_ >= i_233_) {
				    anIntArray4938[i_248_]
					= (aClass130_Sub1_4888.anInt4053
					   + i_252_ * i_231_ / i_254_);
				    anIntArray4943[i_248_]
					= (aClass130_Sub1_4888.anInt4065
					   + i_253_ * i_232_ / i_254_);
				    anIntArray4868[i_248_] = i_254_;
				    anIntArray4883[i_248_] = i_254_ - i_208_;
				    aClass1_Sub7_Sub1Array4941[i_248_]
					= class1_sub7_sub1;
				} else
				    anIntArray4883[i_248_] = -2147483648;
				i_248_++;
			    }
			}
			if (arg1 != null) {
			    boolean bool_255_ = false;
			    boolean bool_256_ = true;
			    int i_257_ = aShort4861 + aShort4889 >> 1;
			    int i_258_ = aShort4882 + aShort4864 >> 1;
			    int i_259_ = i_257_;
			    int i_260_ = aShort4879;
			    int i_261_ = i_258_;
			    int i_262_ = ((i_210_ + i_222_ * i_259_
					   + i_211_ * i_260_ + i_225_ * i_261_)
					  >> 15);
			    int i_263_ = ((i_216_ + i_223_ * i_259_
					   + i_217_ * i_260_ + i_226_ * i_261_)
					  >> 15);
			    int i_264_ = ((i + i_224_ * i_259_
					   + i_205_ * i_260_ + i_227_ * i_261_)
					  >> 15);
			    if (i_264_ >= i_233_) {
				int i_265_ = i_264_;
				if (arg3 != -1)
				    i_265_ = arg3;
				arg1.anInt3561 = (aClass130_Sub1_4888.anInt4053
						  + i_262_ * i_231_ / i_265_);
				arg1.anInt3557 = (aClass130_Sub1_4888.anInt4065
						  + i_263_ * i_232_ / i_265_);
			    } else
				bool_255_ = true;
			    i_259_ = i_257_;
			    i_260_ = aShort4915;
			    i_261_ = i_258_;
			    int i_266_ = ((i_210_ + i_222_ * i_259_
					   + i_211_ * i_260_ + i_225_ * i_261_)
					  >> 15);
			    int i_267_ = ((i_216_ + i_223_ * i_259_
					   + i_217_ * i_260_ + i_226_ * i_261_)
					  >> 15);
			    int i_268_ = ((i + i_224_ * i_259_
					   + i_205_ * i_260_ + i_227_ * i_261_)
					  >> 15);
			    if (i_268_ >= i_233_) {
				int i_269_ = i_268_;
				if (arg3 != -1)
				    i_269_ = arg3;
				arg1.anInt3560 = (aClass130_Sub1_4888.anInt4053
						  + i_266_ * i_231_ / i_269_);
				arg1.anInt3559 = (aClass130_Sub1_4888.anInt4065
						  + i_267_ * i_232_ / i_269_);
			    } else
				bool_255_ = true;
			    if (bool_255_) {
				if (i_264_ < i_233_ && i_268_ < i_233_)
				    bool_256_ = false;
				else if (i_264_ < i_233_) {
				    int i_270_ = (i_268_ - (aClass130_Sub1_4888
							    .anInt4043)
						  << 16) / (i_268_ - i_264_);
				    int i_271_
					= i_266_ + ((i_266_ - i_262_) * i_270_
						    >> 16);
				    int i_272_
					= i_267_ + ((i_267_ - i_263_) * i_270_
						    >> 16);
				    int i_273_ = i_233_;
				    if (arg3 != -1)
					i_273_ = arg3;
				    arg1.anInt3561
					= (aClass130_Sub1_4888.anInt4053
					   + i_271_ * i_231_ / i_273_);
				    arg1.anInt3557
					= (aClass130_Sub1_4888.anInt4065
					   + i_272_ * i_232_ / i_273_);
				} else if (i_268_ < i_233_) {
				    int i_274_ = ((i_264_ - i_233_ << 16)
						  / (i_264_ - i_268_));
				    int i_275_
					= i_262_ + ((i_262_ - i_266_) * i_274_
						    >> 16);
				    int i_276_
					= i_263_ + ((i_263_ - i_267_) * i_274_
						    >> 16);
				    int i_277_ = i_233_;
				    if (arg3 != -1)
					i_277_ = arg3;
				    arg1.anInt3561
					= (aClass130_Sub1_4888.anInt4053
					   + i_275_ * i_231_ / i_277_);
				    arg1.anInt3557
					= (aClass130_Sub1_4888.anInt4065
					   + i_276_ * i_232_ / i_277_);
				}
			    }
			    if (bool_256_) {
				if (i_264_ > i_268_) {
				    int i_278_ = i_264_;
				    if (arg3 != -1)
					i_278_ = arg3;
				    arg1.anInt3558
					= (aClass130_Sub1_4888.anInt4053
					   + ((i_262_ + aShort4891) * i_231_
					      / i_278_)
					   - arg1.anInt3561);
				} else {
				    int i_279_ = i_268_;
				    if (arg3 != -1)
					i_279_ = arg3;
				    arg1.anInt3558
					= (aClass130_Sub1_4888.anInt4053
					   + ((i_266_ + aShort4891) * i_231_
					      / i_279_)
					   - arg1.anInt3560);
				}
				arg1.aBoolean3556 = true;
			    }
			}
			method2311(true);
			aClass65_4865.aBoolean823 = (arg4 & 0x1) == 0;
			try {
			    method2334(bool_228_,
				       ((aClass130_Sub1_4888.aBoolean4046
					 && (i_209_
					     > aClass130_Sub1_4888.anInt4048))
					|| aClass130_Sub1_4888.aBoolean4056),
				       i_209_ - i_208_ + 2, arg2 != null,
				       i_248_);
			} catch (Exception exception) {
			    /* empty */
			}
			aClass65_4865 = null;
			if (aClass130_Sub1_4888.anInt4049 > 1) {
			    synchronized (this) {
				aBoolean4855 = false;
				this.notifyAll();
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2315() {
	for (int i = 0; i < anInt4916; i++) {
	    int i_280_ = anIntArray4893[i];
	    anIntArray4893[i] = anIntArray4902[i];
	    anIntArray4902[i] = -i_280_;
	}
	method2326();
    }
    
    public boolean method2278(int arg0, int arg1, Class9 arg2, boolean arg3) {
	aClass9_Sub2_4886 = (Class9_Sub2) arg2;
	Class9_Sub2 class9_sub2 = aClass130_Sub1_4888.aClass9_Sub2_4058;
	int i = (class9_sub2.anInt3626
		 + ((class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3626
		     + class9_sub2.anInt3615 * aClass9_Sub2_4886.anInt3624
		     + class9_sub2.anInt3618 * aClass9_Sub2_4886.anInt3619)
		    >> 15));
	int i_281_
	    = (class9_sub2.anInt3624
	       + ((class9_sub2.anInt3625 * aClass9_Sub2_4886.anInt3626
		   + class9_sub2.anInt3616 * aClass9_Sub2_4886.anInt3624
		   + class9_sub2.anInt3622 * aClass9_Sub2_4886.anInt3619)
		  >> 15));
	int i_282_
	    = (class9_sub2.anInt3619
	       + ((class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3626
		   + class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3624
		   + class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3619)
		  >> 15));
	int i_283_ = ((class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3617
		       + class9_sub2.anInt3615 * aClass9_Sub2_4886.anInt3625
		       + class9_sub2.anInt3618 * aClass9_Sub2_4886.anInt3623)
		      >> 15);
	int i_284_ = ((class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3615
		       + class9_sub2.anInt3615 * aClass9_Sub2_4886.anInt3616
		       + class9_sub2.anInt3618 * aClass9_Sub2_4886.anInt3621)
		      >> 15);
	int i_285_ = ((class9_sub2.anInt3617 * aClass9_Sub2_4886.anInt3618
		       + class9_sub2.anInt3615 * aClass9_Sub2_4886.anInt3622
		       + class9_sub2.anInt3618 * aClass9_Sub2_4886.anInt3620)
		      >> 15);
	int i_286_ = ((class9_sub2.anInt3625 * aClass9_Sub2_4886.anInt3617
		       + class9_sub2.anInt3616 * aClass9_Sub2_4886.anInt3625
		       + class9_sub2.anInt3622 * aClass9_Sub2_4886.anInt3623)
		      >> 15);
	int i_287_ = ((class9_sub2.anInt3625 * aClass9_Sub2_4886.anInt3615
		       + class9_sub2.anInt3616 * aClass9_Sub2_4886.anInt3616
		       + class9_sub2.anInt3622 * aClass9_Sub2_4886.anInt3621)
		      >> 15);
	int i_288_ = ((class9_sub2.anInt3625 * aClass9_Sub2_4886.anInt3618
		       + class9_sub2.anInt3616 * aClass9_Sub2_4886.anInt3622
		       + class9_sub2.anInt3622 * aClass9_Sub2_4886.anInt3620)
		      >> 15);
	int i_289_ = ((class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3617
		       + class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3625
		       + class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3623)
		      >> 15);
	int i_290_ = ((class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3615
		       + class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3616
		       + class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3621)
		      >> 15);
	int i_291_ = ((class9_sub2.anInt3623 * aClass9_Sub2_4886.anInt3618
		       + class9_sub2.anInt3621 * aClass9_Sub2_4886.anInt3622
		       + class9_sub2.anInt3620 * aClass9_Sub2_4886.anInt3620)
		      >> 15);
	boolean bool = false;
	int i_292_ = aClass130_Sub1_4888.anInt4053;
	int i_293_ = aClass130_Sub1_4888.anInt4065;
	int i_294_ = aClass130_Sub1_4888.anInt4068;
	int i_295_ = aClass130_Sub1_4888.anInt4036;
	int i_296_ = 2147483647;
	int i_297_ = -2147483648;
	int i_298_ = 2147483647;
	int i_299_ = -2147483648;
	method2329(Thread.currentThread());
	if (!aBoolean4872)
	    method2331();
	anIntArray4944[0] = aShort4861;
	anIntArray4900[0] = aShort4879;
	anIntArray4877[0] = aShort4882;
	anIntArray4944[1] = aShort4889;
	anIntArray4900[1] = aShort4879;
	anIntArray4877[1] = aShort4882;
	anIntArray4944[2] = aShort4861;
	anIntArray4900[2] = aShort4915;
	anIntArray4877[2] = aShort4882;
	anIntArray4944[3] = aShort4889;
	anIntArray4900[3] = aShort4915;
	anIntArray4877[3] = aShort4882;
	anIntArray4944[4] = aShort4861;
	anIntArray4900[4] = aShort4879;
	anIntArray4877[4] = aShort4864;
	anIntArray4944[5] = aShort4889;
	anIntArray4900[5] = aShort4879;
	anIntArray4877[5] = aShort4864;
	anIntArray4944[6] = aShort4861;
	anIntArray4900[6] = aShort4915;
	anIntArray4877[6] = aShort4864;
	anIntArray4944[7] = aShort4889;
	anIntArray4900[7] = aShort4915;
	anIntArray4877[7] = aShort4864;
	for (int i_300_ = 0; i_300_ < 8; i_300_++) {
	    int i_301_ = anIntArray4944[i_300_];
	    int i_302_ = anIntArray4900[i_300_];
	    int i_303_ = anIntArray4877[i_300_];
	    int i_304_
		= i + (i_283_ * i_301_ + i_284_ * i_302_ + i_285_ * i_303_
		       >> 15);
	    int i_305_
		= i_281_ + (i_286_ * i_301_ + i_287_ * i_302_ + i_288_ * i_303_
			    >> 15);
	    int i_306_
		= i_282_ + (i_289_ * i_301_ + i_290_ * i_302_ + i_291_ * i_303_
			    >> 15);
	    if (i_306_ >= aClass130_Sub1_4888.anInt4043) {
		int i_307_ = i_292_ + i_304_ * i_294_ / i_306_;
		int i_308_ = i_293_ + i_305_ * i_295_ / i_306_;
		if (i_307_ < i_296_)
		    i_296_ = i_307_;
		if (i_307_ > i_297_)
		    i_297_ = i_307_;
		if (i_308_ < i_298_)
		    i_298_ = i_308_;
		if (i_308_ > i_299_)
		    i_299_ = i_308_;
		bool = true;
	    }
	}
	if (bool && arg0 > i_296_ && arg0 < i_297_ && arg1 > i_298_
	    && arg1 < i_299_) {
	    if (arg3)
		return true;
	    for (int i_309_ = 0; i_309_ < anInt4916; i_309_++) {
		int i_310_ = anIntArray4893[i_309_];
		int i_311_ = anIntArray4919[i_309_];
		int i_312_ = anIntArray4902[i_309_];
		int i_313_
		    = i + (i_283_ * i_310_ + i_284_ * i_311_ + i_285_ * i_312_
			   >> 15);
		int i_314_
		    = (i_281_
		       + (i_286_ * i_310_ + i_287_ * i_311_ + i_288_ * i_312_
			  >> 15));
		int i_315_
		    = (i_282_
		       + (i_289_ * i_310_ + i_290_ * i_311_ + i_291_ * i_312_
			  >> 15));
		if (i_315_ >= aClass130_Sub1_4888.anInt4043) {
		    anIntArray4904[i_309_] = i_292_ + i_313_ * i_294_ / i_315_;
		    anIntArray4890[i_309_] = i_293_ + i_314_ * i_295_ / i_315_;
		} else
		    anIntArray4904[i_309_] = -999999;
	    }
	    for (int i_316_ = 0; i_316_ < anInt4939; i_316_++) {
		if (anIntArray4904[aShortArray4931[i_316_]] != -999999
		    && anIntArray4904[aShortArray4901[i_316_]] != -999999
		    && anIntArray4904[aShortArray4912[i_316_]] != -999999
		    && method2330(arg0, arg1,
				  anIntArray4890[aShortArray4931[i_316_]],
				  anIntArray4890[aShortArray4901[i_316_]],
				  anIntArray4890[aShortArray4912[i_316_]],
				  anIntArray4904[aShortArray4931[i_316_]],
				  anIntArray4904[aShortArray4901[i_316_]],
				  anIntArray4904[aShortArray4912[i_316_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public int method2256() {
	if (!aBoolean4872)
	    method2331();
	return aShort4879;
    }
    
    public void method2269(int arg0, int arg1, Class68 arg2, Class68 arg3,
			   int arg4, int arg5, int arg6) {
	if (arg0 == 3) {
	    if ((anInt4914 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt4914 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBoolean4872)
	    method2331();
	int i = arg4 + aShort4861;
	int i_317_ = arg4 + aShort4889;
	int i_318_ = arg6 + aShort4882;
	int i_319_ = arg6 + aShort4864;
	if (arg0 == 4
	    || (i >= 0 && i_317_ + 128 >> 7 < arg2.anInt924 && i_318_ >= 0
		&& i_319_ + 128 >> 7 < arg2.anInt916)) {
	    int[][] is = ((Class68_Sub2) arg2).anIntArrayArray3848;
	    int[][] is_320_ = null;
	    if (arg3 != null)
		is_320_ = ((Class68_Sub2) arg3).anIntArrayArray3848;
	    if (arg0 == 4 || arg0 == 5) {
		if (arg3 == null
		    || (i < 0 || i_317_ + 128 >> 7 >= arg3.anInt924
			|| i_318_ < 0 || i_319_ + 128 >> 7 >= arg3.anInt916))
		    return;
	    } else {
		i >>= 7;
		i_317_ = i_317_ + 127 >> 7;
		i_318_ >>= 7;
		i_319_ = i_319_ + 127 >> 7;
		if (is[i][i_318_] == arg5 && is[i_317_][i_318_] == arg5
		    && is[i][i_319_] == arg5 && is[i_317_][i_319_] == arg5)
		    return;
	    }
	    if (arg0 == 1) {
		for (int i_321_ = 0; i_321_ < anInt4860; i_321_++) {
		    int i_322_ = anIntArray4893[i_321_] + arg4;
		    int i_323_ = anIntArray4902[i_321_] + arg6;
		    int i_324_ = i_322_ & 0x7f;
		    int i_325_ = i_323_ & 0x7f;
		    int i_326_ = i_322_ >> 7;
		    int i_327_ = i_323_ >> 7;
		    int i_328_ = ((is[i_326_][i_327_] * (128 - i_324_)
				   + is[i_326_ + 1][i_327_] * i_324_)
				  >> 7);
		    int i_329_ = ((is[i_326_][i_327_ + 1] * (128 - i_324_)
				   + is[i_326_ + 1][i_327_ + 1] * i_324_)
				  >> 7);
		    int i_330_
			= i_328_ * (128 - i_325_) + i_329_ * i_325_ >> 7;
		    anIntArray4919[i_321_]
			= anIntArray4919[i_321_] + i_330_ - arg5;
		}
		for (int i_331_ = anInt4860; i_331_ < anInt4916; i_331_++) {
		    int i_332_ = anIntArray4893[i_331_] + arg4;
		    int i_333_ = anIntArray4902[i_331_] + arg6;
		    int i_334_ = i_332_ & 0x7f;
		    int i_335_ = i_333_ & 0x7f;
		    int i_336_ = i_332_ >> 7;
		    int i_337_ = i_333_ >> 7;
		    if (i_336_ >= 0 && i_336_ < is.length - 1 && i_337_ >= 0
			&& i_337_ < is[0].length - 1) {
			int i_338_ = ((is[i_336_][i_337_] * (128 - i_334_)
				       + is[i_336_ + 1][i_337_] * i_334_)
				      >> 7);
			int i_339_ = ((is[i_336_][i_337_ + 1] * (128 - i_334_)
				       + is[i_336_ + 1][i_337_ + 1] * i_334_)
				      >> 7);
			int i_340_
			    = i_338_ * (128 - i_335_) + i_339_ * i_335_ >> 7;
			anIntArray4919[i_331_]
			    = anIntArray4919[i_331_] + i_340_ - arg5;
		    }
		}
	    } else if (arg0 == 2) {
		for (int i_341_ = 0; i_341_ < anInt4860; i_341_++) {
		    int i_342_ = (anIntArray4919[i_341_] << 16) / aShort4879;
		    if (i_342_ < arg1) {
			int i_343_ = anIntArray4893[i_341_] + arg4;
			int i_344_ = anIntArray4902[i_341_] + arg6;
			int i_345_ = i_343_ & 0x7f;
			int i_346_ = i_344_ & 0x7f;
			int i_347_ = i_343_ >> 7;
			int i_348_ = i_344_ >> 7;
			int i_349_ = ((is[i_347_][i_348_] * (128 - i_345_)
				       + is[i_347_ + 1][i_348_] * i_345_)
				      >> 7);
			int i_350_ = ((is[i_347_][i_348_ + 1] * (128 - i_345_)
				       + is[i_347_ + 1][i_348_ + 1] * i_345_)
				      >> 7);
			int i_351_
			    = i_349_ * (128 - i_346_) + i_350_ * i_346_ >> 7;
			anIntArray4919[i_341_]
			    = (anIntArray4919[i_341_]
			       + (i_351_ - arg5) * (arg1 - i_342_) / arg1);
		    } else
			anIntArray4919[i_341_] = anIntArray4919[i_341_];
		}
		for (int i_352_ = anInt4860; i_352_ < anInt4916; i_352_++) {
		    int i_353_ = (anIntArray4919[i_352_] << 16) / aShort4879;
		    if (i_353_ < arg1) {
			int i_354_ = anIntArray4893[i_352_] + arg4;
			int i_355_ = anIntArray4902[i_352_] + arg6;
			int i_356_ = i_354_ & 0x7f;
			int i_357_ = i_355_ & 0x7f;
			int i_358_ = i_354_ >> 7;
			int i_359_ = i_355_ >> 7;
			if (i_358_ >= 0 && i_358_ < arg2.anInt924 - 1
			    && i_359_ >= 0 && i_359_ < arg2.anInt916 - 1) {
			    int i_360_ = ((is[i_358_][i_359_] * (128 - i_356_)
					   + is[i_358_ + 1][i_359_] * i_356_)
					  >> 7);
			    int i_361_
				= ((is[i_358_][i_359_ + 1] * (128 - i_356_)
				    + is[i_358_ + 1][i_359_ + 1] * i_356_)
				   >> 7);
			    int i_362_
				= (i_360_ * (128 - i_357_) + i_361_ * i_357_
				   >> 7);
			    anIntArray4919[i_352_]
				= (anIntArray4919[i_352_]
				   + (i_362_ - arg5) * (arg1 - i_353_) / arg1);
			}
		    } else
			anIntArray4919[i_352_] = anIntArray4919[i_352_];
		}
	    } else if (arg0 == 3) {
		int i_363_ = (arg1 & 0xff) * 4;
		int i_364_ = (arg1 >> 8 & 0xff) * 4;
		if (arg4 - (i_363_ >> 1) < 0
		    || arg4 + (i_363_ >> 1) + 128 >= arg2.anInt924
		    || arg6 - (i_364_ >> 1) < 0
		    || arg6 + (i_364_ >> 1) + 128 >= arg2.anInt916)
		    return;
		this.method2255(-1, arg4, arg5, arg2, i_363_, arg6, i_364_);
	    } else if (arg0 == 4) {
		int i_365_ = aShort4915 - aShort4879;
		for (int i_366_ = 0; i_366_ < anInt4860; i_366_++) {
		    int i_367_ = anIntArray4893[i_366_] + arg4;
		    int i_368_ = anIntArray4902[i_366_] + arg6;
		    int i_369_ = i_367_ & 0x7f;
		    int i_370_ = i_368_ & 0x7f;
		    int i_371_ = i_367_ >> 7;
		    int i_372_ = i_368_ >> 7;
		    int i_373_ = ((is_320_[i_371_][i_372_] * (128 - i_369_)
				   + is_320_[i_371_ + 1][i_372_] * i_369_)
				  >> 7);
		    int i_374_ = ((is_320_[i_371_][i_372_ + 1] * (128 - i_369_)
				   + is_320_[i_371_ + 1][i_372_ + 1] * i_369_)
				  >> 7);
		    int i_375_
			= i_373_ * (128 - i_370_) + i_374_ * i_370_ >> 7;
		    anIntArray4919[i_366_]
			= anIntArray4919[i_366_] + (i_375_ - arg5) + i_365_;
		}
		for (int i_376_ = anInt4860; i_376_ < anInt4916; i_376_++) {
		    int i_377_ = anIntArray4893[i_376_] + arg4;
		    int i_378_ = anIntArray4902[i_376_] + arg6;
		    int i_379_ = i_377_ & 0x7f;
		    int i_380_ = i_378_ & 0x7f;
		    int i_381_ = i_377_ >> 7;
		    int i_382_ = i_378_ >> 7;
		    if (i_381_ >= 0 && i_381_ < arg3.anInt924 - 1
			&& i_382_ >= 0 && i_382_ < arg3.anInt916 - 1) {
			int i_383_ = ((is_320_[i_381_][i_382_] * (128 - i_379_)
				       + is_320_[i_381_ + 1][i_382_] * i_379_)
				      >> 7);
			int i_384_
			    = ((is_320_[i_381_][i_382_ + 1] * (128 - i_379_)
				+ is_320_[i_381_ + 1][i_382_ + 1] * i_379_)
			       >> 7);
			int i_385_
			    = i_383_ * (128 - i_380_) + i_384_ * i_380_ >> 7;
			anIntArray4919[i_376_] = (anIntArray4919[i_376_]
						  + (i_385_ - arg5) + i_365_);
		    }
		}
	    } else if (arg0 == 5) {
		int i_386_ = aShort4915 - aShort4879;
		for (int i_387_ = 0; i_387_ < anInt4860; i_387_++) {
		    int i_388_ = anIntArray4893[i_387_] + arg4;
		    int i_389_ = anIntArray4902[i_387_] + arg6;
		    int i_390_ = i_388_ & 0x7f;
		    int i_391_ = i_389_ & 0x7f;
		    int i_392_ = i_388_ >> 7;
		    int i_393_ = i_389_ >> 7;
		    int i_394_ = ((is[i_392_][i_393_] * (128 - i_390_)
				   + is[i_392_ + 1][i_393_] * i_390_)
				  >> 7);
		    int i_395_ = ((is[i_392_][i_393_ + 1] * (128 - i_390_)
				   + is[i_392_ + 1][i_393_ + 1] * i_390_)
				  >> 7);
		    int i_396_
			= i_394_ * (128 - i_391_) + i_395_ * i_391_ >> 7;
		    i_394_ = (is_320_[i_392_][i_393_] * (128 - i_390_)
			      + is_320_[i_392_ + 1][i_393_] * i_390_) >> 7;
		    i_395_ = (is_320_[i_392_][i_393_ + 1] * (128 - i_390_)
			      + is_320_[i_392_ + 1][i_393_ + 1] * i_390_) >> 7;
		    int i_397_
			= i_394_ * (128 - i_391_) + i_395_ * i_391_ >> 7;
		    int i_398_ = i_396_ - i_397_;
		    anIntArray4919[i_387_]
			= ((anIntArray4919[i_387_] << 8) / i_386_ * i_398_
			   >> 8) - (arg5 - i_396_);
		}
		for (int i_399_ = anInt4860; i_399_ < anInt4916; i_399_++) {
		    int i_400_ = anIntArray4893[i_399_] + arg4;
		    int i_401_ = anIntArray4902[i_399_] + arg6;
		    int i_402_ = i_400_ & 0x7f;
		    int i_403_ = i_401_ & 0x7f;
		    int i_404_ = i_400_ >> 7;
		    int i_405_ = i_401_ >> 7;
		    if (i_404_ >= 0 && i_404_ < arg2.anInt924 - 1
			&& i_404_ < arg3.anInt924 - 1 && i_405_ >= 0
			&& i_405_ < arg2.anInt916 - 1
			&& i_405_ < arg3.anInt916 - 1) {
			int i_406_ = ((is[i_404_][i_405_] * (128 - i_402_)
				       + is[i_404_ + 1][i_405_] * i_402_)
				      >> 7);
			int i_407_ = ((is[i_404_][i_405_ + 1] * (128 - i_402_)
				       + is[i_404_ + 1][i_405_ + 1] * i_402_)
				      >> 7);
			int i_408_
			    = i_406_ * (128 - i_403_) + i_407_ * i_403_ >> 7;
			i_406_ = (is_320_[i_404_][i_405_] * (128 - i_402_)
				  + is_320_[i_404_ + 1][i_405_] * i_402_) >> 7;
			i_407_ = ((is_320_[i_404_][i_405_ + 1] * (128 - i_402_)
				   + is_320_[i_404_ + 1][i_405_ + 1] * i_402_)
				  >> 7);
			int i_409_
			    = i_406_ * (128 - i_403_) + i_407_ * i_403_ >> 7;
			int i_410_ = i_408_ - i_409_;
			anIntArray4919[i_399_]
			    = ((anIntArray4919[i_399_] << 8) / i_386_ * i_410_
			       >> 8) - (arg5 - i_408_);
		    }
		}
	    }
	    aBoolean4872 = false;
	}
    }
    
    public void method2280() {
	if ((anInt4914 & 0x10) != 16)
	    throw new IllegalStateException();
	for (int i = 0; i < anInt4916; i++)
	    anIntArray4902[i] = -anIntArray4902[i];
	if (aClass132Array4935 != null) {
	    for (int i = 0; i < anInt4860; i++) {
		if (aClass132Array4935[i] != null)
		    aClass132Array4935[i].anInt1798
			= -aClass132Array4935[i].anInt1798;
	    }
	}
	if (aClass132Array4933 != null) {
	    for (int i = 0; i < anInt4860; i++) {
		if (aClass132Array4933[i] != null)
		    aClass132Array4933[i].anInt1798
			= -aClass132Array4933[i].anInt1798;
	    }
	}
	if (aClass24Array4920 != null) {
	    for (int i = 0; i < anInt4939; i++) {
		if (aClass24Array4920[i] != null)
		    aClass24Array4920[i].anInt261
			= -aClass24Array4920[i].anInt261;
	    }
	}
	short[] is = aShortArray4931;
	aShortArray4931 = aShortArray4912;
	aShortArray4912 = is;
	aBoolean4872 = false;
	anInt4917 = 0;
    }
    
    public static void method2316() {
	anIntArray4907 = null;
    }
    
    public int method2317(int arg0) {
	if (arg0 < 2)
	    arg0 = 2;
	else if (arg0 > 126)
	    arg0 = 126;
	return arg0;
    }
    
    public void method2251(int arg0) {
	if ((anInt4914 & 0x3) != 3)
	    throw new IllegalStateException();
	int i = Class31.anIntArray434[arg0];
	int i_411_ = Class31.anIntArray425[arg0];
	for (int i_412_ = 0; i_412_ < anInt4916; i_412_++) {
	    int i_413_
		= (anIntArray4919[i_412_] * i + anIntArray4893[i_412_] * i_411_
		   >> 15);
	    anIntArray4919[i_412_]
		= (anIntArray4919[i_412_] * i_411_ - anIntArray4893[i_412_] * i
		   >> 15);
	    anIntArray4893[i_412_] = i_413_;
	}
	method2326();
    }
    
    public void method2281(short arg0, short arg1) {
	if (aShortArray4929 != null) {
	    for (int i = 0; i < anInt4939; i++) {
		if (aShortArray4929[i] == arg0)
		    aShortArray4929[i] = arg1;
	    }
	}
    }
    
    public void method2248(int arg0) {
	if ((anInt4914 & 0x8000) == 32768 && (arg0 & 0x8000) == 0)
	    method2311(true);
	anInt4914 = arg0;
    }
    
    public void method2318() {
	for (int i = 0; i < anInt4860; i++) {
	    int i_414_ = anIntArray4893[i];
	    anIntArray4893[i] = anIntArray4902[i];
	    anIntArray4902[i] = -i_414_;
	    if (aClass132Array4935[i] != null) {
		i_414_ = aClass132Array4935[i].anInt1796;
		aClass132Array4935[i].anInt1796
		    = aClass132Array4935[i].anInt1798;
		aClass132Array4935[i].anInt1798 = -i_414_;
	    }
	}
	if (aClass24Array4920 != null) {
	    for (int i = 0; i < anInt4939; i++) {
		if (aClass24Array4920[i] != null) {
		    int i_415_ = aClass24Array4920[i].anInt259;
		    aClass24Array4920[i].anInt259
			= aClass24Array4920[i].anInt261;
		    aClass24Array4920[i].anInt261 = -i_415_;
		}
	    }
	}
	for (int i = anInt4860; i < anInt4916; i++) {
	    int i_416_ = anIntArray4893[i];
	    anIntArray4893[i] = anIntArray4902[i];
	    anIntArray4902[i] = -i_416_;
	}
	anInt4917 = 0;
	aBoolean4872 = false;
    }
    
    public void method2272(int arg0, int arg1, int arg2) {
	if (arg0 != 0 && (anInt4914 & 0x1) != 1)
	    throw new IllegalStateException();
	if (arg1 != 0 && (anInt4914 & 0x2) != 2)
	    throw new IllegalStateException();
	if (arg2 != 0 && (anInt4914 & 0x4) != 4)
	    throw new IllegalStateException();
	for (int i = 0; i < anInt4916; i++) {
	    anIntArray4893[i] += arg0;
	    anIntArray4919[i] += arg1;
	    anIntArray4902[i] += arg2;
	}
    }
    
    public int method2277() {
	return anInt4947;
    }
    
    public void method2319() {
	for (int i = 0; i < anInt4860; i++) {
	    int i_417_ = anIntArray4902[i];
	    anIntArray4902[i] = anIntArray4893[i];
	    anIntArray4893[i] = -i_417_;
	    if (aClass132Array4935[i] != null) {
		i_417_ = aClass132Array4935[i].anInt1798;
		aClass132Array4935[i].anInt1798
		    = aClass132Array4935[i].anInt1796;
		aClass132Array4935[i].anInt1796 = -i_417_;
	    }
	}
	if (aClass24Array4920 != null) {
	    for (int i = 0; i < anInt4939; i++) {
		if (aClass24Array4920[i] != null) {
		    int i_418_ = aClass24Array4920[i].anInt261;
		    aClass24Array4920[i].anInt261
			= aClass24Array4920[i].anInt259;
		    aClass24Array4920[i].anInt259 = -i_418_;
		}
	    }
	}
	for (int i = anInt4860; i < anInt4916; i++) {
	    int i_419_ = anIntArray4902[i];
	    anIntArray4902[i] = anIntArray4893[i];
	    anIntArray4893[i] = -i_419_;
	}
	anInt4917 = 0;
	aBoolean4872 = false;
    }
    
    public void method2246() {
	/* empty */
    }
    
    public void method2320() {
	if (anInt4917 == 0)
	    method2311(false);
	else {
	    for (int i = 0; i < anInt4939; i++) {
		short i_420_ = (aShortArray4929 != null ? aShortArray4929[i]
				: (short) -1);
		if (i_420_ == -1) {
		    int i_421_ = aShortArray4903[i] & 0xffff;
		    int i_422_ = (i_421_ & 0x7f) * anInt4856 >> 7;
		    short i_423_
			= Class131_Sub2_Sub22
			      .method1575((byte) 56, i_421_ & ~0x7f | i_422_);
		    if (anIntArray4927[i] == -1) {
			int i_424_ = anIntArray4918[i] & ~0x1ffff;
			anIntArray4918[i]
			    = i_424_ | Class56.method624(i_424_ >> 17,
							 (byte) -33, i_423_);
		    } else if (anIntArray4927[i] != -2) {
			int i_425_ = anIntArray4918[i] & ~0x1ffff;
			anIntArray4918[i]
			    = i_425_ | Class56.method624(i_425_ >> 17,
							 (byte) -33, i_423_);
			i_425_ = anIntArray4942[i] & ~0x1ffff;
			anIntArray4942[i]
			    = i_425_ | Class56.method624(i_425_ >> 17,
							 (byte) -33, i_423_);
			i_425_ = anIntArray4927[i] & ~0x1ffff;
			anIntArray4927[i]
			    = i_425_ | Class56.method624(i_425_ >> 17,
							 (byte) -33, i_423_);
		    }
		}
	    }
	    anInt4917 = 2;
	}
    }
    
    public void method2321() {
	if (anInt4917 == 0 && aClass132Array4935 == null) {
	    aClass132Array4935 = new Class132[anInt4860];
	    for (int i = 0; i < anInt4860; i++)
		aClass132Array4935[i] = new Class132();
	    for (int i = 0; i < anInt4939; i++) {
		short i_426_ = aShortArray4931[i];
		short i_427_ = aShortArray4901[i];
		short i_428_ = aShortArray4912[i];
		int i_429_ = anIntArray4893[i_427_] - anIntArray4893[i_426_];
		int i_430_ = anIntArray4919[i_427_] - anIntArray4919[i_426_];
		int i_431_ = anIntArray4902[i_427_] - anIntArray4902[i_426_];
		int i_432_ = anIntArray4893[i_428_] - anIntArray4893[i_426_];
		int i_433_ = anIntArray4919[i_428_] - anIntArray4919[i_426_];
		int i_434_ = anIntArray4902[i_428_] - anIntArray4902[i_426_];
		int i_435_ = i_430_ * i_434_ - i_433_ * i_431_;
		int i_436_ = i_431_ * i_432_ - i_434_ * i_429_;
		int i_437_;
		for (i_437_ = i_429_ * i_433_ - i_432_ * i_430_;
		     (i_435_ > 8192 || i_436_ > 8192 || i_437_ > 8192
		      || i_435_ < -8192 || i_436_ < -8192 || i_437_ < -8192);
		     i_437_ >>= 1) {
		    i_435_ >>= 1;
		    i_436_ >>= 1;
		}
		int i_438_ = (int) Math.sqrt((double) (i_435_ * i_435_
						       + i_436_ * i_436_
						       + i_437_ * i_437_));
		if (i_438_ <= 0)
		    i_438_ = 1;
		i_435_ = i_435_ * 256 / i_438_;
		i_436_ = i_436_ * 256 / i_438_;
		i_437_ = i_437_ * 256 / i_438_;
		byte i_439_;
		if (aByteArray4874 == null)
		    i_439_ = (byte) 0;
		else
		    i_439_ = aByteArray4874[i];
		if (i_439_ == 0) {
		    Class132 class132 = aClass132Array4935[i_426_];
		    class132.anInt1796 += i_435_;
		    class132.anInt1797 += i_436_;
		    class132.anInt1798 += i_437_;
		    class132.anInt1795++;
		    class132 = aClass132Array4935[i_427_];
		    class132.anInt1796 += i_435_;
		    class132.anInt1797 += i_436_;
		    class132.anInt1798 += i_437_;
		    class132.anInt1795++;
		    class132 = aClass132Array4935[i_428_];
		    class132.anInt1796 += i_435_;
		    class132.anInt1797 += i_436_;
		    class132.anInt1798 += i_437_;
		    class132.anInt1795++;
		} else if (i_439_ == 1) {
		    if (aClass24Array4920 == null)
			aClass24Array4920 = new Class24[anInt4939];
		    Class24 class24 = aClass24Array4920[i] = new Class24();
		    class24.anInt259 = i_435_;
		    class24.anInt260 = i_436_;
		    class24.anInt261 = i_437_;
		}
	    }
	}
    }
    
    public void method2322() {
	for (int i = 0; i < anInt4860; i++) {
	    anIntArray4893[i] = -anIntArray4893[i];
	    anIntArray4902[i] = -anIntArray4902[i];
	    if (aClass132Array4935[i] != null) {
		aClass132Array4935[i].anInt1796
		    = -aClass132Array4935[i].anInt1796;
		aClass132Array4935[i].anInt1798
		    = -aClass132Array4935[i].anInt1798;
	    }
	}
	if (aClass24Array4920 != null) {
	    for (int i = 0; i < anInt4939; i++) {
		if (aClass24Array4920[i] != null) {
		    aClass24Array4920[i].anInt259
			= -aClass24Array4920[i].anInt259;
		    aClass24Array4920[i].anInt261
			= -aClass24Array4920[i].anInt261;
		}
	    }
	}
	for (int i = anInt4860; i < anInt4916; i++) {
	    anIntArray4893[i] = -anIntArray4893[i];
	    anIntArray4902[i] = -anIntArray4902[i];
	}
	anInt4917 = 0;
	aBoolean4872 = false;
    }
    
    public void method2323() {
	for (int i = 0; i < anInt4916; i++) {
	    int i_440_ = anIntArray4902[i];
	    anIntArray4902[i] = anIntArray4893[i];
	    anIntArray4893[i] = -i_440_;
	}
	method2326();
    }
    
    public void method2243(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   int arg5, boolean arg6) {
	int i = arg1.length;
	if (arg0 == 0) {
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    if (!aBoolean4897) {
		for (int i_441_ = 0; i_441_ < anInt4916; i_441_++) {
		    anIntArray4893[i_441_] <<= 4;
		    anIntArray4919[i_441_] <<= 4;
		    anIntArray4902[i_441_] <<= 4;
		}
		aBoolean4897 = true;
	    }
	    int i_442_ = 0;
	    anInt4906 = 0;
	    anInt4949 = 0;
	    anInt4913 = 0;
	    for (int i_443_ = 0; i_443_ < i; i_443_++) {
		int i_444_ = arg1[i_443_];
		if (i_444_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_444_];
		    for (int i_445_ = 0; i_445_ < is.length; i_445_++) {
			int i_446_ = is[i_445_];
			anInt4906 += anIntArray4893[i_446_];
			anInt4949 += anIntArray4919[i_446_];
			anInt4913 += anIntArray4902[i_446_];
			i_442_++;
		    }
		}
	    }
	    if (i_442_ > 0) {
		anInt4906 = anInt4906 / i_442_ + arg2;
		anInt4949 = anInt4949 / i_442_ + arg3;
		anInt4913 = anInt4913 / i_442_ + arg4;
	    } else {
		anInt4906 = arg2;
		anInt4949 = arg3;
		anInt4913 = arg4;
	    }
	} else if (arg0 == 1) {
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    if (!aBoolean4897) {
		for (int i_447_ = 0; i_447_ < anInt4916; i_447_++) {
		    anIntArray4893[i_447_] <<= 4;
		    anIntArray4919[i_447_] <<= 4;
		    anIntArray4902[i_447_] <<= 4;
		}
		aBoolean4897 = true;
	    }
	    for (int i_448_ = 0; i_448_ < i; i_448_++) {
		int i_449_ = arg1[i_448_];
		if (i_449_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_449_];
		    for (int i_450_ = 0; i_450_ < is.length; i_450_++) {
			int i_451_ = is[i_450_];
			anIntArray4893[i_451_] += arg2;
			anIntArray4919[i_451_] += arg3;
			anIntArray4902[i_451_] += arg4;
		    }
		}
	    }
	} else if (arg0 == 2) {
	    for (int i_452_ = 0; i_452_ < i; i_452_++) {
		int i_453_ = arg1[i_452_];
		if (i_453_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_453_];
		    if ((arg5 & 0x1) == 0) {
			for (int i_454_ = 0; i_454_ < is.length; i_454_++) {
			    int i_455_ = is[i_454_];
			    anIntArray4893[i_455_] -= anInt4906;
			    anIntArray4919[i_455_] -= anInt4949;
			    anIntArray4902[i_455_] -= anInt4913;
			    if (arg4 != 0) {
				int i_456_ = Class31.anIntArray434[arg4];
				int i_457_ = Class31.anIntArray425[arg4];
				int i_458_ = (anIntArray4919[i_455_] * i_456_
					      + anIntArray4893[i_455_] * i_457_
					      + 32767) >> 15;
				anIntArray4919[i_455_]
				    = (anIntArray4919[i_455_] * i_457_
				       - anIntArray4893[i_455_] * i_456_
				       + 32767) >> 15;
				anIntArray4893[i_455_] = i_458_;
			    }
			    if (arg2 != 0) {
				int i_459_ = Class31.anIntArray434[arg2];
				int i_460_ = Class31.anIntArray425[arg2];
				int i_461_ = (anIntArray4919[i_455_] * i_460_
					      - anIntArray4902[i_455_] * i_459_
					      + 32767) >> 15;
				anIntArray4902[i_455_]
				    = (anIntArray4919[i_455_] * i_459_
				       + anIntArray4902[i_455_] * i_460_
				       + 32767) >> 15;
				anIntArray4919[i_455_] = i_461_;
			    }
			    if (arg3 != 0) {
				int i_462_ = Class31.anIntArray434[arg3];
				int i_463_ = Class31.anIntArray425[arg3];
				int i_464_ = (anIntArray4902[i_455_] * i_462_
					      + anIntArray4893[i_455_] * i_463_
					      + 32767) >> 15;
				anIntArray4902[i_455_]
				    = (anIntArray4902[i_455_] * i_463_
				       - anIntArray4893[i_455_] * i_462_
				       + 32767) >> 15;
				anIntArray4893[i_455_] = i_464_;
			    }
			    anIntArray4893[i_455_] += anInt4906;
			    anIntArray4919[i_455_] += anInt4949;
			    anIntArray4902[i_455_] += anInt4913;
			}
		    } else {
			for (int i_465_ = 0; i_465_ < is.length; i_465_++) {
			    int i_466_ = is[i_465_];
			    anIntArray4893[i_466_] -= anInt4906;
			    anIntArray4919[i_466_] -= anInt4949;
			    anIntArray4902[i_466_] -= anInt4913;
			    if (arg2 != 0) {
				int i_467_ = Class31.anIntArray434[arg2];
				int i_468_ = Class31.anIntArray425[arg2];
				int i_469_ = (anIntArray4919[i_466_] * i_468_
					      - anIntArray4902[i_466_] * i_467_
					      + 32767) >> 15;
				anIntArray4902[i_466_]
				    = (anIntArray4919[i_466_] * i_467_
				       + anIntArray4902[i_466_] * i_468_
				       + 32767) >> 15;
				anIntArray4919[i_466_] = i_469_;
			    }
			    if (arg4 != 0) {
				int i_470_ = Class31.anIntArray434[arg4];
				int i_471_ = Class31.anIntArray425[arg4];
				int i_472_ = (anIntArray4919[i_466_] * i_470_
					      + anIntArray4893[i_466_] * i_471_
					      + 32767) >> 15;
				anIntArray4919[i_466_]
				    = (anIntArray4919[i_466_] * i_471_
				       - anIntArray4893[i_466_] * i_470_
				       + 32767) >> 15;
				anIntArray4893[i_466_] = i_472_;
			    }
			    if (arg3 != 0) {
				int i_473_ = Class31.anIntArray434[arg3];
				int i_474_ = Class31.anIntArray425[arg3];
				int i_475_ = (anIntArray4902[i_466_] * i_473_
					      + anIntArray4893[i_466_] * i_474_
					      + 32767) >> 15;
				anIntArray4902[i_466_]
				    = (anIntArray4902[i_466_] * i_474_
				       - anIntArray4893[i_466_] * i_473_
				       + 32767) >> 15;
				anIntArray4893[i_466_] = i_475_;
			    }
			    anIntArray4893[i_466_] += anInt4906;
			    anIntArray4919[i_466_] += anInt4949;
			    anIntArray4902[i_466_] += anInt4913;
			}
		    }
		}
	    }
	} else if (arg0 == 3) {
	    for (int i_476_ = 0; i_476_ < i; i_476_++) {
		int i_477_ = arg1[i_476_];
		if (i_477_ < anIntArrayArray4898.length) {
		    int[] is = anIntArrayArray4898[i_477_];
		    for (int i_478_ = 0; i_478_ < is.length; i_478_++) {
			int i_479_ = is[i_478_];
			anIntArray4893[i_479_] -= anInt4906;
			anIntArray4919[i_479_] -= anInt4949;
			anIntArray4902[i_479_] -= anInt4913;
			anIntArray4893[i_479_]
			    = anIntArray4893[i_479_] * arg2 / 128;
			anIntArray4919[i_479_]
			    = anIntArray4919[i_479_] * arg3 / 128;
			anIntArray4902[i_479_]
			    = anIntArray4902[i_479_] * arg4 / 128;
			anIntArray4893[i_479_] += anInt4906;
			anIntArray4919[i_479_] += anInt4949;
			anIntArray4902[i_479_] += anInt4913;
		    }
		}
	    }
	} else if (arg0 == 5) {
	    if (anIntArrayArray4946 != null && aByteArray4908 != null) {
		for (int i_480_ = 0; i_480_ < i; i_480_++) {
		    int i_481_ = arg1[i_480_];
		    if (i_481_ < anIntArrayArray4946.length) {
			int[] is = anIntArrayArray4946[i_481_];
			for (int i_482_ = 0; i_482_ < is.length; i_482_++) {
			    int i_483_ = is[i_482_];
			    int i_484_
				= (aByteArray4908[i_483_] & 0xff) + arg2 * 8;
			    if (i_484_ < 0)
				i_484_ = 0;
			    else if (i_484_ > 255)
				i_484_ = 255;
			    aByteArray4908[i_483_] = (byte) i_484_;
			}
		    }
		}
	    }
	} else if (arg0 == 7 && anIntArrayArray4946 != null) {
	    for (int i_485_ = 0; i_485_ < i; i_485_++) {
		int i_486_ = arg1[i_485_];
		if (i_486_ < anIntArrayArray4946.length) {
		    int[] is = anIntArrayArray4946[i_486_];
		    for (int i_487_ = 0; i_487_ < is.length; i_487_++) {
			int i_488_ = is[i_487_];
			int i_489_ = aShortArray4903[i_488_] & 0xffff;
			int i_490_ = i_489_ >> 10 & 0x3f;
			int i_491_ = i_489_ >> 7 & 0x7;
			int i_492_ = i_489_ & 0x7f;
			i_490_ = i_490_ + arg2 & 0x3f;
			i_491_ += arg3;
			if (i_491_ < 0)
			    i_491_ = 0;
			else if (i_491_ > 7)
			    i_491_ = 7;
			i_492_ += arg4;
			if (i_492_ < 0)
			    i_492_ = 0;
			else if (i_492_ > 127)
			    i_492_ = 127;
			aShortArray4903[i_488_]
			    = (short) (i_490_ << 10 | i_491_ << 7 | i_492_);
		    }
		    aBoolean4936 = true;
		}
	    }
	}
    }
    
    public int method2259() {
	if (!aBoolean4872)
	    method2331();
	return aShort4891;
    }
    
    public Class154 method2324(Class154_Sub2 arg0, Class154_Sub2 arg1,
			       int arg2, boolean arg3, boolean arg4) {
	arg0.aBoolean4872 = aBoolean4872;
	if (aBoolean4872) {
	    arg0.aShort4889 = aShort4889;
	    arg0.aShort4915 = aShort4915;
	    arg0.aShort4864 = aShort4864;
	    arg0.aShort4861 = aShort4861;
	    arg0.aShort4879 = aShort4879;
	    arg0.aShort4882 = aShort4882;
	    arg0.aShort4891 = aShort4891;
	}
	arg0.anInt4856 = anInt4856;
	arg0.anInt4947 = anInt4947;
	arg0.anInt4916 = anInt4916;
	arg0.anInt4860 = anInt4860;
	arg0.anInt4939 = anInt4939;
	boolean bool = (arg2 & 0x7) == 7 | (arg2 & 0x20) != 0;
	boolean bool_493_ = bool || (arg2 & 0x1) != 0;
	boolean bool_494_ = bool || (arg2 & 0x2) != 0;
	boolean bool_495_ = bool || (arg2 & 0x4) != 0 || (arg2 & 0x10) != 0;
	if (bool_493_ || bool_494_ || bool_495_) {
	    if (bool_493_) {
		if (arg1.anIntArray4893 == null
		    || arg1.anIntArray4893.length < anInt4916)
		    arg0.anIntArray4893 = arg1.anIntArray4893
			= new int[anInt4916];
		else
		    arg0.anIntArray4893 = arg1.anIntArray4893;
		for (int i = 0; i < anInt4916; i++)
		    arg0.anIntArray4893[i] = anIntArray4893[i];
	    } else
		arg0.anIntArray4893 = anIntArray4893;
	    if (bool_494_) {
		if (arg1.anIntArray4919 == null
		    || arg1.anIntArray4919.length < anInt4916)
		    arg0.anIntArray4919 = arg1.anIntArray4919
			= new int[anInt4916];
		else
		    arg0.anIntArray4919 = arg1.anIntArray4919;
		for (int i = 0; i < anInt4916; i++)
		    arg0.anIntArray4919[i] = anIntArray4919[i];
	    } else
		arg0.anIntArray4919 = anIntArray4919;
	    if (bool_495_) {
		if (arg1.anIntArray4902 == null
		    || arg1.anIntArray4902.length < anInt4916)
		    arg0.anIntArray4902 = arg1.anIntArray4902
			= new int[anInt4916];
		else
		    arg0.anIntArray4902 = arg1.anIntArray4902;
		for (int i = 0; i < anInt4916; i++)
		    arg0.anIntArray4902[i] = anIntArray4902[i];
	    } else
		arg0.anIntArray4902 = anIntArray4902;
	} else {
	    arg0.anIntArray4893 = anIntArray4893;
	    arg0.anIntArray4919 = anIntArray4919;
	    arg0.anIntArray4902 = anIntArray4902;
	}
	if ((arg2 & 0x80) != 0 || (arg2 & 0x2000) != 0) {
	    if (arg1.aShortArray4903 == null
		|| arg1.aShortArray4903.length < anInt4939) {
		int i = anInt4939;
		arg0.aShortArray4903 = arg1.aShortArray4903 = new short[i];
	    } else
		arg0.aShortArray4903 = arg1.aShortArray4903;
	    for (int i = 0; i < anInt4939; i++)
		arg0.aShortArray4903[i] = aShortArray4903[i];
	} else
	    arg0.aShortArray4903 = aShortArray4903;
	if ((arg2 & 0xba18) != 0) {
	    arg0.anInt4917 = 0;
	    arg0.anIntArray4918 = arg0.anIntArray4942 = arg0.anIntArray4927
		= null;
	} else if ((arg2 & 0x80) != 0) {
	    if (arg4)
		method2311(false);
	    if (anIntArray4918 != null) {
		if (arg1.anIntArray4918 == null
		    || arg1.anIntArray4918.length < anInt4939) {
		    int i = anInt4939;
		    arg0.anIntArray4918 = arg1.anIntArray4918 = new int[i];
		    arg0.anIntArray4942 = arg1.anIntArray4942 = new int[i];
		    arg0.anIntArray4927 = arg1.anIntArray4927 = new int[i];
		} else {
		    arg0.anIntArray4918 = arg1.anIntArray4918;
		    arg0.anIntArray4942 = arg1.anIntArray4942;
		    arg0.anIntArray4927 = arg1.anIntArray4927;
		}
		for (int i = 0; i < anInt4939; i++) {
		    arg0.anIntArray4918[i] = anIntArray4918[i];
		    arg0.anIntArray4942[i] = anIntArray4942[i];
		    arg0.anIntArray4927[i] = anIntArray4927[i];
		}
	    }
	    arg0.anInt4917 = anInt4917;
	} else {
	    if (arg4)
		method2311(false);
	    arg0.anIntArray4918 = anIntArray4918;
	    arg0.anIntArray4942 = anIntArray4942;
	    arg0.anIntArray4927 = anIntArray4927;
	    arg0.anInt4917 = anInt4917;
	}
	if ((arg2 & 0x100) != 0) {
	    if (arg1.aByteArray4908 == null
		|| arg1.aByteArray4908.length < anInt4939) {
		int i = anInt4939;
		arg0.aByteArray4908 = arg1.aByteArray4908 = new byte[i];
	    } else
		arg0.aByteArray4908 = arg1.aByteArray4908;
	    if (aByteArray4908 != null) {
		for (int i = 0; i < anInt4939; i++)
		    arg0.aByteArray4908[i] = aByteArray4908[i];
	    } else {
		for (int i = 0; i < anInt4939; i++)
		    arg0.aByteArray4908[i] = (byte) 0;
	    }
	} else
	    arg0.aByteArray4908 = aByteArray4908;
	if ((arg2 & 0x8) != 0 || (arg2 & 0x10) != 0) {
	    if (arg1.aClass132Array4935 == null
		|| arg1.aClass132Array4935.length < anInt4860) {
		int i = anInt4860;
		arg0.aClass132Array4935 = arg1.aClass132Array4935
		    = new Class132[i];
	    } else
		arg0.aClass132Array4935 = arg1.aClass132Array4935;
	    if (aClass132Array4935 != null) {
		for (int i = 0; i < anInt4860; i++)
		    arg0.aClass132Array4935[i]
			= new Class132(aClass132Array4935[i]);
	    } else
		arg0.aClass132Array4935 = null;
	    if (aClass24Array4920 != null) {
		if (arg1.aClass24Array4920 == null
		    || arg1.aClass24Array4920.length < anInt4939) {
		    int i = anInt4939;
		    arg0.aClass24Array4920 = arg1.aClass24Array4920
			= new Class24[i];
		} else
		    arg0.aClass24Array4920 = arg1.aClass24Array4920;
		for (int i = 0; i < anInt4939; i++)
		    arg0.aClass24Array4920[i]
			= (aClass24Array4920[i] != null
			   ? new Class24(aClass24Array4920[i]) : null);
	    } else
		arg0.aClass24Array4920 = null;
	} else {
	    if (arg4)
		method2321();
	    arg0.aClass132Array4935 = aClass132Array4935;
	    arg0.aClass24Array4920 = aClass24Array4920;
	}
	if ((arg2 & 0x4000) != 0) {
	    if (aShortArray4929 == null)
		arg0.aShortArray4929 = null;
	    else {
		if (arg1.aShortArray4929 == null
		    || arg1.aShortArray4929.length < anInt4939) {
		    int i = anInt4939;
		    arg0.aShortArray4929 = arg1.aShortArray4929 = new short[i];
		} else
		    arg0.aShortArray4929 = arg1.aShortArray4929;
		for (int i = 0; i < anInt4939; i++)
		    arg0.aShortArray4929[i] = aShortArray4929[i];
	    }
	} else
	    arg0.aShortArray4929 = aShortArray4929;
	if ((arg2 & 0x8000) != 0) {
	    if (aByteArray4874 == null)
		arg0.aByteArray4874 = null;
	    else {
		if (arg1.aByteArray4874 == null
		    || arg1.aByteArray4874.length < anInt4939) {
		    int i = arg3 ? anInt4939 + 100 : anInt4939;
		    arg0.aByteArray4874 = arg1.aByteArray4874 = new byte[i];
		} else
		    arg0.aByteArray4874 = arg1.aByteArray4874;
		for (int i = 0; i < anInt4939; i++)
		    arg0.aByteArray4874[i] = aByteArray4874[i];
	    }
	} else
	    arg0.aByteArray4874 = aByteArray4874;
	arg0.anIntArrayArray4898 = anIntArrayArray4898;
	arg0.anIntArrayArray4946 = anIntArrayArray4946;
	arg0.aShortArray4880 = aShortArray4880;
	arg0.aShortArray4924 = aShortArray4924;
	arg0.aByteArray4878 = aByteArray4878;
	arg0.aByteArray4934 = aByteArray4934;
	arg0.aByte4932 = aByte4932;
	arg0.anInt4862 = anInt4862;
	arg0.anIntArray4870 = anIntArray4870;
	arg0.anIntArray4948 = anIntArray4948;
	arg0.anIntArray4881 = anIntArray4881;
	arg0.aShortArray4931 = aShortArray4931;
	arg0.aShortArray4901 = aShortArray4901;
	arg0.aShortArray4912 = aShortArray4912;
	arg0.aClass41Array4866 = aClass41Array4866;
	arg0.aClass104Array4859 = aClass104Array4859;
	arg0.anInt4914 = arg2;
	return arg0;
    }
    
    public void method2325(int arg0) {
	if (aBooleanArray4876[arg0])
	    method2312(arg0);
	else {
	    int i = aShortArray4931[arg0];
	    int i_496_ = aShortArray4901[arg0];
	    int i_497_ = aShortArray4912[arg0];
	    aClass65_4865.aBoolean820 = aBooleanArray4925[arg0];
	    if (aByteArray4908 == null)
		aClass65_4865.anInt819 = 0;
	    else
		aClass65_4865.anInt819 = aByteArray4908[arg0] & 0xff;
	    if (aShortArray4929 == null || aShortArray4929[arg0] == -1) {
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method682(anIntArray4890[i],
					    anIntArray4890[i_496_],
					    anIntArray4890[i_497_],
					    anIntArray4904[i],
					    anIntArray4904[i_496_],
					    anIntArray4904[i_497_],
					    (Class88.anIntArray1171
					     [anIntArray4918[arg0] & 0xffff]));
		else
		    aClass65_4865.method688(anIntArray4890[i],
					    anIntArray4890[i_496_],
					    anIntArray4890[i_497_],
					    anIntArray4904[i],
					    anIntArray4904[i_496_],
					    anIntArray4904[i_497_],
					    anIntArray4918[arg0] & 0xffff,
					    anIntArray4942[arg0] & 0xffff,
					    anIntArray4927[arg0] & 0xffff);
	    } else {
		int i_498_;
		int i_499_;
		int i_500_;
		if (aByteArray4878 != null && aByteArray4878[arg0] != -1) {
		    int i_501_ = aByteArray4878[arg0] & 0xff;
		    i_498_ = anIntArray4870[i_501_];
		    i_499_ = anIntArray4948[i_501_];
		    i_500_ = anIntArray4881[i_501_];
		} else {
		    i_498_ = i;
		    i_499_ = i_496_;
		    i_500_ = i_497_;
		}
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method687
			(anIntArray4890[i], anIntArray4890[i_496_],
			 anIntArray4890[i_497_], anIntArray4904[i],
			 anIntArray4904[i_496_], anIntArray4904[i_497_],
			 anIntArray4918[arg0], anIntArray4918[arg0],
			 anIntArray4918[arg0], anIntArray4909[i_498_],
			 anIntArray4909[i_499_], anIntArray4909[i_500_],
			 anIntArray4858[i_498_], anIntArray4858[i_499_],
			 anIntArray4858[i_500_], anIntArray4940[i_498_],
			 anIntArray4940[i_499_], anIntArray4940[i_500_],
			 aShortArray4929[arg0]);
		else
		    aClass65_4865.method687
			(anIntArray4890[i], anIntArray4890[i_496_],
			 anIntArray4890[i_497_], anIntArray4904[i],
			 anIntArray4904[i_496_], anIntArray4904[i_497_],
			 anIntArray4918[arg0], anIntArray4942[arg0],
			 anIntArray4927[arg0], anIntArray4909[i_498_],
			 anIntArray4909[i_499_], anIntArray4909[i_500_],
			 anIntArray4858[i_498_], anIntArray4858[i_499_],
			 anIntArray4858[i_500_], anIntArray4940[i_498_],
			 anIntArray4940[i_499_], anIntArray4940[i_500_],
			 aShortArray4929[arg0]);
	    }
	}
    }
    
    public void method2257(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 == 0) {
	    int i = 0;
	    anInt4906 = 0;
	    anInt4949 = 0;
	    anInt4913 = 0;
	    for (int i_502_ = 0; i_502_ < anInt4916; i_502_++) {
		anInt4906 += anIntArray4893[i_502_];
		anInt4949 += anIntArray4919[i_502_];
		anInt4913 += anIntArray4902[i_502_];
		i++;
	    }
	    if (i > 0) {
		anInt4906 = anInt4906 / i + arg1;
		anInt4949 = anInt4949 / i + arg2;
		anInt4913 = anInt4913 / i + arg3;
	    } else {
		anInt4906 = arg1;
		anInt4949 = arg2;
		anInt4913 = arg3;
	    }
	} else if (arg0 == 1) {
	    for (int i = 0; i < anInt4916; i++) {
		anIntArray4893[i] += arg1;
		anIntArray4919[i] += arg2;
		anIntArray4902[i] += arg3;
	    }
	} else if (arg0 == 2) {
	    for (int i = 0; i < anInt4916; i++) {
		anIntArray4893[i] -= anInt4906;
		anIntArray4919[i] -= anInt4949;
		anIntArray4902[i] -= anInt4913;
		if (arg3 != 0) {
		    int i_503_ = Class31.anIntArray434[arg3];
		    int i_504_ = Class31.anIntArray425[arg3];
		    int i_505_ = ((anIntArray4919[i] * i_503_
				   + anIntArray4893[i] * i_504_ + 32767)
				  >> 15);
		    anIntArray4919[i]
			= (anIntArray4919[i] * i_504_
			   - anIntArray4893[i] * i_503_ + 32767) >> 15;
		    anIntArray4893[i] = i_505_;
		}
		if (arg1 != 0) {
		    int i_506_ = Class31.anIntArray434[arg1];
		    int i_507_ = Class31.anIntArray425[arg1];
		    int i_508_ = ((anIntArray4919[i] * i_507_
				   - anIntArray4902[i] * i_506_ + 32767)
				  >> 15);
		    anIntArray4902[i]
			= (anIntArray4919[i] * i_506_
			   + anIntArray4902[i] * i_507_ + 32767) >> 15;
		    anIntArray4919[i] = i_508_;
		}
		if (arg2 != 0) {
		    int i_509_ = Class31.anIntArray434[arg2];
		    int i_510_ = Class31.anIntArray425[arg2];
		    int i_511_ = ((anIntArray4902[i] * i_509_
				   + anIntArray4893[i] * i_510_ + 32767)
				  >> 15);
		    anIntArray4902[i]
			= (anIntArray4902[i] * i_510_
			   - anIntArray4893[i] * i_509_ + 32767) >> 15;
		    anIntArray4893[i] = i_511_;
		}
		anIntArray4893[i] += anInt4906;
		anIntArray4919[i] += anInt4949;
		anIntArray4902[i] += anInt4913;
	    }
	} else if (arg0 == 3) {
	    for (int i = 0; i < anInt4916; i++) {
		anIntArray4893[i] -= anInt4906;
		anIntArray4919[i] -= anInt4949;
		anIntArray4902[i] -= anInt4913;
		anIntArray4893[i] = anIntArray4893[i] * arg1 / 128;
		anIntArray4919[i] = anIntArray4919[i] * arg2 / 128;
		anIntArray4902[i] = anIntArray4902[i] * arg3 / 128;
		anIntArray4893[i] += anInt4906;
		anIntArray4919[i] += anInt4949;
		anIntArray4902[i] += anInt4913;
	    }
	} else if (arg0 == 5) {
	    for (int i = 0; i < anInt4939; i++) {
		int i_512_ = (aByteArray4908[i] & 0xff) + arg1 * 8;
		if (i_512_ < 0)
		    i_512_ = 0;
		else if (i_512_ > 255)
		    i_512_ = 255;
		aByteArray4908[i] = (byte) i_512_;
	    }
	} else if (arg0 == 7) {
	    for (int i = 0; i < anInt4939; i++) {
		int i_513_ = aShortArray4903[i] & 0xffff;
		int i_514_ = i_513_ >> 10 & 0x3f;
		int i_515_ = i_513_ >> 7 & 0x7;
		int i_516_ = i_513_ & 0x7f;
		i_514_ = i_514_ + arg1 & 0x3f;
		i_515_ += arg2;
		if (i_515_ < 0)
		    i_515_ = 0;
		else if (i_515_ > 7)
		    i_515_ = 7;
		i_516_ += arg3;
		if (i_516_ < 0)
		    i_516_ = 0;
		else if (i_516_ > 127)
		    i_516_ = 127;
		aShortArray4903[i]
		    = (short) (i_514_ << 10 | i_515_ << 7 | i_516_);
	    }
	    aBoolean4936 = true;
	}
    }
    
    public int method2253() {
	return anInt4914;
    }
    
    public Class154 method2287(byte arg0, int arg1, boolean arg2) {
	method2310(Thread.currentThread());
	Class154_Sub2 class154_sub2;
	Class154_Sub2 class154_sub2_517_;
	if (arg0 == 1) {
	    class154_sub2 = aClass154_Sub2_4885;
	    class154_sub2_517_ = aClass154_Sub2_4863;
	} else if (arg0 == 2) {
	    class154_sub2 = aClass154_Sub2_4937;
	    class154_sub2_517_ = aClass154_Sub2_4930;
	} else if (arg0 == 3) {
	    class154_sub2 = aClass154_Sub2_4921;
	    class154_sub2_517_ = aClass154_Sub2_4887;
	} else
	    class154_sub2_517_ = class154_sub2
		= new Class154_Sub2(aClass130_Sub1_4888);
	return method2324(class154_sub2_517_, class154_sub2, arg1, arg0 != 0,
			  arg2);
    }
    
    public boolean method2247() {
	if (anIntArrayArray4898 == null)
	    return false;
	anInt4906 = 0;
	anInt4949 = 0;
	anInt4913 = 0;
	return true;
    }
    
    public void method2261(Class9 arg0, Class1_Sub5 arg1, int arg2) {
	method2314(arg0, arg1, null, -1, arg2);
    }
    
    public void method2326() {
	aClass132Array4935 = null;
	aClass132Array4933 = null;
	aClass24Array4920 = null;
	aBoolean4872 = false;
    }
    
    public void method2275(Class154 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	Class154_Sub2 class154_sub2 = (Class154_Sub2) arg0;
	if ((anInt4914 & 0x8000) != 32768)
	    throw new IllegalStateException("");
	if ((class154_sub2.anInt4914 & 0x8000) != 32768)
	    throw new IllegalStateException("");
	method2329(Thread.currentThread());
	method2331();
	method2321();
	class154_sub2.method2331();
	class154_sub2.method2321();
	anInt4905++;
	int i = 0;
	int[] is = class154_sub2.anIntArray4893;
	int i_518_ = class154_sub2.anInt4860;
	for (int i_519_ = 0; i_519_ < anInt4860; i_519_++) {
	    Class132 class132 = aClass132Array4935[i_519_];
	    if (class132.anInt1795 != 0) {
		int i_520_ = anIntArray4919[i_519_] - arg2;
		if (i_520_ >= class154_sub2.aShort4879
		    && i_520_ <= class154_sub2.aShort4915) {
		    int i_521_ = anIntArray4893[i_519_] - arg1;
		    if (i_521_ >= class154_sub2.aShort4861
			&& i_521_ <= class154_sub2.aShort4889) {
			int i_522_ = anIntArray4902[i_519_] - arg3;
			if (i_522_ >= class154_sub2.aShort4882
			    && i_522_ <= class154_sub2.aShort4864) {
			    for (int i_523_ = 0; i_523_ < i_518_; i_523_++) {
				Class132 class132_524_
				    = class154_sub2.aClass132Array4935[i_523_];
				if (i_521_ == is[i_523_]
				    && i_522_ == (class154_sub2.anIntArray4902
						  [i_523_])
				    && i_520_ == (class154_sub2.anIntArray4919
						  [i_523_])
				    && class132_524_.anInt1795 != 0) {
				    if (aClass132Array4933 == null)
					aClass132Array4933
					    = new Class132[anInt4860];
				    if (class154_sub2.aClass132Array4933
					== null)
					class154_sub2.aClass132Array4933
					    = new Class132[i_518_];
				    Class132 class132_525_
					= aClass132Array4933[i_519_];
				    if (class132_525_ == null)
					class132_525_
					    = aClass132Array4933[i_519_]
					    = new Class132(class132);
				    Class132 class132_526_
					= (class154_sub2.aClass132Array4933
					   [i_523_]);
				    if (class132_526_ == null)
					class132_526_
					    = class154_sub2
						  .aClass132Array4933[i_523_]
					    = new Class132(class132_524_);
				    class132_525_.anInt1796
					+= class132_524_.anInt1796;
				    class132_525_.anInt1797
					+= class132_524_.anInt1797;
				    class132_525_.anInt1798
					+= class132_524_.anInt1798;
				    class132_525_.anInt1795
					+= class132_524_.anInt1795;
				    class132_526_.anInt1796
					+= class132.anInt1796;
				    class132_526_.anInt1797
					+= class132.anInt1797;
				    class132_526_.anInt1798
					+= class132.anInt1798;
				    class132_526_.anInt1795
					+= class132.anInt1795;
				    i++;
				    anIntArray4926[i_519_] = anInt4905;
				    anIntArray4923[i_523_] = anInt4905;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i >= 3 && arg4) {
	    for (int i_527_ = 0; i_527_ < anInt4939; i_527_++) {
		if (anIntArray4926[aShortArray4931[i_527_]] == anInt4905
		    && anIntArray4926[aShortArray4901[i_527_]] == anInt4905
		    && anIntArray4926[aShortArray4912[i_527_]] == anInt4905) {
		    if (aByteArray4874 == null)
			aByteArray4874 = new byte[anInt4939];
		    aByteArray4874[i_527_] = (byte) 2;
		}
	    }
	    for (int i_528_ = 0; i_528_ < class154_sub2.anInt4939; i_528_++) {
		if ((anIntArray4923[class154_sub2.aShortArray4931[i_528_]]
		     == anInt4905)
		    && (anIntArray4923[class154_sub2.aShortArray4901[i_528_]]
			== anInt4905)
		    && (anIntArray4923[class154_sub2.aShortArray4912[i_528_]]
			== anInt4905)) {
		    if (class154_sub2.aByteArray4874 == null)
			class154_sub2.aByteArray4874
			    = new byte[class154_sub2.anInt4939];
		    class154_sub2.aByteArray4874[i_528_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method2327(Class9 arg0, Class1_Sub5 arg1, Class105 arg2,
			   int arg3) {
	method2314(arg0, arg1, arg2, -1, arg3);
    }
    
    public void method2264(int arg0) {
	if ((anInt4914 & 0x5) != 5)
	    throw new IllegalStateException();
	if (arg0 == 4096)
	    method2315();
	else if (arg0 == 8192)
	    method2313();
	else if (arg0 == 12288)
	    method2323();
	else {
	    int i = Class31.anIntArray434[arg0];
	    int i_529_ = Class31.anIntArray425[arg0];
	    for (int i_530_ = 0; i_530_ < anInt4916; i_530_++) {
		int i_531_ = ((anIntArray4902[i_530_] * i
			       + anIntArray4893[i_530_] * i_529_)
			      >> 15);
		anIntArray4902[i_530_] = (anIntArray4902[i_530_] * i_529_
					  - anIntArray4893[i_530_] * i) >> 15;
		anIntArray4893[i_530_] = i_531_;
	    }
	    method2326();
	}
    }
    
    public void method2328(int arg0) {
	if (!aClass130_Sub1_4888.aBoolean4056) {
	    int i = aShortArray4931[arg0];
	    int i_532_ = aShortArray4901[arg0];
	    int i_533_ = aShortArray4912[arg0];
	    int i_534_ = anIntArray4867[i] - aClass130_Sub1_4888.anInt4048;
	    if (i_534_ > 255)
		i_534_ = 255;
	    else if (i_534_ < 0)
		i_534_ = 0;
	    int i_535_
		= anIntArray4867[i_532_] - aClass130_Sub1_4888.anInt4048;
	    if (i_535_ > 255)
		i_535_ = 255;
	    else if (i_535_ < 0)
		i_535_ = 0;
	    int i_536_
		= anIntArray4867[i_533_] - aClass130_Sub1_4888.anInt4048;
	    if (i_536_ > 255)
		i_536_ = 255;
	    else if (i_536_ < 0)
		i_536_ = 0;
	    int i_537_ = i_534_ + i_535_ + i_536_;
	    if (i_537_ != 765) {
		if (i_537_ == 0)
		    method2325(arg0);
		else {
		    if (aByteArray4908 == null)
			aClass65_4865.anInt819 = 0;
		    else
			aClass65_4865.anInt819 = aByteArray4908[arg0] & 0xff;
		    aClass65_4865.aBoolean820 = aBooleanArray4925[arg0];
		    if (aShortArray4929 == null
			|| aShortArray4929[arg0] == -1) {
			if (anIntArray4927[arg0] == -1)
			    aClass65_4865.method689
				(anIntArray4890[i], anIntArray4890[i_532_],
				 anIntArray4890[i_533_], anIntArray4904[i],
				 anIntArray4904[i_532_],
				 anIntArray4904[i_533_],
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4918[arg0]
							& 0xffff)]),
						     (i_534_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58),
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4918[arg0]
							& 0xffff)]),
						     (i_535_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58),
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4918[arg0]
							& 0xffff)]),
						     (i_536_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58));
			else
			    aClass65_4865.method689
				(anIntArray4890[i], anIntArray4890[i_532_],
				 anIntArray4890[i_533_], anIntArray4904[i],
				 anIntArray4904[i_532_],
				 anIntArray4904[i_533_],
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4918[arg0]
							& 0xffff)]),
						     (i_534_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58),
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4942[arg0]
							& 0xffff)]),
						     (i_535_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58),
				 Class212.method2766((Class88.anIntArray1171
						      [(anIntArray4927[arg0]
							& 0xffff)]),
						     (i_536_ << 24
						      | (aClass130_Sub1_4888
							 .anInt4045)),
						     (byte) 58));
		    } else {
			int i_538_;
			int i_539_;
			int i_540_;
			if (aByteArray4878 != null
			    && aByteArray4878[arg0] != -1) {
			    int i_541_ = aByteArray4878[arg0] & 0xff;
			    i_538_ = anIntArray4870[i_541_];
			    i_539_ = anIntArray4948[i_541_];
			    i_540_ = anIntArray4881[i_541_];
			} else {
			    i_538_ = i;
			    i_539_ = i_532_;
			    i_540_ = i_533_;
			}
			if (anIntArray4927[arg0] == -1)
			    aClass65_4865.method680
				(anIntArray4890[i], anIntArray4890[i_532_],
				 anIntArray4890[i_533_], anIntArray4904[i],
				 anIntArray4904[i_532_],
				 anIntArray4904[i_533_],
				 aClass130_Sub1_4888.anInt4045, i_534_, i_535_,
				 i_536_, anIntArray4918[arg0],
				 anIntArray4918[arg0], anIntArray4918[arg0],
				 anIntArray4909[i_538_],
				 anIntArray4909[i_539_],
				 anIntArray4909[i_540_],
				 anIntArray4858[i_538_],
				 anIntArray4858[i_539_],
				 anIntArray4858[i_540_],
				 anIntArray4940[i_538_],
				 anIntArray4940[i_539_],
				 anIntArray4940[i_540_],
				 aShortArray4929[arg0]);
			else
			    aClass65_4865.method680
				(anIntArray4890[i], anIntArray4890[i_532_],
				 anIntArray4890[i_533_], anIntArray4904[i],
				 anIntArray4904[i_532_],
				 anIntArray4904[i_533_],
				 aClass130_Sub1_4888.anInt4045, i_534_, i_535_,
				 i_536_, anIntArray4918[arg0],
				 anIntArray4942[arg0], anIntArray4927[arg0],
				 anIntArray4909[i_538_],
				 anIntArray4909[i_539_],
				 anIntArray4909[i_540_],
				 anIntArray4858[i_538_],
				 anIntArray4858[i_539_],
				 anIntArray4858[i_540_],
				 anIntArray4940[i_538_],
				 anIntArray4940[i_539_],
				 anIntArray4940[i_540_],
				 aShortArray4929[arg0]);
		    }
		}
	    }
	} else {
	    int i = aShortArray4931[arg0];
	    int i_542_ = aShortArray4901[arg0];
	    int i_543_ = aShortArray4912[arg0];
	    int i_544_ = 0;
	    int i_545_ = 0;
	    int i_546_ = 0;
	    if (anIntArray4910[i] > aClass130_Sub1_4888.anInt4027)
		i_544_ = 255;
	    else if (anIntArray4910[i] > aClass130_Sub1_4888.anInt4035)
		i_544_ = ((aClass130_Sub1_4888.anInt4035 - anIntArray4910[i])
			  * 255
			  / (aClass130_Sub1_4888.anInt4035
			     - aClass130_Sub1_4888.anInt4027));
	    if (anIntArray4910[i_542_] > aClass130_Sub1_4888.anInt4027)
		i_545_ = 255;
	    else if (anIntArray4910[i_542_] > aClass130_Sub1_4888.anInt4035)
		i_545_
		    = ((aClass130_Sub1_4888.anInt4035 - anIntArray4910[i_542_])
		       * 255
		       / (aClass130_Sub1_4888.anInt4035
			  - aClass130_Sub1_4888.anInt4027));
	    if (anIntArray4910[i_543_] > aClass130_Sub1_4888.anInt4027)
		i_546_ = 255;
	    else if (anIntArray4910[i_543_] > aClass130_Sub1_4888.anInt4035)
		i_546_
		    = ((aClass130_Sub1_4888.anInt4035 - anIntArray4910[i_543_])
		       * 255
		       / (aClass130_Sub1_4888.anInt4035
			  - aClass130_Sub1_4888.anInt4027));
	    if (aByteArray4908 == null)
		aClass65_4865.anInt819 = 0;
	    else
		aClass65_4865.anInt819 = aByteArray4908[arg0] & 0xff;
	    aClass65_4865.aBoolean820 = aBooleanArray4925[arg0];
	    if (aShortArray4929 == null || aShortArray4929[arg0] == -1) {
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method689
			(anIntArray4890[i], anIntArray4890[i_542_],
			 anIntArray4890[i_543_], anIntArray4904[i],
			 anIntArray4904[i_542_], anIntArray4904[i_543_],
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4918[arg0] & 0xffff]),
					     (i_544_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58),
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4918[arg0] & 0xffff]),
					     (i_545_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58),
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4918[arg0] & 0xffff]),
					     (i_546_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58));
		else
		    aClass65_4865.method689
			(anIntArray4890[i], anIntArray4890[i_542_],
			 anIntArray4890[i_543_], anIntArray4904[i],
			 anIntArray4904[i_542_], anIntArray4904[i_543_],
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4918[arg0] & 0xffff]),
					     (i_544_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58),
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4942[arg0] & 0xffff]),
					     (i_545_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58),
			 Class212.method2766((Class88.anIntArray1171
					      [anIntArray4927[arg0] & 0xffff]),
					     (i_546_ << 24
					      | aClass130_Sub1_4888.anInt4045),
					     (byte) 58));
	    } else {
		int i_547_;
		int i_548_;
		int i_549_;
		if (aByteArray4878 != null && aByteArray4878[arg0] != -1) {
		    int i_550_ = aByteArray4878[arg0] & 0xff;
		    i_547_ = anIntArray4870[i_550_];
		    i_548_ = anIntArray4948[i_550_];
		    i_549_ = anIntArray4881[i_550_];
		} else {
		    i_547_ = i;
		    i_548_ = i_542_;
		    i_549_ = i_543_;
		}
		if (anIntArray4927[arg0] == -1)
		    aClass65_4865.method680
			(anIntArray4890[i], anIntArray4890[i_542_],
			 anIntArray4890[i_543_], anIntArray4904[i],
			 anIntArray4904[i_542_], anIntArray4904[i_543_],
			 aClass130_Sub1_4888.anInt4045, i_544_, i_545_, i_546_,
			 anIntArray4918[arg0], anIntArray4918[arg0],
			 anIntArray4918[arg0], anIntArray4909[i_547_],
			 anIntArray4909[i_548_], anIntArray4909[i_549_],
			 anIntArray4858[i_547_], anIntArray4858[i_548_],
			 anIntArray4858[i_549_], anIntArray4940[i_547_],
			 anIntArray4940[i_548_], anIntArray4940[i_549_],
			 aShortArray4929[arg0]);
		else
		    aClass65_4865.method680
			(anIntArray4890[i], anIntArray4890[i_542_],
			 anIntArray4890[i_543_], anIntArray4904[i],
			 anIntArray4904[i_542_], anIntArray4904[i_543_],
			 aClass130_Sub1_4888.anInt4045, i_544_, i_545_, i_546_,
			 anIntArray4918[arg0], anIntArray4942[arg0],
			 anIntArray4927[arg0], anIntArray4909[i_547_],
			 anIntArray4909[i_548_], anIntArray4909[i_549_],
			 anIntArray4858[i_547_], anIntArray4858[i_548_],
			 anIntArray4858[i_549_], anIntArray4940[i_547_],
			 anIntArray4940[i_548_], anIntArray4940[i_549_],
			 aShortArray4929[arg0]);
	    }
	}
    }
    
    public void method2329(Thread arg0) {
	Class125 class125 = aClass130_Sub1_4888.method1267(arg0);
	aClass65_4865 = class125.aClass65_1638;
	if (class125 != aClass125_4911) {
	    aClass125_4911 = class125;
	    aBooleanArray4925 = aClass125_4911.aBooleanArray1687;
	    aBooleanArray4876 = aClass125_4911.aBooleanArray1645;
	    anIntArray4910 = aClass125_4911.anIntArray1684;
	    anIntArray4909 = aClass125_4911.anIntArray1661;
	    anIntArray4858 = aClass125_4911.anIntArray1675;
	    anIntArray4940 = aClass125_4911.anIntArray1676;
	    anIntArray4904 = aClass125_4911.anIntArray1652;
	    anIntArray4890 = aClass125_4911.anIntArray1653;
	    anIntArray4867 = aClass125_4911.anIntArray1663;
	    anIntArray4944 = aClass125_4911.anIntArray1657;
	    anIntArray4900 = aClass125_4911.anIntArray1685;
	    anIntArray4877 = aClass125_4911.anIntArray1659;
	    anIntArray4938 = aClass125_4911.anIntArray1682;
	    anIntArray4943 = aClass125_4911.anIntArray1683;
	    anIntArray4868 = aClass125_4911.anIntArray1656;
	    aClass1_Sub7_Sub1Array4941
		= aClass125_4911.aClass1_Sub7_Sub1Array1671;
	    anIntArray4883 = aClass125_4911.anIntArray1664;
	    anIntArray4895 = aClass125_4911.anIntArray1648;
	    anIntArray4871 = aClass125_4911.anIntArray1679;
	    anIntArrayArray4873 = aClass125_4911.anIntArrayArray1678;
	    anIntArray4950 = aClass125_4911.anIntArray1681;
	    anIntArrayArray4857 = aClass125_4911.anIntArrayArray1665;
	    anIntArray4875 = aClass125_4911.anIntArray1680;
	    anIntArrayArray4869 = aClass125_4911.anIntArrayArray1658;
	    anIntArray4892 = aClass125_4911.anIntArray1655;
	    anIntArray4928 = aClass125_4911.anIntArray1688;
	    anIntArray4896 = aClass125_4911.anIntArray1654;
	    anIntArray4945 = aClass125_4911.anIntArray1650;
	    anIntArray4899 = aClass125_4911.anIntArray1660;
	    anIntArray4894 = aClass125_4911.anIntArray1667;
	    anIntArray4926 = aClass125_4911.anIntArray1670;
	    anIntArray4923 = aClass125_4911.anIntArray1666;
	}
    }
    
    public boolean method2330(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	return true;
    }
    
    public void method2331() {
	if (!aBoolean4872) {
	    int i = 32767;
	    int i_551_ = 32767;
	    int i_552_ = 32767;
	    int i_553_ = -32768;
	    int i_554_ = -32768;
	    int i_555_ = -32768;
	    int i_556_ = 0;
	    int i_557_ = 0;
	    for (int i_558_ = 0; i_558_ < anInt4860; i_558_++) {
		int i_559_ = anIntArray4893[i_558_];
		int i_560_ = anIntArray4919[i_558_];
		int i_561_ = anIntArray4902[i_558_];
		if (i_559_ < i)
		    i = i_559_;
		if (i_559_ > i_553_)
		    i_553_ = i_559_;
		if (i_560_ < i_551_)
		    i_551_ = i_560_;
		if (i_560_ > i_554_)
		    i_554_ = i_560_;
		if (i_561_ < i_552_)
		    i_552_ = i_561_;
		if (i_561_ > i_555_)
		    i_555_ = i_561_;
		int i_562_ = i_559_ * i_559_ + i_561_ * i_561_;
		if (i_562_ > i_556_)
		    i_556_ = i_562_;
		i_562_ += i_560_ * i_560_;
		if (i_562_ > i_557_)
		    i_557_ = i_562_;
	    }
	    aShort4861 = (short) i;
	    aShort4889 = (short) i_553_;
	    aShort4879 = (short) i_551_;
	    aShort4915 = (short) i_554_;
	    aShort4882 = (short) i_552_;
	    aShort4864 = (short) i_555_;
	    aShort4891 = (short) (int) (Math.sqrt((double) i_556_) + 0.99);
	    Math.sqrt((double) i_557_);
	    aBoolean4872 = true;
	}
    }
    
    public void method2332(Class9_Sub2 arg0) {
	if (aClass41Array4866 != null) {
	    for (int i = 0; i < aClass41Array4866.length; i++) {
		Class41 class41 = aClass41Array4866[i];
		Class41 class41_563_ = class41;
		if (class41.aClass41_546 != null)
		    class41_563_ = class41.aClass41_546;
		class41_563_.anInt536
		    = (arg0.anInt3626
		       + ((arg0.anInt3617 * anIntArray4893[class41.anInt539]
			   + arg0.anInt3615 * anIntArray4919[class41.anInt539]
			   + arg0.anInt3618 * anIntArray4902[class41.anInt539])
			  >> 15));
		class41_563_.anInt541
		    = (arg0.anInt3624
		       + ((arg0.anInt3625 * anIntArray4893[class41.anInt539]
			   + arg0.anInt3616 * anIntArray4919[class41.anInt539]
			   + arg0.anInt3622 * anIntArray4902[class41.anInt539])
			  >> 15));
		class41_563_.anInt549
		    = (arg0.anInt3619
		       + ((arg0.anInt3623 * anIntArray4893[class41.anInt539]
			   + arg0.anInt3621 * anIntArray4919[class41.anInt539]
			   + arg0.anInt3620 * anIntArray4902[class41.anInt539])
			  >> 15));
		class41_563_.anInt543
		    = (arg0.anInt3626
		       + ((arg0.anInt3617 * anIntArray4893[class41.anInt552]
			   + arg0.anInt3615 * anIntArray4919[class41.anInt552]
			   + arg0.anInt3618 * anIntArray4902[class41.anInt552])
			  >> 15));
		class41_563_.anInt538
		    = (arg0.anInt3624
		       + ((arg0.anInt3625 * anIntArray4893[class41.anInt552]
			   + arg0.anInt3616 * anIntArray4919[class41.anInt552]
			   + arg0.anInt3622 * anIntArray4902[class41.anInt552])
			  >> 15));
		class41_563_.anInt547
		    = (arg0.anInt3619
		       + ((arg0.anInt3623 * anIntArray4893[class41.anInt552]
			   + arg0.anInt3621 * anIntArray4919[class41.anInt552]
			   + arg0.anInt3620 * anIntArray4902[class41.anInt552])
			  >> 15));
		class41_563_.anInt535
		    = (arg0.anInt3626
		       + ((arg0.anInt3617 * anIntArray4893[class41.anInt540]
			   + arg0.anInt3615 * anIntArray4919[class41.anInt540]
			   + arg0.anInt3618 * anIntArray4902[class41.anInt540])
			  >> 15));
		class41_563_.anInt555
		    = (arg0.anInt3624
		       + ((arg0.anInt3625 * anIntArray4893[class41.anInt540]
			   + arg0.anInt3616 * anIntArray4919[class41.anInt540]
			   + arg0.anInt3622 * anIntArray4902[class41.anInt540])
			  >> 15));
		class41_563_.anInt554
		    = (arg0.anInt3619
		       + ((arg0.anInt3623 * anIntArray4893[class41.anInt540]
			   + arg0.anInt3621 * anIntArray4919[class41.anInt540]
			   + arg0.anInt3620 * anIntArray4902[class41.anInt540])
			  >> 15));
	    }
	}
	if (aClass104Array4859 != null) {
	    for (int i = 0; i < aClass104Array4859.length; i++) {
		Class104 class104 = aClass104Array4859[i];
		Class104 class104_564_ = class104;
		if (class104.aClass104_1360 != null)
		    class104_564_ = class104.aClass104_1360;
		if (class104.aClass9_1356 != null)
		    class104.aClass9_1356.method180(arg0);
		else
		    class104.aClass9_1356 = arg0.method198();
		class104_564_.anInt1366
		    = (arg0.anInt3626
		       + ((arg0.anInt3617 * anIntArray4893[class104.anInt1362]
			   + (arg0.anInt3615
			      * anIntArray4919[class104.anInt1362])
			   + (arg0.anInt3618
			      * anIntArray4902[class104.anInt1362]))
			  >> 15));
		class104_564_.anInt1363
		    = (arg0.anInt3624
		       + ((arg0.anInt3625 * anIntArray4893[class104.anInt1362]
			   + (arg0.anInt3616
			      * anIntArray4919[class104.anInt1362])
			   + (arg0.anInt3622
			      * anIntArray4902[class104.anInt1362]))
			  >> 15));
		class104_564_.anInt1361
		    = (arg0.anInt3619
		       + ((arg0.anInt3623 * anIntArray4893[class104.anInt1362]
			   + (arg0.anInt3621
			      * anIntArray4919[class104.anInt1362])
			   + (arg0.anInt3620
			      * anIntArray4902[class104.anInt1362]))
			  >> 15));
	    }
	}
    }
    
    public Class41[] method2254() {
	return aClass41Array4866;
    }
    
    public static Class154_Sub2 method2333(Class130_Sub1 arg0,
					   Class154_Sub2[] arg1) {
	int i = 0;
	Class154_Sub2 class154_sub2 = null;
	for (int i_565_ = 0; i_565_ < arg1.length; i_565_++) {
	    if (arg1[i_565_] != null) {
		i++;
		class154_sub2 = arg1[i_565_];
	    }
	}
	if (i == 1)
	    return class154_sub2;
	return new Class154_Sub2(arg0, arg1);
    }
    
    public void method2262(int arg0, int arg1, int arg2) {
	if (arg0 != 128 && (anInt4914 & 0x1) != 1)
	    throw new IllegalStateException();
	if (arg1 != 128 && (anInt4914 & 0x2) != 2)
	    throw new IllegalStateException();
	if (arg2 != 128 && (anInt4914 & 0x4) != 4)
	    throw new IllegalStateException();
	for (int i = 0; i < anInt4916; i++) {
	    anIntArray4893[i] = anIntArray4893[i] * arg0 >> 7;
	    anIntArray4919[i] = anIntArray4919[i] * arg1 >> 7;
	    anIntArray4902[i] = anIntArray4902[i] * arg2 >> 7;
	}
	aBoolean4872 = false;
    }
    
    public void method2334(boolean arg0, boolean arg1, int arg2, boolean arg3,
			   int arg4) {
	if (arg2 < 2200) {
	    for (int i = 0; i < 2200; i++)
		anIntArray4871[i] = 0;
	    int i = 0;
	    for (int i_566_ = 0; i_566_ < anInt4939; i_566_++) {
		if (anIntArray4927[i_566_] != -2) {
		    short i_567_ = aShortArray4931[i_566_];
		    short i_568_ = aShortArray4901[i_566_];
		    short i_569_ = aShortArray4912[i_566_];
		    int i_570_ = anIntArray4904[i_567_];
		    int i_571_ = anIntArray4904[i_568_];
		    int i_572_ = anIntArray4904[i_569_];
		    if (arg0 && (i_570_ == -5000 || i_571_ == -5000
				 || i_572_ == -5000)) {
			int i_573_ = anIntArray4909[i_567_];
			int i_574_ = anIntArray4909[i_568_];
			int i_575_ = anIntArray4909[i_569_];
			int i_576_ = anIntArray4858[i_567_];
			int i_577_ = anIntArray4858[i_568_];
			int i_578_ = anIntArray4858[i_569_];
			int i_579_ = anIntArray4940[i_567_];
			int i_580_ = anIntArray4940[i_568_];
			int i_581_ = anIntArray4940[i_569_];
			i_573_ -= i_574_;
			i_575_ -= i_574_;
			i_576_ -= i_577_;
			i_578_ -= i_577_;
			i_579_ -= i_580_;
			i_581_ -= i_580_;
			int i_582_ = i_576_ * i_581_ - i_579_ * i_578_;
			int i_583_ = i_579_ * i_575_ - i_573_ * i_581_;
			int i_584_ = i_573_ * i_578_ - i_576_ * i_575_;
			if (i_574_ * i_582_ + i_577_ * i_583_ + i_580_ * i_584_
			    > 0) {
			    aBooleanArray4876[i_566_] = true;
			    int i_585_ = ((anIntArray4895[i_567_]
					   + anIntArray4895[i_568_]
					   + anIntArray4895[i_569_])
					  / 3);
			    if (anIntArray4871[i_585_] < 64)
				anIntArrayArray4873[i_585_]
				    [anIntArray4871[i_585_]++]
				    = i_566_;
			    else {
				int i_586_ = anIntArray4871[i_585_];
				if (i_586_ == 64) {
				    if (i == 512)
					continue;
				    anIntArray4950[i] = 0;
				    anIntArray4871[i_585_] = i_586_ = 65 + i++;
				}
				i_586_ -= 65;
				anIntArrayArray4857[i_586_]
				    [anIntArray4950[i_586_]++]
				    = i_566_;
			    }
			}
		    } else if (((i_570_ - i_571_) * (anIntArray4890[i_569_]
						     - anIntArray4890[i_568_])
				- ((anIntArray4890[i_567_]
				    - anIntArray4890[i_568_])
				   * (i_572_ - i_571_)))
			       > 0) {
			aBooleanArray4876[i_566_] = false;
			if (i_570_ < 0 || i_571_ < 0 || i_572_ < 0
			    || i_570_ > aClass125_4911.anInt1669
			    || i_571_ > aClass125_4911.anInt1669
			    || i_572_ > aClass125_4911.anInt1669)
			    aBooleanArray4925[i_566_] = true;
			else
			    aBooleanArray4925[i_566_] = false;
			int i_587_
			    = ((anIntArray4895[i_567_] + anIntArray4895[i_568_]
				+ anIntArray4895[i_569_])
			       / 3);
			if (anIntArray4871[i_587_] < 64)
			    anIntArrayArray4873[i_587_]
				[anIntArray4871[i_587_]++]
				= i_566_;
			else {
			    int i_588_ = anIntArray4871[i_587_];
			    if (i_588_ == 64) {
				if (i == 512)
				    continue;
				anIntArray4950[i] = 0;
				anIntArray4871[i_587_] = i_588_ = 65 + i++;
			    }
			    i_588_ -= 65;
			    anIntArrayArray4857[i_588_]
				[anIntArray4950[i_588_]++]
				= i_566_;
			}
		    }
		}
	    }
	    if (arg3) {
		int i_589_ = 0;
		for (/**/; i_589_ < arg4; i_589_++) {
		    int i_590_ = anIntArray4883[i_589_];
		    if (i_590_ >= 0 && i_590_ < 2200) {
			if (anIntArray4871[i_590_] < 64)
			    anIntArrayArray4873[i_590_]
				[anIntArray4871[i_590_]++]
				= i_589_ + 1 << 16;
			else {
			    int i_591_ = anIntArray4871[i_590_];
			    if (i_591_ == 64) {
				if (i == 512)
				    continue;
				anIntArray4950[i] = 0;
				anIntArray4871[i_590_] = i_591_ = 65 + i++;
			    }
			    i_591_ -= 65;
			    anIntArrayArray4857[i_591_]
				[anIntArray4950[i_591_]++]
				= i_589_ + 1 << 16;
			}
		    }
		}
	    }
	    if (aByteArray4934 == null) {
		if (arg3) {
		    if (arg1) {
			for (int i_592_ = arg2 - 1; i_592_ >= 0; i_592_--) {
			    int i_593_ = anIntArray4871[i_592_];
			    if (i_593_ > 0) {
				int i_594_ = i_593_ > 64 ? 64 : i_593_;
				int[] is = anIntArrayArray4873[i_592_];
				for (int i_595_ = 0; i_595_ < i_594_;
				     i_595_++) {
				    int i_596_ = is[i_595_];
				    if (i_596_ < 65536)
					method2328(is[i_595_]);
				    else {
					int i_597_ = (i_596_ >> 16) - 1;
					Class1_Sub7_Sub1 class1_sub7_sub1
					    = (aClass1_Sub7_Sub1Array4941
					       [i_597_]);
					int i_598_ = anIntArray4868[i_597_];
					if (i_598_ == 0)
					    i_598_ = 1;
					aClass130_Sub1_4888.method1273
					    (class1_sub7_sub1,
					     anIntArray4938[i_597_],
					     anIntArray4943[i_597_],
					     ((class1_sub7_sub1.anInt5210 >> 2)
					      / i_598_));
				    }
				}
			    }
			    if (i_593_ > 64) {
				int i_599_ = anIntArray4871[i_592_] - 64 - 1;
				int[] is = anIntArrayArray4857[i_599_];
				for (int i_600_ = 0;
				     i_600_ < anIntArray4950[i_599_];
				     i_600_++) {
				    int i_601_ = is[i_600_];
				    if (i_601_ < 65536)
					method2328(is[i_600_]);
				    else {
					int i_602_ = (i_601_ >> 16) - 1;
					Class1_Sub7_Sub1 class1_sub7_sub1
					    = (aClass1_Sub7_Sub1Array4941
					       [i_602_]);
					int i_603_ = anIntArray4868[i_602_];
					if (i_603_ == 0)
					    i_603_ = 1;
					aClass130_Sub1_4888.method1273
					    (class1_sub7_sub1,
					     anIntArray4938[i_602_],
					     anIntArray4943[i_602_],
					     ((class1_sub7_sub1.anInt5210 >> 2)
					      / i_603_));
				    }
				}
			    }
			}
		    } else {
			for (int i_604_ = arg2 - 1; i_604_ >= 0; i_604_--) {
			    int i_605_ = anIntArray4871[i_604_];
			    if (i_605_ > 0) {
				int i_606_ = i_605_ > 64 ? 64 : i_605_;
				int[] is = anIntArrayArray4873[i_604_];
				for (int i_607_ = 0; i_607_ < i_606_;
				     i_607_++) {
				    int i_608_ = is[i_607_];
				    if (i_608_ < 65536)
					method2325(is[i_607_]);
				    else {
					int i_609_ = (i_608_ >> 16) - 1;
					Class1_Sub7_Sub1 class1_sub7_sub1
					    = (aClass1_Sub7_Sub1Array4941
					       [i_609_]);
					int i_610_ = anIntArray4868[i_609_];
					if (i_610_ == 0)
					    i_610_ = 1;
					aClass130_Sub1_4888.method1273
					    (class1_sub7_sub1,
					     anIntArray4938[i_609_],
					     anIntArray4943[i_609_],
					     ((class1_sub7_sub1.anInt5210 >> 2)
					      / i_610_));
				    }
				}
			    }
			    if (i_605_ > 64) {
				int i_611_ = anIntArray4871[i_604_] - 64 - 1;
				int[] is = anIntArrayArray4857[i_611_];
				for (int i_612_ = 0;
				     i_612_ < anIntArray4950[i_611_];
				     i_612_++) {
				    int i_613_ = is[i_612_];
				    if (i_613_ < 65536)
					method2325(is[i_612_]);
				    else {
					int i_614_ = (i_613_ >> 16) - 1;
					Class1_Sub7_Sub1 class1_sub7_sub1
					    = (aClass1_Sub7_Sub1Array4941
					       [i_614_]);
					int i_615_ = anIntArray4868[i_614_];
					if (i_615_ == 0)
					    i_615_ = 1;
					aClass130_Sub1_4888.method1273
					    (class1_sub7_sub1,
					     anIntArray4938[i_614_],
					     anIntArray4943[i_614_],
					     ((class1_sub7_sub1.anInt5210 >> 2)
					      / i_615_));
				    }
				}
			    }
			}
		    }
		} else if (arg1) {
		    for (int i_616_ = arg2 - 1; i_616_ >= 0; i_616_--) {
			int i_617_ = anIntArray4871[i_616_];
			if (i_617_ > 0) {
			    int i_618_ = i_617_ > 64 ? 64 : i_617_;
			    int[] is = anIntArrayArray4873[i_616_];
			    for (int i_619_ = 0; i_619_ < i_618_; i_619_++)
				method2328(is[i_619_]);
			}
			if (i_617_ > 64) {
			    int i_620_ = anIntArray4871[i_616_] - 64 - 1;
			    int[] is = anIntArrayArray4857[i_620_];
			    for (int i_621_ = 0;
				 i_621_ < anIntArray4950[i_620_]; i_621_++)
				method2328(is[i_621_]);
			}
		    }
		} else {
		    for (int i_622_ = arg2 - 1; i_622_ >= 0; i_622_--) {
			int i_623_ = anIntArray4871[i_622_];
			if (i_623_ > 0) {
			    int i_624_ = i_623_ > 64 ? 64 : i_623_;
			    int[] is = anIntArrayArray4873[i_622_];
			    for (int i_625_ = 0; i_625_ < i_624_; i_625_++)
				method2325(is[i_625_]);
			}
			if (i_623_ > 64) {
			    int i_626_ = anIntArray4871[i_622_] - 64 - 1;
			    int[] is = anIntArrayArray4857[i_626_];
			    for (int i_627_ = 0;
				 i_627_ < anIntArray4950[i_626_]; i_627_++)
				method2325(is[i_627_]);
			}
		    }
		}
	    } else {
		for (int i_628_ = 0; i_628_ < 12; i_628_++) {
		    anIntArray4875[i_628_] = 0;
		    anIntArray4896[i_628_] = 0;
		}
		if (arg3) {
		    for (int i_629_ = arg2 - 1; i_629_ >= 0; i_629_--) {
			int i_630_ = anIntArray4871[i_629_];
			if (i_630_ > 0) {
			    int i_631_;
			    if (i_630_ > 64)
				i_631_ = 64;
			    else
				i_631_ = i_630_;
			    int[] is = anIntArrayArray4873[i_629_];
			    for (int i_632_ = 0; i_632_ < i_631_; i_632_++) {
				int i_633_ = is[i_632_];
				if (i_633_ < 65536) {
				    byte i_634_ = aByteArray4934[i_633_];
				    int i_635_ = anIntArray4875[i_634_]++;
				    anIntArrayArray4869[i_634_][i_635_]
					= i_633_;
				    if (i_634_ < 10)
					anIntArray4896[i_634_] += i_629_;
				    else if (i_634_ == 10)
					anIntArray4892[i_635_] = i_629_;
				    else
					anIntArray4928[i_635_] = i_629_;
				} else {
				    byte i_636_
					= (aClass1_Sub7_Sub1Array4941
					   [(i_633_ >> 16) - 1].aByte5218);
				    int i_637_ = anIntArray4875[i_636_]++;
				    anIntArrayArray4869[i_636_][i_637_]
					= i_633_;
				    if (i_636_ < 10)
					anIntArray4896[i_636_] += i_629_;
				    else if (i_636_ == 10)
					anIntArray4892[i_637_] = i_629_;
				    else
					anIntArray4928[i_637_] = i_629_;
				}
			    }
			}
			if (i_630_ > 64) {
			    int i_638_ = anIntArray4871[i_629_] - 64 - 1;
			    int[] is = anIntArrayArray4857[i_638_];
			    for (int i_639_ = 0;
				 i_639_ < anIntArray4950[i_638_]; i_639_++) {
				int i_640_ = is[i_639_];
				if (i_640_ < 65536) {
				    byte i_641_ = aByteArray4934[i_640_];
				    int i_642_ = anIntArray4875[i_641_]++;
				    anIntArrayArray4869[i_641_][i_642_]
					= i_640_;
				    if (i_641_ < 10)
					anIntArray4896[i_641_] += i_629_;
				    else if (i_641_ == 10)
					anIntArray4892[i_642_] = i_629_;
				    else
					anIntArray4928[i_642_] = i_629_;
				} else {
				    byte i_643_
					= (aClass1_Sub7_Sub1Array4941
					   [(i_640_ >> 16) - 1].aByte5218);
				    int i_644_ = anIntArray4875[i_643_]++;
				    anIntArrayArray4869[i_643_][i_644_]
					= i_640_;
				    if (i_643_ < 10)
					anIntArray4896[i_643_] += i_629_;
				    else if (i_643_ == 10)
					anIntArray4892[i_644_] = i_629_;
				    else
					anIntArray4928[i_644_] = i_629_;
				}
			    }
			}
		    }
		} else {
		    for (int i_645_ = arg2 - 1; i_645_ >= 0; i_645_--) {
			int i_646_ = anIntArray4871[i_645_];
			if (i_646_ > 0) {
			    int i_647_;
			    if (i_646_ > 64)
				i_647_ = 64;
			    else
				i_647_ = i_646_;
			    int[] is = anIntArrayArray4873[i_645_];
			    for (int i_648_ = 0; i_648_ < i_647_; i_648_++) {
				int i_649_ = is[i_648_];
				byte i_650_ = aByteArray4934[i_649_];
				int i_651_ = anIntArray4875[i_650_]++;
				anIntArrayArray4869[i_650_][i_651_] = i_649_;
				if (i_650_ < 10)
				    anIntArray4896[i_650_] += i_645_;
				else if (i_650_ == 10)
				    anIntArray4892[i_651_] = i_645_;
				else
				    anIntArray4928[i_651_] = i_645_;
			    }
			}
			if (i_646_ > 64) {
			    int i_652_ = anIntArray4871[i_645_] - 64 - 1;
			    int[] is = anIntArrayArray4857[i_652_];
			    for (int i_653_ = 0;
				 i_653_ < anIntArray4950[i_652_]; i_653_++) {
				int i_654_ = is[i_653_];
				byte i_655_ = aByteArray4934[i_654_];
				int i_656_ = anIntArray4875[i_655_]++;
				anIntArrayArray4869[i_655_][i_656_] = i_654_;
				if (i_655_ < 10)
				    anIntArray4896[i_655_] += i_645_;
				else if (i_655_ == 10)
				    anIntArray4892[i_656_] = i_645_;
				else
				    anIntArray4928[i_656_] = i_645_;
			    }
			}
		    }
		}
		int i_657_ = 0;
		if (anIntArray4875[1] > 0 || anIntArray4875[2] > 0)
		    i_657_ = ((anIntArray4896[1] + anIntArray4896[2])
			      / (anIntArray4875[1] + anIntArray4875[2]));
		int i_658_ = 0;
		if (anIntArray4875[3] > 0 || anIntArray4875[4] > 0)
		    i_658_ = ((anIntArray4896[3] + anIntArray4896[4])
			      / (anIntArray4875[3] + anIntArray4875[4]));
		int i_659_ = 0;
		if (anIntArray4875[6] > 0 || anIntArray4875[8] > 0)
		    i_659_ = ((anIntArray4896[6] + anIntArray4896[8])
			      / (anIntArray4875[6] + anIntArray4875[8]));
		int i_660_ = 0;
		int i_661_ = anIntArray4875[10];
		int[] is = anIntArrayArray4869[10];
		int[] is_662_ = anIntArray4892;
		if (i_660_ == i_661_) {
		    i_660_ = 0;
		    i_661_ = anIntArray4875[11];
		    is = anIntArrayArray4869[11];
		    is_662_ = anIntArray4928;
		}
		int i_663_;
		if (i_660_ < i_661_)
		    i_663_ = is_662_[i_660_];
		else
		    i_663_ = -1000;
		for (int i_664_ = 0; i_664_ < 10; i_664_++) {
		    if (arg1) {
			while (i_664_ == 0) {
			    if (i_663_ <= i_657_)
				break;
			    int i_665_ = is[i_660_++];
			    if (i_665_ < 65536)
				method2328(i_665_);
			    else {
				int i_666_ = (i_665_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_666_];
				int i_667_ = anIntArray4868[i_666_];
				if (i_667_ == 0)
				    i_667_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_666_],
				     anIntArray4943[i_666_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_667_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
			while (i_664_ == 3) {
			    if (i_663_ <= i_658_)
				break;
			    int i_668_ = is[i_660_++];
			    if (i_668_ < 65536)
				method2328(i_668_);
			    else {
				int i_669_ = (i_668_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_669_];
				int i_670_ = anIntArray4868[i_669_];
				if (i_670_ == 0)
				    i_670_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_669_],
				     anIntArray4943[i_669_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_670_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
			while (i_664_ == 5) {
			    if (i_663_ <= i_659_)
				break;
			    int i_671_ = is[i_660_++];
			    if (i_671_ < 65536)
				method2328(i_671_);
			    else {
				int i_672_ = (i_671_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_672_];
				int i_673_ = anIntArray4868[i_672_];
				if (i_673_ == 0)
				    i_673_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_672_],
				     anIntArray4943[i_672_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_673_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
		    } else {
			while (i_664_ == 0) {
			    if (i_663_ <= i_657_)
				break;
			    int i_674_ = is[i_660_++];
			    if (i_674_ < 65536)
				method2325(i_674_);
			    else {
				int i_675_ = (i_674_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_675_];
				int i_676_ = anIntArray4868[i_675_];
				if (i_676_ == 0)
				    i_676_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_675_],
				     anIntArray4943[i_675_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_676_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
			while (i_664_ == 3) {
			    if (i_663_ <= i_658_)
				break;
			    int i_677_ = is[i_660_++];
			    if (i_677_ < 65536)
				method2325(i_677_);
			    else {
				int i_678_ = (i_677_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_678_];
				int i_679_ = anIntArray4868[i_678_];
				if (i_679_ == 0)
				    i_679_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_678_],
				     anIntArray4943[i_678_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_679_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
			while (i_664_ == 5 && i_663_ > i_659_) {
			    int i_680_ = is[i_660_++];
			    if (i_680_ < 65536)
				method2325(i_680_);
			    else {
				int i_681_ = (i_680_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_681_];
				int i_682_ = anIntArray4868[i_681_];
				if (i_682_ == 0)
				    i_682_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_681_],
				     anIntArray4943[i_681_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_682_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				i_661_ = anIntArray4875[11];
				is = anIntArrayArray4869[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
		    }
		    int i_683_ = anIntArray4875[i_664_];
		    int[] is_684_ = anIntArrayArray4869[i_664_];
		    if (arg3) {
			if (!arg1) {
			    for (int i_685_ = 0; i_685_ < i_683_; i_685_++) {
				int i_686_ = is_684_[i_685_];
				if (i_686_ < 65536)
				    method2325(i_686_);
				else {
				    int i_687_ = (i_686_ >> 16) - 1;
				    Class1_Sub7_Sub1 class1_sub7_sub1
					= aClass1_Sub7_Sub1Array4941[i_687_];
				    int i_688_ = anIntArray4868[i_687_];
				    if (i_688_ == 0)
					i_688_ = 1;
				    aClass130_Sub1_4888.method1273
					(class1_sub7_sub1,
					 anIntArray4938[i_687_],
					 anIntArray4943[i_687_],
					 ((class1_sub7_sub1.anInt5210 >> 2)
					  / i_688_));
				}
			    }
			} else {
			    for (int i_689_ = 0; i_689_ < i_683_; i_689_++) {
				int i_690_ = is_684_[i_689_];
				if (i_690_ < 65536)
				    method2328(i_690_);
				else {
				    int i_691_ = (i_690_ >> 16) - 1;
				    Class1_Sub7_Sub1 class1_sub7_sub1
					= aClass1_Sub7_Sub1Array4941[i_691_];
				    int i_692_ = anIntArray4868[i_691_];
				    if (i_692_ == 0)
					i_692_ = 1;
				    aClass130_Sub1_4888.method1273
					(class1_sub7_sub1,
					 anIntArray4938[i_691_],
					 anIntArray4943[i_691_],
					 ((class1_sub7_sub1.anInt5210 >> 2)
					  / i_692_));
				}
			    }
			}
		    } else if (!arg1) {
			for (int i_693_ = 0; i_693_ < i_683_; i_693_++)
			    method2325(is_684_[i_693_]);
		    } else {
			for (int i_694_ = 0; i_694_ < i_683_; i_694_++)
			    method2328(is_684_[i_694_]);
		    }
		}
		if (arg3) {
		    if (arg1) {
			while (i_663_ != -1000) {
			    int i_695_ = is[i_660_++];
			    if (i_695_ < 65536)
				method2328(i_695_);
			    else {
				int i_696_ = (i_695_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_696_];
				int i_697_ = anIntArray4868[i_696_];
				if (i_697_ == 0)
				    i_697_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_696_],
				     anIntArray4943[i_696_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_697_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				is = anIntArrayArray4869[11];
				i_661_ = anIntArray4875[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
		    } else {
			while (i_663_ != -1000) {
			    int i_698_ = is[i_660_++];
			    if (i_698_ < 65536)
				method2325(i_698_);
			    else {
				int i_699_ = (i_698_ >> 16) - 1;
				Class1_Sub7_Sub1 class1_sub7_sub1
				    = aClass1_Sub7_Sub1Array4941[i_699_];
				int i_700_ = anIntArray4868[i_699_];
				if (i_700_ == 0)
				    i_700_ = 1;
				aClass130_Sub1_4888.method1273
				    (class1_sub7_sub1, anIntArray4938[i_699_],
				     anIntArray4943[i_699_],
				     ((class1_sub7_sub1.anInt5210 >> 2)
				      / i_700_));
			    }
			    if (i_660_ == i_661_
				&& is != anIntArrayArray4869[11]) {
				i_660_ = 0;
				is = anIntArrayArray4869[11];
				i_661_ = anIntArray4875[11];
				is_662_ = anIntArray4928;
			    }
			    if (i_660_ < i_661_)
				i_663_ = is_662_[i_660_];
			    else
				i_663_ = -1000;
			}
		    }
		} else if (arg1) {
		    while (i_663_ != -1000) {
			method2328(is[i_660_++]);
			if (i_660_ == i_661_
			    && is != anIntArrayArray4869[11]) {
			    i_660_ = 0;
			    is = anIntArrayArray4869[11];
			    i_661_ = anIntArray4875[11];
			    is_662_ = anIntArray4928;
			}
			if (i_660_ < i_661_)
			    i_663_ = is_662_[i_660_];
			else
			    i_663_ = -1000;
		    }
		} else {
		    while (i_663_ != -1000) {
			method2325(is[i_660_++]);
			if (i_660_ == i_661_
			    && is != anIntArrayArray4869[11]) {
			    i_660_ = 0;
			    is = anIntArrayArray4869[11];
			    i_661_ = anIntArray4875[11];
			    is_662_ = anIntArray4928;
			}
			if (i_660_ < i_661_)
			    i_663_ = is_662_[i_660_];
			else
			    i_663_ = -1000;
		    }
		}
	    }
	}
    }
    
    public void method2284(int arg0) {
	if ((anInt4914 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt4947 = arg0;
	anInt4917 = 0;
    }
    
    public int method2265() {
	if (!aBoolean4872)
	    method2331();
	return aShort4861;
    }
    
    public Class154_Sub2(Class130_Sub1 arg0) {
	aBoolean4897 = false;
	aBoolean4936 = false;
	aClass130_Sub1_4888 = arg0;
    }
    
    public Class154_Sub2(Class130_Sub1 arg0, Class116 arg1, int arg2, int arg3,
			 int arg4, int arg5) {
	aBoolean4897 = false;
	aBoolean4936 = false;
	aClass130_Sub1_4888 = arg0;
	anInt4914 = arg2;
	anInt4856 = arg3;
	anInt4947 = arg4;
	anInt4916 = arg1.anInt1528;
	anInt4860 = arg1.anInt1489;
	anIntArray4893 = arg1.anIntArray1533;
	anIntArray4919 = arg1.anIntArray1511;
	anIntArray4902 = arg1.anIntArray1534;
	anInt4939 = arg1.anInt1536;
	aShortArray4931 = arg1.aShortArray1514;
	aShortArray4901 = arg1.aShortArray1513;
	aShortArray4912 = arg1.aShortArray1541;
	aByte4932 = arg1.aByte1531;
	aByteArray4934 = arg1.aByteArray1522;
	aShortArray4903 = arg1.aShortArray1516;
	aByteArray4908 = arg1.aByteArray1505;
	aShortArray4924 = arg1.aShortArray1525;
	aByteArray4874 = arg1.aByteArray1493;
	aClass41Array4866 = arg1.aClass41Array1535;
	aClass104Array4859 = arg1.aClass104Array1499;
	aShortArray4880 = arg1.aShortArray1502;
	if (arg1.anIntArray1500 != null && (anInt4914 & 0x20) != 0)
	    anIntArrayArray4898 = arg1.method985(0);
	if (arg1.anIntArray1524 != null && (anInt4914 & 0x180) != 0)
	    anIntArrayArray4946 = arg1.method986((byte) -95);
	if (arg1.aShortArray1520 != null) {
	    aShortArray4929 = new short[anInt4939];
	    boolean bool = false;
	    for (int i = 0; i < anInt4939; i++) {
		short i_701_ = arg1.aShortArray1520[i];
		if (i_701_ != -1
		    && !(aClass130_Sub1_4888.anInterface4_4069.method10
			 (-19907, i_701_).aBoolean556)) {
		    aShortArray4929[i] = i_701_;
		    bool = true;
		} else
		    aShortArray4929[i] = (short) -1;
	    }
	    if (!bool)
		aShortArray4929 = null;
	} else
	    aShortArray4929 = null;
	if (aShortArray4929 != null && arg1.anInt1495 > 0
	    && arg1.aByteArray1540 != null) {
	    int[] is = new int[arg1.anInt1495];
	    for (int i = 0; i < anInt4939; i++) {
		if (arg1.aByteArray1540[i] != -1)
		    is[arg1.aByteArray1540[i] & 0xff]++;
	    }
	    anInt4862 = 0;
	    for (int i = 0; i < arg1.anInt1495; i++) {
		if (is[i] > 0 && arg1.aByteArray1521[i] == 0)
		    anInt4862++;
	    }
	    anIntArray4870 = new int[anInt4862];
	    anIntArray4948 = new int[anInt4862];
	    anIntArray4881 = new int[anInt4862];
	    int i = 0;
	    for (int i_702_ = 0; i_702_ < arg1.anInt1495; i_702_++) {
		if (is[i_702_] > 0 && arg1.aByteArray1521[i_702_] == 0) {
		    anIntArray4870[i] = arg1.aShortArray1501[i_702_] & 0xffff;
		    anIntArray4948[i] = arg1.aShortArray1537[i_702_] & 0xffff;
		    anIntArray4881[i] = arg1.aShortArray1512[i_702_] & 0xffff;
		    is[i_702_] = i++;
		} else
		    is[i_702_] = -1;
	    }
	    aByteArray4878 = new byte[anInt4939];
	    for (int i_703_ = 0; i_703_ < anInt4939; i_703_++) {
		if (arg1.aByteArray1540[i_703_] != -1) {
		    aByteArray4878[i_703_]
			= (byte) is[arg1.aByteArray1540[i_703_] & 0xff];
		    if (aByteArray4878[i_703_] == -1
			&& aShortArray4929 != null)
			aShortArray4929[i_703_] = (short) -1;
		} else
		    aByteArray4878[i_703_] = (byte) -1;
	    }
	}
    }
    
    public Class154_Sub2(Class130_Sub1 arg0, Class154_Sub2[] arg1) {
	aBoolean4897 = false;
	aBoolean4936 = false;
	aClass130_Sub1_4888 = arg0;
	boolean bool = false;
	boolean bool_704_ = false;
	boolean bool_705_ = false;
	boolean bool_706_ = false;
	anInt4916 = 0;
	anInt4939 = 0;
	anInt4862 = 0;
	int i = 0;
	int i_707_ = 0;
	aByte4932 = (byte) -1;
	for (int i_708_ = 0; i_708_ < arg1.length; i_708_++) {
	    Class154_Sub2 class154_sub2 = arg1[i_708_];
	    if (class154_sub2 != null) {
		anInt4916 += class154_sub2.anInt4916;
		anInt4939 += class154_sub2.anInt4939;
		anInt4862 += class154_sub2.anInt4862;
		if (class154_sub2.aByteArray4934 != null)
		    bool = true;
		else {
		    if (aByte4932 == -1)
			aByte4932 = class154_sub2.aByte4932;
		    if (aByte4932 != class154_sub2.aByte4932)
			bool = true;
		}
		bool_704_ = bool_704_ | class154_sub2.aByteArray4908 != null;
		bool_705_ = bool_705_ | class154_sub2.aShortArray4929 != null;
		bool_706_ = bool_706_ | class154_sub2.aByteArray4878 != null;
		if (class154_sub2.aClass41Array4866 != null)
		    i += class154_sub2.aClass41Array4866.length;
		if (class154_sub2.aClass104Array4859 != null)
		    i_707_ += class154_sub2.aClass104Array4859.length;
	    }
	}
	anIntArray4893 = new int[anInt4916];
	anIntArray4919 = new int[anInt4916];
	anIntArray4902 = new int[anInt4916];
	aShortArray4931 = new short[anInt4939];
	aShortArray4901 = new short[anInt4939];
	aShortArray4912 = new short[anInt4939];
	anIntArray4918 = new int[anInt4939];
	anIntArray4942 = new int[anInt4939];
	anIntArray4927 = new int[anInt4939];
	if (bool)
	    aByteArray4934 = new byte[anInt4939];
	if (bool_704_)
	    aByteArray4908 = new byte[anInt4939];
	if (bool_705_)
	    aShortArray4929 = new short[anInt4939];
	if (bool_706_)
	    aByteArray4878 = new byte[anInt4939];
	if (anInt4862 > 0) {
	    anIntArray4870 = new int[anInt4862];
	    anIntArray4948 = new int[anInt4862];
	    anIntArray4881 = new int[anInt4862];
	}
	if (i > 0)
	    aClass41Array4866 = new Class41[i];
	if (i_707_ > 0)
	    aClass104Array4859 = new Class104[i_707_];
	anInt4916 = 0;
	int i_709_ = anInt4939;
	anInt4939 = 0;
	anInt4862 = 0;
	i_707_ = 0;
	i = 0;
	for (int i_710_ = 0; i_710_ < arg1.length; i_710_++) {
	    Class154_Sub2 class154_sub2 = arg1[i_710_];
	    if (class154_sub2 != null) {
		class154_sub2.method2311(false);
		if (class154_sub2.aShortArray4903 != null
		    && aShortArray4903 == null)
		    aShortArray4903 = new short[i_709_];
		for (int i_711_ = 0; i_711_ < class154_sub2.anInt4939;
		     i_711_++) {
		    aShortArray4931[anInt4939]
			= (short) (class154_sub2.aShortArray4931[i_711_]
				   + anInt4916);
		    aShortArray4901[anInt4939]
			= (short) (class154_sub2.aShortArray4901[i_711_]
				   + anInt4916);
		    aShortArray4912[anInt4939]
			= (short) (class154_sub2.aShortArray4912[i_711_]
				   + anInt4916);
		    anIntArray4918[anInt4939]
			= class154_sub2.anIntArray4918[i_711_];
		    anIntArray4942[anInt4939]
			= class154_sub2.anIntArray4942[i_711_];
		    anIntArray4927[anInt4939]
			= class154_sub2.anIntArray4927[i_711_];
		    if (class154_sub2.aShortArray4903 != null)
			aShortArray4903[anInt4939]
			    = class154_sub2.aShortArray4903[i_711_];
		    if (bool) {
			if (class154_sub2.aByteArray4934 != null)
			    aByteArray4934[anInt4939]
				= class154_sub2.aByteArray4934[i_711_];
			else if (class154_sub2.aByte4932 != -1)
			    aByteArray4934[anInt4939]
				= class154_sub2.aByte4932;
			else
			    aByteArray4934[anInt4939] = (byte) 10;
		    }
		    if (bool_704_ && class154_sub2.aByteArray4908 != null)
			aByteArray4908[anInt4939]
			    = class154_sub2.aByteArray4908[i_711_];
		    if (bool_705_) {
			if (class154_sub2.aShortArray4929 != null)
			    aShortArray4929[anInt4939]
				= class154_sub2.aShortArray4929[i_711_];
			else
			    aShortArray4929[anInt4939] = (short) -1;
		    }
		    if (bool_706_)
			aByteArray4878[anInt4939]
			    = (byte) ((class154_sub2.aByteArray4878 != null
				       && (class154_sub2.aByteArray4878[i_711_]
					   != -1))
				      ? (class154_sub2.aByteArray4878[i_711_]
					 + anInt4862)
				      : -1);
		    anInt4939++;
		}
		if (class154_sub2.aClass41Array4866 != null) {
		    for (int i_712_ = 0;
			 i_712_ < class154_sub2.aClass41Array4866.length;
			 i_712_++) {
			Class41 class41
			    = class154_sub2.aClass41Array4866[i_712_];
			aClass41Array4866[i] = new Class41(class41, anInt4916);
			i++;
		    }
		}
		if (class154_sub2.aClass104Array4859 != null) {
		    for (int i_713_ = 0;
			 i_713_ < class154_sub2.aClass104Array4859.length;
			 i_713_++) {
			Class104 class104
			    = class154_sub2.aClass104Array4859[i_713_];
			aClass104Array4859[i_707_]
			    = new Class104(class104, anInt4916);
			i_707_++;
		    }
		}
		for (int i_714_ = 0; i_714_ < class154_sub2.anInt4862;
		     i_714_++) {
		    if (class154_sub2.anIntArray4870[i_714_]
			< class154_sub2.anInt4860)
			anIntArray4870[anInt4862]
			    = class154_sub2.anIntArray4870[i_714_] + anInt4916;
		    if (class154_sub2.anIntArray4948[i_714_]
			< class154_sub2.anInt4860)
			anIntArray4948[anInt4862]
			    = class154_sub2.anIntArray4948[i_714_] + anInt4916;
		    if (class154_sub2.anIntArray4881[i_714_]
			< class154_sub2.anInt4860)
			anIntArray4881[anInt4862]
			    = class154_sub2.anIntArray4881[i_714_] + anInt4916;
		    anInt4862++;
		}
		for (int i_715_ = 0; i_715_ < class154_sub2.anInt4860;
		     i_715_++) {
		    anIntArray4893[anInt4916]
			= class154_sub2.anIntArray4893[i_715_];
		    anIntArray4919[anInt4916]
			= class154_sub2.anIntArray4919[i_715_];
		    anIntArray4902[anInt4916]
			= class154_sub2.anIntArray4902[i_715_];
		    anInt4916++;
		}
	    }
	}
	anInt4917 = 2;
	int i_716_ = 0;
	anInt4860 = anInt4916;
	for (int i_717_ = 0; i_717_ < arg1.length; i_717_++) {
	    Class154_Sub2 class154_sub2 = arg1[i_717_];
	    if (class154_sub2 != null) {
		for (int i_718_ = 0; i_718_ < class154_sub2.anInt4862;
		     i_718_++) {
		    if (class154_sub2.anIntArray4870[i_718_]
			>= class154_sub2.anInt4860)
			anIntArray4870[i_716_]
			    = (class154_sub2.anIntArray4870[i_718_]
			       - class154_sub2.anInt4860 + anInt4916);
		    if (class154_sub2.anIntArray4948[i_718_]
			>= class154_sub2.anInt4860)
			anIntArray4948[i_716_]
			    = (class154_sub2.anIntArray4948[i_718_]
			       - class154_sub2.anInt4860 + anInt4916);
		    if (class154_sub2.anIntArray4881[i_718_]
			>= class154_sub2.anInt4860)
			anIntArray4881[i_716_]
			    = (class154_sub2.anIntArray4881[i_718_]
			       - class154_sub2.anInt4860 + anInt4916);
		    i_716_++;
		}
		for (int i_719_ = class154_sub2.anInt4860;
		     i_719_ < class154_sub2.anInt4916; i_719_++) {
		    anIntArray4893[anInt4916]
			= class154_sub2.anIntArray4893[i_719_];
		    anIntArray4919[anInt4916]
			= class154_sub2.anIntArray4919[i_719_];
		    anIntArray4902[anInt4916]
			= class154_sub2.anIntArray4902[i_719_];
		    anInt4916++;
		}
	    }
	}
    }
    
    static {
	anInt4905 = 0;
	for (int i = 1; i < 2048; i++)
	    anIntArray4907[i] = 65536 / i;
    }
}
