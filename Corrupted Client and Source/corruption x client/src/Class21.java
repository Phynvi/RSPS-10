/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class21
{
    public static Class214 aClass214_239;
    public static boolean aBoolean240 = false;
    public static String aString241;
    public static Class158 aClass158_242;
    
    public static void method261(Class130 arg0, Class23 arg1, int arg2,
				 int arg3, int arg4, int arg5, int arg6) {
	boolean bool = true;
	int i = arg3;
	int i_0_ = arg3 + arg5;
	int i_1_ = arg4 - 1;
	int i_2_ = arg4 + arg6;
	for (int i_3_ = arg2; i_3_ <= arg2 + 1; i_3_++) {
	    if (i_3_ != Class133.anInt1805) {
		for (int i_4_ = i; i_4_ <= i_0_; i_4_++) {
		    if (i_4_ >= 0 && i_4_ < Class210.anInt3068) {
			for (int i_5_ = i_1_; i_5_ <= i_2_; i_5_++) {
			    if (i_5_ >= 0
				&& i_5_ < Class131_Sub8_Sub1.anInt6099
				&& (!bool || i_4_ >= i_0_ || i_5_ >= i_2_
				    || i_5_ < arg4 && i_4_ != arg3)) {
				Class147 class147
				    = (Class131_Sub2_Sub29
				       .aClass147ArrayArrayArray5972[i_3_]
				       [i_4_][i_5_]);
				if (class147 != null) {
				    int i_6_
					= ((Class75.aClass68Array1023[i_3_]
						.method712(i_4_, i_5_)
					    + Class75.aClass68Array1023
						  [i_3_]
						  .method712(i_4_ + 1, i_5_)
					    + Class75.aClass68Array1023
						  [i_3_]
						  .method712(i_4_, i_5_ + 1)
					    + (Class75.aClass68Array1023
						   [i_3_].method712
					       (i_4_ + 1, i_5_ + 1))) / 4
					   - (Class75.aClass68Array1023
						  [arg2].method712(arg3, arg4)
					      + Class75.aClass68Array1023
						    [arg2]
						    .method712(arg3 + 1, arg4)
					      + Class75.aClass68Array1023
						    [arg2]
						    .method712(arg3, arg4 + 1)
					      + (Class75.aClass68Array1023
						     [arg2].method712
						 (arg3 + 1, arg4 + 1))) / 4);
				    Class23_Sub1 class23_sub1
					= class147.aClass23_Sub1_1966;
				    Class23_Sub1 class23_sub1_7_
					= class147.aClass23_Sub1_1969;
				    if (class23_sub1 != null
					&& class23_sub1.method289((byte) -115))
					arg1.method293((byte) -118, arg0,
						       ((i_5_ - arg4) * 128
							+ (1 - arg6) * 64),
						       ((i_4_ - arg3) * 128
							+ (1 - arg5) * 64),
						       bool, class23_sub1,
						       i_6_);
				    if (class23_sub1_7_ != null
					&& class23_sub1_7_
					       .method289((byte) -115))
					arg1.method293((byte) -121, arg0,
						       ((i_5_ - arg4) * 128
							+ (1 - arg6) * 64),
						       ((i_4_ - arg3) * 128
							+ (1 - arg5) * 64),
						       bool, class23_sub1_7_,
						       i_6_);
				    for (Class82 class82
					     = class147.aClass82_1958;
					 class82 != null;
					 class82 = class82.aClass82_1086) {
					Class23_Sub4 class23_sub4
					    = class82.aClass23_Sub4_1080;
					if (class23_sub4 != null
					    && class23_sub4
						   .method289((byte) -115)
					    && (i_4_ == class23_sub4.aShort3745
						|| i_4_ == i)
					    && (i_5_ == class23_sub4.aShort3737
						|| i_5_ == i_1_)) {
					    int i_8_
						= (class23_sub4.aShort3742
						   - class23_sub4.aShort3745
						   + 1);
					    int i_9_
						= (class23_sub4.aShort3735
						   - class23_sub4.aShort3737
						   + 1);
					    arg1.method293
						((byte) -124, arg0,
						 ((class23_sub4.aShort3737
						   - arg4) * 128
						  + (i_9_ - arg6) * 64),
						 ((class23_sub4.aShort3745
						   - arg3) * 128
						  + (i_8_ - arg5) * 64),
						 bool, class23_sub4, i_6_);
					}
				    }
				}
			    }
			}
		    }
		}
		i--;
		bool = false;
	    }
	}
    }
    
    public static void method262(int arg0) {
	try {
	    if (arg0 == 6044) {
		aString241 = null;
		aClass214_239 = null;
		aClass158_242 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"bq.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_239 = new Class214(32);
	aString241 = "Loading world list data";
    }
}
