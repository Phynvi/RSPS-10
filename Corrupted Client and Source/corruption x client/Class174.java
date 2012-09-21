/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class174
{
    public RawStream aClass131_Sub15_Sub1_2485;
    public float[] aFloatArray2486 = new float[16];
    public opengl anOpengl2487;
    public Class7 aClass7_2488;
    public Interface2 anInterface2_2489;
    public Class1_Sub7_Sub1[][] aClass1_Sub7_Sub1ArrayArray2490;
    public int[] anIntArray2491;
    public Class1_Sub7_Sub1[][] aClass1_Sub7_Sub1ArrayArray2492;
    public int anInt2493;
    public Class7 aClass7_2494;
    public int[] anIntArray2495;
    public Class7 aClass7_2496;
    public int[] anIntArray2497;
    
    public void method2470(Class130_Sub2 arg0) {
	anInterface2_2489 = arg0.method1301(24, null, 196584, true);
	aClass7_2494 = new Class7(arg0, anInterface2_2489, 5126, 2, 0);
	aClass7_2496 = new Class7(arg0, anInterface2_2489, 5126, 3, 8);
	aClass7_2488 = new Class7(arg0, anInterface2_2489, 5121, 4, 20);
    }
    
    public void method2471(Class130_Sub2 arg0) {
	arg0.method1345(true);
	anOpengl2487.glEnable(16384);
	anOpengl2487.glEnable(16385);
    }
    
    public void method2472(Class130_Sub2 arg0, Class105 arg1) {
	anOpengl2487 = arg0.anOpengl3304;
	if (arg0.aClass9_Sub1_3404 != null) {
	    method2473(arg0);
	    float f = arg0.aClass9_Sub1_3404.aFloat3608;
	    float f_0_ = arg0.aClass9_Sub1_3404.aFloat3611;
	    float f_1_ = arg0.aClass9_Sub1_3404.aFloat3606;
	    float f_2_ = arg0.aClass9_Sub1_3404.aFloat3612;
	    try {
		if (!arg1.aBoolean1380) {
		    int i = 0;
		    int i_3_ = 2147483647;
		    int i_4_ = 0;
		    Class1_Sub7 class1_sub7
			= arg1.aClass142_1375.aClass1_Sub7_1887;
		    for (Class1_Sub7 class1_sub7_5_
			     = class1_sub7.aClass1_Sub7_3591;
			 class1_sub7_5_ != class1_sub7;
			 class1_sub7_5_ = class1_sub7_5_.aClass1_Sub7_3591) {
			Class1_Sub7_Sub1 class1_sub7_sub1
			    = (Class1_Sub7_Sub1) class1_sub7_5_;
			int i_6_
			    = (int) (f * (float) (class1_sub7_sub1.anInt5215
						  >> Class202.anInt2949)
				     + (f_0_
					* (float) (class1_sub7_sub1.anInt5219
						   >> Class202.anInt2949))
				     + (f_1_
					* (float) (class1_sub7_sub1.anInt5211
						   >> Class202.anInt2949))
				     + f_2_);
			if (i_6_ > i_4_)
			    i_4_ = i_6_;
			if (i_6_ < i_3_)
			    i_3_ = i_6_;
			anIntArray2497[i++] = i_6_;
		    }
		    int i_7_ = i_4_ - i_3_;
		    if (i_7_ > 1600)
			i_7_ = 1600;
		    Class1_Sub7 class1_sub7_8_ = class1_sub7.aClass1_Sub7_3591;
		    i = 0;
		    int i_9_ = -2;
		    boolean bool = true;
		    while (class1_sub7_8_ != class1_sub7) {
			anInt2493 = 0;
			for (int i_10_ = 0; i_10_ < i_7_; i_10_++)
			    anIntArray2495[i_10_] = 0;
			for (int i_11_ = 0; i_11_ < 64; i_11_++)
			    anIntArray2491[i_11_] = 0;
			for (/**/; class1_sub7_8_ != class1_sub7;
			     class1_sub7_8_
				 = class1_sub7_8_.aClass1_Sub7_3591) {
			    Class1_Sub7_Sub1 class1_sub7_sub1
				= (Class1_Sub7_Sub1) class1_sub7_8_;
			    if (bool) {
				i_9_ = class1_sub7_sub1.anInt5207;
				bool = false;
			    }
			    if (i > 0 && i_9_ != class1_sub7_sub1.anInt5207) {
				bool = true;
				break;
			    }
			    int i_12_ = anIntArray2497[i++] - i_3_;
			    if (i_12_ <= 1600) {
				if (anIntArray2495[i_12_] < 64)
				    aClass1_Sub7_Sub1ArrayArray2490[i_12_]
					[anIntArray2495[i_12_]++]
					= class1_sub7_sub1;
				else {
				    if (anIntArray2495[i_12_] == 64) {
					if (anInt2493 == 64)
					    continue;
					anIntArray2495[i_12_]
					    += 1 + anInt2493++;
				    }
				    aClass1_Sub7_Sub1ArrayArray2492
					[anIntArray2495[i_12_] - 64 - 1]
					[anIntArray2491[(anIntArray2495[i_12_]
							 - 64 - 1)]++]
					= class1_sub7_sub1;
				}
			    }
			}
			arg0.method1347(i_9_ >= 0
					? arg0.aClass117_3305.method998(false,
									i_9_)
					: null);
			method2474(arg0, i_7_);
		    }
		} else {
		    int i = arg1.anInt1379 - arg1.anInt1378;
		    if (i > 1600)
			i = 1600;
		    Class1_Sub7 class1_sub7
			= arg1.aClass142_1375.aClass1_Sub7_1887;
		    Class1_Sub7 class1_sub7_13_
			= class1_sub7.aClass1_Sub7_3591;
		    int i_14_ = -2;
		    boolean bool = true;
		    while (class1_sub7_13_ != class1_sub7) {
			anInt2493 = 0;
			for (int i_15_ = 0; i_15_ < i; i_15_++)
			    anIntArray2495[i_15_] = 0;
			for (int i_16_ = 0; i_16_ < 64; i_16_++)
			    anIntArray2491[i_16_] = 0;
			for (/**/; class1_sub7_13_ != class1_sub7;
			     class1_sub7_13_
				 = class1_sub7_13_.aClass1_Sub7_3591) {
			    Class1_Sub7_Sub1 class1_sub7_sub1
				= (Class1_Sub7_Sub1) class1_sub7_13_;
			    if (bool) {
				i_14_ = class1_sub7_sub1.anInt5207;
				bool = false;
			    } else if (i_14_ != class1_sub7_sub1.anInt5207) {
				bool = true;
				break;
			    }
			    int i_17_
				= ((int) (f * (float) ((class1_sub7_sub1
							.anInt5215)
						       >> Class202.anInt2949)
					  + (f_0_
					     * (float) ((class1_sub7_sub1
							 .anInt5219)
							>> Class202.anInt2949))
					  + (f_1_
					     * (float) ((class1_sub7_sub1
							 .anInt5211)
							>> Class202.anInt2949))
					  + f_2_)
				   - arg1.anInt1378);
			    if (i_17_ <= 1600) {
				if (anIntArray2495[i_17_] < 64)
				    aClass1_Sub7_Sub1ArrayArray2490[i_17_]
					[anIntArray2495[i_17_]++]
					= class1_sub7_sub1;
				else {
				    if (anIntArray2495[i_17_] == 64) {
					if (anInt2493 == 64)
					    continue;
					anIntArray2495[i_17_]
					    += 1 + anInt2493++;
				    }
				    aClass1_Sub7_Sub1ArrayArray2492
					[anIntArray2495[i_17_] - 64 - 1]
					[anIntArray2491[(anIntArray2495[i_17_]
							 - 64 - 1)]++]
					= class1_sub7_sub1;
				}
			    }
			}
			arg0.method1347(i_14_ >= 0
					? arg0.aClass117_3305.method998(false,
									i_14_)
					: null);
			method2474(arg0, i);
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2471(arg0);
	}
    }
    
    public void method2473(Class130_Sub2 arg0) {
	arg0.method1329();
	anOpengl2487.glDisable(16384);
	anOpengl2487.glDisable(16385);
	arg0.method1345(false);
	arg0.method1322(-2);
	anOpengl2487.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    public void method2474(Class130_Sub2 arg0, int arg1) {
	anOpengl2487.glGetFloatv(2982, aFloatArray2486, 0);
	float f = aFloatArray2486[0];
	float f_18_ = aFloatArray2486[4];
	float f_19_ = aFloatArray2486[8];
	float f_20_ = aFloatArray2486[1];
	float f_21_ = aFloatArray2486[5];
	float f_22_ = aFloatArray2486[9];
	float f_23_ = f + f_20_;
	float f_24_ = f_18_ + f_21_;
	float f_25_ = f_19_ + f_22_;
	float f_26_ = f - f_20_;
	float f_27_ = f_18_ - f_21_;
	float f_28_ = f_19_ - f_22_;
	float f_29_ = f_20_ - f;
	float f_30_ = f_21_ - f_18_;
	float f_31_ = f_22_ - f_19_;
	aClass131_Sub15_Sub1_2485.offset = 0;
	if (arg0.aBoolean3360) {
	    for (int i = arg1 - 1; i >= 0; i--) {
		int i_32_ = anIntArray2495[i] > 64 ? 64 : anIntArray2495[i];
		if (i_32_ > 0) {
		    for (int i_33_ = i_32_ - 1; i_33_ >= 0; i_33_--) {
			Class1_Sub7_Sub1 class1_sub7_sub1
			    = aClass1_Sub7_Sub1ArrayArray2490[i][i_33_];
			int i_34_ = class1_sub7_sub1.anInt5214;
			byte i_35_ = (byte) (i_34_ >> 16);
			byte i_36_ = (byte) (i_34_ >> 8);
			byte i_37_ = (byte) i_34_;
			byte i_38_ = (byte) (i_34_ >>> 24);
			float f_39_ = (float) (class1_sub7_sub1.anInt5215
					       >> Class202.anInt2949);
			float f_40_ = (float) (class1_sub7_sub1.anInt5219
					       >> Class202.anInt2949);
			float f_41_ = (float) (class1_sub7_sub1.anInt5211
					       >> Class202.anInt2949);
			int i_42_
			    = class1_sub7_sub1.anInt5210 >> Class202.anInt2949;
			aClass131_Sub15_Sub1_2485.method1783(0.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783(0.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_39_ + f_23_ * (float) -i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_40_ + f_24_ * (float) -i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_41_ + f_25_ * (float) -i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.writeByte(i_35_);
			aClass131_Sub15_Sub1_2485.writeByte(i_36_);
			aClass131_Sub15_Sub1_2485.writeByte(i_37_);
			aClass131_Sub15_Sub1_2485.writeByte(i_38_);
			aClass131_Sub15_Sub1_2485.method1783(1.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783(0.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_39_ + f_26_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_40_ + f_27_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_41_ + f_28_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.writeByte(i_35_);
			aClass131_Sub15_Sub1_2485.writeByte(i_36_);
			aClass131_Sub15_Sub1_2485.writeByte(i_37_);
			aClass131_Sub15_Sub1_2485.writeByte(i_38_);
			aClass131_Sub15_Sub1_2485.method1783(1.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783(1.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_39_ + f_23_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_40_ + f_24_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_41_ + f_25_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.writeByte(i_35_);
			aClass131_Sub15_Sub1_2485.writeByte(i_36_);
			aClass131_Sub15_Sub1_2485.writeByte(i_37_);
			aClass131_Sub15_Sub1_2485.writeByte(i_38_);
			aClass131_Sub15_Sub1_2485.method1783(0.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783(1.0F, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_39_ + f_29_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_40_ + f_30_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.method1783
			    (f_41_ + f_31_ * (float) i_42_, (byte) 126);
			aClass131_Sub15_Sub1_2485.writeByte(i_35_);
			aClass131_Sub15_Sub1_2485.writeByte(i_36_);
			aClass131_Sub15_Sub1_2485.writeByte(i_37_);
			aClass131_Sub15_Sub1_2485.writeByte(i_38_);
		    }
		    if (anIntArray2495[i] > 64) {
			int i_43_ = anIntArray2495[i] - 64 - 1;
			for (int i_44_ = anIntArray2491[i_43_] - 1; i_44_ >= 0;
			     i_44_--) {
			    Class1_Sub7_Sub1 class1_sub7_sub1
				= (aClass1_Sub7_Sub1ArrayArray2492[i_43_]
				   [i_44_]);
			    int i_45_ = class1_sub7_sub1.anInt5214;
			    byte i_46_ = (byte) (i_45_ >> 16);
			    byte i_47_ = (byte) (i_45_ >> 8);
			    byte i_48_ = (byte) i_45_;
			    byte i_49_ = (byte) (i_45_ >>> 24);
			    float f_50_ = (float) (class1_sub7_sub1.anInt5215
						   >> Class202.anInt2949);
			    float f_51_ = (float) (class1_sub7_sub1.anInt5219
						   >> Class202.anInt2949);
			    float f_52_ = (float) (class1_sub7_sub1.anInt5211
						   >> Class202.anInt2949);
			    int i_53_ = (class1_sub7_sub1.anInt5210
					 >> Class202.anInt2949);
			    aClass131_Sub15_Sub1_2485.method1783(0.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783(0.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_50_ + f_23_ * (float) -i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_51_ + f_24_ * (float) -i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_52_ + f_25_ * (float) -i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.writeByte(i_46_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_47_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_48_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_49_);
			    aClass131_Sub15_Sub1_2485.method1783(1.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783(0.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_50_ + f_26_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_51_ + f_27_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_52_ + f_28_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.writeByte(i_46_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_47_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_48_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_49_);
			    aClass131_Sub15_Sub1_2485.method1783(1.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783(1.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_50_ + f_23_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_51_ + f_24_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_52_ + f_25_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.writeByte(i_46_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_47_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_48_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_49_);
			    aClass131_Sub15_Sub1_2485.method1783(0.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783(1.0F,
								 (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_50_ + f_29_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_51_ + f_30_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.method1783
				(f_52_ + f_31_ * (float) i_53_, (byte) 126);
			    aClass131_Sub15_Sub1_2485.writeByte(i_46_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_47_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_48_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_49_);
			}
		    }
		}
	    }
	} else {
	    for (int i = arg1 - 1; i >= 0; i--) {
		int i_54_ = anIntArray2495[i] > 64 ? 64 : anIntArray2495[i];
		if (i_54_ > 0) {
		    for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
			Class1_Sub7_Sub1 class1_sub7_sub1
			    = aClass1_Sub7_Sub1ArrayArray2490[i][i_55_];
			int i_56_ = class1_sub7_sub1.anInt5214;
			byte i_57_ = (byte) (i_56_ >> 16);
			byte i_58_ = (byte) (i_56_ >> 8);
			byte i_59_ = (byte) i_56_;
			byte i_60_ = (byte) (i_56_ >>> 24);
			float f_61_ = (float) (class1_sub7_sub1.anInt5215
					       >> Class202.anInt2949);
			float f_62_ = (float) (class1_sub7_sub1.anInt5219
					       >> Class202.anInt2949);
			float f_63_ = (float) (class1_sub7_sub1.anInt5211
					       >> Class202.anInt2949);
			int i_64_
			    = class1_sub7_sub1.anInt5210 >> Class202.anInt2949;
			aClass131_Sub15_Sub1_2485.method1782(0.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782(0.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_61_ + f_23_ * (float) -i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_62_ + f_24_ * (float) -i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_63_ + f_25_ * (float) -i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.writeByte(i_57_);
			aClass131_Sub15_Sub1_2485.writeByte(i_58_);
			aClass131_Sub15_Sub1_2485.writeByte(i_59_);
			aClass131_Sub15_Sub1_2485.writeByte(i_60_);
			aClass131_Sub15_Sub1_2485.method1782(1.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782(0.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_61_ + f_26_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_62_ + f_27_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_63_ + f_28_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.writeByte(i_57_);
			aClass131_Sub15_Sub1_2485.writeByte(i_58_);
			aClass131_Sub15_Sub1_2485.writeByte(i_59_);
			aClass131_Sub15_Sub1_2485.writeByte(i_60_);
			aClass131_Sub15_Sub1_2485.method1782(1.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782(1.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_61_ + f_23_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_62_ + f_24_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_63_ + f_25_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.writeByte(i_57_);
			aClass131_Sub15_Sub1_2485.writeByte(i_58_);
			aClass131_Sub15_Sub1_2485.writeByte(i_59_);
			aClass131_Sub15_Sub1_2485.writeByte(i_60_);
			aClass131_Sub15_Sub1_2485.method1782(0.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782(1.0F, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_61_ + f_29_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_62_ + f_30_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.method1782
			    (f_63_ + f_31_ * (float) i_64_, (byte) -30);
			aClass131_Sub15_Sub1_2485.writeByte(i_57_);
			aClass131_Sub15_Sub1_2485.writeByte(i_58_);
			aClass131_Sub15_Sub1_2485.writeByte(i_59_);
			aClass131_Sub15_Sub1_2485.writeByte(i_60_);
		    }
		    if (anIntArray2495[i] > 64) {
			int i_65_ = anIntArray2495[i] - 64 - 1;
			for (int i_66_ = anIntArray2491[i_65_] - 1; i_66_ >= 0;
			     i_66_--) {
			    Class1_Sub7_Sub1 class1_sub7_sub1
				= (aClass1_Sub7_Sub1ArrayArray2492[i_65_]
				   [i_66_]);
			    int i_67_ = class1_sub7_sub1.anInt5214;
			    byte i_68_ = (byte) (i_67_ >> 16);
			    byte i_69_ = (byte) (i_67_ >> 8);
			    byte i_70_ = (byte) i_67_;
			    byte i_71_ = (byte) (i_67_ >>> 24);
			    float f_72_ = (float) (class1_sub7_sub1.anInt5215
						   >> Class202.anInt2949);
			    float f_73_ = (float) (class1_sub7_sub1.anInt5219
						   >> Class202.anInt2949);
			    float f_74_ = (float) (class1_sub7_sub1.anInt5211
						   >> Class202.anInt2949);
			    int i_75_ = (class1_sub7_sub1.anInt5210
					 >> Class202.anInt2949);
			    aClass131_Sub15_Sub1_2485.method1782(0.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782(0.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_72_ + f_23_ * (float) -i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_73_ + f_24_ * (float) -i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_74_ + f_25_ * (float) -i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.writeByte(i_68_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_69_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_70_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_71_);
			    aClass131_Sub15_Sub1_2485.method1782(1.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782(0.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_72_ + f_26_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_73_ + f_27_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_74_ + f_28_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.writeByte(i_68_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_69_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_70_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_71_);
			    aClass131_Sub15_Sub1_2485.method1782(1.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782(1.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_72_ + f_23_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_73_ + f_24_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_74_ + f_25_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.writeByte(i_68_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_69_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_70_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_71_);
			    aClass131_Sub15_Sub1_2485.method1782(0.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782(1.0F,
								 (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_72_ + f_29_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_73_ + f_30_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.method1782
				(f_74_ + f_31_ * (float) i_75_, (byte) -30);
			    aClass131_Sub15_Sub1_2485.writeByte(i_68_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_69_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_70_);
			    aClass131_Sub15_Sub1_2485.writeByte(i_71_);
			}
		    }
		}
	    }
	}
	if (aClass131_Sub15_Sub1_2485.offset != 0) {
	    anInterface2_2489.method3(24,
				      aClass131_Sub15_Sub1_2485.data,
				      aClass131_Sub15_Sub1_2485.offset);
	    arg0.method1305(aClass7_2496, null, aClass7_2488, aClass7_2494);
	    arg0.method1303(7, 0, aClass131_Sub15_Sub1_2485.offset / 24);
	}
    }
    
    public Class174() {
	aClass131_Sub15_Sub1_2485 = new RawStream(786336);
	anIntArray2491 = new int[64];
	aClass1_Sub7_Sub1ArrayArray2492 = new Class1_Sub7_Sub1[64][768];
	aClass1_Sub7_Sub1ArrayArray2490 = new Class1_Sub7_Sub1[1600][64];
	anInt2493 = 0;
	anIntArray2495 = new int[1600];
	anIntArray2497 = new int[8191];
    }
}
