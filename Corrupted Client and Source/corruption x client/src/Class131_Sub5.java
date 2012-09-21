/* Class131_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub5 extends Class131
{
    public int anInt4136;
    public boolean aBoolean4137;
    public static int[] anIntArray4138;
    public int anInt4139;
    public int[] anIntArray4140;
    public int anInt4141;
    
    public void method1653(int arg0, int arg1) {
	if (arg0 != 0 || arg1 != 0) {
	    if (anIntArray4138 == null
		|| anIntArray4138.length < anIntArray4140.length)
		anIntArray4138 = new int[anIntArray4140.length];
	    int i = anIntArray4140.length;
	    int i_0_ = arg0;
	    int i_1_ = anInt4141 - 1;
	    int i_2_ = anInt4141 * arg1;
	    int i_3_ = i - 1;
	    for (int i_4_ = 0; i_4_ < i; i_4_ += anInt4141) {
		int i_5_ = i_4_ + i_2_ & i_3_;
		for (int i_6_ = 0; i_6_ < anInt4141; i_6_++) {
		    int i_7_ = i_4_ + i_6_;
		    int i_8_ = i_5_ + (i_6_ + i_0_ & i_1_);
		    anIntArray4138[i_7_] = anIntArray4140[i_8_];
		}
	    }
	    int[] is = anIntArray4140;
	    anIntArray4140 = anIntArray4138;
	    anIntArray4138 = is;
	}
    }
    
    public static void method1654() {
	anIntArray4138 = null;
    }
    
    public int[] method1655() {
	return anIntArray4140;
    }
    
    public Class131_Sub5(int arg0, int arg1, int[] arg2, boolean arg3) {
	anInt4139 = arg0;
	anInt4141 = arg1;
	anIntArray4140 = arg2;
	if (arg3) {
	    int[] is = new int[anInt4141];
	    int[] is_9_ = new int[anInt4141];
	    int[] is_10_ = new int[anInt4141];
	    if (anIntArray4138 == null
		|| anIntArray4138.length < anIntArray4140.length)
		anIntArray4138 = new int[anIntArray4140.length];
	    int i = anInt4141;
	    int i_11_ = anInt4141;
	    int i_12_ = i - 1;
	    int i_13_ = i_11_ - 1;
	    int i_14_ = i * i_11_;
	    int i_16_;
	    int i_15_ = i_16_ = i;
	    for (int i_17_ = 2; i_17_ >= 0; i_17_--) {
		for (int i_18_ = i_12_; i_18_ >= 0; i_18_--) {
		    int i_19_ = anIntArray4140[--i_16_];
		    is[i_18_] += i_19_ >> 16 & 0xff;
		    is_9_[i_18_] += i_19_ >> 8 & 0xff;
		    is_10_[i_18_] += i_19_ & 0xff;
		}
		if (i_16_ == 0)
		    i_16_ = i_14_;
	    }
	    int i_20_ = i_14_;
	    for (int i_21_ = i_13_; i_21_ >= 0; i_21_--) {
		int i_22_ = 1;
		int i_23_ = 1;
		int i_25_;
		int i_26_;
		int i_24_ = i_25_ = i_26_ = 0;
		for (int i_27_ = 2; i_27_ >= 0; i_27_--) {
		    i_23_--;
		    i_24_ += is[i_23_];
		    i_26_ += is_9_[i_23_];
		    i_25_ += is_10_[i_23_];
		    if (i_23_ == 0)
			i_23_ = i;
		}
		for (int i_28_ = i_12_; i_28_ >= 0; i_28_--) {
		    i_23_--;
		    i_22_--;
		    int i_29_ = i_24_ / 9;
		    int i_30_ = i_26_ / 9;
		    int i_31_ = i_25_ / 9;
		    anIntArray4138[--i_20_] = i_29_ << 16 | i_30_ << 8 | i_31_;
		    i_24_ += is[i_23_] - is[i_22_];
		    i_25_ += is_10_[i_23_] - is_10_[i_22_];
		    i_26_ += is_9_[i_23_] - is_9_[i_22_];
		    if (i_23_ == 0)
			i_23_ = i;
		    if (i_22_ == 0)
			i_22_ = i;
		}
		for (int i_32_ = i_12_; i_32_ >= 0; i_32_--) {
		    int i_33_ = anIntArray4140[--i_16_];
		    int i_34_ = anIntArray4140[--i_15_];
		    is[i_32_] += (i_33_ >> 16 & 0xff) - (i_34_ >> 16 & 0xff);
		    is_9_[i_32_] += (i_33_ >> 8 & 0xff) - (i_34_ >> 8 & 0xff);
		    is_10_[i_32_] += (i_33_ & 0xff) - (i_34_ & 0xff);
		}
		if (i_16_ == 0)
		    i_16_ = i_14_;
		if (i_15_ == 0)
		    i_15_ = i_14_;
	    }
	    int[] is_35_ = anIntArray4140;
	    anIntArray4140 = anIntArray4138;
	    anIntArray4138 = is_35_;
	}
    }
}
