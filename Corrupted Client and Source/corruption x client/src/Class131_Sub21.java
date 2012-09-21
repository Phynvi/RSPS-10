/* Class131_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub21 extends Class131
{
    public static int anInt4434;
    public static int anInt4435;
    public int anInt4436;
    public long aLong4437;
    public static int anInt4438;
    public static int anInt4439;
    public String aString4440;
    public int anInt4441;
    public int anInt4442;
    public static int anInt4443;
    public int anInt4444;
    public String aString4445;
    
    public static void method1818(int arg0, int arg1, int arg2, int arg3,
				  Class23_Sub3 arg4) {
	arg4.anInt3728 = (arg1 << 7) + 64;
	arg4.anInt3727 = arg3;
	arg4.anInt3729 = (arg2 << 7) + 64;
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 != null) {
	    int i = 0;
	    for (Class82 class82 = class147.aClass82_1958; class82 != null;
		 class82 = class82.aClass82_1086) {
		if (class82.aClass23_Sub4_1080.aBoolean3749) {
		    int i_0_ = class82.aClass23_Sub4_1080.method323(-82);
		    if (i_0_ != -32768 && i_0_ < i)
			i = i_0_;
		}
	    }
	    if (i < 0) {
		arg4.anInt3727 += i;
		arg4.aBoolean3731 = true;
	    }
	}
	if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    == null)
	    Class1_Sub2.method101(arg0, arg1, arg2);
	Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[arg0][arg1][arg2]
	    .aClass23_Sub3_1970
	    = arg4;
    }
    
    public static int method1819(int arg0, String arg1) {
	try {
	    anInt4439++;
	    int i = arg1.length();
	    int i_1_ = 0;
	    int i_2_ = 68 / ((arg0 - -64) / 61);
	    for (int i_3_ = 0; i > i_3_; i_3_++)
		i_1_ = -i_1_ + ((i_1_ << 1094250885) - -arg1.charAt(i_3_));
	    return i_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("mb.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1820(byte arg0) {
	try {
	    anInt4438++;
	    Class213.method2771();
	    if (arg0 != -56)
		method1819(-57, null);
	    for (int i = 0; i < 4; i++)
		Class131_Sub2_Sub9.aClass19Array5682[i].method253((byte) -107);
	    Class131_Sub2_Sub1.method1475((byte) 50);
	    Class131_Sub2_Sub10_Sub1.method1517(8110);
	    System.gc();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"mb.C(" + arg0 + ')');
	}
    }
    
    public Class131_Sub21(String arg0, String arg1, int arg2, int arg3,
			  long arg4, int arg5, int arg6) {
	try {
	    anInt4441 = arg6;
	    anInt4442 = arg3;
	    aString4445 = arg1;
	    aLong4437 = arg4;
	    anInt4436 = arg2;
	    anInt4444 = arg5;
	    aString4440 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("mb.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
	}
    }
}
