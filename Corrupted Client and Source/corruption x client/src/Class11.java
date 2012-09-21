/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11
{
    public int[] anIntArray122;
    public int anInt123;
    public int anInt124 = Class131_Sub39.method1896(16);
    public int anInt125;
    public int anInt126;
    public int anInt127;
    public int anInt128;
    
    public Class11() {
	anInt123 = Class131_Sub39.method1896(24);
	anInt127 = Class131_Sub39.method1896(24);
	anInt128 = Class131_Sub39.method1896(24) + 1;
	anInt126 = Class131_Sub39.method1896(6) + 1;
	anInt125 = Class131_Sub39.method1896(8);
	int[] is = new int[anInt126];
	for (int i = 0; i < anInt126; i++) {
	    int i_0_ = 0;
	    int i_1_ = Class131_Sub39.method1896(3);
	    boolean bool = Class131_Sub39.method1902() != 0;
	    if (bool)
		i_0_ = Class131_Sub39.method1896(5);
	    is[i] = i_0_ << 3 | i_1_;
	}
	anIntArray122 = new int[anInt126 * 8];
	for (int i = 0; i < anInt126 * 8; i++)
	    anIntArray122[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
				? Class131_Sub39.method1896(8) : -1);
    }
    
    public void method208(float[] arg0, int arg1, boolean arg2) {
	for (int i = 0; i < arg1; i++)
	    arg0[i] = 0.0F;
	if (!arg2) {
	    int i = Class131_Sub39.aClass27Array4635[anInt125].anInt271;
	    int i_2_ = anInt127 - anInt123;
	    int i_3_ = i_2_ / anInt128;
	    int[] is = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < 8; i_4_++) {
		int i_5_ = 0;
		while (i_5_ < i_3_) {
		    if (i_4_ == 0) {
			int i_6_ = Class131_Sub39.aClass27Array4635
				       [anInt125].method407();
			for (int i_7_ = i - 1; i_7_ >= 0; i_7_--) {
			    if (i_5_ + i_7_ < i_3_)
				is[i_5_ + i_7_] = i_6_ % anInt126;
			    i_6_ /= anInt126;
			}
		    }
		    for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = is[i_5_];
			int i_10_ = anIntArray122[i_9_ * 8 + i_4_];
			if (i_10_ >= 0) {
			    int i_11_ = anInt123 + i_5_ * anInt128;
			    Class27 class27
				= Class131_Sub39.aClass27Array4635[i_10_];
			    if (anInt124 == 0) {
				int i_12_ = anInt128 / class27.anInt271;
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				    float[] fs = class27.method408();
				    for (int i_14_ = 0;
					 i_14_ < class27.anInt271; i_14_++)
					arg0[i_11_ + i_13_ + i_14_ * i_12_]
					    += fs[i_14_];
				}
			    } else {
				int i_15_ = 0;
				while (i_15_ < anInt128) {
				    float[] fs = class27.method408();
				    for (int i_16_ = 0;
					 i_16_ < class27.anInt271; i_16_++) {
					arg0[i_11_ + i_15_] += fs[i_16_];
					i_15_++;
				    }
				}
			    }
			}
			if (++i_5_ >= i_3_)
			    break;
		    }
		}
	    }
	}
    }
}
