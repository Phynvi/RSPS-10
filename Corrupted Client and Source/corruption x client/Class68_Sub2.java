/* Class68_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub2 extends Class68
{
    public int anInt3847;
    public int[][] anIntArrayArray3848;
    public int anInt3849;
    public int[][] anIntArrayArray3850;
    public int anInt3851;
    public Class130_Sub1 aClass130_Sub1_3852;
    public int anInt3853;
    public Class32[][] aClass32ArrayArray3854;
    public int anInt3855;
    public byte[][] aByteArrayArray3856;
    public Class13[][] aClass13ArrayArray3857;
    public int anInt3858;
    public int anInt3859;
    public int anInt3860;
    public int anInt3861;
    public int anInt3862;
    public int anInt3863;
    public int anInt3864;
    public Class97[][] aClass97ArrayArray3865;
    public int anInt3866;
    public byte[][] aByteArrayArray3867;
    public int anInt3868;
    public Class99[][] aClass99ArrayArray3869;
    public int anInt3870;
    
    public boolean method714(Class131_Sub41_Sub13 arg0, int arg1, int arg2,
			     int arg3, int arg4, boolean arg5) {
	return false;
    }
    
    public void method726(int arg0, int arg1, int[] arg2, int[] arg3,
			  int[] arg4, int[] arg5, int[] arg6, int[] arg7,
			  int[] arg8, int arg9, int arg10, boolean arg11) {
	if (aClass99ArrayArray3869 == null) {
	    aClass99ArrayArray3869 = new Class99[anInt924][anInt916];
	    aClass97ArrayArray3865 = new Class97[anInt924][anInt916];
	} else if (aClass32ArrayArray3854 != null)
	    throw new IllegalStateException();
	if (arg2 != null && arg2.length != 0) {
	    for (int i = 0; i < arg5.length; i++) {
		if (arg5[i] == -1)
		    arg5[i] = 0;
		else
		    arg5[i]
			= (Class88.anIntArray1171
			   [(Class131_Sub2_Sub22.method1575((byte) 46, arg5[i])
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (arg6 != null) {
		for (int i = 0; i < arg6.length; i++) {
		    if (arg6[i] == -1)
			arg6[i] = 0;
		    else
			arg6[i] = (Class88.anIntArray1171
				   [(Class131_Sub2_Sub22.method1575((byte) -23,
								    arg6[i])
				     & 0xffff)]) << 8 | 0xff;
		}
	    }
	    boolean bool = true;
	    int i = -1;
	    int i_0_ = -1;
	    int i_1_ = -1;
	    int i_2_ = -1;
	    if (arg2.length == 6) {
		for (int i_3_ = 0; i_3_ < 6; i_3_++) {
		    if (arg2[i_3_] == 0 && arg4[i_3_] == 0) {
			if (i != -1 && arg5[i] != arg5[i_3_]) {
			    bool = false;
			    break;
			}
			i = i_3_;
		    } else if (arg2[i_3_] == anInt3853 && arg4[i_3_] == 0) {
			if (i_0_ != -1 && arg5[i_0_] != arg5[i_3_]) {
			    bool = false;
			    break;
			}
			i_0_ = i_3_;
		    } else if (arg2[i_3_] == anInt3853
			       && arg4[i_3_] == anInt3853) {
			if (i_1_ != -1 && arg5[i_1_] != arg5[i_3_]) {
			    bool = false;
			    break;
			}
			i_1_ = i_3_;
		    } else if (arg2[i_3_] == 0 && arg4[i_3_] == anInt3853) {
			if (i_2_ != -1 && arg5[i_2_] != arg5[i_3_]) {
			    bool = false;
			    break;
			}
			i_2_ = i_3_;
		    }
		}
		if (i == -1 || i_0_ == -1 || i_1_ == -1 || i_2_ == -1)
		    bool = false;
		if (bool) {
		    if (arg3 != null) {
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
			    if (arg3[i_4_] != 0) {
				bool = false;
				break;
			    }
			}
		    }
		    if (bool) {
			for (int i_5_ = 1; i_5_ < 4; i_5_++) {
			    if (arg2[i_5_] != arg2[0]
				&& arg2[i_5_] != arg2[0] + anInt3853
				&& arg2[i_5_] != arg2[0] - anInt3853) {
				bool = false;
				break;
			    }
			    if (arg4[i_5_] != arg4[0]
				&& arg4[i_5_] != arg4[0] + anInt3853
				&& arg4[i_5_] != arg4[0] - anInt3853) {
				bool = false;
				break;
			    }
			}
		    }
		}
	    } else
		bool = false;
	    if (bool) {
		Class99 class99 = new Class99();
		int i_6_ = arg5[0];
		int i_7_ = arg7[0];
		if (arg6 != null) {
		    class99.anInt1308 = arg6[0] >> 8;
		    if (i_6_ == 0)
			class99.aByte1313 |= 0x2;
		} else if (i_6_ == 0)
		    return;
		if ((anIntArrayArray3848[arg0][arg1]
		     == anIntArrayArray3848[arg0 + 1][arg1])
		    && (anIntArrayArray3848[arg0][arg1]
			== anIntArrayArray3848[arg0 + 1][arg1 + 1])
		    && (anIntArrayArray3848[arg0][arg1]
			== anIntArrayArray3848[arg0][arg1 + 1]))
		    class99.aByte1313 |= 0x1;
		if (i_7_ != -1 && (class99.aByte1313 & 0x2) == 0
		    && !(aClass130_Sub1_3852.anInterface4_4069.method10
			 (-19907, i_7_).aBoolean556)) {
		    class99.anInt1314 = (aByteArrayArray3867[arg0][arg1]
					 - aByteArrayArray3856[arg0][arg1]);
		    class99.anInt1309
			= (aByteArrayArray3867[arg0 + 1][arg1]
			   - aByteArrayArray3856[arg0 + 1][arg1]);
		    class99.anInt1311
			= (aByteArrayArray3867[arg0 + 1][arg1 + 1]
			   - aByteArrayArray3856[arg0 + 1][arg1 + 1]);
		    class99.anInt1312
			= (aByteArrayArray3867[arg0][arg1 + 1]
			   - aByteArrayArray3856[arg0][arg1 + 1]);
		    class99.aShort1310 = (short) i_7_;
		} else {
		    int i_8_;
		    if (anIntArrayArray3850 != null && arg10 != 0) {
			i_8_ = 255 * anIntArrayArray3850[arg0][arg1] / arg10;
			if (i_8_ < 0)
			    i_8_ = 0;
			else if (i_8_ > 255)
			    i_8_ = 255;
		    } else
			i_8_ = 0;
		    class99.anInt1314
			= Class67.method705(-16711936, i_8_,
					    method733(arg5[i] >> 8,
						      ((aByteArrayArray3867
							[arg0][arg1])
						       - (aByteArrayArray3856
							  [arg0][arg1]))),
					    arg9);
		    if (class99.anInt1308 != 0)
			class99.anInt1314
			    |= 255 - (aByteArrayArray3867[arg0][arg1]
				      - aByteArrayArray3856[arg0][arg1]) << 25;
		    if (anIntArrayArray3850 != null && arg10 != 0) {
			i_8_ = (255 * anIntArrayArray3850[arg0 + 1][arg1]
				/ arg10);
			if (i_8_ < 0)
			    i_8_ = 0;
			else if (i_8_ > 255)
			    i_8_ = 255;
		    } else
			i_8_ = 0;
		    class99.anInt1309
			= Class67.method705(-16711936, i_8_,
					    method733(arg5[i_0_] >> 8,
						      ((aByteArrayArray3867
							[arg0 + 1][arg1])
						       - (aByteArrayArray3856
							  [arg0 + 1][arg1]))),
					    arg9);
		    if (class99.anInt1308 != 0)
			class99.anInt1309
			    |= (255 - (aByteArrayArray3867[arg0 + 1][arg1]
				       - aByteArrayArray3856[arg0 + 1][arg1])
				<< 25);
		    if (anIntArrayArray3850 != null && arg10 != 0) {
			i_8_ = (255 * anIntArrayArray3850[arg0 + 1][arg1 + 1]
				/ arg10);
			if (i_8_ < 0)
			    i_8_ = 0;
			else if (i_8_ > 255)
			    i_8_ = 255;
		    } else
			i_8_ = 0;
		    class99.anInt1311
			= Class67.method705(-16711936, i_8_,
					    method733(arg5[i_1_] >> 8,
						      ((aByteArrayArray3867
							[arg0 + 1][arg1 + 1])
						       - (aByteArrayArray3856
							  [arg0 + 1]
							  [arg1 + 1]))),
					    arg9);
		    if (class99.anInt1308 != 0)
			class99.anInt1311
			    |= 255 - (aByteArrayArray3867[arg0 + 1][arg1 + 1]
				      - (aByteArrayArray3856[arg0 + 1]
					 [arg1 + 1])) << 25;
		    if (anIntArrayArray3850 != null && arg10 != 0) {
			i_8_ = (255 * anIntArrayArray3850[arg0][arg1 + 1]
				/ arg10);
			if (i_8_ < 0)
			    i_8_ = 0;
			else if (i_8_ > 255)
			    i_8_ = 255;
		    } else
			i_8_ = 0;
		    class99.anInt1312
			= Class67.method705(-16711936, i_8_,
					    method733(arg5[i_2_] >> 8,
						      ((aByteArrayArray3867
							[arg0][arg1 + 1])
						       - (aByteArrayArray3856
							  [arg0][arg1 + 1]))),
					    arg9);
		    if (class99.anInt1308 != 0)
			class99.anInt1312
			    |= (255 - (aByteArrayArray3867[arg0][arg1 + 1]
				       - aByteArrayArray3856[arg0][arg1 + 1])
				<< 25);
		    class99.aShort1310 = (short) -1;
		}
		aClass99ArrayArray3869[arg0][arg1] = class99;
	    } else {
		Class97 class97 = new Class97();
		class97.aShort1277 = (short) arg2.length;
		class97.aShort1280 = (short) (arg2.length / 3);
		class97.aShortArray1283 = new short[class97.aShort1277];
		class97.aShortArray1279 = new short[class97.aShort1277];
		class97.aShortArray1276 = new short[class97.aShort1277];
		class97.anIntArray1275 = new int[class97.aShort1277];
		if (anIntArrayArray3850 != null)
		    class97.aShortArray1274 = new short[class97.aShort1277];
		for (int i_9_ = 0; i_9_ < class97.aShort1277; i_9_++) {
		    int i_10_ = arg2[i_9_];
		    int i_11_ = arg4[i_9_];
		    boolean bool_12_ = false;
		    int i_13_;
		    if (i_10_ == 0 && i_11_ == 0)
			i_13_ = (aByteArrayArray3867[arg0][arg1]
				 - aByteArrayArray3856[arg0][arg1]);
		    else if (i_10_ == 0 && i_11_ == anInt3853)
			i_13_ = (aByteArrayArray3867[arg0][arg1 + 1]
				 - aByteArrayArray3856[arg0][arg1 + 1]);
		    else if (i_10_ == anInt3853 && i_11_ == anInt3853)
			i_13_ = (aByteArrayArray3867[arg0 + 1][arg1 + 1]
				 - aByteArrayArray3856[arg0 + 1][arg1 + 1]);
		    else if (i_10_ == anInt3853 && i_11_ == 0)
			i_13_ = (aByteArrayArray3867[arg0 + 1][arg1]
				 - aByteArrayArray3856[arg0 + 1][arg1]);
		    else {
			int i_14_ = (((aByteArrayArray3867[arg0][arg1]
				       - aByteArrayArray3856[arg0][arg1])
				      * (anInt3853 - i_10_))
				     + ((aByteArrayArray3867[arg0 + 1][arg1]
					 - aByteArrayArray3856[arg0 + 1][arg1])
					* i_10_));
			int i_15_
			    = (((aByteArrayArray3867[arg0][arg1 + 1]
				 - aByteArrayArray3856[arg0][arg1 + 1])
				* (anInt3853 - i_10_))
			       + ((aByteArrayArray3867[arg0 + 1][arg1 + 1]
				   - aByteArrayArray3856[arg0 + 1][arg1 + 1])
				  * i_10_));
			i_13_ = (i_14_ * (anInt3853 - i_11_) + i_15_ * i_11_
				 >> 2 * anInt3868);
		    }
		    short i_16_ = (short) ((arg0 << anInt3868) + i_10_);
		    short i_17_ = (short) ((arg1 << anInt3868) + i_11_);
		    class97.aShortArray1283[i_9_] = i_16_;
		    class97.aShortArray1276[i_9_] = i_17_;
		    class97.aShortArray1279[i_9_]
			= (short) (method720(i_16_, i_17_)
				   + (arg3 != null ? arg3[i_9_] : 0));
		    if (i_13_ < 0)
			i_13_ = 0;
		    if (arg7[i_9_] == -1
			|| (aClass130_Sub1_3852.anInterface4_4069.method10
			    (-19907, arg7[i_9_]).aBoolean556)) {
			if (arg5[i_9_] == 0) {
			    if (arg6 != null)
				class97.anIntArray1275[i_9_] = i_13_ << 25;
			    else
				class97.anIntArray1275[i_9_] = 0;
			} else {
			    int i_18_ = 0;
			    if (anIntArrayArray3850 != null) {
				boolean bool_19_ = false;
				int i_20_;
				if (i_10_ == 0 && i_11_ == 0)
				    i_20_ = anIntArrayArray3850[arg0][arg1];
				else if (i_10_ == 0 && i_11_ == anInt3853)
				    i_20_
					= anIntArrayArray3850[arg0][arg1 + 1];
				else if (i_10_ == anInt3853
					 && i_11_ == anInt3853)
				    i_20_ = (anIntArrayArray3850[arg0 + 1]
					     [arg1 + 1]);
				else if (i_10_ == anInt3853 && i_11_ == 0)
				    i_20_
					= anIntArrayArray3850[arg0 + 1][arg1];
				else {
				    int i_21_
					= ((anIntArrayArray3850[arg0][arg1]
					    * (anInt3853 - i_10_))
					   + (anIntArrayArray3850[arg0 + 1]
					      [arg1]) * i_10_);
				    int i_22_
					= ((anIntArrayArray3850[arg0][arg1 + 1]
					    * (anInt3853 - i_10_))
					   + (anIntArrayArray3850[arg0 + 1]
					      [arg1 + 1]) * i_10_);
				    i_20_ = (i_21_ * (anInt3853 - i_11_)
					     + i_22_ * i_11_) >> 2 * anInt3868;
				}
				class97.aShortArray1274[i_9_] = (short) i_20_;
				if (arg10 != 0) {
				    i_18_ = 255 * i_20_ / arg10;
				    if (i_18_ < 0)
					i_18_ = 0;
				    else if (i_18_ > 255)
					i_18_ = 255;
				}
			    }
			    class97.anIntArray1275[i_9_]
				= Class67.method705(-16711936, i_18_,
						    method733(arg5[i_9_] >> 8,
							      i_13_),
						    arg9);
			    if (arg6 != null)
				class97.anIntArray1275[i_9_] |= i_13_ << 25;
			}
		    } else
			class97.anIntArray1275[i_9_] = i_13_;
		}
		boolean bool_23_ = false;
		for (int i_24_ = 0; i_24_ < class97.aShort1280; i_24_++) {
		    if (arg7[i_24_ * 3] != -1
			&& !(aClass130_Sub1_3852.anInterface4_4069.method10
			     (-19907, arg7[i_24_ * 3]).aBoolean556))
			bool_23_ = true;
		}
		if (arg6 != null)
		    class97.anIntArray1278 = new int[class97.aShort1280];
		if (bool_23_) {
		    class97.aShortArray1281 = new short[class97.aShort1280];
		    class97.aShortArray1282 = new short[class97.aShort1280];
		}
		for (int i_25_ = 0; i_25_ < class97.aShort1280; i_25_++) {
		    int i_26_ = i_25_ * 3;
		    if (arg6 != null && arg6[i_26_] != 0)
			class97.anIntArray1278[i_25_] = arg6[i_26_] >> 8;
		    if (bool_23_) {
			int i_27_ = i_26_ + 1;
			int i_28_ = i_27_ + 1;
			boolean bool_29_ = false;
			boolean bool_30_ = true;
			int i_31_ = arg7[i_26_];
			if (i_31_ == -1
			    || (aClass130_Sub1_3852.anInterface4_4069.method10
				(-19907, i_31_).aBoolean556))
			    bool_30_ = false;
			else
			    bool_29_ = true;
			i_31_ = arg7[i_27_];
			if (i_31_ == -1
			    || (aClass130_Sub1_3852.anInterface4_4069.method10
				(-19907, i_31_).aBoolean556))
			    bool_30_ = false;
			else
			    bool_29_ = true;
			i_31_ = arg7[i_28_];
			if (i_31_ == -1
			    || (aClass130_Sub1_3852.anInterface4_4069.method10
				(-19907, i_31_).aBoolean556))
			    bool_30_ = false;
			else
			    bool_29_ = true;
			if (bool_30_) {
			    class97.aShortArray1281[i_25_] = (short) i_31_;
			    class97.aShortArray1282[i_25_]
				= (short) arg8[i_26_];
			} else {
			    if (bool_29_) {
				i_31_ = arg7[i_26_];
				if (i_31_ != -1
				    && !(aClass130_Sub1_3852
					     .anInterface4_4069.method10
					 (-19907, i_31_).aBoolean556))
				    class97.anIntArray1275[i_26_]
					= (Class88.anIntArray1171
					   [(Class131_Sub2_Sub22.method1575
					     ((byte) 125,
					      ((aClass130_Sub1_3852
						    .anInterface4_4069.method10
						(-19907, i_31_).aShort578)
					       & 0xffff))) & 0xffff]);
				i_31_ = arg7[i_27_];
				if (i_31_ != -1
				    && !(aClass130_Sub1_3852
					     .anInterface4_4069.method10
					 (-19907, i_31_).aBoolean556))
				    class97.anIntArray1275[i_27_]
					= (Class88.anIntArray1171
					   [(Class131_Sub2_Sub22.method1575
					     ((byte) -128,
					      ((aClass130_Sub1_3852
						    .anInterface4_4069.method10
						(-19907, i_31_).aShort578)
					       & 0xffff))) & 0xffff]);
				i_31_ = arg7[i_28_];
				if (i_31_ != -1
				    && !(aClass130_Sub1_3852
					     .anInterface4_4069.method10
					 (-19907, i_31_).aBoolean556))
				    class97.anIntArray1275[i_28_]
					= (Class88.anIntArray1171
					   [(Class131_Sub2_Sub22.method1575
					     ((byte) -20,
					      ((aClass130_Sub1_3852
						    .anInterface4_4069.method10
						(-19907, i_31_).aShort578)
					       & 0xffff))) & 0xffff]);
			    }
			    class97.aShortArray1281[i_25_] = (short) -1;
			}
		    }
		}
		aClass97ArrayArray3865[arg0][arg1] = class97;
	    }
	}
    }
    
    public void method710(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean[][] arg7) {
	Class125 class125
	    = aClass130_Sub1_3852.method1267(Thread.currentThread());
	Class65 class65 = class125.aClass65_1638;
	class65.anInt819 = 0;
	class65.aBoolean820 = false;
	if (aClass99ArrayArray3869 != null)
	    method735(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, class65,
		      class125.anIntArray1646, class125.anIntArray1662);
	else if (aClass32ArrayArray3854 != null)
	    method734(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, class65,
		      class125.anIntArray1646, class125.anIntArray1662);
    }
    
    public int method712(int arg0, int arg1) {
	return anIntArrayArray3848[arg0][arg1];
    }
    
    public void method730(int arg0, int arg1, Class65 arg2, int[] arg3,
			  int[] arg4, int[] arg5) {
	Class32 class32 = aClass32ArrayArray3854[arg0][arg1];
	if (class32 != null) {
	    if ((class32.aByte451 & 0x2) == 0) {
		int i = arg0 * anInt3853;
		int i_32_ = i + anInt3853;
		int i_33_ = arg1 * anInt3853;
		int i_34_ = i_33_ + anInt3853;
		int i_35_;
		int i_36_;
		int i_37_;
		int i_38_;
		int i_39_;
		int i_40_;
		int i_41_;
		int i_42_;
		int i_43_;
		int i_44_;
		int i_45_;
		int i_46_;
		int i_47_;
		int i_48_;
		int i_49_;
		int i_50_;
		int i_51_;
		if ((class32.aByte451 & 0x1) != 0) {
		    int i_52_ = anIntArrayArray3848[arg0][arg1];
		    int i_53_ = anInt3862 * i_52_;
		    i_35_ = (anInt3860
			     + (anInt3863 * i + i_53_ + anInt3849 * i_33_
				>> 15));
		    if (i_35_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_36_ = (anInt3860
			     + (anInt3863 * i_32_ + i_53_ + anInt3849 * i_33_
				>> 15));
		    if (i_36_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    int i_54_
			= (anInt3860
			   + (anInt3863 * i_32_ + i_53_ + anInt3849 * i_34_
			      >> 15));
		    if (i_54_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_37_ = (anInt3860
			     + (anInt3863 * i + i_53_ + anInt3849 * i_34_
				>> 15));
		    if (i_37_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    int i_55_ = anInt3847 * i_52_;
		    int i_56_ = anInt3870 * i_52_;
		    i_38_ = (anInt3855
			     + (anInt3851 * i + i_55_ + anInt3864 * i_33_
				>> 15));
		    i_39_ = (arg2.anInt822
			     + i_38_ * aClass130_Sub1_3852.anInt4068 / i_35_);
		    i_40_ = (anInt3858
			     + (anInt3866 * i + i_56_ + anInt3861 * i_33_
				>> 15));
		    i_41_ = (arg2.anInt821
			     + i_40_ * aClass130_Sub1_3852.anInt4036 / i_35_);
		    i_42_ = (anInt3855
			     + (anInt3851 * i_32_ + i_55_ + anInt3864 * i_33_
				>> 15));
		    i_43_ = (arg2.anInt822
			     + i_42_ * aClass130_Sub1_3852.anInt4068 / i_36_);
		    i_44_ = (anInt3858
			     + (anInt3866 * i_32_ + i_56_ + anInt3861 * i_33_
				>> 15));
		    i_45_ = (arg2.anInt821
			     + i_44_ * aClass130_Sub1_3852.anInt4036 / i_36_);
		    int i_57_
			= (anInt3855
			   + (anInt3851 * i_32_ + i_55_ + anInt3864 * i_34_
			      >> 15));
		    i_46_ = (arg2.anInt822
			     + i_57_ * aClass130_Sub1_3852.anInt4068 / i_54_);
		    int i_58_
			= (anInt3858
			   + (anInt3866 * i_32_ + i_56_ + anInt3861 * i_34_
			      >> 15));
		    i_47_ = (arg2.anInt821
			     + i_58_ * aClass130_Sub1_3852.anInt4036 / i_54_);
		    i_48_ = (anInt3855
			     + (anInt3851 * i + i_55_ + anInt3864 * i_34_
				>> 15));
		    i_49_ = (arg2.anInt822
			     + i_48_ * aClass130_Sub1_3852.anInt4068 / i_37_);
		    i_50_ = (anInt3858
			     + (anInt3866 * i + i_56_ + anInt3861 * i_34_
				>> 15));
		    i_51_ = (arg2.anInt821
			     + i_50_ * aClass130_Sub1_3852.anInt4036 / i_37_);
		} else {
		    int i_59_ = anIntArrayArray3848[arg0][arg1];
		    int i_60_ = anIntArrayArray3848[arg0 + 1][arg1];
		    int i_61_ = anIntArrayArray3848[arg0 + 1][arg1 + 1];
		    int i_62_ = anIntArrayArray3848[arg0][arg1 + 1];
		    i_35_ = anInt3860 + ((anInt3863 * i + anInt3862 * i_59_
					  + anInt3849 * i_33_)
					 >> 15);
		    if (i_35_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_36_ = anInt3860 + ((anInt3863 * i_32_ + anInt3862 * i_60_
					  + anInt3849 * i_33_)
					 >> 15);
		    if (i_36_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    int i_63_
			= anInt3860 + ((anInt3863 * i_32_ + anInt3862 * i_61_
					+ anInt3849 * i_34_)
				       >> 15);
		    if (i_63_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_37_ = anInt3860 + ((anInt3863 * i + anInt3862 * i_62_
					  + anInt3849 * i_34_)
					 >> 15);
		    if (i_37_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_38_ = anInt3855 + ((anInt3851 * i + anInt3847 * i_59_
					  + anInt3864 * i_33_)
					 >> 15);
		    i_39_ = (arg2.anInt822
			     + i_38_ * aClass130_Sub1_3852.anInt4068 / i_35_);
		    i_40_ = anInt3858 + ((anInt3866 * i + anInt3870 * i_59_
					  + anInt3861 * i_33_)
					 >> 15);
		    i_41_ = (arg2.anInt821
			     + i_40_ * aClass130_Sub1_3852.anInt4036 / i_35_);
		    i_42_ = anInt3855 + ((anInt3851 * i_32_ + anInt3847 * i_60_
					  + anInt3864 * i_33_)
					 >> 15);
		    i_43_ = (arg2.anInt822
			     + i_42_ * aClass130_Sub1_3852.anInt4068 / i_36_);
		    i_44_ = anInt3858 + ((anInt3866 * i_32_ + anInt3870 * i_60_
					  + anInt3861 * i_33_)
					 >> 15);
		    i_45_ = (arg2.anInt821
			     + i_44_ * aClass130_Sub1_3852.anInt4036 / i_36_);
		    int i_64_
			= anInt3855 + ((anInt3851 * i_32_ + anInt3847 * i_61_
					+ anInt3864 * i_34_)
				       >> 15);
		    i_46_ = (arg2.anInt822
			     + i_64_ * aClass130_Sub1_3852.anInt4068 / i_63_);
		    int i_65_
			= anInt3858 + ((anInt3866 * i_32_ + anInt3870 * i_61_
					+ anInt3861 * i_34_)
				       >> 15);
		    i_47_ = (arg2.anInt821
			     + i_65_ * aClass130_Sub1_3852.anInt4036 / i_63_);
		    i_48_ = anInt3855 + ((anInt3851 * i + anInt3847 * i_62_
					  + anInt3864 * i_34_)
					 >> 15);
		    i_49_ = (arg2.anInt822
			     + i_48_ * aClass130_Sub1_3852.anInt4068 / i_37_);
		    i_50_ = anInt3858 + ((anInt3866 * i + anInt3870 * i_62_
					  + anInt3861 * i_34_)
					 >> 15);
		    i_51_ = (arg2.anInt821
			     + i_50_ * aClass130_Sub1_3852.anInt4036 / i_37_);
		}
		if (((i_46_ - i_49_) * (i_45_ - i_51_)
		     - (i_47_ - i_51_) * (i_43_ - i_49_))
		    > 0) {
		    arg2.aBoolean820
			= (i_46_ < 0 || i_49_ < 0 || i_43_ < 0
			   || i_46_ > arg2.anInt825 || i_49_ > arg2.anInt825
			   || i_43_ > arg2.anInt825);
		    if (class32.aShort450 >= 0) {
			if (method731(aClass130_Sub1_3852.anInterface4_4069
					  .method10
				      (-19907, class32.aShort450).aByte576))
			    arg2.anInt819 = 100;
			arg2.method683(i_47_, i_51_, i_45_, i_46_, i_49_,
				       i_43_, class32.aShort449 & 0xffff,
				       class32.aShort448 & 0xffff,
				       class32.aShort446 & 0xffff, i_38_,
				       i_42_, i_48_, i_40_, i_44_, i_50_,
				       i_35_, i_36_, i_37_, class32.aShort450);
			arg2.anInt819 = 0;
		    } else
			arg2.method688(i_47_, i_51_, i_45_, i_46_, i_49_,
				       i_43_, class32.aShort449 & 0xffff,
				       class32.aShort448 & 0xffff,
				       class32.aShort446 & 0xffff);
		}
		if (((i_39_ - i_43_) * (i_51_ - i_45_)
		     - (i_41_ - i_45_) * (i_49_ - i_43_))
		    > 0) {
		    arg2.aBoolean820
			= (i_39_ < 0 || i_43_ < 0 || i_49_ < 0
			   || i_39_ > arg2.anInt825 || i_43_ > arg2.anInt825
			   || i_49_ > arg2.anInt825);
		    if (class32.aShort450 >= 0) {
			if (method731(aClass130_Sub1_3852.anInterface4_4069
					  .method10
				      (-19907, class32.aShort450).aByte576))
			    arg2.anInt819 = 100;
			arg2.method683(i_41_, i_45_, i_51_, i_39_, i_43_,
				       i_49_, class32.aShort445 & 0xffff,
				       class32.aShort446 & 0xffff,
				       class32.aShort448 & 0xffff, i_38_,
				       i_42_, i_48_, i_40_, i_44_, i_50_,
				       i_35_, i_36_, i_37_, class32.aShort450);
			arg2.anInt819 = 0;
		    } else
			arg2.method688(i_41_, i_45_, i_51_, i_39_, i_43_,
				       i_49_, class32.aShort445 & 0xffff,
				       class32.aShort446 & 0xffff,
				       class32.aShort448 & 0xffff);
		}
	    }
	} else {
	    Class13 class13 = aClass13ArrayArray3857[arg0][arg1];
	    if (class13 != null) {
		for (int i = 0; i < class13.aShort135; i++) {
		    int i_66_ = class13.anIntArray141[i];
		    int i_67_ = class13.anIntArray147[i];
		    int i_68_ = class13.anIntArray146[i];
		    int i_69_
			= anInt3860 + ((anInt3863 * i_66_ + anInt3862 * i_67_
					+ anInt3849 * i_68_)
				       >> 15);
		    if (i_69_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    int i_70_
			= anInt3855 + ((anInt3851 * i_66_ + anInt3847 * i_67_
					+ anInt3864 * i_68_)
				       >> 15);
		    int i_71_
			= anInt3858 + ((anInt3866 * i_66_ + anInt3870 * i_67_
					+ anInt3861 * i_68_)
				       >> 15);
		    arg3[i]
			= (arg2.anInt822
			   + i_70_ * aClass130_Sub1_3852.anInt4068 / i_69_);
		    arg4[i]
			= (arg2.anInt821
			   + i_71_ * aClass130_Sub1_3852.anInt4036 / i_69_);
		}
		if (class13.aShortArray138 != null) {
		    int i = anIntArrayArray3848[arg0][arg1];
		    int i_72_ = anIntArrayArray3848[arg0 + 1][arg1];
		    int i_73_ = anIntArrayArray3848[arg0][arg1 + 1];
		    int i_74_ = arg0 * anInt3853;
		    int i_75_ = i_74_ + anInt3853;
		    int i_76_ = arg1 * anInt3853;
		    int i_77_ = i_76_ + anInt3853;
		    int i_78_ = anInt3855 + ((anInt3851 * i_74_ + anInt3847 * i
					      + anInt3864 * i_76_)
					     >> 15);
		    int i_79_ = anInt3858 + ((anInt3866 * i_74_ + anInt3870 * i
					      + anInt3861 * i_76_)
					     >> 15);
		    int i_80_ = anInt3860 + ((anInt3863 * i_74_ + anInt3862 * i
					      + anInt3849 * i_76_)
					     >> 15);
		    int i_81_
			= anInt3855 + ((anInt3851 * i_75_ + anInt3847 * i_72_
					+ anInt3864 * i_76_)
				       >> 15);
		    int i_82_
			= anInt3858 + ((anInt3866 * i_75_ + anInt3870 * i_72_
					+ anInt3861 * i_76_)
				       >> 15);
		    int i_83_
			= anInt3860 + ((anInt3863 * i_75_ + anInt3862 * i_72_
					+ anInt3849 * i_76_)
				       >> 15);
		    int i_84_
			= anInt3855 + ((anInt3851 * i_74_ + anInt3847 * i_73_
					+ anInt3864 * i_77_)
				       >> 15);
		    int i_85_
			= anInt3858 + ((anInt3866 * i_74_ + anInt3870 * i_73_
					+ anInt3861 * i_77_)
				       >> 15);
		    int i_86_
			= anInt3860 + ((anInt3863 * i_74_ + anInt3862 * i_73_
					+ anInt3849 * i_77_)
				       >> 15);
		    for (int i_87_ = 0; i_87_ < class13.aShort139; i_87_++) {
			short i_88_ = class13.aShortArray137[i_87_];
			short i_89_ = class13.aShortArray142[i_87_];
			short i_90_ = class13.aShortArray143[i_87_];
			int i_91_ = arg3[i_88_];
			int i_92_ = arg3[i_89_];
			int i_93_ = arg3[i_90_];
			int i_94_ = arg4[i_88_];
			int i_95_ = arg4[i_89_];
			int i_96_ = arg4[i_90_];
			if (((i_91_ - i_92_) * (i_96_ - i_95_)
			     - (i_94_ - i_95_) * (i_93_ - i_92_))
			    > 0) {
			    arg2.aBoolean820
				= (i_91_ < 0 || i_92_ < 0 || i_93_ < 0
				   || i_91_ > arg2.anInt825
				   || i_92_ > arg2.anInt825
				   || i_93_ > arg2.anInt825);
			    short i_97_ = class13.aShortArray138[i_87_];
			    if (i_97_ != -1) {
				if (method731(aClass130_Sub1_3852
						  .anInterface4_4069.method10
					      (-19907, i_97_).aByte576))
				    arg2.anInt819 = 100;
				arg2.method683(i_94_, i_95_, i_96_, i_91_,
					       i_92_, i_93_,
					       class13.aShortArray144[i_88_],
					       class13.aShortArray144[i_89_],
					       class13.aShortArray144[i_90_],
					       i_78_, i_81_, i_84_, i_79_,
					       i_82_, i_85_, i_80_, i_83_,
					       i_86_, i_97_);
				arg2.anInt819 = 0;
			    } else {
				int i_98_ = class13.anIntArray145[i_87_];
				if (i_98_ != -1)
				    arg2.method688
					(i_94_, i_95_, i_96_, i_91_, i_92_,
					 i_93_,
					 Class56.method624((class13
							    .aShortArray144
							    [i_88_]),
							   (byte) -33, i_98_),
					 Class56.method624((class13
							    .aShortArray144
							    [i_89_]),
							   (byte) -33, i_98_),
					 Class56.method624((class13
							    .aShortArray144
							    [i_90_]),
							   (byte) -33, i_98_));
			    }
			}
		    }
		} else {
		    for (int i = 0; i < class13.aShort139; i++) {
			short i_99_ = class13.aShortArray137[i];
			short i_100_ = class13.aShortArray142[i];
			short i_101_ = class13.aShortArray143[i];
			int i_102_ = arg3[i_99_];
			int i_103_ = arg3[i_100_];
			int i_104_ = arg3[i_101_];
			int i_105_ = arg4[i_99_];
			int i_106_ = arg4[i_100_];
			int i_107_ = arg4[i_101_];
			if (((i_102_ - i_103_) * (i_107_ - i_106_)
			     - (i_105_ - i_106_) * (i_104_ - i_103_))
			    > 0) {
			    int i_108_ = class13.anIntArray145[i];
			    if (i_108_ != -1) {
				arg2.aBoolean820
				    = (i_102_ < 0 || i_103_ < 0 || i_104_ < 0
				       || i_102_ > arg2.anInt825
				       || i_103_ > arg2.anInt825
				       || i_104_ > arg2.anInt825);
				arg2.method688
				    (i_105_, i_106_, i_107_, i_102_, i_103_,
				     i_104_,
				     Class56.method624((class13.aShortArray144
							[i_99_]),
						       (byte) -33, i_108_),
				     Class56.method624((class13.aShortArray144
							[i_100_]),
						       (byte) -33, i_108_),
				     Class56.method624((class13.aShortArray144
							[i_101_]),
						       (byte) -33, i_108_));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method709(Class131_Sub41_Sub13 class131_sub41_sub13, int i,
			  int i_109_, int i_110_, int i_111_, boolean bool) {
	/* empty */
    }
    
    public Class131_Sub41_Sub13 method728(int arg0, int arg1,
					  Class131_Sub41_Sub13 arg2) {
	return null;
    }
    
    public void method713() {
	aByteArrayArray3867 = null;
	aByteArrayArray3856 = null;
    }
    
    public void method727(int arg0, int arg1) {
	Class125 class125
	    = aClass130_Sub1_3852.method1267(Thread.currentThread());
	class125.aClass65_1638.anInt819 = 0;
	if (aClass99ArrayArray3869 != null)
	    method732(arg0, arg1, aClass130_Sub1_3852.aBoolean4056,
		      class125.aClass65_1638, class125.anIntArray1646,
		      class125.anIntArray1662, class125.anIntArray1674);
	else if (aClass32ArrayArray3854 != null)
	    method730(arg0, arg1, class125.aClass65_1638,
		      class125.anIntArray1646, class125.anIntArray1662,
		      class125.anIntArray1674);
    }
    
    public void method721(Class131_Sub41_Sub13 class131_sub41_sub13, int i,
			  int i_112_, int i_113_, int i_114_, boolean bool) {
	/* empty */
    }
    
    public boolean method731(int arg0) {
	if ((anInt3859 & 0x8) == 0)
	    return false;
	if (arg0 == 4)
	    return true;
	if (arg0 == 8)
	    return true;
	return false;
    }
    
    public void method732(int arg0, int arg1, boolean arg2, Class65 arg3,
			  int[] arg4, int[] arg5, int[] arg6) {
	Class99 class99 = aClass99ArrayArray3869[arg0][arg1];
	if (class99 != null) {
	    if ((class99.aByte1313 & 0x2) == 0) {
		int i = arg0 * anInt3853;
		int i_115_ = i + anInt3853;
		int i_116_ = arg1 * anInt3853;
		int i_117_ = i_116_ + anInt3853;
		int i_118_ = 0;
		int i_119_ = 0;
		int i_120_ = 0;
		int i_121_ = 0;
		int i_122_;
		int i_123_;
		int i_124_;
		int i_125_;
		int i_126_;
		int i_127_;
		int i_128_;
		int i_129_;
		int i_130_;
		int i_131_;
		int i_132_;
		int i_133_;
		int i_134_;
		int i_135_;
		int i_136_;
		int i_137_;
		int i_138_;
		int i_139_;
		int i_140_;
		int i_141_;
		if ((class99.aByte1313 & 0x1) != 0 && !arg2) {
		    int i_142_ = anIntArrayArray3848[arg0][arg1];
		    int i_143_ = anInt3862 * i_142_;
		    i_122_ = (anInt3860
			      + (anInt3863 * i + i_143_ + anInt3849 * i_116_
				 >> 15));
		    if (i_122_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_123_ = anInt3860 + ((anInt3863 * i_115_ + i_143_
					   + anInt3849 * i_116_)
					  >> 15);
		    if (i_123_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_124_ = anInt3860 + ((anInt3863 * i_115_ + i_143_
					   + anInt3849 * i_117_)
					  >> 15);
		    if (i_124_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_125_ = (anInt3860
			      + (anInt3863 * i + i_143_ + anInt3849 * i_117_
				 >> 15));
		    if (i_125_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    if (aClass130_Sub1_3852.aBoolean4046) {
			int i_144_ = i_122_ - aClass130_Sub1_3852.anInt4048;
			if (i_144_ > 0) {
			    i_118_ = i_144_;
			    if (i_118_ > 255)
				i_118_ = 255;
			}
			i_144_ = i_123_ - aClass130_Sub1_3852.anInt4048;
			if (i_144_ > 0) {
			    i_119_ = i_144_;
			    if (i_119_ > 255)
				i_119_ = 255;
			}
			i_144_ = i_124_ - aClass130_Sub1_3852.anInt4048;
			if (i_144_ > 0) {
			    i_120_ = i_144_;
			    if (i_120_ > 255)
				i_120_ = 255;
			}
			i_144_ = i_125_ - aClass130_Sub1_3852.anInt4048;
			if (i_144_ > 0) {
			    i_121_ = i_144_;
			    if (i_121_ > 255)
				i_121_ = 255;
			}
		    }
		    int i_145_ = anInt3847 * i_142_;
		    int i_146_ = anInt3870 * i_142_;
		    i_126_ = (anInt3855
			      + (anInt3851 * i + i_145_ + anInt3864 * i_116_
				 >> 15));
		    i_127_
			= (arg3.anInt822
			   + i_126_ * aClass130_Sub1_3852.anInt4068 / i_122_);
		    i_128_ = (anInt3858
			      + (anInt3866 * i + i_146_ + anInt3861 * i_116_
				 >> 15));
		    i_129_
			= (arg3.anInt821
			   + i_128_ * aClass130_Sub1_3852.anInt4036 / i_122_);
		    i_130_ = anInt3855 + ((anInt3851 * i_115_ + i_145_
					   + anInt3864 * i_116_)
					  >> 15);
		    i_131_
			= (arg3.anInt822
			   + i_130_ * aClass130_Sub1_3852.anInt4068 / i_123_);
		    i_132_ = anInt3858 + ((anInt3866 * i_115_ + i_146_
					   + anInt3861 * i_116_)
					  >> 15);
		    i_133_
			= (arg3.anInt821
			   + i_132_ * aClass130_Sub1_3852.anInt4036 / i_123_);
		    i_134_ = anInt3855 + ((anInt3851 * i_115_ + i_145_
					   + anInt3864 * i_117_)
					  >> 15);
		    i_135_
			= (arg3.anInt822
			   + i_134_ * aClass130_Sub1_3852.anInt4068 / i_124_);
		    i_136_ = anInt3858 + ((anInt3866 * i_115_ + i_146_
					   + anInt3861 * i_117_)
					  >> 15);
		    i_137_
			= (arg3.anInt821
			   + i_136_ * aClass130_Sub1_3852.anInt4036 / i_124_);
		    i_138_ = (anInt3855
			      + (anInt3851 * i + i_145_ + anInt3864 * i_117_
				 >> 15));
		    i_139_
			= (arg3.anInt822
			   + i_138_ * aClass130_Sub1_3852.anInt4068 / i_125_);
		    i_140_ = (anInt3858
			      + (anInt3866 * i + i_146_ + anInt3861 * i_117_
				 >> 15));
		    i_141_
			= (arg3.anInt821
			   + i_140_ * aClass130_Sub1_3852.anInt4036 / i_125_);
		} else {
		    int i_147_ = anIntArrayArray3848[arg0][arg1];
		    int i_148_ = anIntArrayArray3848[arg0 + 1][arg1];
		    int i_149_ = anIntArrayArray3848[arg0 + 1][arg1 + 1];
		    int i_150_ = anIntArrayArray3848[arg0][arg1 + 1];
		    i_122_ = anInt3860 + ((anInt3863 * i + anInt3862 * i_147_
					   + anInt3849 * i_116_)
					  >> 15);
		    if (i_122_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_123_
			= anInt3860 + ((anInt3863 * i_115_ + anInt3862 * i_148_
					+ anInt3849 * i_116_)
				       >> 15);
		    if (i_123_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_124_
			= anInt3860 + ((anInt3863 * i_115_ + anInt3862 * i_149_
					+ anInt3849 * i_117_)
				       >> 15);
		    if (i_124_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    i_125_ = anInt3860 + ((anInt3863 * i + anInt3862 * i_150_
					   + anInt3849 * i_117_)
					  >> 15);
		    if (i_125_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    if (arg2) {
			int i_151_ = i_122_ - aClass130_Sub1_3852.anInt4048;
			if (i_151_ > 255)
			    i_151_ = 255;
			if (i_151_ > 0) {
			    i_118_ = i_151_;
			    int i_152_ = (anIntArrayArray3850[arg0][arg1]
					  * i_151_ / 255);
			    if (i_152_ > 0)
				i_147_ -= i_152_;
			}
			i_151_ = i_123_ - aClass130_Sub1_3852.anInt4048;
			if (i_151_ > 255)
			    i_151_ = 255;
			if (i_151_ > 0) {
			    i_119_ = i_151_;
			    int i_153_ = (anIntArrayArray3850[arg0 + 1][arg1]
					  * i_151_ / 255);
			    if (i_153_ > 0)
				i_148_ -= i_153_;
			}
			i_151_ = i_124_ - aClass130_Sub1_3852.anInt4048;
			if (i_151_ > 255)
			    i_151_ = 255;
			if (i_151_ > 0) {
			    i_120_ = i_151_;
			    int i_154_
				= (anIntArrayArray3850[arg0 + 1][arg1 + 1]
				   * i_151_ / 255);
			    if (i_154_ > 0)
				i_149_ -= i_154_;
			}
			i_151_ = i_125_ - aClass130_Sub1_3852.anInt4048;
			if (i_151_ > 255)
			    i_151_ = 255;
			if (i_151_ > 0) {
			    i_121_ = i_151_;
			    int i_155_ = (anIntArrayArray3850[arg0][arg1 + 1]
					  * i_151_ / 255);
			    if (i_155_ > 0)
				i_150_ -= i_155_;
			}
		    } else if (aClass130_Sub1_3852.aBoolean4046) {
			int i_156_ = i_122_ - aClass130_Sub1_3852.anInt4048;
			if (i_156_ > 0) {
			    i_118_ = i_156_;
			    if (i_118_ > 255)
				i_118_ = 255;
			}
			i_156_ = i_123_ - aClass130_Sub1_3852.anInt4048;
			if (i_156_ > 0) {
			    i_119_ = i_156_;
			    if (i_119_ > 255)
				i_119_ = 255;
			}
			i_156_ = i_124_ - aClass130_Sub1_3852.anInt4048;
			if (i_156_ > 0) {
			    i_120_ = i_156_;
			    if (i_120_ > 255)
				i_120_ = 255;
			}
			i_156_ = i_125_ - aClass130_Sub1_3852.anInt4048;
			if (i_156_ > 0) {
			    i_121_ = i_156_;
			    if (i_121_ > 255)
				i_121_ = 255;
			}
		    }
		    i_126_ = anInt3855 + ((anInt3851 * i + anInt3847 * i_147_
					   + anInt3864 * i_116_)
					  >> 15);
		    i_127_
			= (arg3.anInt822
			   + i_126_ * aClass130_Sub1_3852.anInt4068 / i_122_);
		    i_128_ = anInt3858 + ((anInt3866 * i + anInt3870 * i_147_
					   + anInt3861 * i_116_)
					  >> 15);
		    i_129_
			= (arg3.anInt821
			   + i_128_ * aClass130_Sub1_3852.anInt4036 / i_122_);
		    i_130_
			= anInt3855 + ((anInt3851 * i_115_ + anInt3847 * i_148_
					+ anInt3864 * i_116_)
				       >> 15);
		    i_131_
			= (arg3.anInt822
			   + i_130_ * aClass130_Sub1_3852.anInt4068 / i_123_);
		    i_132_
			= anInt3858 + ((anInt3866 * i_115_ + anInt3870 * i_148_
					+ anInt3861 * i_116_)
				       >> 15);
		    i_133_
			= (arg3.anInt821
			   + i_132_ * aClass130_Sub1_3852.anInt4036 / i_123_);
		    i_134_
			= anInt3855 + ((anInt3851 * i_115_ + anInt3847 * i_149_
					+ anInt3864 * i_117_)
				       >> 15);
		    i_135_
			= (arg3.anInt822
			   + i_134_ * aClass130_Sub1_3852.anInt4068 / i_124_);
		    i_136_
			= anInt3858 + ((anInt3866 * i_115_ + anInt3870 * i_149_
					+ anInt3861 * i_117_)
				       >> 15);
		    i_137_
			= (arg3.anInt821
			   + i_136_ * aClass130_Sub1_3852.anInt4036 / i_124_);
		    i_138_ = anInt3855 + ((anInt3851 * i + anInt3847 * i_150_
					   + anInt3864 * i_117_)
					  >> 15);
		    i_139_
			= (arg3.anInt822
			   + i_138_ * aClass130_Sub1_3852.anInt4068 / i_125_);
		    i_140_ = anInt3858 + ((anInt3866 * i + anInt3870 * i_150_
					   + anInt3861 * i_117_)
					  >> 15);
		    i_141_
			= (arg3.anInt821
			   + i_140_ * aClass130_Sub1_3852.anInt4036 / i_125_);
		}
		boolean bool
		    = (class99.aShort1310 != -1
		       && method731(aClass130_Sub1_3852.anInterface4_4069
					.method10
				    (-19907, class99.aShort1310).aByte576));
		int i_157_ = i_119_ + i_120_ + i_121_;
		if (((i_135_ - i_139_) * (i_133_ - i_141_)
		     - (i_137_ - i_141_) * (i_131_ - i_139_))
		    > 0) {
		    arg3.aBoolean820
			= (i_135_ < 0 || i_139_ < 0 || i_131_ < 0
			   || i_135_ > arg3.anInt825 || i_139_ > arg3.anInt825
			   || i_131_ > arg3.anInt825);
		    if (i_157_ < 765) {
			if (bool)
			    arg3.anInt819 = 100;
			if (i_157_ > 0) {
			    if (class99.aShort1310 >= 0)
				arg3.method680(i_137_, i_141_, i_133_, i_135_,
					       i_139_, i_131_,
					       aClass130_Sub1_3852.anInt4045,
					       i_120_, i_121_, i_119_,
					       class99.anInt1311,
					       class99.anInt1312,
					       class99.anInt1309, i_134_,
					       i_138_, i_130_, i_136_, i_140_,
					       i_132_, i_124_, i_125_, i_123_,
					       class99.aShort1310);
			    else
				arg3.method689
				    (i_137_, i_141_, i_133_, i_135_, i_139_,
				     i_131_,
				     (Class212.method2766
				      (class99.anInt1311,
				       (i_120_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)),
				     (Class212.method2766
				      (class99.anInt1312,
				       (i_121_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)),
				     (Class212.method2766
				      (class99.anInt1309,
				       (i_119_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)));
			} else if (class99.aShort1310 >= 0)
			    arg3.method683(i_137_, i_141_, i_133_, i_135_,
					   i_139_, i_131_, class99.anInt1311,
					   class99.anInt1312,
					   class99.anInt1309, i_134_, i_138_,
					   i_130_, i_136_, i_140_, i_132_,
					   i_124_, i_125_, i_123_,
					   class99.aShort1310);
			else
			    arg3.method689(i_137_, i_141_, i_133_, i_135_,
					   i_139_, i_131_, class99.anInt1311,
					   class99.anInt1312,
					   class99.anInt1309);
			arg3.anInt819 = 0;
		    } else
			arg3.method682(i_137_, i_141_, i_133_, i_135_, i_139_,
				       i_131_, aClass130_Sub1_3852.anInt4045);
		}
		i_157_ = i_118_ + i_119_ + i_121_;
		if (((i_127_ - i_131_) * (i_141_ - i_133_)
		     - (i_129_ - i_133_) * (i_139_ - i_131_))
		    > 0) {
		    arg3.aBoolean820
			= (i_127_ < 0 || i_131_ < 0 || i_139_ < 0
			   || i_127_ > arg3.anInt825 || i_131_ > arg3.anInt825
			   || i_139_ > arg3.anInt825);
		    if (i_157_ < 765) {
			if (bool)
			    arg3.anInt819 = 100;
			if (i_157_ > 0) {
			    if (class99.aShort1310 >= 0)
				arg3.method680(i_129_, i_133_, i_141_, i_127_,
					       i_131_, i_139_,
					       aClass130_Sub1_3852.anInt4045,
					       i_118_, i_119_, i_121_,
					       class99.anInt1314,
					       class99.anInt1309,
					       class99.anInt1312, i_126_,
					       i_130_, i_138_, i_128_, i_132_,
					       i_140_, i_122_, i_123_, i_125_,
					       class99.aShort1310);
			    else
				arg3.method689
				    (i_129_, i_133_, i_141_, i_127_, i_131_,
				     i_139_,
				     (Class212.method2766
				      (class99.anInt1314,
				       (i_118_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)),
				     (Class212.method2766
				      (class99.anInt1309,
				       (i_119_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)),
				     (Class212.method2766
				      (class99.anInt1312,
				       (i_121_ << 24
					| aClass130_Sub1_3852.anInt4045),
				       (byte) 58)));
			} else if (class99.aShort1310 >= 0)
			    arg3.method683(i_129_, i_133_, i_141_, i_127_,
					   i_131_, i_139_, class99.anInt1314,
					   class99.anInt1309,
					   class99.anInt1312, i_126_, i_130_,
					   i_138_, i_128_, i_132_, i_140_,
					   i_122_, i_123_, i_125_,
					   class99.aShort1310);
			else
			    arg3.method689(i_129_, i_133_, i_141_, i_127_,
					   i_131_, i_139_, class99.anInt1314,
					   class99.anInt1309,
					   class99.anInt1312);
			arg3.anInt819 = 0;
		    } else
			arg3.method682(i_129_, i_133_, i_141_, i_127_, i_131_,
				       i_139_, aClass130_Sub1_3852.anInt4045);
		}
	    }
	} else {
	    Class97 class97 = aClass97ArrayArray3865[arg0][arg1];
	    if (class97 != null) {
		for (int i = 0; i < class97.aShort1277; i++) {
		    int i_158_ = class97.aShortArray1283[i];
		    int i_159_ = class97.aShortArray1279[i];
		    int i_160_ = class97.aShortArray1276[i];
		    int i_161_
			= anInt3860 + ((anInt3863 * i_158_ + anInt3862 * i_159_
					+ anInt3849 * i_160_)
				       >> 15);
		    if (i_161_ <= aClass130_Sub1_3852.anInt4043)
			return;
		    arg6[i] = 0;
		    if (arg2) {
			int i_162_ = i_161_ - aClass130_Sub1_3852.anInt4048;
			if (i_162_ > 255)
			    i_162_ = 255;
			if (i_162_ > 0) {
			    arg6[i] = i_162_;
			    int i_163_
				= class97.aShortArray1274[i] * i_162_ / 255;
			    if (i_163_ > 0)
				i_159_ -= i_163_;
			}
		    } else if (aClass130_Sub1_3852.aBoolean4046) {
			int i_164_ = i_161_ - aClass130_Sub1_3852.anInt4048;
			if (i_164_ > 0) {
			    arg6[i] = i_164_;
			    if (arg6[i] > 255)
				arg6[i] = 255;
			}
		    }
		    int i_165_
			= anInt3855 + ((anInt3851 * i_158_ + anInt3847 * i_159_
					+ anInt3864 * i_160_)
				       >> 15);
		    int i_166_
			= anInt3858 + ((anInt3866 * i_158_ + anInt3870 * i_159_
					+ anInt3861 * i_160_)
				       >> 15);
		    arg4[i]
			= (arg3.anInt822
			   + i_165_ * aClass130_Sub1_3852.anInt4068 / i_161_);
		    arg5[i]
			= (arg3.anInt821
			   + i_166_ * aClass130_Sub1_3852.anInt4036 / i_161_);
		}
		if (class97.aShortArray1281 != null) {
		    int i = anIntArrayArray3848[arg0][arg1];
		    int i_167_ = anIntArrayArray3848[arg0 + 1][arg1];
		    int i_168_ = anIntArrayArray3848[arg0][arg1 + 1];
		    int i_169_ = arg0 * anInt3853;
		    int i_170_ = i_169_ + anInt3853;
		    int i_171_ = arg1 * anInt3853;
		    int i_172_ = i_171_ + anInt3853;
		    int i_173_
			= anInt3855 + ((anInt3851 * i_169_ + anInt3847 * i
					+ anInt3864 * i_171_)
				       >> 15);
		    int i_174_
			= anInt3858 + ((anInt3866 * i_169_ + anInt3870 * i
					+ anInt3861 * i_171_)
				       >> 15);
		    int i_175_
			= anInt3860 + ((anInt3863 * i_169_ + anInt3862 * i
					+ anInt3849 * i_171_)
				       >> 15);
		    int i_176_
			= anInt3855 + ((anInt3851 * i_170_ + anInt3847 * i_167_
					+ anInt3864 * i_171_)
				       >> 15);
		    int i_177_
			= anInt3858 + ((anInt3866 * i_170_ + anInt3870 * i_167_
					+ anInt3861 * i_171_)
				       >> 15);
		    int i_178_
			= anInt3860 + ((anInt3863 * i_170_ + anInt3862 * i_167_
					+ anInt3849 * i_171_)
				       >> 15);
		    int i_179_
			= anInt3855 + ((anInt3851 * i_169_ + anInt3847 * i_168_
					+ anInt3864 * i_172_)
				       >> 15);
		    int i_180_
			= anInt3858 + ((anInt3866 * i_169_ + anInt3870 * i_168_
					+ anInt3861 * i_172_)
				       >> 15);
		    int i_181_
			= anInt3860 + ((anInt3863 * i_169_ + anInt3862 * i_168_
					+ anInt3849 * i_172_)
				       >> 15);
		    for (int i_182_ = 0; i_182_ < class97.aShort1280;
			 i_182_++) {
			int i_183_ = i_182_ * 3;
			int i_184_ = i_183_ + 1;
			int i_185_ = i_184_ + 1;
			int i_186_ = arg4[i_183_];
			int i_187_ = arg4[i_184_];
			int i_188_ = arg4[i_185_];
			int i_189_ = arg5[i_183_];
			int i_190_ = arg5[i_184_];
			int i_191_ = arg5[i_185_];
			int i_192_
			    = arg6[i_183_] + arg6[i_184_] + arg6[i_185_];
			if (((i_186_ - i_187_) * (i_191_ - i_190_)
			     - (i_189_ - i_190_) * (i_188_ - i_187_))
			    > 0) {
			    arg3.aBoolean820
				= (i_186_ < 0 || i_187_ < 0 || i_188_ < 0
				   || i_186_ > arg3.anInt825
				   || i_187_ > arg3.anInt825
				   || i_188_ > arg3.anInt825);
			    short i_193_ = class97.aShortArray1281[i_182_];
			    if (i_192_ < 765) {
				if (i_193_ != -1
				    && method731(aClass130_Sub1_3852
						     .anInterface4_4069
						     .method10
						 (-19907, i_193_).aByte576))
				    arg3.anInt819 = 100;
				if (i_192_ > 0) {
				    if (i_193_ != -1)
					arg3.method680
					    (i_189_, i_190_, i_191_, i_186_,
					     i_187_, i_188_,
					     aClass130_Sub1_3852.anInt4045,
					     arg6[i_183_], arg6[i_184_],
					     arg6[i_185_],
					     class97.anIntArray1275[i_183_],
					     class97.anIntArray1275[i_184_],
					     class97.anIntArray1275[i_185_],
					     i_173_, i_176_, i_179_, i_174_,
					     i_177_, i_180_, i_175_, i_178_,
					     i_181_, i_193_);
				    else if ((class97.anIntArray1275[i_183_]
					      & 0xffffff)
					     != 0)
					arg3.method689
					    (i_189_, i_190_, i_191_, i_186_,
					     i_187_, i_188_,
					     (Class212.method2766
					      (class97.anIntArray1275[i_183_],
					       (arg6[i_183_] << 24
						| (aClass130_Sub1_3852
						   .anInt4045)),
					       (byte) 58)),
					     (Class212.method2766
					      (class97.anIntArray1275[i_184_],
					       (arg6[i_184_] << 24
						| (aClass130_Sub1_3852
						   .anInt4045)),
					       (byte) 58)),
					     (Class212.method2766
					      (class97.anIntArray1275[i_185_],
					       (arg6[i_185_] << 24
						| (aClass130_Sub1_3852
						   .anInt4045)),
					       (byte) 58)));
				} else if (i_193_ != -1)
				    arg3.method683
					(i_189_, i_190_, i_191_, i_186_,
					 i_187_, i_188_,
					 class97.anIntArray1275[i_183_],
					 class97.anIntArray1275[i_184_],
					 class97.anIntArray1275[i_185_],
					 i_173_, i_176_, i_179_, i_174_,
					 i_177_, i_180_, i_175_, i_178_,
					 i_181_, i_193_);
				else if ((class97.anIntArray1275[i_183_]
					  & 0xffffff)
					 != 0)
				    arg3.method689
					(i_189_, i_190_, i_191_, i_186_,
					 i_187_, i_188_,
					 class97.anIntArray1275[i_183_],
					 class97.anIntArray1275[i_184_],
					 class97.anIntArray1275[i_185_]);
				arg3.anInt819 = 0;
			    } else
				arg3.method682(i_189_, i_190_, i_191_, i_186_,
					       i_187_, i_188_,
					       aClass130_Sub1_3852.anInt4045);
			}
		    }
		} else {
		    for (int i = 0; i < class97.aShort1280; i++) {
			int i_194_ = i * 3;
			int i_195_ = i_194_ + 1;
			int i_196_ = i_195_ + 1;
			int i_197_ = arg4[i_194_];
			int i_198_ = arg4[i_195_];
			int i_199_ = arg4[i_196_];
			int i_200_ = arg5[i_194_];
			int i_201_ = arg5[i_195_];
			int i_202_ = arg5[i_196_];
			int i_203_
			    = arg6[i_194_] + arg6[i_195_] + arg6[i_196_];
			if (((i_197_ - i_198_) * (i_202_ - i_201_)
			     - (i_200_ - i_201_) * (i_199_ - i_198_))
			    > 0) {
			    arg3.aBoolean820
				= (i_197_ < 0 || i_198_ < 0 || i_199_ < 0
				   || i_197_ > arg3.anInt825
				   || i_198_ > arg3.anInt825
				   || i_199_ > arg3.anInt825);
			    if (i_203_ < 765) {
				if (i_203_ > 0) {
				    if ((class97.anIntArray1275[i_194_]
					 & 0xffffff)
					!= 0)
					arg3.method689
					    (i_200_, i_201_, i_202_, i_197_,
					     i_198_, i_199_,
					     (Class67.method705
					      (-16711936, arg6[i_194_],
					       class97.anIntArray1275[i_194_],
					       aClass130_Sub1_3852.anInt4045)),
					     (Class67.method705
					      (-16711936, arg6[i_195_],
					       class97.anIntArray1275[i_195_],
					       aClass130_Sub1_3852.anInt4045)),
					     (Class67.method705
					      (-16711936, arg6[i_196_],
					       class97.anIntArray1275[i_196_],
					       (aClass130_Sub1_3852
						.anInt4045))));
				} else if ((class97.anIntArray1275[i_194_]
					    & 0xffffff)
					   != 0)
				    arg3.method689
					(i_200_, i_201_, i_202_, i_197_,
					 i_198_, i_199_,
					 class97.anIntArray1275[i_194_],
					 class97.anIntArray1275[i_195_],
					 class97.anIntArray1275[i_196_]);
			    } else
				arg3.method682(i_200_, i_201_, i_202_, i_197_,
					       i_198_, i_199_,
					       aClass130_Sub1_3852.anInt4045);
			}
		    }
		}
	    }
	}
    }
    
    public void method711(int arg0, int arg1, int arg2, boolean[][] arg3,
			  boolean arg4) {
	Class9_Sub2 class9_sub2 = aClass130_Sub1_3852.aClass9_Sub2_4058;
	anInt3851 = class9_sub2.anInt3617;
	anInt3847 = class9_sub2.anInt3615;
	anInt3864 = class9_sub2.anInt3618;
	anInt3855 = class9_sub2.anInt3626;
	anInt3866 = class9_sub2.anInt3625;
	anInt3870 = class9_sub2.anInt3616;
	anInt3861 = class9_sub2.anInt3622;
	anInt3858 = class9_sub2.anInt3624;
	anInt3863 = class9_sub2.anInt3623;
	anInt3862 = class9_sub2.anInt3621;
	anInt3849 = class9_sub2.anInt3620;
	anInt3860 = class9_sub2.anInt3619;
    }
    
    public void method715(int arg0, int arg1, int arg2) {
	if (aByteArrayArray3856[arg0][arg1] < arg2)
	    aByteArrayArray3856[arg0][arg1] = (byte) arg2;
    }
    
    public static int method733(int arg0, int arg1) {
	int i = (arg0 & 0xff0000) * arg1 >> 23;
	if (i < 2)
	    i = 2;
	else if (i > 253)
	    i = 253;
	int i_204_ = (arg0 & 0xff00) * arg1 >> 15;
	if (i_204_ < 2)
	    i_204_ = 2;
	else if (i_204_ > 253)
	    i_204_ = 253;
	int i_205_ = (arg0 & 0xff) * arg1 >> 7;
	if (i_205_ < 2)
	    i_205_ = 2;
	else if (i_205_ > 253)
	    i_205_ = 253;
	return i << 16 | i_204_ << 8 | i_205_;
    }
    
    public void method723(int arg0, int arg1, int[] arg2, int[] arg3,
			  int[] arg4, int[] arg5, int[] arg6, int[] arg7,
			  int[] arg8, int[] arg9, int[] arg10, int[] arg11,
			  int arg12, int arg13, boolean arg14) {
	if (aClass32ArrayArray3854 == null) {
	    aClass32ArrayArray3854 = new Class32[anInt924][anInt916];
	    aClass13ArrayArray3857 = new Class13[anInt924][anInt916];
	} else if (aClass99ArrayArray3869 != null)
	    throw new IllegalStateException();
	boolean bool = false;
	if (arg8.length == 2 && arg5.length == 2
	    && (arg8[0] == arg8[1]
		|| arg10[0] != -1 && arg10[0] == arg10[1])) {
	    bool = true;
	    for (int i = 1; i < 2; i++) {
		int i_206_ = arg2[arg5[i]];
		int i_207_ = arg4[arg5[i]];
		if (i_206_ != 0 && i_206_ != anInt3853
		    || i_207_ != 0 && i_207_ != anInt3853) {
		    bool = false;
		    break;
		}
	    }
	}
	if (!bool) {
	    Class13 class13 = new Class13();
	    short i = (short) arg2.length;
	    int i_208_ = (short) arg8.length;
	    class13.aShort135 = i;
	    class13.aShortArray144 = new short[i];
	    class13.anIntArray141 = new int[i];
	    class13.anIntArray147 = new int[i];
	    class13.anIntArray146 = new int[i];
	    for (int i_209_ = 0; i_209_ < i; i_209_++) {
		int i_210_ = arg2[i_209_];
		int i_211_ = arg4[i_209_];
		if (i_210_ == 0 && i_211_ == 0)
		    class13.aShortArray144[i_209_]
			= (short) (aByteArrayArray3867[arg0][arg1]
				   - aByteArrayArray3856[arg0][arg1]);
		else if (i_210_ == 0 && i_211_ == anInt3853)
		    class13.aShortArray144[i_209_]
			= (short) (aByteArrayArray3867[arg0][arg1 + 1]
				   - aByteArrayArray3856[arg0][arg1 + 1]);
		else if (i_210_ == anInt3853 && i_211_ == anInt3853)
		    class13.aShortArray144[i_209_]
			= (short) (aByteArrayArray3867[arg0 + 1][arg1 + 1]
				   - aByteArrayArray3856[arg0 + 1][arg1 + 1]);
		else if (i_210_ == anInt3853 && i_211_ == 0)
		    class13.aShortArray144[i_209_]
			= (short) (aByteArrayArray3867[arg0 + 1][arg1]
				   - aByteArrayArray3856[arg0 + 1][arg1]);
		else {
		    int i_212_
			= (((aByteArrayArray3867[arg0][arg1]
			     - aByteArrayArray3856[arg0][arg1])
			    * (anInt3853 - i_210_))
			   + (aByteArrayArray3867[arg0 + 1][arg1]
			      - aByteArrayArray3856[arg0 + 1][arg1]) * i_210_);
		    int i_213_
			= (((aByteArrayArray3867[arg0][arg1 + 1]
			     - aByteArrayArray3856[arg0][arg1 + 1])
			    * (anInt3853 - i_210_))
			   + ((aByteArrayArray3867[arg0 + 1][arg1 + 1]
			       - aByteArrayArray3856[arg0 + 1][arg1 + 1])
			      * i_210_));
		    class13.aShortArray144[i_209_]
			= (short) ((i_212_ * (anInt3853 - i_211_)
				    + i_213_ * i_211_)
				   >> 2 * anInt3868);
		}
		int i_214_ = (arg0 << anInt3868) + i_210_;
		int i_215_ = (arg1 << anInt3868) + i_211_;
		class13.anIntArray141[i_209_] = i_214_;
		class13.anIntArray146[i_209_] = i_215_;
		class13.anIntArray147[i_209_]
		    = method720(i_214_, i_215_) + (arg3 != null ? arg3[i_209_]
						   : 0);
		if (class13.aShortArray144[i_209_] < 2)
		    class13.aShortArray144[i_209_] = (short) 2;
	    }
	    boolean bool_216_ = false;
	    int i_217_ = 0;
	    for (int i_218_ = 0; i_218_ < i_208_; i_218_++) {
		if (arg8[i_218_] >= 0 || arg9 != null && arg9[i_218_] >= 0)
		    i_217_++;
		if (arg10[i_218_] != -1
		    && !(aClass130_Sub1_3852.anInterface4_4069.method10
			 (-19907, arg10[i_218_]).aBoolean556))
		    bool_216_ = true;
	    }
	    class13.anIntArray145 = new int[i_217_];
	    if (arg9 != null)
		class13.anIntArray136 = new int[i_217_];
	    class13.aShortArray137 = new short[i_217_];
	    class13.aShortArray142 = new short[i_217_];
	    class13.aShortArray143 = new short[i_217_];
	    if (bool_216_) {
		class13.aShortArray138 = new short[i_217_];
		class13.aShortArray140 = new short[i_217_];
	    }
	    for (int i_219_ = 0; i_219_ < i_208_; i_219_++) {
		if (arg8[i_219_] >= 0 || arg9 != null && arg9[i_219_] >= 0) {
		    if (arg8[i_219_] >= 0)
			class13.anIntArray145[class13.aShort139]
			    = Class131_Sub2_Sub22.method1575((byte) 67,
							     arg8[i_219_]);
		    else
			class13.anIntArray145[class13.aShort139] = -1;
		    if (arg9 != null) {
			if (arg9[i_219_] != -1)
			    class13.anIntArray136[class13.aShort139]
				= Class131_Sub2_Sub22.method1575((byte) -127,
								 arg9[i_219_]);
			else
			    class13.anIntArray136[class13.aShort139] = -1;
		    }
		    class13.aShortArray137[class13.aShort139]
			= (short) arg5[i_219_];
		    class13.aShortArray142[class13.aShort139]
			= (short) arg6[i_219_];
		    class13.aShortArray143[class13.aShort139]
			= (short) arg7[i_219_];
		    if (bool_216_) {
			if (arg10[i_219_] != -1
			    && !(aClass130_Sub1_3852.anInterface4_4069.method10
				 (-19907, arg10[i_219_]).aBoolean556)) {
			    class13.aShortArray138[class13.aShort139]
				= (short) arg10[i_219_];
			    class13.aShortArray140[class13.aShort139]
				= (short) arg11[i_219_];
			} else
			    class13.aShortArray138[class13.aShort139]
				= (short) -1;
		    }
		    class13.aShort139++;
		}
	    }
	    aClass13ArrayArray3857[arg0][arg1] = class13;
	} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
	    Class32 class32 = new Class32();
	    int i = arg8[0];
	    int i_220_ = arg10[0];
	    if (arg9 != null) {
		class32.anInt447
		    = Class56.method624((aByteArrayArray3867[arg0][arg1]
					 - aByteArrayArray3856[arg0][arg1]),
					(byte) -33,
					Class131_Sub2_Sub22
					    .method1575((byte) -14, arg9[0]));
		if (i == -1)
		    class32.aByte451 |= 0x2;
	    }
	    if ((anIntArrayArray3848[arg0][arg1]
		 == anIntArrayArray3848[arg0 + 1][arg1])
		&& (anIntArrayArray3848[arg0][arg1]
		    == anIntArrayArray3848[arg0 + 1][arg1 + 1])
		&& (anIntArrayArray3848[arg0][arg1]
		    == anIntArrayArray3848[arg0][arg1 + 1]))
		class32.aByte451 |= 0x1;
	    if (i_220_ != -1 && (class32.aByte451 & 0x2) == 0
		&& !(aClass130_Sub1_3852.anInterface4_4069.method10
		     (-19907, i_220_).aBoolean556)) {
		class32.aShort445
		    = (short) (aByteArrayArray3867[arg0][arg1]
			       - aByteArrayArray3856[arg0][arg1]);
		class32.aShort446
		    = (short) (aByteArrayArray3867[arg0 + 1][arg1]
			       - aByteArrayArray3856[arg0 + 1][arg1]);
		class32.aShort449
		    = (short) (aByteArrayArray3867[arg0 + 1][arg1 + 1]
			       - aByteArrayArray3856[arg0 + 1][arg1 + 1]);
		class32.aShort448
		    = (short) (aByteArrayArray3867[arg0][arg1 + 1]
			       - aByteArrayArray3856[arg0][arg1 + 1]);
		class32.aShort450 = (short) i_220_;
	    } else {
		short i_221_ = Class131_Sub2_Sub22.method1575((byte) -127, i);
		class32.aShort445
		    = (short) Class56.method624(((aByteArrayArray3867[arg0]
						  [arg1])
						 - (aByteArrayArray3856[arg0]
						    [arg1])),
						(byte) -33, i_221_);
		class32.aShort446
		    = (short) Class56.method624(((aByteArrayArray3867[arg0 + 1]
						  [arg1])
						 - (aByteArrayArray3856
						    [arg0 + 1][arg1])),
						(byte) -33, i_221_);
		class32.aShort449
		    = (short) Class56.method624(((aByteArrayArray3867[arg0 + 1]
						  [arg1 + 1])
						 - (aByteArrayArray3856
						    [arg0 + 1][arg1 + 1])),
						(byte) -33, i_221_);
		class32.aShort448
		    = (short) Class56.method624(((aByteArrayArray3867[arg0]
						  [arg1 + 1])
						 - (aByteArrayArray3856[arg0]
						    [arg1 + 1])),
						(byte) -33, i_221_);
		class32.aShort450 = (short) -1;
	    }
	    aClass32ArrayArray3854[arg0][arg1] = class32;
	}
    }
    
    public void method734(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean[][] arg7, Class65 arg8,
			  int[] arg9, int[] arg10) {
	int i = (arg6 - arg4) * arg2 / 256;
	int i_222_ = arg2 >> 8;
	arg8.aBoolean823 = false;
	int i_223_ = arg0;
	int i_224_ = arg1 + i;
	for (int i_225_ = arg3; i_225_ < arg5; i_225_++) {
	    for (int i_226_ = arg4; i_226_ < arg6; i_226_++) {
		if (arg7[i_225_ - arg3][i_226_ - arg4]) {
		    if (aClass32ArrayArray3854[i_225_][i_226_] != null) {
			Class32 class32
			    = aClass32ArrayArray3854[i_225_][i_226_];
			if (class32.aShort450 != -1
			    && (class32.aByte451 & 0x2) == 0
			    && class32.anInt447 == -1) {
			    int i_227_ = aClass130_Sub1_3852
					     .method1271(class32.aShort450);
			    arg8.method688
				(i_224_ - i_222_, i_224_ - i_222_, i_224_,
				 i_223_ + i_222_, i_223_, i_223_ + i_222_,
				 Class56.method624(class32.aShort449 & 0xffff,
						   (byte) -33, i_227_),
				 Class56.method624(class32.aShort448 & 0xffff,
						   (byte) -33, i_227_),
				 Class56.method624(class32.aShort446 & 0xffff,
						   (byte) -33, i_227_));
			    arg8.method688
				(i_224_, i_224_, i_224_ - i_222_, i_223_,
				 i_223_ + i_222_, i_223_,
				 Class56.method624(class32.aShort445 & 0xffff,
						   (byte) -33, i_227_),
				 Class56.method624(class32.aShort446 & 0xffff,
						   (byte) -33, i_227_),
				 Class56.method624(class32.aShort448 & 0xffff,
						   (byte) -33, i_227_));
			} else if (class32.anInt447 == -1) {
			    arg8.method688(i_224_ - i_222_, i_224_ - i_222_,
					   i_224_, i_223_ + i_222_, i_223_,
					   i_223_ + i_222_,
					   class32.aShort449 & 0xffff,
					   class32.aShort448 & 0xffff,
					   class32.aShort446 & 0xffff);
			    arg8.method688(i_224_, i_224_, i_224_ - i_222_,
					   i_223_, i_223_ + i_222_, i_223_,
					   class32.aShort445 & 0xffff,
					   class32.aShort446 & 0xffff,
					   class32.aShort448 & 0xffff);
			} else {
			    int i_228_ = class32.anInt447;
			    arg8.method688(i_224_ - i_222_, i_224_ - i_222_,
					   i_224_, i_223_ + i_222_, i_223_,
					   i_223_ + i_222_, i_228_, i_228_,
					   i_228_);
			    arg8.method688(i_224_, i_224_, i_224_ - i_222_,
					   i_223_, i_223_ + i_222_, i_223_,
					   i_228_, i_228_, i_228_);
			}
		    } else if (aClass13ArrayArray3857[i_225_][i_226_]
			       != null) {
			Class13 class13
			    = aClass13ArrayArray3857[i_225_][i_226_];
			for (int i_229_ = 0; i_229_ < class13.aShort135;
			     i_229_++) {
			    arg9[i_229_]
				= i_223_ + ((class13.anIntArray141[i_229_]
					     - i_225_ * anInt3853)
					    * i_222_ / anInt3853);
			    arg10[i_229_]
				= i_224_ - ((class13.anIntArray146[i_229_]
					     - i_226_ * anInt3853)
					    * i_222_ / anInt3853);
			}
			for (int i_230_ = 0; i_230_ < class13.aShort139;
			     i_230_++) {
			    short i_231_ = class13.aShortArray137[i_230_];
			    short i_232_ = class13.aShortArray142[i_230_];
			    short i_233_ = class13.aShortArray143[i_230_];
			    int i_234_ = arg9[i_231_];
			    int i_235_ = arg9[i_232_];
			    int i_236_ = arg9[i_233_];
			    int i_237_ = arg10[i_231_];
			    int i_238_ = arg10[i_232_];
			    int i_239_ = arg10[i_233_];
			    if (class13.anIntArray136 != null
				&& class13.anIntArray136[i_230_] != -1) {
				int i_240_ = class13.anIntArray136[i_230_];
				arg8.method688
				    (i_237_, i_238_, i_239_, i_234_, i_235_,
				     i_236_,
				     Class56.method624((class13.aShortArray144
							[i_231_]),
						       (byte) -33, i_240_),
				     Class56.method624((class13.aShortArray144
							[i_232_]),
						       (byte) -33, i_240_),
				     Class56.method624((class13.aShortArray144
							[i_233_]),
						       (byte) -33, i_240_));
			    } else if (class13.aShortArray138 != null
				       && (class13.aShortArray138[i_230_]
					   != -1)) {
				int i_241_
				    = (aClass130_Sub1_3852.method1271
				       (class13.aShortArray138[i_230_]));
				arg8.method688
				    (i_237_, i_238_, i_239_, i_234_, i_235_,
				     i_236_,
				     Class56.method624((class13.aShortArray144
							[i_231_]),
						       (byte) -33, i_241_),
				     Class56.method624((class13.aShortArray144
							[i_232_]),
						       (byte) -33, i_241_),
				     Class56.method624((class13.aShortArray144
							[i_233_]),
						       (byte) -33, i_241_));
			    } else {
				int i_242_ = class13.anIntArray145[i_230_];
				arg8.method688
				    (i_237_, i_238_, i_239_, i_234_, i_235_,
				     i_236_,
				     Class56.method624((class13.aShortArray144
							[i_231_]),
						       (byte) -33, i_242_),
				     Class56.method624((class13.aShortArray144
							[i_232_]),
						       (byte) -33, i_242_),
				     Class56.method624((class13.aShortArray144
							[i_233_]),
						       (byte) -33, i_242_));
			    }
			}
		    }
		}
		i_224_ -= i_222_;
	    }
	    i_224_ = arg1 + i;
	    i_223_ += i_222_;
	}
	arg8.aBoolean823 = true;
    }
    
    public void method719(Class131_Sub8 class131_sub8, int[] is) {
	/* empty */
    }
    
    public Class68_Sub2(Class130_Sub1 arg0, int arg1, int arg2, int arg3,
			int arg4, int[][] arg5, int[][] arg6, int arg7) {
	super(arg3, arg4);
	aClass130_Sub1_3852 = arg0;
	anInt3859 = arg2;
	anIntArrayArray3848 = arg5;
	anIntArrayArray3850 = arg6;
	anInt3853 = arg7;
	anInt3868 = 0;
	for (/**/; arg7 > 1; arg7 >>= 1)
	    anInt3868++;
	aByteArrayArray3867 = new byte[arg3 + 1][arg4 + 1];
	int i = aClass130_Sub1_3852.anInt4051 >> 9;
	for (int i_243_ = 1; i_243_ < arg4; i_243_++) {
	    for (int i_244_ = 1; i_244_ < arg3; i_244_++) {
		int i_245_ = i;
		int i_246_ = (anIntArrayArray3848[i_244_ + 1][i_243_]
			      - anIntArrayArray3848[i_244_ - 1][i_243_]);
		int i_247_ = (anIntArrayArray3848[i_244_][i_243_ + 1]
			      - anIntArrayArray3848[i_244_][i_243_ - 1]);
		int i_248_ = (int) Math.sqrt((double) (i_246_ * i_246_ + 65536
						       + i_247_ * i_247_));
		int i_249_ = (i_246_ << 8) / i_248_;
		int i_250_ = -65536 / i_248_;
		int i_251_ = (i_247_ << 8) / i_248_;
		i_245_ += (aClass130_Sub1_3852.anInt4052 * i_249_
			   + aClass130_Sub1_3852.anInt4070 * i_250_
			   + aClass130_Sub1_3852.anInt4047 * i_251_) >> 17;
		i_245_ >>= 1;
		if (i_245_ < 2)
		    i_245_ = 2;
		else if (i_245_ > 126)
		    i_245_ = 126;
		aByteArrayArray3867[i_244_][i_243_] = (byte) i_245_;
	    }
	}
	aByteArrayArray3856 = new byte[arg3 + 1][arg4 + 1];
    }
    
    public void method735(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean[][] arg7, Class65 arg8,
			  int[] arg9, int[] arg10) {
	int i = (arg6 - arg4) * arg2 / 256;
	int i_252_ = arg2 >> 8;
	arg8.aBoolean823 = false;
	int i_253_ = arg0;
	int i_254_ = arg1 + i;
	for (int i_255_ = arg3; i_255_ < arg5; i_255_++) {
	    for (int i_256_ = arg4; i_256_ < arg6; i_256_++) {
		if (arg7[i_255_ - arg3][i_256_ - arg4]) {
		    if (aClass99ArrayArray3869[i_255_][i_256_] != null) {
			Class99 class99
			    = aClass99ArrayArray3869[i_255_][i_256_];
			if (class99.aShort1310 != -1
			    && (class99.aByte1313 & 0x2) == 0
			    && class99.anInt1308 == 0) {
			    int i_257_ = aClass130_Sub1_3852
					     .method1271(class99.aShort1310);
			    arg8.method688(i_254_ - i_252_, i_254_ - i_252_,
					   i_254_, i_253_ + i_252_, i_253_,
					   i_253_ + i_252_,
					   Class56.method624(class99.anInt1311,
							     (byte) -33,
							     i_257_),
					   Class56.method624(class99.anInt1312,
							     (byte) -33,
							     i_257_),
					   Class56.method624(class99.anInt1309,
							     (byte) -33,
							     i_257_));
			    arg8.method688(i_254_, i_254_, i_254_ - i_252_,
					   i_253_, i_253_ + i_252_, i_253_,
					   Class56.method624(class99.anInt1314,
							     (byte) -33,
							     i_257_),
					   Class56.method624(class99.anInt1309,
							     (byte) -33,
							     i_257_),
					   Class56.method624(class99.anInt1312,
							     (byte) -33,
							     i_257_));
			} else if (class99.anInt1308 == 0) {
			    arg8.method689(i_254_ - i_252_, i_254_ - i_252_,
					   i_254_, i_253_ + i_252_, i_253_,
					   i_253_ + i_252_, class99.anInt1311,
					   class99.anInt1312,
					   class99.anInt1309);
			    arg8.method689(i_254_, i_254_, i_254_ - i_252_,
					   i_253_, i_253_ + i_252_, i_253_,
					   class99.anInt1314,
					   class99.anInt1309,
					   class99.anInt1312);
			} else {
			    int i_258_ = class99.anInt1308;
			    arg8.method689
				(i_254_ - i_252_, i_254_ - i_252_, i_254_,
				 i_253_ + i_252_, i_253_, i_253_ + i_252_,
				 Class212.method2766(i_258_,
						     (class99.anInt1311
						      & ~0xffffff),
						     (byte) 58),
				 Class212.method2766(i_258_,
						     (class99.anInt1312
						      & ~0xffffff),
						     (byte) 58),
				 Class212.method2766(i_258_,
						     (class99.anInt1309
						      & ~0xffffff),
						     (byte) 58));
			    arg8.method689
				(i_254_, i_254_, i_254_ - i_252_, i_253_,
				 i_253_ + i_252_, i_253_,
				 Class212.method2766(i_258_,
						     (class99.anInt1314
						      & ~0xffffff),
						     (byte) 58),
				 Class212.method2766(i_258_,
						     (class99.anInt1309
						      & ~0xffffff),
						     (byte) 58),
				 Class212.method2766(i_258_,
						     (class99.anInt1312
						      & ~0xffffff),
						     (byte) 58));
			}
		    } else if (aClass97ArrayArray3865[i_255_][i_256_]
			       != null) {
			Class97 class97
			    = aClass97ArrayArray3865[i_255_][i_256_];
			for (int i_259_ = 0; i_259_ < class97.aShort1277;
			     i_259_++) {
			    arg9[i_259_]
				= i_253_ + ((class97.aShortArray1283[i_259_]
					     - i_255_ * anInt3853)
					    * i_252_ / anInt3853);
			    arg10[i_259_]
				= i_254_ - ((class97.aShortArray1276[i_259_]
					     - i_256_ * anInt3853)
					    * i_252_ / anInt3853);
			}
			for (int i_260_ = 0; i_260_ < class97.aShort1280;
			     i_260_++) {
			    int i_261_ = i_260_ * 3;
			    int i_262_ = i_261_ + 1;
			    int i_263_ = i_262_ + 1;
			    int i_264_ = arg9[i_261_];
			    int i_265_ = arg9[i_262_];
			    int i_266_ = arg9[i_263_];
			    int i_267_ = arg10[i_261_];
			    int i_268_ = arg10[i_262_];
			    int i_269_ = arg10[i_263_];
			    if (class97.anIntArray1278 != null
				&& class97.anIntArray1278[i_260_] != 0
				&& (class97.aShortArray1281 == null
				    || (class97.aShortArray1281 != null
					&& (class97.aShortArray1281[i_260_]
					    == -1)))) {
				int i_270_ = class97.anIntArray1278[i_260_];
				arg8.method689
				    (i_267_, i_268_, i_269_, i_264_, i_265_,
				     i_266_,
				     Class212.method2766(i_270_,
							 (-16777216
							  - ((class97
							      .anIntArray1275
							      [i_261_])
							     & ~0xffffff)),
							 (byte) 58),
				     Class212.method2766(i_270_,
							 (-16777216
							  - ((class97
							      .anIntArray1275
							      [i_262_])
							     & ~0xffffff)),
							 (byte) 58),
				     Class212.method2766(i_270_,
							 (-16777216
							  - ((class97
							      .anIntArray1275
							      [i_263_])
							     & ~0xffffff)),
							 (byte) 58));
			    } else if (class97.aShortArray1281 != null
				       && (class97.aShortArray1281[i_260_]
					   != -1)) {
				int i_271_
				    = (aClass130_Sub1_3852.method1271
				       (class97.aShortArray1281[i_260_]));
				arg8.method688(i_267_, i_268_, i_269_, i_264_,
					       i_265_, i_266_, i_271_, i_271_,
					       i_271_);
			    } else
				arg8.method689(i_267_, i_268_, i_269_, i_264_,
					       i_265_, i_266_,
					       class97.anIntArray1275[i_261_],
					       class97.anIntArray1275[i_262_],
					       class97.anIntArray1275[i_263_]);
			}
		    }
		}
		i_254_ -= i_252_;
	    }
	    i_254_ = arg1 + i;
	    i_253_ += i_252_;
	}
	arg8.aBoolean823 = true;
    }
    
    public int method720(int arg0, int arg1) {
	int i = arg0 >> anInt3868;
	int i_272_ = arg1 >> anInt3868;
	if (i < 0 || i_272_ < 0 || i > anInt924 - 1 || i_272_ > anInt916 - 1)
	    return 0;
	int i_273_ = arg0 & anInt3853 - 1;
	int i_274_ = arg1 & anInt3853 - 1;
	int i_275_ = ((anIntArrayArray3848[i][i_272_] * (anInt3853 - i_273_)
		       + anIntArrayArray3848[i + 1][i_272_] * i_273_)
		      >> anInt3868);
	int i_276_
	    = ((anIntArrayArray3848[i][i_272_ + 1] * (anInt3853 - i_273_)
		+ anIntArrayArray3848[i + 1][i_272_ + 1] * i_273_)
	       >> anInt3868);
	return i_275_ * (anInt3853 - i_274_) + i_276_ * i_274_ >> anInt3868;
    }
}
