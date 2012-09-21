/* Class131_Sub2_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub12 extends Class131_Sub2
{
    public static int anInt5716;
    public static int anInt5717;
    public static int anInt5718;
    public static int anInt5719;
    public int anInt5720;
    public static int anInt5721;
    public int anInt5722;
    public static int[] anIntArray5723 = new int[2];
    public static int anInt5724;
    public static int anInt5725 = 0;
    public int[] anIntArray5726;
    public static int anInt5727;
    public static int anInt5728;
    public static int anInt5729;
    public static int anInt5730;
    public static int anInt5731;
    public static int anInt5732;
    public int anInt5733 = -1;
    public static String aString5734 = "Please remove ";
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	if ((arg0 ^ 0xffffffff) == -1)
	    anInt5733 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	anInt5718++;
	if (arg1 != -49)
	    method1462(-68, 91);
    }
    
    public static Class98 method1525(int arg0, int arg1) {
	try {
	    if (arg1 != 1487)
		method1527(35, 5, 40, -108, -45, -76, -48, 27);
	    anInt5732++;
	    Class98 class98
		= ((Class98)
		   Class131_Sub1_Sub4.aClass214_5541.method2780(arg1 ^ 0x5b5,
								(long) arg0));
	    if (class98 != null)
		return class98;
	    byte[] is
		= Class60.aClass158_787.method2364(arg0, 30, arg1 + -1487);
	    class98 = new Class98();
	    if (is != null)
		class98.method869(arg0, new Stream(is), (byte) 123);
	    Class131_Sub1_Sub4.aClass214_5541.method2773(true, class98,
							 (long) arg0);
	    return class98;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.U(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method1461(int arg0, int arg1, int arg2) {
	int i = 57 % ((arg0 - -29) / 63);
	anInt5724++;
	super.method1461(-113, arg1, arg2);
	if (anInt5733 >= 0) {
	    int i_0_ = (!(Class63.anInterface4_793.method10(-19907, anInt5733)
			  .aBoolean564)
			? 128 : 64);
	    anIntArray5726
		= Class63.anInterface4_793.method14(1.0F, i_0_, anInt5733,
						    i_0_, false, false);
	    anInt5720 = i_0_;
	    anInt5722 = i_0_;
	}
    }
    
    public int method1454(int arg0) {
	try {
	    if (arg0 != -3)
		anInt5720 = 69;
	    anInt5727++;
	    return anInt5733;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"er.V(" + arg0 + ')');
	}
    }
    
    public static void method1526(int arg0, Class158 arg1) {
	anInt5729++;
	Class199.anInt2909 = arg1.method2359(arg0 ^ ~0x7fa641b2, "titlebg");
	Class131_Sub41_Sub1.anInt6168 = arg1.method2359(105, "logo");
	if (arg0 != -2141602260)
	    method1525(50, 80);
    }
    
    public void method1460(int arg0) {
	try {
	    super.method1460(arg0);
	    anInt5731++;
	    if (arg0 == 15)
		anIntArray5726 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"er.Q(" + arg0 + ')');
	}
    }
    
    public static void method1527(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    Class18.method230(arg5, 31496, arg1, arg6, arg0, arg2, arg4, arg3,
			      arg7);
	    anInt5721++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.EA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public static String method1528(int arg0, Stream arg1, int arg2) {
	try {
	    anInt5730++;
	    try {
		if (arg2 <= 85)
		    anIntArray5723 = null;
		int i = arg1.readSmart(-1647926640);
		if (i > arg0)
		    i = arg0;
		byte[] is = new byte[i];
		arg1.offset += (Class131_Sub41_Sub7.aClass75_6251.method764
				   ((byte) 28, is, i, arg1.data,
				    arg1.offset, 0));
		String string = Class131_Sub8_Sub1.method1682(i, 0, 4238, is);
		return string;
	    } catch (Exception exception) {
		return "Cabbage";
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.AA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public static int method1529(int arg0, int arg1) {
	try {
	    if (arg0 != 1867186728)
		return 101;
	    anInt5716++;
	    return arg1 >>> 1867186728;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.FA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt5719++;
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (arg1 != 0)
		method1461(-38, 17, -118);
	    if (aClass59_4097.aBoolean783) {
		int i = (((anInt5720 ^ 0xffffffff) == (Class120_Sub2.anInt3975
						       ^ 0xffffffff)
			  ? arg0 : anInt5720 * arg0 / Class120_Sub2.anInt3975)
			 * anInt5722);
		int[] is_1_ = is[0];
		int[] is_2_ = is[1];
		int[] is_3_ = is[2];
		if ((anInt5722 ^ 0xffffffff)
		    == (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)) {
		    for (int i_4_ = 0; Class131_Sub2_Sub7.anInt5637 > i_4_;
			 i_4_++) {
			int i_5_ = anIntArray5726[i++];
			is_3_[i_4_]
			    = Class90.method841(i_5_, 255) << -1671132828;
			is_2_[i_4_]
			    = Class90.method841(4080, i_5_ >> -1102659836);
			is_1_[i_4_]
			    = Class90.method841(16711680, i_5_) >> -2141602260;
		    }
		} else {
		    for (int i_6_ = 0;
			 ((Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff)
			  < (i_6_ ^ 0xffffffff));
			 i_6_++) {
			int i_7_
			    = i_6_ * anInt5722 / Class131_Sub2_Sub7.anInt5637;
			int i_8_ = anIntArray5726[i_7_ + i];
			is_3_[i_6_]
			    = Class90.method841(i_8_ << 1748023556, 4080);
			is_2_[i_6_]
			    = Class90.method841(i_8_, 65280) >> -2068253308;
			is_1_[i_6_]
			    = Class90.method841(i_8_ >> -279597812, 4080);
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub12() {
	super(0, false);
    }
    
    public static void method1530(byte arg0) {
	anIntArray5723 = null;
	aString5734 = null;
	if (arg0 != 65)
	    method1527(-75, -15, 41, 122, -5, -49, -24, -48);
    }
    
    public static void method1531(byte arg0, int arg1, boolean arg2,
				  int arg3) {
	try {
	    anInt5717++;
	    if (arg3 < 8000 || (arg3 ^ 0xffffffff) < -48001)
		throw new IllegalArgumentException();
	    if (arg0 <= -33) {
		Class131_Sub2_Sub14.anInt5754 = arg3;
		Class98.anInt1303 = arg1;
		Class131_Sub2_Sub10_Sub1.aBoolean6534 = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("er.BA(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    static {
	anInt5728 = 0;
    }
}
