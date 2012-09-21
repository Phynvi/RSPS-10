/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class182
{
    public static int[] anIntArray2602 = { 104, 120, 136, 168 };
    public static Class214 aClass214_2603;
    public static int anInt2604;
    public static int anInt2605;
    public static int anInt2606 = -1;
    public static int anInt2607;
    public static String aString2608 = "Cancel";
    public static int anInt2609;
    
    public static void method2535(Class23_Sub4_Sub1_Sub2 arg0, int arg1) {
	try {
	    anInt2609++;
	    if (Class147.anInt1946 < 400
		&& Class166.aClass23_Sub4_Sub1_Sub2_2216 != arg0) {
		String string;
		if (arg0.anInt6498 != 0)
		    string = (arg0.method363(true, true) + " ("
			      + Class131_Sub2_Sub5.aString5615 + arg0.anInt6498
			      + ")");
		else {
		    boolean bool = true;
		    if (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6492 != -1
			&& arg0.anInt6492 != -1) {
			int i
			    = ((Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6515
				> arg0.anInt6515)
			       ? (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anInt6515)
			       : arg0.anInt6515);
			int i_0_
			    = ((Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6492
				^ 0xffffffff) <= (arg0.anInt6492 ^ 0xffffffff)
			       ? arg0.anInt6492
			       : (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anInt6492));
			int i_1_ = i_0_ + 10 * i / 100 + 5;
			int i_2_
			    = (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6515
			       - arg0.anInt6515);
			if (i_2_ < 0)
			    i_2_ = -i_2_;
			if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
			    bool = false;
		    }
		    String string_3_
			= ((Class126.anInt1696 ^ 0xffffffff) != -2
			   ? Class1_Sub2.aString3510 : Class46.aString639);
		    if ((arg0.anInt6515 ^ 0xffffffff)
			> (arg0.anInt6522 ^ 0xffffffff))
			string = (arg0.method363(true, true)
				  + (!bool ? "<col=ffffff>"
				     : (Class100.method872
					((byte) 51, arg0.anInt6515,
					 (Class166.aClass23_Sub4_Sub1_Sub2_2216
					  .anInt6515))))
				  + " (" + string_3_ + arg0.anInt6515 + "+"
				  + (arg0.anInt6522 + -arg0.anInt6515) + ")");
		    else
			string = (arg0.method363(true, true)
				  + (bool
				     ? (Class100.method872
					((byte) 51, arg0.anInt6515,
					 (Class166.aClass23_Sub4_Sub1_Sub2_2216
					  .anInt6515)))
				     : "<col=ffffff>")
				  + " (" + string_3_ + arg0.anInt6515 + ")");
		}
		if ((Class131_Sub1_Sub4.anInt5546 ^ 0xffffffff) == -2) {
		    Class131_Sub9.anInt4210++;
		    Class131_Sub31.method1860(Class218.anInt3200,
					      (long) arg0.anInt5274,
					      Class158.aString2090, -1, 0,
					      (Class148.aString1979
					       + " -> <col=ffffff>" + string),
					      0, 9);
		} else if (!Class154.aBoolean2047) {
		    for (int i = 7; (i ^ 0xffffffff) <= -1; i--) {
			if (Class4.aStringArray3291[i] != null) {
			    short i_4_ = 0;
			    if (Class126.anInt1696 == 0
				&& (Class4.aStringArray3291[i].equalsIgnoreCase
				    (Class180.aString2591))) {
				if ((arg0.anInt6515 ^ 0xffffffff)
				    < ((Class166.aClass23_Sub4_Sub1_Sub2_2216
					.anInt6515)
				       ^ 0xffffffff))
				    i_4_ = (short) 2000;
				if (((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt6530)
				     ^ 0xffffffff) != -1
				    && (arg0.anInt6530 ^ 0xffffffff) != -1) {
				    if ((arg0.anInt6530 ^ 0xffffffff)
					== ((Class166
					     .aClass23_Sub4_Sub1_Sub2_2216
					     .anInt6530)
					    ^ 0xffffffff))
					i_4_ = (short) 2000;
				    else
					i_4_ = (short) 0;
				}
			    } else if (Class42.aBooleanArray571[i])
				i_4_ = (short) 2000;
			    short i_5_ = (short) ((Class131_Sub2_Sub3
						   .aShortArray5585[i])
						  + i_4_);
			    int i_6_
				= (Class23_Sub4_Sub5.anIntArray5114[i] == -1
				   ? InputStream_Sub1.anInt57
				   : Class23_Sub4_Sub5.anIntArray5114[i]);
			    Class131_Sub41_Sub15.anInt6350++;
			    Class131_Sub31.method1860(i_6_,
						      (long) arg0.anInt5274,
						      (Class4.aStringArray3291
						       [i]),
						      arg1 + -2224, 0,
						      "<col=ffffff>" + string,
						      0, i_5_);
			}
		    }
		} else if ((Class193.anInt2839 & 0x8) != 0) {
		    Class131_Sub31.method1860(Class131_Sub41_Sub21.anInt6447,
					      (long) arg0.anInt5274,
					      Class131_Sub41_Sub2.aString6191,
					      -1, 0,
					      (Class112.aString1453
					       + " -> <col=ffffff>" + string),
					      0, 25);
		    Class92.anInt1195++;
		}
		Class131_Sub21 class131_sub21
		    = ((Class131_Sub21)
		       Class66.aClass119_843.method1007(arg1 + -2223));
		if (arg1 != 2223)
		    aClass214_2603 = null;
		for (/**/; class131_sub21 != null;
		     class131_sub21 = ((Class131_Sub21)
				       Class66.aClass119_843.method1014(0))) {
		    if (class131_sub21.anInt4442 == 57) {
			class131_sub21.aString4445 = "<col=ffffff>" + string;
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sj.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static int method2536(int arg0, int arg1, char arg2) {
	try {
	    anInt2607++;
	    int i = arg2 << 1869189636;
	    if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
		arg2 = Character.toLowerCase(arg2);
		i = (arg2 << -139870524) + 1;
	    }
	    if (arg0 != 1)
		return -114;
	    if ((arg2 ^ 0xffffffff) == -242 && (arg1 ^ 0xffffffff) == -1)
		i = 1762;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sj.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method2537(byte arg0) {
	try {
	    aClass214_2603 = null;
	    aString2608 = null;
	    if (arg0 != 112)
		method2535(null, -76);
	    anIntArray2602 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sj.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_2603 = new Class214(64);
    }
}
