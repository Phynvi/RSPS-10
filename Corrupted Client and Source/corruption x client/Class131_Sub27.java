/* Class131_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class131_Sub27 extends Class131
{
    public static int anInt4483;
    public static int anInt4484;
    public static int anInt4485;
    public static String[] aStringArray4486 = new String[100];
    public static int anInt4487;
    public static String aString4488 = null;
    public static int anInt4489;
    public static int anInt4490;
    public static int anInt4491 = 0;
    public static int anInt4492;
    
    public static void method1835(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class169.aClass119_2266.method1007(arg2 ^ arg2));
		 class131_sub19 != null;
		 class131_sub19
		     = ((Class131_Sub19)
			Class169.aClass119_2266.method1014(arg2 ^ 0x40)))
		Class131_Sub8_Sub1.method1681(arg0, arg1, class131_sub19, arg4,
					      119, arg3);
	    anInt4483++;
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub4.aClass119_4133.method1007(0));
		 class131_sub19 != null;
		 class131_sub19 = (Class131_Sub19) Class131_Sub4
						       .aClass119_4133
						       .method1014(0)) {
		int i = 1;
		Class72 class72 = class131_sub19
				      .aClass23_Sub4_Sub1_Sub1_4410
				      .method344(arg2 ^ 0x37);
		if (!class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
		     .aBoolean5261) {
		    if (((class72.anInt976 ^ 0xffffffff)
			 == ((class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
			      .anInt5254)
			     ^ 0xffffffff))
			|| class72.anInt960 == (class131_sub19
						.aClass23_Sub4_Sub1_Sub1_4410
						.anInt5254)
			|| class72.anInt957 == (class131_sub19
						.aClass23_Sub4_Sub1_Sub1_4410
						.anInt5254)
			|| ((class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
			     .anInt5254)
			    ^ 0xffffffff) == (class72.anInt985 ^ 0xffffffff))
			i = 2;
		    else if (class72.anInt974 == (class131_sub19
						  .aClass23_Sub4_Sub1_Sub1_4410
						  .anInt5254)
			     || (((class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
				   .anInt5254)
				  ^ 0xffffffff)
				 == (class72.anInt987 ^ 0xffffffff))
			     || ((class72.anInt977 ^ 0xffffffff)
				 == ((class131_sub19
				      .aClass23_Sub4_Sub1_Sub1_4410.anInt5254)
				     ^ 0xffffffff))
			     || (class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
				 .anInt5254) == class72.anInt986)
			i = 3;
		} else
		    i = 0;
		if (i != class131_sub19.anInt4403) {
		    int i_0_
			= Class220.method2825(arg2 + -148,
					      (class131_sub19
					       .aClass23_Sub4_Sub1_Sub1_4410));
		    if (i_0_ != class131_sub19.anInt4401) {
			if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
			    Class78.aClass131_Sub1_Sub3_1057.method1441
				(class131_sub19.aClass131_Sub1_Sub2_4393);
			    class131_sub19.aClass131_Sub1_Sub2_4393 = null;
			}
			class131_sub19.anInt4401 = i_0_;
		    }
		    class131_sub19.anInt4403 = i;
		}
		class131_sub19.anInt4415
		    = class131_sub19.aClass23_Sub4_Sub1_Sub1_4410.anInt3733;
		class131_sub19.anInt4411
		    = (class131_sub19.aClass23_Sub4_Sub1_Sub1_4410.anInt3733
		       - -(class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
			       .method335((byte) -121)
			   * 64));
		class131_sub19.anInt4407
		    = class131_sub19.aClass23_Sub4_Sub1_Sub1_4410.anInt3747;
		class131_sub19.anInt4413
		    = (class131_sub19.aClass23_Sub4_Sub1_Sub1_4410.anInt3747
		       + 64 * class131_sub19.aClass23_Sub4_Sub1_Sub1_4410
				  .method335((byte) -38));
		Class131_Sub8_Sub1.method1681(arg0, arg1, class131_sub19, arg4,
					      arg2 ^ 0x7e, arg3);
	    }
	    for (Class131_Sub19 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub23.aClass180_4460.method2520(0));
		 class131_sub19 != null;
		 class131_sub19
		     = ((Class131_Sub19)
			Class131_Sub23.aClass180_4460.method2518(0))) {
		int i = 1;
		Class72 class72 = class131_sub19
				      .aClass23_Sub4_Sub1_Sub2_4398
				      .method344(99);
		if (!class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
		     .aBoolean5261) {
		    if ((class131_sub19.aClass23_Sub4_Sub1_Sub2_4398.anInt5254
			 == class72.anInt976)
			|| class72.anInt960 == (class131_sub19
						.aClass23_Sub4_Sub1_Sub2_4398
						.anInt5254)
			|| class72.anInt957 == (class131_sub19
						.aClass23_Sub4_Sub1_Sub2_4398
						.anInt5254)
			|| ((class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
			     .anInt5254)
			    ^ 0xffffffff) == (class72.anInt985 ^ 0xffffffff))
			i = 2;
		    else if ((class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
			      .anInt5254) == class72.anInt974
			     || (((class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
				   .anInt5254)
				  ^ 0xffffffff)
				 == (class72.anInt987 ^ 0xffffffff))
			     || (class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
				 .anInt5254) == class72.anInt977
			     || (class72.anInt986
				 == (class131_sub19
				     .aClass23_Sub4_Sub1_Sub2_4398.anInt5254)))
			i = 3;
		} else
		    i = 0;
		if ((i ^ 0xffffffff)
		    != (class131_sub19.anInt4403 ^ 0xffffffff)) {
		    int i_1_
			= (Class131_Sub2_Sub30.method1615
			   (class131_sub19.aClass23_Sub4_Sub1_Sub2_4398, 10));
		    if (i_1_ != class131_sub19.anInt4401) {
			if (class131_sub19.aClass131_Sub1_Sub2_4393 != null) {
			    Class78.aClass131_Sub1_Sub3_1057.method1441
				(class131_sub19.aClass131_Sub1_Sub2_4393);
			    class131_sub19.aClass131_Sub1_Sub2_4393 = null;
			}
			class131_sub19.anInt4401 = i_1_;
		    }
		    class131_sub19.anInt4403 = i;
		}
		class131_sub19.anInt4415
		    = class131_sub19.aClass23_Sub4_Sub1_Sub2_4398.anInt3733;
		class131_sub19.anInt4411
		    = (class131_sub19.aClass23_Sub4_Sub1_Sub2_4398.anInt3733
		       + 64 * class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
				  .method335((byte) -63));
		class131_sub19.anInt4407
		    = class131_sub19.aClass23_Sub4_Sub1_Sub2_4398.anInt3747;
		class131_sub19.anInt4413
		    = (class131_sub19.aClass23_Sub4_Sub1_Sub2_4398.anInt3747
		       - -(class131_sub19.aClass23_Sub4_Sub1_Sub2_4398
			       .method335((byte) -92)
			   * 64));
		Class131_Sub8_Sub1.method1681(arg0, arg1, class131_sub19, arg4,
					      arg2 + -142, arg3);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qm.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1836(byte arg0, int arg1) {
	try {
	    anInt4487++;
	    Class131_Sub13 class131_sub13
		= ((Class131_Sub13)
		   Class23_Sub5_Sub1.aClass180_5041.method2521(68,
							       (long) arg1));
	    if (class131_sub13 != null && arg0 == -121)
		class131_sub13.method1355((byte) 118);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qm.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1837(byte arg0) {
	try {
	    aString4488 = null;
	    if (arg0 != -53)
		method1840(106, 9);
	    aStringArray4486 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qm.B(" + arg0 + ')');
	}
    }
    
    public static void method1838(boolean arg0, boolean arg1, int arg2) {
	try {
	    if (arg0) {
		Class18.anInt189--;
		if ((Class18.anInt189 ^ 0xffffffff) == -1)
		    Class131_Sub2_Sub37.anIntArray6058 = null;
	    }
	    if (arg2 != -1)
		aString4488 = null;
	    if (arg1) {
		Class116.anInt1509--;
		if (Class116.anInt1509 == 0)
		    Class88.anIntArray1171 = null;
	    }
	    anInt4492++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qm.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1839(int arg0, int arg1, int arg2, int arg3) {
	anInt4489++;
	Class131_Sub41_Sub6 class131_sub41_sub6
	    = Class131_Sub13.method1709(11, arg3, (byte) 1);
	class131_sub41_sub6.method1962(arg1 + -64);
	class131_sub41_sub6.anInt6244 = arg0;
	class131_sub41_sub6.anInt6234 = arg2;
	if (arg1 != 64)
	    method1838(true, true, -7);
    }
    
    public static int method1840(int arg0, int arg1) {
	try {
	    if (arg0 != -10210)
		aStringArray4486 = null;
	    anInt4485++;
	    return 0xff & arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qm.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1841(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    anInt4484++;
	    Login.method1150(arg2, (byte) 126);
	    int i = 0;
	    int i_2_ = arg2 + -arg3;
	    if ((i_2_ ^ 0xffffffff) > -1)
		i_2_ = 0;
	    int i_3_ = arg2;
	    if (arg0 > -90)
		aStringArray4486 = null;
	    int i_4_ = -arg2;
	    int i_5_ = i_2_;
	    int i_6_ = -i_2_;
	    int i_7_ = -1;
	    int i_8_ = -1;
	    if ((Class116.anInt1494 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
		&& Class125.anInt1629 >= arg1) {
		int[] is = Class56.anIntArrayArray740[arg1];
		int i_9_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg4 - arg2);
		int i_10_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg4 + arg2);
		int i_11_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg4 - i_2_);
		int i_12_
		    = Class180.method2517(-15543, Class115.anInt1477,
					  Class149.anInt1988, arg4 - -i_2_);
		Class131_Sub3.method1650(i_11_, is, arg5, i_9_, 61);
		Class131_Sub3.method1650(i_12_, is, arg6, i_11_, 92);
		Class131_Sub3.method1650(i_10_, is, arg5, i_12_, 86);
	    }
	    while ((i_3_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
		i_7_ += 2;
		i_8_ += 2;
		i_6_ += i_8_;
		i_4_ += i_7_;
		if ((i_6_ ^ 0xffffffff) <= -1 && i_5_ >= 1) {
		    i_5_--;
		    Class113.anIntArray1462[i_5_] = i;
		    i_6_ -= i_5_ << 1339805313;
		}
		i++;
		if (i_4_ >= 0) {
		    i_3_--;
		    i_4_ -= i_3_ << 1479888609;
		    int i_13_ = -i_3_ + arg1;
		    int i_14_ = i_3_ + arg1;
		    if (Class116.anInt1494 <= i_14_
			&& i_13_ <= Class125.anInt1629) {
			if ((i_3_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff)) {
			    int i_15_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    i + arg4);
			    int i_16_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    arg4 + -i);
			    if (Class125.anInt1629 >= i_14_)
				Class131_Sub3.method1650(i_15_,
							 (Class56
							  .anIntArrayArray740
							  [i_14_]),
							 arg5, i_16_, 113);
			    if ((Class116.anInt1494 ^ 0xffffffff)
				>= (i_13_ ^ 0xffffffff))
				Class131_Sub3.method1650(i_15_,
							 (Class56
							  .anIntArrayArray740
							  [i_13_]),
							 arg5, i_16_, 100);
			} else {
			    int i_17_ = Class113.anIntArray1462[i_3_];
			    int i_18_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    i + arg4);
			    int i_19_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    arg4 - i);
			    int i_20_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    arg4 + i_17_);
			    int i_21_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    -i_17_ + arg4);
			    if ((i_14_ ^ 0xffffffff)
				>= (Class125.anInt1629 ^ 0xffffffff)) {
				int[] is = Class56.anIntArrayArray740[i_14_];
				Class131_Sub3.method1650(i_21_, is, arg5,
							 i_19_, 78);
				Class131_Sub3.method1650(i_20_, is, arg6,
							 i_21_, 71);
				Class131_Sub3.method1650(i_18_, is, arg5,
							 i_20_, 84);
			    }
			    if (Class116.anInt1494 <= i_13_) {
				int[] is = Class56.anIntArrayArray740[i_13_];
				Class131_Sub3.method1650(i_21_, is, arg5,
							 i_19_, 75);
				Class131_Sub3.method1650(i_20_, is, arg6,
							 i_21_, 63);
				Class131_Sub3.method1650(i_18_, is, arg5,
							 i_20_, 76);
			    }
			}
		    }
		}
		int i_22_ = -i + arg1;
		int i_23_ = arg1 - -i;
		if (i_23_ >= Class116.anInt1494
		    && Class125.anInt1629 >= i_22_) {
		    int i_24_ = arg4 + i_3_;
		    int i_25_ = -i_3_ + arg4;
		    if ((i_24_ ^ 0xffffffff) <= (Class149.anInt1988
						 ^ 0xffffffff)
			&& i_25_ <= Class115.anInt1477) {
			i_24_ = Class180.method2517(-15543, Class115.anInt1477,
						    Class149.anInt1988, i_24_);
			i_25_ = Class180.method2517(-15543, Class115.anInt1477,
						    Class149.anInt1988, i_25_);
			if ((i_2_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
			    int i_26_
				= i > i_5_ ? Class113.anIntArray1462[i] : i_5_;
			    int i_27_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    arg4 + i_26_);
			    int i_28_ = Class180.method2517(-15543,
							    Class115.anInt1477,
							    Class149.anInt1988,
							    -i_26_ + arg4);
			    if (i_23_ <= Class125.anInt1629) {
				int[] is = Class56.anIntArrayArray740[i_23_];
				Class131_Sub3.method1650(i_28_, is, arg5,
							 i_25_, 127);
				Class131_Sub3.method1650(i_27_, is, arg6,
							 i_28_, 73);
				Class131_Sub3.method1650(i_24_, is, arg5,
							 i_27_, 77);
			    }
			    if ((i_22_ ^ 0xffffffff)
				<= (Class116.anInt1494 ^ 0xffffffff)) {
				int[] is = Class56.anIntArrayArray740[i_22_];
				Class131_Sub3.method1650(i_28_, is, arg5,
							 i_25_, 111);
				Class131_Sub3.method1650(i_27_, is, arg6,
							 i_28_, 103);
				Class131_Sub3.method1650(i_24_, is, arg5,
							 i_27_, 81);
			    }
			} else {
			    if (i_23_ <= Class125.anInt1629)
				Class131_Sub3.method1650(i_24_,
							 (Class56
							  .anIntArrayArray740
							  [i_23_]),
							 arg5, i_25_, 80);
			    if (Class116.anInt1494 <= i_22_)
				Class131_Sub3.method1650(i_24_,
							 (Class56
							  .anIntArrayArray740
							  [i_22_]),
							 arg5, i_25_, 94);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("qm.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
}
