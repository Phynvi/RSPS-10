/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Constructor;
import java.util.Random;

public abstract class Class44
{
    public static int anInt591;
    public static int anInt592;
    public static int anInt593;
    public static int anInt594;
    public static Class152 aClass152_595;
    public static int anInt596;
    public static int anInt597;
    public static int anInt598;
    public Class130 aClass130_599;
    public static int anInt600;
    public static int anInt601;
    public static int anInt602;
    public Class55 aClass55_603;
    public static int anInt604;
    public static int anInt605;
    public static int anInt606;
    public static int anInt607;
    public static int anInt608;
    public static int anInt609;
    public static int anInt610;
    public static int anInt611;
    public static int anInt612;
    public static int anInt613;
    public static String aString614 = "flash1:";
    public static int anInt615;
    public static int anInt616;
    /*synthetic*/ public static Class aClass617;
    /*synthetic*/ public static Class aClass618;
    /*synthetic*/ public static Class aClass619;
    
    public void method525(int arg0, String arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	try {
	    anInt607++;
	    if (arg1 != null) {
		method537(arg6, arg3, 0);
		int i = arg1.length();
		int[] is = new int[i];
		int[] is_0_ = new int[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
		    is[i_1_] = (int) (5.0 * Math.sin((double) i_1_ / 5.0
						     + (double) arg5 / 5.0));
		    is_0_[i_1_]
			= (int) (5.0 * Math.sin((double) i_1_ / 3.0
						+ (double) arg5 / 5.0));
		}
		method526(arg0, arg1,
			  (-(aClass55_603.method621((byte) -35, arg1) / arg4)
			   + arg2),
			  is, is_0_, null, true, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.DA(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public void method526(int arg0, String arg1, int arg2, int[] arg3,
			  int[] arg4, Class152[] arg5, boolean arg6,
			  int[] arg7) {
	try {
	    anInt616++;
	    arg0 -= aClass55_603.anInt727;
	    int i = -1;
	    if (arg6 != true)
		method531(null, 50);
	    int i_2_ = -1;
	    int i_3_ = 0;
	    int i_4_ = arg1.length();
	    int i_5_ = 0;
	    for (/**/; i_4_ > i_5_; i_5_++) {
		char c = (char) (method542(arg1.charAt(i_5_), arg6) & 0xff);
		if ((c ^ 0xffffffff) == -61)
		    i = i_5_;
		else {
		    if ((c ^ 0xffffffff) == -63 && (i ^ 0xffffffff) != 0) {
			String string = arg1.substring(1 + i, i_5_);
			i = -1;
			if (!string.equals("lt")) {
			    if (string.equals("gt"))
				c = '>';
			    else if (string.equals("nbsp"))
				c = '\u00a0';
			    else if (!string.equals("shy")) {
				if (!string.equals("times")) {
				    if (!string.equals("euro")) {
					if (string.equals("copy"))
					    c = '\u00a9';
					else {
					    if (!string.equals("reg")) {
						if (!string.startsWith("img="))
						    method531(string, -2033);
						else {
						    try {
							int i_6_;
							if (arg3 != null)
							    i_6_ = arg3[i_3_];
							else
							    i_6_ = 0;
							int i_7_;
							if (arg4 != null)
							    i_7_ = arg4[i_3_];
							else
							    i_7_ = 0;
							i_3_++;
							int i_8_
							    = (Class161
								   .method2393
							       ((string
								     .substring
								 (4)),
								(byte) 20));
							Class152 class152
							    = arg5[i_8_];
							int i_9_
							    = (arg7 == null
							       ? (class152
								      .method2198
								  ())
							       : arg7[i_8_]);
							class152.method2202
							    (arg2 - -i_6_,
							     ((aClass55_603
							       .anInt727)
							      + arg0 - i_9_
							      - -i_7_),
							     0, 0, 1);
							arg2
							    += (arg5[i_8_]
								    .method2216
								());
							i_2_ = -1;
						    } catch (Exception exception) {
							/* empty */
						    }
						}
						continue;
					    }
					    c = '\u00ae';
					}
				    } else
					c = '\u20ac';
				} else
				    c = '\u00d7';
			    } else
				c = '\u00ad';
			} else
			    c = '<';
		    }
		    if (i == -1) {
			if ((i_2_ ^ 0xffffffff) != 0)
			    arg2 += aClass55_603.method613(c, false, i_2_);
			int i_10_;
			if (arg3 != null)
			    i_10_ = arg3[i_3_];
			else
			    i_10_ = 0;
			int i_11_;
			if (arg4 != null)
			    i_11_ = arg4[i_3_];
			else
			    i_11_ = 0;
			if ((c ^ 0xffffffff) == -33) {
			    if (Class77.anInt1045 > 0) {
				Class127_Sub1.anInt4002 += Class77.anInt1045;
				arg2 += Class127_Sub1.anInt4002 >> -1535380248;
				Class127_Sub1.anInt4002 &= 0xff;
			    }
			} else {
			    if ((Class89.anInt3258 & ~0xffffff) != 0)
				method544(c, i_10_ + (arg2 + 1),
					  i_11_ + (arg0 - -1),
					  Class89.anInt3258, true);
			    method544(c, arg2 + i_10_, arg0 + i_11_,
				      Class68.anInt921, false);
			}
			i_3_++;
			int i_12_ = aClass55_603.method610(c, 87);
			if ((Class131_Sub41_Sub2.anInt6183 ^ 0xffffffff) != 0)
			    aClass130_599.method1225
				(arg2, Class131_Sub41_Sub2.anInt6183,
				 (byte) -102, i_12_,
				 ((int) ((double) aClass55_603.anInt727 * 0.7)
				  + arg0));
			if (Class51.anInt681 != -1)
			    aClass130_599.method1225(arg2, Class51.anInt681,
						     (byte) -108, i_12_,
						     (aClass55_603.anInt727
						      + arg0));
			arg2 += i_12_;
			i_2_ = c;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.M(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method527(int arg0, boolean arg1, int arg2, int arg3, int arg4,
			  String arg5, int arg6, int arg7) {
	try {
	    anInt610++;
	    if (arg1 != false)
		anInt600 = -126;
	    if (arg5 != null) {
		method537(arg2, arg4, 0);
		double d = 7.0 - (double) arg3 / 8.0;
		if (d < 0.0)
		    d = 0.0;
		int i = arg5.length();
		int[] is = new int[i];
		for (int i_13_ = 0; (i ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
		     i_13_++)
		    is[i_13_]
			= (int) (Math.sin((double) i_13_ / 1.5 + (double) arg7)
				 * d);
		method526(arg6, arg5,
			  arg0 - aClass55_603.method621((byte) -37, arg5) / 2,
			  null, is, null, !arg1, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.W(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ',' + arg7
						 + ')'));
	}
    }
    
    public void method528(byte arg0, int arg1, String arg2, int arg3, int arg4,
			  int arg5) {
	try {
	    anInt606++;
	    if (arg2 != null) {
		method537(arg1, arg3, 0);
		if (arg0 > 63)
		    method543(arg5, 0, null, null,
			      (-(aClass55_603.method621((byte) 76, arg2) / 2)
			       + arg4),
			      0, 0, arg2, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.P(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ',' + arg4
						 + ',' + arg5 + ')'));
	}
    }
    
    public void method529(int arg0, String arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	try {
	    anInt602++;
	    if (arg1 != null) {
		method537(arg5, arg2, arg0 ^ arg0);
		method543(arg3, 0, null, null, arg4, 0, 0, arg1, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.Q(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public int method530(int arg0, int arg1, int arg2, int arg3, String arg4,
			 int arg5, Random arg6, int[] arg7, int arg8, int arg9,
			 int arg10, int arg11, int arg12, int[] arg13,
			 Class152[] arg14) {
	try {
	    anInt591++;
	    if (arg4 == null)
		return 0;
	    arg6.setSeed((long) arg11);
	    int i = (arg6.nextInt() & 0x1f) + 192;
	    method537(i << -977713544 | arg10 & 0xffffff,
		      0xffffff & arg12 | i << 1840850360, arg8 ^ arg8);
	    int i_14_ = arg4.length();
	    int[] is = new int[i_14_];
	    int i_15_ = 0;
	    for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
		is[i_16_] = i_15_;
		if ((arg6.nextInt() & 0x3) == 0)
		    i_15_++;
	    }
	    int i_17_ = arg2;
	    int i_18_ = arg5 - -aClass55_603.anInt723;
	    int i_19_ = -1;
	    if ((arg1 ^ 0xffffffff) == -2)
		i_18_ += (-aClass55_603.anInt717
			  + (arg0 - aClass55_603.anInt723)) / 2;
	    else if ((arg1 ^ 0xffffffff) == -3)
		i_18_ = -aClass55_603.anInt717 + arg0 + arg5;
	    if ((arg9 ^ 0xffffffff) == -2) {
		i_19_ = i_15_ + aClass55_603.method621((byte) 74, arg4);
		i_17_ += (-i_19_ + arg3) / 2;
	    } else if (arg9 == 2) {
		i_19_ = i_15_ + aClass55_603.method621((byte) 100, arg4);
		i_17_ += arg3 + -i_19_;
	    }
	    method526(i_18_, arg4, i_17_, is, null, arg14, true, arg13);
	    if (arg7 != null) {
		if (i_19_ == -1)
		    i_19_ = aClass55_603.method621((byte) 88, arg4) + i_15_;
		arg7[3] = aClass55_603.anInt723 - -aClass55_603.anInt717;
		arg7[0] = i_17_;
		arg7[2] = i_19_;
		arg7[1] = i_18_ + -aClass55_603.anInt723;
	    }
	    return i_15_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.BA(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ',' + arg5
			+ ',' + (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ','
			+ (arg13 != null ? "{...}" : "null") + ','
			+ (arg14 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method531(String arg0, int arg1) {
	anInt609++;
	do {
	    try {
		if (!arg0.startsWith("col=")) {
		    if (arg0.equals("/col"))
			Class68.anInt921 = (Class68.anInt921 & ~0xffffff
					    | 0xffffff & Class183.anInt2618);
		} else
		    Class68.anInt921
			= (~0xffffff & Class68.anInt921
			   | Class23_Sub1_Sub2.method305(16, arg0.substring(4),
							 14006) & 0xffffff);
		if (!arg0.startsWith("argb=")) {
		    if (!arg0.equals("/argb")) {
			if (arg0.startsWith("str="))
			    Class131_Sub41_Sub2.anInt6183
				= (Class23_Sub1_Sub2
				       .method305(16, arg0.substring(4), 14006)
				   | ~0xffffff);
			else if (arg0.equals("str"))
			    Class131_Sub41_Sub2.anInt6183 = -8388608;
			else if (!arg0.equals("/str")) {
			    if (!arg0.startsWith("u=")) {
				if (arg0.equals("u"))
				    Class51.anInt681 = -16777216;
				else if (!arg0.equals("/u")) {
				    if (!arg0.equalsIgnoreCase("shad=-1")) {
					if (!arg0.startsWith("shad=")) {
					    if (arg0.equals("shad"))
						Class89.anInt3258 = -16777216;
					    else if (arg0.equals("/shad"))
						Class89.anInt3258
						    = (Class131_Sub41_Sub18
						       .anInt6396);
					    else if (arg0.equals("br"))
						method537((Class131_Sub41_Sub18
							   .anInt6396),
							  Class183.anInt2618,
							  0);
					} else
					    Class89.anInt3258
						= (~0xffffff
						   | (Class23_Sub1_Sub2
							  .method305
						      (16, arg0.substring(5),
						       14006)));
				    } else
					Class89.anInt3258 = 0;
				} else
				    Class51.anInt681 = -1;
			    } else
				Class51.anInt681
				    = ~0xffffff | (Class23_Sub1_Sub2.method305
						   (16, arg0.substring(2),
						    14006));
			} else
			    Class131_Sub41_Sub2.anInt6183 = -1;
		    } else
			Class68.anInt921 = Class183.anInt2618;
		} else
		    Class68.anInt921
			= Class23_Sub1_Sub2.method305(16, arg0.substring(5),
						      14006);
		if (arg1 == -2033)
		    break;
		aClass130_599 = null;
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static boolean method532(Class173 arg0, byte arg1) {
	try {
	    if (arg1 <= 54)
		return true;
	    anInt594++;
	    if (arg0.anIntArray2384 == null)
		return false;
	    for (int i = 0; arg0.anIntArray2384.length > i; i++) {
		int i_20_ = Class147.method2175(73, i, arg0);
		int i_21_ = arg0.anIntArray2407[i];
		if (arg0.anIntArray2384[i] == 2) {
		    if (i_20_ >= i_21_)
			return false;
		} else if (arg0.anIntArray2384[i] == 3) {
		    if ((i_21_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff))
			return false;
		} else if (arg0.anIntArray2384[i] != 4) {
		    if (i_21_ != i_20_)
			return false;
		} else if (i_20_ == i_21_)
		    return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.O("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public int method533(int[] arg0, Class183 arg1, int arg2, int arg3,
			 int arg4, int arg5, int arg6, int arg7, int arg8,
			 int arg9, int arg10, String arg11, Class152[] arg12,
			 int arg13, int arg14, int arg15) {
	try {
	    anInt612++;
	    if (arg11 == null)
		return 0;
	    method537(arg5, arg7, arg10 ^ arg10);
	    if ((arg9 ^ 0xffffffff) == -1)
		arg9 = aClass55_603.anInt727;
	    int[] is;
	    if (arg8 < arg9 + (aClass55_603.anInt723 + aClass55_603.anInt717)
		&& (arg8 ^ 0xffffffff) > (arg9 + arg9 ^ 0xffffffff))
		is = null;
	    else
		is = new int[] { arg14 };
	    int i = aClass55_603.method620(is, -67, arg11,
					   Class33.aStringArray476, arg12);
	    if ((arg3 ^ 0xffffffff) == -4 && i == 1)
		arg3 = 1;
	    int i_22_;
	    if ((arg3 ^ 0xffffffff) != -1) {
		if (arg3 == 1)
		    i_22_ = ((arg8 - (aClass55_603.anInt723
				      - (-aClass55_603.anInt717
					 - arg9 * (i + -1)))) / 2
			     + aClass55_603.anInt723 + arg4);
		else if ((arg3 ^ 0xffffffff) != -3) {
		    int i_23_ = ((-((i - 1) * arg9) + -aClass55_603.anInt717
				  + arg8 - aClass55_603.anInt723)
				 / (1 + i));
		    if (i_23_ < 0)
			i_23_ = 0;
		    arg9 += i_23_;
		    i_22_ = aClass55_603.anInt723 + arg4 + i_23_;
		} else
		    i_22_ = -((-1 + i) * arg9) + (-aClass55_603.anInt717 + arg4
						  + arg8);
	    } else
		i_22_ = aClass55_603.anInt723 + arg4;
	    for (int i_24_ = 0; i > i_24_; i_24_++) {
		if ((arg15 ^ 0xffffffff) != -1) {
		    if ((arg15 ^ 0xffffffff) == -2)
			method543(i_22_, arg6, arg12, arg1,
				  arg13 + (arg14 - (aClass55_603.method621
						    ((byte) 113,
						     (Class33.aStringArray476
						      [i_24_])))) / 2,
				  0, arg2, Class33.aStringArray476[i_24_],
				  arg0);
		    else if (arg15 != 2) {
			if (i_24_ != -1 + i) {
			    method535(arg14, true,
				      Class33.aStringArray476[i_24_]);
			    method543(i_22_, arg6, arg12, arg1, arg13, 0, arg2,
				      Class33.aStringArray476[i_24_], arg0);
			    Class77.anInt1045 = 0;
			} else
			    method543(i_22_, arg6, arg12, arg1, arg13, 0, arg2,
				      Class33.aStringArray476[i_24_], arg0);
		    } else
			method543(i_22_, arg6, arg12, arg1,
				  (-aClass55_603.method621((byte) -34,
							   (Class33
							    .aStringArray476
							    [i_24_]))
				   + arg13 + arg14),
				  arg10 + -23008, arg2,
				  Class33.aStringArray476[i_24_], arg0);
		} else
		    method543(i_22_, arg6, arg12, arg1, arg13, 0, arg2,
			      Class33.aStringArray476[i_24_], arg0);
		i_22_ += arg9;
	    }
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.R(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ','
			+ (arg12 != null ? "{...}" : "null") + ',' + arg13
			+ ',' + arg14 + ',' + arg15 + ')'));
	}
    }
    
    public abstract void method534(char c, int i, int i_25_, int i_26_,
				   boolean bool, Class183 class183, int i_27_,
				   int i_28_);
    
    public void method535(int arg0, boolean arg1, String arg2) {
	do {
	    try {
		anInt615++;
		int i = 0;
		if (arg1 != true)
		    method529(-114, null, 2, -122, -59, 25);
		boolean bool = false;
		for (int i_29_ = 0;
		     (arg2.length() ^ 0xffffffff) < (i_29_ ^ 0xffffffff);
		     i_29_++) {
		    int i_30_ = arg2.charAt(i_29_);
		    if ((i_30_ ^ 0xffffffff) != -61) {
			if (i_30_ == 62)
			    bool = false;
			else if (!bool && (i_30_ ^ 0xffffffff) == -33)
			    i++;
		    } else
			bool = true;
		}
		if (i <= 0)
		    break;
		Class77.anInt1045
		    = (arg0 + -aClass55_603.method621((byte) 101, arg2)
		       << 34518760) / i;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("dr.J(" + arg0 + ','
						     + arg1 + ','
						     + (arg2 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method536(byte arg0) {
	try {
	    aString614 = null;
	    if (arg0 != -19)
		method536((byte) -33);
	    aClass152_595 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"dr.G(" + arg0 + ')');
	}
    }
    
    public void method537(int arg0, int arg1, int arg2) {
	try {
	    Class51.anInt681 = -1;
	    Class77.anInt1045 = 0;
	    Class131_Sub41_Sub2.anInt6183 = -1;
	    anInt605++;
	    Class127_Sub1.anInt4002 = arg2;
	    Class68.anInt921 = Class183.anInt2618 = arg1;
	    if (arg0 == -1)
		arg0 = 0;
	    Class89.anInt3258 = Class131_Sub41_Sub18.anInt6396 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.V(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static Class130 method538(int arg0, int arg1, Interface4 arg2,
				     Canvas arg3, int arg4, SignLink arg5) {
	try {
	    anInt598++;
	    int i = -46 % ((arg0 - -36) / 56);
	    try {
		Class var_class = Class.forName("Class130_Sub2");
		Constructor constructor
		    = (var_class.getConstructor
		       (new Class[]
			{ (aClass617 != null ? aClass617
			   : (aClass617 = method548("java.awt.Canvas"))),
			  (aClass618 != null ? aClass618
			   : (aClass618 = method548("Interface4"))),
			  Integer.TYPE, Integer.TYPE,
			  (aClass619 != null ? aClass619
			   : (aClass619 = method548("SignLink"))) }));
		return ((Class130)
			constructor.newInstance(new Object[]
						{ arg3, arg2,
						  new Integer(arg1),
						  new Integer(arg4), arg5 }));
	    } catch (Exception exception) {
		throw new RuntimeException();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.AA(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method539(int arg0, byte arg1, int arg2, String arg3, int arg4,
			  int arg5) {
	try {
	    anInt613++;
	    if (arg3 != null && arg1 < -66) {
		method537(arg0, arg4, 0);
		method543(arg5, 0, null, null,
			  -aClass55_603.method621((byte) -91, arg3) + arg2, 0,
			  0, arg3, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.U(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public int method540(Random arg0, int arg1, boolean arg2, int arg3,
			 int arg4, Class152[] arg5, int arg6, int arg7,
			 String arg8, int[] arg9) {
	try {
	    anInt611++;
	    if (arg8 == null)
		return 0;
	    arg0.setSeed((long) arg3);
	    int i = (arg0.nextInt() & 0x1f) + 192;
	    method537(i << -168958216 | 0xffffff & arg6,
		      i << 285940280 | 0xffffff & arg1, 0);
	    int i_31_ = arg8.length();
	    int[] is = new int[i_31_];
	    int i_32_ = 0;
	    for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
		is[i_33_] = i_32_;
		if ((arg0.nextInt() & 0x3 ^ 0xffffffff) == -1)
		    i_32_++;
	    }
	    method526(arg7, arg8, arg4, is, null, arg5, arg2, arg9);
	    return i_32_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.K(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method541(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, String arg6) {
	try {
	    anInt608++;
	    if (arg6 != null) {
		method537(arg4, arg1, arg5 + -237);
		int i = arg6.length();
		int[] is = new int[i];
		if (arg5 != 237)
		    anInt600 = -105;
		for (int i_34_ = 0; i_34_ < i; i_34_++)
		    is[i_34_] = (int) (Math.sin((double) arg2 / 5.0
						+ (double) i_34_ / 2.0)
				       * 5.0);
		method526(arg0, arg6,
			  (-(aClass55_603.method621((byte) 117, arg6) / 2)
			   + arg3),
			  null, is, null, true, null);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ','
						 + (arg6 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static byte method542(char arg0, boolean arg1) {
	try {
	    anInt593++;
	    byte i;
	    if (((arg0 ^ 0xffffffff) >= -1 || (arg0 ^ 0xffffffff) <= -129)
		&& (arg0 < 160 || (arg0 ^ 0xffffffff) < -256)) {
		if ((arg0 ^ 0xffffffff) == -8365)
		    i = (byte) -128;
		else if ((arg0 ^ 0xffffffff) == -8219)
		    i = (byte) -126;
		else if ((arg0 ^ 0xffffffff) != -403) {
		    if ((arg0 ^ 0xffffffff) != -8223) {
			if ((arg0 ^ 0xffffffff) != -8231) {
			    if ((arg0 ^ 0xffffffff) != -8225) {
				if ((arg0 ^ 0xffffffff) == -8226)
				    i = (byte) -121;
				else if ((arg0 ^ 0xffffffff) != -711) {
				    if ((arg0 ^ 0xffffffff) == -8241)
					i = (byte) -119;
				    else if ((arg0 ^ 0xffffffff) != -353) {
					if (arg0 == 8249)
					    i = (byte) -117;
					else if ((arg0 ^ 0xffffffff) == -339)
					    i = (byte) -116;
					else if (arg0 == 381)
					    i = (byte) -114;
					else if ((arg0 ^ 0xffffffff)
						 != -8217) {
					    if ((arg0 ^ 0xffffffff) != -8218) {
						if (arg0 != 8220) {
						    if ((arg0 ^ 0xffffffff)
							== -8222)
							i = (byte) -108;
						    else if (arg0 != 8226) {
							if ((arg0 ^ 0xffffffff)
							    == -8212)
							    i = (byte) -106;
							else if ((arg0
								  ^ 0xffffffff)
								 != -8213) {
							    if (arg0 == 732)
								i = (byte) -104;
							    else if (arg0
								     != 8482) {
								if (arg0
								    != 353) {
								    if ((arg0
									 ^ 0xffffffff)
									!= -8251) {
									if (arg0
									    == 339)
									    i = (byte) -100;
									else if ((arg0 ^ 0xffffffff) != -383) {
									    if ((arg0 ^ 0xffffffff) != -377)
										i = (byte) 63;
									    else
										i = (byte) -97;
									} else
									    i = (byte) -98;
								    } else
									i = (byte) -101;
								} else
								    i = (byte) -102;
							    } else
								i = (byte) -103;
							} else
							    i = (byte) -105;
						    } else
							i = (byte) -107;
						} else
						    i = (byte) -109;
					    } else
						i = (byte) -110;
					} else
					    i = (byte) -111;
				    } else
					i = (byte) -118;
				} else
				    i = (byte) -120;
			    } else
				i = (byte) -122;
			} else
			    i = (byte) -123;
		    } else
			i = (byte) -124;
		} else
		    i = (byte) -125;
	    } else
		i = (byte) arg0;
	    if (arg1 != true)
		method532(null, (byte) -12);
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.CA(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method543(int arg0, int arg1, Class152[] arg2, Class183 arg3,
			  int arg4, int arg5, int arg6, String arg7,
			  int[] arg8) {
	try {
	    arg0 -= aClass55_603.anInt727;
	    anInt597++;
	    int i = -1;
	    int i_35_ = -1;
	    int i_36_ = arg7.length();
	    int i_37_ = arg5;
	    for (/**/; (i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_37_++) {
		char c = (char) (0xff & method542(arg7.charAt(i_37_), true));
		if (c == 60)
		    i = i_37_;
		else {
		    if ((c ^ 0xffffffff) == -63 && i != -1) {
			String string = arg7.substring(1 + i, i_37_);
			i = -1;
			if (!string.equals("lt")) {
			    if (!string.equals("gt")) {
				if (!string.equals("nbsp")) {
				    if (string.equals("shy"))
					c = '\u00ad';
				    else if (string.equals("times"))
					c = '\u00d7';
				    else if (string.equals("euro"))
					c = '\u20ac';
				    else if (!string.equals("copy")) {
					if (!string.equals("reg")) {
					    if (!string.startsWith("img="))
						method531(string, -2033);
					    else {
						try {
						    int i_38_
							= (Class161.method2393
							   (string
								.substring(4),
							    (byte) 20));
						    Class152 class152
							= arg2[i_38_];
						    int i_39_
							= (arg8 == null
							   ? class152
								 .method2198()
							   : arg8[i_38_]);
						    if (((Class68.anInt921
							  & ~0xffffff)
							 ^ 0xffffffff)
							== 16777215)
							class152.method2202
							    (arg4,
							     (-i_39_
							      + (aClass55_603
								 .anInt727)
							      + arg0),
							     0, 0, 1);
						    else
							class152.method2202
							    (arg4,
							     (-i_39_
							      + (aClass55_603
								 .anInt727)
							      + arg0),
							     1,
							     (0xffffff
							      | (~0xffffff
								 & (Class68
								    .anInt921))),
							     1);
						    arg4 += arg2[i_38_]
								.method2216();
						    i_35_ = -1;
						} catch (Exception exception) {
						    /* empty */
						}
					    }
					    continue;
					}
					c = '\u00ae';
				    } else
					c = '\u00a9';
				} else
				    c = '\u00a0';
			    } else
				c = '>';
			} else
			    c = '<';
		    }
		    if ((i ^ 0xffffffff) == 0) {
			if ((i_35_ ^ 0xffffffff) != 0)
			    arg4 += aClass55_603.method613(c, false, i_35_);
			if (c == 32) {
			    if ((Class77.anInt1045 ^ 0xffffffff) < -1) {
				Class127_Sub1.anInt4002 += Class77.anInt1045;
				arg4 += Class127_Sub1.anInt4002 >> 1279236840;
				Class127_Sub1.anInt4002 &= 0xff;
			    }
			} else if (arg3 == null) {
			    if ((Class89.anInt3258 & ~0xffffff ^ 0xffffffff)
				!= -1)
				method544(c, 1 + arg4, 1 + arg0,
					  Class89.anInt3258, true);
			    method544(c, arg4, arg0, Class68.anInt921, false);
			} else {
			    if ((~0xffffff & Class89.anInt3258 ^ 0xffffffff)
				!= -1)
				method534(c, arg4 + 1, 1 + arg0,
					  Class89.anInt3258, true, arg3, arg1,
					  arg6);
			    method534(c, arg4, arg0, Class68.anInt921, false,
				      arg3, arg1, arg6);
			}
			int i_40_ = aClass55_603.method610(c, arg5 + 96);
			if ((Class131_Sub41_Sub2.anInt6183 ^ 0xffffffff) != 0)
			    aClass130_599.method1225
				(arg4, Class131_Sub41_Sub2.anInt6183,
				 (byte) -95, i_40_,
				 ((int) (0.7 * (double) aClass55_603.anInt727)
				  + arg0));
			if (Class51.anInt681 != -1)
			    aClass130_599.method1225(arg4, Class51.anInt681,
						     (byte) -106, i_40_,
						     (aClass55_603.anInt727
						      + arg0 + 1));
			arg4 += i_40_;
			i_35_ = c;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.S(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ arg5 + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ','
			+ (arg8 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public Class44(Class130 arg0, Class55 arg1) {
	try {
	    aClass130_599 = arg0;
	    aClass55_603 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("dr.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public abstract void method544(char c, int i, int i_41_, int i_42_,
				   boolean bool);
    
    public void method545(byte arg0, Class152[] arg1, int arg2, int arg3,
			  int[] arg4, int arg5, String arg6, int arg7) {
	try {
	    anInt604++;
	    if (arg6 != null) {
		if (arg0 != -103)
		    method532(null, (byte) -96);
		method537(arg5, arg2, arg0 + 103);
		method543(arg7, 0, arg1, null,
			  (-(aClass55_603.method621((byte) 89, arg6) / 2)
			   + arg3),
			  0, 0, arg6, arg4);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.T(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ','
			+ arg5 + ',' + (arg6 != null ? "{...}" : "null") + ','
			+ arg7 + ')'));
	}
    }
    
    public void method546(String arg0, int[] arg1, int arg2, byte arg3,
			  int arg4, int arg5, int arg6, Class152[] arg7) {
	try {
	    anInt596++;
	    if (arg0 != null) {
		method537(arg5, arg6, 0);
		method543(arg2, 0, arg7, null,
			  arg4 + -aClass55_603.method621((byte) -127, arg0), 0,
			  0, arg0, arg1);
		int i = 2 / ((-19 - arg3) / 61);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("dr.H(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method547(int arg0, int arg1, String arg2, Class152[] arg3,
			  int[] arg4, int arg5, int arg6, int arg7) {
	do {
	    try {
		anInt601++;
		if (arg2 != null) {
		    method537(arg6, arg0, 0);
		    method543(arg7, 0, arg3, null, arg5, 0, 0, arg2, arg4);
		    if (arg1 == 4712)
			break;
		    aClass55_603 = null;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("dr.N(" + arg0 + ',' + arg1 + ','
			    + (arg2 != null ? "{...}" : "null") + ','
			    + (arg3 != null ? "{...}" : "null") + ','
			    + (arg4 != null ? "{...}" : "null") + ',' + arg5
			    + ',' + arg6 + ',' + arg7 + ')'));
	    }
	    break;
	} while (false);
    }
    
    /*synthetic*/ public static Class method548(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
