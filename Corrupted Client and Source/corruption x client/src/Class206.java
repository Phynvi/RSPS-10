/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class206
{
    public int anInt3011;
    public Class80[][] aClass80ArrayArray3012;
    public int anInt3013;
    public byte[] aByteArray3014;
    public Class68_Sub1 aClass68_Sub1_3015;
    public int anInt3016;
    public Class130_Sub2 aClass130_Sub2_3017;
    public int anInt3018;
    public int anInt3019;
    
    public static void method2738(byte[] arg0, byte[] arg1, byte arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8) {
	int i = -(arg7 >> -1573064510);
	arg7 = -(arg7 & 0x3);
	for (int i_0_ = -arg3; (i_0_ ^ 0xffffffff) > -1; i_0_++) {
	    for (int i_1_ = i; i_1_ < 0; i_1_++) {
		arg0[arg4++] += -arg1[arg6++];
		arg0[arg4++] += -arg1[arg6++];
		arg0[arg4++] += -arg1[arg6++];
		arg0[arg4++] += -arg1[arg6++];
	    }
	    for (int i_2_ = arg7; 0 > i_2_; i_2_++)
		arg0[arg4++] += -arg1[arg6++];
	    arg4 += arg8;
	    arg6 += arg5;
	}
	if (arg2 < 39)
	    method2746(13, -86, -48, -88, null, -83, 115);
    }
    
    public void method2739(int arg0, Class131_Sub41_Sub13 arg1, int arg2,
			   int arg3) {
	Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1
	    = (Class131_Sub41_Sub13_Sub1) arg1;
	arg0 += class131_sub41_sub13_sub1.anInt6559 - -1;
	arg3 += class131_sub41_sub13_sub1.anInt6560 - -1;
	int i = arg3 * anInt3019 + arg0;
	int i_3_ = 0;
	int i_4_ = class131_sub41_sub13_sub1.anInt6557;
	int i_5_ = class131_sub41_sub13_sub1.anInt6561;
	int i_6_ = anInt3019 + -i_5_;
	if (-1 <= (arg3 ^ 0xffffffff)) {
	    int i_7_ = 1 + -arg3;
	    i_4_ -= i_7_;
	    i += anInt3019 * i_7_;
	    arg3 = 1;
	    i_3_ += i_7_ * i_5_;
	}
	int i_8_ = 0;
	if ((arg3 + i_4_ ^ 0xffffffff) <= (anInt3013 ^ 0xffffffff)) {
	    int i_9_ = arg3 - (-i_4_ + (-1 + anInt3013));
	    i_4_ -= i_9_;
	}
	if (0 >= arg0) {
	    int i_10_ = -arg0 + 1;
	    i_3_ += i_10_;
	    i_5_ -= i_10_;
	    i_6_ += i_10_;
	    i_8_ += i_10_;
	    i += i_10_;
	    arg0 = 1;
	}
	if (arg0 - -i_5_ >= anInt3019) {
	    int i_11_ = -anInt3019 + (1 + (i_5_ + arg0));
	    i_6_ += i_11_;
	    i_5_ -= i_11_;
	    i_8_ += i_11_;
	}
	if (i_5_ > 0 && 0 < i_4_) {
	    method2738(aByteArray3014,
		       class131_sub41_sub13_sub1.aByteArray6558, (byte) 41,
		       i_4_, i, i_8_, i_3_, i_5_, i_6_);
	    method2743(arg2, arg3, i_5_, i_4_, arg0);
	}
    }
    
    public boolean method2740(int arg0, int arg1, int arg2,
			      Class131_Sub41_Sub13 arg3) {
	boolean bool;
	try {
	    Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1
		= (Class131_Sub41_Sub13_Sub1) arg3;
	    arg2 += 1 + class131_sub41_sub13_sub1.anInt6560;
	    arg0 += class131_sub41_sub13_sub1.anInt6559 - arg1;
	    int i = arg0 - -(arg2 * anInt3019);
	    int i_12_ = class131_sub41_sub13_sub1.anInt6557;
	    int i_13_ = class131_sub41_sub13_sub1.anInt6561;
	    if (0 >= arg2) {
		int i_14_ = 1 - arg2;
		i_12_ -= i_14_;
		arg2 = 1;
		i += i_14_ * anInt3019;
	    }
	    int i_15_ = -i_13_ + anInt3019;
	    if (arg2 - -i_12_ >= anInt3013) {
		int i_16_ = 1 + i_12_ + (arg2 + -anInt3013);
		i_12_ -= i_16_;
	    }
	    if ((arg0 ^ 0xffffffff) >= -1) {
		int i_17_ = -arg0 + 1;
		i_15_ += i_17_;
		i += i_17_;
		arg0 = 1;
		i_13_ -= i_17_;
	    }
	    if (arg0 - -i_13_ >= anInt3019) {
		int i_18_ = arg0 + i_13_ + (1 - anInt3019);
		i_13_ -= i_18_;
		i_15_ += i_18_;
	    }
	    if (0 >= i_13_ || i_12_ <= 0)
		return false;
	    int i_19_ = 8;
	    i_15_ += (i_19_ + -1) * anInt3019;
	    bool = method2746(i_13_, i, arg1 ^ ~0x66, i_19_, aByteArray3014,
			      i_12_, i_15_);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public static void method2741(byte[] arg0, int arg1, boolean arg2,
				  int arg3, byte[] arg4, int arg5, int arg6,
				  int arg7, int arg8) {
	int i = -(arg8 >> -579256286);
	arg8 = -(0x3 & arg8);
	int i_20_ = -arg7;
	if (arg2 != true)
	    method2746(-115, -3, 74, 104, null, -79, -54);
	for (/**/; 0 > i_20_; i_20_++) {
	    for (int i_21_ = i; 0 > i_21_; i_21_++) {
		arg0[arg3++] += arg4[arg6++];
		arg0[arg3++] += arg4[arg6++];
		arg0[arg3++] += arg4[arg6++];
		arg0[arg3++] += arg4[arg6++];
	    }
	    for (int i_22_ = arg8; -1 < (i_22_ ^ 0xffffffff); i_22_++)
		arg0[arg3++] += arg4[arg6++];
	    arg6 += arg1;
	    arg3 += arg5;
	}
    }
    
    public void method2742(int arg0, Class131_Sub41_Sub13 arg1, int arg2,
			   int arg3) {
	Class131_Sub41_Sub13_Sub1 class131_sub41_sub13_sub1
	    = (Class131_Sub41_Sub13_Sub1) arg1;
	arg0 += 1 + class131_sub41_sub13_sub1.anInt6559;
	arg3 += 1 + class131_sub41_sub13_sub1.anInt6560;
	int i = anInt3019 * arg3 + arg0;
	int i_23_ = 0;
	int i_24_ = class131_sub41_sub13_sub1.anInt6557;
	int i_25_ = class131_sub41_sub13_sub1.anInt6561;
	int i_26_ = -i_25_ + anInt3019;
	if (0 >= arg3) {
	    int i_27_ = 1 + -arg3;
	    i += i_27_ * anInt3019;
	    arg3 = 1;
	    i_24_ -= i_27_;
	    i_23_ += i_27_ * i_25_;
	}
	int i_28_ = 0;
	if ((arg3 - -i_24_ ^ 0xffffffff) <= (anInt3013 ^ 0xffffffff)) {
	    int i_29_ = -anInt3013 + arg3 + i_24_ - -1;
	    i_24_ -= i_29_;
	}
	if (arg2 <= (arg0 ^ 0xffffffff)) {
	    int i_30_ = -arg0 + 1;
	    arg0 = 1;
	    i_25_ -= i_30_;
	    i_28_ += i_30_;
	    i_26_ += i_30_;
	    i += i_30_;
	    i_23_ += i_30_;
	}
	if (anInt3019 <= i_25_ + arg0) {
	    int i_31_ = i_25_ + arg0 + (1 + -anInt3019);
	    i_28_ += i_31_;
	    i_25_ -= i_31_;
	    i_26_ += i_31_;
	}
	if (0 < i_25_ && 0 < i_24_) {
	    method2741(aByteArray3014, i_28_, true, i,
		       class131_sub41_sub13_sub1.aByteArray6558, i_26_, i_23_,
		       i_24_, i_25_);
	    method2743(arg2 ^ 0x0, arg3, i_25_, i_24_, arg0);
	}
    }
    
    public void method2743(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (aClass80ArrayArray3012 != null) {
	    int i = arg0 + arg4 >> 900164679;
	    int i_32_ = arg2 + (-1 + arg4) - 1 >> 893391975;
	    int i_33_ = arg1 - 1 >> 1535395079;
	    int i_34_ = arg3 + (arg1 - 2) >> -443569241;
	    for (int i_35_ = i; i_32_ >= i_35_; i_35_++) {
		Class80[] class80s = aClass80ArrayArray3012[i_35_];
		for (int i_36_ = i_33_;
		     (i_34_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff); i_36_++)
		    class80s[i_36_].aBoolean1065 = true;
	    }
	}
    }
    
    public void method2744(int arg0, int arg1, int arg2, boolean arg3,
			   boolean[][] arg4, int arg5) {
	opengl var_opengl = aClass130_Sub2_3017.anOpengl3304;
	aClass130_Sub2_3017.method1348();
	aClass130_Sub2_3017.method1325(false);
	aClass130_Sub2_3017.method1345(false);
	aClass130_Sub2_3017.method1322(-2);
	aClass130_Sub2_3017.method1342(0);
	aClass130_Sub2_3017.method1284(1);
	float f = 1.0F / (float) (aClass130_Sub2_3017.anInt3314 * 128);
	if (!arg3) {
	    for (int i = 0; (i ^ 0xffffffff) > (anInt3018 ^ 0xffffffff); i++) {
		int i_37_ = i << anInt3016;
		int i_38_ = i + 1 << anInt3016;
		for (int i_39_ = 0; anInt3011 > i_39_; i_39_++) {
		    int i_40_ = 0;
		    int i_41_ = i_39_ << anInt3016;
		    Class68_Sub1.aStream_3813.offset = 0;
		    int i_42_ = i_39_ - -1 << anInt3016;
		    for (int i_43_ = i_37_; i_43_ < i_38_; i_43_++) {
			if (-arg5 + i_43_ >= -arg0
			    && (arg0 ^ 0xffffffff) <= (i_43_ - arg5
						       ^ 0xffffffff)) {
			    int i_44_
				= i_41_ + aClass68_Sub1_3015.anInt924 * i_43_;
			    for (int i_45_ = i_41_; i_42_ > i_45_; i_45_++) {
				if (-arg2 + i_45_ >= -arg0
				    && (arg0 ^ 0xffffffff) <= (i_45_ - arg2
							       ^ 0xffffffff)
				    && (arg4[i_45_ - arg2 + arg0]
					[i_43_ - arg5 + arg0])) {
				    short[] is
					= (aClass68_Sub1_3015
					   .aShortArrayArray3831[i_44_]);
				    if (is != null) {
					if (aClass130_Sub2_3017.aBoolean3360) {
					    for (int i_46_ = 0;
						 ((is.length ^ 0xffffffff)
						  < (i_46_ ^ 0xffffffff));
						 i_46_++) {
						Class68_Sub1
						    .aStream_3813
						    .writeShort
						    (is[i_46_]);
						i_40_++;
					    }
					} else {
					    for (int i_47_ = 0;
						 ((is.length ^ 0xffffffff)
						  < (i_47_ ^ 0xffffffff));
						 i_47_++) {
						i_40_++;
						Class68_Sub1
						    .aStream_3813
						    .method1773
						    (677910600, is[i_47_]);
					    }
					}
				    }
				}
				i_44_++;
			    }
			}
		    }
		    if ((i_40_ ^ 0xffffffff) < -1) {
			var_opengl.glMatrixMode(5890);
			var_opengl.glLoadIdentity();
			var_opengl.glScalef(f, f, 1.0F);
			var_opengl.glTranslatef((float) -i_39_ / f,
						(float) -i / f, 1.0F);
			var_opengl.glMatrixMode(5888);
			aClass130_Sub2_3017.anInterface7_3430.method26
			    (5123,
			     Class68_Sub1.aStream_3813.data,
			     2 * i_40_);
			aClass80ArrayArray3012[i_39_][i].method787
			    (i_40_, (byte) 51,
			     aClass130_Sub2_3017.anInterface7_3430);
		    }
		}
	    }
	} else {
	    for (int i = 0; i < anInt3018; i++) {
		int i_48_ = i << anInt3016;
		int i_49_ = i + 1 << anInt3016;
		for (int i_50_ = 0;
		     (anInt3011 ^ 0xffffffff) < (i_50_ ^ 0xffffffff);
		     i_50_++) {
		    int i_51_ = i_50_ << anInt3016;
		    int i_52_ = i_50_ + 1 << anInt3016;
		while_109_:
		    for (int i_53_ = i_51_;
			 (i_52_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff);
			 i_53_++) {
			if ((-arg0 ^ 0xffffffff) >= (i_53_ - arg2 ^ 0xffffffff)
			    && ((i_53_ + -arg2 ^ 0xffffffff)
				>= (arg0 ^ 0xffffffff))) {
			    for (int i_54_ = i_48_; i_49_ > i_54_; i_54_++) {
				if (i_54_ - arg5 >= -arg0
				    && i_54_ - arg5 <= arg0
				    && (arg4[arg0 + i_53_ + -arg2]
					[arg0 + i_54_ - arg5])) {
				    var_opengl.glMatrixMode(5890);
				    var_opengl.glLoadIdentity();
				    var_opengl.glScalef(f, f, 1.0F);
				    var_opengl.glTranslatef((float) -i_50_ / f,
							    (float) -i / f,
							    1.0F);
				    var_opengl.glMatrixMode(5888);
				    aClass80ArrayArray3012[i_50_][i]
					.method786(true);
				    break while_109_;
				}
			    }
			}
		    }
		}
	    }
	}
	var_opengl.glMatrixMode(5890);
	var_opengl.glLoadIdentity();
	var_opengl.glMatrixMode(arg1);
    }
    
    public void method2745(int arg0) {
	aClass80ArrayArray3012 = new Class80[anInt3011][anInt3018];
	for (int i = 0; i < anInt3018; i++) {
	    for (int i_55_ = 0;
		 (anInt3011 ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++)
		aClass80ArrayArray3012[i_55_][i]
		    = new Class80(aClass130_Sub2_3017, this,
				  aClass68_Sub1_3015, i_55_, i, anInt3016,
				  1 + 128 * i_55_, 1 + i * 128);
	}
	if (arg0 != -17567)
	    method2739(35, null, -4, -95);
    }
    
    public static boolean method2746(int arg0, int arg1, int arg2, int arg3,
				     byte[] arg4, int arg5, int arg6) {
	boolean bool;
	try {
	    int i = arg0 % arg3;
	    int i_56_;
	    if ((i ^ 0xffffffff) == -1)
		i_56_ = 0;
	    else
		i_56_ = -i + arg3;
	    int i_57_ = -((-1 + (arg3 + arg5)) / arg3);
	    int i_58_ = -((arg0 - (-arg3 - -1)) / arg3);
	    int i_59_ = -92 % ((31 - arg2) / 57);
	    for (int i_60_ = i_57_; (i_60_ ^ 0xffffffff) > -1; i_60_++) {
		for (int i_61_ = i_58_; (i_61_ ^ 0xffffffff) > -1; i_61_++) {
		    if ((arg4[arg1] ^ 0xffffffff) == -1)
			return true;
		    arg1 += arg3;
		}
		arg1 -= i_56_;
		if (-1 == (arg4[arg1 + -1] ^ 0xffffffff))
		    return true;
		arg1 += arg6;
	    }
	    bool = false;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public Class206(Class130_Sub2 arg0, Class68_Sub1 arg1) {
	aClass68_Sub1_3015 = arg1;
	aClass130_Sub2_3017 = arg0;
	anInt3019
	    = 2 + (aClass68_Sub1_3015.anInt924 * aClass68_Sub1_3015.anInt3822
		   >> aClass130_Sub2_3017.anInt3321);
	anInt3013 = (aClass68_Sub1_3015.anInt3822 * aClass68_Sub1_3015.anInt916
		     >> aClass130_Sub2_3017.anInt3321) + 2;
	anInt3016 = (7 - -aClass130_Sub2_3017.anInt3321
		     + -aClass68_Sub1_3015.anInt3811);
	aByteArray3014 = new byte[anInt3019 * anInt3013];
	anInt3011 = aClass68_Sub1_3015.anInt924 >> anInt3016;
	anInt3018 = aClass68_Sub1_3015.anInt916 >> anInt3016;
    }
}
