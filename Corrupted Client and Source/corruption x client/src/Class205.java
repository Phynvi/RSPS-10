/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class205
{
    public Class15 aClass15_2986;
    public static int[] anIntArray2987;
    public Class15 aClass15_2988;
    public Class15 aClass15_2989;
    public Class15 aClass15_2990;
    public Class185 aClass185_2991;
    public Class15 aClass15_2992;
    public Class15 aClass15_2993;
    public Class15 aClass15_2994;
    public int[] anIntArray2995;
    public int anInt2996;
    public int anInt2997 = 100;
    public int anInt2998 = 0;
    public Class15 aClass15_2999;
    public static int[] anIntArray3000 = new int[32768];
    public static int[] anIntArray3001;
    public Class15 aClass15_3002;
    public int[] anIntArray3003;
    public static int[] anIntArray3004;
    public static int[] anIntArray3005;
    public static int[] anIntArray3006;
    public static int[] anIntArray3007;
    public int[] anIntArray3008;
    public static int[] anIntArray3009;
    public int anInt3010;
    
    public static void method2734() {
	anIntArray2987 = null;
	anIntArray3000 = null;
	anIntArray3001 = null;
	anIntArray3005 = null;
	anIntArray3009 = null;
	anIntArray3006 = null;
	anIntArray3007 = null;
	anIntArray3004 = null;
    }
    
    public void method2735(Stream arg0) {
	aClass15_2988 = new Class15();
	aClass15_2988.method221(arg0);
	aClass15_2994 = new Class15();
	aClass15_2994.method221(arg0);
	int i = arg0.readUnsignedByte(-101);
	if (i != 0) {
	    arg0.offset--;
	    aClass15_2990 = new Class15();
	    aClass15_2990.method221(arg0);
	    aClass15_2999 = new Class15();
	    aClass15_2999.method221(arg0);
	}
	i = arg0.readUnsignedByte(-84);
	if (i != 0) {
	    arg0.offset--;
	    aClass15_2986 = new Class15();
	    aClass15_2986.method221(arg0);
	    aClass15_2989 = new Class15();
	    aClass15_2989.method221(arg0);
	}
	i = arg0.readUnsignedByte(120);
	if (i != 0) {
	    arg0.offset--;
	    aClass15_3002 = new Class15();
	    aClass15_3002.method221(arg0);
	    aClass15_2992 = new Class15();
	    aClass15_2992.method221(arg0);
	}
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    int i_1_ = arg0.readSmart(-1647926640);
	    if (i_1_ == 0)
		break;
	    anIntArray3008[i_0_] = i_1_;
	    anIntArray2995[i_0_] = arg0.method1775((byte) 35);
	    anIntArray3003[i_0_] = arg0.readSmart(-1647926640);
	}
	anInt2996 = arg0.readSmart(-1647926640);
	anInt2997 = arg0.readSmart(-1647926640);
	anInt3010 = arg0.readUnsignedShort(8104);
	anInt2998 = arg0.readUnsignedShort(8104);
	aClass185_2991 = new Class185();
	aClass15_2993 = new Class15();
	aClass185_2991.method2559(arg0, aClass15_2993);
    }
    
    public int[] method2736(int arg0, int arg1) {
	Class61.method656(anIntArray2987, 0, arg0);
	if (arg1 < 10)
	    return anIntArray2987;
	double d = (double) arg0 / ((double) arg1 + 0.0);
	aClass15_2988.method220();
	aClass15_2994.method220();
	int i = 0;
	int i_2_ = 0;
	int i_3_ = 0;
	if (aClass15_2990 != null) {
	    aClass15_2990.method220();
	    aClass15_2999.method220();
	    i = (int) ((double) (aClass15_2990.anInt166
				 - aClass15_2990.anInt165)
		       * 32.768 / d);
	    i_2_ = (int) ((double) aClass15_2990.anInt165 * 32.768 / d);
	}
	int i_4_ = 0;
	int i_5_ = 0;
	int i_6_ = 0;
	if (aClass15_2986 != null) {
	    aClass15_2986.method220();
	    aClass15_2989.method220();
	    i_4_ = (int) ((double) (aClass15_2986.anInt166
				    - aClass15_2986.anInt165)
			  * 32.768 / d);
	    i_5_ = (int) ((double) aClass15_2986.anInt165 * 32.768 / d);
	}
	for (int i_7_ = 0; i_7_ < 5; i_7_++) {
	    if (anIntArray3008[i_7_] != 0) {
		anIntArray3005[i_7_] = 0;
		anIntArray3009[i_7_]
		    = (int) ((double) anIntArray3003[i_7_] * d);
		anIntArray3006[i_7_] = (anIntArray3008[i_7_] << 14) / 100;
		anIntArray3007[i_7_]
		    = (int) ((double) (aClass15_2988.anInt166
				       - aClass15_2988.anInt165)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) anIntArray2995[i_7_])
			     / d);
		anIntArray3004[i_7_]
		    = (int) ((double) aClass15_2988.anInt165 * 32.768 / d);
	    }
	}
	for (int i_8_ = 0; i_8_ < arg0; i_8_++) {
	    int i_9_ = aClass15_2988.method222(arg0);
	    int i_10_ = aClass15_2994.method222(arg0);
	    if (aClass15_2990 != null) {
		int i_11_ = aClass15_2990.method222(arg0);
		int i_12_ = aClass15_2999.method222(arg0);
		i_9_ += method2737(i_3_, i_12_, aClass15_2990.anInt164) >> 1;
		i_3_ += (i_11_ * i >> 16) + i_2_;
	    }
	    if (aClass15_2986 != null) {
		int i_13_ = aClass15_2986.method222(arg0);
		int i_14_ = aClass15_2989.method222(arg0);
		i_10_
		    = i_10_ * ((method2737(i_6_, i_14_, aClass15_2986.anInt164)
				>> 1)
			       + 32768) >> 15;
		i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
	    }
	    for (int i_15_ = 0; i_15_ < 5; i_15_++) {
		if (anIntArray3008[i_15_] != 0) {
		    int i_16_ = i_8_ + anIntArray3009[i_15_];
		    if (i_16_ < arg0) {
			anIntArray2987[i_16_]
			    += method2737(anIntArray3005[i_15_],
					  i_10_ * anIntArray3006[i_15_] >> 15,
					  aClass15_2988.anInt164);
			anIntArray3005[i_15_]
			    += ((i_9_ * anIntArray3007[i_15_] >> 16)
				+ anIntArray3004[i_15_]);
		    }
		}
	    }
	}
	if (aClass15_3002 != null) {
	    aClass15_3002.method220();
	    aClass15_2992.method220();
	    int i_17_ = 0;
	    boolean bool = false;
	    boolean bool_18_ = true;
	    for (int i_19_ = 0; i_19_ < arg0; i_19_++) {
		int i_20_ = aClass15_3002.method222(arg0);
		int i_21_ = aClass15_2992.method222(arg0);
		int i_22_;
		if (bool_18_)
		    i_22_
			= aClass15_3002.anInt165 + (((aClass15_3002.anInt166
						      - aClass15_3002.anInt165)
						     * i_20_)
						    >> 8);
		else
		    i_22_
			= aClass15_3002.anInt165 + (((aClass15_3002.anInt166
						      - aClass15_3002.anInt165)
						     * i_21_)
						    >> 8);
		i_17_ += 256;
		if (i_17_ >= i_22_) {
		    i_17_ = 0;
		    bool_18_ = !bool_18_;
		}
		if (bool_18_)
		    anIntArray2987[i_19_] = 0;
	    }
	}
	if (anInt2996 > 0 && anInt2997 > 0) {
	    int i_23_ = (int) ((double) anInt2996 * d);
	    for (int i_24_ = i_23_; i_24_ < arg0; i_24_++)
		anIntArray2987[i_24_]
		    += anIntArray2987[i_24_ - i_23_] * anInt2997 / 100;
	}
	if (aClass185_2991.anIntArray2642[0] > 0
	    || aClass185_2991.anIntArray2642[1] > 0) {
	    aClass15_2993.method220();
	    int i_25_ = aClass15_2993.method222(arg0 + 1);
	    int i_26_ = aClass185_2991.method2555(0, (float) i_25_ / 65536.0F);
	    int i_27_ = aClass185_2991.method2555(1, (float) i_25_ / 65536.0F);
	    if (arg0 >= i_26_ + i_27_) {
		int i_28_ = 0;
		int i_29_ = i_27_;
		if (i_29_ > arg0 - i_26_)
		    i_29_ = arg0 - i_26_;
		for (/**/; i_28_ < i_29_; i_28_++) {
		    int i_30_ = (int) (((long) anIntArray2987[i_28_ + i_26_]
					* (long) Class185.anInt2641)
				       >> 16);
		    for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
			i_30_ += (int) (((long) (anIntArray2987
						 [i_28_ + i_26_ - 1 - i_31_])
					 * (long) (Class185.anIntArrayArray2643
						   [0][i_31_]))
					>> 16);
		    for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
			i_30_
			    -= (int) (((long) anIntArray2987[i_28_ - 1 - i_32_]
				       * (long) (Class185.anIntArrayArray2643
						 [1][i_32_]))
				      >> 16);
		    anIntArray2987[i_28_] = i_30_;
		    i_25_ = aClass15_2993.method222(arg0 + 1);
		}
		i_29_ = 128;
		for (;;) {
		    if (i_29_ > arg0 - i_26_)
			i_29_ = arg0 - i_26_;
		    for (/**/; i_28_ < i_29_; i_28_++) {
			int i_33_
			    = (int) (((long) anIntArray2987[i_28_ + i_26_]
				      * (long) Class185.anInt2641)
				     >> 16);
			for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
			    i_33_
				+= (int) (((long) (anIntArray2987
						   [i_28_ + i_26_ - 1 - i_34_])
					   * (long) (Class185
						     .anIntArrayArray2643[0]
						     [i_34_]))
					  >> 16);
			for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
			    i_33_ -= (int) (((long) (anIntArray2987
						     [i_28_ - 1 - i_35_])
					     * (long) (Class185
						       .anIntArrayArray2643[1]
						       [i_35_]))
					    >> 16);
			anIntArray2987[i_28_] = i_33_;
			i_25_ = aClass15_2993.method222(arg0 + 1);
		    }
		    if (i_28_ >= arg0 - i_26_)
			break;
		    i_26_
			= aClass185_2991.method2555(0,
						    (float) i_25_ / 65536.0F);
		    i_27_
			= aClass185_2991.method2555(1,
						    (float) i_25_ / 65536.0F);
		    i_29_ += 128;
		}
		for (/**/; i_28_ < arg0; i_28_++) {
		    int i_36_ = 0;
		    for (int i_37_ = i_28_ + i_26_ - arg0; i_37_ < i_26_;
			 i_37_++)
			i_36_ += (int) (((long) (anIntArray2987
						 [i_28_ + i_26_ - 1 - i_37_])
					 * (long) (Class185.anIntArrayArray2643
						   [0][i_37_]))
					>> 16);
		    for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
			i_36_
			    -= (int) (((long) anIntArray2987[i_28_ - 1 - i_38_]
				       * (long) (Class185.anIntArrayArray2643
						 [1][i_38_]))
				      >> 16);
		    anIntArray2987[i_28_] = i_36_;
		    i_25_ = aClass15_2993.method222(arg0 + 1);
		}
	    }
	}
	for (int i_39_ = 0; i_39_ < arg0; i_39_++) {
	    if (anIntArray2987[i_39_] < -32768)
		anIntArray2987[i_39_] = -32768;
	    if (anIntArray2987[i_39_] > 32767)
		anIntArray2987[i_39_] = 32767;
	}
	return anIntArray2987;
    }
    
    public int method2737(int arg0, int arg1, int arg2) {
	if (arg2 == 1) {
	    if ((arg0 & 0x7fff) < 16384)
		return arg1;
	    return -arg1;
	}
	if (arg2 == 2)
	    return anIntArray3001[arg0 & 0x7fff] * arg1 >> 14;
	if (arg2 == 3)
	    return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
	if (arg2 == 4)
	    return anIntArray3000[arg0 / 2607 & 0x7fff] * arg1;
	return 0;
    }
    
    public Class205() {
	anIntArray2995 = new int[5];
	anInt2996 = 0;
	anIntArray3003 = new int[5];
	anIntArray3008 = new int[5];
	anInt3010 = 500;
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    anIntArray3000[i] = (random.nextInt() & 0x2) - 1;
	anIntArray3001 = new int[32768];
	for (int i = 0; i < 32768; i++)
	    anIntArray3001[i]
		= (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	anIntArray2987 = new int[220500];
	anIntArray3004 = new int[5];
	anIntArray3009 = new int[5];
	anIntArray3007 = new int[5];
	anIntArray3006 = new int[5];
	anIntArray3005 = new int[5];
    }
}
