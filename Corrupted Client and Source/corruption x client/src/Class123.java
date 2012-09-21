/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class123
{
    public static int[] anIntArray1610;
    public static int anInt1611;
    public static int anInt1612;
    public static int anInt1613;
    public static int anInt1614;
    public static int anInt1615;
    public static int anInt1616;
    public static int anInt1617;
    
    public static void method1070(Class130 arg0, int[] arg1, int arg2,
				  int[] arg3, int[] arg4) {
	method1072(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
    
    public static void method1071(int arg0, int arg1) {
	if (arg1 > arg0 + 4) {
	    int i = arg0;
	    int i_0_ = anIntArray1610[i];
	    int i_1_ = anIntArray1610[i + 1];
	    int i_2_ = anIntArray1610[i + 2];
	    int i_3_ = anIntArray1610[i + 3];
	    for (int i_4_ = arg0 + 4; i_4_ < arg1; i_4_ += 4) {
		int i_5_ = anIntArray1610[i_4_ + 1];
		if (i_5_ < i_1_) {
		    anIntArray1610[i] = anIntArray1610[i_4_];
		    anIntArray1610[i + 1] = i_5_;
		    anIntArray1610[i + 2] = anIntArray1610[i_4_ + 2];
		    anIntArray1610[i + 3] = anIntArray1610[i_4_ + 3];
		    i += 4;
		    anIntArray1610[i_4_] = anIntArray1610[i];
		    anIntArray1610[i_4_ + 1] = anIntArray1610[i + 1];
		    anIntArray1610[i_4_ + 2] = anIntArray1610[i + 2];
		    anIntArray1610[i_4_ + 3] = anIntArray1610[i + 3];
		}
	    }
	    anIntArray1610[i] = i_0_;
	    anIntArray1610[i + 1] = i_1_;
	    anIntArray1610[i + 2] = i_2_;
	    anIntArray1610[i + 3] = i_3_;
	    method1071(arg0, i);
	    method1071(i + 4, arg1);
	}
    }
    
    public static void method1072(Class130 arg0, int[] arg1, int arg2,
				  int arg3, int arg4, int[] arg5, int[] arg6) {
	int[] is = new int[4];
	arg0.method1228(is);
	if (arg5 != null && is[3] - is[1] != arg5.length)
	    throw new IllegalStateException();
	method1073();
	method1078(arg1, arg2, arg3);
	method1074(is[1]);
	while (method1075(is[3])) {
	    int i = anInt1613;
	    int i_6_ = anInt1614;
	    int i_7_ = anInt1611;
	    if (arg5 != null) {
		int i_8_ = i_7_ - is[1];
		if (i < arg5[i_8_] + is[0])
		    i = arg5[i_8_] + is[0];
		if (i_6_ > arg5[i_8_] + arg6[i_8_] + is[0])
		    i_6_ = arg5[i_8_] + arg6[i_8_] + is[0];
		if (i_6_ - i <= 0)
		    continue;
	    }
	    arg0.method1176(i, i_7_, i_6_ - i, arg4, 1);
	}
    }
    
    public static void method1073() {
	anInt1612 = 0;
    }
    
    public static void method1074(int arg0) {
	if (anInt1612 < 0) {
	    anInt1615 = anInt1616 = anInt1617 = 0;
	    anInt1611 = 2147483646;
	} else {
	    method1071(0, anInt1612);
	    int i = anIntArray1610[1];
	    if (i < arg0)
		i = arg0;
	    int i_9_ = 0;
	    int i_10_;
	    for (i_10_ = 0; i_10_ < anInt1612; i_10_ += 4) {
		int i_11_ = anIntArray1610[i_10_ + 1];
		if (i < i_11_)
		    break;
		int i_12_ = anIntArray1610[i_10_];
		int i_13_ = anIntArray1610[i_10_ + 2];
		int i_14_ = anIntArray1610[i_10_ + 3];
		int i_15_ = (i_13_ - i_12_ << 16) / (i_14_ - i_11_);
		int i_16_ = (i_12_ << 16) + 32768;
		anIntArray1610[i_10_] = i_16_ + (i - i_11_) * i_15_;
		anIntArray1610[i_10_ + 2] = i_15_;
	    }
	    anInt1615 = i_9_;
	    anInt1616 = i_10_;
	    anInt1617 = i_10_;
	    anInt1611 = i - 1;
	}
    }
    
    public static boolean method1075(int arg0) {
	int i = anInt1616;
	int i_17_ = anInt1617;
	int i_18_ = anInt1611;
	int i_19_;
	for (/**/; i_17_ >= i; i_17_ = i_19_) {
	    anInt1611 = ++i_18_;
	    if (i_18_ >= arg0)
		return false;
	    i_19_ = anInt1615;
	    for (/**/; i < anInt1612; i += 4) {
		int i_20_ = anIntArray1610[i + 1];
		if (i_18_ < i_20_)
		    break;
		int i_21_ = anIntArray1610[i];
		int i_22_ = anIntArray1610[i + 2];
		int i_23_ = anIntArray1610[i + 3];
		int i_24_ = (i_22_ - i_21_ << 16) / (i_23_ - i_20_);
		int i_25_ = (i_21_ << 16) + 32768;
		anIntArray1610[i] = i_25_;
		anIntArray1610[i + 2] = i_24_;
	    }
	    for (int i_26_ = i_19_; i_26_ < i; i_26_ += 4) {
		int i_27_ = anIntArray1610[i_26_ + 3];
		if (i_18_ >= i_27_) {
		    anIntArray1610[i_26_] = anIntArray1610[i_19_];
		    anIntArray1610[i_26_ + 1] = anIntArray1610[i_19_ + 1];
		    anIntArray1610[i_26_ + 2] = anIntArray1610[i_19_ + 2];
		    anIntArray1610[i_26_ + 3] = anIntArray1610[i_19_ + 3];
		    i_19_ += 4;
		}
	    }
	    if (i_19_ == anInt1612) {
		anInt1612 = 0;
		return false;
	    }
	    method1077(i_19_, i);
	    anInt1615 = i_19_;
	    anInt1616 = i;
	}
	anInt1613 = anIntArray1610[i_17_] >> 16;
	anInt1614 = anIntArray1610[i_17_ + 4] >> 16;
	anIntArray1610[i_17_] += anIntArray1610[i_17_ + 2];
	anIntArray1610[i_17_ + 4] += anIntArray1610[i_17_ + 6];
	i_17_ += 8;
	anInt1617 = i_17_;
	return true;
    }
    
    public static void method1076() {
	anIntArray1610 = null;
    }
    
    public static void method1077(int arg0, int arg1) {
	for (/**/; arg1 >= arg0 + 8; arg1 -= 4) {
	    boolean bool = true;
	    for (int i = arg0 + 4; i < arg1; i += 4) {
		int i_28_ = anIntArray1610[i - 4];
		int i_29_ = anIntArray1610[i];
		if (i_28_ > i_29_) {
		    bool = false;
		    anIntArray1610[i - 4] = i_29_;
		    anIntArray1610[i] = i_28_;
		    i_28_ = anIntArray1610[i - 2];
		    anIntArray1610[i - 2] = anIntArray1610[i + 2];
		    anIntArray1610[i + 2] = i_28_;
		    i_28_ = anIntArray1610[i - 1];
		    anIntArray1610[i - 1] = anIntArray1610[i + 3];
		    anIntArray1610[i + 3] = i_28_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    public static void method1078(int[] arg0, int arg1, int arg2) {
	int i = anInt1612 + (arg2 << 1);
	if (anIntArray1610 == null || anIntArray1610.length < i) {
	    int[] is = new int[i];
	    for (int i_30_ = 0; i_30_ < anInt1612; i_30_++)
		is[i_30_] = anIntArray1610[i_30_];
	    anIntArray1610 = is;
	}
	arg2 += arg1;
	int i_31_ = arg2 - 2;
	for (int i_32_ = arg1; i_32_ < arg2; i_32_ += 2) {
	    int i_33_ = arg0[i_31_ + 1];
	    int i_34_ = arg0[i_32_ + 1];
	    if (i_33_ < i_34_) {
		anIntArray1610[anInt1612++] = arg0[i_31_];
		anIntArray1610[anInt1612++] = i_33_;
		anIntArray1610[anInt1612++] = arg0[i_32_];
		anIntArray1610[anInt1612++] = i_34_;
	    } else if (i_34_ < i_33_) {
		anIntArray1610[anInt1612++] = arg0[i_32_];
		anIntArray1610[anInt1612++] = i_34_;
		anIntArray1610[anInt1612++] = arg0[i_31_];
		anIntArray1610[anInt1612++] = i_33_;
	    }
	    i_31_ = i_32_;
	}
    }
    
    public static void method1079(Class130 arg0, int[] arg1, int arg2) {
	method1072(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
