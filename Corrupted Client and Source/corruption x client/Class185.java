/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class185
{
    public int[] anIntArray2636;
    public int[][][] anIntArrayArrayArray2637 = new int[2][2][4];
    public static float aFloat2638;
    public static float[][] aFloatArrayArray2639 = new float[2][8];
    public int[][][] anIntArrayArrayArray2640;
    public static int anInt2641;
    public int[] anIntArray2642;
    public static int[][] anIntArrayArray2643 = new int[2][8];
    
    public static void method2554() {
	aFloatArrayArray2639 = null;
	anIntArrayArray2643 = null;
    }
    
    public int method2555(int arg0, float arg1) {
	if (arg0 == 0) {
	    float f
		= ((float) anIntArray2636[0]
		   + (float) (anIntArray2636[1] - anIntArray2636[0]) * arg1);
	    f *= 0.0030517578F;
	    aFloat2638 = (float) Math.pow(0.1, (double) (f / 20.0F));
	    anInt2641 = (int) (aFloat2638 * 65536.0F);
	}
	if (anIntArray2642[arg0] == 0)
	    return 0;
	float f = method2557(arg0, 0, arg1);
	aFloatArrayArray2639[arg0][0]
	    = -2.0F * f * (float) Math.cos((double) method2558(arg0, 0, arg1));
	aFloatArrayArray2639[arg0][1] = f * f;
	for (int i = 1; i < anIntArray2642[arg0]; i++) {
	    f = method2557(arg0, i, arg1);
	    float f_0_
		= (-2.0F * f
		   * (float) Math.cos((double) method2558(arg0, i, arg1)));
	    float f_1_ = f * f;
	    aFloatArrayArray2639[arg0][i * 2 + 1]
		= aFloatArrayArray2639[arg0][i * 2 - 1] * f_1_;
	    aFloatArrayArray2639[arg0][i * 2]
		= (aFloatArrayArray2639[arg0][i * 2 - 1] * f_0_
		   + aFloatArrayArray2639[arg0][i * 2 - 2] * f_1_);
	    for (int i_2_ = i * 2 - 1; i_2_ >= 2; i_2_--)
		aFloatArrayArray2639[arg0][i_2_]
		    += (aFloatArrayArray2639[arg0][i_2_ - 1] * f_0_
			+ aFloatArrayArray2639[arg0][i_2_ - 2] * f_1_);
	    aFloatArrayArray2639[arg0][1]
		+= aFloatArrayArray2639[arg0][0] * f_0_ + f_1_;
	    aFloatArrayArray2639[arg0][0] += f_0_;
	}
	if (arg0 == 0) {
	    for (int i = 0; i < anIntArray2642[0] * 2; i++)
		aFloatArrayArray2639[0][i] *= aFloat2638;
	}
	for (int i = 0; i < anIntArray2642[arg0] * 2; i++)
	    anIntArrayArray2643[arg0][i]
		= (int) (aFloatArrayArray2639[arg0][i] * 65536.0F);
	return anIntArray2642[arg0] * 2;
    }
    
    public static float method2556(float arg0) {
	float f = 32.703197F * (float) Math.pow(2.0, (double) arg0);
	return f * 3.1415927F / 11025.0F;
    }
    
    public float method2557(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2637[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2637[arg0][1][arg1]
				 - anIntArrayArrayArray2637[arg0][0][arg1]));
	f *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
    }
    
    public float method2558(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2640[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2640[arg0][1][arg1]
				 - anIntArrayArrayArray2640[arg0][0][arg1]));
	f *= 1.2207031E-4F;
	return method2556(f);
    }
    
    public void method2559(Stream arg0, Class15 arg1) {
	int i = arg0.readUnsignedByte(-54);
	anIntArray2642[0] = i >> 4;
	anIntArray2642[1] = i & 0xf;
	if (i != 0) {
	    anIntArray2636[0] = arg0.readUnsignedShort(8104);
	    anIntArray2636[1] = arg0.readUnsignedShort(8104);
	    int i_3_ = arg0.readUnsignedByte(121);
	    for (int i_4_ = 0; i_4_ < 2; i_4_++) {
		for (int i_5_ = 0; i_5_ < anIntArray2642[i_4_]; i_5_++) {
		    anIntArrayArrayArray2640[i_4_][0][i_5_]
			= arg0.readUnsignedShort(8104);
		    anIntArrayArrayArray2637[i_4_][0][i_5_]
			= arg0.readUnsignedShort(8104);
		}
	    }
	    for (int i_6_ = 0; i_6_ < 2; i_6_++) {
		for (int i_7_ = 0; i_7_ < anIntArray2642[i_6_]; i_7_++) {
		    if ((i_3_ & 1 << i_6_ * 4 << i_7_) != 0) {
			anIntArrayArrayArray2640[i_6_][1][i_7_]
			    = arg0.readUnsignedShort(8104);
			anIntArrayArrayArray2637[i_6_][1][i_7_]
			    = arg0.readUnsignedShort(8104);
		    } else {
			anIntArrayArrayArray2640[i_6_][1][i_7_]
			    = anIntArrayArrayArray2640[i_6_][0][i_7_];
			anIntArrayArrayArray2637[i_6_][1][i_7_]
			    = anIntArrayArrayArray2637[i_6_][0][i_7_];
		    }
		}
	    }
	    if (i_3_ != 0 || anIntArray2636[1] != anIntArray2636[0])
		arg1.method219(arg0);
	} else
	    anIntArray2636[0] = anIntArray2636[1] = 0;
    }
    
    public Class185() {
	anIntArray2636 = new int[2];
	anIntArrayArrayArray2640 = new int[2][2][4];
	anIntArray2642 = new int[2];
    }
}
