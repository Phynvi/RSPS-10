/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80
{
    public static byte[] aByteArray1063 = new byte[16384];
    public int anInt1064;
    public boolean aBoolean1065 = true;
    public Class130_Sub2 aClass130_Sub2_1066;
    public int anInt1067 = -1;
    public int anInt1068;
    public Interface7 anInterface7_1069;
    public Class206 aClass206_1070;
    public int anInt1071;
    public Class36_Sub1 aClass36_Sub1_1072;
    
    public void method785(int arg0) {
	if (aBoolean1065) {
	    aBoolean1065 = false;
	    byte[] is = aClass206_1070.aByteArray3014;
	    byte[] is_0_ = aByteArray1063;
	    int i = 0;
	    int i_1_ = aClass206_1070.anInt3019;
	    int i_2_ = anInt1064 * aClass206_1070.anInt3019 + anInt1071;
	    for (int i_3_ = -128; -1 < (i_3_ ^ 0xffffffff); i_3_++) {
		i = (i << -893888248) + -i;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		    if (0 != is[i_2_++])
			i++;
		}
		i_2_ += i_1_ - 128;
	    }
	    if (aClass36_Sub1_1072 != null
		&& (anInt1067 ^ 0xffffffff) == (i ^ 0xffffffff))
		aBoolean1065 = false;
	    else {
		anInt1067 = i;
		i_2_ = anInt1071 + anInt1064 * i_1_;
		int i_5_ = arg0;
		for (int i_6_ = -128; -1 < (i_6_ ^ 0xffffffff); i_6_++) {
		    for (int i_7_ = -128; 0 > i_7_; i_7_++) {
			if (is[i_2_] != 0)
			    is_0_[i_5_++] = (byte) 68;
			else {
			    int i_8_ = 0;
			    if ((is[i_2_ - 1] ^ 0xffffffff) != -1)
				i_8_++;
			    if ((is[i_2_ - -1] ^ 0xffffffff) != -1)
				i_8_++;
			    if (-1 != (is[i_2_ - i_1_] ^ 0xffffffff))
				i_8_++;
			    if (-1 != (is[i_2_ - -i_1_] ^ 0xffffffff))
				i_8_++;
			    is_0_[i_5_++] = (byte) (i_8_ * 17);
			}
			i_2_++;
		    }
		    i_2_ += -128 + aClass206_1070.anInt3019;
		}
		if (null == aClass36_Sub1_1072) {
		    aClass36_Sub1_1072
			= new Class36_Sub1(aClass130_Sub2_1066, 3553, 6406,
					   128, 128, false, aByteArray1063,
					   6406, false);
		    aClass36_Sub1_1072.method485(false, false);
		    aClass36_Sub1_1072.method477(true);
		} else
		    aClass36_Sub1_1072.method482(0, 0, 128, 128,
						 aByteArray1063, 6406, 0, 0,
						 false);
	    }
	}
    }
    
    public void method786(boolean arg0) {
	method787(anInt1068, (byte) -73, anInterface7_1069);
	if (arg0 != true)
	    aClass130_Sub2_1066 = null;
    }
    
    public void method787(int arg0, byte arg1, Interface7 arg2) {
	if (0 != arg0) {
	    method785(0);
	    int i = -107 % ((0 - arg1) / 46);
	    aClass130_Sub2_1066.method1347(aClass36_Sub1_1072);
	    aClass130_Sub2_1066.method1312(arg2, 4, 0, arg0);
	}
    }
    
    public Class80(Class130_Sub2 arg0, Class206 arg1, Class68_Sub1 arg2,
		   int arg3, int arg4, int arg5, int arg6, int arg7) {
	aClass206_1070 = arg1;
	aClass130_Sub2_1066 = arg0;
	anInt1071 = arg6;
	anInt1064 = arg7;
	int i = 1 << arg5;
	int i_9_ = 0;
	int i_10_ = arg3 << arg5;
	int i_11_ = arg4 << arg5;
	for (int i_12_ = 0; i_12_ < i; i_12_++) {
	    int i_13_ = i_10_ + (i_12_ + i_11_) * arg2.anInt924;
	    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_14_++) {
		short[] is = arg2.aShortArrayArray3831[i_13_++];
		if (is != null)
		    i_9_ += is.length;
	    }
	}
	anInt1068 = i_9_;
	if (0 >= i_9_)
	    aClass36_Sub1_1072 = null;
	else {
	    Stream stream = new Stream(i_9_ * 2);
	    if (!aClass130_Sub2_1066.aBoolean3360) {
		for (int i_15_ = 0; i > i_15_; i_15_++) {
		    int i_16_ = arg2.anInt924 * (i_11_ - -i_15_) - -i_10_;
		    for (int i_17_ = 0;
			 (i ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
			short[] is = arg2.aShortArrayArray3831[i_16_++];
			if (is != null) {
			    for (int i_18_ = 0; is.length > i_18_; i_18_++)
				stream.method1773(677910600,
							  is[i_18_]);
			}
		    }
		}
	    } else {
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
		    int i_20_ = i_10_ + (i_11_ - -i_19_) * arg2.anInt924;
		    for (int i_21_ = 0; i_21_ < i; i_21_++) {
			short[] is = arg2.aShortArrayArray3831[i_20_++];
			if (null != is) {
			    for (int i_22_ = 0;
				 ((is.length ^ 0xffffffff)
				  < (i_22_ ^ 0xffffffff));
				 i_22_++)
				stream.writeShort(is[i_22_]);
			}
		    }
		}
	    }
	    anInterface7_1069
		= aClass130_Sub2_1066.method1287(5123,
						 stream.data,
						 stream.offset,
						 false);
	}
    }
}
