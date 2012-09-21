/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class59
{
    public static int anInt768;
    public int anInt769;
    public int[][][] anIntArrayArrayArray770;
    public int anInt771 = 0;
    public static Class119 aClass119_772;
    public Class131_Sub31[] aClass131_Sub31Array773;
    public int anInt774;
    public int anInt775;
    public Class119 aClass119_776;
    public static int anInt777;
    public static int anInt778;
    public static int anInt779;
    public static int anInt780;
    public static int anInt781;
    public static String aString782 = "Loaded defaults";
    public boolean aBoolean783;
    public static Rectangle[] aRectangleArray784;
    public static int anInt785;
    
    public int[][] method641(int arg0, int arg1) {
	try {
	    if (arg1 != -2)
		aString782 = null;
	    anInt768++;
	    if ((anInt774 ^ 0xffffffff) == (anInt775 ^ 0xffffffff)) {
		aBoolean783 = aClass131_Sub31Array773[arg0] == null;
		aClass131_Sub31Array773[arg0]
		    = Class131_Sub41_Sub17.aClass131_Sub31_6386;
		return anIntArrayArrayArray770[arg0];
	    }
	    if ((anInt774 ^ 0xffffffff) != -2) {
		Class131_Sub31 class131_sub31 = aClass131_Sub31Array773[arg0];
		if (class131_sub31 == null) {
		    aBoolean783 = true;
		    if ((anInt774 ^ 0xffffffff) >= (anInt771 ^ 0xffffffff)) {
			Class131_Sub31 class131_sub31_0_
			    = (Class131_Sub31) aClass119_776.method1017(0);
			class131_sub31
			    = new Class131_Sub31(arg0,
						 class131_sub31_0_.anInt4534);
			aClass131_Sub31Array773[class131_sub31_0_.anInt4529]
			    = null;
			class131_sub31_0_.method1355((byte) 122);
		    } else {
			class131_sub31 = new Class131_Sub31(arg0, anInt771);
			anInt771++;
		    }
		    aClass131_Sub31Array773[arg0] = class131_sub31;
		} else
		    aBoolean783 = false;
		aClass119_776.method1016(class131_sub31, 0);
		return anIntArrayArrayArray770[class131_sub31.anInt4534];
	    }
	    aBoolean783 = (anInt769 ^ 0xffffffff) != (arg0 ^ 0xffffffff);
	    anInt769 = arg0;
	    return anIntArrayArrayArray770[0];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ga.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method642(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt778++;
	    if ((Class91.anInt1181 ^ 0xffffffff) == -2)
		Class29.aClass152Array330
		    [Class23_Sub4_Sub4.anInt5400 / 100].method2211
		    (-8 + Class120_Sub2.anInt3966,
		     Class131_Sub41_Sub17.anInt6383 + -8);
	    if ((Class91.anInt1181 ^ 0xffffffff) == -3)
		Class29.aClass152Array330
		    [4 + Class23_Sub4_Sub4.anInt5400 / 100].method2211
		    (-8 + Class120_Sub2.anInt3966,
		     -8 + Class131_Sub41_Sub17.anInt6383);
	    if (arg4 == 87)
		Class202.method2721((byte) 114);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ga.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static boolean method643(boolean arg0, int arg1, String arg2,
				    int arg3) {
	try {
	    anInt777++;
	    if ((arg1 ^ 0xffffffff) > -3 || arg1 > 36)
		throw new IllegalArgumentException("Invalid radix:" + arg1);
	    boolean bool = false;
	    boolean bool_1_ = false;
	    int i = arg3;
	    int i_2_ = arg2.length();
	    for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
		int i_4_ = arg2.charAt(i_3_);
		if ((i_3_ ^ 0xffffffff) == -1) {
		    if ((i_4_ ^ 0xffffffff) == -46) {
			bool = true;
			continue;
		    }
		    if (i_4_ == 43 && arg0)
			continue;
		}
		if ((i_4_ ^ 0xffffffff) <= -49 && i_4_ <= 57)
		    i_4_ -= 48;
		else if ((i_4_ ^ 0xffffffff) <= -66
			 && (i_4_ ^ 0xffffffff) >= -91)
		    i_4_ -= 55;
		else {
		    if (i_4_ < 97 || i_4_ > 122)
			return false;
		    i_4_ -= 87;
		}
		if ((i_4_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
		    return false;
		if (bool)
		    i_4_ = -i_4_;
		int i_5_ = i_4_ + arg1 * i;
		if (i != i_5_ / arg1)
		    return false;
		bool_1_ = true;
		i = i_5_;
	    }
	    return bool_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ga.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method644(int arg0, int arg1) {
	try {
	    Class23_Sub4_Sub1_Sub1.aClass214_6477.method2786(0, arg0);
	    anInt779++;
	    Class2.aClass214_83.method2786(0, arg0);
	    Class131_Sub7.aClass214_4180.method2786(arg1 ^ arg1, arg0);
	    Class82.aClass214_1087.method2786(0, arg0);
	    Class209.aClass214_3042.method2786(arg1 ^ ~0x7, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ga.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method645(byte arg0) {
	try {
	    aRectangleArray784 = null;
	    if (arg0 != -40)
		method643(true, 105, null, -115);
	    aClass119_772 = null;
	    aString782 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ga.G(" + arg0 + ')');
	}
    }
    
    public void method646(int arg0) {
	try {
	    for (int i = 0; (anInt774 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		anIntArrayArrayArray770[i][0] = null;
		anIntArrayArrayArray770[i][1] = null;
		anIntArrayArrayArray770[i][2] = null;
		anIntArrayArrayArray770[i] = null;
	    }
	    anInt780++;
	    aClass131_Sub31Array773 = null;
	    anIntArrayArrayArray770 = null;
	    aClass119_776.method1012(arg0 ^ arg0);
	    aClass119_776 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ga.F(" + arg0 + ')');
	}
    }
    
    public int[][][] method647(byte arg0) {
	try {
	    anInt781++;
	    if (arg0 != 53)
		return null;
	    if ((anInt774 ^ 0xffffffff) != (anInt775 ^ 0xffffffff))
		throw new RuntimeException
			  ("Can only retrieve a full image cache");
	    for (int i = 0; i < anInt774; i++)
		aClass131_Sub31Array773[i]
		    = Class131_Sub41_Sub17.aClass131_Sub31_6386;
	    return anIntArrayArrayArray770;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ga.C(" + arg0 + ')');
	}
    }
    
    public Class59(int arg0, int arg1, int arg2) {
	anInt769 = -1;
	aClass119_776 = new Class119();
	aBoolean783 = false;
	try {
	    anInt774 = arg0;
	    anInt775 = arg1;
	    anIntArrayArrayArray770 = new int[anInt774][3][arg2];
	    aClass131_Sub31Array773 = new Class131_Sub31[anInt775];
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ga.<init>(" + arg0 + ','
						 + arg1 + ',' + arg2 + ')'));
	}
    }
    
    static {
	aClass119_772 = new Class119();
	aRectangleArray784 = new Rectangle[100];
	anInt785 = 0;
    }
}
