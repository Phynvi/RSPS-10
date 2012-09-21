/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class69
{
    public static int anInt926;
    public static int anInt927;
    public static int[] anIntArray928 = new int[50];
    public static float aFloat929;
    public static int anInt930;
    public static boolean[][] aBooleanArrayArray931;
    public static int anInt932 = 0;
    public static int anInt933;
    public static int anInt934;
    
    public static int method736(int arg0, int arg1, int arg2) {
	try {
	    anInt926++;
	    int i = (Class53.method603(false, -1 + arg2, arg0 - 1)
		     + (Class53.method603(false, arg2 + arg1, 1 + arg0)
			+ Class53.method603(false, arg2 - -1, -1 + arg0))
		     + Class53.method603(false, 1 + arg2, arg0 - -1));
	    int i_0_ = (Class53.method603(false, arg2, -1 + arg0)
			+ (Class53.method603(false, arg2, 1 + arg0)
			   - -Class53.method603(false, arg2 - 1, arg0)
			   + Class53.method603(false, arg2 + 1, arg0)));
	    int i_1_ = Class53.method603(false, arg2, arg0);
	    return i_1_ / 4 + i_0_ / 8 + i / 16;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gn.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method737(byte arg0) {
	try {
	    anInt933++;
	    if ((OutputStream_Sub1.anInt72 ^ 0xffffffff) != 0
		&& (Class105.anInt1376 ^ 0xffffffff) != 0) {
		int i = (Class68.anInt919
			 + (Class180.anInt2573 * (Class121_Sub3_Sub1.anInt5432
						  + -Class68.anInt919)
			    >> 1233434640));
		Class180.anInt2573 += i;
		if ((Class180.anInt2573 ^ 0xffffffff) > -65536) {
		    Class131_Sub32.aBoolean4553 = false;
		    Class31.aBoolean441 = false;
		} else {
		    if (!Class31.aBoolean441)
			Class131_Sub32.aBoolean4553 = true;
		    else
			Class131_Sub32.aBoolean4553 = false;
		    Class180.anInt2573 = 65535;
		    Class31.aBoolean441 = true;
		}
		if (arg0 > 93) {
		    float f = (float) Class180.anInt2573 / 65535.0F;
		    float[] fs = new float[3];
		    int i_2_ = Class131_Sub41_Sub11.anInt6304 * 2;
		    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -4; i_3_++) {
			int i_4_
			    = ((Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[OutputStream_Sub1.anInt72][i_2_][i_3_])
			       * 3);
			int i_5_
			    = ((Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[OutputStream_Sub1.anInt72][i_2_ - -1][i_3_])
			       * 3);
			int i_6_
			    = ((Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[OutputStream_Sub1.anInt72][i_2_ + 2][i_3_])
			       - (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				  [OutputStream_Sub1.anInt72][3 + i_2_][i_3_])
			       - -(Class131_Sub41_Sub4.anIntArrayArrayArray6200
				   [OutputStream_Sub1.anInt72][2 + i_2_]
				   [i_3_])) * 3;
			int i_7_
			    = (Class131_Sub41_Sub4.anIntArrayArrayArray6200
			       [OutputStream_Sub1.anInt72][i_2_][i_3_]);
			int i_8_ = i_5_ - i_4_;
			int i_9_ = i_6_ + -(2 * i_5_) + i_4_;
			int i_10_
			    = ((Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[OutputStream_Sub1.anInt72][2 + i_2_][i_3_])
			       + (-i_7_ + (i_5_ + -i_6_)));
			fs[i_3_] = f * (f * (f * (float) i_10_ + (float) i_9_)
					+ (float) i_8_) + (float) i_7_;
		    }
		    Class57.anInt753 = -(128 * Class64.regionY) + (int) fs[2];
		    Class87.anInt1140 = -1 * (int) fs[1];
		    Class2.anInt84 = (int) fs[0] + -(Class92.regionX * 128);
		    float[] fs_11_ = new float[3];
		    int i_12_ = Class23_Sub1_Sub1.anInt5087 * 2;
		    for (int i_13_ = 0; i_13_ < 3; i_13_++) {
			int i_14_
			    = 3 * (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				   [Class105.anInt1376][i_12_][i_13_]);
			int i_15_
			    = 3 * (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				   [Class105.anInt1376][1 + i_12_][i_13_]);
			int i_16_
			    = ((Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[Class105.anInt1376][2 + i_12_][i_13_])
			       - -(Class131_Sub41_Sub4.anIntArrayArrayArray6200
				   [Class105.anInt1376][2 + i_12_][i_13_])
			       - (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				  [Class105.anInt1376][i_12_ + 3][i_13_])) * 3;
			int i_17_
			    = (Class131_Sub41_Sub4.anIntArrayArrayArray6200
			       [Class105.anInt1376][i_12_][i_13_]);
			int i_18_ = -i_14_ + i_15_;
			int i_19_ = i_16_ + (-(2 * i_15_) + i_14_);
			int i_20_
			    = (-i_17_
			       + (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				  [Class105.anInt1376][i_12_ - -2][i_13_])
			       + (i_15_ + -i_16_));
			fs_11_[i_13_]
			    = (((float) i_18_
				+ f * ((float) i_20_ * f + (float) i_19_)) * f
			       + (float) i_17_);
		    }
		    float f_21_ = -fs[0] + fs_11_[0];
		    float f_22_ = (fs_11_[1] - fs[1]) * -1.0F;
		    float f_23_ = -fs[2] + fs_11_[2];
		    double d
			= Math.sqrt((double) (f_23_ * f_23_ + f_21_ * f_21_));
		    Stream.anInt4323
			= (int) (Math.atan2((double) f_22_, d)
				 * 2607.5945876176133) & 0x3fff;
		    Class131_Sub41_Sub4.anInt6213
			= 0x3fff & (int) (-Math.atan2((double) f_21_,
						      (double) f_23_)
					  * 2607.5945876176133);
		    Login.anInt1762
			= ((((-(Class131_Sub41_Sub4.anIntArrayArrayArray6200
				[OutputStream_Sub1.anInt72][i_2_][3])
			      + (Class131_Sub41_Sub4.anIntArrayArrayArray6200
				 [OutputStream_Sub1.anInt72][2 + i_2_][3]))
			     * Class180.anInt2573)
			    >> 1039167600)
			   + (Class131_Sub41_Sub4.anIntArrayArrayArray6200
			      [OutputStream_Sub1.anInt72][i_2_][3]));
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gn.D(" + arg0 + ')');
	}
    }
    
    public static void method738(int arg0) {
	anIntArray928 = null;
	aBooleanArrayArray931 = null;
	if (arg0 <= 71)
	    method737((byte) 34);
    }
    
    public static void method739(int arg0) {
	try {
	    anInt934++;
	    synchronized (Class169.aClass214_2267) {
		Class169.aClass214_2267.method2775((byte) 56);
		if (arg0 != 3)
		    method738(8);
	    }
	    synchronized (Class131_Sub41_Sub5.aClass214_6226) {
		Class131_Sub41_Sub5.aClass214_6226.method2775((byte) 56);
	    }
	    synchronized (Class23_Sub3_Sub1.aClass103_5226) {
		Class23_Sub3_Sub1.aClass103_5226.method898((byte) 52);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gn.C(" + arg0 + ')');
	}
    }
    
    static {
	aBooleanArrayArray931
	    = (new boolean[][]
	       { new boolean[4], new boolean[4], { false, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { false, false, true, false }, { true, false, true, false },
		 { true, false, false, true }, { true, false, false, true },
		 new boolean[4], new boolean[4], new boolean[4],
		 new boolean[4] });
    }
}
