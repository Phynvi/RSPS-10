/* Class22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class22_Sub1 extends Class22
{
    public static int anInt3653;
    public static int anInt3654;
    public static int anInt3655;
    public int anInt3656 = 0;
    public Class220 aClass220_3657;
    public static int anInt3658;
    public static int anInt3659;
    public int anInt3660;
    public Class85 aClass85_3661;
    public static int anInt3662;
    public static int anInt3663;
    public Class131_Sub41_Sub21 aClass131_Sub41_Sub21_3664;
    public Class180 aClass180_3665 = new Class180(16);
    public static Class173 aClass173_3666 = null;
    public static int anInt3667;
    public static int anInt3668;
    public int anInt3669;
    public static int anInt3670;
    public Class85 aClass85_3671;
    public static int anInt3672;
    public static int anInt3673;
    public byte[] aByteArray3674;
    public static int anInt3675;
    public static int anInt3676;
    public int anInt3677;
    public static int anInt3678;
    public static int anInt3679;
    public static int anInt3680;
    public static int anInt3681;
    public static int anInt3682;
    public Class179 aClass179_3683;
    public static int anInt3684;
    public static int anInt3685;
    public Class88 aClass88_3686;
    public Class119 aClass119_3687;
    public static int anInt3688;
    public Class119 aClass119_3689;
    public boolean aBoolean3690;
    public int anInt3691 = 0;
    public static int anInt3692;
    public boolean aBoolean3693;
    public boolean aBoolean3694;
    public long aLong3695;
    
    public void method269(boolean arg0) {
	anInt3658++;
	if (aClass119_3687 != null) {
	    if (method263(255) == null)
		return;
	    if (aBoolean3693) {
		boolean bool = true;
		for (Class131 class131 = aClass119_3687.method1007(0);
		     class131 != null;
		     class131 = aClass119_3687.method1014(0)) {
		    int i = (int) class131.aLong1791;
		    if (aByteArray3674[i] == 0)
			method279(i, 126, 1);
		    if ((aByteArray3674[i] ^ 0xffffffff) != -1)
			class131.method1355((byte) 119);
		    else
			bool = false;
		}
		while ((aClass220_3657.anIntArray3223.length ^ 0xffffffff)
		       < (anInt3691 ^ 0xffffffff)) {
		    if (aClass220_3657.anIntArray3223[anInt3691] == 0)
			anInt3691++;
		    else {
			if ((aClass88_3686.anInt1168 ^ 0xffffffff) <= -251) {
			    bool = false;
			    break;
			}
			if (aByteArray3674[anInt3691] == 0)
			    method279(anInt3691, 127, 1);
			if ((aByteArray3674[anInt3691] ^ 0xffffffff) == -1) {
			    Class131 class131 = new Class131();
			    class131.aLong1791 = (long) anInt3691;
			    aClass119_3687.method1018((byte) -122, class131);
			    bool = false;
			}
			anInt3691++;
		    }
		}
		if (bool) {
		    aBoolean3693 = false;
		    anInt3691 = 0;
		}
	    } else if (!aBoolean3690)
		aClass119_3687 = null;
	    else {
		boolean bool = true;
		for (Class131 class131 = aClass119_3687.method1007(0);
		     class131 != null;
		     class131 = aClass119_3687.method1014(0)) {
		    int i = (int) class131.aLong1791;
		    if ((aByteArray3674[i] ^ 0xffffffff) != -2)
			method279(i, 127, 2);
		    if ((aByteArray3674[i] ^ 0xffffffff) == -2)
			class131.method1355((byte) 120);
		    else
			bool = false;
		}
		while (aClass220_3657.anIntArray3223.length > anInt3691) {
		    if ((aClass220_3657.anIntArray3223[anInt3691] ^ 0xffffffff)
			== -1)
			anInt3691++;
		    else {
			if (aClass179_3683.method2507((byte) -110)) {
			    bool = false;
			    break;
			}
			if (aByteArray3674[anInt3691] != 1)
			    method279(anInt3691, 126, 2);
			if ((aByteArray3674[anInt3691] ^ 0xffffffff) != -2) {
			    Class131 class131 = new Class131();
			    class131.aLong1791 = (long) anInt3691;
			    aClass119_3687.method1018((byte) -127, class131);
			    bool = false;
			}
			anInt3691++;
		    }
		}
		if (bool) {
		    anInt3691 = 0;
		    aBoolean3690 = false;
		}
	    }
	}
	if (aBoolean3694 && aLong3695 <= Class208.method2749(-3913)) {
	    for (Class131_Sub41_Sub21 class131_sub41_sub21
		     = (Class131_Sub41_Sub21) aClass180_3665.method2520(0);
		 class131_sub41_sub21 != null;
		 class131_sub41_sub21
		     = (Class131_Sub41_Sub21) aClass180_3665.method2518(0)) {
		if (!class131_sub41_sub21.aBoolean6440) {
		    if (!class131_sub41_sub21.aBoolean6443)
			class131_sub41_sub21.aBoolean6443 = true;
		    else {
			if (!class131_sub41_sub21.aBoolean6439)
			    throw new RuntimeException();
			class131_sub41_sub21.method1355((byte) 125);
		    }
		}
	    }
	    aLong3695 = Class208.method2749(-3913) - -1000L;
	}
	if (arg0 != false)
	    method263(19);
    }
    
    public int method270(int arg0) {
	try {
	    anInt3679++;
	    if (method263(arg0 + 255) == null) {
		if (aClass131_Sub41_Sub21_3664 == null)
		    return 0;
		return aClass131_Sub41_Sub21_3664.method2075(arg0 + 2);
	    }
	    if (arg0 != 0)
		return 80;
	    return 100;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.J(" + arg0 + ')');
	}
    }
    
    public static void method271(Component arg0, byte arg1) {
	try {
	    anInt3663++;
	    arg0.removeKeyListener(Class131_Sub2_Sub35.aClass28_6038);
	    if (arg1 == 2) {
		arg0.removeFocusListener(Class131_Sub2_Sub35.aClass28_6038);
		Class23_Sub2_Sub1.anInt4989 = -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.N("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method272(int arg0, int arg1, int arg2, short[] arg3,
				 String[] arg4) {
	do {
	    try {
		if (arg2 > arg0) {
		    int i = (arg0 + arg2) / 2;
		    int i_0_ = arg0;
		    String string = arg4[i];
		    arg4[i] = arg4[arg2];
		    arg4[arg2] = string;
		    short i_1_ = arg3[i];
		    arg3[i] = arg3[arg2];
		    arg3[arg2] = i_1_;
		    for (int i_2_ = arg0; arg2 > i_2_; i_2_++) {
			if (string == null
			    || (arg4[i_2_] != null
				&& ((0x1 & i_2_ ^ 0xffffffff)
				    < (arg4[i_2_].compareTo(string)
				       ^ 0xffffffff)))) {
			    String string_3_ = arg4[i_2_];
			    arg4[i_2_] = arg4[i_0_];
			    arg4[i_0_] = string_3_;
			    short i_4_ = arg3[i_2_];
			    arg3[i_2_] = arg3[i_0_];
			    arg3[i_0_++] = i_4_;
			}
		    }
		    arg4[arg2] = arg4[i_0_];
		    arg4[i_0_] = string;
		    arg3[arg2] = arg3[i_0_];
		    arg3[i_0_] = i_1_;
		    method272(arg0, 82, i_0_ - 1, arg3, arg4);
		    method272(i_0_ - -1, 74, arg2, arg3, arg4);
		}
		anInt3675++;
		if (arg1 > 70)
		    break;
		aClass173_3666 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("kk.W(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + (arg3 != null ? "{...}"
							: "null")
						     + ','
						     + (arg4 != null ? "{...}"
							: "null")
						     + ')'));
	    }
	    break;
	} while (false);
    }
    
    public int method273(boolean arg0) {
	try {
	    anInt3684++;
	    if (arg0 != true)
		aClass180_3665 = null;
	    return anInt3656;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.Q(" + arg0 + ')');
	}
    }
    
    public static void method274(boolean arg0) {
	try {
	    if (arg0 == false) {
		anInt3688++;
		Class23_Sub5_Sub1.aClass180_5041.method2519(105);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.S(" + arg0 + ')');
	}
    }
    
    public byte[] method265(byte arg0, int arg1) {
	try {
	    anInt3681++;
	    Class131_Sub41_Sub21 class131_sub41_sub21
		= method279(arg1, 127, 0);
	    if (class131_sub41_sub21 == null)
		return null;
	    byte[] is = class131_sub41_sub21.method2073(6);
	    if (arg0 < 84)
		return null;
	    class131_sub41_sub21.method1355((byte) 117);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class92 method275(int arg0, byte arg1) {
	try {
	    anInt3673++;
	    Class92 class92 = (Class92) Class131_Sub2_Sub17.aClass214_5811
					    .method2780(118, (long) arg0);
	    if (class92 != null)
		return class92;
	    byte[] is = Class153_Sub1.aClass158_4756.method2364(arg0, 35, 0);
	    if (arg1 < 122)
		return null;
	    class92 = new Class92();
	    if (is != null)
		class92.method849(new Stream(is), -128);
	    class92.method846(true);
	    Class131_Sub2_Sub17.aClass214_5811.method2773(true, class92,
							  (long) arg0);
	    return class92;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.T(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method276(byte arg0) {
	anInt3662++;
	int i = 29 % ((arg0 - 77) / 40);
	if (aClass85_3661 != null) {
	    aBoolean3690 = true;
	    if (aClass119_3687 == null)
		aClass119_3687 = new Class119();
	}
    }
    
    public void method277(byte arg0) {
	anInt3667++;
	if (aClass119_3687 != null && method263(255) != null) {
	    for (Class131 class131 = aClass119_3689.method1007(0);
		 class131 != null;
		 class131 = aClass119_3689.method1014(arg0 + -2)) {
		int i = (int) class131.aLong1791;
		if ((i ^ 0xffffffff) > -1 || aClass220_3657.anInt3213 <= i
		    || aClass220_3657.anIntArray3223[i] == 0)
		    class131.method1355((byte) 116);
		else {
		    if ((aByteArray3674[i] ^ 0xffffffff) == -1)
			method279(i, 126, 1);
		    if (aByteArray3674[i] == -1)
			method279(i, 127, 2);
		    if (aByteArray3674[i] == 1)
			class131.method1355((byte) 123);
		}
	    }
	    if (arg0 != 2)
		method264(-119, -83);
	}
    }
    
    public static void method278(int arg0) {
	try {
	    if (arg0 <= 34)
		method285(-72, -89);
	    anInt3692++;
	    Class131_Sub2_Sub2.aClass214_5575.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.I(" + arg0 + ')');
	}
    }
    
    public Class131_Sub41_Sub21 method279(int arg0, int arg1, int arg2) {
	try {
	    anInt3655++;
	    Class131_Sub41_Sub21 class131_sub41_sub21
		= ((Class131_Sub41_Sub21)
		   aClass180_3665.method2521(-122, (long) arg0));
	    if (class131_sub41_sub21 != null && arg2 == 0
		&& !class131_sub41_sub21.aBoolean6439
		&& class131_sub41_sub21.aBoolean6440) {
		class131_sub41_sub21.method1355((byte) 125);
		class131_sub41_sub21 = null;
	    }
	    if (arg1 <= 125)
		aBoolean3693 = true;
	    if (class131_sub41_sub21 == null) {
		if ((arg2 ^ 0xffffffff) != -1) {
		    if (arg2 != 1) {
			if (arg2 == 2) {
			    if (aClass85_3661 == null)
				throw new RuntimeException();
			    if ((aByteArray3674[arg0] ^ 0xffffffff) != 0)
				throw new RuntimeException();
			    if (!aClass179_3683.method2507((byte) -105))
				class131_sub41_sub21
				    = aClass179_3683.method2504(arg0, false,
								(byte) 2,
								anInt3660, 20);
			    else
				return null;
			} else
			    throw new RuntimeException();
		    } else {
			if (aClass85_3661 == null)
			    throw new RuntimeException();
			class131_sub41_sub21
			    = aClass88_3686.method833(3, arg0, aClass85_3661);
		    }
		} else if (aClass85_3661 == null
			   || (aByteArray3674[arg0] ^ 0xffffffff) == 0) {
		    if (aClass179_3683.method2505(-27332))
			return null;
		    class131_sub41_sub21
			= aClass179_3683.method2504(arg0, true, (byte) 2,
						    anInt3660, 20);
		} else
		    class131_sub41_sub21
			= aClass88_3686.method831((byte) -49, arg0,
						  aClass85_3661);
		aClass180_3665.method2523(false, (long) arg0,
					  class131_sub41_sub21);
	    }
	    if (class131_sub41_sub21.aBoolean6440)
		return null;
	    byte[] is = class131_sub41_sub21.method2073(6);
	    if (class131_sub41_sub21 instanceof Class131_Sub41_Sub21_Sub2) {
		try {
		    if (is == null || is.length <= 2)
			throw new RuntimeException();
		    Class131_Sub41_Sub21_Sub1.aCRC32_6580.reset();
		    Class131_Sub41_Sub21_Sub1.aCRC32_6580
			.update(is, 0, is.length - 2);
		    int i = (int) Class131_Sub41_Sub21_Sub1.aCRC32_6580
				      .getValue();
		    if (aClass220_3657.anIntArray3232[arg0] != i)
			throw new RuntimeException();
		    int i_5_ = ((0xff00 & is[is.length + -2] << 1316858600)
				+ (is[-1 + is.length] & 0xff));
		    if ((aClass220_3657.anIntArray3227[arg0] & 0xffff
			 ^ 0xffffffff)
			!= (i_5_ ^ 0xffffffff))
			throw new RuntimeException();
		    if (aByteArray3674[arg0] != 1) {
			anInt3656++;
			aByteArray3674[arg0] = (byte) 1;
		    }
		    if (!class131_sub41_sub21.aBoolean6439)
			class131_sub41_sub21.method1355((byte) 125);
		    return class131_sub41_sub21;
		} catch (Exception exception) {
		    aByteArray3674[arg0] = (byte) -1;
		    class131_sub41_sub21.method1355((byte) 117);
		    if (class131_sub41_sub21.aBoolean6439
			&& !aClass179_3683.method2505(-27332)) {
			Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
			    = aClass179_3683.method2504(arg0, true, (byte) 2,
							anInt3660, 20);
			aClass180_3665.method2523(false, (long) arg0,
						  class131_sub41_sub21_sub1);
		    }
		    return null;
		}
	    }
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		Class131_Sub41_Sub21_Sub1.aCRC32_6580.reset();
		Class131_Sub41_Sub21_Sub1.aCRC32_6580.update(is, 0,
							     is.length - 2);
		int i = (int) Class131_Sub41_Sub21_Sub1.aCRC32_6580.getValue();
		if (i != aClass220_3657.anIntArray3232[arg0])
		    throw new RuntimeException();
		aClass179_3683.anInt2566 = 0;
		aClass179_3683.anInt2568 = 0;
	    } catch (RuntimeException runtimeexception) {
		aClass179_3683.method2500(true);
		class131_sub41_sub21.method1355((byte) 121);
		if (class131_sub41_sub21.aBoolean6439
		    && !aClass179_3683.method2505(-27332)) {
		    Class131_Sub41_Sub21_Sub1 class131_sub41_sub21_sub1
			= aClass179_3683.method2504(arg0, true, (byte) 2,
						    anInt3660, 20);
		    aClass180_3665.method2523(false, (long) arg0,
					      class131_sub41_sub21_sub1);
		}
		return null;
	    }
	    is[is.length + -2]
		= (byte) (aClass220_3657.anIntArray3227[arg0] >>> 270980424);
	    is[-1 + is.length] = (byte) aClass220_3657.anIntArray3227[arg0];
	    if (aClass85_3661 != null) {
		aClass88_3686.method829(arg0, aClass85_3661, -31152, is);
		if ((aByteArray3674[arg0] ^ 0xffffffff) != -2) {
		    anInt3656++;
		    aByteArray3674[arg0] = (byte) 1;
		}
	    }
	    if (!class131_sub41_sub21.aBoolean6439)
		class131_sub41_sub21.method1355((byte) 115);
	    return class131_sub41_sub21;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.K(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int method266(byte arg0, int arg1) {
	try {
	    anInt3676++;
	    if (arg0 != 22)
		aByteArray3674 = null;
	    Class131_Sub41_Sub21 class131_sub41_sub21
		= ((Class131_Sub41_Sub21)
		   aClass180_3665.method2521(-90, (long) arg1));
	    if (class131_sub41_sub21 != null)
		return class131_sub41_sub21.method2075(2);
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static int method280(int arg0, boolean arg1, byte[][] arg2,
				byte[] arg3, int arg4, int[] arg5,
				byte[][] arg6, int[] arg7) {
	try {
	    anInt3680++;
	    int i = arg7[arg0];
	    int i_6_ = arg5[arg0] + i;
	    if (arg1 != false)
		method283(26, -32, 94, 98, -77);
	    int i_7_ = arg7[arg4];
	    int i_8_ = arg5[arg4] + i_7_;
	    int i_9_ = i;
	    if ((i_7_ ^ 0xffffffff) < (i ^ 0xffffffff))
		i_9_ = i_7_;
	    int i_10_ = i_6_;
	    if ((i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
		i_10_ = i_8_;
	    int i_11_ = arg3[arg0] & 0xff;
	    if ((i_11_ ^ 0xffffffff) < (0xff & arg3[arg4] ^ 0xffffffff))
		i_11_ = 0xff & arg3[arg4];
	    byte[] is = arg2[arg0];
	    byte[] is_12_ = arg6[arg4];
	    int i_13_ = i_9_ + -i;
	    int i_14_ = i_9_ + -i_7_;
	    for (int i_15_ = i_9_; (i_10_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
		 i_15_++) {
		int i_16_ = is_12_[i_14_++] + is[i_13_++];
		if ((i_11_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff))
		    i_11_ = i_16_;
	    }
	    return -i_11_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("kk.V(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method281(int arg0) {
	try {
	    aClass173_3666 = null;
	    int i = 61 / ((-11 - arg0) / 57);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.AA(" + arg0 + ')');
	}
    }
    
    public int method282(int arg0) {
	try {
	    anInt3654++;
	    if (arg0 != 0)
		method273(true);
	    if (aClass220_3657 == null)
		return 0;
	    return aClass220_3657.anInt3224;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.U(" + arg0 + ')');
	}
    }
    
    public void method264(int arg0, int arg1) {
	try {
	    anInt3672++;
	    if (aClass85_3661 != null && arg0 == 7355) {
		for (Class131 class131 = aClass119_3689.method1007(0);
		     class131 != null;
		     class131 = aClass119_3689.method1014(0)) {
		    if (((long) arg1 ^ 0xffffffffffffffffL)
			== (class131.aLong1791 ^ 0xffffffffffffffffL))
			return;
		}
		Class131 class131 = new Class131();
		class131.aLong1791 = (long) arg1;
		aClass119_3689.method1018((byte) -128, class131);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method283(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt3685++;
	    int i = 0;
	    int i_17_ = arg4;
	    int i_18_ = -arg4;
	    int i_19_ = -122 / ((29 - arg2) / 55);
	    int i_20_ = -1;
	    Class131_Sub3.method1650(arg0 + arg4,
				     Class56.anIntArrayArray740[arg1], arg3,
				     -arg4 + arg0, 110);
	    while (i < i_17_) {
		i_20_ += 2;
		i++;
		i_18_ += i_20_;
		if (i_18_ >= 0) {
		    i_17_--;
		    i_18_ -= i_17_ << 1691894177;
		    int[] is = Class56.anIntArrayArray740[i_17_ + arg1];
		    int[] is_21_ = Class56.anIntArrayArray740[arg1 - i_17_];
		    int i_22_ = arg0 + i;
		    int i_23_ = arg0 - i;
		    Class131_Sub3.method1650(i_22_, is, arg3, i_23_, 118);
		    Class131_Sub3.method1650(i_22_, is_21_, arg3, i_23_, 127);
		}
		int i_24_ = arg0 + i_17_;
		int i_25_ = -i_17_ + arg0;
		int[] is = Class56.anIntArrayArray740[i + arg1];
		int[] is_26_ = Class56.anIntArrayArray740[arg1 + -i];
		Class131_Sub3.method1650(i_24_, is, arg3, i_25_, 110);
		Class131_Sub3.method1650(i_24_, is_26_, arg3, i_25_, 62);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.O(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public int method284(int arg0) {
	try {
	    anInt3670++;
	    if (aClass220_3657 == null)
		return 0;
	    if (!aBoolean3693)
		return aClass220_3657.anInt3224;
	    if (arg0 < 45)
		method277((byte) 118);
	    Class131 class131 = aClass119_3687.method1007(0);
	    if (class131 == null)
		return 0;
	    return (int) class131.aLong1791;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.R(" + arg0 + ')');
	}
    }
    
    public static int method285(int arg0, int arg1) {
	try {
	    anInt3682++;
	    if (arg1 > -42)
		method285(86, -71);
	    if (Class128_Sub1.aClass33_4013 != null) {
		Class128_Sub1.aClass33_4013.method452(-1);
		Class128_Sub1.aClass33_4013 = null;
	    }
	    Class183_Sub1.anInt4964++;
	    if ((Class183_Sub1.anInt4964 ^ 0xffffffff) < -5) {
		Class183_Sub1.anInt4964 = 0;
		Class66.anInt878 = 0;
		return arg0;
	    }
	    Class66.anInt878 = 0;
	    if (Class147.anInt1960 == Class131_Sub41_Sub20.anInt6436)
		Class147.anInt1960 = Class91.anInt1183;
	    else
		Class147.anInt1960 = Class131_Sub41_Sub20.anInt6436;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kk.L(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class220 method263(int arg0) {
	try {
	    anInt3678++;
	    if (aClass220_3657 != null)
		return aClass220_3657;
	    if (aClass131_Sub41_Sub21_3664 == null) {
		if (aClass179_3683.method2505(-27332))
		    return null;
		aClass131_Sub41_Sub21_3664
		    = aClass179_3683.method2504(anInt3660, true, (byte) 0, 255,
						20);
	    }
	    if (arg0 != 255)
		method263(6);
	    if (aClass131_Sub41_Sub21_3664.aBoolean6440)
		return null;
	    byte[] is = aClass131_Sub41_Sub21_3664.method2073(6);
	    if (!(aClass131_Sub41_Sub21_3664
		  instanceof Class131_Sub41_Sub21_Sub2)) {
		try {
		    if (is == null)
			throw new RuntimeException();
		    aClass220_3657 = new Class220(is, anInt3677);
		} catch (RuntimeException runtimeexception) {
		    aClass179_3683.method2500(true);
		    aClass220_3657 = null;
		    if (aClass179_3683.method2505(-27332))
			aClass131_Sub41_Sub21_3664 = null;
		    else
			aClass131_Sub41_Sub21_3664
			    = aClass179_3683.method2504(anInt3660, true,
							(byte) 0, 255, 20);
		    return null;
		}
		if (aClass85_3671 != null)
		    aClass88_3686.method829(anInt3660, aClass85_3671,
					    arg0 + -31407, is);
	    } else {
		try {
		    if (is == null)
			throw new RuntimeException();
		    aClass220_3657 = new Class220(is, anInt3677);
		    if ((anInt3669 ^ 0xffffffff)
			!= (aClass220_3657.anInt3218 ^ 0xffffffff))
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
		    aClass220_3657 = null;
		    if (aClass179_3683.method2505(-27332))
			aClass131_Sub41_Sub21_3664 = null;
		    else
			aClass131_Sub41_Sub21_3664
			    = aClass179_3683.method2504(anInt3660, true,
							(byte) 0, 255, 20);
		    return null;
		}
	    }
	    if (aClass85_3661 != null) {
		aByteArray3674 = new byte[aClass220_3657.anInt3213];
		anInt3656 = 0;
	    }
	    aClass131_Sub41_Sub21_3664 = null;
	    return aClass220_3657;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kk.C(" + arg0 + ')');
	}
    }
    
    public static void method286(int arg0, byte arg1) {
	anInt3668++;
	Class131_Sub2_Sub2.aClass214_5575.method2786(arg1 ^ ~0x49, arg0);
	if (arg1 != -74)
	    aClass173_3666 = null;
    }
    
    public Class22_Sub1(int arg0, Class85 arg1, Class85 arg2, Class179 arg3,
			Class88 arg4, int arg5, int arg6, boolean arg7) {
	aClass119_3689 = new Class119();
	aLong3695 = 0L;
	do {
	    try {
		aClass85_3661 = arg1;
		anInt3660 = arg0;
		if (aClass85_3661 == null)
		    aBoolean3693 = false;
		else {
		    aBoolean3693 = true;
		    aClass119_3687 = new Class119();
		}
		aBoolean3694 = arg7;
		aClass85_3671 = arg2;
		anInt3677 = arg5;
		anInt3669 = arg6;
		aClass88_3686 = arg4;
		aClass179_3683 = arg3;
		if (aClass85_3671 == null)
		    break;
		aClass131_Sub41_Sub21_3664
		    = aClass88_3686.method831((byte) -49, anInt3660,
					      aClass85_3671);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("kk.<init>(" + arg0 + ','
			    + (arg1 != null ? "{...}" : "null") + ','
			    + (arg2 != null ? "{...}" : "null") + ','
			    + (arg3 != null ? "{...}" : "null") + ','
			    + (arg4 != null ? "{...}" : "null") + ',' + arg5
			    + ',' + arg6 + ',' + arg7 + ')'));
	    }
	    break;
	} while (false);
    }
}
