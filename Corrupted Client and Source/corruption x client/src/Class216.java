/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class216
{
    public int[] anIntArray3185;
    public int[] anIntArray3186;
    public static int[] anIntArray3187 = { 256, 128, 86, 64 };
    public int[] anIntArray3188;
    public static float[] aFloatArray3189
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    public static int[] anIntArray3190;
    public int[] anIntArray3191;
    public int[][] anIntArrayArray3192;
    public int anInt3193;
    public int[] anIntArray3194;
    public static boolean[] aBooleanArray3195;
    public static int[] anIntArray3196;
    
    public void method2810(int arg0, int arg1, int arg2, int arg3,
			   float[] arg4, int arg5) {
	int i = arg3 - arg1;
	int i_0_ = arg2 - arg0;
	int i_1_ = i < 0 ? -i : i;
	int i_2_ = i / i_0_;
	int i_3_ = arg1;
	int i_4_ = 0;
	int i_5_ = i < 0 ? i_2_ - 1 : i_2_ + 1;
	i_1_ = i_1_ - (i_2_ < 0 ? -i_2_ : i_2_) * i_0_;
	arg4[arg0] *= aFloatArray3189[i_3_];
	if (arg2 > arg5)
	    arg2 = arg5;
	for (int i_6_ = arg0 + 1; i_6_ < arg2; i_6_++) {
	    i_4_ += i_1_;
	    if (i_4_ >= i_0_) {
		i_4_ -= i_0_;
		i_3_ += i_5_;
	    } else
		i_3_ += i_2_;
	    arg4[i_6_] *= aFloatArray3189[i_3_];
	}
    }
    
    public boolean method2811() {
	boolean bool = Class131_Sub39.method1902() != 0;
	if (!bool)
	    return false;
	int i = anIntArray3191.length;
	for (int i_7_ = 0; i_7_ < i; i_7_++)
	    anIntArray3190[i_7_] = anIntArray3191[i_7_];
	int i_8_ = anIntArray3187[anInt3193 - 1];
	int i_9_ = Class82.method798(1, i_8_ - 1);
	anIntArray3196[0] = Class131_Sub39.method1896(i_9_);
	anIntArray3196[1] = Class131_Sub39.method1896(i_9_);
	int i_10_ = 2;
	for (int i_11_ = 0; i_11_ < anIntArray3186.length; i_11_++) {
	    int i_12_ = anIntArray3186[i_11_];
	    int i_13_ = anIntArray3185[i_12_];
	    int i_14_ = anIntArray3194[i_12_];
	    int i_15_ = (1 << i_14_) - 1;
	    int i_16_ = 0;
	    if (i_14_ > 0)
		i_16_ = Class131_Sub39.aClass27Array4635
			    [anIntArray3188[i_12_]].method407();
	    for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
		int i_18_ = anIntArrayArray3192[i_12_][i_16_ & i_15_];
		i_16_ >>>= i_14_;
		anIntArray3196[i_10_++]
		    = (i_18_ >= 0
		       ? Class131_Sub39.aClass27Array4635[i_18_].method407()
		       : 0);
	    }
	}
	return true;
    }
    
    public void method2812(float[] arg0, int arg1) {
	int i = anIntArray3191.length;
	int i_19_ = anIntArray3187[anInt3193 - 1];
	aBooleanArray3195[0] = aBooleanArray3195[1] = true;
	for (int i_20_ = 2; i_20_ < i; i_20_++) {
	    int i_21_ = method2815(anIntArray3190, i_20_);
	    int i_22_ = method2817(anIntArray3190, i_20_);
	    int i_23_
		= method2814(anIntArray3190[i_21_], anIntArray3196[i_21_],
			     anIntArray3190[i_22_], anIntArray3196[i_22_],
			     anIntArray3190[i_20_]);
	    int i_24_ = anIntArray3196[i_20_];
	    int i_25_ = i_19_ - i_23_;
	    int i_26_ = i_23_;
	    int i_27_ = (i_25_ < i_26_ ? i_25_ : i_26_) << 1;
	    if (i_24_ != 0) {
		aBooleanArray3195[i_21_] = aBooleanArray3195[i_22_] = true;
		aBooleanArray3195[i_20_] = true;
		if (i_24_ >= i_27_)
		    anIntArray3196[i_20_]
			= (i_25_ > i_26_ ? i_24_ - i_26_ + i_23_
			   : i_23_ - i_24_ + i_25_ - 1);
		else
		    anIntArray3196[i_20_]
			= ((i_24_ & 0x1) != 0 ? i_23_ - (i_24_ + 1) / 2
			   : i_23_ + i_24_ / 2);
	    } else {
		aBooleanArray3195[i_20_] = false;
		anIntArray3196[i_20_] = i_23_;
	    }
	}
	method2813(0, i - 1);
	int i_28_ = 0;
	int i_29_ = anIntArray3196[0] * anInt3193;
	for (int i_30_ = 1; i_30_ < i; i_30_++) {
	    if (aBooleanArray3195[i_30_]) {
		int i_31_ = anIntArray3190[i_30_];
		int i_32_ = anIntArray3196[i_30_] * anInt3193;
		method2810(i_28_, i_29_, i_31_, i_32_, arg0, arg1);
		if (i_31_ >= arg1)
		    return;
		i_28_ = i_31_;
		i_29_ = i_32_;
	    }
	}
	float f = aFloatArray3189[i_29_];
	for (int i_33_ = i_28_; i_33_ < arg1; i_33_++)
	    arg0[i_33_] *= f;
    }
    
    public void method2813(int arg0, int arg1) {
	if (arg0 < arg1) {
	    int i = arg0;
	    int i_34_ = anIntArray3190[i];
	    int i_35_ = anIntArray3196[i];
	    boolean bool = aBooleanArray3195[i];
	    for (int i_36_ = arg0 + 1; i_36_ <= arg1; i_36_++) {
		int i_37_ = anIntArray3190[i_36_];
		if (i_37_ < i_34_) {
		    anIntArray3190[i] = i_37_;
		    anIntArray3196[i] = anIntArray3196[i_36_];
		    aBooleanArray3195[i] = aBooleanArray3195[i_36_];
		    i++;
		    anIntArray3190[i_36_] = anIntArray3190[i];
		    anIntArray3196[i_36_] = anIntArray3196[i];
		    aBooleanArray3195[i_36_] = aBooleanArray3195[i];
		}
	    }
	    anIntArray3190[i] = i_34_;
	    anIntArray3196[i] = i_35_;
	    aBooleanArray3195[i] = bool;
	    method2813(arg0, i - 1);
	    method2813(i + 1, arg1);
	}
    }
    
    public int method2814(int arg0, int arg1, int arg2, int arg3, int arg4) {
	int i = arg3 - arg1;
	int i_38_ = arg2 - arg0;
	int i_39_ = i < 0 ? -i : i;
	int i_40_ = i_39_ * (arg4 - arg0);
	int i_41_ = i_40_ / i_38_;
	if (i < 0)
	    return arg1 - i_41_;
	return arg1 + i_41_;
    }
    
    public static int method2815(int[] arg0, int arg1) {
	int i = arg0[arg1];
	int i_42_ = -1;
	int i_43_ = -2147483648;
	for (int i_44_ = 0; i_44_ < arg1; i_44_++) {
	    int i_45_ = arg0[i_44_];
	    if (i_45_ < i && i_45_ > i_43_) {
		i_42_ = i_44_;
		i_43_ = i_45_;
	    }
	}
	return i_42_;
    }
    
    public static void method2816() {
	anIntArray3187 = null;
	aFloatArray3189 = null;
	anIntArray3190 = null;
	anIntArray3196 = null;
	aBooleanArray3195 = null;
    }
    
    public static int method2817(int[] arg0, int arg1) {
	int i = arg0[arg1];
	int i_46_ = -1;
	int i_47_ = 2147483647;
	for (int i_48_ = 0; i_48_ < arg1; i_48_++) {
	    int i_49_ = arg0[i_48_];
	    if (i_49_ > i && i_49_ < i_47_) {
		i_46_ = i_48_;
		i_47_ = i_49_;
	    }
	}
	return i_46_;
    }
    
    public Class216() {
	int i = Class131_Sub39.method1896(16);
	if (i != 1)
	    throw new RuntimeException();
	int i_50_ = Class131_Sub39.method1896(5);
	int i_51_ = 0;
	anIntArray3186 = new int[i_50_];
	for (int i_52_ = 0; i_52_ < i_50_; i_52_++) {
	    int i_53_ = Class131_Sub39.method1896(4);
	    anIntArray3186[i_52_] = i_53_;
	    if (i_53_ >= i_51_)
		i_51_ = i_53_ + 1;
	}
	anIntArray3185 = new int[i_51_];
	anIntArray3194 = new int[i_51_];
	anIntArray3188 = new int[i_51_];
	anIntArrayArray3192 = new int[i_51_][];
	for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
	    anIntArray3185[i_54_] = Class131_Sub39.method1896(3) + 1;
	    int i_55_ = anIntArray3194[i_54_] = Class131_Sub39.method1896(2);
	    if (i_55_ != 0)
		anIntArray3188[i_54_] = Class131_Sub39.method1896(8);
	    i_55_ = 1 << i_55_;
	    int[] is = new int[i_55_];
	    anIntArrayArray3192[i_54_] = is;
	    for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
		is[i_56_] = Class131_Sub39.method1896(8) - 1;
	}
	anInt3193 = Class131_Sub39.method1896(2) + 1;
	int i_57_ = Class131_Sub39.method1896(4);
	int i_58_ = 2;
	for (int i_59_ = 0; i_59_ < i_50_; i_59_++)
	    i_58_ += anIntArray3185[anIntArray3186[i_59_]];
	anIntArray3191 = new int[i_58_];
	anIntArray3191[0] = 0;
	anIntArray3191[1] = 1 << i_57_;
	i_58_ = 2;
	for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
	    int i_61_ = anIntArray3186[i_60_];
	    for (int i_62_ = 0; i_62_ < anIntArray3185[i_61_]; i_62_++)
		anIntArray3191[i_58_++] = Class131_Sub39.method1896(i_57_);
	}
	if (anIntArray3190 == null || anIntArray3190.length < i_58_) {
	    anIntArray3190 = new int[i_58_];
	    anIntArray3196 = new int[i_58_];
	    aBooleanArray3195 = new boolean[i_58_];
	}
    }
}
